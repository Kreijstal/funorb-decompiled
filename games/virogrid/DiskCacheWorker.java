/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DiskCacheWorker implements Runnable {
    static int field_i;
    static String field_a;
    static int[] field_c;
    private DualLinkDeque field_h;
    static int[] field_b;
    private boolean field_f;
    private Thread field_g;
    static MouseWheelInput field_d;
    int field_e;

    final static Sprite[] createSprites(int param0, byte param1, int param2, int param3, int param4) {
        int var5 = -56 / ((param1 + 9) / 63);
        return ClientServiceHelpers.createBevelFrameSprites(1, param4, (byte) -105, param3, param2, 3, 1, param0, 1);
    }

    final static void setCookie(String param0, String param1, java.applet.Applet param2, long param3, byte param4) {
        try {
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var6 = null;
          RuntimeException var6_ref = null;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var7Lifetime1;
          String var7Lifetime2;
          String var7Lifetime3;
          String var7Lifetime4;
          try {
            try {
              var8 = param2.getParameter("cookiehost");
              var7 = var8;
              var7Lifetime1 = var8;
              if (param4 != -2) {
                field_d = (MouseWheelInput) null;
              }
              var9 = param0 + "=" + param1 + "; version=1; path=/; domain=" + var8;
              var7Lifetime2 = var9;
              var7Lifetime3 = var9;
              if (param3 >= 0L) {
                var7Lifetime4 = var9 + "; Expires=" + SocialListEntry.formatGmtTimestamp(param3 * 1000L + ClockAndTextHelpers.monotonicMillis(-9986), (byte) 96) + "; Max-Age=" + param3;
              } else {
                var7Lifetime4 = var9 + "; Discard;";
              }
              JavaScriptBridge.evaluateScript("document.cookie=\"" + var7Lifetime4 + "\"", -17107, param2);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var6_ref;
            stackIn_11_1 = new StringBuilder().append("sb.E(");
            if (param0 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
            if (param1 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
            if (param2 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void shutdown(byte param0) {
        try {
          this.field_f = true;
          synchronized (this.field_h) {
            this.field_h.notifyAll();
          }
          if (param0 != -56) {
            return;
          }
          try {
            this.field_g.join();
          } catch (InterruptedException interruptedException) {
          }
          this.field_g = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void run() {
        try {
          InterruptedException interruptedException = null;
          int var5 = 0;
          DiskArchiveRequest var7 = null;
          int decompiledRegionSelector0 = 0;
          int decompiledRegionSelector1 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          Exception var2_ref = null;
          String var6 = null;
          var5 = Virogrid.field_F ? 1 : 0;
          while (!this.field_f) {
            var2 = this.field_h;
            synchronized (var2) {
              var7 = (DiskArchiveRequest) (this.field_h.removeFirst((byte) -103));
              if (var7 != null) {
                this.field_e = this.field_e - 1;
                decompiledRegionSelector0 = 1;
              } else {
                try {
                  this.field_h.wait();
                } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                }
                decompiledRegionSelector0 = 0;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              continue;
            }
            try {
              boolean decompiledFrameRemainder0 = true;
              if (var7.field_E == 2) {
                var7.field_I.write(var7.field_C, (int)var7.field_j, var7.field_C.length, (byte) -45);
                var7.field_t = false;
              } else {
                if (var7.field_E != 3) {
                  decompiledRegionSelector1 = 0;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  var7.field_C = var7.field_I.read((int)var7.field_j, -54);
                  var7.field_t = false;
                }
              }
              if (decompiledFrameRemainder0) {
                decompiledRegionSelector1 = 1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              IconLabelWidget.reportClientError((String) null, (Throwable) ((Object) var2_ref), 1);
              decompiledRegionSelector1 = 0;
            }
            if (decompiledRegionSelector1 != 0) {
              continue;
            }
            var7.field_t = false;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final DiskArchiveRequest readImmediate(int param0, int param1, SectorCacheStore param2) {
        DiskArchiveRequest var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        Object var5_ref = null;
        DiskArchiveRequest var6 = null;
        int var8 = 0;
        DiskArchiveRequest stackIn_4_0 = null;
        DiskArchiveRequest stackIn_11_0 = null;
        DiskArchiveRequest stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          var4 = new DiskArchiveRequest();
          var4.field_E = 1;
          var5_ref = this.field_h;
          synchronized (var5_ref) {
            var6 = (DiskArchiveRequest) (this.field_h.first(param1 ^ 16577));
            if (param1 != -16578) {
              stackIn_4_0 = (DiskArchiveRequest) null;
              return stackIn_4_0;
            }
            while (var6 != null) {
              if (~(long)param0 == ~var6.field_j &&
                param2 == var6.field_I &&
                var6.field_E == 2) {
                var4.field_t = false;
                var4.field_C = var6.field_C;
                stackIn_11_0 = var4;
                return stackIn_11_0;
              }
              var6 = (DiskArchiveRequest) (this.field_h.next(26605));
            }
          }
          var4.field_C = param2.read(param0, param1 ^ 16542);
          var4.field_w = true;
          var4.field_t = false;
          stackIn_18_0 = var4;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_21_0 = var4_ref;
          stackIn_21_1 = new StringBuilder().append("sb.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static void readQueuedListResponse(byte param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        QueuedListRequest var4 = null;
        int var4_int = 0;
        int var5 = 0;
        QueuedResultSubmission var5_ref_da = null;
        int[] var6 = null;
        int var8 = 0;
        CipherPacketBuffer var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          if (param0 != -61) {
            DiskCacheWorker.createSprites(-47, (byte) -80, -105, 81, 28);
          }
          var10 = ProgressMessageDialog.field_qb;
          var2 = var10.readUnsignedByte(11132);
          var3 = var10.readUnsignedByte(11132);
          if (var2 == 0) {
            var4 = (QueuedListRequest) (DelayedPacket.field_o.first((byte) -64));
            if (var4 == null) {
              MenuInputState.closeGameConnection(false);
              return;
            }
            var5 = -var10.position + ArchiveProvider.field_a;
            var12 = var4.field_p;
            var11 = var12;
            var6 = var11;
            if (var12.length << 2 < var5) {
              var5 = var12.length << 2;
            }
            for (var7 = 0; var5 > var7; var7++) {
              var6[var7 >> 2] = var6[var7 >> 2] + (var10.readUnsignedByte(GzipDecompressor.bitXor((int) param0, -11073)) << (WidgetFactoryHelpers.bitAnd(var7, 3) << 8));
            }
            var4.unlink(false);
            return;
          }
          if (var2 == 1) {
            var4_int = var10.readSignedSmart(123);
            var5_ref_da = (QueuedResultSubmission) (TextWidgetPainter.field_m.first((byte) -105));
            while (var5_ref_da != null) {
              if (var5_ref_da.field_p != var3 ||
                var5_ref_da.field_q != var4_int) {
                var5_ref_da = (QueuedResultSubmission) (TextWidgetPainter.field_m.next(16213));
                continue;
              }
              break;
            }
            if (var5_ref_da == null) {
              MenuInputState.closeGameConnection(false);
              return;
            }
            var5_ref_da.unlink(false);
            return;
          }
          IconLabelWidget.reportClientError("LR1: " + ClientException.describePacketHistory(true), (Throwable) null, 1);
          MenuInputState.closeGameConnection(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var1), "sb.J(" + param0 + ')');
        }
    }

    final static void sortTableRowIndices(int param0, byte param1) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var2_intLifetime1;
        var3 = Virogrid.field_F ? 1 : 0;
        try {
          PendingRequest.sortRankingRange(DiskArchiveRequest.field_F, param0, true, PendingRequest.field_m, RasterEffectHelpers.field_e, 0, 0);
          for (var2_int = 0; PendingRequest.field_m > var2_int; var2_int++) {
            LobbyPlayerEntry.field_Tb[param0 + var2_int] = var2_int;
          }
          PendingRequest.sortRankingRange(PlayerContextMenu.field_c, param0 + param0, false, PendingRequest.field_m + param0, PendingRequest.field_k, 0, param0);
          var2_intLifetime1 = -86 % ((10 - param1) / 33);
          if (param0 < PendingRequest.field_m) {
            PendingRequest.field_m = param0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var2), "sb.I(" + param0 + ',' + param1 + ')');
        }
    }

    final static void resetFrameTimingHistory(int param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        var2 = Virogrid.field_F ? 1 : 0;
        try {
          ChatPanelSetupHelpers.field_b.resetTiming(110);
          for (var1_int = 0; var1_int < 32; var1_int++) {
            WidgetNode.field_q[var1_int] = 0L;
          }
          for (var1_intLifetime1 = 0; var1_intLifetime1 < 32; var1_intLifetime1++) {
            LogoIntroHelpers.field_b[var1_intLifetime1] = 0L;
          }
          CheckboxTickPainter.field_c = 0;
          if (param0 >= -24) {
            field_b = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var1), "sb.D(" + param0 + ')');
        }
    }

    final DiskArchiveRequest queueWrite(SectorCacheStore param0, byte[] param1, byte param2, int param3) {
        DiskArchiveRequest var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        DiskArchiveRequest stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = 28 % ((-56 - param2) / 63);
          var5 = new DiskArchiveRequest();
          var5.field_C = param1;
          var5.field_j = (long)param3;
          var5.field_E = 2;
          var5.field_I = param0;
          var5.field_w = false;
          this.enqueue(var5, 0);
          stackIn_1_0 = var5;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_4_0 = var5_ref;
          stackIn_4_1 = new StringBuilder().append("sb.L(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void sendShortSetting(int param0, int param1, int param2) {
        if (param2 != 14534) {
          field_a = (String) null;
        }
        CipherPacketBuffer var3 = IterableNodeHashTable.field_g;
        var3.writeCipheredOpcode(param1, 8);
        var3.writeByte(3, param2 - 14455);
        var3.writeByte(10, param2 ^ 14513);
        var3.writeShort((byte) -121, param0);
    }

    public static void releaseStatics(int param0) {
        field_b = null;
        field_d = null;
        field_a = null;
        if (param0 != -851125662) {
          field_b = (int[]) null;
        }
        field_c = null;
    }

    private final void enqueue(DiskArchiveRequest param0, int param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        Object var3 = null;
        RuntimeException var3_ref = null;
        try {
          var3 = this.field_h;
          synchronized (var3) {
            this.field_h.addLast(param0, (byte) 118);
            this.field_e = this.field_e + 1;
            if (param1 != 0) {
              DiskCacheWorker.createSprites(-78, (byte) -66, -14, -121, 83);
            }
            this.field_h.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("sb.K(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final DiskArchiveRequest queueRead(byte param0, int param1, SectorCacheStore param2) {
        DiskArchiveRequest var4 = null;
        RuntimeException var4_ref = null;
        SectorCacheStore var5 = null;
        DiskArchiveRequest stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 116) {
            var5 = (SectorCacheStore) null;
            this.queueRead((byte) -92, 49, (SectorCacheStore) null);
          }
          var4 = new DiskArchiveRequest();
          var4.field_I = param2;
          var4.field_E = 3;
          var4.field_j = (long)param1;
          var4.field_w = false;
          this.enqueue(var4, 0);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("sb.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    DiskCacheWorker(PlatformTaskDispatcher param0) {
        PlatformTask var2 = null;
        this.field_h = new DualLinkDeque();
        this.field_f = false;
        this.field_e = 0;
        try {
          var2 = param0.startThread(5, (Runnable) (this), 255);
          while (0 == var2.field_a) {
            IsaacRandom.sleepMillis(-43, 10L);
          }
          if (var2.field_a == 2) {
            throw new RuntimeException();
          }
          this.field_g = (Thread) (var2.field_f);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "sb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = new int[]{2, 14, 15, 6, 5, 16, 17, 10, 11, 12};
        field_a = "Loading graphics";
        field_b = new int[4];
    }
}
