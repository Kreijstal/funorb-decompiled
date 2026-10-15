/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ContentTransitionPhase {
    static int[] field_b;
    static int field_d;
    static volatile int livePressedButton;
    static String field_a;
    static String[] field_e;

    public static void a(int param0) {
        if (param0 < -62) {
          field_e = null;
          field_a = null;
          field_b = null;
          return;
        }
        ResourceArchive var2 = (ResourceArchive) null;
        ContentTransitionPhase.a((ResourceArchive) null, 51, -113);
        field_e = null;
        field_a = null;
        field_b = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
          int var2_int = 0;
          Exception var2 = null;
          RuntimeException var2_ref = null;
          String var3 = null;
          int var4 = 0;
          String var5 = null;
          java.net.URL var6 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          String var5Lifetime1;
          String var5Lifetime2;
          try {
            try {
              var2_int = -55 / ((param0 + 30) / 60);
              var3 = param1.getDocumentBase().getFile();
              var5 = var3;
              var5Lifetime1 = var3;
              var4 = var3.indexOf('?');
              var5Lifetime2 = "reload.ws";
              if (0 <= var4) {
                var5Lifetime2 = var5Lifetime2 + var3.substring(var4);
              }
              var6 = new java.net.URL(param1.getCodeBase(), var5Lifetime2);
              param1.getAppletContext().showDocument(DisplayModeInfo.a(param1, var6, -1), "_self");
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = (Exception) (Object) decompiledCaughtException;
              var2.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref;
            stackIn_8_1 = new StringBuilder().append("mi.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static MusicPatch a(ResourceArchive param0, int param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        MusicPatch stackIn_2_0 = null;
        MusicPatch stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = param0.takeFlatFile(param1, (byte) 113);
          var3 = var4;
          if (param2 != 8) {
            stackIn_2_0 = (MusicPatch) null;
            return stackIn_2_0;
          }
          if (var4 == null) {
            return null;
          }
          stackIn_7_0 = new MusicPatch(var4);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("mi.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_b = new int[]{44, 45, 8};
        field_e = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_a = "Cancel unrated rematch";
        livePressedButton = 0;
    }
}
