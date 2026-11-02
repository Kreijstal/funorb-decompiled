/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd extends ArchiveSource {
    static IntrusiveDeque field_q;
    private int field_y;
    private NodeHashTable field_v;
    private int field_o;
    private ae field_g;
    static Sprite field_p;
    private int field_m;
    private hf field_w;
    static oi field_f;
    static boolean field_x;
    private byte[] field_d;
    private AsyncRequest field_t;
    private ArchiveIndex field_e;
    private sd field_i;
    private byte[] field_u;
    private hf field_n;
    private boolean field_j;
    private boolean field_z;
    private IntrusiveDeque field_s;
    private int field_k;
    private IntrusiveDeque field_r;
    private boolean field_h;
    private long field_l;

    final int b(int param0, int param1) {
        if (param1 != -21770) {
          this.field_w = (hf) null;
        }
        AsyncRequest var3 = (AsyncRequest) (this.field_v.a(8434, (long)param0));
        if (var3 == null) {
          return 0;
        }
        return var3.a((byte) 43);
    }

    final void a(byte param0) {
        AsyncRequest discarded$0 = null;
        AsyncRequest discarded$1 = null;
        IntrusiveNode var2;
        int var3;
        int var4;
        var4 = TrackController.field_F ? 1 : 0;
        if (null == this.field_r) {
          return;
        }
        if (param0 != -41) {
          this.b(true);
        }
        if (this.a(9) == null) {
          return;
        }
        var2 = this.field_s.first(param0 + 43);
        while (var2 != null) {
          var3 = (int)var2.key;
          if (var3 >= 0) {
            if (this.field_e.field_n > var3) {
              if (this.field_e.field_l[var3] == 0) {
                var2.unlink(-33);
              } else {
                if (this.field_d[var3] == 0) {
                  discarded$0 = this.a(1, (byte) -128, var3);
                }
                if (this.field_d[var3] == -1) {
                  discarded$1 = this.a(2, (byte) -8, var3);
                }
                if (this.field_d[var3] == 1) {
                  var2.unlink(-108);
                }
              }
            } else {
              var2.unlink(-33);
            }
          } else {
            var2.unlink(-33);
          }
          var2 = this.field_s.next(10);
        }
    }

    final void b(int param0) {
        if (null == this.field_w) {
          return;
        }
        if (param0 != 6054) {
          this.field_t = (AsyncRequest) null;
        }
        this.field_z = true;
        if (this.field_r == null) {
          this.field_r = new IntrusiveDeque();
        }
    }

    final static java.applet.Applet b(byte param0) {
        if (null != q.field_c) {
          return q.field_c;
        }
        if (param0 != 77) {
          gd.b((byte) -108);
        }
        return (java.applet.Applet) ((Object) f.field_c);
    }

    final byte[] a(int param0, int param1) {
        AsyncRequest var3 = this.a(0, (byte) 98, param1);
        if (var3 == null) {
          return null;
        }
        byte[] var4 = var3.g(param0 + 513);
        var3.unlink(-86);
        if (param0 != -1) {
          this.field_n = (hf) null;
        }
        return var4;
    }

    public static void c(int param0) {
        field_p = null;
        if (param0 != -3) {
          gd.b((byte) -10);
        }
        field_q = null;
        field_f = null;
    }

    final ArchiveIndex a(int param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = TrackController.field_F ? 1 : 0;
        if (null != this.field_e) {
          return this.field_e;
        }
        if (null == this.field_t) {
          if (this.field_g.d(-18316)) {
            return null;
          }
          this.field_t = (AsyncRequest) ((Object) this.field_g.a(255, true, false, this.field_m, (byte) 0));
        }
        if (this.field_t.field_w) {
          return null;
        }
        var7 = this.field_t.g(512);
        var6 = var7;
        var5 = var6;
        var2 = var5;
        if (!(this.field_t instanceof lh)) {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_e = new ArchiveIndex(var7, this.field_o, this.field_u);
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = decompiledCaughtException;
            this.field_g.b((byte) 107);
            this.field_e = null;
            if (!this.field_g.d(param0 ^ -18307)) {
              this.field_t = (AsyncRequest) ((Object) this.field_g.a(255, true, false, this.field_m, (byte) 0));
            } else {
              this.field_t = null;
            }
            return null;
          }
          if (null != this.field_n) {
            this.field_i.a(this.field_m, var7, this.field_n, (byte) 117);
          }
        } else {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_e = new ArchiveIndex(var7, this.field_o, this.field_u);
            if (this.field_y != this.field_e.field_k) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = decompiledCaughtException;
            this.field_e = null;
            if (this.field_g.d(-18316)) {
              this.field_t = null;
            } else {
              this.field_t = (AsyncRequest) ((Object) this.field_g.a(255, true, false, this.field_m, (byte) 0));
            }
            return null;
          }
        }
        if (this.field_w != null) {
          this.field_d = new byte[this.field_e.field_n];
        }
        if (param0 != 9) {
          this.b(true);
        }
        this.field_t = null;
        return this.field_e;
    }

    private final AsyncRequest a(int param0, byte param1, int param2) {
        Object stackIn_60_0 = null;
        byte stackIn_92_0 = 0;
        int stackIn_92_1 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        byte[] var5 = null;
        int var6 = 0;
        int var7_int = 0;
        RuntimeException var7 = null;
        Exception var7_ref = null;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        AsyncRequest var13 = null;
        byte[] var14 = null;
        byte[] var19 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        byte[] var31 = null;
        var11 = TrackController.field_F ? 1 : 0;
        var13 = (AsyncRequest) (this.field_v.a(8434, (long)param2));
        var4 = var13;
        if (var13 != null &&
          0 == param0 &&
          !var13.field_q &&
          var13.field_w) {
          var13.unlink(-120);
          var4 = null;
        }
        if (var4 == null) {
          if (0 == param0) {
            if (this.field_w != null &&
              this.field_d[param2] != -1) {
              var4 = this.field_i.a((byte) 93, param2, this.field_w);
            } else {
              if (this.field_g.d(-18316)) {
                return null;
              }
              var4 = this.field_g.a(this.field_m, true, false, param2, (byte) 2);
            }
          } else {
            if (param0 != 1) {
              if (param0 != 2) {
                throw new RuntimeException();
              }
              if (null == this.field_w) {
                throw new RuntimeException();
              }
              if (this.field_d[param2] != -1) {
                throw new RuntimeException();
              }
              if (this.field_g.c(-28419)) {
                return null;
              }
              var4 = this.field_g.a(this.field_m, false, false, param2, (byte) 2);
            } else {
              if (null == this.field_w) {
                throw new RuntimeException();
              }
              var4 = this.field_i.a(true, param2, this.field_w);
            }
          }
          this.field_v.a(false, (long)param2, (IntrusiveNode) (var4));
        }
        if (((AsyncRequest) (var4)).field_w) {
          return null;
        }
        var6 = 72 % ((-59 - param1) / 50);
        var19 = ((AsyncRequest) (var4)).g(512);
        var14 = var19;
        var5 = var14;
        if (var4 instanceof lh) {
          try {
            if (var5 != null &&
              var19.length > 2) {
              q.field_k.reset();
              q.field_k.update(var5, 0, -2 + var19.length);
              var7_int = (int)q.field_k.getValue();
              if (var7_int != this.field_e.field_b[param2]) {
                throw new RuntimeException();
              }
              if (null != this.field_e.field_g &&
                this.field_e.field_g[param2] != null) {
                var29 = this.field_e.field_g[param2];
                var28 = cf.a(0, var5, -2 + var19.length, -6196);
                for (var10 = 0; var10 < 64; var10++) {
                  if (var28[var10] != var29[var10]) {
                    throw new RuntimeException();
                  }
                }
              }
              var8 = (var5[-1 + var19.length] & 255) + (var5[var19.length - 2] << 8 & 65280);
              if ((this.field_e.field_d[param2] & 65535) != var8) {
                throw new RuntimeException();
              }
              if (this.field_d[param2] != 1) {
                if (this.field_d[param2] == 0) {
                }
                this.field_d[param2] = (byte) 1;
              }
              if (!((AsyncRequest) (var4)).field_q) {
                ((AsyncRequest) (var4)).unlink(-59);
              }
              stackIn_60_0 = var4;
              return (AsyncRequest) (stackIn_60_0);
            }
            throw new RuntimeException();
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var7_ref = (Exception) (Object) decompiledCaughtException;
            this.field_d[param2] = (byte)-1;
            ((AsyncRequest) (var4)).unlink(-122);
            if (!((AsyncRequest) (var4)).field_q) {
              return null;
            }
            if (!this.field_g.d(-18316)) {
              var4 = this.field_g.a(this.field_m, true, false, param2, (byte) 2);
              this.field_v.a(false, (long)param2, (IntrusiveNode) (var4));
            }
            return null;
          }
        }
        try {
          if (var5 != null &&
            var19.length > 2) {
            q.field_k.reset();
            q.field_k.update(var5, 0, var19.length - 2);
            var7_int = (int)q.field_k.getValue();
            if (var7_int != this.field_e.field_b[param2]) {
              throw new RuntimeException();
            }
            if (this.field_e.field_g != null &&
              this.field_e.field_g[param2] != null) {
              var31 = this.field_e.field_g[param2];
              var30 = cf.a(0, var5, var19.length - 2, -6196);
              var12 = 0;
              var10 = var12;
              while (var12 < 64) {
                if (~var30[var12] != ~var31[var12]) {
                  throw new RuntimeException();
                }
                var12++;
              }
            }
            this.field_g.field_e = 0;
            this.field_g.field_b = 0;
          } else {
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = (RuntimeException) (Object) decompiledCaughtException;
          this.field_g.b((byte) 113);
          ((AsyncRequest) (var4)).unlink(-90);
          if (((AsyncRequest) (var4)).field_q) {
            if (this.field_g.d(-18316)) {
              return null;
            }
            var4 = this.field_g.a(this.field_m, true, false, param2, (byte) 2);
            this.field_v.a(false, (long)param2, (IntrusiveNode) (var4));
          }
          return null;
        }
        var5[-2 + var19.length] = (byte)(this.field_e.field_d[param2] >>> 8);
        var5[var19.length - 1] = (byte)this.field_e.field_d[param2];
        if (null != this.field_w) {
          this.field_i.a(param2, var19, this.field_w, (byte) 92);
          stackIn_92_0 = this.field_d[param2];
          stackIn_92_1 = 1;
          if (stackIn_92_0 != stackIn_92_1) {
            this.field_d[param2] = (byte) 1;
          }
        }
        if (!((AsyncRequest) (var4)).field_q) {
          ((AsyncRequest) (var4)).unlink(-52);
        }
        return (AsyncRequest) (var4);
    }

    final void b(boolean param0) {
        AsyncRequest discarded$1 = null;
        AsyncRequest discarded$0 = null;
        AsyncRequest discarded$3 = null;
        AsyncRequest discarded$2 = null;
        int var2_int;
        AsyncRequest var2;
        IntrusiveNode var3;
        int var4;
        int var5;
        IntrusiveNode var6;
        IntrusiveNode var7;
        int var2_intLifetime1;
        int var4Lifetime1;
        AsyncRequest var2Lifetime1;
        IntrusiveNode var3Lifetime1;
        boolean decompiledFrameRemainder1 = true;
        boolean decompiledFrameRemainder0 = true;
        boolean decompiledFrameRemainder2 = true;
        boolean decompiledFrameRemainder3 = true;
        var5 = TrackController.field_F ? 1 : 0;
        if (null != this.field_r) {
          if (this.a(9) == null) {
            return;
          }
          if (this.field_j) {
            var2_int = 1;
            var3 = this.field_r.first(2);
            while (var3 != null) {
              var4 = (int)var3.key;
              if (0 == this.field_d[var4]) {
                discarded$1 = this.a(1, (byte) 90, var4);
              }
              if (this.field_d[var4] != 0) {
                var3.unlink(-47);
              } else {
                var2_int = 0;
              }
              var3 = this.field_r.next(10);
            }
            while (this.field_e.field_l.length > this.field_k) {
              if (this.field_e.field_l[this.field_k] == 0) {
                this.field_k = this.field_k + 1;
                continue;
              }
              if (this.field_i.field_a < 250) {
                if (this.field_d[this.field_k] == 0) {
                  discarded$0 = this.a(1, (byte) 2, this.field_k);
                }
                if (this.field_d[this.field_k] == 0) {
                  var7 = new IntrusiveNode();
                  var7.key = (long)this.field_k;
                  var2_int = 0;
                  this.field_r.addLast((byte) -128, var7);
                }
                this.field_k = this.field_k + 1;
                continue;
              }
              var2_int = 0;
              break;
            }
            if ((var2_int != 0)) {
              this.field_k = 0;
              this.field_j = false;
            }
            decompiledFrameRemainder3 = false;
          }
          else {
            if (this.field_z) {
              var2_intLifetime1 = 1;
              var3Lifetime1 = this.field_r.first(2);
              while (var3Lifetime1 != null) {
                var4Lifetime1 = (int)var3Lifetime1.key;
                if (this.field_d[var4Lifetime1] != 1) {
                  discarded$3 = this.a(2, (byte) 104, var4Lifetime1);
                }
                if (this.field_d[var4Lifetime1] != 1) {
                  var2_intLifetime1 = 0;
                } else {
                  var3Lifetime1.unlink(-76);
                }
                var3Lifetime1 = this.field_r.next(10);
              }
              while (this.field_e.field_l.length > this.field_k) {
                if (this.field_e.field_l[this.field_k] == 0) {
                  this.field_k = this.field_k + 1;
                  continue;
                }
                if (!this.field_g.c(-28419)) {
                  if (this.field_d[this.field_k] != 1) {
                    discarded$2 = this.a(2, (byte) -120, this.field_k);
                  }
                  if (this.field_d[this.field_k] != 1) {
                    var6 = new IntrusiveNode();
                    var6.key = (long)this.field_k;
                    this.field_r.addLast((byte) -110, var6);
                    var2_intLifetime1 = 0;
                  }
                  this.field_k = this.field_k + 1;
                  continue;
                }
                var2_intLifetime1 = 0;
                break;
              }
              if (var2_intLifetime1 != 0) {
                this.field_k = 0;
                this.field_z = false;
                decompiledFrameRemainder3 = false;
              }
              else {
                if (param0) {
                  this.field_j = false;
                }
                decompiledFrameRemainder1 = (this.field_h);
                if ((decompiledFrameRemainder1) &&
                  (decompiledFrameRemainder0 = !(qg.a(false) < this.field_l))) {
                  var2 = (AsyncRequest) (this.field_v.b(-49));
                  while (var2 != null) {
                    if (!var2.field_w) {
                      if (var2.field_v) {
                        if (!var2.field_q) {
                          throw new RuntimeException();
                        }
                        var2.unlink(-109);
                      } else {
                        var2.field_v = true;
                      }
                    }
                    var2 = (AsyncRequest) (this.field_v.a((byte) 91));
                  }
                  decompiledFrameRemainder2 = false;
                }
              }
            }
            if ((decompiledFrameRemainder3) &&
              (decompiledFrameRemainder2) &&
              (decompiledFrameRemainder1) &&
              (decompiledFrameRemainder0)) {
              this.field_r = null;
            }
          }
        }
        if ((decompiledFrameRemainder2) &&
          (decompiledFrameRemainder1) &&
          (decompiledFrameRemainder0)) {
          if (param0) {
            this.field_j = false;
          }
          decompiledFrameRemainder1 = (this.field_h);
          if ((decompiledFrameRemainder1) &&
            (decompiledFrameRemainder0 = !(qg.a(false) < this.field_l))) {
            var2Lifetime1 = (AsyncRequest) (this.field_v.b(-49));
            while (var2Lifetime1 != null) {
              if (!var2Lifetime1.field_w) {
                if (var2Lifetime1.field_v) {
                  if (!var2Lifetime1.field_q) {
                    throw new RuntimeException();
                  }
                  var2Lifetime1.unlink(-109);
                } else {
                  var2Lifetime1.field_v = true;
                }
              }
              var2Lifetime1 = (AsyncRequest) (this.field_v.a((byte) 91));
            }
          }
        }
        if ((decompiledFrameRemainder1) &&
          (decompiledFrameRemainder0)) {
          this.field_l = qg.a(false) + 1000L;
        }

    }

    gd(int param0, hf param1, hf param2, ae param3, sd param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_v = new NodeHashTable(16);
        this.field_k = 0;
        this.field_s = new IntrusiveDeque();
        this.field_l = 0L;
        try {
          this.field_m = param0;
          this.field_w = param1;
          if (null == this.field_w) {
            this.field_j = false;
          } else {
            this.field_j = true;
            this.field_r = new IntrusiveDeque();
          }
          stackIn_7_1 = (param8);
          this.field_h = stackIn_7_1;
          this.field_o = param5;
          this.field_y = param7;
          this.field_n = param2;
          this.field_u = param6;
          this.field_g = param3;
          this.field_i = param4;
          if (null != this.field_n) {
            this.field_t = (AsyncRequest) ((Object) this.field_i.a((byte) -113, this.field_m, this.field_n));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = var10;
          stackIn_12_1 = new StringBuilder().append("gd.<init>(").append(param0).append(',');
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
          throw LevelGrid.toClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_q = new IntrusiveDeque();
        field_x = false;
        field_f = new oi();
    }
}
