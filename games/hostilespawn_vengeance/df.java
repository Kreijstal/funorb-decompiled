/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df {
    static String field_b;
    static bd[] field_g;
    private boolean field_h;
    static bd field_a;
    private int[] field_i;
    static String field_e;
    static int field_c;
    private int field_d;
    static bd field_j;
    private int field_f;

    final int b(int param0) {
        if (param0 != -25) {
          this.field_f = 98;
        }
        return 1 + this.field_f;
    }

    private final int b(int param0, int param1) {
        int var3;
        int var4;
        var4 = HostileSpawn.field_I ? 1 : 0;
        if (param0 != 0) {
          df.a(-32);
        }
        var3 = this.field_i.length;
        while (param1 >= var3) {
          if (!this.field_h) {
            var3 = var3 + this.field_d;
            continue;
          }
          if (var3 != 0) {
            var3 = var3 * this.field_d;
            continue;
          }
          var3 = 1;
        }
        return var3;
    }

    final void b(boolean param0, int param1) {
        int discarded$0 = 0;
        if (!param0) {
          discarded$0 = this.b(49, 5);
        }
        this.a(-80, 1 + this.field_f, param1);
    }

    final void a(int param0, byte param1) {
        if (param0 >= 0 &&
          param0 <= this.field_f) {
          if (param1 != 35) {
            return;
          }
          if (this.field_f != param0) {
            kf.a(this.field_i, param0 + 1, this.field_i, param0, this.field_f - param0);
          }
          this.field_f = this.field_f - 1;
          return;
        }
        throw new ArrayIndexOutOfBoundsException(param0);
    }

    private final void a(int param0, int param1, int param2) {
        if (param1 > this.field_f) {
          this.field_f = param1;
        }
        if (param0 <= -76) {
          if (this.field_i.length <= param1) {
            this.a(true, param1);
          }
          this.field_i[param1] = param2;
          return;
        }
    }

    final int a(int param0, int param1) {
        if (this.field_f < param0) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (param1 == -2262) {
          return this.field_i[param0];
        }
        return -78;
    }

    final static void a(int param0, oj param1, oc param2, oc param3, int param4, int param5, double param6, oj param7, oc param8, double param9) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        oj var19 = null;
        int var20 = 0;
        var20 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (param1.field_i == param0) {
            param1.field_G = 1;
          } else {
            param1.field_G = 2;
          }
          var13 = (int)((-param1.field_l.field_a + ((double)param4 + param9 - (double)param8.field_g)) * 24.0);
          var12_int = (int)(24.0 * (-param1.field_l.field_f + (param6 + (double)param5 - (double)param8.field_e)));
          var14 = 0;
          if (var12_int >= -24 &&
            var12_int <= 24 &&
            var13 >= -24 &&
            24 > var13) {
            param7.field_z = 4;
            if (!pl.field_l) {
              if (eh.field_g > 0) {
                ci.a(1, 46);
                if (1 != uj.field_l) {
                }
              }
            } else {
              pl.field_l = false;
              param1.field_I = 0;
            }
          }
          if (param1.field_i != 25) {
            if (param1.field_F > 0) {
              var14 = 1;
            }
            if (param1.field_F > 250) {
              var14 = 5;
            }
          } else {
            var14 = 2;
          }
          if (0 == param1.field_F &&
            param1.field_i == 3) {
            param1.field_G = 0;
          }
          if (param1.field_F > 1) {
            param1.field_F = param1.field_F - 1;
          }
          if (param1.field_h == 0) {
            param2.a((byte) 46, param3);
            param2.b(param8, 24161);
            param1.a(225, param2.a(param0 ^ 25127), 3);
          }
          if (1 == param1.field_h) {
            param1.a(225, param1.field_c + 10.0, 4);
          }
          if (param1.field_h == 2) {
            param1.a(param0 + 222, param1.field_c - 10.0, 4);
          }
          fieldTemp$0 = param1.field_e;
          param1.field_e = param1.field_e - 1;
          if (fieldTemp$0 < 0) {
            if (param1.field_h == 3) {
              param1.field_h = (int)(3.0 * Math.random());
            } else {
              param1.field_h = 3;
            }
            if (3 != param1.field_i) {
              param1.field_e = (int)(5.0 * (50.0 * Math.random()));
              var15 = param8.field_e;
              var16 = param8.field_g;
              var17 = 0;
              var18 = 1;
              if (el.field_j > var18) {
                var19 = mm.field_m[var18];
                if (4 == var19.field_i &&
                  var15 == var19.field_j.field_e &&
                  var19.field_j.field_g == var16) {
                  var17 = 1;
                }
              }
              if (var17 == 0) {
                fieldTemp$1 = param1.field_v - 1;
                param1.field_v = param1.field_v - 1;
                if (fieldTemp$1 >= 0) {
                  mm.field_m[el.field_j] = new oj(param8, 4, rl.field_c);
                  el.field_j = el.field_j + 1;
                }
              }
            } else {
              param1.field_e = (int)(Math.random() * 25.0);
            }
          }
          li.field_r = param1.a(var14, param0 ^ 0, ln.field_a);
          if (li.field_r[0] &&
            li.field_r[1] &&
            param1.field_h == 0) {
            param1.field_e = (int)(Math.random() * 10.0);
            param1.field_h = (int)(1.0 + 2.0 * Math.random());
          }
          if (param1.field_i == 3) {
            param1.field_p = param1.field_p + 1;
            if (2 < param1.field_p) {
              param1.field_z = param1.field_z + 1;
              param1.field_p = 0;
              if (bf.field_f[1].length <= param1.field_z) {
                param1.field_z = 0;
              }
            }
          }
          if (param1.field_I <= 0) {
            param1.c((byte) 44);
            bn.a(3, param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_64_0 = var12;
          stackIn_64_1 = new StringBuilder().append("df.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          stackIn_67_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',');
          if (param2 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          stackIn_70_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',');
          if (param3 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          stackIn_76_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',');
          if (param8 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_64_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param9).append(')').toString());
        }
    }

    private final void a(boolean param0, int param1) {
        int discarded$0 = 0;
        int[] var4 = new int[this.b(0, param1)];
        int[] var3 = var4;
        kf.a(this.field_i, 0, var4, 0, this.field_i.length);
        if (!param0) {
          discarded$0 = this.b(-28, 87);
        }
        this.field_i = var4;
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 < 44) {
          field_g = (bd[]) null;
        }
        field_g = null;
        field_a = null;
        field_j = null;
        field_e = null;
    }

    private df() throws Throwable {
        throw new Error();
    }

    static {
        field_e = "Moves the marine in relation to the mouse.<br><br><col=ffffff>PRESS THE TAB KEY TO SWITCH KEY LAYOUTS.</col>";
        field_c = 0;
        field_b = "Moves the marine in relation to the map.";
    }
}
