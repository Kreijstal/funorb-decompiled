/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    boolean field_h;
    static li field_d;
    private int field_g;
    private int field_b;
    private int field_e;
    int field_i;
    private int field_j;
    static de field_a;
    int field_k;
    private int field_f;
    static String field_c;

    final boolean c(int param0) {
        boolean stackIn_8_0 = false;
        if (param0 != -1) {
          this.field_h = true;
        }
        stackIn_8_0 = (this.field_f != 0) || (this.field_e == 84) || (this.field_e == 83);
        return stackIn_8_0;
    }

    final void g(int param0) {
        this.field_b = 0;
        this.field_e = 0;
        if (param0 <= 92) {
          return;
        }
        this.field_f = 0;
        if (this.field_j == 0) {
          this.field_e = tb.field_d;
        }
    }

    final boolean a(byte param0) {
        if (param0 >= -34) {
          this.d(110);
        }
        return 0 != this.field_j ? true : false;
    }

    final void a(int param0, byte param1, int param2) {
        int var4;
        if (param0 >= this.field_i) {
          throw new IllegalArgumentException();
        }
        var4 = -73 / ((83 - param1) / 32);
        if (this.field_i <= param2) {
          throw new IllegalArgumentException();
        }
        this.field_b = 0;
        this.field_f = 0;
        this.field_e = 0;
        if (dl.field_h != 0) {
          this.field_g = t.field_k;
          this.field_j = dl.field_h;
          this.field_h = true;
          this.field_k = param2;
          this.field_f = dl.field_h;
          this.field_b = dl.field_h;
        }
        if (0 != this.field_j &&
          k.field_c != 0) {
          if (this.field_g <= 0) {
            this.field_g = ah.field_b;
            this.field_f = this.field_j;
          }
          this.field_g = this.field_g - 1;
        }
        if (dl.field_h == 0 &&
          0 == k.field_c) {
          this.field_j = 0;
        }
        if (0 == this.field_j) {
          if (!this.field_h &&
            !d.field_s) {
            return;
          }
          if (0 > param0) {
            if (this.field_h) {
              this.field_k = -1;
            }
          } else {
            if (this.field_k != param0) {
            }
            this.field_k = param0;
            this.field_h = true;
          }
        }
        return;
    }

    final void c(byte param0) {
        this.field_b = 0;
        this.field_f = 0;
        this.field_e = 0;
        if (this.field_j == 0) {
          this.field_e = tb.field_d;
        }
        if (this.field_j == 0 &&
          tb.field_d == 96) {
          if (this.field_k <= 0) {
            this.field_k = this.field_i;
          }
          this.field_k = this.field_k - 1;
          this.field_h = false;
        }
        if (this.field_j == 0 &&
          97 == tb.field_d) {
          this.field_k = this.field_k + 1;
          if (this.field_i <= this.field_k) {
            this.field_k = 0;
          }
          this.field_h = false;
        }
        if (param0 <= 10) {
          this.field_b = 25;
        }
    }

    final boolean b(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 != 2) {
          return true;
        }
        stackIn_7_0 = (this.field_f == 2) || (this.field_e == 96);
        return stackIn_7_0;
    }

    final void a(int param0, int param1) {
        if (0 == this.field_j) {
          this.field_h = false;
          this.field_k = param1;
        }
        if (param0 != 31973) {
          this.field_e = 70;
        }
    }

    final void b(byte param0) {
        this.field_e = 0;
        this.field_b = 0;
        this.field_f = 0;
        if (param0 != 76) {
          return;
        }
        if (this.field_j == 0) {
          this.field_e = tb.field_d;
        }
        if (0 == this.field_j &&
          tb.field_d == 98) {
          if (this.field_k <= 0) {
            this.field_k = this.field_i;
          }
          this.field_k = this.field_k - 1;
          this.field_h = false;
        }
        if (this.field_j == 0 &&
          tb.field_d == 99) {
          this.field_k = this.field_k + 1;
          this.field_h = false;
          if (this.field_i <= this.field_k) {
            this.field_k = 0;
          }
        }
    }

    final static void a(int param0, vk param1) {
        int dupTemp$3 = 0;
        int dupTemp$0 = 0;
        int var3 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var5 = Main.field_T;
        try {
          for (var2_int = 0; var2_int < 3; var2_int++) {
            ab.field_u[var2_int] = 0;
          }
          for (var2_intLifetime1 = 0; var2_intLifetime1 < jh.field_c; var2_intLifetime1++) {
            if (param1.field_k == me.field_b[var2_intLifetime1].field_k) {
              dupTemp$3 = me.field_b[var2_intLifetime1].b(2);
              ab.field_u[dupTemp$3] = ab.field_u[dupTemp$3] + 1;
            }
          }
          dupTemp$0 = param1.b(2);
          ab.field_u[dupTemp$0] = ab.field_u[dupTemp$0] + 1;
          var2_intLifetime2 = 0;
          for (var3 = 0; var3 < jh.field_c; var3++) {
            boolean decompiledFrameRemainder0 = true;
            if (me.field_b[var3].field_k == param1.field_k) {
              var4 = me.field_b[var3].b(2);
              if (mj.field_e < ab.field_u[var4]) {
                ab.field_u[var4] = ab.field_u[var4] - 1;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              incrementValue$2 = var2_intLifetime2;
              var2_intLifetime2++;
              me.field_b[incrementValue$2] = me.field_b[var3];
            }
          }
          jh.field_c = var2_intLifetime2;
          fieldTemp$1 = jh.field_c;
          jh.field_c = jh.field_c + 1;
          me.field_b[fieldTemp$1] = param1;
          if (param0 != 7743) {
            field_a = (de) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("lh.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final boolean d(int param0) {
        if (param0 != -12819) {
          this.d((byte) -69);
        }
        return this.field_e == 103 ? true : false;
    }

    final boolean d(byte param0) {
        if (param0 != 68) {
          this.field_k = 95;
        }
        return this.field_e == 102 ? true : false;
    }

    final boolean f(int param0) {
        boolean stackIn_8_0 = false;
        if (param0 != -85) {
          field_a = (de) null;
        }
        stackIn_8_0 = (this.field_b != 0) || (this.field_e == 84) || (83 == this.field_e);
        return stackIn_8_0;
    }

    lh(int param0) {
        this.field_h = false;
        this.field_k = 0;
        this.field_i = param0;
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 7865) {
          lh.a(-76);
        }
        field_c = null;
        field_d = null;
    }

    final boolean e(int param0) {
        boolean stackIn_9_0 = false;
        if (param0 != 14354) {
          return false;
        }
        stackIn_9_0 = (this.field_f == 1) || (97 == this.field_e) || (this.field_e == 84) || (this.field_e == 83);
        return stackIn_9_0;
    }

    final static wb a(String param0, qk param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        wb stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param1.a(18659, param2);
          var5 = 1 % ((param3 - 43) / 62);
          var6 = param1.a(var4_int, param0, (byte) 7);
          stackIn_1_0 = oj.a(var4_int, param1, var6, -8691);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("lh.O(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        this.field_j = 0;
        int var5 = 124 / ((param0 - 42) / 55);
        this.field_h = param3 ? true : false;
        if (this.field_h) {
          this.field_k = param1;
        } else {
          this.field_k = param2;
        }
    }

    static {
        field_a = new de(11, 0, 1, 2);
    }
}
