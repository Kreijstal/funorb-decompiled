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
        if (param1 != 126) {
            boolean discarded$0 = el.b((byte) 28);
            ae.a(109, param0);
            wf.a(ll.field_o, false, false);
            return;
        }
        ae.a(109, param0);
        wf.a(ll.field_o, false, false);
    }

    public static void d(int param0) {
        field_B = null;
        if (param0 != 30537) {
            return;
        }
        field_C = null;
        field_s = null;
    }

    final static boolean b(byte param0) {
        int var1 = -14 % ((param0 - 73) / 47);
        if (sg.field_h == null) {
            return false;
        }
        if (!rh.field_k.b(0)) {
            return false;
        }
        return true;
    }

    final static void a(java.applet.Applet param0, int param1, byte param2, int param3, String[] param4, int param5) {
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = fleas.field_A ? 1 : 0;
          pi.field_e = param0.getParameter("overxgames");
          if (null == pi.field_e) {
            pi.field_e = "0";
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          id.field_i = param0.getParameter("overxachievements");
          if (id.field_i == null) {
            id.field_i = "0";
            break L1;
          } else {
            break L1;
          }
        }
        var6 = param0.getParameter("currency");
        if (var6 == null) {
          di.field_d = 2;
          fi.field_j = param5;
          rc.field_e = param3;
          pb.field_i = param1;
          of.field_h = new dd[param4.length];
          var7 = 0;
          L2: while (true) {
            if (param4.length <= var7) {
              vg.field_u = param4;
              if (param2 <= 24) {
                el.d(18);
                return;
              } else {
                return;
              }
            } else {
              of.field_h[var7] = new dd(317, 34);
              var7++;
              continue L2;
            }
          }
        } else {
          if (ii.a(12969, (CharSequence) (Object) var6)) {
            di.field_d = pl.a((CharSequence) (Object) var6, -9816);
            fi.field_j = param5;
            rc.field_e = param3;
            pb.field_i = param1;
            of.field_h = new dd[param4.length];
            var7 = 0;
            L3: while (true) {
              if (param4.length <= var7) {
                L4: {
                  vg.field_u = param4;
                  if (param2 > 24) {
                    break L4;
                  } else {
                    el.d(18);
                    break L4;
                  }
                }
                return;
              } else {
                of.field_h[var7] = new dd(317, 34);
                var7++;
                continue L3;
              }
            }
          } else {
            di.field_d = 2;
            fi.field_j = param5;
            rc.field_e = param3;
            pb.field_i = param1;
            of.field_h = new dd[param4.length];
            var7 = 0;
            L5: while (true) {
              if (param4.length <= var7) {
                vg.field_u = param4;
                if (param2 <= 24) {
                  el.d(18);
                  return;
                } else {
                  return;
                }
              } else {
                of.field_h[var7] = new dd(317, 34);
                var7++;
                continue L5;
              }
            }
          }
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
            if (!((el) this).field_r) {
              ((el) this).field_y.c(((el) this).field_l + (var4 + -(((el) this).field_y.field_w / 8)), -(((el) this).field_y.field_t / 8) + ((el) this).field_a);
              return;
            } else {
              if (((el) this).field_w != null) {
                ((el) this).field_w.d(var4 + (((el) this).field_l - ((el) this).field_w.field_w / 2), -(((el) this).field_w.field_t / 2) + ((el) this).field_a);
                return;
              } else {
                ((el) this).field_y.c(((el) this).field_l + (var4 + -(((el) this).field_y.field_w / 8)), -(((el) this).field_y.field_t / 8) + ((el) this).field_a);
                return;
              }
            }
          } else {
            ((el) this).field_t = 37;
            if (!((el) this).field_r) {
              ((el) this).field_y.c(((el) this).field_l + (var4 + -(((el) this).field_y.field_w / 8)), -(((el) this).field_y.field_t / 8) + ((el) this).field_a);
              return;
            } else {
              if (((el) this).field_w != null) {
                ((el) this).field_w.d(var4 + (((el) this).field_l - ((el) this).field_w.field_w / 2), -(((el) this).field_w.field_t / 2) + ((el) this).field_a);
                return;
              } else {
                ((el) this).field_y.c(((el) this).field_l + (var4 + -(((el) this).field_y.field_w / 8)), -(((el) this).field_y.field_t / 8) + ((el) this).field_a);
                return;
              }
            }
          }
        } else {
          ((el) this).field_u.a(var2, ((el) this).field_a);
          var4 = (-((el) this).field_q + ((el) this).field_A) * ((el) this).field_n / (((el) this).field_t + -((el) this).field_q);
          if (param0 != 72) {
            ((el) this).field_t = 37;
            if (((el) this).field_r) {
              if (((el) this).field_w != null) {
                ((el) this).field_w.d(var4 + (((el) this).field_l - ((el) this).field_w.field_w / 2), -(((el) this).field_w.field_t / 2) + ((el) this).field_a);
                return;
              } else {
                ((el) this).field_y.c(((el) this).field_l + (var4 + -(((el) this).field_y.field_w / 8)), -(((el) this).field_y.field_t / 8) + ((el) this).field_a);
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
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
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
          stackOut_30_0 = var2;
          stackIn_35_0 = stackOut_30_0;
          stackIn_31_0 = stackOut_30_0;
          if (ag.field_f < var3) {
            stackOut_35_0 = stackIn_35_0;
            stackIn_40_0 = stackOut_35_0;
            stackIn_36_0 = stackOut_35_0;
            if ((kc.field_b ^ -1) > (((el) this).field_a ^ -1)) {
              L3: {
                stackOut_40_0 = stackIn_40_0;
                stackIn_46_0 = stackOut_40_0;
                stackIn_41_0 = stackOut_40_0;
                if ((-var4 + ((el) this).field_n ^ -1) <= (ag.field_f ^ -1)) {
                  stackOut_46_0 = stackIn_46_0;
                  stackOut_46_1 = 1;
                  stackIn_48_0 = stackOut_46_0;
                  stackIn_48_1 = stackOut_46_1;
                  break L3;
                } else {
                  stackOut_41_0 = stackIn_41_0;
                  stackIn_47_0 = stackOut_41_0;
                  stackIn_42_0 = stackOut_41_0;
                  if ((((el) this).field_z.field_d ^ -1) > (kc.field_b ^ -1)) {
                    stackOut_47_0 = stackIn_47_0;
                    stackOut_47_1 = 0;
                    stackIn_48_0 = stackOut_47_0;
                    stackIn_48_1 = stackOut_47_1;
                    break L3;
                  } else {
                    L4: {
                      var2 = stackIn_42_0 | 1;
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
                }
              }
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
            } else {
              L6: {
                var2 = stackIn_36_0 | 1;
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
              var2 = stackIn_31_0 | 1;
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
            if ((kc.field_b ^ -1) > (((el) this).field_a ^ -1)) {
              L8: {
                stackOut_18_0 = stackIn_18_0;
                stackIn_24_0 = stackOut_18_0;
                stackIn_19_0 = stackOut_18_0;
                if ((-var4 + ((el) this).field_n ^ -1) <= (ag.field_f ^ -1)) {
                  stackOut_24_0 = stackIn_24_0;
                  stackOut_24_1 = 1;
                  stackIn_26_0 = stackOut_24_0;
                  stackIn_26_1 = stackOut_24_1;
                  break L8;
                } else {
                  stackOut_19_0 = stackIn_19_0;
                  stackIn_25_0 = stackOut_19_0;
                  stackIn_20_0 = stackOut_19_0;
                  if ((((el) this).field_z.field_d ^ -1) > (kc.field_b ^ -1)) {
                    stackOut_25_0 = stackIn_25_0;
                    stackOut_25_1 = 0;
                    stackIn_26_0 = stackOut_25_0;
                    stackIn_26_1 = stackOut_25_1;
                    break L8;
                  } else {
                    L9: {
                      var2 = stackIn_20_0 | 1;
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
                }
              }
              L10: {
                var2 = stackIn_26_0 | stackIn_26_1;
                var3 = var3 + (((el) this).field_n - var4);
                if (null != ((el) this).field_u) {
                  var2 = var2 != 0 | ((el) this).field_u.b(var3, ((el) this).field_a, ag.field_f, kc.field_b) ? 1 : 0;
                  break L10;
                } else {
                  break L10;
                }
              }
              return var2 != 0;
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
                  if (-1 == (kc.field_f ^ -1)) {
                    L2: {
                      ((el) this).field_g = false;
                      ((el) this).field_x = false;
                      if ((((el) this).field_A ^ -1) > (((el) this).field_q ^ -1)) {
                        ((el) this).field_A = ((el) this).field_q;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    if ((((el) this).field_A ^ -1) >= (((el) this).field_t ^ -1)) {
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
                      if ((((el) this).field_A ^ -1) > (((el) this).field_q ^ -1)) {
                        ((el) this).field_A = ((el) this).field_q;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    if ((((el) this).field_A ^ -1) >= (((el) this).field_t ^ -1)) {
                      return;
                    } else {
                      ((el) this).field_A = ((el) this).field_t;
                      return;
                    }
                  } else {
                    L4: {
                      var3 = ag.field_f - ((el) this).field_l;
                      if (((el) this).field_x) {
                        break L4;
                      } else {
                        if (0 > var3) {
                          ((el) this).field_g = false;
                          return;
                        } else {
                          if ((((el) this).field_n ^ -1) <= (var3 ^ -1)) {
                            break L4;
                          } else {
                            ((el) this).field_g = false;
                            return;
                          }
                        }
                      }
                    }
                    L5: {
                      var3 = var3 + (((el) this).field_n / (-((el) this).field_q + ((el) this).field_t) >> -1443259423);
                      ((el) this).field_x = true;
                      ((el) this).field_A = (((el) this).field_t - ((el) this).field_q) * var3 / ((el) this).field_n + ((el) this).field_q;
                      ((el) this).field_g = true;
                      if ((((el) this).field_A ^ -1) > (((el) this).field_q ^ -1)) {
                        ((el) this).field_A = ((el) this).field_q;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    if ((((el) this).field_A ^ -1) >= (((el) this).field_t ^ -1)) {
                      return;
                    } else {
                      ((el) this).field_A = ((el) this).field_t;
                      return;
                    }
                  }
                } else {
                  L6: {
                    var3 = ag.field_f - ((el) this).field_l;
                    if (((el) this).field_x) {
                      break L6;
                    } else {
                      if (0 > var3) {
                        ((el) this).field_g = false;
                        return;
                      } else {
                        if ((((el) this).field_n ^ -1) <= (var3 ^ -1)) {
                          break L6;
                        } else {
                          ((el) this).field_g = false;
                          return;
                        }
                      }
                    }
                  }
                  L7: {
                    var3 = var3 + (((el) this).field_n / (-((el) this).field_q + ((el) this).field_t) >> -1443259423);
                    ((el) this).field_x = true;
                    ((el) this).field_A = (((el) this).field_t - ((el) this).field_q) * var3 / ((el) this).field_n + ((el) this).field_q;
                    ((el) this).field_g = true;
                    if ((((el) this).field_A ^ -1) > (((el) this).field_q ^ -1)) {
                      ((el) this).field_A = ((el) this).field_q;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  if ((((el) this).field_A ^ -1) >= (((el) this).field_t ^ -1)) {
                    return;
                  } else {
                    ((el) this).field_A = ((el) this).field_t;
                    return;
                  }
                }
              } else {
                if ((kc.field_b ^ -1) > (-(var2 / 2) + ((el) this).field_a ^ -1)) {
                  L8: {
                    ((el) this).field_g = false;
                    if ((((el) this).field_A ^ -1) > (((el) this).field_q ^ -1)) {
                      ((el) this).field_A = ((el) this).field_q;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  if ((((el) this).field_A ^ -1) >= (((el) this).field_t ^ -1)) {
                    return;
                  } else {
                    ((el) this).field_A = ((el) this).field_t;
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
                          if ((((el) this).field_A ^ -1) > (((el) this).field_q ^ -1)) {
                            ((el) this).field_A = ((el) this).field_q;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        L11: {
                          if ((((el) this).field_A ^ -1) >= (((el) this).field_t ^ -1)) {
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
                  L12: {
                    var3 = ag.field_f - ((el) this).field_l;
                    if (((el) this).field_x) {
                      break L12;
                    } else {
                      if (0 > var3) {
                        ((el) this).field_g = false;
                        return;
                      } else {
                        if ((((el) this).field_n ^ -1) <= (var3 ^ -1)) {
                          break L12;
                        } else {
                          ((el) this).field_g = false;
                          return;
                        }
                      }
                    }
                  }
                  L13: {
                    var3 = var3 + (((el) this).field_n / (-((el) this).field_q + ((el) this).field_t) >> -1443259423);
                    ((el) this).field_x = true;
                    ((el) this).field_A = (((el) this).field_t - ((el) this).field_q) * var3 / ((el) this).field_n + ((el) this).field_q;
                    ((el) this).field_g = true;
                    if ((((el) this).field_A ^ -1) > (((el) this).field_q ^ -1)) {
                      ((el) this).field_A = ((el) this).field_q;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if ((((el) this).field_A ^ -1) >= (((el) this).field_t ^ -1)) {
                      break L14;
                    } else {
                      ((el) this).field_A = ((el) this).field_t;
                      break L14;
                    }
                  }
                  return;
                }
              }
            } else {
              L15: {
                var2 = ((el) this).field_y.field_t / 4;
                if (0 != jk.field_r) {
                  break L15;
                } else {
                  if (-1 == (kc.field_f ^ -1)) {
                    L16: {
                      ((el) this).field_g = false;
                      ((el) this).field_x = false;
                      if ((((el) this).field_A ^ -1) > (((el) this).field_q ^ -1)) {
                        ((el) this).field_A = ((el) this).field_q;
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    L17: {
                      if ((((el) this).field_A ^ -1) >= (((el) this).field_t ^ -1)) {
                        break L17;
                      } else {
                        ((el) this).field_A = ((el) this).field_t;
                        break L17;
                      }
                    }
                    return;
                  } else {
                    break L15;
                  }
                }
              }
              L18: {
                if (((el) this).field_x) {
                  break L18;
                } else {
                  if ((kc.field_b ^ -1) > (-(var2 / 2) + ((el) this).field_a ^ -1)) {
                    L19: {
                      ((el) this).field_g = false;
                      if ((((el) this).field_A ^ -1) > (((el) this).field_q ^ -1)) {
                        ((el) this).field_A = ((el) this).field_q;
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    L20: {
                      if ((((el) this).field_A ^ -1) >= (((el) this).field_t ^ -1)) {
                        break L20;
                      } else {
                        ((el) this).field_A = ((el) this).field_t;
                        break L20;
                      }
                    }
                    return;
                  } else {
                    break L18;
                  }
                }
              }
              L21: {
                if (((el) this).field_x) {
                  break L21;
                } else {
                  if (kc.field_b <= ((el) this).field_a - (var2 / 2 + -var2)) {
                    break L21;
                  } else {
                    L22: {
                      ((el) this).field_g = false;
                      if ((((el) this).field_A ^ -1) > (((el) this).field_q ^ -1)) {
                        ((el) this).field_A = ((el) this).field_q;
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                    L23: {
                      if ((((el) this).field_A ^ -1) >= (((el) this).field_t ^ -1)) {
                        break L23;
                      } else {
                        ((el) this).field_A = ((el) this).field_t;
                        break L23;
                      }
                    }
                    return;
                  }
                }
              }
              L24: {
                var3 = ag.field_f - ((el) this).field_l;
                if (((el) this).field_x) {
                  break L24;
                } else {
                  if (0 > var3) {
                    ((el) this).field_g = false;
                    return;
                  } else {
                    if ((((el) this).field_n ^ -1) <= (var3 ^ -1)) {
                      break L24;
                    } else {
                      ((el) this).field_g = false;
                      return;
                    }
                  }
                }
              }
              L25: {
                var3 = var3 + (((el) this).field_n / (-((el) this).field_q + ((el) this).field_t) >> -1443259423);
                ((el) this).field_x = true;
                ((el) this).field_A = (((el) this).field_t - ((el) this).field_q) * var3 / ((el) this).field_n + ((el) this).field_q;
                ((el) this).field_g = true;
                if ((((el) this).field_A ^ -1) > (((el) this).field_q ^ -1)) {
                  ((el) this).field_A = ((el) this).field_q;
                  break L25;
                } else {
                  break L25;
                }
              }
              L26: {
                if ((((el) this).field_A ^ -1) >= (((el) this).field_t ^ -1)) {
                  break L26;
                } else {
                  ((el) this).field_A = ((el) this).field_t;
                  break L26;
                }
              }
              return;
            }
          } else {
            ((el) this).field_g = false;
            ((el) this).field_c = false;
            return;
          }
        } else {
          if (((el) this).field_k) {
            L27: {
              L28: {
                if (!((el) this).field_r) {
                  break L28;
                } else {
                  if (null == ((el) this).field_w) {
                    break L28;
                  } else {
                    var2 = ((el) this).field_w.field_t;
                    break L27;
                  }
                }
              }
              var2 = ((el) this).field_y.field_t / 4;
              break L27;
            }
            L29: {
              if (0 != jk.field_r) {
                break L29;
              } else {
                if (-1 == (kc.field_f ^ -1)) {
                  L30: {
                    ((el) this).field_g = false;
                    ((el) this).field_x = false;
                    if ((((el) this).field_A ^ -1) > (((el) this).field_q ^ -1)) {
                      ((el) this).field_A = ((el) this).field_q;
                      break L30;
                    } else {
                      break L30;
                    }
                  }
                  L31: {
                    if ((((el) this).field_A ^ -1) >= (((el) this).field_t ^ -1)) {
                      break L31;
                    } else {
                      ((el) this).field_A = ((el) this).field_t;
                      break L31;
                    }
                  }
                  return;
                } else {
                  break L29;
                }
              }
            }
            L32: {
              if (((el) this).field_x) {
                break L32;
              } else {
                if ((kc.field_b ^ -1) > (-(var2 / 2) + ((el) this).field_a ^ -1)) {
                  L33: {
                    ((el) this).field_g = false;
                    if ((((el) this).field_A ^ -1) > (((el) this).field_q ^ -1)) {
                      ((el) this).field_A = ((el) this).field_q;
                      break L33;
                    } else {
                      break L33;
                    }
                  }
                  L34: {
                    if ((((el) this).field_A ^ -1) >= (((el) this).field_t ^ -1)) {
                      break L34;
                    } else {
                      ((el) this).field_A = ((el) this).field_t;
                      break L34;
                    }
                  }
                  return;
                } else {
                  break L32;
                }
              }
            }
            L35: {
              if (((el) this).field_x) {
                break L35;
              } else {
                if (kc.field_b <= ((el) this).field_a - (var2 / 2 + -var2)) {
                  break L35;
                } else {
                  L36: {
                    ((el) this).field_g = false;
                    if ((((el) this).field_A ^ -1) > (((el) this).field_q ^ -1)) {
                      ((el) this).field_A = ((el) this).field_q;
                      break L36;
                    } else {
                      break L36;
                    }
                  }
                  L37: {
                    if ((((el) this).field_A ^ -1) >= (((el) this).field_t ^ -1)) {
                      break L37;
                    } else {
                      ((el) this).field_A = ((el) this).field_t;
                      break L37;
                    }
                  }
                  return;
                }
              }
            }
            L38: {
              var3 = ag.field_f - ((el) this).field_l;
              if (((el) this).field_x) {
                break L38;
              } else {
                if (0 > var3) {
                  ((el) this).field_g = false;
                  return;
                } else {
                  if ((((el) this).field_n ^ -1) <= (var3 ^ -1)) {
                    break L38;
                  } else {
                    ((el) this).field_g = false;
                    return;
                  }
                }
              }
            }
            L39: {
              var3 = var3 + (((el) this).field_n / (-((el) this).field_q + ((el) this).field_t) >> -1443259423);
              ((el) this).field_x = true;
              ((el) this).field_A = (((el) this).field_t - ((el) this).field_q) * var3 / ((el) this).field_n + ((el) this).field_q;
              ((el) this).field_g = true;
              if ((((el) this).field_A ^ -1) > (((el) this).field_q ^ -1)) {
                ((el) this).field_A = ((el) this).field_q;
                break L39;
              } else {
                break L39;
              }
            }
            L40: {
              if ((((el) this).field_A ^ -1) >= (((el) this).field_t ^ -1)) {
                break L40;
              } else {
                ((el) this).field_A = ((el) this).field_t;
                break L40;
              }
            }
            return;
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
        ((el) this).field_u = param5;
        ((el) this).field_w = param7;
        ((el) this).field_n = param2;
        ((el) this).field_y = param6;
        ((el) this).field_l = param1;
        ((el) this).field_v = param3;
        ((el) this).field_a = param0;
        ((el) this).field_z = param4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "This password is part of your Player Name, and would be easy to guess";
    }
}
