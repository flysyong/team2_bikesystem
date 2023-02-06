<template>

    <v-card outlined>
        <v-card-title>
            ReserveReport # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
            <div>
                <Number label="ReserveNo" v-model="item.reserveNo" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Number label="UserId" v-model="item.userId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Number label="BikeId" v-model="item.bikeId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="Status" v-model="item.status" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="Color" v-model="item.color" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'ReserveReportViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/reserveReports/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

