/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class en {
    private int[] field_b;
    static String field_a;
    static String field_g;
    boolean field_c;
    private jh field_m;
    private IntrusiveDeque field_f;
    private int[] field_j;
    boolean field_h;
    static int field_k;
    static IntrusiveDeque field_i;
    static long field_l;
    static PcmSample field_d;
    static String field_e;

    final int[] a(int param0, byte param1) {
        int var12 = EscapeVector.obfuscationControl;
        boolean stackIn_3_0 = !(aj.b(-101));
        boolean var3 = stackIn_3_0;
        if (var3 &&
          !this.field_h &&
          this.field_c) {
          this.b((byte) -128);
        }
        if (!this.e(127, param0)) {
          return null;
        }
        int[] var16 = this.c(param0, (byte) -122);
        int[] var14 = var16;
        int[] var4 = var14;
        if (var4 == null) {
          return null;
        }
        int var5 = this.a(10999, param0);
        int[] var15 = new int[var5];
        int[] var13 = var15;
        int[] var6 = var13;
        for (int var7 = 0; var15.length > var7; var7++) {
          var15[var7] = -1;
        }
        int var7Lifetime1 = 0;
        int var8 = 0;
        while (var16.length > var7Lifetime1) {
          for (int var9 = 0; var9 < 32; var9++) {
            boolean var10 = (this.a(1, var7Lifetime1, var16, var9));
            if (var10) {
              int var11 = 32 * var7Lifetime1 + var9;
              var15[var8] = var11;
              var8++;
              if (var8 == var5) {
                return var6;
              }
            }
          }
          var7Lifetime1++;
        }
        if (param1 > -2) {
          field_e = (String) null;
        }
        return var6;
    }

    private final boolean a(int param0, int param1, int param2) {
        ci var4 = this.b(param1, false);
        if (var4 == null) {
          return false;
        }
        if (param2 != 0) {
          field_d = (PcmSample) null;
        }
        return var4.a(param0, (byte) -100);
    }

    public static void releaseStatics(int guard) {
        field_d = null;
        field_e = null;
        field_a = null;
        if (guard != 1) {
          return;
        }
        field_i = null;
        field_g = null;
    }

    final int c(int param0, int param1) {
        int var3 = this.a(param0, true);
        if (param0 == 0) {
          return var3;
        }
        int var4 = this.d(param0, param1);
        var3 = var3 - var4;
        return var3;
    }

    private final int a(boolean param0, int param1, int[] param2, int[] param3) {
        String stackIn_17_2 = null;
        String stackIn_20_2 = null;
        try {
          if (param1 >= param3.length &&
            param1 >= param2.length) {
            int stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          if (param0) {
            this.field_j = (int[]) null;
          }
          if (param1 >= param3.length) {
            int stackIn_8_0 = param2[param1];
            return stackIn_8_0;
          }
          if (param1 < param2.length) {
            int stackIn_13_0 = this.c((byte) -101, param3[param1], param2[param1]);
            return stackIn_13_0;
          }
          int stackIn_11_0 = param3[param1];
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_16_0 = var5;
          StringBuilder stackIn_16_1 = new StringBuilder().append("en.LA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          StringBuilder stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    private final int a(int[] param0, int param1, int param2, int[] param3) {
        String stackIn_16_2 = null;
        String stackIn_19_2 = null;
        try {
          if (param2 >= param0.length &&
            param2 >= param3.length) {
            int stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          if (param0.length <= param2) {
            int stackIn_7_0 = param3[param2];
            return stackIn_7_0;
          }
          int var5_int = 53 % ((70 - param1) / 39);
          if (param3.length > param2) {
            int stackIn_12_0 = this.b((byte) -116, param0[param2], param3[param2]);
            return stackIn_12_0;
          }
          int stackIn_10_0 = param0[param2];
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_15_0 = var5;
          StringBuilder stackIn_15_1 = new StringBuilder().append("en.E(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          StringBuilder stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final void b(byte param0) {
        if (aj.b(-97)) {
          return;
        }
        if (this.field_h) {
          return;
        }
        int var2 = 95 / ((-79 - param0) / 45);
        if (null == this.field_m) {
          this.field_m = tg.b(4, 126);
          this.field_c = false;
          this.field_h = false;
        }
    }

    private final void a(byte param0, int[] param1) {
        String stackIn_23_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          if (param0 != -82) {
            return;
          }
          if (param1 == null) {
            return;
          }
          if (this.field_j == null) {
            this.field_j = param1;
            return;
          }
          int[] var7 = this.field_j;
          int[] var3 = var7;
          int var4 = 0;
          if (var7 != null) {
            var4 = var7.length;
          }
          if (param1 != null &&
            param1.length > var4) {
            var4 = param1.length;
          }
          this.field_j = new int[var4];
          for (int var5 = 0; var5 < var4; var5++) {
            this.field_j[var5] = this.a(false, var5, param1, var7);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_22_0 = var3_ref;
          StringBuilder stackIn_22_1 = new StringBuilder().append("en.NA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    private final int b(byte param0, int param1, int param2) {
        int var4 = -35 / ((param0 - 28) / 45);
        return ~param2 & param1;
    }

    private final boolean e(int param0, int param1) {
        if (param0 <= 120) {
          return true;
        }
        if (param1 == 0) {
          return true;
        }
        if (1 != param1) {
          return false;
        }
        return true;
    }

    final static Class a(String param0, byte param1) throws ClassNotFoundException {
        String stackIn_34_2 = null;
        try {
          if (param1 != 38) {
            field_a = (String) null;
          }
          if (param0.equals("B")) {
            Class stackIn_5_0 = Byte.TYPE;
            return stackIn_5_0;
          }
          if (param0.equals("I")) {
            Class stackIn_8_0 = Integer.TYPE;
            return stackIn_8_0;
          }
          if (param0.equals("S")) {
            Class stackIn_12_0 = Short.TYPE;
            return stackIn_12_0;
          }
          if (param0.equals("J")) {
            Class stackIn_15_0 = Long.TYPE;
            return stackIn_15_0;
          }
          if (param0.equals("Z")) {
            Class stackIn_18_0 = Boolean.TYPE;
            return stackIn_18_0;
          }
          if (param0.equals("F")) {
            Class stackIn_22_0 = Float.TYPE;
            return stackIn_22_0;
          }
          if (param0.equals("D")) {
            Class stackIn_26_0 = Double.TYPE;
            return stackIn_26_0;
          }
          if (!param0.equals("C")) {
            return Class.forName(param0);
          }
          Class stackIn_30_0 = Character.TYPE;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_33_0 = var2;
          StringBuilder stackIn_33_1 = new StringBuilder().append("en.HA(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(')').toString());
        }
    }

    private final ci b(int param0, boolean param1) {
        if (param0 < 0) {
          return null;
        }
        if (jb.field_l.length <= param0) {
          return null;
        }
        if (param1) {
          field_k = -102;
        }
        return jb.field_l[param0];
    }

    final Sprite b(int param0, int param1) {
        if (param1 < 98) {
          field_a = (String) null;
        }
        ci var3 = this.b(param0, false);
        if (var3 == null ||
          null == var3.field_e) {
          return qh.field_l;
        }
        return var3.field_e;
    }

    private final void b(byte param0, int param1, int param2, int param3) {
        if (this.a(param3, (byte) -127, 1)) {
          return;
        }
        if (!this.a(param2, (byte) -127, 1)) {
          return;
        }
        if (param0 > -127) {
          return;
        }
        int var7 = param3;
        int var8 = param3 ^ 255;
        GameplaySession var9 = BoundedRandomAccessFile.activeSession;
        if (var9 == null) {
          return;
        }
        var9.a(param1, false, var7, var8);
    }

    private final void a(int[] param0, int param1) {
        String stackIn_22_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          if (param0 == null) {
            return;
          }
          if (this.field_b == null) {
            this.field_b = new int[param0.length];
            return;
          }
          if (param1 != -20915) {
            this.field_j = (int[]) null;
          }
          int[] var7 = this.field_b;
          int[] var3 = var7;
          int var4 = 0;
          if (var7 != null) {
            var4 = var7.length;
          }
          if (param0 != null &&
            param0.length > var4) {
            var4 = param0.length;
          }
          this.field_b = new int[var4];
          for (int var5 = 0; var4 > var5; var5++) {
            this.field_b[var5] = this.a(var7, 118, var5, param0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_21_0 = var3_ref;
          StringBuilder stackIn_21_1 = new StringBuilder().append("en.H(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int b(int param0, int param1, int param2) {
        int var4 = EscapeVector.obfuscationControl;
        try {
          int var3_int = 1;
          while (param0 > 1) {
            if ((1 & param0) != 0) {
              var3_int = var3_int * param1;
            }
            param1 = param1 * param1;
            param0 = param0 >> 1;
          }
          if (param2 != -1) {
            int stackIn_10_0 = -53;
            return stackIn_10_0;
          }
          if (param0 != 1) {
            int stackIn_15_0 = var3_int;
            return stackIn_15_0;
          }
          int stackIn_13_0 = param1 * var3_int;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var3), "en.Q(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean a(byte param0, int param1, int param2, int param3) {
        boolean stackIn_3_0 = !(aj.b(-116));
        boolean var5 = stackIn_3_0;
        if (var5 &&
          !this.field_h &&
          this.field_c) {
          this.b((byte) 118);
        }
        if (this.a(param2, (byte) -128, 1)) {
          return false;
        }
        if (!this.a(param3, param2, param0 - 54)) {
          return false;
        }
        this.a((byte) -47, 1, param2);
        this.a((byte) -47, 0, param2);
        PasswordValidator.b(param2, -128);
        if (param0 != 54) {
          return true;
        }
        int[] var8 = pl.d(126);
        int[] var7 = var8;
        int[] var6 = var7;
        if (var6 != null &&
          4 == var8.length) {
          this.field_f.addLast(-12328, new qd(param2, param1, var8[0], var8[1], var8[2], var8[3]));
          return true;
        }
        return false;
    }

    final void d(byte param0, int param1, int param2) {
        int var7 = EscapeVector.obfuscationControl;
        if (null == jb.field_i) {
          return;
        }
        if (param0 > -63) {
          this.field_c = false;
        }
        mb[] var8 = jb.field_i;
        mb[] var4 = var8;
        for (int var5 = 0; var8.length > var5; var5++) {
          mb var6 = var8[var5];
          if (var6 == null) {
            return;
          }
          var6.a(11827, param1, param2);
        }
    }

    final void e(int param0) {
        if (aj.b(-123)) {
          return;
        }
        if (this.field_h) {
          return;
        }
        if (this.field_m == null) {
          return;
        }
        if (param0 != -19636) {
          return;
        }
        if (!this.field_m.field_h) {
          return;
        }
        if (!this.field_m.field_g) {
          this.a((byte) -82, this.field_m.field_i);
          this.a(this.field_m.field_i, -20915);
          this.field_c = false;
          this.field_m = null;
          this.field_h = true;
        } else {
          this.field_h = false;
          this.field_m = null;
          this.field_c = true;
        }
    }

    final static void a(ResourceArchive param0, int param1) {
        int var2_int = param1;
        if (!param0.a(0, da.field_d[var2_int])) {
          return;
        }
        try {
          sl.field_b[var2_int][0] = fe.a("tutorial", param0, "layer0", true);
          uj.field_a = sl.field_b[var2_int][0];
          sl.field_b[var2_int][2] = fe.a("tutorial", param0, "layer2", true);
          uf.field_e = fe.a("tutorial", param0, "edge_exit_left", true);
          wa.field_b = fe.a("tutorial", param0, "edge_exit_right", true);
          EmailAvailabilityValidator.field_r = fe.a("tutorial", param0, "edge_inner_bottom", true);
          ej.field_e = fe.a("tutorial", param0, "edge_inner_bottom_left", true);
          q.field_G = fe.a("tutorial", param0, "edge_inner_bottom_right", true);
          PacketBuffer.field_l = fe.a("tutorial", param0, "edge_inner_left", true);
          cj.field_a = fe.a("tutorial", param0, "edge_inner_right", true);
          mj.field_f = fe.a("tutorial", param0, "edge_inner_top", true);
          AccountRegistrationPanel.field_T = fe.a("tutorial", param0, "edge_inner_top_left", true);
          kn.field_h = fe.a("tutorial", param0, "edge_inner_top_right", true);
          wa.field_e = fe.a("tutorial", param0, "edge_outer", true);
          qf.field_d = fe.a("tutorial", param0, "exitbg", true);
          CipherPacketBuffer.field_n = fe.a("tutorial", param0, "panel", true);
          gm.field_a = fe.a("tutorial", param0, "platform", true);
          tk.field_a[var2_int] = fe.a("tutorial", param0, "texture", true);
          fa.field_c[var2_int] = true;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "en.PA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean f(int param0, int param1) {
        if (param1 != 1) {
          this.b((byte) 92, -90, -126, -118);
        }
        ci var3 = this.b(param0, false);
        if (var3 == null) {
          return true;
        }
        return var3.field_h;
    }

    final static void a(byte param0, long param1) {
        int var3 = -51 / ((param0 - 41) / 34);
        if (0L >= param1) {
          return;
        }
        if (param1 % 10L == 0L) {
          ae.a(-1L + param1, (byte) 118);
          ae.a(1L, (byte) 118);
        } else {
          ae.a(param1, (byte) 118);
        }
    }

    final void a(byte param0) {
        this.b((byte) -128, 1, 0, 18);
        this.b((byte) -128, 1, 1, 19);
        this.b((byte) -128, 1, 2, 20);
        this.b((byte) -128, 1, 3, 21);
        int var2 = 9 / ((-27 - param0) / 41);
    }

    final void a(boolean param0) {
        int var3 = EscapeVector.obfuscationControl;
        if (this.field_b == null) {
          return;
        }
        if (!param0) {
          this.a(42, false);
        }
        for (int var2 = 0; this.field_b.length > var2; var2++) {
          this.field_b[var2] = 0;
        }
    }

    final int a(int param0, boolean param1) {
        if (0 == param0) {
          return this.b((byte) 119, this.field_b);
        }
        if (!param1) {
          this.field_f = (IntrusiveDeque) null;
        }
        if (param0 != 1) {
          return 0;
        }
        return 32;
    }

    private final int c(byte param0, int param1, int param2) {
        if (param0 > -95) {
          this.field_m = (jh) null;
        }
        return param1 | param2;
    }

    final void c(int param0, int param1, int param2) {
        int var7 = EscapeVector.obfuscationControl;
        if (jb.field_k == null) {
          return;
        }
        jk[] var8 = jb.field_k;
        jk[] var4 = var8;
        for (int var5 = param0; var8.length > var5; var5++) {
          jk var6 = var8[var5];
          if (var6 != null) {
            var6.a((byte) 106, param2, param1);
          }
        }
    }

    private final int[] c(int param0, byte param1) {
        if (param0 == 0) {
          return this.field_b;
        }
        if (param0 == 1) {
          return this.field_j;
        }
        int var3 = 7 % ((param1 + 78) / 38);
        return null;
    }

    private final boolean c(byte param0) {
        if (param0 >= -115) {
          field_i = (IntrusiveDeque) null;
        }
        return null != this.field_m ? true : false;
    }

    private final int a(int param0, int param1) {
        if (param1 == 0) {
          return this.b((byte) 118, this.field_b);
        }
        if (param0 != 10999) {
          return 106;
        }
        if (param1 != 1) {
          return 0;
        }
        return this.b((byte) 114, this.field_j);
    }

    private final int d(int param0, int param1) {
        int var8 = EscapeVector.obfuscationControl;
        int var3 = 0;
        if (param1 != 1) {
          this.field_m = (jh) null;
        }
        int[] var4 = jb.field_z;
        for (int var5 = 0; var4.length > var5; var5++) {
          int var6 = var4[var5];
          boolean var7 = (this.a(var6, (byte) -128, param0));
          if (!var7) {
            var3++;
          }
        }
        return var3;
    }

    private final boolean a(int param0, int param1, int[] param2, int param3) {
        String stackIn_7_2 = null;
        try {
          int var5_int = param2[param1];
          int var6 = param0 << param3;
          boolean stackIn_3_0 = ((var6 & var5_int) != 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var5;
          StringBuilder stackIn_6_1 = new StringBuilder().append("en.V(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(int param0, boolean param1, int[] param2, int param3) {
        try {
          int var5_int = param2[param3];
          int var6 = 1 << param0;
          var5_int = var5_int | var6;
          if (param1) {
            this.d((byte) 123, 114, -50);
          }
          param2[param3] = var5_int;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "en.I(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final boolean b(int param0) {
        int var2 = 25 / ((9 - param0) / 54);
        return this.a(10999, 0) > 0 ? true : false;
    }

    private final void a(byte param0, int param1, int param2) {
        if (!this.e(122, param1)) {
          return;
        }
        int[] var7 = this.c(param1, (byte) -16);
        int[] var4 = var7;
        if (var7 == null) {
          return;
        }
        if (param0 != -47) {
          this.field_m = (jh) null;
        }
        int var5 = param2 / 32;
        if (var5 >= 0) {
          if (var5 >= var7.length) {
            return;
          }
          int var6 = param2 % 32;
          if (0 > var6) {
            return;
          }
          this.a(var6, false, var7, var5);
          return;
        }
    }

    final boolean b(int param0, byte param1) {
        if (param1 <= 21) {
          field_k = -22;
        }
        ci var3 = this.b(param0, false);
        if (var3 == null) {
          return true;
        }
        return var3.field_f;
    }

    final static void c(int param0) {
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        String stackIn_27_0 = null;
        String stackIn_33_0 = null;
        fd stackIn_44_0 = null;
        int var5 = 0;
        int var10 = EscapeVector.obfuscationControl;
        try {
          int var1_int = EmailSyntaxValidator.field_o;
          int var2 = param0;
          if (2 == ArchiveIndex.field_j) {
            long var3_long = -bd.field_k + td.b(128);
            var2 = (int)((-var3_long + 10999L) / 1000L);
            if (0 > var2) {
              var2 = 0;
            }
          }
          for (int var3 = 0; Js5NetworkRequest.field_I.length > var3; var3++) {
            int var4 = jj.field_a[var3];
            if (!(var4 >= 0)) {
              var5 = lh.field_e;
            } else if (var4 != cb.field_c.field_h) {
              var5 = ValidatedTextWidget.field_X;
            } else {
              var5 = pc.field_d;
            }
            String var6 = Js5NetworkRequest.field_I[var3];
            if (2 == ArchiveIndex.field_j &&
              1 == var2) {
              if (tg.field_nb.length >= qm.field_f.length) {
                stackIn_19_0 = tg.field_nb.length;
              } else {
                stackIn_19_0 = qm.field_f.length;
              }
              int var7 = stackIn_19_0;
              if (tb.field_G.length > nn.field_i.length) {
                stackIn_22_0 = tb.field_G.length;
              } else {
                stackIn_22_0 = nn.field_i.length;
              }
              int var8 = stackIn_22_0;
              if (6 <= var3 &&
                var3 < var7 + 6) {
                if (-var7 + var3 + (-6 + tg.field_nb.length) < 0) {
                  stackIn_27_0 = "";
                } else {
                  stackIn_27_0 = tg.field_nb[-var7 + (tg.field_nb.length + var3) - 6];
                }
                var6 = stackIn_27_0;
              }
              if (var7 + 7 <= var3 &&
                var3 < var7 + 7 + var8) {
                if (-var7 + (-7 + var3) < nn.field_i.length) {
                  stackIn_33_0 = nn.field_i[-var7 + (var3 - 7)];
                } else {
                  stackIn_33_0 = "";
                }
                var6 = stackIn_33_0;
              }
            }
            if (var4 == -2) {
              var6 = Integer.toString(var2);
            }
            int stackIn_38_0 = param0 ^ 94;
            String stackIn_38_1 = var6;
            boolean stackIn_39_2 = !(var4 < 0);
            int var7Lifetime1 = ee.a(stackIn_38_0, stackIn_38_1, stackIn_39_2);
            int var8Lifetime1 = ClientException.field_e - (var7Lifetime1 >> 1);
            if (var4 >= 0) {
              var1_int = var1_int + CheckboxPainter.field_s;
              if (var4 != cb.field_c.field_h) {
                stackIn_44_0 = of.field_g;
              } else {
                stackIn_44_0 = gf.field_e;
              }
              fd var9 = stackIn_44_0;
              if (var9 != null) {
                var9.a(-fe.field_k + var8Lifetime1, var1_int, -96, var7Lifetime1 + (fe.field_k << 1), (field_k << 1) + ok.field_a);
              }
              var1_int = var1_int + field_k;
            }
            if (0 <= var4) {
              pb.field_e.a(var6, var8Lifetime1, var1_int + he.field_x, var5, -1);
              var1_int = var1_int + (ok.field_a + (CheckboxPainter.field_s + field_k));
            } else {
              nb.field_a.a(var6, var8Lifetime1, var1_int + vk.field_t, var5, -1);
              var1_int = var1_int + je.field_b;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "en.D(" + param0 + ')');
        }
    }

    en() {
        this.field_f = new IntrusiveDeque();
        int var1 = 1;
        this.field_j = new int[var1];
        this.field_b = new int[var1];
        this.field_f = new IntrusiveDeque();
        this.field_h = false;
        this.field_c = false;
    }

    final boolean a(int param0, byte param1, int param2) {
        if (!this.e(127, param2)) {
          return false;
        }
        int[] var7 = this.c(param2, (byte) -14);
        int[] var4 = var7;
        if (var7 == null) {
          return false;
        }
        int var5 = param0 / 32;
        if (param1 > -124) {
          field_d = (PcmSample) null;
        }
        int[] var7Lifetime1 = var4;
        if (0 <= var5 &&
          var7Lifetime1.length > var5) {
          int var6 = param0 % 32;
          if (var6 >= 0) {
            return this.a(1, var5, var7Lifetime1, var6);
          }
          return false;
        }
        return false;
    }

    final void d(int param0) {
        int var3 = EscapeVector.obfuscationControl;
        if (this.c((byte) -123)) {
          this.e(-19636);
        }
        if (!this.field_h) {
          return;
        }
        while (true) {
          qd var2 = (qd) (this.field_f.removeFirst(-20245));
          if (var2 != null) {
            sc.a(var2, 4, 1);
            continue;
          }
          break;
        }
        if (param0 != -32464) {
          ci discarded$0 = this.b(22, true);
        }
        return;
    }

    private final int b(byte param0, int[] param1) {
        String stackIn_14_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          if (param1 == null) {
            int stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          int var3_int = 0;
          int[] var4 = param1;
          if (param0 <= 106) {
            this.field_c = false;
          }
          for (int var5 = 0; var5 < var4.length; var5++) {
            int var6 = var4[var5];
            var3_int = var3_int + ej.a(858993459, var6);
          }
          int stackIn_10_0 = var3_int;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var3;
          StringBuilder stackIn_13_1 = new StringBuilder().append("en.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        field_g = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_a = "Your email address is used to identify this account";
        field_i = new IntrusiveDeque();
        field_e = "Level score: ";
    }
}
