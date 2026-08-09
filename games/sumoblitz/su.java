/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class su extends RuntimeException {
    static String field_d;
    String field_a;
    static String field_c;
    Throwable field_b;

    final static qj a(int param0, on param1, byte[] param2, int param3) {
        Object stackIn_15_0 = null;
        qj stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        long var4_long = 0L;
        RuntimeException var4 = null;
        byte[] var10 = null;
        try {
          L0: {
            if (param2 != null) {
              if (0 != param2.length) {
                L1: {
                  var4_long = jaggl.OpenGL.glCreateShaderObjectARB(param0);
                  jaggl.OpenGL.glShaderSourceRawARB(var4_long, param2);
                  jaggl.OpenGL.glCompileShaderARB(var4_long);
                  jaggl.OpenGL.glGetObjectParameterivARB(var4_long, 35713, dh.field_H, 0);
                  if (-1 != (dh.field_H[0] ^ -1)) {
                    break L1;
                  } else {
                    L2: {
                      if (-1 == (dh.field_H[0] ^ -1)) {
                        System.out.println("Shader compile failed:");
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      jaggl.OpenGL.glGetObjectParameterivARB(var4_long, 35716, dh.field_H, 1);
                      if (dh.field_H[1] > 1) {
                        var10 = new byte[dh.field_H[1]];
                        jaggl.OpenGL.glGetInfoLogARB(var4_long, dh.field_H[1], dh.field_H, 0, var10, 0);
                        System.out.println(new String(var10));
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    if (dh.field_H[0] == 0) {
                      jaggl.OpenGL.glDeleteObjectARB(var4_long);
                      stackIn_15_0 = null;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                L4: {
                  if (param3 <= -113) {
                    break L4;
                  } else {
                    su.b((byte) -11);
                    break L4;
                  }
                }
                stackIn_19_0 = new qj(param1, var4_long, param0);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4);

            stackIn_22_1 = new StringBuilder().append("su.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param2 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L6;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_23_0), stackIn_26_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (qj) ((Object) stackIn_15_0);
        } else {
          return stackIn_19_0;
        }
    }

    final static boolean a(int param0) {
        byte[] var2;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        if (param0 == 0) {
          if (!nt.field_r) {
            if (vs.b((byte) 9)) {
              return true;
            } else {
              return false;
            }
          } else {
            stackIn_11_0 = 1;
            return stackIn_11_0 != 0;
          }
        } else {
          var2 = (byte[]) null;
          su.a(6, (on) null, (byte[]) null, -63);
          if (nt.field_r) {
            return true;
          } else {
            L0: {
              if (!vs.b((byte) 9)) {
                stackIn_5_0 = 0;
                break L0;
              } else {
                stackIn_5_0 = 1;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final static void a(byte param0) {
        rl var1 = (rl) ((Object) te.field_g.b((byte) -124));
        if (!(var1 != null)) {
            throw new IllegalStateException();
        }
        lk.a(var1.field_v, var1.field_t, var1.field_m);
        lk.d(var1.field_s, var1.field_r, var1.field_u, var1.field_p);
        var1.field_v = null;
        ko.field_m.a((ms) (var1), (byte) 39);
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
        this.field_a = param1;
        this.field_b = param0;
    }

    static {
        field_d = "Unpacking music";
        field_c = "Creating your account";
    }
}
