/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg extends gi {
    private ah field_x;
    private hc field_n;
    private rf field_j;
    private ah field_r;
    static int field_y;
    private w field_f;
    private int field_A;
    static String field_v;
    private byte[] field_i;
    static fh field_h;
    static volatile long field_z;
    private int field_e;
    private byte[] field_u;
    private int field_m;
    private af field_o;
    private dl field_g;
    private boolean field_t;
    private boolean field_q;
    private int field_l;
    private vc field_p;
    private vc field_s;
    private boolean field_k;
    private long field_w;

    final static void a(byte param0, int param1) {
        if (param0 != -105) {
          field_h = (fh) null;
        }
        cl.field_b = param1;
    }

    final rf a(int param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = fleas.field_A ? 1 : 0;
        if (null != this.field_j) {
          return this.field_j;
        }
        if (this.field_g == null) {
          if (this.field_f.a(param0 + 1805)) {
            return null;
          }
          this.field_g = (dl) ((Object) this.field_f.a(param0 ^ -1745, true, this.field_m, 255, (byte) 0));
        }
        if (this.field_g.field_q) {
          return null;
        }
        var7 = this.field_g.g(100);
        var6 = var7;
        var5 = var6;
        var2 = var5;
        if (!(this.field_g instanceof qh)) {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_j = new rf(var7, this.field_A, this.field_u);
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = decompiledCaughtException;
            this.field_f.a((byte) 80);
            this.field_j = null;
            if (!this.field_f.a(param0 + 1612)) {
              this.field_g = (dl) ((Object) this.field_f.a(127, true, this.field_m, 255, (byte) 0));
            } else {
              this.field_g = null;
            }
            return null;
          }
          if (null != this.field_r) {
            this.field_o.a(83, this.field_m, this.field_r, var7);
          }
        } else {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_j = new rf(var7, this.field_A, this.field_u);
            if (this.field_e != this.field_j.field_t) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = decompiledCaughtException;
            this.field_j = null;
            if (!this.field_f.a(-95)) {
              this.field_g = (dl) ((Object) this.field_f.a(127, true, this.field_m, 255, (byte) 0));
            } else {
              this.field_g = null;
            }
            return null;
          }
        }
        if (param0 != -1712) {
          this.c(117);
        }
        if (null != this.field_x) {
          this.field_i = new byte[this.field_j.field_i];
        }
        this.field_g = null;
        return this.field_j;
    }

    final void c(int param0) {
        dl discarded$0 = null;
        if (this.field_x == null) {
          return;
        }
        if (param0 >= -57) {
          discarded$0 = this.a(81, -1, 27);
        }
        this.field_q = true;
        if (this.field_p == null) {
          this.field_p = new vc();
        }
    }

    final int a(int param0, byte param1) {
        if (param1 != -5) {
          this.b(60, true);
        }
        dl var3 = (dl) (this.field_n.a((long)param0, param1 ^ 1105));
        if (var3 == null) {
          return 0;
        }
        return var3.f(8651);
    }

    final void b(byte param0) {
        dl discarded$1 = null;
        dl discarded$0 = null;
        dl discarded$3 = null;
        dl discarded$2 = null;
        int var2_int;
        dl var2;
        lh var3;
        int var4;
        int var5;
        lh var6;
        lh var7;
        int var2_intLifetime1;
        int var4Lifetime1;
        lh var3Lifetime1;
        var5 = fleas.field_A ? 1 : 0;
        if (param0 <= 119) {
          field_z = -93L;
        }
        boolean decompiledFrameRemainder0 = true;
        if (null != this.field_p) {
          if (this.a(-1712) == null) {
            return;
          }
          if (this.field_t) {
            var2_int = 1;
            var3 = this.field_p.c((byte) 47);
            while (var3 != null) {
              var4 = (int)var3.field_c;
              if (0 == this.field_i[var4]) {
                discarded$1 = this.a(2, 1, var4);
              }
              if (this.field_i[var4] != 0) {
                var3.c(-1);
              } else {
                var2_int = 0;
              }
              var3 = this.field_p.b((byte) -105);
            }
            L4: while (true) {
              if (this.field_l < this.field_j.field_f.length) {
                if (this.field_j.field_f[this.field_l] != 0) {
                  if (this.field_o.field_d >= 250) {
                    var2_int = 0;
                    break L4;
                  }
                  if (this.field_i[this.field_l] == 0) {
                    discarded$0 = this.a(2, 1, this.field_l);
                  }
                  if (0 == this.field_i[this.field_l]) {
                    var7 = new lh();
                    var7.field_c = (long)this.field_l;
                    var2_int = 0;
                    this.field_p.a(false, var7);
                  }
                }
                this.field_l = this.field_l + 1;
                continue;
              }
              break;
            }
            if ((var2_int != 0)) {
              this.field_l = 0;
              this.field_t = false;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_q) {
              var2_intLifetime1 = 1;
              var3Lifetime1 = this.field_p.c((byte) 47);
              while (var3Lifetime1 != null) {
                var4Lifetime1 = (int)var3Lifetime1.field_c;
                if (this.field_i[var4Lifetime1] != 1) {
                  discarded$3 = this.a(2, 2, var4Lifetime1);
                }
                if (this.field_i[var4Lifetime1] != 1) {
                  var2_intLifetime1 = 0;
                } else {
                  var3Lifetime1.c(-1);
                }
                var3Lifetime1 = this.field_p.b((byte) -105);
              }
              while (this.field_j.field_f.length > this.field_l) {
                if (this.field_j.field_f[this.field_l] == 0) {
                  this.field_l = this.field_l + 1;
                  continue;
                }
                if (!this.field_f.b(113)) {
                  if (this.field_i[this.field_l] != 1) {
                    discarded$2 = this.a(2, 2, this.field_l);
                  }
                  if (this.field_i[this.field_l] != 1) {
                    var6 = new lh();
                    var6.field_c = (long)this.field_l;
                    var2_intLifetime1 = 0;
                    this.field_p.a(false, var6);
                  }
                  this.field_l = this.field_l + 1;
                  continue;
                }
                var2_intLifetime1 = 0;
                break;
              }
              if ((var2_intLifetime1 != 0)) {
                this.field_q = false;
                this.field_l = 0;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_p = null;
            }
          }
        }
        if (this.field_k &&
          this.field_w <= lj.a((byte) -56)) {
          var2 = (dl) (this.field_n.a(true));
          while (var2 != null) {
            if (!var2.field_q) {
              if (var2.field_r) {
                if (!var2.field_v) {
                  throw new RuntimeException();
                }
                var2.c(-1);
              } else {
                var2.field_r = true;
              }
            }
            var2 = (dl) (this.field_n.b((byte) 97));
          }
          this.field_w = 1000L + lj.a((byte) -28);
        }
    }

    final static void a(java.math.BigInteger param0, int param1, ni param2, ni param3, java.math.BigInteger param4) {
        try {
          if (param1 >= -104) {
            field_v = (String) null;
          }
          qi.a(param4, param2.field_i, 0, param2.field_k, param3, param0, (byte) -60);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "cg.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private final dl a(int param0, int param1, int param2) {
        Object stackIn_60_0 = null;
        byte stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
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
        dl var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        var10 = fleas.field_A ? 1 : 0;
        if (param0 != 2) {
          this.a(-58, (byte) -93);
        }
        var12 = (dl) (this.field_n.a((long)param2, -1110));
        var4 = var12;
        if (var12 != null &&
          param1 == 0 &&
          !var12.field_v &&
          var12.field_q) {
          var12.c(-1);
          var4 = null;
        }
        if (var4 == null) {
          if (0 != param1) {
            if (param1 != 1) {
              if (param1 != 2) {
                throw new RuntimeException();
              }
              if (null == this.field_x) {
                throw new RuntimeException();
              }
              if (this.field_i[param2] != -1) {
                throw new RuntimeException();
              }
              if (this.field_f.b(-49)) {
                return null;
              }
              var4 = this.field_f.a(127, false, param2, this.field_m, (byte) 2);
            } else {
              if (this.field_x == null) {
                throw new RuntimeException();
              }
              var4 = this.field_o.a(126, param2, this.field_x);
            }
          } else {
            if (null != this.field_x &&
              this.field_i[param2] != -1) {
              var4 = this.field_o.a(param2, this.field_x, true);
            } else {
              if (this.field_f.a(-112)) {
                return null;
              }
              var4 = this.field_f.a(param0 + 125, true, param2, this.field_m, (byte) 2);
            }
          }
          this.field_n.a((lh) (var4), true, (long)param2);
        }
        if (((dl) (var4)).field_q) {
          return null;
        }
        var18 = ((dl) (var4)).g(100);
        var13 = var18;
        var5 = var13;
        if (var4 instanceof qh) {
          try {
            if (var5 != null &&
              2 < var18.length) {
              ql.field_j.reset();
              ql.field_j.update(var5, 0, var18.length - 2);
              var6_int = (int)ql.field_j.getValue();
              if (var6_int != this.field_j.field_u[param2]) {
                throw new RuntimeException();
              }
              if (this.field_j.field_o != null &&
                this.field_j.field_o[param2] != null) {
                var28 = this.field_j.field_o[param2];
                var27 = kb.a(var5, -2 + var18.length, (byte) 124, 0);
                for (var9 = 0; var9 < 64; var9++) {
                  if (var27[var9] != var28[var9]) {
                    throw new RuntimeException();
                  }
                }
              }
              var7 = ((var5[-2 + var18.length] & 255) << 8) + (var5[var18.length - 1] & 255);
              if ((65535 & this.field_j.field_n[param2]) != var7) {
                throw new RuntimeException();
              }
              if (this.field_i[param2] != 1) {
                if (this.field_i[param2] != 0) {
                }
                this.field_i[param2] = (byte) 1;
              }
              if (!((dl) (var4)).field_v) {
                ((dl) (var4)).c(-1);
              }
              stackIn_60_0 = var4;
              return (dl) (stackIn_60_0);
            }
            throw new RuntimeException();
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            this.field_i[param2] = (byte)-1;
            ((dl) (var4)).c(param0 - 3);
            if (!((dl) (var4)).field_v) {
              return null;
            }
            if (this.field_f.a(-92)) {
              return null;
            }
            var4 = this.field_f.a(param0 ^ 125, true, param2, this.field_m, (byte) 2);
            this.field_n.a((lh) (var4), true, (long)param2);
            return null;
          }
        }
        try {
          if (var5 != null &&
            var18.length > 2) {
            ql.field_j.reset();
            ql.field_j.update(var5, 0, var18.length - 2);
            var6_int = (int)ql.field_j.getValue();
            if (var6_int != this.field_j.field_u[param2]) {
              throw new RuntimeException();
            }
            if (this.field_j.field_o != null &&
              null != this.field_j.field_o[param2]) {
              var30 = this.field_j.field_o[param2];
              var29 = kb.a(var5, var18.length - 2, (byte) 99, 0);
              var11 = 0;
              var9 = var11;
              while (var11 < 64) {
                if (var29[var11] != var30[var11]) {
                  throw new RuntimeException();
                }
                var11++;
              }
            }
            this.field_f.field_c = 0;
            this.field_f.field_b = 0;
          } else {
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (RuntimeException) (Object) decompiledCaughtException;
          this.field_f.a((byte) 88);
          ((dl) (var4)).c(param0 ^ -3);
          if (!((dl) (var4)).field_v) {
            return null;
          }
          if (!this.field_f.a(-99)) {
            var4 = this.field_f.a(param0 ^ 125, true, param2, this.field_m, (byte) 2);
            this.field_n.a((lh) (var4), true, (long)param2);
          }
          return null;
        }
        var5[var18.length - 2] = (byte)(this.field_j.field_n[param2] >>> 8);
        var5[-1 + var18.length] = (byte)this.field_j.field_n[param2];
        if (null != this.field_x) {
          this.field_o.a(param0 - 125, param2, this.field_x, var18);
          stackIn_90_0 = this.field_i[param2];
          stackIn_90_1 = 1;
          if (stackIn_90_0 != stackIn_90_1) {
            this.field_i[param2] = (byte) 1;
          }
        }
        if (!((dl) (var4)).field_v) {
          ((dl) (var4)).c(-1);
        }
        return (dl) (var4);
    }

    final void a(boolean param0) {
        int var3 = 0;
        dl discarded$0 = null;
        dl discarded$1 = null;
        int var4 = fleas.field_A ? 1 : 0;
        if (param0) {
          return;
        }
        if (null == this.field_p) {
          return;
        }
        if (this.a(-1712) == null) {
          return;
        }
        lh var2 = this.field_s.c((byte) 47);
        while (var2 != null) {
          var3 = (int)var2.field_c;
          if (var3 < 0) {
            var2.c(-1);
          } else {
            if (this.field_j.field_i <= var3) {
              var2.c(-1);
            } else {
              if (this.field_j.field_f[var3] == 0) {
                var2.c(-1);
              } else {
                if (this.field_i[var3] == 0) {
                  discarded$0 = this.a(2, 1, var3);
                }
                if (this.field_i[var3] == -1) {
                  discarded$1 = this.a(2, 2, var3);
                }
                if (this.field_i[var3] == 1) {
                  var2.c(-1);
                }
              }
            }
          }
          var2 = this.field_s.b((byte) -105);
        }
    }

    final byte[] b(int param0, boolean param1) {
        dl var3 = this.a(2, 0, param0);
        if (var3 == null) {
          return null;
        }
        if (param1) {
          this.field_A = 116;
        }
        byte[] var4 = var3.g(100);
        var3.c(-1);
        return var4;
    }

    public static void b(int param0) {
        field_h = null;
        field_v = null;
        if (param0 != 1) {
          java.math.BigInteger var2 = (java.math.BigInteger) null;
          cg.a((java.math.BigInteger) null, -72, (ni) null, (ni) null, (java.math.BigInteger) null);
        }
    }

    cg(int param0, ah param1, ah param2, w param3, af param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_n = new hc(16);
        this.field_l = 0;
        this.field_s = new vc();
        this.field_w = 0L;
        try {
          this.field_m = param0;
          this.field_x = param1;
          if (this.field_x == null) {
            this.field_t = false;
          } else {
            this.field_t = true;
            this.field_p = new vc();
          }
          this.field_e = param7;
          this.field_u = param6;
          this.field_r = param2;
          stackIn_7_1 = (param8);
          this.field_k = stackIn_7_1;
          this.field_o = param4;
          this.field_f = param3;
          this.field_A = param5;
          if (null != this.field_r) {
            this.field_g = (dl) ((Object) this.field_o.a(this.field_m, this.field_r, true));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = var10;
          stackIn_12_1 = new StringBuilder().append("cg.<init>(").append(param0).append(',');
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
          throw pf.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_v = "Type your email address again to make sure it's correct";
        field_z = 0L;
        field_h = new fh(4, 1, 1, 1);
    }
}
