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
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            String stackIn_11_0 = null;
            String stackIn_18_0 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            String stackIn_23_2 = null;
            StringBuilder stackIn_25_1 = null;
            StringBuilder stackIn_26_1 = null;
            String stackIn_26_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var3_ref2 = null;
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
                                  stackIn_11_0 = var4[var5].substring(var6 - -1).trim();
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
                stackIn_18_0 = (String) null;
                decompiledRegionSelector1 = 0;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_22_0 = (RuntimeException) (var3_ref);

                stackIn_22_1 = new StringBuilder().append("nj.B(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                  stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                  stackIn_23_2 = "null";
                  break L7;
                } else {
                  stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                  stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                  stackIn_23_2 = "{...}";
                  break L7;
                }
              }
              L8: {


                stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

                if (param2 == null) {
                  stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
                  stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
                  stackIn_26_2 = "null";
                  break L8;
                } else {
                  stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
                  stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
                  stackIn_26_2 = "{...}";
                  break L8;
                }
              }
              throw ld.a((Throwable) ((Object) stackIn_23_0), stackIn_26_2 + ')');
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
