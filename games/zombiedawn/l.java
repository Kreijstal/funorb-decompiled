/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l extends ll {
    static int field_e;
    static vn[] field_b;
    private String field_c;
    private String field_f;
    static String field_g;
    static int field_d;

    final static b b(int param0, int param1) {
        b var2 = null;
        if (param0 < 62) {
          field_g = null;
          var2 = new b();
          qi.field_J.a(0, (le) (Object) var2);
          pp.a(2, param1);
          return var2;
        } else {
          var2 = new b();
          qi.field_J.a(0, (le) (Object) var2);
          pp.a(2, param1);
          return var2;
        }
    }

    final static boolean a(int param0, String param1) {
        if (param0 <= 56) {
            return false;
        }
        CharSequence var3 = (CharSequence) (Object) param1;
        return kf.field_T.equals((Object) (Object) fm.a(var3, -48));
    }

    final void a(boolean param0, de param1) {
        Object var4 = null;
        if (param0) {
          var4 = null;
          dh discarded$2 = l.a(-71, 119, (java.awt.Component) null, -102);
          param1.a((byte) -88, ((l) this).field_f);
          param1.a(((l) this).field_c, (byte) 95);
          return;
        } else {
          param1.a((byte) -88, ((l) this).field_f);
          param1.a(((l) this).field_c, (byte) 95);
          return;
        }
    }

    final nk a(byte param0) {
        if (param0 != -102) {
            field_b = null;
            return dp.field_a;
        }
        return dp.field_a;
    }

    final static dh a(int param0, int param1, java.awt.Component param2, int param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            dh var5 = null;
            pi var5_ref = null;
            dh stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            dh stackOut_2_0 = null;
            try {
              L0: {
                L1: {
                  if (param0 == -1) {
                    break L1;
                  } else {
                    field_b = null;
                    break L1;
                  }
                }
                var4 = Class.forName("ai");
                var5 = (dh) var4.newInstance();
                var5.a(param1, param3, param2, -11055);
                stackOut_2_0 = (dh) var5;
                stackIn_3_0 = stackOut_2_0;
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new pi();
              ((dh) (Object) var5_ref).a(param1, param3, param2, -11055);
              return (dh) (Object) var5_ref;
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        field_g = null;
        field_b = null;
        if (param0 != -1) {
            l.b(19);
        }
    }

    l(String param0, String param1) {
        ((l) this).field_c = param1;
        ((l) this).field_f = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = -1;
        field_d = -1;
    }
}
