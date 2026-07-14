/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og extends tc {
    static int field_m;
    static String field_t;
    at field_k;
    int field_q;
    static int[] field_p;
    static String field_l;
    String field_o;
    static String field_n;
    static String field_r;
    static String field_u;
    int field_s;

    og(int param0, int param1) {
        this(param0, param1, (String) null);
    }

    final static void a(int param0, boolean param1) {
        if (ik.field_d != null) {
          if (ik.field_d.a((byte) 102, param1)) {
            ik.field_d = null;
            if (param0 != 16756) {
              og.a(-87, true);
              return;
            } else {
              return;
            }
          } else {
            if (param0 == 16756) {
              return;
            } else {
              og.a(-87, true);
              return;
            }
          }
        } else {
          if (param0 == 16756) {
            return;
          } else {
            og.a(-87, true);
            return;
          }
        }
    }

    public final String toString() {
        if (!(((og) this).field_q != rn.field_c)) {
            return "Method{" + ((og) this).field_o + "}";
        }
        if (!(gg.field_G != ((og) this).field_q)) {
            return "Number{" + ((og) this).field_o + "}";
        }
        if (gb.field_z == ((og) this).field_q) {
            return "Boolean{" + ((og) this).field_o + "}";
        }
        if (!(((og) this).field_q != hf.field_h)) {
            return "Char{" + ((og) this).field_o + "}";
        }
        if (!(((og) this).field_q != iu.field_x)) {
            return "String{" + ((og) this).field_o + "}";
        }
        if (!(mo.field_j != ((og) this).field_q)) {
            return "ArgStart";
        }
        if (gm.field_d == ((og) this).field_q) {
            return "ArgEnd";
        }
        if (!(((og) this).field_q != sb.field_d)) {
            return "ArgComma";
        }
        return "Unknown";
    }

    final static void a(long param0, int param1, String param2) {
        qd.field_G = param2;
        rs.field_t = 2;
        CharSequence var5 = (CharSequence) (Object) param2;
        wm.field_b = k.a(var5, false);
        dj.field_e = param0;
        hh.a((byte) 118);
        if (param1 != 1) {
            field_r = null;
        }
    }

    final nd a(int param0, dr[] param1) throws cb, ef {
        NumberFormatException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        Object var5 = null;
        og var5_ref = null;
        int var6 = 0;
        nd[] var7 = null;
        nd[] var8 = null;
        String var9 = null;
        nd stackIn_9_0 = null;
        nd stackIn_14_0 = null;
        nd stackIn_17_0 = null;
        nd stackIn_21_0 = null;
        nd stackIn_23_0 = null;
        nd stackIn_27_0 = null;
        nd stackIn_33_0 = null;
        nd stackIn_36_0 = null;
        nd stackOut_8_0 = null;
        nd stackOut_13_0 = null;
        nd stackOut_16_0 = null;
        nd stackOut_20_0 = null;
        nd stackOut_22_0 = null;
        nd stackOut_26_0 = null;
        nd stackOut_32_0 = null;
        nd stackOut_35_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = null;
                    var6 = ArmiesOfGielinor.field_M ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == 1) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        og.a(64, true);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (((og) this).field_q == rn.field_c) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var7 = new nd[((og) this).field_k.b(false)];
                        var8 = var7;
                        var4 = 0;
                        var5_ref = (og) (Object) ((og) this).field_k.e((byte) 106);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var5_ref == null) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var4++;
                        var7[var4] = var5_ref.a(1, param1);
                        var5_ref = (og) (Object) var5_ref.field_k.a((byte) 123);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = na.a(param1, (byte) 2, var8, var5_ref.field_o);
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return (nd) (Object) stackIn_9_0;
                }
                case 10: {
                    try {
                        if (var5_ref.field_q == gg.field_G) {
                            statePc = 12;
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
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var3_int = Character.toLowerCase(var5_ref.field_o.charAt(-1 + var5_ref.field_o.length()));
                        if (102 != var3_int) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = new nd(Float.valueOf(var5_ref.field_o).floatValue());
                        stackIn_14_0 = stackOut_13_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return (nd) (Object) stackIn_14_0;
                }
                case 15: {
                    try {
                        if (var3_int != 108) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = new nd(Long.parseLong(var5_ref.field_o.substring(0, var5_ref.field_o.length() + -1)));
                        stackIn_17_0 = stackOut_16_0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return (nd) (Object) stackIn_17_0;
                }
                case 18: {
                    try {
                        if (0 != (var5_ref.field_o.indexOf('.') ^ -1)) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = new nd(Double.valueOf(var5_ref.field_o).doubleValue());
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
                    return (nd) (Object) stackIn_21_0;
                }
                case 22: {
                    try {
                        stackOut_22_0 = new nd(Integer.parseInt(var5_ref.field_o));
                        stackIn_23_0 = stackOut_22_0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return (nd) (Object) stackIn_23_0;
                }
                case 24: {
                    try {
                        if (gb.field_z == var5_ref.field_q) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackOut_26_0 = new nd(var5_ref.field_o.equals((Object) (Object) "true"));
                        stackIn_27_0 = stackOut_26_0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 27: {
                    return (nd) (Object) stackIn_27_0;
                }
                case 28: {
                    try {
                        if (hf.field_h == var5_ref.field_q) {
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
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var9 = var5_ref.field_o.substring(1, -1 + var5_ref.field_o.length());
                        if (var9.length() == 1) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw new cb("Invalid char value: " + var9);
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackOut_32_0 = new nd(var9.charAt(0));
                        stackIn_33_0 = stackOut_32_0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 33: {
                    return (nd) (Object) stackIn_33_0;
                }
                case 34: {
                    try {
                        if (iu.field_x != var5_ref.field_q) {
                            statePc = 38;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackOut_35_0 = new nd((Object) (Object) var5_ref.field_o.substring(1, var5_ref.field_o.length() - 1));
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
                    return (nd) (Object) stackIn_36_0;
                }
                case 37: {
                    var3 = (NumberFormatException) (Object) caughtException;
                    throw new cb("NumberFormatException on: " + var5_ref.field_o);
                }
                case 38: {
                    throw new IllegalArgumentException();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(boolean param0) {
        field_n = null;
        field_p = null;
        field_l = null;
        field_r = null;
        if (!param0) {
            return;
        }
        field_t = null;
        field_u = null;
    }

    og(int param0, int param1, String param2) {
        ((og) this).field_q = param0;
        ((og) this).field_o = param2;
        ((og) this).field_s = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Most Mana spent";
        field_n = "Tower";
        field_l = "Missions completed: <%0> of <%1>";
        field_r = "(Leader)";
        field_u = "Campaign Selection";
    }
}
