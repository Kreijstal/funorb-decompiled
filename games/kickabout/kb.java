/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb extends tm {
    static boolean field_C;
    static ut[] field_E;
    static String field_D;
    static eg[] field_B;

    public static void g(int param0) {
        field_D = null;
        field_B = null;
        field_E = null;
        if (param0 != 1) {
          field_B = (eg[]) null;
        }
    }

    kb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final li a(byte param0, li[] param1) {
        RuntimeException var3 = null;
        li stackIn_2_0 = null;
        li stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 84) {
            stackIn_4_0 = new li(wi.a(-31182, (int[]) (param1[0].field_d)));
            return stackIn_4_0;
          }
          stackIn_2_0 = (li) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("kb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static int a(int param0, boolean param1) {
        int var2;
        int var2Lifetime1;
        if (param1) {
          kb.h(-15);
        }
        if (param0 == 0) {
          return 0;
        }
        if (param0 > 0) {
          var2 = 1;
          if (65535 < param0) {
            var2 += 16;
            param0 = param0 >> 16;
          }
          if (param0 > 255) {
            var2 += 8;
            param0 = param0 >> 8;
          }
          if (param0 > 15) {
            var2 += 4;
            param0 = param0 >> 4;
          }
          if (param0 > 3) {
            var2 += 2;
            param0 = param0 >> 2;
          }
          if (1 < param0) {
            var2++;
            param0 = param0 >> 1;
          }
          return var2;
        }
        var2Lifetime1 = 2;
        if (param0 < -65536) {
          param0 = param0 >> 16;
          var2Lifetime1 += 16;
        }
        if (param0 < -256) {
          var2Lifetime1 += 8;
          param0 = param0 >> 8;
        }
        if (param0 < -16) {
          param0 = param0 >> 4;
          var2Lifetime1 += 4;
        }
        if (param0 < -4) {
          var2Lifetime1 += 2;
          param0 = param0 >> 2;
        }
        if (param0 < -2) {
          param0 = param0 >> 1;
          var2Lifetime1++;
        }
        return var2Lifetime1;
    }

    final static void h(int param0) {
        int var2 = 0;
        int var1_int = 0;
        int var3 = 0;
        ut[][] var4 = null;
        ut var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var8 = Kickabout.field_G;
        try {
          if (ae.field_C == null) {
            return;
          }
          var1_int = cq.field_g;
          if (param0 >= -49) {
            return;
          }
          for (var2 = 0; 2 > var2; var2++) {
            var3 = 102 * var2 + 20;
            on.a(var1_int, var3, 160, 92, 12, 65793, 128);
            un.field_d.d(ao.field_f[var2].toLowerCase(), 80 + var1_int, var3 + 20, 16777215, -1);
            var4 = ae.field_C[var2];
            var4[0][1].b(14 + var1_int, 49 + var3, 20, 20);
            var4[1][1].b(var1_int + 14 + 38, var3 + 49, 20, 20);
            var4[2][1].b(19 + (14 + var1_int), 1 + (var3 + 49 - 20), 20, 20);
            var4[3][1].b(20 + (var1_int + 13), 49 + var3, 20, 20);
            pb.field_C.d(tj.field_g, 14 + (var1_int + 20) + 10, 20 + var3 + 65, 16777215, -1);
            if (ks.field_e > 1) {
              pb.field_C.d(nr.field_k, 115 + var1_int, 20 + (var3 + 49 + 16), 16777215, -1);
              var5 = kd.field_y[var2][1];
              var6 = 180 * var5.field_o >> 8;
              var7 = 180 * var5.field_v >> 8;
              var5.b(-(var6 >> 1) + (160 + cq.field_g - 46), var3 + 50, var6, var7);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "kb.A(" + param0 + ')');
        }
    }

    static {
        field_D = "Please select an option in the '<%0>' row.";
        field_B = new eg[5];
    }
}
