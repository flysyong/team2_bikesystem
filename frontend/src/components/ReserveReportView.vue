<template>

    <v-data-table
        :headers="headers"
        :items="reserveReport"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'ReserveReportView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "reserveNo", value: "reserveNo" },
                { text: "userId", value: "userId" },
                { text: "bikeId", value: "bikeId" },
                { text: "status", value: "status" },
                { text: "color", value: "color" },
            ],
            reserveReport : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/reserveReports'))

            temp.data._embedded.reserveReports.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.reserveReport = temp.data._embedded.reserveReports;
        },
        methods: {
        }
    }
</script>

