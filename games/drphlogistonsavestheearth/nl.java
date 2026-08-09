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
        int var1;
        int var2;
        if (param0 != -1321745375) {
          nl.a((byte) -105);
          var1 = ie.a(false);
          var2 = ig.a((byte) 115);
          cb.field_a.a(var2 + (di.field_d << -97716703), -df.field_h + si.field_B, var1 + (df.field_h << -1321745375), jd.field_N - di.field_d, 7453);
          tf.n(17077);
          return;
        } else {
          var1 = ie.a(false);
          var2 = ig.a((byte) 115);
          cb.field_a.a(var2 + (di.field_d << -97716703), -df.field_h + si.field_B, var1 + (df.field_h << -1321745375), jd.field_N - di.field_d, 7453);
          tf.n(17077);
          return;
        }
    }

    public static void a(byte param0) {
        field_n = (he[][]) null;
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
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_5_0 = null;
        byte[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
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
            if (-1 != (var4_int ^ -1)) {
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
              stackIn_18_0 = (byte[]) (param3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_5_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("nl.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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

            if (param3 == null) {
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
          throw ie.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_5_0);
        } else {
          return stackIn_18_0;
        }
    }

    nl(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_p = param3;
        this.field_q = param4;
        this.field_k = param5;
        this.field_h = param2;
        this.field_l = param1;
        this.field_j = param0;
    }

    static {
        field_r = new vk[74];
        field_n = new he[3][];
        field_i = new String[]{"By rating", "By win percentage"};
        field_o = "To server list";
    }
}
