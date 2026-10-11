/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc extends wf {
    private gi field_h;
    static String field_z;
    private int field_A;
    private int field_g;
    private int field_E;
    static String field_l;
    private byte[] field_w;
    static int field_y;
    static pb field_s;
    private gi field_j;
    private ki field_o;
    private byte[] field_B;
    private rk field_r;
    static boolean[] field_x;
    private uh field_f;
    static java.awt.Image field_C;
    private lh field_k;
    static String field_p;
    private fb field_q;
    private int field_m;
    private oj field_v;
    private boolean field_t;
    private oj field_u;
    private boolean field_i;
    private long field_D;
    private boolean field_n;

    private final ki a(int param0, int param1, int param2) {
        Object stackIn_58_0 = null;
        int stackIn_90_0 = 0;
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
        ki var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        var10 = stellarshard.field_B;
        if (param0 != -28529) {
          this.field_f = (uh) null;
        }
        var12 = (ki) (this.field_f.a((long)param1, param0 + 28538));
        var4 = var12;
        if (var12 != null &&
          param2 == 0 &&
          !var12.field_u &&
          var12.field_w) {
          var12.c(20);
          var4 = null;
        }
        if (var4 == null) {
          if (param2 != 0) {
            if (param2 != 1) {
              if (param2 != 2) {
                throw new RuntimeException();
              }
              if (this.field_h == null) {
                throw new RuntimeException();
              }
              if (this.field_B[param1] != -1) {
                throw new RuntimeException();
              }
              if (this.field_q.e(-88)) {
                return null;
              }
              var4 = this.field_q.a((byte) 2, param1, false, this.field_g, true);
            } else {
              if (null == this.field_h) {
                throw new RuntimeException();
              }
              var4 = this.field_r.a(this.field_h, 3, param1);
            }
          } else {
            if (null != this.field_h &&
              this.field_B[param1] != -1) {
              var4 = this.field_r.a(this.field_h, (byte) 90, param1);
            } else {
              if (this.field_q.d(2)) {
                return null;
              }
              var4 = this.field_q.a((byte) 2, param1, true, this.field_g, true);
            }
          }
          this.field_f.a((gg) (var4), (long)param1, 1);
        }
        if (((ki) (var4)).field_w) {
          return null;
        }
        var18 = ((ki) (var4)).g(-27203);
        var13 = var18;
        var5 = var13;
        if (var4 instanceof el) {
          try {
            if (var5 != null &&
              var18.length > 2) {
              nj.field_q.reset();
              nj.field_q.update(var5, 0, -2 + var18.length);
              var6_int = (int)nj.field_q.getValue();
              if (var6_int != this.field_k.field_l[param1]) {
                throw new RuntimeException();
              }
              if (this.field_k.field_h != null &&
                this.field_k.field_h[param1] != null) {
                var27 = this.field_k.field_h[param1];
                var28 = bc.a(0, 0, -2 + var18.length, var18);
                for (var9 = 0; var9 < 64; var9++) {
                  if (~var27[var9] != ~var28[var9]) {
                    throw new RuntimeException();
                  }
                }
              }
              var7 = (65280 & var5[-2 + var18.length] << 8) + (var5[var18.length - 1] & 255);
              if (var7 != (65535 & this.field_k.field_j[param1])) {
                throw new RuntimeException();
              }
              if (this.field_B[param1] != 1) {
                if (this.field_B[param1] != 0) {
                }
                this.field_B[param1] = (byte) 1;
              }
              if (!((ki) (var4)).field_u) {
                ((ki) (var4)).c(20);
              }
              stackIn_58_0 = var4;
              return (ki) (stackIn_58_0);
            }
            throw new RuntimeException();
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            this.field_B[param1] = (byte)-1;
            ((ki) (var4)).c(20);
            if (!((ki) (var4)).field_u) {
              return null;
            }
            if (this.field_q.d(2)) {
              return null;
            }
            var4 = this.field_q.a((byte) 2, param1, true, this.field_g, true);
            this.field_f.a((gg) (var4), (long)param1, 1);
            return null;
          }
        }
        try {
          if (var5 != null &&
            2 < var18.length) {
            nj.field_q.reset();
            nj.field_q.update(var5, 0, var18.length - 2);
            var6_int = (int)nj.field_q.getValue();
            if (var6_int != this.field_k.field_l[param1]) {
              throw new RuntimeException();
            }
            if (null != this.field_k.field_h &&
              null != this.field_k.field_h[param1]) {
              var30 = this.field_k.field_h[param1];
              var29 = bc.a(param0 + 28529, 0, var18.length - 2, var18);
              var11 = 0;
              var9 = var11;
              while (var11 < 64) {
                if (~var29[var11] != ~var30[var11]) {
                  throw new RuntimeException();
                }
                var11++;
              }
            }
            this.field_q.field_i = 0;
            this.field_q.field_g = 0;
          } else {
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (RuntimeException) (Object) decompiledCaughtException;
          this.field_q.b(-116);
          ((ki) (var4)).c(param0 + 28549);
          if (!((ki) (var4)).field_u) {
            return null;
          }
          if (!this.field_q.d(2)) {
            var4 = this.field_q.a((byte) 2, param1, true, this.field_g, true);
            this.field_f.a((gg) (var4), (long)param1, 1);
          }
          return null;
        }
        var5[-2 + var18.length] = (byte)(this.field_k.field_j[param1] >>> 8);
        var5[-1 + var18.length] = (byte)this.field_k.field_j[param1];
        if (null != this.field_h) {
          this.field_r.a(this.field_h, -115, param1, var18);
          stackIn_90_0 = ~this.field_B[param1];
          stackIn_90_1 = -2;
          if (stackIn_90_0 != stackIn_90_1) {
            this.field_B[param1] = (byte) 1;
          }
        }
        if (!((ki) (var4)).field_u) {
          ((ki) (var4)).c(20);
        }
        return (ki) (var4);
    }

    final void c(int param0) {
        int var3 = 0;
        ki discarded$0 = null;
        ki discarded$1 = null;
        int var4 = stellarshard.field_B;
        if (this.field_v == null) {
          return;
        }
        if (null == this.a(-100)) {
          return;
        }
        if (param0 != 13596) {
          this.field_j = (gi) null;
        }
        gg var2 = this.field_u.b(-84);
        while (var2 != null) {
          var3 = (int)var2.field_j;
          if (var3 < 0) {
            var2.c(20);
          } else {
            if (var3 >= this.field_k.field_e) {
              var2.c(20);
            } else {
              if (this.field_k.field_p[var3] == 0) {
                var2.c(20);
              } else {
                if (0 == this.field_B[var3]) {
                  discarded$0 = this.a(-28529, var3, 1);
                }
                if (this.field_B[var3] == -1) {
                  discarded$1 = this.a(-28529, var3, 2);
                }
                if (this.field_B[var3] == 1) {
                  var2.c(20);
                }
              }
            }
          }
          var2 = this.field_u.b((byte) 65);
        }
    }

    final lh a(int param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = stellarshard.field_B;
        if (null != this.field_k) {
          return this.field_k;
        }
        if (this.field_o == null) {
          if (this.field_q.d(2)) {
            return null;
          }
          this.field_o = (ki) ((Object) this.field_q.a((byte) 0, this.field_g, true, 255, true));
        }
        if (this.field_o.field_w) {
          return null;
        }
        var7 = this.field_o.g(-27203);
        var6 = var7;
        var5 = var6;
        var2 = var5;
        if (!(this.field_o instanceof el)) {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_k = new lh(var7, this.field_A, this.field_w);
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = decompiledCaughtException;
            this.field_q.b(-127);
            this.field_k = null;
            if (!this.field_q.d(2)) {
              this.field_o = (ki) ((Object) this.field_q.a((byte) 0, this.field_g, true, 255, true));
            } else {
              this.field_o = null;
            }
            return null;
          }
          if (this.field_j != null) {
            this.field_r.a(this.field_j, 106, this.field_g, var7);
          }
        } else {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_k = new lh(var7, this.field_A, this.field_w);
            if (this.field_k.field_r != this.field_E) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = decompiledCaughtException;
            this.field_k = null;
            if (this.field_q.d(2)) {
              this.field_o = null;
            } else {
              this.field_o = (ki) ((Object) this.field_q.a((byte) 0, this.field_g, true, 255, true));
            }
            return null;
          }
        }
        this.field_o = null;
        if (param0 > -8) {
          wc.a(false);
        }
        if (null != this.field_h) {
          this.field_B = new byte[this.field_k.field_e];
        }
        return this.field_k;
    }

    final void d(int param0) {
        if (this.field_h == null) {
          return;
        }
        this.field_i = true;
        if (null == this.field_v) {
          this.field_v = new oj();
        }
        if (param0 != 2) {
          this.d(49);
        }
    }

    final byte[] a(byte param0, int param1) {
        ki var3 = this.a(-28529, param1, 0);
        if (var3 == null) {
          return null;
        }
        byte[] var4 = var3.g(-27203);
        var3.c(20);
        if (param0 != 35) {
          this.c(-36);
        }
        return var4;
    }

    final int a(int param0, int param1) {
        ki var3 = (ki) (this.field_f.a((long)param1, 36));
        if (param0 != 0) {
          this.field_g = -63;
        }
        if (var3 == null) {
          return 0;
        }
        return var3.a(true);
    }

    public static void a(boolean param0) {
        if (!param0) {
          field_s = (pb) null;
        }
        field_l = null;
        field_C = null;
        field_s = null;
        field_p = null;
        field_z = null;
        field_x = null;
    }

    final void b(boolean param0) {
        ki discarded$3 = null;
        ki discarded$2 = null;
        ki discarded$1 = null;
        ki discarded$0 = null;
        int var2_int;
        ki var2;
        gg var3;
        int var4;
        int var5;
        gg var6;
        gg var7;
        int var2_intLifetime1;
        int var4Lifetime1;
        gg var3Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        var5 = stellarshard.field_B;
        if (this.field_v != null) {
          if (null == this.a(-94)) {
            return;
          }
          if (this.field_t) {
            var2_int = 1;
            var3 = this.field_v.b(-87);
            while (var3 != null) {
              var4 = (int)var3.field_j;
              if (this.field_B[var4] == 0) {
                discarded$3 = this.a(-28529, var4, 1);
              }
              if (this.field_B[var4] != 0) {
                var3.c(20);
              } else {
                var2_int = 0;
              }
              var3 = this.field_v.b((byte) -113);
            }
            L10: while (true) {
              if (this.field_k.field_p.length > this.field_m) {
                if (this.field_k.field_p[this.field_m] != 0) {
                  if (250 <= this.field_r.field_e) {
                    var2_int = 0;
                    break L10;
                  }
                  if (this.field_B[this.field_m] == 0) {
                    discarded$2 = this.a(-28529, this.field_m, 1);
                  }
                  if (0 == this.field_B[this.field_m]) {
                    var6 = new gg();
                    var6.field_j = (long)this.field_m;
                    var2_int = 0;
                    this.field_v.b(-93, var6);
                  }
                }
                this.field_m = this.field_m + 1;
                continue;
              }
              break;
            }
            if ((var2_int != 0)) {
              this.field_m = 0;
              this.field_t = false;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_i) {
              var2_intLifetime1 = 1;
              var3Lifetime1 = this.field_v.b(-125);
              while (var3Lifetime1 != null) {
                var4Lifetime1 = (int)var3Lifetime1.field_j;
                if (this.field_B[var4Lifetime1] != 1) {
                  discarded$1 = this.a(-28529, var4Lifetime1, 2);
                }
                if (this.field_B[var4Lifetime1] != 1) {
                  var2_intLifetime1 = 0;
                } else {
                  var3Lifetime1.c(20);
                }
                var3Lifetime1 = this.field_v.b((byte) -44);
              }
              L3: while (true) {
                if (this.field_m < this.field_k.field_p.length) {
                  if (this.field_k.field_p[this.field_m] != 0) {
                    if (this.field_q.e(-105)) {
                      var2_intLifetime1 = 0;
                      break L3;
                    }
                    if (this.field_B[this.field_m] != 1) {
                      discarded$0 = this.a(-28529, this.field_m, 2);
                    }
                    if (this.field_B[this.field_m] != 1) {
                      var7 = new gg();
                      var7.field_j = (long)this.field_m;
                      var2_intLifetime1 = 0;
                      this.field_v.b(-80, var7);
                    }
                  }
                  this.field_m = this.field_m + 1;
                  continue;
                }
                break;
              }
              if ((var2_intLifetime1 != 0)) {
                this.field_m = 0;
                this.field_i = false;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_v = null;
            }
          }
        }
        if (param0) {
          return;
        }
        if (this.field_n &&
          ih.a((byte) -98) >= this.field_D) {
          var2 = (ki) (this.field_f.a((byte) 104));
          while (var2 != null) {
            if (!var2.field_w) {
              if (var2.field_y) {
                if (!var2.field_u) {
                  throw new RuntimeException();
                }
                var2.c(20);
              } else {
                var2.field_y = true;
              }
            }
            var2 = (ki) (this.field_f.b((byte) 118));
          }
          this.field_D = 1000L + ih.a((byte) -98);
        }
    }

    wc(int param0, gi param1, gi param2, fb param3, rk param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_f = new uh(16);
        this.field_m = 0;
        this.field_u = new oj();
        this.field_D = 0L;
        try {
          this.field_g = param0;
          this.field_h = param1;
          if (this.field_h == null) {
            this.field_t = false;
          } else {
            this.field_t = true;
            this.field_v = new oj();
          }
          this.field_E = param7;
          this.field_A = param5;
          this.field_j = param2;
          stackIn_7_1 = (param8);
          this.field_n = stackIn_7_1;
          this.field_w = param6;
          this.field_q = param3;
          this.field_r = param4;
          if (null != this.field_j) {
            this.field_o = (ki) ((Object) this.field_r.a(this.field_j, (byte) 101, this.field_g));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = var10;
          stackIn_12_1 = new StringBuilder().append("wc.<init>(").append(param0).append(',');
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
          throw ma.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_z = "Quit to website";
        field_x = new boolean[64];
        field_l = " of 50<br>Current score : ";
        field_p = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
