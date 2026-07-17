/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al {
    static int field_a;
    private Object field_b;

    final hs a(int param0) {
        try {
            IllegalAccessException var2 = null;
            java.lang.reflect.InvocationTargetException var2_ref = null;
            Object var3 = null;
            hs stackIn_3_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            hs stackOut_2_0 = null;
            if (!(((al) this).field_b instanceof hs)) {
              try {
                L0: {
                  var3 = null;
                  stackOut_2_0 = (hs) vb.field_n.invoke(((al) this).field_b, (Object[]) null);
                  stackIn_3_0 = stackOut_2_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } catch (java.lang.IllegalAccessException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L1: {
                  var2 = (IllegalAccessException) (Object) decompiledCaughtException;
                  decompiledRegionSelector0 = 1;
                  break L1;
                }
              } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                L2: {
                  var2_ref = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                  decompiledRegionSelector0 = 1;
                  break L2;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                return stackIn_3_0;
              } else {
                if (param0 == 0) {
                  return null;
                } else {
                  oha discarded$1 = al.a(-107, -17);
                  return null;
                }
              }
            } else {
              return (hs) ((al) this).field_b;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    al(hs param0) {
        try {
            IllegalAccessException var2 = null;
            java.lang.reflect.InvocationTargetException var2_ref = null;
            InstantiationException var2_ref2 = null;
            RuntimeException var2_ref3 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            String stackIn_13_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            try {
              ((al) this).field_b = (Object) (Object) param0;
              if (null != vb.field_g) {
                lv.field_m[0] = (Object) (Object) param0;
                try {
                  L0: {
                    ((al) this).field_b = vb.field_g.newInstance(lv.field_m);
                    break L0;
                  }
                } catch (java.lang.IllegalAccessException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = (IllegalAccessException) (Object) decompiledCaughtException;
                  return;
                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var2_ref = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                  return;
                } catch (java.lang.InstantiationException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var2_ref2 = (InstantiationException) (Object) decompiledCaughtException;
                  return;
                }
                return;
              } else {
                return;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L1: {
                var2_ref3 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_10_0 = (RuntimeException) var2_ref3;
                stackOut_10_1 = new StringBuilder().append("al.<init>(");
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                if (param0 == null) {
                  stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                  stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                  stackOut_12_2 = "null";
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  stackIn_13_2 = stackOut_12_2;
                  break L1;
                } else {
                  stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                  stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                  stackOut_11_2 = "{...}";
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_13_2 = stackOut_11_2;
                  break L1;
                }
              }
              throw pe.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b() {
        eha.field_s = null;
        baa.field_P = null;
        fd.field_D = null;
        hk.field_f = null;
        lq.field_A = null;
        fl.field_j = null;
    }

    final static oha a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        var2 = -33 % ((param0 - 28) / 58);
        var3 = 0;
        L0: while (true) {
          if (ur.field_e.length > var3) {
            if (null == ur.field_e[var3]) {
              var3++;
              var3++;
              var3++;
              continue L0;
            } else {
              if (param1 == ur.field_e[var3].field_j) {
                return ur.field_e[var3];
              } else {
                var3++;
                var3++;
                continue L0;
              }
            }
          } else {
            return null;
          }
        }
    }

    static {
    }
}
