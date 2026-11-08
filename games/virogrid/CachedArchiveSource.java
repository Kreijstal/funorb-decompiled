/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CachedArchiveSource extends ArchiveProvider {
    private int field_j;
    private ArchiveRequest field_l;
    private SectorCacheStore field_m;
    private byte[] field_n;
    static int field_q;
    private Js5Transport field_y;
    private DiskCacheWorker field_e;
    private int field_k;
    private ArchiveIndex field_p;
    private byte[] field_x;
    private NodeHashTable field_i;
    static String field_u;
    private SectorCacheStore field_t;
    private int field_r;
    private int field_g;
    private IntrusiveDeque field_o;
    private boolean field_s;
    static DualLinkHashTable field_h;
    private IntrusiveDeque field_f;
    private boolean field_v;
    private boolean field_d;
    private long field_w;

    final static void loadDisplayNameSprites(byte param0, Js5Archive param1) {
        SpriteWidget var6 = null;
        SpriteWidget var7 = null;
        SpriteWidget var3 = null;
        try {
          RasterSnapshot.displayNameChangedIcon = PasswordValidator.loadSpriteByName(param1, "display_name_changed", "basic", false);
          EmailValidator.field_q = new ScrollPaneWithFooter(0L, FadingModalPanel.field_K, ResizableDialog.field_Z, GameClock.field_a);
          SharedTextGlobals.field_a = new ScrollPaneWithFooter(0L, FadingModalPanel.field_K, ClientServiceHelpers.field_a, PasswordFieldPainter.field_A);
          StripedProgressBar.field_E = new SpriteWidget(0L, (SpriteWidget) null);
          GuestPlayHelpers.field_e = new SpriteWidget(0L, LinkTextPainter.field_h);
          GuestPlayHelpers.field_e.field_lb = 1;
          LobbyJoinTextGlobals.field_c = new SpriteWidget(0L, DelegatingCanvas.field_d, DirectByteStorage.field_h);
          if (param0 > -16) {
            int[] var4 = (int[]) null;
            CachedArchiveSource.canMessage(90, (String) null, -60L, 66, (int[]) null);
          }
          DualLinkNode.field_m = new SpriteWidget(0L, LobbyGame.field_Jb, WidgetNode.field_s);
          QuickChatOpenHelpers.field_c = new SpriteWidget(0L, IntrusiveDequeCursor.field_e);
          StripedProgressBar.field_E.addChild(0, GuestPlayHelpers.field_e);
          StripedProgressBar.field_E.addChild(0, LobbyJoinTextGlobals.field_c);
          StripedProgressBar.field_E.addChild(0, DualLinkNode.field_m);
          StripedProgressBar.field_E.addChild(0, EmailValidator.field_q);
          StripedProgressBar.field_E.addChild(0, QuickChatOpenHelpers.field_c);
          EmailValidator.field_q.field_Ib.field_Eb.applyStyle(18003, LinkTextPainter.field_h);
          EmailValidator.field_q.field_Ib.field_Eb.field_D = 1;
          var6 = EmailValidator.field_q.field_Ib.field_Eb;
          var7 = var6;
          var7.field_lb = 1;
          SharedTextGlobals.field_a.field_Ib.field_Eb.applyStyle(18003, LinkTextPainter.field_h);
          SharedTextGlobals.field_a.field_Ib.field_Eb.field_D = 1;
          var3 = SharedTextGlobals.field_a.field_Ib.field_Eb;
          var3.field_lb = 1;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "oa.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void sendListRequest(int param0, QueuedRequest param1, int param2) {
        CipherPacketBuffer var3 = null;
        try {
          var3 = IterableNodeHashTable.field_g;
          var3.writeCipheredOpcode(param0, 8);
          if (param2 < 94) {
            java.applet.Applet var4 = (java.applet.Applet) null;
            CachedArchiveSource.openSupportPage((java.applet.Applet) null, -86);
          }
          var3.writeByte(param1.field_j, -69);
          var3.writeShort((byte) 59, param1.field_o);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "oa.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_h = null;
        field_u = null;
        int var1 = -86 % ((-52 - param0) / 61);
    }

    final int getGroupProgress(int param0, int param1) {
        ArchiveRequest var3 = (ArchiveRequest) (this.field_i.get((long)param1, -14905));
        if (var3 != null) {
          return var3.getProgress(0);
        }
        if (param0 != -7) {
          this.getGroupProgress(-68, 0);
          return 0;
        }
        return 0;
    }

    final ArchiveIndex getIndex(byte param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3_ref_RuntimeException = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = Virogrid.field_F ? 1 : 0;
        if (this.field_p != null) {
          return this.field_p;
        }
        if (this.field_l == null) {
          if (this.field_y.isPriorityQueueFull((byte) 113)) {
            return null;
          }
          this.field_l = (ArchiveRequest) ((Object) this.field_y.createRequest((byte) 0, this.field_r, true, -1150070304, 255));
        }
        if (this.field_l.field_t) {
          return null;
        }
        var7 = this.field_l.getBytes((byte) 39);
        var6 = var7;
        var5 = var6;
        var2 = var5;
        if (!(this.field_l instanceof DiskArchiveRequest)) {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_p = new ArchiveIndex(var7, this.field_k, this.field_x);
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref_RuntimeException = decompiledCaughtException;
            this.field_y.resetAfterValidationFailure((byte) 83);
            this.field_p = null;
            if (!this.field_y.isPriorityQueueFull((byte) 113)) {
              this.field_l = (ArchiveRequest) ((Object) this.field_y.createRequest((byte) 0, this.field_r, true, -1150070304, 255));
            } else {
              this.field_l = null;
            }
            return null;
          }
          if (this.field_t != null) {
            this.field_e.queueWrite(this.field_t, var7, (byte) -128, this.field_r);
          }
        } else {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_p = new ArchiveIndex(var7, this.field_k, this.field_x);
            if (this.field_p.field_a != this.field_j) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref_RuntimeException = decompiledCaughtException;
            this.field_p = null;
            if (this.field_y.isPriorityQueueFull((byte) 113)) {
              this.field_l = null;
            } else {
              this.field_l = (ArchiveRequest) ((Object) this.field_y.createRequest((byte) 0, this.field_r, true, -1150070304, 255));
            }
            return null;
          }
        }
        this.field_l = null;
        if (this.field_m != null) {
          this.field_n = new byte[this.field_p.field_v];
        }
        var3 = 48 % ((param0 + 34) / 47);
        return this.field_p;
    }

    private final ArchiveRequest requestGroup(int param0, int param1, int param2) {
        Object stackIn_92_0 = null;
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
        var10 = Virogrid.field_F ? 1 : 0;
        var12 = (ArchiveRequest) (this.field_i.get((long)param2, -14905));
        var4 = var12;
        if (var12 != null &&
          0 == param1 &&
          !var12.field_w &&
          var12.field_t) {
          var12.unlink(false);
          var4 = null;
        }
        if (var4 == null) {
          if (param1 != 0) {
            if (param1 == 1) {
              if (null == this.field_m) {
                throw new RuntimeException();
              }
              var4 = this.field_e.queueRead((byte) 116, param2, this.field_m);
            } else {
              if (param1 != 2) {
                throw new RuntimeException();
              }
              if (this.field_m == null) {
                throw new RuntimeException();
              }
              if (this.field_n[param2] != -1) {
                throw new RuntimeException();
              }
              if (this.field_y.isBackgroundQueueFull(20)) {
                return null;
              }
              var4 = this.field_y.createRequest((byte) 2, param2, false, -1150070304, this.field_r);
            }
          } else {
            if (this.field_m != null &&
              this.field_n[param2] != -1) {
              var4 = this.field_e.readImmediate(param2, -16578, this.field_m);
            } else {
              if (this.field_y.isPriorityQueueFull((byte) 113)) {
                return null;
              }
              var4 = this.field_y.createRequest((byte) 2, param2, true, param0 ^ 1150071165, this.field_r);
            }
          }
          this.field_i.put((IntrusiveNode) (var4), (byte) 96, (long)param2);
        }
        if (param0 != -8035) {
          return (ArchiveRequest) null;
        }
        if (((ArchiveRequest) (var4)).field_t) {
          return null;
        }
        var18 = ((ArchiveRequest) (var4)).getBytes((byte) 39);
        var13 = var18;
        var5 = var13;
        if (var4 instanceof DiskArchiveRequest) {
          try {
            if (var5 != null &&
              var18.length > 2) {
              DialWidget.field_S.reset();
              DialWidget.field_S.update(var5, 0, var18.length - 2);
              var6_int = (int)DialWidget.field_S.getValue();
              if (this.field_p.field_m[param2] != var6_int) {
                throw new RuntimeException();
              }
              if (this.field_p.field_p != null &&
                this.field_p.field_p[param2] != null) {
                var29 = this.field_p.field_p[param2];
                var30 = DigestHelpers.whirlpoolDigest(var5, -2 + var18.length, 0, false);
                var11 = 0;
                var9 = var11;
                while (var11 < 64) {
                  if (~var29[var11] != ~var30[var11]) {
                    throw new RuntimeException();
                  }
                  var11++;
                }
              }
              var7 = (255 & var5[var18.length - 1]) + (var5[var18.length - 2] << 8 & 65280);
              if (var7 != (this.field_p.field_f[param2] & 65535)) {
                throw new RuntimeException();
              }
              if (this.field_n[param2] != 1) {
                if (this.field_n[param2] != 0) {
                }
                this.field_n[param2] = (byte) 1;
              }
              if (!((ArchiveRequest) (var4)).field_w) {
                ((ArchiveRequest) (var4)).unlink(false);
              }
              stackIn_92_0 = var4;
              return (ArchiveRequest) (stackIn_92_0);
            }
            throw new RuntimeException();
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            this.field_n[param2] = (byte)-1;
            ((ArchiveRequest) (var4)).unlink(false);
            if (!((ArchiveRequest) (var4)).field_w) {
              return null;
            }
            if (!this.field_y.isPriorityQueueFull((byte) 113)) {
              var4 = this.field_y.createRequest((byte) 2, param2, true, param0 - 1150062269, this.field_r);
              this.field_i.put((IntrusiveNode) (var4), (byte) 60, (long)param2);
            }
            return null;
          }
        }
        try {
          if (var5 != null &&
            var18.length > 2) {
            DialWidget.field_S.reset();
            DialWidget.field_S.update(var5, 0, -2 + var18.length);
            var6_int = (int)DialWidget.field_S.getValue();
            if (this.field_p.field_m[param2] != var6_int) {
              throw new RuntimeException();
            }
            if (null != this.field_p.field_p &&
              this.field_p.field_p[param2] != null) {
              var28 = this.field_p.field_p[param2];
              var27 = DigestHelpers.whirlpoolDigest(var5, var18.length - 2, 0, false);
              for (var9 = 0; var9 < 64; var9++) {
                if (var27[var9] != var28[var9]) {
                  throw new RuntimeException();
                }
              }
            }
            this.field_y.field_l = 0;
            this.field_y.field_b = 0;
          } else {
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref = (RuntimeException) (Object) decompiledCaughtException;
          this.field_y.resetAfterValidationFailure((byte) 102);
          ((ArchiveRequest) (var4)).unlink(false);
          if (((ArchiveRequest) (var4)).field_w &&
            !this.field_y.isPriorityQueueFull((byte) 113)) {
            var4 = this.field_y.createRequest((byte) 2, param2, true, param0 ^ 1150071165, this.field_r);
            this.field_i.put((IntrusiveNode) (var4), (byte) 14, (long)param2);
          }
          return null;
        }
        var5[-2 + var18.length] = (byte)(this.field_p.field_f[param2] >>> 8);
        var5[var18.length - 1] = (byte)this.field_p.field_f[param2];
        if (null != this.field_m) {
          this.field_e.queueWrite(this.field_m, var18, (byte) -126, param2);
          if (this.field_n[param2] != 1) {
            this.field_n[param2] = (byte) 1;
          }
        }
        if (!((ArchiveRequest) (var4)).field_w) {
          ((ArchiveRequest) (var4)).unlink(false);
        }
        return (ArchiveRequest) (var4);
    }

    final void advanceBackgroundLoading(byte param0) {
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
        boolean decompiledFrameRemainder0 = true;
        var5 = Virogrid.field_F ? 1 : 0;
        if (this.field_o != null) {
          if (null == this.getIndex((byte) -89)) {
            return;
          }
          if (this.field_s) {
            var2_int = 1;
            var3 = this.field_o.first((byte) -75);
            while (var3 != null) {
              var4 = (int)var3.key;
              if (this.field_n[var4] == 0) {
                discarded$3 = this.requestGroup(param0 - 8007, 1, var4);
              }
              if (this.field_n[var4] != 0) {
                var3.unlink(false);
              } else {
                var2_int = 0;
              }
              var3 = this.field_o.next(16213);
            }
            scanLoop1: while (true) {
              if (this.field_g < this.field_p.field_n.length) {
                if (this.field_p.field_n[this.field_g] != 0) {
                  if (this.field_e.field_e >= 250) {
                    var2_int = 0;
                    break scanLoop1;
                  }
                  if (this.field_n[this.field_g] == 0) {
                    discarded$2 = this.requestGroup(-8035, 1, this.field_g);
                  }
                  if (this.field_n[this.field_g] == 0) {
                    var6 = new IntrusiveNode();
                    var6.key = (long)this.field_g;
                    this.field_o.addFirst(var6, (byte) -37);
                    var2_int = 0;
                  }
                }
                this.field_g = this.field_g + 1;
                continue;
              }
              break;
            }
            if ((var2_int != 0)) {
              this.field_s = false;
              this.field_g = 0;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_v) {
              var2_intLifetime1 = 1;
              var3Lifetime1 = this.field_o.first((byte) -84);
              while (var3Lifetime1 != null) {
                var4Lifetime1 = (int)var3Lifetime1.key;
                if (this.field_n[var4Lifetime1] != 1) {
                  discarded$1 = this.requestGroup(-8035, 2, var4Lifetime1);
                }
                if (1 == this.field_n[var4Lifetime1]) {
                  var3Lifetime1.unlink(false);
                } else {
                  var2_intLifetime1 = 0;
                }
                var3Lifetime1 = this.field_o.next(param0 ^ -16207);
              }
              while (this.field_g < this.field_p.field_n.length) {
                if (0 == this.field_p.field_n[this.field_g]) {
                  this.field_g = this.field_g + 1;
                  continue;
                }
                if (!this.field_y.isBackgroundQueueFull(20)) {
                  if (1 != this.field_n[this.field_g]) {
                    discarded$0 = this.requestGroup(-8035, 2, this.field_g);
                  }
                  if (1 != this.field_n[this.field_g]) {
                    var7 = new IntrusiveNode();
                    var7.key = (long)this.field_g;
                    var2_intLifetime1 = 0;
                    this.field_o.addFirst(var7, (byte) -112);
                  }
                  this.field_g = this.field_g + 1;
                  continue;
                }
                var2_intLifetime1 = 0;
                break;
              }
              if ((var2_intLifetime1 != 0)) {
                this.field_v = false;
                this.field_g = 0;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_o = null;
            }
          }
        }
        if (param0 != -28) {
          this.field_p = (ArchiveIndex) null;
        }
        if (this.field_d &&
          this.field_w <= ClockAndTextHelpers.monotonicMillis(-9986)) {
          var2 = (ArchiveRequest) (this.field_i.first((byte) 19));
          while (var2 != null) {
            if (!var2.field_t) {
              if (var2.field_v) {
                if (!var2.field_w) {
                  throw new RuntimeException();
                }
                var2.unlink(false);
              } else {
                var2.field_v = true;
              }
            }
            var2 = (ArchiveRequest) (this.field_i.next(75));
          }
          this.field_w = 1000L + ClockAndTextHelpers.monotonicMillis(-9986);
        }
    }

    final void processQueuedGroups(int param0) {
        int var3 = 0;
        ArchiveRequest discarded$0 = null;
        ArchiveRequest discarded$1 = null;
        int var4 = Virogrid.field_F ? 1 : 0;
        if (null == this.field_o) {
          return;
        }
        if (null == this.getIndex((byte) 63)) {
          return;
        }
        if (param0 != 0) {
          this.getPackedGroup(-4, -120);
        }
        IntrusiveNode var2 = this.field_f.first((byte) -82);
        while (var2 != null) {
          var3 = (int)var2.key;
          if (var3 < 0) {
            var2.unlink(false);
          } else {
            if (this.field_p.field_v <= var3) {
              var2.unlink(false);
            } else {
              if (this.field_p.field_n[var3] == 0) {
                var2.unlink(false);
              } else {
                if (0 == this.field_n[var3]) {
                  discarded$0 = this.requestGroup(param0 - 8035, 1, var3);
                }
                if (this.field_n[var3] == -1) {
                  discarded$1 = this.requestGroup(-8035, 2, var3);
                }
                if (1 == this.field_n[var3]) {
                  var2.unlink(false);
                }
              }
            }
          }
          var2 = this.field_f.next(param0 ^ 16213);
        }
    }

    final byte[] getPackedGroup(int param0, int param1) {
        if (param1 <= 119) {
          this.field_r = 115;
        }
        ArchiveRequest var3 = this.requestGroup(-8035, 0, param0);
        if (var3 == null) {
          return null;
        }
        byte[] var4 = var3.getBytes((byte) 39);
        var3.unlink(false);
        return var4;
    }

    final static boolean canMessage(int param0, String param1, long param2, int param3, int[] param4) {
        RuntimeException var6 = null;
        int[] var7 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 28977) {
            var7 = (int[]) null;
            CachedArchiveSource.canMessage(-22, (String) null, 26L, -30, (int[]) null);
          }
          boolean decompiledFrameRemainder0 = true;
          if (param4 != null && (2 != param3 ||
            GameClock.isFriendOrGameMember(param1, param2, -24236))) {
            stackIn_8_0 = true;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_8_0 = false;
          }
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("oa.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void startPrefetch(boolean param0) {
        if (this.field_m == null) {
          return;
        }
        this.field_v = param0 ? true : false;
        if (null == this.field_o) {
          this.field_o = new IntrusiveDeque();
        }
    }

    final static void openSupportPage(java.applet.Applet param0, int param1) {
        try {
          java.net.URL var2 = null;
          if (param1 != 0) {
            field_u = (String) null;
          }
          try {
            var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
            param0.getAppletContext().showDocument(BoundedUrlRequest.appendSessionParameters(-1, param0, var2), "_top");
          } catch (Exception exception) {
            exception.printStackTrace();
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
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
        this.field_i = new NodeHashTable(16);
        this.field_g = 0;
        this.field_f = new IntrusiveDeque();
        this.field_w = 0L;
        try {
          this.field_m = param1;
          this.field_r = param0;
          if (this.field_m != null) {
            this.field_s = true;
            this.field_o = new IntrusiveDeque();
          } else {
            this.field_s = false;
          }
          this.field_k = param5;
          this.field_x = param6;
          this.field_t = param2;
          this.field_y = param3;
          this.field_j = param7;
          stackIn_7_1 = (param8);
          this.field_d = stackIn_7_1;
          this.field_e = param4;
          if (null != this.field_t) {
            this.field_l = (ArchiveRequest) ((Object) this.field_e.readImmediate(this.field_r, -16578, this.field_t));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = var10;
          stackIn_12_1 = new StringBuilder().append("oa.<init>(").append(param0).append(',');
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
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_u = "Show game chat from my friends";
    }
}
