/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf {
    private int field_s;
    int[] field_q;
    int field_b;
    int field_A;
    boolean field_n;
    static um field_j;
    int field_v;
    static boolean field_i;
    private int field_l;
    int field_f;
    boolean field_g;
    int field_r;
    int[] field_e;
    int field_w;
    boolean field_x;
    static String field_o;
    byte[][] field_C;
    int field_y;
    int field_a;
    int field_D;
    private boolean[] field_h;
    int field_u;
    static int field_p;
    boolean field_E;
    int[] field_z;
    static String field_F;
    static String[][] field_d;
    int field_B;
    int field_m;
    int field_k;
    String[] field_c;
    int[] field_G;
    int[] field_t;

    private final void a(int param0, int param1, byte param2) {
        int var5 = 0;
        int var4;
        int var6;
        int var7;
        int var4Lifetime1;
        var6 = Virogrid.field_F ? 1 : 0;
        this.field_C = new byte[param0][param1];
        if (param2 != -108) {
          this.field_G = (int[]) null;
        }
        for (var4 = 0; var4 < param0; var4++) {
          for (var5 = 0; var5 < param1; var5++) {
            this.field_C[var4][var5] = (byte)-1;
          }
        }
        this.field_C[0][0] = (byte) 0;
        this.field_C[0][param1 - 1] = (byte) 1;
        this.field_C[param0 - 1][0] = (byte) 1;
        this.field_C[param0 - 1][-1 + param1] = (byte) 0;
        this.field_z = new int[2];
        this.field_h = new boolean[2];
        var7 = 0;
        var4Lifetime1 = var7;
        while (this.field_z.length > var7) {
          this.field_z[var7] = 2;
          var7++;
        }
        this.field_a = -1;
        this.field_B = -1;
        this.field_k = -1;
        this.field_x = false;
        this.field_m = -1;
        this.field_n = false;
        this.field_g = false;
        this.field_w = -1;
    }

    final boolean a(byte param0, int param1, int param2, byte param3) {
        if (this.field_C.length > param2 &&
          param2 >= 0) {
          if (param0 != 127) {
            this.field_g = true;
          }
          if (param1 >= this.field_C[0].length) {
            return false;
          }
          if (param1 < 0) {
            return false;
          }
          if (param3 != this.field_C[param2][param1]) {
            return false;
          }
          return true;
        }
        return false;
    }

    final void d(int param0, int param1) {
        this.field_A = param1;
        this.field_E = true;
        if (param0 > -16) {
          jc var4 = (jc) null;
          this.a((jc) null, (byte) -59);
        }
    }

    final void b(int param0) {
        int var3 = Virogrid.field_F ? 1 : 0;
        if (this.field_E) {
          throw new IllegalStateException();
        }
        this.field_u = this.field_u + 1;
        if (param0 > -96) {
          field_i = true;
        }
        do {
          this.field_A = (this.field_A + 1) % 2;
        } while ((1 << this.field_A & this.field_r) != 0);
    }

    final int a(int param0, int param1, byte param2, int param3, int param4) {
        int var6;
        int var7;
        jc var8;
        if (param2 != 99) {
          var8 = (jc) null;
          this.a((jc) null, (byte) -67);
        }
        if (param3 < this.field_C.length &&
          param3 >= 0) {
          if (this.field_C[0].length > param0 &&
            param0 >= 0) {
            if (this.field_C[param3][param0] == -1) {
              var6 = Math.abs(-param1 + param3);
              var7 = Math.abs(param0 - param4);
              if (var6 <= 1 &&
                1 >= var7) {
                return 0;
              }
              if (var6 == 2 &&
                2 == var7 ||
                var6 == 0 &&
                var7 == 2 ||
                2 == var6 &&
                0 == var7) {
                return 1;
              }
            }
            return -1;
          }
          return -1;
        }
        return -1;
    }

    public static void a(int param0) {
        field_j = null;
        field_F = null;
        field_o = null;
        field_d = (String[][]) null;
        if (param0 <= 66) {
          uf.a(-93);
        }
    }

    private final int a(boolean param0, int param1, byte param2, int param3, int param4, boolean param5, int param6, int param7) {
        int statePc = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var17 = Virogrid.field_F ? 1 : 0;
                    var9 = this.a(param1, param7, (byte) 99, param6, param3);
                    var10 = 0;
                    if (var9 == 0) {
                        statePc = 23;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (1 == var9) {
                        /* Inlined CFG state: 3. */
                        {
                            if (param0) {
                                /* Inlined CFG state: 22. */
                                {
                                    this.field_C[param7][param3] = (byte)-1;
                                    this.field_C[param6][param1] = (byte)param2;
                                    statePc = 25;
                                    continue stateLoop;
                                }
                            } else {
                                /* Inlined CFG state: 4. */
                                {
                                    var11 = -1 + param6;
                                    if (var11 >= 0) {
                                        statePc = 6;
                                    } else {
                                        statePc = 5;
                                    }
                                    continue stateLoop;
                                }
                            }
                        }
                    } else {
                        /* Inlined CFG state: 2. */
                        {
                            return -1;
                        }
                    }
                }
                case 5: {
                    var11 = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (param4 > 38) {
                        statePc = 8;
                        continue stateLoop;
                    } else {
                        /* Inlined CFG state: 7. */
                        {
                            this.a((byte) 123);
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                }
                case 8: {
                    var12 = 1 + param6;
                    if (var12 < this.field_C.length) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var12 = -1 + this.field_C.length;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    var13 = -1 + param1;
                    if (var13 >= 0) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var13 = 0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    var14 = param1 + 1;
                    if (var14 >= this.field_C[0].length) {
                        statePc = 14;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var14 = this.field_C[0].length - 1;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    var15 = var11;
                    if (var12 < var15) {
                        statePc = 53;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var16 = var13;
                    if (var16 <= var14) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var15++;
                    statePc = 37;
                    continue stateLoop;
                }
                case 18: {
                    if (this.field_C[var15][var16] == -param2 + 1) {
                        /* Inlined CFG state: 20. */
                        {
                            var10++;
                            if (param0) {
                                statePc = 46;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        }
                    } else {
                        /* Inlined CFG state: 19. */
                        {
                            var16++;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                }
                case 23: {
                    var10++;
                    if (!param0) {
                        statePc = 25;
                        continue stateLoop;
                    } else {
                        /* Inlined CFG state: 24. */
                        {
                            this.field_C[param6][param1] = (byte)param2;
                            statePc = 25;
                            continue stateLoop;
                        }
                    }
                }
                case 25: {
                    var11 = -1 + param6;
                    if (var11 >= 0) {
                        statePc = 27;
                        continue stateLoop;
                    } else {
                        /* Inlined CFG state: 26. */
                        {
                            var11 = 0;
                            statePc = 27;
                            continue stateLoop;
                        }
                    }
                }
                case 27: {
                    if (param4 > 38) {
                        statePc = 29;
                        continue stateLoop;
                    } else {
                        /* Inlined CFG state: 28. */
                        {
                            this.a((byte) 123);
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                }
                case 29: {
                    var12 = 1 + param6;
                    if (var12 < this.field_C.length) {
                        statePc = 31;
                        continue stateLoop;
                    } else {
                        /* Inlined CFG state: 30. */
                        {
                            var12 = -1 + this.field_C.length;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                }
                case 31: {
                    var13 = -1 + param1;
                    if (var13 >= 0) {
                        statePc = 33;
                        continue stateLoop;
                    } else {
                        /* Inlined CFG state: 32. */
                        {
                            var13 = 0;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                }
                case 33: {
                    var14 = param1 + 1;
                    if (var14 >= this.field_C[0].length) {
                        /* Inlined CFG state: 35. */
                        {
                            var14 = this.field_C[0].length - 1;
                            statePc = 36;
                            continue stateLoop;
                        }
                    } else {
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 36: {
                    var15 = var11;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (var12 < var15) {
                        statePc = 53;
                        continue stateLoop;
                    } else {
                        /* Inlined CFG state: 38. */
                        {
                            var16 = var13;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                }
                case 39: {
                    if (var16 <= var14) {
                        /* Inlined CFG state: 41. */
                        {
                            if (this.field_C[var15][var16] == -param2 + 1) {
                                /* Inlined CFG state: 44. */
                                {
                                    var10++;
                                    if (param0) {
                                        statePc = 46;
                                    } else {
                                        statePc = 47;
                                    }
                                    continue stateLoop;
                                }
                            } else {
                                statePc = 51;
                                continue stateLoop;
                            }
                        }
                    } else {
                        /* Inlined CFG state: 40. */
                        {
                            var15++;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                }
                case 46: {
                    this.field_C[var15][var16] = (byte)param2;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    if (param5) {
                        /* Inlined CFG state: 50. */
                        {
                            var10++;
                            statePc = 51;
                            continue stateLoop;
                        }
                    } else {
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 51: {
                    var16++;
                    statePc = 39;
                    continue stateLoop;
                }
                case 53: {
                    return var10;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final boolean a(int param0, int param1) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var12;
        jc var13;
        int[] var14;
        int var6Lifetime1;
        int var7Lifetime1;
        var12 = Virogrid.field_F ? 1 : 0;
        if (param1 > -22) {
          var13 = (jc) null;
          this.a((jc) null, (byte) -15);
        }
        var14 = new int[]{-1, -1, -1, 0, 0, 1, 1, 1, 2, 2, 2, 0, 0, -2, -2, -2};
        var4 = new int[]{-1, 0, 1, -1, 1, -1, 0, 1, 0, -2, 2, -2, 2, -2, 0, 2};
        var5 = 1;
        var6 = 0;
        L2: while (true) {
          if (this.field_C.length > var6) {
            for (var7 = 0; var7 < this.field_C[0].length; var7++) {
              if (this.field_C[var6][var7] == -1) {
                var5 = 0;
                break L2;
              }
            }
            var6++;
            continue;
          }
          break;
        }
        if (var5 != 0) {
          return false;
        }
        var8 = 0;
        for (var9 = 0; var9 < this.field_C.length; var9++) {
          for (var10 = 0; this.field_C[0].length > var10; var10++) {
            if (~param0 == ~this.field_C[var9][var10]) {
              var8++;
              for (var11 = 0; var11 < var14.length; var11++) {
                var6Lifetime1 = var14[var11] + var9;
                var7Lifetime1 = var4[var11] + var10;
                if (var6Lifetime1 >= 0 &&
                  this.field_C.length > var6Lifetime1 &&
                  var7Lifetime1 >= 0 &&
                  this.field_C[0].length > var7Lifetime1 &&
                  this.field_C[var6Lifetime1][var7Lifetime1] == -1) {
                  return false;
                }
              }
            }
          }
        }
        return !(var8 <= 0);
    }

    private final void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var11 = 0;
        int[] var7_ref_int__;
        int var7;
        int[] var8;
        int[] var9;
        int[] var10;
        int var12;
        int[] var13;
        var12 = Virogrid.field_F ? 1 : 0;
        if (this.field_f > 0 &&
          param1 < this.field_l) {
          return;
        }
        if (this.field_f > 0 &&
          this.field_l < param1) {
          this.field_f = 0;
        }
        if (this.field_f >= this.field_e.length) {
          var13 = new int[this.field_e.length * 2];
          var7_ref_int__ = var13;
          var8 = new int[this.field_e.length * 2];
          var9 = new int[2 * this.field_e.length];
          var10 = new int[2 * this.field_e.length];
          for (var11 = 0; var11 < this.field_e.length; var11++) {
            var13[var11] = this.field_e[var11];
            var8[var11] = this.field_G[var11];
            var9[var11] = this.field_q[var11];
            var10[var11] = this.field_t[var11];
          }
          this.field_t = var10;
          this.field_q = var9;
          this.field_G = var8;
          this.field_e = var7_ref_int__;
        }
        this.field_e[this.field_f] = param0;
        var7 = 55 / ((43 - param3) / 48);
        this.field_G[this.field_f] = param5;
        this.field_q[this.field_f] = param2;
        this.field_t[this.field_f] = param4;
        this.field_l = param1;
        this.field_f = this.field_f + 1;
    }

    final void c(int param0, int param1) {
        int var3;
        this.field_n = false;
        this.field_x = false;
        var3 = param0;
        if (var3 == 1) {
          this.field_x = true;
        } else {
          if (var3 == 2) {
            this.field_n = true;
          }
        }
        if (param1 != 2) {
          this.d(-64, 101);
        }
    }

    final boolean c(int param0) {
        int var3 = 0;
        int var4 = 0;
        byte dupTemp$0 = 0;
        boolean stackIn_22_1 = false;
        int var2;
        int var5;
        int var2Lifetime1;
        var5 = Virogrid.field_F ? 1 : 0;
        if (this.field_E) {
          throw new IllegalStateException();
        }
        for (var2 = 0; var2 < this.field_z.length; var2++) {
          this.field_z[var2] = 0;
        }
        var2Lifetime1 = 1;
        if (param0 != 20602) {
          this.field_y = -14;
        }
        for (var3 = 0; this.field_C.length > var3; var3++) {
          for (var4 = 0; var4 < this.field_C[0].length; var4++) {
            if (this.field_C[var3][var4] != -1) {
              dupTemp$0 = this.field_C[var3][var4];
              this.field_z[dupTemp$0] = this.field_z[dupTemp$0] + 1;
            } else {
              var2Lifetime1 = 0;
            }
          }
        }
        stackIn_22_1 = (var2Lifetime1 != 0);
        this.field_n = stackIn_22_1;
        if (var2Lifetime1 != 0) {
          if (this.field_z[0] > this.field_z[1]) {
            this.d(-124, 0);
          } else {
            if (this.field_z[1] > this.field_z[0]) {
              this.d(param0 - 20709, 1);
            } else {
              this.d(-35, -1);
            }
          }
          return true;
        }
        if (this.field_z[0] == 0) {
          this.field_x = true;
          this.d(-101, 1);
          return true;
        }
        if (this.field_z[1] != 0) {
          return false;
        }
        this.field_x = true;
        this.d(-38, 0);
        return true;
    }

    final void a(jc param0, byte param1) {
        int var4 = 0;
        int var5 = 0;
        int var3_int = 0;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          if (param1 <= 34) {
            uf.a(-104);
          }
          var3_int = param0.g(11132);
          if ((var3_int & 2) != 0) {
            for (var4 = 0; var4 < this.field_C.length; var4++) {
              for (var5 = 0; this.field_C[0].length > var5; var5++) {
                this.field_C[var4][var5] = param0.a((byte) -101);
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("uf.S(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte param0) {
        int var4 = 0;
        byte dupTemp$0 = 0;
        int var2;
        int var3;
        int var5;
        boolean stackIn_17_1 = false;
        int var2Lifetime1;
        int var3Lifetime1;
        var5 = Virogrid.field_F ? 1 : 0;
        for (var2 = 0; var2 < this.field_z.length; var2++) {
          this.field_z[var2] = 0;
        }
        var2Lifetime1 = 1;
        for (var3 = 0; var3 < this.field_C.length; var3++) {
          for (var4 = 0; this.field_C[0].length > var4; var4++) {
            if (this.field_C[var3][var4] != -1) {
              dupTemp$0 = this.field_C[var3][var4];
              this.field_z[dupTemp$0] = this.field_z[dupTemp$0] + 1;
            } else {
              var2Lifetime1 = 0;
            }
          }
        }
        stackIn_17_1 = (var2Lifetime1 != 0);
        this.field_n = stackIn_17_1;
        if (var2Lifetime1 == 0) {
          if (0 != this.field_z[0]) {
            if (this.field_z[1] == 0) {
              this.field_x = true;
            }
          } else {
            this.field_x = true;
          }
        }
        var3Lifetime1 = 44 / ((-11 - param0) / 62);
    }

    final int a(int param0, int param1, byte param2, int param3, int param4, int param5) {
        int var15 = 0;
        byte dupTemp$0 = 0;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13_int;
        int[] var13;
        int var14;
        int var16;
        int[] var17;
        int[] var18;
        int var13_intLifetime1;
        int var14Lifetime1;
        int var14Lifetime1Lifetime1;
        var16 = Virogrid.field_F ? 1 : 0;
        if (this.field_E) {
          throw new IllegalStateException();
        }
        var7 = this.a(param5, param0, (byte) 99, param4, param1);
        if (var7 != 0) {
          if (var7 != 1) {
            return 0;
          }
          this.field_C[param4][param5] = (byte)param3;
          this.field_C[param0][param1] = (byte)-1;
        } else {
          this.field_C[param4][param5] = (byte)param3;
          this.field_h[param3] = true;
        }
        if (param2 != 119) {
          return -27;
        }
        var8 = param4 - 1;
        if (var8 < 0) {
          var8 = 0;
        }
        var9 = 1 + param4;
        if (var9 >= this.field_C.length) {
          var9 = this.field_C.length - 1;
        }
        var10 = param5 - 1;
        if (0 > var10) {
          var10 = 0;
        }
        var11 = 1 + param5;
        if (var11 >= this.field_C[0].length) {
          var11 = -1 + this.field_C[0].length;
        }
        var12 = 0;
        for (var13_int = var8; var13_int <= var9; var13_int++) {
          for (var14 = var10; var11 >= var14; var14++) {
            if (~(-param3 + 1) == ~this.field_C[var13_int][var14]) {
              var12++;
              this.field_C[var13_int][var14] = (byte)param3;
            }
          }
        }
        if (this.a(-param3 + 1, param2 ^ -88)) {
          this.field_g = true;
          for (var13_intLifetime1 = 0; var13_intLifetime1 < this.field_C.length; var13_intLifetime1++) {
            for (var14Lifetime1 = 0; this.field_C[0].length > var14Lifetime1; var14Lifetime1++) {
              if (this.field_C[var13_intLifetime1][var14Lifetime1] == -1) {
                this.field_C[var13_intLifetime1][var14Lifetime1] = (byte)param3;
              }
            }
          }
          var18 = new int[2];
          var17 = var18;
          var13 = var17;
          for (var14Lifetime1Lifetime1 = 0; var14Lifetime1Lifetime1 < this.field_C.length; var14Lifetime1Lifetime1++) {
            for (var15 = 0; this.field_C[0].length > var15; var15++) {
              if (this.field_C[var14Lifetime1Lifetime1][var15] >= 0) {
                dupTemp$0 = this.field_C[var14Lifetime1Lifetime1][var15];
                var13[dupTemp$0] = var13[dupTemp$0] + 1;
              }
            }
          }
          if (var13[1 - param3] < var18[param3]) {
          }
        }
        this.field_a = param1;
        this.field_B = param3;
        this.field_w = param5;
        this.field_m = param4;
        this.field_k = param0;
        return var12;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (this.a(param5, param4, (byte) 99, param1, param2) == -1) {
          return false;
        }
        if (param0 != this.field_C[param4][param2]) {
          return false;
        }
        if (param3 != 2) {
          this.field_w = 30;
          return true;
        }
        return true;
    }

    final void a(int param0, int param1, int param2) {
        if (param2 != 21428) {
          this.field_a = 70;
        }
        this.field_A = param0;
        this.field_u = param1;
    }

    final void d(int param0) {
        this.a(this.field_C.length, this.field_C[0].length, (byte) -108);
        this.field_E = false;
        this.field_r = 0;
        this.field_D = param0;
        int var2 = this.field_A;
        if (var2 != 0 &&
          1 != var2) {
          var2 = this.field_v;
        }
        int localTemp$0 = var2 == 1 ? 0 : 1;
        var2 = localTemp$0;
        this.field_v = localTemp$0;
        this.a(var2, 0, param0 + 21428);
    }

    final void a(boolean[][] param0, int param1, byte param2) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var11 = 0;
        int[] var12 = null;
        var11 = Virogrid.field_F ? 1 : 0;
        try {
          var12 = new int[]{-1, -1, -1, 0, 0, 1, 1, 1, 2, 2, 2, 0, 0, -2, -2, -2};
          var5 = new int[]{-1, 0, 1, -1, 1, -1, 0, 1, 0, -2, 2, -2, 2, -2, 0, 2};
          if (param2 != 14) {
            this.a(59, 84, 4, 79, -14, 66);
          }
          for (var8 = 0; this.field_C.length > var8; var8++) {
            for (var9 = 0; this.field_C[0].length > var9; var9++) {
              param0[var8][var9] = false;
              if (~param1 == ~this.field_C[var8][var9]) {
                for (var10 = 0; var12.length > var10; var10++) {
                  var6 = var8 + var12[var10];
                  var7 = var5[var10] + var9;
                  if (var6 >= 0 &&
                    var6 < this.field_C.length &&
                    var7 >= 0 &&
                    this.field_C[0].length > var7 &&
                    -1 == this.field_C[var6][var7]) {
                    param0[var8][var9] = true;
                    break;
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_24_0 = var4;
          stackIn_24_1 = new StringBuilder().append("uf.P(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void b(int param0, int param1) {
        int var18 = 0;
        int[] var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var19;
        int var20;
        int[] var21;
        int var22;
        int[] var24;
        byte[][] var27;
        int var14Lifetime1;
        int var15Lifetime1;
        var20 = Virogrid.field_F ? 1 : 0;
        var21 = new int[]{-1, -1, -1, 0, 0, 1, 1, 1, 2, 2, 2, 0, 0, -2, -2, -2};
        var24 = var21;
        this.field_e = new int[this.field_C.length * this.field_C[param1].length];
        var4 = new int[]{-1, 0, 1, -1, 1, -1, 0, 1, 0, -2, 2, -2, 2, -2, 0, 2};
        this.field_G = new int[this.field_C.length * this.field_C[0].length];
        this.field_q = new int[this.field_C[0].length * this.field_C.length];
        this.field_t = new int[this.field_C[0].length * this.field_C.length];
        this.field_f = 0;
        this.field_l = -2147483648;
        var5 = (byte)this.field_A;
        if (param0 == 1) {
          for (var6 = 0; this.field_C.length > var6; var6++) {
            for (var7 = 0; this.field_C[0].length > var7; var7++) {
              if (~this.field_C[var6][var7] == ~var5) {
                var21 = var24;
                for (var10 = 0; var21.length > var10; var10++) {
                  var8 = var21[var10] + var6;
                  var9 = var7 + var4[var10];
                  if (this.a(var5, var8, var7, 2, var6, var9)) {
                    this.b(var8, 1, var6, -81, var7, var9);
                  }
                }
              }
            }
          }
        } else if (2 == param0) {
          for (var6 = 0; var6 < this.field_C.length; var6++) {
            for (var7 = 0; var7 < this.field_C[0].length; var7++) {
              if (var5 == this.field_C[var6][var7]) {
                for (var10 = 0; var10 < var21.length; var10++) {
                  var8 = var6 + var21[var10];
                  var9 = var4[var10] + var7;
                  if (this.a(var5, var8, var7, 2, var6, var9)) {
                    var11 = this.a(false, var9, (byte) var5, var7, 120, false, var8, var6);
                    this.b(var8, var11, var6, param1 + 103, var7, var9);
                  }
                }
              }
            }
          }
        } else {
          if (param0 == 3) {
            var27 = new byte[this.field_C.length][this.field_C[0].length];
            for (var7 = 0; var7 < this.field_C.length; var7++) {
              for (var8 = 0; var8 < this.field_C[0].length; var8++) {
                var27[var7][var8] = this.field_C[var7][var8];
              }
            }
            for (var7 = 0; this.field_C.length > var7; var7++) {
              for (var8 = 0; this.field_C[0].length > var8; var8++) {
                if (var5 == this.field_C[var7][var8]) {
                  for (var11 = 0; var24.length > var11; var11++) {
                    var9 = var7 + var24[var11];
                    var10 = var8 + var4[var11];
                    if (this.a(var5, var9, var8, 2, var7, var10)) {
                      var12 = this.a(true, var10, (byte) var5, var8, param1 + 69, false, var9, var7);
                      var13 = -9;
                      for (var14 = 0; var14 < this.field_C.length; var14++) {
                        for (var15 = 0; var15 < this.field_C[0].length; var15++) {
                          if (~(1 - var5) == ~this.field_C[var14][var15]) {
                            for (var18 = 0; var18 < var24.length; var18++) {
                              var17 = var15 + var4[var18];
                              var16 = var14 + var24[var18];
                              if (this.a(-var5 + 1, var16, var15, 2, var14, var17)) {
                                var19 = this.a(false, var17, (byte)(-var5 + 1), var15, 115, false, var16, var14);
                                if (var19 > var13) {
                                  var13 = var19;
                                }
                              }
                            }
                          }
                        }
                      }
                      var12 = var12 - var13;
                      this.b(var9, var12, var7, param1 ^ -65, var8, var10);
                      for (var14Lifetime1 = 0; this.field_C.length > var14Lifetime1; var14Lifetime1++) {
                        var22 = 0;
                        var15Lifetime1 = var22;
                        while (this.field_C[0].length > var22) {
                          this.field_C[var14Lifetime1][var22] = var27[var14Lifetime1][var22];
                          var22++;
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

    uf(int param0, String[] param1, int param2, int param3) {
        this.field_h = new boolean[2];
        this.field_B = -1;
        this.field_m = -1;
        this.field_k = -1;
        this.field_w = -1;
        this.field_a = -1;
        try {
          this.field_y = param0;
          if (param1.length != 2) {
            throw new RuntimeException();
          }
          this.field_v = param2;
          this.field_A = param2;
          this.field_c = param1;
          this.field_s = param3;
          this.a(ra.field_a[this.field_s], ra.field_a[this.field_s], (byte) -108);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "uf.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_i = true;
        field_o = "All games";
        field_F = "Achievements";
    }
}
