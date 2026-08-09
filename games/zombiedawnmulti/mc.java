/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mc {
    static vg field_i;
    private long field_c;
    static pd field_a;
    static ri[] field_h;
    static String field_g;
    static String field_b;
    static int field_e;
    private long field_d;
    private RandomAccessFile field_f;

    final void a(byte param0, long param1) throws IOException {
        this.field_f.seek(param1);
        this.field_c = param1;
        if (param0 >= -123) {
            this.field_c = -76L;
            return;
        }
    }

    public static void a(byte param0) {
        field_i = null;
        field_h = null;
        field_a = null;
        if (param0 <= 81) {
          mc.a((byte) -64);
          field_g = null;
          field_b = null;
          return;
        } else {
          field_g = null;
          field_b = null;
          return;
        }
    }

    final int a(int param0, byte[] param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5_int = this.field_f.read(param1, param3, param0);
              if ((var5_int ^ -1) >= param2) {
                break L1;
              } else {
                this.field_c = this.field_c + (long)var5_int;
                break L1;
              }
            }
            stackIn_3_0 = var5_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("mc.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    protected final void finalize() throws Throwable {
        if (!(this.field_f == null)) {
            System.out.println("");
            this.b((byte) 38);
        }
    }

    final static String a(long param0, byte param1) {
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        int var3 = 0;
        long var4 = 0L;
        StringBuilder var6 = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        StringBuilder var12 = null;
        StringBuilder var13 = null;
        StringBuilder var14 = null;
        StringBuilder var15 = null;
        StringBuilder var16 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = ZombieDawnMulti.field_E ? 1 : 0;
                    if (-1L > (param0 ^ -1L)) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return null;
                }
                case 2: {
                    if (-6582952005840035282L < (param0 ^ -1L)) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return null;
                }
                case 4: {
                    if (-1L != (param0 % 37L ^ -1L)) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    return null;
                }
                case 6: {
                    var3 = 0;
                    var4 = param0;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if ((var4 ^ -1L) == -1L) {
                        statePc = 41;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var3++;
                    var4 = var4 / 37L;
                    if (var11 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var14 = new StringBuilder(var3);
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (param0 == 0L) {
                        statePc = 16;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var7 = param0;
                    param0 = param0 / 37L;
                    var9 = hq.field_o[(int)(-(param0 * 37L) + var7)];
                    if (var11 != 0) {
                        statePc = 17;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (var9 == 95) {
                        statePc = 14;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var10 = -1 + var14.length();
                    var14.setCharAt(var10, Character.toUpperCase(var14.charAt(var10)));
                    var9 = 160;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    discarded$5 = var14.append((char) var9);
                    if (var11 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var14.reverse();
                    var14.setCharAt(0, Character.toUpperCase(var14.charAt(0)));
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    return var14.toString();
                }
                case 18: {
                    if (var11 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (param1 == 26) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    mc.a((byte) 85);
                    statePc = 31;
                    continue stateLoop;
                }
                case 21: {
                    var12 = new StringBuilder(var3);
                    var6 = var12;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (param0 == 0L) {
                        statePc = 28;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var7 = param0;
                    param0 = param0 / 37L;
                    var9 = hq.field_o[(int)(-(param0 * 37L) + var7)];
                    if (var11 != 0) {
                        statePc = 29;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (var9 == 95) {
                        statePc = 26;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var10 = -1 + var12.length();
                    var12.setCharAt(var10, Character.toUpperCase(var12.charAt(var10)));
                    var9 = 160;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    discarded$6 = var12.append((char) var9);
                    if (var11 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var12.reverse();
                    var12.setCharAt(0, Character.toUpperCase(var12.charAt(0)));
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    return var12.toString();
                }
                case 31: {
                    var13 = new StringBuilder(var3);
                    var6 = var13;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    if (param0 == 0L) {
                        statePc = 38;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var7 = param0;
                    param0 = param0 / 37L;
                    var9 = hq.field_o[(int)(-(param0 * 37L) + var7)];
                    if (var11 != 0) {
                        statePc = 39;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (var9 == 95) {
                        statePc = 36;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var10 = -1 + var13.length();
                    var13.setCharAt(var10, Character.toUpperCase(var13.charAt(var10)));
                    var9 = 160;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    discarded$7 = var13.append((char) var9);
                    if (var11 == 0) {
                        statePc = 32;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var13.reverse();
                    var13.setCharAt(0, Character.toUpperCase(var13.charAt(0)));
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    return var13.toString();
                }
                case 41: {
                    if (param1 != 26) {
                        statePc = 51;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    var15 = new StringBuilder(var3);
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    if (param0 == 0L) {
                        statePc = 49;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    var7 = param0;
                    param0 = param0 / 37L;
                    var9 = hq.field_o[(int)(-(param0 * 37L) + var7)];
                    if (var11 != 0) {
                        statePc = 50;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if (var9 == 95) {
                        statePc = 47;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 47: {
                    var10 = -1 + var15.length();
                    var15.setCharAt(var10, Character.toUpperCase(var15.charAt(var10)));
                    var9 = 160;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    discarded$8 = var15.append((char) var9);
                    if (var11 == 0) {
                        statePc = 43;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    var15.reverse();
                    var15.setCharAt(0, Character.toUpperCase(var15.charAt(0)));
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    return var15.toString();
                }
                case 51: {
                    mc.a((byte) 85);
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    var16 = new StringBuilder(var3);
                    var6 = var16;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    if (param0 == 0L) {
                        statePc = 60;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    var7 = param0;
                    param0 = param0 / 37L;
                    var9 = hq.field_o[(int)(-(param0 * 37L) + var7)];
                    if (var11 != 0) {
                        statePc = 61;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    if (var9 == 95) {
                        statePc = 58;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 58: {
                    var10 = -1 + var16.length();
                    var16.setCharAt(var10, Character.toUpperCase(var16.charAt(var10)));
                    var9 = 160;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    discarded$9 = var16.append((char) var9);
                    if (var11 == 0) {
                        statePc = 54;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    var16.reverse();
                    var16.setCharAt(0, Character.toUpperCase(var16.charAt(0)));
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    return var16.toString();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0, int param1, int param2, byte[] param3) throws IOException {
        if (this.field_d < this.field_c + (long)param2) {
            this.field_f.seek(this.field_d);
            this.field_f.write(1);
            throw new EOFException();
        }
        this.field_f.write(param3, param1, param2);
        if (param0 <= 9) {
            return;
        }
        try {
            this.field_c = this.field_c + (long)param2;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "mc.D(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final long a(int param0) throws IOException {
        if (param0 > -97) {
            field_e = 20;
            return this.field_f.length();
        }
        return this.field_f.length();
    }

    final void b(byte param0) throws IOException {
        if (param0 == 38) {
          if (null != this.field_f) {
            this.field_f.close();
            this.field_f = null;
            return;
          } else {
            return;
          }
        } else {
          field_i = (vg) null;
          if (null == this.field_f) {
            return;
          } else {
            this.field_f.close();
            this.field_f = null;
            return;
          }
        }
    }

    mc(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
            if (0L == (param2 ^ -1L)) {
                param2 = 9223372036854775807L;
            }
            if (param2 < param0.length()) {
                param0.delete();
            }
            this.field_f = new RandomAccessFile(param0, param1);
            this.field_c = 0L;
            this.field_d = param2;
            var5_int = this.field_f.read();
            if (-1 != var5_int && !param1.equals("r")) {
                this.field_f.seek(0L);
                this.field_f.write(var5_int);
            }
            this.field_f.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "mc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_b = "Try changing the following settings:  ";
        field_i = null;
    }
}
