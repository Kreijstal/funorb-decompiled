/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vi implements Iterable {
    int field_c;
    private wf field_f;
    wf[] field_d;
    static StringBuilder[] field_g;
    static int[] field_a;
    static String field_i;
    static String field_b;
    static boolean field_h;
    static vd field_e;

    final wf a(int param0, long param1) {
        wf var4;
        wf var5;
        int var6;
        Object stackIn_5_0 = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        var4 = this.field_d[(int)((long)(param0 + this.field_c) & param1)];
        this.field_f = var4.field_b;
        L0: while (true) {
          if (var4 != this.field_f) {
            stackIn_5_0 = this;

            if (var6 == 0) {
              if (((vi) (this)).field_f.field_c == param1) {
                var5 = this.field_f;
                this.field_f = this.field_f.field_b;
                return var5;
              } else {
                this.field_f = this.field_f.field_b;
                if (var6 == 0) {
                  continue L0;
                } else {
                  this.field_f = null;
                  return null;
                }
              }
            } else {
              ((vi) (this)).field_f = null;
              return null;
            }
          } else {
            this.field_f = null;
            return null;
          }
        }
    }

    final void a(wf param0, byte param1, long param2) {
        wf var5 = null;
        try {
            if (param0.field_f != null) {
                param0.c(5);
            }
            var5 = this.field_d[(int)((long)(-1 + this.field_c) & param2)];
            param0.field_f = var5.field_f;
            param0.field_b = var5;
            param0.field_f.field_b = param0;
            if (param1 < 60) {
                String var6 = (String) null;
                vi.a('X', (String) null, -67);
            }
            param0.field_b.field_f = param0;
            param0.field_c = param2;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "vi.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static String[] a(char param0, String param1, int param2) {
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var10 = (CharSequence) ((Object) param1);
                        var3_int = lj.a(param2 ^ 126, param0, var10);
                        var4 = new String[1 + var3_int];
                        var5 = param2;
                        var6 = 0;
                        var7 = 0;
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
                        if (var7 >= var3_int) {
                            statePc = 11;
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
                        if (var9 != 0) {
                            statePc = 12;
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
                        var8 = var6;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param0 == param1.charAt(var8)) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var8++;
                        if (var9 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var9 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        incrementValue$1 = var5;
                        var5++;
                        var4[incrementValue$1] = param1.substring(var6, var8);
                        var6 = var8 + 1;
                        var7++;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var9 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var4[var3_int] = param1.substring(var6);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_13_0 = (String[]) (var4);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return stackIn_13_0;
                }
                case 14: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_16_0 = (RuntimeException) (var3);
                    stackIn_15_0 = stackIn_16_0;
                    stackIn_16_1 = new StringBuilder().append("vi.D(").append(param0).append(',');
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
                    throw ch.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new w((vi) (this)));
    }

    private vi() throws Throwable {
        throw new Error();
    }

    final static void a(byte param0) {
        int var1 = 0;
        Throwable decompiledCaughtException = null;
        Object var2 = null;
        var1 = 102 / ((param0 - 31) / 59);
        var2 = hi.field_e;
        synchronized (var2) {
          L0: {
            b.field_k = cg.field_k;
            gj.field_l = gj.field_l + 1;
            oa.field_j = fc.field_g;
            bk.field_a = uj.field_i;
            tl.field_a = li.field_j;
            li.field_j = false;
            tg.field_d = ad.field_b;
            ol.field_b = dh.field_w;
            nk.field_c = ga.field_b;
            ad.field_b = 0;
            break L0;
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_g = null;
        field_i = null;
        field_a = null;
        if (param0 < 33) {
          vi.a(103);
          field_e = null;
          return;
        } else {
          field_e = null;
          return;
        }
    }

    static {
        int var0 = 0;
        field_g = new StringBuilder[10];
        for (var0 = 0; field_g.length > var0; var0++) {
            field_g[var0] = new StringBuilder(12);
        }
        field_a = new int[field_g.length];
        field_i = "Creating your account";
        field_b = "Visit the Account Management section on the main site to view.";
    }
}
