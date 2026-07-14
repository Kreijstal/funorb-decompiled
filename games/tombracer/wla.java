/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class wla extends jea {
    private jea field_zb;
    private int field_Gb;
    private jea[] field_yb;
    private jea field_xb;
    private jea field_Fb;
    private jea field_Bb;
    private jea field_tb;
    static ur field_Eb;
    long field_Db;
    static int field_ub;
    private jea field_wb;
    private StringBuilder field_vb;
    private ta field_Ab;
    static volatile boolean field_Cb;

    private final int a(int param0, int param1, jea param2, int param3, jea param4) {
        param0 += 8;
        if (param1 != 13) {
            return -113;
        }
        int var6 = param4.field_H.a(param4.field_r, -(2 * param4.field_x) + param3, param4.field_P);
        param4.a(param3, var6, -23776, param0, 0);
        param0 = param0 + (var6 - 0);
        param2.b(-125, param4);
        return param0;
    }

    public static void a(boolean param0) {
        field_Eb = null;
        if (!param0) {
            field_Cb = true;
        }
    }

    final String f(int param0) {
        int var2 = -32 / ((-45 - param0) / 61);
        return ((wla) this).field_vb.toString();
    }

    wla(int param0, int param1, int param2, int param3, int param4, jea param5, jea param6, jea param7, jea param8, ta param9, jea param10, String param11, long param12) {
        super(0L, param5);
        int var15 = 0;
        jea[] var15_ref_jea__ = null;
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
        jea[] var28 = null;
        Object stackIn_4_0 = null;
        ta stackIn_4_1 = null;
        ta stackIn_4_2 = null;
        long stackIn_4_3 = 0L;
        ta stackIn_4_4 = null;
        Object stackIn_5_0 = null;
        ta stackIn_5_1 = null;
        ta stackIn_5_2 = null;
        long stackIn_5_3 = 0L;
        ta stackIn_5_4 = null;
        Object stackIn_6_0 = null;
        ta stackIn_6_1 = null;
        ta stackIn_6_2 = null;
        long stackIn_6_3 = 0L;
        ta stackIn_6_4 = null;
        Object stackIn_7_0 = null;
        ta stackIn_7_1 = null;
        ta stackIn_7_2 = null;
        long stackIn_7_3 = 0L;
        ta stackIn_7_4 = null;
        String stackIn_7_5 = null;
        jea stackIn_13_0 = null;
        jea stackIn_14_0 = null;
        jea stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackOut_3_0 = null;
        ta stackOut_3_1 = null;
        ta stackOut_3_2 = null;
        long stackOut_3_3 = 0L;
        ta stackOut_3_4 = null;
        Object stackOut_4_0 = null;
        ta stackOut_4_1 = null;
        ta stackOut_4_2 = null;
        long stackOut_4_3 = 0L;
        ta stackOut_4_4 = null;
        Object stackOut_5_0 = null;
        ta stackOut_5_1 = null;
        ta stackOut_5_2 = null;
        long stackOut_5_3 = 0L;
        ta stackOut_5_4 = null;
        String stackOut_5_5 = null;
        Object stackOut_6_0 = null;
        ta stackOut_6_1 = null;
        ta stackOut_6_2 = null;
        long stackOut_6_3 = 0L;
        ta stackOut_6_4 = null;
        String stackOut_6_5 = null;
        jea stackOut_12_0 = null;
        jea stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        jea stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        L0: {
          ((wla) this).field_Gb = -2;
          ((wla) this).field_Db = param12;
          ((wla) this).field_zb = new jea(0L, param6, gfa.field_m.toUpperCase());
          ((wla) this).field_zb.field_z = 1;
          ((wla) this).b(-126, ((wla) this).field_zb);
          ((wla) this).field_Fb = new jea(0L, param7);
          ((wla) this).field_zb.b(-123, ((wla) this).field_Fb);
          ((wla) this).field_wb = new jea(0L, (jea) null);
          ((wla) this).b(-127, ((wla) this).field_wb);
          if (param11 == null) {
            ((wla) this).field_Bb = new jea(0L, param8, rh.field_r);
            ((wla) this).field_Bb.field_z = 1;
            ((wla) this).field_Bb.field_ib = 11184810;
            ((wla) this).field_wb.b(-126, ((wla) this).field_Bb);
            var15 = 226;
            var16 = 10;
            var17 = ((wla) this).field_Bb.field_H.a(((wla) this).field_Bb.field_r, var15);
            ((wla) this).field_Bb.a(var15, di.field_a * var17, -23776, var16, 13);
            var16 = var16 + var17 * di.field_a;
            ((wla) this).field_wb.a(26 + var15, var16 + 10, -23776, 24, 0);
            ((wla) this).field_wb.field_w = hca.c(((wla) this).field_wb.field_t, 2105376, 3, 11579568, -121, 8421504);
            var18 = 13 + var15 + 13;
            var19 = var16 + 34;
            var20 = bt.a((byte) -8, var18, param2, param0);
            var21 = hsa.a(param3, var19, param1, (byte) 53);
            ((wla) this).a(var18, var19, -23776, var21, var20);
            break L0;
          } else {
            L1: {
              L2: {
                ((wla) this).field_Bb = new jea(0L, param8, fpa.field_a);
                ((wla) this).field_Bb.field_ib = 11184810;
                ((wla) this).field_Bb.field_z = 1;
                ((wla) this).field_wb.b(-122, ((wla) this).field_Bb);
                ((wla) this).field_tb = new jea(0L, param8, nla.field_b);
                ((wla) this).field_tb.field_ib = 11184810;
                ((wla) this).field_tb.field_z = 1;
                ((wla) this).field_wb.b(-122, ((wla) this).field_tb);
                ((wla) this).field_xb = new jea(0L, param8);
                ((wla) this).field_xb.field_ib = 16764006;
                ((wla) this).field_wb.b(-125, ((wla) this).field_xb);
                ((wla) this).field_xb.field_sb = "|";
                if (rja.field_e >= 5) {
                  break L2;
                } else {
                  if (ld.field_e < 2) {
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
                  stackOut_3_4 = (ta) param9;
                  stackIn_6_0 = stackOut_3_0;
                  stackIn_6_1 = stackOut_3_1;
                  stackIn_6_2 = stackOut_3_2;
                  stackIn_6_3 = stackOut_3_3;
                  stackIn_6_4 = stackOut_3_4;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  stackIn_4_2 = stackOut_3_2;
                  stackIn_4_3 = stackOut_3_3;
                  stackIn_4_4 = stackOut_3_4;
                  if (-8 >= rja.field_e) {
                    break L4;
                  } else {
                    stackOut_4_0 = this;
                    stackOut_4_1 = null;
                    stackOut_4_2 = null;
                    stackOut_4_3 = stackIn_4_3;
                    stackOut_4_4 = (ta) (Object) stackIn_4_4;
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
                    if (-3 <= ld.field_e) {
                      break L4;
                    } else {
                      stackOut_5_0 = this;
                      stackOut_5_1 = null;
                      stackOut_5_2 = null;
                      stackOut_5_3 = stackIn_5_3;
                      stackOut_5_4 = (ta) (Object) stackIn_5_4;
                      stackOut_5_5 = pl.field_c;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      stackIn_7_2 = stackOut_5_2;
                      stackIn_7_3 = stackOut_5_3;
                      stackIn_7_4 = stackOut_5_4;
                      stackIn_7_5 = stackOut_5_5;
                      break L3;
                    }
                  }
                }
                stackOut_6_0 = this;
                stackOut_6_1 = null;
                stackOut_6_2 = null;
                stackOut_6_3 = stackIn_6_3;
                stackOut_6_4 = (ta) (Object) stackIn_6_4;
                stackOut_6_5 = ur.field_b;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                stackIn_7_2 = stackOut_6_2;
                stackIn_7_3 = stackOut_6_3;
                stackIn_7_4 = stackOut_6_4;
                stackIn_7_5 = stackOut_6_5;
                break L3;
              }
              new ta(stackIn_7_3, stackIn_7_4, stackIn_7_5);
              ((wla) this).field_Ab = stackIn_7_1;
              ((wla) this).field_wb.b(-125, (jea) (Object) ((wla) this).field_Ab);
              break L1;
            }
            var28 = new jea[3];
            var15_ref_jea__ = var28;
            var28[0] = new jea(0L, (jea) null);
            ((wla) this).field_wb.b(-123, var28[0]);
            var28[1] = new jea(0L, (jea) null);
            ((wla) this).field_wb.b(-122, var28[1]);
            var28[2] = new jea(0L, (jea) null);
            ((wla) this).field_wb.b(-127, var28[2]);
            ((wla) this).field_yb = new jea[rh.field_n];
            var16 = 0;
            L5: while (true) {
              if (rh.field_n <= var16) {
                L6: {
                  ((wla) this).field_vb = new StringBuilder(12);
                  if (param11 == null) {
                    break L6;
                  } else {
                    StringBuilder discarded$1 = ((wla) this).field_vb.append(param11);
                    break L6;
                  }
                }
                L7: {
                  var16 = 0;
                  var17 = param6.field_H.b(ai.field_c);
                  if (var17 <= var16) {
                    break L7;
                  } else {
                    var16 = var17;
                    break L7;
                  }
                }
                L8: {
                  var17 = param6.field_H.b(qba.field_b);
                  if (var16 >= var17) {
                    break L8;
                  } else {
                    var16 = var17;
                    break L8;
                  }
                }
                L9: {
                  var17 = param6.field_H.b(lo.field_o);
                  if (var17 <= var16) {
                    break L9;
                  } else {
                    var16 = var17;
                    break L9;
                  }
                }
                var17 = 0;
                L10: while (true) {
                  if (var17 >= rh.field_n) {
                    L11: {
                      if (var16 <= 140) {
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
                      var18 = this.a(param6, ai.field_c, var16, var18, 8421504, var28[0]);
                      var18 = this.a(var18, 13, var28[0], var16, ((wla) this).field_yb[6]);
                      var18 = this.a(var18, 13, var28[0], var16, ((wla) this).field_yb[9]);
                      var18 = this.a(var18, 13, var28[0], var16, ((wla) this).field_yb[5]);
                      var18 = this.a(var18, 13, var28[0], var16, ((wla) this).field_yb[7]);
                      var18 = this.a(var18, 13, var28[0], var16, ((wla) this).field_yb[15]);
                      var18 = this.a(var18, 13, var28[0], var16, ((wla) this).field_yb[4]);
                      if (var18 <= var17) {
                        break L12;
                      } else {
                        var17 = var18;
                        break L12;
                      }
                    }
                    L13: {
                      var18 = 0;
                      var18 = this.a(param6, qba.field_b, var16, var18, 8421504, var28[1]);
                      var18 = this.a(var18, 13, var28[1], var16, ((wla) this).field_yb[16]);
                      var18 = this.a(var18, 13, var28[1], var16, ((wla) this).field_yb[17]);
                      var18 = this.a(var18, 13, var28[1], var16, ((wla) this).field_yb[18]);
                      var18 = this.a(var18, 13, var28[1], var16, ((wla) this).field_yb[19]);
                      var18 = this.a(var18, 13, var28[1], var16, ((wla) this).field_yb[20]);
                      if (var18 <= var17) {
                        break L13;
                      } else {
                        var17 = var18;
                        break L13;
                      }
                    }
                    L14: {
                      var18 = 0;
                      var18 = this.a(param6, lo.field_o, var16, var18, 8421504, var28[2]);
                      var18 = this.a(var18, 13, var28[2], var16, ((wla) this).field_yb[13]);
                      var18 = this.a(var18, 13, var28[2], var16, ((wla) this).field_yb[21]);
                      var18 = this.a(var18, 13, var28[2], var16, ((wla) this).field_yb[11]);
                      if (var17 >= var18) {
                        break L14;
                      } else {
                        var17 = var18;
                        break L14;
                      }
                    }
                    L15: {
                      var19 = 26 + 3 * var16;
                      var20 = ((wla) this).field_zb.b((byte) 69);
                      if (var19 >= var20) {
                        break L15;
                      } else {
                        var19 = var20;
                        break L15;
                      }
                    }
                    L16: {
                      if (null == ((wla) this).field_Ab) {
                        break L16;
                      } else {
                        var20 = ((wla) this).field_Ab.a((byte) 95, 4);
                        if (var20 <= var19) {
                          break L16;
                        } else {
                          var19 = var20;
                          break L16;
                        }
                      }
                    }
                    L17: {
                      ((wla) this).field_zb.a(13 + (13 - -var19), 24, -23776, 0, 0);
                      ((wla) this).field_Fb.a(15, 15, -23776, 5, -20 + ((wla) this).field_zb.field_G);
                      var21 = 10;
                      ((wla) this).field_Bb.a(var19, 2 * di.field_a, -23776, var21, 13);
                      var21 = var21 + di.field_a * 2;
                      ((wla) this).field_tb.a(var19, 2 * di.field_a, -23776, var21, 13);
                      var21 = var21 + (10 + 2 * di.field_a);
                      ((wla) this).field_xb.a(0, di.field_a, -23776, var21, 0);
                      var21 = var21 + (di.field_a + 10);
                      if (null == ((wla) this).field_Ab) {
                        break L17;
                      } else {
                        var20 = ((wla) this).field_Ab.a((byte) 95, 4);
                        ((wla) this).field_Ab.a(var20, var21, (byte) -110, 4, di.field_a, 13 - -((-var20 + var19) / 2));
                        var21 = var21 + (10 + di.field_a);
                        break L17;
                      }
                    }
                    var28[0].a(var16, var17, -23776, var21, 13);
                    var28[1].a(var16, var17, -23776, var21, 13 + (13 - -var16));
                    var28[2].a(var16, var17, -23776, var21, 26 + (2 * var16 + 13));
                    var22 = var21;
                    ((wla) this).field_wb.a(var19 + 26, 10 + (var17 + var22), -23776, 24, 0);
                    ((wla) this).field_wb.field_w = hca.c(((wla) this).field_wb.field_t, 2105376, 3, 11579568, -125, 8421504);
                    var23 = 13 + (13 - -var19);
                    var24 = 10 + var17 + (var22 + 24);
                    var25 = bt.a((byte) -8, var23, param2, param0);
                    var26 = hsa.a(param3, var24, param1, (byte) -99);
                    ((wla) this).a(var23, var24, -23776, var26, var25);
                    break L0;
                  } else {
                    if (((wla) this).field_yb[var17] != null) {
                      var18 = ((wla) this).field_yb[var17].b((byte) 69);
                      if (var18 > var16) {
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
                if (null != aca.field_h[var16]) {
                  L18: {
                    ((wla) this).field_yb[var16] = new jea(0L, param10, aca.field_h[var16]);
                    ((wla) this).field_yb[var16].field_z = 0;
                    stackOut_12_0 = ((wla) this).field_yb[var16];
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_13_0 = stackOut_12_0;
                    if (param11 == null) {
                      stackOut_14_0 = (jea) (Object) stackIn_14_0;
                      stackOut_14_1 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      break L18;
                    } else {
                      stackOut_13_0 = (jea) (Object) stackIn_13_0;
                      stackOut_13_1 = 1;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      break L18;
                    }
                  }
                  stackIn_15_0.field_X = stackIn_15_1 != 0;
                  ((wla) this).field_wb.b(-128, ((wla) this).field_yb[var16]);
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

    final boolean c(boolean param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (!param0) {
            break L0;
          } else {
            boolean discarded$2 = ((wla) this).b(false);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((wla) this).field_Ab) {
              break L2;
            } else {
              if (!((wla) this).field_Ab.field_cb) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    private final int a(jea param0, String param1, int param2, int param3, int param4, jea param5) {
        if (param4 != 8421504) {
            return -60;
        }
        jea var7 = new jea(0L, param0, 0, param3, param2, 24, param1);
        param3 += 32;
        param5.b(param4 ^ -8421632, var7);
        return param3;
    }

    final boolean b(boolean param0) {
        if (((wla) this).field_Gb != 1) {
            return false;
        }
        if (!(-14 != fna.field_h)) {
            ((wla) this).field_Gb = -1;
        }
        if (!param0) {
            return true;
        }
        return true;
    }

    final int d(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        ta stackIn_5_0 = null;
        ta stackIn_6_0 = null;
        ta stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        jea stackIn_13_0 = null;
        jea stackIn_14_0 = null;
        jea stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        ta stackOut_4_0 = null;
        ta stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        ta stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        jea stackOut_12_0 = null;
        jea stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        jea stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          ((wla) this).c(44, param1);
          if (null == ((wla) this).field_xb) {
            break L0;
          } else {
            L1: {
              ((wla) this).field_xb.field_r = ((wla) this).field_vb.toString();
              ((wla) this).field_xb.field_qb = (((wla) this).field_G + -((wla) this).field_xb.field_H.b(((wla) this).field_xb.field_r)) / 2;
              ((wla) this).field_xb.field_G = -((wla) this).field_xb.field_qb + ((wla) this).field_G;
              if (((wla) this).field_Ab == null) {
                break L1;
              } else {
                if (((wla) this).field_Ab.field_y != 0) {
                  L2: {
                    stackOut_4_0 = ((wla) this).field_Ab;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (((wla) this).field_Ab.field_cb) {
                      stackOut_6_0 = (ta) (Object) stackIn_6_0;
                      stackOut_6_1 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      break L2;
                    } else {
                      stackOut_5_0 = (ta) (Object) stackIn_5_0;
                      stackOut_5_1 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      break L2;
                    }
                  }
                  stackIn_7_0.field_cb = stackIn_7_1 != 0;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            var3 = 0;
            L3: while (true) {
              if (var3 >= rh.field_n) {
                break L0;
              } else {
                if (null != ((wla) this).field_yb[var3]) {
                  L4: {
                    stackOut_12_0 = ((wla) this).field_yb[var3];
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_13_0 = stackOut_12_0;
                    if (-1 <= (((wla) this).field_vb.length() ^ -1)) {
                      stackOut_14_0 = (jea) (Object) stackIn_14_0;
                      stackOut_14_1 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      break L4;
                    } else {
                      stackOut_13_0 = (jea) (Object) stackIn_13_0;
                      stackOut_13_1 = 1;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      break L4;
                    }
                  }
                  stackIn_15_0.field_X = stackIn_15_1 != 0;
                  if (((wla) this).field_yb[var3].field_X) {
                    if (((wla) this).field_yb[var3].field_y != 0) {
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
          }
        }
        if (param0 == ((wla) this).field_Fb.field_y) {
          L5: {
            if (!param1) {
              break L5;
            } else {
              if (-1 == hf.field_b) {
                break L5;
              } else {
                if (((wla) this).field_y != 0) {
                  break L5;
                } else {
                  return -1;
                }
              }
            }
          }
          return ((wla) this).field_Gb;
        } else {
          return -1;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Eb = new ur(2);
        field_Cb = false;
    }
}
