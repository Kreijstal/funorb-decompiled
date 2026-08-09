/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class o extends wj {
    static int field_m;
    private long field_e;
    private long field_i;
    static String field_g;
    static boolean field_l;
    private long[] field_j;
    private int field_h;
    private long field_k;
    private int field_f;

    final long b(int param0) {
        if (param0 != -31887) {
            this.field_k = 83L;
            this.field_e = this.field_e + this.a((byte) -63);
            if (!((this.field_e ^ -1L) <= (this.field_k ^ -1L))) {
                return (-this.field_e + this.field_k) / 1000000L;
            }
            return 0L;
        }
        this.field_e = this.field_e + this.a((byte) -63);
        if (!((this.field_e ^ -1L) <= (this.field_k ^ -1L))) {
            return (-this.field_e + this.field_k) / 1000000L;
        }
        return 0L;
    }

    final static String a(byte param0, int param1, int param2) {
        if (param0 != 85) {
          o.c((byte) -64);
          return param1 + "/" + param2;
        } else {
          return param1 + "/" + param2;
        }
    }

    private final long a(byte param0) {
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        int var8 = 0;
        int var9 = 0;
        long stackIn_6_0 = 0L;
        long stackIn_8_0 = 0L;
        long stackIn_12_0 = 0L;
        long stackIn_14_0 = 0L;
        long stackIn_21_0 = 0L;
        long stackIn_23_0 = 0L;
        long stackIn_27_0 = 0L;
        long stackIn_29_0 = 0L;
        long stackIn_36_0 = 0L;
        long stackIn_38_0 = 0L;
        long stackIn_42_0 = 0L;
        long stackIn_44_0 = 0L;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = fleas.field_A ? 1 : 0;
                    var2 = System.nanoTime();
                    var4 = -this.field_i + var2;
                    this.field_i = var2;
                    if (-5000000000L >= var4) {
                        statePc = 32;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (5000000000L > var4) {
                        statePc = 16;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var6 = 0L;
                    if (param0 == -63) {
                        statePc = 9;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    o.b((byte) -81);
                    var8 = 1;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (var8 > this.field_f) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    stackIn_8_0 = var6 + this.field_j[(this.field_h + (-var8 - -10)) % 10];
                    stackIn_6_0 = stackIn_8_0;
                    if (var9 != 0) {
                        statePc = 8;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var6 = stackIn_6_0;
                    var8++;
                    if (var9 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    stackIn_8_0 = var6 / (long)this.field_f;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    return stackIn_8_0;
                }
                case 9: {
                    var8 = 1;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (var8 > this.field_f) {
                        statePc = 13;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    stackIn_14_0 = var6 + this.field_j[(this.field_h + (-var8 - -10)) % 10];
                    stackIn_12_0 = stackIn_14_0;
                    if (var9 != 0) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var6 = stackIn_12_0;
                    var8++;
                    if (var9 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_14_0 = var6 / (long)this.field_f;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    return stackIn_14_0;
                }
                case 16: {
                    this.field_j[this.field_h] = var4;
                    this.field_h = (this.field_h + 1) % 10;
                    if (-2 < (this.field_f ^ -1)) {
                        statePc = 31;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var6 = 0L;
                    if (param0 == -63) {
                        statePc = 24;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    o.b((byte) -81);
                    var8 = 1;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (var8 > this.field_f) {
                        statePc = 22;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    stackIn_23_0 = var6 + this.field_j[(this.field_h + (-var8 - -10)) % 10];
                    stackIn_21_0 = stackIn_23_0;
                    if (var9 != 0) {
                        statePc = 23;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var6 = stackIn_21_0;
                    var8++;
                    if (var9 == 0) {
                        statePc = 19;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    stackIn_23_0 = var6 / (long)this.field_f;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    return stackIn_23_0;
                }
                case 24: {
                    var8 = 1;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if (var8 > this.field_f) {
                        statePc = 28;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackIn_29_0 = var6 + this.field_j[(this.field_h + (-var8 - -10)) % 10];
                    stackIn_27_0 = stackIn_29_0;
                    if (var9 != 0) {
                        statePc = 29;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var6 = stackIn_27_0;
                    var8++;
                    if (var9 == 0) {
                        statePc = 25;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    stackIn_29_0 = var6 / (long)this.field_f;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    return stackIn_29_0;
                }
                case 31: {
                    this.field_f = this.field_f + 1;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    var6 = 0L;
                    if (param0 != -63) {
                        statePc = 39;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var8 = 1;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    if (var8 > this.field_f) {
                        statePc = 37;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    stackIn_38_0 = var6 + this.field_j[(this.field_h + (-var8 - -10)) % 10];
                    stackIn_36_0 = stackIn_38_0;
                    if (var9 != 0) {
                        statePc = 38;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var6 = stackIn_36_0;
                    var8++;
                    if (var9 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    stackIn_38_0 = var6 / (long)this.field_f;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    return stackIn_38_0;
                }
                case 39: {
                    o.b((byte) -81);
                    var8 = 1;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if (var8 > this.field_f) {
                        statePc = 43;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    stackIn_44_0 = var6 + this.field_j[(this.field_h + (-var8 - -10)) % 10];
                    stackIn_42_0 = stackIn_44_0;
                    if (var9 != 0) {
                        statePc = 44;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    var6 = stackIn_42_0;
                    var8++;
                    if (var9 == 0) {
                        statePc = 40;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    stackIn_44_0 = var6 / (long)this.field_f;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    return stackIn_44_0;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(byte param0) {
        field_g = null;
        if (param0 < 55) {
            field_g = (String) null;
        }
    }

    final int a(int param0, long param1) {
        int var4;
        int var5;
        int stackIn_5_0 = 0;
        L0: {
          var5 = fleas.field_A ? 1 : 0;
          if (param0 == -23124) {
            break L0;
          } else {
            this.b(-73);
            break L0;
          }
        }
        if ((this.field_e ^ -1L) > (this.field_k ^ -1L)) {
          this.field_i = this.field_i + (this.field_k - this.field_e);
          this.field_e = this.field_e + (this.field_k + -this.field_e);
          this.field_k = this.field_k + param1;
          return 1;
        } else {
          var4 = 0;
          L1: while (true) {
            this.field_k = this.field_k + param1;
            var4++;
            stackIn_5_0 = -11;
            L2: while (true) {
              L3: {
                if (stackIn_5_0 >= (var4 ^ -1)) {
                  break L3;
                } else {
                  if (this.field_e > this.field_k) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_5_0 = (this.field_e < this.field_k ? -1 : (this.field_e == this.field_k ? 0 : 1));

              if (var5 != 0) {
                continue L2;
              } else {
                L4: {
                  if (stackIn_5_0 > 0) {
                    this.field_k = this.field_e;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                return var4;
              }
            }
          }
        }
    }

    final static boolean c(byte param0) {
        if (param0 != 39) {
            field_m = 21;
            return jg.field_d;
        }
        return jg.field_d;
    }

    final static boolean a(boolean param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length() < rf.field_d) {
                  break L1;
                } else {
                  if (param1.length() <= rh.field_a) {
                    L2: {
                      if (!param0) {
                        break L2;
                      } else {
                        field_m = -82;
                        break L2;
                      }
                    }
                    stackIn_9_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    return true;
                  }
                }
              }
            }
            stackIn_5_0 = 1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var2);

            stackIn_12_1 = new StringBuilder().append("o.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    final void c(int param0) {
        String var3;
        this.field_i = 0L;
        if (this.field_e >= this.field_k) {
          if (param0 != 12445) {
            var3 = (String) null;
            o.a(true, (String) null);
            return;
          } else {
            return;
          }
        } else {
          this.field_e = this.field_e + (-this.field_e + this.field_k);
          if (param0 == 12445) {
            return;
          } else {
            var3 = (String) null;
            o.a(true, (String) null);
            return;
          }
        }
    }

    o() {
        this.field_j = new long[10];
        this.field_i = 0L;
        this.field_e = 0L;
        this.field_h = 0;
        this.field_k = 0L;
        this.field_f = 1;
        this.field_e = System.nanoTime();
        this.field_k = System.nanoTime();
    }

    static {
        field_g = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_l = false;
    }
}
