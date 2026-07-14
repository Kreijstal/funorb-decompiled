/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tr implements ntb {
    static String field_b;
    int[] field_a;

    public final void a(tv param0, int param1) {
        tr var3 = null;
        int var4 = 0;
        L0: {
          var3 = (tr) (Object) param0;
          var4 = 0;
          if (ikb.a(var3.field_a, var3.field_a, false)) {
            var4 = 1;
            System.out.println("int[] values has changed. ");
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (var4 != 0) {
            System.out.println("This instance of SettingsInstance has changed");
            break L1;
          } else {
            break L1;
          }
        }
        if (param1 >= -19) {
          field_b = null;
          return;
        } else {
          return;
        }
    }

    public final void b(byte param0, tv param1) {
        if (param0 < 54) {
            return;
        }
        tr var3 = (tr) (Object) param1;
        var3.field_a = dob.a(var3.field_a, (byte) -50, var3.field_a);
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4) {
        gwa.a(param4, -1, (double)param0, param2, (double)param3);
        if (param1) {
            field_b = null;
        }
    }

    public final void b(faa param0, int param1) {
        int stackIn_1_0 = 0;
        int stackIn_2_0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackOut_0_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = 8;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (((tr) this).field_a == null) {
            stackOut_2_0 = stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = stackIn_1_0;
            stackOut_1_1 = ((tr) this).field_a.length;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        pgb.a(stackIn_3_0, stackIn_3_1, -118, param0, ((tr) this).field_a);
        if (param1 > -109) {
          tr.c(99);
          return;
        } else {
          return;
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = VoidHunters.field_G;
        if (param0 != -15400) {
          return;
        } else {
          var1 = 0;
          L0: while (true) {
            if (ou.field_q <= var1) {
              ou.field_q = 0;
              return;
            } else {
              nrb.field_b[var1] = null;
              var1++;
              continue L0;
            }
          }
        }
    }

    public final void a(faa param0, boolean param1) {
        ((tr) this).field_a = wkb.a((byte) 37, ((tr) this).field_a, param0, 8);
        if (param1) {
            ((tr) this).field_a = null;
        }
    }

    final void a(byte param0) {
        Object var3 = null;
        if (param0 < 112) {
          var3 = null;
          ((tr) this).a((tv) null, 78);
          kga.a(107, ((tr) this).field_a);
          return;
        } else {
          kga.a(107, ((tr) this).field_a);
          return;
        }
    }

    final static boolean a(int param0, int param1) {
        int var2 = 100 / ((-57 - param0) / 61);
        return hab.field_g[param1].field_r;
    }

    public static void b(int param0) {
        if (param0 != 17674) {
            return;
        }
        field_b = null;
    }

    final static void c(int param0) {
        String var1 = null;
        String var2 = null;
        L0: {
          if (dsa.field_p == null) {
            break L0;
          } else {
            var2 = dsa.field_p;
            var1 = var2;
            kqb.a(isa.a(sja.field_d, new String[1], 125), param0 ^ 6923);
            dsa.field_p = null;
            break L0;
          }
        }
        if (param0 != 6939) {
          field_b = null;
          return;
        } else {
          return;
        }
    }

    final void a(int param0, so param1) {
        ((tr) this).field_a[param1.field_a] = param1.field_c;
        int var3 = 127 / ((-39 - param0) / 54);
    }

    tr() {
        kga.a(107, sp.field_p);
        ((tr) this).field_a = ik.a(-21049);
    }

    public final boolean a(byte param0, tv param1) {
        tr var3 = (tr) (Object) param1;
        int var4 = -34 % ((22 - param0) / 59);
        return wpb.a(var3.field_a, var3.field_a, (byte) 28);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Disruptive behaviour";
    }
}
