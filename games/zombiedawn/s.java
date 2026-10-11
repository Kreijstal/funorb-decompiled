/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class s extends le {
    int field_i;
    fb field_h;
    static vn field_j;

    final static void a(long param0, int param1, boolean param2, int param3, boolean param4, int param5, int param6, int param7, int param8, int param9, ec param10, String param11, int param12, int param13) {
        try {
          RuntimeException stackIn_14_0 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          int var15_int = 0;
          RuntimeException var15 = null;
          IOException var16 = null;
          try {
            fj.field_g = new am(param1);
            dp.field_e = new am(param7);
            h.field_b = param5;
            var15_int = 112 / ((56 - param12) / 57);
            jm.field_B = param10;
            cn.field_j = param13;
            ni.field_a = param4;
            tm.field_o = param11;
            ci.field_c = param8;
            kg.field_k = param9;
            ih.field_S = param2;
            ba.field_b = param3;
            le.field_g = param6;
            lg.field_u = param0;
            if (null == jm.field_B.field_b) {
              return;
            }
            try {
              ce.field_t = new sf(jm.field_B.field_b, 64, 0);
              return;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var16 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(var16.toString());
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var15 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_14_0 = var15;
            stackIn_14_1 = new StringBuilder().append("s.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',');
            if (param10 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
            if (param11 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw sh.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param12).append(',').append(param13).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, wk param1, ub param2) {
        int var5 = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        kd var6 = null;
        qh var7 = null;
        int var8 = 0;
        var8 = ZombieDawn.field_J;
        try {
          var3_int = 83 % ((param0 + 39) / 39);
          if (ac.field_m > 1428) {
            return;
          }
          if (0 == ac.field_m % 35) {
            lg.a(2, (byte) 100);
          }
          if (-1.0f == oc.field_c) {
            oc.field_c = (float)param1.field_c;
          }
          if (oc.field_c > 240.0f) {
            oc.field_c = oc.field_c - i.field_V;
            param1.field_c = (int)oc.field_c;
          }
          if (ac.field_m == 1428) {
            if (qj.field_f != null &&
              !qj.field_f.l()) {
              pc.a((byte) 13, qj.field_f);
            }
            ch.b(73);
            ZombieDawn.b(114, wi.field_a);
            qb.a(false, wc.field_Rb);
            wo.field_wb = true;
            return;
          }
          if (ac.field_m <= 1172) {
            if (1172 == ac.field_m) {
              wc.field_Rb = ge.field_c;
              ha.field_d.w(0);
              wi.field_e = ha.field_d.field_Pb;
            } else {
              if (850 >= ac.field_m) {
                if (850 == ac.field_m) {
                  wi.field_a = ce.field_u;
                }
              } else {
                var4 = -ac.field_m + 1106;
                if (var4 < 0) {
                  var4 = 0;
                }
                ZombieDawn.b(126, var4 * wi.field_a >> 8);
                if (ac.field_m % 2 == 0) {
                  param2.i(16777215);
                  if ((ac.field_m - 850) / 2 == 100) {
                    ha.field_d.field_x = -50 + ha.field_d.f(237239984) << 16;
                    for (var5 = 0; var5 < 5; var5++) {
                      var6 = dj.field_e.a(10, (byte) 124, 90, 340, 380);
                      var7 = new qh();
                      var7.a(0, new kk(var6.a(true), var6.f(237239984) - 100));
                      var6.a(var7, true);
                    }
                  }
                }
              }
            }
          } else {
            var4 = 1428 - ac.field_m;
            if (var4 < 0) {
              var4 = 0;
            }
            qb.a(false, var4 * wc.field_Rb >> 8);
            fieldTemp$0 = wi.field_e;
            wi.field_e = wi.field_e - 1;
            if (0 >= fieldTemp$0) {
              qj.field_f = kh.a(63, false);
              wi.field_e = 20;
            }
          }
          if (ac.field_m <= 620) {
            if (150 >= ac.field_m) {
              return;
            }
            if (ac.field_m % 20 == 0) {
              if (!(0.7 > (double)i.field_V)) {
                return;
              }
              i.field_V = i.field_V + 0.10000000149011612f;
            }
          } else {
            if (i.field_V > 0.0f &&
              ac.field_m % 20 == 0) {
              i.field_V = i.field_V - 0.10000000149011612f;
            }
            if (0.0f > i.field_V) {
              i.field_V = 0.0f;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_53_0 = var3;
          stackIn_53_1 = new StringBuilder().append("s.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          stackIn_56_1 = ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',');
          if (param2 == null) {
            stackIn_57_2 = "null";
          } else {
            stackIn_57_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_56_1).append(stackIn_57_2).append(')').toString());
        }
    }

    public static void c(byte param0) {
        field_j = null;
        if (param0 <= -111) {
          return;
        }
        field_j = (vn) null;
    }

    final static String a(int param0, String param1, String[] param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_15_0 = null;
        String stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        String var7_ref_String = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var5Lifetime1;
        int var8Lifetime1;
        var11 = ZombieDawn.field_J;
        try {
          var3_int = param1.length();
          var4 = var3_int;
          var5 = 0;
          while (true) {
            var6_int = param1.indexOf("<%", var5);
            if (var6_int >= 0) {
              for (var5 = var6_int + 2; var3_int > var5; var5++) {
                if (bj.a(param1.charAt(var5), 78)) {
                  continue;
                }
                break;
              }
              var7_ref_String = param1.substring(var6_int + 2, var5);
              if (!sj.a((byte) 126, (CharSequence) ((Object) var7_ref_String))) {
                continue;
              }
              if (var5 >= var3_int) {
                continue;
              }
              if (param1.charAt(var5) != 62) {
                continue;
              }
              var5++;
              var8 = ra.a((CharSequence) ((Object) var7_ref_String), 122);
              var4 = var4 + (param2[var8].length() + (-var5 + var6_int));
              continue;
            }
            break;
          }
          var6 = new StringBuilder(var4);
          var7 = 0;
          var5Lifetime1 = 0;
          if (param0 != 1938762664) {
            stackIn_15_0 = (String) null;
            return stackIn_15_0;
          }
          while (true) {
            var8Lifetime1 = param1.indexOf("<%", var5Lifetime1);
            if (var8Lifetime1 < 0) {
              discarded$0 = var6.append(param1.substring(var7));
              stackIn_27_0 = var6.toString();
              return stackIn_27_0;
            }
            for (var5Lifetime1 = 2 + var8Lifetime1; var3_int > var5Lifetime1; var5Lifetime1++) {
              if (bj.a(param1.charAt(var5Lifetime1), param0 - 1938762567)) {
                continue;
              }
              break;
            }
            var9 = param1.substring(var8Lifetime1 + 2, var5Lifetime1);
            if (!sj.a((byte) 59, (CharSequence) ((Object) var9))) {
              continue;
            }
            if (var3_int <= var5Lifetime1) {
              continue;
            }
            if (param1.charAt(var5Lifetime1) != 62) {
              continue;
            }
            var5Lifetime1++;
            var10 = ra.a((CharSequence) ((Object) var9), param0 ^ 1938762718);
            discarded$1 = var6.append(param1.substring(var7, var8Lifetime1));
            discarded$2 = var6.append(param2[var10]);
            var7 = var5Lifetime1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("s.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    s(fb param0, int param1) {
        try {
          this.field_i = param1;
          this.field_h = param0;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "s.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
