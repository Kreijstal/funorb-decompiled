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
        int var2;
        int var3;
        L0: {
          var2 = 0;
          if ((7 & param1) != 0) {
            var2 = -(param1 & 7) + 8;
            break L0;
          } else {
            break L0;
          }
        }
        if (!param0) {
          return -87;
        } else {
          var3 = param1 - -var2;
          return var3;
        }
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
        oo.b();
        this.b(0);
        super.a(param0);
        oo.a(30, 60, 60, 52, 3381555);
        oo.f(32, 62, 56, 48, 8947814, 128);
        oo.a(30, 142, 60, 52, 3381555);
        oo.f(32, 144, 56, 48, 8947814, 128);
        if (kd.field_b != 1) {
            if ((kd.field_b ^ -1) == -2 && 30 < vb.field_f && 142 < ka.field_t && 90 > vb.field_f && ka.field_t < 194) {
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
            var20.c("Skin", var2, -var20.field_r + (var3 + -2), 16777215, 0);
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
        if ((vb.field_f ^ -1) >= -31) {
            if ((kd.field_b ^ -1) == -2 && 30 < vb.field_f && 142 < ka.field_t && 90 > vb.field_f && ka.field_t < 194) {
                this.field_r.field_Ob = this.field_q != 3 ? this.field_l : this.field_s;
                this.field_q = this.field_q == 3 ? 4 : 3;
            }
            var2 = 100;
            var3 = 60;
            var4 = 20;
            var5 = 20;
            var6 = 2;
            var25 = qp.field_w;
            var8 = 2 + (var25.field_r + var25.field_C);
            var25.c("Skin", var2, -2 + (-var25.field_r + var3), 16777215, 0);
            this.a(var4, 1, var6, this.field_o, (byte) -64, var5, var2, var3);
            var3 = var3 + (var5 + var8 + 5);
            var25.c("Cloth", var2, var3 + (-var25.field_r - 2), 16777215, 0);
            this.a(var4, 2, var6, this.field_n, (byte) -105, var5, var2, var3);
            var3 = var3 + (5 + var5 + var8);
            var25.c("Skin", var2, -var25.field_r + (var3 + -2), 16777215, 0);
            this.a(var4, 3, var6, this.field_l, (byte) -93, var5, var2, var3);
            var3 = var3 + (5 + (var8 + var5));
            var25.c("Cloth", var2, -2 + (-var25.field_r + var3), 16777215, 0);
            this.a(var4, 4, var6, this.field_s, (byte) -96, var5, var2, var3);
            var9 = 0;
            var10 = 4;
            var11 = gg.field_b[var10];
            var12 = gg.field_l[var10];
            var13 = gg.field_j[var10];
            var14 = var12 + wf.field_m / var11 % var13;
            var26 = am.a(var14, this.field_o, var9, 1, this.field_n);
            og.h((byte) 110);
            var26.g(47, 57);
            var27 = am.a(var14, this.field_o, 1, 1, this.field_n);
            og.h((byte) 117);
            var27.g(17, 57);
            var28 = am.a(var14, this.field_l, var9, 1, this.field_s);
            og.h((byte) 118);
            var28.g(47, 139);
            var29 = am.a(var14, this.field_l, 1, 1, this.field_s);
            og.h((byte) 113);
            var29.g(17, 139);
            this.field_r.i(-31);
            return;
        }
        if (-61 <= (ka.field_t ^ -1)) {
            if ((kd.field_b ^ -1) == -2 && 30 < vb.field_f && 142 < ka.field_t && 90 > vb.field_f && ka.field_t < 194) {
                this.field_r.field_Ob = this.field_q != 3 ? this.field_l : this.field_s;
                this.field_q = this.field_q == 3 ? 4 : 3;
            }
            var2 = 100;
            var3 = 60;
            var4 = 20;
            var5 = 20;
            var6 = 2;
            var30 = qp.field_w;
            var8 = 2 + (var30.field_r + var30.field_C);
            var30.c("Skin", var2, -2 + (-var30.field_r + var3), 16777215, 0);
            this.a(var4, 1, var6, this.field_o, (byte) -64, var5, var2, var3);
            var3 = var3 + (var5 + var8 + 5);
            var30.c("Cloth", var2, var3 + (-var30.field_r - 2), 16777215, 0);
            this.a(var4, 2, var6, this.field_n, (byte) -105, var5, var2, var3);
            var3 = var3 + (5 + var5 + var8);
            var30.c("Skin", var2, -var30.field_r + (var3 + -2), 16777215, 0);
            this.a(var4, 3, var6, this.field_l, (byte) -93, var5, var2, var3);
            var3 = var3 + (5 + (var8 + var5));
            var30.c("Cloth", var2, -2 + (-var30.field_r + var3), 16777215, 0);
            this.a(var4, 4, var6, this.field_s, (byte) -96, var5, var2, var3);
            var9 = 0;
            var10 = 4;
            var11 = gg.field_b[var10];
            var12 = gg.field_l[var10];
            var13 = gg.field_j[var10];
            var14 = var12 + wf.field_m / var11 % var13;
            var31 = am.a(var14, this.field_o, var9, 1, this.field_n);
            og.h((byte) 110);
            var31.g(47, 57);
            var32 = am.a(var14, this.field_o, 1, 1, this.field_n);
            og.h((byte) 117);
            var32.g(17, 57);
            var33 = am.a(var14, this.field_l, var9, 1, this.field_s);
            og.h((byte) 118);
            var33.g(47, 139);
            var34 = am.a(var14, this.field_l, 1, 1, this.field_s);
            og.h((byte) 113);
            var34.g(17, 139);
            this.field_r.i(-31);
            return;
        }
        if ((vb.field_f ^ -1) <= -91) {
            if ((kd.field_b ^ -1) == -2 && 30 < vb.field_f && 142 < ka.field_t && 90 > vb.field_f && ka.field_t < 194) {
                this.field_r.field_Ob = this.field_q != 3 ? this.field_l : this.field_s;
                this.field_q = this.field_q == 3 ? 4 : 3;
            }
            var2 = 100;
            var3 = 60;
            var4 = 20;
            var5 = 20;
            var6 = 2;
            var35 = qp.field_w;
            var8 = 2 + (var35.field_r + var35.field_C);
            var35.c("Skin", var2, -2 + (-var35.field_r + var3), 16777215, 0);
            this.a(var4, 1, var6, this.field_o, (byte) -64, var5, var2, var3);
            var3 = var3 + (var5 + var8 + 5);
            var35.c("Cloth", var2, var3 + (-var35.field_r - 2), 16777215, 0);
            this.a(var4, 2, var6, this.field_n, (byte) -105, var5, var2, var3);
            var3 = var3 + (5 + var5 + var8);
            var35.c("Skin", var2, -var35.field_r + (var3 + -2), 16777215, 0);
            this.a(var4, 3, var6, this.field_l, (byte) -93, var5, var2, var3);
            var3 = var3 + (5 + (var8 + var5));
            var35.c("Cloth", var2, -2 + (-var35.field_r + var3), 16777215, 0);
            this.a(var4, 4, var6, this.field_s, (byte) -96, var5, var2, var3);
            var9 = 0;
            var10 = 4;
            var11 = gg.field_b[var10];
            var12 = gg.field_l[var10];
            var13 = gg.field_j[var10];
            var14 = var12 + wf.field_m / var11 % var13;
            var36 = am.a(var14, this.field_o, var9, 1, this.field_n);
            og.h((byte) 110);
            var36.g(47, 57);
            var37 = am.a(var14, this.field_o, 1, 1, this.field_n);
            og.h((byte) 117);
            var37.g(17, 57);
            var38 = am.a(var14, this.field_l, var9, 1, this.field_s);
            og.h((byte) 118);
            var38.g(47, 139);
            var39 = am.a(var14, this.field_l, 1, 1, this.field_s);
            og.h((byte) 113);
            var39.g(17, 139);
            this.field_r.i(-31);
            return;
        }
        if ((ka.field_t ^ -1) > -113) {
            this.field_r.field_Ob = (this.field_q ^ -1) != -2 ? this.field_o : this.field_n;
            this.field_q = -2 != (this.field_q ^ -1) ? 1 : 2;
        }
        if ((kd.field_b ^ -1) != -2) {
            var2 = 100;
            var3 = 60;
            var4 = 20;
            var5 = 20;
            var6 = 2;
            var40 = qp.field_w;
            var8 = 2 + (var40.field_r + var40.field_C);
            var40.c("Skin", var2, -2 + (-var40.field_r + var3), 16777215, 0);
            this.a(var4, 1, var6, this.field_o, (byte) -64, var5, var2, var3);
            var3 = var3 + (var5 + var8 + 5);
            var40.c("Cloth", var2, var3 + (-var40.field_r - 2), 16777215, 0);
            this.a(var4, 2, var6, this.field_n, (byte) -105, var5, var2, var3);
            var3 = var3 + (5 + var5 + var8);
            var40.c("Skin", var2, -var40.field_r + (var3 + -2), 16777215, 0);
            this.a(var4, 3, var6, this.field_l, (byte) -93, var5, var2, var3);
            var3 = var3 + (5 + (var8 + var5));
            var40.c("Cloth", var2, -2 + (-var40.field_r + var3), 16777215, 0);
            this.a(var4, 4, var6, this.field_s, (byte) -96, var5, var2, var3);
            var9 = 0;
            var10 = 4;
            var11 = gg.field_b[var10];
            var12 = gg.field_l[var10];
            var13 = gg.field_j[var10];
            var14 = var12 + wf.field_m / var11 % var13;
            var41 = am.a(var14, this.field_o, var9, 1, this.field_n);
            og.h((byte) 110);
            var41.g(47, 57);
            var42 = am.a(var14, this.field_o, 1, 1, this.field_n);
            og.h((byte) 117);
            var42.g(17, 57);
            var43 = am.a(var14, this.field_l, var9, 1, this.field_s);
            og.h((byte) 118);
            var43.g(47, 139);
            var44 = am.a(var14, this.field_l, 1, 1, this.field_s);
            og.h((byte) 113);
            var44.g(17, 139);
            this.field_r.i(-31);
            return;
        }
        if (30 >= vb.field_f) {
            var2 = 100;
            var3 = 60;
            var4 = 20;
            var5 = 20;
            var6 = 2;
            var45 = qp.field_w;
            var8 = 2 + (var45.field_r + var45.field_C);
            var45.c("Skin", var2, -2 + (-var45.field_r + var3), 16777215, 0);
            this.a(var4, 1, var6, this.field_o, (byte) -64, var5, var2, var3);
            var3 = var3 + (var5 + var8 + 5);
            var45.c("Cloth", var2, var3 + (-var45.field_r - 2), 16777215, 0);
            this.a(var4, 2, var6, this.field_n, (byte) -105, var5, var2, var3);
            var3 = var3 + (5 + var5 + var8);
            var45.c("Skin", var2, -var45.field_r + (var3 + -2), 16777215, 0);
            this.a(var4, 3, var6, this.field_l, (byte) -93, var5, var2, var3);
            var3 = var3 + (5 + (var8 + var5));
            var45.c("Cloth", var2, -2 + (-var45.field_r + var3), 16777215, 0);
            this.a(var4, 4, var6, this.field_s, (byte) -96, var5, var2, var3);
            var9 = 0;
            var10 = 4;
            var11 = gg.field_b[var10];
            var12 = gg.field_l[var10];
            var13 = gg.field_j[var10];
            var14 = var12 + wf.field_m / var11 % var13;
            var46 = am.a(var14, this.field_o, var9, 1, this.field_n);
            og.h((byte) 110);
            var46.g(47, 57);
            var47 = am.a(var14, this.field_o, 1, 1, this.field_n);
            og.h((byte) 117);
            var47.g(17, 57);
            var48 = am.a(var14, this.field_l, var9, 1, this.field_s);
            og.h((byte) 118);
            var48.g(47, 139);
            var49 = am.a(var14, this.field_l, 1, 1, this.field_s);
            og.h((byte) 113);
            var49.g(17, 139);
            this.field_r.i(-31);
            return;
        }
        if (142 >= ka.field_t) {
            var2 = 100;
            var3 = 60;
            var4 = 20;
            var5 = 20;
            var6 = 2;
            var50 = qp.field_w;
            var8 = 2 + (var50.field_r + var50.field_C);
            var50.c("Skin", var2, -2 + (-var50.field_r + var3), 16777215, 0);
            this.a(var4, 1, var6, this.field_o, (byte) -64, var5, var2, var3);
            var3 = var3 + (var5 + var8 + 5);
            var50.c("Cloth", var2, var3 + (-var50.field_r - 2), 16777215, 0);
            this.a(var4, 2, var6, this.field_n, (byte) -105, var5, var2, var3);
            var3 = var3 + (5 + var5 + var8);
            var50.c("Skin", var2, -var50.field_r + (var3 + -2), 16777215, 0);
            this.a(var4, 3, var6, this.field_l, (byte) -93, var5, var2, var3);
            var3 = var3 + (5 + (var8 + var5));
            var50.c("Cloth", var2, -2 + (-var50.field_r + var3), 16777215, 0);
            this.a(var4, 4, var6, this.field_s, (byte) -96, var5, var2, var3);
            var9 = 0;
            var10 = 4;
            var11 = gg.field_b[var10];
            var12 = gg.field_l[var10];
            var13 = gg.field_j[var10];
            var14 = var12 + wf.field_m / var11 % var13;
            var51 = am.a(var14, this.field_o, var9, 1, this.field_n);
            og.h((byte) 110);
            var51.g(47, 57);
            var52 = am.a(var14, this.field_o, 1, 1, this.field_n);
            og.h((byte) 117);
            var52.g(17, 57);
            var53 = am.a(var14, this.field_l, var9, 1, this.field_s);
            og.h((byte) 118);
            var53.g(47, 139);
            var54 = am.a(var14, this.field_l, 1, 1, this.field_s);
            og.h((byte) 113);
            var54.g(17, 139);
            this.field_r.i(-31);
            return;
        }
        if (90 <= vb.field_f) {
            var2 = 100;
            var3 = 60;
            var4 = 20;
            var5 = 20;
            var6 = 2;
            var55 = qp.field_w;
            var8 = 2 + (var55.field_r + var55.field_C);
            var55.c("Skin", var2, -2 + (-var55.field_r + var3), 16777215, 0);
            this.a(var4, 1, var6, this.field_o, (byte) -64, var5, var2, var3);
            var3 = var3 + (var5 + var8 + 5);
            var55.c("Cloth", var2, var3 + (-var55.field_r - 2), 16777215, 0);
            this.a(var4, 2, var6, this.field_n, (byte) -105, var5, var2, var3);
            var3 = var3 + (5 + var5 + var8);
            var55.c("Skin", var2, -var55.field_r + (var3 + -2), 16777215, 0);
            this.a(var4, 3, var6, this.field_l, (byte) -93, var5, var2, var3);
            var3 = var3 + (5 + (var8 + var5));
            var55.c("Cloth", var2, -2 + (-var55.field_r + var3), 16777215, 0);
            this.a(var4, 4, var6, this.field_s, (byte) -96, var5, var2, var3);
            var9 = 0;
            var10 = 4;
            var11 = gg.field_b[var10];
            var12 = gg.field_l[var10];
            var13 = gg.field_j[var10];
            var14 = var12 + wf.field_m / var11 % var13;
            var56 = am.a(var14, this.field_o, var9, 1, this.field_n);
            og.h((byte) 110);
            var56.g(47, 57);
            var57 = am.a(var14, this.field_o, 1, 1, this.field_n);
            og.h((byte) 117);
            var57.g(17, 57);
            var58 = am.a(var14, this.field_l, var9, 1, this.field_s);
            og.h((byte) 118);
            var58.g(47, 139);
            var59 = am.a(var14, this.field_l, 1, 1, this.field_s);
            og.h((byte) 113);
            var59.g(17, 139);
            this.field_r.i(-31);
            return;
        }
        if (ka.field_t < 194) {
            this.field_r.field_Ob = this.field_q != 3 ? this.field_l : this.field_s;
            this.field_q = this.field_q == 3 ? 4 : 3;
        }
        var2 = 100;
        var3 = 60;
        var4 = 20;
        var5 = 20;
        var6 = 2;
        ef var60 = qp.field_w;
        var8 = 2 + (var60.field_r + var60.field_C);
        var60.c("Skin", var2, -2 + (-var60.field_r + var3), 16777215, 0);
        this.a(var4, 1, var6, this.field_o, (byte) -64, var5, var2, var3);
        var3 = var3 + (var5 + var8 + 5);
        var60.c("Cloth", var2, var3 + (-var60.field_r - 2), 16777215, 0);
        this.a(var4, 2, var6, this.field_n, (byte) -105, var5, var2, var3);
        var3 = var3 + (5 + var5 + var8);
        var60.c("Skin", var2, -var60.field_r + (var3 + -2), 16777215, 0);
        this.a(var4, 3, var6, this.field_l, (byte) -93, var5, var2, var3);
        var3 = var3 + (5 + (var8 + var5));
        var60.c("Cloth", var2, -2 + (-var60.field_r + var3), 16777215, 0);
        this.a(var4, 4, var6, this.field_s, (byte) -96, var5, var2, var3);
        var9 = 0;
        var10 = 4;
        var11 = gg.field_b[var10];
        var12 = gg.field_l[var10];
        var13 = gg.field_j[var10];
        var14 = var12 + wf.field_m / var11 % var13;
        ja var61 = am.a(var14, this.field_o, var9, 1, this.field_n);
        og.h((byte) 110);
        var61.g(47, 57);
        ja var62 = am.a(var14, this.field_o, 1, 1, this.field_n);
        og.h((byte) 117);
        var62.g(17, 57);
        ja var63 = am.a(var14, this.field_l, var9, 1, this.field_s);
        og.h((byte) 118);
        var63.g(47, 139);
        ja var64 = am.a(var14, this.field_l, 1, 1, this.field_s);
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
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        super.a(0);
        this.field_r.j(1);
        if (param0 == 0) {
          L0: {
            var2 = this.field_q;
            if (1 != var2) {
              if (-3 == (var2 ^ -1)) {
                break L0;
              } else {
                if ((var2 ^ -1) == -4) {
                  this.field_l = this.field_r.field_Ob;
                  if (var3 != 0) {
                    this.field_s = this.field_r.field_Ob;
                    return;
                  } else {
                    return;
                  }
                } else {
                  if ((var2 ^ -1) != -5) {
                    return;
                  } else {
                    this.field_s = this.field_r.field_Ob;
                    return;
                  }
                }
              }
            } else {
              if (var3 == 0) {
                this.field_o = this.field_r.field_Ob;
                if (var3 != 0) {
                  break L0;
                } else {
                  return;
                }
              } else {
                if (-3 == (var2 ^ -1)) {
                  this.field_n = this.field_r.field_Ob;
                  if (var3 != 0) {
                    this.field_l = this.field_r.field_Ob;
                    if (var3 != 0) {
                      this.field_s = this.field_r.field_Ob;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  if ((var2 ^ -1) == -4) {
                    this.field_l = this.field_r.field_Ob;
                    if (var3 != 0) {
                      this.field_s = this.field_r.field_Ob;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if ((var2 ^ -1) != -5) {
                      return;
                    } else {
                      this.field_s = this.field_r.field_Ob;
                      return;
                    }
                  }
                }
              }
            }
          }
          this.field_n = this.field_r.field_Ob;
          if (var3 != 0) {
            this.field_l = this.field_r.field_Ob;
            this.field_s = this.field_r.field_Ob;
            return;
          } else {
            return;
          }
        } else {
          field_t = 9;
          var2 = this.field_q;
          if (1 == var2) {
            L1: {
              if (var3 == 0) {
                this.field_o = this.field_r.field_Ob;
                if (var3 != 0) {
                  break L1;
                } else {
                  return;
                }
              } else {
                if (-3 == (var2 ^ -1)) {
                  break L1;
                } else {
                  if ((var2 ^ -1) != -4) {
                    L2: {
                      if ((var2 ^ -1) == -5) {
                        this.field_s = this.field_r.field_Ob;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    return;
                  } else {
                    this.field_l = this.field_r.field_Ob;
                    this.field_s = this.field_r.field_Ob;
                    return;
                  }
                }
              }
            }
            this.field_n = this.field_r.field_Ob;
            if (var3 != 0) {
              this.field_l = this.field_r.field_Ob;
              if (var3 != 0) {
                this.field_s = this.field_r.field_Ob;
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            L3: {
              L4: {
                if (-3 == (var2 ^ -1)) {
                  this.field_n = this.field_r.field_Ob;
                  if (var3 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                } else {
                  if ((var2 ^ -1) == -4) {
                    break L4;
                  } else {
                    if ((var2 ^ -1) == -5) {
                      this.field_s = this.field_r.field_Ob;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              this.field_l = this.field_r.field_Ob;
              if (var3 == 0) {
                break L3;
              } else {
                this.field_s = this.field_r.field_Ob;
                break L3;
              }
            }
            return;
          }
        }
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
        if ((kd.field_b ^ -1) == -2) {
          if (vb.field_f > param6) {
            L0: {
              if (ka.field_t <= param7) {
                break L0;
              } else {
                if (vb.field_f >= param6 - -param0) {
                  break L0;
                } else {
                  if (param5 + param7 <= ka.field_t) {
                    break L0;
                  } else {
                    L1: {
                      this.field_r.field_Ob = param3;
                      this.field_q = param1;
                      if (this.field_q != param1) {
                        stackIn_42_0 = 6710886;
                        break L1;
                      } else {
                        stackIn_42_0 = 14540253;
                        break L1;
                      }
                    }
                    L2: {
                      var9 = stackIn_42_0;
                      if (bd.field_g <= param6) {
                        break L2;
                      } else {
                        if (param7 >= bo.field_d) {
                          break L2;
                        } else {
                          if (bd.field_g >= param0 + param6) {
                            break L2;
                          } else {
                            if (param7 + param5 <= bo.field_d) {
                              break L2;
                            } else {
                              L3: {
                                if (-1 > (1 & jf.field_e ^ -1)) {
                                  stackIn_49_0 = 16777215;
                                  break L3;
                                } else {
                                  stackIn_49_0 = 14540219;
                                  break L3;
                                }
                              }
                              var9 = stackIn_49_0;
                              break L2;
                            }
                          }
                        }
                      }
                    }
                    oo.e(param6, param7, param0, param5, var9);
                    oo.e(param6 - -param2, param7 - -param2, -(param2 * 2) + param0, param5 - param2 * 2, param3);
                    if (param4 > 0) {
                      vj.e(23);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
            L4: {
              if (this.field_q != param1) {
                stackIn_57_0 = 6710886;
                break L4;
              } else {
                stackIn_57_0 = 14540253;
                break L4;
              }
            }
            L5: {
              var9 = stackIn_57_0;
              if (bd.field_g <= param6) {
                break L5;
              } else {
                if (param7 >= bo.field_d) {
                  break L5;
                } else {
                  if (bd.field_g >= param0 + param6) {
                    break L5;
                  } else {
                    if (param7 + param5 <= bo.field_d) {
                      break L5;
                    } else {
                      L6: {
                        if (-1 > (1 & jf.field_e ^ -1)) {
                          stackIn_64_0 = 16777215;
                          break L6;
                        } else {
                          stackIn_64_0 = 14540219;
                          break L6;
                        }
                      }
                      var9 = stackIn_64_0;
                      break L5;
                    }
                  }
                }
              }
            }
            oo.e(param6, param7, param0, param5, var9);
            oo.e(param6 - -param2, param7 - -param2, -(param2 * 2) + param0, param5 - param2 * 2, param3);
            if (param4 > 0) {
              vj.e(23);
              return;
            } else {
              return;
            }
          } else {
            L7: {
              if (this.field_q != param1) {
                stackIn_20_0 = 6710886;
                break L7;
              } else {
                stackIn_20_0 = 14540253;
                break L7;
              }
            }
            var9 = stackIn_20_0;
            if (bd.field_g > param6) {
              L8: {
                if (param7 >= bo.field_d) {
                  break L8;
                } else {
                  if (bd.field_g >= param0 + param6) {
                    break L8;
                  } else {
                    if (param7 + param5 <= bo.field_d) {
                      break L8;
                    } else {
                      L9: {
                        if (-1 > (1 & jf.field_e ^ -1)) {
                          stackIn_31_0 = 16777215;
                          break L9;
                        } else {
                          stackIn_31_0 = 14540219;
                          break L9;
                        }
                      }
                      var9 = stackIn_31_0;
                      break L8;
                    }
                  }
                }
              }
              oo.e(param6, param7, param0, param5, var9);
              oo.e(param6 - -param2, param7 - -param2, -(param2 * 2) + param0, param5 - param2 * 2, param3);
              if (param4 > 0) {
                vj.e(23);
                return;
              } else {
                return;
              }
            } else {
              oo.e(param6, param7, param0, param5, var9);
              oo.e(param6 - -param2, param7 - -param2, -(param2 * 2) + param0, param5 - param2 * 2, param3);
              if (param4 > 0) {
                vj.e(23);
                return;
              } else {
                return;
              }
            }
          }
        } else {
          L10: {
            if (this.field_q != param1) {
              stackIn_4_0 = 6710886;
              break L10;
            } else {
              stackIn_4_0 = 14540253;
              break L10;
            }
          }
          L11: {
            var9 = stackIn_4_0;
            if (bd.field_g <= param6) {
              break L11;
            } else {
              if (param7 >= bo.field_d) {
                break L11;
              } else {
                if (bd.field_g >= param0 + param6) {
                  break L11;
                } else {
                  if (param7 + param5 <= bo.field_d) {
                    break L11;
                  } else {
                    L12: {
                      if (-1 > (1 & jf.field_e ^ -1)) {
                        stackIn_11_0 = 16777215;
                        break L12;
                      } else {
                        stackIn_11_0 = 14540219;
                        break L12;
                      }
                    }
                    var9 = stackIn_11_0;
                    break L11;
                  }
                }
              }
            }
          }
          oo.e(param6, param7, param0, param5, var9);
          oo.e(param6 - -param2, param7 - -param2, -(param2 * 2) + param0, param5 - param2 * 2, param3);
          if (param4 > 0) {
            vj.e(23);
            return;
          } else {
            return;
          }
        }
    }

    static {
        field_m = false;
        field_t = 360;
    }
}
