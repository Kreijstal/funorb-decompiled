/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qca {
    private kda field_a;
    long field_b;

    protected final void finalize() throws Throwable {
        ((qca) this).field_a.a(((qca) this).field_b, -6115);
        super.finalize();
    }

    final static boolean a(byte param0, int[] param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param0 == 13) {
          var2 = 0;
          L0: while (true) {
            if (8 > var2) {
              if (0 == param1[var2]) {
                var2++;
                continue L0;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    qca(kda param0, long param1, pr[] param2) {
        ((qca) this).field_a = param0;
        ((qca) this).field_b = param1;
    }

    static {
    }
}
