/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj extends cj {
    private cj field_Gb;
    static boolean field_Rb;
    private int field_Kb;
    static String field_Ob;
    static String field_Sb;
    private cj field_Pb;
    private cj field_Tb;
    static int[] field_Fb;
    static nc[] field_Hb;
    static ld field_Ib;
    private cj field_Nb;
    private cj field_Qb;
    static int field_Ub;
    private boolean field_Jb;
    static cj field_Mb;
    private cj field_Lb;

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 23 % ((-22 - param0) / 57);
        if (!this.field_Jb) {
          this.b(param2, param1, param3, 126);
          return;
        }
        this.c(0, param1, param3, param2);
    }

    private final int b(int param0, boolean param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        int var5 = 0;
        int var6 = -this.field_Lb.field_z + this.field_Gb.field_z;
        int var5Lifetime1;
        if (var6 > 0) {
          var7 = this.field_Lb.field_Q;
          var8 = param0 - param2;
          var5 = (var6 / 2 + var8 * var7) / var6;
        }
        if (param1) {
          if (var5 < 0) {
            var5 = 0;
          }
          if (var5 <= -param2 + param0) {
            if (param3 == -10596) {
              return var5;
            }
            return -51;
          }
          var5 = param0 - param2;
          if (param3 == -10596) {
            return var5;
          }
          return -51;
        }
        if (param0 - param2 < var5) {
          var5 = param0 - param2;
        }
        if (0 <= var5) {
          if (param3 == -10596) {
            return var5;
          }
          return -51;
        }
        var5Lifetime1 = 0;
        if (param3 == -10596) {
          return var5Lifetime1;
        }
        return -51;
    }

    final boolean k(int param0) {
        if (0 != this.field_Tb.field_T) {
          this.field_Kb = 20;
          return true;
        }
        if (param0 != 20) {
          return true;
        }
        if (this.field_Tb.field_jb == 0) {
          return false;
        }
        if (this.field_Kb > 0) {
          this.field_Kb = this.field_Kb - 1;
          if (this.field_Kb == 0) {
            this.field_Kb = 3;
            return true;
          }
          return false;
        }
        if (this.field_Kb == 0) {
          this.field_Kb = 3;
          return true;
        }
        return false;
    }

    public static void i(int param0) {
        field_Fb = null;
        field_Ob = null;
        field_Mb = null;
        field_Hb = null;
        field_Ib = null;
        field_Sb = null;
        if (param0 != 22767) {
          field_Hb = (nc[]) null;
        }
    }

    final boolean h(int param0) {
        if (this.field_Nb.field_T != 0) {
          this.field_Kb = 20;
          return true;
        }
        if (param0 != 4690) {
          this.a(14, 117, 55);
        }
        if (this.field_Nb.field_jb == 0) {
          return false;
        }
        if (0 < this.field_Kb) {
          this.field_Kb = this.field_Kb - 1;
        }
        if (this.field_Kb != 0) {
          return false;
        }
        this.field_Kb = 3;
        return true;
    }

    final int a(int param0, int param1, int param2) {
        if (param2 != -18367) {
          this.k(33);
          if (!this.field_Jb) {
            return this.a(param0, false, 69, param1);
          }
          return this.b(param0, false, param1, -10596);
        }
        if (!this.field_Jb) {
          return this.a(param0, false, 69, param1);
        }
        return this.b(param0, false, param1, -10596);
    }

    final boolean c(byte param0) {
        if (this.field_Qb.field_T != 0) {
          this.field_Kb = 20;
          return true;
        }
        if (param0 > -64) {
          return true;
        }
        if (this.field_Qb.field_jb == 0) {
          return false;
        }
        if (this.field_Kb > 0) {
          this.field_Kb = this.field_Kb - 1;
          if (0 != this.field_Kb) {
            return false;
          }
          if (this.field_Lb.field_mb + this.field_Lb.field_qb + (this.field_Lb.field_z + this.field_Lb.field_I) > bo.field_d) {
            return false;
          }
          this.field_Kb = 3;
          return true;
        }
        if (0 != this.field_Kb) {
          return false;
        }
        if (this.field_Lb.field_mb + this.field_Lb.field_qb + (this.field_Lb.field_z + this.field_Lb.field_I) <= bo.field_d) {
          this.field_Kb = 3;
          return true;
        }
        return false;
    }

    private final void b(int param0, int param1, int param2, int param3) {
        int var6 = 0;
        int var5 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        cj var15 = null;
        cj var16 = null;
        cj var17 = null;
        cj var18 = null;
        cj var19 = null;
        cj var20 = null;
        int var14 = ZombieDawnMulti.field_E ? 1 : 0;
        cj var15Lifetime1;
        cj var15Lifetime2;
        cj var16Lifetime1;
        cj var16Lifetime2;
        cj var17Lifetime1;
        cj var17Lifetime2;
        cj var18Lifetime1;
        cj var18Lifetime2;
        cj var19Lifetime1;
        cj var19Lifetime2;
        cj var19Lifetime3;
        cj var20Lifetime1;
        cj var20Lifetime2;
        cj var20Lifetime3;
        cj var19Lifetime4;
        cj var20Lifetime4;
        cj var19Lifetime1Lifetime1;
        cj var20Lifetime1Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        if (this.field_zb >= 2 * this.field_z) {
          var6 = this.field_zb - this.field_z;
          var5 = this.field_z;
        } else {
          var6 = this.field_zb / 2;
          var5 = this.field_zb / 2;
        }
        int var7 = var6 - var5;
        int var8 = var7;
        if (param1 >= param0) {
          var7 = 0;
          var9 = param0 - param1;
          var10 = -var8 + var7;
          var11 = 0;
          if (var9 > 0) {
            var11 = (param2 * var10 + var9 / 2) / var9;
          }
          var12 = var8 / 2 + var11;
          var15 = this.field_Tb;
          var15.field_Q = 0;
          var15.field_zb = var5;
          var15.field_z = this.field_z;
          var15.field_x = 0;
          var16 = this.field_Nb;
          var16.field_Q = 0;
          var16.field_z = this.field_z;
          var16.field_zb = this.field_zb - var6;
          var16.field_x = var6;
          var17 = this.field_Gb;
          var17.field_z = this.field_z;
          var17.field_zb = var7;
          var17.field_x = var5;
          var17.field_Q = 0;
          var18 = this.field_Pb;
          var18.field_zb = var12;
          var18.field_x = 0;
          var18.field_Q = 0;
          var18.field_z = this.field_z;
          if (param3 <= 120) {
            this.field_Jb = false;
            var19 = this.field_Qb;
            var19.field_Q = 0;
            var19.field_x = var12;
            var19.field_zb = var7 - var12;
            var19.field_z = this.field_z;
            var20 = this.field_Lb;
            var20.field_z = this.field_z;
            this.field_Gb.field_Z = param1 < param0 ? true : false;
            this.field_Nb.field_Z = param1 < param0 ? true : false;
            this.field_Tb.field_Z = param1 < param0 ? true : false;
            var20.field_x = var11;
            var20.field_zb = var8;
            var20.field_Q = 0;
            return;
          }
          var19Lifetime4 = this.field_Qb;
          var19Lifetime4.field_Q = 0;
          var19Lifetime4.field_x = var12;
          var19Lifetime4.field_zb = var7 - var12;
          var19Lifetime4.field_z = this.field_z;
          var20Lifetime4 = this.field_Lb;
          var20Lifetime4.field_z = this.field_z;
          this.field_Gb.field_Z = param1 < param0 ? true : false;
          this.field_Nb.field_Z = param1 < param0 ? true : false;
          this.field_Tb.field_Z = param1 < param0 ? true : false;
          var20Lifetime4.field_x = var11;
          var20Lifetime4.field_zb = var8;
          var20Lifetime4.field_Q = 0;
          return;
        }
        var8 = var8 * param1 / param0;
        if (this.field_z > var8) {
          var8 = this.field_z;
        }
        if (var8 <= var7) {
          var9Lifetime1 = param0 - param1;
          var10Lifetime1 = -var8 + var7;
          var11Lifetime1 = 0;
          if (var9Lifetime1 > 0) {
            var11Lifetime1 = (param2 * var10Lifetime1 + var9Lifetime1 / 2) / var9Lifetime1;
          }
          var12Lifetime1 = var8 / 2 + var11Lifetime1;
          var15Lifetime1 = this.field_Tb;
          var15Lifetime1.field_Q = 0;
          var15Lifetime1.field_zb = var5;
          var15Lifetime1.field_z = this.field_z;
          var15Lifetime1.field_x = 0;
          var16Lifetime1 = this.field_Nb;
          var16Lifetime1.field_Q = 0;
          var16Lifetime1.field_z = this.field_z;
          var16Lifetime1.field_zb = this.field_zb - var6;
          var16Lifetime1.field_x = var6;
          var17Lifetime1 = this.field_Gb;
          var17Lifetime1.field_z = this.field_z;
          var17Lifetime1.field_zb = var7;
          var17Lifetime1.field_x = var5;
          var17Lifetime1.field_Q = 0;
          var18Lifetime1 = this.field_Pb;
          var18Lifetime1.field_zb = var12Lifetime1;
          var18Lifetime1.field_x = 0;
          var18Lifetime1.field_Q = 0;
          var18Lifetime1.field_z = this.field_z;
          if (param3 > 120) {
            var19Lifetime1 = this.field_Qb;
            var19Lifetime1.field_Q = 0;
            var19Lifetime1.field_x = var12Lifetime1;
            var19Lifetime1.field_zb = var7 - var12Lifetime1;
            var19Lifetime1.field_z = this.field_z;
            var20Lifetime1 = this.field_Lb;
            var20Lifetime1.field_z = this.field_z;
            this.field_Gb.field_Z = param1 < param0 ? true : false;
            this.field_Nb.field_Z = param1 < param0 ? true : false;
            this.field_Tb.field_Z = param1 < param0 ? true : false;
            var20Lifetime1.field_x = var11Lifetime1;
            var20Lifetime1.field_zb = var8;
            var20Lifetime1.field_Q = 0;
            return;
          }
          this.field_Jb = false;
          var19Lifetime1Lifetime1 = this.field_Qb;
          var19Lifetime1Lifetime1.field_Q = 0;
          var19Lifetime1Lifetime1.field_x = var12Lifetime1;
          var19Lifetime1Lifetime1.field_zb = var7 - var12Lifetime1;
          var19Lifetime1Lifetime1.field_z = this.field_z;
          var20Lifetime1Lifetime1 = this.field_Lb;
          var20Lifetime1Lifetime1.field_z = this.field_z;
          this.field_Gb.field_Z = param1 < param0 ? true : false;
          this.field_Nb.field_Z = param1 < param0 ? true : false;
          this.field_Tb.field_Z = param1 < param0 ? true : false;
          var20Lifetime1Lifetime1.field_x = var11Lifetime1;
          var20Lifetime1Lifetime1.field_zb = var8;
          var20Lifetime1Lifetime1.field_Q = 0;
          return;
        }
        var8 = var7;
        var9Lifetime2 = param0 - param1;
        var10Lifetime2 = -var8 + var7;
        var11Lifetime2 = 0;
        if (var9Lifetime2 > 0) {
          var11Lifetime2 = (param2 * var10Lifetime2 + var9Lifetime2 / 2) / var9Lifetime2;
        }
        var12Lifetime2 = var8 / 2 + var11Lifetime2;
        var15Lifetime2 = this.field_Tb;
        var15Lifetime2.field_Q = 0;
        var15Lifetime2.field_zb = var5;
        var15Lifetime2.field_z = this.field_z;
        var15Lifetime2.field_x = 0;
        var16Lifetime2 = this.field_Nb;
        var16Lifetime2.field_Q = 0;
        var16Lifetime2.field_z = this.field_z;
        var16Lifetime2.field_zb = this.field_zb - var6;
        var16Lifetime2.field_x = var6;
        var17Lifetime2 = this.field_Gb;
        var17Lifetime2.field_z = this.field_z;
        var17Lifetime2.field_zb = var7;
        var17Lifetime2.field_x = var5;
        var17Lifetime2.field_Q = 0;
        var18Lifetime2 = this.field_Pb;
        var18Lifetime2.field_zb = var12Lifetime2;
        var18Lifetime2.field_x = 0;
        var18Lifetime2.field_Q = 0;
        var18Lifetime2.field_z = this.field_z;
        if (param3 <= 120) {
          this.field_Jb = false;
          var19Lifetime2 = this.field_Qb;
          var19Lifetime2.field_Q = 0;
          var19Lifetime2.field_x = var12Lifetime2;
          var19Lifetime2.field_zb = var7 - var12Lifetime2;
          var19Lifetime2.field_z = this.field_z;
          var20Lifetime2 = this.field_Lb;
          var20Lifetime2.field_z = this.field_z;
          this.field_Gb.field_Z = param1 < param0 ? true : false;
          this.field_Nb.field_Z = param1 < param0 ? true : false;
          this.field_Tb.field_Z = param1 < param0 ? true : false;
          var20Lifetime2.field_x = var11Lifetime2;
          var20Lifetime2.field_zb = var8;
          var20Lifetime2.field_Q = 0;
          return;
        }
        var19Lifetime3 = this.field_Qb;
        var19Lifetime3.field_Q = 0;
        var19Lifetime3.field_x = var12Lifetime2;
        var19Lifetime3.field_zb = var7 - var12Lifetime2;
        var19Lifetime3.field_z = this.field_z;
        var20Lifetime3 = this.field_Lb;
        var20Lifetime3.field_z = this.field_z;
        this.field_Gb.field_Z = param1 < param0 ? true : false;
        this.field_Nb.field_Z = param1 < param0 ? true : false;
        this.field_Tb.field_Z = param1 < param0 ? true : false;
        var20Lifetime3.field_x = var11Lifetime2;
        var20Lifetime3.field_zb = var8;
        var20Lifetime3.field_Q = 0;
    }

    private final void c(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        cj var15 = null;
        cj var16 = null;
        cj var17 = null;
        cj var18 = null;
        cj var19 = null;
        cj var20 = null;
        int var14 = ZombieDawnMulti.field_E ? 1 : 0;
        cj var15Lifetime1;
        cj var16Lifetime1;
        cj var17Lifetime1;
        cj var18Lifetime1;
        cj var19Lifetime1;
        cj var20Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        if (2 * this.field_zb <= this.field_z) {
          var5 = this.field_zb;
          var6 = -this.field_zb + this.field_z;
        } else {
          var6 = this.field_z / 2;
          var5 = this.field_z / 2;
        }
        int var7 = -var5 + var6;
        int var8 = var7;
        if (param1 >= param3) {
          var7 = 0;
          var9 = -param1 + param3;
          var10 = -var8 + var7;
          var11 = 0;
          if (param0 < var9) {
            var11 = (var9 / 2 + param2 * var10) / var9;
          }
          var12 = var8 / 2 + var11;
          var15 = this.field_Tb;
          var15.field_z = var5;
          var15.field_zb = this.field_zb;
          var15.field_Q = 0;
          var15.field_x = 0;
          var16 = this.field_Nb;
          var16.field_x = 0;
          var16.field_zb = this.field_zb;
          var16.field_Q = var6;
          var16.field_z = this.field_z - var6;
          var17 = this.field_Gb;
          var17.field_zb = this.field_zb;
          var17.field_z = var7;
          var17.field_x = 0;
          var17.field_Q = var5;
          var18 = this.field_Pb;
          var18.field_x = 0;
          var18.field_z = var12;
          var18.field_Q = 0;
          var18.field_zb = this.field_zb;
          var19 = this.field_Qb;
          var19.field_Q = var12;
          var19.field_z = -var12 + var7;
          var19.field_x = 0;
          var19.field_zb = this.field_zb;
          var20 = this.field_Lb;
          var20.field_Q = var11;
          var20.field_z = var8;
          var20.field_zb = this.field_zb;
          var20.field_x = 0;
          this.field_Gb.field_Z = param1 < param3 ? true : false;
          this.field_Nb.field_Z = param1 < param3 ? true : false;
          this.field_Tb.field_Z = param1 < param3 ? true : false;
          return;
        }
        var8 = var8 * param1 / param3;
        if (!(var8 >= this.field_zb)) {
          var8 = this.field_zb;
        }
        if (var7 < var8) {
          var8 = var7;
        }
        var9Lifetime1 = -param1 + param3;
        var10Lifetime1 = -var8 + var7;
        var11Lifetime1 = 0;
        if (param0 < var9Lifetime1) {
          var11Lifetime1 = (var9Lifetime1 / 2 + param2 * var10Lifetime1) / var9Lifetime1;
        }
        var12Lifetime1 = var8 / 2 + var11Lifetime1;
        var15Lifetime1 = this.field_Tb;
        var15Lifetime1.field_z = var5;
        var15Lifetime1.field_zb = this.field_zb;
        var15Lifetime1.field_Q = 0;
        var15Lifetime1.field_x = 0;
        var16Lifetime1 = this.field_Nb;
        var16Lifetime1.field_x = 0;
        var16Lifetime1.field_zb = this.field_zb;
        var16Lifetime1.field_Q = var6;
        var16Lifetime1.field_z = this.field_z - var6;
        var17Lifetime1 = this.field_Gb;
        var17Lifetime1.field_zb = this.field_zb;
        var17Lifetime1.field_z = var7;
        var17Lifetime1.field_x = 0;
        var17Lifetime1.field_Q = var5;
        var18Lifetime1 = this.field_Pb;
        var18Lifetime1.field_x = 0;
        var18Lifetime1.field_z = var12Lifetime1;
        var18Lifetime1.field_Q = 0;
        var18Lifetime1.field_zb = this.field_zb;
        var19Lifetime1 = this.field_Qb;
        var19Lifetime1.field_Q = var12Lifetime1;
        var19Lifetime1.field_z = -var12Lifetime1 + var7;
        var19Lifetime1.field_x = 0;
        var19Lifetime1.field_zb = this.field_zb;
        var20Lifetime1 = this.field_Lb;
        var20Lifetime1.field_Q = var11Lifetime1;
        var20Lifetime1.field_z = var8;
        var20Lifetime1.field_zb = this.field_zb;
        var20Lifetime1.field_x = 0;
        this.field_Gb.field_Z = param1 < param3 ? true : false;
        this.field_Nb.field_Z = param1 < param3 ? true : false;
        this.field_Tb.field_Z = param1 < param3 ? true : false;
    }

    private final int a(int param0, boolean param1, int param2, int param3) {
        int var8 = 0;
        int var9 = 0;
        int var5 = 0;
        int var6 = this.field_Gb.field_zb - this.field_Lb.field_zb;
        int var7 = -86 % ((18 - param2) / 38);
        if (var6 > 0) {
          var8 = this.field_Lb.field_x;
          var9 = param0 - param3;
          var5 = (var6 / 2 + var9 * var8) / var6;
        }
        if (!param1) {
          if (var5 > -param3 + param0) {
            var5 = -param3 + param0;
          }
          if (var5 < 0) {
            var5 = 0;
          }
          return var5;
        }
        if (var5 < 0) {
          var5 = 0;
        }
        if (var5 > param0 - param3) {
          var5 = -param3 + param0;
          return var5;
        }
        return var5;
    }

    mj(long param0, cj param1, ja param2, ja param3, cj param4, cj param5, boolean param6) {
        this(param0, param1, param1, param4, param5, param6);
        try {
          this.field_Tb.field_rb = param2;
          this.field_Nb.field_rb = param3;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "mj.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ')');
        }
    }

    final boolean j(int param0) {
        if (param0 < 53) {
          this.j(-8);
        }
        if (this.field_Pb.field_T != 0) {
          this.field_Kb = 20;
          return true;
        }
        if (0 == this.field_Pb.field_jb) {
          return false;
        }
        if (this.field_Kb > 0) {
          this.field_Kb = this.field_Kb - 1;
        }
        if (this.field_Kb != 0) {
          return false;
        }
        if (bo.field_d >= this.field_Lb.field_mb + this.field_Lb.field_qb) {
          return false;
        }
        this.field_Kb = 3;
        return true;
    }

    private mj(long param0, cj param1, cj param2, cj param3, cj param4, boolean param5) {
        super(param0, (cj) null);
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        cj var10 = null;
        cj var11 = null;
        try {
          stackIn_4_1 = (param5);
          this.field_Jb = stackIn_4_1;
          this.field_Tb = new cj(0L, param1);
          this.field_Nb = new cj(0L, param2);
          this.a((byte) 50, this.field_Tb);
          this.a((byte) 50, this.field_Nb);
          this.field_Gb = new cj(0L, (cj) null);
          this.a((byte) 50, this.field_Gb);
          this.field_Pb = new cj(0L, param3);
          this.field_Qb = new cj(0L, param3);
          var10 = this.field_Pb;
          var11 = var10;
          this.field_Qb.field_ib = true;
          var11.field_ib = true;
          this.field_Gb.a((byte) 50, this.field_Pb);
          this.field_Gb.a((byte) 50, this.field_Qb);
          this.field_Lb = new cj(0L, param4);
          this.field_Lb.field_fb = true;
          this.field_Gb.a((byte) 50, this.field_Lb);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_8_0 = var8;
          stackIn_8_1 = new StringBuilder().append("mj.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param4 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_Ob = "<%0> might change the options - wait and see.";
        field_Rb = false;
        field_Hb = new nc[16];
        field_Fb = new int[4];
        field_Sb = "Select an enemy zombie!";
    }
}
