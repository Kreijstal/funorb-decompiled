/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class je {
    static hl field_e;
    static db field_d;
    static int[] field_b;
    mc field_c;
    static int field_f;
    private mc field_a;
    static String field_g;
    static int[] field_h;

    final void b(int param0) {
        mc var2 = null;
        int var3 = 0;
        var3 = TetraLink.field_J;
        L0: while (true) {
          var2 = ((je) this).field_c.field_j;
          if (var2 != ((je) this).field_c) {
            var2.b(false);
            continue L0;
          } else {
            L1: {
              ((je) this).field_a = null;
              if (param0 == 1) {
                break L1;
              } else {
                field_h = null;
                break L1;
              }
            }
            return;
          }
        }
    }

    final mc a(byte param0, mc param1) {
        mc var3 = null;
        if (param1 == null) {
            var3 = ((je) this).field_c.field_j;
        } else {
            var3 = param1;
        }
        if (!(((je) this).field_c != var3)) {
            ((je) this).field_a = null;
            return null;
        }
        if (param0 != -10) {
            field_g = null;
        }
        ((je) this).field_a = var3.field_j;
        return var3;
    }

    final mc a(byte param0) {
        mc var2 = ((je) this).field_a;
        if (!(((je) this).field_c != var2)) {
            ((je) this).field_a = null;
            return null;
        }
        ((je) this).field_a = var2.field_j;
        if (param0 != -70) {
            Object var3 = null;
            ((je) this).a((mc) null, -40);
        }
        return var2;
    }

    final mc d(boolean param0) {
        if (!param0) {
            field_b = null;
        }
        mc var2 = ((je) this).field_c.field_e;
        if (!(((je) this).field_c != var2)) {
            ((je) this).field_a = null;
            return null;
        }
        ((je) this).field_a = var2.field_e;
        return var2;
    }

    final mc c(byte param0) {
        if (param0 < 123) {
            field_g = null;
        }
        mc var2 = ((je) this).field_c.field_e;
        if (var2 == ((je) this).field_c) {
            return null;
        }
        var2.b(false);
        return var2;
    }

    final mc c(boolean param0) {
        if (param0) {
            Object var3 = null;
            ((je) this).a((mc) null, 0);
        }
        mc var2 = ((je) this).field_c.field_j;
        if (((je) this).field_c == var2) {
            ((je) this).field_a = null;
            return null;
        }
        ((je) this).field_a = var2.field_j;
        return var2;
    }

    final boolean b(boolean param0) {
        if (!param0) {
            je.a(-87);
        }
        return ((je) this).field_c == ((je) this).field_c.field_j ? true : false;
    }

    final static void a(int param0, int param1, bh param2, int param3, int param4) {
        param2.a(12, false);
        param2.b(17, false);
        param2.b(param1, false);
        param2.b(param4, false);
        if (param0 >= -32) {
            return;
        }
        param2.a(param3, false);
    }

    public static void b(byte param0) {
        field_g = null;
        field_b = null;
        field_e = null;
        field_h = null;
        field_d = null;
        int var1 = -31 % ((param0 - -60) / 59);
    }

    final mc d(byte param0) {
        mc var2 = ((je) this).field_a;
        if (var2 == ((je) this).field_c) {
            ((je) this).field_a = null;
            return null;
        }
        ((je) this).field_a = var2.field_e;
        if (param0 != 14) {
            boolean discarded$0 = ((je) this).b(true);
        }
        return var2;
    }

    final static void a(int param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        Object var5 = null;
        int var6 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = TetraLink.field_J;
                    var1 = (Object) (Object) vi.field_a;
                    // monitorenter vi.field_a
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        dh.field_m = bb.field_e;
                        if (param0 == 13397) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var5 = null;
                        je.a(15, 10, (bh) null, 22, 69);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        wk.field_c = wk.field_c + 1;
                        if (-1 < mh.field_b) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (s.field_d == mh.field_b) {
                            statePc = 12;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2 = ah.field_g[s.field_d];
                        s.field_d = 127 & 1 + s.field_d;
                        if (-1 > var2) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        sn.field_a[var2] = true;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        sn.field_a[var2] = false;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var6 = 0;
                        var2 = var6;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (-113 <= var6) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        sn.field_a[var6] = false;
                        var6++;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        mh.field_b = s.field_d;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        bb.field_e = eh.field_n;
                        // monitorexit var1
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var3 = caughtException;
                        // monitorexit var1
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 15: {
                    throw (RuntimeException) (Object) var3;
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(mc param0, boolean param1) {
        if (null != param0.field_e) {
            param0.b(false);
        }
        if (param1) {
            mc discarded$0 = ((je) this).d((byte) 106);
        }
        param0.field_j = ((je) this).field_c;
        param0.field_e = ((je) this).field_c.field_e;
        param0.field_e.field_j = param0;
        param0.field_j.field_e = param0;
    }

    final mc a(boolean param0) {
        mc var2 = ((je) this).field_c.field_j;
        if (var2 == ((je) this).field_c) {
            return null;
        }
        var2.b(param0);
        return var2;
    }

    final static void a(boolean param0, int param1, String param2, boolean param3, int param4) {
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        String stackIn_3_0 = null;
        int stackIn_25_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        String stackOut_2_0 = null;
        String stackOut_1_0 = null;
        int stackOut_35_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        L0: {
          var10 = TetraLink.field_J;
          ma.field_g = true;
          bm.field_q = param1;
          var11 = param2;
          if (!param0) {
            stackOut_2_0 = ug.field_X;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = hl.field_ub;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var6 = stackIn_3_0;
          if (bm.field_q != 0) {
            if (1 != bm.field_q) {
              throw new IllegalArgumentException();
            } else {
              var7 = t.a(480, 108, var11, jj.field_d, ko.field_u);
              var8 = 2 - -var7;
              bi.field_c = new int[var8];
              hk.field_b = new String[var8];
              var9 = 0;
              L2: while (true) {
                if (var8 <= var9) {
                  j.field_x = new int[1];
                  var9 = 0;
                  L3: while (true) {
                    if (var7 <= var9) {
                      hk.field_b[var8 - 2] = "";
                      hk.field_b[var8 + -1] = d.field_a;
                      bi.field_c[var8 + -1] = 0;
                      j.field_x[0] = 2;
                      break L1;
                    } else {
                      hk.field_b[var9] = jj.field_d[var9];
                      var9++;
                      continue L3;
                    }
                  }
                } else {
                  bi.field_c[var9] = -1;
                  var9++;
                  continue L2;
                }
              }
            }
          } else {
            var7 = t.a(480, 118, var11, jj.field_d, ko.field_u);
            var8 = 3 - -var7;
            hk.field_b = new String[var8];
            bi.field_c = new int[var8];
            var9 = 0;
            L4: while (true) {
              if (var8 <= var9) {
                j.field_x = new int[2];
                var9 = 0;
                L5: while (true) {
                  if (var9 >= var7) {
                    hk.field_b[var8 - 3] = "";
                    hk.field_b[-2 + var8] = var6;
                    bi.field_c[var8 + -2] = 0;
                    j.field_x[0] = 1;
                    hk.field_b[var8 - 1] = d.field_a;
                    bi.field_c[var8 + -1] = 1;
                    j.field_x[1] = 2;
                    break L1;
                  } else {
                    hk.field_b[var9] = jj.field_d[var9];
                    var9++;
                    continue L5;
                  }
                }
              } else {
                bi.field_c[var9] = -1;
                var9++;
                continue L4;
              }
            }
          }
        }
        hb.field_a.field_g = j.field_x.length;
        var7 = 0;
        var8 = 0;
        L6: while (true) {
          if (hk.field_b.length <= var8) {
            L7: {
              if (param4 == -1381732671) {
                break L7;
              } else {
                field_e = null;
                break L7;
              }
            }
            hk.field_a = (hc.field_q - -cd.field_e << 1259457505) * hb.field_a.field_g;
            ja.field_j = nh.field_Nb + -(var7 >> -1121162719);
            hd.field_q = -(var7 >> -1381732671) + (var7 + nh.field_Nb);
            var8 = 0;
            L8: while (true) {
              if (var8 >= hk.field_b.length) {
                ab.field_Q = -(hk.field_a >> 517472449) + fk.field_S;
                hb.field_a.a(ai.a(aa.field_Nb, a.field_a, 126), 0, param3, -98);
                return;
              } else {
                L9: {
                  stackOut_35_0 = hk.field_a;
                  stackIn_37_0 = stackOut_35_0;
                  stackIn_36_0 = stackOut_35_0;
                  if (-1 < (bi.field_c[var8] ^ -1)) {
                    stackOut_37_0 = stackIn_37_0;
                    stackOut_37_1 = hl.field_wb;
                    stackIn_38_0 = stackOut_37_0;
                    stackIn_38_1 = stackOut_37_1;
                    break L9;
                  } else {
                    stackOut_36_0 = stackIn_36_0;
                    stackOut_36_1 = i.field_n;
                    stackIn_38_0 = stackOut_36_0;
                    stackIn_38_1 = stackOut_36_1;
                    break L9;
                  }
                }
                hk.field_a = stackIn_38_0 + stackIn_38_1;
                var8++;
                continue L8;
              }
            }
          } else {
            L10: {
              if (bi.field_c[var8] < 0) {
                stackOut_24_0 = 0;
                stackIn_25_0 = stackOut_24_0;
                break L10;
              } else {
                stackOut_23_0 = 1;
                stackIn_25_0 = stackOut_23_0;
                break L10;
              }
            }
            L11: {
              var9 = tn.a(stackIn_25_0 != 0, 1, hk.field_b[var8]);
              if (-1 != bi.field_c[var8]) {
                var9 = var9 + 2 * ao.field_a;
                break L11;
              } else {
                break L11;
              }
            }
            if (var9 > var7) {
              var7 = var9;
              var8++;
              continue L6;
            } else {
              var8++;
              continue L6;
            }
          }
        }
    }

    final void a(mc param0, int param1) {
        if (null != param0.field_e) {
            param0.b(false);
        }
        param0.field_e = ((je) this).field_c;
        param0.field_j = ((je) this).field_c.field_j;
        param0.field_e.field_j = param0;
        int var3 = -56 / ((param1 - 37) / 58);
        param0.field_j.field_e = param0;
    }

    public je() {
        ((je) this).field_c = new mc();
        ((je) this).field_c.field_e = ((je) this).field_c;
        ((je) this).field_c.field_j = ((je) this).field_c;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[256];
        field_d = new db(14, 0, 4, 1);
        field_g = "Data server full or too many connections from your address. Please try again in a few minutes.";
    }
}
