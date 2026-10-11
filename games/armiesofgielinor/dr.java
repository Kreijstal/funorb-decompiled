/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dr extends ms {
    static String field_y;
    static String field_D;
    Class[] field_u;
    String field_A;
    static int[] field_z;
    static String field_w;
    static String[] field_C;
    String field_B;
    static String field_x;
    static int[][] field_v;

    public final String toString() {
        return this.field_A;
    }

    abstract nd a(int param0, nd[] param1);

    public static void d(byte param0) {
        field_D = null;
        field_v = (int[][]) null;
        field_y = null;
        field_C = null;
        field_w = null;
        field_z = null;
        field_x = null;
        if (param0 <= 68) {
          field_w = (String) null;
        }
    }

    final static void a(int param0, byte param1, int param2, nr param3) {
        try {
          if (param1 != 96) {
            nr var5 = (nr) null;
            dr.a(125, (byte) -9, 20, (nr) null);
          }
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "dr.G(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(String param0, byte param1, nd[] param2) {
        int var5 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        Class var6 = null;
        int var7 = 0;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (!this.field_B.equals(param0)) {
            return false;
          }
          if (this.field_u.length != param2.length) {
            return false;
          }
          var4_int = -96 / ((-2 - param1) / 52);
          for (var5 = 0; var5 < this.field_u.length; var5++) {
            if (param2[var5].field_e) {
              var6 = cq.a(param2[var5].field_c, (byte) -75);
              if (Boolean.TYPE == var6 &&
                this.field_u[var5] != Boolean.TYPE) {
                return false;
              }
              if (Character.TYPE == var6 &&
                this.field_u[var5] != Character.TYPE) {
                return false;
              }
              if (RevivalEvent.a(false, var6) &&
                !RevivalEvent.a(false, this.field_u[var5])) {
                return false;
              }
            } else {
              if (!this.field_u[var5].isInstance(param2[var5].field_c)) {
                return false;
              }
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_33_0 = var4;
          stackIn_33_1 = new StringBuilder().append("dr.E(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    dr(String param0, Class[] param1, String param2) {
        StringBuilder var7 = null;
        StringBuilder var8 = null;
        int var5 = 0;
        StringBuilder discarded$18 = null;
        StringBuilder discarded$19 = null;
        StringBuilder discarded$28 = null;
        StringBuilder discarded$29 = null;
        try {
          this.field_u = param1;
          this.field_B = param0;
          var7 = new StringBuilder(this.field_B).append('(');
          var8 = var7;
          for (var5 = 0; var5 < this.field_u.length; var5++) {
            discarded$18 = var7.append(hw.a(640, this.field_u[var5]));
            if (-1 + this.field_u.length > var5) {
              discarded$19 = var8.append(", ");
            }
          }
          discarded$28 = var8.append(')');
          if (param2 != null) {
            discarded$29 = var8.append("     <col=ffaaff>" + param2 + "</col>");
          }
          this.field_A = var8.toString();
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "dr.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        field_y = "Manoeuvres";
        field_D = "Close";
        field_w = "(+<%0>)";
        field_C = new String[]{"Showing by rating", "Showing by win percentage"};
        field_x = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find suitable opponents in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_z = new int[16];
        for (var0 = 0; field_z.length > var0; var0++) {
          var1 = var0 + 1;
          field_z[var0] = Math.min(oe.c(oe.c(rn.a(var1 << 16, 16729482), rn.a(-2046820097, var1) << 8), rn.a(var1 << 2, 252)), 267583488);
          field_z[var0] = oe.c(rn.a(16515326, field_z[var0]), rn.a(32512, field_z[var0] >> 1));
          var2 = gq.a(field_z[var0]);
          var2 = var2 & 655359;
          var3 = 255 & var2;
          if (var3 > 5) {
            var3 = 5;
          }
          var2 = -256 & var2 | var3;
          field_z[var0] = gq.b(var2);
        }
        field_v = new int[8][16];
    }
}
