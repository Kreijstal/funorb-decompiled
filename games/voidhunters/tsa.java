/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tsa extends ksa {
    String field_d;
    int field_e;
    static int field_h;
    int field_g;
    ij field_f;

    public final String toString() {
        if (((tsa) this).field_e != hpa.field_p) {
          if (fwa.field_h == ((tsa) this).field_e) {
            return "Number{" + ((tsa) this).field_d + "}";
          } else {
            if (io.field_p == ((tsa) this).field_e) {
              return "Boolean{" + ((tsa) this).field_d + "}";
            } else {
              if (((tsa) this).field_e == ek.field_o) {
                return "Char{" + ((tsa) this).field_d + "}";
              } else {
                if (dla.field_d != ((tsa) this).field_e) {
                  if (((tsa) this).field_e != wdb.field_vb) {
                    if (ua.field_o == ((tsa) this).field_e) {
                      return "ArgEnd";
                    } else {
                      if (jwa.field_l == ((tsa) this).field_e) {
                        return "ArgComma";
                      } else {
                        return "Unknown";
                      }
                    }
                  } else {
                    return "ArgStart";
                  }
                } else {
                  return "String{" + ((tsa) this).field_d + "}";
                }
              }
            }
          }
        } else {
          return "Method{" + ((tsa) this).field_d + "}";
        }
    }

    final nc a(byte param0, rqa[] param1) throws gva, ojb {
        NumberFormatException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        Object var5 = null;
        tsa var5_ref = null;
        int var6 = 0;
        nc[] var7 = null;
        nc[] var8 = null;
        String var9 = null;
        nc stackIn_8_0 = null;
        nc stackIn_14_0 = null;
        nc stackIn_17_0 = null;
        nc stackIn_21_0 = null;
        nc stackIn_23_0 = null;
        nc stackIn_27_0 = null;
        nc stackIn_33_0 = null;
        nc stackIn_37_0 = null;
        Throwable decompiledCaughtException = null;
        nc stackOut_7_0 = null;
        nc stackOut_13_0 = null;
        nc stackOut_16_0 = null;
        nc stackOut_20_0 = null;
        nc stackOut_22_0 = null;
        nc stackOut_26_0 = null;
        nc stackOut_32_0 = null;
        nc stackOut_36_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5_ref = null;
                    var6 = VoidHunters.field_G;
                    if (param0 > 60) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return null;
                }
                case 2: {
                    try {
                        if (((tsa) this).field_e == hpa.field_p) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var7 = new nc[((tsa) this).field_f.c(3)];
                        var8 = var7;
                        var4 = 0;
                        var5_ref = (tsa) (Object) ((tsa) this).field_f.d(0);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 38;
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
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var4++;
                        var7[var4] = var5_ref.a((byte) 96, param1);
                        var5_ref = (tsa) (Object) var5_ref.field_f.a((byte) 69);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = fjb.a(var5_ref.field_d, var8, param1, (byte) -124);
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0;
                }
                case 9: {
                    try {
                        if (var5_ref.field_e == fwa.field_h) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var3_int = Character.toLowerCase(var5_ref.field_d.charAt(var5_ref.field_d.length() + -1));
                        if (var3_int == 102) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = new nc(Float.valueOf(var5_ref.field_d).floatValue());
                        stackIn_14_0 = stackOut_13_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return stackIn_14_0;
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
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = new nc(Long.parseLong(var5_ref.field_d.substring(0, -1 + var5_ref.field_d.length())));
                        stackIn_17_0 = stackOut_16_0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return stackIn_17_0;
                }
                case 18: {
                    try {
                        if (-1 != var5_ref.field_d.indexOf('.')) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = new nc(Double.valueOf(var5_ref.field_d).doubleValue());
                        stackIn_21_0 = stackOut_20_0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 21: {
                    return stackIn_21_0;
                }
                case 22: {
                    try {
                        stackOut_22_0 = new nc(Integer.parseInt(var5_ref.field_d));
                        stackIn_23_0 = stackOut_22_0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return stackIn_23_0;
                }
                case 24: {
                    try {
                        if (io.field_p == var5_ref.field_e) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackOut_26_0 = new nc(var5_ref.field_d.equals((Object) (Object) "true"));
                        stackIn_27_0 = stackOut_26_0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 27: {
                    return stackIn_27_0;
                }
                case 28: {
                    try {
                        if (var5_ref.field_e != ek.field_o) {
                            statePc = 34;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var9 = var5_ref.field_d.substring(1, var5_ref.field_d.length() + -1);
                        if (var9.length() != 1) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw new gva("Invalid char value: " + var9);
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackOut_32_0 = new nc(var9.charAt(0));
                        stackIn_33_0 = stackOut_32_0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 33: {
                    return stackIn_33_0;
                }
                case 34: {
                    try {
                        if (dla.field_d == var5_ref.field_e) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackOut_36_0 = new nc((Object) (Object) var5_ref.field_d.substring(1, var5_ref.field_d.length() - 1));
                        stackIn_37_0 = stackOut_36_0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 37: {
                    return stackIn_37_0;
                }
                case 38: {
                    var3 = (NumberFormatException) (Object) caughtException;
                    throw new gva("NumberFormatException on: " + var5_ref.field_d);
                }
                case 39: {
                    throw new IllegalArgumentException();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    tsa(int param0, int param1, String param2) {
        ((tsa) this).field_d = param2;
        ((tsa) this).field_e = param0;
        ((tsa) this).field_g = param1;
    }

    tsa(int param0, int param1) {
        this(param0, param1, (String) null);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = -1;
    }
}
