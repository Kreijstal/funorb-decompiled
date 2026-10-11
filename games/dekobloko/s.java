/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s extends w {
    w field_Ob;
    static ck[] field_Qb;
    static int field_Pb;
    w field_Nb;
    nm field_Rb;
    w field_Sb;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.field_Ib = param3;
        this.field_mb = param6;
        this.field_vb = param0;
        this.field_N = param2;
        if (param1 != 1) {
          this.field_Nb = (w) null;
        }
        this.a(param4, param7, param5, 16);
    }

    final static int a(boolean param0, int param1, int param2, CharSequence param3) {
        int var8 = 0;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = client.field_A ? 1 : 0;
        try {
          if (2 <= param2 &&
            param2 <= 36) {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            if (param1 != 4) {
              s.b(true);
            }
            var7 = param3.length();
            for (var8 = 0; var7 > var8; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param3.charAt(var8);
              if ((var8 == 0) &&
                (45 == var9)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var8 != 0 || (var9 != 43 ||
                !param0))) {
                if (var9 >= 48 &&
                  57 >= var9) {
                  var9 -= 48;
                } else if (var9 >= 65 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else if (97 <= var9 &&
                  var9 <= 122) {
                  var9 -= 87;
                } else {
                  throw new NumberFormatException();
                }
                if (var9 >= param2) {
                  throw new NumberFormatException();
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = param2 * var6 + var9;
                if (var6 != var10 / param2) {
                  throw new NumberFormatException();
                }
                var6 = var10;
                var5 = 1;
              }
            }
            if (var5 == 0) {
              throw new NumberFormatException();
            }
            stackIn_42_0 = var6;
            return stackIn_42_0;
          }
          throw new IllegalArgumentException("" + param2);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_45_0 = var4;
          stackIn_45_1 = new StringBuilder().append("s.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        a.field_k = param3;
        nd.field_b = param0;
        if (param2 != -91) {
          s.b((byte) 18, 119);
        }
        ke.field_d = param4;
        cc.field_a = param1;
    }

    final static void h(byte param0) {
        sn.a(false);
        if (null != jh.field_b) {
          tj.a(false, jh.field_b);
        }
        wf.d(90);
        rf.a((byte) 0);
        fc.a((byte) 67);
        if (di.a(false)) {
          we.field_b.f(1, -4);
          wj.c(4792, 0);
        }
        si.a(80);
        if (param0 <= 69) {
          ji var2 = (ji) null;
          s.a(-57, -79, (ck[][]) null, (byte[]) null, (ck[][]) null, -19, false, (String[][]) null, (int[]) null, (byte[]) null, (ji) null, (int[]) null, (ji) null, (pi[]) null, (String[]) null, (String[][]) null, (ji) null);
        }
    }

    public static void i(byte param0) {
        int var1 = 8 % ((param0 + 32) / 55);
        field_Qb = null;
    }

    s(long param0, w param1, w param2, jd param3, w param4, String param5, String param6) {
        super(param0, param1);
        try {
          this.field_Sb = new w(0L, (w) null);
          this.field_Rb = new nm(0L, this.field_Sb, param2, param3);
          this.field_Ob = new w(0L, param4);
          this.field_Nb = new w(0L, param4);
          this.field_Ob.field_Y = param5;
          this.field_Nb.field_Y = param6;
          this.a(this.field_Rb, -16834);
          this.a(this.field_Ob, -16834);
          this.a(this.field_Nb, -16834);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "s.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = (this.field_mb + param2) / 2;
        int var6 = this.field_N - param1;
        this.field_Rb.a(6, 0, param0, 0, -param2 + var6, this.field_mb, param2);
        this.field_Ob.field_Ib = var6;
        if (param3 != 16) {
          field_Qb = (ck[]) null;
        }
        this.field_Ob.field_N = param1;
        this.field_Ob.field_mb = var5 - param2;
        this.field_Ob.field_vb = 0;
        this.field_Nb.field_mb = this.field_mb - var5;
        this.field_Nb.field_vb = var5;
        this.field_Nb.field_Ib = var6;
        this.field_Nb.field_N = param1;
    }

    final static void g(byte param0) {
        if (ah.field_c != null) {
          ah.field_c.f((byte) -66);
        }
        if (null != pk.field_v) {
          pk.field_v.m((byte) 114);
        }
        sh.a(0);
        int var1 = 62 % ((-55 - param0) / 60);
    }

    final static int b(byte param0, int param1) {
        int var2 = 0;
        if (param1 < 0 ||
          param1 >= 65536) {
          param1 = param1 >>> 16;
          var2 += 16;
        }
        if (256 <= param1) {
          var2 += 8;
          param1 = param1 >>> 8;
        }
        if (param1 >= 16) {
          param1 = param1 >>> 4;
          var2 += 4;
        }
        if (4 <= param1) {
          var2 += 2;
          param1 = param1 >>> 2;
        }
        if (param1 >= 1) {
          param1 = param1 >>> 1;
          var2++;
        }
        int var3 = -60 % ((param0 - 69) / 45);
        return var2 + param1;
    }

    s(long param0, s param1, String param2, String param3) {
        this(param0, param1, param1.field_Rb.field_Rb, param1.field_Rb.field_Sb, param1.field_Ob, param2, param3);
    }

    final static void b(boolean param0) {
        int[] var5 = null;
        int[] var1 = null;
        int[] var6 = null;
        int var7 = 0;
        int var2 = 0;
        int var3 = client.field_A ? 1 : 0;
        int[] var1Lifetime1;
        int var2Lifetime1;
        try {
          gh.field_e = null;
          ge.field_c = false;
          he.field_db = false;
          gn.field_b = false;
          si.field_e = new vj();
          if (!param0) {
            CharSequence var4 = (CharSequence) null;
            s.a(true, -23, -56, (CharSequence) null);
          }
          jm.field_r = new vj();
          var5 = o.field_g;
          var1 = var5;
          for (var2 = 0; var2 < 8; var2++) {
            var5[var2] = 0;
          }
          var6 = j.field_d;
          var1Lifetime1 = var6;
          var7 = 0;
          var2Lifetime1 = var7;
          while (var7 < 8) {
            var6[var7] = 0;
            var7++;
          }
          id.field_P = 0;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "s.A(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, ck[][] param2, byte[] param3, ck[][] param4, int param5, boolean param6, String[][] param7, int[] param8, byte[] param9, ji param10, int[] param11, ji param12, pi[] param13, String[] param14, String[][] param15, ji param16) {
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
        String[] var18 = null;
        try {
          var18 = (String[]) null;
          sg.a(param15, param6, param9, param16, param11, (byte) -57, param7, param14, 1, param3, param13, param8, param1, param12, (String[]) null, param10, param4, param2, param5);
          if (param0 < 66) {
            field_Pb = 77;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_5_0 = var17;
          stackIn_5_1 = new StringBuilder().append("s.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param4 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param8 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param9 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
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
          throw dh.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(')').toString());
        }
    }

    static {
        field_Qb = new ck[8];
    }
}
