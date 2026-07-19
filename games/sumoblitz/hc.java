/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc {
    static gt field_c;
    static da field_e;
    static int field_f;
    static ri[] field_a;
    static ri field_b;
    static String field_d;

    private hc() throws Throwable {
        throw new Error();
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        field_d = null;
        field_e = null;
        int var1 = 80 / ((69 - param0) / 40);
        field_c = null;
    }

    final static sn a(int param0, mk[] param1, fr param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        long var3_long = 0L;
        int var5 = 0;
        int var6 = 0;
        byte[] var10 = null;
        Object stackIn_7_0 = null;
        sn stackIn_17_0 = null;
        Object stackIn_33_0 = null;
        sn stackIn_35_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        Object stackOut_32_0 = null;
        sn stackOut_34_0 = null;
        sn stackOut_16_0 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              L2: {
                if (var3_int >= param1.length) {
                  break L2;
                } else {
                  if (null != param1[var3_int]) {
                    if ((param1[var3_int].field_b ^ -1L) < -1L) {
                      var3_int++;
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    } else {
                      stackOut_6_0 = null;
                      stackIn_7_0 = stackOut_6_0;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                }
              }
              var3_long = jaggl.OpenGL.glCreateProgramObjectARB();
              var5 = 0;
              L3: while (true) {
                L4: {
                  L5: {
                    if (param1.length <= var5) {
                      break L5;
                    } else {
                      jaggl.OpenGL.glAttachObjectARB(var3_long, param1[var5].field_b);
                      var5++;
                      if (var6 != 0) {
                        break L4;
                      } else {
                        if (var6 == 0) {
                          continue L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  jaggl.OpenGL.glLinkProgramARB(var3_long);
                  break L4;
                }
                if (param0 == -14382) {
                  L6: {
                    jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35714, sc.field_o, 0);
                    if (0 == sc.field_o[0]) {
                      L7: {
                        if (sc.field_o[0] != 0) {
                          break L7;
                        } else {
                          System.out.println("Shader linking failed:");
                          break L7;
                        }
                      }
                      L8: {
                        jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35716, sc.field_o, 1);
                        if (sc.field_o[1] > 1) {
                          var10 = new byte[sc.field_o[1]];
                          jaggl.OpenGL.glGetInfoLogARB(var3_long, sc.field_o[1], sc.field_o, 0, var10, 0);
                          System.out.println(new String(var10));
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      if (sc.field_o[0] != 0) {
                        break L6;
                      } else {
                        var5 = 0;
                        L9: while (true) {
                          if (param1.length <= var5) {
                            jaggl.OpenGL.glDeleteObjectARB(var3_long);
                            stackOut_32_0 = null;
                            stackIn_33_0 = stackOut_32_0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            jaggl.OpenGL.glDetachObjectARB(var3_long, param1[var5].field_b);
                            var5++;
                            if (var6 == 0) {
                              continue L9;
                            } else {
                              return null;
                            }
                          }
                        }
                      }
                    } else {
                      break L6;
                    }
                  }
                  stackOut_34_0 = new sn(param2, var3_long, param1);
                  stackIn_35_0 = stackOut_34_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackOut_16_0 = (sn) null;
                  stackIn_17_0 = stackOut_16_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) (var3);
            stackOut_36_1 = new StringBuilder().append("hc.B(").append(param0).append(',');
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param1 == null) {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L10;
            } else {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L10;
            }
          }
          L11: {
            stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
            stackOut_39_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',');
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param2 == null) {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L11;
            } else {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L11;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (sn) ((Object) stackIn_7_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (sn) ((Object) stackIn_33_0);
            } else {
              return stackIn_35_0;
            }
          }
        }
    }

    static {
        field_d = "Continue to next level?";
        field_f = 1;
    }
}
