/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea {
    static int field_e;
    static int field_b;
    static int field_d;
    static String field_f;
    static int field_c;
    static boolean field_g;
    static boolean field_a;
    static String field_h;

    final static int a(boolean param0, int[] param1) {
        int discarded$2 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var2_int = -1 + param1.length;
            L1: while (true) {
              if (-1 < (var2_int ^ -1)) {
                L2: {
                  if (param0) {
                    break L2;
                  } else {
                    var4 = (int[]) null;
                    discarded$2 = ea.a(true, (int[]) null);
                    break L2;
                  }
                }
                stackOut_9_0 = -1;
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (0 == param1[var2_int]) {
                  var2_int--;
                  continue L1;
                } else {
                  stackOut_4_0 = -1 + (ed.b(9, param1[var2_int]) + (var2_int << 2042070629));
                  stackIn_5_0 = stackOut_4_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var2);
            stackOut_11_1 = new StringBuilder().append("ea.E(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_10_0;
        }
    }

    public static void a(byte param0) {
        if (param0 > -33) {
            field_h = (String) null;
            field_f = null;
            field_h = null;
            return;
        }
        field_f = null;
        field_h = null;
    }

    final static void a(int param0, int param1) {
        pi var2 = null;
        int var3 = 0;
        int var4 = 0;
        var2 = k.field_h;
        var2.e(-13413, param1);
        var2.field_l = var2.field_l + 1;
        var3 = var2.field_l;
        var2.a(71, 5);
        var2.a(param0 ^ 10903, o.field_e.field_jc);
        if (param0 != -11008) {
          ea.a(109, -29);
          var4 = o.field_e.field_kc - -(o.field_e.field_wc << -1326113338);
          var2.a(15, var4);
          var2.a(o.field_e.field_Tb, -1, 0, o.field_e.field_Tb.length);
          var2.d((byte) 118, -var3 + var2.field_l);
          return;
        } else {
          var4 = o.field_e.field_kc - -(o.field_e.field_wc << -1326113338);
          var2.a(15, var4);
          var2.a(o.field_e.field_Tb, -1, 0, o.field_e.field_Tb.length);
          var2.d((byte) 118, -var3 + var2.field_l);
          return;
        }
    }

    final static java.awt.Container b(int param0) {
        if (param0 == 0) {
          if (null != cb.field_o) {
            return (java.awt.Container) ((Object) cb.field_o);
          } else {
            return (java.awt.Container) ((Object) uc.e((byte) -83));
          }
        } else {
          field_g = true;
          if (null != cb.field_o) {
            return (java.awt.Container) ((Object) cb.field_o);
          } else {
            return (java.awt.Container) ((Object) uc.e((byte) -83));
          }
        }
    }

    final static gk a(int param0) {
        try {
            Throwable var1 = null;
            gk stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            gk stackOut_2_0 = null;
            try {
              L0: {
                L1: {
                  if (param0 > 59) {
                    break L1;
                  } else {
                    field_b = -61;
                    break L1;
                  }
                }
                stackOut_2_0 = (gk) (Class.forName("qk").newInstance());
                stackIn_3_0 = stackOut_2_0;
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              return null;
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_g = true;
        field_f = "Invite";
        field_d = 0;
        field_h = "You need a rating of <%1> to play with the current options.";
        field_a = true;
    }
}
