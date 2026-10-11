/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ol extends ai {
    static String field_f;
    static vd[] field_e;
    static int field_c;
    private int[] field_d;

    final void a(int param0, float param1, int param2, float param3, int param4, int param5, float param6, float param7, int param8, float[] param9, int param10) {
        int var34 = 0;
        int incrementValue$1 = 0;
        int var12_int = 0;
        int var13 = 0;
        int var14 = 0;
        float var15 = 0.0f;
        int var16 = 0;
        int var17 = 0;
        float var18 = 0.0f;
        float var19 = 0.0f;
        float var20 = 0.0f;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        float var24 = 0.0f;
        int var25 = 0;
        int var26 = 0;
        float var27 = 0.0f;
        float var28 = 0.0f;
        float var29 = 0.0f;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        float var35 = 0.0f;
        int var36 = 0;
        int var37 = 0;
        float var38 = 0.0f;
        float var39 = 0.0f;
        float var40 = 0.0f;
        int var41 = 0;
        float[] var42 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var12 = null;
        var41 = AceOfSkies.field_G ? 1 : 0;
        try {
          var12_int = (int)((float)param2 * param6 - 1.0f);
          var12_int = var12_int & 255;
          var13 = (int)(param7 * (float)param10 - 1.0f);
          var13 = var13 & 255;
          var14 = (int)(param3 * (float)param4 - 1.0f);
          var14 = var14 & 255;
          var15 = (float)param0 * param3;
          var16 = (int)var15;
          var17 = 1 + var16;
          var18 = var15 - (float)var16;
          var19 = -var18 + 1.0f;
          var16 = var16 & var14;
          var17 = var17 & var14;
          var20 = ce.a(var18, -59);
          var21 = this.field_d[var16];
          var22 = this.field_d[var17];
          var23 = 0;
          if (param5 > 0) {
            var42 = (float[]) null;
            this.a(68, -0.00900564156472683f, -53, -0.8669494390487671f, -60, 124, -0.45034173130989075f, -0.870319664478302f, 33, (float[]) null, -26);
          }
          while (param10 > var23) {
            var24 = param7 * (float)var23;
            var25 = (int)var24;
            var26 = var25 + 1;
            var27 = var24 - (float)var25;
            var28 = -var27 + 1.0f;
            var26 = var26 & var13;
            var25 = var25 & var13;
            var29 = ce.a(var27, -87);
            var30 = this.field_d[var21 + var25];
            var31 = this.field_d[var21 + var26];
            var32 = this.field_d[var22 + var25];
            var33 = this.field_d[var22 + var26];
            for (var34 = 0; param2 > var34; var34++) {
              var35 = param6 * (float)var34;
              var36 = (int)var35;
              var37 = var36 + 1;
              var38 = var35 - (float)var36;
              var39 = -var38 + 1.0f;
              var37 = var37 & var12_int;
              var40 = ce.a(var38, -81);
              var36 = var36 & var12_int;
              incrementValue$1 = param8;
              param8++;
              param9[incrementValue$1] = hq.a(var20, 26921, hq.a(var29, 26921, hq.a(var40, 26921, ef.a(var38, var18, -87, var27, pg.a(7, this.field_d[var37 + var33])), ef.a(var39, var18, -98, var27, pg.a(7, this.field_d[var36 + var33]))), hq.a(var40, 26921, ef.a(var38, var18, -116, var28, pg.a(7, this.field_d[var32 + var37])), ef.a(var39, var18, -115, var28, pg.a(this.field_d[var32 + var36], 7)))), hq.a(var29, 26921, hq.a(var40, 26921, ef.a(var38, var19, -47, var27, pg.a(this.field_d[var31 + var37], 7)), ef.a(var39, var19, -111, var27, pg.a(7, this.field_d[var31 + var36]))), hq.a(var40, 26921, ef.a(var38, var19, -85, var28, pg.a(this.field_d[var37 + var30], 7)), ef.a(var39, var19, -35, var28, pg.a(this.field_d[var30 + var36], 7))))) * param1;
            }
            var23++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_11_0 = var12;
          stackIn_11_1 = new StringBuilder().append("ol.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param10).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_e = null;
        if (param0 < 88) {
          return;
        }
        field_f = null;
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        boolean stackIn_15_0 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param1 > -123) {
            return true;
          }
          var3 = ph.a(param0, 0);
          if (param2.indexOf(param0) == -1 &&
            -1 == param2.indexOf(var3)) {
            stackIn_15_0 = (param2.startsWith(param0)) || (param2.startsWith(var3)) || (param2.endsWith(param0)) || (param2.endsWith(var3));
            return stackIn_15_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("ol.D(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    ol(int param0) {
        int dupTemp$0 = 0;
        Random var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var3Lifetime1;
        this.field_d = new int[512];
        var2 = new Random((long)param0);
        for (var3 = 0; var3 < 256; var3++) {
          this.field_d[var3 + 256] = var3;
          this.field_d[var3] = var3;
        }
        var6 = 0;
        var3Lifetime1 = var6;
        while (var6 < 256) {
          var4 = var2.nextInt() & 255;
          var5 = this.field_d[var4];
          dupTemp$0 = this.field_d[var6];
          this.field_d[var4 + 256] = dupTemp$0;
          this.field_d[var4] = dupTemp$0;
          this.field_d[256 + var6] = var5;
          this.field_d[var6] = var5;
          var6++;
        }
    }

    static {
        field_f = "Type your email address again to make sure it's correct";
    }
}
