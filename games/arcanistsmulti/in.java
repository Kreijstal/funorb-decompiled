/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class in extends kc {
    private kc field_Ib;
    static kc field_Jb;
    private kc field_Cb;
    private kc field_Mb;
    static co field_Gb;
    private int field_Bb;
    static java.awt.Frame field_Eb;
    private kc field_Lb;
    static byte[] field_Nb;
    static int[] field_Fb;
    private kc field_Hb;
    static String field_Kb;
    private kc field_Db;

    final boolean e(int param0) {
        int var2 = 0;
        int var2Lifetime1;
        int var2Lifetime2;
        if (this.field_Hb.field_U != 0) {
          this.field_Bb = 20;
          return true;
        }
        if (0 == this.field_Hb.field_P) {
          var2 = 83 % ((param0 + 69) / 52);
          return false;
        }
        if (0 < this.field_Bb) {
          this.field_Bb = this.field_Bb - 1;
        }
        if (this.field_Bb != 0) {
          var2Lifetime1 = 83 % ((param0 + 69) / 52);
          return false;
        }
        if (me.field_I < this.field_Cb.field_nb + this.field_Cb.field_bb) {
          this.field_Bb = 3;
          return true;
        }
        var2Lifetime2 = 83 % ((param0 + 69) / 52);
        return false;
    }

    final boolean f(byte param0) {
        if (this.field_Mb.field_U != 0) {
          this.field_Bb = 20;
          return true;
        }
        if (0 == this.field_Mb.field_P) {
          if (param0 == 59) {
            return false;
          }
          field_Jb = (kc) null;
          return false;
        }
        if (this.field_Bb > 0) {
          this.field_Bb = this.field_Bb - 1;
          if (this.field_Bb == 0) {
            this.field_Bb = 3;
            return true;
          }
          if (param0 != 59) {
            field_Jb = (kc) null;
            return false;
          }
          return false;
        }
        if (this.field_Bb == 0) {
          this.field_Bb = 3;
          return true;
        }
        if (param0 == 59) {
          return false;
        }
        field_Jb = (kc) null;
        return false;
    }

    final boolean f(int param0) {
        int var2 = -50 / ((param0 - 44) / 41);
        return this.field_Cb.field_P != 0 ? true : false;
    }

    in(long param0, in param1) {
        this(param0, param1.field_Mb, param1.field_Ib, param1.field_Hb, param1.field_Cb);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var6 = 0;
        int var5 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        kc var14 = null;
        kc var15 = null;
        kc var16 = null;
        kc var17 = null;
        kc var18 = null;
        kc var19 = null;
        kc var14Lifetime1;
        kc var15Lifetime1;
        kc var16Lifetime1;
        kc var17Lifetime1;
        kc var18Lifetime1;
        kc var19Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        if (this.field_x * 2 > this.field_I) {
          var6 = this.field_I / 2;
          var5 = this.field_I / 2;
        } else {
          var6 = -this.field_x + this.field_I;
          var5 = this.field_x;
        }
        int var7 = -var5 + var6;
        int var8 = var7;
        if (0 >= param3) {
          var9 = param3 - param1;
          var10 = -var8 + var7;
          var11 = 0;
          if (var9 > 0) {
            var11 = (var9 / 2 + param2 * var10) / var9;
          }
          var12 = var11 + var8 / 2;
          var14 = this.field_Mb;
          var14.field_db = 0;
          var14.field_T = 0;
          var14.field_I = var5;
          var14.field_x = this.field_x;
          var15 = this.field_Ib;
          var15.field_x = this.field_x;
          var15.field_I = this.field_I - var6;
          var15.field_db = var6;
          var15.field_T = 0;
          var16 = this.field_Lb;
          var16.field_x = this.field_x;
          var16.field_I = var7;
          var16.field_db = var5;
          var16.field_T = 0;
          var17 = this.field_Hb;
          var17.field_I = var12;
          var17.field_T = 0;
          var17.field_db = 0;
          var17.field_x = this.field_x;
          var18 = this.field_Db;
          var18.field_T = 0;
          var18.field_db = var12;
          if (param0 <= 87) {
            return;
          }
          var18.field_x = this.field_x;
          var18.field_I = var7 - var12;
          var19 = this.field_Cb;
          var19.field_x = this.field_x;
          var19.field_T = 0;
          this.field_Lb.field_ub = param1 < param3 ? true : false;
          this.field_Ib.field_ub = param1 < param3 ? true : false;
          this.field_Mb.field_ub = param1 < param3 ? true : false;
          var19.field_db = var11;
          var19.field_I = var8;
          return;
        }
        var8 = var8 * param1 / param3;
        if (!(var8 >= this.field_x)) {
          var8 = this.field_x;
        }
        if (var7 < var8) {
          var8 = var7;
        }
        var9Lifetime1 = param3 - param1;
        var10Lifetime1 = -var8 + var7;
        var11Lifetime1 = 0;
        if (var9Lifetime1 > 0) {
          var11Lifetime1 = (var9Lifetime1 / 2 + param2 * var10Lifetime1) / var9Lifetime1;
        }
        var12Lifetime1 = var11Lifetime1 + var8 / 2;
        var14Lifetime1 = this.field_Mb;
        var14Lifetime1.field_db = 0;
        var14Lifetime1.field_T = 0;
        var14Lifetime1.field_I = var5;
        var14Lifetime1.field_x = this.field_x;
        var15Lifetime1 = this.field_Ib;
        var15Lifetime1.field_x = this.field_x;
        var15Lifetime1.field_I = this.field_I - var6;
        var15Lifetime1.field_db = var6;
        var15Lifetime1.field_T = 0;
        var16Lifetime1 = this.field_Lb;
        var16Lifetime1.field_x = this.field_x;
        var16Lifetime1.field_I = var7;
        var16Lifetime1.field_db = var5;
        var16Lifetime1.field_T = 0;
        var17Lifetime1 = this.field_Hb;
        var17Lifetime1.field_I = var12Lifetime1;
        var17Lifetime1.field_T = 0;
        var17Lifetime1.field_db = 0;
        var17Lifetime1.field_x = this.field_x;
        var18Lifetime1 = this.field_Db;
        var18Lifetime1.field_T = 0;
        var18Lifetime1.field_db = var12Lifetime1;
        if (param0 <= 87) {
          return;
        }
        var18Lifetime1.field_x = this.field_x;
        var18Lifetime1.field_I = var7 - var12Lifetime1;
        var19Lifetime1 = this.field_Cb;
        var19Lifetime1.field_x = this.field_x;
        var19Lifetime1.field_T = 0;
        this.field_Lb.field_ub = param1 < param3 ? true : false;
        this.field_Ib.field_ub = param1 < param3 ? true : false;
        this.field_Mb.field_ub = param1 < param3 ? true : false;
        var19Lifetime1.field_db = var11Lifetime1;
        var19Lifetime1.field_I = var8;
    }

    public static void g(byte param0) {
        field_Jb = null;
        field_Nb = null;
        field_Kb = null;
        field_Fb = null;
        if (param0 != -120) {
          return;
        }
        field_Gb = null;
        field_Eb = null;
    }

    in(long param0, kc param1, kc param2, kc param3, kc param4) {
        super(param0, (kc) null);
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
        kc var9 = null;
        kc var10 = null;
        try {
          this.field_Mb = new kc(0L, param1);
          this.field_Ib = new kc(0L, param2);
          this.a(this.field_Mb, 116);
          this.a(this.field_Ib, 105);
          this.field_Lb = new kc(0L, (kc) null);
          this.a(this.field_Lb, 107);
          this.field_Hb = new kc(0L, param3);
          this.field_Db = new kc(0L, param3);
          var9 = this.field_Hb;
          var10 = var9;
          this.field_Db.field_yb = true;
          var10.field_yb = true;
          this.field_Lb.a(this.field_Hb, 72);
          this.field_Lb.a(this.field_Db, 83);
          this.field_Cb = new kc(0L, param4);
          this.field_Cb.field_H = true;
          this.field_Lb.a(this.field_Cb, 89);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_5_0 = var7;
          stackIn_5_1 = new StringBuilder().append("in.<init>(").append(param0).append(',');
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
          throw aa.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final int a(int param0, int param1, boolean param2, byte param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var5Lifetime1;
        var5 = 0;
        var6 = -this.field_Cb.field_I + this.field_Lb.field_I;
        if (param3 == -55) {
          if (var6 > 0) {
            var7 = this.field_Cb.field_db;
            var8 = -param0 + param1;
            var5 = (var8 * var7 + var6 / 2) / var6;
          }
        } else {
          this.a(-125, 112, -79, 37);
          if (var6 > 0) {
            var7 = this.field_Cb.field_db;
            var8 = -param0 + param1;
            var5 = (var8 * var7 + var6 / 2) / var6;
          }
        }
        if (param2) {
          if (var5 < 0) {
            var5 = 0;
          }
          if (param1 - param0 >= var5) {
            return var5;
          }
          var5 = param1 - param0;
          return var5;
        }
        if (var5 > param1 - param0) {
          var5 = -param0 + param1;
        }
        if (var5 >= 0) {
          return var5;
        }
        var5Lifetime1 = 0;
        return var5Lifetime1;
    }

    final void a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        if (!param1) {
          this.field_T = param7;
          this.field_x = param5;
          this.field_db = param0;
          this.field_I = param2;
          this.a(89, param6, param4, param3);
          return;
        }
    }

    final boolean e(boolean param0) {
        if (!param0) {
          this.f(116);
        }
        if (this.field_Ib.field_U != 0) {
          this.field_Bb = 20;
          return true;
        }
        if (0 == this.field_Ib.field_P) {
          return false;
        }
        if (this.field_Bb > 0) {
          this.field_Bb = this.field_Bb - 1;
        }
        if (this.field_Bb != 0) {
          return false;
        }
        this.field_Bb = 3;
        return true;
    }

    final boolean f(boolean param0) {
        if (this.field_Db.field_U != 0) {
          this.field_Bb = 20;
          return true;
        }
        if (this.field_Db.field_P == 0) {
          if (param0) {
            return false;
          }
          field_Gb = (co) null;
          return false;
        }
        if (0 < this.field_Bb) {
          this.field_Bb = this.field_Bb - 1;
        }
        if (this.field_Bb != 0) {
          if (param0) {
            return false;
          }
          field_Gb = (co) null;
          return false;
        }
        if (me.field_I >= this.field_Cb.field_B + this.field_Cb.field_bb + this.field_Cb.field_nb + this.field_Cb.field_I) {
          this.field_Bb = 3;
          return true;
        }
        if (param0) {
          return false;
        }
        field_Gb = (co) null;
        return false;
    }

    static {
        field_Fb = new int[]{33, 34, 35};
        field_Kb = "You have fallen into the water! Choose a location to teleport to. Since you don't have Arcane Gate available you will lose a third of your health (<%1>). If you fail to do this within the time limit you will lose half of your health! (<%0>)";
    }
}
