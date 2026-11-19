/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class DiskCacheWorker implements Runnable {
    static int field_c;
    static String field_a;
    static String field_h;
    static int field_e;
    static String field_d;
    private DualLinkDeque field_f;
    private Thread field_i;
    private boolean field_g;
    int field_b;

    final static void writeConnectionPreamble(int param0, PacketBuffer param1, int param2, int param3, int param4) {
        param1.writeByte((byte) 11, 12);
        if (param2 != 20443) {
          return;
        }
        try {
          param1.writeShort(-1947079288, 17);
          param1.writeShort(-1947079288, param4);
          param1.writeShort(-1947079288, param3);
          param1.writeByte((byte) 11, param0);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "cd.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void clearSessionAndReload(java.applet.Applet param0, byte param1) {
        try {
          IntrusiveNode.writeSessionCookie("", param0, (byte) -98);
          IntegerSyntaxHelpers.openReloadPage(param0, (byte) -72);
          if (param1 != -113) {
            PacketBuffer var3 = (PacketBuffer) null;
            DiskCacheWorker.writeConnectionPreamble(-24, (PacketBuffer) null, 100, -92, -33);
          }
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "cd.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void shutdown(byte param0) {
        try {
          if (param0 <= 58) {
            return;
          }
          this.field_g = true;
          synchronized (this.field_f) {
            this.field_f.notifyAll();
          }
          try {
            this.field_i.join();
          } catch (InterruptedException interruptedException) {
          }
          this.field_i = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int pollJs5Connection(int param0) {
        try {
          int stackIn_15_0 = 0;
          int stackIn_26_0 = 0;
          int stackIn_29_0 = 0;
          int stackIn_34_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          PlatformTaskDispatcher var2 = null;
          PacketBuffer var3 = null;
          if (param0 != -18067) {
            var2 = (PlatformTaskDispatcher) null;
            DiskCacheWorker.enumerateDisplayModes(true, (PlatformTaskDispatcher) null);
          }
          if (NameAvailabilityFactory.field_f.field_k >= 4) {
            if (-1 == NameAvailabilityFactory.field_f.field_n) {
              return 3;
            }
            if (NameAvailabilityFactory.field_f.field_n != -2) {
              return 1;
            }
            return 4;
          }
          try {
            if (ChatMessage.field_k == 0) {
              DelayedServerPacket.field_k = MidiNote.field_p.requestSocket(FriendEntry.field_hb, AccountFormTextHelpers.field_b, (byte) -20);
              ChatMessage.field_k = ChatMessage.field_k + 1;
            }
            if (1 == ChatMessage.field_k) {
              if (DelayedServerPacket.field_k.status == 2) {
                stackIn_15_0 = AccountProgressDialog.handleJs5ConnectionFailure((byte) -121, -1);
                return stackIn_15_0;
              }
              if (DelayedServerPacket.field_k.status == 1) {
                ChatMessage.field_k = ChatMessage.field_k + 1;
              }
            }
            if (ChatMessage.field_k == 2) {
              BufferedRandomAccessFile.field_q = new BufferedSocket((java.net.Socket) (DelayedServerPacket.field_k.result), MidiNote.field_p);
              var3 = new PacketBuffer(13);
              DiskCacheWorker.writeConnectionPreamble(ByteArrayPool.field_d, var3, 20443, TextLayoutLine.field_c, MidiNoteMixer.field_q);
              var3.writeByte((byte) 11, 15);
              var3.writeInt(AchievementSubmission.field_j, 613003928);
              BufferedRandomAccessFile.field_q.write(13, var3.payload, 1, 0);
              ChatMessage.field_k = ChatMessage.field_k + 1;
              WidgetPainterState.field_g = MonotonicClockHelpers.monotonicMillis((byte) 109) + 30000L;
            }
            if (ChatMessage.field_k == 3) {
              if (BufferedRandomAccessFile.field_q.available((byte) 89) > 0) {
                var1_int = BufferedRandomAccessFile.field_q.readByte((byte) 19);
                if (var1_int != 0) {
                  stackIn_29_0 = AccountProgressDialog.handleJs5ConnectionFailure((byte) 85, var1_int);
                  return stackIn_29_0;
                }
                ChatMessage.field_k = ChatMessage.field_k + 1;
              } else {
                if (WidgetPainterState.field_g < MonotonicClockHelpers.monotonicMillis((byte) 127)) {
                  stackIn_26_0 = AccountProgressDialog.handleJs5ConnectionFailure((byte) 122, -2);
                  return stackIn_26_0;
                }
              }
            }
            if (ChatMessage.field_k != 4) {
              return -1;
            }
            NameAvailabilityFactory.field_f.setConnection(LoginPacketBuilder.field_b, BufferedRandomAccessFile.field_q, param0 ^ -18153);
            ChatMessage.field_k = 0;
            DelayedServerPacket.field_k = null;
            BufferedRandomAccessFile.field_q = null;
            stackIn_34_0 = 0;
            return stackIn_34_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return AccountProgressDialog.handleJs5ConnectionFailure((byte) 87, -3);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static DisplayModeInfo[] enumerateDisplayModes(boolean param0, PlatformTaskDispatcher param1) {
        int var5 = 0;
        DisplayModeInfo[] stackIn_4_0 = null;
        long stackIn_9_0 = 0L;
        boolean stackIn_10_1 = false;
        DisplayModeInfo[] stackIn_13_0 = null;
        DisplayModeInfo[] stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        DisplayModeInfo[] var4 = null;
        DisplayModeInfo var6 = null;
        int var7 = 0;
        AsyncRequest var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        var7 = wizardrun.field_H;
        try {
          if (!param1.supportsFullscreen(169978736)) {
            stackIn_4_0 = new DisplayModeInfo[]{};
            return stackIn_4_0;
          }
          var8 = param1.requestDisplayModes(false);
          while (var8.status == 0) {
            stackIn_9_0 = 10L;
            stackIn_10_1 = !(param0);
            LevelData.sleepMillis(stackIn_9_0, stackIn_10_1);
          }
          if (var8.status == 2) {
            stackIn_13_0 = new DisplayModeInfo[]{};
            return stackIn_13_0;
          }
          var10 = (int[]) (var8.result);
          var9 = var10;
          var3 = var9;
          var4 = new DisplayModeInfo[var10.length >> 2];
          if (!param0) {
            field_d = (String) null;
          }
          for (var5 = 0; var4.length > var5; var5++) {
            var6 = new DisplayModeInfo();
            var4[var5] = var6;
            var6.width = var3[var5 << 2];
            var6.height = var3[1 + (var5 << 2)];
            var6.bitDepth = var3[(var5 << 2) + 2];
            var6.refreshRate = var3[(var5 << 2) + 3];
          }
          stackIn_20_0 = var4;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("cd.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final DiskCacheRequest queueRead(byte param0, int param1, DiskCacheStore param2) {
        DiskCacheRequest var4 = null;
        RuntimeException var4_ref = null;
        DiskCacheRequest stackIn_2_0 = null;
        DiskCacheRequest stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -46) {
            stackIn_2_0 = (DiskCacheRequest) null;
            return stackIn_2_0;
          }
          var4 = new DiskCacheRequest();
          var4.store = param2;
          var4.secondaryKey = (long)param1;
          var4.actionType = 3;
          var4.field_r = false;
          this.enqueue(var4, -1);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("cd.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final DiskCacheRequest queueWrite(byte param0, DiskCacheStore param1, byte[] param2, int param3) {
        DiskCacheRequest var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        DiskCacheRequest stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new DiskCacheRequest();
          var5.secondaryKey = (long)param3;
          var5.actionType = 2;
          var5.store = param1;
          var5.data = param2;
          var6 = -115 % ((param0 + 68) / 43);
          var5.field_r = false;
          this.enqueue(var5, -1);
          stackIn_1_0 = var5;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_4_0 = var5_ref;
          stackIn_4_1 = new StringBuilder().append("cd.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(')').toString());
        }
    }

    final DiskCacheRequest readSynchronously(int param0, int param1, DiskCacheStore param2) {
        DiskCacheRequest var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        DiskCacheRequest var6 = null;
        int var8 = 0;
        DiskCacheRequest stackIn_9_0 = null;
        DiskCacheRequest stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = wizardrun.field_H;
        try {
          var4 = new DiskCacheRequest();
          var4.actionType = 1;
          var5 = this.field_f;
          synchronized (var5) {
            var6 = (DiskCacheRequest) (this.field_f.first(param1 ^ param1));
            while (var6 != null) {
              if (~var6.secondaryKey == ~(long)param0 &&
                var6.store == param2 &&
                2 == var6.actionType) {
                var4.pending = false;
                var4.data = var6.data;
                stackIn_9_0 = var4;
                return stackIn_9_0;
              }
              var6 = (DiskCacheRequest) (this.field_f.next(123));
            }
          }
          var4.data = param2.read(true, param0);
          var4.pending = false;
          var4.field_r = true;
          stackIn_16_0 = var4;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_19_0 = var4_ref;
          stackIn_19_1 = new StringBuilder().append("cd.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    private final void enqueue(DiskCacheRequest param0, int param1) {
        synchronized (this.field_f) {
          this.field_f.addLast(param0, 14);
          this.field_b = this.field_b + 1;
          this.field_f.notifyAll();
          if (param1 != -1) {
            DiskCacheStore var5 = (DiskCacheStore) null;
            this.readSynchronously(80, 53, (DiskCacheStore) null);
          }
        }
    }

    public static void releaseStatics(boolean param0) {
        if (param0) {
          field_c = 7;
          field_h = null;
          field_d = null;
          field_a = null;
          return;
        }
        field_h = null;
        field_d = null;
        field_a = null;
    }

    public final void run() {
        try {
          InterruptedException interruptedException = null;
          Object var2 = null;
          int var5 = 0;
          DiskCacheRequest var7 = null;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          String var6 = null;
          var5 = wizardrun.field_H;
          while (!this.field_g) {
            var2 = this.field_f;
            synchronized (var2) {
              var7 = (DiskCacheRequest) (this.field_f.removeFirst(46));
              if (var7 == null) {
                try {
                  this.field_f.wait();
                } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                }
                decompiledRegionSelector0 = 0;
              } else {
                this.field_b = this.field_b - 1;
                decompiledRegionSelector0 = 1;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              continue;
            }
            try {
              if (var7.actionType == 2) {
                var7.store.write(var7.data, (int)var7.secondaryKey, 0, var7.data.length);
                var7.pending = false;
              } else {
                if (3 == var7.actionType) {
                  var7.data = var7.store.read(true, (int)var7.secondaryKey);
                  var7.pending = false;
                } else {
                  var7.pending = false;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              ResizableDialog.reportClientError((Throwable) ((Object) var2_ref), (String) null, -562);
              var7.pending = false;
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    DiskCacheWorker(PlatformTaskDispatcher param0) {
        AsyncRequest var2 = null;
        this.field_f = new DualLinkDeque();
        this.field_g = false;
        this.field_b = 0;
        try {
          var2 = param0.requestThread((byte) -98, (Runnable) (this), 5);
          while (var2.status == 0) {
            LevelData.sleepMillis(10L, false);
          }
          if (var2.status == 2) {
            throw new RuntimeException();
          }
          this.field_i = (Thread) (var2.result);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "cd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_d = "Log in / Create account";
        field_h = "You get extra lives for collecting points.";
    }
}
