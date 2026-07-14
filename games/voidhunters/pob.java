/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pob extends rna implements ntb {
    static mma field_c;
    private int field_d;
    static int field_b;
    private int field_a;

    final static float a(byte param0, float param1) {
        int var2 = -128 % ((-87 - param0) / 36);
        return ((param1 * 6.0f - 15.0f) * param1 + 10.0f) * (param1 * param1 * param1);
    }

    public final void b(byte param0, tv param1) {
        pob var5 = null;
        pob var6 = null;
        var5 = (pob) (Object) param1;
        var6 = var5;
        super.b((byte) 70, param1);
        var6.field_d = var5.field_d;
        var6.field_a = var5.field_a;
        if (param0 <= 54) {
          ((pob) this).field_a = 2;
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int[] param1, rsb param2) {
        param2.field_e.b(2, ((pob) this).field_a, ((pob) this).field_d);
        if (param0 != 1) {
            ((pob) this).field_a = -49;
        }
    }

    final String a(int param0) {
        Object var3 = null;
        if (param0 != -1325) {
          var3 = null;
          ((pob) this).a((pe) null, true, -7, 72);
          return "Set custom variable " + ((pob) this).field_d + " to " + ((pob) this).field_a;
        } else {
          return "Set custom variable " + ((pob) this).field_d + " to " + ((pob) this).field_a;
        }
    }

    final int a(int param0, int param1) {
        if (param1 < -100) {
          if (0 == param0) {
            return ((pob) this).field_d;
          } else {
            return ((pob) this).field_a;
          }
        } else {
          field_c = null;
          if (0 == param0) {
            return ((pob) this).field_d;
          } else {
            return ((pob) this).field_a;
          }
        }
    }

    final ucb a(pe param0, int param1) {
        if (param1 == 26964) {
            return null;
        }
        return null;
    }

    final static int b(int param0) {
        int var1 = -61 / ((75 - param0) / 43);
        return iua.field_p;
    }

    public final void a(tv param0, int param1) {
        int var4 = 0;
        pob var5 = null;
        L0: {
          super.a(param0, -89);
          var5 = (pob) (Object) param0;
          var4 = 0;
          if (var5.field_d != var5.field_d) {
            var4 = 1;
            System.out.println("int index has changed. before=" + var5.field_d + ", now=" + var5.field_d);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (var5.field_a != var5.field_a) {
            var4 = 1;
            System.out.println("int value has changed. before=" + var5.field_a + ", now=" + var5.field_a);
            break L1;
          } else {
            break L1;
          }
        }
        if (param1 > -19) {
          L2: {
            field_c = null;
            if (var4 != 0) {
              System.out.println("This instance of MissionActionSetCustomVariable has changed");
              break L2;
            } else {
              break L2;
            }
          }
          return;
        } else {
          L3: {
            if (var4 != 0) {
              System.out.println("This instance of MissionActionSetCustomVariable has changed");
              break L3;
            } else {
              break L3;
            }
          }
          return;
        }
    }

    final void a(pe param0, boolean param1, int param2, int param3) {
        if (!param1) {
          if (-1 == param2) {
            ((pob) this).field_d = param3;
            if (-1 <= ((pob) this).field_d) {
              return;
            } else {
              ((pob) this).field_d = 0;
              return;
            }
          } else {
            ((pob) this).field_a = param3;
            return;
          }
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 <= 22) {
            pob.a((byte) 65);
        }
    }

    public final void a(faa param0, boolean param1) {
        super.a(param0, param1);
        ((pob) this).field_d = param0.i(0, 32);
        ((pob) this).field_a = param0.i(0, 32);
    }

    public final void b(faa param0, int param1) {
        super.b(param0, -127);
        param0.a(-632, ((pob) this).field_d, 32);
        if (param1 > -109) {
          ((pob) this).field_a = 41;
          param0.a(-632, ((pob) this).field_a, 32);
          return;
        } else {
          param0.a(-632, ((pob) this).field_a, 32);
          return;
        }
    }

    public final boolean a(byte param0, tv param1) {
        int var3 = 0;
        pob var4 = null;
        var3 = 127 % ((param0 - 22) / 59);
        var4 = (pob) (Object) param1;
        if (!super.a((byte) 93, param1)) {
          if (var4.field_d == var4.field_d) {
            if (var4.field_a != var4.field_a) {
              return true;
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    pob() {
    }

    pob(int param0, int param1) {
        ((pob) this).field_d = param0;
        ((pob) this).field_a = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new mma();
    }
}
