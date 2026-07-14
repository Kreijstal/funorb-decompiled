/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dn extends h {
    static mh field_K;
    private int field_H;
    static String field_J;
    private int field_O;
    private int field_G;
    private int field_I;
    static mh field_N;
    private boolean field_L;
    private boolean field_M;

    final boolean a(oc param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        L0: {
          var8 = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
          if (var8 == 0) {
            break L0;
          } else {
            if (((dn) this).field_M) {
              return true;
            } else {
              break L0;
            }
          }
        }
        if (!((dn) this).a(param5, param3, param2, param6 ^ 3, param1)) {
          return var8 != 0;
        } else {
          ((dn) this).field_n = param4;
          if (1 != param4) {
            return true;
          } else {
            ((dn) this).field_H = -param3 + (-((dn) this).field_w + param5);
            gd.field_c = (dn) this;
            ((dn) this).field_G = -param2 + -((dn) this).field_o + param1;
            return true;
          }
        }
    }

    final static void a(int param0, String param1, ml param2, int param3, dh param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = BrickABrac.field_J ? 1 : 0;
        int var5 = 0;
        int var6 = -1;
        if (param0 != 25293) {
            field_N = null;
        }
        for (var7 = 1; (var7 ^ -1) > (param1.length() ^ -1); var7++) {
            var8 = param1.charAt(var7);
            if (60 == var8) {
                var6 = param2.field_g[0] + (var5 >> 1459398344) + param4.c(param1.substring(0, var7));
            }
            if (-1 == var6) {
                if (!(32 != var8)) {
                    var5 = var5 + param3;
                }
                param2.field_g[var7] = (var5 >> -345125144) - (-param2.field_g[0] - param4.c(param1.substring(0, var7 + 1))) - param4.a((char) var8);
            } else {
                param2.field_g[var7] = var6;
            }
            if (!(var8 != 62)) {
                var6 = -1;
            }
        }
    }

    final void a(byte param0) {
        super.a((byte) -39);
        ((dn) this).field_E.a(((dn) this).field_s, 0, 0, (byte) -119, ((dn) this).field_t);
        if (param0 > -7) {
            um discarded$0 = dn.g(1);
        }
        ((dn) this).field_I = ((dn) this).field_o;
        ((dn) this).field_O = ((dn) this).field_w;
    }

    private dn(int param0, int param1, int param2, int param3, ub param4, uh param5, oc param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((dn) this).field_O = 2147483647;
        ((dn) this).field_I = 2147483647;
        ((dn) this).field_L = param7 ? true : false;
        ((dn) this).field_E = param6;
        ((dn) this).field_M = param8 ? true : false;
    }

    final void a(oc param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        Object stackOut_9_0;
        int stackOut_9_1;
        Object stackOut_11_0;
        int stackOut_11_1;
        Object stackOut_13_0;
        int stackOut_13_1;
        int stackOut_13_2;
        Object stackOut_12_0;
        int stackOut_12_1;
        int stackOut_12_2;
        Object stackOut_10_0;
        int stackOut_10_1;
        int stackOut_10_2;
        Object stackOut_17_0;
        int stackOut_17_1;
        Object stackOut_19_0;
        int stackOut_19_1;
        Object stackOut_21_0;
        int stackOut_21_1;
        int stackOut_21_2;
        Object stackOut_20_0;
        int stackOut_20_1;
        int stackOut_20_2;
        Object stackOut_18_0;
        int stackOut_18_1;
        int stackOut_18_2;
        L0: {
          L1: {
            L2: {
              L3: {
                if (!(((dn) this).field_E instanceof d)) {
                  break L3;
                } else {
                  if (!((d) (Object) ((dn) this).field_E).field_J) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (1 == ((dn) this).field_n) {
                L4: {
                  var5 = pq.field_k - ((dn) this).field_G - param2;
                  var6 = po.field_a + (-((dn) this).field_H - param3);
                  if (((dn) this).field_o != var5) {
                    break L4;
                  } else {
                    if (var6 != ((dn) this).field_w) {
                      break L4;
                    } else {
                      super.a(param0, param1, param2, param3);
                      break L0;
                    }
                  }
                }
                ((dn) this).field_w = var6;
                ((dn) this).field_o = var5;
                if (((dn) this).field_i instanceof li) {
                  ((li) (Object) ((dn) this).field_i).a((byte) -68, param3, param2, (dn) this);
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L2;
              }
            }
            if (((dn) this).field_L) {
              L5: {
                if ((((dn) this).field_o ^ -1) != (((dn) this).field_I ^ -1)) {
                  L6: {
                    var5 = ((dn) this).field_I - ((dn) this).field_o;
                    stackOut_9_0 = this;
                    stackOut_9_1 = ((dn) this).field_o;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    if (Math.abs(var5) <= 2) {
                      stackOut_11_0 = this;
                      stackOut_11_1 = stackIn_11_1;
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_13_1 = stackOut_11_1;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      if (-1 <= (var5 ^ -1)) {
                        stackOut_13_0 = this;
                        stackOut_13_1 = stackIn_13_1;
                        stackOut_13_2 = -1;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        stackIn_14_2 = stackOut_13_2;
                        break L6;
                      } else {
                        stackOut_12_0 = this;
                        stackOut_12_1 = stackIn_12_1;
                        stackOut_12_2 = 1;
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        stackIn_14_2 = stackOut_12_2;
                        break L6;
                      }
                    } else {
                      stackOut_10_0 = this;
                      stackOut_10_1 = stackIn_10_1;
                      stackOut_10_2 = var5 >> -1993788767;
                      stackIn_14_0 = stackOut_10_0;
                      stackIn_14_1 = stackOut_10_1;
                      stackIn_14_2 = stackOut_10_2;
                      break L6;
                    }
                  }
                  ((dn) this).field_o = stackIn_14_1 + stackIn_14_2;
                  break L5;
                } else {
                  break L5;
                }
              }
              if ((((dn) this).field_O ^ -1) != (((dn) this).field_w ^ -1)) {
                L7: {
                  var5 = ((dn) this).field_O - ((dn) this).field_w;
                  stackOut_17_0 = this;
                  stackOut_17_1 = ((dn) this).field_w;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  if (2 >= Math.abs(var5)) {
                    stackOut_19_0 = this;
                    stackOut_19_1 = stackIn_19_1;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_21_1 = stackOut_19_1;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    if ((var5 ^ -1) >= -1) {
                      stackOut_21_0 = this;
                      stackOut_21_1 = stackIn_21_1;
                      stackOut_21_2 = -1;
                      stackIn_22_0 = stackOut_21_0;
                      stackIn_22_1 = stackOut_21_1;
                      stackIn_22_2 = stackOut_21_2;
                      break L7;
                    } else {
                      stackOut_20_0 = this;
                      stackOut_20_1 = stackIn_20_1;
                      stackOut_20_2 = 1;
                      stackIn_22_0 = stackOut_20_0;
                      stackIn_22_1 = stackOut_20_1;
                      stackIn_22_2 = stackOut_20_2;
                      break L7;
                    }
                  } else {
                    stackOut_18_0 = this;
                    stackOut_18_1 = stackIn_18_1;
                    stackOut_18_2 = var5 >> 405685345;
                    stackIn_22_0 = stackOut_18_0;
                    stackIn_22_1 = stackOut_18_1;
                    stackIn_22_2 = stackOut_18_2;
                    break L7;
                  }
                }
                ((dn) this).field_w = stackIn_22_1 + stackIn_22_2;
                break L1;
              } else {
                break L1;
              }
            } else {
              break L1;
            }
          }
          super.a(param0, param1, param2, param3);
          break L0;
        }
    }

    public static void a(int param0) {
        field_J = null;
        if (param0 != 1) {
            um discarded$0 = dn.g(-43);
        }
        field_N = null;
        field_K = null;
    }

    final static um g(int param0) {
        if (param0 != -23009) {
            field_J = null;
        }
        if (ad.field_e == null) {
            ad.field_e = new um(og.field_Yb, 20, 0, 0, 0, 11579568, -1, 0, 0, og.field_Yb.field_F, -1, 2147483647, true);
        }
        return ad.field_e;
    }

    final void a(int param0, int param1, int param2, oc param3, int param4, int param5) {
        super.a(param0, param1, param2, param3, param4, param5);
        ((dn) this).field_n = 0;
    }

    final static void b(int param0, int param1, int param2) {
        int var3 = -51 / ((-23 - param1) / 62);
        pi var4 = k.field_h;
        var4.e(-13413, param2);
        var4.a(-100, 3);
        var4.a(-15, 10);
        var4.b((byte) 122, param0);
    }

    final StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        if (((dn) this).a(param3, 1595637992, param0, param1)) {
            ((dn) this).a(param1, param0, 0, param3);
            ((dn) this).a(param3, true, param1, param0);
            StringBuilder discarded$22 = param3.append(" revert=").append(((dn) this).field_L);
            if ((((dn) this).field_I ^ -1) != -2147483648) {
                if (!(-2147483648 == (((dn) this).field_O ^ -1))) {
                    StringBuilder discarded$23 = param3.append(" to ").append(((dn) this).field_I).append(44).append(((dn) this).field_O);
                }
            }
        }
        if (param2 != 24) {
            Object var6 = null;
            StringBuilder discarded$24 = ((dn) this).a(-94, (Hashtable) null, 17, (StringBuilder) null);
        }
        return param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "<%0> is already on your ignore list.";
    }
}
