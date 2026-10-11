/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb extends le {
    private le field_Pb;
    private le field_Mb;
    private boolean field_Gb;
    private int field_Ib;
    private le field_Lb;
    static int field_Kb;
    private le field_Fb;
    static int[] field_Ob;
    private le field_Nb;
    private le field_Jb;
    static int field_Hb;

    final boolean h(int param0) {
        if (this.field_Pb.field_Q != 0) {
          this.field_Ib = 20;
          return true;
        }
        if (~this.field_Pb.field_W == param0) {
          return false;
        }
        if (this.field_Ib > 0) {
          this.field_Ib = this.field_Ib - 1;
          if (this.field_Ib != 0) {
            return false;
          }
          if (this.field_Mb.field_z + this.field_Mb.field_mb > rb.field_m) {
            this.field_Ib = 3;
            return true;
          }
          return false;
        }
        if (this.field_Ib != 0) {
          return false;
        }
        if (this.field_Mb.field_z + this.field_Mb.field_mb > rb.field_m) {
          this.field_Ib = 3;
          return true;
        }
        return false;
    }

    final boolean d(byte param0) {
        if (param0 >= -122) {
          return true;
        }
        return this.field_Mb.field_W != 0 ? true : false;
    }

    pb(long param0, pb param1, boolean param2) {
        this(param0, param1.field_Jb, param1.field_Fb, param1.field_Pb, param1.field_Mb, param2);
    }

    final boolean g(int param0) {
        if (0 != this.field_Fb.field_Q) {
          this.field_Ib = 20;
          return true;
        }
        if (param0 <= 118) {
          return false;
        }
        if (this.field_Fb.field_W == 0) {
          return false;
        }
        if (0 < this.field_Ib) {
          this.field_Ib = this.field_Ib - 1;
          if (this.field_Ib == 0) {
            this.field_Ib = 3;
            return true;
          }
          return false;
        }
        if (this.field_Ib == 0) {
          this.field_Ib = 3;
          return true;
        }
        return false;
    }

    final static boolean a(int param0, String param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          var2_int = param1.charAt(0);
          for (var3 = 1; param1.length() > var3; var3++) {
            if (~param1.charAt(var3) != ~var2_int) {
              return false;
            }
          }
          if (param0 == 17032) {
            return true;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("pb.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void b(int param0, int param1, int param2, boolean param3) {
        if (!this.field_Gb) {
          this.a(param2, param0, param1, true);
          if (param3) {
            this.field_Nb = (le) null;
            return;
          }
          return;
        }
        this.a(param2, param1, (byte) -87, param0);
        if (param3) {
          this.field_Nb = (le) null;
          return;
        }
    }

    public static void f(int param0) {
        if (param0 >= -83) {
          field_Kb = -91;
          field_Ob = null;
          return;
        }
        field_Ob = null;
    }

    final boolean e(byte param0) {
        if (0 != this.field_Nb.field_Q) {
          this.field_Ib = 20;
          return true;
        }
        if (param0 <= 61) {
          return true;
        }
        if (this.field_Nb.field_W == 0) {
          return false;
        }
        if (this.field_Ib > 0) {
          this.field_Ib = this.field_Ib - 1;
          if (0 != this.field_Ib) {
            return false;
          }
          if (rb.field_m < this.field_Mb.field_N + this.field_Mb.field_z + (this.field_Mb.field_mb + this.field_Mb.field_sb)) {
            return false;
          }
          this.field_Ib = 3;
          return true;
        }
        if (0 != this.field_Ib) {
          return false;
        }
        if (rb.field_m >= this.field_Mb.field_N + this.field_Mb.field_z + (this.field_Mb.field_mb + this.field_Mb.field_sb)) {
          this.field_Ib = 3;
          return true;
        }
        return false;
    }

    final boolean i(int param0) {
        if (param0 != 4308) {
          this.h(-127);
          if (0 != this.field_Jb.field_Q) {
            this.field_Ib = 20;
            return true;
          }
          if (this.field_Jb.field_W == 0) {
            return false;
          }
          if (this.field_Ib > 0) {
            this.field_Ib = this.field_Ib - 1;
          }
          if (this.field_Ib == 0) {
            this.field_Ib = 3;
            return true;
          }
          return false;
        }
        if (0 != this.field_Jb.field_Q) {
          this.field_Ib = 20;
          return true;
        }
        if (this.field_Jb.field_W == 0) {
          return false;
        }
        if (this.field_Ib > 0) {
          this.field_Ib = this.field_Ib - 1;
        }
        if (this.field_Ib == 0) {
          this.field_Ib = 3;
          return true;
        }
        return false;
    }

    final static vb b(String param0, byte param1) {
        String var2 = null;
        vb var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        vb stackIn_18_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (kj.field_g == null) {
            return null;
          }
          if (param0 == null) {
            return null;
          }
          if (param0.length() == 0) {
            return null;
          }
          if (param1 >= -107) {
            field_Kb = 14;
          }
          var6 = (CharSequence) ((Object) param0);
          var2 = mf.a(false, var6);
          if (var2 == null) {
            return null;
          }
          var3 = (vb) (kj.field_g.a((long)var2.hashCode(), -30828));
          while (true) {
            if (var3 == null) {
              return null;
            }
            var7 = (CharSequence) ((Object) var3.field_Ib);
            var4 = mf.a(false, var7);
            if (!var4.equals(var2)) {
              var3 = (vb) (kj.field_g.a(-118));
              continue;
            }
            break;
          }
          stackIn_18_0 = var3;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_23_0 = var2_ref;
          stackIn_23_1 = new StringBuilder().append("pb.N(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, boolean param3) {
        int var5 = 0;
        int var6 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        le var15 = null;
        le var16 = null;
        le var17 = null;
        le var18 = null;
        le var19 = null;
        le var20 = null;
        int var14 = HostileSpawn.field_I ? 1 : 0;
        le var15Lifetime1;
        le var15Lifetime2;
        le var16Lifetime1;
        le var16Lifetime2;
        le var17Lifetime1;
        le var17Lifetime2;
        le var18Lifetime1;
        le var18Lifetime2;
        le var19Lifetime1;
        le var19Lifetime2;
        le var20Lifetime1;
        le var20Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        if (this.field_qb >= 2 * this.field_sb) {
          var5 = this.field_sb;
          var6 = -this.field_sb + this.field_qb;
        } else {
          var6 = this.field_qb / 2;
          var5 = this.field_qb / 2;
        }
        int var7 = -var5 + var6;
        int var8 = var7;
        if (param2 <= param1) {
          var7 = 0;
          var9 = param2 - param1;
          var10 = -var8 + var7;
          var11 = 0;
          if (var9 > 0) {
            var11 = (var9 / 2 + var10 * param0) / var9;
          }
          var12 = var11 + var8 / 2;
          var15 = this.field_Jb;
          var15.field_sb = this.field_sb;
          var15.field_qb = var5;
          var15.field_zb = 0;
          var15.field_tb = 0;
          var16 = this.field_Fb;
          var16.field_zb = 0;
          var16.field_tb = var6;
          if (!param3) {
            return;
          }
          var16.field_sb = this.field_sb;
          var16.field_qb = -var6 + this.field_qb;
          var17 = this.field_Lb;
          var17.field_tb = var5;
          var17.field_zb = 0;
          var17.field_sb = this.field_sb;
          var17.field_qb = var7;
          var18 = this.field_Pb;
          var18.field_qb = var12;
          var18.field_sb = this.field_sb;
          var18.field_tb = 0;
          var18.field_zb = 0;
          var19 = this.field_Nb;
          var19.field_qb = -var12 + var7;
          var19.field_zb = 0;
          var19.field_sb = this.field_sb;
          var19.field_tb = var12;
          var20 = this.field_Mb;
          var20.field_tb = var11;
          this.field_Lb.field_jb = param2 > param1 ? true : false;
          this.field_Fb.field_jb = param2 > param1 ? true : false;
          this.field_Jb.field_jb = param2 > param1 ? true : false;
          var20.field_zb = 0;
          var20.field_qb = var8;
          var20.field_sb = this.field_sb;
          return;
        }
        var8 = var8 * param1 / param2;
        if (!(this.field_sb <= var8)) {
          var8 = this.field_sb;
        }
        if (var7 >= var8) {
          var9Lifetime1 = param2 - param1;
          var10Lifetime1 = -var8 + var7;
          var11Lifetime1 = 0;
          if (var9Lifetime1 > 0) {
            var11Lifetime1 = (var9Lifetime1 / 2 + var10Lifetime1 * param0) / var9Lifetime1;
          }
          var12Lifetime1 = var11Lifetime1 + var8 / 2;
          var15Lifetime1 = this.field_Jb;
          var15Lifetime1.field_sb = this.field_sb;
          var15Lifetime1.field_qb = var5;
          var15Lifetime1.field_zb = 0;
          var15Lifetime1.field_tb = 0;
          var16Lifetime1 = this.field_Fb;
          var16Lifetime1.field_zb = 0;
          var16Lifetime1.field_tb = var6;
          if (!param3) {
            return;
          }
          var16Lifetime1.field_sb = this.field_sb;
          var16Lifetime1.field_qb = -var6 + this.field_qb;
          var17Lifetime1 = this.field_Lb;
          var17Lifetime1.field_tb = var5;
          var17Lifetime1.field_zb = 0;
          var17Lifetime1.field_sb = this.field_sb;
          var17Lifetime1.field_qb = var7;
          var18Lifetime1 = this.field_Pb;
          var18Lifetime1.field_qb = var12Lifetime1;
          var18Lifetime1.field_sb = this.field_sb;
          var18Lifetime1.field_tb = 0;
          var18Lifetime1.field_zb = 0;
          var19Lifetime1 = this.field_Nb;
          var19Lifetime1.field_qb = -var12Lifetime1 + var7;
          var19Lifetime1.field_zb = 0;
          var19Lifetime1.field_sb = this.field_sb;
          var19Lifetime1.field_tb = var12Lifetime1;
          var20Lifetime1 = this.field_Mb;
          var20Lifetime1.field_tb = var11Lifetime1;
          this.field_Lb.field_jb = param2 > param1 ? true : false;
          this.field_Fb.field_jb = param2 > param1 ? true : false;
          this.field_Jb.field_jb = param2 > param1 ? true : false;
          var20Lifetime1.field_zb = 0;
          var20Lifetime1.field_qb = var8;
          var20Lifetime1.field_sb = this.field_sb;
          return;
        }
        var8 = var7;
        var9Lifetime2 = param2 - param1;
        var10Lifetime2 = -var8 + var7;
        var11Lifetime2 = 0;
        if (var9Lifetime2 > 0) {
          var11Lifetime2 = (var9Lifetime2 / 2 + var10Lifetime2 * param0) / var9Lifetime2;
        }
        var12Lifetime2 = var11Lifetime2 + var8 / 2;
        var15Lifetime2 = this.field_Jb;
        var15Lifetime2.field_sb = this.field_sb;
        var15Lifetime2.field_qb = var5;
        var15Lifetime2.field_zb = 0;
        var15Lifetime2.field_tb = 0;
        var16Lifetime2 = this.field_Fb;
        var16Lifetime2.field_zb = 0;
        var16Lifetime2.field_tb = var6;
        if (!param3) {
          return;
        }
        var16Lifetime2.field_sb = this.field_sb;
        var16Lifetime2.field_qb = -var6 + this.field_qb;
        var17Lifetime2 = this.field_Lb;
        var17Lifetime2.field_tb = var5;
        var17Lifetime2.field_zb = 0;
        var17Lifetime2.field_sb = this.field_sb;
        var17Lifetime2.field_qb = var7;
        var18Lifetime2 = this.field_Pb;
        var18Lifetime2.field_qb = var12Lifetime2;
        var18Lifetime2.field_sb = this.field_sb;
        var18Lifetime2.field_tb = 0;
        var18Lifetime2.field_zb = 0;
        var19Lifetime2 = this.field_Nb;
        var19Lifetime2.field_qb = -var12Lifetime2 + var7;
        var19Lifetime2.field_zb = 0;
        var19Lifetime2.field_sb = this.field_sb;
        var19Lifetime2.field_tb = var12Lifetime2;
        var20Lifetime2 = this.field_Mb;
        var20Lifetime2.field_tb = var11Lifetime2;
        this.field_Lb.field_jb = param2 > param1 ? true : false;
        this.field_Fb.field_jb = param2 > param1 ? true : false;
        this.field_Jb.field_jb = param2 > param1 ? true : false;
        var20Lifetime2.field_zb = 0;
        var20Lifetime2.field_qb = var8;
        var20Lifetime2.field_sb = this.field_sb;
    }

    final int a(int param0, boolean param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        var5 = 0;
        var6 = this.field_Lb.field_sb - this.field_Mb.field_sb;
        if (0 < var6) {
          var7 = this.field_Mb.field_zb;
          var8 = -param2 + param0;
          var5 = (var6 / 2 + var7 * var8) / var6;
        }
        if (!param1) {
          if (param0 - param2 < var5) {
            var5 = param0 - param2;
          }
          if (var5 < 0) {
            var5 = 0;
          }
        } else {
          if (var5 < 0) {
            var5 = 0;
          }
          if (-param2 + param0 < var5) {
            var5 = -param2 + param0;
          }
        }
        if (param3 > 18) {
          return var5;
        }
        this.g(108);
        return var5;
    }

    pb(long param0, le param1, le param2, le param3, le param4, boolean param5) {
        super(param0, (le) null);
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
        le var10 = null;
        le var11 = null;
        try {
          stackIn_4_1 = (param5);
          this.field_Gb = stackIn_4_1;
          this.field_Jb = new le(0L, param1);
          this.field_Fb = new le(0L, param2);
          this.a(false, this.field_Jb);
          this.a(false, this.field_Fb);
          this.field_Lb = new le(0L, (le) null);
          this.a(false, this.field_Lb);
          this.field_Pb = new le(0L, param3);
          this.field_Nb = new le(0L, param3);
          this.field_Nb.field_B = true;
          var10 = this.field_Pb;
          var11 = var10;
          var11.field_B = true;
          this.field_Lb.a(false, this.field_Pb);
          this.field_Lb.a(false, this.field_Nb);
          this.field_Mb = new le(0L, param4);
          this.field_Mb.field_Db = true;
          this.field_Lb.a(false, this.field_Mb);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_8_0 = var8;
          stackIn_8_1 = new StringBuilder().append("pb.<init>(").append(param0).append(',');
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
          throw wg.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param5).append(')').toString());
        }
    }

    final int b(int param0, boolean param1, int param2, int param3) {
        int var8 = 0;
        int var9 = 0;
        int var5 = 0;
        int var7 = 127 % ((46 - param2) / 53);
        int var6 = this.field_Lb.field_qb - this.field_Mb.field_qb;
        if (var6 > 0) {
          var8 = this.field_Mb.field_tb;
          var9 = -param3 + param0;
          var5 = (var9 * var8 + var6 / 2) / var6;
        }
        if (!param1) {
          if (-param3 + param0 < var5) {
            var5 = -param3 + param0;
          }
          if (var5 < 0) {
            var5 = 0;
            return var5;
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

    private final void a(int param0, int param1, byte param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var14;
        int var15;
        le var16;
        le var17;
        le var18;
        le var19;
        le var20;
        le var21;
        le stackIn_13_0 = null;
        le stackIn_13_1 = null;
        le stackIn_13_2 = null;
        boolean stackIn_14_3 = false;
        le stackIn_21_0 = null;
        le stackIn_21_1 = null;
        le stackIn_21_2 = null;
        boolean stackIn_22_3 = false;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var14Lifetime1;
        le var16Lifetime1;
        le var17Lifetime1;
        le var18Lifetime1;
        le var19Lifetime1;
        le var20Lifetime1;
        le var21Lifetime1;
        var15 = HostileSpawn.field_I ? 1 : 0;
        if (this.field_qb * 2 > this.field_sb) {
          var6 = this.field_sb / 2;
          var5 = this.field_sb / 2;
        } else {
          var5 = this.field_qb;
          var6 = this.field_sb - this.field_qb;
        }
        var7 = var6 - var5;
        var8 = var7;
        if (param1 <= param3) {
          var7 = 0;
        } else {
          var8 = var8 * param3 / param1;
          if (this.field_qb > var8) {
            var8 = this.field_qb;
          }
          if (var8 > var7) {
            var8 = var7;
            var9 = -param3 + param1;
            var10 = -var8 + var7;
            var11 = 0;
            if (var9 > 0) {
              var11 = (var9 / 2 + param0 * var10) / var9;
            }
            var12 = var8 / 2 + var11;
            var16 = this.field_Jb;
            var14 = 96 / ((64 - param2) / 57);
            var16.field_qb = this.field_qb;
            var16.field_zb = 0;
            var16.field_tb = 0;
            var16.field_sb = var5;
            var17 = this.field_Fb;
            var17.field_sb = this.field_sb - var6;
            var17.field_qb = this.field_qb;
            var17.field_tb = 0;
            var17.field_zb = var6;
            var18 = this.field_Lb;
            var18.field_qb = this.field_qb;
            var18.field_sb = var7;
            var18.field_zb = var5;
            var18.field_tb = 0;
            var19 = this.field_Pb;
            var19.field_qb = this.field_qb;
            var19.field_zb = 0;
            var19.field_tb = 0;
            var19.field_sb = var12;
            var20 = this.field_Nb;
            var20.field_zb = var12;
            var20.field_sb = var7 - var12;
            var20.field_tb = 0;
            var20.field_qb = this.field_qb;
            var21 = this.field_Mb;
            var21.field_zb = var11;
            stackIn_13_0 = this.field_Jb;
            stackIn_13_1 = this.field_Fb;
            stackIn_13_2 = this.field_Lb;
            stackIn_14_3 = (param1 <= param3) ? false : true;
            stackIn_13_2.field_jb = stackIn_14_3;
            stackIn_13_1.field_jb = stackIn_14_3;
            stackIn_13_0.field_jb = stackIn_14_3;
            var21.field_qb = this.field_qb;
            var21.field_tb = 0;
            var21.field_sb = var8;
            return;
          }
        }
        var9Lifetime1 = -param3 + param1;
        var10Lifetime1 = -var8 + var7;
        var11Lifetime1 = 0;
        if (var9Lifetime1 > 0) {
          var11Lifetime1 = (var9Lifetime1 / 2 + param0 * var10Lifetime1) / var9Lifetime1;
        }
        var12Lifetime1 = var8 / 2 + var11Lifetime1;
        var16Lifetime1 = this.field_Jb;
        var14Lifetime1 = 96 / ((64 - param2) / 57);
        var16Lifetime1.field_qb = this.field_qb;
        var16Lifetime1.field_zb = 0;
        var16Lifetime1.field_tb = 0;
        var16Lifetime1.field_sb = var5;
        var17Lifetime1 = this.field_Fb;
        var17Lifetime1.field_sb = this.field_sb - var6;
        var17Lifetime1.field_qb = this.field_qb;
        var17Lifetime1.field_tb = 0;
        var17Lifetime1.field_zb = var6;
        var18Lifetime1 = this.field_Lb;
        var18Lifetime1.field_qb = this.field_qb;
        var18Lifetime1.field_sb = var7;
        var18Lifetime1.field_zb = var5;
        var18Lifetime1.field_tb = 0;
        var19Lifetime1 = this.field_Pb;
        var19Lifetime1.field_qb = this.field_qb;
        var19Lifetime1.field_zb = 0;
        var19Lifetime1.field_tb = 0;
        var19Lifetime1.field_sb = var12Lifetime1;
        var20Lifetime1 = this.field_Nb;
        var20Lifetime1.field_zb = var12Lifetime1;
        var20Lifetime1.field_sb = var7 - var12Lifetime1;
        var20Lifetime1.field_tb = 0;
        var20Lifetime1.field_qb = this.field_qb;
        var21Lifetime1 = this.field_Mb;
        var21Lifetime1.field_zb = var11Lifetime1;
        stackIn_21_0 = this.field_Jb;
        stackIn_21_1 = this.field_Fb;
        stackIn_21_2 = this.field_Lb;
        stackIn_22_3 = (param1 <= param3) ? false : true;
        stackIn_21_2.field_jb = stackIn_22_3;
        stackIn_21_1.field_jb = stackIn_22_3;
        stackIn_21_0.field_jb = stackIn_22_3;
        var21Lifetime1.field_qb = this.field_qb;
        var21Lifetime1.field_tb = 0;
        var21Lifetime1.field_sb = var8;
    }

    static {
        field_Ob = nf.a(false);
        field_Hb = 0;
    }
}
