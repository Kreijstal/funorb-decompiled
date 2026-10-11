/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl {
    static bn[] field_k;
    private int field_d;
    static String field_f;
    static String field_a;
    static int field_i;
    private int field_b;
    private o[] field_e;
    static String field_g;
    static String field_l;
    static int[] field_h;
    private o field_c;
    private o field_j;

    final static Class a(int param0, String param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_2_0 = null;
        Class stackIn_5_0 = null;
        Class stackIn_9_0 = null;
        Class stackIn_12_0 = null;
        Class stackIn_16_0 = null;
        Class stackIn_19_0 = null;
        Class stackIn_23_0 = null;
        Class stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.equals("B")) {
            stackIn_2_0 = Byte.TYPE;
            return stackIn_2_0;
          }
          if (param1.equals("I")) {
            stackIn_5_0 = Integer.TYPE;
            return stackIn_5_0;
          }
          if (param1.equals("S")) {
            stackIn_9_0 = Short.TYPE;
            return stackIn_9_0;
          }
          if (param1.equals("J")) {
            stackIn_12_0 = Long.TYPE;
            return stackIn_12_0;
          }
          if (param1.equals("Z")) {
            stackIn_16_0 = Boolean.TYPE;
            return stackIn_16_0;
          }
          if (param1.equals("F")) {
            stackIn_19_0 = Float.TYPE;
            return stackIn_19_0;
          }
          if (param1.equals("D")) {
            stackIn_23_0 = Double.TYPE;
            return stackIn_23_0;
          }
          if (param0 != 0) {
            field_g = (String) null;
          }
          if (!param1.equals("C")) {
            return Class.forName(param1);
          }
          stackIn_29_0 = Character.TYPE;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_32_0 = var2;
          stackIn_32_1 = new StringBuilder().append("kl.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    final void a(int param0, long param1, o param2) {
        o var5 = null;
        try {
          if (param2.field_c != null) {
            param2.c(-2193);
          }
          var5 = this.field_e[(int)((long)(-1 + this.field_b) & param1)];
          param2.field_h = var5;
          param2.field_c = var5.field_c;
          param2.field_c.field_h = param2;
          param2.field_e = param1;
          param2.field_h.field_c = param2;
          int var6 = -127 % ((-35 - param0) / 62);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "kl.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final o a(int param0, long param1) {
        o var6 = null;
        int var7 = Chess.field_G;
        o var4 = this.field_e[(int)((long)(this.field_b - 1) & param1)];
        this.field_j = var4.field_h;
        int var5 = 101 / ((-50 - param0) / 58);
        while (this.field_j != var4) {
          if (~param1 == ~this.field_j.field_e) {
            var6 = this.field_j;
            this.field_j = this.field_j.field_h;
            return var6;
          }
          this.field_j = this.field_j.field_h;
        }
        this.field_j = null;
        return null;
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          ol.a((java.awt.Component) ((Object) param0), param1 ^ -102);
          if (param1 != -114) {
            return;
          }
          uj.a(param1 + 114, (java.awt.Component) ((Object) param0));
          if (ii.field_L != null) {
            ii.field_L.a((java.awt.Component) ((Object) param0), param1 + 116);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("kl.E(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final o b(byte param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int var3;
        o var4;
        o var5;
        o var8;
        var3 = Chess.field_G;
        if (0 >= this.field_d) {
          do {
            if (this.field_b <= this.field_d) {
              if (param0 < 64) {
                return (o) null;
              }
              return null;
            }
            fieldTemp$1 = this.field_d;
            this.field_d = this.field_d + 1;
            var4 = this.field_e[fieldTemp$1].field_h;
          } while (this.field_e[-1 + this.field_d] == var4);
          this.field_c = var4.field_h;
          return var4;
        }
        if (this.field_e[this.field_d - 1] != this.field_c) {
          var8 = this.field_c;
          this.field_c = var8.field_h;
          return var8;
        }
        do {
          if (this.field_b <= this.field_d) {
            if (param0 < 64) {
              return (o) null;
            }
            return null;
          }
          fieldTemp$0 = this.field_d;
          this.field_d = this.field_d + 1;
          var5 = this.field_e[fieldTemp$0].field_h;
        } while (this.field_e[-1 + this.field_d] == var5);
        this.field_c = var5.field_h;
        return var5;
    }

    public static void a(byte param0) {
        field_k = null;
        field_l = null;
        field_h = null;
        field_f = null;
        field_g = null;
        field_a = null;
        if (param0 <= -43) {
          return;
        }
        java.awt.Canvas var2 = (java.awt.Canvas) null;
        kl.a((java.awt.Canvas) null, (byte) 34);
    }

    final o a(boolean param0) {
        this.field_d = 0;
        if (!param0) {
          this.a(-106, 109L);
          return this.b((byte) 88);
        }
        return this.b((byte) 88);
    }

    kl(int param0) {
        int var2 = 0;
        o dupTemp$1 = null;
        o var3;
        this.field_d = 0;
        this.field_e = new o[param0];
        this.field_b = param0;
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$1 = new o();
          var3 = dupTemp$1;
          this.field_e[var2] = dupTemp$1;
          var3.field_c = var3;
          var3.field_h = var3;
        }
    }

    static {
        field_a = "%D";
        field_k = new bn[7];
        field_g = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_f = "Return to lobby";
        field_h = new int[128];
        field_l = "White wins!";
    }
}
