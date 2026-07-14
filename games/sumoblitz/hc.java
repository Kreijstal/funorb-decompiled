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
        int var3_int = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var11 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        var3_int = 0;
        L0: while (true) {
          if (var3_int >= param1.length) {
            var3 = jaggl.OpenGL.glCreateProgramObjectARB();
            var5 = 0;
            L1: while (true) {
              if (param1.length <= var5) {
                jaggl.OpenGL.glLinkProgramARB(var3);
                if (param0 == -14382) {
                  L2: {
                    jaggl.OpenGL.glGetObjectParameterivARB(var3, 35714, sc.field_o, 0);
                    if (0 == sc.field_o[0]) {
                      L3: {
                        if (sc.field_o[0] != 0) {
                          break L3;
                        } else {
                          System.out.println("Shader linking failed:");
                          break L3;
                        }
                      }
                      L4: {
                        jaggl.OpenGL.glGetObjectParameterivARB(var3, 35716, sc.field_o, 1);
                        if (sc.field_o[1] > 1) {
                          var11 = new byte[sc.field_o[1]];
                          jaggl.OpenGL.glGetInfoLogARB(var3, sc.field_o[1], sc.field_o, 0, var11, 0);
                          System.out.println(new String(var11));
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      if (sc.field_o[0] != 0) {
                        break L2;
                      } else {
                        var7 = 0;
                        var5 = var7;
                        L5: while (true) {
                          if (param1.length <= var7) {
                            jaggl.OpenGL.glDeleteObjectARB(var3);
                            return null;
                          } else {
                            jaggl.OpenGL.glDetachObjectARB(var3, param1[var7].field_b);
                            var7++;
                            continue L5;
                          }
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                  return new sn(param2, var3, param1);
                } else {
                  return null;
                }
              } else {
                jaggl.OpenGL.glAttachObjectARB(var3, param1[var5].field_b);
                var5++;
                continue L1;
              }
            }
          } else {
            if (null != param1[var3_int]) {
              if ((param1[var3_int].field_b ^ -1L) < -1L) {
                var3_int++;
                continue L0;
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Continue to next level?";
        field_f = 1;
    }
}
