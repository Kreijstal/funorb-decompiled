/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TextInputValidator extends DebouncedValidationProvider implements TextInputListener {
    static FullscreenFailureReason field_h;
    static double field_f;
    private TextInputWidget validatedInput;

    final static void a(byte param0, boolean param1) {
        if (param0 < 102) {
            return;
        }
        b.a(false, param1, false);
    }

    final ValidationState currentValidationState(int guard) {
        if (guard != 32) {
            return (ValidationState) null;
        }
        return this.validationStateForText(-257, this.validatedInput.widgetText);
    }

    public final boolean a(int param0) {
        if (param0 != -26556) {
            String var3 = (String) null;
            this.validationMessageForText(-33, (String) null);
            if (this.validatedInput.widgetText != null) {
                return this.validatedInput.widgetText.length() == 0 ? true : false;
            }
            return true;
        }
        if (this.validatedInput.widgetText == null) {
            return true;
        }
        if (this.validatedInput.widgetText.length() != 0) {
            return false;
        }
        return true;
    }

    public final void a(TextInputWidget param0, int param1) {
        try {
            if (param1 != -18649) {
                this.validatedInput = (TextInputWidget) null;
            }
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "q.S(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    abstract String validationMessageForText(int guard, String candidateText);

    final static boolean a(char param0, byte param1) {
        if (!(!Character.isISOControl(param0))) {
            return false;
        }
        if (LoginPanel.a(-123, param0)) {
            return true;
        }
        if (param0 == 45) {
            return true;
        }
        if (param0 == 160) {
            return true;
        }
        if (32 == param0) {
            return true;
        }
        if (param0 == 95) {
            return true;
        }
        if (param1 > 88) {
            return false;
        }
        return false;
    }

    final static void initializeArchiveServices(int clientId, int languageId, int primaryPort, int serverNumber, int methodGuard, PlatformTaskDispatcher taskDispatcher, String archiveHost, int gameCrc, int alternatePort) {
        try {
            EmailValidator.archiveGameCrc = gameCrc;
            ArchiveIndex.archiveServerNumber = serverNumber;
            GameplaySession.archiveHost = archiveHost;
            ValidatedTextInputWidget.archiveClientId = clientId;
            MidiNote.archiveLanguageId = languageId;
            SecondaryNodeHashTable.archivePort = primaryPort;
            ByteShortQuery.archiveTaskDispatcher = taskDispatcher;
            if (methodGuard != -23949) {
                field_f = -0.8279321027589008;
            }
            FullscreenErrorDialog.alternateArchivePort = alternatePort;
            AsyncResourceDownloader.archiveNetworkClient = (ArchiveNetworkClient) ((Object) new SocketArchiveNetworkClient());
            cl.archiveDiskWorker = new DiskCacheWorker(taskDispatcher);
            DequeCursor.archiveCatalog = new ArchiveCatalog(AsyncResourceDownloader.archiveNetworkClient, cl.archiveDiskWorker);
        } catch (RuntimeException initializationFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) initializationFailure), "q.N(" + clientId + ',' + languageId + ',' + primaryPort + ',' + serverNumber + ',' + methodGuard + ',' + (taskDispatcher != null ? "{...}" : "null") + ',' + (archiveHost != null ? "{...}" : "null") + ',' + gameCrc + ',' + alternatePort + ')');
        }
    }

    public final void a(TextInputWidget param0, byte param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != 74) {
            this.a(-117);
            this.b(-28133);
          } else {
            this.b(-28133);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("q.J(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(byte param0, int param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          MeshPrioritySupport.field_d = false;
          ArchiveLoadStep.field_a = false;
          if ((null != Geoblox.activeMessageDialog) &&
              (Geoblox.activeMessageDialog.dialogVisible)) {
            if (8 == param1) {
              param1 = 2;
              if (!AgeValidator.field_i) {
                param2 = VisualPropertyOverrides.invalidUserOrPasswordText;
              } else {
                param2 = DualLinkNode.invalidPasswordText;
              }
              SpriteButtonRenderer.field_t.a(b.field_a, 0);
            }
            var3_int = 1;
            if (param1 == 10) {
              MatchingTextValidator.c((byte) -4);
              var3_int = 0;
            }
            if (var3_int != 0) {
              if (ArchiveLoadStep.field_a) {
                param2 = OpacityWidget.a(VisualPropertyOverrides.connectionLostWithReasonText, new String[]{param2}, (byte) -25);
              }
              if (VisualPropertyOverrides.field_I) {
                param2 = kf.pleaseTryAgainText;
              }
              Geoblox.activeMessageDialog.installErrorContent(param1, param0 + 19686, param2);
            }
            if ((param1 != 256) &&
                (param1 != 10) &&
                (!AgeValidator.field_i)) {
              SpriteButtonRenderer.field_t.i(-119);
            }
          }
          if (param0 == 124) {
            return;
          }
          var4 = (String) null;
          TextInputValidator.initializeArchiveServices(-94, -21, 56, -5, 62, (PlatformTaskDispatcher) null, (String) null, -54, -101);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_29_0 = var3;
          stackIn_29_1 = new StringBuilder().append("q.O(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final static CoverageBitmapFont loadCoverageFont(ResourceArchive fontMetricsArchive, int methodGuard, String resourceName, String groupName, ResourceArchive glyphGraphicsArchive) {
        int archiveGroupId = 0;
        RuntimeException fontFailureForContext = null;
        int archiveFileId = 0;
        String unusedNullTextSnapshot = null;
        CoverageBitmapFont fontBeforeReturn = null;
        RuntimeException fontFailureBeforeDescriptions = null;
        StringBuilder fontMessagePrefix = null;
        String metricsArchiveDescription = null;
        StringBuilder fontMessageBeforeResourceName = null;
        String resourceNameDescription = null;
        StringBuilder fontMessageBeforeGroupName = null;
        String groupNameDescription = null;
        StringBuilder fontMessageBeforeGlyphArchive = null;
        String glyphArchiveDescription = null;
        RuntimeException caughtFontFailure = null;
        try {
          if (methodGuard != 1) {
            unusedNullTextSnapshot = (String) null;
            TextInputValidator.a((byte) 108, 111, (String) null);
          }
          archiveGroupId = glyphGraphicsArchive.findGroupId((byte) 126, groupName);
          archiveFileId = glyphGraphicsArchive.findFileId(resourceName, methodGuard - 69, archiveGroupId);
          fontBeforeReturn = IntArrayQuery.loadCoverageFontById(glyphGraphicsArchive, (byte) -127, fontMetricsArchive, archiveFileId, archiveGroupId);
          return fontBeforeReturn;
        } catch (java.lang.RuntimeException fontFailure) {
          caughtFontFailure = fontFailure;
          fontFailureForContext = caughtFontFailure;
          fontFailureBeforeDescriptions = fontFailureForContext;
          fontMessagePrefix = new StringBuilder().append("q.R(");
          if (fontMetricsArchive == null) {
            metricsArchiveDescription = "null";
          } else {
            metricsArchiveDescription = "{...}";
          }
          fontMessageBeforeResourceName = ((StringBuilder) (Object) fontMessagePrefix).append(metricsArchiveDescription).append(',').append(methodGuard).append(',');
          if (resourceName == null) {
            resourceNameDescription = "null";
          } else {
            resourceNameDescription = "{...}";
          }
          fontMessageBeforeGroupName = ((StringBuilder) (Object) fontMessageBeforeResourceName).append(resourceNameDescription).append(',');
          if (groupName == null) {
            groupNameDescription = "null";
          } else {
            groupNameDescription = "{...}";
          }
          fontMessageBeforeGlyphArchive = ((StringBuilder) (Object) fontMessageBeforeGroupName).append(groupNameDescription).append(',');
          if (glyphGraphicsArchive == null) {
            glyphArchiveDescription = "null";
          } else {
            glyphArchiveDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) fontFailureBeforeDescriptions), ((StringBuilder) (Object) fontMessageBeforeGlyphArchive).append(glyphArchiveDescription).append(')').toString());
        }
    }

    abstract ValidationState validationStateForText(int guard, String candidateText);

    final String currentValidationMessage(byte guard) {
        if (guard == -103) {
            return this.validationMessageForText(422, this.validatedInput.widgetText);
        }
        this.validatedInput = (TextInputWidget) null;
        return this.validationMessageForText(422, this.validatedInput.widgetText);
    }

    public static void f(int param0) {
        field_h = null;
        if (param0 != 1) {
            field_h = (FullscreenFailureReason) null;
        }
    }

    TextInputValidator(TextInputWidget validatedInput) {
        try {
            this.validatedInput = validatedInput;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "q.<init>(" + (validatedInput != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = new FullscreenFailureReason();
        field_f = Math.atan2(1.0, 0.0);
    }
}
