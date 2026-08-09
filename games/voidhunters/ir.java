/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ir extends rqa {
    static String field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 <= -119) {
              stackIn_4_0 = new nc(frb.a(40, 126));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (nc) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("ir.A(");

            if (param0 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void e(byte param0) {
        field_o = null;
        int var1 = 56 / ((param0 - -47) / 55);
    }

    final static boolean a(int param0, int param1) {
        coa var3;
        boa var4;
        coa var5;
        boa var6;
        if (param0 < -44) {
          if (-74 == (param1 ^ -1)) {
            nkb.a(false, "Receiving server info");
            var5 = new coa();
            uw.a((byte) -61, qga.field_b, var5);
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
              uw.a((byte) -84, qga.field_b, var6);
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
          ir.a(114, 1);
          if (-74 == (param1 ^ -1)) {
            nkb.a(false, "Receiving server info");
            var3 = new coa();
            uw.a((byte) -61, qga.field_b, var3);
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
              uw.a((byte) -84, qga.field_b, var4);
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
            var5 = (CharSequence) ((Object) param2);
            nkb.field_o = jwa.a(false, var5);
            fva.field_p = true;
            if (param0 != 39) {
                field_o = (String) null;
            }
            lsa.field_f = param1;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "ir.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
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
            int var3 = -119 / ((79 - param1) / 47);
            var4 = new ml(31);
            var4.a(1, 0, new ml(23));
            param0.a(1, 3, var4);
            var5 = new ml(31);
            var5.a(1, 1, new ml(23));
            param0.a(1, 5, var5);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "ir.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ir(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static tsa a(int param0, qab param1) {
        int fieldTemp$2 = 0;
        StringBuilder discarded$3 = null;
        int var2_int = 0;
        StringBuilder var3 = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        tsa stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param0 < -8) {
                break L1;
              } else {
                field_o = (String) null;
                break L1;
              }
            }
            fieldTemp$2 = param1.field_b - 1;
            param1.field_b = param1.field_b - 1;
            var2_int = fieldTemp$2;
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
                            discarded$3 = var3.append((char) var4);
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
                  if (var5.equals("true")) {
                    break L6;
                  } else {
                    if (!var5.equals("false")) {
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
              stackIn_21_0 = new tsa(var4, var2_int, var5);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2);

            stackIn_24_1 = new StringBuilder().append("ir.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        return stackIn_21_0;
    }

    static {
        field_o = "Armour";
    }
}
