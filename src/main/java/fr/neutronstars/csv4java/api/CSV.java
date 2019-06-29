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

public interface CSV
{

    /**
        Retourne le nom du csv.
     */
    String getName();

    /**
     * Retourne la liste de toutes les colonnes.
     */
    Optional<List<CSVColumn>> getColumns();

    /**
     * Retourne une colonne grace à son identifiant. Attention, celui-ci peut retourner un null. Par conséquent on utilisera l'Optional.ofNullable().
     */
    Optional<CSVColumn> getColumn(CSVContext csvContext);

    /**
     * Retourne la liste de toutes les lignes.
     */
    Optional<List<CSVRow>> getRows();

    /**
     * Retourne un ligne grace à son identifiant. Attention, celui-ci peut retourner un null. Par conséquent on utilisera l'Optional.ofNullable().
     */
    Optional<CSVRow> getRow(CSVContext csvContext);

    /**
     * Retourne une case grace à sa colonne et sa ligne. Attention, celui-ci peut retourner un null. Par conséquent on utilisera l'Optional.ofNullable().
     */
    Optional<CSVCase> getCase(CSVColumn column, CSVRow row);

    /**
     * Retourne une case grace à l'identifiant d'une colonne et d'une ligne. Attention, celui-ci peut retourner un null. Par conséquent on utilisera l'Optional.ofNullable().
     */
    Optional<CSVCase> getCase(CSVContext column, CSVContext row);

    /**
     * Créer une colonne avant la colonne ciblé en paramètre puis la retourne. Attention, celui-ci peut retourner un null. Par conséquent on utilisera l'Optional.ofNullable().
     */
    Optional<CSVColumn> createNewColumnBefore(CSVColumn csvColumn);

    /**
     * Créer une colonne avant la colonne ciblé grace à son identifiant puis la retourne. Attention, celui-ci peut retourner un null. Par conséquent on utilisera l'Optional.ofNullable().
     */
    Optional<CSVColumn> createNewColumnBefore(CSVContext column);

    /**
     * Créer une colonne après la colonne ciblé en paramètre puis la retourne. Attention, celui-ci peut retourner un null. Par conséquent on utilisera l'Optional.ofNullable().
     */
    Optional<CSVColumn> createNewColumnAfter(CSVColumn csvColumn);

    /**
     * Créer une colonne après la colonne ciblé grace à son identifiant puis la retourne. Attention, celui-ci peut retourner un null. Par conséquent on utilisera l'Optional.ofNullable().
     */
    Optional<CSVColumn> createNewColumnAfter(CSVContext column);

    /**
     * Créer une colonne avant la ligne ciblé en paramètre puis la retourne. Attention, celui-ci peut retourner un null. Par conséquent on utilisera l'Optional.ofNullable().
     */
    Optional<CSVRow> createNewRowBefore(CSVRow csvRow);

    /**
     * Créer une colonne avant la ligne ciblé grace à son identifiant puis la retourne. Attention, celui-ci peut retourner un null. Par conséquent on utilisera l'Optional.ofNullable().
     */
    Optional<CSVRow> createNewRowBefore(CSVContext row);

    /**
     * Créer une colonne après la ligne ciblé en paramètre puis la retourne. Attention, celui-ci peut retourner un null. Par conséquent on utilisera l'Optional.ofNullable().
     */
    Optional<CSVRow> createNewRowAfter(CSVRow csvRow);

    /**
     * Créer une colonne après la ligne ciblé grace à son identifiant puis la retourne. Attention, celui-ci peut retourner un null. Par conséquent on utilisera l'Optional.ofNullable().
     */
    Optional<CSVRow> createNewRowAfter(CSVContext row);
}
