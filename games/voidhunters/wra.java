/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wra extends rqa {
    static int field_p;
    static String field_o;

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            wra.a(85);
        }
        return new nc((Object) (Object) frb.a(169, 94));
    }

    wra(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        if (param0 != 0) {
            field_o = null;
        }
        field_o = null;
    }

    final static of a(ts[] param0, byte param1, qfa param2) {
        int var3_int = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var11 = null;
        var6 = VoidHunters.field_G;
        var3_int = 0;
        L0: while (true) {
          if (param0.length <= var3_int) {
            L1: {
              if (param1 == 107) {
                break L1;
              } else {
                wra.a(-108);
                break L1;
              }
            }
            var3 = jaggl.OpenGL.glCreateProgramObjectARB();
            var5 = 0;
            L2: while (true) {
              if (var5 >= param0.length) {
                L3: {
                  jaggl.OpenGL.glLinkProgramARB(var3);
                  jaggl.OpenGL.glGetObjectParameterivARB(var3, 35714, grb.field_j, 0);
                  if (0 != grb.field_j[0]) {
                    break L3;
                  } else {
                    L4: {
                      if (0 != grb.field_j[0]) {
                        break L4;
                      } else {
                        System.out.println("Shader linking failed:");
                        break L4;
                      }
                    }
                    L5: {
                      jaggl.OpenGL.glGetObjectParameterivARB(var3, 35716, grb.field_j, 1);
                      if (1 < grb.field_j[1]) {
                        var11 = new byte[grb.field_j[1]];
                        jaggl.OpenGL.glGetInfoLogARB(var3, grb.field_j[1], grb.field_j, 0, var11, 0);
                        System.out.println(new String(var11));
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    if (grb.field_j[0] != 0) {
                      break L3;
                    } else {
                      var7 = 0;
                      var5 = var7;
                      L6: while (true) {
                        if (var7 >= param0.length) {
                          jaggl.OpenGL.glDeleteObjectARB(var3);
                          return null;
                        } else {
                          jaggl.OpenGL.glDetachObjectARB(var3, param0[var7].field_c);
                          var7++;
                          continue L6;
                        }
                      }
                    }
                  }
                }
                return new of(param2, var3, param0);
              } else {
                jaggl.OpenGL.glAttachObjectARB(var3, param0[var5].field_c);
                var5++;
                continue L2;
              }
            }
          } else {
            if (null != param0[var3_int]) {
              if (-1L > (param0[var3_int].field_c ^ -1L)) {
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
        field_p = 20;
        field_o = "Double Assault";
    }
}
