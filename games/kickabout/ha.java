/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ha extends i {
    static String field_J;
    static int[] field_F;
    static int field_G;
    static hd[] field_H;
    static int field_I;

    final static ki b(int param0, int param1, int param2) {
        return new ki(1, param1, param2, (byte) 0, (byte) 0);
    }

    ha() {
        super(23);
    }

    final static boolean a(boolean param0, byte param1) {
        if (param1 != -48) {
            ha.g(120);
        }
        return !param0 ? true : false;
    }

    final static void c(int param0, boolean param1) {
        if (param0 != 100) {
            ha.c(23, true);
        }
        vs.a(true, param1, (byte) 39);
    }

    final void a(int param0, int param1) {
        super.a(75, param1);
        if (param0 < 60) {
            return;
        }
        if (!(param1 != 1)) {
            ql.a((byte) 29, true, dg.field_f);
        }
    }

    final static up a(long param0, int param1, int param2, int param3, int param4) {
        long var6 = 0L;
        Random var8 = null;
        up var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int stackIn_6_0 = 0;
        up stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        up stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        up stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_19_3 = 0;
        up stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        up stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        up stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        up stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        up stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int stackIn_30_2 = 0;
        up stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackIn_31_2 = 0;
        int stackIn_31_3 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        up stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        up stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        up stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        up stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        up stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        up stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        up stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        up stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        int stackOut_30_2 = 0;
        int stackOut_30_3 = 0;
        up stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int stackOut_29_2 = 0;
        int stackOut_29_3 = 0;
        L0: {
          var16 = Kickabout.field_G;
          param2 = param2 & 15;
          if (param3 <= -37) {
            break L0;
          } else {
            up discarded$1 = ha.a(-62L, -5, -19, -99, -27);
            break L0;
          }
        }
        L1: {
          var6 = param0;
          var6 = var6 ^ (long)(2 + param4);
          var6 = ub.a(4, (byte) -80, var6);
          var6 = var6 ^ (long)(1 + param1);
          var6 = ub.a(4, (byte) 115, var6);
          var6 = var6 ^ (long)(1 + param2);
          var6 = ub.a(4, (byte) -119, var6);
          var8 = new Random(var6);
          var9 = new up();
          var9.field_c = true;
          if (param4 == -1) {
            L2: {
              var9.field_q = param1 / 2;
              if (var9.field_q == 2) {
                var9.field_q = 3;
                break L2;
              } else {
                if (var9.field_q != 3) {
                  break L2;
                } else {
                  var9.field_q = 2;
                  break L2;
                }
              }
            }
            L3: {
              var10 = 50 - -(param1 % 2 * 50);
              var9.field_o = var10;
              var9.field_n = var10;
              var9.field_r = 0;
              var9.field_g = var10;
              var11 = 1;
              if (2 != var9.field_q) {
                break L3;
              } else {
                var11 = 3;
                break L3;
              }
            }
            var9.field_h = new int[var11];
            if (var9.field_q == 2) {
              var9.field_h[0] = 3;
              var12 = 1;
              L4: while (true) {
                if (var9.field_h.length <= var12) {
                  break L1;
                } else {
                  var9.field_h[var12] = dq.a((byte) -115, 4, var8);
                  var12++;
                  continue L4;
                }
              }
            } else {
              var12 = 0;
              L5: while (true) {
                if (var12 >= var9.field_h.length) {
                  break L1;
                } else {
                  L6: {
                    if (2 == param1) {
                      var9.field_h[var12] = 0;
                      break L6;
                    } else {
                      L7: {
                        if (param1 <= 2) {
                          break L7;
                        } else {
                          if (5 > param1) {
                            var9.field_h[var12] = dq.a((byte) -118, 2, var8);
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var9.field_h[var12] = dq.a((byte) 120, 3, var8);
                      break L6;
                    }
                  }
                  var12++;
                  continue L5;
                }
              }
            }
          } else {
            L8: {
              if (3 <= param4) {
                stackOut_5_0 = 2;
                stackIn_6_0 = stackOut_5_0;
                break L8;
              } else {
                stackOut_4_0 = 3;
                stackIn_6_0 = stackOut_4_0;
                break L8;
              }
            }
            L9: {
              var10 = stackIn_6_0;
              var9.field_q = param1 / var10;
              if (var9.field_q == 2) {
                var9.field_q = 3;
                break L9;
              } else {
                if (var9.field_q == 3) {
                  var9.field_q = 2;
                  break L9;
                } else {
                  break L9;
                }
              }
            }
            L10: {
              if (param4 >= 2) {
                break L10;
              } else {
                if (var9.field_q != 2) {
                  break L10;
                } else {
                  var9.field_q = 3;
                  break L10;
                }
              }
            }
            L11: {
              var11 = 40 + dq.a((byte) -69, 4, var8) * 10;
              if (var9.field_q == 0) {
                L12: {
                  stackOut_16_0 = (up) var9;
                  stackOut_16_1 = ng.field_d[param4];
                  stackOut_16_2 = 86;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  if (param4 == 0) {
                    stackOut_18_0 = (up) (Object) stackIn_18_0;
                    stackOut_18_1 = stackIn_18_1;
                    stackOut_18_2 = stackIn_18_2;
                    stackOut_18_3 = 6;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    stackIn_19_3 = stackOut_18_3;
                    break L12;
                  } else {
                    stackOut_17_0 = (up) (Object) stackIn_17_0;
                    stackOut_17_1 = stackIn_17_1;
                    stackOut_17_2 = stackIn_17_2;
                    stackOut_17_3 = 11;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    stackIn_19_3 = stackOut_17_3;
                    break L12;
                  }
                }
                stackIn_19_0.field_o = stackIn_19_1 + dq.a((byte) stackIn_19_2, stackIn_19_3, var8);
                var9.field_g = var11 * var9.field_o / 100;
                var9.field_n = (100 - var11) * var9.field_o / 100;
                break L11;
              } else {
                break L11;
              }
            }
            L13: {
              if (var9.field_q == 3) {
                L14: {
                  stackOut_22_0 = (up) var9;
                  stackOut_22_1 = ng.field_d[param4];
                  stackOut_22_2 = -60;
                  stackIn_24_0 = stackOut_22_0;
                  stackIn_24_1 = stackOut_22_1;
                  stackIn_24_2 = stackOut_22_2;
                  stackIn_23_0 = stackOut_22_0;
                  stackIn_23_1 = stackOut_22_1;
                  stackIn_23_2 = stackOut_22_2;
                  if (param4 == 0) {
                    stackOut_24_0 = (up) (Object) stackIn_24_0;
                    stackOut_24_1 = stackIn_24_1;
                    stackOut_24_2 = stackIn_24_2;
                    stackOut_24_3 = 6;
                    stackIn_25_0 = stackOut_24_0;
                    stackIn_25_1 = stackOut_24_1;
                    stackIn_25_2 = stackOut_24_2;
                    stackIn_25_3 = stackOut_24_3;
                    break L14;
                  } else {
                    stackOut_23_0 = (up) (Object) stackIn_23_0;
                    stackOut_23_1 = stackIn_23_1;
                    stackOut_23_2 = stackIn_23_2;
                    stackOut_23_3 = 11;
                    stackIn_25_0 = stackOut_23_0;
                    stackIn_25_1 = stackOut_23_1;
                    stackIn_25_2 = stackOut_23_2;
                    stackIn_25_3 = stackOut_23_3;
                    break L14;
                  }
                }
                stackIn_25_0.field_g = stackIn_25_1 + dq.a((byte) stackIn_25_2, stackIn_25_3, var8);
                var9.field_o = var11 * var9.field_g / 100;
                var9.field_n = (100 - var11) * var9.field_g / 100;
                break L13;
              } else {
                break L13;
              }
            }
            L15: {
              if (var9.field_q == 1) {
                L16: {
                  stackOut_28_0 = (up) var9;
                  stackOut_28_1 = ng.field_d[param4];
                  stackOut_28_2 = -66;
                  stackIn_30_0 = stackOut_28_0;
                  stackIn_30_1 = stackOut_28_1;
                  stackIn_30_2 = stackOut_28_2;
                  stackIn_29_0 = stackOut_28_0;
                  stackIn_29_1 = stackOut_28_1;
                  stackIn_29_2 = stackOut_28_2;
                  if (param4 == 0) {
                    stackOut_30_0 = (up) (Object) stackIn_30_0;
                    stackOut_30_1 = stackIn_30_1;
                    stackOut_30_2 = stackIn_30_2;
                    stackOut_30_3 = 6;
                    stackIn_31_0 = stackOut_30_0;
                    stackIn_31_1 = stackOut_30_1;
                    stackIn_31_2 = stackOut_30_2;
                    stackIn_31_3 = stackOut_30_3;
                    break L16;
                  } else {
                    stackOut_29_0 = (up) (Object) stackIn_29_0;
                    stackOut_29_1 = stackIn_29_1;
                    stackOut_29_2 = stackIn_29_2;
                    stackOut_29_3 = 11;
                    stackIn_31_0 = stackOut_29_0;
                    stackIn_31_1 = stackOut_29_1;
                    stackIn_31_2 = stackOut_29_2;
                    stackIn_31_3 = stackOut_29_3;
                    break L16;
                  }
                }
                stackIn_31_0.field_n = stackIn_31_1 - -dq.a((byte) stackIn_31_2, stackIn_31_3, var8);
                var9.field_g = var9.field_n * var11 / 100;
                var9.field_o = (-var11 + 100) * var9.field_n / 100;
                break L15;
              } else {
                break L15;
              }
            }
            L17: {
              if (2 == var9.field_q) {
                var12 = ng.field_d[param4] + dq.a((byte) -41, 11, var8);
                var11 = dq.a((byte) 81, 3, var8) * 10 + 60;
                var9.field_o = var12 * var11 / 100;
                var11 = 60 + dq.a((byte) -90, 3, var8) * 10;
                var9.field_g = var12 * var11 / 100;
                var11 = 60 + dq.a((byte) 127, 3, var8) * 10;
                var9.field_n = var12 * var11 / 100;
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              var9.field_r = 0;
              if (var9.field_o <= 80) {
                break L18;
              } else {
                var9.field_o = 80;
                break L18;
              }
            }
            L19: {
              if (var9.field_g <= 80) {
                break L19;
              } else {
                var9.field_g = 80;
                break L19;
              }
            }
            L20: {
              if (var9.field_n <= 80) {
                break L20;
              } else {
                var9.field_n = 80;
                break L20;
              }
            }
            L21: {
              var12 = 0;
              if (var9.field_q != 2) {
                var12++;
                if (param4 < 4) {
                  break L21;
                } else {
                  if (dq.a((byte) 89, 2, var8) != 0) {
                    break L21;
                  } else {
                    var12++;
                    break L21;
                  }
                }
              } else {
                L22: {
                  var12++;
                  if (param4 < 5) {
                    break L22;
                  } else {
                    var12++;
                    break L22;
                  }
                }
                if (0 != dq.a((byte) -73, 2, var8)) {
                  break L21;
                } else {
                  var12++;
                  break L21;
                }
              }
            }
            L23: {
              var9.field_h = new int[var12];
              if (2 != var9.field_q) {
                var13 = 0;
                L24: while (true) {
                  if (var9.field_h.length <= var13) {
                    break L23;
                  } else {
                    L25: {
                      if (param4 >= 2) {
                        var14 = dq.a((byte) 122, 100, var8);
                        var17 = 0;
                        var15 = var17;
                        L26: while (true) {
                          if (~ct.field_v[param4].length >= ~var17) {
                            break L25;
                          } else {
                            if (var14 > ct.field_v[param4][var17]) {
                              var14 = var14 - ct.field_v[param4][var17];
                              var17++;
                              continue L26;
                            } else {
                              var9.field_h[var13] = var17;
                              break L25;
                            }
                          }
                        }
                      } else {
                        var9.field_h[var13] = 0;
                        break L25;
                      }
                    }
                    var13++;
                    continue L24;
                  }
                }
              } else {
                var9.field_h[0] = 3;
                var13 = 1;
                L27: while (true) {
                  if (~var9.field_h.length >= ~var13) {
                    break L23;
                  } else {
                    var14 = dq.a((byte) -89, 100, var8);
                    var15 = 0;
                    L28: while (true) {
                      L29: {
                        if (~var15 <= ~vo.field_eb[param4].length) {
                          break L29;
                        } else {
                          if (~var14 >= ~vo.field_eb[param4][var15]) {
                            var9.field_h[var13] = var15;
                            break L29;
                          } else {
                            var14 = var14 - vo.field_eb[param4][var15];
                            var15++;
                            continue L28;
                          }
                        }
                      }
                      var13++;
                      continue L27;
                    }
                  }
                }
              }
            }
            break L1;
          }
        }
        var9.field_e = dq.a((byte) -67, td.field_a.length, var8);
        var9.field_l = dq.a((byte) -98, ce.field_G[var9.field_q].length + -1, var8) + 1;
        var10 = dq.a((byte) -62, 5, var8);
        var11 = dq.a((byte) -114, 3, var8);
        var12 = dq.a((byte) -41, 3, var8);
        var13 = var12;
        var13 = var13 | var11 << 4;
        var13 = var13 | var10 << 8;
        var9.field_j = var13;
        return var9;
    }

    public static void g(int param0) {
        field_H = null;
        field_F = null;
        if (param0 != 100) {
            boolean discarded$0 = ha.a(false, (byte) -43);
        }
        field_J = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "To server list";
        field_F = st.c(-23091);
        field_I = 0;
    }
}
