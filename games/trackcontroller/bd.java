/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd {
    static String[] field_a;
    static vi field_b;

    final static li a(int param0, bh param1) {
        li var2 = null;
        var2 = new li(param1, (fc) (Object) param1);
        if (param0 != -31085) {
          return null;
        } else {
          kd.field_a.a((byte) -122, (fc) (Object) var2);
          qc.field_e.a((wh) (Object) param1);
          return var2;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 <= 30) {
            bd.a(19);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_b = new vi();
    }
}
