/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh extends bl {
    static int field_E;
    static String field_A;
    private Object field_B;
    static bj field_C;
    static boolean field_F;

    final boolean h(int param0) {
        oe discarded$0 = null;
        if (param0 != 0) {
            discarded$0 = oh.c((byte) 92);
            return false;
        }
        return false;
    }

    oh(Object param0, int param1) {
        super(param1);
        try {
            this.field_B = param0;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "oh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static String a(long param0, int param1) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        int var3 = 0;
        long var4 = 0L;
        StringBuilder var6 = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = MinerDisturbance.field_ab;
        if (param1 == 95) {
          if (-1L > (param0 ^ -1L)) {
            if (-6582952005840035282L < (param0 ^ -1L)) {
              if ((param0 % 37L ^ -1L) == -1L) {
                return null;
              } else {
                var3 = 0;
                var4 = param0;
                L0: while (true) {
                  if (0L == var4) {
                    var6 = new StringBuilder(var3);
                    L1: while (true) {
                      if (param0 == 0L) {
                        discarded$2 = var6.reverse();
                        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                        return var6.toString();
                      } else {
                        L2: {
                          var7 = param0;
                          param0 = param0 / 37L;
                          var9 = bh.field_db[(int)(-(param0 * 37L) + var7)];
                          if (var9 == 95) {
                            var10 = var6.length() - 1;
                            var9 = 160;
                            var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                        discarded$3 = var6.append((char) var9);
                        continue L1;
                      }
                    }
                  } else {
                    var3++;
                    var4 = var4 / 37L;
                    continue L0;
                  }
                }
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return (String) null;
        }
    }

    public static void i(int param0) {
        field_A = null;
        int var1 = -128 % ((54 - param0) / 48);
        field_C = null;
    }

    final Object f(int param0) {
        int var2 = 32 % ((5 - param0) / 45);
        return this.field_B;
    }

    final static vc a(int param0, int param1, bj param2) {
        vc discarded$2 = null;
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        bj var4 = null;
        byte[] var5 = null;
        vc stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        vc stackOut_5_0 = null;
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
              if (param0 < -86) {
                break L1;
              } else {
                var4 = (bj) null;
                discarded$2 = oh.a(-87, 94, (bj) null);
                break L1;
              }
            }
            var5 = param2.e(param1, 1);
            var3 = var5;
            if (var5 != null) {
              stackOut_5_0 = new vc(var5);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3_ref);
            stackOut_7_1 = new StringBuilder().append("oh.D(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    final static oe c(byte param0) {
        try {
            Throwable var1 = null;
            oe stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            oe stackOut_2_0 = null;
            if (param0 > 53) {
              try {
                L0: {
                  stackOut_2_0 = (oe) (Class.forName("na").newInstance());
                  stackIn_3_0 = stackOut_2_0;
                  break L0;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = decompiledCaughtException;
                return null;
              }
              return stackIn_3_0;
            } else {
              return (oe) null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_E = 10;
        field_F = false;
        field_A = "Continue";
    }
}
