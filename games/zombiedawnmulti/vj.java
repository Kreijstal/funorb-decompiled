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
            ((vj) this).field_r = new vh(0L, (cj) null, 140, 60, 256, 120);
            ((vj) this).field_q = 0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "vj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(byte param0) {
        rp var3 = ll.field_k;
        rp var2 = var3;
        var3.field_c[0] = ((vj) this).field_o;
        var3.field_p[0] = ((vj) this).field_n;
        var3.field_c[1] = ((vj) this).field_l;
        var3.field_p[1] = ((vj) this).field_s;
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
        int var2 = 0;
        if (!((7 & param1) == 0)) {
            var2 = -(param1 & 7) + 8;
        }
        int var3 = param1 - -var2;
        return var3;
    }

    final void a(boolean param0) {
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
        ef var60 = null;
        ja var61 = null;
        ja var62 = null;
        ja var63 = null;
        ja var64 = null;
        vh stackIn_7_0 = null;
        vh stackIn_8_0 = null;
        vh stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        vh stackIn_21_0 = null;
        vh stackIn_22_0 = null;
        vh stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        vh stackIn_35_0 = null;
        vh stackIn_36_0 = null;
        vh stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        Object stackIn_38_0 = null;
        Object stackIn_39_0 = null;
        Object stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        vh stackIn_49_0 = null;
        vh stackIn_50_0 = null;
        vh stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        Object stackIn_52_0 = null;
        Object stackIn_53_0 = null;
        Object stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        vh stackIn_58_0 = null;
        vh stackIn_59_0 = null;
        vh stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        Object stackIn_61_0 = null;
        Object stackIn_62_0 = null;
        Object stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        vh stackIn_74_0 = null;
        vh stackIn_75_0 = null;
        vh stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        Object stackIn_77_0 = null;
        Object stackIn_78_0 = null;
        Object stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        vh stackOut_57_0 = null;
        vh stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        vh stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        Object stackOut_60_0 = null;
        Object stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        Object stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        vh stackOut_73_0 = null;
        vh stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        vh stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        Object stackOut_76_0 = null;
        Object stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        Object stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        vh stackOut_48_0 = null;
        vh stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        vh stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        Object stackOut_51_0 = null;
        Object stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        Object stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        vh stackOut_34_0 = null;
        vh stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        vh stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        Object stackOut_37_0 = null;
        Object stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        vh stackOut_20_0 = null;
        vh stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        vh stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        Object stackOut_23_0 = null;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        vh stackOut_6_0 = null;
        vh stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        vh stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_9_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        oo.b();
        ((vj) this).b(0);
        super.a(param0);
        oo.a(30, 60, 60, 52, 3381555);
        oo.f(32, 62, 56, 48, 8947814, 128);
        oo.a(30, 142, 60, 52, 3381555);
        oo.f(32, 144, 56, 48, 8947814, 128);
        if (kd.field_b == 1) {
          if (vb.field_f > 30) {
            if (ka.field_t > 60) {
              if (vb.field_f < 90) {
                L0: {
                  if (ka.field_t >= 112) {
                    break L0;
                  } else {
                    L1: {
                      stackOut_57_0 = ((vj) this).field_r;
                      stackIn_59_0 = stackOut_57_0;
                      stackIn_58_0 = stackOut_57_0;
                      if (((vj) this).field_q == 1) {
                        stackOut_59_0 = (vh) (Object) stackIn_59_0;
                        stackOut_59_1 = ((vj) this).field_n;
                        stackIn_60_0 = stackOut_59_0;
                        stackIn_60_1 = stackOut_59_1;
                        break L1;
                      } else {
                        stackOut_58_0 = (vh) (Object) stackIn_58_0;
                        stackOut_58_1 = ((vj) this).field_o;
                        stackIn_60_0 = stackOut_58_0;
                        stackIn_60_1 = stackOut_58_1;
                        break L1;
                      }
                    }
                    L2: {
                      stackIn_60_0.field_Ob = stackIn_60_1;
                      stackOut_60_0 = this;
                      stackIn_62_0 = stackOut_60_0;
                      stackIn_61_0 = stackOut_60_0;
                      if (((vj) this).field_q == 1) {
                        stackOut_62_0 = this;
                        stackOut_62_1 = 2;
                        stackIn_63_0 = stackOut_62_0;
                        stackIn_63_1 = stackOut_62_1;
                        break L2;
                      } else {
                        stackOut_61_0 = this;
                        stackOut_61_1 = 1;
                        stackIn_63_0 = stackOut_61_0;
                        stackIn_63_1 = stackOut_61_1;
                        break L2;
                      }
                    }
                    ((vj) this).field_q = stackIn_63_1;
                    break L0;
                  }
                }
                if (kd.field_b == 1) {
                  if (30 < vb.field_f) {
                    if (142 < ka.field_t) {
                      if (90 > vb.field_f) {
                        L3: {
                          if (ka.field_t >= 194) {
                            break L3;
                          } else {
                            L4: {
                              stackOut_73_0 = ((vj) this).field_r;
                              stackIn_75_0 = stackOut_73_0;
                              stackIn_74_0 = stackOut_73_0;
                              if (((vj) this).field_q == 3) {
                                stackOut_75_0 = (vh) (Object) stackIn_75_0;
                                stackOut_75_1 = ((vj) this).field_s;
                                stackIn_76_0 = stackOut_75_0;
                                stackIn_76_1 = stackOut_75_1;
                                break L4;
                              } else {
                                stackOut_74_0 = (vh) (Object) stackIn_74_0;
                                stackOut_74_1 = ((vj) this).field_l;
                                stackIn_76_0 = stackOut_74_0;
                                stackIn_76_1 = stackOut_74_1;
                                break L4;
                              }
                            }
                            L5: {
                              stackIn_76_0.field_Ob = stackIn_76_1;
                              stackOut_76_0 = this;
                              stackIn_78_0 = stackOut_76_0;
                              stackIn_77_0 = stackOut_76_0;
                              if (((vj) this).field_q != 3) {
                                stackOut_78_0 = this;
                                stackOut_78_1 = 3;
                                stackIn_79_0 = stackOut_78_0;
                                stackIn_79_1 = stackOut_78_1;
                                break L5;
                              } else {
                                stackOut_77_0 = this;
                                stackOut_77_1 = 4;
                                stackIn_79_0 = stackOut_77_0;
                                stackIn_79_1 = stackOut_77_1;
                                break L5;
                              }
                            }
                            ((vj) this).field_q = stackIn_79_1;
                            break L3;
                          }
                        }
                        var2 = 100;
                        var3 = 60;
                        var4 = 20;
                        var5 = 20;
                        var6 = 2;
                        var60 = qp.field_w;
                        var8 = 2 + (var60.field_r + var60.field_C);
                        var60.c("Skin", var2, -2 + (-var60.field_r + var3), 16777215, 0);
                        this.a(var4, 1, var6, ((vj) this).field_o, (byte) -64, var5, var2, var3);
                        var3 = var3 + (var5 + var8 + 5);
                        var60.c("Cloth", var2, var3 + (-var60.field_r - 2), 16777215, 0);
                        this.a(var4, 2, var6, ((vj) this).field_n, (byte) -105, var5, var2, var3);
                        var3 = var3 + (5 + var5 + var8);
                        var60.c("Skin", var2, -var60.field_r + (var3 + -2), 16777215, 0);
                        this.a(var4, 3, var6, ((vj) this).field_l, (byte) -93, var5, var2, var3);
                        var3 = var3 + (5 + (var8 + var5));
                        var60.c("Cloth", var2, -2 + (-var60.field_r + var3), 16777215, 0);
                        this.a(var4, 4, var6, ((vj) this).field_s, (byte) -96, var5, var2, var3);
                        var9 = 0;
                        var10 = 4;
                        var11 = gg.field_b[var10];
                        var12 = gg.field_l[var10];
                        var13 = gg.field_j[var10];
                        var14 = var12 + wf.field_m / var11 % var13;
                        var61 = am.a(var14, ((vj) this).field_o, var9, 1, ((vj) this).field_n);
                        og.h((byte) 110);
                        var61.g(47, 57);
                        var62 = am.a(var14, ((vj) this).field_o, 1, 1, ((vj) this).field_n);
                        og.h((byte) 117);
                        var62.g(17, 57);
                        var63 = am.a(var14, ((vj) this).field_l, var9, 1, ((vj) this).field_s);
                        og.h((byte) 118);
                        var63.g(47, 139);
                        var64 = am.a(var14, ((vj) this).field_l, 1, 1, ((vj) this).field_s);
                        og.h((byte) 113);
                        var64.g(17, 139);
                        ((vj) this).field_r.i(-31);
                        return;
                      } else {
                        var2 = 100;
                        var3 = 60;
                        var4 = 20;
                        var5 = 20;
                        var6 = 2;
                        var55 = qp.field_w;
                        var8 = 2 + (var55.field_r + var55.field_C);
                        var55.c("Skin", var2, -2 + (-var55.field_r + var3), 16777215, 0);
                        this.a(var4, 1, var6, ((vj) this).field_o, (byte) -64, var5, var2, var3);
                        var3 = var3 + (var5 + var8 + 5);
                        var55.c("Cloth", var2, var3 + (-var55.field_r - 2), 16777215, 0);
                        this.a(var4, 2, var6, ((vj) this).field_n, (byte) -105, var5, var2, var3);
                        var3 = var3 + (5 + var5 + var8);
                        var55.c("Skin", var2, -var55.field_r + (var3 + -2), 16777215, 0);
                        this.a(var4, 3, var6, ((vj) this).field_l, (byte) -93, var5, var2, var3);
                        var3 = var3 + (5 + (var8 + var5));
                        var55.c("Cloth", var2, -2 + (-var55.field_r + var3), 16777215, 0);
                        this.a(var4, 4, var6, ((vj) this).field_s, (byte) -96, var5, var2, var3);
                        var9 = 0;
                        var10 = 4;
                        var11 = gg.field_b[var10];
                        var12 = gg.field_l[var10];
                        var13 = gg.field_j[var10];
                        var14 = var12 + wf.field_m / var11 % var13;
                        var56 = am.a(var14, ((vj) this).field_o, var9, 1, ((vj) this).field_n);
                        og.h((byte) 110);
                        var56.g(47, 57);
                        var57 = am.a(var14, ((vj) this).field_o, 1, 1, ((vj) this).field_n);
                        og.h((byte) 117);
                        var57.g(17, 57);
                        var58 = am.a(var14, ((vj) this).field_l, var9, 1, ((vj) this).field_s);
                        og.h((byte) 118);
                        var58.g(47, 139);
                        var59 = am.a(var14, ((vj) this).field_l, 1, 1, ((vj) this).field_s);
                        og.h((byte) 113);
                        var59.g(17, 139);
                        ((vj) this).field_r.i(-31);
                        return;
                      }
                    } else {
                      var2 = 100;
                      var3 = 60;
                      var4 = 20;
                      var5 = 20;
                      var6 = 2;
                      var50 = qp.field_w;
                      var8 = 2 + (var50.field_r + var50.field_C);
                      var50.c("Skin", var2, -2 + (-var50.field_r + var3), 16777215, 0);
                      this.a(var4, 1, var6, ((vj) this).field_o, (byte) -64, var5, var2, var3);
                      var3 = var3 + (var5 + var8 + 5);
                      var50.c("Cloth", var2, var3 + (-var50.field_r - 2), 16777215, 0);
                      this.a(var4, 2, var6, ((vj) this).field_n, (byte) -105, var5, var2, var3);
                      var3 = var3 + (5 + var5 + var8);
                      var50.c("Skin", var2, -var50.field_r + (var3 + -2), 16777215, 0);
                      this.a(var4, 3, var6, ((vj) this).field_l, (byte) -93, var5, var2, var3);
                      var3 = var3 + (5 + (var8 + var5));
                      var50.c("Cloth", var2, -2 + (-var50.field_r + var3), 16777215, 0);
                      this.a(var4, 4, var6, ((vj) this).field_s, (byte) -96, var5, var2, var3);
                      var9 = 0;
                      var10 = 4;
                      var11 = gg.field_b[var10];
                      var12 = gg.field_l[var10];
                      var13 = gg.field_j[var10];
                      var14 = var12 + wf.field_m / var11 % var13;
                      var51 = am.a(var14, ((vj) this).field_o, var9, 1, ((vj) this).field_n);
                      og.h((byte) 110);
                      var51.g(47, 57);
                      var52 = am.a(var14, ((vj) this).field_o, 1, 1, ((vj) this).field_n);
                      og.h((byte) 117);
                      var52.g(17, 57);
                      var53 = am.a(var14, ((vj) this).field_l, var9, 1, ((vj) this).field_s);
                      og.h((byte) 118);
                      var53.g(47, 139);
                      var54 = am.a(var14, ((vj) this).field_l, 1, 1, ((vj) this).field_s);
                      og.h((byte) 113);
                      var54.g(17, 139);
                      ((vj) this).field_r.i(-31);
                      return;
                    }
                  } else {
                    var2 = 100;
                    var3 = 60;
                    var4 = 20;
                    var5 = 20;
                    var6 = 2;
                    var45 = qp.field_w;
                    var8 = 2 + (var45.field_r + var45.field_C);
                    var45.c("Skin", var2, -2 + (-var45.field_r + var3), 16777215, 0);
                    this.a(var4, 1, var6, ((vj) this).field_o, (byte) -64, var5, var2, var3);
                    var3 = var3 + (var5 + var8 + 5);
                    var45.c("Cloth", var2, var3 + (-var45.field_r - 2), 16777215, 0);
                    this.a(var4, 2, var6, ((vj) this).field_n, (byte) -105, var5, var2, var3);
                    var3 = var3 + (5 + var5 + var8);
                    var45.c("Skin", var2, -var45.field_r + (var3 + -2), 16777215, 0);
                    this.a(var4, 3, var6, ((vj) this).field_l, (byte) -93, var5, var2, var3);
                    var3 = var3 + (5 + (var8 + var5));
                    var45.c("Cloth", var2, -2 + (-var45.field_r + var3), 16777215, 0);
                    this.a(var4, 4, var6, ((vj) this).field_s, (byte) -96, var5, var2, var3);
                    var9 = 0;
                    var10 = 4;
                    var11 = gg.field_b[var10];
                    var12 = gg.field_l[var10];
                    var13 = gg.field_j[var10];
                    var14 = var12 + wf.field_m / var11 % var13;
                    var46 = am.a(var14, ((vj) this).field_o, var9, 1, ((vj) this).field_n);
                    og.h((byte) 110);
                    var46.g(47, 57);
                    var47 = am.a(var14, ((vj) this).field_o, 1, 1, ((vj) this).field_n);
                    og.h((byte) 117);
                    var47.g(17, 57);
                    var48 = am.a(var14, ((vj) this).field_l, var9, 1, ((vj) this).field_s);
                    og.h((byte) 118);
                    var48.g(47, 139);
                    var49 = am.a(var14, ((vj) this).field_l, 1, 1, ((vj) this).field_s);
                    og.h((byte) 113);
                    var49.g(17, 139);
                    ((vj) this).field_r.i(-31);
                    return;
                  }
                } else {
                  var2 = 100;
                  var3 = 60;
                  var4 = 20;
                  var5 = 20;
                  var6 = 2;
                  var40 = qp.field_w;
                  var8 = 2 + (var40.field_r + var40.field_C);
                  var40.c("Skin", var2, -2 + (-var40.field_r + var3), 16777215, 0);
                  this.a(var4, 1, var6, ((vj) this).field_o, (byte) -64, var5, var2, var3);
                  var3 = var3 + (var5 + var8 + 5);
                  var40.c("Cloth", var2, var3 + (-var40.field_r - 2), 16777215, 0);
                  this.a(var4, 2, var6, ((vj) this).field_n, (byte) -105, var5, var2, var3);
                  var3 = var3 + (5 + var5 + var8);
                  var40.c("Skin", var2, -var40.field_r + (var3 + -2), 16777215, 0);
                  this.a(var4, 3, var6, ((vj) this).field_l, (byte) -93, var5, var2, var3);
                  var3 = var3 + (5 + (var8 + var5));
                  var40.c("Cloth", var2, -2 + (-var40.field_r + var3), 16777215, 0);
                  this.a(var4, 4, var6, ((vj) this).field_s, (byte) -96, var5, var2, var3);
                  var9 = 0;
                  var10 = 4;
                  var11 = gg.field_b[var10];
                  var12 = gg.field_l[var10];
                  var13 = gg.field_j[var10];
                  var14 = var12 + wf.field_m / var11 % var13;
                  var41 = am.a(var14, ((vj) this).field_o, var9, 1, ((vj) this).field_n);
                  og.h((byte) 110);
                  var41.g(47, 57);
                  var42 = am.a(var14, ((vj) this).field_o, 1, 1, ((vj) this).field_n);
                  og.h((byte) 117);
                  var42.g(17, 57);
                  var43 = am.a(var14, ((vj) this).field_l, var9, 1, ((vj) this).field_s);
                  og.h((byte) 118);
                  var43.g(47, 139);
                  var44 = am.a(var14, ((vj) this).field_l, 1, 1, ((vj) this).field_s);
                  og.h((byte) 113);
                  var44.g(17, 139);
                  ((vj) this).field_r.i(-31);
                  return;
                }
              } else {
                L6: {
                  if (kd.field_b != 1) {
                    break L6;
                  } else {
                    if (30 >= vb.field_f) {
                      break L6;
                    } else {
                      if (142 >= ka.field_t) {
                        break L6;
                      } else {
                        if (90 <= vb.field_f) {
                          break L6;
                        } else {
                          if (ka.field_t >= 194) {
                            break L6;
                          } else {
                            L7: {
                              stackOut_48_0 = ((vj) this).field_r;
                              stackIn_50_0 = stackOut_48_0;
                              stackIn_49_0 = stackOut_48_0;
                              if (((vj) this).field_q == 3) {
                                stackOut_50_0 = (vh) (Object) stackIn_50_0;
                                stackOut_50_1 = ((vj) this).field_s;
                                stackIn_51_0 = stackOut_50_0;
                                stackIn_51_1 = stackOut_50_1;
                                break L7;
                              } else {
                                stackOut_49_0 = (vh) (Object) stackIn_49_0;
                                stackOut_49_1 = ((vj) this).field_l;
                                stackIn_51_0 = stackOut_49_0;
                                stackIn_51_1 = stackOut_49_1;
                                break L7;
                              }
                            }
                            L8: {
                              stackIn_51_0.field_Ob = stackIn_51_1;
                              stackOut_51_0 = this;
                              stackIn_53_0 = stackOut_51_0;
                              stackIn_52_0 = stackOut_51_0;
                              if (((vj) this).field_q != 3) {
                                stackOut_53_0 = this;
                                stackOut_53_1 = 3;
                                stackIn_54_0 = stackOut_53_0;
                                stackIn_54_1 = stackOut_53_1;
                                break L8;
                              } else {
                                stackOut_52_0 = this;
                                stackOut_52_1 = 4;
                                stackIn_54_0 = stackOut_52_0;
                                stackIn_54_1 = stackOut_52_1;
                                break L8;
                              }
                            }
                            ((vj) this).field_q = stackIn_54_1;
                            break L6;
                          }
                        }
                      }
                    }
                  }
                }
                var2 = 100;
                var3 = 60;
                var4 = 20;
                var5 = 20;
                var6 = 2;
                var35 = qp.field_w;
                var8 = 2 + (var35.field_r + var35.field_C);
                var35.c("Skin", var2, -2 + (-var35.field_r + var3), 16777215, 0);
                this.a(var4, 1, var6, ((vj) this).field_o, (byte) -64, var5, var2, var3);
                var3 = var3 + (var5 + var8 + 5);
                var35.c("Cloth", var2, var3 + (-var35.field_r - 2), 16777215, 0);
                this.a(var4, 2, var6, ((vj) this).field_n, (byte) -105, var5, var2, var3);
                var3 = var3 + (5 + var5 + var8);
                var35.c("Skin", var2, -var35.field_r + (var3 + -2), 16777215, 0);
                this.a(var4, 3, var6, ((vj) this).field_l, (byte) -93, var5, var2, var3);
                var3 = var3 + (5 + (var8 + var5));
                var35.c("Cloth", var2, -2 + (-var35.field_r + var3), 16777215, 0);
                this.a(var4, 4, var6, ((vj) this).field_s, (byte) -96, var5, var2, var3);
                var9 = 0;
                var10 = 4;
                var11 = gg.field_b[var10];
                var12 = gg.field_l[var10];
                var13 = gg.field_j[var10];
                var14 = var12 + wf.field_m / var11 % var13;
                var36 = am.a(var14, ((vj) this).field_o, var9, 1, ((vj) this).field_n);
                og.h((byte) 110);
                var36.g(47, 57);
                var37 = am.a(var14, ((vj) this).field_o, 1, 1, ((vj) this).field_n);
                og.h((byte) 117);
                var37.g(17, 57);
                var38 = am.a(var14, ((vj) this).field_l, var9, 1, ((vj) this).field_s);
                og.h((byte) 118);
                var38.g(47, 139);
                var39 = am.a(var14, ((vj) this).field_l, 1, 1, ((vj) this).field_s);
                og.h((byte) 113);
                var39.g(17, 139);
                ((vj) this).field_r.i(-31);
                return;
              }
            } else {
              L9: {
                if (kd.field_b != 1) {
                  break L9;
                } else {
                  if (30 >= vb.field_f) {
                    break L9;
                  } else {
                    if (142 >= ka.field_t) {
                      break L9;
                    } else {
                      if (90 <= vb.field_f) {
                        break L9;
                      } else {
                        if (ka.field_t >= 194) {
                          break L9;
                        } else {
                          L10: {
                            stackOut_34_0 = ((vj) this).field_r;
                            stackIn_36_0 = stackOut_34_0;
                            stackIn_35_0 = stackOut_34_0;
                            if (((vj) this).field_q == 3) {
                              stackOut_36_0 = (vh) (Object) stackIn_36_0;
                              stackOut_36_1 = ((vj) this).field_s;
                              stackIn_37_0 = stackOut_36_0;
                              stackIn_37_1 = stackOut_36_1;
                              break L10;
                            } else {
                              stackOut_35_0 = (vh) (Object) stackIn_35_0;
                              stackOut_35_1 = ((vj) this).field_l;
                              stackIn_37_0 = stackOut_35_0;
                              stackIn_37_1 = stackOut_35_1;
                              break L10;
                            }
                          }
                          L11: {
                            stackIn_37_0.field_Ob = stackIn_37_1;
                            stackOut_37_0 = this;
                            stackIn_39_0 = stackOut_37_0;
                            stackIn_38_0 = stackOut_37_0;
                            if (((vj) this).field_q != 3) {
                              stackOut_39_0 = this;
                              stackOut_39_1 = 3;
                              stackIn_40_0 = stackOut_39_0;
                              stackIn_40_1 = stackOut_39_1;
                              break L11;
                            } else {
                              stackOut_38_0 = this;
                              stackOut_38_1 = 4;
                              stackIn_40_0 = stackOut_38_0;
                              stackIn_40_1 = stackOut_38_1;
                              break L11;
                            }
                          }
                          ((vj) this).field_q = stackIn_40_1;
                          break L9;
                        }
                      }
                    }
                  }
                }
              }
              var2 = 100;
              var3 = 60;
              var4 = 20;
              var5 = 20;
              var6 = 2;
              var30 = qp.field_w;
              var8 = 2 + (var30.field_r + var30.field_C);
              var30.c("Skin", var2, -2 + (-var30.field_r + var3), 16777215, 0);
              this.a(var4, 1, var6, ((vj) this).field_o, (byte) -64, var5, var2, var3);
              var3 = var3 + (var5 + var8 + 5);
              var30.c("Cloth", var2, var3 + (-var30.field_r - 2), 16777215, 0);
              this.a(var4, 2, var6, ((vj) this).field_n, (byte) -105, var5, var2, var3);
              var3 = var3 + (5 + var5 + var8);
              var30.c("Skin", var2, -var30.field_r + (var3 + -2), 16777215, 0);
              this.a(var4, 3, var6, ((vj) this).field_l, (byte) -93, var5, var2, var3);
              var3 = var3 + (5 + (var8 + var5));
              var30.c("Cloth", var2, -2 + (-var30.field_r + var3), 16777215, 0);
              this.a(var4, 4, var6, ((vj) this).field_s, (byte) -96, var5, var2, var3);
              var9 = 0;
              var10 = 4;
              var11 = gg.field_b[var10];
              var12 = gg.field_l[var10];
              var13 = gg.field_j[var10];
              var14 = var12 + wf.field_m / var11 % var13;
              var31 = am.a(var14, ((vj) this).field_o, var9, 1, ((vj) this).field_n);
              og.h((byte) 110);
              var31.g(47, 57);
              var32 = am.a(var14, ((vj) this).field_o, 1, 1, ((vj) this).field_n);
              og.h((byte) 117);
              var32.g(17, 57);
              var33 = am.a(var14, ((vj) this).field_l, var9, 1, ((vj) this).field_s);
              og.h((byte) 118);
              var33.g(47, 139);
              var34 = am.a(var14, ((vj) this).field_l, 1, 1, ((vj) this).field_s);
              og.h((byte) 113);
              var34.g(17, 139);
              ((vj) this).field_r.i(-31);
              return;
            }
          } else {
            L12: {
              if (kd.field_b != 1) {
                break L12;
              } else {
                if (30 >= vb.field_f) {
                  break L12;
                } else {
                  if (142 >= ka.field_t) {
                    break L12;
                  } else {
                    if (90 <= vb.field_f) {
                      break L12;
                    } else {
                      if (ka.field_t >= 194) {
                        break L12;
                      } else {
                        L13: {
                          stackOut_20_0 = ((vj) this).field_r;
                          stackIn_22_0 = stackOut_20_0;
                          stackIn_21_0 = stackOut_20_0;
                          if (((vj) this).field_q == 3) {
                            stackOut_22_0 = (vh) (Object) stackIn_22_0;
                            stackOut_22_1 = ((vj) this).field_s;
                            stackIn_23_0 = stackOut_22_0;
                            stackIn_23_1 = stackOut_22_1;
                            break L13;
                          } else {
                            stackOut_21_0 = (vh) (Object) stackIn_21_0;
                            stackOut_21_1 = ((vj) this).field_l;
                            stackIn_23_0 = stackOut_21_0;
                            stackIn_23_1 = stackOut_21_1;
                            break L13;
                          }
                        }
                        L14: {
                          stackIn_23_0.field_Ob = stackIn_23_1;
                          stackOut_23_0 = this;
                          stackIn_25_0 = stackOut_23_0;
                          stackIn_24_0 = stackOut_23_0;
                          if (((vj) this).field_q != 3) {
                            stackOut_25_0 = this;
                            stackOut_25_1 = 3;
                            stackIn_26_0 = stackOut_25_0;
                            stackIn_26_1 = stackOut_25_1;
                            break L14;
                          } else {
                            stackOut_24_0 = this;
                            stackOut_24_1 = 4;
                            stackIn_26_0 = stackOut_24_0;
                            stackIn_26_1 = stackOut_24_1;
                            break L14;
                          }
                        }
                        ((vj) this).field_q = stackIn_26_1;
                        break L12;
                      }
                    }
                  }
                }
              }
            }
            var2 = 100;
            var3 = 60;
            var4 = 20;
            var5 = 20;
            var6 = 2;
            var25 = qp.field_w;
            var8 = 2 + (var25.field_r + var25.field_C);
            var25.c("Skin", var2, -2 + (-var25.field_r + var3), 16777215, 0);
            this.a(var4, 1, var6, ((vj) this).field_o, (byte) -64, var5, var2, var3);
            var3 = var3 + (var5 + var8 + 5);
            var25.c("Cloth", var2, var3 + (-var25.field_r - 2), 16777215, 0);
            this.a(var4, 2, var6, ((vj) this).field_n, (byte) -105, var5, var2, var3);
            var3 = var3 + (5 + var5 + var8);
            var25.c("Skin", var2, -var25.field_r + (var3 + -2), 16777215, 0);
            this.a(var4, 3, var6, ((vj) this).field_l, (byte) -93, var5, var2, var3);
            var3 = var3 + (5 + (var8 + var5));
            var25.c("Cloth", var2, -2 + (-var25.field_r + var3), 16777215, 0);
            this.a(var4, 4, var6, ((vj) this).field_s, (byte) -96, var5, var2, var3);
            var9 = 0;
            var10 = 4;
            var11 = gg.field_b[var10];
            var12 = gg.field_l[var10];
            var13 = gg.field_j[var10];
            var14 = var12 + wf.field_m / var11 % var13;
            var26 = am.a(var14, ((vj) this).field_o, var9, 1, ((vj) this).field_n);
            og.h((byte) 110);
            var26.g(47, 57);
            var27 = am.a(var14, ((vj) this).field_o, 1, 1, ((vj) this).field_n);
            og.h((byte) 117);
            var27.g(17, 57);
            var28 = am.a(var14, ((vj) this).field_l, var9, 1, ((vj) this).field_s);
            og.h((byte) 118);
            var28.g(47, 139);
            var29 = am.a(var14, ((vj) this).field_l, 1, 1, ((vj) this).field_s);
            og.h((byte) 113);
            var29.g(17, 139);
            ((vj) this).field_r.i(-31);
            return;
          }
        } else {
          L15: {
            if (kd.field_b != 1) {
              break L15;
            } else {
              if (30 >= vb.field_f) {
                break L15;
              } else {
                if (142 >= ka.field_t) {
                  break L15;
                } else {
                  if (90 <= vb.field_f) {
                    break L15;
                  } else {
                    if (ka.field_t >= 194) {
                      break L15;
                    } else {
                      L16: {
                        stackOut_6_0 = ((vj) this).field_r;
                        stackIn_8_0 = stackOut_6_0;
                        stackIn_7_0 = stackOut_6_0;
                        if (((vj) this).field_q == 3) {
                          stackOut_8_0 = (vh) (Object) stackIn_8_0;
                          stackOut_8_1 = ((vj) this).field_s;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          break L16;
                        } else {
                          stackOut_7_0 = (vh) (Object) stackIn_7_0;
                          stackOut_7_1 = ((vj) this).field_l;
                          stackIn_9_0 = stackOut_7_0;
                          stackIn_9_1 = stackOut_7_1;
                          break L16;
                        }
                      }
                      L17: {
                        stackIn_9_0.field_Ob = stackIn_9_1;
                        stackOut_9_0 = this;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        if (((vj) this).field_q != 3) {
                          stackOut_11_0 = this;
                          stackOut_11_1 = 3;
                          stackIn_12_0 = stackOut_11_0;
                          stackIn_12_1 = stackOut_11_1;
                          break L17;
                        } else {
                          stackOut_10_0 = this;
                          stackOut_10_1 = 4;
                          stackIn_12_0 = stackOut_10_0;
                          stackIn_12_1 = stackOut_10_1;
                          break L17;
                        }
                      }
                      ((vj) this).field_q = stackIn_12_1;
                      break L15;
                    }
                  }
                }
              }
            }
          }
          var2 = 100;
          var3 = 60;
          var4 = 20;
          var5 = 20;
          var6 = 2;
          var20 = qp.field_w;
          var8 = 2 + (var20.field_r + var20.field_C);
          var20.c("Skin", var2, -2 + (-var20.field_r + var3), 16777215, 0);
          this.a(var4, 1, var6, ((vj) this).field_o, (byte) -64, var5, var2, var3);
          var3 = var3 + (var5 + var8 + 5);
          var20.c("Cloth", var2, var3 + (-var20.field_r - 2), 16777215, 0);
          this.a(var4, 2, var6, ((vj) this).field_n, (byte) -105, var5, var2, var3);
          var3 = var3 + (5 + var5 + var8);
          var20.c("Skin", var2, -var20.field_r + (var3 + -2), 16777215, 0);
          this.a(var4, 3, var6, ((vj) this).field_l, (byte) -93, var5, var2, var3);
          var3 = var3 + (5 + (var8 + var5));
          var20.c("Cloth", var2, -2 + (-var20.field_r + var3), 16777215, 0);
          this.a(var4, 4, var6, ((vj) this).field_s, (byte) -96, var5, var2, var3);
          var9 = 0;
          var10 = 4;
          var11 = gg.field_b[var10];
          var12 = gg.field_l[var10];
          var13 = gg.field_j[var10];
          var14 = var12 + wf.field_m / var11 % var13;
          var21 = am.a(var14, ((vj) this).field_o, var9, 1, ((vj) this).field_n);
          og.h((byte) 110);
          var21.g(47, 57);
          var22 = am.a(var14, ((vj) this).field_o, 1, 1, ((vj) this).field_n);
          og.h((byte) 117);
          var22.g(17, 57);
          var23 = am.a(var14, ((vj) this).field_l, var9, 1, ((vj) this).field_s);
          og.h((byte) 118);
          var23.g(47, 139);
          var24 = am.a(var14, ((vj) this).field_l, 1, 1, ((vj) this).field_s);
          og.h((byte) 113);
          var24.g(17, 139);
          ((vj) this).field_r.i(-31);
          return;
        }
    }

    final void a(int param0, boolean param1, int param2) {
        super.a(0, param1, param2);
        rp var5 = ll.field_k;
        rp var4 = var5;
        ((vj) this).field_n = var5.field_p[param0];
        ((vj) this).field_s = var5.field_p[1];
        ((vj) this).field_o = var5.field_c[0];
        ((vj) this).field_l = var5.field_c[1];
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        super.a(0);
        ((vj) this).field_r.j(1);
        if (param0 == 0) {
          var2 = ((vj) this).field_q;
          if (1 != var2) {
            if (var2 != 2) {
              if (var2 != 3) {
                if (var2 != 4) {
                  return;
                } else {
                  ((vj) this).field_s = ((vj) this).field_r.field_Ob;
                  return;
                }
              } else {
                ((vj) this).field_l = ((vj) this).field_r.field_Ob;
                return;
              }
            } else {
              ((vj) this).field_n = ((vj) this).field_r.field_Ob;
              return;
            }
          } else {
            ((vj) this).field_o = ((vj) this).field_r.field_Ob;
            return;
          }
        } else {
          field_t = 9;
          var2 = ((vj) this).field_q;
          if (1 != var2) {
            if (var2 != 2) {
              if (var2 != 3) {
                if (var2 != 4) {
                  return;
                } else {
                  ((vj) this).field_s = ((vj) this).field_r.field_Ob;
                  return;
                }
              } else {
                ((vj) this).field_l = ((vj) this).field_r.field_Ob;
                return;
              }
            } else {
              ((vj) this).field_n = ((vj) this).field_r.field_Ob;
              return;
            }
          } else {
            ((vj) this).field_o = ((vj) this).field_r.field_Ob;
            return;
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6, int param7) {
        int var9 = 0;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_57_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        if (kd.field_b == 1) {
          if (vb.field_f > 100) {
            L0: {
              if (ka.field_t <= param7) {
                break L0;
              } else {
                if (vb.field_f >= 120) {
                  break L0;
                } else {
                  if (20 + param7 <= ka.field_t) {
                    break L0;
                  } else {
                    L1: {
                      ((vj) this).field_r.field_Ob = param3;
                      ((vj) this).field_q = param1;
                      if (((vj) this).field_q != param1) {
                        stackOut_35_0 = 6710886;
                        stackIn_36_0 = stackOut_35_0;
                        break L1;
                      } else {
                        stackOut_34_0 = 14540253;
                        stackIn_36_0 = stackOut_34_0;
                        break L1;
                      }
                    }
                    L2: {
                      var9 = stackIn_36_0;
                      if (bd.field_g <= 100) {
                        break L2;
                      } else {
                        if (param7 >= bo.field_d) {
                          break L2;
                        } else {
                          if (bd.field_g >= 120) {
                            break L2;
                          } else {
                            if (param7 + 20 <= bo.field_d) {
                              break L2;
                            } else {
                              L3: {
                                if ((1 & jf.field_e) > 0) {
                                  stackOut_42_0 = 16777215;
                                  stackIn_43_0 = stackOut_42_0;
                                  break L3;
                                } else {
                                  stackOut_41_0 = 14540219;
                                  stackIn_43_0 = stackOut_41_0;
                                  break L3;
                                }
                              }
                              var9 = stackIn_43_0;
                              break L2;
                            }
                          }
                        }
                      }
                    }
                    oo.e(100, param7, 20, 20, var9);
                    oo.e(102, param7 - -2, 16, 16, param3);
                    if (param4 <= 0) {
                      return;
                    } else {
                      vj.e(23);
                      return;
                    }
                  }
                }
              }
            }
            L4: {
              if (((vj) this).field_q != param1) {
                stackOut_49_0 = 6710886;
                stackIn_50_0 = stackOut_49_0;
                break L4;
              } else {
                stackOut_48_0 = 14540253;
                stackIn_50_0 = stackOut_48_0;
                break L4;
              }
            }
            L5: {
              var9 = stackIn_50_0;
              if (bd.field_g <= 100) {
                break L5;
              } else {
                if (param7 >= bo.field_d) {
                  break L5;
                } else {
                  if (bd.field_g >= 120) {
                    break L5;
                  } else {
                    if (param7 + 20 <= bo.field_d) {
                      break L5;
                    } else {
                      L6: {
                        if ((1 & jf.field_e) > 0) {
                          stackOut_56_0 = 16777215;
                          stackIn_57_0 = stackOut_56_0;
                          break L6;
                        } else {
                          stackOut_55_0 = 14540219;
                          stackIn_57_0 = stackOut_55_0;
                          break L6;
                        }
                      }
                      var9 = stackIn_57_0;
                      break L5;
                    }
                  }
                }
              }
            }
            oo.e(100, param7, 20, 20, var9);
            oo.e(102, param7 - -2, 16, 16, param3);
            if (param4 <= 0) {
              return;
            } else {
              vj.e(23);
              return;
            }
          } else {
            L7: {
              if (((vj) this).field_q != param1) {
                stackOut_18_0 = 6710886;
                stackIn_19_0 = stackOut_18_0;
                break L7;
              } else {
                stackOut_17_0 = 14540253;
                stackIn_19_0 = stackOut_17_0;
                break L7;
              }
            }
            L8: {
              var9 = stackIn_19_0;
              if (bd.field_g <= 100) {
                break L8;
              } else {
                if (param7 >= bo.field_d) {
                  break L8;
                } else {
                  if (bd.field_g >= 120) {
                    break L8;
                  } else {
                    if (param7 + 20 <= bo.field_d) {
                      break L8;
                    } else {
                      L9: {
                        if ((1 & jf.field_e) > 0) {
                          stackOut_25_0 = 16777215;
                          stackIn_26_0 = stackOut_25_0;
                          break L9;
                        } else {
                          stackOut_24_0 = 14540219;
                          stackIn_26_0 = stackOut_24_0;
                          break L9;
                        }
                      }
                      var9 = stackIn_26_0;
                      break L8;
                    }
                  }
                }
              }
            }
            oo.e(100, param7, 20, 20, var9);
            oo.e(102, param7 - -2, 16, 16, param3);
            if (param4 <= 0) {
              return;
            } else {
              vj.e(23);
              return;
            }
          }
        } else {
          L10: {
            if (((vj) this).field_q != param1) {
              stackOut_3_0 = 6710886;
              stackIn_4_0 = stackOut_3_0;
              break L10;
            } else {
              stackOut_2_0 = 14540253;
              stackIn_4_0 = stackOut_2_0;
              break L10;
            }
          }
          L11: {
            var9 = stackIn_4_0;
            if (bd.field_g <= 100) {
              break L11;
            } else {
              if (param7 >= bo.field_d) {
                break L11;
              } else {
                if (bd.field_g >= 120) {
                  break L11;
                } else {
                  if (param7 + 20 <= bo.field_d) {
                    break L11;
                  } else {
                    L12: {
                      if ((1 & jf.field_e) > 0) {
                        stackOut_10_0 = 16777215;
                        stackIn_11_0 = stackOut_10_0;
                        break L12;
                      } else {
                        stackOut_9_0 = 14540219;
                        stackIn_11_0 = stackOut_9_0;
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
          oo.e(100, param7, 20, 20, var9);
          oo.e(102, param7 - -2, 16, 16, param3);
          if (param4 <= 0) {
            return;
          } else {
            vj.e(23);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = false;
        field_t = 360;
    }
}
