/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetCountermeasureLauncherAimspeed extends ConsoleCommand {
    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5, String param6, int param7) {
        RuntimeException var8 = null;
        da stackIn_8_0;
        int stackIn_8_1;
        int stackIn_8_2;
        int stackIn_8_3;
        boolean stackIn_9_4;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (255 <= param2) {
            woa.a(param4, param1, param0, (byte) 74, param5, param7, param6);
            return;
          }
          if (li.field_i) {
            stackIn_8_0 = nma.field_b[param7];
            stackIn_8_1 = param5;
            stackIn_8_2 = param1;
            stackIn_8_3 = param2 << 24 | param4;
            stackIn_9_4 = !(param3);
            ((da) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_8_2, stackIn_8_3, stackIn_9_4, param0, param6);
          } else {
            ita.a(param7, 7988).c(param6, param0, param1, param4, param5, param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_14_0 = var8;
          stackIn_14_1 = new StringBuilder().append("hs.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param7).append(')').toString());
        }
    }

    final static void a(ea param0, int param1, int param2) {
        faa var5 = null;
        int var4 = 0;
        try {
          var5 = RequestNewestBlackboxRecording.field_p;
          var5.h(param1 + 24334, param2);
          var5.position = var5.position + 1;
          var4 = var5.position;
          var5.c(0, param1);
          var5.c(param1 ^ 1, param0.field_e);
          var5.c(0, param0.field_g);
          var5.d(param0.field_i, param1 ^ 332614537);
          var5.d(param0.field_h, 332614536);
          var5.d(param0.field_l, param1 ^ 332614537);
          var5.d(param0.field_f, 332614536);
          var5.g(param1 ^ 1594, var4);
          var5.e(var5.position - var4, param1 - 130);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "hs.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ea var4 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -119) {
            var4 = (ea) null;
            GetCountermeasureLauncherAimspeed.a((ea) null, 4, -26);
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(129, 85));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("hs.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    GetCountermeasureLauncherAimspeed(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
