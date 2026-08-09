/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg {
    static long[] field_c;
    boolean field_d;
    static wk[] field_i;
    String field_b;
    String field_g;
    static boolean field_h;
    static String field_f;
    static String field_a;
    static gh field_e;

    final static void a(int param0, String param1) {
        int stackIn_17_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              si.field_m = si.field_m + 1;
              if ((pe.field_d ^ -1) != 0) {
                break L1;
              } else {
                if (0 == (jj.field_c ^ -1)) {
                  jj.field_c = pi.field_c;
                  pe.field_d = oh.field_f;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                if (param1 == null) {
                  if (rc.field_b != null) {
                    break L2;
                  } else {
                    break L3;
                  }
                } else {
                  if (param1.equals(rc.field_b)) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (!pg.field_A) {
                  if (ik.field_c <= si.field_m) {
                    if (si.field_m < ni.field_c + ik.field_c) {
                      stackIn_17_0 = 1;
                      break L4;
                    } else {
                      stackIn_17_0 = 0;
                      break L4;
                    }
                  } else {
                    stackIn_17_0 = 0;
                    break L4;
                  }
                } else {
                  stackIn_17_0 = 0;
                  break L4;
                }
              }
              L5: {
                var2_int = stackIn_17_0;
                if (param1 == null) {
                  si.field_m = 0;
                  break L5;
                } else {
                  if (pg.field_A) {
                    si.field_m = ik.field_c;
                    break L5;
                  } else {
                    if (var2_int != 0) {
                      si.field_m = ik.field_c;
                      break L5;
                    } else {
                      si.field_m = 0;
                      break L5;
                    }
                  }
                }
              }
              L6: {
                if (param1 != null) {
                  pg.field_A = false;
                  break L6;
                } else {
                  if (var2_int != 0) {
                    pg.field_A = true;
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
              t.field_l = jj.field_c;
              eh.field_a = pe.field_d;
              break L2;
            }
            L7: {
              if (pg.field_A) {
                break L7;
              } else {
                if (si.field_m >= ik.field_c) {
                  break L7;
                } else {
                  if (!ik.field_a) {
                    break L7;
                  } else {
                    t.field_l = jj.field_c;
                    si.field_m = 0;
                    eh.field_a = pe.field_d;
                    break L7;
                  }
                }
              }
            }
            if (param0 <= -125) {
              L8: {
                rc.field_b = param1;
                if (!pg.field_A) {
                  break L8;
                } else {
                  if (si.field_m != ql.field_Ub) {
                    break L8;
                  } else {
                    si.field_m = 0;
                    pg.field_A = false;
                    break L8;
                  }
                }
              }
              pe.field_d = -1;
              jj.field_c = -1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_44_0 = (RuntimeException) (var2);

            stackIn_44_1 = new StringBuilder().append("hg.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "null";
              break L9;
            } else {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "{...}";
              break L9;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_45_0), stackIn_45_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              db.a(-1, (java.awt.Component) ((Object) param1));
              al.a(true, (java.awt.Component) ((Object) param1));
              if (null == nc.field_j) {
                break L1;
              } else {
                nc.field_j.a((java.awt.Component) ((Object) param1), false);
                break L1;
              }
            }
            if (param0 == -93) {
              break L0;
            } else {
              field_h = true;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("hg.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    public static void a(int param0) {
        java.awt.Canvas var2;
        field_e = null;
        field_i = null;
        field_c = null;
        field_f = null;
        if (param0 < 82) {
          var2 = (java.awt.Canvas) null;
          hg.a((byte) 122, (java.awt.Canvas) null);
          field_a = null;
          return;
        } else {
          field_a = null;
          return;
        }
    }

    static {
        field_c = new long[32];
        field_h = false;
        field_f = "Go Back";
        field_a = "FULL ACCESS";
    }
}
