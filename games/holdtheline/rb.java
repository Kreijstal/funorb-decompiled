/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb extends ff {
    static int field_m;
    private int field_k;
    static float field_g;
    private og field_w;
    private byte[] field_z;
    private qb field_n;
    private int field_h;
    private ca field_s;
    private sk field_y;
    private byte[] field_o;
    private int field_q;
    private sk field_d;
    private kn field_v;
    static int field_x;
    static int[] field_p;
    private wj field_A;
    private int field_l;
    private boolean field_e;
    static int field_t;
    private ah field_j;
    private boolean field_f;
    private ah field_r;
    static String field_B;
    private long field_i;
    private boolean field_u;

    private final ca a(int param0, int param1, int param2) {
        Object stackIn_58_0 = null;
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
        ca var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        var10 = HoldTheLine.field_D;
        var12 = (ca) (this.field_w.a((byte) 122, (long)param2));
        var4 = var12;
        if (param1 < 48) {
          this.field_z = (byte[]) null;
        }
        if (var12 != null &&
          param0 == 0 &&
          !var12.field_t &&
          var12.field_u) {
          var12.d(0);
          var4 = null;
        }
        if (var4 == null) {
          if (param0 == 0) {
            if (this.field_d != null &&
              -1 != this.field_o[param2]) {
              var4 = this.field_n.a(this.field_d, -18017, param2);
            } else {
              if (this.field_A.c(92)) {
                return null;
              }
              var4 = this.field_A.a(param2, true, (byte) 2, (byte) -60, this.field_q);
            }
          } else {
            if (param0 != 1) {
              if (param0 != 2) {
                throw new RuntimeException();
              }
              if (null == this.field_d) {
                throw new RuntimeException();
              }
              if (this.field_o[param2] != -1) {
                throw new RuntimeException();
              }
              if (this.field_A.d(20)) {
                return null;
              }
              var4 = this.field_A.a(param2, false, (byte) 2, (byte) -60, this.field_q);
            } else {
              if (null == this.field_d) {
                throw new RuntimeException();
              }
              var4 = this.field_n.a(3, this.field_d, param2);
            }
          }
          this.field_w.a((hl) (var4), (long)param2, false);
        }
        if (((ca) (var4)).field_u) {
          return null;
        }
        var18 = ((ca) (var4)).i(-20324);
        var13 = var18;
        var5 = var13;
        if (var4 instanceof bk) {
          try {
            if (var5 != null &&
              2 < var18.length) {
              te.field_a.reset();
              te.field_a.update(var5, 0, -2 + var18.length);
              var6_int = (int)te.field_a.getValue();
              if (this.field_v.field_e[param2] != var6_int) {
                throw new RuntimeException();
              }
              if (null != this.field_v.field_g &&
                null != this.field_v.field_g[param2]) {
                var28 = this.field_v.field_g[param2];
                var27 = wc.a(var5, -6408, 0, var18.length - 2);
                for (var9 = 0; var9 < 64; var9++) {
                  if (~var27[var9] != ~var28[var9]) {
                    throw new RuntimeException();
                  }
                }
              }
              var7 = (var5[-1 + var18.length] & 255) + (65280 & var5[var18.length - 2] << 8);
              if ((this.field_v.field_p[param2] & 65535) != var7) {
                throw new RuntimeException();
              }
              if (this.field_o[param2] != 1) {
                if (this.field_o[param2] == 0) {
                }
                this.field_o[param2] = (byte) 1;
              }
              if (!((ca) (var4)).field_t) {
                ((ca) (var4)).d(0);
              }
              stackIn_58_0 = var4;
              return (ca) (stackIn_58_0);
            }
            throw new RuntimeException();
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            this.field_o[param2] = (byte)-1;
            ((ca) (var4)).d(0);
            if (!((ca) (var4)).field_t) {
              return null;
            }
            if (!this.field_A.c(104)) {
              var4 = this.field_A.a(param2, true, (byte) 2, (byte) -60, this.field_q);
              this.field_w.a((hl) (var4), (long)param2, false);
            }
            return null;
          }
        }
        try {
          if (var5 != null &&
            var18.length > 2) {
            te.field_a.reset();
            te.field_a.update(var5, 0, -2 + var18.length);
            var6_int = (int)te.field_a.getValue();
            if (this.field_v.field_e[param2] != var6_int) {
              throw new RuntimeException();
            }
            if (null != this.field_v.field_g &&
              null != this.field_v.field_g[param2]) {
              var29 = this.field_v.field_g[param2];
              var30 = wc.a(var5, -6408, 0, -2 + var18.length);
              var11 = 0;
              var9 = var11;
              while (var11 < 64) {
                if (var29[var11] != var30[var11]) {
                  throw new RuntimeException();
                }
                var11++;
              }
            }
            this.field_A.field_c = 0;
            this.field_A.field_f = 0;
          } else {
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (RuntimeException) (Object) decompiledCaughtException;
          this.field_A.a(false);
          ((ca) (var4)).d(0);
          if (((ca) (var4)).field_t &&
            !this.field_A.c(90)) {
            var4 = this.field_A.a(param2, true, (byte) 2, (byte) -60, this.field_q);
            this.field_w.a((hl) (var4), (long)param2, false);
          }
          return null;
        }
        var5[var18.length - 2] = (byte)(this.field_v.field_p[param2] >>> 8);
        var5[-1 + var18.length] = (byte)this.field_v.field_p[param2];
        if (null != this.field_d) {
          this.field_n.a(param2, this.field_d, var18, 11998);
          if (this.field_o[param2] != 1) {
            this.field_o[param2] = (byte) 1;
          }
        }
        if (!((ca) (var4)).field_t) {
          ((ca) (var4)).d(0);
        }
        return (ca) (var4);
    }

    final kn a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = HoldTheLine.field_D;
        if (null != this.field_v) {
          return this.field_v;
        }
        if (param0 < 70) {
          this.field_r = (ah) null;
        }
        if (this.field_s == null) {
          if (this.field_A.c(77)) {
            return null;
          }
          this.field_s = (ca) ((Object) this.field_A.a(this.field_q, true, (byte) 0, (byte) -60, 255));
        }
        if (this.field_s.field_u) {
          return null;
        }
        var7 = this.field_s.i(-20324);
        var6 = var7;
        var5 = var6;
        var2 = var5;
        if (this.field_s instanceof bk) {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_v = new kn(var7, this.field_h, this.field_z);
            if (this.field_v.field_s != this.field_k) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = decompiledCaughtException;
            this.field_v = null;
            if (!this.field_A.c(98)) {
              this.field_s = (ca) ((Object) this.field_A.a(this.field_q, true, (byte) 0, (byte) -60, 255));
            } else {
              this.field_s = null;
            }
            return null;
          }
        } else {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_v = new kn(var7, this.field_h, this.field_z);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = decompiledCaughtException;
            this.field_A.a(false);
            this.field_v = null;
            if (!this.field_A.c(75)) {
              this.field_s = (ca) ((Object) this.field_A.a(this.field_q, true, (byte) 0, (byte) -60, 255));
            } else {
              this.field_s = null;
            }
            return null;
          }
          if (null != this.field_y) {
            this.field_n.a(this.field_q, this.field_y, var7, 11998);
          }
        }
        if (null != this.field_d) {
          this.field_o = new byte[this.field_v.field_o];
        }
        this.field_s = null;
        return this.field_v;
    }

    final byte[] a(byte param0, int param1) {
        ca var3 = this.a(0, 92, param1);
        if (var3 == null) {
          return null;
        }
        if (param0 > -54) {
          return (byte[]) null;
        }
        byte[] var4 = var3.i(-20324);
        var3.d(0);
        return var4;
    }

    public static void d(int param0) {
        field_p = null;
        if (param0 > -103) {
          return;
        }
        field_B = null;
    }

    final void b(byte param0) {
        if (this.field_d == null) {
          return;
        }
        this.field_e = true;
        if (this.field_r == null) {
          this.field_r = new ah();
        }
        if (param0 >= -10) {
          this.b(-110);
        }
    }

    final void c(int param0) {
        int var3 = 0;
        ca discarded$0 = null;
        ca discarded$1 = null;
        int var4 = HoldTheLine.field_D;
        if (this.field_r == null) {
          return;
        }
        if (null == this.a((byte) 104)) {
          return;
        }
        if (param0 != 2) {
          this.field_h = -32;
        }
        hl var2 = this.field_j.b((byte) 121);
        while (var2 != null) {
          var3 = (int)var2.field_f;
          if (var3 < 0) {
            var2.d(0);
          } else {
            if (this.field_v.field_o <= var3) {
              var2.d(0);
            } else {
              if (this.field_v.field_u[var3] == 0) {
                var2.d(0);
              } else {
                if (0 == this.field_o[var3]) {
                  discarded$0 = this.a(1, 62, var3);
                }
                if (this.field_o[var3] == -1) {
                  discarded$1 = this.a(2, 120, var3);
                }
                if (this.field_o[var3] == 1) {
                  var2.d(0);
                }
              }
            }
          }
          var2 = this.field_j.c((byte) 117);
        }
    }

    final void b(int param0) {
        ca discarded$1 = null;
        ca discarded$0 = null;
        ca discarded$3 = null;
        ca discarded$2 = null;
        int var2_int;
        ca var2;
        hl var3;
        int var4;
        int var5;
        hl var6;
        hl var7;
        int var2_intLifetime1;
        int var4Lifetime1;
        hl var3Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        var5 = HoldTheLine.field_D;
        if (this.field_r != null) {
          if (this.a((byte) 73) == null) {
            return;
          }
          if (this.field_f) {
            var2_int = 1;
            var3 = this.field_r.b((byte) 99);
            while (var3 != null) {
              var4 = (int)var3.field_f;
              if (0 == this.field_o[var4]) {
                discarded$1 = this.a(1, param0 ^ 102, var4);
              }
              if (0 != this.field_o[var4]) {
                var3.d(0);
              } else {
                var2_int = 0;
              }
              var3 = this.field_r.c((byte) 113);
            }
            while (this.field_l < this.field_v.field_u.length) {
              if (this.field_v.field_u[this.field_l] == 0) {
                this.field_l = this.field_l + 1;
                continue;
              }
              if (this.field_n.field_c < 250) {
                if (this.field_o[this.field_l] == 0) {
                  discarded$0 = this.a(1, 106, this.field_l);
                }
                if (this.field_o[this.field_l] == 0) {
                  var7 = new hl();
                  var7.field_f = (long)this.field_l;
                  var2_int = 0;
                  this.field_r.a((byte) -82, var7);
                }
                this.field_l = this.field_l + 1;
                continue;
              }
              var2_int = 0;
              break;
            }
            if ((var2_int != 0)) {
              this.field_f = false;
              this.field_l = 0;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_e) {
              var2_intLifetime1 = 1;
              var3Lifetime1 = this.field_r.b((byte) 92);
              while (var3Lifetime1 != null) {
                var4Lifetime1 = (int)var3Lifetime1.field_f;
                if (this.field_o[var4Lifetime1] != 1) {
                  discarded$3 = this.a(2, 53, var4Lifetime1);
                }
                if (this.field_o[var4Lifetime1] != 1) {
                  var2_intLifetime1 = 0;
                } else {
                  var3Lifetime1.d(0);
                }
                var3Lifetime1 = this.field_r.c((byte) -86);
              }
              L10: while (true) {
                if (this.field_l < this.field_v.field_u.length) {
                  if (this.field_v.field_u[this.field_l] != 0) {
                    if (this.field_A.d(param0 ^ 22)) {
                      var2_intLifetime1 = 0;
                      break L10;
                    }
                    if (this.field_o[this.field_l] != 1) {
                      discarded$2 = this.a(2, 74, this.field_l);
                    }
                    if (1 != this.field_o[this.field_l]) {
                      var6 = new hl();
                      var6.field_f = (long)this.field_l;
                      var2_intLifetime1 = 0;
                      this.field_r.a((byte) -125, var6);
                    }
                  }
                  this.field_l = this.field_l + 1;
                  continue;
                }
                break;
              }
              if ((var2_intLifetime1 != 0)) {
                this.field_l = 0;
                this.field_e = false;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_r = null;
            }
          }
        }
        if (this.field_u &&
          this.field_i <= bb.b(-1)) {
          var2 = (ca) (this.field_w.a(0));
          while (var2 != null) {
            if (!var2.field_u) {
              if (var2.field_q) {
                if (!var2.field_t) {
                  throw new RuntimeException();
                }
                var2.d(0);
              } else {
                var2.field_q = true;
              }
            }
            var2 = (ca) (this.field_w.b(-1));
          }
          this.field_i = 1000L + bb.b(-1);
        }
        if (param0 != 2) {
          this.field_y = (sk) null;
        }
    }

    final int a(boolean param0, int param1) {
        ca var3 = (ca) (this.field_w.a((byte) 113, (long)param1));
        if (param0) {
          this.field_v = (kn) null;
        }
        if (var3 == null) {
          return 0;
        }
        return var3.g(0);
    }

    rb(int param0, sk param1, sk param2, wj param3, qb param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_w = new og(16);
        this.field_l = 0;
        this.field_j = new ah();
        this.field_i = 0L;
        try {
          this.field_q = param0;
          this.field_d = param1;
          if (this.field_d != null) {
            this.field_f = true;
            this.field_r = new ah();
          } else {
            this.field_f = false;
          }
          this.field_z = param6;
          stackIn_7_1 = (param8);
          this.field_u = stackIn_7_1;
          this.field_A = param3;
          this.field_y = param2;
          this.field_n = param4;
          this.field_k = param7;
          this.field_h = param5;
          if (null != this.field_y) {
            this.field_s = (ca) ((Object) this.field_n.a(this.field_y, -18017, this.field_q));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = var10;
          stackIn_12_1 = new StringBuilder().append("rb.<init>(").append(param0).append(',');
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
          throw kk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_m = 10;
        field_t = 0;
        field_B = "Start Game";
    }
}
