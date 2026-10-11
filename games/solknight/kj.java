/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class kj extends pj {
    static gj field_P;
    static ff field_J;
    static long field_I;
    private nc field_L;
    private li field_Q;
    static String field_K;
    static o field_S;
    static int field_R;
    private String[] field_M;
    static String field_N;
    static int field_O;

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        this.a((byte) -21);
    }

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
          java.net.URL var3 = null;
          String var4 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          try {
            try {
              var3 = new java.net.URL(param0.getCodeBase(), param2);
              if (param1 < 103) {
                var4 = (String) null;
                kj.a((String) null, (byte) -16);
              }
              var3 = kk.a(98, var3, param0);
              ke.a((byte) -98, param0, var3.toString(), true);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = (Exception) (Object) decompiledCaughtException;
              var3_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var3_ref2;
            stackIn_8_1 = new StringBuilder().append("kj.G(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            throw fc.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (!param0) {
          field_R = -105;
        }
        int var5 = param1 - this.field_m;
        int var6 = -this.field_j + param3;
        li var7 = this.a(var6, (byte) 22, var5);
        if (var7 != null &&
          null != this.field_n) {
          ((re) ((Object) this.field_n)).a(param2, var7.field_l, 50, this);
        }
    }

    final static boolean a(String param0, byte param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -7) {
            field_I = -117L;
          }
          var3 = (CharSequence) ((Object) param0);
          stackIn_3_0 = kf.field_D.equals(jg.a(var3, -2));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("kj.L(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    kj(String param0, j param1) {
        super(param0, (dg) null);
        this.field_Q = null;
        try {
          this.field_w = param1;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "kj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    boolean a(int param0, rc param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1463) {
            this.b(122, 127, -75, 58);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("kj.MA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (param1 != 0) {
          return;
        }
        eg var5 = (eg) ((Object) this.field_w);
        li var6 = this.field_Q;
        if (var6 == null) {
        } else {
          var7 = var5.a(param2, (rc) (this), 0);
          var8 = var5.a((rc) (this), false, param0);
          do {
            ci.a(2 + var6.field_m, -2 + var6.field_n + var8, 2 + var6.field_i, -2 + var6.field_o + var7, (byte) 123);
            var6 = var6.field_k;
          } while (var6 != null);
        }
    }

    final static String a(byte param0, Throwable param1) throws IOException {
        String var2;
        PrintWriter var4;
        String var5;
        BufferedReader var6;
        String var7;
        String var8;
        int var9;
        int var10;
        String var11;
        int var12;
        int var13;
        String var14;
        ve var15;
        StringWriter var16;
        String var17;
        String var18;
        String var19;
        String var20;
        String var2Lifetime1;
        String var2Lifetime2;
        String var2Lifetime3;
        String var11Lifetime1;
        String var11Lifetime2;
        String var11Lifetime3;
        String var2Lifetime3Lifetime1;
        String var2Lifetime3Lifetime2;
        String var2Lifetime3Lifetime3;
        String var2Lifetime3Lifetime4;
        String var2Lifetime3Lifetime5;
        String var2Lifetime3Lifetime6;
        String var2Lifetime3Lifetime7;
        String var2Lifetime3Lifetime8;
        String var2Lifetime3Lifetime9;
        String var2Lifetime3Lifetime10;
        String var2Lifetime3Lifetime11;
        String var2Lifetime3Lifetime12;
        String var11Lifetime3Lifetime1;
        var13 = SolKnight.field_L ? 1 : 0;
        if (param0 != 105) {
          var14 = (String) null;
          kj.a((java.applet.Applet) null, 117, (String) null);
        }
        if (param1 instanceof ve) {
          var15 = (ve) ((Object) param1);
          param1 = var15.field_c;
          var2 = var15.field_d + " | ";
          var11 = var2;
        } else {
          var2 = "";
        }
        var16 = new StringWriter();
        var4 = new PrintWriter((Writer) ((Object) var16));
        param1.printStackTrace(var4);
        var4.close();
        var5 = var16.toString();
        var2Lifetime1 = var5;
        var11Lifetime1 = var5;
        var6 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
        var7 = var6.readLine();
        var2Lifetime2 = var7;
        var11Lifetime2 = var7;
        while (true) {
          var8 = var6.readLine();
          var2Lifetime3 = var8;
          var11Lifetime3 = var8;
          var2Lifetime3Lifetime1 = var11Lifetime3;
          if (var8 == null) {
            var2Lifetime3Lifetime2 = var11Lifetime3;
            var11Lifetime3 = var2Lifetime3Lifetime2;
            var2Lifetime3Lifetime2 = var11Lifetime3;
            var2Lifetime3Lifetime2 = var2Lifetime3Lifetime2 + "| " + var7;
            return var2Lifetime3Lifetime2;
          }
          var9 = var8.indexOf('(');
          var10 = var8.indexOf(')', 1 + var9);
          if (var9 != -1) {
            var11Lifetime3Lifetime1 = var8.substring(0, var9);
            var2Lifetime3Lifetime3 = var11Lifetime3Lifetime1;
            var2Lifetime3Lifetime3 = var11Lifetime3Lifetime1;
          } else {
            var11Lifetime3Lifetime1 = var8;
          }
          var17 = var11Lifetime3Lifetime1.trim();
          var2Lifetime3Lifetime4 = var17;
          var2Lifetime3Lifetime5 = var17;
          var18 = var17.substring(1 + var17.lastIndexOf(' '));
          var2Lifetime3Lifetime6 = var18;
          var2Lifetime3Lifetime7 = var18;
          var19 = var18.substring(var18.lastIndexOf('\t') + 1);
          var2Lifetime3Lifetime8 = var19;
          var2Lifetime3Lifetime9 = var19;
          var20 = var2Lifetime3Lifetime9 + var19;
          var2Lifetime3Lifetime10 = var20;
          var2Lifetime3Lifetime11 = var20;
          var2Lifetime3Lifetime12 = var20;
          if (var9 != -1) {
            if (var10 == -1) {
              var2Lifetime3Lifetime12 = var2Lifetime3Lifetime12 + ' ';
              continue;
            }
            var12 = var8.indexOf(".java:", var9);
            if (var12 >= 0) {
              var2Lifetime3Lifetime12 = var20 + var8.substring(var12 + 5, var10);
            }
          }
          var2Lifetime3Lifetime12 = var2Lifetime3Lifetime12 + ' ';
        }
    }

    final void a(int param0, String param1, int param2) {
        String[] var8 = null;
        String[] var9 = null;
        int var5 = 0;
        int var6 = SolKnight.field_L ? 1 : 0;
        try {
          if (null == this.field_M ||
            param0 >= this.field_M.length) {
            var8 = new String[param0 + 1];
            var9 = var8;
            String[] var4 = var9;
            if (this.field_M != null) {
              for (var5 = 0; this.field_M.length > var5; var5++) {
                var8[var5] = this.field_M[var5];
              }
            }
            this.field_M = var9;
          }
          if (param2 != 1) {
            String var7 = (String) null;
            kj.a((java.applet.Applet) null, -17, (String) null);
          }
          this.field_M[param0] = param1;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "kj.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_N = null;
        field_K = null;
        if (param0 != 2) {
          String var2 = (String) null;
          kj.a((java.applet.Applet) null, 14, (String) null);
        }
        field_J = null;
        field_P = null;
        field_S = null;
    }

    final void a(byte param0) {
        int var11 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int var2;
        eg var3;
        jf var4;
        int var5;
        String var6;
        int var7;
        int var8;
        int var9;
        Object var10;
        le var12;
        int var13;
        int var14;
        li var15;
        int var16;
        int var7Lifetime1;
        var16 = SolKnight.field_L ? 1 : 0;
        this.field_L = new nc();
        var2 = 0;
        var3 = (eg) ((Object) this.field_w);
        var4 = var3.a(-21480, (rc) (this));
        while (true) {
          var5 = this.field_i.indexOf("<hotspot=", var2);
          if (var5 == -1) {
            if (param0 != -21) {
              field_O = -95;
            }
            return;
          }
          var7 = this.field_i.indexOf(">", var5);
          var6 = this.field_i.substring(var5 + 9, var7);
          var7Lifetime1 = Integer.parseInt(var6);
          var2 = this.field_i.indexOf("</hotspot>", var5);
          var8 = var4.a((byte) -121, var5);
          var9 = var4.a((byte) -115, var2);
          var10 = null;
          for (var11 = var8; var11 <= var9; var11++) {
            var12 = var4.field_c[var11];
            if (var8 != var11) {
              stackIn_7_0 = var12.field_c[0];
            } else {
              stackIn_7_0 = var4.a(0, var5);
            }
            var13 = stackIn_7_0;
            if (var11 == var9) {
              stackIn_12_0 = var4.a(0, var2);
            } else {
              if (var12 == null) {
                stackIn_12_0 = 0;
              } else {
                stackIn_12_0 = var12.field_c[-1 + var12.field_c.length];
              }
            }
            var14 = stackIn_12_0;
            var15 = new li(var7Lifetime1, var13, var12.field_g, -var13 + var14, Math.max(var3.a(3), -var12.field_g + var12.field_e));
            if (var10 != null) {
              ((li) (var10)).field_k = var15;
            }
            this.field_L.a(var15, -7044);
            var10 = var15;
          }
        }
    }

    String c(byte param0) {
        if (null == this.field_Q) {
          return null;
        }
        if (this.field_M == null) {
          return null;
        }
        if (param0 < 14) {
          return (String) null;
        }
        if (this.field_M.length <= this.field_Q.field_l) {
          return null;
        }
        return this.field_M[this.field_Q.field_l];
    }

    void a(int param0, int param1, int param2, rc param3) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param1 != 18874) {
            return;
          }
          super.a(param0, param1 ^ 0, param2, param3);
          this.field_Q = null;
          if (this.field_v) {
            var5_int = -param0 + (gb.field_j - this.field_m);
            var6 = -this.field_j + (ad.field_m - param2);
            this.field_Q = this.a(var6, (byte) 22, var5_int);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("kj.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final li a(int param0, byte param1, int param2) {
        li var4;
        li var5;
        int var6;
        var6 = SolKnight.field_L ? 1 : 0;
        var4 = (li) (this.field_L.a((byte) 51));
        if (param1 != 22) {
          return (li) null;
        }
        while (var4 != null) {
          var5 = var4;
          while (var5 != null) {
            if (param2 >= var5.field_o &&
              param0 >= var5.field_n &&
              var5.field_m + var5.field_o > param2 &&
              var5.field_n + var5.field_i >= param0) {
              return var4;
            }
            var5 = var5.field_k;
          }
          var4 = (li) (this.field_L.b(-58));
        }
        return null;
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (param2 != 1) {
          return;
        }
        this.b(((eg) ((Object) this.field_w)).a((rc) (this), 6), param3, param0, 0, param1);
    }

    static {
        field_K = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_N = "Unpacking graphics";
        field_J = new ff(10, 2, 2, 0);
    }
}
