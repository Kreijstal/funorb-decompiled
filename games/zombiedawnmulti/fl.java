/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    static int[] field_c;
    static String[] field_b;
    static int field_a;

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        if (param0 <= 103) {
            field_b = (String[]) null;
        }
    }

    final synchronized static byte[] a(int param0, int param1) {
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int dupTemp$6 = 0;
        byte[][] arrayValue$7 = null;
        byte[] var2_ref_byte__;
        int var2;
        int var3;
        byte[] var4;
        L0: {
          if (param1 != 100) {
            break L0;
          } else {
            if (-1 <= (pn.field_h ^ -1)) {
              break L0;
            } else {
              fieldTemp$3 = pn.field_h - 1;
              pn.field_h = pn.field_h - 1;
              var2_ref_byte__ = lp.field_f[fieldTemp$3];
              lp.field_f[pn.field_h] = null;
              return var2_ref_byte__;
            }
          }
        }
        L1: {
          if (-5001 != (param1 ^ -1)) {
            break L1;
          } else {
            if (ej.field_e <= 0) {
              break L1;
            } else {
              fieldTemp$4 = ej.field_e - 1;
              ej.field_e = ej.field_e - 1;
              var2_ref_byte__ = vb.field_a[fieldTemp$4];
              vb.field_a[ej.field_e] = null;
              return var2_ref_byte__;
            }
          }
        }
        L2: {
          if (30000 != param1) {
            break L2;
          } else {
            if (0 < ci.field_a) {
              fieldTemp$5 = ci.field_a - 1;
              ci.field_a = ci.field_a - 1;
              var2_ref_byte__ = oj.field_N[fieldTemp$5];
              oj.field_N[ci.field_a] = null;
              return var2_ref_byte__;
            } else {
              break L2;
            }
          }
        }
        L3: {
          var2 = -104 / ((param0 - 39) / 61);
          if (null != gb.field_b) {
            var3 = 0;
            L4: while (true) {
              if (var3 >= lk.field_P.length) {
                break L3;
              } else {
                if (param1 == lk.field_P[var3]) {
                  if (-1 > (ta.field_ib[var3] ^ -1)) {
                    dupTemp$6 = ta.field_ib[var3] - 1;
                    arrayValue$7 = gb.field_b[var3];
                    ta.field_ib[var3] = dupTemp$6;
                    var4 = arrayValue$7[dupTemp$6];
                    gb.field_b[var3][ta.field_ib[var3]] = null;
                    return var4;
                  } else {
                    var3++;
                    continue L4;
                  }
                } else {
                  var3++;
                  continue L4;
                }
              }
            }
          } else {
            break L3;
          }
        }
        return new byte[param1];
    }

    final static ja a(String param0, String param1, ul param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ja stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == 11091) {
                break L1;
              } else {
                fl.a(-27, 'w');
                break L1;
              }
            }
            var4_int = param2.a(param0, (byte) 118);
            var5 = param2.a(param1, var4_int, -1);
            stackIn_3_0 = bl.a((byte) 50, var4_int, param2, var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("fl.B(");

            if (param0 == null) {
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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean a(int param0, char param1) {
        if (param0 > -69) {
            return false;
        }
        if (Character.isISOControl(param1)) {
            return false;
        }
        if (gn.a(param1, 16413)) {
            return true;
        }
        if (param1 != 45 && param1 != 160 && param1 != 32 && 95 != param1) {
            return false;
        }
        return true;
    }

    static {
        field_b = new String[]{"Zombie", "Overlord", "Planetary"};
        field_c = new int[8192];
    }
}
