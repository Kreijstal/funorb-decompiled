/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mo extends cj {
    static long field_Gb;
    private cj field_Pb;
    static ao field_Lb;
    cj field_Mb;
    static th field_Fb;
    static cj field_Hb;
    static ri[] field_Ob;
    static int field_Kb;
    static String field_Nb;
    static int field_Ib;
    static hh field_Jb;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.a(param2, param5, param3, param4, -3344);
        if (param1 != 2) {
          return;
        }
        this.a(param0, -17369, param6);
    }

    public static void h(int param0) {
        field_Nb = null;
        field_Hb = null;
        field_Lb = null;
        if (param0 == 2) {
          field_Ob = null;
          field_Jb = null;
          field_Fb = null;
          return;
        }
        field_Hb = (cj) null;
        field_Ob = null;
        field_Jb = null;
        field_Fb = null;
    }

    final int a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var4Lifetime1;
        int var5Lifetime1;
        if (!param1) {
          var4 = -param2;
          if (this.field_Pb != null) {
            var4 = this.field_Pb.e(0);
          }
          var5 = -param2;
          if (null != this.field_Mb) {
            var5 = this.field_Mb.e(0);
          }
          return param0 + param2 + param0 - (-var4 - var5);
        }
        field_Ob = (ri[]) null;
        var4Lifetime1 = -param2;
        if (this.field_Pb != null) {
          var4Lifetime1 = this.field_Pb.e(0);
        }
        var5Lifetime1 = -param2;
        if (null != this.field_Mb) {
          var5Lifetime1 = this.field_Mb.e(0);
        }
        return param0 + param2 + param0 - (-var4Lifetime1 - var5Lifetime1);
    }

    final static String a(String param0, int param1, int param2, String param3, ul param4) {
        RuntimeException var5 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param4.a((byte) -119)) {
            stackIn_3_0 = (String) (param3);
            return stackIn_3_0;
          }
          if (param2 != -3) {
            field_Kb = -26;
          }
          stackIn_7_0 = param0 + " - " + param4.a(param1, (byte) 121) + "%";
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("mo.HA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void a(int param0, k param1, int param2, int param3, byte param4) {
        try {
          param1.a(-120, 12);
          param1.a(17, (byte) -56);
          if (param4 != -124) {
            field_Gb = 73L;
          }
          param1.a(param0, (byte) -70);
          param1.a(param3, (byte) -42);
          param1.a(-118, param2);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "mo.CA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void i(int param0) {
        jg.field_a = false;
        if (param0 > -2) {
          mo.i(-59);
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var6Lifetime1;
        var4 = -param0;
        var5 = -param0;
        if (null != this.field_Pb) {
          var4 = this.field_Pb.e(param1 + 17369);
        }
        if (param1 == -17369) {
          if (null != this.field_Mb) {
            var5 = this.field_Mb.a(-1, -param2 - param0 + (-var4 + this.field_zb - param2));
          }
          var6 = var5 + (var4 + (param2 + param0 + param2));
          if (this.field_zb < var6) {
            var5 = var5 + (this.field_zb - var6);
            var6 = this.field_zb;
          }
          if (this.field_R == 1) {
            param2 = param2 + (this.field_zb - var6) / 2;
          }
          if (this.field_R == 2) {
            param2 = param2 + (-var6 + this.field_zb);
          }
          if (this.field_Pb != null) {
            this.field_Pb.a(this.field_z, 0, var4, param2, param1 ^ 20183);
            this.field_Pb.field_lb = this.field_lb;
          }
          if (this.field_Mb == null) {
            return;
          }
          this.field_Mb.a(this.field_z, 0, var5, param2 - (-var4 - param0), -3344);
          if (null != this.field_Pb) {
            this.field_Mb.field_R = 0;
          } else {
            this.field_Mb.field_R = this.field_R;
          }
          this.field_Mb.field_lb = this.field_lb;
          return;
        }
        field_Gb = -30L;
        if (null != this.field_Mb) {
          var5 = this.field_Mb.a(-1, -param2 - param0 + (-var4 + this.field_zb - param2));
        }
        var6Lifetime1 = var5 + (var4 + (param2 + param0 + param2));
        if (this.field_zb < var6Lifetime1) {
          var5 = var5 + (this.field_zb - var6Lifetime1);
          var6Lifetime1 = this.field_zb;
        }
        if (this.field_R == 1) {
          param2 = param2 + (this.field_zb - var6Lifetime1) / 2;
        }
        if (this.field_R == 2) {
          param2 = param2 + (-var6Lifetime1 + this.field_zb);
        }
        if (this.field_Pb != null) {
          this.field_Pb.a(this.field_z, 0, var4, param2, param1 ^ 20183);
          this.field_Pb.field_lb = this.field_lb;
        }
        if (this.field_Mb == null) {
          return;
        }
        this.field_Mb.a(this.field_z, 0, var5, param2 - (-var4 - param0), -3344);
        if (null != this.field_Pb) {
          this.field_Mb.field_R = 0;
        } else {
          this.field_Mb.field_R = this.field_R;
        }
        this.field_Mb.field_lb = this.field_lb;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, byte param7) {
        int var9;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param4 <= param2) {
          if (param2 < param6) {
            ld.a(-12628, param6, param2, param5, param3, param4, param0, oo.field_i, param1);
          } else {
            if (param4 < param6) {
              ld.a(-12628, param2, param6, param0, param3, param4, param5, oo.field_i, param1);
            } else {
              ld.a(-12628, param2, param4, param0, param5, param6, param3, oo.field_i, param1);
            }
          }
        } else {
          if (param4 < param6) {
            ld.a(-12628, param6, param4, param5, param0, param2, param3, oo.field_i, param1);
          } else {
            if (param6 > param2) {
              ld.a(-12628, param4, param6, param3, param0, param2, param5, oo.field_i, param1);
            } else {
              ld.a(-12628, param4, param2, param3, param5, param6, param0, oo.field_i, param1);
            }
          }
        }
        if (param7 > 30) {
          return;
        }
        mo.a(-113, 39, -55, 5, -113, 4, -124, (byte) 78);
    }

    mo(long param0, cj param1, cj param2, cj param3, ja param4, String param5) {
        super(param0, param1);
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        try {
          if (param4 != null) {
            this.field_Pb = new cj(0L, param2);
            this.field_Pb.field_rb = param4;
            this.a((byte) 50, this.field_Pb);
          }
          if (param5 != null) {
            this.field_Mb = new cj(0L, param3, param5);
            this.a((byte) 50, this.field_Mb);
            this.f(-128);
          } else {
            this.f(-128);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("mo.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param5 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    static {
        field_Lb = new ao(10, 2, 2, 0);
        field_Kb = 22;
        field_Nb = "Your email address is used to identify this account";
        field_Fb = new th();
        field_Jb = new hh(1);
    }
}
