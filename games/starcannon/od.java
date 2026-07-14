/*
 * Decompiled by CFR-JS 0.4.0.
 */
class od extends hh {
    private String field_e;
    private long field_g;
    static int field_i;
    static ge field_f;
    static int[] field_h;

    final static boolean a(int param0, ia param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -2) {
          L0: {
            od.c((byte) -112);
            if (1 != param1.e(8, 1)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (1 != param1.e(8, 1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static lk a(String param0, ue param1, String param2, int param3, ue param4) {
        int var5 = 0;
        int var6 = 0;
        if (param3 != -1) {
          field_h = null;
          var5 = param1.a(param0, false);
          var6 = param1.a(param2, true, var5);
          return jj.a(var5, param1, var6, (byte) -124, param4);
        } else {
          var5 = param1.a(param0, false);
          var6 = param1.a(param2, true, var5);
          return jj.a(var5, param1, var6, (byte) -124, param4);
        }
    }

    final void a(byte param0, rb param1) {
        if (param0 != 69) {
          ((od) this).field_e = null;
          param1.a(true, ((od) this).field_g);
          param1.a((byte) -86, ((od) this).field_e);
          return;
        } else {
          param1.a(true, ((od) this).field_g);
          param1.a((byte) -86, ((od) this).field_e);
          return;
        }
    }

    public static void a(int param0) {
        if (param0 <= 69) {
            return;
        }
        field_f = null;
        field_h = null;
    }

    final static void a(int param0, int param1, boolean param2) {
        int stackIn_14_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_59_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        if (param0 <= -97) {
          cd.field_c = 0;
          pa.field_L = param1;
          if (StarCannon.field_z != -1) {
            L0: {
              if ((StarCannon.field_z ^ -1) == -8) {
                ij.a(0, param2);
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if ((param1 ^ -1) <= -1) {
                fg.field_a[pa.field_L].b(param2, 0);
                break L1;
              } else {
                break L1;
              }
            }
            if (param1 == -2) {
              L2: {
                if (-1 < u.field_d) {
                  stackOut_58_0 = 0;
                  stackIn_59_0 = stackOut_58_0;
                  break L2;
                } else {
                  stackOut_57_0 = 7;
                  stackIn_59_0 = stackOut_57_0;
                  break L2;
                }
              }
              lf.field_cb = stackIn_59_0;
              if (7 == lf.field_cb) {
                ij.a(0, true);
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            L3: {
              cd.field_c = 25;
              if ((StarCannon.field_z ^ -1) == -8) {
                ij.a(0, param2);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if ((param1 ^ -1) <= -1) {
                fg.field_a[pa.field_L].b(param2, 0);
                break L4;
              } else {
                break L4;
              }
            }
            if (param1 == -2) {
              L5: {
                if (-1 < u.field_d) {
                  stackOut_44_0 = 0;
                  stackIn_45_0 = stackOut_44_0;
                  break L5;
                } else {
                  stackOut_43_0 = 7;
                  stackIn_45_0 = stackOut_43_0;
                  break L5;
                }
              }
              lf.field_cb = stackIn_45_0;
              if (7 == lf.field_cb) {
                ij.a(0, true);
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          field_i = -12;
          cd.field_c = 0;
          pa.field_L = param1;
          if (StarCannon.field_z == -1) {
            L6: {
              cd.field_c = 25;
              if ((StarCannon.field_z ^ -1) == -8) {
                ij.a(0, param2);
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if ((param1 ^ -1) <= -1) {
                fg.field_a[pa.field_L].b(param2, 0);
                break L7;
              } else {
                break L7;
              }
            }
            if (param1 == -2) {
              L8: {
                if (-1 < u.field_d) {
                  stackOut_28_0 = 0;
                  stackIn_29_0 = stackOut_28_0;
                  break L8;
                } else {
                  stackOut_27_0 = 7;
                  stackIn_29_0 = stackOut_27_0;
                  break L8;
                }
              }
              lf.field_cb = stackIn_29_0;
              if (7 != lf.field_cb) {
                return;
              } else {
                ij.a(0, true);
                return;
              }
            } else {
              return;
            }
          } else {
            L9: {
              if ((StarCannon.field_z ^ -1) == -8) {
                ij.a(0, param2);
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if ((param1 ^ -1) <= -1) {
                fg.field_a[pa.field_L].b(param2, 0);
                break L10;
              } else {
                break L10;
              }
            }
            if ((param1 ^ -1) == -2) {
              L11: {
                if (-1 < u.field_d) {
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  break L11;
                } else {
                  stackOut_12_0 = 7;
                  stackIn_14_0 = stackOut_12_0;
                  break L11;
                }
              }
              lf.field_cb = stackIn_14_0;
              if (7 != lf.field_cb) {
                return;
              } else {
                ij.a(0, true);
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final static void c(byte param0) {
        fb.field_c = null;
        se.field_n = null;
        rd.field_q = null;
        m.field_c = false;
        ri.field_b = null;
        if (param0 != 104) {
            od.a(-82, 126, false);
        }
    }

    od(long param0, String param1) {
        ((od) this).field_e = param1;
        ((od) this).field_g = param0;
    }

    s b(byte param0) {
        if (param0 != 1) {
            return null;
        }
        return na.field_b;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new ge();
    }
}
