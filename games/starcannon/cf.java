/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf extends qf {
    private boolean field_l;
    private vb field_o;
    static hl field_q;
    static String field_p;
    private String field_n;
    static String field_j;
    static String field_k;
    static String field_m;
    static boolean field_r;
    static String field_s;

    public static void f(int param0) {
        field_p = null;
        field_k = null;
        if (param0 != 1) {
            return;
        }
        field_j = null;
        field_s = null;
        field_q = null;
        field_m = null;
    }

    final static ig a(boolean param0, boolean param1) {
        ig var2 = null;
        ig stackIn_2_0 = null;
        ig stackIn_3_0 = null;
        ig stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        ig stackIn_6_0 = null;
        ig stackIn_7_0 = null;
        ig stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        ig stackOut_5_0 = null;
        ig stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        ig stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        ig stackOut_1_0 = null;
        ig stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        ig stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param1) {
          L0: {
            field_q = null;
            var2 = new ig(true);
            stackOut_5_0 = (ig) var2;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param0) {
              stackOut_7_0 = (ig) (Object) stackIn_7_0;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = (ig) (Object) stackIn_6_0;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          stackIn_8_0.field_g = stackIn_8_1 != 0;
          return var2;
        } else {
          L1: {
            var2 = new ig(true);
            stackOut_1_0 = (ig) var2;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param0) {
              stackOut_3_0 = (ig) (Object) stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = (ig) (Object) stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          stackIn_4_0.field_g = stackIn_4_1 != 0;
          return var2;
        }
    }

    cf(fe param0, fe param1) {
        super(param0);
        ((cf) this).field_l = false;
        ((cf) this).field_n = "";
        ((cf) this).field_o = new vb(param0, param1);
    }

    final p a(String param0, int param1) {
        qb var3 = null;
        Object var4 = null;
        p stackIn_8_0 = null;
        p stackIn_13_0 = null;
        p stackIn_23_0 = null;
        p stackIn_28_0 = null;
        p stackOut_27_0 = null;
        p stackOut_26_0 = null;
        p stackOut_22_0 = null;
        p stackOut_21_0 = null;
        p stackOut_12_0 = null;
        p stackOut_11_0 = null;
        p stackOut_7_0 = null;
        p stackOut_6_0 = null;
        if (param1 == -26188) {
          if (((cf) this).field_o.a(param0, param1 ^ 0) == sb.field_n) {
            return sb.field_n;
          } else {
            if (!param0.equals((Object) (Object) ((cf) this).field_n)) {
              var3 = ij.a(param0, (byte) -51);
              if (!var3.b(false)) {
                return cd.field_a;
              } else {
                L0: {
                  ((cf) this).field_n = param0;
                  ((cf) this).field_l = var3.b((byte) -72);
                  if (((cf) this).field_l) {
                    stackOut_27_0 = bf.field_x;
                    stackIn_28_0 = stackOut_27_0;
                    break L0;
                  } else {
                    stackOut_26_0 = sb.field_n;
                    stackIn_28_0 = stackOut_26_0;
                    break L0;
                  }
                }
                return stackIn_28_0;
              }
            } else {
              L1: {
                if (((cf) this).field_l) {
                  stackOut_22_0 = bf.field_x;
                  stackIn_23_0 = stackOut_22_0;
                  break L1;
                } else {
                  stackOut_21_0 = sb.field_n;
                  stackIn_23_0 = stackOut_21_0;
                  break L1;
                }
              }
              return stackIn_23_0;
            }
          }
        } else {
          var4 = null;
          p discarded$1 = ((cf) this).a((String) null, 74);
          if (((cf) this).field_o.a(param0, param1 ^ 0) == sb.field_n) {
            return sb.field_n;
          } else {
            if (!param0.equals((Object) (Object) ((cf) this).field_n)) {
              var3 = ij.a(param0, (byte) -51);
              if (!var3.b(false)) {
                return cd.field_a;
              } else {
                L2: {
                  ((cf) this).field_n = param0;
                  ((cf) this).field_l = var3.b((byte) -72);
                  if (((cf) this).field_l) {
                    stackOut_12_0 = bf.field_x;
                    stackIn_13_0 = stackOut_12_0;
                    break L2;
                  } else {
                    stackOut_11_0 = sb.field_n;
                    stackIn_13_0 = stackOut_11_0;
                    break L2;
                  }
                }
                return stackIn_13_0;
              }
            } else {
              L3: {
                if (((cf) this).field_l) {
                  stackOut_7_0 = bf.field_x;
                  stackIn_8_0 = stackOut_7_0;
                  break L3;
                } else {
                  stackOut_6_0 = sb.field_n;
                  stackIn_8_0 = stackOut_6_0;
                  break L3;
                }
              }
              return stackIn_8_0;
            }
          }
        }
    }

    final static void e(byte param0) {
        jh.field_c[4] = new int[1];
        if (param0 < -64) {
          L0: {
            fg.field_a[4] = new jl(4);
            ad.a(2, new int[4], true);
            fg.field_a[2] = new jl(2);
            if (0 >= u.field_d) {
              break L0;
            } else {
              if (!ha.a(100, nb.field_e)) {
                break L0;
              } else {
                ad.a(1, new int[7], true);
                fg.field_a[1] = new jl(1);
                if (u.field_d > 0) {
                  if (7 != lf.field_cb) {
                    return;
                  } else {
                    lf.field_cb = 0;
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
          if (u.field_d > 0) {
            if (7 != lf.field_cb) {
              return;
            } else {
              lf.field_cb = 0;
              return;
            }
          } else {
            return;
          }
        } else {
          field_s = null;
          fg.field_a[4] = new jl(4);
          ad.a(2, new int[4], true);
          fg.field_a[2] = new jl(2);
          if (0 < u.field_d) {
            if (ha.a(100, nb.field_e)) {
              ad.a(1, new int[7], true);
              fg.field_a[1] = new jl(1);
              if (u.field_d > 0) {
                if (7 != lf.field_cb) {
                  return;
                } else {
                  lf.field_cb = 0;
                  return;
                }
              } else {
                return;
              }
            } else {
              if (u.field_d > 0) {
                if (7 != lf.field_cb) {
                  return;
                } else {
                  lf.field_cb = 0;
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            if (u.field_d > 0) {
              if (7 != lf.field_cb) {
                return;
              } else {
                lf.field_cb = 0;
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final String a(String param0, boolean param1) {
        if (!param1) {
          if (((cf) this).field_o.a(param0, -26188) == sb.field_n) {
            return ((cf) this).field_o.a(param0, false);
          } else {
            if (((cf) this).a(param0, -26188) == sb.field_n) {
              return hi.field_e;
            } else {
              return wi.field_a;
            }
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Connection restored.";
        field_j = "Quit";
        field_k = "Difficulty - EASY";
        field_m = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_s = "That name is not available";
    }
}
