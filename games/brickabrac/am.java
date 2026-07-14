/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am extends mh {
    private mh field_Xb;
    long field_Wb;
    static String field_cc;
    private mh[] field_Sb;
    private mh field_Ub;
    private ni field_bc;
    private mh field_Pb;
    private int field_ac;
    static mh field_Qb;
    private mh field_Vb;
    private mh field_Yb;
    static mh field_Zb;
    private StringBuilder field_Tb;
    private mh field_Rb;

    final static boolean i(int param0) {
        if (param0 != 0) {
            boolean discarded$0 = am.i(79);
            return true;
        }
        return true;
    }

    private final int a(int param0, mh param1, int param2, String param3, mh param4, byte param5) {
        if (param5 != -53) {
            int discarded$0 = ((am) this).b(true, -62);
        }
        mh var7 = new mh(0L, param1, 0, param0, param2, 24, param3);
        param0 += 32;
        param4.a(var7, 0);
        return param0;
    }

    final boolean d(byte param0) {
        if (!(1 == (((am) this).field_ac ^ -1))) {
            return false;
        }
        if (!(dc.field_b != 13)) {
            ((am) this).field_ac = -1;
        }
        if (param0 < 61) {
            am.k(105);
        }
        return true;
    }

    private final int a(mh param0, byte param1, int param2, mh param3, int param4) {
        param2 += 8;
        int var6 = -87 / ((param1 - -73) / 46);
        int var7 = param3.field_O.b(param3.field_Mb, param4 - param3.field_V * 2, param3.field_R);
        param3.a(var7, param2, 0, param4, (byte) 64);
        param0.a(param3, 0);
        param2 = param2 + (0 + var7);
        return param2;
    }

    final String h(int param0) {
        if (param0 < 93) {
            int discarded$0 = ((am) this).b(true, -113);
        }
        return ((am) this).field_Tb.toString();
    }

    public static void k(int param0) {
        field_Qb = null;
        field_Zb = null;
        field_cc = null;
        if (param0 != 8421504) {
            field_cc = null;
        }
    }

    final boolean j(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0;
        int stackOut_5_0;
        L0: {
          if (param0 == 72) {
            break L0;
          } else {
            ((am) this).field_Sb = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((am) this).field_bc == null) {
              break L2;
            } else {
              if (!((am) this).field_bc.field_Nb) {
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

    am(int param0, int param1, int param2, int param3, int param4, mh param5, mh param6, mh param7, mh param8, ni param9, mh param10, String param11, long param12) {
        super(0L, param5);
        int var15_int = 0;
        mh[] var15 = null;
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
        mh[] var28 = null;
        Object stackIn_5_0 = null;
        ni stackIn_5_1 = null;
        ni stackIn_5_2 = null;
        long stackIn_5_3 = 0L;
        ni stackIn_5_4 = null;
        Object stackIn_6_0 = null;
        ni stackIn_6_1 = null;
        ni stackIn_6_2 = null;
        long stackIn_6_3 = 0L;
        ni stackIn_6_4 = null;
        Object stackIn_7_0 = null;
        ni stackIn_7_1 = null;
        ni stackIn_7_2 = null;
        long stackIn_7_3 = 0L;
        ni stackIn_7_4 = null;
        Object stackIn_8_0 = null;
        ni stackIn_8_1 = null;
        ni stackIn_8_2 = null;
        long stackIn_8_3 = 0L;
        ni stackIn_8_4 = null;
        String stackIn_8_5 = null;
        mh stackIn_14_0 = null;
        mh stackIn_15_0 = null;
        mh stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackOut_4_0;
        ni stackOut_4_1;
        ni stackOut_4_2;
        long stackOut_4_3;
        ni stackOut_4_4;
        Object stackOut_5_0;
        ni stackOut_5_1;
        ni stackOut_5_2;
        long stackOut_5_3;
        ni stackOut_5_4;
        Object stackOut_6_0;
        ni stackOut_6_1;
        ni stackOut_6_2;
        long stackOut_6_3;
        ni stackOut_6_4;
        String stackOut_6_5;
        Object stackOut_7_0;
        ni stackOut_7_1;
        ni stackOut_7_2;
        long stackOut_7_3;
        ni stackOut_7_4;
        String stackOut_7_5;
        mh stackOut_13_0;
        mh stackOut_15_0;
        int stackOut_15_1;
        mh stackOut_14_0;
        int stackOut_14_1;
        L0: {
          ((am) this).field_ac = -2;
          ((am) this).field_Wb = param12;
          ((am) this).field_Ub = new mh(0L, param6, r.field_B.toUpperCase());
          ((am) this).field_Ub.field_S = 1;
          ((am) this).a(((am) this).field_Ub, 0);
          ((am) this).field_Vb = new mh(0L, param7);
          ((am) this).field_Ub.a(((am) this).field_Vb, 0);
          ((am) this).field_Xb = new mh(0L, (mh) null);
          ((am) this).a(((am) this).field_Xb, 0);
          if (param11 != null) {
            L1: {
              L2: {
                ((am) this).field_Rb = new mh(0L, param8, om.field_rc);
                ((am) this).field_Rb.field_S = 1;
                ((am) this).field_Rb.field_X = 11184810;
                ((am) this).field_Xb.a(((am) this).field_Rb, 0);
                ((am) this).field_Pb = new mh(0L, param8, wd.field_D);
                ((am) this).field_Pb.field_S = 1;
                ((am) this).field_Pb.field_X = 11184810;
                ((am) this).field_Xb.a(((am) this).field_Pb, 0);
                ((am) this).field_Yb = new mh(0L, param8);
                ((am) this).field_Yb.field_X = 16764006;
                ((am) this).field_Xb.a(((am) this).field_Yb, 0);
                ((am) this).field_Yb.field_Cb = "|";
                if ((gh.field_f ^ -1) <= -6) {
                  break L2;
                } else {
                  if (kb.field_Yb > -3) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                L4: {
                  stackOut_4_0 = this;
                  stackOut_4_1 = null;
                  stackOut_4_2 = null;
                  stackOut_4_3 = 0L;
                  stackOut_4_4 = (ni) param9;
                  stackIn_7_0 = stackOut_4_0;
                  stackIn_7_1 = stackOut_4_1;
                  stackIn_7_2 = stackOut_4_2;
                  stackIn_7_3 = stackOut_4_3;
                  stackIn_7_4 = stackOut_4_4;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  stackIn_5_2 = stackOut_4_2;
                  stackIn_5_3 = stackOut_4_3;
                  stackIn_5_4 = stackOut_4_4;
                  if (-8 <= gh.field_f) {
                    break L4;
                  } else {
                    stackOut_5_0 = this;
                    stackOut_5_1 = null;
                    stackOut_5_2 = null;
                    stackOut_5_3 = stackIn_5_3;
                    stackOut_5_4 = (ni) (Object) stackIn_5_4;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    stackIn_7_2 = stackOut_5_2;
                    stackIn_7_3 = stackOut_5_3;
                    stackIn_7_4 = stackOut_5_4;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    stackIn_6_2 = stackOut_5_2;
                    stackIn_6_3 = stackOut_5_3;
                    stackIn_6_4 = stackOut_5_4;
                    if (2 <= kb.field_Yb) {
                      break L4;
                    } else {
                      stackOut_6_0 = this;
                      stackOut_6_1 = null;
                      stackOut_6_2 = null;
                      stackOut_6_3 = stackIn_6_3;
                      stackOut_6_4 = (ni) (Object) stackIn_6_4;
                      stackOut_6_5 = nk.field_e;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      stackIn_8_2 = stackOut_6_2;
                      stackIn_8_3 = stackOut_6_3;
                      stackIn_8_4 = stackOut_6_4;
                      stackIn_8_5 = stackOut_6_5;
                      break L3;
                    }
                  }
                }
                stackOut_7_0 = this;
                stackOut_7_1 = null;
                stackOut_7_2 = null;
                stackOut_7_3 = stackIn_7_3;
                stackOut_7_4 = (ni) (Object) stackIn_7_4;
                stackOut_7_5 = ek.field_gb;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                stackIn_8_2 = stackOut_7_2;
                stackIn_8_3 = stackOut_7_3;
                stackIn_8_4 = stackOut_7_4;
                stackIn_8_5 = stackOut_7_5;
                break L3;
              }
              new ni(stackIn_8_3, (ni) (Object) stackIn_8_4, (String) (Object) stackIn_8_5);
              ((am) this).field_bc = (ni) (Object) stackIn_8_1;
              ((am) this).field_Xb.a((mh) (Object) ((am) this).field_bc, 0);
              break L1;
            }
            var28 = new mh[3];
            var15 = var28;
            var28[0] = new mh(0L, (mh) null);
            ((am) this).field_Xb.a(var28[0], 0);
            var28[1] = new mh(0L, (mh) null);
            ((am) this).field_Xb.a(var28[1], 0);
            var28[2] = new mh(0L, (mh) null);
            ((am) this).field_Xb.a(var28[2], 0);
            ((am) this).field_Sb = new mh[rg.field_a];
            var16 = 0;
            L5: while (true) {
              if (var16 >= rg.field_a) {
                L6: {
                  ((am) this).field_Tb = new StringBuilder(12);
                  if (param11 == null) {
                    break L6;
                  } else {
                    StringBuilder discarded$1 = ((am) this).field_Tb.append(param11);
                    break L6;
                  }
                }
                L7: {
                  var16 = 0;
                  var17 = param6.field_O.c(tk.field_o);
                  if (var17 <= var16) {
                    break L7;
                  } else {
                    var16 = var17;
                    break L7;
                  }
                }
                L8: {
                  var17 = param6.field_O.c(hq.field_r);
                  if (var16 >= var17) {
                    break L8;
                  } else {
                    var16 = var17;
                    break L8;
                  }
                }
                L9: {
                  var17 = param6.field_O.c(nh.field_d);
                  if (var16 >= var17) {
                    break L9;
                  } else {
                    var16 = var17;
                    break L9;
                  }
                }
                var17 = 0;
                L10: while (true) {
                  if (var17 >= rg.field_a) {
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
                      var18 = this.a(var18, param6, var16, tk.field_o, var28[0], (byte) -53);
                      var18 = this.a(var28[0], (byte) -128, var18, ((am) this).field_Sb[6], var16);
                      var18 = this.a(var28[0], (byte) -21, var18, ((am) this).field_Sb[9], var16);
                      var18 = this.a(var28[0], (byte) -119, var18, ((am) this).field_Sb[5], var16);
                      var18 = this.a(var28[0], (byte) 113, var18, ((am) this).field_Sb[7], var16);
                      var18 = this.a(var28[0], (byte) -126, var18, ((am) this).field_Sb[15], var16);
                      var18 = this.a(var28[0], (byte) -125, var18, ((am) this).field_Sb[4], var16);
                      if (var18 <= var17) {
                        break L12;
                      } else {
                        var17 = var18;
                        break L12;
                      }
                    }
                    L13: {
                      var18 = 0;
                      var18 = this.a(var18, param6, var16, hq.field_r, var28[1], (byte) -53);
                      var18 = this.a(var28[1], (byte) 117, var18, ((am) this).field_Sb[16], var16);
                      var18 = this.a(var28[1], (byte) 36, var18, ((am) this).field_Sb[17], var16);
                      var18 = this.a(var28[1], (byte) -2, var18, ((am) this).field_Sb[18], var16);
                      var18 = this.a(var28[1], (byte) 2, var18, ((am) this).field_Sb[19], var16);
                      var18 = this.a(var28[1], (byte) -120, var18, ((am) this).field_Sb[20], var16);
                      if (var18 <= var17) {
                        break L13;
                      } else {
                        var17 = var18;
                        break L13;
                      }
                    }
                    L14: {
                      var18 = 0;
                      var18 = this.a(var18, param6, var16, nh.field_d, var28[2], (byte) -53);
                      var18 = this.a(var28[2], (byte) -127, var18, ((am) this).field_Sb[13], var16);
                      var18 = this.a(var28[2], (byte) -119, var18, ((am) this).field_Sb[21], var16);
                      var18 = this.a(var28[2], (byte) -121, var18, ((am) this).field_Sb[11], var16);
                      if (var17 >= var18) {
                        break L14;
                      } else {
                        var17 = var18;
                        break L14;
                      }
                    }
                    L15: {
                      var19 = 26 + var16 * 3;
                      var20 = ((am) this).field_Ub.g(87);
                      if (var19 >= var20) {
                        break L15;
                      } else {
                        var19 = var20;
                        break L15;
                      }
                    }
                    L16: {
                      if (((am) this).field_bc == null) {
                        break L16;
                      } else {
                        var20 = ((am) this).field_bc.a((byte) 11, 4);
                        if (var20 <= var19) {
                          break L16;
                        } else {
                          var19 = var20;
                          break L16;
                        }
                      }
                    }
                    L17: {
                      ((am) this).field_Ub.a(24, 0, 0, var19 + 13 - -13, (byte) 64);
                      ((am) this).field_Vb.a(15, 5, ((am) this).field_Ub.field_Ib - 20, 15, (byte) 64);
                      var21 = 10;
                      ((am) this).field_Rb.a(np.field_a * 2, var21, 13, var19, (byte) 64);
                      var21 = var21 + np.field_a * 2;
                      ((am) this).field_Pb.a(2 * np.field_a, var21, 13, var19, (byte) 64);
                      var21 = var21 + (np.field_a * 2 + 10);
                      ((am) this).field_Yb.a(np.field_a, var21, 0, 0, (byte) 64);
                      var21 = var21 + (10 + np.field_a);
                      if (((am) this).field_bc == null) {
                        break L17;
                      } else {
                        var20 = ((am) this).field_bc.a((byte) 11, 4);
                        ((am) this).field_bc.a(var20, 4, np.field_a, var21, true, (-var20 + var19) / 2 + 13);
                        var21 = var21 + (np.field_a + 10);
                        break L17;
                      }
                    }
                    var28[0].a(var17, var21, 13, var16, (byte) 64);
                    var28[1].a(var17, var21, var16 + 13 + 13, var16, (byte) 64);
                    var28[2].a(var17, var21, 39 - -(var16 * 2), var16, (byte) 64);
                    var22 = var21;
                    ((am) this).field_Xb.a(var22 - -var17 + 10, 24, 0, 13 + (var19 + 13), (byte) 64);
                    ((am) this).field_Xb.field_Jb = na.a(false, 8421504, 3, 11579568, ((am) this).field_Xb.field_cb, 2105376);
                    var23 = 13 - -var19 + 13;
                    var24 = 10 + var22 + 24 + var17;
                    var25 = fp.a(-1, var23, param0, param2);
                    var26 = br.a(var24, param1, param3, 120);
                    ((am) this).a(var24, var26, var25, var23, (byte) 64);
                    break L0;
                  } else {
                    if (null != ((am) this).field_Sb[var17]) {
                      var18 = ((am) this).field_Sb[var17].g(95);
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
                if (kd.field_d[var16] != null) {
                  L18: {
                    ((am) this).field_Sb[var16] = new mh(0L, param10, kd.field_d[var16]);
                    ((am) this).field_Sb[var16].field_S = 0;
                    stackOut_13_0 = ((am) this).field_Sb[var16];
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_14_0 = stackOut_13_0;
                    if (param11 == null) {
                      stackOut_15_0 = (mh) (Object) stackIn_15_0;
                      stackOut_15_1 = 0;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      break L18;
                    } else {
                      stackOut_14_0 = (mh) (Object) stackIn_14_0;
                      stackOut_14_1 = 1;
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_16_1 = stackOut_14_1;
                      break L18;
                    }
                  }
                  ((mh) (Object) stackIn_16_0).field_eb = stackIn_16_1 != 0;
                  ((am) this).field_Xb.a(((am) this).field_Sb[var16], 0);
                  var16++;
                  continue L5;
                } else {
                  var16++;
                  continue L5;
                }
              }
            }
          } else {
            ((am) this).field_Rb = new mh(0L, param8, br.field_Ub);
            ((am) this).field_Rb.field_X = 11184810;
            ((am) this).field_Rb.field_S = 1;
            ((am) this).field_Xb.a(((am) this).field_Rb, 0);
            var15_int = 226;
            var16 = 10;
            var17 = ((am) this).field_Rb.field_O.a(((am) this).field_Rb.field_Mb, var15_int);
            ((am) this).field_Rb.a(np.field_a * var17, var16, 13, var15_int, (byte) 64);
            var16 = var16 + var17 * np.field_a;
            ((am) this).field_Xb.a(10 + var16, 24, 0, 13 + (var15_int + 13), (byte) 64);
            ((am) this).field_Xb.field_Jb = na.a(false, 8421504, 3, 11579568, ((am) this).field_Xb.field_cb, 2105376);
            var18 = var15_int + 13 - -13;
            var19 = var16 + 34;
            var20 = fp.a(-1, var18, param0, param2);
            var21 = br.a(var19, param1, param3, -93);
            ((am) this).a(var19, var21, var20, var18, (byte) 64);
            break L0;
          }
        }
    }

    final static void a(int[] param0, int param1) {
        param0[75] = 2;
        param0[79] = -2;
        param0[69] = 4;
        param0[67] = -1;
        param0[77] = 4;
        param0[78] = 5;
        param0[74] = 9;
        param0[70] = param1;
        param0[73] = 5;
        param0[64] = -2;
        param0[71] = 1;
        param0[76] = 6;
        param0[72] = -1;
        param0[65] = -2;
    }

    final int b(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        ni stackIn_8_0 = null;
        ni stackIn_9_0 = null;
        ni stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        mh stackIn_16_0 = null;
        mh stackIn_17_0 = null;
        mh stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        ni stackOut_7_0;
        ni stackOut_9_0;
        int stackOut_9_1;
        ni stackOut_8_0;
        int stackOut_8_1;
        mh stackOut_15_0;
        mh stackOut_17_0;
        int stackOut_17_1;
        mh stackOut_16_0;
        int stackOut_16_1;
        L0: {
          var4 = BrickABrac.field_J ? 1 : 0;
          if (param1 == 8421504) {
            break L0;
          } else {
            field_Qb = null;
            break L0;
          }
        }
        L1: {
          ((am) this).a(param0, -15211);
          if (((am) this).field_Yb != null) {
            L2: {
              ((am) this).field_Yb.field_Mb = ((am) this).field_Tb.toString();
              ((am) this).field_Yb.field_P = (((am) this).field_Ib + -((am) this).field_Yb.field_O.c(((am) this).field_Yb.field_Mb)) / 2;
              ((am) this).field_Yb.field_Ib = -((am) this).field_Yb.field_P + ((am) this).field_Ib;
              if (null != ((am) this).field_bc) {
                if (0 == ((am) this).field_bc.field_L) {
                  break L2;
                } else {
                  L3: {
                    stackOut_7_0 = ((am) this).field_bc;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_8_0 = stackOut_7_0;
                    if (((am) this).field_bc.field_Nb) {
                      stackOut_9_0 = (ni) (Object) stackIn_9_0;
                      stackOut_9_1 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      break L3;
                    } else {
                      stackOut_8_0 = (ni) (Object) stackIn_8_0;
                      stackOut_8_1 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      break L3;
                    }
                  }
                  ((ni) (Object) stackIn_10_0).field_Nb = stackIn_10_1 != 0;
                  break L2;
                }
              } else {
                break L2;
              }
            }
            var3 = 0;
            L4: while (true) {
              if (var3 >= rg.field_a) {
                break L1;
              } else {
                if (null != ((am) this).field_Sb[var3]) {
                  L5: {
                    stackOut_15_0 = ((am) this).field_Sb[var3];
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_16_0 = stackOut_15_0;
                    if ((((am) this).field_Tb.length() ^ -1) >= -1) {
                      stackOut_17_0 = (mh) (Object) stackIn_17_0;
                      stackOut_17_1 = 0;
                      stackIn_18_0 = stackOut_17_0;
                      stackIn_18_1 = stackOut_17_1;
                      break L5;
                    } else {
                      stackOut_16_0 = (mh) (Object) stackIn_16_0;
                      stackOut_16_1 = 1;
                      stackIn_18_0 = stackOut_16_0;
                      stackIn_18_1 = stackOut_16_1;
                      break L5;
                    }
                  }
                  ((mh) (Object) stackIn_18_0).field_eb = stackIn_18_1 != 0;
                  if (((am) this).field_Sb[var3].field_eb) {
                    if (((am) this).field_Sb[var3].field_L != 0) {
                      return var3;
                    } else {
                      var3++;
                      continue L4;
                    }
                  } else {
                    var3++;
                    continue L4;
                  }
                } else {
                  var3++;
                  continue L4;
                }
              }
            }
          } else {
            break L1;
          }
        }
        if (((am) this).field_Vb.field_L == 0) {
          L6: {
            if (!param0) {
              break L6;
            } else {
              if (0 == ki.field_e) {
                break L6;
              } else {
                if (((am) this).field_L != 0) {
                  break L6;
                } else {
                  return -1;
                }
              }
            }
          }
          return ((am) this).field_ac;
        } else {
          return -1;
        }
    }

    static {
    }
}
