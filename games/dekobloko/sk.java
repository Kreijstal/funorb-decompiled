/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk {
    static w field_c;
    static String field_i;
    private int field_p;
    boolean field_o;
    private int field_j;
    static int field_k;
    static ei[][] field_a;
    private boolean field_n;
    private int field_d;
    static int field_e;
    static ck field_g;
    static String field_m;
    int field_h;
    private int field_q;
    int field_l;
    static ji field_f;
    static String field_b;

    final void a(int param0, byte param1) {
        if (this.field_q == 0) {
          this.field_h = param0;
          this.field_o = true;
          this.field_n = false;
        }
        if (param1 >= -53) {
          field_b = (String) null;
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
          sk.e(-70);
        }
        return this.field_q != 0 ? true : false;
    }

    final boolean c(int param0) {
        if (param0 <= 111) {
          field_g = (ck) null;
        }
        return this.field_d == 102 ? true : false;
    }

    final void a(boolean param0, int param1, int param2) {
        this.field_q = 0;
        this.field_n = param0 ? true : false;
        if (this.field_n) {
          this.field_h = param2;
        }
        int var4 = -68 / ((54 - param1) / 44);
    }

    final boolean a(byte param0) {
        if (param0 != -51) {
          return false;
        }
        return this.field_d == 103 ? true : false;
    }

    final boolean b(boolean param0) {
        if (!param0) {
          return true;
        }
        return this.field_d == 96 ? true : false;
    }

    final void a(byte param0, int param1) {
        if (param0 != 58) {
          this.field_h = 111;
        }
        this.field_d = 0;
        this.field_p = 0;
        this.field_o = false;
        if (0 == this.field_q) {
          this.field_d = wh.field_c;
        }
        if (0 == this.field_q &&
          wh.field_c == 96) {
          if (this.field_h <= 0) {
            this.field_h = this.field_l;
          }
          this.field_n = false;
          this.field_h = this.field_h - 1;
          this.field_o = true;
        }
        if (this.field_q == 0 &&
          wh.field_c == 97) {
          this.field_h = this.field_h + 1;
          this.field_n = false;
          this.field_o = true;
          if (this.field_l <= this.field_h) {
            this.field_h = 0;
          }
        }
        if (this.field_q == 0 && (98 == wh.field_c ||
          wh.field_c == 99)) {
          if (this.field_h < 0) {
            this.field_h = param1;
          }
          this.field_n = false;
          this.field_o = true;
        }
    }

    final boolean b(int param0) {
        int var2 = 90 % ((31 - param0) / 42);
        return this.field_d == 97 ? true : false;
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        this.field_n = param3 ? true : false;
        this.field_q = param1;
        if (this.field_n) {
          this.field_h = param2;
        } else {
          this.field_h = param0;
        }
    }

    final void a(int param0) {
        this.field_o = false;
        this.field_p = 0;
        if (param0 > -24) {
          return;
        }
        this.field_d = 0;
        if (0 == this.field_q &&
          wh.field_c == 98) {
          if (this.field_h <= 0) {
            this.field_h = this.field_l;
          }
          this.field_h = this.field_h - 1;
          this.field_n = false;
          this.field_o = true;
        }
        if (this.field_q == 0) {
          this.field_d = wh.field_c;
        }
        if (0 == this.field_q &&
          wh.field_c == 99) {
          this.field_h = this.field_h + 1;
          this.field_n = false;
          if (this.field_h >= this.field_l) {
            this.field_h = 0;
          }
          this.field_o = true;
        }
    }

    final static boolean a(boolean param0, CharSequence param1, boolean param2, int param3) {
        int var8 = 0;
        int stackIn_40_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
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
          if (param3 >= 2 &&
            param3 <= 36) {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            var7 = param1.length();
            for (var8 = 0; var8 < var7; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param1.charAt(var8);
              if ((0 == var8) &&
                (var9 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (0 != var8 || (var9 != 43 ||
                !param2))) {
                if (48 <= var9 &&
                  57 >= var9) {
                  var9 -= 48;
                } else if (65 <= var9 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else if (var9 >= 97 &&
                  var9 <= 122) {
                  var9 -= 87;
                } else {
                  return false;
                }
                if (var9 >= param3) {
                  return false;
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = var9 + var6 * param3;
                if (var10 / param3 != var6) {
                  return false;
                }
                var5 = 1;
                var6 = var10;
              }
            }
            if (!param0) {
              field_b = (String) null;
            }
            stackIn_40_0 = var5;
            return stackIn_40_0 != 0;
          }
          throw new IllegalArgumentException("" + param3);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_43_0 = var4;
          stackIn_43_1 = new StringBuilder().append("sk.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static int a(int param0, int param1) {
        if (param1 >= -52) {
          field_k = -122;
        }
        param0 = param0 & 8191;
        if (param0 < 4096) {
          return param0 < 2048 ? pd.field_i[param0] : pd.field_i[4096 - param0];
        }
        return param0 >= 6144 ? -pd.field_i[-param0 + 8192] : -pd.field_i[-4096 + param0];
    }

    final void d(int param0) {
        this.field_d = 0;
        this.field_p = param0;
        this.field_o = false;
        if (this.field_q == 0) {
          this.field_d = wh.field_c;
        }
    }

    public static void e(int param0) {
        field_c = null;
        field_i = null;
        field_m = null;
        field_f = null;
        field_g = null;
        if (param0 != -28610) {
          sk.e(69);
        }
        field_a = (ei[][]) null;
        field_b = null;
    }

    final void a(int param0, int param1, int param2) {
        if (this.field_l <= param0) {
          throw new IllegalArgumentException();
        }
        if (param2 >= this.field_l) {
          throw new IllegalArgumentException();
        }
        this.field_d = 0;
        this.field_p = 0;
        this.field_o = false;
        if (ig.field_Yb != 0) {
          this.field_n = true;
          this.field_q = ig.field_Yb;
          this.field_p = ig.field_Yb;
          this.field_h = param2;
          this.field_j = ib.field_kb;
        }
        if (this.field_q != 0 &&
          be.field_n != 0) {
          if (this.field_j <= 0) {
            this.field_j = qd.field_Ob;
          }
          this.field_j = this.field_j - 1;
        }
        if (param1 != -20563) {
          return;
        }
        if (ig.field_Yb == 0 &&
          be.field_n == 0) {
          this.field_q = 0;
        }
        if (this.field_q == 0 && (this.field_n ||
          pm.field_b)) {
          if (param0 >= 0) {
            if (this.field_h != param0) {
              this.field_o = true;
            }
            this.field_n = true;
            this.field_h = param0;
          } else {
            if (this.field_n) {
              this.field_h = -1;
            }
          }
        }
    }

    final boolean b(byte param0) {
        boolean stackIn_8_0 = false;
        if (param0 != 114) {
          return false;
        }
        stackIn_8_0 = (0 != this.field_p) || (84 == this.field_d) || (this.field_d == 83);
        return stackIn_8_0;
    }

    public sk() {
        this.field_n = false;
        this.field_h = 0;
    }

    sk(int param0) {
        this.field_n = false;
        this.field_h = 0;
        this.field_l = param0;
    }

    static {
        field_i = "START!";
        field_a = new ei[2][8];
        field_m = "Private";
        field_b = "Draw?";
    }
}
