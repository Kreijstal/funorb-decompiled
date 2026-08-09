/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hf {
    static String field_b;
    static String field_c;
    static String field_g;
    static ck[][] field_e;
    static String field_h;
    private RandomAccessFile field_f;
    static String field_a;
    private long field_i;
    private long field_d;

    final int a(byte[] param0, byte param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= -33) {
                break L1;
              } else {
                field_h = (String) null;
                break L1;
              }
            }
            L2: {
              var5_int = this.field_f.read(param0, param2, param3);
              if (0 >= var5_int) {
                break L2;
              } else {
                this.field_d = this.field_d + (long)var5_int;
                break L2;
              }
            }
            stackIn_5_0 = var5_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("hf.G(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_5_0;
    }

    public static void b(int param0) {
        field_g = null;
        field_h = null;
        field_c = null;
        if (param0 != 12741) {
          field_g = (String) null;
          field_a = null;
          field_b = null;
          field_e = (ck[][]) null;
          return;
        } else {
          field_a = null;
          field_b = null;
          field_e = (ck[][]) null;
          return;
        }
    }

    final void a(int param0) throws IOException {
        CharSequence[] var3;
        L0: {
          if (this.field_f != null) {
            this.field_f.close();
            this.field_f = null;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 >= -4) {
          var3 = (CharSequence[]) null;
          hf.a(-21, 99, (CharSequence[]) null, (byte) 32);
          return;
        } else {
          return;
        }
    }

    protected final void finalize() throws Throwable {
        if (!(null == this.field_f)) {
            System.out.println("");
            this.a(-86);
        }
    }

    final void a(long param0, int param1) throws IOException {
        CharSequence[] var5;
        this.field_f.seek(param0);
        this.field_d = param0;
        if (param1 < 3) {
          var5 = (CharSequence[]) null;
          hf.a(69, 18, (CharSequence[]) null, (byte) 126);
          return;
        } else {
          return;
        }
    }

    final static String a(int param0, int param1, CharSequence[] param2, byte param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence[] var10 = null;
        CharSequence var11 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (-1 != (param0 ^ -1)) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = "";
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        if (param0 != 1) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var11 = param2[param1];
                        var4 = var11;
                        if (var4 == null) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        return var11.toString();
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_8_0 = "null";
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0;
                }
                case 9: {
                    try {
                        var4_int = param0 + param1;
                        var5 = 0;
                        var6_int = param1;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var6_int >= var4_int) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var7_ref_CharSequence = param2[var6_int];
                        if (var7_ref_CharSequence != null) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var5 += 4;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var5 = var5 + var7_ref_CharSequence.length();
                        if (var9 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var5 += 4;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var6_int++;
                        if (var9 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var6 = new StringBuilder(var5);
                        if (param3 == 74) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var10 = (CharSequence[]) null;
                        hf.a(-7, 123, (CharSequence[]) null, (byte) 21);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var7 = param1;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var7 >= var4_int) {
                            statePc = 26;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var8 = param2[var7];
                        if (var8 == null) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        discarded$0 = var6.append(var8);
                        if (var9 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        discarded$1 = var6.append("null");
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        discarded$2 = var6.append("null");
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var7++;
                        if (var9 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackIn_27_0 = var6.toString();
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 27: {
                    return stackIn_27_0;
                }
                case 28: {
                    var4_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_30_0 = (RuntimeException) (var4_ref);
                    stackIn_29_0 = stackIn_30_0;
                    stackIn_30_1 = new StringBuilder().append("hf.D(").append(param0).append(',').append(param1).append(',');
                    stackIn_29_1 = stackIn_30_1;
                    if (param2 == null) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    stackIn_31_0 = (RuntimeException) ((Object) stackIn_29_0);
                    stackIn_31_1 = (StringBuilder) ((Object) stackIn_29_1);
                    stackIn_31_2 = "{...}";
                    statePc = 31;
                    continue stateLoop;
                }
                case 30: {
                    stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
                    stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
                    stackIn_31_2 = "null";
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    throw dh.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final long a(byte param0) throws IOException {
        if (param0 != -50) {
            return -2L;
        }
        return this.field_f.length();
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        try {
            if (!(((long)param3 - -this.field_d ^ -1L) >= (this.field_i ^ -1L))) {
                this.field_f.seek(this.field_i);
                this.field_f.write(1);
                throw new EOFException();
            }
            int var5_int = 96 % ((param1 - -35) / 49);
            this.field_f.write(param0, param2, param3);
            this.field_d = this.field_d + (long)param3;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "hf.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    hf(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
            if (-1L == param2) {
                param2 = 9223372036854775807L;
            }
            if (param2 < param0.length()) {
                param0.delete();
            }
            this.field_f = new RandomAccessFile(param0, param1);
            this.field_d = 0L;
            this.field_i = param2;
            var5_int = this.field_f.read();
            if (var5_int != -1 && !param1.equals("r")) {
                this.field_f.seek(0L);
                this.field_f.write(var5_int);
            }
            this.field_f.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "hf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_b = "Visit the Account Management section on the main site to view.";
        field_a = "<%0>'s game";
        field_h = "Report abuse";
        field_e = new ck[8][];
        field_g = "No players";
        field_c = "<%0> has joined your game.";
    }
}
