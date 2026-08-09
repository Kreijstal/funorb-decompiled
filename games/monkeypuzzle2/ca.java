/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca extends rf {
    private byte[] field_i;
    private int field_w;
    private int field_u;
    private gf field_g;
    private wd field_c;
    static le field_f;
    private gf field_p;
    private cg field_q;
    private int field_t;
    private wl field_r;
    private fb field_o;
    private uj field_v;
    static String field_n;
    private byte[] field_s;
    private pj field_j;
    private pj field_h;
    private boolean field_m;
    private boolean field_d;
    private int field_l;
    private boolean field_k;
    private long field_e;

    final void c(int param0) {
        fb discarded$0 = null;
        fb discarded$1 = null;
        fb discarded$2 = null;
        fb discarded$3 = null;
        fb discarded$4 = null;
        fb discarded$5 = null;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_42_0 = 0;
        byte stackIn_42_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_105_1 = 0;
        int stackIn_124_0 = 0;
        int stackIn_127_0 = 0;
        int stackIn_128_0 = 0;
        int stackIn_128_1 = 0;
        byte stackOut_41_1;
        int statePc = 0;
        int var2_int = 0;
        fb var2 = null;
        ug var3 = null;
        int var4 = 0;
        int var5 = 0;
        ug var6 = null;
        ug var7 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = MonkeyPuzzle2.field_F ? 1 : 0;
                    if (null != this.field_h) {
                        statePc = 2;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (null == this.a((byte) 119)) {
                        statePc = 4;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return;
                }
                case 5: {
                    if (!this.field_d) {
                        statePc = 36;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var2_int = 1;
                    var3 = this.field_h.a((byte) -117);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (var3 == null) {
                        statePc = 130;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var4 = (int)var3.field_a;
                    stackIn_18_0 = this.field_s[var4] ^ -1;
                    stackIn_9_0 = stackIn_18_0;
                    stackIn_18_1 = -1;
                    stackIn_9_1 = stackIn_18_1;
                    if (var5 != 0) {
                        statePc = 18;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (stackIn_9_0 != stackIn_9_1) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    discarded$0 = this.a(2, 1, var4);
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (this.field_s[var4] == 0) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var3.c(-19822);
                    if (var5 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var2_int = 0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    var3 = this.field_h.d((byte) 63);
                    if (var5 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_18_0 = this.field_c.field_m.length ^ -1;
                    stackIn_18_1 = this.field_l ^ -1;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (stackIn_18_0 >= stackIn_18_1) {
                        statePc = 31;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackIn_32_0 = this.field_c.field_m[this.field_l];
                    stackIn_20_0 = stackIn_32_0;
                    if (var5 != 0) {
                        statePc = 32;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (stackIn_20_0 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 22: {
                    this.field_l = this.field_l + 1;
                    if (var5 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (250 > this.field_v.field_j) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var2_int = 0;
                    if (var5 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (0 != this.field_s[this.field_l]) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    discarded$1 = this.a(param0 ^ 16309, 1, this.field_l);
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (-1 == (this.field_s[this.field_l] ^ -1)) {
                        statePc = 29;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var6 = new ug();
                    var6.field_a = (long)this.field_l;
                    var2_int = 0;
                    this.field_h.a(-8212, var6);
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    this.field_l = this.field_l + 1;
                    if (var5 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    stackIn_32_0 = var2_int;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    if (stackIn_32_0 != 0) {
                        statePc = 34;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 34: {
                    this.field_l = 0;
                    this.field_d = false;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (var5 == 0) {
                        statePc = 65;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (this.field_m) {
                        statePc = 39;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    this.field_h = null;
                    if (var5 == 0) {
                        statePc = 65;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var2_int = 1;
                    var3 = this.field_h.a((byte) -117);
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if (var3 == null) {
                        statePc = 107;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var4 = (int)var3.field_a;
                    stackIn_50_0 = 1;
                    stackIn_42_0 = stackIn_50_0;
                    stackOut_41_1 = this.field_s[var4];
                    stackIn_50_1 = stackOut_41_1;
                    stackIn_42_1 = stackOut_41_1;
                    if (var5 != 0) {
                        statePc = 50;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (stackIn_42_0 == stackIn_42_1) {
                        statePc = 44;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    discarded$2 = this.a(2, 2, var4);
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    if (this.field_s[var4] == 1) {
                        statePc = 46;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    var2_int = 0;
                    if (var5 == 0) {
                        statePc = 47;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    var3.c(param0 + -36133);
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    var3 = this.field_h.d((byte) 63);
                    if (var5 == 0) {
                        statePc = 40;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 49: {
                    stackIn_50_0 = this.field_l ^ -1;
                    stackIn_50_1 = this.field_c.field_m.length ^ -1;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    if (stackIn_50_0 <= stackIn_50_1) {
                        statePc = 62;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    stackIn_63_0 = this.field_c.field_m[this.field_l];
                    stackIn_52_0 = stackIn_63_0;
                    if (var5 != 0) {
                        statePc = 63;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if (stackIn_52_0 != 0) {
                        statePc = 55;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    this.field_l = this.field_l + 1;
                    if (var5 == 0) {
                        statePc = 49;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (!this.field_r.a(20)) {
                        statePc = 57;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    var2_int = 0;
                    if (var5 == 0) {
                        statePc = 62;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    if ((this.field_s[this.field_l] ^ -1) == -2) {
                        statePc = 59;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    discarded$3 = this.a(param0 + -16309, 2, this.field_l);
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    if ((this.field_s[this.field_l] ^ -1) == -2) {
                        statePc = 61;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    var7 = new ug();
                    var7.field_a = (long)this.field_l;
                    var2_int = 0;
                    this.field_h.a(-8212, var7);
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    this.field_l = this.field_l + 1;
                    if (var5 == 0) {
                        statePc = 49;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    stackIn_63_0 = var2_int;
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    if (stackIn_63_0 == 0) {
                        statePc = 65;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    this.field_l = 0;
                    this.field_m = false;
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    if (param0 == 16311) {
                        statePc = 67;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    this.field_q = (cg) null;
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    if (!this.field_k) {
                        statePc = 85;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if (pf.a(0) >= this.field_e) {
                        statePc = 70;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 70: {
                    var2 = (fb) ((Object) this.field_q.a(0));
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    if (var2 == null) {
                        statePc = 83;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if (var5 != 0) {
                        statePc = 85;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    if (!var2.field_j) {
                        statePc = 76;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    if (var5 == 0) {
                        statePc = 82;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    if (!var2.field_l) {
                        statePc = 81;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    if (!var2.field_m) {
                        statePc = 79;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 79: {
                    throw new RuntimeException();
                }
                case 80: {
                    var2.c(param0 + -36133);
                    if (var5 == 0) {
                        statePc = 82;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    var2.field_l = true;
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    var2 = (fb) ((Object) this.field_q.a((byte) -55));
                    if (var5 == 0) {
                        statePc = 71;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    this.field_e = pf.a(param0 + -16311) - -1000L;
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    return;
                }
                case 87: {
                    this.field_l = this.field_l + 1;
                    if (var5 == 0) {
                        statePc = 107;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 89: {
                    var2_int = 0;
                    if (var5 == 0) {
                        statePc = 62;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 91: {
                    discarded$4 = this.a(param0 + -16309, 2, this.field_l);
                    statePc = 95;
                    continue stateLoop;
                }
                case 92: {
                    var7 = new ug();
                    var7.field_a = (long)this.field_l;
                    var2_int = 0;
                    this.field_h.a(-8212, var7);
                    statePc = 93;
                    continue stateLoop;
                }
                case 93: {
                    this.field_l = this.field_l + 1;
                    if (var5 == 0) {
                        statePc = 107;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 95: {
                    if ((this.field_s[this.field_l] ^ -1) == -2) {
                        statePc = 93;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 97: {
                    if ((this.field_s[this.field_l] ^ -1) == -2) {
                        statePc = 95;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 99: {
                    if (!this.field_r.a(20)) {
                        statePc = 97;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 101: {
                    if (stackIn_101_0 != 0) {
                        statePc = 99;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 103: {
                    stackIn_63_0 = this.field_c.field_m[this.field_l];
                    stackIn_104_0 = stackIn_63_0;
                    if (var5 != 0) {
                        statePc = 63;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    stackIn_101_0 = stackIn_104_0;
                    statePc = 101;
                    continue stateLoop;
                }
                case 105: {
                    if (stackIn_105_0 <= stackIn_105_1) {
                        statePc = 62;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 107: {
                    stackIn_105_0 = this.field_l ^ -1;
                    stackIn_105_1 = this.field_c.field_m.length ^ -1;
                    statePc = 105;
                    continue stateLoop;
                }
                case 109: {
                    var2_int = 0;
                    if (var5 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 111: {
                    discarded$5 = this.a(param0 ^ 16309, 1, this.field_l);
                    statePc = 116;
                    continue stateLoop;
                }
                case 113: {
                    this.field_l = this.field_l + 1;
                    if (var5 == 0) {
                        statePc = 130;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 115: {
                    var6 = new ug();
                    var6.field_a = (long)this.field_l;
                    var2_int = 0;
                    this.field_h.a(-8212, var6);
                    statePc = 113;
                    continue stateLoop;
                }
                case 116: {
                    if (-1 == (this.field_s[this.field_l] ^ -1)) {
                        statePc = 115;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 118: {
                    if (0 != this.field_s[this.field_l]) {
                        statePc = 116;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 120: {
                    if (250 > this.field_v.field_j) {
                        statePc = 118;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 122: {
                    this.field_l = this.field_l + 1;
                    if (var5 == 0) {
                        statePc = 130;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 124: {
                    if (stackIn_124_0 == 0) {
                        statePc = 122;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 126: {
                    stackIn_32_0 = this.field_c.field_m[this.field_l];
                    stackIn_127_0 = stackIn_32_0;
                    if (var5 != 0) {
                        statePc = 32;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    stackIn_124_0 = stackIn_127_0;
                    statePc = 124;
                    continue stateLoop;
                }
                case 128: {
                    if (stackIn_128_0 >= stackIn_128_1) {
                        statePc = 31;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 130: {
                    stackIn_128_0 = this.field_c.field_m.length ^ -1;
                    stackIn_128_1 = this.field_l ^ -1;
                    statePc = 128;
                    continue stateLoop;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8) {
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        String stackIn_87_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        var19 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((param8 ^ -1) > -1) {
                break L1;
              } else {
                if ((param2 ^ -1) > (ig.field_a ^ -1)) {
                  L2: {
                    if (0 <= param3) {
                      break L2;
                    } else {
                      if (0 <= param1) {
                        break L2;
                      } else {
                        if ((param4 ^ -1) <= -1) {
                          break L2;
                        } else {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                  L3: {
                    if (param3 < ig.field_c) {
                      break L3;
                    } else {
                      if ((ig.field_c ^ -1) < (param1 ^ -1)) {
                        break L3;
                      } else {
                        if ((param4 ^ -1) <= (ig.field_c ^ -1)) {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    L5: {
                      var14 = param8 - param2;
                      if ((param2 ^ -1) == (param5 ^ -1)) {
                        break L5;
                      } else {
                        L6: {
                          L7: {
                            var10 = param3 << 902842864;
                            var9_int = param3 << 902842864;
                            var15 = -param2 + param5;
                            var11 = (param1 + -param3 << 990415344) / var15;
                            var12 = (-param3 + param4 << 446997328) / var14;
                            if (var11 >= var12) {
                              break L7;
                            } else {
                              var13 = 0;
                              if (var19 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          var13 = 1;
                          break L6;
                        }
                        L8: {
                          L9: {
                            L10: {
                              if (-1 >= (param2 ^ -1)) {
                                break L10;
                              } else {
                                L11: {
                                  if (-1 < (param5 ^ -1)) {
                                    break L11;
                                  } else {
                                    param2 = -param2;
                                    var9_int = var9_int + var11 * param2;
                                    var10 = var10 + param2 * var12;
                                    param2 = 0;
                                    if (var19 == 0) {
                                      break L10;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                param2 = param5 + -param2;
                                var9_int = var9_int + var11 * param2;
                                var10 = var10 + param2 * var12;
                                param2 = param5;
                                if (var19 == 0) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            var16 = ig.field_i[param2];
                            L12: while (true) {
                              if ((param5 ^ -1) >= (param2 ^ -1)) {
                                break L9;
                              } else {
                                var17 = var9_int >> -1066765616;
                                stackIn_42_0 = ig.field_c ^ -1;

                                stackIn_42_1 = var17 ^ -1;

                                if (var19 != 0) {
                                  break L8;
                                } else {
                                  L13: {
                                    if (stackIn_42_0 >= stackIn_42_1) {
                                      break L13;
                                    } else {
                                      L14: {
                                        var18 = (var10 >> -626495920) - (var9_int >> -1089888656);
                                        if (-1 != (var18 ^ -1)) {
                                          break L14;
                                        } else {
                                          if (-1 < (var17 ^ -1)) {
                                            break L13;
                                          } else {
                                            if ((ig.field_c ^ -1) < (var17 ^ -1)) {
                                              tl.a(var18, param0, (byte) -97, var17 - -var16, param6);
                                              if (var19 == 0) {
                                                break L13;
                                              } else {
                                                break L14;
                                              }
                                            } else {
                                              break L13;
                                            }
                                          }
                                        }
                                      }
                                      L15: {
                                        if (var18 + var17 >= ig.field_c) {
                                          var18 = ig.field_c + (-var17 - 1);
                                          break L15;
                                        } else {
                                          break L15;
                                        }
                                      }
                                      L16: {
                                        if (var17 >= 0) {
                                          break L16;
                                        } else {
                                          tl.a(var17 + var18, param0, (byte) -115, var16, param6);
                                          if (var19 == 0) {
                                            break L13;
                                          } else {
                                            break L16;
                                          }
                                        }
                                      }
                                      tl.a(var18, param0, (byte) -76, var16 + var17, param6);
                                      break L13;
                                    }
                                  }
                                  param2++;
                                  if ((ig.field_a ^ -1) < (param2 ^ -1)) {
                                    var16 = var16 + ge.field_h;
                                    var9_int = var9_int + var11;
                                    var10 = var10 + var12;
                                    if (var19 == 0) {
                                      continue L12;
                                    } else {
                                      break L9;
                                    }
                                  } else {
                                    decompiledRegionSelector0 = 3;
                                    break L0;
                                  }
                                }
                              }
                            }
                          }
                          var16 = -param5 + param8;
                          stackIn_42_0 = 0;
                          stackIn_42_1 = var16;
                          break L8;
                        }
                        L17: {
                          L18: {
                            if (stackIn_42_0 == stackIn_42_1) {
                              break L18;
                            } else {
                              L19: {
                                L20: {
                                  var17 = param4 << -1883128432;
                                  if (var13 != 0) {
                                    break L20;
                                  } else {
                                    var9_int = param1 << -24185264;
                                    if (var19 == 0) {
                                      break L19;
                                    } else {
                                      break L20;
                                    }
                                  }
                                }
                                var10 = param1 << -828187472;
                                break L19;
                              }
                              var12 = (var17 - var10) / var16;
                              var11 = (var17 - var9_int) / var16;
                              if (var19 == 0) {
                                break L17;
                              } else {
                                break L18;
                              }
                            }
                          }
                          var12 = 0;
                          var11 = 0;
                          break L17;
                        }
                        if (var19 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L21: {
                      L22: {
                        if (param2 != param8) {
                          break L22;
                        } else {
                          var11 = 0;
                          var12 = 0;
                          var10 = param1 << -1036959120;
                          var9_int = param3 << 518856656;
                          if (var19 == 0) {
                            break L21;
                          } else {
                            break L22;
                          }
                        }
                      }
                      L23: {
                        var15 = -param5 + param8;
                        if (param3 < param1) {
                          break L23;
                        } else {
                          var11 = (param4 - param1 << -2104365488) / var15;
                          var12 = (-param3 + param4 << 1775351792) / var14;
                          var10 = param3 << -2018670416;
                          var9_int = param1 << -673218416;
                          if (var19 == 0) {
                            break L21;
                          } else {
                            break L23;
                          }
                        }
                      }
                      var9_int = param3 << -1255229904;
                      var11 = (param4 + -param3 << -1920850064) / var14;
                      var10 = param1 << 153523568;
                      var12 = (-param1 + param4 << -770577040) / var15;
                      break L21;
                    }
                    L24: {
                      if ((param2 ^ -1) <= -1) {
                        break L24;
                      } else {
                        param2 = Math.min(-param2, param5 - param2);
                        var10 = var10 + var12 * param2;
                        var9_int = var9_int + param2 * var11;
                        param2 = 0;
                        break L24;
                      }
                    }
                    var13 = 0;
                    break L4;
                  }
                  L25: {
                    if (0 > param2) {
                      param2 = -param2;
                      var9_int = var9_int + var11 * param2;
                      var10 = var10 + param2 * var12;
                      param2 = 0;
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  L26: {
                    if (param7 == -18427) {
                      break L26;
                    } else {
                      field_n = (String) null;
                      break L26;
                    }
                  }
                  var15 = ig.field_i[param2];
                  L27: while (true) {
                    L28: {
                      if (param2 >= param8) {
                        break L28;
                      } else {
                        var16 = var9_int >> 80729840;
                        if (var19 != 0) {
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          L29: {
                            if ((ig.field_c ^ -1) < (var16 ^ -1)) {
                              L30: {
                                var17 = (var10 >> -1946454256) - (var9_int >> -1200449552);
                                if (-1 == (var17 ^ -1)) {
                                  break L30;
                                } else {
                                  L31: {
                                    if ((var16 + var17 ^ -1) <= (ig.field_c ^ -1)) {
                                      var17 = -var16 + (ig.field_c + -1);
                                      break L31;
                                    } else {
                                      break L31;
                                    }
                                  }
                                  L32: {
                                    if (0 > var16) {
                                      break L32;
                                    } else {
                                      tl.a(var17, param0, (byte) -106, var16 - -var15, param6);
                                      if (var19 == 0) {
                                        break L29;
                                      } else {
                                        break L32;
                                      }
                                    }
                                  }
                                  tl.a(var17 + var16, param0, (byte) -91, var15, param6);
                                  if (var19 == 0) {
                                    break L29;
                                  } else {
                                    break L30;
                                  }
                                }
                              }
                              if (-1 < (var16 ^ -1)) {
                                break L29;
                              } else {
                                if ((ig.field_c ^ -1) < (var16 ^ -1)) {
                                  tl.a(var17, param0, (byte) -106, var15 + var16, param6);
                                  break L29;
                                } else {
                                  break L29;
                                }
                              }
                            } else {
                              break L29;
                            }
                          }
                          param2++;
                          if (ig.field_a > param2) {
                            var10 = var10 + var12;
                            var9_int = var9_int + var11;
                            var15 = var15 + ge.field_h;
                            if (var19 == 0) {
                              continue L27;
                            } else {
                              break L28;
                            }
                          } else {
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        }
                      }
                    }
                    decompiledRegionSelector0 = 6;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L33: {
            var9 = decompiledCaughtException;
            stackIn_86_0 = (RuntimeException) (var9);

            stackIn_86_1 = new StringBuilder().append("ca.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_87_0 = (RuntimeException) ((Object) stackIn_86_0);
              stackIn_87_1 = (StringBuilder) ((Object) stackIn_86_1);
              stackIn_87_2 = "null";
              break L33;
            } else {
              stackIn_87_0 = (RuntimeException) ((Object) stackIn_86_0);
              stackIn_87_1 = (StringBuilder) ((Object) stackIn_86_1);
              stackIn_87_2 = "{...}";
              break L33;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_87_0), stackIn_87_2 + ',' + param7 + ',' + param8 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  if (decompiledRegionSelector0 == 5) {
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

    final wd a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (null == this.field_c) {
          L0: {
            if (param0 >= 39) {
              break L0;
            } else {
              this.field_e = -112L;
              break L0;
            }
          }
          L1: {
            if (this.field_o == null) {
              if (!this.field_r.d(20)) {
                this.field_o = (fb) ((Object) this.field_r.a(255, this.field_u, 102, true, (byte) 0));
                break L1;
              } else {
                return null;
              }
            } else {
              break L1;
            }
          }
          if (!this.field_o.field_j) {
            L2: {
              L3: {
                var7 = this.field_o.e(125);
                var6 = var7;
                var5 = var6;
                var2 = var5;
                if (this.field_o instanceof si) {
                  break L3;
                } else {
                  try {
                    L4: {
                      if (var5 != null) {
                        this.field_c = new wd(var7, this.field_w, this.field_i);
                        break L4;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L5: {
                      var3 = decompiledCaughtException;
                      this.field_r.b(20);
                      this.field_c = null;
                      if (!this.field_r.d(20)) {
                        break L5;
                      } else {
                        this.field_o = null;
                        if (var4 != 0) {
                          break L5;
                        } else {
                          return null;
                        }
                      }
                    }
                    this.field_o = (fb) ((Object) this.field_r.a(255, this.field_u, 75, true, (byte) 0));
                    return null;
                  }
                  if (null != this.field_p) {
                    this.field_v.a(false, this.field_u, var7, this.field_p);
                    if (var4 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              try {
                L6: {
                  if (var5 != null) {
                    this.field_c = new wd(var7, this.field_w, this.field_i);
                    if ((this.field_c.field_l ^ -1) == (this.field_t ^ -1)) {
                      break L6;
                    } else {
                      throw new RuntimeException();
                    }
                  } else {
                    throw new RuntimeException();
                  }
                }
              } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                L7: {
                  var3 = decompiledCaughtException;
                  this.field_c = null;
                  if (this.field_r.d(20)) {
                    break L7;
                  } else {
                    this.field_o = (fb) ((Object) this.field_r.a(255, this.field_u, 91, true, (byte) 0));
                    if (var4 != 0) {
                      break L7;
                    } else {
                      return null;
                    }
                  }
                }
                this.field_o = null;
                return null;
              }
              break L2;
            }
            L8: {
              this.field_o = null;
              if (this.field_g != null) {
                this.field_s = new byte[this.field_c.field_e];
                break L8;
              } else {
                break L8;
              }
            }
            return this.field_c;
          } else {
            return null;
          }
        } else {
          return this.field_c;
        }
    }

    final byte[] b(int param0, int param1) {
        fb var3 = this.a(2, 0, param1);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.e(-81);
        var3.c(-19822);
        if (param0 >= -110) {
            return (byte[]) null;
        }
        return var4;
    }

    private final fb a(int param0, int param1, int param2) {
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        byte stackIn_81_0 = 0;
        byte stackIn_81_1 = 0;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        Object stackIn_95_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        byte stackOut_80_0;
        byte stackOut_80_1;
        Object var4 = null;
        byte[] var5 = null;
        int var6_int = 0;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        fb var11 = null;
        byte[] var12 = null;
        byte[] var17 = null;
        byte[] var26 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        L0: {
          var10 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (param0 == 2) {
            break L0;
          } else {
            this.field_w = 1;
            break L0;
          }
        }
        L1: {
          var11 = (fb) ((Object) this.field_q.a((byte) 119, (long)param2));
          var4 = var11;
          if (var11 == null) {
            break L1;
          } else {
            if (-1 != (param1 ^ -1)) {
              break L1;
            } else {
              if (var11.field_m) {
                break L1;
              } else {
                if (var11.field_j) {
                  var11.c(param0 + -19824);
                  var4 = null;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
          }
        }
        L2: {
          if (var4 != null) {
            break L2;
          } else {
            L3: {
              L4: {
                if (0 == param1) {
                  break L4;
                } else {
                  L5: {
                    if ((param1 ^ -1) == -2) {
                      break L5;
                    } else {
                      if (2 == param1) {
                        if (null == this.field_g) {
                          throw new RuntimeException();
                        } else {
                          if ((this.field_s[param2] ^ -1) != 0) {
                            throw new RuntimeException();
                          } else {
                            if (!this.field_r.a(param0 + 18)) {
                              var4 = this.field_r.a(this.field_u, param2, 82, false, (byte) 2);
                              if (var10 == 0) {
                                break L3;
                              } else {
                                break L5;
                              }
                            } else {
                              return null;
                            }
                          }
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                  if (this.field_g != null) {
                    var4 = this.field_v.a(param2, this.field_g, (byte) -127);
                    if (var10 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  } else {
                    throw new RuntimeException();
                  }
                }
              }
              L6: {
                if (this.field_g == null) {
                  break L6;
                } else {
                  if (0 != (this.field_s[param2] ^ -1)) {
                    var4 = this.field_v.a(this.field_g, 1, param2);
                    break L3;
                  } else {
                    break L6;
                  }
                }
              }
              if (!this.field_r.d(20)) {
                var4 = this.field_r.a(this.field_u, param2, 103, true, (byte) 2);
                if (var10 == 0) {
                  break L3;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
            this.field_q.a((ug) (var4), (long)param2, (byte) -36);
            break L2;
          }
        }
        if (!((fb) (var4)).field_j) {
          var17 = ((fb) (var4)).e(119);
          var12 = var17;
          var5 = var12;
          if (var4 instanceof si) {
            try {
              L7: {
                L8: {
                  if (var5 == null) {
                    break L8;
                  } else {
                    if (-3 <= (var17.length ^ -1)) {
                      break L8;
                    } else {
                      cl.field_f.reset();
                      cl.field_f.update(var5, 0, var17.length + -2);
                      var6_int = (int)cl.field_f.getValue();
                      if (var6_int != this.field_c.field_j[param2]) {
                        throw new RuntimeException();
                      } else {
                        L9: {
                          L10: {
                            if (null == this.field_c.field_n) {
                              break L10;
                            } else {
                              if (null == this.field_c.field_n[param2]) {
                                break L10;
                              } else {
                                var28 = this.field_c.field_n[param2];
                                var29 = ie.a(-68, var5, -2 + var17.length, 0);
                                var9 = 0;
                                L11: while (true) {
                                  if (var9 >= 64) {
                                    break L10;
                                  } else {
                                    stackOut_80_0 = var28[var9];
                                    stackIn_86_0 = stackOut_80_0;
                                    stackIn_81_0 = stackOut_80_0;
                                    stackOut_80_1 = var29[var9];
                                    stackIn_86_1 = stackOut_80_1;
                                    stackIn_81_1 = stackOut_80_1;
                                    if (var10 != 0) {
                                      break L9;
                                    } else {
                                      if (stackIn_81_0 != stackIn_81_1) {
                                        throw new RuntimeException();
                                      } else {
                                        var9++;
                                        if (var10 == 0) {
                                          continue L11;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          stackIn_86_0 = 255 & var5[var17.length + -1];
                          stackIn_86_1 = 65280 & var5[var17.length - 2] << -966258616;
                          break L9;
                        }
                        var7 = stackIn_86_0 + stackIn_86_1;
                        if ((var7 ^ -1) == (65535 & this.field_c.field_p[param2] ^ -1)) {
                          L12: {
                            if ((this.field_s[param2] ^ -1) == -2) {
                              break L12;
                            } else {
                              L13: {
                                if (0 == this.field_s[param2]) {
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              this.field_s[param2] = (byte) 1;
                              break L12;
                            }
                          }
                          L14: {
                            if (((fb) (var4)).field_m) {
                              break L14;
                            } else {
                              ((fb) (var4)).c(-19822);
                              break L14;
                            }
                          }
                          stackIn_95_0 = var4;
                          break L7;
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L15: {
                var6 = (Exception) (Object) decompiledCaughtException;
                this.field_s[param2] = (byte)-1;
                ((fb) (var4)).c(-19822);
                if (((fb) (var4)).field_m) {
                  if (!this.field_r.d(param0 + 18)) {
                    var4 = this.field_r.a(this.field_u, param2, 83, true, (byte) 2);
                    this.field_q.a((ug) (var4), (long)param2, (byte) -36);
                    break L15;
                  } else {
                    return null;
                  }
                } else {
                  break L15;
                }
              }
              return null;
            }
            return (fb) ((Object) stackIn_95_0);
          } else {
            try {
              L16: {
                L17: {
                  if (var5 == null) {
                    break L17;
                  } else {
                    if (-3 <= (var17.length ^ -1)) {
                      break L17;
                    } else {
                      cl.field_f.reset();
                      cl.field_f.update(var5, 0, -2 + var17.length);
                      var6_int = (int)cl.field_f.getValue();
                      if ((var6_int ^ -1) == (this.field_c.field_j[param2] ^ -1)) {
                        L18: {
                          L19: {
                            if (null == this.field_c.field_n) {
                              break L19;
                            } else {
                              if (this.field_c.field_n[param2] != null) {
                                var27 = this.field_c.field_n[param2];
                                var26 = ie.a(param0 + -109, var5, -2 + var17.length, 0);
                                var9 = 0;
                                L20: while (true) {
                                  if (-65 >= (var9 ^ -1)) {
                                    break L19;
                                  } else {
                                    stackIn_63_0 = var26[var9] ^ -1;

                                    stackIn_63_1 = var27[var9] ^ -1;

                                    if (var10 != 0) {
                                      decompiledRegionSelector0 = 1;
                                      break L16;
                                    } else {
                                      if (stackIn_63_0 != stackIn_63_1) {
                                        throw new RuntimeException();
                                      } else {
                                        var9++;
                                        if (var10 == 0) {
                                          continue L20;
                                        } else {
                                          break L19;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                this.field_r.field_b = 0;
                                this.field_r.field_a = 0;
                                break L18;
                              }
                            }
                          }
                          this.field_r.field_b = 0;
                          this.field_r.field_a = 0;
                          break L18;
                        }
                        decompiledRegionSelector0 = 0;
                        break L16;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L21: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                this.field_r.b(20);
                ((fb) (var4)).c(-19822);
                if (((fb) (var4)).field_m) {
                  if (!this.field_r.d(param0 + 18)) {
                    var4 = this.field_r.a(this.field_u, param2, param0 + 112, true, (byte) 2);
                    this.field_q.a((ug) (var4), (long)param2, (byte) -36);
                    break L21;
                  } else {
                    break L21;
                  }
                } else {
                  break L21;
                }
              }
              return null;
            }
            L22: {
              L23: {
                if (decompiledRegionSelector0 == 0) {
                  var5[var17.length + -2] = (byte)(this.field_c.field_p[param2] >>> 493083208);
                  var5[-1 + var17.length] = (byte)this.field_c.field_p[param2];
                  if (this.field_g == null) {
                    break L22;
                  } else {
                    this.field_v.a(false, param2, var17, this.field_g);
                    stackIn_63_0 = this.field_s[param2] ^ -1;
                    stackIn_63_1 = -2;
                    break L23;
                  }
                } else {
                  break L23;
                }
              }
              if (stackIn_63_0 == stackIn_63_1) {
                break L22;
              } else {
                this.field_s[param2] = (byte) 1;
                break L22;
              }
            }
            L24: {
              if (!((fb) (var4)).field_m) {
                ((fb) (var4)).c(-19822);
                break L24;
              } else {
                break L24;
              }
            }
            return (fb) (var4);
          }
        } else {
          return null;
        }
    }

    final void b(int param0) {
        fb discarded$2 = null;
        fb discarded$3 = null;
        ug var2 = null;
        int var3 = 0;
        int var4 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = MonkeyPuzzle2.field_F ? 1 : 0;
                    if (null == this.field_h) {
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
                    if (param0 == -1) {
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
                    if (null == this.a((byte) 53)) {
                        statePc = 7;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 7: {
                    return;
                }
                case 8: {
                    var2 = this.field_j.a((byte) -117);
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (var2 == null) {
                        statePc = 26;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var3 = (int)var2.field_a;
                    if (var4 != 0) {
                        statePc = 26;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (-1 < (var3 ^ -1)) {
                        statePc = 15;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if ((this.field_c.field_e ^ -1) >= (var3 ^ -1)) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (-1 == (this.field_c.field_m[var3] ^ -1)) {
                        statePc = 15;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var2.c(-19822);
                    if (var4 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (this.field_s[var3] != 0) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    discarded$2 = this.a(2, 1, var3);
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (-1 == this.field_s[var3]) {
                        statePc = 20;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 20: {
                    discarded$3 = this.a(2, 2, var3);
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    if (-2 == (this.field_s[var3] ^ -1)) {
                        statePc = 23;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var2.c(-19822);
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    var2 = this.field_j.d((byte) 63);
                    if (var4 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void d(int param0) {
        if (param0 != -1) {
            field_f = (le) null;
        }
        field_n = null;
        field_f = null;
    }

    final int a(int param0, int param1) {
        fb discarded$0 = null;
        fb var3 = (fb) ((Object) this.field_q.a((byte) 112, (long)param1));
        if (param0 >= -42) {
            discarded$0 = this.a(85, 123, 107);
        }
        if (var3 == null) {
            return 0;
        }
        return var3.a(true);
    }

    final void a(int param0) {
        if (!(this.field_g != null)) {
            return;
        }
        if (param0 != -1) {
            this.a(-68, -82);
        }
        this.field_m = true;
        if (null == this.field_h) {
            this.field_h = new pj();
        }
    }

    ca(int param0, gf param1, gf param2, wl param3, uj param4, int param5, byte[] param6, int param7, boolean param8) {
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        this.field_q = new cg(16);
        this.field_l = 0;
        this.field_j = new pj();
        this.field_e = 0L;
        try {
          L0: {
            L1: {
              L2: {
                this.field_g = param1;
                this.field_u = param0;
                if (this.field_g == null) {
                  break L2;
                } else {
                  this.field_d = true;
                  this.field_h = new pj();
                  if (!MonkeyPuzzle2.field_F) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.field_d = false;
              break L1;
            }
            L3: {
              stackIn_6_0 = this;

              if (!param8) {
                stackIn_7_0 = this;
                stackIn_7_1 = 0;
                break L3;
              } else {
                stackIn_7_0 = this;
                stackIn_7_1 = 1;
                break L3;
              }
            }
            L4: {
              ((ca) (this)).field_k = stackIn_7_1 != 0;
              this.field_t = param7;
              this.field_r = param3;
              this.field_v = param4;
              this.field_w = param5;
              this.field_i = param6;
              this.field_p = param2;
              if (null == this.field_p) {
                break L4;
              } else {
                this.field_o = (fb) ((Object) this.field_v.a(this.field_p, 1, this.field_u));
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var10 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var10);

            stackIn_12_1 = new StringBuilder().append("ca.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L6;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L7;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param4 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L8;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L9;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L9;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_13_0), stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_n = "Play the game without logging in just yet";
        field_f = new le(270, 70);
    }
}
