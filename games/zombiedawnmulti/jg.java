/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg {
    static String field_b;
    static boolean field_a;

    final static String a(k param0, int param1, int param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var3_int = param0.h((byte) -109);
                  if (var3_int > param1) {
                    var3_int = param1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  var4 = new byte[var3_int];
                  param0.field_j = param0.field_j + r.field_a.a(var3_int, param2 + -3574, 0, param0.field_m, var4, param0.field_j);
                  if (param2 == 3460) {
                    break L3;
                  } else {
                    jg.b(43);
                    break L3;
                  }
                }
                var5 = oe.a(var3_int, var4, false, 0);
                stackOut_5_0 = (String) (var5);
                stackIn_6_0 = stackOut_5_0;
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (Exception) (Object) decompiledCaughtException;
              stackOut_7_0 = "Cabbage";
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3_ref);
            stackOut_9_1 = new StringBuilder().append("jg.D(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_6_0;
    }

    final static fc a(int param0, byte[] param1) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        byte[] var8 = null;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        byte[] stackIn_4_2 = null;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        byte[] stackIn_7_2 = null;
        fc stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        byte[] stackOut_3_2 = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        byte[] stackOut_6_2 = null;
        fc stackOut_11_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            var8 = new byte[24 + param1.length];
            var7 = var8;
            var3 = var7;
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (-5 >= (var2_int ^ -1)) {
                    break L3;
                  } else {
                    stackOut_3_0 = -128;
                    stackOut_3_1 = var2_int;
                    stackOut_3_2 = (byte[]) (var3);
                    stackIn_7_0 = stackOut_3_0;
                    stackIn_7_1 = stackOut_3_1;
                    stackIn_7_2 = stackOut_3_2;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    stackIn_4_2 = stackOut_3_2;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      nn.a(stackIn_4_0, stackIn_4_1, stackIn_4_2, ql.a(true, var2_int, param1));
                      var2_int++;
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                incrementValue$2 = var2_int;
                var2_int++;
                stackOut_6_0 = 1;
                stackOut_6_1 = incrementValue$2;
                stackOut_6_2 = (byte[]) (param1);
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                stackIn_7_2 = stackOut_6_2;
                break L2;
              }
              L4: {
                var4 = ql.a(stackIn_7_0 != 0, stackIn_7_1, stackIn_7_2);
                incrementValue$3 = var2_int;
                var2_int++;
                var5 = ql.a(true, incrementValue$3, param1);
                nn.a(-114, 4, var8, var4);
                nn.a(-128, 5, var8, var5);
                nn.a(-111, 6, var8, var4);
                nn.a(-118, 7, var8, var5);
                nn.a(-113, 8, var8, var4);
                nn.a(-106, 9, var8, var5);
                nn.a(-123, 10, var8, var4);
                nn.a(-127, 11, var8, var5);
                var2_int = 6;
                if (param0 == 30270) {
                  break L4;
                } else {
                  field_b = (String) null;
                  break L4;
                }
              }
              L5: while (true) {
                L6: {
                  if (param1.length / 4 <= var2_int) {
                    break L6;
                  } else {
                    nn.a(param0 ^ -30281, var2_int - -6, var3, ql.a(true, var2_int, param1));
                    var2_int++;
                    if (var6 == 0) {
                      continue L5;
                    } else {
                      break L6;
                    }
                  }
                }
                stackOut_11_0 = gi.a(var8, -113);
                stackIn_12_0 = stackOut_11_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var2);
            stackOut_13_1 = new StringBuilder().append("jg.B(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L7;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L7;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        return stackIn_12_0;
    }

    final static sm[] a(int param0, go param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        sm[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        sm var7 = null;
        int var8 = 0;
        di var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        sm[] stackIn_3_0 = null;
        sm[] stackIn_11_0 = null;
        sm[] stackIn_15_0 = null;
        sm[] stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        sm[] stackOut_10_0 = null;
        sm[] stackOut_14_0 = null;
        sm[] stackOut_17_0 = null;
        sm[] stackOut_2_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param1.a(-36)) {
              var9 = param1.c(0);
              L1: while (true) {
                L2: {
                  L3: {
                    if (0 != var9.field_f) {
                      break L3;
                    } else {
                      vd.a(false, 10L);
                      if (var8 != 0) {
                        break L2;
                      } else {
                        if (var8 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  if (2 != var9.field_f) {
                    break L2;
                  } else {
                    stackOut_10_0 = new sm[]{};
                    stackIn_11_0 = stackOut_10_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
                var11 = (int[]) (var9.field_d);
                var10 = var11;
                var3 = var10;
                var5 = 88 % ((27 - param0) / 55);
                var4 = new sm[var11.length >> 1476197698];
                var6 = 0;
                L4: while (true) {
                  L5: {
                    L6: {
                      if (var4.length <= var6) {
                        break L6;
                      } else {
                        var7 = new sm();
                        stackOut_14_0 = (sm[]) (var4);
                        stackIn_18_0 = stackOut_14_0;
                        stackIn_15_0 = stackOut_14_0;
                        if (var8 != 0) {
                          break L5;
                        } else {
                          stackIn_15_0[var6] = var7;
                          var7.field_e = var3[var6 << -1537884766];
                          var7.field_a = var3[(var6 << -1854007262) - -1];
                          var7.field_c = var3[(var6 << -1472796862) + 2];
                          var7.field_d = var3[(var6 << -1820917502) + 3];
                          var6++;
                          if (var8 == 0) {
                            continue L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    stackOut_17_0 = (sm[]) (var4);
                    stackIn_18_0 = stackOut_17_0;
                    break L5;
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackOut_2_0 = new sm[]{};
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var2);
            stackOut_19_1 = new StringBuilder().append("jg.A(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return stackIn_18_0;
          }
        }
    }

    final static void a(int param0) {
        if (!og.field_N) {
            throw new IllegalStateException();
        }
        hh.field_m = true;
        sc.a(param0 ^ -75, true);
        a.field_b = param0;
    }

    public static void b(int param0) {
        if (param0 != 7) {
            return;
        }
        field_b = null;
    }

    static {
        field_b = "This private message is prefixed with \"<col=9090FF>To <%1>:</col>\" on your screen.<br>On <%1>'s screen, it will be prefixed with \"<col=FF6060>From <%0>:</col>\", which is<br>a different length and may leave less room for the message itself.<br><br>This shading covers the area which is not available on <%1>'s screen.<br>Provided your message fits to the left of the shaded area,<br><%1> should be able to see it in full.<br><br>(Note: this may be inaccurate if <%1> is playing in a different<br>language from you.)";
        field_a = false;
    }
}
