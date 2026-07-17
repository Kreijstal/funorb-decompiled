/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg {
    static int field_b;
    static sg[] field_a;

    final static void a(boolean param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        jl var4 = null;
        oi var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var4 = (jl) (Object) ll.field_T.a((byte) -95);
            L1: while (true) {
              if (var4 == null) {
                var5 = (oi) (Object) qd.field_d.a((byte) -95);
                L2: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    int discarded$8 = 2;
                    int discarded$9 = 5;
                    de.a(var5);
                    var5 = (oi) (Object) qd.field_d.a(true);
                    continue L2;
                  }
                }
              } else {
                sj.a(-7812, 5, var4);
                var4 = (jl) (Object) ll.field_T.a(true);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var2, "eg.D(" + 0 + 44 + 5 + 41);
        }
    }

    public static void a(byte param0) {
        if (param0 <= 47) {
            Object var2 = null;
            String discarded$0 = eg.a(-121, (byte[]) null);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a() {
        int discarded$0 = -122;
        vi.field_e = wh.a();
        ci.field_f = new da();
        int discarded$1 = 170;
        wl.a(true, true);
    }

    final static void a(String param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        var3 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (rd.field_f != -1) {
                break L1;
              } else {
                if (el.field_d != -1) {
                  break L1;
                } else {
                  el.field_d = bk.field_a;
                  rd.field_f = oa.field_j;
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                da.field_y = da.field_y + 1;
                if (param0 != null) {
                  if (param0.equals((Object) (Object) tj.field_v)) {
                    tj.field_v = param0;
                    break L2;
                  } else {
                    break L3;
                  }
                } else {
                  if (tj.field_v != null) {
                    tj.field_v = param0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (!lk.field_c) {
                  if (da.field_y >= bk.field_d) {
                    if (bk.field_d - -ek.field_g > da.field_y) {
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
                if (param0 == null) {
                  da.field_y = 0;
                  break L5;
                } else {
                  if (lk.field_c) {
                    da.field_y = bk.field_d;
                    break L5;
                  } else {
                    if (var2_int != 0) {
                      da.field_y = bk.field_d;
                      break L5;
                    } else {
                      da.field_y = 0;
                      break L5;
                    }
                  }
                }
              }
              if (param0 != null) {
                lk.field_c = false;
                qi.field_d = rd.field_f;
                og.field_e = el.field_d;
                tj.field_v = param0;
                break L2;
              } else {
                if (var2_int == 0) {
                  qi.field_d = rd.field_f;
                  og.field_e = el.field_d;
                  tj.field_v = param0;
                  break L2;
                } else {
                  lk.field_c = true;
                  qi.field_d = rd.field_f;
                  og.field_e = el.field_d;
                  tj.field_v = param0;
                  break L2;
                }
              }
            }
            L6: {
              if (lk.field_c) {
                break L6;
              } else {
                if (da.field_y >= bk.field_d) {
                  break L6;
                } else {
                  if (!tl.field_a) {
                    break L6;
                  } else {
                    og.field_e = el.field_d;
                    qi.field_d = rd.field_f;
                    da.field_y = 0;
                    break L6;
                  }
                }
              }
            }
            L7: {
              rd.field_f = -1;
              if (!lk.field_c) {
                break L7;
              } else {
                if (pi.field_j == da.field_y) {
                  da.field_y = 0;
                  lk.field_c = false;
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            el.field_d = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_46_0 = (RuntimeException) var2;
            stackOut_46_1 = new StringBuilder().append("eg.B(");
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param0 == null) {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L8;
            } else {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "{...}";
              stackIn_49_0 = stackOut_47_0;
              stackIn_49_1 = stackOut_47_1;
              stackIn_49_2 = stackOut_47_2;
              break L8;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_49_0, stackIn_49_2 + 44 + 126 + 41);
        }
    }

    final static String a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 >= 82) {
                break L1;
              } else {
                eg.a((byte) -117);
                break L1;
              }
            }
            stackOut_2_0 = cc.a(0, 15923, param1.length, param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("eg.E(").append(param0).append(44);
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
          throw ch.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    static {
    }
}
