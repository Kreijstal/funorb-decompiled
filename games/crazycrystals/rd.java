/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rd extends oh {
    static boolean field_h;
    static ko field_i;
    static un field_g;
    static int field_f;

    final int a(int param0, int param1) {
        jp discarded$2 = null;
        String var4 = null;
        if (param0 != 1843275042) {
          var4 = (String) null;
          discarded$2 = rd.a(false, (String) null);
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
        int decompiledRegionSelector0 = 0;
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
              if ((var2_int ^ -1) >= -256) {
                var3 = ik.a(param1, (byte) -76, '.');
                if ((var3.length ^ -1) > -3) {
                  stackOut_11_0 = ma.field_m;
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var4 = var3;
                  var5 = 0;
                  L2: while (true) {
                    if (var4.length <= var5) {
                      stackOut_19_0 = uk.a((byte) 46, var3[var3.length + -1]);
                      stackIn_20_0 = stackOut_19_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      var6 = var4[var5];
                      var7 = w.a((byte) -44, var6);
                      if (var7 == null) {
                        var5++;
                        continue L2;
                      } else {
                        stackOut_16_0 = (jp) (var7);
                        stackIn_17_0 = stackOut_16_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  }
                }
              } else {
                stackOut_7_0 = hk.field_d;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = ma.field_m;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var2);
            stackOut_21_1 = new StringBuilder().append("rd.R(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L3;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0;
              } else {
                return stackIn_20_0;
              }
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_i = null;
        if (!param0) {
            field_f = -104;
            field_g = null;
            return;
        }
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

    final static hm[] a(md param0, int param1) {
        int discarded$30 = 0;
        int discarded$31 = 0;
        int discarded$32 = 0;
        int discarded$33 = 0;
        int discarded$34 = 0;
        int discarded$35 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        hm[] var4 = null;
        int var5 = 0;
        int var6_int = 0;
        hm var6 = null;
        int var7 = 0;
        hm[] stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        hm[] stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
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
                  L2: {
                    if (param1 <= -80) {
                      break L2;
                    } else {
                      field_i = (ko) null;
                      break L2;
                    }
                  }
                  stackOut_13_0 = (hm[]) (var4);
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                } else {
                  L3: {
                    if (fn.a(1, param0)) {
                      var6 = new hm();
                      discarded$30 = param0.d((byte) -56, 24);
                      discarded$31 = param0.d((byte) -103, 24);
                      var6.field_b = param0.d((byte) -95, 24);
                      discarded$32 = param0.d((byte) -98, 9);
                      discarded$33 = param0.d((byte) -114, 12);
                      discarded$34 = param0.d((byte) -87, 12);
                      discarded$35 = param0.d((byte) -70, 12);
                      var4[var5] = var6;
                      break L3;
                    } else {
                      var6_int = param0.d((byte) -61, bd.a(-1 + var5, (byte) 62));
                      var4[var5] = var4[var6_int];
                      break L3;
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
          L4: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var2);
            stackOut_15_1 = new StringBuilder().append("rd.K(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        return stackIn_14_0;
    }

    static {
        field_h = false;
    }
}
