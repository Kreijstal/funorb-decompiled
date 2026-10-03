/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TextInputValidator extends ib implements ga {
    static uj field_h;
    static double field_f;
    private dj validatedInput;

    final static void a(byte param0, boolean param1) {
        if (param0 < 102) {
            return;
        }
        b.a(false, param1, false);
    }

    final lh currentValidationState(int guard) {
        if (guard != 32) {
            return (lh) null;
        }
        return this.validationStateForText(-257, this.validatedInput.field_s);
    }

    public final boolean a(int param0) {
        if (param0 != -26556) {
            String var3 = (String) null;
            this.validationMessageForText(-33, (String) null);
            if (this.validatedInput.field_s != null) {
                return this.validatedInput.field_s.length() == 0 ? true : false;
            }
            return true;
        }
        if (this.validatedInput.field_s == null) {
            return true;
        }
        if (this.validatedInput.field_s.length() != 0) {
            return false;
        }
        return true;
    }

    public final void a(dj param0, int param1) {
        try {
            if (param1 != -18649) {
                this.validatedInput = (dj) null;
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
        if (pf.a(-123, param0)) {
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
            ag.archiveGameCrc = gameCrc;
            ArchiveIndex.archiveServerNumber = serverNumber;
            GameplaySession.archiveHost = archiveHost;
            hc.archiveClientId = clientId;
            pc.archiveLanguageId = languageId;
            vg.archivePort = primaryPort;
            ph.archiveTaskDispatcher = taskDispatcher;
            if (methodGuard != -23949) {
                field_f = -0.8279321027589008;
            }
            ij.alternateArchivePort = alternatePort;
            wg.archiveNetworkClient = (ArchiveNetworkClient) ((Object) new SocketArchiveNetworkClient());
            cl.archiveDiskWorker = new DiskCacheWorker(taskDispatcher);
            gb.archiveCatalog = new ArchiveCatalog(wg.archiveNetworkClient, cl.archiveDiskWorker);
        } catch (RuntimeException initializationFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) initializationFailure), "q.N(" + clientId + ',' + languageId + ',' + primaryPort + ',' + serverNumber + ',' + methodGuard + ',' + (taskDispatcher != null ? "{...}" : "null") + ',' + (archiveHost != null ? "{...}" : "null") + ',' + gameCrc + ',' + alternatePort + ')');
        }
    }

    public final void a(dj param0, byte param1) {
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
          stackIn_7_0 = (RuntimeException) (var3);
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
          va.field_d = false;
          ii.field_a = false;
          if ((null != Geoblox.field_y) &&
              (Geoblox.field_y.field_I)) {
            if (8 == param1) {
              param1 = 2;
              if (!cf.field_i) {
                param2 = mi.invalidUserOrPasswordText;
              } else {
                param2 = DualLinkNode.invalidPasswordText;
              }
              ml.field_t.a(b.field_a, 0);
            }
            var3_int = 1;
            if (param1 == 10) {
              MatchingTextValidator.c((byte) -4);
              var3_int = 0;
            }
            if (var3_int != 0) {
              if (ii.field_a) {
                param2 = wj.a(mi.connectionLostWithReasonText, new String[]{param2}, (byte) -25);
              }
              if (mi.field_I) {
                param2 = kf.pleaseTryAgainText;
              }
              Geoblox.field_y.a(param1, param0 + 19686, param2);
            }
            if ((param1 != 256) &&
                (param1 != 10) &&
                (!cf.field_i)) {
              ml.field_t.i(-119);
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
          stackIn_29_0 = (RuntimeException) (var3);
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
          fontBeforeReturn = ea.loadCoverageFontById(glyphGraphicsArchive, (byte) -127, fontMetricsArchive, archiveFileId, archiveGroupId);
          return fontBeforeReturn;
        } catch (java.lang.RuntimeException fontFailure) {
          caughtFontFailure = fontFailure;
          fontFailureForContext = caughtFontFailure;
          fontFailureBeforeDescriptions = (RuntimeException) (fontFailureForContext);
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

    abstract lh validationStateForText(int guard, String candidateText);

    final String currentValidationMessage(byte guard) {
        if (guard == -103) {
            return this.validationMessageForText(422, this.validatedInput.field_s);
        }
        this.validatedInput = (dj) null;
        return this.validationMessageForText(422, this.validatedInput.field_s);
    }

    public static void f(int param0) {
        field_h = null;
        if (param0 != 1) {
            field_h = (uj) null;
        }
    }

    TextInputValidator(dj validatedInput) {
        try {
            this.validatedInput = validatedInput;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "q.<init>(" + (validatedInput != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = new uj();
        field_f = Math.atan2(1.0, 0.0);
    }
}
