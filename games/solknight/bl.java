/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl extends gg {
    int field_h;
    static String field_m;
    static boolean field_p;
    static int field_i;
    int field_q;
    int field_l;
    int field_n;
    int field_j;
    int field_o;
    static int field_k;

    public static void a(int param0) {
        field_m = null;
        if (param0 != 0) {
            bl.a((byte) 16);
        }
    }

    final static od a(od param0, int[] param1, byte param2) {
        od var3 = null;
        RuntimeException var3_ref = null;
        int[] var4 = null;
        od stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 100) {
                break L1;
              } else {
                var4 = (int[]) null;
                bl.a((od) null, (int[]) null, (byte) -77);
                break L1;
              }
            }
            var3 = new od(0, 0, 0);
            var3.field_m = param1;
            var3.field_b = param0.field_b;
            var3.field_a = param0.field_a;
            var3.field_i = param0.field_i;
            var3.field_n = param0.field_n;
            var3.field_d = param0.field_d;
            var3.field_l = param0.field_l;
            var3.field_j = param0.field_j;
            stackIn_3_0 = (od) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("bl.B(");

            if (param0 == null) {
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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean a(byte param0) {
        if (param0 == -81) {
          if ((kj.field_R ^ -1) <= -21) {
            if (bb.h(param0 + -44)) {
              if (-1 > (c.field_H ^ -1)) {
                if (rd.b(6144)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          bl.a((byte) -9);
          if ((kj.field_R ^ -1) <= -21) {
            if (bb.h(param0 + -44)) {
              if (-1 > (c.field_H ^ -1)) {
                if (rd.b(6144)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final static od[] b(boolean param0) {
        od[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = SolKnight.field_L ? 1 : 0;
                    var1 = new od[nb.field_c];
                    if (!param0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    bl.b(false);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var2 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (nb.field_c > var2) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    og.a((byte) -97);
                    return var1;
                }
                case 5: {
                    var1[var2] = new od(kl.field_a, we.field_e, ph.field_h[var2], qf.field_d[var2], sa.field_l[var2], uj.field_b[var2], jc.field_c[var2], ig.field_H);
                    var2++;
                    if (var3 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    return var1;
                }
                case 8: {
                    if (var3 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    og.a((byte) -97);
                    return var1;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    bl(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_q = param2;
        this.field_j = param1;
        this.field_h = param3;
        this.field_n = param0;
        this.field_l = param5;
        this.field_o = param4;
    }

    static {
        field_p = false;
        field_m = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
    }
}
