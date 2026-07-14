/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ccb implements dja {
    static kl field_a;

    public final tv[] a(int param0, int param1) {
        Object var4 = null;
        if (param0 != 11995) {
          var4 = null;
          ts discarded$2 = ccb.a(117, (qfa) null, 46, (String) null);
          return (tv[]) (Object) new sg[param1];
        } else {
          return (tv[]) (Object) new sg[param1];
        }
    }

    public static void b(byte param0) {
        field_a = null;
        if (param0 <= 65) {
            Object var2 = null;
            int discarded$0 = ccb.a((Random) null, (int[]) null, (byte) -97, false);
        }
    }

    final static int a(Random param0, int[] param1, byte param2, boolean param3) {
        if (param2 != -21) {
          field_a = null;
          return sj.a(-71, param1.length, param0, param3, param1);
        } else {
          return sj.a(-71, param1.length, param0, param3, param1);
        }
    }

    final static ts a(int param0, qfa param1, int param2, String param3) {
        long var4 = 0L;
        Object var7 = null;
        byte[] var16 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        var4 = jaggl.OpenGL.glCreateShaderObjectARB(param0);
        if (param2 == 18753) {
          jaggl.OpenGL.glShaderSourceARB(var4, param3);
          jaggl.OpenGL.glCompileShaderARB(var4);
          jaggl.OpenGL.glGetObjectParameterivARB(var4, 35713, ika.field_c, 0);
          if (-1 == ika.field_c[0]) {
            if (-1 != ika.field_c[0]) {
              L0: {
                jaggl.OpenGL.glGetObjectParameterivARB(var4, 35716, ika.field_c, 1);
                if ((ika.field_c[1] ^ -1) < -2) {
                  var21 = new byte[ika.field_c[1]];
                  jaggl.OpenGL.glGetInfoLogARB(var4, ika.field_c[1], ika.field_c, 0, var21, 0);
                  System.out.println(new String(var21));
                  break L0;
                } else {
                  break L0;
                }
              }
              if (0 != ika.field_c[0]) {
                return new ts(param1, var4, param0);
              } else {
                jaggl.OpenGL.glDeleteObjectARB(var4);
                return null;
              }
            } else {
              L1: {
                System.out.println("Shader compile failed:");
                jaggl.OpenGL.glGetObjectParameterivARB(var4, 35716, ika.field_c, 1);
                if ((ika.field_c[1] ^ -1) < -2) {
                  var20 = new byte[ika.field_c[1]];
                  jaggl.OpenGL.glGetInfoLogARB(var4, ika.field_c[1], ika.field_c, 0, var20, 0);
                  System.out.println(new String(var20));
                  break L1;
                } else {
                  break L1;
                }
              }
              if (0 == ika.field_c[0]) {
                jaggl.OpenGL.glDeleteObjectARB(var4);
                return null;
              } else {
                return new ts(param1, var4, param0);
              }
            }
          } else {
            return new ts(param1, var4, param0);
          }
        } else {
          var7 = null;
          ts discarded$1 = ccb.a(-110, (qfa) null, 41, (String) null);
          jaggl.OpenGL.glShaderSourceARB(var4, param3);
          jaggl.OpenGL.glCompileShaderARB(var4);
          jaggl.OpenGL.glGetObjectParameterivARB(var4, 35713, ika.field_c, 0);
          if (-1 == ika.field_c[0]) {
            if (-1 == ika.field_c[0]) {
              L2: {
                System.out.println("Shader compile failed:");
                jaggl.OpenGL.glGetObjectParameterivARB(var4, 35716, ika.field_c, 1);
                if ((ika.field_c[1] ^ -1) < -2) {
                  var19 = new byte[ika.field_c[1]];
                  jaggl.OpenGL.glGetInfoLogARB(var4, ika.field_c[1], ika.field_c, 0, var19, 0);
                  System.out.println(new String(var19));
                  break L2;
                } else {
                  break L2;
                }
              }
              if (0 != ika.field_c[0]) {
                return new ts(param1, var4, param0);
              } else {
                jaggl.OpenGL.glDeleteObjectARB(var4);
                return null;
              }
            } else {
              L3: {
                jaggl.OpenGL.glGetObjectParameterivARB(var4, 35716, ika.field_c, 1);
                if ((ika.field_c[1] ^ -1) < -2) {
                  var16 = new byte[ika.field_c[1]];
                  jaggl.OpenGL.glGetInfoLogARB(var4, ika.field_c[1], ika.field_c, 0, var16, 0);
                  System.out.println(new String(var16));
                  break L3;
                } else {
                  break L3;
                }
              }
              if (0 == ika.field_c[0]) {
                jaggl.OpenGL.glDeleteObjectARB(var4);
                return null;
              } else {
                return new ts(param1, var4, param0);
              }
            }
          } else {
            return new ts(param1, var4, param0);
          }
        }
    }

    public final tv a(byte param0) {
        int var2 = -8 % ((param0 - -64) / 50);
        return (tv) (Object) new sg();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new kl();
    }
}
