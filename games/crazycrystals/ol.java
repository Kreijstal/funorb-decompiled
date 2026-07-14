/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ol extends om {
    static String field_E;
    static Vector[] field_z;
    static int[] field_y;
    static int[] field_C;
    static int field_B;
    private wb field_A;
    static uf[] field_D;

    final void h(int param0) {
        int var4 = CrazyCrystals.field_B;
        tm var2 = new tm(((ol) this).field_A);
        if (param0 != 0) {
            boolean discarded$0 = ol.f((byte) 68);
        }
        ab var3 = (ab) (Object) var2.a((byte) 97);
        while (var3 != null) {
            if (var3.e((byte) 79)) {
                var3.a(false);
            }
            var3 = (ab) (Object) var2.b(-6);
        }
    }

    public ol() {
        super(0, 0, oj.field_y, pk.field_c, (wo) null, (bi) null);
        ((ol) this).field_A = new wb();
    }

    final void b(boolean param0) {
        int var4 = CrazyCrystals.field_B;
        tm var2 = new tm(((ol) this).field_A);
        if (param0) {
            ((ol) this).field_A = null;
        }
        ab var3 = (ab) (Object) var2.a((byte) 124);
        while (var3 != null) {
            if (var3.g((byte) 8)) {
                var3.a(false);
            }
            var3 = (ab) (Object) var2.b(-27);
        }
        ((ol) this).field_w = (qm) (Object) ((ol) this).j(0);
    }

    final qm d(byte param0) {
        tm var2 = null;
        ab var3 = null;
        int var4 = 0;
        var4 = CrazyCrystals.field_B;
        var2 = new tm(((ol) this).field_A);
        if (param0 >= 39) {
          var3 = (ab) (Object) var2.a((byte) 95);
          L0: while (true) {
            if (var3 != null) {
              if (var3.field_C) {
                return var3.b(false);
              } else {
                var3 = (ab) (Object) var2.b(122);
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    public static void i(int param0) {
        field_y = null;
        field_z = null;
        field_D = null;
        field_E = null;
        if (param0 != 0) {
            field_B = -66;
        }
        field_C = null;
    }

    final ab j(int param0) {
        tm var2 = null;
        ab var3 = null;
        int var4 = 0;
        L0: {
          var4 = CrazyCrystals.field_B;
          var2 = new tm(((ol) this).field_A);
          var3 = (ab) (Object) var2.a((byte) 39);
          if (param0 == 0) {
            break L0;
          } else {
            field_C = null;
            break L0;
          }
        }
        L1: while (true) {
          if (var3 != null) {
            if (!var3.field_C) {
              var3 = (ab) (Object) var2.b(104);
              continue L1;
            } else {
              return var3;
            }
          } else {
            return null;
          }
        }
    }

    final void g(byte param0) {
        int var4 = CrazyCrystals.field_B;
        if (param0 >= -13) {
            qm discarded$0 = ((ol) this).d((byte) -34);
        }
        tm var2 = new tm(((ol) this).field_A);
        ab var3 = (ab) (Object) var2.a((byte) 114);
        while (var3 != null) {
            var3.field_C = false;
            var3 = (ab) (Object) var2.b(-60);
        }
        ((ol) this).field_w = null;
    }

    final static boolean f(byte param0) {
        if (!(rk.field_b != -1)) {
            if (!(fq.a(1, (byte) -44))) {
                return false;
            }
            rk.field_b = kd.field_n.h(255);
            kd.field_n.field_f = 0;
        }
        if (param0 != 60) {
            field_C = null;
        }
        if (!(rk.field_b != -2)) {
            if (!fq.a(2, (byte) 58)) {
                return false;
            }
            rk.field_b = kd.field_n.c((byte) -7);
            kd.field_n.field_f = 0;
        }
        return fq.a(rk.field_b, (byte) -103);
    }

    final void b(int param0, qm param1) {
        if (!(param1 instanceof ab)) {
            throw new IllegalArgumentException();
        }
        ab var3 = (ab) (Object) param1;
        ((ol) this).field_A.a(82, (jb) (Object) var3);
        var3.field_C = true;
        boolean discarded$6 = var3.a(true, (qm) this);
        if (param0 != -3264) {
            boolean discarded$7 = ol.f((byte) -84);
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var7 = CrazyCrystals.field_B;
        if (null != ((ol) this).field_i) {
            ((ol) this).field_i.a(param0, false, param2, (qm) this, true);
        }
        if (param1 > -12) {
            field_D = null;
        }
        tm var5 = new tm(((ol) this).field_A);
        qm var6 = (qm) (Object) var5.d(107);
        while (var6 != null) {
            var6.a(((ol) this).field_j + param0, (byte) -74, param2 + ((ol) this).field_r, param3);
            var6 = (qm) (Object) var5.c(-50);
        }
    }

    final static wj a(int[] param0, int param1, wj param2) {
        wj var3 = new wj(0, 0, 0);
        var3.field_f = param2.field_f;
        var3.field_d = param2.field_d;
        var3.field_e = param2.field_e;
        var3.field_i = param0;
        var3.field_a = param2.field_a;
        var3.field_j = param2.field_j;
        var3.field_c = param2.field_c;
        var3.field_g = param2.field_g;
        int var4 = 101 % ((param1 - 67) / 51);
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "You can make him move using the arrow keys.";
        field_z = new Vector[5];
        field_C = new int[8192];
        field_y = new int[8192];
    }
}
