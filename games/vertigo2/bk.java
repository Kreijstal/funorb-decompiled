/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk {
    static String field_d;
    private boolean field_e;
    static String field_b;
    private boolean field_c;
    static int field_f;
    private String field_a;

    final String d(byte param0) {
        if (param0 < 104) {
          this.field_e = false;
          return this.field_a;
        }
        return this.field_a;
    }

    final static void b(byte param0) {
        int var3 = 0;
        int stackIn_12_0 = 0;
        String stackIn_12_1 = null;
        boolean stackIn_13_2 = false;
        mp stackIn_18_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        mp var9 = null;
        int var10 = 0;
        var10 = Vertigo2.field_L ? 1 : 0;
        try {
          var1_int = qp.field_d - pk.field_o;
          pk.field_o = ni.field_a - (var1_int >> 1);
          qp.field_d = var1_int + pk.field_o;
          if (param0 >= -90) {
            return;
          }
          ui.field_d = -(sf.field_d >> 1) + kf.field_b;
          var2 = ui.field_d;
          for (var3 = 0; al.field_y.length > var3; var3++) {
            var4 = dg.field_f[var3];
            if (var4 < 0) {
              var5 = t.field_c;
            } else {
              if (var4 == kg.field_G.field_c) {
                var5 = vm.field_b;
              } else {
                var5 = vg.field_d;
              }
            }
            var6 = al.field_y[var3];
            stackIn_12_0 = 127;
            stackIn_12_1 = var6;
            stackIn_13_2 = !(0 > var4);
            var7 = ao.a(stackIn_12_0, stackIn_12_1, stackIn_13_2);
            var8 = -(var7 >> 1) + ni.field_a;
            if (0 <= var4) {
              var2 = var2 + vo.field_y;
              if (kg.field_G.field_c != var4) {
                stackIn_18_0 = od.field_Jb;
              } else {
                stackIn_18_0 = td.field_a;
              }
              var9 = stackIn_18_0;
              if (var9 != null) {
                var9.a(ml.field_v + (eb.field_h << 1), -hc.field_a + var8, var2, (hc.field_a << 1) + var7, -59);
              }
              var2 = var2 + eb.field_h;
            }
            if (var4 >= 0) {
              hd.field_f.b(var6, var8, hq.field_r + var2, var5, -1);
              var2 = var2 + (ml.field_v + vo.field_y + eb.field_h);
            } else {
              oc.field_s.b(var6, var8, jm.field_G + var2, var5, -1);
              var2 = var2 + cd.field_a;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var1), "bk.G(" + param0 + ')');
        }
    }

    final void a(int param0, boolean param1) {
        this.field_e = param1 ? true : false;
        this.field_c = true;
        if (param0 != 0) {
          bk.b((byte) 100);
        }
    }

    final static er[] a(int param0, int param1, r param2, int param3) {
        RuntimeException var4 = null;
        r var5 = null;
        Object stackIn_4_0 = null;
        er[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -2724) {
            var5 = (r) null;
            bk.a(-14, -96, (r) null, 39);
          }
          if (hq.a(124, param0, param1, param2)) {
            stackIn_6_0 = wa.c(param3 + 2846);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (er[]) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("bk.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != 0) {
          return;
        }
        field_b = null;
    }

    final boolean a(byte param0) {
        if (param0 >= -61) {
          return true;
        }
        return this.field_c;
    }

    final boolean c(byte param0) {
        if (param0 > -109) {
          bk.b((byte) -90);
          return this.field_e;
        }
        return this.field_e;
    }

    bk(String param0) {
        this.field_e = false;
        this.field_c = false;
        try {
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "bk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = "Retry";
        field_b = "All players have left <%0>'s game.";
        field_f = 0;
    }
}
