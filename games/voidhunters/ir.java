/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ir extends rqa {
    static String field_o;

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            return null;
        }
        return new nc((Object) (Object) frb.a(40, 126));
    }

    public static void e(byte param0) {
        field_o = null;
        int var1 = 56 / ((param0 - -47) / 55);
    }

    final static boolean a(int param0, int param1) {
        coa var3 = null;
        boa var4 = null;
        coa var5 = null;
        boa var6 = null;
        if (param0 < -44) {
          if (-74 == (param1 ^ -1)) {
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
          if (-74 == (param1 ^ -1)) {
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
        ow.field_b = 2;
        waa.field_x = param2;
        var5 = (CharSequence) (Object) param2;
        nkb.field_o = jwa.a(false, var5);
        fva.field_p = true;
        if (param0 != 39) {
          field_o = null;
          lsa.field_f = param1;
          return;
        } else {
          lsa.field_f = param1;
          return;
        }
    }

    final static void a(ml param0, byte param1) {
        param0.a(1, 10, new ml(13));
        param0.a(1, 9, new ml(13));
        param0.a(1, 8, new ml(13));
        param0.a(1, 0, new ml(13));
        param0.a(1, 1, new ml(13));
        param0.a(1, 7, new ml(13));
        param0.a(1, 4, new ml(26));
        param0.a(1, 11, new ml(13));
        int var3 = -119 / ((79 - param1) / 47);
        ml var4 = new ml(31);
        var4.a(1, 0, new ml(23));
        param0.a(1, 3, var4);
        ml var5 = new ml(31);
        var5.a(1, 1, new ml(23));
        param0.a(1, 5, var5);
    }

    ir(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static tsa a(int param0, qab param1) {
        int var2 = 0;
        StringBuilder var3 = null;
        int var4 = 0;
        int var6 = 0;
        StringBuilder var7 = null;
        String var8 = null;
        String var12 = null;
        StringBuilder var22 = null;
        String var23 = null;
        String var26 = null;
        var6 = VoidHunters.field_G;
        if (param0 < -8) {
          param1.field_b = param1.field_b - 1;
          var2 = param1.field_b - 1;
          var7 = new StringBuilder();
          var3 = var7;
          L0: while (true) {
            if (!param1.a((byte) -123)) {
              L1: {
                var4 = param1.a(-104);
                if (Character.isWhitespace((char) var4)) {
                  break L1;
                } else {
                  if (var4 == 44) {
                    break L1;
                  } else {
                    if (var4 == 40) {
                      break L1;
                    } else {
                      if (var4 == 41) {
                        break L1;
                      } else {
                        StringBuilder discarded$2 = var7.append(var4);
                        continue L0;
                      }
                    }
                  }
                }
              }
              param1.field_b = param1.field_b - 1;
              var12 = var7.toString();
              if (!var12.equals((Object) (Object) "true")) {
                if (!var12.equals((Object) (Object) "false")) {
                  if (45 != var12.charAt(0)) {
                    if (Character.isDigit(var12.charAt(0))) {
                      var4 = fwa.field_h;
                      return new tsa(var4, var2, var12);
                    } else {
                      var4 = hpa.field_p;
                      return new tsa(var4, var2, var12);
                    }
                  } else {
                    var4 = fwa.field_h;
                    return new tsa(var4, var2, var12);
                  }
                } else {
                  var4 = io.field_p;
                  return new tsa(var4, var2, var12);
                }
              } else {
                var4 = io.field_p;
                return new tsa(var4, var2, var12);
              }
            } else {
              L2: {
                L3: {
                  var8 = var7.toString();
                  if (var8.equals((Object) (Object) "true")) {
                    break L3;
                  } else {
                    if (!var8.equals((Object) (Object) "false")) {
                      L4: {
                        if (45 == var8.charAt(0)) {
                          break L4;
                        } else {
                          if (Character.isDigit(var8.charAt(0))) {
                            break L4;
                          } else {
                            var4 = hpa.field_p;
                            break L2;
                          }
                        }
                      }
                      var4 = fwa.field_h;
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var4 = io.field_p;
                break L2;
              }
              return new tsa(var4, var2, var8);
            }
          }
        } else {
          field_o = null;
          param1.field_b = param1.field_b - 1;
          var2 = param1.field_b - 1;
          var22 = new StringBuilder();
          var3 = var22;
          L5: while (true) {
            if (param1.a((byte) -123)) {
              var26 = var22.toString();
              if (var26.equals((Object) (Object) "true")) {
                var4 = io.field_p;
                return new tsa(var4, var2, var26);
              } else {
                if (!var26.equals((Object) (Object) "false")) {
                  L6: {
                    if (45 == var26.charAt(0)) {
                      break L6;
                    } else {
                      if (Character.isDigit(var26.charAt(0))) {
                        break L6;
                      } else {
                        var4 = hpa.field_p;
                        return new tsa(var4, var2, var26);
                      }
                    }
                  }
                  var4 = fwa.field_h;
                  return new tsa(var4, var2, var26);
                } else {
                  var4 = io.field_p;
                  return new tsa(var4, var2, var26);
                }
              }
            } else {
              L7: {
                var4 = param1.a(-104);
                if (Character.isWhitespace((char) var4)) {
                  break L7;
                } else {
                  if (var4 == 44) {
                    break L7;
                  } else {
                    if (var4 == 40) {
                      break L7;
                    } else {
                      if (var4 == 41) {
                        break L7;
                      } else {
                        StringBuilder discarded$3 = var22.append(var4);
                        continue L5;
                      }
                    }
                  }
                }
              }
              L8: {
                L9: {
                  param1.field_b = param1.field_b - 1;
                  var23 = var22.toString();
                  if (var23.equals((Object) (Object) "true")) {
                    break L9;
                  } else {
                    if (!var23.equals((Object) (Object) "false")) {
                      L10: {
                        if (45 == var23.charAt(0)) {
                          break L10;
                        } else {
                          if (Character.isDigit(var23.charAt(0))) {
                            break L10;
                          } else {
                            var4 = hpa.field_p;
                            break L8;
                          }
                        }
                      }
                      var4 = fwa.field_h;
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
                var4 = io.field_p;
                break L8;
              }
              return new tsa(var4, var2, var23);
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Armour";
    }
}
