/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n {
    short[] field_E;
    short[] field_l;
    int field_k;
    short[] field_r;
    short field_n;
    int[] field_A;
    short[] field_P;
    private boolean field_p;
    short[] field_z;
    int[] field_j;
    short[] field_a;
    short[] field_c;
    int field_G;
    int[] field_J;
    short[] field_e;
    int[] field_B;
    static int field_d;
    int[] field_o;
    short[] field_b;
    int field_t;
    int field_u;
    short[] field_m;
    int[] field_O;
    int field_x;
    short[] field_I;
    short[] field_s;
    int[] field_y;
    int field_F;
    static hc field_i;
    int[] field_q;
    static int field_L;
    short[] field_f;
    short[] field_H;
    short field_D;
    byte field_N;
    short field_C;
    short[] field_v;
    short[] field_K;
    byte[] field_g;
    int[] field_w;
    short[] field_M;
    short[] field_h;

    final static void a(int param0, byte param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = stellarshard.field_B;
        try {
          if (ni.field_d < 0) {
            return;
          }
          var3_int = -135 + param2;
          var4 = -35 + param0;
          var5 = 256;
          if (ni.field_d < 75) {
            var5 = (ni.field_d << 8) / 75;
          }
          if (200 < ni.field_d) {
            var5 = (250 - ni.field_d << 8) / 50;
          }
          hj.a(u.field_m, 1);
          cc.a();
          ti.d();
          ja.a(param1 + 45);
          if (var5 < 256) {
            ti.b(0, 0, ti.field_i, ti.field_b, 0, -var5 + 256);
          }
          if (param1 != -41) {
            return;
          }
          id.b((byte) -58);
          if (ni.field_d < 150) {
            u.field_m.b(var3_int, var4);
            if (var8 != 0) {
              wh.field_a.e(var3_int + 15, var4 + 10, var5);
            }
          } else {
            wh.field_a.e(var3_int + 15, var4 + 10, var5);
          }
          var6 = ni.field_d - 125;
          if (0 < var6 &&
            var6 < 50) {
            if (var6 >= 20) {
              if (30 <= var6) {
                var7 = (-var6 + 50) * 256 / 20;
                pd.field_s.d(var3_int, var4, var7);
                if (var8 != 0) {
                  pd.field_s.d(var3_int, var4, 256);
                  var7 = 256 * var6 / 20;
                  pd.field_s.d(var3_int, var4, var7);
                }
              } else {
                pd.field_s.d(var3_int, var4, 256);
                if (var8 != 0) {
                  var7 = 256 * var6 / 20;
                  pd.field_s.d(var3_int, var4, var7);
                }
              }
            } else {
              var7 = 256 * var6 / 20;
              pd.field_s.d(var3_int, var4, var7);
            }
          }
          var6Lifetime1 = ni.field_d - 140;
          if (var6Lifetime1 > 0) {
            var7Lifetime1 = 256;
            if (var6Lifetime1 < 20) {
              var7Lifetime1 = 256 * var6Lifetime1 / 20;
            }
            fb.field_h.e(15 + var3_int, var4 + 10, var7Lifetime1 * var5 >> 8);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var3), "n.G(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void b(byte param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = stellarshard.field_B;
        try {
          if (this.field_p) {
            return;
          }
          this.field_p = true;
          var2_int = 32767;
          var3 = 32767;
          var4 = 32767;
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          if (param0 != -53) {
            this.field_s = (short[]) null;
          }
          var8 = 0;
          while (var8 < this.field_n) {
            var9 = this.field_f[var8];
            var10 = this.field_b[var8];
            var11 = this.field_a[var8];
            if (var12 != 0) {
              return;
            }
            if (var9 > var5) {
              var5 = var9;
            }
            if (var2_int > var9) {
              var2_int = var9;
            }
            if (var3 > var10) {
              var3 = var10;
            }
            if (var6 < var10) {
              var6 = var10;
            }
            if (var11 > var7) {
              var7 = var11;
            }
            if (var4 > var11) {
              var4 = var11;
            }
            var8++;
          }
          this.field_k = var7;
          this.field_x = var3;
          this.field_u = var4;
          this.field_t = var5;
          this.field_F = var2_int;
          this.field_G = var6;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "n.D(" + param0 + ')');
        }
    }

    private final void a(byte param0) {
        try {
          int var2_int = -17 / ((param0 + 40) / 34);
          this.field_p = false;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "n.F(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = stellarshard.field_B;
        try {
          var6_int = 0;
          while (this.field_n > var6_int) {
            this.field_f[var6_int] = (short)(param4 * this.field_f[var6_int] / param2);
            this.field_b[var6_int] = (short)(this.field_b[var6_int] * param3 / param2);
            this.field_a[var6_int] = (short)(this.field_a[var6_int] * param1 / param2);
            var6_int++;
            if (var7 != 0) {
              return;
            }
          }
          if (param0 != -12966) {
            this.field_A = (int[]) null;
          }
          this.a((byte) -93);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) runtimeException), "n.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static pb a(pb param0, byte param1, boolean param2) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        pb stackIn_6_0 = null;
        int stackIn_12_0 = 0;
        int stackIn_29_0 = 0;
        pb stackIn_40_0 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        pb var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var9Lifetime1;
        int var12Lifetime1;
        var20 = stellarshard.field_B;
        try {
          param0.b();
          var3_int = rc.a((byte) -61, param0.field_z[0]);
          var4 = var3_int >> 2 & 63;
          if (var4 > 0) {
            throw new IllegalArgumentException();
          }
          var5 = 3 & var3_int;
          var6 = 1;
          var7 = 1;
          if (param1 > -30) {
            stackIn_6_0 = (pb) null;
            return stackIn_6_0;
          }
          var8_int = 0;
          var9 = 1;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var8_int > var5))) {
            incrementValue$0 = var6;
            var6++;
            var7 = var7 + var9 * rc.a((byte) -61, param0.field_z[incrementValue$0]);
            stackIn_12_0 = var9 * 255;
            if (var20 == 0) {
              var9 = stackIn_12_0;
              var8_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_12_0 = var7;
          }
          var8 = new int[stackIn_12_0];
          var9Lifetime1 = 0;
          L3: while (true) {
            if (var7 > var9Lifetime1) {
              var10 = 0;
              var11 = 0;
              stackIn_29_0 = 1;
              if (var20 != 0) {
                break L3;
              }
              var12 = stackIn_29_0;
              while (var11 < 4) {
                incrementValue$1 = var6;
                var6++;
                var10 = var10 + rc.a((byte) -61, param0.field_z[incrementValue$1]) * var12;
                var12 = var12 * 255;
                var11++;
              }
              if (param2 &&
                0 == var10) {
                var10 = 16711935;
              }
              var8[var9Lifetime1] = var10;
              var9Lifetime1++;
              continue L3;
            }
            var9Lifetime1 = 255 * rc.a((byte) -61, param0.field_z[var6]) + rc.a((byte) -61, param0.field_z[var6 + 1]);
            var6 += 2;
            var10 = 255 * rc.a((byte) -61, param0.field_z[var6]) + rc.a((byte) -61, param0.field_z[var6 + 1]);
            var6 += 2;
            var11 = 255 * rc.a((byte) -61, param0.field_z[var6]) + rc.a((byte) -61, param0.field_z[1 + var6]);
            var6 += 2;
            stackIn_29_0 = rc.a((byte) -61, param0.field_z[var6]) * 255 + rc.a((byte) -61, param0.field_z[1 + var6]);
            break;
          }
          var12Lifetime1 = stackIn_29_0;
          var6 += 2;
          var13 = rc.a((byte) -61, param0.field_z[var6]) * 255 + rc.a((byte) -61, param0.field_z[1 + var6]);
          var6 += 2;
          var14 = rc.a((byte) -61, param0.field_z[var6]) * 255 + rc.a((byte) -61, param0.field_z[var6 + 1]);
          var6 += 2;
          var15 = new pb(var13, var14);
          var15.field_t = var9Lifetime1;
          var15.field_s = var10;
          var15.field_w = var11;
          var15.field_x = var12Lifetime1;
          var16 = 0;
          L10: while (var16 < var15.field_z.length) {
            var17 = 0;
            var18 = 0;
            var19 = 1;
            while (true) {
              if (var5 >= var18) {
                incrementValue$2 = var6;
                var6++;
                var17 = var17 + var19 * rc.a((byte) -61, param0.field_z[incrementValue$2]);
                var19 = var19 * 255;
                var18++;
                if (var20 == 0) {
                  continue;
                }
              } else {
                var15.field_z[var16] = var8[var17];
                var16++;
              }
              break;
            }
            if (var20 == 0) {
              continue L10;
            }
            break;
          }
          stackIn_40_0 = var15;
          return stackIn_40_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_44_0 = var3;
          stackIn_44_1 = new StringBuilder().append("n.E(");
          if (param0 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void d(byte param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int stackIn_12_0 = 0;
        boolean stackIn_54_0 = false;
        int stackIn_61_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_53_0;
        ha var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Object var3 = null;
        int var3_int = 0;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        fd var5_ref = null;
        fd var6 = null;
        String var6_ref = null;
        fd var7 = null;
        String var7_ref = null;
        int var8 = 0;
        Object var3Lifetime1;
        String var4_ref_StringLifetime1;
        var8 = stellarshard.field_B;
        try {
          var1 = ae.field_N;
          var2 = var1.f(4);
          if (var2 == 0) {
            if (ac.field_n == null) {
              ac.field_n = new sb(128);
              stellarshard.field_T = 0;
            }
            stackIn_12_0 = (var1.f(4) != 1) ? 0 : 1;
            var3_int = stackIn_12_0;
            var4_ref_String = var1.e((byte) 121);
            if (var3_int != 0) {
              var1.e((byte) 106);
            }
            var5_ref = ee.a(var4_ref_String, (byte) -98);
            var6_ref = var1.e((byte) 83);
            var7_ref = nh.a((CharSequence) ((Object) var4_ref_String), false);
            if (null == var7_ref) {
              var7_ref = var4_ref_String;
            }
            if (var5_ref == null) {
              var5_ref = ee.a(var6_ref, (byte) -98);
              if (var5_ref != null) {
                ac.field_n.a(var5_ref, (long)var7_ref.hashCode(), 1);
              }
            }
            if (null == var5_ref) {
              var5_ref = new fd();
              ac.field_n.a(var5_ref, (long)var7_ref.hashCode(), 1);
              fieldTemp$1 = stellarshard.field_T;
              stellarshard.field_T = stellarshard.field_T + 1;
              var5_ref.field_ob = fieldTemp$1;
              la.field_I.b(-51, var5_ref);
            }
            var5_ref.field_rb = var4_ref_String;
            return;
          }
          if (var2 != 1) {
            if (param0 != 4) {
              field_L = 19;
            }
            if (var2 == 2) {
              if (bi.field_r == 1) {
                bi.field_r = 2;
              }
              return;
            }
            if (var2 == 3) {
              if (2 == bi.field_r) {
                bi.field_r = 1;
              }
              return;
            }
            if (var2 != 4) {
              qe.a(106, "F1: " + bh.b((byte) -108), (Throwable) null);
              oj.c(-2290);
              return;
            }
            bi.field_r = 1;
            var3 = var1.e((byte) 117);
            uf.field_f = ((String) (var3)).intern();
            var4 = var1.f(4);
            pl.b((byte) 105, var4);
            return;
          }
          if (ac.field_k == null) {
            ac.field_k = new sb(128);
            bc.field_i = 0;
          }
          var3Lifetime1 = var1.e((byte) 83);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.e((byte) 93);
          var5 = var1.e((byte) 98);
          var6 = ck.a(true, var4_ref_StringLifetime1);
          if (var6 == null) {
            var6 = ck.a(true, var5);
            if (var6 != null) {
              ac.field_k.a(var6, (long)nh.a((CharSequence) ((Object) var4_ref_StringLifetime1), false).hashCode(), 1);
            }
          }
          if (null == var6) {
            var6 = new fd();
            ac.field_k.a(var6, (long)nh.a((CharSequence) ((Object) var4_ref_StringLifetime1), false).hashCode(), 1);
            fieldTemp$0 = bc.field_i;
            bc.field_i = bc.field_i + 1;
            var6.field_ob = fieldTemp$0;
            cm.field_c.b(-99, var6);
          }
          if (null != var3Lifetime1) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6.field_pb = (String) (var3Lifetime1);
          var6.field_rb = var4_ref_StringLifetime1;
          var6.c(param0 ^ 16);
          var7 = (fd) (cm.field_c.b(param0 - 95));
          L7: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (var7 != null) {
              stackOut_53_0 = uh.a(var7, 200, var6);
              stackIn_61_0 = stackOut_53_0 ? 1 : 0;
              stackIn_54_0 = stackOut_53_0;
              decompiledFrameRemainder0 = (var8 == 0);
              if ((decompiledFrameRemainder0) &&
                (stackIn_54_0)) {
                var7 = (fd) (cm.field_c.b((byte) -35));
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              if (null == var7) {
                break L7;
              }
              stackIn_61_0 = param0 + 108;
            }
            kk.a(stackIn_61_0, var6, var7);
            if (var8 == 0) {
              return;
            }
            break;
          }
          cm.field_c.b(param0 - 85, var6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1_ref), "n.I(" + param0 + ')');
        }
    }

    public static void c(byte param0) {
        if (param0 > -1) {
          return;
        }
        try {
          field_i = null;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "n.C(" + param0 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = stellarshard.field_B;
        try {
          if (param0 != 108) {
            this.field_s = (short[]) null;
          }
          var5_int = 0;
          while (this.field_n > var5_int) {
            this.field_f[var5_int] = (short)(this.field_f[var5_int] + param3);
            this.field_b[var5_int] = (short)(this.field_b[var5_int] + param1);
            this.field_a[var5_int] = (short)(this.field_a[var5_int] + param2);
            var5_int++;
            if (var6 != 0) {
              return;
            }
          }
          this.a((byte) -94);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var5), "n.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static am a(int param0) {
        String var1 = null;
        RuntimeException var1_ref = null;
        am stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 20) {
            field_d = 56;
          }
          var1 = tc.c(-5);
          if (null != var1 &&
            var1.indexOf('@') >= 0) {
            var1 = "";
          }
          stackIn_9_0 = new am(tc.c(-5), sa.a((byte) 105));
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1_ref), "n.A(" + param0 + ')');
        }
    }

    n() {
        this.field_N = (byte) 0;
        this.field_p = false;
    }

    static {
    }
}
