/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma extends hl {
    int[] field_j;
    static uf field_l;
    boolean field_i;
    static int field_k;
    int field_m;

    public static void a(byte param0) {
        field_l = null;
    }

    final static void a(boolean param0, da param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        Object var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                var5 = null;
                ma.a(true, (da) null, -15);
                break L1;
              }
            }
            L2: {
              L3: {
                var3_int = jn.a(16, (byte) -96, param1);
                var4 = d.field_c[param2];
                if (var4 == -1) {
                  break L3;
                } else {
                  L4: {
                    if (var4 < var3_int) {
                      break L4;
                    } else {
                      if (var3_int == -1) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  ad.field_a = true;
                  break L2;
                }
              }
              d.field_c[param2] = var3_int;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("ma.A(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L5;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L5;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param2 + ')');
        }
    }

    final static boolean a(int[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var3 = HoldTheLine.field_D;
        try {
          L0: {
            if (param1 == -1) {
              var2_int = 0;
              L1: while (true) {
                if (var2_int >= param0.length) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  if (!lk.field_g[param0[var2_int]]) {
                    var2_int++;
                    continue L1;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0 != 0;
                  }
                }
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("ma.C(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ')');
        }
        return stackIn_11_0 != 0;
    }

    final static boolean a(int param0) {
        return ao.a(en.a(97), false);
    }

    final static void a(int param0, boolean param1) {
        int var3 = 0;
        var3 = HoldTheLine.field_D;
        if (pf.a((byte) 20, kn.b((byte) -49).field_p) != 0) {
          return;
        } else {
          L0: {
            eb.field_o = null;
            ii.field_c = 0;
            qd.a(20830, 3 - -cf.field_w);
            ek.field_x = 3;
            pe.field_g = new int[4];
            if (7 != mi.field_d) {
              L1: {
                if (1 == mi.field_d) {
                  break L1;
                } else {
                  if (wb.field_c) {
                    break L1;
                  } else {
                    em.field_o = false;
                    break L1;
                  }
                }
              }
              L2: {
                bn.a(1, -125);
                nm.field_b = kn.b((byte) -49);
                if (pd.a(nm.field_b, true)) {
                  bl.field_r = new sg(nm.field_b, mi.field_d, wb.field_c, em.field_o, t.field_l, ah.field_b);
                  break L2;
                } else {
                  sk.field_i = ah.field_b;
                  ca.field_r = mi.field_d;
                  bl.field_r = null;
                  on.field_r = t.field_l;
                  qn.field_k = em.field_o;
                  fl.field_j = wb.field_c;
                  break L2;
                }
              }
              kk.field_j = true;
              wm.a(param1, false, -1);
              break L0;
            } else {
              wb.field_c = false;
              kk.field_l = 4;
              t.field_j = new int[4];
              em.field_o = false;
              ah.field_b = -1;
              dk.field_g = 3;
              eg.field_a = vg.field_P;
              kk.field_m = new int[pc.field_l[cf.field_w]];
              ni.field_b = 859978912;
              hn.field_y = 0;
              nj.field_d = 1913842707 + ((1 & cf.field_w) << 1) - -((2 & cf.field_w) >> 1);
              tn.field_c = -1134004831;
              cm.field_a = -1329759026;
              t.field_l = go.field_g[kn.b((byte) -49).field_p][0];
              ij.a(param1, -79);
              ((ti) (Object) l.field_a[10]).field_t = 480.0f;
              break L0;
            }
          }
          return;
        }
    }

    ma() {
        ((ma) this).field_i = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = 1;
    }
}
