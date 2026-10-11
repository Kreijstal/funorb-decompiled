/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc extends cj {
    static pb field_l;
    eaa field_k;

    final void a(jm param0, byte param1) {
        try {
          this.field_k.a(param0, true);
          if (param1 <= 37) {
            jm var4 = (jm) null;
            this.a((jm) null, (byte) -11);
          }
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "lc.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(op param0, boolean param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        jm var5 = null;
        jm var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = BachelorFridge.field_y;
        try {
          var6 = (jm) (this.field_k.b((byte) 90));
          while (var6 != null) {
            var6.a(param1, param0);
            var6 = (jm) (this.field_k.c(0));
          }
          if (!param1) {
            return;
          }
          var5 = (jm) null;
          this.a((jm) null, (byte) 97);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("lc.K(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        ub stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 5) {
            this.field_k = (eaa) null;
          }
          stackIn_3_0 = new ub(param1, this);
          return (at) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("lc.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void a(lu param0, int param1) {
        int var4 = 0;
        jm var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = BachelorFridge.field_y;
        try {
          param0.d(this.field_k.g(0), 0);
          if (param1 != -9) {
            this.field_k = (eaa) null;
          }
          var5 = (jm) (this.field_k.b((byte) 90));
          while (var5 != null) {
            var5.a(param0, (byte) -63);
            var5 = (jm) (this.field_k.c(0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("lc.O(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void c(boolean param0) {
        field_l = null;
        if (param0) {
          field_l = (pb) null;
        }
    }

    lc(lu param0) {
        super(6);
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        try {
          this.field_k = new eaa();
          var2_int = param0.b(16711935);
          while (true) {
            var2_int--;
            if (var2_int < 0) {
              return;
            }
            var3 = param0.b(16711935);
            if (var3 == 1) {
              this.field_k.a(new oca(param0), true);
              continue;
            }
            if (var3 == 0) {
              this.field_k.a(new iia(param0), true);
              continue;
            }
            if (var3 == 2) {
              this.field_k.a(new tga(param0), true);
              continue;
            }
            if (3 == var3) {
              this.field_k.a(new wp(param0), true);
              continue;
            }
            if (var3 == 4) {
              this.field_k.a(new fi(param0), true);
              continue;
            }
            if (var3 == 5) {
              this.field_k.a(new bg(param0), true);
              continue;
            }
            if (var3 == 6) {
              this.field_k.a(new bja(param0), true);
              continue;
            }
            if (var3 == 7) {
              this.field_k.a(new ej(param0), true);
              continue;
            }
            if (var3 == 8) {
              this.field_k.a(new ns(param0), true);
              continue;
            }
            if (var3 != 9) {
              throw new IllegalStateException();
            }
            this.field_k.a(new ow(param0), true);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("lc.<init>(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    public lc() {
        super(6);
        this.field_k = new eaa();
    }

    final static void b(int param0) {
        if (param0 == -1) {
          if (gm.field_k) {
            ki.g(param0 - 25);
          }
          return;
        }
        field_l = (pb) null;
        if (gm.field_k) {
          ki.g(param0 - 25);
        }
    }

    static {
    }
}
