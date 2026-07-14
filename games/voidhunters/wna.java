/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wna implements ntb {
    int field_b;
    int field_d;
    static tpb field_c;
    static boolean field_e;
    static String field_a;

    final static int a(int param0, String param1, int param2, byte param3, String param4, boolean param5, String param6) {
        dj var7 = null;
        dj var8 = null;
        var7 = new dj(param4);
        if (param3 <= 71) {
          return 100;
        } else {
          var8 = new dj(param1);
          return cnb.a(param0, var7, var8, param2, 0, param6, param5);
        }
    }

    public final void b(byte param0, tv param1) {
        wna var5 = null;
        wna var5_ref = null;
        wna var6 = null;
        wna var8 = null;
        wna var11 = null;
        var5 = null;
        if (param0 < 54) {
          wna.a((byte) -62);
          var5_ref = (wna) (Object) param1;
          var6 = var5_ref;
          var5 = var6;
          var6.field_d = var5.field_d;
          var6.field_b = var5.field_b;
          return;
        } else {
          var11 = (wna) (Object) param1;
          var5 = var11;
          var8 = var11;
          var8.field_d = var11.field_d;
          var8.field_b = var11.field_b;
          return;
        }
    }

    public final boolean a(byte param0, tv param1) {
        int var3 = 0;
        wna var4 = null;
        int stackIn_3_0 = 0;
        int stackOut_1_0 = 0;
        var3 = 15 / ((22 - param0) / 59);
        var4 = (wna) (Object) param1;
        if (var4.field_d == var4.field_d) {
          if (var4.field_b != var4.field_b) {
            return true;
          } else {
            return false;
          }
        } else {
          stackOut_1_0 = 1;
          stackIn_3_0 = stackOut_1_0;
          return stackIn_3_0 != 0;
        }
    }

    public final void a(tv param0, int param1) {
        wna var3 = null;
        int var4 = 0;
        L0: {
          var3 = (wna) (Object) param0;
          var4 = 0;
          if (var3.field_d != var3.field_d) {
            var4 = 1;
            System.out.println("int winner has changed. before=" + var3.field_d + ", now=" + var3.field_d);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (var3.field_b == var3.field_b) {
            break L1;
          } else {
            System.out.println("int winning_time has changed. before=" + var3.field_b + ", now=" + var3.field_b);
            var4 = 1;
            break L1;
          }
        }
        if (param1 <= -19) {
          if (var4 != 0) {
            System.out.println("This instance of RoundResult has changed");
            return;
          } else {
            return;
          }
        } else {
          ((wna) this).field_d = 97;
          if (var4 == 0) {
            return;
          } else {
            System.out.println("This instance of RoundResult has changed");
            return;
          }
        }
    }

    public final void a(faa param0, boolean param1) {
        ((wna) this).field_d = param0.i(0, 32);
        if (param1) {
            return;
        }
        ((wna) this).field_b = param0.i(0, 32);
    }

    public final void b(faa param0, int param1) {
        if (param1 > -109) {
          ((wna) this).field_b = 87;
          param0.a(-632, ((wna) this).field_d, 32);
          param0.a(-632, ((wna) this).field_b, 32);
          return;
        } else {
          param0.a(-632, ((wna) this).field_d, 32);
          param0.a(-632, ((wna) this).field_b, 32);
          return;
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 > -27) {
            return;
        }
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new tpb();
        field_a = "This game has been updated! Please reload this page.";
    }
}
