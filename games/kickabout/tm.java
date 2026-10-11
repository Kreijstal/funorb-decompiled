/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tm extends am {
    static ot field_z;
    static ut field_u;
    static String field_r;
    static ut field_v;
    static int field_t;
    String field_s;
    static int[][] field_x;
    Class[] field_p;
    String field_o;
    static int[] field_y;
    static ut[] field_n;
    static ut field_w;
    static String[] field_q;

    public static void a(int param0) {
        field_n = null;
        field_w = null;
        field_r = null;
        field_u = null;
        field_v = null;
        field_q = null;
        if (param0 == 15) {
          field_x = (int[][]) null;
          field_y = null;
          field_z = null;
          return;
        }
        field_x = (int[][]) null;
        field_x = (int[][]) null;
        field_y = null;
        field_z = null;
    }

    final boolean a(li[] param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        Class var5 = null;
        int var6 = 0;
        dg var7 = null;
        var6 = Kickabout.field_G;
        try {
          if (param1 != 2) {
            var7 = (dg) null;
            tm.a(58, 112, true, (dg) null);
          }
          if (!this.field_o.equals(param2)) {
            return false;
          }
          if (param0.length != this.field_p.length) {
            return false;
          }
          for (var4_int = 0; this.field_p.length > var4_int; var4_int++) {
            if (param0[var4_int].field_b) {
              var5 = rm.a(param0[var4_int].field_d, (byte) 127);
              if (var5 == Boolean.TYPE &&
                this.field_p[var4_int] != Boolean.TYPE) {
                return false;
              }
              if (Character.TYPE == var5 &&
                this.field_p[var4_int] != Character.TYPE) {
                return false;
              }
              if (fp.a(89, var5) &&
                !fp.a(98, this.field_p[var4_int])) {
                return false;
              }
            } else {
              if (!this.field_p[var4_int].isInstance(param0[var4_int].field_d)) {
                return false;
              }
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_35_0 = var4;
          stackIn_35_1 = new StringBuilder().append("tm.G(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          stackIn_38_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    final static boolean b(int param0) {
        int var2 = 0;
        si var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        si var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Kickabout.field_G;
        try {
          if (param0 != -16000) {
            return true;
          }
          var4 = (si) (nv.field_N.g(param0 ^ -25527));
          var1 = var4;
          if (var1 == null) {
            return false;
          }
          for (var2 = 0; var1.field_n > var2; var2++) {
            if (null != var4.field_f[var2] &&
              var4.field_f[var2].field_a == 0) {
              return false;
            }
            if (null != var4.field_e[var2] &&
              0 == var4.field_e[var2].field_a) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1_ref), "tm.I(" + param0 + ')');
        }
    }

    public final String toString() {
        return this.field_s;
    }

    abstract li a(byte param0, li[] param1);

    final static void a(int param0, int param1, boolean param2, dg param3) {
        mt.field_a = param1;
        if (param2) {
          return;
        }
        try {
          ba.field_p = param3;
          dq.field_f = param0;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "tm.H(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    tm(String param0, Class[] param1, String param2) {
        StringBuilder var7 = null;
        StringBuilder var8 = null;
        int var5 = 0;
        StringBuilder discarded$27 = null;
        StringBuilder discarded$29 = null;
        StringBuilder discarded$38 = null;
        StringBuilder discarded$39 = null;
        try {
          this.field_o = param0;
          this.field_p = param1;
          var7 = new StringBuilder(this.field_o).append('(');
          var8 = var7;
          for (var5 = 0; this.field_p.length > var5; var5++) {
            discarded$27 = var7.append(dr.a(-120, this.field_p[var5]));
            if (this.field_p.length - 1 > var5) {
              discarded$29 = var8.append(", ");
            } else {
            }
          }
          discarded$38 = var8.append(')');
          if (param2 != null) {
            discarded$39 = var8.append("     <col=ffaaff>" + param2 + "</col>");
          }
          this.field_s = var8.toString();
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "tm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_u = new ut(76, 92);
        field_t = 0;
        field_x = new int[3][4];
        field_x[0][0] = 7508762;
        field_x[0][1] = 7180825;
        field_x[0][2] = 8100378;
        field_x[0][3] = 8100371;
        field_x[1][0] = 13943953;
        field_x[1][3] = 15061120;
        field_x[1][2] = 13878165;
        field_x[1][1] = 13352330;
        field_x[2][0] = 5921627;
        field_x[2][1] = 4934732;
        field_x[2][2] = 2960685;
        field_x[2][3] = 6568505;
        field_r = "<%0> has joined your game.";
        field_v = new ut(270, 70);
        field_y = new int[3];
        field_q = new String[]{"<img=0>The highest league in Kickabout is known as the Diamond Division. The rules here are slightly different.", "<img=0>When you reach the Diamond Division, your league points vanish and are replaced with <col=ffff00>diamond league points</col>.", "<img=0>Players compete with each other in a weekly battle to get the highest score. There is no maximum value or target score to reach.", "<img=0>Diamond league points are reset every week at <col=ffff00>10am GMT on Tuesdays</col>. All players' scores are set back to 0.", "<img=0>The player(s) with the highest score at the end of each week receives the Diamond Trophy and the famous 'We Are The Champions' Achievement!"};
        field_y[2] = 22;
        field_y[1] = 17;
        field_y[0] = 15;
    }
}
