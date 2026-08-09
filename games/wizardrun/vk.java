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
        this.field_C = null;
        this.field_v = null;
        this.field_i = null;
        if (param0 != 0) {
            return;
        }
        this.field_w = null;
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
          vk.d((byte) 8);
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
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
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
            L2: {
              if (param3) {
                break L2;
              } else {
                vk.d((byte) -27);
                break L2;
              }
            }
            var13 = new int[4];
            var12 = var13;
            var8 = var12;
            var9 = 0;
            L3: while (true) {
              if (-5 >= (var9 ^ -1)) {
                L4: {
                  L5: {
                    if (mk.field_a == null) {
                      break L5;
                    } else {
                      if (mk.field_a.field_k.length >= var7_int) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  mk.field_a = new va(var7_int);
                  break L4;
                }
                L6: {
                  L7: {
                    mk.field_a.field_m = 0;
                    mk.field_a.a(param0, param6, param4, 12);
                    mk.field_a.c(var7_int, 123);
                    mk.field_a.a(false, var13);
                    if (ud.field_b == null) {
                      break L7;
                    } else {
                      if (100 > ud.field_b.field_k.length) {
                        break L7;
                      } else {
                        break L6;
                      }
                    }
                  }
                  ud.field_b = new va(100);
                  break L6;
                }
                ud.field_b.field_m = 0;
                ud.field_b.b((byte) 11, 10);
                var11 = 0;
                var9 = var11;
                L8: while (true) {
                  if (4 <= var11) {
                    ud.field_b.b(-1947079288, param4);
                    ud.field_b.a(param2, 95, param5);
                    param1.a(ud.field_b.field_k, 0, ud.field_b.field_m, 13);
                    param1.a(mk.field_a.field_k, 0, mk.field_a.field_m, -116);
                    break L0;
                  } else {
                    ud.field_b.f(var13[var11], 613003928);
                    var11++;
                    continue L8;
                  }
                }
              } else {
                var8[var9] = l.field_N.nextInt();
                var9++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var7);

            stackIn_23_1 = new StringBuilder().append("vk.B(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L9;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L10;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L11;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L12;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L12;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_24_0), stackIn_33_2 + ',' + param6 + ')');
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
        field_o = "Instructions";
        field_u = "Wizard Run";
    }
}
