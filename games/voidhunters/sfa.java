/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sfa {
    private int field_e;
    static llb field_d;
    private tj field_a;
    private ml field_c;
    private int field_b;

    final void b(byte param0) {
        int var2 = 51 / ((64 - param0) / 50);
        this.field_c = null;
        this.field_a = null;
    }

    final boolean a(byte param0) {
        int var2 = 113 % ((56 - param0) / 32);
        return null != this.field_c ? true : false;
    }

    final void a(int param0, ml param1, tj param2, byte param3, int param4) {
        try {
          this.field_e = param4;
          this.field_b = param0;
          this.field_c = param1;
          if (param3 != 61) {
            anb var7 = (anb) null;
            this.a((pe) null, -17, (anb) null, false);
          }
          this.field_a = param2;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "sfa.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          field_d = (llb) null;
        }
        field_d = null;
    }

    public sfa() {
        this.b((byte) 118);
    }

    final void a(pe param0, int param1, anb param2, boolean param3) {
        int stackIn_7_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6_int = 0;
        wfb var6 = null;
        int var7 = 0;
        int var8 = 0;
        wfb var9 = null;
        int var10 = 0;
        int var6_intLifetime1;
        int var8Lifetime1;
        var10 = VoidHunters.field_G;
        try {
          if (this.field_a.g((byte) -104) != 1) {
            stackIn_7_0 = (3 != this.field_a.g((byte) -104)) ? 1 : 0;
          } else {
            stackIn_7_0 = 0;
          }
          var5_int = stackIn_7_0;
          if (this.field_a.g((byte) -104) == 3) {
            this.field_a.a(this.field_b, this.field_e, 127);
          }
          if (2 == this.field_a.g((byte) -104) && (!(param2 instanceof sg) ||
            ((sg) (param2)).o((byte) -117) != this.field_a.b(false) ||
            ((sg) (param2)).q((byte) 115) != this.field_a.e(param1 + 513))) {
            var6_int = laa.field_o;
            param2.a(this.field_a.field_h * var6_int, this.field_e, this.field_b, (byte) -119, var6_int * this.field_a.field_f);
          }
          if (this.field_a.g((byte) -104) == 5) {
            var6_intLifetime1 = db.field_q;
            param2.a(this.field_a.field_h * var6_intLifetime1, this.field_e, this.field_b, (byte) -116, this.field_a.field_f * var6_intLifetime1);
          }
          if (this.field_a.g((byte) -104) == 6) {
            if (param3 ||
              cva.field_o == 1) {
              param0.a(0, gib.field_a, this.field_a.e(512), this.field_a.b(false), false, this.field_e, this.field_b);
            }
            param3 = false;
          }
          if (param3) {
            var6 = this.field_c.i((byte) -112);
            if (this.field_a.g((byte) -104) != 3) {
              if (this.field_a.g((byte) -104) == 1) {
                rmb.a(this.field_b, param2.c(false), 40, 106, this.field_e);
              } else {
                if (!var6.field_r) {
                  if (var6.field_B == 0) {
                    qba.a(20382, this.field_e, 60, this.field_b, 1);
                  } else {
                    qba.a(20382, this.field_e, 56, this.field_b, 1);
                  }
                } else {
                  qba.a(20382, this.field_e, 77, this.field_b, 1);
                }
              }
            } else {
              rmb.a(this.field_b, param2.c(false), 70, -48, this.field_e);
            }
            var7 = 5;
            var8 = this.field_a.g((byte) -104);
            if (var8 != 1) {
              if (var8 == 0) {
                var7 = ehb.field_e;
              } else {
                if (var8 != 2) {
                  if (var8 != 3) {
                    if (var8 != 4) {
                      if (5 == var8) {
                        var7 = fmb.field_r;
                      }
                    } else {
                      var7 = gaa.field_p;
                    }
                  } else {
                    var7 = pea.field_b;
                  }
                } else {
                  var7 = km.field_o;
                }
              }
            } else {
              var7 = mc.field_u;
            }
            var8Lifetime1 = this.field_c.a(this.field_a.c((byte) 68), (byte) 40);
            if (var8Lifetime1 > 0) {
              var5_int = 0;
              this.field_a.b(var8Lifetime1, 110);
            }
            param0.a(sva.field_m, this.field_b, this.field_e, ei.field_a, 11184895, var7, dw.field_b);
            var9 = var6;
            if (this.field_c.k((byte) 99) &&
              var9.field_y > 0) {
              param2.field_k.a(true, this.field_c, param0, 60, param2);
              param2.field_k.a((byte) 102, param2);
              param0.a(1, var9.field_y, this.field_a.e(param1 ^ -513), this.field_a.b(false), false, this.field_c.b(true), this.field_c.a((byte) 74));
            } else {
              if (bka.field_p == 1 &&
                this.field_c.k((byte) 71) &&
                this.field_c != param2.field_k) {
                this.field_c.a(true, false, var9.field_p);
                param2.field_k.a(true, this.field_c, param0, param1 ^ -39, param2);
                param2.field_k.a((byte) 97, param2);
              }
            }
          }
          if (var5_int != 0) {
            this.field_a.b(-3846);
          }
          if (param1 != -1) {
            this.field_a = (tj) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_72_0 = var5;
          stackIn_72_1 = new StringBuilder().append("sfa.B(");
          if (param0 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_75_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
    }
}
