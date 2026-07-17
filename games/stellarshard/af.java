/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af extends gg {
    static pb field_n;
    static int field_q;
    static int field_k;
    int[] field_s;
    static la field_r;
    boolean field_m;
    static int field_l;
    static int field_o;
    int field_p;

    final static void a(int param0, int param1, int param2, int param3, pb[] param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var11 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              if (param4 == null) {
                break L1;
              } else {
                if (0 < param2) {
                  var6_int = param4[0].field_w;
                  var7 = param4[2].field_w;
                  var8 = param4[1].field_w;
                  param4[0].a(param5, param3, param1);
                  param4[2].a(-var7 + param2 + param5, param3, param1);
                  ti.a(og.field_b);
                  ti.a(var6_int + param5, param3, param2 + param5 - var7, param4[1].field_x + param3);
                  var9 = var6_int + param5;
                  var10 = -var7 + (param5 - -param2);
                  param5 = var9;
                  L2: while (true) {
                    if (var10 <= param5) {
                      ti.b(og.field_b);
                      break L0;
                    } else {
                      param4[1].a(param5, param3, param1);
                      param5 = param5 + var8;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var6;
            stackOut_9_1 = new StringBuilder().append("af.B(").append(-57).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param4 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param5 + 41);
        }
    }

    public static void a() {
        int var1 = 0;
        field_r = null;
        field_n = null;
    }

    final static void a(boolean param0, byte param1) {
        if (param1 >= -41) {
            af.a(true, (byte) 62);
            na.field_d.a(0, 0, 0);
            return;
        }
        na.field_d.a(0, 0, 0);
    }

    final static int a(int param0, int param1, int param2) {
        if (ui.field_F == null) {
          return -1;
        } else {
          if (param1 >= wc.field_y) {
            if (param1 < ui.field_F.field_v + wc.field_y) {
              L0: {
                if (vi.field_a > param2) {
                  break L0;
                } else {
                  if (vi.field_a - -ui.field_F.field_y <= param2) {
                    break L0;
                  } else {
                    return 0;
                  }
                }
              }
              if (param1 >= cm.field_a) {
                if (param1 < ui.field_F.field_v + cm.field_a) {
                  if (param2 >= field_l) {
                    if (ui.field_F.field_y + field_l > param2) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    return -1;
                  }
                } else {
                  return -1;
                }
              } else {
                return -1;
              }
            } else {
              if (param1 >= cm.field_a) {
                if (param1 < ui.field_F.field_v + cm.field_a) {
                  if (param2 >= field_l) {
                    if (ui.field_F.field_y + field_l <= param2) {
                      return -1;
                    } else {
                      return 1;
                    }
                  } else {
                    return -1;
                  }
                } else {
                  return -1;
                }
              } else {
                return -1;
              }
            }
          } else {
            if (param1 >= cm.field_a) {
              if (param1 < ui.field_F.field_v + cm.field_a) {
                if (param2 >= field_l) {
                  if (ui.field_F.field_y + field_l <= param2) {
                    return -1;
                  } else {
                    return 1;
                  }
                } else {
                  return -1;
                }
              } else {
                return -1;
              }
            } else {
              return -1;
            }
          }
        }
    }

    af() {
    }

    static {
    }
}
