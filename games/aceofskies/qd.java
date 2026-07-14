/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qd extends gg {
    static volatile int field_m;
    private int field_j;
    static ej field_n;
    private byte[] field_l;
    static int[] field_p;
    private int field_o;
    private int[] field_k;

    final static pj a(java.awt.Component param0, boolean param1, int param2, int param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            pj var5 = null;
            dp var5_ref = null;
            pj stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            pj stackOut_2_0 = null;
            L0: {
              if (param1) {
                break L0;
              } else {
                field_p = (int[]) null;
                break L0;
              }
            }
            try {
              var4 = Class.forName("lf");
              var5 = (pj) var4.newInstance();
              var5.a((byte) -61, param2, param3, param0);
              stackOut_2_0 = (pj) var5;
              stackIn_3_0 = stackOut_2_0;
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return (pj) (Object) stackIn_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    public static void d(int param0) {
        field_p = null;
        field_n = null;
        if (param0 != 7307) {
            java.awt.Component var2 = (java.awt.Component) null;
            pj discarded$0 = qd.a((java.awt.Component) null, true, -15, -70);
        }
    }

    final void a(int param0, int param1, byte param2) {
        ((qd) this).field_j = ((qd) this).field_j + (param1 * ((qd) this).field_k[param0] >> 316221036);
        if (param2 < 107) {
            ((qd) this).b(48, 121, (byte) -13);
        }
    }

    qd(int param0, int param1, int param2, int param3, int param4, float param5) {
        super(param0, param1, param2, param3, param4);
        int var7 = 0;
        ((qd) this).field_k = new int[((qd) this).field_f];
        for (var7 = 0; var7 < ((qd) this).field_f; var7++) {
            ((qd) this).field_k[var7] = (short)(int)(Math.pow((double)param5, (double)var7) * 4096.0);
        }
    }

    final void a(int param0) {
        ((qd) this).field_j = Math.abs(((qd) this).field_j);
        if (!(-4097 < (((qd) this).field_j ^ -1))) {
            ((qd) this).field_j = 4095;
        }
        ((qd) this).field_o = ((qd) this).field_o + 1;
        ((qd) this).b(255, ((qd) this).field_o, (byte)(((qd) this).field_j >> 1471925316));
        ((qd) this).field_j = param0;
    }

    void b(int param0, int param1, byte param2) {
        ((qd) this).field_o = ((qd) this).field_o + 1;
        ((qd) this).field_l[((qd) this).field_o] = (byte)((pg.a(param0, (int) param2) >> -840773503) + 127);
    }

    final void c(int param0) {
        ((qd) this).field_o = 0;
        ((qd) this).field_j = 0;
        if (param0 != -30042) {
            field_n = (ej) null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = -1;
        field_n = new ej(11, 0, 1, 2);
    }
}
