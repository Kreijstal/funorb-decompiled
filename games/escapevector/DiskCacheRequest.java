/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DiskCacheRequest extends ArchiveRequest {
    int field_z;
    byte[] field_y;
    SectorCacheStore field_x;

    final int progress(int guard) {
        if (this.field_u) {
          return 0;
        }
        if (guard != 100) {
          this.field_z = 124;
          return 100;
        }
        return 100;
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
          SecondaryIntrusiveDeque.a("", -121, param0);
          IntValueNode.a(false, param0);
          if (param1 != 21027) {
            java.applet.Applet var3 = (java.applet.Applet) null;
            DiskCacheRequest.a((java.applet.Applet) null, 73);
          }
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "cm.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int a(int param0, int param1, byte param2) {
        int var4 = EscapeVector.obfuscationControl;
        try {
          if (param2 != 96) {
            java.applet.Applet var5 = (java.applet.Applet) null;
            DiskCacheRequest.a((java.applet.Applet) null, 108);
          }
          int var3_int = 0;
          while (param1 > 0) {
            var3_int = var3_int << 1 | param0 & 1;
            param1--;
            param0 = param0 >>> 1;
          }
          int stackIn_7_0 = var3_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var3), "cm.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    DiskCacheRequest() {
    }

    final byte[] getBytes(boolean guard) {
        if (!guard) {
          this.progress(81);
          if (this.field_u) {
            throw new RuntimeException();
          }
          return this.field_y;
        }
        if (this.field_u) {
          throw new RuntimeException();
        }
        return this.field_y;
    }

    static {
    }
}
