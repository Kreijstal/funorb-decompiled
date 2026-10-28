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
    static Sprite[] field_b;
    private int field_o;
    static PcmSample[] field_e;

    final static String a(int param0, CharSequence param1) {
        String stackIn_34_2 = null;
        int var9 = EscapeVector.obfuscationControl;
        try {
          if (param1 == null) {
            Object stackIn_3_0 = null;
            return (String) (stackIn_3_0);
          }
          int var2_int = 0;
          int var3 = param1.length();
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
          int var4 = -var2_int + var3;
          if (var4 < 1) {
            return null;
          }
          if (12 < var4) {
            return null;
          }
          StringBuilder var5 = new StringBuilder(var4);
          if (param0 > -65) {
            sf.a(true);
          }
          for (int var6 = var2_int; var6 < var3; var6++) {
            int var7 = param1.charAt(var6);
            if (d.a((char) var7, -11217)) {
              int var8 = eo.a(227, (char) var7);
              if (0 != var8) {
                StringBuilder discarded$0 = var5.append((char) var8);
              }
            }
          }
          if (var5.length() != 0) {
            String stackIn_30_0 = var5.toString();
            return stackIn_30_0;
          }
          Object stackIn_28_0 = null;
          return (String) (stackIn_28_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_33_0 = var2;
          StringBuilder stackIn_33_1 = new StringBuilder().append("sf.B(").append(param0).append(',');
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
        GameplaySession var2 = BoundedRandomAccessFile.activeSession;
        if (var2 == null) {
          return 0;
        }
        int var3 = var2.score;
        int var4 = var2.gameMode;
        var3 = DialogueScreen.a(var4, (byte) 126, var3);
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
        String stackIn_56_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          int var2_int = param0.length();
          if (var2_int == 0) {
            tk stackIn_4_0 = ResourceArchive.field_d;
            return stackIn_4_0;
          }
          if (var2_int > 64) {
            tk stackIn_8_0 = d.field_c;
            return stackIn_8_0;
          }
          if (34 == param0.charAt(0)) {
            if (param0.charAt(var2_int - 1) != 34) {
              tk stackIn_13_0 = wh.field_p;
              return stackIn_13_0;
            }
            boolean var3 = false;
            for (int var4 = 1; var4 < var2_int - 1; var4++) {
              int var5 = param0.charAt(var4);
              if (var5 == 92) {
                boolean stackIn_22_0 = !((var3));
                var3 = stackIn_22_0;
              } else {
                if (34 == var5 &&
                  !var3) {
                  tk stackIn_27_0 = wh.field_p;
                  return stackIn_27_0;
                }
                var3 = false;
              }
            }
            return null;
          }
          if (param1 != 119) {
            tk stackIn_33_0 = (tk) null;
            return stackIn_33_0;
          }
          boolean var3Lifetime1 = false;
          for (int var4Lifetime1 = 0; var4Lifetime1 < var2_int; var4Lifetime1++) {
            boolean decompiledFrameRemainder0 = true;
            int var5Lifetime1 = param0.charAt(var4Lifetime1);
            if (var5Lifetime1 == 46) {
              if (var4Lifetime1 != 0 &&
                var2_int - 1 != var4Lifetime1 &&
                !var3Lifetime1) {
                var3Lifetime1 = true;
                decompiledFrameRemainder0 = false;
              }
              else {
                tk stackIn_44_0 = wh.field_p;
                return stackIn_44_0;
              }
            }
            if (decompiledFrameRemainder0) {
              if (en.field_g.indexOf(var5Lifetime1) == -1) {
                tk stackIn_49_0 = wh.field_p;
                return stackIn_49_0;
              }
              var3Lifetime1 = false;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_55_0 = var2;
          StringBuilder stackIn_55_1 = new StringBuilder().append("sf.C(");
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
        field_e = new PcmSample[17];
    }
}
