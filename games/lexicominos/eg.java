/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg extends mg {
    private ng field_D;
    static String field_E;
    static String field_F;
    static sh field_C;

    final void h(int param0) {
        int var4 = Lexicominos.field_L ? 1 : 0;
        ta var2 = new ta(this.field_D);
        if (param0 != 0) {
            return;
        }
        al var3 = (al) ((Object) var2.a(param0 ^ 250));
        while (var3 != null) {
            var3.field_D = false;
            var3 = (al) ((Object) var2.c(param0 + -73));
        }
        this.field_A = null;
    }

    final void f(boolean param0) {
        int var4 = Lexicominos.field_L ? 1 : 0;
        if (!param0) {
            this.f(127);
        }
        ta var2 = new ta(this.field_D);
        al var3 = (al) ((Object) var2.a(250));
        while (var3 != null) {
            if (!(!var3.f((byte) -77))) {
                var3.b((byte) -121);
            }
            var3 = (al) ((Object) var2.c(-124));
        }
        this.field_A = (w) ((Object) this.e(false));
    }

    final void g(boolean param0) {
        int var4 = Lexicominos.field_L ? 1 : 0;
        ta var2 = new ta(this.field_D);
        al var3 = (al) ((Object) var2.a(250));
        if (param0) {
            eg.i(-88);
        }
        while (var3 != null) {
            if (var3.a((byte) 26)) {
                var3.b((byte) -122);
            }
            var3 = (al) ((Object) var2.c(-69));
        }
    }

    public static void i(int param0) {
        field_C = null;
        field_E = null;
        field_F = null;
        if (param0 > -59) {
            field_F = (String) null;
        }
    }

    final al e(boolean param0) {
        ta var2;
        al var3;
        int var4;
        var4 = Lexicominos.field_L ? 1 : 0;
        if (!param0) {
          var2 = new ta(this.field_D);
          var3 = (al) ((Object) var2.a(250));
          L0: while (true) {
            if (var3 != null) {
              if (!var3.field_D) {
                var3 = (al) ((Object) var2.c(-53));
                continue L0;
              } else {
                return var3;
              }
            } else {
              return null;
            }
          }
        } else {
          return (al) null;
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var7 = Lexicominos.field_L ? 1 : 0;
        if (!(this.field_i == null)) {
            this.field_i.a(param1, param2, true, (w) (this), param0 + -3169);
        }
        if (param0 != -115) {
            return;
        }
        ta var5 = new ta(this.field_D);
        w var6 = (w) ((Object) var5.b(0));
        while (var6 != null) {
            var6.a((byte) -115, this.field_o + param1, param2 + this.field_t, param3);
            var6 = (w) ((Object) var5.e(31842));
        }
    }

    public eg() {
        super(0, 0, ql.field_O, kg.field_C, (rd) null, (vd) null);
        this.field_D = new ng();
    }

    final w f(int param0) {
        int var4 = Lexicominos.field_L ? 1 : 0;
        ta var2 = new ta(this.field_D);
        al var3 = (al) ((Object) var2.a(250));
        while (var3 != null) {
            if (!(!var3.field_D)) {
                return var3.e(-21374);
            }
            var3 = (al) ((Object) var2.c(-87));
        }
        if (param0 == 0) {
            return null;
        }
        this.f(true);
        return null;
    }

    final void a(int param0, w param1) {
        al var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            if (param1 instanceof al) {
              L1: {
                var3 = (al) ((Object) param1);
                this.field_D.a(param0 + 14484, var3);
                var3.field_D = true;
                var3.a((byte) 44, (w) (this));
                if (param0 == -14579) {
                  break L1;
                } else {
                  this.f(18);
                  break L1;
                }
              }
              break L0;
            } else {
              throw new IllegalArgumentException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3_ref);

            stackIn_7_1 = new StringBuilder().append("eg.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    final static vj a(int param0, int param1, sh param2, sh param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        vj stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (nb.a(param1, param0, (byte) -122, param2)) {
              L1: {
                if (param4 > 15) {
                  break L1;
                } else {
                  eg.i(69);
                  break L1;
                }
              }
              stackIn_6_0 = lj.a(22076, param3.a(param1, -27493, param0));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("eg.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (vj) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    static {
        field_F = "to keep fullscreen or";
        field_E = "4 of 4";
    }
}
