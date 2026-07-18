/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rd extends oh {
    static boolean field_h;
    static ko field_i;
    static un field_g;
    static int field_f;

    final int a(int param0, int param1) {
        Object var4 = null;
        if (param0 != 1843275042) {
          var4 = null;
          jp discarded$2 = rd.a(false, (String) null);
          return q.field_a[ma.field_n[param1]].field_d;
        } else {
          return q.field_a[ma.field_n[param1]].field_d;
        }
    }

    final static jp a(boolean param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        jp var7 = null;
        int var8 = 0;
        jp stackIn_3_0 = null;
        jp stackIn_8_0 = null;
        jp stackIn_12_0 = null;
        jp stackIn_17_0 = null;
        jp stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        jp stackOut_11_0 = null;
        jp stackOut_19_0 = null;
        jp stackOut_16_0 = null;
        jp stackOut_7_0 = null;
        jp stackOut_2_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var8 = CrazyCrystals.field_B;
        try {
          L0: {
            var2_int = param1.length();
            if (var2_int != 0) {
              L1: {
                if (param0) {
                  break L1;
                } else {
                  field_h = false;
                  break L1;
                }
              }
              if (var2_int <= 255) {
                var3 = ik.a(param1, (byte) -76, '.');
                if (var3.length < 2) {
                  stackOut_11_0 = ma.field_m;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                } else {
                  var4 = var3;
                  var5 = 0;
                  L2: while (true) {
                    if (var4.length <= var5) {
                      stackOut_19_0 = uk.a((byte) 46, var3[var3.length + -1]);
                      stackIn_20_0 = stackOut_19_0;
                      break L0;
                    } else {
                      var6 = var4[var5];
                      var7 = w.a((byte) -44, var6);
                      if (var7 == null) {
                        var5++;
                        continue L2;
                      } else {
                        stackOut_16_0 = (jp) var7;
                        stackIn_17_0 = stackOut_16_0;
                        return stackIn_17_0;
                      }
                    }
                  }
                }
              } else {
                stackOut_7_0 = hk.field_d;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            } else {
              stackOut_2_0 = ma.field_m;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var2;
            stackOut_21_1 = new StringBuilder().append("rd.R(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L3;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L3;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
        return stackIn_20_0;
    }

    public static void a() {
        field_i = null;
        field_g = null;
    }

    final int a(byte param0, boolean param1) {
        if (param0 > -53) {
            return 1;
        }
        return 16;
    }

    rd() {
    }

    final static hm[] a(md param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        hm[] var4 = null;
        int var5 = 0;
        hm var6 = null;
        int var6_int = 0;
        int var7 = 0;
        hm[] stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        hm[] stackOut_15_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var7 = CrazyCrystals.field_B;
        try {
          L0: {
            var2_int = param0.d((byte) -125, 8);
            if (0 >= var2_int) {
              var3 = param0.d((byte) -62, 12);
              var4 = new hm[var3];
              var5 = 0;
              L1: while (true) {
                if (var3 <= var5) {
                  stackOut_15_0 = (hm[]) var4;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  L2: {
                    if (fn.a(1, param0)) {
                      var6 = new hm();
                      int discarded$6 = param0.d((byte) -56, 24);
                      int discarded$7 = param0.d((byte) -103, 24);
                      var6.field_b = param0.d((byte) -95, 24);
                      int discarded$8 = param0.d((byte) -98, 9);
                      int discarded$9 = param0.d((byte) -114, 12);
                      int discarded$10 = param0.d((byte) -87, 12);
                      int discarded$11 = param0.d((byte) -70, 12);
                      var4[var5] = var6;
                      var5++;
                      break L2;
                    } else {
                      var6_int = param0.d((byte) -61, bd.a(-1 + var5, (byte) 62));
                      var4[var5] = var4[var6_int];
                      var5++;
                      break L2;
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2;
            stackOut_17_1 = new StringBuilder().append("rd.K(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + -95 + ')');
        }
        return stackIn_16_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = false;
    }
}
