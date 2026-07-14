/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf {
    static volatile int field_b;
    static hu field_a;
    static String field_i;
    int field_g;
    static String field_d;
    static String field_h;
    static int field_c;
    static String field_f;
    static String[] field_e;

    final static boolean a(byte[] param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_11_0 = 0;
        int stackIn_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        if (param3 == 3231) {
          if (param0 != null) {
            if ((param2 ^ -1) > -3) {
              L0: {
                var4 = param1 / 8;
                if (param0.length <= var4) {
                  break L0;
                } else {
                  if (var4 < 0) {
                    break L0;
                  } else {
                    L1: {
                      var5 = param0[var4];
                      var6 = 7 - (7 & param1);
                      if ((var5 & 1 << var6) == 0) {
                        stackOut_24_0 = 0;
                        stackIn_25_0 = stackOut_24_0;
                        break L1;
                      } else {
                        stackOut_23_0 = 1;
                        stackIn_25_0 = stackOut_23_0;
                        break L1;
                      }
                    }
                    return stackIn_25_0 != 0;
                  }
                }
              }
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          gf.a((byte) 92);
          if (param0 != null) {
            if ((param2 ^ -1) > -3) {
              var4 = param1 / 8;
              if (param0.length > var4) {
                if (var4 < 0) {
                  return false;
                } else {
                  L2: {
                    var5 = param0[var4];
                    var6 = 7 - (7 & param1);
                    if ((var5 & 1 << var6) == 0) {
                      stackOut_10_0 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      break L2;
                    } else {
                      stackOut_9_0 = 1;
                      stackIn_11_0 = stackOut_9_0;
                      break L2;
                    }
                  }
                  return stackIn_11_0 != 0;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int[] var5 = null;
        ml var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var11 = null;
        int[] var12 = null;
        dk var13 = null;
        ii var14 = null;
        ml var15 = null;
        Object var16 = null;
        dk var16_ref = null;
        var16 = null;
        var9 = Kickabout.field_G;
        var15 = un.field_e;
        var2 = 123 % ((param0 - -25) / 60);
        var3 = var15.h((byte) -106);
        if (var3 != 0) {
          if (-2 == (var3 ^ -1)) {
            var14 = (ii) (Object) il.field_a.g(24009);
            if (var14 == null) {
              lr.b((byte) -116);
              return;
            } else {
              var14.c((byte) -109);
              return;
            }
          } else {
            if (2 == var3) {
              var16_ref = (dk) (Object) ap.field_j.g(24009);
              if (var16_ref == null) {
                lr.b((byte) -116);
                return;
              } else {
                var16_ref.field_e = st.c(-23091);
                var16_ref.field_f = true;
                var16_ref.c((byte) -109);
                return;
              }
            } else {
              bd.a("A1: " + tr.b(0), (Throwable) null, 1);
              lr.b((byte) -116);
              return;
            }
          }
        } else {
          var12 = st.c(-23091);
          var4 = var12;
          var11 = var12;
          var5 = var11;
          var6 = var15;
          var7 = ((iw) (Object) var6).h((byte) -108);
          var8 = 0;
          L0: while (true) {
            if (var7 <= var8) {
              var13 = (dk) (Object) ap.field_j.g(24009);
              if (var13 == null) {
                lr.b((byte) -116);
                return;
              } else {
                var13.field_e = var4;
                var13.field_f = true;
                var13.c((byte) -109);
                return;
              }
            } else {
              var11[var8] = ((iw) (Object) var6).k(4);
              var8++;
              continue L0;
            }
          }
        }
    }

    final static vq a(bu param0, int param1, int param2, int param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        vq var7 = null;
        java.awt.Frame var8 = null;
        var8 = ol.a(param1 ^ -9027, param4, param2, param3, param0, param5);
        var6 = var8;
        if (var8 == null) {
          return null;
        } else {
          var7 = new vq();
          var7.field_c = var8;
          java.awt.Component discarded$2 = var7.field_c.add((java.awt.Component) (Object) var7);
          var7.setBounds(param1, 0, param4, param2);
          var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
          var7.requestFocus();
          return var7;
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_e = null;
        field_i = null;
        field_f = null;
        field_a = null;
        field_h = null;
        if (param0 != 64) {
            Object var2 = null;
            vq discarded$0 = gf.a((bu) null, 79, 33, -42, -123, 17);
        }
    }

    final static ld a(int param0, String param1) {
        int var2 = 0;
        String var3 = null;
        String var4 = null;
        ld var5 = null;
        if (param1 != null) {
          if (param1.length() != 0) {
            var2 = param1.indexOf((int) (char)param0);
            if ((var2 ^ -1) != 0) {
              var3 = param1.substring(0, var2);
              var4 = param1.substring(1 + var2);
              var5 = gp.a((byte) -25, var3);
              if (var5 != null) {
                return var5;
              } else {
                return ie.a(var4, param0 + -64);
              }
            } else {
              return ld.field_b;
            }
          } else {
            return cb.field_c;
          }
        } else {
          return cb.field_c;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = -1;
        field_i = "Unrated game";
        field_h = "Game options changed (<%0>)";
        field_f = "You can ask to join this game";
        field_d = "Use PageUp/PageDown or scroll the mouse wheel to zoom the camera.";
        field_e = new String[]{"Slots", "Trinkets"};
    }
}
