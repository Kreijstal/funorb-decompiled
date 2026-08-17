/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fsa extends vg implements lj, ew, fo, gma, ffa, noa, qn, t {
    private vna field_K;
    static jea field_q;
    static int field_m;
    private gpa field_i;
    private fsa field_X;
    private gpa field_Y;
    private int field_ab;
    private la field_y;
    vna field_B;
    vna field_u;
    private boolean field_v;
    private int field_g;
    private int field_j;
    private int field_Z;
    private int field_w;
    private int field_ib;
    private int field_J;
    private boolean field_M;
    private int field_s;
    private int field_F;
    private int field_f;
    private boolean field_D;
    private int field_n;
    private int field_E;
    private boolean field_p;
    private int field_gb;
    private boolean field_jb;
    private boolean field_T;
    private int field_U;
    private boolean field_eb;
    private boolean[] field_h;
    private int field_bb;
    private int field_mb;
    private int field_lb;
    private boolean field_cb;
    private boolean field_C;
    private boolean[] field_W;
    private vna field_O;
    private int field_t;
    private int field_N;
    private boolean field_r;
    private int field_V;
    private int field_S;
    private int field_L;
    private boolean[] field_k;
    private bca field_o;
    private on field_fb;
    private int field_R;
    private int field_I;
    private boolean field_l;
    private boolean field_P;
    private boolean field_Q;
    private int field_G;
    private int field_H;
    private boolean field_x;
    private int field_z;
    private boolean field_A;
    private int field_hb;
    private int field_kb;
    private int field_db;

    final void a(byte param0, nv param1) {
        try {
            this.field_u.b((byte) -58, param1);
            param1.a(true, (fsa) (this));
            if (param0 != 83) {
                wda var4 = (wda) null;
                this.a((wda) null, 39);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "fsa.WB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(ffa param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1) {
              if (!(param0 instanceof gma)) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = this.a((gma) ((Object) param0), (byte) -71);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("fsa.PE(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0 != 0;
          }
        }
    }

    private final void u(byte param0) {
        this.field_bb = this.field_mb;
        if (param0 != 116) {
            this.b(83, 92, 87, -71, -11);
        }
        this.field_s = this.field_Z;
        this.field_U = this.d(3);
        this.field_E = this.e(9648);
    }

    final void a(boolean param0, boolean param1, ui param2, ui param3) {
        int stackIn_7_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        wda var7 = null;
        nv var8 = null;
        fsa var9 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param1) {
                if (this.w((byte) -110)) {
                  stackIn_7_0 = 1;
                  break L1;
                } else {
                  stackIn_7_0 = 0;
                  break L1;
                }
              } else {
                stackIn_7_0 = 1;
                break L1;
              }
            }
            L2: {
              param1 = stackIn_7_0 != 0;
              if (param2 != null) {
                this.field_i = param2.a(-114, param1);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param3 == null) {
                break L3;
              } else {
                this.field_Y = param3.a(-102, false);
                break L3;
              }
            }
            var7 = (wda) ((Object) this.field_B.f(-80));
            L4: while (true) {
              if (var7 == null) {
                L5: {
                  if (param0) {
                    break L5;
                  } else {
                    this.b((byte) -99, -59);
                    break L5;
                  }
                }
                var8 = (nv) ((Object) this.field_u.f(-80));
                L6: while (true) {
                  if (var8 == null) {
                    var9 = (fsa) ((Object) this.field_K.f(-80));
                    L7: while (true) {
                      if (var9 == null) {
                        break L0;
                      } else {
                        var9.a(true, param1, param2, param3);
                        var9 = (fsa) ((Object) this.field_K.e(109));
                        continue L7;
                      }
                    }
                  } else {
                    var8.a(-121, param2, param1, param3);
                    var8 = (nv) ((Object) this.field_u.e(115));
                    continue L6;
                  }
                }
              } else {
                var7.a(param1, (byte) -128, param2, param3);
                var7 = (wda) ((Object) this.field_B.e(116));
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var5);

            stackIn_26_1 = new StringBuilder().append("fsa.W(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param3 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L9;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L9;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_27_0), stackIn_30_2 + ')');
        }
    }

    final void a(bca param0, byte param1) {
        boolean discarded$0 = false;
        try {
            this.field_o = param0;
            if (param1 != 121) {
                discarded$0 = this.k(-16, 107);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "fsa.TC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void d(int param0, int param1) {
        this.field_I = param0;
        if (param1 != -1) {
            this.field_eb = true;
        }
    }

    public final boolean a(byte param0, boolean param1) {
        if (param0 != -55) {
            this.g(74, 122);
        }
        if (!param1) {
            return this.field_v;
        }
        return !this.field_r ? true : false;
    }

    private final void t(int param0) {
        int var2 = this.d(3);
        int var3 = this.e(param0 + -2087504);
        int var4 = this.g((byte) 115);
        this.field_y.b(false).a((byte) 101, param0 + var4, var2, var3);
    }

    final void h(int param0, int param1) {
        boolean discarded$0 = false;
        this.field_f = param0;
        if (null != this.field_X) {
            this.field_X.h(param0, 0);
        }
        if (param1 != 0) {
            discarded$0 = this.C(-45);
        }
    }

    public final void a(int param0, iq param1) {
        boolean discarded$2 = false;
        if (this.field_C) {
            return;
        }
        try {
            discarded$2 = this.C(-76);
            if (param0 <= 103) {
                ir var4 = (ir) null;
                this.a((ir) null, -117);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "fsa.DB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(gr param0, byte param1, dg param2) {
        if (param2 == null) {
            return;
        }
        if (param1 != 124) {
            return;
        }
        try {
            this.field_O.b((byte) -74, param2);
            param2.a(param0, (gma) (this), (byte) 36);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "fsa.OE(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(boolean param0, int param1) {
        int var3;
        L0: {
          L1: {
            if (this.field_V == 0) {
              break L1;
            } else {
              if (this.d(true)) {
                var3 = this.field_F;
                this.field_F = this.field_F + param1;
                this.field_F = dfa.a(this.field_F, 8192, -126);
                this.x((byte) -60);
                if (!this.d(true, -3)) {
                  break L0;
                } else {
                  this.field_F = var3;
                  this.x((byte) -60);
                  break L0;
                }
              } else {
                break L1;
              }
            }
          }
          this.field_F = this.field_F + param1;
          this.field_F = dfa.a(this.field_F, 8192, -67);
          this.x((byte) -60);
          break L0;
        }
        if (!param0) {
          this.z(1);
          return;
        } else {
          return;
        }
    }

    private final boolean B(byte param0) {
        if (param0 != -81) {
            this.toString();
            return false;
        }
        return false;
    }

    public final boolean j(int param0) {
        int stackIn_9_0 = 0;
        L0: {
          if (param0 == -1) {
            break L0;
          } else {
            this.field_l = false;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_hb != 0) {
              break L2;
            } else {
              L3: {
                if (!this.field_A) {
                  break L3;
                } else {
                  if (this.field_X == null) {
                    break L3;
                  } else {
                    if (!this.field_X.j(-1)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackIn_9_0 = 0;
              break L1;
            }
          }
          stackIn_9_0 = 1;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    private final void v(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        dg var4 = (dg) ((Object) this.field_O.f(-80));
        while (var4 != null) {
            var4.i((byte) -30);
            var4 = (dg) ((Object) this.field_O.e(126));
        }
        if (param0 != -1332) {
            this.y(5);
        }
        this.field_O.d(8);
    }

    final static void a(int param0, kea param1) {
        if (param0 != 0) {
            return;
        }
        try {
            kh.a(true, la.field_k, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "fsa.AF(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int i(int param0) {
        if (param0 < 90) {
            this.field_P = true;
        }
        return this.field_U;
    }

    final int i(int param0, int param1) {
        int var4 = TombRacer.field_G ? 1 : 0;
        param0 = fs.a((byte) 79, param0, this.field_Z);
        if (param1 >= -100) {
            this.field_db = -42;
        }
        param0 = fs.a((byte) 64, param0, this.field_mb);
        param0 = fs.a((byte) 84, param0, this.field_F);
        wda var5 = (wda) ((Object) this.field_B.f(-80));
        while (var5 != null) {
            param0 = var5.a(0, param0);
            var5 = (wda) ((Object) this.field_B.e(121));
        }
        nv var6 = (nv) ((Object) this.field_u.f(-80));
        while (var6 != null) {
            param0 = var6.a(param0, -109);
            var6 = (nv) ((Object) this.field_u.e(115));
        }
        return param0;
    }

    public final boolean a(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        int var7;
        int var8;
        int stackIn_20_0 = 0;
        L0: {
          var8 = TombRacer.field_G ? 1 : 0;
          if (param4 != 0) {
            break L0;
          } else {
            if (param3 == 0) {
              return true;
            } else {
              break L0;
            }
          }
        }
        if (!this.a((byte) -55, param1)) {
          return false;
        } else {
          L1: {
            if (param2 != 2) {
              var7 = 0;
              L2: while (true) {
                if (param5 <= var7) {
                  break L1;
                } else {
                  param4 = param4 * 11 / 12;
                  param3 = 11 * param3 / 12;
                  var7++;
                  continue L2;
                }
              }
            } else {
              break L1;
            }
          }
          if (param0 > 68) {
            L3: {
              this.b(1 + param5, param4, 123, param2, param3);
              if (this.field_s - -param4 == this.field_Z) {
                if (this.field_mb == param3 + this.field_bb) {
                  stackIn_20_0 = 1;
                  break L3;
                } else {
                  stackIn_20_0 = 0;
                  break L3;
                }
              } else {
                stackIn_20_0 = 0;
                break L3;
              }
            }
            L4: {
              var7 = stackIn_20_0;
              if (var7 != 0) {
                break L4;
              } else {
                if ((param2 ^ -1) != -3) {
                  break L4;
                } else {
                  this.field_l = true;
                  break L4;
                }
              }
            }
            L5: {
              if (param1) {
                break L5;
              } else {
                if (var7 == 0) {
                  break L5;
                } else {
                  if (8192 > ua.a(param4, -124) - -ua.a(param3, -127)) {
                    break L5;
                  } else {
                    if ((param5 ^ -1) < -3) {
                      break L5;
                    } else {
                      this.field_y.a(false, this.d(3), 0, 0, this.e(9648), 0);
                      break L5;
                    }
                  }
                }
              }
            }
            return var7 != 0;
          } else {
            return false;
          }
        }
    }

    final void b(byte param0, int param1, int param2) {
        if (param0 != -11) {
            return;
        }
        this.field_gb = param1;
        this.field_t = param2;
    }

    final void i(boolean param0) {
        dg var3 = null;
        int var4 = TombRacer.field_G ? 1 : 0;
        if (!(!this.j(-1))) {
            return;
        }
        if (this.field_X != null && !this.field_A) {
        }
        fsa var2 = (fsa) ((Object) this.field_K.f(-80));
        while (var2 != null) {
            if (!(!var2.field_A)) {
                var2.i(true);
            }
            var2 = (fsa) ((Object) this.field_K.e(120));
        }
        this.field_hb = 1;
        this.field_f = 0;
        this.field_kb = 0;
        this.field_r = param0 ? true : false;
        uw var5 = this.field_y.j((byte) 104);
        if (var5 != null) {
            var3 = (dg) ((Object) this.field_O.f(-80));
            while (var3 != null) {
                var3.a(-65, var5);
                var3 = (dg) ((Object) this.field_O.e(123));
            }
        }
    }

    private final void b(int param0, int param1, int param2, int param3, int param4) {
        int var6;
        L0: {
          this.F((byte) -116);
          if (-1 <= (this.field_V ^ -1)) {
            this.field_mb = this.field_mb + param4;
            this.field_Z = this.field_Z + param1;
            break L0;
          } else {
            L1: {
              var6 = 0;
              if (-1 != (param1 ^ -1)) {
                var6 = 1;
                this.field_Z = this.field_Z + param1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (var6 == 0) {
                break L2;
              } else {
                if (-3 == (this.a(this.d(3) - this.field_U, 0, -4648, param3, param0) ^ -1)) {
                  this.field_Z = this.field_s;
                  this.field_Q = true;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              var6 = 0;
              if (0 != param4) {
                this.field_mb = this.field_mb + param4;
                var6 = 1;
                if (var6 == 0) {
                  break L3;
                } else {
                  if (this.a(0, this.e(9648) - this.field_E, -4648, param3, param0) != 2) {
                    break L3;
                  } else {
                    this.field_P = true;
                    this.field_mb = this.field_bb;
                    break L3;
                  }
                }
              } else {
                if (var6 == 0) {
                  break L3;
                } else {
                  if (this.a(0, this.e(9648) - this.field_E, -4648, param3, param0) != 2) {
                    break L3;
                  } else {
                    this.field_P = true;
                    this.field_mb = this.field_bb;
                    break L3;
                  }
                }
              }
            }
            if (!this.d(false, -3)) {
              break L0;
            } else {
              L4: {
                if (this.field_s == this.field_Z) {
                  break L4;
                } else {
                  this.field_Q = true;
                  break L4;
                }
              }
              L5: {
                if (this.field_bb != this.field_mb) {
                  this.field_P = true;
                  break L5;
                } else {
                  break L5;
                }
              }
              this.field_Z = this.field_s;
              this.field_mb = this.field_bb;
              break L0;
            }
          }
        }
        L6: {
          L7: {
            if (this.field_s != this.field_Z) {
              break L7;
            } else {
              if (this.field_mb != this.field_bb) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          this.field_M = true;
          this.z(1);
          break L6;
        }
        L8: {
          if (param2 > 109) {
            break L8;
          } else {
            this.j(109);
            break L8;
          }
        }
    }

    public final boolean a(int param0) {
        int var2 = 14 / ((param0 - 6) / 46);
        return !this.field_r ? true : false;
    }

    final void b(int param0, boolean param1) {
        int stackIn_20_0 = 0;
        fsa var4;
        int var5;
        wda var6;
        dg var7;
        uja var8;
        uja var9;
        uja var10;
        wda var11;
        nv var12;
        var5 = TombRacer.field_G ? 1 : 0;
        if (!this.field_C) {
          L0: {
            this.field_fb.a(86);
            if (this.field_l) {
              if (0 == this.field_R) {
                this.field_R = this.field_y.q(-88).a(3, 0);
                break L0;
              } else {
                this.field_R = this.field_R + 1;
                break L0;
              }
            } else {
              this.field_R = 0;
              break L0;
            }
          }
          L1: {
            this.field_l = false;
            if (-1 <= (this.field_N ^ -1)) {
              break L1;
            } else {
              this.field_N = this.field_N - 1;
              if (this.field_N == 0) {
                this.v((byte) 109);
                break L1;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (this.n((byte) 123)) {
              this.D((byte) 118);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (!param1) {
              if (this.x(15470).g(99)) {
                stackIn_20_0 = 1;
                break L3;
              } else {
                stackIn_20_0 = 0;
                break L3;
              }
            } else {
              stackIn_20_0 = 1;
              break L3;
            }
          }
          L4: {
            param1 = stackIn_20_0 != 0;
            if (param1) {
              break L4;
            } else {
              if ((this.field_G ^ -1) < -1) {
                this.field_G = this.field_G - 1;
                param1 = true;
                break L4;
              } else {
                break L4;
              }
            }
          }
          L5: {
            if (param1) {
              break L5;
            } else {
              if (!this.field_v) {
                break L5;
              } else {
                if (!this.x(15470).f(8, 10915)) {
                  break L5;
                } else {
                  this.a(86, true, 1, 131072 - this.field_y.q(90).a(262144, 0), -this.field_y.q(85).a(262144, 0) + 131072, 0);
                  break L5;
                }
              }
            }
          }
          L6: {
            if (this.j(-1)) {
              break L6;
            } else {
              L7: {
                this.field_Q = false;
                this.field_P = false;
                var8 = new uja(this.field_B);
                if (!this.field_D) {
                  break L7;
                } else {
                  if (param1) {
                    break L7;
                  } else {
                    var11 = (wda) ((Object) var8.a(true));
                    L8: while (true) {
                      if (var11 == null) {
                        break L7;
                      } else {
                        if (!var11.a((byte) 87)) {
                          L9: {
                            if (var11.a(-80)) {
                              var11.b((byte) -121);
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var11 = (wda) ((Object) var8.a(-1));
                          continue L8;
                        } else {
                          var11.p(126);
                          var11 = (wda) ((Object) var8.a(-1));
                          continue L8;
                        }
                      }
                    }
                  }
                }
              }
              var6 = (wda) ((Object) var8.a(true));
              L10: while (true) {
                if (var6 == null) {
                  var9 = new uja(this.field_u);
                  var12 = (nv) ((Object) var9.a(true));
                  L11: while (true) {
                    if (var12 == null) {
                      var10 = new uja(this.field_K);
                      var4 = (fsa) ((Object) var10.a(true));
                      L12: while (true) {
                        if (var4 == null) {
                          break L6;
                        } else {
                          L13: {
                            var4.b(75, param1);
                            if (!var4.field_C) {
                              break L13;
                            } else {
                              var4.p(2);
                              var4.B(-165);
                              break L13;
                            }
                          }
                          var4 = (fsa) ((Object) var10.a(-1));
                          continue L12;
                        }
                      }
                    } else {
                      L14: {
                        if (!var12.a((byte) 87)) {
                          if (!var12.a(-116)) {
                            break L14;
                          } else {
                            if (param1) {
                              if (var12.p((byte) 120)) {
                                break L14;
                              } else {
                                var12.k(5418);
                                break L14;
                              }
                            } else {
                              var12.k(5418);
                              break L14;
                            }
                          }
                        } else {
                          var12.p(82);
                          break L14;
                        }
                      }
                      var12 = (nv) ((Object) var9.a(-1));
                      continue L11;
                    }
                  }
                } else {
                  var6.b(1);
                  var6 = (wda) ((Object) var8.a(-1));
                  continue L10;
                }
              }
            }
          }
          var7 = (dg) ((Object) this.field_O.f(-80));
          L15: while (true) {
            if (var7 == null) {
              L16: {
                if (!this.field_eb) {
                  break L16;
                } else {
                  if (!this.field_B.d((byte) 14)) {
                    break L16;
                  } else {
                    this.v((byte) 109);
                    return;
                  }
                }
              }
              L17: {
                if (!this.field_p) {
                  break L17;
                } else {
                  if (this.field_u.d((byte) 14)) {
                    this.v((byte) 109);
                    return;
                  } else {
                    break L17;
                  }
                }
              }
              L18: {
                if (param0 > 26) {
                  break L18;
                } else {
                  this.e(-93, 58);
                  break L18;
                }
              }
              L19: {
                if (this.field_r) {
                  break L19;
                } else {
                  L20: {
                    if (!this.field_A) {
                      break L20;
                    } else {
                      if (null != this.field_X) {
                        break L19;
                      } else {
                        break L20;
                      }
                    }
                  }
                  if ((this.field_y.a(0, (gma) (this)) ^ -1) == -2) {
                    this.i(true);
                    return;
                  } else {
                    break L19;
                  }
                }
              }
              L21: {
                if (this.field_hb == 0) {
                  break L21;
                } else {
                  L22: {
                    if (this.field_X == null) {
                      break L22;
                    } else {
                      if (!this.field_X.j(-1)) {
                        break L22;
                      } else {
                        break L21;
                      }
                    }
                  }
                  this.field_hb = this.field_hb + this.field_kb;
                  this.field_kb = this.field_kb + 16384;
                  if (17825792 <= this.field_hb) {
                    this.c(4, (byte) 9);
                    return;
                  } else {
                    break L21;
                  }
                }
              }
              this.field_M = false;
              return;
            } else {
              var7.d(-1);
              var7 = (dg) ((Object) this.field_O.e(126));
              continue L15;
            }
          }
        } else {
          return;
        }
    }

    final void x(byte param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        if (!(this.field_X == null)) {
            this.field_g = hua.a((byte) 124, -this.field_X.g(-25787) >> -831829566);
            this.field_w = bua.a(0, -this.field_X.g(param0 + -25727) >> 937734050);
        }
        if (param0 != -60) {
            this.field_g = -7;
        }
        fsa var4 = (fsa) ((Object) this.field_K.f(param0 ^ 116));
        while (var4 != null) {
            var4.x((byte) -60);
            var4 = (fsa) ((Object) this.field_K.e(113));
        }
    }

    public final int b(int param0) {
        int var2 = -112 % ((param0 - 1) / 45);
        return this.field_S;
    }

    final static int a(int param0, int param1, boolean param2, CharSequence param3) {
        int stackIn_43_0 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        CharSequence var12 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 < 2) {
                break L1;
              } else {
                if ((param1 ^ -1) < -37) {
                  break L1;
                } else {
                  L2: {
                    var4_int = 0;
                    var5 = 0;
                    var6 = 0;
                    if (param0 == 57) {
                      break L2;
                    } else {
                      var12 = (CharSequence) null;
                      fsa.a(110, -65, true, (CharSequence) null);
                      break L2;
                    }
                  }
                  var7 = param3.length();
                  var8 = 0;
                  L3: while (true) {
                    if (var7 <= var8) {
                      if (var5 == 0) {
                        throw new NumberFormatException();
                      } else {
                        stackIn_43_0 = var6;
                        break L0;
                      }
                    } else {
                      L4: {
                        L5: {
                          var9 = param3.charAt(var8);
                          if (var8 != 0) {
                            break L5;
                          } else {
                            if (var9 != 45) {
                              if (var9 != 43) {
                                break L5;
                              } else {
                                if (!param2) {
                                  break L5;
                                } else {
                                  var8++;
                                  continue L3;
                                }
                              }
                            } else {
                              var4_int = 1;
                              break L4;
                            }
                          }
                        }
                        L6: {
                          L7: {
                            if (var9 < 48) {
                              break L7;
                            } else {
                              if (var9 <= 57) {
                                var9 -= 48;
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            if (var9 < 65) {
                              break L8;
                            } else {
                              if (var9 <= 90) {
                                var9 -= 55;
                                break L6;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L9: {
                            if (var9 < 97) {
                              break L9;
                            } else {
                              if (122 >= var9) {
                                var9 -= 87;
                                break L6;
                              } else {
                                break L9;
                              }
                            }
                          }
                          throw new NumberFormatException();
                        }
                        if (var9 >= param1) {
                          throw new NumberFormatException();
                        } else {
                          L10: {
                            if (var4_int != 0) {
                              var9 = -var9;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          var10 = param1 * var6 - -var9;
                          if (var6 == var10 / param1) {
                            var6 = var10;
                            var5 = 1;
                            break L4;
                          } else {
                            throw new NumberFormatException();
                          }
                        }
                      }
                      var8++;
                      continue L3;
                    }
                  }
                }
              }
            }
            throw new IllegalArgumentException("" + param1);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackIn_46_0 = (RuntimeException) (var4);

            stackIn_46_1 = new StringBuilder().append("fsa.HB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "null";
              break L11;
            } else {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "{...}";
              break L11;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ')');
        }
        return stackIn_43_0;
    }

    final void a(byte param0, int param1) {
        this.field_S = param1;
        if (param0 != -3) {
            this.field_D = false;
        }
    }

    final void b(boolean param0, int param1) {
        if (param1 != 11468) {
            this.i(-92);
        }
        this.field_A = param0 ? true : false;
    }

    public final boolean a(int param0, gma param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 <= -77) {
              if (this.b(12507, param1)) {
                if (this.field_R < this.field_I) {
                  stackIn_10_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  this.c(3, (byte) 9);
                  stackIn_8_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("fsa.OD(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0 != 0;
            } else {
              return stackIn_10_0 != 0;
            }
          }
        }
    }

    final int y(byte param0) {
        if (param0 >= -56) {
            this.b(80);
        }
        return this.field_n;
    }

    final lj a(boolean param0, int param1, byte param2) {
        lj var4;
        int var7;
        nv var8;
        wda var9;
        fsa var10;
        uja var11;
        uja var12;
        var7 = TombRacer.field_G ? 1 : 0;
        if (vh.a(param1, param0, -27201, (lj) (this))) {
          return (lj) (this);
        } else {
          var9 = (wda) ((Object) this.field_B.f(-80));
          L0: while (true) {
            if (var9 == null) {
              var11 = new uja(this.field_u);
              var8 = (nv) ((Object) var11.a(true));
              L1: while (true) {
                if (var8 == null) {
                  L2: {
                    var12 = new uja(this.field_K);
                    if (param2 == -26) {
                      break L2;
                    } else {
                      this.h(122, -84);
                      break L2;
                    }
                  }
                  var10 = (fsa) ((Object) var12.a(true));
                  L3: while (true) {
                    if (var10 != null) {
                      var4 = var10.a(param0, param1, (byte) -26);
                      if (var4 != null) {
                        return var4;
                      } else {
                        var10 = (fsa) ((Object) var12.a(-1));
                        continue L3;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  var4 = var8.a(0, param1, param0);
                  if (var4 != null) {
                    return var4;
                  } else {
                    var8 = (nv) ((Object) var11.a(-1));
                    continue L1;
                  }
                }
              }
            } else {
              var4 = var9.a(param0, 1, param1);
              if (var4 == null) {
                var9 = (wda) ((Object) this.field_B.e(119));
                continue L0;
              } else {
                return var4;
              }
            }
          }
        }
    }

    public final la f(byte param0) {
        int var2 = 38 % ((param0 - 0) / 61);
        return this.field_y;
    }

    public final boolean l(int param0) {
        ep var3;
        int stackIn_10_0 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            var3 = (ep) null;
            this.a((up) null, (ep) null, -25);
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (null == this.field_X) {
                break L3;
              } else {
                if (this.field_X.l(0)) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (!this.field_y.o((byte) -82)) {
                break L4;
              } else {
                if (this.a(this.field_y.i(6029), 31749)) {
                  break L4;
                } else {
                  break L2;
                }
              }
            }
            stackIn_10_0 = 0;
            break L1;
          }
          stackIn_10_0 = 1;
          break L1;
        }
        return stackIn_10_0 != 0;
    }

    public final int a(boolean param0) {
        if (!param0) {
            return 123;
        }
        return 3 * (1 + this.field_ab);
    }

    final int Q(int param0) {
        if (param0 != 2) {
            return 72;
        }
        return this.e(9648) - this.field_gb / 2;
    }

    private final int a(int param0, gr param1) {
        ub var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var3 = this.k((byte) -30);
              if (param0 == 13464) {
                break L1;
              } else {
                this.field_D = true;
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var4 >= var3.a(-1)) {
                stackIn_10_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param1 != var3.a(true, var4)) {
                  var4++;
                  continue L2;
                } else {
                  stackIn_7_0 = var4;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("fsa.HC(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_10_0;
        }
    }

    private fsa(la param0, fsa param1, kh param2, boolean param3) {
        this(param0, 0, 0, 32, 32, 0, param3);
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        Object stackIn_48_0 = null;
        Object stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        StringBuilder stackIn_60_1 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        StringBuilder stackIn_63_1 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        wda var7_ref_wda = null;
        int var8 = 0;
        nv var8_ref_nv = null;
        int var9 = 0;
        fsa var9_ref_fsa = null;
        int var10 = 0;
        dg var11 = null;
        try {
          L0: {
            L1: {
              this.field_X = param1;
              if (param1 == null) {
                break L1;
              } else {
                this.field_cb = false;
                break L1;
              }
            }
            L2: {
              this.field_Z = bla.a(true, 12, param2.b((byte) 44, 12)) << -1683769520;
              this.field_mb = bla.a(true, 12, param2.b((byte) 44, 12)) << -1838839952;
              this.field_t = param2.b((byte) 44, 10) << -1456860176;
              this.field_gb = param2.b((byte) 44, 10) << 146366800;
              stackIn_5_0 = this;

              if (param2.b((byte) 44, 1) == 1) {
                stackIn_6_0 = this;
                stackIn_6_1 = 1;
                break L2;
              } else {
                stackIn_6_0 = this;
                stackIn_6_1 = 0;
                break L2;
              }
            }
            L3: {
              ((fsa) (this)).field_eb = stackIn_6_1 != 0;
              stackIn_8_0 = this;

              if (param2.b((byte) 44, 1) == 1) {
                stackIn_9_0 = this;
                stackIn_9_1 = 1;
                break L3;
              } else {
                stackIn_9_0 = this;
                stackIn_9_1 = 0;
                break L3;
              }
            }
            L4: {
              ((fsa) (this)).field_p = stackIn_9_1 != 0;
              this.field_N = param2.b((byte) 44, 6) * 50;
              if (param0.field_E >= 10) {
                this.field_F = oo.a(4, 8192, 0, param2.b((byte) 44, 4));
                break L4;
              } else {
                this.field_F = oo.a(3, 8192, 0, param2.b((byte) 44, 3));
                break L4;
              }
            }
            L5: {
              if (10 >= param0.field_E) {
                this.field_S = param2.b((byte) 44, 8) / 5;
                this.field_I = 0;
                break L5;
              } else {
                this.field_S = param2.b((byte) 44, 8);
                this.field_I = param2.b((byte) 44, 8);
                break L5;
              }
            }
            L6: {
              if (4 > param0.field_E) {
                break L6;
              } else {
                L7: {
                  stackIn_18_0 = this;

                  if ((param2.b((byte) 44, 1) ^ -1) != -2) {
                    stackIn_19_0 = this;
                    stackIn_19_1 = 0;
                    break L7;
                  } else {
                    stackIn_19_0 = this;
                    stackIn_19_1 = 1;
                    break L7;
                  }
                }
                L8: {
                  ((fsa) (this)).field_r = stackIn_19_1 != 0;
                  stackIn_21_0 = this;

                  if (-2 == (param2.b((byte) 44, 1) ^ -1)) {
                    stackIn_22_0 = this;
                    stackIn_22_1 = 1;
                    break L8;
                  } else {
                    stackIn_22_0 = this;
                    stackIn_22_1 = 0;
                    break L8;
                  }
                }
                ((fsa) (this)).field_v = stackIn_22_1 != 0;
                this.field_f = param2.b((byte) 44, 3);
                this.field_V = param2.b((byte) 44, 3);
                this.field_L = param2.b((byte) 44, 3);
                break L6;
              }
            }
            L9: {
              if (param0.field_E > 9) {
                break L9;
              } else {
                L10: {
                  if (-2 <= (this.field_V ^ -1)) {
                    break L10;
                  } else {
                    this.field_V = this.field_V + 1;
                    break L10;
                  }
                }
                if ((this.field_f ^ -1) >= -2) {
                  break L9;
                } else {
                  this.field_f = this.field_f + 1;
                  break L9;
                }
              }
            }
            var5_int = param2.b((byte) 44, 3);
            var6 = 0;
            L11: while (true) {
              if (var5_int <= var6) {
                var6 = param2.b((byte) 44, 3);
                var7 = 0;
                L12: while (true) {
                  if (var7 >= var6) {
                    L13: {
                      if (param0.field_E < 2) {
                        var7 = param2.b((byte) 44, 2);
                        break L13;
                      } else {
                        var7 = param2.b((byte) 44, 3);
                        break L13;
                      }
                    }
                    var8 = 0;
                    L14: while (true) {
                      if (var8 >= var7) {
                        L15: {
                          if ((param0.field_E ^ -1) < -9) {
                            var8 = param2.b((byte) 44, 3);
                            var9 = 0;
                            L16: while (true) {
                              if (var9 >= var8) {
                                break L15;
                              } else {
                                var10 = param2.b((byte) 44, 5) - 1;
                                var11 = rm.field_a.a(param0, param2, false);
                                this.a(this.b(3, var10), (byte) 124, var11);
                                var9++;
                                continue L16;
                              }
                            }
                          } else {
                            this.c(437453352, false);
                            break L15;
                          }
                        }
                        L17: {
                          this.field_o = new bca(param0.field_E, param2);
                          this.N(0);
                          if ((param0.field_E ^ -1) > -15) {
                            this.field_A = true;
                            break L17;
                          } else {
                            L18: {
                              stackIn_48_0 = this;

                              if (1 != param2.b((byte) 44, 1)) {
                                stackIn_49_0 = this;
                                stackIn_49_1 = 0;
                                break L18;
                              } else {
                                stackIn_49_0 = this;
                                stackIn_49_1 = 1;
                                break L18;
                              }
                            }
                            ((fsa) (this)).field_A = stackIn_49_1 != 0;
                            break L17;
                          }
                        }
                        L19: {
                          if (-16 >= (param0.field_E ^ -1)) {
                            this.field_db = param2.b((byte) 44, 8);
                            break L19;
                          } else {
                            this.field_db = 0;
                            break L19;
                          }
                        }
                        break L0;
                      } else {
                        var9_ref_fsa = new fsa(param0, (fsa) (this), param2, param3);
                        this.field_K.b((byte) -120, var9_ref_fsa);
                        var8++;
                        continue L14;
                      }
                    }
                  } else {
                    var8_ref_nv = bda.a(param3, (byte) 44, param0, param2);
                    this.field_u.b((byte) -88, var8_ref_nv);
                    var8_ref_nv.a(true, (fsa) (this));
                    var7++;
                    continue L12;
                  }
                }
              } else {
                var7_ref_wda = ki.a(param2, (byte) 95, param0, param3);
                this.field_B.b((byte) -49, var7_ref_wda);
                var7_ref_wda.a(64, (fsa) (this));
                var6++;
                continue L11;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var5 = decompiledCaughtException;
            stackIn_57_0 = (RuntimeException) (var5);

            stackIn_57_1 = new StringBuilder().append("fsa.<init>(");

            if (param0 == null) {
              stackIn_58_0 = (RuntimeException) ((Object) stackIn_57_0);
              stackIn_58_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackIn_58_2 = "null";
              break L20;
            } else {
              stackIn_58_0 = (RuntimeException) ((Object) stackIn_57_0);
              stackIn_58_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackIn_58_2 = "{...}";
              break L20;
            }
          }
          L21: {


            stackIn_60_1 = ((StringBuilder) (Object) stackIn_58_1).append(stackIn_58_2).append(',');

            if (param1 == null) {
              stackIn_58_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackIn_61_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackIn_61_2 = "null";
              break L21;
            } else {
              stackIn_58_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackIn_61_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackIn_61_2 = "{...}";
              break L21;
            }
          }
          L22: {


            stackIn_63_1 = ((StringBuilder) (Object) stackIn_61_1).append(stackIn_61_2).append(',');

            if (param2 == null) {
              stackIn_58_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackIn_64_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackIn_64_2 = "null";
              break L22;
            } else {
              stackIn_58_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackIn_64_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackIn_64_2 = "{...}";
              break L22;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_58_0), stackIn_64_2 + ',' + param3 + ')');
        }
    }

    final boolean z(byte param0) {
        if (param0 < 56) {
            this.field_ab = 22;
        }
        return this.field_r;
    }

    final void e(boolean param0, int param1) {
        if (param1 < 114) {
            return;
        }
        this.field_v = param0 ? true : false;
    }

    final void h(boolean param0) {
        int var4 = TombRacer.field_G ? 1 : 0;
        uja var2 = new uja(this.field_u);
        nv var5 = (nv) ((Object) var2.a(true));
        while (var5 != null) {
            var5.g(-2);
            var5 = (nv) ((Object) var2.a(-1));
        }
        var2 = new uja(this.field_K);
        fsa var6 = (fsa) ((Object) var2.a(param0));
        while (var6 != null) {
            var6.h(true);
            var6 = (fsa) ((Object) var2.a(-1));
        }
    }

    public final int g(int param0) {
        int var2 = this.field_F;
        if (this.field_X != null) {
            var2 = var2 + this.field_X.g(param0 + 0);
        }
        if (param0 != -25787) {
            this.a(false);
        }
        return dfa.a(var2, 8192, 124);
    }

    public final int b(byte param0) {
        int var2 = -82 % ((-23 - param0) / 53);
        return this.field_Z;
    }

    public final int c(int param0) {
        if (param0 > -11) {
            this.field_mb = 62;
        }
        return this.field_t;
    }

    final void c(int param0, int param1) {
        this.field_mb = param0;
        if (param1 != -19879) {
            this.c(-99, -65);
        }
    }

    public final int a(byte param0) {
        if (param0 != 55) {
            return -54;
        }
        return this.field_gb;
    }

    public final String toString() {
        return this.E(116) + " (id " + this.field_i + ")";
    }

    final boolean m(byte param0) {
        if (param0 >= -63) {
            return true;
        }
        return -1 > (this.field_G ^ -1) ? true : false;
    }

    final int E(byte param0) {
        if (param0 != 3) {
            this.e(false);
        }
        return this.field_H;
    }

    final boolean s(byte param0) {
        int var2;
        if (!this.f(false)) {
          return false;
        } else {
          L0: {
            if (this.j(-1)) {
              break L0;
            } else {
              if (this.h(18407)) {
                break L0;
              } else {
                if (this.field_f >= 1) {
                  var2 = -59 % ((param0 - -33) / 62);
                  return true;
                } else {
                  return false;
                }
              }
            }
          }
          return false;
        }
    }

    public final int g(byte param0) {
        int var2 = -this.field_hb;
        if (param0 != 115) {
            return -57;
        }
        if (this.field_X != null) {
            var2 = var2 + this.field_X.g((byte) 115);
        }
        return var2;
    }

    final int o(byte param0) {
        if (param0 >= -91) {
            this.c(101);
        }
        return this.field_j;
    }

    final int q(byte param0) {
        if (param0 != -80) {
            this.field_s = 121;
        }
        return this.field_F;
    }

    final int g(boolean param0) {
        if (!param0) {
            return -108;
        }
        return this.field_V;
    }

    private final boolean b(int param0, byte param1) {
        if (param1 <= 104) {
            this.k(-34);
        }
        return this.field_W[param0];
    }

    final void a(int param0, uw param1) {
        int var4 = 0;
        CharSequence var5 = null;
        fsa var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            this.a(param1, true);
            var6 = (fsa) ((Object) this.field_K.f(-80));
            L1: while (true) {
              if (var6 == null) {
                L2: {
                  if (param0 > 115) {
                    break L2;
                  } else {
                    var5 = (CharSequence) null;
                    fsa.a(-115, -22, false, (CharSequence) null);
                    break L2;
                  }
                }
                break L0;
              } else {
                var6.a(127, param1);
                var6 = (fsa) ((Object) this.field_K.e(115));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("fsa.WE(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final void a(kh param0, int param1) {
        kh stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        kh stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        kh stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        kh stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        kh stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        kh stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        kh stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        kh stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        kh stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        kh stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int stackIn_32_2 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        fsa var4 = null;
        int var5 = 0;
        wda var6 = null;
        nv var7 = null;
        dg var8 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              param0.a((byte) 0, dqa.a(true, this.field_Z >> -869016592, 12), 12);
              param0.a((byte) -126, dqa.a(true, this.field_mb >> 580796592, 12), 12);
              param0.a((byte) -127, this.field_t >> -1753092112, 10);
              param0.a((byte) 72, this.field_gb >> -173257264, 10);
              stackIn_3_0 = (kh) (param0);

              stackIn_3_1 = 58;

              if (!this.field_eb) {
                stackIn_4_0 = (kh) ((Object) stackIn_3_0);
                stackIn_4_1 = stackIn_3_1;
                stackIn_4_2 = 0;
                break L1;
              } else {
                stackIn_4_0 = (kh) ((Object) stackIn_3_0);
                stackIn_4_1 = stackIn_3_1;
                stackIn_4_2 = 1;
                break L1;
              }
            }
            L2: {
              ((kh) (Object) stackIn_4_0).a((byte) stackIn_4_1, stackIn_4_2, 1);
              stackIn_6_0 = (kh) (param0);

              stackIn_6_1 = 118;

              if (!this.field_p) {
                stackIn_7_0 = (kh) ((Object) stackIn_6_0);
                stackIn_7_1 = stackIn_6_1;
                stackIn_7_2 = 0;
                break L2;
              } else {
                stackIn_7_0 = (kh) ((Object) stackIn_6_0);
                stackIn_7_1 = stackIn_6_1;
                stackIn_7_2 = 1;
                break L2;
              }
            }
            L3: {
              ((kh) (Object) stackIn_7_0).a((byte) stackIn_7_1, stackIn_7_2, 1);
              param0.a((byte) -125, this.field_N / 50, 6);
              var3_int = -112 / ((param1 - -58) / 39);
              param0.a((byte) -125, cn.a((byte) 59, this.field_F, 8192, 4), 4);
              param0.a((byte) -127, this.field_S, 8);
              param0.a((byte) -128, this.field_I, 8);
              stackIn_9_0 = (kh) (param0);

              stackIn_9_1 = 123;

              if (this.field_r) {
                stackIn_10_0 = (kh) ((Object) stackIn_9_0);
                stackIn_10_1 = stackIn_9_1;
                stackIn_10_2 = 1;
                break L3;
              } else {
                stackIn_10_0 = (kh) ((Object) stackIn_9_0);
                stackIn_10_1 = stackIn_9_1;
                stackIn_10_2 = 0;
                break L3;
              }
            }
            L4: {
              ((kh) (Object) stackIn_10_0).a((byte) stackIn_10_1, stackIn_10_2, 1);
              stackIn_12_0 = (kh) (param0);

              stackIn_12_1 = -25;

              if (!this.field_v) {
                stackIn_13_0 = (kh) ((Object) stackIn_12_0);
                stackIn_13_1 = stackIn_12_1;
                stackIn_13_2 = 0;
                break L4;
              } else {
                stackIn_13_0 = (kh) ((Object) stackIn_12_0);
                stackIn_13_1 = stackIn_12_1;
                stackIn_13_2 = 1;
                break L4;
              }
            }
            ((kh) (Object) stackIn_13_0).a((byte) stackIn_13_1, stackIn_13_2, 1);
            param0.a((byte) 26, this.field_f, 3);
            param0.a((byte) -127, this.field_V, 3);
            param0.a((byte) -126, this.field_L, 3);
            param0.a((byte) -125, this.field_B.a((byte) -16), 3);
            var6 = (wda) ((Object) this.field_B.f(-80));
            L5: while (true) {
              if (var6 == null) {
                param0.a((byte) -127, this.field_u.a((byte) -16), 3);
                var7 = (nv) ((Object) this.field_u.f(-80));
                L6: while (true) {
                  if (var7 == null) {
                    param0.a((byte) -126, this.t((byte) 112), 3);
                    var4 = (fsa) ((Object) this.field_K.f(-80));
                    L7: while (true) {
                      if (var4 == null) {
                        L8: {
                          if ((this.field_y.field_E ^ -1) > -10) {
                            break L8;
                          } else {
                            param0.a((byte) 88, this.field_O.a((byte) -16), 3);
                            var8 = (dg) ((Object) this.field_O.f(-80));
                            L9: while (true) {
                              if (var8 == null) {
                                break L8;
                              } else {
                                param0.a((byte) -127, 1 + this.a(13464, var8.c(-93)), 5);
                                rm.field_a.a(15682, param0, var8);
                                var8 = (dg) ((Object) this.field_O.e(109));
                                continue L9;
                              }
                            }
                          }
                        }
                        L10: {
                          this.field_o.a((byte) -125, param0);
                          stackIn_31_0 = (kh) (param0);

                          stackIn_31_1 = -127;

                          if (!this.field_A) {
                            stackIn_32_0 = (kh) ((Object) stackIn_31_0);
                            stackIn_32_1 = stackIn_31_1;
                            stackIn_32_2 = 0;
                            break L10;
                          } else {
                            stackIn_32_0 = (kh) ((Object) stackIn_31_0);
                            stackIn_32_1 = stackIn_31_1;
                            stackIn_32_2 = 1;
                            break L10;
                          }
                        }
                        ((kh) (Object) stackIn_32_0).a((byte) stackIn_32_1, stackIn_32_2, 1);
                        param0.a((byte) -126, this.field_db, 8);
                        break L0;
                      } else {
                        L11: {
                          if (var4.w((byte) -119)) {
                            var4.B(-165);
                            var4.p(17);
                            break L11;
                          } else {
                            var4.a(param0, -14);
                            break L11;
                          }
                        }
                        var4 = (fsa) ((Object) this.field_K.e(124));
                        continue L7;
                      }
                    }
                  } else {
                    var7.a(false, param0);
                    var7 = (nv) ((Object) this.field_u.e(111));
                    continue L6;
                  }
                }
              } else {
                var6.a(param0, (byte) -100);
                var6 = (wda) ((Object) this.field_B.e(118));
                continue L5;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var3 = decompiledCaughtException;
            stackIn_36_0 = (RuntimeException) (var3);

            stackIn_36_1 = new StringBuilder().append("fsa.BF(");

            if (param0 == null) {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L12;
            } else {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L12;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ',' + param1 + ')');
        }
    }

    final void d(byte param0, boolean param1) {
        this.field_jb = param1 ? true : false;
        int var3 = 114 / ((param0 - 2) / 50);
    }

    final void A(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        dg var2 = (dg) ((Object) this.field_O.f(-80));
        while (var2 != null) {
            var2.e(param0 ^ -23607);
            var2 = (dg) ((Object) this.field_O.e(param0 ^ 23599));
        }
        fsa var4 = (fsa) ((Object) this.field_K.f(-80));
        while (var4 != null) {
            var4.A(23645);
            var4 = (fsa) ((Object) this.field_K.e(110));
        }
        if (param0 != 23645) {
            this.field_lb = -40;
        }
    }

    public final int d(int param0) {
        int var3 = 0;
        int var4 = 0;
        if (param0 != 3) {
            this.a((byte) 51, true, -11);
        }
        int var2 = this.field_Z;
        if (!(null == this.field_X)) {
            var3 = var2 >> -1111105272;
            var4 = this.field_mb >> 275325672;
            var2 = -((this.field_g >> 518666536) * var4) + var3 * (this.field_w >> 1470272296);
            var2 = var2 + this.field_X.d(3);
        }
        return var2;
    }

    private final void a(uw param0, int param1) {
        int var4 = 0;
        dg var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (this.A((byte) 26)) {
                  break L2;
                } else {
                  if (!this.B((byte) -81)) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              param0.a(9, (fo) (this), (byte) -33);
              break L1;
            }
            L3: {
              if (param1 == 9411) {
                break L3;
              } else {
                this.field_cb = true;
                break L3;
              }
            }
            var5 = (dg) ((Object) this.field_O.f(-80));
            L4: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                var5.a(param0, 120);
                var5 = (dg) ((Object) this.field_O.e(125));
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("fsa.GD(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
    }

    final void c(int param0, boolean param1) {
        fsa var3_ref = null;
        int var4 = TombRacer.field_G ? 1 : 0;
        this.v(-1332);
        nv var3 = (nv) ((Object) this.field_u.f(param0 ^ -437453416));
        while (var3 != null) {
            this.a(var3, (byte) 124, rm.field_a.a(var3, (gma) (this), -126));
            var3 = (nv) ((Object) this.field_u.e(107));
        }
        if (!(!param1)) {
            var3_ref = (fsa) ((Object) this.field_K.f(param0 ^ -437453416));
            while (var3_ref != null) {
                var3_ref.c(437453352, true);
                var3_ref = (fsa) ((Object) this.field_K.e(117));
            }
        }
        if (param0 != 437453352) {
            this.Q(108);
        }
    }

    public final boolean j(byte param0) {
        if (param0 >= -102) {
            return false;
        }
        return this.n((byte) 120);
    }

    final void a(int param0, boolean param1, int param2) {
        this.field_W[param2] = param1;
        if (!(this.field_X == null)) {
            this.field_X.a(26492, param1, param2);
        }
        if (param0 != 26492) {
            uw var5 = (uw) null;
            this.a(-7, (uw) null);
        }
    }

    final int I(int param0) {
        if (param0 != -16423) {
            this.a(false, -102);
        }
        return this.field_lb;
    }

    final void o(int param0, int param1) {
        this.field_y.field_u.a((ffa) (this), (byte) 112);
        this.field_Z = this.field_Z + param0;
        this.field_mb = this.field_mb + param0;
        if (param1 <= 78) {
            return;
        }
        this.field_y.field_u.b((ffa) (this), 7073);
        this.N(0);
    }

    public final ew h(byte param0) {
        if (param0 < 105) {
            this.field_j = 102;
        }
        return (ew) ((Object) this.r(0));
    }

    final int O(int param0) {
        if (param0 < 7) {
            this.f(54, -8);
        }
        return this.field_J;
    }

    final boolean a(int param0, int param1) {
        if (param1 != 31749) {
            this.s(5);
        }
        return this.field_o.a(param0, 14530);
    }

    public final boolean d(byte param0) {
        if (param0 != 48) {
            this.m(-103, -125);
        }
        return this.field_C;
    }

    final void l(int param0, int param1) {
        this.field_H = param0;
        if (param1 != 146366800) {
            this.field_J = -18;
        }
    }

    private final boolean b(int param0, gma param1) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 12507) {
                break L1;
              } else {
                this.field_C = true;
                break L1;
              }
            }
            L2: {
              if (this.field_I == 0) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("fsa.UB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    private final boolean a(dg param0, int param1) {
        gr var3 = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0.a((byte) 70)) {
                break L1;
              } else {
                L2: {
                  var3 = param0.c(-100);
                  if (var3 == null) {
                    break L2;
                  } else {
                    if (this != var3.f((byte) 74)) {
                      break L2;
                    } else {
                      if (!var3.a((byte) 87)) {
                        break L1;
                      } else {
                        return false;
                      }
                    }
                  }
                }
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            var3_int = 89 / ((param1 - -65) / 41);
            stackIn_8_0 = 1;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("fsa.LD(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    final void e(int param0, int param1) {
        if (param1 <= 15) {
            this.a(true);
        }
        this.field_z = param0;
    }

    final int M(int param0) {
        if (param0 != 0) {
            return -91;
        }
        return this.field_ib;
    }

    final void B(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        this.field_y.field_u.a((ffa) (this), (byte) 112);
        if (this.field_y.j((byte) -74) != null) {
            this.a(this.field_y.j((byte) -96), param0 ^ -9320);
        }
        if (param0 != -165) {
            return;
        }
        fsa var4 = (fsa) ((Object) this.field_K.f(-80));
        while (var4 != null) {
            var4.B(-165);
            var4 = (fsa) ((Object) this.field_K.e(110));
        }
    }

    final void g(int param0, int param1) {
        this.field_L = param1;
        if (param0 < 99) {
            kea var4 = (kea) null;
            fsa.a(-31, (kea) null);
        }
    }

    public final gpa n(int param0) {
        if (param0 != 31974) {
            this.a(-74, (byte) 85);
        }
        return this.field_i;
    }

    final void D(byte param0) {
        int var4 = TombRacer.field_G ? 1 : 0;
        this.u((byte) 116);
        this.field_n = this.field_E;
        if (param0 != 118) {
            this.field_i = (gpa) null;
        }
        this.field_lb = this.field_U;
        uja var2 = new uja(this.field_K);
        fsa var3 = (fsa) ((Object) var2.a(true));
        while (var3 != null) {
            var3.D((byte) 118);
            var3 = (fsa) ((Object) var2.a(-1));
        }
    }

    public final on c(boolean param0) {
        if (param0) {
            this.field_eb = false;
        }
        return this.field_fb;
    }

    final void m(int param0, int param1) {
        this.field_Z = param1;
        if (param0 != 1) {
            iq var4 = (iq) null;
            this.a(120, (iq) null);
        }
    }

    final boolean w(byte param0) {
        int stackIn_8_0 = 0;
        if (param0 <= -108) {
          L0: {
            L1: {
              if (this.field_jb) {
                break L1;
              } else {
                L2: {
                  if (null == this.field_X) {
                    break L2;
                  } else {
                    if (!this.field_X.w((byte) -113)) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                stackIn_8_0 = 0;
                break L0;
              }
            }
            stackIn_8_0 = 1;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return false;
        }
    }

    public final int a(up param0, ep param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        uja var6 = null;
        nv var7 = null;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (this.a(param0.field_g, (byte) -74)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!this.b(param0.field_j, (byte) 120)) {
                stackIn_8_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param2 < -97) {
                    break L1;
                  } else {
                    this.field_P = false;
                    break L1;
                  }
                }
                var4_int = param1.i(-1);
                if (!this.a((byte) 110, param1.e(9648), param1.d(3), var4_int, var4_int)) {
                  stackIn_14_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var5 = 0;
                  var6 = new uja(this.field_u);
                  var7 = (nv) ((Object) var6.a(true));
                  L2: while (true) {
                    if (var7 == null) {
                      stackIn_19_0 = var5;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      var5 = var5 + var7.a(25940, param1, param0);
                      var7 = (nv) ((Object) var6.a(-1));
                      continue L2;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4);

            stackIn_22_1 = new StringBuilder().append("fsa.SD(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L3;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L4;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_23_0), stackIn_26_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              return stackIn_19_0;
            }
          }
        }
    }

    public final int e(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = this.field_mb;
        if (param0 != 9648) {
            this.c(-71, false);
        }
        if (!(this.field_X == null)) {
            var3 = this.field_Z >> 1207747176;
            var4 = var2 >> -499582456;
            var2 = (this.field_w >> 437453352) * var4 - -(var3 * (this.field_g >> 1024644840));
            var2 = var2 + this.field_X.e(param0 + 0);
        }
        return var2;
    }

    public final int a(up param0, int param1, int param2, int param3, int param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        uja var8 = null;
        nv var9 = null;
        int var10 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (this.a(param0.field_g, (byte) -119)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!this.b(param0.field_j, (byte) 125)) {
                stackIn_8_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!this.a((byte) 110, param4, param2, param5, param1)) {
                  stackIn_12_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var7_int = param3;
                  var8 = new uja(this.field_u);
                  var9 = (nv) ((Object) var8.a(true));
                  L1: while (true) {
                    if (var9 == null) {
                      stackIn_17_0 = var7_int;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      var7_int = var7_int + var9.a(param5, param1, param0, param2, (byte) 8, param4);
                      var9 = (nv) ((Object) var8.a(-1));
                      continue L1;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var7);

            stackIn_20_1 = new StringBuilder().append("fsa.WC(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L2;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              return stackIn_17_0;
            }
          }
        }
    }

    final hca H(int param0) {
        int var2 = 68 % ((-84 - param0) / 32);
        return this.field_y.u(-53);
    }

    final void b(byte param0, boolean param1) {
        this.field_r = param1 ? true : false;
        if (param0 != 17) {
            this.field_lb = 34;
        }
    }

    fsa(la param0, kh param1, boolean param2) {
        this(param0, (fsa) null, param1, param2);
    }

    final int s(int param0) {
        if (param0 != 25745) {
            this.field_C = true;
        }
        return this.field_Z;
    }

    final void n(int param0, int param1) {
        if (this.field_G <= param0) {
            this.field_G = param0;
            if (param1 >= -103) {
                fsa.K(-88);
            }
            return;
        }
    }

    final boolean J(int param0) {
        int stackIn_7_0 = 0;
        L0: {
          if (param0 > 35) {
            break L0;
          } else {
            this.field_lb = 122;
            break L0;
          }
        }
        L1: {
          L2: {
            if (!this.field_K.d((byte) 14)) {
              break L2;
            } else {
              if (!this.field_u.d((byte) 14)) {
                break L2;
              } else {
                if (!this.field_B.d((byte) 14)) {
                  break L2;
                } else {
                  stackIn_7_0 = 1;
                  break L1;
                }
              }
            }
          }
          stackIn_7_0 = 0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final void z(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        if (!(null != this.field_y)) {
            return;
        }
        this.field_y.field_u.a((ffa) (this), -78);
        this.field_y.field_u.b((ffa) (this), param0 + 7072);
        fsa var2 = (fsa) ((Object) this.field_K.f(-80));
        if (param0 != 1) {
            this.field_j = 74;
        }
        while (var2 != null) {
            var2.z(param0 + 0);
            var2 = (fsa) ((Object) this.field_K.e(122));
        }
    }

    final void u(int param0) {
        fsa var2;
        dg var2_ref;
        int var3;
        wda var4;
        nv var5;
        fsa var6;
        L0: {
          var3 = TombRacer.field_G ? 1 : 0;
          if (this.field_jb) {
            this.field_x = true;
            break L0;
          } else {
            break L0;
          }
        }
        var2 = (fsa) ((Object) this.field_K.f(-80));
        L1: while (true) {
          if (var2 == null) {
            this.x((byte) -60);
            this.N(param0 ^ param0);
            var4 = (wda) ((Object) this.field_B.f(param0 + -80));
            L2: while (true) {
              if (var4 == null) {
                var5 = (nv) ((Object) this.field_u.f(-80));
                L3: while (true) {
                  if (var5 == null) {
                    var2_ref = (dg) ((Object) this.field_O.f(-80));
                    L4: while (true) {
                      if (var2_ref == null) {
                        var6 = (fsa) ((Object) this.field_K.f(-80));
                        L5: while (true) {
                          if (var6 == null) {
                            return;
                          } else {
                            var6.field_X = (fsa) (this);
                            var6.u(param0 + 0);
                            var6 = (fsa) ((Object) this.field_K.e(126));
                            continue L5;
                          }
                        }
                      } else {
                        L6: {
                          if (this.a(var2_ref, param0 ^ -113)) {
                            var2_ref.a(var2_ref.c(-118), (gma) (this), (byte) 36);
                            break L6;
                          } else {
                            var2_ref.p(91);
                            break L6;
                          }
                        }
                        var2_ref = (dg) ((Object) this.field_O.e(124));
                        continue L4;
                      }
                    }
                  } else {
                    var5.a(true, (fsa) (this));
                    var5.n((byte) 86);
                    var5 = (nv) ((Object) this.field_u.e(122));
                    continue L3;
                  }
                }
              } else {
                var4.a(88, (fsa) (this));
                var4 = (wda) ((Object) this.field_B.e(120));
                continue L2;
              }
            }
          } else {
            L7: {
              if (var2.w((byte) -127)) {
                var2.B(param0 ^ -165);
                var2.p(48);
                break L7;
              } else {
                break L7;
              }
            }
            var2 = (fsa) ((Object) this.field_K.e(118));
            continue L1;
          }
        }
    }

    final qea y(int param0) {
        if (param0 != 1751085328) {
            return (qea) null;
        }
        return this.field_y.q(param0 + -1751085231);
    }

    final boolean d(int param0, boolean param1) {
        if (param0 != 50) {
            return false;
        }
        if (this.field_M) {
            return true;
        }
        if (param1) {
            if (null == this.field_X) {
                return false;
            }
            return this.field_X.d(50, param1);
        }
        return false;
    }

    final int P(int param0) {
        if (param0 != 0) {
            fsa.K(-55);
        }
        return this.field_db - -this.g((byte) 115);
    }

    private final String E(int param0) {
        String var2;
        int var3;
        L0: {
          var3 = TombRacer.field_G ? 1 : 0;
          if (!this.field_K.d((byte) 14)) {
            var2 = "Compound Trap";
            break L0;
          } else {
            L1: {
              if (!this.field_u.d((byte) 14)) {
                break L1;
              } else {
                if (this.field_B.d((byte) 14)) {
                  var2 = "Empty Trap";
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var2 = "Regular Trap";
            break L0;
          }
        }
        L2: {
          var2 = var2 + " [" + this.field_i.field_d + "]";
          if (param0 > 108) {
            break L2;
          } else {
            this.field_db = -28;
            break L2;
          }
        }
        return var2;
    }

    private final gr b(int param0, int param1) {
        ub var3 = this.k((byte) -30);
        if (param1 >= 0) {
            if (!(param1 >= var3.a(-1))) {
                return (gr) (var3.a(true, param1));
            }
        }
        if (param0 == 3) {
            return null;
        }
        return (gr) null;
    }

    public final boolean b(boolean param0) {
        ffa var3;
        int stackIn_11_0 = 0;
        L0: {
          if (param0) {
            break L0;
          } else {
            var3 = (ffa) null;
            this.a(-86, (gma) null, (ffa) null, -88);
            break L0;
          }
        }
        L1: {
          if (null == this.field_X) {
            break L1;
          } else {
            if (this.field_X.b(param0)) {
              return true;
            } else {
              break L1;
            }
          }
        }
        L2: {
          L3: {
            if (this.f(false)) {
              break L3;
            } else {
              if (this.field_B.d((byte) 14)) {
                stackIn_11_0 = 0;
                break L2;
              } else {
                break L3;
              }
            }
          }
          stackIn_11_0 = 1;
          break L2;
        }
        return stackIn_11_0 != 0;
    }

    final void a(int param0, boolean param1) {
        this.field_p = true;
        int var3 = 18 / ((-5 - param0) / 36);
    }

    final void a(iq param0, int param1) {
        boolean discarded$1 = false;
        int var4 = 0;
        nv var5 = null;
        fsa var6 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var5 = (nv) ((Object) this.field_u.f(-80));
            L1: while (true) {
              if (var5 == null) {
                var6 = (fsa) ((Object) this.field_K.f(-80));
                L2: while (true) {
                  if (var6 == null) {
                    L3: {
                      if (param1 == -10425) {
                        break L3;
                      } else {
                        discarded$1 = this.B((byte) 57);
                        break L3;
                      }
                    }
                    break L0;
                  } else {
                    var6.a(param0, -10425);
                    var6 = (fsa) ((Object) this.field_K.e(123));
                    continue L2;
                  }
                }
              } else {
                var5.b(123, param0);
                var5 = (nv) ((Object) this.field_u.e(param1 + 10546));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("fsa.SB(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    private final void a(uw param0, boolean param1) {
        int var4 = 0;
        dg var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (this.A((byte) 105)) {
                  break L2;
                } else {
                  if (this.B((byte) -81)) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              param0.a((byte) 4, 9, (fo) (this));
              break L1;
            }
            if (param1) {
              var5 = (dg) ((Object) this.field_O.f(-80));
              L3: while (true) {
                if (var5 == null) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var5.b(0, param0);
                  var5 = (dg) ((Object) this.field_O.e(111));
                  continue L3;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("fsa.VE(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void F(byte param0) {
        int var4 = TombRacer.field_G ? 1 : 0;
        this.u((byte) 116);
        uja var2 = new uja(this.field_K);
        fsa var3 = (fsa) ((Object) var2.a(true));
        while (var3 != null) {
            var3.F((byte) -102);
            var3 = (fsa) ((Object) var2.a(-1));
        }
        if (param0 > -90) {
            this.field_mb = 92;
        }
    }

    final void b(int param0, int param1, int param2) {
        this.field_mb = param1;
        if (param0 != 437453352) {
            return;
        }
        this.field_Z = param2;
    }

    public final void m(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        fsa var4 = (fsa) ((Object) this.field_K.f(-80));
        while (var4 != null) {
            var4.m(-93);
            var4 = (fsa) ((Object) this.field_K.e(123));
        }
        wda var5 = (wda) ((Object) this.field_B.f(-80));
        while (var5 != null) {
            var5.m(127);
            var5 = (wda) ((Object) this.field_B.e(109));
        }
        nv var6 = (nv) ((Object) this.field_u.f(-80));
        while (var6 != null) {
            var6.m(-109);
            var6 = (nv) ((Object) this.field_u.e(112));
        }
        int var2 = 14 / ((28 - param0) / 49);
    }

    final void d(int param0, byte param1) {
        int var4 = TombRacer.field_G ? 1 : 0;
        fsa var6 = (fsa) ((Object) this.field_K.f(-80));
        while (var6 != null) {
            if (!var6.a(param0, 31749)) {
                var6.v((byte) 109);
                var6.p(39);
            }
            var6 = (fsa) ((Object) this.field_K.e(119));
        }
        if (param1 >= -7) {
            ui var5 = (ui) null;
            this.a(true, false, (ui) null, (ui) null);
        }
    }

    private final void N(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        this.field_J = this.s(25745);
        this.field_j = this.e(false);
        if (param0 != 0) {
            return;
        }
        this.field_ib = this.q((byte) -80);
        fsa var4 = (fsa) ((Object) this.field_K.f(-80));
        while (var4 != null) {
            var4.N(0);
            var4 = (fsa) ((Object) this.field_K.e(126));
        }
        this.u((byte) 116);
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 > -12) {
            return;
        }
        this.b(0, param1, 127, this.field_L, param2);
    }

    public final boolean a(int param0, gma param1, int param2, int param3, int param4, ffa param5, int param6, int param7) {
        RuntimeException var9 = null;
        int var10 = 0;
        nv var11 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param2 > 55) {
              if (this.D(-107)) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!this.a(param1, (byte) -72)) {
                  if (param7 <= this.field_f) {
                    if (!this.a((byte) 110, param4, param6, param0, param3)) {
                      stackIn_17_0 = 0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      var11 = (nv) ((Object) this.field_u.f(-80));
                      L1: while (true) {
                        if (var11 == null) {
                          stackIn_25_0 = 0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if (!var11.a(param0, param3, 1, param6, param4, param7, param5)) {
                            var11 = (nv) ((Object) this.field_u.e(126));
                            continue L1;
                          } else {
                            stackIn_22_0 = 1;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        }
                      }
                    }
                  } else {
                    stackIn_13_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_10_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var9 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var9);

            stackIn_28_1 = new StringBuilder().append("fsa.IC(").append(param0).append(',');

            if (param1 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L2;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L3;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_29_0), stackIn_32_2 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_17_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_22_0 != 0;
                  } else {
                    return stackIn_25_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    public final int a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        int var7;
        nv var8;
        int var9;
        var9 = TombRacer.field_G ? 1 : 0;
        if (!this.j(param4, 8192)) {
          return 0;
        } else {
          if (this.a((byte) 110, param2, param3, param5, param1)) {
            L0: {
              if (param0) {
                break L0;
              } else {
                this.field_Q = true;
                break L0;
              }
            }
            var7 = 0;
            var8 = (nv) ((Object) this.field_u.f(-80));
            L1: while (true) {
              if (var8 == null) {
                return var7;
              } else {
                L2: {
                  if (var8.a(-97)) {
                    var7 = var7 + var8.a(param1, param5, param2, param4, (byte) 88, param3);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var8 = (nv) ((Object) this.field_u.e(126));
                continue L1;
              }
            }
          } else {
            return 0;
          }
        }
    }

    final void c(int param0, byte param1) {
        int var4 = TombRacer.field_G ? 1 : 0;
        this.x(param1 ^ 15463).m(9262).a((fsa) (this), param1 ^ 8);
        if (param1 != 9) {
            this.field_D = true;
        }
        this.t(param1 ^ 2097161);
        dg var5 = (dg) ((Object) this.field_O.f(param1 + -89));
        while (var5 != null) {
            var5.a((byte) -91, param0);
            var5 = (dg) ((Object) this.field_O.e(118));
        }
        this.v((byte) 109);
    }

    final void a(byte param0, boolean param1, int param2) {
        int var4 = -63 % ((param0 - -61) / 41);
        this.field_h[param2] = param1;
        if (!(this.field_X == null)) {
            this.field_X.a((byte) 102, param1, param2);
        }
    }

    public final gpa i(byte param0) {
        if (param0 != 84) {
            return (gpa) null;
        }
        return this.field_Y;
    }

    public final void a(int param0, int param1, int param2) {
        this.field_y.field_u.a((ffa) (this), (byte) 115);
        this.b(437453352, param0, param1);
        this.F((byte) -108);
        this.field_y.field_u.b((ffa) (this), param2 ^ 7075);
        if (param2 != 2) {
            this.field_w = -48;
        }
    }

    final void f(int param0, int param1) {
        int var4 = TombRacer.field_G ? 1 : 0;
        dg var5 = (dg) ((Object) this.field_O.f(-80));
        while (var5 != null) {
            var5.a(param1, (byte) 122);
            var5 = (dg) ((Object) this.field_O.e(param0 ^ 102));
        }
        if (param0 != 10) {
            this.field_i = (gpa) null;
        }
        this.field_db = this.field_db + param1;
    }

    public static void K(int param0) {
        if (param0 != 8424) {
            field_m = -93;
        }
        field_q = null;
    }

    public final lj a(int param0, int param1, boolean param2) {
        if (param0 != 28672) {
            return (lj) null;
        }
        if (param2) {
            return this.a(param2, param1, (byte) -26);
        }
        return this.field_y.a(param0 + 0, param1, param2);
    }

    final fsa a(int param0, la param1, boolean param2) {
        kh var4 = null;
        RuntimeException var4_ref = null;
        fsa var5 = null;
        fsa stackIn_2_0 = null;
        fsa stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = new kh(30000);
            var4.i(8);
            if (param0 == -14402) {
              this.a(var4, -108);
              var4.k(-1826190686);
              var4.field_h = 0;
              var4.h((byte) 111);
              var5 = new fsa(param1, var4, param2);
              var4.i((byte) 98);
              var5.a(true, param2, (ui) null, new ui());
              var5.h(true);
              stackIn_4_0 = (fsa) (var5);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (fsa) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4_ref);

            stackIn_7_1 = new StringBuilder().append("fsa.SE(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final boolean a(gma param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                this.field_M = true;
                break L1;
              }
            }
            L2: {
              L3: {
                if (!this.b(param1 ^ 12507, param0)) {
                  break L3;
                } else {
                  if (this.field_I > this.field_R) {
                    break L3;
                  } else {
                    stackIn_6_0 = 1;
                    break L2;
                  }
                }
              }
              stackIn_6_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("fsa.OA(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0 != 0;
    }

    final void L(int param0) {
        this.field_D = true;
        int var2 = 66 % ((param0 - 60) / 58);
    }

    final void a(la param0, boolean param1) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        wda var5 = null;
        nv var6 = null;
        dg var7 = null;
        fsa var8 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              param0.field_u.a((ffa) (this), (byte) 116);
              if (!param1) {
                break L1;
              } else {
                this.field_Y = (gpa) null;
                break L1;
              }
            }
            L2: {
              if (!this.n((byte) 122)) {
                this.field_s = -this.field_s;
                this.field_Z = -this.field_Z;
                break L2;
              } else {
                this.field_Z = param0.a(this.field_Z, (byte) 71);
                this.field_s = param0.a(this.field_s, (byte) 71);
                break L2;
              }
            }
            L3: {
              this.field_lb = param0.a(this.field_lb, (byte) 71);
              this.field_U = param0.a(this.field_U, (byte) 71);
              if (this.n((byte) 108)) {
                this.field_J = param0.a(this.field_J, (byte) 71);
                break L3;
              } else {
                this.field_J = -this.field_J;
                break L3;
              }
            }
            this.field_ib = dfa.a(-this.field_ib, 8192, -35);
            this.field_F = dfa.a(-this.field_F, 8192, -97);
            param0.field_u.b((ffa) (this), 7073);
            var5 = (wda) ((Object) this.field_B.f(-80));
            L4: while (true) {
              if (var5 == null) {
                var6 = (nv) ((Object) this.field_u.f(-80));
                L5: while (true) {
                  if (var6 == null) {
                    var7 = (dg) ((Object) this.field_O.f(-80));
                    L6: while (true) {
                      if (var7 == null) {
                        var8 = (fsa) ((Object) this.field_K.f(-80));
                        L7: while (true) {
                          if (var8 == null) {
                            break L0;
                          } else {
                            var8.a(param0, false);
                            var8 = (fsa) ((Object) this.field_K.e(121));
                            continue L7;
                          }
                        }
                      } else {
                        var7.h(65);
                        var7 = (dg) ((Object) this.field_O.e(110));
                        continue L6;
                      }
                    }
                  } else {
                    var6.h(28701);
                    var6 = (nv) ((Object) this.field_u.e(116));
                    continue L5;
                  }
                }
              } else {
                var5.c((byte) -122);
                var5 = (wda) ((Object) this.field_B.e(114));
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var3);

            stackIn_24_1 = new StringBuilder().append("fsa.CC(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
    }

    final boolean n(byte param0) {
        if (param0 <= 105) {
            this.q((byte) -1);
        }
        return this.field_cb;
    }

    final void F(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        if (!(this.field_y.j((byte) 104) == null)) {
            this.a(this.field_y.j((byte) 49), true);
        }
        fsa var4 = (fsa) ((Object) this.field_K.f(-80));
        while (var4 != null) {
            var4.F(127);
            var4 = (fsa) ((Object) this.field_K.e(108));
        }
        this.u(0);
        this.u((byte) 116);
        if (param0 < 96) {
            this.c(-88, 5);
        }
        this.z(1);
    }

    private final boolean C(int param0) {
        if (param0 >= -40) {
            this.H(37);
        }
        return null != this.field_X ? true : false;
    }

    final void a(int param0, byte param1, boolean param2) {
        uja var4 = null;
        fsa var5 = null;
        int var6 = TombRacer.field_G ? 1 : 0;
        this.field_V = param0;
        if (param2) {
            var4 = new uja(this.field_K);
            var5 = (fsa) ((Object) var4.a(true));
            while (var5 != null) {
                var5.a(param0, (byte) -12, param2);
                var5 = (fsa) ((Object) var4.a(param1 ^ 11));
            }
        }
        if (param1 != -12) {
            this.field_I = -21;
        }
    }

    final void a(wda param0, int param1) {
        try {
            this.field_B.b((byte) -101, param0);
            param0.a(45, (fsa) (this));
            if (param1 != 0) {
                this.field_y = (la) null;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "fsa.WD(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final boolean a(gma param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 != this) {
              if (this.field_x) {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param1 < -43) {
                    break L1;
                  } else {
                    this.w((byte) -34);
                    break L1;
                  }
                }
                L2: {
                  if (!(param0 instanceof fsa)) {
                    break L2;
                  } else {
                    if (this.r(0) != ((fsa) ((Object) param0)).r(0)) {
                      break L2;
                    } else {
                      stackIn_12_0 = 1;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
                stackIn_14_0 = 0;
                decompiledRegionSelector0 = 3;
                break L0;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3);

            stackIn_17_1 = new StringBuilder().append("fsa.AD(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0 != 0;
            } else {
              return stackIn_14_0 != 0;
            }
          }
        }
    }

    final void b(byte param0, int param1) {
        int var3 = -10 / ((-12 - param0) / 42);
    }

    final fsa r(int param0) {
        if (param0 != 0) {
            this.field_f = 55;
        }
        if (this.field_X != null) {
            return this.field_X.r(0);
        }
        return (fsa) (this);
    }

    fsa(la param0, boolean param1) {
        this(param0, 0, 0, 32, 32, 0, param1);
    }

    public final int e(byte param0) {
        if (param0 >= -86) {
            this.a(65, 113, 36);
        }
        return this.g((byte) 115);
    }

    public final boolean a(byte param0, int param1, int param2, int param3, int param4) {
        if (this.field_C) {
            return false;
        }
        if (param0 != 110) {
            ui var7 = (ui) null;
            this.a(false, false, (ui) null, (ui) null);
        }
        return io.a(this.c(-72), param1, (byte) -89, this.a((byte) 55), param2, this.e(9648), param3, param4, this.d(3));
    }

    final int r(byte param0) {
        if (param0 != -95) {
            this.z(-122);
        }
        return this.d(3) - this.field_t / 2;
    }

    final boolean C(byte param0) {
        if (param0 > -40) {
            return false;
        }
        return this.field_P;
    }

    final void a(int param0, fsa param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              this.field_K.b((byte) -111, param1);
              param1.field_cb = false;
              param1.field_X = (fsa) (this);
              param1.u(0);
              if (param0 < -29) {
                break L1;
              } else {
                this.d((byte) 16, false);
                break L1;
              }
            }
            L2: {
              if (this.w((byte) -117)) {
                param1.d((byte) -74, true);
                param1.F(98);
                break L2;
              } else {
                param1.F(98);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("fsa.UC(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final int e(boolean param0) {
        if (param0) {
            return 31;
        }
        return this.field_mb;
    }

    final void a(int param0, byte param1) {
        if (param1 < 69) {
            this.d(-37, 91);
        }
        this.field_F = param0;
    }

    final dt x(int param0) {
        if (param0 != 15470) {
            this.i((byte) -88);
        }
        return this.field_y.a(param0 ^ -1553485410);
    }

    final int w(int param0) {
        if (param0 != 17825792) {
            this.field_k = (boolean[]) null;
        }
        return this.field_z;
    }

    private final boolean f(boolean param0) {
        if (param0) {
            this.m(-111);
        }
        return this.field_v;
    }

    final void a(boolean param0, byte param1, int param2) {
        this.field_k[param2] = param0;
        if (!(this.field_X == null)) {
            this.field_X.a(param0, (byte) -116, param2);
        }
        int var4 = -79 / ((param1 - 40) / 58);
    }

    final void v(byte param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        if (!(!this.field_C)) {
            return;
        }
        this.field_C = true;
        nv var5 = (nv) ((Object) this.field_u.f(-80));
        while (var5 != null) {
            var5.c(false);
            var5 = (nv) ((Object) this.field_u.e(120));
        }
        if (param0 != 109) {
            gma var4 = (gma) null;
            this.a((gma) null, -13);
        }
        fsa var6 = (fsa) ((Object) this.field_K.f(-80));
        while (var6 != null) {
            var6.v((byte) 109);
            var6 = (fsa) ((Object) this.field_K.e(111));
        }
        this.B(-165);
        this.v(-1332);
    }

    final boolean p(byte param0) {
        if (param0 >= -101) {
            this.k(-114);
        }
        return this.field_Q;
    }

    public final int a(up param0, int param1, pc param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        uja var6 = null;
        nv var7 = null;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (this.a(param0.field_g, (byte) -116)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (this.b(param0.field_j, (byte) 125)) {
                  break L1;
                } else {
                  if (!this.field_T) {
                    stackIn_9_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              var4_int = eha.a(this.field_t, param1, this.e(param1 + 9636), this.field_gb, param2, this.d(param1 ^ 15), 2);
              if (0 != (var4_int ^ -1)) {
                var5 = 0;
                var6 = new uja(this.field_u);
                var7 = (nv) ((Object) var6.a(true));
                L2: while (true) {
                  if (var7 == null) {
                    stackIn_17_0 = var5;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    var5 = var5 + var7.a(-119, param0, param2);
                    var7 = (nv) ((Object) var6.a(-1));
                    continue L2;
                  }
                }
              } else {
                stackIn_12_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var4);

            stackIn_20_1 = new StringBuilder().append("fsa.ED(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L3;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_21_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              return stackIn_17_0;
            }
          }
        }
    }

    final void a(int param0, gma param1, ffa param2, int param3) {
        int var6 = 0;
        nv var7 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (this.k(param3, 0)) {
              if (!this.a((byte) 110, param1.e(9648), param1.d(3), param1.a((byte) 55), param1.c(param0 ^ -26685))) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param0 == 26689) {
                    break L1;
                  } else {
                    this.field_I = -15;
                    break L1;
                  }
                }
                var7 = (nv) ((Object) this.field_u.f(-80));
                L2: while (true) {
                  if (var7 == null) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    L3: {
                      if (!var7.a(-115)) {
                        break L3;
                      } else {
                        var7.a(param2, (byte) 24, param1, param3);
                        break L3;
                      }
                    }
                    var7 = (nv) ((Object) this.field_u.e(113));
                    continue L2;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("fsa.GB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    private final boolean d(boolean param0, int param1) {
        fsa var4;
        int var5;
        int var6;
        int var7;
        uja var8;
        var7 = TombRacer.field_G ? 1 : 0;
        var8 = new uja(this.field_K);
        if (param1 == -3) {
          var4 = (fsa) ((Object) var8.a(true));
          L0: while (true) {
            if (var4 == null) {
              return false;
            } else {
              L1: {
                L2: {
                  if (!param0) {
                    break L2;
                  } else {
                    if (this.field_L != 0) {
                      var5 = var4.d(3) - var4.i(122);
                      var6 = var4.e(9648) + -var4.k(-21185);
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var6 = 0;
                var5 = 0;
                break L1;
              }
              L3: {
                if (-3 == (var4.a(var5, var6, -4648, this.field_L, 0) ^ -1)) {
                  break L3;
                } else {
                  if (var4.d(param0, param1 ^ 0)) {
                    break L3;
                  } else {
                    var4 = (fsa) ((Object) var8.a(-1));
                    continue L0;
                  }
                }
              }
              return true;
            }
          }
        } else {
          return true;
        }
    }

    public final boolean h(int param0) {
        if (param0 != 18407) {
            this.field_z = 79;
        }
        return this.field_C;
    }

    private final ub k(byte param0) {
        int var4 = TombRacer.field_G ? 1 : 0;
        ub var2 = new ub();
        wda var3 = (wda) ((Object) this.field_B.f(-80));
        while (var3 != null) {
            var2.a((byte) -37, var3);
            var3 = (wda) ((Object) this.field_B.e(param0 ^ -110));
        }
        nv var3_ref = (nv) ((Object) this.field_u.f(param0 + -50));
        while (var3_ref != null) {
            var2.a((byte) -37, var3_ref);
            var3_ref = (nv) ((Object) this.field_u.e(117));
        }
        if (param0 != -30) {
            this.w((byte) 21);
        }
        return var2;
    }

    private final boolean k(int param0, int param1) {
        if (param1 != 0) {
            this.field_db = -92;
        }
        return this.field_h[param0];
    }

    public final void f(int param0) {
        if (param0 != -4366) {
            this.field_J = 18;
        }
    }

    public final int k(int param0) {
        if (param0 != -21185) {
            return -45;
        }
        return this.field_E;
    }

    final void c(byte param0, boolean param1) {
        if (param0 < 46) {
            field_q = (jea) null;
        }
        this.field_cb = param1 ? true : false;
    }

    final static void a(int param0, long param1) {
        try {
            Throwable decompiledCaughtException = null;
            InterruptedException var3 = null;
            try {
              L0: {
                L1: {
                  Thread.sleep(param1);
                  if (param0 == 9) {
                    break L1;
                  } else {
                    field_q = (jea) null;
                    break L1;
                  }
                }
                break L0;
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var3 = (InterruptedException) (Object) decompiledCaughtException;
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_15_0 = 0;
        L0: {
          if (param2 == -4648) {
            break L0;
          } else {
            this.field_F = 108;
            break L0;
          }
        }
        if (this.field_y == null) {
          return 0;
        } else {
          if (this.field_V == 0) {
            return 0;
          } else {
            L1: {
              if (param3 == 0) {
                break L1;
              } else {
                L2: {
                  if (-1 != (param0 ^ -1)) {
                    break L2;
                  } else {
                    if (0 != param1) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                return this.field_y.a((ffa) (this), (gma) (this), this.field_V, this.field_t, param1, param2 ^ -4652, this.field_gb, this.d(param2 + 4651), param3, param0, this.e(9648), param4, true);
              }
            }
            L3: {
              if (this.field_y.a((ffa) (this), this.field_gb, 2, this.field_V, this.e(param2 + 14296), this.d(3), true, (gma) (this), this.field_t)) {
                stackIn_15_0 = 2;
                break L3;
              } else {
                stackIn_15_0 = 0;
                break L3;
              }
            }
            return stackIn_15_0;
          }
        }
    }

    final void G(int param0) {
        if (param0 < 118) {
            return;
        }
        this.field_D = false;
    }

    final void a(ir param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (null != this.field_X) {
                param0.field_f = param0.field_f - this.field_X.d(3);
                param0.field_d = param0.field_d - this.field_X.e(9648);
                var3_int = param0.field_f >> -2132007288;
                var4 = param0.field_d >> -804509720;
                param0.field_d = var4 * (this.field_w >> 577543112) + -(var3_int * (this.field_g >> -1427410488));
                param0.field_f = var3_int * (this.field_w >> -252788888) + (this.field_g >> -1625835416) * var4;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 > 9) {
                break L2;
              } else {
                this.field_fb = (on) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("fsa.CA(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final boolean d(boolean param0) {
        if (!param0) {
            return false;
        }
        return !this.field_K.d((byte) 14) ? true : false;
    }

    private final boolean A(byte param0) {
        if (param0 <= 12) {
            return false;
        }
        return this.field_y.o((byte) -82);
    }

    final void a(byte param0, ir param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param0 == 54) {
                break L1;
              } else {
                this.r((byte) 1);
                break L1;
              }
            }
            L2: {
              if (null != this.field_X) {
                var3_int = param1.field_f >> 1038409928;
                var4 = param1.field_d >> -609209528;
                param1.field_f = -((this.field_g >> -1830055064) * var4) + (this.field_w >> 866570056) * var3_int;
                param1.field_d = (this.field_w >> -588319896) * var4 - -(var3_int * (this.field_g >> 1842504872));
                param1.field_f = param1.field_f + this.field_X.d(3);
                param1.field_d = param1.field_d + this.field_X.e(9648);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("fsa.SC(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    private final boolean D(int param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 <= -80) {
            break L0;
          } else {
            this.field_j = -124;
            break L0;
          }
        }
        L1: {
          L2: {
            if (!this.field_A) {
              break L2;
            } else {
              if (null == this.field_X) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    private final boolean j(int param0, int param1) {
        if (param1 != 8192) {
            return false;
        }
        return this.field_k[param0];
    }

    public final int c(byte param0) {
        if (param0 <= 91) {
            nv var3 = (nv) null;
            this.a((byte) 41, (nv) null);
        }
        return this.field_mb;
    }

    public final boolean a(int param0, gma param1, int param2, pc param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        nv var8 = null;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (!this.D(param0 + -85)) {
              if (!this.a(param1, (byte) -51)) {
                L1: {
                  if (this.field_f >= param2) {
                    break L1;
                  } else {
                    if (this.field_T) {
                      break L1;
                    } else {
                      stackIn_10_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
                var5_int = eha.a(this.field_t, 12, this.e(param0 + 9649), this.field_gb, param3, this.d(3), 2);
                if (param0 == var5_int) {
                  stackIn_14_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  var6 = wm.a(4096, var5_int, param0 + 125);
                  var7 = 0;
                  var8 = (nv) ((Object) this.field_u.f(-80));
                  L2: while (true) {
                    if (var8 == null) {
                      stackIn_21_0 = var7;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      L3: {
                        if (!var8.a(param2, 1, param3, var6)) {
                          break L3;
                        } else {
                          var7 = 1;
                          break L3;
                        }
                      }
                      var8 = (nv) ((Object) this.field_u.e(param0 ^ -114));
                      continue L2;
                    }
                  }
                }
              } else {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var5);

            stackIn_24_1 = new StringBuilder().append("fsa.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L4;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L5;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_25_0), stackIn_28_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0 != 0;
              } else {
                return stackIn_21_0 != 0;
              }
            }
          }
        }
    }

    final void a(boolean param0, int param1) {
        this.field_T = param0 ? true : false;
        if (null != this.field_X) {
            this.field_X.a(param0, -102);
        }
        int var3 = -77 % ((param1 - -34) / 49);
    }

    private final int t(byte param0) {
        int var4 = TombRacer.field_G ? 1 : 0;
        int var2 = 0;
        fsa var3 = (fsa) ((Object) this.field_K.f(-80));
        while (var3 != null) {
            if (!(var3.w((byte) -113))) {
                var2++;
            }
            var3 = (fsa) ((Object) this.field_K.e(116));
        }
        if (param0 <= 15) {
            return -30;
        }
        return var2;
    }

    fsa(la param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        this.field_K = new vna();
        this.field_B = new vna();
        this.field_u = new vna();
        this.field_T = false;
        this.field_h = new boolean[3];
        this.field_f = 0;
        this.field_W = new boolean[6];
        this.field_cb = true;
        this.field_r = true;
        this.field_jb = false;
        this.field_L = 0;
        this.field_V = 0;
        this.field_k = new boolean[3];
        this.field_O = new vna();
        this.field_o = new bca();
        this.field_fb = new on();
        this.field_z = -1;
        this.field_db = 32;
        try {
            this.field_ab = rn.field_b;
            this.field_gb = param4 << 814222512;
            this.field_jb = param6 ? true : false;
            this.field_D = true;
            rn.field_b = rn.field_b + 1;
            this.field_y = param0;
            this.field_mb = param2 << 1751085328;
            this.field_F = param5;
            this.field_t = param3 << 756070160;
            this.field_Z = param1 << -1428174928;
            this.a(true, param6, param0.e(-51), (ui) null);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "fsa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
    }
}
