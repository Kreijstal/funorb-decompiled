/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg {
    private vd field_c;
    static String field_a;
    private gn[] field_d;
    private gn field_e;
    static String field_b;

    final boolean g(int param0) {
        int var5 = EscapeVector.obfuscationControl;
        if (param0 != -9949) {
          this.field_c = (vd) null;
        }
        if (this.a(-19836)) {
          return true;
        }
        this.field_c.b(104);
        gn[] var6 = this.field_d;
        gn[] var2 = var6;
        for (int var3 = 0; var3 < var6.length; var3++) {
          gn var4 = var6[var3];
          if (var4 != null) {
            var4.c(5);
          }
        }
        if (this.field_e != null) {
          this.field_e.c(5);
        }
        return this.a(param0 - 9887);
    }

    public static void releaseStatics(int guard) {
        field_a = null;
        int var1 = 91 % ((guard + 58) / 38);
        field_b = null;
    }

    final int a(boolean param0, int param1, int param2) {
        int var7 = EscapeVector.obfuscationControl;
        if (null == this.field_d) {
          return -1;
        }
        gn[] var8 = this.field_d;
        gn[] var4 = var8;
        if (!param0) {
          return 3;
        }
        for (int var5 = 0; var5 < var8.length; var5++) {
          gn var6 = var8[var5];
          if (var6 != null &&
            var6.field_j == param1) {
            return var6.b(param2, 80);
          }
        }
        return -1;
    }

    final boolean c(int param0) {
        int var7 = EscapeVector.obfuscationControl;
        if (null == this.field_e) {
          return false;
        }
        if (param0 < 110) {
          return false;
        }
        int var2 = this.field_e.field_j;
        int var3 = je.a(false, var2);
        if (var3 <= 0) {
          return false;
        }
        for (int var4 = 0; var3 > var4; var4++) {
          int var5 = this.field_e.b(var4, 74);
          boolean var6 = (nl.a((byte) 111, var5));
          if (!var6) {
            return false;
          }
        }
        return true;
    }

    final void a(int param0, int param1, int param2) {
        if (param2 != -22357) {
          this.a(-119, 57);
        }
        this.field_c.a(param0, param1, true);
    }

    final boolean a(int param0, boolean param1) {
        int var7 = EscapeVector.obfuscationControl;
        int var3 = je.a(param1, param0);
        if (0 >= var3) {
          return false;
        }
        for (int var4 = 0; var4 < var3; var4++) {
          int var5 = this.a(true, param0, var4);
          boolean var6 = (nl.a((byte) 98, var5));
          if (!var6) {
            return false;
          }
        }
        return true;
    }

    final boolean e(int param0) {
        if (param0 != 0) {
          this.e(45);
        }
        return this.field_c.d((byte) -83);
    }

    final int b(int param0, int param1) {
        int var6 = EscapeVector.obfuscationControl;
        if (null == this.field_d) {
          return -1;
        }
        gn[] var3 = this.field_d;
        for (int var4 = param1; var4 < var3.length; var4++) {
          gn var5 = var3[var4];
          if (var5 != null &&
            param0 == var5.field_j) {
            return var5.field_d;
          }
        }
        return -1;
    }

    final int a(int param0, int param1) {
        int var7 = EscapeVector.obfuscationControl;
        if (this.field_d == null) {
          return 0;
        }
        if (param0 != 29386) {
          this.field_e = (gn) null;
        }
        gn[] var8 = this.field_d;
        for (int var4 = 0; var8.length > var4; var4++) {
          gn var5 = var8[var4];
          if (var5 != null &&
            param1 == var5.field_j) {
            if (0 == var5.field_d) {
              if (var5.field_n <= 0) {
                return 0;
              }
              return var5.field_n;
            }
            if (var5.field_d == 1) {
              int var6 = je.a(false, param1);
              if (0 >= var6) {
                return 0;
              }
              return var6;
            }
          }
        }
        return 0;
    }

    final static boolean a(byte param0, int param1) {
        int var2 = -43 / ((param0 + 62) / 32);
        int var3 = 14;
        int var4 = var3 + 3;
        boolean stackIn_4_0 = (param1 >= var3) && (var4 > param1);
        return stackIn_4_0;
    }

    final void a(byte param0, int param1, int[] param2, int param3) {
        String stackIn_15_2 = null;
        try {
          if (param2 != null &&
            param2.length == 4) {
            if (null == this.field_e) {
              return;
            }
            if (this.field_e.field_j != param1) {
              return;
            }
            this.field_e.a((byte) -15, param3, param2);
            if (param0 != -64) {
              this.field_d = (gn[]) null;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_14_0 = runtimeException;
          StringBuilder stackIn_14_1 = new StringBuilder().append("kg.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int[] param3) {
        String stackIn_20_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          if (param3 != null &&
            param3.length == 4) {
            if (this.field_d == null) {
              return;
            }
            if (param0 != -15748) {
              return;
            }
            gn[] var5 = this.field_d;
            for (int var6 = 0; var5.length > var6; var6++) {
              gn var7 = var5[var6];
              if (var7 != null &&
                param1 == var7.field_j) {
                var7.a((byte) -15, param2, param3);
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5_ref = decompiledCaughtException;
          RuntimeException stackIn_19_0 = var5_ref;
          StringBuilder stackIn_19_1 = new StringBuilder().append("kg.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final void b(int param0) {
        int var6 = EscapeVector.obfuscationControl;
        if (this.field_d == null) {
          return;
        }
        int var2 = 127 % ((67 - param0) / 42);
        gn[] var3 = this.field_d;
        for (int var4 = 0; var3.length > var4; var4++) {
          gn var5 = var3[var4];
          if (var5 != null) {
            var5.b(7108);
          }
        }
        if (null != this.field_e) {
          this.field_e.b(7108);
        }
    }

    final boolean d(int param0) {
        int var5 = EscapeVector.obfuscationControl;
        if (null == this.field_d) {
          return false;
        }
        gn[] var6 = this.field_d;
        gn[] var2 = var6;
        for (int var3 = 0; var3 < var6.length; var3++) {
          gn var4 = var6[var3];
          if (var4 != null &&
            var4.a(false)) {
            return true;
          }
        }
        if (param0 == 17523) {
          return false;
        }
        this.field_d = (gn[]) null;
        return false;
    }

    kg() {
        this.field_c = new vd();
        int var1 = 4;
        this.field_d = new gn[var1];
        for (int var2 = 0; var1 > var2; var2++) {
          int var3 = pc.field_f[var2];
          int var4 = -1;
          if (var3 == 1) {
            var4 = 1;
          }
          int var5 = DualLinkNode.field_m[var2];
          boolean var6 = (PasswordValidator.a(1, var2) == 2);
          this.field_d[var2] = new gn(var2, var3, var4, var5, (var6), this);
        }
        int var2Lifetime1 = 2;
        int var3Lifetime1 = 1;
        int var4Lifetime1 = 0;
        int var5Lifetime1 = 1;
        boolean var6Lifetime1 = true;
        this.field_e = new gn(var2Lifetime1, var3Lifetime1, var4Lifetime1, var5Lifetime1, (var6Lifetime1), this);
    }

    final boolean a(int param0, boolean param1, int param2) {
        if (!param1) {
          return false;
        }
        if (param2 == -1) {
          return false;
        }
        if (0 == param2) {
          return this.field_c.a(1, param0);
        }
        if (1 != param2) {
          return false;
        }
        return this.field_c.a(param0, (byte) -113);
    }

    final boolean a(int param0) {
        int var5 = EscapeVector.obfuscationControl;
        if (!this.field_c.d((byte) -83)) {
          return false;
        }
        gn[] var6 = this.field_d;
        gn[] var2 = var6;
        for (int var3 = 0; var3 < var6.length; var3++) {
          gn var4 = var6[var3];
          if (var4.field_d != 1 &&
            !var4.field_i) {
            return false;
          }
        }
        if (param0 == -19836) {
          return true;
        }
        this.g(80);
        return true;
    }

    final boolean b(int param0, int param1, int param2) {
        int var7 = EscapeVector.obfuscationControl;
        if (this.field_d == null) {
          return false;
        }
        gn[] var4 = this.field_d;
        int var5 = 0;
        if (param0 != 15954) {
          this.field_e = (gn) null;
        }
        while (var5 < var4.length) {
          gn var6 = var4[var5];
          if (var6 != null &&
            param1 == var6.field_j) {
            return var6.a(0, param2);
          }
          var5++;
        }
        return false;
    }

    static {
        field_a = "Orb points: ";
        field_b = "Email: ";
    }
}
