/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj extends nc {
    static int[] field_p;
    private int field_l;
    static int field_t;
    private vh field_r;
    private int field_s;
    private int field_n;
    static volatile boolean field_m;
    private int field_o;
    private int field_q;

    vj(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
        try {
          this.field_r = new vh(0L, (cj) null, 140, 60, 256, 120);
          this.field_q = 0;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "vj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(byte param0) {
        rp var3 = ll.field_k;
        rp var2 = var3;
        var3.field_c[0] = this.field_o;
        var3.field_p[0] = this.field_n;
        var3.field_c[1] = this.field_l;
        var3.field_p[1] = this.field_s;
        th.b((byte) -61);
        super.b(param0);
    }

    public static void e(int param0) {
        if (param0 != 31592) {
          field_t = 121;
          field_p = null;
          return;
        }
        field_p = null;
    }

    final static int b(boolean param0, int param1) {
        int var3 = 0;
        int var2 = 0;
        if ((7 & param1) != 0) {
          var2 = -(param1 & 7) + 8;
        }
        if (param0) {
          var3 = param1 + var2;
          return var3;
        }
        return -87;
    }

    final void a(boolean param0) {
        ef var20 = null;
        ja var21 = null;
        ja var22 = null;
        ja var23 = null;
        ja var24 = null;
        ef var25 = null;
        ja var26 = null;
        ja var27 = null;
        ja var28 = null;
        ja var29 = null;
        ef var30 = null;
        ja var31 = null;
        ja var32 = null;
        ja var33 = null;
        ja var34 = null;
        ef var35 = null;
        ja var36 = null;
        ja var37 = null;
        ja var38 = null;
        ja var39 = null;
        ef var40 = null;
        ja var41 = null;
        ja var42 = null;
        ja var43 = null;
        ja var44 = null;
        ef var45 = null;
        ja var46 = null;
        ja var47 = null;
        ja var48 = null;
        ja var49 = null;
        ef var50 = null;
        ja var51 = null;
        ja var52 = null;
        ja var53 = null;
        ja var54 = null;
        ef var55 = null;
        ja var56 = null;
        ja var57 = null;
        ja var58 = null;
        ja var59 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var2Lifetime5;
        int var2Lifetime6;
        int var2Lifetime7;
        int var2Lifetime8;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var3Lifetime4;
        int var3Lifetime5;
        int var3Lifetime6;
        int var3Lifetime7;
        int var3Lifetime8;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        int var4Lifetime6;
        int var4Lifetime7;
        int var4Lifetime8;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var5Lifetime5;
        int var5Lifetime6;
        int var5Lifetime7;
        int var5Lifetime8;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        int var6Lifetime5;
        int var6Lifetime6;
        int var6Lifetime7;
        int var6Lifetime8;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        int var8Lifetime5;
        int var8Lifetime6;
        int var8Lifetime7;
        int var8Lifetime8;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var9Lifetime4;
        int var9Lifetime5;
        int var9Lifetime6;
        int var9Lifetime7;
        int var9Lifetime8;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var10Lifetime6;
        int var10Lifetime7;
        int var10Lifetime8;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var11Lifetime4;
        int var11Lifetime5;
        int var11Lifetime6;
        int var11Lifetime7;
        int var11Lifetime8;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        int var12Lifetime5;
        int var12Lifetime6;
        int var12Lifetime7;
        int var12Lifetime8;
        int var13Lifetime1;
        int var13Lifetime2;
        int var13Lifetime3;
        int var13Lifetime4;
        int var13Lifetime5;
        int var13Lifetime6;
        int var13Lifetime7;
        int var13Lifetime8;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        int var14Lifetime4;
        int var14Lifetime5;
        int var14Lifetime6;
        int var14Lifetime7;
        int var14Lifetime8;
        oo.b();
        this.b(0);
        super.a(param0);
        oo.a(30, 60, 60, 52, 3381555);
        oo.f(32, 62, 56, 48, 8947814, 128);
        oo.a(30, 142, 60, 52, 3381555);
        oo.f(32, 144, 56, 48, 8947814, 128);
        if (kd.field_b != 1) {
          if (kd.field_b == 1 &&
            30 < vb.field_f &&
            142 < ka.field_t &&
            90 > vb.field_f &&
            ka.field_t < 194) {
            this.field_r.field_Ob = this.field_q != 3 ? this.field_l : this.field_s;
            this.field_q = this.field_q == 3 ? 4 : 3;
          }
          var2 = 100;
          var3 = 60;
          var4 = 20;
          var5 = 20;
          var6 = 2;
          var20 = qp.field_w;
          var8 = 2 + (var20.field_r + var20.field_C);
          var20.c("Skin", var2, -2 + (-var20.field_r + var3), 16777215, 0);
          this.a(var4, 1, var6, this.field_o, (byte) -64, var5, var2, var3);
          var3 = var3 + (var5 + var8 + 5);
          var20.c("Cloth", var2, var3 + (-var20.field_r - 2), 16777215, 0);
          this.a(var4, 2, var6, this.field_n, (byte) -105, var5, var2, var3);
          var3 = var3 + (5 + var5 + var8);
          var20.c("Skin", var2, -var20.field_r + (var3 - 2), 16777215, 0);
          this.a(var4, 3, var6, this.field_l, (byte) -93, var5, var2, var3);
          var3 = var3 + (5 + (var8 + var5));
          var20.c("Cloth", var2, -2 + (-var20.field_r + var3), 16777215, 0);
          this.a(var4, 4, var6, this.field_s, (byte) -96, var5, var2, var3);
          var9 = 0;
          var10 = 4;
          var11 = gg.field_b[var10];
          var12 = gg.field_l[var10];
          var13 = gg.field_j[var10];
          var14 = var12 + wf.field_m / var11 % var13;
          var21 = am.a(var14, this.field_o, var9, 1, this.field_n);
          og.h((byte) 110);
          var21.g(47, 57);
          var22 = am.a(var14, this.field_o, 1, 1, this.field_n);
          og.h((byte) 117);
          var22.g(17, 57);
          var23 = am.a(var14, this.field_l, var9, 1, this.field_s);
          og.h((byte) 118);
          var23.g(47, 139);
          var24 = am.a(var14, this.field_l, 1, 1, this.field_s);
          og.h((byte) 113);
          var24.g(17, 139);
          this.field_r.i(-31);
          return;
        }
        if (vb.field_f <= 30) {
          if (kd.field_b == 1 &&
            30 < vb.field_f &&
            142 < ka.field_t &&
            90 > vb.field_f &&
            ka.field_t < 194) {
            this.field_r.field_Ob = this.field_q != 3 ? this.field_l : this.field_s;
            this.field_q = this.field_q == 3 ? 4 : 3;
          }
          var2Lifetime1 = 100;
          var3Lifetime1 = 60;
          var4Lifetime1 = 20;
          var5Lifetime1 = 20;
          var6Lifetime1 = 2;
          var25 = qp.field_w;
          var8Lifetime1 = 2 + (var25.field_r + var25.field_C);
          var25.c("Skin", var2Lifetime1, -2 + (-var25.field_r + var3Lifetime1), 16777215, 0);
          this.a(var4Lifetime1, 1, var6Lifetime1, this.field_o, (byte) -64, var5Lifetime1, var2Lifetime1, var3Lifetime1);
          var3Lifetime1 = var3Lifetime1 + (var5Lifetime1 + var8Lifetime1 + 5);
          var25.c("Cloth", var2Lifetime1, var3Lifetime1 + (-var25.field_r - 2), 16777215, 0);
          this.a(var4Lifetime1, 2, var6Lifetime1, this.field_n, (byte) -105, var5Lifetime1, var2Lifetime1, var3Lifetime1);
          var3Lifetime1 = var3Lifetime1 + (5 + var5Lifetime1 + var8Lifetime1);
          var25.c("Skin", var2Lifetime1, -var25.field_r + (var3Lifetime1 - 2), 16777215, 0);
          this.a(var4Lifetime1, 3, var6Lifetime1, this.field_l, (byte) -93, var5Lifetime1, var2Lifetime1, var3Lifetime1);
          var3Lifetime1 = var3Lifetime1 + (5 + (var8Lifetime1 + var5Lifetime1));
          var25.c("Cloth", var2Lifetime1, -2 + (-var25.field_r + var3Lifetime1), 16777215, 0);
          this.a(var4Lifetime1, 4, var6Lifetime1, this.field_s, (byte) -96, var5Lifetime1, var2Lifetime1, var3Lifetime1);
          var9Lifetime1 = 0;
          var10Lifetime1 = 4;
          var11Lifetime1 = gg.field_b[var10Lifetime1];
          var12Lifetime1 = gg.field_l[var10Lifetime1];
          var13Lifetime1 = gg.field_j[var10Lifetime1];
          var14Lifetime1 = var12Lifetime1 + wf.field_m / var11Lifetime1 % var13Lifetime1;
          var26 = am.a(var14Lifetime1, this.field_o, var9Lifetime1, 1, this.field_n);
          og.h((byte) 110);
          var26.g(47, 57);
          var27 = am.a(var14Lifetime1, this.field_o, 1, 1, this.field_n);
          og.h((byte) 117);
          var27.g(17, 57);
          var28 = am.a(var14Lifetime1, this.field_l, var9Lifetime1, 1, this.field_s);
          og.h((byte) 118);
          var28.g(47, 139);
          var29 = am.a(var14Lifetime1, this.field_l, 1, 1, this.field_s);
          og.h((byte) 113);
          var29.g(17, 139);
          this.field_r.i(-31);
          return;
        }
        if (ka.field_t <= 60) {
          if (kd.field_b == 1 &&
            30 < vb.field_f &&
            142 < ka.field_t &&
            90 > vb.field_f &&
            ka.field_t < 194) {
            this.field_r.field_Ob = this.field_q != 3 ? this.field_l : this.field_s;
            this.field_q = this.field_q == 3 ? 4 : 3;
          }
          var2Lifetime2 = 100;
          var3Lifetime2 = 60;
          var4Lifetime2 = 20;
          var5Lifetime2 = 20;
          var6Lifetime2 = 2;
          var30 = qp.field_w;
          var8Lifetime2 = 2 + (var30.field_r + var30.field_C);
          var30.c("Skin", var2Lifetime2, -2 + (-var30.field_r + var3Lifetime2), 16777215, 0);
          this.a(var4Lifetime2, 1, var6Lifetime2, this.field_o, (byte) -64, var5Lifetime2, var2Lifetime2, var3Lifetime2);
          var3Lifetime2 = var3Lifetime2 + (var5Lifetime2 + var8Lifetime2 + 5);
          var30.c("Cloth", var2Lifetime2, var3Lifetime2 + (-var30.field_r - 2), 16777215, 0);
          this.a(var4Lifetime2, 2, var6Lifetime2, this.field_n, (byte) -105, var5Lifetime2, var2Lifetime2, var3Lifetime2);
          var3Lifetime2 = var3Lifetime2 + (5 + var5Lifetime2 + var8Lifetime2);
          var30.c("Skin", var2Lifetime2, -var30.field_r + (var3Lifetime2 - 2), 16777215, 0);
          this.a(var4Lifetime2, 3, var6Lifetime2, this.field_l, (byte) -93, var5Lifetime2, var2Lifetime2, var3Lifetime2);
          var3Lifetime2 = var3Lifetime2 + (5 + (var8Lifetime2 + var5Lifetime2));
          var30.c("Cloth", var2Lifetime2, -2 + (-var30.field_r + var3Lifetime2), 16777215, 0);
          this.a(var4Lifetime2, 4, var6Lifetime2, this.field_s, (byte) -96, var5Lifetime2, var2Lifetime2, var3Lifetime2);
          var9Lifetime2 = 0;
          var10Lifetime2 = 4;
          var11Lifetime2 = gg.field_b[var10Lifetime2];
          var12Lifetime2 = gg.field_l[var10Lifetime2];
          var13Lifetime2 = gg.field_j[var10Lifetime2];
          var14Lifetime2 = var12Lifetime2 + wf.field_m / var11Lifetime2 % var13Lifetime2;
          var31 = am.a(var14Lifetime2, this.field_o, var9Lifetime2, 1, this.field_n);
          og.h((byte) 110);
          var31.g(47, 57);
          var32 = am.a(var14Lifetime2, this.field_o, 1, 1, this.field_n);
          og.h((byte) 117);
          var32.g(17, 57);
          var33 = am.a(var14Lifetime2, this.field_l, var9Lifetime2, 1, this.field_s);
          og.h((byte) 118);
          var33.g(47, 139);
          var34 = am.a(var14Lifetime2, this.field_l, 1, 1, this.field_s);
          og.h((byte) 113);
          var34.g(17, 139);
          this.field_r.i(-31);
          return;
        }
        if (vb.field_f >= 90) {
          if (kd.field_b == 1 &&
            30 < vb.field_f &&
            142 < ka.field_t &&
            90 > vb.field_f &&
            ka.field_t < 194) {
            this.field_r.field_Ob = this.field_q != 3 ? this.field_l : this.field_s;
            this.field_q = this.field_q == 3 ? 4 : 3;
          }
          var2Lifetime3 = 100;
          var3Lifetime3 = 60;
          var4Lifetime3 = 20;
          var5Lifetime3 = 20;
          var6Lifetime3 = 2;
          var35 = qp.field_w;
          var8Lifetime3 = 2 + (var35.field_r + var35.field_C);
          var35.c("Skin", var2Lifetime3, -2 + (-var35.field_r + var3Lifetime3), 16777215, 0);
          this.a(var4Lifetime3, 1, var6Lifetime3, this.field_o, (byte) -64, var5Lifetime3, var2Lifetime3, var3Lifetime3);
          var3Lifetime3 = var3Lifetime3 + (var5Lifetime3 + var8Lifetime3 + 5);
          var35.c("Cloth", var2Lifetime3, var3Lifetime3 + (-var35.field_r - 2), 16777215, 0);
          this.a(var4Lifetime3, 2, var6Lifetime3, this.field_n, (byte) -105, var5Lifetime3, var2Lifetime3, var3Lifetime3);
          var3Lifetime3 = var3Lifetime3 + (5 + var5Lifetime3 + var8Lifetime3);
          var35.c("Skin", var2Lifetime3, -var35.field_r + (var3Lifetime3 - 2), 16777215, 0);
          this.a(var4Lifetime3, 3, var6Lifetime3, this.field_l, (byte) -93, var5Lifetime3, var2Lifetime3, var3Lifetime3);
          var3Lifetime3 = var3Lifetime3 + (5 + (var8Lifetime3 + var5Lifetime3));
          var35.c("Cloth", var2Lifetime3, -2 + (-var35.field_r + var3Lifetime3), 16777215, 0);
          this.a(var4Lifetime3, 4, var6Lifetime3, this.field_s, (byte) -96, var5Lifetime3, var2Lifetime3, var3Lifetime3);
          var9Lifetime3 = 0;
          var10Lifetime3 = 4;
          var11Lifetime3 = gg.field_b[var10Lifetime3];
          var12Lifetime3 = gg.field_l[var10Lifetime3];
          var13Lifetime3 = gg.field_j[var10Lifetime3];
          var14Lifetime3 = var12Lifetime3 + wf.field_m / var11Lifetime3 % var13Lifetime3;
          var36 = am.a(var14Lifetime3, this.field_o, var9Lifetime3, 1, this.field_n);
          og.h((byte) 110);
          var36.g(47, 57);
          var37 = am.a(var14Lifetime3, this.field_o, 1, 1, this.field_n);
          og.h((byte) 117);
          var37.g(17, 57);
          var38 = am.a(var14Lifetime3, this.field_l, var9Lifetime3, 1, this.field_s);
          og.h((byte) 118);
          var38.g(47, 139);
          var39 = am.a(var14Lifetime3, this.field_l, 1, 1, this.field_s);
          og.h((byte) 113);
          var39.g(17, 139);
          this.field_r.i(-31);
          return;
        }
        if (ka.field_t < 112) {
          this.field_r.field_Ob = this.field_q != 1 ? this.field_o : this.field_n;
          this.field_q = this.field_q != 1 ? 1 : 2;
        }
        if (kd.field_b != 1) {
          var2Lifetime4 = 100;
          var3Lifetime4 = 60;
          var4Lifetime4 = 20;
          var5Lifetime4 = 20;
          var6Lifetime4 = 2;
          var40 = qp.field_w;
          var8Lifetime4 = 2 + (var40.field_r + var40.field_C);
          var40.c("Skin", var2Lifetime4, -2 + (-var40.field_r + var3Lifetime4), 16777215, 0);
          this.a(var4Lifetime4, 1, var6Lifetime4, this.field_o, (byte) -64, var5Lifetime4, var2Lifetime4, var3Lifetime4);
          var3Lifetime4 = var3Lifetime4 + (var5Lifetime4 + var8Lifetime4 + 5);
          var40.c("Cloth", var2Lifetime4, var3Lifetime4 + (-var40.field_r - 2), 16777215, 0);
          this.a(var4Lifetime4, 2, var6Lifetime4, this.field_n, (byte) -105, var5Lifetime4, var2Lifetime4, var3Lifetime4);
          var3Lifetime4 = var3Lifetime4 + (5 + var5Lifetime4 + var8Lifetime4);
          var40.c("Skin", var2Lifetime4, -var40.field_r + (var3Lifetime4 - 2), 16777215, 0);
          this.a(var4Lifetime4, 3, var6Lifetime4, this.field_l, (byte) -93, var5Lifetime4, var2Lifetime4, var3Lifetime4);
          var3Lifetime4 = var3Lifetime4 + (5 + (var8Lifetime4 + var5Lifetime4));
          var40.c("Cloth", var2Lifetime4, -2 + (-var40.field_r + var3Lifetime4), 16777215, 0);
          this.a(var4Lifetime4, 4, var6Lifetime4, this.field_s, (byte) -96, var5Lifetime4, var2Lifetime4, var3Lifetime4);
          var9Lifetime4 = 0;
          var10Lifetime4 = 4;
          var11Lifetime4 = gg.field_b[var10Lifetime4];
          var12Lifetime4 = gg.field_l[var10Lifetime4];
          var13Lifetime4 = gg.field_j[var10Lifetime4];
          var14Lifetime4 = var12Lifetime4 + wf.field_m / var11Lifetime4 % var13Lifetime4;
          var41 = am.a(var14Lifetime4, this.field_o, var9Lifetime4, 1, this.field_n);
          og.h((byte) 110);
          var41.g(47, 57);
          var42 = am.a(var14Lifetime4, this.field_o, 1, 1, this.field_n);
          og.h((byte) 117);
          var42.g(17, 57);
          var43 = am.a(var14Lifetime4, this.field_l, var9Lifetime4, 1, this.field_s);
          og.h((byte) 118);
          var43.g(47, 139);
          var44 = am.a(var14Lifetime4, this.field_l, 1, 1, this.field_s);
          og.h((byte) 113);
          var44.g(17, 139);
          this.field_r.i(-31);
          return;
        }
        if (30 >= vb.field_f) {
          var2Lifetime5 = 100;
          var3Lifetime5 = 60;
          var4Lifetime5 = 20;
          var5Lifetime5 = 20;
          var6Lifetime5 = 2;
          var45 = qp.field_w;
          var8Lifetime5 = 2 + (var45.field_r + var45.field_C);
          var45.c("Skin", var2Lifetime5, -2 + (-var45.field_r + var3Lifetime5), 16777215, 0);
          this.a(var4Lifetime5, 1, var6Lifetime5, this.field_o, (byte) -64, var5Lifetime5, var2Lifetime5, var3Lifetime5);
          var3Lifetime5 = var3Lifetime5 + (var5Lifetime5 + var8Lifetime5 + 5);
          var45.c("Cloth", var2Lifetime5, var3Lifetime5 + (-var45.field_r - 2), 16777215, 0);
          this.a(var4Lifetime5, 2, var6Lifetime5, this.field_n, (byte) -105, var5Lifetime5, var2Lifetime5, var3Lifetime5);
          var3Lifetime5 = var3Lifetime5 + (5 + var5Lifetime5 + var8Lifetime5);
          var45.c("Skin", var2Lifetime5, -var45.field_r + (var3Lifetime5 - 2), 16777215, 0);
          this.a(var4Lifetime5, 3, var6Lifetime5, this.field_l, (byte) -93, var5Lifetime5, var2Lifetime5, var3Lifetime5);
          var3Lifetime5 = var3Lifetime5 + (5 + (var8Lifetime5 + var5Lifetime5));
          var45.c("Cloth", var2Lifetime5, -2 + (-var45.field_r + var3Lifetime5), 16777215, 0);
          this.a(var4Lifetime5, 4, var6Lifetime5, this.field_s, (byte) -96, var5Lifetime5, var2Lifetime5, var3Lifetime5);
          var9Lifetime5 = 0;
          var10Lifetime5 = 4;
          var11Lifetime5 = gg.field_b[var10Lifetime5];
          var12Lifetime5 = gg.field_l[var10Lifetime5];
          var13Lifetime5 = gg.field_j[var10Lifetime5];
          var14Lifetime5 = var12Lifetime5 + wf.field_m / var11Lifetime5 % var13Lifetime5;
          var46 = am.a(var14Lifetime5, this.field_o, var9Lifetime5, 1, this.field_n);
          og.h((byte) 110);
          var46.g(47, 57);
          var47 = am.a(var14Lifetime5, this.field_o, 1, 1, this.field_n);
          og.h((byte) 117);
          var47.g(17, 57);
          var48 = am.a(var14Lifetime5, this.field_l, var9Lifetime5, 1, this.field_s);
          og.h((byte) 118);
          var48.g(47, 139);
          var49 = am.a(var14Lifetime5, this.field_l, 1, 1, this.field_s);
          og.h((byte) 113);
          var49.g(17, 139);
          this.field_r.i(-31);
          return;
        }
        if (142 >= ka.field_t) {
          var2Lifetime6 = 100;
          var3Lifetime6 = 60;
          var4Lifetime6 = 20;
          var5Lifetime6 = 20;
          var6Lifetime6 = 2;
          var50 = qp.field_w;
          var8Lifetime6 = 2 + (var50.field_r + var50.field_C);
          var50.c("Skin", var2Lifetime6, -2 + (-var50.field_r + var3Lifetime6), 16777215, 0);
          this.a(var4Lifetime6, 1, var6Lifetime6, this.field_o, (byte) -64, var5Lifetime6, var2Lifetime6, var3Lifetime6);
          var3Lifetime6 = var3Lifetime6 + (var5Lifetime6 + var8Lifetime6 + 5);
          var50.c("Cloth", var2Lifetime6, var3Lifetime6 + (-var50.field_r - 2), 16777215, 0);
          this.a(var4Lifetime6, 2, var6Lifetime6, this.field_n, (byte) -105, var5Lifetime6, var2Lifetime6, var3Lifetime6);
          var3Lifetime6 = var3Lifetime6 + (5 + var5Lifetime6 + var8Lifetime6);
          var50.c("Skin", var2Lifetime6, -var50.field_r + (var3Lifetime6 - 2), 16777215, 0);
          this.a(var4Lifetime6, 3, var6Lifetime6, this.field_l, (byte) -93, var5Lifetime6, var2Lifetime6, var3Lifetime6);
          var3Lifetime6 = var3Lifetime6 + (5 + (var8Lifetime6 + var5Lifetime6));
          var50.c("Cloth", var2Lifetime6, -2 + (-var50.field_r + var3Lifetime6), 16777215, 0);
          this.a(var4Lifetime6, 4, var6Lifetime6, this.field_s, (byte) -96, var5Lifetime6, var2Lifetime6, var3Lifetime6);
          var9Lifetime6 = 0;
          var10Lifetime6 = 4;
          var11Lifetime6 = gg.field_b[var10Lifetime6];
          var12Lifetime6 = gg.field_l[var10Lifetime6];
          var13Lifetime6 = gg.field_j[var10Lifetime6];
          var14Lifetime6 = var12Lifetime6 + wf.field_m / var11Lifetime6 % var13Lifetime6;
          var51 = am.a(var14Lifetime6, this.field_o, var9Lifetime6, 1, this.field_n);
          og.h((byte) 110);
          var51.g(47, 57);
          var52 = am.a(var14Lifetime6, this.field_o, 1, 1, this.field_n);
          og.h((byte) 117);
          var52.g(17, 57);
          var53 = am.a(var14Lifetime6, this.field_l, var9Lifetime6, 1, this.field_s);
          og.h((byte) 118);
          var53.g(47, 139);
          var54 = am.a(var14Lifetime6, this.field_l, 1, 1, this.field_s);
          og.h((byte) 113);
          var54.g(17, 139);
          this.field_r.i(-31);
          return;
        }
        if (90 <= vb.field_f) {
          var2Lifetime7 = 100;
          var3Lifetime7 = 60;
          var4Lifetime7 = 20;
          var5Lifetime7 = 20;
          var6Lifetime7 = 2;
          var55 = qp.field_w;
          var8Lifetime7 = 2 + (var55.field_r + var55.field_C);
          var55.c("Skin", var2Lifetime7, -2 + (-var55.field_r + var3Lifetime7), 16777215, 0);
          this.a(var4Lifetime7, 1, var6Lifetime7, this.field_o, (byte) -64, var5Lifetime7, var2Lifetime7, var3Lifetime7);
          var3Lifetime7 = var3Lifetime7 + (var5Lifetime7 + var8Lifetime7 + 5);
          var55.c("Cloth", var2Lifetime7, var3Lifetime7 + (-var55.field_r - 2), 16777215, 0);
          this.a(var4Lifetime7, 2, var6Lifetime7, this.field_n, (byte) -105, var5Lifetime7, var2Lifetime7, var3Lifetime7);
          var3Lifetime7 = var3Lifetime7 + (5 + var5Lifetime7 + var8Lifetime7);
          var55.c("Skin", var2Lifetime7, -var55.field_r + (var3Lifetime7 - 2), 16777215, 0);
          this.a(var4Lifetime7, 3, var6Lifetime7, this.field_l, (byte) -93, var5Lifetime7, var2Lifetime7, var3Lifetime7);
          var3Lifetime7 = var3Lifetime7 + (5 + (var8Lifetime7 + var5Lifetime7));
          var55.c("Cloth", var2Lifetime7, -2 + (-var55.field_r + var3Lifetime7), 16777215, 0);
          this.a(var4Lifetime7, 4, var6Lifetime7, this.field_s, (byte) -96, var5Lifetime7, var2Lifetime7, var3Lifetime7);
          var9Lifetime7 = 0;
          var10Lifetime7 = 4;
          var11Lifetime7 = gg.field_b[var10Lifetime7];
          var12Lifetime7 = gg.field_l[var10Lifetime7];
          var13Lifetime7 = gg.field_j[var10Lifetime7];
          var14Lifetime7 = var12Lifetime7 + wf.field_m / var11Lifetime7 % var13Lifetime7;
          var56 = am.a(var14Lifetime7, this.field_o, var9Lifetime7, 1, this.field_n);
          og.h((byte) 110);
          var56.g(47, 57);
          var57 = am.a(var14Lifetime7, this.field_o, 1, 1, this.field_n);
          og.h((byte) 117);
          var57.g(17, 57);
          var58 = am.a(var14Lifetime7, this.field_l, var9Lifetime7, 1, this.field_s);
          og.h((byte) 118);
          var58.g(47, 139);
          var59 = am.a(var14Lifetime7, this.field_l, 1, 1, this.field_s);
          og.h((byte) 113);
          var59.g(17, 139);
          this.field_r.i(-31);
          return;
        }
        if (ka.field_t < 194) {
          this.field_r.field_Ob = this.field_q != 3 ? this.field_l : this.field_s;
          this.field_q = this.field_q == 3 ? 4 : 3;
        }
        var2Lifetime8 = 100;
        var3Lifetime8 = 60;
        var4Lifetime8 = 20;
        var5Lifetime8 = 20;
        var6Lifetime8 = 2;
        ef var60 = qp.field_w;
        var8Lifetime8 = 2 + (var60.field_r + var60.field_C);
        var60.c("Skin", var2Lifetime8, -2 + (-var60.field_r + var3Lifetime8), 16777215, 0);
        this.a(var4Lifetime8, 1, var6Lifetime8, this.field_o, (byte) -64, var5Lifetime8, var2Lifetime8, var3Lifetime8);
        var3Lifetime8 = var3Lifetime8 + (var5Lifetime8 + var8Lifetime8 + 5);
        var60.c("Cloth", var2Lifetime8, var3Lifetime8 + (-var60.field_r - 2), 16777215, 0);
        this.a(var4Lifetime8, 2, var6Lifetime8, this.field_n, (byte) -105, var5Lifetime8, var2Lifetime8, var3Lifetime8);
        var3Lifetime8 = var3Lifetime8 + (5 + var5Lifetime8 + var8Lifetime8);
        var60.c("Skin", var2Lifetime8, -var60.field_r + (var3Lifetime8 - 2), 16777215, 0);
        this.a(var4Lifetime8, 3, var6Lifetime8, this.field_l, (byte) -93, var5Lifetime8, var2Lifetime8, var3Lifetime8);
        var3Lifetime8 = var3Lifetime8 + (5 + (var8Lifetime8 + var5Lifetime8));
        var60.c("Cloth", var2Lifetime8, -2 + (-var60.field_r + var3Lifetime8), 16777215, 0);
        this.a(var4Lifetime8, 4, var6Lifetime8, this.field_s, (byte) -96, var5Lifetime8, var2Lifetime8, var3Lifetime8);
        var9Lifetime8 = 0;
        var10Lifetime8 = 4;
        var11Lifetime8 = gg.field_b[var10Lifetime8];
        var12Lifetime8 = gg.field_l[var10Lifetime8];
        var13Lifetime8 = gg.field_j[var10Lifetime8];
        var14Lifetime8 = var12Lifetime8 + wf.field_m / var11Lifetime8 % var13Lifetime8;
        ja var61 = am.a(var14Lifetime8, this.field_o, var9Lifetime8, 1, this.field_n);
        og.h((byte) 110);
        var61.g(47, 57);
        ja var62 = am.a(var14Lifetime8, this.field_o, 1, 1, this.field_n);
        og.h((byte) 117);
        var62.g(17, 57);
        ja var63 = am.a(var14Lifetime8, this.field_l, var9Lifetime8, 1, this.field_s);
        og.h((byte) 118);
        var63.g(47, 139);
        ja var64 = am.a(var14Lifetime8, this.field_l, 1, 1, this.field_s);
        og.h((byte) 113);
        var64.g(17, 139);
        this.field_r.i(-31);
    }

    final void a(int param0, boolean param1, int param2) {
        super.a(0, param1, param2);
        rp var5 = ll.field_k;
        rp var4 = var5;
        this.field_n = var5.field_p[param0];
        this.field_s = var5.field_p[1];
        this.field_o = var5.field_c[0];
        this.field_l = var5.field_c[1];
    }

    final void a(int param0) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        super.a(0);
        this.field_r.j(1);
        if (param0 == 0) {
          var2 = this.field_q;
          if (1 == var2) {
            this.field_o = this.field_r.field_Ob;
            return;
          }
          if (var2 == 2) {
            this.field_n = this.field_r.field_Ob;
            return;
          }
          if (var2 == 3) {
            this.field_l = this.field_r.field_Ob;
            return;
          }
          if (var2 != 4) {
            return;
          }
          this.field_s = this.field_r.field_Ob;
          return;
        }
        field_t = 9;
        var2Lifetime1 = this.field_q;
        if (1 == var2Lifetime1) {
          this.field_o = this.field_r.field_Ob;
          return;
        }
        if (var2Lifetime1 == 2) {
          this.field_n = this.field_r.field_Ob;
          return;
        }
        if (var2Lifetime1 == 3) {
          this.field_l = this.field_r.field_Ob;
          return;
        }
        if (var2Lifetime1 != 4) {
          return;
        }
        this.field_s = this.field_r.field_Ob;
    }

    private final void a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6, int param7) {
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_64_0 = 0;
        int var9;
        if (kd.field_b != 1) {
          stackIn_4_0 = (this.field_q != param1) ? 6710886 : 14540253;
          var9 = stackIn_4_0;
          if (bd.field_g > param6 &&
            param7 < bo.field_d &&
            bd.field_g < param0 + param6 &&
            param7 + param5 > bo.field_d) {
            stackIn_11_0 = ((1 & jf.field_e) > 0) ? 16777215 : 14540219;
            var9 = stackIn_11_0;
          }
        } else {
          if (vb.field_f <= param6) {
            stackIn_20_0 = (this.field_q != param1) ? 6710886 : 14540253;
            var9 = stackIn_20_0;
            if (bd.field_g > param6 &&
              param7 < bo.field_d &&
              bd.field_g < param0 + param6 &&
              param7 + param5 > bo.field_d) {
              stackIn_31_0 = ((1 & jf.field_e) > 0) ? 16777215 : 14540219;
              var9 = stackIn_31_0;
            }
          } else {
            if (ka.field_t > param7 &&
              vb.field_f < param6 + param0 &&
              param5 + param7 > ka.field_t) {
              this.field_r.field_Ob = param3;
              this.field_q = param1;
              stackIn_42_0 = (this.field_q != param1) ? 6710886 : 14540253;
              var9 = stackIn_42_0;
              if (bd.field_g > param6 &&
                param7 < bo.field_d &&
                bd.field_g < param0 + param6 &&
                param7 + param5 > bo.field_d) {
                stackIn_49_0 = ((1 & jf.field_e) > 0) ? 16777215 : 14540219;
                var9 = stackIn_49_0;
              }
              oo.e(param6, param7, param0, param5, var9);
              oo.e(param6 + param2, param7 + param2, -(param2 * 2) + param0, param5 - param2 * 2, param3);
              if (param4 <= 0) {
                return;
              }
              vj.e(23);
              return;
            }
            stackIn_57_0 = (this.field_q != param1) ? 6710886 : 14540253;
            var9 = stackIn_57_0;
            if (bd.field_g > param6 &&
              param7 < bo.field_d &&
              bd.field_g < param0 + param6 &&
              param7 + param5 > bo.field_d) {
              stackIn_64_0 = ((1 & jf.field_e) > 0) ? 16777215 : 14540219;
              var9 = stackIn_64_0;
            }
          }
        }
        oo.e(param6, param7, param0, param5, var9);
        oo.e(param6 + param2, param7 + param2, -(param2 * 2) + param0, param5 - param2 * 2, param3);
        if (param4 <= 0) {
          return;
        }
        vj.e(23);
    }

    static {
        field_m = false;
        field_t = 360;
    }
}
