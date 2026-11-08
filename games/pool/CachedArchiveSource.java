/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CachedArchiveSource extends ArchiveProvider {
    static int[] field_p;
    private int field_u;
    static int[] field_M;
    private int archiveId;
    static String mbAchievementCount1;
    static int field_j;
    static int field_l;
    private ArchiveIndex index;
    static String tickerHintMoveCueball;
    private IterableNodeHashTable groupRequests;
    static String muInviteWithdrawn;
    private byte[] field_E;
    private int field_y;
    static String muXJoinedYourGame;
    static String soundColon;
    private SectorCacheStore groupDiskCache;
    static int field_m;
    private Js5Transport networkClient;
    private SectorCacheStore indexDiskCache;
    private DiskCacheWorker diskWorker;
    static String menuRematchGame;
    private ArchiveRequest indexRequest;
    private byte[] field_o;
    private int field_x;
    private boolean field_B;
    private boolean field_C;
    private IntrusiveDeque requestedGroups;
    private IntrusiveDeque backgroundGroups;
    private long field_F;
    private boolean field_A;

    final void processRequestedGroups(int param0) {
        int var3 = 0;
        ArchiveRequest discarded$0 = null;
        ArchiveRequest discarded$1 = null;
        int var4 = Pool.field_O;
        if (this.backgroundGroups == null) {
          return;
        }
        if (this.getIndex((byte) -21) == null) {
          return;
        }
        IntrusiveNode var2 = this.requestedGroups.last((byte) 111);
        while (var2 != null) {
          var3 = (int)var2.key;
          if (0 > var3) {
            var2.unlink((byte) -117);
          } else {
            if (var3 >= this.index.field_d) {
              var2.unlink((byte) -117);
            } else {
              if (this.index.groupFileCounts[var3] == 0) {
                var2.unlink((byte) -117);
              } else {
                if (this.field_E[var3] == 0) {
                  discarded$0 = this.getGroupRequest(var3, 1, (byte) 25);
                }
                if (this.field_E[var3] == -1) {
                  discarded$1 = this.getGroupRequest(var3, 2, (byte) 25);
                }
                if (this.field_E[var3] == 1) {
                  var2.unlink((byte) -117);
                }
              }
            }
          }
          var2 = this.requestedGroups.previous((byte) -5);
        }
        if (param0 <= 82) {
          CharSequence var5 = (CharSequence) null;
          CachedArchiveSource.a(false, (CharSequence) null, (byte) 71);
        }
    }

    final void requestAllGroups(int param0) {
        if (null != this.groupDiskCache) {
          if (param0 < 78) {
            menuRematchGame = (String) null;
          }
          this.field_B = true;
          if (null == this.backgroundGroups) {
            this.backgroundGroups = new IntrusiveDeque();
          }
          return;
        }
    }

    final int getGroupProgress(int param0, int param1) {
        if (param0 != -18600) {
          this.getPackedGroup(100, (byte) -43);
        }
        ArchiveRequest var3 = (ArchiveRequest) (this.groupRequests.get(false, (long)param1));
        if (var3 == null) {
          return 0;
        }
        return var3.getProgress(54);
    }

    final static String a(boolean param0, CharSequence param1, byte param2) {
        int var6 = 0;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_13_0 = null;
        String stackIn_18_0 = null;
        String stackIn_30_0 = null;
        String stackIn_35_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Pool.field_O;
        try {
          if (param1 == null) {
            stackIn_3_0 = AchievementProtocolSupport.createAlertNamelength;
            return stackIn_3_0;
          }
          var3_int = param1.length();
          if (var3_int >= 1 &&
            12 >= var3_int) {
            var4 = TutorialController.normalizeDisplayName(91, param1);
            if (var4 != null &&
              var4.length() >= 1) {
              if (!Js5ArchiveManager.a(0, var4.charAt(0)) &&
                !Js5ArchiveManager.a(0, var4.charAt(var4.length() - 1))) {
                var5 = 0;
                if (param2 < 96) {
                  CachedArchiveSource.getTargetFramesPerSecond(-125);
                }
                for (var6 = 0; param1.length() > var6; var6++) {
                  var7 = param1.charAt(var6);
                  if (Js5ArchiveManager.a(0, (char) var7)) {
                    var5++;
                  } else {
                    var5 = 0;
                  }
                  if (var5 >= 2 &&
                    !param0) {
                    stackIn_30_0 = GzipDecoder.createAlertDoublespace;
                    return stackIn_30_0;
                  }
                }
                if (var5 <= 0) {
                  return null;
                }
                stackIn_35_0 = StatefulTextPainter.createAlertNameleadingspace;
                return stackIn_35_0;
              }
              stackIn_18_0 = StatefulTextPainter.createAlertNameleadingspace;
              return stackIn_18_0;
            }
            stackIn_13_0 = AchievementProtocolSupport.createAlertNamelength;
            return stackIn_13_0;
          }
          stackIn_8_0 = AchievementProtocolSupport.createAlertNamelength;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_38_0 = var3;
          stackIn_38_1 = new StringBuilder().append("up.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param2).append(')').toString());
        }
    }

    final static int getTargetFramesPerSecond(int param0) {
        if (param0 != -21282) {
          return 111;
        }
        return (int)(1000000000L / GzipDecoder.field_e);
    }

    final static Sprite[] a(Sprite[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        Sprite var3 = null;
        int var4 = 0;
        Sprite[] stackIn_3_0 = null;
        Sprite[] stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Pool.field_O;
        try {
          if (param1 != 12519) {
            stackIn_3_0 = (Sprite[]) null;
            return stackIn_3_0;
          }
          for (var2_int = 0; param0.length > var2_int; var2_int++) {
            var3 = param0[var2_int];
            param0[var2_int].field_B = 0;
            var3.field_G = 0;
            param0[var2_int].field_w = param0[var2_int].field_z;
            param0[var2_int].field_y = param0[var2_int].field_A;
          }
          stackIn_8_0 = (Sprite[]) (param0);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("up.D(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final ArchiveIndex getIndex(byte param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = Pool.field_O;
        if (null != this.index) {
          return this.index;
        }
        if (null == this.indexRequest) {
          if (this.networkClient.isUrgentCapacityReached((byte) -125)) {
            return null;
          }
          this.indexRequest = (ArchiveRequest) ((Object) this.networkClient.requestGroup(this.archiveId, 255, (byte) 0, true, -154018400));
        }
        if (this.indexRequest.pending) {
          return null;
        }
        var7 = this.indexRequest.getBytes(false);
        var6 = var7;
        var5 = var6;
        var2 = var5;
        if (!(this.indexRequest instanceof DiskArchiveRequest)) {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.index = new ArchiveIndex(var7, this.field_y, this.field_o);
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = decompiledCaughtException;
            this.networkClient.resetAfterValidationFailure((byte) -123);
            this.index = null;
            if (!this.networkClient.isUrgentCapacityReached((byte) -125)) {
              this.indexRequest = (ArchiveRequest) ((Object) this.networkClient.requestGroup(this.archiveId, 255, (byte) 0, true, -154018400));
            } else {
              this.indexRequest = null;
            }
            return null;
          }
          if (this.indexDiskCache != null) {
            this.diskWorker.queueWrite(var7, this.indexDiskCache, (byte) -128, this.archiveId);
          }
        } else {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.index = new ArchiveIndex(var7, this.field_y, this.field_o);
            if (this.field_u != this.index.field_h) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = decompiledCaughtException;
            this.index = null;
            if (this.networkClient.isUrgentCapacityReached((byte) -125)) {
              this.indexRequest = null;
            } else {
              this.indexRequest = (ArchiveRequest) ((Object) this.networkClient.requestGroup(this.archiveId, 255, (byte) 0, true, -154018400));
            }
            return null;
          }
        }
        if (param0 != -21) {
          CachedArchiveSource.releaseStatics(false);
        }
        this.indexRequest = null;
        if (this.groupDiskCache != null) {
          this.field_E = new byte[this.index.field_d];
        }
        return this.index;
    }

    public static void releaseStatics(boolean param0) {
        menuRematchGame = null;
        field_M = null;
        muXJoinedYourGame = null;
        mbAchievementCount1 = null;
        tickerHintMoveCueball = null;
        field_p = null;
        soundColon = null;
        muInviteWithdrawn = null;
        if (!param0) {
          mbAchievementCount1 = (String) null;
        }
    }

    private final ArchiveRequest getGroupRequest(int param0, int param1, byte param2) {
        Object stackIn_88_0 = null;
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
        var10 = Pool.field_O;
        var12 = (ArchiveRequest) (this.groupRequests.get(false, (long)param0));
        var4 = var12;
        if (param2 != 25) {
          return (ArchiveRequest) null;
        }
        if (var12 != null &&
          param1 == 0 &&
          !var12.field_x &&
          var12.pending) {
          var12.unlink((byte) -117);
          var4 = null;
        }
        if (var4 == null) {
          if (param1 == 0) {
            if (null != this.groupDiskCache &&
              this.field_E[param0] != -1) {
              var4 = this.diskWorker.readNow(121, this.groupDiskCache, param0);
            } else {
              if (this.networkClient.isUrgentCapacityReached((byte) -125)) {
                return null;
              }
              var4 = this.networkClient.requestGroup(param0, this.archiveId, (byte) 2, true, -154018400);
            }
          } else {
            if (param1 == 1) {
              if (this.groupDiskCache == null) {
                throw new RuntimeException();
              }
              var4 = this.diskWorker.queueRead((byte) 58, this.groupDiskCache, param0);
            } else {
              if (param1 != 2) {
                throw new RuntimeException();
              }
              if (this.groupDiskCache == null) {
                throw new RuntimeException();
              }
              if (this.field_E[param0] != -1) {
                throw new RuntimeException();
              }
              if (this.networkClient.isPrefetchCapacityReached(param2 ^ 13)) {
                return null;
              }
              var4 = this.networkClient.requestGroup(param0, this.archiveId, (byte) 2, false, -154018400);
            }
          }
          this.groupRequests.put((byte) -114, (IntrusiveNode) (var4), (long)param0);
        }
        if (((ArchiveRequest) (var4)).pending) {
          return null;
        }
        var18 = ((ArchiveRequest) (var4)).getBytes(false);
        var13 = var18;
        var5 = var13;
        if (var4 instanceof DiskArchiveRequest) {
          try {
            if (var5 != null &&
              var18.length > 2) {
              CipherPacketBuffer.field_B.reset();
              CipherPacketBuffer.field_B.update(var5, 0, -2 + var18.length);
              var6_int = (int)CipherPacketBuffer.field_B.getValue();
              if (var6_int != this.index.groupCrcs[param0]) {
                throw new RuntimeException();
              }
              if (null != this.index.field_a &&
                null != this.index.field_a[param0]) {
                var29 = this.index.field_a[param0];
                var30 = TikiBallSkin.a(-2 + var18.length, (byte) -83, var18, 0);
                var11 = 0;
                var9 = var11;
                while (64 > var11) {
                  if (~var29[var11] != ~var30[var11]) {
                    throw new RuntimeException();
                  }
                  var11++;
                }
              }
              var7 = (var5[-1 + var18.length] & 255) + ((255 & var5[-2 + var18.length]) << 8);
              if (var7 != (this.index.groupRevisions[param0] & 65535)) {
                throw new RuntimeException();
              }
              if (this.field_E[param0] != 1) {
                if (this.field_E[param0] == 0) {
                }
                this.field_E[param0] = (byte) 1;
              }
              if (!((ArchiveRequest) (var4)).field_x) {
                ((ArchiveRequest) (var4)).unlink((byte) -117);
              }
              stackIn_88_0 = var4;
              return (ArchiveRequest) (stackIn_88_0);
            }
            throw new RuntimeException();
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            this.field_E[param0] = (byte)-1;
            ((ArchiveRequest) (var4)).unlink((byte) -117);
            if (!((ArchiveRequest) (var4)).field_x) {
              return null;
            }
            if (!this.networkClient.isUrgentCapacityReached((byte) -125)) {
              var4 = this.networkClient.requestGroup(param0, this.archiveId, (byte) 2, true, param2 ^ -154018375);
              this.groupRequests.put((byte) -127, (IntrusiveNode) (var4), (long)param0);
            }
            return null;
          }
        }
        try {
          if (var5 != null &&
            2 < var18.length) {
            CipherPacketBuffer.field_B.reset();
            CipherPacketBuffer.field_B.update(var5, 0, var18.length - 2);
            var6_int = (int)CipherPacketBuffer.field_B.getValue();
            if (var6_int != this.index.groupCrcs[param0]) {
              throw new RuntimeException();
            }
            if (this.index.field_a != null &&
              null != this.index.field_a[param0]) {
              var27 = this.index.field_a[param0];
              var28 = TikiBallSkin.a(var18.length - 2, (byte) -76, var18, 0);
              for (var9 = 0; 64 > var9; var9++) {
                if (~var27[var9] != ~var28[var9]) {
                  throw new RuntimeException();
                }
              }
            }
            this.networkClient.field_e = 0;
            this.networkClient.field_a = 0;
          } else {
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref = (RuntimeException) (Object) decompiledCaughtException;
          this.networkClient.resetAfterValidationFailure((byte) -53);
          ((ArchiveRequest) (var4)).unlink((byte) -117);
          if (!((ArchiveRequest) (var4)).field_x) {
            return null;
          }
          if (this.networkClient.isUrgentCapacityReached((byte) -125)) {
            return null;
          }
          var4 = this.networkClient.requestGroup(param0, this.archiveId, (byte) 2, true, -154018400);
          this.groupRequests.put((byte) -124, (IntrusiveNode) (var4), (long)param0);
          return null;
        }
        var5[var18.length - 2] = (byte)(this.index.groupRevisions[param0] >>> 8);
        var5[var18.length - 1] = (byte)this.index.groupRevisions[param0];
        if (this.groupDiskCache != null) {
          this.diskWorker.queueWrite(var18, this.groupDiskCache, (byte) -98, param0);
          if (this.field_E[param0] != 1) {
            this.field_E[param0] = (byte) 1;
          }
        }
        if (!((ArchiveRequest) (var4)).field_x) {
          ((ArchiveRequest) (var4)).unlink((byte) -117);
        }
        return (ArchiveRequest) (var4);
    }

    final void advanceBackgroundLoading(byte param0) {
        ArchiveRequest discarded$1 = null;
        ArchiveRequest discarded$0 = null;
        ArchiveRequest discarded$3 = null;
        ArchiveRequest discarded$2 = null;
        int var2_int;
        ArchiveRequest var2;
        IntrusiveNode var3;
        int var4;
        int var5;
        IntrusiveNode var6;
        IntrusiveNode var7;
        int var2_intLifetime1;
        int var2_intLifetime2;
        int var2_intLifetime3;
        int var2_intLifetime4;
        int var4Lifetime1;
        IntrusiveNode var3Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        var5 = Pool.field_O;
        if (this.backgroundGroups != null) {
          if (null == this.getIndex((byte) -21)) {
            return;
          }
          if (this.field_C) {
            var2_int = 1;
            var3 = this.backgroundGroups.last((byte) 78);
            while (var3 != null) {
              var4 = (int)var3.key;
              if (0 == this.field_E[var4]) {
                discarded$1 = this.getGroupRequest(var4, 1, (byte) 25);
              }
              if (this.field_E[var4] != 0) {
                var3.unlink((byte) -117);
              } else {
                var2_int = 0;
              }
              var3 = this.backgroundGroups.previous((byte) -5);
            }
            while (this.field_x < this.index.groupFileCounts.length) {
              if (this.index.groupFileCounts[this.field_x] == 0) {
                this.field_x = this.field_x + 1;
                continue;
              }
              if (this.diskWorker.pendingRequestCount < 250) {
                if (this.field_E[this.field_x] == 0) {
                  discarded$0 = this.getGroupRequest(this.field_x, 1, (byte) 25);
                }
                if (this.field_E[this.field_x] == 0) {
                  var7 = new IntrusiveNode();
                  var7.key = (long)this.field_x;
                  this.backgroundGroups.addFirst((byte) -64, var7);
                  var2_int = 0;
                }
                this.field_x = this.field_x + 1;
                continue;
              }
              var2_int = 0;
              break;
            }
            if ((var2_int != 0)) {
              this.field_C = false;
              this.field_x = 0;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_B) {
              var2_intLifetime4 = 1;
              var3Lifetime1 = this.backgroundGroups.last((byte) -58);
              while (var3Lifetime1 != null) {
                var4Lifetime1 = (int)var3Lifetime1.key;
                if (this.field_E[var4Lifetime1] != 1) {
                  discarded$3 = this.getGroupRequest(var4Lifetime1, 2, (byte) 25);
                }
                if (this.field_E[var4Lifetime1] == 1) {
                  var3Lifetime1.unlink((byte) -117);
                } else {
                  var2_intLifetime4 = 0;
                }
                var3Lifetime1 = this.backgroundGroups.previous((byte) -5);
              }
              scanLoop1: while (true) {
                if (this.field_x < this.index.groupFileCounts.length) {
                  if (this.index.groupFileCounts[this.field_x] != 0) {
                    if (this.networkClient.isPrefetchCapacityReached(20)) {
                      var2_intLifetime4 = 0;
                      break scanLoop1;
                    }
                    if (this.field_E[this.field_x] != 1) {
                      discarded$2 = this.getGroupRequest(this.field_x, 2, (byte) 25);
                    }
                    if (this.field_E[this.field_x] != 1) {
                      var6 = new IntrusiveNode();
                      var6.key = (long)this.field_x;
                      var2_intLifetime4 = 0;
                      this.backgroundGroups.addFirst((byte) 96, var6);
                    }
                  }
                  this.field_x = this.field_x + 1;
                  continue;
                }
                break;
              }
              if ((var2_intLifetime4 != 0)) {
                this.field_B = false;
                this.field_x = 0;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.backgroundGroups = null;
            }
          }
        }
        if (!this.field_A) {
          var2_intLifetime1 = 86 % ((param0 - 82) / 40);
          return;
        }
        if (MonotonicClock.monotonicTimeMillis((byte) -124) < this.field_F) {
          var2_intLifetime2 = 86 % ((param0 - 82) / 40);
          return;
        }
        var2 = (ArchiveRequest) (this.groupRequests.first(0));
        while (var2 != null) {
          if (!var2.pending) {
            if (!var2.field_C) {
              var2.field_C = true;
            } else {
              if (!var2.field_x) {
                throw new RuntimeException();
              }
              var2.unlink((byte) -117);
            }
          }
          var2 = (ArchiveRequest) (this.groupRequests.next(-1));
        }
        this.field_F = MonotonicClock.monotonicTimeMillis((byte) -107) + 1000L;
        var2_intLifetime3 = 86 % ((param0 - 82) / 40);
        return;
    }

    final byte[] getPackedGroup(int param0, byte param1) {
        byte[] var4 = null;
        ArchiveRequest var3 = this.getGroupRequest(param0, 0, (byte) 25);
        if (var3 == null) {
          return null;
        }
        if (param1 == 19) {
          var4 = var3.getBytes(false);
          var3.unlink((byte) -117);
          return var4;
        }
        return (byte[]) null;
    }

    CachedArchiveSource(int param0, SectorCacheStore param1, SectorCacheStore param2, Js5Transport param3, DiskCacheWorker param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.groupRequests = new IterableNodeHashTable(16);
        this.field_x = 0;
        this.requestedGroups = new IntrusiveDeque();
        this.field_F = 0L;
        try {
          this.archiveId = param0;
          this.groupDiskCache = param1;
          if (null != this.groupDiskCache) {
            this.field_C = true;
            this.backgroundGroups = new IntrusiveDeque();
          } else {
            this.field_C = false;
          }
          this.field_o = param6;
          this.indexDiskCache = param2;
          stackIn_7_1 = (param8);
          this.field_A = stackIn_7_1;
          this.field_y = param5;
          this.field_u = param7;
          this.networkClient = param3;
          this.diskWorker = param4;
          if (this.indexDiskCache != null) {
            this.indexRequest = (ArchiveRequest) ((Object) this.diskWorker.readNow(92, this.indexDiskCache, this.archiveId));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = var10;
          stackIn_12_1 = new StringBuilder().append("up.<init>(").append(param0).append(',');
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
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_M = new int[7];
        muInviteWithdrawn = "The invitation has been withdrawn.";
        soundColon = "Sound: ";
        muXJoinedYourGame = "<%0> has joined your game.";
        tickerHintMoveCueball = "Press and hold the <img=0> on the cue ball to move it.";
        field_m = -1;
        mbAchievementCount1 = "OVER <%0>";
        menuRematchGame = "Rematch";
    }
}
