/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class koa {
    static ka[] field_b;
    static String field_d;
    private int field_e;
    private lj[] field_f;
    private dha[] field_a;
    static String field_c;

    final static int b(int param0) {
        if (param0 != 0) {
          field_d = (String) null;
        }
        return qf.field_i;
    }

    private final void a(byte param0) {
        int var3_int = 0;
        int var5 = 0;
        int incrementValue$0 = 0;
        int var2;
        int var6;
        lj[] var3;
        int var4;
        var6 = TombRacer.field_G ? 1 : 0;
        var2 = 0;
        if (param0 != -12) {
          return;
        }
        for (var3_int = 0; this.field_f.length > var3_int; var3_int++) {
          if (null != this.field_f[var3_int]) {
            if (this.field_f[var3_int].n(param0 + 31986).b(59)) {
              var2++;
            }
          } else {
            var2++;
          }
        }
        if (var2 > 0) {
          var3 = new lj[this.field_f.length - var2];
          if (var3.length > 0) {
            var4 = 0;
            for (var5 = 0; var5 < this.field_f.length; var5++) {
              if (null != this.field_f[var5] &&
                !this.field_f[var5].n(31974).b(59)) {
                incrementValue$0 = var4;
                var4++;
                var3[incrementValue$0] = this.field_f[var5];
              }
            }
          }
          this.field_f = var3;
        }
    }

    final void a(int param0, lj[] param1) {
        try {
          if (param0 != 9) {
            this.field_f = (lj[]) null;
          }
          this.field_f = param1;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "koa.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, ew param1, kh param2) {
        int var4_int = 0;
        int var5 = TombRacer.field_G ? 1 : 0;
        try {
          this.a((byte) -12);
          param2.a((byte) 43, this.field_f.length, iia.d(this.field_e, 22972));
          for (var4_int = 0; this.field_f.length > var4_int; var4_int++) {
            if (this.field_f[var4_int].h((byte) 114) != param1) {
              param2.a((byte) -126, 0, 1);
              param2.a((byte) -127, this.field_f[var4_int].n(31974).field_d, 8);
            } else {
              param2.a((byte) 70, 1, 1);
              param2.a((byte) 61, this.field_f[var4_int].i((byte) 84).field_d, 8);
            }
          }
          if (param0 != 30489) {
            this.field_a = (dha[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "koa.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(ew param0, int param1) {
        int var3_int = 0;
        dha var4 = null;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          if (this.field_a == null) {
            return;
          }
          this.field_f = new lj[this.field_a.length];
          for (var3_int = 0; this.field_a.length > var3_int; var3_int++) {
            var4 = this.field_a[var3_int];
            this.field_f[var3_int] = param0.a(28672, var4.field_a, var4.field_b);
          }
          this.field_a = null;
          if (param1 != 8) {
            field_b = (ka[]) null;
            this.a((byte) -12);
          } else {
            this.a((byte) -12);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("koa.E(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final lj[] c(int param0) {
        if (param0 != 1) {
          field_c = (String) null;
        }
        return this.field_f;
    }

    koa(int param0, int param1) {
        this.field_e = param0;
        this.field_f = new lj[]{};
    }

    koa(int param0, int param1, int param2, kh param3) {
        int var6 = 0;
        int var5_int = 0;
        dha[] stackIn_6_0;
        int stackIn_6_1;
        dha stackIn_6_2;
        dha stackIn_6_3;
        dha stackIn_7_2;
        dha stackIn_7_3;
        boolean stackIn_7_4;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          this.field_e = param0;
          var5_int = param3.b((byte) 44, iia.d(param0, 22972));
          this.field_f = new lj[var5_int];
          this.field_a = new dha[var5_int];
          for (var6 = 0; var6 < var5_int; var6++) {
            if (param2 <= 9) {
              this.field_a[var6] = new dha(false, param3.b((byte) 44, 8));
            } else {
              stackIn_6_0 = this.field_a;
              stackIn_6_1 = var6;
              stackIn_6_2 = null;
              stackIn_6_3 = null;
              if (param3.b((byte) 44, 1) != 1) {
                stackIn_7_2 = null;
                stackIn_7_3 = null;
                stackIn_7_4 = false;
              } else {
                stackIn_7_2 = null;
                stackIn_7_3 = null;
                stackIn_7_4 = true;
              }
              stackIn_6_0[stackIn_6_1] = new dha(stackIn_7_4, param3.b((byte) 44, 8));
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("koa.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        field_c = null;
        if (param0 > -71) {
          koa.b(50);
        }
    }

    static {
        field_d = "These trigger-happy dart totems are ready to shoot their mouths off. And yours. Best dart past them quickly.";
        field_c = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
