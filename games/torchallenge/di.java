/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di extends kl {
    private rb field_y;
    private int field_s;
    static ka[] field_t;
    private vb field_G;
    private la field_v;
    private sh field_u;
    private int field_z;
    private int field_l;
    private byte[] field_k;
    private byte[] field_i;
    private tf field_C;
    static vi field_g;
    static int field_A;
    static byte[][] field_E;
    private ha field_j;
    private la field_o;
    static char field_m;
    private boolean field_q;
    private sl field_D;
    private boolean field_h;
    private int field_r;
    static k field_F;
    static String field_B;
    static String field_n;
    private sl field_w;
    private boolean field_x;
    private long field_p;

    final tf b(int param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = TorChallenge.field_F ? 1 : 0;
        if (param0 != 0) {
          field_g = (vi) null;
        }
        if (null != this.field_C) {
          return this.field_C;
        }
        if (this.field_u == null) {
          if (this.field_G.b((byte) 100)) {
            return null;
          }
          this.field_u = (sh) ((Object) this.field_G.a(true, 255, this.field_z, (byte) 0, param0 + 63));
        }
        if (this.field_u.field_v) {
          return null;
        }
        var7 = this.field_u.e(2);
        var6 = var7;
        var5 = var6;
        var2 = var5;
        if (this.field_u instanceof al) {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_C = new tf(var7, this.field_l, this.field_i);
            if (this.field_s != this.field_C.field_b) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = decompiledCaughtException;
            this.field_C = null;
            if (!this.field_G.b((byte) 100)) {
              this.field_u = (sh) ((Object) this.field_G.a(true, 255, this.field_z, (byte) 0, 75));
            } else {
              this.field_u = null;
            }
            return null;
          }
        } else {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_C = new tf(var7, this.field_l, this.field_i);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = decompiledCaughtException;
            this.field_G.c(-30317);
            this.field_C = null;
            if (!this.field_G.b((byte) 100)) {
              this.field_u = (sh) ((Object) this.field_G.a(true, 255, this.field_z, (byte) 0, 90));
            } else {
              this.field_u = null;
            }
            return null;
          }
          if (null != this.field_o) {
            this.field_y.a(this.field_z, this.field_o, (byte) 111, var7);
          }
        }
        this.field_u = null;
        if (this.field_v != null) {
          this.field_k = new byte[this.field_C.field_r];
        }
        return this.field_C;
    }

    private final sh a(int param0, int param1, boolean param2) {
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
        sh var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        var10 = TorChallenge.field_F ? 1 : 0;
        var12 = (sh) (this.field_j.a((byte) 112, (long)param0));
        var4 = var12;
        if (var12 != null &&
          param1 == 0 &&
          !var12.field_s &&
          var12.field_v) {
          var12.a(true);
          var4 = null;
        }
        if (var4 == null) {
          if (param1 != 0) {
            if (1 == param1) {
              if (null == this.field_v) {
                throw new RuntimeException();
              }
              var4 = this.field_y.a(param0, 3, this.field_v);
            } else {
              if (2 != param1) {
                throw new RuntimeException();
              }
              if (this.field_v == null) {
                throw new RuntimeException();
              }
              if (-1 != this.field_k[param0]) {
                throw new RuntimeException();
              }
              if (this.field_G.a(true)) {
                return null;
              }
              var4 = this.field_G.a(false, this.field_z, param0, (byte) 2, 60);
            }
          } else {
            if (this.field_v != null &&
              this.field_k[param0] != -1) {
              var4 = this.field_y.a(this.field_v, true, param0);
            } else {
              if (this.field_G.b((byte) 100)) {
                return null;
              }
              var4 = this.field_G.a(true, this.field_z, param0, (byte) 2, 92);
            }
          }
          this.field_j.a(-111, (da) (var4), (long)param0);
        }
        if (param2) {
          this.field_q = true;
        }
        if (((sh) (var4)).field_v) {
          return null;
        }
        var18 = ((sh) (var4)).e(2);
        var13 = var18;
        var5 = var13;
        if (var4 instanceof al) {
          try {
            if (var5 != null &&
              2 < var18.length) {
              vc.field_c.reset();
              vc.field_c.update(var5, 0, var18.length - 2);
              var6_int = (int)vc.field_c.getValue();
              if (this.field_C.field_t[param0] != var6_int) {
                throw new RuntimeException();
              }
              if (this.field_C.field_n != null &&
                null != this.field_C.field_n[param0]) {
                var27 = this.field_C.field_n[param0];
                var28 = qc.a(var5, var18.length - 2, (byte) -117, 0);
                for (var9 = 0; var9 < 64; var9++) {
                  if (var27[var9] != var28[var9]) {
                    throw new RuntimeException();
                  }
                }
              }
              var7 = (65280 & var5[-2 + var18.length] << 8) + (var5[var18.length - 1] & 255);
              if (var7 != (this.field_C.field_d[param0] & 65535)) {
                throw new RuntimeException();
              }
              if (this.field_k[param0] != 1) {
                if (this.field_k[param0] != 0) {
                }
                this.field_k[param0] = (byte) 1;
              }
              if (!((sh) (var4)).field_s) {
                ((sh) (var4)).a(true);
              }
              stackIn_60_0 = var4;
              return (sh) (stackIn_60_0);
            }
            throw new RuntimeException();
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            this.field_k[param0] = (byte)-1;
            ((sh) (var4)).a(true);
            if (!((sh) (var4)).field_s) {
              return null;
            }
            if (!this.field_G.b((byte) 100)) {
              var4 = this.field_G.a(true, this.field_z, param0, (byte) 2, 79);
              this.field_j.a(-100, (da) (var4), (long)param0);
            }
            return null;
          }
        }
        try {
          if (var5 != null &&
            var18.length > 2) {
            vc.field_c.reset();
            vc.field_c.update(var5, 0, -2 + var18.length);
            var6_int = (int)vc.field_c.getValue();
            if (this.field_C.field_t[param0] != var6_int) {
              throw new RuntimeException();
            }
            if (null != this.field_C.field_n &&
              null != this.field_C.field_n[param0]) {
              var29 = this.field_C.field_n[param0];
              var30 = qc.a(var5, -2 + var18.length, (byte) -82, 0);
              var11 = 0;
              var9 = var11;
              while (var11 < 64) {
                if (~var29[var11] != ~var30[var11]) {
                  throw new RuntimeException();
                }
                var11++;
              }
            }
            this.field_G.field_h = 0;
            this.field_G.field_b = 0;
          } else {
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (RuntimeException) (Object) decompiledCaughtException;
          this.field_G.c(-30317);
          ((sh) (var4)).a(true);
          if (((sh) (var4)).field_s) {
            if (this.field_G.b((byte) 100)) {
              return null;
            }
            var4 = this.field_G.a(true, this.field_z, param0, (byte) 2, 108);
            this.field_j.a(47, (da) (var4), (long)param0);
          }
          return null;
        }
        var5[-2 + var18.length] = (byte)(this.field_C.field_d[param0] >>> 8);
        var5[-1 + var18.length] = (byte)this.field_C.field_d[param0];
        if (null != this.field_v) {
          this.field_y.a(param0, this.field_v, (byte) 111, var18);
          if (this.field_k[param0] != 1) {
            this.field_k[param0] = (byte) 1;
          }
        }
        if (!((sh) (var4)).field_s) {
          ((sh) (var4)).a(true);
        }
        return (sh) (var4);
    }

    final void d(int param0) {
        if (param0 != 14) {
          this.a(-90, -21);
        }
        if (null == this.field_v) {
          return;
        }
        this.field_h = true;
        if (this.field_D == null) {
          this.field_D = new sl();
        }
    }

    final byte[] a(int param0, byte param1) {
        sh var3 = this.a(param0, 0, false);
        if (var3 == null) {
          return null;
        }
        if (param1 != -72) {
          di.a(true);
        }
        byte[] var4 = var3.e(param1 + 74);
        var3.a(true);
        return var4;
    }

    final void c(int param0) {
        sh discarded$3 = null;
        sh discarded$2 = null;
        sh discarded$1 = null;
        sh discarded$0 = null;
        int var2_int;
        sh var2;
        da var3;
        int var4;
        int var5;
        da var6;
        da var7;
        int var2_intLifetime1;
        int var4Lifetime1;
        da var3Lifetime1;
        var5 = TorChallenge.field_F ? 1 : 0;
        if (param0 > -43) {
          this.a(92, (byte) -25);
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_D != null) {
          if (null == this.b(0)) {
            return;
          }
          if (this.field_q) {
            var2_int = 1;
            var3 = this.field_D.c((byte) 114);
            while (var3 != null) {
              var4 = (int)var3.field_d;
              if (0 == this.field_k[var4]) {
                discarded$3 = this.a(var4, 1, false);
              }
              if (this.field_k[var4] != 0) {
                var3.a(true);
              } else {
                var2_int = 0;
              }
              var3 = this.field_D.c(-270);
            }
            while (this.field_C.field_e.length > this.field_r) {
              if (this.field_C.field_e[this.field_r] == 0) {
                this.field_r = this.field_r + 1;
                continue;
              }
              if (250 > this.field_y.field_e) {
                if (0 == this.field_k[this.field_r]) {
                  discarded$2 = this.a(this.field_r, 1, false);
                }
                if (0 == this.field_k[this.field_r]) {
                  var6 = new da();
                  var6.field_d = (long)this.field_r;
                  var2_int = 0;
                  this.field_D.a(var6, -36);
                }
                this.field_r = this.field_r + 1;
                continue;
              }
              var2_int = 0;
              break;
            }
            if ((var2_int != 0)) {
              this.field_q = false;
              this.field_r = 0;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_h) {
              var2_intLifetime1 = 1;
              var3Lifetime1 = this.field_D.c((byte) 123);
              while (var3Lifetime1 != null) {
                var4Lifetime1 = (int)var3Lifetime1.field_d;
                if (this.field_k[var4Lifetime1] != 1) {
                  discarded$1 = this.a(var4Lifetime1, 2, false);
                }
                if (this.field_k[var4Lifetime1] != 1) {
                  var2_intLifetime1 = 0;
                } else {
                  var3Lifetime1.a(true);
                }
                var3Lifetime1 = this.field_D.c(-270);
              }
              L4: while (true) {
                if (this.field_C.field_e.length > this.field_r) {
                  if (this.field_C.field_e[this.field_r] != 0) {
                    if (this.field_G.a(true)) {
                      var2_intLifetime1 = 0;
                      break L4;
                    }
                    if (this.field_k[this.field_r] != 1) {
                      discarded$0 = this.a(this.field_r, 2, false);
                    }
                    if (this.field_k[this.field_r] != 1) {
                      var7 = new da();
                      var7.field_d = (long)this.field_r;
                      this.field_D.a(var7, -62);
                      var2_intLifetime1 = 0;
                    }
                  }
                  this.field_r = this.field_r + 1;
                  continue;
                }
                break;
              }
              if ((var2_intLifetime1 != 0)) {
                this.field_r = 0;
                this.field_h = false;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_D = null;
            }
          }
        }
        if (this.field_x &&
          this.field_p <= ol.a(256)) {
          var2 = (sh) (this.field_j.a((byte) -73));
          while (var2 != null) {
            if (!var2.field_v) {
              if (!var2.field_p) {
                var2.field_p = true;
              } else {
                if (!var2.field_s) {
                  throw new RuntimeException();
                }
                var2.a(true);
              }
            }
            var2 = (sh) (this.field_j.a(-27377));
          }
          this.field_p = ol.a(256) + 1000L;
        }
    }

    public static void a(boolean param0) {
        field_g = null;
        if (param0) {
          return;
        }
        field_B = null;
        field_t = null;
        field_n = null;
        field_F = null;
        field_E = (byte[][]) null;
    }

    final void a(byte param0) {
        sh discarded$0 = null;
        sh discarded$1 = null;
        da var2;
        int var3;
        int var4;
        var4 = TorChallenge.field_F ? 1 : 0;
        if (null == this.field_D) {
          return;
        }
        if (this.b(0) == null) {
          return;
        }
        if (param0 >= -107) {
          this.field_p = 74L;
        }
        var2 = this.field_w.c((byte) -61);
        while (var2 != null) {
          var3 = (int)var2.field_d;
          if (var3 >= 0) {
            if (this.field_C.field_r > var3) {
              if (this.field_C.field_e[var3] == 0) {
                var2.a(true);
              } else {
                if (this.field_k[var3] == 0) {
                  discarded$0 = this.a(var3, 1, false);
                }
                if (this.field_k[var3] == -1) {
                  discarded$1 = this.a(var3, 2, false);
                }
                if (this.field_k[var3] == 1) {
                  var2.a(true);
                }
              }
            } else {
              var2.a(true);
            }
          } else {
            var2.a(true);
          }
          var2 = this.field_w.c(-270);
        }
    }

    final int a(int param0, int param1) {
        sh var3 = (sh) (this.field_j.a((byte) 91, (long)param1));
        if (param0 != 0) {
          this.b(124);
        }
        if (var3 != null) {
          return var3.f(100);
        }
        return 0;
    }

    di(int param0, la param1, la param2, vb param3, rb param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_j = new ha(16);
        this.field_r = 0;
        this.field_w = new sl();
        this.field_p = 0L;
        try {
          this.field_v = param1;
          this.field_z = param0;
          if (null != this.field_v) {
            this.field_q = true;
            this.field_D = new sl();
          } else {
            this.field_q = false;
          }
          this.field_s = param7;
          stackIn_7_1 = (param8);
          this.field_x = stackIn_7_1;
          this.field_o = param2;
          this.field_i = param6;
          this.field_G = param3;
          this.field_y = param4;
          this.field_l = param5;
          if (null != this.field_o) {
            this.field_u = (sh) ((Object) this.field_y.a(this.field_o, true, this.field_z));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = var10;
          stackIn_12_1 = new StringBuilder().append("di.<init>(").append(param0).append(',');
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
          throw oj.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_E = new byte[1000][];
        field_g = new vi();
        field_F = new k(14, 0, 4, 1);
        field_B = " - Not available to this monk.";
        field_n = "achievements to collect";
    }
}
