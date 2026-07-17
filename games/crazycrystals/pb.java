/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pb {
    static String field_c;
    static String field_b;
    static int field_a;

    abstract pb b(byte param0);

    public static void a(int param0) {
        if (param0 != -31237) {
            return;
        }
        field_b = null;
        field_c = null;
    }

    abstract int a(int param0, int param1);

    abstract void a(boolean param0, ta param1, boolean param2);

    void a(boolean param0, int param1, int param2, int param3) {
        if (!param0) {
            field_c = null;
        }
    }

    void a(byte param0, ta param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 19) {
                break L1;
              } else {
                field_a = 19;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("pb.L(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    void a(byte param0) {
        int var2 = -66 % ((29 - param0) / 42);
    }

    abstract int a(byte param0, boolean param1);

    final static void a(int param0, un param1, int param2, int param3, int param4, int param5, String param6, int param7, int param8) {
        try {
            fk.field_v = param5;
            em.field_g = param6;
            pj.field_x = param8;
            kn.field_q = param2;
            ah.field_e = param7;
            cb.field_m = param0;
            cc.field_a = param1;
            CrazyCrystals.field_D = param3;
            if (param4 != 1843275042) {
                field_b = null;
            }
            oi.field_d = (ob) (Object) new ap();
            hc.field_a = new ni(param1);
            ch.field_d = new pk(oi.field_d, hc.field_a);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "pb.S(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + (param6 != null ? "{...}" : "null") + 44 + param7 + 44 + param8 + 41);
        }
    }

    abstract void a(int param0, int param1, ta param2);

    final static int a(int param0, byte param1) {
        param0--;
        param0 = param0 | param0 >>> 1;
        param0 = param0 | param0 >>> 2;
        param0 = param0 | param0 >>> 4;
        param0 = param0 | param0 >>> 8;
        param0 = param0 | param0 >>> 16;
        return 1 + param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Passwords can only contain letters and numbers";
    }
}
