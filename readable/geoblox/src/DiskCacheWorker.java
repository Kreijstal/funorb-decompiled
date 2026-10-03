/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DiskCacheWorker implements Runnable {
    static int[] avatarTintPalette;
    private SecondaryDeque requestQueue;
    static int field_a;
    static al field_l;
    static String createPasswordContainsEmailAlertText;
    int queuedRequestCount;
    private Thread workerThread;
    static int avatarFeedbackFrameIndex;
    static ob field_e;
    private boolean stopRequested;
    static wa field_f;
    static long field_c;

    public static void a(int param0) {
        if (param0 < -35) {
            field_e = null;
            avatarTintPalette = null;
            field_f = null;
            createPasswordContainsEmailAlertText = null;
            field_l = null;
            return;
        }
        field_e = (ob) null;
        field_e = null;
        avatarTintPalette = null;
        field_f = null;
        createPasswordContainsEmailAlertText = null;
        field_l = null;
    }

    final DiskArchiveRequest queueWrite(byte methodGuard, int groupId, DiskArchiveCache diskCache, byte[] bytes) {
        DiskArchiveRequest request = null;
        RuntimeException writeFailureForContext = null;
        DiskArchiveRequest guardResultBeforeReturn = null;
        DiskArchiveRequest writeRequestBeforeReturn = null;
        RuntimeException writeFailureBeforeContext = null;
        StringBuilder writeMessagePrefix = null;
        String diskCacheDescription = null;
        StringBuilder writeMessageBeforeBytes = null;
        String bytesDescription = null;
        RuntimeException caughtWriteFailure = null;
        try {
          request = new DiskArchiveRequest();
          request.bytes = bytes;
          request.priority = false;
          request.secondaryKey = (long)groupId;
          request.operationType = 2;
          request.diskCache = diskCache;
          if (methodGuard <= 41) {
            guardResultBeforeReturn = (DiskArchiveRequest) null;
            return guardResultBeforeReturn;
          }
          this.enqueueRequest(request, 15079962);
          writeRequestBeforeReturn = (DiskArchiveRequest) (request);
          return writeRequestBeforeReturn;
        } catch (java.lang.RuntimeException writeFailure) {
          caughtWriteFailure = writeFailure;
          writeFailureForContext = caughtWriteFailure;
          writeFailureBeforeContext = (RuntimeException) (writeFailureForContext);
          writeMessagePrefix = new StringBuilder().append("uf.G(").append(methodGuard).append(',').append(groupId).append(',');
          if (diskCache == null) {
            diskCacheDescription = "null";
          } else {
            diskCacheDescription = "{...}";
          }
          writeMessageBeforeBytes = ((StringBuilder) (Object) writeMessagePrefix).append(diskCacheDescription).append(',');
          if (bytes == null) {
            bytesDescription = "null";
          } else {
            bytesDescription = "{...}";
          }
          throw t.a((Throwable) ((Object) writeFailureBeforeContext), ((StringBuilder) (Object) writeMessageBeforeBytes).append(bytesDescription).append(')').toString());
        }
    }

    final DiskArchiveRequest readSynchronously(DiskArchiveCache diskCache, int groupId, int methodGuard) {
        DiskArchiveRequest request = null;
        RuntimeException readFailureForContext = null;
        Object queueMonitor = null;
        DiskArchiveRequest queuedRequest = null;
        int unusedClientGuardSnapshot = 0;
        DiskArchiveRequest reusedWriteRequestBeforeReturn = null;
        DiskArchiveRequest readRequestBeforeReturn = null;
        RuntimeException readFailureBeforeContext = null;
        StringBuilder readMessagePrefix = null;
        String diskCacheDescription = null;
        Throwable caughtReadFailure = null;
        unusedClientGuardSnapshot = Geoblox.field_C;
        try {
          request = new DiskArchiveRequest();
          if (methodGuard != 15079962) {
            field_a = -116;
          }
          request.operationType = 1;
          queueMonitor = this.requestQueue;
          synchronized (queueMonitor) {
            L1: {
              queuedRequest = (DiskArchiveRequest) ((Object) this.requestQueue.firstForIteration((byte) 121));
              L2: while (queuedRequest != null) {
                if ((long)groupId == queuedRequest.secondaryKey) {
                  if (queuedRequest.diskCache == diskCache) {
                    if (2 == queuedRequest.operationType) {
                      request.bytes = queuedRequest.bytes;
                      request.pending = false;
                      reusedWriteRequestBeforeReturn = (DiskArchiveRequest) (request);
                      return reusedWriteRequestBeforeReturn;
                    }
                  }
                }
                queuedRequest = (DiskArchiveRequest) ((Object) this.requestQueue.nextForIteration(-20));
              }
              break L1;
            }
          }
          request.bytes = diskCache.read(groupId, (byte) -78);
          request.priority = true;
          request.pending = false;
          readRequestBeforeReturn = (DiskArchiveRequest) (request);
          return readRequestBeforeReturn;
        } catch (java.lang.RuntimeException readFailure) {
          caughtReadFailure = readFailure;
          readFailureForContext = (RuntimeException) (Object) caughtReadFailure;
          readFailureBeforeContext = (RuntimeException) (readFailureForContext);
          readMessagePrefix = new StringBuilder().append("uf.F(");
          if (diskCache == null) {
            diskCacheDescription = "null";
          } else {
            diskCacheDescription = "{...}";
          }
          throw t.a((Throwable) ((Object) readFailureBeforeContext), ((StringBuilder) (Object) readMessagePrefix).append(diskCacheDescription).append(',').append(groupId).append(',').append(methodGuard).append(')').toString());
        }
    }

    private final void enqueueRequest(DiskArchiveRequest request, int methodGuard) {
        Object queueMonitorOrFailureForContext = null;
        Throwable unusedThrowableSnapshot = null;
        Object enqueueFailureBeforeContext = null;
        StringBuilder enqueueMessagePrefix = null;
        String requestDescription = null;
        Throwable caughtEnqueueFailure = null;
        try {
          queueMonitorOrFailureForContext = this.requestQueue;
          synchronized (queueMonitorOrFailureForContext) {
            this.requestQueue.addLast(-128, request);
            if (methodGuard != 15079962) {
              return;
            }
            this.queuedRequestCount = this.queuedRequestCount + 1;
            this.requestQueue.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException enqueueFailure) {
          caughtEnqueueFailure = enqueueFailure;
          queueMonitorOrFailureForContext = (RuntimeException) (Object) caughtEnqueueFailure;
          enqueueFailureBeforeContext = queueMonitorOrFailureForContext;
          enqueueMessagePrefix = new StringBuilder().append("uf.A(");
          if (request == null) {
            requestDescription = "null";
          } else {
            requestDescription = "{...}";
          }
          throw t.a((Throwable) ((Object) enqueueFailureBeforeContext), ((StringBuilder) (Object) enqueueMessagePrefix).append(requestDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    final static int a(byte param0, String param1, int param2, int param3, String param4, String param5, boolean param6) {
        mb var7 = null;
        RuntimeException var7_ref = null;
        mb var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = new mb(param5);
          var8 = new mb(param4);
          if (param0 != -94) {
            field_e = (ob) null;
          }
          stackIn_3_0 = pf.a(param3, param2, var7, var8, param1, param6, 100);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_6_0 = (RuntimeException) (var7_ref);
          stackIn_6_1 = new StringBuilder().append("uf.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param6).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        if (param0 < 87) {
            String var3 = (String) null;
            DiskCacheWorker.a((byte) -87, (String) null, -112, 119, (String) null, (String) null, false);
        }
    }

    final void shutdown(byte methodGuard) {
        try {
            this.stopRequested = true;
            synchronized (this.requestQueue) {
                this.requestQueue.notifyAll();
            }
            if (methodGuard != 51) {
                return;
            }
            try {
                this.workerThread.join();
            } catch (InterruptedException joinInterruptedException) {
            }
            this.workerThread = null;
        } catch (RuntimeException | Error uncheckedShutdownFailure) {
            throw uncheckedShutdownFailure;
        } catch (Throwable checkedShutdownFailure) {
            throw new RuntimeException(checkedShutdownFailure);
        }
    }

    final DiskArchiveRequest queueRead(int methodGuard, DiskArchiveCache diskCache, int groupId) {
        DiskArchiveRequest request = null;
        RuntimeException readFailureForContext = null;
        DiskArchiveRequest readRequestBeforeReturn = null;
        RuntimeException readFailureBeforeContext = null;
        StringBuilder readMessagePrefix = null;
        String diskCacheDescription = null;
        RuntimeException caughtReadFailure = null;
        try {
          request = new DiskArchiveRequest();
          request.operationType = 3;
          request.diskCache = diskCache;
          request.priority = false;
          request.secondaryKey = (long)groupId;
          if (methodGuard < 22) {
            DiskCacheWorker.a(70);
          }
          this.enqueueRequest(request, 15079962);
          readRequestBeforeReturn = (DiskArchiveRequest) (request);
          return readRequestBeforeReturn;
        } catch (java.lang.RuntimeException readFailure) {
          caughtReadFailure = readFailure;
          readFailureForContext = caughtReadFailure;
          readFailureBeforeContext = (RuntimeException) (readFailureForContext);
          readMessagePrefix = new StringBuilder().append("uf.D(").append(methodGuard).append(',');
          if (diskCache == null) {
            diskCacheDescription = "null";
          } else {
            diskCacheDescription = "{...}";
          }
          throw t.a((Throwable) ((Object) readFailureBeforeContext), ((StringBuilder) (Object) readMessagePrefix).append(diskCacheDescription).append(',').append(groupId).append(')').toString());
        }
    }

    public final void run() {
        try {
            InterruptedException waitInterruptedException = null;
            Object queueMonitor = null;
            int unusedClientGuardSnapshot = 0;
            DiskArchiveRequest request = null;
            int requestSelected = 0;
            int completeRequestAfterOperation = 0;
            Throwable caughtWorkerFailure = null;
            Exception operationFailure = null;
            String unusedFailureMessageSnapshot = null;
            unusedClientGuardSnapshot = Geoblox.field_C;
            L0: while (!this.stopRequested) {
              queueMonitor = this.requestQueue;
              synchronized (queueMonitor) {
                request = (DiskArchiveRequest) ((Object) this.requestQueue.removeFirst(true));
                if (request == null) {
                  try {
                    this.requestQueue.wait();
                  } catch (java.lang.InterruptedException waitInterruption) {
                    caughtWorkerFailure = waitInterruption;
                    waitInterruptedException = (InterruptedException) (Object) caughtWorkerFailure;
                  }
                  requestSelected = 0;
                } else {
                  this.queuedRequestCount = this.queuedRequestCount - 1;
                  requestSelected = 1;
                }
              }
              if (requestSelected == 0) {
                continue L0;
              }
              try {
                L4: {
                  if (request.operationType != 2) {
                    if (3 == request.operationType) {
                      request.bytes = request.diskCache.read((int)request.secondaryKey, (byte) -76);
                      completeRequestAfterOperation = 1;
                      break L4;
                    }
                    request.pending = false;
                  } else {
                    request.diskCache.write(request.bytes, (byte) -53, (int)request.secondaryKey, request.bytes.length);
                    request.pending = false;
                  }
                  completeRequestAfterOperation = 0;
                }
              } catch (java.lang.Exception requestOperationFailure) {
                caughtWorkerFailure = requestOperationFailure;
                operationFailure = (Exception) (Object) caughtWorkerFailure;
                unusedFailureMessageSnapshot = (String) null;
                gi.a((Throwable) ((Object) operationFailure), (String) null, (byte) 125);
                completeRequestAfterOperation = 1;
              }
              if (completeRequestAfterOperation == 0) {
                continue L0;
              }
              request.pending = false;
            }
        } catch (RuntimeException | Error uncheckedWorkerFailure) {
            throw uncheckedWorkerFailure;
        } catch (Throwable checkedWorkerFailure) {
            throw new RuntimeException(checkedWorkerFailure);
        }
    }

    DiskCacheWorker(PlatformTaskDispatcher taskDispatcher) {
        PlatformTask threadTask = null;
        this.requestQueue = new SecondaryDeque();
        this.queuedRequestCount = 0;
        this.stopRequested = false;
        try {
            threadTask = taskDispatcher.startThread((Runnable) (this), 0, 5);
            while (threadTask.status == 0) {
                bc.sleepMillis(0, 10L);
            }
            if (2 == threadTask.status) {
                throw new RuntimeException();
            }
            this.workerThread = (Thread) (threadTask.result);
        } catch (RuntimeException constructionFailure) {
            throw t.a((Throwable) ((Object) constructionFailure), "uf.<init>(" + (taskDispatcher != null ? "{...}" : "null") + ')');
        }
    }

    static {
        avatarTintPalette = new int[]{5167632, 12183066, 16031008, 15087386, 15079962};
        createPasswordContainsEmailAlertText = "This password contains your email address, and would be easy to guess";
        avatarFeedbackFrameIndex = 0;
        field_l = new al();
    }
}
