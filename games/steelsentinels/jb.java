/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jb extends kd {
    private wl field_I;
    static int field_P;
    private ee field_Z;
    private int field_z;
    private int field_N;
    int field_G;
    int field_H;
    int field_M;
    int field_V;
    static wk field_L;
    static String field_Q;
    private boolean field_R;
    boolean field_O;
    static wk field_B;
    static wk[] field_S;
    int field_T;
    static String field_E;
    int field_K;
    private int field_y;
    private mb[] field_X;
    static String field_W;
    int field_U;
    int field_F;
    private int field_Y;
    static ul field_A;
    static wk[] field_J;
    static gh field_C;
    static fm field_D;

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (ka.field_V) {
          L0: {
            var4 = param1 + (this.field_H >> -1472228152);
            var5 = param0 - -(this.field_M >> 134545736);
            var6 = 2 % ((param2 - 30) / 54);
            var7 = (this.field_Y + (-this.field_Y + this.field_z) / 4) * this.field_U / this.field_z;
            var8 = var7 >> 1101630340;
            var9 = this.field_z / 2;
            var10 = 2500;
            if (null == this.field_I) {
              break L0;
            } else {
              var10 = this.field_I.field_O * 25;
              if ((var10 ^ -1) >= -2501) {
                break L0;
              } else {
                var10 = 2500;
                break L0;
              }
            }
          }
          L1: {
            if (0 >= var8) {
              break L1;
            } else {
              L2: {
                if (this.field_I == null) {
                  break L2;
                } else {
                  if (300 >= this.field_I.field_O) {
                    break L2;
                  } else {
                    L3: {
                      if ((this.field_Y ^ -1) <= (var9 ^ -1)) {
                        break L3;
                      } else {
                        qh.b(var10 * this.field_Y * 10 / var9, var5 << -1043805756, 15, var4 << 112215556, var8 << -945771612);
                        if (SteelSentinels.field_G == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if ((this.field_Y ^ -1) <= (2 * var9 ^ -1)) {
                      break L2;
                    } else {
                      qh.b(10 * (2 * var9 - this.field_Y) * var10 / var9, var5 << 936241060, 15, var4 << -700152828, var8 << 618860644);
                      break L1;
                    }
                  }
                }
              }
              break L1;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static wk[] g(int param0) {
        wk[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        byte[] var10 = null;
        int[] var11 = null;
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_12_0 = 0;
        var7 = SteelSentinels.field_G;
        if (param0 == 7) {
          var1 = new wk[rl.field_d];
          var2 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if ((rl.field_d ^ -1) >= (var2 ^ -1)) {
                  break L2;
                } else {
                  var3 = le.field_L[var2] * ca.field_r[var2];
                  var10 = dl.field_L[var2];
                  var11 = new int[var3];
                  var9 = var11;
                  var5 = var9;
                  stackOut_4_0 = 0;
                  stackIn_13_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (var7 != 0) {
                    break L1;
                  } else {
                    var6 = stackIn_5_0;
                    L3: while (true) {
                      L4: {
                        L5: {
                          if ((var3 ^ -1) >= (var6 ^ -1)) {
                            break L5;
                          } else {
                            var5[var6] = ba.field_d[ec.a((int) var10[var6], 255)];
                            var6++;
                            if (var7 != 0) {
                              break L4;
                            } else {
                              if (var7 == 0) {
                                continue L3;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        var1[var2] = new wk(un.field_n, eb.field_n, rl.field_a[var2], oa.field_M[var2], le.field_L[var2], ca.field_r[var2], var11);
                        var2++;
                        break L4;
                      }
                      if (var7 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              stackOut_12_0 = 9324;
              stackIn_13_0 = stackOut_12_0;
              break L1;
            }
            uh.a(stackIn_13_0);
            return var1;
          }
        } else {
          return (wk[]) null;
        }
    }

    final void a(boolean param0) {
        pc discarded$4 = null;
        pc discarded$5 = null;
        pc discarded$6 = null;
        pc discarded$7 = null;
        int var2 = 0;
        int var3 = 0;
        jc var4_ref_jc = null;
        int var4 = 0;
        wl var5_ref_wl = null;
        double var5_double = 0.0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        mb var7_ref_mb = null;
        qb var7_ref_qb = null;
        double var8_double = 0.0;
        int var8_int = 0;
        mb var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        jc var14 = null;
        mb[] var15 = null;
        ie var16 = null;
        mb var17 = null;
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        double stackIn_50_0 = 0.0;
        double stackIn_51_0 = 0.0;
        double stackIn_52_0 = 0.0;
        int stackIn_52_1 = 0;
        int stackIn_77_0 = 0;
        int stackIn_77_1 = 0;
        int stackIn_111_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_114_0 = 0;
        int stackIn_114_1 = 0;
        int stackIn_266_0 = 0;
        int stackIn_266_1 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        double stackOut_49_0 = 0.0;
        double stackOut_50_0 = 0.0;
        int stackOut_50_1 = 0;
        double stackOut_51_0 = 0.0;
        int stackOut_51_1 = 0;
        int stackOut_76_0 = 0;
        int stackOut_76_1 = 0;
        int stackOut_109_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_112_0 = 0;
        int stackOut_112_1 = 0;
        int stackOut_113_0 = 0;
        int stackOut_113_1 = 0;
        int stackOut_265_0 = 0;
        int stackOut_265_1 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = SteelSentinels.field_G;
                    var2 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    stackOut_1_0 = this.field_N;
                    stackOut_1_1 = var2;
                    stackIn_2_0 = stackOut_1_0;
                    stackIn_2_1 = stackOut_1_1;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (stackIn_2_0 < stackIn_2_1) {
                        statePc = 71;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    this.field_M = this.field_M + this.field_T;
                    this.field_H = this.field_H + this.field_V;
                    stackOut_3_0 = this.field_Z.field_ab.a((byte) -105, this.field_H >> 1932750148) ^ -1;
                    stackOut_3_1 = -(this.field_M >> -817051132) ^ -1;
                    stackIn_266_0 = stackOut_3_0;
                    stackIn_266_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var13 != 0) {
                        statePc = 266;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (stackIn_4_0 >= stackIn_4_1) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    this.field_M = -(this.field_Z.field_ab.a((byte) -124, this.field_H >> 1607703460) << 152960612);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    var3 = this.field_G * this.field_Y / (this.field_z * 2);
                    if (var3 != 0) {
                        statePc = 10;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (0 < this.field_Y) {
                        statePc = 9;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var3 = 1;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    this.field_Y = this.field_Y + 1;
                    var4 = this.field_Y * this.field_G / (this.field_z * 2);
                    if (this.field_I == null) {
                        statePc = 29;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (this.field_X == null) {
                        statePc = 29;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (this.field_I.field_C == 7) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (-10 != (this.field_I.field_y ^ -1)) {
                        statePc = 29;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if ((this.field_Y & 63 ^ -1) != -1) {
                        statePc = 29;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var14 = new jc(this.field_Z.field_K);
                    var6 = 0;
                    var7_ref_mb = (mb) ((Object) var14.b(2));
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (var7_ref_mb == null) {
                        statePc = 24;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackOut_18_0 = var6;
                    stackOut_18_1 = this.field_X.length;
                    stackIn_25_0 = stackOut_18_0;
                    stackIn_25_1 = stackOut_18_1;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    if (var13 != 0) {
                        statePc = 25;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (stackIn_19_0 == stackIn_19_1) {
                        statePc = 21;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var15 = this.field_X;
                    this.field_X = new mb[this.field_Z.field_K.b((byte) -128)];
                    ii.a(var15, 0, this.field_X, 0, var6);
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    this.field_X[var6] = var7_ref_mb;
                    var6++;
                    var7_ref_mb = (mb) ((Object) var14.d(2));
                    if (var13 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    stackOut_24_0 = var6 ^ -1;
                    stackOut_24_1 = this.field_X.length ^ -1;
                    stackIn_25_0 = stackOut_24_0;
                    stackIn_25_1 = stackOut_24_1;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if (stackIn_25_0 <= stackIn_25_1) {
                        statePc = 29;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    this.field_X[var6] = null;
                    var6++;
                    if (var13 != 0) {
                        statePc = 31;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (var13 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (-1 == (var4 ^ -1)) {
                        statePc = 31;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var4 = 1;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    if (!this.field_Z.field_h) {
                        statePc = 34;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (var4 <= var3) {
                        statePc = 70;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var5_double = 3.141592653589793 * Math.random() * 2.0;
                    var7_ref_mb = null;
                    stackOut_35_0 = 0;
                    stackOut_35_1 = this.field_K;
                    stackIn_2_0 = stackOut_35_0;
                    stackIn_2_1 = stackOut_35_1;
                    stackIn_36_0 = stackOut_35_0;
                    stackIn_36_1 = stackOut_35_1;
                    if (var13 != 0) {
                        statePc = 2;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (stackIn_36_0 == stackIn_36_1) {
                        statePc = 66;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (this.field_K != 1) {
                        statePc = 39;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var8_double = Math.random() * (double)((this.field_z - this.field_Y) / 4 + this.field_Y) * (double)this.field_U / (double)this.field_z;
                    var10 = (int)(Math.sin(var5_double) * var8_double) << -1845808988;
                    var11 = (int)(Math.cos(var5_double) * var8_double) << 661164196;
                    var7_ref_qb = nk.a(3, 0, this.field_Z, 104, this.field_M - -var11, this.field_R, 50, 0, var10 + this.field_H, this.field_y);
                    this.field_Z.field_O.a(3, var7_ref_qb);
                    statePc = 69;
                    continue stateLoop;
                }
                case 39: {
                    if (this.field_K == 2) {
                        statePc = 57;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if ((this.field_K ^ -1) == -4) {
                        statePc = 56;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (4 != this.field_K) {
                        statePc = 43;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    var8_double = (Math.random() * (double)(-this.field_Y + this.field_z) / 4.0 + (double)this.field_Y) * (double)this.field_U / (double)this.field_z;
                    var10 = (int)(Math.sin(var5_double) * var8_double) << -44566940;
                    var11 = (int)(Math.cos(var5_double) * var8_double) << -2069997756;
                    var7_ref_qb = nk.a(1, 0, this.field_Z, 114, this.field_M - -var11, this.field_R, 150, 0, this.field_H - -var10, this.field_y);
                    this.field_Z.field_O.a(3, var7_ref_qb);
                    var7_ref_qb = nk.a(0, var10 >> 730728581, this.field_Z, 115, this.field_M - -(var11 / 2), this.field_R, 300, var11 >> 21113445, this.field_H + var10 / 2, this.field_y);
                    this.field_Z.field_O.a(3, var7_ref_qb);
                    statePc = 69;
                    continue stateLoop;
                }
                case 43: {
                    if (5 == this.field_K) {
                        statePc = 55;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if ((this.field_K ^ -1) != -7) {
                        statePc = 46;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    var8_double = Math.random() * (double)(this.field_Y + (this.field_z - this.field_Y) / 4) * (double)this.field_U / (double)this.field_z;
                    var10 = (int)(var8_double * Math.sin(var5_double)) << -738326140;
                    var11 = (int)(Math.cos(var5_double) * var8_double) << 1821709284;
                    var7_ref_qb = nk.a(0, 0, this.field_Z, 111, var11 + this.field_M, this.field_R, 100, 0, var10 + this.field_H, this.field_y);
                    var7_ref_qb.field_O = (int)(2000.0 * -Math.random());
                    this.field_Z.field_O.a(3, var7_ref_qb);
                    statePc = 69;
                    continue stateLoop;
                }
                case 46: {
                    if (-8 == (this.field_K ^ -1)) {
                        statePc = 54;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (8 == this.field_K) {
                        statePc = 53;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (this.field_K != 9) {
                        statePc = 69;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    var8_double = Math.random() * (double)((-this.field_Y + this.field_z) / 4 + this.field_Y) * (double)this.field_U / (double)this.field_z;
                    stackOut_49_0 = var8_double;
                    stackIn_51_0 = stackOut_49_0;
                    stackIn_50_0 = stackOut_49_0;
                    if (Math.sin(var5_double) < 0.0) {
                        statePc = 51;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    stackOut_50_0 = stackIn_50_0;
                    stackOut_50_1 = 1;
                    stackIn_52_0 = stackOut_50_0;
                    stackIn_52_1 = stackOut_50_1;
                    statePc = 52;
                    continue stateLoop;
                }
                case 51: {
                    stackOut_51_0 = stackIn_51_0;
                    stackOut_51_1 = -1;
                    stackIn_52_0 = stackOut_51_0;
                    stackIn_52_1 = stackOut_51_1;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    var10 = (int)(stackIn_52_0 * (double)stackIn_52_1) << 2059431620;
                    var7_ref_qb = nk.a(0, 0, this.field_Z, 102, 0, this.field_R, 50, 0, this.field_H + var10, this.field_y);
                    this.field_Z.field_O.a(3, var7_ref_qb);
                    statePc = 69;
                    continue stateLoop;
                }
                case 53: {
                    var8_double = (double)(this.field_Y * this.field_U / this.field_z);
                    var10 = (int)(var8_double * Math.sin(0.2 * (double)var3)) << -1650854844;
                    var11 = (int)(var8_double * Math.cos(0.2 * (double)var3)) << 1514739652;
                    var7_ref_qb = nk.a(5, 0, this.field_Z, 99, this.field_M + var11, this.field_R, 100, 0, var10 + this.field_H, this.field_y);
                    this.field_Z.field_O.a(3, var7_ref_qb);
                    var7_ref_qb = nk.a(5, 0, this.field_Z, 113, -var11 + this.field_M, this.field_R, 100, 0, this.field_H - var10, this.field_y);
                    this.field_Z.field_O.a(3, var7_ref_qb);
                    statePc = 69;
                    continue stateLoop;
                }
                case 54: {
                    var8_double = Math.random() * (double)((-this.field_Y + this.field_z) / 4 + this.field_Y) * (double)this.field_U / (double)this.field_z;
                    var10 = (int)(Math.sin(var5_double) * var8_double) << -473871292;
                    var11 = (int)(Math.cos(var5_double) * var8_double) << 985360580;
                    var7_ref_qb = nk.a(4, 0, this.field_Z, 112, var11 + this.field_M, this.field_R, 100, 0, this.field_H - -var10, this.field_y);
                    this.field_Z.field_O.a(3, var7_ref_qb);
                    statePc = 69;
                    continue stateLoop;
                }
                case 55: {
                    var8_double = Math.random() * (double)((this.field_z + -this.field_Y) / 4 + this.field_Y) * (double)this.field_U / (double)this.field_z;
                    var10 = (int)(Math.sin(var5_double) * var8_double) << -1786965980;
                    var11 = (int)(var8_double * Math.cos(var5_double)) << -1165200796;
                    var7_ref_qb = nk.a(5, 0, this.field_Z, 104, this.field_M - (-(var11 / 256) - -3584), this.field_R, 100, 0, this.field_H + var10 / 256, this.field_y);
                    this.field_Z.field_O.a(3, var7_ref_qb);
                    var10 = (int)(Math.sin((double)var3 * 0.2) * var8_double) << -1130252540;
                    var11 = (int)(var8_double * Math.cos((double)var3 * 0.2)) << 20268644;
                    var7_ref_qb = nk.a(5, 0, this.field_Z, 95, this.field_M - -var11, this.field_R, 100, 0, this.field_H - -var10, this.field_y);
                    this.field_Z.field_O.a(3, var7_ref_qb);
                    statePc = 69;
                    continue stateLoop;
                }
                case 56: {
                    var8_double = Math.random() * (double)((this.field_z - this.field_Y) / 4 + this.field_Y) * (double)this.field_U / (double)this.field_z;
                    var10 = (int)(var8_double * Math.sin(var5_double)) << 1675109764;
                    var11 = (int)(Math.cos(var5_double) * var8_double) << -458771932;
                    var7_ref_qb = nk.a(4, 0, this.field_Z, 95, this.field_M + var11, this.field_R, 100, 0, var10 + this.field_H, this.field_y);
                    this.field_Z.field_O.a(3, var7_ref_qb);
                    statePc = 69;
                    continue stateLoop;
                }
                case 57: {
                    var8_double = (Math.random() * (double)(this.field_z - this.field_Y) / 4.0 + (double)this.field_Y) * (double)this.field_U / (double)this.field_z;
                    var10 = (int)(Math.sin(var5_double) * var8_double) << -1925134236;
                    var11 = (int)(Math.cos(var5_double) * var8_double) << 1519389796;
                    var7_ref_qb = nk.a(1, 0, this.field_Z, 125, var11 / 2 + this.field_M, this.field_R, 50, 0, this.field_H + var10 / 2, this.field_y);
                    this.field_Z.field_O.a(3, var7_ref_qb);
                    var12 = 0;
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    if ((var12 ^ -1) <= -6) {
                        statePc = 62;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    var7_ref_qb = nk.a(0, (int)(-64.0 + 128.0 * Math.random()) + (var10 >> -388248219), this.field_Z, 117, this.field_M - -(var11 / 2), this.field_R, 200, (var11 >> 1082373605) - -(int)(128.0 * Math.random() - 64.0), this.field_H - -(var10 / 2), this.field_y);
                    var12++;
                    if (var13 != 0) {
                        statePc = 69;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    if (var13 == 0) {
                        statePc = 58;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    if (-33 == (this.field_I.field_y ^ -1)) {
                        statePc = 65;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    if ((this.field_I.field_y ^ -1) == 1) {
                        statePc = 65;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    discarded$4 = fc.a((byte) -69, 91, this.field_H);
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    this.field_Z.field_O.a(3, var7_ref_qb);
                    statePc = 69;
                    continue stateLoop;
                }
                case 66: {
                    var8_double = (Math.random() * (double)(-this.field_Y + this.field_z) / 4.0 + (double)this.field_Y) * (double)this.field_U / (double)this.field_z + 1.0;
                    var10 = (int)(var8_double * Math.sin(var5_double)) << -1150987260;
                    var11 = (int)(var8_double * Math.cos(var5_double)) << 1244233828;
                    var7_ref_qb = nk.a(1, 0, this.field_Z, 126, this.field_M - -(var11 / 2), this.field_R, 150, 0, var10 / 2 + this.field_H, this.field_y);
                    this.field_Z.field_O.a(3, var7_ref_qb);
                    if (10 <= this.field_Y) {
                        statePc = 68;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    var12 = 25;
                    var7_ref_qb = nk.a(10, (int)((double)(var12 * var10) / var8_double), this.field_Z, 95, var11 + this.field_M, this.field_R, 100, (int)((double)(var12 * var11) / var8_double), var10 + this.field_H, this.field_y);
                    this.field_Z.field_O.a(3, var7_ref_qb);
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    var7_ref_qb = nk.a(0, var10 >> -577533276, this.field_Z, 94, this.field_M - -(var11 / 2), this.field_R, 300, -(10 * this.field_Y) + (var11 >> 1000411492), var10 / 2 + this.field_H, this.field_y);
                    this.field_Z.field_O.a(3, var7_ref_qb);
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    var3++;
                    if (var13 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    var2++;
                    if (var13 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    if (!param0) {
                        statePc = 73;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    return;
                }
                case 73: {
                    this.field_F = this.field_U * (this.field_Y + (-this.field_Y + this.field_z) / 4) / this.field_z;
                    if (!this.field_O) {
                        statePc = 101;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    var2 = this.field_F * this.field_F;
                    var16 = new ie(new int[]{this.field_Z.field_r, this.field_H, this.field_M});
                    var4_ref_jc = new jc(this.field_Z.field_db);
                    var5_ref_wl = (wl) ((Object) var4_ref_jc.b(2));
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    if (var5_ref_wl == null) {
                        statePc = 101;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    var6 = -var5_ref_wl.field_U + this.field_H >> 913818532;
                    var7 = -var5_ref_wl.field_A + this.field_M >> -2107133436;
                    stackOut_76_0 = var5_ref_wl.field_C ^ -1;
                    stackOut_76_1 = -3;
                    stackIn_266_0 = stackOut_76_0;
                    stackIn_266_1 = stackOut_76_1;
                    stackIn_77_0 = stackOut_76_0;
                    stackIn_77_1 = stackOut_76_1;
                    if (var13 != 0) {
                        statePc = 266;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    if (stackIn_77_0 == stackIn_77_1) {
                        statePc = 81;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    if ((var5_ref_wl.field_C ^ -1) == -4) {
                        statePc = 81;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if (var5_ref_wl.field_C != 20) {
                        statePc = 92;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    if (var5_ref_wl.field_y == 32) {
                        statePc = 92;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    if ((var2 ^ -1) <= (var7 * var7 + var6 * var6 ^ -1)) {
                        statePc = 84;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 84: {
                    if (null == var5_ref_wl.field_X) {
                        statePc = 88;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    if (this.field_I.field_X != var5_ref_wl.field_X) {
                        statePc = 87;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 87: {
                    this.field_I.field_X.field_ob = this.field_I.field_X.field_ob + 1;
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    var5_ref_wl.field_bb = true;
                    if ((var5_ref_wl.field_C ^ -1) != -21) {
                        statePc = 90;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 90: {
                    var5_ref_wl.field_T = true;
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    var5_ref_wl.field_X = this.field_I.field_X;
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    if (8 != var5_ref_wl.field_C) {
                        statePc = 100;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    if (var6 * var6 + var7 * var7 > var2) {
                        statePc = 100;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    if (8 < var16.a(93, 100)) {
                        statePc = 100;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    var5_ref_wl.field_bb = true;
                    if (null == var5_ref_wl.field_X) {
                        statePc = 99;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    if (var5_ref_wl.field_X != this.field_I.field_X) {
                        statePc = 98;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 98: {
                    this.field_I.field_X.field_ob = this.field_I.field_X.field_ob + 1;
                    statePc = 99;
                    continue stateLoop;
                }
                case 99: {
                    var5_ref_wl.field_X = this.field_I.field_X;
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    var5_ref_wl = (wl) ((Object) var4_ref_jc.d(2));
                    if (var13 == 0) {
                        statePc = 75;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    if (this.field_X == null) {
                        statePc = 265;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    if ((this.field_I.field_O ^ -1) < -1) {
                        statePc = 104;
                    } else {
                        statePc = 265;
                    }
                    continue stateLoop;
                }
                case 104: {
                    var2 = 0;
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    if (this.field_X.length <= var2) {
                        statePc = 265;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    var17 = this.field_X[var2];
                    if (var13 != 0) {
                        statePc = 268;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    if (var17 == null) {
                        statePc = 264;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    if (this.field_R) {
                        statePc = 110;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    stackOut_109_0 = 1;
                    stackIn_111_0 = stackOut_109_0;
                    statePc = 111;
                    continue stateLoop;
                }
                case 110: {
                    stackOut_110_0 = 0;
                    stackIn_111_0 = stackOut_110_0;
                    statePc = 111;
                    continue stateLoop;
                }
                case 111: {
                    stackOut_111_0 = stackIn_111_0;
                    stackIn_113_0 = stackOut_111_0;
                    stackIn_112_0 = stackOut_111_0;
                    if (var17.field_u) {
                        statePc = 113;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    stackOut_112_0 = stackIn_112_0;
                    stackOut_112_1 = 1;
                    stackIn_114_0 = stackOut_112_0;
                    stackIn_114_1 = stackOut_112_1;
                    statePc = 114;
                    continue stateLoop;
                }
                case 113: {
                    stackOut_113_0 = stackIn_113_0;
                    stackOut_113_1 = 0;
                    stackIn_114_0 = stackOut_113_0;
                    stackIn_114_1 = stackOut_113_1;
                    statePc = 114;
                    continue stateLoop;
                }
                case 114: {
                    if (stackIn_114_0 == stackIn_114_1) {
                        statePc = 117;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    if (this.field_Z.field_ab.b((byte) 127, var17.field_hc >> -1123851324) == this.field_Z.field_ab.a(false, var17.field_hc >> 1107267236)) {
                        statePc = 117;
                    } else {
                        statePc = 264;
                    }
                    continue stateLoop;
                }
                case 117: {
                    if ((var17.field_o ^ -1) == 0) {
                        statePc = 121;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    if (this.field_I.field_y == var17.field_o) {
                        statePc = 121;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    if (var13 == 0) {
                        statePc = 264;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    var4 = this.field_H - var17.field_hc >> -579523580;
                    var5 = 768 + (-var17.field_Gb + this.field_M) >> -1393705692;
                    if (Math.abs(var4) > this.field_F) {
                        statePc = 264;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    if (this.field_F * this.field_F < var4 * var4 + var5 * var5) {
                        statePc = 264;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    if (9 != this.field_I.field_C) {
                        statePc = 135;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    if (this.field_I.field_X == null) {
                        statePc = 135;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    if (1 != this.field_I.field_X.field_fb) {
                        statePc = 127;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    var17.field_ab = var17.field_ab - 80000 / var17.field_Eb;
                    var17.field_K = var17.field_K + 400000 * this.field_I.field_X.field_E / var17.field_Eb;
                    statePc = 127;
                    continue stateLoop;
                }
                case 127: {
                    if (2 == this.field_I.field_X.field_fb) {
                        statePc = 129;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 129: {
                    if (this.field_I.field_X.field_hc > var17.field_hc) {
                        statePc = 131;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    var17.field_K = var17.field_K + 200000 / var17.field_Eb;
                    statePc = 131;
                    continue stateLoop;
                }
                case 131: {
                    var17.field_ab = var17.field_ab - 200000 / var17.field_Eb;
                    if (var17.field_hc >= this.field_I.field_X.field_hc) {
                        statePc = 133;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    var17.field_K = var17.field_K - 200000 / var17.field_Eb;
                    statePc = 133;
                    continue stateLoop;
                }
                case 133: {
                    if (-4 != (this.field_I.field_X.field_fb ^ -1)) {
                        statePc = 135;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    var17.field_ab = var17.field_ab - 160000 / var17.field_Eb;
                    var17.field_K = var17.field_K + 80000 * this.field_I.field_X.field_E / var17.field_Eb;
                    statePc = 135;
                    continue stateLoop;
                }
                case 135: {
                    this.field_X[var2] = null;
                    var6 = ik.a(var5 * var5 + var4 * var4, -117);
                    if (var6 <= this.field_U / 2) {
                        statePc = 139;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    if (this.field_I.field_C == 9) {
                        statePc = 139;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    var7 = this.field_I.field_O * (this.field_U - var6) / (this.field_U / 2);
                    if (1 <= var7) {
                        statePc = 140;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    var7 = 1;
                    if (var13 == 0) {
                        statePc = 140;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    var7 = this.field_I.field_O;
                    statePc = 140;
                    continue stateLoop;
                }
                case 140: {
                    if ((this.field_I.field_C ^ -1) != -10) {
                        statePc = 183;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    var7 = this.field_I.field_O;
                    var17.field_S = var17.field_S - this.field_I.field_kb;
                    if ((this.field_I.field_kb ^ -1) >= (var17.field_mc ^ -1)) {
                        statePc = 145;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    if (var17.h(-128)) {
                        statePc = 144;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 144: {
                    var17.field_mc = this.field_I.field_kb;
                    statePc = 145;
                    continue stateLoop;
                }
                case 145: {
                    if ((this.field_I.field_kb ^ -1) >= -1) {
                        statePc = 150;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    if (var17.field_Tb <= 0) {
                        statePc = 150;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    if (var17.h(-122)) {
                        statePc = 149;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 149: {
                    var17.a(true, Math.min(var17.field_Tb, this.field_I.field_kb / 50));
                    statePc = 150;
                    continue stateLoop;
                }
                case 150: {
                    if (-1 >= (var17.field_S ^ -1)) {
                        statePc = 152;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    var17.field_S = 0;
                    statePc = 152;
                    continue stateLoop;
                }
                case 152: {
                    if (0 >= var17.field_rb) {
                        statePc = 154;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    var17.a((byte) 40, this.field_I);
                    statePc = 154;
                    continue stateLoop;
                }
                case 154: {
                    if (var17.field_rb <= 0) {
                        statePc = 157;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    if (this.field_I.field_X != null) {
                        statePc = 162;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    if (-1 <= (var17.field_rb ^ -1)) {
                        statePc = 178;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    if (null != this.field_I.field_X) {
                        statePc = 178;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    if ((var17.field_z ^ -1) < -1) {
                        statePc = 178;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    var17.e(128, var7);
                    if (var13 == 0) {
                        statePc = 178;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    var8_int = var7;
                    if (var8_int <= var17.field_rb) {
                        statePc = 164;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    var8_int = var17.field_rb;
                    statePc = 164;
                    continue stateLoop;
                }
                case 164: {
                    if (var8_int < 0) {
                        statePc = 166;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 166: {
                    var8_int = 0;
                    statePc = 167;
                    continue stateLoop;
                }
                case 167: {
                    if ((var17.field_Nb ^ -1) != -9) {
                        statePc = 169;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 169: {
                    if (var17.field_z <= 0) {
                        statePc = 171;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 171: {
                    if ((this.field_I.field_X.field_jc ^ -1) != (var17.field_jc ^ -1)) {
                        statePc = 175;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    if (this.field_I.field_X == var17) {
                        statePc = 176;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    this.field_I.field_X.b(-(this.field_Z.field_l * (var8_int * var17.field_lb / var17.field_Eb)), 26511);
                    if (var13 == 0) {
                        statePc = 176;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    this.field_I.field_X.b(this.field_Z.field_l * (var8_int * var17.field_lb / var17.field_Eb), 26511);
                    this.field_I.field_X.field_Ac = this.field_I.field_X.field_Ac + var8_int;
                    statePc = 176;
                    continue stateLoop;
                }
                case 176: {
                    if ((var17.field_z ^ -1) < -1) {
                        statePc = 178;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    var17.e(128, var7);
                    statePc = 178;
                    continue stateLoop;
                }
                case 178: {
                    if (var17.field_Lb) {
                        statePc = 180;
                    } else {
                        statePc = 264;
                    }
                    continue stateLoop;
                }
                case 180: {
                    if (!var17.i(29, -27)) {
                        statePc = 182;
                    } else {
                        statePc = 264;
                    }
                    continue stateLoop;
                }
                case 182: {
                    var17.field_Dc = 200;
                    if (var13 == 0) {
                        statePc = 264;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    var17.field_S = var17.field_S - var7 * this.field_I.field_kb / this.field_I.field_O;
                    if ((var17.field_S ^ -1) <= -1) {
                        statePc = 185;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    var17.field_S = 0;
                    statePc = 185;
                    continue stateLoop;
                }
                case 185: {
                    if (0 >= var17.field_S) {
                        statePc = 187;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 186: {
                    discarded$5 = fc.a((byte) 114, 27, this.field_H);
                    statePc = 187;
                    continue stateLoop;
                }
                case 187: {
                    var17.field_S = var17.field_S - var7;
                    var17.field_P = 100;
                    if (0 > var17.field_S) {
                        statePc = 189;
                    } else {
                        statePc = 264;
                    }
                    continue stateLoop;
                }
                case 189: {
                    if ((this.field_I.field_C ^ -1) == -2) {
                        statePc = 195;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    if (this.field_I.field_C == 2) {
                        statePc = 195;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    if (this.field_I.field_C == 3) {
                        statePc = 195;
                    } else {
                        statePc = 192;
                    }
                    continue stateLoop;
                }
                case 192: {
                    if (-21 == (this.field_I.field_C ^ -1)) {
                        statePc = 195;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    discarded$6 = fc.a((byte) 91, 55, this.field_H);
                    if (var13 == 0) {
                        statePc = 196;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 195: {
                    discarded$7 = fc.a((byte) -100, 51, this.field_H);
                    var8_int = var17.h(0, 33);
                    var17.field_S = var17.field_S >> var8_int;
                    statePc = 196;
                    continue stateLoop;
                }
                case 196: {
                    if (var17.field_rb > 0) {
                        statePc = 198;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 198: {
                    var17.a((byte) 68, this.field_I);
                    statePc = 199;
                    continue stateLoop;
                }
                case 199: {
                    if (var17.field_rb <= 0) {
                        statePc = 240;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 200: {
                    if (this.field_I.field_X == null) {
                        statePc = 240;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    var8 = this.field_I.field_X;
                    if (this.field_I.field_X == this.field_I.field_G) {
                        statePc = 209;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    if (null == this.field_I.field_G) {
                        statePc = 209;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 203: {
                    if ((this.field_I.field_G.field_jc ^ -1) == (this.field_I.field_X.field_jc ^ -1)) {
                        statePc = 206;
                    } else {
                        statePc = 204;
                    }
                    continue stateLoop;
                }
                case 204: {
                    if (var17.field_jc == this.field_I.field_X.field_jc) {
                        statePc = 208;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 206: {
                    if (var17 != this.field_I.field_X) {
                        statePc = 209;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    var8 = this.field_I.field_G;
                    statePc = 209;
                    continue stateLoop;
                }
                case 209: {
                    var9 = -var17.field_S;
                    if (var17.field_rb >= var9) {
                        statePc = 211;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 210: {
                    var9 = var17.field_rb;
                    statePc = 211;
                    continue stateLoop;
                }
                case 211: {
                    if (0 > var9) {
                        statePc = 213;
                    } else {
                        statePc = 214;
                    }
                    continue stateLoop;
                }
                case 213: {
                    var9 = 0;
                    statePc = 214;
                    continue stateLoop;
                }
                case 214: {
                    if (var17.field_Nb != 8) {
                        statePc = 216;
                    } else {
                        statePc = 223;
                    }
                    continue stateLoop;
                }
                case 216: {
                    if (-1 > (var17.field_z ^ -1)) {
                        statePc = 223;
                    } else {
                        statePc = 217;
                    }
                    continue stateLoop;
                }
                case 217: {
                    if (var17.field_jc == var8.field_jc) {
                        statePc = 220;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 218: {
                    var8.b(this.field_Z.field_l * (var17.field_lb * var9 / var17.field_Eb), 26511);
                    var8.field_Ac = var8.field_Ac + var9;
                    if (var13 == 0) {
                        statePc = 223;
                    } else {
                        statePc = 220;
                    }
                    continue stateLoop;
                }
                case 220: {
                    if (var17 != var8) {
                        statePc = 222;
                    } else {
                        statePc = 223;
                    }
                    continue stateLoop;
                }
                case 222: {
                    var8.b(-(this.field_Z.field_l * (var17.field_lb * var9 / var17.field_Eb)), 26511);
                    statePc = 223;
                    continue stateLoop;
                }
                case 223: {
                    if (var17.field_z <= 0) {
                        statePc = 225;
                    } else {
                        statePc = 239;
                    }
                    continue stateLoop;
                }
                case 225: {
                    var17.e(128, -var17.field_S);
                    if (var17.field_rb > 0) {
                        statePc = 231;
                    } else {
                        statePc = 226;
                    }
                    continue stateLoop;
                }
                case 226: {
                    if ((var17.field_Nb ^ -1) == -9) {
                        statePc = 231;
                    } else {
                        statePc = 227;
                    }
                    continue stateLoop;
                }
                case 227: {
                    if (!this.field_I.field_bb) {
                        statePc = 231;
                    } else {
                        statePc = 228;
                    }
                    continue stateLoop;
                }
                case 228: {
                    if (this.field_I.field_G == var8) {
                        statePc = 231;
                    } else {
                        statePc = 229;
                    }
                    continue stateLoop;
                }
                case 229: {
                    if ((var8.field_jc ^ -1) != (var17.field_jc ^ -1)) {
                        statePc = 231;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 231: {
                    if ((var17.field_rb ^ -1) < -1) {
                        statePc = 239;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 232: {
                    if (-1 == (var17.field_Nb ^ -1)) {
                        statePc = 235;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 233: {
                    if (11 != var17.field_Nb) {
                        statePc = 239;
                    } else {
                        statePc = 235;
                    }
                    continue stateLoop;
                }
                case 235: {
                    if (32 != this.field_I.field_y) {
                        statePc = 239;
                    } else {
                        statePc = 236;
                    }
                    continue stateLoop;
                }
                case 236: {
                    if (this.field_I.field_G == var8) {
                        statePc = 238;
                    } else {
                        statePc = 239;
                    }
                    continue stateLoop;
                }
                case 238: {
                    var8.field_y = var8.field_y + 1;
                    statePc = 239;
                    continue stateLoop;
                }
                case 239: {
                    if (var13 == 0) {
                        statePc = 244;
                    } else {
                        statePc = 240;
                    }
                    continue stateLoop;
                }
                case 240: {
                    if (0 >= var17.field_rb) {
                        statePc = 244;
                    } else {
                        statePc = 241;
                    }
                    continue stateLoop;
                }
                case 241: {
                    if (this.field_I.field_X != null) {
                        statePc = 244;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 242: {
                    if (-1 > (var17.field_z ^ -1)) {
                        statePc = 244;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 243: {
                    var17.e(128, -var17.field_S);
                    statePc = 244;
                    continue stateLoop;
                }
                case 244: {
                    if (!var17.h(-122)) {
                        statePc = 248;
                    } else {
                        statePc = 245;
                    }
                    continue stateLoop;
                }
                case 245: {
                    if (var17.field_mc < var7 * this.field_I.field_kb / this.field_I.field_O) {
                        statePc = 247;
                    } else {
                        statePc = 248;
                    }
                    continue stateLoop;
                }
                case 247: {
                    var17.field_mc = this.field_I.field_kb * var7 / this.field_I.field_O;
                    statePc = 248;
                    continue stateLoop;
                }
                case 248: {
                    if (var7 * this.field_I.field_kb / this.field_I.field_O <= 0) {
                        statePc = 253;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 249: {
                    if (var17.field_Tb <= 0) {
                        statePc = 253;
                    } else {
                        statePc = 250;
                    }
                    continue stateLoop;
                }
                case 250: {
                    if (var17.h(-122)) {
                        statePc = 252;
                    } else {
                        statePc = 253;
                    }
                    continue stateLoop;
                }
                case 252: {
                    var17.a(true, Math.min(var17.field_Tb, var7 * this.field_I.field_kb / this.field_I.field_O / 50));
                    statePc = 253;
                    continue stateLoop;
                }
                case 253: {
                    if (!var17.i(26, -27)) {
                        statePc = 257;
                    } else {
                        statePc = 254;
                    }
                    continue stateLoop;
                }
                case 254: {
                    if (var17.field_S >= 0) {
                        statePc = 257;
                    } else {
                        statePc = 255;
                    }
                    continue stateLoop;
                }
                case 255: {
                    var17.field_S = Math.min(-var17.field_S, var17.field_Q);
                    if (var13 == 0) {
                        statePc = 258;
                    } else {
                        statePc = 257;
                    }
                    continue stateLoop;
                }
                case 257: {
                    var17.field_S = 0;
                    statePc = 258;
                    continue stateLoop;
                }
                case 258: {
                    if (var17.field_Lb) {
                        statePc = 260;
                    } else {
                        statePc = 264;
                    }
                    continue stateLoop;
                }
                case 260: {
                    if (var17.i(29, -27)) {
                        statePc = 264;
                    } else {
                        statePc = 261;
                    }
                    continue stateLoop;
                }
                case 261: {
                    if (3 != di.field_g) {
                        statePc = 263;
                    } else {
                        statePc = 264;
                    }
                    continue stateLoop;
                }
                case 263: {
                    var17.field_Dc = 200;
                    statePc = 264;
                    continue stateLoop;
                }
                case 264: {
                    var2++;
                    if (var13 == 0) {
                        statePc = 105;
                    } else {
                        statePc = 265;
                    }
                    continue stateLoop;
                }
                case 265: {
                    stackOut_265_0 = this.field_N ^ -1;
                    stackOut_265_1 = -1;
                    stackIn_266_0 = stackOut_265_0;
                    stackIn_266_1 = stackOut_265_1;
                    statePc = 266;
                    continue stateLoop;
                }
                case 266: {
                    if (stackIn_266_0 >= stackIn_266_1) {
                        statePc = 268;
                    } else {
                        statePc = 267;
                    }
                    continue stateLoop;
                }
                case 267: {
                    this.field_N = this.field_N - 1;
                    statePc = 268;
                    continue stateLoop;
                }
                case 268: {
                    if (this.field_z >= this.field_Y) {
                        statePc = 270;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 269: {
                    this.field_Z.field_J.a((byte) 82, (kd) (this));
                    statePc = 270;
                    continue stateLoop;
                }
                case 270: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void h(int param0) {
        field_S = null;
        field_L = null;
        field_Q = null;
        field_J = null;
        field_C = null;
        field_E = null;
        if (param0 != -2107133436) {
            field_P = -126;
        }
        field_W = null;
        field_D = null;
        field_B = null;
        field_A = null;
    }

    final static void c(byte param0) {
        kc.field_y = null;
        int var1 = -122 / ((-17 - param0) / 41);
    }

    jb(int param0, int param1, int param2, int param3, int param4, ee param5, mb[] param6, wl param7) {
        RuntimeException var9 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              this.field_X = param6;
              this.field_T = param3;
              this.field_z = param4;
              this.field_V = param2;
              this.field_H = param0;
              this.field_Z = param5;
              this.field_Y = 0;
              this.field_I = param7;
              this.field_M = param1;
              this.field_y = this.field_H;
              if (null == this.field_I) {
                break L1;
              } else {
                this.field_R = this.field_I.field_ob;
                break L1;
              }
            }
            L2: {
              this.field_K = 0;
              this.field_G = 5;
              this.field_N = 5;
              if (this.field_z >= 1) {
                break L2;
              } else {
                this.field_z = 1;
                break L2;
              }
            }
            this.field_U = 64;
            this.field_F = this.field_U * (this.field_Y + (this.field_z - this.field_Y) / 4) / this.field_z;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var9 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var9);
            stackOut_7_1 = new StringBuilder().append("jb.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param5 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param6 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param7 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    static {
        field_P = 0;
        field_E = "<col=156080>SOLARITE CUBES: </col>";
        field_Q = "Names cannot contain consecutive spaces";
        field_W = "Type your password again to make sure it's correct";
        field_A = new ul();
        field_D = new fm(6, 0, 4, 2);
    }
}
