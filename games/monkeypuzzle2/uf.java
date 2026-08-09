/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf extends fg {
    private int field_g;
    private int field_j;
    static String field_c;
    private long[] field_i;
    static String field_k;
    static String field_e;
    private long field_d;
    private long field_h;
    private long field_f;

    public static void a(byte param0) {
        field_e = null;
        if (param0 >= -106) {
            field_k = (String) null;
            field_c = null;
            field_k = null;
            return;
        }
        field_c = null;
        field_k = null;
    }

    private final long b(int param0) {
        long stackIn_4_0 = 0L;
        long stackIn_6_0 = 0L;
        long stackIn_11_0 = 0L;
        long stackIn_13_0 = 0L;
        long stackIn_19_0 = 0L;
        long stackIn_21_0 = 0L;
        long stackIn_25_0 = 0L;
        long stackIn_27_0 = 0L;
        int statePc = 0;
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        int var8 = 0;
        int var9 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = MonkeyPuzzle2.field_F ? 1 : 0;
                    var2 = System.nanoTime();
                    var4 = var2 + -this.field_h;
                    this.field_h = var2;
                    if (-5000000000L < var4) {
                        statePc = 7;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var6 = (long)param0;
                    var8 = 1;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (this.field_g < var8) {
                        statePc = 5;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    stackIn_6_0 = var6 + this.field_i[(-var8 + this.field_j - -10) % 10];
                    stackIn_4_0 = stackIn_6_0;
                    if (var9 != 0) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var6 = stackIn_4_0;
                    var8++;
                    if (var9 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    stackIn_6_0 = var6 / (long)this.field_g;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    return stackIn_6_0;
                }
                case 7: {
                    if (-5000000001L < (var4 ^ -1L)) {
                        statePc = 14;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var6 = (long)param0;
                    var8 = 1;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (this.field_g < var8) {
                        statePc = 12;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_13_0 = var6 + this.field_i[(-var8 + this.field_j - -10) % 10];
                    stackIn_11_0 = stackIn_13_0;
                    if (var9 != 0) {
                        statePc = 13;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var6 = stackIn_11_0;
                    var8++;
                    if (var9 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_13_0 = var6 / (long)this.field_g;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    return stackIn_13_0;
                }
                case 14: {
                    this.field_i[this.field_j] = var4;
                    if (1 <= this.field_g) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    this.field_g = this.field_g + 1;
                    statePc = 22;
                    continue stateLoop;
                }
                case 16: {
                    this.field_j = (this.field_j - -1) % 10;
                    var6 = (long)param0;
                    var8 = 1;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (this.field_g < var8) {
                        statePc = 20;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackIn_21_0 = var6 + this.field_i[(-var8 + this.field_j - -10) % 10];
                    stackIn_19_0 = stackIn_21_0;
                    if (var9 != 0) {
                        statePc = 21;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var6 = stackIn_19_0;
                    var8++;
                    if (var9 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    stackIn_21_0 = var6 / (long)this.field_g;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    return stackIn_21_0;
                }
                case 22: {
                    this.field_j = (this.field_j - -1) % 10;
                    var6 = (long)param0;
                    var8 = 1;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    if (this.field_g < var8) {
                        statePc = 26;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    stackIn_27_0 = var6 + this.field_i[(-var8 + this.field_j - -10) % 10];
                    stackIn_25_0 = stackIn_27_0;
                    if (var9 != 0) {
                        statePc = 27;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var6 = stackIn_25_0;
                    var8++;
                    if (var9 == 0) {
                        statePc = 23;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackIn_27_0 = var6 / (long)this.field_g;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    return stackIn_27_0;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final long a(int param0) {
        this.field_d = this.field_d + this.b(0);
        if (!(this.field_d >= this.field_f)) {
            return (this.field_f - this.field_d) / 1000000L;
        }
        int var2 = -90 % ((34 - param0) / 38);
        return 0L;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 76 % ((param0 - -1) / 36);
        int var4 = param2 >> -398340353 & -1 + param1;
        return var4 + (param2 - -(param2 >>> -1780228321)) % param1;
    }

    final int a(long param0, byte param1) {
        int var4;
        int var5;
        int stackIn_5_0 = 0;
        int stackIn_16_0 = 0;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param1 == 37) {
          if ((this.field_f ^ -1L) >= (this.field_d ^ -1L)) {
            var4 = 0;
            L0: while (true) {
              this.field_f = this.field_f + param0;
              var4++;
              stackIn_16_0 = var4;
              L1: while (true) {
                L2: {
                  if (stackIn_16_0 >= 10) {
                    break L2;
                  } else {
                    if ((this.field_d ^ -1L) < (this.field_f ^ -1L)) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
                stackIn_16_0 = (this.field_f < this.field_d ? -1 : (this.field_f == this.field_d ? 0 : 1));

                if (var5 != 0) {
                  continue L1;
                } else {
                  if (stackIn_16_0 < 0) {
                    this.field_f = this.field_d;
                    return var4;
                  } else {
                    return var4;
                  }
                }
              }
            }
          } else {
            this.field_h = this.field_h + (-this.field_d + this.field_f);
            this.field_d = this.field_d + (-this.field_d + this.field_f);
            this.field_f = this.field_f + param0;
            return 1;
          }
        } else {
          field_k = (String) null;
          if ((this.field_f ^ -1L) >= (this.field_d ^ -1L)) {
            var4 = 0;
            L3: while (true) {
              this.field_f = this.field_f + param0;
              var4++;
              stackIn_5_0 = var4;
              L4: while (true) {
                L5: {
                  if (stackIn_5_0 >= 10) {
                    break L5;
                  } else {
                    if ((this.field_d ^ -1L) < (this.field_f ^ -1L)) {
                      continue L3;
                    } else {
                      break L5;
                    }
                  }
                }
                stackIn_5_0 = (this.field_f < this.field_d ? -1 : (this.field_f == this.field_d ? 0 : 1));

                if (var5 != 0) {
                  continue L4;
                } else {
                  if (stackIn_5_0 >= 0) {
                    return var4;
                  } else {
                    this.field_f = this.field_d;
                    return var4;
                  }
                }
              }
            }
          } else {
            this.field_h = this.field_h + (-this.field_d + this.field_f);
            this.field_d = this.field_d + (-this.field_d + this.field_f);
            this.field_f = this.field_f + param0;
            return 1;
          }
        }
    }

    final static java.net.URL a(java.applet.Applet param0, byte param1, java.net.URL param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_2_0 = null;
        java.net.URL stackIn_12_0 = null;
        Object stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        Object stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = null;
            if (param1 > 74) {
              L1: {
                if (e.field_c == null) {
                  break L1;
                } else {
                  if (!e.field_c.equals(param0.getParameter("settings"))) {
                    var3 = e.field_c;
                    var4 = var3;
                    var4 = var3;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                var4 = null;
                if (null == kd.field_e) {
                  break L2;
                } else {
                  if (!kd.field_e.equals(param0.getParameter("session"))) {
                    var4 = kd.field_e;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              stackIn_12_0 = fc.a((String) (var3), param2, (String) (var4), -1, 35);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (java.net.URL) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = var3;

            stackIn_15_1 = new StringBuilder().append("uf.H(");

            if (param0 == null) {
              stackIn_16_0 = stackIn_15_0;
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = stackIn_15_0;
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');

            if (param2 == null) {

              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {

              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_12_0;
        }
    }

    final void a(boolean param0) {
        L0: {
          if (this.field_d < this.field_f) {
            this.field_d = this.field_d + (-this.field_d + this.field_f);
            break L0;
          } else {
            break L0;
          }
        }
        if (!param0) {
          return;
        } else {
          this.field_h = 0L;
          return;
        }
    }

    uf() {
        this.field_g = 1;
        this.field_h = 0L;
        this.field_i = new long[10];
        this.field_j = 0;
        this.field_f = 0L;
        this.field_d = 0L;
        this.field_d = System.nanoTime();
        this.field_f = System.nanoTime();
    }

    static {
        field_c = "Cancel";
        field_e = "Not yet achieved";
        field_k = "To Customer Support";
    }
}
