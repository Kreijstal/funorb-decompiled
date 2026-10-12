/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CampaignDefinition extends IntrusiveNode {
    static ru field_t;
    static String[] field_m;
    CampaignMission[] missions;
    String description;
    int[] initialUnitTypes;
    int localGodId;
    int campaignIndex;
    String localPlayerName;
    CampaignParticipant[] participants;
    String name;

    public static void a(byte param0) {
        field_t = null;
        if (param0 != 9) {
          CampaignDefinition.a((byte) 115);
          field_m = null;
          return;
        }
        field_m = null;
    }

    final boolean c(byte param0) {
        if (param0 != -45) {
          this.localGodId = 54;
          return ei.a(this.campaignIndex, 11906);
        }
        return ei.a(this.campaignIndex, 11906);
    }

    CampaignDefinition(String name) {
        try {
          this.name = name;
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "cf.<init>(" + (name != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
