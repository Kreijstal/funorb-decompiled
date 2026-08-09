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
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                    ea.a(true, (int[]) null);
                    break L2;
                  }
                }
                stackIn_12_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (0 == param1[var2_int]) {
                  var2_int--;
                  continue L1;
                } else {
                  stackIn_7_0 = -1 + (ed.b(9, param1[var2_int]) + (var2_int << 2042070629));
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
            stackIn_15_0 = (RuntimeException) (var2);

            stackIn_15_1 = new StringBuilder().append("ea.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_12_0;
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
        pi var2;
        int var3;
        int var4;
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
                stackIn_3_0 = (gk) (Class.forName("qk").newInstance());
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
