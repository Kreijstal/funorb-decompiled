/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg {
    int field_a;
    static String field_h;
    private int field_g;
    private int field_c;
    private int field_d;
    int field_i;
    private int field_e;
    boolean field_b;
    private int field_f;

    final static void a(String param0, byte param1) {
        try {
          if (param1 != -120) {
            String var3 = (String) null;
            sg.a((String) null, false);
          }
          ld.a(param0, (byte) -13);
          vi.a(k.field_k, 12345, false);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "sg.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void b(byte param0) {
        this.field_d = 0;
        if (param0 < 60) {
          this.field_a = -93;
        }
        this.field_g = 0;
        this.field_c = 0;
        if (0 == this.field_f) {
          this.field_g = oa.field_H;
        }
    }

    final void a(int param0, int param1) {
        int var3 = 0 / ((param1 - 25) / 40);
        if (this.field_f == 0) {
          this.field_b = false;
          this.field_a = param0;
        }
    }

    final boolean a(byte param0) {
        if (param0 != 10) {
          this.e(-63);
        }
        return 0 != this.field_f ? true : false;
    }

    final boolean f(int param0) {
        if (param0 != 0) {
          this.a(-79, -5, -113, false);
        }
        return 96 == this.field_g ? true : false;
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        this.field_f = param2;
        this.field_b = param3 ? true : false;
        if (this.field_b) {
          this.field_a = param1;
        } else {
          this.field_a = param0;
        }
    }

    final boolean d(int param0) {
        if (param0 != 25149) {
          this.a(-106, -108, false);
        }
        return this.field_g == 97 ? true : false;
    }

    final static int a(int param0, boolean param1, int param2, int param3) {
        int var4 = -19 / ((-92 - param2) / 34);
        return ec.a(1);
    }

    final void e(int param0) {
        this.field_g = 0;
        this.field_c = 0;
        this.field_d = 0;
        if (this.field_f == 0) {
          this.field_g = oa.field_H;
        }
        if (param0 == this.field_f &&
          oa.field_H == 98) {
          if (0 >= this.field_a) {
            this.field_a = this.field_i;
          }
          this.field_b = false;
          this.field_a = this.field_a - 1;
        }
        if (this.field_f == 0 &&
          oa.field_H == 99) {
          this.field_a = this.field_a + 1;
          if (this.field_i <= this.field_a) {
            this.field_a = 0;
          }
          this.field_b = false;
        }
    }

    final boolean c(int param0) {
        if (param0 != 102) {
          this.field_d = 74;
        }
        return this.field_g == 102 ? true : false;
    }

    final boolean c(byte param0) {
        String var3;
        boolean stackIn_8_0 = false;
        if (param0 > -76) {
          var3 = (String) null;
          sg.a((String) null, (byte) 84);
        }
        stackIn_8_0 = (this.field_d != 0) || (84 == this.field_g) || (this.field_g == 83);
        return stackIn_8_0;
    }

    final void a(byte param0, int param1, boolean param2) {
        this.field_f = 0;
        this.field_b = param2 ? true : false;
        if (param0 != 60) {
          field_h = (String) null;
        }
        if (this.field_b) {
          this.field_a = param1;
        }
    }

    final void a(int param0, int param1, boolean param2) {
        if (this.field_i <= param0) {
          throw new IllegalArgumentException();
        }
        if (param1 >= this.field_i) {
          throw new IllegalArgumentException();
        }
        this.field_g = 0;
        if (!param2) {
          this.d(47);
        }
        this.field_d = 0;
        this.field_c = 0;
        if (kc.field_d != 0) {
          this.field_e = kb.field_b;
          this.field_f = kc.field_d;
          this.field_b = true;
          this.field_c = kc.field_d;
          this.field_d = kc.field_d;
          this.field_a = param1;
        }
        if (this.field_f != 0 &&
          ni.field_a != 0) {
          if (this.field_e <= 0) {
            this.field_e = aj.field_f;
            this.field_c = this.field_f;
          }
          this.field_e = this.field_e - 1;
        }
        if (kc.field_d == 0 &&
          ni.field_a == 0) {
          this.field_f = 0;
        }
        if (this.field_f == 0 &&
          (this.field_b || oe.field_d)) {
          if (0 <= param0) {
            if (param0 != this.field_a) {
            }
            this.field_a = param0;
            this.field_b = true;
          } else {
            if (this.field_b) {
              this.field_a = -1;
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 27303) {
          return;
        }
        field_h = null;
    }

    final boolean g(int param0) {
        boolean stackIn_8_0 = false;
        if (param0 != 0) {
          field_h = (String) null;
        }
        stackIn_8_0 = (this.field_c != 0) || (84 == this.field_g) || (83 == this.field_g);
        return stackIn_8_0;
    }

    final static boolean a(String param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var2_int = param0.charAt(0);
          if (param1) {
            return true;
          }
          var3 = 1;
          while (true) {
            if (var3 >= param0.length()) {
              return true;
            }
            if (param0.charAt(var3) == var2_int) {
              var3++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("sg.C(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean b(int param0) {
        if (param0 != -29996) {
          this.field_b = true;
        }
        return 103 == this.field_g ? true : false;
    }

    sg(int param0) {
        this.field_a = 0;
        this.field_b = false;
        this.field_i = param0;
    }

    static {
        field_h = "Connection restored.";
    }
}
