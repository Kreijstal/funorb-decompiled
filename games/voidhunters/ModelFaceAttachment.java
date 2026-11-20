/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ModelFaceAttachment {
    static String field_f;
    static Widget field_d;
    int label;
    int field_c;
    int faceIndex;
    int definitionId;

    public static void clearSharedReferences(byte param0) {
        field_f = null;
        if (param0 <= 104) {
          return;
        }
        field_d = null;
    }

    final static boolean isGuestOrNonMember(boolean param0) {
        boolean stackIn_7_0 = false;
        if (param0) {
          return false;
        }
        if (GetPhasedEnergyBeamPulsetime.isGuestMode((byte) 119)) {
          stackIn_7_0 = true;
        } else {
          if (GetDebrisCarryOver.field_o <= 0) {
            return true;
          }
          stackIn_7_0 = false;
        }
        return stackIn_7_0;
    }

    private ModelFaceAttachment() throws Throwable {
        throw new Error();
    }

    static {
        field_f = "Email is valid";
    }
}
