/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah {
    static String field_a;
    static oi field_b;
    static String[] field_c;

    final static void a(boolean param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = DungeonAssault.field_K;
        if ((nl.field_d ^ -1) <= -1) {
          L0: {
            var3 = param1 + -135;
            var4 = -35 + param2;
            var5 = 256;
            if (-76 >= (nl.field_d ^ -1)) {
              break L0;
            } else {
              var5 = (nl.field_d << 1686247208) / 75;
              break L0;
            }
          }
          L1: {
            if (nl.field_d > 200) {
              var5 = (-nl.field_d + 250 << -1884509240) / 50;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (!param0) {
              break L2;
            } else {
              ah.a(-19);
              break L2;
            }
          }
          L3: {
            lm.a(hc.field_a, (byte) -91);
            re.b();
            gf.a();
            id.a(439027688);
            if (-257 >= (var5 ^ -1)) {
              break L3;
            } else {
              gf.b(0, 0, gf.field_i, gf.field_c, 0, 256 - var5);
              break L3;
            }
          }
          L4: {
            ti.c(true);
            if (-151 < (nl.field_d ^ -1)) {
              hc.field_a.a(var3, var4);
              break L4;
            } else {
              dm.field_g.d(15 + var3, var4 - -10, var5);
              break L4;
            }
          }
          L5: {
            var6 = -125 + nl.field_d;
            if ((var6 ^ -1) >= -1) {
              break L5;
            } else {
              if (var6 < 50) {
                if (20 <= var6) {
                  if (30 <= var6) {
                    var7 = (-(var6 * 256) + 12800) / 20;
                    ie.field_l.b(var3, var4, var7);
                    break L5;
                  } else {
                    ie.field_l.b(var3, var4, 256);
                    break L5;
                  }
                } else {
                  var7 = var6 * 256 / 20;
                  ie.field_l.b(var3, var4, var7);
                  break L5;
                }
              } else {
                break L5;
              }
            }
          }
          L6: {
            var6 = -140 + nl.field_d;
            if (var6 > 0) {
              L7: {
                var7 = 256;
                if (var6 < 20) {
                  var7 = var6 * 256 / 20;
                  break L7;
                } else {
                  break L7;
                }
              }
              lb.field_C.d(var3 + 15, 10 + var4, var7 * var5 >> 1734634536);
              break L6;
            } else {
              break L6;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static boolean a(CharSequence param0, int param1, boolean param2, byte param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_7_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_45_0 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_44_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        var11 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (param1 < 2) {
                break L1;
              } else {
                if ((param1 ^ -1) >= -37) {
                  var4_int = 0;
                  if (param3 == -42) {
                    var5 = 0;
                    var6 = 0;
                    var7 = param0.length();
                    var8 = 0;
                    L2: while (true) {
                      if (var8 >= var7) {
                        stackOut_44_0 = var5;
                        stackIn_45_0 = stackOut_44_0;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        L3: {
                          L4: {
                            var9 = param0.charAt(var8);
                            if (var8 == 0) {
                              if (var9 == 45) {
                                var4_int = 1;
                                break L3;
                              } else {
                                if (var9 != 43) {
                                  break L4;
                                } else {
                                  if (!param2) {
                                    break L4;
                                  } else {
                                    var8++;
                                    continue L2;
                                  }
                                }
                              }
                            } else {
                              break L4;
                            }
                          }
                          L5: {
                            L6: {
                              if (var9 < 48) {
                                break L6;
                              } else {
                                if (var9 > 57) {
                                  break L6;
                                } else {
                                  var9 -= 48;
                                  break L5;
                                }
                              }
                            }
                            L7: {
                              if (65 > var9) {
                                break L7;
                              } else {
                                if (var9 <= 90) {
                                  var9 -= 55;
                                  break L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            if (var9 < 97) {
                              stackOut_28_0 = 0;
                              stackIn_29_0 = stackOut_28_0;
                              decompiledRegionSelector0 = 1;
                              break L0;
                            } else {
                              if (var9 <= 122) {
                                var9 -= 87;
                                break L5;
                              } else {
                                return false;
                              }
                            }
                          }
                          if (var9 < param1) {
                            L8: {
                              if (var4_int != 0) {
                                var9 = -var9;
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            var10 = param1 * var6 - -var9;
                            if (var10 / param1 != var6) {
                              stackOut_40_0 = 0;
                              stackIn_41_0 = stackOut_40_0;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            } else {
                              var5 = 1;
                              var6 = var10;
                              break L3;
                            }
                          } else {
                            stackOut_33_0 = 0;
                            stackIn_34_0 = stackOut_33_0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
                        }
                        var8++;
                        continue L2;
                      }
                    }
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_7_0 = stackOut_6_0;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("" + param1);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_46_0 = (RuntimeException) (var4);
            stackOut_46_1 = new StringBuilder().append("ah.B(");
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param0 == null) {
              stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L9;
            } else {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "{...}";
              stackIn_49_0 = stackOut_47_0;
              stackIn_49_1 = stackOut_47_1;
              stackIn_49_2 = stackOut_47_2;
              break L9;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_49_0), stackIn_49_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_29_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_34_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_41_0 != 0;
              } else {
                return stackIn_45_0 != 0;
              }
            }
          }
        }
    }

    final static gp a(nh param0, int param1, String param2, String param3, nh param4) {
        gp discarded$2 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        nh var7 = null;
        gp stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        gp stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              var5_int = param4.a(param3, 1000);
              if (param1 == 200) {
                break L1;
              } else {
                var7 = (nh) null;
                discarded$2 = ah.a((nh) null, 14, (String) null, (String) null, (nh) null);
                break L1;
              }
            }
            var6 = param4.a(0, param2, var5_int);
            stackOut_2_0 = hh.a(param0, param4, var5_int, (byte) 124, var6);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var5);
            stackOut_4_1 = new StringBuilder().append("ah.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0 != -37) {
            field_a = (String) null;
        }
    }

    final static void a(boolean param0, int param1) {
        ri.field_g = ec.field_j[param1].a();
        String var5 = ce.field_o[param1];
        int var3 = 40 - -ne.field_c.b(var5);
        cn var4 = new cn(var3, 32);
        jh.c();
        if (!param0) {
            field_a = (String) null;
        }
        var4.e();
        ri.field_g.c(0, 0, 32, 32);
        ne.field_c.b(var5, 40, ne.field_c.field_H + 32 >> 1600563233, 16777215, -1);
        var4.d(16777215);
        var4.e();
        ri.field_g.b(0, 0, 32, 32, 0);
        ne.field_c.b(var5, 40, 32 - -ne.field_c.field_H >> 337737121, 0, -1);
        jh.b();
        ke.field_e = 0;
        pa.field_a = var4;
        sl.field_b = new rh(12 + (var3 >> -511804319), 32, 8 + var3, 32, 16711680, 768, 224);
    }

    static {
        field_a = "Raider was trapped by guardian, which alerted the monsters of the dungeon.";
        field_c = new String[255];
    }
}
