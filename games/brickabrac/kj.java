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
                if ((param0 ^ -1) <= -129) {
                  if (-2049 >= (param0 ^ -1)) {
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
              param0 = param0 << (var2 << 12047105);
              return tn.field_n[param0 + -32768] >> var2;
            } else {
              if (param0 > -131073) {
                return tn.field_n[-32768 + param0];
              } else {
                L2: {
                  if (33554432 > param0) {
                    if (-2097153 < param0) {
                      if (-524289 < (param0 ^ -1)) {
                        var2 = 1;
                        break L2;
                      } else {
                        var2 = 2;
                        break L2;
                      }
                    } else {
                      if (-8388609 <= param0) {
                        var2 = 4;
                        break L2;
                      } else {
                        var2 = 3;
                        break L2;
                      }
                    }
                  } else {
                    if (-536870913 <= param0) {
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
                param0 = param0 >> (var2 << -356583007);
                return tn.field_n[-32768 + param0] << var2;
              }
            }
          }
        }
    }

    public static void h(int param0) {
        if (param0 > -17) {
            field_D = null;
        }
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
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        mh var7 = null;
        int var7_int = 0;
        int var8 = 0;
        mh var8_ref_mh = null;
        int var9_int = 0;
        rk var9 = null;
        int var10 = 0;
        rk var10_ref_rk = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        mh var14 = null;
        int stackIn_3_0 = 0;
        mh stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        int stackIn_4_4 = 0;
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
        int stackIn_6_5 = 0;
        int stackIn_49_0 = 0;
        mh stackIn_72_0 = null;
        mh stackIn_73_0 = null;
        mh stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        int stackOut_2_0;
        int stackOut_1_0;
        mh stackOut_3_0;
        int stackOut_3_1;
        int stackOut_3_2;
        int stackOut_3_3;
        int stackOut_3_4;
        mh stackOut_5_0;
        int stackOut_5_1;
        int stackOut_5_2;
        int stackOut_5_3;
        int stackOut_5_4;
        int stackOut_5_5;
        mh stackOut_4_0;
        int stackOut_4_1;
        int stackOut_4_2;
        int stackOut_4_3;
        int stackOut_4_4;
        int stackOut_4_5;
        mh stackOut_71_0;
        mh stackOut_73_0;
        int stackOut_73_1;
        mh stackOut_72_0;
        int stackOut_72_1;
        int stackOut_47_0;
        int stackOut_46_0;
        int stackOut_44_0;
        int stackOut_42_0;
        int stackOut_40_0;
        L0: {
          var13 = BrickABrac.field_J ? 1 : 0;
          kp.field_a = lb.field_c;
          fo.field_i = lb.field_d;
          if (!param1) {
            stackOut_2_0 = eg.field_m;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = pe.field_j;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          co.a(stackIn_3_0, false);
          sb.field_c.a(qa.field_w.field_Ib, 0, 88, 0, -40 + qa.field_w.field_cb + -2);
          um.field_b.a(np.field_a, 0, 0, ji.field_b.field_Ib, (byte) 64);
          stackOut_3_0 = rn.field_g;
          stackOut_3_1 = 18;
          stackOut_3_2 = np.field_a + 2;
          stackOut_3_3 = 0;
          stackOut_3_4 = ji.field_b.field_Ib;
          stackIn_5_0 = stackOut_3_0;
          stackIn_5_1 = stackOut_3_1;
          stackIn_5_2 = stackOut_3_2;
          stackIn_5_3 = stackOut_3_3;
          stackIn_5_4 = stackOut_3_4;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          stackIn_4_2 = stackOut_3_2;
          stackIn_4_3 = stackOut_3_3;
          stackIn_4_4 = stackOut_3_4;
          if (!vd.field_e) {
            stackOut_5_0 = (mh) (Object) stackIn_5_0;
            stackOut_5_1 = stackIn_5_1;
            stackOut_5_2 = stackIn_5_2;
            stackOut_5_3 = stackIn_5_3;
            stackOut_5_4 = stackIn_5_4;
            stackOut_5_5 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            stackIn_6_2 = stackOut_5_2;
            stackIn_6_3 = stackOut_5_3;
            stackIn_6_4 = stackOut_5_4;
            stackIn_6_5 = stackOut_5_5;
            break L1;
          } else {
            stackOut_4_0 = (mh) (Object) stackIn_4_0;
            stackOut_4_1 = stackIn_4_1;
            stackOut_4_2 = stackIn_4_2;
            stackOut_4_3 = stackIn_4_3;
            stackOut_4_4 = stackIn_4_4;
            stackOut_4_5 = 4 + (ec.field_J + 40);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_6_2 = stackOut_4_2;
            stackIn_6_3 = stackOut_4_3;
            stackIn_6_4 = stackOut_4_4;
            stackIn_6_5 = stackOut_4_5;
            break L1;
          }
        }
        L2: {
          ((mh) (Object) stackIn_6_0).a(stackIn_6_1, stackIn_6_2, stackIn_6_3, stackIn_6_4 + -stackIn_6_5, (byte) 64);
          if (param0) {
            break L2;
          } else {
            field_D = null;
            break L2;
          }
        }
        L3: {
          wd.field_E.a(18, np.field_a + 2, -40 + (-2 + ji.field_b.field_Ib) + -ec.field_J, 42 - -ec.field_J, (byte) 64);
          vp.field_u.a(2, (byte) -109, ji.field_b.field_Ib, 0, np.field_a + 2 + 20, ec.field_J, -2 + ji.field_b.field_cb - (np.field_a - -20));
          ij.field_e.a(40, -40 + qa.field_w.field_cb, 0, qa.field_w.field_Ib, (byte) 64);
          ba.field_v.a(30, 0, 0, ak.field_d.field_Ib, (byte) 64);
          rg.field_e.a(-2 + (-40 + ak.field_d.field_cb) - 30, 30, 0, ak.field_d.field_Ib, (byte) 64);
          var2 = cq.field_p + 3;
          if ((w.field_n.length ^ -1) > -3) {
            var2--;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (param1) {
            var2--;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          var3 = -2 + (2 + (-15 + (rg.field_e.field_cb - (5 - (var2 + 1) / 2)))) / (1 + var2);
          if (-31 > (var3 ^ -1)) {
            var3 = 30;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          var4 = -5 + (rg.field_e.field_cb - (5 - -((2 + var3) * var2)));
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
            L8: {
              wi.field_j.a(-10 + (-120 + lb.field_d) + -4 - 10, 10, -360 + lb.field_c >> 817682625, 360, (byte) 64);
              pk.field_h.a(24, 0, 0, wi.field_j.field_Ib, (byte) 64);
              de.field_t.a(-24 + wi.field_j.field_cb, 24, 0, wi.field_j.field_Ib, (byte) 64);
              stackOut_71_0 = de.field_t;
              stackIn_73_0 = stackOut_71_0;
              stackIn_72_0 = stackOut_71_0;
              if (param0) {
                stackOut_73_0 = (mh) (Object) stackIn_73_0;
                stackOut_73_1 = 0;
                stackIn_74_0 = stackOut_73_0;
                stackIn_74_1 = stackOut_73_1;
                break L8;
              } else {
                stackOut_72_0 = (mh) (Object) stackIn_72_0;
                stackOut_72_1 = 1;
                stackIn_74_0 = stackOut_72_0;
                stackIn_74_1 = stackOut_72_1;
                break L8;
              }
            }
            ((mh) (Object) stackIn_74_0).field_Jb = na.a(stackIn_74_1 != 0, 8421504, 3, 11579568, de.field_t.field_cb, 1);
            vn.field_A.a(de.field_t.field_cb + -10 + -26, 5, 5, -10 + de.field_t.field_Ib, (byte) 64);
            nd.field_a.a(24, -29 + de.field_t.field_cb, (de.field_t.field_Ib + -80) / 2, 80, (byte) 64);
            s.b(125);
            return;
          } else {
            L9: {
              if (var6 != 1) {
                break L9;
              } else {
                if (w.field_n.length >= 2) {
                  break L9;
                } else {
                  var6++;
                  continue L7;
                }
              }
            }
            L10: {
              if ((var6 ^ -1) != -4) {
                break L10;
              } else {
                if ((pe.field_t ^ -1) < -2) {
                  break L10;
                } else {
                  var6++;
                  continue L7;
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
                    if (ab.field_A[var6].length > var8) {
                      if (null != ab.field_A[var6][var8]) {
                        var9 = ab.field_A[var6][var8];
                        ab.field_A[var6][var8].field_cb = 0;
                        var9.field_Ib = 0;
                        var8++;
                        continue L12;
                      } else {
                        var8++;
                        continue L12;
                      }
                    } else {
                      var6++;
                      continue L7;
                    }
                  }
                } else {
                  break L11;
                }
              }
            }
            L13: {
              if (!param1) {
                break L13;
              } else {
                if (0 != var6) {
                  break L13;
                } else {
                  var7 = gb.field_l[var6];
                  gb.field_l[var6].field_cb = 0;
                  var7.field_Ib = 0;
                  var8 = 0;
                  L14: while (true) {
                    if (var8 < ab.field_A[var6].length) {
                      if (null != ab.field_A[var6][var8]) {
                        var9 = ab.field_A[var6][var8];
                        ab.field_A[var6][var8].field_cb = 0;
                        var9.field_Ib = 0;
                        var8++;
                        continue L14;
                      } else {
                        var8++;
                        continue L14;
                      }
                    } else {
                      var6++;
                      continue L7;
                    }
                  }
                }
              }
            }
            L15: {
              if (param1) {
                if (-5 >= (var6 ^ -1)) {
                  if (me.field_f != null) {
                    if (me.field_f[var6 + -4]) {
                      stackOut_47_0 = 1;
                      stackIn_49_0 = stackOut_47_0;
                      break L15;
                    } else {
                      stackOut_46_0 = 0;
                      stackIn_49_0 = stackOut_46_0;
                      break L15;
                    }
                  } else {
                    stackOut_44_0 = 0;
                    stackIn_49_0 = stackOut_44_0;
                    break L15;
                  }
                } else {
                  stackOut_42_0 = 0;
                  stackIn_49_0 = stackOut_42_0;
                  break L15;
                }
              } else {
                stackOut_40_0 = 0;
                stackIn_49_0 = stackOut_40_0;
                break L15;
              }
            }
            var7_int = stackIn_49_0;
            if (var7_int == 0) {
              L16: {
                gb.field_l[var6].a(var3, var5, 5, 103, (byte) 64);
                var8 = 110;
                if (!param1) {
                  if (null == ab.field_A[var6][0]) {
                    break L16;
                  } else {
                    var9 = ab.field_A[var6][0];
                    ab.field_A[var6][0].field_cb = 0;
                    var9.field_Ib = 0;
                    break L16;
                  }
                } else {
                  ab.field_A[var6][0].a(-10411, var5, 2, kn.field_z, var8, var3, 38);
                  var8 += 40;
                  break L16;
                }
              }
              var9_int = 2 + (ak.field_d.field_Ib - (5 - -var8));
              var10 = ab.field_A[var6].length - 1;
              var11 = 0;
              L17: while (true) {
                if (var10 <= var11) {
                  var5 = var5 + (var3 + 2);
                  var6++;
                  continue L7;
                } else {
                  var12 = var11 * var9_int / var10;
                  ab.field_A[var6][1 + var11].a(-10411, var5, 2, kn.field_z, var12 + var8, var3, var9_int * (var11 + 1) / var10 + -2 - var12);
                  var11++;
                  continue L17;
                }
              }
            } else {
              var8_ref_mh = gb.field_l[var6];
              gb.field_l[var6].field_cb = 0;
              var8_ref_mh.field_Ib = 0;
              var9_int = 0;
              L18: while (true) {
                if (ab.field_A[var6].length > var9_int) {
                  if (ab.field_A[var6][var9_int] != null) {
                    var10_ref_rk = ab.field_A[var6][var9_int];
                    ab.field_A[var6][var9_int].field_cb = 0;
                    var10_ref_rk.field_Ib = 0;
                    var9_int++;
                    continue L18;
                  } else {
                    var9_int++;
                    continue L18;
                  }
                } else {
                  var6++;
                  continue L7;
                }
              }
            }
          }
        }
    }

    final static void a(int param0, vl param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = BrickABrac.field_J ? 1 : 0;
          var3 = -1;
          if (param2 == 16) {
            break L0;
          } else {
            field_D = null;
            break L0;
          }
        }
        L1: while (true) {
          if (var3 >= param0 + 1) {
            return;
          } else {
            var4 = -1;
            L2: while (true) {
              if (31 <= var4) {
                var3++;
                continue L1;
              } else {
                L3: {
                  if (var4 == -1) {
                    break L3;
                  } else {
                    if (var3 == -1) {
                      break L3;
                    } else {
                      if (param0 == var3) {
                        break L3;
                      } else {
                        var4++;
                        continue L2;
                      }
                    }
                  }
                }
                var5 = var3 * 34 << -816056120;
                var6 = 16 * var4 << -1063517016;
                param1.a((nm) (Object) new on(var5, var6, 0, 0, 1, 1, 0, 0), (byte) 3);
                var4++;
                continue L2;
              }
            }
          }
        }
    }

    kj() {
    }

    static {
    }
}
