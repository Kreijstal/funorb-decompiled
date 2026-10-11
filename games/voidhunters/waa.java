/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class waa extends dqa implements jpb, oo {
    rcb field_v;
    private tga field_A;
    static String field_y;
    static String[] field_w;
    static String field_x;
    static String[] field_D;
    private htb field_z;
    private htb field_C;

    private final int a(int param0, int param1, String param2, String param3, int param4, shb param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 35) {
            field_D = (String[]) null;
          }
          stackIn_3_0 = this.a(param1, 35, param2, param5, param3, 126, param4);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("waa.L(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public final void a(int param0, int param1, int param2, htb param3, int param4) {
        boolean discarded$1 = false;
        RuntimeException var6 = null;
        lca var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 11) {
            var7 = (lca) null;
            discarded$1 = this.a((lca) null, (byte) 100);
          }
          if (param3 == this.field_C) {
            ot.a(-116);
            return;
          }
          if (this.field_z != param3) {
            return;
          }
          this.e(25);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("waa.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, shb param2, char param3) {
        RuntimeException var5 = null;
        boolean stackIn_8_0 = false;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -15834) {
            field_D = (String[]) null;
          }
          if (super.a(param0 ^ 0, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_8_0 = this.a(param2, 0);
            return stackIn_8_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_12_0 = this.a(true, param2);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("waa.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    public waa() {
        super(0, 0, 496, 0, (wwa) null);
        this.field_A = new tga("", (sba) null, 12);
        bob var1 = new bob(web.field_o, 0, 0, 0, 0, 16777215, -1, 3, 0, loa.field_o.field_k, -1, 2147483647, true);
        shb var2 = new shb(field_y, var1, (sba) null);
        this.field_z = new htb(tia.field_K, (sba) null);
        this.field_C = new htb(fqb.field_p, (sba) null);
        this.field_A.field_p = gna.field_m;
        this.field_A.a(6614, new tib(this.field_A));
        this.field_z.field_x = false;
        this.field_z.field_q = (wwa) ((Object) new vva());
        this.field_C.field_q = (wwa) ((Object) new meb());
        this.field_A.field_q = (wwa) ((Object) new io(10000536));
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(20, 270, 50, 1, var3);
        this.b(-18756, var2);
        var3 += 50;
        var3 = var3 + (5 + this.a(35, var3, ffb.field_c, tj.field_r, 170, this.field_A));
        this.field_z.a(-var5 + 496 >> 1, var5, 40, 1, var3);
        this.field_C.a(var4 + 3, 60, 40, 1, 15 + var3);
        this.field_C.field_l = (sba) (this);
        this.field_z.field_l = (sba) (this);
        this.b(-18756, this.field_z);
        this.b(-18756, this.field_C);
        this.field_v = new rcb((jpb) (this));
        this.field_v.a(60 + (this.field_A.field_g + this.field_A.field_h), -60 - this.field_A.field_g + (this.field_h - this.field_A.field_h), 150, 1, 20);
        this.b(-18756, this.field_v);
        this.a(0, 496, var4 + var3 + 55, 1, 0);
    }

    final void a(int param0, int param1, int param2, shb param3) {
        try {
          super.a(param0, param1, param2, param3);
          this.field_z.field_x = this.d(-31927);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "waa.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean d(int param0) {
        if (param0 == -31927) {
          return this.a((lca) (this.field_A), (byte) -92) ? true : false;
        }
        field_y = (String) null;
        if (!this.a((lca) (this.field_A), (byte) -92)) {
          return false;
        }
        return true;
    }

    private final boolean a(lca param0, byte param1) {
        eeb var3 = null;
        RuntimeException var3_ref = null;
        qrb var4 = null;
        shb var5 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param0.a(-782444220);
          if (var3 == null) {
            return true;
          }
          if (param1 != -92) {
            var5 = (shb) null;
            this.a(-39, -53, -80, (shb) null);
          }
          var4 = var3.a((byte) 35);
          stackIn_9_0 = (var4 == lea.field_o);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("waa.I(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int a(int param0, int param1, String param2, shb param3, String param4, int param5, int param6) {
        RuntimeException var8 = null;
        gm var9 = null;
        sca var10 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var10 = new sca(20, param0, 120 + param6, 25, param3, false, 120, 3, loa.field_o, 16777215, param2);
          this.b(-18756, var10);
          var9 = new gm(((lca) ((Object) param3)).a(-782444220), param4, param5, param0 + var10.field_f, 25 + param6, param1);
          var9.field_l = (sba) (this);
          this.b(-18756, var9);
          stackIn_1_0 = var10.field_f + var9.field_f;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_4_0 = var8;
          stackIn_4_1 = new StringBuilder().append("waa.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static sd a(asb param0, byte param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        byte[] var5 = null;
        sd stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = param0.c((byte) 9, param2);
          var3 = var5;
          if (var5 == null) {
            return null;
          }
          var4 = -102 % ((param1 - 24) / 60);
          stackIn_4_0 = new sd(var5);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("waa.K(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void i(byte param0) {
        field_D = null;
        int var1 = -52 % ((6 - param0) / 55);
        field_x = null;
        field_w = null;
        field_y = null;
    }

    final static void a(ml param0, int param1) {
        ml var4 = null;
        ml var5 = null;
        try {
          param0.a(1, 15, new ml(15));
          param0.a(param1 ^ 18633, 14, new ml(15));
          if (param1 != 18632) {
            asb var3 = (asb) null;
            waa.a((asb) null, (byte) -43, -58);
          }
          param0.a(param1 - 18631, 5, new ml(13));
          param0.a(1, 6, new ml(13));
          param0.a(1, 7, new ml(13));
          param0.a(1, 8, new ml(13));
          param0.a(1, 0, new ml(13));
          param0.a(1, 13, new ml(13));
          param0.a(param1 ^ 18633, 4, new ml(13));
          param0.a(1, 9, new ml(13));
          var4 = new ml(34);
          var4.a(1, 3, new ml(15));
          param0.a(param1 - 18631, 11, var4);
          var5 = new ml(34);
          var5.a(1, 1, new ml(15));
          param0.a(param1 ^ 18633, 2, var5);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "waa.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(int param0) {
        int discarded$0 = 0;
        ((tib) (this.field_A.a(-782444220))).d((byte) 127);
        if (param0 != 1546) {
          shb var3 = (shb) null;
          discarded$0 = this.a(25, 1, (String) null, (String) null, 83, (shb) null);
        }
    }

    private final void e(int param0) {
        int var2 = 71 / ((78 - param0) / 41);
        if (this.d(-31927)) {
          lr.a(this.field_A.field_j, -127);
          return;
        }
    }

    public final void a(byte param0, String param1) {
        int discarded$1 = 0;
        tga var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        String var5 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_A;
          var4 = param1;
          ((uf) ((Object) var3)).a(false, 0, var4);
          if (param0 == 41) {
            return;
          }
          var5 = (String) null;
          discarded$1 = this.a(37, 125, (String) null, (shb) null, (String) null, 67, -21);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("waa.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    static {
        field_w = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_y = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_D = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
