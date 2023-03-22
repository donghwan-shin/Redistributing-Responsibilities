package example.project;

import example.project.domain.Scenario;
import example.project.domain.SimulationResult;
import example.project.domain.Snapshot;

public class Simulator {

    /**
     * Compute the next snapshot (status) of the simulated world based on the current snapshot and the driving command from the ADS.
     *
     * @param snapshot_curr
     * @param command
     * @return
     */
    Snapshot next(Snapshot snapshot_curr, String command) {
        Snapshot snapshot_next = new Snapshot();
        snapshot_next.roadType = snapshot_curr.roadType;
        snapshot_next.weatherCondition = snapshot_curr.weatherCondition;

        if (command.equals("left")) {

        } else if (command.equals("right")) {

        } else if (command.equals("straight")) {

        } else {
            System.err.printf("Unknown driving command: %s", command);
        }
        return snapshot_next;
    }
}
