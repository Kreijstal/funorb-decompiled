/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gfa extends bs {
    static ur field_l;
    private int field_n;
    private int field_k;
    static iu field_j;
    static String field_i;
    static String field_m;

    final void a(kh param0, int param1) {
        try {
            super.a(param0, param1);
            param0.a((byte) -128, this.field_n, 4);
            param0.a((byte) -125, this.field_k, 6);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "gfa.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void b(int param0) {
        field_i = null;
        field_m = null;
        field_l = null;
        if (param0 <= 33) {
            gfa.b(-87);
            field_j = null;
            return;
        }
        field_j = null;
    }

    final boolean a(boolean param0) {
        int var2;
        if (!param0) {
          var2 = this.field_n;
          if ((var2 ^ -1) != -5) {
            if (-6 != (var2 ^ -1)) {
              return false;
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final int b(byte param0) {
        if (param0 != 121) {
            this.field_k = -8;
            return 0;
        }
        return 0;
    }

    gfa(int param0, kh param1) {
        super(param0, param1);
        try {
            this.field_n = param1.b((byte) 44, 4);
            this.field_k = param1.b((byte) 44, 6);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "gfa.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(byte param0) {
        if (param0 != -28) {
            field_j = (iu) null;
            return this.field_k;
        }
        return this.field_k;
    }

    final boolean a(boolean param0, bs param1) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_j = (iu) null;
                break L1;
              }
            }
            if (!(param1 instanceof gfa)) {
              stackIn_5_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (((gfa) ((Object) param1)).field_n != this.field_n) {
                  stackIn_9_0 = 0;
                  break L2;
                } else {
                  stackIn_9_0 = 1;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("gfa.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    final void a(dt param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 > 110) {
              break L0;
            } else {
              field_j = (iu) null;
              break L0;
            }
          }
          if (this.a(false)) {
            param0.a(this.field_n, param3, -121, param2);
            return;
          } else {
            param0.a(this.field_n, param3, -85);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("gfa.A(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, byte param1, dt param2) {
        try {
            if (this.a(false)) {
                param2.a((byte) -97, this.field_n, param0);
            } else {
                param2.b(this.field_n, -1);
            }
            int var4_int = 30 % ((param1 - 46) / 46);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "gfa.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = new ur(3);
        field_i = "This is <%0>'s RuneScape clan if they have one.";
        field_m = "Report abuse";
    }
}
