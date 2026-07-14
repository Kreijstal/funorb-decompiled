/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sr {
    private int[] field_g;
    private int field_o;
    private int[] field_a;
    int field_n;
    private int field_e;
    private int[] field_b;
    private int field_c;
    private int field_m;
    private int[] field_i;
    private boolean field_h;
    static je field_p;
    private int field_l;
    v field_k;
    private int field_j;
    private int[] field_d;
    private int[] field_f;

    final static int a(int param0, int param1, int param2, byte param3) {
        if (-1 >= (param0 ^ -1)) {
          if (0 <= param1) {
            if (ks.field_y > param0) {
              if (param1 < ef.field_c) {
                if (param3 >= -91) {
                  return -54;
                } else {
                  return cq.field_u[param0 + ks.field_y * param1];
                }
              } else {
                return param2;
              }
            } else {
              return param2;
            }
          } else {
            return param2;
          }
        } else {
          return param2;
        }
    }

    final boolean a(byte param0) {
        int var2 = -78 / ((param0 - 41) / 62);
        return ((sr) this).field_n == 256 ? true : false;
    }

    final void a(int param0, int param1) {
        ((sr) this).field_e = 256;
        ((sr) this).field_i[0] = 16;
        ((sr) this).field_i[1] = 16;
        ((sr) this).field_j = -((sr) this).field_j + ((sr) this).field_o;
        ((sr) this).field_m = 0;
        ((sr) this).field_g[1] = ((sr) this).field_l;
        ((sr) this).field_g[0] = ((sr) this).field_c;
        ((sr) this).field_k.a(1, param1);
        ((sr) this).field_a[0] = ((sr) this).field_k.field_e[0];
        ((sr) this).field_a[1] = ((sr) this).field_k.field_e[1];
        ((sr) this).field_b[0] = so.field_b.field_a >> -163208351;
        ((sr) this).field_b[1] = so.field_b.field_g >> -1697168543;
        ((sr) this).field_h = false;
        if (param0 > -59) {
            boolean discarded$0 = ((sr) this).a((byte) -51);
        }
    }

    final void a(int param0, wk param1) {
        int var3_int = 0;
        Exception var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var7 = ((sr) this).field_n;
                        var6 = param1.field_x;
                        var5 = param1.field_A;
                        var5 = ((sr) this).field_d[0];
                        var6 = ((sr) this).field_d[1];
                        var4 = -(var6 >> 868923585) + (((sr) this).field_l >> -2076967775);
                        var8 = -55 / ((param0 - -18) / 37);
                        var3_int = (((sr) this).field_c >> -2119200927) - (var5 >> -344491455);
                        var4 = ((sr) this).field_f[1];
                        var3_int = ((sr) this).field_f[0];
                        var4 = var4 - (var6 >> -1341099679);
                        var3_int = var3_int - (var5 >> 1193823777);
                        if (256 == var7) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        param1.c(var3_int, var4, var5, var6, var7);
                        return;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        param1.c(var3_int, var4, var5, var6);
                        return;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    var3 = (Exception) (Object) caughtException;
                    var3.printStackTrace();
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        if (param0 != 1) {
          L0: {
            ((sr) this).a(9, -1);
            if ((param3 ^ -1) < -1) {
              break L0;
            } else {
              param3 = 1;
              break L0;
            }
          }
          var6 = param4 + -param2;
          var7 = var6 * param1 / param3 + param2;
          return var7;
        } else {
          L1: {
            if ((param3 ^ -1) < -1) {
              break L1;
            } else {
              param3 = 1;
              break L1;
            }
          }
          var6 = param4 + -param2;
          var7 = var6 * param1 / param3 + param2;
          return var7;
        }
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        if (((sr) this).field_o == ((sr) this).field_j) {
          ((sr) this).field_f[1] = so.field_b.field_g >> -587837663;
          ((sr) this).field_f[0] = so.field_b.field_a >> 1959107777;
          return;
        } else {
          if (param0 == 1959107777) {
            if (!((sr) this).field_h) {
              L0: {
                ((sr) this).field_b[1] = so.field_b.field_g >> 2102642721;
                ((sr) this).field_b[0] = so.field_b.field_a >> 1800830017;
                this.a(-120);
                ((sr) this).field_n = this.a(param0 + -1959107776, ((sr) this).field_j, ((sr) this).field_e, ((sr) this).field_o, ((sr) this).field_m);
                var2 = ((sr) this).field_i[0] - ((sr) this).field_g[0];
                var3 = this.a((byte) -71, var2);
                var2 = var3 * var2;
                var4 = -((sr) this).field_g[0] + ((sr) this).field_d[0];
                var3 = this.a((byte) -71, var4);
                var4 = var3 * var4;
                ((sr) this).field_f[0] = this.a(1, var4, ((sr) this).field_b[0], var2, ((sr) this).field_a[0]);
                ((sr) this).field_f[1] = this.a(1, var4, ((sr) this).field_b[1], var2, ((sr) this).field_a[1]);
                if (((sr) this).field_o > ((sr) this).field_j) {
                  ((sr) this).field_j = ((sr) this).field_j + 1;
                  break L0;
                } else {
                  break L0;
                }
              }
              L1: {
                if (((sr) this).field_o == ((sr) this).field_j) {
                  this.b(-85);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            } else {
              L2: {
                ((sr) this).field_a[0] = so.field_b.field_a >> 1200426849;
                ((sr) this).field_a[1] = so.field_b.field_g >> -2129312607;
                this.a(-120);
                ((sr) this).field_n = this.a(param0 + -1959107776, ((sr) this).field_j, ((sr) this).field_e, ((sr) this).field_o, ((sr) this).field_m);
                var2 = ((sr) this).field_i[0] - ((sr) this).field_g[0];
                var3 = this.a((byte) -71, var2);
                var2 = var3 * var2;
                var4 = -((sr) this).field_g[0] + ((sr) this).field_d[0];
                var3 = this.a((byte) -71, var4);
                var4 = var3 * var4;
                ((sr) this).field_f[0] = this.a(1, var4, ((sr) this).field_b[0], var2, ((sr) this).field_a[0]);
                ((sr) this).field_f[1] = this.a(1, var4, ((sr) this).field_b[1], var2, ((sr) this).field_a[1]);
                if (((sr) this).field_o > ((sr) this).field_j) {
                  ((sr) this).field_j = ((sr) this).field_j + 1;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (((sr) this).field_o == ((sr) this).field_j) {
                  this.b(-85);
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            }
          } else {
            return;
          }
        }
    }

    private final void a(int param0) {
        int var2 = -77 / ((param0 - -64) / 53);
        ((sr) this).field_d[0] = (((sr) this).field_i[0] * ((sr) this).field_j + (-((sr) this).field_j + ((sr) this).field_o) * ((sr) this).field_g[0]) / ((sr) this).field_o;
        ((sr) this).field_d[1] = (((sr) this).field_i[1] * ((sr) this).field_j + ((sr) this).field_g[1] * (-((sr) this).field_j + ((sr) this).field_o)) / ((sr) this).field_o;
    }

    private final int a(byte param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -71) {
          L0: {
            ((sr) this).a(-4, 101);
            if ((param1 ^ -1) > -1) {
              stackOut_7_0 = -1;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if ((param1 ^ -1) > -1) {
              stackOut_3_0 = -1;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    final void b(int param0, int param1) {
        ((sr) this).field_j = 0;
        ((sr) this).field_g[1] = 16;
        ((sr) this).field_e = 0;
        ((sr) this).field_m = 256;
        ((sr) this).field_g[0] = 16;
        ((sr) this).field_i[0] = ((sr) this).field_c;
        ((sr) this).field_i[1] = ((sr) this).field_l;
        ((sr) this).field_k.a(1, param0);
        ((sr) this).field_b[1] = ((sr) this).field_k.field_e[1];
        ((sr) this).field_b[0] = ((sr) this).field_k.field_e[0];
        ((sr) this).field_h = true;
        int var3 = -107 / ((74 - param1) / 42);
        ((sr) this).field_a[0] = so.field_b.field_a >> -1810321343;
        ((sr) this).field_a[1] = so.field_b.field_g >> 660321;
    }

    private final void b(int param0) {
        ((sr) this).field_d[0] = ((sr) this).field_i[0];
        ((sr) this).field_n = ((sr) this).field_m;
        ((sr) this).field_d[1] = ((sr) this).field_i[1];
        if (param0 > -41) {
          ((sr) this).field_g = null;
          ((sr) this).field_f[1] = ((sr) this).field_a[1];
          ((sr) this).field_f[0] = ((sr) this).field_a[0];
          return;
        } else {
          ((sr) this).field_f[1] = ((sr) this).field_a[1];
          ((sr) this).field_f[0] = ((sr) this).field_a[0];
          return;
        }
    }

    final static int c(int param0, int param1) {
        if (param1 < 67) {
            return 4;
        }
        return tm.field_n[param0 & 2047];
    }

    public static void b(byte param0) {
        field_p = null;
        if (param0 != 120) {
            int discarded$0 = sr.a(51, -118, -11, (byte) 113);
        }
    }

    sr(int param0, int param1, v param2) {
        ((sr) this).field_o = 60;
        ((sr) this).field_a = new int[2];
        ((sr) this).field_k = param2;
        ((sr) this).field_d = new int[2];
        ((sr) this).field_i = new int[2];
        ((sr) this).field_f = new int[2];
        ((sr) this).field_g = new int[2];
        ((sr) this).field_l = param1;
        ((sr) this).field_c = param0;
        ((sr) this).field_b = new int[2];
    }

    static {
    }
}
