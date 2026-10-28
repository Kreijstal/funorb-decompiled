/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DiskCacheRequest extends ArchiveRequest {
    int operation;
    byte[] data;
    SectorCacheStore store;

    final int progress(int guard) {
        if (this.pending) {
          return 0;
        }
        if (guard != 100) {
          this.operation = 124;
          return 100;
        }
        return 100;
    }

    final static void clearSessionAndReload(java.applet.Applet applet, int guard) {
        try {
          SecondaryIntrusiveDeque.setSessionCookie("", -121, applet);
          IntValueNode.reloadAppletPage(false, applet);
          if (guard != 21027) {
            java.applet.Applet var3 = (java.applet.Applet) null;
            DiskCacheRequest.clearSessionAndReload((java.applet.Applet) null, 73);
          }
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "cm.C(" + (applet != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    final static int reverseBits(int value, int bitCount, byte guard) {
        int var4 = EscapeVector.obfuscationControl;
        try {
          if (guard != 96) {
            java.applet.Applet var5 = (java.applet.Applet) null;
            DiskCacheRequest.clearSessionAndReload((java.applet.Applet) null, 108);
          }
          int var3_int = 0;
          while (bitCount > 0) {
            var3_int = var3_int << 1 | value & 1;
            bitCount--;
            value = value >>> 1;
          }
          int stackIn_7_0 = var3_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var3), "cm.B(" + value + ',' + bitCount + ',' + guard + ')');
        }
    }

    DiskCacheRequest() {
    }

    final byte[] getBytes(boolean guard) {
        if (!guard) {
          this.progress(81);
          if (this.pending) {
            throw new RuntimeException();
          }
          return this.data;
        }
        if (this.pending) {
          throw new RuntimeException();
        }
        return this.data;
    }

    static {
    }
}
