/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg {
    static String field_f;
    int field_b;
    int field_g;
    int field_a;
    static te field_i;
    int field_e;
    static boolean field_j;
    static boolean[] field_k;
    static int field_c;
    static String field_h;
    static ai[] field_d;

    final static eg[] a(md param0, boolean param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        eg[] var4 = null;
        int var5 = 0;
        eg var6 = null;
        int var7 = 0;
        ic var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        eg[] stackIn_4_0 = null;
        eg[] stackIn_13_0 = null;
        eg[] stackIn_19_0 = null;
        eg[] stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        eg[] stackOut_3_0 = null;
        eg[] stackOut_18_0 = null;
        eg[] stackOut_21_0 = null;
        eg[] stackOut_12_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (!param0.a(2)) {
              stackOut_3_0 = new eg[]{};
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              var8 = param0.b((byte) -66);
              L1: while (true) {
                L2: {
                  L3: {
                    if (var8.field_g != 0) {
                      break L3;
                    } else {
                      em.a(10L, false);
                      if (var7 != 0) {
                        break L2;
                      } else {
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  if (var8.field_g == 2) {
                    break L2;
                  } else {
                    L4: {
                      var12 = (int[]) var8.field_b;
                      var11 = var12;
                      var10 = var11;
                      var9 = var10;
                      var3 = var9;
                      var4 = new eg[var12.length >> 2];
                      if (param1) {
                        break L4;
                      } else {
                        field_j = false;
                        break L4;
                      }
                    }
                    var5 = 0;
                    L5: while (true) {
                      L6: {
                        L7: {
                          if (var4.length <= var5) {
                            break L7;
                          } else {
                            var6 = new eg();
                            stackOut_18_0 = (eg[]) var4;
                            stackIn_22_0 = stackOut_18_0;
                            stackIn_19_0 = stackOut_18_0;
                            if (var7 != 0) {
                              break L6;
                            } else {
                              stackIn_19_0[var5] = var6;
                              var6.field_a = var3[var5 << 2];
                              var6.field_b = var3[(var5 << 2) - -1];
                              var6.field_e = var3[(var5 << 2) - -2];
                              var6.field_g = var3[3 + (var5 << 2)];
                              var5++;
                              if (var7 == 0) {
                                continue L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        stackOut_21_0 = (eg[]) var4;
                        stackIn_22_0 = stackOut_21_0;
                        break L6;
                      }
                      break L0;
                    }
                  }
                }
                stackOut_12_0 = new eg[]{};
                stackIn_13_0 = stackOut_12_0;
                return stackIn_13_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var2;
            stackOut_23_1 = new StringBuilder().append("eg.C(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw la.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + param1 + 41);
        }
        return stackIn_22_0;
    }

    final static void a(int param0, int param1) {
        field_d = null;
    }

    final static String a(String param0, int param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        String stackIn_5_0 = null;
        String stackIn_6_0 = null;
        String stackOut_4_0 = null;
        L0: {
          var5 = MonkeyPuzzle2.field_F ? 1 : 0;
          var4 = param3.indexOf(param2);
          if (param1 == 4) {
            break L0;
          } else {
            eg.a(47, -126);
            break L0;
          }
        }
        L1: while (true) {
          if (var4 != -1) {
            param3 = param3.substring(0, var4) + param0 + param3.substring(param2.length() + var4);
            stackOut_4_0 = (String) param3;
            stackIn_6_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if (var5 == 0) {
              var4 = ((String) (Object) stackIn_6_0).indexOf(param2, var4 + param0.length());
              continue L1;
            } else {
              return stackIn_5_0;
            }
          } else {
            return param3;
          }
        }
    }

    public static void a(byte param0) {
        field_k = null;
        field_h = null;
        field_d = null;
        field_i = null;
        if (param0 != -108) {
          field_f = null;
          field_f = null;
          return;
        } else {
          field_f = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Connection lost - attempting to reconnect";
        field_i = new te(2, 4, 4, 0);
        field_h = "Please wait...";
        field_k = new boolean[64];
    }
}
