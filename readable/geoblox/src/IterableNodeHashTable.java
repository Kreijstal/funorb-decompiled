/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class IterableNodeHashTable implements Iterable {
    IntrusiveNode[] bucketSentinels;
    static int avatarBlinkClockTicks;
    static ClientProtocolStage requestReadyStage;
    private IntrusiveNode lookupCursor;
    int bucketCount;
    static int[] transformedMeshNormalZ;

    public final Iterator iterator() {
        return (Iterator) ((Object) new NodeHashTableIterator((IterableNodeHashTable) (this)));
    }

    final static void refreshLoginTicketMessage(int methodGuard) {
        int ticketCountFromSessionAccessByte;
        int clientControlSnapshot;
        clientControlSnapshot = Geoblox.clientControlFlowFlag;
        MeshPrioritySupport.field_d = false;
        if (methodGuard != -12618) {
          return;
        }
        TextWidgetRenderer.unreadTicketMessage = null;
        if (AgeValidator.field_i) {
          Geoblox.activeMessageDialog.showConnectionRestoredContent(false);
        } else {
          ticketCountFromSessionAccessByte = EntityLinkSupport.sessionAccessLevelByte;
          if (ticketCountFromSessionAccessByte > 0) {
            if (1 == ticketCountFromSessionAccessByte) {
              TextWidgetRenderer.unreadTicketMessage = EntityContactSupport.ticketingOneUnreadText;
            } else {
              TextWidgetRenderer.unreadTicketMessage = OpacityWidget.a(SecondaryNodeDeque.ticketingUnreadCountText, new String[]{Integer.toString(ticketCountFromSessionAccessByte)}, (byte) -124);
            }
            TextWidgetRenderer.unreadTicketMessage = NameCharacterSupport.joinTextParts(-11455, new CharSequence[]{(CharSequence) ((Object) TextWidgetRenderer.unreadTicketMessage), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) PacketByteCipher.ticketingGoToWebsiteText)});
          }
          Geoblox.activeMessageDialog.dismissDialog((byte) -104);
          StatefulWidgetRenderer.showAccountProgressDialog(520);
        }
    }

    final void put(long key, int methodGuard, IntrusiveNode node) {
        IntrusiveNode bucketSentinel = null;
        try {
            if (!(node.previousNode == null)) {
                node.unlinkNode(false);
            }
            bucketSentinel = this.bucketSentinels[(int)((long)(-1 + this.bucketCount) & key)];
            node.previousNode = bucketSentinel.previousNode;
            if (methodGuard > -48) {
                transformedMeshNormalZ = (int[]) null;
            }
            node.nextNode = bucketSentinel;
            node.previousNode.nextNode = node;
            node.nodeKey = key;
            node.nextNode.previousNode = node;
        } catch (RuntimeException insertionFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) insertionFailure), "gi.H(" + key + ',' + methodGuard + ',' + (node != null ? "{...}" : "null") + ')');
        }
    }

    final static MonochromeBitmapFont loadBitmapFont(ResourceArchive fontMetricsArchive, int methodGuard, ResourceArchive glyphGraphicsArchive, String resourceName, String groupName) {
        int archiveGroupId = 0;
        RuntimeException fontFailureForContext = null;
        int archiveFileId = 0;
        MonochromeBitmapFont fontBeforeReturn = null;
        RuntimeException fontFailureBeforeDescriptions = null;
        StringBuilder fontMessagePrefix = null;
        String metricsArchiveDescription = null;
        StringBuilder fontMessageAfterFirstDescription = null;
        String glyphArchiveDescription = null;
        StringBuilder fontMessageAfterSecondDescription = null;
        String resourceNameDescription = null;
        StringBuilder fontMessageAfterThirdDescription = null;
        String groupNameDescription = null;
        RuntimeException caughtFontFailure = null;
        try {
          archiveGroupId = glyphGraphicsArchive.findGroupId((byte) 126, groupName);
          if (methodGuard != 1) {
            transformedMeshNormalZ = (int[]) null;
          }
          archiveFileId = glyphGraphicsArchive.findFileId(resourceName, methodGuard ^ -82, archiveGroupId);
          fontBeforeReturn = FontLoadingSupport.loadMonochromeFontById(archiveFileId, 0, glyphGraphicsArchive, archiveGroupId, fontMetricsArchive);
          return fontBeforeReturn;
        } catch (java.lang.RuntimeException fontFailure) {
          caughtFontFailure = fontFailure;
          fontFailureForContext = caughtFontFailure;
          fontFailureBeforeDescriptions = fontFailureForContext;
          fontMessagePrefix = new StringBuilder().append("gi.E(");
          if (fontMetricsArchive == null) {
            metricsArchiveDescription = "null";
          } else {
            metricsArchiveDescription = "{...}";
          }
          fontMessageAfterFirstDescription = ((StringBuilder) (Object) fontMessagePrefix).append(metricsArchiveDescription).append(',').append(methodGuard).append(',');
          if (glyphGraphicsArchive == null) {
            glyphArchiveDescription = "null";
          } else {
            glyphArchiveDescription = "{...}";
          }
          fontMessageAfterSecondDescription = ((StringBuilder) (Object) fontMessageAfterFirstDescription).append(glyphArchiveDescription).append(',');
          if (resourceName == null) {
            resourceNameDescription = "null";
          } else {
            resourceNameDescription = "{...}";
          }
          fontMessageAfterThirdDescription = ((StringBuilder) (Object) fontMessageAfterSecondDescription).append(resourceNameDescription).append(',');
          if (groupName == null) {
            groupNameDescription = "null";
          } else {
            groupNameDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) fontFailureBeforeDescriptions), ((StringBuilder) (Object) fontMessageAfterThirdDescription).append(groupNameDescription).append(')').toString());
        }
    }

    final static void drawHalfBlendSolidTriangle(int vertexCX, int guard, int vertexCY, int vertexAY, int vertexAX, int vertexBX, int vertexBY, int halfRgb) {
        int controlFlagSnapshot;
        controlFlagSnapshot = Geoblox.clientControlFlowFlag;
        if (vertexBY >= vertexAY) {
          if (vertexCY > vertexBY) {
            NetworkArchiveRequest.drawSortedHalfBlendSolidTriangle(vertexBX, vertexAX, halfRgb, 110, SoftwareRasterizer.framebuffer, vertexCY, vertexCX, vertexBY, vertexAY);
          } else {
            if (vertexAY < vertexCY) {
              NetworkArchiveRequest.drawSortedHalfBlendSolidTriangle(vertexCX, vertexAX, halfRgb, 127, SoftwareRasterizer.framebuffer, vertexBY, vertexBX, vertexCY, vertexAY);
            } else {
              NetworkArchiveRequest.drawSortedHalfBlendSolidTriangle(vertexAX, vertexCX, halfRgb, 120, SoftwareRasterizer.framebuffer, vertexBY, vertexBX, vertexAY, vertexCY);
            }
          }
        } else {
          if (vertexAY < vertexCY) {
            NetworkArchiveRequest.drawSortedHalfBlendSolidTriangle(vertexAX, vertexBX, halfRgb, 116, SoftwareRasterizer.framebuffer, vertexCY, vertexCX, vertexAY, vertexBY);
          } else {
            if (vertexCY > vertexBY) {
              NetworkArchiveRequest.drawSortedHalfBlendSolidTriangle(vertexCX, vertexBX, halfRgb, -110, SoftwareRasterizer.framebuffer, vertexAY, vertexAX, vertexCY, vertexBY);
            } else {
              NetworkArchiveRequest.drawSortedHalfBlendSolidTriangle(vertexBX, vertexCX, halfRgb, -102, SoftwareRasterizer.framebuffer, vertexAY, vertexAX, vertexBY, vertexCY);
            }
          }
        }
        if (guard < -102) {
          return;
        }
        IterableNodeHashTable.releaseSharedResources(-38);
    }

    final static void reportClientError(Throwable failure, String context, byte methodGuard) {
        try {
            PlatformTaskDispatcher dispatcherSnapshot;
            int urlRequestGuard;
            java.net.URL unusedUrlReceiverBeforeIdentity;
            java.net.URL unusedUrlConstructorReceiverBeforeIdentity;
            java.net.URL appletCodeBase;
            StringBuilder errorUrlPrefix;
            java.net.URL unusedUrlReceiverAfterIdentity;
            java.net.URL unusedUrlConstructorReceiverAfterIdentity;
            String reportUserIdentity;
            Throwable caughtReportFailure = null;
            String errorDescription = null;
            Exception ignoredReportFailure = null;
            PlatformTask urlStreamTask = null;
            DataInputStream responseStream = null;
            String colonEscapedDescription = null;
            String atSignEscapedDescription = null;
            String ampersandEscapedDescription = null;
            String hashEscapedDescription = null;
            try {
              errorDescription = "";
              if (failure != null) {
                errorDescription = GameApplet.a(failure, methodGuard - 124);
              }
              if (context != null) {
                if (failure != null) {
                  errorDescription = errorDescription + " | ";
                }
                errorDescription = errorDescription + context;
              }
              DequeCursor.a(errorDescription, (byte) -75);
              colonEscapedDescription = TextTemplateDefinition.a(errorDescription, "%3a", true, ":");
              atSignEscapedDescription = TextTemplateDefinition.a(colonEscapedDescription, "%40", true, "@");
              ampersandEscapedDescription = TextTemplateDefinition.a(atSignEscapedDescription, "%26", true, "&");
              hashEscapedDescription = TextTemplateDefinition.a(ampersandEscapedDescription, "%23", true, "#");
              if (null == GameScreen.errorReportApplet) {
                return;
              }
              dispatcherSnapshot = SpriteButtonRenderer.field_s;
              urlRequestGuard = -14;
              unusedUrlReceiverBeforeIdentity = null;
              unusedUrlConstructorReceiverBeforeIdentity = null;
              appletCodeBase = GameScreen.errorReportApplet.getCodeBase();
              errorUrlPrefix = new StringBuilder().append("clienterror.ws?c=").append(SocketArchiveNetworkClient.field_t).append("&u=");
              if (null == UsernameAvailabilityValidator.field_p) {
                unusedUrlReceiverAfterIdentity = null;
                unusedUrlConstructorReceiverAfterIdentity = null;
                reportUserIdentity = "" + CheckboxWidget.field_H;
              } else {
                unusedUrlReceiverAfterIdentity = null;
                unusedUrlConstructorReceiverAfterIdentity = null;
                reportUserIdentity = UsernameAvailabilityValidator.field_p;
              }
              urlStreamTask = ((PlatformTaskDispatcher) (Object) dispatcherSnapshot).requestUrlStream(urlRequestGuard, new java.net.URL(appletCodeBase, ((StringBuilder) (Object) errorUrlPrefix).append(reportUserIdentity).append("&v1=").append(PlatformTaskDispatcher.javaVendor).append("&v2=").append(PlatformTaskDispatcher.javaVersion).append("&e=").append(hashEscapedDescription).toString()));
              while (urlStreamTask.status == 0) {
                ByteTextDecodingSupport.sleepMillis(methodGuard - 125, 1L);
              }
              if (urlStreamTask.status == 1) {
                responseStream = (DataInputStream) (urlStreamTask.result);
                responseStream.read();
                responseStream.close();
              }
            } catch (java.lang.Exception reportFailureAtCatch) {
              caughtReportFailure = reportFailureAtCatch;
              ignoredReportFailure = (Exception) (Object) caughtReportFailure;
            }
            if (methodGuard == 125) {
              return;
            }
            IterableNodeHashTable.releaseSharedResources(-109);
        } catch (RuntimeException | Error uncheckedReportFailure) {
            throw uncheckedReportFailure;
        } catch (Throwable checkedReportFailure) {
            throw new RuntimeException(checkedReportFailure);
        }
    }

    final static int powerInt(int exponent, byte methodGuard, int base) {
        int accumulatedProduct = 0;
        RuntimeException powerFailure = null;
        int guardResidue = 0;
        int finalProduct = 0;
        int completedProduct = 0;
        RuntimeException caughtPowerFailure = null;
        try {
          accumulatedProduct = 1;
          while (exponent > 1) {
            if (0 != (exponent & 1)) {
              accumulatedProduct = accumulatedProduct * base;
            }
            exponent = exponent >> 1;
            base = base * base;
          }
          guardResidue = 28 % ((-75 - methodGuard) / 49);
          if (exponent != 1) {
            completedProduct = accumulatedProduct;
            return completedProduct;
          }
          finalProduct = base * accumulatedProduct;
          return finalProduct;
        } catch (java.lang.RuntimeException powerFailureAtCatch) {
          caughtPowerFailure = powerFailureAtCatch;
          powerFailure = caughtPowerFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) powerFailure), "gi.A(" + exponent + ',' + methodGuard + ',' + base + ')');
        }
    }

    public static void releaseSharedResources(int methodGuard) {
        if (methodGuard != -1) {
            return;
        }
        requestReadyStage = null;
        transformedMeshNormalZ = null;
    }

    private IterableNodeHashTable() throws Throwable {
        throw new Error();
    }

    final IntrusiveNode findByKey(long key, byte methodGuard) {
        int guardResidue;
        IntrusiveNode bucketSentinel;
        IntrusiveNode matchingNode;
        int clientControlSnapshot;
        clientControlSnapshot = Geoblox.clientControlFlowFlag;
        guardResidue = -95 / ((methodGuard + 9) / 43);
        bucketSentinel = this.bucketSentinels[(int)((long)(-1 + this.bucketCount) & key)];
        this.lookupCursor = bucketSentinel.nextNode;
        while (true) {
          if (this.lookupCursor == bucketSentinel) {
            this.lookupCursor = null;
            return null;
          }
          if (~this.lookupCursor.nodeKey != ~key) {
            this.lookupCursor = this.lookupCursor.nextNode;
            continue;
          }
          break;
        }
        matchingNode = this.lookupCursor;
        this.lookupCursor = this.lookupCursor.nextNode;
        return matchingNode;
    }

    static {
        avatarBlinkClockTicks = 0;
        requestReadyStage = new ClientProtocolStage();
        transformedMeshNormalZ = new int[8192];
    }
}
