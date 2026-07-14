/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hg extends to {
    static String field_z;
    static ca field_y;
    private int field_v;
    private int field_u;
    private int field_A;
    private boolean field_E;
    private boolean field_w;
    private int field_B;
    static gk field_x;
    static int field_D;
    static int[] field_C;

    final boolean a(int param0, int param1, int param2, int param3, int param4, ea param5, int param6) {
        int var8 = this.a((int) (char)param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
        if (var8 != 0) {
            if (((hg) this).field_E) {
                return true;
            }
        }
        if (!((hg) this).a(param6, param4, -73, param1, param2)) {
            return var8 != 0;
        }
        ((hg) this).field_i = param3;
        if (param3 == 1) {
            ((hg) this).field_A = -param4 + (param6 + -((hg) this).field_h);
            mm.field_a = (hg) this;
            ((hg) this).field_B = -param1 + (-((hg) this).field_p + param2);
            return true;
        }
        return true;
    }

    final static fr a(int param0, String param1) {
        if (param0 != 2147483647) {
            hg.j(-34);
        }
        if (nb.field_c == jq.field_fb) {
            return null;
        }
        if (uk.field_j == nb.field_c) {
            if (param1.equals((Object) (Object) ua.field_j)) {
                nb.field_c = dk.field_h;
                return vb.field_l;
            }
        }
        vb.field_l = null;
        ua.field_j = param1;
        nb.field_c = jq.field_fb;
        return null;
    }

    final StringBuilder a(StringBuilder param0, int param1, int param2, Hashtable param3) {
        if (((hg) this).a(param0, param2, false, param3)) {
            ((hg) this).a(param0, 0, param3, param2);
            ((hg) this).a(param0, param3, (byte) -24, param2);
            StringBuilder discarded$22 = param0.append(" revert=").append(((hg) this).field_w);
            if (-2147483648 != (((hg) this).field_u ^ -1)) {
                if (!(2147483647 == ((hg) this).field_v)) {
                    StringBuilder discarded$23 = param0.append(" to ").append(((hg) this).field_u).append(44).append(((hg) this).field_v);
                }
            }
        }
        if (param1 != 32462) {
            ((hg) this).field_w = false;
        }
        return param0;
    }

    final static void a(boolean param0, boolean param1, boolean param2) {
        if (!param1) {
            return;
        }
        String var4 = (String) null;
        hr.a(param2, (String) null, param0, (byte) -61);
    }

    private hg(int param0, int param1, int param2, int param3, ir param4, no param5, ea param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((hg) this).field_u = 2147483647;
        ((hg) this).field_v = 2147483647;
        ((hg) this).field_E = param8 ? true : false;
        ((hg) this).field_s = param6;
        ((hg) this).field_w = param7 ? true : false;
    }

    final void a(byte param0, ea param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        L0: {
          L1: {
            L2: {
              if (!(((hg) this).field_s instanceof mi)) {
                break L2;
              } else {
                if (!((mi) ((hg) this).field_s).field_u) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            if ((((hg) this).field_i ^ -1) == -2) {
              L3: {
                var5 = -param3 + (-((hg) this).field_B + ic.field_b);
                var6 = -param2 + cf.field_g - ((hg) this).field_A;
                if (((hg) this).field_p != var5) {
                  break L3;
                } else {
                  if (var6 == ((hg) this).field_h) {
                    break L0;
                  } else {
                    break L3;
                  }
                }
              }
              ((hg) this).field_h = var6;
              ((hg) this).field_p = var5;
              if (!(((hg) this).field_o instanceof ih)) {
                break L0;
              } else {
                ((ih) ((hg) this).field_o).a((hg) this, param2, param3, (byte) -105);
                break L0;
              }
            } else {
              break L1;
            }
          }
          if (!((hg) this).field_w) {
            break L0;
          } else {
            L4: {
              if (((hg) this).field_p == ((hg) this).field_u) {
                break L4;
              } else {
                L5: {
                  var5 = ((hg) this).field_u - ((hg) this).field_p;
                  stackOut_7_0 = this;
                  stackOut_7_1 = ((hg) this).field_p;
                  stackIn_11_0 = stackOut_7_0;
                  stackIn_11_1 = stackOut_7_1;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  if (-3 > (Math.abs(var5) ^ -1)) {
                    stackOut_11_0 = this;
                    stackOut_11_1 = stackIn_11_1;
                    stackOut_11_2 = var5 >> -1350981631;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    break L5;
                  } else {
                    stackOut_8_0 = this;
                    stackOut_8_1 = stackIn_8_1;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    if (var5 > 0) {
                      stackOut_10_0 = this;
                      stackOut_10_1 = stackIn_10_1;
                      stackOut_10_2 = 1;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      stackIn_12_2 = stackOut_10_2;
                      break L5;
                    } else {
                      stackOut_9_0 = this;
                      stackOut_9_1 = stackIn_9_1;
                      stackOut_9_2 = -1;
                      stackIn_12_0 = stackOut_9_0;
                      stackIn_12_1 = stackOut_9_1;
                      stackIn_12_2 = stackOut_9_2;
                      break L5;
                    }
                  }
                }
                ((hg) this).field_p = stackIn_12_1 + stackIn_12_2;
                break L4;
              }
            }
            if (((hg) this).field_v != ((hg) this).field_h) {
              var5 = -((hg) this).field_h + ((hg) this).field_v;
              stackOut_15_0 = this;
              stackOut_15_1 = ((hg) this).field_h;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              if ((Math.abs(var5) ^ -1) >= -3) {
                L6: {
                  stackOut_17_0 = this;
                  stackOut_17_1 = stackIn_17_1;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  if (0 >= var5) {
                    stackOut_19_0 = this;
                    stackOut_19_1 = stackIn_19_1;
                    stackOut_19_2 = -1;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    stackIn_20_2 = stackOut_19_2;
                    break L6;
                  } else {
                    stackOut_18_0 = this;
                    stackOut_18_1 = stackIn_18_1;
                    stackOut_18_2 = 1;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_20_1 = stackOut_18_1;
                    stackIn_20_2 = stackOut_18_2;
                    break L6;
                  }
                }
                ((hg) this).field_h = stackIn_20_1 + stackIn_20_2;
                break L0;
              } else {
                ((hg) this).field_h = stackIn_16_1 + (var5 >> 1106622657);
                break L0;
              }
            } else {
              break L0;
            }
          }
        }
        L7: {
          this.a((byte) 40, param1, param2, param3);
          if (param0 >= 13) {
            break L7;
          } else {
            ((hg) this).field_w = false;
            break L7;
          }
        }
    }

    public static void j(int param0) {
        field_y = null;
        field_C = null;
        field_x = null;
        if (param0 != 65793) {
            field_D = 4;
        }
        field_z = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, wu param7) {
        int[] var8 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        me var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        int var44 = 0;
        wu var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        int[] var60 = null;
        byte[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int[] var66 = null;
        int[] var67 = null;
        int stackIn_13_0 = 0;
        int[] stackIn_14_0 = null;
        int[] stackIn_15_0 = null;
        int[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        me stackIn_37_0 = null;
        int stackIn_42_0 = 0;
        int stackIn_46_0 = 0;
        short stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_26_0 = 0;
        short stackOut_25_0 = 0;
        int stackOut_29_0 = 0;
        short stackOut_28_0 = 0;
        me stackOut_35_0 = null;
        Object stackOut_36_0 = null;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int[] stackOut_13_0 = null;
        int[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        L0: {
          L1: {
            var40 = AceOfSkies.field_G ? 1 : 0;
            var45 = param7;
            if (((wu) var45).field_x == null) {
              break L1;
            } else {
              if (1 >= ((wu) var45).field_f) {
                break L1;
              } else {
                var62 = ((wu) var45).field_x;
                nr.a(hs.field_a, false, var62, 0, 0);
                break L0;
              }
            }
          }
          pn.a(true);
          break L0;
        }
        var66 = new int[((wu) param7).field_q];
        var60 = var66;
        var55 = var60;
        var50 = var55;
        var41 = var50;
        var8 = var41;
        var67 = new int[((wu) param7).field_q];
        var64 = ip.field_b;
        var63 = ql.field_o;
        var65 = dq.field_c;
        var13 = 0;
        L2: while (true) {
          if (var13 >= ((wu) param7).field_q) {
            if (param5 == 255) {
              var44 = 0;
              var13 = var44;
              L3: while (true) {
                if (gb.field_k <= var44) {
                  return;
                } else {
                  L4: {
                    var14 = jr.field_n[var44];
                    var15 = ((wu) param7).field_I[var14];
                    var16 = ((wu) param7).field_t[var14];
                    var17 = ((wu) param7).field_m[var14];
                    if (ip.field_b.length > ((wu) param7).field_B[var14]) {
                      stackOut_23_0 = ((wu) param7).field_B[var14];
                      stackIn_24_0 = stackOut_23_0;
                      break L4;
                    } else {
                      stackOut_22_0 = -1;
                      stackIn_24_0 = stackOut_22_0;
                      break L4;
                    }
                  }
                  L5: {
                    var18 = stackIn_24_0;
                    if (((wu) param7).field_g[var14] >= ip.field_b.length) {
                      stackOut_26_0 = -1;
                      stackIn_27_0 = stackOut_26_0;
                      break L5;
                    } else {
                      stackOut_25_0 = ((wu) param7).field_g[var14];
                      stackIn_27_0 = stackOut_25_0;
                      break L5;
                    }
                  }
                  L6: {
                    var19 = stackIn_27_0;
                    if (ip.field_b.length <= ((wu) param7).field_D[var14]) {
                      stackOut_29_0 = -1;
                      stackIn_30_0 = stackOut_29_0;
                      break L6;
                    } else {
                      stackOut_28_0 = ((wu) param7).field_D[var14];
                      stackIn_30_0 = stackOut_28_0;
                      break L6;
                    }
                  }
                  L7: {
                    L8: {
                      var20 = stackIn_30_0;
                      if (null == gj.field_a) {
                        break L8;
                      } else {
                        if (null == ((wu) param7).field_u) {
                          break L8;
                        } else {
                          if (var14 >= ((wu) param7).field_u.length) {
                            break L8;
                          } else {
                            if (-1 == ((wu) param7).field_u[var14]) {
                              break L8;
                            } else {
                              if (((wu) param7).field_u[var14] >= gj.field_a.length) {
                                break L8;
                              } else {
                                stackOut_35_0 = gj.field_a[((wu) param7).field_u[var14]];
                                stackIn_37_0 = stackOut_35_0;
                                break L7;
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_36_0 = null;
                    stackIn_37_0 = (me) (Object) stackOut_36_0;
                    break L7;
                  }
                  L9: {
                    var21 = (me) (Object) stackIn_37_0;
                    var22 = qj.field_t[var15];
                    var23 = ro.field_t[var15];
                    var24 = qj.field_t[var16];
                    var25 = ro.field_t[var16];
                    var26 = qj.field_t[var17];
                    var27 = ro.field_t[var17];
                    if (var18 != var19) {
                      break L9;
                    } else {
                      if (var20 != var19) {
                        break L9;
                      } else {
                        L10: {
                          var28 = var66[var18];
                          var29 = var67[var18];
                          if (var21 != null) {
                            stackOut_41_0 = ((me) var21).field_c;
                            stackIn_42_0 = stackOut_41_0;
                            break L10;
                          } else {
                            stackOut_40_0 = 8355711;
                            stackIn_42_0 = stackOut_40_0;
                            break L10;
                          }
                        }
                        var30 = stackIn_42_0;
                        var31 = var30 & 16711935;
                        var32 = 65280 & var30;
                        var33 = var32 * var28 >>> -1341943768 & -872349952 | (var31 * var28 & -16711822) >>> 1649443624;
                        var33 = var33 + var29 * 65793;
                        gq.a((byte) 114, var26, var22, var23, var24, var27, (var33 & 16711422) >> 735631809, var25);
                        var44++;
                        continue L3;
                      }
                    }
                  }
                  L11: {
                    var28 = var66[var18];
                    var29 = var66[var19];
                    var30 = var66[var20];
                    var31 = var67[var18];
                    var32 = var67[var19];
                    var33 = var67[var20];
                    if (var21 != null) {
                      stackOut_45_0 = ((me) var21).field_c;
                      stackIn_46_0 = stackOut_45_0;
                      break L11;
                    } else {
                      stackOut_44_0 = 8355711;
                      stackIn_46_0 = stackOut_44_0;
                      break L11;
                    }
                  }
                  var34 = stackIn_46_0;
                  var35 = var34 & 16711935;
                  var36 = 65280 & var34;
                  var37 = (-16711791 & var35 * var28) >>> -945509880 | 1191247616 & var28 * var36 >>> 1569446696;
                  var38 = var29 * var36 >>> -1522795352 & -369033472 | (-16711873 & var29 * var35) >>> -66979544;
                  var37 = var37 + var31 * 65793;
                  var39 = (var30 * var36 & 16711894) >>> 1769307752 | (var35 * var30 & -16711830) >>> -1385830456;
                  var38 = var38 + 65793 * var32;
                  var39 = var39 + 65793 * var33;
                  pl.a(var37 & 255, var23, var22, var24, var27, 255 & var37 >> -2061370584, var38 >> -1083607224 & 255, var39 >> -1163684400, var25, var39 & 255, var37 >> 290882832, 255 & var38, (var39 & 65506) >> 238060232, var38 >> 276267792, var26, false);
                  var44++;
                  continue L3;
                }
              }
            } else {
              return;
            }
          } else {
            L12: {
              var14 = param1 * var63[var13] + var64[var13] * param6 - -(var65[var13] * param4) >> -491087512;
              if (0 <= var14) {
                break L12;
              } else {
                var14 = -var14;
                break L12;
              }
            }
            L13: {
              if (-1 < (var14 ^ -1)) {
                stackOut_12_0 = 128;
                stackIn_13_0 = stackOut_12_0;
                break L13;
              } else {
                if (128 <= var14) {
                  stackOut_11_0 = 256;
                  stackIn_13_0 = stackOut_11_0;
                  break L13;
                } else {
                  stackOut_10_0 = 128 - -var14;
                  stackIn_13_0 = stackOut_10_0;
                  break L13;
                }
              }
            }
            L14: {
              var14 = stackIn_13_0;
              var15 = var65[var13] * param0 + var63[var13] * param2 + param3 * var64[var13] >> 774752168;
              stackOut_13_0 = em.field_b;
              stackIn_15_0 = stackOut_13_0;
              stackIn_14_0 = stackOut_13_0;
              if (var15 < 0) {
                stackOut_15_0 = (int[]) (Object) stackIn_15_0;
                stackOut_15_1 = -var15;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                break L14;
              } else {
                stackOut_14_0 = (int[]) (Object) stackIn_14_0;
                stackOut_14_1 = var15;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                break L14;
              }
            }
            var15 = stackIn_16_0[stackIn_16_1];
            var14 = (256 - var15) * var14 >>> -1944055608;
            var66[var13] = var14;
            var67[var13] = var15;
            var13++;
            continue L2;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, ea param4, byte param5) {
        this.a(param0, param1, param2, param3, param4, param5);
        ((hg) this).field_i = 0;
    }

    final void a(byte param0) {
        this.a((byte) -112);
        int var2 = 117 % ((-13 - param0) / 50);
        ((hg) this).field_s.a(((hg) this).field_n, 0, 0, ((hg) this).field_q, (byte) 127);
        ((hg) this).field_v = ((hg) this).field_h;
        ((hg) this).field_u = ((hg) this).field_p;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Retry";
    }
}
