/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg {
    int[] field_K;
    short[] field_J;
    short[] field_M;
    short[] field_N;
    static ck field_h;
    short[] field_o;
    int field_H;
    int[] field_T;
    int[] field_S;
    int field_n;
    int[] field_R;
    int[] field_g;
    static ck field_x;
    static String field_s;
    short[] field_F;
    static oh field_E;
    short[] field_r;
    short field_L;
    int[] field_w;
    int[] field_m;
    short[] field_O;
    int field_f;
    static String[] field_I;
    short field_D;
    byte[] field_Q;
    private boolean field_d;
    int[] field_v;
    short[] field_A;
    short field_l;
    short[] field_e;
    short[] field_z;
    static int[] field_G;
    int[] field_q;
    short[] field_u;
    short[] field_j;
    short[] field_k;
    short[] field_t;
    short[] field_c;
    int field_b;
    short[] field_P;
    short[] field_C;
    static String field_p;
    int field_a;
    byte field_B;
    short[] field_y;
    int field_i;

    final void a(int param0) {
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
        var12 = client.field_A ? 1 : 0;
        if (!this.field_d) {
          L0: {
            this.field_d = true;
            var2 = 32767;
            var3 = 32767;
            var4 = 32767;
            if (param0 == -14200) {
              break L0;
            } else {
              this.a(70, 90, (byte) -86, 59, -78);
              break L0;
            }
          }
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          var8 = 0;
          L1: while (true) {
            L2: {
              L3: {
                if (var8 >= this.field_l) {
                  break L3;
                } else {
                  var9 = this.field_J[var8];
                  var10 = this.field_o[var8];
                  if (var12 != 0) {
                    break L2;
                  } else {
                    L4: {
                      if (var9 <= var5) {
                        break L4;
                      } else {
                        var5 = var9;
                        break L4;
                      }
                    }
                    L5: {
                      var11 = this.field_e[var8];
                      if (var9 < var2) {
                        var2 = var9;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      if ((var10 ^ -1) < (var6 ^ -1)) {
                        var6 = var10;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      if ((var10 ^ -1) > (var3 ^ -1)) {
                        var3 = var10;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if ((var7 ^ -1) > (var11 ^ -1)) {
                        var7 = var11;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if ((var4 ^ -1) < (var11 ^ -1)) {
                        var4 = var11;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    var8++;
                    if (var12 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              this.field_f = var5;
              this.field_H = var2;
              this.field_i = var7;
              this.field_a = var4;
              this.field_n = var6;
              this.field_b = var3;
              break L2;
            }
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2) {
        ve var6 = null;
        ve var7 = null;
        uf var4 = null;
        if (param0 != -20974) {
            return;
        }
        if (ta.field_b != param2) {
            var6 = (ve) ((Object) tg.field_b.a(24710, (long)ta.field_b));
            var7 = var6;
            if (var7 != null) {
                var7.field_xc = null;
            }
            ta.field_b = param2;
            var4 = we.field_b;
            var4.f(param1, -4);
            var4.a(true, 3);
            var4.a(true, 11);
            var4.d(-1, param2);
        }
    }

    final static void a(int param0, boolean param1, boolean param2, int param3) {
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        w stackIn_25_0 = null;
        w stackIn_26_0 = null;
        w stackIn_27_0 = null;
        String stackIn_27_1 = null;
        w stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        w stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        w stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        String stackIn_30_2 = null;
        boolean stackIn_52_0 = false;
        String stackIn_61_0 = null;
        w stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        w stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        w stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        w stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        w stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        int stackIn_73_2 = 0;
        w stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        w stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        w stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        w stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        w stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        int stackIn_78_2 = 0;
        w stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        w stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        w stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        w stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        w stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        int stackIn_83_2 = 0;
        int stackIn_84_0 = 0;
        boolean stackOut_51_0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var4 = null;
        w var5 = null;
        w var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        Object var9 = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        String var11_ref = null;
        int var12 = 0;
        w var14 = null;
        String var15 = null;
        w var16 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        qf.a(bf.field_r, 109);
                        if (g.field_N == null) {
                            statePc = 68;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        fh.field_d.field_N = 0;
                        var14 = fh.field_d;
                        var16 = var14;
                        var16.field_mb = 0;
                        nn.field_a.field_N = 0;
                        var5 = nn.field_a;
                        var5.field_mb = 0;
                        var6 = tg.field_i;
                        tg.field_i.field_N = 0;
                        var6.field_mb = 0;
                        fl.field_b.field_Y = cl.field_s.toUpperCase();
                        var7 = (2 + oh.field_d.field_mb) / 2;
                        tg.field_i.a(-2 + var7, param3 ^ 48, -40 + oh.field_d.field_N, 40, 0);
                        nn.field_a.a(oh.field_d.field_mb + -var7, param3 + -48, -40 + oh.field_d.field_N, 40, var7);
                        if ((b.field_P.length ^ -1) != -2) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if ((b.field_P[0] ^ -1) != -3) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var8 = 0;
                        if (var12 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var8 = 0;
                        var9_int = 0;
                        var10 = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((b.field_P.length ^ -1) >= (var10 ^ -1)) {
                            statePc = 20;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_21_0 = -1;
                        stackIn_8_0 = stackIn_21_0;
                        stackIn_21_1 = kk.field_l[var10 / 8] & 1 << (var10 & 7) ^ -1;
                        stackIn_8_1 = stackIn_21_1;
                        if (var12 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (stackIn_8_0 == stackIn_8_1) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_11_0 = 1;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_11_0 = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var11_int = stackIn_11_0;
                        if (var11_int != 0) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var9_int++;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var11_int == 0) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if ((b.field_P[var10] ^ -1) != -3) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var8 = 1;
                        if (var12 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var10++;
                        if (var12 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_21_0 = 0;
                        stackIn_21_1 = var9_int;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (stackIn_21_0 != stackIn_21_1) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var8 = 1;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        nn.field_a.field_Hb = true;
                        if (fj.field_h) {
                            statePc = 58;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackIn_26_0 = nn.field_a;
                        stackIn_25_0 = stackIn_26_0;
                        if (var8 != 0) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_27_0 = (w) ((Object) stackIn_25_0);
                        stackIn_27_1 = kd.field_r;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackIn_27_0 = (w) ((Object) stackIn_26_0);
                        stackIn_27_1 = wg.field_g;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_27_0.field_Y = ((String) (Object) stackIn_27_1).toUpperCase();
                        stackIn_29_0 = cl.field_n;
                        stackIn_28_0 = stackIn_29_0;
                        stackIn_29_1 = 94;
                        stackIn_28_1 = stackIn_29_1;
                        if (var8 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackIn_30_0 = (w) ((Object) stackIn_28_0);
                        stackIn_30_1 = stackIn_28_1;
                        stackIn_30_2 = af.field_c;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackIn_30_0 = (w) ((Object) stackIn_29_0);
                        stackIn_30_1 = stackIn_29_1;
                        stackIn_30_2 = wd.field_e;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_30_0.field_Y = cm.a((byte) stackIn_30_1, stackIn_30_2, new String[]{nn.field_a.field_Y});
                        ma.field_G.field_Hb = true;
                        tg.field_i.field_Y = kh.field_b;
                        ve.field_ac = true;
                        if (bc.field_D == null) {
                            statePc = 43;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        gd.field_b = false;
                        if (km.field_D == null) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        km.field_D = new byte[j.field_b];
                        rd.field_c = new boolean[j.field_b];
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        ve.field_ac = false;
                        var9_int = 0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var9_int >= j.field_b) {
                            statePc = 39;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        rd.field_c[var9_int] = false;
                        var9_int++;
                        if (var12 != 0) {
                            statePc = 40;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var12 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        uc.a(-1, true, -1, 0, -1, j.field_b, g.field_N, false);
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (2 > te.field_p) {
                            statePc = 43;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (!bj.field_d[12]) {
                            statePc = 43;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        ve.field_ac = true;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (!ve.field_ac) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        nn.field_a.field_Hb = false;
                        if (!nn.field_a.field_Kb) {
                            statePc = 68;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var9 = null;
                        if (gd.field_b) {
                            statePc = 48;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var9 = "<col=A00000>" + hb.field_Pb + "</col>";
                        var11 = var9;
                        var9 = var11;
                        var11 = var9;
                        var9 = var11;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var10 = 0;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (j.field_b <= var10) {
                            statePc = 57;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackOut_51_0 = rd.field_c[var10];
                        stackIn_84_0 = stackOut_51_0 ? 1 : 0;
                        stackIn_52_0 = stackOut_51_0;
                        if (var12 != 0) {
                            statePc = 84;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (!stackIn_52_0) {
                            statePc = 56;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var11_ref = "<col=A00000>" + pa.field_db[var10] + "</col>";
                        var9 = var11_ref;
                        var9 = var11_ref;
                        if (var9 != null) {
                            statePc = 55;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var9 = var11_ref;
                        if (var12 == 0) {
                            statePc = 56;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var9 = (String) (var9) + ", " + var11_ref;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var10++;
                        if (var12 == 0) {
                            statePc = 50;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        sl.field_g = "<col=A00000>" + lk.field_i + "<br>" + hb.field_Tb + (String) (var9);
                        if (var12 == 0) {
                            statePc = 68;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        ma.field_G.field_Hb = false;
                        cl.field_n.field_Y = im.field_c;
                        if (var8 == 0) {
                            statePc = 60;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        stackIn_61_0 = hc.field_e;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        stackIn_61_0 = wk.field_j;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var15 = stackIn_61_0;
                        var9 = var15;
                        var9 = var15;
                        var9 = var15;
                        var10 = tg.field_i.field_J.a(var15) - -(3 * tg.field_i.field_J.a('.'));
                        tg.field_i.field_X = 0;
                        tg.field_i.field_ub = (-var10 + tg.field_i.field_mb) / 2;
                        if (-17 != (48 & oe.field_G ^ -1)) {
                            statePc = 63;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var9 = var15 + ".";
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if ((oe.field_G & 48 ^ -1) != -33) {
                            statePc = 65;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var9 = (String) (var9) + "..";
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if ((48 & oe.field_G) != 48) {
                            statePc = 67;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var9 = (String) (var9) + "...";
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        tg.field_i.field_Y = (String) (var9);
                        nn.field_a.field_Y = fc.field_g.toUpperCase();
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        stackIn_72_0 = ee.field_i;
                        stackIn_69_0 = stackIn_72_0;
                        stackIn_72_1 = 0;
                        stackIn_69_1 = stackIn_72_1;
                        if (!param1) {
                            statePc = 72;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        stackIn_72_0 = (w) ((Object) stackIn_69_0);
                        stackIn_70_0 = stackIn_72_0;
                        stackIn_72_1 = stackIn_69_1;
                        stackIn_70_1 = stackIn_72_1;
                        if (param2) {
                            statePc = 72;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        stackIn_72_0 = (w) ((Object) stackIn_70_0);
                        stackIn_71_0 = stackIn_72_0;
                        stackIn_72_1 = stackIn_70_1;
                        stackIn_71_1 = stackIn_72_1;
                        if (dn.field_k) {
                            statePc = 72;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        stackIn_73_0 = (w) ((Object) stackIn_71_0);
                        stackIn_73_1 = stackIn_71_1;
                        stackIn_73_2 = 1;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        stackIn_73_0 = (w) ((Object) stackIn_72_0);
                        stackIn_73_1 = stackIn_72_1;
                        stackIn_73_2 = 0;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        ((w) (Object) stackIn_73_0).a(stackIn_73_1 != 0, stackIn_73_2 != 0);
                        stackIn_77_0 = oh.field_d;
                        stackIn_74_0 = stackIn_77_0;
                        stackIn_77_1 = 0;
                        stackIn_74_1 = stackIn_77_1;
                        if (!param1) {
                            statePc = 77;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        stackIn_77_0 = (w) ((Object) stackIn_74_0);
                        stackIn_75_0 = stackIn_77_0;
                        stackIn_77_1 = stackIn_74_1;
                        stackIn_75_1 = stackIn_77_1;
                        if (param2) {
                            statePc = 77;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        stackIn_77_0 = (w) ((Object) stackIn_75_0);
                        stackIn_76_0 = stackIn_77_0;
                        stackIn_77_1 = stackIn_75_1;
                        stackIn_76_1 = stackIn_77_1;
                        if (dn.field_k) {
                            statePc = 77;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        stackIn_78_0 = (w) ((Object) stackIn_76_0);
                        stackIn_78_1 = stackIn_76_1;
                        stackIn_78_2 = 1;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        stackIn_78_0 = (w) ((Object) stackIn_77_0);
                        stackIn_78_1 = stackIn_77_1;
                        stackIn_78_2 = 0;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        ((w) (Object) stackIn_78_0).a(stackIn_78_1 != 0, stackIn_78_2 != 0);
                        stackIn_82_0 = mn.field_e;
                        stackIn_79_0 = stackIn_82_0;
                        stackIn_82_1 = 0;
                        stackIn_79_1 = stackIn_82_1;
                        if (!param1) {
                            statePc = 82;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        stackIn_82_0 = (w) ((Object) stackIn_79_0);
                        stackIn_80_0 = stackIn_82_0;
                        stackIn_82_1 = stackIn_79_1;
                        stackIn_80_1 = stackIn_82_1;
                        if (param2) {
                            statePc = 82;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        stackIn_82_0 = (w) ((Object) stackIn_80_0);
                        stackIn_81_0 = stackIn_82_0;
                        stackIn_82_1 = stackIn_80_1;
                        stackIn_81_1 = stackIn_82_1;
                        if (!dn.field_k) {
                            statePc = 82;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        stackIn_83_0 = (w) ((Object) stackIn_81_0);
                        stackIn_83_1 = stackIn_81_1;
                        stackIn_83_2 = 1;
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        stackIn_83_0 = (w) ((Object) stackIn_82_0);
                        stackIn_83_1 = stackIn_82_1;
                        stackIn_83_2 = 0;
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        ((w) (Object) stackIn_83_0).a(stackIn_83_1 != 0, stackIn_83_2 != 0);
                        je.field_f.field_h.b(false);
                        stackIn_84_0 = param3;
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (stackIn_84_0 == 48) {
                            statePc = 86;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        vg.a(49, 2, 67);
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (g.field_N == null) {
                            statePc = 98;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        if (ma.field_G.field_ob != 0) {
                            statePc = 89;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        ul.a(param0, param3 ^ 52);
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (-1 == (nn.field_a.field_ob ^ -1)) {
                            statePc = 95;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (fj.field_h) {
                            statePc = 94;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        th.a(param0, true);
                        if (var12 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        ji.c(param0, 1);
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        mc.a(g.field_N, true, param0, (byte) -127);
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 97: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    throw dh.a((Throwable) ((Object) var4), "vg.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
                }
                case 98: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(boolean param0) {
        this.field_d = param0 ? true : false;
    }

    final static ji a(int param0, int param1) {
        if (param1 <= 20) {
            field_G = (int[]) null;
        }
        return kc.a(true, 1, param0, false, false, false);
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = client.field_A ? 1 : 0;
                    var5 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if ((this.field_l ^ -1) >= (var5 ^ -1)) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.field_J[var5] = (short)(this.field_J[var5] + param1);
                    this.field_o[var5] = (short)(this.field_o[var5] + param2);
                    this.field_e[var5] = (short)(this.field_e[var5] + param3);
                    var5++;
                    if (var6 != 0) {
                        statePc = 8;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var6 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (param0 <= -62) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    this.field_B = (byte) 59;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    this.a(false);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = client.field_A ? 1 : 0;
                    var7 = 19 % ((68 - param2) / 34);
                    var6 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if ((this.field_l ^ -1) >= (var6 ^ -1)) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.field_J[var6] = (short)(this.field_J[var6] * param1 / param4);
                    this.field_o[var6] = (short)(param0 * this.field_o[var6] / param4);
                    this.field_e[var6] = (short)(this.field_e[var6] * param3 / param4);
                    var6++;
                    if (var8 != 0) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var8 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    this.a(false);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(byte param0) {
        field_I = null;
        int var1 = 0 / ((10 - param0) / 39);
        field_s = null;
        field_p = null;
        field_h = null;
        field_x = null;
        field_G = null;
        field_E = null;
    }

    vg() {
        this.field_d = false;
        this.field_B = (byte) 0;
    }

    static {
        field_s = "Chat is currently disabled.";
        field_I = new String[16];
        field_G = new int[8192];
        field_p = "Only show lobby chat from my friends";
    }
}
