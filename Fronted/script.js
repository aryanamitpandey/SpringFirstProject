async function fetchData() {
    try{
        //1. send the network request
        const response = await fetch('http://localhost:8081/get/map');

        //2. Check if the HTTP status  code is successful (200- 299)
        if(!response.ok){
            throw new Error(`HTTP error! Status: ${response.status}`);

        }

        //3. Extract and parse the JSON data
        const data = await response.json();
        console.log(data);


    }
    catch(error){
        //4. Handle network or passing errors
        console.log('Fetch error:' ,error);
    }
}
fetchData();