/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dc implements Iterable {
    ug[] field_f;
    private ug field_a;
    static int field_e;
    int field_d;
    static String field_b;
    static int field_c;

    final static lg a(int param0, String param1, String param2, ud param3, ad param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        lg stackIn_2_0 = null;
        lg stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 2570) {
              var5_int = param4.c(param2, (byte) -105);
              var6 = param4.a(param1, var5_int, -28459);
              stackIn_4_0 = ei.a(param4, (byte) 115, param3, var6, var5_int);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (lg) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("dc.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param4 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_8_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new wc((dc) (this)));
    }

    final static void a(int param0) {
        ad var2;
        nf.field_F = new bg();
        if (param0 != 0) {
          var2 = (ad) null;
          dc.a(54, (String) null, (String) null, (ud) null, (ad) null);
          jh.field_C.c((byte) 121, nf.field_F);
          return;
        } else {
          jh.field_C.c((byte) 121, nf.field_F);
          return;
        }
    }

    private dc() throws Throwable {
        throw new Error();
    }

    final static void a(byte param0) {
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5 = hb.field_l;
                        var1 = var5;
                        var2 = 0;
                        var3 = var5.length;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var2 >= var3) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        incrementValue$8 = var2;
                        var2++;
                        var5[incrementValue$8] = 0;
                        incrementValue$9 = var2;
                        var2++;
                        var5[incrementValue$9] = 0;
                        incrementValue$10 = var2;
                        var2++;
                        var5[incrementValue$10] = 0;
                        incrementValue$11 = var2;
                        var2++;
                        var5[incrementValue$11] = 0;
                        incrementValue$12 = var2;
                        var2++;
                        var5[incrementValue$12] = 0;
                        incrementValue$13 = var2;
                        var2++;
                        var5[incrementValue$13] = 0;
                        incrementValue$14 = var2;
                        var2++;
                        var5[incrementValue$14] = 0;
                        incrementValue$15 = var2;
                        var2++;
                        var5[incrementValue$15] = 0;
                        if (var4 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var4 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param0 == 114) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        field_c = -18;
                        return;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    var1_ref = (RuntimeException) ((Object) caughtException);
                    throw la.a((Throwable) ((Object) var1_ref), "dc.E(" + param0 + ')');
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 < 16) {
            dc.a(24);
        }
    }

    final void a(long param0, boolean param1, ug param2) {
        ug var5 = null;
        try {
            if (!param1) {
                dc.a(27);
            }
            if (param2.field_c != null) {
                param2.c(-19822);
            }
            var5 = this.field_f[(int)(param0 & (long)(this.field_d - 1))];
            param2.field_c = var5.field_c;
            param2.field_d = var5;
            param2.field_c.field_d = param2;
            param2.field_d.field_c = param2;
            param2.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "dc.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final ug a(byte param0, long param1) {
        Object stackIn_7_0 = null;
        Object stackIn_16_0 = null;
        ug var4;
        ug var5;
        int var6;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        var4 = this.field_f[(int)((long)(-1 + this.field_d) & param1)];
        if (param0 <= -70) {
          this.field_a = var4.field_d;
          L0: while (true) {
            if (this.field_a != var4) {
              stackIn_7_0 = this;

              if (var6 == 0) {
                if ((((dc) (this)).field_a.field_a ^ -1L) != (param1 ^ -1L)) {
                  this.field_a = this.field_a.field_d;
                  if (var6 == 0) {
                    continue L0;
                  } else {
                    this.field_a = null;
                    return null;
                  }
                } else {
                  var5 = this.field_a;
                  this.field_a = this.field_a.field_d;
                  return var5;
                }
              } else {
                ((dc) (this)).field_a = null;
                return null;
              }
            } else {
              this.field_a = null;
              return null;
            }
          }
        } else {
          this.iterator();
          this.field_a = var4.field_d;
          L1: while (true) {
            if (this.field_a != var4) {
              stackIn_16_0 = this;

              if (var6 == 0) {
                if ((((dc) (this)).field_a.field_a ^ -1L) != (param1 ^ -1L)) {
                  this.field_a = this.field_a.field_d;
                  if (var6 == 0) {
                    continue L1;
                  } else {
                    this.field_a = null;
                    return null;
                  }
                } else {
                  var5 = this.field_a;
                  this.field_a = this.field_a.field_d;
                  return var5;
                }
              } else {
                ((dc) (this)).field_a = null;
                return null;
              }
            } else {
              this.field_a = null;
              return null;
            }
          }
        }
    }

    static {
        field_b = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_c = 0;
    }
}
