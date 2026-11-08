/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class BufferedSocket implements Runnable {
    static boolean field_k;
    static String field_i;
    private boolean field_l;
    private InputStream field_e;
    private OutputStream field_j;
    private PlatformTask field_n;
    static String field_g;
    private java.net.Socket field_q;
    static String field_b;
    private boolean field_p;
    static String field_a;
    private int field_c;
    private byte[] field_v;
    static Js5Archive field_d;
    private int field_m;
    static int field_r;
    static int[] field_w;
    static int[] field_h;
    static ChatMessage[] field_s;
    static String field_f;
    private int field_u;
    static int field_t;
    private PlatformTaskDispatcher field_o;

    final void readFully(int param0, byte[] param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          if (param2 != -1) {
            BufferedSocket.layoutLobbyScreen(false);
          }
          if (this.field_l) {
            return;
          }
          while (param0 > 0) {
            var5_int = this.field_e.read(param1, param3, param0);
            if (var5_int <= 0) {
              throw new EOFException();
            }
            param0 = param0 - var5_int;
            param3 = param3 + var5_int;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("el.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static ChatMessage readChatMessage(boolean param0, int param1) {
        boolean stackIn_3_0 = false;
        int stackIn_9_0 = 0;
        int[] stackIn_23_0 = null;
        Throwable decompiledCaughtException = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        CipherPacketBuffer var8 = null;
        QuickChatPhraseDefinition var9 = null;
        var7 = Virogrid.field_F ? 1 : 0;
        var8 = ProgressMessageDialog.field_qb;
        var3 = var8.readUnsignedByte(11132);
        CanvasPresentHelpers.field_h = 127 & var3;
        stackIn_3_0 = (param1 != (128 & var3));
        DrawQueueGlobals.field_b = stackIn_3_0;
        ArchiveFactoryHelpers.field_b = var8.readUnsignedByte(11132);
        IconTextComponent.field_Kb = var8.readLong((byte) -60);
        if (CanvasPresentHelpers.field_h != 2) {
          IterableDualLinkDeque.field_d = 0;
          CredentialHelpers.field_b = 0;
        } else {
          IterableDualLinkDeque.field_d = var8.readUnsignedShort((byte) -54);
          CredentialHelpers.field_b = var8.readMedium(-25842);
        }
        stackIn_9_0 = (1 != var8.readUnsignedByte(11132)) ? 0 : 1;
        var4 = stackIn_9_0;
        LoadingProgressDialog.field_hb = var8.readString(-118);
        if (var4 == 0) {
          TextureCache.field_k = LoadingProgressDialog.field_hb;
        } else {
          TextureCache.field_k = var8.readString(-118);
        }
        if (CanvasPresentHelpers.field_h != 1 &&
          4 != CanvasPresentHelpers.field_h) {
          TextHotspot.field_l = null;
          GameOptionHelpers.field_b = 0;
        } else {
          GameOptionHelpers.field_b = var8.readUnsignedShort((byte) 49);
          TextHotspot.field_l = var8.readString(-127);
        }
        if (param0) {
          var5 = var8.readUnsignedShort((byte) -77);
          try {
            var9 = ChatMessage.field_s.getDefinition((byte) 125, var5);
            QuickChatHelpHelpers.field_f = var9.getPreviewText(124);
            if (TextureCache.field_k.equals(DebouncedValidator.field_d)) {
              stackIn_23_0 = null;
            } else {
              stackIn_23_0 = var9.field_u;
            }
            StatusAndUrlHelpers.field_e = stackIn_23_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            IconLabelWidget.reportClientError("CC1", (Throwable) ((Object) var6), 1);
            StatusAndUrlHelpers.field_e = null;
            QuickChatHelpHelpers.field_f = null;
          }
        } else {
          QuickChatHelpHelpers.field_f = ClockAndTextHelpers.readCompressedChatText(128, 80, var8);
          StatusAndUrlHelpers.field_e = null;
        }
        return new ChatMessage(param0);
    }

    final static int roundUpToMultipleOfEight(int param0, int param1) {
        int var2 = 0;
        if ((param1 & 7) != 0) {
          var2 = 8 - (param1 & 7);
        }
        int var4 = 112 % ((46 - param0) / 59);
        int var3 = var2 + param1;
        return var3;
    }

    final void checkWriteError(int param0) throws IOException {
        if (param0 > -62) {
          this.field_l = true;
        }
        if (this.field_l) {
          return;
        }
        if (this.field_p) {
          this.field_p = false;
          throw new IOException();
        }
    }

    final void close(int param0) {
        try {
          int var4 = 0;
          var4 = Virogrid.field_F ? 1 : 0;
          if (this.field_l) {
            return;
          }
          synchronized (this) {
            this.field_l = true;
            this.notifyAll();
          }
          if (null != this.field_n) {
            while (this.field_n.field_a == 0) {
              IsaacRandom.sleepMillis(-64, 1L);
            }
            if (this.field_n.field_a == 1) {
              try {
                ((Thread) (this.field_n.field_f)).join();
              } catch (InterruptedException interruptedException) {
              }
            }
          }
          if (param0 != 4155) {
            field_f = (String) null;
          }
          this.field_n = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void skipPendingRequestReply(int param0) {
        if (param0 != -2) {
          return;
        }
        QueuedRequest var1 = (QueuedRequest) (PasswordLoginCredentials.field_h.first((byte) -34));
        if (var1 == null) {
          MenuInputState.closeGameConnection(false);
          return;
        }
        CipherPacketBuffer var2 = ProgressMessageDialog.field_qb;
        var2.readInt((byte) 118);
        var2.readInt((byte) 102);
        var2.readInt((byte) 99);
        var2.readInt((byte) 102);
        var1.unlink(false);
    }

    final void write(byte[] param0, int param1, int param2, int param3) throws IOException {
        int var6 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var8 = 0;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          if (this.field_l) {
            return;
          }
          if (this.field_p) {
            this.field_p = false;
            throw new IOException();
          }
          if (this.field_v == null) {
            this.field_v = new byte[this.field_m];
          }
          var5 = this;
          synchronized (var5) {
            for (var6 = param1; var6 < param3; var6++) {
              this.field_v[this.field_c] = param0[var6 + param2];
              this.field_c = (this.field_c + 1) % this.field_m;
              if (this.field_c == (this.field_m + this.field_u - 100) % this.field_m) {
                throw new IOException();
              }
            }
            if (null == this.field_n) {
              this.field_n = this.field_o.startThread(3, (Runnable) (this), param1 ^ 255);
            }
            this.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_23_0 = var5_ref;
          stackIn_23_1 = new StringBuilder().append("el.F(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void layoutLobbyScreen(boolean param0) {
        if (!param0) {
          return;
        }
        MusicVolumeAndOverlayHelpers.animateLobbyOverlayBounds(-94);
        TextDecodeHelpers.layoutLobbyPanels(CanvasPresentHelpers.field_j, NodeHashTableIterator.chatFilterIcons[0].field_u, LobbySortHelpers.field_e, PendingScoreQuery.field_k, -27, PopupMenuDrawHelpers.field_d);
    }

    protected final void finalize() {
        this.close(4155);
    }

    public static void releaseStatics(int param0) {
        if (param0 > -124) {
          return;
        }
        field_a = null;
        field_f = null;
        field_g = null;
        field_s = null;
        field_w = null;
        field_i = null;
        field_d = null;
        field_h = null;
        field_b = null;
    }

    final int available(int param0) throws IOException {
        if (this.field_l) {
          return 0;
        }
        if (param0 != 31479) {
          return 69;
        }
        return this.field_e.available();
    }

    final static void enterMainMenu(int param0, boolean param1) {
        int var2;
        int var3;
        int stackIn_16_0 = 0;
        QuickChatPhraseRegistry.field_g[2] = 0.0;
        QuickChatPhraseRegistry.field_g[0] = 1.0;
        BufferedSocket.resetCameraTargets(false, (byte) -106);
        StrongCacheReference.field_D = 262144;
        ScrollPaneWithFooter.field_Hb = 52.5f;
        ClientEnvironmentHelpers.field_k = 50.0f;
        LoginMethod.field_h = 0;
        var2 = param1 ? 1 : 0;
        var3 = LoginMethodHelpers.field_e;
        if (GameClock.field_c == 0 ||
          2 == MidiPcmStream.field_y ||
          MidiPcmStream.field_y == 3 ||
          4 == GameClock.field_c ||
          GameClock.field_c == 5) {
          var3 = GameClock.field_c;
        }
        MarkerSlider.changeScreen(-2, var3, var2 != 0, 0);
        if (param0 != 12229) {
          field_h = (int[]) null;
        }
        if (StrongCacheReference.field_E != 0 && (!(StrongCacheReference.field_E >= 10) ||
          !(StrongCacheReference.field_E < 20))) {
          stackIn_16_0 = (StrongCacheReference.field_E < 15) ? 2 : 3;
          ByteArrayPool.field_c = stackIn_16_0;
          LoginMethod.field_l = stackIn_16_0;
          PendingRequest.createGameOptions(true, (byte) 87);
        }
    }

    public final void run() {
        try {
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          Exception var1_ref = null;
          int var2 = 0;
          Object var3 = null;
          IOException var3_ref = null;
          InterruptedException var4 = null;
          int var6 = 0;
          String var7 = null;
          var6 = Virogrid.field_F ? 1 : 0;
          try {
            while (true) {
              var3 = this;
              synchronized (var3) {
                boolean decompiledFrameRemainder0 = true;
                if (this.field_u == this.field_c) {
                  if (this.field_l) {
                    decompiledRegionSelector0 = 0;
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    try {
                      this.wait();
                    } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var4 = (InterruptedException) (Object) decompiledCaughtException;
                    }
                  }
                }
                if (decompiledFrameRemainder0) {
                  if (this.field_u <= this.field_c) {
                    var1_int = this.field_c - this.field_u;
                  } else {
                    var1_int = this.field_m - this.field_u;
                  }
                  var2 = this.field_u;
                  decompiledRegionSelector0 = 1;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                try {
                  if (null != this.field_e) {
                    this.field_e.close();
                  }
                  if (this.field_j != null) {
                    this.field_j.close();
                  }
                  if (this.field_q != null) {
                    this.field_q.close();
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var1 = (IOException) (Object) decompiledCaughtException;
                }
                this.field_v = null;
                break;
              }
              if (var1_int <= 0) {
                continue;
              }
              try {
                this.field_j.write(this.field_v, var2, var1_int);
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_p = true;
              }
              this.field_u = (this.field_u + var1_int) % this.field_m;
              try {
                if (this.field_u == this.field_c) {
                  this.field_j.flush();
                }
              } catch (java.io.IOException decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_p = true;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter4) {
            decompiledCaughtException = decompiledCaughtParameter4;
            var1_ref = (Exception) (Object) decompiledCaughtException;
            var7 = (String) null;
            IconLabelWidget.reportClientError((String) null, (Throwable) ((Object) var1_ref), 1);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    BufferedSocket(java.net.Socket param0, PlatformTaskDispatcher param1) throws IOException {
        this(param0, param1, 5000);
    }

    final static void resetCameraTargets(boolean param0, byte param1) {
        SingleChildWidget.field_z = ArchiveIndex.field_o;
        BitCountAndDialogHelpers.field_c = 2;
        if (param0) {
          AsyncCheckResult.field_a = PatchNoteUsage.field_i;
          ContextMenuHelpers.field_c = ArchiveIndex.field_o;
        }
        if (param1 != -106) {
          return;
        }
        TooltipAndOptionsHelpers.field_c = PatchNoteUsage.field_i;
    }

    final int readUnsignedByte(int param0) throws IOException {
        if (param0 != -1) {
          this.field_l = false;
        }
        if (this.field_l) {
          return 0;
        }
        return this.field_e.read();
    }

    private BufferedSocket(java.net.Socket param0, PlatformTaskDispatcher param1, int param2) throws IOException {
        this.field_l = false;
        this.field_p = false;
        this.field_c = 0;
        this.field_u = 0;
        try {
          this.field_q = param0;
          this.field_o = param1;
          this.field_q.setSoTimeout(30000);
          this.field_q.setTcpNoDelay(true);
          this.field_e = this.field_q.getInputStream();
          this.field_j = this.field_q.getOutputStream();
          this.field_m = param2;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "el.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_i = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_b = "Full";
        field_r = -1;
        field_g = "Only show lobby chat from my friends";
        field_f = "Seriously offensive language";
        field_t = 2;
        field_h = new int[]{8};
        field_a = "This game option has not yet been unlocked for use.";
    }
}
