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

    final static boolean a(wl param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var2_int = param0.d((byte) -40);
              if (var2_int != 1) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            var3 = stackIn_5_0;
            stackOut_5_0 = var3;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2;
            stackOut_7_1 = new StringBuilder().append("f.C(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + 19 + 41);
        }
        return stackIn_6_0 != 0;
    }

    final static ke a(boolean param0, boolean param1, int param2, boolean param3, boolean param4, int param5, boolean param6, boolean param7) {
        ec var9 = null;
        ec var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        ke var18 = null;
        ke stackIn_1_0 = null;
        ke stackIn_2_0 = null;
        ke stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        ke stackIn_4_0 = null;
        ke stackIn_5_0 = null;
        ke stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        ec stackIn_14_0 = null;
        ec stackIn_14_1 = null;
        ec stackIn_15_0 = null;
        ec stackIn_15_1 = null;
        ec stackIn_16_0 = null;
        ec stackIn_16_1 = null;
        int stackIn_16_2 = 0;
        ke stackIn_56_0 = null;
        ke stackIn_57_0 = null;
        ke stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        ke stackOut_0_0 = null;
        ke stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        ke stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        ke stackOut_3_0 = null;
        ke stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        ke stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        ec stackOut_13_0 = null;
        ec stackOut_13_1 = null;
        ec stackOut_15_0 = null;
        ec stackOut_15_1 = null;
        int stackOut_15_2 = 0;
        ec stackOut_14_0 = null;
        ec stackOut_14_1 = null;
        int stackOut_14_2 = 0;
        ke stackOut_55_0 = null;
        ke stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        ke stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        L0: {
          var17 = client.field_A ? 1 : 0;
          var18 = new ke(12);
          stackOut_0_0 = (ke) var18;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param7) {
            stackOut_2_0 = (ke) (Object) stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (ke) (Object) stackIn_1_0;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          stackIn_3_0.field_p = stackIn_3_1 != 0;
          var18.field_m = param2;
          stackOut_3_0 = (ke) var18;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (!param0) {
            stackOut_5_0 = (ke) (Object) stackIn_5_0;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = (ke) (Object) stackIn_4_0;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          stackIn_6_0.field_g = stackIn_6_1 != 0;
          if (param7) {
            var18.a(new ec(13, mn.field_a, (mm) (Object) a.field_t), param5 ^ 32284);
            break L2;
          } else {
            var18.a(new ec(1, gn.field_d, (mm) (Object) a.field_t), param5 + -32232);
            var18.a(new ec(2, b.field_Q, (mm) (Object) a.field_t), param5 ^ 32281);
            var18.a(new ec(3, oa.field_c, (mm) (Object) a.field_t), 117);
            break L2;
          }
        }
        L3: {
          var18.a(new ec(4, de.field_P, (mm) (Object) a.field_t), 117);
          if (!param3) {
            break L3;
          } else {
            var18.a(new ec(5, vb.field_T, (mm) (Object) a.field_t), 119);
            break L3;
          }
        }
        L4: {
          if (param5 == 32357) {
            break L4;
          } else {
            ke discarded$2 = f.a(false, true, 98, true, false, 42, false, false);
            break L4;
          }
        }
        L5: {
          var9 = new ec(6, pm.field_c, (mm) (Object) a.field_t);
          var10 = new ec(7, fj.field_f, (mm) (Object) a.field_t);
          stackOut_13_0 = (ec) var9;
          stackOut_13_1 = (ec) var10;
          stackIn_15_0 = stackOut_13_0;
          stackIn_15_1 = stackOut_13_1;
          stackIn_14_0 = stackOut_13_0;
          stackIn_14_1 = stackOut_13_1;
          if (var10.field_n < var9.field_n) {
            stackOut_15_0 = (ec) (Object) stackIn_15_0;
            stackOut_15_1 = (ec) (Object) stackIn_15_1;
            stackOut_15_2 = var9.field_n;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            stackIn_16_2 = stackOut_15_2;
            break L5;
          } else {
            stackOut_14_0 = (ec) (Object) stackIn_14_0;
            stackOut_14_1 = (ec) (Object) stackIn_14_1;
            stackOut_14_2 = var10.field_n;
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_16_2 = stackOut_14_2;
            break L5;
          }
        }
        L6: {
          stackIn_16_1.field_n = stackIn_16_2;
          stackIn_16_0.field_n = stackIn_16_2;
          var18.a(var9, 125);
          var18.a(var10, 114);
          var11 = 1;
          if (!param7) {
            break L6;
          } else {
            if (eh.field_a > 0) {
              break L6;
            } else {
              var11 = 0;
              break L6;
            }
          }
        }
        L7: {
          if (var11 == 0) {
            break L7;
          } else {
            var18.a(new ec(8, re.field_w, (mm) (Object) a.field_t), 105);
            break L7;
          }
        }
        L8: {
          var12 = 116;
          if (param7) {
            L9: {
              var13 = 0;
              var14 = jg.field_k.length;
              if (!fb.a(0, 10040319, o.field_g)) {
                break L9;
              } else {
                var13 += 2;
                var14 -= 2;
                break L9;
              }
            }
            var18.field_l = ka.a((byte) 114, var14, tf.field_cb) + var13;
            if (param0) {
              L10: {
                var12 = 96;
                if (!param1) {
                  break L10;
                } else {
                  L11: {
                    var18.a(new ec(15), 124);
                    var12 = 86;
                    var15 = a.field_t.a(kf.field_R);
                    var16 = a.field_t.a(e.field_a);
                    if (var16 > var15) {
                      var15 = var16;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    var16 = a.field_t.a(pg.field_c);
                    if (var15 >= var16) {
                      break L12;
                    } else {
                      var15 = var16;
                      break L12;
                    }
                  }
                  var18.field_f[-1 + var18.field_b.field_l].field_n = var15 - -46;
                  var18.a(new ec(16, ab.field_a, (mm) (Object) a.field_t), 116);
                  break L10;
                }
              }
              L13: {
                if (!param6) {
                  break L13;
                } else {
                  L14: {
                    var18.a(new ec(17), 107);
                    var15 = a.field_t.a(ji.field_c);
                    var16 = a.field_t.a(ik.field_g);
                    if (var15 >= var16) {
                      break L14;
                    } else {
                      var15 = var16;
                      break L14;
                    }
                  }
                  L15: {
                    var16 = a.field_t.a(k.field_h);
                    if (var16 <= var15) {
                      break L15;
                    } else {
                      var15 = var16;
                      break L15;
                    }
                  }
                  L16: {
                    var16 = a.field_t.a(wj.field_Kb);
                    if (var16 > var15) {
                      var15 = var16;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  L17: {
                    var16 = a.field_t.a(sc.field_h);
                    if (var15 >= var16) {
                      break L17;
                    } else {
                      var15 = var16;
                      break L17;
                    }
                  }
                  L18: {
                    var16 = a.field_t.a(rc.field_g);
                    if (var16 > var15) {
                      var15 = var16;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    var16 = a.field_t.a(ig.field_Xb);
                    if (var15 < var16) {
                      var15 = var16;
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  L20: {
                    var16 = a.field_t.a(di.field_E);
                    if (var15 < var16) {
                      var15 = var16;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  var18.field_f[-1 + var18.field_b.field_l].field_n = 46 + var15;
                  break L13;
                }
              }
              var18.a(new ec(18, om.field_b, (mm) (Object) a.field_t), param5 + -32248);
              break L8;
            } else {
              var18.a(new ec(14, la.field_g, (mm) (Object) a.field_t), 99);
              break L8;
            }
          } else {
            var18.a(new ec(19, ak.field_e, (mm) (Object) a.field_t), 108);
            var18.a(new ec(10, ul.field_b, (mm) (Object) a.field_t), 126);
            var18.a(new ec(9, u.field_g, (mm) (Object) a.field_t), 118);
            var18.a(new ec(11, mf.field_P, (mm) (Object) a.field_t), 108);
            var18.a(new ec(12, cf.field_j, (mm) (Object) a.field_t), 112);
            break L8;
          }
        }
        L21: {
          var18.a(var12, 320, true, 53, 24);
          stackOut_55_0 = (ke) var18;
          stackIn_57_0 = stackOut_55_0;
          stackIn_56_0 = stackOut_55_0;
          if (!param4) {
            stackOut_57_0 = (ke) (Object) stackIn_57_0;
            stackOut_57_1 = 0;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            break L21;
          } else {
            stackOut_56_0 = (ke) (Object) stackIn_56_0;
            stackOut_56_1 = 1;
            stackIn_58_0 = stackOut_56_0;
            stackIn_58_1 = stackOut_56_1;
            break L21;
          }
        }
        ((ke) (Object) stackIn_58_0).a(stackIn_58_1, false, -129);
        var18.j((byte) -7);
        return var18;
    }

    final static int a(lk param0, lk param1, int param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (param3 == -119) {
                break L1;
              } else {
                ke discarded$2 = f.a(false, true, -83, false, false, 55, true, true);
                break L1;
              }
            }
            var4_int = ge.a(param0, param3 ^ -54);
            var5 = ge.a(param1, 40);
            if (2 + var4_int <= var5) {
              stackOut_10_0 = 3;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              L2: {
                if (param2 != 3) {
                  break L2;
                } else {
                  if (1 + var4_int <= var5) {
                    stackOut_8_0 = 3;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_6_0 = var4_int;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("f.E(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          L4: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_11_0;
    }

    final static cd a(int param0, String param1) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        Object stackIn_9_0 = null;
        cd stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        cd stackOut_10_0 = null;
        Object stackOut_8_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -11079) {
                break L1;
              } else {
                ke discarded$2 = f.a(false, false, 6, true, true, -105, true, true);
                break L1;
              }
            }
            if (pa.field_V != ka.field_P) {
              L2: {
                if (ka.field_P != kl.field_z) {
                  break L2;
                } else {
                  if (param1.equals((Object) (Object) pn.field_fb)) {
                    ka.field_P = uc.field_c;
                    stackOut_10_0 = je.field_b;
                    stackIn_11_0 = stackOut_10_0;
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              je.field_b = null;
              ka.field_P = pa.field_V;
              pn.field_fb = param1;
              stackOut_8_0 = null;
              stackIn_9_0 = stackOut_8_0;
              return (cd) (Object) stackIn_9_0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (cd) (Object) stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("f.D(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_11_0;
    }

    final static void d() {
        int discarded$0 = -100;
        on.b();
        int discarded$1 = -128;
        uj.a(kf.field_O, vh.field_e, ef.field_O[0].field_K, hn.field_a, nk.field_b);
    }

    public static void c() {
        field_q = null;
        field_p = null;
        field_v = null;
        field_r = null;
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
        int discarded$4 = 0;
        ch.a(param1);
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
        ((f) this).field_u = false;
    }

    final static String a() {
        if (!(pa.field_V != sh.field_d)) {
            return te.field_q;
        }
        if (!(jj.field_f.a(85))) {
            return jj.field_f.b((byte) 62);
        }
        if (!(ka.field_P != pa.field_V)) {
            return jj.field_f.b((byte) 123);
        }
        return hb.field_Ob;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new n();
        field_v = "The account name you use to access RuneScape and other Jagex.com games";
        field_x = "<%0> cannot join; the game has started.";
        field_p = "<%0> is already on your friend list.";
    }
}
