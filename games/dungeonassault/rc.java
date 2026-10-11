/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc {
    static java.applet.Applet field_b;
    private static qk field_a;

    public static void a(byte param0) {
        if (param0 != -127) {
          field_b = (java.applet.Applet) null;
        }
        field_a = null;
        field_b = null;
    }

    final static cn a(String param0, nh param1, String param2, byte param3) {
        int var5 = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        cn var7 = null;
        cn var8 = null;
        cn stackIn_6_0 = null;
        cn stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = DungeonAssault.field_K;
        try {
          if (!param1.b(param2, param0, (byte) -82)) {
            param2 = param2 + ".jpg";
          }
          var7 = new cn(param1.a(param0, param2, (byte) -127), (java.awt.Component) ((Object) fi.d(false)));
          var8 = var7;
          if (param3 != 71) {
            stackIn_6_0 = (cn) null;
            return stackIn_6_0;
          }
          for (var5 = 0; var5 < var8.field_B.length; var5++) {
            var8.field_B[var5] = nb.a(var7.field_B[var5], 16777215);
          }
          stackIn_11_0 = var8;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("rc.C(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void b(int param0) {
        if (param0 <= 79) {
          field_a = (qk) null;
        }
        String var2 = (String) null;
        gg.a((byte) -103, (String) null, "");
    }

    final static void c(int param0) {
        bh.field_M = false;
        ra.field_c.c(true);
        if (param0 != 16777215) {
          field_b = (java.applet.Applet) null;
        }
    }

    final static void a(int param0) {
        int var3 = 0;
        int stackIn_10_0 = 0;
        boolean stackIn_11_1 = false;
        qk stackIn_16_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        qk var9 = null;
        int var10 = 0;
        var10 = DungeonAssault.field_K;
        try {
          var1_int = 108 % ((0 - param0) / 52);
          en.field_c = -(fa.field_i >> 1) + wf.field_C;
          var2 = en.field_c;
          for (var3 = 0; uc.field_K.length > var3; var3++) {
            var4 = dd.field_A[var3];
            if (var4 < 0) {
              var5 = ui.field_b;
            } else {
              if (var4 == h.field_h.field_b) {
                var5 = il.field_a;
              } else {
                var5 = dc.field_l;
              }
            }
            var6 = uc.field_K[var3];
            stackIn_10_0 = 107;
            stackIn_11_1 = !(var4 < 0);
            var7 = rb.$cfr$intArgs$a$62abead39cee(stackIn_10_0, stackIn_11_1, var6);
            var8 = -(var7 >> 1) + tm.field_e;
            if (var4 >= 0) {
              var2 = var2 + lc.field_j;
              if (var4 != h.field_h.field_b) {
                stackIn_16_0 = (qk) (field_a);
              } else {
                stackIn_16_0 = ug.field_y;
              }
              var9 = stackIn_16_0;
              if (var9 != null) {
                var9.a(var2, cd.field_e + (i.field_o << 1), var7 + (an.field_w << 1), 112, var8 - an.field_w);
              }
              var2 = var2 + i.field_o;
            }
            if (var4 >= 0) {
              mp.field_a.b(var6, var8, vk.field_e + var2, var5, -1);
              var2 = var2 + (cd.field_e + (i.field_o + lc.field_j));
            } else {
              hc.field_e.b(var6, var8, var2 + da.field_C, var5, -1);
              var2 = var2 + gb.field_a;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1), "rc.B(" + param0 + ')');
        }
    }

    static {
    }
}
