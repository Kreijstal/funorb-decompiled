/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am extends rb {
    private te field_k;
    private sg field_x;
    static hr[] field_j;
    private ti field_q;
    static int[] field_z;
    static vf field_e;
    private int field_y;
    private int field_u;
    private wl field_f;
    private gd field_r;
    private wl field_h;
    private byte[] field_p;
    private byte[] field_w;
    private rw field_i;
    private int field_v;
    private boolean field_l;
    private int field_g;
    private jn field_s;
    private boolean field_o;
    private jn field_n;
    private long field_t;
    private boolean field_m;

    public static void d(byte param0) {
        field_j = null;
        field_z = null;
        if (param0 > -78) {
          field_z = (int[]) null;
        }
        field_e = null;
    }

    final sg b(byte param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (null != this.field_x) {
          return this.field_x;
        }
        if (this.field_i == null) {
          if (this.field_r.a(-88)) {
            return null;
          }
          this.field_i = (rw) ((Object) this.field_r.a(255, true, this.field_u, (byte) -88, (byte) 0));
        }
        if (this.field_i.field_u) {
          return null;
        }
        if (param0 >= -62) {
          return (sg) null;
        }
        var7 = this.field_i.d(false);
        var6 = var7;
        var5 = var6;
        var2 = var5;
        if (!(this.field_i instanceof ql)) {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_x = new sg(var7, this.field_y, this.field_w);
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = decompiledCaughtException;
            this.field_r.b(14702);
            this.field_x = null;
            if (!this.field_r.a(-6)) {
              this.field_i = (rw) ((Object) this.field_r.a(255, true, this.field_u, (byte) 90, (byte) 0));
            } else {
              this.field_i = null;
            }
            return null;
          }
          if (this.field_f != null) {
            this.field_q.a(this.field_u, var7, 2, this.field_f);
          }
        } else {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_x = new sg(var7, this.field_y, this.field_w);
            if (this.field_x.field_l != this.field_v) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = decompiledCaughtException;
            this.field_x = null;
            if (!this.field_r.a(122)) {
              this.field_i = (rw) ((Object) this.field_r.a(255, true, this.field_u, (byte) -81, (byte) 0));
            } else {
              this.field_i = null;
            }
            return null;
          }
        }
        this.field_i = null;
        if (this.field_h != null) {
          this.field_p = new byte[this.field_x.field_d];
        }
        return this.field_x;
    }

    final void b(int param0) {
        rw discarded$0 = null;
        rw discarded$1 = null;
        ms var2;
        int var3;
        int var4;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (this.field_n == null) {
          return;
        }
        if (param0 > -18) {
          this.c((byte) 124);
        }
        if (this.b((byte) -120) == null) {
          return;
        }
        var2 = this.field_s.b(-72);
        while (var2 != null) {
          var3 = (int)var2.field_h;
          if (var3 >= 0) {
            if (this.field_x.field_d > var3) {
              if (this.field_x.field_m[var3] == 0) {
                var2.b(false);
              } else {
                if (this.field_p[var3] == 0) {
                  discarded$0 = this.a(var3, 1, 30561);
                }
                if (-1 == this.field_p[var3]) {
                  discarded$1 = this.a(var3, 2, 30561);
                }
                if (this.field_p[var3] == 1) {
                  var2.b(false);
                }
              }
            } else {
              var2.b(false);
            }
          } else {
            var2.b(false);
          }
          var2 = this.field_s.d((byte) 18);
        }
    }

    private final rw a(int param0, int param1, int param2) {
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
        rw var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        var12 = (rw) (this.field_k.a(120, (long)param0));
        var4 = var12;
        if (var12 != null &&
          param1 == 0 &&
          !var12.field_t &&
          var12.field_u) {
          var12.b(false);
          var4 = null;
        }
        if (var4 == null) {
          if (param1 != 0) {
            if (1 == param1) {
              if (null == this.field_h) {
                throw new RuntimeException();
              }
              var4 = this.field_q.a(param0, -82, this.field_h);
            } else {
              if (2 != param1) {
                throw new RuntimeException();
              }
              if (this.field_h == null) {
                throw new RuntimeException();
              }
              if (this.field_p[param0] != -1) {
                throw new RuntimeException();
              }
              if (this.field_r.b(true)) {
                return null;
              }
              var4 = this.field_r.a(this.field_u, false, param0, (byte) -126, (byte) 2);
            }
          } else {
            if (null != this.field_h &&
              this.field_p[param0] != -1) {
              var4 = this.field_q.a(this.field_h, -128, param0);
            } else {
              if (this.field_r.a(119)) {
                return null;
              }
              var4 = this.field_r.a(this.field_u, true, param0, (byte) -87, (byte) 2);
            }
          }
          this.field_k.a((ms) (var4), param2 ^ -30562, (long)param0);
        }
        if (((rw) (var4)).field_u) {
          return null;
        }
        var18 = ((rw) (var4)).d(false);
        var13 = var18;
        var5 = var13;
        if (param2 != 30561) {
          this.field_p = (byte[]) null;
        }
        if (var4 instanceof ql) {
          try {
            if (var5 != null &&
              var18.length > 2) {
              pt.field_c.reset();
              pt.field_c.update(var5, 0, -2 + var18.length);
              var6_int = (int)pt.field_c.getValue();
              if (this.field_x.field_b[param0] != var6_int) {
                throw new RuntimeException();
              }
              if (this.field_x.field_a != null &&
                this.field_x.field_a[param0] != null) {
                var29 = this.field_x.field_a[param0];
                var30 = gn.a(var5, (byte) -109, 0, var18.length - 2);
                var11 = 0;
                var9 = var11;
                while (var11 < 64) {
                  if (~var29[var11] != ~var30[var11]) {
                    throw new RuntimeException();
                  }
                  var11++;
                }
              }
              var7 = (var5[-1 + var18.length] & 255) + (65280 & var5[-2 + var18.length] << 8);
              if (var7 != (65535 & this.field_x.field_c[param0])) {
                throw new RuntimeException();
              }
              if (1 != this.field_p[param0]) {
                if (this.field_p[param0] == 0) {
                }
                this.field_p[param0] = (byte) 1;
              }
              if (!((rw) (var4)).field_t) {
                ((rw) (var4)).b(false);
              }
              stackIn_92_0 = var4;
              return (rw) (stackIn_92_0);
            }
            throw new RuntimeException();
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            this.field_p[param0] = (byte)-1;
            ((rw) (var4)).b(false);
            if (((rw) (var4)).field_t) {
              if (this.field_r.a(param2 - 30551)) {
                return null;
              }
              var4 = this.field_r.a(this.field_u, true, param0, (byte) 78, (byte) 2);
              this.field_k.a((ms) (var4), -1, (long)param0);
            }
            return null;
          }
        }
        try {
          if (var5 != null &&
            var18.length > 2) {
            pt.field_c.reset();
            pt.field_c.update(var5, 0, var18.length - 2);
            var6_int = (int)pt.field_c.getValue();
            if (this.field_x.field_b[param0] != var6_int) {
              throw new RuntimeException();
            }
            if (null != this.field_x.field_a &&
              this.field_x.field_a[param0] != null) {
              var28 = this.field_x.field_a[param0];
              var27 = gn.a(var5, (byte) -110, 0, -2 + var18.length);
              for (var9 = 0; 64 > var9; var9++) {
                if (var27[var9] != var28[var9]) {
                  throw new RuntimeException();
                }
              }
            }
            this.field_r.field_d = 0;
            this.field_r.field_j = 0;
          } else {
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref = (RuntimeException) (Object) decompiledCaughtException;
          this.field_r.b(14702);
          ((rw) (var4)).b(false);
          if (((rw) (var4)).field_t &&
            !this.field_r.a(param2 - 30435)) {
            var4 = this.field_r.a(this.field_u, true, param0, (byte) -69, (byte) 2);
            this.field_k.a((ms) (var4), -1, (long)param0);
          }
          return null;
        }
        var5[var18.length - 2] = (byte)(this.field_x.field_c[param0] >>> 8);
        var5[-1 + var18.length] = (byte)this.field_x.field_c[param0];
        if (null != this.field_h) {
          this.field_q.a(param0, var18, 2, this.field_h);
          if (this.field_p[param0] != 1) {
            this.field_p[param0] = (byte) 1;
          }
        }
        if (!((rw) (var4)).field_t) {
          ((rw) (var4)).b(false);
        }
        return (rw) (var4);
    }

    final byte[] a(int param0, boolean param1) {
        rw var3 = this.a(param0, 0, 30561);
        if (var3 == null) {
          return null;
        }
        byte[] var4 = var3.d(param1);
        var3.b(param1);
        return var4;
    }

    final void c(byte param0) {
        if (this.field_h == null) {
          return;
        }
        this.field_o = true;
        if (this.field_n == null) {
          this.field_n = new jn();
        }
        int var2 = -71 / ((param0 + 2) / 46);
    }

    final int a(int param0, int param1) {
        rw var3 = (rw) (this.field_k.a(param1 + 120, (long)param0));
        if (var3 != null) {
          return var3.a(-1);
        }
        if (param1 != 0) {
          this.field_o = true;
          return 0;
        }
        return 0;
    }

    final void c(int param0) {
        rw discarded$1 = null;
        rw discarded$0 = null;
        rw discarded$3 = null;
        rw discarded$2 = null;
        int var2_int;
        rw var2;
        ms var3;
        int var4;
        int var5;
        ms var6;
        ms var7;
        int var2_intLifetime1;
        int var4Lifetime1;
        ms var3Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (null != this.field_n) {
          if (null == this.b((byte) -102)) {
            return;
          }
          if (this.field_l) {
            var2_int = 1;
            var3 = this.field_n.b(122);
            while (var3 != null) {
              var4 = (int)var3.field_h;
              if (this.field_p[var4] == 0) {
                discarded$1 = this.a(var4, 1, 30561);
              }
              if (0 != this.field_p[var4]) {
                var3.b(false);
              } else {
                var2_int = 0;
              }
              var3 = this.field_n.d((byte) 18);
            }
            L3: while (true) {
              if (this.field_g < this.field_x.field_m.length) {
                if (this.field_x.field_m[this.field_g] != 0) {
                  if (250 <= this.field_q.field_e) {
                    var2_int = 0;
                    break L3;
                  }
                  if (this.field_p[this.field_g] == 0) {
                    discarded$0 = this.a(this.field_g, 1, 30561);
                  }
                  if (0 == this.field_p[this.field_g]) {
                    var7 = new ms();
                    var7.field_h = (long)this.field_g;
                    this.field_n.a(var7, (byte) 39);
                    var2_int = 0;
                  }
                }
                this.field_g = this.field_g + 1;
                continue;
              }
              break;
            }
            if ((var2_int != 0)) {
              this.field_g = 0;
              this.field_l = false;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_o) {
              var2_intLifetime1 = 1;
              var3Lifetime1 = this.field_n.b(89);
              while (var3Lifetime1 != null) {
                var4Lifetime1 = (int)var3Lifetime1.field_h;
                if (this.field_p[var4Lifetime1] != 1) {
                  discarded$3 = this.a(var4Lifetime1, 2, 30561);
                }
                if (this.field_p[var4Lifetime1] != 1) {
                  var2_intLifetime1 = 0;
                } else {
                  var3Lifetime1.b(false);
                }
                var3Lifetime1 = this.field_n.d((byte) 18);
              }
              L10: while (true) {
                if (this.field_x.field_m.length > this.field_g) {
                  if (this.field_x.field_m[this.field_g] != 0) {
                    if (this.field_r.b(true)) {
                      var2_intLifetime1 = 0;
                      break L10;
                    }
                    if (this.field_p[this.field_g] != 1) {
                      discarded$2 = this.a(this.field_g, 2, 30561);
                    }
                    if (this.field_p[this.field_g] != 1) {
                      var6 = new ms();
                      var6.field_h = (long)this.field_g;
                      var2_intLifetime1 = 0;
                      this.field_n.a(var6, (byte) 39);
                    }
                  }
                  this.field_g = this.field_g + 1;
                  continue;
                }
                break;
              }
              if ((var2_intLifetime1 != 0)) {
                this.field_g = 0;
                this.field_o = false;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_n = null;
            }
          }
        }
        if (param0 > -29) {
          this.a(30, -8);
        }
        if (this.field_m &&
          wq.a(-91) >= this.field_t) {
          var2 = (rw) (this.field_k.a(84));
          while (var2 != null) {
            if (!var2.field_u) {
              if (!var2.field_s) {
                var2.field_s = true;
              } else {
                if (!var2.field_t) {
                  throw new RuntimeException();
                }
                var2.b(false);
              }
            }
            var2 = (rw) (this.field_k.a(true));
          }
          this.field_t = 1000L + wq.a(-42);
        }
    }

    final static int a(int param0, byte[] param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -87 % ((-27 - param2) / 41);
          stackIn_1_0 = rd.a(param1, 0, param0, 1001);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("am.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param2).append(')').toString());
        }
    }

    am(int param0, wl param1, wl param2, gd param3, ti param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_k = new te(16);
        this.field_g = 0;
        this.field_s = new jn();
        this.field_t = 0L;
        try {
          this.field_h = param1;
          this.field_u = param0;
          if (this.field_h != null) {
            this.field_l = true;
            this.field_n = new jn();
          } else {
            this.field_l = false;
          }
          stackIn_7_1 = (param8);
          this.field_m = stackIn_7_1;
          this.field_y = param5;
          this.field_v = param7;
          this.field_r = param3;
          this.field_w = param6;
          this.field_q = param4;
          this.field_f = param2;
          if (this.field_f != null) {
            this.field_i = (rw) ((Object) this.field_q.a(this.field_f, 91, this.field_u));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = var10;
          stackIn_12_1 = new StringBuilder().append("am.<init>(").append(param0).append(',');
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
          throw qo.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_z = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_e = new vf();
    }
}
