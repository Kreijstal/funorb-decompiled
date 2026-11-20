/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AlternateUsernameLoginCredentials extends UsernameLoginCredentials {
    static boolean field_j;
    static RoadFillRenderer field_l;
    static long field_k;

    AlternateUsernameLoginCredentials(long param0, String param1) {
        super(param0, param1);
    }

    public static void clearSharedReferences(byte param0) {
        if (param0 != -93) {
          AlternateUsernameLoginCredentials.clearSharedReferences((byte) -69);
          field_l = null;
          return;
        }
        field_l = null;
    }

    final LoginCredentialType getType(boolean param0) {
        if (!param0) {
          AlternateUsernameLoginCredentials.requestBackground(107, 64);
          return AccountNameNormalizer.field_b;
        }
        return AccountNameNormalizer.field_b;
    }

    final static void requestBackground(int param0, int param1) {
        DropTargetWidget.setBackground(param0, (byte) 92, false);
        if (param1 > -106) {
          field_k = -61L;
        }
    }

    static {
        field_l = (RoadFillRenderer) ((Object) new OutlinedRoadFillRenderer(16777087, 16777087, 128));
    }
}
