/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    private fa field_a;
    static vn[] field_b;
    private fa field_d;
    static pc field_c;

    final static int a(boolean param0, int param1, CharSequence param2, int param3) {
        int var8 = 0;
        int stackIn_43_0 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ZombieDawn.field_J;
        try {
          if (param3 >= 2 &&
            param3 <= 36) {
            var4_int = 0;
            if (param1 != 5) {
              field_b = (vn[]) null;
            }
            var5 = 0;
            var6 = 0;
            var7 = param2.length();
            for (var8 = 0; var7 > var8; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param2.charAt(var8);
              if ((var8 == 0) &&
                (var9 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var8 != 0 || (var9 != 43 ||
                !param0))) {
                if (var9 >= 48 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (65 <= var9 &&
                  90 >= var9) {
                  var9 -= 55;
                } else if (var9 >= 97 &&
                  var9 <= 122) {
                  var9 -= 87;
                } else {
                  throw new NumberFormatException();
                }
                if (var9 >= param3) {
                  throw new NumberFormatException();
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = param3 * var6 + var9;
                if (var6 != var10 / param3) {
                  throw new NumberFormatException();
                }
                var5 = 1;
                var6 = var10;
              }
            }
            if (var5 == 0) {
              throw new NumberFormatException();
            }
            stackIn_43_0 = var6;
            return stackIn_43_0;
          }
          throw new IllegalArgumentException("" + param3);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_46_0 = var4;
          stackIn_46_1 = new StringBuilder().append("tf.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param3).append(')').toString());
        }
    }

    final fa b(int param0) {
        fa var2 = this.field_a.field_q;
        if (var2 != this.field_a) {
          int var3 = 59 % ((-16 - param0) / 44);
          this.field_d = var2.field_q;
          return var2;
        }
        this.field_d = null;
        return null;
    }

    public static void c(int param0) {
        field_c = null;
        field_b = null;
        if (param0 != -12220) {
          field_b = (vn[]) null;
        }
    }

    final static void a(byte param0) {
        int[] var6 = null;
        int[] var5 = null;
        int[] var4 = null;
        int[] array$0 = null;
        int var2 = 0;
        int var3 = ZombieDawn.field_J;
        try {
          kd.field_nb[0] = sg.field_jb.d(16711680);
          kd.field_nb[1] = sg.field_jb.d(7829248);
          kd.field_nb[2] = sg.field_jb.d(16776960);
          kd.field_nb[3] = sg.field_jb.d(30464);
          kd.field_nb[4] = sg.field_jb.d(65280);
          kd.field_nb[5] = sg.field_jb.d(30583);
          kd.field_nb[6] = sg.field_jb.d(65535);
          kd.field_nb[7] = sg.field_jb.d(119);
          kd.field_nb[8] = sg.field_jb.d(255);
          kd.field_nb[9] = sg.field_jb.d(16745473);
          hm.field_L = sg.field_jb.d(16777215);
          t.field_c = sg.field_jb.d(6710886);
          var6 = sg.field_jb.field_O[0];
          var5 = var6;
          var4 = var5;
          int[] var1 = var4;
          if (param0 != 119) {
            field_b = (vn[]) null;
          }
          sg.field_jb.field_O = new int[11][];
          sg.field_jb.field_O[0] = var6;
          array$0 = new int[sg.field_jb.field_O[0].length];
          sg.field_jb.field_O[4] = array$0;
          for (var2 = 0; sg.field_jb.field_O[4].length > var2; var2++) {
            sg.field_jb.field_O[4][var2] = 16777215;
          }
          rf.a(16777215, 2, 65793, 13369344, 119);
          rf.a(4194304, 0, 8388608, 16711680, 83);
          rf.a(16777215, 1, 65793, 5481009, 86);
          rf.a(4210688, 3, 8421376, 16776960, 76);
          rf.a(0, 5, 0, 0, 121);
          rf.a(0, 6, 4473924, 10066329, param0 - 40);
          rf.a(16777215, 7, 4473924, 10066329, 108);
          rf.a(0, 8, 4996418, 14540253, param0 - 50);
          rf.a(0, 9, 16777215, 14540253, 76);
          rf.a(4096, 10, 16384, 5481009, param0 ^ 29);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "tf.E(" + param0 + ')');
        }
    }

    public tf() {
        this.field_a = new fa();
        this.field_a.field_q = this.field_a;
        this.field_a.field_r = this.field_a;
    }

    final fa a(int param0) {
        fa var2 = this.field_d;
        if (this.field_a == var2) {
          this.field_d = null;
          return null;
        }
        if (param0 == -6116) {
          this.field_d = var2.field_q;
          return var2;
        }
        tf.c(43);
        this.field_d = var2.field_q;
        return var2;
    }

    final void a(byte param0, fa param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != param1.field_r) {
            param1.d(0);
          }
          param1.field_r = this.field_a.field_r;
          param1.field_q = this.field_a;
          param1.field_r.field_q = param1;
          param1.field_q.field_r = param1;
          if (param0 > 16) {
            return;
          }
          this.field_d = (fa) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("tf.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
    }
}
