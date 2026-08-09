/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class up implements Iterator {
    private int field_a;
    static cj field_g;
    private br field_b;
    static ja field_f;
    static int field_d;
    private wh field_h;
    static String field_c;
    private br field_e;

    public final void remove() {
        if (null == this.field_b) {
            throw new IllegalStateException();
        }
        this.field_b.a(true);
        this.field_b = null;
    }

    final static void b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_12_0 = 0;
        pd stackIn_17_0 = null;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        pd var9 = null;
        int var10 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1_int = mc.field_e - ch.field_i;
                        ch.field_i = aq.field_x - (var1_int >> -1147096319);
                        mc.field_e = ch.field_i - -var1_int;
                        eb.field_M = pm.field_Q + -(pl.field_F >> -1997436479);
                        var2 = eb.field_M;
                        var3 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var3 >= eo.field_e.length) {
                            statePc = 25;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var4 = dn.field_a[var3];
                        stackIn_26_0 = -1;
                        stackIn_4_0 = stackIn_26_0;
                        stackIn_26_1 = var4 ^ -1;
                        stackIn_4_1 = stackIn_26_1;
                        if (var10 != 0) {
                            statePc = 26;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0 < stackIn_4_1) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var4 == mo.field_Jb.field_d) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var5 = sb.field_c;
                        if (var10 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var5 = ua.field_N;
                        if (var10 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var5 = kk.field_x;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var6 = eo.field_e[var3];
                        if ((var4 ^ -1) > -1) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_12_0 = 1;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_12_0 = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var7 = vh.a(stackIn_12_0 != 0, -76, var6);
                        var8 = -(var7 >> 518455937) + aq.field_x;
                        if (-1 >= (var4 ^ -1)) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var2 = var2 + pb.field_b;
                        if (var4 == mo.field_Jb.field_d) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_17_0 = li.field_E;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_17_0 = vk.field_I;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var9 = stackIn_17_0;
                        if (var9 != null) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var9.a(var2, -wb.field_db + var8, (wb.field_db << -1309194655) + var7, (ne.field_tb << 1954103137) + po.field_n, 12018);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var2 = var2 + ne.field_tb;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (-1 < (var4 ^ -1)) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        wn.field_u.c(var6, var8, var2 - -tk.field_n, var5, -1);
                        var2 = var2 + (po.field_n + (pb.field_b + ne.field_tb));
                        if (var10 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        e.field_c.c(var6, var8, mg.field_H + var2, var5, -1);
                        var2 = var2 + dq.field_l;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var3++;
                        if (var10 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_26_0 = -17;
                        stackIn_26_1 = (param0 - -59) / 46;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var4 = stackIn_26_0 / stackIn_26_1;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 28: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var1), "up.C(" + param0 + ')');
                }
                case 29: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final Object next() {
        br[] fieldTemp$2 = null;
        int fieldTemp$3 = 0;
        int var2;
        br var3;
        br var4;
        var2 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.field_h.field_a[-1 + this.field_a] == this.field_e) {
          L0: while (true) {
            if (this.field_a < this.field_h.field_d) {
              fieldTemp$2 = this.field_h.field_a;
              fieldTemp$3 = this.field_a;
              this.field_a = this.field_a + 1;
              var3 = fieldTemp$2[fieldTemp$3].field_d;
              if (this.field_h.field_a[this.field_a - 1] == var3) {
                if (var2 == 0) {
                  continue L0;
                } else {
                  return null;
                }
              } else {
                this.field_e = var3.field_d;
                this.field_b = var3;
                return var3;
              }
            } else {
              return null;
            }
          }
        } else {
          var4 = this.field_e;
          this.field_e = var4.field_d;
          this.field_b = var4;
          return var4;
        }
    }

    final static void a(boolean param0) {
        cj stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        cj stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        L0: {
          stackIn_2_0 = dm.field_ac;

          stackIn_2_1 = 18;

          stackIn_2_2 = 0;

          if (!tb.field_u) {
            stackIn_3_0 = (cj) ((Object) stackIn_2_0);
            stackIn_3_1 = stackIn_2_1;
            stackIn_3_2 = stackIn_2_2;
            stackIn_3_3 = 0;
            break L0;
          } else {
            stackIn_3_0 = (cj) ((Object) stackIn_2_0);
            stackIn_3_1 = stackIn_2_1;
            stackIn_3_2 = stackIn_2_2;
            stackIn_3_3 = 40 + (2 + (qa.field_o - -2));
            break L0;
          }
        }
        ((cj) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, -stackIn_3_3 + pd.field_b.field_zb, 0, -3344);
        mo.field_Hb.a(18, 0, 42 + qa.field_o, -2 + (pd.field_b.field_zb + (-qa.field_o - 40)), -3344);
        if (param0) {
          field_g = (cj) null;
          hf.field_e.a(qa.field_o, 2, pd.field_b.field_zb, 0, pd.field_b.field_z + -20, -31465, 20);
          return;
        } else {
          hf.field_e.a(qa.field_o, 2, pd.field_b.field_zb, 0, pd.field_b.field_z + -20, -31465, 20);
          return;
        }
    }

    public final boolean hasNext() {
        br[] fieldTemp$2 = null;
        int fieldTemp$3 = 0;
        int var2;
        var2 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.field_h.field_a[-1 + this.field_a] == this.field_e) {
          L0: while (true) {
            if (this.field_a < this.field_h.field_d) {
              fieldTemp$2 = this.field_h.field_a;
              fieldTemp$3 = this.field_a;
              this.field_a = this.field_a + 1;
              if (fieldTemp$2[fieldTemp$3].field_d == this.field_h.field_a[-1 + this.field_a]) {
                this.field_e = this.field_h.field_a[-1 + this.field_a];
                if (var2 == 0) {
                  continue L0;
                } else {
                  this.field_e = this.field_h.field_a[this.field_a - 1].field_d;
                  return true;
                }
              } else {
                this.field_e = this.field_h.field_a[this.field_a - 1].field_d;
                return true;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    final static String a(int param0) {
        int var1 = 57 % ((param0 - 77) / 49);
        if (cb.field_l) {
            return null;
        }
        if (l.field_a < um.field_h) {
            return null;
        }
        if (!(br.field_a + um.field_h <= l.field_a)) {
            return kg.field_k;
        }
        return null;
    }

    private final void c(int param0) {
        this.field_e = this.field_h.field_a[0].field_d;
        this.field_a = param0;
        this.field_b = null;
    }

    public static void a(byte param0) {
        field_g = null;
        field_f = null;
        field_c = null;
        if (param0 < -8) {
            return;
        }
        field_d = -60;
    }

    up(wh param0) {
        this.field_b = null;
        try {
            this.field_h = param0;
            this.c(1);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "up.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "Go!";
    }
}
