/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vf extends vc {
    static int field_lb;
    static String field_Q;
    private jg field_fb;
    private vm[] field_U;
    jg field_X;
    private jg field_Z;
    private jg field_ib;
    static String field_gb;
    private jg field_ab;
    private jg field_cb;
    private jg field_W;
    private jg field_T;
    jg field_hb;
    private jg field_mb;
    private jg field_jb;
    private jg field_kb;
    jg field_bb;
    static di field_nb;
    private jg field_S;
    jg field_Y;
    private jg field_db;
    private jg field_V;
    private jg field_eb;

    final void i(int param0) {
        super.i(param0);
    }

    final void a(int param0, uf param1) {
        int var3 = 0;
        int var4 = Pool.field_O;
        super.a(param0, param1);
        ci.field_f = ci.field_f + 1;
        for (var3 = 0; var3 < ((vf) this).field_U.length; var3++) {
            ((vf) this).field_U[var3].a((vf) this, 10);
        }
        ((vf) this).a(24, 50, (byte) -121, new jg[5], Pool.field_N);
        ((vf) this).a(24, 50, (byte) 125, new jg[3], ca.field_g);
    }

    final void a(byte param0, uf param1) {
        int var3 = 0;
        pq[] var4 = null;
        int[] var5 = null;
        int[] var6_ref_int__ = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        so var15 = null;
        so var17 = null;
        int[] var19 = null;
        so var20 = null;
        so var22 = null;
        so var24 = null;
        so var26 = null;
        so var28 = null;
        so var30 = null;
        so var33 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var40 = null;
        int[] var50 = null;
        int[] var51 = null;
        int[] var54 = null;
        int[] var64 = null;
        int[] var65 = null;
        int[] var66 = null;
        int[] var67 = null;
        int[] var68 = null;
        int[] var69 = null;
        int[] var70 = null;
        int[] var71 = null;
        int[] var72 = null;
        int[] var73 = null;
        int[] var74 = null;
        boolean[] var75 = null;
        int[] var76 = null;
        boolean[] var77 = null;
        boolean[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        boolean[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        boolean[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        boolean[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        boolean[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        boolean[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        boolean[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        boolean[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_18_3 = 0;
        boolean[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_19_3 = 0;
        boolean[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_20_3 = 0;
        int stackIn_20_4 = 0;
        boolean[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        boolean[] stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        boolean[] stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        Object stackIn_34_0 = null;
        int[] stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        pq[] stackIn_34_4 = null;
        Object stackIn_35_0 = null;
        int[] stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        pq[] stackIn_35_4 = null;
        Object stackIn_36_0 = null;
        int[] stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        pq[] stackIn_36_4 = null;
        int stackIn_36_5 = 0;
        Object stackOut_33_0 = null;
        int[] stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        pq[] stackOut_33_4 = null;
        Object stackOut_35_0 = null;
        int[] stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        pq[] stackOut_35_4 = null;
        int stackOut_35_5 = 0;
        Object stackOut_34_0 = null;
        int[] stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        pq[] stackOut_34_4 = null;
        int stackOut_34_5 = 0;
        boolean[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        boolean[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        boolean[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        boolean[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        boolean[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        boolean[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        boolean[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        boolean[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        int stackOut_19_4 = 0;
        boolean[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        int stackOut_18_4 = 0;
        boolean[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        int stackOut_16_4 = 0;
        boolean[] stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        boolean[] stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        boolean[] stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        L0: {
          var9 = Pool.field_O;
          var4 = param1.field_I.field_l;
          var65 = f.a((byte) 53, param1.field_ab);
          var51 = var65;
          var37 = var51;
          var14 = var37;
          var5 = var14;
          var64 = var5;
          var50 = var64;
          var36 = var50;
          var13 = var36;
          var11 = var13;
          var6_ref_int__ = var11;
          if (param0 == -55) {
            break L0;
          } else {
            var10 = null;
            ((vf) this).a((al) null, 25);
            break L0;
          }
        }
        L1: {
          oh.field_d[0] = var64[0] - sb.a(288.0f, true) >> 2124564386;
          oh.field_d[1] = var64[1] - sb.a(144.0f, true) >> 1309211490;
          oh.field_d[2] = var64[2] >> -2021046654;
          if (var6_ref_int__ != oh.field_d) {
            oh.field_d[6] = var64[6];
            oh.field_d[3] = var64[3];
            oh.field_d[7] = var64[7];
            oh.field_d[8] = var64[8];
            oh.field_d[5] = var64[5];
            oh.field_d[11] = var64[11];
            oh.field_d[4] = var64[4];
            oh.field_d[9] = var64[9];
            oh.field_d[10] = var64[10];
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var5[2] = rb.b(var65[2], -4);
          var5[1] = rb.b(var65[1], -4);
          var5[0] = rb.b(var65[0], -4);
          hn.a(-3143);
          this.a(true, param1);
          this.a();
          this.a(oh.field_d, param1.field_eb.b(param0 + -72));
          ((vf) this).a(false, var65, var4);
          if (-1L == (pd.field_i & 1073741824L ^ -1L)) {
            ((vf) this).a(var65, (byte) 122, false, var4, false);
            break L2;
          } else {
            break L2;
          }
        }
        var15 = me.field_y;
        var66 = oh.field_d;
        var15.b((byte) 111, 0, var15.field_j.length, var66);
        var17 = gf.field_e;
        var67 = oh.field_d;
        var17.b((byte) -122, 0, var17.field_j.length, var67);
        var3 = 0;
        L3: while (true) {
          if (bc.field_j.length <= var3) {
            L4: {
              var20 = sa.field_s;
              var69 = oh.field_d;
              var20.b((byte) 104, 0, var20.field_j.length, var69);
              var22 = oe.field_U;
              var70 = oh.field_d;
              var22.b((byte) 119, 0, var22.field_j.length, var70);
              var24 = me.field_y;
              var71 = oh.field_d;
              var24.a((byte) -65, 0, var24.field_j.length, var71);
              var26 = oe.field_U;
              var72 = oh.field_d;
              var26.a((byte) -96, 0, var26.field_j.length, var72);
              var28 = sa.field_s;
              var73 = oh.field_d;
              var28.a((byte) -113, 0, var28.field_j.length, var73);
              if ((pd.field_i & 1073741824L) == 0L) {
                var6 = 0;
                L5: while (true) {
                  if (var6 >= var4.length) {
                    break L4;
                  } else {
                    if (var4[var6].field_s) {
                      ((vf) this).a(var65, var4[var6]);
                      var6++;
                      continue L5;
                    } else {
                      var6++;
                      continue L5;
                    }
                  }
                }
              } else {
                break L4;
              }
            }
            L6: {
              var30 = gf.field_e;
              var74 = oh.field_d;
              var75 = bc.field_j;
              var30.a(false, 0, var30.field_j.length, (byte) 100, var74, var75);
              if (0L == (1073741824L & pd.field_i)) {
                L7: {
                  stackOut_33_0 = this;
                  stackOut_33_1 = (int[]) var5;
                  stackOut_33_2 = 112;
                  stackOut_33_3 = 1;
                  stackOut_33_4 = (pq[]) var4;
                  stackIn_35_0 = stackOut_33_0;
                  stackIn_35_1 = stackOut_33_1;
                  stackIn_35_2 = stackOut_33_2;
                  stackIn_35_3 = stackOut_33_3;
                  stackIn_35_4 = stackOut_33_4;
                  stackIn_34_0 = stackOut_33_0;
                  stackIn_34_1 = stackOut_33_1;
                  stackIn_34_2 = stackOut_33_2;
                  stackIn_34_3 = stackOut_33_3;
                  stackIn_34_4 = stackOut_33_4;
                  if (param1.field_I.j(83).field_q != 0) {
                    stackOut_35_0 = this;
                    stackOut_35_1 = (int[]) (Object) stackIn_35_1;
                    stackOut_35_2 = stackIn_35_2;
                    stackOut_35_3 = stackIn_35_3;
                    stackOut_35_4 = (pq[]) (Object) stackIn_35_4;
                    stackOut_35_5 = 0;
                    stackIn_36_0 = stackOut_35_0;
                    stackIn_36_1 = stackOut_35_1;
                    stackIn_36_2 = stackOut_35_2;
                    stackIn_36_3 = stackOut_35_3;
                    stackIn_36_4 = stackOut_35_4;
                    stackIn_36_5 = stackOut_35_5;
                    break L7;
                  } else {
                    stackOut_34_0 = this;
                    stackOut_34_1 = (int[]) (Object) stackIn_34_1;
                    stackOut_34_2 = stackIn_34_2;
                    stackOut_34_3 = stackIn_34_3;
                    stackOut_34_4 = (pq[]) (Object) stackIn_34_4;
                    stackOut_34_5 = 1;
                    stackIn_36_0 = stackOut_34_0;
                    stackIn_36_1 = stackOut_34_1;
                    stackIn_36_2 = stackOut_34_2;
                    stackIn_36_3 = stackOut_34_3;
                    stackIn_36_4 = stackOut_34_4;
                    stackIn_36_5 = stackOut_34_5;
                    break L7;
                  }
                }
                ((vf) this).a(stackIn_36_1, (byte) stackIn_36_2, stackIn_36_3 != 0, stackIn_36_4, stackIn_36_5 != 0);
                break L6;
              } else {
                break L6;
              }
            }
            L8: {
              var33 = gf.field_e;
              var76 = oh.field_d;
              var77 = bc.field_j;
              var33.a(true, 0, var33.field_j.length, (byte) 117, var76, var77);
              if ((pd.field_i & 256L) != 0L) {
                oe.field_U.a(oh.field_d, 0);
                gf.field_e.a(oh.field_d, 0);
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if ((1073741824L & pd.field_i ^ -1L) == -1L) {
                param1.q(-1);
                param1.D(-128);
                break L9;
              } else {
                break L9;
              }
            }
            return;
          } else {
            L10: {
              var68 = gf.field_e.field_c[var3];
              var54 = var68;
              var40 = var54;
              var19 = var40;
              var12 = var19;
              var6_ref_int__ = var12;
              var7 = 576;
              var8 = 288;
              stackOut_10_0 = bc.field_j;
              stackOut_10_1 = var3;
              stackOut_10_2 = -oh.field_d[0] + var68[0];
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              if (var68[0] >= -var7) {
                stackOut_12_0 = (boolean[]) (Object) stackIn_12_0;
                stackOut_12_1 = stackIn_12_1;
                stackOut_12_2 = stackIn_12_2;
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_14_2 = stackOut_12_2;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                stackIn_13_2 = stackOut_12_2;
                if (var7 < var68[0]) {
                  stackOut_14_0 = (boolean[]) (Object) stackIn_14_0;
                  stackOut_14_1 = stackIn_14_1;
                  stackOut_14_2 = stackIn_14_2;
                  stackOut_14_3 = -1;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  stackIn_15_3 = stackOut_14_3;
                  break L10;
                } else {
                  stackOut_13_0 = (boolean[]) (Object) stackIn_13_0;
                  stackOut_13_1 = stackIn_13_1;
                  stackOut_13_2 = stackIn_13_2;
                  stackOut_13_3 = 0;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  stackIn_15_3 = stackOut_13_3;
                  break L10;
                }
              } else {
                stackOut_11_0 = (boolean[]) (Object) stackIn_11_0;
                stackOut_11_1 = stackIn_11_1;
                stackOut_11_2 = stackIn_11_2;
                stackOut_11_3 = 1;
                stackIn_15_0 = stackOut_11_0;
                stackIn_15_1 = stackOut_11_1;
                stackIn_15_2 = stackOut_11_2;
                stackIn_15_3 = stackOut_11_3;
                break L10;
              }
            }
            L11: {
              stackOut_15_0 = (boolean[]) (Object) stackIn_15_0;
              stackOut_15_1 = stackIn_15_1;
              stackOut_15_2 = stackIn_15_2 * stackIn_15_3;
              stackOut_15_3 = -oh.field_d[1] + var68[1];
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              stackIn_17_3 = stackOut_15_3;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              stackIn_16_3 = stackOut_15_3;
              if (var68[1] >= -var8) {
                stackOut_17_0 = (boolean[]) (Object) stackIn_17_0;
                stackOut_17_1 = stackIn_17_1;
                stackOut_17_2 = stackIn_17_2;
                stackOut_17_3 = stackIn_17_3;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                stackIn_19_2 = stackOut_17_2;
                stackIn_19_3 = stackOut_17_3;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                stackIn_18_2 = stackOut_17_2;
                stackIn_18_3 = stackOut_17_3;
                if (var68[1] > var8) {
                  stackOut_19_0 = (boolean[]) (Object) stackIn_19_0;
                  stackOut_19_1 = stackIn_19_1;
                  stackOut_19_2 = stackIn_19_2;
                  stackOut_19_3 = stackIn_19_3;
                  stackOut_19_4 = -1;
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  stackIn_20_2 = stackOut_19_2;
                  stackIn_20_3 = stackOut_19_3;
                  stackIn_20_4 = stackOut_19_4;
                  break L11;
                } else {
                  stackOut_18_0 = (boolean[]) (Object) stackIn_18_0;
                  stackOut_18_1 = stackIn_18_1;
                  stackOut_18_2 = stackIn_18_2;
                  stackOut_18_3 = stackIn_18_3;
                  stackOut_18_4 = 0;
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  stackIn_20_2 = stackOut_18_2;
                  stackIn_20_3 = stackOut_18_3;
                  stackIn_20_4 = stackOut_18_4;
                  break L11;
                }
              } else {
                stackOut_16_0 = (boolean[]) (Object) stackIn_16_0;
                stackOut_16_1 = stackIn_16_1;
                stackOut_16_2 = stackIn_16_2;
                stackOut_16_3 = stackIn_16_3;
                stackOut_16_4 = 1;
                stackIn_20_0 = stackOut_16_0;
                stackIn_20_1 = stackOut_16_1;
                stackIn_20_2 = stackOut_16_2;
                stackIn_20_3 = stackOut_16_3;
                stackIn_20_4 = stackOut_16_4;
                break L11;
              }
            }
            L12: {
              stackOut_20_0 = (boolean[]) (Object) stackIn_20_0;
              stackOut_20_1 = stackIn_20_1;
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              if (stackIn_20_2 - -(stackIn_20_3 * stackIn_20_4) <= 0) {
                stackOut_22_0 = (boolean[]) (Object) stackIn_22_0;
                stackOut_22_1 = stackIn_22_1;
                stackOut_22_2 = 0;
                stackIn_23_0 = stackOut_22_0;
                stackIn_23_1 = stackOut_22_1;
                stackIn_23_2 = stackOut_22_2;
                break L12;
              } else {
                stackOut_21_0 = (boolean[]) (Object) stackIn_21_0;
                stackOut_21_1 = stackIn_21_1;
                stackOut_21_2 = 1;
                stackIn_23_0 = stackOut_21_0;
                stackIn_23_1 = stackOut_21_1;
                stackIn_23_2 = stackOut_21_2;
                break L12;
              }
            }
            stackIn_23_0[stackIn_23_1] = stackIn_23_2 != 0;
            var3++;
            continue L3;
          }
        }
    }

    public static void e(byte param0) {
        field_Q = null;
        int var1 = 104 / ((param0 - -10) / 36);
        field_gb = null;
        field_nb = null;
    }

    final void c(boolean param0) {
        int var2 = 0;
        ko var3 = null;
        ko var4 = null;
        ko var5 = null;
        so var6 = null;
        so var7 = null;
        so var8 = null;
        so var9 = null;
        so var10 = null;
        so var11 = null;
        so var12 = null;
        so var13 = null;
        so var14 = null;
        int var15 = 0;
        eg var15_ref = null;
        int var16 = 0;
        so[] var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        Object var21 = null;
        eg var22 = null;
        eg var23 = null;
        eg var24 = null;
        so var25 = null;
        eg var26 = null;
        so var27 = null;
        eg var28 = null;
        so var29 = null;
        so var30 = null;
        eg var31 = null;
        so var32 = null;
        ko var33 = null;
        so[] var34 = null;
        eg var36 = null;
        so[] var37 = null;
        so[] var39 = null;
        int[] var47 = null;
        int[] var48 = null;
        int[] var49 = null;
        int stackIn_14_0 = 0;
        eg stackIn_14_1 = null;
        int stackIn_14_2 = 0;
        int stackIn_15_0 = 0;
        eg stackIn_15_1 = null;
        int stackIn_15_2 = 0;
        int stackIn_16_0 = 0;
        eg stackIn_16_1 = null;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        so[] stackIn_33_0 = null;
        so[] stackIn_34_0 = null;
        so[] stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        so[] stackOut_32_0 = null;
        so[] stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        so[] stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_13_0 = 0;
        eg stackOut_13_1 = null;
        int stackOut_13_2 = 0;
        int stackOut_15_0 = 0;
        eg stackOut_15_1 = null;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        int stackOut_14_0 = 0;
        eg stackOut_14_1 = null;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        var20 = Pool.field_O;
        var2 = 0;
        ((vf) this).field_U = new vm[-gk.field_hb + mf.field_m];
        var3 = new ko();
        var4 = new ko();
        var5 = new ko();
        var6 = new so();
        var7 = new so();
        var8 = new so();
        var9 = new so(hj.field_a + -vq.field_Ob);
        var10 = new so(co.field_db + -kg.field_n);
        var11 = new so((ol.field_d + -er.field_S) * 4);
        gf.field_e = new so(new so[3]);
        var12 = new so(co.field_db + -kg.field_n);
        var13 = new so(4 * (mb.field_e + -tg.field_g) + (hf.field_c + -rl.field_f) * 2);
        oe.field_U = new so(new so[3]);
        sa.field_s = new so(4 * (wj.field_V + -fr.field_t));
        me.field_y = new so(new so[2]);
        var14 = new so(new so[4]);
        var2 = kg.field_n;
        L0: while (true) {
          if (co.field_db <= var2) {
            var2 = vq.field_Ob;
            L1: while (true) {
              if (hj.field_a <= var2) {
                var2 = gk.field_hb;
                L2: while (true) {
                  if (mf.field_m <= var2) {
                    L3: {
                      var6.a((byte) -120, var3);
                      var7.a((byte) 38, var4);
                      if (param0) {
                        break L3;
                      } else {
                        var21 = null;
                        ((vf) this).a((byte) 16, (uf) null);
                        break L3;
                      }
                    }
                    var8.a((byte) 72, var5);
                    var15 = 0;
                    var2 = er.field_S;
                    L4: while (true) {
                      if (var2 >= ol.field_d) {
                        var15 = 0;
                        var2 = tg.field_g;
                        L5: while (true) {
                          if (mb.field_e <= var2) {
                            var2 = rl.field_f;
                            L6: while (true) {
                              if (var2 >= hf.field_c) {
                                var15 = 0;
                                var2 = fr.field_t;
                                L7: while (true) {
                                  if (var2 >= wj.field_V) {
                                    var14.a(0);
                                    new so(new so[3]).a(false);
                                    new so(new so[2]).a(false);
                                    var14.a(((vf) this).field_q, ((vf) this).field_e, ((vf) this).field_F, (byte) -79, ((vf) this).field_u, ((vf) this).field_C);
                                    gf.field_e.d(115);
                                    bc.field_j = new boolean[gf.field_e.field_j.length];
                                    oe.field_U.d(101);
                                    sa.field_s.d(97);
                                    me.field_y.d(92);
                                    return;
                                  } else {
                                    L8: {
                                      var16 = var2;
                                      var17 = sa.field_s.field_b;
                                      var18 = var15;
                                      var49 = ((vf) this).field_M[var16];
                                      stackOut_32_0 = (so[]) var17;
                                      stackIn_34_0 = stackOut_32_0;
                                      stackIn_33_0 = stackOut_32_0;
                                      if (param0) {
                                        stackOut_34_0 = (so[]) (Object) stackIn_34_0;
                                        stackOut_34_1 = 0;
                                        stackIn_35_0 = stackOut_34_0;
                                        stackIn_35_1 = stackOut_34_1;
                                        break L8;
                                      } else {
                                        stackOut_33_0 = (so[]) (Object) stackIn_33_0;
                                        stackOut_33_1 = 1;
                                        stackIn_35_0 = stackOut_33_0;
                                        stackIn_35_1 = stackOut_33_1;
                                        break L8;
                                      }
                                    }
                                    bh.a(stackIn_35_0, stackIn_35_1 != 0, var49[1], var49[2], ((vf) this).field_O[var16], var49[0], var18);
                                    var15 += 4;
                                    var2++;
                                    continue L7;
                                  }
                                }
                              } else {
                                var16 = var2;
                                var39 = var13.field_b;
                                var18 = var15;
                                be.a(var18, ((vf) this).field_M[var16][1], ((vf) this).field_M[var16][2], 1, var39, ((vf) this).field_M[var16][0], ((vf) this).field_O[var16]);
                                var15 += 2;
                                var2++;
                                continue L6;
                              }
                            }
                          } else {
                            var16 = var2;
                            var37 = var13.field_b;
                            var18 = var15;
                            var48 = ((vf) this).field_M[var16];
                            bh.a(var37, false, var48[1], var48[2], ((vf) this).field_O[var16], var48[0], var18);
                            var15 += 4;
                            var2++;
                            continue L5;
                          }
                        }
                      } else {
                        var36 = ((vf) this).field_O[var2];
                        var47 = ((vf) this).field_M[var2];
                        var34 = var11.field_b;
                        var19 = var15;
                        bh.a(var34, false, var47[1] - 0, 0 + var47[2], var36, var47[0] - 0, var19);
                        var15 += 4;
                        var2++;
                        continue L4;
                      }
                    }
                  } else {
                    L9: {
                      var24 = ((vf) this).field_O[var2];
                      var33 = new ko();
                      var24.e();
                      if (var24.field_V > -((vf) this).field_M[var2][2]) {
                        var30 = hc.a(var24, ((vf) this).field_M[var2], (byte) 101);
                        var4.b((byte) -121, (ma) (Object) new pm(hc.a(var24, ((vf) this).field_M[var2], (byte) 101)));
                        var33.b((byte) -39, (ma) (Object) new pm(var30));
                        break L9;
                      } else {
                        if (-((vf) this).field_M[var2][2] <= var24.field_x) {
                          L10: {
                            var28 = hq.b((byte) 121);
                            var26 = hq.b((byte) 122);
                            stackOut_13_0 = 0;
                            stackOut_13_1 = (eg) var28;
                            stackOut_13_2 = 0;
                            stackIn_15_0 = stackOut_13_0;
                            stackIn_15_1 = stackOut_13_1;
                            stackIn_15_2 = stackOut_13_2;
                            stackIn_14_0 = stackOut_13_0;
                            stackIn_14_1 = stackOut_13_1;
                            stackIn_14_2 = stackOut_13_2;
                            if (param0) {
                              stackOut_15_0 = stackIn_15_0;
                              stackOut_15_1 = (eg) (Object) stackIn_15_1;
                              stackOut_15_2 = stackIn_15_2;
                              stackOut_15_3 = 0;
                              stackIn_16_0 = stackOut_15_0;
                              stackIn_16_1 = stackOut_15_1;
                              stackIn_16_2 = stackOut_15_2;
                              stackIn_16_3 = stackOut_15_3;
                              break L10;
                            } else {
                              stackOut_14_0 = stackIn_14_0;
                              stackOut_14_1 = (eg) (Object) stackIn_14_1;
                              stackOut_14_2 = stackIn_14_2;
                              stackOut_14_3 = 1;
                              stackIn_16_0 = stackOut_14_0;
                              stackIn_16_1 = stackOut_14_1;
                              stackIn_16_2 = stackOut_14_2;
                              stackIn_16_3 = stackOut_14_3;
                              break L10;
                            }
                          }
                          ej.a(stackIn_16_0, stackIn_16_1, stackIn_16_2, stackIn_16_3 != 0, -((vf) this).field_M[var2][2], 0, 0, 1, var26, var24);
                          var27 = hc.a(var26, ((vf) this).field_M[var2], (byte) 101);
                          var4.b((byte) -51, (ma) (Object) new pm(hc.a(var26, ((vf) this).field_M[var2], (byte) 101)));
                          var33.b((byte) 125, (ma) (Object) new pm(var27));
                          var29 = hc.a(var28, ((vf) this).field_M[var2], (byte) 101);
                          var3.b((byte) -47, (ma) (Object) new pm(hc.a(var28, ((vf) this).field_M[var2], (byte) 101)));
                          var33.b((byte) 122, (ma) (Object) new pm(var29));
                          break L9;
                        } else {
                          var25 = hc.a(var24, ((vf) this).field_M[var2], (byte) 101);
                          var3.b((byte) 97, (ma) (Object) new pm(hc.a(var24, ((vf) this).field_M[var2], (byte) 101)));
                          var33.b((byte) 90, (ma) (Object) new pm(var25));
                          break L9;
                        }
                      }
                    }
                    var31 = ((vf) this).field_O[mp.field_W + (var2 - gk.field_hb)];
                    var15_ref = var31;
                    var31.e();
                    var32 = hc.a(var15_ref, ((vf) this).field_M[mp.field_W + -gk.field_hb + var2], (byte) 101);
                    var5.b((byte) 108, (ma) (Object) new pm(hc.a(var15_ref, ((vf) this).field_M[mp.field_W + -gk.field_hb + var2], (byte) 101)));
                    var33.b((byte) 84, (ma) (Object) new pm(var32));
                    ((vf) this).field_U[-gk.field_hb + var2] = new vm(new so(var33));
                    var2++;
                    continue L2;
                  }
                }
              } else {
                var9.field_b[-vq.field_Ob + var2] = hc.a(((vf) this).field_O[var2], ((vf) this).field_M[var2], (byte) 101);
                var2++;
                continue L1;
              }
            }
          } else {
            L11: {
              if (ec.field_f >= ((vf) this).field_O[var2].field_x + ((vf) this).field_M[var2][2]) {
                break L11;
              } else {
                ec.field_f = ((vf) this).field_M[var2][2] - -((vf) this).field_O[var2].field_x;
                break L11;
              }
            }
            var23 = hq.b((byte) 122);
            var22 = hq.b((byte) 121);
            ej.a(0, var23, 0, false, -((vf) this).field_M[var2][2], 0, 0, 1, var22, ((vf) this).field_O[var2]);
            var12.field_b[var2 - kg.field_n] = hc.a(var22, ((vf) this).field_M[var2], (byte) 101);
            var10.field_b[-kg.field_n + var2] = hc.a(var23, ((vf) this).field_M[var2], (byte) 101);
            var2++;
            continue L0;
          }
        }
    }

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var3 = 65536 / qh.field_l;
          if (qh.field_c <= param1) {
            stackOut_2_0 = param1;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = qh.field_c;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var4 = stackIn_3_0;
        L1: while (true) {
          if (var4 >= qh.field_g) {
            return;
          } else {
            L2: {
              var5 = var4 - 240;
              var6 = var4 - param1;
              if (var6 >= 5) {
                var6 = 0;
                break L2;
              } else {
                var6 = (5 - var6) * 127 / 5;
                break L2;
              }
            }
            var7 = 127 - var6;
            var12 = param0[9] + (param0[3] * (qh.field_b - 320) + param0[6] * var5 >> 9) >> 1;
            var13 = param0[10] + (param0[4] * (qh.field_b - 320) + param0[7] * var5 >> 9) >> 1;
            var14 = param0[11] + (param0[5] * (qh.field_b - 320) + param0[8] * var5 >> 9) >> 1;
            var15 = var12 * var12 + var13 * var13 + var14 * var14 >> 16;
            if (var15 > 0) {
              var15 = rf.a(var15, -128);
              var12 = lh.a(var15, (byte) -80, (long)var12);
              var13 = lh.a(var15, (byte) -100, (long)var13);
              var14 = lh.a(var15, (byte) -92, (long)var14);
              if (var14 != 0) {
                var16 = lh.a(var14, (byte) -90, (long)(ec.field_f - param0[2]));
                var8 = param0[0] + (var16 * var12 >> 16) >> 3;
                var10 = param0[1] + (var16 * var13 >> 16) >> 3;
                var12 = param0[9] + (param0[3] * (qh.field_j - 320) + param0[6] * var5 >> 9) >> 1;
                var13 = param0[10] + (param0[4] * (qh.field_j - 320) + param0[7] * var5 >> 9) >> 1;
                var14 = param0[11] + (param0[5] * (qh.field_j - 320) + param0[8] * var5 >> 9) >> 1;
                var15 = var12 * var12 + var13 * var13 + var14 * var14 >> 16;
                if (var15 > 0) {
                  var15 = rf.a(var15, -121);
                  var12 = lh.a(var15, (byte) -67, (long)var12);
                  var13 = lh.a(var15, (byte) -120, (long)var13);
                  var14 = lh.a(var15, (byte) -119, (long)var14);
                  if (var14 != 0) {
                    var16 = lh.a(var14, (byte) -112, (long)(ec.field_f - param0[2]));
                    var9 = param0[0] + (var16 * var12 >> 16) >> 3;
                    var11 = param0[1] + (var16 * var13 >> 16) >> 3;
                    var12 = var9 - var8;
                    var13 = var11 - var10;
                    var14 = var12 * var3;
                    var15 = var13 * var3;
                    var16 = (var8 << 16) + var14 * qh.field_b;
                    var17 = (var10 << 16) + var15 * qh.field_b;
                    var18 = var4 * qh.field_l + qh.field_b;
                    var19 = qh.field_b;
                    L3: while (true) {
                      if (var19 < qh.field_j) {
                        L4: {
                          if (qh.field_d[var18] != -1) {
                            break L4;
                          } else {
                            L5: {
                              var20 = ((var16 >> 16 & 255) << 8) + (var17 >> 16 & 255);
                              var21 = di.field_g >> 0;
                              var22 = 256 - var21;
                              var23 = we.field_g[var20];
                              var24 = p.field_c[var20];
                              var23 = ((var23 & 65280) * var22 >> 8) + ((var24 & 65280) * var21 >> 8) & 65280 | ((var23 & 16711935) * var22 >> 8) + ((var24 & 16711935) * var21 >> 8) & 16711935;
                              if (var6 == 0) {
                                break L5;
                              } else {
                                var23 = ((var23 & 65280) * var7 >> 7) + (60928 * var6 >> 7) & 65280 | ((var23 & 16711935) * var7 >> 7) + (15597806 * var6 >> 7) & 16711935;
                                break L5;
                              }
                            }
                            qh.field_d[var18] = var23;
                            break L4;
                          }
                        }
                        var16 = var16 + var14;
                        var17 = var17 + var15;
                        var18++;
                        var19++;
                        continue L3;
                      } else {
                        var4++;
                        continue L1;
                      }
                    }
                  } else {
                    var4++;
                    continue L1;
                  }
                } else {
                  var4++;
                  continue L1;
                }
              } else {
                var4++;
                continue L1;
              }
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final void a(di param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Pool.field_O;
        var3 = 0;
        ((vf) this).field_O = new eg[61];
        mp.field_W = var3;
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_isle_us_a");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_isle_us_b");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_isle_us_c");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_isle_us_d");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_isle_us_e");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_isle_us_f");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_isle_us_g");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_isle_us_h");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_isle_us_i");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_isle_us_j");
        gk.field_hb = var3;
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_isle_a");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_isle_b");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_isle_c");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_isle_d");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_isle_e");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_isle_f");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_isle_g");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_isle_h");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_isle_i");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_isle_j");
        vq.field_Ob = var3;
        mf.field_m = var3;
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_main_us_a");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_main_us_b");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_main_us_c");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_main_us_d");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_main_us_e");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_main_us_f");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_main_us_g");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_main_us_h");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_main_us_i");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_main_us_j");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_main_us_k");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_main_us_l");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_main_us_m");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_main_us_n");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_main_us_o");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_main_us_p");
        hj.field_a = var3;
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_sea");
        kg.field_n = var3;
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_main_a");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_main_b");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_main_c");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_main_d");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_main_e");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_main_f");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_main_g");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_main_h");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_main_i");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_main_j");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_main_k");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_main_l");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_main_m");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_main_n");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_main_o");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_main_p");
        tg.field_g = var3;
        co.field_db = var3;
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_hole_a");
        rl.field_f = var3;
        mb.field_e = var3;
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_hole_b");
        hf.field_c = var3;
        er.field_S = var3;
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_corner");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_side_a");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_side_b");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_side_c");
        fr.field_t = var3;
        ol.field_d = var3;
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_top_a");
        var3++;
        ((vf) this).field_O[var3] = eg.a(param0, "", "polar_table/ice_top_b");
        wj.field_V = var3;
        ((vf) this).field_A = new jk();
        ((vf) this).field_A.a(eg.a(param0, "", "cues/ice_cue"), (byte) -105);
        var4 = 0;
        L0: while (true) {
          if (((vf) this).field_O.length <= var4) {
            var5 = 2147483647;
            var6 = -2147483648;
            var7 = 2147483647;
            var8 = -2147483648;
            var9 = 2147483647;
            var10 = -2147483648;
            var4 = fr.field_t;
            L1: while (true) {
              if (wj.field_V <= var4) {
                var7 = 2 * var7 - var8;
                var5 = -var6 + 2 * var5;
                var11 = (var5 + var6) / 2;
                var12 = (var7 + var8) / 2;
                var13 = var10;
                var4 = 0;
                L2: while (true) {
                  if (var4 >= ((vf) this).field_O.length) {
                    L3: {
                      ((vf) this).field_M = new int[((vf) this).field_O.length][3];
                      if (param1 < -43) {
                        break L3;
                      } else {
                        ((vf) this).field_V = null;
                        break L3;
                      }
                    }
                    var4 = 0;
                    L4: while (true) {
                      if (((vf) this).field_O.length <= var4) {
                        return;
                      } else {
                        ln.a(((vf) this).field_M[var4], 0, ((vf) this).field_O[var4]);
                        var4++;
                        continue L4;
                      }
                    }
                  } else {
                    eg discarded$1 = cq.a(var11, 57, var13, ((vf) this).field_O[var4], var12);
                    var4++;
                    continue L2;
                  }
                }
              } else {
                L5: {
                  d.a(((vf) this).field_O[var4], -23109);
                  if (((vf) this).field_O[var4].field_D < var5) {
                    var5 = ((vf) this).field_O[var4].field_D;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (var9 <= ((vf) this).field_O[var4].field_V) {
                    break L6;
                  } else {
                    var9 = ((vf) this).field_O[var4].field_V;
                    break L6;
                  }
                }
                L7: {
                  if (((vf) this).field_O[var4].field_S > var8) {
                    var8 = ((vf) this).field_O[var4].field_S;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (var6 < ((vf) this).field_O[var4].field_w) {
                    var6 = ((vf) this).field_O[var4].field_w;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (((vf) this).field_O[var4].field_y < var7) {
                    var7 = ((vf) this).field_O[var4].field_y;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                if (((vf) this).field_O[var4].field_x > var10) {
                  var10 = ((vf) this).field_O[var4].field_x;
                  var4++;
                  continue L1;
                } else {
                  var4++;
                  continue L1;
                }
              }
            }
          } else {
            db.a(0, ((vf) this).field_O[var4]);
            var4++;
            continue L0;
          }
        }
    }

    final void d(boolean param0) {
        pi.a();
        oo.field_w = null;
        vb.field_p = null;
        p.field_c = null;
        if (!param0) {
            return;
        }
        we.field_g = null;
        ((vf) this).a((byte) 119);
    }

    final void a(al param0, int param1) {
        super.a(param0, param1 + 0);
        if (param1 != 21894) {
            return;
        }
        int[] var6 = ta.a(new int[4], 101);
        int[] var5 = var6;
        int[] var4 = var5;
        int[] var3 = var4;
        oo.field_w = ta.a(new int[6], param1 ^ 21919);
        pi.c();
        ((vf) this).a(86, param0.field_l.length);
        vb.field_p = new int[65536];
        we.field_g = new int[65536];
        p.field_c = new int[65536];
    }

    final void a(int param0, di param1) {
        ((vf) this).field_b = cg.a(param1, "", "pool_polar");
        ((vf) this).field_i = cg.a(param1, "", "pool_polar_win_jingle");
        ((vf) this).field_n = cg.a(param1, "", "pool_polar_lose_jingle");
        if (param0 != 1) {
            ((vf) this).d(true);
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Pool.field_O;
          var5 = -125 / ((-44 - param2) / 56);
          var6 = param0;
          if (var6 == 5) {
            var6 = ga.a(3, true, ea.field_r);
            if (0 != var6) {
              if (-2 == (var6 ^ -1)) {
                kf discarded$10 = kp.a(100, ((vf) this).field_cb, param3, param1);
                break L0;
              } else {
                if (var6 != 2) {
                  break L0;
                } else {
                  kf discarded$11 = kp.a(100, ((vf) this).field_ab, param3, param1);
                  break L0;
                }
              }
            } else {
              kf discarded$12 = kp.a(100, ((vf) this).field_ib, param3, param1);
              break L0;
            }
          } else {
            if (15 != var6) {
              if (2 != var6) {
                L1: {
                  if ((var6 ^ -1) == -17) {
                    break L1;
                  } else {
                    if (var6 != 3) {
                      if (var6 == -1) {
                        kf discarded$13 = kp.a(100, ((vf) this).field_Y, param3, param1);
                        break L0;
                      } else {
                        if (-2 == var6) {
                          kf discarded$14 = kp.a(100, ((vf) this).field_X, param3, param1);
                          break L0;
                        } else {
                          if (6 == var6) {
                            kf discarded$15 = kp.a(100, ((vf) this).field_S, param3, param1);
                            System.out.println("playing respot the white");
                            break L0;
                          } else {
                            if (4 == var6) {
                              kf discarded$16 = kp.a(100, ((vf) this).field_jb, param3, param1);
                              break L0;
                            } else {
                              super.a(param0, param1, (byte) 115, param3);
                              break L0;
                            }
                          }
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                kf discarded$17 = kp.a(100, ((vf) this).field_hb, param3, param1);
                break L0;
              } else {
                kf discarded$18 = kp.a(100, ((vf) this).field_bb, param3, param1);
                break L0;
              }
            } else {
              kf discarded$19 = kp.a(100, ((vf) this).field_mb, param3, param1);
              break L0;
            }
          }
        }
    }

    final void c(int param0, di param1) {
        if (param0 != -23569) {
            ((vf) this).field_T = null;
        }
    }

    private final void a(boolean param0, uf param1) {
        int var6 = 0;
        int var7 = 0;
        int var3 = param1.field_eb.b(-128);
        if (!param0) {
            vf.e((byte) -126);
        }
        int var4 = ((vf) this).field_B.field_z << -2143569535;
        int var5 = ((vf) this).field_B.field_A << -744787231;
        if (!((var3 ^ -1) >= -1)) {
            var6 = (int)((double)var4 * -param1.field_eb.a(param0) / 2.0 / 3.141592653589793);
            var7 = -var5 + var3;
            ((vf) this).field_B.c(var6 + -var4, var7, var4, var5);
            if (!(-640 + var4 <= var6)) {
                ((vf) this).field_B.c(var6, var7, var4, var5);
            }
        }
    }

    private final void a() {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var2 = null;
        int var1 = di.field_g + 32;
        for (var2_int = di.field_g; var2_int < var1; var2_int++) {
            var3 = var2_int * 256;
            for (var4 = 0; var4 < 256; var4++) {
                var3++;
                vb.field_p[var3] = pi.a(var4 << 6, var2_int << 6, qa.field_r << 7, oo.field_w, 128, 6);
            }
        }
        if (var1 >= 256) {
            var2 = vb.field_p;
            vb.field_p = we.field_g;
            we.field_g = p.field_c;
            p.field_c = var2;
            var1 = 32;
            di.field_g = 0;
            qa.field_r = qa.field_r + 1;
        } else {
            di.field_g = di.field_g + 32;
        }
    }

    final void a(cf param0, int param1) {
        ((vf) this).field_mb = param0.a("", "polar_blackball_collision1", (byte) 127);
        ((vf) this).field_jb = param0.a("polar_pot_ball_pocket2", true, "");
        ((vf) this).field_S = param0.a("", "polar_respot_the_white1", (byte) 126);
        jg discarded$0 = param0.a("", "polar_respot_the_white_penguin", (byte) 121);
        ((vf) this).field_ib = param0.a("", "polar_ball_cushion1", (byte) 122);
        ((vf) this).field_cb = param0.a("", "polar_ball_cushion2", (byte) 126);
        ((vf) this).field_ab = param0.a("", "polar_ball_cushion3", (byte) 123);
        jg discarded$1 = param0.a("", "polar_ball_cushion4", (byte) 125);
        jg discarded$2 = param0.a("", "polar_bg_ice_crack1", (byte) 127);
        ((vf) this).field_eb = param0.a("", "polar_bg_wave1", (byte) 126);
        ((vf) this).field_Z = param0.a("", "polar_bg_wave2", (byte) 124);
        ((vf) this).field_kb = param0.a("", "polar_bg_wave3", (byte) 123);
        ((vf) this).field_V = param0.a("", "polar_bg_wind1", (byte) 126);
        int var3 = -10 % ((param1 - 39) / 38);
        ((vf) this).field_W = param0.a("", "polar_bg_wind2", (byte) 122);
        ((vf) this).field_T = param0.a("", "polar_bg_wind3", (byte) 123);
        ((vf) this).field_db = param0.a("", "polar_bg_wind4", (byte) 121);
        ((vf) this).field_fb = param0.a("", "polar_bg_wind5", (byte) 125);
    }

    final void b(boolean param0) {
        int var2 = 0;
        int var3 = Pool.field_O;
        super.b(param0);
        ci.field_f = 0;
        for (var2 = 0; var2 < ((vf) this).field_U.length; var2++) {
            ((vf) this).field_U[var2].a(-40);
        }
    }

    final void b(int param0, di param1) {
        if (param0 != 5) {
            ((vf) this).field_fb = null;
        }
        ((vf) this).field_B = new dd(param1.a(false, "polar-sky.jpg", ""), (java.awt.Component) (Object) pa.field_K);
    }

    vf() {
        ((vf) this).field_v = 8559779;
        ((vf) this).b(112);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Q = "Stripes";
        field_gb = "hh:mm:ss.ff";
    }
}
