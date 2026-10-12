/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DiskCacheWorker implements Runnable {
    static String field_h;
    static String field_e;
    static String[] field_f;
    static RgbSprite field_d;
    private DualNodeDeque requests;
    private boolean stopRequested;
    int queuedCount;
    private Thread workerThread;

    final static int a(byte param0, String param1, String param2, boolean param3, int param4, int param5, String param6) {
        gl var7 = null;
        RuntimeException var7_ref = null;
        gl var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -46) {
            stackIn_2_0 = -51;
            return stackIn_2_0;
          }
          var7 = new gl(param1);
          var8 = new gl(param2);
          stackIn_4_0 = uq.a(param6, var7, -20032, param5, param4, var8, param3);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_7_0 = var7_ref;
          stackIn_7_1 = new StringBuilder().append("vo.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public final void run() {
        try {
          InterruptedException interruptedException = null;
          Object queueMonitor = null;
          int var5 = 0;
          DiskCacheRequest request = null;
          int decompiledRegionSelector0 = 0;
          int decompiledRegionSelector1 = 0;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          String var6 = null;
          var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
          while (!this.stopRequested) {
            queueMonitor = this.requests;
            synchronized (queueMonitor) {
              request = (DiskCacheRequest) (this.requests.popFirst(11));
              if (request == null) {
                try {
                  this.requests.wait();
                } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                }
                decompiledRegionSelector0 = 0;
              } else {
                this.queuedCount = this.queuedCount - 1;
                decompiledRegionSelector0 = 1;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              continue;
            }
            try {
              boolean decompiledFrameRemainder0 = true;
              if (request.operation != 2) {
                if (request.operation == 3) {
                  request.bytes = request.store.read(0, (int)request.secondaryKey);
                  decompiledRegionSelector1 = 1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  request.pending = false;
                }
              } else {
                request.store.write(83, request.bytes.length, request.bytes, (int)request.secondaryKey);
                request.pending = false;
              }
              if (decompiledFrameRemainder0) {
                decompiledRegionSelector1 = 0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              af.a((Throwable) ((Object) var2_ref), -98, (String) null);
              decompiledRegionSelector1 = 1;
            }
            if (decompiledRegionSelector1 == 0) {
              continue;
            }
            request.pending = false;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final DiskCacheRequest queueRead(byte obfuscationGuard, int entryId, SectorCacheStore store) {
        DiskCacheRequest var4 = null;
        RuntimeException var4_ref = null;
        DiskCacheRequest stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new DiskCacheRequest();
          if (obfuscationGuard != 56) {
            DiskCacheWorker.a(50, 66, -33, 75, 23, -84, true);
          }
          var4.requestFlag = false;
          var4.store = store;
          var4.operation = 3;
          var4.secondaryKey = (long)entryId;
          this.enqueue((byte) -105, var4);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("vo.K(").append(obfuscationGuard).append(',').append(entryId).append(',');
          if (store == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static int a(byte param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var3_int = 33 / ((19 - param0) / 63);
          var4 = 0;
          var5 = InstructionsPanel.field_r;
          while (var4 < nb.field_h.length) {
            var6 = DirectByteStorage.field_k[var4];
            if (var6 < 0) {
              var5 = var5 + cn.field_o;
            } else {
              var7 = lp.a(nb.field_h[var4], true, false);
              var5 = var5 + ar.field_w;
              var8 = bt.field_g - (var7 >> 1);
              if (mu.a(param2, jg.field_k + (rd.field_b << 1), param1, -df.field_E + var8, 5138823, (df.field_E << 1) + var7, var5)) {
                stackIn_6_0 = var6;
                return stackIn_6_0;
              }
              var5 = var5 + (ar.field_w + ((rd.field_b << 1) + jg.field_k));
            }
            var4++;
          }
          stackIn_11_0 = -1;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var3), "vo.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void enqueue(byte obfuscationGuard, DiskCacheRequest request) {
        int var3_int = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        Throwable decompiledCaughtException = null;
        Object var3 = null;
        RuntimeException var3_ref = null;
        try {
          var3 = this.requests;
          synchronized (var3) {
            this.requests.addLast(request, false);
            this.queuedCount = this.queuedCount + 1;
            this.requests.notifyAll();
          }
          var3_int = -58 % ((obfuscationGuard - 50) / 61);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("vo.C(").append(obfuscationGuard).append(',');
          if (request == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        String var7 = null;
        if (rs.field_t == param1) {
          var7 = eb.field_d;
        } else {
          var7 = CampaignMenu.field_q;
        }
        ef.a(param2, (byte) 46, param3, param6, param4, param0, param5, var7);
    }

    final static void reportCampaignTurn(boolean isLocalTurn, int obfuscationGuard, int turnsTaken, CampaignMission mission) {
        int localTurnFlag = 0;
        int campaignIndex = mission.campaign.campaignIndex;
        int missionId = mission.missionId;
        if (obfuscationGuard != 1) {
          field_e = (String) null;
        }
        if (DamageEvent.g(76)) {
          return;
        }
        try {
          localTurnFlag = isLocalTurn ? 1 : 0;
          StateChangeEvent.sendProgressRecord((byte) 6, missionId + campaignIndex * 1000, localTurnFlag, turnsTaken);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "vo.E(" + isLocalTurn + ',' + obfuscationGuard + ',' + turnsTaken + ',' + (mission != null ? "{...}" : "null") + ')');
        }
    }

    final DiskCacheRequest queueWrite(int entryId, SectorCacheStore store, boolean requestFlag, byte[] bytes) {
        DiskCacheRequest var5 = null;
        RuntimeException var5_ref = null;
        DiskCacheRequest stackIn_2_0 = null;
        boolean stackIn_3_1 = false;
        DiskCacheRequest stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new DiskCacheRequest();
          var5.secondaryKey = (long)entryId;
          var5.operation = 2;
          stackIn_2_0 = var5;
          stackIn_3_1 = (requestFlag);
          stackIn_2_0.requestFlag = stackIn_3_1;
          var5.bytes = bytes;
          var5.store = store;
          this.enqueue((byte) 117, var5);
          stackIn_4_0 = var5;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("vo.D(").append(entryId).append(',');
          if (store == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(requestFlag).append(',');
          if (bytes == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void stop(byte obfuscationGuard) {
        try {
          this.stopRequested = true;
          synchronized (this.requests) {
            this.requests.notifyAll();
          }
          try {
            this.workerThread.join();
          } catch (InterruptedException interruptedException) {
          }
          this.workerThread = null;
          int var2 = 41 % ((-67 - obfuscationGuard) / 33);
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        if (!(TurnTimerDial.field_d <= 0)) {
          TurnTimerDial.field_d = TurnTimerDial.field_d - 1;
        }
        if (param0 != -10232) {
          DiskCacheWorker.a(-87, -49, 69, -51, 90, -121, false);
        }
        if (so.field_b.field_g != EquipmentBattleTutorial.field_y) {
          sh.field_l = sh.field_l + (so.field_b.field_g - EquipmentBattleTutorial.field_y);
          EquipmentBattleTutorial.field_y = so.field_b.field_g;
        }
        if (!(TurnTimerDial.field_d <= 0)) {
          vi.a(-67);
        }
    }

    final DiskCacheRequest readNow(int entryId, SectorCacheStore store, int obfuscationGuard) {
        DiskCacheRequest request = null;
        RuntimeException var4_ref = null;
        Object queueMonitor = null;
        DiskCacheRequest queuedRequest = null;
        int var8 = 0;
        DiskCacheRequest stackIn_8_0 = null;
        DiskCacheRequest stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          request = new DiskCacheRequest();
          request.operation = 1;
          queueMonitor = this.requests;
          synchronized (queueMonitor) {
            queuedRequest = (DiskCacheRequest) (this.requests.first((byte) 82));
            while (queuedRequest != null) {
              if (queuedRequest.secondaryKey == (long)entryId &&
                store == queuedRequest.store &&
                queuedRequest.operation == 2) {
                request.bytes = queuedRequest.bytes;
                request.pending = false;
                stackIn_8_0 = request;
                return stackIn_8_0;
              }
              queuedRequest = (DiskCacheRequest) (this.requests.next(24));
            }
          }
          request.bytes = store.read(0, entryId);
          request.requestFlag = true;
          request.pending = false;
          if (obfuscationGuard <= 69) {
            DiskCacheWorker.a(76);
          }
          stackIn_17_0 = request;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_20_0 = var4_ref;
          stackIn_20_1 = new StringBuilder().append("vo.I(").append(entryId).append(',');
          if (store == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          return;
        }
        field_d = null;
        field_f = null;
        field_h = null;
        field_e = null;
    }

    DiskCacheWorker(hd threadLauncher) {
        wo var2 = null;
        this.requests = new DualNodeDeque();
        this.queuedCount = 0;
        this.stopRequested = false;
        try {
          var2 = threadLauncher.a(5, 0, (Runnable) (this));
          while (0 == var2.field_g) {
            nu.a(10L, 0);
          }
          if (var2.field_g == 2) {
            throw new RuntimeException();
          }
          this.workerThread = (Thread) (var2.field_f);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "vo.<init>(" + (threadLauncher != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = "You cannot chat to <%0> because <%0> is not in your friend list.";
        field_e = "Orb coins: ";
        field_f = new String[]{"turn <%0> of <%1>", "<%0> of <%1> portals captured", "<%0> of <%1> towers captured", "<%0> of <%1> villages captured", null, "<%0> of <%1> portals captured by <%2>", "<%0> of <%1> towers captured by <%2>", "<%0> of <%1> villages captured by <%2>", "<%0> / <%1>"};
    }
}
