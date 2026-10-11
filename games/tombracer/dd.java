/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd {
    static oc[] field_b;
    private hma field_f;
    private sk field_c;
    private int field_e;
    static boolean field_a;
    private int field_g;
    static int[] field_d;

    final Object a(byte param0) {
        pb var2;
        Object var3;
        int var5;
        pb var6;
        pb var7;
        Object var3Lifetime1;
        var5 = TombRacer.field_G ? 1 : 0;
        var2 = (pb) (this.field_c.a((byte) 55));
        if (param0 == 60) {
          while (var2 != null) {
            var3 = var2.f(29243);
            if (var3 != null) {
              return var3;
            }
            var6 = var2;
            var2 = (pb) (this.field_c.a((byte) 55));
            var6.p(param0 ^ 21);
            var6.c(-7975);
            this.field_e = this.field_e + var6.field_m;
          }
          return null;
        }
        this.a(43, (Object) null, -32, 102L);
        while (true) {
          if (var2 == null) {
            return null;
          }
          var3Lifetime1 = var2.f(29243);
          if (var3Lifetime1 != null) {
            return var3Lifetime1;
          }
          var7 = var2;
          var2 = (pb) (this.field_c.a((byte) 55));
          var7.p(param0 ^ 21);
          var7.c(-7975);
          this.field_e = this.field_e + var7.field_m;
        }
    }

    final Object a(byte param0, long param1) {
        Object var8 = null;
        tja var6 = null;
        pb var7 = (pb) (this.field_c.a(param1, false));
        tja var6Lifetime1;
        if (var7 == null) {
          return null;
        }
        if (param0 <= 14) {
          field_d = (int[]) null;
          var8 = var7.f(29243);
          if (var8 != null) {
            if (!var7.a(14646)) {
              this.field_f.a(var7, -11396);
              var7.field_j = 0L;
            } else {
              var6 = new tja(var8, var7.field_m);
              this.field_c.a(var6, (byte) 125, var7.field_d);
              this.field_f.a(var6, -11396);
              ((pb) ((Object) var6)).field_j = 0L;
              var7.p(118);
              var7.c(-7975);
            }
            return var8;
          }
          var7.p(69);
          var7.c(-7975);
          this.field_e = this.field_e + var7.field_m;
          return null;
        }
        Object var9 = var7.f(29243);
        if (var9 != null) {
          if (!var7.a(14646)) {
            this.field_f.a(var7, -11396);
            var7.field_j = 0L;
          } else {
            var6Lifetime1 = new tja(var9, var7.field_m);
            this.field_c.a(var6Lifetime1, (byte) 125, var7.field_d);
            this.field_f.a(var6Lifetime1, -11396);
            ((pb) ((Object) var6Lifetime1)).field_j = 0L;
            var7.p(118);
            var7.c(-7975);
          }
          return var9;
        }
        var7.p(69);
        var7.c(-7975);
        this.field_e = this.field_e + var7.field_m;
        return null;
    }

    final void c(byte param0) {
        if (param0 == -118) {
          this.field_f.a((byte) 84);
          this.field_c.a(param0 ^ -118);
          this.field_e = this.field_g;
          return;
        }
        this.field_e = 108;
        this.field_f.a((byte) 84);
        this.field_c.a(param0 ^ -118);
        this.field_e = this.field_g;
    }

    final Object b(byte param0) {
        pb var2;
        Object var3;
        int var5;
        pb var6;
        pb var7;
        pb var2Lifetime1;
        Object var3Lifetime1;
        var5 = TombRacer.field_G ? 1 : 0;
        if (param0 > 83) {
          var2 = (pb) (this.field_c.b((byte) 35));
          while (var2 != null) {
            var3 = var2.f(29243);
            if (var3 != null) {
              return var3;
            }
            var6 = var2;
            var2 = (pb) (this.field_c.a((byte) 55));
            var6.p(121);
            var6.c(-7975);
            this.field_e = this.field_e + var6.field_m;
          }
          return null;
        }
        field_d = (int[]) null;
        var2Lifetime1 = (pb) (this.field_c.b((byte) 35));
        while (true) {
          if (var2Lifetime1 == null) {
            return null;
          }
          var3Lifetime1 = var2Lifetime1.f(29243);
          if (var3Lifetime1 != null) {
            return var3Lifetime1;
          }
          var7 = var2Lifetime1;
          var2Lifetime1 = (pb) (this.field_c.a((byte) 55));
          var7.p(121);
          var7.c(-7975);
          this.field_e = this.field_e + var7.field_m;
        }
    }

    final void b(int param0, int param1) {
        long fieldTemp$0 = 0L;
        pb var3;
        eba var4;
        int var5;
        var5 = TombRacer.field_G ? 1 : 0;
        if (param0 < 59) {
          return;
        }
        var3 = (pb) (this.field_f.c(100));
        while (var3 != null) {
          if (!var3.a(14646)) {
            fieldTemp$0 = var3.field_j + 1L;
            var3.field_j = var3.field_j + 1L;
            if ((long)param1 < fieldTemp$0) {
              var4 = new eba(var3.f(29243), var3.field_m);
              this.field_c.a(var4, (byte) 124, var3.field_d);
              ig.a(31, var4, var3);
              var3.p(126);
              var3.c(-7975);
            }
          } else {
            if (var3.f(29243) != null) {
              var3 = (pb) (this.field_f.a(-122));
              continue;
            }
            var3.p(120);
            var3.c(-7975);
            this.field_e = this.field_e + var3.field_m;
          }
          var3 = (pb) (this.field_f.a(-122));
        }
        return;
    }

    final void a(int param0, Object param1, long param2) {
        if (param0 != 29166) {
          return;
        }
        try {
          this.a(-1, param1, 1, param2);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "dd.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static cn a(int param0, int param1) {
        if (param1 == 1) {
          return nt.a(param0, 1, 5200, false, false, true);
        }
        dd.a(10);
        return nt.a(param0, 1, 5200, false, false, true);
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 8476) {
          return;
        }
        field_d = null;
    }

    private final void a(int param0, pb param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null) {
            param1.p(123);
            param1.c(param0 - 7976);
            this.field_e = this.field_e + param1.field_m;
          }
          if (param0 == 1) {
            return;
          }
          this.a(85, (Object) null, 32L);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("dd.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void a(int param0, Object param1, int param2, long param3) {
        tja var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        pb var8 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          if (param2 > this.field_g) {
            throw new IllegalStateException();
          }
          this.a(param3, 1);
          this.field_e = this.field_e - param2;
          while (this.field_e < 0) {
            var8 = (pb) (this.field_f.b((byte) 60));
            this.a(param0 ^ -2, var8);
          }
          var6 = new tja(param1, param2);
          this.field_c.a(var6, (byte) 114, param3);
          this.field_f.a(var6, -11396);
          ((pb) ((Object) var6)).field_j = 0L;
          if (param0 == -1) {
            return;
          }
          this.a(6, (Object) null, 106, 15L);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_11_0 = var6_ref;
          stackIn_11_1 = new StringBuilder().append("dd.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    dd(int param0) {
        this(param0, param0);
    }

    private dd(int param0, int param1) {
        int var3;
        this.field_f = new hma();
        this.field_g = param0;
        this.field_e = param0;
        var3 = 1;
        while (true) {
          if (param0 <= var3 + var3) {
            this.field_c = new sk(var3);
            return;
          }
          if (param1 > var3) {
            var3 = var3 + var3;
            continue;
          }
          break;
        }
        this.field_c = new sk(var3);
        return;
    }

    private final void a(long param0, int param1) {
        pb var4 = (pb) (this.field_c.a(param0, false));
        this.a(param1, var4);
    }

    static {
        field_d = new int[8192];
    }
}
