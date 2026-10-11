/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class nq extends rqa {
    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= -119) {
            stackIn_4_0 = new nc(frb.a(208, 115));
            return stackIn_4_0;
          }
          stackIn_2_0 = (nc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("nq.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(float param0, int param1, float param2, int param3, int param4, int param5, float param6, vjb param7, int param8, float param9, int param10, byte[] param11, byte param12, float param13) {
        int var18 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var14_int = 0;
        RuntimeException var14 = null;
        int var16 = 0;
        int var17 = 0;
        int var19 = 0;
        byte[] var20 = null;
        int var21 = 0;
        float[] var25 = null;
        int var16Lifetime1;
        int var17Lifetime1;
        var19 = VoidHunters.field_G;
        try {
          if (param12 <= 47) {
            var20 = (byte[]) null;
            nq.a(1.1260381937026978f, -88, 0.9253022074699402f, -128, 62, -46, 1.1999729871749878f, (vjb) null, -54, 2.695220470428467f, -81, (byte[]) null, (byte) -123, -0.5407317280769348f);
          }
          var14_int = param4 * param3;
          var25 = new float[var14_int];
          for (var16 = 0; var16 < param1; var16++) {
            var17 = param10;
            param7.a(param0 / (float)param3, param6 / (float)param4, var25, param9 / (float)param8, param8, 127.0f * param2, (byte) 99, 0, param3, param5, param4);
            param9 = param9 * 2.0f;
            param2 = param2 * param13;
            for (var18 = 0; var18 < var14_int; var18++) {
              param11[var17] = (byte)(int)((float)param11[var17] + var25[var18]);
              var17++;
            }
            param6 = param6 * 2.0f;
            param0 = param0 * 2.0f;
          }
          var21 = param10;
          var16Lifetime1 = var21;
          for (var17Lifetime1 = 0; var17Lifetime1 < var14_int; var17Lifetime1++) {
            param11[var21] = (byte)(param11[var21] + 127);
            var21++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var14 = decompiledCaughtException;
          stackIn_15_0 = var14;
          stackIn_15_1 = new StringBuilder().append("nq.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param12).append(',').append(param13).append(')').toString());
        }
    }

    final static void a(byte param0, ds param1) {
        try {
          int var4 = 0;
          byte[] var2 = null;
          int var3_int = 0;
          int var5 = 0;
          byte[] var6 = null;
          RuntimeException stackIn_22_0 = null;
          StringBuilder stackIn_22_1 = null;
          String stackIn_23_2 = null;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          RuntimeException var2_ref = null;
          Exception var3 = null;
          var5 = VoidHunters.field_G;
          try {
            var6 = new byte[24];
            var2 = var6;
            if (param0 > -69) {
              return;
            }
            if (vsa.field_r != null) {
              try {
                vsa.field_r.a(0, 0L);
                vsa.field_r.a(-112, var6);
                for (var3_int = 0; var3_int < 24; var3_int++) {
                  if (0 == var6[var3_int]) {
                    continue;
                  }
                  break;
                }
                if (var3_int >= 24) {
                  throw new IOException();
                }
                param1.a(0, var2, -1, 24);
                decompiledRegionSelector0 = 0;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3 = (Exception) (Object) decompiledCaughtException;
                for (var4 = 0; var4 < 24; var4++) {
                  var2[var4] = (byte)-1;
                }
                decompiledRegionSelector0 = 1;
              }
              if (decompiledRegionSelector0 == 0) {
                return;
              }
            }
            param1.a(0, var2, -1, 24);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_22_0 = var2_ref;
            stackIn_22_1 = new StringBuilder().append("nq.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_23_2 = "null";
            } else {
              stackIn_23_2 = "{...}";
            }
            throw rta.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    nq(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
