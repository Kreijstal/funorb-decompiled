/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg {
    int[] field_d;
    int field_i;
    static String field_c;
    static int[] field_e;
    static String field_b;
    int field_h;
    static String field_g;
    static int field_f;
    static int field_a;

    final static sa a(int param0, rc param1) {
        sa var2 = null;
        RuntimeException var2_ref = null;
        sa stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new sa(param1, param1);
          hj.field_b.a((byte) -107, var2);
          hj.field_f.b(param1);
          if (param0 != 1963987425) {
            field_c = (String) null;
          }
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("mg.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        tm dupTemp$2 = null;
        tm dupTemp$3 = null;
        tm var1 = null;
        int var2 = 0;
        tm var3 = null;
        tm var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        tm var1Lifetime1;
        var2 = MinerDisturbance.field_ab;
        try {
          if (param0 > -84) {
            field_f = 8;
          }
          while (true) {
            dupTemp$2 = (tm) (ok.field_b.e(63854));
            var3 = dupTemp$2;
            var1 = var3;
            if (null != dupTemp$2) {
              ke.field_X[var3.field_s] = false;
              continue;
            }
            break;
          }
          while (true) {
            dupTemp$3 = (tm) (ec.field_c.e(63854));
            var4 = dupTemp$3;
            var1Lifetime1 = var4;
            if (null == dupTemp$3) {
              return;
            }
            ke.field_X[var4.field_s] = false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1_ref), "mg.A(" + param0 + ')');
        }
    }

    mg(int param0, int param1, int param2) {
        this.field_h = param0;
        this.field_d = new int[param2 + 1];
        this.field_i = param1;
    }

    final int b(int param0) {
        int stackIn_6_0 = 0;
        if (param0 != -23719) {
          mg.a((byte) -12);
        }
        if (this.field_d != null &&
          this.field_d.length != 0) {
          stackIn_6_0 = this.field_d[this.field_d.length - 1];
        } else {
          stackIn_6_0 = 0;
        }
        return stackIn_6_0;
    }

    public static void a(int param0) {
        field_e = null;
        field_b = null;
        field_g = null;
        if (param0 < 48) {
          field_b = (String) null;
        }
        field_c = null;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4;
        var4 = MinerDisturbance.field_ab;
        if (this.field_d != null &&
          0 != this.field_d.length) {
          for (var3 = 1; var3 < this.field_d.length; var3++) {
            if ((this.field_d[var3] + this.field_d[-1 + var3] >> 1) > param0) {
              return var3 - 1;
            }
          }
          if (param1 == -24040) {
            return this.field_d.length - 1;
          }
          return -91;
        }
        return 0;
    }

    static {
        field_e = new int[1024];
        field_b = "Gas mask: Prevents gas causing asphyxiation.";
        field_g = "Click to continue";
        field_c = "Flaming Firework";
    }
}
