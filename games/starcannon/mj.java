/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj {
    static nc field_b;
    private String field_a;
    static String[] field_c;

    final static String a(int param0, boolean param1, CharSequence param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = StarCannon.field_A;
        var3 = md.a(param1, param2, (byte) -81);
        if (var3 == null) {
          if (param0 >= 31) {
            var4 = 0;
            L0: while (true) {
              if (var4 < param2.length()) {
                if (!sa.a((byte) -121, param2.charAt(var4))) {
                  return ok.field_qb;
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        } else {
          return var3;
        }
    }

    final void a(java.applet.Applet param0, boolean param1) {
        if (!param1) {
            field_b = null;
        }
        wg.a((byte) 100, ((mj) this).field_a, param0, "jagex-last-login-method", 31536000L);
    }

    public static void a(boolean param0) {
        field_c = null;
        field_b = null;
        if (!param0) {
            field_c = null;
        }
    }

    final static boolean a(int param0, boolean param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        L0: {
          if (param1) {
            if (tk.field_f[param3] > tk.field_f[param0]) {
              return true;
            } else {
              if (tk.field_f[param3] < tk.field_f[param0]) {
                return false;
              } else {
                if (fg.field_b[param0] < fg.field_b[param3]) {
                  return true;
                } else {
                  if (fg.field_b[param3] < fg.field_b[param0]) {
                    return false;
                  } else {
                    break L0;
                  }
                }
              }
            }
          } else {
            if (fg.field_b[param3] > fg.field_b[param0]) {
              return true;
            } else {
              if (fg.field_b[param0] > fg.field_b[param3]) {
                return false;
              } else {
                if (tk.field_f[param3] > tk.field_f[param0]) {
                  return true;
                } else {
                  if (tk.field_f[param0] > tk.field_f[param3]) {
                    return false;
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
        }
        L1: {
          var4 = ab.field_G[param0] + gj.field_f[param0] + nf.field_b[param0];
          var5 = ab.field_G[param3] + (gj.field_f[param3] + nf.field_b[param3]);
          if (param2 == -24153) {
            break L1;
          } else {
            boolean discarded$1 = mj.a(93, false, 103, -10);
            break L1;
          }
        }
        if (var5 <= var4) {
          if (var4 <= var5) {
            L2: {
              if (param3 <= param0) {
                stackOut_33_0 = 0;
                stackIn_34_0 = stackOut_33_0;
                break L2;
              } else {
                stackOut_32_0 = 1;
                stackIn_34_0 = stackOut_32_0;
                break L2;
              }
            }
            return stackIn_34_0 != 0;
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final boolean a(String param0, int param1) {
        if (param1 >= -64) {
            return true;
        }
        return ((mj) this).field_a.equals((Object) (Object) param0);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    mj(String param0) {
        ((mj) this).field_a = param0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 == param3) {
            param0 = param0 >> 1;
        }
        if (param3 == 4) {
            param0 = param0 >> 2;
        }
        if (!(-7 != (param3 ^ -1))) {
            param0 = param0 >> 2;
        }
        if (param3 == -8) {
            param3 = 8;
            param0 = param0 >> 2;
        }
        int var5 = nb.field_g * param0 / 100;
        if (-1 < var5) {
            if (param2 == 0) {
                jk.field_k.a(gf.field_c[param3], param4, var5);
            } else {
                jk.field_k.a(gf.field_c[param3], param4, var5, param2);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new nc();
    }
}
