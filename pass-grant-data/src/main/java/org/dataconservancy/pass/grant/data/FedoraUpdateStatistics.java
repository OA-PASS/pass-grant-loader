/*
 * Copyright 2018 Johns Hopkins University
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dataconservancy.pass.grant.data;

import static java.lang.String.format;

/**
 * A utility class to collect and disseminate statistics related to an update
 */
public class FedoraUpdateStatistics {

    private int grantsUpdated = 0;
    private int fundersUpdated = 0;
    private int usersUpdated = 0;
    private int grantsCreated = 0;
    private int fundersCreated = 0;
    private int usersCreated = 0;
    private int pisAdded = 0;
    private int coPisAdded = 0;
    private String latestUpdateString = "";
    private String report ="";

    private String type;

    String getReport() {
        return report;
    }

    void setReport(int resultSetSize, int size) {
        StringBuilder sb = new StringBuilder();

        if (type.equals("grant")) {
            sb.append(format("%s grant records processed; the most recent update in this batch has timestamp %s",
                    resultSetSize, latestUpdateString));
            sb.append("\n");
            sb.append(format("%s Pis and %s Co-Pis were processed on %s grants", pisAdded, coPisAdded, size));
            sb.append("\n\n");
            sb.append("Fedora Activity");
            sb.append("\n\n");
            sb.append(format("%s Grants were created; %s Grants were updated", grantsCreated, grantsUpdated));
            sb.append("\n");
            sb.append(format("%s Users were created; %s Users were updated", usersCreated, usersUpdated));
            sb.append("\n");
            sb.append(format("%s Funders were created; %s Funders were updated", fundersCreated, fundersUpdated));

            sb.append("\n");
            this.report = sb.toString();
        } else if (type.equals("user")) {
            sb.append(format("%s grant records processed; the most recent update in this batch has timestamp %s",
                    resultSetSize, latestUpdateString));
            sb.append("Fedora Activity");
            sb.append("\n\n");
            sb.append(format("%s Users were created; %s Users were updated", usersCreated, usersUpdated));
        }
    }


    public int getGrantsUpdated() {
        return grantsUpdated;
    }

    void setGrantsUpdated(int grantsUpdated) {
        this.grantsUpdated = grantsUpdated;
    }

    public int getFundersUpdated() {
        return fundersUpdated;
    }

    void setFundersUpdated(int fundersUpdated) {
        this.fundersUpdated = fundersUpdated;
    }

    public int getUsersUpdated() {
        return usersUpdated;
    }

    void setUsersUpdated(int usersUpdated) {
        this.usersUpdated = usersUpdated;
    }

    public int getGrantsCreated() {
        return grantsCreated;
    }

    void setGrantsCreated(int grantsCreated) {
        this.grantsCreated = grantsCreated;
    }

    public int getFundersCreated() {
        return fundersCreated;
    }

    void setFundersCreated(int fundersCreated) {
        this.fundersCreated = fundersCreated;
    }

    public int getUsersCreated() {
        return usersCreated;
    }

    void setUsersCreated(int usersCreated) {
        this.usersCreated = usersCreated;
    }

    public int getPisAdded() {
        return pisAdded;
    }

    void setPisAdded(int pisAdded) {
        this.pisAdded = pisAdded;
    }

    public int getCoPisAdded() {
        return coPisAdded;
    }

    void setCoPisAdded(int coPisAdded) {
        this.coPisAdded = coPisAdded;
    }

    public String getLatestUpdateString() {
        return latestUpdateString;
    }

    void setLatestUpdateString(String latestUpdateString) {
        this.latestUpdateString = latestUpdateString;
    }

    public String getType() {
        return type;
    }

    void setType(String type) {
        this.type = type;
    }

}

