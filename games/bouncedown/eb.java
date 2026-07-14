/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb extends lc implements ki, rc {
    private wd field_H;
    static String field_D;
    static String field_z;
    private sd field_A;
    private vc field_B;
    static String field_F;
    static String[] field_E;

    public final void a(byte param0, int param1, int param2, int param3, wd param4) {
        if (param0 > 6) {
          if (((eb) this).field_H == param4) {
            ck.e((byte) 127);
            ((eb) this).field_A.a(true);
            return;
          } else {
            return;
          }
        } else {
          String discarded$3 = this.a(true);
          if (((eb) this).field_H != param4) {
            return;
          } else {
            ck.e((byte) 127);
            ((eb) this).field_A.a(true);
            return;
          }
        }
    }

    private final String c(boolean param0) {
        if (param0) {
            return null;
        }
        return "</col></u>";
    }

    private final String a(boolean param0) {
        if (param0) {
            Object var3 = null;
            ((eb) this).a((vc) null, (byte) -92, 87, 66);
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    public static void b(boolean param0) {
        field_E = null;
        field_D = null;
        if (!param0) {
          eb.b(false);
          field_F = null;
          field_z = null;
          return;
        } else {
          field_F = null;
          field_z = null;
          return;
        }
    }

    final boolean a(lk param0, char param1, int param2, int param3) {
        if (super.a(param0, param1, param2, param3)) {
          return true;
        } else {
          if ((param2 ^ -1) != -99) {
            if (param2 != 99) {
              return false;
            } else {
              return ((eb) this).a(param0, 19755);
            }
          } else {
            return ((eb) this).a((byte) -89, param0);
          }
        }
    }

    public final void a(vc param0, byte param1, int param2, int param3) {
        int var6 = 0;
        var6 = Bounce.field_N;
        if (param1 == 125) {
          if (0 != param3) {
            if (1 != param3) {
              if ((param3 ^ -1) == -3) {
                eh.a("conduct.ws", (byte) 21);
                return;
              } else {
                return;
              }
            } else {
              eh.a("privacy.ws", (byte) 21);
              return;
            }
          } else {
            eh.a("terms.ws", (byte) 21);
            return;
          }
        } else {
          String discarded$3 = this.a(false);
          if (0 != param3) {
            if (1 != param3) {
              if ((param3 ^ -1) != -3) {
                return;
              } else {
                eh.a("conduct.ws", (byte) 21);
                return;
              }
            } else {
              eh.a("privacy.ws", (byte) 21);
              return;
            }
          } else {
            eh.a("terms.ws", (byte) 21);
            return;
          }
        }
    }

    final static void a(java.awt.Component param0, byte param1) {
        param0.setFocusTraversalKeysEnabled(false);
        param0.addKeyListener((java.awt.event.KeyListener) (Object) qj.field_c);
        if (param1 != -105) {
          field_D = null;
          param0.addFocusListener((java.awt.event.FocusListener) (Object) qj.field_c);
          return;
        } else {
          param0.addFocusListener((java.awt.event.FocusListener) (Object) qj.field_c);
          return;
        }
    }

    eb(sd param0) {
        super(0, 0, 288, 0, (fc) null);
        ((eb) this).field_A = param0;
        ((eb) this).field_H = new wd(pc.field_i, (sk) null);
        ((eb) this).field_H.field_j = (fc) (Object) new jh();
        String var7 = jf.a(pa.field_b, new String[2], (byte) -126);
        int var3 = 20;
        jd var4 = new jd(sg.field_a, 0, 0, 0, 0, 16777215, -1, 3, 0, sg.field_a.field_s, -1, 2147483647, true);
        ((eb) this).field_B = new vc(var7, (fc) (Object) var4);
        ((eb) this).field_B.field_q = "";
        ((eb) this).field_B.a(ud.field_b, 0, (byte) 107);
        ((eb) this).field_B.a(ud.field_b, 1, (byte) 125);
        ((eb) this).field_B.field_n = (sk) this;
        ((eb) this).field_B.field_k = -40 + ((eb) this).field_k;
        ((eb) this).field_B.a(var3, (byte) -65, 26, ((eb) this).field_k + -40);
        var3 = var3 + (15 + ((eb) this).field_B.field_m);
        ((eb) this).b((lk) (Object) ((eb) this).field_B, true);
        int var5 = 4;
        int var6 = 200;
        ((eb) this).field_H.b(40, 80, var6, -var6 + 300 >> -279949599, var3);
        ((eb) this).field_H.field_n = (sk) this;
        ((eb) this).b((lk) (Object) ((eb) this).field_H, true);
        ((eb) this).b(var5 + var3 + 55, 80, 300, 0, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = null;
        field_F = "Accept";
    }
}
