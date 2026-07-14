/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ika extends rna implements ntb {
    static int[] field_c;
    static int[] field_a;
    private int field_b;

    public final boolean a(byte param0, tv param1) {
        ika var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackOut_1_0 = 0;
        var3 = (ika) (Object) param1;
        var4 = -69 % ((param0 - 22) / 59);
        if (!super.a((byte) -127, param1)) {
          if (((ika) this).field_b != var3.field_b) {
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

    final String a(int param0) {
        if (param0 != -1325) {
          String discarded$2 = ((ika) this).a(-23);
          return "Award victory to team " + ((ika) this).field_b;
        } else {
          return "Award victory to team " + ((ika) this).field_b;
        }
    }

    public final void a(faa param0, boolean param1) {
        super.a(param0, param1);
        ((ika) this).field_b = param0.i(0, 32);
    }

    public final void a(tv param0, int param1) {
        ika var3 = null;
        int var4 = 0;
        super.a(param0, -93);
        var3 = (ika) (Object) param0;
        var4 = 0;
        if (param1 <= -19) {
          L0: {
            if (var3.field_b == var3.field_b) {
              break L0;
            } else {
              var4 = 1;
              System.out.println("int team has changed. before=" + var3.field_b + ", now=" + var3.field_b);
              break L0;
            }
          }
          if (var4 != 0) {
            System.out.println("This instance of MissionActionAwardVictory has changed");
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public final void b(faa param0, int param1) {
        Object var4 = null;
        if (param1 > -109) {
          var4 = null;
          ((ika) this).b((byte) -5, (tv) null);
          super.b(param0, -119);
          param0.a(-632, ((ika) this).field_b, 32);
          return;
        } else {
          super.b(param0, -119);
          param0.a(-632, ((ika) this).field_b, 32);
          return;
        }
    }

    final static dib a(int param0, ds param1) {
        if (param0 != 32) {
          ika.a(42, true);
          return new dib(param1.a(true), param1.a(true), param1.a(true), param1.a(true), param1.c((byte) -75), param1.c((byte) -94), param1.e((byte) -119));
        } else {
          return new dib(param1.a(true), param1.a(true), param1.a(true), param1.a(true), param1.c((byte) -75), param1.c((byte) -94), param1.e((byte) -119));
        }
    }

    final ucb a(pe param0, int param1) {
        if (param1 == 26964) {
            return null;
        }
        return null;
    }

    final int a(int param0, int param1) {
        if (param1 > -100) {
            ((ika) this).field_b = -95;
            return ((ika) this).field_b;
        }
        return ((ika) this).field_b;
    }

    final static void a(int param0, boolean param1) {
        apb.a((byte) 116);
        if (param0 != -356) {
            Object var3 = null;
            dib discarded$0 = ika.a(-32, (ds) null);
        }
    }

    public final void b(byte param0, tv param1) {
        ika var5 = (ika) (Object) param1;
        ika var6 = var5;
        super.b((byte) 80, param1);
        if (param0 <= 54) {
            return;
        }
        var6.field_b = var5.field_b;
    }

    public static void b(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != 1) {
            field_a = null;
        }
    }

    final void a(pe param0, boolean param1, int param2, int param3) {
        ((ika) this).field_b = param3;
        if (param1) {
            ika.a(30, true);
        }
    }

    public ika() {
    }

    ika(int param0) {
        ((ika) this).field_b = param0;
    }

    final void a(int param0, int[] param1, rsb param2) {
        qa.a(202, "wins_for_team_" + ((ika) this).field_b, param0);
        param2.field_e.b(false, ((ika) this).field_b);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[2];
        field_a = new int[1];
    }
}
