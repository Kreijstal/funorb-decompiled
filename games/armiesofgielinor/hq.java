/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hq {
    static char[] field_b;
    static ru[] field_a;
    static String field_c;
    static String field_d;
    static int field_f;
    static int field_e;

    public static void a(byte param0) {
        field_d = null;
        if (param0 >= -50) {
          return;
        }
        field_a = null;
        field_b = null;
        field_c = null;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7, int param8, boolean param9, String param10, hd param11, long param12, int param13) {
        try {
          RuntimeException stackIn_16_0 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          IOException var15 = null;
          RuntimeException var15_ref = null;
          try {
            mg.field_e = new CipherPacketBuffer(param3);
            vl.field_n = new CipherPacketBuffer(param1);
            io.field_t = param5;
            k.field_c = param10;
            BestScoreStrategy.field_l = param9;
            AiPlanningStrategy.field_c = param2;
            wj.field_n = param11;
            rn.field_d = param8;
            ul.field_a = param4;
            an.field_E = param12;
            CampaignRewardPreview.field_d = param0;
            fl.field_e = param13;
            ng.field_v = param6;
            if (null != wj.field_n.field_m) {
              try {
                le.field_d = new ue(wj.field_n.field_m, 64, 0);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var15 = (IOException) (Object) decompiledCaughtException;
                throw new RuntimeException(var15.toString());
              }
            }
            if (param7 == 0) {
              return;
            }
            hq.a(58, -109, 31, 35, false, 42, -98, -22, -122, true, (String) null, (hd) null, -46L, 85);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var15_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_16_0 = var15_ref;
            stackIn_16_1 = new StringBuilder().append("hq.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',');
            if (param10 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
            if (param11 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw ig.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param12).append(',').append(param13).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_d = "Previous";
        field_f = 64;
        field_c = "Drawn";
    }
}
