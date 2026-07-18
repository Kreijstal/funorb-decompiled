/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak extends jc {
    static boolean field_A;
    byte[] field_w;
    int field_y;
    static bi field_x;
    static fm field_v;
    ua field_B;
    static bi field_z;

    public static void h(int param0) {
        field_z = null;
        field_v = null;
        field_x = null;
        int var1 = 100 % ((-56 - param0) / 52);
    }

    final static void a(int param0, int param1, wa param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        wa var5 = null;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        Object stackIn_6_2 = null;
        int stackIn_6_3 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        Object stackIn_7_2 = null;
        int stackIn_7_3 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        Object stackIn_8_2 = null;
        int stackIn_8_3 = 0;
        int stackIn_8_4 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        Object stackOut_5_2 = null;
        int stackOut_5_3 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        Object stackOut_7_2 = null;
        int stackOut_7_3 = 0;
        int stackOut_7_4 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        Object stackOut_6_2 = null;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 <= 0) {
                break L1;
              } else {
                if (param2.field_h <= param0) {
                  break L1;
                } else {
                  L2: {
                    stackOut_5_0 = param2.field_a;
                    stackOut_5_1 = param2.field_a * (param0 - 1) + param2.field_f;
                    stackOut_5_2 = null;
                    stackOut_5_3 = param2.field_f + param0 * param2.field_a;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    stackIn_7_2 = stackOut_5_2;
                    stackIn_7_3 = stackOut_5_3;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    stackIn_6_2 = stackOut_5_2;
                    stackIn_6_3 = stackOut_5_3;
                    if (2147483647 == param2.field_h) {
                      stackOut_7_0 = stackIn_7_0;
                      stackOut_7_1 = stackIn_7_1;
                      stackOut_7_2 = stackIn_7_2;
                      stackOut_7_3 = stackIn_7_3;
                      stackOut_7_4 = param2.field_h;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      stackIn_8_2 = stackOut_7_2;
                      stackIn_8_3 = stackOut_7_3;
                      stackIn_8_4 = stackOut_7_4;
                      break L2;
                    } else {
                      stackOut_6_0 = stackIn_6_0;
                      stackOut_6_1 = stackIn_6_1;
                      stackOut_6_2 = stackIn_6_2;
                      stackOut_6_3 = stackIn_6_3;
                      stackOut_6_4 = -param0 + param2.field_h;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      stackIn_8_2 = stackOut_6_2;
                      stackIn_8_3 = stackOut_6_3;
                      stackIn_8_4 = stackOut_6_4;
                      break L2;
                    }
                  }
                  int discarded$1 = -3903;
                  var5 = wi.a(stackIn_8_0, stackIn_8_1, (wa) (Object) stackIn_8_2, stackIn_8_3, stackIn_8_4, param2.field_g + param0);
                  param2.field_h = param0;
                  L3: while (true) {
                    L4: {
                      if (param2.field_c == null) {
                        break L4;
                      } else {
                        L5: {
                          if (param2.field_c.field_g < var5.field_g) {
                            break L5;
                          } else {
                            if (param2.field_c.field_g != var5.field_g) {
                              break L4;
                            } else {
                              if (param2.field_c.field_h <= var5.field_h) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        param2 = param2.field_c;
                        continue L3;
                      }
                    }
                    var5.field_c = param2.field_c;
                    param2.field_c = var5;
                    break L0;
                  }
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3;
            stackOut_18_1 = new StringBuilder().append("ak.K(").append(param0).append(',').append(0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw r.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
    }

    final static void a(bc param0, byte param1, boolean param2, bc param3) {
        try {
            int var4_int = 28;
            ba.a(n.field_o, dm.field_h, 124, fg.field_b, se.field_m, mc.field_o, l.field_a, oh.field_a, param2, (nq) (Object) ul.field_xb, ii.field_u, gn.field_w);
            bh.field_m = ae.a(93, "lobby", param3, "chatfilter");
            jf.field_d[1] = gm.field_o;
            jf.field_d[0] = bf.field_b;
            jf.field_d[2] = ue.field_d;
            ne.a(param0, (byte) -64, (nq) (Object) ge.field_p);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "ak.I(" + (param0 != null ? "{...}" : "null") + ',' + -81 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void f() {
        L0: {
          if (di.field_m == 0) {
            sg.a(true, false, 50, vr.field_d, tk.field_C);
            break L0;
          } else {
            break L0;
          }
        }
        int fieldTemp$2 = di.field_m + 1;
        di.field_m = di.field_m + 1;
        if (fieldTemp$2 == 750) {
          jc.a(4, (byte) 122);
          return;
        } else {
          return;
        }
    }

    final int e(int param0) {
        if (!(!((ak) this).field_u)) {
            return 0;
        }
        if (param0 != 0) {
            ((ak) this).field_w = null;
            return 100;
        }
        return 100;
    }

    final static boolean a(boolean param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        if (!ol.a(-126)) {
            return param3;
        }
        o.a(param3, param6, false, param2);
        if (null == hp.field_m) {
            jl.a(-21, param3, param6);
            nf.a(-126, param4, param3);
            param3 = false;
            return param3;
        }
        if (!hp.field_m.a(param6, param1, -16, param5, param3)) {
            jl.a(-21, param3, param6);
            nf.a(-126, param4, param3);
            param3 = false;
            return param3;
        }
        ai.a(3);
        param3 = false;
        jl.a(-21, param3, param6);
        nf.a(-126, param4, param3);
        param3 = false;
        return param3;
    }

    final static void c(int param0, int param1) {
        int var2 = 0;
        wm.field_b = param1;
        if (jh.field_B != null) {
          L0: {
            jh.field_B.c(598, param1);
            if (null != u.field_b) {
              u.field_b.a(param1, 0);
              break L0;
            } else {
              break L0;
            }
          }
          var2 = -9 / ((62 - param0) / 62);
          return;
        } else {
          L1: {
            if (null != u.field_b) {
              u.field_b.a(param1, 0);
              break L1;
            } else {
              break L1;
            }
          }
          var2 = -9 / ((62 - param0) / 62);
          return;
        }
    }

    final static void i() {
        int var2 = 0;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        if (qa.field_t > 0) {
          qa.field_t = qa.field_t - 1;
          if (qa.field_t <= 0) {
            if (bc.field_b <= 0) {
              L0: {
                if (ee.field_k > 0) {
                  qo.a(22353, ee.field_k);
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            } else {
              L1: {
                qo.a(22353, bc.field_b);
                if (ee.field_k > 0) {
                  qo.a(22353, ee.field_k);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            }
          } else {
            int discarded$4 = 438;
            nj.a();
            if (bc.field_b <= 0) {
              L2: {
                if (ee.field_k > 0) {
                  qo.a(22353, ee.field_k);
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            } else {
              L3: {
                qo.a(22353, bc.field_b);
                if (ee.field_k > 0) {
                  qo.a(22353, ee.field_k);
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            }
          }
        } else {
          if (bc.field_b <= 0) {
            if (ee.field_k > 0) {
              ee.field_k = ee.field_k - 1;
              if (qa.field_t <= 0) {
                if (bc.field_b <= 0) {
                  L4: {
                    if (ee.field_k > 0) {
                      qo.a(22353, ee.field_k);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  return;
                } else {
                  L5: {
                    qo.a(22353, bc.field_b);
                    if (ee.field_k > 0) {
                      qo.a(22353, ee.field_k);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  return;
                }
              } else {
                int discarded$5 = 438;
                nj.a();
                if (bc.field_b <= 0) {
                  L6: {
                    if (ee.field_k > 0) {
                      qo.a(22353, ee.field_k);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  return;
                } else {
                  L7: {
                    qo.a(22353, bc.field_b);
                    if (ee.field_k > 0) {
                      qo.a(22353, ee.field_k);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  return;
                }
              }
            } else {
              if (qa.field_t <= 0) {
                if (bc.field_b <= 0) {
                  L8: {
                    if (ee.field_k > 0) {
                      qo.a(22353, ee.field_k);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  return;
                } else {
                  L9: {
                    qo.a(22353, bc.field_b);
                    if (ee.field_k > 0) {
                      qo.a(22353, ee.field_k);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  return;
                }
              } else {
                int discarded$6 = 438;
                nj.a();
                if (bc.field_b <= 0) {
                  L10: {
                    if (ee.field_k > 0) {
                      qo.a(22353, ee.field_k);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  return;
                } else {
                  L11: {
                    qo.a(22353, bc.field_b);
                    if (ee.field_k > 0) {
                      qo.a(22353, ee.field_k);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  return;
                }
              }
            }
          } else {
            bc.field_b = bc.field_b - 1;
            if (qa.field_t > 0) {
              int discarded$7 = 438;
              nj.a();
              if (bc.field_b > 0) {
                L12: {
                  qo.a(22353, bc.field_b);
                  if (ee.field_k > 0) {
                    qo.a(22353, ee.field_k);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                return;
              } else {
                L13: {
                  if (ee.field_k > 0) {
                    qo.a(22353, ee.field_k);
                    break L13;
                  } else {
                    break L13;
                  }
                }
                return;
              }
            } else {
              if (bc.field_b <= 0) {
                L14: {
                  if (ee.field_k > 0) {
                    qo.a(22353, ee.field_k);
                    break L14;
                  } else {
                    break L14;
                  }
                }
                return;
              } else {
                L15: {
                  qo.a(22353, bc.field_b);
                  if (ee.field_k > 0) {
                    qo.a(22353, ee.field_k);
                    break L15;
                  } else {
                    break L15;
                  }
                }
                return;
              }
            }
          }
        }
    }

    final static int a(int param0, CharSequence param1, char param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var4 = param1.length();
            var5 = 0;
            L1: while (true) {
              if (var4 <= var5) {
                var6 = 0;
                stackOut_8_0 = var3_int;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                L2: {
                  if (param1.charAt(var5) != param2) {
                    var5++;
                    break L2;
                  } else {
                    var3_int++;
                    break L2;
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("ak.Q(").append(-116).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param2 + ')');
        }
        return stackIn_9_0;
    }

    ak() {
    }

    final byte[] e(byte param0) {
        if (param0 <= 48) {
            ((ak) this).field_y = -105;
            if (!(!((ak) this).field_u)) {
                throw new RuntimeException();
            }
            return ((ak) this).field_w;
        }
        if (!(!((ak) this).field_u)) {
            throw new RuntimeException();
        }
        return ((ak) this).field_w;
    }

    final static void a(int[] param0, int param1, Object[] param2) {
        try {
            int var3_int = 105 / ((param1 - 42) / 55);
            lr.a(0, param0.length - 1, param0, (byte) 78, param2);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "ak.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
