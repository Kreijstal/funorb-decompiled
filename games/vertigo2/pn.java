/*
 * Decompiled by CFR-JS 0.4.0.
 */
class pn extends d {
    private nj field_P;
    static String[] field_Q;
    private pk field_I;
    static int field_R;
    static int[] field_K;
    static int field_L;
    static int field_O;
    private String[] field_M;
    static cr field_N;
    static String field_H;

    void a(boolean param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (param1 != 0) {
            return;
        }
        qa var5 = (qa) (Object) ((pn) this).field_B;
        pk var6 = ((pn) this).field_I;
        if (var6 != null) {
            var7 = var5.b((iq) this, param2, -14323);
            var8 = var5.a((iq) this, 1, param3);
            do {
                mr.a(var6.field_t - -2, -2 + var6.field_p + var8, var6.field_q - -2, 0, var7 + var6.field_s - 2);
                var6 = var6.field_n;
            } while (var6 != null);
        }
    }

    boolean a(byte param0, iq param1) {
        if (param0 != 116) {
            Object var4 = null;
            pn.a(-65, (byte) 81, (qn) null);
        }
        return false;
    }

    final void b(int param0, int param1, byte param2, int param3) {
        ((pn) this).a(false, param0, param1, ((qa) (Object) ((pn) this).field_B).a((iq) this, param2 + -120), param3);
        if (param2 != 119) {
            field_O = -24;
        }
    }

    pn(String param0, ur param1) {
        super(param0, (uf) null);
        ((pn) this).field_I = null;
        ((pn) this).field_B = param1;
    }

    void a(byte param0, int param1, int param2, iq param3) {
        int var5 = 0;
        int var6 = 0;
        super.a((byte) 115, param1, param2, param3);
        ((pn) this).field_I = null;
        if (param0 <= 6) {
            return;
        }
        if (!(!((pn) this).field_p)) {
            var5 = -param1 + (ed.field_n - ((pn) this).field_o);
            var6 = gb.field_d - (param2 - -((pn) this).field_t);
            ((pn) this).field_I = this.b(var6, var5, 498);
        }
    }

    final void a(int param0, int param1, String param2) {
        String[] var7 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = Vertigo2.field_L ? 1 : 0;
        if (((pn) this).field_M != null) {
            // if_icmple L24
        } else {
            var7 = new String[param0 - -1];
            var4 = var7;
            if (((pn) this).field_M != null) {
                for (var5 = 0; var5 < ((pn) this).field_M.length; var5++) {
                    var7[var5] = ((pn) this).field_M[var5];
                }
            }
            ((pn) this).field_M = var4;
        }
        ((pn) this).field_M[param0] = param2;
        if (param1 != 0) {
            field_L = -80;
        }
    }

    String a(boolean param0) {
        if (param0) {
            field_O = -114;
        }
        if (((pn) this).field_I == null) {
            return null;
        }
        if (null == ((pn) this).field_M) {
            return null;
        }
        if (((pn) this).field_I.field_u >= ((pn) this).field_M.length) {
            return null;
        }
        return ((pn) this).field_M[((pn) this).field_I.field_u];
    }

