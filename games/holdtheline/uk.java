/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class uk extends IOException {
    static hj field_a;
    static String field_f;
    static e field_g;
    static uf field_b;
    static String field_d;
    static String[] field_c;
    static boolean field_e;

    final static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2_int = 0;
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        hj var6 = null;
        hj var7 = null;
        hj var8 = null;
        int var3Lifetime1;
        var4 = HoldTheLine.field_D;
        try {
          tc.a(243, 197, 369, 143, 16777215);
          tc.f(244, 198, 367, 141, 0);
          if (qk.field_y == null) {
            if (null != an.field_e) {
              an.field_e.a(ug.field_f, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
            }
            return;
          }
          var6 = qk.field_y[va.field_e];
          if (var6 != null) {
            var6.a(245, 199);
          } else {
            if (an.field_e != null) {
              an.field_e.a(ug.field_f, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
            }
          }
          if (param0 != 3979) {
            return;
          }
          if (hk.field_e < bg.field_g) {
            var7 = qk.field_y[hf.field_i];
            if (var7 != null) {
              var2_int = hk.field_e * (60 + var7.field_o) / bg.field_g;
              var3 = var2_int - 30;
              if (rg.field_e) {
                jg.a(199, 256 * (-var3 + var7.field_o) / 30, var7, true, 245, var3 * -256 / 30);
              } else {
                jg.a(199, -256 * var3 / 30, var7, true, 245, (var7.field_o - var3) * 256 / 30);
              }
            }
          }
          if (an.field_e != null) {
            var2 = null;
            var5 = 0;
            var3Lifetime1 = var5;
            while (var5 < qk.field_y.length) {
              var8 = qk.field_y[var5];
              if (var8 != null && (var8.field_o != 365 ||
                139 != var8.field_v)) {
                if (var2 != null) {
                  var2 = (String) (var2) + ", " + var5;
                } else {
                  var2 = Integer.toString(var5);
                }
              }
              var5++;
            }
            if (var2 == null) {
              return;
            }
            an.field_e.a("Screenshot(s) " + (String) (var2) + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var1), "uk.A(" + param0 + ')');
        }
    }

    final static void b(int param0) {
        ci.field_o = false;
        if (param0 >= -41) {
          field_g = (e) null;
        }
        aa.field_k = false;
        go.a(0, -1);
        ak.field_b = gg.field_M;
        bb.field_a = gg.field_M;
    }

    uk(String param0) {
        super(param0);
    }

    public static void a(byte param0) {
        int var1 = 97 / ((-59 - param0) / 57);
        field_c = null;
        field_f = null;
        field_b = null;
        field_a = null;
        field_d = null;
        field_g = null;
    }

    final static kg a(String param0, boolean param1, int param2, boolean param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        kg stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = -104 % ((42 - param2) / 54);
          stackIn_1_0 = new kg(param0, param3, param1);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("uk.B(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_f = "Minor thrust";
        field_d = "Fullscreen";
        field_g = new e(0, 2, 2, 1);
    }
}
