/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ep {
    private double field_d;
    private int field_g;
    private int field_m;
    static kl field_b;
    private int[] field_i;
    static String field_h;
    static int field_o;
    static boolean field_f;
    private int field_j;
    private int field_q;
    private double field_e;
    static String field_a;
    private int field_l;
    private double field_k;
    private int field_n;
    static boolean[][] field_p;
    private int field_c;

    private final int a(byte param0, int param1) {
        if (param0 > -22) {
            return 69;
        }
        return (-mj.field_b + so.field_b.field_g >> -1971733887) + param1;
    }

    private final wk b(int param0, int param1) {
        if (param0 >= -15) {
            ((ep) this).a(29);
        }
        return new wk(ql.field_j.a("intro" + (param1 - -1) + ".jpg", -125, ""), (java.awt.Component) (Object) ll.p(0));
    }

    final void a(boolean param0) {
        int var3 = 0;
        L0: {
          var3 = ArmiesOfGielinor.field_M ? 1 : 0;
          ((ep) this).field_l = ((ep) this).field_l + 1;
          if (0 < ((ep) this).field_m) {
            ((ep) this).field_m = ((ep) this).field_m - 1;
            if (0 == ((ep) this).field_m - 1) {
              ((ep) this).field_j = ((ep) this).field_j + 1;
              if (((ep) this).field_j == 1) {
                ((ep) this).field_m = 200;
                break L0;
              } else {
                if (2 == ((ep) this).field_j) {
                  ((ep) this).field_m = 50;
                  break L0;
                } else {
                  break L0;
                }
              }
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
        if ((((ep) this).field_j ^ -1) == -4) {
          L1: {
            if (((ep) this).field_n <= 0) {
              L2: {
                if (((ep) this).field_i.length <= ((ep) this).field_c) {
                  bv.a(false, 0, 1, jt.field_a);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (((ep) this).field_g != 0) {
                  if (1 == ((ep) this).field_g) {
                    ((ep) this).field_e = ((ep) this).field_e - 0.256;
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  ((ep) this).field_e = ((ep) this).field_e + 0.256;
                  break L3;
                }
              }
              ((ep) this).field_l = ((ep) this).field_l + 1;
              if (((ep) this).field_e >= 11.904) {
                L4: {
                  if (((ep) this).field_k <= 2521.0) {
                    break L4;
                  } else {
                    if (2552.0 <= ((ep) this).field_k) {
                      break L4;
                    } else {
                      ((ep) this).field_e = ((ep) this).field_e - 0.256;
                      break L1;
                    }
                  }
                }
                ((ep) this).field_e = 11.904;
                ((ep) this).field_g = 1;
                break L1;
              } else {
                if (0.0 >= ((ep) this).field_e) {
                  ((ep) this).field_g = 0;
                  ((ep) this).field_e = 0.0;
                  ((ep) this).field_n = ((ep) this).field_i[((ep) this).field_c];
                  ((ep) this).field_c = ((ep) this).field_c + 1;
                  break L1;
                } else {
                  break L1;
                }
              }
            } else {
              ((ep) this).field_n = ((ep) this).field_n - 1;
              break L1;
            }
          }
          L5: {
            if (0.0 != ((ep) this).field_e) {
              break L5;
            } else {
              ((ep) this).field_e = 0.175;
              break L5;
            }
          }
          L6: {
            ((ep) this).field_k = ((ep) this).field_k + ((ep) this).field_e;
            if (((ep) this).field_k >= 2835.0) {
              ((ep) this).field_k = 2835.0;
              ((ep) this).field_q = ((ep) this).field_q + 1;
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (!param0) {
              break L7;
            } else {
              field_f = false;
              break L7;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(int param0) {
        OutOfMemoryError var2_ref_OutOfMemoryError = null;
        int var2 = 0;
        double var3 = 0.0;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[] var7_ref_String__ = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String[] var12 = null;
        String[] var13 = null;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        int stackIn_42_3 = 0;
        int stackIn_42_4 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_43_2 = 0;
        int stackIn_43_3 = 0;
        int stackIn_43_4 = 0;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        int stackIn_44_2 = 0;
        int stackIn_44_3 = 0;
        int stackIn_44_4 = 0;
        int stackIn_44_5 = 0;
        int stackIn_48_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        int stackOut_41_3 = 0;
        int stackOut_41_4 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        int stackOut_42_2 = 0;
        int stackOut_42_3 = 0;
        int stackOut_42_4 = 0;
        int stackOut_42_5 = 0;
        int stackOut_43_0 = 0;
        int stackOut_43_1 = 0;
        int stackOut_43_2 = 0;
        int stackOut_43_3 = 0;
        int stackOut_43_4 = 0;
        int stackOut_43_5 = 0;
        int stackOut_46_0 = 0;
        int stackOut_47_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = ArmiesOfGielinor.field_M ? 1 : 0;
                    if (param0 == 256) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    int discarded$1 = this.a(53, -105);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if ((((ep) this).field_j ^ -1) == -4) {
                        statePc = 11;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    qn.b();
                    var12 = new String[10];
                    var13 = var12;
                    var3_int = nr.field_e.a(ts.field_b, new int[1], var13);
                    var4 = 0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (var4 >= var3_int) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var5 = this.a((byte) -90, var4 * 20 + 200);
                    fe.c(var12[var4], this.a(320, 4592), var5, nd.field_b, true);
                    var4++;
                    statePc = 4;
                    continue stateLoop;
                }
                case 6: {
                    if (((ep) this).field_j != 1) {
                        statePc = 8;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var4 = (((ep) this).field_m << -994389688) / 50;
                    if ((((ep) this).field_j ^ -1) != -3) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var4 = 256 - var4;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    qn.b(this.a(0, param0 ^ 4336), this.a((byte) -56, 0), so.field_b.field_a, so.field_b.field_g, 65793, var4);
                    statePc = 50;
                    continue stateLoop;
                }
                case 11: {
                    if (ck.field_c == null) {
                        statePc = 13;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 13: {
                    ck.field_c = new wk[16];
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    try {
                        var2 = 0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (-17 >= (var2 ^ -1)) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ck.field_c[var2] = this.b(kf.b(param0, -383), var2);
                        var2++;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    var2_ref_OutOfMemoryError = (OutOfMemoryError) (Object) caughtException;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    var2 = -(int)(256.0 * (((ep) this).field_k - ((ep) this).field_d) / 8.75) + 256;
                    var3 = ((ep) this).field_k;
                    var5 = (int)(16.0 * ((ep) this).field_k);
                    if ((var2 ^ -1) < -1) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    this.a(var5, (byte) -79);
                    statePc = 22;
                    continue stateLoop;
                }
                case 21: {
                    var3 = (double)this.a(-320, 4592);
                    this.a(var5, (byte) -79);
                    qn.b(0, 0, so.field_b.field_a, so.field_b.field_g, 65793, var2);
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if ((((ep) this).field_c ^ -1) > -6) {
                        statePc = 24;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var6 = -1 + ((ep) this).field_c;
                    if (((ep) this).field_g == 1) {
                        statePc = 26;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var6++;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if ((var6 ^ -1) > -1) {
                        statePc = 32;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (md.field_A.length <= var6) {
                        statePc = 32;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var7_ref_String__ = new String[10];
                    var8 = hh.field_i.a(md.field_A[var6], new int[1], var7_ref_String__);
                    var9 = 0;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if (var9 >= var8) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var10 = 435 + 16 * var9;
                    hh.field_i.a(var7_ref_String__[var9], this.a(320, 4592), this.a((byte) -104, var10), 16777215, 65793, 256 - (int)(((ep) this).field_e * 256.0 / 11.904));
                    var9++;
                    statePc = 30;
                    continue stateLoop;
                }
                case 32: {
                    var6 = ((ep) this).field_l * 200;
                    if (((ep) this).field_q > 0) {
                        statePc = 40;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    qn.a((int)(16.0 * (-var3 + (double)this.a(1105, param0 + 4336))), this.a((byte) -73, 119) << -4226652, 480, (ae.b(var6, 100) >> -1035977011) + 32, fe.field_o[1]);
                    qn.a((int)(16.0 * (-var3 + (double)this.a(1068, 4592))), this.a((byte) -42, 219) << -1786951932, 480, 32 - -(ae.b(800 + var6, 100) >> -1187960499), fe.field_o[2]);
                    qn.a((int)(16.0 * ((double)this.a(1105, 4592) - var3)), this.a((byte) -39, 286) << -226524732, 480, (ae.b(var6 - -1600, param0 + -156) >> -351788051) + 32, fe.field_o[3]);
                    qn.a((int)(16.0 * (-var3 + (double)this.a(1443, 4592))), this.a((byte) -89, 116) << -398380348, 480, 32 + (ae.b(2400 + var6, 100) >> 1570866317), fe.field_o[4]);
                    qn.a((int)((-var3 + (double)this.a(1478, 4592)) * 16.0), this.a((byte) -62, 207) << 232812356, 480, 32 + (ae.b(var6 - -3200, param0 ^ 356) >> -125562899), fe.field_o[5]);
                    qn.a((int)(16.0 * (-var3 + (double)this.a(1446, 4592))), this.a((byte) -103, 295) << -1045443932, 480, 32 + (ae.b(4000 + var6, 100) >> 218500717), fe.field_o[6]);
                    qn.b((int)(this.a(1890.0 - ((ep) this).field_k, 16) * 16.0), this.a((byte) -78, 160) << 1599485508, 1600, 32 + (ae.b(150 + (var6 >> 1478145921), 100) >> -174297682), fe.field_o[0]);
                    qn.a((int)(16.0 * (-var3 + (double)this.a(2614, 4592))), this.a((byte) -74, 219) << -321967356, 80, (ae.b(var6, 100) >> 664475597) + 32 >> -2021440766, fe.field_o[1]);
                    var7 = 256 + (ae.b(var6 / 4, 100) + -65536);
                    if (-1 > (var7 ^ -1)) {
                        statePc = 35;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 35: {
                    ih.field_H.e((int)(-var3 + (double)this.a(2568, 4592)), this.a((byte) -29, 141), var7);
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    var7 = 256 + (ae.b(var6 / 2, 100) - 65536);
                    if ((var7 ^ -1) >= -1) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    ih.field_H.e((int)((double)this.a(2516, 4592) - var3), this.a((byte) -119, 206), var7);
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    var7 = -65536 + ae.b(var6 / 3, 100) - -256;
                    if (var7 <= 0) {
                        statePc = 50;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    ih.field_H.e((int)((double)this.a(2665, param0 + 4336) - var3), this.a((byte) -53, 168), var7);
                    statePc = 50;
                    continue stateLoop;
                }
                case 40: {
                    var7 = ((ep) this).field_q + -100;
                    if (0 >= var7) {
                        statePc = 45;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var7 = (int)Math.pow(1.1, (double)var7);
                    stackOut_41_0 = 0;
                    stackOut_41_1 = 0;
                    stackOut_41_2 = so.field_b.field_a;
                    stackOut_41_3 = so.field_b.field_g;
                    stackOut_41_4 = 65793;
                    stackIn_43_0 = stackOut_41_0;
                    stackIn_43_1 = stackOut_41_1;
                    stackIn_43_2 = stackOut_41_2;
                    stackIn_43_3 = stackOut_41_3;
                    stackIn_43_4 = stackOut_41_4;
                    stackIn_42_0 = stackOut_41_0;
                    stackIn_42_1 = stackOut_41_1;
                    stackIn_42_2 = stackOut_41_2;
                    stackIn_42_3 = stackOut_41_3;
                    stackIn_42_4 = stackOut_41_4;
                    if (-257 <= (var7 ^ -1)) {
                        statePc = 43;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    stackOut_42_0 = stackIn_42_0;
                    stackOut_42_1 = stackIn_42_1;
                    stackOut_42_2 = stackIn_42_2;
                    stackOut_42_3 = stackIn_42_3;
                    stackOut_42_4 = stackIn_42_4;
                    stackOut_42_5 = 256;
                    stackIn_44_0 = stackOut_42_0;
                    stackIn_44_1 = stackOut_42_1;
                    stackIn_44_2 = stackOut_42_2;
                    stackIn_44_3 = stackOut_42_3;
                    stackIn_44_4 = stackOut_42_4;
                    stackIn_44_5 = stackOut_42_5;
                    statePc = 44;
                    continue stateLoop;
                }
                case 43: {
                    stackOut_43_0 = stackIn_43_0;
                    stackOut_43_1 = stackIn_43_1;
                    stackOut_43_2 = stackIn_43_2;
                    stackOut_43_3 = stackIn_43_3;
                    stackOut_43_4 = stackIn_43_4;
                    stackOut_43_5 = var7;
                    stackIn_44_0 = stackOut_43_0;
                    stackIn_44_1 = stackOut_43_1;
                    stackIn_44_2 = stackOut_43_2;
                    stackIn_44_3 = stackOut_43_3;
                    stackIn_44_4 = stackOut_43_4;
                    stackIn_44_5 = stackOut_43_5;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    qn.b(stackIn_44_0, stackIn_44_1, stackIn_44_2, stackIn_44_3, stackIn_44_4, stackIn_44_5);
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    var8 = ((ep) this).field_q << -1922739486;
                    if ((var8 ^ -1) >= -257) {
                        statePc = 47;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    stackOut_46_0 = 256;
                    stackIn_48_0 = stackOut_46_0;
                    statePc = 48;
                    continue stateLoop;
                }
                case 47: {
                    stackOut_47_0 = var8;
                    stackIn_48_0 = stackOut_47_0;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    var8 = stackIn_48_0;
                    ol.field_y.e(this.a(-(int)((ep) this).field_k + 3002, 4592), this.a((byte) -81, 90), var8);
                    if ((var7 ^ -1) > -160001) {
                        statePc = 50;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    bv.a(false, 0, 1, jt.field_a);
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(je param0, int param1, je param2) {
        if (null == param2.field_fb) {
            param2.field_fb = new at();
        }
        if (null == param0.field_fb) {
            param0.field_fb = new at();
        }
        if (null == nh.field_K) {
            nh.field_K = new tp(64);
        }
        if (param1 > -20) {
            field_o = -46;
        }
        if (!(bk.field_a != null)) {
            bk.field_a = new tp(64);
        }
        ot.field_E = param0.field_fb;
        wh.field_c = param2.field_fb;
        da.c(-123);
    }

    private final void a(int param0, byte param1) {
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
        int[] var17 = null;
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param1 == -79) {
          var17 = new int[qn.field_g];
          var4 = -param0;
          var4 = var4 + kv.field_F;
          var5 = -1;
          var6 = us.field_a;
          L0: while (true) {
            L1: {
              if ((var6 ^ -1) <= -17) {
                break L1;
              } else {
                var7 = var4;
                var8 = (var7 >> 1506571332) - -this.a(0, 4592);
                if (qn.field_l <= var8) {
                  break L1;
                } else {
                  L2: {
                    if (null == ck.field_c[var6]) {
                      ck.field_c[var6] = this.b(-99, var6);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var9 = ck.field_c[var6].field_y;
                  var4 = var4 + (var9 << 424220836);
                  var10 = var8 + var9;
                  if (var10 >= 0) {
                    L3: {
                      var11 = -(var7 & 15) + 15;
                      if (var8 >= 0) {
                        break L3;
                      } else {
                        var9 = var9 + var8;
                        var11 = var11 - (var8 << 686199812);
                        var8 = 0;
                        break L3;
                      }
                    }
                    L4: {
                      if (qn.field_l >= var10) {
                        break L4;
                      } else {
                        var9 = var9 - (var10 - qn.field_l);
                        break L4;
                      }
                    }
                    L5: {
                      var12 = this.a((byte) -34, 0);
                      if ((var5 ^ -1) > -1) {
                        var5 = var8;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      if (0 <= var12) {
                        break L6;
                      } else {
                        var12 = 0;
                        break L6;
                      }
                    }
                    fe.a(ck.field_c[var6], var11, 0, var8, var12, var9, var17);
                    var6++;
                    continue L0;
                  } else {
                    us.field_a = 1 + var6;
                    kv.field_F = kv.field_F + (var9 << -1073755484);
                    ck.field_c[var6] = null;
                    var6++;
                    continue L0;
                  }
                }
              }
            }
            var6 = 0;
            L7: while (true) {
              if (-65 >= (var6 ^ -1)) {
                return;
              } else {
                qn.d(var6 + var5, this.a((byte) -45, 0), qn.field_g, 0, 255 - (var6 << 1081987330));
                var6++;
                continue L7;
              }
            }
          }
        } else {
          return;
        }
    }

    final static int b(byte param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            vh var2 = null;
            int stackIn_13_0 = 0;
            int stackIn_25_0 = 0;
            int stackIn_30_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_37_0 = 0;
            int stackIn_39_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_12_0 = 0;
            int stackOut_24_0 = 0;
            int stackOut_29_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_36_0 = 0;
            int stackOut_38_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (-5 >= (ai.field_T.field_q ^ -1)) {
                            statePc = 2;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        if (-1 == ai.field_T.field_p) {
                            statePc = 4;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return 3;
                    }
                    case 5: {
                        if (ai.field_T.field_p == -2) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        return 1;
                    }
                    case 7: {
                        return 4;
                    }
                    case 8: {
                        try {
                            if (-1 != ta.field_N) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            kd.field_R = vq.field_c.a(gm.field_i, (byte) 114, db.field_c);
                            ta.field_N = ta.field_N + 1;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (-2 != ta.field_N) {
                                statePc = 17;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (2 != kd.field_R.field_g) {
                                statePc = 14;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = as.a(-1, (byte) 101);
                            stackIn_13_0 = stackOut_12_0;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        return stackIn_13_0;
                    }
                    case 14: {
                        try {
                            if (1 == kd.field_R.field_g) {
                                statePc = 16;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            ta.field_N = ta.field_N + 1;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (-3 != (ta.field_N ^ -1)) {
                                statePc = 19;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            jj.field_g = new hi((java.net.Socket) kd.field_R.field_f, vq.field_c);
                            var2 = new vh(13);
                            it.a(hq.field_e, false, am.field_x, var2, ek.field_e);
                            var2.b(1, 15);
                            var2.a((byte) -124, vq.field_d);
                            jj.field_g.a(var2.field_o, (byte) 20, 0, 13);
                            ta.field_N = ta.field_N + 1;
                            fi.field_s = 30000L + vi.b(103);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (3 == ta.field_N) {
                                statePc = 21;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (jj.field_g.d((byte) 43) <= 0) {
                                statePc = 27;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var1_int = jj.field_g.a(70);
                            if (-1 != (var1_int ^ -1)) {
                                statePc = 24;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            stackOut_24_0 = as.a(var1_int, (byte) 101);
                            stackIn_25_0 = stackOut_24_0;
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        return stackIn_25_0;
                    }
                    case 26: {
                        try {
                            ta.field_N = ta.field_N + 1;
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (vi.b(97) > fi.field_s) {
                                statePc = 29;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            stackOut_29_0 = as.a(-2, (byte) 101);
                            stackIn_30_0 = stackOut_29_0;
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        return stackIn_30_0;
                    }
                    case 31: {
                        try {
                            if (4 == ta.field_N) {
                                statePc = 33;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            ai.field_T.a((Object) (Object) jj.field_g, ts.field_m, -68);
                            kd.field_R = null;
                            ta.field_N = 0;
                            jj.field_g = null;
                            stackOut_33_0 = 0;
                            stackIn_34_0 = stackOut_33_0;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        return stackIn_34_0;
                    }
                    case 35: {
                        try {
                            if (param0 < -117) {
                                statePc = 38;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            stackOut_36_0 = 37;
                            stackIn_37_0 = stackOut_36_0;
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        return stackIn_37_0;
                    }
                    case 38: {
                        try {
                            stackOut_38_0 = -1;
                            stackIn_39_0 = stackOut_38_0;
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        return stackIn_39_0;
                    }
                    case 40: {
                        var1 = (IOException) (Object) caughtException;
                        return as.a(-3, (byte) 101);
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, String param1, boolean param2) {
        if (!param0) {
            field_p = null;
        }
        String var4 = sb.field_i.field_X;
        String var3 = var4;
        sb.field_i.field_X = param1;
        eu.field_g.b(param2, 20);
        sb.field_i.field_X = var4;
    }

    private final int a(int param0, int param1) {
        if (param1 != 4592) {
            ((ep) this).field_m = -45;
        }
        return (so.field_b.field_a - ce.field_Q >> 1917635617) - -param0;
    }

    public static void a(byte param0) {
        field_b = null;
        field_h = null;
        field_p = null;
        if (param0 != 11) {
            field_o = 9;
        }
        field_a = null;
    }

    ep(kl param0) {
        ((ep) this).field_m = 50;
        ((ep) this).field_i = new int[]{350, 350, 450, 450, 3500};
        ((ep) this).field_q = 0;
        ((ep) this).field_e = 0.0;
        ((ep) this).field_j = 0;
        ((ep) this).field_g = 1;
        ((ep) this).field_n = 0;
        ((ep) this).field_c = 0;
        ((ep) this).field_l = 0;
        kv.field_F = 0;
        ql.field_j = param0;
        us.field_a = 0;
        ((ep) this).field_d = 301.25;
        ((ep) this).field_k = ((ep) this).field_d;
    }

    private final double a(double param0, int param1) {
        if (param1 != 16) {
            wk discarded$0 = this.b(-62, 105);
        }
        return (double)(-ce.field_Q + so.field_b.field_a >> -2033038271) + param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 0;
        field_f = true;
        field_h = "Players";
        field_a = "Toggle map";
    }
}
