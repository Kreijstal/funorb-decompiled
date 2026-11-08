/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CacheIoWorker implements Runnable {
    static ToolkitSprite field_b;
    private SecondaryNodeQueue requests;
    private Thread thread;
    int queuedCount;
    private boolean stopping;

    final CacheIoRequest readImmediate(SectorCacheStore store, int guard, int groupId) {
        CacheIoRequest var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        Object var6 = null;
        CacheIoRequest var7 = null;
        int var9 = 0;
        CacheIoRequest stackIn_9_0 = null;
        CacheIoRequest stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        Throwable decompiledCaughtException = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          var4 = new CacheIoRequest();
          var5 = 29 % ((guard + 44) / 48);
          var4.operation = 1;
          var6 = this.requests;
          synchronized (var6) {
            var7 = (CacheIoRequest) (this.requests.first(110));
            while (var7 != null) {
              if (~(long)groupId == ~var7.secondaryKey &&
                var7.store == store &&
                var7.operation == 2) {
                var4.pending = false;
                var4.bytes = var7.bytes;
                stackIn_9_0 = var4;
                return stackIn_9_0;
              }
              var7 = (CacheIoRequest) (this.requests.next(-2));
            }
          }
          var4.bytes = store.read(101, groupId);
          var4.urgent = true;
          var4.pending = false;
          stackIn_16_0 = var4;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_19_0 = var4_ref;
          stackIn_19_1 = new StringBuilder().append("ti.G(");
          if (store == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(guard).append(',').append(groupId).append(')').toString());
        }
    }

    final void shutdown(int guard) {
        try {
          this.stopping = true;
          synchronized (this.requests) {
            this.requests.notifyAll();
          }
          try {
            this.thread.join();
          } catch (InterruptedException interruptedException) {
          }
          this.thread = null;
          int var2 = -15 / ((49 - guard) / 40);
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(boolean param0, CharSequence param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            CacheIoWorker.releaseStatics(27);
          }
          stackIn_3_0 = qc.a(param1, 38, false);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ti.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        int var1 = 40 % ((-17 - param0) / 45);
        field_b = null;
    }

    private final void enqueue(CacheIoRequest request, boolean guard) {
        RuntimeException var3 = null;
        SectorCacheStore var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        Object var3_ref = null;
        try {
          var3_ref = this.requests;
          synchronized (var3_ref) {
            this.requests.addLast((DualLinkNode) (request), (byte) -120);
            this.queuedCount = this.queuedCount + 1;
            this.requests.notifyAll();
          }
          if (guard) {
            return;
          }
          var5 = (SectorCacheStore) null;
          this.readImmediate((SectorCacheStore) null, 93, 98);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ti.C(");
          if (request == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(guard).append(')').toString());
        }
    }

    final CacheIoRequest enqueueWrite(int groupId, byte[] bytes, int operation, SectorCacheStore store) {
        CacheIoRequest var5 = null;
        RuntimeException var5_ref = null;
        CacheIoRequest stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new CacheIoRequest();
          var5.secondaryKey = (long)groupId;
          var5.store = store;
          var5.bytes = bytes;
          var5.urgent = false;
          var5.operation = operation;
          this.enqueue(var5, true);
          stackIn_1_0 = var5;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_4_0 = var5_ref;
          stackIn_4_1 = new StringBuilder().append("ti.B(").append(groupId).append(',');
          if (bytes == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(operation).append(',');
          if (store == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final CacheIoRequest enqueueRead(int groupId, int guard, SectorCacheStore store) {
        CacheIoRequest var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        CacheIoRequest stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new CacheIoRequest();
          var4.operation = 3;
          var4.secondaryKey = (long)groupId;
          var5 = 119 % ((56 - guard) / 55);
          var4.urgent = false;
          var4.store = store;
          this.enqueue(var4, true);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("ti.D(").append(groupId).append(',').append(guard).append(',');
          if (store == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    CacheIoWorker(PlatformTaskDispatcher taskDispatcher) {
        PlatformTask var2 = null;
        this.requests = new SecondaryNodeQueue();
        this.stopping = false;
        this.queuedCount = 0;
        try {
          var2 = taskDispatcher.a(true, (Runnable) (this), 5);
          while (0 == var2.status) {
            tg.a(10L, (byte) 119);
          }
          if (var2.status == 2) {
            throw new RuntimeException();
          }
          this.thread = (Thread) (var2.result);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ti.<init>(" + (taskDispatcher != null ? "{...}" : "null") + ')');
        }
    }

    public final void run() {
        try {
          InterruptedException interruptedException = null;
          Object var2 = null;
          int var5 = 0;
          CacheIoRequest var7 = null;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          String var6 = null;
          var5 = Sumoblitz.field_L ? 1 : 0;
          while (!this.stopping) {
            var2 = this.requests;
            synchronized (var2) {
              var7 = (CacheIoRequest) (this.requests.removeFirst((byte) 72));
              if (var7 == null) {
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
              if (var7.operation == 2) {
                var7.store.write(var7.bytes, (int)var7.secondaryKey, var7.bytes.length, 0);
                var7.pending = false;
              } else {
                if (var7.operation == 3) {
                  var7.bytes = var7.store.read(85, (int)var7.secondaryKey);
                  var7.pending = false;
                } else {
                  var7.pending = false;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              IntrusiveNode.reportClientError((String) null, (Throwable) ((Object) var2_ref), 0);
              var7.pending = false;
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
