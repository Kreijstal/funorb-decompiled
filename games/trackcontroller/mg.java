/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg {
    static int field_f;
    static vl field_b;
    private int field_c;
    cd field_e;
    private int field_h;
    static boolean field_a;
    private int field_d;
    private int field_g;

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ea var7 = null;
        int var8 = 0;
        L0: {
          var8 = TrackController.field_F ? 1 : 0;
          ii.field_o = ii.field_o + 1;
          if (he.field_f[this.field_c] != null) {
            he.field_f[this.field_c].a(true, 90);
            break L0;
          } else {
            break L0;
          }
        }
        var2 = this.b((byte) 125);
        var3 = mb.field_b + -var2;
        if (param0 == -99) {
          L1: {
            if ((var3 ^ -1) < -1) {
              var3 = (var3 << -1093296957) - var3 >> -1082305245;
              break L1;
            } else {
              if ((var3 ^ -1) <= -1) {
                break L1;
              } else {
                var3 = -(var3 + (-var3 << -1050873693) >> -1639533501);
                break L1;
              }
            }
          }
          mb.field_b = var3 + var2;
          L2: while (true) {
            if (!mh.e(127)) {
              L3: {
                this.field_e.a(-118, this.a((byte) 6, kf.field_b, fg.field_a), this.a((byte) 6, db.field_X, wg.field_e));
                if ((this.field_e.field_e ^ -1) != 0) {
                  this.a(this.field_e.field_e, false, true);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                L5: {
                  if (this.field_c == 2) {
                    break L5;
                  } else {
                    if (-4 != (this.field_c ^ -1)) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  var4 = -1;
                  var5 = -1;
                  if ((kf.field_b ^ -1) > -577) {
                    break L6;
                  } else {
                    if (kf.field_b < 602) {
                      L7: {
                        if (67 > fg.field_a) {
                          break L7;
                        } else {
                          if (-94 >= (fg.field_a ^ -1)) {
                            break L7;
                          } else {
                            var4 = 0;
                            break L7;
                          }
                        }
                      }
                      if ((fg.field_a ^ -1) > -432) {
                        break L6;
                      } else {
                        if (457 <= fg.field_a) {
                          break L6;
                        } else {
                          var4 = 1;
                          break L6;
                        }
                      }
                    } else {
                      break L6;
                    }
                  }
                }
                L8: {
                  if (null != this.a(kf.field_b, 2600, fg.field_a)) {
                    var4 = 2;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if ((db.field_X ^ -1) > -577) {
                    break L9;
                  } else {
                    if ((db.field_X ^ -1) <= -603) {
                      break L9;
                    } else {
                      L10: {
                        if (67 > wg.field_e) {
                          break L10;
                        } else {
                          if (-94 >= (wg.field_e ^ -1)) {
                            break L10;
                          } else {
                            var5 = 0;
                            break L10;
                          }
                        }
                      }
                      if ((wg.field_e ^ -1) > -432) {
                        break L9;
                      } else {
                        if (457 > wg.field_e) {
                          var5 = 1;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                }
                L11: {
                  if (this.a(db.field_X, 2600, wg.field_e) == null) {
                    break L11;
                  } else {
                    var5 = 2;
                    break L11;
                  }
                }
                L12: {
                  if (-1 == (uk.field_a ^ -1)) {
                    break L12;
                  } else {
                    tc.field_b = var5;
                    break L12;
                  }
                }
                L13: {
                  if (this.field_e.e(0)) {
                    break L13;
                  } else {
                    L14: {
                      if (this.field_e.field_a) {
                        break L14;
                      } else {
                        if (!field_a) {
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    if (0 <= var4) {
                      tc.field_b = var4;
                      this.field_e.field_a = true;
                      break L13;
                    } else {
                      if (!this.field_e.field_a) {
                        break L13;
                      } else {
                        tc.field_b = -1;
                        break L13;
                      }
                    }
                  }
                }
                L15: {
                  if (!this.field_e.d(0)) {
                    break L15;
                  } else {
                    L16: {
                      var6 = qh.field_b.field_x;
                      var7 = this.a(db.field_X, 2600, wg.field_e);
                      if (var7 != null) {
                        this.field_e.field_a = true;
                        qh.field_b = var7;
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    var6 = var6 - qh.field_b.field_x;
                    mb.field_b = mb.field_b - var6 * 26;
                    break L15;
                  }
                }
                if (this.field_e.b(false)) {
                  L17: {
                    L18: {
                      var6 = qh.field_b.field_x;
                      if (tc.field_b != 0) {
                        break L18;
                      } else {
                        if (qh.field_b.field_x <= 1) {
                          break L18;
                        } else {
                          qh.field_b = gj.field_f[-2 + qh.field_b.field_x];
                          break L17;
                        }
                      }
                    }
                    if (-2 != (tc.field_b ^ -1)) {
                      break L17;
                    } else {
                      if ((gj.field_f.length ^ -1) < (qh.field_b.field_x ^ -1)) {
                        qh.field_b = gj.field_f[qh.field_b.field_x];
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                  }
                  var6 = var6 - qh.field_b.field_x;
                  mb.field_b = mb.field_b - var6 * 26;
                  break L4;
                } else {
                  break L4;
                }
              }
              L19: {
                if (-1 == (uk.field_a ^ -1)) {
                  break L19;
                } else {
                  this.field_g = wg.field_e;
                  this.field_h = db.field_X;
                  break L19;
                }
              }
              L20: {
                var4 = -1;
                var5 = this.a((byte) 6, kf.field_b, fg.field_a);
                if ((var5 ^ -1) != 0) {
                  var4 = this.b(79, var5);
                  break L20;
                } else {
                  break L20;
                }
              }
              qc.a(var4, (byte) 20);
              return;
            } else {
              this.d((byte) -55);
              continue L2;
            }
          }
        } else {
          return;
        }
    }

    private final int b(byte param0) {
        if (param0 != 125) {
            field_f = 111;
        }
        int var2 = 0;
        if (8 > qh.field_b.field_x) {
            var2 = -208 + qh.field_b.field_x * 26;
        }
        if (!((qh.field_b.field_x ^ -1) >= -25)) {
            var2 = (-24 + qh.field_b.field_x) * 26;
        }
        return var2;
    }

    final static int a(byte param0) {
        if (param0 != -29) {
            field_b = (vl) null;
        }
        return mb.field_f;
    }

    final static int b(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_6_0 = 0;
        var8 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = param1;
            var4 = me.field_q;
            L1: while (true) {
              if ((var3_int ^ -1) <= (sa.field_I.length ^ -1)) {
                stackOut_11_0 = -1;
                stackIn_12_0 = stackOut_11_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L2: {
                  var5 = mj.field_b[var3_int];
                  if (var5 < 0) {
                    var4 = var4 + dh.field_l;
                    break L2;
                  } else {
                    var6 = ib.a(true, param1 ^ 10, sa.field_I[var3_int]);
                    var7 = -(var6 >> -1166239359) + sf.field_F;
                    var4 = var4 + na.field_e;
                    if (eb.a(-mb.field_c + var7, param0, param1 ^ 10, (mb.field_c << -480204159) + var6, var4, param2, pc.field_m + (of.field_f << 1229507137))) {
                      stackOut_6_0 = var5;
                      stackIn_7_0 = stackOut_6_0;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var4 = var4 + (pc.field_m + ((of.field_f << 1629406145) - -na.field_e));
                      break L2;
                    }
                  }
                }
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var3), "mg.M(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_12_0;
        }
    }

    private final ea a(int param0, int param1, int param2) {
        int var4 = 0;
        param0 -= 359;
        param2 = param2 - (bk.field_E.field_u + 62);
        if ((param0 ^ -1) <= -1) {
            if (param0 < 182) {
                if (-1 >= (param2 ^ -1)) {
                    if (param2 < 390) {
                        var4 = qh.field_b.field_x - (-((param2 - (mb.field_b - 2600)) / 26) + 100 + 8);
                        if (-1 >= (var4 ^ -1)) {
                            if (!(gj.field_f.length <= var4)) {
                                return gj.field_f[var4];
                            }
                        }
                    }
                }
            }
        }
        if (param1 == 2600) {
            return null;
        }
        return (ea) null;
    }

    private final void a(int param0, boolean param1, boolean param2) {
        this.a(param1, param2, param0, 390);
    }

    private final void c(byte param0) {
        int discarded$1 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        qj var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        oh var10 = null;
        oh var11 = null;
        L0: {
          var9 = TrackController.field_F ? 1 : 0;
          if (param0 == -114) {
            break L0;
          } else {
            this.field_d = 37;
            break L0;
          }
        }
        L1: {
          var10 = bk.field_E;
          var11 = var10;
          al.field_z[2].e(-al.field_z[2].field_t + 640 >> -268308351, 1);
          var3 = 74;
          if (rd.field_b == 0) {
            var3 += 20;
            var3 = var3 + var11.a(tf.field_b, 34, -var11.field_q + var3, 572, 1000, 0, -1, 3, 0, 26) * 26;
            var3 += 26;
            discarded$1 = var11.a(gh.field_e, 34, -var11.field_q + var3, 572, 1000, 0, -1, 3, 0, 26);
            break L1;
          } else {
            if (1 == rd.field_b) {
              var4 = 0;
              L2: while (true) {
                if ((ja.field_a.length ^ -1) >= (var4 ^ -1)) {
                  break L1;
                } else {
                  L3: {
                    var5 = ja.field_a[var4];
                    if (3 == var5) {
                      var6_int = ii.field_o / 5 % ri.field_H.length;
                      var5 = ri.field_H[var6_int];
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  ll.f(46, -1 + var3, 28, 28, 16763904);
                  var6 = ii.field_r[var5];
                  var6.h(47, var3);
                  var7 = 86;
                  var8 = var10.a(me.field_p[var4], var7, -6 + (var3 + 26) + -var11.field_G, 606 - var7, 1000, 0, -1, 0, 0, 26);
                  var3 = var3 + (var8 * 26 + 26);
                  var4++;
                  continue L2;
                }
              }
            } else {
              break L1;
            }
          }
        }
        var11.a(be.a((byte) 22, 2, 1 + rd.field_b), 606, 406, 0, -1);
    }

    private final void d(int param0) {
        int var2_int = 0;
        String var2 = null;
        int var3 = 0;
        String[] var3_ref_String__ = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        Object var10 = null;
        int var11 = 0;
        ra var12 = null;
        int var13 = 0;
        int[] var17 = null;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        int stackIn_8_4 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        int stackOut_3_4 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        int stackOut_7_4 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        var13 = TrackController.field_F ? 1 : 0;
        var2_int = 0;
        L0: while (true) {
          if ((var2_int ^ -1) <= -12) {
            L1: {
              ll.f(152, 75, 206, 284, 3352864);
              ll.f(386, 75, 102, 284, 3352864);
              if (jj.s(23)) {
                var2 = nd.field_I;
                bk.field_E.b(hh.field_b, 320, 406, 0, -1);
                break L1;
              } else {
                L2: {
                  if (null != g.field_w) {
                    break L2;
                  } else {
                    g.field_w = hj.a(3, 10, 1, 10, (byte) -102);
                    break L2;
                  }
                }
                L3: {
                  if (g.field_w.field_o) {
                    if (g.field_w.field_m != null) {
                      var2 = nd.field_I;
                      var3_ref_String__ = g.field_w.field_m[di.field_i];
                      var4 = -1;
                      var17 = g.field_w.field_n[di.field_i];
                      var6 = 94;
                      var7 = 0;
                      L4: while (true) {
                        if (var7 > 10) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              var8 = 0;
                              var9 = null;
                              if ((var7 ^ -1) != -11) {
                                if (var3_ref_String__[var7] != null) {
                                  L7: {
                                    var2 = "";
                                    var8 = var17[var7];
                                    if (-1 >= (var4 ^ -1)) {
                                      break L7;
                                    } else {
                                      if (var3_ref_String__[var7] != ue.field_a) {
                                        break L7;
                                      } else {
                                        if (null == rk.field_bb) {
                                          break L7;
                                        } else {
                                          if ((rk.field_bb.field_j ^ -1L) != (g.field_w.field_q[di.field_i][var7] ^ -1L)) {
                                            break L7;
                                          } else {
                                            if (ua.field_L == null) {
                                              break L7;
                                            } else {
                                              if (var17[var7] == ua.field_L.field_O) {
                                                var4 = var7;
                                                break L7;
                                              } else {
                                                break L7;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var9 = var3_ref_String__[var7];
                                  break L6;
                                } else {
                                  break L6;
                                }
                              } else {
                                if (0 > var4) {
                                  if (null != ua.field_L) {
                                    var8 = ua.field_L.field_O;
                                    var4 = var7;
                                    var9 = ue.field_a;
                                    break L6;
                                  } else {
                                    break L5;
                                  }
                                } else {
                                  break L5;
                                }
                              }
                            }
                            L8: {
                              if (var9 != null) {
                                L9: {
                                  var10 = var9;
                                  var11 = 0;
                                  if (var7 != var4) {
                                    break L9;
                                  } else {
                                    if (null == he.field_f[this.field_c]) {
                                      var11 = 1;
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                L10: {
                                  if (var7 < 10) {
                                    bk.field_E.a(var7 - -1 + ". ", 181, var6, var11, -1);
                                    break L10;
                                  } else {
                                    break L10;
                                  }
                                }
                                bk.field_E.c((String) (var10), 181, var6, var11, -1);
                                bk.field_E.a(Integer.toString(var8), 487, var6, var11, -1);
                                if (var4 != var7) {
                                  break L8;
                                } else {
                                  if (he.field_f[this.field_c] != null) {
                                    var12 = he.field_f[this.field_c];
                                    var12.a(468 + var12.field_a, var12.field_f + 26 * (1 - -var7), 0, 4);
                                    var12.a(104 + var12.field_a, 26 * (1 - -var7) + var12.field_f, 0, 3);
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                              } else {
                                break L8;
                              }
                            }
                            var6 += 26;
                            break L5;
                          }
                          var7++;
                          continue L4;
                        }
                      }
                    } else {
                      var2 = oi.field_e;
                      break L3;
                    }
                  } else {
                    var2 = f.field_d;
                    break L3;
                  }
                }
                bk.field_E.b(ad.field_s, 320, 406, 0, -1);
                break L1;
              }
            }
            L11: {
              if (param0 <= -4) {
                break L11;
              } else {
                this.a(52, false, false);
                break L11;
              }
            }
            var3 = 224;
            bk.field_E.b(var2, 255, var3, 0, -1);
            return;
          } else {
            L12: {
              stackOut_2_0 = 151;
              stackOut_2_1 = 48 - -(var2_int * 26) - -26;
              stackOut_2_2 = 208;
              stackOut_2_3 = 26;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_4_2 = stackOut_2_2;
              stackIn_4_3 = stackOut_2_3;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              stackIn_3_2 = stackOut_2_2;
              stackIn_3_3 = stackOut_2_3;
              if (-1 == (var2_int & 1 ^ -1)) {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = stackIn_4_1;
                stackOut_4_2 = stackIn_4_2;
                stackOut_4_3 = stackIn_4_3;
                stackOut_4_4 = 9073738;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                stackIn_5_2 = stackOut_4_2;
                stackIn_5_3 = stackOut_4_3;
                stackIn_5_4 = stackOut_4_4;
                break L12;
              } else {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = stackIn_3_2;
                stackOut_3_3 = stackIn_3_3;
                stackOut_3_4 = 6048056;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                stackIn_5_2 = stackOut_3_2;
                stackIn_5_3 = stackOut_3_3;
                stackIn_5_4 = stackOut_3_4;
                break L12;
              }
            }
            L13: {
              ll.c(stackIn_5_0, stackIn_5_1, stackIn_5_2, stackIn_5_3, stackIn_5_4);
              stackOut_5_0 = 385;
              stackOut_5_1 = 26 * (var2_int + 1) + 48;
              stackOut_5_2 = 104;
              stackOut_5_3 = 26;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              stackIn_7_3 = stackOut_5_3;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              stackIn_6_3 = stackOut_5_3;
              if ((var2_int & 1) == 0) {
                stackOut_7_0 = stackIn_7_0;
                stackOut_7_1 = stackIn_7_1;
                stackOut_7_2 = stackIn_7_2;
                stackOut_7_3 = stackIn_7_3;
                stackOut_7_4 = 9073738;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                stackIn_8_2 = stackOut_7_2;
                stackIn_8_3 = stackOut_7_3;
                stackIn_8_4 = stackOut_7_4;
                break L13;
              } else {
                stackOut_6_0 = stackIn_6_0;
                stackOut_6_1 = stackIn_6_1;
                stackOut_6_2 = stackIn_6_2;
                stackOut_6_3 = stackIn_6_3;
                stackOut_6_4 = 6048056;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_8_2 = stackOut_6_2;
                stackIn_8_3 = stackOut_6_3;
                stackIn_8_4 = stackOut_6_4;
                break L13;
              }
            }
            ll.c(stackIn_8_0, stackIn_8_1, stackIn_8_2, stackIn_8_3, stackIn_8_4);
            var2_int++;
            continue L0;
          }
        }
    }

    private final void a(boolean param0, int param1, int param2, int param3, int param4) {
        boolean discarded$1 = false;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        qj var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_5_0 = 0;
        String stackIn_11_0 = null;
        int stackIn_20_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_45_0 = 0;
        qj[] stackIn_51_0 = null;
        qj[] stackIn_52_0 = null;
        qj[] stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        String stackOut_10_0 = null;
        String stackOut_9_0 = null;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        qj[] stackOut_50_0 = null;
        qj[] stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        qj[] stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        L0: {
          L1: {
            var13 = TrackController.field_F ? 1 : 0;
            var6 = this.b(66, param3);
            var7 = ja.field_c[var6];
            cl.a(gb.field_l, param1, 26, param2, 156, param4 ^ 5);
            if (-3 == (var6 ^ -1)) {
              break L1;
            } else {
              if ((var6 ^ -1) != -4) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackOut_3_0 = 1;
          stackIn_5_0 = stackOut_3_0;
          break L0;
        }
        L2: {
          var8 = stackIn_5_0;
          if (var7 == null) {
            var9 = var6;
            if (12 != var9) {
              throw new IllegalStateException("Unexpected optionNo: " + var6);
            } else {
              L3: {
                if (1 != rd.field_b) {
                  stackOut_10_0 = q.field_o;
                  stackIn_11_0 = stackOut_10_0;
                  break L3;
                } else {
                  stackOut_9_0 = l.field_n;
                  stackIn_11_0 = stackOut_9_0;
                  break L3;
                }
              }
              var7 = stackIn_11_0;
              break L2;
            }
          } else {
            break L2;
          }
        }
        L4: {
          if (this.a((byte) 83, var6)) {
            if (!param0) {
              stackOut_19_0 = 0;
              stackIn_20_0 = stackOut_19_0;
              break L4;
            } else {
              stackOut_18_0 = 1;
              stackIn_20_0 = stackOut_18_0;
              break L4;
            }
          } else {
            if (!param0) {
              stackOut_16_0 = 2;
              stackIn_20_0 = stackOut_16_0;
              break L4;
            } else {
              stackOut_15_0 = 3;
              stackIn_20_0 = stackOut_15_0;
              break L4;
            }
          }
        }
        L5: {
          var9 = stackIn_20_0;
          if (param0) {
            break L5;
          } else {
            L6: {
              if ((var6 ^ -1) != -24) {
                break L6;
              } else {
                if ((di.field_i ^ -1) != -1) {
                  break L6;
                } else {
                  var9 = 6;
                  break L6;
                }
              }
            }
            L7: {
              if (24 != var6) {
                break L7;
              } else {
                if (1 == di.field_i) {
                  var9 = 6;
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            if ((var6 ^ -1) != -26) {
              break L5;
            } else {
              if (-3 == (di.field_i ^ -1)) {
                var9 = 6;
                break L5;
              } else {
                break L5;
              }
            }
          }
        }
        L8: {
          if (param4 == 1) {
            break L8;
          } else {
            discarded$1 = this.a((byte) -90, -120);
            break L8;
          }
        }
        L9: {
          if (var8 == 0) {
            if (26 == var6) {
              L10: {
                stackOut_50_0 = kg.field_e;
                stackIn_52_0 = stackOut_50_0;
                stackIn_51_0 = stackOut_50_0;
                if (!fi.field_i) {
                  stackOut_52_0 = (qj[]) ((Object) stackIn_52_0);
                  stackOut_52_1 = 1;
                  stackIn_53_0 = stackOut_52_0;
                  stackIn_53_1 = stackOut_52_1;
                  break L10;
                } else {
                  stackOut_51_0 = (qj[]) ((Object) stackIn_51_0);
                  stackOut_51_1 = 0;
                  stackIn_53_0 = stackOut_51_0;
                  stackIn_53_1 = stackOut_51_1;
                  break L10;
                }
              }
              var10 = stackIn_53_0[stackIn_53_1];
              var11 = bk.field_E.a(var7) - (-bk.field_E.a(' ') + -var10.field_s);
              var12 = param1 + (156 - var11 >> -1774299263);
              bk.field_E.c(var7, var12, -2 + (bk.field_E.field_G + param2), var9, -1);
              var10.e(var12 - (-var11 - -var10.field_s), (1 + -var10.field_v + 26 >> 751385377) + param2);
              break L9;
            } else {
              bk.field_E.b(var7, 78 + param1, param2 - (-bk.field_E.field_G - -2), var9, -1);
              break L9;
            }
          } else {
            L11: {
              bk.field_E.c(var7, param1 - -13, bk.field_E.field_G + param2 + -2, var9, -1);
              if (!this.a((byte) 60, var6)) {
                if (!param0) {
                  stackOut_41_0 = 4473924;
                  stackIn_42_0 = stackOut_41_0;
                  break L11;
                } else {
                  stackOut_40_0 = 12303291;
                  stackIn_42_0 = stackOut_40_0;
                  break L11;
                }
              } else {
                if (param0) {
                  stackOut_38_0 = 8110658;
                  stackIn_42_0 = stackOut_38_0;
                  break L11;
                } else {
                  stackOut_37_0 = 15252224;
                  stackIn_42_0 = stackOut_37_0;
                  break L11;
                }
              }
            }
            L12: {
              var10_int = stackIn_42_0;
              ll.c(param1 + 78, param2 - -13, 64, 2, var10_int);
              if (-3 == (var6 ^ -1)) {
                stackOut_44_0 = qd.field_d;
                stackIn_45_0 = stackOut_44_0;
                break L12;
              } else {
                stackOut_43_0 = kc.field_b;
                stackIn_45_0 = stackOut_43_0;
                break L12;
              }
            }
            L13: {
              var11 = stackIn_45_0 >> -2104036478;
              if ((var11 ^ -1) <= -1) {
                break L13;
              } else {
                var11 = 0;
                break L13;
              }
            }
            ll.c(param1 + (78 - (-var11 + 1)), -6 + param2 - -13, 3, 14, 8110658);
            ll.g(var11 + (78 + param1) + -2, 13 + param2, 2, 16580608);
            ll.g(2 + (param1 + 78 + var11), param2 - -13, 2, 16580608);
            break L9;
          }
        }
    }

    private final int e(byte param0) {
        if (param0 > 51) {
          L0: {
            L1: {
              if (this.field_c == 4) {
                break L1;
              } else {
                if ((this.field_c ^ -1) == -6) {
                  break L1;
                } else {
                  if (this.field_c == 6) {
                    break L1;
                  } else {
                    if (this.field_c != 7) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            if ((rd.field_b ^ -1) != -1) {
              break L0;
            } else {
              return mf.field_a[this.field_c] - -mf.field_d[this.field_c];
            }
          }
          return mf.field_a[this.field_c];
        } else {
          return 61;
        }
    }

    private final boolean a(byte param0, int param1) {
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        var3 = 92 % ((-2 - param0) / 57);
        if ((param1 ^ -1) != -2) {
          return true;
        } else {
          L0: {
            L1: {
              if (qh.field_b == null) {
                break L1;
              } else {
                if ((pc.field_i - -1 ^ -1) > (qh.field_b.field_x ^ -1)) {
                  break L1;
                } else {
                  stackOut_3_0 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  break L0;
                }
              }
            }
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
          return stackIn_5_0 != 0;
        }
    }

    private final int a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          if (param0 == 6) {
            break L0;
          } else {
            this.field_d = 56;
            break L0;
          }
        }
        if (-12 != (this.field_c ^ -1)) {
          if (!mf.field_i[this.field_c]) {
            L1: {
              if (param1 < mf.field_a[this.field_c]) {
                break L1;
              } else {
                if ((param1 ^ -1) > (mf.field_b[this.field_c] + mf.field_a[this.field_c] ^ -1)) {
                  if ((mf.field_h[this.field_c] ^ -1) < (param2 ^ -1)) {
                    return -1;
                  } else {
                    var4 = (param2 + -mf.field_h[this.field_c]) / mf.field_d[this.field_c];
                    if (mf.field_f[this.field_c].length > var4) {
                      if ((26 + mf.field_d[this.field_c] * var4 + mf.field_h[this.field_c] ^ -1) <= (param2 ^ -1)) {
                        return var4;
                      } else {
                        return -1;
                      }
                    } else {
                      return -1;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            return -1;
          } else {
            L2: {
              if ((mf.field_h[this.field_c] ^ -1) < (param2 ^ -1)) {
                break L2;
              } else {
                if (mf.field_b[this.field_c] + mf.field_h[this.field_c] <= param2) {
                  break L2;
                } else {
                  var4 = this.e((byte) 121);
                  if ((param1 ^ -1) <= (var4 ^ -1)) {
                    var5 = (param1 + -var4) / mf.field_d[this.field_c];
                    if ((mf.field_f[this.field_c].length ^ -1) >= (var5 ^ -1)) {
                      return -1;
                    } else {
                      param1 = -(var5 * mf.field_d[this.field_c]) + -var4 + param1;
                      if ((param1 ^ -1) <= -157) {
                        return -1;
                      } else {
                        return var5;
                      }
                    }
                  } else {
                    return -1;
                  }
                }
              }
            }
            return -1;
          }
        } else {
          L3: {
            param1 = param1 - mf.field_a[this.field_c];
            param2 = param2 - mf.field_h[this.field_c];
            if (0 > param1) {
              break L3;
            } else {
              if (param2 >= 0) {
                var4 = param2 / mf.field_b[this.field_c];
                var5 = param1 / mf.field_d[this.field_c];
                param1 = param1 - var5 * mf.field_d[this.field_c];
                if ((param1 ^ -1) <= -157) {
                  return -1;
                } else {
                  L4: {
                    if (-1 != (var4 ^ -1)) {
                      break L4;
                    } else {
                      if (3 > var5) {
                        return var5;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (1 != var4) {
                      break L5;
                    } else {
                      if (-2 == (var5 ^ -1)) {
                        return 3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  return -1;
                }
              } else {
                break L3;
              }
            }
          }
          return -1;
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != -8381) {
            mg.a(-48);
        }
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        L0: {
          L1: {
            var3 = 0;
            if ((this.field_c ^ -1) == -1) {
              break L1;
            } else {
              if (this.field_c != 1) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          if (this.field_e.field_e == -1) {
            break L0;
          } else {
            var3 = this.field_e.field_e;
            break L0;
          }
        }
        L2: {
          L3: {
            if ((this.field_c ^ -1) == -13) {
              break L3;
            } else {
              if (this.field_c != 13) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          if ((this.field_e.field_e ^ -1) == 0) {
            break L2;
          } else {
            if (ib.field_a != -1) {
              var3 = this.field_e.field_e;
              break L2;
            } else {
              break L2;
            }
          }
        }
        L4: {
          L5: {
            if ((this.field_c ^ -1) == -5) {
              break L5;
            } else {
              if ((this.field_c ^ -1) == -6) {
                break L5;
              } else {
                if (this.field_c == 6) {
                  break L5;
                } else {
                  if ((this.field_c ^ -1) == -8) {
                    break L5;
                  } else {
                    break L4;
                  }
                }
              }
            }
          }
          var3 = 1;
          break L4;
        }
        L6: {
          L7: {
            this.field_e.a(var3, this.a((byte) 6, kf.field_b, fg.field_a), param1, 120);
            if ((this.field_c ^ -1) == -3) {
              break L7;
            } else {
              if (3 == this.field_c) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          mb.field_b = this.b((byte) 125);
          break L6;
        }
        L8: {
          if (param0 == 10412) {
            break L8;
          } else {
            this.c(-110);
            break L8;
          }
        }
    }

    private final void d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var5 = TrackController.field_F ? 1 : 0;
          if (2 <= sl.field_j) {
            if (1 != kg.field_d) {
              break L0;
            } else {
              L1: {
                if (nf.field_f) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              nf.field_f = stackIn_6_0 != 0;
              break L0;
            }
          } else {
            break L0;
          }
        }
        L2: {
          var2 = 86 / ((22 - param0) / 62);
          if (kg.field_d == 13) {
            if (-2147483648 == mf.field_e[this.field_c]) {
              break L2;
            } else {
              si.a((byte) -68, 5);
              sc.field_g = mf.field_e[this.field_c];
              break L2;
            }
          } else {
            break L2;
          }
        }
        L3: {
          if (11 == this.field_c) {
            L4: {
              if (this.field_e.e(0)) {
                break L4;
              } else {
                if (-97 == (kg.field_d ^ -1)) {
                  L5: {
                    if (0 >= this.field_e.field_e) {
                      this.field_e.field_e = 2;
                      break L5;
                    } else {
                      if (3 == this.field_e.field_e) {
                        break L5;
                      } else {
                        this.field_e.field_e = this.field_e.field_e - 1;
                        break L5;
                      }
                    }
                  }
                  this.field_e.field_a = false;
                  break L4;
                } else {
                  if (-98 != (kg.field_d ^ -1)) {
                    if (99 == kg.field_d) {
                      L6: {
                        L7: {
                          if (-1 == this.field_e.field_e) {
                            break L7;
                          } else {
                            if (-4 != (this.field_e.field_e ^ -1)) {
                              this.field_e.field_e = 3;
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        this.field_e.field_e = di.field_i;
                        break L6;
                      }
                      this.field_e.field_a = false;
                      break L4;
                    } else {
                      if (-99 == (kg.field_d ^ -1)) {
                        L8: {
                          if (3 == this.field_e.field_e) {
                            this.field_e.field_e = di.field_i;
                            break L8;
                          } else {
                            this.field_e.field_e = 3;
                            break L8;
                          }
                        }
                        this.field_e.field_a = false;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  } else {
                    L9: {
                      if (2 > this.field_e.field_e) {
                        this.field_e.field_e = this.field_e.field_e + 1;
                        break L9;
                      } else {
                        if (2 != this.field_e.field_e) {
                          break L9;
                        } else {
                          this.field_e.field_e = 0;
                          break L9;
                        }
                      }
                    }
                    this.field_e.field_a = false;
                    break L4;
                  }
                }
              }
            }
            this.field_e.f(0);
            break L3;
          } else {
            L10: {
              if (-3 == (this.field_c ^ -1)) {
                break L10;
              } else {
                if (3 != this.field_c) {
                  if (!mf.field_i[this.field_c]) {
                    this.field_e.b((byte) -76);
                    break L3;
                  } else {
                    this.field_e.a((byte) 20);
                    break L3;
                  }
                } else {
                  break L10;
                }
              }
            }
            if (this.field_e.e(0)) {
              this.field_e.f(0);
              break L3;
            } else {
              L11: {
                if (kg.field_d == 97) {
                  break L11;
                } else {
                  L12: {
                    if (-81 != (kg.field_d ^ -1)) {
                      break L12;
                    } else {
                      if (!ni.field_m[81]) {
                        break L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                  L13: {
                    if (-97 == (kg.field_d ^ -1)) {
                      break L13;
                    } else {
                      L14: {
                        if (-81 != (kg.field_d ^ -1)) {
                          break L14;
                        } else {
                          if (!ni.field_m[81]) {
                            break L14;
                          } else {
                            break L13;
                          }
                        }
                      }
                      if (this.field_e.field_e >= 0) {
                        this.field_e.b((byte) -113);
                        break L3;
                      } else {
                        L15: {
                          var3 = qh.field_b.field_x;
                          if ((kg.field_d ^ -1) == -99) {
                            L16: {
                              tc.field_b = 2;
                              if ((qh.field_b.field_x ^ -1) < -2) {
                                qh.field_b = gj.field_f[-2 + qh.field_b.field_x];
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                            this.field_e.field_a = false;
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        L17: {
                          if (99 == kg.field_d) {
                            L18: {
                              tc.field_b = 2;
                              if ((gj.field_f.length ^ -1) < (qh.field_b.field_x ^ -1)) {
                                qh.field_b = gj.field_f[qh.field_b.field_x];
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            this.field_e.field_a = false;
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        L19: {
                          if (-1 != (tc.field_b ^ -1)) {
                            break L19;
                          } else {
                            L20: {
                              if (-84 == (kg.field_d ^ -1)) {
                                break L20;
                              } else {
                                if ((kg.field_d ^ -1) != -85) {
                                  break L19;
                                } else {
                                  break L20;
                                }
                              }
                            }
                            L21: {
                              if (-2 > (qh.field_b.field_x ^ -1)) {
                                qh.field_b = gj.field_f[-2 + qh.field_b.field_x];
                                break L21;
                              } else {
                                break L21;
                              }
                            }
                            this.field_e.field_a = false;
                            break L19;
                          }
                        }
                        L22: {
                          if (tc.field_b != 1) {
                            break L22;
                          } else {
                            L23: {
                              if (kg.field_d == 83) {
                                break L23;
                              } else {
                                if (-85 != (kg.field_d ^ -1)) {
                                  break L22;
                                } else {
                                  break L23;
                                }
                              }
                            }
                            L24: {
                              if (qh.field_b.field_x >= gj.field_f.length) {
                                break L24;
                              } else {
                                qh.field_b = gj.field_f[qh.field_b.field_x];
                                break L24;
                              }
                            }
                            this.field_e.field_a = false;
                            break L22;
                          }
                        }
                        if (2 == tc.field_b) {
                          L25: {
                            if (kg.field_d != 104) {
                              break L25;
                            } else {
                              L26: {
                                var4 = qh.field_b.field_x + -9;
                                if (-1 < (var4 ^ -1)) {
                                  var4 = 0;
                                  break L26;
                                } else {
                                  break L26;
                                }
                              }
                              qh.field_b = gj.field_f[var4];
                              this.field_e.field_a = false;
                              break L25;
                            }
                          }
                          L27: {
                            if (kg.field_d == 105) {
                              L28: {
                                var4 = 7 + qh.field_b.field_x;
                                if ((var4 ^ -1) <= (gj.field_f.length ^ -1)) {
                                  var4 = gj.field_f.length - 1;
                                  break L28;
                                } else {
                                  break L28;
                                }
                              }
                              qh.field_b = gj.field_f[var4];
                              this.field_e.field_a = false;
                              break L27;
                            } else {
                              break L27;
                            }
                          }
                          L29: {
                            if (kg.field_d != 102) {
                              break L29;
                            } else {
                              this.field_e.field_a = false;
                              qh.field_b = gj.field_f[0];
                              break L29;
                            }
                          }
                          L30: {
                            if ((kg.field_d ^ -1) != -104) {
                              break L30;
                            } else {
                              qh.field_b = gj.field_f[gj.field_f.length - 1];
                              this.field_e.field_a = false;
                              break L30;
                            }
                          }
                          L31: {
                            if (84 != kg.field_d) {
                              break L31;
                            } else {
                              if (1 + pc.field_i >= qh.field_b.field_x) {
                                si.a((byte) -68, 5);
                                g.field_w = null;
                                rk.field_bb = null;
                                ua.field_L = new ri();
                                sc.field_g = -1;
                                oe.field_e = 0;
                                break L31;
                              } else {
                                break L31;
                              }
                            }
                          }
                          var3 = var3 - qh.field_b.field_x;
                          mb.field_b = mb.field_b - 26 * var3;
                          break L3;
                        } else {
                          var3 = var3 - qh.field_b.field_x;
                          mb.field_b = mb.field_b - 26 * var3;
                          break L3;
                        }
                      }
                    }
                  }
                  L32: {
                    if (2 != tc.field_b) {
                      tc.field_b = 2;
                      this.field_e.field_e = -1;
                      break L32;
                    } else {
                      tc.field_b = -1;
                      this.field_e.field_e = 0;
                      break L32;
                    }
                  }
                  this.field_e.field_a = false;
                  break L3;
                }
              }
              L33: {
                if (-1 < (this.field_e.field_e ^ -1)) {
                  tc.field_b = -1;
                  this.field_e.field_e = 0;
                  break L33;
                } else {
                  tc.field_b = 2;
                  this.field_e.field_e = -1;
                  break L33;
                }
              }
              this.field_e.field_a = false;
              break L3;
            }
          }
        }
        L34: {
          if (this.field_e.field_e != -1) {
            this.a(this.field_e.field_e, false, false);
            break L34;
          } else {
            break L34;
          }
        }
    }

    private final void a(boolean param0, int param1) {
        int discarded$2 = 0;
        int incrementValue$3 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_36_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        L0: {
          var10 = TrackController.field_F ? 1 : 0;
          var3 = 122;
          var4 = 128;
          if (!param0) {
            stackOut_2_0 = th.field_l;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = oe.field_e;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (!param0) {
            break L1;
          } else {
            var6 = sc.a(var5, param1 + -17461);
            if (-9 > (var6 ^ -1)) {
              break L1;
            } else {
              var3 = var3 + (-var6 + 8) * 52 / 2;
              break L1;
            }
          }
        }
        var6 = 0;
        var7 = -1;
        var8 = 0;
        L2: while (true) {
          if ((var8 ^ -1) <= (wa.field_k.length ^ -1)) {
            if (param1 == 17460) {
              L3: {
                if (this.field_d > -1) {
                  var7 = this.field_d;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (0 != (var7 ^ -1)) {
                  L5: {
                    bk.field_E.b(wa.field_k[var7], 320, 224, 0, -1);
                    if ((1 << var7 & var5 ^ -1) != -1) {
                      bk.field_E.b(mb.field_a, 320, 250, 0, -1);
                      break L5;
                    } else {
                      bk.field_E.b(kb.field_c, 320, 250, 7, -1);
                      break L5;
                    }
                  }
                  L6: {
                    if ((var5 & 1 << var7) != 0) {
                      bb.field_b[var7].e(256, 282);
                      break L6;
                    } else {
                      vj.field_a.e(256, 282);
                      break L6;
                    }
                  }
                  discarded$2 = bk.field_E.a(gj.field_b[var7], 50, 302 - bk.field_E.field_G, 201, 1000, 0, -1, 0, 0, 26);
                  var8 = 302;
                  bk.field_E.c(kc.field_a + 100 * rd.field_f[var7], 410, var8, 0, -1);
                  var3 = 410;
                  var8 += 26;
                  bk.field_E.c(di.field_l, var3, var8, 0, -1);
                  var3 = var3 + bk.field_E.a(di.field_l);
                  var9 = 0;
                  L7: while (true) {
                    if (rd.field_f[var7] <= var9) {
                      break L4;
                    } else {
                      mc.field_E.e(var3, -bk.field_E.field_G + var8);
                      var3 = var3 + mc.field_E.field_t / 3;
                      var9++;
                      continue L7;
                    }
                  }
                } else {
                  bk.field_E.b(id.field_a, 320, 302, 0, -1);
                  if (!jj.s(39)) {
                    break L4;
                  } else {
                    bk.field_E.b(hh.field_b, 320, 354, 0, -1);
                    break L4;
                  }
                }
              }
              return;
            } else {
              return;
            }
          } else {
            L8: {
              if (this.a(var8, 10)) {
                L9: {
                  if ((1 << var8 & var5 ^ -1) != -1) {
                    bb.field_b[var8].b(var3, var4);
                    break L9;
                  } else {
                    if (!param0) {
                      vj.field_a.b(var3, var4);
                      break L9;
                    } else {
                      break L8;
                    }
                  }
                }
                L10: {
                  if ((kf.field_b ^ -1) > (var3 ^ -1)) {
                    break L10;
                  } else {
                    if ((kf.field_b ^ -1) < (32 + var3 ^ -1)) {
                      break L10;
                    } else {
                      if ((fg.field_a ^ -1) > (var4 ^ -1)) {
                        break L10;
                      } else {
                        if ((fg.field_a ^ -1) < (32 + var4 ^ -1)) {
                          break L10;
                        } else {
                          var7 = var8;
                          ll.d(-2 + var3, var4 + -2, 36, 36, 6, 16711680);
                          break L10;
                        }
                      }
                    }
                  }
                }
                L11: {
                  if (-1 == this.field_h) {
                    break L11;
                  } else {
                    if (var3 > this.field_h) {
                      break L11;
                    } else {
                      if ((this.field_h ^ -1) < (var3 - -32 ^ -1)) {
                        break L11;
                      } else {
                        if (var4 > this.field_g) {
                          break L11;
                        } else {
                          if ((32 + var4 ^ -1) > (this.field_g ^ -1)) {
                            break L11;
                          } else {
                            this.field_h = -1;
                            if ((var8 ^ -1) != (this.field_d ^ -1)) {
                              this.field_d = var8;
                              break L11;
                            } else {
                              this.field_d = -1;
                              break L11;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                L12: {
                  if (var8 == this.field_d) {
                    ll.d(var3 + -2, -2 + var4, 36, 36, 6, 15252224);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                incrementValue$3 = var6;
                var6++;
                if ((incrementValue$3 ^ -1) == -8) {
                  L13: {
                    if (!this.a(12, 10)) {
                      stackOut_35_0 = 4;
                      stackIn_36_0 = stackOut_35_0;
                      break L13;
                    } else {
                      stackOut_34_0 = 5;
                      stackIn_36_0 = stackOut_34_0;
                      break L13;
                    }
                  }
                  var9 = stackIn_36_0;
                  var4 -= 52;
                  var3 = 122 - -(416 - var9 * 52 >> -1424733663);
                  break L8;
                } else {
                  var3 += 52;
                  break L8;
                }
              } else {
                break L8;
              }
            }
            var8++;
            continue L2;
          }
        }
    }

    private final int b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = TrackController.field_F ? 1 : 0;
          if (param0 >= 46) {
            break L0;
          } else {
            this.field_c = -79;
            break L0;
          }
        }
        L1: {
          var3 = mf.field_f[this.field_c][param1];
          if (-5 == (this.field_c ^ -1)) {
            if (rd.field_b == 0) {
              if (param1 == 0) {
                var3 = 10;
                break L1;
              } else {
                if (-2 != (param1 ^ -1)) {
                  break L1;
                } else {
                  var3 = 12;
                  break L1;
                }
              }
            } else {
              if (param1 == 0) {
                var3 = 12;
                break L1;
              } else {
                if (-2 == (param1 ^ -1)) {
                  var3 = 10;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
          } else {
            break L1;
          }
        }
        L2: {
          if (5 == this.field_c) {
            if (-1 != (rd.field_b ^ -1)) {
              if (-1 != (param1 ^ -1)) {
                if ((param1 ^ -1) != -2) {
                  break L2;
                } else {
                  var3 = 11;
                  break L2;
                }
              } else {
                var3 = 12;
                break L2;
              }
            } else {
              if (param1 == 0) {
                var3 = 11;
                break L2;
              } else {
                if (-2 == (param1 ^ -1)) {
                  var3 = 12;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
          } else {
            break L2;
          }
        }
        L3: {
          if (6 == this.field_c) {
            if ((rd.field_b ^ -1) == -1) {
              if (-1 != (param1 ^ -1)) {
                if (1 == param1) {
                  var3 = 12;
                  break L3;
                } else {
                  break L3;
                }
              } else {
                var3 = 14;
                break L3;
              }
            } else {
              if (param1 != 0) {
                if ((param1 ^ -1) == -2) {
                  var3 = 14;
                  break L3;
                } else {
                  break L3;
                }
              } else {
                var3 = 12;
                break L3;
              }
            }
          } else {
            break L3;
          }
        }
        L4: {
          if (this.field_c == 7) {
            if (0 == rd.field_b) {
              if (0 != param1) {
                if (1 != param1) {
                  break L4;
                } else {
                  var3 = 12;
                  break L4;
                }
              } else {
                var3 = 15;
                break L4;
              }
            } else {
              if (0 == param1) {
                var3 = 12;
                break L4;
              } else {
                if (param1 == 1) {
                  var3 = 15;
                  break L4;
                } else {
                  break L4;
                }
              }
            }
          } else {
            break L4;
          }
        }
        return var3;
    }

    private final boolean a(int param0, int param1) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param1 == 10) {
            break L0;
          } else {
            field_b = (vl) null;
            break L0;
          }
        }
        if (0 == (th.field_l & 1 << param0)) {
          L1: {
            L2: {
              if ((param0 ^ -1) != -13) {
                break L2;
              } else {
                if (!ui.a(0, true)) {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L1;
          }
          return stackIn_9_0 != 0;
        } else {
          return true;
        }
    }

    final void b(int param0) {
        int discarded$1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        String var4_ref_String = null;
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ea[] var9 = null;
        int var10 = 0;
        ea var11 = null;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        Object stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int stackIn_72_0 = 0;
        int stackIn_75_0 = 0;
        oh stackIn_97_0 = null;
        oh stackIn_98_0 = null;
        oh stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        oh stackIn_100_0 = null;
        int stackIn_100_1 = 0;
        oh stackIn_101_0 = null;
        int stackIn_101_1 = 0;
        oh stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        int stackIn_102_2 = 0;
        oh stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        int stackIn_103_2 = 0;
        oh stackIn_104_0 = null;
        int stackIn_104_1 = 0;
        int stackIn_104_2 = 0;
        oh stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        int stackIn_105_2 = 0;
        int stackIn_105_3 = 0;
        oh stackIn_106_0 = null;
        oh stackIn_107_0 = null;
        oh stackIn_108_0 = null;
        int stackIn_108_1 = 0;
        oh stackIn_109_0 = null;
        int stackIn_109_1 = 0;
        oh stackIn_110_0 = null;
        int stackIn_110_1 = 0;
        oh stackIn_111_0 = null;
        int stackIn_111_1 = 0;
        int stackIn_111_2 = 0;
        oh stackIn_112_0 = null;
        int stackIn_112_1 = 0;
        int stackIn_112_2 = 0;
        oh stackIn_113_0 = null;
        int stackIn_113_1 = 0;
        int stackIn_113_2 = 0;
        oh stackIn_114_0 = null;
        int stackIn_114_1 = 0;
        int stackIn_114_2 = 0;
        int stackIn_114_3 = 0;
        oh stackIn_115_0 = null;
        oh stackIn_116_0 = null;
        oh stackIn_117_0 = null;
        int stackIn_117_1 = 0;
        oh stackIn_118_0 = null;
        int stackIn_118_1 = 0;
        int stackIn_118_2 = 0;
        oh stackIn_119_0 = null;
        int stackIn_119_1 = 0;
        int stackIn_119_2 = 0;
        oh stackIn_120_0 = null;
        int stackIn_120_1 = 0;
        int stackIn_120_2 = 0;
        int stackIn_120_3 = 0;
        oh stackIn_121_0 = null;
        int stackIn_121_1 = 0;
        int stackIn_121_2 = 0;
        int stackIn_121_3 = 0;
        oh stackIn_122_0 = null;
        int stackIn_122_1 = 0;
        int stackIn_122_2 = 0;
        int stackIn_122_3 = 0;
        oh stackIn_123_0 = null;
        int stackIn_123_1 = 0;
        int stackIn_123_2 = 0;
        int stackIn_123_3 = 0;
        int stackIn_123_4 = 0;
        oh stackOut_96_0 = null;
        oh stackOut_98_0 = null;
        int stackOut_98_1 = 0;
        oh stackOut_97_0 = null;
        int stackOut_97_1 = 0;
        oh stackOut_99_0 = null;
        int stackOut_99_1 = 0;
        oh stackOut_101_0 = null;
        int stackOut_101_1 = 0;
        int stackOut_101_2 = 0;
        oh stackOut_100_0 = null;
        int stackOut_100_1 = 0;
        int stackOut_100_2 = 0;
        oh stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        int stackOut_102_2 = 0;
        oh stackOut_104_0 = null;
        int stackOut_104_1 = 0;
        int stackOut_104_2 = 0;
        int stackOut_104_3 = 0;
        oh stackOut_103_0 = null;
        int stackOut_103_1 = 0;
        int stackOut_103_2 = 0;
        int stackOut_103_3 = 0;
        oh stackOut_105_0 = null;
        oh stackOut_107_0 = null;
        int stackOut_107_1 = 0;
        oh stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        oh stackOut_108_0 = null;
        int stackOut_108_1 = 0;
        oh stackOut_110_0 = null;
        int stackOut_110_1 = 0;
        int stackOut_110_2 = 0;
        oh stackOut_109_0 = null;
        int stackOut_109_1 = 0;
        int stackOut_109_2 = 0;
        oh stackOut_111_0 = null;
        int stackOut_111_1 = 0;
        int stackOut_111_2 = 0;
        oh stackOut_113_0 = null;
        int stackOut_113_1 = 0;
        int stackOut_113_2 = 0;
        int stackOut_113_3 = 0;
        oh stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        int stackOut_112_2 = 0;
        int stackOut_112_3 = 0;
        oh stackOut_114_0 = null;
        oh stackOut_116_0 = null;
        int stackOut_116_1 = 0;
        oh stackOut_115_0 = null;
        int stackOut_115_1 = 0;
        oh stackOut_117_0 = null;
        int stackOut_117_1 = 0;
        int stackOut_117_2 = 0;
        oh stackOut_119_0 = null;
        int stackOut_119_1 = 0;
        int stackOut_119_2 = 0;
        int stackOut_119_3 = 0;
        oh stackOut_118_0 = null;
        int stackOut_118_1 = 0;
        int stackOut_118_2 = 0;
        int stackOut_118_3 = 0;
        oh stackOut_120_0 = null;
        int stackOut_120_1 = 0;
        int stackOut_120_2 = 0;
        int stackOut_120_3 = 0;
        oh stackOut_122_0 = null;
        int stackOut_122_1 = 0;
        int stackOut_122_2 = 0;
        int stackOut_122_3 = 0;
        int stackOut_122_4 = 0;
        oh stackOut_121_0 = null;
        int stackOut_121_1 = 0;
        int stackOut_121_2 = 0;
        int stackOut_121_3 = 0;
        int stackOut_121_4 = 0;
        int stackOut_71_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_73_0 = 0;
        Object stackOut_29_0 = null;
        Object stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        L0: {
          L1: {
            var14 = TrackController.field_F ? 1 : 0;
            if ((this.field_c ^ -1) == -13) {
              break L1;
            } else {
              if ((this.field_c ^ -1) == -14) {
                break L1;
              } else {
                L2: {
                  if (this.field_c == 2) {
                    break L2;
                  } else {
                    if (this.field_c == 3) {
                      break L2;
                    } else {
                      if (this.field_c != 15) {
                        L3: {
                          if (this.field_c == 8) {
                            break L3;
                          } else {
                            if (this.field_c == 9) {
                              break L3;
                            } else {
                              if (16 != this.field_c) {
                                if (null != he.field_f[this.field_c]) {
                                  L4: {
                                    cl.a(ha.field_m, 11, 436, 38, 618, 4);
                                    if (-11 == (this.field_c ^ -1)) {
                                      break L4;
                                    } else {
                                      if ((this.field_c ^ -1) != -12) {
                                        break L0;
                                      } else {
                                        break L4;
                                      }
                                    }
                                  }
                                  ll.e(19, 384, 621, 466);
                                  cl.a(nd.field_L, 11, 436, 38, 618, param0 ^ -5);
                                  ll.d();
                                  break L0;
                                } else {
                                  cl.a(nd.field_L, 11, 436, 38, 618, 4);
                                  break L0;
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                        cl.a(nd.field_L, 102, 124, 56, 436, 4);
                        cl.a(nd.field_L, 11, 280, 194, 618, 4);
                        break L0;
                      } else {
                        cl.a(nd.field_L, 37, 254, 118, 566, 4);
                        break L0;
                      }
                    }
                  }
                }
                cl.a(nd.field_L, -10 + this.e((byte) 62), 20 + mf.field_f[this.field_c].length * mf.field_d[this.field_c], -10 + mf.field_h[this.field_c], 176, 4);
                cl.a(nd.field_L, 349, 410, 52 - -bk.field_E.field_u, 212, 4);
                break L0;
              }
            }
          }
          cl.a(ha.field_m, 6, 436, 38, 436, 4);
          cl.a(nd.field_L, 457, 124, 10, 176, param0 ^ -5);
          cl.a(nd.field_L, 457, mf.field_f[this.field_c].length * 26 - -20, 219, 176, param0 ^ -5);
          break L0;
        }
        L5: {
          if (null != he.field_f[this.field_c]) {
            he.field_f[this.field_c].a(true);
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          L7: {
            if (this.field_c == 12) {
              break L7;
            } else {
              if (13 != this.field_c) {
                break L6;
              } else {
                break L7;
              }
            }
          }
          ua.field_L.a(false);
          break L6;
        }
        var2 = this.e((byte) 59);
        var3 = mf.field_h[this.field_c];
        var4 = 0;
        if (param0 == -1) {
          L8: while (true) {
            if (mf.field_f[this.field_c].length <= var4) {
              L9: {
                L10: {
                  if (this.field_c == 0) {
                    break L10;
                  } else {
                    if (-2 != (this.field_c ^ -1)) {
                      L11: {
                        if ((this.field_c ^ -1) == -14) {
                          break L11;
                        } else {
                          if ((this.field_c ^ -1) != -13) {
                            L12: {
                              if (10 == this.field_c) {
                                break L12;
                              } else {
                                if (11 == this.field_c) {
                                  break L12;
                                } else {
                                  L13: {
                                    if ((this.field_c ^ -1) == -9) {
                                      break L13;
                                    } else {
                                      if (9 == this.field_c) {
                                        break L13;
                                      } else {
                                        if ((this.field_c ^ -1) == -17) {
                                          al.field_z[5].e(640 + -al.field_z[5].field_t >> -1075713119, 1);
                                          this.a(true, param0 + 17461);
                                          break L9;
                                        } else {
                                          if ((this.field_c ^ -1) == -16) {
                                            L14: {
                                              al.field_z[0].e(-al.field_z[0].field_t + 640 >> -1474222623, 1);
                                              bk.field_E.b(qg.field_b, 320, bk.field_E.field_G + 154, 5, -1);
                                              stackOut_96_0 = bk.field_E;
                                              stackIn_98_0 = stackOut_96_0;
                                              stackIn_97_0 = stackOut_96_0;
                                              if (0 == oe.field_e) {
                                                stackOut_98_0 = (oh) ((Object) stackIn_98_0);
                                                stackOut_98_1 = 0;
                                                stackIn_99_0 = stackOut_98_0;
                                                stackIn_99_1 = stackOut_98_1;
                                                break L14;
                                              } else {
                                                stackOut_97_0 = (oh) ((Object) stackIn_97_0);
                                                stackOut_97_1 = 1;
                                                stackIn_99_0 = stackOut_97_0;
                                                stackIn_99_1 = stackOut_97_1;
                                                break L14;
                                              }
                                            }
                                            L15: {
                                              stackOut_99_0 = (oh) ((Object) stackIn_99_0);
                                              stackOut_99_1 = stackIn_99_1;
                                              stackIn_101_0 = stackOut_99_0;
                                              stackIn_101_1 = stackOut_99_1;
                                              stackIn_100_0 = stackOut_99_0;
                                              stackIn_100_1 = stackOut_99_1;
                                              if (0 == ua.field_L.field_O) {
                                                stackOut_101_0 = (oh) ((Object) stackIn_101_0);
                                                stackOut_101_1 = stackIn_101_1;
                                                stackOut_101_2 = 0;
                                                stackIn_102_0 = stackOut_101_0;
                                                stackIn_102_1 = stackOut_101_1;
                                                stackIn_102_2 = stackOut_101_2;
                                                break L15;
                                              } else {
                                                stackOut_100_0 = (oh) ((Object) stackIn_100_0);
                                                stackOut_100_1 = stackIn_100_1;
                                                stackOut_100_2 = 1;
                                                stackIn_102_0 = stackOut_100_0;
                                                stackIn_102_1 = stackOut_100_1;
                                                stackIn_102_2 = stackOut_100_2;
                                                break L15;
                                              }
                                            }
                                            L16: {
                                              stackOut_102_0 = (oh) ((Object) stackIn_102_0);
                                              stackOut_102_1 = stackIn_102_1;
                                              stackOut_102_2 = stackIn_102_2;
                                              stackIn_104_0 = stackOut_102_0;
                                              stackIn_104_1 = stackOut_102_1;
                                              stackIn_104_2 = stackOut_102_2;
                                              stackIn_103_0 = stackOut_102_0;
                                              stackIn_103_1 = stackOut_102_1;
                                              stackIn_103_2 = stackOut_102_2;
                                              if (0 == ua.field_L.field_O) {
                                                stackOut_104_0 = (oh) ((Object) stackIn_104_0);
                                                stackOut_104_1 = stackIn_104_1;
                                                stackOut_104_2 = stackIn_104_2;
                                                stackOut_104_3 = 0;
                                                stackIn_105_0 = stackOut_104_0;
                                                stackIn_105_1 = stackOut_104_1;
                                                stackIn_105_2 = stackOut_104_2;
                                                stackIn_105_3 = stackOut_104_3;
                                                break L16;
                                              } else {
                                                stackOut_103_0 = (oh) ((Object) stackIn_103_0);
                                                stackOut_103_1 = stackIn_103_1;
                                                stackOut_103_2 = stackIn_103_2;
                                                stackOut_103_3 = 1;
                                                stackIn_105_0 = stackOut_103_0;
                                                stackIn_105_1 = stackOut_103_1;
                                                stackIn_105_2 = stackOut_103_2;
                                                stackIn_105_3 = stackOut_103_3;
                                                break L16;
                                              }
                                            }
                                            L17: {
                                              ((oh) (Object) stackIn_105_0).b(vj.a(stackIn_105_1 != 0, stackIn_105_2 != 0, stackIn_105_3 != 0, 118), 320, 180 + bk.field_E.field_G, 5, -1);
                                              stackOut_105_0 = bk.field_E;
                                              stackIn_107_0 = stackOut_105_0;
                                              stackIn_106_0 = stackOut_105_0;
                                              if (0 == ua.field_L.field_O) {
                                                stackOut_107_0 = (oh) ((Object) stackIn_107_0);
                                                stackOut_107_1 = 0;
                                                stackIn_108_0 = stackOut_107_0;
                                                stackIn_108_1 = stackOut_107_1;
                                                break L17;
                                              } else {
                                                stackOut_106_0 = (oh) ((Object) stackIn_106_0);
                                                stackOut_106_1 = 1;
                                                stackIn_108_0 = stackOut_106_0;
                                                stackIn_108_1 = stackOut_106_1;
                                                break L17;
                                              }
                                            }
                                            L18: {
                                              stackOut_108_0 = (oh) ((Object) stackIn_108_0);
                                              stackOut_108_1 = stackIn_108_1;
                                              stackIn_110_0 = stackOut_108_0;
                                              stackIn_110_1 = stackOut_108_1;
                                              stackIn_109_0 = stackOut_108_0;
                                              stackIn_109_1 = stackOut_108_1;
                                              if ((oe.field_e ^ -1) == -1) {
                                                stackOut_110_0 = (oh) ((Object) stackIn_110_0);
                                                stackOut_110_1 = stackIn_110_1;
                                                stackOut_110_2 = 0;
                                                stackIn_111_0 = stackOut_110_0;
                                                stackIn_111_1 = stackOut_110_1;
                                                stackIn_111_2 = stackOut_110_2;
                                                break L18;
                                              } else {
                                                stackOut_109_0 = (oh) ((Object) stackIn_109_0);
                                                stackOut_109_1 = stackIn_109_1;
                                                stackOut_109_2 = 1;
                                                stackIn_111_0 = stackOut_109_0;
                                                stackIn_111_1 = stackOut_109_1;
                                                stackIn_111_2 = stackOut_109_2;
                                                break L18;
                                              }
                                            }
                                            L19: {
                                              stackOut_111_0 = (oh) ((Object) stackIn_111_0);
                                              stackOut_111_1 = stackIn_111_1;
                                              stackOut_111_2 = stackIn_111_2;
                                              stackIn_113_0 = stackOut_111_0;
                                              stackIn_113_1 = stackOut_111_1;
                                              stackIn_113_2 = stackOut_111_2;
                                              stackIn_112_0 = stackOut_111_0;
                                              stackIn_112_1 = stackOut_111_1;
                                              stackIn_112_2 = stackOut_111_2;
                                              if ((ua.field_L.field_O ^ -1) == -1) {
                                                stackOut_113_0 = (oh) ((Object) stackIn_113_0);
                                                stackOut_113_1 = stackIn_113_1;
                                                stackOut_113_2 = stackIn_113_2;
                                                stackOut_113_3 = 0;
                                                stackIn_114_0 = stackOut_113_0;
                                                stackIn_114_1 = stackOut_113_1;
                                                stackIn_114_2 = stackOut_113_2;
                                                stackIn_114_3 = stackOut_113_3;
                                                break L19;
                                              } else {
                                                stackOut_112_0 = (oh) ((Object) stackIn_112_0);
                                                stackOut_112_1 = stackIn_112_1;
                                                stackOut_112_2 = stackIn_112_2;
                                                stackOut_112_3 = 1;
                                                stackIn_114_0 = stackOut_112_0;
                                                stackIn_114_1 = stackOut_112_1;
                                                stackIn_114_2 = stackOut_112_2;
                                                stackIn_114_3 = stackOut_112_3;
                                                break L19;
                                              }
                                            }
                                            L20: {
                                              ((oh) (Object) stackIn_114_0).b(fc.a(stackIn_114_1 != 0, stackIn_114_2 != 0, stackIn_114_3 != 0, 12105912), 320, bk.field_E.field_G + 258, 5, -1);
                                              stackOut_114_0 = bk.field_E;
                                              stackIn_116_0 = stackOut_114_0;
                                              stackIn_115_0 = stackOut_114_0;
                                              if (ua.field_L.field_O == 0) {
                                                stackOut_116_0 = (oh) ((Object) stackIn_116_0);
                                                stackOut_116_1 = 0;
                                                stackIn_117_0 = stackOut_116_0;
                                                stackIn_117_1 = stackOut_116_1;
                                                break L20;
                                              } else {
                                                stackOut_115_0 = (oh) ((Object) stackIn_115_0);
                                                stackOut_115_1 = 1;
                                                stackIn_117_0 = stackOut_115_0;
                                                stackIn_117_1 = stackOut_115_1;
                                                break L20;
                                              }
                                            }
                                            L21: {
                                              stackOut_117_0 = (oh) ((Object) stackIn_117_0);
                                              stackOut_117_1 = stackIn_117_1;
                                              stackOut_117_2 = -98;
                                              stackIn_119_0 = stackOut_117_0;
                                              stackIn_119_1 = stackOut_117_1;
                                              stackIn_119_2 = stackOut_117_2;
                                              stackIn_118_0 = stackOut_117_0;
                                              stackIn_118_1 = stackOut_117_1;
                                              stackIn_118_2 = stackOut_117_2;
                                              if (-1 == (oe.field_e ^ -1)) {
                                                stackOut_119_0 = (oh) ((Object) stackIn_119_0);
                                                stackOut_119_1 = stackIn_119_1;
                                                stackOut_119_2 = stackIn_119_2;
                                                stackOut_119_3 = 0;
                                                stackIn_120_0 = stackOut_119_0;
                                                stackIn_120_1 = stackOut_119_1;
                                                stackIn_120_2 = stackOut_119_2;
                                                stackIn_120_3 = stackOut_119_3;
                                                break L21;
                                              } else {
                                                stackOut_118_0 = (oh) ((Object) stackIn_118_0);
                                                stackOut_118_1 = stackIn_118_1;
                                                stackOut_118_2 = stackIn_118_2;
                                                stackOut_118_3 = 1;
                                                stackIn_120_0 = stackOut_118_0;
                                                stackIn_120_1 = stackOut_118_1;
                                                stackIn_120_2 = stackOut_118_2;
                                                stackIn_120_3 = stackOut_118_3;
                                                break L21;
                                              }
                                            }
                                            L22: {
                                              stackOut_120_0 = (oh) ((Object) stackIn_120_0);
                                              stackOut_120_1 = stackIn_120_1;
                                              stackOut_120_2 = stackIn_120_2;
                                              stackOut_120_3 = stackIn_120_3;
                                              stackIn_122_0 = stackOut_120_0;
                                              stackIn_122_1 = stackOut_120_1;
                                              stackIn_122_2 = stackOut_120_2;
                                              stackIn_122_3 = stackOut_120_3;
                                              stackIn_121_0 = stackOut_120_0;
                                              stackIn_121_1 = stackOut_120_1;
                                              stackIn_121_2 = stackOut_120_2;
                                              stackIn_121_3 = stackOut_120_3;
                                              if (ua.field_L.field_O == 0) {
                                                stackOut_122_0 = (oh) ((Object) stackIn_122_0);
                                                stackOut_122_1 = stackIn_122_1;
                                                stackOut_122_2 = stackIn_122_2;
                                                stackOut_122_3 = stackIn_122_3;
                                                stackOut_122_4 = 0;
                                                stackIn_123_0 = stackOut_122_0;
                                                stackIn_123_1 = stackOut_122_1;
                                                stackIn_123_2 = stackOut_122_2;
                                                stackIn_123_3 = stackOut_122_3;
                                                stackIn_123_4 = stackOut_122_4;
                                                break L22;
                                              } else {
                                                stackOut_121_0 = (oh) ((Object) stackIn_121_0);
                                                stackOut_121_1 = stackIn_121_1;
                                                stackOut_121_2 = stackIn_121_2;
                                                stackOut_121_3 = stackIn_121_3;
                                                stackOut_121_4 = 1;
                                                stackIn_123_0 = stackOut_121_0;
                                                stackIn_123_1 = stackOut_121_1;
                                                stackIn_123_2 = stackOut_121_2;
                                                stackIn_123_3 = stackOut_121_3;
                                                stackIn_123_4 = stackOut_121_4;
                                                break L22;
                                              }
                                            }
                                            ((oh) (Object) stackIn_123_0).b(qc.a(stackIn_123_1 != 0, (byte) stackIn_123_2, stackIn_123_3 != 0, stackIn_123_4 != 0), 320, bk.field_E.field_G + 310, 5, -1);
                                            break L9;
                                          } else {
                                            L23: {
                                              if ((this.field_c ^ -1) == -5) {
                                                break L23;
                                              } else {
                                                if (5 == this.field_c) {
                                                  break L23;
                                                } else {
                                                  if ((this.field_c ^ -1) == -7) {
                                                    break L23;
                                                  } else {
                                                    if (-8 != (this.field_c ^ -1)) {
                                                      L24: {
                                                        if ((this.field_c ^ -1) == -3) {
                                                          break L24;
                                                        } else {
                                                          if (this.field_c != 3) {
                                                            if (-15 == (this.field_c ^ -1)) {
                                                              var4 = 154 - (-bk.field_E.field_G - -2);
                                                              bk.field_E.b(ui.field_n, 320, var4, 5, -1);
                                                              break L9;
                                                            } else {
                                                              break L9;
                                                            }
                                                          } else {
                                                            break L24;
                                                          }
                                                        }
                                                      }
                                                      L25: {
                                                        al.field_z[3].e(-al.field_z[3].field_t + 640 >> 1740189665, 1);
                                                        if ((qh.field_b.field_x ^ -1) < (1 + pc.field_i ^ -1)) {
                                                          L26: {
                                                            cl.a(nd.field_L, 90, 254, 57, 176, 4);
                                                            if (!jj.s(param0 + 54)) {
                                                              var4_ref_String = kk.field_a;
                                                              var12 = var4_ref_String;
                                                              var12 = var4_ref_String;
                                                              break L26;
                                                            } else {
                                                              var4_ref_String = lj.field_f;
                                                              break L26;
                                                            }
                                                          }
                                                          discarded$1 = bk.field_E.a(var4_ref_String, 100, 67, 156, 234, 0, -1, 1, 1, 26);
                                                          break L25;
                                                        } else {
                                                          qh.field_b.a(100, (byte) -127, 67);
                                                          fd.field_d.e(-367, -162);
                                                          break L25;
                                                        }
                                                      }
                                                      L27: {
                                                        cl.a(nd.field_L, 566, 46, 57, 46, param0 + 5);
                                                        if (-1 != (tc.field_b ^ -1)) {
                                                          stackOut_71_0 = 15252224;
                                                          stackIn_72_0 = stackOut_71_0;
                                                          break L27;
                                                        } else {
                                                          stackOut_70_0 = 8110658;
                                                          stackIn_72_0 = stackOut_70_0;
                                                          break L27;
                                                        }
                                                      }
                                                      L28: {
                                                        var4 = stackIn_72_0;
                                                        ii.field_r[52].c(576, 67, var4);
                                                        cl.a(nd.field_L, 566, 46, 421, 46, 4);
                                                        if (-2 != (tc.field_b ^ -1)) {
                                                          stackOut_74_0 = 15252224;
                                                          stackIn_75_0 = stackOut_74_0;
                                                          break L28;
                                                        } else {
                                                          stackOut_73_0 = 8110658;
                                                          stackIn_75_0 = stackOut_73_0;
                                                          break L28;
                                                        }
                                                      }
                                                      var4 = stackIn_75_0;
                                                      ii.field_r[53].c(576, 431, var4);
                                                      var5 = this.a(kf.field_b, 2600, fg.field_a);
                                                      var6 = 269 - (-(26 * (1 - qh.field_b.field_x)) - mb.field_b);
                                                      var7 = 359;
                                                      var8 = 62 + bk.field_E.field_u;
                                                      ll.e(var7, var8, var7 + 182 - -10, var8 + 390);
                                                      var9 = gj.field_f;
                                                      var10 = 0;
                                                      L29: while (true) {
                                                        if (var9.length <= var10) {
                                                          ll.d();
                                                          break L9;
                                                        } else {
                                                          L30: {
                                                            var11 = var9[var10];
                                                            var12 = var11.field_q;
                                                            if ((var11.field_x ^ -1) >= (pc.field_i + 1 ^ -1)) {
                                                              break L30;
                                                            } else {
                                                              var12 = qg.field_a;
                                                              break L30;
                                                            }
                                                          }
                                                          L31: {
                                                            var13 = 0;
                                                            if (var11 == qh.field_b) {
                                                              var13 = 6;
                                                              break L31;
                                                            } else {
                                                              break L31;
                                                            }
                                                          }
                                                          L32: {
                                                            if (this.field_e.field_a) {
                                                              break L32;
                                                            } else {
                                                              if ((this.field_e.field_e ^ -1) != 0) {
                                                                break L32;
                                                              } else {
                                                                if ((tc.field_b ^ -1) != -3) {
                                                                  break L32;
                                                                } else {
                                                                  if (var11 == qh.field_b) {
                                                                    var13 = 1;
                                                                    break L32;
                                                                  } else {
                                                                    break L32;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                          L33: {
                                                            if (!this.field_e.field_a) {
                                                              break L33;
                                                            } else {
                                                              if (var5 != var11) {
                                                                break L33;
                                                              } else {
                                                                var13 = 1;
                                                                break L33;
                                                              }
                                                            }
                                                          }
                                                          bk.field_E.c(var12, 390, var6, var13, -1);
                                                          bk.field_E.a(var11.field_x + ". ", 390, var6, var13, -1);
                                                          var6 += 26;
                                                          var10++;
                                                          continue L29;
                                                        }
                                                      }
                                                    } else {
                                                      break L23;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            this.c((byte) -114);
                                            break L9;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  al.field_z[1].e(-al.field_z[1].field_t + 640 >> 1123523329, 1);
                                  this.a(false, 17460);
                                  break L9;
                                }
                              }
                            }
                            al.field_z[4].e(-al.field_z[4].field_t + 640 >> -491699583, 1);
                            this.d(-25);
                            break L9;
                          } else {
                            break L11;
                          }
                        }
                      }
                      al.field_z[0].e(41, 1);
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
                al.field_z[0].e(640 - al.field_z[0].field_t >> 925900033, 1);
                break L9;
              }
              L34: {
                var4 = g.g(1);
                var5 = null;
                if (23 != var4) {
                  break L34;
                } else {
                  var5 = vi.field_a;
                  break L34;
                }
              }
              L35: {
                if (var4 == 24) {
                  var5 = id.field_i;
                  break L35;
                } else {
                  break L35;
                }
              }
              L36: {
                if (-26 == (var4 ^ -1)) {
                  var5 = ud.field_b;
                  break L36;
                } else {
                  break L36;
                }
              }
              L37: {
                if (var5 != null) {
                  vl.a(-21173, (String) (var5));
                  break L37;
                } else {
                  break L37;
                }
              }
              return;
            } else {
              L38: {
                stackOut_29_0 = this;
                stackIn_31_0 = stackOut_29_0;
                stackIn_30_0 = stackOut_29_0;
                if ((var4 ^ -1) != (this.field_e.field_e ^ -1)) {
                  stackOut_31_0 = this;
                  stackOut_31_1 = 0;
                  stackIn_32_0 = stackOut_31_0;
                  stackIn_32_1 = stackOut_31_1;
                  break L38;
                } else {
                  stackOut_30_0 = this;
                  stackOut_30_1 = 1;
                  stackIn_32_0 = stackOut_30_0;
                  stackIn_32_1 = stackOut_30_1;
                  break L38;
                }
              }
              L39: {
                this.a(stackIn_32_1 != 0, var2, var3, var4, 1);
                if (!mf.field_i[this.field_c]) {
                  var3 = var3 + mf.field_d[this.field_c];
                  break L39;
                } else {
                  var2 = var2 + mf.field_d[this.field_c];
                  break L39;
                }
              }
              L40: {
                if (-12 != (this.field_c ^ -1)) {
                  break L40;
                } else {
                  if (2 == var4) {
                    var2 = var2 - (mf.field_d[this.field_c] << -1492965471);
                    var3 = var3 + mf.field_b[this.field_c];
                    break L40;
                  } else {
                    break L40;
                  }
                }
              }
              var4++;
              continue L8;
            }
          }
        } else {
          return;
        }
    }

    private final void a(boolean param0, boolean param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_79_0 = 0;
        int stackIn_154_0 = 0;
        int stackIn_155_0 = 0;
        int stackIn_156_0 = 0;
        int stackIn_156_1 = 0;
        int stackIn_173_0 = 0;
        int stackIn_174_0 = 0;
        int stackIn_175_0 = 0;
        int stackIn_175_1 = 0;
        int stackOut_78_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_153_0 = 0;
        int stackOut_155_0 = 0;
        int stackOut_155_1 = 0;
        int stackOut_154_0 = 0;
        int stackOut_154_1 = 0;
        int stackOut_172_0 = 0;
        int stackOut_174_0 = 0;
        int stackOut_174_1 = 0;
        int stackOut_173_0 = 0;
        int stackOut_173_1 = 0;
        L0: {
          var8 = TrackController.field_F ? 1 : 0;
          var5 = this.b(121, param2);
          if (this.a((byte) 67, var5)) {
            break L0;
          } else {
            if ((var5 ^ -1) == -14) {
              break L0;
            } else {
              return;
            }
          }
        }
        L1: {
          if (param3 == 390) {
            break L1;
          } else {
            this.d(0);
            break L1;
          }
        }
        L2: {
          var6 = var5;
          if (var6 == 0) {
            if (!this.field_e.b(false)) {
              break L2;
            } else {
              L3: {
                si.a((byte) -68, 5);
                if (2 > sl.field_j) {
                  break L3;
                } else {
                  if (!ni.field_m[48]) {
                    break L3;
                  } else {
                    pc.field_i = 31;
                    break L3;
                  }
                }
              }
              if ((this.field_c ^ -1) != -1) {
                if ((this.field_c ^ -1) != -2) {
                  throw new RuntimeException();
                } else {
                  sc.field_g = 3;
                  break L2;
                }
              } else {
                sc.field_g = 2;
                break L2;
              }
            }
          } else {
            L4: {
              if (-2 == (var6 ^ -1)) {
                if (!this.field_e.b(false)) {
                  break L4;
                } else {
                  si.a((byte) -68, 5);
                  rk.field_bb = null;
                  g.field_w = null;
                  ua.field_L = new ri();
                  oe.field_e = 0;
                  sc.field_g = -1;
                  break L2;
                }
              } else {
                if (13 != var6) {
                  if (-5 == (var6 ^ -1)) {
                    if (!this.field_e.b(false)) {
                      break L4;
                    } else {
                      si.a((byte) -68, 5);
                      sc.field_g = -1;
                      break L2;
                    }
                  } else {
                    if (21 != var6) {
                      if (22 != var6) {
                        if ((var6 ^ -1) == -27) {
                          if (this.field_e.b(false)) {
                            L5: {
                              si.a((byte) -68, 5);
                              if (fi.field_i) {
                                stackOut_78_0 = 0;
                                stackIn_79_0 = stackOut_78_0;
                                break L5;
                              } else {
                                stackOut_77_0 = 1;
                                stackIn_79_0 = stackOut_77_0;
                                break L5;
                              }
                            }
                            fi.field_i = stackIn_79_0 != 0;
                            break L2;
                          } else {
                            break L2;
                          }
                        } else {
                          if (var6 == 14) {
                            if (!this.field_e.b(false)) {
                              break L4;
                            } else {
                              si.a((byte) -68, 5);
                              sc.field_g = 12;
                              break L2;
                            }
                          } else {
                            if (var6 == 15) {
                              if (!this.field_e.b(false)) {
                                break L4;
                              } else {
                                si.a((byte) -68, 5);
                                sc.field_g = 13;
                                break L2;
                              }
                            } else {
                              if (-24 == (var6 ^ -1)) {
                                if (this.field_e.b(false)) {
                                  si.a((byte) -68, 5);
                                  di.field_i = 0;
                                  break L2;
                                } else {
                                  break L2;
                                }
                              } else {
                                if ((var6 ^ -1) != -25) {
                                  if (var6 != 25) {
                                    if (6 != var6) {
                                      if (-8 != (var6 ^ -1)) {
                                        if ((var6 ^ -1) != -9) {
                                          if (9 == var6) {
                                            if (this.field_e.b(false)) {
                                              si.a((byte) -68, 5);
                                              rd.field_b = 0;
                                              sc.field_g = 7;
                                              break L2;
                                            } else {
                                              break L2;
                                            }
                                          } else {
                                            if (10 != var6) {
                                              if ((var6 ^ -1) != -12) {
                                                if (var6 != 20) {
                                                  if ((var6 ^ -1) != -29) {
                                                    if (12 != var6) {
                                                      if (var6 != 17) {
                                                        if (var6 != 18) {
                                                          if (19 == var6) {
                                                            if (!this.field_e.b(false)) {
                                                              break L4;
                                                            } else {
                                                              si.a((byte) -68, 5);
                                                              if (this.field_c != 8) {
                                                                if (10 == this.field_c) {
                                                                  ad.a(this.field_c, 11, (byte) -109);
                                                                  break L2;
                                                                } else {
                                                                  if (this.field_c == 15) {
                                                                    ad.a(this.field_c, -3, (byte) -47);
                                                                    break L2;
                                                                  } else {
                                                                    if (2 != this.field_c) {
                                                                      throw new RuntimeException();
                                                                    } else {
                                                                      ad.a(this.field_c, 3, (byte) -78);
                                                                      break L2;
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                ad.a(this.field_c, 9, (byte) -120);
                                                                break L2;
                                                              }
                                                            }
                                                          } else {
                                                            if ((var6 ^ -1) != -17) {
                                                              if (-6 == (var6 ^ -1)) {
                                                                if (this.field_e.b(false)) {
                                                                  si.a((byte) -68, 5);
                                                                  ua.field_L.c(3, 117);
                                                                  break L2;
                                                                } else {
                                                                  break L2;
                                                                }
                                                              } else {
                                                                if (-28 == (var6 ^ -1)) {
                                                                  if (!this.field_e.b(false)) {
                                                                    break L4;
                                                                  } else {
                                                                    si.a((byte) -68, 5);
                                                                    if (!jj.s(49)) {
                                                                      if ((oe.field_e ^ -1) != -1) {
                                                                        sc.field_g = 16;
                                                                        break L2;
                                                                      } else {
                                                                        if (-1 == (ua.field_L.field_O ^ -1)) {
                                                                          sc.field_g = 1;
                                                                          break L2;
                                                                        } else {
                                                                          sc.field_g = 11;
                                                                          break L2;
                                                                        }
                                                                      }
                                                                    } else {
                                                                      if ((ua.field_L.field_O | oe.field_e) == 0) {
                                                                        sc.field_g = 0;
                                                                        break L2;
                                                                      } else {
                                                                        sc.field_g = 15;
                                                                        break L2;
                                                                      }
                                                                    }
                                                                  }
                                                                } else {
                                                                  if (-3 == (var6 ^ -1)) {
                                                                    L6: {
                                                                      if (this.field_e.a(true)) {
                                                                        da.a(0, (byte) -74);
                                                                        break L6;
                                                                      } else {
                                                                        break L6;
                                                                      }
                                                                    }
                                                                    L7: {
                                                                      if (this.field_e.b(-32)) {
                                                                        da.a(256, (byte) -74);
                                                                        break L7;
                                                                      } else {
                                                                        break L7;
                                                                      }
                                                                    }
                                                                    L8: {
                                                                      if (this.field_e.e(0)) {
                                                                        L9: {
                                                                          stackOut_153_0 = this.e((byte) 57);
                                                                          stackIn_155_0 = stackOut_153_0;
                                                                          stackIn_154_0 = stackOut_153_0;
                                                                          if (mf.field_i[this.field_c]) {
                                                                            stackOut_155_0 = stackIn_155_0;
                                                                            stackOut_155_1 = mf.field_d[this.field_c] * param2;
                                                                            stackIn_156_0 = stackOut_155_0;
                                                                            stackIn_156_1 = stackOut_155_1;
                                                                            break L9;
                                                                          } else {
                                                                            stackOut_154_0 = stackIn_154_0;
                                                                            stackOut_154_1 = 0;
                                                                            stackIn_156_0 = stackOut_154_0;
                                                                            stackIn_156_1 = stackOut_154_1;
                                                                            break L9;
                                                                          }
                                                                        }
                                                                        var6 = stackIn_156_0 + stackIn_156_1;
                                                                        var7 = -var6 + kf.field_b + -78 << -627868350;
                                                                        if (0 <= var7) {
                                                                          if (-257 >= (var7 ^ -1)) {
                                                                            da.a(256, (byte) -74);
                                                                            break L8;
                                                                          } else {
                                                                            da.a(var7, (byte) -74);
                                                                            break L8;
                                                                          }
                                                                        } else {
                                                                          da.a(0, (byte) -74);
                                                                          break L8;
                                                                        }
                                                                      } else {
                                                                        break L8;
                                                                      }
                                                                    }
                                                                    L10: {
                                                                      if (!this.field_e.a(0)) {
                                                                        break L10;
                                                                      } else {
                                                                        ol.e(256);
                                                                        break L10;
                                                                      }
                                                                    }
                                                                    if (this.field_e.c((byte) 11)) {
                                                                      g.f(-96);
                                                                      break L2;
                                                                    } else {
                                                                      break L2;
                                                                    }
                                                                  } else {
                                                                    if (var6 == 3) {
                                                                      L11: {
                                                                        if (this.field_e.a(true)) {
                                                                          qd.a(false, 0);
                                                                          break L11;
                                                                        } else {
                                                                          break L11;
                                                                        }
                                                                      }
                                                                      L12: {
                                                                        if (!this.field_e.b(param3 + -293)) {
                                                                          break L12;
                                                                        } else {
                                                                          qd.a(false, 256);
                                                                          break L12;
                                                                        }
                                                                      }
                                                                      L13: {
                                                                        if (!this.field_e.e(0)) {
                                                                          break L13;
                                                                        } else {
                                                                          L14: {
                                                                            stackOut_172_0 = this.e((byte) 99);
                                                                            stackIn_174_0 = stackOut_172_0;
                                                                            stackIn_173_0 = stackOut_172_0;
                                                                            if (!mf.field_i[this.field_c]) {
                                                                              stackOut_174_0 = stackIn_174_0;
                                                                              stackOut_174_1 = 0;
                                                                              stackIn_175_0 = stackOut_174_0;
                                                                              stackIn_175_1 = stackOut_174_1;
                                                                              break L14;
                                                                            } else {
                                                                              stackOut_173_0 = stackIn_173_0;
                                                                              stackOut_173_1 = param2 * mf.field_d[this.field_c];
                                                                              stackIn_175_0 = stackOut_173_0;
                                                                              stackIn_175_1 = stackOut_173_1;
                                                                              break L14;
                                                                            }
                                                                          }
                                                                          var6 = stackIn_175_0 - -stackIn_175_1;
                                                                          var7 = -var6 + (kf.field_b - 78) << -1855045886;
                                                                          if (-1 < (var7 ^ -1)) {
                                                                            qd.a(false, 0);
                                                                            break L13;
                                                                          } else {
                                                                            if (-257 < (var7 ^ -1)) {
                                                                              qd.a(false, var7);
                                                                              break L13;
                                                                            } else {
                                                                              qd.a(false, 256);
                                                                              break L13;
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                      L15: {
                                                                        if (!this.field_e.a(0)) {
                                                                          break L15;
                                                                        } else {
                                                                          ij.a((byte) -109);
                                                                          break L15;
                                                                        }
                                                                      }
                                                                      if (this.field_e.c((byte) 11)) {
                                                                        qg.a(13);
                                                                        break L4;
                                                                      } else {
                                                                        break L2;
                                                                      }
                                                                    } else {
                                                                      break L2;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              if (this.field_e.b(false)) {
                                                                si.a((byte) -68, 5);
                                                                af.a(gd.b((byte) 77), (byte) -9);
                                                                break L2;
                                                              } else {
                                                                break L2;
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          if (!this.field_e.b(false)) {
                                                            break L4;
                                                          } else {
                                                            si.a((byte) -68, 5);
                                                            sc.field_g = 9;
                                                            break L2;
                                                          }
                                                        }
                                                      } else {
                                                        if (!this.field_e.b(false)) {
                                                          break L4;
                                                        } else {
                                                          si.a((byte) -68, 5);
                                                          sc.field_g = 8;
                                                          break L2;
                                                        }
                                                      }
                                                    } else {
                                                      if (!this.field_e.b(false)) {
                                                        break L4;
                                                      } else {
                                                        si.a((byte) -68, 5);
                                                        rd.field_b = (rd.field_b - -1) % 2;
                                                        break L2;
                                                      }
                                                    }
                                                  } else {
                                                    if (this.field_e.b(false)) {
                                                      L16: {
                                                        si.a((byte) -68, 5);
                                                        if (og.field_rb == null) {
                                                          break L16;
                                                        } else {
                                                          oj.a(param3 ^ -499);
                                                          break L16;
                                                        }
                                                      }
                                                      of.a(-80, gd.b((byte) 77));
                                                      break L2;
                                                    } else {
                                                      break L2;
                                                    }
                                                  }
                                                } else {
                                                  if (!this.field_e.b(false)) {
                                                    break L4;
                                                  } else {
                                                    si.a((byte) -68, 5);
                                                    ka.field_d.e(param3 ^ 391);
                                                    th.field_l = 0;
                                                    pc.field_i = 0;
                                                    oe.field_e = 0;
                                                    cd.field_h.e(1);
                                                    sc.field_g = 0;
                                                    break L2;
                                                  }
                                                }
                                              } else {
                                                if (this.field_e.b(false)) {
                                                  si.a((byte) -68, 5);
                                                  sc.field_g = 1;
                                                  break L2;
                                                } else {
                                                  break L2;
                                                }
                                              }
                                            } else {
                                              if (!this.field_e.b(false)) {
                                                break L4;
                                              } else {
                                                si.a((byte) -68, 5);
                                                sc.field_g = 0;
                                                break L2;
                                              }
                                            }
                                          }
                                        } else {
                                          if (!this.field_e.b(false)) {
                                            break L4;
                                          } else {
                                            si.a((byte) -68, 5);
                                            rd.field_b = 0;
                                            sc.field_g = 6;
                                            break L2;
                                          }
                                        }
                                      } else {
                                        if (!this.field_e.b(false)) {
                                          break L4;
                                        } else {
                                          si.a((byte) -68, 5);
                                          rd.field_b = 0;
                                          sc.field_g = 5;
                                          break L2;
                                        }
                                      }
                                    } else {
                                      if (!this.field_e.b(false)) {
                                        break L4;
                                      } else {
                                        si.a((byte) -68, 5);
                                        sc.field_g = 4;
                                        rd.field_b = 0;
                                        break L2;
                                      }
                                    }
                                  } else {
                                    if (!this.field_e.b(false)) {
                                      break L4;
                                    } else {
                                      si.a((byte) -68, 5);
                                      di.field_i = 2;
                                      break L2;
                                    }
                                  }
                                } else {
                                  if (this.field_e.b(false)) {
                                    si.a((byte) -68, 5);
                                    di.field_i = 1;
                                    break L2;
                                  } else {
                                    break L2;
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        if (this.field_e.b(false)) {
                          si.a((byte) -68, 5);
                          sc.field_g = 11;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    } else {
                      if (!this.field_e.b(false)) {
                        break L4;
                      } else {
                        si.a((byte) -68, 5);
                        sc.field_g = 10;
                        break L2;
                      }
                    }
                  }
                } else {
                  if (this.field_e.b(false)) {
                    si.a((byte) -68, 5);
                    if (og.field_rb == null) {
                      var6 = param1 ? 1 : 0;
                      oi.a(26, gb.field_l, 26, bk.field_E, bk.field_E, 10, 320, 20, 240, gb.field_l, -3748, var6 != 0, 18, 0, 0);
                      break L2;
                    } else {
                      oj.a(-127);
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
              }
            }
            break L2;
          }
        }
    }

    mg(TrackController param0, int param1) {
        this.field_h = -1;
        this.field_d = -1;
        this.field_g = -1;
        try {
            this.field_e = new cd(mf.field_f[param1].length);
            this.field_c = param1;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "mg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_f = 0;
        field_a = false;
    }
}
