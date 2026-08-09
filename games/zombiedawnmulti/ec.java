/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec {
    static cj field_b;
    static String field_a;
    static boolean field_c;

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        if (param0 != -12) {
            field_b = (cj) null;
        }
    }

    final static String a(java.applet.Applet param0, byte param1, String param2) {
        try {
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String var8 = null;
            int var9 = 0;
            int var10 = 0;
            String stackIn_11_0 = null;
            Object stackIn_18_0 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            String stackIn_22_2 = null;
            StringBuilder stackIn_24_1 = null;
            StringBuilder stackIn_25_1 = null;
            String stackIn_25_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var3 = null;
            RuntimeException var3_ref = null;
            var7 = ZombieDawnMulti.field_E ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    var8 = (String) (fo.b(param0, 13093, "getcookies"));
                    var4 = mk.a(';', false, var8);
                    var5 = 0;
                    L2: while (true) {
                      L3: {
                        L4: {
                          L5: {
                            if (var4.length <= var5) {
                              break L5;
                            } else {
                              var6 = var4[var5].indexOf('=');
                              var10 = -1;
                              var9 = var6 ^ -1;
                              if (var7 != 0) {
                                if (var9 >= var10) {
                                  break L3;
                                } else {
                                  break L4;
                                }
                              } else {
                                L6: {
                                  if (var9 > var10) {
                                    break L6;
                                  } else {
                                    if (var4[var5].substring(0, var6).trim().equals(param2)) {
                                      stackIn_11_0 = var4[var5].substring(1 + var6).trim();
                                      decompiledRegionSelector0 = 1;
                                      break L1;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                                var5++;
                                if (var7 == 0) {
                                  continue L2;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                          if (param1 >= 94) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                        field_a = (String) null;
                        break L3;
                      }
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L7: {
                    var3 = decompiledCaughtException;
                    decompiledRegionSelector0 = 0;
                    break L7;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  stackIn_18_0 = null;
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L8: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_21_0 = (RuntimeException) (var3_ref);

                stackIn_21_1 = new StringBuilder().append("ec.B(");

                if (param0 == null) {
                  stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
                  stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
                  stackIn_22_2 = "null";
                  break L8;
                } else {
                  stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
                  stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
                  stackIn_22_2 = "{...}";
                  break L8;
                }
              }
              L9: {


                stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
                  stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
                  stackIn_25_2 = "null";
                  break L9;
                } else {
                  stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
                  stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
                  stackIn_25_2 = "{...}";
                  break L9;
                }
              }
              throw fa.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return (String) ((Object) stackIn_18_0);
            } else {
              return stackIn_11_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, boolean param1, int param2) {
        String var4;
        if (!param0) {
          oo.b();
          if (param2 < -98) {
            wj.b(param0, -120);
            return;
          } else {
            var4 = (String) null;
            ec.a((java.applet.Applet) null, (byte) -12, (String) null);
            wj.b(param0, -120);
            return;
          }
        } else {
          oo.f(0, 0, oo.field_b, oo.field_l, 0, 192);
          if (ZombieDawnMulti.field_E) {
            oo.b();
            if (param2 >= -98) {
              var4 = (String) null;
              ec.a((java.applet.Applet) null, (byte) -12, (String) null);
              wj.b(param0, -120);
              return;
            } else {
              wj.b(param0, -120);
              return;
            }
          } else {
            if (param2 >= -98) {
              var4 = (String) null;
              ec.a((java.applet.Applet) null, (byte) -12, (String) null);
              wj.b(param0, -120);
              return;
            } else {
              wj.b(param0, -120);
              return;
            }
          }
        }
    }

    static {
        field_c = false;
        field_a = "Research";
    }
}
