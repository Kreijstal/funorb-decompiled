/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qr extends jq {
    private int field_i;
    private int field_s;
    static rp field_l;
    static int field_n;
    static String field_o;
    static er field_q;
    static er field_h;
    static cr field_m;
    private int field_r;
    static String[] field_k;
    private int field_p;
    static int field_j;

    qr(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        super(param4, param5, param6);
        ((qr) this).field_i = param0;
        ((qr) this).field_s = param2;
        ((qr) this).field_r = param3;
        ((qr) this).field_p = param1;
    }

    final static tn a(int param0, int param1, int param2, int param3) {
        Object var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        tn var8_ref_tn = null;
        int var9 = 0;
        tn var9_ref_tn = null;
        int var10_int = 0;
        String var10 = null;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        var13 = Vertigo2.field_L ? 1 : 0;
        mg.field_R.field_Nb.field_M.c(0);
        var4 = null;
        var5 = 0;
        var6 = 0;
        var7 = no.field_d - 1;
        L0: while (true) {
          if (0 > var7) {
            var7 = 0;
            var8 = 0;
            L1: while (true) {
              if (var8 >= no.field_d) {
                var8 = -var7 - (-var6 - mg.field_R.field_Nb.field_kb - mg.field_R.field_Nb.field_db);
                if (param1 >= 4) {
                  L2: {
                    mg.field_R.field_Nb.field_db = mg.field_R.field_Nb.field_db - var8;
                    mg.field_R.field_Nb.field_N = mg.field_R.field_Nb.field_N + var8;
                    if (!dc.field_B) {
                      break L2;
                    } else {
                      mg.field_R.field_Nb.field_db = var7;
                      break L2;
                    }
                  }
                  L3: {
                    if (!dc.field_B) {
                      break L3;
                    } else {
                      dc.field_B = false;
                      mg.field_R.field_Nb.field_L = 0;
                      nb.field_z = true;
                      mg.field_R.field_Nb.field_N = mg.field_R.field_Lb.field_db + -mg.field_R.field_Nb.field_db;
                      break L3;
                    }
                  }
                  L4: {
                    mg.field_R.field_Nb.field_kb = var7 + -mg.field_R.field_Nb.field_db;
                    if (!il.field_a) {
                      break L4;
                    } else {
                      if (null != gk.field_c) {
                        nb.field_z = true;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    var9 = -mg.field_R.field_Nb.field_db + (-mg.field_R.field_Nb.field_kb + mg.field_R.field_Lb.field_db);
                    if (!nb.field_z) {
                      break L5;
                    } else {
                      mg.field_R.field_Nb.field_L = -mg.field_R.field_Nb.field_N + var9;
                      break L5;
                    }
                  }
                  L6: {
                    mg.field_R.a(param3, true, -1, param2 * 2 * param3);
                    if (mg.field_R.field_Nb.field_L + mg.field_R.field_Nb.field_N != var9) {
                      stackOut_40_0 = 0;
                      stackIn_41_0 = stackOut_40_0;
                      break L6;
                    } else {
                      stackOut_39_0 = 1;
                      stackIn_41_0 = stackOut_39_0;
                      break L6;
                    }
                  }
                  nb.field_z = stackIn_41_0 != 0;
                  return (tn) var4;
                } else {
                  return null;
                }
              } else {
                var9_ref_tn = eo.field_l[var8];
                if (null != var9_ref_tn.field_e) {
                  mg.field_R.field_Nb.b(var9_ref_tn.field_e, 127);
                  var9_ref_tn.field_e.a(73, var9_ref_tn.field_e.j(-21391), param3, var7, param0);
                  var7 = var7 + param3;
                  if (var9_ref_tn.field_e.field_tb != 0) {
                    var4 = (Object) (Object) var9_ref_tn;
                    var8++;
                    continue L1;
                  } else {
                    var8++;
                    continue L1;
                  }
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            L7: {
              var8_ref_tn = eo.field_l[var7];
              var9 = 0;
              if (pe.field_r) {
                break L7;
              } else {
                if (ll.field_b <= var5) {
                  break L7;
                } else {
                  var10_int = ab.a(0, var8_ref_tn.field_s);
                  if (var8_ref_tn.a((byte) 44) < var10_int) {
                    break L7;
                  } else {
                    L8: {
                      if (var8_ref_tn.field_n) {
                        break L8;
                      } else {
                        if (iq.b(var8_ref_tn.field_a, 113)) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    var9 = 1;
                    break L7;
                  }
                }
              }
            }
            if (var9 == 0) {
              var8_ref_tn.field_e = null;
              var7--;
              continue L0;
            } else {
              L9: {
                var5++;
                if (var8_ref_tn.field_e == null) {
                  break L9;
                } else {
                  if (dc.field_B) {
                    break L9;
                  } else {
                    var7--;
                    continue L0;
                  }
                }
              }
              L10: {
                if (var8_ref_tn.field_e == null) {
                  wg.field_g = wg.field_g + 1;
                  break L10;
                } else {
                  break L10;
                }
              }
              var10 = nb.a(var8_ref_tn, 106);
              var11 = var10 + cc.b(var8_ref_tn.field_d);
              var12 = mm.a(var8_ref_tn, 0);
              var8_ref_tn.field_e = new cr(0L, np.field_Ib, var11);
              var8_ref_tn.field_e.field_A = var12;
              var8_ref_tn.field_e.field_B = (np.field_Ib.field_B >> 1 & 8355711) + var12 + -(8355711 & var12 >> 1);
              var8_ref_tn.field_e.field_z = cg.field_f;
              var8_ref_tn.field_e.field_H = var12 + (-((var12 & 16711423) >> 1) - -(8355711 & np.field_Ib.field_H >> 1));
              var6 = var6 + param3;
              var7--;
              continue L0;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = ((qr) this).field_i * param1 >> 12;
        int var5 = ((qr) this).field_s * param1 >> 12;
        int var6 = ((qr) this).field_p * param0 >> 12;
        int var7 = param0 * ((qr) this).field_r >> 12;
        if (param2 != 45) {
            ((qr) this).field_p = 90;
        }
        ng.a(((qr) this).field_a, var4, var7, var5, ((qr) this).field_f, param2 + -131, var6);
    }

    public static void a(boolean param0) {
        field_k = null;
        field_l = null;
        field_q = null;
        field_o = null;
        field_m = null;
        field_h = null;
    }

    final void a(int param0, byte param1, int param2) {
        int var4 = ((qr) this).field_i * param2 >> 12;
        int var5 = ((qr) this).field_s * param2 >> 12;
        if (param1 >= -31) {
            ((qr) this).field_p = -29;
        }
        int var6 = param0 * ((qr) this).field_p >> 12;
        int var7 = ((qr) this).field_r * param0 >> 12;
        ml.a(((qr) this).field_g, var4, var7, var6, var5, -109);
    }

    final void b(int param0, byte param1, int param2) {
        int var4 = ((qr) this).field_i * param0 >> 12;
        int var5 = ((qr) this).field_s * param0 >> 12;
        if (param1 < 26) {
            return;
        }
        int var6 = param2 * ((qr) this).field_p >> 12;
        int var7 = ((qr) this).field_r * param2 >> 12;
        aq.a(var5, ((qr) this).field_f, ((qr) this).field_g, ((qr) this).field_a, var7, var4, 0, var6);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 4;
        field_o = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_k = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
