/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg {
    static String[] field_j;
    static String field_g;
    String field_f;
    static int[] field_d;
    String field_i;
    static w field_e;
    static String[] field_h;
    boolean field_c;
    static String[] field_a;
    static ck field_b;

    final static String a(String param0, String param1, int param2, byte param3) {
        if (param3 <= 122) {
            return null;
        }
        CharSequence var8 = (CharSequence) (Object) param0;
        if (!dc.a(var8, (byte) -70)) {
            return ge.field_d;
        }
        if (!((jj.field_b ^ -1) == -3)) {
            return be.field_s;
        }
        wb var7 = g.a(-3805, param1);
        if (!(var7 != null)) {
            return cm.a((byte) 97, ii.field_r, new String[1]);
        }
        var7.b((byte) 109);
        var7.e((byte) 74);
        ed.field_g = ed.field_g - 1;
        uf var5 = we.field_b;
        var5.f(param2, -4);
        var5.field_n = var5.field_n + 1;
        int var6 = var5.field_n;
        var5.a(true, 3);
        var5.a(0, param0);
        var5.b(var5.field_n - var6, true);
        return null;
    }

    public static void a(int param0) {
        Object var2 = null;
        field_e = null;
        field_b = null;
        if (param0 != 3) {
          var2 = null;
          String discarded$2 = sg.a((String) null, (String) null, 114, (byte) 124);
          field_j = null;
          field_a = null;
          field_h = null;
          field_g = null;
          field_d = null;
          return;
        } else {
          field_j = null;
          field_a = null;
          field_h = null;
          field_g = null;
          field_d = null;
          return;
        }
    }

    final static ql a(int param0, fd param1, int param2, int param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        ql var7 = null;
        Object var8 = null;
        java.awt.Frame var9 = null;
        if (param4 >= 54) {
          var9 = jh.a(param5, param1, param0, param2, false, param3);
          var6 = var9;
          if (var9 == null) {
            return null;
          } else {
            var7 = new ql();
            var7.field_g = var9;
            java.awt.Component discarded$3 = var7.field_g.add((java.awt.Component) (Object) var7);
            var7.setBounds(0, 0, param0, param5);
            var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
            var7.requestFocus();
            return var7;
          }
        } else {
          var8 = null;
          ql discarded$4 = sg.a(-76, (fd) null, 0, 22, 26, 93);
          var9 = jh.a(param5, param1, param0, param2, false, param3);
          var6 = var9;
          if (var9 == null) {
            return null;
          } else {
            var7 = new ql();
            var7.field_g = var9;
            java.awt.Component discarded$5 = var7.field_g.add((java.awt.Component) (Object) var7);
            var7.setBounds(0, 0, param0, param5);
            var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
            var7.requestFocus();
            return var7;
          }
        }
    }

    final static void a(String[][] param0, boolean param1, byte[] param2, ji param3, int[] param4, byte param5, String[][] param6, String[] param7, int param8, byte[] param9, pi[] param10, int[] param11, int param12, ji param13, String[] param14, ji param15, ck[][] param16, ck[][] param17, int param18) {
        if (param5 > -2) {
            boolean discarded$0 = sg.a((String) null, 4, -122L);
        }
        Object var20 = null;
        hb.a(param9, 1, param10, param3, param7, 3, param12, param13, param6, param17, param1, param4, param16, param2, param0, param15, param18, param14, param11, (String[]) null);
    }

    final static boolean a(String param0, int param1, long param2) {
        wb var4 = null;
        int stackIn_23_0 = 0;
        int stackIn_30_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_22_0 = 0;
        var4 = ed.a(param0, (byte) 16);
        if (param1 > 111) {
          if (var4 != null) {
            if (var4.field_Vb == null) {
              L0: {
                L1: {
                  if (cd.field_m == null) {
                    break L1;
                  } else {
                    if (bj.a(param2, (byte) 50) == null) {
                      break L1;
                    } else {
                      stackOut_28_0 = 1;
                      stackIn_30_0 = stackOut_28_0;
                      break L0;
                    }
                  }
                }
                stackOut_29_0 = 0;
                stackIn_30_0 = stackOut_29_0;
                break L0;
              }
              return stackIn_30_0 != 0;
            } else {
              return true;
            }
          } else {
            L2: {
              L3: {
                if (cd.field_m == null) {
                  break L3;
                } else {
                  if (bj.a(param2, (byte) 50) == null) {
                    break L3;
                  } else {
                    stackOut_21_0 = 1;
                    stackIn_23_0 = stackOut_21_0;
                    break L2;
                  }
                }
              }
              stackOut_22_0 = 0;
              stackIn_23_0 = stackOut_22_0;
              break L2;
            }
            return stackIn_23_0 != 0;
          }
        } else {
          field_e = null;
          if (var4 != null) {
            if (var4.field_Vb != null) {
              return true;
            } else {
              if (cd.field_m != null) {
                if (bj.a(param2, (byte) 50) == null) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            }
          } else {
            if (cd.field_m != null) {
              if (bj.a(param2, (byte) 50) == null) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_h = new String[]{"Before playing a multiplayer game, please learn the ropes by completing the first 3 stages of Stamina Mode. It will only take a few minutes.", "Congratulations! The multiplayer game is now unlocked.<br><br>If you wish, you can continue playing Stamina Mode, or you can end this game any time and enter the multiplayer lobby. Press 'ESC' for the Options Menu."};
        field_a = new String[3];
        field_g = "You are offering to draw.";
    }
}
