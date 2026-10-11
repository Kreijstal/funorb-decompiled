/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wp {
    static String field_a;
    static mb field_c;
    static am field_b;
    static int[] field_d;

    final static void a(Throwable param0, String param1, int param2) {
        try {
          un stackIn_11_0;
          int stackIn_11_1;
          java.net.URL stackIn_11_2;
          java.net.URL stackIn_11_3;
          java.net.URL stackIn_11_4;
          StringBuilder stackIn_11_5;
          java.net.URL stackIn_12_2;
          java.net.URL stackIn_12_3;
          String stackIn_12_6;
          Throwable decompiledCaughtException = null;
          String var3 = null;
          Exception var3_ref = null;
          gb var4 = null;
          DataInputStream var5 = null;
          int var6 = 0;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var10 = null;
          var6 = CrazyCrystals.field_B;
          try {
            var3 = "";
            if (param0 != null) {
              var3 = oo.a((byte) -117, param0);
            }
            if (param1 != null) {
              if (param0 != null) {
                var3 = var3 + " | ";
              }
              var3 = var3 + param1;
            }
            qf.a(var3, param2 - 21861);
            var7 = ca.a("%3a", param2 - 21862, var3, ":");
            var8 = ca.a("%40", 0, var7, "@");
            var9 = ca.a("%26", 0, var8, "&");
            var10 = ca.a("%23", 0, var9, "#");
            if (pj.field_w == null) {
              return;
            }
            stackIn_11_0 = rd.field_g;
            stackIn_11_1 = param2 ^ 21859;
            stackIn_11_2 = null;
            stackIn_11_3 = null;
            stackIn_11_4 = pj.field_w.getCodeBase();
            stackIn_11_5 = new StringBuilder().append("clienterror.ws?c=").append(me.field_e).append("&u=");
            if (bn.field_f != null) {
              stackIn_12_2 = null;
              stackIn_12_3 = null;
              stackIn_12_6 = bn.field_f;
            } else {
              stackIn_12_2 = null;
              stackIn_12_3 = null;
              stackIn_12_6 = "" + wi.field_h;
            }
            var4 = ((un) (Object) stackIn_11_0).a(stackIn_11_1, new java.net.URL(stackIn_11_4, ((StringBuilder) (Object) stackIn_11_5).append(stackIn_12_6).append("&v1=").append(un.field_e).append("&v2=").append(un.field_m).append("&e=").append(var10).toString()));
            while (var4.field_a == 0) {
              fh.a(true, 1L);
            }
            if (param2 != 21862) {
              return;
            }
            if (var4.field_a == 1) {
              var5 = (DataInputStream) (var4.field_b);
              var5.read();
              var5.close();
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(byte param0) {
        int var3 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        String stackIn_26_0 = null;
        String stackIn_33_0 = null;
        int stackIn_38_0 = 0;
        boolean stackIn_39_1 = false;
        hj stackIn_44_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        hj var9 = null;
        int var10 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var10 = CrazyCrystals.field_B;
        try {
          var1_int = pf.field_n;
          var2 = 0;
          if (2 == am.field_g) {
            var3_long = -wm.field_d + lo.a((byte) 122);
            var2 = (int)((-var3_long + 10999L) / 1000L);
            if (0 > var2) {
              var2 = 0;
            }
          }
          if (param0 > -41) {
            return;
          }
          for (var3 = 0; je.field_i.length > var3; var3++) {
            var4 = ub.field_b[var3];
            if (0 > var4) {
              var5 = ao.field_e;
            } else {
              if (var4 == lb.field_l.field_c) {
                var5 = jn.field_i;
              } else {
                var5 = mc.field_s;
              }
            }
            var6 = je.field_i[var3];
            if (am.field_g == 2 &&
              var2 == 1) {
              if (sl.field_r.length <= jl.field_a.length) {
                stackIn_18_0 = jl.field_a.length;
              } else {
                stackIn_18_0 = sl.field_r.length;
              }
              var7 = stackIn_18_0;
              if (lo.field_c.length >= ne.field_a.length) {
                stackIn_21_0 = lo.field_c.length;
              } else {
                stackIn_21_0 = ne.field_a.length;
              }
              var8 = stackIn_21_0;
              if (var3 >= 6 &&
                var3 < 6 + var7) {
                if (jl.field_a.length + (var3 - 6 - var7) >= 0) {
                  stackIn_26_0 = jl.field_a[var3 - 6 + jl.field_a.length - var7];
                } else {
                  stackIn_26_0 = "";
                }
                var6 = stackIn_26_0;
              }
              if (var3 >= 7 + var7 &&
                var8 + (var7 + 7) > var3) {
                if (lo.field_c.length <= -var7 + (-7 + var3)) {
                  stackIn_33_0 = "";
                } else {
                  stackIn_33_0 = lo.field_c[-var7 - 7 + var3];
                }
                var6 = stackIn_33_0;
              }
            }
            if (var4 == -2) {
              var6 = Integer.toString(var2);
            }
            stackIn_38_0 = 102;
            stackIn_39_1 = !(var4 < 0);
            var7Lifetime1 = vm.$cfr$intArgs$a$62abead39cee(stackIn_38_0, stackIn_39_1, var6);
            var8Lifetime1 = oa.field_b - (var7Lifetime1 >> 1);
            if (var4 >= 0) {
              if (lb.field_l.field_c == var4) {
                stackIn_44_0 = qo.field_k;
              } else {
                stackIn_44_0 = qh.field_h;
              }
              var9 = stackIn_44_0;
              var1_int = var1_int + a.field_a;
              if (var9 != null) {
                var9.a(-to.field_d + var8Lifetime1, 2, var1_int, (bn.field_c << 1) + gh.field_w, var7Lifetime1 + (to.field_d << 1));
              }
              var1_int = var1_int + bn.field_c;
            }
            if (var4 < 0) {
              ec.field_m.a(var6, var8Lifetime1, sc.field_g + var1_int, var5, -1);
              var1_int = var1_int + io.field_O;
            } else {
              gh.field_F.a(var6, var8Lifetime1, var1_int + kb.field_h, var5, -1);
              var1_int = var1_int + (a.field_a + bn.field_c + gh.field_w);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var1), "wp.A(" + param0 + ')');
        }
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = pc.a(param2, 0);
          if (param0.indexOf(param2) != param1) {
            return true;
          }
          if (param0.indexOf(var3) != -1) {
            return true;
          }
          stackIn_12_0 = (param0.startsWith(param2)) || (param0.startsWith(var3)) || (param0.endsWith(param2)) || (param0.endsWith(var3));
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("wp.D(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 < -78) {
          field_c = null;
          field_d = null;
          field_b = null;
          field_a = null;
          return;
        }
        field_d = (int[]) null;
        field_c = null;
        field_d = null;
        field_b = null;
        field_a = null;
    }

    static {
        field_a = "Please wait...";
        field_c = new mb("usename");
    }
}
