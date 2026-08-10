/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class no extends cj {
    static String field_Fb;
    static int field_Gb;
    static ja[][] field_Hb;
    private cj field_Ib;
    static String field_Kb;
    static ri field_Jb;

    final static void c(byte param0) {
        String var2 = null;
        int var1 = -7 % ((-1 - param0) / 63);
        if (null != sb.field_k) {
            var2 = sb.field_k;
            cf.a((byte) -61, vl.a(lp.field_h, new String[]{var2}, 2));
            sb.field_k = null;
        }
    }

    final static String a(boolean param0, int param1, CharSequence param2) {
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_14_0 = null;
        String stackIn_19_0 = null;
        String stackIn_22_0 = null;
        String stackIn_32_0 = null;
        String stackIn_37_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param2 == null) {
              stackIn_4_0 = bg.field_q;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var3_int = param2.length();
                if (-2 < (var3_int ^ -1)) {
                  break L1;
                } else {
                  if (-13 <= (var3_int ^ -1)) {
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
                                        stackIn_37_0 = th.field_a;
                                        decompiledRegionSelector0 = 6;
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
                                            stackIn_32_0 = hn.field_a;
                                            decompiledRegionSelector0 = 5;
                                            break L0;
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
                                  stackIn_22_0 = (String) null;
                                  decompiledRegionSelector0 = 4;
                                  break L0;
                                }
                              }
                            }
                          }
                          stackIn_19_0 = th.field_a;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    }
                    stackIn_14_0 = bg.field_q;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              stackIn_9_0 = bg.field_q;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_41_0 = (RuntimeException) (var3);

            stackIn_41_1 = new StringBuilder().append("no.DA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "null";
              break L7;
            } else {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "{...}";
              break L7;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_22_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_32_0;
                  } else {
                    return stackIn_37_0;
                  }
                }
              }
            }
          }
        }
    }

    final static bm a(byte param0, byte[] param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        bm stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
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
        int[][] var26 = null;
        var16 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var2_int = 1;
            incrementValue$0 = var2_int;
            var2_int++;
            var3 = re.a(param1, incrementValue$0, (byte) 86);
            incrementValue$1 = var2_int;
            var2_int++;
            var4 = re.a(param1, incrementValue$1, (byte) 99);
            incrementValue$2 = var2_int;
            var2_int++;
            var5 = re.a(param1, incrementValue$2, (byte) 113);
            var23 = new int[4];
            var19 = var23;
            var6 = var19;
            var24 = new int[4];
            var20 = var24;
            var7 = var20;
            var8 = 0;
            L1: while (true) {
              if (-5 >= (var8 ^ -1)) {
                incrementValue$3 = var2_int;
                var2_int++;
                var8 = re.a(param1, incrementValue$3, (byte) 75);
                incrementValue$4 = var2_int;
                var2_int++;
                var9 = re.a(param1, incrementValue$4, (byte) 112);
                incrementValue$5 = var2_int;
                var2_int++;
                var10 = re.a(param1, incrementValue$5, (byte) 113);
                incrementValue$6 = var2_int;
                var2_int++;
                var11 = re.a(param1, incrementValue$6, (byte) 67);
                var26 = new int[var11][var10];
                var13 = 0;
                L2: while (true) {
                  if (var13 >= var11) {
                    incrementValue$7 = var2_int;
                    var2_int++;
                    var13 = re.a(param1, incrementValue$7, (byte) 59);
                    var22 = new int[var13 * 4];
                    var18 = var22;
                    var14 = var18;
                    var15 = 0;
                    L3: while (true) {
                      if (var15 >= 4 * var13) {
                        L4: {
                          if (param0 == 104) {
                            break L4;
                          } else {
                            field_Hb = (ja[][]) null;
                            break L4;
                          }
                        }
                        stackIn_16_0 = new bm(var26, var22, var3, var4, var5, var23, var24, var8, var9);
                        break L0;
                      } else {
                        incrementValue$8 = var2_int;
                        var2_int++;
                        var14[var15] = re.a(param1, incrementValue$8, (byte) 62);
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
                        incrementValue$9 = var2_int;
                        var2_int++;
                        var26[var13][var14_int] = re.a(param1, incrementValue$9, (byte) 71);
                        var14_int++;
                        continue L5;
                      }
                    }
                  }
                }
              } else {
                incrementValue$10 = var2_int;
                var2_int++;
                var6[var8] = re.a(param1, incrementValue$10, (byte) 56);
                incrementValue$11 = var2_int;
                var2_int++;
                var7[var8] = re.a(param1, incrementValue$11, (byte) 88);
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var2);

            stackIn_19_1 = new StringBuilder().append("no.CA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        return stackIn_16_0;
    }

    public static void h(int param0) {
        field_Fb = null;
        field_Jb = null;
        if (param0 != 15) {
            CharSequence var2 = (CharSequence) null;
            no.a(false, -117, (CharSequence) null);
        }
        field_Hb = (ja[][]) null;
        field_Kb = null;
    }

    final boolean b(int param0, boolean param1) {
        int stackIn_9_0 = 0;
        if (param0 == 0) {
          L0: {
            L1: {
              L2: {
                this.a(param0 ^ -11838, true);
                if (kd.field_b == 0) {
                  break L2;
                } else {
                  if (this.field_T == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (-1 == (this.field_Ib.field_T ^ -1)) {
                stackIn_9_0 = 0;
                break L0;
              } else {
                break L1;
              }
            }
            stackIn_9_0 = 1;
            break L0;
          }
          return stackIn_9_0 != 0;
        } else {
          return true;
        }
    }

    no(cj param0, cj param1, cj param2, cj param3, cj param4, cj param5) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
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
        try {
          L0: {
            var17 = new cj(0L, param1, le.field_I.toUpperCase());
            var17.field_R = 1;
            this.field_Ib = new cj(0L, param2);
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
                this.a(var10 + var17.field_z, 100, var17.field_zb, 100, -3344);
                this.field_Ib.a(15, 5, 15, -20 + var17.field_zb, -3344);
                var8.a(this.field_z - var17.field_z, var17.field_z, this.field_zb, 0, -3344);
                var9.a(15, 20, this.field_zb, 0, -3344);
                var8.field_ab = tg.a(2105376, var8.field_z, 8421504, 3, 11579568, 102);
                var17.a((byte) 50, this.field_Ib);
                var8.a((byte) 50, var9);
                this.a((byte) 50, var17);
                this.a((byte) 50, var8);
                var10 = -(this.field_z >> -617126399) + 240;
                this.field_x = 320 + -(this.field_zb >> -1388909887);
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
            stackIn_10_0 = (RuntimeException) (var7);

            stackIn_10_1 = new StringBuilder().append("no.<init>(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param4 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param5 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_11_0), stackIn_26_2 + ')');
        }
    }

    static {
        field_Fb = "Left-click or press 'ESC' to skip cutscene";
        field_Hb = new ja[2][];
        field_Kb = "Make them tremble and shake.";
    }
}
