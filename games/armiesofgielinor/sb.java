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
            this.a(127);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "sb.FA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(int param0, gh param1) {
        if (param0 > -82) {
            return;
        }
        try {
            this.a(125);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "sb.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(boolean param0) {
        rn discarded$0 = null;
        field_f = null;
        field_e = null;
        field_h = null;
        field_g = null;
        field_i = null;
        if (param0) {
            String var2 = (String) null;
            discarded$0 = sb.a((String) null, (byte) -81);
        }
    }

    public sb() {
    }

    final String b(byte param0) {
        gu discarded$2 = null;
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
              var2_int = this.field_j.l(97);
              var3 = this.field_j.m(-26458);
              if (param0 == -71) {
                break L1;
              } else {
                discarded$2 = this.c(-41);
                break L1;
              }
            }
            L2: {
              var4 = this.field_j.a((byte) -77);
              var5 = ra.b(true);
              if (-1891 < (var4 ^ -1)) {
                break L2;
              } else {
                if (var4 <= var5 + -3) {
                  if (!dt.a(var4, -24375, var3, var2_int)) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    stackOut_8_0 = null;
                    stackIn_9_0 = stackOut_8_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  break L2;
                }
              }
            }
            stackOut_5_0 = fo.a(4800, cv.field_r, new String[]{"1890", Integer.toString(-3 + var5)});
            stackIn_6_0 = stackOut_5_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = (NumberFormatException) (Object) decompiledCaughtException;
            decompiledRegionSelector0 = 1;
            break L3;
          }
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return qq.field_z;
          } else {
            return (String) ((Object) stackIn_9_0);
          }
        }
    }

    final static rn a(String param0, byte param1) {
        rn discarded$4 = null;
        rn discarded$5 = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        rn stackIn_4_0 = null;
        rn stackIn_8_0 = null;
        rn stackIn_20_0 = null;
        rn stackIn_23_0 = null;
        Object stackIn_30_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        rn stackOut_3_0 = null;
        rn stackOut_7_0 = null;
        rn stackOut_22_0 = null;
        rn stackOut_19_0 = null;
        Object stackOut_29_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (0 == var2_int) {
              stackOut_3_0 = hv.field_N;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-64 > (var2_int ^ -1)) {
                stackOut_7_0 = el.field_e;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3 = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      if (var3 >= var2_int) {
                        break L3;
                      } else {
                        var4 = param0.charAt(var3);
                        var8 = 45;
                        var7 = var4;
                        if (var5 != 0) {
                          if (var7 != var8) {
                            var6 = (String) null;
                            discarded$4 = sb.a((String) null, (byte) -62);
                            break L2;
                          } else {
                            return null;
                          }
                        } else {
                          L4: {
                            if (var7 != var8) {
                              if (ew.field_c.indexOf(var4) != -1) {
                                break L4;
                              } else {
                                stackOut_22_0 = ov.field_h;
                                stackIn_23_0 = stackOut_22_0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              }
                            } else {
                              L5: {
                                if (var3 == 0) {
                                  break L5;
                                } else {
                                  if (var2_int + -1 != var3) {
                                    break L4;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              stackOut_19_0 = ov.field_h;
                              stackIn_20_0 = stackOut_19_0;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            }
                          }
                          var3++;
                          if (var5 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    if (param1 != -107) {
                      var6 = (String) null;
                      discarded$5 = sb.a((String) null, (byte) -62);
                      break L2;
                    } else {
                      return null;
                    }
                  }
                  stackOut_29_0 = null;
                  stackIn_30_0 = stackOut_29_0;
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) (var2);
            stackOut_31_1 = new StringBuilder().append("sb.P(");
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L6;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_20_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_23_0;
              } else {
                return (rn) ((Object) stackIn_30_0);
              }
            }
          }
        }
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
            var2_int = this.field_j.l(50);
            var3 = this.field_j.m(-26458);
            var4 = this.field_j.a((byte) -77);
            var5 = ra.b(true);
            if (var4 >= 1890) {
              var6 = 26 % ((param0 - 56) / 32);
              if (var4 <= -3 + var5) {
                if (dt.a(var4, -24375, var3, var2_int)) {
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackOut_7_0 = rn.field_e;
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                stackOut_4_0 = rn.field_e;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = rn.field_e;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return rn.field_e;
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return oo.field_g;
            } else {
              return stackIn_8_0;
            }
          }
        }
    }

    public final boolean b(int param0) {
        if (param0 <= 12) {
            field_g = (int[]) null;
            return this.field_j.k(-22339);
        }
        return this.field_j.k(-22339);
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
                field_h = (vh) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("sb.EA(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    static {
        field_d = 2;
        field_f = "You currently have an ongoing mission at this location.<br><Br>You are on turn <col=ffff00><%0></col>. <br><br>Do you wish to resume this mission or do you want to abort it and restart?";
        field_g = new int[]{166};
    }
}
