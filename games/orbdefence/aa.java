/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class aa {
    static int field_c;
    static String field_b;
    static nh field_d;
    static String field_a;

    final static byte[] a(se param0, byte[] param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_20_0 = null;
        byte[] stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_19_0 = null;
        byte[] stackOut_22_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var4_int = param0.h(param2, 8);
            if (-1 != (var4_int ^ -1)) {
              L1: {
                L2: {
                  if (param1 == null) {
                    break L2;
                  } else {
                    if (param1.length != var4_int) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                param1 = new byte[var4_int];
                break L1;
              }
              L3: {
                if (param3 == 20783) {
                  break L3;
                } else {
                  field_b = (String) null;
                  break L3;
                }
              }
              L4: {
                L5: {
                  L6: {
                    var5 = param0.h(3, 8);
                    var6 = (byte)param0.h(8, param3 ^ 20775);
                    if (var5 <= 0) {
                      break L6;
                    } else {
                      var7 = 0;
                      L7: while (true) {
                        if (var7 >= var4_int) {
                          if (var8 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        } else {
                          param1[var7] = (byte)(param0.h(var5, 8) + var6);
                          var7++;
                          if (var8 != 0) {
                            break L5;
                          } else {
                            continue L7;
                          }
                        }
                      }
                    }
                  }
                  var7 = 0;
                  L8: while (true) {
                    if (var4_int <= var7) {
                      break L5;
                    } else {
                      stackOut_19_0 = (byte[]) (param1);
                      stackIn_23_0 = stackOut_19_0;
                      stackIn_20_0 = stackOut_19_0;
                      if (var8 != 0) {
                        break L4;
                      } else {
                        stackIn_20_0[var7] = (byte)var6;
                        var7++;
                        continue L8;
                      }
                    }
                  }
                }
                stackOut_22_0 = (byte[]) (param1);
                stackIn_23_0 = stackOut_22_0;
                break L4;
              }
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var4);
            stackOut_24_1 = new StringBuilder().append("aa.K(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          L10: {
            stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L10;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L10;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_23_0;
    }

    abstract void b(int param0);

    abstract int a(int param0, long param1);

    abstract long a(int param0);

    public static void a(byte param0) {
        field_d = null;
        field_a = null;
        if (param0 > -13) {
            aa.a((byte) 34);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final int b(int param0, long param1) {
        long var4 = 0L;
        L0: {
          var4 = this.a(17990);
          if ((var4 ^ -1L) < -1L) {
            hb.a(var4, param0 + 108);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 0) {
          field_b = (String) null;
          return this.a(param0 ^ -21342, param1);
        } else {
          return this.a(param0 ^ -21342, param1);
        }
    }

    static {
        field_b = "Members' Benefits";
        field_a = "You must build in an empty gridded area";
    }
}
