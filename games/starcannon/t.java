/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t extends ti {
    static String field_q;
    static hl[] field_r;
    private uf field_v;
    private int field_n;
    static int field_C;
    private int field_k;
    private ak field_t;
    static String field_x;
    private byte[] field_j;
    private ef field_y;
    private uf field_p;
    private ih field_w;
    private byte[] field_i;
    private ik field_m;
    static int field_u;
    static lc field_h;
    private int field_A;
    private eh field_s;
    private boolean field_D;
    private int field_F;
    private rk field_B;
    private boolean field_l;
    private rk field_E;
    private boolean field_z;
    private long field_o;

    private final ik a(int param0, int param1, boolean param2) {
        Object stackIn_62_0 = null;
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
        ik var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        var10 = StarCannon.field_A;
        if (!param2) {
          this.b((byte) -92);
        }
        var12 = (ik) (this.field_w.a((long)param0, (byte) 88));
        var4 = var12;
        if (var12 != null &&
          0 == param1 &&
          !var12.field_o &&
          var12.field_r) {
          var12.b(4);
          var4 = null;
        }
        if (var4 == null) {
          if (0 == param1) {
            if (this.field_p != null &&
              this.field_j[param0] != -1) {
              var4 = this.field_y.a(this.field_p, -118, param0);
            } else {
              if (this.field_s.b((byte) -79)) {
                return null;
              }
              var4 = this.field_s.a(this.field_k, param0, -28612, true, (byte) 2);
            }
          } else {
            if (param1 != 1) {
              if (param1 != 2) {
                throw new RuntimeException();
              }
              if (null == this.field_p) {
                throw new RuntimeException();
              }
              if (this.field_j[param0] != -1) {
                throw new RuntimeException();
              }
              if (this.field_s.f((byte) -49)) {
                return null;
              }
              var4 = this.field_s.a(this.field_k, param0, -28612, false, (byte) 2);
            } else {
              if (this.field_p == null) {
                throw new RuntimeException();
              }
              var4 = this.field_y.a((byte) 16, param0, this.field_p);
            }
          }
          this.field_w.a((long)param0, (byte) -100, (rf) (var4));
        }
        if (((ik) (var4)).field_r) {
          return null;
        }
        var18 = ((ik) (var4)).f(0);
        var13 = var18;
        var5 = var13;
        if (var4 instanceof tg) {
          try {
            if (var5 != null &&
              2 < var18.length) {
              lh.field_g.reset();
              lh.field_g.update(var5, 0, -2 + var18.length);
              var6_int = (int)lh.field_g.getValue();
              if (var6_int != this.field_t.field_c[param0]) {
                throw new RuntimeException();
              }
              if (this.field_t.field_p != null &&
                null != this.field_t.field_p[param0]) {
                var27 = this.field_t.field_p[param0];
                var28 = bd.a(-2 + var18.length, var18, (byte) 93, 0);
                for (var9 = 0; var9 < 64; var9++) {
                  if (~var27[var9] != ~var28[var9]) {
                    throw new RuntimeException();
                  }
                }
              }
              var7 = ((255 & var5[-2 + var18.length]) << 8) + (var5[-1 + var18.length] & 255);
              if (var7 != (65535 & this.field_t.field_d[param0])) {
                throw new RuntimeException();
              }
              if (this.field_j[param0] != 1) {
                if (this.field_j[param0] == 0) {
                }
                this.field_j[param0] = (byte) 1;
              }
              if (!((ik) (var4)).field_o) {
                ((ik) (var4)).b(4);
              }
              stackIn_62_0 = var4;
              return (ik) (stackIn_62_0);
            }
            throw new RuntimeException();
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            this.field_j[param0] = (byte)-1;
            ((ik) (var4)).b(4);
            if (((ik) (var4)).field_o &&
              !this.field_s.b((byte) -124)) {
              var4 = this.field_s.a(this.field_k, param0, -28612, true, (byte) 2);
              this.field_w.a((long)param0, (byte) -100, (rf) (var4));
            }
            return null;
          }
        }
        try {
          if (var5 != null &&
            var18.length > 2) {
            lh.field_g.reset();
            lh.field_g.update(var5, 0, var18.length - 2);
            var6_int = (int)lh.field_g.getValue();
            if (this.field_t.field_c[param0] != var6_int) {
              throw new RuntimeException();
            }
            if (this.field_t.field_p != null &&
              null != this.field_t.field_p[param0]) {
              var30 = this.field_t.field_p[param0];
              var29 = bd.a(var18.length - 2, var18, (byte) 108, 0);
              var11 = 0;
              var9 = var11;
              while (var11 < 64) {
                if (~var29[var11] != ~var30[var11]) {
                  throw new RuntimeException();
                }
                var11++;
              }
            }
            this.field_s.field_p = 0;
            this.field_s.field_d = 0;
          } else {
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (RuntimeException) (Object) decompiledCaughtException;
          this.field_s.a((byte) 126);
          ((ik) (var4)).b(4);
          if (((ik) (var4)).field_o) {
            if (this.field_s.b((byte) -119)) {
              return null;
            }
            var4 = this.field_s.a(this.field_k, param0, -28612, true, (byte) 2);
            this.field_w.a((long)param0, (byte) -100, (rf) (var4));
          }
          return null;
        }
        var5[-2 + var18.length] = (byte)(this.field_t.field_d[param0] >>> 8);
        var5[-1 + var18.length] = (byte)this.field_t.field_d[param0];
        if (this.field_p != null) {
          this.field_y.a(var18, this.field_p, false, param0);
          if (1 != this.field_j[param0]) {
            this.field_j[param0] = (byte) 1;
          }
        }
        if (!((ik) (var4)).field_o) {
          ((ik) (var4)).b(4);
        }
        return (ik) (var4);
    }

    final void a(int param0) {
        if (param0 >= -123) {
          this.field_D = true;
        }
        if (null == this.field_p) {
          return;
        }
        this.field_D = true;
        if (null == this.field_B) {
          this.field_B = new rk();
        }
    }

    final byte[] b(int param0, boolean param1) {
        ik var3 = this.a(param0, 0, true);
        if (var3 == null) {
          return null;
        }
        byte[] var4 = var3.f(0);
        var3.b(4);
        if (param1) {
          this.b((byte) 60);
        }
        return var4;
    }

    final ak b(byte param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        int var3 = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        byte[] var6 = null;
        byte[] var7 = null;
        byte[] var8 = null;
        byte[] var9 = null;
        byte[] var10 = null;
        var5 = StarCannon.field_A;
        if (null != this.field_t) {
          return this.field_t;
        }
        if (null == this.field_m) {
          if (this.field_s.b((byte) -106)) {
            return null;
          }
          this.field_m = (ik) ((Object) this.field_s.a(255, this.field_k, -28612, true, (byte) 0));
        }
        if (this.field_m.field_r) {
          return null;
        }
        var9 = this.field_m.f(0);
        var7 = var9;
        var6 = var7;
        var10 = var6;
        var8 = var10;
        var2 = var8;
        var3 = -97 / ((50 - param0) / 55);
        if (this.field_m instanceof tg) {
          try {
            if (var2 == null) {
              throw new RuntimeException();
            }
            this.field_t = new ak(var10, this.field_n, this.field_i);
            if (this.field_t.field_q != this.field_A) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4 = decompiledCaughtException;
            this.field_t = null;
            if (!this.field_s.b((byte) -66)) {
              this.field_m = (ik) ((Object) this.field_s.a(255, this.field_k, -28612, true, (byte) 0));
            } else {
              this.field_m = null;
            }
            return null;
          }
        } else {
          try {
            if (var6 == null) {
              throw new RuntimeException();
            }
            this.field_t = new ak(var9, this.field_n, this.field_i);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4 = decompiledCaughtException;
            this.field_s.a((byte) 124);
            this.field_t = null;
            if (this.field_s.b((byte) -128)) {
              this.field_m = null;
            } else {
              this.field_m = (ik) ((Object) this.field_s.a(255, this.field_k, -28612, true, (byte) 0));
            }
            return null;
          }
          if (null != this.field_v) {
            this.field_y.a(var9, this.field_v, false, this.field_k);
          }
        }
        if (null != this.field_p) {
          this.field_j = new byte[this.field_t.field_m];
        }
        this.field_m = null;
        return this.field_t;
    }

    public static void c(byte param0) {
        field_x = null;
        int var1 = -37 % ((param0 + 4) / 33);
        field_q = null;
        field_h = null;
        field_r = null;
    }

    final void d(byte param0) {
        ik discarded$3 = null;
        ik discarded$2 = null;
        ik discarded$1 = null;
        ik discarded$0 = null;
        int var2_int;
        ik var2;
        rf var3;
        int var4;
        int var5;
        rf var6;
        rf var7;
        int var2_intLifetime1;
        int var4Lifetime1;
        rf var3Lifetime1;
        var5 = StarCannon.field_A;
        if (param0 != -12) {
          this.a(-73, false);
        }
        boolean decompiledFrameRemainder0 = true;
        if (null != this.field_B) {
          if (this.b((byte) 120) == null) {
            return;
          }
          if (this.field_l) {
            var2_int = 1;
            var3 = this.field_B.c(param0 - 3893);
            while (var3 != null) {
              var4 = (int)var3.field_b;
              if (this.field_j[var4] == 0) {
                discarded$3 = this.a(var4, 1, true);
              }
              if (this.field_j[var4] == 0) {
                var2_int = 0;
              } else {
                var3.b(4);
              }
              var3 = this.field_B.a(-16913);
            }
            L11: while (true) {
              if (this.field_t.field_i.length > this.field_F) {
                if (this.field_t.field_i[this.field_F] != 0) {
                  if (this.field_y.field_h >= 250) {
                    var2_int = 0;
                    break L11;
                  }
                  if (0 == this.field_j[this.field_F]) {
                    discarded$2 = this.a(this.field_F, 1, true);
                  }
                  if (0 == this.field_j[this.field_F]) {
                    var6 = new rf();
                    var6.field_b = (long)this.field_F;
                    var2_int = 0;
                    this.field_B.b(69, var6);
                  }
                }
                this.field_F = this.field_F + 1;
                continue;
              }
              break;
            }
            if ((var2_int != 0)) {
              this.field_l = false;
              this.field_F = 0;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_D) {
              var2_intLifetime1 = 1;
              var3Lifetime1 = this.field_B.c(-3905);
              while (var3Lifetime1 != null) {
                var4Lifetime1 = (int)var3Lifetime1.field_b;
                if (1 != this.field_j[var4Lifetime1]) {
                  discarded$1 = this.a(var4Lifetime1, 2, true);
                }
                if (1 == this.field_j[var4Lifetime1]) {
                  var3Lifetime1.b(4);
                } else {
                  var2_intLifetime1 = 0;
                }
                var3Lifetime1 = this.field_B.a(param0 - 16901);
              }
              while (this.field_t.field_i.length > this.field_F) {
                if (this.field_t.field_i[this.field_F] == 0) {
                  this.field_F = this.field_F + 1;
                  continue;
                }
                if (!this.field_s.f((byte) -49)) {
                  if (this.field_j[this.field_F] != 1) {
                    discarded$0 = this.a(this.field_F, 2, true);
                  }
                  if (1 != this.field_j[this.field_F]) {
                    var7 = new rf();
                    var7.field_b = (long)this.field_F;
                    var2_intLifetime1 = 0;
                    this.field_B.b(param0 + 83, var7);
                  }
                  this.field_F = this.field_F + 1;
                  continue;
                }
                var2_intLifetime1 = 0;
                break;
              }
              if ((var2_intLifetime1 != 0)) {
                this.field_D = false;
                this.field_F = 0;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_B = null;
            }
          }
        }
        if (this.field_z &&
          this.field_o <= dd.b(119)) {
          var2 = (ik) (this.field_w.a(-1));
          while (var2 != null) {
            if (!var2.field_r) {
              if (!var2.field_n) {
                var2.field_n = true;
              } else {
                if (!var2.field_o) {
                  throw new RuntimeException();
                }
                var2.b(4);
              }
            }
            var2 = (ik) (this.field_w.a((byte) -64));
          }
          this.field_o = dd.b(114) + 1000L;
        }
    }

    final void b(int param0) {
        int var3 = 0;
        ik discarded$0 = null;
        ik discarded$1 = null;
        int var4 = StarCannon.field_A;
        if (null == this.field_B) {
          return;
        }
        if (null == this.b((byte) 119)) {
          return;
        }
        if (param0 != 0) {
          field_C = -75;
        }
        rf var2 = this.field_E.c(param0 ^ -3905);
        while (var2 != null) {
          var3 = (int)var2.field_b;
          if (var3 < 0) {
            var2.b(4);
          } else {
            if (this.field_t.field_m <= var3) {
              var2.b(4);
            } else {
              if (this.field_t.field_i[var3] == 0) {
                var2.b(4);
              } else {
                if (0 == this.field_j[var3]) {
                  discarded$0 = this.a(var3, 1, true);
                }
                if (this.field_j[var3] == -1) {
                  discarded$1 = this.a(var3, 2, true);
                }
                if (this.field_j[var3] == 1) {
                  var2.b(4);
                }
              }
            }
          }
          var2 = this.field_E.a(param0 ^ -16913);
        }
    }

    final int a(int param0, boolean param1) {
        ik var3 = (ik) (this.field_w.a((long)param0, (byte) 120));
        if (!param1) {
          this.d((byte) -101);
        }
        if (var3 != null) {
          return var3.e(-29144);
        }
        return 0;
    }

    t(int param0, uf param1, uf param2, eh param3, ef param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_w = new ih(16);
        this.field_F = 0;
        this.field_E = new rk();
        this.field_o = 0L;
        try {
          this.field_k = param0;
          this.field_p = param1;
          if (this.field_p != null) {
            this.field_l = true;
            this.field_B = new rk();
          } else {
            this.field_l = false;
          }
          this.field_v = param2;
          stackIn_7_1 = (param8);
          this.field_z = stackIn_7_1;
          this.field_i = param6;
          this.field_n = param5;
          this.field_s = param3;
          this.field_A = param7;
          this.field_y = param4;
          if (null != this.field_v) {
            this.field_m = (ik) ((Object) this.field_y.a(this.field_v, -80, this.field_k));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = var10;
          stackIn_12_1 = new StringBuilder().append("t.<init>(").append(param0).append(',');
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
          throw sd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_C = -1;
        field_x = "SHIELDS - Improves the Nova Ray's shield recharge rate.";
    }
}
