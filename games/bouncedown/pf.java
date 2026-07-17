/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.Class;

final class pf extends ak {
    private bc field_E;
    static int[] field_A;
    static String[] field_D;
    static String field_B;

    final void d(byte param0) {
        int var4 = Bounce.field_N;
        ea var2 = new ea(((pf) this).field_E);
        if (param0 <= 109) {
            field_A = null;
        }
        ri var3 = (ri) (Object) var2.a(22092);
        while (var3 != null) {
            if (!(!var3.e((byte) 21))) {
                var3.c(2);
            }
            var3 = (ri) (Object) var2.c(-124);
        }
        ((pf) this).field_x = (lk) (Object) ((pf) this).a(false);
    }

    public static void j() {
        field_B = null;
        field_A = null;
        field_D = null;
    }

    final void l(int param0) {
        int var4 = Bounce.field_N;
        if (param0 != -26623) {
            return;
        }
        ea var2 = new ea(((pf) this).field_E);
        ri var3 = (ri) (Object) var2.a(22092);
        while (var3 != null) {
            if (var3.f((byte) -33)) {
                var3.c(param0 ^ -26621);
            }
            var3 = (ri) (Object) var2.c(-102);
        }
    }

    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            var3 = bc.a(param2, -123);
            if (-1 != param1.indexOf(param2)) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (-1 == param1.indexOf(var3)) {
                L1: {
                  L2: {
                    if (param1.startsWith(param2)) {
                      break L2;
                    } else {
                      if (param1.startsWith(var3)) {
                        break L2;
                      } else {
                        if (param1.endsWith(param2)) {
                          break L2;
                        } else {
                          if (!param1.endsWith(var3)) {
                            stackOut_11_0 = 0;
                            stackIn_12_0 = stackOut_11_0;
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  stackOut_10_0 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  break L1;
                }
                break L0;
              } else {
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("pf.B(").append(128).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          L4: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
        return stackIn_12_0 != 0;
    }

    final ri a(boolean param0) {
        ea var2 = null;
        ri var3 = null;
        int var4 = 0;
        L0: {
          var4 = Bounce.field_N;
          var2 = new ea(((pf) this).field_E);
          var3 = (ri) (Object) var2.a(22092);
          if (!param0) {
            break L0;
          } else {
            ((pf) this).a(43, 120, -50, -123);
            break L0;
          }
        }
        L1: while (true) {
          if (var3 != null) {
            if (!var3.field_D) {
              var3 = (ri) (Object) var2.c(-109);
              continue L1;
            } else {
              return var3;
            }
          } else {
            return null;
          }
        }
    }

    final void k(int param0) {
        int var4 = Bounce.field_N;
        ea var2 = new ea(((pf) this).field_E);
        ri var3 = (ri) (Object) var2.a(22092);
        while (var3 != null) {
            var3.field_D = false;
            var3 = (ri) (Object) var2.c(-85);
        }
        if (param0 != -20281) {
            field_D = null;
        }
        ((pf) this).field_x = null;
    }

    final static Class a(String param0) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_7_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_14_0 = null;
        Class stackIn_18_0 = null;
        Class stackIn_21_0 = null;
        Class stackIn_25_0 = null;
        Class stackIn_29_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        Class stackOut_2_0 = null;
        Class stackOut_6_0 = null;
        Class stackOut_13_0 = null;
        Class stackOut_17_0 = null;
        Class stackOut_24_0 = null;
        Class stackOut_28_0 = null;
        Class stackOut_20_0 = null;
        Class stackOut_9_0 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        try {
          L0: {
            if (param0.equals((Object) (Object) "B")) {
              stackOut_2_0 = Byte.TYPE;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (param0.equals((Object) (Object) "I")) {
                stackOut_6_0 = Integer.TYPE;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (!param0.equals((Object) (Object) "S")) {
                  if (param0.equals((Object) (Object) "J")) {
                    stackOut_13_0 = Long.TYPE;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  } else {
                    if (param0.equals((Object) (Object) "Z")) {
                      stackOut_17_0 = Boolean.TYPE;
                      stackIn_18_0 = stackOut_17_0;
                      return stackIn_18_0;
                    } else {
                      if (!param0.equals((Object) (Object) "F")) {
                        if (param0.equals((Object) (Object) "D")) {
                          stackOut_24_0 = Double.TYPE;
                          stackIn_25_0 = stackOut_24_0;
                          return stackIn_25_0;
                        } else {
                          if (param0.equals((Object) (Object) "C")) {
                            stackOut_28_0 = Character.TYPE;
                            stackIn_29_0 = stackOut_28_0;
                            break L0;
                          } else {
                            return Class.forName(param0);
                          }
                        }
                      } else {
                        stackOut_20_0 = Float.TYPE;
                        stackIn_21_0 = stackOut_20_0;
                        return stackIn_21_0;
                      }
                    }
                  }
                } else {
                  stackOut_9_0 = Short.TYPE;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var2;
            stackOut_30_1 = new StringBuilder().append("pf.O(");
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L1;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L1;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 44 + -1 + 41);
        }
        return stackIn_29_0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var7 = Bounce.field_N;
        if (!(null == ((pf) this).field_j)) {
            ((pf) this).field_j.a(param1, (lk) this, (byte) 3, true, param3);
        }
        if (param2 < 33) {
            field_B = null;
        }
        ea var5 = new ea(((pf) this).field_E);
        lk var6 = (lk) (Object) var5.e(50);
        while (var6 != null) {
            var6.a(param0, param1 - -((pf) this).field_i, 68, param3 - -((pf) this).field_r);
            var6 = (lk) (Object) var5.a((byte) 33);
        }
    }

    final void b(lk param0, boolean param1) {
        ri var3 = null;
        try {
            if (!(param0 instanceof ri)) {
                throw new IllegalArgumentException();
            }
            var3 = (ri) (Object) param0;
            ((pf) this).field_E.a((byte) 83, (ai) (Object) var3);
            var3.field_D = true;
            boolean discarded$0 = var3.a((lk) this, param1);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "pf.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final lk a(int param0) {
        ea var2 = null;
        ri var3 = null;
        int var4 = 0;
        L0: {
          var4 = Bounce.field_N;
          var2 = new ea(((pf) this).field_E);
          if (param0 == 0) {
            break L0;
          } else {
            ((pf) this).d((byte) -47);
            break L0;
          }
        }
        var3 = (ri) (Object) var2.a(22092);
        L1: while (true) {
          if (var3 != null) {
            if (!var3.field_D) {
              var3 = (ri) (Object) var2.c(-119);
              continue L1;
            } else {
              return var3.d((byte) 99);
            }
          } else {
            return null;
          }
        }
    }

    public pf() {
        super(0, 0, ob.field_a, gi.field_e, (fc) null, (sk) null);
        ((pf) this).field_E = new bc();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = new int[128];
        field_D = new String[]{"Showing by rating", "Showing by win percentage"};
        field_B = "Please try again in a few minutes.";
    }
}
