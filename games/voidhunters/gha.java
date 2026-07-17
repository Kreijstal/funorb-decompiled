/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gha extends rqa {
    static ri field_r;
    static int field_o;
    static rrb field_q;
    static llb field_p;

    gha(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static int a(byte param0, int param1) {
        int var2 = param1 * (param1 * param1 >> 12) >> 12;
        int var3 = param1 * 6 + -61440;
        int var4 = (param1 * var3 >> 12) + 40960;
        return var4 * var2 >> 12;
    }

    final static ue a(byte[] param0, int param1, byte param2, jp param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        byte[] var10 = null;
        Object stackIn_4_0 = null;
        Object stackIn_14_0 = null;
        ue stackIn_16_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        Object stackOut_13_0 = null;
        ue stackOut_15_0 = null;
        Object stackOut_3_0 = null;
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
        try {
          L0: {
            if (param0 != null) {
              if (param0.length != 0) {
                L1: {
                  var4_long = jaggl.OpenGL.glCreateShaderObjectARB(param1);
                  jaggl.OpenGL.glShaderSourceRawARB(var4_long, param0);
                  jaggl.OpenGL.glCompileShaderARB(var4_long);
                  jaggl.OpenGL.glGetObjectParameterivARB(var4_long, 35713, rm.field_f, 0);
                  if (rm.field_f[0] != 0) {
                    break L1;
                  } else {
                    L2: {
                      if (rm.field_f[0] == -1) {
                        System.out.println("Shader compile failed:");
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      jaggl.OpenGL.glGetObjectParameterivARB(var4_long, 35716, rm.field_f, 1);
                      if (-2 < rm.field_f[1]) {
                        var10 = new byte[rm.field_f[1]];
                        jaggl.OpenGL.glGetInfoLogARB(var4_long, rm.field_f[1], rm.field_f, 0, var10, 0);
                        System.out.println(new String(var10));
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    if (0 != rm.field_f[0]) {
                      break L1;
                    } else {
                      jaggl.OpenGL.glDeleteObjectARB(var4_long);
                      stackOut_13_0 = null;
                      stackIn_14_0 = stackOut_13_0;
                      return (ue) (Object) stackIn_14_0;
                    }
                  }
                }
                stackOut_15_0 = new ue(param3, var4_long, param1);
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                stackOut_3_0 = null;
                stackIn_4_0 = stackOut_3_0;
                return (ue) (Object) stackIn_4_0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4;
            stackOut_17_1 = new StringBuilder().append("gha.D(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          L5: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44).append(param1).append(44).append(-15).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
        return stackIn_16_0;
    }

    public static void a(int param0) {
        field_r = null;
        field_q = null;
        if (param0 != 0) {
            field_r = null;
            field_p = null;
            return;
        }
        field_p = null;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -119) {
                break L1;
              } else {
                gha.a(-36);
                break L1;
              }
            }
            stackOut_2_0 = new nc((Object) (Object) frb.a(182, 85));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("gha.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 0;
        field_r = new ri(1, 2, 2, 0);
        field_q = new rrb();
    }
}
