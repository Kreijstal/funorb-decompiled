/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we {
    static int field_c;
    private lh field_a;
    private vc field_b;

    final static void a(int param0, int param1) {
        hd.field_c = param0 * 100 / 150;
        hd.field_g = param0 * 400 / 150;
        int var2 = 115 % ((-69 - param1) / 53);
        hd.field_b = (param0 << 15433904) / 150;
    }

    final lh b(int param0) {
        lh var2 = this.field_b.field_e.field_h;
        int var3 = -111 / ((-1 - param0) / 58);
        if (!(this.field_b.field_e != var2)) {
            this.field_a = null;
            return null;
        }
        this.field_a = var2.field_h;
        return var2;
    }

    final lh a(byte param0, lh param1) {
        lh var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object stackIn_5_0 = null;
        lh stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = -117 % ((param0 - 66) / 60);
              if (param1 != null) {
                var3 = param1;
                break L1;
              } else {
                var3 = this.field_b.field_e.field_h;
                break L1;
              }
            }
            if (this.field_b.field_e != var3) {
              this.field_a = var3.field_h;
              stackIn_7_0 = (lh) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.field_a = null;
              stackIn_5_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("we.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (lh) ((Object) stackIn_5_0);
        } else {
          return stackIn_7_0;
        }
    }

    final lh a(byte param0) {
        lh var2;
        var2 = this.field_b.field_e.field_a;
        if (this.field_b.field_e == var2) {
          this.field_a = null;
          return null;
        } else {
          this.field_a = var2.field_a;
          if (param0 != 106) {
            this.a(true);
            return var2;
          } else {
            return var2;
          }
        }
    }

    final static void a(int param0) {
        uh var1;
        L0: {
          var1 = (uh) ((Object) fk.field_z.a((byte) -60));
          if (var1 == null) {
            var1 = new uh();
            break L0;
          } else {
            break L0;
          }
        }
        var1.a(3, gb.field_a, gb.field_l, gb.field_k, gb.field_h, gb.field_i, gb.field_b, gb.field_d);
        fg.field_t.a(false, var1);
        if (param0 >= -56) {
          field_c = 106;
          return;
        } else {
          return;
        }
    }

    final lh c(int param0) {
        lh var2;
        var2 = this.field_a;
        if (this.field_b.field_e != var2) {
          if (param0 != -6144) {
            this.field_a = (lh) null;
            this.field_a = var2.field_h;
            return var2;
          } else {
            this.field_a = var2.field_h;
            return var2;
          }
        } else {
          this.field_a = null;
          return null;
        }
    }

    final lh b(byte param0, lh param1) {
        lh var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        lh stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 != null) {
                var3 = param1;
                break L1;
              } else {
                var3 = this.field_b.field_e.field_a;
                break L1;
              }
            }
            L2: {
              if (param0 < -107) {
                break L2;
              } else {
                this.field_a = (lh) null;
                break L2;
              }
            }
            if (this.field_b.field_e == var3) {
              this.field_a = null;
              stackIn_8_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              this.field_a = var3.field_a;
              stackIn_10_0 = (lh) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("we.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (lh) ((Object) stackIn_8_0);
        } else {
          return stackIn_10_0;
        }
    }

    final lh a(boolean param0) {
        lh var2 = null;
        if (!param0) {
            this.field_b = (vc) null;
            var2 = this.field_a;
            if (!(var2 != this.field_b.field_e)) {
                this.field_a = null;
                return null;
            }
            this.field_a = var2.field_a;
            return var2;
        }
        var2 = this.field_a;
        if (!(var2 != this.field_b.field_e)) {
            this.field_a = null;
            return null;
        }
        this.field_a = var2.field_a;
        return var2;
    }

    final static int a(byte param0, int param1) {
        int var2;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        var2 = 71 / ((param0 - 0) / 55);
        param1 = param1 & 8191;
        if (4096 <= param1) {
          L0: {
            if ((param1 ^ -1) <= -6145) {
              stackIn_8_0 = dk.field_D[param1 + -6144];
              break L0;
            } else {
              stackIn_8_0 = -dk.field_D[-param1 + 6144];
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (param1 >= 2048) {
              stackIn_4_0 = -dk.field_D[param1 + -2048];
              break L1;
            } else {
              stackIn_4_0 = dk.field_D[-param1 + 2048];
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    we(vc param0) {
        try {
            this.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "we.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = 0;
    }
}
