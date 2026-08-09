/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lo extends sd {
    private db field_z;
    static String field_A;
    static int field_B;

    final void k(int param0) {
        this.field_u = new int[4];
        this.field_r = param0;
        this.field_x = 0;
        this.field_q = null;
        this.field_w = new int[4];
    }

    final static br a(bc param0, byte param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        byte[] var5 = null;
        Object stackIn_2_0 = null;
        br stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = 34 / ((param1 - -77) / 39);
            var5 = param0.a(false, param2);
            var3 = var5;
            if (var5 != null) {
              stackIn_4_0 = new br(var5);
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
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3_ref);

            stackIn_7_1 = new StringBuilder().append("lo.I(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (br) ((Object) stackIn_2_0);
        } else {
          return stackIn_4_0;
        }
    }

    final ln j(int param0) {
        bc var3;
        if (param0 != 18229) {
          var3 = (bc) null;
          lo.a((bc) null, (byte) -92, -64);
          return (ln) ((Object) this.field_z.c(-127));
        } else {
          return (ln) ((Object) this.field_z.c(-127));
        }
    }

    final ln i(int param0) {
        if (param0 > -16) {
            return (ln) null;
        }
        return (ln) ((Object) this.field_z.a(-118));
    }

    final void a(int param0, ln param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_z.a(param1, 32);
              if (param0 == -21771) {
                break L1;
              } else {
                field_A = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("lo.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    lo(fs param0, ln param1) {
        super(param0, param1);
        try {
            this.field_z = new db();
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "lo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int g(int param0) {
        int var2 = -24 % ((5 - param0) / 51);
        return this.field_z.c((byte) 67);
    }

    final void a(pf param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -9332) {
              break L0;
            } else {
              field_B = -68;
              break L0;
            }
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var3);

            stackIn_5_1 = new StringBuilder().append("lo.C(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final ln h(int param0) {
        if (param0 != -23410) {
          this.field_z = (db) null;
          return (ln) ((Object) this.field_z.b(32));
        } else {
          return (ln) ((Object) this.field_z.b(32));
        }
    }

    public static void l(int param0) {
        if (param0 != 0) {
            return;
        }
        field_A = null;
    }

    final boolean e(int param0) {
        if (param0 != 27650) {
            return false;
        }
        return this.field_z.a((byte) 25);
    }

    static {
        field_A = "Find opponents";
    }
}
