/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le extends of {
    private kh field_w;
    static int field_y;
    private byte[] field_F;
    static String field_r;
    private ng field_G;
    private im field_v;
    static w[] field_D;
    private int field_q;
    private kh field_H;
    private ad field_I;
    private sf field_p;
    private byte[] field_z;
    static tb field_o;
    private dd field_l;
    private int field_n;
    private int field_x;
    static int field_t;
    private vj field_J;
    private boolean field_u;
    private vj field_k;
    private int field_j;
    static eh field_m;
    static int field_s;
    private boolean field_B;
    static ji field_E;
    private long field_A;
    private boolean field_C;

    final ad a(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = client.field_A ? 1 : 0;
        if (null != this.field_I) {
          return this.field_I;
        }
        if (this.field_p == null) {
          if (this.field_l.a(param0)) {
            return null;
          }
          this.field_p = (sf) ((Object) this.field_l.a(true, (byte) 0, true, 255, this.field_x));
        }
        if (this.field_p.field_z) {
          return null;
        }
        if (!param0) {
          return (ad) null;
        }
        var7 = this.field_p.g((byte) 70);
        var6 = var7;
        var5 = var6;
        var2 = var5;
        if (this.field_p instanceof el) {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_I = new ad(var7, this.field_q, this.field_z);
            if (this.field_n != this.field_I.field_m) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = decompiledCaughtException;
            this.field_I = null;
            if (!this.field_l.a(true)) {
              this.field_p = (sf) ((Object) this.field_l.a(true, (byte) 0, param0, 255, this.field_x));
            } else {
              this.field_p = null;
            }
            return null;
          }
        } else {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_I = new ad(var7, this.field_q, this.field_z);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = decompiledCaughtException;
            this.field_l.a(8192);
            this.field_I = null;
            if (this.field_l.a(true)) {
              this.field_p = null;
            } else {
              this.field_p = (sf) ((Object) this.field_l.a(true, (byte) 0, param0, 255, this.field_x));
            }
            return null;
          }
          if (this.field_H != null) {
            this.field_v.a(this.field_x, this.field_H, var7, (byte) 67);
          }
        }
        if (null != this.field_w) {
          this.field_F = new byte[this.field_I.field_n];
        }
        this.field_p = null;
        return this.field_I;
    }

    public static void b(boolean param0) {
        field_m = null;
        field_D = null;
        field_E = null;
        field_r = null;
        if (!param0) {
          return;
        }
        field_o = null;
    }

    final void b(int param0) {
        int var3 = 0;
        sf discarded$0 = null;
        sf discarded$1 = null;
        int var4 = client.field_A ? 1 : 0;
        if (this.field_J == null) {
          return;
        }
        if (null == this.a(true)) {
          return;
        }
        bh var2 = this.field_k.c((byte) -113);
        while (var2 != null) {
          var3 = (int)var2.field_i;
          if (var3 < 0) {
            var2.b((byte) 105);
          } else {
            if (this.field_I.field_n <= var3) {
              var2.b((byte) 105);
            } else {
              if (this.field_I.field_B[var3] == 0) {
                var2.b((byte) 105);
              } else {
                if (0 == this.field_F[var3]) {
                  discarded$0 = this.a(1, var3, (byte) -20);
                }
                if (-1 == this.field_F[var3]) {
                  discarded$1 = this.a(2, var3, (byte) -20);
                }
                if (this.field_F[var3] == 1) {
                  var2.b((byte) 117);
                }
              }
            }
          }
          var2 = this.field_k.d(true);
        }
        if (param0 != 16322) {
          this.b(-71);
        }
    }

    final int a(int param0, int param1) {
        int var4 = 103 % ((param1 - 5) / 58);
        sf dupTemp$0 = (sf) (this.field_G.a((long)param0, 77));
        sf var5 = dupTemp$0;
        sf var3 = dupTemp$0;
        if (var5 != null) {
          return var5.a(false);
        }
        return 0;
    }

    final void b(byte param0) {
        if (null == this.field_w) {
          return;
        }
        if (param0 != 0) {
          this.field_I = (ad) null;
        }
        this.field_B = true;
        if (this.field_J == null) {
          this.field_J = new vj();
        }
    }

    private final sf a(int param0, int param1, byte param2) {
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
        sf var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        var10 = client.field_A ? 1 : 0;
        sf dupTemp$0 = (sf) (this.field_G.a((long)param1, 95));
        var12 = dupTemp$0;
        var4 = dupTemp$0;
        if (var12 != null &&
          param0 == 0 &&
          !var12.field_D &&
          var12.field_z) {
          var12.b((byte) 114);
          var4 = null;
        }
        if (var4 == null) {
          if (param0 == 0) {
            if (null != this.field_w &&
              this.field_F[param1] != -1) {
              var4 = this.field_v.a(param1, this.field_w, -98);
            } else {
              if (this.field_l.a(true)) {
                return null;
              }
              var4 = this.field_l.a(true, (byte) 2, true, this.field_x, param1);
            }
          } else {
            if (1 == param0) {
              if (null == this.field_w) {
                throw new RuntimeException();
              }
              var4 = this.field_v.a(param1, this.field_w, (byte) 61);
            } else {
              if (param0 != 2) {
                throw new RuntimeException();
              }
              if (null == this.field_w) {
                throw new RuntimeException();
              }
              if (this.field_F[param1] != -1) {
                throw new RuntimeException();
              }
              if (this.field_l.b(0)) {
                return null;
              }
              var4 = this.field_l.a(false, (byte) 2, true, this.field_x, param1);
            }
          }
          this.field_G.a((long)param1, -1, (bh) (var4));
        }
        if (((sf) (var4)).field_z) {
          return null;
        }
        var18 = ((sf) (var4)).g((byte) 79);
        var13 = var18;
        var5 = var13;
        if (param2 != -20) {
          this.field_q = 57;
        }
        if (var4 instanceof el) {
          try {
            if (var5 != null &&
              var18.length > 2) {
              ab.field_c.reset();
              ab.field_c.update(var5, 0, -2 + var18.length);
              var6_int = (int)ab.field_c.getValue();
              if (this.field_I.field_c[param1] != var6_int) {
                throw new RuntimeException();
              }
              if (this.field_I.field_l != null &&
                null != this.field_I.field_l[param1]) {
                var28 = this.field_I.field_l[param1];
                var27 = um.a(0, var5, 0, var18.length - 2);
                for (var9 = 0; 64 > var9; var9++) {
                  if (~var27[var9] != ~var28[var9]) {
                    throw new RuntimeException();
                  }
                }
              }
              var7 = ((var5[var18.length - 2] & 255) << 8) + (var5[var18.length - 1] & 255);
              if ((this.field_I.field_y[param1] & 65535) != var7) {
                throw new RuntimeException();
              }
              if (this.field_F[param1] != 1) {
                if (0 != this.field_F[param1]) {
                }
                this.field_F[param1] = (byte) 1;
              }
              if (!((sf) (var4)).field_D) {
                ((sf) (var4)).b((byte) 115);
              }
              stackIn_60_0 = var4;
              return (sf) (stackIn_60_0);
            }
            throw new RuntimeException();
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            this.field_F[param1] = (byte)-1;
            ((sf) (var4)).b((byte) 119);
            if (!((sf) (var4)).field_D) {
              return null;
            }
            if (!this.field_l.a(true)) {
              var4 = this.field_l.a(true, (byte) 2, true, this.field_x, param1);
              this.field_G.a((long)param1, param2 ^ 19, (bh) (var4));
            }
            return null;
          }
        }
        try {
          if (var5 != null &&
            var18.length > 2) {
            ab.field_c.reset();
            ab.field_c.update(var5, 0, -2 + var18.length);
            var6_int = (int)ab.field_c.getValue();
            if (this.field_I.field_c[param1] != var6_int) {
              throw new RuntimeException();
            }
            if (this.field_I.field_l != null &&
              null != this.field_I.field_l[param1]) {
              var29 = this.field_I.field_l[param1];
              var30 = um.a(0, var5, 0, -2 + var18.length);
              var11 = 0;
              var9 = var11;
              while (var11 < 64) {
                if (~var29[var11] != ~var30[var11]) {
                  throw new RuntimeException();
                }
                var11++;
              }
            }
            this.field_l.field_j = 0;
            this.field_l.field_o = 0;
          } else {
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (RuntimeException) (Object) decompiledCaughtException;
          this.field_l.a(8192);
          ((sf) (var4)).b((byte) 117);
          if (!((sf) (var4)).field_D) {
            return null;
          }
          if (this.field_l.a(true)) {
            return null;
          }
          var4 = this.field_l.a(true, (byte) 2, true, this.field_x, param1);
          this.field_G.a((long)param1, -1, (bh) (var4));
          return null;
        }
        var5[-2 + var18.length] = (byte)(this.field_I.field_y[param1] >>> 8);
        var5[-1 + var18.length] = (byte)this.field_I.field_y[param1];
        if (null != this.field_w) {
          this.field_v.a(param1, this.field_w, var18, (byte) -68);
          if (this.field_F[param1] != 1) {
            this.field_F[param1] = (byte) 1;
          }
        }
        if (!((sf) (var4)).field_D) {
          ((sf) (var4)).b((byte) 117);
        }
        return (sf) (var4);
    }

    final static int b(int param0, int param1) {
        if (param0 != 32085) {
          le.b(false);
        }
        return 500 * ((-1 + param1) * param1);
    }

    final static void a(byte param0, int param1) {
        dk.field_i = param1 * 100 / 150;
        dk.field_c = (param1 << 16) / 150;
        dk.field_g = param1 * 400 / 150;
        int var2 = 101 % ((8 - param0) / 52);
    }

    final void c(boolean param0) {
        sf discarded$3 = null;
        sf discarded$2 = null;
        sf discarded$1 = null;
        sf discarded$0 = null;
        int var2_int;
        sf var2;
        bh var3;
        int var4;
        int var5;
        bh var6;
        bh var7;
        int var2_intLifetime1;
        int var4Lifetime1;
        bh var3Lifetime1;
        var5 = client.field_A ? 1 : 0;
        if (!param0) {
          this.c(false);
        }
        boolean decompiledFrameRemainder0 = true;
        if (null != this.field_J) {
          if (null == this.a(param0)) {
            return;
          }
          if (this.field_u) {
            var2_int = 1;
            var3 = this.field_J.c((byte) 54);
            while (var3 != null) {
              var4 = (int)var3.field_i;
              if (this.field_F[var4] == 0) {
                discarded$3 = this.a(1, var4, (byte) -20);
              }
              if (this.field_F[var4] != 0) {
                var3.b((byte) 121);
              } else {
                var2_int = 0;
              }
              var3 = this.field_J.d(true);
            }
            L11: while (true) {
              if (this.field_j < this.field_I.field_B.length) {
                if (0 != this.field_I.field_B[this.field_j]) {
                  if (this.field_v.field_b >= 250) {
                    var2_int = 0;
                    break L11;
                  }
                  if (this.field_F[this.field_j] == 0) {
                    discarded$2 = this.a(1, this.field_j, (byte) -20);
                  }
                  if (0 == this.field_F[this.field_j]) {
                    var6 = new bh();
                    var6.field_i = (long)this.field_j;
                    this.field_J.a(var6, 2777);
                    var2_int = 0;
                  }
                }
                this.field_j = this.field_j + 1;
                continue;
              }
              break;
            }
            if ((var2_int != 0)) {
              this.field_j = 0;
              this.field_u = false;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_B) {
              var2_intLifetime1 = 1;
              var3Lifetime1 = this.field_J.c((byte) 77);
              while (var3Lifetime1 != null) {
                var4Lifetime1 = (int)var3Lifetime1.field_i;
                if (1 != this.field_F[var4Lifetime1]) {
                  discarded$1 = this.a(2, var4Lifetime1, (byte) -20);
                }
                if (this.field_F[var4Lifetime1] != 1) {
                  var2_intLifetime1 = 0;
                } else {
                  var3Lifetime1.b((byte) 102);
                }
                var3Lifetime1 = this.field_J.d(true);
              }
              L4: while (true) {
                if (this.field_j < this.field_I.field_B.length) {
                  if (this.field_I.field_B[this.field_j] != 0) {
                    if (this.field_l.b(0)) {
                      var2_intLifetime1 = 0;
                      break L4;
                    }
                    if (this.field_F[this.field_j] != 1) {
                      discarded$0 = this.a(2, this.field_j, (byte) -20);
                    }
                    if (1 != this.field_F[this.field_j]) {
                      var7 = new bh();
                      var7.field_i = (long)this.field_j;
                      this.field_J.a(var7, 2777);
                      var2_intLifetime1 = 0;
                    }
                  }
                  this.field_j = this.field_j + 1;
                  continue;
                }
                break;
              }
              if ((var2_intLifetime1 != 0)) {
                this.field_j = 0;
                this.field_B = false;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_J = null;
            }
          }
        }
        if (this.field_C &&
          ik.a(4) >= this.field_A) {
          var2 = (sf) (this.field_G.a((byte) 126));
          while (var2 != null) {
            if (!var2.field_z) {
              if (var2.field_A) {
                if (!var2.field_D) {
                  throw new RuntimeException();
                }
                var2.b((byte) 101);
              } else {
                var2.field_A = true;
              }
            }
            var2 = (sf) (this.field_G.b((byte) 107));
          }
          this.field_A = ik.a(4) + 1000L;
        }
    }

    final byte[] a(int param0, byte param1) {
        sf var3 = this.a(0, param0, (byte) -20);
        if (var3 == null) {
          return null;
        }
        byte[] var4 = var3.g((byte) 126);
        var3.b((byte) 107);
        if (param1 != 91) {
          return (byte[]) null;
        }
        return var4;
    }

    le(int param0, kh param1, kh param2, dd param3, im param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_G = new ng(16);
        this.field_j = 0;
        this.field_k = new vj();
        this.field_A = 0L;
        try {
          this.field_w = param1;
          this.field_x = param0;
          if (null != this.field_w) {
            this.field_u = true;
            this.field_J = new vj();
          } else {
            this.field_u = false;
          }
          this.field_q = param5;
          this.field_l = param3;
          stackIn_7_1 = (param8);
          this.field_C = stackIn_7_1;
          this.field_z = param6;
          this.field_H = param2;
          this.field_n = param7;
          this.field_v = param4;
          if (null != this.field_H) {
            this.field_p = (sf) ((Object) this.field_v.a(this.field_x, this.field_H, -36));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = var10;
          stackIn_12_1 = new StringBuilder().append("le.<init>(").append(param0).append(',');
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
          throw dh.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_r = "No highscores";
        field_o = new tb();
    }
}
