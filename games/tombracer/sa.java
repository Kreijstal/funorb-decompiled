/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa extends wda {
    private boolean field_o;
    private int field_p;
    private int field_q;
    private int field_s;
    static ko field_r;

    final int a(int param0, int param1) {
        param1 = fs.a((byte) 75, param1, this.field_p);
        if (param0 != 0) {
            return -7;
        }
        param1 = fs.a((byte) 117, param1, this.field_q);
        param1 = fs.a((byte) 121, param1, this.field_s);
        return param1;
    }

    final static cn a(boolean param0, int param1, boolean param2, int param3, byte param4) {
        if (param4 > -75) {
            return (cn) null;
        }
        return nt.a(param1, param3, 5200, param2, false, param0);
    }

    final static eua a(jea param0, jea param1, jea param2, int[] param3, boolean param4) {
        int var5_int = 0;
        String[] var6 = null;
        char[] var7 = null;
        eua[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        wua var11 = null;
        int var12 = 0;
        char[] var13 = null;
        char[] var14 = null;
        eua stackIn_3_0 = null;
        Object stackIn_10_0 = null;
        eua stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var5 = null;
        Exception var10 = null;
        var12 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var5_int = param3.length;
            var6 = new String[var5_int];
            var14 = new char[var5_int];
            var13 = var14;
            var7 = var13;
            if (!param4) {
              var8 = new eua[var5_int];
              var9 = 49;
              try {
                L1: {
                  var10_int = 0;
                  L2: while (true) {
                    if (var10_int >= var5_int) {
                      break L1;
                    } else {
                      var11 = qu.field_a.a(false, param3[var10_int]);
                      var6[var10_int] = var11.b((byte) -5);
                      var9 = (char)(var9 + 1);
                      var7[var10_int] = (char)var9;
                      var8[var10_int] = null;
                      var10_int++;
                      continue L2;
                    }
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var10 = (Exception) (Object) decompiledCaughtException;
                stackIn_10_0 = null;
                return (eua) ((Object) stackIn_10_0);
              }
              stackIn_12_0 = new eua(0L, param2, param0, param1, var8, param3, var6, var14);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = (eua) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("sa.M(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_25_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_12_0;
        }
    }

    final int c(int param0) {
        if (param0 != 1) {
            return 68;
        }
        return 10;
    }

    final static void a(boolean param0, byte param1) {
        if (-1 > (mla.field_a ^ -1)) {
            if (!(!uv.field_o)) {
                bea.d(0, 0, bea.field_g, era.field_e.field_A);
                wo.field_k.b(108, param0);
            }
        }
        if (param1 <= 6) {
            int[] var3 = (int[]) null;
            sa.a((jea) null, (jea) null, (jea) null, (int[]) null, true);
        }
        if ((gt.field_a ^ -1) < -1 || -1 > (fp.field_e ^ -1)) {
            if (!(!tla.field_e)) {
                bea.d(0, 0, bea.field_g, era.field_e.field_A);
                hf.field_a.b(85, param0);
            }
        }
    }

    final void a(kh param0, byte param1) {
        super.a(param0, (byte) -85);
        param0.a((byte) 2, dqa.a(true, this.field_p >> -1314422288, 12), 12);
        param0.a((byte) -126, dqa.a(true, this.field_q >> -422712784, 12), 12);
        if (param1 > -78) {
            return;
        }
        try {
            param0.a((byte) 79, this.field_o ? 1 : 0, 1);
            param0.a((byte) 56, dqa.a(true, this.field_s, 12), 12);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "sa.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void b(int param0) {
        if (param0 != 1) {
            field_r = (ko) null;
        }
    }

    final void b(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        L0: {
          var9 = TombRacer.field_G ? 1 : 0;
          var2 = this.field_n.s(25745) + -this.d((byte) -57);
          var5 = -32 / ((-69 - param0) / 42);
          var3 = this.field_n.e(false) + -this.a(false);
          if (this.field_o) {
            var6 = -this.field_q + var3 >> -1113489110;
            var4 = -this.field_p + var2 >> 1187368682;
            break L0;
          } else {
            var6 = this.field_q - var3 >> 632890442;
            var4 = this.field_p + -var2 >> -750115894;
            break L0;
          }
        }
        var7 = tia.a(var6, var4, -29543) - tia.a(-256, 0, -29543);
        var7 = var7 * -1;
        L1: while (true) {
          if ((var7 ^ -1) <= -1) {
            L2: {
              L3: {
                var8 = var7 - this.field_n.g(-25787);
                if (0 >= this.field_s) {
                  break L3;
                } else {
                  L4: while (true) {
                    if ((var8 ^ -1) <= 4095) {
                      L5: while (true) {
                        if (var8 <= 4096) {
                          if (this.field_s < var8) {
                            var8 = this.field_s;
                            break L3;
                          } else {
                            if (var8 < -this.field_s) {
                              var8 = -this.field_s;
                              this.field_n.c(false, var8);
                              break L2;
                            } else {
                              this.field_n.c(false, var8);
                              break L2;
                            }
                          }
                        } else {
                          var8 -= 8192;
                          continue L5;
                        }
                      }
                    } else {
                      var8 += 8192;
                      continue L4;
                    }
                  }
                }
              }
              this.field_n.c(false, var8);
              break L2;
            }
            return;
          } else {
            var7 += 8192;
            continue L1;
          }
        }
    }

    public static void e(int param0) {
        field_r = null;
        if (param0 >= -43) {
            field_r = (ko) null;
        }
    }

    final void a(int param0, fsa param1) {
        try {
            if (param0 <= 35) {
                sa.a(true, 47, true, -59, (byte) -121);
            }
            super.a(110, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "sa.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    sa(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        this.field_o = true;
        try {
          L0: {
            L1: {
              this.field_p = bla.a(true, 12, param1.b((byte) 44, 12)) << -986938096;
              this.field_q = bla.a(true, 12, param1.b((byte) 44, 12)) << 525027408;
              stackIn_3_0 = this;

              if (-2 != (param1.b((byte) 44, 1) ^ -1)) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((sa) (this)).field_o = stackIn_4_1 != 0;
              if (-4 < (this.c(true).field_E ^ -1)) {
                this.field_s = 0;
                break L2;
              } else {
                this.field_s = bla.a(true, 12, param1.b((byte) 44, 12));
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("sa.<init>(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param2 + ')');
        }
    }

    static {
        field_r = new ko(1);
    }
}
