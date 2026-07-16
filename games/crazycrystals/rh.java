/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh {
    static int field_f;
    static String field_d;
    static boolean[] field_a;
    static String field_e;
    private String field_c;
    static ko field_g;
    private boolean field_b;

    rh(String param0) {
        this(param0, false);
    }

    final String a(byte param0) {
        if (param0 != -108) {
            field_a = null;
        }
        return ((rh) this).field_c;
    }

    public static void c(int param0) {
        field_a = null;
        if (param0 != 15157) {
            return;
        }
        field_e = null;
        field_d = null;
        field_g = null;
    }

    final boolean a(int param0) {
        if (param0 >= -101) {
            field_a = null;
        }
        return ((rh) this).field_b;
    }

    final static void a(int param0, java.awt.Component param1) {
        param1.removeKeyListener((java.awt.event.KeyListener) (Object) uf.field_c);
        param1.removeFocusListener((java.awt.event.FocusListener) (Object) uf.field_c);
        bo.field_n = param0;
    }

    final static void a(boolean param0) {
        dl var1 = null;
        Object var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        dl var6 = null;
        dl var7 = null;
        dl var8 = null;
        var4 = CrazyCrystals.field_B;
        kh.c(243, 197, 369, 143, 16777215);
        kh.f(244, 198, 367, 141, 0);
        if (null == nl.field_f) {
          L0: {
            if (null != rn.field_k) {
              int discarded$3 = rn.field_k.a(vl.field_b, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            var6 = nl.field_f[ue.field_a];
            var1 = var6;
            if (var6 != null) {
              var6.a(245, 199);
              break L1;
            } else {
              if (null == rn.field_k) {
                break L1;
              } else {
                int discarded$4 = rn.field_k.a(vl.field_b, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                break L1;
              }
            }
          }
          L2: {
            if (!param0) {
              break L2;
            } else {
              field_f = -64;
              break L2;
            }
          }
          L3: {
            if (h.field_b <= mb.field_f) {
              break L3;
            } else {
              var7 = nl.field_f[rd.field_f];
              if (var7 == null) {
                break L3;
              } else {
                var2_int = mb.field_f * (var7.field_n + 60) / h.field_b;
                var3 = var2_int + -30;
                if (!ve.field_t) {
                  pc.a(199, 617553576, 256 * (-var3 + var7.field_n) / 30, var7, -256 * var3 / 30, 245);
                  break L3;
                } else {
                  pc.a(199, 617553576, var3 * -256 / 30, var7, (-var3 + var7.field_n) * 256 / 30, 245);
                  break L3;
                }
              }
            }
          }
          L4: {
            if (rn.field_k != null) {
              var2 = null;
              var5 = 0;
              var3 = var5;
              L5: while (true) {
                if (var5 >= nl.field_f.length) {
                  if (var2 == null) {
                    break L4;
                  } else {
                    int discarded$5 = rn.field_k.a("Screenshot(s) " + var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                    break L4;
                  }
                } else {
                  var8 = nl.field_f[var5];
                  if (var8 != null) {
                    L6: {
                      if (var8.field_n != 365) {
                        break L6;
                      } else {
                        if ((var8.field_o ^ -1) != -140) {
                          break L6;
                        } else {
                          var5++;
                          continue L5;
                        }
                      }
                    }
                    if (var2 != null) {
                      var2 = (Object) (Object) (var2 + ", " + var5);
                      var5++;
                      continue L5;
                    } else {
                      var2 = (Object) (Object) Integer.toString(var5);
                      var5++;
                      continue L5;
                    }
                  } else {
                    var5++;
                    continue L5;
                  }
                }
              }
            } else {
              break L4;
            }
          }
          return;
        }
    }

    final static rh b(int param0) {
        if (param0 != 365) {
            field_e = null;
        }
        String var1 = vg.b((byte) -29);
        if (var1 != null) {
            if ((var1.indexOf('@') ^ -1) <= -1) {
                var1 = "";
            }
        }
        return new rh(vg.b((byte) -29), lk.b(param0 + -359));
    }

    rh(String param0, boolean param1) {
        ((rh) this).field_c = param0;
        ((rh) this).field_b = param1 ? true : false;
        if (null == ((rh) this).field_c) {
            ((rh) this).field_c = "";
        }
        if (((rh) this).field_c.length() == 0) {
            ((rh) this).field_b = false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "One-Player Puzzles";
        field_e = "Loading levels";
    }
}
