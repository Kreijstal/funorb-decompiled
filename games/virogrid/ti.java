/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti implements ol {
    private int field_f;
    static String field_a;
    static e field_g;
    private int field_e;
    static String field_c;
    static km field_h;
    static kf field_i;
    private e field_d;
    static int field_b;

    public static void b() {
        field_i = null;
        int var1 = 0;
        field_h = null;
        field_g = null;
        field_c = null;
        field_a = null;
    }

    final static void c(int param0) {
        l.field_c = new p();
        int var1 = -112 / ((-57 - param0) / 39);
    }

    final static String a() {
        int var1 = 0;
        return sh.field_qb.h(-121);
    }

    final static void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Virogrid.field_F ? 1 : 0;
        if (bn.field_d > 0) {
          if (null != kk.field_q) {
            L0: {
              ih.field_b = kk.field_q.a(11);
              rj.a(2, (byte) -92);
              if (null != ih.field_b) {
                var2 = 2;
                nn.a((java.awt.Canvas) (Object) ih.field_b, (byte) -54);
                break L0;
              } else {
                var2 = 3;
                break L0;
              }
            }
            L1: {
              if (kk.field_q != null) {
                break L1;
              } else {
                if (!ia.field_c) {
                  break L1;
                } else {
                  nm.a(param0, var2, (byte) 33);
                  return;
                }
              }
            }
            return;
          } else {
            L2: {
              ih.field_b = wm.a(640, 0, 480, 0, 5416, ei.field_c);
              if (null != ih.field_b) {
                var2 = 2;
                nn.a((java.awt.Canvas) (Object) ih.field_b, (byte) -54);
                break L2;
              } else {
                var2 = 3;
                break L2;
              }
            }
            L3: {
              if (kk.field_q != null) {
                break L3;
              } else {
                if (!ia.field_c) {
                  break L3;
                } else {
                  nm.a(param0, var2, (byte) 33);
                  return;
                }
              }
            }
            return;
          }
        } else {
          if (qm.i(20)) {
            L4: {
              var2 = 0;
              if (kk.field_q != null) {
                break L4;
              } else {
                if (!ia.field_c) {
                  break L4;
                } else {
                  nm.a(param0, var2, (byte) 33);
                  return;
                }
              }
            }
            return;
          } else {
            var2 = 1;
            if (kk.field_q == null) {
              if (ia.field_c) {
                nm.a(param0, var2, (byte) 33);
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    public final void a(int param0, fi param1, boolean param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var11 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param1.field_p) {
                  break L2;
                } else {
                  if (param1.f(true)) {
                    break L2;
                  } else {
                    stackOut_3_0 = 2188450;
                    stackIn_5_0 = stackOut_3_0;
                    break L1;
                  }
                }
              }
              stackOut_4_0 = 3249872;
              stackIn_5_0 = stackOut_4_0;
              break L1;
            }
            var6_int = stackIn_5_0;
            if (param4 == -23294) {
              L3: {
                int discarded$1 = ((ti) this).field_d.a("<u=" + Integer.toString(var6_int, 16) + ">" + param1.field_n + "</u>", param0 - -param1.field_l, param1.field_u + param3, param1.field_g, param1.field_m, var6_int, -1, ((ti) this).field_e, ((ti) this).field_f, ((ti) this).field_d.field_H + ((ti) this).field_d.field_G);
                if (!param1.f(true)) {
                  break L3;
                } else {
                  L4: {
                    var7 = ((ti) this).field_d.a(param1.field_n);
                    var8 = ((ti) this).field_d.field_G + ((ti) this).field_d.field_H;
                    var9 = param0 - -param1.field_l;
                    var10 = param3 - -param1.field_u;
                    if (((ti) this).field_e != 2) {
                      if (((ti) this).field_e == 1) {
                        var9 = var9 + (param1.field_g + -var7 >> 1);
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      var9 = var9 + (param1.field_g + -var7);
                      break L4;
                    }
                  }
                  L5: {
                    if (((ti) this).field_f == 2) {
                      var10 = var10 + (-var8 + param1.field_m);
                      break L5;
                    } else {
                      if (((ti) this).field_f == 1) {
                        var10 = var10 + (param1.field_m - var8 >> 1);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                  b.a(2 + var10, (byte) 58, -2 + var9, var7 - -4, var8);
                  break L3;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var6;
            stackOut_20_1 = new StringBuilder().append("ti.E(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public ti() {
        ((ti) this).field_d = dj.field_h;
        ((ti) this).field_f = 1;
        ((ti) this).field_e = 1;
    }

    ti(e param0, int param1, int param2) {
        try {
            ((ti) this).field_e = param1;
            ((ti) this).field_d = param0;
            ((ti) this).field_f = param2;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "ti.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Names should contain a maximum of 12 characters";
        field_c = "You have declined the invitation.";
    }
}
