/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bl extends kf {
    static int field_T;
    boolean field_S;
    private ka field_ab;
    static String field_W;
    static fd field_U;
    static w field_Y;
    private int field_V;
    static char[] field_Z;
    static String field_X;

    private final int a(int param0) {
        if (param0 != -10604) {
            return -74;
        }
        return !this.field_S ? 0 : this.field_ab.g((byte) -83) == this ? 256 : 0;
    }

    final void a(int param0, int param1, int param2) {
        if (param0 <= 92) {
            this.h((byte) -10);
        }
        this.b(param2, param1, cf.field_f + -param1 >> -715540319, -param2 + vd.field_n >> -532348575, -16555);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (-1 == (this.field_V ^ -1)) {
          return;
        } else {
          if (256 <= this.field_V) {
            if ((param2 ^ -1) != -1) {
              return;
            } else {
              this.b(-128, param3 - -this.field_D, param0 - -this.field_u);
              super.a(param0, -122, param2, param3);
              return;
            }
          } else {
            L0: {
              L1: {
                if (null == si.field_n) {
                  break L1;
                } else {
                  if (this.field_t > si.field_n.field_I) {
                    break L1;
                  } else {
                    if (this.field_y > si.field_n.field_H) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
              }
              si.field_n = new ck(this.field_t, this.field_y);
              break L0;
            }
            L2: {
              tb.a(true, si.field_n);
              hk.b();
              this.b(-128, 0, 0);
              super.a(-this.field_u + -param0, -116, param2, -param3 + -this.field_D);
              mk.a((byte) -5);
              si.field_n.c(this.field_u + param0, this.field_D + param3, this.field_V);
              if (param1 < -103) {
                break L2;
              } else {
                this.field_V = -41;
                break L2;
              }
            }
            return;
          }
        }
    }

    bl(ka param0, int param1, int param2) {
        super(-param1 + cf.field_f >> -954919615, vd.field_n - param2 >> -1866710303, param1, param2, (gl) null);
        try {
            this.field_S = false;
            this.field_V = 0;
            this.field_ab = param0;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "bl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final ce e(byte param0) {
        ce var2 = super.e(param0);
        if (!(var2 == null)) {
            return var2;
        }
        return (ce) (this);
    }

    final static void a(int param0, int param1, boolean param2) {
        boolean stackIn_7_0 = false;
        int stackIn_12_0 = 0;
        boolean stackIn_17_0 = false;
        int stackIn_22_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        String[] stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        String[] stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        String[] stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        String[] stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        String stackIn_42_2 = null;
        String[] stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_44_2 = 0;
        String[] stackIn_47_0 = null;
        String[] stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        String[] stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        String[] stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        String stackIn_50_2 = null;
        int stackIn_129_0 = 0;
        int stackIn_130_0 = 0;
        String stackIn_130_1 = null;
        int stackIn_131_0 = 0;
        String stackIn_131_1 = null;
        int stackIn_132_0 = 0;
        String stackIn_132_1 = null;
        int stackIn_132_2 = 0;
        int stackIn_137_0 = 0;
        int stackIn_141_0 = 0;
        int stackIn_141_1 = 0;
        int stackIn_147_0 = 0;
        int stackIn_147_1 = 0;
        int stackIn_149_0 = 0;
        int stackIn_149_1 = 0;
        int stackIn_153_0 = 0;
        int stackIn_153_1 = 0;
        String[] stackIn_155_0 = null;
        int stackIn_157_0 = 0;
        int stackIn_157_1 = 0;
        int stackIn_157_2 = 0;
        int stackIn_158_0 = 0;
        int stackIn_159_0 = 0;
        int stackIn_160_0 = 0;
        int stackIn_160_1 = 0;
        int stackIn_162_0 = 0;
        int stackIn_162_1 = 0;
        int stackIn_162_2 = 0;
        int stackIn_165_0 = 0;
        int stackIn_165_1 = 0;
        int stackIn_170_0 = 0;
        int stackIn_170_1 = 0;
        Throwable caughtException = null;
        boolean stackOut_6_0;
        boolean stackOut_16_0;
        int statePc = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String var11 = null;
        String var12 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    fj.field_e = true;
                    bc.field_B = param1;
                    if (-1 == (bc.field_B ^ -1)) {
                        statePc = 111;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (-2 == (bc.field_B ^ -1)) {
                        statePc = 98;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (-3 != (bc.field_B ^ -1)) {
                        statePc = 52;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var3_int = te.a(cm.a((byte) 91, de.field_ab, new String[]{"<br><%0><br>"}), 86, om.field_a, vg.field_I, rk.field_R);
                    var4 = -1;
                    var5 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (var5 >= var3_int) {
                        statePc = 11;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    stackOut_6_0 = "<%0>".equals(vg.field_I[var5]);
                    stackIn_12_0 = stackOut_6_0 ? 1 : 0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var9 != 0) {
                        statePc = 12;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (!stackIn_7_0) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var4 = var5;
                    if (var9 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var5++;
                    if (var9 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    stackIn_12_0 = var4 ^ -1;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (stackIn_12_0 != 0) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    throw new IllegalStateException();
                }
                case 14: {
                    tg.field_g = new String[var4];
                    an.a(vg.field_I, 0, tg.field_g, 0, var4);
                    dh.field_b = new String[-1 + (var3_int + -var4)];
                    an.a(vg.field_I, 1 + var4, dh.field_b, 0, -var4 + var3_int + -1);
                    var4 = -1;
                    var3_int = te.a(cm.a((byte) 86, ga.field_d, new String[]{"<br><%0><br>"}), 112, om.field_a, vg.field_I, rk.field_R);
                    var5 = 0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if ((var5 ^ -1) <= (var3_int ^ -1)) {
                        statePc = 21;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackOut_16_0 = "<%0>".equals(vg.field_I[var5]);
                    stackIn_22_0 = stackOut_16_0 ? 1 : 0;
                    stackIn_17_0 = stackOut_16_0;
                    if (var9 != 0) {
                        statePc = 22;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (!stackIn_17_0) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var4 = var5;
                    if (var9 == 0) {
                        statePc = 21;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var5++;
                    if (var9 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    stackIn_22_0 = -1;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (stackIn_22_0 != var4) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    throw new IllegalStateException();
                }
                case 24: {
                    vb.field_U = new String[var4];
                    an.a(vg.field_I, 0, vb.field_U, 0, var4);
                    wb.field_Qb = new String[var3_int - (var4 + 1)];
                    an.a(vg.field_I, var4 - -1, wb.field_Qb, 0, -1 + (-var4 + var3_int));
                    if (tg.field_g.length >= vb.field_U.length) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    stackIn_27_0 = vb.field_U.length;
                    statePc = 27;
                    continue stateLoop;
                }
                case 26: {
                    stackIn_27_0 = tg.field_g.length;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    var5 = stackIn_27_0;
                    if ((dh.field_b.length ^ -1) > (wb.field_Qb.length ^ -1)) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    stackIn_30_0 = dh.field_b.length;
                    statePc = 30;
                    continue stateLoop;
                }
                case 29: {
                    stackIn_30_0 = wb.field_Qb.length;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    var6 = stackIn_30_0;
                    var7 = var5 + (7 - -var6);
                    rk.field_P = new String[var7];
                    k.field_g = new int[var7];
                    var8 = 0;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if ((var7 ^ -1) >= (var8 ^ -1)) {
                        statePc = 35;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    k.field_g[var8] = -1;
                    var8++;
                    if (var9 != 0) {
                        statePc = 36;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (var9 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    qf.field_i = new int[2];
                    rk.field_P[1] = i.field_g;
                    k.field_g[1] = 0;
                    rk.field_P[0] = tf.field_Z;
                    qf.field_i[0] = 5;
                    rk.field_P[2] = wi.field_a;
                    k.field_g[3] = 1;
                    rk.field_P[3] = sc.field_p;
                    rk.field_P[4] = uj.field_c;
                    qf.field_i[1] = 2;
                    rk.field_P[5] = "";
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    var8 = 0;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if ((var8 ^ -1) <= (var5 ^ -1)) {
                        statePc = 43;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    stackIn_44_0 = rk.field_P;
                    stackIn_39_0 = stackIn_44_0;
                    stackIn_44_1 = var8 + 6;
                    stackIn_39_1 = stackIn_44_1;
                    stackIn_44_2 = -var5 + (var8 - -vb.field_U.length);
                    stackIn_39_2 = stackIn_44_2;
                    if (var9 != 0) {
                        statePc = 44;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    stackIn_41_0 = (String[]) ((Object) stackIn_39_0);
                    stackIn_40_0 = stackIn_41_0;
                    stackIn_41_1 = stackIn_39_1;
                    stackIn_40_1 = stackIn_41_1;
                    if (stackIn_39_2 >= 0) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    stackIn_42_0 = (String[]) ((Object) stackIn_40_0);
                    stackIn_42_1 = stackIn_40_1;
                    stackIn_42_2 = "";
                    statePc = 42;
                    continue stateLoop;
                }
                case 41: {
                    stackIn_42_0 = (String[]) ((Object) stackIn_41_0);
                    stackIn_42_1 = stackIn_41_1;
                    stackIn_42_2 = vb.field_U[-var5 + (vb.field_U.length + var8)];
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    stackIn_42_0[stackIn_42_1] = stackIn_42_2;
                    var8++;
                    if (var9 == 0) {
                        statePc = 37;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    stackIn_44_0 = rk.field_P;
                    stackIn_44_1 = var5;
                    stackIn_44_2 = 6;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    stackIn_44_0[stackIn_44_1 + stackIn_44_2] = null;
                    k.field_g[var5 + 6] = -2;
                    var8 = 0;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if (var8 >= var6) {
                        statePc = 51;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    stackIn_155_0 = rk.field_P;
                    stackIn_47_0 = stackIn_155_0;
                    if (var9 != 0) {
                        statePc = 155;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    stackIn_49_0 = (String[]) ((Object) stackIn_47_0);
                    stackIn_48_0 = stackIn_49_0;
                    stackIn_49_1 = 7 - (-var5 - var8);
                    stackIn_48_1 = stackIn_49_1;
                    if (wb.field_Qb.length <= var8) {
                        statePc = 49;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    stackIn_50_0 = (String[]) ((Object) stackIn_48_0);
                    stackIn_50_1 = stackIn_48_1;
                    stackIn_50_2 = wb.field_Qb[var8];
                    statePc = 50;
                    continue stateLoop;
                }
                case 49: {
                    stackIn_50_0 = (String[]) ((Object) stackIn_49_0);
                    stackIn_50_1 = stackIn_49_1;
                    stackIn_50_2 = "";
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    stackIn_50_0[stackIn_50_1] = stackIn_50_2;
                    var8++;
                    if (var9 == 0) {
                        statePc = 45;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    di.field_F = ik.a(4);
                    if (var9 == 0) {
                        statePc = 124;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if (-4 == (bc.field_B ^ -1)) {
                        statePc = 82;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if ((bc.field_B ^ -1) == -5) {
                        statePc = 69;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (bc.field_B == 5) {
                        statePc = 56;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    throw new IllegalArgumentException();
                }
                case 56: {
                    var3_int = te.a(gd.field_i, 76, om.field_a, vg.field_I, rk.field_R);
                    var4 = 3 + var3_int;
                    rk.field_P = new String[var4];
                    k.field_g = new int[var4];
                    var5 = 0;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    if ((var5 ^ -1) <= (var4 ^ -1)) {
                        statePc = 61;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    k.field_g[var5] = -1;
                    var5++;
                    if (var9 != 0) {
                        statePc = 62;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    if (var9 == 0) {
                        statePc = 57;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    qf.field_i = new int[2];
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    var5 = 0;
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    if ((var3_int ^ -1) >= (var5 ^ -1)) {
                        statePc = 67;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    rk.field_P[var5] = vg.field_I[var5];
                    var5++;
                    if (var9 != 0) {
                        statePc = 68;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    if (var9 == 0) {
                        statePc = 63;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    rk.field_P[-3 + var4] = "";
                    rk.field_P[var4 + -2] = fj.field_c;
                    k.field_g[-2 + var4] = 0;
                    qf.field_i[0] = 3;
                    rk.field_P[var4 + -1] = og.field_gb;
                    k.field_g[-1 + var4] = 1;
                    qf.field_i[1] = 5;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    if (var9 == 0) {
                        statePc = 124;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    var3_int = te.a(dc.field_g, 117, om.field_a, vg.field_I, rk.field_R);
                    var4 = 2 + var3_int;
                    k.field_g = new int[var4];
                    rk.field_P = new String[var4];
                    var5 = 0;
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    if ((var4 ^ -1) >= (var5 ^ -1)) {
                        statePc = 74;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    k.field_g[var5] = -1;
                    var5++;
                    if (var9 != 0) {
                        statePc = 75;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if (var9 == 0) {
                        statePc = 70;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    qf.field_i = new int[1];
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    var5 = 0;
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    if (var3_int <= var5) {
                        statePc = 80;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    rk.field_P[var5] = vg.field_I[var5];
                    var5++;
                    if (var9 != 0) {
                        statePc = 81;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    if (var9 == 0) {
                        statePc = 76;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    rk.field_P[-2 + var4] = "";
                    rk.field_P[var4 + -1] = og.field_gb;
                    k.field_g[-1 + var4] = 0;
                    qf.field_i[0] = 5;
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    if (var9 == 0) {
                        statePc = 124;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    if (!lf.field_e.field_a) {
                        statePc = 84;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    var3_int = te.a(rb.field_a, 99, om.field_a, vg.field_I, rk.field_R);
                    if (var9 == 0) {
                        statePc = 85;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    var3_int = te.a(si.field_c, 81, om.field_a, vg.field_I, rk.field_R);
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    var4 = 2 - -var3_int;
                    rk.field_P = new String[var4];
                    k.field_g = new int[var4];
                    var5 = 0;
                    statePc = 86;
                    continue stateLoop;
                }
                case 86: {
                    if ((var5 ^ -1) <= (var4 ^ -1)) {
                        statePc = 90;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    k.field_g[var5] = -1;
                    var5++;
                    if (var9 != 0) {
                        statePc = 91;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    if (var9 == 0) {
                        statePc = 86;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    qf.field_i = new int[1];
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    var5 = 0;
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    if ((var5 ^ -1) <= (var3_int ^ -1)) {
                        statePc = 96;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    rk.field_P[var5] = vg.field_I[var5];
                    var5++;
                    if (var9 != 0) {
                        statePc = 97;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    if (var9 == 0) {
                        statePc = 92;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    rk.field_P[var4 - 2] = "";
                    rk.field_P[var4 + -1] = og.field_gb;
                    k.field_g[-1 + var4] = 0;
                    qf.field_i[0] = 5;
                    statePc = 97;
                    continue stateLoop;
                }
                case 97: {
                    if (var9 == 0) {
                        statePc = 124;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    var3_int = te.a(df.field_X, 96, om.field_a, vg.field_I, rk.field_R);
                    var4 = var3_int + 2;
                    k.field_g = new int[var4];
                    rk.field_P = new String[var4];
                    var5 = 0;
                    statePc = 99;
                    continue stateLoop;
                }
                case 99: {
                    if ((var4 ^ -1) >= (var5 ^ -1)) {
                        statePc = 103;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    k.field_g[var5] = -1;
                    var5++;
                    if (var9 != 0) {
                        statePc = 104;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    if (var9 == 0) {
                        statePc = 99;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    qf.field_i = new int[1];
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    var5 = 0;
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    if ((var5 ^ -1) <= (var3_int ^ -1)) {
                        statePc = 109;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    rk.field_P[var5] = vg.field_I[var5];
                    var5++;
                    if (var9 != 0) {
                        statePc = 110;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    if (var9 == 0) {
                        statePc = 105;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    rk.field_P[-2 + var4] = "";
                    rk.field_P[-1 + var4] = og.field_gb;
                    k.field_g[-1 + var4] = 0;
                    qf.field_i[0] = 5;
                    statePc = 110;
                    continue stateLoop;
                }
                case 110: {
                    if (var9 == 0) {
                        statePc = 124;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    var3_int = te.a(df.field_X, 124, om.field_a, vg.field_I, rk.field_R);
                    var4 = 3 + var3_int;
                    rk.field_P = new String[var4];
                    k.field_g = new int[var4];
                    var5 = 0;
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    if (var5 >= var4) {
                        statePc = 116;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    k.field_g[var5] = -1;
                    var5++;
                    if (var9 != 0) {
                        statePc = 117;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    if (var9 == 0) {
                        statePc = 112;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    qf.field_i = new int[2];
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    var5 = 0;
                    statePc = 118;
                    continue stateLoop;
                }
                case 118: {
                    if ((var3_int ^ -1) >= (var5 ^ -1)) {
                        statePc = 122;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    rk.field_P[var5] = vg.field_I[var5];
                    var5++;
                    if (var9 != 0) {
                        statePc = 123;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    if (var9 == 0) {
                        statePc = 118;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    rk.field_P[var4 - 3] = "";
                    rk.field_P[-2 + var4] = me.field_C;
                    k.field_g[var4 + -2] = 0;
                    qf.field_i[0] = 4;
                    rk.field_P[-1 + var4] = og.field_gb;
                    k.field_g[-1 + var4] = 1;
                    statePc = 123;
                    continue stateLoop;
                }
                case 123: {
                    qf.field_i[1] = 5;
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    if (param0 <= -8) {
                        statePc = 126;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    field_U = (fd) null;
                    statePc = 126;
                    continue stateLoop;
                }
                case 126: {
                    k.field_f.field_l = qf.field_i.length;
                    var3_int = 0;
                    var4 = 0;
                    statePc = 127;
                    continue stateLoop;
                }
                case 127: {
                    if ((var4 ^ -1) <= (rk.field_P.length ^ -1)) {
                        statePc = 136;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    stackIn_137_0 = 0;
                    stackIn_129_0 = stackIn_137_0;
                    if (var9 != 0) {
                        statePc = 137;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    stackIn_131_0 = stackIn_129_0;
                    stackIn_130_0 = stackIn_131_0;
                    stackIn_131_1 = rk.field_P[var4];
                    stackIn_130_1 = stackIn_131_1;
                    if (k.field_g[var4] < 0) {
                        statePc = 131;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    stackIn_132_0 = stackIn_130_0;
                    stackIn_132_1 = (String) ((Object) stackIn_130_1);
                    stackIn_132_2 = 1;
                    statePc = 132;
                    continue stateLoop;
                }
                case 131: {
                    stackIn_132_0 = stackIn_131_0;
                    stackIn_132_1 = (String) ((Object) stackIn_131_1);
                    stackIn_132_2 = 0;
                    statePc = 132;
                    continue stateLoop;
                }
                case 132: {
                    var5 = si.a(stackIn_132_0 != 0, stackIn_132_1, stackIn_132_2 != 0);
                    if (var5 > var3_int) {
                        statePc = 134;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 134: {
                    var3_int = var5;
                    statePc = 135;
                    continue stateLoop;
                }
                case 135: {
                    var4++;
                    if (var9 == 0) {
                        statePc = 127;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    stackIn_137_0 = -3;
                    statePc = 137;
                    continue stateLoop;
                }
                case 137: {
                    if (stackIn_137_0 != (bc.field_B ^ -1)) {
                        statePc = 152;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    var10 = tg.field_g;
                    var4_ref_String__ = var10;
                    var5 = 0;
                    statePc = 139;
                    continue stateLoop;
                }
                case 139: {
                    if (var10.length <= var5) {
                        statePc = 145;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    var11 = var10[var5];
                    var7 = si.a(false, var11, false);
                    stackIn_147_0 = var7;
                    stackIn_141_0 = stackIn_147_0;
                    stackIn_147_1 = var3_int;
                    stackIn_141_1 = stackIn_147_1;
                    if (var9 != 0) {
                        statePc = 147;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    if (stackIn_141_0 > stackIn_141_1) {
                        statePc = 143;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 143: {
                    var3_int = var7;
                    statePc = 144;
                    continue stateLoop;
                }
                case 144: {
                    var5++;
                    if (var9 == 0) {
                        statePc = 139;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    var4_ref_String__ = dh.field_b;
                    var5 = 0;
                    statePc = 146;
                    continue stateLoop;
                }
                case 146: {
                    stackIn_147_0 = var5;
                    stackIn_147_1 = var4_ref_String__.length;
                    statePc = 147;
                    continue stateLoop;
                }
                case 147: {
                    if (stackIn_147_0 >= stackIn_147_1) {
                        statePc = 152;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    var12 = var4_ref_String__[var5];
                    var7 = si.a(false, var12, false);
                    stackIn_153_0 = var3_int;
                    stackIn_149_0 = stackIn_153_0;
                    stackIn_153_1 = var7;
                    stackIn_149_1 = stackIn_153_1;
                    if (var9 != 0) {
                        statePc = 153;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    if (stackIn_149_0 >= stackIn_149_1) {
                        statePc = 151;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    var3_int = var7;
                    statePc = 151;
                    continue stateLoop;
                }
                case 151: {
                    var5++;
                    if (var9 == 0) {
                        statePc = 146;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    ig.field_dc = (qk.field_m + pa.field_Y << -1078448671) * k.field_f.field_l;
                    ri.field_i = -(var3_int >> -2049814175) + (var3_int + qk.field_d);
                    stackIn_153_0 = qk.field_d;
                    stackIn_153_1 = -(var3_int >> 504032897);
                    statePc = 153;
                    continue stateLoop;
                }
                case 153: {
                    ge.field_e = stackIn_153_0 + stackIn_153_1;
                    var4 = 0;
                    statePc = 154;
                    continue stateLoop;
                }
                case 154: {
                    stackIn_155_0 = rk.field_P;
                    statePc = 155;
                    continue stateLoop;
                }
                case 155: {
                    if ((stackIn_155_0.length ^ -1) >= (var4 ^ -1)) {
                        statePc = 161;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 156: {
                    stackIn_162_0 = ig.field_dc;
                    stackIn_157_0 = stackIn_162_0;
                    stackIn_162_1 = -1;
                    stackIn_157_1 = stackIn_162_1;
                    stackIn_162_2 = k.field_g[var4] ^ -1;
                    stackIn_157_2 = stackIn_162_2;
                    if (var9 != 0) {
                        statePc = 162;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    stackIn_159_0 = stackIn_157_0;
                    stackIn_158_0 = stackIn_159_0;
                    if (stackIn_157_1 < stackIn_157_2) {
                        statePc = 159;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    stackIn_160_0 = stackIn_158_0;
                    stackIn_160_1 = cc.field_a;
                    statePc = 160;
                    continue stateLoop;
                }
                case 159: {
                    stackIn_160_0 = stackIn_159_0;
                    stackIn_160_1 = ke.field_d;
                    statePc = 160;
                    continue stateLoop;
                }
                case 160: {
                    ig.field_dc = stackIn_160_0 + stackIn_160_1;
                    var4++;
                    if (var9 == 0) {
                        statePc = 154;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    stackIn_162_0 = ul.field_d;
                    stackIn_162_1 = ig.field_dc;
                    stackIn_162_2 = 890590369;
                    statePc = 162;
                    continue stateLoop;
                }
                case 162: {
                    fc.field_a = stackIn_162_0 + -(stackIn_162_1 >> stackIn_162_2);
                    tj.field_jc = new int[rk.field_P.length][];
                    var4 = 0;
                    var5 = fc.field_a;
                    statePc = 163;
                    continue stateLoop;
                }
                case 163: {
                    if (rk.field_P.length <= var4) {
                        statePc = 169;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 164: {
                    var6 = k.field_g[var4];
                    stackIn_170_0 = -1;
                    stackIn_165_0 = stackIn_170_0;
                    stackIn_170_1 = var6 ^ -1;
                    stackIn_165_1 = stackIn_170_1;
                    if (var9 != 0) {
                        statePc = 170;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    if (stackIn_165_0 >= stackIn_165_1) {
                        statePc = 167;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    var5 = var5 + ke.field_d;
                    if (var9 == 0) {
                        statePc = 168;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    var7 = si.a(false, rk.field_P[var4], true);
                    var5 = var5 + qk.field_m;
                    var8 = qk.field_d - (var7 >> -1233259135);
                    tj.field_jc[var4] = new int[4];
                    tj.field_jc[var4][0] = var8 - mb.field_c;
                    tj.field_jc[var4][1] = var5;
                    tj.field_jc[var4][2] = var7 - -(mb.field_c << 1785328417);
                    var5 = var5 + ((pa.field_Y << -668883583) + qk.field_m + cc.field_a);
                    tj.field_jc[var4][3] = cc.field_a + (pa.field_Y << 1538379393);
                    statePc = 168;
                    continue stateLoop;
                }
                case 168: {
                    var4++;
                    if (var9 == 0) {
                        statePc = 163;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    stackIn_170_0 = -3;
                    stackIn_170_1 = bc.field_B ^ -1;
                    statePc = 170;
                    continue stateLoop;
                }
                case 170: {
                    if (stackIn_170_0 != stackIn_170_1) {
                        statePc = 173;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    k.field_f.a(-1, 0, -1, param2);
                    if (var9 == 0) {
                        statePc = 176;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    k.field_f.a(0, 0, ub.a(bh.field_g, (byte) -81, pm.field_f), param2);
                    statePc = 176;
                    continue stateLoop;
                }
                case 176: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void b(int param0, int param1) {
        fl.a(130, param1 ^ 12362, 16694016, mb.field_e, 80 + param0, w.field_kb);
        int var2 = 145;
        kd.field_t.c(param0 + 82, var2, 18, 18);
        var2 = var2 + (16 + ga.a(188, 0, var2, nk.field_c, 16, 64, 16777215, se.field_S, (byte) -127, 0, param0 + 110) * 16);
        tg.a(true, 2).c(82 + param0, var2, 18, 18);
        var2 = var2 + (((kd.field_p ^ -1) == -1 ? 16 : 0) - -(ga.a(188, 0, var2, kb.field_e, 16, 64, 16777215, se.field_S, (byte) -127, 0, param0 + 110) * 16));
        vk.a(nf.field_e, param0 + 190, 3, gi.field_c, kk.field_n, var2, -22981);
        hk.g(309 - -param0, 117, 242, 263172);
        hk.g(310 - -param0, 117, 242, 6316128);
        fl.a(130, param1 ^ 12362, 16694016, hg.field_d, 320 + param0, w.field_kb);
        var2 = 145;
        tg.a(true, 0).c(320 - -param0, var2, 18, 18);
        var2 = var2 + (16 * ga.a(212, 0, var2, dk.field_f, 16, 64, 16777215, se.field_S, (byte) -128, 0, 348 - -param0) + 16);
        if (param1 != 12618) {
            bl.a(105, 85, false);
        }
        fl.a(var2 - -14, 256, 16694016, kc.field_q, param0 + 320, w.field_kb);
        var2 += 29;
        tg.a(true, 3).c(param0 + 320, var2, 18, 18);
        var2 = var2 + (16 - -(ga.a(212, 0, var2, ki.field_u, 16, 64, 16777215, se.field_S, (byte) -128, 0, 348 - -param0) * 16));
    }

    boolean f(byte param0) {
        int stackIn_6_0 = 0;
        L0: {
          this.field_V = this.a(-10604);
          if (param0 >= 77) {
            break L0;
          } else {
            this.field_S = false;
            break L0;
          }
        }
        L1: {
          L2: {
            if (0 != this.field_V) {
              break L2;
            } else {
              if (this.field_S) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    boolean h(byte param0) {
        int var2;
        int var3;
        int stackIn_13_0 = 0;
        L0: {
          var2 = this.a(-10604);
          var3 = var2 - this.field_V;
          if (param0 > 15) {
            break L0;
          } else {
            this.a(-126, -71, 58, -27);
            break L0;
          }
        }
        L1: {
          if (0 < var3) {
            this.field_V = this.field_V + (-1 + var3 - -8) / 8;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (-1 < (var3 ^ -1)) {
            this.field_V = this.field_V + (1 + (-16 + var3)) / 16;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          L4: {
            if (this.field_V != 0) {
              break L4;
            } else {
              if (-1 != (var2 ^ -1)) {
                break L4;
              } else {
                if (this.field_S) {
                  break L4;
                } else {
                  stackIn_13_0 = 1;
                  break L3;
                }
              }
            }
          }
          stackIn_13_0 = 0;
          break L3;
        }
        return stackIn_13_0 != 0;
    }

    abstract void b(int param0, int param1, int param2);

    final static void g(byte param0) {
        bf.field_x = bg.a(true);
        if (param0 > -12) {
            field_Z = (char[]) null;
        }
        ah.field_c = new ka();
        dd.a(true, true, (byte) 66);
    }

    public static void i(int param0) {
        field_Y = null;
        if (param0 != 2) {
            field_X = (String) null;
        }
        field_U = null;
        field_W = null;
        field_X = null;
        field_Z = null;
    }

    static {
        field_W = "Chat view has been scrolled up. Scroll down to chat.";
        field_Z = new char[128];
        field_X = "Back";
    }
}
