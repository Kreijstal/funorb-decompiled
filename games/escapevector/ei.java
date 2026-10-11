/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei extends hg {
    static byte[][] field_l;
    static int field_j;
    static String field_n;
    static String field_k;
    boolean field_g;
    static mf field_m;
    byte[] field_h;
    static boolean field_i;

    final static boolean d(int param0) {
        if (param0 == 1000) {
          return hc.a(false, oc.d((byte) -110));
        }
        String var2 = (String) null;
        ei.a(10, true, 83L, (String) null, (String) null);
        return hc.a(false, oc.d((byte) -110));
    }

    final static int a(int param0, int param1, int param2) {
        if (param0 != 0) {
          field_n = (String) null;
          return ul.a(param1, param2, 96);
        }
        return ul.a(param1, param2, 96);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = EscapeVector.field_A;
        if (param9 == -15733) {
          if (param1 < param8) {
            if (param5 > param8) {
              va.a(param6, param4, param11, param13, em.field_i, param0, param15, param2, param1, param8, param5, true, param12, param7, param14, param3, param10);
              return;
            }
            if (param5 > param1) {
              va.a(param4, param6, param11, param10, em.field_i, param7, param3, param2, param1, param5, param8, true, param12, param0, param14, param15, param13);
              return;
            }
            va.a(param4, param12, param10, param11, em.field_i, param2, param14, param7, param5, param1, param8, true, param6, param0, param3, param15, param13);
            return;
          }
          if (param1 < param5) {
            va.a(param6, param12, param13, param11, em.field_i, param2, param14, param0, param8, param1, param5, true, param4, param7, param15, param3, param10);
            return;
          }
          if (param8 >= param5) {
            va.a(param12, param4, param10, param13, em.field_i, param0, param15, param7, param5, param8, param1, true, param6, param2, param3, param14, param11);
            return;
          }
          va.a(param12, param6, param13, param10, em.field_i, param7, param3, param0, param8, param5, param1, true, param4, param2, param15, param14, param11);
          return;
        }
        field_n = (String) null;
        if (param1 < param8) {
          if (param5 > param8) {
            va.a(param6, param4, param11, param13, em.field_i, param0, param15, param2, param1, param8, param5, true, param12, param7, param14, param3, param10);
            return;
          }
          if (param5 > param1) {
            va.a(param4, param6, param11, param10, em.field_i, param7, param3, param2, param1, param5, param8, true, param12, param0, param14, param15, param13);
            return;
          }
          va.a(param4, param12, param10, param11, em.field_i, param2, param14, param7, param5, param1, param8, true, param6, param0, param3, param15, param13);
          return;
        }
        if (param1 < param5) {
          va.a(param6, param12, param13, param11, em.field_i, param2, param14, param0, param8, param1, param5, true, param4, param7, param15, param3, param10);
          return;
        }
        if (param8 >= param5) {
          va.a(param12, param4, param10, param13, em.field_i, param0, param15, param7, param5, param8, param1, true, param6, param2, param3, param14, param11);
          return;
        }
        va.a(param12, param6, param13, param10, em.field_i, param7, param3, param0, param8, param5, param1, true, param4, param2, param15, param14, param11);
    }

    final static vj a(int param0, boolean param1, long param2, String param3, String param4) {
        RuntimeException var6 = null;
        pl stackIn_5_0 = null;
        bh stackIn_7_0 = null;
        ld stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if ((long)param0 == param2 &&
            param3 != null) {
            stackIn_7_0 = new bh(param3, param4);
            return (vj) ((Object) stackIn_7_0);
          }
          if (!param1) {
            stackIn_9_0 = new ld(param2, param4);
            return (vj) ((Object) stackIn_9_0);
          }
          stackIn_5_0 = new pl(param2, param4);
          return (vj) ((Object) stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("ei.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void e(int param0) {
        field_m = null;
        field_k = null;
        if (param0 >= -44) {
          return;
        }
        field_l = (byte[][]) null;
        field_n = null;
    }

    ei() {
    }

    static {
        field_l = new byte[1000][];
        field_n = "Use this alternative as your account name";
        field_k = "Play free version";
        field_j = 0;
        field_i = false;
    }
}
