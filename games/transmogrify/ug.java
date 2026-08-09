/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug {
    static ti field_f;
    static int[] field_c;
    private int[] field_j;
    private int field_i;
    private int field_d;
    private int[] field_e;
    private int field_g;
    private int field_a;
    static int field_b;
    static int field_h;

    final static void b(boolean param0) {
        if (param0) {
          if (-1 > (eh.field_a ^ -1)) {
            if (!mg.field_d) {
              if (!dk.field_b) {
                if (!qj.b((byte) 92)) {
                  if (rh.field_t == null) {
                    rh.field_t = tl.a(bc.field_b, 36, new int[]{(eh.field_a << -1338186874) + qi.field_c.field_o}, 3, qf.field_e, vh.field_n, 65506, 29, hf.field_j);
                    sh.field_c = null;
                    return;
                  } else {
                    sh.field_c = null;
                    return;
                  }
                } else {
                  sh.field_c = null;
                  return;
                }
              } else {
                sh.field_c = null;
                return;
              }
            } else {
              sh.field_c = null;
              return;
            }
          } else {
            sh.field_c = null;
            return;
          }
        } else {
          return;
        }
    }

    private final void b(int param0) {
        int fieldTemp$0 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = Transmogrify.field_A ? 1 : 0;
                    fieldTemp$0 = this.field_i + 1;
                    this.field_i = this.field_i + 1;
                    this.field_g = this.field_g + fieldTemp$0;
                    var2 = param0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (256 > var2) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return;
                }
                case 3: {
                    var3 = this.field_j[var2];
                    if (var5 == 0) {
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
                    if ((2 & var2) == 0) {
                        statePc = 11;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (0 == (var2 & 1)) {
                        statePc = 9;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    this.field_d = this.field_d ^ this.field_d >>> 831279824;
                    if (var5 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    this.field_d = this.field_d ^ this.field_d << 242003714;
                    if (var5 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if ((var2 & 1) == 0) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    this.field_d = this.field_d ^ this.field_d >>> 1566330470;
                    if (var5 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    this.field_d = this.field_d ^ this.field_d << 245170285;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    this.field_d = this.field_d + this.field_j[255 & var2 - -128];
                    dupTemp$1 = this.field_d + this.field_j[vg.c(1020, var3) >> -761188798] - -this.field_g;
                    var4 = dupTemp$1;
                    this.field_j[var2] = dupTemp$1;
                    dupTemp$2 = var3 + this.field_j[vg.c(var4 >> -1867198904 >> -1313846750, 255)];
                    this.field_g = dupTemp$2;
                    this.field_e[var2] = dupTemp$2;
                    var2++;
                    if (var5 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(int param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var2;
        if (-1 == (this.field_a ^ -1)) {
          this.b(0);
          this.field_a = 256;
          var2 = -39 / ((11 - param0) / 54);
          fieldTemp$2 = this.field_a - 1;
          this.field_a = this.field_a - 1;
          return this.field_e[fieldTemp$2];
        } else {
          var2 = -39 / ((11 - param0) / 54);
          fieldTemp$3 = this.field_a - 1;
          this.field_a = this.field_a - 1;
          return this.field_e[fieldTemp$3];
        }
    }

    ug(int[] param0) {
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
                    var3 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_e = new int[256];
                        this.field_j = new int[256];
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
                        if (param0.length <= var2_int) {
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
                        this.field_e[var2_int] = param0[var2_int];
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
                        this.a(true);
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
                    stackIn_9_1 = new StringBuilder().append("ug.<init>(");
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
                    throw ch.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(byte param0) {
        if (param0 <= 94) {
            field_f = (ti) null;
            field_c = null;
            field_f = null;
            return;
        }
        field_c = null;
        field_f = null;
    }

    private final void a(boolean param0) {
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
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = Transmogrify.field_A ? 1 : 0;
                    if (param0) {
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
                    var3 = -1640531527;
                    var7 = -1640531527;
                    var4 = -1640531527;
                    var6 = -1640531527;
                    var8 = -1640531527;
                    var10 = -1640531527;
                    var9 = -1640531527;
                    var5 = -1640531527;
                    var2 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (4 <= var2) {
                        statePc = 21;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var3 = var3 ^ var4 << -2034127477;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
                    var4 = var4 ^ var5 >>> 512554882;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
                    var5 = var5 ^ var6 << -2030340216;
                    var8 = var8 + var5;
                    var6 = var6 + var7;
                    var6 = var6 ^ var7 >>> -1010064912;
                    var9 = var9 + var6;
                    var7 = var7 + var8;
                    var7 = var7 ^ var8 << 1201596682;
                    var10 = var10 + var7;
                    var8 = var8 + var9;
                    var8 = var8 ^ var9 >>> -1583053948;
                    var3 = var3 + var8;
                    var9 = var9 + var10;
                    var9 = var9 ^ var10 << -758434520;
                    var10 = var10 + var3;
                    var4 = var4 + var9;
                    var10 = var10 ^ var3 >>> -1157398231;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    var2++;
                    if (var11 != 0) {
                        statePc = 22;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (var11 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var2 = 0;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if ((var2 ^ -1) <= -257) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var6 = var6 + this.field_e[3 + var2];
                    var9 = var9 + this.field_e[var2 + 6];
                    var8 = var8 + this.field_e[var2 + 5];
                    var7 = var7 + this.field_e[4 + var2];
                    var5 = var5 + this.field_e[2 + var2];
                    var10 = var10 + this.field_e[7 + var2];
                    var4 = var4 + this.field_e[1 + var2];
                    var3 = var3 + this.field_e[var2];
                    var3 = var3 ^ var4 << -46797589;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> 1465481378;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
                    var5 = var5 ^ var6 << -1178978456;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> -1154249776;
                    var9 = var9 + var6;
                    var7 = var7 + var8;
                    var7 = var7 ^ var8 << 1280557386;
                    var10 = var10 + var7;
                    var8 = var8 + var9;
                    var8 = var8 ^ var9 >>> -915717020;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << -249297528;
                    var10 = var10 + var3;
                    var4 = var4 + var9;
                    var10 = var10 ^ var3 >>> 2003739529;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    this.field_j[var2] = var3;
                    this.field_j[var2 - -1] = var4;
                    this.field_j[var2 - -2] = var5;
                    this.field_j[3 + var2] = var6;
                    this.field_j[4 + var2] = var7;
                    this.field_j[var2 + 5] = var8;
                    this.field_j[var2 - -6] = var9;
                    this.field_j[7 + var2] = var10;
                    var2 += 8;
                    if (var11 != 0) {
                        statePc = 12;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (var11 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var2 = 0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if ((var2 ^ -1) > -257) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    this.b(0);
                    this.field_a = 256;
                    return;
                }
                case 14: {
                    var4 = var4 + this.field_j[1 + var2];
                    var10 = var10 + this.field_j[var2 - -7];
                    var7 = var7 + this.field_j[var2 + 4];
                    var3 = var3 + this.field_j[var2];
                    var9 = var9 + this.field_j[6 + var2];
                    var8 = var8 + this.field_j[5 + var2];
                    var5 = var5 + this.field_j[var2 + 2];
                    var6 = var6 + this.field_j[var2 - -3];
                    var3 = var3 ^ var4 << -142864757;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> -499508510;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
                    var5 = var5 ^ var6 << 1037602824;
                    var8 = var8 + var5;
                    var6 = var6 + var7;
                    var6 = var6 ^ var7 >>> -156107024;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << 42938026;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> -490659868;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << 172814728;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> 364873961;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    this.field_j[var2] = var3;
                    this.field_j[1 + var2] = var4;
                    this.field_j[2 + var2] = var5;
                    this.field_j[3 + var2] = var6;
                    this.field_j[var2 - -4] = var7;
                    this.field_j[var2 - -5] = var8;
                    this.field_j[6 + var2] = var9;
                    this.field_j[7 + var2] = var10;
                    var2 += 8;
                    if (var11 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    return;
                }
                case 16: {
                    if (var11 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    this.b(0);
                    this.field_a = 256;
                    return;
                }
                case 21: {
                    var2 = 0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if ((var2 ^ -1) <= -257) {
                        statePc = 44;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var6 = var6 + this.field_e[3 + var2];
                    var9 = var9 + this.field_e[var2 + 6];
                    var8 = var8 + this.field_e[var2 + 5];
                    var7 = var7 + this.field_e[4 + var2];
                    var5 = var5 + this.field_e[2 + var2];
                    var10 = var10 + this.field_e[7 + var2];
                    var4 = var4 + this.field_e[1 + var2];
                    var3 = var3 + this.field_e[var2];
                    var3 = var3 ^ var4 << -46797589;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> 1465481378;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
                    var5 = var5 ^ var6 << -1178978456;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> -1154249776;
                    var9 = var9 + var6;
                    var7 = var7 + var8;
                    var7 = var7 ^ var8 << 1280557386;
                    var10 = var10 + var7;
                    var8 = var8 + var9;
                    var8 = var8 ^ var9 >>> -915717020;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << -249297528;
                    var10 = var10 + var3;
                    var4 = var4 + var9;
                    var10 = var10 ^ var3 >>> 2003739529;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    this.field_j[var2] = var3;
                    this.field_j[var2 - -1] = var4;
                    this.field_j[var2 - -2] = var5;
                    this.field_j[3 + var2] = var6;
                    this.field_j[4 + var2] = var7;
                    this.field_j[var2 + 5] = var8;
                    this.field_j[var2 - -6] = var9;
                    this.field_j[7 + var2] = var10;
                    var2 += 8;
                    if (var11 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 24;
                    }
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
                    this.b(0);
                    this.field_a = 256;
                    return;
                }
                case 26: {
                    var4 = var4 + this.field_j[1 + var2];
                    var10 = var10 + this.field_j[var2 - -7];
                    var7 = var7 + this.field_j[var2 + 4];
                    var3 = var3 + this.field_j[var2];
                    var9 = var9 + this.field_j[6 + var2];
                    var8 = var8 + this.field_j[5 + var2];
                    var5 = var5 + this.field_j[var2 + 2];
                    var6 = var6 + this.field_j[var2 - -3];
                    var3 = var3 ^ var4 << -142864757;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> -499508510;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
                    var5 = var5 ^ var6 << 1037602824;
                    var8 = var8 + var5;
                    var6 = var6 + var7;
                    var6 = var6 ^ var7 >>> -156107024;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << 42938026;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> -490659868;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << 172814728;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> 364873961;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    this.field_j[var2] = var3;
                    this.field_j[1 + var2] = var4;
                    this.field_j[2 + var2] = var5;
                    this.field_j[3 + var2] = var6;
                    this.field_j[var2 - -4] = var7;
                    this.field_j[var2 - -5] = var8;
                    this.field_j[6 + var2] = var9;
                    this.field_j[7 + var2] = var10;
                    var2 += 8;
                    if (var11 == 0) {
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
                    if (var11 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    this.b(0);
                    this.field_a = 256;
                    return;
                }
                case 33: {
                    if (var11 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var2 = 0;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if ((var2 ^ -1) > -257) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    this.b(0);
                    this.field_a = 256;
                    return;
                }
                case 37: {
                    var4 = var4 + this.field_j[1 + var2];
                    var10 = var10 + this.field_j[var2 - -7];
                    var7 = var7 + this.field_j[var2 + 4];
                    var3 = var3 + this.field_j[var2];
                    var9 = var9 + this.field_j[6 + var2];
                    var8 = var8 + this.field_j[5 + var2];
                    var5 = var5 + this.field_j[var2 + 2];
                    var6 = var6 + this.field_j[var2 - -3];
                    var3 = var3 ^ var4 << -142864757;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> -499508510;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
                    var5 = var5 ^ var6 << 1037602824;
                    var8 = var8 + var5;
                    var6 = var6 + var7;
                    var6 = var6 ^ var7 >>> -156107024;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << 42938026;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> -490659868;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << 172814728;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> 364873961;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    this.field_j[var2] = var3;
                    this.field_j[1 + var2] = var4;
                    this.field_j[2 + var2] = var5;
                    this.field_j[3 + var2] = var6;
                    this.field_j[var2 - -4] = var7;
                    this.field_j[var2 - -5] = var8;
                    this.field_j[6 + var2] = var9;
                    this.field_j[7 + var2] = var10;
                    var2 += 8;
                    if (var11 == 0) {
                        statePc = 39;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    return;
                }
                case 39: {
                    if (var11 == 0) {
                        statePc = 35;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    this.b(0);
                    this.field_a = 256;
                    return;
                }
                case 44: {
                    var2 = 0;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if ((var2 ^ -1) > -257) {
                        statePc = 47;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    this.b(0);
                    this.field_a = 256;
                    return;
                }
                case 47: {
                    var4 = var4 + this.field_j[1 + var2];
                    var10 = var10 + this.field_j[var2 - -7];
                    var7 = var7 + this.field_j[var2 + 4];
                    var3 = var3 + this.field_j[var2];
                    var9 = var9 + this.field_j[6 + var2];
                    var8 = var8 + this.field_j[5 + var2];
                    var5 = var5 + this.field_j[var2 + 2];
                    var6 = var6 + this.field_j[var2 - -3];
                    var3 = var3 ^ var4 << -142864757;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> -499508510;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
                    var5 = var5 ^ var6 << 1037602824;
                    var8 = var8 + var5;
                    var6 = var6 + var7;
                    var6 = var6 ^ var7 >>> -156107024;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << 42938026;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> -490659868;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << 172814728;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> 364873961;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    this.field_j[var2] = var3;
                    this.field_j[1 + var2] = var4;
                    this.field_j[2 + var2] = var5;
                    this.field_j[3 + var2] = var6;
                    this.field_j[var2 - -4] = var7;
                    this.field_j[var2 - -5] = var8;
                    this.field_j[6 + var2] = var9;
                    this.field_j[7 + var2] = var10;
                    var2 += 8;
                    if (var11 == 0) {
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
                    if (var11 == 0) {
                        statePc = 45;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    this.b(0);
                    this.field_a = 256;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_f = new ti(540, 140);
        field_h = 0;
    }
}
