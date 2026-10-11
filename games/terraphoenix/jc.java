/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class jc extends gl implements sf {
    static String field_E;
    gl field_F;
    static ci[] field_G;
    static String field_B;
    static int field_D;
    static dh field_z;
    static String[] field_C;

    String f(int param0) {
        String var3 = null;
        if (param0 <= 70) {
          field_D = 117;
        }
        String var2 = super.f(125);
        if (null != this.field_F) {
          var3 = this.field_F.f(119);
          if (var3 != null) {
            return var3;
          }
        }
        return var2;
    }

    void a(int param0) {
        if (null != this.field_F) {
          this.field_F.c(0);
        }
        if (param0 != 0) {
          field_D = 14;
        }
    }

    jc(int param0, int param1, int param2, int param3, cj param4, sc param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        if (param1 < 45) {
          gl var7 = (gl) null;
          this.a((byte) -18, (gl) null);
        }
        super.a(param0, (byte) 72, param2, param3, param4);
        this.a(0);
    }

    gl e(byte param0) {
        if (param0 != 82) {
          return (gl) null;
        }
        gl var2 = this.field_F;
        if (var2 == null) {
          return null;
        }
        if (!var2.d(-116)) {
          return null;
        }
        return var2;
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param2 == 0 &&
          null != this.field_l) {
          this.field_l.a(param3, (gl) (this), param0, -24381, true);
        }
        if (null != this.field_F) {
          this.field_F.a(this.field_w + param0, -124, param2, this.field_u + param3);
        }
        if (param1 >= -106) {
          this.a(25, (byte) -75, -102, -86, -98);
        }
    }

    public static void f(byte param0) {
        field_z = null;
        field_B = null;
        field_E = null;
        field_G = null;
        field_C = null;
        if (param0 <= 32) {
          jc.f((byte) -46);
        }
    }

    final boolean d(int param0) {
        if (param0 > -103) {
          gl var3 = (gl) null;
          this.a((byte) -109, (gl) null);
        }
        return null != this.e((byte) 82) ? true : false;
    }

    private final boolean a(int param0, gl param1) {
        RuntimeException var3 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 45) {
            return false;
          }
          stackIn_8_0 = (this.field_F != null) && (!this.field_F.d(-125)) && (this.field_F.a((byte) 76, param1));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("jc.EB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    void a(gl param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, 75);
        if (param3 <= 25) {
          return;
        }
        try {
          if (null != this.field_F) {
            this.field_F.a(param0, param1 + this.field_u, this.field_w + param2, 57);
          }
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "jc.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4, gl param5) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (param0 < 36) {
            field_E = (String) null;
          }
          if (null != this.field_F) {
            this.field_F.a(47, param1, this.field_u + param2, param3 + this.field_w, param4, param5);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("jc.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final int d(byte param0) {
        if (param0 < 23) {
          field_C = (String[]) null;
        }
        return this.field_F == null ? 0 : this.field_F.d((byte) 93);
    }

    final boolean a(char param0, gl param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_F != null &&
            this.field_F.d(param2 ^ -100) &&
            this.field_F.a(param0, param1, 30, param3)) {
            return true;
          }
          if (param2 != 30) {
            return false;
          }
          var5_int = param3;
          if (80 != var5_int) {
            return false;
          }
          if (bh.field_e[81]) {
            stackIn_13_0 = this.a(param2 + 87, param1);
          } else {
            stackIn_13_0 = this.a(param1, 0);
          }
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("jc.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean a(gl param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            this.a(-84, (byte) -45, -88, 119, -105);
          }
          stackIn_7_0 = (null != this.field_F) && (!this.field_F.d(-109)) && (this.field_F.a((byte) 48, param0));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("jc.CB(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final void e(int param0) {
        if (param0 >= 0) {
          field_G = (ci[]) null;
        }
        if (this.field_F != null) {
          this.field_F.e(-87);
        }
    }

    final void b(StringBuilder param0, Hashtable param1, int param2, int param3) {
        StringBuilder discarded$4 = null;
        int var5_int = 0;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$5 = null;
        int var6 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = Terraphoenix.field_V;
        try {
          discarded$4 = param0.append('\n');
          for (var5_int = param3; var5_int <= param2; var5_int++) {
            discarded$6 = param0.append(' ');
          }
          if (null == this.field_F) {
            discarded$5 = param0.append("null");
          } else {
            this.field_F.a(34, param0, param2 + 1, param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("jc.BB(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    boolean a(boolean param0, int param1, int param2, int param3, int param4, gl param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            return false;
          }
          stackIn_7_0 = (null != this.field_F) && (this.field_F.a(false, param1, this.field_u + param2, param3 + this.field_w, param4, param5, param6));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("jc.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param6).append(')').toString());
        }
    }

    final boolean a(byte param0, gl param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 2) {
            return true;
          }
          stackIn_7_0 = (null != this.field_F) && (this.field_F.a((byte) 120, param1));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("jc.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final boolean a(gl param0, int param1, int param2, int param3, int param4, int param5, byte param6) {
        RuntimeException var8 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param6 < 6) {
            return false;
          }
          stackIn_8_0 = (this.field_F != null) && (this.field_F.d(-120)) && (this.field_F.a(param0, param1, param2, param3, param4, param5, (byte) 69));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_11_0 = var8;
          stackIn_11_1 = new StringBuilder().append("jc.DB(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    StringBuilder a(int param0, StringBuilder param1, int param2, Hashtable param3) {
        RuntimeException var5 = null;
        Hashtable var6 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 34) {
            var6 = (Hashtable) null;
            this.b((StringBuilder) null, (Hashtable) null, -47, -58);
          }
          if (this.a(param1, param3, -88, param2)) {
            this.a(param3, param2, (byte) 27, param1);
            this.b(param1, param3, param2, param0 - 34);
          }
          stackIn_6_0 = (StringBuilder) (param1);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("jc.KA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static {
        field_B = "Click to continue";
        field_C = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_E = "Your scientists need more alien resources to continue their research. Recover alien equipment to gain access to more topics.";
    }
}
