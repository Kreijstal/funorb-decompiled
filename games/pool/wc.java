/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc {
    String field_b;
    int field_g;
    boolean field_f;
    static String field_a;
    static String field_d;
    boolean field_e;
    String[] field_c;

    final static an a(di param0, int param1, int param2, di param3, int param4) {
        RuntimeException var5 = null;
        di var6 = null;
        an stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 > 40) {
                break L1;
              } else {
                var6 = (di) null;
                wc.a((di) null, -35, -8, (di) null, -32);
                break L1;
              }
            }
            if (vj.a(param2, param0, param4, (byte) 121)) {
              stackIn_6_0 = fn.a((byte) 126, param3.a(123, param4, param2));
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("wc.B(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param4 + ')');
        }
        return stackIn_6_0;
    }

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        if (param0 <= 65) {
            field_d = (String) null;
        }
    }

    final static void b(int param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var3 = Pool.field_O;
        try {
          L0: {
            var1_int = 0;
            var2 = 101 % ((32 - param0) / 49);
            L1: while (true) {
              if (var1_int >= no.field_n.length) {
                break L0;
              } else {
                L2: {
                  L3: {
                    if (no.field_n[var1_int] != 0) {
                      break L3;
                    } else {
                      if (0 >= ji.field_b[var1_int]) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    no.field_n[var1_int] = no.field_n[var1_int] + ji.field_b[var1_int];
                    if (256 >= no.field_n[var1_int]) {
                      break L4;
                    } else {
                      no.field_n[var1_int] = 256;
                      break L4;
                    }
                  }
                  L5: {
                    if (ji.field_b[var1_int] >= 0) {
                      break L5;
                    } else {
                      if (-1 <= (no.field_n[var1_int] ^ -1)) {
                        no.field_n[var1_int] = 0;
                        ji.field_b[var1_int] = 0;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (ji.field_b[var1_int] <= -32) {
                    break L2;
                  } else {
                    ji.field_b[var1_int] = ji.field_b[var1_int] - 1;
                    break L2;
                  }
                }
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1), "wc.C(" + param0 + ')');
        }
    }

    wc(boolean param0) {
        this.field_f = param0 ? true : false;
    }

    static {
        field_d = "Advertising websites";
        field_a = "There are no valid types of game that match your preferences.";
    }
}
