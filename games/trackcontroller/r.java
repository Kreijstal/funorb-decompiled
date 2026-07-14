/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r extends fc {
    static oh field_k;
    static bc field_i;
    static int field_j;

    public static void d(int param0) {
        field_i = null;
        if (param0 != -1) {
            r.f(84);
        }
        field_k = null;
    }

    final static void f(int param0) {
        gl.field_E.l(24910);
        if (param0 != -635) {
            return;
        }
        if (ib.field_e == null) {
            ib.field_e = new rk(gl.field_E, tk.field_r);
        }
        gl.field_E.d((byte) -63, (al) (Object) ib.field_e);
    }

    private r() throws Throwable {
        throw new Error();
    }

    final static boolean b(boolean param0) {
        if (!param0) {
            int discarded$0 = r.e(-40);
        }
        return !sa.field_Q.b((byte) 92) ? true : false;
    }

    final static String a(CharSequence param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = TrackController.field_F ? 1 : 0;
        if (param0 != null) {
          var2 = 0;
          var3 = param0.length();
          L0: while (true) {
            L1: {
              if (var2 >= var3) {
                break L1;
              } else {
                if (!sf.a(param0.charAt(var2), -33)) {
                  break L1;
                } else {
                  var2++;
                  continue L0;
                }
              }
            }
            if (param1 == -11133) {
              L2: while (true) {
                L3: {
                  if (var2 >= var3) {
                    break L3;
                  } else {
                    if (!sf.a(param0.charAt(var3 - 1), param1 ^ 11100)) {
                      break L3;
                    } else {
                      var3--;
                      continue L2;
                    }
                  }
                }
                var4 = var3 + -var2;
                if (1 <= var4) {
                  if (-13 <= (var4 ^ -1)) {
                    var5 = new StringBuilder(var4);
                    var6 = var2;
                    L4: while (true) {
                      if (var6 >= var3) {
                        if (-1 != (var5.length() ^ -1)) {
                          return var5.toString();
                        } else {
                          return null;
                        }
                      } else {
                        var7 = param0.charAt(var6);
                        if (ui.a(-19050, (char) var7)) {
                          var8 = vh.a(true, (char) var7);
                          if (var8 != 0) {
                            StringBuilder discarded$1 = var5.append(var8);
                            var6++;
                            continue L4;
                          } else {
                            var6++;
                            continue L4;
                          }
                        } else {
                          var6++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, java.awt.Canvas param1) {
        j.a((java.awt.Component) (Object) param1, 103);
        fb.a(param0 + 32539, (java.awt.Component) (Object) param1);
        if (param0 != -32652) {
            field_i = null;
        }
        if (null != rd.field_l) {
            rd.field_l.a((java.awt.Component) (Object) param1, 23817);
        }
    }

    final static int e(int param0) {
        if (param0 != -12364) {
            return -34;
        }
        return kk.field_h;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = -1;
    }
}
