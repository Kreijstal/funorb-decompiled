/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk extends km {
    static mh field_r;
    static String field_u;
    static mh field_s;
    static vm field_t;

    public static void f(byte param0) {
        field_t = null;
        field_r = null;
        field_u = null;
        field_s = null;
        if (param0 == 88) {
            return;
        }
        uk.a((String) null, -65L, 54);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        int stackIn_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        cf.field_c[wi.field_m] = param2;
        fj.field_Pb[wi.field_m] = wi.field_m;
        ec.field_N[wi.field_m] = param0;
        if (param0 <= rn.field_l) {
          L0: {
            if (pe.field_u > param0) {
              ba.field_w = param0;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            lf.field_r[wi.field_m] = param5;
            ao.field_p[wi.field_m] = param1;
            ib.field_D[wi.field_m] = param4;
            var6 = param1 + param5 + param4;
            if (0 != var6) {
              stackOut_21_0 = 1000 * param5 / var6;
              stackIn_22_0 = stackOut_21_0;
              break L1;
            } else {
              stackOut_20_0 = 0;
              stackIn_22_0 = stackOut_20_0;
              break L1;
            }
          }
          var7 = stackIn_22_0;
          pj.field_b[wi.field_m] = var7;
          if (uf.field_b >= var7) {
            if (ba.field_w > var7) {
              ba.field_w = var7;
              wi.field_m = wi.field_m + 1;
              return;
            } else {
              wi.field_m = wi.field_m + 1;
              return;
            }
          } else {
            uf.field_b = var7;
            if (ba.field_w > var7) {
              ba.field_w = var7;
              wi.field_m = wi.field_m + 1;
              return;
            } else {
              wi.field_m = wi.field_m + 1;
              return;
            }
          }
        } else {
          L2: {
            uf.field_b = param0;
            if (pe.field_u > param0) {
              ba.field_w = param0;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            lf.field_r[wi.field_m] = param5;
            ao.field_p[wi.field_m] = param1;
            ib.field_D[wi.field_m] = param4;
            var6 = param1 + param5 + param4;
            if (0 != var6) {
              stackOut_6_0 = 1000 * param5 / var6;
              stackIn_7_0 = stackOut_6_0;
              break L3;
            } else {
              stackOut_5_0 = 0;
              stackIn_7_0 = stackOut_5_0;
              break L3;
            }
          }
          var7 = stackIn_7_0;
          pj.field_b[wi.field_m] = var7;
          if (uf.field_b >= var7) {
            if (ba.field_w > var7) {
              ba.field_w = var7;
              wi.field_m = wi.field_m + 1;
              return;
            } else {
              wi.field_m = wi.field_m + 1;
              return;
            }
          } else {
            uf.field_b = var7;
            if (ba.field_w <= var7) {
              wi.field_m = wi.field_m + 1;
              return;
            } else {
              ba.field_w = var7;
              wi.field_m = wi.field_m + 1;
              return;
            }
          }
        }
    }

    final static void a(String param0, long param1, int param2) {
        CharSequence var5 = null;
        try {
            ng.field_b = param2;
            tk.field_p = param0;
            var5 = (CharSequence) (Object) param0;
            kb.field_Qb = gb.a(var5, param2 ^ 103);
            qn.field_n = param1;
            ld.field_s = true;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "uk.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    uk() {
        super(11, 180, 460, 402, 0, new int[1]);
    }

    final void a(boolean param0, int param1, int param2) {
        Object var5 = null;
        if (param2 < 96) {
          var5 = null;
          StringBuilder discarded$2 = uk.a('3', (StringBuilder) null, 57, true);
          super.a(param0, param1, 103);
          return;
        } else {
          super.a(param0, param1, 103);
          return;
        }
    }

    final static StringBuilder a(char param0, StringBuilder param1, int param2, boolean param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        Object stackIn_3_0 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_6_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var4_int = param1.length();
            param1.setLength(param2);
            var5 = var4_int;
            if (!param3) {
              L1: while (true) {
                if (param2 <= var5) {
                  stackOut_6_0 = (StringBuilder) param1;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  param1.setCharAt(var5, param0);
                  var5++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (StringBuilder) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("uk.C(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_7_0;
    }

    final void b(byte param0) {
        super.b((byte) -50);
        im.a(550, 5, 243, 5, 140, (byte) -107, 45);
        int discarded$23 = nn.field_g.a(qn.field_p, 54, 149, 532, 225, 2, -1, 1, 1, 22);
        if (param0 >= -14) {
          return;
        } else {
          ((uk) this).a(0);
          return;
        }
    }

    final void b(boolean param0) {
        ((uk) this).e(2);
        if (param0) {
            return;
        }
        uk.f((byte) -66);
    }

    final int b(int param0, int param1) {
        if (param1 != 1) {
            uk.f((byte) 127);
            return ((uk) this).field_p;
        }
        return ((uk) this).field_p;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "Unpacking graphics";
    }
}
