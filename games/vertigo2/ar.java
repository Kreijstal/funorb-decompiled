/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ar {
    private int field_i;
    private int field_j;
    private io field_s;
    private int field_e;
    private int field_o;
    private int field_n;
    static boolean field_t;
    private int field_q;
    private int field_h;
    static String field_a;
    private float field_k;
    private int field_g;
    private int field_u;
    private int field_f;
    private boolean field_b;
    static kq field_c;
    private int field_d;
    private int field_m;
    private int field_p;
    private int field_l;
    private int field_r;

    final void a(int param0) {
        int fieldTemp$0 = 0;
        if (dc.field_L != null) {
          return;
        }
        if (q.field_y <= 0) {
          this.field_b = false;
        }
        if (this.field_b) {
          fieldTemp$0 = this.field_m - 1;
          this.field_m = this.field_m - 1;
          if (fieldTemp$0 > 0) {
            return;
          }
          this.field_m = this.field_d;
          if (param0 != 16671) {
            return;
          }
          if (ci.field_a < this.field_e) {
            this.field_b = false;
          } else {
            this.a((byte) -128);
          }
          return;
        }
        if (this.field_r > op.field_c) {
          bk.field_f = (-op.field_c + this.field_r) / 2;
        } else {
          if (0 < this.field_r) {
            bk.field_f = 0;
          }
        }
        if (op.field_c == this.field_j &&
          gh.field_a == this.field_u) {
          return;
        }
        this.field_s.a(param0 - 14471, this.field_j, this.field_u);
    }

    final static void a(int param0, int param1) {
        int var4 = 0;
        mi var2 = uh.field_Wb;
        int var4Lifetime1;
        var2.j(param1, 126);
        var2.field_u = var2.field_u + 1;
        int var3 = var2.field_u;
        var2.f(5, -105);
        if (param0 == 953354214) {
          var2.f(gd.field_j.field_uc, -116);
          var4 = (gd.field_j.field_xc << 6) + gd.field_j.field_Ub;
          var2.f(var4, -109);
          var2.a(0, -10140, gd.field_j.field_fc, gd.field_j.field_fc.length);
          var2.b((byte) 6, -var3 + var2.field_u);
          return;
        }
        ar.a(-18, (byte) -22, -75, 35, 98);
        var2.f(gd.field_j.field_uc, -116);
        var4Lifetime1 = (gd.field_j.field_xc << 6) + gd.field_j.field_Ub;
        var2.f(var4Lifetime1, -109);
        var2.a(0, -10140, gd.field_j.field_fc, gd.field_j.field_fc.length);
        var2.b((byte) 6, -var3 + var2.field_u);
    }

    final static java.net.URL a(java.applet.Applet param0, java.net.URL param1, int param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_2_0 = null;
        java.net.URL stackIn_11_0 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 0) {
            stackIn_2_0 = (java.net.URL) null;
            return stackIn_2_0;
          }
          var3 = null;
          var4 = null;
          if (null != v.field_b &&
            !v.field_b.equals(param0.getParameter("settings"))) {
            var3 = v.field_b;
            var4 = var3;
            var4 = var3;
          }
          if (null != sm.field_Ib &&
            !sm.field_Ib.equals(param0.getParameter("session"))) {
            var4 = sm.field_Ib;
          }
          stackIn_11_0 = vj.a(-1, (String) (var4), -116, (String) (var3), param1);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("ar.E(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw wn.a((Throwable) (stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void c(int param0) {
        field_c = null;
        if (param0 != 0) {
          return;
        }
        field_a = null;
    }

    final void b(byte param0) {
        this.field_s.a(2200, this.field_h, this.field_i);
        if (param0 != 118) {
          ar.a(-117, (byte) 38, 100, 115, 15);
        }
    }

    final qi c(byte param0) {
        qi var2 = null;
        qi var2Lifetime1;
        this.field_i = gh.field_a;
        this.field_h = op.field_c;
        this.field_s.a(param0 ^ 2283, this.field_g, this.field_o);
        oh.field_F = false;
        if (param0 != 115) {
          this.field_k = -0.6264674663543701f;
          var2 = id.a(0, 0, (byte) 94, this.field_g, gi.field_s, this.field_o);
          if (var2 == null) {
            this.b((byte) 118);
            return var2;
          }
          return var2;
        }
        var2Lifetime1 = id.a(0, 0, (byte) 94, this.field_g, gi.field_s, this.field_o);
        if (var2Lifetime1 != null) {
          return var2Lifetime1;
        }
        this.b((byte) 118);
        return var2Lifetime1;
    }

    final void a(int param0, int param1, int param2) {
        this.field_n = param1;
        this.field_r = param2;
        if (param0 != 5) {
          field_c = (kq) null;
        }
    }

    private final void a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var5Lifetime1;
        var6 = Vertigo2.field_L ? 1 : 0;
        var2 = this.field_r;
        var4 = 44 / ((param0 + 74) / 50);
        var3 = this.field_n;
        if (!this.a(false)) {
          this.field_b = false;
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (var3 > this.field_p) {
          var3 = this.field_p;
        } else {
          if (var3 < this.field_f) {
            var3 = this.field_f;
            if (var2 > this.field_l) {
              var2 = this.field_l;
              if (this.field_k > 0.0f) {
                var5 = (int)(this.field_k * (float)var3 + 0.5f);
                if (var5 <= var2) {
                  if (var2 > var5) {
                    var2 = var5;
                  }
                } else {
                  var3 = (int)((float)var2 / this.field_k);
                }
              }
            } else {
              if (var2 < this.field_q) {
                var2 = this.field_q;
              }
              if (this.field_k > 0.0f) {
                var5 = (int)(this.field_k * (float)var3 + 0.5f);
                if (var5 <= var2) {
                  if (var2 > var5) {
                    var2 = var5;
                  }
                  if (op.field_c != var2) {
                    this.field_s.a(2200, var2, var3);
                  } else {
                    if (var3 != gh.field_a) {
                      this.field_s.a(2200, var2, var3);
                    }
                  }
                  if (this.field_r <= 0) {
                    return;
                  }
                  bk.field_f = (-op.field_c + this.field_r) / 2;
                  return;
                }
                var3 = (int)((float)var2 / this.field_k);
              }
            }
            decompiledFrameRemainder0 = false;
          }
        }
        if (decompiledFrameRemainder0) {
          if (var2 > this.field_l) {
            var2 = this.field_l;
          } else {
            if (var2 < this.field_q) {
              var2 = this.field_q;
            }
          }
          if (this.field_k > 0.0f) {
            var5Lifetime1 = (int)(this.field_k * (float)var3 + 0.5f);
            if (var5Lifetime1 <= var2) {
              if (var2 > var5Lifetime1) {
                var2 = var5Lifetime1;
              }
            } else {
              var3 = (int)((float)var2 / this.field_k);
            }
          }
        }
        if (op.field_c != var2) {
          this.field_s.a(2200, var2, var3);
        } else {
          if (var3 != gh.field_a) {
            this.field_s.a(2200, var2, var3);
          }
        }
        if (this.field_r <= 0) {
          return;
        }
        bk.field_f = (-op.field_c + this.field_r) / 2;
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4) {
        int var5 = -101 % ((-38 - param1) / 53);
        kd.field_z = param0;
        re.field_g = param3;
        gd.field_k = param2;
        gj.field_y = param4;
    }

    final boolean a(boolean param0) {
        if (param0) {
          this.a(41);
          if (this.field_e > ci.field_a) {
            return false;
          }
          if (q.field_y > 0) {
            return true;
          }
          return false;
        }
        if (this.field_e > ci.field_a) {
          return false;
        }
        if (q.field_y > 0) {
          return true;
        }
        return false;
    }

    private ar() throws Throwable {
        throw new Error();
    }

    final static ch b(int param0) {
        if (un.field_Hb == l.field_a) {
          throw new IllegalStateException();
        }
        if (param0 != 0) {
          ar.a(117, (byte) 91, 7, 99, -65);
          if (un.field_Hb == oe.field_qb) {
            un.field_Hb = l.field_a;
            return mp.field_f;
          }
          return null;
        }
        if (un.field_Hb == oe.field_qb) {
          un.field_Hb = l.field_a;
          return mp.field_f;
        }
        return null;
    }

    static {
        field_a = "Unlock in Standard Game";
        field_t = false;
    }
}
