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
        ab var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 instanceof ab) {
              L1: {
                var3 = (ab) (Object) param1;
                ((ol) this).field_A.a(82, (jb) (Object) var3);
                var3.field_C = true;
                boolean discarded$10 = var3.a(true, (qm) this);
                if (param0 == -3264) {
                  break L1;
                } else {
                  boolean discarded$11 = ol.f((byte) -84);
                  break L1;
                }
              }
              break L0;
            } else {
              throw new IllegalArgumentException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3_ref;
            stackOut_5_1 = new StringBuilder().append("ol.I(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
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
        wj var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        wj stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        wj stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var3 = new wj(0, 0, 0);
            var3.field_f = param2.field_f;
            var3.field_d = param2.field_d;
            var3.field_e = param2.field_e;
            var3.field_i = param0;
            var3.field_a = param2.field_a;
            var3.field_j = param2.field_j;
            var3.field_c = param2.field_c;
            var3.field_g = param2.field_g;
            var4 = 0;
            stackOut_0_0 = (wj) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("ol.G(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44).append(120).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_1_0;
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
