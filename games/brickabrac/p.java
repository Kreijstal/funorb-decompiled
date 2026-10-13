/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p extends IntrusiveNode {
    private int field_o;
    static String field_p;
    boolean field_l;
    static String field_j;
    int[] field_n;
    int field_k;
    static jp field_i;
    int field_m;

    final boolean c(int param0) {
        if (param0 != 1) {
          return true;
        }
        return this.field_n.length == this.field_o ? true : false;
    }

    final int a(byte param0) {
        int fieldTemp$0 = 0;
        if (param0 == -104) {
          fieldTemp$0 = this.field_o;
          this.field_o = this.field_o + 1;
          return this.field_n[fieldTemp$0];
        }
        p.b(true);
        int fieldTemp$1 = this.field_o;
        this.field_o = this.field_o + 1;
        return this.field_n[fieldTemp$1];
    }

    final static boolean a(byte param0, int param1, int param2, int param3) {
        if (param3 < 0) {
          return false;
        }
        if (param3 > 11) {
          return false;
        }
        if (param1 < 1) {
          return false;
        }
        if (bg.a(param2, 29, param3) < param1) {
          return false;
        }
        if (param0 == -49) {
          return true;
        }
        field_j = (String) null;
        return true;
    }

    final static String a(int param0) {
        String var1 = "";
        if (null != eo.field_k) {
          var1 = eo.field_k.j((byte) -76);
        }
        if (param0 < -98) {
          if (0 == var1.length()) {
            var1 = dg.b(100);
          }
          if (var1.length() == 0) {
            var1 = ud.field_t;
          }
          return var1;
        }
        field_i = (jp) null;
        if (0 == var1.length()) {
          var1 = dg.b(100);
        }
        if (var1.length() == 0) {
          var1 = ud.field_t;
        }
        return var1;
    }

    public static void b(boolean param0) {
        field_j = null;
        field_i = null;
        field_p = null;
        if (param0) {
          p.b(true);
        }
    }

    final static jp a(int param0, jp param1, int param2, int param3) {
        int var5 = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        jp var7 = null;
        jp stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          var7 = new jp(param1.field_D + param2 * 2, param1.field_C + param2 * 2);
          var7.g();
          for (var5 = 0; param2 > var5; var5++) {
            param1.d(param2 - param1.field_E, -param1.field_F + param2, param3);
            lb.e(1, 1, 0, 0, var7.field_D, var7.field_C);
          }
          kc.field_q.a((byte) 104);
          var7.field_F = -param2 + param1.field_F;
          if (param0 != -12) {
            field_j = (String) null;
          }
          var7.field_E = param1.field_E - param2;
          stackIn_7_0 = var7;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("p.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public p() {
        this.field_n = new int[5];
        this.field_o = 0;
    }

    static {
        field_p = "Login: ";
        field_j = "Allow spectators?";
    }
}
