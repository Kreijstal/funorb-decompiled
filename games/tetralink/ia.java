/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia extends gn implements ij, dm {
    private fi field_N;
    static hl field_L;
    static String field_O;
    private ae field_M;
    static int field_K;
    private fk field_P;

    private final String i(int param0) {
        if (param0 != 99) {
            field_O = null;
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    final boolean a(int param0, char param1, int param2, na param3) {
        if (!super.a(param0, param1, param2, param3)) {
          if (98 != param0) {
            if (99 == param0) {
              return ((ia) this).b(param3, param2 ^ 113);
            } else {
              return false;
            }
          } else {
            return ((ia) this).d(param3, 48);
          }
        } else {
          return true;
        }
    }

    public final void a(byte param0, ae param1, int param2, int param3, int param4) {
        Object var7 = null;
        L0: {
          if (param1 == ((ia) this).field_M) {
            ud.d((byte) 102);
            ((ia) this).field_N.r(-128);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 >= 0) {
          var7 = null;
          ia.a((java.applet.Applet) null, false);
          return;
        } else {
          return;
        }
    }

    final static int h(int param0) {
        int var1 = -83 % ((param0 - 38) / 35);
        return lg.field_X;
    }

    public static void a(int param0) {
        int var1 = 10 / ((85 - param0) / 41);
        field_O = null;
        field_L = null;
    }

    ia(fi param0) {
        super(0, 0, 288, 0, (kg) null);
        ((ia) this).field_N = param0;
        ((ia) this).field_M = new ae(al.field_e, (dn) null);
        ((ia) this).field_M.field_H = (kg) (Object) new uj();
        String var7 = sk.a(new String[2], kd.field_e, 123);
        int var3 = 20;
        al var4 = new al(od.field_S, 0, 0, 0, 0, 16777215, -1, 3, 0, od.field_S.field_N, -1, 2147483647, true);
        ((ia) this).field_P = new fk(var7, (kg) (Object) var4);
        ((ia) this).field_P.field_C = "";
        ((ia) this).field_P.a(0, bf.field_o, (byte) -127);
        ((ia) this).field_P.a(1, bf.field_o, (byte) -127);
        ((ia) this).field_P.field_s = (dn) this;
        ((ia) this).field_P.field_F = ((ia) this).field_F + -40;
        ((ia) this).field_P.c(((ia) this).field_F - 40, 26, var3, -27);
        var3 = var3 + (15 + ((ia) this).field_P.field_u);
        ((ia) this).c((na) (Object) ((ia) this).field_P, 10);
        int var5 = 4;
        int var6 = 200;
        ((ia) this).field_M.a(40, var3, 114, 300 + -var6 >> -1483971007, var6);
        ((ia) this).field_M.field_s = (dn) this;
        ((ia) this).c((na) (Object) ((ia) this).field_M, 10);
        ((ia) this).a(var3 + 55 + var5, 0, -114, 0, 300);
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        if (param1) {
            return;
        }
        ld.a("", param0, -1);
        in.a(param0, 63);
    }

    final static boolean a(int param0, ah param1, int param2, int param3) {
        byte[] var5 = null;
        byte[] var4 = null;
        if (param3 >= -36) {
            field_L = null;
            var5 = param1.a(-96, param0, param2);
            var4 = var5;
            if (!(var5 != null)) {
                return false;
            }
            hk.a(var5, -62);
            return true;
        }
        var5 = param1.a(-96, param0, param2);
        var4 = var5;
        if (!(var5 != null)) {
            return false;
        }
        hk.a(var5, -62);
        return true;
    }

    private final String e(byte param0) {
        if (param0 >= -13) {
            return null;
        }
        return "</col></u>";
    }

    public final void a(int param0, byte param1, fk param2, int param3) {
        int var6 = 0;
        Object var7 = null;
        var6 = TetraLink.field_J;
        if (param1 == -103) {
          if (-1 != (param0 ^ -1)) {
            if (param0 != 1) {
              if (2 != param0) {
                return;
              } else {
                al.a("conduct.ws", (byte) 24);
                return;
              }
            } else {
              al.a("privacy.ws", (byte) 24);
              return;
            }
          } else {
            al.a("terms.ws", (byte) 24);
            return;
          }
        } else {
          var7 = null;
          ((ia) this).a((byte) -1, (ae) null, -75, 112, 43);
          if (-1 != (param0 ^ -1)) {
            if (param0 != 1) {
              if (2 != param0) {
                return;
              } else {
                al.a("conduct.ws", (byte) 24);
                return;
              }
            } else {
              al.a("privacy.ws", (byte) 24);
              return;
            }
          } else {
            al.a("terms.ws", (byte) 24);
            return;
          }
        }
    }

    final static void a(String[] args, int param1) {
        Object var3 = null;
        L0: {
          if (rm.field_a != null) {
            rm.field_a.field_L.a(0, args);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 == 10532) {
          if (null != ko.field_q) {
            ko.field_q.field_L.a(0, args);
            return;
          } else {
            return;
          }
        } else {
          var3 = null;
          boolean discarded$6 = ia.a(34, (ah) null, -118, -29);
          if (null == ko.field_q) {
            return;
          } else {
            ko.field_q.field_L.a(0, args);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = "This game has been updated! Please reload this page.";
    }
}
