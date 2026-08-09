/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class al extends df {
    static String field_U;
    static String field_ab;
    static cj field_fb;
    private int field_S;
    private int field_Y;
    static String field_cb;
    static String field_W;
    static int field_bb;
    private int field_X;
    private int field_db;
    private int field_V;
    static ul field_eb;
    private int field_T;
    static int field_Z;

    final static void b(boolean param0, int param1) {
        try {
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            if (param0) {
              try {
                L0: {
                  fo.a(jl.b(0), "resizing", (byte) 23, new Object[]{new Integer(param1)});
                  break L0;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L1: {
                  var2 = decompiledCaughtException;
                  break L1;
                }
              }
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    void j(byte param0) {
        if (param0 > -70) {
            field_ab = (String) null;
        }
    }

    boolean i(int param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        L0: {
          if (param0 == -27388) {
            break L0;
          } else {
            this.a(-14, (byte) 3, 7, -57);
            break L0;
          }
        }
        L1: {
          if ((this.field_db ^ -1) < -1) {
            L2: {
              L3: {
                var2 = this.field_V;
                var3 = this.field_Y;
                fieldTemp$1 = this.field_S + 1;
                this.field_S = this.field_S + 1;
                if ((fieldTemp$1 ^ -1) <= (this.field_db ^ -1)) {
                  break L3;
                } else {
                  var4 = (this.field_db * 2 - this.field_S) * this.field_S;
                  var5 = this.field_db * this.field_db;
                  var2 = var4 * (-this.field_X + this.field_V) / var5 + this.field_X;
                  var3 = this.field_T - -(var4 * (-this.field_T + this.field_Y) / var5);
                  if (!ZombieDawnMulti.field_E) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              this.field_db = 0;
              this.j((byte) -101);
              break L2;
            }
            this.b(var2, var3, param0 + 27505);
            break L1;
          } else {
            break L1;
          }
        }
        return super.i(-27388);
    }

    final static String k(int param0) {
        if (param0 <= 68) {
            return (String) null;
        }
        return s.field_e.f((byte) -24);
    }

    final static void j(int param0) {
        ch.field_e = false;
        nj.field_f = false;
        fb.a(param0, 99);
        id.field_B = mp.field_b;
        ta.field_hb = mp.field_b;
    }

    public static void i(byte param0) {
        field_U = null;
        field_cb = null;
        int var1 = -15 % ((-22 - param0) / 60);
        field_eb = null;
        field_ab = null;
        field_fb = null;
        field_W = null;
    }

    al(vk param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_S = 0;
        this.field_db = 0;
    }

    void a(boolean param0, int param1, int param2) {
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int statePc = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = ZombieDawnMulti.field_E ? 1 : 0;
                    oo.a(6 + param1, param2 + 35, -12 + this.field_n, this.field_w - 40, 2105376, 0);
                    var5 = 211;
                    var4 = 35;
                    var6 = 194;
                    var7 = 0;
                    var8 = param2;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if ((var4 ^ -1) >= (var7 ^ -1)) {
                        statePc = 34;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    stackIn_35_0 = oo.field_e;
                    stackIn_3_0 = stackIn_35_0;
                    stackIn_35_1 = var8;
                    stackIn_3_1 = stackIn_35_1;
                    if (var16 != 0) {
                        statePc = 35;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (stackIn_3_0 > stackIn_3_1) {
                        statePc = 33;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (oo.field_d > var8) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (var16 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var9 = (-var5 + var6) * var7 / var4 + var5;
                    var10 = 0;
                    var11 = this.field_n;
                    if (var7 <= 20) {
                        statePc = 9;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (var10 > 20) {
                        statePc = 17;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var12 = (-var10 + 20) * (20 - var10) + (-var7 + 20) * (20 + -var7);
                    stackIn_18_0 = var12 ^ -1;
                    stackIn_11_0 = stackIn_18_0;
                    stackIn_18_1 = -463;
                    stackIn_11_1 = stackIn_18_1;
                    if (var16 != 0) {
                        statePc = 18;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (stackIn_11_0 < stackIn_11_1) {
                        statePc = 16;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (var12 >= 420) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (var16 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var13 = var9 * (462 + -var12) / 42;
                    var13 = var13 | (var13 << 558023208 | var13 << 1956100304);
                    oo.field_i[param1 + oo.field_b * var8 + var10] = var13;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    var10++;
                    if (var16 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_18_0 = var7 ^ -1;
                    stackIn_18_1 = -21;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (stackIn_18_0 < stackIn_18_1) {
                        statePc = 31;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var12 = var11;
                    var11 -= 21;
                    var13 = 0;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if ((var13 ^ -1) < -21) {
                        statePc = 30;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var14 = (20 + -var7) * (20 + -var7) + var13 * var13;
                    stackIn_32_0 = -463;
                    stackIn_22_0 = stackIn_32_0;
                    stackIn_32_1 = var14 ^ -1;
                    stackIn_22_1 = stackIn_32_1;
                    if (var16 != 0) {
                        statePc = 32;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (stackIn_22_0 <= stackIn_22_1) {
                        statePc = 25;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (var16 == 0) {
                        statePc = 30;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (var14 < 420) {
                        statePc = 27;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var12 = 1 + var11;
                    if (var16 == 0) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var15 = (462 - var14) * var9 / 42;
                    var15 = var15 | (var15 << -1020322064 | var15 << 1238176072);
                    oo.field_i[var11 + (param1 + var8 * oo.field_b)] = var15;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    var11++;
                    var13++;
                    if (var16 == 0) {
                        statePc = 20;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var11 = var12;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    var9 = var9 | (var9 << 336458792 | var9 << 2118029456);
                    stackIn_32_0 = var10 + param1;
                    stackIn_32_1 = var8;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    oo.b(stackIn_32_0, stackIn_32_1, -var10 + var11, var9);
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    var8++;
                    var7++;
                    if (var16 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var5 = 194;
                    var4 = 22;
                    var6 = 169;
                    var7 = 0;
                    stackIn_35_0 = param2;
                    stackIn_35_1 = -35;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    var8 = stackIn_35_0 - stackIn_35_1;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    if (var7 >= var4) {
                        statePc = 40;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var9 = var5 - -(var7 * (-var5 + var6) / var4);
                    var9 = var9 | (var9 << -1091786168 | var9 << -649710544);
                    oo.b(param1, var8, 6, var9);
                    oo.b(param1 + (this.field_n + -6), var8, 6, var9);
                    var8++;
                    var7++;
                    if (var16 != 0) {
                        statePc = 41;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (var16 == 0) {
                        statePc = 36;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    hq.field_e.g(-90 + param1 - -this.field_n, 10 + param2);
                    fk.a(param1 - -5, this.field_n + -10, param0, sn.field_Nb, 35 + param2);
                    fk.a(param1, this.field_n, true, jh.field_Hb, this.field_w + param2 + -22);
                    var5 = 169;
                    var4 = this.field_w - 79;
                    var6 = 127;
                    var7 = 0;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    var8 = 57 + param2;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    if ((var7 ^ -1) <= (var4 ^ -1)) {
                        statePc = 46;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    var9 = (-var5 + var6) * var7 / var4 + var5;
                    var9 = var9 | (var9 << -93270328 | var9 << 1585262128);
                    oo.b(param1, var8, 6, var9);
                    oo.b(this.field_n + (param1 + -6), var8, 6, var9);
                    var8++;
                    var7++;
                    if (var16 != 0) {
                        statePc = 46;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if (var16 == 0) {
                        statePc = 42;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int c(int param0, int param1, int param2) {
        if (null == er.field_j) {
            return -1;
        }
        if (param2 >= jp.field_d && (param2 ^ -1) > (jp.field_d + er.field_j.field_x ^ -1) && (param0 ^ -1) <= (cr.field_j ^ -1) && (cr.field_j - -er.field_j.field_w ^ -1) < (param0 ^ -1)) {
            return 0;
        }
        if (il.field_k <= param2 && param2 < il.field_k + er.field_j.field_x && param0 >= sq.field_O) {
            if (!(param0 >= sq.field_O - -er.field_j.field_w)) {
                return 1;
            }
        }
        if (param1 != -1) {
            field_eb = (ul) null;
        }
        return -1;
    }

    boolean h(int param0) {
        if (param0 != -6134) {
            field_U = (String) null;
        }
        this.h((byte) 113);
        return super.h(-6134);
    }

    void h(byte param0) {
        if (param0 <= 29) {
            field_cb = (String) null;
        }
        if (!(this.field_db > 0)) {
            return;
        }
        this.b(this.field_V, this.field_Y, 69);
        this.field_db = 0;
        this.j((byte) -116);
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (-1 <= (param0 ^ -1)) {
            this.b(param3, param2, 73);
            return;
        }
        this.field_V = param3;
        this.field_Y = param2;
        this.field_S = 0;
        this.field_T = this.field_w;
        if (param1 != -112) {
            this.h(20);
        }
        this.field_X = this.field_n;
        this.field_db = param0;
    }

    static {
        field_ab = "More suggestions";
        field_W = "Friends";
        field_U = "Impose your will upon enemy zombies.";
        field_cb = "You have <%0> unread messages!";
    }
}
