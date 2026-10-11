/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bo extends hk {
    private ll field_g;
    private byte[] field_z;
    static boolean field_s;
    private ke field_t;
    private byte[] field_f;
    private sk field_r;
    static String field_h;
    private sk field_k;
    static wf field_A;
    static je field_C;
    private int field_i;
    private th field_u;
    private int field_B;
    private dj field_m;
    private int field_j;
    static ah field_e;
    static float field_y;
    private t field_q;
    private je field_v;
    private boolean field_l;
    private je field_w;
    private int field_o;
    private boolean field_p;
    private long field_x;
    private boolean field_n;

    final void b(byte param0) {
        ll discarded$0 = null;
        ll discarded$1 = null;
        mc var2;
        int var3;
        int var4;
        int var5;
        var5 = TetraLink.field_J;
        if (this.field_v == null) {
          return;
        }
        if (null == this.a(0)) {
          return;
        }
        var2 = this.field_w.c(false);
        var3 = 77 / ((param0 - 66) / 36);
        while (var2 != null) {
          var4 = (int)var2.field_c;
          if (var4 >= 0) {
            if (this.field_q.field_i > var4) {
              if (this.field_q.field_m[var4] == 0) {
                var2.b(false);
              } else {
                if (0 == this.field_f[var4]) {
                  discarded$0 = this.a(1, var4, 121);
                }
                if (-1 == this.field_f[var4]) {
                  discarded$1 = this.a(2, var4, 120);
                }
                if (1 == this.field_f[var4]) {
                  var2.b(false);
                }
              }
            } else {
              var2.b(false);
            }
          } else {
            var2.b(false);
          }
          var2 = this.field_w.a((byte) -70);
        }
        return;
    }

    final void d(int param0) {
        if (null == this.field_r) {
          return;
        }
        this.field_p = true;
        if (param0 != 5127) {
          field_C = (je) null;
        }
        if (this.field_v == null) {
          this.field_v = new je();
        }
    }

    final static void c(int param0, int param1) {
        fh.field_a = param0;
        uf.field_c = new int[param1];
        n.field_L = new fj[param0 * 15];
        pl.field_d = 0;
    }

    final int a(int param0, int param1) {
        if (param1 != 0) {
          this.a(-82);
        }
        ll var3 = (ll) (this.field_m.a((long)param0, (byte) -43));
        if (var3 == null) {
          return 0;
        }
        return var3.a(false);
    }

    public static void c(int param0) {
        field_C = null;
        field_h = null;
        if (param0 != -251) {
          return;
        }
        field_A = null;
        field_e = null;
    }

    final void e(int param0) {
        ll discarded$3 = null;
        ll discarded$2 = null;
        ll discarded$1 = null;
        ll discarded$0 = null;
        int var2_int;
        ll var2;
        mc var3;
        int var4;
        int var5;
        mc var6;
        mc var7;
        int var2_intLifetime1;
        int var4Lifetime1;
        mc var3Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        var5 = TetraLink.field_J;
        if (this.field_v != null) {
          if (null == this.a(0)) {
            return;
          }
          if (this.field_l) {
            var2_int = 1;
            var3 = this.field_v.c(false);
            while (var3 != null) {
              var4 = (int)var3.field_c;
              if (this.field_f[var4] == 0) {
                discarded$3 = this.a(1, var4, 123);
              }
              if (this.field_f[var4] == 0) {
                var2_int = 0;
              } else {
                var3.b(false);
              }
              var3 = this.field_v.a((byte) -70);
            }
            L10: while (true) {
              if (this.field_o < this.field_q.field_m.length) {
                if (this.field_q.field_m[this.field_o] != 0) {
                  if (this.field_t.field_d >= 250) {
                    var2_int = 0;
                    break L10;
                  }
                  if (this.field_f[this.field_o] == 0) {
                    discarded$2 = this.a(1, this.field_o, 124);
                  }
                  if (this.field_f[this.field_o] == 0) {
                    var6 = new mc();
                    var6.field_c = (long)this.field_o;
                    var2_int = 0;
                    this.field_v.a(var6, false);
                  }
                }
                this.field_o = this.field_o + 1;
                continue;
              }
              break;
            }
            if ((var2_int != 0)) {
              this.field_o = 0;
              this.field_l = false;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_p) {
              var2_intLifetime1 = 1;
              var3Lifetime1 = this.field_v.c(false);
              while (var3Lifetime1 != null) {
                var4Lifetime1 = (int)var3Lifetime1.field_c;
                if (this.field_f[var4Lifetime1] != 1) {
                  discarded$1 = this.a(2, var4Lifetime1, 125);
                }
                if (this.field_f[var4Lifetime1] != 1) {
                  var2_intLifetime1 = 0;
                } else {
                  var3Lifetime1.b(false);
                }
                var3Lifetime1 = this.field_v.a((byte) -70);
              }
              L3: while (true) {
                if (this.field_q.field_m.length > this.field_o) {
                  if (0 != this.field_q.field_m[this.field_o]) {
                    if (this.field_u.c(-7614)) {
                      var2_intLifetime1 = 0;
                      break L3;
                    }
                    if (this.field_f[this.field_o] != 1) {
                      discarded$0 = this.a(2, this.field_o, 126);
                    }
                    if (this.field_f[this.field_o] != 1) {
                      var7 = new mc();
                      var7.field_c = (long)this.field_o;
                      this.field_v.a(var7, false);
                      var2_intLifetime1 = 0;
                    }
                  }
                  this.field_o = this.field_o + 1;
                  continue;
                }
                break;
              }
              if ((var2_intLifetime1 != 0)) {
                this.field_p = false;
                this.field_o = 0;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_v = null;
            }
          }
        }
        if (param0 != 2) {
          this.field_v = (je) null;
        }
        if (!this.field_n) {
          return;
        }
        if (k.a(0) < this.field_x) {
          return;
        }
        var2 = (ll) (this.field_m.b(44));
        while (var2 != null) {
          if (!var2.field_v) {
            if (!var2.field_B) {
              var2.field_B = true;
            } else {
              if (!var2.field_D) {
                throw new RuntimeException();
              }
              var2.b(false);
            }
          }
          var2 = (ll) (this.field_m.a(param0 - 3));
        }
        this.field_x = k.a(0) + 1000L;
        return;
    }

    final byte[] b(int param0, int param1) {
        byte[] var4 = null;
        ll var3 = this.a(0, param1, 121);
        if (param0 != 20396) {
          java.awt.Canvas var5 = (java.awt.Canvas) null;
          bo.a(62, -68, (java.awt.Canvas) null, 86);
        }
        if (var3 != null) {
          var4 = var3.c(true);
          var3.b(false);
          return var4;
        }
        return null;
    }

    final t a(int param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = TetraLink.field_J;
        if (null != this.field_q) {
          return this.field_q;
        }
        if (this.field_g == null) {
          if (this.field_u.b((byte) 119)) {
            return null;
          }
          this.field_g = (ll) ((Object) this.field_u.a(false, 255, (byte) 0, this.field_i, true));
        }
        if (this.field_g.field_v) {
          return null;
        }
        if (param0 != 0) {
          this.b(120, 16);
        }
        var7 = this.field_g.c(true);
        var6 = var7;
        var5 = var6;
        var2 = var5;
        if (this.field_g instanceof fd) {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_q = new t(var7, this.field_B, this.field_z);
            if (this.field_j != this.field_q.field_f) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = decompiledCaughtException;
            this.field_q = null;
            if (this.field_u.b((byte) 119)) {
              this.field_g = null;
            } else {
              this.field_g = (ll) ((Object) this.field_u.a(false, 255, (byte) 0, this.field_i, true));
            }
            return null;
          }
        } else {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_q = new t(var7, this.field_B, this.field_z);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = decompiledCaughtException;
            this.field_u.b(0);
            this.field_q = null;
            if (!this.field_u.b((byte) 119)) {
              this.field_g = (ll) ((Object) this.field_u.a(false, 255, (byte) 0, this.field_i, true));
            } else {
              this.field_g = null;
            }
            return null;
          }
          if (this.field_k != null) {
            this.field_t.a(param0 - 116, this.field_i, var7, this.field_k);
          }
        }
        this.field_g = null;
        if (null != this.field_r) {
          this.field_f = new byte[this.field_q.field_i];
        }
        return this.field_q;
    }

    final static void a(int param0, int param1, java.awt.Canvas param2, int param3) {
        java.awt.Graphics var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        try {
          try {
            var4 = param2.getGraphics();
            pk.field_O.a(10, param0, param1, var4);
            var4.dispose();
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = (Exception) (Object) decompiledCaughtException;
            param2.repaint();
          }
          if (param3 != -2) {
            field_A = (wf) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_8_0 = var4_ref2;
          stackIn_8_1 = new StringBuilder().append("bo.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, jb param5, int param6, int param7, ve param8, ve param9, int param10, int param11, ve param12, int param13, jb param14, int param15, int param16, int param17, int param18, int param19) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var20 = null;
        try {
          oi.field_a = param14;
          ko.field_u = param5;
          hh.a(param7, param11, param17, param18, -120);
          gj.a(param9, param6, param2, -20140);
          da.a(param15, param3, param8, -120, param13, param12);
          if (param4 != -1) {
            bo.c(-91);
          }
          b.a(param0, param1, (byte) -66);
          kb.a(param19, param16, param10, (byte) -118);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var20 = decompiledCaughtException;
          stackIn_6_0 = var20;
          stackIn_6_1 = new StringBuilder().append("bo.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param9 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param10).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param13).append(',');
          if (param14 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',').append(param18).append(',').append(param19).append(')').toString());
        }
    }

    private final ll a(int param0, int param1, int param2) {
        Object stackIn_90_0 = null;
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
        ll var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        var10 = TetraLink.field_J;
        var12 = (ll) (this.field_m.a((long)param1, (byte) -43));
        var4 = var12;
        if (var12 != null &&
          param0 == 0 &&
          !var12.field_D &&
          var12.field_v) {
          var12.b(false);
          var4 = null;
        }
        if (var4 == null) {
          if (param0 != 0) {
            if (1 == param0) {
              if (this.field_r == null) {
                throw new RuntimeException();
              }
              var4 = this.field_t.a(this.field_r, param1, 81);
            } else {
              if (2 != param0) {
                throw new RuntimeException();
              }
              if (this.field_r == null) {
                throw new RuntimeException();
              }
              if (this.field_f[param1] != -1) {
                throw new RuntimeException();
              }
              if (this.field_u.c(-7614)) {
                return null;
              }
              var4 = this.field_u.a(false, this.field_i, (byte) 2, param1, false);
            }
          } else {
            if (null != this.field_r &&
              this.field_f[param1] != -1) {
              var4 = this.field_t.a((byte) -120, this.field_r, param1);
            } else {
              if (this.field_u.b((byte) 119)) {
                return null;
              }
              var4 = this.field_u.a(false, this.field_i, (byte) 2, param1, true);
            }
          }
          this.field_m.a((long)param1, -110, (mc) (var4));
        }
        if (param2 <= 117) {
          return (ll) null;
        }
        if (((ll) (var4)).field_v) {
          return null;
        }
        var18 = ((ll) (var4)).c(true);
        var13 = var18;
        var5 = var13;
        if (var4 instanceof fd) {
          try {
            if (var5 != null &&
              var18.length > 2) {
              co.field_r.reset();
              co.field_r.update(var5, 0, -2 + var18.length);
              var6_int = (int)co.field_r.getValue();
              if (this.field_q.field_u[param1] != var6_int) {
                throw new RuntimeException();
              }
              if (this.field_q.field_e != null &&
                this.field_q.field_e[param1] != null) {
                var29 = this.field_q.field_e[param1];
                var30 = qb.a(var5, (byte) -89, var18.length - 2, 0);
                var11 = 0;
                var9 = var11;
                while (64 > var11) {
                  if (~var29[var11] != ~var30[var11]) {
                    throw new RuntimeException();
                  }
                  var11++;
                }
              }
              var7 = (var5[var18.length - 1] & 255) + (65280 & var5[-2 + var18.length] << 8);
              if (var7 != (65535 & this.field_q.field_k[param1])) {
                throw new RuntimeException();
              }
              if (this.field_f[param1] != 1) {
                if (this.field_f[param1] == 0) {
                }
                this.field_f[param1] = (byte) 1;
              }
              if (!((ll) (var4)).field_D) {
                ((ll) (var4)).b(false);
              }
              stackIn_90_0 = var4;
              return (ll) (stackIn_90_0);
            }
            throw new RuntimeException();
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            this.field_f[param1] = (byte)-1;
            ((ll) (var4)).b(false);
            if (!((ll) (var4)).field_D) {
              return null;
            }
            if (this.field_u.b((byte) 119)) {
              return null;
            }
            var4 = this.field_u.a(false, this.field_i, (byte) 2, param1, true);
            this.field_m.a((long)param1, -76, (mc) (var4));
            return null;
          }
        }
        try {
          if (var5 != null &&
            var18.length > 2) {
            co.field_r.reset();
            co.field_r.update(var5, 0, var18.length - 2);
            var6_int = (int)co.field_r.getValue();
            if (this.field_q.field_u[param1] != var6_int) {
              throw new RuntimeException();
            }
            if (this.field_q.field_e != null &&
              null != this.field_q.field_e[param1]) {
              var27 = this.field_q.field_e[param1];
              var28 = qb.a(var5, (byte) -89, -2 + var18.length, 0);
              for (var9 = 0; 64 > var9; var9++) {
                if (var27[var9] != var28[var9]) {
                  throw new RuntimeException();
                }
              }
            }
            this.field_u.field_h = 0;
            this.field_u.field_d = 0;
          } else {
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref = (RuntimeException) (Object) decompiledCaughtException;
          this.field_u.b(0);
          ((ll) (var4)).b(false);
          if (!((ll) (var4)).field_D) {
            return null;
          }
          if (this.field_u.b((byte) 119)) {
            return null;
          }
          var4 = this.field_u.a(false, this.field_i, (byte) 2, param1, true);
          this.field_m.a((long)param1, -118, (mc) (var4));
          return null;
        }
        var5[var18.length - 2] = (byte)(this.field_q.field_k[param1] >>> 8);
        var5[var18.length - 1] = (byte)this.field_q.field_k[param1];
        if (null != this.field_r) {
          this.field_t.a(-49, param1, var18, this.field_r);
          if (this.field_f[param1] != 1) {
            this.field_f[param1] = (byte) 1;
          }
        }
        if (!((ll) (var4)).field_D) {
          ((ll) (var4)).b(false);
        }
        return (ll) (var4);
    }

    bo(int param0, sk param1, sk param2, th param3, ke param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_m = new dj(16);
        this.field_o = 0;
        this.field_w = new je();
        this.field_x = 0L;
        try {
          this.field_i = param0;
          this.field_r = param1;
          if (null == this.field_r) {
            this.field_l = false;
          } else {
            this.field_l = true;
            this.field_v = new je();
          }
          this.field_z = param6;
          this.field_B = param5;
          stackIn_7_1 = (param8);
          this.field_n = stackIn_7_1;
          this.field_j = param7;
          this.field_t = param4;
          this.field_k = param2;
          this.field_u = param3;
          if (null != this.field_k) {
            this.field_g = (ll) ((Object) this.field_t.a((byte) 111, this.field_k, this.field_i));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = var10;
          stackIn_12_1 = new StringBuilder().append("bo.<init>(").append(param0).append(',');
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
          throw oi.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_h = "Next";
        field_C = new je();
        field_y = 0.0f;
    }
}
