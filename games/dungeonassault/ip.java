/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ip extends m implements jo {
    static String field_j;
    static int[] field_l;
    static String field_i;
    private rm field_h;
    static String field_k;

    abstract od a(String param0, int param1);

    final static ab a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ab stackIn_3_0 = null;
        ab stackIn_6_0 = null;
        ab stackIn_16_0 = null;
        ab stackIn_20_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        ab stackOut_15_0 = null;
        ab stackOut_19_0 = null;
        ab stackOut_5_0 = null;
        ab stackOut_2_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var5 = DungeonAssault.field_K;
        try {
          var2_int = param1.length();
          if (var2_int != 0) {
            if (var2_int <= 63) {
              var3 = 0;
              L0: while (true) {
                if (var2_int > var3) {
                  L1: {
                    var4 = param1.charAt(var3);
                    if (var4 == 45) {
                      L2: {
                        if (var3 == 0) {
                          break L2;
                        } else {
                          if (var3 != var2_int - 1) {
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                      stackOut_15_0 = np.field_E;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    } else {
                      if (qj.field_b.indexOf(var4) == -1) {
                        stackOut_19_0 = np.field_E;
                        stackIn_20_0 = stackOut_19_0;
                        return stackIn_20_0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  var3++;
                  continue L0;
                } else {
                  return null;
                }
              }
            } else {
              stackOut_5_0 = ta.field_d;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0;
            }
          } else {
            stackOut_2_0 = ri.field_e;
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var2;
            stackOut_23_1 = new StringBuilder().append("ip.M(").append(0).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L3;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L3;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
    }

    public static void c() {
        field_i = null;
        field_l = null;
        field_j = null;
        field_k = null;
    }

    public final void a(rm param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -117) {
                break L1;
              } else {
                field_j = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ip.L(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    public final boolean a(int param0) {
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackOut_1_0 = 0;
        var2 = -78 % ((param0 - 8) / 40);
        if (null != ((ip) this).field_h.field_w) {
          if (((ip) this).field_h.field_w.length() == 0) {
            return true;
          } else {
            return false;
          }
        } else {
          stackOut_1_0 = 1;
          stackIn_3_0 = stackOut_1_0;
          return stackIn_3_0 != 0;
        }
    }

    abstract String a(byte param0, String param1);

    final od b(boolean param0) {
        if (param0) {
          od discarded$2 = ((ip) this).b(true);
          return ((ip) this).a(((ip) this).field_h.field_w, -92);
        } else {
          return ((ip) this).a(((ip) this).field_h.field_w, -92);
        }
    }

    final String c(int param0) {
        if (param0 != 63) {
          field_j = null;
          return ((ip) this).a((byte) 48, ((ip) this).field_h.field_w);
        } else {
          return ((ip) this).a((byte) 48, ((ip) this).field_h.field_w);
        }
    }

    ip(rm param0) {
        try {
            ((ip) this).field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "ip.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public final void a(rm param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((ip) this).b(2899);
              if (param1 == 10000536) {
                break L1;
              } else {
                field_i = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ip.R(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new int[8192];
        field_i = "To Customer Support";
        field_k = "<col=DB0100><%0></col> attempted, <col=DB0100><%1></col> successful";
    }
}
