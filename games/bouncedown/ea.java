/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea {
    private bc field_d;
    static int field_b;
    static boolean field_f;
    private ai field_a;
    static String field_c;
    static gk field_e;

    final ai a(byte param0) {
        ai var2 = null;
        if (param0 == 33) {
          var2 = this.field_a;
          if (var2 == this.field_d.field_b) {
            this.field_a = null;
            return null;
          } else {
            this.field_a = var2.field_f;
            return var2;
          }
        } else {
          this.field_d = (bc) null;
          var2 = this.field_a;
          if (var2 == this.field_d.field_b) {
            this.field_a = null;
            return null;
          } else {
            this.field_a = var2.field_f;
            return var2;
          }
        }
    }

    final ai a(int param0) {
        ai var2 = null;
        if (param0 != 22092) {
            this.field_d = (bc) null;
            var2 = this.field_d.field_b.field_c;
            if (!(this.field_d.field_b != var2)) {
                this.field_a = null;
                return null;
            }
            this.field_a = var2.field_c;
            return var2;
        }
        var2 = this.field_d.field_b.field_c;
        if (!(this.field_d.field_b != var2)) {
            this.field_a = null;
            return null;
        }
        this.field_a = var2.field_c;
        return var2;
    }

    final ai b(ai param0, int param1) {
        ai var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object stackIn_6_0 = null;
        ai stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        ai stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param0 != null) {
                var3 = param0;
                break L1;
              } else {
                var3 = this.field_d.field_b.field_c;
                break L1;
              }
            }
            if (var3 == this.field_d.field_b) {
              this.field_a = null;
              stackOut_5_0 = null;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              this.field_a = var3.field_c;
              var4 = -84 % ((3 - param1) / 63);
              stackOut_7_0 = (ai) (var3);
              stackIn_8_0 = stackOut_7_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3_ref);
            stackOut_9_1 = new StringBuilder().append("ea.E(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ai) ((Object) stackIn_6_0);
        } else {
          return stackIn_8_0;
        }
    }

    final ai e(int param0) {
        if (param0 != 50) {
            return (ai) null;
        }
        ai var2 = this.field_d.field_b.field_f;
        if (!(var2 != this.field_d.field_b)) {
            this.field_a = null;
            return null;
        }
        this.field_a = var2.field_f;
        return var2;
    }

    final static void a(int param0, int param1) {
        ii var2 = hh.field_p;
        var2.a(true, param1);
        var2.a(1, (byte) 65);
        var2.a(param0, (byte) 71);
    }

    final ai c(int param0) {
        ai var2 = this.field_a;
        if (param0 >= -82) {
            field_c = (String) null;
            if (!(this.field_d.field_b != var2)) {
                this.field_a = null;
                return null;
            }
            this.field_a = var2.field_c;
            return var2;
        }
        if (!(this.field_d.field_b != var2)) {
            this.field_a = null;
            return null;
        }
        this.field_a = var2.field_c;
        return var2;
    }

    public static void b(int param0) {
        ie discarded$0 = null;
        field_e = null;
        field_c = null;
        if (param0 != 17695) {
            byte[] var2 = (byte[]) null;
            discarded$0 = ea.a((byte[]) null, (byte) -62);
        }
    }

    final ai a(ai param0, int param1) {
        ai var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object stackIn_5_0 = null;
        ai stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ai stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param0 != null) {
                var3 = param0;
                break L1;
              } else {
                var3 = this.field_d.field_b.field_f;
                break L1;
              }
            }
            if (this.field_d.field_b != var3) {
              this.field_a = var3.field_f;
              var4 = -55 % ((59 - param1) / 37);
              stackOut_6_0 = (ai) (var3);
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.field_a = null;
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3_ref);
            stackOut_8_1 = new StringBuilder().append("ea.B(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ai) ((Object) stackIn_5_0);
        } else {
          return stackIn_7_0;
        }
    }

    final static void d(int param0) {
        tb.field_p.field_l = 0;
        tb.field_p.field_d = param0;
    }

    final static ie a(byte[] param0, byte param1) {
        ie var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        ie stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ie stackOut_5_0 = null;
        Object stackOut_1_0 = null;
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
            if (param0 != null) {
              L1: {
                var2 = new ie(param0, cl.field_n, ae.field_c, ih.field_V, qh.field_i, ph.field_c);
                vb.a((byte) 122);
                if (param1 >= 47) {
                  break L1;
                } else {
                  field_b = 93;
                  break L1;
                }
              }
              stackOut_5_0 = (ie) (var2);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2_ref);
            stackOut_7_1 = new StringBuilder().append("ea.D(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ie) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    ea(bc param0) {
        try {
            this.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "ea.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = 50;
        field_f = false;
    }
}
