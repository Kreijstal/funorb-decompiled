/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class dk extends uj {
    static String field_x;
    boolean field_u;
    private boolean field_y;
    private boolean field_v;
    static String field_t;
    boolean field_z;
    static String field_w;

    void a(int param0, int param1, uj param2, int param3) {
        uj var6 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.a(102, param1, param2, param3);
          if (0 != this.field_l &&
            this.field_l != te.field_b) {
            if (this.a(param3, param1, la.field_c, pe.field_d, -12790) &&
              te.field_b == 0) {
              this.a(la.field_c - param3, 67, -param1 + pe.field_d, this.field_l);
            }
            this.a(la.field_c, param3, param1, param2, (byte) -22, pe.field_d);
          }
          if (param0 <= 27) {
            var6 = (uj) null;
            this.a(-120, (uj) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("dk.U(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (null != this.field_g &&
          this.field_g instanceof ga) {
          ((ga) (this.field_g)).a(this, param2, false, param3, param0);
        }
        if (param1 <= 59) {
          uj var6 = (uj) null;
          this.a(86, 45, (uj) null, -120);
        }
    }

    final void b(byte param0) {
        if (this.field_v) {
          this.field_v = false;
          if (null != this.field_g &&
            this.field_g instanceof ei) {
            ((ei) (this.field_g)).a((byte) -119, (uj) (this), this.field_v);
          }
        }
        if (param0 > -72) {
          StringBuilder var3 = (StringBuilder) null;
          this.a((Hashtable) null, (StringBuilder) null, (byte) 61, -47);
        }
    }

    public static void a(int param0) {
        if (param0 >= -76) {
          return;
        }
        field_t = null;
        field_w = null;
        field_x = null;
    }

    dk(String param0, qg param1) {
        this(param0, eh.field_j.field_d, param1);
    }

    boolean a(int param0, uj param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_u &&
            this.field_y) {
            param1.b((byte) -100);
            this.field_v = true;
            if (null != this.field_g &&
              this.field_g instanceof ei) {
              ((ei) (this.field_g)).a((byte) -119, (uj) (this), this.field_v);
            }
            if (param0 == 0) {
              return true;
            }
            this.field_v = true;
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("dk.PA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static boolean a(byte param0, char param1) {
        boolean stackIn_9_0 = false;
        if (param0 >= -117) {
          dk.a((byte) -26, 'y');
        }
        stackIn_9_0 = (param1 == 160) || (param1 == 32) || (param1 == 95) || (param1 == 45);
        return stackIn_9_0;
    }

    dk(String param0, de param1, qg param2) {
        super(param0, param1, param2);
        this.field_y = true;
        this.field_v = false;
        this.field_u = true;
    }

    final static boolean a(char param0, byte param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        char[] var5 = null;
        char[] var6 = null;
        int var7 = 0;
        char[] var8 = null;
        char[] var9 = null;
        char[] var10 = null;
        char[] var11 = null;
        RuntimeException decompiledCaughtException = null;
        char[] var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        try {
          if (Character.isISOControl(param0)) {
            return false;
          }
          if (u.a(param1 ^ 9566, param0)) {
            return true;
          }
          var10 = gj.field_d;
          var8 = var10;
          var5 = var8;
          var2 = var5;
          for (var3 = 0; var3 < var10.length; var3++) {
            var4 = var10[var3];
            if (var4 == param0) {
              return true;
            }
          }
          var11 = ea.field_c;
          var9 = var11;
          var6 = var9;
          var2Lifetime1 = var6;
          if (param1 != 90) {
            field_t = (String) null;
          }
          var7 = 0;
          var3Lifetime1 = var7;
          while (var11.length > var7) {
            var4Lifetime1 = var11[var7];
            if (var4Lifetime1 == param0) {
              return true;
            }
            var7++;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2_ref), "dk.TA(" + param0 + ',' + param1 + ')');
        }
    }

    boolean a(uj param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_u &&
            this.a(param3, param2, param1, param5, param4 ^ 12799)) {
            this.a(0, param0);
            this.field_l = param6;
            if (this.field_g != null &&
              this.field_g instanceof ke) {
              ((ke) (this.field_g)).a(param3, param2, param6, param5, param1, this, (byte) -103);
            }
            return true;
          }
          if (param4 == -11) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("dk.G(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static byte[] a(byte param0, Object param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        kk var5 = null;
        byte[] stackIn_6_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_11_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 38 % ((param0 - 4) / 47);
          if (param1 == null) {
            return null;
          }
          if (!(param1 instanceof byte[])) {
            if (!(param1 instanceof kk)) {
              throw new IllegalArgumentException();
            }
            var5 = (kk) (param1);
            stackIn_11_0 = var5.a(4208);
            return stackIn_11_0;
          }
          var4 = (byte[]) (param1);
          if (param2) {
            stackIn_8_0 = rg.a((byte) 10, var4);
            return stackIn_8_0;
          }
          stackIn_6_0 = var4;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("dk.VA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    final StringBuilder a(Hashtable param0, StringBuilder param1, byte param2, int param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_9_0 = null;
        StringBuilder stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param0, 0, param1, param3)) {
            this.a(param0, param1, param3, 19103);
            if (this.field_z) {
              discarded$2 = param1.append(" active");
            }
            if (!this.field_u) {
              discarded$3 = param1.append(" disabled");
            }
          }
          if (param2 == 39) {
            stackIn_11_0 = (StringBuilder) (param1);
            return stackIn_11_0;
          }
          stackIn_9_0 = (StringBuilder) null;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("dk.SA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    boolean a(uj param0, char param1, byte param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.d(true) && (84 == param3 ||
            param3 == 83)) {
            this.a(-1, 111, -1, 1);
            return true;
          }
          if (param2 == -90) {
            return false;
          }
          field_w = (String) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("dk.EA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean d(boolean param0) {
        if (!param0) {
          field_t = (String) null;
        }
        return this.field_v;
    }

    final void a(int param0, int param1, int param2, uj param3, byte param4, int param5) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (null != this.field_g &&
            this.field_g instanceof ke) {
            ((ke) (this.field_g)).a(this, param2, param5, 78, param1, param0);
          }
          this.field_l = 0;
          if (param4 != -22) {
            this.field_u = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("dk.OA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    protected dk() {
        this.field_y = true;
        this.field_v = false;
        this.field_u = true;
        this.field_o = eh.field_j.field_t;
    }

    static {
        field_x = "You have <%0> unread messages!";
        field_t = "Back";
        field_w = "To Customer Support";
    }
}
