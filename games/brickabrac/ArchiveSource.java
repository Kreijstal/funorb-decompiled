/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ArchiveSource {
    static String field_a;
    static String field_d;
    static String field_b;
    static String field_c;

    abstract ArchiveIndex getIndex(byte obfuscationGuard);

    final static boolean a(String param0, String param1, String param2, int param3, byte param4, dk param5, boolean param6) {
        RuntimeException var7 = null;
        qf var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 > -102) {
            ArchiveSource.a(51);
          }
          if (ik.field_g != ej.field_P) {
            return false;
          }
          var8 = new qf(ResourceArchive.field_f, param5);
          ResourceArchive.field_f.a(-102, var8);
          if (LevelPackLoader.a((byte) -56)) {
            var8.c(true);
            return true;
          }
          VolcanicBackground.field_w = param0;
          ik.field_g = jm.field_f;
          tf.field_i = param6;
          fj.field_Qb = param1;
          am.field_cc = param2;
          ni.field_Rb = null;
          Paddle.field_x = param3;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_15_0 = var7;
          stackIn_15_1 = new StringBuilder().append("bc.B(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param6).append(')').toString());
        }
    }

    final static void sleepOnce(int obfuscationGuard, long millis) {
        try {
          Throwable decompiledCaughtException = null;
          InterruptedException var3 = null;
          try {
            Thread.sleep(millis);
            if (obfuscationGuard != -29869) {
              field_a = (String) null;
              return;
            }
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (InterruptedException) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        CharSequence var3 = null;
        if (param0 == 27423) {
          tb.field_cb = jl.incomingPackets.readCp1252String(-1);
          var3 = (CharSequence) ((Object) tb.field_cb);
          ArchiveFetchClient.field_d = gb.a(var3, 71);
          return;
        }
        ArchiveSource.sleepOnce(49, -113L);
        tb.field_cb = jl.incomingPackets.readCp1252String(-1);
        CharSequence var2 = (CharSequence) ((Object) tb.field_cb);
        ArchiveFetchClient.field_d = gb.a(var2, 71);
    }

    abstract byte[] getPackedGroup(int groupId, byte obfuscationGuard);

    abstract int getGroupProgress(byte obfuscationGuard, int groupId);

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        field_d = null;
        field_c = null;
        if (param0 != -59) {
          ArchiveSource.sleepOnce(-15, -86L);
        }
    }

    static {
        field_d = "You can join this game";
        field_a = "Show chat (<%0> unread messages)";
        field_b = "Game options";
        field_c = "Location";
    }
}
