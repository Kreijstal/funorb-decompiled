/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ir {
    static ba field_a;
    static tj field_c;
    static int field_d;
    static int[] field_e;
    static String field_b;
    static int field_f;

    public static void a(boolean param0) {
        field_e = null;
        field_b = null;
        field_a = null;
        if (param0) {
          field_e = (int[]) null;
          field_c = null;
          return;
        }
        field_c = null;
    }

    final static boolean a(int param0, r param1, r param2, r param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2.b(0)) {
            return false;
          }
          if (!param2.c("commonui", 0)) {
            return false;
          }
          if (param1.b(0) &&
            param1.c("commonui", 0)) {
            var4_int = -20 % ((param0 - 12) / 63);
            if (param3.b(0) &&
              param3.c("button.gif", 0)) {
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("ir.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final static void a(int param0, byte param1) {
        r var3 = null;
        r var3Lifetime1;
        rm.field_B = (param0 & 63) >> 4;
        oa.field_p = param0 >> 2 & 3;
        if (!(rm.field_B <= 2)) {
          rm.field_B = 2;
        }
        mf.field_b = param0 & 3;
        if (2 < oa.field_p) {
          oa.field_p = 2;
          if (param1 == -65) {
            if (mf.field_b <= 2) {
              return;
            }
            mf.field_b = 2;
            return;
          }
          var3 = (r) null;
          ir.a(50, (r) null, (r) null, (r) null);
          if (mf.field_b > 2) {
            mf.field_b = 2;
            return;
          }
          return;
        }
        if (param1 != -65) {
          var3Lifetime1 = (r) null;
          ir.a(50, (r) null, (r) null, (r) null);
          if (mf.field_b <= 2) {
            return;
          }
          mf.field_b = 2;
          return;
        }
        if (mf.field_b <= 2) {
          return;
        }
        mf.field_b = 2;
    }

    final static void a(int param0, String param1) {
        if (param0 == -8957) {
          System.out.println("Error: " + mr.a("%0a", (byte) -48, "\n", param1));
          return;
        }
        field_c = (tj) null;
        System.out.println("Error: " + mr.a("%0a", (byte) -48, "\n", param1));
    }

    final static void a(String param0, int param1, String param2, int param3, int param4) {
        try {
          dj.field_d.field_Fb = dj.field_d.field_Fb + ui.field_b.field_Fb;
          dj.field_d.field_S = param2;
          dj.field_d.field_J = param0;
          dj.field_d.field_A = param1;
          ui.field_b.field_wb = ui.field_b.field_wb + ui.field_b.field_Fb;
          ui.field_b.field_Fb = param3;
          dj.field_d.field_Fb = dj.field_d.field_Fb - ui.field_b.field_Fb;
          if (param4 != 0) {
            ir.a(true);
          }
          ui.field_b.field_wb = ui.field_b.field_wb - ui.field_b.field_Fb;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "ir.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_a = new ba();
        field_c = new tj();
        field_e = new int[]{7};
        field_f = 16777215;
        field_d = 0;
        field_b = "This option cannot be combined with the current '<%0>' setting.";
    }
}
