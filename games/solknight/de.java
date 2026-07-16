/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de {
    final static int a(int param0) {
        if (param0 >= -102) {
            Object var2 = null;
            o[] discarded$0 = de.a(92, -99, 46, (da) null);
            return cf.field_e;
        }
        return cf.field_e;
    }

    final static void a(java.applet.Applet param0, int param1) {
        String var2 = null;
        Object var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        if (param1 == 0) {
          var2 = param0.getParameter("username");
          if (var2 != null) {
            var5 = (CharSequence) (Object) var2;
            if ((ti.a(var5, (byte) 44) ^ -1L) == -1L) {
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          var3 = null;
          de.a((java.applet.Applet) null, -89);
          var2 = param0.getParameter("username");
          if (var2 != null) {
            var4 = (CharSequence) (Object) var2;
            if ((ti.a(var4, (byte) 44) ^ -1L) == -1L) {
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final static void a(dl param0, java.awt.Frame param1, byte param2) {
        nj var3 = null;
        int var4 = 0;
        var4 = SolKnight.field_L ? 1 : 0;
        L0: while (true) {
          var3 = param0.a(39, param1);
          L1: while (true) {
            if ((var3.field_c ^ -1) != -1) {
              if (-2 != (var3.field_c ^ -1)) {
                i.a((byte) 30, 100L);
                continue L0;
              } else {
                if (param2 >= 117) {
                  param1.setVisible(false);
                  param1.dispose();
                  return;
                } else {
                  return;
                }
              }
            } else {
              i.a((byte) 89, 10L);
              continue L1;
            }
          }
        }
    }

    final static o[] a(int param0, int param1, int param2, da param3) {
        if (l.a(param2 + 17097, param1, param0, param3)) {
          if (param2 != -17042) {
            int discarded$2 = de.a(9);
            return vb.e(param2 ^ -17007);
          } else {
            return vb.e(param2 ^ -17007);
          }
        } else {
          return null;
        }
    }

    static {
    }
}
