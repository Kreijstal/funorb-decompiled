/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj extends kd {
    long[][] field_i;
    boolean field_k;
    int[][] field_n;
    String[][] field_j;
    int field_m;
    static String field_l;
    int field_h;
    int field_o;

    final static void a(int param0, String param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var3 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              ug.field_m = ug.field_m + 1;
              if ((ch.field_e ^ -1) != param0) {
                break L1;
              } else {
                if (0 != (fk.field_e ^ -1)) {
                  break L1;
                } else {
                  ch.field_e = bk.field_b;
                  fk.field_e = sh.field_e;
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                if (param1 != null) {
                  if (param1.equals(nc.field_p)) {
                    break L2;
                  } else {
                    break L3;
                  }
                } else {
                  if (nc.field_p != null) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (!af.field_b) {
                  if (ug.field_m >= dj.field_b) {
                    if (dj.field_b - -ik.field_j > ug.field_m) {
                      stackOut_14_0 = 1;
                      stackIn_16_0 = stackOut_14_0;
                      break L4;
                    } else {
                      stackOut_13_0 = 0;
                      stackIn_16_0 = stackOut_13_0;
                      break L4;
                    }
                  } else {
                    stackOut_11_0 = 0;
                    stackIn_16_0 = stackOut_11_0;
                    break L4;
                  }
                } else {
                  stackOut_9_0 = 0;
                  stackIn_16_0 = stackOut_9_0;
                  break L4;
                }
              }
              L5: {
                var2_int = stackIn_16_0;
                if (param1 == null) {
                  ug.field_m = 0;
                  break L5;
                } else {
                  L6: {
                    if (af.field_b) {
                      break L6;
                    } else {
                      if (var2_int == 0) {
                        ug.field_m = 0;
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  ug.field_m = dj.field_b;
                  if (var3 == 0) {
                    break L5;
                  } else {
                    ug.field_m = 0;
                    break L5;
                  }
                }
              }
              L7: {
                L8: {
                  vf.field_r = fk.field_e;
                  if (param1 == null) {
                    break L8;
                  } else {
                    af.field_b = false;
                    if (var3 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                if (var2_int != 0) {
                  af.field_b = true;
                  break L7;
                } else {
                  break L7;
                }
              }
              bf.field_g = ch.field_e;
              break L2;
            }
            L9: {
              if (af.field_b) {
                break L9;
              } else {
                if (dj.field_b <= ug.field_m) {
                  break L9;
                } else {
                  if (ob.field_c) {
                    ug.field_m = 0;
                    vf.field_r = fk.field_e;
                    bf.field_g = ch.field_e;
                    break L9;
                  } else {
                    break L9;
                  }
                }
              }
            }
            L10: {
              nc.field_p = param1;
              fk.field_e = -1;
              if (!af.field_b) {
                break L10;
              } else {
                if (ug.field_m == v.field_u) {
                  af.field_b = false;
                  ug.field_m = 0;
                  break L10;
                } else {
                  break L10;
                }
              }
            }
            ch.field_e = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) (var2);
            stackOut_43_1 = new StringBuilder().append("sj.A(").append(param0).append(',');
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param1 == null) {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L11;
            } else {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L11;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ')');
        }
    }

    public static void a(byte param0) {
        field_l = null;
        if (param0 <= 3) {
            sj.a((byte) -96);
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6) {
        if (param5) {
          if (param4 >= param6) {
            if (param6 - -param3 > param4) {
              if (param0 >= param2) {
                if (param1 + param2 <= param0) {
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
          return false;
        }
    }

    sj() {
    }

    static {
        field_l = "END";
    }
}
