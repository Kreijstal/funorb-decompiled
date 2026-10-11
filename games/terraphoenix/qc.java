/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qc {
    static byte[][] field_b;
    static int field_c;
    static jj field_a;
    static java.util.zip.CRC32 field_d;
    static ci[] field_f;
    static String field_e;

    final static boolean a(byte param0) {
        if (param0 > -125) {
          return true;
        }
        return a.field_b == null ? uk.field_c : true;
    }

    final static void a(int[] param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        int var11_int = 0;
        int var12 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var11 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = Terraphoenix.field_V;
        try {
          if (param7 != 16711680) {
            return;
          }
          for (var11_int = -param6; 0 > var11_int; var11_int++) {
            for (var12 = -param9; 0 > var12; var12++) {
              param8 = param2[param3++];
              if (param8 == 0) {
                param10++;
              } else {
                var13 = param4 * (16711935 & param8) & -16711936;
                var14 = 16711680 & (65280 & param8) * param4;
                incrementValue$1 = param10;
                param10++;
                param0[incrementValue$1] = ei.b(ei.b(var13, var14) >>> 8, 1);
              }
            }
            param10 = param10 + param1;
            param3 = param3 + param5;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          stackIn_16_0 = var11;
          stackIn_16_1 = new StringBuilder().append("qc.H(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(')').toString());
        }
    }

    final static boolean a(byte param0, String param1, String param2) {
        RuntimeException var3 = null;
        String var4 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (am.a(param1, true)) {
            return false;
          }
          if (ef.a((byte) -77, param1)) {
            return false;
          }
          if (f.a(param1, -113)) {
            return false;
          }
          if (param2.length() == 0) {
            return true;
          }
          if (param0 != 80) {
            var4 = (String) null;
            qc.a((String) null, (fa) null, (String) null, (byte) -43);
          }
          if (ak.a(param1, param2, false)) {
            return false;
          }
          if (a.a(param1, param0 - 136, param2)) {
            return false;
          }
          if (!oh.a((byte) -88, param2, param1)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_29_0 = var3;
          stackIn_29_1 = new StringBuilder().append("qc.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param2 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_f = null;
        field_e = null;
        field_b = (byte[][]) null;
        if (param0 == 16711680) {
          field_a = null;
          field_d = null;
          return;
        }
        eg var2 = (eg) null;
        qc.a(-108, (eg) null, (byte) -24);
        field_a = null;
        field_d = null;
    }

    final static void a(int param0, eg param1, byte param2) {
        uc var6 = null;
        int var4 = 0;
        try {
          var6 = di.field_l;
          var6.k(-17410, param0);
          var6.field_k = var6.field_k + 1;
          var4 = var6.field_k;
          var6.i(1, -125);
          var6.i(param1.field_o, -18);
          var6.i(param1.field_l, -99);
          var6.e(param1.field_q, 8959);
          var6.e(param1.field_m, 8959);
          var6.e(param1.field_i, 8959);
          var6.e(param1.field_j, 8959);
          int var5 = 5 / ((param2 - 34) / 34);
          var6.d(var4, 8600);
          var6.j(var6.field_k - var4, -119);
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "qc.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static vc a(int param0) {
        if (param0 != -1) {
          return (vc) null;
        }
        return (vc) ((Object) new jd());
    }

    final static void a(boolean param0, boolean param1, int param2) {
        String var4 = (String) null;
        sj.$cfr$intArgs$a$b1efba5c64a3(param1, 68, param0, (String) null);
        if (param2 <= 104) {
          qc.a(false, true, 19);
        }
    }

    final static String a(String param0, fa param1, String param2, byte param3) {
        RuntimeException var4 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1.a(0)) {
            stackIn_3_0 = (String) (param2);
            return stackIn_3_0;
          }
          if (param3 > 76) {
            stackIn_8_0 = param0 + " - " + param1.a((byte) 127) + "%";
            return stackIn_8_0;
          }
          stackIn_6_0 = (String) null;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("qc.E(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_c = 0;
        field_a = new jj();
        field_d = new java.util.zip.CRC32();
        field_e = "Continue saved game";
    }
}
