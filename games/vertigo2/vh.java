/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vh extends li {
    private static float[] field_p;
    private float[] field_t;
    private static byte[] field_P;
    private int field_y;
    private static float[] field_C;
    private static int field_Q;
    private byte[] field_T;
    private int field_A;
    private static float[] field_r;
    private static float[] field_G;
    private byte[][] field_F;
    private static boolean[] field_H;
    private boolean field_O;
    private static int field_U;
    private static int[] field_J;
    private static float[] field_S;
    private int field_s;
    private static int[] field_z;
    static ic[] field_o;
    private static float[] field_q;
    private static boolean field_M;
    private static int field_N;
    private static int[] field_D;
    private static float[] field_w;
    private static pg[] field_x;
    private static rd[] field_E;
    private static pi[] field_u;
    private int field_v;
    private int field_n;
    private int field_B;
    private int field_K;
    private int field_I;
    private boolean field_R;
    private static int field_L;

    private final static boolean a(r param0) {
        byte[] var1 = null;
        if (!field_M) {
          var1 = param0.a(0, 0, (byte) -54);
          if (var1 == null) {
            return false;
          }
          vh.a(var1);
        }
        return true;
    }

    private final void b(byte[] param0) throws IOException {
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        byte[] var6 = null;
        ed var2 = new ed(param0);
        this.field_y = var2.b(true);
        this.field_v = var2.b(true);
        this.field_n = var2.b(true);
        this.field_I = var2.b(true);
        if (this.field_I < 0) {
          this.field_I = ~this.field_I;
          this.field_O = true;
        }
        int var3 = var2.b(true);
        if (var3 < 0) {
          throw new IOException();
        }
        this.field_F = new byte[var3][];
        for (var4 = 0; var4 < var3; var4++) {
          var5 = 0;
          do {
            var6_int = var2.h(-11);
            var5 = var5 + var6_int;
          } while (var6_int >= 255);
          var6 = new byte[var5];
          var2.a(0, var6, var5, 100);
          this.field_F[var4] = var6;
        }
    }

    final static float f(int param0) {
        int var1 = param0 & 2097151;
        int var2 = param0 & -2147483648;
        int var3 = (param0 & 2145386496) >> 21;
        if (var2 != 0) {
          var1 = -var1;
        }
        return (float)((double)var1 * Math.pow(2.0, (double)(var3 - 788)));
    }

    final ae b() {
        int var3 = 0;
        int var6 = 0;
        int incrementValue$0 = 0;
        byte[] var1;
        int var2;
        float[] var4;
        int var5;
        int var7;
        this.field_B = 0;
        this.field_t = new float[field_N];
        var1 = new byte[this.field_v];
        var2 = 0;
        for (var3 = 0; var3 < this.field_F.length; var3++) {
          var4 = this.e(var3);
          if (var4 != null) {
            var5 = var4.length;
            if (var5 > this.field_v - var2) {
              var5 = this.field_v - var2;
            }
            for (var6 = 0; var6 < var5; var6++) {
              var7 = (int)(128.0f + var4[var6] * 128.0f);
              if ((var7 & -256) != 0) {
                var7 = ~var7 >> 31;
              }
              incrementValue$0 = var2;
              var2++;
              var1[incrementValue$0] = (byte)(var7 - 128);
            }
          }
        }
        this.field_t = null;
        return new ae(this.field_y, var1, this.field_n, this.field_I, this.field_O);
    }

    final static int a(int param0) {
        int var4 = 0;
        int var3 = 0;
        int var1 = 0;
        int var2 = 0;
        int var3Lifetime1;
        while (param0 >= 8 - field_Q) {
          var3 = 8 - field_Q;
          var4 = (1 << var3) - 1;
          var1 = var1 + ((field_P[field_U] >> field_Q & var4) << var2);
          field_Q = 0;
          field_U = field_U + 1;
          var2 = var2 + var3;
          param0 = param0 - var3;
        }
        if (param0 > 0) {
          var3Lifetime1 = (1 << param0) - 1;
          var1 = var1 + ((field_P[field_U] >> field_Q & var3Lifetime1) << var2);
          field_Q = field_Q + param0;
        }
        return var1;
    }

    private final float[] e(int param0) {
        int var32_int = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_22_0 = 0;
        float[] stackIn_40_0 = null;
        float[] stackIn_43_0 = null;
        float[] stackIn_46_0 = null;
        int[] stackIn_49_0 = null;
        boolean stackIn_113_1 = false;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        pg var14;
        int var15;
        int var16;
        int var17_int;
        Object var17;
        int var18_int;
        float[] var18;
        int var19;
        float[] var20_ref_float__;
        int var20;
        int var21_int;
        float[] var21;
        float[] var22;
        float[] var23;
        int[] var24;
        int var25;
        int var26;
        float var26_float;
        float var27;
        int var27_int;
        float var28;
        int var28_int;
        float var29;
        int var29_int;
        float var30;
        int var30_int;
        float var31;
        int var31_int;
        float var32;
        float var33;
        int var33_int;
        float var34;
        float var35;
        float var36;
        float var37;
        float var38;
        float var39;
        float[] var40;
        int var41;
        pi var42;
        int[] var44;
        float[] var45;
        float[] var46;
        int[] var48;
        float[] var49;
        float[] var50;
        float[] var52;
        int var16Lifetime1;
        int var17_intLifetime1;
        int var17_intLifetime2;
        int var17_intLifetime3;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21_intLifetime1;
        int var25Lifetime1;
        int var25Lifetime2;
        int var26Lifetime1;
        int var26Lifetime2;
        int var26Lifetime3;
        int var26Lifetime4;
        int var26Lifetime5;
        int var26Lifetime6;
        int var26Lifetime7;
        int var26Lifetime8;
        int var26Lifetime9;
        int var26Lifetime10;
        int var26Lifetime11;
        float var26_floatLifetime1;
        float var27Lifetime1;
        float var27Lifetime2;
        float var27Lifetime3;
        float var27Lifetime4;
        int var27_intLifetime1;
        float var28Lifetime1;
        float var28Lifetime2;
        int var28_intLifetime1;
        float var29Lifetime1;
        float var29Lifetime2;
        int var29_intLifetime1;
        float var30Lifetime1;
        float var30Lifetime2;
        float var31Lifetime1;
        float var33Lifetime1;
        int var19Lifetime1Lifetime1;
        float var30Lifetime1Lifetime1;
        float var30Lifetime1Lifetime2;
        float var30Lifetime1Lifetime3;
        int var18_intLifetime1;
        int var18_intLifetime2;
        vh.a(this.field_F[param0], 0);
        vh.a();
        var2 = vh.a(d.b(-102, field_J.length - 1));
        var3 = field_H[var2] ? 1 : 0;
        if (var3 == 0) {
          stackIn_3_0 = field_L;
        } else {
          stackIn_3_0 = field_N;
        }
        var4 = stackIn_3_0;
        var5 = 0;
        var6 = 0;
        if (var3 != 0) {
          stackIn_7_0 = (vh.a() == 0) ? 0 : 1;
          var5 = stackIn_7_0;
          stackIn_10_0 = (vh.a() == 0) ? 0 : 1;
          var6 = stackIn_10_0;
        }
        var7 = var4 >> 1;
        if (var3 != 0 &&
          var5 == 0) {
          var8 = (var4 >> 2) - (field_L >> 2);
          var9 = (var4 >> 2) + (field_L >> 2);
          var10 = field_L >> 1;
        } else {
          var8 = 0;
          var9 = var7;
          var10 = var4 >> 1;
        }
        if (var3 != 0 &&
          var6 == 0) {
          var11 = var4 - (var4 >> 2) - (field_L >> 2);
          var12 = var4 - (var4 >> 2) + (field_L >> 2);
          var13 = field_L >> 1;
        } else {
          var11 = var7;
          var12 = var4;
          var13 = var4 >> 1;
        }
        var14 = field_x[field_J[var2]];
        var16 = var14.field_b;
        var17_int = var14.field_d[var16];
        stackIn_22_0 = (field_E[var17_int].a()) ? 0 : 1;
        var15 = stackIn_22_0;
        var16Lifetime1 = var15;
        for (var17_intLifetime1 = 0; var17_intLifetime1 < var14.field_c; var17_intLifetime1++) {
          var42 = field_u[var14.field_a[var17_intLifetime1]];
          var52 = field_w;
          var42.a(var52, var4 >> 1, var16Lifetime1 != 0);
        }
        if (var15 == 0) {
          var17_intLifetime2 = var14.field_b;
          var18_int = var14.field_d[var17_intLifetime2];
          field_E[var18_int].a(field_w, var4 >> 1);
        }
        if (var15 != 0) {
          for (var17_intLifetime3 = var4 >> 1; var17_intLifetime3 < var4; var17_intLifetime3++) {
            field_w[var17_intLifetime3] = 0.0f;
          }
        } else {
          var17_intLifetime3 = var4 >> 1;
          var18_intLifetime1 = var4 >> 2;
          var19 = var4 >> 3;
          var49 = field_w;
          var45 = var49;
          var20_ref_float__ = var45;
          for (var21_int = 0; var21_int < var17_intLifetime3; var21_int++) {
            var20_ref_float__[var21_int] = var20_ref_float__[var21_int] * 0.5f;
          }
          var41 = var17_intLifetime3;
          var21_intLifetime1 = var41;
          while (var41 < var4) {
            var20_ref_float__[var41] = -var20_ref_float__[var4 - var41 - 1];
            var41++;
          }
          if (var3 == 0) {
            stackIn_40_0 = (float[]) (field_r);
          } else {
            stackIn_40_0 = (float[]) (field_G);
          }
          var21 = stackIn_40_0;
          if (var3 == 0) {
            stackIn_43_0 = (float[]) (field_S);
          } else {
            stackIn_43_0 = (float[]) (field_q);
          }
          var22 = stackIn_43_0;
          if (var3 == 0) {
            stackIn_46_0 = (float[]) (field_p);
          } else {
            stackIn_46_0 = (float[]) (field_C);
          }
          var23 = stackIn_46_0;
          if (var3 == 0) {
            stackIn_49_0 = (int[]) (field_z);
          } else {
            stackIn_49_0 = (int[]) (field_D);
          }
          var48 = stackIn_49_0;
          var44 = var48;
          var24 = var44;
          for (var25 = 0; var25 < var18_intLifetime1; var25++) {
            var26_float = var20_ref_float__[4 * var25] - var20_ref_float__[var4 - 4 * var25 - 1];
            var27 = var20_ref_float__[4 * var25 + 2] - var20_ref_float__[var4 - 4 * var25 - 3];
            var28 = var21[2 * var25];
            var29 = var21[2 * var25 + 1];
            var20_ref_float__[var4 - 4 * var25 - 1] = var26_float * var28 - var27 * var29;
            var20_ref_float__[var4 - 4 * var25 - 3] = var26_float * var29 + var27 * var28;
          }
          for (var25Lifetime1 = 0; var25Lifetime1 < var19; var25Lifetime1++) {
            var26_floatLifetime1 = var20_ref_float__[var17_intLifetime3 + 3 + 4 * var25Lifetime1];
            var27Lifetime1 = var20_ref_float__[var17_intLifetime3 + 1 + 4 * var25Lifetime1];
            var28Lifetime1 = var20_ref_float__[4 * var25Lifetime1 + 3];
            var29Lifetime1 = var20_ref_float__[4 * var25Lifetime1 + 1];
            var20_ref_float__[var17_intLifetime3 + 3 + 4 * var25Lifetime1] = var26_floatLifetime1 + var28Lifetime1;
            var20_ref_float__[var17_intLifetime3 + 1 + 4 * var25Lifetime1] = var27Lifetime1 + var29Lifetime1;
            var30 = var21[var17_intLifetime3 - 4 - 4 * var25Lifetime1];
            var31 = var21[var17_intLifetime3 - 3 - 4 * var25Lifetime1];
            var20_ref_float__[4 * var25Lifetime1 + 3] = (var26_floatLifetime1 - var28Lifetime1) * var30 - (var27Lifetime1 - var29Lifetime1) * var31;
            var20_ref_float__[4 * var25Lifetime1 + 1] = (var27Lifetime1 - var29Lifetime1) * var30 + (var26_floatLifetime1 - var28Lifetime1) * var31;
          }
          var25Lifetime2 = d.b(-55, var4 - 1);
          for (var26 = 0; var26 < var25Lifetime2 - 3; var26++) {
            var27_int = var4 >> var26 + 2;
            var28_int = 8 << var26;
            for (var29_int = 0; var29_int < 2 << var26; var29_int++) {
              var30_int = var4 - var27_int * 2 * var29_int;
              var31_int = var4 - var27_int * (2 * var29_int + 1);
              for (var32_int = 0; var32_int < var4 >> var26 + 4; var32_int++) {
                var33_int = 4 * var32_int;
                var34 = var20_ref_float__[var30_int - 1 - var33_int];
                var35 = var20_ref_float__[var30_int - 3 - var33_int];
                var36 = var20_ref_float__[var31_int - 1 - var33_int];
                var37 = var20_ref_float__[var31_int - 3 - var33_int];
                var20_ref_float__[var30_int - 1 - var33_int] = var34 + var36;
                var20_ref_float__[var30_int - 3 - var33_int] = var35 + var37;
                var38 = var21[var32_int * var28_int];
                var39 = var21[var32_int * var28_int + 1];
                var20_ref_float__[var31_int - 1 - var33_int] = (var34 - var36) * var38 - (var35 - var37) * var39;
                var20_ref_float__[var31_int - 3 - var33_int] = (var35 - var37) * var38 + (var34 - var36) * var39;
              }
            }
          }
          for (var26Lifetime1 = 1; var26Lifetime1 < var19 - 1; var26Lifetime1++) {
            var27_intLifetime1 = var48[var26Lifetime1];
            if (var26Lifetime1 < var27_intLifetime1) {
              var28_intLifetime1 = 8 * var26Lifetime1;
              var29_intLifetime1 = 8 * var27_intLifetime1;
              var30Lifetime1 = var20_ref_float__[var28_intLifetime1 + 1];
              var20_ref_float__[var28_intLifetime1 + 1] = var20_ref_float__[var29_intLifetime1 + 1];
              var20_ref_float__[var29_intLifetime1 + 1] = var30Lifetime1;
              var30Lifetime1Lifetime1 = var20_ref_float__[var28_intLifetime1 + 3];
              var20_ref_float__[var28_intLifetime1 + 3] = var20_ref_float__[var29_intLifetime1 + 3];
              var20_ref_float__[var29_intLifetime1 + 3] = var30Lifetime1Lifetime1;
              var30Lifetime1Lifetime2 = var20_ref_float__[var28_intLifetime1 + 5];
              var20_ref_float__[var28_intLifetime1 + 5] = var20_ref_float__[var29_intLifetime1 + 5];
              var20_ref_float__[var29_intLifetime1 + 5] = var30Lifetime1Lifetime2;
              var30Lifetime1Lifetime3 = var20_ref_float__[var28_intLifetime1 + 7];
              var20_ref_float__[var28_intLifetime1 + 7] = var20_ref_float__[var29_intLifetime1 + 7];
              var20_ref_float__[var29_intLifetime1 + 7] = var30Lifetime1Lifetime3;
            }
          }
          for (var26Lifetime2 = 0; var26Lifetime2 < var17_intLifetime3; var26Lifetime2++) {
            var20_ref_float__[var26Lifetime2] = var20_ref_float__[2 * var26Lifetime2 + 1];
          }
          for (var26Lifetime3 = 0; var26Lifetime3 < var19; var26Lifetime3++) {
            var20_ref_float__[var4 - 1 - 2 * var26Lifetime3] = var20_ref_float__[4 * var26Lifetime3];
            var20_ref_float__[var4 - 2 - 2 * var26Lifetime3] = var20_ref_float__[4 * var26Lifetime3 + 1];
            var20_ref_float__[var4 - var18_intLifetime1 - 1 - 2 * var26Lifetime3] = var20_ref_float__[4 * var26Lifetime3 + 2];
            var20_ref_float__[var4 - var18_intLifetime1 - 2 - 2 * var26Lifetime3] = var20_ref_float__[4 * var26Lifetime3 + 3];
          }
          for (var26Lifetime4 = 0; var26Lifetime4 < var19; var26Lifetime4++) {
            var27Lifetime2 = var23[2 * var26Lifetime4];
            var28Lifetime2 = var23[2 * var26Lifetime4 + 1];
            var29Lifetime2 = var20_ref_float__[var17_intLifetime3 + 2 * var26Lifetime4];
            var30Lifetime2 = var20_ref_float__[var17_intLifetime3 + 2 * var26Lifetime4 + 1];
            var31Lifetime1 = var20_ref_float__[var4 - 2 - 2 * var26Lifetime4];
            var32 = var20_ref_float__[var4 - 1 - 2 * var26Lifetime4];
            var33 = var28Lifetime2 * (var29Lifetime2 - var31Lifetime1) + var27Lifetime2 * (var30Lifetime2 + var32);
            var20_ref_float__[var17_intLifetime3 + 2 * var26Lifetime4] = (var29Lifetime2 + var31Lifetime1 + var33) * 0.5f;
            var20_ref_float__[var4 - 2 - 2 * var26Lifetime4] = (var29Lifetime2 + var31Lifetime1 - var33) * 0.5f;
            var33Lifetime1 = var28Lifetime2 * (var30Lifetime2 + var32) - var27Lifetime2 * (var29Lifetime2 - var31Lifetime1);
            var20_ref_float__[var17_intLifetime3 + 2 * var26Lifetime4 + 1] = (var30Lifetime2 - var32 + var33Lifetime1) * 0.5f;
            var20_ref_float__[var4 - 1 - 2 * var26Lifetime4] = (-var30Lifetime2 + var32 + var33Lifetime1) * 0.5f;
          }
          for (var26Lifetime5 = 0; var26Lifetime5 < var18_intLifetime1; var26Lifetime5++) {
            var20_ref_float__[var26Lifetime5] = var20_ref_float__[2 * var26Lifetime5 + var17_intLifetime3] * var22[2 * var26Lifetime5] + var20_ref_float__[2 * var26Lifetime5 + 1 + var17_intLifetime3] * var22[2 * var26Lifetime5 + 1];
            var20_ref_float__[var17_intLifetime3 - 1 - var26Lifetime5] = var20_ref_float__[2 * var26Lifetime5 + var17_intLifetime3] * var22[2 * var26Lifetime5 + 1] - var20_ref_float__[2 * var26Lifetime5 + 1 + var17_intLifetime3] * var22[2 * var26Lifetime5];
          }
          for (var26Lifetime6 = 0; var26Lifetime6 < var18_intLifetime1; var26Lifetime6++) {
            var20_ref_float__[var4 - var18_intLifetime1 + var26Lifetime6] = -var49[var26Lifetime6];
          }
          for (var26Lifetime7 = 0; var26Lifetime7 < var18_intLifetime1; var26Lifetime7++) {
            var20_ref_float__[var26Lifetime7] = var20_ref_float__[var18_intLifetime1 + var26Lifetime7];
          }
          for (var26Lifetime8 = 0; var26Lifetime8 < var18_intLifetime1; var26Lifetime8++) {
            var20_ref_float__[var18_intLifetime1 + var26Lifetime8] = -var20_ref_float__[var18_intLifetime1 - var26Lifetime8 - 1];
          }
          for (var26Lifetime9 = 0; var26Lifetime9 < var18_intLifetime1; var26Lifetime9++) {
            var20_ref_float__[var17_intLifetime3 + var26Lifetime9] = var20_ref_float__[var4 - var26Lifetime9 - 1];
          }
          for (var26Lifetime10 = var8; var26Lifetime10 < var9; var26Lifetime10++) {
            var27Lifetime3 = (float)Math.sin(((double)(var26Lifetime10 - var8) + 0.5) / (double)var10 * 0.5 * 3.141592653589793);
            field_w[var26Lifetime10] = field_w[var26Lifetime10] * (float)Math.sin(1.5707963267948966 * (double)var27Lifetime3 * (double)var27Lifetime3);
          }
          for (var26Lifetime11 = var11; var26Lifetime11 < var12; var26Lifetime11++) {
            var27Lifetime4 = (float)Math.sin(((double)(var26Lifetime11 - var11) + 0.5) / (double)var13 * 0.5 * 3.141592653589793 + 1.5707963267948966);
            field_w[var26Lifetime11] = field_w[var26Lifetime11] * (float)Math.sin(1.5707963267948966 * (double)var27Lifetime4 * (double)var27Lifetime4);
          }
        }
        var17 = null;
        if (this.field_B > 0) {
          var18_intLifetime2 = this.field_B + var4 >> 2;
          var50 = new float[var18_intLifetime2];
          var46 = var50;
          var40 = var46;
          var17 = var40;
          if (!this.field_R) {
            for (var19Lifetime1 = 0; var19Lifetime1 < this.field_s; var19Lifetime1++) {
              var20 = (this.field_B >> 1) + var19Lifetime1;
              var40[var19Lifetime1] = var40[var19Lifetime1] + this.field_t[var20];
            }
          }
          if (var15 == 0) {
            for (var19Lifetime1Lifetime1 = var8; var19Lifetime1Lifetime1 < var4 >> 1; var19Lifetime1Lifetime1++) {
              var20Lifetime1 = var50.length - (var4 >> 1) + var19Lifetime1Lifetime1;
              var40[var20Lifetime1] = var40[var20Lifetime1] + field_w[var19Lifetime1Lifetime1];
            }
          }
        }
        var18 = this.field_t;
        this.field_t = field_w;
        field_w = var18;
        this.field_B = var4;
        this.field_s = var12 - (var4 >> 1);
        stackIn_113_1 = (var15 != 0);
        this.field_R = stackIn_113_1;
        return (float[]) (var17);
    }

    final static int a() {
        int var0 = field_P[field_U] >> field_Q & 1;
        field_Q = field_Q + 1;
        field_U = field_U + (field_Q >> 3);
        field_Q = field_Q & 7;
        return var0;
    }

    final static vh a(r param0, String param1, String param2) {
        try {
          vh var4_ref = null;
          if (!vh.a(param0)) {
            param0.a(param2, param1, false);
            return null;
          }
          byte[] var3 = param0.a(param1, param2, 0);
          if (var3 == null) {
            return null;
          }
          Object var4 = null;
          try {
            var4_ref = new vh(var3);
          } catch (IOException iOException) {
            iOException.printStackTrace();
          }
          return var4_ref;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void c() {
        field_P = null;
        field_o = null;
        field_E = null;
        field_u = null;
        field_x = null;
        field_H = null;
        field_J = null;
        field_w = null;
        field_r = null;
        field_S = null;
        field_p = null;
        field_G = null;
        field_q = null;
        field_C = null;
        field_z = null;
        field_D = null;
    }

    final ae a(int[] param0) {
        int var5 = 0;
        int incrementValue$0 = 0;
        int var3;
        int var4;
        int var6;
        float[] var7;
        byte[] var12;
        if (param0 != null &&
          param0[0] <= 0) {
          return null;
        }
        if (this.field_T == null) {
          this.field_B = 0;
          this.field_t = new float[field_N];
          this.field_T = new byte[this.field_v];
          this.field_A = 0;
          this.field_K = 0;
        }
        while (this.field_K < this.field_F.length) {
          if (param0 != null &&
            param0[0] <= 0) {
            return null;
          }
          var7 = this.e(this.field_K);
          if (var7 != null) {
            var3 = this.field_A;
            var4 = var7.length;
            if (var4 > this.field_v - var3) {
              var4 = this.field_v - var3;
            }
            for (var5 = 0; var5 < var4; var5++) {
              var6 = (int)(128.0f + var7[var5] * 128.0f);
              if ((var6 & -256) != 0) {
                var6 = ~var6 >> 31;
              }
              incrementValue$0 = var3;
              var3++;
              this.field_T[incrementValue$0] = (byte)(var6 - 128);
            }
            if (param0 != null) {
              param0[0] = param0[0] - (var3 - this.field_A);
            }
            this.field_A = var3;
          }
          this.field_K = this.field_K + 1;
        }
        this.field_t = null;
        var12 = this.field_T;
        this.field_T = null;
        return new ae(this.field_y, var12, this.field_n, this.field_I, this.field_O);
    }

    private final static void a(byte[] param0, int param1) {
        field_P = param0;
        field_U = param1;
        field_Q = 0;
    }

    final static vh a(r param0, int param1, int param2) {
        try {
          vh var4_ref = null;
          if (!vh.a(param0)) {
            param0.b(0, param1, param2);
            return null;
          }
          byte[] var3 = param0.a(param1, param2, (byte) -107);
          if (var3 == null) {
            return null;
          }
          Object var4 = null;
          try {
            var4_ref = new vh(var3);
          } catch (IOException iOException) {
            iOException.printStackTrace();
          }
          return var4_ref;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte[] param0) {
        int var7_int = 0;
        int var8_int = 0;
        int var9_int = 0;
        int var11 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        boolean[] stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        boolean stackIn_42_2 = false;
        int var1;
        int var2;
        int var3;
        int var4;
        int var5;
        float[] var6_ref_float__;
        float[] var7;
        float[] var8;
        int[] var9;
        int var10;
        int var1Lifetime1;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        vh.a(param0, 0);
        field_L = 1 << vh.a(4);
        field_N = 1 << vh.a(4);
        field_w = new float[field_N];
        for (var1 = 0; var1 < 2; var1++) {
          if (var1 == 0) {
            stackIn_5_0 = field_L;
          } else {
            stackIn_5_0 = field_N;
          }
          var2 = stackIn_5_0;
          var3 = var2 >> 1;
          var4 = var2 >> 2;
          var5 = var2 >> 3;
          var6_ref_float__ = new float[var3];
          for (var7_int = 0; var7_int < var4; var7_int++) {
            var6_ref_float__[2 * var7_int] = (float)Math.cos((double)(4 * var7_int) * 3.141592653589793 / (double)var2);
            var6_ref_float__[2 * var7_int + 1] = -(float)Math.sin((double)(4 * var7_int) * 3.141592653589793 / (double)var2);
          }
          var7 = new float[var3];
          for (var8_int = 0; var8_int < var4; var8_int++) {
            var7[2 * var8_int] = (float)Math.cos((double)(2 * var8_int + 1) * 3.141592653589793 / (double)(2 * var2));
            var7[2 * var8_int + 1] = (float)Math.sin((double)(2 * var8_int + 1) * 3.141592653589793 / (double)(2 * var2));
          }
          var8 = new float[var4];
          for (var9_int = 0; var9_int < var5; var9_int++) {
            var8[2 * var9_int] = (float)Math.cos((double)(4 * var9_int + 2) * 3.141592653589793 / (double)var2);
            var8[2 * var9_int + 1] = -(float)Math.sin((double)(4 * var9_int + 2) * 3.141592653589793 / (double)var2);
          }
          var9 = new int[var5];
          var10 = d.b(-118, var5 - 1);
          for (var11 = 0; var11 < var5; var11++) {
            var9[var11] = fk.a(var10, var11, 1);
          }
          if (var1 == 0) {
            field_r = var6_ref_float__;
            field_S = var7;
            field_p = var8;
            field_z = var9;
          } else {
            field_G = var6_ref_float__;
            field_q = var7;
            field_C = var8;
            field_D = var9;
          }
        }
        var1Lifetime1 = vh.a(8) + 1;
        field_o = new ic[var1Lifetime1];
        for (var2Lifetime1 = 0; var2Lifetime1 < var1Lifetime1; var2Lifetime1++) {
          field_o[var2Lifetime1] = new ic();
        }
        var2Lifetime2 = vh.a(6) + 1;
        for (var3Lifetime1 = 0; var3Lifetime1 < var2Lifetime2; var3Lifetime1++) {
          vh.a(16);
        }
        var2Lifetime3 = vh.a(6) + 1;
        field_E = new rd[var2Lifetime3];
        for (var3Lifetime2 = 0; var3Lifetime2 < var2Lifetime3; var3Lifetime2++) {
          field_E[var3Lifetime2] = new rd();
        }
        var3Lifetime3 = vh.a(6) + 1;
        field_u = new pi[var3Lifetime3];
        for (var4Lifetime1 = 0; var4Lifetime1 < var3Lifetime3; var4Lifetime1++) {
          field_u[var4Lifetime1] = new pi();
        }
        var4Lifetime2 = vh.a(6) + 1;
        field_x = new pg[var4Lifetime2];
        for (var5Lifetime1 = 0; var5Lifetime1 < var4Lifetime2; var5Lifetime1++) {
          field_x[var5Lifetime1] = new pg();
        }
        var5Lifetime2 = vh.a(6) + 1;
        field_H = new boolean[var5Lifetime2];
        field_J = new int[var5Lifetime2];
        for (var6 = 0; var6 < var5Lifetime2; var6++) {
          stackIn_41_0 = (boolean[]) (field_H);
          stackIn_41_1 = var6;
          stackIn_42_2 = (vh.a() != 0);
          stackIn_41_0[stackIn_41_1] = stackIn_42_2;
          vh.a(16);
          vh.a(16);
          field_J[var6] = vh.a(8);
        }
        field_M = true;
    }

    private vh(byte[] param0) throws IOException {
        this.b(param0);
    }

    static {
        field_M = false;
    }
}
