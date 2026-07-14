/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dga {
    static String field_a;
    static String field_b;

    final static void a(uia param0, int param1) {
        int var2 = 0;
        kc.field_b = param0.d(123) << -1338331483;
        var2 = param0.h(255);
        kc.field_b = kc.field_b + (var2 >> -847199581);
        vd.field_p = var2 << 1095837714 & 1835008;
        vd.field_p = vd.field_p + (param0.d(125) << 884932866);
        if (param1 != 0) {
          return;
        } else {
          var2 = param0.h(param1 + 255);
          vd.field_p = vd.field_p + (var2 >> 556781158);
          ir.field_a = (var2 & 63) << -1369543441;
          ir.field_a = ir.field_a + (param0.h(255) << 73851527);
          var2 = param0.h(255);
          ir.field_a = ir.field_a + (var2 >> 478803233);
          tna.field_f = (1 & var2) << -807179600;
          tna.field_f = tna.field_f + param0.d(127);
          return;
        }
    }

    final static cua a(int param0, cka param1, fca[] param2) {
        int var3_int = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var12 = null;
        byte[] var13 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        if (param0 == 21885) {
          var3_int = 0;
          L0: while (true) {
            if (param2.length <= var3_int) {
              var3 = jaggl.OpenGL.glCreateProgramObjectARB();
              var5 = 0;
              L1: while (true) {
                if (param2.length <= var5) {
                  jaggl.OpenGL.glLinkProgramARB(var3);
                  jaggl.OpenGL.glGetObjectParameterivARB(var3, 35714, mg.field_g, 0);
                  if (-1 == (mg.field_g[0] ^ -1)) {
                    if (mg.field_g[0] != 0) {
                      L2: {
                        jaggl.OpenGL.glGetObjectParameterivARB(var3, 35716, mg.field_g, 1);
                        if ((mg.field_g[1] ^ -1) < -2) {
                          var13 = new byte[mg.field_g[1]];
                          jaggl.OpenGL.glGetInfoLogARB(var3, mg.field_g[1], mg.field_g, 0, var13, 0);
                          System.out.println(new String(var13));
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      if (0 != mg.field_g[0]) {
                        return new cua(param1, var3, param2);
                      } else {
                        var7 = 0;
                        var5 = var7;
                        L3: while (true) {
                          if (param2.length <= var7) {
                            jaggl.OpenGL.glDeleteObjectARB(var3);
                            return null;
                          } else {
                            jaggl.OpenGL.glDetachObjectARB(var3, param2[var7].field_a);
                            var7++;
                            continue L3;
                          }
                        }
                      }
                    } else {
                      L4: {
                        System.out.println("Shader linking failed:");
                        jaggl.OpenGL.glGetObjectParameterivARB(var3, 35716, mg.field_g, 1);
                        if ((mg.field_g[1] ^ -1) < -2) {
                          var12 = new byte[mg.field_g[1]];
                          jaggl.OpenGL.glGetInfoLogARB(var3, mg.field_g[1], mg.field_g, 0, var12, 0);
                          System.out.println(new String(var12));
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      if (0 == mg.field_g[0]) {
                        var7 = 0;
                        var5 = var7;
                        L5: while (true) {
                          if (param2.length <= var7) {
                            jaggl.OpenGL.glDeleteObjectARB(var3);
                            return null;
                          } else {
                            jaggl.OpenGL.glDetachObjectARB(var3, param2[var7].field_a);
                            var7++;
                            continue L5;
                          }
                        }
                      } else {
                        return new cua(param1, var3, param2);
                      }
                    }
                  } else {
                    return new cua(param1, var3, param2);
                  }
                } else {
                  jaggl.OpenGL.glAttachObjectARB(var3, param2[var5].field_a);
                  var5++;
                  continue L1;
                }
              }
            } else {
              if (null != param2[var3_int]) {
                if (-1L > (param2[var3_int].field_a ^ -1L)) {
                  var3_int++;
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
        } else {
          return null;
        }
    }

    final static void a(int param0, int param1) {
        int var2 = (ob.field_i - 640) / 2;
        int var3 = pna.field_q * pna.field_q;
        int var4 = var3 - param0 * param0;
        nra.field_c.a(param1, -124 + bea.field_a - 90, -23776, 90, -(var4 * 199 / var3) + var2);
        dka.field_b.a(438, -124 + bea.field_a, param1 + -23975, 0, var2 - -202 - -(var4 * 438 / var3));
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != -29262) {
            field_b = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Unable to delete friend - system busy";
    }
}
