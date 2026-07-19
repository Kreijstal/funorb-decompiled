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
        int var3_int = 0;
        int var4 = Pool.field_O;
        try {
            super.a(param0, param1);
            ci.field_f = ci.field_f + 1;
            for (var3_int = 0; var3_int < this.field_U.length; var3_int++) {
                this.field_U[var3_int].a((vf) (this), 10);
            }
            this.a(24, 50, (byte) -121, new jg[]{this.field_V, this.field_W, this.field_T, this.field_db, this.field_fb}, Pool.field_N);
            this.a(24, 50, (byte) 125, new jg[]{this.field_eb, this.field_Z, this.field_kb}, ca.field_g);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "vf.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, uf param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        pq[] var4 = null;
        int[] var5 = null;
        int[] var6_ref_int__ = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        al var10 = null;
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
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int[] var66 = null;
        int[] var67 = null;
        int[] var68 = null;
        boolean[] var69 = null;
        int[] var70 = null;
        boolean[] var71 = null;
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
        boolean[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int stackIn_21_3 = 0;
        int stackIn_21_4 = 0;
        boolean[] stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        boolean[] stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        boolean[] stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        Object stackIn_36_0 = null;
        int[] stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        pq[] stackIn_36_4 = null;
        Object stackIn_37_0 = null;
        int[] stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        pq[] stackIn_37_4 = null;
        Object stackIn_38_0 = null;
        int[] stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        pq[] stackIn_38_4 = null;
        int stackIn_38_5 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_35_0 = null;
        int[] stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        pq[] stackOut_35_4 = null;
        Object stackOut_37_0 = null;
        int[] stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        int stackOut_37_3 = 0;
        pq[] stackOut_37_4 = null;
        int stackOut_37_5 = 0;
        Object stackOut_36_0 = null;
        int[] stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        pq[] stackOut_36_4 = null;
        int stackOut_36_5 = 0;
        boolean[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        boolean[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        boolean[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        boolean[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        boolean[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        boolean[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        boolean[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        boolean[] stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        int stackOut_20_4 = 0;
        boolean[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        int stackOut_19_4 = 0;
        boolean[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        int stackOut_17_4 = 0;
        boolean[] stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        boolean[] stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        boolean[] stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        var9 = Pool.field_O;
        try {
          L0: {
            L1: {
              var4 = param1.field_I.field_l;
              var37 = f.a((byte) 53, param1.field_ab);
              var14 = var37;
              var5 = var14;
              var36 = var5;
              var13 = var36;
              var11 = var13;
              var6_ref_int__ = var11;
              if (param0 == -55) {
                break L1;
              } else {
                var10 = (al) null;
                this.a((al) null, 25);
                break L1;
              }
            }
            L2: {
              oh.field_d[0] = var36[0] - sb.a(288.0f, true) >> 2124564386;
              oh.field_d[1] = var36[1] - sb.a(144.0f, true) >> 1309211490;
              oh.field_d[2] = var36[2] >> -2021046654;
              if (var6_ref_int__ != oh.field_d) {
                oh.field_d[6] = var36[6];
                oh.field_d[3] = var36[3];
                oh.field_d[7] = var36[7];
                oh.field_d[8] = var36[8];
                oh.field_d[5] = var36[5];
                oh.field_d[11] = var36[11];
                oh.field_d[4] = var36[4];
                oh.field_d[9] = var36[9];
                oh.field_d[10] = var36[10];
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var5[2] = rb.b(var37[2], -4);
              var5[1] = rb.b(var37[1], -4);
              var5[0] = rb.b(var37[0], -4);
              hn.a(-3143);
              this.a(true, param1);
              this.a();
              this.a(oh.field_d, param1.field_eb.b(param0 + -72));
              this.a(false, var37, var4);
              if (-1L == (pd.field_i & 1073741824L ^ -1L)) {
                this.a(var37, (byte) 122, false, var4, false);
                break L3;
              } else {
                break L3;
              }
            }
            var15 = me.field_y;
            var61 = oh.field_d;
            var15.b((byte) 111, 0, var15.field_j.length, var61);
            var17 = gf.field_e;
            var62 = oh.field_d;
            var17.b((byte) -122, 0, var17.field_j.length, var62);
            var3_int = 0;
            L4: while (true) {
              if (bc.field_j.length <= var3_int) {
                L5: {
                  var20 = sa.field_s;
                  var63 = oh.field_d;
                  var20.b((byte) 104, 0, var20.field_j.length, var63);
                  var22 = oe.field_U;
                  var64 = oh.field_d;
                  var22.b((byte) 119, 0, var22.field_j.length, var64);
                  var24 = me.field_y;
                  var65 = oh.field_d;
                  var24.a((byte) -65, 0, var24.field_j.length, var65);
                  var26 = oe.field_U;
                  var66 = oh.field_d;
                  var26.a((byte) -96, 0, var26.field_j.length, var66);
                  var28 = sa.field_s;
                  var67 = oh.field_d;
                  var28.a((byte) -113, 0, var28.field_j.length, var67);
                  if ((pd.field_i & 1073741824L) == 0L) {
                    var6 = 0;
                    L6: while (true) {
                      if (var6 >= var4.length) {
                        break L5;
                      } else {
                        L7: {
                          if (var4[var6].field_s) {
                            this.a(var37, var4[var6]);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        var6++;
                        continue L6;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                L8: {
                  var30 = gf.field_e;
                  var68 = oh.field_d;
                  var69 = bc.field_j;
                  var30.a(false, 0, var30.field_j.length, (byte) 100, var68, var69);
                  if (0L == (1073741824L & pd.field_i)) {
                    L9: {
                      stackOut_35_0 = this;
                      stackOut_35_1 = (int[]) (var5);
                      stackOut_35_2 = 112;
                      stackOut_35_3 = 1;
                      stackOut_35_4 = (pq[]) (var4);
                      stackIn_37_0 = stackOut_35_0;
                      stackIn_37_1 = stackOut_35_1;
                      stackIn_37_2 = stackOut_35_2;
                      stackIn_37_3 = stackOut_35_3;
                      stackIn_37_4 = stackOut_35_4;
                      stackIn_36_0 = stackOut_35_0;
                      stackIn_36_1 = stackOut_35_1;
                      stackIn_36_2 = stackOut_35_2;
                      stackIn_36_3 = stackOut_35_3;
                      stackIn_36_4 = stackOut_35_4;
                      if (param1.field_I.j(83).field_q != 0) {
                        stackOut_37_0 = this;
                        stackOut_37_1 = (int[]) ((Object) stackIn_37_1);
                        stackOut_37_2 = stackIn_37_2;
                        stackOut_37_3 = stackIn_37_3;
                        stackOut_37_4 = (pq[]) ((Object) stackIn_37_4);
                        stackOut_37_5 = 0;
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        stackIn_38_2 = stackOut_37_2;
                        stackIn_38_3 = stackOut_37_3;
                        stackIn_38_4 = stackOut_37_4;
                        stackIn_38_5 = stackOut_37_5;
                        break L9;
                      } else {
                        stackOut_36_0 = this;
                        stackOut_36_1 = (int[]) ((Object) stackIn_36_1);
                        stackOut_36_2 = stackIn_36_2;
                        stackOut_36_3 = stackIn_36_3;
                        stackOut_36_4 = (pq[]) ((Object) stackIn_36_4);
                        stackOut_36_5 = 1;
                        stackIn_38_0 = stackOut_36_0;
                        stackIn_38_1 = stackOut_36_1;
                        stackIn_38_2 = stackOut_36_2;
                        stackIn_38_3 = stackOut_36_3;
                        stackIn_38_4 = stackOut_36_4;
                        stackIn_38_5 = stackOut_36_5;
                        break L9;
                      }
                    }
                    this.a(stackIn_38_1, (byte) stackIn_38_2, stackIn_38_3 != 0, stackIn_38_4, stackIn_38_5 != 0);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L10: {
                  var33 = gf.field_e;
                  var70 = oh.field_d;
                  var71 = bc.field_j;
                  var33.a(true, 0, var33.field_j.length, (byte) 117, var70, var71);
                  if ((pd.field_i & 256L) != 0L) {
                    oe.field_U.a(oh.field_d, 0);
                    gf.field_e.a(oh.field_d, 0);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if ((1073741824L & pd.field_i ^ -1L) == -1L) {
                    param1.q(-1);
                    param1.D(-128);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                break L0;
              } else {
                L12: {
                  var40 = gf.field_e.field_c[var3_int];
                  var19 = var40;
                  var12 = var19;
                  var6_ref_int__ = var12;
                  var7 = 576;
                  var8 = 288;
                  stackOut_11_0 = bc.field_j;
                  stackOut_11_1 = var3_int;
                  stackOut_11_2 = -oh.field_d[0] + var40[0];
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_13_2 = stackOut_11_2;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  if (var40[0] >= -var7) {
                    stackOut_13_0 = (boolean[]) ((Object) stackIn_13_0);
                    stackOut_13_1 = stackIn_13_1;
                    stackOut_13_2 = stackIn_13_2;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    stackIn_15_2 = stackOut_13_2;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    stackIn_14_2 = stackOut_13_2;
                    if (var7 < var40[0]) {
                      stackOut_15_0 = (boolean[]) ((Object) stackIn_15_0);
                      stackOut_15_1 = stackIn_15_1;
                      stackOut_15_2 = stackIn_15_2;
                      stackOut_15_3 = -1;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      stackIn_16_2 = stackOut_15_2;
                      stackIn_16_3 = stackOut_15_3;
                      break L12;
                    } else {
                      stackOut_14_0 = (boolean[]) ((Object) stackIn_14_0);
                      stackOut_14_1 = stackIn_14_1;
                      stackOut_14_2 = stackIn_14_2;
                      stackOut_14_3 = 0;
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_16_1 = stackOut_14_1;
                      stackIn_16_2 = stackOut_14_2;
                      stackIn_16_3 = stackOut_14_3;
                      break L12;
                    }
                  } else {
                    stackOut_12_0 = (boolean[]) ((Object) stackIn_12_0);
                    stackOut_12_1 = stackIn_12_1;
                    stackOut_12_2 = stackIn_12_2;
                    stackOut_12_3 = 1;
                    stackIn_16_0 = stackOut_12_0;
                    stackIn_16_1 = stackOut_12_1;
                    stackIn_16_2 = stackOut_12_2;
                    stackIn_16_3 = stackOut_12_3;
                    break L12;
                  }
                }
                L13: {
                  stackOut_16_0 = (boolean[]) ((Object) stackIn_16_0);
                  stackOut_16_1 = stackIn_16_1;
                  stackOut_16_2 = stackIn_16_2 * stackIn_16_3;
                  stackOut_16_3 = -oh.field_d[1] + var40[1];
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  stackIn_18_3 = stackOut_16_3;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  stackIn_17_3 = stackOut_16_3;
                  if (var40[1] >= -var8) {
                    stackOut_18_0 = (boolean[]) ((Object) stackIn_18_0);
                    stackOut_18_1 = stackIn_18_1;
                    stackOut_18_2 = stackIn_18_2;
                    stackOut_18_3 = stackIn_18_3;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_20_1 = stackOut_18_1;
                    stackIn_20_2 = stackOut_18_2;
                    stackIn_20_3 = stackOut_18_3;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    stackIn_19_3 = stackOut_18_3;
                    if (var40[1] > var8) {
                      stackOut_20_0 = (boolean[]) ((Object) stackIn_20_0);
                      stackOut_20_1 = stackIn_20_1;
                      stackOut_20_2 = stackIn_20_2;
                      stackOut_20_3 = stackIn_20_3;
                      stackOut_20_4 = -1;
                      stackIn_21_0 = stackOut_20_0;
                      stackIn_21_1 = stackOut_20_1;
                      stackIn_21_2 = stackOut_20_2;
                      stackIn_21_3 = stackOut_20_3;
                      stackIn_21_4 = stackOut_20_4;
                      break L13;
                    } else {
                      stackOut_19_0 = (boolean[]) ((Object) stackIn_19_0);
                      stackOut_19_1 = stackIn_19_1;
                      stackOut_19_2 = stackIn_19_2;
                      stackOut_19_3 = stackIn_19_3;
                      stackOut_19_4 = 0;
                      stackIn_21_0 = stackOut_19_0;
                      stackIn_21_1 = stackOut_19_1;
                      stackIn_21_2 = stackOut_19_2;
                      stackIn_21_3 = stackOut_19_3;
                      stackIn_21_4 = stackOut_19_4;
                      break L13;
                    }
                  } else {
                    stackOut_17_0 = (boolean[]) ((Object) stackIn_17_0);
                    stackOut_17_1 = stackIn_17_1;
                    stackOut_17_2 = stackIn_17_2;
                    stackOut_17_3 = stackIn_17_3;
                    stackOut_17_4 = 1;
                    stackIn_21_0 = stackOut_17_0;
                    stackIn_21_1 = stackOut_17_1;
                    stackIn_21_2 = stackOut_17_2;
                    stackIn_21_3 = stackOut_17_3;
                    stackIn_21_4 = stackOut_17_4;
                    break L13;
                  }
                }
                L14: {
                  stackOut_21_0 = (boolean[]) ((Object) stackIn_21_0);
                  stackOut_21_1 = stackIn_21_1;
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_23_1 = stackOut_21_1;
                  stackIn_22_0 = stackOut_21_0;
                  stackIn_22_1 = stackOut_21_1;
                  if (stackIn_21_2 - -(stackIn_21_3 * stackIn_21_4) <= 0) {
                    stackOut_23_0 = (boolean[]) ((Object) stackIn_23_0);
                    stackOut_23_1 = stackIn_23_1;
                    stackOut_23_2 = 0;
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    stackIn_24_2 = stackOut_23_2;
                    break L14;
                  } else {
                    stackOut_22_0 = (boolean[]) ((Object) stackIn_22_0);
                    stackOut_22_1 = stackIn_22_1;
                    stackOut_22_2 = 1;
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_24_1 = stackOut_22_1;
                    stackIn_24_2 = stackOut_22_2;
                    break L14;
                  }
                }
                stackIn_24_0[stackIn_24_1] = stackIn_24_2 != 0;
                var3_int++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var3 = decompiledCaughtException;
            stackOut_46_0 = (RuntimeException) (var3);
            stackOut_46_1 = new StringBuilder().append("vf.W(").append(param0).append(',');
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param1 == null) {
              stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L15;
            } else {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "{...}";
              stackIn_49_0 = stackOut_47_0;
              stackIn_49_1 = stackOut_47_1;
              stackIn_49_2 = stackOut_47_2;
              break L15;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_49_0), stackIn_49_2 + ')');
        }
    }

    public static void e(byte param0) {
        field_Q = null;
        int var1 = 104 / ((param0 - -10) / 36);
        field_gb = null;
        field_nb = null;
    }

    final void c(boolean param0) {
        so dupTemp$2124 = null;
        so dupTemp$2125 = null;
        so dupTemp$2126 = null;
        so dupTemp$2127 = null;
        so dupTemp$2128 = null;
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
        eg var15_ref_eg = null;
        int var16 = 0;
        so[] var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        uf var21 = null;
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
        this.field_U = new vm[-gk.field_hb + mf.field_m];
        var3 = new ko();
        var4 = new ko();
        var5 = new ko();
        var6 = new so();
        var7 = new so();
        var8 = new so();
        var9 = new so(hj.field_a + -vq.field_Ob);
        so dupTemp$2116 = new so(co.field_db + -kg.field_n);
        var10 = dupTemp$2116;
        so dupTemp$2117 = new so((ol.field_d + -er.field_S) * 4);
        var11 = dupTemp$2117;
        so dupTemp$2118 = new so(new so[]{dupTemp$2116, var6, dupTemp$2117});
        gf.field_e = dupTemp$2118;
        so dupTemp$2119 = new so(co.field_db + -kg.field_n);
        var12 = dupTemp$2119;
        so dupTemp$2120 = new so(4 * (mb.field_e + -tg.field_g) + (hf.field_c + -rl.field_f) * 2);
        var13 = dupTemp$2120;
        so dupTemp$2121 = new so(new so[]{dupTemp$2119, var7, dupTemp$2120});
        oe.field_U = dupTemp$2121;
        so dupTemp$2122 = new so(4 * (wj.field_V + -fr.field_t));
        sa.field_s = dupTemp$2122;
        so dupTemp$2123 = new so(new so[]{var8, var9});
        me.field_y = dupTemp$2123;
        var14 = new so(new so[]{dupTemp$2118, dupTemp$2121, dupTemp$2122, dupTemp$2123});
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
                        var21 = (uf) null;
                        this.a((byte) 16, (uf) null);
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
                                    new so(new so[]{var11, var10, var12}).a(false);
                                    new so(new so[]{var6, var7}).a(false);
                                    var14.a(this.field_q, this.field_e, this.field_F, (byte) -79, this.field_u, this.field_C);
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
                                      var49 = this.field_M[var16];
                                      stackOut_32_0 = (so[]) (var17);
                                      stackIn_34_0 = stackOut_32_0;
                                      stackIn_33_0 = stackOut_32_0;
                                      if (param0) {
                                        stackOut_34_0 = (so[]) ((Object) stackIn_34_0);
                                        stackOut_34_1 = 0;
                                        stackIn_35_0 = stackOut_34_0;
                                        stackIn_35_1 = stackOut_34_1;
                                        break L8;
                                      } else {
                                        stackOut_33_0 = (so[]) ((Object) stackIn_33_0);
                                        stackOut_33_1 = 1;
                                        stackIn_35_0 = stackOut_33_0;
                                        stackIn_35_1 = stackOut_33_1;
                                        break L8;
                                      }
                                    }
                                    bh.a(stackIn_35_0, stackIn_35_1 != 0, var49[1], var49[2], this.field_O[var16], var49[0], var18);
                                    var15 += 4;
                                    var2++;
                                    continue L7;
                                  }
                                }
                              } else {
                                var16 = var2;
                                var39 = var13.field_b;
                                var18 = var15;
                                be.a(var18, this.field_M[var16][1], this.field_M[var16][2], 1, var39, this.field_M[var16][0], this.field_O[var16]);
                                var15 += 2;
                                var2++;
                                continue L6;
                              }
                            }
                          } else {
                            var16 = var2;
                            var37 = var13.field_b;
                            var18 = var15;
                            var48 = this.field_M[var16];
                            bh.a(var37, false, var48[1], var48[2], this.field_O[var16], var48[0], var18);
                            var15 += 4;
                            var2++;
                            continue L5;
                          }
                        }
                      } else {
                        var36 = this.field_O[var2];
                        var47 = this.field_M[var2];
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
                      var24 = this.field_O[var2];
                      var33 = new ko();
                      var24.e();
                      if (var24.field_V > -this.field_M[var2][2]) {
                        dupTemp$2124 = hc.a(var24, this.field_M[var2], (byte) 101);
                        var30 = dupTemp$2124;
                        var4.b((byte) -121, new pm(dupTemp$2124));
                        var33.b((byte) -39, new pm(var30));
                        break L9;
                      } else {
                        if (-this.field_M[var2][2] <= var24.field_x) {
                          L10: {
                            var28 = hq.b((byte) 121);
                            var26 = hq.b((byte) 122);
                            stackOut_13_0 = 0;
                            stackOut_13_1 = (eg) (var28);
                            stackOut_13_2 = 0;
                            stackIn_15_0 = stackOut_13_0;
                            stackIn_15_1 = stackOut_13_1;
                            stackIn_15_2 = stackOut_13_2;
                            stackIn_14_0 = stackOut_13_0;
                            stackIn_14_1 = stackOut_13_1;
                            stackIn_14_2 = stackOut_13_2;
                            if (param0) {
                              stackOut_15_0 = stackIn_15_0;
                              stackOut_15_1 = (eg) ((Object) stackIn_15_1);
                              stackOut_15_2 = stackIn_15_2;
                              stackOut_15_3 = 0;
                              stackIn_16_0 = stackOut_15_0;
                              stackIn_16_1 = stackOut_15_1;
                              stackIn_16_2 = stackOut_15_2;
                              stackIn_16_3 = stackOut_15_3;
                              break L10;
                            } else {
                              stackOut_14_0 = stackIn_14_0;
                              stackOut_14_1 = (eg) ((Object) stackIn_14_1);
                              stackOut_14_2 = stackIn_14_2;
                              stackOut_14_3 = 1;
                              stackIn_16_0 = stackOut_14_0;
                              stackIn_16_1 = stackOut_14_1;
                              stackIn_16_2 = stackOut_14_2;
                              stackIn_16_3 = stackOut_14_3;
                              break L10;
                            }
                          }
                          ej.a(stackIn_16_0, stackIn_16_1, stackIn_16_2, stackIn_16_3 != 0, -this.field_M[var2][2], 0, 0, 1, var26, var24);
                          dupTemp$2125 = hc.a(var26, this.field_M[var2], (byte) 101);
                          var27 = dupTemp$2125;
                          var4.b((byte) -51, new pm(dupTemp$2125));
                          var33.b((byte) 125, new pm(var27));
                          dupTemp$2126 = hc.a(var28, this.field_M[var2], (byte) 101);
                          var29 = dupTemp$2126;
                          var3.b((byte) -47, new pm(dupTemp$2126));
                          var33.b((byte) 122, new pm(var29));
                          break L9;
                        } else {
                          dupTemp$2127 = hc.a(var24, this.field_M[var2], (byte) 101);
                          var25 = dupTemp$2127;
                          var3.b((byte) 97, new pm(dupTemp$2127));
                          var33.b((byte) 90, new pm(var25));
                          break L9;
                        }
                      }
                    }
                    var31 = this.field_O[mp.field_W + (var2 - gk.field_hb)];
                    var15_ref_eg = var31;
                    var31.e();
                    dupTemp$2128 = hc.a(var15_ref_eg, this.field_M[mp.field_W + -gk.field_hb + var2], (byte) 101);
                    var32 = dupTemp$2128;
                    var5.b((byte) 108, new pm(dupTemp$2128));
                    var33.b((byte) 84, new pm(var32));
                    this.field_U[-gk.field_hb + var2] = new vm(new so(var33));
                    var2++;
                    continue L2;
                  }
                }
              } else {
                var9.field_b[-vq.field_Ob + var2] = hc.a(this.field_O[var2], this.field_M[var2], (byte) 101);
                var2++;
                continue L1;
              }
            }
          } else {
            L11: {
              if (ec.field_f >= this.field_O[var2].field_x + this.field_M[var2][2]) {
                break L11;
              } else {
                ec.field_f = this.field_M[var2][2] - -this.field_O[var2].field_x;
                break L11;
              }
            }
            var23 = hq.b((byte) 122);
            var22 = hq.b((byte) 121);
            ej.a(0, var23, 0, false, -this.field_M[var2][2], 0, 0, 1, var22, this.field_O[var2]);
            var12.field_b[var2 - kg.field_n] = hc.a(var22, this.field_M[var2], (byte) 101);
            var10.field_b[-kg.field_n + var2] = hc.a(var23, this.field_M[var2], (byte) 101);
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
        int incrementValue$62 = 0;
        int incrementValue$63 = 0;
        int incrementValue$64 = 0;
        int incrementValue$65 = 0;
        int incrementValue$66 = 0;
        int incrementValue$67 = 0;
        int incrementValue$68 = 0;
        int incrementValue$69 = 0;
        int incrementValue$70 = 0;
        int incrementValue$71 = 0;
        int incrementValue$72 = 0;
        int incrementValue$73 = 0;
        int incrementValue$74 = 0;
        int incrementValue$75 = 0;
        int incrementValue$76 = 0;
        int incrementValue$77 = 0;
        int incrementValue$78 = 0;
        int incrementValue$79 = 0;
        int incrementValue$80 = 0;
        int incrementValue$81 = 0;
        int incrementValue$82 = 0;
        int incrementValue$83 = 0;
        int incrementValue$84 = 0;
        int incrementValue$85 = 0;
        int incrementValue$86 = 0;
        int incrementValue$87 = 0;
        int incrementValue$88 = 0;
        int incrementValue$89 = 0;
        int incrementValue$90 = 0;
        int incrementValue$91 = 0;
        int incrementValue$92 = 0;
        int incrementValue$93 = 0;
        int incrementValue$94 = 0;
        int incrementValue$95 = 0;
        int incrementValue$96 = 0;
        int incrementValue$97 = 0;
        int incrementValue$98 = 0;
        int incrementValue$99 = 0;
        int incrementValue$100 = 0;
        int incrementValue$101 = 0;
        int incrementValue$102 = 0;
        int incrementValue$103 = 0;
        int incrementValue$104 = 0;
        int incrementValue$105 = 0;
        int incrementValue$106 = 0;
        int incrementValue$107 = 0;
        int incrementValue$108 = 0;
        int incrementValue$109 = 0;
        int incrementValue$110 = 0;
        int incrementValue$111 = 0;
        int incrementValue$112 = 0;
        int incrementValue$113 = 0;
        int incrementValue$114 = 0;
        int incrementValue$115 = 0;
        int incrementValue$116 = 0;
        int incrementValue$117 = 0;
        int incrementValue$118 = 0;
        int incrementValue$119 = 0;
        int incrementValue$120 = 0;
        int incrementValue$121 = 0;
        int incrementValue$122 = 0;
        eg discarded$123 = null;
        RuntimeException var3 = null;
        int var3_int = 0;
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
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var14 = Pool.field_O;
        try {
          L0: {
            var3_int = 0;
            this.field_O = new eg[61];
            mp.field_W = var3_int;
            incrementValue$62 = var3_int;
            var3_int++;
            this.field_O[incrementValue$62] = eg.a(param0, "", "polar_table/ice_isle_us_a");
            incrementValue$63 = var3_int;
            var3_int++;
            this.field_O[incrementValue$63] = eg.a(param0, "", "polar_table/ice_isle_us_b");
            incrementValue$64 = var3_int;
            var3_int++;
            this.field_O[incrementValue$64] = eg.a(param0, "", "polar_table/ice_isle_us_c");
            incrementValue$65 = var3_int;
            var3_int++;
            this.field_O[incrementValue$65] = eg.a(param0, "", "polar_table/ice_isle_us_d");
            incrementValue$66 = var3_int;
            var3_int++;
            this.field_O[incrementValue$66] = eg.a(param0, "", "polar_table/ice_isle_us_e");
            incrementValue$67 = var3_int;
            var3_int++;
            this.field_O[incrementValue$67] = eg.a(param0, "", "polar_table/ice_isle_us_f");
            incrementValue$68 = var3_int;
            var3_int++;
            this.field_O[incrementValue$68] = eg.a(param0, "", "polar_table/ice_isle_us_g");
            incrementValue$69 = var3_int;
            var3_int++;
            this.field_O[incrementValue$69] = eg.a(param0, "", "polar_table/ice_isle_us_h");
            incrementValue$70 = var3_int;
            var3_int++;
            this.field_O[incrementValue$70] = eg.a(param0, "", "polar_table/ice_isle_us_i");
            incrementValue$71 = var3_int;
            var3_int++;
            this.field_O[incrementValue$71] = eg.a(param0, "", "polar_table/ice_isle_us_j");
            gk.field_hb = var3_int;
            incrementValue$72 = var3_int;
            var3_int++;
            this.field_O[incrementValue$72] = eg.a(param0, "", "polar_table/ice_isle_a");
            incrementValue$73 = var3_int;
            var3_int++;
            this.field_O[incrementValue$73] = eg.a(param0, "", "polar_table/ice_isle_b");
            incrementValue$74 = var3_int;
            var3_int++;
            this.field_O[incrementValue$74] = eg.a(param0, "", "polar_table/ice_isle_c");
            incrementValue$75 = var3_int;
            var3_int++;
            this.field_O[incrementValue$75] = eg.a(param0, "", "polar_table/ice_isle_d");
            incrementValue$76 = var3_int;
            var3_int++;
            this.field_O[incrementValue$76] = eg.a(param0, "", "polar_table/ice_isle_e");
            incrementValue$77 = var3_int;
            var3_int++;
            this.field_O[incrementValue$77] = eg.a(param0, "", "polar_table/ice_isle_f");
            incrementValue$78 = var3_int;
            var3_int++;
            this.field_O[incrementValue$78] = eg.a(param0, "", "polar_table/ice_isle_g");
            incrementValue$79 = var3_int;
            var3_int++;
            this.field_O[incrementValue$79] = eg.a(param0, "", "polar_table/ice_isle_h");
            incrementValue$80 = var3_int;
            var3_int++;
            this.field_O[incrementValue$80] = eg.a(param0, "", "polar_table/ice_isle_i");
            incrementValue$81 = var3_int;
            var3_int++;
            this.field_O[incrementValue$81] = eg.a(param0, "", "polar_table/ice_isle_j");
            vq.field_Ob = var3_int;
            mf.field_m = var3_int;
            incrementValue$82 = var3_int;
            var3_int++;
            this.field_O[incrementValue$82] = eg.a(param0, "", "polar_table/ice_main_us_a");
            incrementValue$83 = var3_int;
            var3_int++;
            this.field_O[incrementValue$83] = eg.a(param0, "", "polar_table/ice_main_us_b");
            incrementValue$84 = var3_int;
            var3_int++;
            this.field_O[incrementValue$84] = eg.a(param0, "", "polar_table/ice_main_us_c");
            incrementValue$85 = var3_int;
            var3_int++;
            this.field_O[incrementValue$85] = eg.a(param0, "", "polar_table/ice_main_us_d");
            incrementValue$86 = var3_int;
            var3_int++;
            this.field_O[incrementValue$86] = eg.a(param0, "", "polar_table/ice_main_us_e");
            incrementValue$87 = var3_int;
            var3_int++;
            this.field_O[incrementValue$87] = eg.a(param0, "", "polar_table/ice_main_us_f");
            incrementValue$88 = var3_int;
            var3_int++;
            this.field_O[incrementValue$88] = eg.a(param0, "", "polar_table/ice_main_us_g");
            incrementValue$89 = var3_int;
            var3_int++;
            this.field_O[incrementValue$89] = eg.a(param0, "", "polar_table/ice_main_us_h");
            incrementValue$90 = var3_int;
            var3_int++;
            this.field_O[incrementValue$90] = eg.a(param0, "", "polar_table/ice_main_us_i");
            incrementValue$91 = var3_int;
            var3_int++;
            this.field_O[incrementValue$91] = eg.a(param0, "", "polar_table/ice_main_us_j");
            incrementValue$92 = var3_int;
            var3_int++;
            this.field_O[incrementValue$92] = eg.a(param0, "", "polar_table/ice_main_us_k");
            incrementValue$93 = var3_int;
            var3_int++;
            this.field_O[incrementValue$93] = eg.a(param0, "", "polar_table/ice_main_us_l");
            incrementValue$94 = var3_int;
            var3_int++;
            this.field_O[incrementValue$94] = eg.a(param0, "", "polar_table/ice_main_us_m");
            incrementValue$95 = var3_int;
            var3_int++;
            this.field_O[incrementValue$95] = eg.a(param0, "", "polar_table/ice_main_us_n");
            incrementValue$96 = var3_int;
            var3_int++;
            this.field_O[incrementValue$96] = eg.a(param0, "", "polar_table/ice_main_us_o");
            incrementValue$97 = var3_int;
            var3_int++;
            this.field_O[incrementValue$97] = eg.a(param0, "", "polar_table/ice_main_us_p");
            hj.field_a = var3_int;
            incrementValue$98 = var3_int;
            var3_int++;
            this.field_O[incrementValue$98] = eg.a(param0, "", "polar_table/ice_sea");
            kg.field_n = var3_int;
            incrementValue$99 = var3_int;
            var3_int++;
            this.field_O[incrementValue$99] = eg.a(param0, "", "polar_table/ice_main_a");
            incrementValue$100 = var3_int;
            var3_int++;
            this.field_O[incrementValue$100] = eg.a(param0, "", "polar_table/ice_main_b");
            incrementValue$101 = var3_int;
            var3_int++;
            this.field_O[incrementValue$101] = eg.a(param0, "", "polar_table/ice_main_c");
            incrementValue$102 = var3_int;
            var3_int++;
            this.field_O[incrementValue$102] = eg.a(param0, "", "polar_table/ice_main_d");
            incrementValue$103 = var3_int;
            var3_int++;
            this.field_O[incrementValue$103] = eg.a(param0, "", "polar_table/ice_main_e");
            incrementValue$104 = var3_int;
            var3_int++;
            this.field_O[incrementValue$104] = eg.a(param0, "", "polar_table/ice_main_f");
            incrementValue$105 = var3_int;
            var3_int++;
            this.field_O[incrementValue$105] = eg.a(param0, "", "polar_table/ice_main_g");
            incrementValue$106 = var3_int;
            var3_int++;
            this.field_O[incrementValue$106] = eg.a(param0, "", "polar_table/ice_main_h");
            incrementValue$107 = var3_int;
            var3_int++;
            this.field_O[incrementValue$107] = eg.a(param0, "", "polar_table/ice_main_i");
            incrementValue$108 = var3_int;
            var3_int++;
            this.field_O[incrementValue$108] = eg.a(param0, "", "polar_table/ice_main_j");
            incrementValue$109 = var3_int;
            var3_int++;
            this.field_O[incrementValue$109] = eg.a(param0, "", "polar_table/ice_main_k");
            incrementValue$110 = var3_int;
            var3_int++;
            this.field_O[incrementValue$110] = eg.a(param0, "", "polar_table/ice_main_l");
            incrementValue$111 = var3_int;
            var3_int++;
            this.field_O[incrementValue$111] = eg.a(param0, "", "polar_table/ice_main_m");
            incrementValue$112 = var3_int;
            var3_int++;
            this.field_O[incrementValue$112] = eg.a(param0, "", "polar_table/ice_main_n");
            incrementValue$113 = var3_int;
            var3_int++;
            this.field_O[incrementValue$113] = eg.a(param0, "", "polar_table/ice_main_o");
            incrementValue$114 = var3_int;
            var3_int++;
            this.field_O[incrementValue$114] = eg.a(param0, "", "polar_table/ice_main_p");
            tg.field_g = var3_int;
            co.field_db = var3_int;
            incrementValue$115 = var3_int;
            var3_int++;
            this.field_O[incrementValue$115] = eg.a(param0, "", "polar_table/ice_hole_a");
            rl.field_f = var3_int;
            mb.field_e = var3_int;
            incrementValue$116 = var3_int;
            var3_int++;
            this.field_O[incrementValue$116] = eg.a(param0, "", "polar_table/ice_hole_b");
            hf.field_c = var3_int;
            er.field_S = var3_int;
            incrementValue$117 = var3_int;
            var3_int++;
            this.field_O[incrementValue$117] = eg.a(param0, "", "polar_table/ice_corner");
            incrementValue$118 = var3_int;
            var3_int++;
            this.field_O[incrementValue$118] = eg.a(param0, "", "polar_table/ice_side_a");
            incrementValue$119 = var3_int;
            var3_int++;
            this.field_O[incrementValue$119] = eg.a(param0, "", "polar_table/ice_side_b");
            incrementValue$120 = var3_int;
            var3_int++;
            this.field_O[incrementValue$120] = eg.a(param0, "", "polar_table/ice_side_c");
            fr.field_t = var3_int;
            ol.field_d = var3_int;
            incrementValue$121 = var3_int;
            var3_int++;
            this.field_O[incrementValue$121] = eg.a(param0, "", "polar_table/ice_top_a");
            incrementValue$122 = var3_int;
            var3_int++;
            this.field_O[incrementValue$122] = eg.a(param0, "", "polar_table/ice_top_b");
            wj.field_V = var3_int;
            this.field_A = new jk();
            this.field_A.a(eg.a(param0, "", "cues/ice_cue"), (byte) -105);
            var4 = 0;
            L1: while (true) {
              if (this.field_O.length <= var4) {
                var5 = 2147483647;
                var6 = -2147483648;
                var7 = 2147483647;
                var8 = -2147483648;
                var9 = 2147483647;
                var10 = -2147483648;
                var4 = fr.field_t;
                L2: while (true) {
                  if (wj.field_V <= var4) {
                    var7 = 2 * var7 - var8;
                    var5 = -var6 + 2 * var5;
                    var11 = (var5 + var6) / 2;
                    var12 = (var7 + var8) / 2;
                    var13 = var10;
                    var4 = 0;
                    L3: while (true) {
                      if (var4 >= this.field_O.length) {
                        L4: {
                          this.field_M = new int[this.field_O.length][3];
                          if (param1 < -43) {
                            break L4;
                          } else {
                            this.field_V = (jg) null;
                            break L4;
                          }
                        }
                        var4 = 0;
                        L5: while (true) {
                          if (this.field_O.length <= var4) {
                            break L0;
                          } else {
                            ln.a(this.field_M[var4], 0, this.field_O[var4]);
                            var4++;
                            continue L5;
                          }
                        }
                      } else {
                        discarded$123 = cq.a(var11, 57, var13, this.field_O[var4], var12);
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    L6: {
                      d.a(this.field_O[var4], -23109);
                      if (this.field_O[var4].field_D < var5) {
                        var5 = this.field_O[var4].field_D;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      if (var9 <= this.field_O[var4].field_V) {
                        break L7;
                      } else {
                        var9 = this.field_O[var4].field_V;
                        break L7;
                      }
                    }
                    L8: {
                      if (this.field_O[var4].field_S > var8) {
                        var8 = this.field_O[var4].field_S;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (var6 < this.field_O[var4].field_w) {
                        var6 = this.field_O[var4].field_w;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (this.field_O[var4].field_y < var7) {
                        var7 = this.field_O[var4].field_y;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (this.field_O[var4].field_x > var10) {
                        var10 = this.field_O[var4].field_x;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    var4++;
                    continue L2;
                  }
                }
              } else {
                db.a(0, this.field_O[var4]);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var3 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) (var3);
            stackOut_33_1 = new StringBuilder().append("vf.KA(");
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L12;
            } else {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L12;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ',' + param1 + ')');
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
        this.a((byte) 119);
    }

    final void a(al param0, int param1) {
        int[] var6 = null;
        int[] var5 = null;
        int[] var4 = null;
        super.a(param0, param1 + 0);
        if (param1 != 21894) {
            return;
        }
        try {
            var6 = ta.a(new int[]{0, 3368601, 3, 3381708}, 101);
            var5 = var6;
            var4 = var5;
            int[] var3 = var4;
            oo.field_w = ta.a(new int[]{0, var6[0], 128, var6[1], 256, var6[2]}, param1 ^ 21919);
            pi.c();
            this.a(86, param0.field_l.length);
            vb.field_p = new int[65536];
            we.field_g = new int[65536];
            p.field_c = new int[65536];
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "vf.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, di param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.field_b = cg.a(param1, "", "pool_polar");
              this.field_i = cg.a(param1, "", "pool_polar_win_jingle");
              this.field_n = cg.a(param1, "", "pool_polar_lose_jingle");
              if (param0 == 1) {
                break L1;
              } else {
                this.d(true);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("vf.Q(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        kf discarded$10 = null;
        kf discarded$11 = null;
        kf discarded$12 = null;
        kf discarded$13 = null;
        kf discarded$14 = null;
        kf discarded$15 = null;
        kf discarded$16 = null;
        kf discarded$17 = null;
        kf discarded$18 = null;
        kf discarded$19 = null;
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
                discarded$10 = kp.a(100, this.field_cb, param3, param1);
                break L0;
              } else {
                if (var6 != 2) {
                  break L0;
                } else {
                  discarded$11 = kp.a(100, this.field_ab, param3, param1);
                  break L0;
                }
              }
            } else {
              discarded$12 = kp.a(100, this.field_ib, param3, param1);
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
                      if (var6 == 0) {
                        discarded$13 = kp.a(100, this.field_Y, param3, param1);
                        break L0;
                      } else {
                        if (-2 == (var6 ^ -1)) {
                          discarded$14 = kp.a(100, this.field_X, param3, param1);
                          break L0;
                        } else {
                          if (6 == var6) {
                            discarded$15 = kp.a(100, this.field_S, param3, param1);
                            System.out.println("playing respot the white");
                            break L0;
                          } else {
                            if (4 == var6) {
                              discarded$16 = kp.a(100, this.field_jb, param3, param1);
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
                discarded$17 = kp.a(100, this.field_hb, param3, param1);
                break L0;
              } else {
                discarded$18 = kp.a(100, this.field_bb, param3, param1);
                break L0;
              }
            } else {
              discarded$19 = kp.a(100, this.field_mb, param3, param1);
              break L0;
            }
          }
        }
    }

    final void c(int param0, di param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -23569) {
                break L1;
              } else {
                this.field_T = (jg) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("vf.OA(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    private final void a(boolean param0, uf param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              var3_int = param1.field_eb.b(-128);
              if (param0) {
                break L1;
              } else {
                vf.e((byte) -126);
                break L1;
              }
            }
            L2: {
              var4 = this.field_B.field_z << -2143569535;
              var5 = this.field_B.field_A << -744787231;
              if ((var3_int ^ -1) < -1) {
                var6 = (int)((double)var4 * -param1.field_eb.a(param0) / 2.0 / 3.141592653589793);
                var7 = -var5 + var3_int;
                this.field_B.c(var6 + -var4, var7, var4, var5);
                if (-640 + var4 > var6) {
                  this.field_B.c(var6, var7, var4, var5);
                  break L2;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("vf.NA(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    private final void a() {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int incrementValue$0 = 0;
        int[] var2 = null;
        int var1 = di.field_g + 32;
        for (var2_int = di.field_g; var2_int < var1; var2_int++) {
            var3 = var2_int * 256;
            for (var4 = 0; var4 < 256; var4++) {
                incrementValue$0 = var3;
                var3++;
                vb.field_p[incrementValue$0] = pi.a(var4 << 6, var2_int << 6, qa.field_r << 7, oo.field_w, 128, 6);
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
        jg discarded$3 = null;
        jg discarded$4 = null;
        jg discarded$5 = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            this.field_mb = param0.a("", "polar_blackball_collision1", (byte) 127);
            this.field_jb = param0.a("polar_pot_ball_pocket2", true, "");
            this.field_S = param0.a("", "polar_respot_the_white1", (byte) 126);
            discarded$3 = param0.a("", "polar_respot_the_white_penguin", (byte) 121);
            this.field_ib = param0.a("", "polar_ball_cushion1", (byte) 122);
            this.field_cb = param0.a("", "polar_ball_cushion2", (byte) 126);
            this.field_ab = param0.a("", "polar_ball_cushion3", (byte) 123);
            discarded$4 = param0.a("", "polar_ball_cushion4", (byte) 125);
            discarded$5 = param0.a("", "polar_bg_ice_crack1", (byte) 127);
            this.field_eb = param0.a("", "polar_bg_wave1", (byte) 126);
            this.field_Z = param0.a("", "polar_bg_wave2", (byte) 124);
            this.field_kb = param0.a("", "polar_bg_wave3", (byte) 123);
            this.field_V = param0.a("", "polar_bg_wind1", (byte) 126);
            var3_int = -10 % ((param1 - 39) / 38);
            this.field_W = param0.a("", "polar_bg_wind2", (byte) 122);
            this.field_T = param0.a("", "polar_bg_wind3", (byte) 123);
            this.field_db = param0.a("", "polar_bg_wind4", (byte) 121);
            this.field_fb = param0.a("", "polar_bg_wind5", (byte) 125);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var3);
            stackOut_2_1 = new StringBuilder().append("vf.M(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
    }

    final void b(boolean param0) {
        int var2 = 0;
        int var3 = Pool.field_O;
        super.b(param0);
        ci.field_f = 0;
        for (var2 = 0; var2 < this.field_U.length; var2++) {
            this.field_U[var2].a(-40);
        }
    }

    final void b(int param0, di param1) {
        try {
            if (param0 != 5) {
                this.field_fb = (jg) null;
            }
            this.field_B = new dd(param1.a(false, "polar-sky.jpg", ""), (java.awt.Component) ((Object) pa.field_K));
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "vf.JA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    vf() {
        this.field_v = 8559779;
        this.b(112);
    }

    static {
        field_Q = "Stripes";
        field_gb = "hh:mm:ss.ff";
    }
}
