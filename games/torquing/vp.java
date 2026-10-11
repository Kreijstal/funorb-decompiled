/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vp extends hn implements ng {
    static int field_E;
    static la field_D;
    static int field_I;
    static String[] field_C;
    private ba field_B;
    static int[] field_F;
    private String[] field_J;
    static String field_G;
    private lg[] field_H;

    final void a(String[] param0, int param1) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        je var4 = null;
        int var6 = 0;
        var6 = Torquing.field_u;
        try {
          this.field_y.a(0);
          if (param0 != null &&
            param0.length != 0) {
            var3_int = param0.length;
            this.field_J = new String[var3_int];
            for (var4_int = 0; var3_int > var4_int; var4_int++) {
              this.field_J[var4_int] = ab.a((byte) -114, (CharSequence) ((Object) param0[var4_int])).replace(' ', ' ');
            }
            var4 = new je(dg.field_e, 0, 1);
            this.field_H = new lg[1 + var3_int];
            if (param1 >= -41) {
              field_D = (la) null;
            }
            for (var5 = 0; var5 < var3_int; var5++) {
              this.field_H[var5] = new lg(this.field_J[var5], (ca) (this));
              this.field_H[var5].field_q = (el) ((Object) var4);
              this.field_H[var5].field_n = ai.field_l;
              this.field_H[var5].a((byte) 123, 0, 20 + var5 * 16, 15, 80);
              this.a(this.field_H[var5], -6938);
            }
            this.field_H[var3_int] = new lg(jf.field_b, (ca) (this));
            this.field_H[var3_int].field_q = (el) ((Object) var4);
            this.field_H[var3_int].a((byte) -36, 0, (var3_int + 1) * 16 + 20, 15, 100);
            this.a(this.field_H[var3_int], -6938);
            return;
          }
          this.field_J = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("vp.A(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    vp(ba param0) {
        super(0, 0, 0, 0, (el) null);
        try {
          this.field_B = param0;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "vp.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(byte param0, lg param1, int param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Torquing.field_u;
        try {
          for (var6_int = 0; var6_int < this.field_J.length; var6_int++) {
            if (param1 == this.field_H[var6_int]) {
              this.field_B.a((byte) 21, this.field_J[var6_int]);
            }
          }
          if (param0 > -85) {
            field_C = (String[]) null;
          }
          if (param1 == this.field_H[this.field_J.length]) {
            this.field_B.a((byte) 97);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("vp.NA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        super.a(param0, (byte) -114, param2, param3);
        if (param0 != 0) {
          return;
        }
        if (param1 >= -7) {
          return;
        }
        uc var5 = dg.field_e;
        if (null != this.field_J) {
          var5.a(bi.field_I, param3 + this.field_w, param2 + this.field_k, this.field_p, 20, 16777215, -1, 0, 0, var5.field_t + var5.field_x);
        }
    }

    public static void h(int param0) {
        field_C = null;
        field_D = null;
        field_F = null;
        field_G = null;
        if (param0 != -1) {
          field_C = (String[]) null;
        }
    }

    final static void b(int param0, int param1) {
        try {
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          try {
            hp.a(ip.a(9), new Object[]{new Integer(param0)}, 28989, "resizing");
            if (param1 >= -57) {
              field_G = (String) null;
            }
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(int param0, gm param1, char param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, -96)) {
            return true;
          }
          if (param0 == 98) {
            stackIn_6_0 = this.a((byte) 66, param1);
            return stackIn_6_0;
          }
          var5_int = -103 % ((-33 - param3) / 57);
          if (param0 != 99) {
            return false;
          }
          stackIn_9_0 = this.b(param1, -9928);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("vp.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_C = new String[]{"All scores", "My scores", "Best each"};
        field_E = 0;
        field_G = "<col=2>Surfaces:</col>";
    }
}
