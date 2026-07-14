/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qdb implements ntb {
    int field_b;
    int field_d;
    int field_f;
    static dja field_a;
    int[] field_c;
    static String field_e;

    public final void a(faa param0, boolean param1) {
        if (param1) {
            return;
        }
        ((qdb) this).field_b = param0.i(0, 8);
        ((qdb) this).field_d = param0.i(0, 32);
        ((qdb) this).field_c = wkb.a((byte) 37, ((qdb) this).field_c, param0, 8);
        ((qdb) this).field_f = param0.i(0, 32);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var16 = 0;
        int[] var22 = null;
        int var18 = VoidHunters.field_G;
        int var12 = ksa.a(31123, lua.field_c, hab.field_i, param5);
        int var13 = ksa.a(31123, lua.field_c, hab.field_i, param7);
        int var14 = ksa.a(param2 ^ 31123, ob.field_j, mt.field_o, param4);
        int var15 = ksa.a(31123, ob.field_j, mt.field_o, param0);
        int var8 = ksa.a(31123, lua.field_c, hab.field_i, param5 + param1);
        int var9 = ksa.a(31123, lua.field_c, hab.field_i, param7 - param1);
        for (var16 = var12; var16 < var8; var16++) {
            ww.a(param6, var15, rba.field_b[var16], (byte) 75, var14);
        }
        if (param2 != 0) {
            field_a = null;
        }
        for (var16 = var13; var16 > var9; var16--) {
            ww.a(param6, var15, rba.field_b[var16], (byte) 75, var14);
        }
        int var10 = ksa.a(31123, ob.field_j, mt.field_o, param1 + param4);
        int var11 = ksa.a(31123, ob.field_j, mt.field_o, -param1 + param0);
        for (var16 = var8; var16 <= var9; var16++) {
            var22 = rba.field_b[var16];
            ww.a(param6, var10, var22, (byte) 75, var14);
            ww.a(param3, var11, var22, (byte) 75, var10);
            ww.a(param6, var15, var22, (byte) 75, var11);
        }
    }

    public final void b(byte param0, tv param1) {
        qdb var3 = (qdb) (Object) param1;
        var3.field_b = var3.field_b;
        var3.field_d = var3.field_d;
        var3.field_c = dob.a(var3.field_c, (byte) -38, var3.field_c);
        if (param0 < 54) {
            return;
        }
        var3.field_f = var3.field_f;
    }

    public static void a(byte param0) {
        field_e = null;
        field_a = null;
        if (param0 >= -116) {
            qdb.a(-38, -12, 117, 53, true, 38, true, false, -13, true, 95, 127, 29, true);
        }
    }

    public final boolean a(byte param0, tv param1) {
        qdb var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            var4 = -60 % ((param0 - 22) / 59);
            var3 = (qdb) (Object) param1;
            if (var3.field_b != var3.field_b) {
              break L1;
            } else {
              if (var3.field_d != var3.field_d) {
                break L1;
              } else {
                if (wpb.a(var3.field_c, var3.field_c, (byte) 28)) {
                  break L1;
                } else {
                  if (var3.field_f == var3.field_f) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_7_0 != 0;
    }

    public final void b(faa param0, int param1) {
        if (param1 >= -109) {
            return;
        }
        param0.a(-632, ((qdb) this).field_b, 8);
        param0.a(-632, ((qdb) this).field_d, 32);
        pgb.a(8, ((qdb) this).field_c != null ? ((qdb) this).field_c.length : 0, 49, param0, ((qdb) this).field_c);
        param0.a(-632, ((qdb) this).field_f, 32);
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, boolean param6, boolean param7, int param8, boolean param9, int param10, int param11, int param12, boolean param13) {
        lob.field_a = null;
        tr.c(6939);
        if (param8 >= -118) {
            return;
        }
        param4 = oga.a(33, param11, param1, param12, param3, param0, param4);
        rl.a(param4, -1, param2, param10, param7, param11, param5, param6, param13, param9);
        chb.a(0, param5, param7);
        mn.a(param4, param5, param12, 97);
    }

    public final void a(tv param0, int param1) {
        qdb var6 = (qdb) (Object) param0;
        int var4 = 0;
        if (!(var6.field_b == var6.field_b)) {
            var4 = 1;
            System.out.println("int voted_objective has changed. before=" + var6.field_b + ", now=" + var6.field_b);
        }
        if (var6.field_d != var6.field_d) {
            System.out.println("int mission_generation_seed has changed. before=" + var6.field_d + ", now=" + var6.field_d);
            var4 = 1;
        }
        if (ikb.a(var6.field_c, var6.field_c, false)) {
            var4 = 1;
            System.out.println("int[] option_totals has changed. ");
        }
        if (var6.field_f != var6.field_f) {
            var4 = 1;
            System.out.println("int rounds_left has changed. before=" + var6.field_f + ", now=" + var6.field_f);
        }
        if (var4 != 0) {
            System.out.println("This instance of MissionGenerationData has changed");
        }
        if (param1 > -19) {
            Object var5 = null;
            ((qdb) this).b((faa) null, -26);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Average rating";
        field_a = (dja) (Object) new ccb();
    }
}
