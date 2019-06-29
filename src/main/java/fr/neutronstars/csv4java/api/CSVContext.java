/**
 * Copyright 2019 NeutronStars
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package fr.neutronstars.csv4java.api;

/**
 * Cette interface servira d'identifiant pour les lignes et les colonnes.
 */
public interface CSVContext<T>
{

    /**
     * Retourne la valeur de l'identifiant.
     */
    T get();


    /**
     * Créer un identifiant avec le paramètre en valeur et le retourne.
     */
    static <T> CSVContext<T> of(T t){
        return () -> t;
    }
}
