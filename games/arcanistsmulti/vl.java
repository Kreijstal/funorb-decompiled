/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl extends pg {
    int field_o;
    int field_j;
    int field_m;
    int field_g;
    vl field_h;
    static String field_k;
    static String field_l;
    int field_n;
    static ll[] field_i;

    final static void d() {
        RuntimeException var1 = null;
        byte[] var1_array = null;
        int var2 = 0;
        int var3 = 0;
        int[][] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var8 = new byte[27];
            var12 = var8;
            var11 = var12;
            var10 = var11;
            var9 = var10;
            var1_array = var9;
            var2 = 0;
            int incrementValue$7 = var2;
            var2++;
            var8[incrementValue$7] = (byte) 0;
            var3 = 0;
            L1: while (true) {
              if (4 <= var3) {
                var3 = 0;
                L2: while (true) {
                  if (6 <= var3) {
                    var3 = 0;
                    L3: while (true) {
                      if (16 <= var3) {
                        L4: {
                          int discarded$8 = 112;
                          if (lc.a()) {
                            break L4;
                          } else {
                            f discarded$9 = tf.a(6, -25866, var12);
                            break L4;
                          }
                        }
                        break L0;
                      } else {
                        int incrementValue$10 = var2;
                        var2++;
                        var1_array[incrementValue$10] = (byte)b.field_f[var3];
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    int incrementValue$11 = var2;
                    var2++;
                    var1_array[incrementValue$11] = (byte)so.field_c[var3];
                    var3++;
                    continue L2;
                  }
                }
              } else {
                L5: {
                  var4 = null;
                  if (var3 == 0) {
                    var4 = ld.field_n;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (var3 != 1) {
                    break L6;
                  } else {
                    var4 = ud.field_z;
                    break L6;
                  }
                }
                L7: {
                  if (var3 != 2) {
                    break L7;
                  } else {
                    var4 = ug.field_d;
                    break L7;
                  }
                }
                L8: {
                  if (var3 == 3) {
                    var4 = hi.field_b;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                var5 = -1;
                var6 = 0;
                L9: while (true) {
                  if (~var6 <= ~var4.length) {
                    L10: {
                      if (var5 != -1) {
                        int incrementValue$12 = var2;
                        var2++;
                        var1_array[incrementValue$12] = (byte)var5;
                        break L10;
                      } else {
                        int incrementValue$13 = var2;
                        var2++;
                        var1_array[incrementValue$13] = (byte) 0;
                        break L10;
                      }
                    }
                    var3++;
                    continue L1;
                  } else {
                    L11: {
                      if (~var4[var6][0] != ~kg.field_d[var3][0]) {
                        break L11;
                      } else {
                        if (~var4[var6][1] != ~kg.field_d[var3][1]) {
                          break L11;
                        } else {
                          if (~kg.field_d[var3][2] != ~var4[var6][2]) {
                            break L11;
                          } else {
                            var5 = (byte)var6;
                            break L11;
                          }
                        }
                      }
                    }
                    var6++;
                    continue L9;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "vl.C(" + 112 + ')');
        }
    }

    final static void a(byte param0, ij param1) {
        try {
            int var2_int = 0;
            co.field_f.a((kc) (Object) param1, 9);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "vl.A(" + 121 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a() {
        field_k = null;
        field_l = null;
        field_i = null;
    }

    final static String a(byte param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_18_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              var3 = 21;
              if (var2_int <= 20) {
                break L1;
              } else {
                var2_int = 20;
                break L1;
              }
            }
            var4 = new char[var2_int];
            var5 = 0;
            L2: while (true) {
              if (var2_int <= var5) {
                stackOut_18_0 = new String(var4);
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    var6 = param1.charAt(var5);
                    if (var6 < 65) {
                      break L4;
                    } else {
                      if (var6 <= 90) {
                        var4[var5] = (char)(var6 + 32);
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    L6: {
                      if (var6 < 97) {
                        break L6;
                      } else {
                        if (122 >= var6) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (var6 < 48) {
                        break L7;
                      } else {
                        if (var6 <= 57) {
                          break L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var4[var5] = '_';
                    break L3;
                  }
                  var4[var5] = (char)var6;
                  break L3;
                }
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var2;
            stackOut_20_1 = new StringBuilder().append("vl.B(").append(106).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
        return stackIn_19_0;
    }

    final static void a(int param0) {
        if (!vh.field_n) {
            lo.field_q = (1600 + lo.field_q * 120) / 128;
        } else {
            lo.field_q = 120 * lo.field_q / 128;
        }
    }

    vl(int param0, int param1, int param2, int param3, int param4) {
        ((vl) this).field_o = param1;
        ((vl) this).field_j = param0;
        ((vl) this).field_n = param4;
        ((vl) this).field_g = param3;
        ((vl) this).field_m = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "This is a <col=ff80ff><shad=0>level 3</col></shad> spell and is unavailable unless you also put 5 other spells from the <%0> into your spellbook. You currently only have <%1>";
        field_l = "Choose the spells you wish your Arcanist to take into battle.<br>Select a spellbook from the top of the screen, then select your spells from the wheel to the left. You can remove spells from your spellbook by clicking on the icons above.";
    }
}
