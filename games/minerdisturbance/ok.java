/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ok implements jm {
    static ta field_b;
    private long field_c;
    static String[][] field_d;
    static String field_a;

    public final void c(int param0) {
        if (param0 != -11) {
            return;
        }
        ((ok) this).field_c = sf.a((byte) -87);
    }

    public final ag b(int param0) {
        if (param0 != 24595) {
            ((ok) this).field_c = 39L;
            if (((ok) this).a(false)) {
                return ke.field_W;
            }
            if (!(sf.a((byte) 105) >= 350L + ((ok) this).field_c)) {
                return nn.field_f;
            }
            return ((ok) this).b(false);
        }
        if (((ok) this).a(false)) {
            return ke.field_W;
        }
        if (!(sf.a((byte) 105) >= 350L + ((ok) this).field_c)) {
            return nn.field_f;
        }
        return ((ok) this).b(false);
    }

    public final String a(int param0) {
        if (!((ok) this).a(false)) {
          if (~sf.a((byte) 107) <= ~(((ok) this).field_c + 350L)) {
            if (param0 != 7320) {
              return null;
            } else {
              return ((ok) this).e(96);
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    abstract ag b(boolean param0);

    final static boolean a(int param0, CharSequence param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var8 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (param1 == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              var3_int = param1.length();
              if (var3_int < 1) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0 != 0;
              } else {
                if (12 >= var3_int) {
                  L1: {
                    var4 = cl.a(-95, param1);
                    if (var4 == null) {
                      break L1;
                    } else {
                      if (1 <= var4.length()) {
                        L2: {
                          if (ra.a(121, var4.charAt(0))) {
                            break L2;
                          } else {
                            if (!ra.a(119, var4.charAt(var4.length() - 1))) {
                              var5 = 0;
                              var6 = 0;
                              L3: while (true) {
                                if (param1.length() <= var6) {
                                  var7 = 0;
                                  if (var5 <= 0) {
                                    stackOut_32_0 = 1;
                                    stackIn_33_0 = stackOut_32_0;
                                    break L0;
                                  } else {
                                    stackOut_30_0 = 0;
                                    stackIn_31_0 = stackOut_30_0;
                                    return stackIn_31_0 != 0;
                                  }
                                } else {
                                  L4: {
                                    var7 = param1.charAt(var6);
                                    if (!ra.a(117, (char) var7)) {
                                      var5 = 0;
                                      break L4;
                                    } else {
                                      var5++;
                                      break L4;
                                    }
                                  }
                                  if (2 > var5) {
                                    var6++;
                                    continue L3;
                                  } else {
                                    stackOut_26_0 = 0;
                                    stackIn_27_0 = stackOut_26_0;
                                    return stackIn_27_0 != 0;
                                  }
                                }
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0 != 0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0 != 0;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) var3;
            stackOut_34_1 = new StringBuilder().append("ok.Q(").append(111).append(',');
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param1 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L5;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L5;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + ',' + false + ')');
        }
        return stackIn_33_0 != 0;
    }

    public static void d(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 1627) {
          field_d = null;
          field_d = null;
          return;
        } else {
          field_d = null;
          return;
        }
    }

    abstract String e(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new ta();
        field_d = new String[][]{null, new String[1]};
        field_a = "A Miner and a Survivor";
    }
}
