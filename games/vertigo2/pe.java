/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe extends li {
    static boolean field_r;
    int field_x;
    int field_n;
    int field_G;
    int field_C;
    int field_H;
    int field_y;
    int field_F;
    static String field_t;
    al field_K;
    static String field_u;
    gl field_p;
    int field_q;
    int field_A;
    int field_o;
    int field_s;
    int field_B;
    static String field_L;
    ae field_z;
    int field_I;
    ra field_J;
    int field_E;
    int field_w;
    int field_D;
    int field_v;

    final static wp a(String param0, boolean param1) {
        int var3 = 0;
        int var2_int = 0;
        int var4 = 0;
        int var5 = 0;
        ud var6 = null;
        wp stackIn_3_0 = null;
        wp stackIn_6_0 = null;
        wp stackIn_18_0 = null;
        wp stackIn_21_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_3_0 = ab.field_a;
            return stackIn_3_0;
          }
          if (var2_int > 63) {
            stackIn_6_0 = cg.field_a;
            return stackIn_6_0;
          }
          if (!param1) {
            var6 = (ud) null;
            pe.a((ud) null, 53);
          }
          for (var3 = 0; var3 < var2_int; var3++) {
            var4 = param0.charAt(var3);
            if (var4 == 45) {
              if (var3 == 0 ||
                -1 + var2_int == var3) {
                stackIn_18_0 = bp.field_A;
                return stackIn_18_0;
              }
            } else {
              if (ke.field_d.indexOf(var4) == -1) {
                stackIn_21_0 = bp.field_A;
                return stackIn_21_0;
              }
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("pe.E(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0) {
        this.field_p = null;
        this.field_z = null;
        this.field_J = null;
        if (param0 > -93) {
          this.field_q = -49;
        }
        this.field_K = null;
    }

    final static void a(ud param0, int param1) {
        param0.field_z = new int[]{-1};
        if (param1 <= 82) {
          return;
        }
        try {
          param0.field_u = new char[]{(char)63};
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "pe.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(boolean param0) {
        field_u = null;
        if (!param0) {
          return;
        }
        field_L = null;
        field_t = null;
    }

    final static boolean a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        boolean stackIn_8_0 = false;
        if (param4 <= 10) {
          field_t = (String) null;
        }
        stackIn_8_0 = (param3 >= param5) && (param3 < param6 + param5) && (param2 >= param1) && (param2 < param0 + param1);
        return stackIn_8_0;
    }

    pe() {
    }

    static {
        field_t = "red died";
        field_L = "You won! <br><%0>% of the level was <%1>";
        field_u = "Status";
        field_r = true;
    }
}
