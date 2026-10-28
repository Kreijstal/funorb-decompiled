/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DiskCacheWorker implements Runnable {
    static String[] field_d;
    private SecondaryIntrusiveDeque requests;
    static String field_a;
    private Thread thread;
    private boolean stopping;
    int pendingCount;

    public static void releaseStatics(int guard) {
        if (guard != -4) {
          return;
        }
        field_a = null;
        field_d = null;
    }

    final void shutdown(int guard) {
        try {
          this.stopping = true;
          synchronized (this.requests) {
            this.requests.notifyAll();
            if (guard != -24580) {
              field_a = (String) null;
            }
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

    final DiskCacheRequest readImmediate(SectorCacheStore store, int guard, int groupId) {
        String stackIn_22_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          if (guard <= 33) {
            this.pendingCount = 88;
          }
          DiskCacheRequest var4 = new DiskCacheRequest();
          var4.operation = 1;
          Object var5 = this.requests;
          synchronized (var5) {
            DiskCacheRequest var6 = (DiskCacheRequest) (this.requests.first(0));
            while (var6 != null) {
              if ((long)groupId == var6.secondaryKey &&
                store == var6.store &&
                var6.operation == 2) {
                var4.pending = false;
                var4.data = var6.data;
                DiskCacheRequest stackIn_11_0 = var4;
                return stackIn_11_0;
              }
              var6 = (DiskCacheRequest) (this.requests.next((byte) 116));
            }
          }
          var4.data = store.read(groupId, 26296);
          var4.field_r = true;
          var4.pending = false;
          DiskCacheRequest stackIn_18_0 = var4;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          Throwable decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          RuntimeException stackIn_21_0 = var4_ref;
          StringBuilder stackIn_21_1 = new StringBuilder().append("kk.B(");
          if (store == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(guard).append(',').append(groupId).append(')').toString());
        }
    }

    public final void run() {
        try {
          DiskCacheRequest var7 = null;
          boolean decompiledRegionSelector0 = false;
          boolean decompiledRegionSelector1 = false;
          Throwable decompiledCaughtException = null;
          int var5 = EscapeVector.obfuscationControl;
          while (!this.stopping) {
            Object var2 = this.requests;
            synchronized (var2) {
              var7 = (DiskCacheRequest) (this.requests.removeFirst((byte) -75));
              if (var7 == null) {
                try {
                  this.requests.wait();
                } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  InterruptedException interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                }
                decompiledRegionSelector0 = false;
              } else {
                this.pendingCount = this.pendingCount - 1;
                decompiledRegionSelector0 = true;
              }
            }
            if (!decompiledRegionSelector0) {
              continue;
            }
            try {
              boolean decompiledFrameRemainder0 = true;
              if (var7.operation == 2) {
                var7.store.write((byte) 18, (int)var7.secondaryKey, var7.data.length, var7.data);
                var7.pending = false;
              } else if (var7.operation != 3) {
                decompiledRegionSelector1 = false;
                decompiledFrameRemainder0 = false;
              } else {
                var7.data = var7.store.read((int)var7.secondaryKey, 26296);
                var7.pending = false;
              }
              if (decompiledFrameRemainder0) {
                decompiledRegionSelector1 = true;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              Exception var2_ref = (Exception) (Object) decompiledCaughtException;
              String var6 = (String) null;
              GameModeSelectScreen.reportClientError(false, (String) null, (Throwable) ((Object) var2_ref));
              decompiledRegionSelector1 = false;
            }
            if (decompiledRegionSelector1) {
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

    final DiskCacheRequest enqueueOperation(byte[] data, int groupId, int operation, SectorCacheStore store) {
        String stackIn_5_2 = null;
        String stackIn_8_2 = null;
        try {
          DiskCacheRequest var5 = new DiskCacheRequest();
          var5.data = data;
          var5.store = store;
          var5.secondaryKey = (long)groupId;
          var5.field_r = false;
          var5.operation = operation;
          this.enqueue(-3, var5);
          DiskCacheRequest stackIn_1_0 = var5;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5_ref = decompiledCaughtException;
          RuntimeException stackIn_4_0 = var5_ref;
          StringBuilder stackIn_4_1 = new StringBuilder().append("kk.A(");
          if (data == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          StringBuilder stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(groupId).append(',').append(operation).append(',');
          if (store == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final void enqueue(int guard, DiskCacheRequest request) {
        synchronized (this.requests) {
          this.requests.addLast(-1, request);
          this.pendingCount = this.pendingCount + 1;
          if (guard != -3) {
            field_a = (String) null;
          }
          this.requests.notifyAll();
        }
    }

    final DiskCacheRequest enqueueRead(byte guard, SectorCacheStore store, int groupId) {
        String stackIn_7_2 = null;
        try {
          DiskCacheRequest var4 = new DiskCacheRequest();
          var4.field_r = false;
          var4.operation = 3;
          var4.secondaryKey = (long)groupId;
          var4.store = store;
          this.enqueue(-3, var4);
          if (guard > -42) {
            this.stopping = true;
          }
          DiskCacheRequest stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4_ref = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var4_ref;
          StringBuilder stackIn_6_1 = new StringBuilder().append("kk.C(").append(guard).append(',');
          if (store == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(groupId).append(')').toString());
        }
    }

    DiskCacheWorker(SystemTaskService taskService) {
        this.requests = new SecondaryIntrusiveDeque();
        this.stopping = false;
        this.pendingCount = 0;
        try {
          SystemTask var2 = taskService.startThread(true, 5, (Runnable) (this));
          while (var2.status == 0) {
            AchievementTracker.sleepMillis((byte) 121, 10L);
          }
          if (var2.status == 2) {
            throw new RuntimeException();
          }
          this.thread = (Thread) (var2.result);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "kk.<init>(" + (taskService != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_a = "This password is part of your Player Name, and would be easy to guess";
    }
}
