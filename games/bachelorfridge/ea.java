/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea implements Runnable {
    static int field_d;
    private in field_e;
    static int field_f;
    private Thread field_a;
    private boolean field_c;
    int field_b;

    public final void run() {
        try {
          InterruptedException interruptedException = null;
          int var5 = 0;
          se var7 = null;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          Exception var2_ref = null;
          String var6 = null;
          var5 = BachelorFridge.field_y;
          while (!this.field_c) {
            var2 = this.field_e;
            synchronized (var2) {
              var7 = (se) (this.field_e.a(true));
              if (var7 != null) {
                this.field_b = this.field_b - 1;
                decompiledRegionSelector0 = 1;
              } else {
                try {
                  this.field_e.wait();
                } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                }
                decompiledRegionSelector0 = 0;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              continue;
            }
            try {
              if (var7.field_v == 2) {
                var7.field_w.a(var7.field_t.length, var7.field_t, (int)var7.field_h, 0);
                var7.field_n = false;
              } else {
                if (var7.field_v == 3) {
                  var7.field_t = var7.field_w.a((int)var7.field_h, (byte) -5);
                  var7.field_n = false;
                } else {
                  var7.field_n = false;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              cv.a(1, (String) null, (Throwable) ((Object) var2_ref));
              var7.field_n = false;
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte param0) {
        try {
          this.field_c = true;
          synchronized (this.field_e) {
            this.field_e.notifyAll();
            if (param0 > -3) {
              this.field_a = (Thread) null;
            }
          }
          try {
            this.field_a.join();
          } catch (InterruptedException interruptedException) {
          }
          this.field_a = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final se a(ta param0, byte param1, int param2) {
        se var4 = null;
        RuntimeException var4_ref = null;
        se stackIn_2_0 = null;
        se stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new se();
          var4.field_v = 3;
          var4.field_w = param0;
          var4.field_h = (long)param2;
          var4.field_q = false;
          this.a(var4, -6778);
          if (param1 <= -108) {
            stackIn_4_0 = var4;
            return stackIn_4_0;
          }
          stackIn_2_0 = (se) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("ea.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, byte param2, int[] param3, Object[] param4) {
        int var10 = 0;
        int incrementValue$0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        int var9 = 0;
        int var11 = 0;
        Object var12 = null;
        int var13 = 0;
        var13 = BachelorFridge.field_y;
        try {
          if (param2 < 9) {
            ((boolean[]) (param4[0]))[16] = ((boolean[]) (((Object[]) (param4[11]))[4]))[0];
          }
          if (param0 <= param1) {
            return;
          }
          var5_int = (param1 + param0) / 2;
          var6 = param1;
          var7 = param3[var5_int];
          param3[var5_int] = param3[param0];
          param3[param0] = var7;
          var8 = param4[var5_int];
          param4[var5_int] = param4[param0];
          param4[param0] = var8;
          stackIn_8_0 = (var7 != 2147483647) ? 1 : 0;
          var9 = stackIn_8_0;
          for (var10 = param1; param0 > var10; var10++) {
            if (param3[var10] < (var7 + (var9 & var10))) {
              var11 = param3[var10];
              param3[var10] = param3[var6];
              param3[var6] = var11;
              var12 = param4[var10];
              param4[var10] = param4[var6];
              incrementValue$0 = var6;
              var6++;
              param4[incrementValue$0] = var12;
            }
          }
          param3[param0] = param3[var6];
          param3[var6] = var7;
          param4[param0] = param4[var6];
          param4[var6] = var8;
          ea.a(var6 - 1, param1, (byte) 112, param3, param4);
          ea.a(param0, var6 + 1, (byte) 74, param3, param4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("ea.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    private final void a(se param0, int param1) {
        synchronized (this.field_e) {
          if (param1 != -6778) {
            this.field_a = (Thread) null;
          }
          this.field_e.a(param0, (byte) 106);
          this.field_b = this.field_b + 1;
          this.field_e.notifyAll();
        }
    }

    final se a(int param0, byte param1, ta param2) {
        se var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        Object var6 = null;
        se var7 = null;
        int var9 = 0;
        se stackIn_9_0 = null;
        se stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        Throwable decompiledCaughtException = null;
        var9 = BachelorFridge.field_y;
        try {
          var4 = new se();
          var4.field_v = 1;
          var5 = -20 / ((param1 - 63) / 40);
          var6 = this.field_e;
          synchronized (var6) {
            var7 = (se) (this.field_e.a(-122));
            while (var7 != null) {
              if ((long)param0 == var7.field_h &&
                param2 == var7.field_w &&
                var7.field_v == 2) {
                var4.field_t = var7.field_t;
                var4.field_n = false;
                stackIn_9_0 = var4;
                return stackIn_9_0;
              }
              var7 = (se) (this.field_e.a((byte) 122));
            }
          }
          var4.field_t = param2.a(param0, (byte) -5);
          var4.field_q = true;
          var4.field_n = false;
          stackIn_16_0 = var4;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_19_0 = var4_ref;
          stackIn_19_1 = new StringBuilder().append("ea.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final se a(ta param0, byte[] param1, int param2, int param3) {
        se var5 = null;
        RuntimeException var5_ref = null;
        se stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new se();
          var5.field_v = 2;
          var5.field_q = false;
          var5.field_h = (long)param2;
          var5.field_w = param0;
          var5.field_t = param1;
          this.a(var5, -6778);
          if (param3 != 5) {
            field_d = -92;
          }
          stackIn_3_0 = var5;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_6_0 = var5_ref;
          stackIn_6_1 = new StringBuilder().append("ea.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    ea(ht param0) {
        eh var2 = null;
        this.field_e = new in();
        this.field_c = false;
        this.field_b = 0;
        try {
          var2 = param0.a((Runnable) (this), 2, 5);
          while (var2.field_f == 0) {
            gda.a(false, 10L);
          }
          if (var2.field_f == 2) {
            throw new RuntimeException();
          }
          this.field_a = (Thread) (var2.field_e);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "ea.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = 200;
    }
}
