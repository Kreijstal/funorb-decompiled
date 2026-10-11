/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lr extends d {
    static String field_L;
    static er field_O;
    static String field_I;
    static String field_K;
    static String field_J;
    static String field_S;
    static String field_N;
    private int field_Q;
    static aa field_H;
    static cr field_P;
    static String field_M;
    static String field_T;
    private of field_R;

    final void a(byte param0, int param1, int param2, iq param3) {
        try {
          if (param0 <= 6) {
            lr.a((byte) 76);
          }
          this.field_Q = this.field_Q + 1;
          super.a((byte) 114, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "lr.E(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(boolean param0) {
        if (this.field_p) {
          return this.field_R.d(-27183);
        }
        if (param0) {
          this.a(true);
          return null;
        }
        return null;
    }

    public static void a(byte param0) {
        field_O = null;
        field_K = null;
        field_T = null;
        field_H = null;
        field_I = null;
        int var1 = 91 / ((param0 - 36) / 47);
        field_S = null;
        field_L = null;
        field_M = null;
        field_J = null;
        field_N = null;
        field_P = null;
    }

    final boolean a(byte param0, iq param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 116) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("lr.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void a(int param0, String param1, long param2) {
        CharSequence var5 = null;
        if (param0 > -18) {
          return;
        }
        try {
          ui.field_g = 2;
          ea.field_b = param1;
          var5 = (CharSequence) ((Object) param1);
          sm.field_Kb = rc.a(var5, 320);
          ie.field_Nb = param2;
          nb.h(-14829);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "lr.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        er var15 = null;
        er var16 = null;
        er var13 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = Vertigo2.field_L ? 1 : 0;
        int var9Lifetime1;
        int var10Lifetime1;
        super.a(param0, param1, param2, param3);
        if (param1 != 0) {
          return;
        }
        int var5 = this.field_o + param2 + (this.field_n >> 1);
        int var6 = this.field_t + (param3 + (this.field_s >> 1));
        ba var8 = this.field_R.a(-23996);
        if (tk.field_n == var8) {
          var15 = jn.field_b[0];
          var9 = var15.field_x << 1;
          var10 = var15.field_B << 1;
          if (cr.field_E == null) {
            cr.field_E = new er(var9, var10);
            lq.a(cr.field_E, (byte) -94);
            var15.a(112, 144, var15.field_x << 4, var15.field_B << 4, -this.field_Q << 10, 4096);
            ln.d(-28558);
            cr.field_E.d(var5 - var15.field_x, var6 - var15.field_B, 256);
            return;
          }
          if (var9 > cr.field_E.field_y) {
            cr.field_E = new er(var9, var10);
            lq.a(cr.field_E, (byte) -94);
            var15.a(112, 144, var15.field_x << 4, var15.field_B << 4, -this.field_Q << 10, 4096);
            ln.d(-28558);
            cr.field_E.d(var5 - var15.field_x, var6 - var15.field_B, 256);
            return;
          }
          if (cr.field_E.field_t < var10) {
            cr.field_E = new er(var9, var10);
            lq.a(cr.field_E, (byte) -94);
            var15.a(112, 144, var15.field_x << 4, var15.field_B << 4, -this.field_Q << 10, 4096);
            ln.d(-28558);
            cr.field_E.d(var5 - var15.field_x, var6 - var15.field_B, 256);
            return;
          }
          lq.a(cr.field_E, (byte) -94);
          bi.c();
          var15.a(112, 144, var15.field_x << 4, var15.field_B << 4, -this.field_Q << 10, 4096);
          ln.d(-28558);
          cr.field_E.d(var5 - var15.field_x, var6 - var15.field_B, 256);
          return;
        }
        if (dj.field_c == var8) {
          var16 = jn.field_b[0];
          var9Lifetime1 = var16.field_x << 1;
          var10Lifetime1 = var16.field_B << 1;
          if (cr.field_E == null) {
            cr.field_E = new er(var9Lifetime1, var10Lifetime1);
            lq.a(cr.field_E, (byte) -94);
            var16.a(112, 144, var16.field_x << 4, var16.field_B << 4, -this.field_Q << 10, 4096);
            ln.d(-28558);
            cr.field_E.d(var5 - var16.field_x, var6 - var16.field_B, 256);
            return;
          }
          if (var9Lifetime1 > cr.field_E.field_y) {
            cr.field_E = new er(var9Lifetime1, var10Lifetime1);
            lq.a(cr.field_E, (byte) -94);
            var16.a(112, 144, var16.field_x << 4, var16.field_B << 4, -this.field_Q << 10, 4096);
            ln.d(-28558);
            cr.field_E.d(var5 - var16.field_x, var6 - var16.field_B, 256);
            return;
          }
          if (cr.field_E.field_t < var10Lifetime1) {
            cr.field_E = new er(var9Lifetime1, var10Lifetime1);
            lq.a(cr.field_E, (byte) -94);
            var16.a(112, 144, var16.field_x << 4, var16.field_B << 4, -this.field_Q << 10, 4096);
            ln.d(-28558);
            cr.field_E.d(var5 - var16.field_x, var6 - var16.field_B, 256);
            return;
          }
          lq.a(cr.field_E, (byte) -94);
          bi.c();
          var16.a(112, 144, var16.field_x << 4, var16.field_B << 4, -this.field_Q << 10, 4096);
          ln.d(-28558);
          cr.field_E.d(var5 - var16.field_x, var6 - var16.field_B, 256);
          return;
        }
        if (ir.field_a == var8) {
          var13 = jn.field_b[2];
          var13.d(var5 - (var13.field_y >> 1), var6 - (var13.field_t >> 1), 256);
          return;
        }
        if (qm.field_G != var8) {
          return;
        }
        er var12 = jn.field_b[1];
        var12.d(var5 - (var12.field_y >> 1), -(var12.field_t >> 1) + var6, 256);
    }

    final static String a(int param0, int param1, CharSequence[] param2, int param3) {
        int var6_int = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_11_0 = null;
        String stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        CharSequence var7_ref_CharSequence = null;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param0 == 0) {
            stackIn_4_0 = "";
            return stackIn_4_0;
          }
          if (param0 == 1) {
            var10 = param2[param1];
            var4 = var10;
            if (var4 != null) {
              stackIn_11_0 = var10.toString();
              return stackIn_11_0;
            }
            stackIn_9_0 = "null";
            return stackIn_9_0;
          }
          var4_int = param1 + param0;
          var5 = 0;
          for (var6_int = param1; var4_int > var6_int; var6_int++) {
            var7_ref_CharSequence = param2[var6_int];
            if (var7_ref_CharSequence == null) {
              var5 += 4;
            } else {
              var5 = var5 + var7_ref_CharSequence.length();
            }
          }
          var6 = new StringBuilder(var5);
          var7 = param1;
          if (param3 != 1039685793) {
            lr.a(-3, (String) null, 50L);
          }
          while (var4_int > var7) {
            var8 = param2[var7];
            if (var8 != null) {
              discarded$0 = var6.append(var8);
            } else {
              discarded$1 = var6.append("null");
            }
            var7++;
          }
          stackIn_28_0 = var6.toString();
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_31_0 = var4_ref;
          stackIn_31_1 = new StringBuilder().append("lr.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var24 = 0;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        RuntimeException decompiledCaughtException = null;
        var35 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param4 == param1 &&
            param5 == param6 &&
            param0 == param9 &&
            param7 == param3) {
            eh.a(param7, param9, (byte) -4, param5, param8, param1);
          } else {
            var10_int = param1;
            var11 = param5;
            var12 = 3 * param1;
            var13 = 3 * param5;
            var14 = 3 * param4;
            var15 = param6 * 3;
            var16 = param0 * 3;
            var17 = 3 * param3;
            var18 = param9 - var16 + var14 - param1;
            var19 = -param5 + (var15 - var17 + param7);
            var20 = -var14 + (var16 - (var14 - var12));
            var21 = var13 - var15 + (var17 - var15);
            var22 = -var12 + var14;
            var23 = -var13 + var15;
            for (var24 = 128; var24 <= 4096; var24 += 128) {
              var25 = var24 * var24 >> 12;
              var26 = var25 * var24 >> 12;
              var27 = var18 * var26;
              var28 = var19 * var26;
              var29 = var20 * var25;
              var30 = var25 * var21;
              var31 = var24 * var22;
              var32 = var23 * var24;
              var33 = (var31 + var29 + var27 >> 12) + param1;
              var34 = (var28 + (var30 + var32) >> 12) + param5;
              eh.a(var34, var33, (byte) -4, var11, param8, var10_int);
              var11 = var34;
              var10_int = var33;
            }
          }
          if (param2 > 13) {
            return;
          }
          field_O = (er) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var10), "lr.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    final static int e(byte param0) {
        int stackIn_23_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          var1_int = 0;
          var2 = 0;
          while (gf.a(false)) {
            ve.field_d.d((byte) 81);
            if (ve.field_d.a(84)) {
              var1_int = 1;
            }
            if (de.field_f != 13) {
              continue;
            }
            var2 = 1;
          }
          ve.field_d.a((byte) -29, fk.b(gb.field_d, 1282642017, ed.field_n), fk.b(no.field_e, 1282642017, sd.field_N));
          if (ve.field_d.a(84)) {
            var1_int = 1;
          }
          var3 = 0;
          if (var1_int != 0 &&
            0 <= ve.field_d.field_c) {
            var3 = gi.field_n[ve.field_d.field_c];
            if (var3 == 2) {
              hd.a((byte) 47);
            } else if (var3 == 5) {
              hd.a((byte) 47);
            }
          } else {
            if (var2 != 0 &&
              da.field_j != 2) {
              hd.a((byte) 47);
            }
          }
          if (param0 > -52) {
            stackIn_23_0 = 1;
            return stackIn_23_0;
          }
          if (var3 == 0 &&
            2 == da.field_j) {
            var4 = -qe.field_cb + gk.a(52);
            var6 = (int)((-var4 + 10999L) / 1000L);
            if (var6 <= 0) {
              var3 = 2;
              bl.a(true, 5, -30962);
            }
          }
          stackIn_29_0 = var3;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var1), "lr.B(" + param0 + ')');
        }
    }

    lr(of param0) {
        try {
          this.field_R = param0;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "lr.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_J = "Searching for an opponent";
        field_K = "+<%0>";
        field_L = "Checking";
        field_I = "game complete";
        field_S = null;
        field_M = "Invalid password.";
        field_T = "NEXT LEVEL IN: <%0>";
        field_N = "Close";
    }
}
