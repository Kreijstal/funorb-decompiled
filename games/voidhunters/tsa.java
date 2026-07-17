/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tsa extends ksa {
    String field_d;
    int field_e;
    static int field_h;
    int field_g;
    ij field_f;

    public final String toString() {
        if (((tsa) this).field_e != hpa.field_p) {
          if (fwa.field_h == ((tsa) this).field_e) {
            return "Number{" + ((tsa) this).field_d + "}";
          } else {
            if (io.field_p == ((tsa) this).field_e) {
              return "Boolean{" + ((tsa) this).field_d + "}";
            } else {
              if (((tsa) this).field_e == ek.field_o) {
                return "Char{" + ((tsa) this).field_d + "}";
              } else {
                if (dla.field_d != ((tsa) this).field_e) {
                  if (((tsa) this).field_e != wdb.field_vb) {
                    if (ua.field_o == ((tsa) this).field_e) {
                      return "ArgEnd";
                    } else {
                      if (jwa.field_l == ((tsa) this).field_e) {
                        return "ArgComma";
                      } else {
                        return "Unknown";
                      }
                    }
                  } else {
                    return "ArgStart";
                  }
                } else {
                  return "String{" + ((tsa) this).field_d + "}";
                }
              }
            }
          }
        } else {
          return "Method{" + ((tsa) this).field_d + "}";
        }
    }

    final nc a(byte param0, rqa[] param1) throws gva, ojb {
        NumberFormatException var3 = null;
        RuntimeException var3_ref = null;
        nc[] var3_array = null;
        int var3_int = 0;
        int var4 = 0;
        Object var5 = null;
        int var6 = 0;
        nc[] var7 = null;
        String var8 = null;
        Object stackIn_3_0 = null;
        nc stackIn_10_0 = null;
        nc stackIn_16_0 = null;
        nc stackIn_19_0 = null;
        nc stackIn_23_0 = null;
        nc stackIn_25_0 = null;
        nc stackIn_29_0 = null;
        nc stackIn_35_0 = null;
        nc stackIn_39_0 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        Throwable decompiledCaughtException = null;
        nc stackOut_9_0 = null;
        nc stackOut_15_0 = null;
        nc stackOut_22_0 = null;
        nc stackOut_24_0 = null;
        nc stackOut_18_0 = null;
        nc stackOut_28_0 = null;
        nc stackOut_38_0 = null;
        nc stackOut_34_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var5 = null;
        var6 = VoidHunters.field_G;
        try {
          if (param0 > 60) {
            if (((tsa) this).field_e == hpa.field_p) {
              var7 = new nc[((tsa) this).field_f.c(3)];
              var3_array = var7;
              var4 = 0;
              var5 = (Object) (Object) (tsa) (Object) ((tsa) this).field_f.d(0);
              L0: while (true) {
                if (var5 == null) {
                  int discarded$2 = -124;
                  stackOut_9_0 = fjb.a(((tsa) var5).field_d, var3_array, param1);
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  int incrementValue$3 = var4;
                  var4++;
                  var7[incrementValue$3] = ((tsa) var5).a((byte) 96, param1);
                  var5 = (Object) (Object) (tsa) (Object) ((tsa) var5).field_f.a((byte) 69);
                  continue L0;
                }
              }
            } else {
              if (((tsa) var5).field_e == fwa.field_h) {
                var3_int = Character.toLowerCase(((tsa) var5).field_d.charAt(((tsa) var5).field_d.length() + -1));
                if (var3_int == 102) {
                  stackOut_15_0 = new nc(Float.valueOf(((tsa) var5).field_d).floatValue());
                  stackIn_16_0 = stackOut_15_0;
                  return stackIn_16_0;
                } else {
                  if (var3_int != 108) {
                    if (-1 != ((tsa) var5).field_d.indexOf('.')) {
                      stackOut_22_0 = new nc(Double.valueOf(((tsa) var5).field_d).doubleValue());
                      stackIn_23_0 = stackOut_22_0;
                      return stackIn_23_0;
                    } else {
                      stackOut_24_0 = new nc(Integer.parseInt(((tsa) var5).field_d));
                      stackIn_25_0 = stackOut_24_0;
                      return stackIn_25_0;
                    }
                  } else {
                    stackOut_18_0 = new nc(Long.parseLong(((tsa) var5).field_d.substring(0, -1 + ((tsa) var5).field_d.length())));
                    stackIn_19_0 = stackOut_18_0;
                    return stackIn_19_0;
                  }
                }
              } else {
                if (io.field_p == ((tsa) var5).field_e) {
                  stackOut_28_0 = new nc(((tsa) var5).field_d.equals((Object) (Object) "true"));
                  stackIn_29_0 = stackOut_28_0;
                  return stackIn_29_0;
                } else {
                  if (((tsa) var5).field_e != ek.field_o) {
                    if (dla.field_d == ((tsa) var5).field_e) {
                      stackOut_38_0 = new nc((Object) (Object) ((tsa) var5).field_d.substring(1, ((tsa) var5).field_d.length() - 1));
                      stackIn_39_0 = stackOut_38_0;
                      return stackIn_39_0;
                    } else {
                      throw new IllegalArgumentException();
                    }
                  } else {
                    var8 = ((tsa) var5).field_d.substring(1, ((tsa) var5).field_d.length() + -1);
                    if (var8.length() != 1) {
                      throw new gva("Invalid char value: " + var8);
                    } else {
                      stackOut_34_0 = new nc(var8.charAt(0));
                      stackIn_35_0 = stackOut_34_0;
                      return stackIn_35_0;
                    }
                  }
                }
              }
            }
          } else {
            stackOut_2_0 = null;
            stackIn_3_0 = stackOut_2_0;
            return (nc) (Object) stackIn_3_0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (NumberFormatException) (Object) decompiledCaughtException;
          throw new gva("NumberFormatException on: " + ((tsa) var5).field_d);
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L1: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) var3_ref;
            stackOut_43_1 = new StringBuilder().append("tsa.A(").append(param0).append(44);
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param1 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L1;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + 41);
        }
    }

    tsa(int param0, int param1, String param2) {
        try {
            ((tsa) this).field_d = param2;
            ((tsa) this).field_e = param0;
            ((tsa) this).field_g = param1;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "tsa.<init>(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    tsa(int param0, int param1) {
        this(param0, param1, (String) null);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = -1;
    }
}
