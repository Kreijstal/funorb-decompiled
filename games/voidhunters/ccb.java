/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ccb implements dja {
    static kl field_a;

    public final tv[] a(int param0, int param1) {
        String var4;
        if (param0 != 11995) {
          var4 = (String) null;
          ccb.a(117, (qfa) null, 46, (String) null);
          return (tv[]) ((Object) new sg[param1]);
        } else {
          return (tv[]) ((Object) new sg[param1]);
        }
    }

    public static void b(byte param0) {
        field_a = null;
        if (param0 <= 65) {
            int[] var2 = (int[]) null;
            ccb.a((Random) null, (int[]) null, (byte) -97, false);
        }
    }

    final static int a(Random param0, int[] param1, byte param2, boolean param3) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == -21) {
                break L1;
              } else {
                field_a = (kl) null;
                break L1;
              }
            }
            stackIn_3_0 = sj.a(-71, param1.length, param0, param3, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("ccb.D(");

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    final static ts a(int param0, qfa param1, int param2, String param3) {
        Object stackIn_12_0 = null;
        ts stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        long var4_long = 0L;
        RuntimeException var4 = null;
        String var7 = null;
        byte[] var11 = null;
        try {
          L0: {
            L1: {
              var4_long = jaggl.OpenGL.glCreateShaderObjectARB(param0);
              if (param2 == 18753) {
                break L1;
              } else {
                var7 = (String) null;
                ccb.a(-110, (qfa) null, 41, (String) null);
                break L1;
              }
            }
            L2: {
              jaggl.OpenGL.glShaderSourceARB(var4_long, param3);
              jaggl.OpenGL.glCompileShaderARB(var4_long);
              jaggl.OpenGL.glGetObjectParameterivARB(var4_long, 35713, ika.field_c, 0);
              if (-1 == (ika.field_c[0] ^ -1)) {
                L3: {
                  if (-1 != (ika.field_c[0] ^ -1)) {
                    break L3;
                  } else {
                    System.out.println("Shader compile failed:");
                    break L3;
                  }
                }
                L4: {
                  jaggl.OpenGL.glGetObjectParameterivARB(var4_long, 35716, ika.field_c, 1);
                  if ((ika.field_c[1] ^ -1) < -2) {
                    var11 = new byte[ika.field_c[1]];
                    jaggl.OpenGL.glGetInfoLogARB(var4_long, ika.field_c[1], ika.field_c, 0, var11, 0);
                    System.out.println(new String(var11));
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if (0 == ika.field_c[0]) {
                  jaggl.OpenGL.glDeleteObjectARB(var4_long);
                  stackIn_12_0 = null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
            stackIn_14_0 = new ts(param1, var4_long, param0);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("ccb.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ts) ((Object) stackIn_12_0);
        } else {
          return stackIn_14_0;
        }
    }

    public final tv a(byte param0) {
        int var2 = -8 % ((param0 - -64) / 50);
        return (tv) ((Object) new sg());
    }

    static {
        field_a = new kl();
    }
}
