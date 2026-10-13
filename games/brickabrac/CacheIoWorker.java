/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CacheIoWorker implements Runnable {
    private SecondaryNodeQueue queue;
    static String field_b;
    static int[] desertBackgroundColors;
    static RgbSprite[][] volcanicCapsSprites;
    static String field_e;
    static String[] field_h;
    private boolean shutdownRequested;
    int queuedCount;
    static int[] halloweenBackgroundColors;
    private Thread thread;

    final void shutdown(byte obfuscationGuard) {
        try {
          this.shutdownRequested = true;
          synchronized (this.queue) {
            this.queue.notifyAll();
          }
          try {
            this.thread.join();
          } catch (InterruptedException interruptedException) {
          }
          this.thread = null;
          if (obfuscationGuard >= 38) {
            return;
          }
          this.queuedCount = -29;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    final CacheIoRequest readImmediate(FileCacheStore store, int entryId, int obfuscationGuard) {
        CacheIoRequest var4 = null;
        RuntimeException var4_ref = null;
        Object var5_ref_Object = null;
        int var5 = 0;
        CacheIoRequest var6 = null;
        int var8 = 0;
        CacheIoRequest stackIn_8_0 = null;
        CacheIoRequest stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          var4 = new CacheIoRequest();
          var4.operation = 1;
          var5_ref_Object = this.queue;
          synchronized (var5_ref_Object) {
            var6 = (CacheIoRequest) (this.queue.first(true));
            while (var6 != null) {
              if (~(long)entryId == ~var6.secondaryKey &&
                var6.store == store &&
                var6.operation == 2) {
                var4.pending = false;
                var4.data = var6.data;
                stackIn_8_0 = var4;
                return stackIn_8_0;
              }
              var6 = (CacheIoRequest) (this.queue.next(-8394));
            }
          }
          var4.data = store.read(0, entryId);
          var4.pending = false;
          var5 = -57 / ((-77 - obfuscationGuard) / 47);
          var4.priority = true;
          stackIn_15_0 = var4;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_18_0 = var4_ref;
          stackIn_18_1 = new StringBuilder().append("kg.E(");
          if (store == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(entryId).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (param0 != 21678) {
          CacheIoWorker.a(-67);
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5) {
        int var13 = 0;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int var15 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7Lifetime1;
        var15 = BrickABrac.field_J ? 1 : 0;
        try {
          var6_int = 485 + param1 + 8 - (-2 - param4) + 8;
          sh.field_d.a(-6 + DualLinkDeque.field_d.field_cb, 3, 3, -6 + var6_int, (byte) 64);
          var7 = -5 + sh.field_d.field_cb;
          BallPulseEffect.field_n.a(param3, -param3 + var7, 5, param4 + 485 + param1 + 2, (byte) 64);
          g.field_n.a(param3, 0, param1, -ap.field_e.field_Ib - param1 + BallPulseEffect.field_n.field_Ib, (byte) 64);
          var8 = 3 / ((49 - param0) / 40);
          ap.field_e.a(param3, 0, param1 + g.field_n.field_Ib, ap.field_e.field_Ib, (byte) 64);
          var7 = var7 - (param3 + 2);
          AchievementIcon.field_q.a(2, (byte) -110, 2 + (485 + param1) + param4, 5, 5, param4, var7 - 5);
          if (null != vd.field_a) {
            vd.field_a.a(AchievementIcon.field_q.field_cb, AchievementIcon.field_q.field_P, AchievementIcon.field_q.field_zb, (byte) -119, AchievementIcon.field_q.field_Ib);
          }
          var9 = -param1 + (DualLinkDeque.field_d.field_Ib - var6_int);
          var10 = var9 / 2;
          var11 = param1 + var10 + param2;
          var12 = 0;
          for (var13 = 0; 6 > var13; var13++) {
            if (var13 >= 5 ||
              null != ik.field_i[var13]) {
              var14 = 3 + (2 + DualLinkDeque.field_d.field_cb - 6) * var12 / (fe.field_pb + 1);
              var12++;
              var7Lifetime1 = -var14 + 3 + (var12 * (2 + (DualLinkDeque.field_d.field_cb - 6)) / (fe.field_pb + 1) - 2);
              if (5 > var13) {
                ik.field_i[var13].a(var7Lifetime1, var14, var6_int, var9, (byte) 64);
                HalloweenBackground.field_w[var13].a(var7Lifetime1, 0, param1, -param1 + var10, (byte) 64);
                vj.field_a[var13].a(-param5 + (var7Lifetime1 - param5), param5, var10, param2, (byte) 64);
                wd.field_F[var13].a(-param5 - param5 + var7Lifetime1, param5, var11, -var11 + var9 - param1, (byte) 64);
              } else {
                LegacyUtf8Decoder.field_c.a(var7Lifetime1, var14, var6_int, var9, (byte) 64);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var6), "kg.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final CacheIoRequest readAsync(int entryId, FileCacheStore store, byte obfuscationGuard) {
        CacheIoRequest var4 = null;
        RuntimeException var4_ref = null;
        FileCacheStore var5 = null;
        CacheIoRequest stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new CacheIoRequest();
          var4.operation = 3;
          var4.priority = false;
          if (obfuscationGuard >= -51) {
            var5 = (FileCacheStore) null;
            this.writeAsync(26, true, (byte[]) null, (FileCacheStore) null);
          }
          var4.store = store;
          var4.secondaryKey = (long)entryId;
          this.enqueue(var4, -3);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("kg.A(").append(entryId).append(',');
          if (store == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final void enqueue(CacheIoRequest request, int obfuscationGuard) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        Object var3_ref = null;
        try {
          var3_ref = this.queue;
          synchronized (var3_ref) {
            this.queue.addLast(request, false);
            this.queuedCount = this.queuedCount + 1;
            this.queue.notifyAll();
          }
          if (obfuscationGuard == -3) {
            return;
          }
          CacheIoWorker.a((byte) -81, -120, -50, 43, 109, -99);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("kg.G(");
          if (request == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public final void run() {
        try {
          InterruptedException interruptedException = null;
          int var5 = 0;
          CacheIoRequest var7 = null;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          Exception var2_ref = null;
          String var6 = null;
          var5 = BrickABrac.field_J ? 1 : 0;
          while (!this.shutdownRequested) {
            var2 = this.queue;
            synchronized (var2) {
              var7 = (CacheIoRequest) (this.queue.removeFirst(25609));
              if (var7 != null) {
                this.queuedCount = this.queuedCount - 1;
                decompiledRegionSelector0 = 1;
              } else {
                try {
                  this.queue.wait();
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
              if (var7.operation == 2) {
                var7.store.write((byte) -123, var7.data, var7.data.length, (int)var7.secondaryKey);
                var7.pending = false;
              } else {
                if (var7.operation == 3) {
                  var7.data = var7.store.read(0, (int)var7.secondaryKey);
                  var7.pending = false;
                } else {
                  var7.pending = false;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              rk.a((String) null, (Throwable) ((Object) var2_ref), 35);
              var7.pending = false;
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final CacheIoRequest writeAsync(int entryId, boolean priority, byte[] data, FileCacheStore store) {
        CacheIoRequest var5 = null;
        RuntimeException var5_ref = null;
        CacheIoRequest stackIn_2_0 = null;
        boolean stackIn_3_1 = false;
        CacheIoRequest stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new CacheIoRequest();
          var5.data = data;
          var5.store = store;
          var5.secondaryKey = (long)entryId;
          var5.operation = 2;
          stackIn_2_0 = var5;
          stackIn_3_1 = (priority);
          stackIn_2_0.priority = stackIn_3_1;
          this.enqueue(var5, -3);
          stackIn_4_0 = var5;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("kg.F(").append(entryId).append(',').append(priority).append(',');
          if (data == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (store == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_b = null;
        desertBackgroundColors = null;
        volcanicCapsSprites = (RgbSprite[][]) null;
        field_h = null;
        if (param0 == 26679) {
          halloweenBackgroundColors = null;
          field_e = null;
          return;
        }
        field_h = (String[]) null;
        halloweenBackgroundColors = null;
        field_e = null;
    }

    CacheIoWorker(PlatformServices param0) {
        PlatformTask var2 = null;
        this.queue = new SecondaryNodeQueue();
        this.shutdownRequested = false;
        this.queuedCount = 0;
        try {
          var2 = param0.startThread(5, (Runnable) (this), (byte) -72);
          while (var2.status == 0) {
            wj.sleepMillis(-124, 10L);
          }
          if (var2.status == 2) {
            throw new RuntimeException();
          }
          this.thread = (Thread) (var2.result);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "kg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Hide game chat";
        desertBackgroundColors = new int[]{16494651, 27571, 12658477, 26679, 16711935};
        field_e = "Enter name of player to add to list";
        field_h = new String[16];
        halloweenBackgroundColors = new int[]{12658477, 22953, 16494651, 26679, 16711935};
    }
}
