/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl {
    int field_c;
    static boolean field_o;
    int field_j;
    int field_h;
    int field_n;
    int field_d;
    static String field_a;
    byte[] field_e;
    int field_b;
    static mp field_i;
    static int field_l;
    static String[] field_p;
    byte[] field_g;
    static boolean field_k;
    static String field_m;
    int field_f;

    final static void a(int param0, long param1, java.applet.Applet param2, String param3, String param4) {
        try {
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            try {
              try {
                L0: {
                  L1: {
                    var8 = param2.getParameter("cookiehost");
                    var7 = var8;
                    var7 = var8;
                    if (param0 == -11) {
                      break L1;
                    } else {
                      field_o = false;
                      break L1;
                    }
                  }
                  L2: {
                    var9 = param4 + "=" + param3 + "; version=1; path=/; domain=" + var8;
                    var7 = var9;
                    var7 = var9;
                    if (-1L >= (param1 ^ -1L)) {
                      var7 = var9 + "; Expires=" + uh.a((byte) -66, param1 * 1000L + gk.a(param0 ^ -95)) + "; Max-Age=" + param1;
                      break L2;
                    } else {
                      var7 = var9 + "; Discard;";
                      break L2;
                    }
                  }
                  je.a(param2, "document.cookie=\"" + var7 + "\"", (byte) 124);
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
              L3: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_9_0 = (RuntimeException) (var6_ref);
                stackOut_9_1 = new StringBuilder().append("gl.A(").append(param0).append(',').append(param1).append(',');
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param2 == null) {
                  stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackOut_11_2 = "null";
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L3;
                } else {
                  stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackOut_10_2 = "{...}";
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L3;
                }
              }
              L4: {
                stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                if (param3 == null) {
                  stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackOut_14_2 = "null";
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  break L4;
                } else {
                  stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackOut_13_2 = "{...}";
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  break L4;
                }
              }
              L5: {
                stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                if (param4 == null) {
                  stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackOut_17_2 = "null";
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  stackIn_18_2 = stackOut_17_2;
                  break L5;
                } else {
                  stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackOut_16_2 = "{...}";
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  break L5;
                }
              }
              throw wn.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        kg.c((byte) 76);
        if (param0 != 26780) {
          field_o = false;
          nn.a(1, ia.field_G, r.field_f, re.field_k, kb.field_d[0].field_x, nl.field_k);
          return;
        } else {
          nn.a(1, ia.field_G, r.field_f, re.field_k, kb.field_d[0].field_x, nl.field_k);
          return;
        }
    }

    final static String a(int param0, boolean param1, boolean param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        String var11 = null;
        String var12 = null;
        int var13 = 0;
        var13 = Vertigo2.field_L ? 1 : 0;
        var4 = param3 % 50;
        var4 = var4 * 2;
        var5 = param3 / 50;
        var6 = var5 / 60;
        var5 = var5 % 60;
        var7 = var6 / 60;
        if (param0 < -26) {
          L0: {
            var6 = var6 % 60;
            if (10 > var4) {
              var8 = "0" + var4;
              var9 = var8;
              var10 = var9;
              var9 = var8;
              break L0;
            } else {
              var8 = Integer.toString(var4);
              break L0;
            }
          }
          L1: {
            if (-11 >= (var5 ^ -1)) {
              var9 = Integer.toString(var5);
              var10 = var9;
              var12 = var10;
              var10 = var9;
              break L1;
            } else {
              var9 = "0" + var5;
              break L1;
            }
          }
          L2: {
            if (10 > var6) {
              var10 = "0" + var6;
              var12 = var10;
              var12 = var10;
              break L2;
            } else {
              var10 = Integer.toString(var6);
              break L2;
            }
          }
          var11 = Integer.toString(var7);
          var12 = var11;
          var12 = var11;
          var12 = "";
          if (!param2) {
            if (-1 > (var7 ^ -1)) {
              L3: {
                var12 = var11 + ":" + var10 + ":" + var9;
                if (!param1) {
                  break L3;
                } else {
                  var12 = var12 + "." + var8;
                  break L3;
                }
              }
              return var12;
            } else {
              L4: {
                var12 = var10 + ":" + var9;
                if (!param1) {
                  break L4;
                } else {
                  var12 = var12 + "." + var8;
                  break L4;
                }
              }
              return var12;
            }
          } else {
            var12 = var11 + ":" + var10 + ":" + var9;
            L5: {
              if (!param1) {
                break L5;
              } else {
                var12 = var12 + "." + var8;
                break L5;
              }
            }
            return var12;
          }
        } else {
          return (String) null;
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          field_i = (mp) null;
          field_i = null;
          field_p = null;
          field_m = null;
          field_a = null;
          return;
        } else {
          field_i = null;
          field_p = null;
          field_m = null;
          field_a = null;
          return;
        }
    }

    static {
        field_o = false;
        field_a = "This entry doesn't match";
        field_m = "Day";
    }
}
