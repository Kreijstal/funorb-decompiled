/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi {
    static int[] field_f;
    static rc field_b;
    static int field_g;
    static qi field_e;
    static int field_c;
    static String field_d;
    static int field_a;
    static int[] field_h;

    final static boolean b(int param0) {
        java.applet.Applet var2;
        int stackIn_6_0 = 0;
        L0: {
          if (param0 < -100) {
            break L0;
          } else {
            var2 = (java.applet.Applet) null;
            hi.a(-99, 17L, (String) null, (String) null, (java.applet.Applet) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == vg.field_b) {
              break L2;
            } else {
              if (!vg.field_b.a(67)) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final boolean a(int param0) {
        int stackIn_8_0 = 0;
        L0: {
          if (param0 < -41) {
            break L0;
          } else {
            hi.a(false, -36);
            break L0;
          }
        }
        L1: {
          L2: {
            if (ck.field_I == this) {
              break L2;
            } else {
              if (this == pj.field_w) {
                break L2;
              } else {
                if (ll.field_Q != this) {
                  stackIn_8_0 = 0;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          stackIn_8_0 = 1;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    public static void a(boolean param0) {
        field_f = null;
        field_e = null;
        field_d = null;
        if (param0) {
            field_c = -26;
        }
        field_h = null;
        field_b = null;
    }

    final static void a(int param0, String param1) {
        try {
            if (param0 != -23883) {
                hi.a(true);
            }
            e.field_I = param1;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "hi.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, long param1, String param2, String param3, java.applet.Applet param4) {
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
            String var7 = null;
            String var8 = null;
            String var9 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var8 = param4.getParameter("cookiehost");
                      var7 = var8;
                      var7 = var8;
                      var9 = param2 + "=" + param3 + "; version=1; path=/; domain=" + var8;
                      var7 = var9;
                      var7 = var9;
                      if (param1 < (long)param0) {
                        var7 = var9 + "; Discard;";
                        break L2;
                      } else {
                        var7 = var9 + "; Expires=" + e.a(lk.a(0) + param1 * 1000L, (byte) -78) + "; Max-Age=" + param1;
                        break L2;
                      }
                    }
                    kj.a(12, "document.cookie=\"" + var7 + "\"", param4);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var6 = decompiledCaughtException;
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_9_0 = (RuntimeException) (var6_ref);

                stackIn_9_1 = new StringBuilder().append("hi.C(").append(param0).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackIn_10_2 = "null";
                  break L4;
                } else {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackIn_10_2 = "{...}";
                  break L4;
                }
              }
              L5: {


                stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

                if (param3 == null) {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackIn_13_2 = "null";
                  break L5;
                } else {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackIn_13_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

                if (param4 == null) {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "null";
                  break L6;
                } else {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "{...}";
                  break L6;
                }
              }
              throw ch.a((Throwable) ((Object) stackIn_10_0), stackIn_16_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(boolean param0, int param1) {
        if (param0) {
            return 34;
        }
        param1 = (param1 >>> 333737441 & 1431655765) + (1431655765 & param1);
        param1 = ((-858993458 & param1) >>> -1687961598) + (858993459 & param1);
        param1 = (param1 >>> 32002276) + param1 & 252645135;
        param1 = param1 + (param1 >>> 17530856);
        param1 = param1 + (param1 >>> 1487909776);
        return 255 & param1;
    }

    static {
        $cfr$clinit: {
            int var0;
            int var1;
            int var2;
            field_f = new int[256];
            var1 = 0;
            L0: while (true) {
              if (-257 >= (var1 ^ -1)) {
                field_b = new rc();
                field_g = 0;
                field_e = new qi();
                field_d = "en-gb";
                field_a = 1;
                field_h = new int[8192];
                break $cfr$clinit;
              } else {
                var0 = var1;
                var2 = 0;
                L1: while (true) {
                  if (var2 >= 8) {
                    field_f[var1] = var0;
                    var1++;
                    continue L0;
                  } else {
                    if (-2 != (1 & var0 ^ -1)) {
                      var0 = var0 >>> 1;
                      var2++;
                      continue L1;
                    } else {
                      var0 = -306674912 ^ var0 >>> -296390207;
                      var2++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }
}
