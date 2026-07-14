/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg extends mf {
    private boolean field_j;
    private String field_i;
    static pm[] field_k;
    static int field_h;

    final String a(String param0, boolean param1) {
        String var3 = null;
        in var4 = null;
        CharSequence var5 = null;
        var5 = (CharSequence) (Object) param0;
        var3 = hc.a(-24682, var5);
        if (var3 == null) {
          L0: {
            if (!param0.equals((Object) (Object) ((qg) this).field_i)) {
              var4 = c.a(param0, 78);
              if (var4 != null) {
                if (var4.field_f == null) {
                  ((qg) this).field_i = param0;
                  ((qg) this).field_j = var4.field_a;
                  break L0;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          if (!((qg) this).field_j) {
            return fh.field_c;
          } else {
            if (!param1) {
              ((qg) this).field_i = null;
              return th.field_fb;
            } else {
              return th.field_fb;
            }
          }
        } else {
          return var3;
        }
    }

    qg(ul param0) {
        super(param0);
        ((qg) this).field_j = false;
    }

    public static void f(int param0) {
        if (param0 > -66) {
            return;
        }
        field_k = null;
    }

    final static void a(double param0, int param1, double[] param2, double param3, vg param4, dj param5, int param6) {
        double var9 = param2[9] * param5.field_C + param5.field_E;
        double var11 = param5.field_C * param2[10] + param5.field_t;
        double var13 = param5.field_D + param5.field_C * param2[11];
        double var15 = 0.4 * param3;
        pa.a(var9, var15, (byte) -11, param6, var13, var11, cd.field_o[(param1 & 15) >> 639775169], param0, param4);
    }

    final void e(int param0) {
        ((qg) this).field_i = null;
        if (param0 != 639775169) {
            Object var3 = null;
            qg.a(0.5264573121586292, 97, (double[]) null, -2.3170663679572066, (vg) null, (dj) null, -93);
        }
    }

    final fi a(byte param0, String param1) {
        in var3 = null;
        Object var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        fi stackIn_11_0 = null;
        fi stackIn_17_0 = null;
        fi stackIn_28_0 = null;
        fi stackIn_34_0 = null;
        fi stackOut_27_0 = null;
        fi stackOut_26_0 = null;
        fi stackOut_33_0 = null;
        fi stackOut_32_0 = null;
        fi stackOut_10_0 = null;
        fi stackOut_9_0 = null;
        fi stackOut_16_0 = null;
        fi stackOut_15_0 = null;
        if (param0 <= -44) {
          var6 = (CharSequence) (Object) param1;
          if (lc.a(var6, 13684)) {
            if (!param1.equals((Object) (Object) ((qg) this).field_i)) {
              var3 = c.a(param1, 117);
              if (var3 != null) {
                if (var3.field_f != null) {
                  return qh.field_x;
                } else {
                  L0: {
                    ((qg) this).field_j = var3.field_a;
                    ((qg) this).field_i = param1;
                    if (((qg) this).field_j) {
                      stackOut_27_0 = nn.field_q;
                      stackIn_28_0 = stackOut_27_0;
                      break L0;
                    } else {
                      stackOut_26_0 = fb.field_e;
                      stackIn_28_0 = stackOut_26_0;
                      break L0;
                    }
                  }
                  return stackIn_28_0;
                }
              } else {
                return qh.field_x;
              }
            } else {
              L1: {
                if (((qg) this).field_j) {
                  stackOut_33_0 = nn.field_q;
                  stackIn_34_0 = stackOut_33_0;
                  break L1;
                } else {
                  stackOut_32_0 = fb.field_e;
                  stackIn_34_0 = stackOut_32_0;
                  break L1;
                }
              }
              return stackIn_34_0;
            }
          } else {
            return fb.field_e;
          }
        } else {
          var4 = null;
          qg.a(0.033002690553074567, -88, (double[]) null, 1.6640993038654757, (vg) null, (dj) null, -56);
          var5 = (CharSequence) (Object) param1;
          if (lc.a(var5, 13684)) {
            if (!param1.equals((Object) (Object) ((qg) this).field_i)) {
              var3 = c.a(param1, 117);
              if (var3 != null) {
                if (var3.field_f != null) {
                  return qh.field_x;
                } else {
                  L2: {
                    ((qg) this).field_j = var3.field_a;
                    ((qg) this).field_i = param1;
                    if (((qg) this).field_j) {
                      stackOut_10_0 = nn.field_q;
                      stackIn_11_0 = stackOut_10_0;
                      break L2;
                    } else {
                      stackOut_9_0 = fb.field_e;
                      stackIn_11_0 = stackOut_9_0;
                      break L2;
                    }
                  }
                  return stackIn_11_0;
                }
              } else {
                return qh.field_x;
              }
            } else {
              L3: {
                if (((qg) this).field_j) {
                  stackOut_16_0 = nn.field_q;
                  stackIn_17_0 = stackOut_16_0;
                  break L3;
                } else {
                  stackOut_15_0 = fb.field_e;
                  stackIn_17_0 = stackOut_15_0;
                  break L3;
                }
              }
              return stackIn_17_0;
            }
          } else {
            return fb.field_e;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new pm[5];
    }
}
