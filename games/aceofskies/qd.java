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
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (!param1) {
              field_p = (int[]) null;
            }
            try {
              Class var4 = Class.forName("lf");
              pj var5 = (pj) (var4.newInstance());
              var5.a((byte) -61, param2, param3, param0);
              pj stackIn_3_0 = var5;
              return stackIn_3_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              Throwable var4_ref = decompiledCaughtException;
              dp var5_ref = new dp();
              ((pj) ((Object) var5_ref)).a((byte) -58, param2, param3, param0);
              dp stackIn_5_0 = var5_ref;
              return (pj) ((Object) stackIn_5_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            RuntimeException var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_8_0 = var4_ref2;
            StringBuilder stackIn_8_1 = new StringBuilder().append("qd.O(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw pn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void d(int param0) {
        field_p = null;
        field_n = null;
        if (param0 != 7307) {
          java.awt.Component var2 = (java.awt.Component) null;
          qd.a((java.awt.Component) null, true, -15, -70);
        }
    }

    final void a(int param0, int param1, byte param2) {
        this.field_j = this.field_j + (param1 * this.field_k[param0] >> 12);
        if (param2 < 107) {
          this.b(48, 121, (byte) -13);
        }
    }

    qd(int param0, int param1, int param2, int param3, int param4, float param5) {
        super(param0, param1, param2, param3, param4);
        this.field_k = new int[this.field_f];
        for (int var7 = 0; var7 < this.field_f; var7++) {
          this.field_k[var7] = (short)(int)(Math.pow((double)param5, (double)var7) * 4096.0);
        }
    }

    final void a(int param0) {
        this.field_j = Math.abs(this.field_j);
        if (this.field_j >= 4096) {
          this.field_j = 4095;
        }
        int fieldTemp$0 = this.field_o;
        this.field_o = this.field_o + 1;
        this.b(255, fieldTemp$0, (byte)(this.field_j >> 4));
        this.field_j = param0;
    }

    void b(int param0, int param1, byte param2) {
        int fieldTemp$0 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_l[fieldTemp$0] = (byte)((pg.a(param0, (int) param2) >> 1) + 127);
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
