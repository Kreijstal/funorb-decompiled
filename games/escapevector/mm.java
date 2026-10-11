/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm {
    static hl field_b;
    static String field_c;
    static String field_a;

    final static boolean a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = EscapeVector.field_A;
        try {
          if (mj.field_d == 0) {
            sj.a(8192, (byte) 51);
          }
          var1_int = 0;
          de.field_j = true;
          if (param0 > -13) {
            field_a = (String) null;
          }
          if (0 == mj.field_d) {
            rk.field_e.a(pc.field_a, 100, 6144 * qm.field_c / 64, 8192);
          }
          if (10 == mj.field_d) {
            rk.field_e.a(pc.field_a, 100, qm.field_c * 6144 / 64, 8192);
          }
          if (mj.field_d < 1000) {
            mj.field_d = mj.field_d + 1;
          }
          do {
            if (!pn.p(-126)) {
              di.field_d.a(gb.a(sf.field_c, ng.field_ob, 8158), (byte) 126, gb.a(dh.field_d, bj.field_y, 8158));
              if (!fn.a(true, 0)) {
                return var1_int != 0;
              }
              var1_int = 1;
              stackIn_21_0 = var1_int;
              return stackIn_21_0 != 0;
            }
            di.field_d.c((byte) 6);
          } while (!fn.a(false, 0));
          var1_int = 1;
          stackIn_17_0 = var1_int;
          return stackIn_17_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "mm.F(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        he.field_x = param2;
        int var5 = -76 % ((-35 - param0) / 47);
        ok.field_a = param4;
        je.field_b = param1;
        vk.field_t = param3;
    }

    final static int a(int param0, boolean param1, int param2, int param3) {
        if (param0 != 64) {
          field_b = (hl) null;
          return dj.a(param0 + 6381);
        }
        return dj.a(param0 + 6381);
    }

    final static boolean a(int param0, int param1) {
        int var3 = EscapeVector.field_A;
        if (param0 != 4) {
          return false;
        }
        if (fa.field_c[param1]) {
          return true;
        }
        mf var4 = fi.field_j;
        if (5 == param1) {
          en.a(var4, 5);
          fn.a((byte) 53);
          return true;
        }
        if (param1 != 4) {
          if (var4.a(param0 - 4, da.field_d[param1])) {
            tk.field_a[param1] = fe.a(da.field_d[param1], var4, "texture", true);
            dd.field_a[param1] = fe.a(da.field_d[param1], var4, "frosting", true);
            dd.field_a[param1].c();
            dm.a(var4, param1, false);
            fa.field_c[param1] = true;
            fn.a((byte) 53);
            return true;
          }
          return false;
        }
        if (se.field_b != null) {
          sl.field_b[param1] = se.field_b.field_g;
          pf.field_g[param1] = se.field_b.field_d;
          fa.field_c[param1] = true;
          fn.a((byte) 53);
          return true;
        }
        fn.a((byte) 53);
        return true;
    }

    final static String a(int param0, CharSequence param1) {
        int var4 = 0;
        int var2_int = 0;
        char[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = EscapeVector.field_A;
        try {
          var2_int = param1.length();
          if (var2_int > 20) {
            var2_int = 20;
          }
          var8 = new char[var2_int];
          var7 = var8;
          var3 = var7;
          for (var4 = param0; var2_int > var4; var4++) {
            var5 = param1.charAt(var4);
            if (var5 >= 65 &&
              90 >= var5) {
              var3[var4] = (char)(-65 + var5 + 97);
            } else if ((var5 < 97 ||
              var5 > 122) &&
              (var5 < 48 ||
              var5 > 57)) {
              var3[var4] = (char)95;
            } else {
              var3[var4] = (char)var5;
            }
          }
          stackIn_19_0 = new String(var8);
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_22_0 = var2;
          stackIn_22_1 = new StringBuilder().append("mm.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        int var1 = -15 % ((param0 + 35) / 55);
        field_c = null;
        field_b = null;
        field_a = null;
    }

    static {
        field_a = "Logging in...";
        field_c = "Create your own free Jagex account";
    }
}
