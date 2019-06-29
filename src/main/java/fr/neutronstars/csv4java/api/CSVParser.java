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

import java.io.File;
import java.util.Optional;

public abstract class CSVParser
{
    /**
     * Instance principal de la class CSVParser. Attention à bien initialiser cette variable pour pouvoir faire fonctionner l'ensemble du programme.
     */
    private static CSVParser parser;

    /**
     * Retourne l'instance du parser. Attention celui-ci pêut être null. Par conséquent on n'utilisera l'Optional.ofNullable().
     */
    public static Optional<CSVParser> getParser(){
        return Optional.ofNullable(parser);
    }

    /**
     * Initialise l'instance du Parser.
     */
    public static void registerPaser(CSVParser parser){
        CSVParser.parser = parser;
    }

    /**
     * Créer un CSV grace au fichier `.csv` indiqué en paramètre.
     */
    public Optional<CSV> parse(File file){
        return parse(file, ",");
    }

    /**
     * Créer un CSV grace au fichier `.csv` indiqué en paramètre.
     */
    public Optional<CSV> parse(File file, String separator){
        return parse(file, separator, "\"");
    }

    /**
     * Créer un CSV grace au fichier `.csv` indiqué en paramètre.
     */
    abstract Optional<CSV> parse(File file, String separator, String caseFormat);
}
