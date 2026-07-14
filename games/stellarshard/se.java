/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se extends g implements oi {
    private ig field_D;
    private ig field_I;
    static String[] field_E;
    static int[] field_B;
    static int[] field_C;
    private ig field_F;
    static int field_H;

    final static String a(int param0, byte[] param1) {
        if (param0 != 0) {
            field_B = null;
            return kk.a(param1.length, (byte) -75, 0, param1);
        }
        return kk.a(param1.length, (byte) -75, 0, param1);
    }

    public se() {
        super(0, 0, 476, 225, (uk) null);
        ((se) this).field_D = new ig(gk.field_g, (lf) null);
        ((se) this).field_F = new ig(bc.field_h, (lf) null);
        ((se) this).field_I = new ig(o.field_c, (lf) null);
        b var1 = new b();
        ((se) this).field_D.field_u = (uk) (Object) var1;
        ((se) this).field_F.field_u = (uk) (Object) var1;
        ((se) this).field_I.field_u = (uk) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> 1543612289;
        ((se) this).field_F.b(var4, -var3 + ((se) this).field_p >> -1541895679, -var2 + ((se) this).field_t + -48, 30, 23987);
        ((se) this).field_I.b(var4, var4 + ((((se) this).field_p - var3 >> 1054933121) + var2), -48 + (((se) this).field_t + -var2), 30, 23987);
        ((se) this).field_D.b(var3, ((se) this).field_p - var3 >> -1161458527, -(var2 * 2) + -78 + ((se) this).field_t, 30, 23987);
        ((se) this).field_F.field_v = (lf) this;
        ((se) this).field_D.field_v = (lf) this;
        ((se) this).field_I.field_v = (lf) this;
        ((se) this).field_D.field_x = hi.field_c;
        ((se) this).field_I.field_x = ua.field_f;
        ((se) this).b(4, (rj) (Object) ((se) this).field_F);
        ((se) this).b(4, (rj) (Object) ((se) this).field_D);
        ((se) this).b(4, (rj) (Object) ((se) this).field_I);
    }

    public static void e(byte param0) {
        field_C = null;
        if (param0 != 9) {
            se.e((byte) -6);
            field_E = null;
            field_B = null;
            return;
        }
        field_E = null;
        field_B = null;
    }

    final static void a(int param0, int param1) {
        gg var2 = null;
        int var3 = 0;
        kl var4 = null;
        var3 = stellarshard.field_B;
        if (param1 < -67) {
          var4 = (kl) (Object) nl.field_e.b(-103);
          L0: while (true) {
            if (var4 == null) {
              var2 = pl.field_W.b(-79);
              L1: while (true) {
                if (var2 != null) {
                  bf.a(param0, (byte) -106);
                  var2 = pl.field_W.b((byte) -124);
                  continue L1;
                } else {
                  return;
                }
              }
            } else {
              ca.a(param0, var4, (byte) 93);
              var4 = (kl) (Object) nl.field_e.b((byte) 117);
              continue L0;
            }
          }
        } else {
          field_E = null;
          var4 = (kl) (Object) nl.field_e.b(-103);
          L2: while (true) {
            if (var4 == null) {
              var2 = pl.field_W.b(-79);
              L3: while (true) {
                if (var2 != null) {
                  bf.a(param0, (byte) -106);
                  var2 = pl.field_W.b((byte) -124);
                  continue L3;
                } else {
                  return;
                }
              }
            } else {
              ca.a(param0, var4, (byte) 93);
              var4 = (kl) (Object) nl.field_e.b((byte) 117);
              continue L2;
            }
          }
        }
    }

    public final void a(int param0, int param1, ig param2, boolean param3, int param4) {
        int var7 = 0;
        int stackIn_8_0 = 0;
        int stackIn_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var7 = stellarshard.field_B;
        if (!param3) {
          if (param2 == ((se) this).field_F) {
            ll.c(32270);
            return;
          } else {
            if (param2 != ((se) this).field_D) {
              if (((se) this).field_I == param2) {
                L0: {
                  if (param3) {
                    stackOut_20_0 = 0;
                    stackIn_21_0 = stackOut_20_0;
                    break L0;
                  } else {
                    stackOut_19_0 = 1;
                    stackIn_21_0 = stackOut_19_0;
                    break L0;
                  }
                }
                qh.a(stackIn_21_0 != 0);
                return;
              } else {
                return;
              }
            } else {
              ta.a((byte) 91);
              return;
            }
          }
        } else {
          ((se) this).field_I = null;
          if (param2 == ((se) this).field_F) {
            ll.c(32270);
            return;
          } else {
            if (param2 == ((se) this).field_D) {
              ta.a((byte) 91);
              return;
            } else {
              if (((se) this).field_I == param2) {
                L1: {
                  if (param3) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L1;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L1;
                  }
                }
                qh.a(stackIn_8_0 != 0);
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final boolean a(int param0, int param1, char param2, rj param3) {
        if (!(!super.a(param0, param1, param2, param3))) {
            return true;
        }
        if (-99 == (param1 ^ -1)) {
            return ((se) this).a(param3, param0 + -38323);
        }
        if ((param1 ^ -1) != -100) {
            return false;
        }
        return ((se) this).a(param3, (byte) -118);
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = param3 + ((se) this).field_w;
        int var6 = param2 + ((se) this).field_k;
        int discarded$0 = si.field_V.a(e.field_b, 20 + var5, 20 + var6, -40 + ((se) this).field_p, ((se) this).field_t + -50, 16777215, -1, 1, 0, si.field_V.field_N);
        super.a(param0, param1, param2, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_C = new int[8192];
        field_H = 0;
    }
}
