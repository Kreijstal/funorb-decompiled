/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class f extends bh {
    static w field_n;
    static n field_r;
    int[] field_t;
    static String field_q;
    boolean field_u;
    static String field_w;
    static String field_x;
    static String field_v;
    static w field_o;
    static ke field_s;
    static String field_p;

    final static boolean a(wl param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
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
            if (param1 == 19) {
              L1: {
                var2_int = param0.d((byte) -40);
                if ((var2_int ^ -1) != -2) {
                  stackIn_6_0 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L1;
                }
              }
              var3 = stackIn_6_0;
              stackIn_7_0 = var3;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("f.C(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    final static ke a(boolean param0, boolean param1, int param2, boolean param3, boolean param4, int param5, boolean param6, boolean param7) {
        ke stackIn_2_0 = null;
        ke stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        ke stackIn_5_0 = null;
        ke stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        ec stackIn_16_0 = null;
        ec stackIn_16_1 = null;
        ec stackIn_17_0 = null;
        ec stackIn_17_1 = null;
        int stackIn_17_2 = 0;
        ke stackIn_60_0 = null;
        ke stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        ec var9;
        ec var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        ke var18;
        ke var19;
        L0: {
          var17 = client.field_A ? 1 : 0;
          var18 = new ke(12);
          var19 = var18;
          stackIn_2_0 = (ke) (var19);

          if (!param7) {
            stackIn_3_0 = (ke) ((Object) stackIn_2_0);
            stackIn_3_1 = 0;
            break L0;
          } else {
            stackIn_3_0 = (ke) ((Object) stackIn_2_0);
            stackIn_3_1 = 1;
            break L0;
          }
        }
        L1: {
          stackIn_3_0.field_p = stackIn_3_1 != 0;
          var19.field_m = param2;
          stackIn_5_0 = (ke) (var19);

          if (!param0) {
            stackIn_6_0 = (ke) ((Object) stackIn_5_0);
            stackIn_6_1 = 0;
            break L1;
          } else {
            stackIn_6_0 = (ke) ((Object) stackIn_5_0);
            stackIn_6_1 = 1;
            break L1;
          }
        }
        L2: {
          L3: {
            stackIn_6_0.field_g = stackIn_6_1 != 0;
            if (param7) {
              break L3;
            } else {
              var19.a(new ec(1, gn.field_d, a.field_t), param5 + -32232);
              var19.a(new ec(2, b.field_Q, a.field_t), param5 ^ 32281);
              var19.a(new ec(3, oa.field_c, a.field_t), 117);
              if (var17 == 0) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          var19.a(new ec(13, mn.field_a, a.field_t), param5 ^ 32284);
          break L2;
        }
        L4: {
          var19.a(new ec(4, de.field_P, a.field_t), 117);
          if (!param3) {
            break L4;
          } else {
            var19.a(new ec(5, vb.field_T, a.field_t), 119);
            break L4;
          }
        }
        L5: {
          if (param5 == 32357) {
            break L5;
          } else {
            f.a(false, true, 98, true, false, 42, false, false);
            break L5;
          }
        }
        L6: {
          var9 = new ec(6, pm.field_c, a.field_t);
          var10 = new ec(7, fj.field_f, a.field_t);
          stackIn_16_0 = (ec) (var9);

          stackIn_16_1 = (ec) (var10);

          if (var10.field_n < var9.field_n) {
            stackIn_17_0 = (ec) ((Object) stackIn_16_0);
            stackIn_17_1 = (ec) ((Object) stackIn_16_1);
            stackIn_17_2 = var9.field_n;
            break L6;
          } else {
            stackIn_17_0 = (ec) ((Object) stackIn_16_0);
            stackIn_17_1 = (ec) ((Object) stackIn_16_1);
            stackIn_17_2 = var10.field_n;
            break L6;
          }
        }
        L7: {
          stackIn_17_1.field_n = stackIn_17_2;
          stackIn_17_0.field_n = stackIn_17_2;
          var19.a(var9, 125);
          var19.a(var10, 114);
          var11 = 1;
          if (!param7) {
            break L7;
          } else {
            if (eh.field_a > 0) {
              break L7;
            } else {
              var11 = 0;
              break L7;
            }
          }
        }
        L8: {
          if (var11 == 0) {
            break L8;
          } else {
            var19.a(new ec(8, re.field_w, a.field_t), 105);
            break L8;
          }
        }
        L9: {
          L10: {
            var12 = 116;
            if (param7) {
              break L10;
            } else {
              var19.a(new ec(19, ak.field_e, a.field_t), 108);
              var19.a(new ec(10, ul.field_b, a.field_t), 126);
              var19.a(new ec(9, u.field_g, a.field_t), 118);
              var19.a(new ec(11, mf.field_P, a.field_t), 108);
              var19.a(new ec(12, cf.field_j, a.field_t), 112);
              if (var17 == 0) {
                break L9;
              } else {
                break L10;
              }
            }
          }
          L11: {
            var13 = 0;
            var14 = jg.field_k.length;
            if (!fb.a(0, 10040319, o.field_g)) {
              break L11;
            } else {
              var13 += 2;
              var14 -= 2;
              break L11;
            }
          }
          L12: {
            var19.field_l = ka.a((byte) 114, var14, tf.field_cb) + var13;
            if (param0) {
              break L12;
            } else {
              var19.a(new ec(14, la.field_g, a.field_t), 99);
              if (var17 == 0) {
                break L9;
              } else {
                break L12;
              }
            }
          }
          L13: {
            var12 = 96;
            if (!param1) {
              break L13;
            } else {
              L14: {
                var19.a(new ec(15), 124);
                var12 = 86;
                var15 = a.field_t.a(kf.field_R);
                var16 = a.field_t.a(e.field_a);
                if (var16 > var15) {
                  var15 = var16;
                  break L14;
                } else {
                  break L14;
                }
              }
              L15: {
                var16 = a.field_t.a(pg.field_c);
                if (var15 >= var16) {
                  break L15;
                } else {
                  var15 = var16;
                  break L15;
                }
              }
              var19.field_f[-1 + var18.field_b.field_l].field_n = var15 - -46;
              var19.a(new ec(16, ab.field_a, a.field_t), 116);
              break L13;
            }
          }
          L16: {
            if (!param6) {
              break L16;
            } else {
              L17: {
                var19.a(new ec(17), 107);
                var15 = a.field_t.a(ji.field_c);
                var16 = a.field_t.a(ik.field_g);
                if (var15 >= var16) {
                  break L17;
                } else {
                  var15 = var16;
                  break L17;
                }
              }
              L18: {
                var16 = a.field_t.a(k.field_h);
                if (var16 <= var15) {
                  break L18;
                } else {
                  var15 = var16;
                  break L18;
                }
              }
              L19: {
                var16 = a.field_t.a(wj.field_Kb);
                if (var16 > var15) {
                  var15 = var16;
                  break L19;
                } else {
                  break L19;
                }
              }
              L20: {
                var16 = a.field_t.a(sc.field_h);
                if (var15 >= var16) {
                  break L20;
                } else {
                  var15 = var16;
                  break L20;
                }
              }
              L21: {
                var16 = a.field_t.a(rc.field_g);
                if (var16 > var15) {
                  var15 = var16;
                  break L21;
                } else {
                  break L21;
                }
              }
              L22: {
                var16 = a.field_t.a(ig.field_Xb);
                if (var15 < var16) {
                  var15 = var16;
                  break L22;
                } else {
                  break L22;
                }
              }
              L23: {
                var16 = a.field_t.a(di.field_E);
                if (var15 < var16) {
                  var15 = var16;
                  break L23;
                } else {
                  break L23;
                }
              }
              var19.field_f[-1 + var18.field_b.field_l].field_n = 46 + var15;
              break L16;
            }
          }
          var19.a(new ec(18, om.field_b, a.field_t), param5 + -32248);
          break L9;
        }
        L24: {
          var19.a(var12, 320, true, 53, 24);
          stackIn_60_0 = (ke) (var19);

          if (!param4) {
            stackIn_61_0 = (ke) ((Object) stackIn_60_0);
            stackIn_61_1 = 0;
            break L24;
          } else {
            stackIn_61_0 = (ke) ((Object) stackIn_60_0);
            stackIn_61_1 = 1;
            break L24;
          }
        }
        ((ke) (Object) stackIn_61_0).a(stackIn_61_1, false, -129);
        var19.j((byte) -7);
        return var19;
    }

    final static int a(lk param0, lk param1, int param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == -119) {
                break L1;
              } else {
                f.a(false, true, -83, false, false, 55, true, true);
                break L1;
              }
            }
            var4_int = ge.a(param0, param3 ^ -54);
            var5 = ge.a(param1, 40);
            if (2 + var4_int <= var5) {
              stackIn_11_0 = 3;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              L2: {
                if (param2 != 3) {
                  break L2;
                } else {
                  if (1 + var4_int <= var5) {
                    stackIn_9_0 = 3;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              stackIn_7_0 = var4_int;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("f.E(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    final static cd a(int param0, String param1) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        Object stackIn_9_0 = null;
        cd stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -11079) {
                break L1;
              } else {
                f.a(false, false, 6, true, true, -105, true, true);
                break L1;
              }
            }
            if (pa.field_V != ka.field_P) {
              L2: {
                if (ka.field_P != kl.field_z) {
                  break L2;
                } else {
                  if (param1.equals(pn.field_fb)) {
                    ka.field_P = uc.field_c;
                    stackIn_11_0 = je.field_b;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              je.field_b = null;
              ka.field_P = pa.field_V;
              pn.field_fb = param1;
              stackIn_9_0 = null;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("f.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (cd) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (cd) ((Object) stackIn_9_0);
          } else {
            return stackIn_11_0;
          }
        }
    }

    final static void d(int param0) {
        on.b((byte) -100);
        uj.a(kf.field_O, vh.field_e, ef.field_O[0].field_K, hn.field_a, nk.field_b, param0 ^ -110);
        if (param0 != 18) {
            f.a(79, true);
        }
    }

    public static void c(int param0) {
        field_q = null;
        field_p = null;
        field_v = null;
        field_r = null;
        if (param0 != 30061) {
            f.a(120);
        }
        field_o = null;
        field_w = null;
        field_s = null;
        field_n = null;
        field_x = null;
    }

    final static void a(int param0, boolean param1) {
        if (!(!ea.d((byte) 74))) {
            param1 = false;
        }
        ch.a(param1, 0);
        if (de.field_Z) {
            hk.d(je.field_f.field_h.field_vb, je.field_f.field_h.field_Ib, je.field_f.field_h.field_mb, je.field_f.field_h.field_N);
            je.field_f.field_h.a(param0 ^ 1141039776, param1);
        }
        ed.a((byte) 127, param1);
        if (param0 != 2) {
            f.a(123, false);
        }
    }

    f() {
        this.field_u = false;
    }

    final static String a(int param0) {
        if (pa.field_V == sh.field_d) {
          return te.field_q;
        } else {
          if (!jj.field_f.a(85)) {
            return jj.field_f.b((byte) 62);
          } else {
            if (ka.field_P == pa.field_V) {
              return jj.field_f.b((byte) 123);
            } else {
              if (param0 != 116) {
                return (String) null;
              } else {
                return hb.field_Ob;
              }
            }
          }
        }
    }

    static {
        field_r = new n();
        field_v = "The account name you use to access RuneScape and other Jagex.com games";
        field_x = "<%0> cannot join; the game has started.";
        field_p = "<%0> is already on your friend list.";
    }
}
