/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg extends wd {
    private sk field_x;
    private int field_n;
    private va field_h;
    private bi field_v;
    private byte[] field_u;
    private int field_o;
    private byte[] field_t;
    private ha field_j;
    private qd field_w;
    private int field_k;
    private bi field_f;
    private ae field_p;
    static dl field_l;
    private boolean field_s;
    static String field_r;
    private nc field_e;
    private boolean field_y;
    private nc field_m;
    private int field_q;
    private long field_g;
    private boolean field_i;

    private final sk a(int param0, byte param1, int param2) {
        Object stackIn_60_0 = null;
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
        sk var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        var10 = SolKnight.field_L ? 1 : 0;
        var12 = (sk) (this.field_w.a(true, (long)param0));
        var4 = var12;
        if (var12 != null &&
          param2 == 0 &&
          !var12.field_r &&
          var12.field_m) {
          var12.c(param1 ^ 10);
          var4 = null;
        }
        if (var4 == null) {
          if (0 != param2) {
            if (param2 == 1) {
              if (this.field_v == null) {
                throw new RuntimeException();
              }
              var4 = this.field_p.a(-72, this.field_v, param0);
            } else {
              if (param2 != 2) {
                throw new RuntimeException();
              }
              if (this.field_v == null) {
                throw new RuntimeException();
              }
              if (this.field_u[param0] != -1) {
                throw new RuntimeException();
              }
              if (this.field_h.a(param1 ^ -5868)) {
                return null;
              }
              var4 = this.field_h.a(this.field_o, false, param0, param1 ^ 437409504, (byte) 2);
            }
          } else {
            if (this.field_v != null &&
              this.field_u[param0] != -1) {
              var4 = this.field_p.a(this.field_v, param0, -112);
            } else {
              if (this.field_h.b(-21)) {
                return null;
              }
              var4 = this.field_h.a(this.field_o, true, param0, 437409504, (byte) 2);
            }
          }
          this.field_w.a((byte) 126, (gg) (var4), (long)param0);
        }
        if (param1 != 0) {
          this.c(-104);
        }
        if (((sk) (var4)).field_m) {
          return null;
        }
        var18 = ((sk) (var4)).f(0);
        var13 = var18;
        var5 = var13;
        if (var4 instanceof md) {
          try {
            if (var5 != null &&
              var18.length > 2) {
              gl.field_g.reset();
              gl.field_g.update(var5, 0, -2 + var18.length);
              var6_int = (int)gl.field_g.getValue();
              if (var6_int != this.field_j.field_b[param0]) {
                throw new RuntimeException();
              }
              if (this.field_j.field_q != null &&
                this.field_j.field_q[param0] != null) {
                var27 = this.field_j.field_q[param0];
                var28 = q.a(var18.length - 2, 0, -110, var18);
                for (var9 = 0; var9 < 64; var9++) {
                  if (~var27[var9] != ~var28[var9]) {
                    throw new RuntimeException();
                  }
                }
              }
              var7 = ((var5[var18.length - 2] & 255) << 8) + (255 & var5[-1 + var18.length]);
              if (var7 != (this.field_j.field_s[param0] & 65535)) {
                throw new RuntimeException();
              }
              if (this.field_u[param0] != 1) {
                if (this.field_u[param0] != 0) {
                }
                this.field_u[param0] = (byte) 1;
              }
              if (!((sk) (var4)).field_r) {
                ((sk) (var4)).c(param1 ^ 10);
              }
              stackIn_60_0 = var4;
              return (sk) (stackIn_60_0);
            }
            throw new RuntimeException();
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            this.field_u[param0] = (byte)-1;
            ((sk) (var4)).c(param1 + 10);
            if (!((sk) (var4)).field_r) {
              return null;
            }
            if (!this.field_h.b(-21)) {
              var4 = this.field_h.a(this.field_o, true, param0, 437409504, (byte) 2);
              this.field_w.a((byte) 73, (gg) (var4), (long)param0);
            }
            return null;
          }
        }
        try {
          if (var5 != null &&
            2 < var18.length) {
            gl.field_g.reset();
            gl.field_g.update(var5, 0, var18.length - 2);
            var6_int = (int)gl.field_g.getValue();
            if (var6_int != this.field_j.field_b[param0]) {
              throw new RuntimeException();
            }
            if (null != this.field_j.field_q &&
              null != this.field_j.field_q[param0]) {
              var29 = this.field_j.field_q[param0];
              var30 = q.a(var18.length - 2, 0, 100, var18);
              var11 = 0;
              var9 = var11;
              while (64 > var11) {
                if (~var29[var11] != ~var30[var11]) {
                  throw new RuntimeException();
                }
                var11++;
              }
            }
            this.field_h.field_l = 0;
            this.field_h.field_c = 0;
          } else {
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (RuntimeException) (Object) decompiledCaughtException;
          this.field_h.c((byte) 59);
          ((sk) (var4)).c(10);
          if (((sk) (var4)).field_r) {
            if (this.field_h.b(-21)) {
              return null;
            }
            var4 = this.field_h.a(this.field_o, true, param0, 437409504, (byte) 2);
            this.field_w.a((byte) 79, (gg) (var4), (long)param0);
          }
          return null;
        }
        var5[-2 + var18.length] = (byte)(this.field_j.field_s[param0] >>> 8);
        var5[var18.length - 1] = (byte)this.field_j.field_s[param0];
        if (null != this.field_v) {
          this.field_p.a(95, param0, this.field_v, var18);
          if (this.field_u[param0] != 1) {
            this.field_u[param0] = (byte) 1;
          }
        }
        if (!((sk) (var4)).field_r) {
          ((sk) (var4)).c(param1 + 10);
        }
        return (sk) (var4);
    }

    final void e(int param0) {
        sk discarded$1 = null;
        sk discarded$0 = null;
        sk discarded$3 = null;
        sk discarded$2 = null;
        int var2_int;
        sk var2;
        gg var3;
        int var4;
        int var5;
        gg var6;
        gg var7;
        int var2_intLifetime1;
        int var4Lifetime1;
        gg var3Lifetime1;
        var5 = SolKnight.field_L ? 1 : 0;
        if (param0 != 18055) {
          this.c(79);
        }
        boolean decompiledFrameRemainder0 = true;
        if (null != this.field_m) {
          if (null == this.c(-110)) {
            return;
          }
          if (this.field_s) {
            var2_int = 1;
            var3 = this.field_m.a((byte) 51);
            while (var3 != null) {
              var4 = (int)var3.field_g;
              if (0 == this.field_u[var4]) {
                discarded$1 = this.a(var4, (byte) 0, 1);
              }
              if (this.field_u[var4] != 0) {
                var3.c(10);
              } else {
                var2_int = 0;
              }
              var3 = this.field_m.b(-84);
            }
            while (this.field_j.field_r.length > this.field_q) {
              if (this.field_j.field_r[this.field_q] == 0) {
                this.field_q = this.field_q + 1;
                continue;
              }
              if (this.field_p.field_a < 250) {
                if (0 == this.field_u[this.field_q]) {
                  discarded$0 = this.a(this.field_q, (byte) 0, 1);
                }
                if (0 == this.field_u[this.field_q]) {
                  var7 = new gg();
                  var7.field_g = (long)this.field_q;
                  this.field_m.a(var7, -7044);
                  var2_int = 0;
                }
                this.field_q = this.field_q + 1;
                continue;
              }
              var2_int = 0;
              break;
            }
            if ((var2_int != 0)) {
              this.field_q = 0;
              this.field_s = false;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_y) {
              var2_intLifetime1 = 1;
              var3Lifetime1 = this.field_m.a((byte) 51);
              while (var3Lifetime1 != null) {
                var4Lifetime1 = (int)var3Lifetime1.field_g;
                if (1 != this.field_u[var4Lifetime1]) {
                  discarded$3 = this.a(var4Lifetime1, (byte) 0, 2);
                }
                if (this.field_u[var4Lifetime1] != 1) {
                  var2_intLifetime1 = 0;
                } else {
                  var3Lifetime1.c(param0 - 18045);
                }
                var3Lifetime1 = this.field_m.b(-47);
              }
              while (this.field_j.field_r.length > this.field_q) {
                if (this.field_j.field_r[this.field_q] == 0) {
                  this.field_q = this.field_q + 1;
                  continue;
                }
                if (!this.field_h.a(-5868)) {
                  if (this.field_u[this.field_q] != 1) {
                    discarded$2 = this.a(this.field_q, (byte) 0, 2);
                  }
                  if (this.field_u[this.field_q] != 1) {
                    var6 = new gg();
                    var6.field_g = (long)this.field_q;
                    var2_intLifetime1 = 0;
                    this.field_m.a(var6, -7044);
                  }
                  this.field_q = this.field_q + 1;
                  continue;
                }
                var2_intLifetime1 = 0;
                break;
              }
              if ((var2_intLifetime1 != 0)) {
                this.field_q = 0;
                this.field_y = false;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_m = null;
            }
          }
        }
        if (this.field_i &&
          je.a(1) >= this.field_g) {
          var2 = (sk) (this.field_w.b(0));
          while (var2 != null) {
            if (!var2.field_m) {
              if (var2.field_q) {
                if (!var2.field_r) {
                  throw new RuntimeException();
                }
                var2.c(10);
              } else {
                var2.field_q = true;
              }
            }
            var2 = (sk) (this.field_w.c((byte) 122));
          }
          this.field_g = 1000L + je.a(param0 - 18054);
        }
    }

    final ha c(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2 = 0;
        byte[] var3 = null;
        RuntimeException var4 = null;
        int var5 = 0;
        byte[] var6 = null;
        byte[] var7 = null;
        var5 = SolKnight.field_L ? 1 : 0;
        var2 = -106 / ((param0 - 9) / 62);
        if (this.field_j != null) {
          return this.field_j;
        }
        if (null == this.field_x) {
          if (this.field_h.b(-21)) {
            return null;
          }
          this.field_x = (sk) ((Object) this.field_h.a(255, true, this.field_o, 437409504, (byte) 0));
        }
        if (this.field_x.field_m) {
          return null;
        }
        var7 = this.field_x.f(0);
        var6 = var7;
        var3 = var6;
        if (this.field_x instanceof md) {
          try {
            if (var3 == null) {
              throw new RuntimeException();
            }
            this.field_j = new ha(var7, this.field_k, this.field_t);
            if (this.field_n != this.field_j.field_m) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4 = decompiledCaughtException;
            this.field_j = null;
            if (!this.field_h.b(-21)) {
              this.field_x = (sk) ((Object) this.field_h.a(255, true, this.field_o, 437409504, (byte) 0));
            } else {
              this.field_x = null;
            }
            return null;
          }
        } else {
          try {
            if (var3 == null) {
              throw new RuntimeException();
            }
            this.field_j = new ha(var7, this.field_k, this.field_t);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4 = decompiledCaughtException;
            this.field_h.c((byte) 59);
            this.field_j = null;
            if (this.field_h.b(-21)) {
              this.field_x = null;
            } else {
              this.field_x = (sk) ((Object) this.field_h.a(255, true, this.field_o, 437409504, (byte) 0));
            }
            return null;
          }
          if (null != this.field_f) {
            this.field_p.a(83, this.field_o, this.field_f, var7);
          }
        }
        this.field_x = null;
        if (null != this.field_v) {
          this.field_u = new byte[this.field_j.field_l];
        }
        return this.field_j;
    }

    final void d(int param0) {
        sk discarded$0 = null;
        sk discarded$1 = null;
        gg var2;
        int var3;
        int var4;
        var4 = SolKnight.field_L ? 1 : 0;
        if (param0 != -1) {
          return;
        }
        if (null == this.field_m) {
          return;
        }
        if (this.c(123) == null) {
          return;
        }
        var2 = this.field_e.a((byte) 51);
        while (var2 != null) {
          var3 = (int)var2.field_g;
          if (var3 >= 0 &&
            var3 < this.field_j.field_l &&
            this.field_j.field_r[var3] != 0) {
            if (0 == this.field_u[var3]) {
              discarded$0 = this.a(var3, (byte) 0, 1);
            }
            if (this.field_u[var3] == -1) {
              discarded$1 = this.a(var3, (byte) 0, 2);
            }
            if (1 == this.field_u[var3]) {
              var2.c(10);
            }
          } else {
            var2.c(param0 + 11);
          }
          var2 = this.field_e.b(-41);
        }
    }

    final int a(int param0, byte param1) {
        sk var3 = (sk) (this.field_w.a(true, (long)param0));
        if (var3 != null) {
          return var3.a((byte) -126);
        }
        int var4 = -38 / ((param1 + 68) / 58);
        return 0;
    }

    final byte[] a(int param0, int param1) {
        sk var3 = this.a(param0, (byte) 0, 0);
        if (var3 == null) {
          return null;
        }
        byte[] var4 = var3.f(param1);
        var3.c(10);
        return var4;
    }

    final void a(byte param0) {
        if (null == this.field_v) {
          return;
        }
        this.field_y = true;
        if (this.field_m == null) {
          this.field_m = new nc();
        }
        if (param0 != 0) {
          this.e(-121);
        }
    }

    public static void b(byte param0) {
        field_l = null;
        field_r = null;
        if (param0 != 0) {
          field_l = (dl) null;
        }
    }

    lg(int param0, bi param1, bi param2, va param3, ae param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_w = new qd(16);
        this.field_q = 0;
        this.field_e = new nc();
        this.field_g = 0L;
        try {
          this.field_o = param0;
          this.field_v = param1;
          if (null == this.field_v) {
            this.field_s = false;
          } else {
            this.field_s = true;
            this.field_m = new nc();
          }
          this.field_f = param2;
          this.field_t = param6;
          stackIn_7_1 = (param8);
          this.field_i = stackIn_7_1;
          this.field_p = param4;
          this.field_n = param7;
          this.field_h = param3;
          this.field_k = param5;
          if (null != this.field_f) {
            this.field_x = (sk) ((Object) this.field_p.a(this.field_f, this.field_o, -122));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = var10;
          stackIn_12_1 = new StringBuilder().append("lg.<init>(").append(param0).append(',');
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
          throw fc.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_r = "to return to the normal view.";
    }
}
