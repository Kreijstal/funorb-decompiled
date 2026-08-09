/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class krb extends gna {
    private byte[] field_n;

    final byte[] b(int param0, byte param1, int param2, int param3) {
        this.field_n = new byte[2 * param2 * (param0 * param3)];
        if (param1 != -29) {
          return (byte[]) null;
        } else {
          this.a(param0, (byte) -10, param2, param3);
          return this.field_n;
        }
    }

    krb() {
        super(12, 5, 16, 2, 2, 0.44999998807907104f);
    }

    final void a(int param0, int param1, byte param2) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int var4;
        var4 = 2 * param1;
        if (param0 != 1111320769) {
          this.b(48, (byte) 90, -105, 110);
          param2 = (byte)((127 & param2 >> 1182254049) + 127);
          incrementValue$2 = var4;
          var4++;
          this.field_n[incrementValue$2] = (byte)param2;
          this.field_n[var4] = (byte)param2;
          return;
        } else {
          param2 = (byte)((127 & param2 >> 1182254049) + 127);
          incrementValue$3 = var4;
          var4++;
          this.field_n[incrementValue$3] = (byte)param2;
          this.field_n[var4] = (byte)param2;
          return;
        }
    }

    static {
    }
}
