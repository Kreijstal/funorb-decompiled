/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mi extends vg {
    vna field_i;
    static String field_n;
    static int[] field_l;
    static int field_k;
    String field_m;
    static int field_g;
    int field_h;
    static boolean field_o;
    int field_p;
    static String field_j;
    static int field_f;

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        apa var9 = null;
        int var10 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        apa stackIn_15_0 = null;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        apa stackOut_14_0 = null;
        apa stackOut_13_0 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        var1 = aqa.field_d + -wt.field_a;
        wt.field_a = -(var1 >> -2125569119) + gda.field_a;
        aqa.field_d = wt.field_a - -var1;
        wp.field_b = -(aa.field_c >> -1502177279) + qi.field_N;
        var2 = wp.field_b;
        if (param0 <= 79) {
          return;
        } else {
          var3 = 0;
          L0: while (true) {
            if (cna.field_b.length <= var3) {
              return;
            } else {
              L1: {
                var4 = f.field_c[var3];
                if ((var4 ^ -1) > -1) {
                  var5 = cka.field_H;
                  break L1;
                } else {
                  if (lp.field_h.field_h == var4) {
                    var5 = fv.field_a;
                    break L1;
                  } else {
                    var5 = sua.field_I;
                    break L1;
                  }
                }
              }
              L2: {
                var6 = cna.field_b[var3];
                stackOut_8_0 = -50;
                stackIn_10_0 = stackOut_8_0;
                stackIn_9_0 = stackOut_8_0;
                if (var4 < 0) {
                  stackOut_10_0 = stackIn_10_0;
                  stackOut_10_1 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  break L2;
                } else {
                  stackOut_9_0 = stackIn_9_0;
                  stackOut_9_1 = 1;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  break L2;
                }
              }
              L3: {
                var7 = apa.a((byte) stackIn_11_0, stackIn_11_1 != 0, var6);
                var8 = -(var7 >> 1547607329) + gda.field_a;
                if ((var4 ^ -1) > -1) {
                  break L3;
                } else {
                  L4: {
                    if (lp.field_h.field_h == var4) {
                      stackOut_14_0 = pua.field_c;
                      stackIn_15_0 = stackOut_14_0;
                      break L4;
                    } else {
                      stackOut_13_0 = wua.field_o;
                      stackIn_15_0 = stackOut_13_0;
                      break L4;
                    }
                  }
                  L5: {
                    var9 = stackIn_15_0;
                    var2 = var2 + aqa.field_a;
                    if (var9 != null) {
                      var9.a((byte) 57, (vra.field_a << 555621633) + var7, var2, var8 + -vra.field_a, am.field_n + (vf.field_d << -466273471));
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var2 = var2 + vf.field_d;
                  break L3;
                }
              }
              if (0 > var4) {
                kl.field_b.c(var6, var8, sb.field_d + var2, var5, -1);
                var2 = var2 + uda.field_x;
                var3++;
                var3++;
                continue L0;
              } else {
                bta.field_d.c(var6, var8, var2 + vo.field_f, var5, -1);
                var2 = var2 + (aqa.field_a + vf.field_d - -am.field_n);
                var3++;
                var3++;
                continue L0;
              }
            }
          }
        }
    }

    public final String toString() {
        if (!(tr.field_f != ((mi) this).field_p)) {
            return "Method{" + ((mi) this).field_m + "}";
        }
        if (!(((mi) this).field_p != dc.field_o)) {
            return "Number{" + ((mi) this).field_m + "}";
        }
        if (!(dja.field_r != ((mi) this).field_p)) {
            return "Boolean{" + ((mi) this).field_m + "}";
        }
        if (!(nl.field_d != ((mi) this).field_p)) {
            return "Char{" + ((mi) this).field_m + "}";
        }
        if (ma.field_e == ((mi) this).field_p) {
            return "String{" + ((mi) this).field_m + "}";
        }
        if (lna.field_a == ((mi) this).field_p) {
            return "ArgStart";
        }
        if (!(rs.field_a != ((mi) this).field_p)) {
            return "ArgEnd";
        }
        if (!(((mi) this).field_p != qba.field_c)) {
            return "ArgComma";
        }
        return "Unknown";
    }

    mi(int param0, int param1) {
        this(param0, param1, (String) null);
    }

    public static void a(byte param0) {
        if (param0 != 101) {
          mi.a((byte) -114);
          field_l = null;
          field_n = null;
          field_j = null;
          return;
        } else {
          field_l = null;
          field_n = null;
          field_j = null;
          return;
        }
    }

    mi(int param0, int param1, String param2) {
        ((mi) this).field_p = param0;
        ((mi) this).field_m = param2;
        ((mi) this).field_h = param1;
    }

    final bfa a(int param0, ela[] param1) throws rv, jj {
        NumberFormatException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        Object var5 = null;
        mi var5_ref = null;
        int var6 = 0;
        bfa[] var7 = null;
        bfa[] var8 = null;
        String var9 = null;
        bfa stackIn_8_0 = null;
        bfa stackIn_12_0 = null;
        bfa stackIn_16_0 = null;
        bfa stackIn_19_0 = null;
        bfa stackIn_21_0 = null;
        bfa stackIn_25_0 = null;
        bfa stackIn_32_0 = null;
        bfa stackIn_36_0 = null;
        Throwable decompiledCaughtException = null;
        bfa stackOut_7_0 = null;
        bfa stackOut_18_0 = null;
        bfa stackOut_20_0 = null;
        bfa stackOut_24_0 = null;
        bfa stackOut_11_0 = null;
        bfa stackOut_15_0 = null;
        bfa stackOut_31_0 = null;
        bfa stackOut_35_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5_ref = null;
                    var6 = TombRacer.field_G ? 1 : 0;
                    if (param0 == -1) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    ((mi) this).field_m = null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    try {
                        if (tr.field_f == ((mi) this).field_p) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var7 = new bfa[((mi) this).field_i.a((byte) -16)];
                        var8 = var7;
                        var4 = 0;
                        var5_ref = (mi) (Object) ((mi) this).field_i.f(-80);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var5_ref == null) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var4++;
                        var7[var4] = var5_ref.a(-1, param1);
                        var5_ref = (mi) (Object) var5_ref.field_i.e(114);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = pc.a(param1, 19, var5_ref.field_m, var8);
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0;
                }
                case 9: {
                    try {
                        if (dc.field_o != var5_ref.field_p) {
                            statePc = 22;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var3_int = Character.toLowerCase(var5_ref.field_m.charAt(var5_ref.field_m.length() - 1));
                        if (var3_int != 102) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = new bfa(Float.valueOf(var5_ref.field_m).floatValue());
                        stackIn_12_0 = stackOut_11_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return stackIn_12_0;
                }
                case 13: {
                    try {
                        if (var3_int == 108) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = new bfa(Long.parseLong(var5_ref.field_m.substring(0, var5_ref.field_m.length() + -1)));
                        stackIn_16_0 = stackOut_15_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return stackIn_16_0;
                }
                case 17: {
                    try {
                        if ((var5_ref.field_m.indexOf('.') ^ -1) == 0) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackOut_18_0 = new bfa(Double.valueOf(var5_ref.field_m).doubleValue());
                        stackIn_19_0 = stackOut_18_0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 19: {
                    return stackIn_19_0;
                }
                case 20: {
                    try {
                        stackOut_20_0 = new bfa(Integer.parseInt(var5_ref.field_m));
                        stackIn_21_0 = stackOut_20_0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 21: {
                    return stackIn_21_0;
                }
                case 22: {
                    try {
                        if (dja.field_r == var5_ref.field_p) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackOut_24_0 = new bfa(var5_ref.field_m.equals((Object) (Object) "true"));
                        stackIn_25_0 = stackOut_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 25: {
                    return stackIn_25_0;
                }
                case 26: {
                    try {
                        if (var5_ref.field_p == nl.field_d) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var9 = var5_ref.field_m.substring(1, var5_ref.field_m.length() + -1);
                        if (-2 != (var9.length() ^ -1)) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw new rv("Invalid char value: " + var9);
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackOut_31_0 = new bfa(var9.charAt(0));
                        stackIn_32_0 = stackOut_31_0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 32: {
                    return stackIn_32_0;
                }
                case 33: {
                    try {
                        if (ma.field_e == var5_ref.field_p) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackOut_35_0 = new bfa((Object) (Object) var5_ref.field_m.substring(1, -1 + var5_ref.field_m.length()));
                        stackIn_36_0 = stackOut_35_0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 36: {
                    return stackIn_36_0;
                }
                case 37: {
                    var3 = (NumberFormatException) (Object) caughtException;
                    throw new rv("NumberFormatException on: " + var5_ref.field_m);
                }
                case 38: {
                    throw new IllegalArgumentException();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new int[]{15, 35, 12, 7, 18, 33};
        field_n = "You cannot chat to <%0> because <%0> is offline in your friend list.";
        field_k = 33;
        field_j = "Players";
        field_o = false;
        field_f = -1;
    }
}
