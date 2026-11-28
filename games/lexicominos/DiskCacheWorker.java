/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DiskCacheWorker implements Runnable {
    private ci field_a;
    private boolean field_d;
    int field_c;
    private Thread field_b;

    final void shutdown(byte param0) {
        try {
          if (param0 != -114) {
            this.field_c = -72;
          }
          this.field_d = true;
          synchronized (this.field_a) {
            this.field_a.notifyAll();
          }
          try {
            this.field_b.join();
          } catch (InterruptedException interruptedException) {
          }
          this.field_b = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void enqueue(int param0, DiskArchiveRequest param1) {
        synchronized (this.field_a) {
          this.field_a.a(91, param1);
          this.field_c = this.field_c + 1;
          if (param0 <= 58) {
            SectorCacheStore var5 = (SectorCacheStore) null;
            this.readNow((SectorCacheStore) null, (byte) -50, -68);
          }
          this.field_a.notifyAll();
        }
    }

    final DiskArchiveRequest requestRead(int param0, SectorCacheStore param1, int param2) {
        DiskArchiveRequest var4 = null;
        RuntimeException var4_ref = null;
        DiskArchiveRequest stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new DiskArchiveRequest();
          var4.field_j = (long)param0;
          var4.field_p = false;
          var4.field_z = param1;
          var4.field_A = param2;
          this.enqueue(110, var4);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("kl.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ValidationStatusIcon.wrapClientException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param2).append(')').toString());
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
          var5 = Lexicominos.field_L ? 1 : 0;
          while (!this.field_d) {
            var2 = this.field_a;
            synchronized (var2) {
              var7 = (DiskArchiveRequest) (this.field_a.a((byte) 100));
              if (var7 != null) {
                this.field_c = this.field_c - 1;
                decompiledRegionSelector0 = 1;
              } else {
                try {
                  this.field_a.wait();
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
              if (var7.field_A != 2) {
                if (var7.field_A == 3) {
                  var7.field_w = var7.field_z.read((int)var7.field_j, -65536);
                  decompiledRegionSelector1 = 1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  var7.field_v = false;
                }
              } else {
                var7.field_z.write(var7.field_w, var7.field_w.length, (int)var7.field_j, -1);
                var7.field_v = false;
              }
              if (decompiledFrameRemainder0) {
                decompiledRegionSelector1 = 0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              uj.a((String) null, (Throwable) ((Object) var2_ref), 1);
              decompiledRegionSelector1 = 1;
            }
            if (decompiledRegionSelector1 == 0) {
              continue;
            }
            var7.field_v = false;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final DiskArchiveRequest requestWrite(byte[] param0, int param1, int param2, SectorCacheStore param3) {
        DiskArchiveRequest var5 = null;
        RuntimeException var5_ref = null;
        SectorCacheStore var6 = null;
        DiskArchiveRequest stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 1) {
            var6 = (SectorCacheStore) null;
            this.requestWrite((byte[]) null, -102, -125, (SectorCacheStore) null);
          }
          var5 = new DiskArchiveRequest();
          var5.field_A = 2;
          var5.field_p = false;
          var5.field_z = param3;
          var5.field_w = param0;
          var5.field_j = (long)param1;
          this.enqueue(param2 ^ 118, var5);
          stackIn_3_0 = var5;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_6_0 = var5_ref;
          stackIn_6_1 = new StringBuilder().append("kl.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ValidationStatusIcon.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final DiskArchiveRequest readNow(SectorCacheStore param0, byte param1, int param2) {
        DiskArchiveRequest var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        DiskArchiveRequest var6 = null;
        int var8 = 0;
        SectorCacheStore var9 = null;
        DiskArchiveRequest stackIn_10_0 = null;
        DiskArchiveRequest stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          var4 = new DiskArchiveRequest();
          var4.field_A = 1;
          var5 = this.field_a;
          synchronized (var5) {
            if (param1 != -6) {
              var9 = (SectorCacheStore) null;
              this.requestRead(30, (SectorCacheStore) null, 85);
            }
            var6 = (DiskArchiveRequest) (this.field_a.a(true));
            while (var6 != null) {
              if (~(long)param2 == ~var6.field_j &&
                var6.field_z == param0 &&
                var6.field_A == 2) {
                var4.field_v = false;
                var4.field_w = var6.field_w;
                stackIn_10_0 = var4;
                return stackIn_10_0;
              }
              var6 = (DiskArchiveRequest) (this.field_a.a(-256));
            }
          }
          var4.field_w = param0.read(param2, -65536);
          var4.field_p = true;
          var4.field_v = false;
          stackIn_17_0 = var4;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_20_0 = var4_ref;
          stackIn_20_1 = new StringBuilder().append("kl.E(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ValidationStatusIcon.wrapClientException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, RgbSprite[] param3, int param4, BitmapFont param5, int param6, byte param7, RgbSprite[] param8, boolean param9, int param10, int param11) {
        try {
          int var12_int = 11 / ((18 - param7) / 37);
          IsaacRandom.a(param10, param1, param2, param5, param0, param8, param3, param6, param5, param0, param4, -98, param11, param10, param9);
        } catch (RuntimeException runtimeException) {
          throw ValidationStatusIcon.wrapClientException((Throwable) ((Object) runtimeException), "kl.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ',' + param9 + ',' + param10 + ',' + param11 + ')');
        }
    }

    DiskCacheWorker(PlatformTaskDispatcher param0) {
        PlatformTask var2 = null;
        this.field_a = new ci();
        this.field_d = false;
        this.field_c = 0;
        try {
          var2 = param0.requestThreadStart((Runnable) (this), false, 5);
          while (0 == var2.status) {
            BufferedSocket.sleepMillis(0, 10L);
          }
          if (var2.status == 2) {
            throw new RuntimeException();
          }
          this.field_b = (Thread) (var2.result);
        } catch (RuntimeException runtimeException) {
          throw ValidationStatusIcon.wrapClientException((Throwable) ((Object) runtimeException), "kl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
