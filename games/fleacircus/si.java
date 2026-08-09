/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si {
    short[] field_M;
    short[] field_s;
    static String field_o;
    static dd field_C;
    short field_w;
    short[] field_t;
    int field_m;
    short[] field_F;
    int field_b;
    short[] field_P;
    short[] field_Q;
    int[] field_d;
    int[] field_G;
    short[] field_n;
    short[] field_q;
    int[] field_v;
    short[] field_D;
    int[] field_O;
    static vg field_y;
    short[] field_i;
    private boolean field_a;
    int[] field_z;
    int field_k;
    short field_p;
    short[] field_K;
    byte field_h;
    int[] field_g;
    short[] field_f;
    static int[] field_R;
    int[] field_c;
    short[] field_l;
    int[] field_L;
    int field_A;
    int[] field_I;
    int field_B;
    short[] field_N;
    short[] field_E;
    short[] field_u;
    short[] field_x;
    int field_e;
    short field_j;
    byte[] field_J;
    static String field_H;
    short[] field_r;

    public static void c(int param0) {
        int var1 = 55 % ((param0 - 9) / 40);
        field_H = null;
        field_C = null;
        field_R = null;
        field_o = null;
        field_y = null;
    }

    final void b(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        var12 = fleas.field_A ? 1 : 0;
        if (this.field_a) {
          return;
        } else {
          this.field_a = true;
          var2 = 32767;
          var3 = 32767;
          var4 = 32767;
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          var8 = 0;
          L0: while (true) {
            L1: {
              if (var8 >= this.field_w) {
                break L1;
              } else {
                var9 = this.field_n[var8];
                var10 = this.field_f[var8];
                var14 = var9;
                var13 = var5;
                if (var12 != 0) {
                  if (var13 != var14) {
                    this.field_K = (short[]) null;
                    this.field_A = var4;
                    this.field_e = var3;
                    this.field_k = var6;
                    this.field_B = var5;
                    this.field_b = var7;
                    this.field_m = var2;
                    return;
                  } else {
                    this.field_A = var4;
                    this.field_e = var3;
                    this.field_k = var6;
                    this.field_B = var5;
                    this.field_b = var7;
                    this.field_m = var2;
                    return;
                  }
                } else {
                  L2: {
                    if (var13 >= var14) {
                      break L2;
                    } else {
                      var5 = var9;
                      break L2;
                    }
                  }
                  L3: {
                    if (var10 >= var3) {
                      break L3;
                    } else {
                      var3 = var10;
                      break L3;
                    }
                  }
                  L4: {
                    if (var6 >= var10) {
                      break L4;
                    } else {
                      var6 = var10;
                      break L4;
                    }
                  }
                  L5: {
                    if (var2 <= var9) {
                      break L5;
                    } else {
                      var2 = var9;
                      break L5;
                    }
                  }
                  L6: {
                    var11 = this.field_P[var8];
                    if (var11 > var7) {
                      var7 = var11;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (var11 >= var4) {
                      break L7;
                    } else {
                      var4 = var11;
                      break L7;
                    }
                  }
                  var8++;
                  if (var12 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            if (param0 != -23443) {
              this.field_K = (short[]) null;
              this.field_A = var4;
              this.field_e = var3;
              this.field_k = var6;
              this.field_B = var5;
              this.field_b = var7;
              this.field_m = var2;
              return;
            } else {
              this.field_A = var4;
              this.field_e = var3;
              this.field_k = var6;
              this.field_B = var5;
              this.field_b = var7;
              this.field_m = var2;
              return;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var7 = fleas.field_A ? 1 : 0;
        int var6 = param4;
        do {
            if (var6 >= this.field_w) {
                this.a(78);
                return;
            }
            this.field_n[var6] = (short)(this.field_n[var6] * param0 / param1);
            this.field_f[var6] = (short)(param3 * this.field_f[var6] / param1);
            this.field_P[var6] = (short)(this.field_P[var6] * param2 / param1);
            var6++;
            if (var7 != 0) {
                return;
            }
        } while (var7 == 0);
        this.a(78);
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var7 = fleas.field_A ? 1 : 0;
        int var5 = 0;
        int var6 = 15 % ((param3 - -11) / 63);
        do {
            if (var5 >= this.field_w) {
                this.a(87);
                return;
            }
            this.field_n[var5] = (short)(this.field_n[var5] + param1);
            this.field_f[var5] = (short)(this.field_f[var5] + param0);
            this.field_P[var5] = (short)(this.field_P[var5] + param2);
            var5++;
            if (var7 != 0) {
                return;
            }
        } while (var7 == 0);
        this.a(87);
    }

    private final void a(int param0) {
        if (param0 <= 27) {
            this.field_q = (short[]) null;
            this.field_a = false;
            return;
        }
        this.field_a = false;
    }

    final static int a(int param0, boolean param1) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_87_0 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ib.field_g = ib.field_g + 65536;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (a.a(hd.field_b, ib.field_g, (byte) -17) < 65536) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ib.field_g = ib.field_g - hd.field_b;
                        stackIn_7_0 = bf.field_b + 1;
                        stackIn_4_0 = stackIn_7_0;
                        if (var5 != 0) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        bf.field_b = stackIn_4_0;
                        if (var5 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_7_0 = -1;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var2_int = stackIn_7_0;
                        if (wa.field_k == null) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var2_int = wa.field_k.length;
                        if (var5 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (of.field_h == null) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var2_int = of.field_h.length;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (0 != (var2_int ^ -1)) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (td.field_i >= hd.field_g) {
                            statePc = 23;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        td.field_i = td.field_i + 1;
                        if (td.field_i <= hd.field_c) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (null == wa.field_k) {
                            statePc = 22;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (null == wa.field_k[ql.field_o]) {
                            statePc = 22;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (td.field_i < hd.field_g) {
                            statePc = 23;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (null == wa.field_k[(1 + ql.field_o) % var2_int]) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        td.field_i = td.field_i - 1;
                        if (var5 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        td.field_i = td.field_i - 1;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (td.field_i >= hd.field_g) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        t.field_a = ql.field_o;
                        if (rc.field_i) {
                            statePc = 29;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        ql.field_o = ql.field_o - 1;
                        if ((ql.field_o ^ -1) <= -1) {
                            statePc = 32;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        ql.field_o = ql.field_o + var2_int;
                        if (var5 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        ql.field_o = ql.field_o + 1;
                        if (var2_int <= ql.field_o) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        ql.field_o = ql.field_o - var2_int;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        td.field_i = td.field_i - hd.field_g;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (td.field_i > hd.field_c) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        rc.field_i = true;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (null != jg.field_f) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var3 = -(jg.field_f.field_r / 2) + 357;
                        var4 = 0;
                        if (-1 == (jk.field_r ^ -1)) {
                            statePc = 50;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (var3 >= ob.field_e) {
                            statePc = 50;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var3 + jg.field_f.field_t > ob.field_e) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (269 + -jg.field_f.field_w >= pb.field_d) {
                            statePc = 46;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (-270 < (pb.field_d ^ -1)) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        td.field_i = hd.field_g;
                        var4 = 1;
                        rc.field_i = false;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if ((pb.field_d ^ -1) >= -587) {
                            statePc = 50;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (pb.field_d < jg.field_f.field_w + 586) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        rc.field_i = true;
                        var4 = 1;
                        td.field_i = hd.field_g;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var4 != 0) {
                            statePc = 61;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (hd.field_c >= td.field_i) {
                            statePc = 61;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (var3 >= kc.field_b) {
                            statePc = 61;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (kc.field_b < jg.field_f.field_t + var3) {
                            statePc = 55;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (ag.field_f <= 269 + -jg.field_f.field_w) {
                            statePc = 58;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if ((ag.field_f ^ -1) <= -270) {
                            statePc = 58;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        td.field_i = hd.field_c;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if ((ag.field_f ^ -1) >= -587) {
                            statePc = 61;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (ag.field_f >= jg.field_f.field_w + 586) {
                            statePc = 61;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        td.field_i = hd.field_c;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (param0 > 3) {
                            statePc = 64;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        stackIn_63_0 = 107;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 63: {
                    return stackIn_63_0;
                }
                case 64: {
                    try {
                        if (!param1) {
                            statePc = 86;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        ul.field_G.b(109, em.a(ob.field_e, false, pb.field_d), em.a(kc.field_b, false, ag.field_f));
                        if (!ul.field_G.b(-78)) {
                            statePc = 72;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (ul.field_G.field_k != 0) {
                            statePc = 69;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        stackIn_68_0 = 3;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 68: {
                    return stackIn_68_0;
                }
                case 69: {
                    try {
                        if (1 != ul.field_G.field_k) {
                            statePc = 72;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        stackIn_71_0 = 2;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 71: {
                    return stackIn_71_0;
                }
                case 72: {
                    stackIn_74_0 = -97;
                    statePc = 74;
                    continue stateLoop;
                }
                case 73: {
                    try {
                        stackIn_74_0 = -97;
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (!wf.b(stackIn_74_0)) {
                            statePc = 86;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        ul.field_G.a(0, true);
                        if (!ul.field_G.b(107)) {
                            statePc = 82;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (ul.field_G.field_k != 0) {
                            statePc = 79;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        stackIn_78_0 = 3;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 78: {
                    return stackIn_78_0;
                }
                case 79: {
                    try {
                        if ((ul.field_G.field_k ^ -1) != -2) {
                            statePc = 82;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        stackIn_81_0 = 1;
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 81: {
                    return stackIn_81_0;
                }
                case 82: {
                    try {
                        if (ji.field_a != 13) {
                            statePc = 73;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        stackIn_84_0 = 1;
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 84: {
                    stackIn_87_0 = stackIn_84_0;
                    stackIn_85_0 = stackIn_87_0;
                    if (var5 != 0) {
                        statePc = 87;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    return stackIn_85_0;
                }
                case 86: {
                    try {
                        stackIn_87_0 = 0;
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 87: {
                    return stackIn_87_0;
                }
                case 88: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw pf.a((Throwable) ((Object) var2), "si.E(" + param0 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4 = -14 / ((param1 - 2) / 51);
                        var3_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (0 >= param0) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var3_int = 1 & param2 | var3_int << 590365569;
                        param0--;
                        stackIn_6_0 = param2 >>> 1;
                        stackIn_4_0 = stackIn_6_0;
                        if (var5 != 0) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        param2 = stackIn_4_0;
                        if (var5 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_6_0 = var3_int;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0;
                }
                case 7: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw pf.a((Throwable) ((Object) var3), "si.D(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    si() {
        this.field_a = false;
        this.field_h = (byte) 0;
    }

    static {
        field_R = new int[4];
        field_H = "<%0>Spring:<%1> Fleas standing on these are bounced up until they hit something.";
        field_o = "<%0>Blocks:<%1> fleas can walk on these, but can't climb up the sides.";
    }
}
