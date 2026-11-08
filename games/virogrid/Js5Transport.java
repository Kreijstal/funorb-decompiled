/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class Js5Transport {
    static LoginRsaKey field_e;
    static BitmapFont arezzo12Font;
    static QuickChatMenu field_v;
    static String field_o;
    static String field_a;
    static TypeCode field_s;
    static java.security.SecureRandom field_m;
    DualLinkDeque field_i;
    static String field_r;
    DualLinkDeque field_c;
    static IndexedSprite[] field_q;
    static String field_u;
    DualLinkDeque field_p;
    DualLinkDeque field_h;
    PacketBuffer field_t;
    int field_k;
    long field_f;
    volatile int field_b;
    PacketBuffer field_n;
    volatile int field_l;
    byte field_g;
    NetworkArchiveRequest field_d;

    final static int pollServerConnection(byte param0) {
        try {
          int stackIn_9_0 = 0;
          int stackIn_15_0 = 0;
          int stackIn_24_0 = 0;
          int stackIn_28_0 = 0;
          int stackIn_33_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          PacketBuffer var2 = null;
          if (BoundedRandomAccessFile.field_e.field_l >= 4) {
            if (BoundedRandomAccessFile.field_e.field_b == -1) {
              return 3;
            }
            if (BoundedRandomAccessFile.field_e.field_b != -2) {
              return 1;
            }
            return 4;
          }
          try {
            if (param0 != 108) {
              stackIn_9_0 = -123;
              return stackIn_9_0;
            }
            if (BackgroundParticle.field_q == 0) {
              SoundPlaybackHelpers.field_b = HuffmanCodec.field_a.openSocket(AccountTermsPanel.field_G, 27402, LoginMethod.field_g);
              BackgroundParticle.field_q = BackgroundParticle.field_q + 1;
            }
            if (BackgroundParticle.field_q == 1) {
              if (2 == SoundPlaybackHelpers.field_b.field_a) {
                stackIn_15_0 = LoginCredentials.handleConnectionFailure(-1, 1);
                return stackIn_15_0;
              }
              if (SoundPlaybackHelpers.field_b.field_a == 1) {
                BackgroundParticle.field_q = BackgroundParticle.field_q + 1;
              }
            }
            if (2 == BackgroundParticle.field_q) {
              ValidationMessageWidget.field_N = new BufferedSocket((java.net.Socket) (SoundPlaybackHelpers.field_b.field_f), HuffmanCodec.field_a);
              var2 = new PacketBuffer(13);
              AchievementNotice.writeServiceHeader(WidgetContainer.field_C, var2, MarkerSliderPainter.field_l, ChecksumHelpers.field_b, 12);
              var2.writeByte(15, param0 ^ -26);
              var2.writeInt(ConnectionStage.field_c, (byte) -42);
              ValidationMessageWidget.field_N.write(var2.payload, param0 ^ 108, 0, 13);
              BackgroundParticle.field_q = BackgroundParticle.field_q + 1;
              PatchNoteUsage.field_l = ClockAndTextHelpers.monotonicMillis(-9986) + 30000L;
            }
            if (BackgroundParticle.field_q == 3) {
              if (0 < ValidationMessageWidget.field_N.available(31479)) {
                var1_int = ValidationMessageWidget.field_N.readUnsignedByte(param0 - 109);
                if (0 != var1_int) {
                  stackIn_28_0 = LoginCredentials.handleConnectionFailure(var1_int, 1);
                  return stackIn_28_0;
                }
                BackgroundParticle.field_q = BackgroundParticle.field_q + 1;
              } else {
                if (ClockAndTextHelpers.monotonicMillis(-9986) > PatchNoteUsage.field_l) {
                  stackIn_24_0 = LoginCredentials.handleConnectionFailure(-2, 1);
                  return stackIn_24_0;
                }
              }
            }
            if (BackgroundParticle.field_q != 4) {
              return -1;
            }
            BoundedRandomAccessFile.field_e.setConnection(param0 ^ -17, CellFlip.field_i, ValidationMessageWidget.field_N);
            ValidationMessageWidget.field_N = null;
            SoundPlaybackHelpers.field_b = null;
            BackgroundParticle.field_q = 0;
            stackIn_33_0 = 0;
            return stackIn_33_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return LoginCredentials.handleConnectionFailure(-3, param0 ^ 109);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final NetworkArchiveRequest createRequest(byte param0, int param1, boolean param2, int param3, int param4) {
        long var6 = (long)param1 + ((long)param4 << 32);
        NetworkArchiveRequest var8 = new NetworkArchiveRequest();
        var8.field_j = var6;
        var8.field_A = param0;
        var8.field_w = param2 ? true : false;
        if (param3 != -1150070304) {
          return (NetworkArchiveRequest) null;
        }
        if (param2) {
          if (this.getInFlightRequestCount((byte) -85) >= 20) {
            throw new RuntimeException();
          }
          this.field_i.addLast(var8, (byte) 96);
        } else {
          if (this.prefetchCount(114) < 20) {
            this.field_p.addLast(var8, (byte) 112);
            return var8;
          }
          throw new RuntimeException();
        }
        return var8;
    }

    abstract void setConnection(int param0, boolean param1, Object param2);

    final int getInFlightRequestCount(byte param0) {
        int var2 = -80 % ((52 - param0) / 62);
        return this.field_i.size(0) + this.field_c.size(0);
    }

    abstract void resetAfterValidationFailure(byte param0);

    final boolean isBackgroundQueueFull(int param0) {
        if (param0 == 20) {
          return this.prefetchCount(108) >= 20 ? true : false;
        }
        this.closeConnection(3);
        return this.prefetchCount(108) >= 20 ? true : false;
    }

    final boolean isPriorityQueueFull(byte param0) {
        if (param0 == 113) {
          return this.getInFlightRequestCount((byte) -11) >= 20 ? true : false;
        }
        this.field_k = -48;
        return this.getInFlightRequestCount((byte) -11) >= 20 ? true : false;
    }

    public static void releaseStatics(int param0) {
        field_r = null;
        field_q = null;
        field_m = null;
        arezzo12Font = null;
        int var1 = 68 % ((param0 + 29) / 43);
        field_o = null;
        field_e = null;
        field_s = null;
        field_v = null;
        field_u = null;
        field_a = null;
    }

    abstract boolean poll(int param0);

    final int prefetchCount(int param0) {
        if (param0 > 79) {
          return this.field_p.size(0) + this.field_h.size(0);
        }
        this.prefetchCount(-30);
        return this.field_p.size(0) + this.field_h.size(0);
    }

    final static void showLoadingDialog(int param0) {
        if (param0 != 389) {
          Js5Transport.pollServerConnection((byte) 100);
          QueuedListRequest.field_l.hideAllLayers((byte) 76);
          if (null == IntKeyLookup.field_i) {
            IntKeyLookup.field_i = new LoadingProgressDialog(QueuedListRequest.field_l, ValidatedTextWidget.field_X);
            QueuedListRequest.field_l.pushLayer(param0 - 389, IntKeyLookup.field_i);
            return;
          }
          QueuedListRequest.field_l.pushLayer(param0 - 389, IntKeyLookup.field_i);
          return;
        }
        QueuedListRequest.field_l.hideAllLayers((byte) 76);
        if (null != IntKeyLookup.field_i) {
          QueuedListRequest.field_l.pushLayer(param0 - 389, IntKeyLookup.field_i);
          return;
        }
        IntKeyLookup.field_i = new LoadingProgressDialog(QueuedListRequest.field_l, ValidatedTextWidget.field_X);
        QueuedListRequest.field_l.pushLayer(param0 - 389, IntKeyLookup.field_i);
    }

    abstract void closeConnection(int param0);

    Js5Transport() {
        this.field_i = new DualLinkDeque();
        this.field_c = new DualLinkDeque();
        this.field_p = new DualLinkDeque();
        this.field_h = new DualLinkDeque();
        this.field_t = new PacketBuffer(6);
        this.field_l = 0;
        this.field_b = 0;
        this.field_g = (byte) 0;
        this.field_n = new PacketBuffer(10);
    }

    static {
        field_e = new LoginRsaKey();
        field_a = "Month";
        field_o = "You can spectate this game";
        field_r = "Please select an option in the '<%0>' row.";
        field_s = new TypeCode(12, 0, 1, 0);
        field_u = "to keep fullscreen or";
    }
}
