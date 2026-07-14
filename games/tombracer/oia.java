/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oia implements gs {
    kva field_c;
    int field_a;
    static String field_e;
    private static String[] field_d;
    int field_b;

    public final boolean d(byte param0) {
        if (param0 != 48) {
            oia.b(true);
            return ((oia) this).field_c.d((byte) 48);
        }
        return ((oia) this).field_c.d((byte) 48);
    }

    public final boolean a(boolean param0, uh param1) {
        if (param0) {
            return true;
        }
        return true;
    }

    public final int c(byte param0) {
        if (param0 <= 91) {
          ((oia) this).field_a = -18;
          return ((oia) this).field_c.c((byte) 103) - -((oia) this).field_b;
        } else {
          return ((oia) this).field_c.c((byte) 103) - -((oia) this).field_b;
        }
    }

    public final void a(int param0, iq param1) {
        gr var3 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        ka var9 = null;
        ka var10 = null;
        ka var11 = null;
        ka var12 = null;
        var3 = ((oia) this).field_c.c(-100);
        if (var3 == null) {
          if (param0 >= 103) {
            var12 = ((oia) this).field_c.a((byte) 9, (oia) this);
            if (var12 == null) {
              return;
            } else {
              var5 = ((oia) this).b((byte) 69);
              var6 = ((oia) this).c((byte) 102);
              var7 = ((oia) this).e((byte) -114);
              gqa.a(0, -83584144, var6, var5, var12, var7);
              return;
            }
          } else {
            var8 = null;
            oia.a(9, (sda) null, 48);
            var11 = ((oia) this).field_c.a((byte) 9, (oia) this);
            if (var11 == null) {
              return;
            } else {
              var5 = ((oia) this).b((byte) 69);
              var6 = ((oia) this).c((byte) 102);
              var7 = ((oia) this).e((byte) -114);
              gqa.a(0, -83584144, var6, var5, var11, var7);
              return;
            }
          }
        } else {
          if (var3.a(-101)) {
            if (param0 < 103) {
              var8 = null;
              oia.a(9, (sda) null, 48);
              var10 = ((oia) this).field_c.a((byte) 9, (oia) this);
              if (var10 == null) {
                return;
              } else {
                var5 = ((oia) this).b((byte) 69);
                var6 = ((oia) this).c((byte) 102);
                var7 = ((oia) this).e((byte) -114);
                gqa.a(0, -83584144, var6, var5, var10, var7);
                return;
              }
            } else {
              var9 = ((oia) this).field_c.a((byte) 9, (oia) this);
              if (var9 == null) {
                return;
              } else {
                var5 = ((oia) this).b((byte) 69);
                var6 = ((oia) this).c((byte) 102);
                var7 = ((oia) this).e((byte) -114);
                gqa.a(0, -83584144, var6, var5, var9, var7);
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    public static void b(boolean param0) {
        field_e = null;
        field_d = null;
        if (param0) {
            field_d = null;
        }
    }

    public final boolean a(boolean param0) {
        if (!param0) {
            return true;
        }
        return true;
    }

    final static void a(int param0, sda param1, int param2) {
        kh var3 = null;
        int var4 = 0;
        int var5 = 0;
        kh var6 = null;
        var6 = ql.field_k;
        var3 = var6;
        var6.k(param0, -2988);
        var6.field_h = var6.field_h + 1;
        var4 = var6.field_h;
        var6.i(1, 0);
        if (null != param1.field_j) {
          var6.i(param1.field_j.length, 0);
          var6.a(0, param1.field_j, param1.field_j.length, 105);
          var5 = 72 / ((30 - param2) / 34);
          int discarded$4 = var6.g(var4, 64);
          var6.field_h = var6.field_h - 4;
          param1.field_l = var6.e(115);
          var6.d(-var4 + var6.field_h, (byte) -110);
          return;
        } else {
          var6.i(0, 0);
          var5 = 72 / ((30 - param2) / 34);
          int discarded$5 = var6.g(var4, 64);
          var6.field_h = var6.field_h - 4;
          param1.field_l = var6.e(115);
          var6.d(-var4 + var6.field_h, (byte) -110);
          return;
        }
    }

    public final void f(int param0) {
        if (param0 != -4366) {
            int discarded$0 = ((oia) this).b((byte) -5);
        }
    }

    public final int e(byte param0) {
        if (param0 >= -86) {
          ((oia) this).field_a = 113;
          return ((oia) this).field_c.e((byte) -119) - 17825792;
        } else {
          return ((oia) this).field_c.e((byte) -119) - 17825792;
        }
    }

    public final int b(byte param0) {
        int var2 = 35 / ((param0 - -23) / 53);
        return ((oia) this).field_c.b((byte) 103) + ((oia) this).field_a;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[2];
        field_d[0] = "Default";
        field_d[1] = "Other";
        field_e = "Next";
    }
}
