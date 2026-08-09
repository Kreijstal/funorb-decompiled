/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc extends cj {
    static long[] field_Ib;
    static int field_Hb;
    int field_Kb;
    private cj field_Mb;
    private cj[] field_Nb;
    private cj[] field_Jb;
    static int field_Fb;
    static th field_Gb;
    static fm field_Lb;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.field_x = param1;
        if (param0 != 9736) {
          return;
        } else {
          this.field_z = param5;
          this.field_Q = param6;
          this.field_zb = param2;
          this.a(param3, param4, (byte) 119);
          return;
        }
    }

    public static void c(byte param0) {
        field_Lb = null;
        int var1 = -12 / ((8 - param0) / 54);
        field_Ib = null;
        field_Gb = null;
    }

    dc(long param0, cj param1, String[] param2, cj param3, cj[] param4, int param5) {
        super(param0, (cj) null);
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
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
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        cj var9 = null;
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
                        this.field_Nb = new cj[param2.length];
                        this.field_Mb = new cj(0L, param3);
                        this.field_Jb = param4;
                        var8_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var8_int >= param2.length) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var9 = new cj(0L, param1);
                        var9.field_wb = param2[var8_int];
                        this.field_Nb[var8_int] = var9;
                        this.a((byte) 50, var9);
                        var8_int++;
                        if (var10 != 0) {
                            statePc = 6;
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
                        if (var10 == 0) {
                            statePc = 2;
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
                        this.a((byte) 50, this.field_Mb);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var8_int = 0;
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
                        if (var8_int >= param4.length) {
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
                        this.field_Mb.a((byte) 50, param4[var8_int]);
                        var8_int++;
                        if (var10 != 0) {
                            statePc = 25;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var10 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        this.field_Kb = param5;
                        this.field_Nb[param5].field_Ab = true;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    var8 = (RuntimeException) ((Object) caughtException);
                    stackIn_14_0 = (RuntimeException) (var8);
                    stackIn_13_0 = stackIn_14_0;
                    stackIn_14_1 = new StringBuilder().append("dc.<init>(").append(param0).append(',');
                    stackIn_13_1 = stackIn_14_1;
                    if (param1 == null) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_15_0 = (RuntimeException) ((Object) stackIn_13_0);
                    stackIn_15_1 = (StringBuilder) ((Object) stackIn_13_1);
                    stackIn_15_2 = "{...}";
                    statePc = 15;
                    continue stateLoop;
                }
                case 14: {
                    stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                    stackIn_15_2 = "null";
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    stackIn_17_0 = (RuntimeException) ((Object) stackIn_15_0);
                    stackIn_16_0 = stackIn_17_0;
                    stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
                    stackIn_16_1 = stackIn_17_1;
                    if (param2 == null) {
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
                    if (param3 == null) {
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
                    stackIn_23_0 = (RuntimeException) ((Object) stackIn_21_0);
                    stackIn_22_0 = stackIn_23_0;
                    stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
                    stackIn_22_1 = stackIn_23_1;
                    if (param4 == null) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    stackIn_24_0 = (RuntimeException) ((Object) stackIn_22_0);
                    stackIn_24_1 = (StringBuilder) ((Object) stackIn_22_1);
                    stackIn_24_2 = "{...}";
                    statePc = 24;
                    continue stateLoop;
                }
                case 23: {
                    stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
                    stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
                    stackIn_24_2 = "null";
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    throw fa.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param5 + ')');
                }
                case 25: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, int param1, byte param2) {
        cj dupTemp$5 = null;
        cj dupTemp$6 = null;
        cj dupTemp$7 = null;
        cj dupTemp$8 = null;
        cj dupTemp$9 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = ZombieDawnMulti.field_E ? 1 : 0;
                    var4 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (this.field_Nb.length <= var4) {
                        statePc = 26;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var5 = var4 * this.field_zb / this.field_Nb.length;
                    var6 = (var4 - -1) * this.field_zb / this.field_Nb.length;
                    this.field_Nb[var4].field_x = var5;
                    this.field_Nb[var4].field_Q = 0;
                    this.field_Nb[var4].field_zb = -var5 + var6;
                    this.field_Nb[var4].field_z = param1;
                    var4++;
                    if (var7 != 0) {
                        statePc = 46;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var7 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (param2 >= 72) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    this.a(-74, 39, -109, 35, 100, -8, 71);
                    statePc = 16;
                    continue stateLoop;
                }
                case 6: {
                    this.field_Mb.a(this.field_z + -param1, param1, this.field_zb, 0, -3344);
                    var4 = 0;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (this.field_Jb.length > var4) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    return;
                }
                case 9: {
                    this.field_Jb[var4].a(-(param0 * 2) + this.field_Mb.field_z, param0, this.field_Mb.field_zb - 2 * param0, param0, -3344);
                    if (var7 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    return;
                }
                case 11: {
                    if (this.field_Kb == var4) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    dupTemp$5 = this.field_Jb[var4];
                    dupTemp$5.field_x = dupTemp$5.field_x + 10000;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    var4++;
                    if (var7 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    return;
                }
                case 16: {
                    this.field_Mb.a(this.field_z + -param1, param1, this.field_zb, 0, -3344);
                    var4 = 0;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (this.field_Jb.length > var4) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    return;
                }
                case 19: {
                    this.field_Jb[var4].a(-(param0 * 2) + this.field_Mb.field_z, param0, this.field_Mb.field_zb - 2 * param0, param0, -3344);
                    if (var7 == 0) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    return;
                }
                case 21: {
                    if (this.field_Kb == var4) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    dupTemp$6 = this.field_Jb[var4];
                    dupTemp$6.field_x = dupTemp$6.field_x + 10000;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    var4++;
                    if (var7 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    return;
                }
                case 26: {
                    if (param2 >= 72) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    this.a(-74, 39, -109, 35, 100, -8, 71);
                    statePc = 37;
                    continue stateLoop;
                }
                case 28: {
                    this.field_Mb.a(this.field_z + -param1, param1, this.field_zb, 0, -3344);
                    var4 = 0;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    if (this.field_Jb.length > var4) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    return;
                }
                case 31: {
                    this.field_Jb[var4].a(-(param0 * 2) + this.field_Mb.field_z, param0, this.field_Mb.field_zb - 2 * param0, param0, -3344);
                    if (var7 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    return;
                }
                case 33: {
                    if (this.field_Kb == var4) {
                        statePc = 35;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    dupTemp$7 = this.field_Jb[var4];
                    dupTemp$7.field_x = dupTemp$7.field_x + 10000;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    var4++;
                    if (var7 == 0) {
                        statePc = 29;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    return;
                }
                case 37: {
                    this.field_Mb.a(this.field_z + -param1, param1, this.field_zb, 0, -3344);
                    var4 = 0;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if (this.field_Jb.length > var4) {
                        statePc = 40;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    return;
                }
                case 40: {
                    this.field_Jb[var4].a(-(param0 * 2) + this.field_Mb.field_z, param0, this.field_Mb.field_zb - 2 * param0, param0, -3344);
                    if (var7 == 0) {
                        statePc = 42;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    return;
                }
                case 42: {
                    if (this.field_Kb == var4) {
                        statePc = 44;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    dupTemp$8 = this.field_Jb[var4];
                    dupTemp$8.field_x = dupTemp$8.field_x + 10000;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    var4++;
                    if (var7 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    return;
                }
                case 46: {
                    var4 = 0;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    if (this.field_Jb.length > var4) {
                        statePc = 49;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    return;
                }
                case 49: {
                    this.field_Jb[var4].a(-(param0 * 2) + this.field_Mb.field_z, param0, this.field_Mb.field_zb - 2 * param0, param0, -3344);
                    if (var7 == 0) {
                        statePc = 51;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    return;
                }
                case 51: {
                    if (this.field_Kb == var4) {
                        statePc = 53;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    dupTemp$9 = this.field_Jb[var4];
                    dupTemp$9.field_x = dupTemp$9.field_x + 10000;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    var4++;
                    if (var7 == 0) {
                        statePc = 47;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(long param0, java.applet.Applet param1, String param2, int param3, String param4) {
        try {
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            StringBuilder stackIn_14_1 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            StringBuilder stackIn_17_1 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      L3: {
                        var8 = param1.getParameter("cookiehost");
                        var7 = var8;
                        var7 = var8;
                        var9 = param2 + "=" + param4 + "; version=1; path=/; domain=" + var8;
                        var7 = var9;
                        var7 = var9;
                        var7 = var9;
                        if (0L > param0) {
                          break L3;
                        } else {
                          var7 = var9 + "; Expires=" + ke.a(-29971, bl.a((byte) 101) + 1000L * param0) + "; Max-Age=" + param0;
                          if (!ZombieDawnMulti.field_E) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var7 = var7 + "; Discard;";
                      break L2;
                    }
                    if (param3 < -91) {
                      fo.a(param1, 14575, "document.cookie=\"" + var7 + "\"");
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var6 = decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_11_0 = (RuntimeException) (var6_ref);

                stackIn_11_1 = new StringBuilder().append("dc.EA(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "null";
                  break L5;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

                if (param2 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "null";
                  break L6;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "{...}";
                  break L6;
                }
              }
              L7: {


                stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param3).append(',');

                if (param4 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "null";
                  break L7;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "{...}";
                  break L7;
                }
              }
              throw fa.a((Throwable) ((Object) stackIn_12_0), stackIn_18_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
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

    final void h(int param0) {
        cj dupTemp$0 = null;
        cj dupTemp$1 = null;
        int var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 >= -26) {
            return;
        }
        int var2 = 0;
        do {
            if (this.field_Nb.length <= var2) {
                return;
            }
            if (var3 != 0) {
                return;
            }
            if (var2 != this.field_Kb) {
                if (!(0 == this.field_Nb[var2].field_T)) {
                    this.field_Nb[this.field_Kb].field_Ab = false;
                    dupTemp$0 = this.field_Jb[this.field_Kb];
                    dupTemp$0.field_x = dupTemp$0.field_x + 10000;
                    this.field_Kb = var2;
                    this.field_Nb[var2].field_Ab = true;
                    dupTemp$1 = this.field_Jb[var2];
                    dupTemp$1.field_x = dupTemp$1.field_x - 10000;
                }
            }
            var2++;
        } while (var3 == 0);
    }

    static {
        field_Ib = new long[32];
        field_Gb = new th();
    }
}
