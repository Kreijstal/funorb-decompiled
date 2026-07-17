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

    public static void d() {
        int var1 = 98;
        field_j = null;
        field_i = null;
        field_h = null;
        field_k = null;
    }

    private final void a(ja param0, byte param1, ja param2) {
        param0.g(-(param0.field_x / 2) + 320, 400);
        try {
            g.a(param2, 320 + -(param2.field_x / 2), 400);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "ko.F(" + (param0 != null ? "{...}" : "null") + 44 + 59 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final boolean a(int param0, int param1, int param2) {
        L0: {
          if (param0 > 61) {
            break L0;
          } else {
            field_j = null;
            break L0;
          }
        }
        L1: {
          ((ko) this).field_m = ((ko) this).field_m + 1;
          if (param1 == 255) {
            break L1;
          } else {
            if (param1 >= 19) {
              break L1;
            } else {
              L2: {
                if (!ll.field_k.a(45, -128)) {
                  break L2;
                } else {
                  if (param1 != 17) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                int discarded$5 = 51603;
                if (!h.i()) {
                  break L3;
                } else {
                  L4: {
                    if (jk.a((byte) -73, param1)) {
                      break L4;
                    } else {
                      if (jk.a((byte) -122, param2)) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  return false;
                }
              }
              if (((ko) this).field_m != 8) {
                ((ko) this).field_b[-1 + ((ko) this).field_m] = new fb(190 + (((ko) this).field_m * 40 - 40), param1, ((ko) this).field_m + -1);
                ((ko) this).field_b[-1 + ((ko) this).field_m].field_l = -op.field_m.field_H + tg.field_e.field_b[((ko) this).field_m + -1];
                ((ko) this).field_b[((ko) this).field_m - 1].a(0);
                return true;
              } else {
                return false;
              }
            }
          }
        }
        return false;
    }

    final boolean a(byte param0) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        if (param0 <= -111) {
          L0: {
            L1: {
              if (((ko) this).field_c) {
                break L1;
              } else {
                if (((ko) this).field_e) {
                  break L1;
                } else {
                  if (((ko) this).field_g) {
                    break L1;
                  } else {
                    if (!((ko) this).field_d) {
                      stackOut_8_0 = 0;
                      stackIn_9_0 = stackOut_8_0;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L0;
          }
          return stackIn_9_0 != 0;
        } else {
          return true;
        }
    }

    final boolean g(int param0) {
        if (param0 != 13) {
            return false;
        }
        return ((ko) this).field_c;
    }

    final void a(int param0, int param1, byte param2) {
        fb[] var4_ref_fb__ = null;
        int var4 = 0;
        int var5_int = 0;
        fb var5 = null;
        fb var6_ref_fb = null;
        int var6 = 0;
        int var7 = 0;
        fb[] var8 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        var8 = ((ko) this).field_b;
        var4_ref_fb__ = var8;
        var5_int = 0;
        L0: while (true) {
          if (var5_int >= var8.length) {
            L1: {
              ((ko) this).field_a = -1;
              if (param2 >= 64) {
                break L1;
              } else {
                boolean discarded$1 = ((ko) this).b(119, 56, -64);
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var4 >= ((ko) this).field_b.length) {
                return;
              } else {
                var5 = ((ko) this).field_b[var4];
                if (var5 != null) {
                  var6 = var5.a(param1, (byte) -66);
                  if (-1 != var6) {
                    ((ko) this).field_f = 20 + var5.field_m;
                    ((ko) this).field_a = var4;
                    var4++;
                    continue L2;
                  } else {
                    var4++;
                    continue L2;
                  }
                } else {
                  var4++;
                  continue L2;
                }
              }
            }
          } else {
            var6_ref_fb = var8[var5_int];
            if (var6_ref_fb != null) {
              var6_ref_fb.a(param1, param0, 255);
              var5_int++;
              continue L0;
            } else {
              var5_int++;
              continue L0;
            }
          }
        }
    }

    final static void a(boolean param0, int param1, boolean param2, boolean param3) {
        int var5 = 0;
        cj stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        cj stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        cj stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        cj stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        cj stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        cj stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        cj stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        cj stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        cj stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        cj stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        cj stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        cj stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        cj stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        cj stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        cj stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        cj stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        cj stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        cj stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        cj stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        cj stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        cj stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        cj stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        cj stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        cj stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        cj stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        cj stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        cj stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        cj stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        cj stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        cj stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        cj stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        cj stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        cj stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        cj stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        cj stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        L0: {
          var5 = ZombieDawnMulti.field_E ? 1 : 0;
          v.a(199);
          if (0 > bc.field_e) {
            ql.field_b.field_wb = null;
            break L0;
          } else {
            ql.field_b.field_wb = vl.a(ob.field_v, new String[1], 2);
            break L0;
          }
        }
        L1: {
          L2: {
            stackOut_3_0 = qe.field_k;
            stackOut_3_1 = -11838;
            stackIn_9_0 = stackOut_3_0;
            stackIn_9_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (!param0) {
              break L2;
            } else {
              stackOut_4_0 = (cj) (Object) stackIn_4_0;
              stackOut_4_1 = stackIn_4_1;
              stackIn_9_0 = stackOut_4_0;
              stackIn_9_1 = stackOut_4_1;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              if (param3) {
                break L2;
              } else {
                stackOut_5_0 = (cj) (Object) stackIn_5_0;
                stackOut_5_1 = stackIn_5_1;
                stackIn_9_0 = stackOut_5_0;
                stackIn_9_1 = stackOut_5_1;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                if (ee.field_a) {
                  break L2;
                } else {
                  stackOut_6_0 = (cj) (Object) stackIn_6_0;
                  stackOut_6_1 = stackIn_6_1;
                  stackIn_9_0 = stackOut_6_0;
                  stackIn_9_1 = stackOut_6_1;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  if (null != mh.field_c) {
                    break L2;
                  } else {
                    stackOut_7_0 = (cj) (Object) stackIn_7_0;
                    stackOut_7_1 = stackIn_7_1;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    if (ej.field_n != null) {
                      break L2;
                    } else {
                      stackOut_8_0 = (cj) (Object) stackIn_8_0;
                      stackOut_8_1 = stackIn_8_1;
                      stackOut_8_2 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      stackIn_10_2 = stackOut_8_2;
                      break L1;
                    }
                  }
                }
              }
            }
          }
          stackOut_9_0 = (cj) (Object) stackIn_9_0;
          stackOut_9_1 = stackIn_9_1;
          stackOut_9_2 = 0;
          stackIn_10_0 = stackOut_9_0;
          stackIn_10_1 = stackOut_9_1;
          stackIn_10_2 = stackOut_9_2;
          break L1;
        }
        L3: {
          L4: {
            ((cj) (Object) stackIn_10_0).a(stackIn_10_1, stackIn_10_2 != 0);
            stackOut_10_0 = cm.field_a;
            stackOut_10_1 = -11838;
            stackIn_16_0 = stackOut_10_0;
            stackIn_16_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (!param0) {
              break L4;
            } else {
              stackOut_11_0 = (cj) (Object) stackIn_11_0;
              stackOut_11_1 = stackIn_11_1;
              stackIn_16_0 = stackOut_11_0;
              stackIn_16_1 = stackOut_11_1;
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              if (param3) {
                break L4;
              } else {
                stackOut_12_0 = (cj) (Object) stackIn_12_0;
                stackOut_12_1 = stackIn_12_1;
                stackIn_16_0 = stackOut_12_0;
                stackIn_16_1 = stackOut_12_1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                if (ee.field_a) {
                  break L4;
                } else {
                  stackOut_13_0 = (cj) (Object) stackIn_13_0;
                  stackOut_13_1 = stackIn_13_1;
                  stackIn_16_0 = stackOut_13_0;
                  stackIn_16_1 = stackOut_13_1;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  if (mh.field_c != null) {
                    break L4;
                  } else {
                    stackOut_14_0 = (cj) (Object) stackIn_14_0;
                    stackOut_14_1 = stackIn_14_1;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    if (ej.field_n != null) {
                      break L4;
                    } else {
                      stackOut_15_0 = (cj) (Object) stackIn_15_0;
                      stackOut_15_1 = stackIn_15_1;
                      stackOut_15_2 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      stackIn_17_2 = stackOut_15_2;
                      break L3;
                    }
                  }
                }
              }
            }
          }
          stackOut_16_0 = (cj) (Object) stackIn_16_0;
          stackOut_16_1 = stackIn_16_1;
          stackOut_16_2 = 0;
          stackIn_17_0 = stackOut_16_0;
          stackIn_17_1 = stackOut_16_1;
          stackIn_17_2 = stackOut_16_2;
          break L3;
        }
        L5: {
          L6: {
            ((cj) (Object) stackIn_17_0).a(stackIn_17_1, stackIn_17_2 != 0);
            stackOut_17_0 = lm.field_gb;
            stackOut_17_1 = -11838;
            stackIn_22_0 = stackOut_17_0;
            stackIn_22_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (!param0) {
              break L6;
            } else {
              stackOut_18_0 = (cj) (Object) stackIn_18_0;
              stackOut_18_1 = stackIn_18_1;
              stackIn_22_0 = stackOut_18_0;
              stackIn_22_1 = stackOut_18_1;
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              if (param3) {
                break L6;
              } else {
                stackOut_19_0 = (cj) (Object) stackIn_19_0;
                stackOut_19_1 = stackIn_19_1;
                stackIn_22_0 = stackOut_19_0;
                stackIn_22_1 = stackOut_19_1;
                stackIn_20_0 = stackOut_19_0;
                stackIn_20_1 = stackOut_19_1;
                if (!ee.field_a) {
                  break L6;
                } else {
                  ((cj) (Object) stackIn_20_0).a(stackIn_20_1, true);
                  de.field_b.field_c.h(-37);
                  if (0 == kj.field_u.field_T) {
                    break L5;
                  } else {
                    uk.field_N = true;
                    break L5;
                  }
                }
              }
            }
          }
          ((cj) (Object) stackIn_22_0).a(stackIn_22_1, false);
          de.field_b.field_c.h(-37);
          if (0 == kj.field_u.field_T) {
            break L5;
          } else {
            uk.field_N = true;
            break L5;
          }
        }
        L7: {
          if (ia.field_t.field_T == 0) {
            break L7;
          } else {
            if (!bo.field_e) {
              if (vl.field_h <= 0) {
                if (kj.field_q >= 2) {
                  if (!lc.field_m[12]) {
                    pb.field_f = true;
                    break L7;
                  } else {
                    ii.a(11, -1);
                    break L7;
                  }
                } else {
                  pb.field_f = true;
                  break L7;
                }
              } else {
                pb.field_f = true;
                break L7;
              }
            } else {
              ii.a(11, -1);
              break L7;
            }
          }
        }
        L8: {
          L9: {
            if (pl.field_L.field_T == 0) {
              break L9;
            } else {
              L10: {
                if (1 != qo.field_r.length) {
                  break L10;
                } else {
                  if (i.field_e == qo.field_r[0]) {
                    break L10;
                  } else {
                    i.field_e = qo.field_r[0];
                    int discarded$4 = 11;
                    int discarded$5 = 1;
                    cm.a(123, 0, i.field_e, ch.field_c);
                    break L9;
                  }
                }
              }
              int discarded$6 = 11;
              int discarded$7 = 1;
              cm.a(123, 0, i.field_e, ch.field_c);
              if (0 == kn.field_a.field_T) {
                break L8;
              } else {
                ee.field_a = false;
                break L8;
              }
            }
          }
          if (0 == kn.field_a.field_T) {
            break L8;
          } else {
            ee.field_a = false;
            break L8;
          }
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
            return true;
        }
        return ((ko) this).field_g;
    }

    final void c(int param0) {
        fb[] var2_ref_fb__ = null;
        int var2 = 0;
        int var3 = 0;
        fb var4_ref_fb = null;
        int var4 = 0;
        int var5 = 0;
        fb[] var6 = null;
        L0: {
          var5 = ZombieDawnMulti.field_E ? 1 : 0;
          var6 = ((ko) this).field_b;
          var2_ref_fb__ = var6;
          if (param0 <= -114) {
            break L0;
          } else {
            ((ko) this).field_a = -40;
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          if (var3 >= var6.length) {
            L2: {
              if (((ko) this).field_a == -1) {
                break L2;
              } else {
                if (((ko) this).field_a >= tg.field_e.field_d.length) {
                  break L2;
                } else {
                  var2 = tg.field_e.field_d[((ko) this).field_a];
                  var3 = tg.field_e.field_f[((ko) this).field_a];
                  if (255 != var2) {
                    g.a(fe.field_W[var2], ((ko) this).field_f + -100, 453);
                    oj.field_M[var2].g(-100 + ((ko) this).field_f, 453);
                    if (var3 == 255) {
                      break L2;
                    } else {
                      g.a(fe.field_W[var3], -100 + ((ko) this).field_f, 438);
                      oj.field_M[var3].g(-100 + ((ko) this).field_f, 438);
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
              }
            }
            L3: {
              if (((ko) this).field_e) {
                this.a(wp.field_e, (byte) 59, vl.field_k);
                break L3;
              } else {
                L4: {
                  if (!((ko) this).field_d) {
                    break L4;
                  } else {
                    if (!((ko) this).field_g) {
                      break L4;
                    } else {
                      if (((ko) this).field_c) {
                        this.a(la.field_j, (byte) 59, kj.field_o);
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                L5: {
                  if (!((ko) this).field_d) {
                    break L5;
                  } else {
                    if (((ko) this).field_g) {
                      this.a(up.field_f, (byte) 59, oq.field_t);
                      break L3;
                    } else {
                      break L5;
                    }
                  }
                }
                if (!((ko) this).field_g) {
                  L6: {
                    if (!((ko) this).field_c) {
                      break L6;
                    } else {
                      if (((ko) this).field_d) {
                        this.a(mi.field_Mb, (byte) 59, aq.field_u);
                        break L3;
                      } else {
                        break L6;
                      }
                    }
                  }
                  if (((ko) this).field_c) {
                    this.a(bq.field_a, (byte) 59, ii.field_c);
                    break L3;
                  } else {
                    if (((ko) this).field_d) {
                      this.a(fe.field_U, (byte) 59, ap.field_t);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                } else {
                  this.a(dl.field_c, (byte) 59, bf.field_f);
                  break L3;
                }
              }
            }
            L7: {
              var2 = ((ko) this).e(-1);
              if (255 == var2) {
                break L7;
              } else {
                if (0 >= bd.field_g) {
                  break L7;
                } else {
                  if (bo.field_d > 0) {
                    var3 = 4 + bd.field_g;
                    var4 = 15 + bo.field_d;
                    wa.field_b[var2].c(var3, var4, 255);
                    if (!bk.field_g) {
                      el.field_E.c(1 + var3, var4 - -1);
                      break L7;
                    } else {
                      break L7;
                    }
                  } else {
                    break L7;
                  }
                }
              }
            }
            return;
          } else {
            var4_ref_fb = var6[var3];
            if (var4_ref_fb != null) {
              var4_ref_fb.c(123);
              var3++;
              continue L1;
            } else {
              var3++;
              continue L1;
            }
          }
        }
    }

    final int e(int param0) {
        if (((ko) this).field_l != param0) {
            if (((ko) this).field_b[((ko) this).field_l] != null) {
                return ((ko) this).field_b[((ko) this).field_l].a((byte) 97);
            }
        }
        return 255;
    }

    final void a(int param0, int param1) {
        if (((ko) this).field_b[param0] != null) {
          L0: {
            if (!((ko) this).field_b[param0].field_b) {
              boolean discarded$10 = ((ko) this).b(param1 ^ -18, param0);
              if (param1 == -1) {
                break L0;
              } else {
                ((ko) this).field_m = -102;
                break L0;
              }
            } else {
              if (param1 == -1) {
                break L0;
              } else {
                ((ko) this).field_m = -102;
                break L0;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final boolean f(int param0) {
        if (param0 != 0) {
            return true;
        }
        return ((ko) this).field_e;
    }

    final int b(boolean param0) {
        if (param0) {
            ((ko) this).field_a = 77;
        }
        int var2 = ((ko) this).e(-1);
        if (var2 != 9) {
            if (var2 != 10) {
                return 0;
            }
        }
        return ip.field_f;
    }

    final boolean b(int param0, int param1) {
        fb[] var3_ref_fb__ = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        fb var5_ref_fb = null;
        int var6 = 0;
        fb[] var7 = null;
        Object stackIn_35_0 = null;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        Object stackIn_41_0 = null;
        Object stackIn_42_0 = null;
        Object stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        Object stackIn_45_0 = null;
        Object stackIn_46_0 = null;
        Object stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        Object stackIn_49_0 = null;
        Object stackIn_50_0 = null;
        Object stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        Object stackIn_54_0 = null;
        Object stackIn_54_1 = null;
        Object stackIn_55_0 = null;
        Object stackIn_55_1 = null;
        Object stackIn_56_0 = null;
        Object stackIn_56_1 = null;
        int stackIn_56_2 = 0;
        Object stackOut_34_0 = null;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        Object stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        Object stackOut_44_0 = null;
        Object stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        Object stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        Object stackOut_53_0 = null;
        Object stackOut_53_1 = null;
        Object stackOut_55_0 = null;
        Object stackOut_55_1 = null;
        int stackOut_55_2 = 0;
        Object stackOut_54_0 = null;
        Object stackOut_54_1 = null;
        int stackOut_54_2 = 0;
        Object stackOut_48_0 = null;
        Object stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        Object stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        Object stackOut_40_0 = null;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        Object stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        if (((ko) this).field_b[param1] == null) {
          return false;
        } else {
          L0: {
            if (param0 == 17) {
              break L0;
            } else {
              ((ko) this).field_c = false;
              break L0;
            }
          }
          L1: {
            if (((ko) this).field_b[param1].b((byte) 92)) {
              boolean discarded$1 = ((ko) this).h(1);
              break L1;
            } else {
              iq.a(-10, (byte) 99);
              var7 = ((ko) this).field_b;
              var3_ref_fb__ = var7;
              var4 = 0;
              L2: while (true) {
                if (var4 >= var7.length) {
                  L3: {
                    ((ko) this).field_l = param1;
                    ((ko) this).field_b[param1].b(2);
                    var3 = ((ko) this).field_b[param1].a((byte) 114);
                    ((ko) this).field_e = false;
                    ((ko) this).field_g = false;
                    ((ko) this).field_c = false;
                    ((ko) this).field_d = false;
                    var4 = ll.field_k.field_g[param1];
                    var5 = var3;
                    if (7 == var5) {
                      L4: {
                        ((ko) this).field_c = true;
                        stackOut_34_0 = this;
                        stackIn_36_0 = stackOut_34_0;
                        stackIn_35_0 = stackOut_34_0;
                        if (37 != var4) {
                          stackOut_36_0 = this;
                          stackOut_36_1 = 0;
                          stackIn_37_0 = stackOut_36_0;
                          stackIn_37_1 = stackOut_36_1;
                          break L4;
                        } else {
                          stackOut_35_0 = this;
                          stackOut_35_1 = 1;
                          stackIn_37_0 = stackOut_35_0;
                          stackIn_37_1 = stackOut_35_1;
                          break L4;
                        }
                      }
                      ((ko) this).field_d = stackIn_37_1 != 0;
                      break L3;
                    } else {
                      L5: {
                        if (13 == var5) {
                          break L5;
                        } else {
                          if (var5 != 11) {
                            if (9 == var5) {
                              break L5;
                            } else {
                              if (var5 != 10) {
                                if (12 != var5) {
                                  if (var5 != 17) {
                                    L6: {
                                      if (4 == var5) {
                                        break L6;
                                      } else {
                                        if (var5 == 1) {
                                          break L6;
                                        } else {
                                          if (var5 == 2) {
                                            L7: {
                                              ((ko) this).field_g = true;
                                              stackOut_44_0 = this;
                                              stackIn_46_0 = stackOut_44_0;
                                              stackIn_45_0 = stackOut_44_0;
                                              if (32 != var4) {
                                                stackOut_46_0 = this;
                                                stackOut_46_1 = 0;
                                                stackIn_47_0 = stackOut_46_0;
                                                stackIn_47_1 = stackOut_46_1;
                                                break L7;
                                              } else {
                                                stackOut_45_0 = this;
                                                stackOut_45_1 = 1;
                                                stackIn_47_0 = stackOut_45_0;
                                                stackIn_47_1 = stackOut_45_1;
                                                break L7;
                                              }
                                            }
                                            ((ko) this).field_d = stackIn_47_1 != 0;
                                            break L3;
                                          } else {
                                            L8: {
                                              if (var5 == 16) {
                                                break L8;
                                              } else {
                                                if (14 != var5) {
                                                  if (var5 != 5) {
                                                    if (var5 == 8) {
                                                      ((ko) this).field_c = true;
                                                      ((ko) this).field_d = true;
                                                      break L3;
                                                    } else {
                                                      if (var5 == 0) {
                                                        L9: {
                                                          stackOut_53_0 = this;
                                                          stackOut_53_1 = this;
                                                          stackIn_55_0 = stackOut_53_0;
                                                          stackIn_55_1 = stackOut_53_1;
                                                          stackIn_54_0 = stackOut_53_0;
                                                          stackIn_54_1 = stackOut_53_1;
                                                          if (var4 != 32) {
                                                            stackOut_55_0 = this;
                                                            stackOut_55_1 = this;
                                                            stackOut_55_2 = 0;
                                                            stackIn_56_0 = stackOut_55_0;
                                                            stackIn_56_1 = stackOut_55_1;
                                                            stackIn_56_2 = stackOut_55_2;
                                                            break L9;
                                                          } else {
                                                            stackOut_54_0 = this;
                                                            stackOut_54_1 = this;
                                                            stackOut_54_2 = 1;
                                                            stackIn_56_0 = stackOut_54_0;
                                                            stackIn_56_1 = stackOut_54_1;
                                                            stackIn_56_2 = stackOut_54_2;
                                                            break L9;
                                                          }
                                                        }
                                                        ((ko) this).field_d = stackIn_56_2 != 0;
                                                        ((ko) this).field_c = stackIn_56_2 != 0;
                                                        ((ko) this).field_g = true;
                                                        break L3;
                                                      } else {
                                                        if (var5 != 15) {
                                                          ((ko) this).field_g = true;
                                                          break L3;
                                                        } else {
                                                          ((ko) this).field_e = true;
                                                          break L3;
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    break L8;
                                                  }
                                                } else {
                                                  break L8;
                                                }
                                              }
                                            }
                                            L10: {
                                              ((ko) this).field_g = true;
                                              stackOut_48_0 = this;
                                              stackIn_50_0 = stackOut_48_0;
                                              stackIn_49_0 = stackOut_48_0;
                                              if (var4 != 33) {
                                                stackOut_50_0 = this;
                                                stackOut_50_1 = 0;
                                                stackIn_51_0 = stackOut_50_0;
                                                stackIn_51_1 = stackOut_50_1;
                                                break L10;
                                              } else {
                                                stackOut_49_0 = this;
                                                stackOut_49_1 = 1;
                                                stackIn_51_0 = stackOut_49_0;
                                                stackIn_51_1 = stackOut_49_1;
                                                break L10;
                                              }
                                            }
                                            ((ko) this).field_d = stackIn_51_1 != 0;
                                            break L3;
                                          }
                                        }
                                      }
                                    }
                                    L11: {
                                      ((ko) this).field_g = true;
                                      stackOut_40_0 = this;
                                      stackIn_42_0 = stackOut_40_0;
                                      stackIn_41_0 = stackOut_40_0;
                                      if (var4 != 37) {
                                        stackOut_42_0 = this;
                                        stackOut_42_1 = 0;
                                        stackIn_43_0 = stackOut_42_0;
                                        stackIn_43_1 = stackOut_42_1;
                                        break L11;
                                      } else {
                                        stackOut_41_0 = this;
                                        stackOut_41_1 = 1;
                                        stackIn_43_0 = stackOut_41_0;
                                        stackIn_43_1 = stackOut_41_1;
                                        break L11;
                                      }
                                    }
                                    ((ko) this).field_d = stackIn_43_1 != 0;
                                    break L3;
                                  } else {
                                    ((ko) this).field_d = true;
                                    ((ko) this).field_e = true;
                                    ((ko) this).field_g = true;
                                    ((ko) this).field_c = true;
                                    break L3;
                                  }
                                } else {
                                  break L5;
                                }
                              } else {
                                break L5;
                              }
                            }
                          } else {
                            break L5;
                          }
                        }
                      }
                      ((ko) this).field_e = true;
                      break L3;
                    }
                  }
                  if (df.field_I) {
                    ah.a((byte) -86, var3);
                    iq.a(var3, (byte) 99);
                    break L1;
                  } else {
                    return true;
                  }
                } else {
                  L12: {
                    var5_ref_fb = var7[var4];
                    if (var5_ref_fb == null) {
                      break L12;
                    } else {
                      var5_ref_fb.c((byte) 18);
                      break L12;
                    }
                  }
                  var4++;
                  continue L2;
                }
              }
            }
          }
          return true;
        }
    }

    final boolean b(int param0, int param1, int param2) {
        int var4 = 0;
        L0: {
          var4 = (param2 + -190) / 40;
          if (param1 > var4) {
            break L0;
          } else {
            if (var4 >= ((ko) this).field_m) {
              break L0;
            } else {
              if (null == ((ko) this).field_b[var4]) {
                break L0;
              } else {
                if (((ko) this).field_b[var4].a(param0, param2, (byte) -46)) {
                  return ((ko) this).b(17, var4);
                } else {
                  return false;
                }
              }
            }
          }
        }
        return false;
    }

    final boolean h(int param0) {
        if (!((ko) this).a((byte) -122)) {
          return false;
        } else {
          L0: {
            if (null == ((ko) this).field_b[((ko) this).field_l]) {
              break L0;
            } else {
              ((ko) this).field_b[((ko) this).field_l].c((byte) 18);
              break L0;
            }
          }
          ((ko) this).field_l = -1;
          ((ko) this).field_c = false;
          ((ko) this).field_d = false;
          ((ko) this).field_e = false;
          ((ko) this).field_g = false;
          if (param0 == 1) {
            return true;
          } else {
            return true;
          }
        }
    }

    final void a(int param0, id param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        ti var6 = null;
        wb var7 = null;
        int var8 = 0;
        int var9 = 0;
        ti stackIn_6_0 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        RuntimeException decompiledCaughtException = null;
        ti stackOut_5_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = ((ko) this).e(-1);
              if (!(param1 instanceof jj)) {
                L2: {
                  var6 = (ti) (Object) param1;
                  if (var6 instanceof wb) {
                    stackOut_5_0 = (ti) var6;
                    stackIn_6_0 = stackOut_5_0;
                    break L2;
                  } else {
                    stackOut_4_0 = null;
                    stackIn_6_0 = (ti) (Object) stackOut_4_0;
                    break L2;
                  }
                }
                var7 = (wb) (Object) stackIn_6_0;
                var8 = var5_int;
                if (var8 != 255) {
                  L3: {
                    if (var8 == 12) {
                      break L3;
                    } else {
                      if (var8 == 11) {
                        break L3;
                      } else {
                        L4: {
                          if (13 != var8) {
                            if (var8 != 10) {
                              if (var8 == 9) {
                                break L4;
                              } else {
                                if (var8 == 15) {
                                  break L4;
                                } else {
                                  if (var8 != 17) {
                                    if (3 != var8) {
                                      L5: {
                                        if (var8 != 1) {
                                          if (var8 != 2) {
                                            if (var8 != 4) {
                                              if (var8 == 14) {
                                                break L5;
                                              } else {
                                                if (var8 != 16) {
                                                  if (var8 != 5) {
                                                    if (var8 != 18) {
                                                      if (var8 != 7) {
                                                        if (var8 == 0) {
                                                          wd.a(var6.field_y, -1, ((ko) this).field_l, op.field_m.field_H, ma.field_a);
                                                          break L1;
                                                        } else {
                                                          wd.a(var6.field_y, -1, ((ko) this).field_l, op.field_m.field_H, ma.field_a);
                                                          break L1;
                                                        }
                                                      } else {
                                                        wd.a(var6.field_y, -1, ((ko) this).field_l, op.field_m.field_H, ma.field_a);
                                                        break L1;
                                                      }
                                                    } else {
                                                      break L5;
                                                    }
                                                  } else {
                                                    break L5;
                                                  }
                                                } else {
                                                  break L5;
                                                }
                                              }
                                            } else {
                                              break L5;
                                            }
                                          } else {
                                            break L5;
                                          }
                                        } else {
                                          break L5;
                                        }
                                      }
                                      L6: {
                                        if (var7 == null) {
                                          break L6;
                                        } else {
                                          if (!var7.o(88)) {
                                            wd.a(var6.field_y, -1, ((ko) this).field_l, op.field_m.field_H, ma.field_a);
                                            break L1;
                                          } else {
                                            break L6;
                                          }
                                        }
                                      }
                                      return;
                                    } else {
                                      L7: {
                                        if (var7 == null) {
                                          break L7;
                                        } else {
                                          if (!var7.q(-14945)) {
                                            break L7;
                                          } else {
                                            if (!var7.o(127)) {
                                              wd.a(var6.field_y, -1, ((ko) this).field_l, op.field_m.field_H, ma.field_a);
                                              break L1;
                                            } else {
                                              break L7;
                                            }
                                          }
                                        }
                                      }
                                      return;
                                    }
                                  } else {
                                    L8: {
                                      if (var6 != null) {
                                        param0 = -1;
                                        param2 = var6.field_y;
                                        break L8;
                                      } else {
                                        break L8;
                                      }
                                    }
                                    ok.a(-101, param0, ma.field_a, op.field_m.field_H, param2, ((ko) this).field_l);
                                    break L1;
                                  }
                                }
                              }
                            } else {
                              ok.a(-117, param0, ma.field_a, op.field_m.field_H, param2, ((ko) this).field_l);
                              break L1;
                            }
                          } else {
                            break L4;
                          }
                        }
                        ok.a(-117, param0, ma.field_a, op.field_m.field_H, param2, ((ko) this).field_l);
                        break L1;
                      }
                    }
                  }
                  int discarded$1 = 102;
                  nn.a(ma.field_a, op.field_m.field_H, ((ko) this).field_l);
                  break L1;
                } else {
                  return;
                }
              } else {
                wd.a(param1.field_y, -1, ((ko) this).field_l, op.field_m.field_H, ma.field_a);
                break L1;
              }
            }
            tg.field_e.field_b[((ko) this).field_l] = op.field_m.field_H - -op.field_m.a(ll.field_k.field_g[((ko) this).field_l], var5_int, fb.field_e.field_M, false);
            ((ko) this).field_b[((ko) this).field_l].a(0);
            ((ko) this).field_c = false;
            ((ko) this).field_g = false;
            if (param3 >= 112) {
              ((ko) this).field_l = -1;
              ((ko) this).field_e = false;
              ((ko) this).field_d = false;
              iq.a(-11, (byte) 99);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_62_0 = (RuntimeException) var5;
            stackOut_62_1 = new StringBuilder().append("ko.S(").append(param0).append(44);
            stackIn_64_0 = stackOut_62_0;
            stackIn_64_1 = stackOut_62_1;
            stackIn_63_0 = stackOut_62_0;
            stackIn_63_1 = stackOut_62_1;
            if (param1 == null) {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "null";
              stackIn_65_0 = stackOut_64_0;
              stackIn_65_1 = stackOut_64_1;
              stackIn_65_2 = stackOut_64_2;
              break L9;
            } else {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "{...}";
              stackIn_65_0 = stackOut_63_0;
              stackIn_65_1 = stackOut_63_1;
              stackIn_65_2 = stackOut_63_2;
              break L9;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_65_0, stackIn_65_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final boolean a(int param0) {
        if (param0 != 20) {
            field_j = null;
        }
        return ((ko) this).field_d;
    }

    final void b(int param0) {
        int var2 = 0;
        fb[] var3 = null;
        int var4 = 0;
        fb var5 = null;
        int var6 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = 110 / ((34 - param0) / 58);
        var3 = ((ko) this).field_b;
        var4 = 0;
        L0: while (true) {
          if (var3.length <= var4) {
            return;
          } else {
            var5 = var3[var4];
            if (var5 != null) {
              var5.field_b = false;
              var5.b(2);
              var5.c((byte) 18);
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    ko() {
        ((ko) this).field_d = false;
        ((ko) this).field_f = 0;
        ((ko) this).field_e = false;
        ((ko) this).field_g = false;
        ((ko) this).field_c = false;
        ((ko) this).field_a = -1;
        ((ko) this).field_b = new fb[8];
        ((ko) this).field_m = 0;
        ((ko) this).field_l = -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Waiting for sound effects";
        field_h = "Location";
        field_k = "Players: ";
        field_j = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
