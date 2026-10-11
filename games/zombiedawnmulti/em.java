/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em extends wk {
    private pm field_R;
    static int[] field_W;
    static int[][] field_ab;
    static boolean field_P;
    private pm field_T;
    static int[] field_O;
    private boolean field_Z;
    static long field_N;
    static String field_V;
    static qh field_U;
    static ri field_X;
    static int[][][] field_Y;
    static int field_bb;
    static volatile int field_cb;
    private pm field_Q;

    final String d(byte param0) {
        String var2 = this.field_T.d((byte) -113);
        if (var2 != null) {
          return var2;
        }
        if (this.field_l) {
          return this.field_x == null ? this.field_j : this.field_x;
        }
        int var3 = 62 / ((53 - param0) / 57);
        return null;
    }

    final int j(int param0) {
        NumberFormatException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          if (param0 == -194) {
            stackIn_4_0 = Integer.parseInt(this.field_T.field_j) - 1;
            return stackIn_4_0;
          }
          stackIn_2_0 = -21;
          return stackIn_2_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    private final void a(String param0, int param1, int param2, cf param3, boolean param4) {
        if (!param4) {
          return;
        }
        try {
          cp.field_H.b(param0, param3.field_y + param1 + (param3.field_n >> 1), param3.field_i + (param2 - 5), 16777215, -1);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "em.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void a(int param0, dj param1) {
        try {
          super.a(param0 ^ 0, param1);
          this.field_R.field_A = (bj) ((Object) param1);
          this.field_T.field_A = (bj) ((Object) param1);
          if (param0 != 3) {
            dj var4 = (dj) null;
            this.a(-101, (dj) null);
          }
          this.field_Q.field_A = (bj) ((Object) param1);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "em.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, 28972, param3, param4);
        int var6 = -130 + param3 >> 1;
        if (this.field_Z) {
          this.field_T.b(var6, 0, 28972, 25, param4);
          this.field_R.b(45 + var6, 0, param2 ^ 0, 25, param4);
        } else {
          this.field_R.b(var6, 0, param2 ^ 0, 25, param4);
          this.field_T.b(var6 + 45, 0, 28972, 25, param4);
        }
        this.field_Q.b(var6 + 90, 0, param2, 40, param4);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, ja[] param5, int param6, int param7, fm param8, int param9, int param10, int param11, int param12, ja[] param13, int param14, fm param15, ja[] param16, int param17, int param18, int param19, int param20) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          if (param2 != 2) {
            return;
          }
          jl.a(param4, param18, param3, param20, param11, param14, param8, new pd(param5), new pd(param13), param17, param19, param10, param7, param9, param6, param15, param12, param0, new pd(param16), param1, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_6_0 = var21;
          stackIn_6_1 = new StringBuilder().append("em.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param14).append(',');
          if (param15 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param16 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param17).append(',').append(param18).append(',').append(param19).append(',').append(param20).append(')').toString());
        }
    }

    final int i(int param0) {
        NumberFormatException var2 = null;
        CharSequence var3 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        if (param0 != 1) {
          var3 = (CharSequence) null;
          em.a((CharSequence) null, (byte) 36);
        }
        try {
          stackIn_3_0 = Integer.parseInt(this.field_R.field_j);
          return stackIn_3_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    public static void k(int param0) {
        field_W = null;
        if (param0 != 4) {
          field_N = 114L;
        }
        field_U = null;
        field_Y = (int[][][]) null;
        field_O = null;
        field_ab = (int[][]) null;
        field_X = null;
        field_V = null;
    }

    final boolean a(int param0) {
        if (null != this.field_R.field_j &&
          this.field_R.field_j.length() != 0) {
          if (this.field_T.field_j == null) {
            return true;
          }
          if (this.field_T.field_j.length() == 0) {
            return true;
          }
          if (null != this.field_Q.field_j &&
            0 != this.field_Q.field_j.length()) {
            if (param0 != 1872) {
              field_N = -117L;
            }
            return false;
          }
          return true;
        }
        return true;
    }

    final static boolean a(CharSequence param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (!vd.a(true, param0, (byte) -122)) {
            return false;
          }
          var2_int = 0;
          while (true) {
            if (var2_int >= param0.length()) {
              if (param1 != -38) {
                em.k(19);
              }
              return true;
            }
            if (lo.a(param1 ^ -8230, param0.charAt(var2_int))) {
              var2_int++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("em.L(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0 ^ 0, param1, param2, param3);
        if (0 != param2) {
          return;
        }
        param3 = param3 + this.field_y;
        param1 = param1 + this.field_i;
        this.a(wg.field_b, param3, param1, this.field_R, true);
        this.a(eo.field_a, param3, param1, this.field_T, true);
        this.a(ij.field_a, param3, param1, this.field_Q, true);
        if (param0 != -2) {
          field_cb = -58;
        }
    }

    private em(nl param0, boolean param1) {
        super(0, 0, 0, 0, (nl) null);
        try {
          this.field_R = (pm) ((Object) new on("", (bj) null, 2));
          this.field_T = (pm) ((Object) new on("", (bj) null, 2));
          this.field_Q = (pm) ((Object) new on("", (bj) null, 4));
          this.field_Q.field_h = param0;
          this.field_T.field_h = param0;
          this.field_R.field_h = param0;
          this.field_Z = param1 ? true : false;
          if (!this.field_Z) {
            this.b((byte) 111, this.field_R);
            this.b((byte) 76, this.field_T);
          } else {
            this.b((byte) 123, this.field_T);
            this.b((byte) 94, this.field_R);
          }
          this.b((byte) 124, this.field_Q);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "em.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    em(nl param0, boolean param1, int param2, int param3, int param4, int param5) {
        this(param0, param1);
        try {
          this.b(param2, param3, 28972, param4, param5);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "em.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final int g(byte param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        if (param0 >= -22) {
          return -101;
        }
        try {
          stackIn_3_0 = Integer.parseInt(this.field_Q.field_j);
          return stackIn_3_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
          String var2 = null;
          int var3 = 0;
          String var4 = null;
          java.net.URL var5 = null;
          RuntimeException stackIn_10_0 = null;
          StringBuilder stackIn_10_1 = null;
          String stackIn_11_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              var2 = param1.getDocumentBase().getFile();
              var3 = var2.indexOf('?');
              var4 = "reload.ws";
              if (0 <= var3) {
                var4 = var4 + var2.substring(var3);
              }
              var5 = new java.net.URL(param1.getCodeBase(), var4);
              param1.getAppletContext().showDocument(gf.a(param1, true, var5), "_self");
              if (param0) {
                field_bb = 102;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_10_0 = var2_ref2;
            stackIn_10_1 = new StringBuilder().append("em.M(").append(param0).append(',');
            if (param1 == null) {
              stackIn_11_2 = "null";
            } else {
              stackIn_11_2 = "{...}";
            }
            throw fa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        int var2 = 0;
        int var0;
        int var1;
        int var0Lifetime1;
        int var0Lifetime2;
        int var1Lifetime1;
        field_P = false;
        field_W = new int[63];
        field_cb = 0;
        field_V = "This will clear your mind and help you think faster.";
        field_ab = new int[63][2];
        for (var0 = 0; var0 < field_ab.length; var0++) {
          for (var1 = 0; field_ab[var0].length > var1; var1++) {
            field_ab[var0][var1] = 255;
            if (19 <= var0 &&
              var0 < 44) {
              field_ab[var0][var1] = 19;
            }
          }
        }
        vm.d(93, 4, 1);
        vm.d(95, 2, 58);
        vm.d(-84, 57, 58);
        vm.d(75, 56, 59);
        wp.a(46, 5, 14, 0);
        wp.a(56, 7, 2, 0);
        vm.d(-115, 9, 8);
        wp.a(9, 10, 52, 0);
        wp.a(9, 11, 60, 0);
        wp.a(11, 12, 34, 0);
        wp.a(50, 13, 34, 0);
        wp.a(32, 14, 54, 0);
        wp.a(4, 15, 57, 0);
        wp.a(2, 16, 57, 0);
        wp.a(33, 17, 7, 0);
        wp.a(36, 18, 37, 0);
        vm.d(103, 60, 53);
        vm.d(-109, 55, 3);
        vm.d(-120, 54, 61);
        vm.d(-54, 52, 53);
        vm.d(-128, 51, 8);
        wp.a(52, 50, 51, 0);
        vm.d(-72, 49, 54);
        wp.a(50, 48, 10, 0);
        wp.a(46, 47, 49, 0);
        wp.a(49, 35, 14, 0);
        wp.a(47, 45, 35, 0);
        wp.a(12, 44, 48, 0);
        vm.d(-127, 32, 0);
        vm.d(-94, 33, 56);
        vm.d(125, 34, 51);
        wp.a(55, 46, 32, 0);
        wp.a(7, 36, 15, 0);
        wp.a(33, 37, 16, 0);
        vm.d(-56, 38, 11);
        field_Y = new int[3][5][4];
        for (var0Lifetime1 = 0; var0Lifetime1 < field_Y.length; var0Lifetime1++) {
          for (var1Lifetime1 = 0; var1Lifetime1 < field_Y[0].length; var1Lifetime1++) {
            for (var2 = 0; field_Y[0][0].length > var2; var2++) {
              field_Y[var0Lifetime1][var1Lifetime1][var2] = 255;
            }
          }
        }
        field_Y[0][0][2] = 61;
        field_Y[0][0][1] = 0;
        field_Y[0][0][0] = 3;
        field_Y[0][1][1] = 32;
        field_Y[0][1][2] = 54;
        field_Y[0][1][0] = 55;
        field_Y[0][2][0] = 46;
        field_Y[0][2][1] = 49;
        field_Y[0][2][2] = 14;
        field_Y[0][3][0] = 47;
        field_Y[0][3][2] = 35;
        field_Y[0][3][1] = 5;
        field_Y[0][4][0] = 45;
        field_Y[1][0][0] = 59;
        field_Y[1][0][1] = 1;
        field_Y[1][0][2] = 58;
        field_Y[1][1][3] = 57;
        field_Y[1][1][0] = 56;
        field_Y[1][1][2] = 2;
        field_Y[1][1][1] = 4;
        field_Y[1][2][2] = 15;
        field_Y[1][2][1] = 7;
        field_Y[1][2][0] = 33;
        field_Y[1][2][3] = 16;
        field_Y[1][3][1] = 36;
        field_Y[1][3][0] = 17;
        field_Y[1][3][2] = 37;
        field_Y[1][4][0] = 18;
        field_Y[2][0][0] = 53;
        field_Y[2][0][1] = 8;
        field_Y[2][1][1] = 9;
        field_Y[2][1][3] = 51;
        field_Y[2][1][0] = 60;
        field_Y[2][1][2] = 52;
        field_Y[2][2][0] = 11;
        field_Y[2][2][3] = 34;
        field_Y[2][2][2] = 50;
        field_Y[2][2][1] = 10;
        field_Y[2][3][1] = 12;
        field_Y[2][3][3] = 13;
        field_Y[2][3][2] = 48;
        field_Y[2][3][0] = 38;
        field_Y[2][4][0] = 44;
        field_O = new int[19];
        field_N = 0L;
        wf.a(3, 38, -1);
        wf.a(2, 38, -1);
        wf.a(4, 37, -1);
        wf.a(7, 37, -1);
        wf.a(1, 37, -1);
        wf.a(2, 32, -1);
        wf.a(0, 32, -1);
        wf.a(15, 32, -1);
        wf.a(13, 36, -1);
        wf.a(4, 34, -1);
        wf.a(8, 34, -1);
        wf.a(14, 33, -1);
        wf.a(16, 33, -1);
        wf.a(5, 33, -1);
        wf.a(5, 35, -1);
        for (var0Lifetime2 = 0; var0Lifetime2 < 63; var0Lifetime2++) {
          field_W[var0Lifetime2] = 100;
        }
        field_W[57] = 167;
        field_W[45] = 7499;
        field_W[60] = 139;
        field_W[16] = 547;
        field_W[7] = 631;
        field_W[56] = 149;
        field_W[61] = 43;
        field_W[35] = 2017;
        field_W[9] = 163;
        field_W[15] = 449;
        field_W[38] = 2005;
        field_W[1] = 59;
        field_W[37] = 2011;
        field_W[4] = 127;
        field_W[10] = 509;
        field_W[12] = 2029;
        field_W[49] = 647;
        field_W[17] = 1997;
        field_W[0] = 53;
        field_W[48] = 1993;
        field_W[32] = 131;
        field_W[2] = 137;
        field_W[13] = 1987;
        field_W[54] = 113;
        field_W[53] = 73;
        field_W[47] = 2003;
        field_W[14] = 467;
        field_W[46] = 593;
        field_W[5] = 2039;
        field_W[52] = 173;
        field_W[3] = 61;
        field_W[51] = 157;
        field_W[36] = 2027;
        field_W[55] = 151;
        field_W[44] = 7489;
        field_W[11] = 491;
        field_W[50] = 523;
        field_W[8] = 83;
        field_W[59] = 67;
        field_W[58] = 29;
        field_W[33] = 569;
        field_W[34] = 607;
        field_W[18] = 7507;
    }
}
