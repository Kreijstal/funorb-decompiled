/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el extends wi {
    private bi field_z;
    dd field_w;
    private boolean field_x;
    static sf field_C;
    static dd[] field_s;
    private int field_q;
    private dd field_y;
    private bi field_v;
    static String field_B;
    private bi field_u;
    boolean field_r;
    int field_A;
    int field_t;

    final static void a(String param0, byte param1) {
        try {
            ae.a(109, param0);
            wf.a(ll.field_o, false, false);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "el.F(" + (param0 != null ? "{...}" : "null") + ',' + 126 + ')');
        }
    }

    public static void d(int param0) {
        field_B = null;
        field_C = null;
        field_s = null;
    }

    final static boolean b(byte param0) {
        int var1 = 0;
        var1 = -14 % ((param0 - 73) / 47);
        if (sg.field_h != null) {
          if (!rh.field_k.b(0)) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static void a(java.applet.Applet param0, int param1, byte param2, int param3, String[] param4, int param5) {
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var8 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              pi.field_e = param0.getParameter("overxgames");
              if (null == pi.field_e) {
                pi.field_e = "0";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              id.field_i = param0.getParameter("overxachievements");
              if (id.field_i == null) {
                id.field_i = "0";
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var6 = param0.getParameter("currency");
              if (var6 == null) {
                di.field_d = 2;
                break L3;
              } else {
                if (ii.a(12969, (CharSequence) (Object) var6)) {
                  di.field_d = pl.a((CharSequence) (Object) var6, -9816);
                  break L3;
                } else {
                  di.field_d = 2;
                  break L3;
                }
              }
            }
            fi.field_j = 1052688;
            rc.field_e = 15488514;
            pb.field_i = 150;
            of.field_h = new dd[param4.length];
            var7 = 0;
            L4: while (true) {
              if (param4.length <= var7) {
                vg.field_u = param4;
                break L0;
              } else {
                of.field_h[var7] = new dd(317, 34);
                var7++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var6_ref;
            stackOut_18_1 = new StringBuilder().append("el.D(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          L6: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(150).append(',').append(44).append(',').append(15488514).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param4 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + 1052688 + ')');
        }
    }

    final void c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var2 = ((el) this).field_l;
          var3 = 0;
          if (((el) this).field_v != null) {
            var3 = var3 + ((el) this).field_v.field_e;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (((el) this).field_u == null) {
            break L1;
          } else {
            var3 = var3 + ((el) this).field_u.field_e;
            break L1;
          }
        }
        L2: {
          if (((el) this).field_v == null) {
            break L2;
          } else {
            ((el) this).field_v.a(var2, ((el) this).field_a);
            var2 = var2 + ((el) this).field_v.field_c;
            break L2;
          }
        }
        ((el) this).field_z.a(var2, ((el) this).field_a, -var3 + ((el) this).field_n, ((el) this).field_z.field_d);
        var2 = var2 + (-var3 + ((el) this).field_n);
        if (null == ((el) this).field_u) {
          var4 = (-((el) this).field_q + ((el) this).field_A) * ((el) this).field_n / (((el) this).field_t + -((el) this).field_q);
          if (param0 == 72) {
            if (((el) this).field_r) {
              if (((el) this).field_w == null) {
                ((el) this).field_y.c(((el) this).field_l + (var4 + -(((el) this).field_y.field_w / 8)), -(((el) this).field_y.field_t / 8) + ((el) this).field_a);
                return;
              } else {
                ((el) this).field_w.d(var4 + (((el) this).field_l - ((el) this).field_w.field_w / 2), -(((el) this).field_w.field_t / 2) + ((el) this).field_a);
                return;
              }
            } else {
              ((el) this).field_y.c(((el) this).field_l + (var4 + -(((el) this).field_y.field_w / 8)), -(((el) this).field_y.field_t / 8) + ((el) this).field_a);
              return;
            }
          } else {
            ((el) this).field_t = 37;
            if (((el) this).field_r) {
              if (((el) this).field_w == null) {
                ((el) this).field_y.c(((el) this).field_l + (var4 + -(((el) this).field_y.field_w / 8)), -(((el) this).field_y.field_t / 8) + ((el) this).field_a);
                return;
              } else {
                ((el) this).field_w.d(var4 + (((el) this).field_l - ((el) this).field_w.field_w / 2), -(((el) this).field_w.field_t / 2) + ((el) this).field_a);
                return;
              }
            } else {
              ((el) this).field_y.c(((el) this).field_l + (var4 + -(((el) this).field_y.field_w / 8)), -(((el) this).field_y.field_t / 8) + ((el) this).field_a);
              return;
            }
          }
        } else {
          ((el) this).field_u.a(var2, ((el) this).field_a);
          var4 = (-((el) this).field_q + ((el) this).field_A) * ((el) this).field_n / (((el) this).field_t + -((el) this).field_q);
          if (param0 != 72) {
            ((el) this).field_t = 37;
            if (((el) this).field_r) {
              if (((el) this).field_w == null) {
                ((el) this).field_y.c(((el) this).field_l + (var4 + -(((el) this).field_y.field_w / 8)), -(((el) this).field_y.field_t / 8) + ((el) this).field_a);
                return;
              } else {
                ((el) this).field_w.d(var4 + (((el) this).field_l - ((el) this).field_w.field_w / 2), -(((el) this).field_w.field_t / 2) + ((el) this).field_a);
                return;
              }
            } else {
              ((el) this).field_y.c(((el) this).field_l + (var4 + -(((el) this).field_y.field_w / 8)), -(((el) this).field_y.field_t / 8) + ((el) this).field_a);
              return;
            }
          } else {
            L3: {
              L4: {
                if (!((el) this).field_r) {
                  break L4;
                } else {
                  if (((el) this).field_w != null) {
                    ((el) this).field_w.d(var4 + (((el) this).field_l - ((el) this).field_w.field_w / 2), -(((el) this).field_w.field_t / 2) + ((el) this).field_a);
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              ((el) this).field_y.c(((el) this).field_l + (var4 + -(((el) this).field_y.field_w / 8)), -(((el) this).field_y.field_t / 8) + ((el) this).field_a);
              break L3;
            }
            return;
          }
        }
    }

    final boolean a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_57_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        L0: {
          var2 = 0;
          var3 = ((el) this).field_l;
          var4 = 0;
          if (null != ((el) this).field_v) {
            var4 = var4 + ((el) this).field_v.field_e;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (null == ((el) this).field_u) {
            break L1;
          } else {
            var4 = var4 + ((el) this).field_u.field_e;
            break L1;
          }
        }
        L2: {
          if (null == ((el) this).field_v) {
            break L2;
          } else {
            var2 = var2 != 0 | ((el) this).field_v.b(var3, ((el) this).field_a, ag.field_f, kc.field_b) ? 1 : 0;
            var3 = var3 + ((el) this).field_v.field_c;
            break L2;
          }
        }
        if (param0 > 67) {
          stackOut_35_0 = var2;
          stackIn_40_0 = stackOut_35_0;
          stackIn_36_0 = stackOut_35_0;
          if (ag.field_f < var3) {
            stackOut_40_0 = stackIn_40_0;
            stackIn_45_0 = stackOut_40_0;
            stackIn_41_0 = stackOut_40_0;
            if (kc.field_b < ((el) this).field_a) {
              stackOut_45_0 = stackIn_45_0;
              stackIn_52_0 = stackOut_45_0;
              stackIn_46_0 = stackOut_45_0;
              if (-var4 + ((el) this).field_n < ag.field_f) {
                stackOut_52_0 = stackIn_52_0;
                stackIn_57_0 = stackOut_52_0;
                stackIn_53_0 = stackOut_52_0;
                if (((el) this).field_z.field_d >= kc.field_b) {
                  L3: {
                    var2 = stackIn_57_0 | 1;
                    var3 = var3 + (((el) this).field_n - var4);
                    if (null != ((el) this).field_u) {
                      var2 = var2 != 0 | ((el) this).field_u.b(var3, ((el) this).field_a, ag.field_f, kc.field_b) ? 1 : 0;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  return var2 != 0;
                } else {
                  L4: {
                    var2 = stackIn_53_0;
                    var3 = var3 + (((el) this).field_n - var4);
                    if (null != ((el) this).field_u) {
                      var2 = var2 != 0 | ((el) this).field_u.b(var3, ((el) this).field_a, ag.field_f, kc.field_b) ? 1 : 0;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  return var2 != 0;
                }
              } else {
                stackOut_46_0 = stackIn_46_0;
                stackOut_46_1 = 1;
                stackIn_48_0 = stackOut_46_0;
                stackIn_48_1 = stackOut_46_1;
                L5: {
                  var2 = stackIn_48_0 | stackIn_48_1;
                  var3 = var3 + (((el) this).field_n - var4);
                  if (null != ((el) this).field_u) {
                    var2 = var2 != 0 | ((el) this).field_u.b(var3, ((el) this).field_a, ag.field_f, kc.field_b) ? 1 : 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                return var2 != 0;
              }
            } else {
              L6: {
                var2 = stackIn_41_0 | 1;
                var3 = var3 + (((el) this).field_n - var4);
                if (null != ((el) this).field_u) {
                  var2 = var2 != 0 | ((el) this).field_u.b(var3, ((el) this).field_a, ag.field_f, kc.field_b) ? 1 : 0;
                  break L6;
                } else {
                  break L6;
                }
              }
              return var2 != 0;
            }
          } else {
            L7: {
              var2 = stackIn_36_0 | 1;
              var3 = var3 + (((el) this).field_n - var4);
              if (null != ((el) this).field_u) {
                var2 = var2 != 0 | ((el) this).field_u.b(var3, ((el) this).field_a, ag.field_f, kc.field_b) ? 1 : 0;
                break L7;
              } else {
                break L7;
              }
            }
            return var2 != 0;
          }
        } else {
          ((el) this).field_z = null;
          stackOut_8_0 = var2;
          stackIn_13_0 = stackOut_8_0;
          stackIn_9_0 = stackOut_8_0;
          if (ag.field_f < var3) {
            stackOut_13_0 = stackIn_13_0;
            stackIn_18_0 = stackOut_13_0;
            stackIn_14_0 = stackOut_13_0;
            if (kc.field_b < ((el) this).field_a) {
              stackOut_18_0 = stackIn_18_0;
              stackIn_25_0 = stackOut_18_0;
              stackIn_19_0 = stackOut_18_0;
              if (-var4 + ((el) this).field_n < ag.field_f) {
                stackOut_25_0 = stackIn_25_0;
                stackIn_30_0 = stackOut_25_0;
                stackIn_26_0 = stackOut_25_0;
                if (((el) this).field_z.field_d >= kc.field_b) {
                  L8: {
                    var2 = stackIn_30_0 | 1;
                    var3 = var3 + (((el) this).field_n - var4);
                    if (null != ((el) this).field_u) {
                      var2 = var2 != 0 | ((el) this).field_u.b(var3, ((el) this).field_a, ag.field_f, kc.field_b) ? 1 : 0;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  return var2 != 0;
                } else {
                  L9: {
                    var2 = stackIn_26_0;
                    var3 = var3 + (((el) this).field_n - var4);
                    if (null != ((el) this).field_u) {
                      var2 = var2 != 0 | ((el) this).field_u.b(var3, ((el) this).field_a, ag.field_f, kc.field_b) ? 1 : 0;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  return var2 != 0;
                }
              } else {
                stackOut_19_0 = stackIn_19_0;
                stackOut_19_1 = 1;
                stackIn_21_0 = stackOut_19_0;
                stackIn_21_1 = stackOut_19_1;
                L10: {
                  var2 = stackIn_21_0 | stackIn_21_1;
                  var3 = var3 + (((el) this).field_n - var4);
                  if (null != ((el) this).field_u) {
                    var2 = var2 != 0 | ((el) this).field_u.b(var3, ((el) this).field_a, ag.field_f, kc.field_b) ? 1 : 0;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                return var2 != 0;
              }
            } else {
              L11: {
                var2 = stackIn_14_0 | 1;
                var3 = var3 + (((el) this).field_n - var4);
                if (null != ((el) this).field_u) {
                  var2 = var2 != 0 | ((el) this).field_u.b(var3, ((el) this).field_a, ag.field_f, kc.field_b) ? 1 : 0;
                  break L11;
                } else {
                  break L11;
                }
              }
              return var2 != 0;
            }
          } else {
            L12: {
              var2 = stackIn_9_0 | 1;
              var3 = var3 + (((el) this).field_n - var4);
              if (null != ((el) this).field_u) {
                var2 = var2 != 0 | ((el) this).field_u.b(var3, ((el) this).field_a, ag.field_f, kc.field_b) ? 1 : 0;
                break L12;
              } else {
                break L12;
              }
            }
            return var2 != 0;
          }
        }
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = fleas.field_A ? 1 : 0;
        if (param0 < 20) {
          boolean discarded$1 = el.b((byte) 72);
          if (((el) this).field_k) {
            if (((el) this).field_r) {
              L0: {
                if (null == ((el) this).field_w) {
                  var2 = ((el) this).field_y.field_t / 4;
                  break L0;
                } else {
                  var2 = ((el) this).field_w.field_t;
                  break L0;
                }
              }
              L1: {
                if (0 != jk.field_r) {
                  break L1;
                } else {
                  if (kc.field_f == 0) {
                    L2: {
                      ((el) this).field_g = false;
                      ((el) this).field_x = false;
                      if (((el) this).field_A < ((el) this).field_q) {
                        ((el) this).field_A = ((el) this).field_q;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    if (((el) this).field_A <= ((el) this).field_t) {
                      return;
                    } else {
                      ((el) this).field_A = ((el) this).field_t;
                      return;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              if (((el) this).field_x) {
                if (!((el) this).field_x) {
                  if (kc.field_b > ((el) this).field_a - (var2 / 2 + -var2)) {
                    L3: {
                      ((el) this).field_g = false;
                      if (((el) this).field_A < ((el) this).field_q) {
                        ((el) this).field_A = ((el) this).field_q;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    if (((el) this).field_A > ((el) this).field_t) {
                      ((el) this).field_A = ((el) this).field_t;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    L4: {
                      var3 = ag.field_f - ((el) this).field_l;
                      if (((el) this).field_x) {
                        break L4;
                      } else {
                        if (0 <= var3) {
                          if (((el) this).field_n >= var3) {
                            break L4;
                          } else {
                            ((el) this).field_g = false;
                            return;
                          }
                        } else {
                          ((el) this).field_g = false;
                          return;
                        }
                      }
                    }
                    L5: {
                      var3 = var3 + (((el) this).field_n / (-((el) this).field_q + ((el) this).field_t) >> 1);
                      ((el) this).field_x = true;
                      ((el) this).field_A = (((el) this).field_t - ((el) this).field_q) * var3 / ((el) this).field_n + ((el) this).field_q;
                      ((el) this).field_g = true;
                      if (((el) this).field_A < ((el) this).field_q) {
                        ((el) this).field_A = ((el) this).field_q;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    if (((el) this).field_A > ((el) this).field_t) {
                      ((el) this).field_A = ((el) this).field_t;
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  L6: {
                    var3 = ag.field_f - ((el) this).field_l;
                    if (((el) this).field_x) {
                      break L6;
                    } else {
                      if (0 <= var3) {
                        if (((el) this).field_n >= var3) {
                          break L6;
                        } else {
                          ((el) this).field_g = false;
                          return;
                        }
                      } else {
                        ((el) this).field_g = false;
                        return;
                      }
                    }
                  }
                  L7: {
                    var3 = var3 + (((el) this).field_n / (-((el) this).field_q + ((el) this).field_t) >> 1);
                    ((el) this).field_x = true;
                    ((el) this).field_A = (((el) this).field_t - ((el) this).field_q) * var3 / ((el) this).field_n + ((el) this).field_q;
                    ((el) this).field_g = true;
                    if (((el) this).field_A < ((el) this).field_q) {
                      ((el) this).field_A = ((el) this).field_q;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  if (((el) this).field_A <= ((el) this).field_t) {
                    return;
                  } else {
                    ((el) this).field_A = ((el) this).field_t;
                    return;
                  }
                }
              } else {
                if (kc.field_b < -(var2 / 2) + ((el) this).field_a) {
                  L8: {
                    ((el) this).field_g = false;
                    if (((el) this).field_A < ((el) this).field_q) {
                      ((el) this).field_A = ((el) this).field_q;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  if (((el) this).field_A > ((el) this).field_t) {
                    ((el) this).field_A = ((el) this).field_t;
                    return;
                  } else {
                    return;
                  }
                } else {
                  L9: {
                    if (((el) this).field_x) {
                      break L9;
                    } else {
                      if (kc.field_b <= ((el) this).field_a - (var2 / 2 + -var2)) {
                        break L9;
                      } else {
                        L10: {
                          ((el) this).field_g = false;
                          if (((el) this).field_A < ((el) this).field_q) {
                            ((el) this).field_A = ((el) this).field_q;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        L11: {
                          if (((el) this).field_A <= ((el) this).field_t) {
                            break L11;
                          } else {
                            ((el) this).field_A = ((el) this).field_t;
                            break L11;
                          }
                        }
                        return;
                      }
                    }
                  }
                  var3 = ag.field_f - ((el) this).field_l;
                  if (!((el) this).field_x) {
                    if (0 <= var3) {
                      if (((el) this).field_n >= var3) {
                        L12: {
                          var3 = var3 + (((el) this).field_n / (-((el) this).field_q + ((el) this).field_t) >> 1);
                          ((el) this).field_x = true;
                          ((el) this).field_A = (((el) this).field_t - ((el) this).field_q) * var3 / ((el) this).field_n + ((el) this).field_q;
                          ((el) this).field_g = true;
                          if (((el) this).field_A < ((el) this).field_q) {
                            ((el) this).field_A = ((el) this).field_q;
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        L13: {
                          if (((el) this).field_A <= ((el) this).field_t) {
                            break L13;
                          } else {
                            ((el) this).field_A = ((el) this).field_t;
                            break L13;
                          }
                        }
                        return;
                      } else {
                        ((el) this).field_g = false;
                        return;
                      }
                    } else {
                      ((el) this).field_g = false;
                      return;
                    }
                  } else {
                    L14: {
                      var3 = var3 + (((el) this).field_n / (-((el) this).field_q + ((el) this).field_t) >> 1);
                      ((el) this).field_x = true;
                      ((el) this).field_A = (((el) this).field_t - ((el) this).field_q) * var3 / ((el) this).field_n + ((el) this).field_q;
                      ((el) this).field_g = true;
                      if (((el) this).field_A < ((el) this).field_q) {
                        ((el) this).field_A = ((el) this).field_q;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    L15: {
                      if (((el) this).field_A <= ((el) this).field_t) {
                        break L15;
                      } else {
                        ((el) this).field_A = ((el) this).field_t;
                        break L15;
                      }
                    }
                    return;
                  }
                }
              }
            } else {
              L16: {
                var2 = ((el) this).field_y.field_t / 4;
                if (0 != jk.field_r) {
                  break L16;
                } else {
                  if (kc.field_f != 0) {
                    break L16;
                  } else {
                    L17: {
                      ((el) this).field_g = false;
                      ((el) this).field_x = false;
                      if (((el) this).field_A < ((el) this).field_q) {
                        ((el) this).field_A = ((el) this).field_q;
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                    L18: {
                      if (((el) this).field_A <= ((el) this).field_t) {
                        break L18;
                      } else {
                        ((el) this).field_A = ((el) this).field_t;
                        break L18;
                      }
                    }
                    return;
                  }
                }
              }
              L19: {
                if (((el) this).field_x) {
                  break L19;
                } else {
                  if (kc.field_b >= -(var2 / 2) + ((el) this).field_a) {
                    break L19;
                  } else {
                    L20: {
                      ((el) this).field_g = false;
                      if (((el) this).field_A < ((el) this).field_q) {
                        ((el) this).field_A = ((el) this).field_q;
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                    L21: {
                      if (((el) this).field_A <= ((el) this).field_t) {
                        break L21;
                      } else {
                        ((el) this).field_A = ((el) this).field_t;
                        break L21;
                      }
                    }
                    return;
                  }
                }
              }
              L22: {
                if (((el) this).field_x) {
                  break L22;
                } else {
                  if (kc.field_b <= ((el) this).field_a - (var2 / 2 + -var2)) {
                    break L22;
                  } else {
                    L23: {
                      ((el) this).field_g = false;
                      if (((el) this).field_A < ((el) this).field_q) {
                        ((el) this).field_A = ((el) this).field_q;
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    L24: {
                      if (((el) this).field_A <= ((el) this).field_t) {
                        break L24;
                      } else {
                        ((el) this).field_A = ((el) this).field_t;
                        break L24;
                      }
                    }
                    return;
                  }
                }
              }
              var3 = ag.field_f - ((el) this).field_l;
              if (!((el) this).field_x) {
                if (0 <= var3) {
                  if (((el) this).field_n >= var3) {
                    L25: {
                      var3 = var3 + (((el) this).field_n / (-((el) this).field_q + ((el) this).field_t) >> 1);
                      ((el) this).field_x = true;
                      ((el) this).field_A = (((el) this).field_t - ((el) this).field_q) * var3 / ((el) this).field_n + ((el) this).field_q;
                      ((el) this).field_g = true;
                      if (((el) this).field_A < ((el) this).field_q) {
                        ((el) this).field_A = ((el) this).field_q;
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                    L26: {
                      if (((el) this).field_A <= ((el) this).field_t) {
                        break L26;
                      } else {
                        ((el) this).field_A = ((el) this).field_t;
                        break L26;
                      }
                    }
                    return;
                  } else {
                    ((el) this).field_g = false;
                    return;
                  }
                } else {
                  ((el) this).field_g = false;
                  return;
                }
              } else {
                L27: {
                  var3 = var3 + (((el) this).field_n / (-((el) this).field_q + ((el) this).field_t) >> 1);
                  ((el) this).field_x = true;
                  ((el) this).field_A = (((el) this).field_t - ((el) this).field_q) * var3 / ((el) this).field_n + ((el) this).field_q;
                  ((el) this).field_g = true;
                  if (((el) this).field_A < ((el) this).field_q) {
                    ((el) this).field_A = ((el) this).field_q;
                    break L27;
                  } else {
                    break L27;
                  }
                }
                L28: {
                  if (((el) this).field_A <= ((el) this).field_t) {
                    break L28;
                  } else {
                    ((el) this).field_A = ((el) this).field_t;
                    break L28;
                  }
                }
                return;
              }
            }
          } else {
            ((el) this).field_g = false;
            ((el) this).field_c = false;
            return;
          }
        } else {
          if (((el) this).field_k) {
            L29: {
              L30: {
                if (!((el) this).field_r) {
                  break L30;
                } else {
                  if (null == ((el) this).field_w) {
                    break L30;
                  } else {
                    var2 = ((el) this).field_w.field_t;
                    break L29;
                  }
                }
              }
              var2 = ((el) this).field_y.field_t / 4;
              break L29;
            }
            L31: {
              if (0 != jk.field_r) {
                break L31;
              } else {
                if (kc.field_f != 0) {
                  break L31;
                } else {
                  L32: {
                    ((el) this).field_g = false;
                    ((el) this).field_x = false;
                    if (((el) this).field_A < ((el) this).field_q) {
                      ((el) this).field_A = ((el) this).field_q;
                      break L32;
                    } else {
                      break L32;
                    }
                  }
                  L33: {
                    if (((el) this).field_A <= ((el) this).field_t) {
                      break L33;
                    } else {
                      ((el) this).field_A = ((el) this).field_t;
                      break L33;
                    }
                  }
                  return;
                }
              }
            }
            L34: {
              if (((el) this).field_x) {
                break L34;
              } else {
                if (kc.field_b >= -(var2 / 2) + ((el) this).field_a) {
                  break L34;
                } else {
                  L35: {
                    ((el) this).field_g = false;
                    if (((el) this).field_A < ((el) this).field_q) {
                      ((el) this).field_A = ((el) this).field_q;
                      break L35;
                    } else {
                      break L35;
                    }
                  }
                  L36: {
                    if (((el) this).field_A <= ((el) this).field_t) {
                      break L36;
                    } else {
                      ((el) this).field_A = ((el) this).field_t;
                      break L36;
                    }
                  }
                  return;
                }
              }
            }
            L37: {
              if (((el) this).field_x) {
                break L37;
              } else {
                if (kc.field_b <= ((el) this).field_a - (var2 / 2 + -var2)) {
                  break L37;
                } else {
                  L38: {
                    ((el) this).field_g = false;
                    if (((el) this).field_A < ((el) this).field_q) {
                      ((el) this).field_A = ((el) this).field_q;
                      break L38;
                    } else {
                      break L38;
                    }
                  }
                  L39: {
                    if (((el) this).field_A <= ((el) this).field_t) {
                      break L39;
                    } else {
                      ((el) this).field_A = ((el) this).field_t;
                      break L39;
                    }
                  }
                  return;
                }
              }
            }
            var3 = ag.field_f - ((el) this).field_l;
            if (!((el) this).field_x) {
              if (0 <= var3) {
                if (((el) this).field_n < var3) {
                  ((el) this).field_g = false;
                  return;
                } else {
                  L40: {
                    var3 = var3 + (((el) this).field_n / (-((el) this).field_q + ((el) this).field_t) >> 1);
                    ((el) this).field_x = true;
                    ((el) this).field_A = (((el) this).field_t - ((el) this).field_q) * var3 / ((el) this).field_n + ((el) this).field_q;
                    ((el) this).field_g = true;
                    if (((el) this).field_A < ((el) this).field_q) {
                      ((el) this).field_A = ((el) this).field_q;
                      break L40;
                    } else {
                      break L40;
                    }
                  }
                  L41: {
                    if (((el) this).field_A <= ((el) this).field_t) {
                      break L41;
                    } else {
                      ((el) this).field_A = ((el) this).field_t;
                      break L41;
                    }
                  }
                  return;
                }
              } else {
                ((el) this).field_g = false;
                return;
              }
            } else {
              L42: {
                var3 = var3 + (((el) this).field_n / (-((el) this).field_q + ((el) this).field_t) >> 1);
                ((el) this).field_x = true;
                ((el) this).field_A = (((el) this).field_t - ((el) this).field_q) * var3 / ((el) this).field_n + ((el) this).field_q;
                ((el) this).field_g = true;
                if (((el) this).field_A < ((el) this).field_q) {
                  ((el) this).field_A = ((el) this).field_q;
                  break L42;
                } else {
                  break L42;
                }
              }
              L43: {
                if (((el) this).field_A <= ((el) this).field_t) {
                  break L43;
                } else {
                  ((el) this).field_A = ((el) this).field_t;
                  break L43;
                }
              }
              return;
            }
          } else {
            ((el) this).field_g = false;
            ((el) this).field_c = false;
            return;
          }
        }
    }

    el(int param0, int param1, int param2, bi param3, bi param4, bi param5, dd param6, dd param7) {
        ((el) this).field_x = false;
        ((el) this).field_q = 0;
        ((el) this).field_r = false;
        ((el) this).field_A = 50;
        ((el) this).field_t = 100;
        try {
            ((el) this).field_u = param5;
            ((el) this).field_w = param7;
            ((el) this).field_n = param2;
            ((el) this).field_y = param6;
            ((el) this).field_l = param1;
            ((el) this).field_v = param3;
            ((el) this).field_a = param0;
            ((el) this).field_z = param4;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "el.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "This password is part of your Player Name, and would be easy to guess";
    }
}
