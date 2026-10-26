/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class to extends ea implements vm {
    ea field_s;
    static ScoreSubmission lastScoreSubmission;
    static int field_t;

    final static boolean b(int param0, int param1, int param2) {
        if (param0 != -7493) {
          return true;
        }
        return (param1 & 16) != 0 ? true : false;
    }

    to(int param0, int param1, int param2, int param3, ir param4, no param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    ea i(int param0) {
        ea var2 = this.field_s;
        if (param0 != 0) {
          java.awt.Canvas var3 = (java.awt.Canvas) null;
          to.a(6, (d) null, (java.awt.Canvas) null, 19, -80);
        }
        if (var2 == null) {
          return null;
        }
        if (var2.e(28660)) {
          return var2;
        }
        return null;
    }

    void a(byte param0, int param1, int param2, int param3) {
        if (param1 == 0 &&
          null != this.field_e) {
          this.field_e.a(true, -7592, param3, (ea) (this), param2);
        }
        if (this.field_s != null) {
          this.field_s.a((byte) 104, param1, param2 + this.field_h, this.field_p + param3);
        }
        if (param0 <= 64) {
          field_t = 58;
        }
    }

    void a(byte param0) {
        int var2 = 111 / ((-13 - param0) / 50);
        if (this.field_s != null) {
          this.field_s.a(false);
        }
    }

    final void d(int param0) {
        if (param0 != 7398) {
          return;
        }
        if (null != this.field_s) {
          this.field_s.d(7398);
        }
    }

    final void a(StringBuilder param0, Hashtable param1, byte param2, int param3) {
        StringBuilder discarded$11 = null;
        StringBuilder discarded$13 = null;
        StringBuilder discarded$12 = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          discarded$11 = param0.append('\n');
          var5_int = 0;
          if (param2 != -24) {
            this.a((byte) -47, 125, 23, 0);
          }
          while (var5_int <= param3) {
            discarded$13 = param0.append(' ');
            var5_int++;
          }
          if (null != this.field_s) {
            this.field_s.a(param0, 32462, 1 + param3, param1);
          } else {
            discarded$12 = param0.append("null");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("to.BA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean e(int param0) {
        if (param0 != 28660) {
          return false;
        }
        return null != this.i(0) ? true : false;
    }

    void a(int param0, int param1, int param2, int param3, ea param4, byte param5) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (param5 != 91) {
            this.a((byte) -52);
          }
          if (this.field_s != null) {
            this.field_s.a(param0 + this.field_p, this.field_h + param1, param2, param3, param4, (byte) 91);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("to.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param5).append(')').toString());
        }
    }

    final static void g(int param0) {
        um.field_j = false;
        if (param0 != 0) {
          field_t = -91;
        }
        IntKeyLookup.incomingPacket.readUnsignedByte(param0 - 43);
    }

    final boolean a(int param0, int param1, char param2, ea param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_s != null &&
            this.field_s.e(28660) &&
            this.field_s.a(-93, param1, param2, param3)) {
            return true;
          }
          var5_int = 61 % ((-53 - param0) / 33);
          var6 = param1;
          if (var6 != 80) {
            return false;
          }
          if (!lp.field_a[81]) {
            stackIn_11_0 = this.a(-98, param3);
          } else {
            stackIn_11_0 = this.a((byte) -112, param3);
          }
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("to.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    void a(byte param0, ea param1, int param2, int param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.a((byte) 117, param1, param2, param3);
          if (param0 <= 13) {
            return;
          }
          if (this.field_s != null) {
            this.field_s.a((byte) 50, param1, param2 + this.field_h, this.field_p + param3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("to.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean a(byte param0, ea param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -67) {
            field_t = 88;
          }
          stackIn_7_0 = (null != this.field_s) && (!this.field_s.e(28660)) && (this.field_s.a(param1, (byte) -42));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("to.EA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    String c(byte param0) {
        String var3 = null;
        if (param0 > -41) {
          Hashtable var4 = (Hashtable) null;
          this.a((StringBuilder) null, -79, 77, (Hashtable) null);
        }
        String var2 = super.c((byte) -65);
        if (null != this.field_s) {
          var3 = this.field_s.c((byte) -117);
          if (var3 != null) {
            return var3;
          }
        }
        return var2;
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, ea param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 34) {
            this.a(-36, 37, 20, -53, (byte) -115);
          }
          stackIn_6_0 = (this.field_s != null) && (this.field_s.a(34, this.field_p + param1, param2, param3, this.field_h + param4, param5, param6));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("to.O(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param6).append(')').toString());
        }
    }

    final int f(int param0) {
        if (param0 != 0) {
          return -36;
        }
        return this.field_s != null ? this.field_s.f(0) : 0;
    }

    private final boolean a(int param0, ea param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -37) {
            lastScoreSubmission = (ScoreSubmission) null;
          }
          stackIn_7_0 = (null != this.field_s) && (!this.field_s.e(28660)) && (this.field_s.a(param1, (byte) -42));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("to.KA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static GraphicsRenderer a(int param0, d param1, java.awt.Canvas param2, int param3, int param4) {
        RuntimeException var5 = null;
        kj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 16) {
            to.b(-16, -37, 49);
          }
          stackIn_3_0 = new kj(param2, param1, param4, param3);
          return (GraphicsRenderer) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("to.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(int param0) {
        lastScoreSubmission = null;
        if (param0 != 0) {
          field_t = -14;
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        super.a(param0, param1, param2, param3, (byte) 126);
        this.a((byte) -94);
        if (param4 < 122) {
          field_t = 94;
        }
    }

    final static void h(int param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        if (null != ho.field_b) {
          var1 = ho.field_b;
          synchronized (var1) {
            ho.field_b = null;
          }
        }
        if (param0 != 1) {
          field_t = 37;
        }
    }

    final boolean a(ea param0, byte param1) {
        RuntimeException var3 = null;
        ea var4 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -42) {
            var4 = (ea) null;
            this.a((byte) -27, (ea) null, 12, -44);
          }
          stackIn_6_0 = (null != this.field_s) && (this.field_s.a(param0, (byte) -42));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("to.U(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, ea param5, boolean param6) {
        RuntimeException var8 = null;
        ea var9 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param6) {
            var9 = (ea) null;
            this.a(-108, -17, '\022', (ea) null);
          }
          stackIn_7_0 = (null != this.field_s) && (this.field_s.e(28660)) && (this.field_s.a(param0, param1, param2, param3, param4, param5, false));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("to.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param6).append(')').toString());
        }
    }

    StringBuilder a(StringBuilder param0, int param1, int param2, Hashtable param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 32462) {
            stackIn_2_0 = (StringBuilder) null;
            return stackIn_2_0;
          }
          if (this.a(param0, param2, false, param3)) {
            this.a(param0, 0, param3, param2);
            this.a(param0, param3, (byte) -24, param2);
          }
          stackIn_7_0 = (StringBuilder) (param0);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("to.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        lastScoreSubmission = null;
    }
}
