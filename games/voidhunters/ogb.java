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
        try {
            qha.field_o = param11;
            ehb.field_g = param8;
            if (param14 != 91) {
                field_o = 34;
            }
            vi.field_o = param10;
            pr.field_d = param13;
            kha.field_v = param9;
            pra.field_o = param1;
            wc.field_a = param6;
            uqa.field_q = param4;
            pka.field_o = param3;
            nia.field_o = param0 ? true : false;
            gva.field_a = param12;
            fk.field_e = param5;
            iva.field_o = param2;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "ogb.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + (param12 != null ? "{...}" : "null") + ',' + param13 + ',' + param14 + ')');
        }
    }

    ogb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        br var4 = null;
        int var4_int = 0;
        ik var5_ref_ik = null;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        faa var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var9 = qga.field_b;
              var2 = var9.e((byte) -117);
              var3 = var9.e((byte) -94);
              if (0 == var2) {
                var4 = (br) ((Object) ca.field_p.d(param0 ^ -8999));
                if (var4 == null) {
                  ifb.l(-128);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var5 = -var9.field_e + vja.field_a;
                    var11 = var4.field_d;
                    var10 = var11;
                    var6 = var10;
                    if (var5 > var11.length << 1415274114) {
                      var5 = var11.length << 773132482;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var7 = 0;
                  L3: while (true) {
                    if (var5 <= var7) {
                      var4.b(-3846);
                      break L1;
                    } else {
                      var6[var7 >> -620522494] = var6[var7 >> -620522494] + (var9.e((byte) -92) << (dla.a(3, var7) << -1878263736));
                      var7++;
                      continue L3;
                    }
                  }
                }
              } else {
                if (-2 == (var2 ^ -1)) {
                  var4_int = var9.d(0);
                  var5_ref_ik = (ik) ((Object) mhb.field_o.d(0));
                  L4: while (true) {
                    L5: {
                      if (var5_ref_ik == null) {
                        break L5;
                      } else {
                        L6: {
                          if (var5_ref_ik.field_f != var3) {
                            break L6;
                          } else {
                            if (var4_int != var5_ref_ik.field_g) {
                              break L6;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var5_ref_ik = (ik) ((Object) mhb.field_o.a((byte) 11));
                        continue L4;
                      }
                    }
                    if (var5_ref_ik == null) {
                      ifb.l(-121);
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var5_ref_ik.b(param0 ^ 11299);
                      break L1;
                    }
                  }
                } else {
                  gna.a((Throwable) null, "LR1: " + hm.e(-13514), 0);
                  ifb.l(-116);
                  break L1;
                }
              }
            }
            if (param0 == -8999) {
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              field_o = 127;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1), "ogb.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_3_0 = null;
        nc stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            tr.a(param0[3].a(55), false, param0[2].a(84), param0[1].a(115), param0[0].a(88));
            if (param1 < -119) {
              stackOut_3_0 = new nc("void");
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (nc) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("ogb.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
        field_o = 0;
    }
}
