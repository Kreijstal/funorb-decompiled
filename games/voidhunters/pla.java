/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pla extends htb {
    private int field_B;
    private eeb field_C;

    final void b(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        qrb var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        phb var12 = null;
        phb var13 = null;
        phb var15 = null;
        phb var16 = null;
        var11 = VoidHunters.field_G;
        super.b(param0, param1, 56, param3);
        if (-1 == (param1 ^ -1)) {
          var5 = param0 - (-this.field_g - (this.field_h >> -1029785599));
          var6 = (this.field_f >> -1539519423) + (this.field_r + param3);
          if (param2 >= 47) {
            var8 = this.field_C.a((byte) 35);
            if (tg.field_p != var8) {
              if (dsa.field_q != var8) {
                if (var8 != cca.field_o) {
                  if (lea.field_o != var8) {
                    return;
                  } else {
                    var12 = ps.field_a[1];
                    var12.c(var5 + -(var12.field_q >> 2006975329), var6 + -(var12.field_p >> 610058593), 256);
                    return;
                  }
                } else {
                  var13 = ps.field_a[2];
                  var13.c(var5 + -(var13.field_q >> -1811033919), var6 + -(var13.field_p >> -1998362879), 256);
                  return;
                }
              } else {
                var16 = ps.field_a[0];
                var9 = var16.field_m << -242189983;
                var10 = var16.field_n << -559857695;
                if (mi.field_o != null) {
                  if (mi.field_o.field_q >= var9) {
                    if (var10 <= mi.field_o.field_p) {
                      de.a(85, mi.field_o);
                      dma.a();
                      var16.b(112, 144, var16.field_m << -622533084, var16.field_n << -222111548, -this.field_B << 837506826, 4096);
                      bia.a((byte) 124);
                      mi.field_o.c(-var16.field_m + var5, -var16.field_n + var6, 256);
                      return;
                    } else {
                      mi.field_o = new phb(var9, var10);
                      de.a(26, mi.field_o);
                      var16.b(112, 144, var16.field_m << -622533084, var16.field_n << -222111548, -this.field_B << 837506826, 4096);
                      bia.a((byte) 124);
                      mi.field_o.c(-var16.field_m + var5, -var16.field_n + var6, 256);
                      return;
                    }
                  } else {
                    mi.field_o = new phb(var9, var10);
                    de.a(26, mi.field_o);
                    var16.b(112, 144, var16.field_m << -622533084, var16.field_n << -222111548, -this.field_B << 837506826, 4096);
                    bia.a((byte) 124);
                    mi.field_o.c(-var16.field_m + var5, -var16.field_n + var6, 256);
                    return;
                  }
                } else {
                  mi.field_o = new phb(var9, var10);
                  de.a(26, mi.field_o);
                  var16.b(112, 144, var16.field_m << -622533084, var16.field_n << -222111548, -this.field_B << 837506826, 4096);
                  bia.a((byte) 124);
                  mi.field_o.c(-var16.field_m + var5, -var16.field_n + var6, 256);
                  return;
                }
              }
            } else {
              var15 = ps.field_a[0];
              var9 = var15.field_m << -242189983;
              var10 = var15.field_n << -559857695;
              if (mi.field_o != null) {
                if (mi.field_o.field_q >= var9) {
                  if (var10 <= mi.field_o.field_p) {
                    de.a(85, mi.field_o);
                    dma.a();
                    var15.b(112, 144, var15.field_m << -622533084, var15.field_n << -222111548, -this.field_B << 837506826, 4096);
                    bia.a((byte) 124);
                    mi.field_o.c(-var15.field_m + var5, -var15.field_n + var6, 256);
                    return;
                  } else {
                    mi.field_o = new phb(var9, var10);
                    de.a(26, mi.field_o);
                    var15.b(112, 144, var15.field_m << -622533084, var15.field_n << -222111548, -this.field_B << 837506826, 4096);
                    bia.a((byte) 124);
                    mi.field_o.c(-var15.field_m + var5, -var15.field_n + var6, 256);
                    return;
                  }
                } else {
                  mi.field_o = new phb(var9, var10);
                  de.a(26, mi.field_o);
                  var15.b(112, 144, var15.field_m << -622533084, var15.field_n << -222111548, -this.field_B << 837506826, 4096);
                  bia.a((byte) 124);
                  mi.field_o.c(-var15.field_m + var5, -var15.field_n + var6, 256);
                  return;
                }
              } else {
                mi.field_o = new phb(var9, var10);
                de.a(26, mi.field_o);
                var15.b(112, 144, var15.field_m << -622533084, var15.field_n << -222111548, -this.field_B << 837506826, 4096);
                bia.a((byte) 124);
                mi.field_o.c(-var15.field_m + var5, -var15.field_n + var6, 256);
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0) {
        if (!cgb.field_a) {
            throw new IllegalStateException();
        }
        djb.field_r = true;
        aka.a(false, param0 + -122);
        qmb.field_q = param0;
    }

    final String d(byte param0) {
        if (!(!this.field_e)) {
            return this.field_C.c((byte) -79);
        }
        if (param0 == 125) {
            return null;
        }
        return (String) null;
    }

    final boolean a(int param0, shb param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
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
            if (param0 == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 1;
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
            stackOut_5_1 = new StringBuilder().append("pla.A(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    final void a(int param0, int param1, int param2, shb param3) {
        try {
            this.field_B = this.field_B + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "pla.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, int param1) {
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        if (param1 == -4) {
          if (-4 != (param0 ^ -1)) {
            if (param0 == 12) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            return stackIn_5_0 != 0;
          }
        } else {
          return false;
        }
    }

    pla(eeb param0) {
        try {
            this.field_C = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "pla.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
