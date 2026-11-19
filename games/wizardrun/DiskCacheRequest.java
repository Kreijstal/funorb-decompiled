/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DiskCacheRequest extends ArchiveRequest {
    static String field_C;
    int actionType;
    static int field_v;
    static Sprite field_z;
    static String[] field_y;
    DiskCacheStore store;
    byte[] data;
    static int[] field_B;

    final static void configureMembershipSlideTiming(int param0, int param1) {
        MidiPcmStream.field_M = param1 * 100 / 150;
        MidiPcmStream.field_V = (param1 << 16) / 150;
        MidiPcmStream.field_u = 400 * param1 / 150;
        if (param0 != 16062) {
          DiskCacheRequest.releaseStatics(79);
        }
    }

    final byte[] getData(int param0) {
        if (param0 != 95) {
          field_y = (String[]) null;
          if (!this.pending) {
            return this.data;
          }
          throw new RuntimeException();
        }
        if (!this.pending) {
          return this.data;
        }
        throw new RuntimeException();
    }

    final int getProgress(boolean param0) {
        if (param0) {
          DiskCacheRequest.configureMembershipSlideTiming(16, 86);
          if (!this.pending) {
            return 100;
          }
          return 0;
        }
        if (!this.pending) {
          return 100;
        }
        return 0;
    }

    public static void releaseStatics(int param0) {
        field_y = null;
        if (param0 == 100) {
          field_B = null;
          field_z = null;
          field_C = null;
          return;
        }
        DiskCacheRequest.configureMembershipSlideTiming(-127, -122);
        field_B = null;
        field_z = null;
        field_C = null;
    }

    DiskCacheRequest() {
    }

    static {
        field_y = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_C = "Pause the game";
    }
}
