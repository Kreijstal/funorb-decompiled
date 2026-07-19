/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uba extends rqa {
    final static void a(byte param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = VoidHunters.field_G;
        if (0 > nd.field_r) {
          return;
        } else {
          L0: {
            var3 = -135 + param1;
            var4 = param2 + -35;
            var5 = 256;
            if ((nd.field_r ^ -1) <= -76) {
              break L0;
            } else {
              var5 = (nd.field_r << -198386520) / 75;
              break L0;
            }
          }
          L1: {
            if (-201 > (nd.field_r ^ -1)) {
              var5 = (250 + -nd.field_r << 1149450280) / 50;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (param0 == 82) {
              break L2;
            } else {
              uba.a((byte) -71, -110, -57);
              break L2;
            }
          }
          L3: {
            de.a(74, ata.field_K);
            bfb.e();
            dma.a();
            pw.a((byte) 74);
            if (-257 >= (var5 ^ -1)) {
              break L3;
            } else {
              dma.e(0, 0, dma.field_g, dma.field_j, 0, -var5 + 256);
              break L3;
            }
          }
          L4: {
            bia.a((byte) 124);
            if (nd.field_r < 150) {
              ata.field_K.d(var3, var4);
              break L4;
            } else {
              cg.field_o.d(var3 + 15, 10 + var4, var5);
              break L4;
            }
          }
          L5: {
            var6 = nd.field_r - 125;
            if (0 >= var6) {
              break L5;
            } else {
              if (-51 >= (var6 ^ -1)) {
                break L5;
              } else {
                if (var6 < 20) {
                  var7 = 256 * var6 / 20;
                  db.field_p.c(var3, var4, var7);
                  break L5;
                } else {
                  if (30 <= var6) {
                    var7 = (12800 - 256 * var6) / 20;
                    db.field_p.c(var3, var4, var7);
                    break L5;
                  } else {
                    db.field_p.c(var3, var4, 256);
                    break L5;
                  }
                }
              }
            }
          }
          L6: {
            var6 = -140 + nd.field_r;
            if (0 < var6) {
              L7: {
                var7 = 256;
                if (var6 < 20) {
                  var7 = var6 * 256 / 20;
                  break L7;
                } else {
                  break L7;
                }
              }
              reb.field_a.d(15 + var3, var4 + 10, var5 * var7 >> 98987848);
              break L6;
            } else {
              break L6;
            }
          }
          return;
        }
    }

    final nc a(nc[] param0, int param1) {
        nc discarded$2 = null;
        RuntimeException var3 = null;
        nc[] var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              gnb.field_a = param0[0].a(30);
              if (param1 < -119) {
                break L1;
              } else {
                var4 = (nc[]) null;
                discarded$2 = this.a((nc[]) null, -7);
                break L1;
              }
            }
            stackOut_2_0 = new nc("void");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("uba.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(byte param0, int param1, Object param2) {
        int var3_int = 0;
        qsa var3 = null;
        RuntimeException var3_ref = null;
        qsa var4 = null;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= hcb.field_p) {
                if (param0 == -100) {
                  L2: {
                    var3 = lua.a((byte) -86);
                    if (var3 == null) {
                      break L2;
                    } else {
                      var3.field_c = param2;
                      var3.field_a = param1;
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                var4 = bjb.field_p[var3_int];
                if (param2 != var4.field_c) {
                  var3_int++;
                  continue L1;
                } else {
                  L3: {
                    if (1 != var4.field_a) {
                      break L3;
                    } else {
                      var4.field_a = param1;
                      break L3;
                    }
                  }
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3_ref);
            stackOut_13_1 = new StringBuilder().append("uba.C(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
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

    uba(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
