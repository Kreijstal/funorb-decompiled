/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class sa extends qg implements vc {
    static boolean field_E;

    public abstract void a(boolean param0, byte param1);

    private final void j(boolean param0) {
        int var3;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        boolean stackIn_11_0 = false;
        var3 = BrickABrac.field_J ? 1 : 0;
        L0: while (true) {
          L1: {
            L2: {
              if (!nl.a(ch.field_g, (byte) 64)) {
                break L2;
              } else {
                stackIn_11_0 = this.a(jl.field_e, (byte) 47, si.field_a);

                if (var3 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (!stackIn_11_0) {
                      break L3;
                    } else {
                      if (var3 == 0) {
                        continue L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    stackIn_8_0 = this;

                    if (param0) {
                      stackIn_9_0 = this;
                      stackIn_9_1 = 0;
                      break L4;
                    } else {
                      stackIn_9_0 = this;
                      stackIn_9_1 = 1;
                      break L4;
                    }
                  }
                  this.h(stackIn_9_1 != 0);
                  if (var3 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackIn_11_0 = param0;
            break L1;
          }
          L5: {
            if (stackIn_11_0) {
              break L5;
            } else {
              field_E = false;
              break L5;
            }
          }
          return;
        }
    }

    final static int a(int param0, int param1) {
        param0 = param0 & 8191;
        if ((param0 ^ -1) <= param1) {
            return -6145 >= (param0 ^ -1) ? -um.field_j[8192 + -param0] : -um.field_j[-4096 + param0];
        }
        return -2049 < (param0 ^ -1) ? um.field_j[param0] : um.field_j[4096 - param0];
    }

    final static boolean a(int param0, int param1, int param2) {
        int stackIn_10_0 = 0;
        if ((dc.field_b ^ -1) == -14) {
          th.b(param1 ^ 103);
          return true;
        } else {
          if (dc.field_b == param1) {
            hd.field_a.f((byte) 41);
            return true;
          } else {
            L0: {
              L1: {
                if (hd.field_a == null) {
                  break L1;
                } else {
                  if (!hd.field_a.a(param2, param0, (byte) -126)) {
                    break L1;
                  } else {
                    stackIn_10_0 = 1;
                    break L0;
                  }
                }
              }
              stackIn_10_0 = 0;
              break L0;
            }
            return stackIn_10_0 != 0;
          }
        }
    }

    public abstract void a(int param0);

    abstract void b(int param0, int param1);

    public abstract boolean a(int param0, char param1, int param2);

    private final void i(boolean param0) {
        if (param0) {
            this.f(-67);
        }
    }

    final void g(int param0) {
        java.awt.Canvas var2 = null;
        int var3 = 0;
        int var4 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = BrickABrac.field_J ? 1 : 0;
                    var2 = gd.a((byte) 0);
                    if (r.c((byte) -84)) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    pk.a((byte) 68, var2, mj.a((byte) -81));
                    return;
                }
                case 3: {
                    if (!un.field_f) {
                        statePc = 5;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 5: {
                    kn.a(true, var2);
                    return;
                }
                case 6: {
                    if (um.field_t) {
                        statePc = 9;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (og.h(-26090)) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    ai.a((byte) 24, 100.0f, qm.field_e);
                    kn.a(true, var2);
                    return;
                }
                case 9: {
                    pe.field_i = true;
                    var3 = kp.field_d.size() + -1;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (var3 < 0) {
                        statePc = 14;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    ((vc) (kp.field_d.elementAt(var3))).a(16769381);
                    var3--;
                    if (var4 != 0) {
                        statePc = 16;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (var4 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (param0 > 93) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    field_E = false;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (!pe.field_i) {
                        statePc = 19;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    jj.a((byte) -123);
                    ck.a(var2, 0, 14209, 0);
                    if (var4 == 0) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    this.i(false);
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    protected sa() {
    }

    final void a(int param0, wb param1) {
        try {
            al.field_j = param1;
            this.a(8, true);
            this.l(param0 ^ 3156);
            this.i(2);
            this.e(true);
            this.b((byte) -67);
            if (param0 != 3160) {
                return;
            }
            try {
                this.j(64);
                this.c((byte) -19);
                ch.field_g[9] = -1;
                ch.field_g[10] = -1;
                kp.field_d = new Vector();
                op.a((vc) (this), 0);
            } catch (RuntimeException runtimeException) {
                throw qb.a((Throwable) ((Object) runtimeException), "sa.HB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract boolean a(pi param0, byte param1, int param2);

    final static void a(int param0, bi param1, String param2, int param3, int param4, int param5, int param6) {
        int var7_int = 0;
        try {
            var7_int = (-param1.field_B + (param4 + (2 * param0 - param1.field_L))) / 2;
            int var8 = -69 / ((param6 - -85) / 40);
            nn.field_g.b(param2, param3, var7_int + nn.field_g.field_B, param5, -1);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "sa.NB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final void r(int param0) {
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        boolean stackIn_39_0 = false;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        boolean stackIn_51_0 = false;
        int stackIn_63_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int stackIn_68_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_76_1 = 0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        vc var6 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = BrickABrac.field_J ? 1 : 0;
                    if (param0 == 10) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    var2 = 0;
                    if (m.a(2)) {
                        statePc = 58;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (!lg.a(9)) {
                        statePc = 16;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (me.b(126)) {
                        statePc = 14;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var3 = md.f((byte) 124);
                    if (var3 == 2) {
                        statePc = 12;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (var3 != 3) {
                        statePc = 9;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    cp.a(true, 21543);
                    if (var5 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (var3 != 4) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    he.a(qn.field_k, false, (byte) 61);
                    wi.field_g = true;
                    if (var5 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    nc.b(102);
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    this.a(false, (byte) 69);
                    if (var5 == 0) {
                        statePc = 59;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    nk.a(58);
                    if (var5 == 0) {
                        statePc = 59;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (!dj.c((byte) -33)) {
                        statePc = 29;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_19_0 = this;
                    stackIn_18_0 = stackIn_19_0;
                    if (ua.field_d == null) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackIn_20_0 = this;
                    stackIn_20_1 = 1;
                    statePc = 20;
                    continue stateLoop;
                }
                case 19: {
                    stackIn_20_0 = this;
                    stackIn_20_1 = 0;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    var3 = this.b(stackIn_20_1 != 0, (byte) -118);
                    if (1 == var3) {
                        statePc = 23;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if ((var3 ^ -1) == -3) {
                        statePc = 23;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (null != ua.field_d) {
                        statePc = 25;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 25: {
                    nc.b(118);
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    if ((var3 ^ -1) != -3) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    nk.a(param0 ^ 2058, uc.e((byte) -85));
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    this.a(false, (byte) 81);
                    if (var5 == 0) {
                        statePc = 59;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (!uc.f(21651)) {
                        statePc = 36;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (me.b(param0 ^ -16)) {
                        statePc = 34;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var3 = vh.h(0);
                    if (1 != var3) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    he.a(mq.field_a, true, (byte) 97);
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    this.a(false, (byte) 7);
                    if (var5 == 0) {
                        statePc = 59;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    nk.a(param0 + 47);
                    if (var5 == 0) {
                        statePc = 59;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (me.b(-34)) {
                        statePc = 56;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var2 = 1;
                    var3 = -1;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    stackIn_39_0 = jl.a((byte) 5);
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (!stackIn_39_0) {
                        statePc = 55;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    stackIn_76_0 = dc.field_b;
                    stackIn_41_0 = stackIn_76_0;
                    stackIn_76_1 = -1;
                    stackIn_41_1 = stackIn_76_1;
                    if (var5 != 0) {
                        statePc = 76;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (stackIn_41_0 != stackIn_41_1) {
                        statePc = 46;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (-1 != dc.field_b) {
                        statePc = 48;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (var3 != -1) {
                        statePc = 45;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 45: {
                    dc.field_b = var3;
                    var3 = -1;
                    if (var5 == 0) {
                        statePc = 48;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (!uf.b(-102, dc.field_b)) {
                        statePc = 48;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    var3 = dc.field_b;
                    if (var5 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    var4 = 0;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if ((var4 ^ -1) <= (kp.field_d.size() ^ -1)) {
                        statePc = 54;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    stackIn_39_0 = ((vc) (kp.field_d.elementAt(var4))).a(dc.field_b, go.field_b, -81);
                    stackIn_51_0 = stackIn_39_0;
                    if (var5 != 0) {
                        statePc = 39;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    if (stackIn_51_0) {
                        statePc = 54;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    var4++;
                    if (var5 == 0) {
                        statePc = 49;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (var5 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (var5 == 0) {
                        statePc = 59;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    nk.a(114);
                    if (var5 == 0) {
                        statePc = 59;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    this.a(false, (byte) 28);
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    var3 = 0;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    if (var3 >= kp.field_d.size()) {
                        statePc = 67;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    var6 = (vc) (kp.field_d.elementAt(var3));
                    var6.a(var2 != 0, (byte) -126);
                    if (var5 != 0) {
                        statePc = 67;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    stackIn_64_0 = var2;
                    stackIn_63_0 = stackIn_64_0;
                    if (var6.b(59)) {
                        statePc = 64;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    stackIn_65_0 = stackIn_63_0;
                    stackIn_65_1 = 1;
                    statePc = 65;
                    continue stateLoop;
                }
                case 64: {
                    stackIn_65_0 = stackIn_64_0;
                    stackIn_65_1 = 0;
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    var2 = stackIn_65_0 & stackIn_65_1;
                    var3++;
                    if (var5 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    return;
                }
                case 68: {
                    stackIn_69_0 = stackIn_68_0;
                    stackIn_69_1 = 1;
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    var2 = stackIn_69_0 & stackIn_69_1;
                    var3++;
                    if (var5 == 0) {
                        statePc = 78;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 71: {
                    stackIn_69_0 = stackIn_71_0;
                    stackIn_69_1 = 0;
                    statePc = 69;
                    continue stateLoop;
                }
                case 72: {
                    stackIn_71_0 = var2;
                    stackIn_73_0 = stackIn_71_0;
                    if (var6.b(59)) {
                        statePc = 71;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    stackIn_68_0 = stackIn_73_0;
                    statePc = 68;
                    continue stateLoop;
                }
                case 74: {
                    var6 = (vc) (kp.field_d.elementAt(var3));
                    var6.a(var2 != 0, (byte) -126);
                    if (var5 != 0) {
                        statePc = 67;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 76: {
                    if (stackIn_76_0 >= stackIn_76_1) {
                        statePc = 67;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 78: {
                    stackIn_76_0 = var3;
                    stackIn_76_1 = kp.field_d.size();
                    statePc = 76;
                    continue stateLoop;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static String a(char param0, int param1, int param2) {
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = BrickABrac.field_J ? 1 : 0;
                    var6 = new char[param2];
                    var3 = var6;
                    var4 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (param2 <= var4) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var6[var4] = param0;
                    var4++;
                    if (var5 != 0) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var5 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var4 = -55 / ((param1 - 75) / 40);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    return new String(var6);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    abstract void p(int param0);

    public final boolean b(int param0) {
        if (param0 < 36) {
            return true;
        }
        return true;
    }

    abstract boolean q(int param0);

    final static void a(byte param0, jp param1, int param2, int param3, jp param4, jp param5, int param6, int param7, int param8, int param9) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        jp var11 = null;
        try {
          L0: {
            L1: {
              param5.d((param6 * 5 >> -1649660336) + ((-param5.field_x + param7) / 2 + param9), param2);
              param4.c(param9 + (param7 - param4.field_x) / 2 - (-(param6 * 10 >> 526831088) + -(10 / param3)), 480 + (param8 + (param2 - param4.field_z)));
              if (param0 > 79) {
                break L1;
              } else {
                var11 = (jp) null;
                sa.a((byte) 75, (jp) null, -80, -107, (jp) null, (jp) null, 10, 97, -30, 44);
                break L1;
              }
            }
            param1.c(10 / param3 + (param9 - (-((-param1.field_x + param7) / 2) + -(20 * param6 >> -2016118800))), 480 + (param2 + param8 - param1.field_z));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var10 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var10);

            stackIn_6_1 = new StringBuilder().append("sa.MB(").append(param0).append(',');

            if (param1 == null) {
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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    final void f(int param0) {
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        e var5 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = BrickABrac.field_J ? 1 : 0;
                    if (null == ua.field_d) {
                        statePc = 4;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (ua.field_d.field_e) {
                        statePc = 3;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 3: {
                    nc.b(84);
                    ee.c(4);
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    stackIn_6_0 = this;
                    stackIn_5_0 = stackIn_6_0;
                    if (ua.field_d == null) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    stackIn_7_0 = this;
                    stackIn_7_1 = 1;
                    statePc = 7;
                    continue stateLoop;
                }
                case 6: {
                    stackIn_7_0 = this;
                    stackIn_7_1 = 0;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    this.b(stackIn_7_1 != 0, 1);
                    if (param0 < -34) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    field_E = false;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (!lo.field_d) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    al.field_j.b(true);
                    lo.field_d = false;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (r.c((byte) -87)) {
                        statePc = 13;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 13: {
                    this.g(false);
                    if (!r.c((byte) -113)) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    return;
                }
                case 15: {
                    this.j(true);
                    if (un.field_f) {
                        statePc = 19;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    gk.a(qc.field_o, (byte) 112);
                    if (!al.field_j.a((byte) -54)) {
                        statePc = 27;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    al.field_j.a(false);
                    un.field_f = true;
                    if (var4 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (um.field_t) {
                        statePc = 22;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (!og.h(-26090)) {
                        statePc = 24;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    this.r(10);
                    if (var4 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (al.field_j.a(23570)) {
                        statePc = 26;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 26: {
                    um.field_t = true;
                    this.p(1);
                    mc.a((byte) 126);
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (og.h(-26090)) {
                        statePc = 34;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var5 = (e) ((Object) lp.field_wb.c(3));
                    if (var5 != null) {
                        statePc = 32;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (var4 != 0) {
                        statePc = 33;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (var4 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    df.a(var5, 4, -161);
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    if (var4 == 0) {
                        statePc = 28;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    fk.a(14114);
                    tm.a((byte) 110, 0);
                    if (!ui.a(false)) {
                        statePc = 49;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var2 = this.o(-105);
                    if (0 == var2) {
                        statePc = 38;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (-2 == (var2 ^ -1)) {
                        statePc = 38;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 38: {
                    this.b(var2, 1);
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    var3 = 0;
                    if (-3 == (var2 ^ -1)) {
                        statePc = 41;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var3 = 1;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    if (this.q(73)) {
                        statePc = 44;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 44: {
                    var3 = 1;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if (ui.a(false)) {
                        statePc = 47;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    var3 = 0;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    if (var3 == 0) {
                        statePc = 49;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    qb.g(115);
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
    }
}
