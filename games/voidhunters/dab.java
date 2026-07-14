/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dab extends wm implements ntb {
    private int field_d;
    static dja field_c;
    static boolean field_e;

    public static void b(byte param0) {
        if (param0 != -44) {
            return;
        }
        field_c = null;
    }

    final ucb[] a(pe param0, int param1) {
        if (param1 == -20605) {
            return null;
        }
        return null;
    }

    public final void b(byte param0, tv param1) {
        dab var5 = null;
        dab var6 = null;
        super.b((byte) 83, param1);
        var5 = (dab) (Object) param1;
        var6 = var5;
        var6.field_d = var5.field_d;
        if (param0 <= 54) {
          String discarded$2 = ((dab) this).a(90);
          return;
        } else {
          return;
        }
    }

    final int a(byte param0, int param1) {
        if (param0 >= -102) {
            ((dab) this).field_d = -122;
            return ((dab) this).field_d;
        }
        return ((dab) this).field_d;
    }

    public final void b(faa param0, int param1) {
        Object var4 = null;
        super.b(param0, -119);
        if (param1 > -109) {
          var4 = null;
          ((dab) this).b((byte) -36, (tv) null);
          param0.a(-632, ((dab) this).field_d, 32);
          return;
        } else {
          param0.a(-632, ((dab) this).field_d, 32);
          return;
        }
    }

    public final void a(tv param0, int param1) {
        Object var3 = null;
        dab var3_ref = null;
        int var4 = 0;
        var3 = null;
        if (param1 > -19) {
          L0: {
            field_c = null;
            var3_ref = (dab) (Object) param0;
            super.a(param0, -44);
            var4 = 0;
            if (var3_ref.field_d != var3_ref.field_d) {
              System.out.println("int tick has changed. before=" + var3_ref.field_d + ", now=" + var3_ref.field_d);
              var4 = 1;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (var4 != 0) {
              System.out.println("This instance of MissionConditionAtTick has changed");
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          L2: {
            var3_ref = (dab) (Object) param0;
            super.a(param0, -44);
            var4 = 0;
            if (var3_ref.field_d != var3_ref.field_d) {
              System.out.println("int tick has changed. before=" + var3_ref.field_d + ", now=" + var3_ref.field_d);
              var4 = 1;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (var4 != 0) {
              System.out.println("This instance of MissionConditionAtTick has changed");
              break L3;
            } else {
              break L3;
            }
          }
          return;
        }
    }

    final String a(int param0) {
        if (param0 != -1) {
          field_c = null;
          return "Is at tick " + ((dab) this).field_d;
        } else {
          return "Is at tick " + ((dab) this).field_d;
        }
    }

    final boolean a(int param0, lbb param1, pe param2) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 0) {
          L0: {
            field_e = false;
            if (param1.f((byte) -101) != ((dab) this).field_d) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (param1.f((byte) -101) != ((dab) this).field_d) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static byte[] a(int param0, tv param1) {
        faa var2 = null;
        byte[] var3 = null;
        if (param0 != -30234) {
          field_e = false;
          var2 = new faa(1000);
          var2.q(-83);
          param1.b(var2, param0 + 30119);
          var2.r(param0 ^ -2514);
          var3 = new byte[var2.field_e];
          cua.a(var2.field_h, 0, var3, 0, var2.field_e);
          return var3;
        } else {
          var2 = new faa(1000);
          var2.q(-83);
          param1.b(var2, param0 + 30119);
          var2.r(param0 ^ -2514);
          var3 = new byte[var2.field_e];
          cua.a(var2.field_h, 0, var3, 0, var2.field_e);
          return var3;
        }
    }

    final void a(pe param0, int param1, int param2, int param3) {
        if (param1 != -2) {
            return;
        }
        ((dab) this).field_d = param3;
    }

    public final void a(faa param0, boolean param1) {
        super.a(param0, param1);
        ((dab) this).field_d = param0.i(0, 32);
    }

    dab() {
    }

    dab(int param0) {
        ((dab) this).field_d = param0;
    }

    public final boolean a(byte param0, tv param1) {
        dab var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackOut_1_0 = 0;
        var4 = -39 % ((22 - param0) / 59);
        var3 = (dab) (Object) param1;
        if (!super.a((byte) -70, param1)) {
          if (var3.field_d != var3.field_d) {
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = (dja) (Object) new lhb();
    }
}
