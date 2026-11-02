/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CampaignDefinition extends IntrusiveNode {
    static IndexedSprite field_t;
    static String[] field_m;
    CampaignMission[] missions;
    String description;
    int[] initialUnitTypes;
    int localGodId;
    int campaignIndex;
    String localPlayerName;
    CampaignParticipant[] participants;
    String name;

    public static void releaseStatics(byte obfuscationGuard) {
        field_t = null;
        if (obfuscationGuard != 9) {
          CampaignDefinition.releaseStatics((byte) 115);
          field_m = null;
          return;
        }
        field_m = null;
    }

    final boolean c(byte param0) {
        if (param0 != -45) {
          this.localGodId = 54;
          return BoundedFile.a(this.campaignIndex, 11906);
        }
        return BoundedFile.a(this.campaignIndex, 11906);
    }

    CampaignDefinition(String name) {
        try {
          this.name = name;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "cf.<init>(" + (name != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
