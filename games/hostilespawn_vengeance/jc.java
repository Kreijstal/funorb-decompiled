/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc {
    static ci field_b;
    static String field_e;
    static jb[] field_c;
    static String field_d;
    static bd field_a;

    public static void a(byte param0) {
        field_a = null;
        field_d = null;
        field_e = null;
        field_b = null;
        field_c = null;
        if (param0 == 89) {
            return;
        }
        jc.a((byte) 73);
    }

    final static void a(int[] param0, int param1, int param2, byte[] param3, int param4) {
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        byte dupTemp$6 = 0;
        int dupTemp$7 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            L1: while (true) {
              if (mn.field_a.length <= var5_int) {
                if (param4 == 8965) {
                  break L0;
                } else {
                  field_c = (jb[]) null;
                  return;
                }
              } else {
                param1 = mn.field_a[var5_int];
                var6 = var5_int << 1942939940;
                L2: while (true) {
                  incrementValue$4 = param1;
                  param1--;
                  if (incrementValue$4 == 0) {
                    var5_int++;
                    continue L1;
                  } else {
                    incrementValue$5 = var6;
                    var6++;
                    param2 = lh.field_d[incrementValue$5];
                    dupTemp$6 = param3[param2];
                    dupTemp$7 = param0[dupTemp$6];
                    param0[dupTemp$6] = dupTemp$7 + 1;
                    lh.field_d[dupTemp$7] = param2;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("jc.E(");

            if (param0 == null) {
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
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param4 + ')');
        }
    }

    final static bd a(gb param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 65) {
              break L0;
            } else {
              field_c = (jb[]) null;
              break L0;
            }
          }
          if (rl.a(2884, param0, param3, param2)) {
            return rf.a(-58);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("jc.D(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = mn.field_a[0];
              var2 = 1;
              if (param0 < -94) {
                break L1;
              } else {
                field_c = (jb[]) null;
                break L1;
              }
            }
            L2: while (true) {
              if (mn.field_a.length <= var2) {
                break L0;
              } else {
                var3 = mn.field_a[var2];
                kf.a(lh.field_d, var2 << -1259934556, lh.field_d, var1_int, var3);
                var1_int = var1_int + var3;
                var2++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1), "jc.A(" + param0 + ')');
        }
    }

    final static jj a(boolean param0) {
        if (od.field_I == e.field_q) {
          throw new IllegalStateException();
        } else {
          if (!param0) {
            if (od.field_I != ee.field_b) {
              return null;
            } else {
              od.field_I = e.field_q;
              return wj.field_H;
            }
          } else {
            field_a = (bd) null;
            if (od.field_I != ee.field_b) {
              return null;
            } else {
              od.field_I = e.field_q;
              return wj.field_H;
            }
          }
        }
    }

    static {
        field_e = "This password contains your Player Name, and would be easy to guess";
        field_d = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_c = new jb[65];
        field_b = new ci();
    }
}
