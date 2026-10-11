/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nr extends tb implements ef {
    static String field_q;
    private r field_j;
    private r field_m;
    private boolean field_k;
    static char[] field_o;
    private int field_l;
    private la field_n;
    static nj field_p;

    final static void a(boolean param0, db param1, int param2, jj param3, int param4, java.awt.Component param5) {
        try {
          jn.a(param2, param4, param5, param2, param0, param4 + 17222, param1, param3);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "nr.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean d(int param0, int param1) {
        if (param0 <= -114) {
          return !this.e(param1, -1).field_a ? true : false;
        }
        this.a(0.3591744601726532f, 110, 81);
        return !this.e(param1, -1).field_a ? true : false;
    }

    public final int b(int param0, int param1) {
        if (param0 == 212) {
          return this.e(param1, -1).field_h;
        }
        this.field_m = (r) null;
        return this.e(param1, -1).field_h;
    }

    final static void a(int param0, int param1, vi param2) {
        mc.field_i.a(param2, false);
        if (param1 != -22754) {
          return;
        }
        try {
          aj.a(param0, param1 + 22795, param2);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "nr.N(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final ta a(int param0, byte param1) {
        ta var3 = (ta) (this.field_n.a((long)param0, false));
        if (var3 != null) {
          return var3;
        }
        byte[] var4 = this.field_j.a(param0, 0, (byte) -126);
        if (param1 < 40) {
          this.a(1.1444469690322876f, -2, -78);
          if (var4 != null) {
            var3 = new ta(new ed(var4));
            this.field_n.a(-1, var3, (long)param0);
            return var3;
          }
          return null;
        }
        if (var4 != null) {
          var3 = new ta(new ed(var4));
          this.field_n.a(-1, var3, (long)param0);
          return var3;
        }
        return null;
    }

    public final int[] a(float param0, int param1, int param2) {
        ta stackIn_5_0;
        Object stackIn_5_1;
        r stackIn_5_2;
        float stackIn_5_3;
        Object stackIn_6_1;
        boolean stackIn_7_4 = false;
        ta stackIn_14_0;
        Object stackIn_14_1;
        r stackIn_14_2;
        float stackIn_14_3;
        Object stackIn_15_1;
        boolean stackIn_16_4 = false;
        ta var4;
        Object stackIn_5_1Lifetime1;
        Object stackIn_14_1Lifetime1;
        ta var4Lifetime1;
        if (param2 == 233) {
          var4 = this.a(param1, (byte) 79);
          if (var4 == null) {
            return null;
          }
          boolean decompiledFrameRemainder1 = true;
          stackIn_14_0 = var4;
          stackIn_14_1 = this;
          stackIn_14_2 = this.field_m;
          stackIn_14_3 = param0;
          if (!this.field_k) {
            stackIn_15_1 = this;
            if (!this.e(param1, -1).field_c) {
              stackIn_16_4 = false;
              decompiledFrameRemainder1 = false;
            }
            else {
              stackIn_14_1Lifetime1 = this;
            }
          }
          if (decompiledFrameRemainder1) {
            stackIn_16_4 = true;
          }
          return ((ta) (Object) stackIn_14_0).a((ka) (this), stackIn_14_2, stackIn_14_3, stackIn_16_4);
        }
        field_p = (nj) null;
        var4Lifetime1 = this.a(param1, (byte) 79);
        if (var4Lifetime1 == null) {
          return null;
        }
        boolean decompiledFrameRemainder0 = true;
        stackIn_5_0 = var4Lifetime1;
        stackIn_5_1 = this;
        stackIn_5_2 = this.field_m;
        stackIn_5_3 = param0;
        if (!this.field_k) {
          stackIn_6_1 = this;
          if (!this.e(param1, -1).field_c) {
            stackIn_7_4 = false;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_5_1Lifetime1 = this;
          }
        }
        if (decompiledFrameRemainder0) {
          stackIn_7_4 = true;
        }
        return ((ta) (Object) stackIn_5_0).a((ka) (this), stackIn_5_2, stackIn_5_3, stackIn_7_4);
    }

    public static void b(byte param0) {
        field_o = null;
        field_q = null;
        field_p = null;
        if (param0 <= 113) {
          nr.a((byte) 16, -123, 67, -3);
        }
    }

    public final boolean c(int param0, int param1) {
        if (this.field_k) {
          return true;
        }
        if (this.e(param1, -1).field_c) {
          return true;
        }
        if (param0 == 1) {
          return false;
        }
        ta discarded$0 = this.a(-80, (byte) 53);
        return false;
    }

    final he g(int param0, int param1) {
        ta var3 = null;
        ta var3Lifetime1;
        if (param0 == 21922) {
          var3 = this.a(param1, (byte) 92);
          return var3 == null ? null : var3.field_v;
        }
        this.field_l = -110;
        var3Lifetime1 = this.a(param1, (byte) 92);
        return var3Lifetime1 == null ? null : var3Lifetime1.field_v;
    }

    final static boolean a(ed param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 64) {
            return true;
          }
          var2_int = param0.h(-11);
          stackIn_6_0 = (var2_int != 1) ? 0 : 1;
          var3 = stackIn_6_0;
          stackIn_7_0 = var3;
          return stackIn_7_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("nr.I(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public final int a(int param0, int param1) {
        if (param1 != 65535) {
          return 91;
        }
        return this.e(param0, -1).field_f & 65535;
    }

    final static er[] a(int param0, int param1, int param2, int param3, int param4) {
        er[] var6 = new er[9];
        er[] var5 = var6;
        er dupTemp$0 = ed.a(param3, param1, false);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        er dupTemp$1 = ed.a(param2, param1, false);
        var6[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (param0 != 0) {
          var6[4] = ed.a(param0, 64, false);
        }
        if (param4 <= -24) {
          return var5;
        }
        field_p = (nj) null;
        return var5;
    }

    nr(r param0, r param1, r param2, int param3, boolean param4) {
        super(param1, param0, param2);
        this.field_l = 50;
        this.field_k = false;
        try {
          this.field_k = param4 ? true : false;
          this.field_m = param2;
          this.field_j = param0;
          this.field_l = param3;
          this.field_n = new la(this.field_l);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "nr.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(byte param0, int param1, int param2, int param3) {
        int fieldTemp$0 = 0;
        int var4 = 0;
        int var4Lifetime1;
        iq.field_x.field_u = 0;
        iq.field_x.f(12, 105);
        iq.field_x.e(j.field_r.nextInt(), param0 - 115);
        iq.field_x.e(j.field_r.nextInt(), 0);
        if (param0 == 115) {
          iq.field_x.f(param2, 101);
          iq.field_x.f(param3, -67);
          iq.field_x.d(param1, param0 ^ -1670);
          iq.field_x.a(lp.field_E, jm.field_H, 9157);
          uh.field_Wb.j(18, param0 + 5);
          fieldTemp$0 = uh.field_Wb.field_u + 1;
          uh.field_Wb.field_u = uh.field_Wb.field_u + 1;
          var4 = fieldTemp$0;
          uh.field_Wb.a(0, -10140, iq.field_x.field_p, iq.field_x.field_u);
          uh.field_Wb.b((byte) -95, -var4 + uh.field_Wb.field_u);
          return;
        }
        nr.a(-111, -84, -8, -110, 72);
        iq.field_x.f(param2, 101);
        iq.field_x.f(param3, -67);
        iq.field_x.d(param1, param0 ^ -1670);
        iq.field_x.a(lp.field_E, jm.field_H, 9157);
        uh.field_Wb.j(18, param0 + 5);
        int fieldTemp$1 = uh.field_Wb.field_u + 1;
        uh.field_Wb.field_u = uh.field_Wb.field_u + 1;
        var4Lifetime1 = fieldTemp$1;
        uh.field_Wb.a(0, -10140, iq.field_x.field_p, iq.field_x.field_u);
        uh.field_Wb.b((byte) -95, -var4Lifetime1 + uh.field_Wb.field_u);
    }

    static {
        field_o = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
    }
}
