/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AwtEventQueueSupport {
    static String[] field_f;
    static int field_d;
    static IntrusiveDeque field_e;
    static String previous;
    static java.security.SecureRandom field_a;
    static int field_g;
    static String[] themeNames;

    final static void pumpAwtEventQueue(Object param0, PlatformTaskDispatcher param1, int param2) {
        int var3_int = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = Pool.field_O;
        try {
          if (param1.field_a == null) {
            return;
          }
          if (param2 <= 57) {
            return;
          }
          for (var3_int = 0; 50 > var3_int; var3_int++) {
            if (null != param1.field_a.peekEvent()) {
              SoundCache.sleepMillis(-121, 1L);
              continue;
            }
            break;
          }
          try {
            if (param0 != null) {
              param1.field_a.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param0, 1001, "dummy")));
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("cb.A(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(')').toString());
        }
    }

    final static byte[] readPackedByteArray(int param0, int param1, CipherPacketBuffer param2, byte[] param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] stackIn_16_0 = null;
        byte[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = param2.readBits(param1, param0 - 28);
          if (0 == var4_int) {
            return null;
          }
          if (param3 == null ||
            param3.length != var4_int) {
            param3 = new byte[var4_int];
          }
          var5 = param2.readBits(3, 66);
          var6 = (byte)param2.readBits(8, 77);
          if (var5 > 0) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param3[var7] = (byte)(param2.readBits(var5, 49) + var6);
            }
          } else {
            for (var7 = 0; var4_int > var7; var7++) {
              param3[var7] = (byte)var6;
            }
          }
          if (param0 == 50) {
            stackIn_18_0 = (byte[]) (param3);
            return stackIn_18_0;
          }
          stackIn_16_0 = (byte[]) null;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("cb.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_f = null;
        if (param0 != 28555) {
          previous = (String) null;
        }
        field_a = null;
        field_e = null;
        themeNames = null;
        previous = null;
    }

    static {
        field_f = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        previous = "Previous";
        field_g = 480;
        field_d = 0;
        field_e = new IntrusiveDeque();
        themeNames = new String[]{"Modern", "Plasma", "Aztec", "Polar", "Space"};
    }
}
