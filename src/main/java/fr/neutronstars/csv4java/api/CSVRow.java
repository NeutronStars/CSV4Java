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

import java.util.List;
import java.util.Optional;

public interface CSVRow
{
    /**
     * Retourne l'identifiant de la ligne.
     */
    CSVContext getContext();

    /**
     * Retourne le CSV ou se trouve la colonne.
     */
    CSV getCSV();

    /**
     * Retourne toutes les colonnes de la ligne.
     */
    List<CSVColumn> getColumns();

    /**
     * Retourne une colonne de la ligne grace à son identifant. Attention, celui-ci peut être null. Par conséquent nous utiliserons l'Optional.ofNullable()
     */
    Optional<CSVColumn> getColumn(CSVContext csvContext);

    /**
     * Retourne toutes les cases de la ligne.
     */
    List<CSVCase> getCases();

    /**
     * Retourne une case grace à la colonne ciblé. Attention, celui-ci peut être null. Par conséquent nous utiliserons l'Optional.ofNullable()
     */
    Optional<CSVCase> getCase(CSVColumn column);

    /**
     * Retourne une case grace à colonne ciblé par son identifiant. Attention, celui-ci peut être null. Par conséquent nous utiliserons l'Optional.ofNullable()
     */
    Optional<CSVCase> getCase(CSVContext column);

    /**
     * Change la valeur de la case avec une case ciblé.
     */
    void setCase(CSVCase csvCase, Object object);

    /**
     * Change la valeur d'une case ciblé par la colonne.
     */
    void setCase(CSVColumn column, Object object);

    /**
     * Change la valeur d'une case ciblé par la colonne avec son identifiant.
     */
    void setCase(CSVContext column, Object object);
}
