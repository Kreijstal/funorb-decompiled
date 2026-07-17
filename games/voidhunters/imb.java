/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class imb implements ntb, utb {
    int field_c;
    static int field_a;
    int field_e;
    int field_d;
    static String field_b;

    public static void a() {
        field_b = null;
    }

    public final void a(faa param0, byte param1) {
        param0.a(-632, ((imb) this).field_c + 1, 5);
        param0.a(-632, ((imb) this).field_e, 32);
        if (param1 > -91) {
            return;
        }
        try {
            param0.a(-632, ((imb) this).field_d, 32);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "imb.E(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public final void a(faa param0, int param1) {
        try {
            ((imb) this).field_c = param0.i(0, 5) + -1;
            ((imb) this).field_e = param0.i(0, param1);
            ((imb) this).field_d = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "imb.L(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public final boolean a(byte param0, tv param1) {
        imb var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var4 = -41 % ((param0 - 22) / 59);
              var3 = (imb) (Object) param1;
              if (var3.field_c == var3.field_c) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3_ref;
            stackOut_4_1 = new StringBuilder().append("imb.C(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0 != 0;
    }

    public final void b(byte param0, tv param1) {
        imb var5 = null;
        imb var6 = null;
        try {
            var5 = (imb) (Object) param1;
            var6 = var5;
            if (param0 <= 54) {
                ((imb) this).field_d = -122;
            }
            var6.field_e = var5.field_e;
            var6.field_d = var5.field_d;
            var6.field_c = var5.field_c;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "imb.D(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    imb() {
        ((imb) this).field_c = -1;
    }

    public final void b(faa param0, int param1) {
        if (param1 > -109) {
            return;
        }
        try {
            param0.a(-632, 1 + ((imb) this).field_c, 5);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "imb.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
            if (param1) {
                ((imb) this).field_e = -38;
            }
            ((imb) this).field_c = param0.i(0, 5) - 1;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "imb.H(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public final void a(tv param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        Object var5 = null;
        imb var6 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              var6 = (imb) (Object) param0;
              var4 = 0;
              if (var6.field_c != var6.field_c) {
                System.out.println("int connected_component_idx has changed. before=" + var6.field_c + ", now=" + var6.field_c);
                var4 = 1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (var6.field_e == var6.field_e) {
                break L2;
              } else {
                var4 = 1;
                System.out.println("int worldx has changed. before=" + var6.field_e + ", now=" + var6.field_e);
                break L2;
              }
            }
            L3: {
              if (var6.field_d == var6.field_d) {
                break L3;
              } else {
                var4 = 1;
                System.out.println("int worldy has changed. before=" + var6.field_d + ", now=" + var6.field_d);
                break L3;
              }
            }
            L4: {
              if (param1 < -19) {
                break L4;
              } else {
                var5 = null;
                ((imb) this).b((byte) 67, (tv) null);
                break L4;
              }
            }
            if (var4 == 0) {
              break L0;
            } else {
              System.out.println("This instance of Hardpoint has changed");
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("imb.F(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        Object var9 = null;
        ((imb) this).field_d = (param3 * param6 + param0 * param5 >> 16) + param2;
        if (param4 != -665140432) {
          var9 = null;
          ((imb) this).a((faa) null, true);
          ((imb) this).field_e = param1 - -(-(param6 * param0) + param3 * param5 >> 16);
          return;
        } else {
          ((imb) this).field_e = param1 - -(-(param6 * param0) + param3 * param5 >> 16);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Accurate and long ranged. High energy consumption";
    }
}
