package ru.yandex.practicum.contacts.presentation.base;


public interface ListDiffInterface <T> {

   boolean theSameAs(T objClassAdapter);

   boolean equals(Object object);
}