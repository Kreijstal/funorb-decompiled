/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj extends oa {
    private ug field_p;
    private int field_n;
    static String field_o;

    final static void a(java.awt.Component param0, int param1) {
        try {
          if (param1 != -2) {
            hj.m(75);
          }
          param0.setFocusTraversalKeysEnabled(false);
          param0.addKeyListener(el.field_n);
          param0.addFocusListener(el.field_n);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "hj.AB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          for (var5_int = 0; var5_int < param1; var5_int++) {
            fieldTemp$0 = this.field_h;
            this.field_h = this.field_h + 1;
            param0[param2 + var5_int] = (byte)(this.field_g[fieldTemp$0] - this.field_p.a(-88));
          }
          if (param3 != 18570) {
            field_o = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("hj.QA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    hj(byte[] param0) {
        super(param0);
    }

    hj(int param0) {
        super(param0);
    }

    final int l(int param0) {
        if (param0 != -12135) {
          return 41;
        }
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        return 255 & this.field_g[fieldTemp$0] - this.field_p.a(-108);
    }

    final static String a(byte param0, CharSequence param1) {
        int var6 = 0;
        StringBuilder discarded$0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ci var10 = null;
        var9 = Transmogrify.field_A ? 1 : 0;
        try {
          if (param1 == null) {
            return null;
          }
          var2_int = 0;
          var3 = param1.length();
          while (var3 > var2_int) {
            if (uf.a(param1.charAt(var2_int), (byte) -108)) {
              var2_int++;
              continue;
            }
            break;
          }
          while (var2_int < var3) {
            if (uf.a(param1.charAt(var3 - 1), (byte) -56)) {
              var3--;
              continue;
            }
            break;
          }
          var4 = var3 - var2_int;
          if (var4 < 1) {
            return null;
          }
          if (var4 > 12) {
            return null;
          }
          var5 = new StringBuilder(var4);
          for (var6 = var2_int; var3 > var6; var6++) {
            var7 = param1.charAt(var6);
            if (ci.a((char) var7, 0)) {
              var8 = jk.a((char) var7, false);
              if (0 != var8) {
                discarded$0 = var5.append((char) var8);
              }
            }
          }
          if (param0 > -124) {
            var10 = (ci) null;
            hj.a((ci) null, (byte) 75, -121, -92);
          }
          if (var5.length() != 0) {
            return var5.toString();
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_32_0 = var2;
          stackIn_32_1 = new StringBuilder().append("hj.WA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    final static ii[] a(ci param0, byte param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        ii[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -62) {
            hj.m(-31);
          }
          if (rl.a(param2, 0, param3, param0)) {
            stackIn_6_0 = pd.a((byte) 113);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (ii[]) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("hj.SA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(byte param0, int[] param1) {
        try {
          int var3_int = 113 % ((-12 - param0) / 36);
          this.field_p = new ug(param1);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "hj.TA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, int param1) {
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$0] = (byte)(this.field_p.a(-50) + param1);
        if (param0) {
          field_o = (String) null;
        }
    }

    final void n(int param0) {
        if (param0 != 0) {
          return;
        }
        this.field_h = (7 + this.field_n) / 8;
    }

    final int k(int param0, int param1) {
        int incrementValue$0 = 0;
        int var6 = Transmogrify.field_A ? 1 : 0;
        int var3 = this.field_n >> 3;
        int var4 = -(this.field_n & 7) + 8;
        this.field_n = this.field_n + param0;
        int var5 = 0;
        while (param0 > var4) {
          incrementValue$0 = var3;
          var3++;
          var5 = var5 + ((this.field_g[incrementValue$0] & kb.field_m[var4]) << -var4 + param0);
          param0 = param0 - var4;
          var4 = 8;
        }
        if (param0 != var4) {
          var5 = var5 + (this.field_g[var3] >> -param0 + var4 & kb.field_m[param0]);
        } else {
          var5 = var5 + (kb.field_m[var4] & this.field_g[var3]);
        }
        if (param1 != 1522829539) {
          this.h((byte) -80);
        }
        return var5;
    }

    public static void m(int param0) {
        field_o = null;
        if (param0 != 255) {
          field_o = (String) null;
        }
    }

    final void h(byte param0) {
        this.field_n = 8 * this.field_h;
        if (param0 < 53) {
          this.field_n = 54;
        }
    }

    static {
        field_o = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
