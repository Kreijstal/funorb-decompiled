/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue extends pd {
    static long field_s;
    private int field_u;
    static String field_t;
    static hs field_v;

    final void g(byte param0) {
        if (param0 != 3) {
            ((ue) this).field_u = 4;
        }
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        CharSequence var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
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
              if (param1 == 0) {
                break L1;
              } else {
                var3 = null;
                boolean discarded$2 = ue.a((String) null, -83);
                break L1;
              }
            }
            var4 = (CharSequence) (Object) param0;
            stackOut_2_0 = tia.field_b.equals((Object) (Object) jd.a(1, var4));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("ue.V(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public static void r(int param0) {
        field_t = null;
        field_v = null;
        if (param0 != 0) {
            ue.r(113);
        }
    }

    final int j(byte param0) {
        if (param0 >= -26) {
            return -74;
        }
        return ((ue) this).field_u;
    }

    ue(la param0, boolean param1) {
        super(param0, param1);
    }

    ue(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        try {
            ((ue) this).field_u = param1.b((byte) 44, 6);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ue.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean a(int param0, hca param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_37_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (!param1.a((ue) this, (byte) 76)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                var3_int = ((ue) this).field_u;
                if (var3_int == 0) {
                  param1.g(62, 106);
                  break L1;
                } else {
                  if (var3_int != 1) {
                    if (var3_int == 2) {
                      param1.g(64, 115);
                      break L1;
                    } else {
                      if (3 == var3_int) {
                        param1.g(65, 123);
                        break L1;
                      } else {
                        param1.g(63, -74);
                        break L1;
                      }
                    }
                  } else {
                    param1.g(63, 110);
                    break L1;
                  }
                }
              }
              if (param0 <= -114) {
                L2: {
                  var3_int = ((ue) this).field_u;
                  if (var3_int == 0) {
                    if (param1.x(-70)) {
                      break L2;
                    } else {
                      param1.a(((ue) this).field_g.b(125), (byte) -102, 58982, 1);
                      ((ue) this).c(false);
                      stackOut_26_0 = 1;
                      stackIn_27_0 = stackOut_26_0;
                      return stackIn_27_0 != 0;
                    }
                  } else {
                    if (var3_int != 1) {
                      if (var3_int == 2) {
                        param1.a(((ue) this).field_g, false, 1);
                        ((ue) this).c(false);
                        stackOut_30_0 = 1;
                        stackIn_31_0 = stackOut_30_0;
                        return stackIn_31_0 != 0;
                      } else {
                        if (var3_int == 3) {
                          if (!param1.x(49)) {
                            param1.a(((ue) this).field_g, false, 2);
                            param1.a(((ue) this).field_g.b(-77), (byte) -120, 52428, 0);
                            ((ue) this).c(false);
                            stackOut_34_0 = 1;
                            stackIn_35_0 = stackOut_34_0;
                            return stackIn_35_0 != 0;
                          } else {
                            break L2;
                          }
                        } else {
                          return false;
                        }
                      }
                    } else {
                      param1.a(((ue) this).field_g, false, 0);
                      stackOut_28_0 = 1;
                      stackIn_29_0 = stackOut_28_0;
                      return stackIn_29_0 != 0;
                    }
                  }
                }
                stackOut_36_0 = 0;
                stackIn_37_0 = stackOut_36_0;
                break L0;
              } else {
                stackOut_17_0 = 0;
                stackIn_18_0 = stackOut_17_0;
                return stackIn_18_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var3;
            stackOut_38_1 = new StringBuilder().append("ue.L(").append(param0).append(',');
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
              break L3;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + ')');
        }
        return stackIn_37_0 != 0;
    }

    final void a(int param0, boolean param1) {
        if (param1) {
            return;
        }
        ((ue) this).field_u = param0;
    }

    final int a(boolean param0) {
        if (param0) {
            field_v = null;
            return 25;
        }
        return 25;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            param1.a((byte) -128, ((ue) this).field_u, 6);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ue.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, byte param1) {
        super.a(param0, param1);
        if (param0) {
          if (0 != ((ue) this).field_u) {
            return;
          } else {
            ((ue) this).b(true).a(0, 0, 67, 0, (byte) 6);
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Enter Tomb";
        field_v = new hs();
    }
}
