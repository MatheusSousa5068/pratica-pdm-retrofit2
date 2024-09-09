package com.example.navegacao1.model.dados

import com.google.firebase.firestore.DocumentId

class Usuario(@DocumentId var id: String, var nome: String, var senha: String) { }