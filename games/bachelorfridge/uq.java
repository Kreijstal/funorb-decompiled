/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class uq extends sna {
    private sna field_wb;
    private sna field_Fb;
    private int field_vb;
    private sna field_yb;
    long field_Eb;
    private daa field_Db;
    static kv[] field_zb;
    private sna[] field_Bb;
    private sna field_Gb;
    private sna field_Ab;
    private sna field_xb;
    private StringBuilder field_Cb;

    final int a(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        daa stackIn_6_0 = null;
        daa stackIn_7_0 = null;
        daa stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        sna stackIn_14_0 = null;
        sna stackIn_15_0 = null;
        sna stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        daa stackOut_5_0 = null;
        daa stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        daa stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        sna stackOut_13_0 = null;
        sna stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        sna stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        L0: {
          var4 = BachelorFridge.field_y;
          ((uq) this).a(19842, param0);
          if (((uq) this).field_yb != null) {
            L1: {
              ((uq) this).field_yb.field_Z = ((uq) this).field_Cb.toString();
              ((uq) this).field_yb.field_kb = (((uq) this).field_sb - ((uq) this).field_yb.field_jb.a(((uq) this).field_yb.field_Z)) / 2;
              ((uq) this).field_yb.field_sb = ((uq) this).field_sb + -((uq) this).field_yb.field_kb;
              if (((uq) this).field_Db != null) {
                if (-1 == (((uq) this).field_Db.field_R ^ -1)) {
                  break L1;
                } else {
                  L2: {
                    stackOut_5_0 = ((uq) this).field_Db;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (((uq) this).field_Db.field_t) {
                      stackOut_7_0 = (daa) (Object) stackIn_7_0;
                      stackOut_7_1 = 0;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      break L2;
                    } else {
                      stackOut_6_0 = (daa) (Object) stackIn_6_0;
                      stackOut_6_1 = 1;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      break L2;
                    }
                  }
                  ((daa) (Object) stackIn_8_0).field_t = stackIn_8_1 != 0;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            var3 = 0;
            L3: while (true) {
              if (cja.field_v <= var3) {
                break L0;
              } else {
                if (((uq) this).field_Bb[var3] != null) {
                  L4: {
                    stackOut_13_0 = ((uq) this).field_Bb[var3];
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_14_0 = stackOut_13_0;
                    if (-1 <= (((uq) this).field_Cb.length() ^ -1)) {
                      stackOut_15_0 = (sna) (Object) stackIn_15_0;
                      stackOut_15_1 = 0;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      break L4;
                    } else {
                      stackOut_14_0 = (sna) (Object) stackIn_14_0;
                      stackOut_14_1 = 1;
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_16_1 = stackOut_14_1;
                      break L4;
                    }
                  }
                  ((sna) (Object) stackIn_16_0).field_u = stackIn_16_1 != 0;
                  if (((uq) this).field_Bb[var3].field_u) {
                    if (((uq) this).field_Bb[var3].field_R != 0) {
                      return var3;
                    } else {
                      var3++;
                      continue L3;
                    }
                  } else {
                    var3++;
                    continue L3;
                  }
                } else {
                  var3++;
                  continue L3;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L5: {
          if (param1) {
            break L5;
          } else {
            ((uq) this).field_wb = null;
            break L5;
          }
        }
        if (((uq) this).field_Fb.field_R == 0) {
          L6: {
            if (!param0) {
              break L6;
            } else {
              if (lf.field_c == 0) {
                break L6;
              } else {
                if (0 == ((uq) this).field_R) {
                  return -1;
                } else {
                  break L6;
                }
              }
            }
          }
          return ((uq) this).field_vb;
        } else {
          return -1;
        }
    }

    private final int a(int param0, sna param1, byte param2, String param3, sna param4, int param5) {
        if (param2 >= -44) {
            field_zb = null;
        }
        sna var7 = new sna(0L, param4, 0, param5, param0, 24, param3);
        param5 += 32;
        param1.a(-1, var7);
        return param5;
    }

    private final int a(int param0, int param1, sna param2, int param3, sna param4) {
        param0 += 8;
        int var6 = param2.field_jb.a(param2.field_Z, -(2 * param2.field_L) + param1, param2.field_B);
        param2.a(var6, param3 + 44810, param1, 0, param0);
        if (param3 != -13403) {
            return 89;
        }
        param0 = param0 + (0 + var6);
        param4.a(-1, param2);
        return param0;
    }

    final String h(byte param0) {
        if (param0 != 82) {
            return null;
        }
        return ((uq) this).field_Cb.toString();
    }

    final static void h(int param0) {
        baa.e(17035);
        hba.a(true, wha.field_a);
        gs.field_f = null;
        int var1 = 3;
        int var2 = 0;
        int var3 = 2;
        int var4 = 1;
        int var5 = 3;
        String[] var6 = new String[]{gaa.field_l};
        if (param0 != -28716) {
            uq.h(-43);
        }
        int var7 = 0;
        op var8 = new op(var1, var2, var3, var4, var5, var6);
        eaa var9 = mg.field_m.field_e.field_m;
        rk[] var10 = new rk[var9.g(param0 + 28716)];
        int discarded$0 = var9.a((byte) 88, (bw[]) (Object) var10);
        gj var11 = new gj(var8, var7, var10, false);
        hp.field_c = 0;
        dj.field_c = var11;
        hia.c((byte) -124);
        qi.a((byte) 78);
        kaa.field_m = -1;
        sia.field_h = true;
        dh.a((byte) 58, var2);
    }

    public static void f(int param0) {
        if (param0 < 7) {
            return;
        }
        field_zb = null;
    }

    final boolean f(byte param0) {
        if (!((((uq) this).field_vb ^ -1) == 1)) {
            return false;
        }
        if (gf.field_k == 13) {
            ((uq) this).field_vb = -1;
        }
        if (param0 >= -101) {
            String discarded$0 = ((uq) this).h((byte) -125);
            return true;
        }
        return true;
    }

    uq(int param0, int param1, int param2, int param3, int param4, sna param5, sna param6, sna param7, sna param8, daa param9, sna param10, String param11, long param12) {
        super(0L, param5);
        int var15 = 0;
        sna[] var15_ref_sna__ = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        sna[] var28 = null;
        Object stackIn_4_0 = null;
        daa stackIn_4_1 = null;
        daa stackIn_4_2 = null;
        long stackIn_4_3 = 0L;
        daa stackIn_4_4 = null;
        Object stackIn_5_0 = null;
        daa stackIn_5_1 = null;
        daa stackIn_5_2 = null;
        long stackIn_5_3 = 0L;
        daa stackIn_5_4 = null;
        Object stackIn_6_0 = null;
        daa stackIn_6_1 = null;
        daa stackIn_6_2 = null;
        long stackIn_6_3 = 0L;
        daa stackIn_6_4 = null;
        Object stackIn_7_0 = null;
        daa stackIn_7_1 = null;
        daa stackIn_7_2 = null;
        long stackIn_7_3 = 0L;
        daa stackIn_7_4 = null;
        String stackIn_7_5 = null;
        sna stackIn_13_0 = null;
        sna stackIn_14_0 = null;
        sna stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackOut_3_0 = null;
        daa stackOut_3_1 = null;
        daa stackOut_3_2 = null;
        long stackOut_3_3 = 0L;
        daa stackOut_3_4 = null;
        Object stackOut_4_0 = null;
        daa stackOut_4_1 = null;
        daa stackOut_4_2 = null;
        long stackOut_4_3 = 0L;
        daa stackOut_4_4 = null;
        Object stackOut_6_0 = null;
        daa stackOut_6_1 = null;
        daa stackOut_6_2 = null;
        long stackOut_6_3 = 0L;
        daa stackOut_6_4 = null;
        String stackOut_6_5 = null;
        Object stackOut_5_0 = null;
        daa stackOut_5_1 = null;
        daa stackOut_5_2 = null;
        long stackOut_5_3 = 0L;
        daa stackOut_5_4 = null;
        String stackOut_5_5 = null;
        sna stackOut_12_0 = null;
        sna stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        sna stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        L0: {
          ((uq) this).field_vb = -2;
          ((uq) this).field_Eb = param12;
          ((uq) this).field_Gb = new sna(0L, param6, dka.field_D.toUpperCase());
          ((uq) this).field_Gb.field_N = 1;
          ((uq) this).a(-1, ((uq) this).field_Gb);
          ((uq) this).field_Fb = new sna(0L, param7);
          ((uq) this).field_Gb.a(-1, ((uq) this).field_Fb);
          ((uq) this).field_Ab = new sna(0L, (sna) null);
          ((uq) this).a(-1, ((uq) this).field_Ab);
          if (param11 == null) {
            ((uq) this).field_wb = new sna(0L, param8, eha.field_r);
            ((uq) this).field_wb.field_gb = 11184810;
            ((uq) this).field_wb.field_N = 1;
            ((uq) this).field_Ab.a(-1, ((uq) this).field_wb);
            var15 = 226;
            var16 = 10;
            var17 = ((uq) this).field_wb.field_jb.b(((uq) this).field_wb.field_Z, var15);
            ((uq) this).field_wb.a(var17 * rg.field_h, 31407, var15, 13, var16);
            var16 = var16 + var17 * rg.field_h;
            ((uq) this).field_Ab.a(var16 + 10, 31407, 26 + var15, 0, 24);
            ((uq) this).field_Ab.field_eb = mu.a(11579568, 3, ((uq) this).field_Ab.field_p, 8421504, 2105376, (byte) 17);
            var18 = 13 + var15 + 13;
            var19 = 34 + var16;
            var20 = oi.a(param2, var18, param0, -21264);
            var21 = nga.a(var19, param1, (byte) 124, param3);
            ((uq) this).a(var19, 31407, var18, var20, var21);
            break L0;
          } else {
            L1: {
              L2: {
                ((uq) this).field_wb = new sna(0L, param8, dia.field_D);
                ((uq) this).field_wb.field_N = 1;
                ((uq) this).field_wb.field_gb = 11184810;
                ((uq) this).field_Ab.a(-1, ((uq) this).field_wb);
                ((uq) this).field_xb = new sna(0L, param8, vj.field_q);
                ((uq) this).field_xb.field_gb = 11184810;
                ((uq) this).field_xb.field_N = 1;
                ((uq) this).field_Ab.a(-1, ((uq) this).field_xb);
                ((uq) this).field_yb = new sna(0L, param8);
                ((uq) this).field_yb.field_gb = 16764006;
                ((uq) this).field_Ab.a(-1, ((uq) this).field_yb);
                ((uq) this).field_yb.field_pb = "|";
                if (hka.field_i >= 5) {
                  break L2;
                } else {
                  if (-3 < (hea.field_r ^ -1)) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                L4: {
                  stackOut_3_0 = this;
                  stackOut_3_1 = null;
                  stackOut_3_2 = null;
                  stackOut_3_3 = 0L;
                  stackOut_3_4 = (daa) param9;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  stackIn_5_2 = stackOut_3_2;
                  stackIn_5_3 = stackOut_3_3;
                  stackIn_5_4 = stackOut_3_4;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  stackIn_4_2 = stackOut_3_2;
                  stackIn_4_3 = stackOut_3_3;
                  stackIn_4_4 = stackOut_3_4;
                  if (7 <= hka.field_i) {
                    break L4;
                  } else {
                    stackOut_4_0 = this;
                    stackOut_4_1 = null;
                    stackOut_4_2 = null;
                    stackOut_4_3 = stackIn_4_3;
                    stackOut_4_4 = (daa) (Object) stackIn_4_4;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    stackIn_6_2 = stackOut_4_2;
                    stackIn_6_3 = stackOut_4_3;
                    stackIn_6_4 = stackOut_4_4;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    stackIn_5_2 = stackOut_4_2;
                    stackIn_5_3 = stackOut_4_3;
                    stackIn_5_4 = stackOut_4_4;
                    if (hea.field_r < 2) {
                      stackOut_6_0 = this;
                      stackOut_6_1 = null;
                      stackOut_6_2 = null;
                      stackOut_6_3 = stackIn_6_3;
                      stackOut_6_4 = (daa) (Object) stackIn_6_4;
                      stackOut_6_5 = lq.field_z;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      stackIn_7_2 = stackOut_6_2;
                      stackIn_7_3 = stackOut_6_3;
                      stackIn_7_4 = stackOut_6_4;
                      stackIn_7_5 = stackOut_6_5;
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                stackOut_5_0 = this;
                stackOut_5_1 = null;
                stackOut_5_2 = null;
                stackOut_5_3 = stackIn_5_3;
                stackOut_5_4 = (daa) (Object) stackIn_5_4;
                stackOut_5_5 = nw.field_r;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_7_2 = stackOut_5_2;
                stackIn_7_3 = stackOut_5_3;
                stackIn_7_4 = stackOut_5_4;
                stackIn_7_5 = stackOut_5_5;
                break L3;
              }
              new daa(stackIn_7_3, (daa) (Object) stackIn_7_4, (String) (Object) stackIn_7_5);
              ((uq) this).field_Db = (daa) (Object) stackIn_7_1;
              ((uq) this).field_Ab.a(-1, (sna) (Object) ((uq) this).field_Db);
              break L1;
            }
            var28 = new sna[3];
            var15_ref_sna__ = var28;
            var28[0] = new sna(0L, (sna) null);
            ((uq) this).field_Ab.a(-1, var28[0]);
            var28[1] = new sna(0L, (sna) null);
            ((uq) this).field_Ab.a(-1, var28[1]);
            var28[2] = new sna(0L, (sna) null);
            ((uq) this).field_Ab.a(-1, var28[2]);
            ((uq) this).field_Bb = new sna[cja.field_v];
            var16 = 0;
            L5: while (true) {
              if (var16 >= cja.field_v) {
                L6: {
                  ((uq) this).field_Cb = new StringBuilder(12);
                  if (param11 == null) {
                    break L6;
                  } else {
                    StringBuilder discarded$1 = ((uq) this).field_Cb.append(param11);
                    break L6;
                  }
                }
                L7: {
                  var16 = 0;
                  var17 = param6.field_jb.a(oe.field_a);
                  if (var17 <= var16) {
                    break L7;
                  } else {
                    var16 = var17;
                    break L7;
                  }
                }
                L8: {
                  var17 = param6.field_jb.a(nr.field_y);
                  if (var16 >= var17) {
                    break L8;
                  } else {
                    var16 = var17;
                    break L8;
                  }
                }
                L9: {
                  var17 = param6.field_jb.a(ur.field_p);
                  if (var17 <= var16) {
                    break L9;
                  } else {
                    var16 = var17;
                    break L9;
                  }
                }
                var17 = 0;
                L10: while (true) {
                  if (cja.field_v <= var17) {
                    L11: {
                      if (-141 <= (var16 ^ -1)) {
                        break L11;
                      } else {
                        var16 = 140;
                        break L11;
                      }
                    }
                    L12: {
                      var17 = 0;
                      var18 = 0;
                      var18 = 0;
                      var18 = this.a(var16, var28[0], (byte) -57, oe.field_a, param6, var18);
                      var18 = this.a(var18, var16, ((uq) this).field_Bb[6], -13403, var28[0]);
                      var18 = this.a(var18, var16, ((uq) this).field_Bb[9], -13403, var28[0]);
                      var18 = this.a(var18, var16, ((uq) this).field_Bb[5], -13403, var28[0]);
                      var18 = this.a(var18, var16, ((uq) this).field_Bb[7], -13403, var28[0]);
                      var18 = this.a(var18, var16, ((uq) this).field_Bb[15], -13403, var28[0]);
                      var18 = this.a(var18, var16, ((uq) this).field_Bb[4], -13403, var28[0]);
                      if (var17 >= var18) {
                        break L12;
                      } else {
                        var17 = var18;
                        break L12;
                      }
                    }
                    L13: {
                      var18 = 0;
                      var18 = this.a(var16, var28[1], (byte) -75, nr.field_y, param6, var18);
                      var18 = this.a(var18, var16, ((uq) this).field_Bb[16], -13403, var28[1]);
                      var18 = this.a(var18, var16, ((uq) this).field_Bb[17], -13403, var28[1]);
                      var18 = this.a(var18, var16, ((uq) this).field_Bb[18], -13403, var28[1]);
                      var18 = this.a(var18, var16, ((uq) this).field_Bb[19], -13403, var28[1]);
                      var18 = this.a(var18, var16, ((uq) this).field_Bb[20], -13403, var28[1]);
                      if (var18 <= var17) {
                        break L13;
                      } else {
                        var17 = var18;
                        break L13;
                      }
                    }
                    L14: {
                      var18 = 0;
                      var18 = this.a(var16, var28[2], (byte) -117, ur.field_p, param6, var18);
                      var18 = this.a(var18, var16, ((uq) this).field_Bb[13], -13403, var28[2]);
                      var18 = this.a(var18, var16, ((uq) this).field_Bb[21], -13403, var28[2]);
                      var18 = this.a(var18, var16, ((uq) this).field_Bb[11], -13403, var28[2]);
                      if (var17 >= var18) {
                        break L14;
                      } else {
                        var17 = var18;
                        break L14;
                      }
                    }
                    L15: {
                      var19 = 26 + var16 * 3;
                      var20 = ((uq) this).field_Gb.e(-1);
                      if (var19 >= var20) {
                        break L15;
                      } else {
                        var19 = var20;
                        break L15;
                      }
                    }
                    L16: {
                      if (((uq) this).field_Db == null) {
                        break L16;
                      } else {
                        var20 = ((uq) this).field_Db.a((byte) -108, 4);
                        if (var20 <= var19) {
                          break L16;
                        } else {
                          var19 = var20;
                          break L16;
                        }
                      }
                    }
                    L17: {
                      ((uq) this).field_Gb.a(24, 31407, var19 + 26, 0, 0);
                      ((uq) this).field_Fb.a(15, 31407, 15, ((uq) this).field_Gb.field_sb - 20, 5);
                      var21 = 10;
                      ((uq) this).field_wb.a(rg.field_h * 2, 31407, var19, 13, var21);
                      var21 = var21 + 2 * rg.field_h;
                      ((uq) this).field_xb.a(2 * rg.field_h, 31407, var19, 13, var21);
                      var21 = var21 + (10 + rg.field_h * 2);
                      ((uq) this).field_yb.a(rg.field_h, 31407, 0, 0, var21);
                      var21 = var21 + (rg.field_h - -10);
                      if (null == ((uq) this).field_Db) {
                        break L17;
                      } else {
                        var20 = ((uq) this).field_Db.a((byte) -118, 4);
                        ((uq) this).field_Db.a((byte) -42, rg.field_h, 13 - -((var19 + -var20) / 2), 4, var20, var21);
                        var21 = var21 + (10 + rg.field_h);
                        break L17;
                      }
                    }
                    var28[0].a(var17, 31407, var16, 13, var21);
                    var28[1].a(var17, 31407, var16, 13 - (-var16 + -13), var21);
                    var28[2].a(var17, 31407, var16, 13 - -(var16 * 2) - -26, var21);
                    var22 = var21;
                    ((uq) this).field_Ab.a(var22 + (var17 + 10), 31407, 13 + (13 + var19), 0, 24);
                    ((uq) this).field_Ab.field_eb = mu.a(11579568, 3, ((uq) this).field_Ab.field_p, 8421504, 2105376, (byte) 17);
                    var23 = var19 + 13 + 13;
                    var24 = 10 + (24 - -var22 + var17);
                    var25 = oi.a(param2, var23, param0, -21264);
                    var26 = nga.a(var24, param1, (byte) 127, param3);
                    ((uq) this).a(var24, 31407, var23, var25, var26);
                    break L0;
                  } else {
                    if (null != ((uq) this).field_Bb[var17]) {
                      var18 = ((uq) this).field_Bb[var17].e(-1);
                      if (var16 < var18) {
                        var16 = var18;
                        var17++;
                        continue L10;
                      } else {
                        var17++;
                        continue L10;
                      }
                    } else {
                      var17++;
                      continue L10;
                    }
                  }
                }
              } else {
                if (null != lw.field_k[var16]) {
                  L18: {
                    ((uq) this).field_Bb[var16] = new sna(0L, param10, lw.field_k[var16]);
                    ((uq) this).field_Bb[var16].field_N = 0;
                    stackOut_12_0 = ((uq) this).field_Bb[var16];
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_13_0 = stackOut_12_0;
                    if (param11 == null) {
                      stackOut_14_0 = (sna) (Object) stackIn_14_0;
                      stackOut_14_1 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      break L18;
                    } else {
                      stackOut_13_0 = (sna) (Object) stackIn_13_0;
                      stackOut_13_1 = 1;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      break L18;
                    }
                  }
                  ((sna) (Object) stackIn_15_0).field_u = stackIn_15_1 != 0;
                  ((uq) this).field_Ab.a(-1, ((uq) this).field_Bb[var16]);
                  var16++;
                  continue L5;
                } else {
                  var16++;
                  continue L5;
                }
              }
            }
          }
        }
    }

    final static void g(byte param0) {
        mg.field_m = new mu();
        Random discarded$0 = new Random();
        int var1 = 63 % ((-7 - param0) / 47);
    }

    final boolean g(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 0) {
          L0: {
            L1: {
              if (null == ((uq) this).field_Db) {
                break L1;
              } else {
                if (!((uq) this).field_Db.field_t) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    static {
    }
}
