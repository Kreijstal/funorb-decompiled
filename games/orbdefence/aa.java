/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class aa {
    static int field_c;
    static String field_b;
    static nh field_d;
    static String field_a;

    final static byte[] a(se param0, byte[] param1, int param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var4_int = param0.h(param2, 8);
            if (-1 != (var4_int ^ -1)) {
              L1: {
                L2: {
                  if (param1 == null) {
                    break L2;
                  } else {
                    if (param1.length != var4_int) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                param1 = new byte[var4_int];
                break L1;
              }
              L3: {
                if (param3 == 20783) {
                  break L3;
                } else {
                  field_b = (String) null;
                  break L3;
                }
              }
              L4: {
                var5 = param0.h(3, 8);
                var6 = (byte)param0.h(8, param3 ^ 20775);
                if (var5 <= 0) {
                  var7 = 0;
                  L5: while (true) {
                    if (var4_int <= var7) {
                      break L4;
                    } else {
                      param1[var7] = (byte)var6;
                      var7++;
                      continue L5;
                    }
                  }
                } else {
                  var7 = 0;
                  L6: while (true) {
                    if (var7 >= var4_int) {
                      break L4;
                    } else {
                      param1[var7] = (byte)(param0.h(var5, 8) + var6);
                      var7++;
                      continue L6;
                    }
                  }
                }
              }
              stackIn_18_0 = (byte[]) (param1);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("aa.K(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_18_0;
    }

    abstract void b(int param0);

    abstract int a(int param0, long param1);

    abstract long a(int param0);

    public static void a(byte param0) {
        field_d = null;
        field_a = null;
        if (param0 > -13) {
            aa.a((byte) 34);
        }
        field_b = null;
    }

    final int b(int param0, long param1) {
        long var4 = this.a(17990);
        if (!((var4 ^ -1L) >= -1L)) {
            hb.a(var4, param0 + 108);
        }
        if (param0 != 0) {
            field_b = (String) null;
        }
        return this.a(param0 ^ -21342, param1);
    }

    static {
        field_b = "Members' Benefits";
        field_a = "You must build in an empty gridded area";
    }
}
