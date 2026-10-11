/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi {
    private eg field_g;
    static qb field_k;
    static int field_a;
    private di field_b;
    static String field_h;
    static String field_l;
    private eg field_e;
    static int field_c;
    static String field_i;
    static String field_f;
    static ll[] field_m;
    private di field_d;
    static String field_j;

    public static void a(byte param0) {
        field_i = null;
        field_j = null;
        field_f = null;
        field_l = null;
        if (param0 == 59) {
          field_h = null;
          field_m = null;
          field_k = null;
          return;
        }
    }

    final static void a(boolean param0, String param1, float param2, byte param3) {
        try {
          if (ci.field_c == null) {
            ci.field_c = new gd(p.field_b, fg.field_o);
            p.field_b.b(ci.field_c, 15637);
          }
          ci.field_c.a(param1, param2, param0, (byte) -105);
          de.b();
          if (param3 != -100) {
            String var5 = (String) null;
            gi.a(true, (String) null, -0.9587674736976624f, (byte) 42);
          }
          lm.a((byte) -120, true);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "gi.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final wf a(int param0, int param1, int[] param2, int param3) {
        wf stackIn_4_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_12_0 = null;
        wf stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        wf var8 = null;
        ai var9 = null;
        int[] var10 = null;
        wf var8Lifetime1;
        try {
          var5_int = (param1 >>> 12 | (-268431361 & param1) << 4) ^ param3;
          var5_int = var5_int | param1 << 16;
          var6 = 4294967296L ^ (long)var5_int;
          if (param0 > -121) {
            var10 = (int[]) null;
            this.a(-17, (int[]) null, 83);
          }
          var8 = (wf) (this.field_d.a(var6, -48));
          if (var8 != null) {
            stackIn_4_0 = var8;
            return stackIn_4_0;
          }
          if (param2 != null &&
            param2[0] <= 0) {
            stackIn_8_0 = null;
            return (wf) (stackIn_8_0);
          }
          var9 = (ai) (this.field_b.a(var6, -82));
          if (var9 == null) {
            var9 = ai.a(this.field_g, param1, param3);
            if (var9 == null) {
              stackIn_12_0 = null;
              return (wf) (stackIn_12_0);
            }
            this.field_b.a(var9, true, var6);
          }
          var8Lifetime1 = var9.a(param2);
          if (var8Lifetime1 == null) {
            return null;
          }
          var9.a(true);
          this.field_d.a(var8Lifetime1, true, var6);
          stackIn_18_0 = var8Lifetime1;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_21_0 = var5;
          stackIn_21_1 = new StringBuilder().append("gi.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param3).append(')').toString());
        }
    }

    private final wf a(int param0, int param1, int[] param2, boolean param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        wf var8 = null;
        pl var9 = null;
        wf var10 = null;
        wf stackIn_2_0 = null;
        wf stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        wf var8Lifetime1;
        try {
          var5_int = ((-805302273 & param0) << 4 | param0 >>> 12) ^ param1;
          var5_int = var5_int | param0 << 16;
          var6 = (long)var5_int;
          var8 = (wf) (this.field_d.a(var6, -109));
          if (var8 != null) {
            stackIn_2_0 = var8;
            return stackIn_2_0;
          }
          if (param2 != null &&
            0 >= param2[0]) {
            return null;
          }
          var9 = pl.a(this.field_e, param0, param1);
          if (var9 == null) {
            return null;
          }
          var10 = var9.a();
          var8Lifetime1 = var10;
          this.field_d.a(var8Lifetime1, param3, var6);
          if (param2 != null) {
            param2[0] = param2[0] - var10.field_i.length;
          }
          stackIn_13_0 = var8Lifetime1;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("gi.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    final wf a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        wf stackIn_3_0 = null;
        wf stackIn_6_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_g.b((byte) -79) == 1) {
            stackIn_3_0 = this.a(-126, 0, param0, param1);
            return stackIn_3_0;
          }
          if (param2 != ~this.field_g.a(param1, (byte) -60)) {
            throw new RuntimeException();
          }
          stackIn_6_0 = this.a(-127, param1, param0, 0);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("gi.F(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final wf a(int param0, int[] param1, int param2) {
        RuntimeException var4 = null;
        wf stackIn_3_0 = null;
        wf stackIn_6_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_e.b((byte) -99) == 1) {
            stackIn_3_0 = this.a(0, param0, param1, true);
            return stackIn_3_0;
          }
          if (param2 != ~this.field_e.a(param0, (byte) -60)) {
            throw new RuntimeException();
          }
          stackIn_6_0 = this.a(param0, 0, param1, true);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("gi.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    final static String a(int param0) {
        if (param0 != 0) {
          String var2 = (String) null;
          gi.a(true, (String) null, 0.18466001749038696f, (byte) 40);
          if (null == ah.field_b) {
            return "";
          }
          return ah.field_b;
        }
        if (null == ah.field_b) {
          return "";
        }
        return ah.field_b;
    }

    gi(eg param0, eg param1) {
        this.field_b = new di(256);
        this.field_d = new di(256);
        try {
          this.field_g = param1;
          this.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "gi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = "Lesson 4 of 7<br><br>Use of a powerful spell in a safe and secure environment.<br><br>Use the Rain of Fire spell to destroy all three targets.<br><br><br>* Using the focus point for a locational spell *<br>* Having fun with heavy firepower *";
        field_l = "Click to buy this spell for 2 wands.";
        field_c = 640;
        field_i = "MOST CRUEL - ";
        field_f = "Overlight spells focus on healing and the defence of your forces.";
        field_j = "Your rating is <%0>";
        field_k = new qb(270, 70);
    }
}
