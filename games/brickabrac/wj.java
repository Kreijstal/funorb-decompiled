/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj extends IntrusiveNode {
    final static void sleepMillis(int obfuscationGuard, long millis) {
        if (obfuscationGuard > -123) {
          wj.sleepMillis(112, -29L);
          if (0L >= millis) {
            return;
          }
          if (0L != millis % 10L) {
            ArchiveSource.sleepOnce(-29869, millis);
            return;
          }
          ArchiveSource.sleepOnce(-29869, -1L + millis);
          ArchiveSource.sleepOnce(-29869, 1L);
          return;
        }
        if (0L >= millis) {
          return;
        }
        if (0L != millis % 10L) {
          ArchiveSource.sleepOnce(-29869, millis);
          return;
        }
        ArchiveSource.sleepOnce(-29869, -1L + millis);
        ArchiveSource.sleepOnce(-29869, 1L);
    }

    final static String a(int param0, String param1, char param2, String param3) {
        StringBuilder discarded$4 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var11 = BrickABrac.field_J ? 1 : 0;
        try {
          var4_int = param1.length();
          var5 = param3.length();
          var6 = var4_int;
          var7 = param0 + var5;
          if (var7 != 0) {
            var8_int = 0;
            while (true) {
              var8_int = param1.indexOf((int) param2, var8_int);
              if (var8_int < 0) {
                break;
              }
              var8_int++;
              var6 = var6 + var7;
            }
          }
          var8 = new StringBuilder(var6);
          var9 = 0;
          while (true) {
            var10 = param1.indexOf((int) param2, var9);
            if (var10 < 0) {
              discarded$4 = var8.append(param1.substring(var9));
              stackIn_10_0 = var8.toString();
              return stackIn_10_0;
            }
            discarded$2 = var8.append(param1.substring(var9, var10));
            var9 = 1 + var10;
            discarded$3 = var8.append(param3);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("wj.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, int param2, boolean param3, int param4, MusicTrack param5, boolean param6) {
        Object var7 = null;
        Throwable var8 = null;
        Object stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          var7 = DirectByteStorage.field_f;
          synchronized (var7) {
            m.musicSynthesizer.setChannelGain(param2, -1, 16);
            if (param3) {
              return;
            }
            IterableIntrusiveHashTable.a(25459, param6, param5, param4, param0, param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_11_0 = var7;
          stackIn_11_1 = new StringBuilder().append("wj.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) (stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param6).append(')').toString());
        }
    }

    private wj() throws Throwable {
        throw new Error();
    }

    static {
    }
}
