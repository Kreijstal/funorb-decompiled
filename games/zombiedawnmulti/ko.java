/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ko {
    private boolean field_c;
    static String field_i;
    static String field_j;
    private int field_a;
    static String field_k;
    private int field_f;
    private boolean field_d;
    private boolean field_e;
    private int field_m;
    private boolean field_g;
    static String field_h;
    private fb[] field_b;
    private int field_l;

    public static void d(int param0) {
        try {
          int var1_int = 98 / ((-2 - param0) / 60);
          field_j = null;
          field_i = null;
          field_h = null;
          field_k = null;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "ko.K(" + param0 + ')');
        }
    }

    private final void a(ja param0, byte param1, ja param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param0.g(-(param0.field_x / 2) + 320, 400);
          if (param1 != 59) {
            return;
          }
          g.a(param2, 320 - param2.field_x / 2, 400);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("ko.F(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_11_0 = stackIn_7_0;
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_0 = stackIn_11_0;
            stackIn_12_2 = "null";
          } else {
            stackIn_12_0 = stackIn_7_0;
            stackIn_12_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param0 <= 61) {
            field_j = (String) null;
          }
          this.field_m = this.field_m + 1;
          if (param1 != 255 &&
            param1 < 19 && (!ll.field_k.a(45, -128) ||
            param1 == 17)) {
            if (h.i(51603) && (jk.a((byte) -73, param1) ||
              jk.a((byte) -122, param2))) {
              return false;
            }
            if (this.field_m == 8) {
              return false;
            }
            this.field_b[-1 + this.field_m] = new fb(190 + (this.field_m * 40 - 40), param1, this.field_m - 1);
            this.field_b[-1 + this.field_m].field_l = -op.field_m.field_H + tg.field_e.field_b[this.field_m - 1];
            this.field_b[this.field_m - 1].a(0);
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "ko.Q(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean a(byte param0) {
        boolean stackIn_11_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 > -111) {
            return true;
          }
          stackIn_11_0 = (this.field_c) || (this.field_e) || (this.field_g) || (this.field_d);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "ko.H(" + param0 + ')');
        }
    }

    final boolean g(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 13) {
            stackIn_4_0 = this.field_c;
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "ko.J(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, byte param2) {
        int var5_int = 0;
        int var4_int = 0;
        fb[] var4 = null;
        fb var6_ref_fb = null;
        int var7 = 0;
        fb[] var8 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        fb var5 = null;
        int var6 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var8 = this.field_b;
          var4 = var8;
          for (var5_int = 0; var5_int < var8.length; var5_int++) {
            var6_ref_fb = var8[var5_int];
            if (var6_ref_fb != null) {
              var6_ref_fb.a(param1, param0, 255);
            }
          }
          this.field_a = -1;
          if (param2 < 64) {
            this.b(119, 56, -64);
          }
          for (var4_int = 0; var4_int < this.field_b.length; var4_int++) {
            var5 = this.field_b[var4_int];
            if (var5 != null) {
              var6 = var5.a(param1, (byte) -66);
              if (-1 != var6) {
                this.field_f = 20 + var5.field_m;
                this.field_a = var4_int;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4_ref), "ko.L(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(boolean param0, int param1, boolean param2, boolean param3) {
        cj stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        boolean stackIn_15_2 = false;
        cj stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        boolean stackIn_23_2 = false;
        cj stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        boolean stackIn_29_2 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          v.a(199);
          if (param2) {
            ko.d(-60);
          }
          if (0 > bc.field_e) {
            ql.field_b.field_wb = null;
          } else {
            ql.field_b.field_wb = vl.a(ob.field_v, new String[]{Integer.toString(bc.field_e)}, 2);
          }
          stackIn_14_0 = qe.field_k;
          stackIn_14_1 = -11838;
          stackIn_15_2 = (param0) && (!param3) && (!ee.field_a) && (null == mh.field_c) && (ej.field_n == null);
          ((cj) (Object) stackIn_14_0).a(stackIn_14_1, stackIn_15_2);
          stackIn_22_0 = cm.field_a;
          stackIn_22_1 = -11838;
          stackIn_23_2 = (param0) && (!param3) && (!ee.field_a) && (mh.field_c == null) && (ej.field_n == null);
          ((cj) (Object) stackIn_22_0).a(stackIn_22_1, stackIn_23_2);
          stackIn_28_0 = lm.field_gb;
          stackIn_28_1 = -11838;
          stackIn_29_2 = (param0) && (!param3) && (ee.field_a);
          ((cj) (Object) stackIn_28_0).a(stackIn_28_1, stackIn_29_2);
          de.field_b.field_c.h(-37);
          if (0 != kj.field_u.field_T) {
            uk.field_N = true;
          }
          boolean decompiledFrameRemainder0 = true;
          if (ia.field_t.field_T != 0) {
            if (!bo.field_e &&
              vl.field_h <= 0 && (!(kj.field_q >= 2) ||
              !lc.field_m[12])) {
              pb.field_f = true;
              decompiledFrameRemainder0 = false;
            }
            else {
              ii.a(param1, -1);
            }
          }
          if (pl.field_L.field_T != 0) {
            if (1 == qo.field_r.length &&
              i.field_e != qo.field_r[0]) {
              i.field_e = qo.field_r[0];
            }
            cm.a(123, 0, i.field_e, ch.field_c, true, param1);
          }
          if (0 != kn.field_a.field_T) {
            ee.field_a = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "ko.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(boolean param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            stackIn_4_0 = this.field_g;
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "ko.E(" + param0 + ')');
        }
    }

    final void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        fb[] var2 = null;
        int var2_int = 0;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        fb var4_ref_fb = null;
        int var5 = 0;
        fb[] var6 = null;
        int var2_intLifetime1;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var6 = this.field_b;
          var2 = var6;
          if (param0 > -114) {
            this.field_a = -40;
          }
          for (var3 = 0; var3 < var6.length; var3++) {
            var4_ref_fb = var6[var3];
            if (var4_ref_fb != null) {
              var4_ref_fb.c(123);
            }
          }
          if (this.field_a != -1 &&
            this.field_a < tg.field_e.field_d.length) {
            var2_int = tg.field_e.field_d[this.field_a];
            var3Lifetime1 = tg.field_e.field_f[this.field_a];
            if (255 != var2_int) {
              g.a(fe.field_W[var2_int], this.field_f - 100, 453);
              oj.field_M[var2_int].g(-100 + this.field_f, 453);
              if (var3Lifetime1 != 255) {
                g.a(fe.field_W[var3Lifetime1], -100 + this.field_f, 438);
                oj.field_M[var3Lifetime1].g(-100 + this.field_f, 438);
              }
            }
          }
          if (this.field_e) {
            this.a(wp.field_e, (byte) 59, vl.field_k);
          } else {
            if (this.field_d &&
              this.field_g &&
              this.field_c) {
              this.a(la.field_j, (byte) 59, kj.field_o);
            } else {
              if (this.field_d &&
                this.field_g) {
                this.a(up.field_f, (byte) 59, oq.field_t);
              } else {
                if (!this.field_g) {
                  if (this.field_c &&
                    this.field_d) {
                    this.a(mi.field_Mb, (byte) 59, aq.field_u);
                  } else {
                    if (this.field_c) {
                      this.a(bq.field_a, (byte) 59, ii.field_c);
                    } else {
                      if (this.field_d) {
                        this.a(fe.field_U, (byte) 59, ap.field_t);
                      }
                    }
                  }
                } else {
                  this.a(dl.field_c, (byte) 59, bf.field_f);
                }
              }
            }
          }
          var2_intLifetime1 = this.e(-1);
          if (255 != var2_intLifetime1 &&
            0 < bd.field_g) {
            if (bo.field_d <= 0) {
              return;
            }
            var3Lifetime2 = 4 + bd.field_g;
            var4 = 15 + bo.field_d;
            wa.field_b[var2_intLifetime1].c(var3Lifetime2, var4, 255);
            if (bk.field_g) {
              return;
            }
            el.field_E.c(1 + var3Lifetime2, var4 + 1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2_ref), "ko.A(" + param0 + ')');
        }
    }

    final int e(int param0) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_l != param0 &&
            this.field_b[this.field_l] != null) {
            stackIn_3_0 = this.field_b[this.field_l].a((byte) 97);
            return stackIn_3_0;
          }
          stackIn_5_0 = 255;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "ko.G(" + param0 + ')');
        }
    }

    final void a(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_b[param0] == null) {
            return;
          }
          if (!this.field_b[param0].field_b) {
            this.b(param1 ^ -18, param0);
          }
          if (param1 != -1) {
            this.field_m = -102;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "ko.B(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean f(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0) {
            stackIn_4_0 = this.field_e;
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "ko.R(" + param0 + ')');
        }
    }

    final int b(boolean param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            this.field_a = 77;
          }
          var2_int = this.e(-1);
          if (var2_int != 9 &&
            var2_int != 10) {
            return 0;
          }
          stackIn_8_0 = ip.field_f;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "ko.O(" + param0 + ')');
        }
    }

    final boolean b(int param0, int param1) {
        boolean stackIn_50_1 = false;
        boolean stackIn_59_1 = false;
        boolean stackIn_64_1 = false;
        boolean stackIn_69_1 = false;
        boolean stackIn_76_2 = false;
        RuntimeException decompiledCaughtException = null;
        fb[] var3 = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        fb var5_ref_fb = null;
        int var6 = 0;
        fb[] var7 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (this.field_b[param1] == null) {
            return false;
          }
          if (param0 != 17) {
            this.field_c = false;
          }
          if (!this.field_b[param1].b((byte) 92)) {
            iq.a(-10, (byte) 99);
            var7 = this.field_b;
            var3 = var7;
            for (var4 = 0; var4 < var7.length; var4++) {
              var5_ref_fb = var7[var4];
              if (null != var5_ref_fb) {
                var5_ref_fb.c((byte) 18);
              }
            }
            L3: {
              this.field_l = param1;
              this.field_b[param1].b(2);
              var3_int = this.field_b[param1].a((byte) 114);
              this.field_e = false;
              this.field_g = false;
              this.field_c = false;
              this.field_d = false;
              var4 = ll.field_k.field_g[param1];
              var5 = var3_int;
              if (7 == var5) {
                this.field_c = true;
                stackIn_50_1 = (37 == var4);
                this.field_d = stackIn_50_1;
              } else {
                if (13 != var5 &&
                  var5 != 11 &&
                  9 != var5 &&
                  var5 != 10 &&
                  12 != var5) {
                  if (var5 == 17) {
                    this.field_d = true;
                    this.field_e = true;
                    this.field_g = true;
                    this.field_c = true;
                  } else {
                    if (4 != var5 &&
                      var5 != 1) {
                      if (var5 == 2) {
                        this.field_g = true;
                        stackIn_64_1 = (32 == var4);
                        this.field_d = stackIn_64_1;
                      } else {
                        if (var5 != 16 &&
                          14 != var5 &&
                          var5 != 5) {
                          switch (var5) {
                            case 8:
                              this.field_c = true;
                              this.field_d = true;
                              break L3;
                            default:
                              this.field_g = true;
                              break L3;
                            case 15:
                              this.field_e = true;
                              break L3;
                            case 0:
                              stackIn_76_2 = (var4 == 32);
                              this.field_d = stackIn_76_2;
                              this.field_c = stackIn_76_2;
                              this.field_g = true;
                              break L3;
                          }
                        }
                        this.field_g = true;
                        stackIn_69_1 = (var4 == 33);
                        this.field_d = stackIn_69_1;
                      }
                    } else {
                      this.field_g = true;
                      stackIn_59_1 = (var4 == 37);
                      this.field_d = stackIn_59_1;
                    }
                  }
                  break L3;
                }
                this.field_e = true;
              }
            }
            if (!df.field_I) {
              return true;
            }
            ah.a((byte) -86, var3_int);
            iq.a(var3_int, (byte) 99);
          } else {
            this.h(1);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3_ref), "ko.P(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean b(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        boolean stackIn_9_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = (param2 - 190) / 40;
          if (param1 <= var4_int &&
            var4_int < this.field_m &&
            null != this.field_b[var4_int]) {
            if (!this.field_b[var4_int].a(param0, param2, (byte) -46)) {
              return false;
            }
            stackIn_9_0 = this.b(17, var4_int);
            return stackIn_9_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "ko.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean h(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (!this.a((byte) -122)) {
            return false;
          }
          if (null != this.field_b[this.field_l]) {
            this.field_b[this.field_l].c((byte) 18);
          }
          this.field_l = -1;
          this.field_c = false;
          this.field_d = false;
          this.field_e = false;
          this.field_g = false;
          if (param0 == 1) {
            return true;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "ko.D(" + param0 + ')');
        }
    }

    final void a(int param0, id param1, int param2, int param3) {
        ti stackIn_8_0 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        Object var6 = null;
        ti var6_ref = null;
        wb var7 = null;
        int var8 = 0;
        int var9 = 0;
        var6 = null;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var5_int = this.e(-1);
            if (!(param1 instanceof jj)) {
              var6_ref = (ti) (param1);
              if (var6_ref instanceof wb) {
                stackIn_8_0 = var6_ref;
              } else {
                stackIn_8_0 = null;
              }
              var7 = (wb) (stackIn_8_0);
              var8 = var5_int;
              if (var8 == 255) {
                return;
              }
              if (var8 != 12 &&
                var8 != 11) {
                if (13 != var8 &&
                  var8 != 10 &&
                  var8 != 9 &&
                  var8 != 15) {
                  if (var8 == 17) {
                    if (var6_ref != null) {
                      param0 = -1;
                      param2 = var6_ref.field_y;
                    }
                    ok.a(-101, param0, ma.field_a, op.field_m.field_H, param2, this.field_l);
                    break L0;
                  }
                  if (3 == var8) {
                    if (var7 != null &&
                      var7.q(-14945) &&
                      !var7.o(127)) {
                      wd.a(var6_ref.field_y, -1, this.field_l, op.field_m.field_H, ma.field_a);
                      break L0;
                    }
                    return;
                  }
                  if (var8 != 1 &&
                    var8 != 2 &&
                    var8 != 4 &&
                    var8 != 14 &&
                    var8 != 16 &&
                    var8 != 5 &&
                    var8 != 18) {
                    if (var8 != 7 &&
                      var8 == 0) {
                    }
                    wd.a(var6_ref.field_y, -1, this.field_l, op.field_m.field_H, ma.field_a);
                    break L0;
                  }
                  if (var7 != null &&
                    !var7.o(88)) {
                    wd.a(var6_ref.field_y, -1, this.field_l, op.field_m.field_H, ma.field_a);
                    break L0;
                  }
                  return;
                }
                ok.a(-117, param0, ma.field_a, op.field_m.field_H, param2, this.field_l);
                break L0;
              }
              nn.a(ma.field_a, op.field_m.field_H, this.field_l, (byte) 102);
            } else {
              wd.a(param1.field_y, -1, this.field_l, op.field_m.field_H, ma.field_a);
            }
          }
          tg.field_e.field_b[this.field_l] = op.field_m.field_H + op.field_m.a(ll.field_k.field_g[this.field_l], var5_int, fb.field_e.field_M, false);
          this.field_b[this.field_l].a(0);
          this.field_c = false;
          this.field_g = false;
          if (param3 < 112) {
            return;
          }
          this.field_l = -1;
          this.field_e = false;
          this.field_d = false;
          iq.a(-11, (byte) 99);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_80_0 = var5;
          stackIn_80_1 = new StringBuilder().append("ko.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 20) {
            field_j = (String) null;
          }
          stackIn_3_0 = this.field_d;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "ko.M(" + param0 + ')');
        }
    }

    final void b(int param0) {
        int var4 = 0;
        int var2_int = 0;
        fb[] var3 = null;
        fb var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var2_int = 110 / ((34 - param0) / 58);
          var3 = this.field_b;
          for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            if (var5 != null) {
              var5.field_b = false;
              var5.b(2);
              var5.c((byte) 18);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "ko.N(" + param0 + ')');
        }
    }

    ko() {
        this.field_d = false;
        this.field_f = 0;
        this.field_e = false;
        this.field_g = false;
        this.field_c = false;
        this.field_a = -1;
        try {
          this.field_b = new fb[8];
          this.field_m = 0;
          this.field_l = -1;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "ko.<init>()");
        }
    }

    static {
        field_i = "Waiting for sound effects";
        field_h = "Location";
        field_k = "Players: ";
        field_j = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
