/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok extends sna {
    sna field_wb;
    static String field_Cb;
    static int field_vb;
    static byte[][] field_zb;
    sna field_yb;
    static int field_Bb;
    sga field_xb;
    sna field_Ab;

    final static boolean a(CharSequence param0, char param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!io.a(true, param1)) {
            return false;
          }
          if (param0 == null) {
            return false;
          }
          var3_int = param0.length();
          if (param2 != -19) {
            return false;
          }
          if (12 <= var3_int) {
            return false;
          }
          if (!mp.a(true, param1)) {
            return true;
          }
          if (var3_int != 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("ok.DA(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static sna f(byte param0) {
        if (param0 != -15) {
          return (sna) null;
        }
        return p.field_n.field_vb;
    }

    ok(long param0, ok param1, String param2, String param3) {
        this(param0, param1, param1.field_xb.field_wb, param1.field_xb.field_xb, param1.field_Ab, param2, param3);
    }

    ok(long param0, sna param1, sna param2, cw param3, sna param4, String param5, String param6) {
        super(param0, param1);
        try {
          this.field_wb = new sna(0L, (sna) null);
          this.field_xb = new sga(0L, this.field_wb, param2, param3);
          this.field_Ab = new sna(0L, param4);
          this.field_yb = new sna(0L, param4);
          this.field_Ab.field_Z = param5;
          this.field_yb.field_Z = param6;
          this.a(-1, this.field_xb);
          this.a(-1, this.field_Ab);
          this.a(-1, this.field_yb);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "ok.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static int c(int param0, int param1) {
        be var2 = mg.a((byte) -126, param0);
        if (var2 == null) {
          return 0;
        }
        if (param1 == -26684) {
          return vla.a(-64, var2);
        }
        CharSequence var3 = (CharSequence) null;
        ok.a((CharSequence) null, 'H', (byte) -6);
        return vla.a(-64, var2);
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = (param3 + this.field_sb) / 2;
        int var6 = this.field_p - param2;
        this.field_xb.a((byte) -58, -param3 + var6, 0, 0, this.field_sb, param1, param3);
        this.field_Ab.field_p = param2;
        this.field_Ab.field_sb = var5 - param3;
        this.field_Ab.field_rb = var6;
        this.field_Ab.field_kb = 0;
        this.field_yb.field_kb = var5;
        this.field_yb.field_p = param2;
        this.field_yb.field_rb = var6;
        if (param0 < -111) {
          this.field_yb.field_sb = -var5 + this.field_sb;
          return;
        }
        ok.a(-29, false, 23, -1, 94, -81, 85, -77, -85, -41);
        this.field_yb.field_sb = -var5 + this.field_sb;
    }

    public static void f(int param0) {
        field_Cb = null;
        if (param0 != 7576) {
          ok.c(53, 83);
          field_zb = (byte[][]) null;
          return;
        }
        field_zb = (byte[][]) null;
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        if (param1) {
          return;
        }
        if (eo.field_l > param4) {
          vba.a(param4, param5, param6, param0, param9, param7, param8, -128, param2, param3);
          return;
        }
        if (pw.field_x < param4) {
          vba.a(param4, param5, param6, param0, param9, param7, param8, -128, param2, param3);
          return;
        }
        if (param5 < eo.field_l) {
          vba.a(param4, param5, param6, param0, param9, param7, param8, -128, param2, param3);
          return;
        }
        if (param5 > pw.field_x) {
          vba.a(param4, param5, param6, param0, param9, param7, param8, -128, param2, param3);
          return;
        }
        if (param6 < eo.field_l) {
          vba.a(param4, param5, param6, param0, param9, param7, param8, -128, param2, param3);
          return;
        }
        if (pw.field_x < param6) {
          vba.a(param4, param5, param6, param0, param9, param7, param8, -128, param2, param3);
          return;
        }
        if (param8 < eo.field_l) {
          vba.a(param4, param5, param6, param0, param9, param7, param8, -128, param2, param3);
          return;
        }
        if (pw.field_x < param8) {
          vba.a(param4, param5, param6, param0, param9, param7, param8, -128, param2, param3);
          return;
        }
        if (an.field_q > param0) {
          vba.a(param4, param5, param6, param0, param9, param7, param8, -128, param2, param3);
          return;
        }
        if (param0 > ha.field_n) {
          vba.a(param4, param5, param6, param0, param9, param7, param8, -128, param2, param3);
          return;
        }
        if (an.field_q > param3) {
          vba.a(param4, param5, param6, param0, param9, param7, param8, -128, param2, param3);
          return;
        }
        if (ha.field_n < param3) {
          vba.a(param4, param5, param6, param0, param9, param7, param8, -128, param2, param3);
          return;
        }
        if (param7 < an.field_q) {
          vba.a(param4, param5, param6, param0, param9, param7, param8, -128, param2, param3);
          return;
        }
        if (param7 > ha.field_n) {
          vba.a(param4, param5, param6, param0, param9, param7, param8, -128, param2, param3);
          return;
        }
        if (an.field_q > param2) {
          vba.a(param4, param5, param6, param0, param9, param7, param8, -128, param2, param3);
          return;
        }
        if (ha.field_n < param2) {
          vba.a(param4, param5, param6, param0, param9, param7, param8, -128, param2, param3);
          return;
        }
        oda.a(param2, param5, param7, param0, 123, param4, param6, param3, param9, param8);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.field_rb = param1;
        this.field_sb = param0;
        this.field_kb = param4;
        this.field_p = param5;
        this.a((byte) -126, param7, param6, param3);
        if (param2 <= 78) {
          field_Bb = 33;
        }
    }

    static {
        field_zb = new byte[50][];
        field_Cb = "Connection lost. <%0>";
    }
}
