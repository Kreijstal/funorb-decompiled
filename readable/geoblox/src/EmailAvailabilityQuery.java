/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EmailAvailabilityQuery {
    static int field_b;
    private String candidateEmail;
    private boolean available;
    static int matchCandidateCount;
    private boolean completed;
    static int pendingActionPanelHoldTicks;

    final void complete(byte methodGuard, boolean available) {
        if (methodGuard > -47) {
            return;
        }
        this.available = available ? true : false;
        this.completed = true;
    }

    static int xorInt(int left, int right) {
        return left ^ right;
    }

    final static void a(java.applet.Applet param0, boolean param1) {
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
                if (param1) {
                  return;
                }
                var2 = param0.getDocumentBase().getFile();
                var3 = var2.indexOf('?');
                var4 = "reload.ws";
                if (var3 >= 0) {
                  var4 = var4 + var2.substring(var3);
                }
                var5 = new java.net.URL(param0.getCodeBase(), var4);
                param0.getAppletContext().showDocument(SessionGameApplet.applySessionOverridesToUrl(var5, 58, param0), "_self");
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
              stackIn_11_1 = new StringBuilder().append("h.A(");
              if (param0 == null) {
                stackIn_12_2 = "null";
              } else {
                stackIn_12_2 = "{...}";
              }
              throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean isCompleted(int methodGuard) {
        if (methodGuard > -74) {
            this.isCompleted(19);
            return this.completed;
        }
        return this.completed;
    }

    final static void drawMovingEntities(int methodGuard) {
        RuntimeException movingDrawFailureForContext = null;
        int clientControlFlowGuardSnapshot = 0;
        GameplayEntity movingEntityToDraw = null;
        RuntimeException caughtMovingDrawFailure = null;
        clientControlFlowGuardSnapshot = Geoblox.clientControlFlowFlag;
        try {
          movingEntityToDraw = (GameplayEntity) ((Object) ArchiveNetworkClient.movingEntities.firstForIteration(0));
          while (movingEntityToDraw != null) {
            movingEntityToDraw.drawBoardRotatedEntity(-16096);
            movingEntityToDraw = (GameplayEntity) ((Object) ArchiveNetworkClient.movingEntities.nextForIteration(1));
          }
          if (methodGuard == -1) {
            return;
          }
          EmailAvailabilityQuery.drawMovingEntities(116);
          return;
        } catch (java.lang.RuntimeException movingDrawFailure) {
          caughtMovingDrawFailure = movingDrawFailure;
          movingDrawFailureForContext = caughtMovingDrawFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) movingDrawFailureForContext), "h.B(" + methodGuard + ')');
        }
    }

    final boolean isAvailable(byte methodGuard) {
        if (methodGuard >= -45) {
            java.applet.Applet var3 = (java.applet.Applet) null;
            EmailAvailabilityQuery.a((java.applet.Applet) null, true);
            return this.available;
        }
        return this.available;
    }

    final String candidateEmail(int methodGuard) {
        if (methodGuard != 19491) {
            this.isAvailable((byte) -82);
            return this.candidateEmail;
        }
        return this.candidateEmail;
    }

    EmailAvailabilityQuery(String candidateEmail) {
        this.completed = false;
        this.available = false;
        try {
            this.candidateEmail = candidateEmail;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "h.<init>(" + (candidateEmail != null ? "{...}" : "null") + ')');
        }
    }

    static {
        matchCandidateCount = 0;
    }
}
