/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac extends nk {
    byte field_y;
    int field_x;
    fj field_z;
    static String field_A;

    public static void c(int param0) {
        field_A = null;
        if (param0 != 0) {
          field_A = (String) null;
        }
    }

    final static String a(int param0, CharSequence[] param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -103) {
            field_A = (String) null;
          }
          stackIn_3_0 = wi.a(0, 0, param1.length, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ac.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static int d(byte param0) {
        if (param0 != -97) {
          String var2 = (String) null;
          ac.a((String) null, -50);
          return jl.field_S;
        }
        return jl.field_S;
    }

    final byte[] c(byte param0) {
        if (param0 <= 102) {
          this.field_z = (fj) null;
          if (this.field_r) {
            throw new RuntimeException();
          }
          if (this.field_z.field_j.length - this.field_y <= this.field_z.field_n) {
            return this.field_z.field_j;
          }
          throw new RuntimeException();
        }
        if (this.field_r) {
          throw new RuntimeException();
        }
        if (this.field_z.field_j.length - this.field_y <= this.field_z.field_n) {
          return this.field_z.field_j;
        }
        throw new RuntimeException();
    }

    final static ae a(String param0, int param1) {
        String var2 = null;
        ae var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        ae stackIn_16_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = Torquing.field_u;
        try {
          if (null == ed.field_c) {
            return null;
          }
          var6 = (CharSequence) ((Object) param0);
          var2 = hf.a(var6, 102);
          if (var2 == null) {
            var2 = param0;
          }
          if (param1 != 0) {
            field_A = (String) null;
          }
          var3 = (ae) (ed.field_c.a((long)var2.hashCode(), param1 - 56));
          while (true) {
            if (var3 == null) {
              return null;
            }
            var7 = (CharSequence) ((Object) var3.field_ob);
            var4 = hf.a(var7, param1 ^ 118);
            if (var4 == null) {
              var4 = var3.field_ob;
            }
            if (!var4.equals(var2)) {
              var3 = (ae) (ed.field_c.b(-1));
              continue;
            }
            break;
          }
          stackIn_16_0 = var3;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_21_0 = var2_ref;
          stackIn_21_1 = new StringBuilder().append("ac.H(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    final int b(int param0) {
        if (param0 < 91) {
          this.field_x = -38;
          if (this.field_z == null) {
            return 0;
          }
          return 100 * this.field_z.field_n / (this.field_z.field_j.length - this.field_y);
        }
        if (this.field_z == null) {
          return 0;
        }
        return 100 * this.field_z.field_n / (this.field_z.field_j.length - this.field_y);
    }

    ac() {
    }

    final static boolean a(fj param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        fj var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param0.i((byte) -101);
          stackIn_3_0 = (var2_int == 1) ? 1 : 0;
          var3 = stackIn_3_0;
          if (param1 != 28066) {
            var4 = (fj) null;
            ac.a((fj) null, -59);
          }
          stackIn_6_0 = var3;
          return stackIn_6_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("ac.G(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_A = "Loading music";
    }
}
