/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lt {
    static ut[] field_d;
    static String field_e;
    static int[] field_a;
    static ut[] field_c;
    static String field_b;

    public static void a(int param0) {
        if (param0 >= -114) {
          lt.a(107);
          field_a = null;
          field_c = null;
          field_d = null;
          field_e = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_c = null;
          field_d = null;
          field_e = null;
          field_b = null;
          return;
        }
    }

    final static int a(byte param0) {
        if (param0 != 40) {
            return -111;
        }
        return 1;
    }

    final static int[] a(int param0, int param1, la[] param2, int param3, int param4, int param5, int param6, int param7) {
        Object var9 = null;
        ao.field_b[1] = param5;
        ao.field_b[5] = param7;
        ao.field_b[3] = param0;
        ao.field_b[0] = param6;
        ao.field_b[4] = param1;
        ao.field_b[2] = param4;
        if (pe.a(param2, (byte) -124, ao.field_b)) {
          ao.field_b[0] = ao.field_b[0] + ao.field_b[3];
          if (pe.a(param2, (byte) -104, ao.field_b)) {
            ao.field_b[1] = ao.field_b[1] + ao.field_b[4];
            if (pe.a(param2, (byte) -61, ao.field_b)) {
              ao.field_b[2] = ao.field_b[2] + ao.field_b[5];
              if (param3 >= -51) {
                L0: {
                  var9 = null;
                  int[] discarded$4 = lt.a(-23, 65, (la[]) null, -116, 62, 0, -89, 61);
                  if (!pe.a(param2, (byte) -85, ao.field_b)) {
                    ao.field_b[5] = -ao.field_b[5];
                    ao.field_b[2] = param4;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                return ao.field_b;
              } else {
                L1: {
                  if (!pe.a(param2, (byte) -85, ao.field_b)) {
                    ao.field_b[5] = -ao.field_b[5];
                    ao.field_b[2] = param4;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return ao.field_b;
              }
            } else {
              ao.field_b[1] = param5;
              ao.field_b[4] = -ao.field_b[4];
              ao.field_b[2] = ao.field_b[2] + ao.field_b[5];
              if (param3 >= -51) {
                L2: {
                  var9 = null;
                  int[] discarded$5 = lt.a(-23, 65, (la[]) null, -116, 62, 0, -89, 61);
                  if (!pe.a(param2, (byte) -85, ao.field_b)) {
                    ao.field_b[5] = -ao.field_b[5];
                    ao.field_b[2] = param4;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                return ao.field_b;
              } else {
                L3: {
                  if (!pe.a(param2, (byte) -85, ao.field_b)) {
                    ao.field_b[5] = -ao.field_b[5];
                    ao.field_b[2] = param4;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return ao.field_b;
              }
            }
          } else {
            ao.field_b[0] = param6;
            ao.field_b[3] = -ao.field_b[3];
            ao.field_b[1] = ao.field_b[1] + ao.field_b[4];
            if (!pe.a(param2, (byte) -61, ao.field_b)) {
              ao.field_b[1] = param5;
              ao.field_b[4] = -ao.field_b[4];
              ao.field_b[2] = ao.field_b[2] + ao.field_b[5];
              if (param3 < -51) {
                L4: {
                  if (!pe.a(param2, (byte) -85, ao.field_b)) {
                    ao.field_b[5] = -ao.field_b[5];
                    ao.field_b[2] = param4;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                return ao.field_b;
              } else {
                L5: {
                  var9 = null;
                  int[] discarded$6 = lt.a(-23, 65, (la[]) null, -116, 62, 0, -89, 61);
                  if (!pe.a(param2, (byte) -85, ao.field_b)) {
                    ao.field_b[5] = -ao.field_b[5];
                    ao.field_b[2] = param4;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                return ao.field_b;
              }
            } else {
              ao.field_b[2] = ao.field_b[2] + ao.field_b[5];
              if (param3 >= -51) {
                L6: {
                  var9 = null;
                  int[] discarded$7 = lt.a(-23, 65, (la[]) null, -116, 62, 0, -89, 61);
                  if (!pe.a(param2, (byte) -85, ao.field_b)) {
                    ao.field_b[5] = -ao.field_b[5];
                    ao.field_b[2] = param4;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                return ao.field_b;
              } else {
                L7: {
                  if (!pe.a(param2, (byte) -85, ao.field_b)) {
                    ao.field_b[5] = -ao.field_b[5];
                    ao.field_b[2] = param4;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                return ao.field_b;
              }
            }
          }
        } else {
          return ao.field_b;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "time";
        field_b = "Final";
    }
}
