/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BrowserPageHelpers {
    static CredentialKind field_b;
    static UiComponent field_d;
    static String field_c;
    static String field_e;
    static int field_g;
    static BitmapFont field_f;
    static String field_a;

    final static void resendQueuedRequests(int param0, int param1) {
        int var3 = 0;
        FriendListHelpers var4 = null;
        PendingRankingRequest var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param1 > -6) {
            BrowserPageHelpers.resendQueuedRequests(-91, -34);
          }
          var4 = (FriendListHelpers) (TriangleMesh.field_u.last(121));
          while (var4 != null) {
            AgeValidator.writeScoreSubmission(var4, true, param0);
            var4 = (FriendListHelpers) (TriangleMesh.field_u.previous(6));
          }
          var5 = (PendingRankingRequest) (ArchiveAvailabilityHelpers.field_f.last(83));
          while (var5 != null) {
            GameApplet.writeRankingsRequestPacket((byte) 73, var5, param0);
            var5 = (PendingRankingRequest) (ArchiveAvailabilityHelpers.field_f.previous(6));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "uq.A(" + param0 + ',' + param1 + ')');
        }
    }

    final static void openSubscribePage(int param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var2 = new java.net.URL(param1.getCodeBase(), "subscribe.ws");
              if (param0 != 3) {
                return;
              }
              param1.getAppletContext().showDocument(DebouncedValidationProvider.applySessionOverridesToUrl(param1, true, var2), "_top");
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
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("uq.D(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        field_f = null;
        field_e = null;
        field_c = null;
        field_b = null;
        field_d = null;
        if (param0 != 3) {
          java.applet.Applet var2 = (java.applet.Applet) null;
          BrowserPageHelpers.openServerListPage((java.applet.Applet) null, -5);
        }
    }

    final static void openServerListPage(java.applet.Applet param0, int param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              if (param1 != 3) {
                return;
              }
              var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
              param0.getAppletContext().showDocument(DebouncedValidationProvider.applySessionOverridesToUrl(param0, true, var2), "_top");
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
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("uq.B(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_c = "Public";
        field_b = new CredentialKind(3);
        field_g = 49;
        field_e = "Please send me news and updates (I can unsubscribe at any time)";
        field_a = "You need to play 1 more rated game to unlock this option.";
    }
}
