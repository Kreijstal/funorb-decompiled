/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class via extends rna implements ntb {
    static phb[] field_a;
    static int field_b;

    public final void a(faa param0, boolean param1) {
        if (param1) {
            field_b = 74;
        }
        super.a(param0, param1);
    }

    public static void b(int param0) {
        field_a = null;
        if (param0 != 0) {
            field_a = null;
        }
    }

    via() {
    }

    final ucb a(pe param0, int param1) {
        if (param1 == 26964) {
            return null;
        }
        return null;
    }

    final String a(int param0) {
        if (param0 != -1325) {
            Object var3 = null;
            ((via) this).a((tv) null, -23);
        }
        return "Award victory to the winning player";
    }

    final void a(int param0, int[] param1, rsb param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        tfa var7 = null;
        int var8 = 0;
        L0: {
          var8 = VoidHunters.field_G;
          if (param0 == 1) {
            break L0;
          } else {
            String discarded$2 = ((via) this).a(31);
            break L0;
          }
        }
        var4 = 0;
        var5 = -1;
        var6 = 0;
        L1: while (true) {
          if (var6 >= param2.field_c.length) {
            L2: {
              if (0 > var5) {
                break L2;
              } else {
                param2.field_e.b(false, var5);
                break L2;
              }
            }
            return;
          } else {
            L3: {
              var7 = param2.a(var6, (byte) 59);
              if (var7.field_a) {
                break L3;
              } else {
                if (foa.field_p != 0) {
                  break L3;
                } else {
                  var6++;
                  continue L1;
                }
              }
            }
            if (var4 < var7.field_c) {
              var4 = var7.field_c;
              var5 = var6;
              var6++;
              continue L1;
            } else {
              if (var4 == var7.field_c) {
                var5 = -1;
                var6++;
                continue L1;
              } else {
                var6++;
                continue L1;
              }
            }
          }
        }
    }

    public final void b(faa param0, int param1) {
        super.b(param0, -127);
        if (param1 > -109) {
            Object var4 = null;
            ((via) this).a(62, (int[]) null, (rsb) null);
        }
    }

    public final void a(tv param0, int param1) {
        super.a(param0, -70);
        if (param1 >= -19) {
            field_b = 108;
        }
    }

    public final boolean a(byte param0, tv param1) {
        int var3 = -17 / ((22 - param0) / 59);
        return super.a((byte) 91, param1);
    }

    public final void b(byte param0, tv param1) {
        super.b((byte) 86, param1);
        if (param0 <= 54) {
            String discarded$0 = ((via) this).a(67);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 1;
    }
}
