/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jm extends rqa {
    static String field_o;

    public static void e(byte param0) {
        if (param0 != 71) {
            return;
        }
        field_o = null;
    }

    final static sr a(int param0, int param1) {
        sr var2 = null;
        sr var2_ref = null;
        byte[] var3 = null;
        var2 = (sr) us.field_d.b(param1, (long)param0);
        if (var2 != null) {
          return var2;
        } else {
          var3 = rw.field_l.a(0, param0, (byte) 13);
          var2_ref = new sr();
          if (var3 != null) {
            var2_ref.a(param0, new ds(var3), (byte) 11);
            us.field_d.a((Object) (Object) var2_ref, (long)param0, (byte) -117);
            return var2_ref;
          } else {
            us.field_d.a((Object) (Object) var2_ref, (long)param0, (byte) -117);
            return var2_ref;
          }
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          field_o = null;
          return new nc((Object) (Object) frb.a(123, 74));
        } else {
          return new nc((Object) (Object) frb.a(123, 74));
        }
    }

    jm(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static String a(byte param0, String param1, int param2) {
        if (param2 != 3) {
          if (param0 < -113) {
            if ((param2 ^ -1) != -7) {
              if ((param2 ^ -1) != -8) {
                if (8 == param2) {
                  return fha.field_q;
                } else {
                  if (param2 == 9) {
                    return sla.field_o;
                  } else {
                    if ((param2 ^ -1) != -11) {
                      if (param2 == -12) {
                        return qia.field_p;
                      } else {
                        if (-15 != param2) {
                          return null;
                        } else {
                          return isa.a(gwa.field_p, new String[1], 119);
                        }
                      }
                    } else {
                      return mlb.field_p;
                    }
                  }
                }
              } else {
                return lra.field_o;
              }
            } else {
              return tda.field_O;
            }
          } else {
            field_o = null;
            if ((param2 ^ -1) != -7) {
              if ((param2 ^ -1) != -8) {
                if (8 == param2) {
                  return fha.field_q;
                } else {
                  if (param2 == 9) {
                    return sla.field_o;
                  } else {
                    if ((param2 ^ -1) != -11) {
                      if (param2 == -12) {
                        return qia.field_p;
                      } else {
                        if (-15 != param2) {
                          return null;
                        } else {
                          return isa.a(gwa.field_p, new String[1], 119);
                        }
                      }
                    } else {
                      return mlb.field_p;
                    }
                  }
                }
              } else {
                return lra.field_o;
              }
            } else {
              return tda.field_O;
            }
          }
        } else {
          return kg.field_q;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Month";
    }
}
