/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj extends rqa {
    static String field_o;
    static String field_p;

    aj(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(byte param0) {
        field_p = null;
        field_o = null;
        if (param0 != 32) {
            aj.e((byte) 122);
        }
    }

    final nc a(nc[] param0, int param1) {
        oq.field_s = param0[0].a(125);
        if (param1 > -119) {
          field_o = null;
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    final static void a(String param0, byte param1, int param2) {
        int var3 = 0;
        rg.field_b = false;
        vu.field_xb = false;
        if (hwa.field_o != null) {
          if (hwa.field_o.field_z) {
            L0: {
              var3 = 1;
              if (-9 == (param2 ^ -1)) {
                L1: {
                  if (!tla.field_c) {
                    param0 = vj.field_p;
                    break L1;
                  } else {
                    param0 = uaa.field_p;
                    break L1;
                  }
                }
                param2 = 2;
                jt.field_o.a((byte) 9, qsb.field_d);
                break L0;
              } else {
                break L0;
              }
            }
            L2: {
              if ((param2 ^ -1) != -11) {
                break L2;
              } else {
                qob.a(92);
                var3 = 0;
                break L2;
              }
            }
            L3: {
              if (var3 == 0) {
                break L3;
              } else {
                L4: {
                  if (!vu.field_xb) {
                    break L4;
                  } else {
                    param0 = isa.a(vpb.field_o, new String[1], 107);
                    break L4;
                  }
                }
                L5: {
                  if (kmb.field_c) {
                    param0 = bbb.field_a;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                hwa.field_o.a(true, param0, param2);
                break L3;
              }
            }
            if (param2 != 256) {
              if (-11 != (param2 ^ -1)) {
                if (tla.field_c) {
                  if (param1 < 5) {
                    field_p = null;
                    return;
                  } else {
                    return;
                  }
                } else {
                  jt.field_o.i((byte) -29);
                  if (param1 < 5) {
                    field_p = null;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                if (param1 < 5) {
                  field_p = null;
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (param1 < 5) {
                field_p = null;
                return;
              } else {
                return;
              }
            }
          } else {
            if (param1 < 5) {
              field_p = null;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param1 < 5) {
            field_p = null;
            return;
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Repair mode in <%0>";
        field_p = "Options Menu";
    }
}
