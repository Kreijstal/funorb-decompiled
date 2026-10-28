/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ServerListNavigationSupport {
    static Sprite[] field_a;
    static int[] field_b;

    final static void addSessionCounterOffset(int guard, int offset) {
        if (null != SocketJs5Transport.field_r) {
          SocketJs5Transport.field_r.addOffset(guard ^ -9, offset);
        }
        if (guard != 8) {
          ServerListNavigationSupport.createScratchWords(120);
          return;
        }
    }

    final static void openServerList(java.applet.Applet applet, byte guard) {
        try {
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              if (guard >= -29) {
                ServerListNavigationSupport.addSessionCounterOffset(-34, 33);
              }
              java.net.URL var2 = new java.net.URL(applet.getCodeBase(), "toserverlist.ws");
              applet.getAppletContext().showDocument(WeightedCacheEntry.withSessionParameters((byte) 29, applet, var2), "_top");
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              Exception var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            RuntimeException var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_8_0 = var2_ref2;
            StringBuilder stackIn_8_1 = new StringBuilder().append("v.C(");
            if (applet == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(guard).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int[] createScratchWords(int guard) {
        if (guard >= -43) {
          return (int[]) null;
        }
        return new int[8];
    }

    public static void releaseStatics(byte guard) {
        field_a = null;
        field_b = null;
        if (guard != -87) {
          ServerListNavigationSupport.createScratchWords(79);
        }
    }

    static {
        field_b = new int[]{5, 6, 7};
    }
}
