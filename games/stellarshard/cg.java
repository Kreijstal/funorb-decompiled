/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg {
    static int[] field_d;
    static boolean field_a;
    static int field_c;
    static String field_b;

    final static void a(byte param0) {
        Object var2 = null;
        if (param0 < 54) {
          var2 = null;
          cg.a(-26, (qc) null, -94, -80, -18, 102, -121, (qc) null, (bd) null, (byte) 5, 41, -60, 79, (qc) null, -121, 122, 103, 36, 121, (bd) null, 37);
          sf.field_f.b((rj) (Object) new se(), 23143);
          return;
        } else {
          sf.field_f.b((rj) (Object) new se(), 23143);
          return;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        if (param0 != -26814) {
            return;
        }
        field_d = null;
        field_b = null;
    }

    final static void a(int param0, qc param1, int param2, int param3, int param4, int param5, int param6, qc param7, bd param8, byte param9, int param10, int param11, int param12, qc param13, int param14, int param15, int param16, int param17, int param18, bd param19, int param20) {
        th.a(param8, param19, param17, -128);
        if (param9 != 45) {
          return;
        } else {
          qe.a(param4, -29770, param10, param12, param5);
          ki.a(param0, param3, -126);
          ph.a(14835, param13, param20, param11, param2, param7);
          jb.a(param16, param6, param1, -100);
          uh.a(11130, param18, param14, param15);
          return;
        }
    }

    final static vi a(java.awt.Component param0, boolean param1, int param2, int param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            vi var5 = null;
            mh var5_ref = null;
            Object stackIn_2_0 = null;
            vi stackIn_4_0 = null;
            Throwable decompiledCaughtException = null;
            vi stackOut_3_0 = null;
            Object stackOut_1_0 = null;
            try {
              L0: {
                var4 = Class.forName("jk");
                if (!param1) {
                  var5 = (vi) var4.newInstance();
                  var5.a(param0, param3, param2, (byte) -122);
                  stackOut_3_0 = (vi) var5;
                  stackIn_4_0 = stackOut_3_0;
                  break L0;
                } else {
                  stackOut_1_0 = null;
                  stackIn_2_0 = stackOut_1_0;
                  return (vi) (Object) stackIn_2_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new mh();
              ((vi) (Object) var5_ref).a(param0, param3, param2, (byte) -117);
              return (vi) (Object) var5_ref;
            }
            return stackIn_4_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = true;
        field_b = "Names should contain a maximum of 12 characters";
    }
}
