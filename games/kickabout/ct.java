/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ct extends fd implements jp {
    static String field_w;
    static Calendar field_y;
    fd field_z;
    static String field_x;
    static int[][] field_v;

    void a(int param0, int param1, int param2, int param3) {
        if (param1 != 65) {
          this.f((byte) -56);
        }
        if (0 == param0 &&
          null != this.field_r) {
          this.field_r.a(121, true, param3, (fd) (this), param2);
        }
        if (null != this.field_z) {
          this.field_z.a(param0, 65, param2 + this.field_t, param3 + this.field_g);
        }
    }

    final boolean b(int param0) {
        if (param0 <= 10) {
          return true;
        }
        return null != this.a(0) ? true : false;
    }

    fd a(int param0) {
        fd var2 = this.field_z;
        if (var2 != null &&
          var2.b(19)) {
          return var2;
        }
        if (param0 == 0) {
          return null;
        }
        ct.a(9, 19, -25);
        return null;
    }

    final boolean a(fd param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            ct.j(-18);
          }
          stackIn_6_0 = (null != this.field_z) && (this.field_z.a(param0, 0));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ct.HA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    ct(int param0, int param1, int param2, int param3, gj param4, jv param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    private final boolean b(byte param0, fd param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 99) {
            field_y = (Calendar) null;
          }
          stackIn_7_0 = (this.field_z != null) && (!this.field_z.b(param0 ^ 113)) && (this.field_z.a(param1, 0));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ct.CB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final int f(byte param0) {
        if (param0 != 118) {
          this.f(60);
        }
        return this.field_z == null ? 0 : this.field_z.f((byte) 118);
    }

    final static int a(boolean param0, int param1) {
        if (!param0) {
          return 89;
        }
        int var2 = 8;
        if (param1 > 100) {
          var2 = var2 + (-param1 + 100) / 30;
        }
        return var2;
    }

    final boolean a(char param0, byte param1, fd param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -60) {
            field_y = (Calendar) null;
          }
          if (null != this.field_z &&
            this.field_z.b(81) &&
            this.field_z.a(param0, (byte) -114, param2, param3)) {
            return true;
          }
          var5_int = param3;
          if (80 != var5_int) {
            return false;
          }
          if (ne.field_G[81]) {
            stackIn_12_0 = this.a((byte) -86, param2);
          } else {
            stackIn_12_0 = this.b((byte) 99, param2);
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("ct.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    void a(byte param0) {
        if (param0 != -32) {
          this.a(43, 116, 100, 117, -104);
        }
        if (this.field_z != null) {
          this.field_z.e(-1947);
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var4 = 47 / ((26 - param0) / 61);
        int var3 = -1 + param2 & param1 >> 31;
        return var3 + (param1 + (param1 >>> 31)) % param2;
    }

    final boolean a(int param0, fd param1, int param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = 53 / ((63 - param6) / 56);
          stackIn_5_0 = (null != this.field_z) && (this.field_z.b(126)) && (this.field_z.a(param0, param1, param2, param3, param4, param5, 123));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_8_0 = var8;
          stackIn_8_1 = new StringBuilder().append("ct.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    boolean a(boolean param0, int param1, int param2, fd param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            return false;
          }
          stackIn_7_0 = (null != this.field_z) && (this.field_z.a(true, this.field_g + param1, param2, param3, param4, this.field_t + param5, param6));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("ct.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void a(Hashtable param0, int param1, StringBuilder param2, int param3) {
        StringBuilder discarded$26 = null;
        int var5_int = 0;
        StringBuilder discarded$28 = null;
        StringBuilder discarded$27 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = Kickabout.field_G;
        try {
          discarded$26 = param2.append('\n');
          if (param1 <= 122) {
            field_v = (int[][]) null;
          }
          for (var5_int = 0; var5_int <= param3; var5_int++) {
            discarded$28 = param2.append(' ');
          }
          if (this.field_z != null) {
            this.field_z.a(17883, param3 + 1, param0, param2);
          } else {
            discarded$27 = param2.append("null");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("ct.WA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean a(byte param0, fd param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -75 / ((18 - param0) / 53);
          stackIn_5_0 = (null != this.field_z) && (!this.field_z.b(30)) && (this.field_z.a(param1, 0));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ct.VA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    StringBuilder a(int param0, int param1, Hashtable param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 17883) {
            ct.j(31);
          }
          if (this.a(1, param3, param2, param1)) {
            this.b(param1, param3, param2, -18568);
            this.a(param2, 124, param3, param1);
          }
          stackIn_5_0 = (StringBuilder) (param3);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ct.GA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void g(int param0) {
        if (null != this.field_z) {
          this.field_z.g(84);
        }
        if (param0 != 84) {
          this.a(99, 40, 102, 127, 55);
        }
    }

    void a(int param0, int param1, int param2, fd param3, int param4, int param5) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (param4 != -1) {
            field_y = (Calendar) null;
          }
          if (this.field_z != null) {
            this.field_z.a(this.field_g + param0, param1, param2, param3, -1, this.field_t + param5);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("ct.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    void a(byte param0, fd param1, int param2, int param3) {
        try {
          super.a(param0, param1, param2, param3);
          if (null != this.field_z) {
            this.field_z.a((byte) 12, param1, this.field_t + param2, param3 + this.field_g);
          }
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "ct.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void i(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          java.lang.reflect.Method var1_ref_java_lang_reflect_Method = null;
          Exception var1_ref_Exception = null;
          int var1 = 0;
          Runtime var2 = null;
          Throwable var2_ref = null;
          Long var3 = null;
          Object[] var4 = null;
          try {
            var1_ref_java_lang_reflect_Method = Runtime.class.getMethod("maxMemory", new Class[]{});
            if (var1_ref_java_lang_reflect_Method != null) {
              try {
                var2 = Runtime.getRuntime();
                var4 = (Object[]) null;
                var3 = (Long) (var1_ref_java_lang_reflect_Method.invoke((Object) (var2), (Object[]) null));
                nw.field_d = (int)(var3.longValue() / 1048576L) + 1;
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = decompiledCaughtException;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var1_ref_Exception = (Exception) (Object) decompiledCaughtException;
          }
          var1 = 76 / ((param0 - 84) / 35);
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void j(int param0) {
        field_w = null;
        if (param0 != 31068) {
          return;
        }
        field_v = (int[][]) null;
        field_x = null;
        field_y = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.a((byte) -32);
    }

    String f(int param0) {
        String var3 = null;
        if (param0 != -1) {
          this.a(82, -102, -71, 69, -83);
        }
        String var2 = super.f(param0 + 0);
        if (null != this.field_z) {
          var3 = this.field_z.f(-1);
          if (var3 != null) {
            return var3;
          }
        }
        return var2;
    }

    static {
        field_w = "Please wait while we find you an opponent";
        field_y = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_v = new int[7][4];
        field_v[0][2] = 0;
        field_v[0][1] = 0;
        field_v[0][3] = 0;
        field_v[0][0] = 100;
        field_v[1][2] = 0;
        field_v[1][1] = 0;
        field_v[1][3] = 0;
        field_v[1][0] = 100;
        field_v[2][1] = 50;
        field_v[2][0] = 50;
        field_v[2][2] = 0;
        field_v[2][3] = 0;
        field_v[3][2] = 0;
        field_v[3][0] = 30;
        field_v[3][1] = 70;
        field_v[3][3] = 0;
        field_v[4][2] = 30;
        field_v[4][0] = 20;
        field_v[4][3] = 0;
        field_v[4][1] = 50;
        field_v[5][2] = 60;
        field_v[5][1] = 30;
        field_v[5][3] = 0;
        field_v[5][0] = 10;
        field_v[6][1] = 20;
        field_v[6][0] = 0;
        field_v[6][2] = 80;
        field_v[6][3] = 0;
    }
}
