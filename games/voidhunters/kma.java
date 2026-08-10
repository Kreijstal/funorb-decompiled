/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kma extends eka implements ntb {
    static String field_d;
    static String field_c;

    public final void a(tv param0, int param1) {
        if (param1 >= -19) {
            return;
        }
        try {
            super.a(param0, -20);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "kma.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int a(byte param0) {
        if (param0 > -100) {
            field_c = (String) null;
            return 1024;
        }
        return 1024;
    }

    final static void a(String param0, boolean param1, int param2, String param3) {
        try {
            ht.field_h = param0;
            qsb.field_d = param3;
            fa.a(uta.field_p, -127, param1);
            if (param2 != -17833) {
                field_d = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "kma.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        try {
            super.b((byte) 75, param1);
            if (param0 < 54) {
                field_d = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "kma.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, int param1, int param2, String param3) {
        RuntimeException var4 = null;
        String var5 = null;
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
              if (param2 == 200) {
                break L1;
              } else {
                var5 = (String) null;
                kma.a((String) null, false, -23, (String) null);
                break L1;
              }
            }
            stackIn_3_0 = maa.a(param1, (byte) -126, param0, param3, 200);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("kma.O(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
        return stackIn_3_0;
    }

    public final boolean a(byte param0, tv param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = -85 % ((param0 - 22) / 59);
            stackIn_1_0 = super.a((byte) 122, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("kma.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    public static void c(int param0) {
        field_c = null;
        field_d = null;
        int var1 = 84 % ((param0 - 36) / 50);
    }

    public kma() {
    }

    public final void b(faa param0, int param1) {
        try {
            super.b(param0, -127);
            if (param1 > -109) {
                this.b((byte) 105);
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "kma.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int b(byte param0) {
        if (param0 <= 98) {
            kma.c(-99);
            return 16;
        }
        return 16;
    }

    public final void a(faa param0, boolean param1) {
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "kma.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_d = "Names cannot start or end with space or underscore";
        field_c = "One team has a VIP, the other team wants to destroy them";
    }
}
