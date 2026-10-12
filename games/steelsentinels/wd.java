/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd {
    static wk[] field_a;

    final static int a(String param0, byte param1, boolean param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 52) {
            var4 = (String) null;
            wd.$cfr$intArgs$a$1694234bddb3((String) null, -23, true);
          }
          if (!param2) {
            stackIn_6_0 = pa.field_k.c(param0);
            return stackIn_6_0;
          }
          stackIn_4_0 = wb.field_a.c(param0);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("wd.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
          String var2 = (String) null;
          wd.$cfr$intArgs$a$1694234bddb3((String) null, -121, true);
        }
    }

    final static void a(gi param0, boolean param1, hk param2, byte param3) {
        int var9 = 0;
        hk stackIn_5_0 = null;
        boolean stackIn_6_1 = false;
        hk stackIn_8_0 = null;
        boolean stackIn_9_1 = false;
        hk stackIn_11_0 = null;
        boolean stackIn_12_1 = false;
        hk stackIn_14_0 = null;
        boolean stackIn_15_1 = false;
        hk stackIn_17_0 = null;
        int stackIn_18_1 = 0;
        hk stackIn_21_0 = null;
        boolean stackIn_22_1 = false;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        var10 = SteelSentinels.field_G;
        try {
          if (param1) {
            param2.field_wc = param0.f((byte) -124);
          }
          var4_int = 99 / ((-4 - param3) / 58);
          param2.field_Ub = param0.f((byte) -67);
          param2.field_Nc = param0.f((byte) -113);
          var5 = param0.f((byte) -66);
          stackIn_5_0 = (hk) (param2);
          stackIn_6_1 = ((128 & var5) != 0);
          stackIn_5_0.field_nc = stackIn_6_1;
          stackIn_8_0 = (hk) (param2);
          stackIn_9_1 = ((64 & var5) != 0);
          stackIn_8_0.field_rc = stackIn_9_1;
          stackIn_11_0 = (hk) (param2);
          stackIn_12_1 = ((var5 & 8) != 0);
          stackIn_11_0.field_dc = stackIn_12_1;
          stackIn_14_0 = (hk) (param2);
          stackIn_15_1 = (0 != (var5 & 32));
          stackIn_14_0.field_ec = stackIn_15_1;
          stackIn_17_0 = (hk) (param2);
          if ((var5 & 16) != 0) {
            stackIn_18_1 = 2;
          } else {
            stackIn_18_1 = 1;
          }
          stackIn_17_0.field_sc = stackIn_18_1;
          stackIn_21_0 = (hk) (param2);
          stackIn_22_1 = (param2.field_nc) && (param2.field_Ub > param2.field_wc);
          stackIn_21_0.field_cc = stackIn_22_1;
          stackIn_25_0 = ((4 & var5) == 0) ? 0 : 1;
          var6 = stackIn_25_0;
          param0.a(0, param2.field_Sb, 28, param2.field_Sb.length);
          stackIn_28_0 = ((2 & var5) == 0) ? 0 : 1;
          var7 = stackIn_28_0;
          param2.field_yc = param0.c((byte) -60);
          param2.field_Hc = mm.a(-93) - (long)param0.i(0);
          if (var6 != 0) {
            param2.field_Mc = param0.i(0);
          } else {
            param2.field_Mc = -1;
          }
          param2.field_fc = param0.g((byte) -104);
          var8 = param0.field_p;
          param2.field_Xb = param0.h(1);
          if (var7 != 0) {
            param2.field_hc = new String[param2.field_wc];
            param0.field_p = var8;
            for (var9 = 0; var9 < param2.field_wc; var9++) {
              param2.field_hc[var9] = param0.h(1);
            }
            return;
          }
          param2.field_hc = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_39_0 = var4;
          stackIn_39_1 = new StringBuilder().append("wd.D(");
          if (param0 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, byte param1) {
        try {
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          if (param1 != -31) {
            return;
          }
          try {
            hn.a("resizing", (byte) -41, wl.d((byte) -21), new Object[]{new Integer(param0)});
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static int $cfr$intArgs$a$1694234bddb3(String param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 52) {
            var4 = (String) null;
            wd.$cfr$intArgs$a$1694234bddb3((String) null, -23, true);
          }
          if (!param2) {
            stackIn_6_0 = pa.field_k.c(param0);
            return stackIn_6_0;
          }
          stackIn_4_0 = wb.field_a.c(param0);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("wd.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }
}
