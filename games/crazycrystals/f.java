/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class f {
    static jp field_d;
    private int field_a;
    private int field_b;
    static int[] field_c;
    static int[] field_g;
    static String[] field_h;
    static String field_f;
    static String field_e;

    void a(f[][] param0, int param1, int param2, int param3) {
        try {
          if (param3 >= -8) {
            hj var6 = (hj) null;
            f.a(-95, (hj) null, -94, (hj) null, -123, (byte) -100);
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "f.IB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(byte param0, f param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 <= 51) {
            field_c = (int[]) null;
          }
          if (param1 != null) {
            this.a(param1.a(false), true, param1.b(-3445));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("f.KB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    void a(fq param0, int param1) {
        try {
          if (param1 < 126) {
            this.b(true, false);
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "f.LB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    f c(int param0) {
        if (param0 != -1) {
          field_c = (int[]) null;
        }
        return this;
    }

    abstract int a(boolean param0, boolean param1);

    void a(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        if (param0 >= -104) {
          field_e = (String) null;
        }
    }

    f a(int param0, byte param1, int param2) {
        if (param1 != -110) {
          field_c = (int[]) null;
        }
        return this;
    }

    f a(int param0, ea param1, int param2, int param3, byte param4, int param5, f[][] param6) {
        RuntimeException var8 = null;
        f stackIn_2_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 > -87) {
            stackIn_2_0 = (f) null;
            return stackIn_2_0;
          }
          param1.a((byte) 119, this);
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("f.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(byte param0, String[] param1, String param2, int param3) {
        String[] var4 = null;
        int var5 = 0;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        String[] var6 = null;
        var5 = CrazyCrystals.field_B;
        try {
          sg.field_b = io.field_P;
          if (param3 == 255) {
            stackIn_9_0 = !(ro.field_n >= 13);
            nn.field_a = oe.a(stackIn_9_0, (byte) 119);
            var6 = (String[]) null;
            rk.a((String[]) null, 3928);
          } else {
            if (100 <= param3 &&
              param3 <= 105) {
              var4 = param1;
              rk.a(var4, 3928);
              nn.field_a = en.a(param1, 169);
            } else {
              nn.field_a = me.a(param2, 20, param3);
            }
          }
          if (param0 <= 119) {
            f.a(-123);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_15_0 = var4_ref;
          stackIn_15_1 = new StringBuilder().append("f.PB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_h = null;
        if (param0 != 100) {
          hj var2 = (hj) null;
          f.a(38, (hj) null, 75, (hj) null, -18, (byte) 62);
        }
        field_f = null;
        field_d = null;
        field_g = null;
        field_c = null;
    }

    int b(int param0) {
        if (param0 != -3445) {
          return 46;
        }
        return this.field_a;
    }

    f a(f param0, int param1, int param2, f[][] param3, dl[] param4, byte param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5 != -87) {
            this.a(49, (f[][]) null, true, -64);
          }
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("f.H(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, DataInputStream param3, byte param4) throws IOException {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param4 != -35) {
            field_d = (jp) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_5_0 = var6;
          stackIn_5_1 = new StringBuilder().append("f.BC(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param4).append(')').toString());
        }
    }

    void b(int param0, int param1, f[][] param2, int param3) {
        try {
          if (param0 <= 24) {
            this.a(87, (ea) null, -85, 69, (byte) 5, 44, (f[][]) null);
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "f.CC(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    boolean a(byte param0, f[][] param1, int param2, int param3, int param4, fq param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -21) {
            return false;
          }
          this.c(7);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("f.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param6).append(')').toString());
        }
    }

    int a(int param0, int param1, int param2, fq param3, int param4) {
        RuntimeException var6 = null;
        hj var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -9352) {
            var7 = (hj) null;
            f.a(38, (hj) null, 80, (hj) null, -43, (byte) -37);
          }
          stackIn_3_0 = 0;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("f.AC(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param4).append(')').toString());
        }
    }

    void a(f[][] param0, int param1, byte param2, int param3) {
        try {
          if (param2 != 40) {
            this.a(false);
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "f.EA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    void a(int param0, int param1, int param2, f[][] param3, int param4, int param5, int param6, int param7) {
        try {
          if (param0 <= 92) {
            this.field_a = -55;
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "f.HA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    void a(int param0, int param1, int param2, f[][] param3) {
        try {
          if (param0 != 393989) {
            this.a(44, (byte) 18, -111);
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "f.UB(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    protected Object clone() {
        try {
          Object stackIn_1_0 = null;
          Throwable decompiledCaughtException = null;
          CloneNotSupportedException var1 = null;
          try {
            stackIn_1_0 = super.clone();
            return stackIn_1_0;
          } catch (java.lang.CloneNotSupportedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (CloneNotSupportedException) (Object) decompiledCaughtException;
            var1.printStackTrace();
            return null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    boolean b(byte param0) {
        if (param0 < 43) {
          field_f = (String) null;
          return false;
        }
        return false;
    }

    nj a(int param0, nj param1) {
        RuntimeException var3 = null;
        String var4 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 23525) {
            return null;
          }
          var4 = (String) null;
          f.a((byte) 49, (String[]) null, (String) null, 47);
          stackIn_3_0 = null;
          return (nj) (stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("f.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void a(int param0, boolean param1, int param2) {
        if (this.field_a < param2) {
          this.field_b = param0;
          this.field_a = param2;
        } else {
          if (param2 == this.field_b) {
            this.field_b = this.field_b | param0;
          }
        }
        if (!param1) {
          this.clone();
        }
    }

    int a(byte param0) {
        if (param0 >= -34) {
          return -14;
        }
        return -1;
    }

    f a(int param0, int param1, f[][] param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 106) {
            field_h = (String[]) null;
          }
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("f.EC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(')').toString());
        }
    }

    int a(boolean param0) {
        if (param0) {
          field_c = (int[]) null;
        }
        return this.field_b;
    }

    abstract void a(int param0, int param1, int param2, boolean param3, int param4, int param5);

    f a(int param0, f[][] param1, boolean param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2) {
            this.a(55, -78, -114, (f[][]) null, 74, 39, 101, 81);
          }
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("f.HB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    int d(int param0) {
        if (param0 >= -77) {
          this.a(-77, 99);
        }
        return -1;
    }

    void a(boolean param0, int param1, boolean param2, int param3, int param4, int param5) {
        this.a(param3, 102, param5, param0, param1, param4);
        if (param2) {
          field_h = (String[]) null;
        }
    }

    void a(int param0, int param1) {
        if (param1 < 61) {
          this.a(22, (ea) null, 62, 110, (byte) -119, -24, (f[][]) null);
        }
    }

    boolean a(int param0, f[][] param1, boolean param2, int param3, int param4, int param5, ea param6, int param7) {
        RuntimeException var9 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 16736352) {
            return false;
          }
          this.a((mj) null, (byte) -122, true, (f[][]) null);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_6_0 = var9;
          stackIn_6_1 = new StringBuilder().append("f.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param7).append(')').toString());
        }
    }

    f() {
        this.field_b = 0;
        this.field_a = 0;
    }

    abstract void a(int param0, int param1, int param2);

    boolean a(boolean param0, f[][] param1, mj param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            return false;
          }
          field_c = (int[]) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("f.A(").append(param0).append(',');
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
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    f a(mj param0, byte param1, boolean param2, f[][] param3) {
        RuntimeException var5 = null;
        f stackIn_2_0 = null;
        ma stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < -74) {
            stackIn_4_0 = new ma(param0.b((byte) 84), this, param0);
            return (f) ((Object) stackIn_4_0);
          }
          stackIn_2_0 = (f) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("f.S(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(int param0, hj param1, int param2, hj param3, int param4, byte param5) {
        try {
          int var6_int = -80 % ((param5 - 59) / 44);
          bn.field_c = param4;
          qo.field_k = param3;
          qh.field_h = param1;
          a.field_a = param2;
          to.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "f.WB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    boolean e(int param0) {
        if (param0 != -4128) {
          return false;
        }
        return false;
    }

    void b(boolean param0, boolean param1) {
        if (!param0) {
          this.field_b = -80;
        }
    }

    f a(int param0, int param1, f[][] param2, f param3, byte param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6_int = -107 % ((param4 - 73) / 42);
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_4_0 = var6;
          stackIn_4_1 = new StringBuilder().append("f.L(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        int var0 = 0;
        field_d = new jp();
        field_c = new int[16];
        for (var0 = 0; var0 < 16; var0++) {
          field_c[var0] = 393989 * var0;
        }
        field_f = "Teleport";
        field_e = "Press M for a<br>map of the level.";
        field_g = new int[]{12632256, 16760896, 8454143, 16736352};
        field_h = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
