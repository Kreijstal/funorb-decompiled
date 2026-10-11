/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh extends hl {
    private cd field_q;
    private int field_l;
    private int field_d;
    private pc field_s;
    private sg field_g;
    private ab field_n;
    private ml field_v;
    private byte[] field_w;
    private sg field_m;
    private na field_i;
    private int field_k;
    private byte[] field_x;
    static oi field_t;
    private oi field_p;
    private int field_o;
    static int field_f;
    private oi field_u;
    private boolean field_j;
    private boolean field_r;
    private boolean field_e;
    private long field_h;

    final void a(int param0) {
        int var3 = 0;
        ml discarded$0 = null;
        ml discarded$1 = null;
        int var4 = wizardrun.field_H;
        if (null == this.field_p) {
          return;
        }
        if (this.b(false) == null) {
          return;
        }
        if (param0 != -3) {
          fh.c(16, 122);
        }
        wl var2 = this.field_u.b((byte) 72);
        while (var2 != null) {
          var3 = (int)var2.field_e;
          if (var3 < 0) {
            var2.a(false);
          } else {
            if (var3 >= this.field_s.field_s) {
              var2.a(false);
            } else {
              if (0 == this.field_s.field_p[var3]) {
                var2.a(false);
              } else {
                if (this.field_w[var3] == 0) {
                  discarded$0 = this.a(-23529, 1, var3);
                }
                if (-1 == this.field_w[var3]) {
                  discarded$1 = this.a(-23529, 2, var3);
                }
                if (this.field_w[var3] == 1) {
                  var2.a(false);
                }
              }
            }
          }
          var2 = this.field_u.d(param0 ^ -8195);
        }
    }

    final void c(byte param0) {
        ml discarded$3 = null;
        ml discarded$2 = null;
        ml discarded$1 = null;
        ml discarded$0 = null;
        int var2_int;
        ml var2;
        wl var3;
        int var4;
        int var5;
        wl var6;
        wl var7;
        int var2_intLifetime1;
        int var4Lifetime1;
        wl var3Lifetime1;
        var5 = wizardrun.field_H;
        if (param0 != 25) {
          this.field_o = -118;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_p != null) {
          if (null == this.b(false)) {
            return;
          }
          if (this.field_r) {
            var2_int = 1;
            var3 = this.field_p.b((byte) 83);
            while (var3 != null) {
              var4 = (int)var3.field_e;
              if (0 == this.field_w[var4]) {
                discarded$3 = this.a(-23529, 1, var4);
              }
              if (this.field_w[var4] != 0) {
                var3.a(false);
              } else {
                var2_int = 0;
              }
              var3 = this.field_p.d(8192);
            }
            L11: while (true) {
              if (this.field_s.field_p.length > this.field_o) {
                if (this.field_s.field_p[this.field_o] != 0) {
                  if (this.field_q.field_b >= 250) {
                    var2_int = 0;
                    break L11;
                  }
                  if (0 == this.field_w[this.field_o]) {
                    discarded$2 = this.a(-23529, 1, this.field_o);
                  }
                  if (0 == this.field_w[this.field_o]) {
                    var6 = new wl();
                    var6.field_e = (long)this.field_o;
                    var2_int = 0;
                    this.field_p.a(var6, false);
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
              var3Lifetime1 = this.field_p.b((byte) 73);
              while (var3Lifetime1 != null) {
                var4Lifetime1 = (int)var3Lifetime1.field_e;
                if (this.field_w[var4Lifetime1] != 1) {
                  discarded$1 = this.a(-23529, 2, var4Lifetime1);
                }
                if (this.field_w[var4Lifetime1] != 1) {
                  var2_intLifetime1 = 0;
                } else {
                  var3Lifetime1.a(false);
                }
                var3Lifetime1 = this.field_p.d(8192);
              }
              while (this.field_o < this.field_s.field_p.length) {
                if (this.field_s.field_p[this.field_o] == 0) {
                  this.field_o = this.field_o + 1;
                  continue;
                }
                if (!this.field_i.c(-21)) {
                  if (1 != this.field_w[this.field_o]) {
                    discarded$0 = this.a(-23529, 2, this.field_o);
                  }
                  if (this.field_w[this.field_o] != 1) {
                    var7 = new wl();
                    var7.field_e = (long)this.field_o;
                    this.field_p.a(var7, false);
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
        if (d.a((byte) 100) < this.field_h) {
          return;
        }
        var2 = (ml) (this.field_n.b((byte) -114));
        while (var2 != null) {
          if (!var2.field_s) {
            if (!var2.field_q) {
              var2.field_q = true;
            } else {
              if (!var2.field_r) {
                throw new RuntimeException();
              }
              var2.a(false);
            }
          }
          var2 = (ml) (this.field_n.b(param0 ^ 24));
        }
        this.field_h = 1000L + d.a((byte) 67);
        return;
    }

    private final ml a(int param0, int param1, int param2) {
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
        ml var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        var10 = wizardrun.field_H;
        if (param0 != -23529) {
          return (ml) null;
        }
        var12 = (ml) (this.field_n.a(1, (long)param2));
        var4 = var12;
        if (var12 != null &&
          param1 == 0 &&
          !var12.field_r &&
          var12.field_s) {
          var12.a(false);
          var4 = null;
        }
        if (var4 == null) {
          if (param1 == 0) {
            if (this.field_g != null &&
              this.field_w[param2] != -1) {
              var4 = this.field_q.a(param2, 1, this.field_g);
            } else {
              if (this.field_i.a(3473)) {
                return null;
              }
              var4 = this.field_i.a(this.field_d, param2, (byte) -85, (byte) 2, true);
            }
          } else {
            if (param1 != 1) {
              if (param1 != 2) {
                throw new RuntimeException();
              }
              if (null == this.field_g) {
                throw new RuntimeException();
              }
              if (this.field_w[param2] != -1) {
                throw new RuntimeException();
              }
              if (this.field_i.c(-21)) {
                return null;
              }
              var4 = this.field_i.a(this.field_d, param2, (byte) -73, (byte) 2, false);
            } else {
              if (null == this.field_g) {
                throw new RuntimeException();
              }
              var4 = this.field_q.a((byte) -46, param2, this.field_g);
            }
          }
          this.field_n.a((wl) (var4), param0 + 23462, (long)param2);
        }
        if (((ml) (var4)).field_s) {
          return null;
        }
        var18 = ((ml) (var4)).d(95);
        var13 = var18;
        var5 = var13;
        if (!(var4 instanceof sk)) {
          try {
            if (var5 != null &&
              var18.length > 2) {
              rk.field_j.reset();
              rk.field_j.update(var5, 0, -2 + var18.length);
              var6_int = (int)rk.field_j.getValue();
              if (this.field_s.field_q[param2] != var6_int) {
                throw new RuntimeException();
              }
              if (null != this.field_s.field_j &&
                null != this.field_s.field_j[param2]) {
                var28 = this.field_s.field_j[param2];
                var27 = id.a(var5, 0, var18.length - 2, 0);
                for (var9 = 0; 64 > var9; var9++) {
                  if (~var27[var9] != ~var28[var9]) {
                    throw new RuntimeException();
                  }
                }
              }
              this.field_i.field_k = 0;
              this.field_i.field_n = 0;
            } else {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            this.field_i.a(true);
            ((ml) (var4)).a(false);
            if (((ml) (var4)).field_r &&
              !this.field_i.a(3473)) {
              var4 = this.field_i.a(this.field_d, param2, (byte) -125, (byte) 2, true);
              this.field_n.a((wl) (var4), -115, (long)param2);
            }
            return null;
          }
          var5[-2 + var18.length] = (byte)(this.field_s.field_n[param2] >>> 8);
          var5[var18.length - 1] = (byte)this.field_s.field_n[param2];
          if (null != this.field_g) {
            this.field_q.a((byte) -124, this.field_g, var18, param2);
            if (this.field_w[param2] != 1) {
              this.field_w[param2] = (byte) 1;
            }
          }
          if (!((ml) (var4)).field_r) {
            ((ml) (var4)).a(false);
          }
          return (ml) (var4);
        }
        try {
          if (var5 != null &&
            var18.length > 2) {
            rk.field_j.reset();
            rk.field_j.update(var5, 0, -2 + var18.length);
            var6_int = (int)rk.field_j.getValue();
            if (this.field_s.field_q[param2] != var6_int) {
              throw new RuntimeException();
            }
            if (null != this.field_s.field_j &&
              null != this.field_s.field_j[param2]) {
              var30 = this.field_s.field_j[param2];
              var29 = id.a(var5, 0, -2 + var18.length, 0);
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
            if (var7 != (65535 & this.field_s.field_n[param2])) {
              throw new RuntimeException();
            }
            if (this.field_w[param2] != 1) {
              if (this.field_w[param2] != 0) {
              }
              this.field_w[param2] = (byte) 1;
            }
            if (!((ml) (var4)).field_r) {
              ((ml) (var4)).a(false);
            }
            stackIn_91_0 = var4;
            return (ml) (stackIn_91_0);
          }
          throw new RuntimeException();
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (Exception) (Object) decompiledCaughtException;
          this.field_w[param2] = (byte)-1;
          ((ml) (var4)).a(false);
          if (!((ml) (var4)).field_r) {
            return null;
          }
          if (this.field_i.a(3473)) {
            return null;
          }
          var4 = this.field_i.a(this.field_d, param2, (byte) -123, (byte) 2, true);
          this.field_n.a((wl) (var4), -103, (long)param2);
          return null;
        }
    }

    public static void b(byte param0) {
        field_t = null;
        if (param0 != -8) {
          field_t = (oi) null;
        }
    }

    final static void b(int param0, int param1) {
        int var3 = 0;
        nj var4 = null;
        ai var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = wizardrun.field_H;
        try {
          var5 = (ai) (field_t.b((byte) 100));
          if (param0 != -28323) {
            fh.b((byte) 68);
          }
          while (var5 != null) {
            og.a(var5, param1, 123);
            var5 = (ai) (field_t.d(8192));
          }
          var4 = (nj) (pc.field_l.b((byte) 91));
          while (var4 != null) {
            ri.a(var4, param1, (byte) 121);
            var4 = (nj) (pc.field_l.d(8192));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var2), "fh.G(" + param0 + ',' + param1 + ')');
        }
    }

    final byte[] a(byte param0, int param1) {
        byte[] var4 = null;
        ml var3 = this.a(-23529, 0, param1);
        if (var3 != null) {
          var4 = var3.d(95);
          if (param0 >= -21) {
            fh.c(-33, -78);
          }
          var3.a(false);
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
          var4 = (of) (bh.field_b.b((byte) 96));
          if (param1 != 0) {
            field_f = 48;
          }
          while (var4 != null) {
            di.a(var4, param0, (byte) -81);
            var4 = (of) (bh.field_b.d(param1 ^ 8192));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var2), "fh.B(" + param0 + ',' + param1 + ')');
        }
    }

    final static int a(int param0, int param1) {
        if (param0 != 11682) {
          fh.b(-2, 121);
        }
        param1 = (param1 & 1431655765) + ((param1 & -1431655765) >>> 1);
        param1 = ((param1 & -858993460) >>> 2) + (858993459 & param1);
        param1 = param1 + (param1 >>> 4) & 252645135;
        param1 = param1 + (param1 >>> 8);
        param1 = param1 + (param1 >>> 16);
        return 255 & param1;
    }

    final void a(byte param0) {
        if (this.field_g != null) {
          int var2 = -38 / ((-32 - param0) / 59);
          this.field_j = true;
          if (null == this.field_p) {
            this.field_p = new oi();
          }
          return;
        }
    }

    final pc b(boolean param0) {
        na stackIn_28_0 = null;
        boolean stackIn_29_1 = false;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = wizardrun.field_H;
        if (this.field_s != null) {
          return this.field_s;
        }
        if (null == this.field_v) {
          if (this.field_i.a(3473)) {
            return null;
          }
          this.field_v = (ml) ((Object) this.field_i.a(255, this.field_d, (byte) -119, (byte) 0, true));
        }
        if (this.field_v.field_s) {
          return null;
        }
        if (param0) {
          this.c((byte) -59);
        }
        var7 = this.field_v.d(95);
        var6 = var7;
        var5 = var6;
        var2 = var5;
        if (!(this.field_v instanceof sk)) {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_s = new pc(var7, this.field_l, this.field_x);
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = decompiledCaughtException;
            stackIn_28_0 = this.field_i;
            stackIn_29_1 = !(param0);
            ((na) (Object) stackIn_28_0).a(stackIn_29_1);
            this.field_s = null;
            if (this.field_i.a(3473)) {
              this.field_v = null;
            } else {
              this.field_v = (ml) ((Object) this.field_i.a(255, this.field_d, (byte) -88, (byte) 0, true));
            }
            return null;
          }
          if (null != this.field_m) {
            this.field_q.a((byte) 0, this.field_m, var7, this.field_d);
          }
        } else {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_s = new pc(var7, this.field_l, this.field_x);
            if (this.field_k != this.field_s.field_f) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = decompiledCaughtException;
            this.field_s = null;
            if (this.field_i.a(3473)) {
              this.field_v = null;
            } else {
              this.field_v = (ml) ((Object) this.field_i.a(255, this.field_d, (byte) -100, (byte) 0, true));
            }
            return null;
          }
        }
        this.field_v = null;
        if (null != this.field_g) {
          this.field_w = new byte[this.field_s.field_s];
        }
        return this.field_s;
    }

    final int a(boolean param0, int param1) {
        ml var3 = (ml) (this.field_n.a(1, (long)param1));
        if (var3 != null) {
          return var3.c(false);
        }
        if (!param0) {
          return 0;
        }
        this.field_d = -2;
        return 0;
    }

    fh(int param0, sg param1, sg param2, na param3, cd param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_n = new ab(16);
        this.field_o = 0;
        this.field_u = new oi();
        this.field_h = 0L;
        try {
          this.field_d = param0;
          this.field_g = param1;
          if (null != this.field_g) {
            this.field_r = true;
            this.field_p = new oi();
          } else {
            this.field_r = false;
          }
          stackIn_7_1 = (param8);
          this.field_e = stackIn_7_1;
          this.field_x = param6;
          this.field_k = param7;
          this.field_m = param2;
          this.field_q = param4;
          this.field_i = param3;
          this.field_l = param5;
          if (null != this.field_m) {
            this.field_v = (ml) ((Object) this.field_q.a(this.field_d, 1, this.field_m));
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
          throw bd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_t = new oi();
    }
}
