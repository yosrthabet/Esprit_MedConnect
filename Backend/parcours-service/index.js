const express = require('express');
const app = express();
app.use(express.json());

app.get('/api/parcours/ping', (req, res) => {
  res.send('parcours-service OK');
});

app.listen(3000, () => {
  console.log('parcours-service démarré sur le port 3000');
});
