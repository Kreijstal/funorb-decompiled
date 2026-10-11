/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class t extends wf {
    private static int field_y;
    private static ar[] field_D;
    private boolean field_v;
    private float[] field_I;
    private static float[] field_r;
    private static float[] field_t;
    private static float[] field_s;
    private int field_J;
    private byte[] field_l;
    private static float[] field_m;
    private static uo[] field_p;
    private static int[] field_G;
    private static float[] field_g;
    private static int field_C;
    static db[] field_q;
    private int field_j;
    private int field_h;
    private static int[] field_L;
    private static boolean[] field_K;
    private int field_o;
    private int field_H;
    private static int[] field_u;
    private byte[][] field_x;
    private static int field_F;
    private static byte[] field_e;
    private static fl[] field_A;
    private int field_i;
    private int field_B;
    private static float[] field_n;
    private static float[] field_f;
    private static boolean field_E;
    private boolean field_k;
    private static int field_z;
    private int field_w;

    private final static boolean a(gk param0) {
        byte[] var1 = null;
        if (!field_E) {
          var1 = param0.a(0, -10470, 0);
          if (var1 == null) {
            return false;
          }
          t.a(var1);
        }
        return true;
    }

    final static t a(gk param0, int param1, int param2) {
        try {
          t var4_ref = null;
          if (!t.a(param0)) {
            param0.a(param2, (byte) 96, param1);
            return null;
          }
          byte[] var3 = param0.a(param1, -10470, param2);
          if (var3 == null) {
            return null;
          }
          Object var4 = null;
          try {
            var4_ref = new t(var3);
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

    private final void b(byte[] param0) throws IOException {
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        byte[] var6 = null;
        rb var2 = new rb(param0);
        this.field_J = var2.a((byte) 127);
        this.field_w = var2.a((byte) 117);
        this.field_j = var2.a((byte) 113);
        this.field_H = var2.a((byte) 120);
        if (this.field_H < 0) {
          this.field_H = ~this.field_H;
          this.field_k = true;
        }
        int var3 = var2.a((byte) 117);
        if (var3 < 0) {
          throw new IOException();
        }
        this.field_x = new byte[var3][];
        for (var4 = 0; var4 < var3; var4++) {
          var5 = 0;
          do {
            var6_int = var2.g(-111);
            var5 = var5 + var6_int;
          } while (var6_int >= 255);
          var6 = new byte[var5];
          var2.a(0, 7186, var5, var6);
          this.field_x[var4] = var6;
        }
    }

    private final static void a(byte[] param0, int param1) {
        field_e = param0;
        field_F = param1;
        field_y = 0;
    }

    private final float[] a(int param0) {
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
        uo var14;
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
        fl var42;
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
        t.a(this.field_x[param0], 0);
        t.b();
        var2 = t.d(ek.a((byte) 120, field_u.length - 1));
        var3 = field_K[var2] ? 1 : 0;
        if (var3 == 0) {
          stackIn_3_0 = field_C;
        } else {
          stackIn_3_0 = field_z;
        }
        var4 = stackIn_3_0;
        var5 = 0;
        var6 = 0;
        if (var3 != 0) {
          stackIn_7_0 = (t.b() == 0) ? 0 : 1;
          var5 = stackIn_7_0;
          stackIn_10_0 = (t.b() == 0) ? 0 : 1;
          var6 = stackIn_10_0;
        }
        var7 = var4 >> 1;
        if (var3 != 0 &&
          var5 == 0) {
          var8 = (var4 >> 2) - (field_C >> 2);
          var9 = (var4 >> 2) + (field_C >> 2);
          var10 = field_C >> 1;
        } else {
          var8 = 0;
          var9 = var7;
          var10 = var4 >> 1;
        }
        if (var3 != 0 &&
          var6 == 0) {
          var11 = var4 - (var4 >> 2) - (field_C >> 2);
          var12 = var4 - (var4 >> 2) + (field_C >> 2);
          var13 = field_C >> 1;
        } else {
          var11 = var7;
          var12 = var4;
          var13 = var4 >> 1;
        }
        var14 = field_p[field_u[var2]];
        var16 = var14.field_d;
        var17_int = var14.field_c[var16];
        stackIn_22_0 = (field_D[var17_int].a()) ? 0 : 1;
        var15 = stackIn_22_0;
        var16Lifetime1 = var15;
        for (var17_intLifetime1 = 0; var17_intLifetime1 < var14.field_a; var17_intLifetime1++) {
          var42 = field_A[var14.field_b[var17_intLifetime1]];
          var52 = field_n;
          var42.a(var52, var4 >> 1, var16Lifetime1 != 0);
        }
        if (var15 == 0) {
          var17_intLifetime2 = var14.field_d;
          var18_int = var14.field_c[var17_intLifetime2];
          field_D[var18_int].a(field_n, var4 >> 1);
        }
        if (var15 != 0) {
          for (var17_intLifetime3 = var4 >> 1; var17_intLifetime3 < var4; var17_intLifetime3++) {
            field_n[var17_intLifetime3] = 0.0f;
          }
        } else {
          var17_intLifetime3 = var4 >> 1;
          var18_intLifetime1 = var4 >> 2;
          var19 = var4 >> 3;
          var49 = field_n;
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
            stackIn_40_0 = (float[]) (field_t);
          }
          var21 = stackIn_40_0;
          if (var3 == 0) {
            stackIn_43_0 = (float[]) (field_s);
          } else {
            stackIn_43_0 = (float[]) (field_g);
          }
          var22 = stackIn_43_0;
          if (var3 == 0) {
            stackIn_46_0 = (float[]) (field_f);
          } else {
            stackIn_46_0 = (float[]) (field_m);
          }
          var23 = stackIn_46_0;
          if (var3 == 0) {
            stackIn_49_0 = (int[]) (field_L);
          } else {
            stackIn_49_0 = (int[]) (field_G);
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
          var25Lifetime2 = ek.a((byte) 102, var4 - 1);
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
            field_n[var26Lifetime10] = field_n[var26Lifetime10] * (float)Math.sin(1.5707963267948966 * (double)var27Lifetime3 * (double)var27Lifetime3);
          }
          for (var26Lifetime11 = var11; var26Lifetime11 < var12; var26Lifetime11++) {
            var27Lifetime4 = (float)Math.sin(((double)(var26Lifetime11 - var11) + 0.5) / (double)var13 * 0.5 * 3.141592653589793 + 1.5707963267948966);
            field_n[var26Lifetime11] = field_n[var26Lifetime11] * (float)Math.sin(1.5707963267948966 * (double)var27Lifetime4 * (double)var27Lifetime4);
          }
        }
        var17 = null;
        if (this.field_o > 0) {
          var18_intLifetime2 = this.field_o + var4 >> 2;
          var50 = new float[var18_intLifetime2];
          var46 = var50;
          var40 = var46;
          var17 = var40;
          if (!this.field_v) {
            for (var19Lifetime1 = 0; var19Lifetime1 < this.field_B; var19Lifetime1++) {
              var20 = (this.field_o >> 1) + var19Lifetime1;
              var40[var19Lifetime1] = var40[var19Lifetime1] + this.field_I[var20];
            }
          }
          if (var15 == 0) {
            for (var19Lifetime1Lifetime1 = var8; var19Lifetime1Lifetime1 < var4 >> 1; var19Lifetime1Lifetime1++) {
              var20Lifetime1 = var50.length - (var4 >> 1) + var19Lifetime1Lifetime1;
              var40[var20Lifetime1] = var40[var20Lifetime1] + field_n[var19Lifetime1Lifetime1];
            }
          }
        }
        var18 = this.field_I;
        this.field_I = field_n;
        field_n = var18;
        this.field_o = var4;
        this.field_B = var12 - (var4 >> 1);
        stackIn_113_1 = (var15 != 0);
        this.field_v = stackIn_113_1;
        return (float[]) (var17);
    }

    final static t a(gk param0, String param1, String param2) {
        try {
          t var4_ref = null;
          if (!t.a(param0)) {
            param0.a(param2, false, param1);
            return null;
          }
          byte[] var3 = param0.a(param1, (byte) -71, param2);
          if (var3 == null) {
            return null;
          }
          Object var4 = null;
          try {
            var4_ref = new t(var3);
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

    final al a(int[] param0) {
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
        if (this.field_l == null) {
          this.field_o = 0;
          this.field_I = new float[field_z];
          this.field_l = new byte[this.field_w];
          this.field_i = 0;
          this.field_h = 0;
        }
        while (this.field_h < this.field_x.length) {
          if (param0 != null &&
            param0[0] <= 0) {
            return null;
          }
          var7 = this.a(this.field_h);
          if (var7 != null) {
            var3 = this.field_i;
            var4 = var7.length;
            if (var4 > this.field_w - var3) {
              var4 = this.field_w - var3;
            }
            for (var5 = 0; var5 < var4; var5++) {
              var6 = (int)(128.0f + var7[var5] * 128.0f);
              if ((var6 & -256) != 0) {
                var6 = ~var6 >> 31;
              }
              incrementValue$0 = var3;
              var3++;
              this.field_l[incrementValue$0] = (byte)(var6 - 128);
            }
            if (param0 != null) {
              param0[0] = param0[0] - (var3 - this.field_i);
            }
            this.field_i = var3;
          }
          this.field_h = this.field_h + 1;
        }
        this.field_I = null;
        var12 = this.field_l;
        this.field_l = null;
        return new al(this.field_J, var12, this.field_j, this.field_H, this.field_k);
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
        t.a(param0, 0);
        field_C = 1 << t.d(4);
        field_z = 1 << t.d(4);
        field_n = new float[field_z];
        for (var1 = 0; var1 < 2; var1++) {
          if (var1 == 0) {
            stackIn_5_0 = field_C;
          } else {
            stackIn_5_0 = field_z;
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
          var10 = ek.a((byte) 121, var5 - 1);
          for (var11 = 0; var11 < var5; var11++) {
            var9[var11] = wd.b(12871, var10, var11);
          }
          if (var1 == 0) {
            field_r = var6_ref_float__;
            field_s = var7;
            field_f = var8;
            field_L = var9;
          } else {
            field_t = var6_ref_float__;
            field_g = var7;
            field_m = var8;
            field_G = var9;
          }
        }
        var1Lifetime1 = t.d(8) + 1;
        field_q = new db[var1Lifetime1];
        for (var2Lifetime1 = 0; var2Lifetime1 < var1Lifetime1; var2Lifetime1++) {
          field_q[var2Lifetime1] = new db();
        }
        var2Lifetime2 = t.d(6) + 1;
        for (var3Lifetime1 = 0; var3Lifetime1 < var2Lifetime2; var3Lifetime1++) {
          t.d(16);
        }
        var2Lifetime3 = t.d(6) + 1;
        field_D = new ar[var2Lifetime3];
        for (var3Lifetime2 = 0; var3Lifetime2 < var2Lifetime3; var3Lifetime2++) {
          field_D[var3Lifetime2] = new ar();
        }
        var3Lifetime3 = t.d(6) + 1;
        field_A = new fl[var3Lifetime3];
        for (var4Lifetime1 = 0; var4Lifetime1 < var3Lifetime3; var4Lifetime1++) {
          field_A[var4Lifetime1] = new fl();
        }
        var4Lifetime2 = t.d(6) + 1;
        field_p = new uo[var4Lifetime2];
        for (var5Lifetime1 = 0; var5Lifetime1 < var4Lifetime2; var5Lifetime1++) {
          field_p[var5Lifetime1] = new uo();
        }
        var5Lifetime2 = t.d(6) + 1;
        field_K = new boolean[var5Lifetime2];
        field_u = new int[var5Lifetime2];
        for (var6 = 0; var6 < var5Lifetime2; var6++) {
          stackIn_41_0 = (boolean[]) (field_K);
          stackIn_41_1 = var6;
          stackIn_42_2 = (t.b() != 0);
          stackIn_41_0[stackIn_41_1] = stackIn_42_2;
          t.d(16);
          t.d(16);
          field_u[var6] = t.d(8);
        }
        field_E = true;
    }

    public static void c() {
        field_e = null;
        field_q = null;
        field_D = null;
        field_A = null;
        field_p = null;
        field_K = null;
        field_u = null;
        field_n = null;
        field_r = null;
        field_s = null;
        field_f = null;
        field_t = null;
        field_g = null;
        field_m = null;
        field_L = null;
        field_G = null;
    }

    final static float e(int param0) {
        int var1 = param0 & 2097151;
        int var2 = param0 & -2147483648;
        int var3 = (param0 & 2145386496) >> 21;
        if (var2 != 0) {
          var1 = -var1;
        }
        return (float)((double)var1 * Math.pow(2.0, (double)(var3 - 788)));
    }

    final static int b() {
        int var0 = field_e[field_F] >> field_y & 1;
        field_y = field_y + 1;
        field_F = field_F + (field_y >> 3);
        field_y = field_y & 7;
        return var0;
    }

    final static int d(int param0) {
        int var4 = 0;
        int var3 = 0;
        int var1 = 0;
        int var2 = 0;
        int var3Lifetime1;
        while (param0 >= 8 - field_y) {
          var3 = 8 - field_y;
          var4 = (1 << var3) - 1;
          var1 = var1 + ((field_e[field_F] >> field_y & var4) << var2);
          field_y = 0;
          field_F = field_F + 1;
          var2 = var2 + var3;
          param0 = param0 - var3;
        }
        if (param0 > 0) {
          var3Lifetime1 = (1 << param0) - 1;
          var1 = var1 + ((field_e[field_F] >> field_y & var3Lifetime1) << var2);
          field_y = field_y + param0;
        }
        return var1;
    }

    final al a() {
        int var3 = 0;
        int var6 = 0;
        int incrementValue$0 = 0;
        byte[] var1;
        int var2;
        float[] var4;
        int var5;
        int var7;
        this.field_o = 0;
        this.field_I = new float[field_z];
        var1 = new byte[this.field_w];
        var2 = 0;
        for (var3 = 0; var3 < this.field_x.length; var3++) {
          var4 = this.a(var3);
          if (var4 != null) {
            var5 = var4.length;
            if (var5 > this.field_w - var2) {
              var5 = this.field_w - var2;
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
        this.field_I = null;
        return new al(this.field_J, var1, this.field_j, this.field_H, this.field_k);
    }

    private t(byte[] param0) throws IOException {
        this.b(param0);
    }

    static {
        field_E = false;
    }
}
