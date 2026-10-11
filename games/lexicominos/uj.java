/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class uj implements rd {
    static jb[] field_a;
    private int field_b;
    static int[][] field_f;
    static aj field_c;
    private le field_d;
    private int field_e;

    public static void a(boolean param0) {
        if (param0) {
          field_a = null;
          field_c = null;
          field_f = (int[][]) null;
          return;
        }
        java.awt.Canvas var2 = (java.awt.Canvas) null;
        uj.a(-66, (java.awt.Canvas) null);
        field_a = null;
        field_c = null;
        field_f = (int[][]) null;
    }

    final static void a(int param0, java.awt.Canvas param1) {
        try {
          int var2_int = 25 % ((param0 - 3) / 42);
          if (11 == ta.field_g) {
            ee.b(95);
          }
          de.a(fh.field_i, tl.field_g, pb.field_j, true);
          lj.a(0, param1, 0, (byte) -128);
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "uj.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(String param0, Throwable param1, int param2) {
        try {
          ab stackIn_12_0;
          int stackIn_12_1;
          java.net.URL stackIn_12_2;
          java.net.URL stackIn_12_3;
          java.net.URL stackIn_12_4;
          StringBuilder stackIn_12_5;
          java.net.URL stackIn_13_2;
          java.net.URL stackIn_13_3;
          String stackIn_13_6;
          Throwable decompiledCaughtException = null;
          String var3 = null;
          Exception var3_ref = null;
          ei var4 = null;
          DataInputStream var5 = null;
          int var6 = 0;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var10 = null;
          var6 = Lexicominos.field_L ? 1 : 0;
          try {
            var3 = "";
            if (param1 != null) {
              var3 = ik.a(-64, param1);
            }
            if (param0 != null) {
              if (param1 != null) {
                var3 = var3 + " | ";
              }
              var3 = var3 + param0;
            }
            oe.a(var3, true);
            var7 = tb.a(":", var3, true, "%3a");
            var8 = tb.a("@", var7, true, "%40");
            var9 = tb.a("&", var8, true, "%26");
            var10 = tb.a("#", var9, true, "%23");
            if (null == tg.field_i) {
              return;
            }
            stackIn_12_0 = pk.field_n;
            stackIn_12_1 = param2 ^ -23815;
            stackIn_12_2 = null;
            stackIn_12_3 = null;
            stackIn_12_4 = tg.field_i.getCodeBase();
            stackIn_12_5 = new StringBuilder().append("clienterror.ws?c=").append(ki.field_f).append("&u=");
            if (null != gl.field_b) {
              stackIn_13_2 = null;
              stackIn_13_3 = null;
              stackIn_13_6 = gl.field_b;
            } else {
              stackIn_13_2 = null;
              stackIn_13_3 = null;
              stackIn_13_6 = "" + d.field_a;
            }
            var4 = ((ab) (Object) stackIn_12_0).a(stackIn_12_1, new java.net.URL(stackIn_12_4, ((StringBuilder) (Object) stackIn_12_5).append(stackIn_13_6).append("&v1=").append(ab.field_j).append("&v2=").append(ab.field_v).append("&e=").append(var10).toString()));
            while (var4.field_b == 0) {
              ge.a(param2 - 1, 1L);
            }
            if (var4.field_b == param2) {
              var5 = (DataInputStream) (var4.field_g);
              var5.read();
              var5.close();
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void a(int param0, int param1, boolean param2, w param3, int param4) {
        int stackIn_5_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Lexicominos.field_L ? 1 : 0;
        try {
          if (!param3.field_m &&
            !param3.a(18337)) {
            stackIn_5_0 = 2188450;
          } else {
            stackIn_5_0 = 3249872;
          }
          var6_int = stackIn_5_0;
          this.field_d.a("<u=" + Integer.toString(var6_int, 16) + ">" + param3.field_u + "</u>", param1 + param3.field_t, param3.field_o + param0, param3.field_j, param3.field_v, var6_int, -1, this.field_b, this.field_e, this.field_d.field_E + this.field_d.field_G);
          if (param4 != -3284) {
            return;
          }
          if (!param3.a(18337)) {
            return;
          }
          var7 = this.field_d.b(param3.field_u);
          var8 = this.field_d.field_G + this.field_d.field_E;
          var9 = param3.field_t + param1;
          var10 = param3.field_o + param0;
          if (this.field_b != 2) {
            if (this.field_b == 1) {
              var9 = var9 + (param3.field_j - var7 >> 1);
            }
          } else {
            var9 = var9 + (-var7 + param3.field_j);
          }
          if (this.field_e != 2) {
            if (1 == this.field_e) {
              var10 = var10 + (-var8 + param3.field_v >> 1);
            }
          } else {
            var10 = var10 + (param3.field_v - var8);
          }
          pk.a(var8, 2 + var10, -2 + var9, 1, var7 + 4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("uj.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param4).append(')').toString());
        }
    }

    public uj() {
        this.field_b = 1;
        this.field_d = ql.field_Q;
        this.field_e = 1;
    }

    uj(le param0, int param1, int param2) {
        try {
          this.field_b = param1;
          this.field_e = param2;
          this.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "uj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_c = new aj(7, 0, 1, 1);
    }
}
