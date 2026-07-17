/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class no extends cj {
    static String field_Fb;
    static int field_Gb;
    static ja[][] field_Hb;
    private cj field_Ib;
    static String field_Kb;
    static ri field_Jb;

    final static void c(byte param0) {
        int var1 = 0;
        if (null != sb.field_k) {
            String var2 = sb.field_k;
            cf.a((byte) -61, vl.a(lp.field_h, new String[1], 2));
            sb.field_k = null;
        }
    }

    final static String a(boolean param0, int param1, CharSequence param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_14_0 = null;
        String stackIn_19_0 = null;
        Object stackIn_22_0 = null;
        String stackIn_32_0 = null;
        String stackIn_37_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_36_0 = null;
        String stackOut_31_0 = null;
        Object stackOut_21_0 = null;
        String stackOut_18_0 = null;
        String stackOut_13_0 = null;
        String stackOut_8_0 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param2 == null) {
              stackOut_3_0 = bg.field_q;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                var3_int = param2.length();
                if (var3_int < 1) {
                  break L1;
                } else {
                  if (var3_int <= 12) {
                    L2: {
                      var4 = tg.a(param2, false);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (var4.length() < 1) {
                          break L2;
                        } else {
                          L3: {
                            if (eb.a((byte) -104, var4.charAt(0))) {
                              break L3;
                            } else {
                              if (eb.a((byte) -119, var4.charAt(-1 + var4.length()))) {
                                break L3;
                              } else {
                                var5 = 0;
                                if (param1 < -11) {
                                  var6 = 0;
                                  L4: while (true) {
                                    if (var6 >= param2.length()) {
                                      if (0 < var5) {
                                        stackOut_36_0 = th.field_a;
                                        stackIn_37_0 = stackOut_36_0;
                                        break L0;
                                      } else {
                                        return null;
                                      }
                                    } else {
                                      L5: {
                                        var7 = param2.charAt(var6);
                                        if (eb.a((byte) 94, (char) var7)) {
                                          var5++;
                                          break L5;
                                        } else {
                                          var5 = 0;
                                          break L5;
                                        }
                                      }
                                      L6: {
                                        if (2 > var5) {
                                          break L6;
                                        } else {
                                          if (!param0) {
                                            stackOut_31_0 = hn.field_a;
                                            stackIn_32_0 = stackOut_31_0;
                                            return stackIn_32_0;
                                          } else {
                                            break L6;
                                          }
                                        }
                                      }
                                      var6++;
                                      continue L4;
                                    }
                                  }
                                } else {
                                  stackOut_21_0 = null;
                                  stackIn_22_0 = stackOut_21_0;
                                  return (String) (Object) stackIn_22_0;
                                }
                              }
                            }
                          }
                          stackOut_18_0 = th.field_a;
                          stackIn_19_0 = stackOut_18_0;
                          return stackIn_19_0;
                        }
                      }
                    }
                    stackOut_13_0 = bg.field_q;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_8_0 = bg.field_q;
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var3;
            stackOut_39_1 = new StringBuilder().append("no.DA(").append(param0).append(44).append(param1).append(44);
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param2 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L7;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L7;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + 41);
        }
        return stackIn_37_0;
    }

    final static bm a(byte param0, byte[] param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int[] var14 = null;
        int var14_int = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[][] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        bm stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        bm stackOut_15_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var16 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var2_int = 1;
            int incrementValue$12 = var2_int;
            var2_int++;
            var3 = re.a(param1, incrementValue$12, (byte) 86);
            int incrementValue$13 = var2_int;
            var2_int++;
            var4 = re.a(param1, incrementValue$13, (byte) 99);
            int incrementValue$14 = var2_int;
            var2_int++;
            var5 = re.a(param1, incrementValue$14, (byte) 113);
            var31 = new int[4];
            var27 = var31;
            var23 = var27;
            var19 = var23;
            var6 = var19;
            var32 = new int[4];
            var28 = var32;
            var24 = var28;
            var20 = var24;
            var7 = var20;
            var8 = 0;
            L1: while (true) {
              if (var8 >= 4) {
                int incrementValue$15 = var2_int;
                var2_int++;
                var8 = re.a(param1, incrementValue$15, (byte) 75);
                int incrementValue$16 = var2_int;
                var2_int++;
                var9 = re.a(param1, incrementValue$16, (byte) 112);
                int incrementValue$17 = var2_int;
                var2_int++;
                var10 = re.a(param1, incrementValue$17, (byte) 113);
                int incrementValue$18 = var2_int;
                var2_int++;
                var11 = re.a(param1, incrementValue$18, (byte) 67);
                var29 = new int[var11][var10];
                var13 = 0;
                L2: while (true) {
                  if (var13 >= var11) {
                    int incrementValue$19 = var2_int;
                    var2_int++;
                    var13 = re.a(param1, incrementValue$19, (byte) 59);
                    var30 = new int[var13 * 4];
                    var26 = var30;
                    var22 = var26;
                    var18 = var22;
                    var14 = var18;
                    var15 = 0;
                    L3: while (true) {
                      if (var15 >= 4 * var13) {
                        L4: {
                          if (param0 == 104) {
                            break L4;
                          } else {
                            field_Hb = null;
                            break L4;
                          }
                        }
                        stackOut_15_0 = new bm(var29, var30, var3, var4, var5, var31, var32, var8, var9);
                        stackIn_16_0 = stackOut_15_0;
                        break L0;
                      } else {
                        int incrementValue$20 = var2_int;
                        var2_int++;
                        var14[var15] = re.a(param1, incrementValue$20, (byte) 62);
                        var15++;
                        continue L3;
                      }
                    }
                  } else {
                    var14_int = 0;
                    L5: while (true) {
                      if (var14_int >= var10) {
                        var13++;
                        continue L2;
                      } else {
                        int incrementValue$21 = var2_int;
                        var2_int++;
                        var29[var13][var14_int] = re.a(param1, incrementValue$21, (byte) 71);
                        var14_int++;
                        continue L5;
                      }
                    }
                  }
                }
              } else {
                int incrementValue$22 = var2_int;
                var2_int++;
                var6[var8] = re.a(param1, incrementValue$22, (byte) 56);
                int incrementValue$23 = var2_int;
                var2_int++;
                var7[var8] = re.a(param1, incrementValue$23, (byte) 88);
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2;
            stackOut_17_1 = new StringBuilder().append("no.CA(").append(param0).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
        return stackIn_16_0;
    }

    public static void h(int param0) {
        field_Fb = null;
        field_Jb = null;
        field_Hb = null;
        field_Kb = null;
    }

    final boolean b(int param0, boolean param1) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        if (param0 == 0) {
          L0: {
            L1: {
              L2: {
                ((no) this).a(param0 ^ -11838, true);
                if (kd.field_b == 0) {
                  break L2;
                } else {
                  if (((no) this).field_T == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (((no) this).field_Ib.field_T == 0) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                break L1;
              }
            }
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L0;
          }
          return stackIn_9_0 != 0;
        } else {
          return true;
        }
    }

    no(cj param0, cj param1, cj param2, cj param3, cj param4, cj param5) {
        RuntimeException var7 = null;
        cj var8 = null;
        cj var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        cj var13 = null;
        cj var14 = null;
        int var15 = 0;
        cj var17 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            var17 = new cj(0L, param1, le.field_I.toUpperCase());
            var17.field_R = 1;
            ((no) this).field_Ib = new cj(0L, param2);
            var8 = new cj(0L, param3);
            var9 = new cj(0L, param3, qa.field_j);
            var9.field_R = 1;
            var10 = 50;
            var11 = 0;
            var12 = 0;
            L1: while (true) {
              if (lj.field_h.length <= var12) {
                var10 += 15;
                var17.a(24, 0, 20 + var11 - -90, 0, -3344);
                ((no) this).a(var10 + var17.field_z, 100, var17.field_zb, 100, -3344);
                ((no) this).field_Ib.a(15, 5, 15, -20 + var17.field_zb, -3344);
                var8.a(((no) this).field_z - var17.field_z, var17.field_z, ((no) this).field_zb, 0, -3344);
                var9.a(15, 20, ((no) this).field_zb, 0, -3344);
                var8.field_ab = tg.a(2105376, var8.field_z, 8421504, 3, 11579568, 102);
                var17.a((byte) 50, ((no) this).field_Ib);
                var8.a((byte) 50, var9);
                ((no) this).a((byte) 50, var17);
                ((no) this).a((byte) 50, var8);
                var10 = -(((no) this).field_z >> 1) + 240;
                ((no) this).field_x = 320 + -(((no) this).field_zb >> 1);
                break L0;
              } else {
                L2: {
                  var13 = new cj(0L, param3, cm.field_c[var12]);
                  var14 = new cj(0L, param3, lj.field_h[var12]);
                  var15 = param3.field_yb.a(lj.field_h[var12]);
                  var13.a(15, var10, 65, 20, -3344);
                  if (var11 >= var15) {
                    break L2;
                  } else {
                    var11 = var15;
                    break L2;
                  }
                }
                var14.a(15, var10, 640, 90, -3344);
                var8.a((byte) 50, var13);
                var8.a((byte) 50, var14);
                var10 += 30;
                var12++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var7;
            stackOut_8_1 = new StringBuilder().append("no.<init>(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param4 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          L8: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param5 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Fb = "Left-click or press 'ESC' to skip cutscene";
        field_Hb = new ja[2][];
        field_Kb = "Make them tremble and shake.";
    }
}
