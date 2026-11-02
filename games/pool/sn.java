/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sn extends gg implements pe, ha {
    static IndexedSprite[] field_h;
    static String muChatLobby;
    static String ballsetSpaceGroup0;
    eq field_i;
    static String themeRandom;
    static vh field_m;
    static byte[] field_n;

    public final void a(sl param0, int param1) {
        try {
          int var3_int = -25 % ((-43 - param1) / 35);
          this.b(11755);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "sn.BA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        field_n = null;
        field_m = null;
        muChatLobby = null;
        field_h = null;
        if (param0 == -119) {
          themeRandom = null;
          ballsetSpaceGroup0 = null;
          return;
        }
        sn.a((byte) -90);
        themeRandom = null;
        ballsetSpaceGroup0 = null;
    }

    final String f(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String stackIn_4_0 = null;
        Throwable decompiledCaughtException = null;
        try {
          var2_int = this.field_i.h((byte) -119);
          var3 = this.field_i.j(25);
          var5 = -15 / ((-30 - param0) / 45);
          var4 = this.field_i.h(119);
          var6 = em.h(36);
          if (var4 >= 1890 &&
            var6 - 3 >= var4) {
            if (qp.a((byte) 123, var4, var3, var2_int)) {
              return null;
            }
          } else {
            stackIn_4_0 = nr.a(new String[]{"1890", Integer.toString(-3 + var6)}, -1, ej.createAlertYearrange);
            return stackIn_4_0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
        }
        return ij.createAlertInvaliddate;
    }

    final static boolean h(int param0) {
        if (param0 != -3) {
          return true;
        }
        if (null == sm.field_C) {
          return false;
        }
        if (!sm.field_C.f(20628)) {
          return false;
        }
        return true;
    }

    final na g(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        na stackIn_4_0 = null;
        na stackIn_8_0 = null;
        na stackIn_11_0 = null;
        Throwable decompiledCaughtException = null;
        try {
          if (param0 != -14836) {
            themeRandom = (String) null;
          }
          var2_int = this.field_i.h((byte) -119);
          var3 = this.field_i.j(param0 ^ -14827);
          var4 = this.field_i.h(49);
          var5 = em.h(param0 + 14872);
          if (1890 > var4) {
            stackIn_4_0 = gp.field_d;
            return stackIn_4_0;
          }
          if (-3 + var5 < var4) {
            stackIn_8_0 = gp.field_d;
            return stackIn_8_0;
          }
          if (!qp.a((byte) 122, var4, var3, var2_int)) {
            stackIn_11_0 = gp.field_d;
            return stackIn_11_0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return gp.field_d;
        }
        return ProxySocketConnector.field_e;
    }

    public final void a(sl param0, boolean param1) {
        try {
          if (param1) {
            sl var4 = (sl) null;
            this.a((sl) null, -31);
          }
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "sn.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public sn() {
    }

    public final boolean d(int param0) {
        if (param0 != -3) {
          sn.h(41);
          return this.field_i.g((byte) 114);
        }
        return this.field_i.g((byte) 114);
    }

    static {
        ballsetSpaceGroup0 = "Spots";
        muChatLobby = "Lobby";
        themeRandom = "Random";
    }
}
