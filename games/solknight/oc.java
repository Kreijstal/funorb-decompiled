/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc {
    private da field_c;
    static java.awt.Frame field_a;
    private da field_b;
    static String field_e;
    private v field_d;

    final ba a(byte param0, int param1) {
        ba var3;
        byte[] var4;
        ba var5;
        var3 = (ba) (this.field_d.a(0, (long)param1));
        if (var3 != null) {
          return var3;
        } else {
          L0: {
            L1: {
              if ((param1 ^ -1) <= -32769) {
                break L1;
              } else {
                var4 = this.field_c.b(1, param0 + 12366, param1);
                if (!SolKnight.field_L) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var4 = this.field_b.b(1, 12257, param1 & 32767);
            break L0;
          }
          var5 = new ba();
          if (param0 == -109) {
            if (var4 == null) {
              if (32768 <= param1) {
                var5.g(39);
                this.field_d.a(87, var5, (long)param1);
                return var5;
              } else {
                this.field_d.a(87, var5, (long)param1);
                return var5;
              }
            } else {
              var5.a(new gb(var4), false);
              if (32768 > param1) {
                this.field_d.a(87, var5, (long)param1);
                return var5;
              } else {
                var5.g(39);
                this.field_d.a(87, var5, (long)param1);
                return var5;
              }
            }
          } else {
            return (ba) null;
          }
        }
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 != 255) {
            field_e = (String) null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static String a(boolean param0) {
        String stackIn_8_0 = null;
        String stackIn_18_0 = null;
        String stackIn_23_0 = null;
        String stackIn_33_0 = null;
        int statePc = 0;
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var12 = null;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = SolKnight.field_L ? 1 : 0;
                    var6 = "(" + nf.field_U + " " + kl.field_b + " " + jg.field_e + ") " + ob.field_h;
                    var1 = var6;
                    if (!param0) {
                        statePc = 19;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_a = (java.awt.Frame) null;
                    if ((te.field_O ^ -1) < -1) {
                        statePc = 3;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var1 = var6 + ":";
                    var2 = 0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (te.field_O > var2) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    return var1;
                }
                case 7: {
                    stackIn_18_0 = var1 + ' ';
                    stackIn_8_0 = stackIn_18_0;
                    if (var5 != 0) {
                        statePc = 18;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var12 = stackIn_8_0;
                    var3 = te.field_N.field_l[var2] & 255;
                    var4 = var3 >> -1918280092;
                    var3 = var3 & 15;
                    if (10 <= var4) {
                        statePc = 11;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var4 += 48;
                    if (var5 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var4 += 55;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    var13 = var12 + (char)var4;
                    if ((var3 ^ -1) <= -11) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var3 += 48;
                    if (var5 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var3 += 55;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    var1 = var13 + (char)var3;
                    var2++;
                    if (var5 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_18_0 = (String) (var1);
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    return stackIn_18_0;
                }
                case 19: {
                    if ((te.field_O ^ -1) >= -1) {
                        statePc = 34;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var1 = var6 + ":";
                    var2 = 0;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    if (te.field_O <= var2) {
                        statePc = 32;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    stackIn_33_0 = var1 + ' ';
                    stackIn_23_0 = stackIn_33_0;
                    if (var5 != 0) {
                        statePc = 33;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var14 = stackIn_23_0;
                    var3 = te.field_N.field_l[var2] & 255;
                    var4 = var3 >> -1918280092;
                    var3 = var3 & 15;
                    if (10 <= var4) {
                        statePc = 26;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var4 += 48;
                    if (var5 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var4 += 55;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    var15 = var14 + (char)var4;
                    if ((var3 ^ -1) <= -11) {
                        statePc = 30;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var3 += 48;
                    if (var5 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var3 += 55;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    var1 = var15 + (char)var3;
                    var2++;
                    if (var5 == 0) {
                        statePc = 21;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    stackIn_33_0 = (String) (var1);
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    return stackIn_33_0;
                }
                case 34: {
                    return var1;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private oc() throws Throwable {
        throw new Error();
    }

    static {
        field_e = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
