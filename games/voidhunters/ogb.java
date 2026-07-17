/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ogb extends rqa {
    static int field_o;

    final static void a(int param0, int param1) {
        si.field_s = 133;
        si.field_p = 33;
        int var2 = 98 / ((1 - param0) / 62);
        si.field_r = 21845;
    }

    final static void a(boolean param0, int param1, int param2, int param3, dja param4, int param5, dja param6, int param7, int param8, int param9, int param10, int param11, dja param12, int param13, byte param14) {
        try {
            qha.field_o = param11;
            ehb.field_g = param8;
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
            throw rta.a((Throwable) (Object) runtimeException, "ogb.B(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + param5 + 44 + (param6 != null ? "{...}" : "null") + 44 + param7 + 44 + param8 + 44 + param9 + 44 + param10 + 44 + param11 + 44 + (param12 != null ? "{...}" : "null") + 44 + param13 + 44 + 91 + 41);
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
        int[] var12 = null;
        int[] var13 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var9 = qga.field_b;
              var2 = var9.e((byte) -117);
              var3 = var9.e((byte) -94);
              if (0 == var2) {
                var4 = (br) (Object) ca.field_p.d(0);
                if (var4 == null) {
                  ifb.l(-128);
                  return;
                } else {
                  L2: {
                    var5 = -var9.field_e + vja.field_a;
                    var13 = var4.field_d;
                    var12 = var13;
                    var11 = var12;
                    var10 = var11;
                    var6 = var10;
                    if (var5 > var13.length << 2) {
                      var5 = var13.length << 2;
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
                      var6[var7 >> 2] = var6[var7 >> 2] + (var9.e((byte) -92) << (dla.a(3, var7) << 8));
                      var7++;
                      continue L3;
                    }
                  }
                }
              } else {
                if (var2 == 1) {
                  var4_int = var9.d(0);
                  var5_ref_ik = (ik) (Object) mhb.field_o.d(0);
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
                        var5_ref_ik = (ik) (Object) mhb.field_o.a((byte) 11);
                        continue L4;
                      }
                    }
                    if (var5_ref_ik == null) {
                      ifb.l(-121);
                      return;
                    } else {
                      var5_ref_ik.b(-3846);
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var1, "ogb.D(" + -8999 + 41);
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_3_0 = null;
        Object stackOut_1_0 = null;
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
              stackOut_3_0 = new nc((Object) (Object) "void");
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (nc) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ogb.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
        return stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 0;
    }
}
