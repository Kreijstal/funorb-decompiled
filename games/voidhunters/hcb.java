/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hcb extends rqa {
    static int field_p;
    static int field_o;
    static String field_q;

    public static void a(int param0) {
        field_q = null;
        if (param0 < 34) {
          hcb.a(-45, -91, 32, -35, 52, 118, 51, -43, 19, 16, 38);
        }
    }

    final static void b(boolean param0) {
        rb.field_c = new ij();
        if (param0) {
          field_q = (String) null;
        }
    }

    hcb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 15) {
            hcb.a(108, -16, -68, (byte) 20, 33);
          }
          if (param0 != null &&
            param0.length() >= cd.field_b) {
            if (param0.length() > qn.field_f) {
              return true;
            }
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("hcb.C(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -119) {
            field_o = 58;
          }
          stackIn_3_0 = new nc(frb.a(34, 91));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("hcb.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(int param0, int param1, int param2, byte param3, int param4) {
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_35_1 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        var5 = 15 & param4;
        stackIn_3_0 = (var5 >= 8) ? param1 : param2;
        var6 = stackIn_3_0;
        if (var5 < 4) {
          var7 = param1;
          var8 = -70 / ((-24 - param3) / 62);
          if ((2 & var5) != 0) {
            stackIn_7_0 = -var7;
          } else {
            stackIn_7_0 = var7;
          }
          if ((var5 & 1) != 0) {
            stackIn_10_1 = -var6;
          } else {
            stackIn_10_1 = var6;
          }
          return stackIn_7_0 + stackIn_10_1;
        }
        if (var5 == 12) {
          var7Lifetime1 = param2;
          var8Lifetime1 = -70 / ((-24 - param3) / 62);
          if ((2 & var5) != 0) {
            stackIn_15_0 = -var7Lifetime1;
          } else {
            stackIn_15_0 = var7Lifetime1;
          }
          if ((var5 & 1) != 0) {
            stackIn_18_1 = -var6;
          } else {
            stackIn_18_1 = var6;
          }
          return stackIn_15_0 + stackIn_18_1;
        }
        if (var5 == 14) {
          var7Lifetime2 = param2;
          var8Lifetime2 = -70 / ((-24 - param3) / 62);
          if ((2 & var5) != 0) {
            stackIn_32_0 = -var7Lifetime2;
          } else {
            stackIn_32_0 = var7Lifetime2;
          }
          if ((var5 & 1) != 0) {
            stackIn_35_1 = -var6;
          } else {
            stackIn_35_1 = var6;
          }
          return stackIn_32_0 + stackIn_35_1;
        }
        stackIn_22_0 = param0;
        var7Lifetime3 = stackIn_22_0;
        var8Lifetime3 = -70 / ((-24 - param3) / 62);
        if ((2 & var5) != 0) {
          stackIn_25_0 = -var7Lifetime3;
        } else {
          stackIn_25_0 = var7Lifetime3;
        }
        if ((var5 & 1) != 0) {
          stackIn_28_1 = -var6;
        } else {
          stackIn_28_1 = var6;
        }
        return stackIn_25_0 + stackIn_28_1;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        int var11 = 0;
        int var11Lifetime1;
        if (param0 != 8) {
          field_p = 5;
          if (li.field_i) {
            if (ew.field_o) {
              og.field_r.a(param4, param7, param9, param6, param5, param1, param8, param3, param10, param2);
              return;
            }
            return;
          }
          var11 = param8 >>> 24;
          if (var11 > 1) {
            bfb.field_b = 255 - var11;
            bfb.a(param7, param6, param1, param4, param9, param5, param8);
            return;
          }
          return;
        }
        if (li.field_i) {
          if (ew.field_o) {
            og.field_r.a(param4, param7, param9, param6, param5, param1, param8, param3, param10, param2);
            return;
          }
          return;
        }
        var11Lifetime1 = param8 >>> 24;
        if (var11Lifetime1 > 1) {
          bfb.field_b = 255 - var11Lifetime1;
          bfb.a(param7, param6, param1, param4, param9, param5, param8);
          return;
        }
    }

    static {
        field_q = "Exploiting a bug";
    }
}
