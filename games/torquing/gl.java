/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl extends me {
    private pb field_k;
    private nk field_i;
    private byte[] field_f;
    private byte[] field_g;
    private fd field_v;
    private int field_r;
    private jp field_j;
    private co field_u;
    private int field_c;
    static ei field_d;
    private pb field_h;
    private eb field_t;
    static int field_q;
    private int field_p;
    private int field_n;
    private ei field_s;
    private boolean field_l;
    private ei field_e;
    private boolean field_b;
    private long field_o;
    private boolean field_m;

    final fd b(byte param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        byte[] var8 = null;
        byte[] var9 = null;
        var4 = Torquing.field_u;
        if (null != this.field_v) {
          return this.field_v;
        }
        if (param0 != -126) {
          this.field_s = (ei) null;
        }
        if (null == this.field_i) {
          if (this.field_j.a(20)) {
            return null;
          }
          this.field_i = (nk) ((Object) this.field_j.a((byte) 0, 255, true, (byte) -51, this.field_c));
        }
        if (this.field_i.field_r) {
          return null;
        }
        var8 = this.field_i.c((byte) 114);
        var6 = var8;
        var5 = var6;
        var9 = var5;
        var7 = var9;
        var2 = var7;
        if (this.field_i instanceof lb) {
          try {
            if (var2 == null) {
              throw new RuntimeException();
            }
            this.field_v = new fd(var9, this.field_r, this.field_g);
            if (this.field_p != this.field_v.field_r) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = decompiledCaughtException;
            this.field_v = null;
            if (this.field_j.a(20)) {
              this.field_i = null;
            } else {
              this.field_i = (nk) ((Object) this.field_j.a((byte) 0, 255, true, (byte) -51, this.field_c));
            }
            return null;
          }
        } else {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_v = new fd(var8, this.field_r, this.field_g);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = decompiledCaughtException;
            this.field_j.e((byte) -127);
            this.field_v = null;
            if (!this.field_j.a(param0 ^ -106)) {
              this.field_i = (nk) ((Object) this.field_j.a((byte) 0, 255, true, (byte) -51, this.field_c));
            } else {
              this.field_i = null;
            }
            return null;
          }
          if (null != this.field_h) {
            this.field_u.a(var8, this.field_c, this.field_h, (byte) 120);
          }
        }
        if (this.field_k != null) {
          this.field_f = new byte[this.field_v.field_c];
        }
        this.field_i = null;
        return this.field_v;
    }

    final void d(int param0) {
        if (this.field_k == null) {
          return;
        }
        this.field_l = true;
        if (param0 >= -107) {
          return;
        }
        if (this.field_e == null) {
          this.field_e = new ei();
        }
    }

    final byte[] a(int param0, boolean param1) {
        if (!param1) {
          return (byte[]) null;
        }
        nk var3 = this.a(param0, 121, 0);
        if (var3 == null) {
          return null;
        }
        byte[] var4 = var3.c((byte) 112);
        var3.f(0);
        return var4;
    }

    public static void c(int param0) {
        field_d = null;
        int var1 = 109 % ((-37 - param0) / 37);
    }

    final int a(int param0, int param1) {
        if (param1 != -26954) {
          gl.c(83);
        }
        nk var3 = (nk) (this.field_t.a((long)param0, (byte) 101));
        if (var3 != null) {
          return var3.b(param1 + 27066);
        }
        return 0;
    }

    final void c(byte param0) {
        int var3 = 0;
        nk discarded$0 = null;
        nk discarded$1 = null;
        int var4 = Torquing.field_u;
        if (null == this.field_e) {
          return;
        }
        if (null == this.b((byte) -126)) {
          return;
        }
        q var2 = this.field_s.b(0);
        if (param0 != -94) {
          this.field_m = false;
        }
        while (var2 != null) {
          var3 = (int)var2.field_f;
          if (var3 < 0) {
            var2.f(0);
          } else {
            if (this.field_v.field_c <= var3) {
              var2.f(0);
            } else {
              if (this.field_v.field_l[var3] == 0) {
                var2.f(0);
              } else {
                if (this.field_f[var3] == 0) {
                  discarded$0 = this.a(var3, 121, 1);
                }
                if (this.field_f[var3] == -1) {
                  discarded$1 = this.a(var3, 104, 2);
                }
                if (this.field_f[var3] == 1) {
                  var2.f(0);
                }
              }
            }
          }
          var2 = this.field_s.f(-24059);
        }
    }

    private final nk a(int param0, int param1, int param2) {
        Object stackIn_61_0 = null;
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
        nk var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        var10 = Torquing.field_u;
        if (param1 < 76) {
          this.b(-28);
        }
        var12 = (nk) (this.field_t.a((long)param0, (byte) 85));
        var4 = var12;
        if (var12 != null &&
          0 == param2 &&
          !var12.field_w &&
          var12.field_r) {
          var12.f(0);
          var4 = null;
        }
        if (var4 == null) {
          if (0 != param2) {
            if (1 == param2) {
              if (this.field_k == null) {
                throw new RuntimeException();
              }
              var4 = this.field_u.b(param0, 3, this.field_k);
            } else {
              if (param2 != 2) {
                throw new RuntimeException();
              }
              if (this.field_k == null) {
                throw new RuntimeException();
              }
              if (this.field_f[param0] != -1) {
                throw new RuntimeException();
              }
              if (this.field_j.a((byte) 105)) {
                return null;
              }
              var4 = this.field_j.a((byte) 2, this.field_c, false, (byte) -51, param0);
            }
          } else {
            if (this.field_k != null &&
              this.field_f[param0] != -1) {
              var4 = this.field_u.a(param0, 23538, this.field_k);
            } else {
              if (this.field_j.a(20)) {
                return null;
              }
              var4 = this.field_j.a((byte) 2, this.field_c, true, (byte) -51, param0);
            }
          }
          this.field_t.a(false, (long)param0, (q) (var4));
        }
        if (((nk) (var4)).field_r) {
          return null;
        }
        var18 = ((nk) (var4)).c((byte) 106);
        var13 = var18;
        var5 = var13;
        if (var4 instanceof lb) {
          try {
            if (var5 != null &&
              var18.length > 2) {
              nn.field_d.reset();
              nn.field_d.update(var5, 0, var18.length - 2);
              var6_int = (int)nn.field_d.getValue();
              if (this.field_v.field_p[param0] != var6_int) {
                throw new RuntimeException();
              }
              if (null != this.field_v.field_e &&
                this.field_v.field_e[param0] != null) {
                var27 = this.field_v.field_e[param0];
                var28 = np.a(0, var5, var18.length - 2, -70);
                for (var9 = 0; var9 < 64; var9++) {
                  if (~var27[var9] != ~var28[var9]) {
                    throw new RuntimeException();
                  }
                }
              }
              var7 = ((var5[var18.length - 2] & 255) << 8) + (var5[var18.length - 1] & 255);
              if ((65535 & this.field_v.field_q[param0]) != var7) {
                throw new RuntimeException();
              }
              if (this.field_f[param0] != 1) {
                if (this.field_f[param0] != 0) {
                }
                this.field_f[param0] = (byte) 1;
              }
              if (!((nk) (var4)).field_w) {
                ((nk) (var4)).f(0);
              }
              stackIn_61_0 = var4;
              return (nk) (stackIn_61_0);
            }
            throw new RuntimeException();
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            this.field_f[param0] = (byte)-1;
            ((nk) (var4)).f(0);
            if (((nk) (var4)).field_w) {
              if (this.field_j.a(20)) {
                return null;
              }
              var4 = this.field_j.a((byte) 2, this.field_c, true, (byte) -51, param0);
              this.field_t.a(false, (long)param0, (q) (var4));
            }
            return null;
          }
        }
        try {
          if (var5 != null &&
            var18.length > 2) {
            nn.field_d.reset();
            nn.field_d.update(var5, 0, -2 + var18.length);
            var6_int = (int)nn.field_d.getValue();
            if (this.field_v.field_p[param0] != var6_int) {
              throw new RuntimeException();
            }
            if (this.field_v.field_e != null &&
              this.field_v.field_e[param0] != null) {
              var29 = this.field_v.field_e[param0];
              var30 = np.a(0, var5, -2 + var18.length, -107);
              var11 = 0;
              var9 = var11;
              while (64 > var11) {
                if (~var29[var11] != ~var30[var11]) {
                  throw new RuntimeException();
                }
                var11++;
              }
            }
            this.field_j.field_g = 0;
            this.field_j.field_k = 0;
          } else {
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (RuntimeException) (Object) decompiledCaughtException;
          this.field_j.e((byte) -58);
          ((nk) (var4)).f(0);
          if (!((nk) (var4)).field_w) {
            return null;
          }
          if (this.field_j.a(20)) {
            return null;
          }
          var4 = this.field_j.a((byte) 2, this.field_c, true, (byte) -51, param0);
          this.field_t.a(false, (long)param0, (q) (var4));
          return null;
        }
        var5[-2 + var18.length] = (byte)(this.field_v.field_q[param0] >>> 8);
        var5[var18.length - 1] = (byte)this.field_v.field_q[param0];
        if (this.field_k != null) {
          this.field_u.a(var18, param0, this.field_k, (byte) 64);
          if (this.field_f[param0] != 1) {
            this.field_f[param0] = (byte) 1;
          }
        }
        if (!((nk) (var4)).field_w) {
          ((nk) (var4)).f(0);
        }
        return (nk) (var4);
    }

    final void b(int param0) {
        nk discarded$1 = null;
        nk discarded$0 = null;
        nk discarded$3 = null;
        nk discarded$2 = null;
        int var2_int;
        nk var2;
        q var3;
        int var4;
        int var5;
        q var6;
        q var7;
        int var2_intLifetime1;
        int var4Lifetime1;
        q var3Lifetime1;
        var5 = Torquing.field_u;
        if (param0 != -1) {
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_e != null) {
          if (this.b((byte) -126) == null) {
            return;
          }
          if (this.field_b) {
            var2_int = 1;
            var3 = this.field_e.b(0);
            while (var3 != null) {
              var4 = (int)var3.field_f;
              if (this.field_f[var4] == 0) {
                discarded$1 = this.a(var4, 97, 1);
              }
              if (this.field_f[var4] == 0) {
                var2_int = 0;
              } else {
                var3.f(0);
              }
              var3 = this.field_e.f(-24059);
            }
            L3: while (true) {
              if (this.field_n < this.field_v.field_l.length) {
                if (this.field_v.field_l[this.field_n] != 0) {
                  if (this.field_u.field_a >= 250) {
                    var2_int = 0;
                    break L3;
                  }
                  if (0 == this.field_f[this.field_n]) {
                    discarded$0 = this.a(this.field_n, param0 + 123, 1);
                  }
                  if (this.field_f[this.field_n] == 0) {
                    var7 = new q();
                    var7.field_f = (long)this.field_n;
                    var2_int = 0;
                    this.field_e.a((byte) 54, var7);
                  }
                }
                this.field_n = this.field_n + 1;
                continue;
              }
              break;
            }
            if ((var2_int != 0)) {
              this.field_b = false;
              this.field_n = 0;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_l) {
              var2_intLifetime1 = 1;
              var3Lifetime1 = this.field_e.b(0);
              while (var3Lifetime1 != null) {
                var4Lifetime1 = (int)var3Lifetime1.field_f;
                if (this.field_f[var4Lifetime1] != 1) {
                  discarded$3 = this.a(var4Lifetime1, 124, 2);
                }
                if (this.field_f[var4Lifetime1] == 1) {
                  var3Lifetime1.f(~param0);
                } else {
                  var2_intLifetime1 = 0;
                }
                var3Lifetime1 = this.field_e.f(param0 ^ 24058);
              }
              while (this.field_v.field_l.length > this.field_n) {
                if (this.field_v.field_l[this.field_n] == 0) {
                  this.field_n = this.field_n + 1;
                  continue;
                }
                if (!this.field_j.a((byte) 101)) {
                  if (this.field_f[this.field_n] != 1) {
                    discarded$2 = this.a(this.field_n, 101, 2);
                  }
                  if (1 != this.field_f[this.field_n]) {
                    var6 = new q();
                    var6.field_f = (long)this.field_n;
                    this.field_e.a((byte) 54, var6);
                    var2_intLifetime1 = 0;
                  }
                  this.field_n = this.field_n + 1;
                  continue;
                }
                var2_intLifetime1 = 0;
                break;
              }
              if ((var2_intLifetime1 != 0)) {
                this.field_n = 0;
                this.field_l = false;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_e = null;
            }
          }
        }
        if (this.field_m &&
          km.b(-1) >= this.field_o) {
          var2 = (nk) (this.field_t.c((byte) -119));
          while (var2 != null) {
            if (!var2.field_r) {
              if (var2.field_v) {
                if (!var2.field_w) {
                  throw new RuntimeException();
                }
                var2.f(0);
              } else {
                var2.field_v = true;
              }
            }
            var2 = (nk) (this.field_t.b((byte) 105));
          }
          this.field_o = km.b(-1) + 1000L;
        }
    }

    gl(int param0, pb param1, pb param2, jp param3, co param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_t = new eb(16);
        this.field_n = 0;
        this.field_s = new ei();
        this.field_o = 0L;
        try {
          this.field_k = param1;
          this.field_c = param0;
          if (this.field_k != null) {
            this.field_b = true;
            this.field_e = new ei();
          } else {
            this.field_b = false;
          }
          this.field_p = param7;
          this.field_j = param3;
          this.field_h = param2;
          stackIn_7_1 = (param8);
          this.field_m = stackIn_7_1;
          this.field_g = param6;
          this.field_u = param4;
          this.field_r = param5;
          if (this.field_h != null) {
            this.field_i = (nk) ((Object) this.field_u.a(this.field_c, 23538, this.field_h));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = var10;
          stackIn_12_1 = new StringBuilder().append("gl.<init>(").append(param0).append(',');
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
          throw rb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_d = new ei();
        field_q = 0;
    }
}
