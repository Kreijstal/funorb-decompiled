/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ShieldInfoPool {
    static Sprite field_c;
    static String field_e;
    ShieldInfo[] entries;
    static String field_a;
    int size;

    final static void detachCanvasInput(java.awt.Canvas param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          SetDebrisCollision.detachKeyboardListeners((java.awt.Component) ((Object) param0), (byte) 121);
          MouseInputUtilities.detachMouseListeners((byte) 1, (java.awt.Component) ((Object) param0));
          var2_int = 105 / ((41 - param1) / 39);
          if (GetWaitForPlayers.field_o == null) {
            return;
          }
          GetWaitForPlayers.field_o.detach((java.awt.Component) ((Object) param0), -21835);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_5_0 = var2;
          stackIn_5_1 = new StringBuilder().append("kl.C(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    final void reset(int param0) {
        if (param0 < 26) {
          this.entries = (ShieldInfo[]) null;
          this.size = 0;
          return;
        }
        this.size = 0;
    }

    final ShieldInfo acquire(int param0) {
        int fieldTemp$0 = 0;
        if (param0 != 0) {
          return (ShieldInfo) null;
        }
        if (this.size >= this.entries.length) {
          GetDebrisThrowable.a(false, "We've run out of shieldinfo slots");
          return null;
        }
        if (null != this.entries[this.size]) {
          fieldTemp$0 = this.size;
          this.size = this.size + 1;
          return this.entries[fieldTemp$0];
        }
        this.entries[this.size] = new ShieldInfo();
        int fieldTemp$1 = this.size;
        this.size = this.size + 1;
        return this.entries[fieldTemp$1];
    }

    public static void clearSharedReferences(int param0) {
        if (param0 < -102) {
          field_a = null;
          field_e = null;
          field_c = null;
          return;
        }
        java.awt.Canvas var2 = (java.awt.Canvas) null;
        ShieldInfoPool.detachCanvasInput((java.awt.Canvas) null, 125);
        field_a = null;
        field_e = null;
        field_c = null;
    }

    final static void writeSessionMarkerCookie(java.applet.Applet param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String var3 = null;
        long var4 = 0L;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          GetSpecialOrderBarYOffset.field_o = true;
          var2 = "tuhstatbut";
          var3 = "rvnadlm";
          var4 = -1L;
          AppletCookieWriter.writeCookie(param0, -125, var3, var2, var4);
          if (param1 == 0) {
            return;
          }
          field_a = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_5_0 = var2_ref;
          stackIn_5_1 = new StringBuilder().append("kl.B(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    public ShieldInfoPool() {
        this.entries = new ShieldInfo[128];
    }

    static {
        field_e = "Arm self destruct";
        field_a = "Bomblet spray";
    }
}
