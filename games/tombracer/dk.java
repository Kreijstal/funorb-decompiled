/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk {
    int field_b;
    private int[][] field_g;
    int[] field_e;
    int[] field_l;
    static cn field_c;
    boolean field_h;
    private int[] field_d;
    static String field_k;
    static String field_a;
    boolean field_i;
    int field_j;
    boolean field_f;

    private dk(cn param0, int param1, String param2) {
        this(param0, param1, param0.a(true, param2, param1));
    }

    dk(cn param0, String param1, String param2) {
        this(param0, param0.b(param1, -7768), param2);
    }

    private final void a(int param0, uia param1) {
        int var3_int = 0;
        int var4 = 0;
        dn var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          while (true) {
            var3_int = param1.h(255);
            if (var3_int != 0) {
              this.a(var3_int, param1, 16588);
              continue;
            }
            break;
          }
          if (param0 >= -89) {
            var5 = (dn) null;
            dk.a((dn) null, -51);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("dk.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != 104) {
          return;
        }
        field_c = null;
        field_k = null;
    }

    final int a(byte param0, boolean param1) {
        int var6 = 0;
        int var7 = 0;
        int var3;
        int var4;
        int var5;
        int var8;
        int stackIn_3_0 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        var3 = 0;
        var4 = 0;
        if (param1) {
          stackIn_3_0 = 1;
        } else {
          stackIn_3_0 = this.field_j;
        }
        var5 = stackIn_3_0;
        if (param0 <= 82) {
          dk.a((byte) -28);
        }
        for (var6 = 0; var6 < var5; var6++) {
          for (var7 = var4; var7 < this.field_e.length; var7++) {
            var3 = var3 + this.field_e[var7];
          }
          if (this.field_b > 0) {
            var4 = this.field_b;
          }
        }
        return var3;
    }

    private final void a(int param0, uia param1, int param2) {
        int[] array$0 = null;
        int var7 = 0;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          if (param2 != 16588) {
            return;
          }
          if (param0 == 1) {
            var4_int = param1.d(127);
            this.field_e = new int[var4_int];
            for (var5 = 0; var5 < var4_int; var5++) {
              this.field_e[var5] = param1.d(121);
            }
            this.field_l = new int[var4_int];
            for (var5 = 0; var4_int > var5; var5++) {
              this.field_l[var5] = param1.d(124);
            }
            for (var5 = 0; var4_int > var5; var5++) {
              this.field_l[var5] = (param1.d(123) << 16) + this.field_l[var5];
            }
          } else {
            if (2 == param0) {
              this.field_b = param1.d(122);
              return;
            }
            if (param0 == 3) {
              var4_int = param1.h(param2 ^ 16435);
              this.field_d = new int[var4_int + 1];
              for (var5 = 0; var4_int > var5; var5++) {
                this.field_d[var5] = param1.h(255);
              }
              this.field_d[var4_int] = 9999999;
            } else {
              if (5 == param0) {
                param1.h(255);
                return;
              }
              if (6 == param0) {
                param1.d(param2 ^ 16563);
                return;
              }
              if (param0 == 7) {
                param1.d(126);
                return;
              }
              if (param0 == 8) {
                this.field_j = param1.h(255);
                this.field_f = false;
                return;
              }
              if (9 == param0) {
                param1.h(255);
                return;
              }
              if (param0 == 10) {
                param1.h(255);
                return;
              }
              if (param0 == 11) {
                param1.h(255);
                return;
              }
              if (12 == param0) {
                var4_int = param1.h(255);
                for (var5 = 0; var5 < var4_int; var5++) {
                  param1.d(125);
                }
                for (var5 = 0; var4_int > var5; var5++) {
                  param1.d(121);
                }
              } else if (param0 == 13) {
                var4_int = param1.d(121);
                this.field_g = new int[var4_int][];
                for (var5 = 0; var4_int > var5; var5++) {
                  var6 = param1.h(255);
                  if (var6 > 0) {
                    array$0 = new int[var6];
                    this.field_g[var5] = array$0;
                    this.field_g[var5][0] = param1.a(-32768);
                    for (var7 = 1; var7 < var6; var7++) {
                      this.field_g[var5][var7] = param1.d(123);
                    }
                  }
                }
              } else {
                if (param0 == 14) {
                  this.field_h = true;
                  return;
                }
                if (param0 == 15) {
                  this.field_i = true;
                  return;
                }
                if (param0 != 16 &&
                  18 != param0) {
                  return;
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_59_0 = var4;
          stackIn_59_1 = new StringBuilder().append("dk.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',').append(param2).append(')').toString());
        }
    }

    final static int a(dn param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == lsa.field_c) {
            stackIn_8_0 = 9216;
            return stackIn_8_0;
          }
          if (param0 == gd.field_H) {
            stackIn_3_0 = 34065;
            return stackIn_3_0;
          }
          if (gq.field_u == param0) {
            stackIn_6_0 = 34066;
            return stackIn_6_0;
          }
          if (param1 == 0) {
            throw new IllegalArgumentException();
          }
          stackIn_11_0 = 21;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("dk.E(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    private dk(cn param0, int param1, int param2) {
        int var7 = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        byte[] var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        int var6Lifetime1;
        this.field_j = 0;
        this.field_b = -1;
        try {
          this.field_f = true;
          var11 = param0.a(false, param1, param2);
          var10 = var11;
          var9 = var10;
          var4 = var9;
          if (var9 != null) {
            this.a(-110, new uia(var11));
          }
          var5 = 0;
          for (var6 = 0; var6 < this.field_l.length; var6++) {
            if (this.field_l[var6] > var5) {
              var5 = this.field_l[var6];
            }
          }
          var6Lifetime1 = 0;
          for (var7 = 0; var7 < this.field_e.length; var7++) {
            if (var6Lifetime1 < this.field_e[var7]) {
              var6Lifetime1 = this.field_e[var7];
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_16_0 = var4_ref;
          stackIn_16_1 = new StringBuilder().append("dk.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_k = "Despite his bank manager's despair, the previous occupant of the temple hid his cash in plain sight. Grab the coins for points.";
        field_a = "Lagoons of lava";
    }
}
