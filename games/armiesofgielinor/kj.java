/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj extends bd {
    static wk[] field_s;
    static String field_t;

    final void a(int param0, ha param1) {
        if (param0 != 64) {
            kj.a(true, -124);
        }
    }

    final static void a(boolean param0, int param1) {
        qc.field_d = new dl(2);
        qc.field_d.a(-1, param0, vf.a(sm.field_d, -1, ko.field_b), param1);
    }

    final static byte[] a(byte[] param0, int param1) {
        int var2 = 0;
        byte[] var3 = null;
        var2 = param0.length;
        if (param1 != 31732) {
          String discarded$2 = kj.a((byte) -52);
          var3 = new byte[var2];
          vm.a(param0, 0, var3, 0, var2);
          return var3;
        } else {
          var3 = new byte[var2];
          vm.a(param0, 0, var3, 0, var2);
          return var3;
        }
    }

    kj(int param0, int param1) {
        ((kj) this).field_m = param0;
        ((kj) this).field_n = new int[param1];
        ((kj) this).field_n[((kj) this).field_m] = 8192;
    }

    public static void a(boolean param0) {
        field_t = null;
        if (param0) {
            String discarded$0 = kj.a((byte) 66);
            field_s = null;
            return;
        }
        field_s = null;
    }

    final static String a(byte param0) {
        String var1 = null;
        Object var2 = null;
        if (param0 <= 26) {
          var2 = null;
          byte[] discarded$2 = kj.a((byte[]) null, -39);
          var1 = ah.field_a.a((byte) -109);
          System.out.println(var1);
          return var1;
        } else {
          var1 = ah.field_a.a((byte) -109);
          System.out.println(var1);
          return var1;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Hide objective";
    }
}
