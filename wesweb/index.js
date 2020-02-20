const express = require ('express')
const app = express()
const port = 3000

app.use(express.json())
app.use(express.urlencoded())

app.post('/form', (req, res) => {
    const name = req.body.name
    console.log(name)
    res.redirect('/kungen.jpg')
})

app.get('/', (req, res) => {
  res.sendFile(__dirname+'\\hej.html')
})

app.get('/style', (req, res) => {
  res.sendFile(__dirname+'\\style.css')
})

app.get('/kungen.jpg', (req, res) => {
  res.sendFile(__dirname+'\\kungen.jpg')
})



app.listen(port, () => console.log(`Example app listening on port ${port}!`))