/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb {
    static String[] field_f;
    ji field_g;
    String field_b;
    String field_j;
    int field_h;
    String field_a;
    static vj field_c;
    static String field_k;
    static int field_d;
    static String field_e;
    static gh field_i;

    public static void a(byte param0) {
        if (param0 != 78) {
            pb.a((byte) -103);
        }
        field_f = null;
        field_i = null;
        field_k = null;
        field_e = null;
        field_c = null;
    }

    final static void a(boolean param0) {
        int var1;
        String var2;
        int var3;
        L0: {
          var3 = client.field_A ? 1 : 0;
          var1 = -(45 * (kf.field_G.field_o * kf.field_G.field_o) / 400) + 45;
          hk.a(0, var1 + 435, 640, 28, 16763904, 100);
          hk.a(0, var1 + 435, 640, 0);
          hk.a(0, var1 + 462, 640, 0);
          if (param0) {
            break L0;
          } else {
            pb.a(true);
            break L0;
          }
        }
        L1: {
          L2: {
            if (id.field_P == 0) {
              break L2;
            } else {
              L3: {
                if (id.field_P >= 3) {
                  break L3;
                } else {
                  var2 = cm.a((byte) 85, field_f[1], new String[]{Integer.toString(id.field_P + 1), Integer.toString(8)});
                  if (var3 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if ((id.field_P ^ -1) > -8) {
                  break L4;
                } else {
                  var2 = field_f[3];
                  if (var3 == 0) {
                    break L1;
                  } else {
                    break L4;
                  }
                }
              }
              var2 = cm.a((byte) 83, field_f[2], new String[]{Integer.toString(id.field_P - -1), Integer.toString(8)});
              if (var3 == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          var2 = field_f[0];
          break L1;
        }
        fl.a(var1 + 454, 256, 16777215, var2, -(1023 & bb.field_f) + -382, w.field_kb);
        fl.a(var1 + 454, 256, 16777215, var2, -(bb.field_f & 1023) + 642, w.field_kb);
    }

    final static void a(int param0) {
        int stackIn_53_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        int stackIn_61_2 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        int stackIn_68_0 = 0;
        int stackIn_68_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        int stackIn_69_2 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        int statePc = 0;
        ck var1 = null;
        int var1_int = 0;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        ck var9 = null;
        int var10 = 0;
        ck var11 = null;
        ck var12 = null;
        String var14 = null;
        ck var16 = null;
        String var17 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (le.field_E == null) {
                        statePc = 14;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (!le.field_E.a((byte) 121)) {
                        statePc = 14;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (!le.field_E.a("benefits", (byte) -119)) {
                        statePc = 14;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (eb.field_k == null) {
                        statePc = 14;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (!eb.field_k.a((byte) 121)) {
                        statePc = 14;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (!eb.field_k.a("benefits", (byte) 102)) {
                        statePc = 14;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    dj.field_eb = id.a(le.field_E, "headline", "benefits", param0 + 7802);
                    hg.field_a = id.a(le.field_E, "blurbpane", "benefits", 8192);
                    ea.field_l = id.a(le.field_E, "button", "benefits", 8192);
                    pj.field_I = id.a(le.field_E, "signup_text", "benefits", 8192);
                    lf.field_i = id.a(le.field_E, "menu_text", "benefits", 8192);
                    c.field_i = id.a(le.field_E, "button_frame", "benefits", param0 ^ 8582);
                    ge.field_h = id.a(le.field_E, "arrow", "benefits", 8192);
                    aj.field_e = (mm) ((Object) cd.a("large_font", eb.field_k, le.field_E, (byte) 114, "benefits"));
                    bn.field_g = (mm) ((Object) cd.a("small_font", eb.field_k, le.field_E, (byte) 112, "benefits"));
                    var28 = hk.field_l;
                    var2 = hk.field_j;
                    var3 = hk.field_i;
                    hk.b(he.field_V);
                    var11 = new ck(4 + ge.field_h.field_I, ge.field_h.field_H - -4);
                    var11.a();
                    ge.field_h.b(2, 2, o.field_d);
                    re.a(2, 1, 0, 2, var11, 0, var11.field_I, var11.field_H);
                    ge.field_h = var11;
                    l.field_b = ge.field_h.e();
                    var12 = new ck(195, 221);
                    var6 = var12.field_I / 2;
                    var12.a();
                    aj.field_e.b(cm.a((byte) 84, af.field_g, new String[]{wf.field_n}), var6, 40, 16777215, -1);
                    bn.field_g.b(cm.a((byte) 90, qi.field_N, new String[]{wf.field_n}), var6, 60, 16777215, -1);
                    aj.field_e.b(cm.a((byte) 126, sa.field_n, new String[]{jm.field_u}), var6, 110, 16777215, -1);
                    bn.field_g.b(cm.a((byte) 94, we.field_c, new String[]{jm.field_u}), var6, 130, 16777215, -1);
                    aj.field_e.b(we.field_a, var6, 180, 16777215, -1);
                    bn.field_g.b(sa.field_A, var6, 200, 16777215, -1);
                    re.a(3, 1, 0, param0 ^ 388, var12, 0, var12.field_I, var12.field_H);
                    hg.field_a.a();
                    var12.c(18 - hg.field_a.field_F, 241 - hg.field_a.field_z);
                    var7 = 0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (var7 >= dl.field_K.length) {
                        statePc = 12;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    vi.field_z[var7].a();
                    bn.field_g.a(dl.field_K[var7], 3, 3, -6 + vi.field_z[var7].field_I, -6 + vi.field_z[var7].field_H, o.field_d, -1, 1, 1, bn.field_g.field_R - -bn.field_g.field_K);
                    re.a(3, 1, 0, 2, vi.field_z[var7], 0, vi.field_z[var7].field_I, vi.field_z[var7].field_H);
                    var7++;
                    if (var10 != 0) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (var10 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    dl.field_K = null;
                    oh.field_e = pj.field_I.c();
                    oh.field_e.a();
                    wb.a(31, 0, 2 * hk.field_i / 3, 0, 64, hk.field_j);
                    hk.a(var28, var2, var3);
                    hk.a(he.field_V);
                    le.field_E = null;
                    sk.field_e = 434 - -((-c.field_i.field_I + ea.field_l.field_I) / 2);
                    dm.field_a = (ea.field_l.field_I - c.field_i.field_I) / 2 + 231;
                    dg.field_b = 390 - -((-c.field_i.field_H + ea.field_l.field_H) / 2);
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    sk.field_k = 390 - -((-c.field_i.field_H + ea.field_l.field_H) / 2);
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (lb.field_h == null) {
                        statePc = 16;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 16: {
                    return;
                }
                case 17: {
                    if (wg.field_b == null) {
                        statePc = 31;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (null != aj.field_e) {
                        statePc = 20;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var29 = hk.field_l;
                    var2 = hk.field_j;
                    var3 = hk.field_i;
                    hk.b(he.field_V);
                    var14 = cm.a((byte) 120, pd.field_b, new String[]{ma.field_H[rb.field_m]});
                    var5 = aj.field_e.b(var14, ce.field_r);
                    var6 = aj.field_e.b(var14, ce.field_r, aj.field_e.field_R + aj.field_e.field_K);
                    var7 = pm.field_d + (-var5 + ce.field_r) / 2;
                    var5 += 6;
                    var8 = qk.field_k - -((nk.field_g - var6) / 2);
                    var7 -= 3;
                    if (0 <= var7) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var9_int = -var7;
                    var5 = var5 + var9_int * 2;
                    le.field_y = le.field_y - var9_int;
                    pm.field_d = pm.field_d + var9_int;
                    var7 = var7 + var9_int;
                    wg.field_b.field_F = wg.field_b.field_F + var9_int;
                    wg.field_b.field_K = wg.field_b.field_K + 2 * var9_int;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    var8 -= 3;
                    var6 += 6;
                    if (wg.field_b.field_K < var5 + var7) {
                        statePc = 24;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var9_int = var5 + (var7 - wg.field_b.field_K);
                    le.field_y = le.field_y - var9_int;
                    var7 = var7 + var9_int;
                    pm.field_d = pm.field_d + var9_int;
                    var5 = var5 + 2 * var9_int;
                    wg.field_b.field_K = wg.field_b.field_K + var9_int * 2;
                    wg.field_b.field_F = wg.field_b.field_F + var9_int;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if ((var8 ^ -1) <= -1) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var9_int = -var8;
                    g.field_Q = g.field_Q - var9_int;
                    var8 = var8 + var9_int;
                    var6 = var6 + var9_int * 2;
                    qk.field_k = qk.field_k + var9_int;
                    wg.field_b.field_C = wg.field_b.field_C + 2 * var9_int;
                    wg.field_b.field_z = wg.field_b.field_z + var9_int;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (wg.field_b.field_C < var6 + var8) {
                        statePc = 29;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var9_int = var8 + (var6 + -wg.field_b.field_C);
                    wg.field_b.field_z = wg.field_b.field_z + var9_int;
                    var6 = var6 + var9_int * 2;
                    wg.field_b.field_C = wg.field_b.field_C + 2 * var9_int;
                    var8 = var8 + var9_int;
                    g.field_Q = g.field_Q - var9_int;
                    qk.field_k = qk.field_k + var9_int;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    wg.field_b.b();
                    var9 = new ck(wg.field_b.field_K, wg.field_b.field_C);
                    var9.a();
                    aj.field_e.a(var14, pm.field_d, qk.field_k, ce.field_r, nk.field_g, 16777215, -1, 1, 1, aj.field_e.field_R - -aj.field_e.field_K);
                    re.a(3, 1, 0, 2, var9, 0, var9.field_K, var9.field_C);
                    wg.field_b.a();
                    var9.c(0, 0);
                    w.field_qb = new ck(640, 480);
                    w.field_qb.a();
                    wg.field_b.d((wg.field_b.field_K >> 1059375233) - -le.field_y, (wg.field_b.field_C >> -491134559) - -g.field_Q, db.field_a, 4096);
                    wg.field_b = null;
                    w.field_qb.f();
                    hk.a(var29, var2, var3);
                    hk.a(he.field_V);
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if (n.field_b == null) {
                        statePc = 35;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (null != bn.field_g) {
                        statePc = 34;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var30 = hk.field_l;
                    var2 = hk.field_j;
                    var3 = hk.field_i;
                    hk.b(he.field_V);
                    var16 = new ck(412, 43);
                    var17 = cm.a((byte) 122, df.field_Z, new String[]{n.field_b});
                    n.field_b = null;
                    var16.a();
                    bn.field_g.a(var17, 3, 3, var16.field_I - 6, var16.field_H - 6, 16777215, -1, 0, 1, bn.field_g.field_R + bn.field_g.field_K);
                    re.a(3, 1, 0, 2, var16, 0, var16.field_I, var16.field_H);
                    lb.field_h.a();
                    var16.c(-lb.field_h.field_F + 199, -lb.field_h.field_z + 83);
                    hk.a(var30, var2, var3);
                    hk.a(he.field_V);
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (pe.field_d == null) {
                        statePc = 39;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (bn.field_g != null) {
                        statePc = 38;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var31 = hk.field_l;
                    var2 = hk.field_j;
                    var3 = hk.field_i;
                    hk.b(he.field_V);
                    var4 = 6 + bn.field_g.b(ka.field_O, 640);
                    var5 = 20 + (var4 - -pe.field_d.field_K);
                    var6 = -(var5 / 2) + 427;
                    var7 = 20 + (var6 - -pe.field_d.field_K);
                    lb.field_h.a();
                    bn.field_g.a(ka.field_O, var7 - lb.field_h.field_F, bn.field_g.field_K + (bn.field_g.field_R + (-lb.field_h.field_z + 155)), 16777215, -1);
                    re.a(3, 1, -lb.field_h.field_F + (var7 + -4), param0 ^ 388, lb.field_h, -lb.field_h.field_z + 155, var4, 50);
                    var8 = -lb.field_h.field_z + 155 - (-bn.field_g.field_R + -3 + pe.field_d.field_C + -bn.field_g.field_K) / 2;
                    pe.field_d.c(var6 - lb.field_h.field_F, var8);
                    hk.a(var31, var2, var3);
                    hk.a(he.field_V);
                    pe.field_d = null;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    hk.b(he.field_V);
                    if (param0 == 390) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    pb.a((byte) 100);
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    hk.a(16, 16, 608, 112, 15, qn.field_lb, w.field_Fb);
                    hk.a(231, 144, 393, 232, 15, qn.field_lb, w.field_Fb);
                    if (null == dj.field_eb) {
                        statePc = 43;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    dj.field_eb.c(0, 0);
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    if (null == hg.field_a) {
                        statePc = 45;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    hg.field_a.c(0, 0);
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    lb.field_h.c(0, 0);
                    if (null == w.field_qb) {
                        statePc = 47;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    w.field_qb.c(0, 0);
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    if (ea.field_l == null) {
                        statePc = 62;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (null != c.field_i) {
                        statePc = 50;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 50: {
                    ea.field_l.c(231, 390);
                    var1 = pj.field_I;
                    if (rg.field_a.field_h != 0) {
                        statePc = 52;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    var1 = oh.field_e;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    var1.c(0, 0);
                    stackIn_54_0 = rb.field_b;
                    stackIn_53_0 = stackIn_54_0;
                    if (0 == rg.field_a.field_h) {
                        statePc = 54;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    stackIn_55_0 = stackIn_53_0;
                    stackIn_55_1 = 3;
                    statePc = 55;
                    continue stateLoop;
                }
                case 54: {
                    stackIn_55_0 = stackIn_54_0;
                    stackIn_55_1 = 4;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    var2 = (h.a(stackIn_55_0 << stackIn_55_1, (byte) -122) * 40 >> -551624784) + 40;
                    if (-1 > (var2 ^ -1)) {
                        statePc = 57;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 57: {
                    ea.field_l.f(230, 389, var2);
                    ea.field_l.f(232, 389, var2);
                    ea.field_l.f(232, 391, var2);
                    ea.field_l.f(230, 391, var2);
                    var1.f(1, 1, var2);
                    var1.f(-1, 1, var2);
                    var1.f(1, -1, var2);
                    var1.f(-1, -1, var2);
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    stackIn_60_0 = dm.field_a;
                    stackIn_59_0 = stackIn_60_0;
                    stackIn_60_1 = sk.field_k;
                    stackIn_59_1 = stackIn_60_1;
                    if (-1 != (rg.field_a.field_h ^ -1)) {
                        statePc = 60;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    stackIn_61_0 = stackIn_59_0;
                    stackIn_61_1 = stackIn_59_1;
                    stackIn_61_2 = 1;
                    statePc = 61;
                    continue stateLoop;
                }
                case 60: {
                    stackIn_61_0 = stackIn_60_0;
                    stackIn_61_1 = stackIn_60_1;
                    stackIn_61_2 = 0;
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    ak.a(stackIn_61_0, stackIn_61_1, stackIn_61_2 != 0, 40);
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    if (null == ea.field_l) {
                        statePc = 70;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    if (c.field_i == null) {
                        statePc = 70;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    ea.field_l.c(434, 390);
                    lf.field_i.c(0, 0);
                    if ((rg.field_a.field_h ^ -1) != -2) {
                        statePc = 66;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    wb.a(31, 436, 7 * ea.field_l.field_H / 12, 392, 64, -4 + ea.field_l.field_I);
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    stackIn_68_0 = sk.field_e;
                    stackIn_67_0 = stackIn_68_0;
                    stackIn_68_1 = dg.field_b;
                    stackIn_67_1 = stackIn_68_1;
                    if ((rg.field_a.field_h ^ -1) != -2) {
                        statePc = 68;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    stackIn_69_0 = stackIn_67_0;
                    stackIn_69_1 = stackIn_67_1;
                    stackIn_69_2 = 1;
                    statePc = 69;
                    continue stateLoop;
                }
                case 68: {
                    stackIn_69_0 = stackIn_68_0;
                    stackIn_69_1 = stackIn_68_1;
                    stackIn_69_2 = 0;
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    ak.a(stackIn_69_0, stackIn_69_1, stackIn_69_2 != 0, 40);
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    if (null != ge.field_h) {
                        statePc = 72;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 72: {
                    var1_int = -(ge.field_h.field_C / 2) + 357;
                    ge.field_h.c(-ge.field_h.field_K + 269, var1_int);
                    l.field_b.c(586, var1_int);
                    if (var1_int >= pm.field_f) {
                        statePc = 85;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    if (var1_int - -ge.field_h.field_H > pm.field_f) {
                        statePc = 75;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 75: {
                    var2 = (40 * h.a(rb.field_b << -919985340, (byte) -122) >> -605044784) + 40;
                    if (0 < var2) {
                        statePc = 77;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 77: {
                    if (bh.field_g <= 269 + -ge.field_h.field_I) {
                        statePc = 80;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    if (bh.field_g < 269) {
                        statePc = 84;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    if (586 >= bh.field_g) {
                        statePc = 85;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    if (586 - -ge.field_h.field_I > bh.field_g) {
                        statePc = 83;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    hc.a(73);
                    vi.field_z[wh.field_a].c(269, 340);
                    statePc = 88;
                    continue stateLoop;
                }
                case 83: {
                    l.field_b.f(585, -1 + var1_int, var2);
                    l.field_b.f(587, -1 + var1_int, var2);
                    l.field_b.f(585, 1 + var1_int, var2);
                    l.field_b.f(587, 1 + var1_int, var2);
                    if (var10 == 0) {
                        statePc = 85;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    ge.field_h.f(-ge.field_h.field_K + 269 + -1, var1_int + -1, var2);
                    ge.field_h.f(1 + (269 - ge.field_h.field_K), -1 + var1_int, var2);
                    ge.field_h.f(-ge.field_h.field_K + 269 + -1, 1 + var1_int, var2);
                    ge.field_h.f(-ge.field_h.field_K + 269 - -1, var1_int - -1, var2);
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    hc.a(73);
                    vi.field_z[wh.field_a].c(269, 340);
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(ji param0, int param1) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        vg var5 = null;
        int[] var6 = null;
        int var7 = 0;
        uf var8 = null;
        uf var9 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var8 = new uf(param0.a(0, "", "logo.fo3d"));
                        var9 = var8;
                        var3 = var9.d((byte) -124);
                        var9.j((byte) -108);
                        l.field_i = rf.a(122, var9);
                        df.field_U = new int[var3][];
                        jb.field_g = new vg[var3];
                        var4 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var4 >= var3) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        jb.field_g[var4] = un.a(-128, var8);
                        var4++;
                        if (var7 != 0) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var7 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var9.k((byte) -124);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param1 < -1) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        field_e = (String) null;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var4 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var3 <= var4) {
                            statePc = 19;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5 = jb.field_g[var4];
                        var5.a(6, 6, (byte) 31, 6, 1);
                        var5.a(-14200);
                        var6 = new int[]{var5.field_H - -var5.field_f >> 2089083617, var5.field_b + var5.field_n >> -1064477215, var5.field_a + var5.field_i >> 1145728961};
                        df.field_U[var4] = var6;
                        var5.a((byte) -111, -var6[0], -var6[1], -var6[2]);
                        var4++;
                        if (var7 != 0) {
                            statePc = 19;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var7 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_17_0 = (RuntimeException) (var2);
                    stackIn_16_0 = stackIn_17_0;
                    stackIn_17_1 = new StringBuilder().append("pb.B(");
                    stackIn_16_1 = stackIn_17_1;
                    if (param0 == null) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_16_1);
                    stackIn_18_2 = "{...}";
                    statePc = 18;
                    continue stateLoop;
                }
                case 17: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_18_2 = "null";
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    throw dh.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
                }
                case 19: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_f = new String[]{"Play Stamina Mode to unlock themes for the multiplayer game!", "<%0> of <%1> themes unlocked for multiplayer - play Stamina Mode to unlock up to 4!", "<%0> of <%1> themes unlocked for multiplayer - play the Master Challenge to unlock the rest!", "All themes unlocked for multiplayer! Can you beat your Stamina and Master Challenge highscores?"};
        field_k = "Try changing the following settings:  ";
        field_c = new vj();
        field_d = 128;
        field_e = "Reload game";
        field_i = new gh(3);
    }
}
