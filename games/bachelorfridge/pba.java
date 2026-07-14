/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pba extends bca {
    static int field_r;
    static String field_q;

    public static void d(int param0) {
        if (param0 != -1) {
            field_q = null;
            field_q = null;
            return;
        }
        field_q = null;
    }

    final void a(op param0, int param1) {
        int var3 = 60 / ((param1 - 12) / 35);
        ((pba) this).a(param0, (byte) -2);
    }

    pba(lu param0) {
        super(param0);
        ((pba) this).field_k = param0.e((byte) 93);
        ((pba) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if (-1 < (var2 ^ -1)) {
                break;
            }
            ((pba) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
    }

    pba(int param0, nq param1) {
        super(param0, param1);
    }

    final at a(int param0, gj param1) {
        if (param0 != 5) {
            return null;
        }
        return (at) (Object) new nna(param1, (pba) this);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
    }
}
