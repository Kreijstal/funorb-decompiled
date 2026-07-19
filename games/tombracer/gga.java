/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gga extends ofa implements tsa {
    private rj field_N;
    static jpa[] field_O;
    static ur field_M;
    static String field_L;

    public static void f(int param0) {
        field_M = null;
        field_O = null;
        field_L = null;
        if (param0 != 0) {
            field_L = (String) null;
        }
    }

    private final rj a(String param0, qc param1, int param2) {
        rj var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        rj stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        rj stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var4 = new rj(param0, param1);
              var4.field_r = (isa) ((Object) new td());
              var5 = this.field_p - 6;
              this.field_p = this.field_p + 38;
              if (param2 < -82) {
                break L1;
              } else {
                gga.f(16);
                break L1;
              }
            }
            var4.a((byte) -31, -16 + (this.field_m - 14), 30, 15, var5);
            this.a(var4, -1);
            this.c((byte) -75);
            stackOut_2_0 = (rj) (var4);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4_ref);
            stackOut_4_1 = new StringBuilder().append("gga.H(");
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
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final static void b(int param0, int param1, byte param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        if ((tl.field_r ^ -1) > -1) {
          return;
        } else {
          L0: {
            var3 = -135 + param0;
            var4 = -35 + param1;
            if (param2 > 81) {
              break L0;
            } else {
              gga.f(45);
              break L0;
            }
          }
          L1: {
            var5 = 256;
            if ((tl.field_r ^ -1) <= -76) {
              break L1;
            } else {
              var5 = (tl.field_r << 487563080) / 75;
              break L1;
            }
          }
          L2: {
            if ((tl.field_r ^ -1) >= -201) {
              break L2;
            } else {
              var5 = (250 + -tl.field_r << -1908163160) / 50;
              break L2;
            }
          }
          L3: {
            nm.a(vha.field_a, (byte) 108);
            uoa.b();
            bea.a();
            uw.a(false);
            if (-257 >= (var5 ^ -1)) {
              break L3;
            } else {
              bea.c(0, 0, bea.field_g, bea.field_a, 0, 256 + -var5);
              break L3;
            }
          }
          L4: {
            L5: {
              pfa.a(1);
              if ((tl.field_r ^ -1) <= -151) {
                break L5;
              } else {
                vha.field_a.c(var3, var4);
                if (var8 == 0) {
                  break L4;
                } else {
                  break L5;
                }
              }
            }
            bra.field_O.c(var3 + 15, var4 + 10, var5);
            break L4;
          }
          L6: {
            var6 = -125 + tl.field_r;
            if (-1 <= (var6 ^ -1)) {
              break L6;
            } else {
              if (50 <= var6) {
                break L6;
              } else {
                if ((var6 ^ -1) > -21) {
                  var7 = var6 * 256 / 20;
                  bw.field_a.a(var3, var4, var7);
                  break L6;
                } else {
                  L7: {
                    if (var6 < 30) {
                      break L7;
                    } else {
                      var7 = (50 + -var6) * 256 / 20;
                      bw.field_a.a(var3, var4, var7);
                      if (var8 == 0) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  bw.field_a.a(var3, var4, 256);
                  if (var8 == 0) {
                    break L6;
                  } else {
                    var7 = var6 * 256 / 20;
                    bw.field_a.a(var3, var4, var7);
                    break L6;
                  }
                }
              }
            }
          }
          L8: {
            var6 = -140 + tl.field_r;
            if (0 >= var6) {
              break L8;
            } else {
              L9: {
                var7 = 256;
                if (-21 >= (var6 ^ -1)) {
                  break L9;
                } else {
                  var7 = var6 * 256 / 20;
                  break L9;
                }
              }
              hca.field_W.c(15 + var3, 10 + var4, var5 * var7 >> 2037813160);
              break L8;
            }
          }
          return;
        }
    }

    public final void a(int param0, int param1, rj param2, int param3, byte param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (param2 != this.field_N) {
                break L1;
              } else {
                this.g(256);
                break L1;
              }
            }
            L2: {
              if (param4 >= 44) {
                break L2;
              } else {
                gga.f(-123);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var6);
            stackOut_5_1 = new StringBuilder().append("gga.M(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    gga(jta param0, nt param1) {
        super(param0, 200, 150);
        Object var3 = null;
        ae var4 = null;
        Object stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        Object stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        Object stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        Object stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        Object stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        Object stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        Object stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        Object stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              var3 = null;
              if (gj.field_o == param1) {
                var3 = jma.field_o;
                break L1;
              } else {
                if (or.field_j == param1) {
                  this.field_p = this.field_p + 10;
                  var3 = vca.field_b;
                  if (!sta.g((byte) 97)) {
                    break L1;
                  } else {
                    var3 = tj.field_h;
                    this.field_p = this.field_p + 20;
                    break L1;
                  }
                } else {
                  if (param1 != uq.field_b) {
                    break L1;
                  } else {
                    var3 = th.field_s;
                    this.field_p = this.field_p + 30;
                    break L1;
                  }
                }
              }
            }
            var4 = new ae((String) (var3), (qc) null);
            var4.field_p = 80;
            var4.field_m = this.field_m;
            var4.field_n = 50;
            var4.field_i = 0;
            var4.field_r = (isa) ((Object) new vpa(eka.field_o, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
            this.a(var4, -1);
            this.field_N = this.a(kh.field_j, (qc) (this), -93);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = var3;
            stackOut_10_1 = new StringBuilder().append("gga.<init>(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = stackIn_12_0;
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = stackIn_11_0;
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = stackIn_15_0;
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = stackIn_14_0;
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    private final void g(int param0) {
        rj var3 = null;
        if (this.field_B) {
          if (param0 != 256) {
            var3 = (rj) null;
            this.a(14, -50, (rj) null, -113, (byte) -27);
            this.field_B = false;
            return;
          } else {
            this.field_B = false;
            return;
          }
        } else {
          return;
        }
    }

    static {
        field_M = new ur(8);
        field_L = "Perpetually spinning discs";
    }
}
