/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf extends ne implements in {
    static ja[] field_Hb;
    private boolean field_Ib;
    static int field_Eb;
    static int field_Db;
    static String field_Cb;
    private fe field_Gb;
    private boolean field_Fb;

    public final void a(int param0, int param1, gn param2, int param3, int param4) {
        if (param3 >= -83) {
          return;
        }
        if (this.field_Ib) {
          io.a(-21113, true, false);
          return;
        }
        try {
          va.a((byte) 62);
          this.m(-7435);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "tf.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean i(int param0) {
        gh var2 = null;
        gh var2Lifetime1;
        if (param0 != -27388) {
          uj var3 = (uj) null;
          tf.a((uj) null, (byte) -100);
          if (!this.field_R) {
            return super.i(-27388);
          }
          if (this.field_Fb) {
            return super.i(-27388);
          }
          var2 = of.d(param0 ^ -27388);
          if (var2 != null) {
            this.a(-6, false, var2);
            return super.i(-27388);
          }
          return super.i(-27388);
        }
        if (!this.field_R) {
          return super.i(-27388);
        }
        if (this.field_Fb) {
          return super.i(-27388);
        }
        var2Lifetime1 = of.d(param0 ^ -27388);
        if (var2Lifetime1 != null) {
          this.a(-6, false, var2Lifetime1);
          return super.i(-27388);
        }
        return super.i(-27388);
    }

    private final void a(int param0, boolean param1, gh param2) {
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        wd var5 = null;
        int var6 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          this.field_Fb = true;
          if (param0 != -6) {
            field_Eb = 69;
          }
          if (!param2.field_d) {
            if (param2.field_b != null) {
              var4 = wg.field_d;
              if (this.field_Gb != null) {
                this.field_Gb.a(496);
              }
            } else {
              var4 = param2.field_h;
              if (param2.field_c == 248) {
                if (!param1) {
                  nq.f(-42);
                }
                var4 = ba.field_p;
                this.field_Ib = true;
              }
            }
          } else {
            var4 = qa.field_g;
          }
          var5 = new wd((ne) (this), ci.field_d, var4);
          if (!param2.field_d) {
            if (!this.field_Ib) {
              if (param2.field_c != 5) {
                var5.a(sn.field_Zb, -1, true);
              } else {
                var5.a(lc.field_g, 11, true);
                var5.a(oe.field_b, 17, true);
              }
            } else {
              var5.a(ub.field_xb, param0 ^ 58, (bj) (this));
            }
            if (param2.field_c == 3) {
              var5.a(od.field_zb, 7, true);
            } else {
              if (param2.field_c == 6) {
                var5.a(wm.field_S, 9, true);
              }
            }
          } else {
            if (param2.field_e) {
              this.a((cf) (new pj(this)), (byte) 122);
              return;
            }
            var5.a(ub.field_xb, -112, (bj) (this));
          }
          this.a((cf) (var5), (byte) 125);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_33_0 = var4_ref;
          stackIn_33_1 = new StringBuilder().append("tf.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final static we a(uj param0, byte param1) {
        we var2 = null;
        RuntimeException var2_ref = null;
        uj var3 = null;
        we stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -62) {
            var3 = (uj) null;
            tf.a((uj) null, (byte) 86);
          }
          var2 = new we(param0, param0);
          gb.field_e.a(var2, false);
          bh.field_a.b(param0);
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("tf.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    tf(vk param0, fe param1) {
        super(param0, ci.field_d, og.field_M, false, false);
        try {
          this.field_Gb = param1;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "tf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void p(int param0) {
        this.a(-6, true, p.a(-97, ba.field_p, param0));
    }

    public static void o(int param0) {
        field_Cb = null;
        field_Hb = null;
        int var1 = -24 / ((10 - param0) / 37);
    }

    static {
        field_Db = -1;
        field_Eb = 0;
        field_Cb = "Members' Benefits";
    }
}
