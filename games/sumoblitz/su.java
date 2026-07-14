/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class su extends RuntimeException {
    static String field_d;
    String field_a;
    static String field_c;
    Throwable field_b;

    final static qj a(int param0, on param1, byte[] param2, int param3) {
        long var4 = 0L;
        byte[] var10 = null;
        if (param2 != null) {
          if (0 != param2.length) {
            var4 = jaggl.OpenGL.glCreateShaderObjectARB(param0);
            jaggl.OpenGL.glShaderSourceRawARB(var4, param2);
            jaggl.OpenGL.glCompileShaderARB(var4);
            jaggl.OpenGL.glGetObjectParameterivARB(var4, 35713, dh.field_H, 0);
            if (-1 != dh.field_H[0]) {
              if (param3 > -113) {
                su.b((byte) -11);
                return new qj(param1, var4, param0);
              } else {
                return new qj(param1, var4, param0);
              }
            } else {
              L0: {
                if (-1 == dh.field_H[0]) {
                  System.out.println("Shader compile failed:");
                  break L0;
                } else {
                  break L0;
                }
              }
              L1: {
                jaggl.OpenGL.glGetObjectParameterivARB(var4, 35716, dh.field_H, 1);
                if (dh.field_H[1] > 1) {
                  var10 = new byte[dh.field_H[1]];
                  jaggl.OpenGL.glGetInfoLogARB(var4, dh.field_H[1], dh.field_H, 0, var10, 0);
                  System.out.println(new String(var10));
                  break L1;
                } else {
                  break L1;
                }
              }
              if (dh.field_H[0] != 0) {
                if (param3 <= -113) {
                  return new qj(param1, var4, param0);
                } else {
                  su.b((byte) -11);
                  return new qj(param1, var4, param0);
                }
              } else {
                jaggl.OpenGL.glDeleteObjectARB(var4);
                return null;
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static boolean a(int param0) {
        Object var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == 0) {
          if (!nt.field_r) {
            if (vs.b((byte) 9)) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          var2 = null;
          qj discarded$5 = su.a(6, (on) null, (byte[]) null, -63);
          if (nt.field_r) {
            return true;
          } else {
            L0: {
              if (!vs.b((byte) 9)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final static void a(byte param0) {
        rl var1 = (rl) (Object) te.field_g.b((byte) -124);
        if (!(var1 != null)) {
            throw new IllegalStateException();
        }
        lk.a(var1.field_v, var1.field_t, var1.field_m);
        lk.d(var1.field_s, var1.field_r, var1.field_u, var1.field_p);
        var1.field_v = null;
        ko.field_m.a((ms) (Object) var1, (byte) 39);
        int var2 = -37 / ((param0 - 1) / 38);
    }

    public static void b(byte param0) {
        if (param0 != -18) {
            return;
        }
        field_c = null;
        field_d = null;
    }

    su(Throwable param0, String param1) {
        ((su) this).field_a = param1;
        ((su) this).field_b = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Unpacking music";
        field_c = "Creating your account";
    }
}
