/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tm {
    private ah field_d;
    private hl field_a;
    static String[] field_b;
    static long field_c;

    final hl a(hl param0, byte param1) {
        hl var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        hl stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        hl stackOut_8_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                var3 = ((tm) this).field_d.field_e.field_h;
                break L1;
              } else {
                var3 = param0;
                break L1;
              }
            }
            if (var3 != ((tm) this).field_d.field_e) {
              L2: {
                ((tm) this).field_a = var3.field_h;
                if (param1 < -100) {
                  break L2;
                } else {
                  ((tm) this).field_a = null;
                  break L2;
                }
              }
              stackOut_8_0 = (hl) var3;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            } else {
              ((tm) this).field_a = null;
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (hl) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("tm.A(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 41);
        }
        return stackIn_9_0;
    }

    final static void a(int param0, String param1, java.applet.Applet param2) {
        try {
            String var6 = null;
            String var5 = null;
            String var4 = null;
            String var7 = null;
            try {
                il.field_a = param1;
                try {
                    var6 = param2.getParameter("cookieprefix");
                    var5 = var6;
                    var5 = var6;
                    var4 = param2.getParameter("cookiehost");
                    var5 = var4;
                    var5 = var4;
                    var7 = var6 + "settings=" + param1 + "; version=1; path=/; domain=" + var4;
                    var5 = var7;
                    var5 = var7;
                    if (param1.length() == 0) {
                        var5 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        var5 = var7 + "; Expires=" + cd.a(69, bb.b(-1) - -94608000000L) + "; Max-Age=" + 94608000L;
                    }
                    eo.a(param2, -31645, "document.cookie=\"" + var5 + "\"");
                } catch (Throwable throwable) {
                }
                int discarded$0 = 49;
                bb.a(param2);
            } catch (RuntimeException runtimeException) {
                throw kk.a((Throwable) (Object) runtimeException, "tm.G(" + -32312 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final hl a(int param0) {
        hl var2 = null;
        var2 = ((tm) this).field_d.field_e.field_a;
        if (param0 == 8115) {
          if (var2 == ((tm) this).field_d.field_e) {
            ((tm) this).field_a = null;
            return null;
          } else {
            ((tm) this).field_a = var2.field_a;
            return var2;
          }
        } else {
          return null;
        }
    }

    final static boolean b(boolean param0) {
        return !fj.field_o.a(250);
    }

    final hl a(int param0, hl param1) {
        hl var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_7_0 = null;
        hl stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        hl stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -10279) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            L2: {
              if (param1 == null) {
                var3 = ((tm) this).field_d.field_e.field_a;
                break L2;
              } else {
                var3 = param1;
                break L2;
              }
            }
            if (var3 != ((tm) this).field_d.field_e) {
              ((tm) this).field_a = var3.field_a;
              stackOut_8_0 = (hl) var3;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            } else {
              ((tm) this).field_a = null;
              stackOut_6_0 = null;
              stackIn_7_0 = stackOut_6_0;
              return (hl) (Object) stackIn_7_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("tm.C(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_9_0;
    }

    public static void b() {
        int var1 = 15;
        field_b = null;
    }

    final hl a(boolean param0) {
        hl var2 = null;
        var2 = ((tm) this).field_a;
        if (var2 == ((tm) this).field_d.field_e) {
          ((tm) this).field_a = null;
          return null;
        } else {
          if (param0) {
            return null;
          } else {
            ((tm) this).field_a = var2.field_a;
            return var2;
          }
        }
    }

    final hl a(byte param0) {
        hl var2 = null;
        Object var3 = null;
        if (param0 == -104) {
          var2 = ((tm) this).field_a;
          if (((tm) this).field_d.field_e == var2) {
            ((tm) this).field_a = null;
            return null;
          } else {
            ((tm) this).field_a = var2.field_h;
            return var2;
          }
        } else {
          var3 = null;
          hl discarded$2 = ((tm) this).a(-43, (hl) null);
          var2 = ((tm) this).field_a;
          if (((tm) this).field_d.field_e == var2) {
            ((tm) this).field_a = null;
            return null;
          } else {
            ((tm) this).field_a = var2.field_h;
            return var2;
          }
        }
    }

    tm(ah param0) {
        try {
            ((tm) this).field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "tm.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final hl c(byte param0) {
        hl var2 = null;
        int var3 = 0;
        var3 = -72 % ((param0 - -65) / 49);
        var2 = ((tm) this).field_d.field_e.field_h;
        if (var2 == ((tm) this).field_d.field_e) {
          ((tm) this).field_a = null;
          return null;
        } else {
          ((tm) this).field_a = var2.field_h;
          return var2;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 20000000L;
        field_b = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
