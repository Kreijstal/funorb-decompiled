/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HiscoreRequest extends IntrusiveNode {
    static java.awt.Frame field_n;
    int tableId;
    static int[] field_t;
    String[][] names;
    long[][] entryIds;
    int[][] values;
    static String quitToWebsiteText;
    boolean complete;
    int rowCount;
    int columnCount;

    final static HiscoreRequest requestHiscores(int columnCount, int guard, int tableId, int opcode, int rowCount) {
        int var6 = Sumoblitz.field_L ? 1 : 0;
        HiscoreRequest var5 = (HiscoreRequest) (HiscoreRequestQueue.pending.first(guard - 107));
        while (var5 != null) {
          if (~tableId == ~var5.tableId) {
            return var5;
          }
          var5 = (HiscoreRequest) (HiscoreRequestQueue.pending.next((byte) 18));
        }
        var5 = new HiscoreRequest();
        var5.columnCount = columnCount;
        var5.rowCount = rowCount;
        var5.tableId = tableId;
        HiscoreRequestQueue.pending.addLast((IntrusiveNode) (var5), (byte) 39);
        if (guard == 1) {
          FourIntReadRequest.sendHiscoreRequest((byte) -65, opcode, var5);
          return var5;
        }
        HiscoreRequest.loadNativeSoftwareLibraries((byte) 50);
        FourIntReadRequest.sendHiscoreRequest((byte) -65, opcode, var5);
        return var5;
    }

    final static void reloadApplet(int guard, java.applet.Applet applet) {
        try {
          String var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          int var3 = 0;
          String var4 = null;
          java.net.URL var5 = null;
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var2 = applet.getDocumentBase().getFile();
              var3 = var2.indexOf('?');
              var4 = "reload.ws";
              if (guard != 8192) {
                return;
              }
              if (var3 >= 0) {
                var4 = var4 + var2.substring(var3);
              }
              var5 = new java.net.URL(applet.getCodeBase(), var4);
              applet.getAppletContext().showDocument(MusicPatch.a((byte) 122, applet, var5), "_self");
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var2_ref2;
            stackIn_11_1 = new StringBuilder().append("of.F(").append(guard).append(',');
            if (applet == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void openPauseMenu(byte guard) {
        PauseMenuState.pauseMenuOpen = true;
        if (guard > -102) {
          field_t = (int[]) null;
        }
    }

    final static boolean readBooleanFlag(PacketBuffer packet, int guard) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = packet.readUnsignedByte(-31302);
          stackIn_3_0 = (var2_int != 1) ? 0 : 1;
          var3 = stackIn_3_0;
          var4 = 88 / ((70 - guard) / 33);
          stackIn_4_0 = var3;
          return stackIn_4_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("of.E(");
          if (packet == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(guard).append(')').toString());
        }
    }

    final static String accountServiceIdentifier(int guard) {
        int var1 = -4 / ((guard - 48) / 36);
        if (ProxySocketConnector.accountCreationState == LegacyOpenGlGraphicsHeap.PENDING) {
          return FadingWidget.field_C;
        }
        if (!AffineTransform3D.emailAvailabilityRequest.isComplete(true)) {
          return AffineTransform3D.emailAvailabilityRequest.email(32);
        }
        if (LegacyOpenGlGraphicsHeap.PENDING == Base37NameAlphabet.nameAvailabilityState) {
          return AffineTransform3D.emailAvailabilityRequest.email(107);
        }
        return FocusProxyWidget.field_F;
    }

    final static boolean loadNativeSoftwareLibraries(byte guard) {
        int var1 = -123 % ((67 - guard) / 50);
        if (!ScrollPane.b((byte) -89, "jaclib")) {
          return false;
        }
        return ScrollPane.b((byte) 93, "hw3d");
    }

    public static void releaseStatics(int guard) {
        if (guard == -26437) {
          field_n = null;
          quitToWebsiteText = null;
          field_t = null;
          return;
        }
        HiscoreRequest.accountServiceIdentifier(-86);
        field_n = null;
        quitToWebsiteText = null;
        field_t = null;
    }

    HiscoreRequest() {
    }

    static {
        field_t = new int[8192];
        quitToWebsiteText = "Quit to website";
    }
}
