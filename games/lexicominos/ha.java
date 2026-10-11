/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ha {
    int field_i;
    static int field_d;
    private int[] field_c;
    tl field_a;
    char[] field_h;
    tl field_g;
    tl field_b;
    private boolean field_f;
    private fc field_e;

    final static void a(String param0, String param1, int param2) {
        if (param2 >= -58) {
          return;
        }
        try {
          uf.a(param0, -108, param1, false);
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "ha.F(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean b(int param0) {
        int var2;
        int[] var3;
        int var4;
        int var5;
        int var6;
        int var7;
        var7 = Lexicominos.field_L ? 1 : 0;
        var2 = 1;
        var3 = qc.field_b[this.field_i][this.field_b.field_a];
        var4 = 0;
        if (param0 != -11498) {
          return false;
        }
        while (var4 < 4) {
          var5 = this.field_a.field_a + var3[var4 * 2];
          var6 = this.field_g.field_a + var3[var4 * 2 + 1];
          if (18 <= var6) {
            var2 = 0;
          } else {
            this.field_e.field_w[var6][var5] = this.field_h[var4];
          }
          var4++;
        }
        return var2 != 0;
    }

    final void a(boolean param0, int param1) {
        int[] var3;
        int var3_int;
        int var4;
        int var5;
        int[] var5_ref_int__;
        int var6;
        db var6_ref_db;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int[] var14;
        int var15;
        var13 = Lexicominos.field_L ? 1 : 0;
        if (!param0) {
          var14 = qc.field_b[this.field_i][this.field_b.field_a];
          var3 = var14;
          var15 = 0;
          var4 = var15;
          while (var15 < 4) {
            var5 = this.field_c[this.field_i] + var14[1 + 2 * var15];
            var6 = var14[2 * var15];
            var7 = this.field_a.a((byte) -123) + (149 + 24 * var6);
            var8 = -this.field_g.a((byte) -123) + 78 - 24 * var5;
            eb.a(param1 - 13543, this.field_e.field_m, 0, ia.field_H, this.field_h[var15], var8, var7);
            var15++;
          }
        } else {
          lf.g(0, 8, 311, 450);
          var3_int = this.field_b.field_a * this.field_b.field_b + this.field_b.a((byte) -123);
          if (var3_int < 0) {
            var3_int += 128;
          }
          var4 = this.field_b.a((byte) -123);
          if (var4 < 0) {
            var4 += 32;
          }
          var5_ref_int__ = qc.field_f[this.field_i][var3_int];
          var6_ref_db = qc.field_d[var4];
          var7 = (-var6_ref_db.field_p + ia.field_H.field_p) / 2;
          for (var8 = 0; var8 < 4; var8++) {
            var9 = this.field_a.field_a * 24 + var5_ref_int__[var8 * 2];
            var10 = this.field_g.field_a * 24 + var5_ref_int__[1 + 2 * var8];
            var11 = this.field_a.a((byte) -123) + (var9 + 10 + var7);
            var12 = var7 - this.field_g.a((byte) -123) + 416 - var10;
            eb.a(param1 ^ 13560, this.field_e.field_m, 0, var6_ref_db, this.field_h[var8], var12, var11);
          }
          lf.b();
        }
        if (param1 != 13551) {
          this.field_g = (tl) null;
        }
    }

    final boolean a(boolean param0, boolean param1, boolean param2, boolean param3, boolean param4, byte param5) {
        tl stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_13_0 = 0;
        tl stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_24_0 = 0;
        int stackIn_55_0 = 0;
        boolean stackIn_67_1 = false;
        boolean stackIn_72_0 = false;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var8Lifetime1;
        int var15Lifetime1;
        int var15Lifetime2;
        int var16Lifetime1;
        int var16Lifetime2;
        var17 = Lexicominos.field_L ? 1 : 0;
        var7 = 0;
        if (param0 ^ param4) {
          stackIn_4_0 = this.field_b;
          stackIn_4_1 = 121;
          if (param0) {
            stackIn_5_2 = this.field_e.field_d;
          } else {
            stackIn_5_2 = -this.field_e.field_d;
          }
          var7 = ((tl) (Object) stackIn_4_0).a((byte) stackIn_4_1, stackIn_5_2);
        }
        if (var7 == 0 &&
          this.field_b.field_c != 0) {
          var8 = rf.a(this.field_b.field_c, 47);
          var7 = Math.min(var8 * this.field_b.field_c, this.field_e.field_d) * -var8;
        }
        if (this.field_e.field_d > Math.abs(this.field_a.field_c)) {
          stackIn_13_0 = -this.field_a.field_c;
        } else {
          stackIn_13_0 = -this.field_e.field_d * rf.a(this.field_a.field_c, 47);
        }
        var8Lifetime1 = stackIn_13_0;
        var9 = 0;
        if (param5 != -93) {
          return false;
        }
        if (param1 ^ param2) {
          stackIn_19_0 = this.field_a;
          stackIn_19_1 = 115;
          stackIn_20_2 = (param2) ? -1 : 1;
          var9 = ((tl) (Object) stackIn_19_0).a((byte) stackIn_19_1, stackIn_20_2 * this.field_e.field_d);
        }
        if (!param3) {
          stackIn_24_0 = -this.field_e.field_d;
        } else {
          stackIn_24_0 = -32;
        }
        var10 = stackIn_24_0;
        var11 = var7;
        var12 = var8Lifetime1;
        var13 = var9;
        var14 = var10;
        if (rf.a(var12, 47) == rf.a(var13, 47)) {
          var12 = 0;
          var8Lifetime1 = 0;
        }
        L9: while (true) {
          if (var11 == 0 &&
            0 == var12 &&
            var13 == 0 &&
            0 == var14) {
            break L9;
          }
          if (var11 != 0) {
            var15 = rf.a(var11, 47);
            if (var15 * this.field_b.field_c < 0) {
              var16 = Math.min(Math.abs(var11), Math.abs(this.field_b.field_c)) * var15;
              var11 = var11 - var16;
              this.field_b.field_c = this.field_b.field_c + var16;
              continue;
            }
            var16Lifetime2 = (4 + var15 + this.field_b.field_a) % 4;
            if (this.field_f &&
              this.a(this.field_g.field_a, this.field_a.field_a, (byte) -15, var16Lifetime2)) {
              this.field_b.field_c = this.field_b.field_c + var15 * (1 - this.field_b.field_f);
              this.field_b.field_a = var16Lifetime2;
              var11 = var11 - var15;
              continue;
            }
          }
          if (var13 != 0) {
            var15Lifetime1 = rf.a(var13, 47);
            if (this.field_a.field_c * var15Lifetime1 < 0) {
              var16Lifetime1 = Math.min(Math.abs(var13), Math.abs(this.field_a.field_c)) * var15Lifetime1;
              var13 = var13 - var16Lifetime1;
              var12 = 0;
              this.field_a.field_c = this.field_a.field_c + var16Lifetime1;
              continue;
            }
            if (this.a(this.field_g.field_a, var15Lifetime1 + this.field_a.field_a, (byte) -15, this.field_b.field_a) && (0 == this.field_g.field_c ||
              this.a(this.field_g.field_a + 1, var15Lifetime1 + this.field_a.field_a, (byte) -15, this.field_b.field_a))) {
              var13 = var13 - var15Lifetime1;
              var12 = 0;
              this.field_a.field_c = this.field_a.field_c + (1 - this.field_a.field_f) * var15Lifetime1;
              this.field_a.field_a = this.field_a.field_a + var15Lifetime1;
              continue;
            }
          }
          if (0 != var12) {
            this.field_a.field_c = this.field_a.field_c + var12;
            var12 = 0;
            continue;
          }
          if (var14 != 0) {
            if (this.field_g.field_c > 0) {
              if (this.field_g.field_c < -var14) {
                stackIn_55_0 = this.field_g.field_c;
              } else {
                stackIn_55_0 = -var14;
              }
              var15Lifetime2 = stackIn_55_0;
              this.field_g.field_c = this.field_g.field_c - var15Lifetime2;
              var14 = var14 + var15Lifetime2;
              continue;
            }
            if (this.a(this.field_g.field_a - 1, this.field_a.field_a, (byte) -15, this.field_b.field_a)) {
              if (this.field_a.field_c != 0 &&
                !this.a(this.field_g.field_a - 1, this.field_a.field_a + rf.a(this.field_a.field_c, 47), (byte) -15, this.field_b.field_a)) {
                break L9;
              }
              this.field_g.field_a = this.field_g.field_a - 1;
              this.field_g.field_c = this.field_g.field_f - 1;
              var14++;
              continue;
            }
          }
          break;
        }
        stackIn_67_1 = (var8Lifetime1 != var12) || (var9 != var13) || (var10 != var14);
        this.field_f = stackIn_67_1;
        stackIn_72_0 = (var7 != var11) || (this.field_f);
        return stackIn_72_0;
    }

    final static boolean a(int param0) {
        java.awt.Canvas var2;
        boolean stackIn_6_0 = false;
        if (param0 <= 43) {
          var2 = (java.awt.Canvas) null;
          ha.a((java.awt.Canvas) null, (byte) 124);
        }
        stackIn_6_0 = (ta.field_g >= 10) && (wf.field_i >= 13);
        return stackIn_6_0;
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        if (param1 <= 41) {
          return;
        }
        try {
          sg.a((java.awt.Component) ((Object) param0), 2);
          bi.a((byte) 104, (java.awt.Component) ((Object) param0));
          if (null != rk.field_c) {
            rk.field_c.a(true, (java.awt.Component) ((Object) param0));
          }
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "ha.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final boolean a(int param0, int param1, byte param2, int param3) {
        int[] var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int[] var10;
        var9 = Lexicominos.field_L ? 1 : 0;
        if (param2 != -15) {
          return false;
        }
        var10 = qc.field_b[this.field_i][param3 % 4];
        var5 = var10;
        var6 = 0;
        while (true) {
          if (var6 >= 4) {
            return true;
          }
          var7 = param1 + var10[var6 * 2];
          var8 = param0 + var10[1 + var6 * 2];
          if (var7 >= 0 &&
            var7 < 12 &&
            var8 >= 0 && (var8 >= 18 ||
            this.field_e.field_w[var8][var7] == 0)) {
            var6++;
            continue;
          }
          break;
        }
        return false;
    }

    ha(fc param0) {
        int var2_int = 0;
        int var3 = 0;
        this.field_c = new int[]{0, 0, 0, 1, 1, 1, 0};
        this.field_a = new tl(16, 24);
        this.field_g = new tl(128, 24);
        this.field_b = new tl(32, 32);
        this.field_f = true;
        try {
          this.field_e = param0;
          this.field_h = new char[4];
          param0.field_m.a(param0, 0, this.field_h);
          this.field_i = param0.a(-2, 7);
          this.field_b.field_a = 0;
          this.field_a.field_a = 5;
          var2_int = 0;
          for (var3 = 0; var3 < qc.field_b[this.field_i][this.field_b.field_a].length; var3 += 2) {
            var2_int = Math.min(var2_int, qc.field_b[this.field_i][this.field_b.field_a][var3]);
          }
          this.field_g.field_a = -var2_int + 18;
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "ha.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    ha(fc param0, int param1, char[] param2) {
        int var5 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        this.field_c = new int[]{0, 0, 0, 1, 1, 1, 0};
        this.field_a = new tl(16, 24);
        this.field_g = new tl(128, 24);
        this.field_b = new tl(32, 32);
        this.field_f = true;
        try {
          this.field_e = param0;
          this.field_h = param2;
          this.field_i = param1;
          if (param2.length != 4) {
            throw new IllegalArgumentException();
          }
          this.field_b.field_a = 0;
          this.field_a.field_a = 5;
          var4_int = 0;
          for (var5 = 0; var5 < qc.field_b[param1][this.field_b.field_a].length; var5 += 2) {
            var4_int = Math.min(var4_int, qc.field_b[param1][this.field_b.field_a][var5]);
          }
          this.field_g.field_a = -var4_int + 18;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ha.<init>(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
    }
}
