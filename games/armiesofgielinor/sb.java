/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb extends rb implements fb, rp {
    en field_j;
    static int[] field_g;
    static je field_i;
    static String field_f;
    static vh field_h;
    static int field_d;
    static kl field_e;

    public final void b(fn param0, int param1) {
        try {
            int var3_int = -12 / ((-80 - param1) / 33);
            ((sb) this).a(127);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "sb.FA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public final void a(int param0, gh param1) {
        if (param0 > -82) {
            return;
        }
        try {
            ((sb) this).a(125);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "sb.N(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void b(boolean param0) {
        field_f = null;
        field_e = null;
        field_h = null;
        field_g = null;
        field_i = null;
    }

    public sb() {
    }

    final String b(byte param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        String stackOut_5_0 = null;
        try {
          L0: {
            L1: {
              var2_int = ((sb) this).field_j.l(97);
              var3 = ((sb) this).field_j.m(-26458);
              if (param0 == -71) {
                break L1;
              } else {
                gu discarded$2 = ((sb) this).c(-41);
                break L1;
              }
            }
            L2: {
              var4 = ((sb) this).field_j.a((byte) -77);
              var5 = ra.b(true);
              if (var4 < 1890) {
                break L2;
              } else {
                if (var4 <= var5 + -3) {
                  if (!dt.a(var4, -24375, var3, var2_int)) {
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    stackOut_8_0 = null;
                    stackIn_9_0 = stackOut_8_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L2;
                }
              }
            }
            stackOut_5_0 = fo.a(4800, cv.field_r, new String[2]);
            stackIn_6_0 = stackOut_5_0;
            return stackIn_6_0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = (NumberFormatException) (Object) decompiledCaughtException;
            decompiledRegionSelector0 = 0;
            break L3;
          }
        }
        if (decompiledRegionSelector0 == 0) {
          return qq.field_z;
        } else {
          return (String) (Object) stackIn_9_0;
        }
    }

    final static rn a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        rn stackIn_4_0 = null;
        rn stackIn_8_0 = null;
        rn stackIn_16_0 = null;
        rn stackIn_19_0 = null;
        Object stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        rn stackOut_3_0 = null;
        rn stackOut_7_0 = null;
        Object stackOut_23_0 = null;
        rn stackOut_18_0 = null;
        rn stackOut_15_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (0 == var2_int) {
              stackOut_3_0 = hv.field_N;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (var2_int > 63) {
                stackOut_7_0 = el.field_e;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                var3 = 0;
                L1: while (true) {
                  if (var3 >= var2_int) {
                    if (param1 != -107) {
                      var6 = null;
                      rn discarded$2 = sb.a((String) null, (byte) -62);
                      stackOut_23_0 = null;
                      stackIn_24_0 = stackOut_23_0;
                      break L0;
                    } else {
                      return null;
                    }
                  } else {
                    L2: {
                      var4 = param0.charAt(var3);
                      if (var4 != 45) {
                        if (ew.field_c.indexOf(var4) != -1) {
                          break L2;
                        } else {
                          stackOut_18_0 = ov.field_h;
                          stackIn_19_0 = stackOut_18_0;
                          return stackIn_19_0;
                        }
                      } else {
                        L3: {
                          if (var3 == 0) {
                            break L3;
                          } else {
                            if (var2_int + -1 != var3) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                        stackOut_15_0 = ov.field_h;
                        stackIn_16_0 = stackOut_15_0;
                        return stackIn_16_0;
                      }
                    }
                    var3++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var2;
            stackOut_25_1 = new StringBuilder().append("sb.P(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L4;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 44 + param1 + 41);
        }
        return (rn) (Object) stackIn_24_0;
    }

    final gu c(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        gu stackIn_2_0 = null;
        gu stackIn_5_0 = null;
        gu stackIn_8_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        gu stackOut_7_0 = null;
        gu stackOut_4_0 = null;
        gu stackOut_1_0 = null;
        try {
          L0: {
            var2_int = ((sb) this).field_j.l(50);
            var3 = ((sb) this).field_j.m(-26458);
            var4 = ((sb) this).field_j.a((byte) -77);
            var5 = ra.b(true);
            if (var4 >= 1890) {
              var6 = 26 % ((param0 - 56) / 32);
              if (var4 <= -3 + var5) {
                if (dt.a(var4, -24375, var3, var2_int)) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  stackOut_7_0 = rn.field_e;
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                stackOut_4_0 = rn.field_e;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = rn.field_e;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return rn.field_e;
        }
        if (decompiledRegionSelector0 == 0) {
          return oo.field_g;
        } else {
          return stackIn_8_0;
        }
    }

    public final boolean b(int param0) {
        if (param0 <= 12) {
            field_g = null;
        }
        return ((sb) this).field_j.k(-22339);
    }

    public final void a(fn param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 80) {
                break L1;
              } else {
                field_h = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("sb.EA(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 2;
        field_f = "You currently have an ongoing mission at this location.<br><Br>You are on turn <col=ffff00><%0></col>. <br><br>Do you wish to resume this mission or do you want to abort it and restart?";
        field_g = new int[]{166};
    }
}
