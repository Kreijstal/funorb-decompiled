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
        int stackIn_13_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var3 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              ug.field_m = ug.field_m + 1;
              if (ch.field_e != -1) {
                break L1;
              } else {
                if (fk.field_e != -1) {
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
                  if (param1.equals((Object) (Object) nc.field_p)) {
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
                L5: {
                  if (af.field_b) {
                    break L5;
                  } else {
                    if (~ug.field_m > ~dj.field_b) {
                      break L5;
                    } else {
                      if (dj.field_b - -ik.field_j <= ug.field_m) {
                        break L5;
                      } else {
                        stackOut_11_0 = 1;
                        stackIn_13_0 = stackOut_11_0;
                        break L4;
                      }
                    }
                  }
                }
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                break L4;
              }
              L6: {
                var2_int = stackIn_13_0;
                if (param1 == null) {
                  ug.field_m = 0;
                  break L6;
                } else {
                  if (af.field_b) {
                    ug.field_m = dj.field_b;
                    break L6;
                  } else {
                    if (var2_int == 0) {
                      ug.field_m = 0;
                      break L6;
                    } else {
                      ug.field_m = dj.field_b;
                      break L6;
                    }
                  }
                }
              }
              L7: {
                vf.field_r = fk.field_e;
                if (param1 == null) {
                  if (var2_int != 0) {
                    af.field_b = true;
                    break L7;
                  } else {
                    break L7;
                  }
                } else {
                  af.field_b = false;
                  break L7;
                }
              }
              bf.field_g = ch.field_e;
              break L2;
            }
            L8: {
              if (af.field_b) {
                break L8;
              } else {
                if (dj.field_b <= ug.field_m) {
                  break L8;
                } else {
                  if (ob.field_c) {
                    ug.field_m = 0;
                    vf.field_r = fk.field_e;
                    bf.field_g = ch.field_e;
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
            }
            L9: {
              nc.field_p = param1;
              fk.field_e = -1;
              if (!af.field_b) {
                break L9;
              } else {
                if (ug.field_m == v.field_u) {
                  af.field_b = false;
                  ug.field_m = 0;
                  break L9;
                } else {
                  break L9;
                }
              }
            }
            ch.field_e = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var2;
            stackOut_38_1 = new StringBuilder().append("sj.A(").append(0).append(44);
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param1 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L10;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L10;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + 41);
        }
    }

    public static void a(byte param0) {
        field_l = null;
        if (param0 <= 3) {
            sj.a((byte) -96);
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6) {
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
    }

    sj() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "END";
    }
}
