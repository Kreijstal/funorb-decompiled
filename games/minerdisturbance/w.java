/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class w extends tn {
    static me field_W;
    private int field_O;
    private ea field_Q;
    static String field_T;
    static String field_X;
    static String[] field_P;
    private String field_U;
    private jm field_V;
    static int[] field_R;
    static int field_S;

    final static String a(Throwable param0, byte param1) throws IOException {
        String var2;
        PrintWriter var4;
        String var5;
        int var6;
        BufferedReader var7;
        String var8;
        String var9;
        int var10;
        int var11;
        String var12;
        int var14;
        db var15;
        StringWriter var16;
        String var17;
        String var18;
        String var19;
        String var20;
        int var13;
        String var2Lifetime1;
        String var2Lifetime2;
        String var2Lifetime3;
        String var12Lifetime1;
        String var12Lifetime2;
        String var12Lifetime3;
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
        String var12Lifetime3Lifetime1;
        var14 = MinerDisturbance.field_ab;
        if (!(param0 instanceof db)) {
          var2 = "";
          var12 = var2;
        } else {
          var15 = (db) ((Object) param0);
          var2 = var15.field_a + " | ";
          param0 = var15.field_c;
        }
        var16 = new StringWriter();
        var4 = new PrintWriter((Writer) ((Object) var16));
        param0.printStackTrace(var4);
        var6 = -10 % ((16 - param1) / 41);
        var4.close();
        var5 = var16.toString();
        var2Lifetime1 = var5;
        var12Lifetime1 = var5;
        var7 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
        var8 = var7.readLine();
        var2Lifetime2 = var8;
        var12Lifetime2 = var8;
        while (true) {
          var9 = var7.readLine();
          var2Lifetime3 = var9;
          var12Lifetime3 = var9;
          var2Lifetime3Lifetime1 = var12Lifetime3;
          if (var9 == null) {
            var2Lifetime3Lifetime2 = var12Lifetime3;
            var12Lifetime3 = var2Lifetime3Lifetime2;
            var2Lifetime3Lifetime2 = var12Lifetime3;
            var2Lifetime3Lifetime2 = var2Lifetime3Lifetime2 + "| " + var8;
            return var2Lifetime3Lifetime2;
          }
          var10 = var9.indexOf('(');
          var11 = var9.indexOf(')', var10 + 1);
          if (var10 != -1) {
            var12Lifetime3Lifetime1 = var9.substring(0, var10);
            var2Lifetime3Lifetime3 = var12Lifetime3Lifetime1;
            var2Lifetime3Lifetime3 = var12Lifetime3Lifetime1;
          } else {
            var12Lifetime3Lifetime1 = var9;
          }
          var17 = var12Lifetime3Lifetime1.trim();
          var2Lifetime3Lifetime4 = var17;
          var2Lifetime3Lifetime5 = var17;
          var18 = var17.substring(var17.lastIndexOf(' ') + 1);
          var2Lifetime3Lifetime6 = var18;
          var2Lifetime3Lifetime7 = var18;
          var19 = var18.substring(var18.lastIndexOf('\t') + 1);
          var2Lifetime3Lifetime8 = var19;
          var2Lifetime3Lifetime9 = var19;
          var20 = var2Lifetime3Lifetime9 + var19;
          var2Lifetime3Lifetime10 = var20;
          var2Lifetime3Lifetime11 = var20;
          var2Lifetime3Lifetime12 = var20;
          if (-1 != var10) {
            if (var11 == -1) {
              var2Lifetime3Lifetime12 = var2Lifetime3Lifetime12 + ' ';
              continue;
            }
            var13 = var9.indexOf(".java:", var10);
            if (var13 >= 0) {
              var2Lifetime3Lifetime12 = var20 + var9.substring(5 + var13, var11);
            }
          }
          var2Lifetime3Lifetime12 = var2Lifetime3Lifetime12 + ' ';
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        ag var6;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        ea var16;
        String var17;
        Object var18;
        cf var18_ref;
        ea var19;
        ea var20;
        ea var21;
        String var22;
        Object var23;
        cf var23_ref;
        ea var24;
        ea var25;
        ea var26;
        String var27;
        Object var28;
        cf var28_ref;
        ea var29;
        ea var30;
        ea var31;
        String var32;
        Object var33;
        cf var33_ref;
        ea var34;
        ea var35;
        ea var36;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        ag var6Lifetime1;
        ag var6Lifetime2;
        var18 = null;
        var23 = null;
        var28 = null;
        var33 = null;
        var13 = MinerDisturbance.field_ab;
        var6 = this.field_V.b(24595);
        if (nn.field_f == var6) {
          var17 = in.field_c;
          if (!var17.equals(this.field_s)) {
            this.field_s = var17;
            this.a((byte) -108);
          }
          super.a(param0, param1, param2, param3);
          var6 = this.field_V.b(24595);
          var18_ref = (cf) ((Object) this.field_A);
          var9 = this.field_u + param1;
          var10 = var18_ref.b(100, (fe) (this), param2) + (var18_ref.c(param0 ^ 4, (fe) (this)).b(117) >> 1);
          if (var6 != nn.field_f &&
            var6 != bm.field_o) {
            if (fg.field_d == var6) {
              var19 = ed.field_g[2];
              var19.g(var9, var10 - (var19.field_C >> 1), 256);
              return;
            }
            if (sc.field_a != var6) {
              return;
            }
            var20 = ed.field_g[1];
            var20.g(var9, var10 - (var20.field_C >> 1), 256);
            return;
          }
          var21 = ed.field_g[0];
          var11 = var21.field_x << 1;
          var12 = var21.field_A << 1;
          if (null == this.field_Q) {
            this.field_Q = new ea(var11, var12);
            vb.a(this.field_Q, 126);
          } else {
            if (this.field_Q.field_y < var11) {
              this.field_Q = new ea(var11, var12);
              vb.a(this.field_Q, 126);
            } else {
              if (this.field_Q.field_C < var12) {
                this.field_Q = new ea(var11, var12);
                vb.a(this.field_Q, 126);
              } else {
                vb.a(this.field_Q, 127);
                eh.d();
              }
            }
          }
          var21.b(112, 144, var21.field_x << 4, var21.field_A << 4, -this.field_O << 10, 4096);
          tk.b(true);
          this.field_Q.g(var9 - (var21.field_x >> 1), var10 - var21.field_A, 256);
          return;
        }
        if (var6 == bm.field_o) {
          var22 = in.field_c;
          if (!var22.equals(this.field_s)) {
            this.field_s = var22;
            this.a((byte) -108);
          }
          super.a(param0, param1, param2, param3);
          var6 = this.field_V.b(24595);
          var23_ref = (cf) ((Object) this.field_A);
          var9Lifetime1 = this.field_u + param1;
          var10Lifetime1 = var23_ref.b(100, (fe) (this), param2) + (var23_ref.c(param0 ^ 4, (fe) (this)).b(117) >> 1);
          if (var6 != nn.field_f &&
            var6 != bm.field_o) {
            if (fg.field_d == var6) {
              var24 = ed.field_g[2];
              var24.g(var9Lifetime1, var10Lifetime1 - (var24.field_C >> 1), 256);
              return;
            }
            if (sc.field_a != var6) {
              return;
            }
            var25 = ed.field_g[1];
            var25.g(var9Lifetime1, var10Lifetime1 - (var25.field_C >> 1), 256);
            return;
          }
          var26 = ed.field_g[0];
          var11Lifetime1 = var26.field_x << 1;
          var12Lifetime1 = var26.field_A << 1;
          if (null == this.field_Q) {
            this.field_Q = new ea(var11Lifetime1, var12Lifetime1);
            vb.a(this.field_Q, 126);
          } else {
            if (this.field_Q.field_y < var11Lifetime1) {
              this.field_Q = new ea(var11Lifetime1, var12Lifetime1);
              vb.a(this.field_Q, 126);
            } else {
              if (this.field_Q.field_C < var12Lifetime1) {
                this.field_Q = new ea(var11Lifetime1, var12Lifetime1);
                vb.a(this.field_Q, 126);
              } else {
                vb.a(this.field_Q, 127);
                eh.d();
              }
            }
          }
          var26.b(112, 144, var26.field_x << 4, var26.field_A << 4, -this.field_O << 10, 4096);
          tk.b(true);
          this.field_Q.g(var9Lifetime1 - (var26.field_x >> 1), var10Lifetime1 - var26.field_A, 256);
          return;
        }
        var27 = this.field_V.a(param0 + 7316);
        if (var27 != null) {
          if (!var27.equals(this.field_s)) {
            this.field_s = var27;
            this.a((byte) -108);
          }
          super.a(param0, param1, param2, param3);
          var6Lifetime1 = this.field_V.b(24595);
          var28_ref = (cf) ((Object) this.field_A);
          var9Lifetime2 = this.field_u + param1;
          var10Lifetime2 = var28_ref.b(100, (fe) (this), param2) + (var28_ref.c(param0 ^ 4, (fe) (this)).b(117) >> 1);
          if (var6Lifetime1 != nn.field_f &&
            var6Lifetime1 != bm.field_o) {
            if (fg.field_d == var6Lifetime1) {
              var29 = ed.field_g[2];
              var29.g(var9Lifetime2, var10Lifetime2 - (var29.field_C >> 1), 256);
              return;
            }
            if (sc.field_a != var6Lifetime1) {
              return;
            }
            var30 = ed.field_g[1];
            var30.g(var9Lifetime2, var10Lifetime2 - (var30.field_C >> 1), 256);
            return;
          }
          var31 = ed.field_g[0];
          var11Lifetime2 = var31.field_x << 1;
          var12Lifetime2 = var31.field_A << 1;
          if (null == this.field_Q) {
            this.field_Q = new ea(var11Lifetime2, var12Lifetime2);
            vb.a(this.field_Q, 126);
          } else {
            if (this.field_Q.field_y < var11Lifetime2) {
              this.field_Q = new ea(var11Lifetime2, var12Lifetime2);
              vb.a(this.field_Q, 126);
            } else {
              if (this.field_Q.field_C >= var12Lifetime2) {
                vb.a(this.field_Q, 127);
                eh.d();
              } else {
                this.field_Q = new ea(var11Lifetime2, var12Lifetime2);
                vb.a(this.field_Q, 126);
              }
            }
          }
          var31.b(112, 144, var31.field_x << 4, var31.field_A << 4, -this.field_O << 10, 4096);
          tk.b(true);
          this.field_Q.g(var9Lifetime2 - (var31.field_x >> 1), var10Lifetime2 - var31.field_A, 256);
          return;
        }
        var32 = this.field_U;
        if (!var32.equals(this.field_s)) {
          this.field_s = var32;
          this.a((byte) -108);
        }
        super.a(param0, param1, param2, param3);
        var6Lifetime2 = this.field_V.b(24595);
        var33_ref = (cf) ((Object) this.field_A);
        var9Lifetime3 = this.field_u + param1;
        var10Lifetime3 = var33_ref.b(100, (fe) (this), param2) + (var33_ref.c(param0 ^ 4, (fe) (this)).b(117) >> 1);
        if (var6Lifetime2 != nn.field_f &&
          var6Lifetime2 != bm.field_o) {
          if (fg.field_d == var6Lifetime2) {
            var34 = ed.field_g[2];
            var34.g(var9Lifetime3, var10Lifetime3 - (var34.field_C >> 1), 256);
            return;
          }
          if (sc.field_a != var6Lifetime2) {
            return;
          }
          var35 = ed.field_g[1];
          var35.g(var9Lifetime3, var10Lifetime3 - (var35.field_C >> 1), 256);
          return;
        }
        var36 = ed.field_g[0];
        var16 = var36;
        var11Lifetime3 = var36.field_x << 1;
        var12Lifetime3 = var36.field_A << 1;
        if (null == this.field_Q) {
          this.field_Q = new ea(var11Lifetime3, var12Lifetime3);
          vb.a(this.field_Q, 126);
        } else {
          if (this.field_Q.field_y < var11Lifetime3) {
            this.field_Q = new ea(var11Lifetime3, var12Lifetime3);
            vb.a(this.field_Q, 126);
          } else {
            if (this.field_Q.field_C >= var12Lifetime3) {
              vb.a(this.field_Q, 127);
              eh.d();
            } else {
              this.field_Q = new ea(var11Lifetime3, var12Lifetime3);
              vb.a(this.field_Q, 126);
            }
          }
        }
        var36.b(112, 144, var36.field_x << 4, var36.field_A << 4, -this.field_O << 10, 4096);
        tk.b(true);
        this.field_Q.g(var9Lifetime3 - (var36.field_x >> 1), var10Lifetime3 - var36.field_A, 256);
    }

    w(jm param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, oa.a(0));
        try {
          this.field_U = param1;
          this.field_V = param0;
          this.a(param5, -101, param2, param4, param3);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "w.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final String h(int param0) {
        if (param0 == -27867) {
          return null;
        }
        field_W = (me) null;
        return null;
    }

    final void a(int param0, int param1, byte param2, fe param3) {
        try {
          this.field_O = this.field_O + 1;
          if (param2 <= 49) {
            field_P = (String[]) null;
          }
          super.a(param0, param1, (byte) 98, param3);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "w.V(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(fe param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= 119) {
            return false;
          }
          this.field_O = -33;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("w.UA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void m(int param0) {
        field_P = null;
        if (param0 != 256) {
          return;
        }
        field_T = null;
        field_X = null;
        field_R = null;
        field_W = null;
    }

    static {
        field_P = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_X = "Waiting for music";
    }
}
