/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gn {
    static PcmSample field_e;
    boolean field_i;
    private int field_c;
    private dc field_m;
    static int[] field_k;
    private kg field_f;
    int field_j;
    static String field_b;
    int field_n;
    private IntrusiveDeque field_h;
    int field_d;
    private boolean field_a;
    private int field_g;
    static String field_l;

    final void b(int param0) {
        Object var2 = null;
        int var3 = EscapeVector.obfuscationControl;
        if (param0 == 7108) {
          if (aj.b(-128)) {
            return;
          }
          if (this.field_d != 0) {
            if (this.field_d != 1) {
              return;
            }
            while (true) {
              IntValueNode var2_ref2 = (IntValueNode) (this.field_h.removeFirst(param0 - 27353));
              if (var2_ref2 == null) {
                return;
              }
              this.field_f.a(this.field_c, var2_ref2.value, param0 ^ -19601);
            }
          }
          while (true) {
            cc var2_ref = (cc) (this.field_h.removeFirst(-20245));
            if (var2_ref != null) {
              PointCloudEffect.a(5, (byte) -107, var2_ref);
              continue;
            }
            break;
          }
          if (this.field_d != 1) {
            return;
          }
          while (true) {
            IntValueNode var2_ref2Lifetime3 = (IntValueNode) (this.field_h.removeFirst(param0 - 27353));
            if (var2_ref2Lifetime3 == null) {
              return;
            }
            this.field_f.a(this.field_c, var2_ref2Lifetime3.value, param0 ^ -19601);
          }
        }
        this.field_j = 78;
        if (aj.b(-128)) {
          return;
        }
        if (this.field_d != 0) {
          if (this.field_d != 1) {
            return;
          }
          while (true) {
            IntValueNode var2_ref2Lifetime1 = (IntValueNode) (this.field_h.removeFirst(param0 - 27353));
            if (var2_ref2Lifetime1 == null) {
              return;
            }
            this.field_f.a(this.field_c, var2_ref2Lifetime1.value, param0 ^ -19601);
          }
        }
        while (true) {
          cc var4 = (cc) (this.field_h.removeFirst(-20245));
          if (var4 != null) {
            PointCloudEffect.a(5, (byte) -107, var4);
            continue;
          }
          break;
        }
        if (this.field_d != 1) {
          return;
        }
        while (true) {
          IntValueNode var2_ref2Lifetime2 = (IntValueNode) (this.field_h.removeFirst(param0 - 27353));
          if (var2_ref2Lifetime2 == null) {
            return;
          }
          this.field_f.a(this.field_c, var2_ref2Lifetime2.value, param0 ^ -19601);
        }
    }

    private final void a(byte param0) {
        int var2 = -18 / ((73 - param0) / 34);
    }

    public static void releaseStatics(boolean guard) {
        field_e = null;
        field_l = null;
        if (guard) {
          return;
        }
        field_k = null;
        field_b = null;
    }

    private final void d(int param0) {
        if (param0 <= 25) {
          this.field_g = 98;
          return;
        }
    }

    final static void a(dk[] param0, boolean param1, byte param2) {
        String stackIn_18_2 = null;
        int[] var4 = null;
        int[] var5 = null;
        int var9 = EscapeVector.obfuscationControl;
        try {
          if (param0 == null) {
            return;
          }
          int[] var11 = new int[]{3170352, 8421504, 8421504};
          if (!param1) {
            var5 = new int[]{6340704, 16777215, 16777215};
            var4 = new int[]{6340704, 16777215, 16777215};
          } else {
            var5 = new int[]{5275728, 16777215, 10551200};
            var4 = new int[]{5275728, 16777215, 6340704};
          }
          if (param2 != 41) {
            CharSequence var10 = (CharSequence) null;
            gn.a(126, (CharSequence) null);
          }
          dk[] var6 = param0;
          for (int var7 = 0; var6.length > var7; var7++) {
            dk var8 = var6[var7];
            if (var8 != null) {
              var8.a(var4, var11, (byte) -123, var5);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var3;
          StringBuilder stackIn_17_1 = new StringBuilder().append("gn.N(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1) {
        if (param1 < 0) {
          return false;
        }
        int var3 = je.a(false, this.field_j);
        if (var3 <= param1) {
          return false;
        }
        if (param0 == this.field_d) {
          return this.a(true, param1);
        }
        if (this.field_d != 1) {
          return false;
        }
        return true;
    }

    final int b(int param0, int param1) {
        if (!this.field_i) {
          return -1;
        }
        if (param0 < 0) {
          return -1;
        }
        int var3 = je.a(false, this.field_j);
        if (param0 >= var3) {
          return -1;
        }
        if (0 != this.field_d) {
          int var4 = -109 / ((37 - param1) / 36);
          if (this.field_d != 1) {
            return -1;
          }
          if (this.a(param0, (byte) 67)) {
            return 0;
          }
          if (this.field_f.a(param0, true, this.field_g)) {
            return 0;
          }
          return -1;
        }
        if (param0 < this.field_n) {
          return 0;
        }
        if (this.field_n == param0) {
          return 1;
        }
        int var4Lifetime1 = -109 / ((37 - param1) / 36);
        if (this.field_d != 1) {
          return -1;
        }
        if (this.a(param0, (byte) 67)) {
          return 0;
        }
        if (this.field_f.a(param0, true, this.field_g)) {
          return 0;
        }
        return -1;
    }

    final static int a(int param0, CharSequence param1) {
        String stackIn_7_2 = null;
        try {
          if (param0 != 16777215) {
            gn.releaseStatics(true);
          }
          int stackIn_3_0 = wk.a(true, 10, param1, 97);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var2;
          StringBuilder stackIn_6_1 = new StringBuilder().append("gn.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void a(byte param0, int param1, int[] param2) {
        String stackIn_28_2 = null;
        try {
          if (param2 != null &&
            4 == param2.length) {
            if (param1 < 0) {
              return;
            }
            int var4_int = je.a(false, this.field_j);
            if (var4_int <= param1) {
              return;
            }
            if (this.field_d == 0 &&
              !this.a(true, param1)) {
              return;
            }
            if (null == this.field_h) {
              this.field_h = new IntrusiveDeque();
            }
            if (0 == this.field_d) {
              this.field_n = 1 + param1;
              if (this.field_n >= var4_int) {
                this.field_n = var4_int - 1;
              }
              cc var5 = new cc(this.field_j, param1, param2[0], param2[1], param2[2], param2[3]);
              this.field_h.addLast(-12328, var5);
              this.d(87);
            }
            if (1 == this.field_d) {
              IntValueNode var5_ref = new IntValueNode(param1);
              this.field_h.addLast(param0 - 12313, var5_ref);
            }
            if (param0 != -15) {
              this.a(-9, -123);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_27_0 = var4;
          StringBuilder stackIn_27_1 = new StringBuilder().append("gn.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final boolean a(boolean param0) {
        if (param0) {
          this.a(false);
          if (this.field_h != null) {
            return !this.field_h.isEmpty(-100) ? true : false;
          }
          return false;
        }
        if (this.field_h != null) {
          return !this.field_h.isEmpty(-100) ? true : false;
        }
        return false;
    }

    gn(int param0, int param1, int param2, int param3, boolean param4, kg param5) {
        this(param0, param1, param5);
        try {
          this.field_a = param4 ? true : false;
          this.field_g = param3;
          this.field_c = param2;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "gn.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        if (param0 > -107) {
          dk[] var2 = (dk[]) null;
          gn.a((dk[]) null, false, (byte) -37);
          uk.b(0);
          return;
        }
        uk.b(0);
    }

    private final boolean a(boolean param0, int param1) {
        if (param1 == this.field_n) {
          return true;
        }
        if (this.field_a &&
          !UiContainer.e((byte) 104)) {
          return false;
        }
        if (aj.b(-117) &&
          -1 == this.field_n &&
          0 == param1) {
          return true;
        }
        if (param0) {
          return false;
        }
        this.b(-96, 125);
        return false;
    }

    private final boolean a(int param0, byte param1) {
        int var5 = EscapeVector.obfuscationControl;
        if (this.field_d != 1) {
          return false;
        }
        if (this.field_h == null) {
          return false;
        }
        if (this.field_h.isEmpty(-110)) {
          return false;
        }
        if (param1 > 36) {
          IntrusiveNode var3 = this.field_h.first(false);
          while (var3 != null) {
            IntValueNode var6 = (IntValueNode) (var3);
            if (param0 == var6.value) {
              return true;
            }
            var3 = this.field_h.next((byte) 70);
          }
          return false;
        }
        boolean discarded$5 = this.a(true, 29);
        IntrusiveNode var3Lifetime1 = this.field_h.first(false);
        while (var3Lifetime1 != null) {
          IntValueNode var7 = (IntValueNode) (var3Lifetime1);
          if (param0 == var7.value) {
            return true;
          }
          var3Lifetime1 = this.field_h.next((byte) 70);
        }
        return false;
    }

    final void c(int param0) {
        int var2;
        if (param0 != 5) {
          this.a(true);
          if (this.field_i) {
            return;
          }
          if (!this.field_a) {
            if (this.field_d == 0) {
              if (this.field_m == null) {
                this.field_m = wc.a(this.field_j, 5, 1, (byte) -51);
              }
              this.field_i = this.field_m.field_g;
              if (this.field_i) {
                var2 = this.field_m.field_h[0];
                if (this.field_a) {
                  this.field_n = var2;
                } else if (var2 > this.field_n) {
                  this.field_n = var2;
                }
                this.field_m = null;
                this.a((byte) -7);
              }
            } else if (1 == this.field_d) {
              this.field_i = this.field_f.e(0);
            } else {
              this.field_i = false;
            }
            return;
          }
          if (!UiContainer.e((byte) 101)) {
            this.field_i = true;
            return;
          }
          if (this.field_d != 0) {
            if (1 == this.field_d) {
              this.field_i = this.field_f.e(0);
            } else {
              this.field_i = false;
            }
            return;
          }
          if (this.field_m == null) {
            this.field_m = wc.a(this.field_j, 5, 1, (byte) -51);
          }
          this.field_i = this.field_m.field_g;
          if (!this.field_i) {
            return;
          }
        } else {
          if (this.field_i) {
            return;
          }
          if (!this.field_a) {
            if (this.field_d != 0) {
              if (1 == this.field_d) {
                this.field_i = this.field_f.e(0);
              } else {
                this.field_i = false;
              }
              return;
            }
            if (this.field_m == null) {
              this.field_m = wc.a(this.field_j, 5, 1, (byte) -51);
            }
            this.field_i = this.field_m.field_g;
            if (!this.field_i) {
              return;
            }
            var2 = this.field_m.field_h[0];
            if (this.field_a) {
              this.field_n = var2;
            } else if (var2 > this.field_n) {
              this.field_n = var2;
            }
            this.field_m = null;
            this.a((byte) -7);
            return;
          }
          if (!UiContainer.e((byte) 101)) {
            this.field_i = true;
            return;
          }
          if (this.field_d != 0) {
            if (1 == this.field_d) {
              this.field_i = this.field_f.e(0);
            } else {
              this.field_i = false;
            }
            return;
          }
          if (this.field_m == null) {
            this.field_m = wc.a(this.field_j, 5, 1, (byte) -51);
          }
          this.field_i = this.field_m.field_g;
          if (!this.field_i) {
            return;
          }
        }
        int var2Lifetime1 = this.field_m.field_h[0];
        if (this.field_a) {
          this.field_n = var2Lifetime1;
        } else if (var2Lifetime1 > this.field_n) {
          this.field_n = var2Lifetime1;
        }
        this.field_m = null;
        this.a((byte) -7);
    }

    private gn(int param0, int param1, kg param2) {
        this.field_c = -1;
        this.field_g = -1;
        try {
          this.field_d = param1;
          this.field_j = param0;
          this.field_n = -1;
          this.field_f = param2;
          this.field_i = false;
          if (1 == this.field_d) {
            this.field_i = this.field_f.e(0);
          }
          this.field_h = new IntrusiveDeque();
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "gn.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Passwords can only contain letters and numbers";
        field_l = "Rock buster";
    }
}
