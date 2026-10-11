/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi {
    private int field_t;
    static int field_c;
    private int field_j;
    static String field_q;
    static String field_b;
    private int field_k;
    private int field_g;
    private int field_s;
    private boolean field_n;
    private int field_u;
    private int field_a;
    private float field_d;
    private int field_f;
    private int field_m;
    private int field_r;
    private int field_l;
    private int field_i;
    private bb field_e;
    private int field_o;
    private int field_p;
    private int field_h;

    final void a(int param0, byte param1, int param2) {
        this.field_u = param2;
        this.field_h = param0;
        if (param1 <= 26) {
          this.d((byte) 84);
        }
    }

    final static String c(int param0) {
        int var1 = -102 % ((-82 - param0) / 41);
        if (oe.field_Q == wh.field_fb) {
          return kc.field_n;
        }
        return hm.field_gb;
    }

    final static void a(int param0, int param1) {
        rk var2 = null;
        int var3 = 0;
        sf var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = Confined.field_J ? 1 : 0;
        try {
          if (param1 >= -39) {
            wi.a(41, 111);
          }
          var4 = (sf) (sm.field_y.a(-128));
          while (var4 != null) {
            nh.a(var4, 0, param0);
            var4 = (sf) (sm.field_y.d(2123));
          }
          var2 = ra.field_d.a(107);
          while (var2 != null) {
            fm.a(-87, param0);
            var2 = ra.field_d.d(2123);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2_ref), "wi.H(" + param0 + ',' + param1 + ')');
        }
    }

    public static void b(byte param0) {
        field_b = null;
        field_q = null;
        if (param0 != 12) {
          field_b = (String) null;
        }
    }

    final void d(byte param0) {
        int fieldTemp$0 = 0;
        if (dn.field_d != null) {
          return;
        }
        if (sg.field_x <= 0) {
          this.field_n = false;
        }
        if (this.field_n) {
          fieldTemp$0 = this.field_l - 1;
          this.field_l = this.field_l - 1;
          if (fieldTemp$0 > 0) {
            return;
          }
          this.field_l = this.field_i;
          if (pi.field_H < this.field_m) {
            this.field_n = false;
          } else {
            this.c((byte) -128);
            if (param0 != -44) {
              this.field_p = 19;
            }
          }
          return;
        }
        if (this.field_h <= wm.field_ab) {
          if (this.field_h > 0) {
            ei.field_kb = 0;
          }
        } else {
          ei.field_kb = (-wm.field_ab + this.field_h) / 2;
        }
        if (wm.field_ab == this.field_t &&
          im.field_b == this.field_r) {
          return;
        }
        this.field_e.a(this.field_t, this.field_r, 1099);
    }

    final boolean b(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 >= -112) {
          field_q = (String) null;
        }
        stackIn_6_0 = (this.field_m <= pi.field_H) && (0 < sg.field_x);
        return stackIn_6_0;
    }

    final static boolean a(boolean param0) {
        int var2 = 0;
        dg var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        dg var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Confined.field_J ? 1 : 0;
        try {
          var4 = (dg) (af.field_cb.a(-115));
          var1 = var4;
          if (var1 == null) {
            return false;
          }
          for (var2 = 0; var2 < var1.field_r; var2++) {
            if (var4.field_m[var2] != null &&
              var4.field_m[var2].field_g == 0) {
              return false;
            }
            if (var4.field_q[var2] != null &&
              var4.field_q[var2].field_g == 0) {
              return false;
            }
          }
          if (!param0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1_ref), "wi.F(" + param0 + ')');
        }
    }

    final gj a(int param0) {
        this.field_o = wm.field_ab;
        this.field_p = im.field_b;
        this.field_e.a(this.field_a, this.field_k, param0 ^ 21837);
        ac.field_a = false;
        if (param0 != 20742) {
          this.field_a = 67;
        }
        gj var2 = id.a(2401, ki.field_d, this.field_a, 0, 0, this.field_k);
        if (var2 == null) {
          this.a((byte) -105);
        }
        return var2;
    }

    final void a(byte param0) {
        this.field_e.a(this.field_o, this.field_p, 1099);
        if (param0 > -82) {
          field_c = 71;
        }
    }

    private final void c(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = Confined.field_J ? 1 : 0;
        var2 = this.field_h;
        var3 = this.field_u;
        if (param0 > -115) {
          wi.a(true);
        }
        if (!this.b(-116)) {
          this.field_n = false;
        } else {
          if (this.field_g >= var2) {
            if (var2 < this.field_s) {
              var2 = this.field_s;
            }
          } else {
            var2 = this.field_g;
          }
          if (this.field_f < var3) {
            var3 = this.field_f;
          } else {
            if (this.field_j > var3) {
              var3 = this.field_j;
            }
          }
          if (this.field_d > 0.0f) {
            var4 = (int)((float)var3 * this.field_d + 0.5f);
            if (var2 < var4) {
              var3 = (int)((float)var2 / this.field_d);
            } else {
              if (var4 < var2) {
                var2 = var4;
              }
            }
          }
          if (var2 != wm.field_ab) {
            this.field_e.a(var2, var3, 1099);
          } else {
            if (im.field_b != var3) {
              this.field_e.a(var2, var3, 1099);
            }
          }
          if (this.field_h > 0) {
            ei.field_kb = (-wm.field_ab + this.field_h) / 2;
          }
        }
    }

    private wi() throws Throwable {
        throw new Error();
    }

    static {
        field_q = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_b = "Lightning cannon";
    }
}
