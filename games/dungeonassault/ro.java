/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ro extends kl {
    private int field_r;
    private int field_A;
    private int field_t;
    private wd field_o;
    private go field_p;
    static boolean field_B;
    private int field_z;
    private cn field_v;
    private pp field_s;
    private sa field_w;
    private cn field_q;
    private eh field_y;
    static boolean field_u;
    private int field_x;
    private int field_C;
    static String field_m;
    private int field_D;
    private dd field_n;

    final void b(int param0) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = DungeonAssault.field_K;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        int var4Lifetime6;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        int var4Lifetime7;
        int var4Lifetime8;
        int var4Lifetime9;
        int var4Lifetime10;
        int var5Lifetime5;
        int var5Lifetime6;
        int var6Lifetime5;
        int var6Lifetime6;
        int var4Lifetime1Lifetime1;
        int var4Lifetime1Lifetime2;
        int var4Lifetime2Lifetime1;
        int var4Lifetime2Lifetime2;
        int var4Lifetime3Lifetime1;
        super.b(-125);
        int var2 = (this.field_a - 200 >> 1) + this.field_k;
        int var3 = this.field_j + 80;
        gf.b(var2 - 5, -5 + var3, 210, 210, 0);
        rp.a(4, 202, (byte) 108, var2 - 1, 202, kc.field_S, -1 + var3);
        this.field_o.a(200, var3, (byte) 102, var2, 200);
        if (this.field_w == null) {
          this.a(this.field_k, -80 + (this.field_j + this.field_i), this.field_a, (byte) 4, 80);
          if (this.field_t == 5) {
            if (null == this.field_v) {
            } else {
              var4 = (-this.field_v.field_y + 200 >> 1) + var2;
              var5 = 192 + (-this.field_v.field_v + var3);
              if (100 <= this.field_z) {
                this.field_q.b(var4, var5, 256);
                this.field_v.h(var4, var5);
              } else {
                var6 = (this.field_z << 8) / 100;
                this.field_q.b(var4, var5, var6);
                this.field_v.d(var4, var5, var6);
              }
            }
            var4 = -49 % ((param0 - 41) / 63);
            return;
          }
          if (0 == this.field_t) {
            if (null == this.field_v) {
            } else {
              var4Lifetime7 = (-this.field_v.field_y + 200 >> 1) + var2;
              var5Lifetime5 = 192 + (-this.field_v.field_v + var3);
              if (100 <= this.field_z) {
                this.field_q.b(var4Lifetime7, var5Lifetime5, 256);
                this.field_v.h(var4Lifetime7, var5Lifetime5);
              } else {
                var6Lifetime5 = (this.field_z << 8) / 100;
                this.field_q.b(var4Lifetime7, var5Lifetime5, var6Lifetime5);
                this.field_v.d(var4Lifetime7, var5Lifetime5, var6Lifetime5);
              }
            }
            var4Lifetime7 = -49 % ((param0 - 41) / 63);
            return;
          }
          if (4 != this.field_t) {
            this.a((byte) -111, this.field_k - 18, -60 + this.field_i + this.field_j, this.field_A, false);
            this.a((byte) -109, this.field_a + this.field_k - 66, -60 + this.field_i + this.field_j, this.field_A - 8, true);
          }
          if (null == this.field_v) {
            var4Lifetime8 = -49 % ((param0 - 41) / 63);
            return;
          }
          var4Lifetime9 = (-this.field_v.field_y + 200 >> 1) + var2;
          var5Lifetime6 = 192 + (-this.field_v.field_v + var3);
          if (100 > this.field_z) {
            var6Lifetime6 = (this.field_z << 8) / 100;
            this.field_q.b(var4Lifetime9, var5Lifetime6, var6Lifetime6);
            this.field_v.d(var4Lifetime9, var5Lifetime6, var6Lifetime6);
            var4Lifetime9 = -49 % ((param0 - 41) / 63);
            return;
          }
          this.field_q.b(var4Lifetime9, var5Lifetime6, 256);
          this.field_v.h(var4Lifetime9, var5Lifetime6);
          var4Lifetime10 = -49 % ((param0 - 41) / 63);
          return;
        }
        this.field_w.a((byte) -108);
        if (this.field_t == 5) {
          if (null == this.field_v) {
            var4Lifetime1 = -49 % ((param0 - 41) / 63);
            return;
          }
          var4Lifetime1Lifetime1 = (-this.field_v.field_y + 200 >> 1) + var2;
          var5Lifetime1 = 192 + (-this.field_v.field_v + var3);
          if (100 > this.field_z) {
            var6Lifetime1 = (this.field_z << 8) / 100;
            this.field_q.b(var4Lifetime1Lifetime1, var5Lifetime1, var6Lifetime1);
            this.field_v.d(var4Lifetime1Lifetime1, var5Lifetime1, var6Lifetime1);
            var4Lifetime1Lifetime1 = -49 % ((param0 - 41) / 63);
            return;
          }
          this.field_q.b(var4Lifetime1Lifetime1, var5Lifetime1, 256);
          this.field_v.h(var4Lifetime1Lifetime1, var5Lifetime1);
          var4Lifetime1Lifetime2 = -49 % ((param0 - 41) / 63);
          return;
        }
        if (0 == this.field_t) {
          if (null == this.field_v) {
            var4Lifetime2 = -49 % ((param0 - 41) / 63);
            return;
          }
          var4Lifetime2Lifetime1 = (-this.field_v.field_y + 200 >> 1) + var2;
          var5Lifetime2 = 192 + (-this.field_v.field_v + var3);
          if (100 > this.field_z) {
            var6Lifetime2 = (this.field_z << 8) / 100;
            this.field_q.b(var4Lifetime2Lifetime1, var5Lifetime2, var6Lifetime2);
            this.field_v.d(var4Lifetime2Lifetime1, var5Lifetime2, var6Lifetime2);
            var4Lifetime2Lifetime1 = -49 % ((param0 - 41) / 63);
            return;
          }
          this.field_q.b(var4Lifetime2Lifetime1, var5Lifetime2, 256);
          this.field_v.h(var4Lifetime2Lifetime1, var5Lifetime2);
          var4Lifetime2Lifetime2 = -49 % ((param0 - 41) / 63);
          return;
        }
        if (4 == this.field_t) {
          if (null == this.field_v) {
          } else {
            var4Lifetime3 = (-this.field_v.field_y + 200 >> 1) + var2;
            var5Lifetime3 = 192 + (-this.field_v.field_v + var3);
            if (100 <= this.field_z) {
              this.field_q.b(var4Lifetime3, var5Lifetime3, 256);
              this.field_v.h(var4Lifetime3, var5Lifetime3);
            } else {
              var6Lifetime3 = (this.field_z << 8) / 100;
              this.field_q.b(var4Lifetime3, var5Lifetime3, var6Lifetime3);
              this.field_v.d(var4Lifetime3, var5Lifetime3, var6Lifetime3);
            }
          }
          var4Lifetime3Lifetime1 = -49 % ((param0 - 41) / 63);
          return;
        }
        this.a((byte) -111, this.field_k - 18, -60 + this.field_i + this.field_j, this.field_A, false);
        this.a((byte) -109, this.field_a + this.field_k - 66, -60 + this.field_i + this.field_j, this.field_A - 8, true);
        if (null == this.field_v) {
          var4Lifetime4 = -49 % ((param0 - 41) / 63);
          return;
        }
        var4Lifetime5 = (-this.field_v.field_y + 200 >> 1) + var2;
        var5Lifetime4 = 192 + (-this.field_v.field_v + var3);
        if (100 > this.field_z) {
          var6Lifetime4 = (this.field_z << 8) / 100;
          this.field_q.b(var4Lifetime5, var5Lifetime4, var6Lifetime4);
          this.field_v.d(var4Lifetime5, var5Lifetime4, var6Lifetime4);
          var4Lifetime5 = -49 % ((param0 - 41) / 63);
          return;
        }
        this.field_q.b(var4Lifetime5, var5Lifetime4, 256);
        this.field_v.h(var4Lifetime5, var5Lifetime4);
        var4Lifetime6 = -49 % ((param0 - 41) / 63);
    }

    private final int e(int param0) {
        int var2 = this.f(-2);
        if (var2 == 0) {
          return 0;
        }
        if (param0 <= -41) {
          return (int)((long)this.field_A * (long)this.field_D * (long)(var2 * 2 - this.field_A) / (long)(var2 * var2));
        }
        this.field_x = -95;
        return (int)((long)this.field_A * (long)this.field_D * (long)(var2 * 2 - this.field_A) / (long)(var2 * var2));
    }

    private final void a(byte param0, int param1, int param2, int param3, boolean param4) {
        if (param0 < -32) {
          if (param4) {
            if (param3 <= 0) {
              return;
            }
            this.a(tb.field_a, param2 - 24, (byte) 9, param1 + 2, param3);
            param3 -= 16;
            if (0 >= param3) {
              return;
            }
            this.a(tb.field_a, param2 - 24 + 15, (byte) 9, param1 + 22, param3);
            param3 -= 16;
            param2 -= 24;
          }
          while (param3 > 0) {
            this.a(n.field_e, param2, (byte) 9, param1, param3);
            param3 -= 16;
            if (param3 <= 0) {
              return;
            }
            this.a(n.field_e, param2 - 15, (byte) 9, param1 + 20, param3);
            param3 -= 16;
            if (param3 <= 0) {
              return;
            }
            this.a(tb.field_a, param2 - 24, (byte) 9, param1 + 2, param3);
            param3 -= 16;
            if (param3 <= 0) {
              return;
            }
            this.a(tb.field_a, -24 + (param2 + 15), (byte) 9, 22 + param1, param3);
            param2 -= 24;
            param3 -= 16;
          }
          return;
        }
        this.field_A = 117;
        if (param4) {
          if (param3 <= 0) {
            return;
          }
          this.a(tb.field_a, param2 - 24, (byte) 9, param1 + 2, param3);
          param3 -= 16;
          if (0 >= param3) {
            return;
          }
          this.a(tb.field_a, param2 - 24 + 15, (byte) 9, param1 + 22, param3);
          param3 -= 16;
          param2 -= 24;
        }
        while (param3 > 0) {
          this.a(n.field_e, param2, (byte) 9, param1, param3);
          param3 -= 16;
          if (param3 <= 0) {
            return;
          }
          this.a(n.field_e, param2 - 15, (byte) 9, param1 + 20, param3);
          param3 -= 16;
          if (param3 <= 0) {
            return;
          }
          this.a(tb.field_a, param2 - 24, (byte) 9, param1 + 2, param3);
          param3 -= 16;
          if (param3 <= 0) {
            return;
          }
          this.a(tb.field_a, -24 + (param2 + 15), (byte) 9, 22 + param1, param3);
          param2 -= 24;
          param3 -= 16;
        }
    }

    private final void a(q param0, int param1, byte param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = DungeonAssault.field_K;
        try {
          if (this.field_t != 1 &&
            param4 < 20) {
            return;
          }
          if (param2 != 9) {
            this.field_s = (pp) null;
          }
          if (param4 < 16) {
            param0.a(param3, (param4 << 2) + param1 - 64, param4 << 4);
          } else {
            if (param4 >= 18) {
              if (param4 < 20) {
                param0.a(param3, param4 + (-20 + param1));
              } else {
                param0.a(param3, param1);
              }
            } else {
              param0.a(param3, -param4 + 16 + param1);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("ro.R(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void d(int param0) {
        this.field_t = 4;
        this.field_D = 0;
        if (null != this.field_n) {
          this.field_n.b((byte) 30);
        }
        this.field_n = null;
        this.field_s.b((byte) 30);
        this.field_s = tn.a(this.field_k + (-jm.field_i.field_y + this.field_a >> 1), -jm.field_i.field_v + this.field_i + this.field_j, ne.field_c, jm.field_i, -124, tf.field_g);
        this.field_f.a(this.field_s, false);
        this.field_y.a((byte) -19);
        System.gc();
        this.field_o.a(ga.field_n, bo.field_Lb, -10872);
        this.field_A = 0;
        if (param0 == 2) {
          this.a(true, 16711680, al.field_n);
          return;
        }
    }

    public static void f(byte param0) {
        if (param0 >= -79) {
          pm var2 = (pm) null;
          ro.a((pm) null, 81, -61);
          field_m = null;
          return;
        }
        field_m = null;
    }

    final void a(byte param0, int param1) {
        this.field_C = 0;
        this.field_x = -1;
        this.field_t = 1;
        this.field_D = param1;
        if (param0 == 101) {
          if (this.field_n != null) {
            this.field_n.b((byte) 30);
          }
          this.field_n = null;
          return;
        }
        this.field_w = (sa) null;
        if (this.field_n != null) {
          this.field_n.b((byte) 30);
        }
        this.field_n = null;
    }

    final void a(int param0, int param1, byte param2) {
        int var4 = 37 % ((65 - param2) / 45);
        this.field_D = param1;
        this.field_t = 1;
        this.field_C = param0;
        int var5 = this.f(-2);
        this.field_x = var5 != 0 ? oi.b(0, this.f(-2)) : 0;
        if (null == this.field_n) {
          this.field_n = null;
          return;
        }
        this.field_n.b((byte) 30);
        this.field_n = null;
    }

    final void b(byte param0) {
        int var3_int = 0;
        int var9 = DungeonAssault.field_K;
        int[] var10 = new int[64];
        int[] var2 = var10;
        for (var3_int = 0; var3_int < 64; var3_int++) {
          var10[var3_int] = mp.a(-2147483648, 1579032 + var3_int * 65793);
        }
        cn var3 = te.a(this.field_a - 32, this.field_i - 28, var10, 16, 8, 0.125);
        int[] var4 = te.b(this.field_a - 32, -28 + this.field_i, 0.125);
        cn var5 = new cn(0, 0);
        var5.field_B = var4;
        var5.field_v = this.field_i - 28;
        var5.field_y = this.field_a - 32;
        ph var6 = new ph(var3, var5);
        cn var7 = new cn(this.field_a, this.field_i);
        cn var8 = new cn(this.field_a, this.field_i);
        this.field_l = new ph(var7, var8);
        jh.a(this.field_l);
        if (param0 == 37) {
          var6.b(16, 16);
          qe.a(23, 13, this.field_a - 46, -34 + this.field_i, 256, 32, 8, 128);
          jc.a(-26 + this.field_i, 16, 14, 1, 2, 1);
          jc.a(this.field_i - 26, this.field_a - 24, 14, 1, param0 ^ 39, 1);
          vd.a(-16 + this.field_a, 2, -14561, 2, 8, 0);
          vd.a(this.field_a, 2, -14561, 2, 0, 6);
          vd.a(this.field_a, 2, param0 - 14598, 2, 0, 54);
          vd.a(-16 + this.field_a, 2, -14561, 2, 8, this.field_i - 16);
          vd.a(this.field_a, 2, -14561, 2, 0, -22 + this.field_i);
          jc.a(40, 70, 14, 1, 2, 1);
          jc.a(40, this.field_a - 78, 14, 1, 2, 1);
          oe.field_m.h(8, 21);
          oe.field_m.j(-63 + this.field_a, 21);
          ad.field_e.i(23, -38 + this.field_i);
          ad.field_e.f(-39 + this.field_a, this.field_i - 38);
          da.a(ak.field_p, cm.field_M, this.field_a >> 1, 1917623617, (36 + ne.field_c.field_H >> 1) + 14, ne.field_c);
          jh.b();
          return;
        }
        this.a(-55, 119, -92, (byte) -82, -62);
        var6.b(16, 16);
        qe.a(23, 13, this.field_a - 46, -34 + this.field_i, 256, 32, 8, 128);
        jc.a(-26 + this.field_i, 16, 14, 1, 2, 1);
        jc.a(this.field_i - 26, this.field_a - 24, 14, 1, param0 ^ 39, 1);
        vd.a(-16 + this.field_a, 2, -14561, 2, 8, 0);
        vd.a(this.field_a, 2, -14561, 2, 0, 6);
        vd.a(this.field_a, 2, param0 - 14598, 2, 0, 54);
        vd.a(-16 + this.field_a, 2, -14561, 2, 8, this.field_i - 16);
        vd.a(this.field_a, 2, -14561, 2, 0, -22 + this.field_i);
        jc.a(40, 70, 14, 1, 2, 1);
        jc.a(40, this.field_a - 78, 14, 1, 2, 1);
        oe.field_m.h(8, 21);
        oe.field_m.j(-63 + this.field_a, 21);
        ad.field_e.i(23, -38 + this.field_i);
        ad.field_e.f(-39 + this.field_a, this.field_i - 38);
        da.a(ak.field_p, cm.field_M, this.field_a >> 1, 1917623617, (36 + ne.field_c.field_H >> 1) + 14, ne.field_c);
        jh.b();
    }

    final void c(int param0) {
        eh var4 = null;
        int var5 = DungeonAssault.field_K;
        super.c(-125);
        eh[] var6 = rg.field_M;
        eh[] var2 = var6;
        int var3 = 0;
        if (param0 >= -115) {
          return;
        }
        while (var6.length > var3) {
          var4 = var6[var3];
          var4.a((byte) -19);
          var3++;
        }
        bo.field_Lb.a((byte) -19);
        ce.field_v.a((byte) -19);
        kf.field_j.a((byte) -19);
    }

    ro(go param0) {
        super(300, 420);
        int var2_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        this.field_t = 0;
        try {
          this.field_p = param0;
          this.field_r = 16777215;
          this.field_D = 0;
          var2_int = this.field_p.field_Y.field_o;
          this.field_n = new dd(40 + this.field_k, this.field_i + this.field_j - 118, 0, this.field_a - 80, var2_int, this.field_D);
          t.a(64, gl.field_Ib, true, true);
          this.field_y = rg.field_M[0];
          this.field_o = new wd(this.field_y);
          if (this.field_p.field_Y.field_l <= 0) {
            this.field_s = tn.a((this.field_a - jm.field_i.field_y >> 1) + this.field_k, -jm.field_i.field_v + this.field_j + this.field_i, ne.field_c, jm.field_i, -75, pe.field_n);
            this.field_f.a(this.field_s, false);
            this.field_f.a(this.field_n, false);
            this.field_t = 0;
          } else {
            this.field_s = tn.a(this.field_k + (-jm.field_i.field_y + this.field_a >> 1), this.field_j + this.field_i - jm.field_i.field_v, ne.field_c, jm.field_i, -47, hj.field_X);
            this.field_f.a(this.field_s, false);
            this.field_t = 5;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ro.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final int f(int param0) {
        if (param0 != -2) {
          return -82;
        }
        return (int)(Math.log((double)(this.field_D + 1)) * 250.0 / Math.log(10.0));
    }

    private final void d(byte param0) {
        this.field_s.b((byte) 30);
        this.field_s = tn.a((this.field_a - jm.field_i.field_y >> 1) + this.field_k, -jm.field_i.field_v + (this.field_i + this.field_j), ne.field_c, jm.field_i, -64, tf.field_g);
        if (param0 > -86) {
          this.b((byte) -86);
          this.field_f.a(this.field_s, false);
          bo.field_Lb.a((byte) -19);
          this.field_t = 3;
          this.field_s.field_w = true;
          return;
        }
        this.field_f.a(this.field_s, false);
        bo.field_Lb.a((byte) -19);
        this.field_t = 3;
        this.field_s.field_w = true;
    }

    private final void a(boolean param0, int param1, String param2) {
        cn var5 = null;
        try {
          if (this.field_w == null) {
            this.field_w = new sa(60 + this.field_k, (la.field_b.field_H >> 1) - 120 + (this.field_i + this.field_j), this.field_a - 120, 80);
            this.field_w.field_k = 0;
            var5 = new cn(this.field_a - 120, 80);
            jh.a(var5);
            this.a(-60, -(la.field_b.field_H >> 1) + 40, this.field_a, (byte) 4, 120);
            jh.b();
            this.field_w.a(1929, true, var5);
          }
          this.field_w.a(param0, (String) null, (byte) 91, param2, param1);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "ro.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(String param0, int param1, int param2) {
        int var4_int = ne.field_c.b(param0);
        int var5 = ne.field_c.field_E + ne.field_c.field_H;
        if (param2 > -75) {
          return;
        }
        try {
          this.field_v = new cn(var4_int, var5);
          jh.a(this.field_v);
          ne.field_c.b(param0, 0, ne.field_c.field_H, param1, -1);
          this.field_q = rb.a(16, this.field_v, param1, (byte) 86);
          this.field_v.d(65793);
          jh.b();
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "ro.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void c(byte param0) {
        int var2;
        int var3;
        int var4;
        String var5;
        int var7;
        int var8;
        Object var9;
        String var10;
        String var11;
        String var12;
        String var13;
        Object var14;
        String var15;
        String var16;
        String var17;
        int var2Lifetime1;
        int var3Lifetime1;
        int var7Lifetime1;
        var8 = DungeonAssault.field_K;
        super.c((byte) -97);
        this.field_o.a((byte) 109, 20);
        if (null == this.field_w) {
          var2 = 93 % ((-34 - param0) / 57);
          if (this.field_v != null) {
            this.field_z = this.field_z + 1;
          }
          if (this.field_t != 5) {
            if (this.field_t == 0) {
              this.field_D = this.field_n.field_F;
              this.e((byte) -97);
              return;
            }
            if (this.field_t == 1) {
              this.field_A = this.field_A + 1;
              if (18 <= this.field_A) {
                if (0 != (7 & -18 + this.field_A)) {
                  if (this.field_x != -1 &&
                    this.field_A >= this.field_x) {
                    this.field_y.a((byte) -19);
                    System.gc();
                    this.field_o.a(ga.field_n, bo.field_Lb, -10872);
                    this.field_t = 2;
                    this.field_s.field_w = true;
                    return;
                  }
                  if (this.field_A >= this.f(-2)) {
                    System.gc();
                    this.field_p.c((byte) -121);
                    this.a(true, 16744448, jk.a(new String[]{Integer.toString(this.e(-90))}, wi.field_qb, 30496));
                    this.a(ac.field_h, 16744448, -84);
                    this.d((byte) -94);
                  }
                  return;
                }
                je.a(0, eb.field_O);
              }
              if (this.field_x != -1 &&
                this.field_A >= this.field_x) {
                this.field_y.a((byte) -19);
                System.gc();
                this.field_o.a(ga.field_n, bo.field_Lb, -10872);
                this.field_t = 2;
                this.field_s.field_w = true;
                return;
              }
              if (this.field_A < this.f(-2)) {
                return;
              }
              System.gc();
              this.field_p.c((byte) -121);
              this.a(true, 16744448, jk.a(new String[]{Integer.toString(this.e(-90))}, wi.field_qb, 30496));
              this.a(ac.field_h, 16744448, -84);
              this.d((byte) -94);
              return;
            }
            if (2 == this.field_t) {
              if (ga.field_n == this.field_o.field_k) {
                L12: {
                  this.field_o.a(ga.field_n, ce.field_v, -10872);
                  var3 = this.field_p.a(1, this.field_C);
                  var4 = in.a(var3, 8);
                  if (var3 != 0) {
                    if (var4 <= 1) {
                      var9 = null;
                      var7 = 0;
                      while (true) {
                        if (var7 >= 4) {
                          var5 = jk.a(new String[]{((String) (var9)).toUpperCase()}, rp.field_a, 30496);
                          break L12;
                        }
                        if ((1 << var7 & var3) == 0) {
                          var7++;
                          continue;
                        }
                        break;
                      }
                      var10 = this.field_p.field_Y.field_A[var7].field_n.field_F;
                      var11 = jk.a(new String[]{var10.toUpperCase()}, rp.field_a, 30496);
                      var5 = var11;
                      this.a(true, 16711680, sm.field_e + "<br><br>" + var11);
                      this.a(lp.field_n, 8421504, -103);
                      this.d((byte) -88);
                      return;
                    }
                    var5 = jk.a(new String[]{Integer.toString(var4)}, od.field_c, 30496);
                    var10 = var5;
                    var10 = var5;
                  } else {
                    var5 = l.field_f;
                  }
                }
                this.a(true, 16711680, sm.field_e + "<br><br>" + var5);
                this.a(lp.field_n, 8421504, -103);
                this.d((byte) -88);
                return;
              }
            } else {
              if (this.field_t == 4 &&
                this.field_o.field_k == ga.field_n) {
                this.field_o.a(ga.field_n, ce.field_v, -10872);
                this.d((byte) -108);
              }
            }
          }
          return;
        }
        this.field_w.a(false);
        var2Lifetime1 = 93 % ((-34 - param0) / 57);
        if (this.field_v != null) {
          this.field_z = this.field_z + 1;
        }
        if (this.field_t != 5) {
          if (this.field_t == 0) {
            this.field_D = this.field_n.field_F;
            this.e((byte) -97);
            return;
          }
          if (this.field_t == 1) {
            this.field_A = this.field_A + 1;
            if (18 <= this.field_A &&
              0 == (7 & -18 + this.field_A)) {
              je.a(0, eb.field_O);
            }
            if (this.field_x != -1 &&
              this.field_A >= this.field_x) {
              this.field_y.a((byte) -19);
              System.gc();
              this.field_o.a(ga.field_n, bo.field_Lb, -10872);
              this.field_t = 2;
              this.field_s.field_w = true;
              return;
            }
            if (this.field_A < this.f(-2)) {
              return;
            }
            System.gc();
            this.field_p.c((byte) -121);
            this.a(true, 16744448, jk.a(new String[]{Integer.toString(this.e(-90))}, wi.field_qb, 30496));
            this.a(ac.field_h, 16744448, -84);
            this.d((byte) -94);
            return;
          }
          if (2 == this.field_t) {
            if (ga.field_n != this.field_o.field_k) {
              return;
            }
            this.field_o.a(ga.field_n, ce.field_v, -10872);
            var3Lifetime1 = this.field_p.a(1, this.field_C);
            var4 = in.a(var3Lifetime1, 8);
            if (var3Lifetime1 == 0) {
              var12 = l.field_f;
              var16 = var12;
              var16 = var12;
              this.a(true, 16711680, sm.field_e + "<br><br>" + var12);
              this.a(lp.field_n, 8421504, -103);
              this.d((byte) -88);
              return;
            }
            if (var4 > 1) {
              var13 = jk.a(new String[]{Integer.toString(var4)}, od.field_c, 30496);
              var16 = var13;
              var16 = var13;
              this.a(true, 16711680, sm.field_e + "<br><br>" + var13);
              this.a(lp.field_n, 8421504, -103);
              this.d((byte) -88);
              return;
            }
            var14 = null;
            var7Lifetime1 = 0;
            while (true) {
              if (var7Lifetime1 >= 4) {
                var15 = jk.a(new String[]{((String) (var14)).toUpperCase()}, rp.field_a, 30496);
                this.a(true, 16711680, sm.field_e + "<br><br>" + var15);
                this.a(lp.field_n, 8421504, -103);
                this.d((byte) -88);
                return;
              }
              if ((1 << var7Lifetime1 & var3Lifetime1) == 0) {
                var7Lifetime1++;
                continue;
              }
              break;
            }
            var16 = this.field_p.field_Y.field_A[var7Lifetime1].field_n.field_F;
            var17 = jk.a(new String[]{var16.toUpperCase()}, rp.field_a, 30496);
            this.a(true, 16711680, sm.field_e + "<br><br>" + var17);
            this.a(lp.field_n, 8421504, -103);
            this.d((byte) -88);
            return;
          }
          if (this.field_t == 4 &&
            this.field_o.field_k == ga.field_n) {
            this.field_o.a(ga.field_n, ce.field_v, -10872);
            this.d((byte) -108);
          }
        }
        return;
    }

    final void a(boolean param0) {
        int var3 = DungeonAssault.field_K;
        super.a(param0);
        if (hh.field_s != this.field_s) {
          return;
        }
        if (this.field_t == 5) {
          this.field_f.a(this.field_n, param0);
          mi.a(this.field_s, pe.field_n, ne.field_c, 13195, jm.field_i);
          this.field_t = 0;
          return;
        }
        if (0 == this.field_t) {
          this.field_n.field_w = false;
          this.field_s.field_w = false;
          this.field_p.b(this.field_D, 69);
          return;
        }
        if (this.field_t > 1) {
          this.field_d = true;
          return;
        }
    }

    private final void a(int param0, int param1, int param2, byte param3, int param4) {
        int var6;
        int var7;
        int var8;
        double var9;
        double var11;
        int var13;
        int var14;
        var14 = DungeonAssault.field_K;
        var6 = this.field_D;
        if (this.field_t == 5) {
          db.field_v.a(jk.a(new String[]{gh.a(this.field_p.field_Y.field_l, (byte) -120)}, wm.field_e, 30496), 30 + param0, param1 - 20, param2 - 60, 40, 16777215, -1, 1, 1, la.field_b.field_H);
        } else {
          if (this.field_t != 0) {
            if (this.field_t != 4) {
              var7 = (param2 * 5 >> 3) + param0;
              var8 = param1 + 10;
              db.field_v.a(eh.field_a, var7, var8, 16777215, -1);
              db.field_v.b(Integer.toString(this.e(param3 - 60)), var7, var8, 16777215, -1);
            }
          } else {
            var7 = (3 * param2 >> 2) + param0;
            var8 = param1;
            db.field_v.a(ab.field_b, var7, var8, this.field_r, -1);
            db.field_v.b(Integer.toString(this.field_D), var7, var8, this.field_r, -1);
            var8 = var8 + (2 + db.field_v.field_H);
            db.field_v.a(li.field_e, var7, var8, this.field_r, -1);
            db.field_v.b((int)(0.5 + 100.0 * this.field_p.field_Y.b(gm.field_d.field_N, this.field_D, 82)) + "%", var7, var8, this.field_r, -1);
            var8 = var8 + (2 + db.field_v.field_H);
            if (var6 > this.field_p.field_Y.c(-82)) {
              db.field_v.a(oo.field_b, 30 + param0, -db.field_v.field_H + var8, param2 - 60, 30, this.field_r, -1, 1, 1, db.field_v.field_H);
            } else {
              if (var6 < 0) {
                db.field_v.a(jc.field_a, var7, var8, this.field_r, -1);
                db.field_v.b(gh.a(-var6, (byte) -123), var7, var8, this.field_r, -1);
                var8 = var8 + (2 + db.field_v.field_H);
              } else {
                db.field_v.a(kl.field_e, var7, var8, this.field_r, -1);
                db.field_v.b(gh.a(var6, (byte) -122), var7, var8, this.field_r, -1);
                var8 = var8 + (2 + db.field_v.field_H);
                var9 = (double)gm.field_d.field_b / (double)gm.field_d.field_l;
                var11 = Math.sqrt(var9);
                var13 = (int)Math.ceil((double)var6 * var11);
                if (var13 > gm.field_d.field_b) {
                  var13 = gm.field_d.field_b;
                }
                var6 = var6 - var13;
                db.field_v.a(nm.field_jb, var7, var8, this.field_r, -1);
                db.field_v.b(gh.a(var6, (byte) -106), var7, var8, this.field_r, -1);
                var8 = var8 + (db.field_v.field_H + 2);
              }
            }
          }
        }
        if (param3 == 4) {
          return;
        }
        this.c((byte) 44);
    }

    final static void a(pm param0, int param1, int param2) {
        wj var3 = null;
        try {
          var3 = ac.field_B;
          int var4 = -85 % ((-8 - param2) / 52);
          var3.d((byte) -126, param1);
          var3.a(6, param0.field_j);
          var3.a(6, param0.field_i);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "ro.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void e(byte param0) {
        int stackIn_7_1 = 0;
        int stackIn_10_0 = 0;
        pp stackIn_28_0 = null;
        boolean stackIn_30_1 = false;
        double var2;
        int var4;
        int var5;
        var2 = this.field_p.field_Y.b(gm.field_d.field_N, this.field_D, 69);
        if (param0 > -52) {
          return;
        }
        if (!(1.0 <= var2)) {
          if (!(var2 >= 0.5)) {
            stackIn_7_1 = 16777215;
          } else {
            stackIn_7_1 = 16776960;
          }
        } else {
          stackIn_7_1 = 16711680;
        }
        this.field_r = stackIn_7_1;
        stackIn_10_0 = (this.field_p.field_Y.b(gm.field_d.field_N, 0, 53) != 1.0) ? 0 : 1;
        var4 = stackIn_10_0;
        stackIn_28_0 = this.field_s;
        boolean decompiledFrameRemainder0 = true;
        if (var4 != 0) {
          stackIn_30_1 = true;
        } else {
          if (var2 < 1.0) {
            stackIn_28_0.field_w = true;
            if (!(this.field_D <= this.field_p.field_Y.c(-114))) {
              this.field_s.field_w = false;
              this.field_r = 16711680;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_30_1 = false;
          }
        }
        if (decompiledFrameRemainder0) {
          stackIn_28_0.field_w = stackIn_30_1;
          if (this.field_D > this.field_p.field_Y.c(-114)) {
            this.field_s.field_w = false;
            this.field_r = 16711680;
          }
        }
        var5 = (int)(var2 * 4.0);
        if (var5 > 3) {
          var5 = 3;
        }
        if (rg.field_M[var5] != this.field_y) {
          this.field_y = rg.field_M[var5];
          this.field_o = new wd(this.field_y);
        }
        return;
    }

    static {
        field_B = false;
        field_u = false;
        field_m = "Black Knight";
    }
}
