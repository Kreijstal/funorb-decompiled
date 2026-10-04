/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StrongCacheReference extends CacheReference {
    static int receivedSessionSnapshotKind;
    static String loginRegisterText;
    static PlatformTask archiveConnectTask;
    private Object referent;

    final static void writeIntArrayQuery(byte methodGuard, int packetOpcode, IntArrayQuery query) {
        PacketBuffer packet = null;
        try {
            packet = CacheReference.outgoingSessionBuffer;
            packet.writeCipherByte(packetOpcode, (byte) -80);
            int guardResidue = 66 % ((methodGuard - 23) / 51);
            packet.writeByte((byte) 122, 2);
            packet.writeByte((byte) 125, 0);
            packet.writeByte((byte) -90, query.queryByte);
        } catch (RuntimeException queryWriteFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) queryWriteFailure), "gj.E(" + methodGuard + ',' + packetOpcode + ',' + (query != null ? "{...}" : "null") + ')');
        }
    }

    final static void publishAccountUsernameResult(String candidateText, int responseCode, byte methodGuard, String[] suggestions) {
        RuntimeException responseFailureForContext = null;
        int clientControlFlowSnapshot = 0;
        int acceptedQueryGuard = 0;
        boolean under13Snapshot = false;
        RuntimeException responseFailureBeforeContext = null;
        StringBuilder responseMessagePrefix = null;
        String candidateDescription = null;
        StringBuilder responseMessageBeforeSuggestions = null;
        String suggestionsDescription = null;
        RuntimeException caughtResponseFailure = null;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
          ClientFlowState.accountCreationFlowState = MeshPrioritySupport.completedClientFlowToken;
          if (methodGuard != 30) {
            return;
          }
          if (responseCode != 255) {
            if (responseCode < 100) {
              UsernameQueryState.pendingAccountUsernameResult = RankedComparisonSupport.createUsernameResponseQuery(candidateText, responseCode, false);
              return;
            }
            if (responseCode <= 105) {
              UsernameQueryState.pendingAccountUsernameResult = TextInputRenderer.createSuggestedUsernameQuery(28, suggestions);
              return;
            }
            UsernameQueryState.pendingAccountUsernameResult = RankedComparisonSupport.createUsernameResponseQuery(candidateText, responseCode, false);
            return;
          }
          acceptedQueryGuard = -106;
          if (StatefulWidgetRenderer.accountCreationAgeYears >= 13) {
            under13Snapshot = false;
          } else {
            under13Snapshot = true;
          }
          UsernameQueryState.pendingAccountUsernameResult = UiFontResources.createAcceptedUsernameQuery(acceptedQueryGuard, under13Snapshot);
          return;
        } catch (java.lang.RuntimeException responseFailure) {
          caughtResponseFailure = responseFailure;
          responseFailureForContext = caughtResponseFailure;
          responseFailureBeforeContext = responseFailureForContext;
          responseMessagePrefix = new StringBuilder().append("gj.A(");
          if (candidateText == null) {
            candidateDescription = "null";
          } else {
            candidateDescription = "{...}";
          }
          responseMessageBeforeSuggestions = ((StringBuilder) (Object) responseMessagePrefix).append(candidateDescription).append(',').append(responseCode).append(',').append(methodGuard).append(',');
          if (suggestions == null) {
            suggestionsDescription = "null";
          } else {
            suggestionsDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) responseFailureBeforeContext), ((StringBuilder) (Object) responseMessageBeforeSuggestions).append(suggestionsDescription).append(')').toString());
        }
    }

    final Object getReferent(byte methodGuard) {
        if (methodGuard <= 50) {
            String[] unusedNullSuggestions = (String[]) null;
            StrongCacheReference.publishAccountUsernameResult((String) null, 21, (byte) -91, (String[]) null);
            return this.referent;
        }
        return this.referent;
    }

    final boolean requiresStrongPromotion(int methodGuard) {
        if (methodGuard != 13) {
            return true;
        }
        return false;
    }

    final static void drawSpecialAttachedEntities(byte methodGuard) {
        GameplayEntity attachedEntity = null;
        int clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
            attachedEntity = (GameplayEntity) ((Object) BoardEntityState.attachedEntities.firstForIteration(0));
            while (attachedEntity != null) {
                if (attachedEntity.entitySpriteKindId != 0) {
                    attachedEntity.drawEntityAtPosition(1643839728);
                }
                attachedEntity = (GameplayEntity) ((Object) BoardEntityState.attachedEntities.nextForIteration(1));
            }
            if (methodGuard > -33) {
                StrongCacheReference.drawSpecialAttachedEntities((byte) 90);
                return;
            }
        } catch (RuntimeException entityDrawFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) entityDrawFailure), "gj.B(" + methodGuard + ')');
        }
    }

    public static void releaseStrongReferenceResources(int methodGuard) {
        if (methodGuard != -1) {
            StrongCacheReference.releaseStrongReferenceResources(-23);
            archiveConnectTask = null;
            loginRegisterText = null;
            return;
        }
        archiveConnectTask = null;
        loginRegisterText = null;
    }

    StrongCacheReference(Object referent, int entryWeight) {
        super(entryWeight);
        try {
            this.referent = referent;
        } catch (RuntimeException referenceInitializationFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) referenceInitializationFailure), "gj.<init>(" + (referent != null ? "{...}" : "null") + ',' + entryWeight + ')');
        }
    }

    static {
        loginRegisterText = "Login / Register";
    }
}
