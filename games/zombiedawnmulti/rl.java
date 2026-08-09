/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl {
    static String[] field_h;
    boolean field_l;
    private hk[] field_d;
    th field_q;
    private int[] field_i;
    private int[] field_j;
    private int[] field_k;
    private c[][] field_s;
    private int[] field_g;
    static of[] field_r;
    private th field_n;
    static byte[] field_v;
    private boolean field_t;
    private th field_e;
    int[] field_p;
    fh field_b;
    private boolean field_o;
    kb field_m;
    static String field_c;
    private th field_f;
    static ja[] field_a;
    th field_u;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var7;
        int var8;
        qj var9;
        hk var10;
        hk var11;
        if (param1 == -11513) {
          L0: {
            var10 = this.field_d[param2];
            var11 = var10;
            if ((param3 ^ -1) > -1) {
              break L0;
            } else {
              if (var11.field_d.length <= param3) {
                break L0;
              } else {
                if (255 == var10.field_d[param3]) {
                  break L0;
                } else {
                  if ((var10.field_b[param3] ^ -1) < (this.field_m.field_H ^ -1)) {
                    L1: {
                      if (1000 + this.field_m.field_H < var10.field_b[param3]) {
                        this.a((byte) -118, "powerup not ready", this.field_m.field_H + ": " + param2 + " tried to use a powerup slot that's not ready yet: " + param3 + " is due " + var10.field_b[param3]);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    return;
                  } else {
                    var7 = var10.field_d[param3];
                    var8 = var10.field_f[param3];
                    var9 = new qj(this.field_m.field_H + 50, param2, var7, var8, param4, param0);
                    this.field_e.a(var9, false);
                    this.a(-7737, rm.a(this.field_m.field_H, param4, param0, var7, var8, param2, param1 ^ -13113, param4));
                    var11.field_b[param3] = this.field_m.field_H + this.field_m.a(var8, var7, param2, false);
                    return;
                  }
                }
              }
            }
          }
          this.a((byte) 95, "invalid powerup slot", param2 + " tried to use invalid powerup slot: " + param3);
          return;
        } else {
          return;
        }
    }

    final static void b(byte param0) {
        if (nb.field_a != null) {
            nb.field_a.g((byte) 118);
        }
        if (param0 >= -125) {
            return;
        }
        if (null != pj.field_I) {
            pj.field_I.l(124);
        }
        qe.d(0);
    }

    final void a(int param0, ge param1, int param2, lm param3) {
        int var5_int = param3.e((byte) -112);
        int var6 = param3.g(param2 + 1829980022);
        ge var7 = new ge(var5_int, var6, param3.k((byte) 121));
        if (param2 != -32422) {
            return;
        }
        try {
            var7.field_A = (rl) (this);
            var7.field_x = this.field_m.a(param2 + -16744794);
            var7.field_gb = param0;
            this.field_m.field_d[var7.field_gb] = this.field_m.field_d[var7.field_gb] + param3.o(-116);
            this.field_u.a(var7, false);
            this.a(param3, var7, param1, false);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "rl.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0) {
        this.d(-32724);
        if (param0 != -198) {
            return;
        }
        this.a(120);
    }

    public static void c(int param0) {
        field_a = null;
        field_c = null;
        field_h = null;
        field_r = null;
        if (param0 < 59) {
            field_c = (String) null;
        }
        field_v = null;
    }

    private final void a(int param0, ge param1) {
        pc var3 = null;
        if (param0 != -2) {
            this.field_j = (int[]) null;
        }
        param1.field_eb = false;
        if (param1.field_Z) {
            return;
        }
        try {
            var3 = aq.a(this.field_m.field_H, false, param1.field_tb.field_x, param1.field_x);
            this.a(param0 + -7735, var3);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "rl.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, ek param1) {
        c var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              param1.c((byte) -70);
              if (param0 < -21) {
                break L1;
              } else {
                rl.a((byte) 90);
                break L1;
              }
            }
            L2: {
              var3 = this.a(true, param1.field_C, param1.field_B);
              if (var3 == null) {
                break L2;
              } else {
                var3.a(param1, true);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3_ref);

            stackIn_7_1 = new StringBuilder().append("rl.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    final c a(boolean param0, int param1, int param2) {
        if (!param0) {
            return (c) null;
        }
        if (this.field_s[0].length < param1) {
            return null;
        }
        if ((param2 ^ -1) < (this.field_s.length ^ -1)) {
            return null;
        }
        if (param2 < 0) {
            return null;
        }
        if (0 > param1) {
            return null;
        }
        if (!(null != this.field_s[param2][param1])) {
            this.field_s[param2][param1] = new c();
        }
        return this.field_s[param2][param1];
    }

    private final void b(int param0, int param1) {
        ge var3;
        pa var4;
        lm var5;
        var4 = this.a((byte) -125, param1);
        if (var4 != null) {
          var4.b(false);
          if (param0 == 4) {
            L0: {
              L1: {
                if (!(var4 instanceof ge)) {
                  break L1;
                } else {
                  var3 = (ge) ((Object) var4);
                  var3.f(true);
                  var3.t(4);
                  var3.r((byte) -111);
                  if (-30 == (var3.field_Q ^ -1)) {
                    var3.a(4, (byte) -89);
                    if (!ZombieDawnMulti.field_E) {
                      break L0;
                    } else {
                      break L1;
                    }
                  } else {
                    break L0;
                  }
                }
              }
              L2: {
                if (!(var4 instanceof lm)) {
                  break L2;
                } else {
                  var5 = (lm) ((Object) var4);
                  var5.n((byte) -100);
                  break L2;
                }
              }
              break L0;
            }
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void a(byte param0, ge param1, boolean param2) {
        try {
            if (param0 != 65) {
                this.field_l = false;
            }
            this.field_n.a(new nk(param1, param1.e((byte) -112), param1.g(1829947600), param2), false);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "rl.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void a(int param0, pa param1) {
        so var3 = null;
        param1.field_S = false;
        if (param1.field_Z) {
            return;
        }
        try {
            if (param0 != -2) {
                this.field_s = (c[][]) null;
            }
            var3 = ng.a(param1.field_N, param0 ^ -101, param1.field_Q, param1.field_x, param1.field_G, this.field_m.field_H, param1.field_E, param1.field_db, param1.field_ab);
            this.a(-7737, var3);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "rl.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final pa a(byte param0, int param1) {
        ek var3 = this.c(param1, -117);
        if (var3 == null) {
            return null;
        }
        if (!(var3 instanceof pa)) {
            throw new IllegalArgumentException("oid " + param1 + " is not a character");
        }
        if (param0 > -119) {
            field_v = (byte[]) null;
        }
        return (pa) ((Object) var3);
    }

    private final void a(int param0) {
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        kb stackIn_49_0 = null;
        kb stackIn_55_0 = null;
        kb stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        kb stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        kb stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        int stackIn_58_2 = 0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ge var9 = null;
        ge var10 = null;
        int[] var15 = null;
        int[] var16 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = ZombieDawnMulti.field_E ? 1 : 0;
                    if (param0 > 100) {
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
                    var3 = this.field_m.field_l;
                    if (-1 == (var3 ^ -1)) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (-2 == (var3 ^ -1)) {
                        statePc = 11;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var3 == 2) {
                        statePc = 36;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if ((this.field_m.field_H ^ -1) <= -401) {
                        statePc = 9;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (-2 != (this.field_m.field_t ^ -1)) {
                        statePc = 60;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    this.a(false, 1);
                    if (var7 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (df.field_I) {
                        statePc = 13;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (-1 == (this.field_m.field_m[0] ^ -1)) {
                        statePc = 15;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (!pp.field_n) {
                        statePc = 60;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (11 != hg.field_rb) {
                        statePc = 18;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var9 = new ge(hc.field_c, gk.field_c, 0);
                    var9.a(-9019, (rl) (this));
                    var9.field_gb = 0;
                    var9.field_x = this.field_m.a(-16777216);
                    this.field_m.field_K.a(-25612, var9);
                    var9.field_S = true;
                    op.field_m.field_f = var9.field_x;
                    var10 = new ge(hc.field_c, -30 + gk.field_c, 1);
                    var10.a(-9019, (rl) (this));
                    var10.field_gb = 0;
                    var10.field_x = this.field_m.a(-16777216);
                    this.field_m.field_K.a(-25612, var10);
                    var10.field_S = true;
                    statePc = 60;
                    continue stateLoop;
                }
                case 19: {
                    if ((this.field_m.field_H % 32 ^ -1) != -1) {
                        statePc = 60;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var3 = this.field_m.field_t;
                    var15 = this.field_m.field_m;
                    var5 = 0;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    if ((var5 ^ -1) <= (var15.length ^ -1)) {
                        statePc = 26;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var6 = var15[var5];
                    stackIn_27_0 = 0;
                    stackIn_23_0 = stackIn_27_0;
                    stackIn_27_1 = var6;
                    stackIn_23_1 = stackIn_27_1;
                    if (var7 != 0) {
                        statePc = 27;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (stackIn_23_0 != stackIn_23_1) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var3--;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    var5++;
                    if (var7 == 0) {
                        statePc = 21;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackIn_27_0 = -1;
                    stackIn_27_1 = var3 ^ -1;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (stackIn_27_0 == stackIn_27_1) {
                        statePc = 30;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (4500 >= this.field_m.field_H) {
                        statePc = 35;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if ((this.field_m.field_I / 8 ^ -1) <= (this.field_m.field_g ^ -1)) {
                        statePc = 34;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if ((this.field_m.field_H ^ -1) <= (this.field_m.field_C + -3000 ^ -1)) {
                        statePc = 34;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (1 >= var3) {
                        statePc = 34;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 34: {
                    this.a(false, 2);
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (var7 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var2 = this.field_m.field_t;
                    var16 = this.field_m.field_m;
                    var4 = 0;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if ((var4 ^ -1) <= (var16.length ^ -1)) {
                        statePc = 42;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var5 = var16[var4];
                    stackIn_43_0 = var5 ^ -1;
                    stackIn_39_0 = stackIn_43_0;
                    stackIn_43_1 = -1;
                    stackIn_39_1 = stackIn_43_1;
                    if (var7 != 0) {
                        statePc = 43;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (stackIn_39_0 != stackIn_39_1) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    var2--;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    var4++;
                    if (var7 == 0) {
                        statePc = 37;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    stackIn_43_0 = var2 ^ -1;
                    stackIn_43_1 = -1;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    if (stackIn_43_0 == stackIn_43_1) {
                        statePc = 46;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if ((this.field_m.field_C ^ -1) < (this.field_m.field_H ^ -1)) {
                        statePc = 60;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    var3 = 0;
                    var4 = 0;
                    var5 = 1;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    if ((var5 ^ -1) <= (this.field_m.field_d.length ^ -1)) {
                        statePc = 54;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    stackIn_55_0 = this.field_m;
                    stackIn_49_0 = stackIn_55_0;
                    if (var7 != 0) {
                        statePc = 55;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (stackIn_49_0.field_d[var5] != this.field_m.field_d[var3]) {
                        statePc = 51;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var4 = 1;
                    if (var7 == 0) {
                        statePc = 53;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    if (this.field_m.field_d[var5] <= this.field_m.field_d[var3]) {
                        statePc = 53;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    var3 = var5;
                    var4 = 0;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    var5++;
                    if (var7 == 0) {
                        statePc = 47;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    stackIn_55_0 = this.field_m;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    stackIn_57_0 = (kb) ((Object) stackIn_55_0);
                    stackIn_56_0 = stackIn_57_0;
                    stackIn_57_1 = -110;
                    stackIn_56_1 = stackIn_57_1;
                    if (var4 == 0) {
                        statePc = 57;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    stackIn_58_0 = (kb) ((Object) stackIn_56_0);
                    stackIn_58_1 = stackIn_56_1;
                    stackIn_58_2 = -1;
                    statePc = 58;
                    continue stateLoop;
                }
                case 57: {
                    stackIn_58_0 = (kb) ((Object) stackIn_57_0);
                    stackIn_58_1 = stackIn_57_1;
                    stackIn_58_2 = var3;
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    ((kb) (Object) stackIn_58_0).a((byte) stackIn_58_1, stackIn_58_2);
                    this.a(false, 3);
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        md var4_ref_md = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        md var17 = null;
        int var17_int = 0;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ak.field_a = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
                        var1_int = vn.field_c.length;
                        if (param0 >= 101) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_h = (String[]) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var21 = new int[var1_int];
                        var20 = var21;
                        var2 = var20;
                        var3 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var3 >= var1_int) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var4_ref_md = vn.field_c[var3];
                        var17 = var4_ref_md;
                        var17 = var4_ref_md;
                        var4_ref_md.a((byte) -81);
                        c.a(var3, (byte) 75);
                        var5 = var4_ref_md.field_D + var4_ref_md.field_C >> 1546541409;
                        var6 = var4_ref_md.field_G + var4_ref_md.field_l >> 417600865;
                        var7 = var4_ref_md.field_j + var4_ref_md.field_r >> 1797707969;
                        var8 = ak.field_a[9] >> 498310498;
                        var9 = ak.field_a[10] >> 557478690;
                        var10_int = ak.field_a[11] >> 2097945858;
                        var11 = hl.field_c[4] * var9 + var8 * hl.field_c[3] - -(var10_int * hl.field_c[5]) >> 1591623950;
                        var12 = var9 * hl.field_c[7] + hl.field_c[6] * var8 - -(hl.field_c[8] * var10_int) >> 1119527310;
                        var13 = var10_int * hl.field_c[11] + hl.field_c[10] * var9 + hl.field_c[9] * var8 >> 1934932974;
                        var2[var3] = var7 * var13 + (var12 * var6 + var11 * var5) >> 1113028080;
                        var3++;
                        if (var19 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var19 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var3 = ak.field_a[9] >> 792557224;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var4 = ak.field_a[10] >> 714580008;
                        var5 = ak.field_a[11] >> -1926026872;
                        var6 = f.field_a << -287271580;
                        var7 = 0;
                        var8 = on.a(var6, -18924) >> -587800440;
                        var9 = wn.a(-126, var6) >> -228522648;
                        if (0 == (bd.field_g ^ -1)) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((bo.field_d ^ -1) != 0) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var9 = -128;
                        var7 = bd.field_g - 320;
                        var8 = -bo.field_d + 240;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var10 = 256.0 / Math.sqrt((double)(var7 * var7 + (var8 * var8 + var9 * var9)));
                        var8 = (int)((double)var8 * var10);
                        var9 = (int)((double)var9 * var10);
                        var7 = (int)((double)var7 * var10);
                        var12 = -var3 + var7;
                        var13 = var8 + -var4;
                        var14 = -var5 + var9;
                        var10 = 256.0 / Math.sqrt((double)(var14 * var14 + (var12 * var12 + var13 * var13)));
                        var12 = (int)((double)var12 * var10);
                        var14 = (int)((double)var14 * var10);
                        var13 = (int)((double)var13 * var10);
                        var15 = 0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_15_0 = var15;
                        stackIn_15_1 = vn.field_c.length;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (stackIn_15_0 >= stackIn_15_1) {
                            statePc = 32;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var16 = 0;
                        if (var19 != 0) {
                            statePc = 33;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var17_int = 1;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var17_int >= vn.field_c.length) {
                            statePc = 23;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_15_0 = var21[var16] ^ -1;
                        stackIn_20_0 = stackIn_15_0;
                        stackIn_15_1 = var21[var17_int] ^ -1;
                        stackIn_20_1 = stackIn_15_1;
                        if (var19 != 0) {
                            statePc = 15;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (stackIn_20_0 <= stackIn_20_1) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var16 = var17_int;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var17_int++;
                        if (var19 == 0) {
                            statePc = 18;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var2[var16] = -2147483648;
                        var17 = vn.field_c[var16];
                        c.a(var16, (byte) 106);
                        var18 = 0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var18 >= 3) {
                            statePc = 28;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        hl.field_c[var18] = hl.field_c[var18] + lk.field_G[var15][var18];
                        var18++;
                        if (var19 != 0) {
                            statePc = 29;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var19 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        sa.a(var17, ak.field_a, true, hl.field_c, (byte) -121, false, false);
                        gh.a(var17, var7, (byte) 116, var12, var14, var9, var13, var8);
                        var15++;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var19 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 31: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) runtimeException), "rl.T(" + param0 + ')');
                }
                case 32: {
                    return;
                }
                case 33: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, ae param1) {
        ae var3 = null;
        int var4 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (!this.field_q.f(param0 + 35850)) {
              var3 = (ae) ((Object) this.field_q.a((byte) 76));
              L1: while (true) {
                L2: {
                  L3: {
                    if (var3 == null) {
                      break L3;
                    } else {
                      stackIn_13_0 = param1.field_f ^ -1;

                      stackIn_13_1 = var3.field_f ^ -1;

                      if (var4 != 0) {
                        break L2;
                      } else {
                        if (stackIn_13_0 <= stackIn_13_1) {
                          qc.a(param1, var3, 0);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          var3 = (ae) ((Object) this.field_q.c((byte) 123));
                          if (var4 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  this.field_q.a(-25612, param1);
                  stackIn_13_0 = param0;
                  stackIn_13_1 = -7737;
                  break L2;
                }
                L4: {
                  if (stackIn_13_0 == stackIn_13_1) {
                    break L4;
                  } else {
                    this.field_d = (hk[]) null;
                    break L4;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              this.field_q.a(param0 ^ 31283, param1);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3_ref);

            stackIn_18_1 = new StringBuilder().append("rl.CA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    private final void a(boolean param0, byte param1, fc param2) {
        boolean stackIn_4_0 = false;
        int stackIn_10_0 = 0;
        boolean stackIn_17_0 = false;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        boolean stackIn_38_0 = false;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        int decompiledRegionSelector0 = 0;
        boolean stackOut_3_0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var4 = null;
        ek var5_ref_ek = null;
        int var5 = 0;
        Object var6 = null;
        Object var7 = null;
        ek var8_ref_ek = null;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        int var12_int = 0;
        Object var12 = null;
        int var13 = 0;
        int var14 = 0;
        sh var15 = null;
        th var16 = null;
        sh var17 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_b = new fh(param2);
                        this.field_s = new c[(this.field_b.field_c >> -1771110265) + 1][1 + (this.field_b.field_r >> -1092212313)];
                        this.field_m.field_H = 0;
                        ip.b((byte) 97);
                        this.field_n = new th();
                        this.field_f = new th();
                        this.field_e = new th();
                        var16 = param2.a(91);
                        var5_ref_ek = (ek) ((Object) var16.c(78));
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var5_ref_ek == null) {
                            statePc = 9;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = var5_ref_ek instanceof sh;
                        stackIn_10_0 = stackOut_3_0 ? 1 : 0;
                        stackIn_4_0 = stackOut_3_0;
                        if (var14 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var15 = (sh) ((Object) var5_ref_ek);
                        var17 = var15;
                        if ((var17.field_O ^ -1) <= (this.field_m.field_t ^ -1)) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var17.a(-9019, (rl) (this));
                        var15.field_O = this.field_m.field_y[var15.field_O];
                        this.field_f.a(var5_ref_ek, false);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var5_ref_ek = (ek) ((Object) var16.b(6));
                        if (var14 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        this.field_m.field_I = 0;
                        stackIn_10_0 = 2 * this.field_m.field_t;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5 = stackIn_10_0;
                        var6 = null;
                        var7 = null;
                        if (!param0) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var7 = new ek[var5];
                        var6 = new int[var5];
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (param1 == -6) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return;
                }
                case 14: {
                    try {
                        var8_ref_ek = (ek) ((Object) this.field_u.c(123));
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var8_ref_ek == null) {
                            statePc = 37;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_38_0 = var8_ref_ek instanceof lm;
                        stackIn_17_0 = stackIn_38_0;
                        if (var14 != 0) {
                            statePc = 38;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (!stackIn_17_0) {
                            statePc = 34;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        this.field_m.field_I = this.field_m.field_I + 1;
                        if (!param0) {
                            statePc = 36;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var9 = 2147483647;
                        var10 = (sh) ((Object) this.field_f.c(73));
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var10 == null) {
                            statePc = 25;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var11 = ((sh) (var10)).e((byte) -112) - var8_ref_ek.e((byte) -112);
                        var12_int = ((sh) (var10)).g(1829947600) - var8_ref_ek.g(1829947600);
                        var13 = var11 * var11 + var12_int * var12_int;
                        stackIn_27_0 = var13;
                        stackIn_22_0 = stackIn_27_0;
                        stackIn_27_1 = var9;
                        stackIn_22_1 = stackIn_27_1;
                        if (var14 != 0) {
                            statePc = 27;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (stackIn_22_0 >= stackIn_22_1) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var9 = var13;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var10 = (sh) ((Object) this.field_f.b(6));
                        if (var14 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var10 = var10;
                        var11 = 0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackIn_27_0 = var11;
                        stackIn_27_1 = ((Object[]) (var6)).length;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (stackIn_27_0 >= stackIn_27_1) {
                            statePc = 33;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackIn_47_0 = var9 ^ -1;
                        stackIn_29_0 = stackIn_47_0;
                        stackIn_47_1 = ((int[]) (var6))[var11] ^ -1;
                        stackIn_29_1 = stackIn_47_1;
                        if (var14 != 0) {
                            statePc = 47;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (stackIn_29_0 < stackIn_29_1) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var12 = ((Object[]) (var7))[var11];
                        var13 = ((int[]) (var6))[var11];
                        ((int[]) (var6))[var11] = var9;
                        var9 = var13;
                        ((Object[]) (var7))[var11] = var10;
                        var10 = var12;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var11++;
                        if (var14 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var14 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (!(var8_ref_ek instanceof ge)) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var8_ref_ek = (ek) ((Object) this.field_u.b(6));
                        if (var14 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackIn_38_0 = param0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (!stackIn_38_0) {
                            statePc = 45;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var8 = 0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (((Object[]) (var7)).length <= var8) {
                            statePc = 45;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var14 != 0) {
                            statePc = 46;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (null == ((Object[]) (var7))[var8]) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        ((lm) (((Object[]) (var7))[var8])).p(95);
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var8++;
                        if (var14 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        this.field_m.field_g = this.field_m.field_I;
                        this.field_m.field_C = 9000 + 250 * this.field_m.field_I;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackIn_47_0 = this.field_m.field_t ^ -1;
                        stackIn_47_1 = -2;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (stackIn_47_0 != stackIn_47_1) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        this.field_m.field_C = 64512;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (64512 >= this.field_m.field_C) {
                            statePc = 56;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        this.field_m.field_C = 64512;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 52: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_54_0 = (RuntimeException) (var4);
                    stackIn_53_0 = stackIn_54_0;
                    stackIn_54_1 = new StringBuilder().append("rl.K(").append(param0).append(',').append(param1).append(',');
                    stackIn_53_1 = stackIn_54_1;
                    if (param2 == null) {
                        statePc = 54;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    stackIn_55_0 = (RuntimeException) ((Object) stackIn_53_0);
                    stackIn_55_1 = (StringBuilder) ((Object) stackIn_53_1);
                    stackIn_55_2 = "{...}";
                    statePc = 55;
                    continue stateLoop;
                }
                case 54: {
                    stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
                    stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
                    stackIn_55_2 = "null";
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    throw fa.a((Throwable) ((Object) stackIn_55_0), stackIn_55_2 + ')');
                }
                case 56: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final lm a(int param0, int param1) {
        ek var3 = this.c(param1, param0 + -417600939);
        if (param0 != 417600865) {
            pa var4 = (pa) null;
            this.a(-39, (pa) null);
        }
        if (!(var3 != null)) {
            throw new IllegalArgumentException("oid " + param1 + " invalid");
        }
        if (!(var3 instanceof lm)) {
            throw new IllegalArgumentException("oid " + param1 + " is not a human");
        }
        return (lm) ((Object) var3);
    }

    private final void a(int param0, boolean param1, int param2, byte param3) {
        this.field_n.a(new nk((rl) (this), param2, param0, param1), false);
        if (param3 >= -44) {
            ge var6 = (ge) null;
            this.a((byte) -68, (ge) null);
        }
    }

    private final void a(boolean param0, int param1) {
        boolean discarded$0 = false;
        this.field_m.field_l = param1;
        if (param0) {
            discarded$0 = this.b(-90, 117, 86, 71, -86, 91);
        }
        int var3 = this.field_m.field_l;
        if (!(var3 != 2)) {
            this.field_m.field_C = this.field_m.field_H + 3000;
        }
        this.a(-7737, new fq(this.field_m.field_H, this.field_m.field_l, this.field_m.field_C));
    }

    private final ek c(int param0, int param1) {
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        int var3 = 101 / ((31 - param1) / 58);
        ek var4 = (ek) ((Object) this.field_u.c(101));
        do {
            if (var4 == null) {
                return null;
            }
            if (!(var4.field_x != param0)) {
                return var4;
            }
            var4 = (ek) ((Object) this.field_u.b(6));
        } while (var5 == 0);
        return null;
    }

    private final void a(byte param0, String param1, String param2) {
        try {
            int var4_int = 46 / ((param0 - -53) / 59);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "rl.HA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, ge param1) {
        if (!(!param1.field_Z)) {
            return;
        }
        try {
            this.a(-7737, new aj(this.field_m.field_H, param1.field_x));
            param1.field_eb = false;
            int var3_int = -89 / ((param0 - -48) / 48);
            param1.field_S = false;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "rl.KA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final ek a(int param0, boolean param1) {
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        ek var3 = (ek) ((Object) this.field_m.field_u.c(104));
        if (!param1) {
            return (ek) null;
        }
        do {
            if (var3 == null) {
                return null;
            }
            if (!(param0 != var3.field_x)) {
                return var3;
            }
            var3 = (ek) ((Object) this.field_m.field_u.b(6));
        } while (var4 == 0);
        return null;
    }

    private final boolean b(int param0, int param1, int param2, int param3, int param4, int param5) {
        int stackIn_24_0 = 0;
        ge stackIn_85_0 = null;
        ge stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        ge stackIn_112_0 = null;
        ge stackIn_113_0 = null;
        int stackIn_113_1 = 0;
        Object stackIn_117_0 = null;
        int stackIn_117_1 = 0;
        Object stackIn_118_0 = null;
        int stackIn_118_1 = 0;
        int stackIn_118_2 = 0;
        ge stackIn_127_0 = null;
        ge stackIn_128_0 = null;
        int stackIn_128_1 = 0;
        ge stackIn_140_0 = null;
        int stackIn_140_1 = 0;
        ge stackIn_141_0 = null;
        int stackIn_141_1 = 0;
        int stackIn_141_2 = 0;
        Object stackIn_152_0 = null;
        Object stackIn_153_0 = null;
        int stackIn_153_1 = 0;
        int var7;
        ge var8;
        pa var9;
        lm var10;
        int var11;
        int var12_int;
        ek var12;
        int var13;
        og var13_ref_og;
        int var14;
        ge var15;
        ge var16;
        pa var17;
        Object var18;
        ge var18_ref;
        ge var19;
        ge var20;
        ge var21;
        pa var22;
        ge var23;
        L0: {
          var18 = null;
          var14 = ZombieDawnMulti.field_E ? 1 : 0;
          var7 = param2;
          if (!this.field_o) {
            break L0;
          } else {
            System.out.println(this.field_m.field_H + ": executing powerup " + param1 + " with modifier " + param0);
            break L0;
          }
        }
        L1: {
          if (!this.field_m.b((byte) -105, 45, param5)) {
            break L1;
          } else {
            if (param1 != 17) {
              return false;
            } else {
              break L1;
            }
          }
        }
        L2: {
          L3: {
            if (-17 == (param1 ^ -1)) {
              break L3;
            } else {
              if (7 == param1) {
                break L3;
              } else {
                if ((param1 ^ -1) == -5) {
                  break L3;
                } else {
                  if (3 == param1) {
                    break L3;
                  } else {
                    if (-15 == (param1 ^ -1)) {
                      break L3;
                    } else {
                      if (param1 == 8) {
                        break L3;
                      } else {
                        if (-2 == (param1 ^ -1)) {
                          break L3;
                        } else {
                          if (param1 == 2) {
                            break L3;
                          } else {
                            if (5 == param1) {
                              break L3;
                            } else {
                              if (-1 == (param1 ^ -1)) {
                                break L3;
                              } else {
                                if ((param1 ^ -1) == -19) {
                                  break L3;
                                } else {
                                  if (param1 != 6) {
                                    break L2;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          var15 = this.b((byte) 87, var7);
          var12_int = 0;
          if (var15 != null) {
            L4: {
              var13 = var15.field_gb;
              if (!this.field_m.b(0, var13)) {
                stackIn_24_0 = 0;
                break L4;
              } else {
                stackIn_24_0 = 1;
                break L4;
              }
            }
            L5: {
              var12_int = stackIn_24_0;
              if (var12_int == 0) {
                break L5;
              } else {
                L6: {
                  if (param1 == 12) {
                    break L6;
                  } else {
                    if (11 == param1) {
                      break L6;
                    } else {
                      if (-18 == (param1 ^ -1)) {
                        break L6;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                var12_int = 0;
                break L5;
              }
            }
            if (var12_int == 0) {
              break L2;
            } else {
              this.a((byte) 23, var15);
              return false;
            }
          } else {
            break L2;
          }
        }
        L7: {
          var12 = this.c(var7, -69);
          if (var12 == null) {
            break L7;
          } else {
            if (var12 instanceof og) {
              var13_ref_og = (og) ((Object) var12);
              if ((var13_ref_og.field_O ^ -1) != (param5 ^ -1)) {
                this.field_k[var13_ref_og.field_O] = cr.b(this.field_k[var13_ref_og.field_O], 1);
                return false;
              } else {
                return false;
              }
            } else {
              break L7;
            }
          }
        }
        L8: {
          var13 = param1;
          if (3 != var13) {
            break L8;
          } else {
            if (var14 == 0) {
              var16 = this.b((byte) 32, var7);
              if (var16 != null) {
                if ((var16.field_gb ^ -1) == (param5 ^ -1)) {
                  L9: {
                    stackIn_85_0 = (ge) (var16);

                    if (38 == param0) {
                      stackIn_86_0 = (ge) ((Object) stackIn_85_0);
                      stackIn_86_1 = 24;
                      break L9;
                    } else {
                      stackIn_86_0 = (ge) ((Object) stackIn_85_0);
                      stackIn_86_1 = 19;
                      break L9;
                    }
                  }
                  ((ge) (Object) stackIn_86_0).a(stackIn_86_1, (byte) -89);
                  var16.field_S = true;
                  return true;
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              break L8;
            }
          }
        }
        if (-8 == (var13 ^ -1)) {
          var17 = this.a((byte) -120, var7);
          if (var17 == null) {
            return false;
          } else {
            L10: {
              L11: {
                L12: {
                  if (!(var17 instanceof lm)) {
                    break L12;
                  } else {
                    if (!var17.field_Z) {
                      break L11;
                    } else {
                      break L12;
                    }
                  }
                }
                if (!(var17 instanceof ge)) {
                  break L10;
                } else {
                  if (param0 == 37) {
                    L13: {
                      var18_ref = (ge) ((Object) var17);
                      if (this.field_o) {
                        System.out.println("cursing, owner " + var18_ref.field_gb + ", prev 0 " + var18_ref.d((byte) 61, 0) + " 1 " + var18_ref.d((byte) 61, 1));
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    L14: {
                      if (var18_ref.field_gb == param5) {
                        break L14;
                      } else {
                        if (!var18_ref.d((byte) 61, param5)) {
                          break L14;
                        } else {
                          this.field_k[param5] = cr.b(this.field_k[param5], 2);
                          break L14;
                        }
                      }
                    }
                    var18_ref.e(93, param5);
                    if (var14 == 0) {
                      break L10;
                    } else {
                      break L11;
                    }
                  } else {
                    break L10;
                  }
                }
              }
              var10 = this.a(417600865, var7);
              if (-21 == (var10.field_Q ^ -1)) {
                break L10;
              } else {
                if (18 == var10.field_Q) {
                  break L10;
                } else {
                  this.a(param5, (ge) null, -32422, var10);
                  var10.j(18);
                  break L10;
                }
              }
            }
            return true;
          }
        } else {
          if ((var13 ^ -1) == -5) {
            var8 = this.b((byte) 124, var7);
            if (var8 == null) {
              return false;
            } else {
              L15: {
                stackIn_112_0 = (ge) (var8);

                if (param0 != 34) {
                  stackIn_113_0 = (ge) ((Object) stackIn_112_0);
                  stackIn_113_1 = 0;
                  break L15;
                } else {
                  stackIn_113_0 = (ge) ((Object) stackIn_112_0);
                  stackIn_113_1 = 1;
                  break L15;
                }
              }
              ((ge) (Object) stackIn_113_0).a(stackIn_113_1 != 0, (byte) 100);
              return true;
            }
          } else {
            L16: {
              L17: {
                if (-11 != (var13 ^ -1)) {
                  break L17;
                } else {
                  if (var14 == 0) {
                    break L16;
                  } else {
                    break L17;
                  }
                }
              }
              L18: {
                if (-10 != (var13 ^ -1)) {
                  break L18;
                } else {
                  if (var14 == 0) {
                    break L16;
                  } else {
                    break L18;
                  }
                }
              }
              if (-14 == (var13 ^ -1)) {
                L19: {
                  stackIn_117_0 = this;

                  stackIn_117_1 = param4;

                  if (-37 != (param0 ^ -1)) {
                    stackIn_118_0 = this;
                    stackIn_118_1 = stackIn_117_1;
                    stackIn_118_2 = 0;
                    break L19;
                  } else {
                    stackIn_118_0 = this;
                    stackIn_118_1 = stackIn_117_1;
                    stackIn_118_2 = 1;
                    break L19;
                  }
                }
                this.a(stackIn_118_1, stackIn_118_2 != 0, param2, (byte) -52);
                return true;
              } else {
                if (-2 == (var13 ^ -1)) {
                  var19 = this.b((byte) 25, var7);
                  if (var19 == null) {
                    return false;
                  } else {
                    var19.l((byte) -52);
                    return true;
                  }
                } else {
                  L20: {
                    if (var13 != 2) {
                      break L20;
                    } else {
                      if (var14 == 0) {
                        var8 = this.b((byte) 32, var7);
                        if (var8 != null) {
                          L21: {
                            stackIn_127_0 = (ge) (var8);

                            if (param0 != 38) {
                              stackIn_128_0 = (ge) ((Object) stackIn_127_0);
                              stackIn_128_1 = 0;
                              break L21;
                            } else {
                              stackIn_128_0 = (ge) ((Object) stackIn_127_0);
                              stackIn_128_1 = 1;
                              break L21;
                            }
                          }
                          ((ge) (Object) stackIn_128_0).b(stackIn_128_1 != 0, (byte) -127);
                          return true;
                        } else {
                          return false;
                        }
                      } else {
                        break L20;
                      }
                    }
                  }
                  if (var13 == 16) {
                    var20 = this.b((byte) 100, var7);
                    if (var20 == null) {
                      return false;
                    } else {
                      var20.m(-6556);
                      return true;
                    }
                  } else {
                    L22: {
                      if (-15 != (var13 ^ -1)) {
                        break L22;
                      } else {
                        if (var14 == 0) {
                          var21 = this.b((byte) 86, var7);
                          if (var21 != null) {
                            var21.l(34);
                            return true;
                          } else {
                            return false;
                          }
                        } else {
                          break L22;
                        }
                      }
                    }
                    L23: {
                      if (5 != var13) {
                        break L23;
                      } else {
                        if (var14 == 0) {
                          var8 = this.b((byte) 68, var7);
                          if (var8 != null) {
                            L24: {
                              stackIn_140_0 = (ge) (var8);

                              stackIn_140_1 = 47;

                              if (param0 != 35) {
                                stackIn_141_0 = (ge) ((Object) stackIn_140_0);
                                stackIn_141_1 = stackIn_140_1;
                                stackIn_141_2 = 0;
                                break L24;
                              } else {
                                stackIn_141_0 = (ge) ((Object) stackIn_140_0);
                                stackIn_141_1 = stackIn_140_1;
                                stackIn_141_2 = 1;
                                break L24;
                              }
                            }
                            ((ge) (Object) stackIn_141_0).a(stackIn_141_1, stackIn_141_2 != 0);
                            return true;
                          } else {
                            return false;
                          }
                        } else {
                          break L23;
                        }
                      }
                    }
                    L25: {
                      if (-1 != (var13 ^ -1)) {
                        break L25;
                      } else {
                        if (var14 == 0) {
                          var22 = this.a((byte) -121, var7);
                          if (var22 == null) {
                            return false;
                          } else {
                            var22.c((byte) -68, param5);
                            return true;
                          }
                        } else {
                          break L25;
                        }
                      }
                    }
                    L26: {
                      if (18 != var13) {
                        break L26;
                      } else {
                        if (var14 == 0) {
                          var23 = this.b((byte) 40, var7);
                          if (var23 == null) {
                            return false;
                          } else {
                            var23.e(false);
                            return true;
                          }
                        } else {
                          break L26;
                        }
                      }
                    }
                    L27: {
                      if (15 != var13) {
                        break L27;
                      } else {
                        if (var14 == 0) {
                          L28: {
                            stackIn_152_0 = this;

                            if ((param0 ^ -1) != -33) {
                              stackIn_153_0 = this;
                              stackIn_153_1 = 0;
                              break L28;
                            } else {
                              stackIn_153_0 = this;
                              stackIn_153_1 = 1;
                              break L28;
                            }
                          }
                          this.a(stackIn_153_1 != 0, (byte) -108, param5, param2, param4);
                          return true;
                        } else {
                          break L27;
                        }
                      }
                    }
                    if (8 == var13) {
                      var9 = this.a((byte) -125, var7);
                      if (var9 != null) {
                        L29: {
                          L30: {
                            var11 = this.field_m.a((byte) 32, param5, 400);
                            if (var9 instanceof ge) {
                              break L30;
                            } else {
                              if (!(var9 instanceof lm)) {
                                break L29;
                              } else {
                                L31: {
                                  if ((param0 ^ -1) == -35) {
                                    break L31;
                                  } else {
                                    ((lm) ((Object) var9)).a(var11 * 3 / 4, true);
                                    if (var14 == 0) {
                                      break L29;
                                    } else {
                                      break L31;
                                    }
                                  }
                                }
                                ((lm) ((Object) var9)).c(false);
                                if (var14 == 0) {
                                  break L29;
                                } else {
                                  break L30;
                                }
                              }
                            }
                          }
                          L32: {
                            if (34 != param0) {
                              break L32;
                            } else {
                              ((ge) ((Object) var9)).m((byte) 124);
                              if (var14 == 0) {
                                break L29;
                              } else {
                                break L32;
                              }
                            }
                          }
                          ((ge) ((Object) var9)).d(var11, -96);
                          break L29;
                        }
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      L33: {
                        if (17 != var13) {
                          break L33;
                        } else {
                          if (var14 == 0) {
                            L34: {
                              L35: {
                                if (param4 == 65535) {
                                  break L35;
                                } else {
                                  if (-1 == param4) {
                                    break L35;
                                  } else {
                                    this.b(2, param5, param4, param2);
                                    if (var14 == 0) {
                                      break L34;
                                    } else {
                                      break L35;
                                    }
                                  }
                                }
                              }
                              this.b(4, var7);
                              break L34;
                            }
                            return true;
                          } else {
                            break L33;
                          }
                        }
                      }
                      L36: {
                        if ((var13 ^ -1) != -12) {
                          break L36;
                        } else {
                          if (var14 == 0) {
                            this.field_m.field_a[param5] = this.field_m.a((byte) 32, param5, 500);
                            return true;
                          } else {
                            break L36;
                          }
                        }
                      }
                      if (-13 == (var13 ^ -1)) {
                        this.field_m.field_z[param5] = this.field_m.a((byte) 32, param5, 750);
                        return true;
                      } else {
                        L37: {
                          if (param3 <= -44) {
                            break L37;
                          } else {
                            this.b(19, 25, -67, 7);
                            break L37;
                          }
                        }
                        return false;
                      }
                    }
                  }
                }
              }
            }
            var11 = this.field_m.a((byte) 32, param5, 1000);
            this.b(param1, param2, var11, 11564, param4);
            return true;
          }
        }
    }

    private final ge b(byte param0, int param1) {
        if (param0 < 19) {
            this.b(101, -68, 16, -57, 121);
        }
        ek var3 = this.c(param1, -40);
        if (!(var3 != null)) {
            if (this.a(param1, true) == null) {
                return null;
            }
            return null;
        }
        if (!(var3 instanceof ge)) {
            return null;
        }
        return (ge) ((Object) var3);
    }

    private final void d(int param0) {
        boolean stackIn_6_0 = false;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_28_0 = 0;
        br stackIn_38_0 = null;
        br stackIn_54_0 = null;
        nk stackIn_57_0 = null;
        Object stackIn_59_0 = null;
        bf stackIn_62_0 = null;
        Object stackIn_64_0 = null;
        boolean stackIn_73_0 = false;
        int stackIn_78_0 = 0;
        boolean stackIn_88_0 = false;
        boolean stackIn_94_0 = false;
        boolean stackIn_126_0 = false;
        int stackIn_135_0 = 0;
        int stackIn_138_0 = 0;
        int stackIn_139_0 = 0;
        int stackIn_139_1 = 0;
        boolean stackOut_5_0;
        nk stackOut_56_0;
        bf stackOut_61_0;
        boolean stackOut_72_0;
        int statePc = 0;
        br var2_ref_br = null;
        int var2 = 0;
        nk var2_ref_nk = null;
        bf var2_ref_bf = null;
        br var3 = null;
        Object var3_ref = null;
        ce var3_ref2 = null;
        ce var4 = null;
        br var4_ref = null;
        ge var5 = null;
        int var6 = 0;
        pa var7 = null;
        qj var8 = null;
        ce var9 = null;
        sa var10 = null;
        pa var11 = null;
        qj var12 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = ZombieDawnMulti.field_E ? 1 : 0;
                    if (-4 == (this.field_m.field_l ^ -1)) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return;
                }
                case 3: {
                    this.field_m.field_H = this.field_m.field_H + 1;
                    this.field_l = false;
                    var2_ref_br = this.field_u.c(86);
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (!(var2_ref_br instanceof ek)) {
                        statePc = 10;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    stackOut_5_0 = var2_ref_br instanceof ge;
                    stackIn_11_0 = stackOut_5_0 ? 1 : 0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var6 != 0) {
                        statePc = 11;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (!stackIn_6_0) {
                        statePc = 9;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (!((ge) ((Object) var2_ref_br)).p((byte) 53)) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    this.field_l = true;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var2_ref_br = this.field_u.b(param0 ^ -32726);
                    if (var6 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_11_0 = 0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    var2 = stackIn_11_0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if ((this.field_m.field_a.length ^ -1) >= (var2 ^ -1)) {
                        statePc = 19;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_139_0 = -1;
                    stackIn_14_0 = stackIn_139_0;
                    stackIn_139_1 = this.field_m.field_a[var2] ^ -1;
                    stackIn_14_1 = stackIn_139_1;
                    if (var6 != 0) {
                        statePc = 139;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (stackIn_14_0 <= stackIn_14_1) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    this.field_m.field_a[var2] = this.field_m.field_a[var2] - 1;
                    if (var6 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    this.field_m.field_a[var2] = 0;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    var2++;
                    if (var6 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var2 = 0;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if ((var2 ^ -1) <= (this.field_m.field_z.length ^ -1)) {
                        statePc = 27;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    stackIn_28_0 = this.field_m.field_z[var2];
                    stackIn_22_0 = stackIn_28_0;
                    if (var6 != 0) {
                        statePc = 28;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (stackIn_22_0 <= 0) {
                        statePc = 25;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    this.field_m.field_z[var2] = this.field_m.field_z[var2] - 1;
                    if (var6 == 0) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    this.field_m.field_z[var2] = 0;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    var2++;
                    if (var6 == 0) {
                        statePc = 20;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    stackIn_28_0 = 0;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    if (stackIn_28_0 != this.field_m.field_l) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    return;
                }
                case 30: {
                    var2 = 0;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if (var2 >= this.field_m.field_m.length) {
                        statePc = 35;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    this.field_m.field_m[var2] = 0;
                    var2++;
                    if (var6 != 0) {
                        statePc = 68;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (var6 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var2_ref_br = this.field_u.c(75);
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    if (!(var2_ref_br instanceof ek)) {
                        statePc = 53;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var3 = var2_ref_br.field_d;
                    ((ek) ((Object) var2_ref_br)).h(param0 ^ -32763);
                    stackIn_54_0 = (br) (var2_ref_br);
                    stackIn_38_0 = stackIn_54_0;
                    if (var6 != 0) {
                        statePc = 54;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (!(stackIn_38_0 instanceof pa)) {
                        statePc = 52;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var7 = (pa) ((Object) var2_ref_br);
                    var11 = var7;
                    if (!(var11 instanceof ge)) {
                        statePc = 45;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (var11.field_Z) {
                        statePc = 45;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (9 == var11.field_Q) {
                        statePc = 45;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if ((var11.field_Q ^ -1) != -22) {
                        statePc = 44;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 44: {
                    this.field_m.field_m[((ge) ((Object) var7)).field_gb] = this.field_m.field_m[((ge) ((Object) var7)).field_gb] + 1;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if (var11.field_S) {
                        statePc = 47;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (var11 instanceof ge) {
                        statePc = 49;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 49: {
                    var5 = (ge) ((Object) var11);
                    if (!var5.field_eb) {
                        statePc = 51;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    this.a(-2, var5);
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    this.a(-2, var11);
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    var2_ref_br = var3;
                    if (var6 == 0) {
                        statePc = 36;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    stackIn_54_0 = this.field_n.c(127);
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    var2_ref_nk = (nk) ((Object) stackIn_54_0);
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    if (var2_ref_nk == null) {
                        statePc = 58;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    var2_ref_nk.a(param0 + 32843);
                    stackOut_56_0 = (nk) ((Object) this.field_n.b(param0 ^ -32726));
                    stackIn_59_0 = stackOut_56_0;
                    stackIn_57_0 = stackOut_56_0;
                    if (var6 != 0) {
                        statePc = 59;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    var2_ref_nk = stackIn_57_0;
                    if (var6 == 0) {
                        statePc = 55;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    stackIn_59_0 = this.field_m.field_A.c(param0 + 32810);
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    var2_ref_bf = (bf) ((Object) stackIn_59_0);
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    if (var2_ref_bf == null) {
                        statePc = 63;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    var2_ref_bf.c(0);
                    stackOut_61_0 = (bf) ((Object) this.field_m.field_A.b(6));
                    stackIn_64_0 = stackOut_61_0;
                    stackIn_62_0 = stackOut_61_0;
                    if (var6 != 0) {
                        statePc = 64;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    var2_ref_bf = stackIn_62_0;
                    if (var6 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    stackIn_64_0 = this.field_m.field_G.c(46);
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    var10 = (sa) ((Object) stackIn_64_0);
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    if (var10 == null) {
                        statePc = 67;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    var10.c(-21);
                    var10 = (sa) ((Object) this.field_m.field_G.b(6));
                    if (var6 == 0) {
                        statePc = 65;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    var2 = 0;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    var3_ref = null;
                    if (param0 == -32724) {
                        statePc = 70;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    field_v = (byte[]) null;
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    var4 = (ce) ((Object) this.field_m.field_s.c(param0 ^ -32670));
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    if (var4 == null) {
                        statePc = 77;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    var3_ref2 = (ce) ((Object) this.field_m.field_s.b(6));
                    stackOut_72_0 = var4.d(-20232);
                    stackIn_78_0 = stackOut_72_0 ? 1 : 0;
                    stackIn_73_0 = stackOut_72_0;
                    if (var6 != 0) {
                        statePc = 78;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    if (stackIn_73_0) {
                        statePc = 75;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 75: {
                    var2 = 1;
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    var4 = var3_ref2;
                    if (var6 == 0) {
                        statePc = 71;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    stackIn_78_0 = var2;
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    if (stackIn_78_0 == 0) {
                        statePc = 128;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    var9 = (ce) ((Object) this.field_m.field_s.c(45));
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    if (var9 == null) {
                        statePc = 84;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    var9.a((byte) -60);
                    var9 = (ce) ((Object) this.field_m.field_s.b(param0 ^ -32726));
                    if (var6 != 0) {
                        statePc = 85;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    if (var6 == 0) {
                        statePc = 80;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    this.field_b.a(48);
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    var4_ref = this.field_u.c(99);
                    statePc = 86;
                    continue stateLoop;
                }
                case 86: {
                    if (!(var4_ref instanceof ek)) {
                        statePc = 128;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    stackIn_94_0 = var4_ref instanceof ge;
                    stackIn_88_0 = stackIn_94_0;
                    if (var6 != 0) {
                        statePc = 94;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    if (stackIn_88_0) {
                        statePc = 90;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 90: {
                    ((ge) ((Object) var4_ref)).j((byte) 82);
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    var4_ref = this.field_u.b(6);
                    if (var6 == 0) {
                        statePc = 86;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 93: {
                    stackIn_94_0 = this.field_e.f(28113);
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    if (stackIn_94_0) {
                        statePc = 107;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    var8 = (qj) ((Object) this.field_e.g(50));
                    var12 = var8;
                    if (var6 != 0) {
                        statePc = 107;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    if (var12.field_g > this.field_m.field_H) {
                        statePc = 104;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    if (!this.b(var12.field_h, var12.field_q, var12.field_f, -84, var12.field_k, var12.field_n)) {
                        statePc = 103;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    if ((this.field_j[var8.field_n] ^ -1) != -256) {
                        statePc = 101;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    this.field_j[var8.field_n] = var8.field_q;
                    if (var6 == 0) {
                        statePc = 103;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    if ((this.field_j[var8.field_n] ^ -1) == (var12.field_q ^ -1)) {
                        statePc = 103;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    this.field_j[var8.field_n] = -2;
                    statePc = 103;
                    continue stateLoop;
                }
                case 103: {
                    if (var6 == 0) {
                        statePc = 105;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    this.field_e.a(-25612, var12);
                    statePc = 107;
                    continue stateLoop;
                }
                case 105: {
                    if (var6 == 0) {
                        statePc = 93;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    return;
                }
                case 109: {
                    this.field_j[var8.field_n] = var8.field_q;
                    if (var6 == 0) {
                        statePc = 118;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 111: {
                    this.field_j[var8.field_n] = -2;
                    statePc = 118;
                    continue stateLoop;
                }
                case 112: {
                    if ((this.field_j[var8.field_n] ^ -1) == (var12.field_q ^ -1)) {
                        statePc = 118;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 114: {
                    if ((this.field_j[var8.field_n] ^ -1) != -256) {
                        statePc = 112;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 116: {
                    if (var6 == 0) {
                        statePc = 128;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 118: {
                    if (var6 == 0) {
                        statePc = 116;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 120: {
                    if (!this.b(var12.field_h, var12.field_q, var12.field_f, -84, var12.field_k, var12.field_n)) {
                        statePc = 118;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 122: {
                    if (var12.field_g > this.field_m.field_H) {
                        statePc = 104;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 124: {
                    var8 = (qj) ((Object) this.field_e.g(50));
                    var12 = var8;
                    if (var6 != 0) {
                        statePc = 107;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 126: {
                    if (stackIn_126_0) {
                        statePc = 107;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 128: {
                    stackIn_126_0 = this.field_e.f(28113);
                    statePc = 126;
                    continue stateLoop;
                }
                case 130: {
                    this.field_m.field_z[var2] = this.field_m.field_z[var2] - 1;
                    if (var6 == 0) {
                        statePc = 132;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 132: {
                    var2++;
                    if (var6 == 0) {
                        statePc = 141;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 134: {
                    this.field_m.field_z[var2] = 0;
                    statePc = 132;
                    continue stateLoop;
                }
                case 135: {
                    if (stackIn_135_0 <= 0) {
                        statePc = 134;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 137: {
                    stackIn_28_0 = this.field_m.field_z[var2];
                    stackIn_138_0 = stackIn_28_0;
                    if (var6 != 0) {
                        statePc = 28;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    stackIn_135_0 = stackIn_138_0;
                    statePc = 135;
                    continue stateLoop;
                }
                case 139: {
                    if (stackIn_139_0 <= stackIn_139_1) {
                        statePc = 27;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 141: {
                    stackIn_139_0 = var2 ^ -1;
                    stackIn_139_1 = this.field_m.field_z.length ^ -1;
                    statePc = 139;
                    continue stateLoop;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(int param0, int param1, int param2, int param3, int param4) {
        ce var6 = null;
        ek var7 = null;
        int var9 = 0;
        ge var10 = null;
        lm var11 = null;
        ce stackIn_3_0 = null;
        ce stackIn_3_1 = null;
        fh stackIn_3_2 = null;
        int stackIn_3_3 = 0;
        int stackIn_3_4 = 0;
        int stackIn_3_5 = 0;
        ce stackIn_4_0 = null;
        ce stackIn_4_1 = null;
        fh stackIn_4_2 = null;
        int stackIn_4_3 = 0;
        int stackIn_4_4 = 0;
        int stackIn_4_5 = 0;
        ce stackIn_5_0 = null;
        ce stackIn_5_1 = null;
        fh stackIn_5_2 = null;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        int stackIn_5_5 = 0;
        int stackIn_5_6 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = ZombieDawnMulti.field_E ? 1 : 0;
                    if (param3 == 11564) {
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
                    stackIn_4_0 = null;
                    stackIn_3_0 = stackIn_4_0;
                    stackIn_4_1 = null;
                    stackIn_3_1 = stackIn_4_1;
                    stackIn_4_2 = this.field_b;
                    stackIn_3_2 = stackIn_4_2;
                    stackIn_4_3 = param1;
                    stackIn_3_3 = stackIn_4_3;
                    stackIn_4_4 = param4;
                    stackIn_3_4 = stackIn_4_4;
                    stackIn_4_5 = param2;
                    stackIn_3_5 = stackIn_4_5;
                    if (9 != param0) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    stackIn_5_0 = null;
                    stackIn_5_1 = null;
                    stackIn_5_2 = (fh) ((Object) stackIn_3_2);
                    stackIn_5_3 = stackIn_3_3;
                    stackIn_5_4 = stackIn_3_4;
                    stackIn_5_5 = stackIn_3_5;
                    stackIn_5_6 = 1;
                    statePc = 5;
                    continue stateLoop;
                }
                case 4: {
                    stackIn_5_0 = null;
                    stackIn_5_1 = null;
                    stackIn_5_2 = (fh) ((Object) stackIn_4_2);
                    stackIn_5_3 = stackIn_4_3;
                    stackIn_5_4 = stackIn_4_4;
                    stackIn_5_5 = stackIn_4_5;
                    stackIn_5_6 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    var6 = new ce(stackIn_5_2, stackIn_5_3, stackIn_5_4, stackIn_5_5, stackIn_5_6);
                    this.field_m.field_s.a(var6, false);
                    if (param0 == 9) {
                        statePc = 7;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var7 = (ek) ((Object) this.field_u.c(60));
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (var7 == null) {
                        statePc = 22;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (var9 != 0) {
                        statePc = 22;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (!(var7 instanceof ge)) {
                        statePc = 15;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var10 = (ge) ((Object) var7);
                    if (var6.a(var10.e((byte) -112), var10.g(1829947600), -1)) {
                        statePc = 13;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var10.d(200, -124);
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (var9 == 0) {
                        statePc = 20;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (var7 instanceof lm) {
                        statePc = 17;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var11 = (lm) ((Object) var7);
                    if (var6.a(var11.e((byte) -112), var11.g(1829947600), -1)) {
                        statePc = 19;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var11.a(200, true);
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    var7 = (ek) ((Object) this.field_u.b(6));
                    if (var9 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(pa param0, byte param1) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        sh var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        ge var6 = null;
        int var7 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (!param0.field_Z) {
              if (param1 == 105) {
                var3 = (sh) ((Object) this.field_f.c(64));
                L1: while (true) {
                  L2: {
                    L3: {
                      if (var3 == null) {
                        break L3;
                      } else {
                        var4 = var3.field_C - param0.field_C;
                        stackIn_29_0 = -1;

                        if (var7 != 0) {
                          break L2;
                        } else {
                          L4: {
                            if (stackIn_29_0 > var4) {
                              break L4;
                            } else {
                              if (1 < var4) {
                                break L4;
                              } else {
                                var4 = -param0.field_B + var3.field_B;
                                if (0 < (var4 ^ -1)) {
                                  break L4;
                                } else {
                                  if (1 < var4) {
                                    break L4;
                                  } else {
                                    if (var3.a(param0, param1 + -84)) {
                                      L5: {
                                        L6: {
                                          this.a(-7737, ak.a(var3.field_O, (byte) -111, this.field_m.field_H, param0.field_x));
                                          if (param0 instanceof lm) {
                                            break L6;
                                          } else {
                                            L7: {
                                              var6 = (ge) ((Object) param0);
                                              var5 = 4;
                                              var6.t(4);
                                              this.field_i[var3.field_O] = this.field_i[var3.field_O] + 1;
                                              this.field_m.field_J[var3.field_O] = this.field_m.field_J[var3.field_O] + 1;
                                              if (this.field_m.b((byte) -122, 53, var3.field_O)) {
                                                var5 = var5 + var5 / 2;
                                                break L7;
                                              } else {
                                                break L7;
                                              }
                                            }
                                            if (var7 == 0) {
                                              break L5;
                                            } else {
                                              break L6;
                                            }
                                          }
                                        }
                                        L8: {
                                          this.field_m.c(-118);
                                          var5 = 10;
                                          this.field_g[var3.field_O] = this.field_g[var3.field_O] + 1;
                                          if (!((lm) ((Object) param0)).field_hb) {
                                            break L8;
                                          } else {
                                            this.field_k[var3.field_O] = cr.b(this.field_k[var3.field_O], 4);
                                            break L8;
                                          }
                                        }
                                        this.field_m.field_J[var3.field_O] = this.field_m.field_J[var3.field_O] + 3;
                                        if (!this.field_m.b((byte) -99, 60, var3.field_O)) {
                                          break L5;
                                        } else {
                                          var5 = var5 + var5 / 2;
                                          break L5;
                                        }
                                      }
                                      this.field_m.field_d[var3.field_O] = this.field_m.field_d[var3.field_O] + var5;
                                      this.field_m.a(param1 + -233, param0);
                                      stackIn_26_0 = 1;
                                      decompiledRegionSelector0 = 3;
                                      break L0;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var3 = (sh) ((Object) this.field_f.b(6));
                          if (var7 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    stackIn_29_0 = 0;
                    break L2;
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3_ref = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var3_ref);

            stackIn_32_1 = new StringBuilder().append("rl.AA(");

            if (param0 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L9;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L9;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_29_0 != 0;
            } else {
              return stackIn_26_0 != 0;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        this.field_m.field_A.a(new bf(this.field_b, param2, param0, param3), false);
        if (param1 != -22930) {
            this.a(-17, false, -101, (byte) 121);
        }
    }

    final void a(lm param0, ge param1, int param2, int param3, byte param4) {
        if (!(!param1.field_Z)) {
            return;
        }
        try {
            this.a(-7737, fn.a(param3, param0.field_x, param1.field_x, (byte) 116, this.field_m.field_H, param2));
            param1.field_S = false;
            if (param4 != -63) {
                this.field_b = (fh) null;
            }
            param1.field_eb = false;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "rl.H(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(lm param0, ge param1, ge param2, boolean param3) {
        sj var5 = null;
        try {
            var5 = new sj(this.field_m.field_H, param2 != null ? param2.field_x : -1, param0.field_x, param1.field_x, param0.field_G, param0.field_E, param1.field_gb);
            if (param3) {
                this.field_d = (hk[]) null;
            }
            this.a(-7737, var5);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "rl.JA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final void a(boolean param0, byte param1, int param2, int param3, int param4) {
        boolean stackIn_5_0 = false;
        int stackIn_23_0 = 0;
        boolean stackOut_4_0;
        int statePc = 0;
        int[] var7 = null;
        int var8 = 0;
        br var9_ref_br = null;
        int var9 = 0;
        pa var10 = null;
        int var11 = 0;
        int var12 = 0;
        ge var13 = null;
        int var14 = 0;
        pa[] var15 = null;
        Object var16 = null;
        pa var16_ref = null;
        int[] var17 = null;
        pa var18 = null;
        pa[] var19 = null;
        int[] var20 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = null;
                    var14 = ZombieDawnMulti.field_E ? 1 : 0;
                    g.field_a.setSeed((long)((param4 << -161772635) + param3 + param2));
                    var15 = new pa[this.field_u.a(0)];
                    var19 = var15;
                    var20 = new int[this.field_u.a(0)];
                    var17 = var20;
                    var7 = var17;
                    d.a(var7, 0, var20.length, 32767);
                    if (param1 <= -36) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_r = (of[]) null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var8 = 0;
                    var9_ref_br = this.field_u.c(111);
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (!(var9_ref_br instanceof ek)) {
                        statePc = 22;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    stackOut_4_0 = var9_ref_br instanceof pa;
                    stackIn_23_0 = stackOut_4_0 ? 1 : 0;
                    stackIn_5_0 = stackOut_4_0;
                    if (var14 != 0) {
                        statePc = 23;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (stackIn_5_0) {
                        statePc = 8;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (var14 == 0) {
                        statePc = 21;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var16_ref = (pa) ((Object) var9_ref_br);
                    var18 = var16_ref;
                    var11 = var18.e((byte) -112) + -param3;
                    var12 = -param4 + var18.g(1829947600);
                    if (-14401 <= (var11 * var11 - -(var12 * var12) ^ -1)) {
                        statePc = 11;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (var14 == 0) {
                        statePc = 21;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (!param0) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (var18 instanceof ge) {
                        statePc = 17;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (!(var18 instanceof lm)) {
                        statePc = 21;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var15[var8] = var16_ref;
                    var7[var8] = var16_ref.field_x;
                    var8++;
                    if (var14 == 0) {
                        statePc = 21;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var13 = (ge) ((Object) var18);
                    if (var13.field_gb != param2) {
                        statePc = 20;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (var14 == 0) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var15[var8] = (pa) ((Object) var13);
                    var7[var8] = var13.field_x;
                    var8++;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    var9_ref_br = this.field_u.b(6);
                    if (var14 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    vh.a(-7255, var20, var19);
                    stackIn_23_0 = 0;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    var9 = stackIn_23_0;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (var8 <= var9) {
                        statePc = 33;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var10 = var15[var9];
                    if (var14 != 0) {
                        statePc = 33;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (!(var10 instanceof ge)) {
                        statePc = 30;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (this.field_m.b(0, ((ge) ((Object) var10)).field_gb)) {
                        statePc = 29;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 29: {
                    this.a((byte) 100, (ge) ((Object) var10));
                    if (var14 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var15[var9].b(param2, -50);
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    var9++;
                    if (var14 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        bf stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        boolean stackIn_10_0 = false;
        boolean stackIn_17_0 = false;
        boolean stackIn_24_0 = false;
        int stackIn_31_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_56_0 = 0;
        bf stackOut_2_0;
        boolean stackOut_9_0;
        boolean stackOut_16_0;
        boolean stackOut_23_0;
        Object var5;
        br var5_ref;
        bf var6_ref_bf;
        br var6_ref_br;
        int var6;
        og var7_ref_og;
        int var7;
        int var8;
        int var9;
        ge var10;
        sa var11;
        ce var12;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        var5 = null;
        var6_ref_bf = (bf) ((Object) this.field_m.field_A.c(64));
        L0: while (true) {
          L1: {
            L2: {
              if (var6_ref_bf == null) {
                break L2;
              } else {
                stackOut_2_0 = (bf) (var6_ref_bf);
                stackIn_7_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var9 != 0) {
                  break L1;
                } else {
                  if (!((bf) (Object) stackIn_3_0).a(param3, param2, (byte) 29)) {
                    var6_ref_bf = (bf) ((Object) this.field_m.field_A.b(6));
                    if (var9 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  } else {
                    var6_ref_bf.a(-98);
                    return;
                  }
                }
              }
            }
            stackIn_7_0 = this.field_m.field_G.c(109);
            break L1;
          }
          var11 = (sa) ((Object) stackIn_7_0);
          L3: while (true) {
            L4: {
              L5: {
                if (var11 == null) {
                  break L5;
                } else {
                  var5_ref = this.field_m.field_G.b(6);
                  stackOut_9_0 = var11.a(param3, param0 + 17308, param2);
                  stackIn_31_0 = stackOut_9_0 ? 1 : 0;
                  stackIn_10_0 = stackOut_9_0;
                  if (var9 != 0) {
                    break L4;
                  } else {
                    if (stackIn_10_0) {
                      var11.d(-110);
                      var11.a(true);
                      return;
                    } else {
                      var11 = (sa) ((Object) var5_ref);
                      if (var9 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
              }
              var12 = (ce) ((Object) this.field_m.field_s.c(98));
              L6: while (true) {
                L7: {
                  if (var12 == null) {
                    break L7;
                  } else {
                    var5_ref = this.field_m.field_s.b(6);
                    stackOut_16_0 = var12.a(param3, param2, -1);
                    stackIn_31_0 = stackOut_16_0 ? 1 : 0;
                    stackIn_17_0 = stackOut_16_0;
                    if (var9 != 0) {
                      break L4;
                    } else {
                      L8: {
                        if (!stackIn_17_0) {
                          break L8;
                        } else {
                          var12.c(param0 + -28190);
                          if (var9 == 0) {
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                      var12 = (ce) ((Object) var5_ref);
                      if (var9 == 0) {
                        continue L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                var6_ref_br = this.field_m.field_K.c(85);
                L9: while (true) {
                  L10: {
                    if (var6_ref_br == null) {
                      break L10;
                    } else {
                      stackOut_23_0 = var6_ref_br instanceof og;
                      stackIn_31_0 = stackOut_23_0 ? 1 : 0;
                      stackIn_24_0 = stackOut_23_0;
                      if (var9 != 0) {
                        break L4;
                      } else {
                        L11: {
                          if (stackIn_24_0) {
                            var7_ref_og = (og) ((Object) var6_ref_br);
                            if (var7_ref_og.b(param2, param3, param0 + -120)) {
                              var7_ref_og.field_R = 1;
                              break L11;
                            } else {
                              break L11;
                            }
                          } else {
                            break L11;
                          }
                        }
                        var6_ref_br = this.field_m.field_K.b(param0 + 4);
                        if (var9 == 0) {
                          continue L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  stackIn_31_0 = 0;
                  break L4;
                }
              }
            }
            var6 = stackIn_31_0;
            var7 = 0;
            L12: while (true) {
              L13: {
                L14: {
                  if ((var7 ^ -1) <= (this.field_m.field_a.length ^ -1)) {
                    break L14;
                  } else {
                    stackIn_41_0 = var6;

                    if (var9 != 0) {
                      break L13;
                    } else {
                      L15: {
                        L16: {
                          if (stackIn_41_0 != 0) {
                            break L16;
                          } else {
                            if (-1 <= (this.field_m.field_a[var7] ^ -1)) {
                              stackIn_39_0 = 0;
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        stackIn_39_0 = 1;
                        break L15;
                      }
                      var6 = stackIn_39_0;
                      this.field_m.field_a[var7] = 0;
                      var7++;
                      if (var9 == 0) {
                        continue L12;
                      } else {
                        break L14;
                      }
                    }
                  }
                }
                stackIn_41_0 = var6;
                break L13;
              }
              if (stackIn_41_0 != 0) {
                return;
              } else {
                L17: {
                  var7 = 0;
                  if (param0 == 2) {
                    break L17;
                  } else {
                    var10 = (ge) null;
                    this.a((lm) null, (ge) null, -111, -126, (byte) -27);
                    break L17;
                  }
                }
                var8 = 0;
                L18: while (true) {
                  L19: {
                    L20: {
                      if (this.field_m.field_z.length <= var8) {
                        break L20;
                      } else {
                        stackIn_56_0 = var7;

                        if (var9 != 0) {
                          break L19;
                        } else {
                          L21: {
                            L22: {
                              if (stackIn_56_0 != 0) {
                                break L22;
                              } else {
                                if (0 >= this.field_m.field_z[var8]) {
                                  stackIn_54_0 = 0;
                                  break L21;
                                } else {
                                  break L22;
                                }
                              }
                            }
                            stackIn_54_0 = 1;
                            break L21;
                          }
                          var7 = stackIn_54_0;
                          this.field_m.field_z[var8] = 0;
                          var8++;
                          if (var9 == 0) {
                            continue L18;
                          } else {
                            break L20;
                          }
                        }
                      }
                    }
                    stackIn_56_0 = var7;
                    break L19;
                  }
                  if (stackIn_56_0 == 0) {
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        }
    }

    final void a(int param0, ge param1, ge param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2.field_Z) {
                break L1;
              } else {
                if (param1.field_Z) {
                  break L1;
                } else {
                  this.a(-7737, td.a(param2.g(1829947600), this.field_m.field_H, param2.e((byte) -112), (byte) 41, param1.g(1829947600), param1.field_x, param1.e((byte) -112), param2.field_x));
                  var4_int = -87 % ((param0 - -35) / 36);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("rl.R(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int statePc = 0;
        int var8 = 0;
        br var8_ref_br = null;
        lm var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        hk var13 = null;
        hk var14 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = ZombieDawnMulti.field_E ? 1 : 0;
                    if (this.field_t) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.a((byte) 52, "cheat disabled!", "player [" + param2 + "] attempted to cheat: " + param1 + ", " + param5 + ", " + param3 + ", " + param0);
                    return;
                }
                case 2: {
                    System.out.println("player [" + param2 + "] cheating: " + param1 + ", " + param5 + ", " + param3 + ", " + param0);
                    if (param4 == 3) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    this.a(102, false, -116, (byte) 100);
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    var8 = param1;
                    if ((var8 ^ -1) == -1) {
                        statePc = 11;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (var8 == 1) {
                        statePc = 26;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (var8 != 3) {
                        statePc = 9;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (var12 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (2 == var8) {
                        statePc = 29;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var8_ref_br = this.field_u.c(85);
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (var8_ref_br == null) {
                        statePc = 34;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (var12 != 0) {
                        statePc = 34;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (var8_ref_br instanceof lm) {
                        statePc = 16;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var9 = (lm) ((Object) var8_ref_br);
                    if (!var9.field_Z) {
                        statePc = 19;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (var12 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var10 = -param5 + var9.e((byte) -112);
                    var11 = -param3 + var9.g(1829947600);
                    if ((var10 * var10 + var11 * var11 ^ -1) <= -4001) {
                        statePc = 22;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (var12 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var9.field_G = param5 << 68571088;
                    var9.field_E = param3 << -956133712;
                    var9.field_S = true;
                    System.out.println("moving human oid " + var9.field_x);
                    if (var12 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var8_ref_br = this.field_u.b(6);
                    if (var12 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 26: {
                    this.field_m.field_d[param0] = 100;
                    this.field_m.field_d[(param0 - -1) % this.field_m.field_t] = 25;
                    this.field_m.field_H = 6000;
                    this.a(false, 2);
                    this.field_m.field_C = this.field_m.field_H - -1;
                    if (var12 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    this.a(false, param5);
                    if (var12 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var13 = this.field_d[param2];
                    var14 = var13;
                    var8 = 0;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if ((var14.field_b.length ^ -1) >= (var8 ^ -1)) {
                        statePc = 34;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var13.field_b[var8] = 0;
                    var8++;
                    if (var12 != 0) {
                        statePc = 34;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (var12 == 0) {
                        statePc = 30;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, boolean param4) {
        ge var7;
        ge stackIn_13_0 = null;
        ge stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        var7 = this.b((byte) 117, param3);
        if (var7 == null) {
          return false;
        } else {
          if (param0 == var7.field_gb) {
            if (21 == var7.field_Q) {
              return true;
            } else {
              if (!param4) {
                L0: {
                  L1: {
                    if (var7.field_lb) {
                      break L1;
                    } else {
                      L2: {
                        stackIn_13_0 = (ge) (var7);

                        if (param4) {
                          stackIn_14_0 = (ge) ((Object) stackIn_13_0);
                          stackIn_14_1 = 0;
                          break L2;
                        } else {
                          stackIn_14_0 = (ge) ((Object) stackIn_13_0);
                          stackIn_14_1 = 1;
                          break L2;
                        }
                      }
                      ((ge) (Object) stackIn_14_0).a(stackIn_14_1 != 0, this.field_b.b(var7.e((byte) -112), param2, var7.g(1829947600), param1, 8760));
                      if (!ZombieDawnMulti.field_E) {
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  var7.field_G = param1 << 1544547728;
                  var7.field_E = param2 << -477061392;
                  var7.a(33, (byte) -89);
                  var7.field_ab = param2;
                  var7.field_N = param1;
                  break L0;
                }
                this.a(-2, (pa) (var7));
                return true;
              } else {
                return true;
              }
            }
          } else {
            return true;
          }
        }
    }

    rl(kb param0, hk[] param1, boolean param2, boolean param3) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        ek var7 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = ZombieDawnMulti.field_E ? 1 : 0;
                    this.field_i = new int[4];
                    this.field_o = false;
                    this.field_j = new int[4];
                    this.field_p = new int[4];
                    this.field_k = new int[4];
                    this.field_g = new int[4];
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_d = param1;
                        stackIn_3_0 = this;
                        stackIn_2_0 = stackIn_3_0;
                        if (!param2) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
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
                        statePc = 15;
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
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ((rl) (this)).field_t = stackIn_4_1 != 0;
                        this.field_m = param0;
                        this.field_q = new th();
                        this.field_u = this.field_m.a((byte) 125);
                        this.a(param3, (byte) -6, this.field_m.field_h);
                        var7 = (ek) ((Object) this.field_u.c(126));
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var7 == null) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var7.a(-9019, (rl) (this));
                        var7 = (ek) ((Object) this.field_u.b(6));
                        if (var6 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var6 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.field_m.field_l = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var5_int = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((var5_int ^ -1) <= (this.field_j.length ^ -1)) {
                            statePc = 22;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        this.field_j[var5_int] = 255;
                        var5_int++;
                        if (var6 != 0) {
                            statePc = 23;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var6 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_17_0 = (RuntimeException) (var5);
                    stackIn_16_0 = stackIn_17_0;
                    stackIn_17_1 = new StringBuilder().append("rl.<init>(");
                    stackIn_16_1 = stackIn_17_1;
                    if (param0 == null) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_16_1);
                    stackIn_18_2 = "{...}";
                    statePc = 18;
                    continue stateLoop;
                }
                case 17: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_18_2 = "null";
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_20_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_19_0 = stackIn_20_0;
                    stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
                    stackIn_19_1 = stackIn_20_1;
                    if (param1 == null) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_19_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_19_1);
                    stackIn_21_2 = "{...}";
                    statePc = 21;
                    continue stateLoop;
                }
                case 20: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                    stackIn_21_2 = "null";
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    throw fa.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ',' + param3 + ')');
                }
                case 22: {
                    return;
                }
                case 23: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_c = "Real-life threats";
    }
}
