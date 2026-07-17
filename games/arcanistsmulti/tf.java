/*
 * Decompiled by CFR-JS 0.4.0.
 */
class tf extends pg {
    static int[] field_g;
    static String field_h;
    long field_k;
    tf field_i;
    static qb[] field_j;
    tf field_l;

    public static void a(int param0) {
        field_h = null;
        field_j = null;
        field_g = null;
    }

    final static ri a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        ri var7 = null;
        int var8 = 0;
        ri stackIn_4_0 = null;
        ri stackIn_8_0 = null;
        Object stackIn_11_0 = null;
        ri stackIn_15_0 = null;
        ri stackIn_21_0 = null;
        ri stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        ri stackOut_3_0 = null;
        ri stackOut_7_0 = null;
        ri stackOut_14_0 = null;
        ri stackOut_23_0 = null;
        ri stackOut_20_0 = null;
        Object stackOut_10_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            if (var2_int == 0) {
              stackOut_3_0 = uh.field_i;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (255 < var2_int) {
                stackOut_7_0 = b.field_e;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                var3 = eh.a(false, '.', param1);
                if (param0 == 32752) {
                  if (var3.length < 2) {
                    stackOut_14_0 = uh.field_i;
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0;
                  } else {
                    var4 = var3;
                    var5 = 0;
                    L1: while (true) {
                      if (var5 >= var4.length) {
                        stackOut_23_0 = ik.a(param0 + -32810, var3[var3.length - 1]);
                        stackIn_24_0 = stackOut_23_0;
                        break L0;
                      } else {
                        var6 = var4[var5];
                        var7 = mo.a(var6, 45);
                        if (var7 != null) {
                          stackOut_20_0 = (ri) var7;
                          stackIn_21_0 = stackOut_20_0;
                          return stackIn_21_0;
                        } else {
                          var5++;
                          continue L1;
                        }
                      }
                    }
                  }
                } else {
                  stackOut_10_0 = null;
                  stackIn_11_0 = stackOut_10_0;
                  return (ri) (Object) stackIn_11_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var2;
            stackOut_25_1 = new StringBuilder().append("tf.N(").append(param0).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L2;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 41);
        }
        return stackIn_24_0;
    }

    final static f a(int param0, int param1, byte[] param2) {
        f var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        f stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        f stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 == -25866) {
              var3 = new f(param2);
              cm.field_l.b((pg) (Object) var3, -1);
              pb.a(32, param0, var3);
              stackOut_3_0 = (f) var3;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (f) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3_ref;
            stackOut_5_1 = new StringBuilder().append("tf.Q(").append(param0).append(44).append(param1).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    final void a(byte param0) {
        if (param0 != 88) {
            ((tf) this).field_k = 116L;
        }
        if (!(((tf) this).field_i != null)) {
            return;
        }
        ((tf) this).field_i.field_l = ((tf) this).field_l;
        ((tf) this).field_l.field_i = ((tf) this).field_i;
        ((tf) this).field_l = null;
        ((tf) this).field_i = null;
    }

    final long b(boolean param0) {
        if (param0) {
            return 111L;
        }
        return ((tf) this).field_k;
    }

    final void a(int param0, long param1) {
        if (param0 != 46) {
            return;
        }
        if (null != ((tf) this).field_i) {
            throw new RuntimeException();
        }
        ((tf) this).field_k = param1;
    }

    final boolean d(byte param0) {
        if (param0 != -17) {
            return false;
        }
        if (((tf) this).field_i != null) {
            return true;
        }
        return false;
    }

    protected tf() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Remember to select the focus point's location, then fire as before. Destroy the targets!";
    }
}
