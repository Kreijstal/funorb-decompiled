/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh {
    private gg field_c;
    private int field_d;
    private gg field_a;
    private int field_e;
    private gg[] field_b;

    final static void a(int param0, int param1, int param2, int param3) {
        boolean discarded$0 = false;
        lg.field_b = param3;
        if (param0 != 11130) {
            fd var5 = (fd) null;
            discarded$0 = uh.a((fd) null, -29, (fd) null);
        }
        ul.field_G = param1;
        kl.field_k = param2;
    }

    final gg a(long param0, int param1) {
        gg var6 = null;
        int var7 = stellarshard.field_B;
        int var4 = 33 % ((-51 - param1) / 53);
        gg var5 = this.field_b[(int)(param0 & (long)(this.field_d - 1))];
        this.field_c = var5.field_g;
        while (this.field_c != var5) {
            if ((this.field_c.field_j ^ -1L) == (param0 ^ -1L)) {
                var6 = this.field_c;
                this.field_c = this.field_c.field_g;
                return var6;
            }
            this.field_c = this.field_c.field_g;
        }
        this.field_c = null;
        return null;
    }

    final static boolean a(fd param0, int param1, fd param2) {
        boolean discarded$2 = false;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        fd var5 = null;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var4 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              var3_int = param2.field_ob + -param0.field_ob;
              if (param2.field_pb != uf.field_f) {
                if (param2.field_pb == null) {
                  var3_int += 200;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                var3_int -= 200;
                break L1;
              }
            }
            L2: {
              if (param1 == 200) {
                break L2;
              } else {
                var5 = (fd) null;
                discarded$2 = uh.a((fd) null, 15, (fd) null);
                break L2;
              }
            }
            L3: {
              if (uf.field_f != param0.field_pb) {
                if (param0.field_pb != null) {
                  break L3;
                } else {
                  var3_int -= 200;
                  break L3;
                }
              } else {
                var3_int += 200;
                break L3;
              }
            }
            L4: {
              if (var3_int <= 0) {
                stackOut_14_0 = 0;
                stackIn_15_0 = stackOut_14_0;
                break L4;
              } else {
                stackOut_13_0 = 1;
                stackIn_15_0 = stackOut_13_0;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3);
            stackOut_16_1 = new StringBuilder().append("uh.G(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          L6: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param1).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        return stackIn_15_0 != 0;
    }

    final gg b(byte param0) {
        int fieldTemp$7 = 0;
        gg var2 = null;
        int var3 = 0;
        L0: {
          var3 = stellarshard.field_B;
          if ((this.field_e ^ -1) >= -1) {
            break L0;
          } else {
            if (this.field_a == this.field_b[-1 + this.field_e]) {
              break L0;
            } else {
              var2 = this.field_a;
              this.field_a = var2.field_g;
              return var2;
            }
          }
        }
        L1: while (true) {
          if (this.field_d <= this.field_e) {
            if (param0 < 38) {
              this.field_d = -87;
              return null;
            } else {
              return null;
            }
          } else {
            fieldTemp$7 = this.field_e;
            this.field_e = this.field_e + 1;
            var2 = this.field_b[fieldTemp$7].field_g;
            if (this.field_b[this.field_e - 1] != var2) {
              this.field_a = var2.field_g;
              return var2;
            } else {
              continue L1;
            }
          }
        }
    }

    final static wh[] a(ha param0, int param1) {
        int discarded$12 = 0;
        int discarded$13 = 0;
        int discarded$14 = 0;
        int discarded$15 = 0;
        int discarded$16 = 0;
        int discarded$17 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        wh[] var4 = null;
        int var5 = 0;
        wh var6_ref_wh = null;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_3_0 = null;
        wh[] stackIn_6_0 = null;
        wh[] stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        wh[] stackOut_13_0 = null;
        wh[] stackOut_5_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = stellarshard.field_B;
        try {
          L0: {
            var2_int = param0.e(8, 8);
            if (0 >= var2_int) {
              if (param1 == -1) {
                var3 = param0.e(12, 8);
                var4 = new wh[var3];
                var5 = 0;
                L1: while (true) {
                  if (var5 >= var3) {
                    stackOut_13_0 = (wh[]) (var4);
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    L2: {
                      if (!mh.a(param0, (byte) -77)) {
                        var6 = param0.e(eh.a(var5 - 1, (byte) -109), param1 ^ -9);
                        var4[var5] = var4[var6];
                        break L2;
                      } else {
                        var6_ref_wh = new wh();
                        discarded$12 = param0.e(24, 8);
                        discarded$13 = param0.e(24, param1 + 9);
                        var6_ref_wh.field_b = param0.e(24, 8);
                        discarded$14 = param0.e(9, 8);
                        discarded$15 = param0.e(12, 8);
                        discarded$16 = param0.e(12, 8);
                        discarded$17 = param0.e(12, 8);
                        var4[var5] = var6_ref_wh;
                        break L2;
                      }
                    }
                    var5++;
                    continue L1;
                  }
                }
              } else {
                stackOut_5_0 = (wh[]) null;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var2);
            stackOut_15_1 = new StringBuilder().append("uh.C(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (wh[]) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    final gg a(byte param0) {
        int var2 = -68 % ((param0 - 32) / 59);
        this.field_e = 0;
        return this.b((byte) 63);
    }

    final void a(gg param0, long param1, int param2) {
        gg var5 = null;
        try {
            if (param0.field_c != null) {
                param0.c(20);
            }
            var5 = this.field_b[(int)((long)(this.field_d - param2) & param1)];
            param0.field_g = var5;
            param0.field_c = var5.field_c;
            param0.field_c.field_g = param0;
            param0.field_g.field_c = param0;
            param0.field_j = param1;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "uh.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    uh(int param0) {
        int var2 = 0;
        gg dupTemp$0 = null;
        gg var3 = null;
        this.field_e = 0;
        this.field_b = new gg[param0];
        this.field_d = param0;
        for (var2 = 0; param0 > var2; var2++) {
            dupTemp$0 = new gg();
            var3 = dupTemp$0;
            this.field_b[var2] = dupTemp$0;
            var3.field_c = var3;
            var3.field_g = var3;
        }
    }

    static {
    }
}
