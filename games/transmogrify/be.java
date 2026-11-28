/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be extends ih {
    private uh field_t;
    private ArchiveRequest field_f;
    private int field_o;
    private fl field_m;
    private int field_r;
    private SectorCacheStore field_p;
    private DiskCacheWorker field_g;
    private SectorCacheStore field_z;
    private byte[] field_i;
    static int field_q;
    private byte[] field_k;
    private el field_v;
    private int field_A;
    private IntrusiveDeque field_y;
    private int field_e;
    private IntrusiveDeque field_s;
    private boolean field_h;
    private boolean field_u;
    private boolean field_j;
    private long field_l;
    static nk field_w;
    static ResourceArchive field_n;
    static int field_x;

    public static void c(byte param0) {
        if (param0 <= 92) {
          be.b(-13);
        }
        field_n = null;
        field_w = null;
    }

    private final ArchiveRequest a(int param0, byte param1, int param2) {
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
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
        var10 = Transmogrify.field_A ? 1 : 0;
        var12 = (ArchiveRequest) (this.field_m.a((long)param0, 0));
        var4 = var12;
        if (var12 != null &&
          param2 == 0 &&
          !var12.field_p &&
          var12.field_m) {
          var12.unlink(5);
          var4 = null;
        }
        if (var4 == null) {
          if (param2 != 0) {
            if (param2 != 1) {
              if (2 != param2) {
                throw new RuntimeException();
              }
              if (this.field_p == null) {
                throw new RuntimeException();
              }
              if (this.field_k[param0] != -1) {
                throw new RuntimeException();
              }
              if (this.field_t.b((byte) 95)) {
                return null;
              }
              var4 = this.field_t.a(this.field_r, false, false, (byte) 2, param0);
            } else {
              if (this.field_p == null) {
                throw new RuntimeException();
              }
              var4 = this.field_g.requestRead(param0, this.field_p, (byte) 67);
            }
          } else {
            if (this.field_p != null &&
              this.field_k[param0] != -1) {
              var4 = this.field_g.readNow(this.field_p, param0, true);
            } else {
              if (this.field_t.b(6)) {
                return null;
              }
              var4 = this.field_t.a(this.field_r, false, true, (byte) 2, param0);
            }
          }
          this.field_m.a((long)param0, (byte) -98, (IntrusiveNode) (var4));
        }
        if (((ArchiveRequest) (var4)).field_m) {
          return null;
        }
        var18 = ((ArchiveRequest) (var4)).getData(256);
        var13 = var18;
        var5 = var13;
        if (param1 != 2) {
          this.getGroupRequestProgressPercent(-44, 48);
        }
        if (var4 instanceof DiskArchiveRequest) {
          try {
            if (var5 != null &&
              var18.length > 2) {
              hc.field_v.reset();
              hc.field_v.update(var5, 0, var18.length - 2);
              var6_int = (int)hc.field_v.getValue();
              if (var6_int != this.field_v.field_j[param0]) {
                throw new RuntimeException();
              }
              if (this.field_v.field_p != null &&
                null != this.field_v.field_p[param0]) {
                var30 = this.field_v.field_p[param0];
                var29 = n.a(var5, var18.length - 2, -5705, 0);
                var11 = 0;
                var9 = var11;
                while (var11 < 64) {
                  if (var29[var11] != var30[var11]) {
                    throw new RuntimeException();
                  }
                  var11++;
                }
              }
              var7 = (var5[var18.length - 2] << 8 & 65280) + (var5[-1 + var18.length] & 255);
              if ((65535 & this.field_v.field_q[param0]) != var7) {
                throw new RuntimeException();
              }
              if (this.field_k[param0] != 1) {
                if (0 == this.field_k[param0]) {
                }
                this.field_k[param0] = (byte) 1;
              }
              if (!((ArchiveRequest) (var4)).field_p) {
                ((ArchiveRequest) (var4)).unlink(param1 + 3);
              }
              stackIn_91_0 = var4;
              return (ArchiveRequest) (stackIn_91_0);
            }
            throw new RuntimeException();
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            this.field_k[param0] = (byte)-1;
            ((ArchiveRequest) (var4)).unlink(param1 ^ 7);
            if (((ArchiveRequest) (var4)).field_p) {
              if (this.field_t.b(6)) {
                return null;
              }
              var4 = this.field_t.a(this.field_r, false, true, (byte) 2, param0);
              this.field_m.a((long)param0, (byte) 98, (IntrusiveNode) (var4));
            }
            return null;
          }
        }
        try {
          if (var5 != null &&
            var18.length > 2) {
            hc.field_v.reset();
            hc.field_v.update(var5, 0, var18.length - 2);
            var6_int = (int)hc.field_v.getValue();
            if (var6_int != this.field_v.field_j[param0]) {
              throw new RuntimeException();
            }
            if (this.field_v.field_p != null &&
              null != this.field_v.field_p[param0]) {
              var27 = this.field_v.field_p[param0];
              var28 = n.a(var5, var18.length - 2, -5705, 0);
              for (var9 = 0; var9 < 64; var9++) {
                if (var27[var9] != var28[var9]) {
                  throw new RuntimeException();
                }
              }
            }
            this.field_t.field_p = 0;
            this.field_t.field_k = 0;
          } else {
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref = (RuntimeException) (Object) decompiledCaughtException;
          this.field_t.d(126);
          ((ArchiveRequest) (var4)).unlink(5);
          if (!((ArchiveRequest) (var4)).field_p) {
            return null;
          }
          if (this.field_t.b(6)) {
            return null;
          }
          var4 = this.field_t.a(this.field_r, false, true, (byte) 2, param0);
          this.field_m.a((long)param0, (byte) -102, (IntrusiveNode) (var4));
          return null;
        }
        var5[-2 + var18.length] = (byte)(this.field_v.field_q[param0] >>> 8);
        var5[-1 + var18.length] = (byte)this.field_v.field_q[param0];
        if (null != this.field_p) {
          this.field_g.requestWrite(this.field_p, var18, -122, param0);
          stackIn_60_0 = ~this.field_k[param0];
          stackIn_60_1 = -2;
          if (stackIn_60_0 != stackIn_60_1) {
            this.field_k[param0] = (byte) 1;
          }
        }
        if (!((ArchiveRequest) (var4)).field_p) {
          ((ArchiveRequest) (var4)).unlink(5);
        }
        return (ArchiveRequest) (var4);
    }

    final el a(int param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        if (null != this.field_v) {
          return this.field_v;
        }
        if (param0 > -88) {
          return (el) null;
        }
        if (null == this.field_f) {
          if (this.field_t.b(6)) {
            return null;
          }
          this.field_f = (ArchiveRequest) ((Object) this.field_t.a(255, false, true, (byte) 0, this.field_r));
        }
        if (this.field_f.field_m) {
          return null;
        }
        var7 = this.field_f.getData(256);
        var6 = var7;
        var5 = var6;
        var2 = var5;
        if (!(this.field_f instanceof DiskArchiveRequest)) {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_v = new el(var7, this.field_A, this.field_i);
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = decompiledCaughtException;
            this.field_t.d(121);
            this.field_v = null;
            if (!this.field_t.b(6)) {
              this.field_f = (ArchiveRequest) ((Object) this.field_t.a(255, false, true, (byte) 0, this.field_r));
            } else {
              this.field_f = null;
            }
            return null;
          }
          if (null != this.field_z) {
            this.field_g.requestWrite(this.field_z, var7, -78, this.field_r);
          }
        } else {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_v = new el(var7, this.field_A, this.field_i);
            if (this.field_v.field_b != this.field_o) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = decompiledCaughtException;
            this.field_v = null;
            if (this.field_t.b(6)) {
              this.field_f = null;
            } else {
              this.field_f = (ArchiveRequest) ((Object) this.field_t.a(255, false, true, (byte) 0, this.field_r));
            }
            return null;
          }
        }
        if (null != this.field_p) {
          this.field_k = new byte[this.field_v.field_l];
        }
        this.field_f = null;
        return this.field_v;
    }

    final void d(int param0) {
        int var3 = 0;
        ArchiveRequest discarded$0 = null;
        ArchiveRequest discarded$1 = null;
        int var4 = Transmogrify.field_A ? 1 : 0;
        if (null == this.field_s) {
          return;
        }
        if (null == this.a(-119)) {
          return;
        }
        IntrusiveNode var2 = this.field_y.beginForward((byte) -95);
        while (var2 != null) {
          var3 = (int)var2.key;
          if (var3 < 0) {
            var2.unlink(5);
          } else {
            if (this.field_v.field_l <= var3) {
              var2.unlink(5);
            } else {
              if (0 == this.field_v.field_s[var3]) {
                var2.unlink(5);
              } else {
                if (0 == this.field_k[var3]) {
                  discarded$0 = this.a(var3, (byte) 2, 1);
                }
                if (this.field_k[var3] == -1) {
                  discarded$1 = this.a(var3, (byte) 2, 2);
                }
                if (this.field_k[var3] == 1) {
                  var2.unlink(param0 ^ 23884);
                }
              }
            }
          }
          var2 = this.field_y.nextForward(true);
        }
        if (param0 != 23881) {
          this.field_v = (el) null;
        }
    }

    final static int b(int param0) {
        if (param0 != 71) {
          field_q = -78;
        }
        if (ResizableModalDialog.field_L < 2) {
          return 0;
        }
        if (0 == NodeHashTableIterator.field_f) {
          if (!RasterBuffer.field_c.ensureIndexLoaded((byte) -126)) {
            return 20;
          }
          if (!RasterBuffer.field_c.tryLoadGroupByName((byte) 120, "commonui")) {
            return 40;
          }
          if (!wi.field_e.ensureIndexLoaded((byte) -127)) {
            return 50;
          }
          if (!wi.field_e.tryLoadGroupByName((byte) 112, "commonui")) {
            return 60;
          }
          if (!DelayedPcmStream.field_n.ensureIndexLoaded((byte) -118)) {
            return 70;
          }
          if (!DelayedPcmStream.field_n.tryLoadAllGroups(param0 ^ 32088)) {
            return 80;
          }
        } else {
          if (null != hg.field_a) {
            if (!hg.field_a.ensureIndexLoaded((byte) -114)) {
              return 14;
            }
            if (!hg.field_a.hasGroupName((byte) -120, "")) {
              return 29;
            }
            if (!hg.field_a.tryLoadGroupByName((byte) -98, "")) {
              return 29;
            }
          }
          if (!RasterBuffer.field_c.ensureIndexLoaded((byte) -125)) {
            return 43;
          }
          if (!RasterBuffer.field_c.tryLoadGroupByName((byte) 120, "commonui")) {
            return 57;
          }
          if (!wi.field_e.ensureIndexLoaded((byte) -118)) {
            return 71;
          }
          if (!wi.field_e.tryLoadGroupByName((byte) -42, "commonui")) {
            return 80;
          }
          if (!DelayedPcmStream.field_n.ensureIndexLoaded((byte) -118)) {
            return 82;
          }
          if (!DelayedPcmStream.field_n.tryLoadAllGroups(param0 ^ 32088)) {
            return 86;
          }
        }
        return 100;
    }

    final void a(boolean param0) {
        if (null == this.field_p) {
          return;
        }
        this.field_h = param0 ? true : false;
        if (null == this.field_s) {
          this.field_s = new IntrusiveDeque();
        }
    }

    final static boolean a(String param0, int param1, String param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ga.a(param0, 3336)) {
            return false;
          }
          if (ve.a(1, param0)) {
            return false;
          }
          if (vj.a(-23424, param0)) {
            return false;
          }
          if (param2.length() == param1) {
            return true;
          }
          if (fc.a((byte) 19, param0, param2)) {
            return false;
          }
          if (fk.a(param2, (byte) 34, param0)) {
            return false;
          }
          if (!TextFieldValidator.a(param2, (byte) 117, param0)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_27_0 = var3;
          stackIn_27_1 = new StringBuilder().append("be.I(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw ch.wrapClientException((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    final void b(byte param0) {
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
        int var4Lifetime1;
        IntrusiveNode var3Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        var5 = Transmogrify.field_A ? 1 : 0;
        if (null != this.field_s) {
          if (null == this.a(-95)) {
            return;
          }
          if (this.field_u) {
            var2_int = 1;
            var3 = this.field_s.beginForward((byte) -95);
            while (var3 != null) {
              var4 = (int)var3.key;
              if (this.field_k[var4] == 0) {
                discarded$1 = this.a(var4, (byte) 2, 1);
              }
              if (this.field_k[var4] == 0) {
                var2_int = 0;
              } else {
                var3.unlink(5);
              }
              var3 = this.field_s.nextForward(true);
            }
            scanLoop1: while (true) {
              if (this.field_e < this.field_v.field_s.length) {
                if (this.field_v.field_s[this.field_e] != 0) {
                  if (250 <= this.field_g.field_e) {
                    var2_int = 0;
                    break scanLoop1;
                  }
                  if (this.field_k[this.field_e] == 0) {
                    discarded$0 = this.a(this.field_e, (byte) 2, 1);
                  }
                  if (this.field_k[this.field_e] == 0) {
                    var7 = new IntrusiveNode();
                    var7.key = (long)this.field_e;
                    var2_int = 0;
                    this.field_s.addLast(var7, -115);
                  }
                }
                this.field_e = this.field_e + 1;
                continue;
              }
              break;
            }
            if ((var2_int != 0)) {
              this.field_e = 0;
              this.field_u = false;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_h) {
              var2_intLifetime1 = 1;
              var3Lifetime1 = this.field_s.beginForward((byte) -95);
              while (var3Lifetime1 != null) {
                var4Lifetime1 = (int)var3Lifetime1.key;
                if (this.field_k[var4Lifetime1] != 1) {
                  discarded$3 = this.a(var4Lifetime1, (byte) 2, 2);
                }
                if (1 == this.field_k[var4Lifetime1]) {
                  var3Lifetime1.unlink(5);
                } else {
                  var2_intLifetime1 = 0;
                }
                var3Lifetime1 = this.field_s.nextForward(true);
              }
              while (this.field_v.field_s.length > this.field_e) {
                if (this.field_v.field_s[this.field_e] == 0) {
                  this.field_e = this.field_e + 1;
                  continue;
                }
                if (!this.field_t.b((byte) 122)) {
                  if (this.field_k[this.field_e] != 1) {
                    discarded$2 = this.a(this.field_e, (byte) 2, 2);
                  }
                  if (1 != this.field_k[this.field_e]) {
                    var6 = new IntrusiveNode();
                    var6.key = (long)this.field_e;
                    this.field_s.addLast(var6, -89);
                    var2_intLifetime1 = 0;
                  }
                  this.field_e = this.field_e + 1;
                  continue;
                }
                var2_intLifetime1 = 0;
                break;
              }
              if ((var2_intLifetime1 != 0)) {
                this.field_h = false;
                this.field_e = 0;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_s = null;
            }
          }
        }
        if (param0 < 122) {
          this.field_g = (DiskCacheWorker) null;
        }
        if (this.field_j &&
          this.field_l <= lk.correctedCurrentTimeMillis(0)) {
          var2 = (ArchiveRequest) (this.field_m.b(1000));
          while (var2 != null) {
            if (!var2.field_m) {
              if (var2.field_o) {
                if (!var2.field_p) {
                  throw new RuntimeException();
                }
                var2.unlink(5);
              } else {
                var2.field_o = true;
              }
            }
            var2 = (ArchiveRequest) (this.field_m.a(58));
          }
          this.field_l = lk.correctedCurrentTimeMillis(0) + 1000L;
        }
    }

    final byte[] a(int param0, int param1) {
        int var3 = 76 / ((-41 - param1) / 60);
        ArchiveRequest var4 = this.a(param0, (byte) 2, 0);
        if (var4 == null) {
          return null;
        }
        byte[] var5 = var4.getData(256);
        var4.unlink(5);
        return var5;
    }

    final static hg c(int param0) {
        String var1 = DiskCacheWorker.b(-89);
        if (var1 != null &&
          0 <= var1.indexOf('@')) {
          var1 = "";
        }
        if (param0 < 5) {
          return (hg) null;
        }
        return new hg(DiskCacheWorker.b(-127), cf.d(4819119));
    }

    final int getGroupRequestProgressPercent(int param0, int param1) {
        ArchiveRequest var3 = (ArchiveRequest) (this.field_m.a((long)param1, 0));
        if (var3 != null) {
          return var3.getProgressPercent(0);
        }
        if (param0 > -13) {
          this.field_r = 65;
          return 0;
        }
        return 0;
    }

    be(int param0, SectorCacheStore param1, SectorCacheStore param2, uh param3, DiskCacheWorker param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_m = new fl(16);
        this.field_e = 0;
        this.field_y = new IntrusiveDeque();
        this.field_l = 0L;
        try {
          this.field_r = param0;
          this.field_p = param1;
          if (null != this.field_p) {
            this.field_u = true;
            this.field_s = new IntrusiveDeque();
          } else {
            this.field_u = false;
          }
          this.field_A = param5;
          this.field_t = param3;
          this.field_i = param6;
          stackIn_7_1 = (param8);
          this.field_j = stackIn_7_1;
          this.field_z = param2;
          this.field_o = param7;
          this.field_g = param4;
          if (null != this.field_z) {
            this.field_f = (ArchiveRequest) ((Object) this.field_g.readNow(this.field_z, this.field_r, true));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = var10;
          stackIn_12_1 = new StringBuilder().append("be.<init>(").append(param0).append(',');
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
          throw ch.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_w = new nk(0);
    }
}
