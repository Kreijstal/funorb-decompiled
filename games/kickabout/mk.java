/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk {
    static String[] field_b;
    static int field_c;
    static ut field_a;

    public static void a(int param0) {
        if (param0 != 17437) {
          field_b = (String[]) null;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int[] param14, int param15, int param16) {
        int var17_int = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
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
        int var42 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var17 = null;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var35Lifetime1;
        int var36Lifetime1;
        int var37Lifetime1;
        int var38Lifetime1;
        int var39Lifetime1;
        int var40Lifetime1;
        int var36Lifetime2;
        int var36Lifetime3;
        int var37Lifetime2;
        int var38Lifetime2;
        int var39Lifetime2;
        int var40Lifetime2;
        var42 = Kickabout.field_G;
        try {
          if (param1 >= 0 &&
            t.field_k > param7) {
            if (param0 < 0 &&
              param16 < 0 &&
              0 > param2) {
              return;
            }
            if (param0 >= t.field_b &&
              t.field_b <= param16 &&
              param2 >= t.field_b) {
              return;
            }
            if (param6) {
              field_b = (String[]) null;
            }
            var34 = param1 - param7;
            if (param7 == param15) {
              if (param1 == param7) {
                var18 = param16 << 16;
                var25 = param10;
                var32 = 0;
                var19 = 0;
                var28 = 0;
                var30 = param13;
                var23 = 0;
                var27 = 0;
                var20 = 0;
                var29 = param3;
                var24 = 0;
                var17_int = param0 << 16;
                var21 = param8;
                var22 = param9;
                var26 = param5;
                var31 = 0;
              } else {
                var35 = -param15 + param1;
                if (param0 >= param16) {
                  var29 = param13 << 16;
                  var20 = (-param0 + param2 << 16) / var34;
                  var23 = (-param9 + param11 << 16) / var35;
                  var31 = (param12 - param13 << 16) / var35;
                  var17_int = param16 << 16;
                  var28 = (-param10 + param4 << 16) / var34;
                  var30 = param3 << 16;
                  var18 = param0 << 16;
                  var32 = (-param3 + param12 << 16) / var34;
                  var25 = param5 << 16;
                  var26 = param10 << 16;
                  var24 = (-param8 + param11 << 16) / var34;
                  var22 = param8 << 16;
                  var21 = param9 << 16;
                  var27 = (-param5 + param4 << 16) / var35;
                  var19 = (-param16 + param2 << 16) / var35;
                } else {
                  var19 = (-param0 + param2 << 16) / var34;
                  var23 = (-param8 + param11 << 16) / var34;
                  var30 = param13 << 16;
                  var24 = (param11 - param9 << 16) / var35;
                  var20 = (param2 - param16 << 16) / var35;
                  var28 = (param4 - param5 << 16) / var35;
                  var32 = (param12 - param13 << 16) / var35;
                  var26 = param5 << 16;
                  var21 = param8 << 16;
                  var29 = param3 << 16;
                  var17_int = param0 << 16;
                  var18 = param16 << 16;
                  var31 = (param12 - param3 << 16) / var34;
                  var22 = param9 << 16;
                  var27 = (-param10 + param4 << 16) / var34;
                  var25 = param10 << 16;
                }
              }
              var33 = 0;
              if (param7 < 0) {
                param7 = Math.min(-param7, -param7 + param15);
                var21 = var21 + var23 * param7;
                var30 = var30 + param7 * var32;
                var26 = var26 + param7 * var28;
                var17_int = var17_int + var19 * param7;
                var18 = var18 + param7 * var20;
                var25 = var25 + param7 * var27;
                var29 = var29 + param7 * var31;
                var22 = var22 + param7 * var24;
                param7 = 0;
              }
            } else {
              var18 = param0 << 16;
              var17_int = param0 << 16;
              var26 = param10 << 16;
              var25 = param10 << 16;
              var22 = param8 << 16;
              var21 = param8 << 16;
              var30 = param3 << 16;
              var29 = param3 << 16;
              var35 = param15 - param7;
              var20 = (-param0 + param2 << 16) / var34;
              var19 = (-param0 + param16 << 16) / var35;
              if (var20 <= var19) {
                var32 = (param13 - param3 << 16) / var35;
                var27 = (-param10 + param4 << 16) / var34;
                var23 = (-param8 + param11 << 16) / var34;
                var36 = var19;
                var19 = var20;
                var20 = var36;
                var28 = (-param10 + param5 << 16) / var35;
                var24 = (param9 - param8 << 16) / var35;
                var31 = (-param3 + param12 << 16) / var34;
                var33 = 1;
              } else {
                var33 = 0;
                var31 = (param13 - param3 << 16) / var35;
                var24 = (param11 - param8 << 16) / var34;
                var23 = (param9 - param8 << 16) / var35;
                var32 = (param12 - param3 << 16) / var34;
                var27 = (param5 - param10 << 16) / var35;
                var28 = (-param10 + param4 << 16) / var34;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param7 < 0) {
                if (param15 < 0) {
                  param7 = -param7 + param15;
                  var30 = var30 + var32 * param7;
                  var17_int = var17_int + var19 * param7;
                  var21 = var21 + var23 * param7;
                  var22 = var22 + param7 * var24;
                  var29 = var29 + param7 * var31;
                  var26 = var26 + param7 * var28;
                  var25 = var25 + var27 * param7;
                  var18 = var18 + param7 * var20;
                  param7 = param15;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param7 = -param7;
                  var22 = var22 + var24 * param7;
                  var30 = var30 + param7 * var32;
                  var25 = var25 + var27 * param7;
                  var29 = var29 + param7 * var31;
                  var17_int = var17_int + param7 * var19;
                  var18 = var18 + var20 * param7;
                  var21 = var21 + param7 * var23;
                  var26 = var26 + var28 * param7;
                  param7 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var36Lifetime2 = t.field_q[param7];
                while (param15 > param7) {
                  var37 = var17_int >> 16;
                  if (var37 < t.field_b) {
                    var38 = (var18 >> 16) - (var17_int >> 16);
                    if (var38 != 0) {
                      var39 = (-var21 + var22) / var38;
                      var40 = (-var25 + var26) / var38;
                      var41 = (var30 - var29) / var38;
                      if (var37 + var38 >= t.field_b) {
                        var38 = -1 + t.field_b - var37;
                      }
                      if (0 > var37) {
                        ca.a(var39, var40, var36Lifetime2, var29 - var41 * var37, var21 - var37 * var39, 545806977, var38 + var37, var41, var25 - var40 * var37, param14);
                      } else {
                        ca.a(var39, var40, var36Lifetime2 + var37, var29, var21, 545806977, var38, var41, var25, param14);
                      }
                    } else {
                      if (var37 >= 0 &&
                        t.field_b > var37) {
                        ca.a(0, 0, var37 + var36Lifetime2, var29, var21, 545806977, var38, 0, var25, param14);
                      }
                    }
                  }
                  param7++;
                  if (t.field_k <= param7) {
                    return;
                  }
                  var36Lifetime2 = var36Lifetime2 + on.field_g;
                  var26 = var26 + var28;
                  var22 = var22 + var24;
                  var17_int = var17_int + var19;
                  var29 = var29 + var31;
                  var21 = var21 + var23;
                  var30 = var30 + var32;
                  var18 = var18 + var20;
                  var25 = var25 + var27;
                }
              }
              var36Lifetime3 = -param15 + param1;
              if (var36Lifetime3 == 0) {
                var23 = 0;
                var19 = 0;
                var32 = 0;
                var24 = 0;
                var31 = 0;
                var27 = 0;
                var28 = 0;
                var20 = 0;
              } else {
                var37Lifetime2 = param2 << 16;
                var38Lifetime2 = param11 << 16;
                var39Lifetime2 = param4 << 16;
                if (var33 != 0) {
                  var18 = param16 << 16;
                  var22 = param9 << 16;
                  var26 = param5 << 16;
                  var30 = param13 << 16;
                } else {
                  var25 = param5 << 16;
                  var17_int = param16 << 16;
                  var21 = param9 << 16;
                  var29 = param13 << 16;
                }
                var40Lifetime2 = param12 << 16;
                var28 = (-var26 + var39Lifetime2) / var36Lifetime3;
                var32 = (var40Lifetime2 - var30) / var36Lifetime3;
                var24 = (var38Lifetime2 - var22) / var36Lifetime3;
                var23 = (var38Lifetime2 - var21) / var36Lifetime3;
                var19 = (-var17_int + var37Lifetime2) / var36Lifetime3;
                var27 = (-var25 + var39Lifetime2) / var36Lifetime3;
                var20 = (-var18 + var37Lifetime2) / var36Lifetime3;
                var31 = (-var29 + var40Lifetime2) / var36Lifetime3;
              }
            }
            if (0 > param7) {
              param7 = -param7;
              var29 = var29 + param7 * var31;
              var21 = var21 + param7 * var23;
              var30 = var30 + var32 * param7;
              var26 = var26 + param7 * var28;
              var22 = var22 + var24 * param7;
              var25 = var25 + param7 * var27;
              var17_int = var17_int + var19 * param7;
              var18 = var18 + var20 * param7;
              param7 = 0;
            }
            var35Lifetime1 = t.field_q[param7];
            while (param1 > param7) {
              var36Lifetime1 = var17_int >> 16;
              if (t.field_b > var36Lifetime1) {
                var37Lifetime1 = (var18 >> 16) - (var17_int >> 16);
                if (var37Lifetime1 != 0) {
                  var38Lifetime1 = (-var21 + var22) / var37Lifetime1;
                  var39Lifetime1 = (-var25 + var26) / var37Lifetime1;
                  var40Lifetime1 = (var30 - var29) / var37Lifetime1;
                  if (t.field_b <= var36Lifetime1 + var37Lifetime1) {
                    var37Lifetime1 = t.field_b - var36Lifetime1 - 1;
                  }
                  if (0 <= var36Lifetime1) {
                    ca.a(var38Lifetime1, var39Lifetime1, var36Lifetime1 + var35Lifetime1, var29, var21, 545806977, var37Lifetime1, var40Lifetime1, var25, param14);
                  } else {
                    ca.a(var38Lifetime1, var39Lifetime1, var35Lifetime1, var29 - var36Lifetime1 * var40Lifetime1, var21 - var36Lifetime1 * var38Lifetime1, 545806977, var37Lifetime1 + var36Lifetime1, var40Lifetime1, var25 - var36Lifetime1 * var39Lifetime1, param14);
                  }
                } else {
                  if (var36Lifetime1 >= 0 &&
                    t.field_b > var36Lifetime1) {
                    ca.a(0, 0, var36Lifetime1 + var35Lifetime1, var29, var21, 545806977, var37Lifetime1, 0, var25, param14);
                  }
                }
              }
              param7++;
              if (t.field_k <= param7) {
                return;
              }
              var18 = var18 + var20;
              var35Lifetime1 = var35Lifetime1 + on.field_g;
              var22 = var22 + var24;
              var21 = var21 + var23;
              var25 = var25 + var27;
              var17_int = var17_int + var19;
              var30 = var30 + var32;
              var29 = var29 + var31;
              var26 = var26 + var28;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_79_0 = var17;
          stackIn_79_1 = new StringBuilder().append("mk.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',');
          if (param14 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_79_0), ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',').append(param15).append(',').append(param16).append(')').toString());
        }
    }

    final static void b(int param0) {
        try {
          int var2_int = 0;
          int var3 = 0;
          tf var4 = null;
          RuntimeException decompiledCaughtException = null;
          RuntimeException var1 = null;
          ak var2 = null;
          var3 = Kickabout.field_G;
          try {
            var4 = new tf();
            if (param0 != -1622) {
              return;
            }
            var2_int = ks.field_e;
            if (1 != var2_int) {
              if (2 == var2_int) {
                qd.a(-78, var4, new java.awt.Point[]{new java.awt.Point(354, 226), new java.awt.Point(542, 226), new java.awt.Point(542, 784), new java.awt.Point(354, 784)});
                var4.a(bw.a(448, 0, false, 544, 9103, true), 3);
                var4.a(ss.field_b, 3);
              } else {
                if (var2_int == 3) {
                  qd.a(-55, var4, new java.awt.Point[]{new java.awt.Point(376, 206), new java.awt.Point(864, 206), new java.awt.Point(864, 634), new java.awt.Point(214, 634), new java.awt.Point(214, 786), new java.awt.Point(404, 786), new java.awt.Point(404, 1046), new java.awt.Point(864, 1046), new java.awt.Point(864, 1046), new java.awt.Point(864, 1174), new java.awt.Point(296, 1174), new java.awt.Point(296, 914), new java.awt.Point(6, 914), new java.awt.Point(6, 456), new java.awt.Point(586, 456), new java.awt.Point(586, 334), new java.awt.Point(376, 334)});
                  var4.a(bw.a(680, 1, false, 310, 9103, false), param0 + 1625);
                  var4.a(bw.a(670, 2, false, 540, 9103, false), 3);
                  var4.a(bw.a(130, 3, true, 570, 9103, false), 3);
                  var4.a(bw.a(140, 2, true, 820, param0 ^ -9691, false), 3);
                  var4.a(ss.field_b, param0 ^ -1623);
                } else {
                  if (var2_int == 4) {
                    var4.a(ss.field_b, param0 ^ -1623);
                  } else {
                    if (var2_int == 5) {
                      if (!sl.field_Eb) {
                        for (var2_int = 720; var2_int < 826; var2_int += 24) {
                          var4.a(ek.b(true, var2_int, 920), 3);
                        }
                        var4.a(ss.field_b, 3);
                        var2 = gt.c(0);
                        var2.a(896, 940, -51);
                        var4.a(var2, param0 + 1625);
                      }
                    } else {
                      switch (var2_int) {
                        case 8:
                          if (sl.field_Eb) {
                            um.field_e.a((byte) -119, var4);
                            return;
                          }
                          wv.a((byte) -108, 28, var4, new java.awt.Point[]{new java.awt.Point(-4, 186), new java.awt.Point(334, 186), new java.awt.Point(334, 86), new java.awt.Point(662, 86), new java.awt.Point(662, 186), new java.awt.Point(874, 186), new java.awt.Point(874, 724), new java.awt.Point(572, 724), new java.awt.Point(572, 824), new java.awt.Point(244, 824), new java.awt.Point(244, 724), new java.awt.Point(124, 724), new java.awt.Point(124, 986), new java.awt.Point(284, 986), new java.awt.Point(284, 886), new java.awt.Point(762, 886), new java.awt.Point(762, 986), new java.awt.Point(874, 986), new java.awt.Point(874, 1114), new java.awt.Point(762, 1114), new java.awt.Point(762, 1214), new java.awt.Point(284, 1214), new java.awt.Point(284, 1114), new java.awt.Point(-4, 1114), new java.awt.Point(-4, 596), new java.awt.Point(244, 596), new java.awt.Point(244, 496), new java.awt.Point(572, 496), new java.awt.Point(572, 596), new java.awt.Point(746, 596), new java.awt.Point(746, 314), new java.awt.Point(662, 314), new java.awt.Point(662, 414), new java.awt.Point(334, 414), new java.awt.Point(334, 314), new java.awt.Point(-4, 314)});
                          var4.a(bw.a(130, 1, false, 250, 9103, true), 3);
                          var4.a(bw.a(610, 0, false, 310, 9103, false), param0 ^ -1623);
                          var4.a(bw.a(610, 2, true, 210, 9103, false), param0 + 1625);
                          var4.a(bw.a(815, 2, false, 330, 9103, true), 3);
                          var4.a(bw.a(800, 2, false, 630, 9103, false), 3);
                          var4.a(bw.a(70, 3, true, 700, 9103, false), 3);
                          var4.a(bw.a(80, 2, true, 1030, 9103, false), param0 + 1625);
                          var4.a(ss.field_b, 3);
                          break;
                        case 12:
                        case 13:
                        default:
                          if (var2_int != 10 &&
                            var2_int != 11) {
                            if (12 == var2_int) {
                              if (sl.field_Eb) {
                                break;
                              }
                              nm.a(916, 28, 544, 544, -20, var4, (byte) -65);
                              var4.a(ss.field_b, param0 ^ -1623);
                              break;
                            }
                            if (var2_int != 13) {
                              break;
                            }
                            nm.a(916, 28, 544, 544, -20, var4, (byte) -72);
                            if (sl.field_Eb) {
                              break;
                            }
                            var4.a(ss.field_b, param0 ^ -1623);
                            break;
                          }
                          if (!sl.field_Eb) {
                            qd.a(-48, var4, new java.awt.Point[]{new java.awt.Point(286, 452), new java.awt.Point(864, 452), new java.awt.Point(864, 660), new java.awt.Point(286, 660)});
                          }
                          var4.a(ss.field_b, 3);
                          break;
                        case 9:
                          var4.a(ss.field_b, param0 + 1625);
                          break;
                        case 7:
                          if (!sl.field_Eb) {
                            qd.a(-109, var4, new java.awt.Point[]{new java.awt.Point(46, 236), new java.awt.Point(314, 236), new java.awt.Point(314, 714), new java.awt.Point(46, 714)});
                          }
                          var4.a(ss.field_b, 3);
                          break;
                        case 6:
                          var4.a(ss.field_b, 3);
                          break;
                      }
                    }
                  }
                }
              }
            } else {
              qd.a(param0 ^ 1543, var4, new java.awt.Point[]{new java.awt.Point(354, 586), new java.awt.Point(542, 586), new java.awt.Point(542, 1214), new java.awt.Point(354, 1214)});
              var4.a(bw.a(490, 0, false, 1020, 9103, true), param0 ^ -1623);
              var4.a(bw.a(400, 0, false, 1020, 9103, true), param0 ^ -1623);
              var4.a(bw.a(448, 0, false, 820, 9103, true), param0 ^ -1623);
              var4.a(ss.field_b, 3);
            }
            um.field_e.a((byte) -119, var4);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = decompiledCaughtException;
            throw nb.a((Throwable) ((Object) var1), "mk.B(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(ml param0, int param1, byte param2, int param3) {
        RuntimeException var4 = null;
        int stackIn_5_0 = 0;
        ml stackIn_7_1;
        int stackIn_7_2;
        int stackIn_7_3;
        int stackIn_8_4;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 6) {
            mk.a(-72, 68);
          }
          if (param1 != 0) {
            stackIn_5_0 = 1 << param1 - 1;
          } else {
            stackIn_5_0 = 0;
          }
          stackIn_7_1 = (ml) (param0);
          stackIn_7_2 = param1;
          stackIn_7_3 = 0;
          if (param3 != 0) {
            stackIn_8_4 = 1 << -1 + param3;
          } else {
            stackIn_8_4 = 0;
          }
          stackIn_9_0 = nr.a(stackIn_5_0, stackIn_7_1, stackIn_7_2, stackIn_7_3, stackIn_8_4, param3);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("mk.E(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static dk a(int param0, int param1) {
        dk var2 = new dk();
        ap.field_j.a(var2, 3);
        lb.a((byte) -105, param0);
        if (param1 != 26731) {
          mk.a(121, -110);
        }
        return var2;
    }

    static {
        field_b = new String[]{null, "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12", "Esc", null, null, "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "-", "=", "`", null, null, null, "Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "[", "]", null, null, null, null, "A", "S", "D", "F", "G", "H", "J", "K", "L", ";", "'", "#", null, null, null, null, "Z", "X", "C", "V", "B", "N", "M", "<", ">", "/", "\\", null, null, null, null, null, "Tab", "Shift", "Ctrl", "Space", "Enter", "Backspace", "Alt", "Keypad +", "Keypad -", "Keypad *", "Keypad /", "Keypad 5", null, null, null, null, "Left Arrow", "Right Arrow", "Up Arrow", "Down Arrow", "Insert", "Delete", "Home", "End", "Page Up", "Page Down", null, null, null, null, null, null};
    }
}
