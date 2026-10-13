/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri extends ib implements en {
    private vf field_K;
    private String[] field_J;
    static int[] field_I;
    static String field_O;
    static String field_L;
    static String field_N;
    static int field_M;
    private d[] field_H;

    public final void a(int param0, int param1, byte param2, int param3, d param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          for (var6_int = 0; var6_int < this.field_J.length; var6_int++) {
            if (this.field_H[var6_int] == param4) {
              this.field_K.a(this.field_J[var6_int], (byte) 56);
            }
          }
          if (param4 == this.field_H[this.field_J.length]) {
            this.field_K.a((byte) 100);
          }
          if (param2 >= -22) {
            this.a(-93, -52, -108, (byte) -4);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("ri.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        if (param0 > -69) {
          return false;
        }
        return null != td.field_t ? true : false;
    }

    final void a(byte param0, String[] param1) {
        int var4_int = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        bb var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var5Lifetime1;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          this.field_G.clear((byte) -95);
          if (param1 != null &&
            param1.length != 0) {
            var3_int = param1.length;
            this.field_J = new String[var3_int];
            for (var4_int = 0; var3_int > var4_int; var4_int++) {
              this.field_J[var4_int] = ap.a(true, (CharSequence) ((Object) param1[var4_int])).replace(' ', ' ');
            }
            var4 = new bb(a.field_u, 0, 1);
            this.field_H = new d[var3_int + 1];
            for (var5 = 0; var5 < var3_int; var5++) {
              this.field_H[var5] = new d(this.field_J[var5], (uh) (this));
              this.field_H[var5].field_l = (ub) ((Object) var4);
              this.field_H[var5].field_z = aa.field_c;
              this.field_H[var5].a(15, 0, var5 * 16 + 20, (byte) -119, 80);
              this.a(this.field_H[var5], true);
            }
            this.field_H[var3_int] = new d(sh.field_c, (uh) (this));
            var5Lifetime1 = 52 / ((-9 - param0) / 59);
            this.field_H[var3_int].field_l = (ub) ((Object) var4);
            this.field_H[var3_int].a(15, 0, 16 * (var3_int + 1) + 20, (byte) -119, 100);
            this.a(this.field_H[var3_int], true);
            return;
          }
          this.field_J = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("ri.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void h(int param0) {
        if (param0 > -41) {
          return;
        }
        aa.a((byte) 96);
        ArchiveIndex.a(-32120);
    }

    final boolean a(int param0, byte param1, oc param2, char param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (param0 == 98) {
            stackIn_7_0 = this.b(param2, (byte) -60);
            return stackIn_7_0;
          }
          if (param0 != 99) {
            return false;
          }
          stackIn_11_0 = this.a(param2, (byte) -117);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("ri.T(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    final static byte[] a(byte[] param0, int param1, BitPacketBuffer param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_3_0 = null;
        byte[] stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param3 != 20) {
            stackIn_3_0 = (byte[]) null;
            return stackIn_3_0;
          }
          var4_int = param2.readBits(param1, (byte) -112);
          if (var4_int == 0) {
            return null;
          }
          if (param0 == null ||
            param0.length != var4_int) {
            param0 = new byte[var4_int];
          }
          var5 = param2.readBits(3, (byte) 98);
          var6 = (byte)param2.readBits(8, (byte) 31);
          if (0 < var5) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param0[var7] = (byte)(var6 + param2.readBits(var5, (byte) 107));
            }
          } else {
            for (var7 = 0; var7 < var4_int; var7++) {
              param0[var7] = (byte)var6;
            }
          }
          stackIn_19_0 = (byte[]) (param0);
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("ri.W(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_I = null;
        if (param0 != -83) {
          field_O = (String) null;
        }
        field_O = null;
        field_L = null;
        field_N = null;
    }

    final static void c(boolean param0) {
        int var1 = 0;
        if (ki.masterSoundGain < 224) {
          var1 = ki.masterSoundGain % 32;
          h.a(13894, ki.masterSoundGain + (32 - var1));
        } else {
          h.a(13894, 256);
        }
        if (!param0) {
          field_M = -128;
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        super.a(param0, param1, param2, param3);
        if (param2 != 0) {
          return;
        }
        TextFont var5 = a.field_u;
        if (this.field_J != null) {
          var5.a(AchievementIcon.field_l, param1 + this.field_o, this.field_w + param0, this.field_t, 20, 16777215, -1, 0, 0, var5.descent + var5.ascent);
        }
    }

    ri(vf param0) {
        super(0, 0, 0, 0, (ub) null);
        try {
          this.field_K = param0;
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "ri.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_L = "Continue";
        field_O = "Remove <%0> from ignore list";
    }
}
