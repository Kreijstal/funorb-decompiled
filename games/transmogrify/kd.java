/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd implements ui {
    static String field_d;
    static oa field_c;
    static int field_a;
    static long[] field_b;

    public final void a(int param0, int param1, boolean param2, byte param3, qg param4) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        ti var8 = null;
        int var9 = 0;
        try {
          L0: {
            L1: {
              var6_int = param0 - -param4.field_p;
              var7 = param1 - -param4.field_n;
              jl.a(var6_int, var7, 13612, param4.field_l, param4.field_h);
              var8 = ai.field_b[1];
              if (!(param4 instanceof lj)) {
                break L1;
              } else {
                if (!((lj) ((Object) param4)).field_y) {
                  break L1;
                } else {
                  var8.c((param4.field_l + -var8.field_r >> -1696735679) + 1 + var6_int, 1 + (var7 - -(param4.field_h + -var8.field_s >> 1387363361)), 256);
                  break L1;
                }
              }
            }
            L2: {
              var9 = -113 / ((param3 - 51) / 47);
              if (param4.b((byte) -109)) {
                ri.a(param4.field_l + -4, var6_int + 2, var7 + 2, (byte) -86, param4.field_h + -4);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var6);

            stackIn_9_1 = new StringBuilder().append("kd.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final static void a(int param0, int param1) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_62_0 = 0;
        String stackIn_62_1 = null;
        int stackIn_62_2 = 0;
        int stackIn_63_0 = 0;
        String stackIn_63_1 = null;
        int stackIn_63_2 = 0;
        int stackIn_64_0 = 0;
        String stackIn_64_1 = null;
        int stackIn_64_2 = 0;
        int stackIn_64_3 = 0;
        int stackIn_65_0 = 0;
        String stackIn_65_1 = null;
        int stackIn_65_2 = 0;
        int stackIn_65_3 = 0;
        int stackIn_65_4 = 0;
        int stackIn_66_0 = 0;
        String stackIn_66_1 = null;
        int stackIn_66_2 = 0;
        int stackIn_66_3 = 0;
        int stackIn_66_4 = 0;
        int stackIn_67_0 = 0;
        String stackIn_67_1 = null;
        int stackIn_67_2 = 0;
        int stackIn_67_3 = 0;
        int stackIn_67_4 = 0;
        int stackIn_67_5 = 0;
        int stackIn_97_0 = 0;
        int stackIn_97_1 = 0;
        int stackIn_104_0 = 0;
        int stackIn_104_1 = 0;
        int stackIn_114_0 = 0;
        int stackIn_114_1 = 0;
        int stackIn_114_2 = 0;
        int stackIn_114_3 = 0;
        int stackIn_114_4 = 0;
        int stackIn_115_0 = 0;
        int stackIn_115_1 = 0;
        int stackIn_115_2 = 0;
        int stackIn_115_3 = 0;
        int stackIn_115_4 = 0;
        int stackIn_116_0 = 0;
        int stackIn_116_1 = 0;
        int stackIn_116_2 = 0;
        int stackIn_116_3 = 0;
        int stackIn_116_4 = 0;
        int stackIn_116_5 = 0;
        int stackIn_117_0 = 0;
        int stackIn_117_1 = 0;
        int stackIn_117_2 = 0;
        int stackIn_117_3 = 0;
        int stackIn_117_4 = 0;
        int stackIn_118_0 = 0;
        int stackIn_118_1 = 0;
        int stackIn_118_2 = 0;
        int stackIn_118_3 = 0;
        int stackIn_118_4 = 0;
        int stackIn_119_0 = 0;
        int stackIn_119_1 = 0;
        int stackIn_119_2 = 0;
        int stackIn_119_3 = 0;
        int stackIn_119_4 = 0;
        int stackIn_119_5 = 0;
        Throwable caughtException = null;
        int statePc = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4_int = 0;
        ti var4 = null;
        Object var5_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        Object var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        pi var15 = null;
        ti var16 = null;
        StringBuilder var17 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    dh.field_B.f(0, param1);
                    if (qk.field_e == null) {
                        statePc = 4;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (qk.field_e.length >= ej.field_p.length()) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    qk.field_e = new int[ej.field_p.length()];
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    var2_int = dc.field_a % 750;
                    var3 = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if ((var3 ^ -1) <= (qk.field_e.length ^ -1)) {
                        statePc = 18;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    stackIn_19_0 = 150;
                    stackIn_8_0 = stackIn_19_0;
                    stackIn_19_1 = var2_int;
                    stackIn_8_1 = stackIn_19_1;
                    if (var14 != 0) {
                        statePc = 19;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (stackIn_8_0 > stackIn_8_1) {
                        statePc = 11;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if ((var2_int ^ -1) > -251) {
                        statePc = 13;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    qk.field_e[var3] = 0;
                    if (var14 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    qk.field_e[var3] = (int)(5.0 * Math.sin((double)(var2_int + -250) / 5.0));
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    var2_int--;
                    if (0 > var2_int) {
                        statePc = 16;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var2_int += 750;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    var3++;
                    if (var14 == 0) {
                        statePc = 6;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var3 = hk.field_a.a(ej.field_p);
                    hk.field_a.b(10325023, -1);
                    hk.field_a.a(ej.field_p, 34 - -(12 * wl.field_K.field_n + -var3 >> -1118939903), param1 + ((-hk.field_a.field_y + wl.field_K.field_m - hk.field_a.field_t >> 508904449) + 114 - -hk.field_a.field_y), (int[]) null, qk.field_e);
                    stackIn_19_0 = 0;
                    stackIn_19_1 = jl.field_j;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (stackIn_19_0 > stackIn_19_1) {
                        statePc = 33;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (3 <= jl.field_j) {
                        statePc = 33;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var4_int = 10;
                    var5_ref = null;
                    if (jl.field_j == 0) {
                        statePc = 23;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var5_ref = sh.field_a + qi.field_c.field_h;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if ((jl.field_j ^ -1) == -2) {
                        statePc = 26;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 26: {
                    ob.a(1, 0, sg.field_p, dc.field_a);
                    var4_int = var4_int + (tj.field_s.field_m - hk.field_a.field_y);
                    var5_ref = ll.field_W;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if ((jl.field_j ^ -1) == -3) {
                        statePc = 29;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var5_ref = nl.field_g;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if (var5_ref == null) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var6 = 4 + (hk.field_a.field_t + hk.field_a.field_y);
                    var7 = hk.field_a.b((String) (var5_ref), 160) * var6;
                    dk.a(var4_int + 10 + var7, mk.field_B, -28018, 451, o.field_i + 237 - -param1, 180);
                    hk.field_a.a((String) (var5_ref), 461, o.field_i + 247 - -param1, 160, var7, 0, -1, 1, 0, var6);
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    if (var14 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (qe.field_F == null) {
                        statePc = 38;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var16 = qe.field_F[rd.field_c[gk.field_e]];
                    var4 = var16;
                    if ((jl.field_j ^ -1) == -4) {
                        statePc = 37;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var4.c(413, param1 + (-var16.field_l + 480) - var16.field_m);
                    if (var14 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var5 = o.field_i + 413;
                    var6 = 30 + -((o.field_i * 30 + -3420) * (o.field_i - 114) / 12996);
                    var4.c(var5, var6 + (-var16.field_l + 480 - (var16.field_m - param1)));
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    var17 = new StringBuilder(4);
                    var5 = wk.field_c / 50;
                    if (param0 > 84) {
                        statePc = 40;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    kd.a(1);
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    var6 = var5 / 60;
                    var5 = var5 % 60;
                    if ((var6 ^ -1) >= -100) {
                        statePc = 43;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    discarded$0 = var17.append("****");
                    if (var14 == 0) {
                        statePc = 44;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    discarded$1 = var17.append((char)(48 + var6 / 10));
                    discarded$2 = var17.append((char)(var6 % 10 + 48));
                    discarded$3 = var17.append(':');
                    discarded$4 = var17.append((char)(var5 / 10 + 48));
                    discarded$5 = var17.append((char)(var5 % 10 + 48));
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    wf.field_d.a(var17.toString(), 250, 333 + param1, 255, -1);
                    var7 = ni.a((byte) -111);
                    if (-11 == (n.field_a ^ -1)) {
                        statePc = 48;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if (!mg.field_d) {
                        statePc = 53;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (2 != n.field_a) {
                        statePc = 53;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (2 <= re.field_A) {
                        statePc = 51;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    pa.a(376 - -param1, pd.field_c, 39935, 8421504, 164, 8421504, 264, -10, 39935);
                    if (var14 == 0) {
                        statePc = 61;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    pa.a(376 + param1, pd.field_c, 39935, 16776867, 164, 16710412, 264, -10, 39935);
                    if (var14 == 0) {
                        statePc = 61;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if (var7 < 0) {
                        statePc = 60;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if ((re.field_A ^ -1) > -7) {
                        statePc = 60;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (!mg.field_d) {
                        statePc = 59;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    if (n.field_a != 0) {
                        statePc = 59;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    if (var7 <= 0) {
                        statePc = 59;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    var8_int = 128 - -(int)(Math.sin(3.141592653589793 * (double)dc.field_a / 50.0) * 64.0);
                    fg.a(param1 + 376, 264, (byte) 98, 164, 13, jk.field_x.a(true) - 10, pj.field_x, var8_int);
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    pa.a(param1 + 376, tj.field_z + var7, 39935, 16776867, 164, 16710412, 264, -10, 39935);
                    if (var14 == 0) {
                        statePc = 61;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    pa.a(param1 + 376, da.field_z, 39935, 8421504, 164, 8421504, 264, -10, 39935);
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    stackIn_63_0 = param1 + 376;
                    stackIn_62_0 = stackIn_63_0;
                    stackIn_63_1 = th.field_b;
                    stackIn_62_1 = stackIn_63_1;
                    stackIn_63_2 = 16711680;
                    stackIn_62_2 = stackIn_63_2;
                    if (re.field_A != 6) {
                        statePc = 63;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    stackIn_64_0 = stackIn_62_0;
                    stackIn_64_1 = (String) ((Object) stackIn_62_1);
                    stackIn_64_2 = stackIn_62_2;
                    stackIn_64_3 = 16776867;
                    statePc = 64;
                    continue stateLoop;
                }
                case 63: {
                    stackIn_64_0 = stackIn_63_0;
                    stackIn_64_1 = (String) ((Object) stackIn_63_1);
                    stackIn_64_2 = stackIn_63_2;
                    stackIn_64_3 = 8421504;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    stackIn_66_0 = stackIn_64_0;
                    stackIn_65_0 = stackIn_66_0;
                    stackIn_66_1 = (String) ((Object) stackIn_64_1);
                    stackIn_65_1 = stackIn_66_1;
                    stackIn_66_2 = stackIn_64_2;
                    stackIn_65_2 = stackIn_66_2;
                    stackIn_66_3 = stackIn_64_3;
                    stackIn_65_3 = stackIn_66_3;
                    stackIn_66_4 = 108;
                    stackIn_65_4 = stackIn_66_4;
                    if ((re.field_A ^ -1) != -7) {
                        statePc = 66;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    stackIn_67_0 = stackIn_65_0;
                    stackIn_67_1 = (String) ((Object) stackIn_65_1);
                    stackIn_67_2 = stackIn_65_2;
                    stackIn_67_3 = stackIn_65_3;
                    stackIn_67_4 = stackIn_65_4;
                    stackIn_67_5 = 16710412;
                    statePc = 67;
                    continue stateLoop;
                }
                case 66: {
                    stackIn_67_0 = stackIn_66_0;
                    stackIn_67_1 = (String) ((Object) stackIn_66_1);
                    stackIn_67_2 = stackIn_66_2;
                    stackIn_67_3 = stackIn_66_3;
                    stackIn_67_4 = stackIn_66_4;
                    stackIn_67_5 = 8421504;
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    pa.a(stackIn_67_0, stackIn_67_1, stackIn_67_2, stackIn_67_3, stackIn_67_4, stackIn_67_5, 134, -10, 16711680);
                    if (3 == re.field_A) {
                        statePc = 70;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if (re.field_A != 4) {
                        statePc = 72;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    od.field_g.a(false, dc.field_a, 3, il.field_c, param1);
                    si.field_i.a(false, dc.field_a, 3, wc.field_a, param1);
                    od.field_g.a(true, dc.field_a, 3, il.field_c, param1);
                    si.field_i.a(true, dc.field_a, 3, wc.field_a, param1);
                    if (var14 == 0) {
                        statePc = 78;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if (-1 == (re.field_A ^ -1)) {
                        statePc = 76;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    if ((re.field_A ^ -1) > -7) {
                        statePc = 75;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    var8 = lb.field_g;
                    if (var14 == 0) {
                        statePc = 77;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    var8 = hd.field_c;
                    if (var14 == 0) {
                        statePc = 77;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    var8 = hf.field_f;
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    od.field_g.a(false, dc.field_a, 3, (int[][]) (var8), param1);
                    wk.field_a.a(false, dc.field_a, 3, (int[][]) (var8), param1);
                    si.field_i.a(false, dc.field_a, 3, (int[][]) (var8), param1);
                    od.field_g.a(true, dc.field_a, 3, (int[][]) (var8), param1);
                    wk.field_a.a(true, dc.field_a, 3, (int[][]) (var8), param1);
                    si.field_i.a(true, dc.field_a, 3, (int[][]) (var8), param1);
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    if (0 != n.field_a) {
                        statePc = 89;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    var8 = null;
                    if (re.field_A != 1) {
                        statePc = 81;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    var8 = tb.field_b[0];
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    if (2 != re.field_A) {
                        statePc = 83;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    var8 = tb.field_b[1];
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    if ((re.field_A ^ -1) == -5) {
                        statePc = 85;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 85: {
                    var8 = tb.field_b[2];
                    statePc = 86;
                    continue stateLoop;
                }
                case 86: {
                    if (var8 == null) {
                        statePc = 89;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    if (-51 >= (dc.field_a ^ -1)) {
                        statePc = 89;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    var9 = ((ti) (var8)).field_n * (100 + -(2 * dc.field_a)) / 50;
                    var10 = ((ti) (var8)).field_m * (-(2 * dc.field_a) + 100) / 50;
                    ((ti) (var8)).b(-var9 + 640 >> -712649855, 480 - var10 >> -743589215, var9, var10);
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    if (null != sg.field_d) {
                        statePc = 91;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 91: {
                    sg.field_d.a(dc.field_a, param1, 1, 0);
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    if ((n.field_a ^ -1) < -1) {
                        statePc = 94;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 94: {
                    var8_int = eg.field_b % 58;
                    var9 = 0;
                    statePc = 95;
                    continue stateLoop;
                }
                case 95: {
                    if ((fg.field_i.length ^ -1) >= (var9 ^ -1)) {
                        statePc = 102;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    var10 = -var9 + var8_int >> -1653626173;
                    var11 = (fg.field_i[var9] - -(10 * (eg.field_b / 58))) % 187;
                    var12 = var11 - -442;
                    var13 = (n.field_a + -1) * 12 + vl.field_G[var9];
                    stackIn_104_0 = -1;
                    stackIn_97_0 = stackIn_104_0;
                    stackIn_104_1 = var10 ^ -1;
                    stackIn_97_1 = stackIn_104_1;
                    if (var14 != 0) {
                        statePc = 104;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    if (stackIn_97_0 < stackIn_97_1) {
                        statePc = 101;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    if (-6 < (var10 ^ -1)) {
                        statePc = 100;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 100: {
                    hf.field_d[cc.field_f[var9] * 5 + var10].c(var12, var13 + param1);
                    statePc = 101;
                    continue stateLoop;
                }
                case 101: {
                    var9++;
                    if (var14 == 0) {
                        statePc = 95;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    var8_int = 0;
                    statePc = 103;
                    continue stateLoop;
                }
                case 103: {
                    stackIn_104_0 = n.field_a;
                    stackIn_104_1 = var8_int;
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    if (stackIn_104_0 <= stackIn_104_1) {
                        statePc = 108;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    hk.field_a.a(var8_int + 1 + ". ", 464, 53 + (12 * var8_int + param1), 16711680, -1);
                    hk.field_a.b(vi.field_g[var8_int].toString(), 464, param1 + (12 * var8_int + 53), 16711680, -1);
                    hk.field_a.a(Integer.toString(vi.field_a[var8_int]), 627, param1 + 12 * var8_int + 53, 16711680, -1);
                    var8_int++;
                    if (var14 != 0) {
                        statePc = 109;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    if (var14 == 0) {
                        statePc = 103;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    hk.field_a.b(sg.field_k, 464, param1 + 173, 16711680, -1);
                    hk.field_a.a(Integer.toString(ce.field_c), 627, 173 + param1, 16711680, -1);
                    statePc = 109;
                    continue stateLoop;
                }
                case 109: {
                    if ((n.field_a ^ -1) != -11) {
                        statePc = 111;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    hk.field_a.b(ub.field_e, 464, 185 - -param1, 16711680, -1);
                    hk.field_a.a(Integer.toString(wk.field_d), 627, 185 + param1, 16711680, -1);
                    statePc = 111;
                    continue stateLoop;
                }
                case 111: {
                    hk.field_a.b(ve.field_D, 464, 197 - -param1, 16711680, -1);
                    hk.field_a.a(Integer.toString(eh.field_a), 627, 197 - -param1, 16711680, -1);
                    if (ad.field_e) {
                        statePc = 113;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 113: {
                    dk.a(136, mk.field_B, -28018, 180, param1 + 88, 280);
                    wf.field_d.a(he.field_g, 190, param1 + 93, 260, 80, 0, -1, 1, 0, wf.field_d.field_y + 3);
                    stackIn_115_0 = 65280;
                    stackIn_114_0 = stackIn_115_0;
                    stackIn_115_1 = 80;
                    stackIn_114_1 = stackIn_115_1;
                    stackIn_115_2 = 16776867;
                    stackIn_114_2 = stackIn_115_2;
                    stackIn_115_3 = 16710412;
                    stackIn_114_3 = stackIn_115_3;
                    stackIn_115_4 = param1 + 183;
                    stackIn_114_4 = stackIn_115_4;
                    if (0 != a.field_S.field_d) {
                        statePc = 115;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    stackIn_116_0 = stackIn_114_0;
                    stackIn_116_1 = stackIn_114_1;
                    stackIn_116_2 = stackIn_114_2;
                    stackIn_116_3 = stackIn_114_3;
                    stackIn_116_4 = stackIn_114_4;
                    stackIn_116_5 = 1;
                    statePc = 116;
                    continue stateLoop;
                }
                case 115: {
                    stackIn_116_0 = stackIn_115_0;
                    stackIn_116_1 = stackIn_115_1;
                    stackIn_116_2 = stackIn_115_2;
                    stackIn_116_3 = stackIn_115_3;
                    stackIn_116_4 = stackIn_115_4;
                    stackIn_116_5 = 0;
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    jk.a(stackIn_116_0, stackIn_116_1, stackIn_116_2, stackIn_116_3, stackIn_116_4, stackIn_116_5 != 0, il.field_a, 224, 65280, (byte) -50);
                    stackIn_118_0 = 16711680;
                    stackIn_117_0 = stackIn_118_0;
                    stackIn_118_1 = 80;
                    stackIn_117_1 = stackIn_118_1;
                    stackIn_118_2 = 16776867;
                    stackIn_117_2 = stackIn_118_2;
                    stackIn_118_3 = 16710412;
                    stackIn_117_3 = stackIn_118_3;
                    stackIn_118_4 = param1 + 183;
                    stackIn_117_4 = stackIn_118_4;
                    if (1 != a.field_S.field_d) {
                        statePc = 118;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    stackIn_119_0 = stackIn_117_0;
                    stackIn_119_1 = stackIn_117_1;
                    stackIn_119_2 = stackIn_117_2;
                    stackIn_119_3 = stackIn_117_3;
                    stackIn_119_4 = stackIn_117_4;
                    stackIn_119_5 = 1;
                    statePc = 119;
                    continue stateLoop;
                }
                case 118: {
                    stackIn_119_0 = stackIn_118_0;
                    stackIn_119_1 = stackIn_118_1;
                    stackIn_119_2 = stackIn_118_2;
                    stackIn_119_3 = stackIn_118_3;
                    stackIn_119_4 = stackIn_118_4;
                    stackIn_119_5 = 0;
                    statePc = 119;
                    continue stateLoop;
                }
                case 119: {
                    jk.a(stackIn_119_0, stackIn_119_1, stackIn_119_2, stackIn_119_3, stackIn_119_4, stackIn_119_5 != 0, nh.field_h, 336, 16711680, (byte) 111);
                    statePc = 120;
                    continue stateLoop;
                }
                case 120: {
                    if (!ll.field_S) {
                        statePc = 122;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    wf.field_d.a("FPS: " + ub.field_a, 630, 30, 65535, -1);
                    wf.field_d.a("LPS: " + oc.field_y, 630, 60, 65535, -1);
                    statePc = 122;
                    continue stateLoop;
                }
                case 122: {
                    var15 = (pi) ((Object) oj.field_u.a((byte) -95));
                    var8 = var15;
                    if (var8 == null) {
                        statePc = 129;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    var10 = da.field_C;
                    if (-81 < (var10 ^ -1)) {
                        statePc = 127;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    if (var10 >= 230) {
                        statePc = 126;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    var9 = 8;
                    if (var14 == 0) {
                        statePc = 128;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    var9 = -(var10 / 2) + 123;
                    if (var14 == 0) {
                        statePc = 128;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    var9 = -32 + var10 / 2;
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    jk.field_x.a(16776867, var9 - 5, 3, 56 + wf.field_d.a(qj.field_a[var15.field_i]), 0, 16776867);
                    fc.field_h[var15.field_i].e(8, var9);
                    wf.field_d.b(qj.field_a[var15.field_i], 48, var9 - -wf.field_d.field_y, 0, -1);
                    statePc = 129;
                    continue stateLoop;
                }
                case 129: {
                    var9 = sb.field_h[(2147483647 & nc.field_t) % sb.field_h.length];
                    vh.field_n = vh.field_n - var9;
                    hf.field_j = hf.field_j - var9;
                    statePc = 132;
                    continue stateLoop;
                }
                case 132: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        field_b = null;
        if (param0 > -58) {
            kd.a(20);
        }
    }

    static {
        field_d = "Names cannot start or end with space or underscore";
        field_b = new long[32];
    }
}
