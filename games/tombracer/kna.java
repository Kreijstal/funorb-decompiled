/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kna extends csa {
    private fsa field_A;
    static String field_E;
    static String field_C;
    static String field_B;
    static String field_D;

    public static void y(int param0) {
        field_D = null;
        field_E = null;
        field_C = null;
        field_B = null;
        if (param0 != 0) {
          kna.y(74);
        }
    }

    kna(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    lj u(int param0) {
        if (param0 >= -60) {
          this.z(-82);
          return (lj) ((Object) this.field_A);
        }
        return (lj) ((Object) this.field_A);
    }

    final void a(boolean param0, boolean param1, la param2, int param3, int param4, int param5, fsa param6) {
        int var9 = 0;
        csa stackIn_14_0;
        boolean stackIn_14_1;
        boolean stackIn_14_2;
        la stackIn_14_3;
        int stackIn_14_4;
        int stackIn_14_5;
        mka stackIn_14_6;
        boolean stackIn_15_7;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        mka var10 = null;
        csa var11 = null;
        int var12 = 0;
        fsa var13 = null;
        var12 = TombRacer.field_G ? 1 : 0;
        try {
          if (!this.field_z.a(param5, 14530)) {
            return;
          }
          var13 = this.a(param0, 3, param2);
          if (param6 != null) {
            var13.b(true, 11468);
          }
          var13.a(this.field_z, (byte) 121);
          var13.m(1, this.field_j);
          if (!param1) {
            this.field_A = (fsa) null;
          }
          var13.c(this.field_p, -19879);
          var13.a(this.field_r + param4, (byte) 110);
          var13.f(10, param3);
          var13.z(1);
          for (var9 = 0; this.field_t.length > var9; var9++) {
            var10 = this.field_t[var9];
            var11 = var10.a(-89);
            if (var11 != null) {
              stackIn_14_0 = var11;
              stackIn_14_1 = param0;
              stackIn_14_2 = true;
              stackIn_14_3 = (la) (param2);
              stackIn_14_4 = param3 + var10.b((byte) -125);
              stackIn_14_5 = param4;
              stackIn_14_6 = var10;
              stackIn_15_7 = !(param1);
              ((csa) (Object) stackIn_14_0).a(stackIn_14_1, stackIn_14_2, stackIn_14_3, stackIn_14_4, stackIn_14_5 + ((mka) (Object) stackIn_14_6).a(stackIn_15_7), param5, var13);
            }
          }
          if (param6 == null) {
            if (this.z(0)) {
              var13.c(437453352, true);
            }
            param2.a(var13, (byte) 32);
          } else {
            param6.a(-39, var13);
          }
          if (this.a(6) &&
            !this.field_x) {
            var13.m(-82);
          }
          this.field_A = var13;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_30_0 = var8;
          stackIn_30_1 = new StringBuilder().append("kna.FB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    kna(la param0, int param1) {
        super(param0, param1);
    }

    boolean z(int param0) {
        if (param0 != 0) {
          field_C = (String) null;
          return true;
        }
        return true;
    }

    abstract fsa a(boolean param0, int param1, la param2);

    static {
        field_C = "<%0> cannot join; the game is full.";
        field_E = "Offer rematch";
        field_B = "Withdraw request to join <%0>'s game";
        field_D = "A fascinating scientific anomaly, these discs are kept in motion by a peculiar interaction of the temple's magnetic forces.";
    }
}
