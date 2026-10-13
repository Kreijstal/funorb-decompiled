/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei implements ub {
    private int field_l;
    static String field_g;
    private int field_h;
    private int field_j;
    private int field_m;
    private int field_k;
    private int field_f;
    static String field_a;
    private int field_b;
    private int field_d;
    private int field_i;
    private int field_c;
    private TextFont field_n;
    private int field_e;

    public final void a(boolean param0, int param1, int param2, oc param3, int param4) {
        oc stackIn_3_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        bf var11 = null;
        try {
          if (param3 instanceof bf) {
            stackIn_3_0 = (oc) (param3);
          } else {
            stackIn_3_0 = null;
          }
          var11 = (bf) (stackIn_3_0);
          if (var11 != null) {
            param0 = param0 & var11.field_J;
          }
          var7 = 5592405;
          if (param0) {
            var7 = 16777215;
          }
          Rasterizer2D.fillRectangle(param3.field_o + param2, param4 + param3.field_w, param3.field_t, param3.field_s, this.field_b);
          var8 = this.field_m + param2 + param3.field_o;
          var9 = this.field_h + param4 + param3.field_w;
          Rasterizer2D.a(var8, var9, this.field_l, this.field_d, 5592405);
          if (param1 != -20618) {
            this.field_h = 116;
          }
          Rasterizer2D.fillRectangle(var8, var9, this.field_l, this.field_d, var7);
          if (var11.field_F) {
            Rasterizer2D.drawLine(var8, var9, this.field_l + var8, var9 + this.field_d, 1);
            Rasterizer2D.drawLine(var8 + this.field_l, var9, var8, var9 + this.field_d, 1);
          }
          if (null == this.field_n) {
            return;
          }
          var10 = this.field_l + this.field_m + this.field_f;
          this.field_n.a(param3.field_A, param2 + (param3.field_o + var10), this.field_c + (param3.field_w + param4), param3.field_t - (this.field_f + var10), param3.field_s - (this.field_f << 1), this.field_e, this.field_j, this.field_i, this.field_k, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_18_0 = var6;
          stackIn_18_1 = new StringBuilder().append("ei.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void b(int param0) {
        int var1;
        int var2;
        var2 = BrickABrac.field_J ? 1 : 0;
        if (param0 != 0) {
          return;
        }
        ke.field_b = null;
        t.field_g = false;
        if (cg.field_l) {
          ej.field_I.i((byte) -104);
        } else {
          var1 = OptionsScreen.field_x;
          if (var1 > 0) {
            if (var1 != 1) {
              ke.field_b = rd.a(ed.field_c, new String[]{Integer.toString(var1)}, (byte) 103);
            } else {
              ke.field_b = ib.field_C;
            }
            ke.field_b = IntrusiveNode.a(new CharSequence[]{(CharSequence) ((Object) ke.field_b), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) m.field_e)}, true);
          }
          ej.field_I.m(param0 + 17);
          qa.e((byte) -117);
        }
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != 1) {
          return;
        }
        field_a = null;
    }

    ei(TextFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_i = 1;
        this.field_k = 1;
        try {
          this.field_n = param0;
          this.field_l = param8;
          this.field_f = param1;
          this.field_d = param7;
          this.field_m = param5;
          this.field_h = param6;
          this.field_b = param9;
          this.field_e = param3;
          this.field_j = param4;
          this.field_c = param2;
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "ei.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        field_g = "(1 player wants to join)";
        field_a = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
    }
}
