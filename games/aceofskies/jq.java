/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jq extends oo implements dn {
    static dq field_fb;
    private wd field_db;
    private boolean field_eb;
    private boolean field_gb;

    public static void m(int param0) {
        if (param0 < 61) {
          jq.m(-87);
          field_fb = null;
          return;
        }
        field_fb = null;
    }

    final void n(int param0) {
        int var2 = -27 / ((71 - param0) / 52);
        this.a(true, dq.a(248, 32, rl.field_i), 11);
    }

    jq(lt param0, wd param1) {
        super(param0, b.field_c, pg.field_b, false, false);
        try {
          this.field_db = param1;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "jq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, mi param1, int param2, int param3, byte param4) {
        if (this.field_eb) {
          hg.a(false, true, true);
          return;
        }
        try {
          fg.b(true);
          this.h((byte) -15);
          int var6_int = -106 % ((-27 - param4) / 61);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "jq.DA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(boolean param0, fr param1, int param2) {
        String stackIn_33_2 = null;
        String var4 = null;
        int var6 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          this.field_gb = true;
          if (param2 != 11) {
            this.field_eb = false;
          }
          if (param1.field_b) {
            var4 = aa.field_d;
          } else if (null != param1.field_c) {
            var4 = HudMessage.field_e;
            if (this.field_db != null) {
              this.field_db.a((byte) -77);
            }
          } else {
            var4 = param1.field_f;
            if (param1.field_a == 248) {
              if (!param0) {
                ua.c(0);
              }
              var4 = rl.field_i;
              this.field_eb = true;
            }
          }
          jn var5 = new jn((oo) (this), b.field_c, var4);
          if (param1.field_b) {
            if (param1.field_d) {
              this.d(new rs(this), -30244);
              return;
            }
            var5.a((no) (this), param2 + 17536, mq.field_i);
          } else {
            if (this.field_eb) {
              var5.a((no) (this), param2 ^ 17536, mq.field_i);
            } else if (param1.field_a == 5) {
              var5.a(11, (byte) 105, ln.field_a);
              var5.a(17, (byte) -126, mb.field_s);
            } else {
              var5.a(-1, (byte) -51, Bullet.field_j);
            }
            if (param1.field_a == 3) {
              var5.a(7, (byte) -103, lu.field_a);
            } else if (param1.field_a == 6) {
              var5.a(9, (byte) -41, ao.field_d);
            }
          }
          this.d(var5, -30244);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4_ref = decompiledCaughtException;
          RuntimeException stackIn_32_0 = var4_ref;
          StringBuilder stackIn_32_1 = new StringBuilder().append("jq.KA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean h(int param0) {
        if (param0 != 11) {
          mi var3 = (mi) null;
          this.a(95, (mi) null, -21, 40, (byte) -17);
          if (!this.field_z) {
            return super.h(11);
          }
          if (this.field_gb) {
            return super.h(11);
          }
          fr var2 = oe.d(86);
          if (var2 == null) {
            return super.h(11);
          }
          this.a(false, var2, 11);
          return super.h(11);
        }
        if (!this.field_z) {
          return super.h(11);
        }
        if (this.field_gb) {
          return super.h(11);
        }
        fr var2Lifetime1 = oe.d(86);
        if (var2Lifetime1 == null) {
          return super.h(11);
        }
        this.a(false, var2Lifetime1, 11);
        return super.h(11);
    }

    static {
        field_fb = new dq();
    }
}
