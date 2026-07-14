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
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = (Object) (Object) vi.field_a;
                    // monitorenter vi.field_a
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (dh.field_m == bb.field_e) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        // monitorexit var1
                        stackOut_3_0 = 0;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0 != 0;
                }
                case 5: {
                    try {
                        dg.field_e = af.field_e[dh.field_m];
                        tb.field_m = fm.field_c[dh.field_m];
                        if (param0 == 28) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        field_g = -102;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        dh.field_m = dh.field_m + 1 & 127;
                        // monitorexit var1
                        stackOut_7_0 = 1;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0 != 0;
                }
                case 9: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 10: {
                    throw (RuntimeException) (Object) var2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(String param0, byte param1, String param2, int param3, int param4) {
        in.field_g.field_Hb = in.field_g.field_Hb + ba.field_L.field_Hb;
        if (param1 != -48) {
          return;
        } else {
          in.field_g.field_N = param3;
          in.field_g.field_O = param2;
          in.field_g.field_jb = param0;
          ba.field_L.field_M = ba.field_L.field_M + ba.field_L.field_Hb;
          ba.field_L.field_Hb = param4;
          in.field_g.field_Hb = in.field_g.field_Hb - ba.field_L.field_Hb;
          ba.field_L.field_M = ba.field_L.field_M - ba.field_L.field_Hb;
          return;
        }
    }

    public static void a(byte param0) {
        Object var2 = null;
        field_e = null;
        field_h = null;
        field_b = null;
        if (param0 <= 93) {
          var2 = null;
          nj.a((String) null, (byte) -11, (String) null, -21, -123);
          field_f = null;
          field_a = null;
          field_c = null;
          return;
        } else {
          field_f = null;
          field_a = null;
          field_c = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Who can join";
        field_a = new String[255];
    }
}
