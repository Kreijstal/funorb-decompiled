/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ieb extends rqa {
    static int[] field_o;

    final static void f(int param0) {
        int var3 = 0;
        String stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        boolean stackIn_13_2 = false;
        bc stackIn_18_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        bc var9 = null;
        int var10 = 0;
        var10 = VoidHunters.field_G;
        try {
          var1_int = mtb.field_p - mua.field_d;
          mua.field_d = -(var1_int >> 1) + alb.field_b;
          if (param0 != -1321004447) {
            field_o = (int[]) null;
          }
          nl.field_m = -(ot.field_b >> 1) + pba.field_r;
          mtb.field_p = mua.field_d + var1_int;
          var2 = nl.field_m;
          for (var3 = 0; var3 < db.field_o.length; var3++) {
            var4 = aka.field_o[var3];
            if (0 <= var4) {
              if (var4 == ei.field_c.field_j) {
                var5 = mb.field_j;
              } else {
                var5 = eqa.field_o;
              }
            } else {
              var5 = fda.field_o;
            }
            var6 = db.field_o[var3];
            stackIn_12_0 = var6;
            stackIn_12_1 = -37;
            stackIn_13_2 = !(0 > var4);
            var7 = lsa.a(stackIn_12_0, stackIn_12_1, stackIn_13_2);
            var8 = -(var7 >> 1) + alb.field_b;
            if (0 <= var4) {
              if (ei.field_c.field_j == var4) {
                stackIn_18_0 = ska.field_o;
              } else {
                stackIn_18_0 = vhb.field_d;
              }
              var9 = stackIn_18_0;
              var2 = var2 + pva.field_g;
              if (var9 != null) {
                var9.a((byte) 54, var8 - ih.field_e, (ih.field_e << 1) + var7, var2, tba.field_o + (hwa.field_q << 1));
              }
              var2 = var2 + hwa.field_q;
            }
            if (var4 >= 0) {
              bl.field_x.c(var6, var8, var2 + kjb.field_p, var5, -1);
              var2 = var2 + (pva.field_g + (hwa.field_q + tba.field_o));
            } else {
              oja.field_p.c(var6, var8, var2 + mab.field_f, var5, -1);
              var2 = var2 + whb.field_a;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1), "ieb.B(" + param0 + ')');
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          si.a(58, 62, param0[0].a(18));
          if (param1 >= -119) {
            ieb.e(-54);
          }
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ieb.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void e(int param0) {
        if (param0 < 112) {
          return;
        }
        msa.field_s = brb.f((byte) 62);
        klb.field_r = new ida();
        rga.a(true, true, false);
    }

    final static int a(int param0, int param1) {
        int var2;
        int var3;
        var2 = -35 % ((-9 - param1) / 32);
        var3 = 0;
        if (param0 < 0 ||
          65536 <= param0) {
          var3 += 16;
          param0 = param0 >>> 16;
        }
        if (param0 >= 256) {
          var3 += 8;
          param0 = param0 >>> 8;
        }
        if (param0 >= 16) {
          var3 += 4;
          param0 = param0 >>> 4;
        }
        if (4 <= param0) {
          var3 += 2;
          param0 = param0 >>> 2;
        }
        if (param0 >= 1) {
          var3++;
          param0 = param0 >>> 1;
        }
        return param0 + var3;
    }

    ieb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        if (param0 <= 79) {
          field_o = (int[]) null;
        }
        field_o = null;
    }

    static {
    }
}
