/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh extends af {
    static String field_r;
    private int field_q;
    private int field_s;
    private o[] field_t;
    private int field_p;

    public static void d(int param0) {
        if (param0 != -1) {
            gh.a(9, 116);
            field_r = null;
            return;
        }
        field_r = null;
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param4 == 16777215) {
          if (param6 <= param2) {
            if (param2 < param3 + param6) {
              if (param0 <= param5) {
                if (param0 + param1 <= param5) {
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
          return true;
        }
    }

    public final void a(byte param0, int param1, boolean param2, int param3, rc param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        L0: {
          if (!param4.field_v) {
            if (param4.b(true)) {
              L1: {
                var6 = 1;
                if (param4 instanceof pj) {
                  param2 = param2 & ((pj) (Object) param4).field_B;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (param2) {
                  if (var6 != 0) {
                    stackOut_11_0 = ((gh) this).field_q;
                    stackIn_12_0 = stackOut_11_0;
                    break L2;
                  } else {
                    stackOut_10_0 = ((gh) this).field_s;
                    stackIn_12_0 = stackOut_10_0;
                    break L2;
                  }
                } else {
                  stackOut_8_0 = ((gh) this).field_p;
                  stackIn_12_0 = stackOut_8_0;
                  break L2;
                }
              }
              L3: {
                var7 = stackIn_12_0;
                if (!param2) {
                  stackOut_14_0 = 7105644;
                  stackIn_15_0 = stackOut_14_0;
                  break L3;
                } else {
                  stackOut_13_0 = 16777215;
                  stackIn_15_0 = stackOut_13_0;
                  break L3;
                }
              }
              var8 = stackIn_15_0;
              if (param0 < 113) {
                return;
              } else {
                fg.a(param1 + (param4.field_j + (-((gh) this).field_t[0].field_r + param4.field_x >> -809370879)), param4.field_m + param3, param4.field_t, var7, ((gh) this).field_t, (byte) 104);
                int discarded$2 = ((gh) this).field_l.a(param4.field_i, param3 - -param4.field_m, param4.field_j + param1 + -2, param4.field_t, param4.field_x, var8, -1, 1, 1, ((gh) this).field_l.field_F);
                return;
              }
            } else {
              stackOut_3_0 = 0;
              stackIn_19_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 1;
            stackIn_19_0 = stackOut_1_0;
            break L0;
          }
        }
        L4: {
          var6 = stackIn_19_0;
          if (param4 instanceof pj) {
            param2 = param2 & ((pj) (Object) param4).field_B;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (param2) {
            if (var6 != 0) {
              stackOut_26_0 = ((gh) this).field_q;
              stackIn_27_0 = stackOut_26_0;
              break L5;
            } else {
              stackOut_25_0 = ((gh) this).field_s;
              stackIn_27_0 = stackOut_25_0;
              break L5;
            }
          } else {
            stackOut_23_0 = ((gh) this).field_p;
            stackIn_27_0 = stackOut_23_0;
            break L5;
          }
        }
        L6: {
          var7 = stackIn_27_0;
          if (!param2) {
            stackOut_29_0 = 7105644;
            stackIn_30_0 = stackOut_29_0;
            break L6;
          } else {
            stackOut_28_0 = 16777215;
            stackIn_30_0 = stackOut_28_0;
            break L6;
          }
        }
        var8 = stackIn_30_0;
        if (param0 < 113) {
          return;
        } else {
          fg.a(param1 + (param4.field_j + (-((gh) this).field_t[0].field_r + param4.field_x >> -809370879)), param4.field_m + param3, param4.field_t, var7, ((gh) this).field_t, (byte) 104);
          int discarded$3 = ((gh) this).field_l.a(param4.field_i, param3 - -param4.field_m, param4.field_j + param1 + -2, param4.field_t, param4.field_x, var8, -1, 1, 1, ((gh) this).field_l.field_F);
          return;
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        m var4 = null;
        var3 = SolKnight.field_L ? 1 : 0;
        var4 = (m) (Object) gg.field_b.a((byte) 51);
        L0: while (true) {
          if (var4 == null) {
            if (param1 != 9543) {
              boolean discarded$2 = gh.a('i', (byte) 57);
              return;
            } else {
              return;
            }
          } else {
            l.a(param0, param1 ^ -9489, var4);
            var4 = (m) (Object) gg.field_b.b(-121);
            continue L0;
          }
        }
    }

    final static String a(int param0, CharSequence param1) {
        String var2 = null;
        if (param0 != -31433) {
          return null;
        } else {
          L0: {
            var2 = ub.a(-88, ti.a(param1, (byte) 44));
            if (var2 == null) {
              var2 = "";
              break L0;
            } else {
              break L0;
            }
          }
          return var2;
        }
    }

    final static boolean a(char param0, byte param1) {
        if (param1 == -124) {
          if (param0 >= 48) {
            if (57 < param0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          boolean discarded$6 = gh.a('￾', (byte) -29);
          if (param0 >= 48) {
            if (57 < param0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    private gh(int param0, int param1, int param2) {
        ((gh) this).field_t = vk.field_i;
        ((gh) this).field_l = uc.field_g;
        ((gh) this).field_q = param1;
        ((gh) this).field_p = param2;
        ((gh) this).field_s = param0;
    }

    public gh() {
        this(2188450, 2591221, 9543);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Change display name";
    }
}
