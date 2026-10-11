/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sn extends os implements oo {
    static boolean field_Y;
    private boolean field_ab;
    private boolean field_Z;
    private rq field_X;

    public final void a(int param0, int param1, int param2, htb param3, int param4) {
        if (this.field_ab) {
          rga.a(false, true, false);
          return;
        }
        cnb.f((byte) -74);
        if (param0 != 11) {
          return;
        }
        try {
          this.l((byte) -106);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "sn.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void e(boolean param0) {
        this.a(true, param0, tma.a(248, mtb.field_q, (byte) -124));
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5, lta param6) {
        try {
          dva.a(param2, param6, param0, 3, param4, param5, 255, param3);
          if (param1 <= 68) {
            field_Y = false;
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "sn.U(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, jk param2, byte param3, int param4, soa param5, int param6) {
        hqb var13 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        try {
          pea.$cfr$intArgs$a$91f64d33677c(param2.field_zb, param2, -1, (int[]) null, param2.field_Hb, param5, param2.field_xb, 103, -1);
          cka.field_o.a(true, param3 - 35);
          cka.field_o.a(-70, 0, (int[]) null);
          cka.field_o.b(param3 - 9994);
          var13 = cka.field_o;
          var8 = param4;
          var9 = param0;
          var10 = param6;
          if (param3 != 71) {
            lta var12 = (lta) null;
            sn.a(64, (byte) -32, -119, -6, 29, 12, (lta) null);
          }
          var11 = param1;
          var13.field_i.b(var8, -29060, var9, var10, var11);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "sn.R(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ')');
        }
    }

    private final void a(boolean param0, boolean param1, tpa param2) {
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        nna var5 = null;
        int var6 = 0;
        soa var7 = null;
        var6 = VoidHunters.field_G;
        try {
          this.field_Z = true;
          if (param2.field_g) {
            var4 = uj.field_c;
          } else {
            if (null == param2.field_e) {
              var4 = param2.field_f;
              if (param2.field_d == 248) {
                if (!param0) {
                  qlb.b((byte) -75);
                }
                var4 = mtb.field_q;
                this.field_ab = true;
              }
            } else {
              var4 = ks.field_p;
              if (null != this.field_X) {
                this.field_X.a(1546);
              }
            }
          }
          var5 = new nna((os) (this), vob.field_r, var4);
          if (param2.field_g) {
            if (param2.field_c) {
              this.b(new w(this), -99);
              return;
            }
            var5.a((byte) 107, tn.field_b, (sba) (this));
          } else {
            if (this.field_ab) {
              var5.a((byte) 98, tn.field_b, (sba) (this));
            } else {
              if (param2.field_d == 5) {
                var5.a(-128, fma.field_c, 11);
                var5.a(-114, vda.field_q, 17);
              } else {
                var5.a(-115, vab.field_a, -1);
              }
            }
            if (param2.field_d == 3) {
              var5.a(-115, mab.field_h, 7);
            } else {
              if (param2.field_d == 6) {
                var5.a(-124, lia.field_c, 9);
              }
            }
          }
          if (param1) {
            var7 = (soa) null;
            sn.a(-93, 7, (jk) null, (byte) 42, -22, (soa) null, 46);
          }
          this.b(var5, 99);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_33_0 = var4_ref;
          stackIn_33_1 = new StringBuilder().append("sn.P(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    sn(ida param0, rq param1) {
        super(param0, vob.field_r, oma.field_c, false, false);
        try {
          this.field_X = param1;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "sn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0) {
        tpa var2 = null;
        tpa var2Lifetime1;
        if (param0 != 248) {
          this.field_ab = false;
          if (!this.field_z) {
            return super.a(248);
          }
          if (this.field_Z) {
            return super.a(248);
          }
          var2 = nkb.a(10589);
          if (var2 != null) {
            this.a(false, false, var2);
            return super.a(248);
          }
          return super.a(248);
        }
        if (!this.field_z) {
          return super.a(248);
        }
        if (this.field_Z) {
          return super.a(248);
        }
        var2Lifetime1 = nkb.a(10589);
        if (var2Lifetime1 != null) {
          this.a(false, false, var2Lifetime1);
          return super.a(248);
        }
        return super.a(248);
    }

    static {
        field_Y = true;
    }
}
