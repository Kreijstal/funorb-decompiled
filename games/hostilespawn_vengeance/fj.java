/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fj extends le {
    static long field_Rb;
    private le field_Fb;
    private le field_Gb;
    static rc field_Tb;
    private le field_Qb;
    static String field_Sb;
    static int field_Lb;
    private int field_Hb;
    private le field_Nb;
    static int field_Jb;
    static bd[] field_Kb;
    private le field_Ib;
    static double field_Pb;
    private le field_Mb;
    static int field_Ob;

    fj(long param0, le param1, le param2, le param3, le param4) {
        super(param0, (le) null);
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        le var9 = null;
        le var10 = null;
        try {
          this.field_Fb = new le(0L, param1);
          this.field_Gb = new le(0L, param2);
          this.a(false, this.field_Fb);
          this.a(false, this.field_Gb);
          this.field_Qb = new le(0L, (le) null);
          this.a(false, this.field_Qb);
          this.field_Nb = new le(0L, param3);
          this.field_Ib = new le(0L, param3);
          this.field_Ib.field_B = true;
          var9 = this.field_Nb;
          var10 = var9;
          var10.field_B = true;
          this.field_Qb.a(false, this.field_Nb);
          this.field_Qb.a(false, this.field_Ib);
          this.field_Mb = new le(0L, param4);
          this.field_Mb.field_Db = true;
          this.field_Qb.a(false, this.field_Mb);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_5_0 = var7;
          stackIn_5_1 = new StringBuilder().append("fj.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static Boolean k(int param0) {
        Boolean var1 = ii.field_h;
        if (param0 != -11401) {
          field_Tb = (rc) null;
          ii.field_h = null;
          return var1;
        }
        ii.field_h = null;
        return var1;
    }

    public static void i(int param0) {
        field_Sb = null;
        field_Tb = null;
        if (param0 != -24510) {
          field_Pb = -1.0872068835562798;
          field_Kb = null;
          return;
        }
        field_Kb = null;
    }

    final boolean h(int param0) {
        if (param0 == -24467) {
          return this.field_Mb.field_W != 0 ? true : false;
        }
        field_Tb = (rc) null;
        return this.field_Mb.field_W != 0 ? true : false;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        le var14 = null;
        le var15 = null;
        le var16 = null;
        le var17 = null;
        le var18 = null;
        le var19 = null;
        le var14Lifetime1;
        le var15Lifetime1;
        le var16Lifetime1;
        le var17Lifetime1;
        le var18Lifetime1;
        le var19Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        if (this.field_qb * 2 <= this.field_sb) {
          var5 = this.field_qb;
          var6 = -this.field_qb + this.field_sb;
        } else {
          var6 = this.field_sb / 2;
          var5 = this.field_sb / 2;
        }
        int var7 = var6 - var5;
        int var8 = var7;
        if (param0 > 0) {
          var8 = var8 * param2 / param0;
          if (var8 < this.field_qb) {
            var8 = this.field_qb;
          }
          if (var8 > var7) {
            var8 = var7;
          }
          var9 = param0 - param2;
          var10 = var7 - var8;
          var11 = 0;
          if (0 < var9) {
            var11 = (var9 / 2 + param3 * var10) / var9;
          }
          var12 = var11 + var8 / 2;
          var14 = this.field_Fb;
          var14.field_sb = var5;
          var14.field_qb = this.field_qb;
          var14.field_zb = 0;
          var14.field_tb = 0;
          var15 = this.field_Gb;
          var15.field_zb = var6;
          var15.field_qb = this.field_qb;
          var15.field_tb = param1;
          var15.field_sb = -var6 + this.field_sb;
          var16 = this.field_Qb;
          var16.field_qb = this.field_qb;
          var16.field_tb = 0;
          var16.field_zb = var5;
          var16.field_sb = var7;
          var17 = this.field_Nb;
          var17.field_zb = 0;
          var17.field_sb = var12;
          var17.field_tb = 0;
          var17.field_qb = this.field_qb;
          var18 = this.field_Ib;
          var18.field_tb = 0;
          var18.field_zb = var12;
          var18.field_qb = this.field_qb;
          var18.field_sb = -var12 + var7;
          var19 = this.field_Mb;
          var19.field_tb = 0;
          var19.field_sb = var8;
          var19.field_zb = var11;
          this.field_Qb.field_jb = param2 < param0 ? true : false;
          this.field_Gb.field_jb = param2 < param0 ? true : false;
          this.field_Fb.field_jb = param2 < param0 ? true : false;
          var19.field_qb = this.field_qb;
          return;
        }
        var9Lifetime1 = param0 - param2;
        var10Lifetime1 = var7 - var8;
        var11Lifetime1 = 0;
        if (0 < var9Lifetime1) {
          var11Lifetime1 = (var9Lifetime1 / 2 + param3 * var10Lifetime1) / var9Lifetime1;
        }
        var12Lifetime1 = var11Lifetime1 + var8 / 2;
        var14Lifetime1 = this.field_Fb;
        var14Lifetime1.field_sb = var5;
        var14Lifetime1.field_qb = this.field_qb;
        var14Lifetime1.field_zb = 0;
        var14Lifetime1.field_tb = 0;
        var15Lifetime1 = this.field_Gb;
        var15Lifetime1.field_zb = var6;
        var15Lifetime1.field_qb = this.field_qb;
        var15Lifetime1.field_tb = param1;
        var15Lifetime1.field_sb = -var6 + this.field_sb;
        var16Lifetime1 = this.field_Qb;
        var16Lifetime1.field_qb = this.field_qb;
        var16Lifetime1.field_tb = 0;
        var16Lifetime1.field_zb = var5;
        var16Lifetime1.field_sb = var7;
        var17Lifetime1 = this.field_Nb;
        var17Lifetime1.field_zb = 0;
        var17Lifetime1.field_sb = var12Lifetime1;
        var17Lifetime1.field_tb = 0;
        var17Lifetime1.field_qb = this.field_qb;
        var18Lifetime1 = this.field_Ib;
        var18Lifetime1.field_tb = 0;
        var18Lifetime1.field_zb = var12Lifetime1;
        var18Lifetime1.field_qb = this.field_qb;
        var18Lifetime1.field_sb = -var12Lifetime1 + var7;
        var19Lifetime1 = this.field_Mb;
        var19Lifetime1.field_tb = 0;
        var19Lifetime1.field_sb = var8;
        var19Lifetime1.field_zb = var11Lifetime1;
        this.field_Qb.field_jb = param2 < param0 ? true : false;
        this.field_Gb.field_jb = param2 < param0 ? true : false;
        this.field_Fb.field_jb = param2 < param0 ? true : false;
        var19Lifetime1.field_qb = this.field_qb;
    }

    final boolean f(int param0) {
        if (param0 != 2) {
          this.field_Mb = (le) null;
          if (0 != this.field_Fb.field_Q) {
            this.field_Hb = 20;
            return true;
          }
          if (this.field_Fb.field_W == 0) {
            return false;
          }
          if (this.field_Hb > 0) {
            this.field_Hb = this.field_Hb - 1;
          }
          if (this.field_Hb == 0) {
            this.field_Hb = 3;
            return true;
          }
          return false;
        }
        if (0 != this.field_Fb.field_Q) {
          this.field_Hb = 20;
          return true;
        }
        if (this.field_Fb.field_W == 0) {
          return false;
        }
        if (this.field_Hb > 0) {
          this.field_Hb = this.field_Hb - 1;
        }
        if (this.field_Hb == 0) {
          this.field_Hb = 3;
          return true;
        }
        return false;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.field_qb = param1;
        this.field_zb = param4;
        if (param3 == 20) {
          this.field_sb = param5;
          this.field_tb = param0;
          this.a(param7, 0, param6, param2);
          return;
        }
        String var10 = (String) null;
        fj.a((String) null, 31, false, (String) null, -42, (byte) 83, (String) null);
        this.field_sb = param5;
        this.field_tb = param0;
        this.a(param7, 0, param6, param2);
    }

    final static int a(String param0, int param1, boolean param2, String param3, int param4, byte param5, String param6) {
        s var7 = null;
        RuntimeException var7_ref = null;
        s var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = new s(param6);
          if (param5 != -8) {
            field_Kb = (bd[]) null;
          }
          var8 = new s(param0);
          stackIn_3_0 = lb.a(param1, (byte) 124, var7, param2, var8, param3, param4);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_6_0 = var7_ref;
          stackIn_6_1 = new StringBuilder().append("fj.F(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(int param0, m param1, boolean param2) {
        en var6 = null;
        int var4 = 0;
        try {
          if (!param2) {
            String var5 = (String) null;
            fj.a((String) null, 7, true, (String) null, 102, (byte) 5, (String) null);
          }
          var6 = s.field_b;
          en var3 = var6;
          var6.i(19319, param0);
          var6.field_i = var6.field_i + 1;
          var4 = var6.field_i;
          var6.d(106, 1);
          if (param1.field_i != null) {
            var6.d(114, param1.field_i.length);
            var6.a(param1.field_i.length, param1.field_i, true, 0);
          } else {
            var6.d(80, 0);
          }
          var6.f(var4, -90);
          var6.field_i = var6.field_i - 4;
          param1.field_o = var6.d(8195);
          var6.a(var6.field_i - var4, -19720);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "fj.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final int a(int param0, boolean param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var5Lifetime1;
        var5 = 0;
        var6 = this.field_Qb.field_sb - this.field_Mb.field_sb;
        if (param2 <= -22) {
          if (var6 > 0) {
            var7 = this.field_Mb.field_zb;
            var8 = -param3 + param0;
            var5 = (var8 * var7 + var6 / 2) / var6;
          }
        } else {
          this.a(-95, -63, 115, -27);
          if (var6 > 0) {
            var7 = this.field_Mb.field_zb;
            var8 = -param3 + param0;
            var5 = (var8 * var7 + var6 / 2) / var6;
          }
        }
        if (!param1) {
          if (var5 > param0 - param3) {
            var5 = param0 - param3;
          }
          if (var5 >= 0) {
            return var5;
          }
          var5 = 0;
          return var5;
        }
        if (0 > var5) {
          var5 = 0;
        }
        if (-param3 + param0 >= var5) {
          return var5;
        }
        var5Lifetime1 = -param3 + param0;
        return var5Lifetime1;
    }

    final boolean j(int param0) {
        if (this.field_Gb.field_Q != 0) {
          this.field_Hb = 20;
          return true;
        }
        if (param0 != 0) {
          this.g(-49);
        }
        if (this.field_Gb.field_W == 0) {
          return false;
        }
        if (this.field_Hb > 0) {
          this.field_Hb = this.field_Hb - 1;
        }
        if (this.field_Hb != 0) {
          return false;
        }
        this.field_Hb = 3;
        return true;
    }

    final boolean g(int param0) {
        if (this.field_Nb.field_Q != 0) {
          this.field_Hb = 20;
          return true;
        }
        if (~this.field_Nb.field_W == param0) {
          return false;
        }
        if (this.field_Hb > 0) {
          this.field_Hb = this.field_Hb - 1;
        }
        if (this.field_Hb != 0) {
          return false;
        }
        if (this.field_Mb.field_mb + this.field_Mb.field_z > rb.field_m) {
          this.field_Hb = 3;
          return true;
        }
        return false;
    }

    final static void a(byte[] param0, int param1, int param2, File param3) throws IOException {
        FileOutputStream var4 = null;
        try {
          if (param1 != 15445) {
            field_Ob = 85;
          }
          var4 = new FileOutputStream(param3);
          var4.write(param0, 0, param2);
          var4.close();
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "fj.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean c(boolean param0) {
        if (this.field_Ib.field_Q != 0) {
          this.field_Hb = 20;
          return true;
        }
        if (param0) {
          return false;
        }
        if (this.field_Ib.field_W == 0) {
          return false;
        }
        if (this.field_Hb > 0) {
          this.field_Hb = this.field_Hb - 1;
        }
        if (this.field_Hb != 0) {
          return false;
        }
        if (this.field_Mb.field_N + this.field_Mb.field_sb + (this.field_Mb.field_z + this.field_Mb.field_mb) <= rb.field_m) {
          this.field_Hb = 3;
          return true;
        }
        return false;
    }

    final int a(int param0, byte param1, int param2) {
        if (param1 == 126) {
          return this.a(param0, false, -110, param2);
        }
        field_Jb = -105;
        return this.a(param0, false, -110, param2);
    }

    static {
        field_Pb = 0.0;
    }
}