    final void e(byte param0) {
        int var2 = 0;
        qa var3 = null;
        ro var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        pk var10 = null;
        int var11 = 0;
        lq var12 = null;
        int var13 = 0;
        int var14 = 0;
        pk var15 = null;
        int var16 = 0;
        Object var17 = null;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        L0: {
          var16 = Vertigo2.field_L ? 1 : 0;
          ((pn) this).field_P = new nj();
          var2 = 0;
          var3 = (qa) (Object) ((pn) this).field_B;
          if (param0 <= -90) {
            break L0;
          } else {
            var17 = null;
            ((pn) this).a(54, -39, (String) null);
            break L0;
          }
        }
        var4 = var3.b((iq) this, 46);
        L1: while (true) {
          var5 = ((pn) this).field_w.indexOf("<hotspot=", var2);
          if (-1 != var5) {
            var7 = ((pn) this).field_w.indexOf(">", var5);
            var6 = ((pn) this).field_w.substring(9 + var5, var7);
            var7 = Integer.parseInt(var6);
            var2 = ((pn) this).field_w.indexOf("</hotspot>", var5);
            var8 = var4.a(var5, 22413);
            var9 = var4.a(var2, 22413);
            var10 = null;
            var11 = var8;
            L2: while (true) {
              if (var9 < var11) {
                continue L1;
              } else {
                L3: {
                  var12 = var4.field_c[var11];
                  if (var8 != var11) {
                    stackOut_9_0 = var12.field_c[0];
                    stackIn_10_0 = stackOut_9_0;
                    break L3;
                  } else {
                    stackOut_8_0 = var4.b(var5, 127);
                    stackIn_10_0 = stackOut_8_0;
                    break L3;
                  }
                }
                L4: {
                  var13 = stackIn_10_0;
                  if (var9 == var11) {
                    stackOut_14_0 = var4.b(var2, -90);
                    stackIn_15_0 = stackOut_14_0;
                    break L4;
                  } else {
                    if (var12 == null) {
                      stackOut_13_0 = 0;
                      stackIn_15_0 = stackOut_13_0;
                      break L4;
                    } else {
                      stackOut_12_0 = var12.field_c[-1 + var12.field_c.length];
                      stackIn_15_0 = stackOut_12_0;
                      break L4;
                    }
                  }
                }
                L5: {
                  var14 = stackIn_15_0;
                  var15 = new pk(var7, var13, var12.field_f, var14 + -var13, Math.max(var3.a((byte) -91), -var12.field_f + var12.field_d));
                  if (var10 == null) {
                    break L5;
                  } else {
                    var10.field_n = var15;
                    break L5;
                  }
                }
                ((pn) this).field_P.a((li) (Object) var15, false);
                var10 = var15;
                var11++;
                continue L2;
              }
            }
          } else {
            return;
          }
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        if (param0) {
            pk discarded$0 = this.b(22, 68, 111);
        }
        ((pn) this).e((byte) -127);
    }

    final static void a(int param0, byte param1, qn param2) {
        mi var3 = uh.field_Wb;
        var3.j(param0, 125);
        int var4 = -75 % ((param1 - -70) / 44);
        var3.f(param2.field_n, 125);
        var3.d(param2.field_x, -1783);
    }

    public static void a(byte param0) {
        field_H = null;
        field_K = null;
        if (param0 != -53) {
            Object var2 = null;
            pn.a((byte) 22, (ei) null);
        }
        field_Q = null;
        field_N = null;
    }

    private final pk b(int param0, int param1, int param2) {
        pk var4 = null;
        pk var5 = null;
        int var6 = 0;
        L0: {
          var6 = Vertigo2.field_L ? 1 : 0;
          if (param2 == 498) {
            break L0;
          } else {
            field_K = null;
            break L0;
          }
        }
        var4 = (pk) (Object) ((pn) this).field_P.a((byte) 100);
        L1: while (true) {
          if (var4 != null) {
            var5 = var4;
            L2: while (true) {
              if (var5 == null) {
                var4 = (pk) (Object) ((pn) this).field_P.b(param2 + -439);
                continue L1;
              } else {
                L3: {
                  if (param1 < var5.field_s) {
                    break L3;
                  } else {
                    if (var5.field_p > param0) {
                      break L3;
                    } else {
                      if (var5.field_s + var5.field_t <= param1) {
                        break L3;
                      } else {
                        if (param0 > var5.field_p - -var5.field_q) {
                          break L3;
                        } else {
                          return var4;
                        }
                      }
                    }
                  }
                }
                var5 = var5.field_n;
                continue L2;
              }
            }
          } else {
            return null;
          }
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        super.a(param0, param1, (byte) 127, param3);
        if (param2 < 111) {
            Object var8 = null;
            ((pn) this).a((byte) -49, -96, 6, (iq) null);
        }
        int var5 = param0 + -((pn) this).field_o;
        int var6 = param3 - ((pn) this).field_t;
        pk var7 = this.b(var6, var5, 498);
        if (var7 != null) {
            if (!(null == ((pn) this).field_v)) {
                ((cm) (Object) ((pn) this).field_v).a((pn) this, var7.field_u, param1, (byte) 70);
            }
        }
    }

    final static void a(byte param0, ei param1) {
        if (param0 <= 51) {
            field_H = null;
        }
        jm.field_B = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = new int[]{303, 375, 440, 498, 560};
        field_Q = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_H = "Sound: ";
        field_O = 98;
    }
}
