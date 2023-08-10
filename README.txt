Leibniz Method to Calculate Pi

The Leibniz Method is a mathematical formula that allows estimating the value of the number Pi (π) using an infinite series. It was proposed by the mathematician and philosopher Gottfried Wilhelm Leibniz in the 17th century. The formula is based on the alternating series of positive and negative integers, and is used to iteratively approximate the value of Pi.

How the Leibniz Method Works:

Leibniz's formula is expressed as:

π = 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ...)

The idea is that by adding and subtracting terms from this infinite series, an increasingly accurate approximation of the value of Pi can be obtained. The more terms used in the series, the closer the approximation to the true value of Pi.

Using the Leibniz Method via REST API:

1. Make a POST request to the following URL using a tool like Postman or cURL:

POST http://localhost:8080/v1/pi/calculations

2. Make sure to set the request headers:

    -Accept: application/json
    -Content-Type: application/json

3. In the request body, provide the required parameters:

{
     "iterations": 100000,
     "decimalPlaces": 9
}

- "iterations" is the number of terms of the series that will be used in the calculation. The higher the number of iterations, the more accurate the approximation.
- "decimalPlaces" is the number of decimal places you want to be displayed in the final result.

4. The API will process the request and compute an approximation of Pi using the Leibniz Method with the specified number of iterations. It will then round the result to the specified number of decimal places.

5. You will receive a response in JSON format that contains the approximate value of Pi and the number of decimal places that were returned in the result.

Note: The Leibniz Method is a form of approximation and its accuracy depends on the number of iterations used. As you increase the number of iterations, the approximation gets closer to the true value of Pi.

Leibniz Method to Calculate Pi with Threads (Future)

The Leibniz Method for calculating the value of Pi is an iterative technique that can benefit from parallelization. In the future, it is planned to implement the use of threads (threads) to speed up the calculation and improve the performance of the service.

The calculation of Pi by the Leibniz Method involves the addition and subtraction of an infinite series of terms. Each term in the array is independent of the others, allowing work to be distributed among multiple threads. By parallelizing the calculation process, it is possible to reduce the total time required to obtain an accurate approximation of Pi.

How Threads Will Be Used in the Calculation of Pi:

1. Threads will be implemented to divide the calculation work into smaller parts and assign each part to an individual thread.

2. Each thread will be responsible for calculating a specific range of terms of the Leibniz series.

3. Once all the threads have done their calculations, the results will be combined to get a final approximation of Pi.

4. The implementation of threads will allow the calculation to be carried out concurrently, taking advantage of the available processing resources and speeding up the process.

Benefits of Implementing Threads:

- Performance improvement: By using multiple threads, you can make better use of CPU resources and reduce the total time needed for calculation.

- Efficiency in resources: The parallelization of the calculation allows to distribute the load of work, which can result in a more efficient use of the resources of the system.

- Scalability: The implementation of threads provides the basis for future optimizations and adjustments to handle larger and more complex workloads.

It's important to note that implementing threads also comes with challenges, such as synchronization and resource sharing management. However, with careful planning and proper design, a significant improvement in the performance of calculating Pi can be achieved using the Leibniz Method.

In short, the future implementation of threads in the calculation of Pi by the Leibniz Method aims to improve the efficiency and performance of the service. This will allow more accurate approximations of Pi to be obtained in a shorter time, which will be beneficial for applications that require intensive numerical computations.