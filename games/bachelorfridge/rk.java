/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class rk extends bw {
    int[] field_m;
    Random field_p;
    eaa field_h;
    wca field_o;
    int field_q;
    private int[] field_j;
    String field_n;
    private int field_l;
    int[] field_k;
    int field_f;
    static String field_r;
    boolean[] field_g;
    int field_i;

    final boolean a(int param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        L0: {
          var6 = BachelorFridge.field_y;
          if (param1 == 9) {
            break L0;
          } else {
            ((rk) this).field_f = -95;
            break L0;
          }
        }
        var7 = ((rk) this).field_m;
        var3 = var7;
        var4 = 0;
        L1: while (true) {
          if (var7.length <= var4) {
            return false;
          } else {
            var5 = var7[var4];
            if (-1 != var5) {
              if (param0 == ((rk) this).field_o.field_g.field_b[var5]) {
                return true;
              } else {
                var4++;
                continue L1;
              }
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final boolean a(int param0, int param1, int[] param2) {
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        var7 = BachelorFridge.field_y;
        var8 = param2;
        var4 = var8;
        var5 = param1;
        L0: while (true) {
          if (var8.length <= var5) {
            return false;
          } else {
            var6 = var8[var5];
            if ((var6 ^ -1) != 0) {
              if (((rk) this).field_o.field_g.field_b[var6] == param0) {
                return true;
              } else {
                var5++;
                continue L0;
              }
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    final boolean b(int param0, int param1) {
        int var4 = BachelorFridge.field_y;
        ho var3 = (ho) (Object) ((rk) this).field_h.b((byte) 90);
        while (var3 != null) {
            if (param1 == var3.field_i) {
                return true;
            }
            var3 = (ho) (Object) ((rk) this).field_h.c(0);
        }
        if (param0 != 8) {
            ((rk) this).field_p = null;
            return false;
        }
        return false;
    }

    final void a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        if (0 >= param1) {
          var3 = 88 / ((-81 - param0) / 38);
          var4 = 0;
          L0: while (true) {
            if (((rk) this).field_m.length <= var4) {
              return;
            } else {
              if ((((rk) this).field_m[var4] ^ -1) <= -7) {
                ((rk) this).field_m[var4] = -1;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final int c(int param0, int param1) {
        t var3 = null;
        L0: {
          if (param0 == 87) {
            break L0;
          } else {
            ((rk) this).field_g = null;
            break L0;
          }
        }
        var3 = (t) (Object) al.a(-104, param1);
        if (var3.field_p == 4) {
          if (!((rk) this).a(36, param0 + -78)) {
            if (((rk) this).a(35, 9)) {
              return ((a) (Object) al.a(param0 ^ 12, 35)).field_r;
            } else {
              if (!((rk) this).a(34, 9)) {
                return var3.field_t;
              } else {
                return ((a) (Object) al.a(-42, 34)).field_r;
              }
            }
          } else {
            return ((a) (Object) al.a(87, 36)).field_r;
          }
        } else {
          return var3.field_t;
        }
    }

    void a(byte param0, lu param1) {
        ho var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        L0: {
          var6 = BachelorFridge.field_y;
          param1.d(((rk) this).field_o.field_b, 0);
          param1.e((int)((rk) this).field_c, -1615464796);
          param1.d(0, 0);
          var3 = (ho) (Object) ((rk) this).field_h.b((byte) 90);
          if (param0 < -21) {
            break L0;
          } else {
            var7 = null;
            break L0;
          }
        }
        param1.d(((rk) this).field_h.g(0), 0);
        L1: while (true) {
          if (var3 == null) {
            var4 = 1;
            var5 = 0;
            L2: while (true) {
              if (var5 >= 13) {
                param1.c(-1607631824, var4);
                var8 = 0;
                var5 = var8;
                L3: while (true) {
                  if (var8 >= 5) {
                    return;
                  } else {
                    param1.b(((rk) this).field_m[var8], -124);
                    var8++;
                    continue L3;
                  }
                }
              } else {
                if (((rk) this).field_g[var5]) {
                  var4 = var4 | 1 << var5 - -1;
                  var5++;
                  continue L2;
                } else {
                  var5++;
                  continue L2;
                }
              }
            }
          } else {
            param1.d(var3.field_h.field_b, 0);
            param1.d(var3.field_i, 0);
            var3 = (ho) (Object) ((rk) this).field_h.c(0);
            continue L1;
          }
        }
    }

    final double a(oha param0, int param1) {
        if (-2 != (param0.field_a ^ -1)) {
            return 1.0;
        }
        if (param1 != -5313) {
            rk.c((byte) 75);
        }
        t var3 = (t) (Object) param0;
        int var4 = !var3.c(27863) ? 2 : 3;
        return it.field_c[((rk) this).field_k[var4]] / 100.0;
    }

    final static pp a(int param0, lu param1) {
        nq var2 = qi.a(param1, (byte) 104);
        if (param0 != 1) {
            field_r = null;
        }
        int var3 = param1.b(16711935);
        return (pp) (Object) new rla(var2, var3);
    }

    rk(rk param0) {
        this(param0.field_o);
        ho var2 = null;
        int var3 = 0;
        int var5 = 0;
        ((rk) this).field_n = param0.field_n;
        ((rk) this).field_q = param0.field_q;
        ((rk) this).field_h = new eaa();
        var2 = (ho) (Object) param0.field_h.b((byte) 90);
        L0: while (true) {
          if (var2 == null) {
            bl.a(param0.field_g, 0, ((rk) this).field_g, 0, ((rk) this).field_g.length);
            ((rk) this).field_j = new int[param0.field_j.length];
            var3 = 0;
            L1: while (true) {
              if (((rk) this).field_j.length <= var3) {
                ((rk) this).field_m = new int[5];
                var5 = 0;
                var3 = var5;
                L2: while (true) {
                  if (var5 >= ((rk) this).field_m.length) {
                    L3: {
                      if (!((rk) this).a(84, 0, ((rk) this).field_m)) {
                        break L3;
                      } else {
                        ((rk) this).field_k[0] = ((rk) this).field_k[0] + 1;
                        break L3;
                      }
                    }
                    L4: {
                      if (!((rk) this).a(85, 0, ((rk) this).field_m)) {
                        break L4;
                      } else {
                        ((rk) this).field_k[1] = ((rk) this).field_k[1] + 1;
                        break L4;
                      }
                    }
                    L5: {
                      if (!((rk) this).a(86, 0, ((rk) this).field_m)) {
                        break L5;
                      } else {
                        ((rk) this).field_k[2] = ((rk) this).field_k[2] + 1;
                        break L5;
                      }
                    }
                    L6: {
                      if (!((rk) this).a(87, 0, ((rk) this).field_m)) {
                        break L6;
                      } else {
                        ((rk) this).field_k[3] = ((rk) this).field_k[3] + 1;
                        break L6;
                      }
                    }
                    int discarded$1 = this.a(0);
                  } else {
                    ((rk) this).field_m[var5] = param0.field_m[var5];
                    var5++;
                    continue L2;
                  }
                }
              } else {
                ((rk) this).field_j[var3] = param0.field_j[var3];
                var3++;
                continue L1;
              }
            }
          } else {
            ((rk) this).field_h.a((bw) (Object) var2.c((byte) 68), true);
            ((rk) this).field_g[var2.field_i * 3 - 2] = true;
            var2 = (ho) (Object) param0.field_h.c(0);
            continue L0;
          }
        }
    }

    public final int hashCode() {
        int var1 = 1;
        var1 = 31 * var1 - -((rk) this).field_q;
        var1 = 31 * var1 - -(((rk) this).field_o != null ? ((rk) this).field_o.hashCode() : 0);
        return var1;
    }

    private final void d(byte param0) {
        if (param0 >= -87) {
            Object var3 = null;
        }
        ((rk) this).field_n = ((rk) this).field_o.field_h;
    }

    final void a(lu param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        boolean[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        boolean[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        boolean[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        boolean[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        boolean[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        boolean[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        var7 = BachelorFridge.field_y;
        ((rk) this).field_c = (long)param0.f(-50);
        param0.field_g = param0.field_g + 1;
        var3 = param0.b(16711935);
        ((rk) this).field_h = new eaa();
        var4 = 0;
        L0: while (true) {
          if (var4 >= var3) {
            var4 = param0.a(3);
            ((rk) this).field_j = new int[rfa.a(param1, var4) + 1];
            ((rk) this).field_j[1] = ((rk) this).field_o.field_g.field_b[1];
            ((rk) this).field_j[0] = ((rk) this).field_o.field_g.field_b[0];
            var5 = 2;
            var6 = 0;
            L1: while (true) {
              if ((var6 ^ -1) <= -14) {
                ((rk) this).field_m = new int[5];
                var6 = 0;
                L2: while (true) {
                  if (-6 >= (var6 ^ -1)) {
                    return;
                  } else {
                    ((rk) this).field_m[var6] = param0.c((byte) -85);
                    var6++;
                    continue L2;
                  }
                }
              } else {
                L3: {
                  stackOut_5_0 = ((rk) this).field_g;
                  stackOut_5_1 = var6;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  if (dda.a(var4, 1 << 1 + var6) != 1 << var6 - -1) {
                    stackOut_7_0 = (boolean[]) (Object) stackIn_7_0;
                    stackOut_7_1 = stackIn_7_1;
                    stackOut_7_2 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    stackIn_8_2 = stackOut_7_2;
                    break L3;
                  } else {
                    stackOut_6_0 = (boolean[]) (Object) stackIn_6_0;
                    stackOut_6_1 = stackIn_6_1;
                    stackOut_6_2 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    stackIn_8_2 = stackOut_6_2;
                    break L3;
                  }
                }
                stackIn_8_0[stackIn_8_1] = stackIn_8_2 != 0;
                if (((rk) this).field_g[var6]) {
                  ((rk) this).field_j[var5] = ((rk) this).field_o.field_g.field_b[2 + var6];
                  var5++;
                  var6++;
                  continue L1;
                } else {
                  var6++;
                  continue L1;
                }
              }
            }
          } else {
            ((rk) this).field_h.a((bw) (Object) new ho(fw.field_h[param0.b(16711935)], param0.b(16711935)), true);
            var4++;
            continue L0;
          }
        }
    }

    final lna e(byte param0) {
        int var6 = BachelorFridge.field_y;
        int[] var11 = new int[5];
        int[] var10 = var11;
        int[] var9 = var10;
        int[] var8 = var9;
        int[] var7 = var8;
        int[] var2 = var7;
        bl.a(var11, 0, 5, ((rk) this).field_o.field_b);
        int[] var3 = ug.field_l[((rk) this).field_h.g(0)];
        if (param0 >= -8) {
            field_r = null;
        }
        ho var4 = (ho) (Object) ((rk) this).field_h.b((byte) 90);
        int var5 = 1;
        while (var4 != null) {
            var7[var5] = var4.field_h.field_b;
            var5++;
            var4 = (ho) (Object) ((rk) this).field_h.c(0);
        }
        return new lna(var7[var3[0]], var7[var3[1]], var7[var3[2]], var7[var3[3]], var7[var3[4]], var7[var3[5]], var7[var3[6]], var7[var3[7]], var7[var3[8]], var7[var3[9]], var7[var3[10]]);
    }

    final boolean a(byte param0, pd param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        L0: {
          var9 = BachelorFridge.field_y;
          var4 = 1 + ((rk) this).field_o.a(73, param1, ((rk) this).field_g);
          var5 = 0;
          if (var4 != -1) {
            L1: {
              if (var4 <= 1) {
                break L1;
              } else {
                if ((param2 ^ -1) < -1) {
                  break L1;
                } else {
                  return false;
                }
              }
            }
            L2: {
              L3: {
                if (var4 != 3) {
                  break L3;
                } else {
                  if ((((rk) this).field_h.g(0) ^ -1) > -2) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (var4 != -5) {
                  break L4;
                } else {
                  if (-3 > ((rk) this).field_h.g(0)) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              ((rk) this).field_g[-2 + 3 * var4] = true;
              ((rk) this).field_h.a((bw) (Object) new ho(param1, var4), true);
              var5 = 3 * var4;
              ((rk) this).field_i = var5;
              break L0;
            }
            return false;
          } else {
            var5 = ((rk) this).field_o.a(param1, 0, ((rk) this).field_g);
            if (0 == var5) {
              return false;
            } else {
              ((rk) this).field_g[var5] = true;
              ((rk) this).field_i = 2 + var5;
              break L0;
            }
          }
        }
        var13 = new int[1 + ((rk) this).field_j.length];
        var12 = var13;
        var11 = var12;
        var10 = var11;
        var6 = var10;
        var7 = 0;
        var8 = -81 % ((-25 - param0) / 62);
        L5: while (true) {
          if (var7 >= ((rk) this).field_j.length) {
            var6[var13.length + -1] = ((rk) this).field_o.field_g.field_b[var5 - -2];
            ((rk) this).field_j = var6;
            ((rk) this).field_f = param1.field_b;
            uca.a(35, (byte) -106);
            return true;
          } else {
            var6[var7] = ((rk) this).field_j[var7];
            var7++;
            continue L5;
          }
        }
    }

    public static void c(byte param0) {
        field_r = null;
        if (param0 <= 92) {
            field_r = null;
        }
    }

    final int d(int param0, int param1) {
        t var3 = null;
        L0: {
          if (param0 > 122) {
            break L0;
          } else {
            ((rk) this).field_j = null;
            break L0;
          }
        }
        var3 = (t) (Object) al.a(114, param1);
        if ((var3.field_p ^ -1) != -5) {
          return var3.field_r;
        } else {
          if (((rk) this).a(53, 9)) {
            return ((a) (Object) al.a(-82, 53)).field_q;
          } else {
            return var3.field_r;
          }
        }
    }

    private final int a(int param0) {
        ((rk) this).field_l = param0;
        return ((rk) this).field_l;
    }

    public final boolean equals(Object param0) {
        if (!(param0 != this)) {
            return true;
        }
        if (param0 == null) {
            return false;
        }
        if (!(this.getClass() == param0.getClass())) {
            return false;
        }
        rk var2 = (rk) param0;
        if (!(var2.field_q == var2.field_q)) {
            return false;
        }
        if (var2.field_o != null) {
            // ifne L94
            return false;
        }
        if (var2.field_o != null) {
            return false;
        }
        return true;
    }

    rk(wca param0) {
        ((rk) this).field_q = 1;
        ((rk) this).field_j = new int[2];
        ((rk) this).field_h = new eaa();
        ((rk) this).field_g = new boolean[13];
        ((rk) this).field_f = -1;
        ((rk) this).field_o = param0;
        if (null == ((rk) this).field_o) {
            throw new RuntimeException("You're not supposed to be able to breed random creatures any more!");
        }
        this.d((byte) -107);
        ((rk) this).field_k = new int[4];
        bl.a(((rk) this).field_o.field_l, 0, ((rk) this).field_k, 0, 4);
        ((rk) this).field_p = new Random();
        ((rk) this).field_j[1] = ((rk) this).field_o.field_g.field_b[1];
        ((rk) this).field_m = new int[5];
        ((rk) this).field_j[0] = ((rk) this).field_o.field_g.field_b[0];
        bl.a(((rk) this).field_m, 0, ((rk) this).field_m.length, -1);
        ((rk) this).field_m[0] = 0;
        ((rk) this).field_m[1] = 1;
        int discarded$0 = this.a(0);
        ((rk) this).field_c = (long)kla.a(2147483647, ((rk) this).field_p, -2147483648);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Reject <%0> from this game";
    }
}
