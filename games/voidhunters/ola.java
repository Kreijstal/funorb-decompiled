/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ola extends gna {
    static qka field_p;
    private byte[] field_n;
    static int[] field_o;
    static String field_q;

    final void a(int param0, int param1, byte param2) {
        int incrementValue$2 = 0;
        int var4 = 0;
        if (param0 != 1111320769) {
          return;
        } else {
          var4 = 2 * param1;
          param2 = (byte)((127 & param2 >> -32962879) + 127);
          incrementValue$2 = var4;
          var4++;
          this.field_n[incrementValue$2] = (byte)param2;
          this.field_n[var4] = (byte)param2;
          return;
        }
    }

    final static caa[] d(byte param0) {
        caa[] discarded$3 = null;
        caa[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = VoidHunters.field_G;
        if (param0 == -91) {
          var1 = new caa[mma.field_a];
          var2 = 0;
          L0: while (true) {
            if (mma.field_a <= var2) {
              qqb.a(94);
              return var1;
            } else {
              var1[var2] = new caa(fbb.field_i, sg.field_H, iib.field_e[var2], so.field_f[var2], nhb.field_o[var2], hla.field_a[var2], sh.field_a[var2], rlb.field_d);
              var2++;
              continue L0;
            }
          }
        } else {
          discarded$3 = ola.d((byte) 67);
          var1 = new caa[mma.field_a];
          var2 = 0;
          L1: while (true) {
            if (mma.field_a <= var2) {
              qqb.a(94);
              return var1;
            } else {
              var1[var2] = new caa(fbb.field_i, sg.field_H, iib.field_e[var2], so.field_f[var2], nhb.field_o[var2], hla.field_a[var2], sh.field_a[var2], rlb.field_d);
              var2++;
              continue L1;
            }
          }
        }
    }

    public static void b(int param0) {
        caa[] discarded$0 = null;
        field_q = null;
        field_o = null;
        if (param0 != 2) {
            discarded$0 = ola.d((byte) -116);
            field_p = null;
            return;
        }
        field_p = null;
    }

    ola() {
        super(12, 5, 16, 2, 2, 0.44999998807907104f);
    }

    final byte[] a(int param0, int param1, int param2, int param3) {
        this.field_n = new byte[param1 * param3 * param0 * 2];
        if (param2 != -15281) {
          field_p = (qka) null;
          this.a(param3, (byte) -10, param0, param1);
          return this.field_n;
        } else {
          this.a(param3, (byte) -10, param0, param1);
          return this.field_n;
        }
    }

    static {
        field_o = new int[4];
        field_q = "Both teams win by getting their turret to the escape zone";
    }
}
