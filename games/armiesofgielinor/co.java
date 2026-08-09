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
        int stackIn_16_0 = 0;
        int stackIn_34_0 = 0;
        int var4;
        int var5;
        int var6;
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
                            stackIn_34_0 = 1;
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
                  stackIn_34_0 = 0;
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
                            stackIn_16_0 = 1;
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
                  stackIn_16_0 = 0;
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
        int var3_int = 0;
        int var4 = 0;
        byte[] var5 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (null != this.field_o) {
              L1: {
                this.field_t = new sn[this.field_o.length];
                if (param0 == 17952) {
                  break L1;
                } else {
                  var5 = (byte[]) null;
                  co.a(102, -75, -58, (byte[]) null);
                  break L1;
                }
              }
              var3_int = 0;
              L2: while (true) {
                if (var3_int >= this.field_o.length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  this.field_t[var3_int] = param1.a(this.field_o[var3_int], (byte) -97, "");
                  var3_int++;
                  continue L2;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("co.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final sn b(int param0) {
        int var2 = 27 % ((50 - param0) / 33);
        return this.field_t[ns.a(false, this.field_t.length, li.field_n)];
    }

    public static void a(byte param0) {
        field_r = null;
        field_p = (int[][]) null;
        field_s = null;
        field_k = null;
        if (param0 >= -100) {
            co.a(true, 87, 46, 119);
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
        int incrementValue$1 = 0;
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        String stackIn_3_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var11 = new char[param1];
            var10 = var11;
            var4 = var10;
            var5 = 0;
            if (param2 <= -65) {
              var6 = 0;
              L1: while (true) {
                if (param1 <= var6) {
                  stackIn_17_0 = new String(var11, 0, var5);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var7 = 255 & param3[param0 + var6];
                    if (var7 != 0) {
                      L3: {
                        if (var7 < 128) {
                          break L3;
                        } else {
                          if (-161 >= (var7 ^ -1)) {
                            break L3;
                          } else {
                            L4: {
                              var8 = ou.field_a[-128 + var7];
                              if (var8 == 0) {
                                var8 = 63;
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            var7 = var8;
                            break L3;
                          }
                        }
                      }
                      incrementValue$1 = var5;
                      var5++;
                      var4[incrementValue$1] = (char)var7;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var6++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var4_ref);

            stackIn_20_1 = new StringBuilder().append("co.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_17_0;
        }
    }

    final void a(kl param0, int param1, kl param2) {
        try {
            ae.field_u = param2;
            fd.field_m = param0;
            if (param1 != 0) {
                this.field_a = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "co.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(p param0, kl param1, kl param2, int param3, ih param4) {
        if (null == this.field_l || param4 == null || param2 == null) {
            return;
        }
        this.field_n = um.a(param2, "", this.field_l);
        if (!(null != this.field_n)) {
            return;
        }
        try {
            param4.a(param0, param1, param3, this.field_n, (byte) 86);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "co.J(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(byte param0) {
        if (!(this.field_b == null)) {
            return;
        }
        this.field_w = lo.a(this.field_a, -28106, "basic", ae.field_u);
        this.field_m = lo.a(this.field_v, -28106, "basic", ae.field_u);
        this.field_g = lo.a(this.field_q, -28106, "basic", ae.field_u);
        this.field_u = fk.a(this.field_e, (byte) -128, ae.field_u, "basic");
        if (param0 > -63) {
            this.field_u = (wk[]) null;
            this.field_b = fk.a(this.field_c, (byte) -127, ae.field_u, "basic");
            return;
        }
        this.field_b = fk.a(this.field_c, (byte) -127, ae.field_u, "basic");
    }

    final void a(int param0) {
        this.field_b = null;
        this.field_m = null;
        this.field_u = null;
        if (param0 != 0) {
            field_k = (String[]) null;
            this.field_w = null;
            this.field_g = null;
            return;
        }
        this.field_w = null;
        this.field_g = null;
    }

    private final wk c(int param0) {
        if (param0 != 34) {
            return (wk) null;
        }
        byte[] var3 = fd.field_m.a(this.field_x, param0 ^ 108, "");
        byte[] var2 = var3;
        return new wk(var3, (java.awt.Component) ((Object) ll.p(0)));
    }

    static {
        field_p = new int[][]{new int[]{0, 26, 27, 28, 0, 0, 29}, new int[]{0, 30, 31, 32, 34, 34, 33}, new int[]{0, 39, 40, 41, 43, 43, 42}, new int[]{0, 44, 45, 46, 48, 48, 47}, new int[]{0, 35, 36, 37, 0, 0, 38}};
        field_k = new String[3];
        field_r = "<%0> must play 1 more rated game before playing with the current options.";
        field_s = "Requires <%0>";
        field_j = "Shortcut Reference";
    }
}
