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
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        var2 = param1 * (param1 * param1 >> -688273780) >> -1965901972;
        var3 = param1 * 6 + -61440;
        if (param0 <= 54) {
          var5 = null;
          ue discarded$2 = gha.a((byte[]) null, 119, (byte) -84, (jp) null);
          var4 = (param1 * var3 >> 18795916) + 40960;
          return var4 * var2 >> 1722121740;
        } else {
          var4 = (param1 * var3 >> 18795916) + 40960;
          return var4 * var2 >> 1722121740;
        }
    }

    final static ue a(byte[] param0, int param1, byte param2, jp param3) {
        long var4 = 0L;
        byte[] var14 = null;
        byte[] var16 = null;
        if (param0 != null) {
          if (param0.length != 0) {
            var4 = jaggl.OpenGL.glCreateShaderObjectARB(param1);
            jaggl.OpenGL.glShaderSourceRawARB(var4, param0);
            jaggl.OpenGL.glCompileShaderARB(var4);
            jaggl.OpenGL.glGetObjectParameterivARB(var4, 35713, rm.field_f, 0);
            if (param2 == -15) {
              if (rm.field_f[0] == 0) {
                L0: {
                  if (rm.field_f[0] == -1) {
                    System.out.println("Shader compile failed:");
                    break L0;
                  } else {
                    break L0;
                  }
                }
                L1: {
                  jaggl.OpenGL.glGetObjectParameterivARB(var4, 35716, rm.field_f, 1);
                  if (-2 < rm.field_f[1]) {
                    var16 = new byte[rm.field_f[1]];
                    jaggl.OpenGL.glGetInfoLogARB(var4, rm.field_f[1], rm.field_f, 0, var16, 0);
                    System.out.println(new String(var16));
                    break L1;
                  } else {
                    break L1;
                  }
                }
                if (0 != rm.field_f[0]) {
                  return new ue(param3, var4, param1);
                } else {
                  jaggl.OpenGL.glDeleteObjectARB(var4);
                  return null;
                }
              } else {
                return new ue(param3, var4, param1);
              }
            } else {
              field_o = 36;
              if (rm.field_f[0] == 0) {
                L2: {
                  if (rm.field_f[0] == -1) {
                    System.out.println("Shader compile failed:");
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  jaggl.OpenGL.glGetObjectParameterivARB(var4, 35716, rm.field_f, 1);
                  if (-2 < rm.field_f[1]) {
                    var14 = new byte[rm.field_f[1]];
                    jaggl.OpenGL.glGetInfoLogARB(var4, rm.field_f[1], rm.field_f, 0, var14, 0);
                    System.out.println(new String(var14));
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (0 != rm.field_f[0]) {
                  return new ue(param3, var4, param1);
                } else {
                  jaggl.OpenGL.glDeleteObjectARB(var4);
                  return null;
                }
              } else {
                return new ue(param3, var4, param1);
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
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
        if (param1 >= -119) {
          gha.a(-36);
          return new nc((Object) (Object) frb.a(182, 85));
        } else {
          return new nc((Object) (Object) frb.a(182, 85));
        }
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
