/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c {
    static java.security.SecureRandom field_b;
    static String field_c;
    static ll[] field_a;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9;
        L0: {
          L1: {
            var9 = ArcanistsMulti.field_G ? 1 : 0;
            if ((param3 ^ -1) > (param0 ^ -1)) {
              break L1;
            } else {
              L2: {
                if (param3 < param5) {
                  break L2;
                } else {
                  L3: {
                    if (param5 > param0) {
                      break L3;
                    } else {
                      wg.a(param6, 2973, param7, param0, de.field_l, param3, param2, param5, param4);
                      if (var9 == 0) {
                        break L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  wg.a(param7, 2973, param6, param5, de.field_l, param3, param2, param0, param4);
                  if (var9 == 0) {
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              wg.a(param4, 2973, param6, param3, de.field_l, param5, param2, param0, param7);
              if (var9 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L4: {
            if (param5 > param0) {
              break L4;
            } else {
              L5: {
                if (param5 <= param3) {
                  break L5;
                } else {
                  wg.a(param7, 2973, param4, param5, de.field_l, param0, param2, param3, param6);
                  if (var9 == 0) {
                    break L0;
                  } else {
                    break L5;
                  }
                }
              }
              wg.a(param4, 2973, param7, param3, de.field_l, param0, param2, param5, param6);
              if (var9 == 0) {
                break L0;
              } else {
                break L4;
              }
            }
          }
          wg.a(param6, 2973, param4, param0, de.field_l, param5, param2, param3, param7);
          break L0;
        }
        L6: {
          if (param1 > 60) {
            break L6;
          } else {
            field_c = (String) null;
            break L6;
          }
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 < 26) {
            field_c = (String) null;
        }
        field_b = null;
    }

    final static void a(int param0, boolean param1, boolean param2, int param3, boolean param4) {
        kc stackIn_17_0 = null;
        kc stackIn_18_0 = null;
        kc stackIn_19_0 = null;
        kc stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_61_0 = 0;
        int stackIn_65_0 = 0;
        boolean stackIn_108_0 = false;
        int stackIn_125_0 = 0;
        boolean stackIn_136_0 = false;
        boolean stackIn_154_0 = false;
        int stackIn_161_0 = 0;
        kc stackIn_179_0 = null;
        kc stackIn_180_0 = null;
        kc stackIn_181_0 = null;
        kc stackIn_182_0 = null;
        kc stackIn_183_0 = null;
        int stackIn_183_1 = 0;
        kc stackIn_184_0 = null;
        kc stackIn_185_0 = null;
        kc stackIn_186_0 = null;
        kc stackIn_187_0 = null;
        kc stackIn_188_0 = null;
        int stackIn_188_1 = 0;
        kc stackIn_189_0 = null;
        kc stackIn_190_0 = null;
        kc stackIn_191_0 = null;
        kc stackIn_192_0 = null;
        kc stackIn_193_0 = null;
        int stackIn_193_1 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        boolean stackOut_107_0;
        boolean stackOut_135_0;
        boolean stackOut_153_0;
        int statePc = 0;
        RuntimeException var5 = null;
        kc var6 = null;
        kc var7 = null;
        kc var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        String var10_ref_String = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        int var12 = 0;
        int[] var13 = null;
        int var13_int = 0;
        String var13_ref = null;
        int var14_int = 0;
        String var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        vn var17 = null;
        Object var18 = null;
        int var18_int = 0;
        cg var18_ref = null;
        int var19 = 0;
        int[] var20 = null;
        kc var22 = null;
        int[] var23 = null;
        String var24 = null;
        String var25 = null;
        int[] var26 = null;
        kc var27 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var18 = null;
                    var19 = ArcanistsMulti.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    ej.a(16, oo.field_y);
                    if (wi.field_f == null) {
                        statePc = 178;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    mo.field_o.field_ub = true;
                    var22 = go.field_d;
                    var27 = var22;
                    go.field_d.field_I = 0;
                    var27.field_x = 0;
                    dk.field_k.field_I = 0;
                    var6 = dk.field_k;
                    var6.field_x = 0;
                    var7 = jf.field_d;
                    jf.field_d.field_I = 0;
                    var7.field_x = 0;
                    if (!qk.k((byte) 105)) {
                        statePc = 170;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    nl.field_Db.field_rb = fb.field_c.toUpperCase();
                    var9 = (2 + oh.field_h.field_x) / 2;
                    go.field_d.a(-2 + var9, 0, -40 + oh.field_h.field_I, 40, (byte) -120);
                    if (wi.field_f.field_Rb >= wi.field_f.field_dc) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    go.field_d.field_rb = mb.field_O.toUpperCase();
                    go.field_d.field_ub = true;
                    if (var19 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    go.field_d.field_rb = ck.field_f.toUpperCase();
                    go.field_d.field_ub = false;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    go.field_d.field_v = ko.field_h.field_v;
                    if (0 < oe.field_b) {
                        statePc = 9;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if ((oe.field_b ^ -1) == -2) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var10_ref_String = tj.a(-36, new String[]{Integer.toString(oe.field_b)}, mm.field_y);
                    if (var19 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var10_ref_String = qk.field_pb;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if ((16 & sb.field_e ^ -1) != -1) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (so.field_j) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    go.field_d.field_v = ko.field_h.field_Ab;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    go.field_d.field_rb = go.field_d.field_rb + "<br>" + var10_ref_String;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    dk.field_k.a(oh.field_h.field_x + -var9, var9, -40 + oh.field_h.field_I, 40, (byte) -120);
                    dk.field_k.field_rb = nn.field_m.toUpperCase();
                    stackIn_19_0 = dk.field_k;
                    stackIn_17_0 = stackIn_19_0;
                    if (!param2) {
                        statePc = 19;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_19_0 = (kc) ((Object) stackIn_17_0);
                    stackIn_18_0 = stackIn_19_0;
                    if ((ba.field_a ^ -1L) != -1L) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackIn_20_0 = (kc) ((Object) stackIn_18_0);
                    stackIn_20_1 = 1;
                    statePc = 20;
                    continue stateLoop;
                }
                case 19: {
                    stackIn_20_0 = (kc) ((Object) stackIn_19_0);
                    stackIn_20_1 = 0;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    stackIn_20_0.field_ub = stackIn_20_1 != 0;
                    var8 = dk.field_k;
                    var10 = 2;
                    if (null == um.field_a) {
                        statePc = 68;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (qa.field_l != null) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    tk.field_q = new boolean[vf.field_l];
                    qa.field_l = new byte[vf.field_l];
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    var11_int = 0;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (var11_int >= vf.field_l) {
                        statePc = 28;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    tk.field_q[var11_int] = false;
                    var11_int++;
                    if (var19 != 0) {
                        statePc = 30;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (var19 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var10 = 0;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if (var10 >= 2) {
                        statePc = 64;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var11_int = 0;
                    stackIn_65_0 = 0;
                    stackIn_32_0 = stackIn_65_0;
                    if (var19 != 0) {
                        statePc = 65;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var12 = stackIn_32_0;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    stackIn_34_0 = var12 ^ -1;
                    stackIn_34_1 = um.field_a.length ^ -1;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    if (stackIn_34_0 <= stackIn_34_1) {
                        statePc = 60;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var26 = um.field_a[var12];
                    var23 = var26;
                    var20 = var23;
                    var13 = var20;
                    stackIn_61_0 = 0;
                    stackIn_36_0 = stackIn_61_0;
                    if (var19 != 0) {
                        statePc = 61;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var14_int = stackIn_36_0;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if ((var14_int ^ -1) <= (var26.length ^ -1)) {
                        statePc = 50;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var15 = var26[var14_int];
                    var16 = var20[1 + var14_int];
                    stackIn_52_0 = 0;
                    stackIn_39_0 = stackIn_52_0;
                    stackIn_52_1 = var15 ^ -1;
                    stackIn_39_1 = stackIn_52_1;
                    if (var19 != 0) {
                        statePc = 52;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (stackIn_39_0 != stackIn_39_1) {
                        statePc = 46;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (0 == var10) {
                        statePc = 42;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    stackIn_43_0 = wi.field_f.field_Rb;
                    statePc = 43;
                    continue stateLoop;
                }
                case 42: {
                    stackIn_43_0 = wi.field_f.field_dc;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    var17_int = stackIn_43_0;
                    if ((var17_int ^ -1) != (var16 ^ -1)) {
                        statePc = 59;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if (var19 == 0) {
                        statePc = 48;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if ((wi.field_f.field_Wb[var15] & 255 ^ -1) != (var16 ^ -1)) {
                        statePc = 59;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    var14_int += 2;
                    if (var19 == 0) {
                        statePc = 37;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var11_int = 1;
                    var14_int = -1;
                    var15 = 0;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    stackIn_52_0 = var15;
                    stackIn_52_1 = var26.length;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    if (stackIn_52_0 >= stackIn_52_1) {
                        statePc = 58;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    var16 = var26[var15];
                    stackIn_34_0 = var16;
                    stackIn_54_0 = stackIn_34_0;
                    stackIn_34_1 = var14_int;
                    stackIn_54_1 = stackIn_34_1;
                    if (var19 != 0) {
                        statePc = 34;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (stackIn_54_0 > stackIn_54_1) {
                        statePc = 56;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 56: {
                    var14_int = var16;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    var15 += 2;
                    if (var19 == 0) {
                        statePc = 51;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    tk.field_q[var14_int] = true;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    var12++;
                    if (var19 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    stackIn_61_0 = var11_int;
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    if (stackIn_61_0 != 0) {
                        statePc = 64;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    var10++;
                    if (var19 == 0) {
                        statePc = 30;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    stackIn_65_0 = qf.field_d ^ -1;
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    if (stackIn_65_0 > -3) {
                        statePc = 68;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    if (!ri.field_b[12]) {
                        statePc = 68;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    var10 = 2;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    if (-3 < (var10 ^ -1)) {
                        statePc = 149;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (null != dh.field_Hb) {
                        statePc = 74;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    if (null != pe.field_Fb) {
                        statePc = 74;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    if (null != dk.field_a) {
                        statePc = 74;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if (ue.field_b == null) {
                        statePc = 169;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    var11_int = 0;
                    var12 = 0;
                    var13_int = 0;
                    var14_int = 0;
                    var15 = 0;
                    var16 = 0;
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    if (vf.field_l <= var16) {
                        statePc = 104;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    var17_int = wi.field_f.field_Wb[var16] & 255;
                    if (var19 != 0) {
                        statePc = 105;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    if (dh.field_Hb == null) {
                        statePc = 83;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    if (null != dh.field_Hb[var16]) {
                        statePc = 80;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 80: {
                    if (dh.field_Hb[var16][var17_int]) {
                        statePc = 82;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 82: {
                    var11_int = 1;
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    if (pe.field_Fb == null) {
                        statePc = 90;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    if (pe.field_Fb[var16] == null) {
                        statePc = 90;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    var18_int = pe.field_Fb[var16][var17_int];
                    if (0 == var18_int) {
                        statePc = 88;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    if (gm.field_c) {
                        statePc = 88;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    var11_int = 1;
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    if ((var18_int ^ -1) >= (var13_int ^ -1)) {
                        statePc = 90;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    var13_int = var18_int;
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    if (null == ue.field_b) {
                        statePc = 93;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    if (null == ue.field_b[var16]) {
                        statePc = 93;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    var15 = var15 | ue.field_b[var16][var17_int];
                    statePc = 93;
                    continue stateLoop;
                }
                case 93: {
                    if (null == dk.field_a) {
                        statePc = 103;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    if (dk.field_a[var16] != null) {
                        statePc = 96;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 96: {
                    var18_int = dk.field_a[var16][var17_int];
                    if (var18_int == 0) {
                        statePc = 100;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    if (!gm.field_c) {
                        statePc = 99;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 99: {
                    var11_int = 1;
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    if ((var14_int ^ -1) > (var18_int ^ -1)) {
                        statePc = 102;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 102: {
                    var14_int = var18_int;
                    statePc = 103;
                    continue stateLoop;
                }
                case 103: {
                    var16++;
                    if (var19 == 0) {
                        statePc = 75;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    var16 = 0;
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    var17 = lf.field_b.field_Cb.field_G;
                    var18_ref = (cg) ((Object) var17.b(12623));
                    statePc = 106;
                    continue stateLoop;
                }
                case 106: {
                    if (var18_ref == null) {
                        statePc = 124;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    stackOut_107_0 = var18_ref.e(183874081);
                    stackIn_125_0 = stackOut_107_0 ? 1 : 0;
                    stackIn_108_0 = stackOut_107_0;
                    if (var19 != 0) {
                        statePc = 125;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    if (!stackIn_108_0) {
                        statePc = 111;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    if (var19 == 0) {
                        statePc = 123;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    if (var11_int == 0) {
                        statePc = 115;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    if (!var18_ref.field_Jb) {
                        statePc = 114;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 114: {
                    var16 = 1;
                    if (var19 == 0) {
                        statePc = 124;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    if ((var18_ref.field_Pb ^ -1) <= (var13_int ^ -1)) {
                        statePc = 117;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    var16 = 1;
                    if (var19 == 0) {
                        statePc = 124;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    if (var14_int <= var18_ref.field_Vb) {
                        statePc = 119;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    var16 = 1;
                    if (var19 == 0) {
                        statePc = 124;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    if (((var18_ref.field_Bb ^ -1) & var15 ^ -1) >= -1) {
                        statePc = 121;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    var16 = 1;
                    if (var19 == 0) {
                        statePc = 124;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    if (var12 == 0) {
                        statePc = 123;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    var16 = 1;
                    if (var19 == 0) {
                        statePc = 124;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    var18_ref = (cg) ((Object) var17.a(0));
                    if (var19 == 0) {
                        statePc = 106;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    stackIn_125_0 = 2;
                    statePc = 125;
                    continue stateLoop;
                }
                case 125: {
                    if (stackIn_125_0 > qf.field_d) {
                        statePc = 129;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    if (ri.field_b[12]) {
                        statePc = 128;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 128: {
                    var16 = 0;
                    statePc = 129;
                    continue stateLoop;
                }
                case 129: {
                    if (var16 != 0) {
                        statePc = 142;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    if (var19 == 0) {
                        statePc = 169;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    dk.field_k.field_ub = false;
                    if (dk.field_k.field_A) {
                        statePc = 133;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 133: {
                    var11 = null;
                    var12 = 0;
                    var13_int = 0;
                    statePc = 134;
                    continue stateLoop;
                }
                case 134: {
                    if ((var13_int ^ -1) <= (vf.field_l ^ -1)) {
                        statePc = 160;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    stackOut_135_0 = tk.field_q[var13_int];
                    stackIn_161_0 = stackOut_135_0 ? 1 : 0;
                    stackIn_136_0 = stackOut_135_0;
                    if (var19 != 0) {
                        statePc = 161;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    if (stackIn_136_0) {
                        statePc = 138;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 138: {
                    var24 = "<col=A00000>" + ob.field_bb[var13_int] + "</col>";
                    if (var11 == null) {
                        statePc = 140;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    var12 = 1;
                    var11 = (String) (var11) + ", " + var24;
                    if (var19 == 0) {
                        statePc = 141;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    var11 = var24;
                    statePc = 141;
                    continue stateLoop;
                }
                case 141: {
                    var13_int++;
                    if (var19 == 0) {
                        statePc = 134;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    dk.field_k.field_ub = false;
                    if (dk.field_k.field_A) {
                        statePc = 144;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 144: {
                    if (-1 == (tn.field_Ob.field_c.field_Mb ^ -1)) {
                        statePc = 147;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    kh.field_c = tj.a(param3 ^ 119, new String[]{ec.field_b}, q.field_O);
                    if (var19 == 0) {
                        statePc = 148;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    kh.field_c = ea.field_G;
                    statePc = 148;
                    continue stateLoop;
                }
                case 148: {
                    if (var19 == 0) {
                        statePc = 169;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    dk.field_k.field_ub = false;
                    if (dk.field_k.field_A) {
                        statePc = 151;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 151: {
                    var11 = null;
                    var12 = 0;
                    var13_int = 0;
                    statePc = 152;
                    continue stateLoop;
                }
                case 152: {
                    if ((var13_int ^ -1) <= (vf.field_l ^ -1)) {
                        statePc = 160;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    stackOut_153_0 = tk.field_q[var13_int];
                    stackIn_161_0 = stackOut_153_0 ? 1 : 0;
                    stackIn_154_0 = stackOut_153_0;
                    if (var19 != 0) {
                        statePc = 161;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    if (stackIn_154_0) {
                        statePc = 156;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 156: {
                    var25 = "<col=A00000>" + ob.field_bb[var13_int] + "</col>";
                    if (var11 == null) {
                        statePc = 158;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    var12 = 1;
                    var11 = (String) (var11) + ", " + var25;
                    if (var19 == 0) {
                        statePc = 159;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    var11 = var25;
                    statePc = 159;
                    continue stateLoop;
                }
                case 159: {
                    var13_int++;
                    if (var19 == 0) {
                        statePc = 152;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    stackIn_161_0 = -1;
                    statePc = 161;
                    continue stateLoop;
                }
                case 161: {
                    if (stackIn_161_0 != (var10 ^ -1)) {
                        statePc = 165;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    var13_ref = hd.field_c;
                    if (var12 != 0) {
                        statePc = 164;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    var14 = tj.a(-42, new String[]{(String) (var11)}, fo.field_b);
                    if (var19 == 0) {
                        statePc = 168;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 164: {
                    var14 = rf.field_g + (String) (var11);
                    statePc = 168;
                    continue stateLoop;
                }
                case 165: {
                    var13_ref = on.field_i;
                    if (var12 != 0) {
                        statePc = 167;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    var14 = tj.a(-11, new String[]{(String) (var11)}, hb.field_Hb);
                    if (var19 == 0) {
                        statePc = 168;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    var14 = oj.field_d + (String) (var11);
                    statePc = 168;
                    continue stateLoop;
                }
                case 168: {
                    kh.field_c = "<col=A00000>" + var13_ref + "<br>" + var14;
                    statePc = 169;
                    continue stateLoop;
                }
                case 169: {
                    if (var19 == 0) {
                        statePc = 171;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    var9_ref_String = wi.field_f.field_ic;
                    nl.field_Db.field_rb = tj.a(param3 ^ 118, new String[]{var9_ref_String}, ul.field_j).toUpperCase();
                    jf.field_d.a(oh.field_h.field_x, 0, oh.field_h.field_I + -40, 40, (byte) -120);
                    jf.field_d.field_rb = tj.a(param3 + 112, new String[]{var9_ref_String}, uf.field_b);
                    var8 = jf.field_d;
                    statePc = 171;
                    continue stateLoop;
                }
                case 171: {
                    if (-1L != (ba.field_a ^ -1L)) {
                        statePc = 173;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 173: {
                    var9 = (int)(ba.field_a - qj.b(param3 ^ -26570));
                    var9 = (var9 - -999) / 1000;
                    if (var9 < 1) {
                        statePc = 175;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 175: {
                    var9 = 1;
                    statePc = 176;
                    continue stateLoop;
                }
                case 176: {
                    var8.field_rb = tj.a(113, new String[]{Integer.toString(var9)}, ef.field_v);
                    statePc = 177;
                    continue stateLoop;
                }
                case 177: {
                    aj.field_d.field_rb = tj.a(116, new String[]{Integer.toString(wi.field_f.field_Rb), Integer.toString(wi.field_f.field_dc)}, ug.field_h);
                    statePc = 178;
                    continue stateLoop;
                }
                case 178: {
                    stackIn_182_0 = hl.field_m;
                    stackIn_179_0 = stackIn_182_0;
                    if (!param4) {
                        statePc = 182;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 179: {
                    stackIn_182_0 = (kc) ((Object) stackIn_179_0);
                    stackIn_180_0 = stackIn_182_0;
                    if (param1) {
                        statePc = 182;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    stackIn_182_0 = (kc) ((Object) stackIn_180_0);
                    stackIn_181_0 = stackIn_182_0;
                    if (so.field_j) {
                        statePc = 182;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 181: {
                    stackIn_183_0 = (kc) ((Object) stackIn_181_0);
                    stackIn_183_1 = 1;
                    statePc = 183;
                    continue stateLoop;
                }
                case 182: {
                    stackIn_183_0 = (kc) ((Object) stackIn_182_0);
                    stackIn_183_1 = 0;
                    statePc = 183;
                    continue stateLoop;
                }
                case 183: {
                    ((kc) (Object) stackIn_183_0).b(stackIn_183_1 != 0, (byte) 60);
                    stackIn_187_0 = oh.field_h;
                    stackIn_184_0 = stackIn_187_0;
                    if (!param4) {
                        statePc = 187;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    stackIn_187_0 = (kc) ((Object) stackIn_184_0);
                    stackIn_185_0 = stackIn_187_0;
                    if (param1) {
                        statePc = 187;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 185: {
                    stackIn_187_0 = (kc) ((Object) stackIn_185_0);
                    stackIn_186_0 = stackIn_187_0;
                    if (so.field_j) {
                        statePc = 187;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 186: {
                    stackIn_188_0 = (kc) ((Object) stackIn_186_0);
                    stackIn_188_1 = 1;
                    statePc = 188;
                    continue stateLoop;
                }
                case 187: {
                    stackIn_188_0 = (kc) ((Object) stackIn_187_0);
                    stackIn_188_1 = 0;
                    statePc = 188;
                    continue stateLoop;
                }
                case 188: {
                    ((kc) (Object) stackIn_188_0).b(stackIn_188_1 != 0, (byte) 69);
                    stackIn_192_0 = nl.field_Fb;
                    stackIn_189_0 = stackIn_192_0;
                    if (!param4) {
                        statePc = 192;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 189: {
                    stackIn_192_0 = (kc) ((Object) stackIn_189_0);
                    stackIn_190_0 = stackIn_192_0;
                    if (param1) {
                        statePc = 192;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    stackIn_192_0 = (kc) ((Object) stackIn_190_0);
                    stackIn_191_0 = stackIn_192_0;
                    if (!so.field_j) {
                        statePc = 192;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    stackIn_193_0 = (kc) ((Object) stackIn_191_0);
                    stackIn_193_1 = 1;
                    statePc = 193;
                    continue stateLoop;
                }
                case 192: {
                    stackIn_193_0 = (kc) ((Object) stackIn_192_0);
                    stackIn_193_1 = 0;
                    statePc = 193;
                    continue stateLoop;
                }
                case 193: {
                    ((kc) (Object) stackIn_193_0).b(stackIn_193_1 != 0, (byte) 115);
                    tn.field_Ob.field_c.h((byte) 118);
                    if (param3 == 2) {
                        statePc = 195;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    return;
                }
                case 195: {
                    if (wi.field_f != null) {
                        statePc = 197;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 197: {
                    if ((mo.field_o.field_U ^ -1) == -1) {
                        statePc = 199;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    qc.a(false, wi.field_f.h((byte) 94), param0);
                    statePc = 199;
                    continue stateLoop;
                }
                case 199: {
                    if (0 != go.field_d.field_U) {
                        statePc = 201;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 201: {
                    so.field_j = true;
                    statePc = 202;
                    continue stateLoop;
                }
                case 202: {
                    if (dk.field_k.field_U != 0) {
                        statePc = 204;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 204: {
                    bj.field_ub = true;
                    statePc = 205;
                    continue stateLoop;
                }
                case 205: {
                    if (0 == gj.field_d.field_U) {
                        statePc = 207;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 206: {
                    so.field_j = false;
                    statePc = 207;
                    continue stateLoop;
                }
                case 207: {
                    lm.a(false, param0, wi.field_f, 0);
                    statePc = 210;
                    continue stateLoop;
                }
                case 210: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_c = "<%0> has declined the invitation.";
    }
}
