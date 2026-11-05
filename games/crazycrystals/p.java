/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p extends uc {
    static nd field_i;
    static dl field_f;
    private int field_g;
    private jh field_e;
    static dl field_k;
    static String field_h;
    static int field_j;

    public static void b(int param0) {
        try {
          field_k = null;
          field_i = null;
          field_f = null;
          field_h = null;
          if (param0 != -1) {
            p.b(105);
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "p.E(" + param0 + ')');
        }
    }

    final void a(boolean param0) {
        boolean discarded$0 = false;
        if (!param0) {
          return;
        }
        try {
          this.field_e.a(157, gj.field_n, 26, (byte) 76, 325);
          discarded$0 = this.c((byte) 69);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "p.C(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, boolean param3) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        uj stackIn_34_0 = null;
        String stackIn_35_1 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = CrazyCrystals.field_B;
        try {
          stackIn_5_0 = (!param3) ? 12640511 : 16777215;
          var5_int = stackIn_5_0;
          var6 = 157;
          var7 = 168;
          if (param0 != -17) {
            return;
          }
          var8 = 26;
          il.a(var8, param3, param1, var6, var7, false);
          stackIn_11_0 = (param3) ? 1 : 0;
          var9 = stackIn_11_0;
          if (param2 != 0) {
            if (1 != param2) {
              if (param2 != 2) {
                if (param2 == 3) {
                  gj.field_m.b(cc.field_b, this.field_g, param1 + 17, var9, -1);
                  ak.a((byte) 61, this.field_g, param1, qd.field_r, var5_int);
                } else {
                  if (qh.field_k != param2) {
                    if (param2 == rk.field_g) {
                      var10 = gj.field_m.a(q.field_d);
                      var11 = gj.field_m.a(fk.field_t);
                      var12 = gj.field_m.a(vk.field_D);
                      if (var12 > var11) {
                        var11 = var12;
                      }
                      var13 = 240 + (var10 - var11) / 2;
                      gj.field_m.b(q.field_d, var13, 17 + param1, var9, -1);
                      stackIn_34_0 = gj.field_m;
                      if (jm.field_j) {
                        stackIn_35_1 = fk.field_t;
                      } else {
                        stackIn_35_1 = vk.field_D;
                      }
                      ((uj) (Object) stackIn_34_0).a(stackIn_35_1, var13, param1 + 17, var9, -1);
                    } else {
                      if (sj.field_c == param2) {
                        gj.field_m.c(nd.field_k, 240, 17 + param1, var9, -1);
                      }
                    }
                  } else {
                    gj.field_m.c(vl.field_e, 240, param1 + 17, var9, -1);
                  }
                }
              } else {
                gj.field_m.b(fa.field_m, this.field_g, param1 + 17, var9, -1);
                ak.a((byte) 61, this.field_g, param1, gi.field_m, var5_int);
              }
            } else {
              gj.field_m.c(jd.field_J, 240, 17 + param1, var9, -1);
            }
          } else {
            gj.field_m.c(nc.field_k, 240, 17 + param1, var9, -1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var5), "p.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final boolean c(byte param0) {
        boolean stackIn_87_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var2_intLifetime1;
        var3 = CrazyCrystals.field_B;
        try {
          if (param0 != 69) {
            return true;
          }
          if (this.field_e.field_c == 0 &&
            this.field_e.a(true)) {
            uh.field_p = null;
            return true;
          }
          if (this.field_e.field_c == 1 &&
            this.field_e.a(true)) {
            hc.a(true, false);
            uh.field_p = null;
            return true;
          }
          if (this.field_e.field_c == 2) {
            if (this.field_e.d(96) &&
              gi.field_m > 0) {
              gi.field_m = gi.field_m - 8;
              if (gi.field_m < 0) {
                gi.field_m = 0;
              }
              tb.field_d.a(fk.field_x[0], 100, 96 * gi.field_m, 8192);
            }
            if (this.field_e.b(125) &&
              gi.field_m < 64) {
              gi.field_m = gi.field_m + 8;
              if (64 < gi.field_m) {
                gi.field_m = 64;
              }
              tb.field_d.a(fk.field_x[0], 100, gi.field_m * 96, 8192);
            }
            if (this.field_e.b(true) &&
              gi.field_m > 0) {
              gi.field_m = 0;
              tb.field_d.a(fk.field_x[0], 100, 96 * gi.field_m, 8192);
            }
            if (this.field_e.e(-19741) &&
              gi.field_m < 64) {
              gi.field_m = 64;
              tb.field_d.a(fk.field_x[0], 100, 96 * gi.field_m, 8192);
            }
            if (this.field_e.g(param0 ^ -70)) {
              var2_int = -6 - this.field_g + qh.field_i;
              if (var2_int >= 0) {
                if (var2_int > 64) {
                  var2_int = 64;
                }
              } else {
                var2_int = 0;
              }
              if (this.field_e.a(true) ||
                var2_int != gi.field_m) {
                gi.field_m = var2_int;
                tb.field_d.a(fk.field_x[0], 100, 96 * gi.field_m, 8192);
              }
            } else {
              if (this.field_e.a(true)) {
                tb.field_d.a(fk.field_x[0], 100, 96 * gi.field_m, 8192);
              }
            }
          }
          if (3 == this.field_e.field_c) {
            if (this.field_e.d(96) &&
              qd.field_r > 0) {
              ia.a(-658435066, -8 + qd.field_r);
            }
            if (this.field_e.b(107) &&
              qd.field_r < 64) {
              ia.a(-658435066, 8 + qd.field_r);
            }
            if (this.field_e.b(true) &&
              0 < qd.field_r) {
              ia.a(-658435066, 0);
            }
            if (this.field_e.e(-19741) &&
              qd.field_r < 64) {
              ia.a(-658435066, 64);
            }
            if (this.field_e.g(-1)) {
              var2_intLifetime1 = qh.field_i + (-6 - this.field_g);
              if (var2_intLifetime1 >= 0) {
                if (var2_intLifetime1 > 64) {
                  var2_intLifetime1 = 64;
                }
              } else {
                var2_intLifetime1 = 0;
              }
              if (qd.field_r != var2_intLifetime1) {
                ia.a(-658435066, var2_intLifetime1);
              }
            }
          }
          if (qh.field_k == this.field_e.field_c &&
            this.field_e.a(true)) {
            qc.a(this.field_e.field_i, 0);
            this.field_e.a(param0 ^ -70, true, -1);
            return true;
          }
          if (rk.field_g == this.field_e.field_c &&
            this.field_e.a(true)) {
            stackIn_87_0 = !(jm.field_j);
            jm.field_j = stackIn_87_0;
          }
          if (sj.field_c != this.field_e.field_c) {
            return false;
          }
          if (!this.field_e.a(true)) {
            return false;
          }
          uh.field_n = true;
          uh.field_p = null;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var2), "p.B(" + param0 + ')');
        }
    }

    final boolean b(byte param0) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 29) {
            return true;
          }
          if (pj.field_q == 13) {
            uh.field_p = null;
            return true;
          }
          this.field_e.f(0);
          stackIn_5_0 = this.c((byte) 69);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var2), "p.F(" + param0 + ')');
        }
    }

    p(boolean param0) {
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          jn.field_p = 4;
          if (0 < mo.field_l) {
            fieldTemp$5 = jn.field_p;
            jn.field_p = jn.field_p + 1;
            qh.field_k = fieldTemp$5;
          } else {
            qh.field_k = -2;
          }
          fieldTemp$6 = jn.field_p;
          jn.field_p = jn.field_p + 1;
          rk.field_g = fieldTemp$6;
          fieldTemp$7 = jn.field_p;
          jn.field_p = jn.field_p + 1;
          sj.field_c = fieldTemp$7;
          gj.field_n = -(jn.field_p * 26 / 2) + 241;
          this.field_e = new jh(jn.field_p);
          this.field_e.a(-1, param0, this.field_e.a((byte) -24, 26, qh.field_i, 325, gj.field_n, 157, bm.field_h));
          var2_int = go.field_l.a(fa.field_m);
          var3 = go.field_l.a(cc.field_b);
          if (var3 > var2_int) {
            var2_int = var3;
          }
          this.field_g = (-79 + var2_int + 480) / 2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var2), "p.<init>(" + param0 + ')');
        }
    }

    final void a(byte param0) {
        int var2_int = 0;
        int var3 = 0;
        Object stackIn_6_0;
        int stackIn_6_1;
        int stackIn_6_2;
        int stackIn_6_3;
        Object stackIn_7_0;
        boolean stackIn_7_4;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = CrazyCrystals.field_B;
        try {
          go.a(jn.field_p + 2, 8, false);
          for (var2_int = 0; var2_int < jn.field_p; var2_int++) {
            stackIn_6_0 = this;
            stackIn_6_1 = -17;
            stackIn_6_2 = gj.field_n + 26 * var2_int;
            stackIn_6_3 = var2_int;
            if (var2_int != this.field_e.field_c) {
              stackIn_7_0 = this;
              stackIn_7_4 = false;
            } else {
              stackIn_7_0 = this;
              stackIn_7_4 = true;
            }
            this.a(stackIn_6_1, stackIn_6_2, stackIn_6_3, stackIn_7_4);
          }
          if (param0 < 71) {
            p.b(53);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var2), "p.D(" + param0 + ')');
        }
    }

    static {
        field_h = "This is you.";
        field_j = 0;
    }
}
