/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl extends gi {
    int field_p;
    static vk[] field_r;
    int field_h;
    int field_l;
    static he[][] field_n;
    static int field_m;
    int field_q;
    int field_k;
    static String[] field_i;
    static String field_o;
    int field_j;

    final static void d(int param0) {
        int var1 = ie.a(false);
        int var2 = ig.a((byte) 115);
        cb.field_a.a(var2 + (di.field_d << 1), -df.field_h + si.field_B, var1 + (df.field_h << 1), jd.field_N - di.field_d, 7453);
        tf.n(17077);
    }

    public static void a(byte param0) {
        field_n = null;
        if (param0 >= -56) {
          field_m = -5;
          field_o = null;
          field_i = null;
          field_r = null;
          return;
        } else {
          field_o = null;
          field_i = null;
          field_r = null;
          return;
        }
    }

    final static byte[] a(byte param0, int param1, lh param2, byte[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_5_0 = null;
        byte[] stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_17_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param2.e(param1, (byte) -124);
              if (param0 == 65) {
                break L1;
              } else {
                nl.a((byte) -84);
                break L1;
              }
            }
            if (var4_int != 0) {
              L2: {
                L3: {
                  if (param3 == null) {
                    break L3;
                  } else {
                    if (param3.length != var4_int) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                param3 = new byte[var4_int];
                break L2;
              }
              L4: {
                var5 = param2.e(3, (byte) 102);
                var6 = (byte)param2.e(8, (byte) -95);
                if (0 < var5) {
                  var7 = 0;
                  L5: while (true) {
                    if (var4_int <= var7) {
                      break L4;
                    } else {
                      param3[var7] = (byte)(param2.e(var5, (byte) -110) + var6);
                      var7++;
                      continue L5;
                    }
                  }
                } else {
                  var7 = 0;
                  L6: while (true) {
                    if (var4_int <= var7) {
                      break L4;
                    } else {
                      param3[var7] = (byte)var6;
                      var7++;
                      continue L6;
                    }
                  }
                }
              }
              stackOut_17_0 = (byte[]) param3;
              stackIn_18_0 = stackOut_17_0;
              break L0;
            } else {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (byte[]) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4;
            stackOut_19_1 = new StringBuilder().append("nl.B(").append(param0).append(44).append(param1).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          L8: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param3 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
        return stackIn_18_0;
    }

    nl(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((nl) this).field_p = param3;
        ((nl) this).field_q = param4;
        ((nl) this).field_k = param5;
        ((nl) this).field_h = param2;
        ((nl) this).field_l = param1;
        ((nl) this).field_j = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new vk[74];
        field_n = new he[3][];
        field_i = new String[]{"By rating", "By win percentage"};
        field_o = "To server list";
    }
}
