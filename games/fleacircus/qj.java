/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj extends dk {
    static String field_J;
    static String field_I;
    static String field_E;
    static boolean field_G;
    static fa field_H;
    static int field_K;
    static String field_F;

    final void a(byte param0, qa param1, int param2, int param3, int param4, int param5) {
        pk var7 = null;
        try {
          super.a(param0, param1, param2, param3, param4, param5);
          var7 = wi.field_e;
          if (var7 != null) {
            if (!this.b(param5, param2, param0 ^ 5, param3, param4)) {
              return;
            }
            if (this.field_s instanceof vd) {
              ((vd) (this.field_s)).a(var7, this, (byte) -46);
              wi.field_e = null;
              return;
            }
            if (var7.field_s instanceof vd) {
              ((vd) (var7.field_s)).a(var7, this, (byte) -46);
              wi.field_e = null;
              return;
            }
          }
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "qj.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(int param0, int param1, byte[] param2, int[] param3, int param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        byte dupTemp$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = fleas.field_A ? 1 : 0;
        try {
          var5_int = param4;
          while (true) {
            if (ed.field_c.length <= var5_int) {
              return;
            }
            param0 = ed.field_c[var5_int];
            var6 = var5_int << 4;
            while (true) {
              incrementValue$0 = param0;
              param0--;
              if (0 == incrementValue$0) {
                var5_int++;
                break;
              }
              incrementValue$1 = var6;
              var6++;
              param1 = pk.field_J[incrementValue$1];
              dupTemp$2 = param2[param1];
              dupTemp$3 = param3[dupTemp$2];
              param3[dupTemp$2] = dupTemp$3 + 1;
              pk.field_J[dupTemp$3] = param1;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("qj.AA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param4).append(')').toString());
        }
    }

    private qj(int param0, int param1, int param2, int param3, ch param4, kd param5, qa param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
          this.field_A = param6;
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "qj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    public static void i(int param0) {
        field_I = null;
        field_E = null;
        field_H = null;
        field_J = null;
        field_F = null;
        if (param0 >= -107) {
          field_G = true;
        }
    }

    static {
        field_E = "If you hold the mouse button down on a bridge, the currently selected tile will be placed there as soon as the bridge collapses, catching any fleas before they fall through. You can use this tactic with any tile that is going to disappear.";
        field_J = "Go Back";
        field_F = "<%0>Anti-Gravity:<%1> Reverses the direction of gravity when touched by a flea. Items such as balloons and springs now work upside down.";
    }
}
