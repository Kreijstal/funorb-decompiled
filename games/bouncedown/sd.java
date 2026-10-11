/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd extends sh implements rc {
    private boolean field_ob;
    private boolean field_nb;
    static int field_lb;
    static be field_mb;
    static gk field_pb;
    private gh field_kb;

    public final void a(byte param0, int param1, int param2, int param3, wd param4) {
        rg var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (this.field_nb) {
            l.a(false, true, -100);
            return;
          }
          ck.e((byte) 125);
          if (param0 < 6) {
            var7 = (rg) null;
            this.a(-84, true, (rg) null);
            this.a(true);
          } else {
            this.a(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("sd.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void j(byte param0) {
        this.a(-1, true, wb.a(248, param0 ^ -51, ih.field_P));
        if (param0 != -52) {
          rg var3 = (rg) null;
          this.a(28, false, (rg) null);
        }
    }

    sd(pf param0, gh param1) {
        super(param0, ne.field_v, ce.field_t, false, false);
        try {
          this.field_kb = param1;
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "sd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(boolean param0) {
        field_pb = null;
        if (param0) {
          sd.b(false);
          field_mb = null;
          return;
        }
        field_mb = null;
    }

    private final void a(int param0, boolean param1, rg param2) {
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        uc var5 = null;
        int var6 = 0;
        var6 = Bounce.field_N;
        try {
          this.field_ob = true;
          if (param0 != -1) {
            field_lb = 6;
          }
          if (param2.field_f) {
            var4 = ha.field_k;
          } else {
            if (param2.field_d == null) {
              var4 = param2.field_c;
              if (param2.field_g == 248) {
                if (!param1) {
                  rg.b((byte) -128);
                }
                var4 = ih.field_P;
                this.field_nb = true;
              }
            } else {
              var4 = ma.field_n;
              if (this.field_kb != null) {
                this.field_kb.a(-3814);
              }
            }
          }
          var5 = new uc((sh) (this), ne.field_v, var4);
          if (param2.field_f) {
            if (param2.field_a) {
              this.a(10768, new eb(this));
              return;
            }
            var5.a(pc.field_i, (sk) (this), -4);
          } else {
            if (this.field_nb) {
              var5.a(pc.field_i, (sk) (this), -4);
            } else {
              if (param2.field_g == 5) {
                var5.a(ta.field_e, 11, (byte) 114);
                var5.a(i.field_g, 17, (byte) 85);
              } else {
                var5.a(pe.field_h, -1, (byte) 124);
              }
            }
            if (param2.field_g == 3) {
              var5.a(oc.field_c, 7, (byte) 80);
            } else {
              if (param2.field_g == 6) {
                var5.a(da.field_c, 9, (byte) 93);
              }
            }
          }
          this.a(10768, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_32_0 = var4_ref;
          stackIn_32_1 = new StringBuilder().append("sd.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    final boolean e(byte param0) {
        rg var2 = null;
        rg var2Lifetime1;
        if (param0 != 21) {
          this.e((byte) -34);
          if (!this.field_D) {
            return super.e((byte) 21);
          }
          if (this.field_ob) {
            return super.e((byte) 21);
          }
          var2 = jf.a(true);
          if (var2 != null) {
            this.a(-1, false, var2);
            return super.e((byte) 21);
          }
          return super.e((byte) 21);
        }
        if (!this.field_D) {
          return super.e((byte) 21);
        }
        if (this.field_ob) {
          return super.e((byte) 21);
        }
        var2Lifetime1 = jf.a(true);
        if (var2Lifetime1 != null) {
          this.a(-1, false, var2Lifetime1);
          return super.e((byte) 21);
        }
        return super.e((byte) 21);
    }

    static {
        field_lb = 250;
    }
}
