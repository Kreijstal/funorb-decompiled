/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vd extends oh {
    static pf field_j;
    static String field_n;
    static String field_r;
    int field_t;
    boolean field_s;
    Object field_h;
    int field_k;
    int field_m;
    int field_i;
    String field_o;
    pf field_l;
    boolean field_p;
    static qr field_q;

    final void d(int param0, int param1, int param2) {
        vd var6 = null;
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        vd var6Lifetime1;
        if (param1 != 0) {
          this.field_k = this.field_k + param1;
          this.field_t = this.field_t + param0;
          var6 = (vd) (this.field_l.d(param2));
          while (var6 != null) {
            var6.d(param0, param1, 0);
            var6 = (vd) (this.field_l.a((byte) -71));
          }
          return;
        }
        if (0 == param0) {
          return;
        }
        this.field_k = this.field_k + param1;
        this.field_t = this.field_t + param0;
        var6Lifetime1 = (vd) (this.field_l.d(param2));
        while (var6Lifetime1 != null) {
          var6Lifetime1.d(param0, param1, 0);
          var6Lifetime1 = (vd) (this.field_l.a((byte) -71));
        }
    }

    void e(int param0) {
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        vd var4 = (vd) (this.field_l.d(param0 ^ param0));
        while (var4 != null) {
          var4.b((byte) -69);
          var4 = (vd) (this.field_l.a((byte) -71));
        }
    }

    final boolean a(byte param0, vd param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        vd var6 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (this == param1) {
            return true;
          }
          var4 = -85 / ((-63 - param0) / 47);
          var6 = (vd) (this.field_l.d(0));
          while (var6 != null) {
            if (var6.a((byte) -125, param1)) {
              return true;
            }
            var6 = (vd) (this.field_l.a((byte) -71));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("vd.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final boolean c(int param0, int param1, int param2) {
        boolean stackIn_11_0 = false;
        boolean stackIn_18_0 = false;
        if (!this.field_p) {
          return false;
        }
        if (!this.field_s) {
          return false;
        }
        param0 = param0 - this.field_t;
        param1 = param1 - this.field_k;
        if (param2 == 0) {
          stackIn_11_0 = (0 <= param1) && (param0 >= 0) && (this.field_m > param1) && (param0 < this.field_i);
          return stackIn_11_0;
        }
        vd.d(-118);
        stackIn_18_0 = (0 <= param1) && (param0 >= 0) && (this.field_m > param1) && (param0 < this.field_i);
        return stackIn_18_0;
    }

    final static boolean a(int param0, bc param1, int param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = param1.a(param0, -1, param2);
          var4 = var5;
          if (var5 == null) {
            return false;
          }
          k.a(var5, (byte) 62);
          if (param3 == 2) {
            return true;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_11_0 = var4_ref;
          stackIn_11_1 = new StringBuilder().append("vd.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, int param1, byte param2) {
        if (null != re.field_d) {
          if (param1 <= re.field_d.length) {
            if (null == kf.field_f ||
              !(param1 <= kf.field_f.length)) {
              kf.field_f = new int[param1 * 2];
            }
            if (null == fb.field_zb ||
              !(param1 <= fb.field_zb.length)) {
              fb.field_zb = new int[param1 * 2];
            }
            if (null == aj.field_d ||
              !(param1 <= aj.field_d.length)) {
              aj.field_d = new int[2 * param1];
            }
            if (f.field_y == null ||
              !(param1 <= f.field_y.length)) {
              f.field_y = new int[2 * param1];
            }
            if (null == dc.field_c ||
              !(dc.field_c.length >= param1)) {
              dc.field_c = new int[param1 * 2];
            }
            if (lg.field_d == null ||
              !(param1 + param0 <= lg.field_d.length)) {
              lg.field_d = new int[2 * (param0 + param1)];
            }
            if (null == aq.field_p ||
              !(aq.field_p.length >= param1)) {
              aq.field_p = new boolean[2 * param1];
            }
          } else {
            re.field_d = new int[param1 * 2];
            if (null == kf.field_f ||
              !(param1 <= kf.field_f.length)) {
              kf.field_f = new int[param1 * 2];
            }
            if (null == fb.field_zb ||
              !(param1 <= fb.field_zb.length)) {
              fb.field_zb = new int[param1 * 2];
            }
            if (null == aj.field_d ||
              !(param1 <= aj.field_d.length)) {
              aj.field_d = new int[2 * param1];
            }
            if (f.field_y == null ||
              !(param1 <= f.field_y.length)) {
              f.field_y = new int[2 * param1];
            }
            if (null == dc.field_c ||
              !(dc.field_c.length >= param1)) {
              dc.field_c = new int[param1 * 2];
            }
            if (lg.field_d == null) {
              lg.field_d = new int[2 * (param0 + param1)];
              if (null == aq.field_p ||
                !(aq.field_p.length >= param1)) {
                aq.field_p = new boolean[2 * param1];
              }
            } else {
              if (param1 + param0 <= lg.field_d.length) {
                if (null == aq.field_p ||
                  !(aq.field_p.length >= param1)) {
                  aq.field_p = new boolean[2 * param1];
                }
              } else {
                lg.field_d = new int[2 * (param0 + param1)];
                if (null == aq.field_p ||
                  !(aq.field_p.length >= param1)) {
                  aq.field_p = new boolean[2 * param1];
                }
              }
            }
          }
        } else {
          re.field_d = new int[param1 * 2];
          if (null == kf.field_f) {
            kf.field_f = new int[param1 * 2];
            if (null == fb.field_zb ||
              !(param1 <= fb.field_zb.length)) {
              fb.field_zb = new int[param1 * 2];
            }
            if (null == aj.field_d ||
              !(param1 <= aj.field_d.length)) {
              aj.field_d = new int[2 * param1];
            }
            if (f.field_y == null ||
              !(param1 <= f.field_y.length)) {
              f.field_y = new int[2 * param1];
            }
            if (null == dc.field_c ||
              !(dc.field_c.length >= param1)) {
              dc.field_c = new int[param1 * 2];
            }
            if (lg.field_d == null ||
              !(param1 + param0 <= lg.field_d.length)) {
              lg.field_d = new int[2 * (param0 + param1)];
            }
            if (null == aq.field_p ||
              !(aq.field_p.length >= param1)) {
              aq.field_p = new boolean[2 * param1];
            }
          } else {
            if (param1 > kf.field_f.length) {
              kf.field_f = new int[param1 * 2];
              if (null == fb.field_zb ||
                !(param1 <= fb.field_zb.length)) {
                fb.field_zb = new int[param1 * 2];
              }
              if (null == aj.field_d ||
                !(param1 <= aj.field_d.length)) {
                aj.field_d = new int[2 * param1];
              }
              if (f.field_y == null ||
                !(param1 <= f.field_y.length)) {
                f.field_y = new int[2 * param1];
              }
              if (null == dc.field_c ||
                !(dc.field_c.length >= param1)) {
                dc.field_c = new int[param1 * 2];
              }
              if (lg.field_d == null ||
                !(param1 + param0 <= lg.field_d.length)) {
                lg.field_d = new int[2 * (param0 + param1)];
              }
              if (null == aq.field_p ||
                !(aq.field_p.length >= param1)) {
                aq.field_p = new boolean[2 * param1];
              }
            } else {
              if (null == fb.field_zb ||
                !(param1 <= fb.field_zb.length)) {
                fb.field_zb = new int[param1 * 2];
              }
              if (null == aj.field_d ||
                !(param1 <= aj.field_d.length)) {
                aj.field_d = new int[2 * param1];
              }
              if (f.field_y == null ||
                !(param1 <= f.field_y.length)) {
                f.field_y = new int[2 * param1];
              }
              if (null == dc.field_c ||
                !(dc.field_c.length >= param1)) {
                dc.field_c = new int[param1 * 2];
              }
              if (lg.field_d == null) {
                lg.field_d = new int[2 * (param0 + param1)];
                if (null == aq.field_p ||
                  !(aq.field_p.length >= param1)) {
                  aq.field_p = new boolean[2 * param1];
                }
              } else {
                if (param1 + param0 <= lg.field_d.length) {
                  if (null == aq.field_p ||
                    !(aq.field_p.length >= param1)) {
                    aq.field_p = new boolean[2 * param1];
                  }
                } else {
                  lg.field_d = new int[2 * (param0 + param1)];
                  if (null == aq.field_p ||
                    !(aq.field_p.length >= param1)) {
                    aq.field_p = new boolean[2 * param1];
                  }
                }
              }
            }
          }
        }
        wm.field_c = 0;
        if (param2 != 18) {
          vd.a((byte) 6);
        }
        ff.field_u = 2147483647;
        s.field_e = -2147483648;
        us.field_b = -2147483648;
        ef.field_a = 2147483647;
    }

    final void c(boolean param0) {
        vd var4 = null;
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        vd var4Lifetime1;
        if (param0) {
          this.a((byte) 48, 44, -59);
        } else {
          var4 = (vd) (this.field_l.d(0));
          while (var4 != null) {
            var4.c(false);
            var4 = (vd) (this.field_l.a((byte) -71));
          }
          this.e(0);
          return;
        }
        var4Lifetime1 = (vd) (this.field_l.d(0));
        while (var4Lifetime1 != null) {
          var4Lifetime1.c(false);
          var4Lifetime1 = (vd) (this.field_l.a((byte) -71));
        }
        this.e(0);
    }

    void a(vd param0, int param1) {
        try {
          this.field_l.a(param0, param1 ^ param1);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "vd.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void a(int param0, int param1, int param2) {
        if (param1 != 0) {
          this.field_l = (pf) null;
        }
    }

    public static void a(byte param0) {
        field_n = null;
        if (param0 <= -114) {
          field_q = null;
          field_j = null;
          field_r = null;
          return;
        }
        bc var2 = (bc) null;
        vd.a(40, (bc) null, 88, 85);
        field_q = null;
        field_j = null;
        field_r = null;
    }

    void a(boolean param0, int param1, int param2) {
        this.field_i = param1;
        if (param0) {
          this.field_m = param2;
          return;
        }
        this.b(55, 44, 18);
        this.field_m = param2;
    }

    final static void d(int param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        sl var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        bc var4 = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var1 = js.field_f;
          while (bk.a((byte) -50)) {
            var1.h(8, 255);
            fieldTemp$0 = var1.field_j + 1;
            var1.field_j = var1.field_j + 1;
            var2 = fieldTemp$0;
            hs.a(var1, (byte) -128);
            js.field_f.b(-var2 + var1.field_j, (byte) 118);
          }
          if (param0 != 2147483647) {
            var4 = (bc) null;
            vd.a(0, (bc) null, -70, 78);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1_ref), "vd.HA(" + param0 + ')');
        }
    }

    vd b(byte param0, int param1, int param2) {
        if (this.c(param1, param2, 0)) {
          return this;
        }
        if (param0 > 51) {
          return null;
        }
        this.field_k = -116;
        return null;
    }

    final void a(byte param0, int param1, int param2) {
        if (param1 != this.field_k) {
          this.d(param2 - this.field_t, -this.field_k + param1, 0);
          if (param0 < 37) {
            this.b((byte) -125, 17, -8);
          }
          return;
        }
        if (param2 == this.field_t) {
          return;
        }
        this.d(param2 - this.field_t, -this.field_k + param1, 0);
        if (param0 < 37) {
          this.b((byte) -125, 17, -8);
        }
    }

    void a(int param0) {
        int var2 = 27 / ((param0 - 67) / 47);
    }

    vd(int param0, int param1, int param2, int param3) {
        rs.field_Cb.c("200");
        this.field_k = param0;
        this.field_h = null;
        this.field_i = param3;
        this.field_t = param1;
        this.field_p = true;
        this.field_s = true;
        this.field_m = param2;
        this.field_l = new pf();
    }

    void b(int param0, int param1, int param2) {
        if (param2 != -498) {
          this.field_p = true;
        }
    }

    static {
        field_r = "This game option is only available to members.";
        field_n = "Colony homeworld";
    }
}
