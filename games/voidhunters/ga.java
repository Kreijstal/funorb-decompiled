/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga extends fnb {
    private pfa field_f;
    private int field_n;
    private gnb field_u;
    private qp field_t;
    private fo field_l;
    private int field_p;
    private fo field_j;
    static llb field_s;
    private byte[] field_k;
    private int field_w;
    private ona field_g;
    private byte[] field_d;
    private jtb field_r;
    private boolean field_o;
    private ij field_v;
    private ij field_i;
    private int field_h;
    private boolean field_q;
    private long field_e;
    private boolean field_m;

    final qp a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = VoidHunters.field_G;
        if (this.field_t != null) {
          return this.field_t;
        }
        if (null == this.field_r) {
          if (this.field_g.d(126)) {
            return null;
          }
          this.field_r = (jtb) ((Object) this.field_g.a(true, param0 ^ -30, this.field_p, (byte) 0, 255));
        }
        if (this.field_r.field_n) {
          return null;
        }
        if (param0 != 9) {
          return (qp) null;
        }
        var7 = this.field_r.a(param0 ^ -97);
        var6 = var7;
        var5 = var6;
        var2 = var5;
        if (!(this.field_r instanceof jma)) {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_t = new qp(var7, this.field_n, this.field_k);
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = decompiledCaughtException;
            this.field_g.a((byte) -25);
            this.field_t = null;
            if (this.field_g.d(param0 ^ 89)) {
              this.field_r = null;
            } else {
              this.field_r = (jtb) ((Object) this.field_g.a(true, param0 - 30, this.field_p, (byte) 0, 255));
            }
            return null;
          }
          if (null != this.field_j) {
            this.field_f.a(this.field_j, var7, (byte) 92, this.field_p);
          }
        } else {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_t = new qp(var7, this.field_n, this.field_k);
            if (this.field_t.field_e != this.field_w) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = decompiledCaughtException;
            this.field_t = null;
            if (this.field_g.d(121)) {
              this.field_r = null;
            } else {
              this.field_r = (jtb) ((Object) this.field_g.a(true, -21, this.field_p, (byte) 0, 255));
            }
            return null;
          }
        }
        this.field_r = null;
        if (null != this.field_l) {
          this.field_d = new byte[this.field_t.field_l];
        }
        return this.field_t;
    }

    final int a(int param0, boolean param1) {
        jtb var3 = (jtb) (this.field_u.a((long)param0, 122));
        if (var3 != null) {
          return var3.e((byte) -4);
        }
        if (param1) {
          ga.c((byte) 114);
        }
        return 0;
    }

    final void b(int param0) {
        jtb discarded$3 = null;
        jtb discarded$2 = null;
        jtb discarded$1 = null;
        jtb discarded$0 = null;
        int var2_int;
        jtb var2;
        ksa var3;
        int var4;
        int var5;
        ksa var6;
        ksa var7;
        int var2_intLifetime1;
        int var4Lifetime1;
        jtb var2Lifetime1;
        ksa var3Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        boolean decompiledFrameRemainder1 = true;
        boolean decompiledFrameRemainder2 = true;
        var5 = VoidHunters.field_G;
        if (this.field_i != null) {
          if (this.a((byte) 9) == null) {
            return;
          }
          if (this.field_o) {
            var2_int = 1;
            var3 = this.field_i.d(0);
            while (var3 != null) {
              var4 = (int)var3.field_b;
              if (this.field_d[var4] == 0) {
                discarded$3 = this.a(1, -26489, var4);
              }
              if (this.field_d[var4] != 0) {
                var3.b(-3846);
              } else {
                var2_int = 0;
              }
              var3 = this.field_i.a((byte) 80);
            }
            L15: while (true) {
              if (this.field_t.field_j.length > this.field_h) {
                if (0 != this.field_t.field_j[this.field_h]) {
                  if (this.field_f.field_e >= 250) {
                    var2_int = 0;
                    break L15;
                  }
                  if (this.field_d[this.field_h] == 0) {
                    discarded$2 = this.a(1, -26489, this.field_h);
                  }
                  if (this.field_d[this.field_h] == 0) {
                    var6 = new ksa();
                    var6.field_b = (long)this.field_h;
                    var2_int = 0;
                    this.field_i.b(-10258, var6);
                  }
                }
                this.field_h = this.field_h + 1;
                continue;
              }
              break;
            }
            if ((var2_int != 0)) {
              this.field_o = false;
              this.field_h = 0;
            }
            decompiledFrameRemainder2 = false;
          }
          else {
            if (this.field_q) {
              var2_intLifetime1 = 1;
              var3Lifetime1 = this.field_i.d(0);
              while (var3Lifetime1 != null) {
                var4Lifetime1 = (int)var3Lifetime1.field_b;
                if (this.field_d[var4Lifetime1] != 1) {
                  discarded$1 = this.a(2, -26489, var4Lifetime1);
                }
                if (this.field_d[var4Lifetime1] != 1) {
                  var2_intLifetime1 = 0;
                } else {
                  var3Lifetime1.b(-3846);
                }
                var3Lifetime1 = this.field_i.a((byte) 121);
              }
              L5: while (true) {
                if (this.field_h < this.field_t.field_j.length) {
                  if (this.field_t.field_j[this.field_h] != 0) {
                    if (this.field_g.b((byte) 32)) {
                      var2_intLifetime1 = 0;
                      break L5;
                    }
                    if (this.field_d[this.field_h] != 1) {
                      discarded$0 = this.a(2, -26489, this.field_h);
                    }
                    if (1 != this.field_d[this.field_h]) {
                      var7 = new ksa();
                      var7.field_b = (long)this.field_h;
                      this.field_i.b(-10258, var7);
                      var2_intLifetime1 = 0;
                    }
                  }
                  this.field_h = this.field_h + 1;
                  continue;
                }
                break;
              }
              if (var2_intLifetime1 != 0) {
                this.field_h = 0;
                this.field_q = false;
                decompiledFrameRemainder2 = false;
              }
              else {
                if (param0 > -27) {
                  this.b((byte) -14);
                }
                decompiledFrameRemainder0 = (this.field_m);
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameRemainder0 = !(this.field_e > wt.a(false)))) {
                  var2 = (jtb) (this.field_u.c((byte) 48));
                  while (var2 != null) {
                    if (!var2.field_n) {
                      if (var2.field_k) {
                        if (!var2.field_l) {
                          throw new RuntimeException();
                        }
                        var2.b(-3846);
                      } else {
                        var2.field_k = true;
                      }
                    }
                    var2 = (jtb) (this.field_u.b(-91));
                  }
                  decompiledFrameRemainder1 = false;
                }
              }
            }
            if ((decompiledFrameRemainder2) &&
              (decompiledFrameRemainder1) &&
              (decompiledFrameRemainder0)) {
              this.field_i = null;
            }
          }
        }
        if ((decompiledFrameRemainder1) &&
          (decompiledFrameRemainder0)) {
          if (param0 > -27) {
            this.b((byte) -14);
          }
          decompiledFrameRemainder0 = (this.field_m);
          if ((decompiledFrameRemainder0) &&
            (decompiledFrameRemainder0 = !(this.field_e > wt.a(false)))) {
            var2Lifetime1 = (jtb) (this.field_u.c((byte) 48));
            while (var2Lifetime1 != null) {
              if (!var2Lifetime1.field_n) {
                if (var2Lifetime1.field_k) {
                  if (!var2Lifetime1.field_l) {
                    throw new RuntimeException();
                  }
                  var2Lifetime1.b(-3846);
                } else {
                  var2Lifetime1.field_k = true;
                }
              }
              var2Lifetime1 = (jtb) (this.field_u.b(-91));
            }
          }
        }
        if (decompiledFrameRemainder0) {
          this.field_e = wt.a(false) + 1000L;
        }

    }

    final void b(byte param0) {
        if (param0 > -9) {
          return;
        }
        if (null == this.field_l) {
          return;
        }
        this.field_q = true;
        if (this.field_i == null) {
          this.field_i = new ij();
        }
    }

    final byte[] a(int param0, int param1) {
        jtb var3 = this.a(0, -26489, param1);
        if (var3 == null) {
          return null;
        }
        byte[] var4 = var3.a(-95);
        if (param0 <= 112) {
          return (byte[]) null;
        }
        var3.b(-3846);
        return var4;
    }

    final void c(int param0) {
        jtb discarded$0 = null;
        jtb discarded$1 = null;
        ksa var2;
        int var3;
        int var4;
        var4 = VoidHunters.field_G;
        if (this.field_i == null) {
          return;
        }
        if (this.a((byte) 9) == null) {
          return;
        }
        var2 = this.field_v.d(param0);
        while (var2 != null) {
          var3 = (int)var2.field_b;
          if (0 <= var3 &&
            var3 < this.field_t.field_l &&
            this.field_t.field_j[var3] != 0) {
            if (this.field_d[var3] == 0) {
              discarded$0 = this.a(1, -26489, var3);
            }
            if (this.field_d[var3] == -1) {
              discarded$1 = this.a(2, -26489, var3);
            }
            if (this.field_d[var3] == 1) {
              var2.b(-3846);
            }
          } else {
            var2.b(param0 - 3846);
          }
          var2 = this.field_v.a((byte) 10);
        }
    }

    public static void c(byte param0) {
        int var1 = 110 % ((param0 + 65) / 33);
        field_s = null;
    }

    private final jtb a(int param0, int param1, int param2) {
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
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
        jtb var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        var10 = VoidHunters.field_G;
        if (param1 != -26489) {
          return (jtb) null;
        }
        var12 = (jtb) (this.field_u.a((long)param2, 100));
        var4 = var12;
        if (var12 != null &&
          0 == param0 &&
          !var12.field_l &&
          var12.field_n) {
          var12.b(-3846);
          var4 = null;
        }
        if (var4 == null) {
          if (param0 != 0) {
            if (param0 != 1) {
              if (param0 != 2) {
                throw new RuntimeException();
              }
              if (this.field_l == null) {
                throw new RuntimeException();
              }
              if (this.field_d[param2] != -1) {
                throw new RuntimeException();
              }
              if (this.field_g.b((byte) 32)) {
                return null;
              }
              var4 = this.field_g.a(false, -21, param2, (byte) 2, this.field_p);
            } else {
              if (this.field_l == null) {
                throw new RuntimeException();
              }
              var4 = this.field_f.a((byte) 121, this.field_l, param2);
            }
          } else {
            if (null != this.field_l &&
              this.field_d[param2] != -1) {
              var4 = this.field_f.a(param2, this.field_l, (byte) 104);
            } else {
              if (this.field_g.d(104)) {
                return null;
              }
              var4 = this.field_g.a(true, -21, param2, (byte) 2, this.field_p);
            }
          }
          this.field_u.a((long)param2, (ksa) (var4), (byte) -119);
        }
        if (((jtb) (var4)).field_n) {
          return null;
        }
        var18 = ((jtb) (var4)).a(77);
        var13 = var18;
        var5 = var13;
        if (var4 instanceof jma) {
          try {
            if (var5 != null &&
              var18.length > 2) {
              gkb.field_p.reset();
              gkb.field_p.update(var5, 0, var18.length - 2);
              var6_int = (int)gkb.field_p.getValue();
              if (this.field_t.field_d[param2] != var6_int) {
                throw new RuntimeException();
              }
              if (this.field_t.field_c != null &&
                this.field_t.field_c[param2] != null) {
                var29 = this.field_t.field_c[param2];
                var30 = fqb.a((byte) 25, -2 + var18.length, var18, 0);
                var11 = 0;
                var9 = var11;
                while (64 > var11) {
                  if (var29[var11] != var30[var11]) {
                    throw new RuntimeException();
                  }
                  var11++;
                }
              }
              var7 = ((255 & var5[-2 + var18.length]) << 8) + (255 & var5[-1 + var18.length]);
              if (var7 != (65535 & this.field_t.field_h[param2])) {
                throw new RuntimeException();
              }
              if (this.field_d[param2] != 1) {
                if (this.field_d[param2] != 0) {
                }
                this.field_d[param2] = (byte) 1;
              }
              if (!((jtb) (var4)).field_l) {
                ((jtb) (var4)).b(-3846);
              }
              stackIn_92_0 = var4;
              return (jtb) (stackIn_92_0);
            }
            throw new RuntimeException();
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            this.field_d[param2] = (byte)-1;
            ((jtb) (var4)).b(-3846);
            if (!((jtb) (var4)).field_l) {
              return null;
            }
            if (this.field_g.d(92)) {
              return null;
            }
            var4 = this.field_g.a(true, -21, param2, (byte) 2, this.field_p);
            this.field_u.a((long)param2, (ksa) (var4), (byte) -127);
            return null;
          }
        }
        try {
          if (var5 != null &&
            2 < var18.length) {
            gkb.field_p.reset();
            gkb.field_p.update(var5, 0, var18.length - 2);
            var6_int = (int)gkb.field_p.getValue();
            if (this.field_t.field_d[param2] != var6_int) {
              throw new RuntimeException();
            }
            if (this.field_t.field_c != null &&
              this.field_t.field_c[param2] != null) {
              var28 = this.field_t.field_c[param2];
              var27 = fqb.a((byte) 25, -2 + var18.length, var18, 0);
              for (var9 = 0; var9 < 64; var9++) {
                if (var27[var9] != var28[var9]) {
                  throw new RuntimeException();
                }
              }
            }
            this.field_g.field_g = 0;
            this.field_g.field_k = 0;
          } else {
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref = (RuntimeException) (Object) decompiledCaughtException;
          this.field_g.a((byte) -25);
          ((jtb) (var4)).b(-3846);
          if (((jtb) (var4)).field_l) {
            if (this.field_g.d(54)) {
              return null;
            }
            var4 = this.field_g.a(true, -21, param2, (byte) 2, this.field_p);
            this.field_u.a((long)param2, (ksa) (var4), (byte) -118);
          }
          return null;
        }
        var5[var18.length - 2] = (byte)(this.field_t.field_h[param2] >>> 8);
        var5[-1 + var18.length] = (byte)this.field_t.field_h[param2];
        if (null != this.field_l) {
          this.field_f.a(this.field_l, var18, (byte) 111, param2);
          stackIn_61_0 = -2;
          stackIn_61_1 = ~this.field_d[param2];
          if (stackIn_61_0 != stackIn_61_1) {
            this.field_d[param2] = (byte) 1;
          }
        }
        if (!((jtb) (var4)).field_l) {
          ((jtb) (var4)).b(-3846);
        }
        return (jtb) (var4);
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        if (!li.field_i) {
          dma.e(param2, param3, param5, param4, param6, param0);
        } else {
          if (ne.field_v) {
            og.field_r.a(param5, (byte) 120, param6 | param0 << 24, param4, param3, param2);
          }
        }
        if (param1) {
          field_s = (llb) null;
        }
    }

    ga(int param0, fo param1, fo param2, ona param3, pfa param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_u = new gnb(16);
        this.field_h = 0;
        this.field_v = new ij();
        this.field_e = 0L;
        try {
          this.field_p = param0;
          this.field_l = param1;
          if (null == this.field_l) {
            this.field_o = false;
          } else {
            this.field_o = true;
            this.field_i = new ij();
          }
          this.field_j = param2;
          stackIn_7_1 = (param8);
          this.field_m = stackIn_7_1;
          this.field_f = param4;
          this.field_g = param3;
          this.field_k = param6;
          this.field_w = param7;
          this.field_n = param5;
          if (this.field_j != null) {
            this.field_r = (jtb) ((Object) this.field_f.a(this.field_p, this.field_j, (byte) -65));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = var10;
          stackIn_12_1 = new StringBuilder().append("ga.<init>(").append(param0).append(',');
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
          throw rta.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
    }
}
