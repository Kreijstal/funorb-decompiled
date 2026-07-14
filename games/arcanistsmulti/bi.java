/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi extends rn implements el {
    static int field_I;
    private int field_V;
    private pd field_T;
    static kc field_U;
    static String field_W;

    final static void a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        nb.a(true, ao.field_g, -24595, 0, je.field_b, param1, tm.field_g);
        var2 = 0;
        L0: while (true) {
          if (je.field_b <= var2) {
            if (param0 <= -103) {
              nb.a(false, ld.field_m, -24595, param1, param1 + je.field_b, param1 + param1, qa.field_m);
              if (param1 < je.field_b) {
                je.field_b = param1;
                return;
              } else {
                return;
              }
            } else {
              field_U = null;
              nb.a(false, ld.field_m, -24595, param1, param1 + je.field_b, param1 + param1, qa.field_m);
              if (param1 >= je.field_b) {
                return;
              } else {
                je.field_b = param1;
                return;
              }
            }
          } else {
            ki.field_r[var2 - -param1] = var2;
            var2++;
            continue L0;
          }
        }
    }

    final static Object a(boolean param0, int param1, byte[] param2) {
        wi var3 = null;
        if (param1 == 0) {
          if (param2 != null) {
            if (136 < param2.length) {
              var3 = new wi();
              ((bg) (Object) var3).a(110, param2);
              return (Object) (Object) var3;
            } else {
              if (param0) {
                return (Object) (Object) dd.a(param2, 0);
              } else {
                return (Object) (Object) param2;
              }
            }
          } else {
            return null;
          }
        } else {
          field_U = null;
          if (param2 != null) {
            if (136 < param2.length) {
              var3 = new wi();
              ((bg) (Object) var3).a(110, param2);
              return (Object) (Object) var3;
            } else {
              if (param0) {
                return (Object) (Object) dd.a(param2, 0);
              } else {
                return (Object) (Object) param2;
              }
            }
          } else {
            return null;
          }
        }
    }

    final String b(boolean param0) {
        if (!param0) {
          if (((bi) this).field_w) {
            if (((bi) this).field_q == null) {
              return null;
            } else {
              ih.a(((bi) this).field_v - (((bi) this).field_V - an.field_g), me.field_I, (byte) 69);
              return ((bi) this).field_q;
            }
          } else {
            return null;
          }
        } else {
          field_U = null;
          if (((bi) this).field_w) {
            if (((bi) this).field_q == null) {
              return null;
            } else {
              ih.a(((bi) this).field_v - (((bi) this).field_V - an.field_g), me.field_I, (byte) 69);
              return ((bi) this).field_q;
            }
          } else {
            return null;
          }
        }
    }

    final void a(qm param0, int param1, int param2, int param3) {
        this.a(param0, param1, param2, param3);
        ((bi) this).field_V = an.field_g - (((bi) this).field_n + param1);
    }

    public final pd a(int param0) {
        if (param0 != 0) {
            return null;
        }
        return ((bi) this).field_T;
    }

    final void l(int param0) {
        this.l(param0);
        if (!(null == ((bi) this).field_T)) {
            ((bi) this).field_T.b(-17444);
        }
    }

    final void a(pd param0, byte param1) {
        ((bi) this).field_T = param0;
        int var3 = -16 / ((-87 - param1) / 37);
    }

    bi(String param0, wc param1, int param2) {
        super(param0, param1, param2);
    }

    public static void o(int param0) {
        if (param0 != 0) {
            bi.a((byte) 84, -108);
            field_W = null;
            field_U = null;
            return;
        }
        field_W = null;
        field_U = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_W = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find a suitable opponent in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
    }
}
