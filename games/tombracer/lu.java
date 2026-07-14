/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lu {
    static int field_a;
    static String field_c;
    static iv field_b;

    abstract pl a(byte param0);

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        int var1 = 69 / ((param0 - -67) / 32);
    }

    final static void a(int param0, double param1, int param2, int param3, double param4) {
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        if (ga.field_H == param2) {
          if (param3 > 0) {
            L0: {
              vn.field_a = new vna();
              ga.field_H = param3;
              al.field_h = param1;
              if (oh.field_o != 0) {
                break L0;
              } else {
                if (0 >= param0) {
                  break L0;
                } else {
                  jla.field_z = new vna();
                  sua.field_J = param4;
                  oh.field_o = param0;
                  return;
                }
              }
            }
            if (param0 != 0) {
              sua.field_J = param4;
              oh.field_o = param0;
              return;
            } else {
              jla.field_z = null;
              sua.field_J = param4;
              oh.field_o = param0;
              return;
            }
          } else {
            if (-1 == (param3 ^ -1)) {
              vn.field_a = null;
              ga.field_H = param3;
              al.field_h = param1;
              if (oh.field_o == 0) {
                if (0 >= param0) {
                  if (param0 == 0) {
                    jla.field_z = null;
                    sua.field_J = param4;
                    oh.field_o = param0;
                    return;
                  } else {
                    sua.field_J = param4;
                    oh.field_o = param0;
                    return;
                  }
                } else {
                  jla.field_z = new vna();
                  sua.field_J = param4;
                  oh.field_o = param0;
                  return;
                }
              } else {
                if (param0 != 0) {
                  sua.field_J = param4;
                  oh.field_o = param0;
                  return;
                } else {
                  jla.field_z = null;
                  sua.field_J = param4;
                  oh.field_o = param0;
                  return;
                }
              }
            } else {
              ga.field_H = param3;
              al.field_h = param1;
              if (oh.field_o == 0) {
                if (0 >= param0) {
                  if (param0 != 0) {
                    sua.field_J = param4;
                    oh.field_o = param0;
                    return;
                  } else {
                    jla.field_z = null;
                    sua.field_J = param4;
                    oh.field_o = param0;
                    return;
                  }
                } else {
                  jla.field_z = new vna();
                  sua.field_J = param4;
                  oh.field_o = param0;
                  return;
                }
              } else {
                if (param0 != 0) {
                  sua.field_J = param4;
                  oh.field_o = param0;
                  return;
                } else {
                  jla.field_z = null;
                  sua.field_J = param4;
                  oh.field_o = param0;
                  return;
                }
              }
            }
          }
        } else {
          if (-1 == param3) {
            L1: {
              vn.field_a = null;
              ga.field_H = param3;
              al.field_h = param1;
              if (oh.field_o != 0) {
                break L1;
              } else {
                if (0 >= param0) {
                  break L1;
                } else {
                  jla.field_z = new vna();
                  sua.field_J = param4;
                  oh.field_o = param0;
                  return;
                }
              }
            }
            if (param0 != 0) {
              sua.field_J = param4;
              oh.field_o = param0;
              return;
            } else {
              jla.field_z = null;
              sua.field_J = param4;
              oh.field_o = param0;
              return;
            }
          } else {
            ga.field_H = param3;
            al.field_h = param1;
            if (oh.field_o == 0) {
              if (0 >= param0) {
                if (param0 != 0) {
                  sua.field_J = param4;
                  oh.field_o = param0;
                  return;
                } else {
                  jla.field_z = null;
                  sua.field_J = param4;
                  oh.field_o = param0;
                  return;
                }
              } else {
                jla.field_z = new vna();
                sua.field_J = param4;
                oh.field_o = param0;
                return;
              }
            } else {
              if (param0 != 0) {
                sua.field_J = param4;
                oh.field_o = param0;
                return;
              } else {
                jla.field_z = null;
                sua.field_J = param4;
                oh.field_o = param0;
                return;
              }
            }
          }
        }
    }

    abstract void a(uia param0, boolean param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "<%0> has resigned.";
    }
}
