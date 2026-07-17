/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class um extends d implements ih {
    static String field_m;
    static ah field_k;
    static hl field_n;
    static hl field_l;
    private nn field_p;
    static boolean field_o;

    public final void a(nn param0, byte param1) {
        RuntimeException runtimeException = null;
        Object var4 = null;
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
              if (param1 == 101) {
                break L1;
              } else {
                var4 = null;
                String discarded$2 = um.a((String) null, ' ', false, (String) null);
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
            stackOut_3_1 = new StringBuilder().append("um.P(");
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
          throw oi.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    abstract jk a(int param0, String param1);

    abstract String a(String param0, int param1);

    final static String a(String param0, char param1, boolean param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_9_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var11 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              var4_int = param0.length();
              var5 = param3.length();
              var6 = var4_int;
              var7 = -1 + var5;
              if (var7 == 0) {
                break L1;
              } else {
                var8_int = 0;
                L2: while (true) {
                  var8_int = param0.indexOf((int) param1, var8_int);
                  if (var8_int >= 0) {
                    var6 = var6 + var7;
                    var8_int++;
                    continue L2;
                  } else {
                    break L1;
                  }
                }
              }
            }
            var8 = new StringBuilder(var6);
            var9 = 0;
            L3: while (true) {
              var10 = param0.indexOf((int) param1, var9);
              if (var10 < 0) {
                stackOut_9_0 = null;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                StringBuilder discarded$2 = var8.append(param0.substring(var9, var10));
                var9 = var10 + 1;
                StringBuilder discarded$3 = var8.append(param3);
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("um.N(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44).append(param1).append(44).append(0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return (String) (Object) stackIn_10_0;
    }

    final jk a(boolean param0) {
        Object var3 = null;
        if (param0) {
          var3 = null;
          ((um) this).a((byte) 77, (nn) null);
          return ((um) this).a(0, ((um) this).field_p.field_A);
        } else {
          return ((um) this).a(0, ((um) this).field_p.field_A);
        }
    }

    public final boolean b(int param0) {
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == 13074) {
          if (null != ((um) this).field_p.field_A) {
            if (((um) this).field_p.field_A.length() == 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            return stackIn_5_0 != 0;
          }
        } else {
          return false;
        }
    }

    public final void a(byte param0, nn param1) {
        try {
            ((um) this).a(127);
            int var3_int = 33 / ((-18 - param0) / 63);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "um.O(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final String e(int param0) {
        if (param0 != 0) {
            return null;
        }
        return ((um) this).a(((um) this).field_p.field_A, 26202);
    }

    public static void f(int param0) {
        Object var2 = null;
        field_m = null;
        if (param0 != 0) {
          var2 = null;
          String discarded$2 = um.a((String) null, 'w', false, (String) null);
          field_k = null;
          field_n = null;
          field_l = null;
          return;
        } else {
          field_k = null;
          field_n = null;
          field_l = null;
          return;
        }
    }

    um(nn param0) {
        try {
            ((um) this).field_p = param0;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "um.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
