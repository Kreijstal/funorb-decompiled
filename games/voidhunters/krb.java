/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class krb extends gna {
    private byte[] field_n;

    final byte[] b(int param0, byte param1, int param2, int param3) {
        ((krb) this).field_n = new byte[2 * param2 * (param0 * param3)];
        if (param1 != -29) {
          return null;
        } else {
          ((krb) this).a(param0, (byte) -10, param2, param3);
          return ((krb) this).field_n;
        }
    }

    krb() {
        super(12, 5, 16, 2, 2, 0.44999998807907104f);
    }

    final void a(int param0, int param1, byte param2) {
        int var4 = 0;
        var4 = 2 * param1;
        if (param0 != 1111320769) {
          byte[] discarded$3 = ((krb) this).b(48, (byte) 90, -105, 110);
          param2 = (byte)((127 & param2 >> 1) + 127);
          int incrementValue$4 = var4;
          var4++;
          ((krb) this).field_n[incrementValue$4] = (byte)param2;
          ((krb) this).field_n[var4] = (byte)param2;
          return;
        } else {
          param2 = (byte)((127 & param2 >> 1) + 127);
          int incrementValue$5 = var4;
          var4++;
          ((krb) this).field_n[incrementValue$5] = (byte)param2;
          ((krb) this).field_n[var4] = (byte)param2;
          return;
        }
    }

    static {
    }
}
