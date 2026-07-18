/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj extends hb {
    ve field_G;
    static java.awt.Canvas field_D;
    int field_F;
    byte[] field_E;

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (param0 == 0) {
          return 0;
        } else {
          if (0 > param0) {
            throw new IllegalArgumentException("");
          } else {
            L0: {
              if (param1 == 2) {
                break L0;
              } else {
                field_D = null;
                break L0;
              }
            }
            if (param0 < 32768) {
              L1: {
                if (param0 >= 128) {
                  if (param0 >= 2048) {
                    if (8192 <= param0) {
                      var2 = 1;
                      break L1;
                    } else {
                      var2 = 2;
                      break L1;
                    }
                  } else {
                    if (param0 < 512) {
                      var2 = 4;
                      break L1;
                    } else {
                      var2 = 3;
                      break L1;
                    }
                  }
                } else {
                  if (param0 >= 8) {
                    if (32 <= param0) {
                      var2 = 5;
                      break L1;
                    } else {
                      var2 = 6;
                      break L1;
                    }
                  } else {
                    if (2 <= param0) {
                      var2 = 7;
                      break L1;
                    } else {
                      return 256;
                    }
                  }
                }
              }
              param0 = param0 << (var2 << 1);
              return tn.field_n[param0 + -32768] >> var2;
            } else {
              if (param0 < 131072) {
                return tn.field_n[-32768 + param0];
              } else {
                L2: {
                  if (33554432 > param0) {
                    if (param0 < 2097152) {
                      if (param0 < 524288) {
                        var2 = 1;
                        break L2;
                      } else {
                        var2 = 2;
                        break L2;
                      }
                    } else {
                      if (param0 >= 8388608) {
                        var2 = 4;
                        break L2;
                      } else {
                        var2 = 3;
                        break L2;
                      }
                    }
                  } else {
                    if (param0 >= 536870912) {
                      var2 = 7;
                      break L2;
                    } else {
                      if (134217728 <= param0) {
                        var2 = 6;
                        break L2;
                      } else {
                        var2 = 5;
                        break L2;
                      }
                    }
                  }
                }
                param0 = param0 >> (var2 << 1);
                return tn.field_n[-32768 + param0] << var2;
              }
            }
          }
        }
    }

    public static void h() {
        field_D = null;
    }

    final byte[] c(byte param0) {
        int var2 = -57 % ((4 - param0) / 52);
        if (((kj) this).field_u) {
            throw new RuntimeException();
        }
        return ((kj) this).field_E;
    }

    final int f(int param0) {
        if (param0 != -21546) {
            int discarded$0 = ((kj) this).f(-42);
        }
        if (((kj) this).field_u) {
            return 0;
        }
        return 100;
    }

    final static void a(boolean param0, boolean param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        mh var7 = null;
        int var7_int = 0;
        int var8 = 0;
        mh var8_ref_mh = null;
        int var9 = 0;
        rk var9_ref_rk = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        mh var14 = null;
        int stackIn_4_0 = 0;
        mh stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        mh stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        int stackIn_6_4 = 0;
        mh stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        int stackIn_7_5 = 0;
        int stackIn_47_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        mh stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        mh stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        int stackOut_6_5 = 0;
        mh stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_5_4 = 0;
        int stackOut_5_5 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_38_0 = 0;
        var13 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              kp.field_a = lb.field_c;
              fo.field_i = lb.field_d;
              if (!param1) {
                stackOut_3_0 = eg.field_m;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = pe.field_j;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              co.a(stackIn_4_0, false);
              sb.field_c.a(qa.field_w.field_Ib, 0, 88, 0, -40 + qa.field_w.field_cb + -2);
              um.field_b.a(np.field_a, 0, 0, ji.field_b.field_Ib, (byte) 64);
              stackOut_4_0 = rn.field_g;
              stackOut_4_1 = 18;
              stackOut_4_2 = np.field_a + 2;
              stackOut_4_3 = 0;
              stackOut_4_4 = ji.field_b.field_Ib;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              stackIn_6_3 = stackOut_4_3;
              stackIn_6_4 = stackOut_4_4;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              stackIn_5_3 = stackOut_4_3;
              stackIn_5_4 = stackOut_4_4;
              if (!vd.field_e) {
                stackOut_6_0 = (mh) (Object) stackIn_6_0;
                stackOut_6_1 = stackIn_6_1;
                stackOut_6_2 = stackIn_6_2;
                stackOut_6_3 = stackIn_6_3;
                stackOut_6_4 = stackIn_6_4;
                stackOut_6_5 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                stackIn_7_2 = stackOut_6_2;
                stackIn_7_3 = stackOut_6_3;
                stackIn_7_4 = stackOut_6_4;
                stackIn_7_5 = stackOut_6_5;
                break L2;
              } else {
                stackOut_5_0 = (mh) (Object) stackIn_5_0;
                stackOut_5_1 = stackIn_5_1;
                stackOut_5_2 = stackIn_5_2;
                stackOut_5_3 = stackIn_5_3;
                stackOut_5_4 = stackIn_5_4;
                stackOut_5_5 = 4 + (ec.field_J + 40);
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_7_2 = stackOut_5_2;
                stackIn_7_3 = stackOut_5_3;
                stackIn_7_4 = stackOut_5_4;
                stackIn_7_5 = stackOut_5_5;
                break L2;
              }
            }
            L3: {
              ((mh) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_7_2, stackIn_7_3, stackIn_7_4 + -stackIn_7_5, (byte) 64);
              wd.field_E.a(18, np.field_a + 2, -40 + (-2 + ji.field_b.field_Ib) + -ec.field_J, 42 - -ec.field_J, (byte) 64);
              vp.field_u.a(2, (byte) -109, ji.field_b.field_Ib, 0, np.field_a + 22, ec.field_J, -2 + ji.field_b.field_cb - (np.field_a - -20));
              ij.field_e.a(40, -40 + qa.field_w.field_cb, 0, qa.field_w.field_Ib, (byte) 64);
              ba.field_v.a(30, 0, 0, ak.field_d.field_Ib, (byte) 64);
              rg.field_e.a(-2 + (-40 + ak.field_d.field_cb) - 30, 30, 0, ak.field_d.field_Ib, (byte) 64);
              var2_int = cq.field_p + 3;
              if (w.field_n.length < 2) {
                var2_int--;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param1) {
                var2_int--;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var3 = -2 + (2 + (-15 + (rg.field_e.field_cb - (5 - (var2_int + 1) / 2)))) / (1 + var2_int);
              if (var3 > 30) {
                var3 = 30;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              var4 = -5 + (rg.field_e.field_cb - (5 - -((2 + var3) * var2_int)));
              if (var4 > 40) {
                var4 = 40;
                break L6;
              } else {
                break L6;
              }
            }
            jd.field_a.a(var4, 5, 5, -5 + (-5 + rg.field_e.field_Ib), (byte) 64);
            var5 = 5 - -var4 + 2;
            var6 = 0;
            L7: while (true) {
              if (4 + cq.field_p <= var6) {
                wi.field_j.a(-10 + (-120 + lb.field_d) - 14, 10, -360 + lb.field_c >> 1, 360, (byte) 64);
                pk.field_h.a(24, 0, 0, wi.field_j.field_Ib, (byte) 64);
                de.field_t.a(-24 + wi.field_j.field_cb, 24, 0, wi.field_j.field_Ib, (byte) 64);
                de.field_t.field_Jb = na.a(false, 8421504, 3, 11579568, de.field_t.field_cb, 1);
                vn.field_A.a(de.field_t.field_cb - 36, 5, 5, -10 + de.field_t.field_Ib, (byte) 64);
                nd.field_a.a(24, -29 + de.field_t.field_cb, (de.field_t.field_Ib + -80) / 2, 80, (byte) 64);
                s.b(125);
                break L0;
              } else {
                L8: {
                  L9: {
                    if (var6 != 1) {
                      break L9;
                    } else {
                      if (w.field_n.length >= 2) {
                        break L9;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L10: {
                    if (var6 != 3) {
                      break L10;
                    } else {
                      if (pe.field_t > 1) {
                        break L10;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L11: {
                    if (param1) {
                      break L11;
                    } else {
                      if (3 == var6) {
                        var14 = gb.field_l[var6];
                        var7 = gb.field_l[var6];
                        gb.field_l[var6].field_cb = 0;
                        var14.field_Ib = 0;
                        var8 = 0;
                        L12: while (true) {
                          if (ab.field_A[var6].length <= var8) {
                            break L8;
                          } else {
                            L13: {
                              if (null == ab.field_A[var6][var8]) {
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                            var8++;
                            continue L12;
                          }
                        }
                      } else {
                        break L11;
                      }
                    }
                  }
                  L14: {
                    if (!param1) {
                      break L14;
                    } else {
                      if (0 != var6) {
                        break L14;
                      } else {
                        var7 = gb.field_l[var6];
                        gb.field_l[var6].field_cb = 0;
                        var7.field_Ib = 0;
                        var8 = 0;
                        L15: while (true) {
                          if (var8 >= ab.field_A[var6].length) {
                            break L8;
                          } else {
                            L16: {
                              if (null == ab.field_A[var6][var8]) {
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                            var8++;
                            continue L15;
                          }
                        }
                      }
                    }
                  }
                  L17: {
                    if (param1) {
                      if (var6 >= 4) {
                        if (me.field_f != null) {
                          if (me.field_f[var6 + -4]) {
                            stackOut_45_0 = 1;
                            stackIn_47_0 = stackOut_45_0;
                            break L17;
                          } else {
                            stackOut_44_0 = 0;
                            stackIn_47_0 = stackOut_44_0;
                            break L17;
                          }
                        } else {
                          stackOut_42_0 = 0;
                          stackIn_47_0 = stackOut_42_0;
                          break L17;
                        }
                      } else {
                        stackOut_40_0 = 0;
                        stackIn_47_0 = stackOut_40_0;
                        break L17;
                      }
                    } else {
                      stackOut_38_0 = 0;
                      stackIn_47_0 = stackOut_38_0;
                      break L17;
                    }
                  }
                  var7_int = stackIn_47_0;
                  if (var7_int == 0) {
                    L18: {
                      gb.field_l[var6].a(var3, var5, 5, 103, (byte) 64);
                      var8 = 110;
                      if (!param1) {
                        if (null == ab.field_A[var6][0]) {
                          break L18;
                        } else {
                          var9_ref_rk = ab.field_A[var6][0];
                          ab.field_A[var6][0].field_cb = 0;
                          var9_ref_rk.field_Ib = 0;
                          break L18;
                        }
                      } else {
                        ab.field_A[var6][0].a(-10411, var5, 2, kn.field_z, var8, var3, 38);
                        var8 += 40;
                        break L18;
                      }
                    }
                    var9 = 2 + (ak.field_d.field_Ib - (5 - -var8));
                    var10 = ab.field_A[var6].length - 1;
                    var11 = 0;
                    L19: while (true) {
                      if (var10 <= var11) {
                        var5 = var5 + (var3 + 2);
                        break L8;
                      } else {
                        var12 = var11 * var9 / var10;
                        ab.field_A[var6][1 + var11].a(-10411, var5, 2, kn.field_z, var12 + var8, var3, var9 * (var11 + 1) / var10 + -2 - var12);
                        var11++;
                        continue L19;
                      }
                    }
                  } else {
                    var8_ref_mh = gb.field_l[var6];
                    gb.field_l[var6].field_cb = 0;
                    var8_ref_mh.field_Ib = 0;
                    var9 = 0;
                    L20: while (true) {
                      if (ab.field_A[var6].length <= var9) {
                        break L8;
                      } else {
                        L21: {
                          if (ab.field_A[var6][var9] == null) {
                            break L21;
                          } else {
                            break L21;
                          }
                        }
                        var9++;
                        continue L20;
                      }
                    }
                  }
                }
                var6++;
                continue L7;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var2, "kj.E(" + true + ',' + param1 + ')');
        }
    }

    final static void a(int param0, vl param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var3_int = -1;
            L1: while (true) {
              if (var3_int >= param0 + 1) {
                break L0;
              } else {
                var4 = -1;
                L2: while (true) {
                  if (31 <= var4) {
                    var3_int++;
                    continue L1;
                  } else {
                    L3: {
                      if (var4 == -1) {
                        break L3;
                      } else {
                        if (var3_int == -1) {
                          break L3;
                        } else {
                          L4: {
                            if (param0 != var3_int) {
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          var4++;
                          continue L2;
                        }
                      }
                    }
                    var5 = var3_int * 34 << 8;
                    var6 = 16 * var4 << 8;
                    param1.a((nm) (Object) new on(var5, var6, 0, 0, 1, 1, 0, 0), (byte) 3);
                    var4++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("kj.A(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + 16 + ')');
        }
    }

    kj() {
    }

    static {
    }
}
