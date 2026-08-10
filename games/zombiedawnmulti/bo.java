/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bo {
    private String field_f;
    static th field_a;
    static String field_c;
    static ul field_b;
    static boolean field_e;
    static int field_d;

    final static af[] a(int param0, ga param1) {
        af[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        af[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        af var6_ref_af = null;
        int var7 = 0;
        byte[] var8 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var2_int = param1.h(8, 14862);
            if (0 >= var2_int) {
              L1: {
                if (param0 == 30816) {
                  break L1;
                } else {
                  var8 = (byte[]) null;
                  bo.a((byte[]) null, 106);
                  break L1;
                }
              }
              var3 = param1.h(12, 14862);
              var4 = new af[var3];
              var5 = 0;
              L2: while (true) {
                if (var5 >= var3) {
                  stackIn_13_0 = (af[]) (var4);
                  break L0;
                } else {
                  L3: {
                    if (!fq.a(68, param1)) {
                      var6 = param1.h(dq.b(-1 + var5, param0 + -30800), param0 ^ 17006);
                      var4[var5] = var4[var6];
                      break L3;
                    } else {
                      var6_ref_af = new af();
                      param1.h(24, 14862);
                      param1.h(24, 14862);
                      var6_ref_af.field_f = param1.h(24, 14862);
                      param1.h(9, param0 ^ 17006);
                      param1.h(12, 14862);
                      param1.h(12, 14862);
                      param1.h(12, 14862);
                      var4[var5] = var6_ref_af;
                      break L3;
                    }
                  }
                  var5++;
                  continue L2;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2);

            stackIn_16_1 = new StringBuilder().append("bo.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        return stackIn_13_0;
    }

    final void a(int param0, java.applet.Applet param1) {
        try {
            dc.a(31536000L, param1, "jagex-last-login-method", -120, this.field_f);
            if (param0 > -63) {
                field_e = false;
            }
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "bo.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, String[] param3, int param4, java.applet.Applet param5) {
        String var6 = null;
        int var8 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              ql.field_e = param5.getParameter("overxgames");
              if (ql.field_e != null) {
                break L1;
              } else {
                ql.field_e = "0";
                break L1;
              }
            }
            L2: {
              eo.field_b = param5.getParameter("overxachievements");
              if (eo.field_b == null) {
                eo.field_b = "0";
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var6 = param5.getParameter("currency");
              if (var6 == null) {
                hj.field_f = 2;
                break L3;
              } else {
                if (!ti.a((byte) -120, (CharSequence) ((Object) var6))) {
                  hj.field_f = 2;
                  break L3;
                } else {
                  hj.field_f = md.a((CharSequence) ((Object) var6), param2 ^ -9159);
                  break L3;
                }
              }
            }
            hk.field_e = param0;
            pf.field_c = param4;
            gg.field_c = param1;
            ao.field_h = new ja[param3.length];
            var7 = param2;
            L4: while (true) {
              if (var7 >= param3.length) {
                nj.field_a = param3;
                break L0;
              } else {
                ao.field_h[var7] = new ja(317, 34);
                var7++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var6_ref);

            stackIn_18_1 = new StringBuilder().append("bo.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_19_0), stackIn_22_2 + ')');
        }
    }

    final static void b(int param0) {
        sp.c(param0 + -4);
        fb.a(param0, 65);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 6) {
            bo.a(-72);
        }
        field_c = null;
    }

    final static bm a(byte[] param0, int param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        bm stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        byte[] var8 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 24) {
                break L1;
              } else {
                field_a = (th) null;
                break L1;
              }
            }
            var2_int = 0;
            var8 = new byte[param0.length - -24];
            var7 = var8;
            var3 = var7;
            var2_int = 0;
            L2: while (true) {
              if (-5 >= (var2_int ^ -1)) {
                incrementValue$0 = var2_int;
                var2_int++;
                var4 = re.a(param0, incrementValue$0, (byte) 97);
                incrementValue$1 = var2_int;
                var2_int++;
                var5 = re.a(param0, incrementValue$1, (byte) 78);
                br.a(4, var8, -116, var4);
                br.a(5, var8, -88, var5);
                br.a(6, var8, -74, var4);
                br.a(7, var8, -79, var5);
                br.a(8, var8, -91, var4);
                br.a(9, var8, param1 ^ -88, var5);
                br.a(10, var8, -111, var4);
                br.a(11, var8, -85, var5);
                var2_int = 6;
                L3: while (true) {
                  if (param0.length / 4 <= var2_int) {
                    stackIn_10_0 = no.a((byte) 104, var8);
                    break L0;
                  } else {
                    br.a(6 + var2_int, var3, -111, re.a(param0, var2_int, (byte) 112));
                    var2_int++;
                    continue L3;
                  }
                }
              } else {
                br.a(var2_int, var3, -85, re.a(param0, var2_int, (byte) 112));
                var2_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2);

            stackIn_13_1 = new StringBuilder().append("bo.E(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_10_0;
    }

    final boolean a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 89 % ((param1 - 10) / 32);
            stackIn_1_0 = this.field_f.equals(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("bo.C(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    bo(String param0) {
        try {
            this.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "bo.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "RATING";
        field_a = new th();
        field_e = true;
        field_d = 0;
    }
}
