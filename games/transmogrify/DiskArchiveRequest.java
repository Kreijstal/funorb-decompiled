/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DiskArchiveRequest extends ArchiveRequest {
    static long field_y;
    int field_z;
    byte[] field_B;
    static int field_A;
    SectorCacheStore field_C;
    static int field_w;
    static int field_x;

    static int bitwiseOr(int param0, int param1) {
        return param0 | param1;
    }

    final int getProgressPercent(int param0) {
        if (this.field_m) {
          return 0;
        }
        if (param0 != 0) {
          return 72;
        }
        return 100;
    }

    final byte[] getData(int param0) {
        if (param0 != 256) {
          this.getProgressPercent(95);
          if (!this.field_m) {
            return this.field_B;
          }
          throw new RuntimeException();
        }
        if (!this.field_m) {
          return this.field_B;
        }
        throw new RuntimeException();
    }

    DiskArchiveRequest() {
    }

    static {
    }
}
