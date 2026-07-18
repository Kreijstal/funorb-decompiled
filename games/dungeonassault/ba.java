/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba {
    private String field_g;
    static int field_f;
    static String field_d;
    static kg field_c;
    static int[] field_b;
    static ba field_e;
    static String field_a;
    static String field_h;

    public static void a(byte param0) {
        field_d = null;
        field_a = null;
        if (param0 < 114) {
            return;
        }
        try {
            field_h = null;
            field_b = null;
            field_e = null;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "ba.E(" + param0 + ')');
        }
    }

    final static void a(rj param0, byte param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            kd.field_c = param2;
            uo.field_f = le.field_b[kd.field_c];
            fc.field_d = 0;
            id.field_l = param0;
            if (param1 >= 40) {
              og.a(false, 0, uo.field_f[fc.field_d]);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("ba.A(");
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, java.applet.Applet param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 64) {
                break L1;
              } else {
                ba.a((rj) null, (byte) 20, -83);
                break L1;
              }
            }
            lm.a(false, "jagex-last-login-method", 31536000L, param1, ((ba) this).field_g);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ba.D(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    final boolean a(String param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 == 20886) {
              stackOut_3_0 = ((ba) this).field_g.equals((Object) (Object) param0);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ba.C(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    public final String toString() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          throw new IllegalStateException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var1, "ba.toString()");
        }
    }

    final static cn[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9_int = 0;
        RuntimeException var9 = null;
        cn[] var10 = null;
        cn[] var11_ref_cn__ = null;
        int var11 = 0;
        int var12 = 0;
        cn var13 = null;
        int var14 = 0;
        cn[] stackIn_43_0 = null;
        RuntimeException decompiledCaughtException = null;
        cn[] stackOut_42_0 = null;
        try {
          L0: {
            L1: {
              var9_int = param6 + (param5 + param8);
              var10 = new cn[]{new cn(var9_int, var9_int), new cn(param1, var9_int), new cn(var9_int, var9_int), new cn(var9_int, param1), new cn(64, 64), new cn(var9_int, param1), new cn(var9_int, var9_int), new cn(param1, var9_int), new cn(var9_int, var9_int)};
              if (param2 <= -80) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            var11_ref_cn__ = var10;
            var12 = 0;
            L2: while (true) {
              if (~var11_ref_cn__.length >= ~var12) {
                var11 = 0;
                L3: while (true) {
                  if (param6 <= var11) {
                    var11 = 0;
                    L4: while (true) {
                      if (~var11 <= ~param6) {
                        var11 = 0;
                        L5: while (true) {
                          if (~var11 <= ~param1) {
                            var11 = 0;
                            L6: while (true) {
                              if (var11 >= param1 >> 459638689) {
                                stackOut_42_0 = (cn[]) var10;
                                stackIn_43_0 = stackOut_42_0;
                                break L0;
                              } else {
                                var12 = 0;
                                L7: while (true) {
                                  if (param8 <= var12) {
                                    var11++;
                                    continue L6;
                                  } else {
                                    var10[1].field_B[var11 + (var9_int + -var12 + -1) * param1] = param7;
                                    var10[3].field_B[-var12 - (-var9_int + 1) + var9_int * var11] = param7;
                                    var10[7].field_B[var11 + var12 * param1] = param7;
                                    var10[5].field_B[var11 * var9_int - -var12] = param7;
                                    var12++;
                                    continue L7;
                                  }
                                }
                              }
                            }
                          } else {
                            var12 = 0;
                            L8: while (true) {
                              if (~param6 >= ~var12) {
                                var11++;
                                continue L5;
                              } else {
                                var10[7].field_B[var11 + (-var12 + var9_int - 1) * param1] = param4;
                                var10[5].field_B[var11 * var9_int - (-var9_int - -1) + -var12] = param4;
                                var10[1].field_B[param1 * var12 - -var11] = param0;
                                var10[3].field_B[var12 + var11 * var9_int] = param0;
                                var12++;
                                continue L8;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = 0;
                        L9: while (true) {
                          if (~var9_int >= ~var12) {
                            var11++;
                            continue L4;
                          } else {
                            L10: {
                              var10[0].field_B[var11 * var9_int + var12] = param0;
                              var10[0].field_B[var11 + var9_int * var12] = param0;
                              if (~(-var11 + var9_int) >= ~var12) {
                                break L10;
                              } else {
                                var10[2].field_B[var9_int * var11 + var12] = param0;
                                var10[6].field_B[var11 + var12 * var9_int] = param0;
                                break L10;
                              }
                            }
                            var12++;
                            continue L9;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L11: while (true) {
                      if (~var12 <= ~var9_int) {
                        var11++;
                        continue L3;
                      } else {
                        var10[6].field_B[var12 + var9_int * (-var11 + (var9_int + -1))] = param4;
                        var10[8].field_B[(-1 + var9_int + -var11) * var9_int - -var12] = param4;
                        var10[2].field_B[var12 * var9_int + (-var11 + -1 + var9_int)] = param4;
                        var10[8].field_B[var9_int - 1 - var11 + var12 * var9_int] = param4;
                        var12++;
                        continue L11;
                      }
                    }
                  }
                }
              } else {
                var13 = var11_ref_cn__[var12];
                var14 = 0;
                L12: while (true) {
                  if (var13.field_B.length <= var14) {
                    var12++;
                    continue L2;
                  } else {
                    var13.field_B[var14] = param3;
                    var14++;
                    continue L12;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var9, "ba.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        return stackIn_43_0;
    }

    ba(String param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            ((ba) this).field_g = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ba.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Your raider was detected by trap, but avoided it.";
        field_b = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_a = "Notoriously dimwitted, the ogres share the highlands with the goblin and orc tribes. What this particular ogre thug lacks in intellect and subtlety, he compensates for with raw force.";
        field_c = null;
        field_e = new ba("email");
        field_h = "Dungeon Assault";
    }
}
