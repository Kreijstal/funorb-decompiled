/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class en extends sr {
    static rv field_p;
    static int[] field_n;
    static int field_o;
    static long[] field_q;

    final int a(int param0) {
        if (param0 >= -69) {
            field_q = null;
            return 2;
        }
        return 2;
    }

    en() {
    }

    public static void b(byte param0) {
        field_q = null;
        field_p = null;
        field_n = null;
    }

    final static int b(int param0, int param1) {
        int var2 = 0;
        L0: {
          param0 = param0 >> 9;
          if (param0 < 0) {
            param0++;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var2 = 0;
          if (param0 < -4) {
            var2 = var2 | 2;
            break L1;
          } else {
            if (4 >= param0) {
              break L1;
            } else {
              L2: {
                var2 = var2 | 2;
                if (param0 <= -3) {
                  break L2;
                } else {
                  if (param0 >= 3) {
                    break L2;
                  } else {
                    var2 = var2 | 8;
                    break L2;
                  }
                }
              }
              L3: {
                if (param0 >= 0) {
                  break L3;
                } else {
                  if (param0 <= -7) {
                    break L3;
                  } else {
                    var2 = var2 | 4;
                    break L3;
                  }
                }
              }
              if (param0 > 0) {
                L4: {
                  if (param0 < 7) {
                    var2 = var2 | 1;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if (param1 == -25147) {
                  return var2;
                } else {
                  return 14;
                }
              } else {
                if (param1 == -25147) {
                  return var2;
                } else {
                  return 14;
                }
              }
            }
          }
        }
        L5: {
          if (param0 <= -3) {
            break L5;
          } else {
            if (param0 >= 3) {
              break L5;
            } else {
              var2 = var2 | 8;
              break L5;
            }
          }
        }
        L6: {
          if (param0 >= 0) {
            break L6;
          } else {
            if (param0 <= -7) {
              break L6;
            } else {
              var2 = var2 | 4;
              break L6;
            }
          }
        }
        L7: {
          if (param0 <= 0) {
            break L7;
          } else {
            if (param0 < 7) {
              var2 = var2 | 1;
              break L7;
            } else {
              if (param1 == -25147) {
                return var2;
              } else {
                return 14;
              }
            }
          }
        }
        if (param1 == -25147) {
          return var2;
        } else {
          return 14;
        }
    }

    final static void a(int param0, int param1) {
        ng.field_a = (param0 & 60) >> 4;
        q.field_b = (param0 & 14) >> 2;
        if (ng.field_a <= 2) {
          if (2 >= q.field_b) {
            fc.field_a = param0 & 3;
            if (fc.field_a > 2) {
              fc.field_a = 2;
              return;
            } else {
              return;
            }
          } else {
            q.field_b = 2;
            fc.field_a = param0 & 3;
            if (fc.field_a > 2) {
              fc.field_a = 2;
              return;
            } else {
              return;
            }
          }
        } else {
          ng.field_a = 2;
          if (2 < q.field_b) {
            q.field_b = 2;
            fc.field_a = param0 & 3;
            if (fc.field_a <= 2) {
              return;
            } else {
              fc.field_a = 2;
              return;
            }
          } else {
            fc.field_a = param0 & 3;
            if (fc.field_a > 2) {
              fc.field_a = 2;
              return;
            } else {
              return;
            }
          }
        }
    }

    final int a(int param0, Object param1, Object param2) {
        up var4 = null;
        RuntimeException var4_ref = null;
        up var5 = null;
        String var6 = null;
        String var7 = null;
        up var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var8 = ((sp) param1).field_Sb;
              var4 = var8;
              var5 = ((sp) param2).field_Sb;
              if (param0 == 2) {
                break L1;
              } else {
                int discarded$2 = en.b(83, 32);
                break L1;
              }
            }
            var6 = ce.field_G[var8.field_q][var8.field_l];
            var7 = ce.field_G[var5.field_q][var5.field_l];
            stackOut_2_0 = var6.compareTo(var7) ^ ((en) this).field_i << 31;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref;
            stackOut_4_1 = new StringBuilder().append("en.D(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_3_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_p = new rv();
        field_o = -1;
        field_q = new long[]{64356L, 63569L, 64749L};
        field_n = new int[64];
        for (var0 = 0; field_n.length > var0; var0++) {
            field_n[var0] = (var0 << 1) * 65793;
        }
    }
}
