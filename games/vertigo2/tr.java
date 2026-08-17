/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tr {
    private int field_N;
    private nj field_z;
    private wo[][] field_K;
    boolean field_i;
    static cr field_l;
    private boolean[] field_p;
    private long field_j;
    private int field_x;
    private bh field_m;
    int field_s;
    private int field_k;
    private int[] field_q;
    private boolean field_A;
    private int[] field_L;
    private int field_v;
    private int field_y;
    static String field_O;
    private int field_M;
    static String field_d;
    private er field_b;
    static String field_e;
    private boolean field_g;
    private am field_G;
    lj field_D;
    private int field_u;
    private int field_t;
    private boolean field_o;
    private float field_I;
    private int field_C;
    static int field_f;
    private float field_E;
    private hd field_a;
    private boolean field_w;
    private int field_r;
    int field_h;
    private boolean[] field_F;
    int field_B;
    private int field_J;
    private boolean field_c;
    private int field_n;
    private int field_H;

    private final void a(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_17_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 1220) {
              var4_int = 1 << param1;
              if ((ml.field_z & var4_int) == 0) {
                L1: {
                  ml.field_z = ml.field_z | var4_int;
                  var5 = param1;
                  if (ln.field_d == null) {
                    break L1;
                  } else {
                    if ((ln.field_d.field_B ^ -1) > -1) {
                      break L1;
                    } else {
                      if (null != oe.field_pb) {
                        break L1;
                      } else {
                        L2: {
                          if ((1 << var5 & qr.field_j) == 0) {
                            stackIn_17_0 = 0;
                            break L2;
                          } else {
                            stackIn_17_0 = 1;
                            break L2;
                          }
                        }
                        var6 = stackIn_17_0;
                        if (var6 != 0) {
                          break L1;
                        } else {
                          qr.field_j = qr.field_j | 1 << var5;
                          sk.field_b = sk.field_b - (1 << var5);
                          break L1;
                        }
                      }
                    }
                  }
                }
                L3: {
                  jq.field_e = jq.field_e | var4_int;
                  bg.field_b.a(new fa(param1), false);
                  if (!this.field_c) {
                    fg.field_eb.a(new nf(param1, param2, qr.field_j, sk.field_b, re.field_j, ki.field_c), false);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) runtimeException), "tr.M(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void b(int param0, int param1) {
        try {
            uh.field_Wb.j(64, 122);
            uh.field_Wb.f(22, 119);
            uh.field_Wb.f(1, -98);
            uh.field_Wb.f(param0, param1 + 24174);
            uh.field_Wb.e(this.field_D.field_l[this.field_B].field_H, param1 ^ param1);
            uh.field_Wb.e(mc.field_e, param1 ^ -24066);
            uh.field_Wb.e(sl.field_l, param1 + 24066);
            uh.field_Wb.e(ci.field_b, param1 ^ -24066);
            uh.field_Wb.e(lj.field_k, 0);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "tr.J(" + param0 + ',' + param1 + ')');
        }
    }

    final void b(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -27588) {
                break L1;
              } else {
                this.e(-118);
                break L1;
              }
            }
            if (!this.field_o) {
              throw new IllegalStateException();
            } else {
              uh.field_Wb.j(61, param0 + 27710);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2), "tr.N(" + param0 + ')');
        }
    }

    final void b(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            if (this.field_o) {
              L1: {
                uh.field_Wb.j(60, 123);
                if (param0) {
                  break L1;
                } else {
                  this.e(113);
                  break L1;
                }
              }
              break L0;
            } else {
              throw new IllegalStateException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2), "tr.P(" + param0 + ')');
        }
    }

    public static void a(boolean param0) {
        field_l = null;
        field_O = null;
        field_d = null;
        if (param0) {
            return;
        }
        try {
            field_e = null;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "tr.L(" + param0 + ')');
        }
    }

    final void a(boolean param0, boolean param1) {
        am stackIn_463_0 = null;
        bh stackIn_463_1 = null;
        int stackIn_463_2 = 0;
        am stackIn_464_0 = null;
        bh stackIn_464_1 = null;
        int stackIn_464_2 = 0;
        am stackIn_466_0 = null;
        bh stackIn_466_1 = null;
        int stackIn_466_2 = 0;
        am stackIn_467_0 = null;
        bh stackIn_467_1 = null;
        int stackIn_467_2 = 0;
        am stackIn_469_0 = null;
        bh stackIn_469_1 = null;
        int stackIn_469_2 = 0;
        am stackIn_471_0 = null;
        bh stackIn_471_1 = null;
        int stackIn_471_2 = 0;
        am stackIn_472_0 = null;
        bh stackIn_472_1 = null;
        int stackIn_472_2 = 0;
        int stackIn_472_3 = 0;
        hd stackIn_533_0 = null;
        hd stackIn_535_0 = null;
        hd stackIn_537_0 = null;
        hd stackIn_538_0 = null;
        int stackIn_538_1 = 0;
        int stackIn_607_0 = 0;
        Throwable caughtException = null;
        int statePc = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        long var5_long = 0L;
        int var6 = 0;
        long var7_long = 0L;
        int var7 = 0;
        long var9 = 0L;
        float var11 = 0.0f;
        int var12 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = Vertigo2.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if ((this.field_B ^ -1) > -1) {
                        statePc = 172;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var3_int = this.field_o ? 1 : 0;
                    var4 = this.field_D.field_l[this.field_B].field_W;
                    if (var3_int != 0) {
                        statePc = 5;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var4 = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (!ln.field_d.field_c) {
                        statePc = 10;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (var12 == 0) {
                        statePc = 172;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var5 = (de.field_f ^ ln.field_d.field_s) % 8;
                    if (0 != var5) {
                        statePc = 14;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    c.field_h = c.field_h - 1;
                    gi.field_u = gi.field_u + aj.field_e;
                    if (var12 == 0) {
                        statePc = 55;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (1 != var5) {
                        statePc = 20;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    gi.field_u = gi.field_u + c.field_h;
                    aj.field_e = aj.field_e - 1;
                    if (var12 == 0) {
                        statePc = 55;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (-3 == (var5 ^ -1)) {
                        statePc = 53;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if ((var5 ^ -1) != -4) {
                        statePc = 29;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    gi.field_u = gi.field_u - c.field_h;
                    aj.field_e = aj.field_e + 1;
                    if (var12 == 0) {
                        statePc = 55;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (-5 == (var5 ^ -1)) {
                        statePc = 50;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if ((var5 ^ -1) == -6) {
                        statePc = 47;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (var5 != 6) {
                        statePc = 41;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    pn.field_R = pn.field_R - aj.field_e;
                    c.field_h = c.field_h - 1;
                    if (var12 == 0) {
                        statePc = 55;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (7 == var5) {
                        statePc = 46;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 46: {
                    pn.field_R = pn.field_R - c.field_h;
                    aj.field_e = aj.field_e - 1;
                    if (var12 == 0) {
                        statePc = 55;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    pn.field_R = pn.field_R + c.field_h;
                    aj.field_e = aj.field_e + 1;
                    if (var12 == 0) {
                        statePc = 55;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    c.field_h = c.field_h + 1;
                    pn.field_R = pn.field_R + aj.field_e;
                    if (var12 == 0) {
                        statePc = 55;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    gi.field_u = gi.field_u - aj.field_e;
                    c.field_h = c.field_h + 1;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    var5 = (ln.field_d.field_s ^ de.field_f - -var4) % 5;
                    if (0 == var5) {
                        statePc = 80;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    if (1 == var5) {
                        statePc = 77;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    if (2 == var5) {
                        statePc = 74;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    if (-4 == (var5 ^ -1)) {
                        statePc = 71;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    if ((var5 ^ -1) != -5) {
                        statePc = 82;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    re.field_j = re.field_j - 1;
                    sk.field_b = sk.field_b - ki.field_c;
                    if (var12 == 0) {
                        statePc = 82;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    re.field_j = re.field_j + 1;
                    sk.field_b = sk.field_b + ki.field_c;
                    if (var12 == 0) {
                        statePc = 82;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    ki.field_c = ki.field_c - 1;
                    sk.field_b = sk.field_b - re.field_j;
                    if (var12 == 0) {
                        statePc = 82;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    sk.field_b = sk.field_b + re.field_j;
                    ki.field_c = ki.field_c + 1;
                    if (var12 == 0) {
                        statePc = 82;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    qr.field_j = qr.field_j | ki.field_c + sk.field_b << 1159385713;
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    var5 = (gi.field_u - -(de.field_f * aj.field_e)) % 8;
                    if (0 == var5) {
                        statePc = 125;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    if (var5 == 1) {
                        statePc = 122;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    if (var5 != 2) {
                        statePc = 92;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    f.field_B = f.field_B + ca.field_g;
                    df.field_k = df.field_k + 1;
                    if (var12 == 0) {
                        statePc = 127;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if (3 != var5) {
                        statePc = 98;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    ca.field_g = ca.field_g + 1;
                    f.field_B = f.field_B + df.field_k;
                    if (var12 == 0) {
                        statePc = 127;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    if (var5 != 4) {
                        statePc = 104;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    df.field_k = df.field_k + 1;
                    hj.field_c = hj.field_c + ca.field_g;
                    if (var12 == 0) {
                        statePc = 127;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    if ((var5 ^ -1) == -6) {
                        statePc = 119;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    if (-7 == (var5 ^ -1)) {
                        statePc = 116;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    if (-8 == (var5 ^ -1)) {
                        statePc = 115;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 115: {
                    ca.field_g = ca.field_g - 1;
                    hj.field_c = hj.field_c - df.field_k;
                    if (var12 == 0) {
                        statePc = 127;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    df.field_k = df.field_k - 1;
                    hj.field_c = hj.field_c - ca.field_g;
                    if (var12 == 0) {
                        statePc = 127;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    hj.field_c = hj.field_c + df.field_k;
                    ca.field_g = ca.field_g + 1;
                    if (var12 == 0) {
                        statePc = 127;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    f.field_B = f.field_B - df.field_k;
                    ca.field_g = ca.field_g - 1;
                    if (var12 == 0) {
                        statePc = 127;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    df.field_k = df.field_k - 1;
                    f.field_B = f.field_B - ca.field_g;
                    statePc = 127;
                    continue stateLoop;
                }
                case 127: {
                    if (0 == var5) {
                        statePc = 170;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    if (1 != var5) {
                        statePc = 134;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    mc.field_e = mc.field_e - sl.field_l;
                    ci.field_b = ci.field_b - 1;
                    if (var12 == 0) {
                        statePc = 172;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    if (var5 != 2) {
                        statePc = 140;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    mc.field_e = mc.field_e + ci.field_b;
                    sl.field_l = sl.field_l + 1;
                    if (var12 == 0) {
                        statePc = 172;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    if (-4 != (var5 ^ -1)) {
                        statePc = 146;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    ci.field_b = ci.field_b + 1;
                    mc.field_e = mc.field_e + sl.field_l;
                    if (var12 == 0) {
                        statePc = 172;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    if (var5 == 4) {
                        statePc = 167;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    if ((var5 ^ -1) != -6) {
                        statePc = 155;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    ci.field_b = ci.field_b + 1;
                    lj.field_k = lj.field_k + sl.field_l;
                    if (var12 == 0) {
                        statePc = 172;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    if ((var5 ^ -1) == -7) {
                        statePc = 164;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    if ((var5 ^ -1) != -8) {
                        statePc = 172;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    lj.field_k = lj.field_k - sl.field_l;
                    ci.field_b = ci.field_b - 1;
                    if (var12 == 0) {
                        statePc = 172;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 164: {
                    lj.field_k = lj.field_k - ci.field_b;
                    sl.field_l = sl.field_l - 1;
                    if (var12 == 0) {
                        statePc = 172;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    lj.field_k = lj.field_k + ci.field_b;
                    sl.field_l = sl.field_l + 1;
                    if (var12 == 0) {
                        statePc = 172;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    mc.field_e = mc.field_e - ci.field_b;
                    sl.field_l = sl.field_l - 1;
                    statePc = 172;
                    continue stateLoop;
                }
                case 172: {
                    if ((this.field_D.field_r.h(9979) ^ -1) != -1) {
                        statePc = 178;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    if (-101 >= (this.field_D.field_r.field_n ^ -1)) {
                        statePc = 178;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    bm.a(rf.field_o, false, 4);
                    statePc = 178;
                    continue stateLoop;
                }
                case 178: {
                    var3_int = this.field_D.b(-6133);
                    if (null != fo.field_e) {
                        statePc = 185;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 179: {
                    if (-2 == (this.field_D.field_r.h(9979) ^ -1)) {
                        statePc = 184;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 184: {
                    bm.a(up.field_B[var3_int % up.field_B.length], false, 4);
                    statePc = 185;
                    continue stateLoop;
                }
                case 185: {
                    this.field_s = this.field_s - 1;
                    if ((this.field_s ^ -1) == -1) {
                        statePc = 188;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 188: {
                    this.field_y = this.field_y + (this.field_D.field_q + -this.field_N);
                    this.field_s = 50;
                    this.field_J = this.field_J + 1;
                    this.field_N = this.field_D.field_q;
                    statePc = 189;
                    continue stateLoop;
                }
                case 189: {
                    if (!this.field_o) {
                        statePc = 239;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    var4 = -this.field_M + this.field_u;
                    if ((this.field_z.c(true) ^ -1) >= -1) {
                        statePc = 194;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    if (var4 >= 10) {
                        statePc = 204;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    if (3 >= this.field_z.c(true)) {
                        statePc = 205;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    if ((this.field_z.c(true) ^ -1) >= -4) {
                        statePc = 205;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 200: {
                    this.a((pp) ((Object) this.field_z.b((byte) -43)), (byte) 11);
                    if (var12 != 0) {
                        statePc = 242;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    if (var12 == 0) {
                        statePc = 197;
                    } else {
                        statePc = 204;
                    }
                    continue stateLoop;
                }
                case 204: {
                    this.a((pp) ((Object) this.field_z.b((byte) -43)), (byte) 11);
                    statePc = 205;
                    continue stateLoop;
                }
                case 205: {
                    var5_long = gk.a(100);
                    var7_long = var5_long - this.field_j;
                    var9 = (long)(-400 + 20 * var4);
                    if ((var9 ^ -1L) <= (var7_long ^ -1L)) {
                        statePc = 209;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 206: {
                    this.field_E = this.field_E + 0.009999999776482582f;
                    if (var12 == 0) {
                        statePc = 226;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    if (var9 > var7_long) {
                        statePc = 224;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 212: {
                    if (this.field_E >= 1.0f) {
                        statePc = 218;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 215: {
                    this.field_E = this.field_E + 0.009999999776482582f;
                    if (var12 == 0) {
                        statePc = 226;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 218: {
                    if (this.field_E > 1.0f) {
                        statePc = 223;
                    } else {
                        statePc = 226;
                    }
                    continue stateLoop;
                }
                case 223: {
                    this.field_E = this.field_E - 0.009999999776482582f;
                    if (var12 == 0) {
                        statePc = 226;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 224: {
                    this.field_E = this.field_E - 0.009999999776482582f;
                    statePc = 226;
                    continue stateLoop;
                }
                case 226: {
                    var11 = -1.0f + this.field_E;
                    if (var11 * var11 <= 0.00009999999747378752f) {
                        statePc = 229;
                    } else {
                        statePc = 230;
                    }
                    continue stateLoop;
                }
                case 229: {
                    this.field_E = 1.0f;
                    statePc = 230;
                    continue stateLoop;
                }
                case 230: {
                    if (this.field_E > 5.0f) {
                        statePc = 233;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 233: {
                    this.field_E = 5.0f;
                    statePc = 234;
                    continue stateLoop;
                }
                case 234: {
                    if (this.field_E < 0.009999999776482582f) {
                        statePc = 237;
                    } else {
                        statePc = 238;
                    }
                    continue stateLoop;
                }
                case 237: {
                    this.field_E = 0.009999999776482582f;
                    statePc = 238;
                    continue stateLoop;
                }
                case 238: {
                    if (var12 == 0) {
                        statePc = 241;
                    } else {
                        statePc = 239;
                    }
                    continue stateLoop;
                }
                case 239: {
                    this.field_E = 1.0f;
                    statePc = 241;
                    continue stateLoop;
                }
                case 241: {
                    this.field_I = this.field_I + this.field_E;
                    var4 = 0;
                    statePc = 242;
                    continue stateLoop;
                }
                case 242: {
                    if (param1) {
                        statePc = 245;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 243: {
                    this.a((mi) null, 48);
                    statePc = 245;
                    continue stateLoop;
                }
                case 245: {
                    if (!param0) {
                        statePc = 462;
                    } else {
                        statePc = 246;
                    }
                    continue stateLoop;
                }
                case 246: {
                    if (!this.field_o) {
                        statePc = 252;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 249: {
                    if (il.field_a) {
                        statePc = 252;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 252: {
                    if (!tf.a((byte) 43)) {
                        statePc = 255;
                    } else {
                        statePc = 428;
                    }
                    continue stateLoop;
                }
                case 255: {
                    if (kf.field_c == 1) {
                        statePc = 258;
                    } else {
                        statePc = 428;
                    }
                    continue stateLoop;
                }
                case 258: {
                    if (-1 >= (this.field_B ^ -1)) {
                        statePc = 261;
                    } else {
                        statePc = 428;
                    }
                    continue stateLoop;
                }
                case 261: {
                    var5 = this.field_o ? 1 : 0;
                    var6 = this.field_D.field_l[this.field_B].field_W;
                    if (var5 != 0) {
                        statePc = 264;
                    } else {
                        statePc = 265;
                    }
                    continue stateLoop;
                }
                case 264: {
                    var6 = 0;
                    statePc = 265;
                    continue stateLoop;
                }
                case 265: {
                    if (ln.field_d.field_c) {
                        statePc = 428;
                    } else {
                        statePc = 266;
                    }
                    continue stateLoop;
                }
                case 266: {
                    var7 = (ln.field_d.field_s ^ de.field_f) % 8;
                    if (0 == var7) {
                        statePc = 309;
                    } else {
                        statePc = 267;
                    }
                    continue stateLoop;
                }
                case 267: {
                    if ((var7 ^ -1) == -2) {
                        statePc = 306;
                    } else {
                        statePc = 270;
                    }
                    continue stateLoop;
                }
                case 270: {
                    if (-3 == (var7 ^ -1)) {
                        statePc = 303;
                    } else {
                        statePc = 273;
                    }
                    continue stateLoop;
                }
                case 273: {
                    if (var7 != 3) {
                        statePc = 279;
                    } else {
                        statePc = 276;
                    }
                    continue stateLoop;
                }
                case 276: {
                    gi.field_u = gi.field_u - c.field_h;
                    aj.field_e = aj.field_e + 1;
                    if (var12 == 0) {
                        statePc = 311;
                    } else {
                        statePc = 279;
                    }
                    continue stateLoop;
                }
                case 279: {
                    if ((var7 ^ -1) != -5) {
                        statePc = 285;
                    } else {
                        statePc = 282;
                    }
                    continue stateLoop;
                }
                case 282: {
                    c.field_h = c.field_h + 1;
                    pn.field_R = pn.field_R + aj.field_e;
                    if (var12 == 0) {
                        statePc = 311;
                    } else {
                        statePc = 285;
                    }
                    continue stateLoop;
                }
                case 285: {
                    if ((var7 ^ -1) == -6) {
                        statePc = 300;
                    } else {
                        statePc = 288;
                    }
                    continue stateLoop;
                }
                case 288: {
                    if (-7 != (var7 ^ -1)) {
                        statePc = 294;
                    } else {
                        statePc = 291;
                    }
                    continue stateLoop;
                }
                case 291: {
                    pn.field_R = pn.field_R - aj.field_e;
                    c.field_h = c.field_h - 1;
                    if (var12 == 0) {
                        statePc = 311;
                    } else {
                        statePc = 294;
                    }
                    continue stateLoop;
                }
                case 294: {
                    if (7 != var7) {
                        statePc = 311;
                    } else {
                        statePc = 297;
                    }
                    continue stateLoop;
                }
                case 297: {
                    pn.field_R = pn.field_R - c.field_h;
                    aj.field_e = aj.field_e - 1;
                    if (var12 == 0) {
                        statePc = 311;
                    } else {
                        statePc = 300;
                    }
                    continue stateLoop;
                }
                case 300: {
                    pn.field_R = pn.field_R + c.field_h;
                    aj.field_e = aj.field_e + 1;
                    if (var12 == 0) {
                        statePc = 311;
                    } else {
                        statePc = 303;
                    }
                    continue stateLoop;
                }
                case 303: {
                    c.field_h = c.field_h + 1;
                    gi.field_u = gi.field_u - aj.field_e;
                    if (var12 == 0) {
                        statePc = 311;
                    } else {
                        statePc = 306;
                    }
                    continue stateLoop;
                }
                case 306: {
                    gi.field_u = gi.field_u + c.field_h;
                    aj.field_e = aj.field_e - 1;
                    if (var12 == 0) {
                        statePc = 311;
                    } else {
                        statePc = 309;
                    }
                    continue stateLoop;
                }
                case 309: {
                    c.field_h = c.field_h - 1;
                    gi.field_u = gi.field_u + aj.field_e;
                    statePc = 311;
                    continue stateLoop;
                }
                case 311: {
                    var7 = (ln.field_d.field_s ^ var6 + de.field_f) % 5;
                    if (var7 != 0) {
                        statePc = 315;
                    } else {
                        statePc = 312;
                    }
                    continue stateLoop;
                }
                case 312: {
                    qr.field_j = qr.field_j | sk.field_b - -ki.field_c << -693906703;
                    if (var12 == 0) {
                        statePc = 338;
                    } else {
                        statePc = 315;
                    }
                    continue stateLoop;
                }
                case 315: {
                    if (-2 == (var7 ^ -1)) {
                        statePc = 336;
                    } else {
                        statePc = 318;
                    }
                    continue stateLoop;
                }
                case 318: {
                    if (-3 != (var7 ^ -1)) {
                        statePc = 324;
                    } else {
                        statePc = 321;
                    }
                    continue stateLoop;
                }
                case 321: {
                    sk.field_b = sk.field_b - re.field_j;
                    ki.field_c = ki.field_c - 1;
                    if (var12 == 0) {
                        statePc = 338;
                    } else {
                        statePc = 324;
                    }
                    continue stateLoop;
                }
                case 324: {
                    if (3 != var7) {
                        statePc = 330;
                    } else {
                        statePc = 327;
                    }
                    continue stateLoop;
                }
                case 327: {
                    sk.field_b = sk.field_b + ki.field_c;
                    re.field_j = re.field_j + 1;
                    if (var12 == 0) {
                        statePc = 338;
                    } else {
                        statePc = 330;
                    }
                    continue stateLoop;
                }
                case 330: {
                    if ((var7 ^ -1) != -5) {
                        statePc = 338;
                    } else {
                        statePc = 333;
                    }
                    continue stateLoop;
                }
                case 333: {
                    sk.field_b = sk.field_b - ki.field_c;
                    re.field_j = re.field_j - 1;
                    if (var12 == 0) {
                        statePc = 338;
                    } else {
                        statePc = 336;
                    }
                    continue stateLoop;
                }
                case 336: {
                    ki.field_c = ki.field_c + 1;
                    sk.field_b = sk.field_b + re.field_j;
                    statePc = 338;
                    continue stateLoop;
                }
                case 338: {
                    var7 = (gi.field_u - -(de.field_f * aj.field_e)) % 8;
                    if (-1 == (var7 ^ -1)) {
                        statePc = 381;
                    } else {
                        statePc = 339;
                    }
                    continue stateLoop;
                }
                case 339: {
                    if ((var7 ^ -1) == -2) {
                        statePc = 378;
                    } else {
                        statePc = 342;
                    }
                    continue stateLoop;
                }
                case 342: {
                    if (-3 != (var7 ^ -1)) {
                        statePc = 348;
                    } else {
                        statePc = 345;
                    }
                    continue stateLoop;
                }
                case 345: {
                    df.field_k = df.field_k + 1;
                    f.field_B = f.field_B + ca.field_g;
                    if (var12 == 0) {
                        statePc = 383;
                    } else {
                        statePc = 348;
                    }
                    continue stateLoop;
                }
                case 348: {
                    if (var7 != 3) {
                        statePc = 354;
                    } else {
                        statePc = 351;
                    }
                    continue stateLoop;
                }
                case 351: {
                    ca.field_g = ca.field_g + 1;
                    f.field_B = f.field_B + df.field_k;
                    if (var12 == 0) {
                        statePc = 383;
                    } else {
                        statePc = 354;
                    }
                    continue stateLoop;
                }
                case 354: {
                    if (var7 == 4) {
                        statePc = 375;
                    } else {
                        statePc = 357;
                    }
                    continue stateLoop;
                }
                case 357: {
                    if (-6 != (var7 ^ -1)) {
                        statePc = 363;
                    } else {
                        statePc = 360;
                    }
                    continue stateLoop;
                }
                case 360: {
                    ca.field_g = ca.field_g + 1;
                    hj.field_c = hj.field_c + df.field_k;
                    if (var12 == 0) {
                        statePc = 383;
                    } else {
                        statePc = 363;
                    }
                    continue stateLoop;
                }
                case 363: {
                    if (var7 != 6) {
                        statePc = 369;
                    } else {
                        statePc = 366;
                    }
                    continue stateLoop;
                }
                case 366: {
                    df.field_k = df.field_k - 1;
                    hj.field_c = hj.field_c - ca.field_g;
                    if (var12 == 0) {
                        statePc = 383;
                    } else {
                        statePc = 369;
                    }
                    continue stateLoop;
                }
                case 369: {
                    if (7 != var7) {
                        statePc = 383;
                    } else {
                        statePc = 372;
                    }
                    continue stateLoop;
                }
                case 372: {
                    ca.field_g = ca.field_g - 1;
                    hj.field_c = hj.field_c - df.field_k;
                    if (var12 == 0) {
                        statePc = 383;
                    } else {
                        statePc = 375;
                    }
                    continue stateLoop;
                }
                case 375: {
                    df.field_k = df.field_k + 1;
                    hj.field_c = hj.field_c + ca.field_g;
                    if (var12 == 0) {
                        statePc = 383;
                    } else {
                        statePc = 378;
                    }
                    continue stateLoop;
                }
                case 378: {
                    ca.field_g = ca.field_g - 1;
                    f.field_B = f.field_B - df.field_k;
                    if (var12 == 0) {
                        statePc = 383;
                    } else {
                        statePc = 381;
                    }
                    continue stateLoop;
                }
                case 381: {
                    f.field_B = f.field_B - ca.field_g;
                    df.field_k = df.field_k - 1;
                    statePc = 383;
                    continue stateLoop;
                }
                case 383: {
                    if (0 != var7) {
                        statePc = 387;
                    } else {
                        statePc = 384;
                    }
                    continue stateLoop;
                }
                case 384: {
                    mc.field_e = mc.field_e - ci.field_b;
                    sl.field_l = sl.field_l - 1;
                    if (var12 == 0) {
                        statePc = 428;
                    } else {
                        statePc = 387;
                    }
                    continue stateLoop;
                }
                case 387: {
                    if (1 == var7) {
                        statePc = 426;
                    } else {
                        statePc = 390;
                    }
                    continue stateLoop;
                }
                case 390: {
                    if (var7 == 2) {
                        statePc = 423;
                    } else {
                        statePc = 393;
                    }
                    continue stateLoop;
                }
                case 393: {
                    if ((var7 ^ -1) == -4) {
                        statePc = 420;
                    } else {
                        statePc = 396;
                    }
                    continue stateLoop;
                }
                case 396: {
                    if ((var7 ^ -1) == -5) {
                        statePc = 417;
                    } else {
                        statePc = 399;
                    }
                    continue stateLoop;
                }
                case 399: {
                    if (5 != var7) {
                        statePc = 405;
                    } else {
                        statePc = 402;
                    }
                    continue stateLoop;
                }
                case 402: {
                    ci.field_b = ci.field_b + 1;
                    lj.field_k = lj.field_k + sl.field_l;
                    if (var12 == 0) {
                        statePc = 428;
                    } else {
                        statePc = 405;
                    }
                    continue stateLoop;
                }
                case 405: {
                    if (var7 != 6) {
                        statePc = 411;
                    } else {
                        statePc = 408;
                    }
                    continue stateLoop;
                }
                case 408: {
                    sl.field_l = sl.field_l - 1;
                    lj.field_k = lj.field_k - ci.field_b;
                    if (var12 == 0) {
                        statePc = 428;
                    } else {
                        statePc = 411;
                    }
                    continue stateLoop;
                }
                case 411: {
                    if ((var7 ^ -1) != -8) {
                        statePc = 428;
                    } else {
                        statePc = 414;
                    }
                    continue stateLoop;
                }
                case 414: {
                    lj.field_k = lj.field_k - sl.field_l;
                    ci.field_b = ci.field_b - 1;
                    if (var12 == 0) {
                        statePc = 428;
                    } else {
                        statePc = 417;
                    }
                    continue stateLoop;
                }
                case 417: {
                    lj.field_k = lj.field_k + ci.field_b;
                    sl.field_l = sl.field_l + 1;
                    if (var12 == 0) {
                        statePc = 428;
                    } else {
                        statePc = 420;
                    }
                    continue stateLoop;
                }
                case 420: {
                    ci.field_b = ci.field_b + 1;
                    mc.field_e = mc.field_e + sl.field_l;
                    if (var12 == 0) {
                        statePc = 428;
                    } else {
                        statePc = 423;
                    }
                    continue stateLoop;
                }
                case 423: {
                    sl.field_l = sl.field_l + 1;
                    mc.field_e = mc.field_e + ci.field_b;
                    if (var12 == 0) {
                        statePc = 428;
                    } else {
                        statePc = 426;
                    }
                    continue stateLoop;
                }
                case 426: {
                    ci.field_b = ci.field_b - 1;
                    mc.field_e = mc.field_e - sl.field_l;
                    statePc = 428;
                    continue stateLoop;
                }
                case 428: {
                    var5 = 0;
                    if (!this.field_o) {
                        statePc = 435;
                    } else {
                        statePc = 429;
                    }
                    continue stateLoop;
                }
                case 429: {
                    if (il.field_a) {
                        statePc = 461;
                    } else {
                        statePc = 432;
                    }
                    continue stateLoop;
                }
                case 432: {
                    if (tf.a((byte) 49)) {
                        statePc = 461;
                    } else {
                        statePc = 435;
                    }
                    continue stateLoop;
                }
                case 435: {
                    var6 = this.field_G.a((byte) -126);
                    if (cr.field_eb[s.field_y]) {
                        statePc = 441;
                    } else {
                        statePc = 436;
                    }
                    continue stateLoop;
                }
                case 436: {
                    if (cr.field_eb[am.field_t]) {
                        statePc = 441;
                    } else {
                        statePc = 442;
                    }
                    continue stateLoop;
                }
                case 441: {
                    var5 = var5 | lp.field_B[(var6 + 0) % 4];
                    statePc = 442;
                    continue stateLoop;
                }
                case 442: {
                    if (cr.field_eb[ga.field_gb]) {
                        statePc = 448;
                    } else {
                        statePc = 443;
                    }
                    continue stateLoop;
                }
                case 443: {
                    if (cr.field_eb[od.field_Mb]) {
                        statePc = 448;
                    } else {
                        statePc = 449;
                    }
                    continue stateLoop;
                }
                case 448: {
                    var5 = var5 | lp.field_B[(var6 + 2) % 4];
                    statePc = 449;
                    continue stateLoop;
                }
                case 449: {
                    if (cr.field_eb[q.field_u]) {
                        statePc = 453;
                    } else {
                        statePc = 450;
                    }
                    continue stateLoop;
                }
                case 450: {
                    if (!cr.field_eb[pn.field_O]) {
                        statePc = 454;
                    } else {
                        statePc = 453;
                    }
                    continue stateLoop;
                }
                case 453: {
                    var5 = var5 | lp.field_B[(5 + var6) % 4];
                    statePc = 454;
                    continue stateLoop;
                }
                case 454: {
                    if (cr.field_eb[t.field_g]) {
                        statePc = 460;
                    } else {
                        statePc = 455;
                    }
                    continue stateLoop;
                }
                case 455: {
                    if (cr.field_eb[ii.field_E]) {
                        statePc = 460;
                    } else {
                        statePc = 461;
                    }
                    continue stateLoop;
                }
                case 460: {
                    var5 = var5 | lp.field_B[(var6 + 3) % 4];
                    statePc = 461;
                    continue stateLoop;
                }
                case 461: {
                    var4 = this.field_C | var5 << 911385730;
                    statePc = 462;
                    continue stateLoop;
                }
                case 462: {
                    stackIn_469_0 = this.field_G;
                    stackIn_463_0 = stackIn_469_0;
                    stackIn_469_1 = this.field_m;
                    stackIn_463_1 = stackIn_469_1;
                    stackIn_469_2 = -120;
                    stackIn_463_2 = stackIn_469_2;
                    if (!this.field_o) {
                        statePc = 469;
                    } else {
                        statePc = 463;
                    }
                    continue stateLoop;
                }
                case 463: {
                    stackIn_471_0 = (am) ((Object) stackIn_463_0);
                    stackIn_464_0 = stackIn_471_0;
                    stackIn_471_1 = (bh) ((Object) stackIn_463_1);
                    stackIn_464_1 = stackIn_471_1;
                    stackIn_471_2 = stackIn_463_2;
                    stackIn_464_2 = stackIn_471_2;
                    if (il.field_a) {
                        statePc = 471;
                    } else {
                        statePc = 464;
                    }
                    continue stateLoop;
                }
                case 464: {
                    stackIn_466_0 = (am) ((Object) stackIn_464_0);
                    stackIn_466_1 = (bh) ((Object) stackIn_464_1);
                    stackIn_466_2 = stackIn_464_2;
                    statePc = 466;
                    continue stateLoop;
                }
                case 466: {
                    stackIn_471_0 = (am) ((Object) stackIn_466_0);
                    stackIn_467_0 = stackIn_471_0;
                    stackIn_471_1 = (bh) ((Object) stackIn_466_1);
                    stackIn_467_1 = stackIn_471_1;
                    stackIn_471_2 = stackIn_466_2;
                    stackIn_467_2 = stackIn_471_2;
                    if (tf.a((byte) 65)) {
                        statePc = 471;
                    } else {
                        statePc = 467;
                    }
                    continue stateLoop;
                }
                case 467: {
                    stackIn_469_0 = (am) ((Object) stackIn_467_0);
                    stackIn_469_1 = (bh) ((Object) stackIn_467_1);
                    stackIn_469_2 = stackIn_467_2;
                    statePc = 469;
                    continue stateLoop;
                }
                case 469: {
                    stackIn_472_0 = (am) ((Object) stackIn_469_0);
                    stackIn_472_1 = (bh) ((Object) stackIn_469_1);
                    stackIn_472_2 = stackIn_469_2;
                    stackIn_472_3 = 1;
                    statePc = 472;
                    continue stateLoop;
                }
                case 471: {
                    stackIn_472_0 = (am) ((Object) stackIn_471_0);
                    stackIn_472_1 = (bh) ((Object) stackIn_471_1);
                    stackIn_472_2 = stackIn_471_2;
                    stackIn_472_3 = 0;
                    statePc = 472;
                    continue stateLoop;
                }
                case 472: {
                    ((am) (Object) stackIn_472_0).a(stackIn_472_1, (byte) stackIn_472_2, stackIn_472_3 != 0, this.field_n);
                    if (!this.field_D.field_r.f(17940)) {
                        statePc = 475;
                    } else {
                        statePc = 476;
                    }
                    continue stateLoop;
                }
                case 475: {
                    var4 = 0;
                    statePc = 476;
                    continue stateLoop;
                }
                case 476: {
                    if (this.field_o) {
                        statePc = 529;
                    } else {
                        statePc = 477;
                    }
                    continue stateLoop;
                }
                case 477: {
                    this.field_C = 0;
                    if (!this.field_w) {
                        statePc = 492;
                    } else {
                        statePc = 480;
                    }
                    continue stateLoop;
                }
                case 480: {
                    if ((jq.a((byte) 29) ^ -1) <= -11) {
                        statePc = 492;
                    } else {
                        statePc = 483;
                    }
                    continue stateLoop;
                }
                case 483: {
                    if (-101 <= (this.field_D.field_r.field_n ^ -1)) {
                        statePc = 492;
                    } else {
                        statePc = 486;
                    }
                    continue stateLoop;
                }
                case 486: {
                    if ((this.field_D.field_r.h(9979) ^ -1) == -2) {
                        statePc = 491;
                    } else {
                        statePc = 492;
                    }
                    continue stateLoop;
                }
                case 491: {
                    this.field_w = false;
                    statePc = 492;
                    continue stateLoop;
                }
                case 492: {
                    this.field_L[this.field_B] = var4;
                    var5 = var3_int;
                    this.field_D.a(this.field_L, 20, this.field_F);
                    var3_int = this.field_D.b(-6133);
                    if (var5 == var3_int) {
                        statePc = 499;
                    } else {
                        statePc = 493;
                    }
                    continue stateLoop;
                }
                case 493: {
                    if (-11 < (var3_int ^ -1)) {
                        statePc = 498;
                    } else {
                        statePc = 499;
                    }
                    continue stateLoop;
                }
                case 498: {
                    this.field_w = true;
                    kh.a(var3_int, (byte) -84);
                    statePc = 499;
                    continue stateLoop;
                }
                case 499: {
                    if ((this.field_D.field_j ^ -1) == -1) {
                        statePc = 502;
                    } else {
                        statePc = 519;
                    }
                    continue stateLoop;
                }
                case 502: {
                    if (10 == var3_int) {
                        statePc = 505;
                    } else {
                        statePc = 506;
                    }
                    continue stateLoop;
                }
                case 505: {
                    this.a(1220, 0, 255);
                    statePc = 506;
                    continue stateLoop;
                }
                case 506: {
                    if (var3_int == 20) {
                        statePc = 509;
                    } else {
                        statePc = 510;
                    }
                    continue stateLoop;
                }
                case 509: {
                    this.a(1220, 2, 253);
                    statePc = 510;
                    continue stateLoop;
                }
                case 510: {
                    if (var3_int != 30) {
                        statePc = 513;
                    } else {
                        statePc = 511;
                    }
                    continue stateLoop;
                }
                case 511: {
                    this.a(1220, 4, 251);
                    statePc = 513;
                    continue stateLoop;
                }
                case 513: {
                    if (var3_int != 40) {
                        statePc = 516;
                    } else {
                        statePc = 514;
                    }
                    continue stateLoop;
                }
                case 514: {
                    this.a(1220, 6, 249);
                    statePc = 516;
                    continue stateLoop;
                }
                case 516: {
                    if ((var3_int ^ -1) != -51) {
                        statePc = 519;
                    } else {
                        statePc = 517;
                    }
                    continue stateLoop;
                }
                case 517: {
                    this.a(1220, 8, 247);
                    statePc = 519;
                    continue stateLoop;
                }
                case 519: {
                    if (!this.field_D.c(-3317)) {
                        statePc = 528;
                    } else {
                        statePc = 520;
                    }
                    continue stateLoop;
                }
                case 520: {
                    if (-4 == (this.field_D.field_j ^ -1)) {
                        statePc = 526;
                    } else {
                        statePc = 523;
                    }
                    continue stateLoop;
                }
                case 523: {
                    ln.field_d.a(2, false);
                    lc.field_d = false;
                    an.field_c = true;
                    if (var12 == 0) {
                        statePc = 528;
                    } else {
                        statePc = 526;
                    }
                    continue stateLoop;
                }
                case 526: {
                    gj.a((byte) -78, true, am.field_n, 20);
                    statePc = 528;
                    continue stateLoop;
                }
                case 528: {
                    if (var12 == 0) {
                        statePc = 549;
                    } else {
                        statePc = 529;
                    }
                    continue stateLoop;
                }
                case 529: {
                    if ((this.field_B ^ -1) > -1) {
                        statePc = 539;
                    } else {
                        statePc = 532;
                    }
                    continue stateLoop;
                }
                case 532: {
                    stackIn_537_0 = this.field_a;
                    stackIn_533_0 = stackIn_537_0;
                    if (param1) {
                        statePc = 537;
                    } else {
                        statePc = 533;
                    }
                    continue stateLoop;
                }
                case 533: {
                    stackIn_535_0 = (hd) ((Object) stackIn_533_0);
                    statePc = 535;
                    continue stateLoop;
                }
                case 535: {
                    stackIn_538_0 = (hd) ((Object) stackIn_535_0);
                    stackIn_538_1 = 1;
                    statePc = 538;
                    continue stateLoop;
                }
                case 537: {
                    stackIn_538_0 = (hd) ((Object) stackIn_537_0);
                    stackIn_538_1 = 0;
                    statePc = 538;
                    continue stateLoop;
                }
                case 538: {
                    ((hd) (Object) stackIn_538_0).a(stackIn_538_1 != 0);
                    statePc = 539;
                    continue stateLoop;
                }
                case 539: {
                    if (this.field_I < 1.0f) {
                        statePc = 544;
                    } else {
                        statePc = 540;
                    }
                    continue stateLoop;
                }
                case 540: {
                    this.field_u = this.field_u + 1;
                    this.field_I = this.field_I - 1.0f;
                    if (var12 != 0) {
                        statePc = 547;
                    } else {
                        statePc = 541;
                    }
                    continue stateLoop;
                }
                case 541: {
                    if (var12 == 0) {
                        statePc = 539;
                    } else {
                        statePc = 544;
                    }
                    continue stateLoop;
                }
                case 544: {
                    if (this.field_B >= 0) {
                        statePc = 547;
                    } else {
                        statePc = 548;
                    }
                    continue stateLoop;
                }
                case 547: {
                    this.field_a.a(this.field_u, var4, 7829367);
                    statePc = 548;
                    continue stateLoop;
                }
                case 548: {
                    this.field_C = 0;
                    statePc = 549;
                    continue stateLoop;
                }
                case 549: {
                    if (!this.field_o) {
                        statePc = 568;
                    } else {
                        statePc = 550;
                    }
                    continue stateLoop;
                }
                case 550: {
                    j.field_p = ol.field_D;
                    if (eo.field_o) {
                        statePc = 567;
                    } else {
                        statePc = 553;
                    }
                    continue stateLoop;
                }
                case 553: {
                    if (1 >= wg.field_g) {
                        statePc = 559;
                    } else {
                        statePc = 556;
                    }
                    continue stateLoop;
                }
                case 556: {
                    j.field_p = Vertigo2.a(new String[]{Integer.toString(wg.field_g)}, ao.field_P, -127);
                    if (var12 == 0) {
                        statePc = 567;
                    } else {
                        statePc = 559;
                    }
                    continue stateLoop;
                }
                case 559: {
                    if ((wg.field_g ^ -1) != -2) {
                        statePc = 565;
                    } else {
                        statePc = 562;
                    }
                    continue stateLoop;
                }
                case 562: {
                    j.field_p = ci.field_c;
                    if (var12 == 0) {
                        statePc = 567;
                    } else {
                        statePc = 565;
                    }
                    continue stateLoop;
                }
                case 565: {
                    j.field_p = bl.field_q;
                    statePc = 567;
                    continue stateLoop;
                }
                case 567: {
                    var5 = tk.field_c.c(j.field_p);
                    np.field_Nb = np.field_Nb + ((float)var5 - np.field_Nb) * 0.05000000074505806f;
                    statePc = 568;
                    continue stateLoop;
                }
                case 568: {
                    if (!this.field_o) {
                        statePc = 581;
                    } else {
                        statePc = 569;
                    }
                    continue stateLoop;
                }
                case 569: {
                    if (!param0) {
                        statePc = 581;
                    } else {
                        statePc = 572;
                    }
                    continue stateLoop;
                }
                case 572: {
                    if (tf.a((byte) 86)) {
                        statePc = 581;
                    } else {
                        statePc = 575;
                    }
                    continue stateLoop;
                }
                case 575: {
                    if (!il.field_a) {
                        statePc = 584;
                    } else {
                        statePc = 578;
                    }
                    continue stateLoop;
                }
                case 578: {
                    if (0 > this.field_B) {
                        statePc = 584;
                    } else {
                        statePc = 581;
                    }
                    continue stateLoop;
                }
                case 581: {
                    hj.field_g = false;
                    if (var12 == 0) {
                        statePc = 613;
                    } else {
                        statePc = 584;
                    }
                    continue stateLoop;
                }
                case 584: {
                    hj.field_g = false;
                    var5 = qe.field_W.field_t;
                    if (-1 < (ed.field_n ^ -1)) {
                        statePc = 597;
                    } else {
                        statePc = 585;
                    }
                    continue stateLoop;
                }
                case 585: {
                    if ((float)ed.field_n >= np.field_Nb * 2.0f) {
                        statePc = 597;
                    } else {
                        statePc = 588;
                    }
                    continue stateLoop;
                }
                case 588: {
                    if ((gb.field_d ^ -1) > (-4 + -var5 + td.field_c.field_C ^ -1)) {
                        statePc = 597;
                    } else {
                        statePc = 591;
                    }
                    continue stateLoop;
                }
                case 591: {
                    if (gb.field_d < -4 + td.field_c.field_C) {
                        statePc = 596;
                    } else {
                        statePc = 597;
                    }
                    continue stateLoop;
                }
                case 596: {
                    hj.field_g = true;
                    statePc = 597;
                    continue stateLoop;
                }
                case 597: {
                    if (1 != kf.field_c) {
                        statePc = 613;
                    } else {
                        statePc = 598;
                    }
                    continue stateLoop;
                }
                case 598: {
                    if (!hj.field_g) {
                        statePc = 613;
                    } else {
                        statePc = 601;
                    }
                    continue stateLoop;
                }
                case 601: {
                    if (eo.field_o) {
                        statePc = 606;
                    } else {
                        statePc = 604;
                    }
                    continue stateLoop;
                }
                case 604: {
                    stackIn_607_0 = 1;
                    statePc = 607;
                    continue stateLoop;
                }
                case 606: {
                    stackIn_607_0 = 0;
                    statePc = 607;
                    continue stateLoop;
                }
                case 607: {
                    eo.field_o = stackIn_607_0 != 0;
                    if (eo.field_o) {
                        statePc = 610;
                    } else {
                        statePc = 613;
                    }
                    continue stateLoop;
                }
                case 610: {
                    wg.field_g = 0;
                    statePc = 613;
                    continue stateLoop;
                }
                case 613: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          L0: {
            L1: {
              var2_int = this.field_D.b(-6133);
              if ((qe.field_U.length ^ -1) >= (var2_int ^ -1)) {
                break L1;
              } else {
                if ((this.field_D.field_j ^ -1) != -1) {
                  break L1;
                } else {
                  L2: {
                    if (this.field_w) {
                      var3 = qe.field_U[var2_int];
                      var4 = 320;
                      var5 = tk.field_c.a(var3, var4, 0);
                      var6 = 20;
                      var7 = 20;
                      var8 = 170;
                      rq.a(30 + var5 + 2 * var7, var4 - -(var6 * 2), var8 - var7, -(var4 / 2) + 320 - var6, -62, 150);
                      tk.field_c.a(var3, 320 + -(var4 / 2), var8, var4, var5, 16777215, -1, 1, 1, 0);
                      var8 = var8 + (var7 / 2 + var5);
                      bi.b(320 - (var4 + -30) / 2, var8, var4 + -30, 5921370);
                      if (-101 < (this.field_D.field_r.field_n ^ -1)) {
                        break L2;
                      } else {
                        if (1 == this.field_D.field_r.h(9979)) {
                          var8 += 5;
                          var4 = va.field_s.a(1, bg.field_a);
                          va.field_s.a(bg.field_a, 16777215, -1, 320, var8 + va.field_s.field_k, 2);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                  if (-2 == (this.field_D.field_r.h(9979) ^ -1)) {
                    mo.a(true);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L3: {
              if (param0 > 45) {
                break L3;
              } else {
                this.field_c = true;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2), "tr.A(" + param0 + ')');
        }
    }

    final void a(int param0) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            if (this.field_o) {
              uh.field_Wb.j(59, 119);
              var2_int = -114 / ((45 - param0) / 43);
              break L0;
            } else {
              throw new IllegalStateException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2), "tr.O(" + param0 + ')');
        }
    }

    final void e(int param0) {
        try {
            this.field_G.c((byte) 122);
            if (param0 > -62) {
                this.field_C = 108;
            }
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "tr.D(" + param0 + ')');
        }
    }

    private final void d(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (uh.field_Xb != null) {
                break L1;
              } else {
                if (this.field_D.field_l[this.field_B].field_W <= 0) {
                  break L1;
                } else {
                  if (this.field_c) {
                    break L1;
                  } else {
                    uh.field_Xb = new vi(0, 65535, gi.field_u, pn.field_R, aj.field_e, c.field_h, new int[]{this.field_D.field_l[this.field_B].field_W});
                    if (ag.b(49)) {
                      break L1;
                    } else {
                      nr.a(3, -22754, uh.field_Xb);
                      break L1;
                    }
                  }
                }
              }
            }
            L2: {
              if (param0 == 0) {
                break L2;
              } else {
                this.field_a = (hd) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2), "tr.E(" + param0 + ')');
        }
    }

    final void a(int param0, int param1) {
        if (param0 != 16) {
            return;
        }
        try {
            this.field_r = param1;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "tr.K(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, boolean param1) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 == 2) {
              L1: {
                if (this.field_o) {
                  break L1;
                } else {
                  L2: {
                    if ((this.field_D.field_j ^ -1) != -1) {
                      break L2;
                    } else {
                      this.d(0);
                      break L2;
                    }
                  }
                  L3: {
                    if (ag.b(49)) {
                      break L3;
                    } else {
                      L4: {
                        if ((jq.field_e ^ -1) != -1) {
                          break L4;
                        } else {
                          L5: {
                            if (uh.field_Xb == null) {
                              break L5;
                            } else {
                              var3_int = param1 ? 1 : 0;
                              gj.a((byte) -113, var3_int != 0, am.field_n, 5);
                              if (var4 == 0) {
                                break L1;
                              } else {
                                break L5;
                              }
                            }
                          }
                          L6: {
                            if (j.field_n != null) {
                              break L6;
                            } else {
                              var3_int = param1 ? 1 : 0;
                              gj.a((byte) -85, var3_int != 0, am.field_n, 0);
                              if (var4 == 0) {
                                break L1;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var3_int = param1 ? 1 : 0;
                          gj.a((byte) -100, var3_int != 0, am.field_n, 19);
                          if (var4 == 0) {
                            break L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var3_int = param1 ? 1 : 0;
                      gj.a((byte) -53, var3_int != 0, am.field_n, 9);
                      if (var4 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L7: {
                    L8: {
                      if ((jq.field_e ^ -1) != -1) {
                        break L8;
                      } else {
                        if (uh.field_Xb != null) {
                          break L8;
                        } else {
                          if (mb.field_y != null) {
                            break L8;
                          } else {
                            if (null == j.field_n) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                    }
                    var3_int = param1 ? 1 : 0;
                    gj.a((byte) 100, var3_int != 0, am.field_n, 10);
                    if (var4 == 0) {
                      break L1;
                    } else {
                      break L7;
                    }
                  }
                  var3_int = param1 ? 1 : 0;
                  gj.a((byte) 121, var3_int != 0, am.field_n, 0);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var3), "tr.G(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(pp param0, byte param1) {
        int fieldTemp$0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_48_0 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = Vertigo2.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (10 < this.field_H) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        this.field_H = 0;
                        this.field_x = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param1 == 11) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return;
                }
                case 7: {
                    try {
                        var3_int = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (-11 >= (var3_int ^ -1)) {
                            statePc = 47;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        param0.a(this.field_F, this.field_L, 32);
                        fieldTemp$0 = this.field_r - 1;
                        this.field_r = this.field_r - 1;
                        stackIn_48_0 = fieldTemp$0;
                        stackIn_10_0 = stackIn_48_0;
                        if (var5 != 0) {
                            statePc = 48;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0 >= 0) {
                            statePc = 45;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (!this.field_g) {
                            statePc = 24;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if ((var3_int ^ -1) != -10) {
                            statePc = 24;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (param0.field_z == this.field_D.field_r.g(param1 ^ 116)) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        lf.d(param1 + 77, 0);
                        rm.b((byte) -79);
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (this.field_B < 0) {
                            statePc = 30;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (!this.field_F[this.field_B]) {
                            statePc = 30;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        this.field_x = this.field_x + 1;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        this.field_D.a(this.field_L, param1 ^ 31, this.field_F);
                        if (this.field_B < 0) {
                            statePc = 39;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (-2 != (this.field_D.field_j ^ -1)) {
                            statePc = 39;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (15 > this.field_D.b(-6133) + -(this.field_D.field_i ^ 4012)) {
                            statePc = 39;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        this.a(param1 ^ 1231, 10, 245);
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var4 = 0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if ((this.field_D.field_l.length ^ -1) >= (var4 ^ -1)) {
                            statePc = 45;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        this.field_K[var3_int][var4].a(this.field_D.field_r.field_f[var4], 16777215);
                        var4++;
                        if (var5 != 0) {
                            statePc = 46;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var5 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var3_int++;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var5 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        this.field_H = this.field_H + 1;
                        stackIn_48_0 = 0;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (stackIn_48_0 > this.field_B) {
                            statePc = 58;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (!param0.b(false, this.field_B)) {
                            statePc = 55;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        this.field_k = this.field_a.a((byte) -17, param0.b(this.field_B, -96));
                        this.field_M = 10 + this.field_k + (param0.a((byte) 76, this.field_B) - 1);
                        this.field_j = gk.a(param1 ^ 52);
                        if (var5 == 0) {
                            statePc = 60;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        this.field_M = this.field_M + (param0.a((byte) 76, this.field_B) - 1);
                        if (var5 == 0) {
                            statePc = 60;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        this.field_j = gk.a(param1 + 83);
                        this.field_M = this.field_M + 10;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        this.field_t = 0;
                        this.field_g = true;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 62: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_65_0 = (RuntimeException) (var3);
                    stackIn_63_0 = stackIn_65_0;
                    stackIn_65_1 = new StringBuilder().append("tr.C(");
                    stackIn_63_1 = stackIn_65_1;
                    if (param0 == null) {
                        statePc = 65;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    stackIn_66_0 = (RuntimeException) ((Object) stackIn_63_0);
                    stackIn_66_1 = (StringBuilder) ((Object) stackIn_63_1);
                    stackIn_66_2 = "{...}";
                    statePc = 66;
                    continue stateLoop;
                }
                case 65: {
                    stackIn_66_0 = (RuntimeException) ((Object) stackIn_65_0);
                    stackIn_66_1 = (StringBuilder) ((Object) stackIn_65_1);
                    stackIn_66_2 = "null";
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    throw wn.a((Throwable) ((Object) stackIn_66_0), stackIn_66_2 + ',' + param1 + ')');
                }
                case 67: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1, mp param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == -25220) {
                break L1;
              } else {
                field_O = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("tr.R(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param3 + ')');
        }
    }

    final void a(byte param0) {
        wo dupTemp$0 = null;
        int stackIn_214_0 = 0;
        int stackIn_218_0 = 0;
        int stackIn_218_1 = 0;
        int stackIn_235_0 = 0;
        int stackIn_235_1 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        int statePc = 0;
        int var2_int = 0;
        float var2_float = 0.0f;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = Vertigo2.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (-1 >= (this.field_B ^ -1)) {
                        statePc = 4;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var2_int = this.field_o ? 1 : 0;
                    var3 = this.field_D.field_l[this.field_B].field_W;
                    if (var2_int == 0) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var3 = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (ln.field_d.field_c) {
                        statePc = 169;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var4 = (ln.field_d.field_s ^ de.field_f) % 8;
                    if (-1 == (var4 ^ -1)) {
                        statePc = 50;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if ((var4 ^ -1) == -2) {
                        statePc = 47;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (-3 != (var4 ^ -1)) {
                        statePc = 17;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    gi.field_u = gi.field_u - aj.field_e;
                    c.field_h = c.field_h + 1;
                    if (var8 == 0) {
                        statePc = 52;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if ((var4 ^ -1) == -4) {
                        statePc = 44;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if ((var4 ^ -1) == -5) {
                        statePc = 41;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (-6 == (var4 ^ -1)) {
                        statePc = 38;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if ((var4 ^ -1) == -7) {
                        statePc = 35;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (var4 != 7) {
                        statePc = 52;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    aj.field_e = aj.field_e - 1;
                    pn.field_R = pn.field_R - c.field_h;
                    if (var8 == 0) {
                        statePc = 52;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    pn.field_R = pn.field_R - aj.field_e;
                    c.field_h = c.field_h - 1;
                    if (var8 == 0) {
                        statePc = 52;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    aj.field_e = aj.field_e + 1;
                    pn.field_R = pn.field_R + c.field_h;
                    if (var8 == 0) {
                        statePc = 52;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    pn.field_R = pn.field_R + aj.field_e;
                    c.field_h = c.field_h + 1;
                    if (var8 == 0) {
                        statePc = 52;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    aj.field_e = aj.field_e + 1;
                    gi.field_u = gi.field_u - c.field_h;
                    if (var8 == 0) {
                        statePc = 52;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    gi.field_u = gi.field_u + c.field_h;
                    aj.field_e = aj.field_e - 1;
                    if (var8 == 0) {
                        statePc = 52;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    c.field_h = c.field_h - 1;
                    gi.field_u = gi.field_u + aj.field_e;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    var4 = (ln.field_d.field_s ^ de.field_f + var3) % 5;
                    if (-1 == (var4 ^ -1)) {
                        statePc = 77;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if (1 != var4) {
                        statePc = 59;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    sk.field_b = sk.field_b + re.field_j;
                    ki.field_c = ki.field_c + 1;
                    if (var8 == 0) {
                        statePc = 79;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    if (-3 != (var4 ^ -1)) {
                        statePc = 65;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    sk.field_b = sk.field_b - re.field_j;
                    ki.field_c = ki.field_c - 1;
                    if (var8 == 0) {
                        statePc = 79;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    if (3 != var4) {
                        statePc = 71;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    sk.field_b = sk.field_b + ki.field_c;
                    re.field_j = re.field_j + 1;
                    if (var8 == 0) {
                        statePc = 79;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    if (4 == var4) {
                        statePc = 76;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 76: {
                    re.field_j = re.field_j - 1;
                    sk.field_b = sk.field_b - ki.field_c;
                    if (var8 == 0) {
                        statePc = 79;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    qr.field_j = qr.field_j | ki.field_c + sk.field_b << 1872859729;
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    var4 = (gi.field_u + aj.field_e * de.field_f) % 8;
                    if (0 == var4) {
                        statePc = 122;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    if (var4 == 1) {
                        statePc = 119;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    if (-3 != (var4 ^ -1)) {
                        statePc = 89;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    df.field_k = df.field_k + 1;
                    f.field_B = f.field_B + ca.field_g;
                    if (var8 == 0) {
                        statePc = 124;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    if (3 == var4) {
                        statePc = 116;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if (4 == var4) {
                        statePc = 113;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    if (-6 == (var4 ^ -1)) {
                        statePc = 110;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    if (6 != var4) {
                        statePc = 104;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    df.field_k = df.field_k - 1;
                    hj.field_c = hj.field_c - ca.field_g;
                    if (var8 == 0) {
                        statePc = 124;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    if (-8 == (var4 ^ -1)) {
                        statePc = 109;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 109: {
                    ca.field_g = ca.field_g - 1;
                    hj.field_c = hj.field_c - df.field_k;
                    if (var8 == 0) {
                        statePc = 124;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    ca.field_g = ca.field_g + 1;
                    hj.field_c = hj.field_c + df.field_k;
                    if (var8 == 0) {
                        statePc = 124;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    df.field_k = df.field_k + 1;
                    hj.field_c = hj.field_c + ca.field_g;
                    if (var8 == 0) {
                        statePc = 124;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    f.field_B = f.field_B + df.field_k;
                    ca.field_g = ca.field_g + 1;
                    if (var8 == 0) {
                        statePc = 124;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    f.field_B = f.field_B - df.field_k;
                    ca.field_g = ca.field_g - 1;
                    if (var8 == 0) {
                        statePc = 124;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    df.field_k = df.field_k - 1;
                    f.field_B = f.field_B - ca.field_g;
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    if (-1 == (var4 ^ -1)) {
                        statePc = 167;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    if (-2 != (var4 ^ -1)) {
                        statePc = 131;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    mc.field_e = mc.field_e - sl.field_l;
                    ci.field_b = ci.field_b - 1;
                    if (var8 == 0) {
                        statePc = 169;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    if (-3 != (var4 ^ -1)) {
                        statePc = 137;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    sl.field_l = sl.field_l + 1;
                    mc.field_e = mc.field_e + ci.field_b;
                    if (var8 == 0) {
                        statePc = 169;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    if (var4 != 3) {
                        statePc = 143;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    ci.field_b = ci.field_b + 1;
                    mc.field_e = mc.field_e + sl.field_l;
                    if (var8 == 0) {
                        statePc = 169;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    if (var4 != 4) {
                        statePc = 149;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    sl.field_l = sl.field_l + 1;
                    lj.field_k = lj.field_k + ci.field_b;
                    if (var8 == 0) {
                        statePc = 169;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    if (var4 != 5) {
                        statePc = 155;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    ci.field_b = ci.field_b + 1;
                    lj.field_k = lj.field_k + sl.field_l;
                    if (var8 == 0) {
                        statePc = 169;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    if (-7 == (var4 ^ -1)) {
                        statePc = 164;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    if (var4 == 7) {
                        statePc = 163;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 163: {
                    lj.field_k = lj.field_k - sl.field_l;
                    ci.field_b = ci.field_b - 1;
                    if (var8 == 0) {
                        statePc = 169;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 164: {
                    sl.field_l = sl.field_l - 1;
                    lj.field_k = lj.field_k - ci.field_b;
                    if (var8 == 0) {
                        statePc = 169;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    mc.field_e = mc.field_e - ci.field_b;
                    sl.field_l = sl.field_l - 1;
                    statePc = 169;
                    continue stateLoop;
                }
                case 169: {
                    if (-14 == (de.field_f ^ -1)) {
                        statePc = 172;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 172: {
                    var2_int = 1;
                    if ((this.field_D.field_r.field_w ^ -1) == -1) {
                        statePc = 175;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 175: {
                    if (this.field_D.field_r.h(9979) == 3) {
                        statePc = 181;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    if (4 == this.field_D.field_r.h(param0 ^ 9864)) {
                        statePc = 181;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 181: {
                    var2_int = 0;
                    statePc = 182;
                    continue stateLoop;
                }
                case 182: {
                    var3 = 1;
                    if (!this.field_o) {
                        statePc = 196;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    if (-1 >= (this.field_B ^ -1)) {
                        statePc = 187;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 186: {
                    var3 = 4;
                    if (var8 == 0) {
                        statePc = 196;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 187: {
                    if (!this.field_D.field_a) {
                        statePc = 191;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    var3 = 3;
                    if (var8 == 0) {
                        statePc = 196;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    if (1 != this.field_D.field_j) {
                        statePc = 195;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    var3 = 22;
                    if (var8 == 0) {
                        statePc = 196;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 195: {
                    var3 = 2;
                    statePc = 196;
                    continue stateLoop;
                }
                case 196: {
                    if (var2_int != 0) {
                        statePc = 199;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 199: {
                    var4 = var3;
                    gj.a((byte) 36, false, am.field_n, var4);
                    statePc = 200;
                    continue stateLoop;
                }
                case 200: {
                    return;
                }
                case 201: {
                    if (this.field_o) {
                        statePc = 245;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    if (ji.field_r <= 0) {
                        statePc = 245;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    cp.field_b = cp.field_b.substring(1) + ji.field_r;
                    if (cp.field_b.equalsIgnoreCase("noir")) {
                        statePc = 210;
                    } else {
                        statePc = 245;
                    }
                    continue stateLoop;
                }
                case 210: {
                    if (gi.field_r) {
                        statePc = 213;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 211: {
                    stackIn_214_0 = 1;
                    statePc = 214;
                    continue stateLoop;
                }
                case 213: {
                    stackIn_214_0 = 0;
                    statePc = 214;
                    continue stateLoop;
                }
                case 214: {
                    gi.field_r = stackIn_214_0 != 0;
                    var2_float = 1.399999976158142f;
                    oo.b(var2_float);
                    if (!gi.field_r) {
                        statePc = 243;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 215: {
                    var3 = 0;
                    statePc = 216;
                    continue stateLoop;
                }
                case 216: {
                    if ((oo.field_c.length ^ -1) >= (var3 ^ -1)) {
                        statePc = 233;
                    } else {
                        statePc = 217;
                    }
                    continue stateLoop;
                }
                case 217: {
                    var4 = (oo.field_c[var3] & 16711680) >> -277804496;
                    var5 = (65280 & oo.field_c[var3]) >> -889245144;
                    var6 = oo.field_c[var3] & 255;
                    var7 = (var5 + (var6 + var4)) / 3;
                    stackIn_235_0 = var7;
                    stackIn_218_0 = stackIn_235_0;
                    stackIn_235_1 = 79;
                    stackIn_218_1 = stackIn_235_1;
                    if (var8 != 0) {
                        statePc = 235;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 218: {
                    if (stackIn_218_0 >= stackIn_218_1) {
                        statePc = 224;
                    } else {
                        statePc = 221;
                    }
                    continue stateLoop;
                }
                case 221: {
                    oo.field_c[var3] = 0;
                    if (var8 == 0) {
                        statePc = 232;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 224: {
                    if (-91 >= (var7 ^ -1)) {
                        statePc = 230;
                    } else {
                        statePc = 227;
                    }
                    continue stateLoop;
                }
                case 227: {
                    oo.field_c[var3] = om.a(var7, om.a(var7 << 166569640, var7 << -1292079856));
                    if (var8 == 0) {
                        statePc = 232;
                    } else {
                        statePc = 230;
                    }
                    continue stateLoop;
                }
                case 230: {
                    oo.field_c[var3] = 16777215;
                    statePc = 232;
                    continue stateLoop;
                }
                case 232: {
                    var3++;
                    if (var8 == 0) {
                        statePc = 216;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 233: {
                    var3 = 0;
                    statePc = 234;
                    continue stateLoop;
                }
                case 234: {
                    stackIn_235_0 = var3 ^ -1;
                    stackIn_235_1 = Vertigo2.field_J.length ^ -1;
                    statePc = 235;
                    continue stateLoop;
                }
                case 235: {
                    if (stackIn_235_0 <= stackIn_235_1) {
                        statePc = 242;
                    } else {
                        statePc = 236;
                    }
                    continue stateLoop;
                }
                case 236: {
                    qq.a(oo.field_c, 0, Vertigo2.field_J[var3], 0, oo.field_c.length);
                    var3++;
                    if (var8 != 0) {
                        statePc = 245;
                    } else {
                        statePc = 239;
                    }
                    continue stateLoop;
                }
                case 239: {
                    if (var8 == 0) {
                        statePc = 234;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 242: {
                    if (var8 == 0) {
                        statePc = 245;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 243: {
                    mn.a(false);
                    statePc = 245;
                    continue stateLoop;
                }
                case 245: {
                    if (-1 >= (this.field_B ^ -1)) {
                        statePc = 285;
                    } else {
                        statePc = 246;
                    }
                    continue stateLoop;
                }
                case 246: {
                    if (1 != this.field_D.field_r.h(9979)) {
                        statePc = 285;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 249: {
                    if (s.field_y != de.field_f) {
                        statePc = 255;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 252: {
                    if (!eo.field_o) {
                        statePc = 258;
                    } else {
                        statePc = 255;
                    }
                    continue stateLoop;
                }
                case 255: {
                    if (am.field_t != de.field_f) {
                        statePc = 266;
                    } else {
                        statePc = 258;
                    }
                    continue stateLoop;
                }
                case 258: {
                    if (this.field_G.a(true)) {
                        statePc = 285;
                    } else {
                        statePc = 261;
                    }
                    continue stateLoop;
                }
                case 261: {
                    var2_int = this.field_n;
                    this.field_n = this.field_n - 1;
                    if (-1 < (this.field_n ^ -1)) {
                        statePc = 264;
                    } else {
                        statePc = 265;
                    }
                    continue stateLoop;
                }
                case 264: {
                    this.field_n = -1 + this.field_D.field_l.length;
                    statePc = 265;
                    continue stateLoop;
                }
                case 265: {
                    this.field_G.a((byte) -17, var2_int, this.field_n);
                    if (var8 == 0) {
                        statePc = 285;
                    } else {
                        statePc = 266;
                    }
                    continue stateLoop;
                }
                case 266: {
                    if (ga.field_gb != de.field_f) {
                        statePc = 272;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 269: {
                    if (!eo.field_o) {
                        statePc = 277;
                    } else {
                        statePc = 272;
                    }
                    continue stateLoop;
                }
                case 272: {
                    if (de.field_f == od.field_Mb) {
                        statePc = 277;
                    } else {
                        statePc = 285;
                    }
                    continue stateLoop;
                }
                case 277: {
                    if (!this.field_G.a(true)) {
                        statePc = 280;
                    } else {
                        statePc = 285;
                    }
                    continue stateLoop;
                }
                case 280: {
                    var2_int = this.field_n;
                    this.field_n = this.field_n + 1;
                    if (this.field_n >= this.field_D.field_l.length) {
                        statePc = 283;
                    } else {
                        statePc = 284;
                    }
                    continue stateLoop;
                }
                case 283: {
                    this.field_n = 0;
                    statePc = 284;
                    continue stateLoop;
                }
                case 284: {
                    this.field_G.a((byte) -17, var2_int, this.field_n);
                    statePc = 285;
                    continue stateLoop;
                }
                case 285: {
                    if (!this.field_o) {
                        statePc = 301;
                    } else {
                        statePc = 286;
                    }
                    continue stateLoop;
                }
                case 286: {
                    if (eo.field_o) {
                        statePc = 292;
                    } else {
                        statePc = 289;
                    }
                    continue stateLoop;
                }
                case 289: {
                    if (0 > this.field_B) {
                        statePc = 301;
                    } else {
                        statePc = 292;
                    }
                    continue stateLoop;
                }
                case 292: {
                    if (0 > this.field_B) {
                        statePc = 316;
                    } else {
                        statePc = 295;
                    }
                    continue stateLoop;
                }
                case 295: {
                    if (il.field_a) {
                        statePc = 316;
                    } else {
                        statePc = 298;
                    }
                    continue stateLoop;
                }
                case 298: {
                    if (tf.a((byte) 123)) {
                        statePc = 316;
                    } else {
                        statePc = 301;
                    }
                    continue stateLoop;
                }
                case 301: {
                    if ((tn.field_c ^ -1) == (de.field_f ^ -1)) {
                        statePc = 307;
                    } else {
                        statePc = 304;
                    }
                    continue stateLoop;
                }
                case 304: {
                    if (bc.field_b != de.field_f) {
                        statePc = 309;
                    } else {
                        statePc = 307;
                    }
                    continue stateLoop;
                }
                case 307: {
                    this.field_G.a(15481);
                    statePc = 309;
                    continue stateLoop;
                }
                case 309: {
                    if (ve.field_a == de.field_f) {
                        statePc = 315;
                    } else {
                        statePc = 310;
                    }
                    continue stateLoop;
                }
                case 310: {
                    if ((jb.field_y ^ -1) == (de.field_f ^ -1)) {
                        statePc = 315;
                    } else {
                        statePc = 316;
                    }
                    continue stateLoop;
                }
                case 315: {
                    this.field_G.b((byte) 119);
                    statePc = 316;
                    continue stateLoop;
                }
                case 316: {
                    if (!this.field_o) {
                        statePc = 324;
                    } else {
                        statePc = 317;
                    }
                    continue stateLoop;
                }
                case 317: {
                    if (il.field_a) {
                        statePc = 323;
                    } else {
                        statePc = 320;
                    }
                    continue stateLoop;
                }
                case 320: {
                    if (!tf.a((byte) 96)) {
                        statePc = 324;
                    } else {
                        statePc = 323;
                    }
                    continue stateLoop;
                }
                case 323: {
                    return;
                }
                case 324: {
                    if (param0 == 115) {
                        statePc = 326;
                    } else {
                        statePc = 325;
                    }
                    continue stateLoop;
                }
                case 325: {
                    return;
                }
                case 326: {
                    if (ch.field_k == de.field_f) {
                        statePc = 330;
                    } else {
                        statePc = 327;
                    }
                    continue stateLoop;
                }
                case 327: {
                    if ((na.field_n ^ -1) != (de.field_f ^ -1)) {
                        statePc = 332;
                    } else {
                        statePc = 330;
                    }
                    continue stateLoop;
                }
                case 330: {
                    this.field_C = this.field_C | 2;
                    statePc = 332;
                    continue stateLoop;
                }
                case 332: {
                    if (de.field_f == ro.field_i) {
                        statePc = 336;
                    } else {
                        statePc = 333;
                    }
                    continue stateLoop;
                }
                case 333: {
                    if ((om.field_B ^ -1) != (de.field_f ^ -1)) {
                        statePc = 338;
                    } else {
                        statePc = 336;
                    }
                    continue stateLoop;
                }
                case 336: {
                    this.field_C = this.field_C | 1;
                    statePc = 338;
                    continue stateLoop;
                }
                case 338: {
                    if ((de.field_f ^ -1) == (ga.field_fb ^ -1)) {
                        statePc = 341;
                    } else {
                        statePc = 342;
                    }
                    continue stateLoop;
                }
                case 341: {
                    this.field_D.e(-4);
                    statePc = 342;
                    continue stateLoop;
                }
                case 342: {
                    if (!this.field_A) {
                        statePc = 351;
                    } else {
                        statePc = 343;
                    }
                    continue stateLoop;
                }
                case 343: {
                    if (de.field_f != 59) {
                        statePc = 351;
                    } else {
                        statePc = 346;
                    }
                    continue stateLoop;
                }
                case 346: {
                    if ((this.field_D.field_j ^ -1) != -4) {
                        statePc = 351;
                    } else {
                        statePc = 349;
                    }
                    continue stateLoop;
                }
                case 349: {
                    ci.field_b = 0;
                    mc.field_e = 0;
                    lj.field_k = 0;
                    sl.field_l = 0;
                    dh.a(this.field_D.field_e, this.field_D.field_l[0].field_H, true);
                    gj.a((byte) -66, false, am.field_n, 20);
                    statePc = 351;
                    continue stateLoop;
                }
                case 351: {
                    if (this.field_A) {
                        statePc = 354;
                    } else {
                        statePc = 437;
                    }
                    continue stateLoop;
                }
                case 354: {
                    var2_int = lp.h(param0 + -114);
                    var3 = var2_int;
                    if (0 != var3) {
                        statePc = 358;
                    } else {
                        statePc = 355;
                    }
                    continue stateLoop;
                }
                case 355: {
                    if (var8 == 0) {
                        statePc = 399;
                    } else {
                        statePc = 358;
                    }
                    continue stateLoop;
                }
                case 358: {
                    if (1 == var3) {
                        statePc = 400;
                    } else {
                        statePc = 361;
                    }
                    continue stateLoop;
                }
                case 361: {
                    if ((var3 ^ -1) != -3) {
                        statePc = 367;
                    } else {
                        statePc = 364;
                    }
                    continue stateLoop;
                }
                case 364: {
                    if (var8 == 0) {
                        statePc = 406;
                    } else {
                        statePc = 367;
                    }
                    continue stateLoop;
                }
                case 367: {
                    if (-4 != (var3 ^ -1)) {
                        statePc = 373;
                    } else {
                        statePc = 370;
                    }
                    continue stateLoop;
                }
                case 370: {
                    if (var8 == 0) {
                        statePc = 412;
                    } else {
                        statePc = 373;
                    }
                    continue stateLoop;
                }
                case 373: {
                    if ((var3 ^ -1) != -5) {
                        statePc = 379;
                    } else {
                        statePc = 376;
                    }
                    continue stateLoop;
                }
                case 376: {
                    if (var8 == 0) {
                        statePc = 418;
                    } else {
                        statePc = 379;
                    }
                    continue stateLoop;
                }
                case 379: {
                    if (var3 != 5) {
                        statePc = 385;
                    } else {
                        statePc = 382;
                    }
                    continue stateLoop;
                }
                case 382: {
                    if (var8 == 0) {
                        statePc = 421;
                    } else {
                        statePc = 385;
                    }
                    continue stateLoop;
                }
                case 385: {
                    if (var3 == 6) {
                        statePc = 424;
                    } else {
                        statePc = 388;
                    }
                    continue stateLoop;
                }
                case 388: {
                    if ((var3 ^ -1) == -8) {
                        statePc = 427;
                    } else {
                        statePc = 391;
                    }
                    continue stateLoop;
                }
                case 391: {
                    if (var3 == 8) {
                        statePc = 430;
                    } else {
                        statePc = 394;
                    }
                    continue stateLoop;
                }
                case 394: {
                    if (9 == var3) {
                        statePc = 433;
                    } else {
                        statePc = 437;
                    }
                    continue stateLoop;
                }
                case 399: {
                    this.field_D.a(30113, false);
                    if (var8 == 0) {
                        statePc = 437;
                    } else {
                        statePc = 400;
                    }
                    continue stateLoop;
                }
                case 400: {
                    if (!this.field_o) {
                        statePc = 405;
                    } else {
                        statePc = 437;
                    }
                    continue stateLoop;
                }
                case 405: {
                    this.field_D.field_l[this.field_B].l((byte) -89);
                    if (var8 == 0) {
                        statePc = 437;
                    } else {
                        statePc = 406;
                    }
                    continue stateLoop;
                }
                case 406: {
                    if (!this.field_o) {
                        statePc = 411;
                    } else {
                        statePc = 437;
                    }
                    continue stateLoop;
                }
                case 411: {
                    this.field_D.field_l[this.field_B].d((byte) 4);
                    if (var8 == 0) {
                        statePc = 437;
                    } else {
                        statePc = 412;
                    }
                    continue stateLoop;
                }
                case 412: {
                    if (!this.field_o) {
                        statePc = 417;
                    } else {
                        statePc = 437;
                    }
                    continue stateLoop;
                }
                case 417: {
                    dupTemp$0 = this.field_D.field_l[this.field_B];
                    dupTemp$0.field_g = dupTemp$0.field_g + 1;
                    if (var8 == 0) {
                        statePc = 437;
                    } else {
                        statePc = 418;
                    }
                    continue stateLoop;
                }
                case 418: {
                    mr.a((byte) -68);
                    if (var8 == 0) {
                        statePc = 437;
                    } else {
                        statePc = 421;
                    }
                    continue stateLoop;
                }
                case 421: {
                    kq.a((byte) -40);
                    if (var8 == 0) {
                        statePc = 437;
                    } else {
                        statePc = 424;
                    }
                    continue stateLoop;
                }
                case 424: {
                    m.d(param0 + 5, 20, 300);
                    if (var8 == 0) {
                        statePc = 437;
                    } else {
                        statePc = 427;
                    }
                    continue stateLoop;
                }
                case 427: {
                    tk.a(param0 ^ -116, 0, 0, il.field_e, wo.field_S);
                    if (var8 == 0) {
                        statePc = 437;
                    } else {
                        statePc = 430;
                    }
                    continue stateLoop;
                }
                case 430: {
                    va.a(20, (byte) 125);
                    if (var8 == 0) {
                        statePc = 437;
                    } else {
                        statePc = 433;
                    }
                    continue stateLoop;
                }
                case 433: {
                    va.a(50, (byte) 124);
                    statePc = 437;
                    continue stateLoop;
                }
                case 437: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(mi param0, int param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              this.field_D.a(param0, (byte) 102);
              if (param1 >= 99) {
                break L1;
              } else {
                this.b(-118, -59);
                break L1;
              }
            }
            this.field_g = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("tr.H(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, pp param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > -this.field_M + this.field_u) {
                break L1;
              } else {
                if (!this.field_z.a(false)) {
                  break L1;
                } else {
                  this.a(param1, (byte) 11);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            this.field_z.a(param1, false);
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (runtimeException);

            stackIn_13_1 = new StringBuilder().append("tr.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0, byte param1) {
        boolean stackIn_16_0 = false;
        boolean stackIn_18_0 = false;
        boolean stackIn_37_0 = false;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        int stackIn_78_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_92_1 = 0;
        int stackIn_163_0 = 0;
        int stackIn_163_1 = 0;
        int stackIn_167_0 = 0;
        int stackIn_171_0 = 0;
        Throwable caughtException = null;
        int statePc = 0;
        int var3_int = 0;
        rn[] var3 = null;
        RuntimeException var3_ref = null;
        int var4_int = 0;
        rn[] var4 = null;
        int var5 = 0;
        wo var6_ref_wo = null;
        int var6 = 0;
        int var7_int = 0;
        wo var7 = null;
        int var8 = 0;
        String var8_ref_String = null;
        rn var9_ref_rn = null;
        int var9 = 0;
        rn var10_ref_rn = null;
        int var10 = 0;
        int var11_int = 0;
        Runtime var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = Vertigo2.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (mf.a((byte) 126, 512)) {
                        statePc = 4;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.field_m.a(false, this.field_D.field_r);
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (!mf.a((byte) 126, 64)) {
                        statePc = 7;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var3_int = 0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if ((var3_int ^ -1) <= (this.field_q.length ^ -1)) {
                        statePc = 13;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    this.field_q[var3_int] = 0;
                    var3_int++;
                    if (var14 != 0) {
                        statePc = 14;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (var14 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var3_int = this.field_M;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (this.field_u <= var3_int) {
                        statePc = 36;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    stackIn_37_0 = mf.a((byte) 126, 512);
                    stackIn_16_0 = stackIn_37_0;
                    if (var14 != 0) {
                        statePc = 37;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_18_0 = stackIn_16_0;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (stackIn_18_0) {
                        statePc = 36;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if ((this.field_B ^ -1) > -1) {
                        statePc = 33;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var4_int = this.field_a.a(true, var3_int);
                    if (0 != (var4_int ^ -1)) {
                        statePc = 31;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if ((this.field_B ^ -1) > -1) {
                        statePc = 31;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (var14 == 0) {
                        statePc = 36;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    this.field_q[this.field_B] = var4_int;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    var4_int = 0;
                    if ((this.field_v ^ -1) <= (var3_int ^ -1)) {
                        statePc = 35;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    this.field_v = var3_int;
                    var4_int = 1;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    this.field_m.a(false, this.field_p, 128, this.field_q, var4_int != 0);
                    var3_int++;
                    if (var14 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    stackIn_37_0 = this.field_o;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (!stackIn_37_0) {
                        statePc = 44;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (1 != this.field_m.h(param1 ^ -9953)) {
                        statePc = 44;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var3_int = this.field_t;
                    if ((var3_int ^ -1) > -11) {
                        statePc = 43;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    var3_int = 9;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    this.field_m.a(this.field_K[var3_int], this.field_B, param1 + -22719);
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    var3 = this.field_D.field_r.m(9384);
                    var4 = this.field_m.m(param1 ^ -9396);
                    var5 = 0;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    stackIn_46_0 = this.field_D.field_l.length;
                    stackIn_46_1 = var5;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    if (stackIn_46_0 <= stackIn_46_1) {
                        statePc = 73;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    stackIn_74_0 = var5 ^ -1;
                    stackIn_48_0 = stackIn_74_0;
                    stackIn_74_1 = this.field_B ^ -1;
                    stackIn_48_1 = stackIn_74_1;
                    if (var14 != 0) {
                        statePc = 74;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (stackIn_48_0 != stackIn_48_1) {
                        statePc = 54;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    if (var14 == 0) {
                        statePc = 72;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    var6_ref_wo = this.field_D.field_l[var5];
                    var7_int = 0;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    if ((var7_int ^ -1) <= -10) {
                        statePc = 72;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    var8 = var6_ref_wo.field_P[var7_int];
                    stackIn_46_0 = var8 ^ -1;
                    stackIn_57_0 = stackIn_46_0;
                    stackIn_46_1 = -1;
                    stackIn_57_1 = stackIn_46_1;
                    if (var14 != 0) {
                        statePc = 46;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    if (stackIn_57_0 > stackIn_57_1) {
                        statePc = 69;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    if (var8 < var4.length) {
                        statePc = 63;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 63: {
                    var9_ref_rn = var3[var8];
                    if (var9_ref_rn != null) {
                        statePc = 67;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    if (var14 == 0) {
                        statePc = 69;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    var10_ref_rn = var4[var8];
                    if (var10_ref_rn == null) {
                        statePc = 69;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    var11_int = -var9_ref_rn.field_l + var6_ref_wo.field_E;
                    var12 = -var9_ref_rn.field_g + var6_ref_wo.field_y;
                    var13 = -var9_ref_rn.field_s + var6_ref_wo.field_k;
                    this.field_m.field_f[var5].field_E = var11_int + var10_ref_rn.field_l;
                    this.field_m.field_f[var5].field_y = var12 + var10_ref_rn.field_g;
                    this.field_m.field_f[var5].field_k = var10_ref_rn.field_s + var13;
                    if (var14 == 0) {
                        statePc = 72;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    var7_int++;
                    if (var14 == 0) {
                        statePc = 55;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    var5++;
                    if (var14 == 0) {
                        statePc = 45;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    stackIn_74_0 = kn.field_h[this.field_D.field_j].length;
                    stackIn_74_1 = this.field_D.field_e - -this.field_D.field_c;
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    if (stackIn_74_0 <= stackIn_74_1) {
                        statePc = 77;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    stackIn_78_0 = this.field_D.field_e + this.field_D.field_c;
                    statePc = 78;
                    continue stateLoop;
                }
                case 77: {
                    stackIn_78_0 = kn.field_h[this.field_D.field_j].length;
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    var5 = stackIn_78_0;
                    var6 = this.field_D.b(-6133);
                    this.field_G.a(this.field_B, -this.field_D.field_e + var5, 1 + (-this.field_D.field_e + var6), true, this.field_m, this.field_D.field_f, this.field_D.field_g, var6, this.field_n);
                    this.field_t = this.field_t + 1;
                    if (param1 == -28) {
                        statePc = 81;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    this.field_J = -79;
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    if (mf.a((byte) 126, 128)) {
                        statePc = 84;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 84: {
                    if (this.field_b != null) {
                        statePc = 87;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    this.field_b = new er(640, 480);
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    this.field_b.d();
                    this.field_G.a(this.field_B, -this.field_D.field_e + var5, 1 + (var6 - this.field_D.field_e), true, this.field_D.field_r, this.field_D.field_f, this.field_D.field_g, var6, this.field_n);
                    ro.field_g.a(-125);
                    this.field_b.d(0, 0, 128);
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    if (!this.field_o) {
                        statePc = 147;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    var7_int = 0;
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    if ((this.field_D.field_z ^ -1) >= (var7_int ^ -1)) {
                        statePc = 147;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    stackIn_163_0 = var7_int ^ -1;
                    stackIn_92_0 = stackIn_163_0;
                    stackIn_163_1 = this.field_B ^ -1;
                    stackIn_92_1 = stackIn_163_1;
                    if (var14 != 0) {
                        statePc = 163;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if (stackIn_92_0 == stackIn_92_1) {
                        statePc = 123;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    var8_ref_String = this.field_D.field_w[var7_int];
                    if (0 == (1 << var7_int & this.field_h)) {
                        statePc = 101;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    if ((1 << var7_int & this.field_D.field_u) == 0) {
                        statePc = 100;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    var8_ref_String = Vertigo2.a(new String[]{var8_ref_String}, kd.field_m, 121);
                    if (var14 == 0) {
                        statePc = 145;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    var8_ref_String = Vertigo2.a(new String[]{var8_ref_String}, mn.field_p, -115);
                    if (var14 == 0) {
                        statePc = 145;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    if (0 != (1 << var7_int & this.field_D.field_t)) {
                        statePc = 118;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    if ((1 << var7_int & this.field_D.field_u) == 0) {
                        statePc = 108;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    var8_ref_String = Vertigo2.a(new String[]{var8_ref_String}, ca.field_e, param1 ^ -109);
                    if (var14 == 0) {
                        statePc = 145;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    if (this.field_D.field_a) {
                        statePc = 146;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    if (0 != (this.field_D.field_d & 1 << var7_int)) {
                        statePc = 117;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    if (var14 == 0) {
                        statePc = 146;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    var8_ref_String = Vertigo2.a(new String[]{var8_ref_String}, mo.field_c, -120);
                    if (var14 == 0) {
                        statePc = 145;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    if (!this.field_i) {
                        statePc = 122;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    var8_ref_String = Vertigo2.a(new String[]{var8_ref_String}, me.field_d, param1 ^ 19);
                    if (var14 == 0) {
                        statePc = 145;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    var8_ref_String = Vertigo2.a(new String[]{var8_ref_String}, gn.field_e, 9);
                    if (var14 == 0) {
                        statePc = 145;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    if (-1 == (1 << var7_int & this.field_D.field_t ^ -1)) {
                        statePc = 131;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    if (!this.field_i) {
                        statePc = 130;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    var8_ref_String = ue.field_H;
                    if (var14 == 0) {
                        statePc = 145;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    var8_ref_String = bm.field_A;
                    if (var14 == 0) {
                        statePc = 145;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    if (0 != (1 << var7_int & this.field_D.field_u)) {
                        statePc = 144;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    if (this.field_D.field_a) {
                        statePc = 146;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    if (0 != (this.field_D.field_d & 1 << var7_int)) {
                        statePc = 143;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    if (var14 == 0) {
                        statePc = 146;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    var8_ref_String = rb.field_b;
                    if (var14 == 0) {
                        statePc = 145;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    var8_ref_String = cd.field_c;
                    statePc = 145;
                    continue stateLoop;
                }
                case 145: {
                    va.field_s.a(616, param1 ^ 65, 16777215, var7_int * 14 + 140, -1, var8_ref_String);
                    statePc = 146;
                    continue stateLoop;
                }
                case 146: {
                    var7_int++;
                    if (var14 == 0) {
                        statePc = 90;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    if (param0) {
                        statePc = 150;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 150: {
                    this.c(param1 ^ -112);
                    statePc = 151;
                    continue stateLoop;
                }
                case 151: {
                    if (!this.field_o) {
                        statePc = 172;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    if (!hj.field_g) {
                        statePc = 158;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    if (param0) {
                        statePc = 164;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    if (wg.field_g <= 0) {
                        statePc = 166;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    stackIn_163_0 = rg.field_f % 40 ^ -1;
                    stackIn_163_1 = -21;
                    statePc = 163;
                    continue stateLoop;
                }
                case 163: {
                    if (stackIn_163_0 <= stackIn_163_1) {
                        statePc = 166;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 164: {
                    stackIn_167_0 = 1;
                    statePc = 167;
                    continue stateLoop;
                }
                case 166: {
                    stackIn_167_0 = 0;
                    statePc = 167;
                    continue stateLoop;
                }
                case 167: {
                    var7_int = stackIn_167_0;
                    var8 = 15;
                    var9 = var8 * 2 + (int)np.field_Nb;
                    var10 = var8 * 2 + tk.field_c.field_z;
                    va.field_s.b(93);
                    qi.a(false, 25, var9, 3 + td.field_c.field_C + -var10);
                    if (var7_int != 0) {
                        statePc = 170;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    stackIn_171_0 = 16777215;
                    statePc = 171;
                    continue stateLoop;
                }
                case 170: {
                    stackIn_171_0 = 14586368;
                    statePc = 171;
                    continue stateLoop;
                }
                case 171: {
                    var11_int = stackIn_171_0;
                    va.field_s.a(j.field_p, var11_int, -1, var8 + ((int)np.field_Nb / 2 + 25), td.field_c.field_C - var8, 2);
                    statePc = 172;
                    continue stateLoop;
                }
                case 172: {
                    var7 = this.field_D.field_l[this.field_n];
                    if (null == va.field_s) {
                        statePc = 213;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    if (0 > this.field_n) {
                        statePc = 213;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    if (var7 == null) {
                        statePc = 213;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 179: {
                    var8 = 20;
                    var9 = 16;
                    var10 = 440;
                    if (mf.a((byte) 126, 1)) {
                        statePc = 182;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 182: {
                    tk.field_c.a("Position:", var10, var8, 16777215, -1);
                    var8 = var8 + var9;
                    tk.field_c.a(Integer.toString(var7.field_E), var10, var8, 16777215, -1);
                    var8 = var8 + var9;
                    tk.field_c.a(Integer.toString(var7.field_y), var10, var8, 16777215, -1);
                    var8 = var8 + var9;
                    tk.field_c.a(Integer.toString(var7.field_k), var10, var8, 16777215, -1);
                    var8 = var8 + var9;
                    statePc = 183;
                    continue stateLoop;
                }
                case 183: {
                    if (mf.a((byte) 126, 2)) {
                        statePc = 186;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 186: {
                    tk.field_c.a("Current Cell:", var10, var8, 16777215, -1);
                    var8 = var8 + var9;
                    tk.field_c.a(Integer.toString(var7.field_E / 128), var10, var8, 16777215, -1);
                    var8 = var8 + var9;
                    tk.field_c.a(Integer.toString(var7.field_y / 128), var10, var8, 16777215, -1);
                    var8 = var8 + var9;
                    tk.field_c.a(Integer.toString(var7.field_k / 240), var10, var8, 16777215, -1);
                    var8 = var8 + var9;
                    statePc = 187;
                    continue stateLoop;
                }
                case 187: {
                    if (!mf.a((byte) 126, 4)) {
                        statePc = 189;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    tk.field_c.a("FPS:", var10, var8, 16777215, -1);
                    var8 = var8 + var9;
                    tk.field_c.a(Integer.toString(li.field_d), var10, var8, 16777215, -1);
                    var8 = var8 + var9;
                    statePc = 189;
                    continue stateLoop;
                }
                case 189: {
                    if (mf.a((byte) 126, 8)) {
                        statePc = 192;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 192: {
                    tk.field_c.a("Memory:", var10, var8, 16777215, -1);
                    var8 = var8 + var9;
                    var11 = Runtime.getRuntime();
                    tk.field_c.a("Total: " + var11.totalMemory() / 1000L, var10, var8, 16777215, -1);
                    var8 = var8 + var9;
                    tk.field_c.a("Used: " + var11.freeMemory() / 1000L, var10, var8, 16777215, -1);
                    var8 = var8 + var9;
                    statePc = 193;
                    continue stateLoop;
                }
                case 193: {
                    if (mf.a((byte) 126, 16)) {
                        statePc = 196;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 196: {
                    tk.field_c.a("Predictions:", var10, var8, 16777215, -1);
                    var8 = var8 + var9;
                    tk.field_c.a("Predicitons per frame: " + (this.field_u + -this.field_M), var10, var8, 65280, -1);
                    var8 = var8 + var9;
                    tk.field_c.a("Keys Out Packets: " + this.field_a.a(16777215), var10, var8, 65280, -1);
                    var8 = var8 + var9;
                    if (this.field_J <= 0) {
                        statePc = 199;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    tk.field_c.a("Auth Updates/Sec: " + this.field_y / this.field_J, var10, var8, 65280, -1);
                    statePc = 199;
                    continue stateLoop;
                }
                case 199: {
                    var8 = var8 + var9;
                    if (0 < this.field_z.c(true)) {
                        statePc = 202;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 202: {
                    tk.field_c.a("Auth Packets delayed: " + this.field_z.c(true), var10, var8, 65280, -1);
                    statePc = 203;
                    continue stateLoop;
                }
                case 203: {
                    var8 = var8 + var9;
                    tk.field_c.a("Gameupdates per tic: " + (int)(0.5f + this.field_E), var10, var8, 65280, -1);
                    var8 = var8 + var9;
                    if ((this.field_H ^ -1) < -1) {
                        statePc = 206;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 206: {
                    tk.field_c.a("Avg Dont updates: " + this.field_x / this.field_H, var10, var8, 65280, -1);
                    statePc = 207;
                    continue stateLoop;
                }
                case 207: {
                    var8 = var8 + var9;
                    statePc = 208;
                    continue stateLoop;
                }
                case 208: {
                    if (!mf.a((byte) 126, 256)) {
                        statePc = 210;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    tk.field_c.a("Player Details:", var10, var8, 16777215, -1);
                    var8 = var8 + var9;
                    tk.field_c.a("Fall: " + var7.c((byte) -128), var10, var8, 65280, -1);
                    var8 = var8 + var9;
                    tk.field_c.a("vx: " + var7.field_c, var10, var8, 65280, -1);
                    var8 = var8 + var9;
                    tk.field_c.a("vx: " + var7.field_O, var10, var8, 65280, -1);
                    var8 = var8 + var9;
                    tk.field_c.a("On Block: " + var7.field_z, var10, var8, 65280, -1);
                    var8 = var8 + var9;
                    tk.field_c.a("Stuck: " + var7.field_N, var10, var8, 65280, -1);
                    var8 = var8 + var9;
                    statePc = 210;
                    continue stateLoop;
                }
                case 210: {
                    var8 = 480;
                    if (!mf.a((byte) 126, 32)) {
                        statePc = 213;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 211: {
                    this.field_a.a(this.field_M, 20, (byte) 51, var8, 30);
                    statePc = 213;
                    continue stateLoop;
                }
                case 213: {
                    va.b(127);
                    statePc = 216;
                    continue stateLoop;
                }
                case 216: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    tr(boolean param0, String[] param1, int param2, boolean param3, int param4, int param5, int param6, int param7) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_25_0 = 0;
        Object stackIn_28_0 = null;
        wo[] stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        wo stackIn_29_2 = null;
        wo stackIn_29_3 = null;
        int stackIn_29_4 = 0;
        int stackIn_29_5 = 0;
        int stackIn_29_6 = 0;
        boolean stackIn_29_7 = false;
        wo[] stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        wo stackIn_31_2 = null;
        wo stackIn_31_3 = null;
        int stackIn_31_4 = 0;
        int stackIn_31_5 = 0;
        int stackIn_31_6 = 0;
        boolean stackIn_31_7 = false;
        wo[] stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        wo stackIn_33_2 = null;
        wo stackIn_33_3 = null;
        int stackIn_33_4 = 0;
        int stackIn_33_5 = 0;
        int stackIn_33_6 = 0;
        boolean stackIn_33_7 = false;
        wo[] stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        wo stackIn_34_2 = null;
        wo stackIn_34_3 = null;
        int stackIn_34_4 = 0;
        int stackIn_34_5 = 0;
        int stackIn_34_6 = 0;
        boolean stackIn_34_7 = false;
        int stackIn_34_8 = 0;
        int stackIn_37_0 = 0;
        Object stackIn_41_0 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = Vertigo2.field_L ? 1 : 0;
                    this.field_I = 0.0f;
                    this.field_c = false;
                    this.field_E = 1.0f;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_o = param0;
                        this.field_i = param3;
                        stackIn_3_0 = this;
                        stackIn_2_0 = stackIn_3_0;
                        if (2 > fn.field_z) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_4_0 = this;
                        stackIn_4_1 = 1;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_4_0 = this;
                        stackIn_4_1 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ((tr) (this)).field_A = stackIn_4_1 != 0;
                        this.field_B = param2;
                        jq.field_e = 0;
                        qr.field_j = 0;
                        hj.field_c = 2035;
                        f.field_B = 43310;
                        ki.field_c = 126;
                        re.field_j = 8522;
                        sk.field_b = 42354;
                        lj.field_k = 1986;
                        mc.field_e = 1951;
                        sl.field_l = 1954;
                        ci.field_b = 1982;
                        aj.field_e = 5180;
                        pn.field_R = 617;
                        c.field_h = 9170;
                        gi.field_u = 8768;
                        df.field_k = 2127;
                        ca.field_g = 1220;
                        var9_int = t.field_l;
                        t.field_l = 0;
                        var10 = var9_int;
                        var11 = rg.field_f % 4;
                        var12 = (-t.field_l + var10) * 4;
                        t.field_l = var10;
                        if ((var11 ^ -1) == -1) {
                            statePc = 21;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (1 != var11) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var13 = var12 / 3;
                        hj.field_c = hj.field_c + var13;
                        f.field_B = f.field_B + (var12 + -var13);
                        if (var14 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (-3 == (var11 ^ -1)) {
                            statePc = 18;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var11 == 3) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        hj.field_c = hj.field_c + var12;
                        if (var14 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        f.field_B = f.field_B + var12;
                        if (var14 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var13 = var12 / 2;
                        hj.field_c = hj.field_c + (var12 - var13);
                        f.field_B = f.field_B + var13;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        this.field_D = new lj(param1, this.field_B, param4, param5, param6, param7, false, param3);
                        this.field_m = this.field_D.c((byte) -116);
                        this.field_G = new am(param4, this.field_D.field_l.length, param1);
                        var9_int = param1.length;
                        this.field_a = new hd(this.field_B, var9_int);
                        this.field_K = new wo[10][var9_int];
                        this.field_p = new boolean[var9_int];
                        this.field_q = new int[var9_int];
                        this.field_F = new boolean[var9_int];
                        this.field_L = new int[var9_int];
                        var10 = 0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if ((var10 ^ -1) <= (var9_int ^ -1)) {
                            statePc = 36;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackIn_37_0 = 0;
                        stackIn_25_0 = stackIn_37_0;
                        if (var14 != 0) {
                            statePc = 37;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var11 = stackIn_25_0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (10 <= var11) {
                            statePc = 35;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_41_0 = this;
                        stackIn_28_0 = stackIn_41_0;
                        if (var14 != 0) {
                            statePc = 41;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackIn_33_0 = ((tr) (this)).field_K[var11];
                        stackIn_29_0 = stackIn_33_0;
                        stackIn_33_1 = var10;
                        stackIn_29_1 = stackIn_33_1;
                        stackIn_33_2 = null;
                        stackIn_29_2 = stackIn_33_2;
                        stackIn_33_3 = null;
                        stackIn_29_3 = stackIn_33_3;
                        stackIn_33_4 = this.field_D.field_l[var10].field_l;
                        stackIn_29_4 = stackIn_33_4;
                        stackIn_33_5 = 0;
                        stackIn_29_5 = stackIn_33_5;
                        stackIn_33_6 = var10;
                        stackIn_29_6 = stackIn_33_6;
                        stackIn_33_7 = this.field_o;
                        stackIn_29_7 = stackIn_33_7;
                        if (-3 != (param4 ^ -1)) {
                            statePc = 33;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackIn_31_0 = (wo[]) ((Object) stackIn_29_0);
                        stackIn_31_1 = stackIn_29_1;
                        stackIn_31_2 = null;
                        stackIn_31_3 = null;
                        stackIn_31_4 = stackIn_29_4;
                        stackIn_31_5 = stackIn_29_5;
                        stackIn_31_6 = stackIn_29_6;
                        stackIn_31_7 = stackIn_29_7;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackIn_34_0 = (wo[]) ((Object) stackIn_31_0);
                        stackIn_34_1 = stackIn_31_1;
                        stackIn_34_2 = null;
                        stackIn_34_3 = null;
                        stackIn_34_4 = stackIn_31_4;
                        stackIn_34_5 = stackIn_31_5;
                        stackIn_34_6 = stackIn_31_6;
                        stackIn_34_7 = stackIn_31_7;
                        stackIn_34_8 = 1;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_34_0 = (wo[]) ((Object) stackIn_33_0);
                        stackIn_34_1 = stackIn_33_1;
                        stackIn_34_2 = null;
                        stackIn_34_3 = null;
                        stackIn_34_4 = stackIn_33_4;
                        stackIn_34_5 = stackIn_33_5;
                        stackIn_34_6 = stackIn_33_6;
                        stackIn_34_7 = stackIn_33_7;
                        stackIn_34_8 = 0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackIn_34_0[stackIn_34_1] = new wo(stackIn_34_4, stackIn_34_5 != 0, stackIn_34_6, stackIn_34_7, stackIn_34_8 != 0, true);
                        var11++;
                        if (var14 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var10++;
                        if (var14 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackIn_37_0 = -1;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (stackIn_37_0 >= (this.field_B ^ -1)) {
                            statePc = 40;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackIn_41_0 = this;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        ((tr) (this)).field_n = this.field_B;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        this.field_s = 50;
                        if ((param4 ^ -1) != -1) {
                            statePc = 48;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if ((param6 ^ -1) <= -11) {
                            statePc = 48;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        this.field_w = true;
                        kh.a(param6, (byte) -84);
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        this.field_z = new nj();
                        this.field_g = true;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 50: {
                    var9 = (RuntimeException) ((Object) caughtException);
                    stackIn_53_0 = (RuntimeException) (var9);
                    stackIn_51_0 = stackIn_53_0;
                    stackIn_53_1 = new StringBuilder().append("tr.<init>(").append(param0).append(',');
                    stackIn_51_1 = stackIn_53_1;
                    if (param1 == null) {
                        statePc = 53;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    stackIn_54_0 = (RuntimeException) ((Object) stackIn_51_0);
                    stackIn_54_1 = (StringBuilder) ((Object) stackIn_51_1);
                    stackIn_54_2 = "{...}";
                    statePc = 54;
                    continue stateLoop;
                }
                case 53: {
                    stackIn_54_0 = (RuntimeException) ((Object) stackIn_53_0);
                    stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
                    stackIn_54_2 = "null";
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    throw wn.a((Throwable) ((Object) stackIn_54_0), stackIn_54_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
                }
                case 55: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_e = "<col=DE9200>Compete</col>";
        field_d = "This game option is only available to members.";
        field_O = "Friends can be added in multiplayer<nbsp>games";
    }
}
