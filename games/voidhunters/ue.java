/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue {
    private jp field_b;
    static String field_c;
    static int field_a;
    long field_d;

    protected final void finalize() throws Throwable {
        this.field_b.a(this.field_d, 0);
        super.finalize();
    }

    final static void a(byte[] param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var17 = 0;
        int var21 = 0;
        int var22 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var23 = 0;
        var23 = VoidHunters.field_G;
        try {
          if (0 < param5 &&
            !bd.a(param5, (byte) -95)) {
            throw new IllegalArgumentException("");
          }
          if (0 < param6 &&
            !bd.a(param6, (byte) -95)) {
            throw new IllegalArgumentException("");
          }
          var7_int = pu.a((byte) -120, param2);
          var8 = param1;
          stackIn_11_0 = (param6 > param5) ? param5 : param6;
          var9 = stackIn_11_0;
          var10 = param5 >> 1;
          var11 = param6 >> 1;
          var12 = param0;
          var13 = new byte[var10 * (var11 * var7_int)];
          while (true) {
            jaggl.OpenGL.glTexImage2Dub(param3, var8, param4, param5, param6, 0, param2, 5121, var12, 0);
            if (1 >= var9) {
              return;
            }
            var16 = var7_int * param5;
            var14 = var13;
            for (var17 = 0; var7_int > var17; var17++) {
              var18 = var17;
              var19 = var17;
              var20 = var16 + var19;
              for (var21 = 0; var11 > var21; var21++) {
                for (var22 = 0; var22 < var10; var22++) {
                  var15 = var12[var19];
                  var19 = var19 + var7_int;
                  var15 = var15 + var12[var19];
                  var19 = var19 + var7_int;
                  var15 = var15 + var12[var20];
                  var20 = var20 + var7_int;
                  var15 = var15 + var12[var20];
                  var20 = var20 + var7_int;
                  var13[var18] = (byte)(var15 >> 2);
                  var18 = var18 + var7_int;
                }
                var20 = var20 + var16;
                var19 = var19 + var16;
              }
            }
            var13 = var12;
            var12 = var14;
            param5 = var10;
            param6 = var11;
            var9 = var9 >> 1;
            var11 = var11 >> 1;
            var10 = var10 >> 1;
            var8++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_26_0 = var7;
          stackIn_26_1 = new StringBuilder().append("ue.A(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static void a(int param0, byte param1, bc param2, int param3) {
        try {
          if (param1 != 111) {
            byte[] var5 = (byte[]) null;
            ue.a((byte[]) null, -33, -97, 6, -100, 46, -12);
          }
          eh.field_p = param0;
          skb.field_o = param2;
          ag.field_p = param3;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "ue.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 != 124) {
          return;
        }
        field_c = null;
    }

    ue(jp param0, long param1, int param2) {
        try {
          this.field_b = param0;
          this.field_d = param1;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "ue.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_c = "Ask to join <%0>'s game";
        field_a = 200;
    }
}
