/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EmailAvailabilityQuery {
    static int decodedRankedRatioSecondComponent;
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

    final static void navigateToReloadPage(java.applet.Applet applet, boolean skipNavigation) {
        try {
            String documentFile = null;
            Exception printedNavigationFailure = null;
            RuntimeException navigationFailureForContext = null;
            int queryStartIndex = 0;
            String reloadRelativeUrl = null;
            java.net.URL reloadUrl = null;
            RuntimeException navigationFailureBeforeDescription = null;
            StringBuilder navigationMessagePrefix = null;
            String appletDescription = null;
            Throwable caughtNavigationThrowable = null;
            try {
              try {
                if (skipNavigation) {
                  return;
                }
                documentFile = applet.getDocumentBase().getFile();
                queryStartIndex = documentFile.indexOf('?');
                reloadRelativeUrl = "reload.ws";
                if (queryStartIndex >= 0) {
                  reloadRelativeUrl = reloadRelativeUrl + documentFile.substring(queryStartIndex);
                }
                reloadUrl = new java.net.URL(applet.getCodeBase(), reloadRelativeUrl);
                applet.getAppletContext().showDocument(SessionGameApplet.applySessionOverridesToUrl(reloadUrl, 58, applet), "_self");
                return;
              } catch (java.lang.Exception navigationException) {
                caughtNavigationThrowable = navigationException;
                printedNavigationFailure = (Exception) (Object) caughtNavigationThrowable;
                printedNavigationFailure.printStackTrace();
                return;
              }
            } catch (java.lang.RuntimeException navigationFailure) {
              caughtNavigationThrowable = navigationFailure;
              navigationFailureForContext = (RuntimeException) (Object) caughtNavigationThrowable;
              navigationFailureBeforeDescription = navigationFailureForContext;
              navigationMessagePrefix = new StringBuilder().append("h.A(");
              if (applet == null) {
                appletDescription = "null";
              } else {
                appletDescription = "{...}";
              }
              throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) navigationFailureBeforeDescription), ((StringBuilder) (Object) navigationMessagePrefix).append(appletDescription).append(',').append(skipNavigation).append(')').toString());
            }
        } catch (RuntimeException | Error uncheckedBoundaryFailure) {
            throw uncheckedBoundaryFailure;
        } catch (Throwable checkedBoundaryFailure) {
            throw new RuntimeException(checkedBoundaryFailure);
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
            EmailAvailabilityQuery.navigateToReloadPage((java.applet.Applet) null, true);
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
