/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class co {
    String field_c;
    wk[] field_b;
    String field_x;
    String field_a;
    static int[][] field_p;
    int field_d;
    static String[] field_k;
    ru[] field_m;
    ru[] field_w;
    static int field_h;
    static String field_r;
    static int field_f;
    int[] field_i;
    String field_e;
    ru[] field_g;
    wk[] field_u;
    static String field_j;
    String field_q;
    private sn[] field_t;
    static String field_s;
    String field_v;
    String[] field_o;
    String field_l;
    um field_n;

    final static boolean a(boolean param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_16_0 = 0;
        int stackIn_34_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_15_0 = 0;
        if (param0) {
          if (no.field_U[param2] < no.field_U[param1]) {
            return true;
          } else {
            if (no.field_U[param2] > no.field_U[param1]) {
              return false;
            } else {
              if (tb.field_h[param1] > tb.field_h[param2]) {
                return true;
              } else {
                L0: {
                  L1: {
                    if (tb.field_h[param1] < tb.field_h[param2]) {
                      break L1;
                    } else {
                      var4 = pe.field_s[param2] + wp.field_w[param2] - -ci.field_c[param2];
                      var5 = pe.field_s[param1] + (wp.field_w[param1] + ci.field_c[param1]);
                      if (var4 >= var5) {
                        if (var5 >= var4) {
                          var6 = -52 / ((47 - param3) / 35);
                          if (param1 <= param2) {
                            break L1;
                          } else {
                            stackOut_32_0 = 1;
                            stackIn_34_0 = stackOut_32_0;
                            break L0;
                          }
                        } else {
                          return false;
                        }
                      } else {
                        return true;
                      }
                    }
                  }
                  stackOut_33_0 = 0;
                  stackIn_34_0 = stackOut_33_0;
                  break L0;
                }
                return stackIn_34_0 != 0;
              }
            }
          }
        } else {
          if (tb.field_h[param1] <= tb.field_h[param2]) {
            if (tb.field_h[param2] <= tb.field_h[param1]) {
              if (no.field_U[param1] > no.field_U[param2]) {
                return true;
              } else {
                L2: {
                  L3: {
                    if (no.field_U[param1] < no.field_U[param2]) {
                      break L3;
                    } else {
                      var4 = pe.field_s[param2] + wp.field_w[param2] - -ci.field_c[param2];
                      var5 = pe.field_s[param1] + (wp.field_w[param1] + ci.field_c[param1]);
                      if (var4 >= var5) {
                        if (var5 >= var4) {
                          var6 = -52 / ((47 - param3) / 35);
                          if (param1 <= param2) {
                            break L3;
                          } else {
                            stackOut_14_0 = 1;
                            stackIn_16_0 = stackOut_14_0;
                            break L2;
                          }
                        } else {
                          return false;
                        }
                      } else {
                        return true;
                      }
                    }
                  }
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L2;
                }
                return stackIn_16_0 != 0;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        }
    }

    final void a(int param0, p param1) {
        int var3 = 0;
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (null == ((co) this).field_o) {
            return;
        }
        ((co) this).field_t = new sn[((co) this).field_o.length];
        if (param0 != 17952) {
            Object var5 = null;
            String discarded$0 = co.a(102, -75, -58, (byte[]) null);
            for (var3 = 0; var3 < ((co) this).field_o.length; var3++) {
                ((co) this).field_t[var3] = param1.a(((co) this).field_o[var3], (byte) -97, "");
            }
            return;
        }
        for (var3 = 0; var3 < ((co) this).field_o.length; var3++) {
            ((co) this).field_t[var3] = param1.a(((co) this).field_o[var3], (byte) -97, "");
        }
    }

    final sn b(int param0) {
        int var2 = 27 % ((50 - param0) / 33);
        return ((co) this).field_t[ns.a(false, ((co) this).field_t.length, li.field_n)];
    }

    public static void a(byte param0) {
        field_r = null;
        field_p = null;
        field_s = null;
        field_k = null;
        if (param0 >= -100) {
            boolean discarded$0 = co.a(true, 87, 46, 119);
            field_j = null;
            return;
        }
        field_j = null;
    }

    final wk c(byte param0) {
        int var2 = -68 / ((53 - param0) / 32);
        return this.c(34);
    }

    final static String a(int param0, int param1, int param2, byte[] param3) {
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        var11 = new char[param1];
        var10 = var11;
        var4 = var10;
        var5 = 0;
        if (param2 <= -65) {
          var6 = 0;
          L0: while (true) {
            if (param1 <= var6) {
              return new String(var11, 0, var5);
            } else {
              var7 = 255 & param3[param0 + var6];
              if (var7 != 0) {
                L1: {
                  if (var7 < 128) {
                    break L1;
                  } else {
                    if (-161 >= (var7 ^ -1)) {
                      break L1;
                    } else {
                      L2: {
                        var8 = ou.field_a[-128 + var7];
                        if (var8 == 0) {
                          var8 = 63;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      var7 = var8;
                      break L1;
                    }
                  }
                }
                var5++;
                var4[var5] = (char)var7;
                var6++;
                continue L0;
              } else {
                var6++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    final void a(kl param0, int param1, kl param2) {
        ae.field_u = param2;
        fd.field_m = param0;
        if (param1 != 0) {
            ((co) this).field_a = null;
        }
    }

    final void a(p param0, kl param1, kl param2, int param3, ih param4) {
        L0: {
          if (null == ((co) this).field_l) {
            break L0;
          } else {
            if (param4 == null) {
              break L0;
            } else {
              if (param2 != null) {
                ((co) this).field_n = um.a(param2, "", ((co) this).field_l);
                if (null == ((co) this).field_n) {
                  return;
                } else {
                  boolean discarded$2 = param4.a(param0, param1, param3, ((co) this).field_n, (byte) 86);
                  return;
                }
              } else {
                break L0;
              }
            }
          }
        }
    }

    final void b(byte param0) {
        if (!(((co) this).field_b == null)) {
            return;
        }
        ((co) this).field_w = lo.a(((co) this).field_a, -28106, "basic", ae.field_u);
        ((co) this).field_m = lo.a(((co) this).field_v, -28106, "basic", ae.field_u);
        ((co) this).field_g = lo.a(((co) this).field_q, -28106, "basic", ae.field_u);
        ((co) this).field_u = fk.a(((co) this).field_e, (byte) -128, ae.field_u, "basic");
        if (param0 > -63) {
            ((co) this).field_u = null;
            ((co) this).field_b = fk.a(((co) this).field_c, (byte) -127, ae.field_u, "basic");
            return;
        }
        ((co) this).field_b = fk.a(((co) this).field_c, (byte) -127, ae.field_u, "basic");
    }

    final void a(int param0) {
        ((co) this).field_b = null;
        ((co) this).field_m = null;
        ((co) this).field_u = null;
        if (param0 != 0) {
            field_k = null;
            ((co) this).field_w = null;
            ((co) this).field_g = null;
            return;
        }
        ((co) this).field_w = null;
        ((co) this).field_g = null;
    }

    private final wk c(int param0) {
        if (param0 != 34) {
            return null;
        }
        byte[] var3 = fd.field_m.a(((co) this).field_x, param0 ^ 108, "");
        byte[] var2 = var3;
        return new wk(var3, (java.awt.Component) (Object) ll.p(0));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new int[][]{new int[7], new int[7], new int[7], new int[7], new int[7]};
        field_k = new String[3];
        field_r = "<%0> must play 1 more rated game before playing with the current options.";
        field_s = "Requires <%0>";
        field_j = "Shortcut Reference";
    }
}
