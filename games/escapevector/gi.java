/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi {
    int field_h;
    String field_n;
    int field_a;
    static te field_i;
    private static int field_d;
    int[] field_k;
    static te field_c;
    private long field_b;
    private int field_m;
    private String field_j;
    private boolean field_g;
    static int[] field_e;
    int field_f;
    static int field_l;

    final int b(int param0) {
        if (!this.field_g && (2 != this.field_a ||
          this.field_m <= 0)) {
          if (this.field_b == en.field_l) {
            return 1;
          }
          if (mi.field_g == 2 &&
            kl.a(this.field_j, 0)) {
            return 1;
          }
          if (param0 >= 40) {
            return 0;
          }
          return 89;
        }
        return 2;
    }

    final static void a(int param0) {
        try {
          int var1_int = jb.field_u.length;
          jb.field_k = new jk[var1_int];
          for (int var2 = param0; var2 < var1_int; var2++) {
            int var3 = jb.field_u[var2];
            int var4 = jb.field_h[var2];
            int var5 = jb.field_v[var2];
            jk var6 = new jk(var3, var4, var5);
            jb.field_k[var2] = var6;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "gi.A(" + param0 + ')');
        }
    }

    final static void a(int param0, int[] param1, int param2, int param3, int[] param4) {
        String stackIn_19_2 = null;
        String stackIn_22_2 = null;
        int var13 = EscapeVector.obfuscationControl;
        try {
          if (param2 != 1) {
            int[] var14 = (int[]) null;
            gi.a(-43, (int[]) null, -42, 84, (int[]) null);
          }
          if (param3 < param0) {
            int var5_int = (param0 + param3) / 2;
            int var6 = param3;
            int var7 = param4[var5_int];
            param4[var5_int] = param4[param0];
            param4[param0] = var7;
            int var8 = param1[var5_int];
            param1[var5_int] = param1[param0];
            param1[param0] = var8;
            int stackIn_7_0 = (var7 != 2147483647) ? 1 : 0;
            int var9 = stackIn_7_0;
            for (int var10 = param3; var10 < param0; var10++) {
              if (param4[var10] < (var7 + (var9 & var10))) {
                int var11 = param4[var10];
                param4[var10] = param4[var6];
                param4[var6] = var11;
                int var12 = param1[var10];
                param1[var10] = param1[var6];
                param1[var6++] = var12;
              }
            }
            param4[param0] = param4[var6];
            param4[var6] = var7;
            param1[param0] = param1[var6];
            param1[var6] = var8;
            gi.a(-1 + var6, param1, param2 ^ 0, param3, param4);
            gi.a(param0, param1, param2 ^ 0, var6 + 1, param4);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_18_0 = var5;
          StringBuilder stackIn_18_1 = new StringBuilder().append("gi.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          StringBuilder stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static int a(byte param0, ih param1) {
        String stackIn_8_2 = null;
        try {
          int var2_int = co.a(param1, (byte) -127);
          String var3 = mn.a(param0 ^ 16, (char) var2_int, 20);
          if (param0 == -96) {
            int stackIn_4_0 = param1.b(var3);
            return stackIn_4_0;
          }
          int stackIn_2_0 = 21;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var2;
          StringBuilder stackIn_7_1 = new StringBuilder().append("gi.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void c(int param0) {
        field_c = null;
        if (param0 != -13885) {
          return;
        }
        field_i = null;
        field_e = null;
    }

    final static void a(byte param0) {
        int var2 = EscapeVector.obfuscationControl;
        try {
          if (param0 >= -49) {
            return;
          }
          for (int var1_int = 0; var1_int < mh.field_a.length; var1_int++) {
            mh.field_a[var1_int] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "gi.E(" + param0 + ')');
        }
    }

    gi(boolean param0) {
        this.field_j = rm.field_g;
        this.field_g = rm.field_c;
        this.field_h = im.field_a;
        this.field_f = jn.field_d;
        this.field_m = ve.field_g;
        this.field_n = od.field_d;
        this.field_a = DualLinkNode.field_o;
        this.field_b = ah.field_e;
        if (param0) {
          this.field_k = bo.field_H;
        } else {
          this.field_k = null;
        }
    }

    static {
        field_d = 398339;
        field_c = new te(1, 1, 256);
        for (int var0 = 0; var0 < 256; var0++) {
          field_c.field_l[var0] = field_d;
        }
        field_c.field_l[0] = 0;
        field_i = new te(3, 3, 256);
        field_i.field_l[1] = 2917671;
    }
}
