/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee extends lk {
    static long field_e;
    private int field_u;
    static String field_q;
    private DiskCacheWorker field_v;
    private ArchiveRequest field_k;
    private int field_r;
    private qg field_p;
    private SectorCacheStore field_l;
    private SectorCacheStore field_i;
    private byte[] field_x;
    private ob field_w;
    static RgbSprite field_m;
    private int field_s;
    private byte[] field_h;
    private fc field_g;
    private IntrusiveDeque field_j;
    private IntrusiveDeque field_n;
    private int field_o;
    private boolean field_d;
    private boolean field_f;
    private boolean field_t;
    private long field_c;

    final void e(int param0) {
        ArchiveRequest discarded$3 = null;
        ArchiveRequest discarded$2 = null;
        ArchiveRequest discarded$1 = null;
        ArchiveRequest discarded$0 = null;
        int var2;
        ArchiveRequest var2_ref_wl;
        IntrusiveNode var3;
        int var4;
        int var5;
        IntrusiveNode var6;
        IntrusiveNode var7;
        int var2Lifetime1;
        int var2Lifetime2;
        int var4Lifetime1;
        IntrusiveNode var3Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        var5 = CrazyCrystals.field_B;
        if (this.field_j != null) {
          if (this.a(630779105) == null) {
            return;
          }
          if (this.field_d) {
            var2 = 1;
            var3 = this.field_j.beginForward(32073);
            while (var3 != null) {
              var4 = (int)var3.field_e;
              if (0 == this.field_h[var4]) {
                discarded$3 = this.a(true, 1, var4);
              }
              if (0 == this.field_h[var4]) {
                var2 = 0;
              } else {
                var3.unlink(false);
              }
              var3 = this.field_j.nextForward(false);
            }
            scanLoop1: while (true) {
              if (this.field_o < this.field_p.field_f.length) {
                if (this.field_p.field_f[this.field_o] != 0) {
                  if (this.field_v.field_c >= 250) {
                    var2 = 0;
                    break scanLoop1;
                  }
                  if (this.field_h[this.field_o] == 0) {
                    discarded$2 = this.a(true, 1, this.field_o);
                  }
                  if (this.field_h[this.field_o] == 0) {
                    var6 = new IntrusiveNode();
                    var6.field_e = (long)this.field_o;
                    var2 = 0;
                    this.field_j.addLast(0, var6);
                  }
                }
                this.field_o = this.field_o + 1;
                continue;
              }
              break;
            }
            if ((var2 != 0)) {
              this.field_o = 0;
              this.field_d = false;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_f) {
              var2Lifetime2 = 1;
              var3Lifetime1 = this.field_j.beginForward(32073);
              while (var3Lifetime1 != null) {
                var4Lifetime1 = (int)var3Lifetime1.field_e;
                if (1 != this.field_h[var4Lifetime1]) {
                  discarded$1 = this.a(true, 2, var4Lifetime1);
                }
                if (this.field_h[var4Lifetime1] == 1) {
                  var3Lifetime1.unlink(false);
                } else {
                  var2Lifetime2 = 0;
                }
                var3Lifetime1 = this.field_j.nextForward(false);
              }
              scanLoop2: while (true) {
                if (this.field_o < this.field_p.field_f.length) {
                  if (0 != this.field_p.field_f[this.field_o]) {
                    if (this.field_w.c(-21)) {
                      var2Lifetime2 = 0;
                      break scanLoop2;
                    }
                    if (this.field_h[this.field_o] != 1) {
                      discarded$0 = this.a(true, 2, this.field_o);
                    }
                    if (this.field_h[this.field_o] != 1) {
                      var7 = new IntrusiveNode();
                      var7.field_e = (long)this.field_o;
                      var2Lifetime2 = 0;
                      this.field_j.addLast(0, var7);
                    }
                  }
                  this.field_o = this.field_o + 1;
                  continue;
                }
                break;
              }
              if ((var2Lifetime2 != 0)) {
                this.field_f = false;
                this.field_o = 0;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_j = null;
            }
          }
        }
        if (this.field_t &&
          this.field_c <= lo.correctedCurrentTimeMillis((byte) 110)) {
          var2_ref_wl = (ArchiveRequest) (this.field_g.a((byte) -92));
          while (var2_ref_wl != null) {
            if (!var2_ref_wl.field_n) {
              if (var2_ref_wl.field_l) {
                if (!var2_ref_wl.field_q) {
                  throw new RuntimeException();
                }
                var2_ref_wl.unlink(false);
              } else {
                var2_ref_wl.field_l = true;
              }
            }
            var2_ref_wl = (ArchiveRequest) (this.field_g.a(105));
          }
          this.field_c = 1000L + lo.correctedCurrentTimeMillis((byte) -30);
        }
        var2Lifetime1 = -100 / ((param0 + 13) / 37);
    }

    final static wj a(ResourceArchive param0, String param1, byte param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        wj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param0.getGroupIdByName(param1, -1);
          var5 = param0.getFileIdByName(-2862, param3, var4_int);
          if (param2 >= -14) {
            field_m = (RgbSprite) null;
          }
          stackIn_3_0 = v.a(28297, var4_int, var5, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ee.K(");
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
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dn.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final int getGroupRequestProgressPercent(int param0, int param1) {
        ArchiveRequest var3 = (ArchiveRequest) (this.field_g.a((long)param0, 0));
        if (param1 != 486289953) {
          this.e(-120);
        }
        if (var3 == null) {
          return 0;
        }
        return var3.getProgressPercent((byte) 95);
    }

    final byte[] a(int param0, boolean param1) {
        ArchiveRequest var3 = this.a(true, 0, param0);
        if (param1) {
          this.field_c = -78L;
        }
        if (var3 == null) {
          return null;
        }
        byte[] var4 = var3.getData(-27);
        var3.unlink(param1);
        return var4;
    }

    public static void clearStaticReferences(int param0) {
        field_q = null;
        field_m = null;
        if (param0 != 0) {
          ee.clearStaticReferences(-92);
        }
    }

    private final ArchiveRequest a(boolean param0, int param1, int param2) {
        Object stackIn_58_0 = null;
        boolean stackIn_59_1 = false;
        Object stackIn_61_0 = null;
        Object stackIn_85_0 = null;
        boolean stackIn_86_1 = false;
        int stackIn_94_0 = 0;
        byte stackIn_94_1 = 0;
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
        var10 = CrazyCrystals.field_B;
        var12 = (ArchiveRequest) (this.field_g.a((long)param2, 0));
        var4 = var12;
        if (var12 != null &&
          param1 == 0 &&
          !var12.field_q &&
          var12.field_n) {
          var12.unlink(false);
          var4 = null;
        }
        if (!param0) {
          this.a(-107);
        }
        if (var4 == null) {
          if (0 == param1) {
            if (this.field_l != null &&
              this.field_h[param2] != -1) {
              var4 = this.field_v.readNow(param0, param2, this.field_l);
            } else {
              if (this.field_w.c((byte) -123)) {
                return null;
              }
              var4 = this.field_w.a(true, 18303, param2, this.field_r, (byte) 2);
            }
          } else {
            if (1 != param1) {
              if (param1 != 2) {
                throw new RuntimeException();
              }
              if (this.field_l == null) {
                throw new RuntimeException();
              }
              if (this.field_h[param2] != -1) {
                throw new RuntimeException();
              }
              if (this.field_w.c(-21)) {
                return null;
              }
              var4 = this.field_w.a(false, 18303, param2, this.field_r, (byte) 2);
            } else {
              if (null == this.field_l) {
                throw new RuntimeException();
              }
              var4 = this.field_v.requestRead(-4, param2, this.field_l);
            }
          }
          this.field_g.a(-22072, (long)param2, (IntrusiveNode) (var4));
        }
        if (((ArchiveRequest) (var4)).field_n) {
          return null;
        }
        var18 = ((ArchiveRequest) (var4)).getData(-5);
        var13 = var18;
        var5 = var13;
        if (var4 instanceof DiskArchiveRequest) {
          try {
            if (var5 != null &&
              2 < var18.length) {
              sj.field_b.reset();
              sj.field_b.update(var5, 0, -2 + var18.length);
              var6_int = (int)sj.field_b.getValue();
              if (this.field_p.field_n[param2] != var6_int) {
                throw new RuntimeException();
              }
              if (null != this.field_p.field_m &&
                null != this.field_p.field_m[param2]) {
                var27 = this.field_p.field_m[param2];
                var28 = ac.a(var5, 0, -2 + var18.length, (byte) -127);
                for (var9 = 0; 64 > var9; var9++) {
                  if (~var27[var9] != ~var28[var9]) {
                    throw new RuntimeException();
                  }
                }
              }
              var7 = (65280 & var5[var18.length - 2] << 8) + (var5[var18.length - 1] & 255);
              if (var7 != (this.field_p.field_g[param2] & 65535)) {
                throw new RuntimeException();
              }
              if (this.field_h[param2] != 1) {
                if (this.field_h[param2] == 0) {
                }
                this.field_h[param2] = (byte) 1;
              }
              if (!((ArchiveRequest) (var4)).field_q) {
                stackIn_58_0 = var4;
                stackIn_59_1 = !(param0);
                ((ArchiveRequest) stackIn_58_0).unlink(stackIn_59_1);
              }
              stackIn_61_0 = var4;
              return (ArchiveRequest) (stackIn_61_0);
            }
            throw new RuntimeException();
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            this.field_h[param2] = (byte)-1;
            ((ArchiveRequest) (var4)).unlink(false);
            if (((ArchiveRequest) (var4)).field_q &&
              !this.field_w.c((byte) -72)) {
              var4 = this.field_w.a(true, 18303, param2, this.field_r, (byte) 2);
              this.field_g.a(-22072, (long)param2, (IntrusiveNode) (var4));
            }
            return null;
          }
        }
        try {
          if (var5 != null &&
            var18.length > 2) {
            sj.field_b.reset();
            sj.field_b.update(var5, 0, -2 + var18.length);
            var6_int = (int)sj.field_b.getValue();
            if (var6_int != this.field_p.field_n[param2]) {
              throw new RuntimeException();
            }
            if (this.field_p.field_m != null &&
              this.field_p.field_m[param2] != null) {
              var29 = this.field_p.field_m[param2];
              var30 = ac.a(var5, 0, -2 + var18.length, (byte) -127);
              var11 = 0;
              var9 = var11;
              while (var11 < 64) {
                if (~var29[var11] != ~var30[var11]) {
                  throw new RuntimeException();
                }
                var11++;
              }
            }
            this.field_w.field_j = 0;
            this.field_w.field_p = 0;
          } else {
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (RuntimeException) (Object) decompiledCaughtException;
          this.field_w.e(20406);
          stackIn_85_0 = var4;
          stackIn_86_1 = !(param0);
          ((ArchiveRequest) stackIn_85_0).unlink(stackIn_86_1);
          if (((ArchiveRequest) (var4)).field_q) {
            if (this.field_w.c((byte) -73)) {
              return null;
            }
            var4 = this.field_w.a(true, 18303, param2, this.field_r, (byte) 2);
            this.field_g.a(-22072, (long)param2, (IntrusiveNode) (var4));
          }
          return null;
        }
        var5[var18.length - 2] = (byte)(this.field_p.field_g[param2] >>> 8);
        var5[var18.length - 1] = (byte)this.field_p.field_g[param2];
        if (null != this.field_l) {
          this.field_v.requestWrite(param2, this.field_l, var18, (byte) 116);
          stackIn_94_0 = 1;
          stackIn_94_1 = this.field_h[param2];
          if (stackIn_94_0 != stackIn_94_1) {
            this.field_h[param2] = (byte) 1;
          }
        }
        if (!((ArchiveRequest) (var4)).field_q) {
          ((ArchiveRequest) (var4)).unlink(false);
        }
        return (ArchiveRequest) (var4);
    }

    final qg a(int param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        byte[] var8 = null;
        byte[] var9 = null;
        var4 = CrazyCrystals.field_B;
        if (null != this.field_p) {
          return this.field_p;
        }
        if (param0 != 630779105) {
          return (qg) null;
        }
        if (this.field_k == null) {
          if (this.field_w.c((byte) -54)) {
            return null;
          }
          this.field_k = (ArchiveRequest) ((Object) this.field_w.a(true, 18303, this.field_r, 255, (byte) 0));
        }
        if (this.field_k.field_n) {
          return null;
        }
        var8 = this.field_k.getData(115);
        var6 = var8;
        var5 = var6;
        var9 = var5;
        var7 = var9;
        var2 = var7;
        if (this.field_k instanceof DiskArchiveRequest) {
          try {
            if (var2 == null) {
              throw new RuntimeException();
            }
            this.field_p = new qg(var9, this.field_u, this.field_x);
            if (this.field_s != this.field_p.field_r) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = decompiledCaughtException;
            this.field_p = null;
            if (this.field_w.c((byte) -90)) {
              this.field_k = null;
            } else {
              this.field_k = (ArchiveRequest) ((Object) this.field_w.a(true, 18303, this.field_r, 255, (byte) 0));
            }
            return null;
          }
        } else {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_p = new qg(var8, this.field_u, this.field_x);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = decompiledCaughtException;
            this.field_w.e(20406);
            this.field_p = null;
            if (!this.field_w.c((byte) -82)) {
              this.field_k = (ArchiveRequest) ((Object) this.field_w.a(true, 18303, this.field_r, 255, (byte) 0));
            } else {
              this.field_k = null;
            }
            return null;
          }
          if (null != this.field_i) {
            this.field_v.requestWrite(this.field_r, this.field_i, var8, (byte) 116);
          }
        }
        if (null != this.field_l) {
          this.field_h = new byte[this.field_p.field_a];
        }
        this.field_k = null;
        return this.field_p;
    }

    final void c(int param0) {
        ArchiveRequest discarded$0 = null;
        ArchiveRequest discarded$1 = null;
        IntrusiveNode var2;
        int var3;
        int var4;
        var4 = CrazyCrystals.field_B;
        if (null == this.field_j) {
          return;
        }
        if (param0 < 112) {
          this.field_h = (byte[]) null;
        }
        if (this.a(630779105) == null) {
          return;
        }
        var2 = this.field_n.beginForward(32073);
        while (var2 != null) {
          var3 = (int)var2.field_e;
          if (var3 >= 0) {
            if (this.field_p.field_a > var3) {
              if (this.field_p.field_f[var3] == 0) {
                var2.unlink(false);
              } else {
                if (0 == this.field_h[var3]) {
                  discarded$0 = this.a(true, 1, var3);
                }
                if (this.field_h[var3] == -1) {
                  discarded$1 = this.a(true, 2, var3);
                }
                if (this.field_h[var3] == 1) {
                  var2.unlink(false);
                }
              }
            } else {
              var2.unlink(false);
            }
          } else {
            var2.unlink(false);
          }
          var2 = this.field_n.nextForward(false);
        }
    }

    final static boolean a(int[] param0, int param1) {
        int var5_int = 0;
        int var6 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        mo var4_ref_mo = null;
        int var4 = 0;
        mo var5 = null;
        int var7 = 0;
        var7 = CrazyCrystals.field_B;
        try {
          if (LevelCompleteEntrancePhase.field_h != gj.field_k) {
            return false;
          }
          if (param1 != 64) {
            return false;
          }
          var2_long = lo.correctedCurrentTimeMillis((byte) -98);
          if (0 != IntrusiveDeque.field_d &&
            sm.field_i < 0) {
            var4_ref_mo = (mo) (bn.field_i.beginForward(32073));
            if (var4_ref_mo != null &&
              var4_ref_mo.field_k < var2_long) {
              var4_ref_mo.unlink(false);
              rk.field_b = var4_ref_mo.field_g.length;
              ConfirmedEmailAvailabilityValidator.field_n.position = 0;
              for (var5_int = 0; rk.field_b > var5_int; var5_int++) {
                ConfirmedEmailAvailabilityValidator.field_n.payload[var5_int] = var4_ref_mo.field_g[var5_int];
              }
              fl.field_m = ea.field_n;
              ea.field_n = Bzip2State.field_u;
              Bzip2State.field_u = bf.field_b;
              bf.field_b = var4_ref_mo.field_j;
              return true;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_43_0 = var2;
          stackIn_43_1 = new StringBuilder().append("ee.G(");
          if (param0 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw dn.wrapClientException((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param1).append(')').toString());
        }
        stackIn_21_0 = sm.field_i;
        try {
          while (true) {
            if (stackIn_21_0 < 0) {
              ConfirmedEmailAvailabilityValidator.field_n.position = 0;
              if (!fq.a(1, (byte) 104)) {
                return false;
              }
              sm.field_i = ConfirmedEmailAvailabilityValidator.field_n.e(true);
              ConfirmedEmailAvailabilityValidator.field_n.position = 0;
              rk.field_b = param0[sm.field_i];
            }
            if (!ol.f((byte) 60)) {
              return false;
            }
            if (IntrusiveDeque.field_d == 0) {
              fl.field_m = ea.field_n;
              ea.field_n = Bzip2State.field_u;
              Bzip2State.field_u = bf.field_b;
              bf.field_b = sm.field_i;
              sm.field_i = -1;
              return true;
            }
            var4 = IntrusiveDeque.field_d;
            if (0.0 != FloatingScoreLabel.field_b) {
              var4 = (int)((double)var4 + og.field_w.nextGaussian() * FloatingScoreLabel.field_b);
              if (var4 < 0) {
                var4 = 0;
              }
            }
            var5 = new mo((long)var4 + var2_long, sm.field_i, new byte[rk.field_b]);
            for (var6 = 0; var6 < rk.field_b; var6++) {
              var5.field_g[var6] = ConfirmedEmailAvailabilityValidator.field_n.payload[var6];
            }
            bn.field_i.addLast(param1 ^ 64, var5);
            sm.field_i = -1;
            stackIn_21_0 = sm.field_i;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2 = decompiledCaughtException;
          stackIn_43_0 = var2;
          stackIn_43_1 = new StringBuilder().append("ee.G(");
          if (param0 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw dn.wrapClientException((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param1).append(')').toString());
        }
    }

    final void b(byte param0) {
        if (this.field_l == null) {
          return;
        }
        this.field_f = true;
        if (this.field_j == null) {
          this.field_j = new IntrusiveDeque();
        }
        int var2 = 42 % ((param0 - 7) / 45);
    }

    ee(int param0, SectorCacheStore param1, SectorCacheStore param2, ob param3, DiskCacheWorker param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_g = new fc(16);
        this.field_o = 0;
        this.field_n = new IntrusiveDeque();
        this.field_c = 0L;
        try {
          this.field_l = param1;
          this.field_r = param0;
          if (null == this.field_l) {
            this.field_d = false;
          } else {
            this.field_d = true;
            this.field_j = new IntrusiveDeque();
          }
          this.field_s = param7;
          this.field_i = param2;
          this.field_w = param3;
          stackIn_7_1 = (param8);
          this.field_t = stackIn_7_1;
          this.field_u = param5;
          this.field_v = param4;
          this.field_x = param6;
          if (null != this.field_i) {
            this.field_k = (ArchiveRequest) ((Object) this.field_v.readNow(true, this.field_r, this.field_i));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = var10;
          stackIn_12_1 = new StringBuilder().append("ee.<init>(").append(param0).append(',');
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
          throw dn.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_q = "Login: ";
    }
}
