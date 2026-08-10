/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gtb implements ntb {
    static String field_a;
    private int field_b;
    static int field_c;
    static ij field_d;

    public final boolean a(byte param0, tv param1) {
        gtb var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = 1 / ((param0 - 22) / 59);
              var3 = (gtb) ((Object) param1);
              if (this.field_b == var3.field_b) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("gtb.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != -88) {
            field_c = -87;
            field_d = null;
            return;
        }
        field_d = null;
    }

    public final void b(byte param0, tv param1) {
        gtb var5 = null;
        gtb var6 = null;
        if (param0 <= 54) {
            return;
        }
        try {
            var5 = (gtb) ((Object) param1);
            var6 = var5;
            var6.field_b = this.field_b;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "gtb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(tv param0, int param1) {
        gtb var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = (gtb) ((Object) param0);
            if (param1 < -19) {
              L1: {
                var4 = 0;
                if (var3.field_b == this.field_b) {
                  break L1;
                } else {
                  iva.a(-6940, "int playerid has changed. before=" + var3.field_b + ", now=" + this.field_b);
                  var4 = 1;
                  break L1;
                }
              }
              if (var4 != 0) {
                iva.a(-6940, "This instance of PlayerReady has changed");
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("gtb.F(");

            if (param0 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
            if (param1) {
                faa var4 = (faa) null;
                this.a((faa) null, true);
            }
            this.field_b = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "gtb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    gtb() {
    }

    public final void b(faa param0, int param1) {
        try {
            param0.a(-632, this.field_b, 32);
            if (param1 >= -109) {
                tv var4 = (tv) null;
                this.a((tv) null, -73);
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "gtb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    gtb(int param0) {
        this.field_b = param0;
    }

    static {
        field_c = 0;
    }
}
