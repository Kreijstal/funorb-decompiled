/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ola extends gna {
    static qka field_p;
    private byte[] field_n;
    static int[] field_o;
    static String field_q;

    final void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int incrementValue$0 = 0;
        if (param0 == 1111320769) {
          var4 = 2 * param1;
          param2 = (byte)((127 & param2 >> 1) + 127);
          incrementValue$0 = var4;
          var4++;
          this.field_n[incrementValue$0] = (byte)param2;
          this.field_n[var4] = (byte)param2;
          return;
        }
    }

    final static caa[] d(byte param0) {
        caa[] var1 = null;
        int var2 = 0;
        int var3 = VoidHunters.field_G;
        caa[] var1Lifetime1;
        int var2Lifetime1;
        if (param0 != -91) {
          ola.d((byte) 67);
        } else {
          var1 = new caa[mma.field_a];
          for (var2 = 0; mma.field_a > var2; var2++) {
            var1[var2] = new caa(fbb.field_i, sg.field_H, iib.field_e[var2], so.field_f[var2], nhb.field_o[var2], hla.field_a[var2], sh.field_a[var2], rlb.field_d);
          }
          qqb.a(94);
          return var1;
        }
        var1Lifetime1 = new caa[mma.field_a];
        for (var2Lifetime1 = 0; mma.field_a > var2Lifetime1; var2Lifetime1++) {
          var1Lifetime1[var2Lifetime1] = new caa(fbb.field_i, sg.field_H, iib.field_e[var2Lifetime1], so.field_f[var2Lifetime1], nhb.field_o[var2Lifetime1], hla.field_a[var2Lifetime1], sh.field_a[var2Lifetime1], rlb.field_d);
        }
        qqb.a(94);
        return var1Lifetime1;
    }

    public static void b(int param0) {
        field_q = null;
        field_o = null;
        if (param0 != 2) {
          ola.d((byte) -116);
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
        if (param2 == -15281) {
          this.a(param3, (byte) -10, param0, param1);
          return this.field_n;
        }
        field_p = (qka) null;
        this.a(param3, (byte) -10, param0, param1);
        return this.field_n;
    }

    static {
        field_o = new int[4];
        field_q = "Both teams win by getting their turret to the escape zone";
    }
}
