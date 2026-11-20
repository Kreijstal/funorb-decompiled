/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveDiskWorker implements Runnable {
    private SecondaryNodeQueue field_d;
    private boolean stopped;
    int pendingCount;
    static String field_a;
    private Thread thread;

    private final void enqueue(int param0, DiskArchiveRequest param1) {
        synchronized (this.field_d) {
          if (param0 != 0) {
            ArchiveDiskWorker.clearSharedReferences(102);
          }
          this.field_d.addLast(param1, param0 ^ -108);
          this.pendingCount = this.pendingCount + 1;
          this.field_d.notifyAll();
        }
    }

    final DiskArchiveRequest readSynchronously(int param0, ArchiveDisk param1, byte param2) {
        DiskArchiveRequest var4 = null;
        RuntimeException var4_ref = null;
        Object var5_ref_Object = null;
        int var5 = 0;
        DiskArchiveRequest var6 = null;
        int var8 = 0;
        DiskArchiveRequest stackIn_8_0 = null;
        DiskArchiveRequest stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = VoidHunters.field_G;
        try {
          var4 = new DiskArchiveRequest();
          var4.operation = 1;
          var5_ref_Object = this.field_d;
          synchronized (var5_ref_Object) {
            var6 = (DiskArchiveRequest) (this.field_d.first((byte) -54));
            while (var6 != null) {
              if (~var6.secondaryKey == ~(long)param0 &&
                var6.archiveDisk == param1 &&
                2 == var6.operation) {
                var4.pending = false;
                var4.data = var6.data;
                stackIn_8_0 = var4;
                return stackIn_8_0;
              }
              var6 = (DiskArchiveRequest) (this.field_d.next(1900));
            }
          }
          var4.data = param1.read((byte) 64, param0);
          var5 = 91 / ((param2 - 0) / 60);
          var4.pending = false;
          var4.priority = true;
          stackIn_15_0 = var4;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_18_0 = var4_ref;
          stackIn_18_1 = new StringBuilder().append("pfa.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(')').toString());
        }
    }

    final DiskArchiveRequest enqueueWrite(ArchiveDisk param0, byte[] param1, byte param2, int param3) {
        DiskArchiveRequest var5 = null;
        RuntimeException var5_ref = null;
        DiskArchiveRequest stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 <= 73) {
            field_a = (String) null;
          }
          var5 = new DiskArchiveRequest();
          var5.archiveDisk = param0;
          var5.operation = 2;
          var5.priority = false;
          var5.data = param1;
          var5.secondaryKey = (long)param3;
          this.enqueue(0, var5);
          stackIn_3_0 = var5;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_6_0 = var5_ref;
          stackIn_6_1 = new StringBuilder().append("pfa.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final DiskArchiveRequest enqueueRead(byte param0, ArchiveDisk param1, int param2) {
        DiskArchiveRequest var4 = null;
        RuntimeException var4_ref = null;
        DiskArchiveRequest stackIn_2_0 = null;
        DiskArchiveRequest stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new DiskArchiveRequest();
          var4.operation = 3;
          var4.archiveDisk = param1;
          var4.priority = false;
          var4.secondaryKey = (long)param2;
          this.enqueue(param0 - 121, var4);
          if (param0 == 121) {
            stackIn_4_0 = var4;
            return stackIn_4_0;
          }
          stackIn_2_0 = (DiskArchiveRequest) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("pfa.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    final void shutdown(int param0) {
        try {
          this.stopped = true;
          synchronized (this.field_d) {
            if (param0 != 23474) {
              field_a = (String) null;
            }
            this.field_d.notifyAll();
          }
          try {
            this.thread.join();
          } catch (InterruptedException interruptedException) {
          }
          this.thread = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void clearSharedReferences(int param0) {
        field_a = null;
        if (param0 <= 62) {
          ArchiveDiskWorker.clearSharedReferences(-80);
        }
    }

    ArchiveDiskWorker(PlatformService param0) {
        PlatformRequest var2 = null;
        this.field_d = new SecondaryNodeQueue();
        this.pendingCount = 0;
        this.stopped = false;
        try {
          var2 = param0.startThread(0, 5, (Runnable) (this));
          while (0 == var2.status) {
            BufferedFile.sleep(-52, 10L);
          }
          if (var2.status == 2) {
            throw new RuntimeException();
          }
          this.thread = (Thread) (var2.result);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "pfa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
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
          var5 = VoidHunters.field_G;
          while (!this.stopped) {
            var2 = this.field_d;
            synchronized (var2) {
              var7 = (DiskArchiveRequest) (this.field_d.removeFirst((byte) -120));
              if (var7 != null) {
                this.pendingCount = this.pendingCount - 1;
                decompiledRegionSelector0 = 1;
              } else {
                try {
                  this.field_d.wait();
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
              if (var7.operation == 2) {
                var7.archiveDisk.write((int)var7.secondaryKey, 520, var7.data, var7.data.length);
                var7.pending = false;
              } else {
                if (var7.operation != 3) {
                  decompiledRegionSelector1 = 0;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  var7.data = var7.archiveDisk.read((byte) 120, (int)var7.secondaryKey);
                  var7.pending = false;
                }
              }
              if (decompiledFrameRemainder0) {
                decompiledRegionSelector1 = 1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              FractalNoiseVolumeGenerator.reportClientError((Throwable) ((Object) var2_ref), (String) null, 0);
              decompiledRegionSelector1 = 0;
            }
            if (decompiledRegionSelector1 != 0) {
              continue;
            }
            var7.pending = false;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_a = "Pelican chassis";
    }
}
