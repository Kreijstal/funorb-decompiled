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
            RuntimeException var4_ref2 = null;
            pj var5 = null;
            dp var5_ref = null;
            pj stackIn_3_0 = null;
            dp stackIn_5_0 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            pj stackOut_2_0 = null;
            dp stackOut_4_0 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              L0: {
                L1: {
                  if (param1) {
                    break L1;
                  } else {
                    field_p = (int[]) null;
                    break L1;
                  }
                }
                try {
                  L2: {
                    var4 = Class.forName("lf");
                    var5 = (pj) (var4.newInstance());
                    var5.a((byte) -61, param2, param3, param0);
                    stackOut_2_0 = (pj) (var5);
                    stackIn_3_0 = stackOut_2_0;
                    break L2;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4_ref = decompiledCaughtException;
                  var5_ref = new dp();
                  ((pj) ((Object) var5_ref)).a((byte) -58, param2, param3, param0);
                  stackOut_4_0 = (dp) (var5_ref);
                  stackIn_5_0 = stackOut_4_0;
                  return (pj) ((Object) stackIn_5_0);
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var4_ref2);
                stackOut_6_1 = new StringBuilder().append("qd.O(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L3;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L3;
                }
              }
              throw pn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void d(int param0) {
        pj discarded$0 = null;
        field_p = null;
        field_n = null;
        if (param0 != 7307) {
            java.awt.Component var2 = (java.awt.Component) null;
            discarded$0 = qd.a((java.awt.Component) null, true, -15, -70);
        }
    }

    final void a(int param0, int param1, byte param2) {
        this.field_j = this.field_j + (param1 * this.field_k[param0] >> 316221036);
        if (param2 < 107) {
            this.b(48, 121, (byte) -13);
        }
    }

    qd(int param0, int param1, int param2, int param3, int param4, float param5) {
        super(param0, param1, param2, param3, param4);
        int var7 = 0;
        this.field_k = new int[this.field_f];
        for (var7 = 0; var7 < this.field_f; var7++) {
            this.field_k[var7] = (short)(int)(Math.pow((double)param5, (double)var7) * 4096.0);
        }
    }

    final void a(int param0) {
        this.field_j = Math.abs(this.field_j);
        if (!(-4097 < (this.field_j ^ -1))) {
            this.field_j = 4095;
        }
        int fieldTemp$0 = this.field_o;
        this.field_o = this.field_o + 1;
        this.b(255, fieldTemp$0, (byte)(this.field_j >> 1471925316));
        this.field_j = param0;
    }

    void b(int param0, int param1, byte param2) {
        int fieldTemp$0 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_l[fieldTemp$0] = (byte)((pg.a(param0, (int) param2) >> -840773503) + 127);
    }

    final void c(int param0) {
        this.field_o = 0;
        this.field_j = 0;
        if (param0 != -30042) {
            field_n = (ej) null;
        }
    }

    static {
        field_m = -1;
        field_n = new ej(11, 0, 1, 2);
    }
}
