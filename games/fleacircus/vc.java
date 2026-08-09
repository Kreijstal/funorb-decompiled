/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc {
    lh field_e;
    static int field_d;
    static boolean field_b;
    static int field_f;
    private lh field_c;
    static int field_a;
    static String field_g;

    final lh c(byte param0) {
        lh var2;
        var2 = this.field_e.field_h;
        if (var2 == this.field_e) {
          this.field_c = null;
          return null;
        } else {
          this.field_c = var2.field_h;
          if (param0 != 47) {
            field_b = true;
            return var2;
          } else {
            return var2;
          }
        }
    }

    final lh a(byte param0) {
        int var2;
        lh var3;
        var2 = 3 / ((28 - param0) / 36);
        var3 = this.field_e.field_a;
        if (this.field_e == var3) {
          return null;
        } else {
          var3.c(-1);
          return var3;
        }
    }

    final void b(boolean param0, lh param1) {
        try {
            if (param1.field_a != null) {
                param1.c(-1);
            }
            param1.field_a = this.field_e;
            param1.field_h = this.field_e.field_h;
            param1.field_a.field_h = param1;
            if (!param0) {
                lh var4 = (lh) null;
                this.a(true, (lh) null);
            }
            param1.field_h.field_a = param1;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "vc.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final lh b(int param0) {
        lh var2;
        var2 = this.field_e.field_a;
        if (this.field_e != var2) {
          this.field_c = var2.field_a;
          if (param0 > -33) {
            return (lh) null;
          } else {
            return var2;
          }
        } else {
          this.field_c = null;
          return null;
        }
    }

    final lh b(byte param0) {
        lh var2 = this.field_c;
        if (param0 != -105) {
            field_g = (String) null;
            if (!(var2 != this.field_e)) {
                this.field_c = null;
                return null;
            }
            this.field_c = var2.field_h;
            return var2;
        }
        if (!(var2 != this.field_e)) {
            this.field_c = null;
            return null;
        }
        this.field_c = var2.field_h;
        return var2;
    }

    final static void a(byte param0, rh param1) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        si var6 = null;
        int[] var7 = null;
        int var8 = 0;
        ih var9 = null;
        ih var10 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var9 = new ih(param1.a(0, "", "logo.fo3d"));
                        var10 = var9;
                        var3 = var10.e(false);
                        var10.k(8);
                        fc.field_a = fleas.a(var10, -6383);
                        ij.field_F = new si[var3];
                        gm.field_kb = new int[var3][];
                        var4 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var3 <= var4) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ij.field_F[var4] = d.a(-124, var9);
                        var4++;
                        if (var8 != 0) {
                            statePc = 7;
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
                        if (var8 == 0) {
                            statePc = 2;
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
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var10.m(8);
                        var4 = 17 % ((param0 - 75) / 44);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var5 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var3 <= var5) {
                            statePc = 18;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var6 = ij.field_F[var5];
                        var6.a(6, 1, 6, 6, 0);
                        var6.b(-23443);
                        var7 = new int[]{var6.field_m - -var6.field_B >> -547659167, var6.field_e + var6.field_k >> -1483446015, var6.field_A + var6.field_b >> -1092895903};
                        gm.field_kb[var5] = var7;
                        var6.a(-var7[1], -var7[0], -var7[2], (byte) -82);
                        var5++;
                        if (var8 == 0) {
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
                        return;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var8 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        return;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_16_0 = (RuntimeException) (var2);
                    stackIn_15_0 = stackIn_16_0;
                    stackIn_16_1 = new StringBuilder().append("vc.H(").append(param0).append(',');
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
                    throw pf.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
                }
                case 18: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final lh c(int param0) {
        lh var2 = null;
        if (param0 <= 3) {
            field_d = -51;
            var2 = this.field_c;
            if (!(var2 != this.field_e)) {
                this.field_c = null;
                return null;
            }
            this.field_c = var2.field_a;
            return var2;
        }
        var2 = this.field_c;
        if (!(var2 != this.field_e)) {
            this.field_c = null;
            return null;
        }
        this.field_c = var2.field_a;
        return var2;
    }

    final void a(boolean param0, lh param1) {
        try {
            if (null != param1.field_a) {
                param1.c(-1);
            }
            if (param0) {
                field_b = false;
            }
            param1.field_h = this.field_e;
            param1.field_a = this.field_e.field_a;
            param1.field_a.field_h = param1;
            param1.field_h.field_a = param1;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "vc.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2 >= param0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var3_int = param2;
                        param2 = param0;
                        param0 = var3_int;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (param0 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var3_int = param2 % param0;
                        param2 = param0;
                        param0 = var3_int;
                        if (var4 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var4 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param1 == -1) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackIn_9_0 = -66;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return stackIn_9_0;
                }
                case 10: {
                    try {
                        stackIn_11_0 = param2;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return stackIn_11_0;
                }
                case 12: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw pf.a((Throwable) ((Object) var3), "vc.B(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final lh e(int param0) {
        lh var2;
        var2 = this.field_e.field_h;
        if (var2 != this.field_e) {
          if (param0 != -22033) {
            return (lh) null;
          } else {
            var2.c(-1);
            return var2;
          }
        } else {
          return null;
        }
    }

    final void f(int param0) {
        lh var2 = null;
        int var3 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    var2 = this.field_e.field_h;
                    if (this.field_e == var2) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var2.c(-1);
                    statePc = 7;
                    continue stateLoop;
                }
                case 3: {
                    if (var3 != 0) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var3 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var2.c(-1);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (var3 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (param0 != 1) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    this.field_c = null;
                    return;
                }
                case 10: {
                    field_a = 42;
                    this.field_c = null;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public vc() {
        this.field_e = new lh();
        this.field_e.field_h = this.field_e;
        this.field_e.field_a = this.field_e;
    }

    final boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != -1092895903) {
          L0: {
            this.b((byte) -25);
            if (this.field_e.field_h != this.field_e) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.field_e.field_h != this.field_e) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void d(int param0) {
        field_g = null;
        if (param0 == -29943) {
            return;
        }
        field_g = (String) null;
    }

    static {
        field_d = 0;
        field_g = "You can quickly switch between left slopes, right slopes and blocks by pressing the keys 1, 2 and 3 respectively";
    }
}
