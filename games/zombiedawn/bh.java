/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh extends le {
    static vn field_j;
    static java.applet.Applet field_i;
    byte[] field_k;
    static String field_h;

    final static void a(int param0) {
        int var2 = 0;
        al[] var1 = null;
        al var3 = null;
        int var4 = 0;
        al[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = ZombieDawn.field_J;
        try {
          if (qg.field_d) {
            return;
          }
          qg.field_d = true;
          var5 = qk.field_Jb;
          var1 = var5;
          for (var2 = param0; var2 < var5.length; var2++) {
            var3 = var5[var2];
            var3.b(24136);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1_ref), "bh.B(" + param0 + ')');
        }
    }

    public static void c(int param0) {
        field_h = null;
        if (param0 < 69) {
          bh.a(-47);
        }
        field_j = null;
        field_i = null;
    }

    bh(byte[] param0) {
        try {
          this.field_k = param0;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "bh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(char param0, boolean param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        char[] var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        var5 = ZombieDawn.field_J;
        try {
          if (Character.isISOControl(param0)) {
            return false;
          }
          if (c.a(param0, 441)) {
            return true;
          }
          var6 = hn.field_o;
          var2 = var6;
          for (var3 = 0; var6.length > var3; var3++) {
            var4 = var6[var3];
            if (~param0 == ~var4) {
              return true;
            }
          }
          var2Lifetime1 = pf.field_h;
          var3Lifetime1 = 0;
          if (param1) {
            field_h = (String) null;
          }
          while (var3Lifetime1 < var2Lifetime1.length) {
            var4Lifetime1 = var2Lifetime1[var3Lifetime1];
            if (param0 == var4Lifetime1) {
              return true;
            }
            var3Lifetime1++;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2_ref), "bh.C(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_h = "CURSE";
    }
}
