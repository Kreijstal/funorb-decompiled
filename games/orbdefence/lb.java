/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb {
    static String field_a;
    private int field_h;
    static int field_g;
    private int field_e;
    int field_i;
    int field_f;
    int field_j;
    int field_d;
    private int field_b;
    int field_c;

    final static void a(boolean param0) {
        if (!(mg.field_k != null)) {
            return;
        }
        hl.a(mg.field_k, 125);
        mg.field_k.a(wc.field_c, -128);
        mg.field_k = null;
        if (!param0) {
            return;
        }
        if (!(ne.field_b == null)) {
            ne.field_b.c((byte) -113);
        }
        tf.field_f.requestFocus();
    }

    final void a(byte param0, int param1) {
        if (param0 != -6) {
            field_g = -15;
        }
        this.field_e = this.field_e + param1;
        this.field_b = this.field_b - param1;
    }

    public static void a(byte param0) {
        if (param0 != -98) {
            return;
        }
        field_a = null;
    }

    final static void c(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        se var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        ha var11 = null;
        se var12 = null;
        int[] var13 = null;
        dc var14 = null;
        dc var15 = null;
        int[] var16 = null;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var12 = cd.field_t;
              var2 = var12.b((byte) 90);
              if (var2 != 0) {
                if (-2 == (var2 ^ -1)) {
                  var11 = (ha) ((Object) oa.field_d.b((byte) 122));
                  if (var11 != null) {
                    var11.b(57);
                    break L1;
                  } else {
                    th.a(103);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  if (var2 != 2) {
                    pe.a((byte) -13, (Throwable) null, "A1: " + sj.b(true));
                    th.a(107);
                    break L1;
                  } else {
                    var15 = (dc) ((Object) mj.field_m.b((byte) 118));
                    if (var15 != null) {
                      var15.field_f = qh.b(8);
                      var15.field_g = true;
                      var15.field_i = var15.field_f[0];
                      var15.b(57);
                      break L1;
                    } else {
                      th.a(121);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
              } else {
                var10 = qh.b(8);
                var16 = var10;
                var13 = var16;
                var3 = var13;
                var9 = var10;
                var4 = var9;
                var5 = var12;
                var6 = ((mg) ((Object) var5)).b((byte) 90);
                var7 = 0;
                L2: while (true) {
                  if (var7 >= var6) {
                    var14 = (dc) ((Object) mj.field_m.b((byte) 117));
                    if (var14 != null) {
                      var14.field_i = var16[0];
                      var14.field_g = true;
                      var14.field_f = var3;
                      var14.b(57);
                      break L1;
                    } else {
                      th.a(124);
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    var9[var7] = ((mg) ((Object) var5)).l(0);
                    var7++;
                    continue L2;
                  }
                }
              }
            }
            L3: {
              if (param0 > 108) {
                break L3;
              } else {
                lb.a(false);
                break L3;
              }
            }
            decompiledRegionSelector0 = 3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1), "lb.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final int b(boolean param0) {
        if (!param0) {
            this.field_h = 100;
        }
        return this.field_e;
    }

    final void a(int param0) {
        if (this.field_h > param0) {
            this.field_h = this.field_h - 1;
        }
    }

    final boolean b(int param0) {
        if (param0 >= -18) {
            field_a = (String) null;
        }
        return this.field_e == (16777215 ^ this.field_b) ? true : false;
    }

    final void c(boolean param0) {
        if (param0) {
            return;
        }
        this.field_e = 0;
        this.field_b = 16777215;
    }

    final static void a(boolean param0, int param1) {
        if (!param0) {
            field_a = (String) null;
        }
        hg.field_Z = param1 >> 2081019780 & 3;
        bd.field_p = (14 & param1) >> 158315010;
        if ((hg.field_Z ^ -1) < -3) {
            hg.field_Z = 2;
        }
        wf.field_a = 3 & param1;
        if (bd.field_p > 2) {
            bd.field_p = 2;
        }
        if (wf.field_a > 2) {
            wf.field_a = 2;
        }
    }

    final void b(byte param0) {
        int var2 = -58 / ((20 - param0) / 55);
    }

    lb(f param0, int param1) {
        try {
            this.field_d = 0;
            this.field_i = param1;
            this.c(false);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "lb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_a = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
