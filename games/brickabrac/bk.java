/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bk extends IntrusiveNode {
    private static int[] field_r;
    private static int field_F;
    private static int field_H;
    private static int field_v;
    private static boolean field_p;
    private static fg[] field_P;
    private static float[] field_n;
    private int field_s;
    private static cj[] field_u;
    private boolean field_q;
    private int field_C;
    private static fn[] field_z;
    private static float[] field_L;
    private static int[] field_x;
    private static float[] field_E;
    private static float[] field_k;
    private static byte[] field_I;
    private float[] field_y;
    private static float[] field_t;
    private int field_Q;
    private static int field_B;
    private boolean field_N;
    private static float[] field_K;
    private static boolean[] field_w;
    private int field_o;
    private int field_O;
    static te[] field_M;
    private int field_G;
    private int field_J;
    private static int[] field_A;
    private static float[] field_i;
    private int field_j;
    private byte[][] field_l;
    private byte[] field_m;

    final static int b() {
        int var0 = field_I[field_F] >> field_v & 1;
        field_v = field_v + 1;
        field_F = field_F + (field_v >> 3);
        field_v = field_v & 7;
        return var0;
    }

    private final static boolean a(ResourceArchive param0) {
        byte[] var1 = null;
        if (!field_p) {
          var1 = param0.takeFile(0, 0, 4);
          if (var1 == null) {
            return false;
          }
          bk.b(var1);
        }
        return true;
    }

    final static bk a(ResourceArchive param0, int param1, int param2) {
        try {
          bk var4_ref = null;
          if (!bk.a(param0)) {
            param0.ensureFileAvailable(param2, param1, (byte) 102);
            return null;
          }
          byte[] var3 = param0.takeFile(param2, param1, 4);
          if (var3 == null) {
            return null;
          }
          Object var4 = null;
          try {
            var4_ref = new bk(var3);
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

    final static int c(int param0) {
        int var4 = 0;
        int var3 = 0;
        int var1 = 0;
        int var2 = 0;
        int var3Lifetime1;
        while (param0 >= 8 - field_v) {
          var3 = 8 - field_v;
          var4 = (1 << var3) - 1;
          var1 = var1 + ((field_I[field_F] >> field_v & var4) << var2);
          field_v = 0;
          field_F = field_F + 1;
          var2 = var2 + var3;
          param0 = param0 - var3;
        }
        if (param0 > 0) {
          var3Lifetime1 = (1 << param0) - 1;
          var1 = var1 + ((field_I[field_F] >> field_v & var3Lifetime1) << var2);
          field_v = field_v + param0;
        }
        return var1;
    }

    private final static void a(byte[] param0, int param1) {
        field_I = param0;
        field_F = param1;
        field_v = 0;
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

    private final void a(byte[] param0) throws IOException {
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        byte[] var6 = null;
        PacketBuffer var2 = new PacketBuffer(param0);
        this.field_j = var2.readInt(255);
        this.field_o = var2.readInt(255);
        this.field_G = var2.readInt(255);
        this.field_J = var2.readInt(255);
        if (this.field_J < 0) {
          this.field_J = ~this.field_J;
          this.field_q = true;
        }
        int var3 = var2.readInt(255);
        if (var3 < 0) {
          throw new IOException();
        }
        this.field_l = new byte[var3][];
        for (var4 = 0; var4 < var3; var4++) {
          var5 = 0;
          do {
            var6_int = var2.readUnsignedByte(255);
            var5 = var5 + var6_int;
          } while (var6_int >= 255);
          var6 = new byte[var5];
          var2.readBytes(0, var6, 115, var5);
          this.field_l[var4] = var6;
        }
    }

    final PcmSound c() {
        int var3 = 0;
        int var6 = 0;
        int incrementValue$0 = 0;
        byte[] var1;
        int var2;
        float[] var4;
        int var5;
        int var7;
        this.field_s = 0;
        this.field_y = new float[field_H];
        var1 = new byte[this.field_o];
        var2 = 0;
        for (var3 = 0; var3 < this.field_l.length; var3++) {
          var4 = this.a(var3);
          if (var4 != null) {
            var5 = var4.length;
            if (var5 > this.field_o - var2) {
              var5 = this.field_o - var2;
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
        this.field_y = null;
        return new PcmSound(this.field_j, var1, this.field_G, this.field_J, this.field_q);
    }

    final static void b(byte[] param0) {
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
        bk.a(param0, 0);
        field_B = 1 << bk.c(4);
        field_H = 1 << bk.c(4);
        field_t = new float[field_H];
        for (var1 = 0; var1 < 2; var1++) {
          if (var1 == 0) {
            stackIn_5_0 = field_B;
          } else {
            stackIn_5_0 = field_H;
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
          var10 = ed.b(9, var5 - 1);
          for (var11 = 0; var11 < var5; var11++) {
            var9[var11] = KeyboardInput.a(var10, var11, -1);
          }
          if (var1 == 0) {
            field_n = var6_ref_float__;
            field_k = var7;
            field_E = var8;
            field_r = var9;
          } else {
            field_K = var6_ref_float__;
            field_i = var7;
            field_L = var8;
            field_x = var9;
          }
        }
        var1Lifetime1 = bk.c(8) + 1;
        field_M = new te[var1Lifetime1];
        for (var2Lifetime1 = 0; var2Lifetime1 < var1Lifetime1; var2Lifetime1++) {
          field_M[var2Lifetime1] = new te();
        }
        var2Lifetime2 = bk.c(6) + 1;
        for (var3Lifetime1 = 0; var3Lifetime1 < var2Lifetime2; var3Lifetime1++) {
          bk.c(16);
        }
        var2Lifetime3 = bk.c(6) + 1;
        field_P = new fg[var2Lifetime3];
        for (var3Lifetime2 = 0; var3Lifetime2 < var2Lifetime3; var3Lifetime2++) {
          field_P[var3Lifetime2] = new fg();
        }
        var3Lifetime3 = bk.c(6) + 1;
        field_u = new cj[var3Lifetime3];
        for (var4Lifetime1 = 0; var4Lifetime1 < var3Lifetime3; var4Lifetime1++) {
          field_u[var4Lifetime1] = new cj();
        }
        var4Lifetime2 = bk.c(6) + 1;
        field_z = new fn[var4Lifetime2];
        for (var5Lifetime1 = 0; var5Lifetime1 < var4Lifetime2; var5Lifetime1++) {
          field_z[var5Lifetime1] = new fn();
        }
        var5Lifetime2 = bk.c(6) + 1;
        field_w = new boolean[var5Lifetime2];
        field_A = new int[var5Lifetime2];
        for (var6 = 0; var6 < var5Lifetime2; var6++) {
          stackIn_41_0 = (boolean[]) (field_w);
          stackIn_41_1 = var6;
          stackIn_42_2 = (bk.b() != 0);
          stackIn_41_0[stackIn_41_1] = stackIn_42_2;
          bk.c(16);
          bk.c(16);
          field_A[var6] = bk.c(8);
        }
        field_p = true;
    }

    final PcmSound a(int[] param0) {
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
        if (this.field_m == null) {
          this.field_s = 0;
          this.field_y = new float[field_H];
          this.field_m = new byte[this.field_o];
          this.field_O = 0;
          this.field_Q = 0;
        }
        while (this.field_Q < this.field_l.length) {
          if (param0 != null &&
            param0[0] <= 0) {
            return null;
          }
          var7 = this.a(this.field_Q);
          if (var7 != null) {
            var3 = this.field_O;
            var4 = var7.length;
            if (var4 > this.field_o - var3) {
              var4 = this.field_o - var3;
            }
            for (var5 = 0; var5 < var4; var5++) {
              var6 = (int)(128.0f + var7[var5] * 128.0f);
              if ((var6 & -256) != 0) {
                var6 = ~var6 >> 31;
              }
              incrementValue$0 = var3;
              var3++;
              this.field_m[incrementValue$0] = (byte)(var6 - 128);
            }
            if (param0 != null) {
              param0[0] = param0[0] - (var3 - this.field_O);
            }
            this.field_O = var3;
          }
          this.field_Q = this.field_Q + 1;
        }
        this.field_y = null;
        var12 = this.field_m;
        this.field_m = null;
        return new PcmSound(this.field_j, var12, this.field_G, this.field_J, this.field_q);
    }

    public static void a() {
        field_I = null;
        field_M = null;
        field_P = null;
        field_u = null;
        field_z = null;
        field_w = null;
        field_A = null;
        field_t = null;
        field_n = null;
        field_k = null;
        field_E = null;
        field_K = null;
        field_i = null;
        field_L = null;
        field_r = null;
        field_x = null;
    }

    final static bk a(ResourceArchive param0, String param1, String param2) {
        try {
          bk var4_ref = null;
          if (!bk.a(param0)) {
            param0.ensureFileAvailableByName(param2, param1, 0);
            return null;
          }
          byte[] var3 = param0.takeFileByName(85, param1, param2);
          if (var3 == null) {
            return null;
          }
          Object var4 = null;
          try {
            var4_ref = new bk(var3);
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
        fn var14;
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
        cj var42;
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
        bk.a(this.field_l[param0], 0);
        bk.b();
        var2 = bk.c(ed.b(9, field_A.length - 1));
        var3 = field_w[var2] ? 1 : 0;
        if (var3 == 0) {
          stackIn_3_0 = field_B;
        } else {
          stackIn_3_0 = field_H;
        }
        var4 = stackIn_3_0;
        var5 = 0;
        var6 = 0;
        if (var3 != 0) {
          stackIn_7_0 = (bk.b() == 0) ? 0 : 1;
          var5 = stackIn_7_0;
          stackIn_10_0 = (bk.b() == 0) ? 0 : 1;
          var6 = stackIn_10_0;
        }
        var7 = var4 >> 1;
        if (var3 != 0 &&
          var5 == 0) {
          var8 = (var4 >> 2) - (field_B >> 2);
          var9 = (var4 >> 2) + (field_B >> 2);
          var10 = field_B >> 1;
        } else {
          var8 = 0;
          var9 = var7;
          var10 = var4 >> 1;
        }
        if (var3 != 0 &&
          var6 == 0) {
          var11 = var4 - (var4 >> 2) - (field_B >> 2);
          var12 = var4 - (var4 >> 2) + (field_B >> 2);
          var13 = field_B >> 1;
        } else {
          var11 = var7;
          var12 = var4;
          var13 = var4 >> 1;
        }
        var14 = field_z[field_A[var2]];
        var16 = var14.field_c;
        var17_int = var14.field_d[var16];
        stackIn_22_0 = (field_P[var17_int].b()) ? 0 : 1;
        var15 = stackIn_22_0;
        var16Lifetime1 = var15;
        for (var17_intLifetime1 = 0; var17_intLifetime1 < var14.field_b; var17_intLifetime1++) {
          var42 = field_u[var14.field_a[var17_intLifetime1]];
          var52 = field_t;
          var42.a(var52, var4 >> 1, var16Lifetime1 != 0);
        }
        if (var15 == 0) {
          var17_intLifetime2 = var14.field_c;
          var18_int = var14.field_d[var17_intLifetime2];
          field_P[var18_int].a(field_t, var4 >> 1);
        }
        if (var15 != 0) {
          for (var17_intLifetime3 = var4 >> 1; var17_intLifetime3 < var4; var17_intLifetime3++) {
            field_t[var17_intLifetime3] = 0.0f;
          }
        } else {
          var17_intLifetime3 = var4 >> 1;
          var18_intLifetime1 = var4 >> 2;
          var19 = var4 >> 3;
          var49 = field_t;
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
            stackIn_40_0 = (float[]) (field_n);
          } else {
            stackIn_40_0 = (float[]) (field_K);
          }
          var21 = stackIn_40_0;
          if (var3 == 0) {
            stackIn_43_0 = (float[]) (field_k);
          } else {
            stackIn_43_0 = (float[]) (field_i);
          }
          var22 = stackIn_43_0;
          if (var3 == 0) {
            stackIn_46_0 = (float[]) (field_E);
          } else {
            stackIn_46_0 = (float[]) (field_L);
          }
          var23 = stackIn_46_0;
          if (var3 == 0) {
            stackIn_49_0 = (int[]) (field_r);
          } else {
            stackIn_49_0 = (int[]) (field_x);
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
          var25Lifetime2 = ed.b(9, var4 - 1);
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
            field_t[var26Lifetime10] = field_t[var26Lifetime10] * (float)Math.sin(1.5707963267948966 * (double)var27Lifetime3 * (double)var27Lifetime3);
          }
          for (var26Lifetime11 = var11; var26Lifetime11 < var12; var26Lifetime11++) {
            var27Lifetime4 = (float)Math.sin(((double)(var26Lifetime11 - var11) + 0.5) / (double)var13 * 0.5 * 3.141592653589793 + 1.5707963267948966);
            field_t[var26Lifetime11] = field_t[var26Lifetime11] * (float)Math.sin(1.5707963267948966 * (double)var27Lifetime4 * (double)var27Lifetime4);
          }
        }
        var17 = null;
        if (this.field_s > 0) {
          var18_intLifetime2 = this.field_s + var4 >> 2;
          var50 = new float[var18_intLifetime2];
          var46 = var50;
          var40 = var46;
          var17 = var40;
          if (!this.field_N) {
            for (var19Lifetime1 = 0; var19Lifetime1 < this.field_C; var19Lifetime1++) {
              var20 = (this.field_s >> 1) + var19Lifetime1;
              var40[var19Lifetime1] = var40[var19Lifetime1] + this.field_y[var20];
            }
          }
          if (var15 == 0) {
            for (var19Lifetime1Lifetime1 = var8; var19Lifetime1Lifetime1 < var4 >> 1; var19Lifetime1Lifetime1++) {
              var20Lifetime1 = var50.length - (var4 >> 1) + var19Lifetime1Lifetime1;
              var40[var20Lifetime1] = var40[var20Lifetime1] + field_t[var19Lifetime1Lifetime1];
            }
          }
        }
        var18 = this.field_y;
        this.field_y = field_t;
        field_t = var18;
        this.field_s = var4;
        this.field_C = var12 - (var4 >> 1);
        stackIn_113_1 = (var15 != 0);
        this.field_N = stackIn_113_1;
        return (float[]) (var17);
    }

    private bk(byte[] param0) throws IOException {
        this.a(param0);
    }

    static {
        field_p = false;
    }
}
