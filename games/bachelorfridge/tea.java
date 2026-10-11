/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tea extends mf implements lja {
    static String field_lb;
    private ue field_ob;
    private boolean field_nb;
    private boolean field_mb;

    final boolean a(int param0) {
        if (!this.field_C) {
          if (param0 <= -32) {
            return super.a(-98);
          }
          return false;
        }
        if (this.field_nb) {
          if (param0 <= -32) {
            return super.a(-98);
          }
          return false;
        }
        eq var2 = nea.f((byte) 94);
        if (var2 != null) {
          this.a(-12331, false, var2);
          if (param0 <= -32) {
            return super.a(-98);
          }
          return false;
        }
        if (param0 <= -32) {
          return super.a(-98);
        }
        return false;
    }

    private final void a(int param0, boolean param1, eq param2) {
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        hc var5 = null;
        int var6 = 0;
        var6 = BachelorFridge.field_y;
        try {
          if (param0 != -12331) {
            this.field_mb = false;
          }
          this.field_nb = true;
          if (!param2.field_e) {
            if (param2.field_a == null) {
              var4 = param2.field_g;
              if (param2.field_d == 248) {
                if (!param1) {
                  sa.c(-103);
                }
                var4 = lda.field_b;
                this.field_mb = true;
              }
            } else {
              var4 = uga.field_A;
              if (this.field_ob != null) {
                this.field_ob.a(param0 + 26653);
              }
            }
          } else {
            var4 = dla.field_m;
          }
          var5 = new hc((mf) (this), qia.field_a, var4);
          if (param2.field_e) {
            if (param2.field_h) {
              this.e(new ar(this), 33);
              return;
            }
            var5.a((pl) (this), tj.field_a, 19528);
          } else {
            if (!this.field_mb) {
              if (5 != param2.field_d) {
                var5.a(7, ina.field_s, -1);
              } else {
                var5.a(7, tt.field_h, 11);
                var5.a(7, uda.field_ab, 17);
              }
            } else {
              var5.a((pl) (this), tj.field_a, 19528);
            }
            if (param2.field_d != 3) {
              if (param2.field_d != 6) {
                this.e(var5, 33);
                return;
              }
              var5.a(7, wha.field_b, 9);
            } else {
              var5.a(param0 ^ -12334, pr.field_c, 7);
            }
          }
          this.e(var5, 33);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_34_0 = var4_ref;
          stackIn_34_1 = new StringBuilder().append("tea.NA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    final void r(int param0) {
        if (param0 != -7) {
          return;
        }
        this.a(-12331, true, wu.a(248, (byte) 80, lda.field_b));
    }

    public static void q(int param0) {
        field_lb = null;
        if (param0 != 10462) {
          field_lb = (String) null;
        }
    }

    tea(rp param0, ue param1) {
        super(param0, qia.field_a, rma.field_c, false, false);
        try {
          this.field_ob = param1;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "tea.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, hf param1, int param2, byte param3, int param4) {
        if (this.field_mb) {
          nw.a(true, false, (byte) 60);
          return;
        }
        try {
          tr.a(-97);
          this.p(-120);
          if (param3 < 50) {
            field_lb = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "tea.AA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static int a(CharSequence param0, char param1, int param2) {
        int var5 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = BachelorFridge.field_y;
        try {
          var3_int = 0;
          var4 = param0.length();
          if (param2 <= 10) {
            stackIn_3_0 = -33;
            return stackIn_3_0;
          }
          for (var5 = 0; var4 > var5; var5++) {
            if (param1 == param0.charAt(var5)) {
              var3_int++;
            }
          }
          stackIn_12_0 = var3_int;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("tea.LA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_lb = "Your game";
    }
}
