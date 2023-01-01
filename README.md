# Kata6

## Json de la url:

Json recogido por url (simplificando con puntos suspensivos los arrays):

{"latitude":52.52,"longitude":13.419998,"generationtime_ms":0.4749298095703125,"utc_offset_seconds":0,"timezone":"GMT","timezone_abbreviation":"GMT","elevation":38.0,"current_weather":{"temperature":15.1,"windspeed":20.4,"winddirection":222.0,"weathercode":3,"time":"2023-01-01T01:00"},"hourly_units":{"time":"iso8601","temperature_2m":"°C","relativehumidity_2m":"%","windspeed_10m":"km/h"},"hourly":{"time":["2023-01-01T00:00","2023-01-01T01:00",T12:00","2023-01-01T13:00","2023-01-01T14:00"1-06T10:00",...........,"2023-01-07T23:00"],"temperature_2m":[15.4,15.1,................,6.0,6.8,7.6,7.9,8.0],"relativehumidity_2m":[61,59,59,60,61,62,63,64,..............,88,89,89,88,86,84],"windspeed_10m":
[20.7,20.4,19.1,................,6.7,7.9,9.5,10.7,11.9,12.4,12.2,10.8,10.0,10.2,11.5,13.3,14.2,15.3]}}

## Resultado del programa en xml:

Xml generado a partir del json anterior (simplificando con puntos suspensivos los arrays)

```
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<weather>
    <latitude>52.52</latitude>
    <longitude>13.419998</longitude>
    <generationtime_ms>0.6819963455200195</generationtime_ms>
    <utc_offset_seconds>0.0</utc_offset_seconds>
    <timezone>GMT</timezone>
    <timezone_abbreviation>GMT</timezone_abbreviation>
    <elevation>38.0</elevation>
    <current_weather>
        <temperature>15.1</temperature>
        <windspeed>20.4</windspeed>
        <winddirection>222.0</winddirection>
        <weathercode>3.0</weathercode>
        <time>2023-01-01T01:00</time>
    </current_weather>
    <hourly_units>
        <time>iso8601</time>
        <temperature_2m>°C</temperature_2m>
        <relativehumidity_2m>%</relativehumidity_2m>
        <windspeed_10m>km/h</windspeed_10m>
    </hourly_units>
    <hourly>
        <times>
            <time>2023-01-01T00:00</time>
            <time>2023-01-01T01:00</time>
            .............
            <time>2023-01-07T21:00</time>
            <time>2023-01-07T22:00</time>
            <time>2023-01-07T23:00</time>
        </times>
        <temperatures>
            <temperature>15.4</temperature>
            .............
            <temperature>7.6</temperature>
            <temperature>7.9</temperature>
            <temperature>8.0</temperature>
        </temperatures>
        <relativehumidities_2m>
            <relativehumidity_2m>61.0</relativehumidity_2m>
            <relativehumidity_2m>59.0</relativehumidity_2m>
            <relativehumidity_2m>59.0</relativehumidity_2m>
            <relativehumidity_2m>60.0</relativehumidity_2m>
            <relativehumidity_2m>61.0</relativehumidity_2m>
            ...........
            <relativehumidity_2m>86.0</relativehumidity_2m>
            <relativehumidity_2m>84.0</relativehumidity_2m>
        </relativehumidities_2m>
        <windspeeds_10m>
            <windspeed_10m>20.7</windspeed_10m>
            <windspeed_10m>20.4</windspeed_10m>
            <windspeed_10m>19.1</windspeed_10m>
            ............
            <windspeed_10m>14.2</windspeed_10m>
            <windspeed_10m>15.3</windspeed_10m>
        </windspeeds_10m>
    </hourly>
</weather>

```
