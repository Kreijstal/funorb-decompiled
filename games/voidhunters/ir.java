/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ir extends rqa {
    static String field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 <= -119) {
              stackOut_3_0 = new nc((Object) (Object) frb.a(40, 126));
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (nc) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ir.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
        return stackIn_4_0;
    }

    public static void e(byte param0) {
        field_o = null;
        int var1 = 56;
    }

    final static boolean a(int param0, int param1) {
        coa var3 = null;
        boa var4 = null;
        coa var5 = null;
        boa var6 = null;
        if (param0 < -44) {
          if (param1 == 73) {
            nkb.a(false, "Receiving server info");
            var5 = new coa();
            uw.a((byte) -61, qga.field_b, (tv) (Object) var5);
            if (var5 != null) {
              fwa.field_g = var5;
              return true;
            } else {
              return true;
            }
          } else {
            if (param1 == 74) {
              nkb.a(false, "Receiving player blueprint");
              var6 = new boa();
              uw.a((byte) -84, qga.field_b, (tv) (Object) var6);
              if (var6 != null) {
                hja.a(0, var6.field_c);
                return true;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        } else {
          boolean discarded$1 = ir.a(114, 1);
          if (param1 == 73) {
            nkb.a(false, "Receiving server info");
            var3 = new coa();
            uw.a((byte) -61, qga.field_b, (tv) (Object) var3);
            if (var3 == null) {
              return true;
            } else {
              fwa.field_g = var3;
              return true;
            }
          } else {
            if (param1 == 74) {
              nkb.a(false, "Receiving player blueprint");
              var4 = new boa();
              uw.a((byte) -84, qga.field_b, (tv) (Object) var4);
              if (var4 == null) {
                return true;
              } else {
                hja.a(0, var4.field_c);
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    final static void a(byte param0, long param1, String param2) {
        CharSequence var5 = null;
        try {
            ow.field_b = 2;
            waa.field_x = param2;
            var5 = (CharSequence) (Object) param2;
            nkb.field_o = jwa.a(false, var5);
            fva.field_p = true;
            if (param0 != 39) {
                field_o = null;
            }
            lsa.field_f = param1;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "ir.E(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(ml param0, byte param1) {
        ml var4 = null;
        ml var5 = null;
        try {
            param0.a(1, 10, new ml(13));
            param0.a(1, 9, new ml(13));
            param0.a(1, 8, new ml(13));
            param0.a(1, 0, new ml(13));
            param0.a(1, 1, new ml(13));
            param0.a(1, 7, new ml(13));
            param0.a(1, 4, new ml(26));
            param0.a(1, 11, new ml(13));
            int var3 = 119;
            var4 = new ml(31);
            var4.a(1, 0, new ml(23));
            param0.a(1, 3, var4);
            var5 = new ml(31);
            var5.a(1, 1, new ml(23));
            param0.a(1, 5, var5);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "ir.F(" + (param0 != null ? "{...}" : "null") + 44 + 127 + 41);
        }
    }

    ir(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static tsa a(int param0, qab param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        StringBuilder var3 = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        tsa stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        tsa stackOut_20_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param0 < -8) {
                break L1;
              } else {
                field_o = null;
                break L1;
              }
            }
            int fieldTemp$4 = param1.field_b - 1;
            param1.field_b = param1.field_b - 1;
            var2_int = fieldTemp$4;
            var3 = new StringBuilder();
            L2: while (true) {
              L3: {
                if (param1.a((byte) -123)) {
                  break L3;
                } else {
                  L4: {
                    var4 = param1.a(-104);
                    if (Character.isWhitespace((char) var4)) {
                      break L4;
                    } else {
                      if (var4 == 44) {
                        break L4;
                      } else {
                        if (var4 == 40) {
                          break L4;
                        } else {
                          if (var4 == 41) {
                            break L4;
                          } else {
                            StringBuilder discarded$5 = var3.append(var4);
                            continue L2;
                          }
                        }
                      }
                    }
                  }
                  param1.field_b = param1.field_b - 1;
                  break L3;
                }
              }
              L5: {
                L6: {
                  var5 = var3.toString();
                  if (var5.equals((Object) (Object) "true")) {
                    break L6;
                  } else {
                    if (!var5.equals((Object) (Object) "false")) {
                      L7: {
                        if (45 == var5.charAt(0)) {
                          break L7;
                        } else {
                          if (Character.isDigit(var5.charAt(0))) {
                            break L7;
                          } else {
                            var4 = hpa.field_p;
                            break L5;
                          }
                        }
                      }
                      var4 = fwa.field_h;
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                var4 = io.field_p;
                break L5;
              }
              stackOut_20_0 = new tsa(var4, var2_int, var5);
              stackIn_21_0 = stackOut_20_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("ir.D(").append(param0).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
        return stackIn_21_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Armour";
    }
}
