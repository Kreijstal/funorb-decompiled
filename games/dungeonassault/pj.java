/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj {
    static int[] field_e;
    static boolean[] field_w;
    wm field_v;
    static int field_x;
    String field_f;
    static gk field_c;
    static String field_n;
    static int field_a;
    static int field_r;
    ai[] field_h;
    wm field_p;
    static volatile long field_z;
    wm field_j;
    private wm field_d;
    int field_i;
    int field_B;
    int field_g;
    int field_y;
    int field_t;
    hb field_u;
    int field_k;
    hb[] field_A;
    private int field_s;
    int field_q;
    int field_l;
    int field_o;
    private wm field_b;
    wm field_m;

    pj(ec param0, boolean param1) {
        this();
        try {
          this.a(111, param1, param0);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "pj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        mo discarded$0 = null;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var11;
        ai var12;
        ai var13;
        ai var14;
        ai var15;
        ai var16;
        ai var17;
        ai var18;
        ai var19;
        ai var20;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        int var8Lifetime5;
        int var8Lifetime6;
        int var8Lifetime7;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var9Lifetime4;
        int var9Lifetime5;
        int var9Lifetime6;
        int var9Lifetime7;
        var11 = DungeonAssault.field_K;
        if (param1 <= 0) {
          return;
        }
        stackIn_5_0 = (param2 <= 6) ? 0 : 1;
        var4 = stackIn_5_0;
        if (param0 != -3) {
          var12 = (ai) null;
          discarded$0 = this.a(-113, (ai) null, (byte) -64, true);
        }
        stackIn_10_0 = (param2 >= 42) ? 0 : 1;
        var5 = stackIn_10_0;
        stackIn_13_0 = (param2 % 7 == 0) ? 0 : 1;
        var6 = stackIn_13_0;
        stackIn_16_0 = (param2 % 7 == 6) ? 0 : 1;
        var7 = stackIn_16_0;
        if (var4 != 0 &&
          var6 != 0) {
          var8 = param2 - 8;
          var9 = param1;
          if (!this.field_j.a(var8, (byte) 79)) {
            var13 = this.field_h[var8];
            if (var13.field_h != null &&
              2 == var13.field_h.field_g) {
              var13.field_q = var13.field_q + var9;
            }
          }
        }
        if (var4 != 0) {
          var8Lifetime1 = param2 - 7;
          var9Lifetime1 = param1;
          if (!this.field_j.a(var8Lifetime1, (byte) 78)) {
            var14 = this.field_h[var8Lifetime1];
            if (null != var14.field_h &&
              var14.field_h.field_g == 2) {
              var14.field_q = var14.field_q + var9Lifetime1;
            }
          }
        }
        if (var4 != 0 &&
          var7 != 0) {
          var8Lifetime2 = -6 + param2;
          var9Lifetime2 = param1;
          if (!this.field_j.a(var8Lifetime2, (byte) 90)) {
            var15 = this.field_h[var8Lifetime2];
            if (var15.field_h != null &&
              2 == var15.field_h.field_g) {
              var15.field_q = var15.field_q + var9Lifetime2;
            }
          }
        }
        if (var6 != 0) {
          var8Lifetime3 = param2 - 1;
          var9Lifetime3 = param1;
          if (!this.field_j.a(var8Lifetime3, (byte) 110)) {
            var16 = this.field_h[var8Lifetime3];
            if (var16.field_h != null &&
              var16.field_h.field_g == 2) {
              var16.field_q = var16.field_q + var9Lifetime3;
            }
          }
        }
        if (var7 != 0) {
          var8Lifetime4 = param2 + 1;
          var9Lifetime4 = param1;
          if (!this.field_j.a(var8Lifetime4, (byte) 124)) {
            var17 = this.field_h[var8Lifetime4];
            if (null != var17.field_h &&
              2 == var17.field_h.field_g) {
              var17.field_q = var17.field_q + var9Lifetime4;
            }
          }
        }
        if (var5 != 0 &&
          var6 != 0) {
          var8Lifetime5 = param2 + 6;
          var9Lifetime5 = param1;
          if (!this.field_j.a(var8Lifetime5, (byte) 82)) {
            var18 = this.field_h[var8Lifetime5];
            if (null != var18.field_h &&
              var18.field_h.field_g == 2) {
              var18.field_q = var18.field_q + var9Lifetime5;
            }
          }
        }
        if (var5 != 0) {
          var8Lifetime6 = 7 + param2;
          var9Lifetime6 = param1;
          if (!this.field_j.a(var8Lifetime6, (byte) 117)) {
            var19 = this.field_h[var8Lifetime6];
            if (var19.field_h != null &&
              var19.field_h.field_g == 2) {
              var19.field_q = var19.field_q + var9Lifetime6;
            }
          }
        }
        if (var5 != 0 &&
          var7 != 0) {
          var8Lifetime7 = 8 + param2;
          var9Lifetime7 = param1;
          if (!this.field_j.a(var8Lifetime7, (byte) 115)) {
            var20 = this.field_h[var8Lifetime7];
            if (var20.field_h != null &&
              2 == var20.field_h.field_g) {
              var20.field_q = var20.field_q + var9Lifetime7;
            }
          }
        }
        return;
    }

    final void a(int param0, int param1) {
        int var4 = 0;
        hb[] var3;
        hb var5;
        int var6;
        hb[] var7;
        var6 = DungeonAssault.field_K;
        this.a(false, 128);
        if (param0 != 32768) {
          field_r = -77;
        }
        this.field_g = param1;
        if (this.field_g != 1) {
          var7 = this.field_A;
          var3 = var7;
          for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (var5 != null &&
              var5.field_n.a(ob.field_ec, param0 ^ 32863)) {
              var5.a(false);
            }
          }
        }
    }

    final mo b(byte param0, int param1) {
        int stackIn_34_0 = 0;
        int stackIn_44_0 = 0;
        ai var3;
        ac var4;
        int var5;
        int var6;
        int var7;
        int var8;
        ai var9;
        int var7Lifetime1;
        if (null == this.field_u) {
          throw new IllegalStateException("Combat raider is null");
        }
        if (0 != (2 & this.field_u.field_o)) {
          throw new IllegalStateException("Combat raider is incapacitated.");
        }
        if ((this.field_u.field_o & 4) != 0) {
          throw new IllegalStateException("Combat raider is dead.");
        }
        var9 = this.field_h[this.field_B];
        var3 = var9;
        var4 = var9.field_h;
        var6 = 70 % ((param0 + 23) / 40);
        var5 = this.field_u.field_k;
        if ((2 & this.field_u.field_d) != 0) {
          var5 = var5 << 1;
        }
        var5 = var5 - this.field_i;
        if (0 > var5) {
          var5 = 0;
        }
        if (var4.a((byte) -59, 13)) {
          this.a(false);
        }
        if (var4.a((byte) -77, 14)) {
          var3.field_i = this.a(var9.field_p, (byte) 124, this.field_u.field_g);
        }
        if (1 == var9.field_h.field_g) {
          if (this.field_u.field_n.a(ob.field_hc, -67) &&
            var4.a((byte) -68, 11)) {
            this.a(false);
            return new mo(66, 36864);
          }
          if (this.a(var9.field_q, (byte) 126, var5)) {
            this.a(false);
            return new mo(66, 36864);
          }
          this.a(this.field_B, true, -12331);
          if (this.a(var9.field_r, (byte) 126, this.field_u.field_f)) {
            this.a(false);
            return new mo(66, 20480);
          }
          this.d(116);
          var7 = 0;
          if (0 != (this.field_u.field_o & 4)) {
            return new mo(66, 2048 | var7);
          }
          return new mo(66, 0 | var7);
        }
        if (var9.field_h.field_g != 2) {
          if (var9.field_h.field_g != 3) {
            throw new IllegalStateException("Can't enter combat in special room");
          }
          if (var4.a((byte) -53, 10)) {
            if (this.a(var9.field_r, (byte) 124, this.field_u.field_f)) {
              this.a(false);
              return new mo(66, 36864);
            }
            this.a(true, 116, this.field_B);
            this.d(27);
            return new mo(66, 0);
          }
          if (this.a(var9.field_q, (byte) 125, var5)) {
            this.a(false);
            return new mo(66, 36864);
          }
          this.a(this.field_B, true, -12331);
          this.d(105);
          return new mo(66, 0);
        }
        stackIn_34_0 = (!this.a(var5, (byte) 126, var9.field_q)) ? 0 : 1;
        var7Lifetime1 = stackIn_34_0;
        if (var7Lifetime1 != 0) {
          this.a(this.field_B, true, -12331);
        }
        if (var4.a((byte) -125, 3) &&
          var7Lifetime1 == 0) {
          if (!this.a(var9.field_r, (byte) 126, this.field_u.field_f)) {
            this.d(2);
            stackIn_44_0 = (0 != (4 & this.field_u.field_o)) ? 2048 : 0;
            var8 = stackIn_44_0;
          } else {
            this.a(false);
            var8 = 4096;
          }
          return new mo(66, var8);
        }
        if (var4.a((byte) -44, 15) &&
          var7Lifetime1 == 0) {
          this.b(-111);
          this.a(false, 32);
          this.a(false, 8);
          return new mo(66, 0);
        }
        return this.a(var7Lifetime1 != 0, var9, param1, (byte) 98);
    }

    private final void a(wm param0, ec param1, int param2) {
        int var4_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          param0.field_f[0] = param1.f(param2 + 22957);
          param0.field_f[1] = param1.k(0);
          var4_int = param1.c(true);
          param0.field_f[1] = mp.a(param0.field_f[1], nb.a(var4_int << 16, 65536));
          param0.field_f[0] = mp.a(param0.field_f[0], nb.a(254, var4_int) << 24);
          if (param2 != -23082) {
            this.field_t = -3;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_5_0 = var4;
          stackIn_5_1 = new StringBuilder().append("pj.KA(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(hb param0, int param1) {
        boolean discarded$1 = false;
        int var3_int = 0;
        hb[] var4 = null;
        int var5 = 0;
        hb var6 = null;
        int var7 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var7 = DungeonAssault.field_K;
        try {
          if (this.field_k != 128) {
            var3_int = 0;
            var4 = this.field_A;
            var5 = 0;
            while (true) {
              if (var4.length > var5) {
                var6 = var4[var5];
                if (var6 != null &&
                  0 == (6 & var6.field_o)) {
                  var3_int = 1;
                } else {
                  var5++;
                  continue;
                }
              }
              if (var3_int != 0) {
                break;
              }
              this.a(32768, 4);
              break;
            }
          }
          if (param1 != 6) {
            discarded$1 = this.a(67, (byte) -109, -29);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("pj.GA(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, boolean param1, ec param2) {
        ai dupTemp$0 = null;
        hb stackIn_19_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var4_intLifetime1;
        int var4_intLifetime2;
        var5 = DungeonAssault.field_K;
        try {
          this.a(105, param2, this.field_v);
          dupTemp$0 = new ai(3);
          this.field_h[48] = dupTemp$0;
          this.field_h[42] = dupTemp$0;
          this.field_h[6] = dupTemp$0;
          this.field_h[0] = dupTemp$0;
          this.field_h[24] = new ai(2);
          for (var4_int = 0; 49 > var4_int; var4_int++) {
            if (0 != var4_int &&
              var4_int != 6 &&
              var4_int != 24 &&
              var4_int != 42 &&
              var4_int != 48) {
              this.field_h[var4_int] = bl.a(param1, param2, false);
            }
          }
          this.a(this.field_p, param2, -23082);
          this.a(this.field_j, param2, -23082);
          this.field_q = param2.a((byte) 2);
          this.field_B = param2.a((byte) 2);
          for (var4_intLifetime1 = 0; var4_intLifetime1 < 4; var4_intLifetime1++) {
            this.field_A[var4_intLifetime1] = ep.a(var4_intLifetime1, -1, param2);
          }
          if (param0 < 57) {
            this.field_y = 110;
          }
          var4_intLifetime2 = param2.c(true);
          if (4 > var4_intLifetime2) {
            stackIn_19_1 = this.field_A[var4_intLifetime2];
          } else {
            stackIn_19_1 = null;
          }
          this.field_u = stackIn_19_1;
          this.field_g = param2.c(true);
          this.a(false, param2.c(true));
          this.field_t = param2.c(true);
          this.field_s = param2.c(true);
          if (param1) {
            this.field_f = param2.a(-21030);
          } else {
            this.field_o = param2.f(-110);
            this.field_y = param2.f(-94);
            this.field_l = param2.f(-107);
            this.a(this.field_d, param2, -23082);
          }
          if (this.field_q != -1) {
            this.a(this.field_q, (byte) 107);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_27_0 = var4;
          stackIn_27_1 = new StringBuilder().append("pj.Q(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    private final boolean a(int param0, byte param1, int param2) {
        int var4;
        boolean stackIn_7_0 = false;
        boolean stackIn_16_0 = false;
        boolean stackIn_22_0 = false;
        if (param1 < 123) {
          return false;
        }
        if (param2 == 0) {
          stackIn_7_0 = (param0 == 0) && (oi.b(0, 2) == 0);
          return stackIn_7_0;
        }
        if (0 == param0) {
          return true;
        }
        var4 = param2 - param0;
        if (var4 < -10) {
          return false;
        }
        if (0 > var4) {
          var4 = 1 << -var4;
          stackIn_16_0 = (oi.b(0, 1 + var4) == 0);
          return stackIn_16_0;
        }
        if (var4 > 10) {
          return true;
        }
        var4 = 1 << var4;
        stackIn_22_0 = (oi.b(0, 1 + var4) != 0);
        return stackIn_22_0;
    }

    private final mo a(boolean param0, ai param1, int param2, byte param3) {
        int stackIn_4_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_22_1 = 0;
        mo stackIn_30_0 = null;
        int stackIn_34_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_50_0 = 0;
        mo stackIn_94_0 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        String stackIn_98_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        h var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        hb var19 = null;
        int var13Lifetime1;
        var18 = DungeonAssault.field_K;
        try {
          stackIn_4_0 = (param0) ? 0 : 1;
          var5_int = stackIn_4_0;
          var6 = this.field_u.field_n;
          if (var6.a(ob.field_Ob, param3 - 223)) {
            var5_int = 1;
          }
          if (param2 == 2) {
            var5_int = 0;
          }
          var7 = 0;
          var8 = param1.field_h.a(0, 17);
          var9 = this.field_u.field_g;
          if (param3 != 98) {
            var19 = (hb) null;
            this.a((hb) null, -125);
          }
          var10 = this.field_u.field_e;
          var11 = param1.field_p;
          var12 = param1.field_g;
          if ((1 & this.field_u.field_d) != 0) {
            var9 = var9 << 1;
          }
          if ((1 & this.field_t) == 0) {
            stackIn_19_0 = ((this.field_u.field_d & 4) != 0) ? 1 : 0;
          } else {
            stackIn_19_0 = 1;
          }
          var13 = stackIn_19_0;
          stackIn_21_0 = var13;
          if (param1.field_h.field_g != 2) {
            stackIn_22_1 = 0;
          } else {
            stackIn_22_1 = 1;
          }
          var13Lifetime1 = stackIn_21_0 & stackIn_22_1;
          if (var13Lifetime1 != 0) {
            var12 = var12 + 1 >> 1;
            var11 = var11 + 1 >> 1;
          }
          var11 = var11 - this.field_i;
          if (var11 < 0) {
            var11 = 0;
          }
          if (param1.field_h.a((byte) -115, 7) &&
            var9 << 1 <= var11) {
            this.a(param3 + 32670, 3);
            stackIn_30_0 = new mo(66, 32768);
            return stackIn_30_0;
          }
          stackIn_34_0 = (!param0) ? 0 : 16384;
          var14 = stackIn_34_0;
          if (var5_int != 0) {
            var14 = var14 | 8192;
          }
          if (2 == param2) {
            var14 = var14 | 32768;
          }
          if (param2 == 1) {
            var10++;
            var9--;
          }
          var15 = 0;
          L15: while (true) {
            var15++;
            if (var5_int != 0) {
              if (param2 != 2) {
                stackIn_47_0 = var10;
              } else {
                stackIn_47_0 = this.field_u.field_f;
              }
              var16 = stackIn_47_0;
              if (param2 != 2) {
                stackIn_50_0 = var12;
              } else {
                stackIn_50_0 = param1.field_r;
              }
              var17 = stackIn_50_0;
              if (param2 != 2 &&
                var6.a(ob.field_jc, 87) &&
                var7 == 0) {
                var16 = var16 << 1;
                var14 = var14 | 1024;
                var7 = 1;
              }
              if (this.a(var17, (byte) 124, var16) ||
                var15 > 100) {
                if (2 == param2) {
                  this.a(-8);
                  var14 = var14 | 4096;
                  break L15;
                }
                if (0 >= var8) {
                  this.a(false);
                  var14 = var14 | 4096;
                  break L15;
                }
                var14 = var14 | 512;
                var8--;
              }
              if ((0 == var16 &&
                var17 != 0 ||
                var17 > 10 + var16) &&
                (param1.field_p == 0 &&
                0 != this.field_u.field_g ||
                !(10 + param1.field_p >= this.field_u.field_g))) {
                var14 = var14 | 4096;
                if (2 == param2) {
                  this.a(-8);
                } else {
                  this.a(false);
                }
                var15 = 5;
                break L15;
              }
            }
            var5_int = 1;
            if (!this.a(var9, (byte) 127, var11)) {
              continue;
            }
            if (var6.a(ob.field_kc, 87) &&
              this.field_u.field_o == 0) {
              this.field_u.field_o = this.field_u.field_o | 1;
              continue;
            }
            if (var6.a(ob.field_mc, 119) &&
              var7 == 0) {
              var14 = var14 | 1024;
              var7 = 1;
              continue;
            }
            this.d(param3 - 183);
            if ((4 & this.field_u.field_o) == 0) {
              if (var15 > 5) {
                var15 = 5;
              }
              return new mo(66, var14 | var15);
            }
            var14 = var14 | 2048;
            break;
          }
          if (var15 > 5) {
            var15 = 5;
          }
          stackIn_94_0 = new mo(66, var14 | var15);
          return stackIn_94_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_97_0 = var5;
          stackIn_97_1 = new StringBuilder().append("pj.LA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_98_2 = "null";
          } else {
            stackIn_98_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_97_0), ((StringBuilder) (Object) stackIn_97_1).append(stackIn_98_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void e(int param0) {
        field_c = null;
        field_e = null;
        field_n = null;
        field_w = null;
        if (param0 < 111) {
          pj.a(43, 127L);
        }
    }

    final double b(int param0, int param1, int param2) {
        if (param2 <= 45) {
          return -0.5947890367550314;
        }
        return this.c(param0, this.field_y, param1, 2, this.field_o);
    }

    final void a(int param0, boolean param1, int param2) {
        ai var4 = this.field_h[param0];
        ac var5 = var4.field_h;
        this.e(var5.a(param2 ^ param2, 9), param2 ^ -21561);
        this.a(-3, var5.a(0, 5), param0);
    }

    final void a(boolean param0, int param1) {
        hb[] var3;
        int var4;
        hb var5;
        int var6;
        hb[] var7;
        hb[] var8;
        int var9;
        hb var10;
        int var4Lifetime1;
        hb[] var3Lifetime1;
        var6 = DungeonAssault.field_K;
        this.field_k = param1;
        if (32 == this.field_k) {
          var7 = this.field_A;
          var3 = var7;
          for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_d = 0;
            }
          }
          this.field_t = 0;
        }
        this.field_i = 0;
        if (param0) {
          return;
        }
        var8 = this.field_A;
        var3Lifetime1 = var8;
        var9 = 0;
        var4Lifetime1 = var9;
        while (var9 < var8.length) {
          var10 = var8[var9];
          if (var10 != null &&
            var10.field_n.a(ob.field_gc, -91) &&
            0 == (var10.field_o & 6)) {
            this.field_i = this.field_i + 1;
          }
          var9++;
        }
        return;
    }

    final mo b(int param0, int param1, int param2, int param3, int param4) {
        if (param2 != 18833) {
          this.field_t = 19;
        }
        ec var6 = new ec(3);
        var6.i(param3, -128);
        if (this.a(param4, param3, param2 + 18031, param1, param0)) {
          var6.a(6, 16 | this.a((byte) 47));
          this.a(32768, 2);
        } else {
          var6.a(6, 0);
          this.a(32768, 1);
        }
        return new mo(68, var6);
    }

    final void a(int param0, hb param1) {
        int var3_int = 1;
        h var4 = param1.field_n;
        if (var4.a(ob.field_kc, -92) &&
          0 == (param1.field_o & 1)) {
          return;
        }
        try {
          if (var4.a(ob.field_Vb, 101)) {
            var3_int = 0;
          }
          if (var4.a(ob.field_Sb, -88) &&
            !(param1.field_g <= 1)) {
            param1.field_g = param1.field_g - 1;
            var3_int = 0;
          }
          if (var3_int == 0) {
            param1.a(3);
          } else {
            param1.a(false);
          }
          param1.field_o = param1.field_o | 8;
          if (param0 <= 97) {
            this.field_g = 87;
          }
          this.a(param1, 6);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "pj.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final int a(int param0, boolean param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = DungeonAssault.field_K;
        int[] var9 = this.a((byte) -107, param0);
        int[] var3 = var9;
        int[] var8 = var9;
        int[] var4 = var8;
        int var5Lifetime1;
        int var6Lifetime1;
        for (var5 = 0; var5 < var8.length; var5++) {
          var6 = var8[var5];
          if (~this.field_q == ~var6) {
            return this.field_q;
          }
        }
        var4 = var9;
        for (var5Lifetime1 = 0; var5Lifetime1 < var4.length; var5Lifetime1++) {
          var6Lifetime1 = var4[var5Lifetime1];
          if (this.field_m.a(var6Lifetime1, (byte) 70)) {
            return var6Lifetime1;
          }
        }
        if (!param1) {
          field_w = (boolean[]) null;
        }
        return -1;
    }

    final boolean b(int param0, hb param1) {
        RuntimeException stackIn_126_0 = null;
        StringBuilder stackIn_126_1 = null;
        String stackIn_127_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        hb[] var5 = null;
        int var6 = 0;
        hb var7 = null;
        int var8 = 0;
        hb[] var9 = null;
        hb[] var10 = null;
        hb var11 = null;
        hb[] var12 = null;
        hb var13 = null;
        hb var14 = null;
        hb[] var5Lifetime1;
        hb var7Lifetime1;
        hb[] var5Lifetime2;
        hb var7Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        var8 = DungeonAssault.field_K;
        try {
          if (param1 == null) {
            return false;
          }
          var3_int = param1.field_o;
          var4 = param1.field_n.field_s;
          if (var4 == -1) {
            return false;
          }
          if (param0 != (var3_int & 1)) {
            return false;
          }
          if (0 != (var3_int & 6)) {
            if (var4 != ob.field_nc &&
              var4 != ob.field_Ib) {
              return false;
            }
            if (param1.field_g <= 0) {
              return false;
            }
          }
          if (this.field_k == 128) {
            if ((var4 == ob.field_nc ||
              ob.field_Ib == var4) && var3_int == 12) {
              var9 = this.field_A;
              var5 = var9;
              for (var6 = 0; var6 < var9.length; var6++) {
                var11 = var9[var6];
                var7 = var11;
                if (var11 != null &&
                  (var11.field_o & 6) == 0) {
                  if (var11.field_n.field_z == 0) {
                    return true;
                  }
                  if (var4 == ob.field_Ib &&
                    1 == var11.field_n.field_z) {
                    return true;
                  }
                }
              }
            }
            if (ob.field_Mb == var4) {
              if (var3_int != 0) {
                return false;
              }
              var5Lifetime2 = this.field_A;
              for (var6Lifetime3 = 0; var6Lifetime3 < var5Lifetime2.length; var6Lifetime3++) {
                var7Lifetime2 = var5Lifetime2[var6Lifetime3];
                if (var7Lifetime2 != null &&
                  (4 & var7Lifetime2.field_o) != 0 &&
                  var7Lifetime2.field_g > 0) {
                  return true;
                }
              }
            }
            return false;
          }
          if (this.field_k == 32 &&
            this.field_u != param1) {
            return false;
          }
          if ((this.field_k & ob.field_cc[var4]) == 0) {
            return false;
          }
          if (this.field_u != param1) {
            if (var4 == ob.field_Wb) {
              return false;
            }
            if (ob.field_nc == var4) {
              return false;
            }
            if (var4 == ob.field_Ib) {
              return false;
            }
            if (var4 == ob.field_lc) {
              return false;
            }
            if (var4 == ob.field_Gb) {
              return false;
            }
            if (ob.field_Ub == var4) {
              return false;
            }
            if (ob.field_Zb == var4) {
              return false;
            }
          }
          if (ob.field_Mb == var4) {
            var12 = this.field_A;
            for (var6Lifetime1 = 0; var12.length > var6Lifetime1; var6Lifetime1++) {
              var13 = var12[var6Lifetime1];
              if (var13 != null &&
                (4 & var13.field_o) != 0 &&
                var13.field_g > 0) {
                return true;
              }
            }
            return false;
          }
          if (ob.field_lc == var4 &&
            this.field_h[this.field_B].field_h.field_g == 1) {
            return false;
          }
          if (var4 != ob.field_nc &&
            var4 != ob.field_Ib) {
            return true;
          }
          var10 = this.field_A;
          var5Lifetime1 = this.field_A;
          for (var6Lifetime2 = 0; var6Lifetime2 < var10.length; var6Lifetime2++) {
            var14 = var10[var6Lifetime2];
            var7Lifetime1 = var14;
            if (var7Lifetime1 != null &&
              (6 & var14.field_o) == 0) {
              if (var14.field_n.field_z == 0) {
                return true;
              }
              if (var4 == ob.field_Ib &&
                var14.field_n.field_z == 1) {
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_126_0 = var3;
          stackIn_126_1 = new StringBuilder().append("pj.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_127_2 = "null";
          } else {
            stackIn_127_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_126_0), ((StringBuilder) (Object) stackIn_126_1).append(stackIn_127_2).append(')').toString());
        }
    }

    private final boolean a(int param0, int param1, int param2, int param3, int param4) {
        boolean stackIn_7_0 = false;
        if (param2 != 36864) {
          this.a((byte) 20, -103, true);
        }
        stackIn_7_0 = !(param4 >= param1) || ((ha.a((byte) -21) < this.c(param3, param0, param1, 2, param4)));
        return stackIn_7_0;
    }

    final wm b(byte param0) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        md var9;
        wm var10;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = DungeonAssault.field_K;
        var10 = new wm(84);
        var3 = 0;
        if (param0 > -1) {
          var9 = (md) null;
          this.a((md) null, -59, -23, 96, true);
        }
        for (var4 = 0; var4 < 7; var4++) {
          for (var5 = 0; 6 > var5; var5++) {
            var6 = var4 * 7 + var5;
            var7 = var6 + 1;
            if (!this.field_p.a(var6, (byte) 84)) {
              if (this.field_p.a(var7, (byte) 120)) {
                var10.a(var3, -94);
              }
            } else {
              var10.a(var3, -94);
            }
            var3++;
          }
        }
        for (var4Lifetime1 = 0; var4Lifetime1 < 6; var4Lifetime1++) {
          for (var5Lifetime1 = 0; var5Lifetime1 < 7; var5Lifetime1++) {
            var6Lifetime1 = var5Lifetime1 + 7 * var4Lifetime1;
            var7Lifetime1 = 7 + var6Lifetime1;
            if (!this.field_p.a(var6Lifetime1, (byte) 90)) {
              if (this.field_p.a(var7Lifetime1, (byte) 80)) {
                var10.a(var3, -79);
              }
            } else {
              var10.a(var3, -79);
            }
            var3++;
          }
        }
        return var10;
    }

    private final void e(int param0, int param1) {
        int var3 = 0;
        int var4;
        int var5;
        int var7;
        ai var6;
        var7 = DungeonAssault.field_K;
        if (param0 <= 0) {
          return;
        }
        if (param1 != 25618) {
          this.b(-100, 90, 70, -104, 105);
        }
        for (var3 = 0; var3 < 49; var3++) {
          var4 = var3;
          var5 = param0;
          if (!this.field_j.a(var4, (byte) 104)) {
            var6 = this.field_h[var4];
            if (null != var6.field_h &&
              var6.field_h.field_g == 2) {
              var6.field_q = var6.field_q + var5;
            }
          }
        }
    }

    final mo c(int param0, int param1) {
        ac var4;
        int var5;
        int var6;
        ai var7;
        if (this.field_u == null) {
          throw new IllegalStateException("Combat raider is null");
        }
        if (0 != (2 & this.field_u.field_o)) {
          throw new IllegalStateException("Combat raider is incapacitated.");
        }
        if ((4 & this.field_u.field_o) != 0) {
          throw new IllegalStateException("Combat raider is dead.");
        }
        var7 = this.field_h[this.field_B];
        var4 = var7.field_h;
        var5 = this.field_u.field_k;
        if ((2 & this.field_u.field_d) != 0) {
          var5 = var5 << 1;
        }
        var5 = var5 - this.field_i;
        if (0 > var5) {
          var5 = 0;
        }
        if (param0 >= -86) {
          field_e = (int[]) null;
        }
        if (var7.field_h.field_g == 1) {
          if (this.field_u.field_n.a(ob.field_hc, 72) &&
            var4.a((byte) -49, 11)) {
            this.a(false);
            return new mo(66, 36864);
          }
          if (this.a(this.field_u.field_f, (byte) 127, var5)) {
            this.a(false);
            return new mo(66, 36864);
          }
          this.a(this.field_B, true, -12331);
          this.a(false);
          return new mo(66, 20480);
        }
        if (var7.field_h.field_g == 2) {
          var6 = this.a(var5, (byte) 126, var7.field_q) ? 1 : 0;
          if (var6 != 0) {
            this.a(this.field_B, true, -12331);
          }
          return this.a(param1, var7, (byte) 26, var6 != 0);
        }
        if (var7.field_h.field_g != 3) {
          throw new IllegalStateException("Can't enter combat in special room");
        }
        if (!var4.a((byte) -65, 10)) {
          if (this.a(var7.field_q, (byte) 127, var5)) {
            this.a(false);
            return new mo(66, 36864);
          }
          this.a(this.field_B, true, -12331);
          this.d(113);
          return new mo(66, 0);
        }
        if (this.a(var7.field_r, (byte) 124, this.field_u.field_f)) {
          this.a(false);
          return new mo(66, 36864);
        }
        this.a(true, 123, this.field_B);
        this.d(124);
        return new mo(66, 0);
    }

    final void a(hb param0, boolean param1, int param2) {
        ai var5 = null;
        boolean stackIn_11_1 = false;
        boolean stackIn_15_1 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          this.field_B = this.a(param2, param1);
          if (this.field_B != -1) {
            this.b(-92);
          }
          this.field_p.a(param2, -118);
          this.field_B = param2;
          var5 = this.field_h[param2];
          if (0 == var5.field_a ||
            var5.field_a == 3) {
            this.field_j.a(param2, -113);
            this.field_d.a(param2, -77);
          }
          if (2 != var5.field_a &&
            !this.field_j.a(param2, (byte) 117)) {
            stackIn_11_1 = !(param1);
            this.a(stackIn_11_1, 16);
            this.field_u = param0;
            return;
          }
          this.b(-113);
          stackIn_15_1 = !(param1);
          this.a(stackIn_15_1, 8);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("pj.V(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(boolean param0, int param1, int param2) {
        ai var4 = this.field_h[param2];
        ac var5 = var4.field_h;
        if (param1 < 112) {
          return;
        }
        this.e(var5.a(0, 8), 25618);
        this.a(-3, var5.a(0, 4), param2);
    }

    final int[] b(int param0, byte param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int var6 = 0;
        int var3;
        int[] var4;
        int var5;
        int var7;
        var7 = DungeonAssault.field_K;
        var3 = 0;
        if (param0 % 7 != 0) {
          if (this.field_v.a(param0 - 1 - param0 / 7, (byte) 116)) {
            incrementValue$0 = var3;
            var3++;
            ia.field_S[incrementValue$0] = param0 - 1 - param0 / 7;
            if (param0 % 7 != 6 &&
              this.field_v.a(param0 - param0 / 7, (byte) 125)) {
              incrementValue$1 = var3;
              var3++;
              ia.field_S[incrementValue$1] = -(param0 / 7) + param0;
            }
          } else {
            if (param0 % 7 != 6 &&
              this.field_v.a(param0 - param0 / 7, (byte) 125)) {
              incrementValue$2 = var3;
              var3++;
              ia.field_S[incrementValue$2] = -(param0 / 7) + param0;
            }
          }
        } else {
          if (param0 % 7 != 6 &&
            this.field_v.a(param0 - param0 / 7, (byte) 125)) {
            incrementValue$3 = var3;
            var3++;
            ia.field_S[incrementValue$3] = -(param0 / 7) + param0;
          }
        }
        if (6 < param0 &&
          this.field_v.a(35 + param0, (byte) 88)) {
          incrementValue$4 = var3;
          var3++;
          ia.field_S[incrementValue$4] = 35 + param0;
        }
        if (param0 < 42 &&
          this.field_v.a(param0 + 42, (byte) 77)) {
          incrementValue$5 = var3;
          var3++;
          ia.field_S[incrementValue$5] = param0 + 42;
        }
        var4 = new int[var3];
        var5 = 111 % ((param1 - 29) / 45);
        for (var6 = 0; var6 < var3; var6++) {
          var4[var6] = ia.field_S[var6];
        }
        return var4;
    }

    final int c(int param0) {
        int var4 = 0;
        int var2;
        hb[] var3_ref_hb__;
        hb var5;
        int var6;
        int var3;
        var6 = DungeonAssault.field_K;
        var2 = 0;
        var3_ref_hb__ = this.field_A;
        for (var4 = 0; var4 < var3_ref_hb__.length; var4++) {
          var5 = var3_ref_hb__[var4];
          if (var5 != null &&
            (var5.field_o & 6) == 0) {
            var2 = var2 + (var5.field_k + var5.field_e - (-var5.field_g - var5.field_f));
          }
        }
        if (param0 > -77) {
          field_w = (boolean[]) null;
        }
        var3 = 100 * var2;
        if (var3 > 50000) {
          var3 = 50000;
        }
        if (this.field_o < var3) {
          var3 = this.field_o;
        }
        return var3;
    }

    final int[] a(byte param0, int param1) {
        int var3 = -77 % ((param0 - 41) / 40);
        return nf.a(this.field_v, param1, (byte) 123);
    }

    private final void a(byte param0, int param1, boolean param2) {
        int var10 = 0;
        ac var5;
        int var6;
        int var7;
        int var8;
        hb[] var9;
        hb var11;
        int var12;
        ai var13;
        var12 = DungeonAssault.field_K;
        var13 = this.field_h[param1];
        if (param0 != -52) {
          pj.e(-22);
        }
        var5 = var13.field_h;
        if (param2) {
          var6 = var5.a(param0 ^ -52, 0);
          var7 = var5.a(0, 1);
          this.a(var7, var6, this.field_u, -110);
          if (var5.a((byte) -88, 6)) {
            if (var13.field_h.field_k << 1 > var13.field_l) {
              var13.field_g = var13.field_g + 1;
              var13.field_l = var13.field_l + 1;
            }
            if (var13.field_h.field_A << 1 > var13.field_j) {
              var13.field_p = var13.field_p + 1;
              var13.field_j = var13.field_j + 1;
            }
          }
          var8 = var5.a(0, 16);
          if (var8 > 0) {
            var9 = this.field_A;
            for (var10 = 0; var10 < var9.length; var10++) {
              var11 = var9[var10];
              if (var11 != null &&
                0 == (6 & var11.field_o)) {
                this.a(var8, var8, var11, param0 ^ 124);
              }
            }
          }
        }
    }

    final void b(int param0) {
        if (-1 != this.field_q &&
          this.field_h[this.field_q].field_h.a((byte) -64, 2)) {
          this.field_j.b(this.field_q, 31);
        }
        if (param0 > -83) {
          return;
        }
        this.field_q = this.field_B;
        this.a(this.field_q, (byte) -90);
    }

    final static void a(int param0, long param1) {
        if ((long)param0 >= param1) {
          return;
        }
        if (param1 % 10L != 0L) {
          ln.a(param1, (byte) -113);
        } else {
          ln.a(param1 - 1L, (byte) -107);
          ln.a(1L, (byte) -73);
        }
    }

    final void a(boolean param0) {
        this.field_j.a(this.field_B, -108);
        this.field_d.a(this.field_B, -72);
        ai var3 = this.field_h[this.field_B];
        ai var2 = var3;
        if (var3.field_l > var3.field_h.field_k) {
          var2.field_l = var3.field_h.field_k;
        }
        if (var3.field_h.field_y < var3.field_s) {
          var2.field_s = var3.field_h.field_y;
        }
        if (var3.field_o > var3.field_h.field_r) {
          var2.field_o = var3.field_h.field_r;
        }
        if (var3.field_h.field_A < var3.field_j) {
          var2.field_j = var3.field_h.field_A;
        }
        this.b(-111);
        this.a(false, 32);
        this.a(param0, 8);
    }

    final void d(int param0) {
        int var10 = 0;
        int stackIn_6_0 = 0;
        ac var3;
        int var4;
        h var5;
        int var6;
        int var7;
        int var8;
        hb[] var9;
        hb var11;
        int var12;
        ai var13;
        var12 = DungeonAssault.field_K;
        var13 = this.field_h[this.field_B];
        var3 = var13.field_h;
        var4 = var3.field_g;
        var5 = this.field_u.field_n;
        if (var4 == 3) {
          this.b(-106);
          this.field_j.a(this.field_B, -77);
          this.field_d.a(this.field_B, -104);
          this.a(false, 32);
          this.a(false, 8);
          return;
        }
        stackIn_6_0 = (!var13.field_i) ? 0 : 1;
        var6 = stackIn_6_0;
        if (var6 != 0 &&
          !var3.a((byte) -77, 12)) {
          if (var5.a(ob.field_Vb, -100)) {
            var6 = 0;
          }
          if (var5.a(ob.field_kc, -69) &&
            var13.field_m &&
            this.field_u.field_o == 0) {
            this.field_u.field_o = this.field_u.field_o | 1;
            this.a(false);
            return;
          }
          if (var5.a(ob.field_Sb, 88) &&
            this.field_u.field_g > 1) {
            var6 = 0;
            this.field_u.field_g = this.field_u.field_g - 1;
          }
        }
        if (var5.a(ob.field_Qb, 89)) {
          var6 = 1;
        }
        if (var6 == 0) {
          this.field_u.a(3);
        } else {
          this.field_u.a(false);
        }
        this.a((byte) -52, this.field_B, true);
        this.field_B = this.field_q;
        this.a(false, 32);
        var7 = 0;
        var8 = -43 % ((62 - param0) / 32);
        var9 = this.field_A;
        for (var10 = 0; var9.length > var10; var10++) {
          var11 = var9[var10];
          if (!this.b(0, var11)) {
            continue;
          }
          var7 = 1;
          break;
        }
        if (var7 == 0) {
          this.a(false, 8);
        }
        this.a(this.field_u, 6);
        return;
    }

    final static String a(byte param0, int param1, String param2) {
        RuntimeException var3 = null;
        String var4 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 66) {
            var4 = (String) null;
            pj.a((byte) -8, -92, (String) null);
          }
          if (param2 == null) {
            stackIn_5_0 = ng.field_K;
          } else {
            stackIn_5_0 = (String) (param2);
          }
          param2 = stackIn_5_0;
          if (mh.a(125, param1)) {
            stackIn_9_0 = ln.a(param1, param2, 255);
            return stackIn_9_0;
          }
          stackIn_7_0 = (String) (param2);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("pj.L(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final mo a(int param0, ai param1, byte param2, boolean param3) {
        int stackIn_4_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_21_1 = 0;
        mo stackIn_30_0 = null;
        int stackIn_34_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_50_0 = 0;
        mo stackIn_73_0 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        h var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var13Lifetime1;
        var18 = DungeonAssault.field_K;
        try {
          stackIn_4_0 = (param3) ? 0 : 1;
          var5_int = stackIn_4_0;
          var6 = this.field_u.field_n;
          if (var6.a(ob.field_Ob, 70)) {
            var5_int = 1;
          }
          if (param0 == 2) {
            var5_int = 0;
          }
          var7 = 0;
          var8 = param1.field_h.a(0, 17);
          var9 = this.field_u.field_g;
          var10 = this.field_u.field_e;
          var11 = param1.field_p;
          if (param2 >= 16) {
          }
          var12 = param1.field_g;
          if ((1 & this.field_u.field_d) != 0) {
            var9 = var9 << 1;
          }
          if ((1 & this.field_t) == 0) {
            stackIn_18_0 = ((this.field_u.field_d & 4) != 0) ? 1 : 0;
          } else {
            stackIn_18_0 = 1;
          }
          var13 = stackIn_18_0;
          stackIn_20_0 = var13;
          if (param1.field_h.field_g != 2) {
            stackIn_21_1 = 0;
          } else {
            stackIn_21_1 = 1;
          }
          var13Lifetime1 = stackIn_20_0 & stackIn_21_1;
          if (var13Lifetime1 != 0) {
            var11 = 1 + var11 >> 1;
            var12 = 1 + var12 >> 1;
          }
          var11 = var11 - this.field_i;
          if (var11 < 0) {
            var11 = 0;
          }
          if (param1.field_h.a((byte) -78, 7) &&
            var9 << 1 <= var11) {
            this.a(32768, 3);
            stackIn_30_0 = new mo(66, 32768);
            return stackIn_30_0;
          }
          stackIn_34_0 = (param3) ? 16384 : 0;
          var14 = stackIn_34_0;
          if (var5_int != 0) {
            var14 = var14 | 8192;
          }
          if (param0 == 2) {
            var14 = var14 | 32768;
          }
          if (param0 == 1) {
            var10++;
            var9--;
          }
          var15 = 0;
          while (true) {
            boolean decompiledFrameRemainder0 = true;
            var15++;
            if (var5_int != 0) {
              if (param0 != 2) {
                stackIn_47_0 = var10;
              } else {
                stackIn_47_0 = this.field_u.field_f;
              }
              var16 = stackIn_47_0;
              if (param0 != 2) {
                stackIn_50_0 = var12;
              } else {
                stackIn_50_0 = param1.field_r;
              }
              var17 = stackIn_50_0;
              if (param0 != 2 &&
                var6.a(ob.field_jc, 76) &&
                var7 == 0) {
                var7 = 1;
                var16 = var16 << 1;
              }
              boolean decompiledFrameRemainder1 = true;
              if (this.a(var17, (byte) 127, var16)) {
                if (var8 <= 0) {
                  if (param0 == 2) {
                    this.a(-8);
                  } else {
                    this.a(false);
                  }
                  var14 = var14 | 4096;
                  decompiledFrameRemainder1 = false;
                }
                else {
                  var8--;
                }
              }
              if ((decompiledFrameRemainder1) &&
                (decompiledFrameRemainder0 = !(var17 <= var16 + 5))) {
                if (param0 != 2) {
                  this.a(false);
                } else {
                  this.a(-8);
                }
                var14 = var14 | 4096;
                var15 = 5;
              }
              if (decompiledFrameRemainder0) {
                if (var15 > 5) {
                  var15 = 5;
                }
                stackIn_73_0 = new mo(66, var14 | var15);
                return stackIn_73_0;
              }
            }
            var5_int = 1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_76_0 = var5;
          stackIn_76_1 = new StringBuilder().append("pj.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_76_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(int param0, int param1, hb param2, int param3) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        hb var7 = null;
        var6 = DungeonAssault.field_K;
        try {
          if (param2.field_n.a(ob.field_Ub, 53)) {
            if (param1 <= param2.field_e) {
              param2.field_e = param2.field_e - param1;
            } else {
              param1 = param1 - param2.field_e;
              param0 = param0 + param1;
              param2.field_e = 0;
            }
            if (param2.field_g - 1 < param0) {
              param0 = param0 - (param2.field_g - 1);
              param2.field_g = 1;
              if (param2.field_e >= param0) {
                param2.field_e = param2.field_e - param0;
              } else {
                param2.a(false);
              }
            } else {
              param2.field_g = param2.field_g - param0;
            }
          } else {
            if (param1 < param2.field_e) {
              param2.field_e = param2.field_e - param1;
            } else {
              param2.field_e = 0;
            }
            if (param2.field_g > param0) {
              param2.field_g = param2.field_g - param0;
            } else {
              param2.a(false);
            }
          }
          if (param3 > -68) {
            var7 = (hb) null;
            this.a((hb) null, false, -72);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_21_0 = var5;
          stackIn_21_1 = new StringBuilder().append("pj.EA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(int param0, ec param1, wm param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = DungeonAssault.field_K;
        try {
          if (param0 < 96) {
            return;
          }
          for (var4_int = 0; param2.field_f.length > var4_int; var4_int++) {
            param2.field_f[var4_int] = param1.h(-50);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("pj.HA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void a(int param0) {
        this.field_B = this.field_q;
        this.a(false, 32);
        if (param0 != -8) {
          this.field_l = 36;
        }
        this.a(false, 8);
    }

    final boolean b(int param0, int param1) {
        if (param0 == -1) {
          return false;
        }
        ai var3 = this.field_h[param0];
        if (param1 != 27747) {
          this.b(-54);
        }
        if (this.field_k == 4) {
          return var3.field_a == 3 ? true : false;
        }
        if (8 != this.field_k &&
          this.field_k != 32) {
          return false;
        }
        return this.field_m.a(param0, (byte) 113);
    }

    private final int a(byte param0) {
        int var3 = 0;
        int var2;
        int var4;
        var4 = DungeonAssault.field_K;
        if (param0 != 47) {
          this.a(74, -22);
        }
        var2 = 0;
        for (var3 = 0; var3 < 4; var3++) {
          if (this.field_A[var3] != null &&
            (6 & this.field_A[var3].field_o) == 0 &&
            0 == oi.b(0, 3) &&
            !this.field_A[var3].field_n.a(ob.field_bc, -85)) {
            this.a(param0 + 60, this.field_A[var3]);
            var2 = var2 | 1 << var3;
          }
        }
        return var2;
    }

    private final void a(int param0, byte param1) {
        int var3;
        int var4;
        int var5;
        var5 = DungeonAssault.field_K;
        this.field_m.a(1);
        this.field_b.a(1);
        co.field_I.b(-4);
        co.field_I.a(new a(param0), false);
        this.field_m.a(param0, -63);
        var3 = 116 / ((10 - param1) / 60);
        while (!co.field_I.a((byte) -69)) {
          var4 = ((a) (co.field_I.b((byte) -124))).field_j;
          if (var4 % 7 > 0) {
            this.a(co.field_I, 49, var4 - 1, var4 - 1 - var4 / 7, true);
          }
          if (6 > var4 % 7) {
            this.a(co.field_I, 49, 1 + var4, -(var4 / 7) + var4, false);
          }
          if (var4 > 6) {
            this.a(co.field_I, 49, var4 - 7, var4 - 7 + 42, false);
          }
          if (var4 >= 42) {
            continue;
          }
          this.a(co.field_I, 49, 7 + var4, var4 + 42, true);
        }
    }

    final int d(int param0, int param1) {
        if (param1 != 30813) {
          this.d(-124, -104);
        }
        int var3 = 0;
        if (param0 % 7 != 0 &&
          this.field_v.a(-(param0 / 7) - 1 + param0, (byte) 75)) {
          var3 = var3 | 1;
        }
        if (param0 % 7 != 6 &&
          this.field_v.a(param0 - param0 / 7, (byte) 110)) {
          var3 = var3 | 2;
        }
        if (param0 > 6 &&
          this.field_v.a(param0 + 35, (byte) 122)) {
          var3 = var3 | 4;
        }
        if (param0 < 42 &&
          this.field_v.a(42 + param0, (byte) 102)) {
          var3 = var3 | 8;
        }
        return var3;
    }

    private final double c(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var6;
        hb var8;
        int var9;
        var9 = DungeonAssault.field_K;
        var6 = 0;
        for (var7 = 0; var7 < 4; var7++) {
          var8 = this.field_A[var7];
          if (var8 != null &&
            (6 & var8.field_o) == 0 &&
            var8.field_n.a(ob.field_Hb, 75)) {
            var6++;
          }
        }
        if (param3 != 2) {
          pj.a(-70, 33L);
        }
        return rm.a((byte) 96, var6, param4, ek.a(this.field_s, (byte) -127, param0, param1), param2);
    }

    final mo a(hb param0, ec param1, int param2) {
        mo stackIn_9_0 = null;
        mo stackIn_16_0 = null;
        mo stackIn_21_0 = null;
        mo stackIn_25_0 = null;
        mo stackIn_30_0 = null;
        mo stackIn_33_0 = null;
        mo stackIn_37_0 = null;
        mo stackIn_41_0 = null;
        mo stackIn_54_0 = null;
        mo stackIn_57_0 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_62_2 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        ec var10 = null;
        ec var11 = null;
        hb var12 = null;
        ec var13 = null;
        ec var14 = null;
        hb var15 = null;
        ec var16 = null;
        hb var17 = null;
        ec var18 = null;
        ec var19 = null;
        ec var20 = null;
        ec var21 = null;
        ec var22 = null;
        hb var23 = null;
        ec var25 = null;
        ec var26 = null;
        ec var27 = null;
        int var5Lifetime1;
        int var6Lifetime1;
        int var5Lifetime2;
        var8 = DungeonAssault.field_K;
        try {
          if (param2 <= 70) {
            this.field_B = 63;
          }
          param0.field_o = param0.field_o | 1;
          var4_int = param0.field_n.field_s;
          if (ob.field_Mb == var4_int) {
            var12 = this.field_A[param1.c(true)];
            var12.field_o = var12.field_o & -5;
            var12.a(3);
            if (128 != this.field_k) {
              this.a(false, 8);
            } else {
              this.a(false, 128);
            }
            var13 = new ec(3);
            var13.a(6, 2);
            var13.a(6, param0.field_j);
            var13.a(6, var12.field_j);
            stackIn_9_0 = new mo(65, var13);
            return stackIn_9_0;
          }
          if (ob.field_dc != var4_int &&
            var4_int != ob.field_Nb) {
            if (var4_int != ob.field_nc &&
              var4_int != ob.field_Ib) {
              if (var4_int == ob.field_Zb) {
                var17 = this.field_A[param1.c(true)];
                var17.a(false);
                param0.field_o = param0.field_o & -2;
                this.a(false);
                var18 = new ec(3);
                var18.a(6, 2);
                var18.a(6, param0.field_j);
                var18.a(6, var17.field_j);
                stackIn_25_0 = new mo(65, var18);
                return stackIn_25_0;
              }
              if (var4_int != ob.field_lc &&
                ob.field_Gb != var4_int) {
                if (ob.field_Wb == var4_int) {
                  this.field_B = this.field_q;
                  this.a(false, 8);
                  var20 = new ec(2);
                  var20.a(6, 1);
                  var20.a(6, param0.field_j);
                  stackIn_33_0 = new mo(65, var20);
                  return stackIn_33_0;
                }
                if (var4_int == ob.field_Lb) {
                  var5 = param1.c(true);
                  var6 = param1.c(true);
                  this.field_p.a(var5, -88);
                  this.field_p.a(var6, -119);
                  this.a(false, this.field_k);
                  var10 = new ec(16);
                  var21 = var10;
                  var21.a(6, 15);
                  var21.a(6, param0.field_j);
                  var21.a(6, var5);
                  var10.a(6, var6);
                  this.field_h[var5].a(-12, true, var21);
                  var21.a(6, this.d(var5, 30813));
                  this.field_h[var6].a(-12, true, var21);
                  var21.a(6, this.d(var6, 30813));
                  stackIn_37_0 = new mo(65, var21);
                  return stackIn_37_0;
                }
                if (var4_int == ob.field_Pb) {
                  this.field_t = this.field_t | 1;
                  this.a(false, this.field_k);
                  var22 = new ec(2);
                  var22.a(6, 1);
                  var22.a(6, param0.field_j);
                  stackIn_41_0 = new mo(65, var22);
                  return stackIn_41_0;
                }
                if (var4_int != ob.field_fc &&
                  ob.field_Jb != var4_int &&
                  var4_int != ob.field_pc) {
                  if (var4_int != ob.field_Ub) {
                    throw new IllegalStateException("Invalid ability use!");
                  }
                  var5Lifetime2 = param1.c(true);
                  var6Lifetime1 = param1.c(true);
                  param0.field_e = var5Lifetime2;
                  param0.field_g = var6Lifetime1;
                  var25 = new ec(4);
                  var25.a(6, 3);
                  var25.a(6, param0.field_j);
                  var25.a(6, var5Lifetime2);
                  var25.a(6, var6Lifetime1);
                  stackIn_57_0 = new mo(65, var25);
                  return stackIn_57_0;
                }
                var23 = this.field_A[param1.c(true)];
                if (var4_int == ob.field_fc) {
                  var23.field_d = var23.field_d | 1;
                } else {
                  if (var4_int != ob.field_Jb) {
                    if (var4_int != ob.field_pc) {
                      this.a(false, this.field_k);
                      var26 = new ec(3);
                      var26.a(6, 2);
                      var26.a(6, param0.field_j);
                      var26.a(6, var23.field_j);
                      return new mo(65, var26);
                    }
                    var23.field_d = var23.field_d | 4;
                  } else {
                    var23.field_d = var23.field_d | 2;
                  }
                }
                this.a(false, this.field_k);
                var27 = new ec(3);
                var27.a(6, 2);
                var27.a(6, param0.field_j);
                var27.a(6, var23.field_j);
                stackIn_54_0 = new mo(65, var27);
                return stackIn_54_0;
              }
              this.a(false);
              var19 = new ec(2);
              var19.a(6, 1);
              var19.a(6, param0.field_j);
              stackIn_30_0 = new mo(65, var19);
              return stackIn_30_0;
            }
            var15 = this.field_A[param1.c(true)];
            var15.a(false);
            param0.field_o = param0.field_o & -7;
            param0.field_o = param0.field_o & -2;
            this.a(false, 8);
            var16 = new ec(3);
            var16.a(6, 2);
            var16.a(6, param0.field_j);
            var16.a(6, var15.field_j);
            stackIn_21_0 = new mo(65, var16);
            return stackIn_21_0;
          }
          var5Lifetime1 = param1.c(true);
          this.field_p.a(var5Lifetime1, -128);
          if (ob.field_Nb == var4_int) {
            this.a(var5Lifetime1, false, -12331);
            this.a(false, 115, var5Lifetime1);
            this.a((byte) -52, var5Lifetime1, false);
          }
          this.a(false, this.field_k);
          var11 = new ec(9);
          var14 = var11;
          var14.a(6, 8);
          var14.a(6, param0.field_j);
          var14.a(6, var5Lifetime1);
          this.field_h[var5Lifetime1].a(-12, true, var14);
          var14.a(6, this.d(var5Lifetime1, 30813));
          stackIn_16_0 = new mo(65, var14);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_61_0 = var4;
          stackIn_61_1 = new StringBuilder().append("pj.T(");
          if (param0 == null) {
            stackIn_62_2 = "null";
          } else {
            stackIn_62_2 = "{...}";
          }
          stackIn_64_1 = ((StringBuilder) (Object) stackIn_61_1).append(stackIn_62_2).append(',');
          if (param1 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_61_0), ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(md param0, int param1, int param2, int param3, boolean param4) {
        String var7 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (this.field_v.a(param3, (byte) 92) &&
            !this.field_m.a(param2, (byte) 92)) {
            this.field_m.a(param2, -92);
            if (param1 != 49) {
              var7 = (String) null;
              pj.a((byte) 106, -25, (String) null);
            }
            if (!this.field_j.a(param2, (byte) 109)) {
              if (param4) {
                param3 += 84;
              }
              this.field_b.a(param3, param1 - 175);
            } else {
              param0.a(new a(param2), false);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("pj.I(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    pj() {
        int var1 = 0;
        this.field_v = new wm(84);
        this.field_h = new ai[49];
        this.field_p = new wm(49);
        this.field_j = new wm(49);
        this.field_d = new wm(49);
        this.field_g = 0;
        this.field_A = new hb[4];
        this.field_B = -1;
        this.field_u = null;
        this.field_q = -1;
        this.field_k = 1;
        this.field_l = 0;
        for (var1 = 0; var1 < 49; var1++) {
          this.field_h[var1] = new ai(0);
        }
        ai dupTemp$0 = new ai(3);
        this.field_h[48] = dupTemp$0;
        this.field_h[42] = dupTemp$0;
        this.field_h[6] = dupTemp$0;
        this.field_h[0] = dupTemp$0;
        this.field_h[24] = new ai(2);
        this.field_p.a(0, -66);
        this.field_p.a(6, -80);
        this.field_p.a(42, -85);
        this.field_p.a(48, -84);
        this.field_b = new wm(168);
        this.field_m = new wm(49);
        this.field_m.a(0, -119);
        this.field_m.a(6, -76);
        this.field_m.a(42, -114);
        this.field_m.a(48, -90);
    }

    static {
        field_w = new boolean[64];
        field_n = "Email address is unavailable";
        field_x = 0;
        field_z = 0L;
    }
}
