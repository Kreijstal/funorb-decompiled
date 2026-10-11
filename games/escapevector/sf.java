/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf {
    private int field_q;
    private int field_r;
    private int field_h;
    private int field_g;
    private int field_l;
    private int field_i;
    private int field_f;
    private int field_a;
    private int field_j;
    static hf field_d;
    private int field_p;
    static int[] field_m;
    static String field_n;
    static int field_c;
    private int field_k;
    static ed[] field_b;
    private int field_o;
    static hh[] field_e;

    final static String a(int param0, CharSequence param1) {
        int var6 = 0;
        StringBuilder discarded$0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_28_0 = null;
        String stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = EscapeVector.field_A;
        try {
          if (param1 == null) {
            stackIn_3_0 = null;
            return (String) (stackIn_3_0);
          }
          var2_int = 0;
          var3 = param1.length();
          while (var2_int < var3) {
            if (fd.a(true, param1.charAt(var2_int))) {
              var2_int++;
              continue;
            }
            break;
          }
          while (var3 > var2_int) {
            if (fd.a(true, param1.charAt(var3 - 1))) {
              var3--;
              continue;
            }
            break;
          }
          var4 = -var2_int + var3;
          if (var4 < 1) {
            return null;
          }
          if (12 < var4) {
            return null;
          }
          var5 = new StringBuilder(var4);
          if (param0 > -65) {
            sf.a(true);
          }
          for (var6 = var2_int; var6 < var3; var6++) {
            var7 = param1.charAt(var6);
            if (d.a((char) var7, -11217)) {
              var8 = eo.a(227, (char) var7);
              if (0 != var8) {
                discarded$0 = var5.append((char) var8);
              }
            }
          }
          if (var5.length() != 0) {
            stackIn_30_0 = var5.toString();
            return stackIn_30_0;
          }
          stackIn_28_0 = null;
          return (String) (stackIn_28_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_33_0 = var2;
          stackIn_33_1 = new StringBuilder().append("sf.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final void b(int param0, int param1) {
        this.field_a = this.field_a + param1;
        this.field_j = this.field_j + param1;
        this.field_l = this.field_l + param1;
        this.field_h = this.field_h + param1;
        this.field_f = this.field_f + param1;
        this.field_r = this.field_r + param1;
        if (param0 != -1) {
          field_d = (hf) null;
        }
        this.field_o = this.field_o + param1;
        this.field_j = this.field_j + param1;
    }

    private final void c(int param0, int param1) {
        if (param0 != 136) {
          this.d(42, -12);
          return;
        }
    }

    final void a(int param0, int param1) {
        if (param1 != 3748) {
          return;
        }
        this.field_q = this.field_q | 1 << param0;
    }

    final int[] c(int param0) {
        if (param0 != 0) {
          this.a((byte) -83);
        }
        this.c(136, this.b(~param0));
        return new int[]{this.field_j, this.field_l, this.field_q, this.field_o};
    }

    final void d(int param0, int param1) {
        if (param1 != 136) {
          this.a((byte) 23);
        }
        this.field_r = this.field_r + param0;
    }

    final int[] d(int param0) {
        if (param0 != 31304) {
          this.c(97);
        }
        this.c(param0 - 31168, this.b(-1));
        return new int[]{this.field_j, this.field_l, 0, this.field_o};
    }

    private final int b(int param0) {
        oe var2 = ma.field_a;
        if (var2 == null) {
          return 0;
        }
        int var3 = var2.field_ob;
        int var4 = var2.field_fc;
        var3 = tj.a(var4, (byte) 126, var3);
        if (param0 != -1) {
          this.b(90, -103);
        }
        return var3;
    }

    final void a(byte param0) {
        int var2 = -78 / ((param0 + 73) / 35);
        this.field_f = this.field_f + this.field_p;
        this.field_h = this.field_h + this.field_i;
        this.field_j = this.field_j + this.field_g;
        this.field_r = this.field_r + this.field_p;
        this.field_l = this.field_l + this.field_g;
        this.field_a = this.field_a + this.field_i;
        this.field_j = this.field_j + this.field_k;
        this.field_o = this.field_o + this.field_k;
    }

    final static tk a(String param0, byte param1) {
        tk stackIn_4_0 = null;
        tk stackIn_8_0 = null;
        tk stackIn_13_0 = null;
        int stackIn_22_0 = 0;
        tk stackIn_27_0 = null;
        tk stackIn_33_0 = null;
        tk stackIn_44_0 = null;
        tk stackIn_49_0 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = EscapeVector.field_A;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_4_0 = mf.field_d;
            return stackIn_4_0;
          }
          if (var2_int > 64) {
            stackIn_8_0 = d.field_c;
            return stackIn_8_0;
          }
          if (34 == param0.charAt(0)) {
            if (param0.charAt(var2_int - 1) != 34) {
              stackIn_13_0 = wh.field_p;
              return stackIn_13_0;
            }
            var3 = 0;
            for (var4 = 1; var4 < var2_int - 1; var4++) {
              var5 = param0.charAt(var4);
              if (var5 == 92) {
                stackIn_22_0 = (var3 != 0) ? 0 : 1;
                var3 = stackIn_22_0;
              } else {
                if (34 == var5 &&
                  var3 == 0) {
                  stackIn_27_0 = wh.field_p;
                  return stackIn_27_0;
                }
                var3 = 0;
              }
            }
            return null;
          }
          if (param1 != 119) {
            stackIn_33_0 = (tk) null;
            return stackIn_33_0;
          }
          var3Lifetime1 = 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < var2_int; var4Lifetime1++) {
            boolean decompiledFrameRemainder0 = true;
            var5Lifetime1 = param0.charAt(var4Lifetime1);
            if (var5Lifetime1 == 46) {
              if (var4Lifetime1 != 0 &&
                var2_int - 1 != var4Lifetime1 &&
                var3Lifetime1 == 0) {
                var3Lifetime1 = 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                stackIn_44_0 = wh.field_p;
                return stackIn_44_0;
              }
            }
            if (decompiledFrameRemainder0) {
              if (en.field_g.indexOf(var5Lifetime1) == -1) {
                stackIn_49_0 = wh.field_p;
                return stackIn_49_0;
              }
              var3Lifetime1 = 0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_55_0 = var2;
          stackIn_55_1 = new StringBuilder().append("sf.C(");
          if (param0 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(',').append(param1).append(')').toString());
        }
    }

    final int[] a(int param0) {
        this.c(136, this.b(-1));
        int var2 = 0 / ((1 - param0) / 35);
        return new int[]{this.field_r, this.field_h, this.field_f, this.field_a};
    }

    public static void a(boolean param0) {
        field_e = null;
        field_b = null;
        field_d = null;
        if (param0) {
          CharSequence var2 = (CharSequence) null;
          sf.a(27, (CharSequence) null);
        }
        field_n = null;
        field_m = null;
    }

    sf(int param0) {
        this.field_h = 136;
        this.field_g = 203;
        this.field_a = 10;
        this.field_f = 30589;
        this.field_l = 247;
        this.field_j = 201;
        this.field_i = 50;
        this.field_q = 0;
        this.field_p = 65;
        this.field_o = 10325;
        this.field_k = 7;
        this.field_r = 138;
        this.b(-1, param0);
        this.a((byte) -19);
        this.c(136, this.b(-1));
    }

    static {
        field_d = new hf();
        field_n = "Legend";
        field_c = 0;
        field_m = new int[4];
        field_e = new hh[17];
    }
}
