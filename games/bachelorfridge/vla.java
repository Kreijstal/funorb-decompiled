/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vla extends mv {
    private int field_q;
    static kka field_x;
    static byte[][][] field_o;
    static ee[] field_r;
    static long field_v;
    static String field_u;
    static String field_t;
    static boolean field_w;
    static boolean field_s;
    static String field_p;

    public static void f(byte param0) {
        field_r = null;
        field_t = null;
        field_p = null;
        field_o = (byte[][][]) null;
        if (param0 <= -82) {
          field_u = null;
          field_x = null;
          return;
        }
        vla.a(117, -79, -10, false);
        field_u = null;
        field_x = null;
    }

    final void e(int param0) {
        pp var2 = null;
        ad var3 = null;
        int var4 = BachelorFridge.field_y;
        if (param0 != ~this.field_k.field_p) {
          var2 = (pp) (this.field_k.field_o.b((byte) 90));
          while (var2 != null) {
            if (var2.field_h != null) {
              var3 = var2.field_h.a(-27449, this.field_l);
              if (var3.field_f.field_u.field_e) {
                var3.b(false);
              }
            }
            var2 = (pp) (this.field_k.field_o.c(0));
          }
          return;
        }
    }

    vla(gj param0, vja param1) {
        super(param0, param1);
        try {
          this.field_q = 64;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "vla.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean c(byte param0) {
        Object var6 = null;
        t var6_ref = (t) (al.a(-69, this.field_k.field_k));
        aga var3 = this.field_k.field_l.a(125, this.field_l.field_h);
        ad var4 = this.field_k.field_l.a(-27449, this.field_l);
        this.field_l.field_s.a((byte) -57, var3.field_J, var3.field_x);
        if (var3.i(91)) {
          return true;
        }
        int var5 = -90 % ((71 - param0) / 47);
        int fieldTemp$0 = this.field_q - 1;
        this.field_q = this.field_q - 1;
        if (0 <= fieldTemp$0) {
          if (this.field_q == 25) {
            this.d((byte) -86);
            mk.a(var6_ref.field_n, -114);
            if (15 != this.field_q) {
              if (this.field_q < 25) {
                this.e(-32);
              }
              if (this.field_q != 63) {
                return false;
              }
              if (this.field_k.d((byte) -90)) {
                return false;
              }
              var4.b(-1, var6_ref.field_o);
              return false;
            }
            if (!this.field_k.d((byte) -75)) {
              this.f(-76);
            }
            if (this.field_q < 25) {
              this.e(-32);
            }
            if (this.field_q != 63) {
              return false;
            }
            if (!this.field_k.d((byte) -90)) {
              var4.b(-1, var6_ref.field_o);
              return false;
            }
            return false;
          }
          if (15 == this.field_q) {
            if (this.field_k.d((byte) -75)) {
              if (this.field_q < 25) {
                this.e(-32);
              }
              if (this.field_q == 63 &&
                !this.field_k.d((byte) -90)) {
                var4.b(-1, var6_ref.field_o);
                return false;
              }
              return false;
            }
            this.f(-76);
          }
          if (this.field_q < 25) {
            this.e(-32);
          }
          if (this.field_q == 63 &&
            !this.field_k.d((byte) -90)) {
            var4.b(-1, var6_ref.field_o);
            return false;
          }
          return false;
        }
        this.d(88);
        return true;
    }

    final static int a(int param0, be param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -64) {
            stackIn_2_0 = -77;
            return stackIn_2_0;
          }
          if (param1 == null) {
            stackIn_6_0 = 0;
            return stackIn_6_0;
          }
          stackIn_8_0 = 50 * param1.field_i.length / pb.field_j;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("vla.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        int var4;
        int var5;
        int var4Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        if (param0 == 5) {
          if (!gm.field_k) {
            return;
          }
          fo.field_a.a(19842, param3);
          var4 = da.field_d.g(-16360) ? 1 : 0;
          if (lf.field_c != 0 &&
            var4 == 0) {
            lc.b(-1);
            param3 = false;
          }
          if (param3) {
            da.field_d.a(param2, 30091, param1);
          }
          if (var4 != 0) {
            fo.field_a.a(19842, param3);
          }
          var5 = da.field_d.b(false) + da.field_d.field_D;
          if (var5 > 640) {
            uga.field_x = uga.field_x + 5;
            return;
          }
          if (var5 < 635 &&
            uga.field_x > 0) {
            uga.field_x = uga.field_x - 5;
            return;
          }
          return;
        }
        vla.f((byte) -87);
        if (!gm.field_k) {
          return;
        }
        fo.field_a.a(19842, param3);
        var4Lifetime1 = da.field_d.g(-16360) ? 1 : 0;
        if (lf.field_c != 0 &&
          var4Lifetime1 == 0) {
          lc.b(-1);
          param3 = false;
        }
        if (!param3) {
          if (var4Lifetime1 != 0) {
            fo.field_a.a(19842, param3);
            var5Lifetime1 = da.field_d.b(false) + da.field_d.field_D;
            if (var5Lifetime1 > 640) {
              uga.field_x = uga.field_x + 5;
            } else {
              if (var5Lifetime1 < 635 &&
                uga.field_x > 0) {
                uga.field_x = uga.field_x - 5;
              }
            }
            return;
          }
        } else {
          da.field_d.a(param2, 30091, param1);
          if (var4Lifetime1 != 0) {
            fo.field_a.a(19842, param3);
          }
        }
        var5Lifetime2 = da.field_d.b(false) + da.field_d.field_D;
        if (var5Lifetime2 > 640) {
          uga.field_x = uga.field_x + 5;
          return;
        }
        if (var5Lifetime2 >= 635) {
          return;
        }
        if (uga.field_x <= 0) {
          return;
        }
        uga.field_x = uga.field_x - 5;
    }

    static {
        field_t = "Inviting <%0>";
        field_p = "<%0> turns remaining";
        field_u = "<col=0></col>£<%0>";
    }
}
