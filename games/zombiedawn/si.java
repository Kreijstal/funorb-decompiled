/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si extends qk {
    static vn[] field_Ub;
    private int field_Pb;
    static int field_Rb;
    private int field_Nb;
    private int field_Sb;
    static int[] field_Qb;
    private int field_Tb;
    private int field_Vb;
    private kd field_Ob;

    final static void x(int param0) {
        tf.field_c.field_h = 0;
        tf.field_c.field_e = param0;
    }

    final void g(int param0) {
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        int fieldTemp$13 = 0;
        int fieldTemp$10 = 0;
        int fieldTemp$9 = 0;
        int fieldTemp$12 = 0;
        int fieldTemp$11 = 0;
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3;
        var3 = ZombieDawn.field_J;
        super.g(109);
        if (this.field_Ab <= 0) {
          return;
        }
        if (param0 >= 95) {
          if (this.field_F == 0) {
            if (this.field_Ob != null) {
              this.o((byte) 71);
              return;
            }
            fieldTemp$7 = this.field_Pb;
            this.field_Pb = this.field_Pb + 1;
            if (5 > fieldTemp$7) {
              return;
            }
            this.z(124);
            this.field_Pb = 0;
            return;
          }
          if (this.field_F != 1) {
            if (this.field_F != 10) {
              return;
            }
            this.field_N = this.field_N + 3;
            return;
          }
          fieldTemp$8 = this.field_Pb;
          this.field_Pb = this.field_Pb + 1;
          if (fieldTemp$8 < 5) {
            fieldTemp$13 = this.field_Tb;
            this.field_Tb = this.field_Tb + 1;
            if (fieldTemp$13 < 4) {
              return;
            }
            this.l((byte) 52);
            this.field_Tb = 0;
            return;
          }
          this.o((byte) 71);
          this.field_Pb = 0;
          if (this.field_U == null) {
            if (0L != tp.field_p % 3L) {
              fieldTemp$10 = this.field_Tb;
              this.field_Tb = this.field_Tb + 1;
              if (fieldTemp$10 < 4) {
                return;
              }
              this.l((byte) 52);
              this.field_Tb = 0;
              return;
            }
            this.field_U = dc.a((byte) 18, 85);
            fieldTemp$9 = this.field_Tb;
            this.field_Tb = this.field_Tb + 1;
            if (fieldTemp$9 < 4) {
              return;
            }
            this.l((byte) 52);
            this.field_Tb = 0;
            return;
          }
          if (!this.field_U.l()) {
            fieldTemp$12 = this.field_Tb;
            this.field_Tb = this.field_Tb + 1;
            if (fieldTemp$12 < 4) {
              return;
            }
            this.l((byte) 52);
            this.field_Tb = 0;
            return;
          }
          if (0L == tp.field_p % 3L) {
            this.field_U = dc.a((byte) 18, 85);
          }
          fieldTemp$11 = this.field_Tb;
          this.field_Tb = this.field_Tb + 1;
          if (fieldTemp$11 < 4) {
            return;
          }
          this.l((byte) 52);
          this.field_Tb = 0;
          return;
        }
        field_Rb = 94;
        if (this.field_F == 0) {
          if (this.field_Ob != null) {
            this.o((byte) 71);
            return;
          }
          fieldTemp$0 = this.field_Pb;
          this.field_Pb = this.field_Pb + 1;
          if (5 > fieldTemp$0) {
            return;
          }
          this.z(124);
          this.field_Pb = 0;
          return;
        }
        if (this.field_F != 1) {
          if (this.field_F != 10) {
            return;
          }
          this.field_N = this.field_N + 3;
          return;
        }
        fieldTemp$1 = this.field_Pb;
        this.field_Pb = this.field_Pb + 1;
        if (fieldTemp$1 < 5) {
          fieldTemp$6 = this.field_Tb;
          this.field_Tb = this.field_Tb + 1;
          if (fieldTemp$6 < 4) {
            return;
          }
          this.l((byte) 52);
          this.field_Tb = 0;
          return;
        }
        this.o((byte) 71);
        this.field_Pb = 0;
        if (this.field_U == null) {
          if (0L != tp.field_p % 3L) {
            fieldTemp$4 = this.field_Tb;
            this.field_Tb = this.field_Tb + 1;
            if (fieldTemp$4 < 4) {
              return;
            }
            this.l((byte) 52);
            this.field_Tb = 0;
            return;
          }
          this.field_U = dc.a((byte) 18, 85);
          fieldTemp$5 = this.field_Tb;
          this.field_Tb = this.field_Tb + 1;
          if (fieldTemp$5 < 4) {
            return;
          }
          this.l((byte) 52);
          this.field_Tb = 0;
          return;
        }
        if (this.field_U.l() &&
          0L == tp.field_p % 3L) {
          this.field_U = dc.a((byte) 18, 85);
          fieldTemp$2 = this.field_Tb;
          this.field_Tb = this.field_Tb + 1;
          if (fieldTemp$2 < 4) {
            return;
          }
          this.l((byte) 52);
          this.field_Tb = 0;
          return;
        }
        fieldTemp$3 = this.field_Tb;
        this.field_Tb = this.field_Tb + 1;
        if (fieldTemp$3 < 4) {
          return;
        }
        this.l((byte) 52);
        this.field_Tb = 0;
        return;
    }

    private final void z(int param0) {
        Object var2;
        Object var3;
        int var4;
        int var5;
        Object var6;
        kd var6_ref;
        int var8;
        dj var9;
        qh var10;
        qh var11;
        qh var18;
        var6 = null;
        var8 = ZombieDawn.field_J;
        this.a(true);
        this.f(237239984);
        if (null != this.field_yb) {
          this.field_yb.a(true);
          this.field_yb.f(237239984);
          this.field_yb = null;
        }
        if (this.field_Ob != null) {
          this.y(126);
          var2 = null;
          if (param0 < 113) {
            var9 = (dj) null;
            si.a(50, 105, (dj) null, -55);
          }
          var3 = null;
          var4 = -1;
          var5 = -1;
          var6_ref = (kd) (this.a((byte) -74, this.field_Sb, 2));
          while (var6_ref != null) {
            if (var6_ref.x(33)) {
              var10 = dj.field_e.field_H.a(true, this.a(true), var6_ref.f(237239984), var6_ref.a(true), this.f(237239984));
              if (var10 != null) {
                if (!(var10.field_g <= var4) ||
                  var4 == -1) {
                  var4 = var10.field_g;
                  var2 = var6_ref;
                }
                if (0 != var6_ref.field_Bb) {
                  var6_ref = (kd) (this.e((byte) 32));
                  continue;
                }
                if (!(var10.field_g <= var5) ||
                  var5 == -1) {
                  var3 = var6_ref;
                  var5 = var10.field_g;
                }
              }
            }
            var6_ref = (kd) (this.e((byte) 32));
          }
          if (var3 != null) {
            this.a(-123, (kd) (var3));
          } else {
            if (var2 != null) {
              this.a(-48, (kd) (var2));
            } else {
              this.y(124);
            }
          }
        } else {
          var2 = null;
          if (param0 >= 113) {
            var3 = null;
            var4 = -1;
            var5 = -1;
            var6_ref = (kd) (this.a((byte) -74, this.field_Sb, 2));
            while (var6_ref != null) {
              if (var6_ref.x(33)) {
                var11 = dj.field_e.field_H.a(true, this.a(true), var6_ref.f(237239984), var6_ref.a(true), this.f(237239984));
                if (var11 != null) {
                  if (!(var11.field_g <= var4) ||
                    var4 == -1) {
                    var4 = var11.field_g;
                    var2 = var6_ref;
                  }
                  if (0 != var6_ref.field_Bb) {
                    var6_ref = (kd) (this.e((byte) 32));
                    continue;
                  }
                  if (!(var11.field_g <= var5) ||
                    var5 == -1) {
                    var3 = var6_ref;
                    var5 = var11.field_g;
                  }
                }
              }
              var6_ref = (kd) (this.e((byte) 32));
            }
            if (var3 != null) {
              this.a(-123, (kd) (var3));
            } else {
              if (var2 == null) {
                this.y(124);
              } else {
                this.a(-48, (kd) (var2));
              }
            }
          } else {
            var9 = (dj) null;
            si.a(50, 105, (dj) null, -55);
            var3 = null;
            var4 = -1;
            var5 = -1;
            var6_ref = (kd) (this.a((byte) -74, this.field_Sb, 2));
            while (var6_ref != null) {
              if (var6_ref.x(33)) {
                var18 = dj.field_e.field_H.a(true, this.a(true), var6_ref.f(237239984), var6_ref.a(true), this.f(237239984));
                if (var18 != null) {
                  if (!(var18.field_g <= var4) ||
                    var4 == -1) {
                    var4 = var18.field_g;
                    var2 = var6_ref;
                  }
                  if (0 != var6_ref.field_Bb) {
                    var6_ref = (kd) (this.e((byte) 32));
                    continue;
                  }
                  if (!(var18.field_g <= var5) ||
                    var5 == -1) {
                    var3 = var6_ref;
                    var5 = var18.field_g;
                  }
                }
              }
              var6_ref = (kd) (this.e((byte) 32));
            }
            if (var3 != null) {
              this.a(-123, (kd) (var3));
            } else {
              if (var2 != null) {
                this.a(-48, (kd) (var2));
              } else {
                this.y(124);
              }
            }
          }
        }
        if (null != this.field_Ob) {
          this.o((byte) 71);
        }
    }

    private final void a(int param0, kd param1) {
        int var3_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.field_Ob = param1;
          param1.field_Bb = param1.field_Bb + 1;
          var3_int = -77 / ((70 - param0) / 46);
          if (null != this.field_U &&
            !this.field_U.l()) {
            return;
          }
          this.field_U = dc.a((byte) 18, 87);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("si.NA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void a(wk param0, int param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        try {
          var3_int = param0.a(this.a(true), (byte) -80);
          var4 = param0.a(this.f(param1 + 237234924), param1 ^ param1);
          bi.d(var3_int, var4, this.field_Sb, 255);
          bi.d(var3_int, var4, this.field_pb, 65535);
          if (null != this.field_Ob) {
            bi.e(var3_int, var4, param0.a(this.field_Ob.a(true), (byte) -106), param0.a(this.field_Ob.f(237239984), 0), 16711680);
          }
          if (null != this.field_yb) {
            var5 = param0.a(this.field_yb.a(true), (byte) -78);
            var6 = param0.a(this.field_yb.f(param1 + 237234924), 0);
            bi.e(var3_int, -48 + var4 + 10, var5, var6 - 38, 16776960);
            bj.field_q.c(Integer.toString(this.field_F), var3_int, var4 - 48, 16777215, 0);
            bj.field_q.c(Integer.toString(this.field_yb.field_F), var5, var6 - 48, 16777215, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("si.L(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static vn a(int param0, int param1, dj param2, int param3) {
        RuntimeException var4 = null;
        dj var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 48) {
            var5 = (dj) null;
            si.a(-109, -74, (dj) null, 70);
          }
          if (ph.a(param1, param3 + 30995, param0, param2)) {
            return fg.d(-127);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("si.TB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    final void o(int param0) {
        this.y(param0 ^ -6269);
        super.o(param0 ^ 0);
        if (param0 != -6253) {
          this.o(114);
        }
    }

    private final void y(int param0) {
        if (this.field_Ob != null) {
          this.field_Ob.field_Bb = this.field_Ob.field_Bb - 1;
        }
        if (param0 > 3) {
          this.field_Ob = null;
          return;
        }
        this.field_Sb = 0;
        this.field_Ob = null;
    }

    private final void o(byte param0) {
        if (this.field_Ob != null) {
          this.a(this.field_Ob.a(true), (byte) 121, this.field_Ob.f(237239984));
          this.c(0, this.field_D / 2);
          if (param0 != 71) {
            this.o(28);
          }
          return;
        }
    }

    si(int param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_Pb = 0;
        this.field_pb = 360;
        this.field_Sb = 400;
        this.field_Vb = 360;
        this.field_Nb = this.field_Vb / 4;
    }

    final void l(byte param0) {
        int var3;
        var3 = ZombieDawn.field_J;
        if (this.field_Ab < 0) {
          super.l((byte) 52);
          return;
        }
        if (!this.a(param0 ^ -9, this.field_Vb, false)) {
          if (null == this.field_Ob) {
            this.z(param0 ^ 76);
          } else {
            if (this.field_Ob.field_F == 9) {
              this.z(param0 ^ 76);
            }
          }
          if (null == this.field_Ob &&
            this.field_F != 0) {
            this.e(0, param0 - 6956);
          }
        } else {
          if (!this.field_fb) {
            if (this.field_mb < this.field_Nb * this.field_Nb) {
              if (!this.p(5)) {
                this.m((byte) -94);
                this.y(100);
              } else {
                if (this.field_F == 3) {
                  this.e(0, -6904);
                  if (param0 != 52) {
                    field_Rb = -17;
                  }
                  return;
                }
              }
            } else {
              this.m((byte) -98);
              this.y(59);
            }
          } else {
            if (this.field_F != 3) {
              if (this.field_U == null) {
                this.field_U = dc.a((byte) 18, 86);
              } else {
                if (this.field_U.l()) {
                  this.field_U = dc.a((byte) 18, 86);
                }
              }
            }
            if (!this.p(-125)) {
              this.e(3, -6904);
            }
          }
        }
        if (param0 == 52) {
          return;
        }
        field_Rb = -17;
    }

    public static void w(int param0) {
        field_Qb = null;
        if (param0 != 255) {
          si.w(-44);
          field_Ub = null;
          return;
        }
        field_Ub = null;
    }

    static {
        field_Rb = 69;
        field_Qb = new int[16];
    }
}
