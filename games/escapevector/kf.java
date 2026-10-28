/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf extends ah {
    static PcmSample field_p;
    private boolean field_n;
    static ee field_q;
    private String field_s;
    static int[] field_o;
    static PacketBuffer field_r;

    kf(ul param0) {
        super(param0);
        this.field_n = false;
    }

    final void g(int param0) {
        this.field_s = null;
        if (param0 != 22186) {
          String var3 = (String) null;
          this.a((byte) -126, (String) null);
        }
    }

    final rf a(int param0, String param1) {
        rf stackIn_17_0 = null;
        String stackIn_21_2 = null;
        try {
          CharSequence var4 = (CharSequence) ((Object) param1);
          if (!tg.a(87, var4)) {
            rf stackIn_3_0 = ArchiveProvider.field_a;
            return stackIn_3_0;
          }
          if (param0 != -1) {
            field_p = (PcmSample) null;
          }
          if (!param1.equals(this.field_s)) {
            lm var3 = of.a(122, param1);
            if (var3 != null &&
              null == var3.field_f) {
              this.field_n = var3.field_a;
              this.field_s = param1;
            } else {
              rf stackIn_12_0 = ug.field_c;
              return stackIn_12_0;
            }
          }
          if (!this.field_n) {
            stackIn_17_0 = ArchiveProvider.field_a;
          } else {
            stackIn_17_0 = IsaacRandom.field_h;
          }
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_20_0 = var3_ref;
          StringBuilder stackIn_20_1 = new StringBuilder().append("kf.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (param1 == 0) {
          return param2;
        }
        if (param1 == 1) {
          return param2;
        }
        if (param1 == 2) {
          return 100 * param2;
        }
        if (param0 <= 5) {
          return 107;
        }
        if (param1 != 3) {
          return param2;
        }
        return param2 * 100;
    }

    final static om a(byte param0, int param1) {
        int var5 = EscapeVector.obfuscationControl;
        om[] var6 = vh.e(-91);
        om[] var2 = var6;
        int var3 = 2 % ((3 - param0) / 49);
        for (int var4 = 0; var6.length > var4; var4++) {
          if (param1 == var6[var4].field_f) {
            return var6[var4];
          }
        }
        return null;
    }

    final String a(byte param0, String param1) {
        String stackIn_19_2 = null;
        try {
          CharSequence var6 = (CharSequence) ((Object) param1);
          String var3 = ok.a(0, var6);
          int var4 = 4 / ((param0 - 10) / 51);
          if (var3 != null) {
            String stackIn_2_0 = var3;
            return stackIn_2_0;
          }
          if (!param1.equals(this.field_s)) {
            lm var5 = of.a(122, param1);
            if (var5 == null) {
              return null;
            }
            if (var5.field_f != null) {
              Object stackIn_9_0 = null;
              return (String) (stackIn_9_0);
            }
            this.field_n = var5.field_a;
            this.field_s = param1;
          }
          if (this.field_n) {
            String stackIn_15_0 = fd.field_b;
            return stackIn_15_0;
          }
          String stackIn_13_0 = RasterBuffer.field_b;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_18_0 = var3_ref;
          StringBuilder stackIn_18_1 = new StringBuilder().append("kf.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public static void c(byte param0) {
        field_q = null;
        field_r = null;
        if (param0 == 0) {
          field_p = null;
          field_o = null;
          return;
        }
        field_q = (ee) null;
        field_p = null;
        field_o = null;
    }

    static {
        field_o = new int[4];
        field_q = new ee("email");
    }
}
