/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class kb {
    static cj field_n;
    th field_K;
    static String field_w;
    fc field_h;
    int field_l;
    int[] field_v;
    int field_F;
    int[] field_d;
    boolean field_c;
    int field_f;
    int field_C;
    private hk[] field_k;
    boolean field_i;
    int field_t;
    int[] field_m;
    th field_s;
    long[] field_e;
    static String field_p;
    int[] field_o;
    static String field_q;
    int field_r;
    int[] field_z;
    th field_G;
    int field_H;
    th field_A;
    int field_j;
    int[][] field_D;
    int field_g;
    int[] field_a;
    int[] field_J;
    String[] field_b;
    int field_I;
    static String field_E;
    th field_u;
    static cj field_x;
    int[] field_y;
    static String field_B;

    final static void a(int param0, int param1, ja[] param2, int param3, ja[] param4, fm param5, int param6, int param7, int param8, int param9, ja[] param10, byte param11, int param12, int param13, int param14) {
        int var16 = 0;
        int var15_int = param5.field_J + param5.field_r;
        if (param11 >= -114) {
            return;
        }
        try {
            var16 = param5.field_J;
            em.a(param14, param8, 2, param3, var15_int, param10, param13, param1, param5, param7, param12, 480, var16, param4, param0, param5, param2, var16, param9, var15_int, param6);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "kb.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + (param10 != null ? "{...}" : "null") + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ')');
        }
    }

    final boolean b(byte param0, int param1, int param2) {
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        if (param2 >= 0) {
          if (param0 > -61) {
            L0: {
              this.b(103, -2);
              if ((1L << param1 & this.field_e[param2] ^ -1L) == -1L) {
                stackIn_10_0 = 0;
                break L0;
              } else {
                stackIn_10_0 = 1;
                break L0;
              }
            }
            return stackIn_10_0 != 0;
          } else {
            L1: {
              if ((1L << param1 & this.field_e[param2] ^ -1L) == -1L) {
                stackIn_6_0 = 0;
                break L1;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
            return stackIn_6_0 != 0;
          }
        } else {
          return false;
        }
    }

    final int a(int param0) {
        if (param0 != -16777216) {
            return 30;
        }
        int fieldTemp$0 = this.field_f;
        this.field_f = this.field_f + 1;
        return fieldTemp$0;
    }

    final int a(int param0, int param1, int param2, boolean param3) {
        if (param3) {
            return -15;
        }
        return g.a(param1, param0, this.b((byte) -81, 59, param2), this.b((byte) -92, 56, param2));
    }

    public static void b(int param0) {
        ja[] var2;
        field_p = null;
        field_B = null;
        if (param0 != -6) {
          var2 = (ja[]) null;
          kb.a(-39, -50, (ja[]) null, -9, (ja[]) null, (fm) null, -54, 88, -18, -27, (ja[]) null, (byte) -4, -116, -58, 27);
          field_E = null;
          field_n = null;
          field_q = null;
          field_w = null;
          field_x = null;
          return;
        } else {
          field_E = null;
          field_n = null;
          field_q = null;
          field_w = null;
          field_x = null;
          return;
        }
    }

    final th a(byte param0) {
        if (param0 < 108) {
            return (th) null;
        }
        return this.field_K;
    }

    final int a(byte param0, int param1, int param2) {
        int var4;
        L0: {
          var4 = param2;
          if (!this.b((byte) -66, 58, param1)) {
            break L0;
          } else {
            var4 = var4 + param2 / 2;
            break L0;
          }
        }
        if (param0 != 32) {
          L1: {
            this.field_C = 122;
            if (this.b((byte) -101, 57, param1)) {
              var4 = var4 + param2;
              break L1;
            } else {
              break L1;
            }
          }
          return var4;
        } else {
          L2: {
            if (this.b((byte) -101, 57, param1)) {
              var4 = var4 + param2;
              break L2;
            } else {
              break L2;
            }
          }
          return var4;
        }
    }

    final void a(byte param0, int param1) {
        if (param0 != -110) {
            this.a(-88, true);
            this.field_c = true;
            return;
        }
        this.field_c = true;
    }

    final static void a(int param0, String param1) {
        System.out.println("Error: " + we.a((byte) -73, "%0a", param1, "\n"));
        if (param0 == 2) {
          return;
        } else {
          field_n = (cj) null;
          return;
        }
    }

    final boolean b(int param0, int param1) {
        if (param0 == 0) {
          if (!this.b((byte) -83, 45, param1)) {
            if (this.b((byte) -83, 46, param1)) {
              if ((hp.a((byte) 7, g.field_a, 100) ^ -1) > -41) {
                return true;
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          this.field_u = (th) null;
          if (!this.b((byte) -83, 45, param1)) {
            if (this.b((byte) -83, 46, param1)) {
              if ((hp.a((byte) 7, g.field_a, 100) ^ -1) <= -41) {
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
        }
    }

    final id a(int param0, byte param1) {
        id var3;
        int var4;
        int var6;
        int var7;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        var3 = (id) ((Object) this.field_K.c(param1 ^ 27));
        L0: while (true) {
          L1: {
            L2: {
              if (var3 == null) {
                break L2;
              } else {
                var7 = param0;
                var6 = var3.field_y;
                if (var4 != 0) {
                  if (var6 == var7) {
                    var3 = (id) ((Object) this.field_u.c(47));
                    L3: while (true) {
                      if (var3 != null) {
                        if (param0 != var3.field_y) {
                          var3 = (id) ((Object) this.field_u.b(param1 + -27));
                          if (var4 == 0) {
                            continue L3;
                          } else {
                            return null;
                          }
                        } else {
                          return var3;
                        }
                      } else {
                        return null;
                      }
                    }
                  } else {
                    break L1;
                  }
                } else {
                  if (var6 == var7) {
                    return var3;
                  } else {
                    var3 = (id) ((Object) this.field_K.b(6));
                    if (var4 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            if (param1 == 33) {
              var3 = (id) ((Object) this.field_u.c(47));
              L4: while (true) {
                if (var3 != null) {
                  if (param0 != var3.field_y) {
                    var3 = (id) ((Object) this.field_u.b(param1 + -27));
                    if (var4 == 0) {
                      continue L4;
                    } else {
                      return null;
                    }
                  } else {
                    return var3;
                  }
                } else {
                  return null;
                }
              }
            } else {
              break L1;
            }
          }
          this.field_A = (th) null;
          var3 = (id) ((Object) this.field_u.c(47));
          L5: while (true) {
            if (var3 != null) {
              if (param0 != var3.field_y) {
                var3 = (id) ((Object) this.field_u.b(param1 + -27));
                if (var4 == 0) {
                  continue L5;
                } else {
                  return null;
                }
              } else {
                return var3;
              }
            } else {
              return null;
            }
          }
        }
    }

    final void a(int param0, k param1) {
        int dupTemp$0 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        jj stackIn_25_0 = null;
        jj stackIn_25_1 = null;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        jj stackIn_26_0 = null;
        jj stackIn_26_1 = null;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        int stackIn_26_4 = 0;
        int stackIn_26_5 = 0;
        jj stackIn_27_0 = null;
        jj stackIn_27_1 = null;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        int stackIn_27_4 = 0;
        int stackIn_27_5 = 0;
        int stackIn_27_6 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        Object var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        wb var10 = null;
        cg var13 = null;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        int var17 = 0;
        String var18 = null;
        gm var19 = null;
        jj var20 = null;
        ce var21 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = null;
                    var17 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_H = param1.c((byte) -18);
                        stackIn_3_0 = this;
                        stackIn_2_0 = stackIn_3_0;
                        if (0 == param1.g(param0 ^ 31367)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_4_0 = this;
                        stackIn_4_1 = 1;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_4_0 = this;
                        stackIn_4_1 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ((kb) (this)).field_i = stackIn_4_1 != 0;
                        this.field_C = param1.d((byte) 69);
                        this.field_I = param1.d((byte) 69);
                        this.field_g = param1.d((byte) 69);
                        this.field_l = param1.g(31365);
                        if (param0 == 2) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var18 = (String) null;
                        kb.a(51, (String) null);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var3_int = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var3_int >= this.field_t) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.field_y[var3_int] = param1.g(31365);
                        this.field_D[var3_int][0] = param1.e(128);
                        this.field_D[var3_int][1] = param1.e(128);
                        this.field_d[var3_int] = param1.d((byte) 69);
                        this.field_e[var3_int] = (long)param1.e(128) << 1814250280;
                        this.field_m[var3_int] = 0;
                        this.field_J[var3_int] = 0;
                        this.field_a[var3_int] = param1.d((byte) 69);
                        this.field_z[var3_int] = param1.d((byte) 69);
                        var3_int++;
                        if (var17 != 0) {
                            statePc = 39;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var17 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        dupTemp$0 = param1.g(31365);
                        var3_int = dupTemp$0;
                        if (dupTemp$0 == 0) {
                            statePc = 39;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var4 = null;
                        var5 = param1.g(31365);
                        var6 = param1.d((byte) 69);
                        var7 = param1.d((byte) 69);
                        var8 = param1.d((byte) 69);
                        var8 = 255 & var8 | var8 << 2063955664 & -16777216;
                        var14 = var3_int;
                        if (var17 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        return;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (-2 == (var14 ^ -1)) {
                            statePc = 22;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var14 == 2) {
                            statePc = 23;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (3 == var14) {
                            statePc = 24;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if ((var14 ^ -1) != -5) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var17 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if ((var14 ^ -1) == -6) {
                            statePc = 29;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var9 = (byte)(3 & var8 >>> -112407074);
                        var8 = var8 & 1073741823;
                        var10 = new wb(var6, var7, var8);
                        var10.field_Lb = var9;
                        var4 = var10;
                        this.field_m[var9] = this.field_m[var9] + 1;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var19 = pg.a(var6, (byte) -83, var8, var7);
                        var19 = var19;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackIn_26_0 = null;
                        stackIn_25_0 = stackIn_26_0;
                        stackIn_26_1 = null;
                        stackIn_25_1 = stackIn_26_1;
                        stackIn_26_2 = var6;
                        stackIn_25_2 = stackIn_26_2;
                        stackIn_26_3 = var7;
                        stackIn_25_3 = stackIn_26_3;
                        stackIn_26_4 = var8 & 1;
                        stackIn_25_4 = stackIn_26_4;
                        stackIn_26_5 = 3 & var8 >>> 1525576830;
                        stackIn_25_5 = stackIn_26_5;
                        if ((536870912 & var8) == 0) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_27_0 = null;
                        stackIn_27_1 = null;
                        stackIn_27_2 = stackIn_25_2;
                        stackIn_27_3 = stackIn_25_3;
                        stackIn_27_4 = stackIn_25_4;
                        stackIn_27_5 = stackIn_25_5;
                        stackIn_27_6 = 1;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackIn_27_0 = null;
                        stackIn_27_1 = null;
                        stackIn_27_2 = stackIn_26_2;
                        stackIn_27_3 = stackIn_26_3;
                        stackIn_27_4 = stackIn_26_4;
                        stackIn_27_5 = stackIn_26_5;
                        stackIn_27_6 = 0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var20 = new jj(stackIn_27_2, stackIn_27_3, stackIn_27_4, stackIn_27_5, stackIn_27_6 != 0);
                        var20 = var20;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var13 = new cg((var8 & -1073741824) >>> -1684007362, var6, var7);
                        this.field_A.a(var13, false);
                        var4 = null;
                        if (var17 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var4 = null;
                        var14 = var5;
                        var15 = var8 & 255 | var8 >> 1679984176;
                        this.a(var6, var14, 117, var7, var15, (fh) null);
                        var21 = (ce) ((Object) this.field_s.a((byte) -127));
                        var21.field_l = var15 * 2;
                        if (var17 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw new IllegalArgumentException("invalid actor type: " + var3_int);
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (var4 == null) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        ((id) (var4)).field_y = var5;
                        this.field_f = 1 + var5;
                        this.field_K.a((br) (var4), false);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var17 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 35: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_37_0 = (RuntimeException) (var3);
                    stackIn_36_0 = stackIn_37_0;
                    stackIn_37_1 = new StringBuilder().append("kb.L(").append(param0).append(',');
                    stackIn_36_1 = stackIn_37_1;
                    if (param1 == null) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    stackIn_38_0 = (RuntimeException) ((Object) stackIn_36_0);
                    stackIn_38_1 = (StringBuilder) ((Object) stackIn_36_1);
                    stackIn_38_2 = "{...}";
                    statePc = 38;
                    continue stateLoop;
                }
                case 37: {
                    stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
                    stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
                    stackIn_38_2 = "null";
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    throw fa.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ')');
                }
                case 39: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, String param1, int param2, String param3, int param4, int param5) {
        int var7 = 0;
        ga var8 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            L1: {
              var8 = ma.field_a;
              var8.b((byte) -35, param2);
              if (param5 == 29602) {
                break L1;
              } else {
                field_w = (String) null;
                break L1;
              }
            }
            L2: {
              var8.field_j = var8.field_j + 1;
              var7 = var8.field_j;
              var8.a(114, param4);
              if (param4 != 2) {
                break L2;
              } else {
                var8.a(param1, (byte) 105);
                break L2;
              }
            }
            L3: {
              if (param3 != null) {
                ae.a(var8, param3, -31746);
                break L3;
              } else {
                var8.a(param0, (byte) -71);
                if (!ZombieDawnMulti.field_E) {
                  break L3;
                } else {
                  ae.a(var8, param3, -31746);
                  break L3;
                }
              }
            }
            var8.e(41, var8.field_j + -var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var6);

            stackIn_13_1 = new StringBuilder().append("kb.V(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(int param0, ff param1) {
        try {
            param1.a(true);
            param1.a(-4564);
            if (param0 >= -95) {
                this.field_g = 51;
            }
            param1.c((byte) -70);
            this.field_u.a(param1, false);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "kb.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(int param0) {
        L0: {
          if ((this.field_l ^ -1) == -2) {
            this.field_C = this.field_C - 250;
            break L0;
          } else {
            break L0;
          }
        }
        this.field_g = this.field_g - 1;
        if (param0 < -57) {
          return;
        } else {
          this.field_h = (fc) null;
          return;
        }
    }

    final wb a(int param0, boolean param1) {
        id var3;
        String var4;
        var3 = this.a(param0, (byte) 33);
        if (var3 != null) {
          if (var3 instanceof wb) {
            if (param1) {
              var4 = (String) null;
              kb.a(-73, (String) null, 60, (String) null, 9, -123);
              return (wb) ((Object) var3);
            } else {
              return (wb) ((Object) var3);
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final gm a(int param0, int param1) {
        id var3;
        int var4;
        var3 = this.a(param0, (byte) 33);
        if (var3 != null) {
          var4 = 94 / ((param1 - -27) / 43);
          if (!(var3 instanceof gm)) {
            return null;
          } else {
            return (gm) ((Object) var3);
          }
        } else {
          return null;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, fh param5) {
        ce var7 = null;
        RuntimeException var7_ref = null;
        ja[] var8 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var7 = new ce(param5, param0, param3, param4, param1);
            this.field_s.a(var7, false);
            if (param2 > 98) {
              break L0;
            } else {
              var8 = (ja[]) null;
              kb.a(-11, 108, (ja[]) null, -106, (ja[]) null, (fm) null, -103, -20, -90, 29, (ja[]) null, (byte) 50, 82, -116, 28);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7_ref = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var7_ref);

            stackIn_5_1 = new StringBuilder().append("kb.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    kb(String[] param0, fc param1) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_r = 0;
                        this.field_b = param0;
                        this.field_h = param1;
                        if (null == this.field_h) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.field_r = this.field_h.field_i;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        this.field_t = param0.length;
                        if (-2 != (this.field_t ^ -1)) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        this.field_t = 2;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        this.field_J = new int[this.field_t];
                        this.field_D = new int[this.field_t][2];
                        this.field_e = new long[this.field_t];
                        this.field_d = new int[this.field_t];
                        this.field_m = new int[this.field_t];
                        this.field_y = new int[this.field_t];
                        this.field_K = new th();
                        this.field_u = new th();
                        this.field_A = new th();
                        this.field_s = new th();
                        this.field_G = new th();
                        this.field_o = new int[this.field_t];
                        this.field_v = new int[this.field_t];
                        this.field_a = new int[this.field_t];
                        this.field_k = new hk[this.field_t];
                        this.field_z = new int[this.field_t];
                        var3_int = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (this.field_t <= var3_int) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        this.field_k[var3_int] = new hk();
                        var3_int++;
                        if (var4 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var4 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        this.field_t = param0.length;
                        this.field_c = false;
                        this.field_l = 0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_13_0 = (RuntimeException) (var3);
                    stackIn_12_0 = stackIn_13_0;
                    stackIn_13_1 = new StringBuilder().append("kb.<init>(");
                    stackIn_12_1 = stackIn_13_1;
                    if (param0 == null) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_14_0 = (RuntimeException) ((Object) stackIn_12_0);
                    stackIn_14_1 = (StringBuilder) ((Object) stackIn_12_1);
                    stackIn_14_2 = "{...}";
                    statePc = 14;
                    continue stateLoop;
                }
                case 13: {
                    stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
                    stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                    stackIn_14_2 = "null";
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_15_0 = stackIn_16_0;
                    stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
                    stackIn_15_1 = stackIn_16_1;
                    if (param1 == null) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    stackIn_17_0 = (RuntimeException) ((Object) stackIn_15_0);
                    stackIn_17_1 = (StringBuilder) ((Object) stackIn_15_1);
                    stackIn_17_2 = "{...}";
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                    stackIn_17_2 = "null";
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    throw fa.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
                }
                case 18: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_w = "This game has started.";
        field_q = "This option cannot be combined with the current settings for:  ";
        field_p = "Owner";
        field_E = "Mouse-over an icon for details";
        field_B = "Resign";
    }
}
