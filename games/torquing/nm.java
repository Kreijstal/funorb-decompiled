/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm extends mn implements ng {
    private boolean field_gb;
    private boolean field_hb;
    private ki field_ib;

    nm(ln param0, ki param1) {
        super(param0, pe.field_E, po.field_y, false, false);
        try {
          this.field_ib = param1;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "nm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(byte param0, lg param1, int param2, int param3, int param4) {
        if (param0 >= -85) {
          lg var7 = (lg) null;
          this.a((byte) 95, (lg) null, 85, -55, 97);
        }
        if (this.field_gb) {
          ea.a(false, (byte) 126, true);
          return;
        }
        try {
          m.c(-103);
          this.b(true);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "nm.NA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void o(int param0) {
        if (param0 != 11) {
          return;
        }
        this.a(true, pg.a(248, a.field_a, -1), (byte) -117);
    }

    final boolean h(int param0) {
        dn var3 = null;
        dn var3Lifetime1;
        dn var3Lifetime2;
        dn var3Lifetime3;
        if (!this.field_D) {
          if (param0 == -7) {
            return super.h(-7);
          }
          var3 = (dn) null;
          this.a(true, (dn) null, (byte) 100);
          return super.h(-7);
        }
        if (this.field_hb) {
          if (param0 == -7) {
            return super.h(-7);
          }
          var3Lifetime1 = (dn) null;
          this.a(true, (dn) null, (byte) 100);
          return super.h(-7);
        }
        dn var2 = ji.a(false);
        if (var2 == null) {
          if (param0 == -7) {
            return super.h(-7);
          }
          var3Lifetime2 = (dn) null;
          this.a(true, (dn) null, (byte) 100);
          return super.h(-7);
        }
        this.a(false, var2, (byte) -110);
        if (param0 == -7) {
          return super.h(-7);
        }
        var3Lifetime3 = (dn) null;
        this.a(true, (dn) null, (byte) 100);
        return super.h(-7);
    }

    private final void a(boolean param0, dn param1, byte param2) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        fo var5 = null;
        int var6 = 0;
        var6 = Torquing.field_u;
        try {
          this.field_hb = true;
          if (param1.field_b) {
            var4 = d.field_q;
          } else {
            if (null != param1.field_d) {
              var4 = s.field_u;
              if (null != this.field_ib) {
                this.field_ib.a((byte) 121);
              }
            } else {
              var4 = param1.field_e;
              if (param1.field_a == 248) {
                if (param0) {
                  this.field_gb = true;
                  var4 = a.field_a;
                } else {
                  id.a((byte) 57);
                  this.field_gb = true;
                  var4 = a.field_a;
                }
              }
            }
          }
          var5 = new fo((mn) (this), pe.field_E, var4);
          if (param2 >= -102) {
            this.field_ib = (ki) null;
          }
          if (param1.field_b) {
            if (param1.field_g) {
              this.c(new sc(this), 33);
              return;
            }
            var5.a(0, vd.field_d, (ca) (this));
          } else {
            if (!this.field_gb) {
              if (param1.field_a == 5) {
                var5.a(kl.field_n, 5177, 11);
                var5.a(pf.field_q, 5177, 17);
              } else {
                var5.a(qh.field_a, 5177, -1);
              }
            } else {
              var5.a(0, vd.field_d, (ca) (this));
            }
            if (param1.field_a != 3) {
              if (param1.field_a == 6) {
                var5.a(pf.field_u, 5177, 9);
              }
            } else {
              var5.a(dc.field_b, 5177, 7);
            }
          }
          this.c(var5, 33);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_31_0 = var4_ref;
          stackIn_31_1 = new StringBuilder().append("nm.WA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
    }
}
