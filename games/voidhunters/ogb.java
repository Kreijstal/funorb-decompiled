/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ogb extends rqa {
    static int field_o;

    final static void a(int param0, int param1) {
        si.field_s = param1 * 400 / 150;
        si.field_p = param1 * 100 / 150;
        int var2 = 98 / ((1 - param0) / 62);
        si.field_r = (param1 << 962383728) / 150;
    }

    final static void a(boolean param0, int param1, int param2, int param3, dja param4, int param5, dja param6, int param7, int param8, int param9, int param10, int param11, dja param12, int param13, byte param14) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        qha.field_o = param11;
        ehb.field_g = param8;
        if (param14 != 91) {
          L0: {
            field_o = 34;
            vi.field_o = param10;
            pr.field_d = param13;
            kha.field_v = param9;
            pra.field_o = param1;
            wc.field_a = param6;
            uqa.field_q = param4;
            pka.field_o = param3;
            if (!param0) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          nia.field_o = stackIn_8_0 != 0;
          gva.field_a = param12;
          fk.field_e = param5;
          iva.field_o = param2;
          return;
        } else {
          L1: {
            vi.field_o = param10;
            pr.field_d = param13;
            kha.field_v = param9;
            pra.field_o = param1;
            wc.field_a = param6;
            uqa.field_q = param4;
            pka.field_o = param3;
            if (!param0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          nia.field_o = stackIn_4_0 != 0;
          gva.field_a = param12;
          fk.field_e = param5;
          iva.field_o = param2;
          return;
        }
    }

    ogb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4_int = 0;
        br var4 = null;
        ik var5_ref_ik = null;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        faa var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        var8 = VoidHunters.field_G;
        var9 = qga.field_b;
        var2 = var9.e((byte) -117);
        var3 = var9.e((byte) -94);
        if (0 == var2) {
          var4 = (br) (Object) ca.field_p.d(param0 ^ -8999);
          if (var4 == null) {
            ifb.l(-128);
            return;
          } else {
            L0: {
              var5 = -var9.field_e + vja.field_a;
              var13 = var4.field_d;
              var12 = var13;
              var11 = var12;
              var10 = var11;
              var6 = var10;
              if (var5 > var13.length << 1415274114) {
                var5 = var13.length << 773132482;
                break L0;
              } else {
                break L0;
              }
            }
            var7 = 0;
            L1: while (true) {
              if (var5 <= var7) {
                var4.b(-3846);
                if (param0 == -8999) {
                  return;
                } else {
                  field_o = 127;
                  return;
                }
              } else {
                var6[var7 >> -620522494] = var6[var7 >> -620522494] + (var9.e((byte) -92) << (dla.a(3, var7) << -1878263736));
                var7++;
                continue L1;
              }
            }
          }
        } else {
          if (-2 == (var2 ^ -1)) {
            var4_int = var9.d(0);
            var5_ref_ik = (ik) (Object) mhb.field_o.d(0);
            L2: while (true) {
              if (var5_ref_ik == null) {
                if (var5_ref_ik == null) {
                  ifb.l(-121);
                  return;
                } else {
                  var5_ref_ik.b(param0 ^ 11299);
                  if (param0 == -8999) {
                    return;
                  } else {
                    field_o = 127;
                    return;
                  }
                }
              } else {
                L3: {
                  if (var5_ref_ik.field_f != var3) {
                    break L3;
                  } else {
                    if (var4_int != var5_ref_ik.field_g) {
                      break L3;
                    } else {
                      if (var5_ref_ik == null) {
                        ifb.l(-121);
                        return;
                      } else {
                        var5_ref_ik.b(param0 ^ 11299);
                        L4: {
                          if (param0 == -8999) {
                            break L4;
                          } else {
                            field_o = 127;
                            break L4;
                          }
                        }
                        return;
                      }
                    }
                  }
                }
                var5_ref_ik = (ik) (Object) mhb.field_o.a((byte) 11);
                continue L2;
              }
            }
          } else {
            gna.a((Throwable) null, "LR1: " + hm.e(-13514), 0);
            ifb.l(-116);
            if (param0 == -8999) {
              return;
            } else {
              field_o = 127;
              return;
            }
          }
        }
    }

    final nc a(nc[] param0, int param1) {
        tr.a(param0[3].a(55), false, param0[2].a(84), param0[1].a(115), param0[0].a(88));
        if (param1 >= -119) {
          return null;
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 0;
    }
}
