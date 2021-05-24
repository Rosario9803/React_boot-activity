import axios from 'axios'

const VACCINE_REST_API_URL = 'http://localhost:8080/Vaccineslist'
class VaccineServices{

    getVaccines(){
        return axios.get(VACCINE_REST_API_URL);
    }
}
export default new VaccineServices();

