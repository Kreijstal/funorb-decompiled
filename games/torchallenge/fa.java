/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa extends lg {
    static int[][] field_m;
    static int field_j;
    static ka field_q;
    static int field_t;
    static int field_g;
    private int field_r;
    private int field_o;
    private boolean field_s;
    static int[] field_h;
    private String field_i;
    private int field_l;
    private eg field_p;
    private int field_k;
    private int field_n;

    final void a(eg param0, String param1, int param2, byte param3, int param4) {
        if (!(param1 != null)) {
            ((fa) this).field_a = null;
            return;
        }
        if (param0 == ((fa) this).field_p) {
            if (((fa) this).field_s) {
                if ((((fa) this).field_n ^ -1) == -3) {
                    if (null != ((fa) this).field_i) {
                        if (((fa) this).field_i.equals((Object) (Object) param1)) {
                            return;
                        }
                    }
                }
            }
        }
        ((fa) this).field_p = param0;
        ((fa) this).field_i = param1;
        if (param3 != -9) {
            return;
        }
        ((fa) this).field_n = 2;
        ((fa) this).field_s = true;
        qi var8 = this.a(param3 ^ -1063303658, param1, param4, param0);
        qi var9 = var8;
        var9.field_g[0] = param2 - param0.a(param1);
        var9.field_g[param1.length()] = param2;
        ua.a(0, (byte) -113, param0, param1, var9);
    }

    private final qi a(int param0, String param1, int param2, eg param3) {
        qi var7 = new qi(-param3.field_x + param2, param3.field_K + param2, param1.length());
        qi var5 = var7;
        if (param0 != 1063303649) {
            Object var6 = null;
            qi discarded$0 = this.a(-1, (String) null, 18, (eg) null);
        }
        ((fa) this).field_a = new qi[]{var7};
        return var5;
    }

    final void a(int param0, int param1, int param2, String param3, eg param4, int param5, int param6, int param7) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        qi var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        qi stackIn_31_0 = null;
        qi stackIn_31_1 = null;
        int stackIn_31_2 = 0;
        int stackIn_31_3 = 0;
        qi stackIn_32_0 = null;
        qi stackIn_32_1 = null;
        int stackIn_32_2 = 0;
        int stackIn_32_3 = 0;
        qi stackIn_33_0 = null;
        qi stackIn_33_1 = null;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        int stackIn_33_4 = 0;
        int stackIn_38_0 = 0;
        qi stackOut_30_0 = null;
        qi stackOut_30_1 = null;
        int stackOut_30_2 = 0;
        int stackOut_30_3 = 0;
        qi stackOut_32_0 = null;
        qi stackOut_32_1 = null;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        int stackOut_32_4 = 0;
        qi stackOut_31_0 = null;
        qi stackOut_31_1 = null;
        int stackOut_31_2 = 0;
        int stackOut_31_3 = 0;
        int stackOut_31_4 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        L0: {
          var15 = TorChallenge.field_F ? 1 : 0;
          if ((param1 ^ -1) == param6) {
            param1 = param4.field_G;
            break L0;
          } else {
            break L0;
          }
        }
        if (param3 != null) {
          L1: {
            if (param4 != ((fa) this).field_p) {
              break L1;
            } else {
              if (((fa) this).field_s) {
                break L1;
              } else {
                if (param2 != ((fa) this).field_n) {
                  break L1;
                } else {
                  if (((fa) this).field_l != param7) {
                    break L1;
                  } else {
                    if (param1 != ((fa) this).field_k) {
                      break L1;
                    } else {
                      if (param5 != ((fa) this).field_r) {
                        break L1;
                      } else {
                        if (param0 != ((fa) this).field_o) {
                          break L1;
                        } else {
                          if (((fa) this).field_i == null) {
                            break L1;
                          } else {
                            if (!((fa) this).field_i.equals((Object) (Object) param3)) {
                              break L1;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          L2: {
            ((fa) this).field_k = param1;
            ((fa) this).field_s = false;
            ((fa) this).field_r = param5;
            ((fa) this).field_o = param0;
            ((fa) this).field_i = param3;
            ((fa) this).field_n = param2;
            ((fa) this).field_p = param4;
            ((fa) this).field_l = param7;
            var16 = new String[param4.a(param3, param0) + 1];
            var17 = var16;
            var10 = Math.max(1, param4.a(param3, new int[1], var17));
            if (((fa) this).field_l != 3) {
              break L2;
            } else {
              if (var10 == 1) {
                ((fa) this).field_l = 1;
                break L2;
              } else {
                break L2;
              }
            }
          }
          L3: {
            if (0 != ((fa) this).field_l) {
              if (1 != ((fa) this).field_l) {
                if (-3 != (((fa) this).field_l ^ -1)) {
                  L4: {
                    var12 = (-(((fa) this).field_k * var10) + ((fa) this).field_r) / (1 + var10);
                    if (0 <= var12) {
                      break L4;
                    } else {
                      var12 = 0;
                      break L4;
                    }
                  }
                  var11 = var12 + param4.field_x;
                  ((fa) this).field_k = ((fa) this).field_k + var12;
                  break L3;
                } else {
                  var11 = -param4.field_K + ((fa) this).field_r + -(((fa) this).field_k * var10);
                  break L3;
                }
              } else {
                var11 = param4.field_x + (-(((fa) this).field_k * var10) + ((fa) this).field_r >> -545220607);
                break L3;
              }
            } else {
              var11 = param4.field_x;
              break L3;
            }
          }
          ((fa) this).field_a = new qi[var10];
          var12 = 0;
          L5: while (true) {
            if (var12 >= var10) {
              return;
            } else {
              L6: {
                var13 = var16[var12];
                stackOut_30_0 = null;
                stackOut_30_1 = null;
                stackOut_30_2 = -param4.field_x + var11;
                stackOut_30_3 = param4.field_K + var11;
                stackIn_32_0 = stackOut_30_0;
                stackIn_32_1 = stackOut_30_1;
                stackIn_32_2 = stackOut_30_2;
                stackIn_32_3 = stackOut_30_3;
                stackIn_31_0 = stackOut_30_0;
                stackIn_31_1 = stackOut_30_1;
                stackIn_31_2 = stackOut_30_2;
                stackIn_31_3 = stackOut_30_3;
                if (var13 != null) {
                  stackOut_32_0 = null;
                  stackOut_32_1 = null;
                  stackOut_32_2 = stackIn_32_2;
                  stackOut_32_3 = stackIn_32_3;
                  stackOut_32_4 = var13.length();
                  stackIn_33_0 = stackOut_32_0;
                  stackIn_33_1 = stackOut_32_1;
                  stackIn_33_2 = stackOut_32_2;
                  stackIn_33_3 = stackOut_32_3;
                  stackIn_33_4 = stackOut_32_4;
                  break L6;
                } else {
                  stackOut_31_0 = null;
                  stackOut_31_1 = null;
                  stackOut_31_2 = stackIn_31_2;
                  stackOut_31_3 = stackIn_31_3;
                  stackOut_31_4 = 0;
                  stackIn_33_0 = stackOut_31_0;
                  stackIn_33_1 = stackOut_31_1;
                  stackIn_33_2 = stackOut_31_2;
                  stackIn_33_3 = stackOut_31_3;
                  stackIn_33_4 = stackOut_31_4;
                  break L6;
                }
              }
              L7: {
                new qi(stackIn_33_2, stackIn_33_3, stackIn_33_4);
                var14 = stackIn_33_0;
                var14.field_g[0] = 0;
                if (var13 != null) {
                  L8: {
                    var14.field_g[var13.length()] = param4.a(var13);
                    if (3 != param2) {
                      stackOut_37_0 = 0;
                      stackIn_38_0 = stackOut_37_0;
                      break L8;
                    } else {
                      stackOut_36_0 = ((fa) this).a(var13, param0, (byte) 19, param4.a(var13));
                      stackIn_38_0 = stackOut_36_0;
                      break L8;
                    }
                  }
                  ua.a(stackIn_38_0, (byte) -113, param4, var13, var14);
                  break L7;
                } else {
                  break L7;
                }
              }
              ((fa) this).field_a[var12] = var14;
              var11 = var11 + param1;
              var12++;
              continue L5;
            }
          }
        } else {
          ((fa) this).field_a = null;
          return;
        }
    }

    final void b(eg param0, String param1, int param2, int param3, int param4) {
        if (!(param1 != null)) {
            ((fa) this).field_a = null;
            return;
        }
        if (param0 == ((fa) this).field_p) {
            if (((fa) this).field_s) {
                if (((fa) this).field_n == 0) {
                    if (((fa) this).field_i != null) {
                        if (!(!((fa) this).field_i.equals((Object) (Object) param1))) {
                            return;
                        }
                    }
                }
            }
        }
        ((fa) this).field_i = param1;
        ((fa) this).field_n = 0;
        ((fa) this).field_s = true;
        ((fa) this).field_p = param0;
        qi var8 = this.a(1063303649, param1, param2, param0);
        qi var9 = var8;
        var8.field_g[0] = param4;
        var9.field_g[param1.length()] = param0.a(param1) + param4;
        ua.a(0, (byte) -113, param0, param1, var9);
        if (param3 > -62) {
            Object var7 = null;
            qi discarded$0 = this.a(107, (String) null, -69, (eg) null);
        }
    }

    public static void b(int param0) {
        field_q = null;
        field_h = null;
        if (param0 != -3) {
            fa.b(-61);
        }
        field_m = null;
    }

    final void a(eg param0, String param1, int param2, int param3, int param4) {
        if (param3 != -25602) {
            return;
        }
        if (!(param1 != null)) {
            ((fa) this).field_a = null;
            return;
        }
        if (((fa) this).field_p == param0) {
            if (((fa) this).field_s) {
                if (((fa) this).field_n == 1) {
                    if (null != ((fa) this).field_i) {
                        if (((fa) this).field_i.equals((Object) (Object) param1)) {
                            return;
                        }
                    }
                }
            }
        }
        ((fa) this).field_p = param0;
        ((fa) this).field_n = 1;
        ((fa) this).field_s = true;
        qi var8 = this.a(1063303649, param1, param4, param0);
        int var7 = param0.a(param1);
        var8.field_g[0] = param2 - (var7 >> 1229577153);
        var8.field_g[param1.length()] = param2 + (var7 >> 1063303649);
        ua.a(0, (byte) -113, param0, param1, var8);
    }

    public fa() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new int[][]{new int[1], new int[1], new int[1], new int[1], new int[1]};
        field_h = new int[8192];
        field_t = -1;
    }
}
