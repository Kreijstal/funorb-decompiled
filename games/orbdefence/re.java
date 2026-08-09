/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re {
    private int field_e;
    private int field_d;
    private int field_h;
    private int[] field_a;
    static String field_g;
    private int[] field_b;
    static String field_f;
    private int field_c;

    private final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_38_0 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = OrbDefence.field_D ? 1 : 0;
                    var3 = -1640531527;
                    var4 = -1640531527;
                    var10 = -1640531527;
                    var7 = -1640531527;
                    var8 = -1640531527;
                    var9 = -1640531527;
                    var5 = -1640531527;
                    var6 = -1640531527;
                    var2 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (4 <= var2) {
                        statePc = 33;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var3 = var3 ^ var4 << 1801650827;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
                    var4 = var4 ^ var5 >>> -310078782;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
                    var5 = var5 ^ var6 << -2038878872;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> -760076432;
                    var9 = var9 + var6;
                    var7 = var7 + var8;
                    var7 = var7 ^ var8 << -1770921366;
                    var10 = var10 + var7;
                    var8 = var8 + var9;
                    var8 = var8 ^ var9 >>> -123761468;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << -1957349912;
                    var10 = var10 + var3;
                    var4 = var4 + var9;
                    var10 = var10 ^ var3 >>> -1161653559;
                    var3 = var3 + var4;
                    var5 = var5 + var10;
                    var2++;
                    if (var12 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if ((var2 ^ -1) <= -257) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var3 = var3 + this.field_b[var2];
                    var7 = var7 + this.field_b[4 + var2];
                    var9 = var9 + this.field_b[var2 - -6];
                    var6 = var6 + this.field_b[3 + var2];
                    var4 = var4 + this.field_b[var2 - -1];
                    var10 = var10 + this.field_b[7 + var2];
                    var5 = var5 + this.field_b[2 + var2];
                    var8 = var8 + this.field_b[5 + var2];
                    var3 = var3 ^ var4 << 1804709163;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> -1735692478;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
                    var5 = var5 ^ var6 << -2091789144;
                    var8 = var8 + var5;
                    var6 = var6 + var7;
                    var6 = var6 ^ var7 >>> -1580576816;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << -569356086;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> 436163012;
                    var3 = var3 + var8;
                    var9 = var9 + var10;
                    var9 = var9 ^ var10 << 806583368;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> 314337065;
                    var3 = var3 + var4;
                    stackIn_7_0 = var5 + var10;
                    stackIn_5_0 = stackIn_7_0;
                    if (var12 != 0) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var5 = stackIn_5_0;
                    this.field_a[var2] = var3;
                    this.field_a[var2 + 1] = var4;
                    this.field_a[var2 - -2] = var5;
                    this.field_a[3 + var2] = var6;
                    this.field_a[4 + var2] = var7;
                    this.field_a[var2 + 5] = var8;
                    this.field_a[6 + var2] = var9;
                    this.field_a[7 + var2] = var10;
                    var2 += 8;
                    if (var12 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    stackIn_7_0 = -97 / ((param0 - 3) / 50);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    var11 = stackIn_7_0;
                    var2 = 0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if ((var2 ^ -1) > -257) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    this.a((byte) 122);
                    this.field_c = 256;
                    return;
                }
                case 10: {
                    var3 = var3 + this.field_a[var2];
                    var5 = var5 + this.field_a[2 + var2];
                    var6 = var6 + this.field_a[var2 - -3];
                    var10 = var10 + this.field_a[7 + var2];
                    var9 = var9 + this.field_a[6 + var2];
                    var8 = var8 + this.field_a[var2 - -5];
                    var7 = var7 + this.field_a[4 + var2];
                    var4 = var4 + this.field_a[1 + var2];
                    var3 = var3 ^ var4 << 2144811691;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> -312752702;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
                    var5 = var5 ^ var6 << 381529576;
                    var8 = var8 + var5;
                    var6 = var6 + var7;
                    var6 = var6 ^ var7 >>> -1692030064;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << 2049751370;
                    var10 = var10 + var7;
                    var8 = var8 + var9;
                    var8 = var8 ^ var9 >>> -744832892;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << 833802664;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> 1952118441;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    this.field_a[var2] = var3;
                    this.field_a[var2 + 1] = var4;
                    this.field_a[var2 - -2] = var5;
                    this.field_a[3 + var2] = var6;
                    this.field_a[4 + var2] = var7;
                    this.field_a[5 + var2] = var8;
                    this.field_a[6 + var2] = var9;
                    this.field_a[7 + var2] = var10;
                    var2 += 8;
                    if (var12 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    return;
                }
                case 12: {
                    if (var12 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    this.a((byte) 122);
                    this.field_c = 256;
                    return;
                }
                case 17: {
                    if (var12 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var2 = 0;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if ((var2 ^ -1) <= -257) {
                        statePc = 22;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var3 = var3 + this.field_b[var2];
                    var7 = var7 + this.field_b[4 + var2];
                    var9 = var9 + this.field_b[var2 - -6];
                    var6 = var6 + this.field_b[3 + var2];
                    var4 = var4 + this.field_b[var2 - -1];
                    var10 = var10 + this.field_b[7 + var2];
                    var5 = var5 + this.field_b[2 + var2];
                    var8 = var8 + this.field_b[5 + var2];
                    var3 = var3 ^ var4 << 1804709163;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> -1735692478;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
                    var5 = var5 ^ var6 << -2091789144;
                    var8 = var8 + var5;
                    var6 = var6 + var7;
                    var6 = var6 ^ var7 >>> -1580576816;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << -569356086;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> 436163012;
                    var3 = var3 + var8;
                    var9 = var9 + var10;
                    var9 = var9 ^ var10 << 806583368;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> 314337065;
                    var3 = var3 + var4;
                    stackIn_23_0 = var5 + var10;
                    stackIn_21_0 = stackIn_23_0;
                    if (var12 != 0) {
                        statePc = 23;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var5 = stackIn_21_0;
                    this.field_a[var2] = var3;
                    this.field_a[var2 + 1] = var4;
                    this.field_a[var2 - -2] = var5;
                    this.field_a[3 + var2] = var6;
                    this.field_a[4 + var2] = var7;
                    this.field_a[var2 + 5] = var8;
                    this.field_a[6 + var2] = var9;
                    this.field_a[7 + var2] = var10;
                    var2 += 8;
                    if (var12 == 0) {
                        statePc = 19;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    stackIn_23_0 = -97 / ((param0 - 3) / 50);
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    var11 = stackIn_23_0;
                    var2 = 0;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if ((var2 ^ -1) > -257) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    this.a((byte) 122);
                    this.field_c = 256;
                    return;
                }
                case 26: {
                    var3 = var3 + this.field_a[var2];
                    var5 = var5 + this.field_a[2 + var2];
                    var6 = var6 + this.field_a[var2 - -3];
                    var10 = var10 + this.field_a[7 + var2];
                    var9 = var9 + this.field_a[6 + var2];
                    var8 = var8 + this.field_a[var2 - -5];
                    var7 = var7 + this.field_a[4 + var2];
                    var4 = var4 + this.field_a[1 + var2];
                    var3 = var3 ^ var4 << 2144811691;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> -312752702;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
                    var5 = var5 ^ var6 << 381529576;
                    var8 = var8 + var5;
                    var6 = var6 + var7;
                    var6 = var6 ^ var7 >>> -1692030064;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << 2049751370;
                    var10 = var10 + var7;
                    var8 = var8 + var9;
                    var8 = var8 ^ var9 >>> -744832892;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << 833802664;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> 1952118441;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    this.field_a[var2] = var3;
                    this.field_a[var2 + 1] = var4;
                    this.field_a[var2 - -2] = var5;
                    this.field_a[3 + var2] = var6;
                    this.field_a[4 + var2] = var7;
                    this.field_a[5 + var2] = var8;
                    this.field_a[6 + var2] = var9;
                    this.field_a[7 + var2] = var10;
                    var2 += 8;
                    if (var12 == 0) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    return;
                }
                case 28: {
                    if (var12 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    this.a((byte) 122);
                    this.field_c = 256;
                    return;
                }
                case 33: {
                    var2 = 0;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    if ((var2 ^ -1) <= -257) {
                        statePc = 37;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var3 = var3 + this.field_b[var2];
                    var7 = var7 + this.field_b[4 + var2];
                    var9 = var9 + this.field_b[var2 - -6];
                    var6 = var6 + this.field_b[3 + var2];
                    var4 = var4 + this.field_b[var2 - -1];
                    var10 = var10 + this.field_b[7 + var2];
                    var5 = var5 + this.field_b[2 + var2];
                    var8 = var8 + this.field_b[5 + var2];
                    var3 = var3 ^ var4 << 1804709163;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> -1735692478;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
                    var5 = var5 ^ var6 << -2091789144;
                    var8 = var8 + var5;
                    var6 = var6 + var7;
                    var6 = var6 ^ var7 >>> -1580576816;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << -569356086;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> 436163012;
                    var3 = var3 + var8;
                    var9 = var9 + var10;
                    var9 = var9 ^ var10 << 806583368;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> 314337065;
                    var3 = var3 + var4;
                    stackIn_38_0 = var5 + var10;
                    stackIn_36_0 = stackIn_38_0;
                    if (var12 != 0) {
                        statePc = 38;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var5 = stackIn_36_0;
                    this.field_a[var2] = var3;
                    this.field_a[var2 + 1] = var4;
                    this.field_a[var2 - -2] = var5;
                    this.field_a[3 + var2] = var6;
                    this.field_a[4 + var2] = var7;
                    this.field_a[var2 + 5] = var8;
                    this.field_a[6 + var2] = var9;
                    this.field_a[7 + var2] = var10;
                    var2 += 8;
                    if (var12 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    stackIn_38_0 = -97 / ((param0 - 3) / 50);
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    var11 = stackIn_38_0;
                    var2 = 0;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if ((var2 ^ -1) > -257) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    this.a((byte) 122);
                    this.field_c = 256;
                    return;
                }
                case 41: {
                    var3 = var3 + this.field_a[var2];
                    var5 = var5 + this.field_a[2 + var2];
                    var6 = var6 + this.field_a[var2 - -3];
                    var10 = var10 + this.field_a[7 + var2];
                    var9 = var9 + this.field_a[6 + var2];
                    var8 = var8 + this.field_a[var2 - -5];
                    var7 = var7 + this.field_a[4 + var2];
                    var4 = var4 + this.field_a[1 + var2];
                    var3 = var3 ^ var4 << 2144811691;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> -312752702;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
                    var5 = var5 ^ var6 << 381529576;
                    var8 = var8 + var5;
                    var6 = var6 + var7;
                    var6 = var6 ^ var7 >>> -1692030064;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << 2049751370;
                    var10 = var10 + var7;
                    var8 = var8 + var9;
                    var8 = var8 ^ var9 >>> -744832892;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << 833802664;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> 1952118441;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    this.field_a[var2] = var3;
                    this.field_a[var2 + 1] = var4;
                    this.field_a[var2 - -2] = var5;
                    this.field_a[3 + var2] = var6;
                    this.field_a[4 + var2] = var7;
                    this.field_a[5 + var2] = var8;
                    this.field_a[6 + var2] = var9;
                    this.field_a[7 + var2] = var10;
                    var2 += 8;
                    if (var12 == 0) {
                        statePc = 43;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    return;
                }
                case 43: {
                    if (var12 == 0) {
                        statePc = 39;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    this.a((byte) 122);
                    this.field_c = 256;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void c(byte param0) {
        field_g = null;
        if (param0 > -62) {
            field_f = (String) null;
            field_f = null;
            return;
        }
        field_f = null;
    }

    final int a(int param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        L0: {
          if (0 == this.field_c) {
            this.a((byte) 119);
            this.field_c = 256;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 128) {
          this.field_d = -48;
          fieldTemp$2 = this.field_c - 1;
          this.field_c = this.field_c - 1;
          return this.field_b[fieldTemp$2];
        } else {
          fieldTemp$3 = this.field_c - 1;
          this.field_c = this.field_c - 1;
          return this.field_b[fieldTemp$3];
        }
    }

    private final void a(byte param0) {
        int fieldTemp$0 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int fieldTemp$3 = 0;
        int dupTemp$4 = 0;
        int dupTemp$5 = 0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = OrbDefence.field_D ? 1 : 0;
                    if (param0 >= 118) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.a(92);
                    statePc = 19;
                    continue stateLoop;
                }
                case 2: {
                    fieldTemp$0 = this.field_h + 1;
                    this.field_h = this.field_h + 1;
                    this.field_e = this.field_e + fieldTemp$0;
                    var2 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (256 > var2) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return;
                }
                case 5: {
                    var3 = this.field_a[var2];
                    if (var5 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    return;
                }
                case 7: {
                    if (-1 != (var2 & 2 ^ -1)) {
                        statePc = 13;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if ((1 & var2) != 0) {
                        statePc = 11;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    this.field_d = this.field_d ^ this.field_d << -1089389779;
                    if (var5 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    this.field_d = this.field_d ^ this.field_d >>> 330912006;
                    if (var5 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if ((var2 & 1) == 0) {
                        statePc = 16;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    this.field_d = this.field_d ^ this.field_d >>> 1507026576;
                    if (var5 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    this.field_d = this.field_d ^ this.field_d << -114091742;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    this.field_d = this.field_d + this.field_a[128 + var2 & 255];
                    dupTemp$1 = this.field_a[vi.a(var3 >> 352516226, 255)] + (this.field_d + this.field_e);
                    var4 = dupTemp$1;
                    this.field_a[var2] = dupTemp$1;
                    dupTemp$2 = var3 + this.field_a[vi.a(var4 >> -539804984 >> -2070968158, 255)];
                    this.field_e = dupTemp$2;
                    this.field_b[var2] = dupTemp$2;
                    var2++;
                    if (var5 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    return;
                }
                case 19: {
                    fieldTemp$3 = this.field_h + 1;
                    this.field_h = this.field_h + 1;
                    this.field_e = this.field_e + fieldTemp$3;
                    var2 = 0;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (256 > var2) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    return;
                }
                case 22: {
                    var3 = this.field_a[var2];
                    if (var5 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    return;
                }
                case 24: {
                    if (-1 != (var2 & 2 ^ -1)) {
                        statePc = 30;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if ((1 & var2) != 0) {
                        statePc = 28;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    this.field_d = this.field_d ^ this.field_d << -1089389779;
                    if (var5 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    this.field_d = this.field_d ^ this.field_d >>> 330912006;
                    if (var5 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if ((var2 & 1) == 0) {
                        statePc = 33;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    this.field_d = this.field_d ^ this.field_d >>> 1507026576;
                    if (var5 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    this.field_d = this.field_d ^ this.field_d << -114091742;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    this.field_d = this.field_d + this.field_a[128 + var2 & 255];
                    dupTemp$4 = this.field_a[vi.a(var3 >> 352516226, 255)] + (this.field_d + this.field_e);
                    var4 = dupTemp$4;
                    this.field_a[var2] = dupTemp$4;
                    dupTemp$5 = var3 + this.field_a[vi.a(var4 >> -539804984 >> -2070968158, 255)];
                    this.field_e = dupTemp$5;
                    this.field_b[var2] = dupTemp$5;
                    var2++;
                    if (var5 == 0) {
                        statePc = 20;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    re(int[] param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_b = new int[256];
                        this.field_a = new int[256];
                        var2_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var2_int >= param0.length) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        this.field_b[var2_int] = param0[var2_int];
                        var2_int++;
                        if (var3 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var3 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        this.b((byte) 92);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_9_0 = (RuntimeException) (runtimeException);
                    stackIn_8_0 = stackIn_9_0;
                    stackIn_9_1 = new StringBuilder().append("re.<init>(");
                    stackIn_8_1 = stackIn_9_1;
                    if (param0 == null) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    stackIn_10_0 = (RuntimeException) ((Object) stackIn_8_0);
                    stackIn_10_1 = (StringBuilder) ((Object) stackIn_8_1);
                    stackIn_10_2 = "{...}";
                    statePc = 10;
                    continue stateLoop;
                }
                case 9: {
                    stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
                    stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                    stackIn_10_2 = "null";
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    throw dd.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_g = "FLYBO";
        field_f = "ZOOMO";
    }
}
