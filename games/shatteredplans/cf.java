/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf extends f implements bp {
    static String field_M;
    private ns field_K;
    static int field_D;
    static bi field_F;
    private nq field_J;
    private String field_L;
    private int[] field_N;
    static int[] field_H;
    private int field_G;
    private kg[] field_E;
    static String field_I;

    final static hh a(bc param0, int param1, bc param2, int param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        hh stackIn_5_0 = null;
        hh stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (vd.a(param3, param2, param4, param1 ^ 3)) {
              if (param1 == 1) {
                stackIn_7_0 = uc.a(param0.a(param3, -1, param4), 0);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = (hh) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("cf.C(");

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
          L2: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (hh) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final static void a(pf param0, byte param1) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              ds.field_c = rr.a(param0, bb.field_b, pd.field_k, 2);
              if (param1 == 39) {
                break L1;
              } else {
                field_D = -63;
                break L1;
              }
            }
            L2: {
              if (je.field_d != 1) {
                if ((rf.field_n ^ -1) != -2) {
                  L3: {
                    L4: {
                      if (null == il.field_bb) {
                        break L4;
                      } else {
                        if ((uq.field_i ^ -1) > -6) {
                          break L4;
                        } else {
                          ca.field_h = null;
                          break L3;
                        }
                      }
                    }
                    ca.field_h = vn.field_s;
                    if (null == ca.field_h) {
                      break L3;
                    } else {
                      ca.field_h.d(-ca.field_h.field_l + pd.field_k, -ca.field_h.field_h + bb.field_b, -30872);
                      break L3;
                    }
                  }
                  vn.field_s = null;
                  il.field_bb = null;
                  break L2;
                } else {
                  L5: {
                    uq.field_i = uq.field_i + 1;
                    if (il.field_bb == null) {
                      var2_int = (ba.field_c + -bb.field_b) * (ba.field_c - bb.field_b) + (-pd.field_k + ck.field_e) * (-pd.field_k + ck.field_e);
                      if (5 >= var2_int) {
                        break L5;
                      } else {
                        if (-6 <= (uq.field_i ^ -1)) {
                          break L5;
                        } else {
                          il.field_bb = vn.field_s;
                          break L5;
                        }
                      }
                    } else {
                      break L5;
                    }
                  }
                  if (il.field_bb != null) {
                    il.field_bb.c(bb.field_b - il.field_bb.field_h, 2, -il.field_bb.field_l + pd.field_k);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              } else {
                ba.field_c = td.field_P;
                ck.field_e = nh.field_p;
                uq.field_i = 0;
                vn.field_s = rr.a(param0, td.field_P, nh.field_p, param1 + -37);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var2);

            stackIn_23_1 = new StringBuilder().append("cf.J(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L6;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L6;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        int var2;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_12_2;
        boolean stackIn_12_3;
        int stackIn_12_4;
        int stackIn_12_5;
        int stackIn_12_6;
        int stackIn_12_7;
        int stackIn_12_8;
        int stackIn_12_9;
        int stackIn_12_10;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        boolean stackIn_14_3 = false;
        int stackIn_14_4 = 0;
        int stackIn_14_5 = 0;
        int stackIn_14_6 = 0;
        int stackIn_14_7 = 0;
        int stackIn_14_8 = 0;
        int stackIn_14_9 = 0;
        int stackIn_14_10 = 0;
        int stackIn_14_11 = 0;
        L0: {
          mf.d(58);
          if (np.field_a != null) {
            if (tf.a(true, np.field_a.field_Lb)) {
              stackIn_6_0 = 1;
              break L0;
            } else {
              stackIn_6_0 = 0;
              break L0;
            }
          } else {
            stackIn_6_0 = 0;
            break L0;
          }
        }
        L1: {
          var2 = stackIn_6_0;
          stackIn_8_0 = 14;

          if (-51 <= (l.field_f ^ -1)) {
            stackIn_9_0 = stackIn_8_0;
            stackIn_9_1 = 0;
            break L1;
          } else {
            stackIn_9_0 = stackIn_8_0;
            stackIn_9_1 = 1;
            break L1;
          }
        }
        L2: {
          L3: {

            stackIn_12_2 = param0 ^ 16777213;

            stackIn_12_3 = param1;

            stackIn_12_4 = 13;

            stackIn_12_5 = 0;

            stackIn_12_6 = 15;

            stackIn_12_7 = so.field_o;

            stackIn_12_8 = 1;

            stackIn_12_9 = var2;

            stackIn_12_10 = 11;

            if (v.field_b) {
              break L3;
            } else {






















              if (!kc.field_d) {
                stackIn_14_0 = stackIn_9_0;
                stackIn_14_1 = stackIn_9_1;
                stackIn_14_2 = stackIn_12_2;
                stackIn_14_3 = stackIn_12_3;
                stackIn_14_4 = stackIn_12_4;
                stackIn_14_5 = stackIn_12_5;
                stackIn_14_6 = stackIn_12_6;
                stackIn_14_7 = stackIn_12_7;
                stackIn_14_8 = stackIn_12_8;
                stackIn_14_9 = stackIn_12_9;
                stackIn_14_10 = stackIn_12_10;
                stackIn_14_11 = 0;
                break L2;
              } else {











                break L3;
              }
            }
          }
          stackIn_14_0 = stackIn_9_0;
          stackIn_14_1 = stackIn_9_1;
          stackIn_14_2 = stackIn_12_2;
          stackIn_14_3 = stackIn_12_3;
          stackIn_14_4 = stackIn_12_4;
          stackIn_14_5 = stackIn_12_5;
          stackIn_14_6 = stackIn_12_6;
          stackIn_14_7 = stackIn_12_7;
          stackIn_14_8 = stackIn_12_8;
          stackIn_14_9 = stackIn_12_9;
          stackIn_14_10 = stackIn_12_10;
          stackIn_14_11 = 1;
          break L2;
        }
        L4: {
          hg.a(stackIn_14_0, stackIn_14_1 != 0, stackIn_14_2, stackIn_14_3, stackIn_14_4, stackIn_14_5, stackIn_14_6, stackIn_14_7, stackIn_14_8 != 0, stackIn_14_9 != 0, stackIn_14_10, stackIn_14_11 != 0);
          if (!sm.field_e) {
            break L4;
          } else {
            if (cl.field_n % 50 == 0) {
              js.field_f.h(58, 255);
              break L4;
            } else {
              break L4;
            }
          }
        }
        L5: {
          if (!ac.field_u) {
            break L5;
          } else {
            js.field_f.h(58, 255);
            ac.field_u = false;
            break L5;
          }
        }
        L6: {
          if (param0 == 2) {
            break L6;
          } else {
            field_F = (bi) null;
            break L6;
          }
        }
        L7: {
          if (s.field_d) {
            js.field_f.h(10, param0 + 253);
            s.field_d = false;
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          if (!uc.field_B) {
            break L8;
          } else {
            uc.a(320, mp.field_b.field_K, mp.field_b.field_q + mp.field_b.field_K, 240, 8, nd.field_i, true, mr.field_i, (byte) -87, 2, mr.field_i, mp.field_b, false, 8, 1);
            uc.field_B = false;
            break L8;
          }
        }
    }

    final kg a(ko param0, int param1, String param2) {
        kg var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        kg stackIn_2_0 = null;
        kg stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = new kg(param2, param0);
            var4.field_p = (iq) ((Object) new qp());
            var5 = -2 + this.field_n;
            this.a(0, this.field_n + 34, (byte) 127, 0, this.field_x);
            if (param1 > 119) {
              var4.a(var5, 30, (byte) 103, 7, -14 + this.field_x);
              this.b((byte) -82, var4);
              stackIn_4_0 = (kg) (var4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (kg) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4_ref);

            stackIn_7_1 = new StringBuilder().append("cf.E(");

            if (param0 == null) {
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
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void a(int param0) {
        field_H = null;
        field_I = null;
        if (param0 != 240) {
            cf.a(119, 101, 48, true);
        }
        field_M = null;
        field_F = null;
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        gs.a(param0, param3, param2, -77, cr.field_c, rc.field_l, tg.field_a);
        if (param1 != 8) {
            bc var5 = (bc) null;
            cf.a((bc) null, -64, (bc) null, 13, 77);
        }
    }

    cf(ns param0, nq param1, String param2) {
        super(0, 0, 288, 0, (iq) null);
        int var4_int = 0;
        this.field_G = 0;
        try {
            this.field_J = param1;
            this.field_K = param0;
            this.field_L = param2;
            var4_int = this.field_L != null ? this.field_J.c(this.field_L, 260, this.field_J.field_J) : 0;
            this.a(0, 22 - -var4_int, (byte) 121, 0, 288);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "cf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(String param0, byte param1, int param2) {
        int var4_int = 0;
        try {
            var4_int = this.field_G;
            this.b(1 + var4_int, true);
            this.field_E[var4_int] = this.a((ko) (this), 122, param0);
            if (param1 < 99) {
                this.b(105, true);
            }
            this.field_N[var4_int] = param2;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "cf.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1 ^ 0, param2, param3);
        this.field_J.a(this.field_L, param3 + (this.field_m + 14), 10 + this.field_q + param2, this.field_x - 28, this.field_n, 16777215, -1, 0, 0, this.field_J.field_J);
        if (param1 != -11857) {
            field_D = 28;
        }
    }

    public final void a(kg param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param1 == 6) {
              var6_int = 0;
              L1: while (true) {
                L2: {
                  if (var6_int >= this.field_G) {
                    break L2;
                  } else {
                    if (param0 != this.field_E[var6_int]) {
                      var6_int++;
                      continue L1;
                    } else {
                      var7 = this.field_N[var6_int];
                      if (var7 == -1) {
                        this.field_K.i((byte) -104);
                        break L2;
                      } else {
                        qj.a((byte) -127, this.field_N[var6_int]);
                        break L2;
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var6);

            stackIn_13_1 = new StringBuilder().append("cf.F(");

            if (param0 == null) {
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
          throw r.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void b(int param0, boolean param1) {
        int var5 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!(param0 > this.field_G)) {
            return;
        }
        kg[] var7 = new kg[param0];
        kg[] var3 = var7;
        int[] var4 = new int[param0];
        if (!param1) {
            this.field_K = (ns) null;
        }
        for (var5 = 0; var5 < this.field_G; var5++) {
            var7[var5] = this.field_E[var5];
            var4[var5] = this.field_N[var5];
        }
        this.field_N = var4;
        this.field_G = param0;
        this.field_E = var3;
    }

    static {
        field_M = "From <%0>: ";
        field_I = "Game Type: Derelicts";
    }
}
