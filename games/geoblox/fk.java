/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk extends sh {
    static ck field_B;

    final static byte[] a(int param0, String param1) {
        if (param0 != 2229) {
            return null;
        }
        return bf.field_i.a(0, param1, "");
    }

    final static void a(java.awt.Component param0, int param1) {
        param0.addMouseListener((java.awt.event.MouseListener) (Object) pg.field_c);
        if (param1 != 1) {
          field_B = null;
          param0.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) pg.field_c);
          param0.addFocusListener((java.awt.event.FocusListener) (Object) pg.field_c);
          return;
        } else {
          param0.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) pg.field_c);
          param0.addFocusListener((java.awt.event.FocusListener) (Object) pg.field_c);
          return;
        }
    }

    private fk(int param0, int param1, int param2, int param3, dh param4, bb param5, el param6) {
        super(param0, param1, param2, param3, param4, param5);
        ((fk) this).field_A = param6;
    }

    public static void f(int param0) {
        field_B = null;
        if (param0 != 14512) {
            field_B = null;
        }
    }

    final void a(int param0, int param1, boolean param2, el param3, int param4, int param5) {
        la var7 = null;
        super.a(param0, param1, param2, param3, param4, param5);
        var7 = lh.field_b;
        if (var7 != null) {
          if (((fk) this).a(param1, -1, param5, param4, param0)) {
            if (!(((fk) this).field_u instanceof rg)) {
              if (!(var7.field_u instanceof rg)) {
                return;
              } else {
                ((rg) (Object) var7.field_u).a((fk) this, var7, 22176);
                lh.field_b = null;
                return;
              }
            } else {
              ((rg) (Object) ((fk) this).field_u).a((fk) this, var7, 22176);
              lh.field_b = null;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static sc a(boolean param0, java.awt.Component param1, int param2, int param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            sc var5 = null;
            bf var5_ref = null;
            Object stackIn_2_0 = null;
            sc stackIn_4_0 = null;
            Throwable decompiledCaughtException = null;
            Object stackOut_1_0 = null;
            sc stackOut_3_0 = null;
            try {
              var4 = Class.forName("ve");
              if (!param0) {
                return (sc) (Object) stackIn_2_0;
              } else {
                stackOut_1_0 = null;
                stackIn_2_0 = stackOut_1_0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              var5 = (sc) var4.newInstance();
              var5.a(param2, param1, param3, (byte) 127);
              stackOut_3_0 = (sc) var5;
              stackIn_4_0 = stackOut_3_0;
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
        field_B = new ck(11, 0, 1, 2);
    }
}
