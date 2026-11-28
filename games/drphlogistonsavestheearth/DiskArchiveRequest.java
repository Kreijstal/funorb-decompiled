/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DiskArchiveRequest extends ArchiveRequest {
    static ResourceArchive field_I;
    byte[] field_F;
    int field_G;
    static String field_J;
    SectorCacheStore field_H;
    static mk[] field_K;

    final byte[] getData(int param0) {
        if (param0 != 13095) {
          return (byte[]) null;
        }
        if (this.field_u) {
          throw new RuntimeException();
        }
        return this.field_F;
    }

    public static void clearStaticReferences(byte param0) {
        field_I = null;
        field_K = null;
        field_J = null;
        int var1 = 93 / ((47 - param0) / 62);
    }

    final static void a(String param0, int param1, RgbSprite param2) {
        try {
          hf.field_D = param2;
          df.field_b = param0;
          if (param1 < 119) {
            RgbSprite var4 = (RgbSprite) null;
            DiskArchiveRequest.a((String) null, -46, (RgbSprite) null);
          }
        } catch (RuntimeException runtimeException) {
          throw ie.wrapClientException((Throwable) ((Object) runtimeException), "bi.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    DiskArchiveRequest() {
    }

    final int getProgressPercent(int param0) {
        if (this.field_u) {
          return 0;
        }
        if (param0 > -38) {
          this.getData(116);
          return 100;
        }
        return 100;
    }

    static {
        field_K = new mk[9];
    }
}
