/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dm extends vk implements vo {
    private boolean field_yb;
    private boolean field_xb;
    static int[] field_zb;
    private pl field_Ab;
    static int field_Cb;
    static int field_Bb;

    final static void i(byte param0) {
        if (null != to.field_r) {
          to.field_r.p(-108);
        }
        aa.field_c = new fh();
        ph.field_l.c(aa.field_c, -125);
        if (param0 == -51) {
          return;
        }
        field_zb = (int[]) null;
    }

    dm(kn param0, pl param1) {
        super(param0, ba.field_d, hm.field_e, false, false);
        try {
          this.field_Ab = param1;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "dm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean q(int param0) {
        if (param0 == 22452) {
          return ga.field_f > 250 ? true : false;
        }
        dm.r(-8);
        return ga.field_f > 250 ? true : false;
    }

    final boolean c(boolean param0) {
        id var2 = null;
        id var2Lifetime1;
        if (param0) {
          this.h((byte) -120);
          if (!this.field_N) {
            return super.c(false);
          }
          if (this.field_xb) {
            return super.c(false);
          }
          var2 = gg.d((byte) 52);
          if (var2 != null) {
            this.a(var2, -127, false);
            return super.c(false);
          }
          return super.c(false);
        }
        if (!this.field_N) {
          return super.c(false);
        }
        if (this.field_xb) {
          return super.c(false);
        }
        var2Lifetime1 = gg.d((byte) 52);
        if (var2Lifetime1 != null) {
          this.a(var2Lifetime1, -127, false);
          return super.c(false);
        }
        return super.c(false);
    }

    public static void r(int param0) {
        field_zb = null;
        if (param0 > -19) {
          field_zb = (int[]) null;
        }
    }

    private final void a(id param0, int param1, boolean param2) {
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        vl var5 = null;
        int var6 = 0;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          this.field_xb = true;
          if (param1 >= -121) {
            this.field_yb = true;
          }
          if (!param0.field_g) {
            if (null == param0.field_f) {
              var4 = param0.field_c;
              if (param0.field_a == 248) {
                if (!param2) {
                  fq.g((byte) -73);
                }
                this.field_yb = true;
                var4 = ao.field_b;
              }
            } else {
              var4 = ek.field_e;
              if (this.field_Ab != null) {
                this.field_Ab.a((byte) 103);
              }
            }
          } else {
            var4 = gk.field_jb;
          }
          var5 = new vl((vk) (this), ba.field_d, var4);
          if (!param0.field_g) {
            if (!this.field_yb) {
              if (param0.field_a != 5) {
                var5.a(-1, -1, bo.field_f);
              } else {
                var5.a(11, -1, jj.field_c);
                var5.a(17, -1, mk.field_e);
              }
            } else {
              var5.a(1707, (fn) (this), vi.field_J);
            }
            if (3 != param0.field_a) {
              if (param0.field_a == 6) {
                var5.a(9, -1, ho.field_d);
              }
            } else {
              var5.a(7, -1, gd.field_d);
            }
          } else {
            if (param0.field_e) {
              this.c(new hc(this), -113);
              return;
            }
            var5.a(1707, (fn) (this), vi.field_J);
          }
          this.c(var5, -115);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_33_0 = var4_ref;
          stackIn_33_1 = new StringBuilder().append("dm.OB(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(boolean param0, boolean param1, int param2) {
        if (!param0) {
          t.d();
          if (param2 != 0) {
            dm.a(true, false, -123);
            rj.a(param2 ^ 91, param0);
            return;
          }
          rj.a(param2 ^ 91, param0);
          return;
        }
        t.a(0, 0, t.field_j, t.field_d, 0, 192);
        if (param2 != 0) {
          dm.a(true, false, -123);
          rj.a(param2 ^ 91, param0);
          return;
        }
        rj.a(param2 ^ 91, param0);
    }

    public final void a(qm param0, int param1, int param2, int param3, int param4) {
        if (this.field_yb) {
          rd.a(false, -17130, true);
          return;
        }
        th.a(param2 ^ 8180);
        if (param2 != 11) {
          return;
        }
        try {
          this.p(-119);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "dm.Q(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void h(byte param0) {
        if (param0 <= -96) {
          this.a(pa.a(248, ao.field_b, (byte) -121), -127, true);
          return;
        }
        dm.a(true, false, -97);
        this.a(pa.a(248, ao.field_b, (byte) -121), -127, true);
    }

    static {
        int var1 = 0;
        int var2 = 0;
        int var0;
        field_zb = new int[256];
        for (var1 = 0; 256 > var1; var1++) {
          var0 = var1;
          for (var2 = 0; var2 < 8; var2++) {
            if ((1 & var0) == 1) {
              var0 = -306674912 ^ var0 >>> 1;
            } else {
              var0 = var0 >>> 1;
            }
          }
          field_zb[var1] = var0;
        }
        field_Cb = 300;
    }
}
