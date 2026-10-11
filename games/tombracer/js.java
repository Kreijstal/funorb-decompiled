/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class js extends dr {
    private ppa field_h;
    private int field_e;
    private hha field_q;
    private qda field_u;
    private ji field_p;
    private byte[] field_n;
    private int field_t;
    private int field_j;
    private byte[] field_o;
    static int field_l;
    static ft field_g;
    private ss field_i;
    static jea field_d;
    private ppa field_s;
    private dla field_k;
    private int field_m;
    private boolean field_r;
    private vna field_f;
    private vna field_b;
    private boolean field_w;
    private boolean field_v;
    private long field_c;

    final byte[] a(int param0, byte param1) {
        hha var3 = this.a(0, -116, param0);
        if (var3 == null) {
          return null;
        }
        byte[] var4 = var3.b((byte) -126);
        if (param1 != -39) {
          return (byte[]) null;
        }
        var3.p(param1 + 124);
        return var4;
    }

    final void b(int param0) {
        hha discarded$1 = null;
        hha discarded$0 = null;
        hha discarded$3 = null;
        hha discarded$2 = null;
        int var2_int;
        hha var2;
        vg var3;
        int var4;
        int var5;
        vg var6;
        vg var7;
        int var2_intLifetime1;
        int var4Lifetime1;
        vg var3Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        var5 = TombRacer.field_G ? 1 : 0;
        if (null != this.field_f) {
          if (this.a(true) == null) {
            return;
          }
          if (this.field_w) {
            var2_int = 1;
            var3 = this.field_f.f(-80);
            while (var3 != null) {
              var4 = (int)var3.field_d;
              if (this.field_n[var4] == 0) {
                discarded$1 = this.a(1, param0 ^ -991, var4);
              }
              if (this.field_n[var4] == 0) {
                var2_int = 0;
              } else {
                var3.p(116);
              }
              var3 = this.field_f.e(124);
            }
            L3: while (true) {
              if (this.field_m < this.field_k.field_c.length) {
                if (this.field_k.field_c[this.field_m] != 0) {
                  if (this.field_i.field_b >= 250) {
                    var2_int = 0;
                    break L3;
                  }
                  if (0 == this.field_n[this.field_m]) {
                    discarded$0 = this.a(1, param0 ^ -988, this.field_m);
                  }
                  if (0 == this.field_n[this.field_m]) {
                    var7 = new vg();
                    var7.field_d = (long)this.field_m;
                    var2_int = 0;
                    this.field_f.b((byte) -91, var7);
                  }
                }
                this.field_m = this.field_m + 1;
                continue;
              }
              break;
            }
            if ((var2_int != 0)) {
              this.field_m = 0;
              this.field_w = false;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_r) {
              var2_intLifetime1 = 1;
              var3Lifetime1 = this.field_f.f(param0 ^ -936);
              while (var3Lifetime1 != null) {
                var4Lifetime1 = (int)var3Lifetime1.field_d;
                if (this.field_n[var4Lifetime1] != 1) {
                  discarded$3 = this.a(2, -52, var4Lifetime1);
                }
                if (this.field_n[var4Lifetime1] != 1) {
                  var2_intLifetime1 = 0;
                } else {
                  var3Lifetime1.p(41);
                }
                var3Lifetime1 = this.field_f.e(116);
              }
              while (this.field_k.field_c.length > this.field_m) {
                if (this.field_k.field_c[this.field_m] == 0) {
                  this.field_m = this.field_m + 1;
                  continue;
                }
                if (!this.field_u.b(-21)) {
                  if (this.field_n[this.field_m] != 1) {
                    discarded$2 = this.a(2, 126, this.field_m);
                  }
                  if (this.field_n[this.field_m] != 1) {
                    var6 = new vg();
                    var6.field_d = (long)this.field_m;
                    this.field_f.b((byte) -96, var6);
                    var2_intLifetime1 = 0;
                  }
                  this.field_m = this.field_m + 1;
                  continue;
                }
                var2_intLifetime1 = 0;
                break;
              }
              if ((var2_intLifetime1 != 0)) {
                this.field_m = 0;
                this.field_r = false;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_f = null;
            }
          }
        }
        if (this.field_v &&
          this.field_c <= bva.b((byte) -107)) {
          var2 = (hha) (this.field_p.d(param0 - 1000));
          while (var2 != null) {
            if (!var2.field_m) {
              if (!var2.field_k) {
                var2.field_k = true;
              } else {
                if (!var2.field_l) {
                  throw new RuntimeException();
                }
                var2.p(46);
              }
            }
            var2 = (hha) (this.field_p.c(20806));
          }
          this.field_c = 1000L + bva.b((byte) -107);
        }
        if (param0 != 1000) {
          this.field_c = -79L;
        }
    }

    final static void a(double param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 != -256) {
            js.a(0.721841364009857, 28);
          }
          if (param0 != ed.field_a) {
            for (var3_int = 0; var3_int < 256; var3_int++) {
              var4 = (int)(Math.pow((double)var3_int / 255.0, param0) * 255.0);
              sk.field_c[var3_int] = var4 <= 255 ? var4 : 255;
            }
            ed.field_a = param0;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "js.G(" + param0 + ',' + param1 + ')');
        }
    }

    final int b(int param0, int param1) {
        if (param0 != 27079) {
          this.a(115, (byte) -96);
        }
        hha var3 = (hha) (this.field_p.a((byte) -104, (long)param1));
        if (var3 == null) {
          return 0;
        }
        return var3.a((byte) -115);
    }

    final void c(int param0) {
        int var3 = 0;
        hha discarded$0 = null;
        hha discarded$1 = null;
        int var4 = TombRacer.field_G ? 1 : 0;
        if (this.field_f == null) {
          return;
        }
        if (null == this.a(true)) {
          return;
        }
        vg var2 = this.field_b.f(-80);
        while (var2 != null) {
          var3 = (int)var2.field_d;
          if (0 > var3) {
            var2.p(91);
          } else {
            if (this.field_k.field_l <= var3) {
              var2.p(91);
            } else {
              if (this.field_k.field_c[var3] == 0) {
                var2.p(91);
              } else {
                if (this.field_n[var3] == 0) {
                  discarded$0 = this.a(1, 124, var3);
                }
                if (this.field_n[var3] == -1) {
                  discarded$1 = this.a(2, param0 + 28590, var3);
                }
                if (1 == this.field_n[var3]) {
                  var2.p(71);
                }
              }
            }
          }
          var2 = this.field_b.e(param0 ^ -28599);
        }
        if (param0 != -28613) {
          this.field_s = (ppa) null;
        }
    }

    public static void b(byte param0) {
        field_g = null;
        field_d = null;
        if (param0 != -50) {
          field_g = (ft) null;
        }
    }

    final void a(byte param0) {
        if (null == this.field_h) {
          return;
        }
        this.field_r = true;
        if (null == this.field_f) {
          this.field_f = new vna();
        }
        if (param0 != 115) {
          js.b((byte) 13);
        }
    }

    final dla a(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        if (this.field_k != null) {
          return this.field_k;
        }
        if (this.field_q == null) {
          if (this.field_u.d(-21)) {
            return null;
          }
          this.field_q = (hha) ((Object) this.field_u.a(this.field_j, true, 255, -21, (byte) 0));
        }
        if (!param0) {
          this.a((byte) -56);
        }
        if (this.field_q.field_m) {
          return null;
        }
        var7 = this.field_q.b((byte) -126);
        var6 = var7;
        var5 = var6;
        var2 = var5;
        if (!(this.field_q instanceof sga)) {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_k = new dla(var7, this.field_t, this.field_o);
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = decompiledCaughtException;
            this.field_u.e(-1);
            this.field_k = null;
            if (!this.field_u.d(-21)) {
              this.field_q = (hha) ((Object) this.field_u.a(this.field_j, true, 255, -21, (byte) 0));
            } else {
              this.field_q = null;
            }
            return null;
          }
          if (this.field_s != null) {
            this.field_i.a(false, this.field_j, this.field_s, var7);
          }
        } else {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_k = new dla(var7, this.field_t, this.field_o);
            if (this.field_k.field_a != this.field_e) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = decompiledCaughtException;
            this.field_k = null;
            if (!this.field_u.d(-21)) {
              this.field_q = (hha) ((Object) this.field_u.a(this.field_j, true, 255, -21, (byte) 0));
            } else {
              this.field_q = null;
            }
            return null;
          }
        }
        if (this.field_h != null) {
          this.field_n = new byte[this.field_k.field_l];
        }
        this.field_q = null;
        return this.field_k;
    }

    private final hha a(int param0, int param1, int param2) {
        Object stackIn_58_0 = null;
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
        hha var13 = null;
        byte[] var14 = null;
        byte[] var19 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        byte[] var31 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        var13 = (hha) (this.field_p.a((byte) -124, (long)param2));
        var4 = var13;
        if (var13 != null &&
          param0 == 0 &&
          !var13.field_l &&
          var13.field_m) {
          var13.p(12);
          var4 = null;
        }
        if (var4 == null) {
          if (param0 != 0) {
            if (param0 == 1) {
              if (this.field_h == null) {
                throw new RuntimeException();
              }
              var4 = this.field_i.a((byte) -50, param2, this.field_h);
            } else {
              if (param0 != 2) {
                throw new RuntimeException();
              }
              if (this.field_h == null) {
                throw new RuntimeException();
              }
              if (this.field_n[param2] != -1) {
                throw new RuntimeException();
              }
              if (this.field_u.b(-21)) {
                return null;
              }
              var4 = this.field_u.a(param2, false, this.field_j, -21, (byte) 2);
            }
          } else {
            if (null != this.field_h &&
              this.field_n[param2] != -1) {
              var4 = this.field_i.a(15871, this.field_h, param2);
            } else {
              if (this.field_u.d(-21)) {
                return null;
              }
              var4 = this.field_u.a(param2, true, this.field_j, -21, (byte) 2);
            }
          }
          this.field_p.a((long)param2, 118, (vg) (var4));
        }
        if (((hha) (var4)).field_m) {
          return null;
        }
        var19 = ((hha) (var4)).b((byte) -126);
        var14 = var19;
        var5 = var14;
        var6 = 8 / ((57 - param1) / 63);
        if (var4 instanceof sga) {
          try {
            if (var5 != null &&
              2 < var19.length) {
              vf.field_g.reset();
              vf.field_g.update(var5, 0, var19.length - 2);
              var7_int = (int)vf.field_g.getValue();
              if (var7_int != this.field_k.field_j[param2]) {
                throw new RuntimeException();
              }
              if (null != this.field_k.field_h &&
                this.field_k.field_h[param2] != null) {
                var28 = this.field_k.field_h[param2];
                var29 = fja.a(-2 + var19.length, var19, 0, 8);
                for (var10 = 0; 64 > var10; var10++) {
                  if (var28[var10] != var29[var10]) {
                    throw new RuntimeException();
                  }
                }
              }
              var8 = (255 & var5[var19.length - 1]) + (65280 & var5[var19.length - 2] << 8);
              if ((65535 & this.field_k.field_f[param2]) != var8) {
                throw new RuntimeException();
              }
              if (1 != this.field_n[param2]) {
                if (this.field_n[param2] != 0) {
                }
                this.field_n[param2] = (byte) 1;
              }
              if (!((hha) (var4)).field_l) {
                ((hha) (var4)).p(70);
              }
              stackIn_58_0 = var4;
              return (hha) (stackIn_58_0);
            }
            throw new RuntimeException();
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var7_ref = (Exception) (Object) decompiledCaughtException;
            this.field_n[param2] = (byte)-1;
            ((hha) (var4)).p(53);
            if (!((hha) (var4)).field_l) {
              return null;
            }
            if (this.field_u.d(-21)) {
              return null;
            }
            var4 = this.field_u.a(param2, true, this.field_j, -21, (byte) 2);
            this.field_p.a((long)param2, 117, (vg) (var4));
            return null;
          }
        }
        try {
          if (var5 != null &&
            var19.length > 2) {
            vf.field_g.reset();
            vf.field_g.update(var5, 0, var19.length - 2);
            var7_int = (int)vf.field_g.getValue();
            if (var7_int != this.field_k.field_j[param2]) {
              throw new RuntimeException();
            }
            if (this.field_k.field_h != null &&
              this.field_k.field_h[param2] != null) {
              var31 = this.field_k.field_h[param2];
              var30 = fja.a(var19.length - 2, var19, 0, 8);
              var12 = 0;
              var10 = var12;
              while (var12 < 64) {
                if (~var30[var12] != ~var31[var12]) {
                  throw new RuntimeException();
                }
                var12++;
              }
            }
            this.field_u.field_a = 0;
            this.field_u.field_n = 0;
          } else {
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = (RuntimeException) (Object) decompiledCaughtException;
          this.field_u.e(-1);
          ((hha) (var4)).p(82);
          if (!((hha) (var4)).field_l) {
            return null;
          }
          if (!this.field_u.d(-21)) {
            var4 = this.field_u.a(param2, true, this.field_j, -21, (byte) 2);
            this.field_p.a((long)param2, 125, (vg) (var4));
          }
          return null;
        }
        var5[-2 + var19.length] = (byte)(this.field_k.field_f[param2] >>> 8);
        var5[-1 + var19.length] = (byte)this.field_k.field_f[param2];
        if (null != this.field_h) {
          this.field_i.a(false, param2, this.field_h, var19);
          if (this.field_n[param2] != 1) {
            this.field_n[param2] = (byte) 1;
          }
        }
        if (!((hha) (var4)).field_l) {
          ((hha) (var4)).p(125);
        }
        return (hha) (var4);
    }

    js(int param0, ppa param1, ppa param2, qda param3, ss param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_p = new ji(16);
        this.field_m = 0;
        this.field_b = new vna();
        this.field_c = 0L;
        try {
          this.field_h = param1;
          this.field_j = param0;
          if (this.field_h != null) {
            this.field_w = true;
            this.field_f = new vna();
          } else {
            this.field_w = false;
          }
          stackIn_7_1 = (param8);
          this.field_v = stackIn_7_1;
          this.field_e = param7;
          this.field_i = param4;
          this.field_s = param2;
          this.field_t = param5;
          this.field_u = param3;
          this.field_o = param6;
          if (this.field_s != null) {
            this.field_q = (hha) ((Object) this.field_i.a(15871, this.field_s, this.field_j));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = var10;
          stackIn_12_1 = new StringBuilder().append("js.<init>(").append(param0).append(',');
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
          throw tba.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_g = new ft(1);
    }
}
