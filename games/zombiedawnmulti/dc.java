/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc extends cj {
    static long[] field_Ib;
    static int field_Hb;
    int field_Kb;
    private cj field_Mb;
    private cj[] field_Nb;
    private cj[] field_Jb;
    static int field_Fb;
    static th field_Gb;
    static fm field_Lb;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.field_x = param1;
        if (param0 != 9736) {
          return;
        }
        this.field_z = param5;
        this.field_Q = param6;
        this.field_zb = param2;
        this.a(param3, param4, (byte) 119);
    }

    public static void c(byte param0) {
        field_Lb = null;
        int var1 = -12 / ((8 - param0) / 54);
        field_Ib = null;
        field_Gb = null;
    }

    dc(long param0, cj param1, String[] param2, cj param3, cj[] param4, int param5) {
        super(param0, (cj) null);
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        cj var9 = null;
        int var11 = 0;
        int var8_intLifetime1;
        try {
          this.field_Nb = new cj[param2.length];
          this.field_Mb = new cj(0L, param3);
          this.field_Jb = param4;
          for (var8_int = 0; var8_int < param2.length; var8_int++) {
            var9 = new cj(0L, param1);
            var9.field_wb = param2[var8_int];
            this.field_Nb[var8_int] = var9;
            this.a((byte) 50, var9);
          }
          this.a((byte) 50, this.field_Mb);
          var11 = 0;
          var8_intLifetime1 = var11;
          while (var11 < param4.length) {
            this.field_Mb.a((byte) 50, param4[var11]);
            var11++;
          }
          this.field_Kb = param5;
          this.field_Nb[param5].field_Ab = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_11_0 = var8;
          stackIn_11_1 = new StringBuilder().append("dc.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param5).append(')').toString());
        }
    }

    private final void a(int param0, int param1, byte param2) {
        cj dupTemp$0 = null;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var4Lifetime1;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        for (var4 = 0; this.field_Nb.length > var4; var4++) {
          var5 = var4 * this.field_zb / this.field_Nb.length;
          var6 = (var4 + 1) * this.field_zb / this.field_Nb.length;
          this.field_Nb[var4].field_x = var5;
          this.field_Nb[var4].field_Q = 0;
          this.field_Nb[var4].field_zb = -var5 + var6;
          this.field_Nb[var4].field_z = param1;
        }
        if (param2 < 72) {
          this.a(-74, 39, -109, 35, 100, -8, 71);
        }
        this.field_Mb.a(this.field_z - param1, param1, this.field_zb, 0, -3344);
        var8 = 0;
        var4Lifetime1 = var8;
        while (this.field_Jb.length > var8) {
          this.field_Jb[var8].a(-(param0 * 2) + this.field_Mb.field_z, param0, this.field_Mb.field_zb - 2 * param0, param0, -3344);
          if (this.field_Kb != var8) {
            dupTemp$0 = this.field_Jb[var8];
            dupTemp$0.field_x = dupTemp$0.field_x + 10000;
          }
          var8++;
        }
    }

    final static void a(long param0, java.applet.Applet param1, String param2, int param3, String param4) {
        try {
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var6 = null;
          RuntimeException var6_ref = null;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var7Lifetime1;
          String var7Lifetime2;
          String var7Lifetime3;
          String var7Lifetime4;
          try {
            try {
              var8 = param1.getParameter("cookiehost");
              var7 = var8;
              var7Lifetime1 = var8;
              var9 = param2 + "=" + param4 + "; version=1; path=/; domain=" + var8;
              var7Lifetime2 = var9;
              var7Lifetime3 = var9;
              if (0L > param0) {
                var7Lifetime4 = var9 + "; Discard;";
              } else {
                var7Lifetime4 = var9 + "; Expires=" + ke.a(-29971, bl.a((byte) 101) + 1000L * param0) + "; Max-Age=" + param0;
              }
              if (param3 >= -91) {
                return;
              }
              fo.a(param1, 14575, "document.cookie=\"" + var7Lifetime4 + "\"");
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var6_ref;
            stackIn_11_1 = new StringBuilder().append("dc.EA(").append(param0).append(',');
            if (param1 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
            if (param2 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw fa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void h(int param0) {
        int var2 = 0;
        cj dupTemp$0 = null;
        cj dupTemp$1 = null;
        int var3;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 >= -26) {
          return;
        }
        for (var2 = 0; this.field_Nb.length > var2; var2++) {
          if (var2 != this.field_Kb &&
            0 != this.field_Nb[var2].field_T) {
            this.field_Nb[this.field_Kb].field_Ab = false;
            dupTemp$0 = this.field_Jb[this.field_Kb];
            dupTemp$0.field_x = dupTemp$0.field_x + 10000;
            this.field_Kb = var2;
            this.field_Nb[var2].field_Ab = true;
            dupTemp$1 = this.field_Jb[var2];
            dupTemp$1.field_x = dupTemp$1.field_x - 10000;
          }
        }
    }

    static {
        field_Ib = new long[32];
        field_Gb = new th();
    }
}
