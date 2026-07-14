/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a extends java.awt.Canvas implements java.awt.event.FocusListener {
    static long field_f;
    static String field_j;
    static String field_k;
    static String field_e;
    static int[] field_c;
    static String field_i;
    static boolean field_d;
    volatile boolean field_b;
    java.awt.Frame field_g;
    static tg field_a;
    static float field_h;

    final void a(jk param0, int param1) {
        wf.a(((a) this).field_g, param0, param1 ^ -103);
        if (param1 != -3) {
            String discarded$0 = a.a((byte) 81, 'O', -12);
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static String a(int param0, String param1, byte param2) {
        int var4 = 0;
        nk var5 = null;
        CharSequence var6 = null;
        var6 = (CharSequence) (Object) param1;
        if (!ed.a(var6, 21257)) {
          return qj.field_a;
        } else {
          if (!qd.a((byte) 13, param1)) {
            if ((ld.field_g ^ -1) == -3) {
              if (va.a(param1, -19554)) {
                return oc.a(dh.field_g, new String[1], (byte) -94);
              } else {
                if (wc.field_v < 100) {
                  if (!ah.a(param1, -52)) {
                    if (param2 != 64) {
                      return null;
                    } else {
                      var5 = qn.field_U;
                      var5.f(param0, param2 + -165);
                      var5.field_l = var5.field_l + 1;
                      var4 = var5.field_l;
                      var5.c(2, (byte) 68);
                      var5.a(-121, param1);
                      var5.a(-var4 + var5.field_l, -1);
                      return null;
                    }
                  } else {
                    return oc.a(mf.field_B, new String[1], (byte) -85);
                  }
                } else {
                  return nb.field_Hb;
                }
              }
            } else {
              return td.field_j;
            }
          } else {
            return ed.field_a;
          }
        }
    }

    final static aj a(String[] args, int param1) {
        aj var2 = new aj(false);
        int var3 = -37 / ((-21 - param1) / 51);
        var2.field_a = args;
        return var2;
    }

    public static void a(int param0) {
        Object var2 = null;
        field_e = null;
        field_i = null;
        field_k = null;
        field_j = null;
        field_c = null;
        if (param0 != -9) {
          var2 = null;
          String discarded$2 = a.a(19, (String) null, (byte) 40);
          field_a = null;
          return;
        } else {
          field_a = null;
          return;
        }
    }

    final static java.awt.Container a(byte param0) {
        if (param0 != -110) {
            return null;
        }
        if (lk.field_a != null) {
            return (java.awt.Container) (Object) lk.field_a;
        }
        return (java.awt.Container) (Object) bh.i(81);
    }

    final static String a(int param0, String param1, int param2) {
        Object var4 = null;
        if (-4 != (param0 ^ -1)) {
          if ((param0 ^ -1) != -7) {
            if (param0 == -8) {
              return jf.field_g;
            } else {
              if (-9 == param0) {
                return lf.field_P;
              } else {
                if ((param0 ^ -1) == -10) {
                  return ma.field_F;
                } else {
                  if (param0 == 10) {
                    return dj.field_q;
                  } else {
                    if (param0 == 11) {
                      return hk.field_N;
                    } else {
                      if (-15 != (param0 ^ -1)) {
                        if (param2 == -3) {
                          return null;
                        } else {
                          var4 = null;
                          aj discarded$2 = a.a((String[]) null, -18);
                          return null;
                        }
                      } else {
                        return oc.a(hn.field_b, new String[1], (byte) -119);
                      }
                    }
                  }
                }
              }
            }
          } else {
            return hk.field_L;
          }
        } else {
          return uj.field_o;
        }
    }

    final static void a(int param0, java.awt.Component param1) {
        param1.setFocusTraversalKeysEnabled(false);
        int var2 = 15 / ((param0 - 36) / 59);
        param1.addKeyListener((java.awt.event.KeyListener) (Object) lg.field_d);
        param1.addFocusListener((java.awt.event.FocusListener) (Object) lg.field_d);
    }

    public final void update(java.awt.Graphics param0) {
    }

    public final void paint(java.awt.Graphics param0) {
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        ((a) this).field_b = true;
    }

    a() {
    }

    final static String a(byte param0, char param1, int param2) {
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        var5 = Chess.field_G;
        var6 = new char[param2];
        var3 = var6;
        var4 = 0;
        L0: while (true) {
          if (param2 <= var4) {
            if (param0 < 55) {
              field_k = null;
              return new String(var3);
            } else {
              return new String(var3);
            }
          } else {
            var6[var4] = param1;
            var4++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Chat is currently disabled.";
        field_i = "Enter name of friend to delete from list";
        field_k = "Private";
        field_j = "You are invited to <%0>'s game.";
    }
}
