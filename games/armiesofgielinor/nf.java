/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf extends je {
    static je field_Kb;
    static me field_Ib;
    static String field_Jb;
    private je field_Lb;
    static int field_Mb;
    je field_Ob;
    static String field_Pb;
    static kl field_Nb;

    private final void a(byte param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        var4 = -param1;
        var5 = -param1;
        if (null != this.field_Lb) {
          var4 = this.field_Lb.j(98);
        }
        if (this.field_Ob != null) {
          var5 = this.field_Ob.a(true, -var4 - param2 + this.field_gb - param1 - param2);
        }
        var6 = param2 + (var5 + param2) + var4 + param1;
        if (this.field_gb < var6) {
          var5 = var5 + (this.field_gb - var6);
          var6 = this.field_gb;
        }
        if (this.field_Eb == 1) {
          param2 = param2 + (this.field_gb - var6) / 2;
        }
        if (this.field_Eb == 2) {
          param2 = param2 + (this.field_gb - var6);
        }
        if (null != this.field_Lb) {
          this.field_Lb.a(this.field_ob, -20500, var4, 0, param2);
          this.field_Lb.field_Fb = this.field_Fb;
        }
        if (param0 != -81) {
          nf.k(94);
        }
        if (null != this.field_Ob) {
          this.field_Ob.a(this.field_ob, -20500, var5, 0, var4 + param2 + param1);
          this.field_Ob.field_Fb = this.field_Fb;
          if (this.field_Lb == null) {
            this.field_Ob.field_Eb = this.field_Eb;
          } else {
            this.field_Ob.field_Eb = 0;
          }
        }
    }

    final static int l(int param0) {
        if (param0 != 26136) {
          nf.l(77);
        }
        return kl.field_a.currentPosition[0];
    }

    public static void k(int param0) {
        field_Pb = null;
        field_Jb = null;
        field_Ib = null;
        field_Kb = null;
        if (param0 != 0) {
          field_Ib = (me) null;
        }
        field_Nb = null;
    }

    final int a(int param0, int param1, int param2) {
        int var4 = -param1;
        if (param0 > -32) {
          return 57;
        }
        int var5 = -param1;
        if (null != this.field_Lb) {
          var4 = this.field_Lb.j(125);
        }
        if (null != this.field_Ob) {
          var5 = this.field_Ob.j(102);
        }
        return param2 - (-var4 - param1 - var5) + param2;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param2 != -30061) {
          this.a(46, -50, -114, 23, 28, -56, -92);
        }
        this.a(param0, param2 + 9561, param3, param4, param5);
        this.a((byte) -81, param6, param1);
    }

    final static String a(boolean param0, String param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var5 = 0;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var2_int = param1.length();
          if (!param0) {
            field_Ib = (me) null;
          }
          var3 = new char[var2_int];
          for (var4 = 0; var4 < var2_int; var4++) {
            var3[-var4 + var2_int - 1] = param1.charAt(var4);
          }
          stackIn_7_0 = new String(var3);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("nf.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    nf(long param0, je param1, je param2, je param3, RgbSprite param4, String param5) {
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
            this.field_Lb = new je(0L, param2);
            this.field_Lb.field_cb = param4;
            this.a(this.field_Lb, 60);
          }
          if (param5 != null) {
            this.field_Ob = new je(0L, param3, param5);
            this.a(this.field_Ob, 41);
            this.i(-10027);
          } else {
            this.i(-10027);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("nf.<init>(").append(param0).append(',');
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
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static boolean a(ls param0, ls param1, int param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.field_b < param1.field_b) {
            return true;
          }
          if (param0.field_b == param1.field_b &&
            param0.field_a < param1.field_a) {
            return true;
          }
          if (param2 == 30549) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("nf.C(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_Jb = "Play free version";
        field_Ib = new me(13, 0, 1, 0);
        field_Pb = "Spells to affect the very ground itself.";
    }
}
