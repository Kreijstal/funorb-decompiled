/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class np extends cr {
    private cr field_Hb;
    static cr field_Ib;
    static float field_Nb;
    static r field_Kb;
    static int field_Lb;
    static int field_Ob;
    static String field_Mb;
    static String field_Jb;

    final boolean a(byte param0, boolean param1) {
        this.a(param0 ^ -51, true);
        if (param0 != -51) {
          field_Ob = 28;
          if (kf.field_c == 0) {
            return this.field_Hb.field_tb != 0 ? true : false;
          }
          if (this.field_tb != 0) {
            return this.field_Hb.field_tb != 0 ? true : false;
          }
          return true;
        }
        if (kf.field_c != 0) {
          if (this.field_tb == 0) {
            return true;
          }
          return this.field_Hb.field_tb != 0 ? true : false;
        }
        if (this.field_Hb.field_tb == 0) {
          return false;
        }
        return true;
    }

    public static void a(byte param0) {
        field_Mb = null;
        field_Kb = null;
        field_Ib = null;
        field_Jb = null;
        int var1 = 87 / ((-67 - param0) / 34);
    }

    np(cr param0, cr param1, cr param2, cr param3, cr param4, cr param5) {
        int var12 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        cr var8 = null;
        cr var9 = null;
        int var10 = 0;
        int var11 = 0;
        cr var13 = null;
        cr var14 = null;
        int var15 = 0;
        cr var17 = null;
        int var10Lifetime1;
        try {
          var17 = new cr(0L, param1, br.field_W.toUpperCase());
          var17.field_O = 1;
          this.field_Hb = new cr(0L, param2);
          var8 = new cr(0L, param3);
          var9 = new cr(0L, param3, ac.field_N);
          var9.field_O = 1;
          var10 = 50;
          var11 = 0;
          for (var12 = 0; sd.field_M.length > var12; var12++) {
            var13 = new cr(0L, param3, qr.field_k[var12]);
            var14 = new cr(0L, param3, sd.field_M[var12]);
            var15 = param3.field_z.c(sd.field_M[var12]);
            var13.a(115, 65, 15, var10, 20);
            if (var11 < var15) {
              var11 = var15;
            }
            var14.a(85, 640, 15, var10, 90);
            var8.b(var13, 121);
            var8.b(var14, 125);
            var10 += 30;
          }
          var10 += 15;
          var17.a(126, 90 + (var11 + 20), 24, 0, 0);
          this.a(95, var17.field_Fb, var17.field_db + var10, 100, 100);
          this.field_Hb.a(84, 15, 15, 5, var17.field_Fb - 20);
          var8.a(87, this.field_Fb, this.field_db - var17.field_db, var17.field_db, 0);
          var9.a(83, this.field_Fb, 15, 20, 0);
          var8.field_Bb = vl.a(var8.field_db, 3, 0, 2105376, 11579568, 8421504);
          var17.b(this.field_Hb, 124);
          var8.b(var9, 127);
          this.b(var17, 121);
          this.b(var8, 118);
          var10Lifetime1 = -(this.field_db >> 1) + 240;
          this.field_wb = -(this.field_Fb >> 1) + 320;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_10_0 = var7;
          stackIn_10_1 = new StringBuilder().append("np.<init>(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param5 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    static {
        field_Mb = "Concluded";
        field_Jb = "End Game";
        field_Ob = -1;
    }
}
