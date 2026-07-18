/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

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
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (param1 == 19) {
              L1: {
                var2_int = param0.d((byte) -40);
                if (var2_int != 1) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_7_0 = stackOut_4_0;
                  break L1;
                }
              }
              var3 = stackIn_7_0;
              stackOut_7_0 = var3;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("f.C(");
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L2;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ')');
        }
        return stackIn_8_0 != 0;
    }

    final static ke a(boolean param0, boolean param1, int param2, boolean param3, boolean param4, int param5, boolean param6, boolean param7) {
        RuntimeException var8 = null;
        ke var8_ref = null;
        ec var9 = null;
        ec var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        ec stackIn_14_0 = null;
        ec stackIn_14_1 = null;
        ec stackIn_16_0 = null;
        ec stackIn_16_1 = null;
        ec stackIn_17_0 = null;
        ec stackIn_17_1 = null;
        int stackIn_17_2 = 0;
        ke stackIn_70_0 = null;
        ke stackIn_72_0 = null;
        ke stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        ke stackIn_74_0 = null;
        RuntimeException decompiledCaughtException = null;
        ec stackOut_13_0 = null;
        ec stackOut_13_1 = null;
        ec stackOut_16_0 = null;
        ec stackOut_16_1 = null;
        int stackOut_16_2 = 0;
        ec stackOut_14_0 = null;
        ec stackOut_14_1 = null;
        int stackOut_14_2 = 0;
        ke stackOut_69_0 = null;
        ke stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        ke stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        ke stackOut_73_0 = null;
        var17 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var8_ref = new ke(12);
                var8_ref.field_p = param7;
                var8_ref.field_m = param2;
                var8_ref.field_g = param0;
                if (param7) {
                  break L2;
                } else {
                  var8_ref.a(new ec(1, gn.field_d, (mm) (Object) a.field_t), param5 + -32232);
                  var8_ref.a(new ec(2, b.field_Q, (mm) (Object) a.field_t), param5 ^ 32281);
                  var8_ref.a(new ec(3, oa.field_c, (mm) (Object) a.field_t), 117);
                  if (var17 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var8_ref.a(new ec(13, mn.field_a, (mm) (Object) a.field_t), param5 ^ 32284);
              break L1;
            }
            L3: {
              var8_ref.a(new ec(4, de.field_P, (mm) (Object) a.field_t), 117);
              if (!param3) {
                break L3;
              } else {
                var8_ref.a(new ec(5, vb.field_T, (mm) (Object) a.field_t), 119);
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
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              if (~var10.field_n > ~var9.field_n) {
                stackOut_16_0 = (ec) (Object) stackIn_16_0;
                stackOut_16_1 = (ec) (Object) stackIn_16_1;
                stackOut_16_2 = var9.field_n;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                stackIn_17_2 = stackOut_16_2;
                break L5;
              } else {
                stackOut_14_0 = (ec) (Object) stackIn_14_0;
                stackOut_14_1 = (ec) (Object) stackIn_14_1;
                stackOut_14_2 = var10.field_n;
                stackIn_17_0 = stackOut_14_0;
                stackIn_17_1 = stackOut_14_1;
                stackIn_17_2 = stackOut_14_2;
                break L5;
              }
            }
            L6: {
              stackIn_17_1.field_n = stackIn_17_2;
              stackIn_17_0.field_n = stackIn_17_2;
              var8_ref.a(var9, 125);
              var8_ref.a(var10, 114);
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
                var8_ref.a(new ec(8, re.field_w, (mm) (Object) a.field_t), 105);
                break L7;
              }
            }
            L8: {
              L9: {
                var12 = 116;
                if (param7) {
                  break L9;
                } else {
                  var8_ref.a(new ec(19, ak.field_e, (mm) (Object) a.field_t), 108);
                  var8_ref.a(new ec(10, ul.field_b, (mm) (Object) a.field_t), 126);
                  var8_ref.a(new ec(9, u.field_g, (mm) (Object) a.field_t), 118);
                  var8_ref.a(new ec(11, mf.field_P, (mm) (Object) a.field_t), 108);
                  var8_ref.a(new ec(12, cf.field_j, (mm) (Object) a.field_t), 112);
                  if (var17 == 0) {
                    break L8;
                  } else {
                    break L9;
                  }
                }
              }
              L10: {
                var13 = 0;
                var14 = jg.field_k.length;
                if (!fb.a(0, 10040319, o.field_g)) {
                  break L10;
                } else {
                  var13 += 2;
                  var14 -= 2;
                  break L10;
                }
              }
              L11: {
                var8_ref.field_l = ka.a((byte) 114, var14, tf.field_cb) + var13;
                if (param0) {
                  break L11;
                } else {
                  var8_ref.a(new ec(14, la.field_g, (mm) (Object) a.field_t), 99);
                  if (var17 == 0) {
                    break L8;
                  } else {
                    break L11;
                  }
                }
              }
              L12: {
                var12 = 96;
                if (!param1) {
                  break L12;
                } else {
                  L13: {
                    var8_ref.a(new ec(15), 124);
                    var12 = 86;
                    var15 = a.field_t.a(kf.field_R);
                    var16 = a.field_t.a(e.field_a);
                    if (var16 > var15) {
                      var15 = var16;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    var16 = a.field_t.a(pg.field_c);
                    if (~var15 <= ~var16) {
                      break L14;
                    } else {
                      var15 = var16;
                      break L14;
                    }
                  }
                  var8_ref.field_f[-1 + var8_ref.field_b.field_l].field_n = var15 - -46;
                  var8_ref.a(new ec(16, ab.field_a, (mm) (Object) a.field_t), 116);
                  break L12;
                }
              }
              L15: {
                if (!param6) {
                  break L15;
                } else {
                  L16: {
                    var8_ref.a(new ec(17), 107);
                    var15 = a.field_t.a(ji.field_c);
                    var16 = a.field_t.a(ik.field_g);
                    if (var15 >= var16) {
                      break L16;
                    } else {
                      var15 = var16;
                      break L16;
                    }
                  }
                  L17: {
                    var16 = a.field_t.a(k.field_h);
                    if (~var16 >= ~var15) {
                      break L17;
                    } else {
                      var15 = var16;
                      break L17;
                    }
                  }
                  L18: {
                    var16 = a.field_t.a(wj.field_Kb);
                    if (var16 > var15) {
                      var15 = var16;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    var16 = a.field_t.a(sc.field_h);
                    if (var15 >= var16) {
                      break L19;
                    } else {
                      var15 = var16;
                      break L19;
                    }
                  }
                  L20: {
                    var16 = a.field_t.a(rc.field_g);
                    if (~var16 < ~var15) {
                      var15 = var16;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L21: {
                    var16 = a.field_t.a(ig.field_Xb);
                    if (~var15 > ~var16) {
                      var15 = var16;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L22: {
                    var16 = a.field_t.a(di.field_E);
                    if (~var15 > ~var16) {
                      var15 = var16;
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                  var8_ref.field_f[-1 + var8_ref.field_b.field_l].field_n = 46 + var15;
                  break L15;
                }
              }
              var8_ref.a(new ec(18, om.field_b, (mm) (Object) a.field_t), param5 + -32248);
              break L8;
            }
            L23: {
              var8_ref.a(var12, 320, true, 53, 24);
              stackOut_69_0 = (ke) var8_ref;
              stackIn_72_0 = stackOut_69_0;
              stackIn_70_0 = stackOut_69_0;
              if (!param4) {
                stackOut_72_0 = (ke) (Object) stackIn_72_0;
                stackOut_72_1 = 0;
                stackIn_73_0 = stackOut_72_0;
                stackIn_73_1 = stackOut_72_1;
                break L23;
              } else {
                stackOut_70_0 = (ke) (Object) stackIn_70_0;
                stackOut_70_1 = 1;
                stackIn_73_0 = stackOut_70_0;
                stackIn_73_1 = stackOut_70_1;
                break L23;
              }
            }
            ((ke) (Object) stackIn_73_0).a(stackIn_73_1, false, -129);
            var8_ref.j((byte) -7);
            stackOut_73_0 = (ke) var8_ref;
            stackIn_74_0 = stackOut_73_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var8, "f.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        return stackIn_74_0;
    }

    final static int a(lk param0, lk param1, int param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
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
              stackOut_14_0 = 3;
              stackIn_15_0 = stackOut_14_0;
              break L0;
            } else {
              L2: {
                if (param2 != 3) {
                  break L2;
                } else {
                  if (1 + var4_int <= var5) {
                    stackOut_12_0 = 3;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_10_0 = var4_int;
              stackIn_11_0 = stackOut_10_0;
              return stackIn_11_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var4;
            stackOut_16_1 = new StringBuilder().append("f.E(");
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L3;
            }
          }
          L4: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L4;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L4;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_15_0;
    }

    final static cd a(int param0, String param1) {
        RuntimeException var2 = null;
        Object stackIn_5_0 = null;
        Object stackIn_11_0 = null;
        cd stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        cd stackOut_12_0 = null;
        Object stackOut_10_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
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
                    stackOut_12_0 = je.field_b;
                    stackIn_13_0 = stackOut_12_0;
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              je.field_b = null;
              ka.field_P = pa.field_V;
              pn.field_fb = param1;
              stackOut_10_0 = null;
              stackIn_11_0 = stackOut_10_0;
              return (cd) (Object) stackIn_11_0;
            } else {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (cd) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2;
            stackOut_14_1 = new StringBuilder().append("f.D(").append(param0).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L3;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
        return stackIn_13_0;
    }

    final static void d(int param0) {
        try {
            on.b((byte) -100);
            uj.a(kf.field_O, vh.field_e, ef.field_O[0].field_K, hn.field_a, nk.field_b, param0 ^ -110);
            if (param0 != 18) {
                f.a(79, true);
            }
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "f.H(" + param0 + ')');
        }
    }

    public static void c(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_q = null;
              field_p = null;
              field_v = null;
              field_r = null;
              if (param0 == 30061) {
                break L1;
              } else {
                String discarded$2 = f.a(120);
                break L1;
              }
            }
            field_o = null;
            field_w = null;
            field_s = null;
            field_n = null;
            field_x = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var1, "f.G(" + param0 + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (ea.d((byte) 74)) {
                param1 = false;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ch.a(param1, 0);
              if (!de.field_Z) {
                break L2;
              } else {
                hk.d(je.field_f.field_h.field_vb, je.field_f.field_h.field_Ib, je.field_f.field_h.field_mb, je.field_f.field_h.field_N);
                je.field_f.field_h.a(param0 ^ 1141039776, param1);
                break L2;
              }
            }
            L3: {
              ed.a((byte) 127, param1);
              if (param0 == 2) {
                break L3;
              } else {
                f.a(123, false);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "f.F(" + param0 + ',' + param1 + ')');
        }
    }

    f() {
        ((f) this).field_u = false;
    }

    final static String a(int param0) {
        RuntimeException var1 = null;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_14_0 = null;
        Object stackIn_17_0 = null;
        String stackIn_19_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_8_0 = null;
        String stackOut_13_0 = null;
        String stackOut_18_0 = null;
        Object stackOut_16_0 = null;
        try {
          L0: {
            if (pa.field_V == sh.field_d) {
              stackOut_3_0 = te.field_q;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (!jj.field_f.a(85)) {
                stackOut_8_0 = jj.field_f.b((byte) 62);
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              } else {
                if (ka.field_P == pa.field_V) {
                  stackOut_13_0 = jj.field_f.b((byte) 123);
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0;
                } else {
                  if (param0 == 116) {
                    stackOut_18_0 = hb.field_Ob;
                    stackIn_19_0 = stackOut_18_0;
                    break L0;
                  } else {
                    stackOut_16_0 = null;
                    stackIn_17_0 = stackOut_16_0;
                    return (String) (Object) stackIn_17_0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var1, "f.B(" + param0 + ')');
        }
        return stackIn_19_0;
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
