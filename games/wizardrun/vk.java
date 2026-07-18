/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk extends wl {
    je field_v;
    static String field_o;
    static int field_r;
    int field_z;
    int field_E;
    int field_t;
    int field_j;
    int field_B;
    int field_D;
    uj field_w;
    int field_H;
    int field_k;
    int field_q;
    int field_K;
    q field_i;
    int field_y;
    int field_I;
    static String field_u;
    static vh field_p;
    static int field_l;
    static int field_G;
    int field_n;
    int field_m;
    int field_x;
    h field_C;
    int field_s;
    int field_F;

    final void a(int param0) {
        ((vk) this).field_C = null;
        ((vk) this).field_v = null;
        ((vk) this).field_i = null;
        if (param0 != 0) {
            return;
        }
        ((vk) this).field_w = null;
    }

    final static void a(byte param0) {
        L0: {
          ga.field_e = sl.field_q[qh.field_l];
          if (tl.field_e) {
            mi.field_D.a(true, -110, ga.field_e);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 >= -39) {
          String discarded$2 = vk.d((byte) 8);
          oc.field_b = ok.field_e[qh.field_l];
          lk.field_b = sg.field_b[qh.field_l];
          wg.field_e = bd.field_c[qh.field_l];
          return;
        } else {
          oc.field_b = ok.field_e[qh.field_l];
          lk.field_b = sg.field_b[qh.field_l];
          wg.field_e = bd.field_c[qh.field_l];
          return;
        }
    }

    final static String d(byte param0) {
        if (param0 <= -79) {
          if (d.field_a == null) {
            return "";
          } else {
            return d.field_a;
          }
        } else {
          vk.a(107, 125, 75, 15);
          if (d.field_a == null) {
            return "";
          } else {
            return d.field_a;
          }
        }
    }

    public static void b(boolean param0) {
        field_p = null;
        field_o = null;
        if (!param0) {
            vk.b(false);
            field_u = null;
            return;
        }
        field_u = null;
    }

    final static void a(byte[] param0, va param1, java.math.BigInteger param2, boolean param3, int param4, java.math.BigInteger param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var10 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              var7_int = me.a(param4, -68);
              if (l.field_N != null) {
                break L1;
              } else {
                l.field_N = new java.security.SecureRandom();
                break L1;
              }
            }
            var15 = new int[4];
            var14 = var15;
            var13 = var14;
            var12 = var13;
            var8 = var12;
            var9 = 0;
            L2: while (true) {
              if (var9 >= 4) {
                L3: {
                  L4: {
                    if (mk.field_a == null) {
                      break L4;
                    } else {
                      if (mk.field_a.field_k.length >= var7_int) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  mk.field_a = new va(var7_int);
                  break L3;
                }
                L5: {
                  L6: {
                    mk.field_a.field_m = 0;
                    mk.field_a.a(param0, 0, param4, 12);
                    mk.field_a.c(var7_int, 123);
                    mk.field_a.a(false, var15);
                    if (ud.field_b == null) {
                      break L6;
                    } else {
                      if (100 > ud.field_b.field_k.length) {
                        break L6;
                      } else {
                        break L5;
                      }
                    }
                  }
                  ud.field_b = new va(100);
                  break L5;
                }
                ud.field_b.field_m = 0;
                ud.field_b.b((byte) 11, 10);
                var11 = 0;
                var9 = var11;
                L7: while (true) {
                  if (4 <= var11) {
                    ud.field_b.b(-1947079288, param4);
                    ud.field_b.a(param2, 95, param5);
                    param1.a(ud.field_b.field_k, 0, ud.field_b.field_m, 13);
                    param1.a(mk.field_a.field_k, 0, mk.field_a.field_m, -116);
                    break L0;
                  } else {
                    ud.field_b.f(var15[var11], 613003928);
                    var11++;
                    continue L7;
                  }
                }
              } else {
                var8[var9] = l.field_N.nextInt();
                var9++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var7;
            stackOut_19_1 = new StringBuilder().append("vk.B(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          L9: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          L10: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L10;
            }
          }
          L11: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(true).append(',').append(param4).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param5 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L11;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L11;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + 0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        ge.field_b = param2;
        tc.field_i = param3;
        int var4 = -91 / ((param0 - 9) / 62);
        jl.field_s = param1;
    }

    vk() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Instructions";
        field_u = "Wizard Run";
    }
}
