/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CachedArchiveProvider extends ArchiveProvider {
    private DiskCacheWorker diskWorker;
    private int expectedChecksum;
    private int archiveId;
    private Js5Index index;
    private DiskCacheStore groupStore;
    private IntrusiveNodeHashTable requests;
    private ArchiveRequest field_v;
    private byte[] groupValidity;
    private DiskCacheStore indexStore;
    private Js5Transport transport;
    private int expectedRevision;
    private byte[] expectedDigest;
    static IntrusiveDeque field_t;
    private IntrusiveDeque field_p;
    private int field_o;
    static int field_f;
    private IntrusiveDeque field_u;
    private boolean field_j;
    private boolean field_r;
    private boolean field_e;
    private long field_h;

    final void processRequestedGroups(int param0) {
        int var3 = 0;
        ArchiveRequest discarded$0 = null;
        ArchiveRequest discarded$1 = null;
        int var4 = wizardrun.field_H;
        if (null == this.field_p) {
          return;
        }
        if (this.getIndex(false) == null) {
          return;
        }
        if (param0 != -3) {
          CachedArchiveProvider.c(16, 122);
        }
        IntrusiveNode var2 = this.field_u.first((byte) 72);
        while (var2 != null) {
          var3 = (int)var2.key;
          if (var3 < 0) {
            var2.unlink(false);
          } else {
            if (var3 >= this.index.groupCapacity) {
              var2.unlink(false);
            } else {
              if (0 == this.index.fileCounts[var3]) {
                var2.unlink(false);
              } else {
                if (this.groupValidity[var3] == 0) {
                  discarded$0 = this.requestGroup(-23529, 1, var3);
                }
                if (-1 == this.groupValidity[var3]) {
                  discarded$1 = this.requestGroup(-23529, 2, var3);
                }
                if (this.groupValidity[var3] == 1) {
                  var2.unlink(false);
                }
              }
            }
          }
          var2 = this.field_u.next(param0 ^ -8195);
        }
    }

    final void serviceBackgroundLoading(byte param0) {
        ArchiveRequest discarded$3 = null;
        ArchiveRequest discarded$2 = null;
        ArchiveRequest discarded$1 = null;
        ArchiveRequest discarded$0 = null;
        int var2_int;
        ArchiveRequest var2;
        IntrusiveNode var3;
        int var4;
        int var5;
        IntrusiveNode var6;
        IntrusiveNode var7;
        int var2_intLifetime1;
        int var4Lifetime1;
        IntrusiveNode var3Lifetime1;
        var5 = wizardrun.field_H;
        if (param0 != 25) {
          this.field_o = -118;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_p != null) {
          if (null == this.getIndex(false)) {
            return;
          }
          if (this.field_r) {
            var2_int = 1;
            var3 = this.field_p.first((byte) 83);
            while (var3 != null) {
              var4 = (int)var3.key;
              if (0 == this.groupValidity[var4]) {
                discarded$3 = this.requestGroup(-23529, 1, var4);
              }
              if (this.groupValidity[var4] != 0) {
                var3.unlink(false);
              } else {
                var2_int = 0;
              }
              var3 = this.field_p.next(8192);
            }
            scanLoop1: while (true) {
              if (this.index.fileCounts.length > this.field_o) {
                if (this.index.fileCounts[this.field_o] != 0) {
                  if (this.diskWorker.field_b >= 250) {
                    var2_int = 0;
                    break scanLoop1;
                  }
                  if (0 == this.groupValidity[this.field_o]) {
                    discarded$2 = this.requestGroup(-23529, 1, this.field_o);
                  }
                  if (0 == this.groupValidity[this.field_o]) {
                    var6 = new IntrusiveNode();
                    var6.key = (long)this.field_o;
                    var2_int = 0;
                    this.field_p.addLast(var6, false);
                  }
                }
                this.field_o = this.field_o + 1;
                continue;
              }
              break;
            }
            if ((var2_int != 0)) {
              this.field_o = 0;
              this.field_r = false;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_j) {
              var2_intLifetime1 = 1;
              var3Lifetime1 = this.field_p.first((byte) 73);
              while (var3Lifetime1 != null) {
                var4Lifetime1 = (int)var3Lifetime1.key;
                if (this.groupValidity[var4Lifetime1] != 1) {
                  discarded$1 = this.requestGroup(-23529, 2, var4Lifetime1);
                }
                if (this.groupValidity[var4Lifetime1] != 1) {
                  var2_intLifetime1 = 0;
                } else {
                  var3Lifetime1.unlink(false);
                }
                var3Lifetime1 = this.field_p.next(8192);
              }
              while (this.field_o < this.index.fileCounts.length) {
                if (this.index.fileCounts[this.field_o] == 0) {
                  this.field_o = this.field_o + 1;
                  continue;
                }
                if (!this.transport.isNormalQueueFull(-21)) {
                  if (1 != this.groupValidity[this.field_o]) {
                    discarded$0 = this.requestGroup(-23529, 2, this.field_o);
                  }
                  if (this.groupValidity[this.field_o] != 1) {
                    var7 = new IntrusiveNode();
                    var7.key = (long)this.field_o;
                    this.field_p.addLast(var7, false);
                    var2_intLifetime1 = 0;
                  }
                  this.field_o = this.field_o + 1;
                  continue;
                }
                var2_intLifetime1 = 0;
                break;
              }
              if ((var2_intLifetime1 != 0)) {
                this.field_o = 0;
                this.field_j = false;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_p = null;
            }
          }
        }
        if (!this.field_e) {
          return;
        }
        if (MonotonicClockHelpers.monotonicMillis((byte) 100) < this.field_h) {
          return;
        }
        var2 = (ArchiveRequest) (this.requests.first((byte) -114));
        while (var2 != null) {
          if (!var2.pending) {
            if (!var2.field_q) {
              var2.field_q = true;
            } else {
              if (!var2.field_r) {
                throw new RuntimeException();
              }
              var2.unlink(false);
            }
          }
          var2 = (ArchiveRequest) (this.requests.next(param0 ^ 24));
        }
        this.field_h = 1000L + MonotonicClockHelpers.monotonicMillis((byte) 67);
        return;
    }

    private final ArchiveRequest requestGroup(int param0, int param1, int param2) {
        Object stackIn_91_0 = null;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        byte[] var5 = null;
        int var6_int = 0;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ArchiveRequest var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        var10 = wizardrun.field_H;
        if (param0 != -23529) {
          return (ArchiveRequest) null;
        }
        var12 = (ArchiveRequest) (this.requests.get(1, (long)param2));
        var4 = var12;
        if (var12 != null &&
          param1 == 0 &&
          !var12.field_r &&
          var12.pending) {
          var12.unlink(false);
          var4 = null;
        }
        if (var4 == null) {
          if (param1 == 0) {
            if (this.groupStore != null &&
              this.groupValidity[param2] != -1) {
              var4 = this.diskWorker.readSynchronously(param2, 1, this.groupStore);
            } else {
              if (this.transport.isPriorityQueueFull(3473)) {
                return null;
              }
              var4 = this.transport.request(this.archiveId, param2, (byte) -85, (byte) 2, true);
            }
          } else {
            if (param1 != 1) {
              if (param1 != 2) {
                throw new RuntimeException();
              }
              if (null == this.groupStore) {
                throw new RuntimeException();
              }
              if (this.groupValidity[param2] != -1) {
                throw new RuntimeException();
              }
              if (this.transport.isNormalQueueFull(-21)) {
                return null;
              }
              var4 = this.transport.request(this.archiveId, param2, (byte) -73, (byte) 2, false);
            } else {
              if (null == this.groupStore) {
                throw new RuntimeException();
              }
              var4 = this.diskWorker.queueRead((byte) -46, param2, this.groupStore);
            }
          }
          this.requests.put((IntrusiveNode) (var4), param0 + 23462, (long)param2);
        }
        if (((ArchiveRequest) (var4)).pending) {
          return null;
        }
        var18 = ((ArchiveRequest) (var4)).getData(95);
        var13 = var18;
        var5 = var13;
        if (!(var4 instanceof DiskCacheRequest)) {
          try {
            if (var5 != null &&
              var18.length > 2) {
              DualLinkNode.field_j.reset();
              DualLinkNode.field_j.update(var5, 0, -2 + var18.length);
              var6_int = (int)DualLinkNode.field_j.getValue();
              if (this.index.groupChecksums[param2] != var6_int) {
                throw new RuntimeException();
              }
              if (null != this.index.groupDigests &&
                null != this.index.groupDigests[param2]) {
                var28 = this.index.groupDigests[param2];
                var27 = id.whirlpoolDigest(var5, 0, var18.length - 2, 0);
                for (var9 = 0; 64 > var9; var9++) {
                  if (~var27[var9] != ~var28[var9]) {
                    throw new RuntimeException();
                  }
                }
              }
              this.transport.field_k = 0;
              this.transport.field_n = 0;
            } else {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            this.transport.resetAfterError(true);
            ((ArchiveRequest) (var4)).unlink(false);
            if (((ArchiveRequest) (var4)).field_r &&
              !this.transport.isPriorityQueueFull(3473)) {
              var4 = this.transport.request(this.archiveId, param2, (byte) -125, (byte) 2, true);
              this.requests.put((IntrusiveNode) (var4), -115, (long)param2);
            }
            return null;
          }
          var5[-2 + var18.length] = (byte)(this.index.groupVersions[param2] >>> 8);
          var5[var18.length - 1] = (byte)this.index.groupVersions[param2];
          if (null != this.groupStore) {
            this.diskWorker.queueWrite((byte) -124, this.groupStore, var18, param2);
            if (this.groupValidity[param2] != 1) {
              this.groupValidity[param2] = (byte) 1;
            }
          }
          if (!((ArchiveRequest) (var4)).field_r) {
            ((ArchiveRequest) (var4)).unlink(false);
          }
          return (ArchiveRequest) (var4);
        }
        try {
          if (var5 != null &&
            var18.length > 2) {
            DualLinkNode.field_j.reset();
            DualLinkNode.field_j.update(var5, 0, -2 + var18.length);
            var6_int = (int)DualLinkNode.field_j.getValue();
            if (this.index.groupChecksums[param2] != var6_int) {
              throw new RuntimeException();
            }
            if (null != this.index.groupDigests &&
              null != this.index.groupDigests[param2]) {
              var30 = this.index.groupDigests[param2];
              var29 = id.whirlpoolDigest(var5, 0, -2 + var18.length, 0);
              var11 = 0;
              var9 = var11;
              while (64 > var11) {
                if (var29[var11] != var30[var11]) {
                  throw new RuntimeException();
                }
                var11++;
              }
            }
            var7 = ((255 & var5[var18.length - 2]) << 8) + (var5[-1 + var18.length] & 255);
            if (var7 != (65535 & this.index.groupVersions[param2])) {
              throw new RuntimeException();
            }
            if (this.groupValidity[param2] != 1) {
              if (this.groupValidity[param2] != 0) {
              }
              this.groupValidity[param2] = (byte) 1;
            }
            if (!((ArchiveRequest) (var4)).field_r) {
              ((ArchiveRequest) (var4)).unlink(false);
            }
            stackIn_91_0 = var4;
            return (ArchiveRequest) (stackIn_91_0);
          }
          throw new RuntimeException();
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (Exception) (Object) decompiledCaughtException;
          this.groupValidity[param2] = (byte)-1;
          ((ArchiveRequest) (var4)).unlink(false);
          if (!((ArchiveRequest) (var4)).field_r) {
            return null;
          }
          if (this.transport.isPriorityQueueFull(3473)) {
            return null;
          }
          var4 = this.transport.request(this.archiveId, param2, (byte) -123, (byte) 2, true);
          this.requests.put((IntrusiveNode) (var4), -103, (long)param2);
          return null;
        }
    }

    public static void releaseStatics(byte param0) {
        field_t = null;
        if (param0 != -8) {
          field_t = (IntrusiveDeque) null;
        }
    }

    final static void resendHighscoreRequests(int param0, int param1) {
        int var3 = 0;
        HighscoreRequest var4 = null;
        ScoreSubmission var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = wizardrun.field_H;
        try {
          var5 = (ScoreSubmission) (field_t.first((byte) 100));
          if (param0 != -28323) {
            CachedArchiveProvider.releaseStatics((byte) 68);
          }
          while (var5 != null) {
            EditableTextWidget.a(var5, param1, 123);
            var5 = (ScoreSubmission) (field_t.next(8192));
          }
          var4 = (HighscoreRequest) (Js5Index.field_l.first((byte) 91));
          while (var4 != null) {
            BoundedRandomAccessFile.a(var4, param1, (byte) 121);
            var4 = (HighscoreRequest) (Js5Index.field_l.next(8192));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ExceptionSupport.wrapException((Throwable) ((Object) var2), "fh.G(" + param0 + ',' + param1 + ')');
        }
    }

    final byte[] getGroupData(byte param0, int param1) {
        byte[] var4 = null;
        ArchiveRequest var3 = this.requestGroup(-23529, 0, param1);
        if (var3 != null) {
          var4 = var3.getData(95);
          if (param0 >= -21) {
            CachedArchiveProvider.c(-33, -78);
          }
          var3.unlink(false);
          return var4;
        }
        return null;
    }

    final static void c(int param0, int param1) {
        int var3 = 0;
        of var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = wizardrun.field_H;
        try {
          var4 = (of) (QuickChatDynamicCommand.field_b.first((byte) 96));
          if (param1 != 0) {
            field_f = 48;
          }
          while (var4 != null) {
            WeightedLruCache.a(var4, param0, (byte) -81);
            var4 = (of) (QuickChatDynamicCommand.field_b.next(param1 ^ 8192));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ExceptionSupport.wrapException((Throwable) ((Object) var2), "fh.B(" + param0 + ',' + param1 + ')');
        }
    }

    final static int unsignedByte(int param0, int param1) {
        if (param0 != 11682) {
          CachedArchiveProvider.resendHighscoreRequests(-2, 121);
        }
        param1 = (param1 & 1431655765) + ((param1 & -1431655765) >>> 1);
        param1 = ((param1 & -858993460) >>> 2) + (858993459 & param1);
        param1 = param1 + (param1 >>> 4) & 252645135;
        param1 = param1 + (param1 >>> 8);
        param1 = param1 + (param1 >>> 16);
        return 255 & param1;
    }

    final void prefetchAll(byte param0) {
        if (this.groupStore != null) {
          int var2 = -38 / ((-32 - param0) / 59);
          this.field_j = true;
          if (null == this.field_p) {
            this.field_p = new IntrusiveDeque();
          }
          return;
        }
    }

    final Js5Index getIndex(boolean param0) {
        Js5Transport stackIn_28_0 = null;
        boolean stackIn_29_1 = false;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = wizardrun.field_H;
        if (this.index != null) {
          return this.index;
        }
        if (null == this.field_v) {
          if (this.transport.isPriorityQueueFull(3473)) {
            return null;
          }
          this.field_v = (ArchiveRequest) ((Object) this.transport.request(255, this.archiveId, (byte) -119, (byte) 0, true));
        }
        if (this.field_v.pending) {
          return null;
        }
        if (param0) {
          this.serviceBackgroundLoading((byte) -59);
        }
        var7 = this.field_v.getData(95);
        var6 = var7;
        var5 = var6;
        var2 = var5;
        if (!(this.field_v instanceof DiskCacheRequest)) {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.index = new Js5Index(var7, this.expectedChecksum, this.expectedDigest);
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = decompiledCaughtException;
            stackIn_28_0 = this.transport;
            stackIn_29_1 = !(param0);
            ((Js5Transport) (Object) stackIn_28_0).resetAfterError(stackIn_29_1);
            this.index = null;
            if (this.transport.isPriorityQueueFull(3473)) {
              this.field_v = null;
            } else {
              this.field_v = (ArchiveRequest) ((Object) this.transport.request(255, this.archiveId, (byte) -88, (byte) 0, true));
            }
            return null;
          }
          if (null != this.indexStore) {
            this.diskWorker.queueWrite((byte) 0, this.indexStore, var7, this.archiveId);
          }
        } else {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.index = new Js5Index(var7, this.expectedChecksum, this.expectedDigest);
            if (this.expectedRevision != this.index.revision) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = decompiledCaughtException;
            this.index = null;
            if (this.transport.isPriorityQueueFull(3473)) {
              this.field_v = null;
            } else {
              this.field_v = (ArchiveRequest) ((Object) this.transport.request(255, this.archiveId, (byte) -100, (byte) 0, true));
            }
            return null;
          }
        }
        this.field_v = null;
        if (null != this.groupStore) {
          this.groupValidity = new byte[this.index.groupCapacity];
        }
        return this.index;
    }

    final int getGroupProgress(boolean param0, int param1) {
        ArchiveRequest var3 = (ArchiveRequest) (this.requests.get(1, (long)param1));
        if (var3 != null) {
          return var3.getProgress(false);
        }
        if (!param0) {
          return 0;
        }
        this.archiveId = -2;
        return 0;
    }

    CachedArchiveProvider(int param0, DiskCacheStore param1, DiskCacheStore param2, Js5Transport param3, DiskCacheWorker param4, int param5, byte[] param6, int param7, boolean param8) {
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        this.requests = new IntrusiveNodeHashTable(16);
        this.field_o = 0;
        this.field_u = new IntrusiveDeque();
        this.field_h = 0L;
        try {
          this.archiveId = param0;
          this.groupStore = param1;
          if (null != this.groupStore) {
            this.field_r = true;
            this.field_p = new IntrusiveDeque();
          } else {
            this.field_r = false;
          }
          stackIn_7_1 = (param8);
          this.field_e = stackIn_7_1;
          this.expectedDigest = param6;
          this.expectedRevision = param7;
          this.indexStore = param2;
          this.diskWorker = param4;
          this.transport = param3;
          this.expectedChecksum = param5;
          if (null != this.indexStore) {
            this.field_v = (ArchiveRequest) ((Object) this.diskWorker.readSynchronously(this.archiveId, 1, this.indexStore));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = var10;
          stackIn_12_1 = new StringBuilder().append("fh.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_t = new IntrusiveDeque();
    }
}
