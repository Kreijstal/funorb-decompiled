/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak extends jl {
    private byte[] field_A;
    private mh field_p;
    static ki field_y;
    private int field_t;
    static int field_z;
    private eh field_l;
    private hd field_i;
    private int field_r;
    private byte[] field_g;
    private ge field_n;
    private eh field_w;
    private wj field_q;
    private int field_k;
    private vl field_j;
    private im field_x;
    private boolean field_s;
    private boolean field_h;
    private int field_o;
    private im field_m;
    private long field_v;
    private boolean field_u;

    private final wj a(int param0, byte param1, int param2) {
        Object stackIn_15_0 = null;
        Object stackIn_76_0 = null;
        Object stackIn_84_0 = null;
        Object stackIn_111_0 = null;
        Object stackIn_120_0 = null;
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
        wj var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        var10 = OrbDefence.field_D ? 1 : 0;
        try {
          var12 = (wj) (this.field_p.a((long)param0, -1));
          var4 = var12;
          if (var12 != null &&
            0 == param2 &&
            !var12.field_n &&
            var12.field_l) {
            var12.b(57);
            var4 = null;
          }
          if (var4 == null) {
            if (param2 != 0) {
              if (1 != param2) {
                if (2 != param2) {
                  throw new RuntimeException();
                }
                if (this.field_l == null) {
                  throw new RuntimeException();
                }
                if (-1 != this.field_g[param0]) {
                  throw new RuntimeException();
                }
                if (this.field_n.a(false)) {
                  return null;
                }
                var4 = this.field_n.a(15937, param0, false, this.field_t, (byte) 2);
              } else {
                if (this.field_l == null) {
                  throw new RuntimeException();
                }
                var4 = this.field_j.a((byte) 123, this.field_l, param0);
              }
            } else {
              if (null != this.field_l &&
                this.field_g[param0] != -1) {
                var4 = this.field_j.a(this.field_l, param0, -126);
              } else {
                if (this.field_n.d(-110)) {
                  stackIn_15_0 = null;
                  return (wj) (stackIn_15_0);
                }
                var4 = this.field_n.a(15937, param0, true, this.field_t, (byte) 2);
              }
            }
            this.field_p.a((long)param0, (byte) 127, (ca) (var4));
          }
          if (((wj) (var4)).field_l) {
            return null;
          }
          if (param1 <= 30) {
            field_z = -77;
          }
          var18 = ((wj) (var4)).f(0);
          var13 = var18;
          var5 = var13;
          if (var4 instanceof uc) {
            try {
              if (var5 != null &&
                2 < var18.length) {
                ee.field_f.reset();
                ee.field_f.update(var5, 0, var18.length - 2);
                var6_int = (int)ee.field_f.getValue();
                if (var6_int != this.field_i.field_r[param0]) {
                  throw new RuntimeException();
                }
                if (this.field_i.field_k != null &&
                  this.field_i.field_k[param0] != null) {
                  var27 = this.field_i.field_k[param0];
                  var28 = ee.a(-1, var18.length - 2, 0, var18);
                  for (var9 = 0; var9 < 64; var9++) {
                    if (~var27[var9] != ~var28[var9]) {
                      throw new RuntimeException();
                    }
                  }
                }
                var7 = (255 & var5[var18.length - 1]) + (var5[-2 + var18.length] << 8 & 65280);
                if ((this.field_i.field_i[param0] & 65535) != var7) {
                  throw new RuntimeException();
                }
                if (1 != this.field_g[param0]) {
                  if (this.field_g[param0] != 0) {
                  }
                  this.field_g[param0] = (byte) 1;
                }
                if (!((wj) (var4)).field_n) {
                  ((wj) (var4)).b(57);
                }
                stackIn_76_0 = var4;
                return (wj) (stackIn_76_0);
              }
              throw new RuntimeException();
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var6_ref = (Exception) (Object) decompiledCaughtException;
              this.field_g[param0] = (byte)-1;
              ((wj) (var4)).b(57);
              if (!((wj) (var4)).field_n) {
                return null;
              }
              if (!this.field_n.d(-9)) {
                var4 = this.field_n.a(15937, param0, true, this.field_t, (byte) 2);
                this.field_p.a((long)param0, (byte) -8, (ca) (var4));
              }
              stackIn_84_0 = null;
              return (wj) (stackIn_84_0);
            }
          }
          try {
            if (var5 != null &&
              var18.length > 2) {
              ee.field_f.reset();
              ee.field_f.update(var5, 0, -2 + var18.length);
              var6_int = (int)ee.field_f.getValue();
              if (var6_int != this.field_i.field_r[param0]) {
                throw new RuntimeException();
              }
              if (null != this.field_i.field_k &&
                null != this.field_i.field_k[param0]) {
                var29 = this.field_i.field_k[param0];
                var30 = ee.a(-1, var18.length - 2, 0, var18);
                var11 = 0;
                var9 = var11;
                while (64 > var11) {
                  if (var29[var11] != var30[var11]) {
                    throw new RuntimeException();
                  }
                  var11++;
                }
              }
              this.field_n.field_b = 0;
              this.field_n.field_n = 0;
            } else {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (RuntimeException) (Object) decompiledCaughtException;
            this.field_n.f(-105);
            ((wj) (var4)).b(57);
            if (!((wj) (var4)).field_n) {
              return null;
            }
            if (!this.field_n.d(-88)) {
              var4 = this.field_n.a(15937, param0, true, this.field_t, (byte) 2);
              this.field_p.a((long)param0, (byte) -99, (ca) (var4));
            }
            stackIn_111_0 = null;
            return (wj) (stackIn_111_0);
          }
          var5[-2 + var18.length] = (byte)(this.field_i.field_i[param0] >>> 8);
          var5[-1 + var18.length] = (byte)this.field_i.field_i[param0];
          if (null != this.field_l) {
            this.field_j.a(param0, this.field_l, var18, 2);
            if (1 != this.field_g[param0]) {
              this.field_g[param0] = (byte) 1;
            }
          }
          if (!((wj) (var4)).field_n) {
            ((wj) (var4)).b(57);
          }
          stackIn_120_0 = var4;
          return (wj) (stackIn_120_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (RuntimeException) (Object) decompiledCaughtException;
          throw dd.a((Throwable) (var4), "ak.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final hd a(int param0) {
        hd stackIn_5_0 = null;
        Object stackIn_35_0 = null;
        Object stackIn_47_0 = null;
        hd stackIn_55_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          if (null != this.field_i) {
            stackIn_5_0 = this.field_i;
            return stackIn_5_0;
          }
          if (this.field_q == null) {
            if (this.field_n.d(-105)) {
              return null;
            }
            this.field_q = (wj) ((Object) this.field_n.a(15937, this.field_t, true, 255, (byte) 0));
          }
          if (this.field_q.field_l) {
            return null;
          }
          if (param0 != -23879) {
            ak.b(26);
          }
          var7 = this.field_q.f(0);
          var6 = var7;
          var5 = var6;
          var2 = var5;
          if (!(this.field_q instanceof uc)) {
            try {
              if (var5 == null) {
                throw new RuntimeException();
              }
              this.field_i = new hd(var7, this.field_r, this.field_A);
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = decompiledCaughtException;
              this.field_n.f(-128);
              this.field_i = null;
              if (this.field_n.d(-20)) {
                this.field_q = null;
              } else {
                this.field_q = (wj) ((Object) this.field_n.a(param0 ^ -25352, this.field_t, true, 255, (byte) 0));
              }
              stackIn_47_0 = null;
              return (hd) (stackIn_47_0);
            }
            if (this.field_w != null) {
              this.field_j.a(this.field_t, this.field_w, var7, 2);
            }
          } else {
            try {
              if (var5 == null) {
                throw new RuntimeException();
              }
              this.field_i = new hd(var7, this.field_r, this.field_A);
              if (this.field_k != this.field_i.field_b) {
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = decompiledCaughtException;
              this.field_i = null;
              if (!this.field_n.d(-13)) {
                this.field_q = (wj) ((Object) this.field_n.a(15937, this.field_t, true, 255, (byte) 0));
              } else {
                this.field_q = null;
              }
              stackIn_35_0 = null;
              return (hd) (stackIn_35_0);
            }
          }
          this.field_q = null;
          if (null != this.field_l) {
            this.field_g = new byte[this.field_i.field_s];
          }
          stackIn_55_0 = this.field_i;
          return stackIn_55_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2_ref = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var2_ref), "ak.C(" + param0 + ')');
        }
    }

    final void e(byte param0) {
        wj discarded$0 = null;
        wj discarded$1 = null;
        RuntimeException decompiledCaughtException = null;
        ca var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          if (this.field_m == null) {
            return;
          }
          if (null == this.a(-23879)) {
            return;
          }
          var2 = this.field_x.b((byte) -16);
          while (var2 != null) {
            var3 = (int)var2.field_d;
            if (var3 >= 0) {
              if (this.field_i.field_s > var3) {
                if (0 == this.field_i.field_d[var3]) {
                  var2.b(57);
                } else {
                  if (this.field_g[var3] == 0) {
                    discarded$0 = this.a(var3, (byte) 122, 1);
                  }
                  if (this.field_g[var3] == -1) {
                    discarded$1 = this.a(var3, (byte) 76, 2);
                  }
                  if (this.field_g[var3] == 1) {
                    var2.b(57);
                  }
                }
              } else {
                var2.b(57);
              }
            } else {
              var2.b(57);
            }
            var2 = this.field_x.d(853);
          }
          if (param0 != 57) {
            ak.b(-86);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var2_ref), "ak.J(" + param0 + ')');
        }
    }

    final void d(byte param0) {
        if (this.field_l == null) {
          return;
        }
        try {
          this.field_h = true;
          if (null == this.field_m) {
            this.field_m = new im();
          }
          int var2_int = 123 % ((param0 + 14) / 40);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "ak.I(" + param0 + ')');
        }
    }

    final static void b(int param0) {
        e.field_a = null;
        if (param0 != 22176) {
          return;
        }
        try {
          gj.field_f = null;
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "ak.L(" + param0 + ')');
        }
    }

    final int b(int param0, int param1) {
        wj var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = (wj) (this.field_p.a((long)param0, -1));
          if (var3 != null) {
            stackIn_4_0 = var3.e(param1 ^ -7334);
            return stackIn_4_0;
          }
          if (param1 != -7362) {
            this.e((byte) -116);
          }
          stackIn_8_0 = 0;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var3_ref), "ak.A(" + param0 + ',' + param1 + ')');
        }
    }

    final byte[] a(int param0, int param1) {
        wj var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.a(param1, (byte) 54, 0);
          if (var3 == null) {
            return null;
          }
          if (param0 != -15861) {
            this.field_m = (im) null;
          }
          var4 = var3.f(0);
          var3.b(param0 + 15918);
          stackIn_7_0 = var4;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var3_ref), "ak.E(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(boolean param0) {
        wj discarded$1 = null;
        wj discarded$0 = null;
        wj discarded$3 = null;
        wj discarded$2 = null;
        ge stackIn_27_0 = null;
        boolean stackIn_28_1 = false;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        int var2_int = 0;
        wj var2_ref = null;
        RuntimeException var2_ref2 = null;
        ca var3 = null;
        int var4 = 0;
        int var5 = 0;
        ca var6 = null;
        ca var7 = null;
        wj var2_refLifetime1;
        ca var3Lifetime1;
        int var2_intLifetime1;
        int var4Lifetime1;
        var2 = null;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameRemainder1 = true;
          if (null != this.field_m) {
            if (this.a(-23879) == null) {
              return;
            }
            if (this.field_s) {
              var2_int = 1;
              var3 = this.field_m.b((byte) -12);
              while (var3 != null) {
                var4 = (int)var3.field_d;
                if (this.field_g[var4] == 0) {
                  discarded$1 = this.a(var4, (byte) 55, 1);
                }
                if (this.field_g[var4] != 0) {
                  var3.b(57);
                } else {
                  var2_int = 0;
                }
                var3 = this.field_m.d(853);
              }
              while (this.field_i.field_d.length > this.field_o) {
                if (this.field_i.field_d[this.field_o] == 0) {
                  this.field_o = this.field_o + 1;
                  continue;
                }
                if (250 > this.field_j.field_b) {
                  if (this.field_g[this.field_o] == 0) {
                    discarded$0 = this.a(this.field_o, (byte) 43, 1);
                  }
                  if (this.field_g[this.field_o] == 0) {
                    var7 = new ca();
                    var7.field_d = (long)this.field_o;
                    this.field_m.a(-121, var7);
                    var2_int = 0;
                  }
                  this.field_o = this.field_o + 1;
                  continue;
                }
                var2_int = 0;
                break;
              }
              if ((var2_int != 0)) {
                this.field_s = false;
                this.field_o = 0;
              }
              decompiledFrameRemainder1 = false;
            }
            else {
              if (this.field_h) {
                var2_intLifetime1 = 1;
                var3Lifetime1 = this.field_m.b((byte) -17);
                while (var3Lifetime1 != null) {
                  var4Lifetime1 = (int)var3Lifetime1.field_d;
                  if (1 != this.field_g[var4Lifetime1]) {
                    discarded$3 = this.a(var4Lifetime1, (byte) 107, 2);
                  }
                  if (this.field_g[var4Lifetime1] == 1) {
                    var3Lifetime1.b(57);
                  } else {
                    var2_intLifetime1 = 0;
                  }
                  var3Lifetime1 = this.field_m.d(853);
                }
                while (this.field_o < this.field_i.field_d.length) {
                  if (0 == this.field_i.field_d[this.field_o]) {
                    this.field_o = this.field_o + 1;
                    continue;
                  }
                  stackIn_27_0 = this.field_n;
                  stackIn_28_1 = !(param0);
                  if (!((ge) (Object) stackIn_27_0).a(stackIn_28_1)) {
                    if (1 != this.field_g[this.field_o]) {
                      discarded$2 = this.a(this.field_o, (byte) 63, 2);
                    }
                    if (this.field_g[this.field_o] != 1) {
                      var6 = new ca();
                      var6.field_d = (long)this.field_o;
                      this.field_m.a(-90, var6);
                      var2_intLifetime1 = 0;
                    }
                    this.field_o = this.field_o + 1;
                    continue;
                  }
                  var2_intLifetime1 = 0;
                  break;
                }
                if (var2_intLifetime1 != 0) {
                  this.field_h = false;
                  this.field_o = 0;
                  decompiledFrameRemainder1 = false;
                }
                else {
                  if (!param0) {
                    return;
                  }
                  if (!this.field_u) {
                    return;
                  }
                  if (ji.b(-40) < this.field_v) {
                    return;
                  }
                  var2_ref = (wj) (this.field_p.a((byte) 121));
                  while (var2_ref != null) {
                    if (!var2_ref.field_l) {
                      if (var2_ref.field_p) {
                        if (!var2_ref.field_n) {
                          throw new RuntimeException();
                        }
                        var2_ref.b(57);
                      } else {
                        var2_ref.field_p = true;
                      }
                    }
                    var2_ref = (wj) (this.field_p.c((byte) -112));
                  }
                  decompiledFrameRemainder0 = false;
                }
              }
              if ((decompiledFrameRemainder1) &&
                (decompiledFrameRemainder0)) {
                this.field_m = null;
              }
            }
          }
          if (decompiledFrameRemainder0) {
            if (!param0) {
              return;
            }
            if (!this.field_u) {
              return;
            }
            if (ji.b(-40) < this.field_v) {
              return;
            }
            var2_refLifetime1 = (wj) (this.field_p.a((byte) 121));
            while (var2_refLifetime1 != null) {
              if (!var2_refLifetime1.field_l) {
                if (var2_refLifetime1.field_p) {
                  if (!var2_refLifetime1.field_n) {
                    throw new RuntimeException();
                  }
                  var2_refLifetime1.b(57);
                } else {
                  var2_refLifetime1.field_p = true;
                }
              }
              var2_refLifetime1 = (wj) (this.field_p.c((byte) -112));
            }
          }
          this.field_v = 1000L + ji.b(-80);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref2 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var2_ref2), "ak.G(" + param0 + ')');
        }
    }

    public static void c(byte param0) {
        try {
          field_y = null;
          int var1_int = -101 % ((-38 - param0) / 58);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "ak.H(" + param0 + ')');
        }
    }

    ak(int param0, eh param1, eh param2, ge param3, vl param4, int param5, byte[] param6, int param7, boolean param8) {
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        this.field_p = new mh(16);
        this.field_o = 0;
        this.field_x = new im();
        this.field_v = 0L;
        try {
          this.field_l = param1;
          this.field_t = param0;
          if (null != this.field_l) {
            this.field_s = true;
            this.field_m = new im();
          } else {
            this.field_s = false;
          }
          this.field_r = param5;
          this.field_j = param4;
          this.field_w = param2;
          this.field_k = param7;
          this.field_n = param3;
          this.field_A = param6;
          stackIn_7_1 = (param8);
          this.field_u = stackIn_7_1;
          if (null != this.field_w) {
            this.field_q = (wj) ((Object) this.field_j.a(this.field_w, this.field_t, -128));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_13_0 = var10;
          stackIn_13_1 = new StringBuilder().append("ak.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_17_0 = stackIn_13_0;
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_18_0 = stackIn_17_0;
            stackIn_18_2 = "null";
          } else {
            stackIn_18_0 = stackIn_13_0;
            stackIn_18_2 = "{...}";
          }
          stackIn_21_0 = stackIn_18_0;
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param3 == null) {
            stackIn_22_0 = stackIn_21_0;
            stackIn_22_2 = "null";
          } else {
            stackIn_22_0 = stackIn_18_0;
            stackIn_22_2 = "{...}";
          }
          stackIn_25_0 = stackIn_22_0;
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param4 == null) {
            stackIn_26_0 = stackIn_25_0;
            stackIn_26_2 = "null";
          } else {
            stackIn_26_0 = stackIn_22_0;
            stackIn_26_2 = "{...}";
          }
          stackIn_29_0 = stackIn_26_0;
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_30_0 = stackIn_29_0;
            stackIn_30_2 = "null";
          } else {
            stackIn_30_0 = stackIn_26_0;
            stackIn_30_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
    }
}
