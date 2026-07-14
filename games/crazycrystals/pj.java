/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj extends bo implements Cloneable {
    static int field_v;
    static java.applet.Applet field_w;
    static int field_x;
    private int field_u;
    static float field_p;
    static int[] field_r;
    private int field_s;
    private int field_t;
    static int field_q;

    pj(int param0, int param1) {
        this(param0, param1, (f) (Object) new kp(param0));
    }

    final int a(byte param0) {
        if (param0 > -34) {
            return 118;
        }
        return ((pj) this).field_u;
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, byte param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        var14 = CrazyCrystals.field_B;
        if (param6 >= param1) {
          return;
        } else {
          if (param2 > param6 - -1) {
            L0: {
              if (param2 <= 5 + param6) {
                break L0;
              } else {
                if (param4 == param0) {
                  break L0;
                } else {
                  var7 = (param4 >> 11203745) + ((param0 >> -792122655) - -(1 & (param4 & param0)));
                  var8 = param6;
                  var9 = param4;
                  var10 = param0;
                  var11 = param6;
                  L1: while (true) {
                    if (var11 >= param2) {
                      pj.a(var9, param1, var8, param3, param4, param5, param6);
                      pj.a(param0, param1, param2, param3, var10, (byte) 119, var8);
                      return;
                    } else {
                      L2: {
                        var12 = wp.field_d[var11];
                        if (!param3) {
                          stackOut_22_0 = jk.field_g[var12];
                          stackIn_23_0 = stackOut_22_0;
                          break L2;
                        } else {
                          stackOut_21_0 = mh.field_l[var12];
                          stackIn_23_0 = stackOut_21_0;
                          break L2;
                        }
                      }
                      var13 = stackIn_23_0;
                      if (var13 <= var7) {
                        if (var13 > var10) {
                          var10 = var13;
                          var11++;
                          continue L1;
                        } else {
                          var11++;
                          continue L1;
                        }
                      } else {
                        wp.field_d[var11] = wp.field_d[var8];
                        var8++;
                        wp.field_d[var8] = var12;
                        if (var9 > var13) {
                          var9 = var13;
                          var11++;
                          continue L1;
                        } else {
                          var11++;
                          continue L1;
                        }
                      }
                    }
                  }
                }
              }
            }
            var7 = -1 + param2;
            L3: while (true) {
              if (param6 >= var7) {
                return;
              } else {
                var8 = param6;
                L4: while (true) {
                  if (var7 <= var8) {
                    var7--;
                    continue L3;
                  } else {
                    var9 = wp.field_d[var8];
                    var10 = wp.field_d[var8 - -1];
                    if (da.a(var9, (byte) 52, param3, var10)) {
                      wp.field_d[var8] = var10;
                      wp.field_d[var8 - -1] = var9;
                      var8++;
                      continue L4;
                    } else {
                      var8++;
                      continue L4;
                    }
                  }
                }
              }
            }
          } else {
            return;
          }
        }
    }

    final void b(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7 = 0;
        if ((((pj) this).field_u ^ -1) > -1) {
        } else {
            var7 = ((pj) this).field_t;
            if (0 <= var7) {
                // ifne L40
            }
            var7 = ((pj) this).field_s;
            if (24 == param1) {
                // if_icmpne L78
                le.field_g[((pj) this).field_u][var7].a(param4, param5 + -param2);
            } else {
                le.field_g[((pj) this).field_u][var7].b(param4, param5 + -param2, param1 * 2, 3 * param2);
            }
        }
        var7 = 74 / ((param0 - 74) / 41);
    }

    public static void g(int param0) {
        field_w = null;
        field_r = null;
        if (param0 >= -78) {
            field_q = 27;
        }
    }

    final int a(boolean param0, boolean param1) {
        if (!param0) {
            return 97;
        }
        return cd.field_v[((pj) this).field_s];
    }

    pj(int param0) {
        this(0, param0);
    }

    pj(int param0, int param1, f param2) {
        super(param2);
        ((pj) this).field_t = -1;
        ((pj) this).field_s = param1;
        ((pj) this).field_u = param0;
    }

    final void a(int param0, int param1) {
        ((pj) this).field_u = param0;
        if (param1 < 61) {
            ((pj) this).c(false, false);
        }
    }

    final void c(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        if (!param0) {
            return;
        }
        if (((pj) this).field_u <= -1) {
            if (-5 > ((pj) this).field_u) {
                if (!(((pj) this).field_s != 0)) {
                    var3 = le.field_g[((pj) this).field_u].length + -10;
                    var4 = (int)(3.0 * ((double)var3 * Math.random()));
                    if (-1 >= (var4 ^ -1)) {
                        if (!(var4 >= var3)) {
                            ((pj) this).field_t = 10 - -var4;
                        }
                    }
                }
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = 0;
        field_r = new int[4];
    }
}
