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
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        var2 = -1 + param1.length;
        L0: while (true) {
          if (-1 < (var2 ^ -1)) {
            if (!param0) {
              var4 = null;
              int discarded$2 = ea.a(true, (int[]) null);
              return -1;
            } else {
              return -1;
            }
          } else {
            if (0 == param1[var2]) {
              var2--;
              continue L0;
            } else {
              return -1 + (ed.b(9, param1[var2]) + (var2 << 2042070629));
            }
          }
        }
    }

    public static void a(byte param0) {
        if (param0 > -33) {
            field_h = null;
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
            return (java.awt.Container) (Object) cb.field_o;
          } else {
            return (java.awt.Container) (Object) uc.e((byte) -83);
          }
        } else {
          field_g = true;
          if (null != cb.field_o) {
            return (java.awt.Container) (Object) cb.field_o;
          } else {
            return (java.awt.Container) (Object) uc.e((byte) -83);
          }
        }
    }

    final static gk a(int param0) {
        try {
            Throwable var1 = null;
            gk stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            gk stackOut_2_0;
            try {
              L0: {
                if (param0 > 59) {
                  break L0;
                } else {
                  field_b = -61;
                  break L0;
                }
              }
              stackOut_2_0 = (gk) Class.forName("qk").newInstance();
              stackIn_3_0 = stackOut_2_0;
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return (gk) (Object) stackIn_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = true;
        field_f = "Invite";
        field_d = 0;
        field_h = "You need a rating of <%1> to play with the current options.";
        field_a = true;
    }
}
