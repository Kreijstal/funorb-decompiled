/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class vf extends r {
    static String field_n;
    static volatile int field_p;
    private boolean field_q;
    private String field_o;

    vf(c param0) {
        super(param0);
        ((vf) this).field_q = false;
    }

    final String a(byte param0, String param1) {
        mk var4_ref_mk = null;
        CharSequence var5 = (CharSequence) (Object) param1;
        String var3 = q.a(var5, true);
        if (!(var3 == null)) {
            return var3;
        }
        if (!(param1.equals((Object) (Object) ((vf) this).field_o))) {
            var4_ref_mk = jd.a(param1, 8947848);
            if (var4_ref_mk == null) {
                return null;
            }
            if (null != var4_ref_mk.field_b) {
                return null;
            }
            ((vf) this).field_q = var4_ref_mk.field_k;
            ((vf) this).field_o = param1;
        }
        int var4 = 47 % ((24 - param0) / 46);
        if (!((vf) this).field_q) {
            return de.field_o;
        }
        return lf.field_c;
    }

    final static boolean c(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -5) {
            break L0;
          } else {
            boolean discarded$2 = vf.c((byte) -24);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == mg.field_a) {
              break L2;
            } else {
              if (null == mg.field_a.l(-63)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static int a(int param0, byte param1, CharSequence param2) {
        if (param1 <= 38) {
            Object var4 = null;
            int discarded$0 = vf.a(-32, (byte) -88, (CharSequence) null);
        }
        return jc.a(param0, 119, true, param2);
    }

    final static void e(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int stackIn_7_0 = 0;
        String[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        String[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        String[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        String stackIn_10_2 = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        String[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        String[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        String stackOut_9_2 = null;
        String[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        String stackOut_8_2 = null;
        L0: {
          var3 = fleas.field_A ? 1 : 0;
          rh.field_c.field_z = new String[wj.field_c[fleas.field_E].length];
          rh.field_c.field_t = new boolean[rh.field_c.field_z.length];
          if (param0 == -6359) {
            break L0;
          } else {
            vf.c(true);
            break L0;
          }
        }
        var1 = 0;
        L1: while (true) {
          if (var1 >= rh.field_c.field_t.length) {
            rh.field_c.field_x = 0;
            rh.field_c.field_S = 0;
            ll.d(336);
            return;
          } else {
            L2: {
              if (hj.field_a[fleas.field_E] < var1) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var2 = stackIn_7_0;
              stackOut_7_0 = rh.field_c.field_z;
              stackOut_7_1 = var1;
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              if (var2 != 0) {
                stackOut_9_0 = (String[]) (Object) stackIn_9_0;
                stackOut_9_1 = stackIn_9_1;
                stackOut_9_2 = wj.field_c[fleas.field_E][var1];
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                stackIn_10_2 = stackOut_9_2;
                break L3;
              } else {
                stackOut_8_0 = (String[]) (Object) stackIn_8_0;
                stackOut_8_1 = stackIn_8_1;
                stackOut_8_2 = ik.field_C;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_10_2 = stackOut_8_2;
                break L3;
              }
            }
            L4: {
              stackIn_10_0[stackIn_10_1] = stackIn_10_2;
              if (0 != fleas.field_E) {
                break L4;
              } else {
                if (-16 < (var1 ^ -1)) {
                  break L4;
                } else {
                  L5: {
                    if (qh.c((byte) 107)) {
                      break L5;
                    } else {
                      if (0 < wc.field_q) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  rh.field_c.field_z[var1] = nb.field_e;
                  var2 = 0;
                  break L4;
                }
              }
            }
            rh.field_c.field_t[var1] = var2 != 0;
            var1++;
            continue L1;
          }
        }
    }

    public static void c(boolean param0) {
        field_n = null;
        if (param0) {
            field_p = 114;
        }
    }

    final void d(boolean param0) {
        if (!param0) {
            vf.c(false);
        }
        ((vf) this).field_o = null;
    }

    final wd a(int param0, String param1) {
        mk var3 = null;
        CharSequence var4 = null;
        wd stackIn_15_0 = null;
        wd stackOut_14_0 = null;
        wd stackOut_13_0 = null;
        L0: {
          if (param0 == 160) {
            break L0;
          } else {
            ((vf) this).field_q = true;
            break L0;
          }
        }
        var4 = (CharSequence) (Object) param1;
        if (!ud.a(1560, var4)) {
          return ml.field_K;
        } else {
          L1: {
            if (!param1.equals((Object) (Object) ((vf) this).field_o)) {
              L2: {
                var3 = jd.a(param1, 8947848);
                if (var3 == null) {
                  break L2;
                } else {
                  if (null == var3.field_b) {
                    ((vf) this).field_q = var3.field_k;
                    ((vf) this).field_o = param1;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              return w.field_e;
            } else {
              break L1;
            }
          }
          L3: {
            if (((vf) this).field_q) {
              stackOut_14_0 = hm.field_b;
              stackIn_15_0 = stackOut_14_0;
              break L3;
            } else {
              stackOut_13_0 = ml.field_K;
              stackIn_15_0 = stackOut_13_0;
              break L3;
            }
          }
          return stackIn_15_0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = -1;
        field_n = "Loading sound effects";
    }
}
