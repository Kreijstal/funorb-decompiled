/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class te {
    static un field_a;

    final static boolean a(byte param0, boolean param1) {
        long dupTemp$2 = 0L;
        L0: {
          if (vj.field_b != null) {
            break L0;
          } else {
            vj.field_b = gf.field_b.a(fe.field_j, false, df.field_a);
            break L0;
          }
        }
        if (vj.field_b.field_a != 0) {
          L1: {
            if (param0 == -19) {
              break L1;
            } else {
              field_a = (un) null;
              break L1;
            }
          }
          L2: {
            dupTemp$2 = lo.a((byte) -29);
            mp.field_p = dupTemp$2;
            wg.field_y = dupTemp$2;
            if ((vj.field_b.field_a ^ -1) != -2) {
              break L2;
            } else {
              break L2;
            }
          }
          gj.field_k = tp.field_c;
          vj.field_b = null;
          return true;
        } else {
          return false;
        }
    }

    abstract void b(int param0);

    abstract te b(byte param0);

    te() {
        String var2 = (String) null;
        um.a(0, (String) null, (byte) 120);
    }

    void a(int param0) {
        if (param0 != -1) {
            field_a = (un) null;
        }
    }

    final static void a(bh param0, int param1, String param2, byte param3, vc param4) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = -1;
              if (param3 == -95) {
                break L1;
              } else {
                te.a((byte) -90);
                break L1;
              }
            }
            var7 = 1;
            L2: while (true) {
              if (var7 >= param2.length()) {
                break L0;
              } else {
                L3: {
                  var8 = param2.charAt(var7);
                  if (var8 != 60) {
                    break L3;
                  } else {
                    var6 = (var5_int >> 360677960) - (-param0.field_e[0] + -param4.a(param2.substring(0, var7)));
                    break L3;
                  }
                }
                L4: {
                  if (-1 == var6) {
                    L5: {
                      if (var8 != 32) {
                        break L5;
                      } else {
                        var5_int = var5_int + param1;
                        break L5;
                      }
                    }
                    param0.field_e[var7] = (var5_int >> -1771219320) - (-param0.field_e[0] + -param4.a(param2.substring(0, var7 + 1))) - param4.a((char) var8);
                    break L4;
                  } else {
                    param0.field_e[var7] = var6;
                    break L4;
                  }
                }
                L6: {
                  if (var8 == 62) {
                    var6 = -1;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                var7++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var5);

            stackIn_19_1 = new StringBuilder().append("te.F(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L8;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L9;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L9;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_20_0), stackIn_26_2 + ')');
        }
    }

    public static void a(byte param0) {
        int var1 = 127 % ((param0 - 26) / 59);
        field_a = null;
    }

    static {
    }
}
