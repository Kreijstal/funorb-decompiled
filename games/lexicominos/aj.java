/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj {
    int field_b;
    int field_a;

    final static void a(byte param0) {
        ed.field_t = null;
        hf.field_b = null;
        sc.field_e = false;
        qc.field_e = null;
        if (param0 != 9) {
            return;
        }
        nl.field_a = null;
    }

    final static void a(int param0, int param1, int param2, int param3, le param4, int param5, int param6, int param7, int param8, le param9, int param10, int param11, db[] param12, db[] param13, int param14, boolean param15, int param16, db[] param17, int param18, int param19, int param20) {
        gl.a(param4, param0, param1, param5, param20, param6, new wh(param17), param18, param9, new wh(param13), param14, param19, 0, param7, param2, param10, new wh(param12), param8, param16, param3, param11);
        if (!param15) {
          return;
        } else {
          return;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static ke a(byte param0, ke param1, ke param2) {
        int var3 = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        byte[] var8 = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        var3 = param2.field_i.length;
        var8 = new byte[var3 + param1.field_i.length];
        var7 = var8;
        var4 = var7;
        o.a(param2.field_i, 0, var8, 0, var3);
        o.a(param1.field_i, 0, var4, var3, param1.field_i.length);
        var5 = 0;
        L0: while (true) {
          if (var8.length <= var5) {
            if (param0 != -42) {
              return null;
            } else {
              return new ke(param2.field_m, var8, 0, var3);
            }
          } else {
            var4[var5] = (byte)(var4[var5] * 2);
            var5++;
            continue L0;
          }
        }
    }

    aj(int param0, int param1, int param2, int param3) {
        ((aj) this).field_b = param3;
        ((aj) this).field_a = param0;
    }

    static {
    }
}
