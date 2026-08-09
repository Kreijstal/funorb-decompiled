/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll {
    static int field_a;
    static int[] field_b;
    static boolean field_c;
    static int[][] field_d;

    final static String a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 0) {
              stackIn_4_0 = tc.a((byte) -114, param1, param1.length, 0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("ll.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(byte param0, boolean param1) {
        vi.field_q = 0;
        vi.field_p = ke.field_c;
        el.field_e = 0;
        uj.field_d = 0;
        si.field_ob = new sd(2);
        if (param0 != 49) {
          return;
        } else {
          si.field_ob.a(-1, param1, kk.a(param0 + 10423, ef.field_j, jb.field_b), param0 + -134);
          return;
        }
    }

    public static void b(int param0) {
        field_d = (int[][]) null;
        field_b = null;
        if (param0 != 1000) {
            ll.a((byte) -104, false);
        }
    }

    final static void a(String param0, long param1, byte param2, java.applet.Applet param3, String param4) {
        try {
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            StringBuilder stackIn_12_1 = null;
            StringBuilder stackIn_13_1 = null;
            String stackIn_13_2 = null;
            StringBuilder stackIn_15_1 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            int var7 = 0;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            try {
              try {
                L0: {
                  L1: {
                    var9 = param3.getParameter("cookiehost");
                    var8 = var9;
                    var8 = var9;
                    var7 = 27 % ((param2 - 35) / 56);
                    var10 = param4 + "=" + param0 + "; version=1; path=/; domain=" + var9;
                    var8 = var10;
                    var8 = var10;
                    if ((param1 ^ -1L) <= -1L) {
                      var8 = var10 + "; Expires=" + wc.a(1000L * param1 + ll.a(1000), -1) + "; Max-Age=" + param1;
                      break L1;
                    } else {
                      var8 = var10 + "; Discard;";
                      break L1;
                    }
                  }
                  cd.a(param3, 13162, "document.cookie=\"" + var8 + "\"");
                  break L0;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6 = decompiledCaughtException;
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_9_0 = (RuntimeException) (var6_ref);

                stackIn_9_1 = new StringBuilder().append("ll.B(");

                if (param0 == null) {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackIn_10_2 = "null";
                  break L2;
                } else {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackIn_10_2 = "{...}";
                  break L2;
                }
              }
              L3: {


                stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');

                if (param3 == null) {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackIn_13_2 = "null";
                  break L3;
                } else {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackIn_13_2 = "{...}";
                  break L3;
                }
              }
              L4: {


                stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

                if (param4 == null) {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "null";
                  break L4;
                } else {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "{...}";
                  break L4;
                }
              }
              throw qk.a((Throwable) ((Object) stackIn_10_0), stackIn_16_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final synchronized static long a(int param0) {
        long var1;
        var1 = System.currentTimeMillis();
        if ((var1 ^ -1L) <= (sh.field_n ^ -1L)) {
          if (param0 != 1000) {
            ll.a(101);
            sh.field_n = var1;
            return var1 + ba.field_i;
          } else {
            sh.field_n = var1;
            return var1 + ba.field_i;
          }
        } else {
          ba.field_i = ba.field_i + (sh.field_n + -var1);
          if (param0 == 1000) {
            sh.field_n = var1;
            return var1 + ba.field_i;
          } else {
            ll.a(101);
            sh.field_n = var1;
            return var1 + ba.field_i;
          }
        }
    }

    static {
        field_a = -1;
        field_c = true;
        field_b = new int[128];
    }
}
