/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iva extends rqa {
    static int field_p;
    static int field_o;

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          field_p = -95;
          return new nc((Object) (Object) frb.a(135, 116));
        } else {
          return new nc((Object) (Object) frb.a(135, 116));
        }
    }

    final static String a(byte param0, int param1, sg param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        var3 = param2.q((byte) 87);
        if (param0 <= -3) {
          var7 = VoidHunters.b(var3, -1);
          var5 = param1;
          if (-1 != var5) {
            if (-5 != var5) {
              if (1 != var5) {
                if (-6 != (var5 ^ -1)) {
                  if (var5 != 2) {
                    if (var5 != 6) {
                      if ((var5 ^ -1) != -4) {
                        return cma.a(var7, dob.field_o, gu.field_o, (byte) -74);
                      } else {
                        return cma.a(var7, dob.field_o, cib.field_a, (byte) -126);
                      }
                    } else {
                      return cma.a(var7, dob.field_o, kg.field_t, (byte) -91);
                    }
                  } else {
                    return cma.a(var7, dob.field_o, kg.field_t, (byte) -91);
                  }
                } else {
                  return cma.a(var7, dob.field_o, iua.field_o, (byte) -96);
                }
              } else {
                return cma.a(var7, dob.field_o, iua.field_o, (byte) -96);
              }
            } else {
              return cma.a(var7, dob.field_o, cib.field_a, (byte) -64);
            }
          } else {
            return cma.a(var7, dob.field_o, cib.field_a, (byte) -64);
          }
        } else {
          field_o = 21;
          var6 = VoidHunters.b(var3, -1);
          var4 = var6;
          var5 = param1;
          if (-1 != var5) {
            if (-5 != var5) {
              if (1 != var5) {
                if (-6 != (var5 ^ -1)) {
                  if (var5 != 2) {
                    if (var5 != 6) {
                      if ((var5 ^ -1) != -4) {
                        return cma.a(var6, dob.field_o, gu.field_o, (byte) -74);
                      } else {
                        return cma.a(var6, dob.field_o, cib.field_a, (byte) -126);
                      }
                    } else {
                      return cma.a(var6, dob.field_o, kg.field_t, (byte) -91);
                    }
                  } else {
                    return cma.a(var6, dob.field_o, kg.field_t, (byte) -91);
                  }
                } else {
                  return cma.a(var6, dob.field_o, iua.field_o, (byte) -96);
                }
              } else {
                return cma.a(var6, dob.field_o, iua.field_o, (byte) -96);
              }
            } else {
              return cma.a(var6, dob.field_o, cib.field_a, (byte) -64);
            }
          } else {
            return cma.a(var6, dob.field_o, cib.field_a, (byte) -64);
          }
        }
    }

    final static void a(int param0, String param1) {
        Object var3 = null;
        if (param0 == -6940) {
          if (nia.field_o) {
            System.out.println(param1);
            return;
          } else {
            return;
          }
        } else {
          var3 = null;
          iva.a(-26, (String) null);
          if (!nia.field_o) {
            return;
          } else {
            System.out.println(param1);
            return;
          }
        }
    }

    iva(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 115;
    }
}
