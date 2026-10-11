/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg extends kc {
    kc field_Cb;
    kc field_Gb;
    int field_Vb;
    int field_Eb;
    kc field_Fb;
    static eh field_Wb;
    kc field_Ub;
    int field_Bb;
    int field_Mb;
    boolean field_Kb;
    kc field_Hb;
    long field_Nb;
    static int field_Lb;
    long field_Ob;
    boolean field_Jb;
    String field_Tb;
    static String field_Rb;
    int field_Sb;
    static qb field_Ib;
    int field_Pb;
    boolean field_Db;
    String field_Qb;

    final void a(String param0, String param1, int param2) {
        CharSequence var5 = null;
        try {
          int var4_int = 41 / ((param2 + 52) / 53);
          this.field_Qb = param1;
          this.field_Tb = param0;
          var5 = (CharSequence) ((Object) this.field_Tb);
          gk.a(var5, -13);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "cg.F(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static boolean a(byte param0, uj param1, uj param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2.field_g < param1.field_g) {
            return true;
          }
          if (param0 != -111) {
            cg.f(-126);
          }
          if (param1.field_g != param2.field_g) {
            return false;
          }
          if (param1.field_e <= param2.field_e) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("cg.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static void f(int param0) {
        int var15 = 0;
        int var17_int = 0;
        int var18 = 0;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        vg var4_ref_vg = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        vg var17 = null;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        double var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          an.field_e = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          var1_int = oo.field_u.length;
          var21 = new int[var1_int];
          var20 = var21;
          var2 = var20;
          for (var3 = 0; var1_int > var3; var3++) {
            var4_ref_vg = oo.field_u[var3];
            var4_ref_vg.b((byte) 62);
            sc.b(var3, 14130);
            var5 = var4_ref_vg.field_k + var4_ref_vg.field_i >> 1;
            var6 = var4_ref_vg.field_v + var4_ref_vg.field_R >> 1;
            var7 = var4_ref_vg.field_N + var4_ref_vg.field_P >> 1;
            var8 = an.field_e[9] >> 2;
            var9 = an.field_e[10] >> 2;
            var10_int = an.field_e[11] >> 2;
            var11 = var9 * tn.field_Gb[4] + (var8 * tn.field_Gb[3] + tn.field_Gb[5] * var10_int) >> 14;
            var12 = var10_int * tn.field_Gb[8] + tn.field_Gb[6] * var8 + tn.field_Gb[7] * var9 >> 14;
            var13 = var10_int * tn.field_Gb[11] + var8 * tn.field_Gb[9] + tn.field_Gb[10] * var9 >> 14;
            var2[var3] = var13 * var7 + (var6 * var12 + var11 * var5) >> 16;
          }
          var3Lifetime1 = an.field_e[9] >> 8;
          var4 = an.field_e[10] >> 8;
          var5Lifetime1 = an.field_e[11] >> 8;
          var6Lifetime1 = gi.field_a << 4;
          var7Lifetime1 = 0;
          var8Lifetime1 = of.a(param0 - 252566934, var6Lifetime1) >> 8;
          var9Lifetime1 = j.a(var6Lifetime1, -108) >> 8;
          if (an.field_g != -1 &&
            me.field_I != -1) {
            var7Lifetime1 = -320 + an.field_g;
            var9Lifetime1 = -128;
            var8Lifetime1 = 240 - me.field_I;
          }
          var10 = 256.0 / Math.sqrt((double)(var8Lifetime1 * var8Lifetime1 + (var7Lifetime1 * var7Lifetime1 + var9Lifetime1 * var9Lifetime1)));
          var9Lifetime1 = (int)((double)var9Lifetime1 * var10);
          var8Lifetime1 = (int)((double)var8Lifetime1 * var10);
          var7Lifetime1 = (int)((double)var7Lifetime1 * var10);
          var12Lifetime1 = -var3Lifetime1 + var7Lifetime1;
          var13Lifetime1 = -var4 + var8Lifetime1;
          var14 = -var5Lifetime1 + var9Lifetime1;
          if (param0 != 252566882) {
            cg.e(false);
          }
          var10Lifetime1 = 256.0 / Math.sqrt((double)(var14 * var14 + var12Lifetime1 * var12Lifetime1 + var13Lifetime1 * var13Lifetime1));
          var13Lifetime1 = (int)((double)var13Lifetime1 * var10Lifetime1);
          var14 = (int)((double)var14 * var10Lifetime1);
          var12Lifetime1 = (int)((double)var12Lifetime1 * var10Lifetime1);
          for (var15 = 0; oo.field_u.length > var15; var15++) {
            var16 = 0;
            for (var17_int = 1; oo.field_u.length > var17_int; var17_int++) {
              if (var21[var17_int] > var21[var16]) {
                var16 = var17_int;
              }
            }
            var21[var16] = -2147483648;
            var17 = oo.field_u[var16];
            sc.b(var16, param0 ^ 252570192);
            for (var18 = 0; var18 < 3; var18++) {
              tn.field_Gb[var18] = tn.field_Gb[var18] + gn.field_g[var15][var18];
            }
            to.a((byte) -61, an.field_e, tn.field_Gb, true, var17, false, false);
            cj.a(var8Lifetime1, var13Lifetime1, var12Lifetime1, 20133, var17, var9Lifetime1, var7Lifetime1, var14);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "cg.A(" + param0 + ')');
        }
    }

    public static void e(boolean param0) {
        field_Rb = null;
        if (!param0) {
          return;
        }
        field_Wb = null;
        field_Ib = null;
    }

    cg(String param0, String param1, long param2) {
        super(0L, (kc) null);
        CharSequence var6 = null;
        try {
          this.field_Nb = param2;
          this.field_Qb = param1;
          this.field_Tb = param0;
          var6 = (CharSequence) ((Object) this.field_Tb);
          gk.a(var6, -13);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "cg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean a(byte param0, cg param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_5_0 = false;
        int stackIn_11_0 = 0;
        int stackIn_14_1 = 0;
        boolean stackIn_16_0 = false;
        boolean stackIn_20_0 = false;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_3_0 = (param1.field_Kb) ? 0 : 1;
          if (stackIn_3_0 == (this.field_Kb ? 1 : 0)) {
            stackIn_5_0 = this.field_Kb;
            return stackIn_5_0;
          }
          if (param0 != 121) {
            this.field_Sb = 21;
          }
          stackIn_11_0 = (this.field_Db) ? 0 : 1;
          if (param1.field_Db) {
            stackIn_14_1 = 0;
          } else {
            stackIn_14_1 = 1;
          }
          if (stackIn_11_0 == stackIn_14_1) {
            stackIn_20_0 = !(this.field_Ob >= param1.field_Ob);
            return stackIn_20_0;
          }
          stackIn_16_0 = this.field_Db;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("cg.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final static qb a(String param0, byte param1, eg param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        qb stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 102) {
            field_Lb = 88;
          }
          var4_int = param2.c(param3, -79);
          var5 = param2.a(param0, (byte) 54, var4_int);
          stackIn_3_0 = hj.a(var4_int, param2, var5, (byte) -10);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("cg.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final boolean e(int param0) {
        if (param0 != 183874081) {
          String var3 = (String) null;
          this.a((String) null, (String) null, 2);
        }
        return !this.d((byte) -17) ? true : false;
    }

    static {
        field_Rb = "You have not yet unlocked this option for use.";
        field_Wb = new eh();
    }
}
