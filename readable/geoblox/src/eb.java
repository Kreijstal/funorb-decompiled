/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb {
    float field_j;
    static Sprite[] mouseBoxFrames;
    private int field_c;
    private ii[] field_a;
    String field_e;
    static String field_f;
    private int field_d;
    static long archiveHandshakeDeadlineMillis;
    static int field_i;
    private int field_h;

    private final void a(int param0, ii param1, int param2) {
        float var4_float = 0.0f;
        try {
            var4_float = (float)(this.field_h + 1) + (float)param0 / 100.0f;
            if (param2 > -90) {
                String var5 = (String) null;
                eb.a((java.applet.Applet) null, (byte) 114, (String) null);
            }
            if (param0 == 0) {
                this.field_e = param1.field_g;
            } else {
                this.field_e = param1.field_m + " - " + param0 + "%";
            }
            this.field_j = var4_float * (float)this.field_c / (float)(1 + this.field_d);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "eb.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        field_f = null;
        mouseBoxFrames = null;
        if (param0 <= -68) {
            return;
        }
        eb.handleArchiveHandshakeFailure(-101, -31);
    }

    final boolean a(boolean param0) {
        int var3;
        String var4;
        ii var5;
        var3 = Geoblox.clientControlFlowFlag;
        if (!param0) {
          var4 = (String) null;
          eb.a((java.applet.Applet) null, (byte) -56, (String) null);
        }
        while (this.field_h < this.field_d) {
          var5 = this.field_a[this.field_h];
          if (!var5.field_i.ensureIndexLoaded(0)) {
            this.a(0, var5, -123);
            return false;
          }
          if ((var5.field_l >= 0) &&
              (!var5.field_i.loadGroupIfNeeded((byte) 102, var5.field_l))) {
            this.a(var5.field_i.getGroupProgress((byte) 36, var5.field_l), var5, -119);
            return false;
          }
          if ((null != var5.field_f) &&
              (!var5.field_i.loadGroupByName(var5.field_f, (byte) -126))) {
            this.a(var5.field_i.getGroupProgressByName(0, var5.field_f), var5, -123);
            return false;
          }
          if ((var5.field_l < 0) &&
              (var5.field_f == null) &&
              (null != var5.field_m) &&
              (!var5.field_i.loadAllGroups(true))) {
            this.a(var5.field_i.getLoadProgress((byte) 106), var5, -108);
            return false;
          }
          this.field_h = this.field_h + 1;
        }
        return true;
    }

    final static int handleArchiveHandshakeFailure(int replyCode, int methodGuard) {
        int unusedClientGuardSnapshot = Geoblox.clientControlFlowFlag;
        StrongCacheReference.archiveConnectTask = null;
        AccountCreationForm.archiveHandshakeStage = 0;
        li.archiveHandshakeSocket = null;
        int previousArchivePort = vg.archivePort;
        vg.archivePort = FullscreenErrorDialog.alternateArchivePort;
        FullscreenErrorDialog.alternateArchivePort = previousArchivePort;
        if (replyCode == 51) {
            AsyncResourceDownloader.archiveNetworkClient.failureCode = 2;
            AsyncResourceDownloader.archiveNetworkClient.failureCount = AsyncResourceDownloader.archiveNetworkClient.failureCount + 1;
            if (AsyncResourceDownloader.archiveNetworkClient.failureCount < 2) {
                if (AsyncResourceDownloader.archiveNetworkClient.failureCount >= 2 && 50 == replyCode) {
                    return 5;
                }
                if (methodGuard != 28625) {
                    field_i = -67;
                    if (!(AsyncResourceDownloader.archiveNetworkClient.failureCount < 4)) {
                        return 1;
                    }
                    return -1;
                }
                if (!(AsyncResourceDownloader.archiveNetworkClient.failureCount < 4)) {
                    return 1;
                }
                return -1;
            }
            if (!(replyCode != 51)) {
                return 2;
            }
            if (AsyncResourceDownloader.archiveNetworkClient.failureCount < 2) {
                if (methodGuard != 28625) {
                    field_i = -67;
                    if (!(AsyncResourceDownloader.archiveNetworkClient.failureCount < 4)) {
                        return 1;
                    }
                    return -1;
                }
                if (!(AsyncResourceDownloader.archiveNetworkClient.failureCount < 4)) {
                    return 1;
                }
                return -1;
            }
            if (50 == replyCode) {
                return 5;
            }
            if (methodGuard != 28625) {
                field_i = -67;
                if (!(AsyncResourceDownloader.archiveNetworkClient.failureCount < 4)) {
                    return 1;
                }
                return -1;
            }
            if (!(AsyncResourceDownloader.archiveNetworkClient.failureCount < 4)) {
                return 1;
            }
            return -1;
        }
        if (50 != replyCode) {
            AsyncResourceDownloader.archiveNetworkClient.failureCode = 1;
            AsyncResourceDownloader.archiveNetworkClient.failureCount = AsyncResourceDownloader.archiveNetworkClient.failureCount + 1;
            if (AsyncResourceDownloader.archiveNetworkClient.failureCount >= 2) {
                if (replyCode == 51) {
                    return 2;
                }
                if (AsyncResourceDownloader.archiveNetworkClient.failureCount >= 2 && 50 == replyCode) {
                    return 5;
                }
                if (methodGuard != 28625) {
                    field_i = -67;
                    if (!(AsyncResourceDownloader.archiveNetworkClient.failureCount < 4)) {
                        return 1;
                    }
                    return -1;
                }
                if (!(AsyncResourceDownloader.archiveNetworkClient.failureCount < 4)) {
                    return 1;
                }
                return -1;
            }
            if (AsyncResourceDownloader.archiveNetworkClient.failureCount >= 2 && 50 == replyCode) {
                return 5;
            }
            if (methodGuard != 28625) {
                field_i = -67;
                if (!(AsyncResourceDownloader.archiveNetworkClient.failureCount < 4)) {
                    return 1;
                }
                return -1;
            }
            if (!(AsyncResourceDownloader.archiveNetworkClient.failureCount < 4)) {
                return 1;
            }
            return -1;
        }
        AsyncResourceDownloader.archiveNetworkClient.failureCode = 5;
        AsyncResourceDownloader.archiveNetworkClient.failureCount = AsyncResourceDownloader.archiveNetworkClient.failureCount + 1;
        if (AsyncResourceDownloader.archiveNetworkClient.failureCount >= 2) {
            if (replyCode == 51) {
                return 2;
            }
            if (AsyncResourceDownloader.archiveNetworkClient.failureCount < 2) {
                if (methodGuard != 28625) {
                    field_i = -67;
                    if (!(AsyncResourceDownloader.archiveNetworkClient.failureCount < 4)) {
                        return 1;
                    }
                    return -1;
                }
                if (!(AsyncResourceDownloader.archiveNetworkClient.failureCount < 4)) {
                    return 1;
                }
                return -1;
            }
            if (50 == replyCode) {
                return 5;
            }
            if (methodGuard != 28625) {
                field_i = -67;
                if (!(AsyncResourceDownloader.archiveNetworkClient.failureCount < 4)) {
                    return 1;
                }
                return -1;
            }
            if (!(AsyncResourceDownloader.archiveNetworkClient.failureCount < 4)) {
                return 1;
            }
            return -1;
        }
        if (AsyncResourceDownloader.archiveNetworkClient.failureCount >= 2 && 50 == replyCode) {
            return 5;
        }
        if (methodGuard != 28625) {
            field_i = -67;
            if (!(AsyncResourceDownloader.archiveNetworkClient.failureCount < 4)) {
                return 1;
            }
            return -1;
        }
        if (!(AsyncResourceDownloader.archiveNetworkClient.failureCount < 4)) {
            return 1;
        }
        return -1;
    }

    final static void a(java.applet.Applet param0, byte param1, String param2) {
        try {
            java.net.URL var3 = null;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            String stackIn_9_2 = null;
            StringBuilder stackIn_11_1 = null;
            String stackIn_12_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              try {
                if (param1 <= 109) {
                  field_f = (String) null;
                }
                var3 = new java.net.URL(param0.getCodeBase(), param2);
                var3 = SessionGameApplet.a(var3, 59, param0);
                LimitedRandomAccessFile.a(var3.toString(), (byte) 64, true, param0);
                return;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3_ref = (Exception) (Object) decompiledCaughtException;
                var3_ref.printStackTrace();
                return;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
              stackIn_8_0 = var3_ref2;
              stackIn_8_1 = new StringBuilder().append("eb.C(");
              if (param0 == null) {
                stackIn_9_2 = "null";
              } else {
                stackIn_9_2 = "{...}";
              }
              stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
              if (param2 == null) {
                stackIn_12_2 = "null";
              } else {
                stackIn_12_2 = "{...}";
              }
              throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private eb() throws Throwable {
        throw new Error();
    }

    static {
        field_f = "Fetching highscores.";
        field_i = 2;
    }
}
