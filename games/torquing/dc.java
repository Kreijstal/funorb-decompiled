/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc {
    static String field_b;
    static long field_c;
    static ln field_a;

    final static li a(String param0, la param1, la param2, boolean param3, String param4) {
        int var5 = 0;
        int var6 = 0;
        var5 = param1.a(-1, param0);
        var6 = param1.a(param4, -107, var5);
        if (param3) {
          field_b = null;
          return ao.a(-97, var5, var6, param1, param2);
        } else {
          return ao.a(-97, var5, var6, param1, param2);
        }
    }

    final static void a(int param0, String param1, int param2) {
        int var3 = 0;
        aq.field_c = false;
        cf.field_f = false;
        if (gn.field_m != null) {
          if (gn.field_m.field_D) {
            L0: {
              if (-9 != (param0 ^ -1)) {
                break L0;
              } else {
                L1: {
                  if (!ff.field_a) {
                    param1 = cl.field_c;
                    break L1;
                  } else {
                    param1 = un.field_a;
                    break L1;
                  }
                }
                param0 = 2;
                un.field_k.a(-78, eo.field_a);
                break L0;
              }
            }
            L2: {
              var3 = 1;
              if ((param0 ^ -1) != -11) {
                break L2;
              } else {
                var3 = 0;
                d.d((byte) -77);
                break L2;
              }
            }
            L3: {
              if (var3 != 0) {
                L4: {
                  if (!cf.field_f) {
                    break L4;
                  } else {
                    param1 = ff.a(new String[1], param2 ^ 2, jg.field_w);
                    break L4;
                  }
                }
                L5: {
                  if (!nk.field_t) {
                    break L5;
                  } else {
                    param1 = pn.field_a;
                    break L5;
                  }
                }
                gn.field_m.a(param0, param1, param2 ^ -259);
                break L3;
              } else {
                break L3;
              }
            }
            if ((param0 ^ -1) != -257) {
              if ((param0 ^ -1) != -11) {
                if (!ff.field_a) {
                  un.field_k.h(16180);
                  if (param2 != 2) {
                    field_a = null;
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (param2 != 2) {
                    field_a = null;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                if (param2 != 2) {
                  field_a = null;
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (param2 != 2) {
                field_a = null;
                return;
              } else {
                return;
              }
            }
          } else {
            if (param2 != 2) {
              field_a = null;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param2 != 2) {
            field_a = null;
            return;
          } else {
            return;
          }
        }
    }

    final static boolean b(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (!param0) {
          L0: {
            field_b = null;
            if (kh.field_o != mg.field_b) {
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
            if (kh.field_o != mg.field_b) {
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

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
            return;
        }
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "To server list";
    }
}
