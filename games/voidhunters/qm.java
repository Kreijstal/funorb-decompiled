/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qm extends rqa {
    final static mab a(byte param0, java.awt.Component param1, int param2, int param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            mab var5 = null;
            sib var5_ref = null;
            Object var6 = null;
            mab stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            mab stackOut_2_0 = null;
            try {
              L0: {
                var4 = Class.forName("on");
                if (param0 == 3) {
                  break L0;
                } else {
                  var6 = null;
                  mab discarded$2 = qm.a((byte) 35, (java.awt.Component) null, -53, 89);
                  break L0;
                }
              }
              var5 = (mab) var4.newInstance();
              var5.a(param3, param2, param1, (byte) 61);
              stackOut_2_0 = (mab) var5;
              stackIn_3_0 = stackOut_2_0;
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    qm(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        si.a(44, 62, param0[0].a(99));
        if (param1 >= -119) {
          return null;
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    static {
    }
}
