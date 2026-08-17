/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ra extends dj {
    private kq[] field_K;
    static sr field_H;
    static int[][][] field_F;
    private up[] field_M;
    private String[] field_E;
    private int field_J;
    private kp[] field_I;
    static int field_N;
    static String field_O;
    static ot field_L;
    static js field_G;

    final static void a(boolean param0, int param1, iw param2, qb param3) {
        qb stackIn_5_0 = null;
        qb stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        qb stackIn_8_0 = null;
        qb stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        qb stackIn_11_0 = null;
        qb stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        qb stackIn_14_0 = null;
        qb stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        qb stackIn_18_0 = null;
        qb stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        qb stackIn_21_0 = null;
        qb stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        StringBuilder stackIn_44_1 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        qb var10 = null;
        var9 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                param3.field_gc = param2.h((byte) -119);
                break L1;
              }
            }
            L2: {
              param3.field_bc = param2.h((byte) -123);
              param3.field_Wb = param2.h((byte) -126);
              var4_int = param2.h((byte) -109);
              stackIn_5_0 = (qb) (param3);

              if (0 == (128 & var4_int)) {
                stackIn_6_0 = (qb) ((Object) stackIn_5_0);
                stackIn_6_1 = 0;
                break L2;
              } else {
                stackIn_6_0 = (qb) ((Object) stackIn_5_0);
                stackIn_6_1 = 1;
                break L2;
              }
            }
            L3: {
              stackIn_6_0.field_yb = stackIn_6_1 != 0;
              stackIn_8_0 = (qb) (param3);

              if (-1 == (var4_int & 64 ^ -1)) {
                stackIn_9_0 = (qb) ((Object) stackIn_8_0);
                stackIn_9_1 = 0;
                break L3;
              } else {
                stackIn_9_0 = (qb) ((Object) stackIn_8_0);
                stackIn_9_1 = 1;
                break L3;
              }
            }
            L4: {
              stackIn_9_0.field_Cb = stackIn_9_1 != 0;
              stackIn_11_0 = (qb) (param3);

              if ((var4_int & 16) != 0) {
                stackIn_12_0 = (qb) ((Object) stackIn_11_0);
                stackIn_12_1 = 2;
                break L4;
              } else {
                stackIn_12_0 = (qb) ((Object) stackIn_11_0);
                stackIn_12_1 = 1;
                break L4;
              }
            }
            L5: {
              stackIn_12_0.field_Mb = stackIn_12_1;
              stackIn_14_0 = (qb) (param3);

              if (-1 == (var4_int & 32 ^ -1)) {
                stackIn_15_0 = (qb) ((Object) stackIn_14_0);
                stackIn_15_1 = 0;
                break L5;
              } else {
                stackIn_15_0 = (qb) ((Object) stackIn_14_0);
                stackIn_15_1 = 1;
                break L5;
              }
            }
            L6: {
              L7: {
                stackIn_15_0.field_Ub = stackIn_15_1 != 0;
                stackIn_18_0 = (qb) (param3);

                if (!param3.field_yb) {
                  break L7;
                } else {
                  stackIn_18_0 = (qb) ((Object) stackIn_18_0);

                  if (param3.field_bc <= param3.field_gc) {
                    break L7;
                  } else {
                    stackIn_19_0 = (qb) ((Object) stackIn_18_0);
                    stackIn_19_1 = 1;
                    break L6;
                  }
                }
              }
              stackIn_19_0 = (qb) ((Object) stackIn_18_0);
              stackIn_19_1 = 0;
              break L6;
            }
            L8: {
              stackIn_19_0.field_Xb = stackIn_19_1 != 0;
              stackIn_21_0 = (qb) (param3);

              if ((8 & var4_int) == 0) {
                stackIn_22_0 = (qb) ((Object) stackIn_21_0);
                stackIn_22_1 = 0;
                break L8;
              } else {
                stackIn_22_0 = (qb) ((Object) stackIn_21_0);
                stackIn_22_1 = 1;
                break L8;
              }
            }
            L9: {
              stackIn_22_0.field_ic = stackIn_22_1 != 0;
              if (-1 == (4 & var4_int ^ -1)) {
                stackIn_25_0 = 0;
                break L9;
              } else {
                stackIn_25_0 = 1;
                break L9;
              }
            }
            L10: {
              var5 = stackIn_25_0;
              param2.a(param3.field_Eb, 0, (byte) -6, param3.field_Eb.length);
              if ((var4_int & 2) == 0) {
                stackIn_28_0 = 0;
                break L10;
              } else {
                stackIn_28_0 = 1;
                break L10;
              }
            }
            L11: {
              var6 = stackIn_28_0;
              param3.field_Ob = param2.a((byte) 81);
              param3.field_Fb = nj.a(-128) - (long)param2.k(4);
              if (var5 != 0) {
                param3.field_ac = param2.k(4);
                break L11;
              } else {
                param3.field_ac = -1;
                break L11;
              }
            }
            L12: {
              param3.field_Nb = param2.i((byte) -124);
              if (param1 >= 113) {
                break L12;
              } else {
                var10 = (qb) null;
                ra.a(true, -32, (iw) null, (qb) null);
                break L12;
              }
            }
            L13: {
              var7 = param2.field_n;
              param3.field_ec = param2.a(22);
              if (var6 == 0) {
                param3.field_Kb = null;
                break L13;
              } else {
                param3.field_Kb = new String[param3.field_gc];
                param2.field_n = var7;
                var8 = 0;
                L14: while (true) {
                  if (var8 >= param3.field_gc) {
                    break L13;
                  } else {
                    param3.field_Kb[var8] = param2.a(3);
                    var8++;
                    continue L14;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var4 = decompiledCaughtException;
            stackIn_41_0 = (RuntimeException) (var4);

            stackIn_41_1 = new StringBuilder().append("ra.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "null";
              break L15;
            } else {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "{...}";
              break L15;
            }
          }
          L16: {


            stackIn_44_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_42_2).append(',');

            if (param3 == null) {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "null";
              break L16;
            } else {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "{...}";
              break L16;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_42_0), stackIn_45_2 + ')');
        }
    }

    final static int[] a(int param0, int param1, int param2, int param3, int param4) {
        int[] var5;
        int var6;
        int[] var7;
        int[] var8;
        L0: {
          var6 = Kickabout.field_G;
          if (param3 == 0) {
            break L0;
          } else {
            field_L = (ot) null;
            break L0;
          }
        }
        L1: {
          var7 = new int[]{param0, param4};
          var8 = var7;
          var5 = var8;
          if (-639 > (param0 - -param2 ^ -1)) {
            var5[0] = -param2 + 638;
            break L1;
          } else {
            if ((param0 ^ -1) <= -3) {
              break L1;
            } else {
              var7[0] = 2;
              break L1;
            }
          }
        }
        L2: {
          if (-479 <= (param1 + param4 ^ -1)) {
            if (param4 < 2) {
              var8[1] = 2;
              break L2;
            } else {
              break L2;
            }
          } else {
            var5[1] = 478 + -param1;
            break L2;
          }
        }
        return var5;
    }

    final static void i(byte param0) {
        if (param0 >= -16) {
            ra.a(-54, 93, 33, 14, -70);
        }
        k.field_m = null;
    }

    final void a(int param0, boolean param1) {
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_43_0 = 0;
        int[] stackIn_43_1 = null;
        int stackIn_44_0 = 0;
        int[] stackIn_44_1 = null;
        int stackIn_44_2 = 0;
        String[] stackIn_47_0 = null;
        int[] stackIn_47_1 = null;
        String[] stackIn_48_0 = null;
        int[] stackIn_48_1 = null;
        int stackIn_48_2 = 0;
        String stackIn_50_0 = null;
        int[] stackIn_52_0 = null;
        int[] stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        String[] stackIn_56_0 = null;
        int[] stackIn_56_1 = null;
        String[] stackIn_57_0 = null;
        int[] stackIn_57_1 = null;
        int stackIn_57_2 = 0;
        String stackIn_59_0 = null;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_63_2 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_64_2 = 0;
        int stackIn_64_3 = 0;
        int stackIn_66_0;
        int stackIn_66_1;
        int stackIn_66_2;
        int stackIn_66_3;
        int stackIn_67_0;
        int stackIn_67_1;
        int stackIn_67_2;
        int stackIn_67_3;
        int stackIn_67_4;
        int stackIn_81_0 = 0;
        int stackIn_84_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        String var14_ref_String;
        String var15_ref_String;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        kp var22;
        String var23;
        String var24;
        int var25;
        String var26;
        String var27;
        L0: {
          var25 = Kickabout.field_G;
          super.a(param0, param1);
          var3 = 40;
          var4 = 126;
          var5 = 265;
          var6 = 270;
          var7 = 20 + var4;
          var8 = 10;
          var9 = -var8 + var5 - var8;
          var10 = 16;
          if (-1 == (this.field_C ^ -1)) {
            var4 = 200;
            var6 = 230;
            var5 = 380;
            var9 = -var8 + (var5 + -var8);
            var10 = 16;
            var11 = -1;
            var12 = 0;
            L1: while (true) {
              if (-10 >= (var12 ^ -1)) {
                gd.a(-1, 178, this.field_j + 45, (byte) -96, var11);
                var12 = 0;
                L2: while (true) {
                  if (var12 >= 9) {
                    on.a(40 + this.field_j, 120, 560, 50, 10, 65793, 140);
                    pb.field_C.a(tr.field_c, this.field_j - -70, 126, 500, 40, 16777215, -1, 0, 1, 16);
                    on.a(210 + this.field_j, 178, 390, 225, 10, 65793, 140);
                    var12 = 0;
                    var13 = this.field_j + 230;
                    var14 = var4;
                    L3: while (true) {
                      if (ml.field_s.length <= var12) {
                        break L0;
                      } else {
                        var15_ref_String = ml.field_s[var12];
                        var16 = pb.field_C.c(var15_ref_String, var9, var10);
                        if (var14 - -var16 <= var6 + var4) {
                          var14 = var14 + (var10 * pb.field_C.a(var15_ref_String, var13, var14, var9, 999, 16777215, -1, 0, 0, var10) + 20);
                          var12++;
                          continue L3;
                        } else {
                          break L0;
                        }
                      }
                    }
                  } else {
                    this.field_K[var12].field_s = this.field_j + 45 + var12 % 3 * 52;
                    this.field_K[var12].b(0, false);
                    this.field_K[var12].h((byte) -123);
                    var12++;
                    continue L2;
                  }
                }
              } else {
                if (this.field_K[var12].field_gb) {
                  if (!this.field_K[var12].field_Eb.c(-2)) {
                    var11 = var12;
                    var12++;
                    continue L1;
                  } else {
                    var12++;
                    continue L1;
                  }
                } else {
                  var12++;
                  continue L1;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L4: {
          if (-2 != (this.field_C ^ -1)) {
            break L4;
          } else {
            on.a(40 + this.field_j, 120, 560, 50, 10, 65793, 140);
            var6 -= 50;
            pb.field_C.a(jb.field_h, this.field_j - -70, 126, 500, 40, 16777215, -1, 0, 1, 16);
            var4 += 50;
            var11 = 0;
            L5: while (true) {
              if ((var11 ^ -1) <= -3) {
                break L4;
              } else {
                L6: {
                  if (1 != var11) {
                    stackIn_23_0 = 0;
                    break L6;
                  } else {
                    stackIn_23_0 = 1;
                    break L6;
                  }
                }
                L7: {
                  var12 = stackIn_23_0;
                  if (var12 != 0) {
                    stackIn_26_0 = -var5 + (640 - var3 - -var8);
                    break L7;
                  } else {
                    stackIn_26_0 = var8 + var3;
                    break L7;
                  }
                }
                var13 = stackIn_26_0;
                var13 = var13 + this.field_j;
                on.a(-var8 + var13, var4, var5, var6, 10, 65793, 140);
                var14 = 40 + var7;
                var15 = 0;
                L8: while (true) {
                  if (tn.field_g[var11].length > var15) {
                    var26 = tn.field_g[var11][var15];
                    var14 = var14 + (15 - -(pb.field_C.a(var26, var13, var14, var9, 999, 16777215, -1, 0, 0, var10) * var10));
                    var15++;
                    continue L8;
                  } else {
                    var11++;
                    continue L5;
                  }
                }
              }
            }
          }
        }
        L9: {
          if (-3 == (this.field_C ^ -1)) {
            on.a(40 + this.field_j, 120, 560, 50, 10, 65793, 140);
            pb.field_C.a(ll.field_l, this.field_j + 70, 126, 500, 40, 16777215, -1, 0, 1, 16);
            on.a(40 + this.field_j, 178, 275, 225, 10, 65793, 140);
            var4 = 195;
            var11 = 0;
            var6 = 230;
            var12 = this.field_j + 60;
            var13 = var4;
            L10: while (true) {
              L11: {
                if (var11 >= re.field_b.length) {
                  break L11;
                } else {
                  var14_ref_String = re.field_b[var11];
                  var15 = pb.field_C.c(var14_ref_String, var9, var10);
                  if (var15 + var13 > var4 - -var6) {
                    break L11;
                  } else {
                    var11++;
                    var13 = var13 + (20 + pb.field_C.a(var14_ref_String, var12, var13, var9, 999, 16777215, -1, 0, 0, var10) * var10);
                    continue L10;
                  }
                }
              }
              on.a(this.field_j - -325, 178, 275, 225, 10, 65793, 140);
              pt.a(this.field_j + 595, -22914, this.field_j - -330, 398, 183);
              var14 = 7;
              var15 = 110;
              var16 = 40;
              var17 = (var15 << -566610559) / 3;
              var18 = var16 - -10;
              var19 = this.field_J + (-(var17 << 601193249) + this.field_j) - -462;
              var12 = var19;
              var20 = 290 + (-var18 + -25);
              var13 = var20;
              var21 = 0;
              L12: while (true) {
                if (var14 <= var21) {
                  ta.e(125);
                  break L9;
                } else {
                  L13: {
                    if (null == this.field_I) {
                      break L13;
                    } else {
                      if (null == this.field_I[var21]) {
                        break L13;
                      } else {
                        L14: {
                          var22 = this.field_I[var21];
                          stackIn_43_0 = -1;

                          stackIn_43_1 = var22.field_c;

                          if (var22.field_d) {
                            stackIn_44_0 = stackIn_43_0;
                            stackIn_44_1 = (int[]) ((Object) stackIn_43_1);
                            stackIn_44_2 = 1;
                            break L14;
                          } else {
                            stackIn_44_0 = stackIn_43_0;
                            stackIn_44_1 = (int[]) ((Object) stackIn_43_1);
                            stackIn_44_2 = 0;
                            break L14;
                          }
                        }
                        L15: {
                          if (stackIn_44_0 == stackIn_44_1[stackIn_44_2]) {
                            stackIn_50_0 = "";
                            break L15;
                          } else {
                            L16: {
                              stackIn_47_0 = this.field_E;

                              stackIn_47_1 = var22.field_c;

                              if (!var22.field_d) {
                                stackIn_48_0 = (String[]) ((Object) stackIn_47_0);
                                stackIn_48_1 = (int[]) ((Object) stackIn_47_1);
                                stackIn_48_2 = 0;
                                break L16;
                              } else {
                                stackIn_48_0 = (String[]) ((Object) stackIn_47_0);
                                stackIn_48_1 = (int[]) ((Object) stackIn_47_1);
                                stackIn_48_2 = 1;
                                break L16;
                              }
                            }
                            stackIn_50_0 = stackIn_48_0[stackIn_48_1[stackIn_48_2]];
                            break L15;
                          }
                        }
                        L17: {
                          var23 = stackIn_50_0;
                          stackIn_52_0 = var22.field_c;

                          if (!var22.field_d) {
                            stackIn_53_0 = (int[]) ((Object) stackIn_52_0);
                            stackIn_53_1 = 1;
                            break L17;
                          } else {
                            stackIn_53_0 = (int[]) ((Object) stackIn_52_0);
                            stackIn_53_1 = 0;
                            break L17;
                          }
                        }
                        L18: {
                          if (stackIn_53_0[stackIn_53_1] == -1) {
                            stackIn_59_0 = "";
                            break L18;
                          } else {
                            L19: {
                              stackIn_56_0 = this.field_E;

                              stackIn_56_1 = var22.field_c;

                              if (!var22.field_d) {
                                stackIn_57_0 = (String[]) ((Object) stackIn_56_0);
                                stackIn_57_1 = (int[]) ((Object) stackIn_56_1);
                                stackIn_57_2 = 1;
                                break L19;
                              } else {
                                stackIn_57_0 = (String[]) ((Object) stackIn_56_0);
                                stackIn_57_1 = (int[]) ((Object) stackIn_56_1);
                                stackIn_57_2 = 0;
                                break L19;
                              }
                            }
                            stackIn_59_0 = stackIn_57_0[stackIn_57_1[stackIn_57_2]];
                            break L18;
                          }
                        }
                        var24 = stackIn_59_0;
                        eo.a(var22, var23, var24, -(var15 >> 1663632609) + var12, var13 + -(var16 >> 1762643777), var15, var16);
                        on.e(-(var15 >> 1581379777) + var12, var13 + -(var16 >> 148950337), (var15 >> -1457503231) + var12, -(var16 >> 1391494849) + var13, 11184810, 128);
                        on.e(var12 + -(var15 >> 1677071201), (var16 >> 449720481) + var13, var12 - -(var15 >> -1095734239), var13 - -(var16 >> -1255871839), 11184810, 128);
                        on.e(var12 + -(var15 >> -950785151), -(var16 >> -1999930079) + (var13 - -1), -(var15 >> 368453185) + var12, -1 + ((var16 >> -1344775967) + var13), 11184810, 128);
                        on.e((var15 >> -708761311) + var12, var13 - -(var16 >> 1986262657) + -1, (var15 >> -410200383) + var12, 1 + (var13 + -(var16 >> 1949816577)), 11184810, 128);
                        on.e(-(var15 >> -2116250335) + var12 + 1, var13, -1 + (var15 >> -1668557663) + var12, var13, 11184810, 128);
                        on.e((var15 >> -859176063) + (var12 + -19), 1 + var13 - (var16 >> 1592140385), (var15 >> -1480971039) + var12 + -19, -1 + var13 - -(var16 >> -457248447), 11184810, 128);
                        break L13;
                      }
                    }
                  }
                  L20: {
                    if (var21 == -1 + var14) {
                      break L20;
                    } else {
                      L21: {
                        stackIn_63_0 = (var15 >> -511337695) + var12;

                        stackIn_63_1 = var13;

                        stackIn_63_2 = -(var15 >> -1043032479) + ((var17 << -1185834527) + var12);

                        if (var21 % 2 == 0) {
                          stackIn_64_0 = stackIn_63_0;
                          stackIn_64_1 = stackIn_63_1;
                          stackIn_64_2 = stackIn_63_2;
                          stackIn_64_3 = var18 >> -1685263167;
                          break L21;
                        } else {
                          stackIn_64_0 = stackIn_63_0;
                          stackIn_64_1 = stackIn_63_1;
                          stackIn_64_2 = stackIn_63_2;
                          stackIn_64_3 = -(var18 >> 546752609);
                          break L21;
                        }
                      }
                      L22: {
                        on.b(stackIn_64_0, stackIn_64_1, stackIn_64_2, stackIn_64_3 + var13, 11184810);
                        stackIn_66_0 = var12 + (var15 >> -873390239);

                        stackIn_66_1 = 1 + var13;

                        stackIn_66_2 = var12 - (-(var17 << 959424129) - -(var15 >> -1325998015));

                        stackIn_66_3 = 1 + var13;

                        if (-1 == (var21 % 2 ^ -1)) {
                          stackIn_67_0 = stackIn_66_0;
                          stackIn_67_1 = stackIn_66_1;
                          stackIn_67_2 = stackIn_66_2;
                          stackIn_67_3 = stackIn_66_3;
                          stackIn_67_4 = var18 >> -1676736159;
                          break L22;
                        } else {
                          stackIn_67_0 = stackIn_66_0;
                          stackIn_67_1 = stackIn_66_1;
                          stackIn_67_2 = stackIn_66_2;
                          stackIn_67_3 = stackIn_66_3;
                          stackIn_67_4 = -(var18 >> -21617023);
                          break L22;
                        }
                      }
                      on.b(stackIn_67_0, stackIn_67_1, stackIn_67_2, stackIn_67_3 - -stackIn_67_4, 11184810);
                      break L20;
                    }
                  }
                  L23: {
                    var13 = var13 + var18;
                    if (var21 == var14 + -8) {
                      break L23;
                    } else {
                      if (var21 == var14 - 4) {
                        break L23;
                      } else {
                        if (var21 == -2 + var14) {
                          break L23;
                        } else {
                          var21++;
                          continue L12;
                        }
                      }
                    }
                  }
                  var20 = var20 + (var18 >> -1879913247);
                  var19 = var19 + (var17 << -981742847);
                  var13 = var20;
                  var12 = var19;
                  var18 = var18 << 1;
                  var21++;
                  continue L12;
                }
              }
            }
          } else {
            break L9;
          }
        }
        L24: {
          if (3 == this.field_C) {
            var11 = 0;
            L25: while (true) {
              if (2 <= var11) {
                break L24;
              } else {
                L26: {
                  if ((var11 ^ -1) != -2) {
                    stackIn_81_0 = 0;
                    break L26;
                  } else {
                    stackIn_81_0 = 1;
                    break L26;
                  }
                }
                L27: {
                  var12 = stackIn_81_0;
                  if (var12 != 0) {
                    stackIn_84_0 = var8 + (-var5 + 640 + -var3);
                    break L27;
                  } else {
                    stackIn_84_0 = var8 + var3;
                    break L27;
                  }
                }
                var13 = stackIn_84_0;
                var13 = var13 + this.field_j;
                var14 = var7 + -5;
                on.a(var13 - var8, var4, var5, var6, 10, 65793, 140);
                var15 = 0;
                L28: while (true) {
                  if (va.field_y[var11].length <= var15) {
                    var11++;
                    continue L25;
                  } else {
                    var27 = va.field_y[var11][var15];
                    var14 = var14 + (pb.field_C.a(var27, var13, var14, var9, 999, 16777215, -1, 0, 0, var10) * var10 + 15);
                    var15++;
                    continue L28;
                  }
                }
              }
            }
          } else {
            break L24;
          }
        }
    }

    public static void g(int param0) {
        field_O = null;
        field_F = (int[][][]) null;
        field_H = null;
        field_G = null;
        field_L = null;
        if (param0 != 128) {
            field_L = (ot) null;
        }
    }

    final void a(byte param0, boolean param1) {
        int var4_int = 0;
        double var4 = 0.0;
        int var6 = Kickabout.field_G;
        super.a((byte) 104, param1);
        int var3 = -118 / ((param0 - 38) / 60);
        if (this.field_C == 0) {
            for (var4_int = 0; 9 > var4_int; var4_int++) {
                this.field_K[var4_int].b(0, param1);
                this.field_K[var4_int].a(31, 11, (byte) 125, 16, this.field_M[var4_int]);
            }
        }
        if ((this.field_C ^ -1) == -3) {
            var4 = (double)(nj.a(61) >> -1577102267);
            this.field_J = (int)(Math.sin(var4 * 3.141592653589793 / 256.0) * 140.0);
        }
    }

    final void b(int param0) {
        int var4 = 0;
        up var5 = null;
        int var3 = 0;
        int var6 = Kickabout.field_G;
        Random var7 = new Random();
        for (var3 = 0; -10 < (var3 ^ -1); var3++) {
            this.field_M[var3] = new up();
            var4 = 0;
            if (!(-3 <= (var3 ^ -1))) {
                var4 = 3;
            }
            if (!(5 >= var3)) {
                var4 = 1;
            }
            var5 = this.field_M[var3];
            var5.field_r = 0;
            var5.field_n = 50;
            var5.field_g = 50;
            var5.field_q = var4;
            var5.field_o = 50;
            var5.field_l = dq.a((byte) -110, ce.field_G[var5.field_q].length, var7);
            var5.field_e = dq.a((byte) -92, td.field_a.length, var7);
            var5.field_j = var5.field_j | dq.a((byte) -62, 3, var7);
            var5.field_j = var5.field_j | dq.a((byte) 95, 3, var7) << 373289892;
            var5.field_j = var5.field_j | dq.a((byte) 91, 5, var7) << -1842280152;
            this.field_K[var3] = new kq();
            this.field_K[var3].field_s = 45 - -(var3 % 3 * 52);
            this.field_K[var3].field_J = var3 / 3 * 75 + 178;
        }
        this.field_E = new String[]{"Mod_Iain", "Mod_Thomas", "Mod_Shade", "Mod_Korpz", "Mod_Zeph", "Mod_Thor", "Mod_Wivlaro", "Mod_Crispy"};
        this.field_I = new kp[7];
        for (var3 = 0; this.field_I.length > var3; var3++) {
            this.field_I[var3] = new kp();
            this.field_I[var3].field_f = 5;
            this.field_I[var3].field_o = 0;
        }
        this.field_I[0].field_c = new int[]{0, 1};
        this.field_I[0].field_j = 2;
        this.field_I[0].field_b = 1;
        this.field_I[2].field_o = 1;
        this.field_I[1].field_b = 0;
        if (param0 != -38) {
            return;
        }
        this.field_I[1].field_c = new int[]{2, 3};
        this.field_I[1].field_j = 3;
        this.field_I[2].field_j = 0;
        this.field_I[2].field_c = new int[]{5, 4};
        this.field_I[2].field_b = 1;
        this.field_I[3].field_b = 0;
        this.field_I[3].field_c = new int[]{6, 7};
        this.field_I[3].field_j = 5;
        this.field_I[4].field_o = 1;
        this.field_I[4].field_j = 2;
        this.field_I[4].field_c = new int[]{2, 0};
        this.field_I[4].field_b = 4;
        this.field_I[5].field_j = 3;
        this.field_I[5].field_c = new int[]{4, 6};
        this.field_I[5].field_b = 1;
        this.field_I[6].field_j = 1;
        this.field_I[6].field_c = new int[]{0, 4};
        this.field_I[6].field_b = 0;
    }

    ra() {
        this.field_K = new kq[9];
        this.field_M = new up[9];
    }

    static {
        field_F = new int[33][33][33];
        field_H = (sr) ((Object) new en());
        field_N = 7;
        field_O = "Play free version";
    }
}
