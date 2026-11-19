/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DiskCacheRequest extends ArchiveRequest {
    int field_y;
    DiskCacheStore field_x;
    byte[] field_v;
    static int field_w;

    final int g(int param0) {
        if (param0 != 0) {
          return 79;
        }
        if (this.field_u) {
          return 0;
        }
        return 100;
    }

    final byte[] i(int param0) {
        if (this.field_u) {
          throw new RuntimeException();
        }
        if (param0 != -20324) {
          return (byte[]) null;
        }
        return this.field_v;
    }

    DiskCacheRequest() {
    }

    static {
    }
}
