/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CachedArchiveSource extends ArchiveProvider {
    private ArchiveIndex field_s;
    private byte[] field_A;
    static String field_C;
    private SectorCacheStore field_x;
    private NodeHashTable field_p;
    private byte[] field_k;
    private Js5Transport field_h;
    static QuickChatCommandType field_j;
    private SectorCacheStore field_t;
    private ArchiveRequest field_l;
    private DiskCacheWorker field_z;
    private int field_B;
    static String field_u;
    private int field_w;
    private int field_o;
    private boolean field_m;
    private IntrusiveDeque field_q;
    private IntrusiveDeque field_v;
    private int field_i;
    private boolean field_y;
    private boolean field_n;
    private long field_r;

    final static LoginCredentials createLoginCredentials(byte param0, String param1, String param2, boolean param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        LoginCredentials stackIn_2_0 = null;
        LoginCredentials stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 116) {
            stackIn_2_0 = (LoginCredentials) null;
            return stackIn_2_0;
          }
          var4_long = 0L;
          var6 = null;
          if (-1 == param1.indexOf('@')) {
            var7 = (CharSequence) ((Object) param1);
            var4_long = QuitPageHelpers.encodeBase37(0, var7);
          } else {
            var6 = param1;
          }
          stackIn_7_0 = StrongCacheEntry.createLoginCredentials(64, var4_long, (String) (var6), param3, param2);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("cn.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final void startPrefetch(boolean param0) {
        if (this.field_x == null) {
          return;
        }
        this.field_m = true;
        if (null == this.field_v) {
          this.field_v = new IntrusiveDeque();
        }
        if (param0) {
          this.field_i = -112;
        }
    }

    final void processQueuedGroups(int param0) {
        ArchiveRequest discarded$0 = null;
        ArchiveRequest discarded$1 = null;
        IntrusiveNode var2;
        int var3;
        int var4;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (null == this.field_v) {
          return;
        }
        if (null == this.getIndex((byte) -101)) {
          return;
        }
        var2 = this.field_q.last(65);
        while (var2 != null) {
          var3 = (int)var2.key;
          if (var3 >= 0) {
            if (var3 < this.field_s.field_e) {
              if (this.field_s.field_s[var3] == 0) {
                var2.unlink(true);
              } else {
                if (this.field_A[var3] == 0) {
                  discarded$0 = this.requestGroup(1, 0, var3);
                }
                if (-1 == this.field_A[var3]) {
                  discarded$1 = this.requestGroup(2, 0, var3);
                }
                if (this.field_A[var3] == 1) {
                  var2.unlink(true);
                }
              }
            } else {
              var2.unlink(true);
            }
          } else {
            var2.unlink(true);
          }
          var2 = this.field_q.previous(6);
        }
        if (param0 <= 64) {
          CachedArchiveSource.initializeGameAssets((ResourceArchive) null, -84, (byte[]) null, (int[]) null, (byte[]) null, -44, (String[]) null, (ResourceArchive) null, (IndexedSprite[]) null, (ResourceArchive) null, 116, (Sprite[][]) null, true, (String[][]) null, (int[]) null, (Sprite[][]) null, (String[][]) null);
        }
        return;
    }

    final ArchiveIndex getIndex(byte param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.field_s != null) {
          return this.field_s;
        }
        if (null == this.field_l) {
          if (this.field_h.isPriorityQueueFull(24)) {
            return null;
          }
          this.field_l = (ArchiveRequest) ((Object) this.field_h.createRequest(487989472, this.field_B, true, 255, (byte) 0));
        }
        if (this.field_l.field_t) {
          return null;
        }
        var7 = this.field_l.getBytes(0);
        var6 = var7;
        var5 = var6;
        var2 = var5;
        if (param0 > -83) {
          CachedArchiveSource.releaseStatics(-53);
        }
        if (this.field_l instanceof DiskArchiveRequest) {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_s = new ArchiveIndex(var7, this.field_o, this.field_k);
            if (this.field_w != this.field_s.field_h) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = decompiledCaughtException;
            this.field_s = null;
            if (this.field_h.isPriorityQueueFull(88)) {
              this.field_l = null;
            } else {
              this.field_l = (ArchiveRequest) ((Object) this.field_h.createRequest(487989472, this.field_B, true, 255, (byte) 0));
            }
            return null;
          }
        } else {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_s = new ArchiveIndex(var7, this.field_o, this.field_k);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = decompiledCaughtException;
            this.field_h.resetAfterValidationFailure((byte) 113);
            this.field_s = null;
            if (this.field_h.isPriorityQueueFull(98)) {
              this.field_l = null;
            } else {
              this.field_l = (ArchiveRequest) ((Object) this.field_h.createRequest(487989472, this.field_B, true, 255, (byte) 0));
            }
            return null;
          }
          if (this.field_t != null) {
            this.field_z.queueWrite(this.field_B, this.field_t, var7, 100);
          }
        }
        this.field_l = null;
        if (this.field_x != null) {
          this.field_A = new byte[this.field_s.field_e];
        }
        return this.field_s;
    }

    final static Sprite[] loadSpriteSheetByName(boolean param0, String param1, ResourceArchive param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Sprite[] stackIn_2_0 = null;
        Sprite[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param2.getGroupIdByName(param3, (byte) 112);
          if (!param0) {
            stackIn_2_0 = (Sprite[]) null;
            return stackIn_2_0;
          }
          var5 = param2.getFileId(param1, var4_int, -1);
          stackIn_4_0 = LoginSuccessHelpers.loadSprites(var5, (byte) -93, param2, var4_int);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("cn.F(").append(param0).append(',');
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
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void updateQuickChatInput(int param0, boolean param1, int param2, byte param3) {
        NanoTickClock.updateActivePopup((byte) 124, param1);
        ReflectionCheckRequest.updateQuickChatMenu((byte) -45, param0, param1, param2);
        if (param3 > -79) {
          field_u = (String) null;
        }
    }

    final int getGroupProgress(int param0, int param1) {
        ArchiveRequest var3 = (ArchiveRequest) (this.field_p.get(param1 ^ param1, (long)param0));
        if (var3 != null) {
          return var3.getProgress(param1 + 103);
        }
        return 0;
    }

    final void advanceBackgroundLoading(int param0) {
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
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 != -2) {
          this.field_t = (SectorCacheStore) null;
        }
        boolean decompiledFrameRemainder0 = true;
        if (null != this.field_v) {
          if (null == this.getIndex((byte) -110)) {
            return;
          }
          if (this.field_y) {
            var2_int = 1;
            var3 = this.field_v.last(46);
            while (var3 != null) {
              var4 = (int)var3.key;
              if (this.field_A[var4] == 0) {
                discarded$3 = this.requestGroup(1, 0, var4);
              }
              if (this.field_A[var4] == 0) {
                var2_int = 0;
              } else {
                var3.unlink(true);
              }
              var3 = this.field_v.previous(6);
            }
            scanLoop1: while (true) {
              if (this.field_i < this.field_s.field_s.length) {
                if (this.field_s.field_s[this.field_i] != 0) {
                  if (250 <= this.field_z.field_h) {
                    var2_int = 0;
                    break scanLoop1;
                  }
                  if (this.field_A[this.field_i] == 0) {
                    discarded$2 = this.requestGroup(1, 0, this.field_i);
                  }
                  if (this.field_A[this.field_i] == 0) {
                    var6 = new IntrusiveNode();
                    var6.key = (long)this.field_i;
                    this.field_v.addFirst(var6, false);
                    var2_int = 0;
                  }
                }
                this.field_i = this.field_i + 1;
                continue;
              }
              break;
            }
            if ((var2_int != 0)) {
              this.field_y = false;
              this.field_i = 0;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_m) {
              var2_intLifetime1 = 1;
              var3Lifetime1 = this.field_v.last(105);
              while (var3Lifetime1 != null) {
                var4Lifetime1 = (int)var3Lifetime1.key;
                if (1 != this.field_A[var4Lifetime1]) {
                  discarded$1 = this.requestGroup(2, param0 ^ -2, var4Lifetime1);
                }
                if (this.field_A[var4Lifetime1] != 1) {
                  var2_intLifetime1 = 0;
                } else {
                  var3Lifetime1.unlink(true);
                }
                var3Lifetime1 = this.field_v.previous(6);
              }
              scanLoop2: while (true) {
                if (this.field_i < this.field_s.field_s.length) {
                  if (this.field_s.field_s[this.field_i] != 0) {
                    if (this.field_h.isBackgroundQueueFull(param0 - 89)) {
                      var2_intLifetime1 = 0;
                      break scanLoop2;
                    }
                    if (this.field_A[this.field_i] != 1) {
                      discarded$0 = this.requestGroup(2, 0, this.field_i);
                    }
                    if (this.field_A[this.field_i] != 1) {
                      var7 = new IntrusiveNode();
                      var7.key = (long)this.field_i;
                      var2_intLifetime1 = 0;
                      this.field_v.addFirst(var7, false);
                    }
                  }
                  this.field_i = this.field_i + 1;
                  continue;
                }
                break;
              }
              if ((var2_intLifetime1 != 0)) {
                this.field_m = false;
                this.field_i = 0;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_v = null;
            }
          }
        }
        if (this.field_n &&
          ClockAndScreenHelpers.monotonicMillis((byte) 48) >= this.field_r) {
          var2 = (ArchiveRequest) (this.field_p.first(0));
          while (var2 != null) {
            if (!var2.field_t) {
              if (var2.field_x) {
                if (!var2.field_r) {
                  throw new RuntimeException();
                }
                var2.unlink(true);
              } else {
                var2.field_x = true;
              }
            }
            var2 = (ArchiveRequest) (this.field_p.nextForIteration(param0 ^ 122));
          }
          this.field_r = ClockAndScreenHelpers.monotonicMillis((byte) 114) + 1000L;
        }
    }

    private final ArchiveRequest requestGroup(int param0, int param1, int param2) {
        Object stackIn_58_0 = null;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        byte[] var5 = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Exception var6_ref = null;
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
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        var12 = (ArchiveRequest) (this.field_p.get(0, (long)param2));
        var4 = var12;
        if (var12 != null &&
          param0 == 0 &&
          !var12.field_r &&
          var12.field_t) {
          var12.unlink(true);
          var4 = null;
        }
        if (var4 == null) {
          if (param0 != 0) {
            if (param0 != 1) {
              if (param0 != 2) {
                throw new RuntimeException();
              }
              if (this.field_x == null) {
                throw new RuntimeException();
              }
              if (-1 != this.field_A[param2]) {
                throw new RuntimeException();
              }
              if (this.field_h.isBackgroundQueueFull(-64)) {
                return null;
              }
              var4 = this.field_h.createRequest(487989472, param2, false, this.field_B, (byte) 2);
            } else {
              if (this.field_x == null) {
                throw new RuntimeException();
              }
              var4 = this.field_z.queueRead(param2, this.field_x, 10);
            }
          } else {
            if (this.field_x != null &&
              this.field_A[param2] != -1) {
              var4 = this.field_z.readNow(param2, this.field_x, -3);
            } else {
              if (this.field_h.isPriorityQueueFull(param1 + 116)) {
                return null;
              }
              var4 = this.field_h.createRequest(487989472, param2, true, this.field_B, (byte) 2);
            }
          }
          this.field_p.put(true, (long)param2, (IntrusiveNode) (var4));
        }
        if (((ArchiveRequest) (var4)).field_t) {
          return null;
        }
        var18 = ((ArchiveRequest) (var4)).getBytes(param1);
        var13 = var18;
        var5 = var13;
        if (var4 instanceof DiskArchiveRequest) {
          try {
            if (var5 != null &&
              var18.length > 2) {
              ButtonWidget.field_B.reset();
              ButtonWidget.field_B.update(var5, 0, -2 + var18.length);
              var6_int = (int)ButtonWidget.field_B.getValue();
              if (this.field_s.field_r[param2] != var6_int) {
                throw new RuntimeException();
              }
              if (null != this.field_s.field_a &&
                this.field_s.field_a[param2] != null) {
                var27 = this.field_s.field_a[param2];
                var28 = OptionsMenuScreen.computeWhirlpoolDigest(4246, 0, var5, var18.length - 2);
                for (var9 = 0; var9 < 64; var9++) {
                  if (~var27[var9] != ~var28[var9]) {
                    throw new RuntimeException();
                  }
                }
              }
              var7 = (65280 & var5[var18.length - 2] << 8) + (255 & var5[var18.length - 1]);
              if (var7 != (this.field_s.field_p[param2] & 65535)) {
                throw new RuntimeException();
              }
              if (this.field_A[param2] != 1) {
                if (0 == this.field_A[param2]) {
                }
                this.field_A[param2] = (byte) 1;
              }
              if (!((ArchiveRequest) (var4)).field_r) {
                ((ArchiveRequest) (var4)).unlink(true);
              }
              stackIn_58_0 = var4;
              return (ArchiveRequest) (stackIn_58_0);
            }
            throw new RuntimeException();
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            this.field_A[param2] = (byte)-1;
            ((ArchiveRequest) (var4)).unlink(true);
            if (!((ArchiveRequest) (var4)).field_r) {
              return null;
            }
            if (this.field_h.isPriorityQueueFull(34)) {
              return null;
            }
            var4 = this.field_h.createRequest(487989472, param2, true, this.field_B, (byte) 2);
            this.field_p.put(true, (long)param2, (IntrusiveNode) (var4));
            return null;
          }
        }
        try {
          if (var5 != null &&
            var18.length > 2) {
            ButtonWidget.field_B.reset();
            ButtonWidget.field_B.update(var5, 0, -2 + var18.length);
            var6_int = (int)ButtonWidget.field_B.getValue();
            if (this.field_s.field_r[param2] != var6_int) {
              throw new RuntimeException();
            }
            if (this.field_s.field_a != null &&
              this.field_s.field_a[param2] != null) {
              var30 = this.field_s.field_a[param2];
              var29 = OptionsMenuScreen.computeWhirlpoolDigest(4246, 0, var5, -2 + var18.length);
              var11 = 0;
              var9 = var11;
              while (var11 < 64) {
                if (~var29[var11] != ~var30[var11]) {
                  throw new RuntimeException();
                }
                var11++;
              }
            }
            this.field_h.field_n = 0;
            this.field_h.field_p = 0;
          } else {
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (RuntimeException) (Object) decompiledCaughtException;
          this.field_h.resetAfterValidationFailure((byte) 95);
          ((ArchiveRequest) (var4)).unlink(true);
          if (!((ArchiveRequest) (var4)).field_r) {
            return null;
          }
          if (!this.field_h.isPriorityQueueFull(110)) {
            var4 = this.field_h.createRequest(487989472, param2, true, this.field_B, (byte) 2);
            this.field_p.put(true, (long)param2, (IntrusiveNode) (var4));
          }
          return null;
        }
        var5[-2 + var18.length] = (byte)(this.field_s.field_p[param2] >>> 8);
        var5[-1 + var18.length] = (byte)this.field_s.field_p[param2];
        if (null != this.field_x) {
          this.field_z.queueWrite(param2, this.field_x, var18, param1 + 108);
          if (1 != this.field_A[param2]) {
            this.field_A[param2] = (byte) 1;
          }
        }
        if (!((ArchiveRequest) (var4)).field_r) {
          ((ArchiveRequest) (var4)).unlink(true);
        }
        return (ArchiveRequest) (var4);
    }

    final static int floorDiv(int param0, int param1, int param2) {
        if (param1 >= -5) {
          field_u = (String) null;
        }
        int var3 = param2 >>> 31;
        return -var3 + (var3 + param2) / param0;
    }

    final static void initializeGameAssets(ResourceArchive param0, int param1, byte[] param2, int[] param3, byte[] param4, int param5, String[] param6, ResourceArchive param7, IndexedSprite[] param8, ResourceArchive param9, int param10, Sprite[][] param11, boolean param12, String[][] param13, int[] param14, Sprite[][] param15, String[][] param16) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
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
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var17 = null;
        String var18 = null;
        String[] var19 = null;
        try {
          if (param1 != 0) {
            var18 = (String) null;
            CachedArchiveSource.loadSpriteSheetByName(true, (String) null, (ResourceArchive) null, (String) null);
          }
          var19 = (String[]) null;
          SecondaryNodeDeque.initializeGameAssetsReordered(param7, param4, 1, (String[]) null, param14, param5, param11, param6, true, param16, param10, param13, param0, param2, param3, param8, param15, param9, param12);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_6_0 = var17;
          stackIn_6_1 = new StringBuilder().append("cn.L(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param7 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param8 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param9 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param14 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',');
          if (param15 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',');
          if (param16 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(')').toString());
        }
    }

    final byte[] getPackedGroup(int param0, int param1) {
        ArchiveRequest var3 = this.requestGroup(0, 0, param1);
        if (var3 == null) {
          return null;
        }
        if (param0 != -123) {
          return (byte[]) null;
        }
        byte[] var4 = var3.getBytes(0);
        var3.unlink(true);
        return var4;
    }

    public static void releaseStatics(int param0) {
        if (param0 >= -103) {
          CachedArchiveSource.updateQuickChatInput(-126, true, 28, (byte) -117);
        }
        field_C = null;
        field_j = null;
        field_u = null;
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
        this.field_p = new NodeHashTable(16);
        this.field_i = 0;
        this.field_q = new IntrusiveDeque();
        this.field_r = 0L;
        try {
          this.field_x = param1;
          this.field_B = param0;
          if (null != this.field_x) {
            this.field_y = true;
            this.field_v = new IntrusiveDeque();
          } else {
            this.field_y = false;
          }
          this.field_t = param2;
          this.field_w = param7;
          this.field_h = param3;
          this.field_z = param4;
          stackIn_7_1 = (param8);
          this.field_n = stackIn_7_1;
          this.field_o = param5;
          this.field_k = param6;
          if (null != this.field_t) {
            this.field_l = (ArchiveRequest) ((Object) this.field_z.readNow(this.field_B, this.field_t, -3));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = var10;
          stackIn_12_1 = new StringBuilder().append("cn.<init>(").append(param0).append(',');
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
        field_C = "New Game";
        field_j = new QuickChatCommandType(12, 0, 1, 0);
        field_u = "Get them! GET THEM!";
    }
}
