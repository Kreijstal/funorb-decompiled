/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class uh extends qb {
    static de field_n;
    long[][] field_j;
    String[][] field_m;
    int field_h;
    static long field_p;
    int field_g;
    static java.applet.Applet field_i;
    int[][] field_q;
    boolean field_o;
    int field_k;
    static Random field_l;

    final static dh a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        dh var8;
        var8 = new dh(param5, param3, param0, param6, param4, param7);
        vb.field_c.a(var8, 27362);
        if (param1 <= 49) {
          field_i = (java.applet.Applet) null;
          ke.a(var8, param2, 21719);
          return var8;
        } else {
          ke.a(var8, param2, 21719);
          return var8;
        }
    }

    final static int a(byte param0, int param1, byte[] param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 >= 97) {
              stackIn_4_0 = ml.a(param2, 0, param1, 12011);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 53;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("uh.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw ma.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static kc[] a(int param0, qk param1, int param2, byte param3) {
        RuntimeException var4 = null;
        kc[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (tc.a(param0, param2, param3 + 25552, param1)) {
              L1: {
                if (param3 == -73) {
                  break L1;
                } else {
                  field_n = (de) null;
                  break L1;
                }
              }
              stackIn_6_0 = ol.s(-106);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("uh.F(").append(param0).append(',');

            if (param1 == null) {
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
          throw ma.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    final static boolean a(qk param0, qk param1, qk param2, int param3) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0.b(param3 ^ 6)) {
                break L1;
              } else {
                if (!param0.b(4, "commonui")) {
                  break L1;
                } else {
                  L2: {
                    if (!param2.b(4)) {
                      break L2;
                    } else {
                      if (!param2.b(param3 ^ 6, "commonui")) {
                        break L2;
                      } else {
                        L3: {
                          if (!param1.b(param3 + param3)) {
                            break L3;
                          } else {
                            if (!param1.b(4, "button.gif")) {
                              break L3;
                            } else {
                              return true;
                            }
                          }
                        }
                        stackIn_14_0 = 0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  }
                  stackIn_9_0 = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            stackIn_4_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("uh.D(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L6;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_18_0), stackIn_24_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_14_0 != 0;
          }
        }
    }

    final static void b(byte param0) {
        if (param0 > -62) {
            field_l = (Random) null;
        }
    }

    public static void a(int param0) {
        field_n = null;
        field_l = null;
        if (param0 != -12908) {
            field_l = (Random) null;
            field_i = null;
            return;
        }
        field_i = null;
    }

    final static void a(long param0, int param1, String param2, String param3, java.applet.Applet param4) {
        try {
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            StringBuilder stackIn_14_1 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            StringBuilder stackIn_17_1 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            try {
              L0: {
                try {
                  L1: {
                    var8 = param4.getParameter("cookiehost");
                    var7 = var8;
                    var7 = var8;
                    var9 = param2 + "=" + param3 + "; version=1; path=/; domain=" + var8;
                    var7 = var9;
                    var7 = var9;
                    if (param1 > 95) {
                      L2: {
                        if (0L <= param0) {
                          var7 = var9 + "; Expires=" + h.a(-60, id.a(106) + param0 * 1000L) + "; Max-Age=" + param0;
                          break L2;
                        } else {
                          var7 = var9 + "; Discard;";
                          break L2;
                        }
                      }
                      vh.a(param4, "document.cookie=\"" + var7 + "\"", -12300);
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var6 = decompiledCaughtException;
                  return;
                }
                if (decompiledRegionSelector0 == 0) {
                  break L0;
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_11_0 = (RuntimeException) (var6_ref);

                stackIn_11_1 = new StringBuilder().append("uh.C(").append(param0).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "null";
                  break L3;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "{...}";
                  break L3;
                }
              }
              L4: {


                stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

                if (param3 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "null";
                  break L4;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "{...}";
                  break L4;
                }
              }
              L5: {


                stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

                if (param4 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "null";
                  break L5;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "{...}";
                  break L5;
                }
              }
              throw ma.a((Throwable) ((Object) stackIn_12_0), stackIn_18_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    uh() {
    }

    static {
        field_n = new de(0, 2, 2, 1);
        field_l = new Random();
    }
}
