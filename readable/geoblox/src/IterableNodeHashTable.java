/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class IterableNodeHashTable implements Iterable {
    IntrusiveNode[] field_a;
    static int avatarBlinkClockTicks;
    static ClientProtocolStage requestReadyStage;
    private IntrusiveNode field_f;
    int field_c;
    static int[] transformedMeshNormalZ;

    public final Iterator iterator() {
        return (Iterator) ((Object) new NodeHashTableIterator((IterableNodeHashTable) (this)));
    }

    final static void b(int param0) {
        int var1;
        int var2;
        var2 = Geoblox.clientControlFlowFlag;
        MeshPrioritySupport.field_d = false;
        if (param0 != -12618) {
          return;
        }
        TextWidgetRenderer.field_d = null;
        if (AgeValidator.field_i) {
          Geoblox.activeMessageDialog.showConnectionRestoredContent(false);
        } else {
          var1 = EntityLinkSupport.field_a;
          if (var1 > 0) {
            if (1 == var1) {
              TextWidgetRenderer.field_d = EntityContactSupport.ticketingOneUnreadText;
            } else {
              TextWidgetRenderer.field_d = OpacityWidget.a(SecondaryNodeDeque.ticketingUnreadCountText, new String[]{Integer.toString(var1)}, (byte) -124);
            }
            TextWidgetRenderer.field_d = NameCharacterSupport.joinTextParts(-11455, new CharSequence[]{(CharSequence) ((Object) TextWidgetRenderer.field_d), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) PacketByteCipher.ticketingGoToWebsiteText)});
          }
          Geoblox.activeMessageDialog.dismissDialog((byte) -104);
          StatefulWidgetRenderer.c(520);
        }
    }

    final void a(long param0, int param1, IntrusiveNode param2) {
        IntrusiveNode var5 = null;
        try {
            if (!(param2.previousNode == null)) {
                param2.unlinkNode(false);
            }
            var5 = this.field_a[(int)((long)(-1 + this.field_c) & param0)];
            param2.previousNode = var5.previousNode;
            if (param1 > -48) {
                transformedMeshNormalZ = (int[]) null;
            }
            param2.nextNode = var5;
            param2.previousNode.nextNode = param2;
            param2.field_a = param0;
            param2.nextNode.previousNode = param2;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "gi.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
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
        IterableNodeHashTable.a(-38);
    }

    final static void a(Throwable param0, String param1, byte param2) {
        try {
            PlatformTaskDispatcher stackIn_13_0;
            int stackIn_13_1;
            java.net.URL stackIn_13_2;
            java.net.URL stackIn_13_3;
            java.net.URL stackIn_13_4;
            StringBuilder stackIn_13_5;
            java.net.URL stackIn_14_2;
            java.net.URL stackIn_14_3;
            String stackIn_14_6;
            Throwable decompiledCaughtException = null;
            String var3 = null;
            Exception var3_ref = null;
            PlatformTask var4 = null;
            DataInputStream var5 = null;
            String var6 = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            try {
              var3 = "";
              if (param0 != null) {
                var3 = GameApplet.a(param0, param2 - 124);
              }
              if (param1 != null) {
                if (param0 != null) {
                  var3 = var3 + " | ";
                }
                var3 = var3 + param1;
              }
              DequeCursor.a(var3, (byte) -75);
              var6 = TextTemplateDefinition.a(var3, "%3a", true, ":");
              var7 = TextTemplateDefinition.a(var6, "%40", true, "@");
              var8 = TextTemplateDefinition.a(var7, "%26", true, "&");
              var9 = TextTemplateDefinition.a(var8, "%23", true, "#");
              if (null == GameScreen.errorReportApplet) {
                return;
              }
              stackIn_13_0 = SpriteButtonRenderer.field_s;
              stackIn_13_1 = -14;
              stackIn_13_2 = null;
              stackIn_13_3 = null;
              stackIn_13_4 = GameScreen.errorReportApplet.getCodeBase();
              stackIn_13_5 = new StringBuilder().append("clienterror.ws?c=").append(SocketArchiveNetworkClient.field_t).append("&u=");
              if (null == UsernameAvailabilityValidator.field_p) {
                stackIn_14_2 = null;
                stackIn_14_3 = null;
                stackIn_14_6 = "" + CheckboxWidget.field_H;
              } else {
                stackIn_14_2 = null;
                stackIn_14_3 = null;
                stackIn_14_6 = UsernameAvailabilityValidator.field_p;
              }
              var4 = ((PlatformTaskDispatcher) (Object) stackIn_13_0).requestUrlStream(stackIn_13_1, new java.net.URL(stackIn_13_4, ((StringBuilder) (Object) stackIn_13_5).append(stackIn_14_6).append("&v1=").append(PlatformTaskDispatcher.javaVendor).append("&v2=").append(PlatformTaskDispatcher.javaVersion).append("&e=").append(var9).toString()));
              while (var4.status == 0) {
                ByteTextDecodingSupport.sleepMillis(param2 - 125, 1L);
              }
              if (var4.status == 1) {
                var5 = (DataInputStream) (var4.result);
                var5.read();
                var5.close();
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = (Exception) (Object) decompiledCaughtException;
            }
            if (param2 == 125) {
              return;
            }
            IterableNodeHashTable.a(-109);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 1;
          while (param0 > 1) {
            if (0 != (param0 & 1)) {
              var3_int = var3_int * param2;
            }
            param0 = param0 >> 1;
            param2 = param2 * param2;
          }
          var4 = 28 % ((-75 - param1) / 49);
          if (param0 != 1) {
            stackIn_10_0 = var3_int;
            return stackIn_10_0;
          }
          stackIn_8_0 = param2 * var3_int;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var3), "gi.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
            return;
        }
        requestReadyStage = null;
        transformedMeshNormalZ = null;
    }

    private IterableNodeHashTable() throws Throwable {
        throw new Error();
    }

    final IntrusiveNode a(long param0, byte param1) {
        int var4;
        IntrusiveNode var5;
        IntrusiveNode var6;
        int var7;
        var7 = Geoblox.clientControlFlowFlag;
        var4 = -95 / ((param1 + 9) / 43);
        var5 = this.field_a[(int)((long)(-1 + this.field_c) & param0)];
        this.field_f = var5.nextNode;
        while (true) {
          if (this.field_f == var5) {
            this.field_f = null;
            return null;
          }
          if (~this.field_f.field_a != ~param0) {
            this.field_f = this.field_f.nextNode;
            continue;
          }
          var6 = this.field_f;
          this.field_f = this.field_f.nextNode;
          return var6;
        }
    }

    static {
        avatarBlinkClockTicks = 0;
        requestReadyStage = new ClientProtocolStage();
        transformedMeshNormalZ = new int[8192];
    }
}
