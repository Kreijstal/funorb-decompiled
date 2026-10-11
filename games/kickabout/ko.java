/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ko {
    static int[] field_f;
    private boolean field_g;
    static String field_j;
    private int field_i;
    private int field_b;
    private int field_h;
    private int field_d;
    int field_e;
    int field_a;
    static String field_k;
    static int field_c;

    public static void a(byte param0) {
        if (param0 != -22) {
          ko.a(-29, -114, 127L);
        }
        field_k = null;
        field_j = null;
        field_f = null;
    }

    final static void a(int param0, int param1, long param2) {
        if (param0 < 57) {
          field_f = (int[]) null;
        }
        ml var4 = or.field_d;
        var4.b(param1, (byte) 120);
        var4.field_n = var4.field_n + 1;
        int var5 = var4.field_n;
        var4.a(126, 7);
        var4.a(param2, -1781890008);
        var4.c(62, -var5 + var4.field_n);
    }

    final void a(int param0, int param1, int param2) {
        if (this.field_a <= param1) {
          throw new IllegalArgumentException();
        }
        if (this.field_a <= param2) {
          throw new IllegalArgumentException();
        }
        if (param0 != -21174) {
          this.field_b = -2;
        }
        this.field_b = 0;
        this.field_h = 0;
        if (0 != wj.field_A) {
          this.field_g = true;
          this.field_i = wj.field_A;
          this.field_h = wj.field_A;
          this.field_e = param2;
          this.field_d = rl.field_q;
        }
        if (this.field_i != 0 &&
          nl.field_p != 0) {
          if (0 >= this.field_d) {
            this.field_d = vj.field_b;
          }
          this.field_d = this.field_d - 1;
        }
        if (wj.field_A == 0 &&
          nl.field_p == 0) {
          this.field_i = 0;
        }
        if (this.field_i == 0 && (this.field_g ||
          el.field_C)) {
          if (param1 < 0) {
            if (this.field_g) {
              this.field_e = -1;
            }
          } else {
            if (param1 != this.field_e) {
            }
            this.field_g = true;
            this.field_e = param1;
          }
        }
    }

    final boolean a(int param0) {
        if (param0 != 0) {
          return false;
        }
        return this.field_i != 0 ? true : false;
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        this.field_g = param3 ? true : false;
        this.field_i = param1;
        if (!this.field_g) {
          this.field_e = param2;
        } else {
          this.field_e = param0;
        }
    }

    final void a(int param0, boolean param1) {
        this.field_b = 0;
        this.field_h = 0;
        if (0 == this.field_i &&
          cc.field_e == 96) {
          if (0 >= this.field_e) {
            this.field_e = this.field_a;
          }
          this.field_g = false;
          this.field_e = this.field_e - 1;
        }
        if (!param1) {
          this.b(-93);
        }
        if (0 == this.field_i) {
          this.field_b = cc.field_e;
        }
        if (this.field_i == 0 &&
          97 == cc.field_e) {
          this.field_e = this.field_e + 1;
          if (this.field_e >= this.field_a) {
            this.field_e = 0;
          }
          this.field_g = false;
        }
        if (this.field_i == 0 && (98 == cc.field_e ||
          99 == cc.field_e)) {
          if (this.field_e < 0) {
            this.field_e = param0;
          }
          this.field_g = false;
        }
    }

    final void a(byte param0, int param1) {
        if (param0 != 68) {
          return;
        }
        if (this.field_i == 0) {
          this.field_g = false;
          this.field_e = param1;
        }
    }

    final boolean c(int param0) {
        boolean stackIn_8_0 = false;
        if (param0 != -1) {
          return true;
        }
        stackIn_8_0 = (this.field_h != 0) || (this.field_b == 84) || (this.field_b == 83);
        return stackIn_8_0;
    }

    final void d(int param0) {
        this.field_b = 0;
        this.field_h = 0;
        if (this.field_i == 0) {
          this.field_b = cc.field_e;
        }
        if (0 == this.field_i &&
          cc.field_e == 98) {
          if (this.field_e <= 0) {
            this.field_e = this.field_a;
          }
          this.field_e = this.field_e - 1;
          this.field_g = false;
        }
        if (param0 < 89) {
          return;
        }
        if (0 == this.field_i &&
          cc.field_e == 99) {
          this.field_e = this.field_e + 1;
          this.field_g = false;
          if (this.field_a <= this.field_e) {
            this.field_e = 0;
          }
        }
    }

    final void b(int param0) {
        this.field_h = 0;
        this.field_b = 0;
        if (param0 != -99) {
          this.field_h = 117;
        }
        if (0 == this.field_i) {
          this.field_b = cc.field_e;
        }
    }

    final void a(boolean param0, int param1, byte param2) {
        if (param2 != -127) {
          this.a(-68, true);
        }
        this.field_g = param0 ? true : false;
        this.field_i = 0;
        if (this.field_g) {
          this.field_e = param1;
        }
    }

    ko(int param0) {
        this.field_g = false;
        this.field_e = 0;
        this.field_a = param0;
    }

    static {
        int var0 = 0;
        long var4 = 0L;
        long var6 = 0L;
        int var2 = 0;
        int var3 = 0;
        int var1 = 0;
        field_j = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find suitable opponents in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_k = "Search Results";
        field_f = new int[98304];
        for (var0 = 92682; 46341 <= var0; var0--) {
          var4 = (long)((var0 << 1) - 1);
          var6 = (long)(1 + (var0 << 1));
          var2 = (int)((var4 * var4 >> 18) - 32768L);
          var3 = (int)(-32768L + (var6 * var6 >> 18));
          if (var3 >= field_f.length) {
            var3 = field_f.length - 1;
          }
          for (var1 = 0 <= var2 ? var2 : 0; var1 <= var3; var1++) {
            field_f[var1] = var0;
          }
        }
        field_c = 20;
    }
}
