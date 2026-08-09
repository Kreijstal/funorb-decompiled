/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve extends ci {
    String field_Ob;
    ci field_Eb;
    static long field_Pb;
    ci field_Mb;
    String field_Fb;
    String field_Kb;
    static jc field_Nb;
    String field_Lb;
    int field_Ib;
    ci field_Jb;
    static String field_Qb;
    static int[] field_Hb;
    static int[] field_Gb;

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param5 == 2) {
          if (param6 >= param1) {
            if (param6 < param1 - -param2) {
              if (param0 <= param3) {
                if (param0 - -param4 <= param3) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          field_Gb = (int[]) null;
          if (param6 >= param1) {
            if (param6 < param1 - -param2) {
              if (param0 <= param3) {
                if (param0 - -param4 <= param3) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final static boolean k(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 > -50) {
          L0: {
            ve.k(-78);
            if (null == me.field_a) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (null == me.field_a) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    ve() {
        super(0L, (ci) null);
    }

    final static int f(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_23_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Chess.field_G;
        try {
          L0: {
            jh.field_e.a(-120, hd.field_d, vj.field_h, true);
            jh.field_e.f((byte) 70);
            L1: while (true) {
              if (!kf.d(param0 ^ -19010)) {
                if (rn.field_a != -1) {
                  var1_int = rn.field_a;
                  uk.a(false, -1);
                  stackIn_7_0 = var1_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  if (!cf.field_Nb) {
                    if (vl.field_A == ci.field_ub) {
                      stackIn_14_0 = 1;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      if (pi.field_c.b((byte) 125)) {
                        L2: {
                          if (param0 == -76) {
                            break L2;
                          } else {
                            field_Nb = (jc) null;
                            break L2;
                          }
                        }
                        if (g.field_a == ci.field_ub) {
                          stackIn_23_0 = 2;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          return -1;
                        }
                      } else {
                        stackIn_17_0 = 1;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  } else {
                    stackIn_10_0 = 3;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              } else {
                jh.field_e.a(d.field_Ib, 57, vg.field_a);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var1), "ve.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0;
              } else {
                return stackIn_23_0;
              }
            }
          }
        }
    }

    public static void l(int param0) {
        field_Qb = null;
        field_Gb = null;
        int var1 = -2 % ((param0 - 29) / 63);
        field_Nb = null;
        field_Hb = null;
    }

    static {
        field_Nb = new jc();
        field_Gb = new int[8192];
        field_Qb = "Waiting for models";
        field_Hb = new int[16384];
    }
}
