/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cp {
    static String field_b;
    static String field_a;
    static int field_c;

    final static boolean a(int param0) {
        int var1 = -123 / ((param0 - 52) / 44);
        if (qc.field_A < 20) {
          return true;
        }
        if (!tk.c((byte) -38)) {
          return true;
        }
        if (0 >= rc.field_b) {
          return false;
        }
        if (!ne.j(0)) {
          return true;
        }
        return false;
    }

    public static void b(byte param0) {
        int var1 = 65 / ((-65 - param0) / 61);
        field_a = null;
        field_b = null;
    }

    final static boolean a(byte param0, char param1) {
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
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          if (Character.isISOControl(param1)) {
            return false;
          }
          if (d.a(param1, param0 - 62)) {
            return true;
          }
          if (param0 != 64) {
            return false;
          }
          var6 = nr.field_o;
          var2 = var6;
          for (var3 = 0; var6.length > var3; var3++) {
            var4 = var6[var3];
            if (~var4 == ~param1) {
              return true;
            }
          }
          var2Lifetime1 = uc.field_b;
          var3Lifetime1 = 0;
          while (true) {
            if (var2Lifetime1.length <= var3Lifetime1) {
              return false;
            }
            var4Lifetime1 = var2Lifetime1[var3Lifetime1];
            if (param1 != var4Lifetime1) {
              var3Lifetime1++;
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2_ref), "cp.B(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(byte param0) {
        if (dc.field_L == null) {
          return;
        }
        Vertigo2.a(dc.field_L, (byte) -35);
        dc.field_L.a(gi.field_s, 30210);
        dc.field_L = null;
        if (param0 <= 122) {
          field_a = (String) null;
          if (null != t.field_m) {
            t.field_m.b((byte) 118);
            ne.field_F.requestFocus();
            return;
          }
          ne.field_F.requestFocus();
          return;
        }
        if (null == t.field_m) {
          ne.field_F.requestFocus();
          return;
        }
        t.field_m.b((byte) 118);
        ne.field_F.requestFocus();
    }

    static {
        field_b = "    ";
        field_c = -1;
        field_a = "Unpacking models";
    }
}
