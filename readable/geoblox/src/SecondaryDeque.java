/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SecondaryDeque {
    static Sprite contactProbeRaster;
    static int contactProbeOffsetY;
    static int contactProbeOffsetX;
    static IntrusiveDeque spawnQueue;
    private DualLinkNode sentinel;
    static String receivedSessionName;
    private DualLinkNode iterationCursor;

    final DualLinkNode nextForIteration(int methodGuard) {
        int unusedIterationGuardRemainder = -123 % ((methodGuard - 21) / 32);
        DualLinkNode iterationNode = this.iterationCursor;
        if (this.sentinel != iterationNode) {
            this.iterationCursor = iterationNode.nextSecondaryNode;
            return iterationNode;
        }
        this.iterationCursor = null;
        return null;
    }

    public static void releaseSharedResources(int methodGuard) {
        contactProbeRaster = null;
        if (methodGuard != -10943) {
            receivedSessionName = (String) null;
            receivedSessionName = null;
            spawnQueue = null;
            return;
        }
        receivedSessionName = null;
        spawnQueue = null;
    }

    final void addFirst(DualLinkNode node, boolean methodGuard) {
        if (node.previousSecondaryNode != null) {
            node.unlinkSecondaryNode((byte) 45);
        }
        node.nextSecondaryNode = this.sentinel.nextSecondaryNode;
        node.previousSecondaryNode = this.sentinel;
        if (methodGuard) {
            return;
        }
        try {
            node.previousSecondaryNode.nextSecondaryNode = node;
            node.nextSecondaryNode.previousSecondaryNode = node;
        } catch (RuntimeException insertionFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) insertionFailure), "wd.L(" + (node != null ? "{...}" : "null") + ',' + methodGuard + ')');
        }
    }

    final static void settleAccountDialogAnimations(int methodGuard) {
        UsernameResponseSupport.settleAccountDialogAnimations(-120);
        if (methodGuard != 480) {
            contactProbeOffsetY = -37;
        }
    }

    final DualLinkNode removeFirst(boolean methodGuard) {
        DualLinkNode firstNode = this.sentinel.nextSecondaryNode;
        if (!methodGuard) {
            SecondaryDeque.setAvatarPositiveRotationSteering((byte) -92);
            if (this.sentinel != firstNode) {
                firstNode.unlinkSecondaryNode((byte) 65);
                return firstNode;
            }
            return null;
        }
        if (this.sentinel != firstNode) {
            firstNode.unlinkSecondaryNode((byte) 65);
            return firstNode;
        }
        return null;
    }

    final int countNodes(byte methodGuard) {
        DualLinkNode initialNodeToCount = null;
        int unusedClientGuardSnapshot = Geoblox.clientControlFlowFlag;
        int nodeCount = 0;
        DualLinkNode currentNodeToCount;
        if (methodGuard == 67) {
            initialNodeToCount = this.sentinel.nextSecondaryNode;
            while (this.sentinel != initialNodeToCount) {
                initialNodeToCount = initialNodeToCount.nextSecondaryNode;
                nodeCount++;
            }
            return nodeCount;
        }
        contactProbeRaster = (Sprite) null;
        currentNodeToCount = this.sentinel.nextSecondaryNode;
        while (this.sentinel != currentNodeToCount) {
            currentNodeToCount = currentNodeToCount.nextSecondaryNode;
            nodeCount++;
        }
        return nodeCount;
    }

    final void addLast(int methodGuard, DualLinkNode node) {
        try {
            if (node.previousSecondaryNode != null) {
                node.unlinkSecondaryNode((byte) 62);
            }
            int unusedInsertionGuardRemainder = -75 % ((methodGuard - 62) / 46);
            node.previousSecondaryNode = this.sentinel.previousSecondaryNode;
            node.nextSecondaryNode = this.sentinel;
            node.previousSecondaryNode.nextSecondaryNode = node;
            node.nextSecondaryNode.previousSecondaryNode = node;
        } catch (RuntimeException insertionFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) insertionFailure), "wd.I(" + methodGuard + ',' + (node != null ? "{...}" : "null") + ')');
        }
    }

    final static void setAvatarPositiveRotationSteering(byte methodGuard) {
        FullscreenSupport.avatarSteeringDirectionId = 2;
        if (methodGuard < 45) {
            SecondaryDeque.resendRankedListQueries(true, -75);
        }
    }

    final static void resendRankedListQueries(boolean methodGuard, int packetOpcode) {
        RuntimeException queryWriteFailureForContext = null;
        int clientControlFlowSnapshot = 0;
        RankedListQuery pendingQuery = null;
        RuntimeException caughtQueryWriteFailure = null;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
          pendingQuery = (RankedListQuery) (PendingActionMarker.pendingRankedListQueries.firstForIteration(0));
          while (pendingQuery != null) {
            EntityLinkSupport.writeRankedListQuery(pendingQuery, packetOpcode, (byte) 107);
            pendingQuery = (RankedListQuery) (PendingActionMarker.pendingRankedListQueries.nextForIteration(1));
          }
          if (methodGuard) {
            return;
          }
          contactProbeOffsetX = -80;
          return;
        } catch (java.lang.RuntimeException queryWriteFailure) {
          caughtQueryWriteFailure = queryWriteFailure;
          queryWriteFailureForContext = caughtQueryWriteFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) queryWriteFailureForContext), "wd.K(" + methodGuard + ',' + packetOpcode + ')');
        }
    }

    final static void applyCountryListGuardSideEffect(byte methodGuard, String unusedCountryListText) {
        try {
            if (methodGuard != 69) {
                contactProbeOffsetX = 99;
            }
        } catch (RuntimeException countryListGuardFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) countryListGuardFailure), "wd.F(" + methodGuard + ',' + (unusedCountryListText != null ? "{...}" : "null") + ')');
        }
    }

    public SecondaryDeque() {
        this.sentinel = new DualLinkNode();
        this.sentinel.nextSecondaryNode = this.sentinel;
        this.sentinel.previousSecondaryNode = this.sentinel;
    }

    final static LoginPayload createLoginPayload(boolean methodGuard, long longValue, String loginText, String base38Text, boolean useAlternateLongPayload) {
        RuntimeException payloadFailureForContext = null;
        AlternateLongAndTextLoginPayload alternateLongPayload = null;
        TextPairLoginPayload textPairPayload = null;
        LongAndTextLoginPayload longPayload = null;
        RuntimeException payloadFailureBeforeContext = null;
        StringBuilder payloadMessagePrefix = null;
        String loginTextDescription = null;
        StringBuilder payloadMessageBeforeBase38Text = null;
        String base38TextDescription = null;
        RuntimeException caughtPayloadFailure = null;
        try {
          if (!methodGuard) {
            receivedSessionName = (String) null;
          }
          if (longValue == 0L &&
              loginText != null) {
            textPairPayload = new TextPairLoginPayload(loginText, base38Text);
            return (LoginPayload) ((Object) textPairPayload);
          }
          if (!useAlternateLongPayload) {
            longPayload = new LongAndTextLoginPayload(longValue, base38Text);
            return (LoginPayload) ((Object) longPayload);
          }
          alternateLongPayload = new AlternateLongAndTextLoginPayload(longValue, base38Text);
          return (LoginPayload) ((Object) alternateLongPayload);
        } catch (java.lang.RuntimeException payloadFailure) {
          caughtPayloadFailure = payloadFailure;
          payloadFailureForContext = caughtPayloadFailure;
          payloadFailureBeforeContext = payloadFailureForContext;
          payloadMessagePrefix = new StringBuilder().append("wd.G(").append(methodGuard).append(',').append(longValue).append(',');
          if (loginText == null) {
            loginTextDescription = "null";
          } else {
            loginTextDescription = "{...}";
          }
          payloadMessageBeforeBase38Text = ((StringBuilder) (Object) payloadMessagePrefix).append(loginTextDescription).append(',');
          if (base38Text == null) {
            base38TextDescription = "null";
          } else {
            base38TextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) payloadFailureBeforeContext), ((StringBuilder) (Object) payloadMessageBeforeBase38Text).append(base38TextDescription).append(',').append(useAlternateLongPayload).append(')').toString());
        }
    }

    final DualLinkNode firstForIteration(byte methodGuard) {
        DualLinkNode firstNode = this.sentinel.nextSecondaryNode;
        if (firstNode == this.sentinel) {
            this.iterationCursor = null;
            return null;
        }
        this.iterationCursor = firstNode.nextSecondaryNode;
        if (methodGuard == 121) {
            return firstNode;
        }
        SecondaryDeque.releaseSharedResources(67);
        return firstNode;
    }

    static {
        contactProbeRaster = new Sprite(460, 460);
        contactProbeOffsetY = (-contactProbeRaster.fullHeight + 480) / 2;
        contactProbeOffsetX = (640 - contactProbeRaster.fullWidth) / 2;
        spawnQueue = new IntrusiveDeque();
    }
}
