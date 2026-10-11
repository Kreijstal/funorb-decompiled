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
        tm var2 = new tm(this.field_A);
        if (param0 != 0) {
          ol.f((byte) 68);
        }
        ab var3 = (ab) (var2.a((byte) 97));
        while (var3 != null) {
          if (var3.e((byte) 79)) {
            var3.a(false);
          }
          var3 = (ab) (var2.b(-6));
        }
    }

    public ol() {
        super(0, 0, oj.field_y, pk.field_c, (wo) null, (bi) null);
        this.field_A = new wb();
    }

    final void b(boolean param0) {
        int var4 = CrazyCrystals.field_B;
        tm var2 = new tm(this.field_A);
        if (param0) {
          this.field_A = (wb) null;
        }
        ab var3 = (ab) (var2.a((byte) 124));
        while (var3 != null) {
          if (var3.g((byte) 8)) {
            var3.a(false);
          }
          var3 = (ab) (var2.b(-27));
        }
        this.field_w = (qm) ((Object) this.j(0));
    }

    final qm d(byte param0) {
        tm var2;
        ab var3;
        int var4;
        var4 = CrazyCrystals.field_B;
        var2 = new tm(this.field_A);
        if (param0 < 39) {
          return (qm) null;
        }
        var3 = (ab) (var2.a((byte) 95));
        while (var3 != null) {
          if (var3.field_C) {
            return var3.b(false);
          }
          var3 = (ab) (var2.b(122));
        }
        return null;
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
        tm var2;
        ab var3;
        int var4;
        var4 = CrazyCrystals.field_B;
        var2 = new tm(this.field_A);
        var3 = (ab) (var2.a((byte) 39));
        if (param0 != 0) {
          field_C = (int[]) null;
        }
        while (var3 != null) {
          if (var3.field_C) {
            return var3;
          }
          var3 = (ab) (var2.b(104));
        }
        return null;
    }

    final void g(byte param0) {
        int var4 = CrazyCrystals.field_B;
        if (param0 >= -13) {
          this.d((byte) -34);
        }
        tm var2 = new tm(this.field_A);
        ab var3 = (ab) (var2.a((byte) 114));
        while (var3 != null) {
          var3.field_C = false;
          var3 = (ab) (var2.b(-60));
        }
        this.field_w = null;
    }

    final static boolean f(byte param0) {
        if (rk.field_b == -1) {
          if (!fq.a(1, (byte) -44)) {
            return false;
          }
          rk.field_b = kd.field_n.h(255);
          kd.field_n.field_f = 0;
        }
        if (param0 != 60) {
          field_C = (int[]) null;
        }
        if (rk.field_b == -2) {
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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (!(param1 instanceof ab)) {
            throw new IllegalArgumentException();
          }
          var3 = (ab) (param1);
          this.field_A.a(82, var3);
          var3.field_C = true;
          var3.a(true, (qm) (this));
          if (param0 != -3264) {
            ol.f((byte) -84);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("ol.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var7 = CrazyCrystals.field_B;
        if (null != this.field_i) {
          this.field_i.a(param0, false, param2, (qm) (this), true);
        }
        if (param1 > -12) {
          field_D = (uf[]) null;
        }
        tm var5 = new tm(this.field_A);
        qm var6 = (qm) (var5.d(107));
        while (var6 != null) {
          var6.a(this.field_j + param0, (byte) -74, param2 + this.field_r, param3);
          var6 = (qm) (var5.c(-50));
        }
    }

    final static wj a(int[] param0, int param1, wj param2) {
        wj var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        wj stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new wj(0, 0, 0);
          var3.field_f = param2.field_f;
          var3.field_d = param2.field_d;
          var3.field_e = param2.field_e;
          var3.field_i = param0;
          var3.field_a = param2.field_a;
          var3.field_j = param2.field_j;
          var3.field_c = param2.field_c;
          var3.field_g = param2.field_g;
          var4 = 101 % ((param1 - 67) / 51);
          stackIn_1_0 = var3;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_4_0 = var3_ref;
          stackIn_4_1 = new StringBuilder().append("ol.G(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        field_E = "You can make him move using the arrow keys.";
        field_z = new Vector[5];
        field_C = new int[8192];
        field_y = new int[8192];
    }
}
