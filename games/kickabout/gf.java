/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf {
    static volatile int field_b;
    static hu field_a;
    static String field_i;
    int field_g;
    static String field_d;
    static String field_h;
    static int field_c;
    static String field_f;
    static String[] field_e;

    final static boolean a(byte[] param0, int param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        boolean stackIn_16_0 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 3231) {
            gf.a((byte) 92);
          }
          if (param0 == null) {
            return false;
          }
          if (param2 >= 2) {
            return true;
          }
          var4_int = param1 / 8;
          if (param0.length > var4_int &&
            var4_int >= 0) {
            var5 = param0[var4_int];
            var6 = 7 - (7 & param1);
            stackIn_16_0 = ((var5 & 1 << var6) != 0);
            return stackIn_16_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("gf.D(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(byte param0) {
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int[] var5 = null;
        ml var6 = null;
        int var7 = 0;
        int var9 = 0;
        int[] var11 = null;
        int[] var12 = null;
        dk var13 = null;
        ii var14 = null;
        ml var15 = null;
        Object var16 = null;
        dk var16_ref = null;
        var16 = null;
        var9 = Kickabout.field_G;
        try {
          var15 = un.field_e;
          var2 = 123 % ((param0 + 25) / 60);
          var3 = var15.h((byte) -106);
          if (var3 == 0) {
            var12 = st.c(-23091);
            var4 = var12;
            var11 = var12;
            var5 = var11;
            var6 = var15;
            var7 = ((iw) ((Object) var6)).h((byte) -108);
            for (var8 = 0; var7 > var8; var8++) {
              var11[var8] = ((iw) ((Object) var6)).k(4);
            }
            var13 = (dk) (ap.field_j.g(24009));
            if (var13 == null) {
              lr.b((byte) -116);
              return;
            }
            var13.field_e = var4;
            var13.field_f = true;
            var13.c((byte) -109);
            return;
          }
          if (var3 == 1) {
            var14 = (ii) (il.field_a.g(24009));
            if (var14 != null) {
              var14.c((byte) -109);
              return;
            }
            lr.b((byte) -116);
            return;
          }
          if (2 != var3) {
            bd.a("A1: " + tr.b(0), (Throwable) null, 1);
            lr.b((byte) -116);
            return;
          }
          var16_ref = (dk) (ap.field_j.g(24009));
          if (var16_ref == null) {
            lr.b((byte) -116);
            return;
          }
          var16_ref.field_e = st.c(-23091);
          var16_ref.field_f = true;
          var16_ref.c((byte) -109);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "gf.A(" + param0 + ')');
        }
    }

    final static vq a(bu param0, int param1, int param2, int param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        vq var7 = null;
        java.awt.Frame var8 = null;
        Object stackIn_2_0 = null;
        vq stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = ol.a(param1 ^ -9027, param4, param2, param3, param0, param5);
          var6 = var8;
          if (var8 == null) {
            stackIn_2_0 = null;
            return (vq) (stackIn_2_0);
          }
          var7 = new vq();
          var7.field_c = var8;
          var7.field_c.add((java.awt.Component) ((Object) var7));
          var7.setBounds(param1, 0, param4, param2);
          var7.addFocusListener(var7);
          var7.requestFocus();
          stackIn_4_0 = var7;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_7_0 = var6_ref;
          stackIn_7_1 = new StringBuilder().append("gf.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_e = null;
        field_i = null;
        field_f = null;
        field_a = null;
        field_h = null;
        if (param0 != 64) {
          bu var2 = (bu) null;
          gf.a((bu) null, 79, 33, -42, -123, 17);
        }
    }

    final static ld a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        ld var5 = null;
        ld stackIn_4_0 = null;
        ld stackIn_7_0 = null;
        ld stackIn_10_0 = null;
        ld stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null &&
            param1.length() != 0) {
            var2_int = param1.indexOf((int) (char)param0);
            if (var2_int == -1) {
              stackIn_7_0 = ld.field_b;
              return stackIn_7_0;
            }
            var3 = param1.substring(0, var2_int);
            var4 = param1.substring(1 + var2_int);
            var5 = gp.a((byte) -25, var3);
            if (var5 == null) {
              stackIn_12_0 = ie.a(var4, param0 - 64);
              return stackIn_12_0;
            }
            stackIn_10_0 = var5;
            return stackIn_10_0;
          }
          stackIn_4_0 = cb.field_c;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("gf.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_b = -1;
        field_i = "Unrated game";
        field_h = "Game options changed (<%0>)";
        field_f = "You can ask to join this game";
        field_d = "Use PageUp/PageDown or scroll the mouse wheel to zoom the camera.";
        field_e = new String[]{"Slots", "Trinkets"};
    }
}
