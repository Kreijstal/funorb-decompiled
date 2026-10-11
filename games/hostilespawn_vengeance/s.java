/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s {
    static String field_h;
    private boolean field_f;
    static int field_e;
    static bd field_d;
    static String field_a;
    private String field_c;
    static int field_g;
    static en field_b;

    final static void a(int param0, fd param1, int param2, int param3, kd param4, java.awt.Component param5, boolean param6, int param7) {
        try {
          ug.a(param3, param6, 10);
          uj.field_m = ug.a(param1, param5, 0, param0);
          eb.field_e = ug.a(param1, param5, 1, param2);
          oa.field_b = new wm();
          tm.field_v = param2;
          eb.field_e.a(oa.field_b);
          ha.field_w = param4;
          if (param7 >= -84) {
            java.awt.Component var9 = (java.awt.Component) null;
            s.a(-53, (fd) null, 23, -48, (kd) null, (java.awt.Component) null, false, -17);
          }
          ha.field_w.a(ga.field_b, true);
          uj.field_m.a(ha.field_w);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "s.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ')');
        }
    }

    final String a(int param0) {
        if (param0 != 16751324) {
          return (String) null;
        }
        return this.field_c;
    }

    s(String param0) {
        this(param0, false);
    }

    final boolean a(byte param0) {
        if (param0 != -80) {
          this.field_c = (String) null;
          return this.field_f;
        }
        return this.field_f;
    }

    final static String a(gb param0, String param1, int param2, String param3, String param4) {
        RuntimeException var5 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 < 35) {
            s.a(66, 36, 47, 70);
          }
          if (!param0.a(-15879)) {
            stackIn_5_0 = (String) (param3);
            return stackIn_5_0;
          }
          stackIn_7_0 = param4 + " - " + param0.b(122, param1) + "%";
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("s.E(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param4 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        field_d = null;
        field_a = null;
        field_h = null;
        if (param0) {
          String var2 = (String) null;
          s.a((gb) null, (String) null, 5, (String) null, (String) null);
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        int var5 = 0;
        int var6 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        bd var12 = null;
        bd var13 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var11 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (param1 != 65792) {
            return;
          }
          var12 = hh.field_a[param0];
          var13 = var12;
          var5 = 0;
          var6 = param3 + param2 * 640;
          for (var7 = 0; var13.field_A > var7; var7++) {
            for (var8 = 0; var13.field_z > var8; var8++) {
              var9 = var12.field_D[var8 + var5];
              var10 = Math.max((var9 & 16751324) >> 16, Math.max((var9 & 65414) >> 8, var9 & 255));
              if (var10 > 8) {
                o.field_n.field_f[var8 + var6] = 65792 * var10;
              }
            }
            var5 = var5 + var13.field_u;
            var6 += 640;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var4), "s.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    s(String param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_c = param0;
          if (null == this.field_c) {
            this.field_c = "";
          }
          stackIn_6_1 = (param1);
          this.field_f = stackIn_6_1;
          if (this.field_c.length() != 0) {
            return;
          }
          this.field_f = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("s.<init>(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        bd discarded$0 = new bd(160, 120);
        field_h = "Type your age in years";
        field_a = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
