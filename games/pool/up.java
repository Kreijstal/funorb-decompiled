/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class up extends lh {
    static int[] field_p;
    private int field_u;
    static int[] field_M;
    private int field_k;
    static String field_w;
    static int field_j;
    static int field_l;
    private ad field_z;
    static String field_L;
    private bm field_G;
    static String field_K;
    private byte[] field_E;
    private int field_y;
    static String field_I;
    static String field_v;
    private np field_t;
    static int field_m;
    private no field_r;
    private np field_n;
    private rn field_D;
    static String field_J;
    private gr field_H;
    private byte[] field_o;
    private int field_x;
    private boolean field_B;
    private boolean field_C;
    private ko field_q;
    private ko field_s;
    private long field_F;
    private boolean field_A;

    final void c(int param0) {
        int var3 = 0;
        gr discarded$0 = null;
        gr discarded$1 = null;
        int var4 = Pool.field_O;
        if (this.field_s == null) {
          return;
        }
        if (this.b((byte) -21) == null) {
          return;
        }
        ma var2 = this.field_q.c((byte) 111);
        while (var2 != null) {
          var3 = (int)var2.field_c;
          if (0 > var3) {
            var2.a((byte) -117);
          } else {
            if (var3 >= this.field_z.field_d) {
              var2.a((byte) -117);
            } else {
              if (this.field_z.field_s[var3] == 0) {
                var2.a((byte) -117);
              } else {
                if (this.field_E[var3] == 0) {
                  discarded$0 = this.a(var3, 1, (byte) 25);
                }
                if (this.field_E[var3] == -1) {
                  discarded$1 = this.a(var3, 2, (byte) 25);
                }
                if (this.field_E[var3] == 1) {
                  var2.a((byte) -117);
                }
              }
            }
          }
          var2 = this.field_q.f((byte) -5);
        }
        if (param0 <= 82) {
          CharSequence var5 = (CharSequence) null;
          up.a(false, (CharSequence) null, (byte) 71);
        }
    }

    final void b(int param0) {
        if (null != this.field_t) {
          if (param0 < 78) {
            field_J = (String) null;
          }
          this.field_B = true;
          if (null == this.field_s) {
            this.field_s = new ko();
          }
          return;
        }
    }

    final int a(int param0, int param1) {
        if (param0 != -18600) {
          this.a(100, (byte) -43);
        }
        gr var3 = (gr) (this.field_G.a(false, (long)param1));
        if (var3 == null) {
          return 0;
        }
        return var3.e(54);
    }

    final static String a(boolean param0, CharSequence param1, byte param2) {
        int var6 = 0;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_13_0 = null;
        String stackIn_18_0 = null;
        String stackIn_30_0 = null;
        String stackIn_35_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Pool.field_O;
        try {
          if (param1 == null) {
            stackIn_3_0 = gp.field_a;
            return stackIn_3_0;
          }
          var3_int = param1.length();
          if (var3_int >= 1 &&
            12 >= var3_int) {
            var4 = hq.a(91, param1);
            if (var4 != null &&
              var4.length() >= 1) {
              if (!qd.a(0, var4.charAt(0)) &&
                !qd.a(0, var4.charAt(var4.length() - 1))) {
                var5 = 0;
                if (param2 < 96) {
                  up.a(-125);
                }
                for (var6 = 0; param1.length() > var6; var6++) {
                  var7 = param1.charAt(var6);
                  if (qd.a(0, (char) var7)) {
                    var5++;
                  } else {
                    var5 = 0;
                  }
                  if (var5 >= 2 &&
                    !param0) {
                    stackIn_30_0 = oh.field_g;
                    return stackIn_30_0;
                  }
                }
                if (var5 <= 0) {
                  return null;
                }
                stackIn_35_0 = lg.field_r;
                return stackIn_35_0;
              }
              stackIn_18_0 = lg.field_r;
              return stackIn_18_0;
            }
            stackIn_13_0 = gp.field_a;
            return stackIn_13_0;
          }
          stackIn_8_0 = gp.field_a;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_38_0 = var3;
          stackIn_38_1 = new StringBuilder().append("up.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param2).append(')').toString());
        }
    }

    final static int a(int param0) {
        if (param0 != -21282) {
          return 111;
        }
        return (int)(1000000000L / oh.field_e);
    }

    final static dd[] a(dd[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        dd var3 = null;
        int var4 = 0;
        dd[] stackIn_3_0 = null;
        dd[] stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Pool.field_O;
        try {
          if (param1 != 12519) {
            stackIn_3_0 = (dd[]) null;
            return stackIn_3_0;
          }
          for (var2_int = 0; param0.length > var2_int; var2_int++) {
            var3 = param0[var2_int];
            param0[var2_int].field_B = 0;
            var3.field_G = 0;
            param0[var2_int].field_w = param0[var2_int].field_z;
            param0[var2_int].field_y = param0[var2_int].field_A;
          }
          stackIn_8_0 = (dd[]) (param0);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("up.D(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final ad b(byte param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = Pool.field_O;
        if (null != this.field_z) {
          return this.field_z;
        }
        if (null == this.field_H) {
          if (this.field_r.b((byte) -125)) {
            return null;
          }
          this.field_H = (gr) ((Object) this.field_r.a(this.field_k, 255, (byte) 0, true, -154018400));
        }
        if (this.field_H.field_F) {
          return null;
        }
        var7 = this.field_H.b(false);
        var6 = var7;
        var5 = var6;
        var2 = var5;
        if (!(this.field_H instanceof dg)) {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_z = new ad(var7, this.field_y, this.field_o);
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = decompiledCaughtException;
            this.field_r.a((byte) -123);
            this.field_z = null;
            if (!this.field_r.b((byte) -125)) {
              this.field_H = (gr) ((Object) this.field_r.a(this.field_k, 255, (byte) 0, true, -154018400));
            } else {
              this.field_H = null;
            }
            return null;
          }
          if (this.field_n != null) {
            this.field_D.a(var7, this.field_n, (byte) -128, this.field_k);
          }
        } else {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_z = new ad(var7, this.field_y, this.field_o);
            if (this.field_u != this.field_z.field_h) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = decompiledCaughtException;
            this.field_z = null;
            if (this.field_r.b((byte) -125)) {
              this.field_H = null;
            } else {
              this.field_H = (gr) ((Object) this.field_r.a(this.field_k, 255, (byte) 0, true, -154018400));
            }
            return null;
          }
        }
        if (param0 != -21) {
          up.a(false);
        }
        this.field_H = null;
        if (this.field_t != null) {
          this.field_E = new byte[this.field_z.field_d];
        }
        return this.field_z;
    }

    public static void a(boolean param0) {
        field_J = null;
        field_M = null;
        field_I = null;
        field_w = null;
        field_L = null;
        field_p = null;
        field_v = null;
        field_K = null;
        if (!param0) {
          field_w = (String) null;
        }
    }

    private final gr a(int param0, int param1, byte param2) {
        Object stackIn_88_0 = null;
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
        gr var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        var10 = Pool.field_O;
        var12 = (gr) (this.field_G.a(false, (long)param0));
        var4 = var12;
        if (param2 != 25) {
          return (gr) null;
        }
        if (var12 != null &&
          param1 == 0 &&
          !var12.field_x &&
          var12.field_F) {
          var12.a((byte) -117);
          var4 = null;
        }
        if (var4 == null) {
          if (param1 == 0) {
            if (null != this.field_t &&
              this.field_E[param0] != -1) {
              var4 = this.field_D.a(121, this.field_t, param0);
            } else {
              if (this.field_r.b((byte) -125)) {
                return null;
              }
              var4 = this.field_r.a(param0, this.field_k, (byte) 2, true, -154018400);
            }
          } else {
            if (param1 == 1) {
              if (this.field_t == null) {
                throw new RuntimeException();
              }
              var4 = this.field_D.a((byte) 58, this.field_t, param0);
            } else {
              if (param1 != 2) {
                throw new RuntimeException();
              }
              if (this.field_t == null) {
                throw new RuntimeException();
              }
              if (this.field_E[param0] != -1) {
                throw new RuntimeException();
              }
              if (this.field_r.a(param2 ^ 13)) {
                return null;
              }
              var4 = this.field_r.a(param0, this.field_k, (byte) 2, false, -154018400);
            }
          }
          this.field_G.a((byte) -114, (ma) (var4), (long)param0);
        }
        if (((gr) (var4)).field_F) {
          return null;
        }
        var18 = ((gr) (var4)).b(false);
        var13 = var18;
        var5 = var13;
        if (var4 instanceof dg) {
          try {
            if (var5 != null &&
              var18.length > 2) {
              oq.field_B.reset();
              oq.field_B.update(var5, 0, -2 + var18.length);
              var6_int = (int)oq.field_B.getValue();
              if (var6_int != this.field_z.field_w[param0]) {
                throw new RuntimeException();
              }
              if (null != this.field_z.field_a &&
                null != this.field_z.field_a[param0]) {
                var29 = this.field_z.field_a[param0];
                var30 = jr.a(-2 + var18.length, (byte) -83, var18, 0);
                var11 = 0;
                var9 = var11;
                while (64 > var11) {
                  if (~var29[var11] != ~var30[var11]) {
                    throw new RuntimeException();
                  }
                  var11++;
                }
              }
              var7 = (var5[-1 + var18.length] & 255) + ((255 & var5[-2 + var18.length]) << 8);
              if (var7 != (this.field_z.field_i[param0] & 65535)) {
                throw new RuntimeException();
              }
              if (this.field_E[param0] != 1) {
                if (this.field_E[param0] == 0) {
                }
                this.field_E[param0] = (byte) 1;
              }
              if (!((gr) (var4)).field_x) {
                ((gr) (var4)).a((byte) -117);
              }
              stackIn_88_0 = var4;
              return (gr) (stackIn_88_0);
            }
            throw new RuntimeException();
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            this.field_E[param0] = (byte)-1;
            ((gr) (var4)).a((byte) -117);
            if (!((gr) (var4)).field_x) {
              return null;
            }
            if (!this.field_r.b((byte) -125)) {
              var4 = this.field_r.a(param0, this.field_k, (byte) 2, true, param2 ^ -154018375);
              this.field_G.a((byte) -127, (ma) (var4), (long)param0);
            }
            return null;
          }
        }
        try {
          if (var5 != null &&
            2 < var18.length) {
            oq.field_B.reset();
            oq.field_B.update(var5, 0, var18.length - 2);
            var6_int = (int)oq.field_B.getValue();
            if (var6_int != this.field_z.field_w[param0]) {
              throw new RuntimeException();
            }
            if (this.field_z.field_a != null &&
              null != this.field_z.field_a[param0]) {
              var27 = this.field_z.field_a[param0];
              var28 = jr.a(var18.length - 2, (byte) -76, var18, 0);
              for (var9 = 0; 64 > var9; var9++) {
                if (~var27[var9] != ~var28[var9]) {
                  throw new RuntimeException();
                }
              }
            }
            this.field_r.field_e = 0;
            this.field_r.field_a = 0;
          } else {
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref = (RuntimeException) (Object) decompiledCaughtException;
          this.field_r.a((byte) -53);
          ((gr) (var4)).a((byte) -117);
          if (!((gr) (var4)).field_x) {
            return null;
          }
          if (this.field_r.b((byte) -125)) {
            return null;
          }
          var4 = this.field_r.a(param0, this.field_k, (byte) 2, true, -154018400);
          this.field_G.a((byte) -124, (ma) (var4), (long)param0);
          return null;
        }
        var5[var18.length - 2] = (byte)(this.field_z.field_i[param0] >>> 8);
        var5[var18.length - 1] = (byte)this.field_z.field_i[param0];
        if (this.field_t != null) {
          this.field_D.a(var18, this.field_t, (byte) -98, param0);
          if (this.field_E[param0] != 1) {
            this.field_E[param0] = (byte) 1;
          }
        }
        if (!((gr) (var4)).field_x) {
          ((gr) (var4)).a((byte) -117);
        }
        return (gr) (var4);
    }

    final void c(byte param0) {
        gr discarded$1 = null;
        gr discarded$0 = null;
        gr discarded$3 = null;
        gr discarded$2 = null;
        int var2_int;
        gr var2;
        ma var3;
        int var4;
        int var5;
        ma var6;
        ma var7;
        int var2_intLifetime1;
        int var2_intLifetime2;
        int var2_intLifetime3;
        int var2_intLifetime4;
        int var4Lifetime1;
        ma var3Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        var5 = Pool.field_O;
        if (this.field_s != null) {
          if (null == this.b((byte) -21)) {
            return;
          }
          if (this.field_C) {
            var2_int = 1;
            var3 = this.field_s.c((byte) 78);
            while (var3 != null) {
              var4 = (int)var3.field_c;
              if (0 == this.field_E[var4]) {
                discarded$1 = this.a(var4, 1, (byte) 25);
              }
              if (this.field_E[var4] != 0) {
                var3.a((byte) -117);
              } else {
                var2_int = 0;
              }
              var3 = this.field_s.f((byte) -5);
            }
            while (this.field_x < this.field_z.field_s.length) {
              if (this.field_z.field_s[this.field_x] == 0) {
                this.field_x = this.field_x + 1;
                continue;
              }
              if (this.field_D.field_e < 250) {
                if (this.field_E[this.field_x] == 0) {
                  discarded$0 = this.a(this.field_x, 1, (byte) 25);
                }
                if (this.field_E[this.field_x] == 0) {
                  var7 = new ma();
                  var7.field_c = (long)this.field_x;
                  this.field_s.b((byte) -64, var7);
                  var2_int = 0;
                }
                this.field_x = this.field_x + 1;
                continue;
              }
              var2_int = 0;
              break;
            }
            if ((var2_int != 0)) {
              this.field_C = false;
              this.field_x = 0;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_B) {
              var2_intLifetime4 = 1;
              var3Lifetime1 = this.field_s.c((byte) -58);
              while (var3Lifetime1 != null) {
                var4Lifetime1 = (int)var3Lifetime1.field_c;
                if (this.field_E[var4Lifetime1] != 1) {
                  discarded$3 = this.a(var4Lifetime1, 2, (byte) 25);
                }
                if (this.field_E[var4Lifetime1] == 1) {
                  var3Lifetime1.a((byte) -117);
                } else {
                  var2_intLifetime4 = 0;
                }
                var3Lifetime1 = this.field_s.f((byte) -5);
              }
              L10: while (true) {
                if (this.field_x < this.field_z.field_s.length) {
                  if (this.field_z.field_s[this.field_x] != 0) {
                    if (this.field_r.a(20)) {
                      var2_intLifetime4 = 0;
                      break L10;
                    }
                    if (this.field_E[this.field_x] != 1) {
                      discarded$2 = this.a(this.field_x, 2, (byte) 25);
                    }
                    if (this.field_E[this.field_x] != 1) {
                      var6 = new ma();
                      var6.field_c = (long)this.field_x;
                      var2_intLifetime4 = 0;
                      this.field_s.b((byte) 96, var6);
                    }
                  }
                  this.field_x = this.field_x + 1;
                  continue;
                }
                break;
              }
              if ((var2_intLifetime4 != 0)) {
                this.field_B = false;
                this.field_x = 0;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_s = null;
            }
          }
        }
        if (!this.field_A) {
          var2_intLifetime1 = 86 % ((param0 - 82) / 40);
          return;
        }
        if (rl.a((byte) -124) < this.field_F) {
          var2_intLifetime2 = 86 % ((param0 - 82) / 40);
          return;
        }
        var2 = (gr) (this.field_G.a(0));
        while (var2 != null) {
          if (!var2.field_F) {
            if (!var2.field_C) {
              var2.field_C = true;
            } else {
              if (!var2.field_x) {
                throw new RuntimeException();
              }
              var2.a((byte) -117);
            }
          }
          var2 = (gr) (this.field_G.b(-1));
        }
        this.field_F = rl.a((byte) -107) + 1000L;
        var2_intLifetime3 = 86 % ((param0 - 82) / 40);
        return;
    }

    final byte[] a(int param0, byte param1) {
        byte[] var4 = null;
        gr var3 = this.a(param0, 0, (byte) 25);
        if (var3 == null) {
          return null;
        }
        if (param1 == 19) {
          var4 = var3.b(false);
          var3.a((byte) -117);
          return var4;
        }
        return (byte[]) null;
    }

    up(int param0, np param1, np param2, no param3, rn param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_G = new bm(16);
        this.field_x = 0;
        this.field_q = new ko();
        this.field_F = 0L;
        try {
          this.field_k = param0;
          this.field_t = param1;
          if (null != this.field_t) {
            this.field_C = true;
            this.field_s = new ko();
          } else {
            this.field_C = false;
          }
          this.field_o = param6;
          this.field_n = param2;
          stackIn_7_1 = (param8);
          this.field_A = stackIn_7_1;
          this.field_y = param5;
          this.field_u = param7;
          this.field_r = param3;
          this.field_D = param4;
          if (this.field_n != null) {
            this.field_H = (gr) ((Object) this.field_D.a(92, this.field_n, this.field_k));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = var10;
          stackIn_12_1 = new StringBuilder().append("up.<init>(").append(param0).append(',');
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
          throw wm.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_M = new int[7];
        field_K = "The invitation has been withdrawn.";
        field_v = "Sound: ";
        field_I = "<%0> has joined your game.";
        field_L = "Press and hold the <img=0> on the cue ball to move it.";
        field_m = -1;
        field_w = "OVER <%0>";
        field_J = "Rematch";
    }
}
