/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj {
    static hl[] field_f;
    static int field_d;
    static String field_e;
    static String field_c;
    static int[] field_h;
    static int field_g;
    static String[] field_a;
    static ji field_b;

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (null == hd.field_s) {
          if (mm.field_y == null) {
            if (param0 == 15780) {
              if (b.a(0)) {
                return true;
              } else {
                if (ld.b(param3, param0 ^ -1885068379, param1, param2)) {
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              field_h = null;
              if (b.a(0)) {
                return true;
              } else {
                if (ld.b(param3, param0 ^ -1885068379, param1, param2)) {
                  return true;
                } else {
                  return false;
                }
              }
            }
          } else {
            if (!mm.field_y.h(5)) {
              if (param0 == 15780) {
                if (b.a(0)) {
                  return true;
                } else {
                  if (ld.b(param3, param0 ^ -1885068379, param1, param2)) {
                    return true;
                  } else {
                    return false;
                  }
                }
              } else {
                field_h = null;
                if (b.a(0)) {
                  return true;
                } else {
                  if (ld.b(param3, param0 ^ -1885068379, param1, param2)) {
                    return true;
                  } else {
                    return false;
                  }
                }
              }
            } else {
              mm.field_y = null;
              gg.c((byte) 43);
              return true;
            }
          }
        } else {
          if (!hd.field_s.a(-1)) {
            if (mm.field_y != null) {
              if (mm.field_y.h(5)) {
                mm.field_y = null;
                gg.c((byte) 43);
                return true;
              } else {
                if (param0 != 15780) {
                  field_h = null;
                  if (b.a(0)) {
                    return true;
                  } else {
                    if (ld.b(param3, param0 ^ -1885068379, param1, param2)) {
                      return true;
                    } else {
                      return false;
                    }
                  }
                } else {
                  if (b.a(0)) {
                    return true;
                  } else {
                    if (ld.b(param3, param0 ^ -1885068379, param1, param2)) {
                      return true;
                    } else {
                      return false;
                    }
                  }
                }
              }
            } else {
              if (param0 == 15780) {
                if (b.a(0)) {
                  return true;
                } else {
                  if (ld.b(param3, param0 ^ -1885068379, param1, param2)) {
                    return true;
                  } else {
                    return false;
                  }
                }
              } else {
                field_h = null;
                if (b.a(0)) {
                  return true;
                } else {
                  if (!ld.b(param3, param0 ^ -1885068379, param1, param2)) {
                    return false;
                  } else {
                    return true;
                  }
                }
              }
            }
          } else {
            gg.c((byte) 43);
            return true;
          }
        }
    }

    final static boolean b(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        var1 = (Object) (Object) vi.field_a;
        synchronized (var1) {
          L0: {
            if (dh.field_m == bb.field_e) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                dg.field_e = af.field_e[dh.field_m];
                tb.field_m = fm.field_c[dh.field_m];
                if (param0 == 28) {
                  break L1;
                } else {
                  field_g = -102;
                  break L1;
                }
              }
              dh.field_m = dh.field_m + 1 & 127;
              stackOut_7_0 = 1;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            }
          }
        }
        return stackIn_8_0 != 0;
    }

    final static void a(String param0, byte param1, String param2, int param3, int param4) {
        in.field_g.field_Hb = in.field_g.field_Hb + ba.field_L.field_Hb;
        try {
            in.field_g.field_N = param3;
            in.field_g.field_O = param2;
            in.field_g.field_jb = param0;
            ba.field_L.field_M = ba.field_L.field_M + ba.field_L.field_Hb;
            ba.field_L.field_Hb = param4;
            in.field_g.field_Hb = in.field_g.field_Hb - ba.field_L.field_Hb;
            ba.field_L.field_M = ba.field_L.field_M - ba.field_L.field_Hb;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "nj.B(" + (param0 != null ? "{...}" : "null") + ',' + -48 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_h = null;
        field_b = null;
        field_f = null;
        field_a = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Who can join";
        field_a = new String[255];
    }
}
