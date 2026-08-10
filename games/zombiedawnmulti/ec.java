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
            RuntimeException var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String var8 = null;
            String stackIn_9_0 = null;
            Object stackIn_16_0 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            StringBuilder stackIn_22_1 = null;
            StringBuilder stackIn_23_1 = null;
            String stackIn_23_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var3_ref = null;
            var7 = ZombieDawnMulti.field_E ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    var8 = (String) (fo.b(param0, 13093, "getcookies"));
                    var4 = mk.a(';', false, var8);
                    var5 = 0;
                    L2: while (true) {
                      if (var4.length <= var5) {
                        L3: {
                          if (param1 >= 94) {
                            break L3;
                          } else {
                            field_a = (String) null;
                            break L3;
                          }
                        }
                        decompiledRegionSelector0 = 1;
                        break L1;
                      } else {
                        L4: {
                          var6 = var4[var5].indexOf('=');
                          if ((var6 ^ -1) > -1) {
                            break L4;
                          } else {
                            if (var4[var5].substring(0, var6).trim().equals(param2)) {
                              stackIn_9_0 = var4[var5].substring(1 + var6).trim();
                              decompiledRegionSelector0 = 0;
                              break L1;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var5++;
                        continue L2;
                      }
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var3_ref = decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L5;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 1;
                  break L0;
                } else {
                  stackIn_16_0 = null;
                  decompiledRegionSelector1 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var3 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_19_0 = (RuntimeException) (var3);

                stackIn_19_1 = new StringBuilder().append("ec.B(");

                if (param0 == null) {
                  stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "null";
                  break L6;
                } else {
                  stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "{...}";
                  break L6;
                }
              }
              L7: {


                stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
                  stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                  stackIn_23_2 = "null";
                  break L7;
                } else {
                  stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
                  stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                  stackIn_23_2 = "{...}";
                  break L7;
                }
              }
              throw fa.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return (String) ((Object) stackIn_16_0);
            } else {
              return stackIn_9_0;
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
          if (param2 < -98) {
            wj.b(param0, -120);
            return;
          } else {
            var4 = (String) null;
            ec.a((java.applet.Applet) null, (byte) -12, (String) null);
            wj.b(param0, -120);
            return;
          }
        }
    }

    static {
        field_c = false;
        field_a = "Research";
    }
}
