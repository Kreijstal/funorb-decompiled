/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj {
    static int field_a;
    static String[] field_b;
    int field_c;

    final static String a(byte param0, String param1, java.applet.Applet param2) {
        try {
            String var3 = null;
            RuntimeException var3_ref = null;
            Throwable var3_ref2 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            String stackIn_11_0 = null;
            String stackIn_18_0 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            String stackIn_23_2 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            RuntimeException stackIn_26_0 = null;
            StringBuilder stackIn_26_1 = null;
            String stackIn_26_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            String stackOut_10_0 = null;
            String stackOut_17_0 = null;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            String stackOut_22_2 = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            String stackOut_21_2 = null;
            RuntimeException stackOut_23_0 = null;
            StringBuilder stackOut_23_1 = null;
            RuntimeException stackOut_25_0 = null;
            StringBuilder stackOut_25_1 = null;
            String stackOut_25_2 = null;
            RuntimeException stackOut_24_0 = null;
            StringBuilder stackOut_24_1 = null;
            String stackOut_24_2 = null;
            var7 = Lexicominos.field_L ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    var3 = (String) (oa.a(true, param2, "getcookies"));
                    var4 = dc.a(var3, ';', (byte) -125);
                    var5 = 0;
                    L2: while (true) {
                      L3: {
                        if (var5 >= var4.length) {
                          break L3;
                        } else {
                          var6 = var4[var5].indexOf('=');
                          var9 = var6;
                          var8 = 0;
                          if (var7 != 0) {
                            if (var8 < var9) {
                              decompiledRegionSelector0 = 1;
                              break L1;
                            } else {
                              return null;
                            }
                          } else {
                            L4: {
                              if (var8 > var9) {
                                break L4;
                              } else {
                                if (var4[var5].substring(0, var6).trim().equals(param1)) {
                                  stackOut_10_0 = var4[var5].substring(var6 - -1).trim();
                                  stackIn_11_0 = stackOut_10_0;
                                  decompiledRegionSelector0 = 2;
                                  break L1;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            var5++;
                            if (var7 == 0) {
                              continue L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var3_ref2 = decompiledCaughtException;
                    decompiledRegionSelector0 = 0;
                    break L5;
                  }
                }
                L6: {
                  if (decompiledRegionSelector0 == 0) {
                    if (param0 < 81) {
                      break L6;
                    } else {
                      return null;
                    }
                  } else {
                    if (decompiledRegionSelector0 == 1) {
                      break L6;
                    } else {
                      decompiledRegionSelector1 = 1;
                      break L0;
                    }
                  }
                }
                stackOut_17_0 = (String) null;
                stackIn_18_0 = stackOut_17_0;
                decompiledRegionSelector1 = 0;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_20_0 = (RuntimeException) (var3_ref);
                stackOut_20_1 = new StringBuilder().append("nj.B(").append(param0).append(',');
                stackIn_22_0 = stackOut_20_0;
                stackIn_22_1 = stackOut_20_1;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                if (param1 == null) {
                  stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
                  stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
                  stackOut_22_2 = "null";
                  stackIn_23_0 = stackOut_22_0;
                  stackIn_23_1 = stackOut_22_1;
                  stackIn_23_2 = stackOut_22_2;
                  break L7;
                } else {
                  stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
                  stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
                  stackOut_21_2 = "{...}";
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_23_1 = stackOut_21_1;
                  stackIn_23_2 = stackOut_21_2;
                  break L7;
                }
              }
              L8: {
                stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
                stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
                stackIn_25_0 = stackOut_23_0;
                stackIn_25_1 = stackOut_23_1;
                stackIn_24_0 = stackOut_23_0;
                stackIn_24_1 = stackOut_23_1;
                if (param2 == null) {
                  stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
                  stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
                  stackOut_25_2 = "null";
                  stackIn_26_0 = stackOut_25_0;
                  stackIn_26_1 = stackOut_25_1;
                  stackIn_26_2 = stackOut_25_2;
                  break L8;
                } else {
                  stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
                  stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
                  stackOut_24_2 = "{...}";
                  stackIn_26_0 = stackOut_24_0;
                  stackIn_26_1 = stackOut_24_1;
                  stackIn_26_2 = stackOut_24_2;
                  break L8;
                }
              }
              throw ld.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_18_0;
            } else {
              return stackIn_11_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        if (param0 != -5) {
            nj.a((byte) -128);
            field_b = null;
            return;
        }
        field_b = null;
    }

    static {
        field_b = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
    }
}
