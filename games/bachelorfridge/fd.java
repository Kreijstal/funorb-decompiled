/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd extends ana {
    private taa field_F;
    private int field_w;
    private rr[] field_I;
    private int field_y;
    private cq field_G;
    static eaa field_z;
    tla field_B;
    private boolean field_v;
    private int field_x;
    static String field_E;
    static int[] field_D;

    final static pia a(byte param0, int param1, int param2, vr param3, vr param4) {
        RuntimeException var5 = null;
        pia stackIn_2_0 = null;
        pia stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -105) {
            stackIn_2_0 = (pia) null;
            return stackIn_2_0;
          }
          if (!g.a(param2, param1, param0 ^ 30847, param4)) {
            return null;
          }
          stackIn_7_0 = cea.a(param3.b(-56, param2, param1), 28450);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("fd.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void d(int param0) {
        field_z = null;
        field_E = null;
        field_D = null;
        if (param0 != 0) {
          String[] var2 = (String[]) null;
          fd.a((int[]) null, (vr) null, -57, 54, (byte[]) null, (vr) null, true, (vr) null, (int[]) null, 67, (ee[]) null, (kv[][]) null, (kv[][]) null, (byte[]) null, (String[][]) null, (String[][]) null, (String[]) null);
        }
    }

    fd(gj param0, tla param1) {
        super(param0, param1);
        int var6 = 0;
        rr dupTemp$1 = null;
        int var3_int = 0;
        int var4 = 0;
        aj[] var5 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        this.field_w = 0;
        this.field_y = 25;
        this.field_v = false;
        try {
          this.field_B = param1;
          stackIn_4_0 = ((m.field_a.nextInt() & 1) != 0) ? 0 : 1;
          var3_int = stackIn_4_0;
          var4 = this.field_B.field_u;
          var5 = this.field_B.field_t;
          this.field_I = new rr[var4];
          for (var6 = 0; var6 < var4; var6++) {
            this.field_I[var6] = new rr(this.field_q, this, var5[var6].field_c, var5[var6].field_a, var3_int != 0);
            dupTemp$1 = this.field_I[var6];
            dupTemp$1.field_w = dupTemp$1.field_w - var6 * this.field_y;
          }
          if (var4 > 0) {
            this.field_F = this.field_I[var4 >> 1].e((byte) -120);
            this.a(27799, this.field_F);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("fd.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final void e(int param0) {
        if (this.field_G != null) {
          id.a(-95, this.field_G);
        }
        gka.a(-128, this.field_x);
        int var2 = -114 % ((param0 + 7) / 34);
    }

    final static void a(int[] param0, vr param1, int param2, int param3, byte[] param4, vr param5, boolean param6, vr param7, int[] param8, int param9, ee[] param10, kv[][] param11, kv[][] param12, byte[] param13, String[][] param14, String[][] param15, String[] param16) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var17 = null;
        vr var18 = null;
        String[] var19 = null;
        try {
          var19 = (String[]) null;
          vh.a(param4, param8, param13, param10, 1, param0, param6, param5, param12, param14, param9, param16, param2, param1, (String[]) null, param11, param7, param15, 22914);
          if (param3 != 0) {
            var18 = (vr) null;
            fd.a((byte) 115, 95, 37, (vr) null, (vr) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_5_0 = var17;
          stackIn_5_1 = new StringBuilder().append("fd.D(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param5 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param8 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param11 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param12 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param13 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',');
          if (param14 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          stackIn_38_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',');
          if (param15 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          stackIn_41_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',');
          if (param16 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(')').toString());
        }
    }

    final void c(int param0) {
        int var3 = 0;
        rr[] var2;
        rr var4;
        int var5;
        rr[] var6;
        var5 = BachelorFridge.field_y;
        var6 = this.field_I;
        var2 = var6;
        if (param0 > -10) {
          return;
        }
        for (var3 = 0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          if (var4 != null) {
            var4.c(-44);
          }
        }
    }

    final static void a(boolean param0, int param1, boolean param2) {
        int var3 = 0;
        CharSequence var7 = null;
        String var4 = null;
        Object var5 = null;
        Object var5Lifetime1;
        Object var5Lifetime2;
        if (wh.field_p == null) {
        } else {
          var3 = wh.field_p.b(param2, 93);
          if (0 == var3) {
          } else {
            if (var3 == 2 &&
              null != wh.field_p.field_Z) {
              if (wh.field_p.field_Z.equals("")) {
              } else {
                if (wh.field_p.field_Z.charAt(0) == 91) {
                  var4 = wh.field_p.field_Z;
                } else {
                  var7 = (CharSequence) ((Object) wh.field_p.field_Z);
                  var4 = fq.a(0, var7);
                  var5 = var4;
                  var5Lifetime2 = var4;
                }
                var5Lifetime1 = null;
                if (vaa.field_f == 0) {
                  var5Lifetime1 = lda.a(-26181, param1, var4);
                }
                if (vaa.field_f == 1) {
                  var5Lifetime1 = via.a(param1, var4, -75);
                }
                if (vaa.field_f == 2) {
                  var5Lifetime1 = ip.a(var4, (byte) -80, param1);
                }
                if (vaa.field_f == 3) {
                  var5Lifetime1 = tha.a(2, var4, var4, param1);
                }
                if (var5Lifetime1 != null) {
                  String var6 = (String) null;
                  vf.a(var4, 0, -101, (String) null, (String) (var5Lifetime1), 2);
                }
              }
            }
            wh.field_p = null;
            vaa.field_f = -1;
          }
        }
        if (!param0) {
          field_D = (int[]) null;
        }
    }

    final boolean c(byte param0) {
        int var5 = 0;
        int var2;
        int var3;
        rr[] var4;
        rr var4_ref;
        Object var6;
        int var7;
        rr[] var8;
        rr var9;
        rr var10;
        int var3Lifetime1;
        var7 = BachelorFridge.field_y;
        var2 = -3 % ((param0 - 71) / 47);
        if (!this.field_v) {
          this.field_x = bs.field_k;
          this.field_v = true;
        }
        if (bs.field_k > 0) {
          var3 = -2 + bs.field_k;
          if (0 > var3) {
            var3 = 0;
          }
          gka.a(-56, var3);
        }
        this.field_w = this.field_w + 1;
        if (this.field_m.a((byte) -106)) {
          return false;
        }
        if (null != this.field_F &&
          this.field_F.a((byte) -106)) {
          return false;
        }
        if (this.field_w > 128 &&
          this.field_G == null) {
          gka.a(107, 0);
          this.field_G = tw.a(je.a(rt.field_a[68], 384, 256), (byte) -36);
        }
        var3Lifetime1 = 1;
        var8 = this.field_I;
        var4 = var8;
        for (var5 = 0; var5 < var8.length; var5++) {
          var9 = var8[var5];
          if (var9 != null) {
            if (!var9.b(21807)) {
              var3Lifetime1 = 0;
            } else {
              var6 = null;
            }
          }
        }
        if (this.field_B.field_u > 0) {
          var10 = this.field_I[this.field_B.field_u >> 1];
          var4_ref = var10;
          if (var4_ref != null) {
            var10.d(320);
          }
        }
        if (var3Lifetime1 == 0) {
          return false;
        }
        this.e(-86);
        return true;
    }

    static {
        field_z = new eaa();
        field_E = "Passwords must be between 5 and 20 characters long";
    }
}
