/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nw extends oj {
    boolean field_A;
    static String field_z;
    private boolean field_C;
    static String field_y;
    int field_D;

    final String a(byte param0, boolean param1) {
        String var3 = null;
        int var4 = -81 % ((53 - param0) / 51);
        if (((nw) this).field_w != null) {
            var3 = "EventDamage: pos: (" + ((nw) this).field_w.field_J + "," + ((nw) this).field_w.field_w + "), amount: " + ((nw) this).field_D + ", poison: " + ((nw) this).field_A;
        } else {
            var3 = "EventDamage: unit: null, amount: " + ((nw) this).field_D + ", poison: " + ((nw) this).field_A;
        }
        return var3;
    }

    final static kl a(int param0, int param1, byte param2, boolean param3, boolean param4) {
        if (param2 < 98) {
          field_z = null;
          return tk.a(param1, param4, 1, false, param3, param0);
        } else {
          return tk.a(param1, param4, 1, false, param3, param0);
        }
    }

    final boolean a(at param0, byte param1, ic param2) {
        if (param1 > -84) {
            return false;
        }
        ((nw) this).a(param2.field_xb, -26661);
        return ((nw) this).a((byte) -39, param2, param0, true);
    }

    final static boolean g(int param0) {
        if (param0 <= 73) {
            field_z = null;
            return bl.field_b;
        }
        return bl.field_b;
    }

    final static void a(byte[] param0, String[][] param1, int param2, wk[][] param3, int param4, boolean param5, String[][] param6, int param7, kl param8, String[] param9, int param10, wk[][] param11, String[] param12, kl param13, ru[] param14, int[] param15, byte[] param16, String[] param17, kl param18, int[] param19) {
        ee.a(param14, param8, -84, param19, param18);
        g.a(param10 + -716, param8);
        nl.a(param16, param7, param2, param17, param6, param0, param1, param8, param11, param3, param9, param15, param12, false, param4);
        if (param10 != -5429) {
            field_z = null;
        }
        tg.a(param13, 2, param5, param8);
        hf.a(param10 + 13099);
        tr.h(14570);
        kc.d((byte) -112);
    }

    final void a(ha param0, int param1) {
        int var3 = 0;
        if (((nw) this).field_C) {
          return;
        } else {
          ((nw) this).field_C = true;
          if (-8 != (((nw) this).field_w.field_P ^ -1)) {
            if ((((nw) this).field_w.field_P ^ -1) != -9) {
              L0: {
                ((nw) this).field_w.field_I = ((nw) this).field_w.field_I | ((nw) this).field_A;
                var3 = ((nw) this).field_D;
                if (var3 > ((nw) this).field_w.field_A + ((nw) this).field_w.field_Y) {
                  var3 = ((nw) this).field_w.field_Y + ((nw) this).field_w.field_A;
                  break L0;
                } else {
                  break L0;
                }
              }
              ((nw) this).field_w.a(((nw) this).field_D, true);
              if (param1 == -26661) {
                if (!param0.field_b) {
                  hf.a(param0, (byte) 9, true);
                  return;
                } else {
                  param0.field_zb[((nw) this).field_w.field_O] = param0.field_zb[((nw) this).field_w.field_O] + var3;
                  param0.d(((nw) this).field_w.field_O, param0.field_zb[((nw) this).field_w.field_O], 72, 11);
                  hf.a(param0, (byte) 9, true);
                  return;
                }
              } else {
                field_y = null;
                if (!param0.field_b) {
                  hf.a(param0, (byte) 9, true);
                  return;
                } else {
                  param0.field_zb[((nw) this).field_w.field_O] = param0.field_zb[((nw) this).field_w.field_O] + var3;
                  param0.d(((nw) this).field_w.field_O, param0.field_zb[((nw) this).field_w.field_O], 72, 11);
                  hf.a(param0, (byte) 9, true);
                  return;
                }
              }
            } else {
              L1: {
                var3 = ((nw) this).field_D;
                if (var3 > ((nw) this).field_w.field_A + ((nw) this).field_w.field_Y) {
                  var3 = ((nw) this).field_w.field_Y + ((nw) this).field_w.field_A;
                  break L1;
                } else {
                  break L1;
                }
              }
              ((nw) this).field_w.a(((nw) this).field_D, true);
              if (param1 == -26661) {
                if (!param0.field_b) {
                  hf.a(param0, (byte) 9, true);
                  return;
                } else {
                  param0.field_zb[((nw) this).field_w.field_O] = param0.field_zb[((nw) this).field_w.field_O] + var3;
                  param0.d(((nw) this).field_w.field_O, param0.field_zb[((nw) this).field_w.field_O], 72, 11);
                  hf.a(param0, (byte) 9, true);
                  return;
                }
              } else {
                field_y = null;
                if (!param0.field_b) {
                  hf.a(param0, (byte) 9, true);
                  return;
                } else {
                  param0.field_zb[((nw) this).field_w.field_O] = param0.field_zb[((nw) this).field_w.field_O] + var3;
                  param0.d(((nw) this).field_w.field_O, param0.field_zb[((nw) this).field_w.field_O], 72, 11);
                  hf.a(param0, (byte) 9, true);
                  return;
                }
              }
            }
          } else {
            L2: {
              var3 = ((nw) this).field_D;
              if (var3 > ((nw) this).field_w.field_A + ((nw) this).field_w.field_Y) {
                var3 = ((nw) this).field_w.field_Y + ((nw) this).field_w.field_A;
                break L2;
              } else {
                break L2;
              }
            }
            ((nw) this).field_w.a(((nw) this).field_D, true);
            if (param1 == -26661) {
              if (!param0.field_b) {
                hf.a(param0, (byte) 9, true);
                return;
              } else {
                param0.field_zb[((nw) this).field_w.field_O] = param0.field_zb[((nw) this).field_w.field_O] + var3;
                param0.d(((nw) this).field_w.field_O, param0.field_zb[((nw) this).field_w.field_O], 72, 11);
                hf.a(param0, (byte) 9, true);
                return;
              }
            } else {
              field_y = null;
              if (!param0.field_b) {
                hf.a(param0, (byte) 9, true);
                return;
              } else {
                param0.field_zb[((nw) this).field_w.field_O] = param0.field_zb[((nw) this).field_w.field_O] + var3;
                param0.d(((nw) this).field_w.field_O, param0.field_zb[((nw) this).field_w.field_O], 72, 11);
                hf.a(param0, (byte) 9, true);
                return;
              }
            }
          }
        }
    }

    final static void b(byte param0, boolean param1) {
        rl.field_C.a(0, -122, 0);
        if (param0 != 92) {
            field_z = null;
        }
    }

    final static String a(String param0, byte param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        hl var7 = null;
        hl var8 = null;
        bv var10 = null;
        bv var11 = null;
        CharSequence var12 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        var12 = (CharSequence) (Object) param0;
        if (hg.a((byte) -31, var12)) {
          if ((th.field_a ^ -1) != -3) {
            return ql.field_l;
          } else {
            var8 = lg.a(param0, (byte) -34);
            if (var8 != null) {
              tc discarded$1 = wh.field_c.a(true, (tc) (Object) var8);
              L0: while (true) {
                var7 = (hl) (Object) wh.field_c.a((byte) 123);
                if (var7 == null) {
                  var8.d(param1 ^ -103);
                  if (param1 != -27) {
                    field_y = null;
                    var8.c((byte) -76);
                    dj.field_a = dj.field_a - 1;
                    var10 = vl.field_n;
                    var10.h(32161, param2);
                    var10.field_q = var10.field_q + 1;
                    var5 = var10.field_q;
                    var10.b(1, 1);
                    var10.b(param0, 13851);
                    var10.e(var10.field_q - var5, 5930);
                    return null;
                  } else {
                    var8.c((byte) -76);
                    dj.field_a = dj.field_a - 1;
                    var11 = vl.field_n;
                    var11.h(32161, param2);
                    var11.field_q = var11.field_q + 1;
                    var5 = var11.field_q;
                    var11.b(1, 1);
                    var11.b(param0, 13851);
                    var11.e(var11.field_q - var5, 5930);
                    return null;
                  }
                } else {
                  var7.field_Ob = var7.field_Ob - 1;
                  continue L0;
                }
              }
            } else {
              return fo.a(4800, sc.field_d, new String[1]);
            }
          }
        } else {
          return bc.field_d;
        }
    }

    public static void d(byte param0) {
        if (param0 != -26) {
            return;
        }
        field_y = null;
        field_z = null;
    }

    nw(jd param0, int param1, boolean param2) {
        ((nw) this).field_w = param0;
        ((nw) this).field_m = 15;
        ((nw) this).field_A = param2 ? true : false;
        ((nw) this).field_D = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Login";
        field_y = "Error connecting to server. Please try using a different server.";
    }
}
