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
        int var2;
        int var3;
        int var4;
        jp var5;
        var2 = param1 * (param1 * param1 >> -688273780) >> -1965901972;
        var3 = param1 * 6 + -61440;
        if (param0 <= 54) {
          var5 = (jp) null;
          gha.a((byte[]) null, 119, (byte) -84, (jp) null);
          var4 = (param1 * var3 >> 18795916) + 40960;
          return var4 * var2 >> 1722121740;
        } else {
          var4 = (param1 * var3 >> 18795916) + 40960;
          return var4 * var2 >> 1722121740;
        }
    }

    final static ue a(byte[] param0, int param1, byte param2, jp param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        byte[] var10 = null;
        Object stackIn_4_0 = null;
        Object stackIn_16_0 = null;
        ue stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 != null) {
              if (param0.length != 0) {
                L1: {
                  var4_long = jaggl.OpenGL.glCreateShaderObjectARB(param1);
                  jaggl.OpenGL.glShaderSourceRawARB(var4_long, param0);
                  jaggl.OpenGL.glCompileShaderARB(var4_long);
                  jaggl.OpenGL.glGetObjectParameterivARB(var4_long, 35713, rm.field_f, 0);
                  if (param2 == -15) {
                    break L1;
                  } else {
                    field_o = 36;
                    break L1;
                  }
                }
                L2: {
                  if (rm.field_f[0] != 0) {
                    break L2;
                  } else {
                    L3: {
                      if (rm.field_f[0] == 0) {
                        System.out.println("Shader compile failed:");
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      jaggl.OpenGL.glGetObjectParameterivARB(var4_long, 35716, rm.field_f, 1);
                      if (-2 > (rm.field_f[1] ^ -1)) {
                        var10 = new byte[rm.field_f[1]];
                        jaggl.OpenGL.glGetInfoLogARB(var4_long, rm.field_f[1], rm.field_f, 0, var10, 0);
                        System.out.println(new String(var10));
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    if (0 != rm.field_f[0]) {
                      break L2;
                    } else {
                      jaggl.OpenGL.glDeleteObjectARB(var4_long);
                      stackIn_16_0 = null;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
                stackIn_18_0 = new ue(param3, var4_long, param1);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_4_0 = null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("gha.D(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ue) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ue) ((Object) stackIn_16_0);
          } else {
            return stackIn_18_0;
          }
        }
    }

    public static void a(int param0) {
        field_r = null;
        field_q = null;
        if (param0 != 0) {
            field_r = (ri) null;
            field_p = null;
            return;
        }
        field_p = null;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_3_0 = new nc(frb.a(182, 85));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("gha.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_o = 0;
        field_r = new ri(1, 2, 2, 0);
        field_q = new rrb();
    }
}
