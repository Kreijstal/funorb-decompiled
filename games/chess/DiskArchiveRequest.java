/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DiskArchiveRequest extends ArchiveRequest {
    static lc field_z;
    static String field_A;
    int field_B;
    static String field_y;
    static int[] field_w;
    SectorCacheStore field_x;
    byte[] field_v;

    public static void clearDeclaredStaticReferences(int param0) {
        if (param0 == -7588) {
          field_z = null;
          field_y = null;
          field_w = null;
          field_A = null;
          return;
        }
        DiskArchiveRequest.clearDeclaredStaticReferences(32);
        field_z = null;
        field_y = null;
        field_w = null;
        field_A = null;
    }

    final int getProgressPercent(int param0) {
        if (param0 < 51) {
          field_A = (String) null;
          if (!this.field_s) {
            return 100;
          }
          return 0;
        }
        if (!this.field_s) {
          return 100;
        }
        return 0;
    }

    final byte[] getData(boolean param0) {
        if (this.field_s) {
          throw new RuntimeException();
        }
        if (param0) {
          return (byte[]) null;
        }
        return this.field_v;
    }

    DiskArchiveRequest() {
    }

    static {
        field_A = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_y = "Return to game";
        field_w = new int[8192];
    }
}
