/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wf extends vg {
    static jea field_g;
    private int field_i;
    private int field_h;
    private int field_f;

    private final boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 < 96) {
          L0: {
            this.d(-115);
            if (-7 >= (this.field_f ^ -1)) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-7 >= (this.field_f ^ -1)) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != 2907) {
            field_g = (jea) null;
        }
    }

    final void a(int param0, kh param1) {
        boolean discarded$0 = false;
        try {
            param1.a((byte) 2, this.field_f, 4);
            if (param0 != -29928) {
                discarded$0 = this.b(-112);
            }
            param1.a((byte) -5, this.field_h / 50, 6);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "wf.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void d(int param0) {
        if (param0 != 100) {
            return;
        }
        this.field_i = this.field_h;
    }

    final int a(byte param0) {
        if (param0 != 91) {
            this.field_f = -58;
            return this.field_f;
        }
        return this.field_f;
    }

    final boolean b(byte param0) {
        int var2;
        var2 = -122 % ((7 - param0) / 52);
        if (-1 > (this.field_h ^ -1)) {
          if (-1 > (this.field_i ^ -1)) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final void c(int param0) {
        this.field_i = this.field_i - 1;
        if (param0 != -9) {
            field_g = (jea) null;
        }
    }

    final wf e(int param0) {
        hca var3;
        if (param0 != -1) {
          var3 = (hca) null;
          this.a((byte) -15, (hca) null);
          return new wf(this.field_f, this.field_h);
        } else {
          return new wf(this.field_f, this.field_h);
        }
    }

    private wf(int param0, int param1) {
        this.field_h = 100;
        this.field_f = param0;
        this.field_h = param1;
        this.d(100);
    }

    final boolean a(byte param0, hca param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.b(97)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var3_int = this.field_f;
                if (6 == var3_int) {
                  break L1;
                } else {
                  break L1;
                }
              }
              var3_int = -41 % ((param0 - 43) / 44);
              stackIn_7_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("wf.E(").append(param0).append(',');

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
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    wf(la param0, kh param1) {
        this.field_h = 100;
        try {
            this.field_f = param1.b((byte) 44, 4);
            if (-9 > (param0.field_E ^ -1)) {
                this.field_h = 50 * param1.b((byte) 44, 6);
            } else {
                this.field_h = 100;
            }
            this.d(100);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "wf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
