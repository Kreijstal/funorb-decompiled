/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class in extends IntrusiveNode {
    private static int field_o;
    private static byte[] field_j;
    private float[] field_s;
    private int field_G;
    private static int[] field_w;
    private int field_v;
    private static ud[] field_N;
    private static float[] field_I;
    static fm[] field_k;
    private static boolean[] field_t;
    private int field_y;
    private static boolean field_n;
    private int field_L;
    private static float[] field_E;
    private static float[] field_x;
    private static float[] field_i;
    private int field_J;
    private boolean field_g;
    private static int field_C;
    private int field_l;
    private static int[] field_D;
    private static pm[] field_H;
    private static u[] field_M;
    private byte[] field_K;
    private static int field_m;
    private static float[] field_B;
    private boolean field_A;
    private static int[] field_p;
    private static float[] field_u;
    private static float[] field_z;
    private static int field_q;
    private int field_r;
    private int field_F;
    private byte[][] field_h;

    final hh a(int[] param0) {
        if (param0 != null &&
          param0[0] <= 0) {
          return null;
        }
        if (this.field_K == null) {
          this.field_J = 0;
          this.field_s = new float[field_m];
          this.field_K = new byte[this.field_y];
          this.field_G = 0;
          this.field_l = 0;
        }
        while (this.field_l < this.field_h.length) {
          if (param0 != null &&
            param0[0] <= 0) {
            return null;
          }
          float[] var7 = this.f(this.field_l);
          if (var7 != null) {
            int var3 = this.field_G;
            int var4 = var7.length;
            if (var4 > this.field_y - var3) {
              var4 = this.field_y - var3;
            }
            for (int var5 = 0; var5 < var4; var5++) {
              int var6 = (int)(128.0f + var7[var5] * 128.0f);
              if ((var6 & -256) != 0) {
                var6 = ~var6 >> 31;
              }
              int incrementValue$0 = var3;
              var3++;
              this.field_K[incrementValue$0] = (byte)(var6 - 128);
            }
            if (param0 != null) {
              param0[0] = param0[0] - (var3 - this.field_G);
            }
            this.field_G = var3;
          }
          this.field_l = this.field_l + 1;
        }
        this.field_s = null;
        byte[] var12 = this.field_K;
        this.field_K = null;
        return new hh(this.field_v, var12, this.field_L, this.field_F, this.field_A);
    }

    final hh b() {
        this.field_J = 0;
        this.field_s = new float[field_m];
        byte[] var1 = new byte[this.field_y];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field_h.length; var3++) {
          float[] var4 = this.f(var3);
          if (var4 != null) {
            int var5 = var4.length;
            if (var5 > this.field_y - var2) {
              var5 = this.field_y - var2;
            }
            for (int var6 = 0; var6 < var5; var6++) {
              int var7 = (int)(128.0f + var4[var6] * 128.0f);
              if ((var7 & -256) != 0) {
                var7 = ~var7 >> 31;
              }
              int incrementValue$0 = var2;
              var2++;
              var1[incrementValue$0] = (byte)(var7 - 128);
            }
          }
        }
        this.field_s = null;
        return new hh(this.field_v, var1, this.field_L, this.field_F, this.field_A);
    }

    private final static void a(byte[] param0, int param1) {
        field_j = param0;
        field_o = param1;
        field_C = 0;
    }

    final static in a(mf param0, int param1, int param2) {
        try {
          in var4_ref = null;
          if (!in.a(param0)) {
            param0.a(true, param1, param2);
            return null;
          }
          byte[] var3 = param0.a(param1, (byte) -97, param2);
          if (var3 == null) {
            return null;
          }
          Object var4 = null;
          try {
            var4_ref = new in(var3);
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

    final static int c() {
        int var0 = field_j[field_o] >> field_C & 1;
        field_C = field_C + 1;
        field_o = field_o + (field_C >> 3);
        field_C = field_C & 7;
        return var0;
    }

    final static in a(mf param0, String param1, String param2) {
        try {
          in var4_ref = null;
          if (!in.a(param0)) {
            param0.a(param2, param1, (byte) 98);
            return null;
          }
          byte[] var3 = param0.a(-4, param2, param1);
          if (var3 == null) {
            return null;
          }
          Object var4 = null;
          try {
            var4_ref = new in(var3);
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

    final static float d(int param0) {
        int var1 = param0 & 2097151;
        int var2 = param0 & -2147483648;
        int var3 = (param0 & 2145386496) >> 21;
        if (var2 != 0) {
          var1 = -var1;
        }
        return (float)((double)var1 * Math.pow(2.0, (double)(var3 - 788)));
    }

    private final static boolean a(mf param0) {
        if (!field_n) {
          byte[] var1 = param0.a(0, (byte) -97, 0);
          if (var1 == null) {
            return false;
          }
          in.a(var1);
        }
        return true;
    }

    public static void a() {
        field_j = null;
        field_k = null;
        field_M = null;
        field_N = null;
        field_H = null;
        field_t = null;
        field_w = null;
        field_u = null;
        field_E = null;
        field_z = null;
        field_i = null;
        field_I = null;
        field_x = null;
        field_B = null;
        field_p = null;
        field_D = null;
    }

    private final void b(byte[] param0) throws IOException {
        int var6_int = 0;
        PacketBuffer var2 = new PacketBuffer(param0);
        this.field_v = var2.readInt(-5053);
        this.field_y = var2.readInt(-5053);
        this.field_L = var2.readInt(-5053);
        this.field_F = var2.readInt(-5053);
        if (this.field_F < 0) {
          this.field_F = ~this.field_F;
          this.field_A = true;
        }
        int var3 = var2.readInt(-5053);
        if (var3 < 0) {
          throw new IOException();
        }
        this.field_h = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
          int var5 = 0;
          do {
            var6_int = var2.readUnsignedByte(0);
            var5 = var5 + var6_int;
          } while (var6_int >= 255);
          byte[] var6 = new byte[var5];
          var2.a(var6, (byte) -96, 0, var5);
          this.field_h[var4] = var6;
        }
    }

    final static void a(byte[] param0) {
        int stackIn_5_0 = 0;
        in.a(param0, 0);
        field_q = 1 << in.e(4);
        field_m = 1 << in.e(4);
        field_u = new float[field_m];
        for (int var1 = 0; var1 < 2; var1++) {
          if (var1 == 0) {
            stackIn_5_0 = field_q;
          } else {
            stackIn_5_0 = field_m;
          }
          int var2 = stackIn_5_0;
          int var3 = var2 >> 1;
          int var4 = var2 >> 2;
          int var5 = var2 >> 3;
          float[] var6_ref_float__ = new float[var3];
          for (int var7_int = 0; var7_int < var4; var7_int++) {
            var6_ref_float__[2 * var7_int] = (float)Math.cos((double)(4 * var7_int) * 3.141592653589793 / (double)var2);
            var6_ref_float__[2 * var7_int + 1] = -(float)Math.sin((double)(4 * var7_int) * 3.141592653589793 / (double)var2);
          }
          float[] var7 = new float[var3];
          for (int var8_int = 0; var8_int < var4; var8_int++) {
            var7[2 * var8_int] = (float)Math.cos((double)(2 * var8_int + 1) * 3.141592653589793 / (double)(2 * var2));
            var7[2 * var8_int + 1] = (float)Math.sin((double)(2 * var8_int + 1) * 3.141592653589793 / (double)(2 * var2));
          }
          float[] var8 = new float[var4];
          for (int var9_int = 0; var9_int < var5; var9_int++) {
            var8[2 * var9_int] = (float)Math.cos((double)(4 * var9_int + 2) * 3.141592653589793 / (double)var2);
            var8[2 * var9_int + 1] = -(float)Math.sin((double)(4 * var9_int + 2) * 3.141592653589793 / (double)var2);
          }
          int[] var9 = new int[var5];
          int var10 = nm.a(var5 - 1, (byte) 78);
          for (int var11 = 0; var11 < var5; var11++) {
            var9[var11] = cm.a(var11, var10, (byte) 96);
          }
          if (var1 == 0) {
            field_E = var6_ref_float__;
            field_z = var7;
            field_i = var8;
            field_p = var9;
          } else {
            field_I = var6_ref_float__;
            field_x = var7;
            field_B = var8;
            field_D = var9;
          }
        }
        int var1Lifetime1 = in.e(8) + 1;
        field_k = new fm[var1Lifetime1];
        for (int var2Lifetime1 = 0; var2Lifetime1 < var1Lifetime1; var2Lifetime1++) {
          field_k[var2Lifetime1] = new fm();
        }
        int var2Lifetime2 = in.e(6) + 1;
        for (int var3Lifetime1 = 0; var3Lifetime1 < var2Lifetime2; var3Lifetime1++) {
          in.e(16);
        }
        int var2Lifetime3 = in.e(6) + 1;
        field_M = new u[var2Lifetime3];
        for (int var3Lifetime2 = 0; var3Lifetime2 < var2Lifetime3; var3Lifetime2++) {
          field_M[var3Lifetime2] = new u();
        }
        int var3Lifetime3 = in.e(6) + 1;
        field_N = new ud[var3Lifetime3];
        for (int var4Lifetime1 = 0; var4Lifetime1 < var3Lifetime3; var4Lifetime1++) {
          field_N[var4Lifetime1] = new ud();
        }
        int var4Lifetime2 = in.e(6) + 1;
        field_H = new pm[var4Lifetime2];
        for (int var5Lifetime1 = 0; var5Lifetime1 < var4Lifetime2; var5Lifetime1++) {
          field_H[var5Lifetime1] = new pm();
        }
        int var5Lifetime2 = in.e(6) + 1;
        field_t = new boolean[var5Lifetime2];
        field_w = new int[var5Lifetime2];
        for (int var6 = 0; var6 < var5Lifetime2; var6++) {
          boolean[] stackIn_41_0 = (boolean[]) (field_t);
          int stackIn_41_1 = var6;
          boolean stackIn_42_2 = (in.c() != 0);
          stackIn_41_0[stackIn_41_1] = stackIn_42_2;
          in.e(16);
          in.e(16);
          field_w[var6] = in.e(8);
        }
        field_n = true;
    }

    final static int e(int param0) {
        int var1 = 0;
        int var2 = 0;
        while (param0 >= 8 - field_C) {
          int var3 = 8 - field_C;
          int var4 = (1 << var3) - 1;
          var1 = var1 + ((field_j[field_o] >> field_C & var4) << var2);
          field_C = 0;
          field_o = field_o + 1;
          var2 = var2 + var3;
          param0 = param0 - var3;
        }
        if (param0 > 0) {
          int var3Lifetime1 = (1 << param0) - 1;
          var1 = var1 + ((field_j[field_o] >> field_C & var3Lifetime1) << var2);
          field_C = field_C + param0;
        }
        return var1;
    }

    private final float[] f(int param0) {
        int stackIn_3_0 = 0;
        float[] stackIn_40_0 = null;
        float[] stackIn_43_0 = null;
        float[] stackIn_46_0 = null;
        int[] stackIn_49_0 = null;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var17_intLifetime3;
        in.a(this.field_h[param0], 0);
        in.c();
        int var2 = in.e(nm.a(field_w.length - 1, (byte) 78));
        boolean var3 = (field_t[var2]);
        if (!var3) {
          stackIn_3_0 = field_q;
        } else {
          stackIn_3_0 = field_m;
        }
        int var4 = stackIn_3_0;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
          boolean stackIn_7_0 = !(in.c() == 0);
          var5 = stackIn_7_0;
          boolean stackIn_10_0 = !(in.c() == 0);
          var6 = stackIn_10_0;
        }
        int var7 = var4 >> 1;
        if (var3 &&
          !var5) {
          var8 = (var4 >> 2) - (field_q >> 2);
          var9 = (var4 >> 2) + (field_q >> 2);
          var10 = field_q >> 1;
        } else {
          var8 = 0;
          var9 = var7;
          var10 = var4 >> 1;
        }
        if (var3 &&
          !var6) {
          var11 = var4 - (var4 >> 2) - (field_q >> 2);
          var12 = var4 - (var4 >> 2) + (field_q >> 2);
          var13 = field_q >> 1;
        } else {
          var11 = var7;
          var12 = var4;
          var13 = var4 >> 1;
        }
        pm var14 = field_H[field_w[var2]];
        int var16 = var14.field_b;
        int var17_int = var14.field_d[var16];
        boolean stackIn_22_0 = !(field_M[var17_int].b());
        boolean var15 = stackIn_22_0;
        boolean var16Lifetime1 = var15;
        for (int var17_intLifetime1 = 0; var17_intLifetime1 < var14.field_a; var17_intLifetime1++) {
          ud var42 = field_N[var14.field_c[var17_intLifetime1]];
          float[] var52 = field_u;
          var42.a(var52, var4 >> 1, (var16Lifetime1));
        }
        if (!var15) {
          int var17_intLifetime2 = var14.field_b;
          int var18_int = var14.field_d[var17_intLifetime2];
          field_M[var18_int].a(field_u, var4 >> 1);
        }
        if (var15) {
          for (var17_intLifetime3 = var4 >> 1; var17_intLifetime3 < var4; var17_intLifetime3++) {
            field_u[var17_intLifetime3] = 0.0f;
          }
        } else {
          var17_intLifetime3 = var4 >> 1;
          int var18_intLifetime1 = var4 >> 2;
          int var19 = var4 >> 3;
          float[] var49 = field_u;
          float[] var45 = var49;
          float[] var20_ref_float__ = var45;
          for (int var21_int = 0; var21_int < var17_intLifetime3; var21_int++) {
            var20_ref_float__[var21_int] = var20_ref_float__[var21_int] * 0.5f;
          }
          int var41 = var17_intLifetime3;
          int var21_intLifetime1 = var41;
          while (var41 < var4) {
            var20_ref_float__[var41] = -var20_ref_float__[var4 - var41 - 1];
            var41++;
          }
          if (!var3) {
            stackIn_40_0 = (float[]) (field_E);
          } else {
            stackIn_40_0 = (float[]) (field_I);
          }
          float[] var21 = stackIn_40_0;
          if (!var3) {
            stackIn_43_0 = (float[]) (field_z);
          } else {
            stackIn_43_0 = (float[]) (field_x);
          }
          float[] var22 = stackIn_43_0;
          if (!var3) {
            stackIn_46_0 = (float[]) (field_i);
          } else {
            stackIn_46_0 = (float[]) (field_B);
          }
          float[] var23 = stackIn_46_0;
          if (!var3) {
            stackIn_49_0 = (int[]) (field_p);
          } else {
            stackIn_49_0 = (int[]) (field_D);
          }
          int[] var48 = stackIn_49_0;
          int[] var44 = var48;
          int[] var24 = var44;
          for (int var25 = 0; var25 < var18_intLifetime1; var25++) {
            float var26_float = var20_ref_float__[4 * var25] - var20_ref_float__[var4 - 4 * var25 - 1];
            float var27 = var20_ref_float__[4 * var25 + 2] - var20_ref_float__[var4 - 4 * var25 - 3];
            float var28 = var21[2 * var25];
            float var29 = var21[2 * var25 + 1];
            var20_ref_float__[var4 - 4 * var25 - 1] = var26_float * var28 - var27 * var29;
            var20_ref_float__[var4 - 4 * var25 - 3] = var26_float * var29 + var27 * var28;
          }
          for (int var25Lifetime1 = 0; var25Lifetime1 < var19; var25Lifetime1++) {
            float var26_floatLifetime1 = var20_ref_float__[var17_intLifetime3 + 3 + 4 * var25Lifetime1];
            float var27Lifetime1 = var20_ref_float__[var17_intLifetime3 + 1 + 4 * var25Lifetime1];
            float var28Lifetime1 = var20_ref_float__[4 * var25Lifetime1 + 3];
            float var29Lifetime1 = var20_ref_float__[4 * var25Lifetime1 + 1];
            var20_ref_float__[var17_intLifetime3 + 3 + 4 * var25Lifetime1] = var26_floatLifetime1 + var28Lifetime1;
            var20_ref_float__[var17_intLifetime3 + 1 + 4 * var25Lifetime1] = var27Lifetime1 + var29Lifetime1;
            float var30 = var21[var17_intLifetime3 - 4 - 4 * var25Lifetime1];
            float var31 = var21[var17_intLifetime3 - 3 - 4 * var25Lifetime1];
            var20_ref_float__[4 * var25Lifetime1 + 3] = (var26_floatLifetime1 - var28Lifetime1) * var30 - (var27Lifetime1 - var29Lifetime1) * var31;
            var20_ref_float__[4 * var25Lifetime1 + 1] = (var27Lifetime1 - var29Lifetime1) * var30 + (var26_floatLifetime1 - var28Lifetime1) * var31;
          }
          int var25Lifetime2 = nm.a(var4 - 1, (byte) 78);
          for (int var26 = 0; var26 < var25Lifetime2 - 3; var26++) {
            int var27_int = var4 >> var26 + 2;
            int var28_int = 8 << var26;
            for (int var29_int = 0; var29_int < 2 << var26; var29_int++) {
              int var30_int = var4 - var27_int * 2 * var29_int;
              int var31_int = var4 - var27_int * (2 * var29_int + 1);
              for (int var32_int = 0; var32_int < var4 >> var26 + 4; var32_int++) {
                int var33_int = 4 * var32_int;
                float var34 = var20_ref_float__[var30_int - 1 - var33_int];
                float var35 = var20_ref_float__[var30_int - 3 - var33_int];
                float var36 = var20_ref_float__[var31_int - 1 - var33_int];
                float var37 = var20_ref_float__[var31_int - 3 - var33_int];
                var20_ref_float__[var30_int - 1 - var33_int] = var34 + var36;
                var20_ref_float__[var30_int - 3 - var33_int] = var35 + var37;
                float var38 = var21[var32_int * var28_int];
                float var39 = var21[var32_int * var28_int + 1];
                var20_ref_float__[var31_int - 1 - var33_int] = (var34 - var36) * var38 - (var35 - var37) * var39;
                var20_ref_float__[var31_int - 3 - var33_int] = (var35 - var37) * var38 + (var34 - var36) * var39;
              }
            }
          }
          for (int var26Lifetime1 = 1; var26Lifetime1 < var19 - 1; var26Lifetime1++) {
            int var27_intLifetime1 = var48[var26Lifetime1];
            if (var26Lifetime1 < var27_intLifetime1) {
              int var28_intLifetime1 = 8 * var26Lifetime1;
              int var29_intLifetime1 = 8 * var27_intLifetime1;
              float var30Lifetime1 = var20_ref_float__[var28_intLifetime1 + 1];
              var20_ref_float__[var28_intLifetime1 + 1] = var20_ref_float__[var29_intLifetime1 + 1];
              var20_ref_float__[var29_intLifetime1 + 1] = var30Lifetime1;
              float var30Lifetime1Lifetime1 = var20_ref_float__[var28_intLifetime1 + 3];
              var20_ref_float__[var28_intLifetime1 + 3] = var20_ref_float__[var29_intLifetime1 + 3];
              var20_ref_float__[var29_intLifetime1 + 3] = var30Lifetime1Lifetime1;
              float var30Lifetime1Lifetime2 = var20_ref_float__[var28_intLifetime1 + 5];
              var20_ref_float__[var28_intLifetime1 + 5] = var20_ref_float__[var29_intLifetime1 + 5];
              var20_ref_float__[var29_intLifetime1 + 5] = var30Lifetime1Lifetime2;
              float var30Lifetime1Lifetime3 = var20_ref_float__[var28_intLifetime1 + 7];
              var20_ref_float__[var28_intLifetime1 + 7] = var20_ref_float__[var29_intLifetime1 + 7];
              var20_ref_float__[var29_intLifetime1 + 7] = var30Lifetime1Lifetime3;
            }
          }
          for (int var26Lifetime2 = 0; var26Lifetime2 < var17_intLifetime3; var26Lifetime2++) {
            var20_ref_float__[var26Lifetime2] = var20_ref_float__[2 * var26Lifetime2 + 1];
          }
          for (int var26Lifetime3 = 0; var26Lifetime3 < var19; var26Lifetime3++) {
            var20_ref_float__[var4 - 1 - 2 * var26Lifetime3] = var20_ref_float__[4 * var26Lifetime3];
            var20_ref_float__[var4 - 2 - 2 * var26Lifetime3] = var20_ref_float__[4 * var26Lifetime3 + 1];
            var20_ref_float__[var4 - var18_intLifetime1 - 1 - 2 * var26Lifetime3] = var20_ref_float__[4 * var26Lifetime3 + 2];
            var20_ref_float__[var4 - var18_intLifetime1 - 2 - 2 * var26Lifetime3] = var20_ref_float__[4 * var26Lifetime3 + 3];
          }
          for (int var26Lifetime4 = 0; var26Lifetime4 < var19; var26Lifetime4++) {
            float var27Lifetime2 = var23[2 * var26Lifetime4];
            float var28Lifetime2 = var23[2 * var26Lifetime4 + 1];
            float var29Lifetime2 = var20_ref_float__[var17_intLifetime3 + 2 * var26Lifetime4];
            float var30Lifetime2 = var20_ref_float__[var17_intLifetime3 + 2 * var26Lifetime4 + 1];
            float var31Lifetime1 = var20_ref_float__[var4 - 2 - 2 * var26Lifetime4];
            float var32 = var20_ref_float__[var4 - 1 - 2 * var26Lifetime4];
            float var33 = var28Lifetime2 * (var29Lifetime2 - var31Lifetime1) + var27Lifetime2 * (var30Lifetime2 + var32);
            var20_ref_float__[var17_intLifetime3 + 2 * var26Lifetime4] = (var29Lifetime2 + var31Lifetime1 + var33) * 0.5f;
            var20_ref_float__[var4 - 2 - 2 * var26Lifetime4] = (var29Lifetime2 + var31Lifetime1 - var33) * 0.5f;
            float var33Lifetime1 = var28Lifetime2 * (var30Lifetime2 + var32) - var27Lifetime2 * (var29Lifetime2 - var31Lifetime1);
            var20_ref_float__[var17_intLifetime3 + 2 * var26Lifetime4 + 1] = (var30Lifetime2 - var32 + var33Lifetime1) * 0.5f;
            var20_ref_float__[var4 - 1 - 2 * var26Lifetime4] = (-var30Lifetime2 + var32 + var33Lifetime1) * 0.5f;
          }
          for (int var26Lifetime5 = 0; var26Lifetime5 < var18_intLifetime1; var26Lifetime5++) {
            var20_ref_float__[var26Lifetime5] = var20_ref_float__[2 * var26Lifetime5 + var17_intLifetime3] * var22[2 * var26Lifetime5] + var20_ref_float__[2 * var26Lifetime5 + 1 + var17_intLifetime3] * var22[2 * var26Lifetime5 + 1];
            var20_ref_float__[var17_intLifetime3 - 1 - var26Lifetime5] = var20_ref_float__[2 * var26Lifetime5 + var17_intLifetime3] * var22[2 * var26Lifetime5 + 1] - var20_ref_float__[2 * var26Lifetime5 + 1 + var17_intLifetime3] * var22[2 * var26Lifetime5];
          }
          for (int var26Lifetime6 = 0; var26Lifetime6 < var18_intLifetime1; var26Lifetime6++) {
            var20_ref_float__[var4 - var18_intLifetime1 + var26Lifetime6] = -var49[var26Lifetime6];
          }
          for (int var26Lifetime7 = 0; var26Lifetime7 < var18_intLifetime1; var26Lifetime7++) {
            var20_ref_float__[var26Lifetime7] = var20_ref_float__[var18_intLifetime1 + var26Lifetime7];
          }
          for (int var26Lifetime8 = 0; var26Lifetime8 < var18_intLifetime1; var26Lifetime8++) {
            var20_ref_float__[var18_intLifetime1 + var26Lifetime8] = -var20_ref_float__[var18_intLifetime1 - var26Lifetime8 - 1];
          }
          for (int var26Lifetime9 = 0; var26Lifetime9 < var18_intLifetime1; var26Lifetime9++) {
            var20_ref_float__[var17_intLifetime3 + var26Lifetime9] = var20_ref_float__[var4 - var26Lifetime9 - 1];
          }
          for (int var26Lifetime10 = var8; var26Lifetime10 < var9; var26Lifetime10++) {
            float var27Lifetime3 = (float)Math.sin(((double)(var26Lifetime10 - var8) + 0.5) / (double)var10 * 0.5 * 3.141592653589793);
            field_u[var26Lifetime10] = field_u[var26Lifetime10] * (float)Math.sin(1.5707963267948966 * (double)var27Lifetime3 * (double)var27Lifetime3);
          }
          for (int var26Lifetime11 = var11; var26Lifetime11 < var12; var26Lifetime11++) {
            float var27Lifetime4 = (float)Math.sin(((double)(var26Lifetime11 - var11) + 0.5) / (double)var13 * 0.5 * 3.141592653589793 + 1.5707963267948966);
            field_u[var26Lifetime11] = field_u[var26Lifetime11] * (float)Math.sin(1.5707963267948966 * (double)var27Lifetime4 * (double)var27Lifetime4);
          }
        }
        Object var17 = null;
        if (this.field_J > 0) {
          int var18_intLifetime2 = this.field_J + var4 >> 2;
          float[] var50 = new float[var18_intLifetime2];
          float[] var46 = var50;
          float[] var40 = var46;
          var17 = var40;
          if (!this.field_g) {
            for (int var19Lifetime1 = 0; var19Lifetime1 < this.field_r; var19Lifetime1++) {
              int var20 = (this.field_J >> 1) + var19Lifetime1;
              var40[var19Lifetime1] = var40[var19Lifetime1] + this.field_s[var20];
            }
          }
          if (!var15) {
            for (int var19Lifetime1Lifetime1 = var8; var19Lifetime1Lifetime1 < var4 >> 1; var19Lifetime1Lifetime1++) {
              int var20Lifetime1 = var50.length - (var4 >> 1) + var19Lifetime1Lifetime1;
              var40[var20Lifetime1] = var40[var20Lifetime1] + field_u[var19Lifetime1Lifetime1];
            }
          }
        }
        float[] var18 = this.field_s;
        this.field_s = field_u;
        field_u = var18;
        this.field_J = var4;
        this.field_r = var12 - (var4 >> 1);
        boolean stackIn_113_1 = ((var15));
        this.field_g = stackIn_113_1;
        return (float[]) (var17);
    }

    private in(byte[] param0) throws IOException {
        this.b(param0);
    }

    static {
        field_n = false;
    }
}
