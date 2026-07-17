/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

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
          if (he.field_f[((mg) this).field_c] != null) {
            he.field_f[((mg) this).field_c].a(true, 90);
            break L0;
          } else {
            break L0;
          }
        }
        int discarded$3 = 125;
        var2 = this.b();
        var3 = mb.field_b + -var2;
        if (param0 == -99) {
          L1: {
            if (var3 > 0) {
              var3 = (var3 << 3) - var3 >> 3;
              break L1;
            } else {
              if (var3 >= 0) {
                break L1;
              } else {
                var3 = -(var3 + (-var3 << 3) >> 3);
                break L1;
              }
            }
          }
          mb.field_b = var3 + var2;
          L2: while (true) {
            int discarded$4 = 127;
            if (!mh.e()) {
              L3: {
                ((mg) this).field_e.a(-118, this.a((byte) 6, kf.field_b, fg.field_a), this.a((byte) 6, db.field_X, wg.field_e));
                if (((mg) this).field_e.field_e != -1) {
                  this.a(((mg) this).field_e.field_e, false, true);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                L5: {
                  if (((mg) this).field_c == 2) {
                    break L5;
                  } else {
                    if (((mg) this).field_c != 3) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  var4 = -1;
                  var5 = -1;
                  if (kf.field_b < 576) {
                    break L6;
                  } else {
                    if (kf.field_b < 602) {
                      L7: {
                        if (67 > fg.field_a) {
                          break L7;
                        } else {
                          if (fg.field_a >= 93) {
                            break L7;
                          } else {
                            var4 = 0;
                            break L7;
                          }
                        }
                      }
                      if (fg.field_a < 431) {
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
                  if (db.field_X < 576) {
                    break L9;
                  } else {
                    if (db.field_X >= 602) {
                      break L9;
                    } else {
                      L10: {
                        if (67 > wg.field_e) {
                          break L10;
                        } else {
                          if (wg.field_e >= 93) {
                            break L10;
                          } else {
                            var5 = 0;
                            break L10;
                          }
                        }
                      }
                      if (wg.field_e < 431) {
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
                  if (uk.field_a == 0) {
                    break L12;
                  } else {
                    tc.field_b = var5;
                    break L12;
                  }
                }
                L13: {
                  if (((mg) this).field_e.e(0)) {
                    break L13;
                  } else {
                    L14: {
                      if (((mg) this).field_e.field_a) {
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
                      ((mg) this).field_e.field_a = true;
                      break L13;
                    } else {
                      if (!((mg) this).field_e.field_a) {
                        break L13;
                      } else {
                        tc.field_b = -1;
                        break L13;
                      }
                    }
                  }
                }
                L15: {
                  if (!((mg) this).field_e.d(0)) {
                    break L15;
                  } else {
                    L16: {
                      var6 = qh.field_b.field_x;
                      var7 = this.a(db.field_X, 2600, wg.field_e);
                      if (var7 != null) {
                        ((mg) this).field_e.field_a = true;
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
                if (((mg) this).field_e.b(false)) {
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
                    if (tc.field_b != 1) {
                      break L17;
                    } else {
                      if (~gj.field_f.length < ~qh.field_b.field_x) {
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
                if (uk.field_a == 0) {
                  break L19;
                } else {
                  ((mg) this).field_g = wg.field_e;
                  ((mg) this).field_h = db.field_X;
                  break L19;
                }
              }
              L20: {
                var4 = -1;
                var5 = this.a((byte) 6, kf.field_b, fg.field_a);
                if (var5 != -1) {
                  var4 = this.b(79, var5);
                  break L20;
                } else {
                  break L20;
                }
              }
              qc.a(var4, (byte) 20);
              return;
            } else {
              int discarded$5 = -55;
              this.d();
              continue L2;
            }
          }
        } else {
          return;
        }
    }

    private final int b() {
        int var2 = 0;
        L0: {
          var2 = 0;
          if (8 <= qh.field_b.field_x) {
            break L0;
          } else {
            var2 = -208 + qh.field_b.field_x * 26;
            break L0;
          }
        }
        L1: {
          if (qh.field_b.field_x > 24) {
            var2 = (-24 + qh.field_b.field_x) * 26;
            break L1;
          } else {
            break L1;
          }
        }
        return var2;
    }

    final static int a() {
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
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_7_0 = 0;
        var8 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var4 = me.field_q;
            L1: while (true) {
              if (var3_int >= sa.field_I.length) {
                stackOut_12_0 = -1;
                stackIn_13_0 = stackOut_12_0;
                break L0;
              } else {
                L2: {
                  var5 = mj.field_b[var3_int];
                  if (var5 < 0) {
                    var4 = var4 + dh.field_l;
                    break L2;
                  } else {
                    var6 = ib.a(true, 10, sa.field_I[var3_int]);
                    var7 = -(var6 >> 1) + sf.field_F;
                    var4 = var4 + na.field_e;
                    if (eb.a(-mb.field_c + var7, param0, 10, (mb.field_c << 1) + var6, var4, param2, pc.field_m + (of.field_f << 1))) {
                      stackOut_7_0 = var5;
                      stackIn_8_0 = stackOut_7_0;
                      return stackIn_8_0;
                    } else {
                      var4 = var4 + (pc.field_m + ((of.field_f << 1) - -na.field_e));
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
          throw sl.a((Throwable) (Object) var3, "mg.M(" + param0 + 44 + 0 + 44 + param2 + 41);
        }
        return stackIn_13_0;
    }

    private final ea a(int param0, int param1, int param2) {
        int var4 = 0;
        L0: {
          param0 -= 359;
          param2 = param2 - (bk.field_E.field_u + 62);
          if (param0 < 0) {
            break L0;
          } else {
            if (param0 >= 182) {
              break L0;
            } else {
              if (param2 < 0) {
                break L0;
              } else {
                if (param2 >= 390) {
                  break L0;
                } else {
                  var4 = qh.field_b.field_x - (-((param2 - (mb.field_b - 2600)) / 26) + 108);
                  if (var4 < 0) {
                    break L0;
                  } else {
                    if (gj.field_f.length > var4) {
                      return gj.field_f[var4];
                    } else {
                      break L0;
                    }
                  }
                }
              }
            }
          }
        }
        return null;
    }

    private final void a(int param0, boolean param1, boolean param2) {
        int discarded$0 = 390;
        this.a(false, param2, param0);
    }

    private final void c() {
        oh var2 = null;
        int var3 = 0;
        int var9 = 0;
        oh var10 = null;
        var9 = TrackController.field_F ? 1 : 0;
        var10 = bk.field_E;
        var2 = var10;
        al.field_z[2].e(-al.field_z[2].field_t + 640 >> 1, 1);
        var3 = 74;
        var3 += 20;
        var3 = var3 + var10.a(tf.field_b, 34, -var10.field_q + var3, 572, 1000, 0, -1, 3, 0, 26) * 26;
        var3 += 26;
        int discarded$1 = var10.a(gh.field_e, 34, -var10.field_q + var3, 572, 1000, 0, -1, 3, 0, 26);
        var10.a(be.a((byte) 22, 2, 1 + rd.field_b), 606, 406, 0, -1);
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
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        int stackIn_8_4 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        int stackIn_12_4 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        int stackOut_7_4 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_5_4 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        int stackOut_11_4 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        int stackOut_9_4 = 0;
        var13 = TrackController.field_F ? 1 : 0;
        var2_int = 0;
        L0: while (true) {
          if (var2_int >= 11) {
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
                    int discarded$5 = -102;
                    int discarded$6 = 10;
                    int discarded$7 = 1;
                    int discarded$8 = 10;
                    int discarded$9 = 3;
                    g.field_w = hj.a();
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
                              if (var7 != 10) {
                                if (var3_ref_String__[var7] != null) {
                                  L7: {
                                    var2 = "";
                                    var8 = var17[var7];
                                    if (var4 >= 0) {
                                      break L7;
                                    } else {
                                      if (var3_ref_String__[var7] != ue.field_a) {
                                        break L7;
                                      } else {
                                        if (null == rk.field_bb) {
                                          break L7;
                                        } else {
                                          if (~rk.field_bb.field_j != ~g.field_w.field_q[di.field_i][var7]) {
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
                                  var9 = (Object) (Object) var3_ref_String__[var7];
                                  break L6;
                                } else {
                                  break L6;
                                }
                              } else {
                                if (0 > var4) {
                                  if (null != ua.field_L) {
                                    var8 = ua.field_L.field_O;
                                    var4 = var7;
                                    var9 = (Object) (Object) ue.field_a;
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
                                    if (null == he.field_f[((mg) this).field_c]) {
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
                                bk.field_E.c((String) var10, 181, var6, var11, -1);
                                bk.field_E.a(Integer.toString(var8), 487, var6, var11, -1);
                                if (var4 != var7) {
                                  break L8;
                                } else {
                                  if (he.field_f[((mg) this).field_c] != null) {
                                    var12 = he.field_f[((mg) this).field_c];
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
            var3 = 224;
            bk.field_E.b(var2, 255, var3, 0, -1);
            return;
          } else {
            L11: {
              stackOut_2_0 = 151;
              stackOut_2_1 = 48 - -(var2_int * 26) - -26;
              stackOut_2_2 = 208;
              stackOut_2_3 = 26;
              stackIn_7_0 = stackOut_2_0;
              stackIn_7_1 = stackOut_2_1;
              stackIn_7_2 = stackOut_2_2;
              stackIn_7_3 = stackOut_2_3;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              stackIn_3_2 = stackOut_2_2;
              stackIn_3_3 = stackOut_2_3;
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
                break L11;
              } else {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = stackIn_3_2;
                stackOut_3_3 = stackIn_3_3;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                stackIn_5_2 = stackOut_3_2;
                stackIn_5_3 = stackOut_3_3;
                stackOut_5_0 = stackIn_5_0;
                stackOut_5_1 = stackIn_5_1;
                stackOut_5_2 = stackIn_5_2;
                stackOut_5_3 = stackIn_5_3;
                stackOut_5_4 = 6048056;
                stackIn_8_0 = stackOut_5_0;
                stackIn_8_1 = stackOut_5_1;
                stackIn_8_2 = stackOut_5_2;
                stackIn_8_3 = stackOut_5_3;
                stackIn_8_4 = stackOut_5_4;
                break L11;
              }
            }
            L12: {
              ll.c(stackIn_8_0, stackIn_8_1, stackIn_8_2, stackIn_8_3, stackIn_8_4);
              stackOut_8_0 = 385;
              stackOut_8_1 = 26 * (var2_int + 1) + 48;
              stackOut_8_2 = 104;
              stackOut_8_3 = 26;
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              stackIn_11_3 = stackOut_8_3;
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              stackIn_9_3 = stackOut_8_3;
              if ((var2_int & 1) == 0) {
                stackOut_11_0 = stackIn_11_0;
                stackOut_11_1 = stackIn_11_1;
                stackOut_11_2 = stackIn_11_2;
                stackOut_11_3 = stackIn_11_3;
                stackOut_11_4 = 9073738;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                stackIn_12_2 = stackOut_11_2;
                stackIn_12_3 = stackOut_11_3;
                stackIn_12_4 = stackOut_11_4;
                break L12;
              } else {
                stackOut_9_0 = stackIn_9_0;
                stackOut_9_1 = stackIn_9_1;
                stackOut_9_2 = stackIn_9_2;
                stackOut_9_3 = stackIn_9_3;
                stackOut_9_4 = 6048056;
                stackIn_12_0 = stackOut_9_0;
                stackIn_12_1 = stackOut_9_1;
                stackIn_12_2 = stackOut_9_2;
                stackIn_12_3 = stackOut_9_3;
                stackIn_12_4 = stackOut_9_4;
                break L12;
              }
            }
            ll.c(stackIn_12_0, stackIn_12_1, stackIn_12_2, stackIn_12_3, stackIn_12_4);
            var2_int++;
            continue L0;
          }
        }
    }

    private final void a(boolean param0, int param1, int param2, int param3) {
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        qj var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_7_0 = 0;
        String stackIn_17_0 = null;
        int stackIn_30_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_68_0 = 0;
        qj[] stackIn_77_0 = null;
        qj[] stackIn_79_0 = null;
        qj[] stackIn_81_0 = null;
        qj[] stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        String stackOut_16_0 = null;
        String stackOut_14_0 = null;
        int stackOut_29_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        qj[] stackOut_76_0 = null;
        qj[] stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        qj[] stackOut_77_0 = null;
        qj[] stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        int stackOut_63_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_65_0 = 0;
        L0: {
          L1: {
            var13 = TrackController.field_F ? 1 : 0;
            var6 = this.b(66, param3);
            var7 = ja.field_c[var6];
            cl.a(gb.field_l, param1, 26, param2, 156, 4);
            if (var6 == 2) {
              break L1;
            } else {
              if (var6 != 3) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackOut_4_0 = 1;
          stackIn_7_0 = stackOut_4_0;
          break L0;
        }
        L2: {
          var8 = stackIn_7_0;
          if (var7 == null) {
            var9 = var6;
            if (12 != var9) {
              throw new IllegalStateException("Unexpected optionNo: " + var6);
            } else {
              L3: {
                if (1 != rd.field_b) {
                  stackOut_16_0 = q.field_o;
                  stackIn_17_0 = stackOut_16_0;
                  break L3;
                } else {
                  stackOut_14_0 = l.field_n;
                  stackIn_17_0 = stackOut_14_0;
                  break L3;
                }
              }
              var7 = stackIn_17_0;
              break L2;
            }
          } else {
            break L2;
          }
        }
        L4: {
          if (this.a((byte) 83, var6)) {
            if (!param0) {
              stackOut_29_0 = 0;
              stackIn_30_0 = stackOut_29_0;
              break L4;
            } else {
              stackOut_27_0 = 1;
              stackIn_30_0 = stackOut_27_0;
              break L4;
            }
          } else {
            if (!param0) {
              stackOut_25_0 = 2;
              stackIn_30_0 = stackOut_25_0;
              break L4;
            } else {
              stackOut_23_0 = 3;
              stackIn_30_0 = stackOut_23_0;
              break L4;
            }
          }
        }
        L5: {
          var9 = stackIn_30_0;
          if (param0) {
            break L5;
          } else {
            L6: {
              if (var6 != 23) {
                break L6;
              } else {
                if (di.field_i != 0) {
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
            if (var6 != 25) {
              break L5;
            } else {
              if (di.field_i == 2) {
                var9 = 6;
                break L5;
              } else {
                break L5;
              }
            }
          }
        }
        L8: {
          if (var8 == 0) {
            if (26 == var6) {
              L9: {
                stackOut_76_0 = kg.field_e;
                stackIn_81_0 = stackOut_76_0;
                stackIn_77_0 = stackOut_76_0;
                if (!fi.field_i) {
                  stackOut_81_0 = (qj[]) (Object) stackIn_81_0;
                  stackOut_81_1 = 1;
                  stackIn_82_0 = stackOut_81_0;
                  stackIn_82_1 = stackOut_81_1;
                  break L9;
                } else {
                  stackOut_77_0 = (qj[]) (Object) stackIn_77_0;
                  stackIn_79_0 = stackOut_77_0;
                  stackOut_79_0 = (qj[]) (Object) stackIn_79_0;
                  stackOut_79_1 = 0;
                  stackIn_82_0 = stackOut_79_0;
                  stackIn_82_1 = stackOut_79_1;
                  break L9;
                }
              }
              var10 = stackIn_82_0[stackIn_82_1];
              var11 = bk.field_E.a(var7) - (-bk.field_E.a(' ') + -var10.field_s);
              var12 = param1 + (156 - var11 >> 1);
              bk.field_E.c(var7, var12, -2 + (bk.field_E.field_G + param2), var9, -1);
              var10.e(var12 - (-var11 - -var10.field_s), (1 + -var10.field_v + 26 >> 1) + param2);
              break L8;
            } else {
              bk.field_E.b(var7, 78 + param1, param2 - (-bk.field_E.field_G - -2), var9, -1);
              break L8;
            }
          } else {
            L10: {
              bk.field_E.c(var7, param1 - -13, bk.field_E.field_G + param2 + -2, var9, -1);
              if (!this.a((byte) 60, var6)) {
                if (!param0) {
                  stackOut_63_0 = 4473924;
                  stackIn_64_0 = stackOut_63_0;
                  break L10;
                } else {
                  stackOut_61_0 = 12303291;
                  stackIn_64_0 = stackOut_61_0;
                  break L10;
                }
              } else {
                if (param0) {
                  stackOut_59_0 = 8110658;
                  stackIn_64_0 = stackOut_59_0;
                  break L10;
                } else {
                  stackOut_57_0 = 15252224;
                  stackIn_64_0 = stackOut_57_0;
                  break L10;
                }
              }
            }
            L11: {
              var10_int = stackIn_64_0;
              ll.c(param1 + 78, param2 - -13, 64, 2, var10_int);
              if (var6 == 2) {
                stackOut_67_0 = qd.field_d;
                stackIn_68_0 = stackOut_67_0;
                break L11;
              } else {
                stackOut_65_0 = kc.field_b;
                stackIn_68_0 = stackOut_65_0;
                break L11;
              }
            }
            L12: {
              var11 = stackIn_68_0 >> 2;
              if (var11 >= 0) {
                break L12;
              } else {
                var11 = 0;
                break L12;
              }
            }
            ll.c(param1 + (78 - (-var11 + 1)), -6 + param2 - -13, 3, 14, 8110658);
            ll.g(var11 + (78 + param1) + -2, 13 + param2, 2, 16580608);
            ll.g(2 + (param1 + 78 + var11), param2 - -13, 2, 16580608);
            break L8;
          }
        }
    }

    private final int e(byte param0) {
        if (param0 > 51) {
          L0: {
            if (((mg) this).field_c == 4) {
              break L0;
            } else {
              if (((mg) this).field_c == 5) {
                break L0;
              } else {
                if (((mg) this).field_c == 6) {
                  break L0;
                } else {
                  if (((mg) this).field_c != 7) {
                    return mf.field_a[((mg) this).field_c];
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
          return mf.field_a[((mg) this).field_c] - -mf.field_d[((mg) this).field_c];
        } else {
          return 61;
        }
    }

    private final boolean a(byte param0, int param1) {
        int var3 = 0;
        int stackIn_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        var3 = 92 % ((-2 - param0) / 57);
        if (param1 != 1) {
          return true;
        } else {
          L0: {
            L1: {
              if (qh.field_b == null) {
                break L1;
              } else {
                if (pc.field_i - -1 < qh.field_b.field_x) {
                  break L1;
                } else {
                  stackOut_3_0 = 1;
                  stackIn_6_0 = stackOut_3_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        }
    }

    private final int a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        if (((mg) this).field_c != 11) {
          if (!mf.field_i[((mg) this).field_c]) {
            L0: {
              if (param1 < mf.field_a[((mg) this).field_c]) {
                break L0;
              } else {
                if (~param1 > ~(mf.field_b[((mg) this).field_c] + mf.field_a[((mg) this).field_c])) {
                  if (~mf.field_h[((mg) this).field_c] < ~param2) {
                    return -1;
                  } else {
                    var4 = (param2 + -mf.field_h[((mg) this).field_c]) / mf.field_d[((mg) this).field_c];
                    if (mf.field_f[((mg) this).field_c].length > var4) {
                      if (~(26 + mf.field_d[((mg) this).field_c] * var4 + mf.field_h[((mg) this).field_c]) <= ~param2) {
                        return var4;
                      } else {
                        return -1;
                      }
                    } else {
                      return -1;
                    }
                  }
                } else {
                  break L0;
                }
              }
            }
            return -1;
          } else {
            L1: {
              if (~mf.field_h[((mg) this).field_c] < ~param2) {
                break L1;
              } else {
                if (mf.field_b[((mg) this).field_c] + mf.field_h[((mg) this).field_c] <= param2) {
                  break L1;
                } else {
                  var4 = this.e((byte) 121);
                  if (~param1 <= ~var4) {
                    var5 = (param1 + -var4) / mf.field_d[((mg) this).field_c];
                    if (~mf.field_f[((mg) this).field_c].length >= ~var5) {
                      return -1;
                    } else {
                      param1 = -(var5 * mf.field_d[((mg) this).field_c]) + -var4 + param1;
                      if (param1 >= 156) {
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
          L2: {
            param1 = param1 - mf.field_a[((mg) this).field_c];
            param2 = param2 - mf.field_h[((mg) this).field_c];
            if (0 > param1) {
              break L2;
            } else {
              if (param2 >= 0) {
                var4 = param2 / mf.field_b[((mg) this).field_c];
                var5 = param1 / mf.field_d[((mg) this).field_c];
                param1 = param1 - var5 * mf.field_d[((mg) this).field_c];
                if (param1 >= 156) {
                  return -1;
                } else {
                  L3: {
                    if (var4 != 0) {
                      break L3;
                    } else {
                      if (3 > var5) {
                        return var5;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (1 != var4) {
                      break L4;
                    } else {
                      if (var5 == 1) {
                        return 3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  return -1;
                }
              } else {
                break L2;
              }
            }
          }
          return -1;
        }
    }

    public static void a(int param0) {
        L0: {
          field_b = null;
          if (param0 == -8381) {
            break L0;
          } else {
            mg.a(-48);
            break L0;
          }
        }
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        L0: {
          L1: {
            var3 = 0;
            if (((mg) this).field_c == 0) {
              break L1;
            } else {
              if (((mg) this).field_c != 1) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          if (((mg) this).field_e.field_e == -1) {
            break L0;
          } else {
            var3 = ((mg) this).field_e.field_e;
            break L0;
          }
        }
        L2: {
          L3: {
            if (((mg) this).field_c == 12) {
              break L3;
            } else {
              if (((mg) this).field_c != 13) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          if (((mg) this).field_e.field_e == -1) {
            break L2;
          } else {
            if (ib.field_a != -1) {
              var3 = ((mg) this).field_e.field_e;
              break L2;
            } else {
              break L2;
            }
          }
        }
        L4: {
          L5: {
            if (((mg) this).field_c == 4) {
              break L5;
            } else {
              if (((mg) this).field_c == 5) {
                break L5;
              } else {
                if (((mg) this).field_c == 6) {
                  break L5;
                } else {
                  if (((mg) this).field_c == 7) {
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
            ((mg) this).field_e.a(var3, this.a((byte) 6, kf.field_b, fg.field_a), param1, 120);
            if (((mg) this).field_c == 2) {
              break L7;
            } else {
              if (3 == ((mg) this).field_c) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          int discarded$1 = 125;
          mb.field_b = this.b();
          break L6;
        }
        L8: {
          if (param0 == 10412) {
            break L8;
          } else {
            ((mg) this).c(-110);
            break L8;
          }
        }
    }

    private final void d() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          var5 = TrackController.field_F ? 1 : 0;
          if (2 <= sl.field_j) {
            if (1 != kg.field_d) {
              break L0;
            } else {
              L1: {
                if (nf.field_f) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L1;
                } else {
                  stackOut_7_0 = 1;
                  stackIn_10_0 = stackOut_7_0;
                  break L1;
                }
              }
              nf.field_f = stackIn_10_0 != 0;
              break L0;
            }
          } else {
            break L0;
          }
        }
        L2: {
          var2 = 86;
          if (kg.field_d == 13) {
            if (-2147483648 == mf.field_e[((mg) this).field_c]) {
              break L2;
            } else {
              si.a((byte) -68, 5);
              sc.field_g = mf.field_e[((mg) this).field_c];
              break L2;
            }
          } else {
            break L2;
          }
        }
        L3: {
          if (11 == ((mg) this).field_c) {
            L4: {
              if (((mg) this).field_e.e(0)) {
                break L4;
              } else {
                if (kg.field_d == 96) {
                  L5: {
                    if (0 >= ((mg) this).field_e.field_e) {
                      ((mg) this).field_e.field_e = 2;
                      break L5;
                    } else {
                      if (3 == ((mg) this).field_e.field_e) {
                        break L5;
                      } else {
                        ((mg) this).field_e.field_e = ((mg) this).field_e.field_e - 1;
                        break L5;
                      }
                    }
                  }
                  ((mg) this).field_e.field_a = false;
                  break L4;
                } else {
                  if (kg.field_d != 97) {
                    if (99 == kg.field_d) {
                      L6: {
                        L7: {
                          if (-1 == ((mg) this).field_e.field_e) {
                            break L7;
                          } else {
                            if (((mg) this).field_e.field_e != 3) {
                              ((mg) this).field_e.field_e = 3;
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        ((mg) this).field_e.field_e = di.field_i;
                        break L6;
                      }
                      ((mg) this).field_e.field_a = false;
                      break L4;
                    } else {
                      if (kg.field_d == 98) {
                        L8: {
                          if (3 == ((mg) this).field_e.field_e) {
                            ((mg) this).field_e.field_e = di.field_i;
                            break L8;
                          } else {
                            ((mg) this).field_e.field_e = 3;
                            break L8;
                          }
                        }
                        ((mg) this).field_e.field_a = false;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  } else {
                    L9: {
                      if (2 > ((mg) this).field_e.field_e) {
                        ((mg) this).field_e.field_e = ((mg) this).field_e.field_e + 1;
                        break L9;
                      } else {
                        if (2 != ((mg) this).field_e.field_e) {
                          break L9;
                        } else {
                          ((mg) this).field_e.field_e = 0;
                          break L9;
                        }
                      }
                    }
                    ((mg) this).field_e.field_a = false;
                    break L4;
                  }
                }
              }
            }
            ((mg) this).field_e.f(0);
            break L3;
          } else {
            L10: {
              if (((mg) this).field_c == 2) {
                break L10;
              } else {
                if (3 != ((mg) this).field_c) {
                  if (!mf.field_i[((mg) this).field_c]) {
                    ((mg) this).field_e.b((byte) -76);
                    break L3;
                  } else {
                    ((mg) this).field_e.a((byte) 20);
                    break L3;
                  }
                } else {
                  break L10;
                }
              }
            }
            if (((mg) this).field_e.e(0)) {
              ((mg) this).field_e.f(0);
              break L3;
            } else {
              L11: {
                if (kg.field_d == 97) {
                  break L11;
                } else {
                  L12: {
                    if (kg.field_d != 80) {
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
                    if (kg.field_d == 96) {
                      break L13;
                    } else {
                      L14: {
                        if (kg.field_d != 80) {
                          break L14;
                        } else {
                          if (!ni.field_m[81]) {
                            break L14;
                          } else {
                            break L13;
                          }
                        }
                      }
                      if (((mg) this).field_e.field_e >= 0) {
                        ((mg) this).field_e.b((byte) -113);
                        break L3;
                      } else {
                        L15: {
                          var3 = qh.field_b.field_x;
                          if (kg.field_d == 98) {
                            L16: {
                              tc.field_b = 2;
                              if (qh.field_b.field_x > 1) {
                                qh.field_b = gj.field_f[-2 + qh.field_b.field_x];
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                            ((mg) this).field_e.field_a = false;
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        L17: {
                          if (99 == kg.field_d) {
                            L18: {
                              tc.field_b = 2;
                              if (~gj.field_f.length < ~qh.field_b.field_x) {
                                qh.field_b = gj.field_f[qh.field_b.field_x];
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            ((mg) this).field_e.field_a = false;
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        L19: {
                          if (tc.field_b != 0) {
                            break L19;
                          } else {
                            L20: {
                              if (kg.field_d == 83) {
                                break L20;
                              } else {
                                if (kg.field_d != 84) {
                                  break L19;
                                } else {
                                  break L20;
                                }
                              }
                            }
                            L21: {
                              if (qh.field_b.field_x > 1) {
                                qh.field_b = gj.field_f[-2 + qh.field_b.field_x];
                                break L21;
                              } else {
                                break L21;
                              }
                            }
                            ((mg) this).field_e.field_a = false;
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
                                if (kg.field_d != 84) {
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
                            ((mg) this).field_e.field_a = false;
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
                                if (var4 < 0) {
                                  var4 = 0;
                                  break L26;
                                } else {
                                  break L26;
                                }
                              }
                              qh.field_b = gj.field_f[var4];
                              ((mg) this).field_e.field_a = false;
                              break L25;
                            }
                          }
                          L27: {
                            if (kg.field_d == 105) {
                              L28: {
                                var4 = 7 + qh.field_b.field_x;
                                if (~var4 <= ~gj.field_f.length) {
                                  var4 = gj.field_f.length - 1;
                                  break L28;
                                } else {
                                  break L28;
                                }
                              }
                              qh.field_b = gj.field_f[var4];
                              ((mg) this).field_e.field_a = false;
                              break L27;
                            } else {
                              break L27;
                            }
                          }
                          L29: {
                            if (kg.field_d != 102) {
                              break L29;
                            } else {
                              ((mg) this).field_e.field_a = false;
                              qh.field_b = gj.field_f[0];
                              break L29;
                            }
                          }
                          L30: {
                            if (kg.field_d != 103) {
                              break L30;
                            } else {
                              qh.field_b = gj.field_f[gj.field_f.length - 1];
                              ((mg) this).field_e.field_a = false;
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
                      ((mg) this).field_e.field_e = -1;
                      break L32;
                    } else {
                      tc.field_b = -1;
                      ((mg) this).field_e.field_e = 0;
                      break L32;
                    }
                  }
                  ((mg) this).field_e.field_a = false;
                  break L3;
                }
              }
              L33: {
                if (((mg) this).field_e.field_e < 0) {
                  tc.field_b = -1;
                  ((mg) this).field_e.field_e = 0;
                  break L33;
                } else {
                  tc.field_b = 2;
                  ((mg) this).field_e.field_e = -1;
                  break L33;
                }
              }
              ((mg) this).field_e.field_a = false;
              break L3;
            }
          }
        }
        L34: {
          if (((mg) this).field_e.field_e != -1) {
            this.a(((mg) this).field_e.field_e, false, false);
            break L34;
          } else {
            break L34;
          }
        }
    }

    private final void a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_4_0 = 0;
        int stackIn_43_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_40_0 = 0;
        L0: {
          var10 = TrackController.field_F ? 1 : 0;
          var3 = 122;
          var4 = 128;
          if (!param0) {
            stackOut_3_0 = th.field_l;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          } else {
            stackOut_1_0 = oe.field_e;
            stackIn_4_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_4_0;
          if (!param0) {
            break L1;
          } else {
            var6 = sc.a(var5, param1 + -17461);
            if (var6 > 8) {
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
          if (var8 >= wa.field_k.length) {
            if (param1 == 17460) {
              L3: {
                if (((mg) this).field_d > -1) {
                  var7 = ((mg) this).field_d;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (var7 != -1) {
                  L5: {
                    bk.field_E.b(wa.field_k[var7], 320, 224, 0, -1);
                    if ((1 << var7 & var5) != 0) {
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
                  int discarded$2 = bk.field_E.a(gj.field_b[var7], 50, 302 - bk.field_E.field_G, 201, 1000, 0, -1, 0, 0, 26);
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
            if (this.a(var8, 10)) {
              L8: {
                if ((1 << var8 & var5) != 0) {
                  bb.field_b[var8].b(var3, var4);
                  break L8;
                } else {
                  if (param0) {
                    var8++;
                    continue L2;
                  } else {
                    vj.field_a.b(var3, var4);
                    break L8;
                  }
                }
              }
              L9: {
                if (kf.field_b < var3) {
                  break L9;
                } else {
                  if (kf.field_b > 32 + var3) {
                    break L9;
                  } else {
                    if (fg.field_a < var4) {
                      break L9;
                    } else {
                      if (fg.field_a > 32 + var4) {
                        break L9;
                      } else {
                        var7 = var8;
                        ll.d(-2 + var3, var4 + -2, 36, 36, 6, 16711680);
                        break L9;
                      }
                    }
                  }
                }
              }
              L10: {
                if (-1 == ((mg) this).field_h) {
                  break L10;
                } else {
                  if (var3 > ((mg) this).field_h) {
                    break L10;
                  } else {
                    if (((mg) this).field_h > var3 - -32) {
                      break L10;
                    } else {
                      if (var4 > ((mg) this).field_g) {
                        break L10;
                      } else {
                        if (32 + var4 < ((mg) this).field_g) {
                          break L10;
                        } else {
                          ((mg) this).field_h = -1;
                          if (var8 != ((mg) this).field_d) {
                            ((mg) this).field_d = var8;
                            break L10;
                          } else {
                            ((mg) this).field_d = -1;
                            break L10;
                          }
                        }
                      }
                    }
                  }
                }
              }
              L11: {
                if (var8 == ((mg) this).field_d) {
                  ll.d(var3 + -2, -2 + var4, 36, 36, 6, 15252224);
                  break L11;
                } else {
                  break L11;
                }
              }
              int incrementValue$3 = var6;
              var6++;
              if (incrementValue$3 == 7) {
                L12: {
                  if (!this.a(12, 10)) {
                    stackOut_42_0 = 4;
                    stackIn_43_0 = stackOut_42_0;
                    break L12;
                  } else {
                    stackOut_40_0 = 5;
                    stackIn_43_0 = stackOut_40_0;
                    break L12;
                  }
                }
                var9 = stackIn_43_0;
                var4 -= 52;
                var3 = 122 - -(416 - var9 * 52 >> 1);
                var8++;
                continue L2;
              } else {
                var3 += 52;
                var8++;
                continue L2;
              }
            } else {
              var8++;
              continue L2;
            }
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
            ((mg) this).field_c = -79;
            break L0;
          }
        }
        L1: {
          var3 = mf.field_f[((mg) this).field_c][param1];
          if (((mg) this).field_c == 4) {
            if (param1 == 0) {
              var3 = 10;
              break L1;
            } else {
              if (param1 != 1) {
                break L1;
              } else {
                var3 = 12;
                break L1;
              }
            }
          } else {
            break L1;
          }
        }
        L2: {
          if (5 == ((mg) this).field_c) {
            if (rd.field_b != 0) {
              if (param1 != 0) {
                if (param1 != 1) {
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
                if (param1 == 1) {
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
          if (6 == ((mg) this).field_c) {
            if (rd.field_b == 0) {
              if (param1 != 0) {
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
                if (param1 == 1) {
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
          if (((mg) this).field_c == 7) {
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
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        if (0 == (th.field_l & 1 << param0)) {
          L0: {
            L1: {
              if (param0 != 12) {
                break L1;
              } else {
                if (!ui.a(0, true)) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_7_0 = 1;
            stackIn_10_0 = stackOut_7_0;
            break L0;
          }
          return stackIn_10_0 != 0;
        } else {
          return true;
        }
    }

    final void b(int param0) {
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
        Object stackIn_58_0 = null;
        Object stackIn_60_0 = null;
        Object stackIn_62_0 = null;
        Object stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        int stackIn_139_0 = 0;
        int stackIn_143_0 = 0;
        oh stackIn_176_0 = null;
        oh stackIn_178_0 = null;
        oh stackIn_180_0 = null;
        oh stackIn_181_0 = null;
        int stackIn_181_1 = 0;
        oh stackIn_182_0 = null;
        int stackIn_182_1 = 0;
        oh stackIn_184_0 = null;
        int stackIn_184_1 = 0;
        oh stackIn_185_0 = null;
        int stackIn_185_1 = 0;
        int stackIn_185_2 = 0;
        oh stackIn_186_0 = null;
        int stackIn_186_1 = 0;
        int stackIn_186_2 = 0;
        oh stackIn_188_0 = null;
        int stackIn_188_1 = 0;
        int stackIn_188_2 = 0;
        oh stackIn_189_0 = null;
        int stackIn_189_1 = 0;
        int stackIn_189_2 = 0;
        int stackIn_189_3 = 0;
        oh stackIn_190_0 = null;
        oh stackIn_192_0 = null;
        oh stackIn_193_0 = null;
        int stackIn_193_1 = 0;
        oh stackIn_194_0 = null;
        int stackIn_194_1 = 0;
        oh stackIn_196_0 = null;
        int stackIn_196_1 = 0;
        oh stackIn_197_0 = null;
        int stackIn_197_1 = 0;
        int stackIn_197_2 = 0;
        oh stackIn_198_0 = null;
        int stackIn_198_1 = 0;
        int stackIn_198_2 = 0;
        oh stackIn_200_0 = null;
        int stackIn_200_1 = 0;
        int stackIn_200_2 = 0;
        oh stackIn_201_0 = null;
        int stackIn_201_1 = 0;
        int stackIn_201_2 = 0;
        int stackIn_201_3 = 0;
        oh stackIn_202_0 = null;
        oh stackIn_204_0 = null;
        oh stackIn_205_0 = null;
        int stackIn_205_1 = 0;
        oh stackIn_206_0 = null;
        int stackIn_206_1 = 0;
        int stackIn_206_2 = 0;
        oh stackIn_208_0 = null;
        int stackIn_208_1 = 0;
        int stackIn_208_2 = 0;
        oh stackIn_209_0 = null;
        int stackIn_209_1 = 0;
        int stackIn_209_2 = 0;
        int stackIn_209_3 = 0;
        oh stackIn_210_0 = null;
        int stackIn_210_1 = 0;
        int stackIn_210_2 = 0;
        int stackIn_210_3 = 0;
        oh stackIn_212_0 = null;
        int stackIn_212_1 = 0;
        int stackIn_212_2 = 0;
        int stackIn_212_3 = 0;
        oh stackIn_213_0 = null;
        int stackIn_213_1 = 0;
        int stackIn_213_2 = 0;
        int stackIn_213_3 = 0;
        int stackIn_213_4 = 0;
        Object stackIn_218_0 = null;
        int stackIn_218_1 = 0;
        int stackIn_218_2 = 0;
        oh stackOut_175_0 = null;
        oh stackOut_180_0 = null;
        int stackOut_180_1 = 0;
        oh stackOut_176_0 = null;
        oh stackOut_178_0 = null;
        int stackOut_178_1 = 0;
        oh stackOut_181_0 = null;
        int stackOut_181_1 = 0;
        oh stackOut_184_0 = null;
        int stackOut_184_1 = 0;
        int stackOut_184_2 = 0;
        oh stackOut_182_0 = null;
        int stackOut_182_1 = 0;
        int stackOut_182_2 = 0;
        oh stackOut_185_0 = null;
        int stackOut_185_1 = 0;
        int stackOut_185_2 = 0;
        oh stackOut_188_0 = null;
        int stackOut_188_1 = 0;
        int stackOut_188_2 = 0;
        int stackOut_188_3 = 0;
        oh stackOut_186_0 = null;
        int stackOut_186_1 = 0;
        int stackOut_186_2 = 0;
        int stackOut_186_3 = 0;
        oh stackOut_189_0 = null;
        oh stackOut_192_0 = null;
        int stackOut_192_1 = 0;
        oh stackOut_190_0 = null;
        int stackOut_190_1 = 0;
        oh stackOut_193_0 = null;
        int stackOut_193_1 = 0;
        oh stackOut_196_0 = null;
        int stackOut_196_1 = 0;
        int stackOut_196_2 = 0;
        oh stackOut_194_0 = null;
        int stackOut_194_1 = 0;
        int stackOut_194_2 = 0;
        oh stackOut_197_0 = null;
        int stackOut_197_1 = 0;
        int stackOut_197_2 = 0;
        oh stackOut_200_0 = null;
        int stackOut_200_1 = 0;
        int stackOut_200_2 = 0;
        int stackOut_200_3 = 0;
        oh stackOut_198_0 = null;
        int stackOut_198_1 = 0;
        int stackOut_198_2 = 0;
        int stackOut_198_3 = 0;
        oh stackOut_201_0 = null;
        oh stackOut_204_0 = null;
        int stackOut_204_1 = 0;
        oh stackOut_202_0 = null;
        int stackOut_202_1 = 0;
        oh stackOut_205_0 = null;
        int stackOut_205_1 = 0;
        int stackOut_205_2 = 0;
        oh stackOut_208_0 = null;
        int stackOut_208_1 = 0;
        int stackOut_208_2 = 0;
        int stackOut_208_3 = 0;
        oh stackOut_206_0 = null;
        int stackOut_206_1 = 0;
        int stackOut_206_2 = 0;
        int stackOut_206_3 = 0;
        oh stackOut_209_0 = null;
        int stackOut_209_1 = 0;
        int stackOut_209_2 = 0;
        int stackOut_209_3 = 0;
        oh stackOut_212_0 = null;
        int stackOut_212_1 = 0;
        int stackOut_212_2 = 0;
        int stackOut_212_3 = 0;
        int stackOut_212_4 = 0;
        oh stackOut_210_0 = null;
        int stackOut_210_1 = 0;
        int stackOut_210_2 = 0;
        int stackOut_210_3 = 0;
        int stackOut_210_4 = 0;
        int stackOut_138_0 = 0;
        int stackOut_136_0 = 0;
        int stackOut_142_0 = 0;
        int stackOut_140_0 = 0;
        Object stackOut_216_0 = null;
        int stackOut_216_1 = 0;
        int stackOut_216_2 = 0;
        Object stackOut_57_0 = null;
        Object stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        Object stackOut_58_0 = null;
        Object stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        L0: {
          L1: {
            var14 = TrackController.field_F ? 1 : 0;
            if (((mg) this).field_c == 12) {
              break L1;
            } else {
              if (((mg) this).field_c == 13) {
                break L1;
              } else {
                L2: {
                  if (((mg) this).field_c == 2) {
                    break L2;
                  } else {
                    if (((mg) this).field_c == 3) {
                      break L2;
                    } else {
                      if (((mg) this).field_c != 15) {
                        L3: {
                          if (((mg) this).field_c == 8) {
                            break L3;
                          } else {
                            if (((mg) this).field_c == 9) {
                              break L3;
                            } else {
                              if (16 != ((mg) this).field_c) {
                                if (null != he.field_f[((mg) this).field_c]) {
                                  L4: {
                                    cl.a(ha.field_m, 11, 436, 38, 618, 4);
                                    if (((mg) this).field_c == 10) {
                                      break L4;
                                    } else {
                                      if (((mg) this).field_c != 11) {
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
                cl.a(nd.field_L, -10 + this.e((byte) 62), 20 + mf.field_f[((mg) this).field_c].length * mf.field_d[((mg) this).field_c], -10 + mf.field_h[((mg) this).field_c], 176, 4);
                cl.a(nd.field_L, 349, 410, 52 - -bk.field_E.field_u, 212, 4);
                break L0;
              }
            }
          }
          cl.a(ha.field_m, 6, 436, 38, 436, 4);
          cl.a(nd.field_L, 457, 124, 10, 176, param0 ^ -5);
          cl.a(nd.field_L, 457, mf.field_f[((mg) this).field_c].length * 26 - -20, 219, 176, param0 ^ -5);
          break L0;
        }
        L5: {
          if (null != he.field_f[((mg) this).field_c]) {
            he.field_f[((mg) this).field_c].a(true);
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          L7: {
            if (((mg) this).field_c == 12) {
              break L7;
            } else {
              if (13 != ((mg) this).field_c) {
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
        var3 = mf.field_h[((mg) this).field_c];
        var4 = 0;
        if (param0 == -1) {
          L8: while (true) {
            if (mf.field_f[((mg) this).field_c].length <= var4) {
              L9: {
                L10: {
                  if (((mg) this).field_c == 0) {
                    break L10;
                  } else {
                    if (((mg) this).field_c != 1) {
                      L11: {
                        if (((mg) this).field_c == 13) {
                          break L11;
                        } else {
                          if (((mg) this).field_c != 12) {
                            L12: {
                              if (10 == ((mg) this).field_c) {
                                break L12;
                              } else {
                                if (11 == ((mg) this).field_c) {
                                  break L12;
                                } else {
                                  L13: {
                                    if (((mg) this).field_c == 8) {
                                      break L13;
                                    } else {
                                      if (9 == ((mg) this).field_c) {
                                        break L13;
                                      } else {
                                        if (((mg) this).field_c == 16) {
                                          al.field_z[5].e(640 + -al.field_z[5].field_t >> 1, 1);
                                          this.a(true, param0 + 17461);
                                          break L9;
                                        } else {
                                          if (((mg) this).field_c == 15) {
                                            L14: {
                                              al.field_z[0].e(-al.field_z[0].field_t + 640 >> 1, 1);
                                              bk.field_E.b(qg.field_b, 320, bk.field_E.field_G + 154, 5, -1);
                                              stackOut_175_0 = bk.field_E;
                                              stackIn_180_0 = stackOut_175_0;
                                              stackIn_176_0 = stackOut_175_0;
                                              if (0 == oe.field_e) {
                                                stackOut_180_0 = (oh) (Object) stackIn_180_0;
                                                stackOut_180_1 = 0;
                                                stackIn_181_0 = stackOut_180_0;
                                                stackIn_181_1 = stackOut_180_1;
                                                break L14;
                                              } else {
                                                stackOut_176_0 = (oh) (Object) stackIn_176_0;
                                                stackIn_178_0 = stackOut_176_0;
                                                stackOut_178_0 = (oh) (Object) stackIn_178_0;
                                                stackOut_178_1 = 1;
                                                stackIn_181_0 = stackOut_178_0;
                                                stackIn_181_1 = stackOut_178_1;
                                                break L14;
                                              }
                                            }
                                            L15: {
                                              stackOut_181_0 = (oh) (Object) stackIn_181_0;
                                              stackOut_181_1 = stackIn_181_1;
                                              stackIn_184_0 = stackOut_181_0;
                                              stackIn_184_1 = stackOut_181_1;
                                              stackIn_182_0 = stackOut_181_0;
                                              stackIn_182_1 = stackOut_181_1;
                                              if (0 == ua.field_L.field_O) {
                                                stackOut_184_0 = (oh) (Object) stackIn_184_0;
                                                stackOut_184_1 = stackIn_184_1;
                                                stackOut_184_2 = 0;
                                                stackIn_185_0 = stackOut_184_0;
                                                stackIn_185_1 = stackOut_184_1;
                                                stackIn_185_2 = stackOut_184_2;
                                                break L15;
                                              } else {
                                                stackOut_182_0 = (oh) (Object) stackIn_182_0;
                                                stackOut_182_1 = stackIn_182_1;
                                                stackOut_182_2 = 1;
                                                stackIn_185_0 = stackOut_182_0;
                                                stackIn_185_1 = stackOut_182_1;
                                                stackIn_185_2 = stackOut_182_2;
                                                break L15;
                                              }
                                            }
                                            L16: {
                                              stackOut_185_0 = (oh) (Object) stackIn_185_0;
                                              stackOut_185_1 = stackIn_185_1;
                                              stackOut_185_2 = stackIn_185_2;
                                              stackIn_188_0 = stackOut_185_0;
                                              stackIn_188_1 = stackOut_185_1;
                                              stackIn_188_2 = stackOut_185_2;
                                              stackIn_186_0 = stackOut_185_0;
                                              stackIn_186_1 = stackOut_185_1;
                                              stackIn_186_2 = stackOut_185_2;
                                              if (0 == ua.field_L.field_O) {
                                                stackOut_188_0 = (oh) (Object) stackIn_188_0;
                                                stackOut_188_1 = stackIn_188_1;
                                                stackOut_188_2 = stackIn_188_2;
                                                stackOut_188_3 = 0;
                                                stackIn_189_0 = stackOut_188_0;
                                                stackIn_189_1 = stackOut_188_1;
                                                stackIn_189_2 = stackOut_188_2;
                                                stackIn_189_3 = stackOut_188_3;
                                                break L16;
                                              } else {
                                                stackOut_186_0 = (oh) (Object) stackIn_186_0;
                                                stackOut_186_1 = stackIn_186_1;
                                                stackOut_186_2 = stackIn_186_2;
                                                stackOut_186_3 = 1;
                                                stackIn_189_0 = stackOut_186_0;
                                                stackIn_189_1 = stackOut_186_1;
                                                stackIn_189_2 = stackOut_186_2;
                                                stackIn_189_3 = stackOut_186_3;
                                                break L16;
                                              }
                                            }
                                            L17: {
                                              int discarded$6 = 118;
                                              ((oh) (Object) stackIn_189_0).b(vj.a(stackIn_189_1 != 0, stackIn_189_2 != 0, stackIn_189_3 != 0), 320, 180 + bk.field_E.field_G, 5, -1);
                                              stackOut_189_0 = bk.field_E;
                                              stackIn_192_0 = stackOut_189_0;
                                              stackIn_190_0 = stackOut_189_0;
                                              if (0 == ua.field_L.field_O) {
                                                stackOut_192_0 = (oh) (Object) stackIn_192_0;
                                                stackOut_192_1 = 0;
                                                stackIn_193_0 = stackOut_192_0;
                                                stackIn_193_1 = stackOut_192_1;
                                                break L17;
                                              } else {
                                                stackOut_190_0 = (oh) (Object) stackIn_190_0;
                                                stackOut_190_1 = 1;
                                                stackIn_193_0 = stackOut_190_0;
                                                stackIn_193_1 = stackOut_190_1;
                                                break L17;
                                              }
                                            }
                                            L18: {
                                              stackOut_193_0 = (oh) (Object) stackIn_193_0;
                                              stackOut_193_1 = stackIn_193_1;
                                              stackIn_196_0 = stackOut_193_0;
                                              stackIn_196_1 = stackOut_193_1;
                                              stackIn_194_0 = stackOut_193_0;
                                              stackIn_194_1 = stackOut_193_1;
                                              if (oe.field_e == 0) {
                                                stackOut_196_0 = (oh) (Object) stackIn_196_0;
                                                stackOut_196_1 = stackIn_196_1;
                                                stackOut_196_2 = 0;
                                                stackIn_197_0 = stackOut_196_0;
                                                stackIn_197_1 = stackOut_196_1;
                                                stackIn_197_2 = stackOut_196_2;
                                                break L18;
                                              } else {
                                                stackOut_194_0 = (oh) (Object) stackIn_194_0;
                                                stackOut_194_1 = stackIn_194_1;
                                                stackOut_194_2 = 1;
                                                stackIn_197_0 = stackOut_194_0;
                                                stackIn_197_1 = stackOut_194_1;
                                                stackIn_197_2 = stackOut_194_2;
                                                break L18;
                                              }
                                            }
                                            L19: {
                                              stackOut_197_0 = (oh) (Object) stackIn_197_0;
                                              stackOut_197_1 = stackIn_197_1;
                                              stackOut_197_2 = stackIn_197_2;
                                              stackIn_200_0 = stackOut_197_0;
                                              stackIn_200_1 = stackOut_197_1;
                                              stackIn_200_2 = stackOut_197_2;
                                              stackIn_198_0 = stackOut_197_0;
                                              stackIn_198_1 = stackOut_197_1;
                                              stackIn_198_2 = stackOut_197_2;
                                              if (ua.field_L.field_O == 0) {
                                                stackOut_200_0 = (oh) (Object) stackIn_200_0;
                                                stackOut_200_1 = stackIn_200_1;
                                                stackOut_200_2 = stackIn_200_2;
                                                stackOut_200_3 = 0;
                                                stackIn_201_0 = stackOut_200_0;
                                                stackIn_201_1 = stackOut_200_1;
                                                stackIn_201_2 = stackOut_200_2;
                                                stackIn_201_3 = stackOut_200_3;
                                                break L19;
                                              } else {
                                                stackOut_198_0 = (oh) (Object) stackIn_198_0;
                                                stackOut_198_1 = stackIn_198_1;
                                                stackOut_198_2 = stackIn_198_2;
                                                stackOut_198_3 = 1;
                                                stackIn_201_0 = stackOut_198_0;
                                                stackIn_201_1 = stackOut_198_1;
                                                stackIn_201_2 = stackOut_198_2;
                                                stackIn_201_3 = stackOut_198_3;
                                                break L19;
                                              }
                                            }
                                            L20: {
                                              int discarded$7 = 12105912;
                                              ((oh) (Object) stackIn_201_0).b(fc.a(stackIn_201_1 != 0, stackIn_201_2 != 0, stackIn_201_3 != 0), 320, bk.field_E.field_G + 258, 5, -1);
                                              stackOut_201_0 = bk.field_E;
                                              stackIn_204_0 = stackOut_201_0;
                                              stackIn_202_0 = stackOut_201_0;
                                              if (ua.field_L.field_O == 0) {
                                                stackOut_204_0 = (oh) (Object) stackIn_204_0;
                                                stackOut_204_1 = 0;
                                                stackIn_205_0 = stackOut_204_0;
                                                stackIn_205_1 = stackOut_204_1;
                                                break L20;
                                              } else {
                                                stackOut_202_0 = (oh) (Object) stackIn_202_0;
                                                stackOut_202_1 = 1;
                                                stackIn_205_0 = stackOut_202_0;
                                                stackIn_205_1 = stackOut_202_1;
                                                break L20;
                                              }
                                            }
                                            L21: {
                                              stackOut_205_0 = (oh) (Object) stackIn_205_0;
                                              stackOut_205_1 = stackIn_205_1;
                                              stackOut_205_2 = -98;
                                              stackIn_208_0 = stackOut_205_0;
                                              stackIn_208_1 = stackOut_205_1;
                                              stackIn_208_2 = stackOut_205_2;
                                              stackIn_206_0 = stackOut_205_0;
                                              stackIn_206_1 = stackOut_205_1;
                                              stackIn_206_2 = stackOut_205_2;
                                              if (oe.field_e == 0) {
                                                stackOut_208_0 = (oh) (Object) stackIn_208_0;
                                                stackOut_208_1 = stackIn_208_1;
                                                stackOut_208_2 = stackIn_208_2;
                                                stackOut_208_3 = 0;
                                                stackIn_209_0 = stackOut_208_0;
                                                stackIn_209_1 = stackOut_208_1;
                                                stackIn_209_2 = stackOut_208_2;
                                                stackIn_209_3 = stackOut_208_3;
                                                break L21;
                                              } else {
                                                stackOut_206_0 = (oh) (Object) stackIn_206_0;
                                                stackOut_206_1 = stackIn_206_1;
                                                stackOut_206_2 = stackIn_206_2;
                                                stackOut_206_3 = 1;
                                                stackIn_209_0 = stackOut_206_0;
                                                stackIn_209_1 = stackOut_206_1;
                                                stackIn_209_2 = stackOut_206_2;
                                                stackIn_209_3 = stackOut_206_3;
                                                break L21;
                                              }
                                            }
                                            L22: {
                                              stackOut_209_0 = (oh) (Object) stackIn_209_0;
                                              stackOut_209_1 = stackIn_209_1;
                                              stackOut_209_2 = stackIn_209_2;
                                              stackOut_209_3 = stackIn_209_3;
                                              stackIn_212_0 = stackOut_209_0;
                                              stackIn_212_1 = stackOut_209_1;
                                              stackIn_212_2 = stackOut_209_2;
                                              stackIn_212_3 = stackOut_209_3;
                                              stackIn_210_0 = stackOut_209_0;
                                              stackIn_210_1 = stackOut_209_1;
                                              stackIn_210_2 = stackOut_209_2;
                                              stackIn_210_3 = stackOut_209_3;
                                              if (ua.field_L.field_O == 0) {
                                                stackOut_212_0 = (oh) (Object) stackIn_212_0;
                                                stackOut_212_1 = stackIn_212_1;
                                                stackOut_212_2 = stackIn_212_2;
                                                stackOut_212_3 = stackIn_212_3;
                                                stackOut_212_4 = 0;
                                                stackIn_213_0 = stackOut_212_0;
                                                stackIn_213_1 = stackOut_212_1;
                                                stackIn_213_2 = stackOut_212_2;
                                                stackIn_213_3 = stackOut_212_3;
                                                stackIn_213_4 = stackOut_212_4;
                                                break L22;
                                              } else {
                                                stackOut_210_0 = (oh) (Object) stackIn_210_0;
                                                stackOut_210_1 = stackIn_210_1;
                                                stackOut_210_2 = stackIn_210_2;
                                                stackOut_210_3 = stackIn_210_3;
                                                stackOut_210_4 = 1;
                                                stackIn_213_0 = stackOut_210_0;
                                                stackIn_213_1 = stackOut_210_1;
                                                stackIn_213_2 = stackOut_210_2;
                                                stackIn_213_3 = stackOut_210_3;
                                                stackIn_213_4 = stackOut_210_4;
                                                break L22;
                                              }
                                            }
                                            ((oh) (Object) stackIn_213_0).b(qc.a(stackIn_213_1 != 0, (byte) stackIn_213_2, stackIn_213_3 != 0, stackIn_213_4 != 0), 320, bk.field_E.field_G + 310, 5, -1);
                                            break L9;
                                          } else {
                                            L23: {
                                              if (((mg) this).field_c == 4) {
                                                break L23;
                                              } else {
                                                if (5 == ((mg) this).field_c) {
                                                  break L23;
                                                } else {
                                                  if (((mg) this).field_c == 6) {
                                                    break L23;
                                                  } else {
                                                    if (((mg) this).field_c != 7) {
                                                      L24: {
                                                        if (((mg) this).field_c == 2) {
                                                          break L24;
                                                        } else {
                                                          if (((mg) this).field_c != 3) {
                                                            if (((mg) this).field_c == 14) {
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
                                                        al.field_z[3].e(-al.field_z[3].field_t + 640 >> 1, 1);
                                                        if (~qh.field_b.field_x < ~(1 + pc.field_i)) {
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
                                                          int discarded$8 = bk.field_E.a(var4_ref_String, 100, 67, 156, 234, 0, -1, 1, 1, 26);
                                                          break L25;
                                                        } else {
                                                          qh.field_b.a(100, (byte) -127, 67);
                                                          fd.field_d.e(-367, -162);
                                                          break L25;
                                                        }
                                                      }
                                                      L27: {
                                                        cl.a(nd.field_L, 566, 46, 57, 46, param0 + 5);
                                                        if (tc.field_b != 0) {
                                                          stackOut_138_0 = 15252224;
                                                          stackIn_139_0 = stackOut_138_0;
                                                          break L27;
                                                        } else {
                                                          stackOut_136_0 = 8110658;
                                                          stackIn_139_0 = stackOut_136_0;
                                                          break L27;
                                                        }
                                                      }
                                                      L28: {
                                                        var4 = stackIn_139_0;
                                                        ii.field_r[52].c(576, 67, var4);
                                                        cl.a(nd.field_L, 566, 46, 421, 46, 4);
                                                        if (tc.field_b != 1) {
                                                          stackOut_142_0 = 15252224;
                                                          stackIn_143_0 = stackOut_142_0;
                                                          break L28;
                                                        } else {
                                                          stackOut_140_0 = 8110658;
                                                          stackIn_143_0 = stackOut_140_0;
                                                          break L28;
                                                        }
                                                      }
                                                      var4 = stackIn_143_0;
                                                      ii.field_r[53].c(576, 431, var4);
                                                      var5 = (Object) (Object) this.a(kf.field_b, 2600, fg.field_a);
                                                      var6 = 269 - (-(26 * (1 - qh.field_b.field_x)) - mb.field_b);
                                                      var7 = 359;
                                                      var8 = 62 + bk.field_E.field_u;
                                                      ll.e(var7, var8, var7 + 192, var8 + 390);
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
                                                            if (~var11.field_x >= ~(pc.field_i + 1)) {
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
                                                            if (((mg) this).field_e.field_a) {
                                                              break L32;
                                                            } else {
                                                              if (((mg) this).field_e.field_e != -1) {
                                                                break L32;
                                                              } else {
                                                                if (tc.field_b != 2) {
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
                                                            if (!((mg) this).field_e.field_a) {
                                                              break L33;
                                                            } else {
                                                              if (var5 != (Object) (Object) var11) {
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
                                            int discarded$9 = -114;
                                            this.c();
                                            break L9;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  al.field_z[1].e(-al.field_z[1].field_t + 640 >> 1, 1);
                                  stackOut_216_0 = this;
                                  stackOut_216_1 = 0;
                                  stackOut_216_2 = 17460;
                                  stackIn_218_0 = stackOut_216_0;
                                  stackIn_218_1 = stackOut_216_1;
                                  stackIn_218_2 = stackOut_216_2;
                                  this.a(stackIn_218_1 != 0, stackIn_218_2);
                                  break L9;
                                }
                              }
                            }
                            al.field_z[4].e(-al.field_z[4].field_t + 640 >> 1, 1);
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
                al.field_z[0].e(640 - al.field_z[0].field_t >> 1, 1);
                break L9;
              }
              L34: {
                int discarded$10 = 1;
                var4 = g.g();
                var5 = null;
                if (23 != var4) {
                  break L34;
                } else {
                  var5 = (Object) (Object) vi.field_a;
                  break L34;
                }
              }
              L35: {
                if (var4 == 24) {
                  var5 = (Object) (Object) id.field_i;
                  break L35;
                } else {
                  break L35;
                }
              }
              L36: {
                if (var4 == 25) {
                  var5 = (Object) (Object) ud.field_b;
                  break L36;
                } else {
                  break L36;
                }
              }
              L37: {
                if (null != var5) {
                  vl.a(-21173, (String) var5);
                  break L37;
                } else {
                  break L37;
                }
              }
              return;
            } else {
              L38: {
                stackOut_57_0 = this;
                stackIn_62_0 = stackOut_57_0;
                stackIn_58_0 = stackOut_57_0;
                if (~var4 != ~((mg) this).field_e.field_e) {
                  stackOut_62_0 = this;
                  stackOut_62_1 = 0;
                  stackIn_63_0 = stackOut_62_0;
                  stackIn_63_1 = stackOut_62_1;
                  break L38;
                } else {
                  stackOut_58_0 = this;
                  stackIn_60_0 = stackOut_58_0;
                  stackOut_60_0 = this;
                  stackOut_60_1 = 1;
                  stackIn_63_0 = stackOut_60_0;
                  stackIn_63_1 = stackOut_60_1;
                  break L38;
                }
              }
              L39: {
                int discarded$11 = 1;
                this.a(stackIn_63_1 != 0, var2, var3, var4);
                if (!mf.field_i[((mg) this).field_c]) {
                  var3 = var3 + mf.field_d[((mg) this).field_c];
                  break L39;
                } else {
                  var2 = var2 + mf.field_d[((mg) this).field_c];
                  break L39;
                }
              }
              L40: {
                if (((mg) this).field_c != 11) {
                  break L40;
                } else {
                  if (2 == var4) {
                    var2 = var2 - (mf.field_d[((mg) this).field_c] << 1);
                    var3 = var3 + mf.field_b[((mg) this).field_c];
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

    private final void a(boolean param0, boolean param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_141_0 = 0;
        int stackIn_288_0 = 0;
        int stackIn_290_0 = 0;
        int stackIn_291_0 = 0;
        int stackIn_291_1 = 0;
        int stackIn_317_0 = 0;
        int stackIn_319_0 = 0;
        int stackIn_321_0 = 0;
        int stackIn_322_0 = 0;
        int stackIn_322_1 = 0;
        int stackOut_140_0 = 0;
        int stackOut_138_0 = 0;
        int stackOut_287_0 = 0;
        int stackOut_290_0 = 0;
        int stackOut_290_1 = 0;
        int stackOut_288_0 = 0;
        int stackOut_288_1 = 0;
        int stackOut_316_0 = 0;
        int stackOut_321_0 = 0;
        int stackOut_321_1 = 0;
        int stackOut_317_0 = 0;
        int stackOut_319_0 = 0;
        int stackOut_319_1 = 0;
        L0: {
          var8 = TrackController.field_F ? 1 : 0;
          var5 = this.b(121, param2);
          if (this.a((byte) 67, var5)) {
            break L0;
          } else {
            if (var5 == 13) {
              break L0;
            } else {
              return;
            }
          }
        }
        L1: {
          var6 = var5;
          if (var6 == 0) {
            if (!((mg) this).field_e.b(false)) {
              break L1;
            } else {
              L2: {
                si.a((byte) -68, 5);
                if (2 > sl.field_j) {
                  break L2;
                } else {
                  if (!ni.field_m[48]) {
                    break L2;
                  } else {
                    pc.field_i = 31;
                    break L2;
                  }
                }
              }
              if (((mg) this).field_c != 0) {
                if (((mg) this).field_c != 1) {
                  throw new RuntimeException();
                } else {
                  sc.field_g = 3;
                  break L1;
                }
              } else {
                sc.field_g = 2;
                break L1;
              }
            }
          } else {
            L3: {
              if (var6 == 1) {
                if (!((mg) this).field_e.b(false)) {
                  break L3;
                } else {
                  si.a((byte) -68, 5);
                  rk.field_bb = null;
                  g.field_w = null;
                  ua.field_L = new ri();
                  oe.field_e = 0;
                  sc.field_g = -1;
                  break L1;
                }
              } else {
                if (13 != var6) {
                  if (var6 == 4) {
                    if (!((mg) this).field_e.b(false)) {
                      break L3;
                    } else {
                      si.a((byte) -68, 5);
                      sc.field_g = -1;
                      break L1;
                    }
                  } else {
                    if (21 != var6) {
                      if (22 != var6) {
                        if (var6 == 26) {
                          if (((mg) this).field_e.b(false)) {
                            L4: {
                              si.a((byte) -68, 5);
                              if (fi.field_i) {
                                stackOut_140_0 = 0;
                                stackIn_141_0 = stackOut_140_0;
                                break L4;
                              } else {
                                stackOut_138_0 = 1;
                                stackIn_141_0 = stackOut_138_0;
                                break L4;
                              }
                            }
                            fi.field_i = stackIn_141_0 != 0;
                            break L1;
                          } else {
                            break L1;
                          }
                        } else {
                          if (var6 == 14) {
                            if (!((mg) this).field_e.b(false)) {
                              break L3;
                            } else {
                              si.a((byte) -68, 5);
                              sc.field_g = 12;
                              break L1;
                            }
                          } else {
                            if (var6 == 15) {
                              if (!((mg) this).field_e.b(false)) {
                                break L3;
                              } else {
                                si.a((byte) -68, 5);
                                sc.field_g = 13;
                                break L1;
                              }
                            } else {
                              if (var6 == 23) {
                                if (((mg) this).field_e.b(false)) {
                                  si.a((byte) -68, 5);
                                  di.field_i = 0;
                                  break L1;
                                } else {
                                  break L1;
                                }
                              } else {
                                if (var6 != 24) {
                                  if (var6 != 25) {
                                    if (6 != var6) {
                                      if (var6 != 7) {
                                        if (var6 != 8) {
                                          if (9 == var6) {
                                            if (((mg) this).field_e.b(false)) {
                                              si.a((byte) -68, 5);
                                              rd.field_b = 0;
                                              sc.field_g = 7;
                                              break L1;
                                            } else {
                                              break L1;
                                            }
                                          } else {
                                            if (10 != var6) {
                                              if (var6 != 11) {
                                                if (var6 != 20) {
                                                  if (var6 != 28) {
                                                    if (12 != var6) {
                                                      if (var6 != 17) {
                                                        if (var6 != 18) {
                                                          if (19 == var6) {
                                                            if (!((mg) this).field_e.b(false)) {
                                                              break L3;
                                                            } else {
                                                              si.a((byte) -68, 5);
                                                              if (((mg) this).field_c != 8) {
                                                                if (10 == ((mg) this).field_c) {
                                                                  ad.a(((mg) this).field_c, 11, (byte) -109);
                                                                  break L1;
                                                                } else {
                                                                  if (((mg) this).field_c == 15) {
                                                                    ad.a(((mg) this).field_c, -3, (byte) -47);
                                                                    break L1;
                                                                  } else {
                                                                    if (2 != ((mg) this).field_c) {
                                                                      throw new RuntimeException();
                                                                    } else {
                                                                      ad.a(((mg) this).field_c, 3, (byte) -78);
                                                                      break L1;
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                ad.a(((mg) this).field_c, 9, (byte) -120);
                                                                break L1;
                                                              }
                                                            }
                                                          } else {
                                                            if (var6 != 16) {
                                                              if (var6 == 5) {
                                                                if (((mg) this).field_e.b(false)) {
                                                                  si.a((byte) -68, 5);
                                                                  ua.field_L.c(3, 117);
                                                                  break L1;
                                                                } else {
                                                                  break L1;
                                                                }
                                                              } else {
                                                                if (var6 == 27) {
                                                                  if (!((mg) this).field_e.b(false)) {
                                                                    break L3;
                                                                  } else {
                                                                    si.a((byte) -68, 5);
                                                                    if (!jj.s(49)) {
                                                                      if (oe.field_e != 0) {
                                                                        sc.field_g = 16;
                                                                        break L1;
                                                                      } else {
                                                                        if (ua.field_L.field_O == 0) {
                                                                          sc.field_g = 1;
                                                                          break L1;
                                                                        } else {
                                                                          sc.field_g = 11;
                                                                          break L1;
                                                                        }
                                                                      }
                                                                    } else {
                                                                      if ((ua.field_L.field_O | oe.field_e) == 0) {
                                                                        sc.field_g = 0;
                                                                        break L1;
                                                                      } else {
                                                                        sc.field_g = 15;
                                                                        break L1;
                                                                      }
                                                                    }
                                                                  }
                                                                } else {
                                                                  if (var6 == 2) {
                                                                    L5: {
                                                                      if (((mg) this).field_e.a(true)) {
                                                                        da.a(0, (byte) -74);
                                                                        break L5;
                                                                      } else {
                                                                        break L5;
                                                                      }
                                                                    }
                                                                    L6: {
                                                                      if (((mg) this).field_e.b(-32)) {
                                                                        da.a(256, (byte) -74);
                                                                        break L6;
                                                                      } else {
                                                                        break L6;
                                                                      }
                                                                    }
                                                                    L7: {
                                                                      if (((mg) this).field_e.e(0)) {
                                                                        L8: {
                                                                          stackOut_287_0 = this.e((byte) 57);
                                                                          stackIn_290_0 = stackOut_287_0;
                                                                          stackIn_288_0 = stackOut_287_0;
                                                                          if (mf.field_i[((mg) this).field_c]) {
                                                                            stackOut_290_0 = stackIn_290_0;
                                                                            stackOut_290_1 = mf.field_d[((mg) this).field_c] * param2;
                                                                            stackIn_291_0 = stackOut_290_0;
                                                                            stackIn_291_1 = stackOut_290_1;
                                                                            break L8;
                                                                          } else {
                                                                            stackOut_288_0 = stackIn_288_0;
                                                                            stackOut_288_1 = 0;
                                                                            stackIn_291_0 = stackOut_288_0;
                                                                            stackIn_291_1 = stackOut_288_1;
                                                                            break L8;
                                                                          }
                                                                        }
                                                                        var6 = stackIn_291_0 + stackIn_291_1;
                                                                        var7 = -var6 + kf.field_b + -78 << 2;
                                                                        if (0 <= var7) {
                                                                          if (var7 >= 256) {
                                                                            da.a(256, (byte) -74);
                                                                            break L7;
                                                                          } else {
                                                                            da.a(var7, (byte) -74);
                                                                            break L7;
                                                                          }
                                                                        } else {
                                                                          da.a(0, (byte) -74);
                                                                          break L7;
                                                                        }
                                                                      } else {
                                                                        break L7;
                                                                      }
                                                                    }
                                                                    L9: {
                                                                      if (!((mg) this).field_e.a(0)) {
                                                                        break L9;
                                                                      } else {
                                                                        int discarded$7 = 256;
                                                                        ol.e();
                                                                        break L9;
                                                                      }
                                                                    }
                                                                    if (((mg) this).field_e.c((byte) 11)) {
                                                                      int discarded$8 = -96;
                                                                      g.f();
                                                                      break L1;
                                                                    } else {
                                                                      break L1;
                                                                    }
                                                                  } else {
                                                                    if (var6 == 3) {
                                                                      L10: {
                                                                        if (((mg) this).field_e.a(true)) {
                                                                          qd.a(false, 0);
                                                                          break L10;
                                                                        } else {
                                                                          break L10;
                                                                        }
                                                                      }
                                                                      L11: {
                                                                        if (!((mg) this).field_e.b(97)) {
                                                                          break L11;
                                                                        } else {
                                                                          qd.a(false, 256);
                                                                          break L11;
                                                                        }
                                                                      }
                                                                      L12: {
                                                                        if (!((mg) this).field_e.e(0)) {
                                                                          break L12;
                                                                        } else {
                                                                          L13: {
                                                                            stackOut_316_0 = this.e((byte) 99);
                                                                            stackIn_321_0 = stackOut_316_0;
                                                                            stackIn_317_0 = stackOut_316_0;
                                                                            if (!mf.field_i[((mg) this).field_c]) {
                                                                              stackOut_321_0 = stackIn_321_0;
                                                                              stackOut_321_1 = 0;
                                                                              stackIn_322_0 = stackOut_321_0;
                                                                              stackIn_322_1 = stackOut_321_1;
                                                                              break L13;
                                                                            } else {
                                                                              stackOut_317_0 = stackIn_317_0;
                                                                              stackIn_319_0 = stackOut_317_0;
                                                                              stackOut_319_0 = stackIn_319_0;
                                                                              stackOut_319_1 = param2 * mf.field_d[((mg) this).field_c];
                                                                              stackIn_322_0 = stackOut_319_0;
                                                                              stackIn_322_1 = stackOut_319_1;
                                                                              break L13;
                                                                            }
                                                                          }
                                                                          var6 = stackIn_322_0 - -stackIn_322_1;
                                                                          var7 = -var6 + (kf.field_b - 78) << 2;
                                                                          if (var7 < 0) {
                                                                            qd.a(false, 0);
                                                                            break L12;
                                                                          } else {
                                                                            if (var7 < 256) {
                                                                              qd.a(false, var7);
                                                                              break L12;
                                                                            } else {
                                                                              qd.a(false, 256);
                                                                              break L12;
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                      L14: {
                                                                        if (!((mg) this).field_e.a(0)) {
                                                                          break L14;
                                                                        } else {
                                                                          int discarded$9 = -109;
                                                                          ij.a();
                                                                          break L14;
                                                                        }
                                                                      }
                                                                      if (((mg) this).field_e.c((byte) 11)) {
                                                                        qg.a(13);
                                                                        break L3;
                                                                      } else {
                                                                        break L1;
                                                                      }
                                                                    } else {
                                                                      break L1;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              if (((mg) this).field_e.b(false)) {
                                                                si.a((byte) -68, 5);
                                                                int discarded$10 = -9;
                                                                af.a(gd.b((byte) 77));
                                                                break L1;
                                                              } else {
                                                                break L1;
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          if (!((mg) this).field_e.b(false)) {
                                                            break L3;
                                                          } else {
                                                            si.a((byte) -68, 5);
                                                            sc.field_g = 9;
                                                            break L1;
                                                          }
                                                        }
                                                      } else {
                                                        if (!((mg) this).field_e.b(false)) {
                                                          break L3;
                                                        } else {
                                                          si.a((byte) -68, 5);
                                                          sc.field_g = 8;
                                                          break L1;
                                                        }
                                                      }
                                                    } else {
                                                      if (!((mg) this).field_e.b(false)) {
                                                        break L3;
                                                      } else {
                                                        si.a((byte) -68, 5);
                                                        rd.field_b = (rd.field_b - -1) % 2;
                                                        break L1;
                                                      }
                                                    }
                                                  } else {
                                                    if (((mg) this).field_e.b(false)) {
                                                      L15: {
                                                        si.a((byte) -68, 5);
                                                        if (og.field_rb == null) {
                                                          break L15;
                                                        } else {
                                                          oj.a(-117);
                                                          break L15;
                                                        }
                                                      }
                                                      of.a(-80, gd.b((byte) 77));
                                                      break L1;
                                                    } else {
                                                      break L1;
                                                    }
                                                  }
                                                } else {
                                                  if (!((mg) this).field_e.b(false)) {
                                                    break L3;
                                                  } else {
                                                    si.a((byte) -68, 5);
                                                    ka.field_d.e(1);
                                                    th.field_l = 0;
                                                    pc.field_i = 0;
                                                    oe.field_e = 0;
                                                    cd.field_h.e(1);
                                                    sc.field_g = 0;
                                                    break L1;
                                                  }
                                                }
                                              } else {
                                                if (((mg) this).field_e.b(false)) {
                                                  si.a((byte) -68, 5);
                                                  sc.field_g = 1;
                                                  break L1;
                                                } else {
                                                  break L1;
                                                }
                                              }
                                            } else {
                                              if (!((mg) this).field_e.b(false)) {
                                                break L3;
                                              } else {
                                                si.a((byte) -68, 5);
                                                sc.field_g = 0;
                                                break L1;
                                              }
                                            }
                                          }
                                        } else {
                                          if (!((mg) this).field_e.b(false)) {
                                            break L3;
                                          } else {
                                            si.a((byte) -68, 5);
                                            rd.field_b = 0;
                                            sc.field_g = 6;
                                            break L1;
                                          }
                                        }
                                      } else {
                                        if (!((mg) this).field_e.b(false)) {
                                          break L3;
                                        } else {
                                          si.a((byte) -68, 5);
                                          rd.field_b = 0;
                                          sc.field_g = 5;
                                          break L1;
                                        }
                                      }
                                    } else {
                                      if (!((mg) this).field_e.b(false)) {
                                        break L3;
                                      } else {
                                        si.a((byte) -68, 5);
                                        sc.field_g = 4;
                                        rd.field_b = 0;
                                        break L1;
                                      }
                                    }
                                  } else {
                                    if (!((mg) this).field_e.b(false)) {
                                      break L3;
                                    } else {
                                      si.a((byte) -68, 5);
                                      di.field_i = 2;
                                      break L1;
                                    }
                                  }
                                } else {
                                  if (((mg) this).field_e.b(false)) {
                                    si.a((byte) -68, 5);
                                    di.field_i = 1;
                                    break L1;
                                  } else {
                                    break L1;
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        if (((mg) this).field_e.b(false)) {
                          si.a((byte) -68, 5);
                          sc.field_g = 11;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    } else {
                      if (!((mg) this).field_e.b(false)) {
                        break L3;
                      } else {
                        si.a((byte) -68, 5);
                        sc.field_g = 10;
                        break L1;
                      }
                    }
                  }
                } else {
                  if (((mg) this).field_e.b(false)) {
                    si.a((byte) -68, 5);
                    if (og.field_rb == null) {
                      var6 = param1 ? 1 : 0;
                      int discarded$11 = 0;
                      int discarded$12 = 0;
                      int discarded$13 = 18;
                      oi.a(26, gb.field_l, 26, bk.field_E, bk.field_E, 10, 320, 20, 240, gb.field_l, -3748, var6 != 0);
                      break L1;
                    } else {
                      oj.a(-127);
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
              }
            }
            break L1;
          }
        }
    }

    mg(TrackController param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        ((mg) this).field_h = -1;
        ((mg) this).field_d = -1;
        ((mg) this).field_g = -1;
        try {
          L0: {
            ((mg) this).field_e = new cd(mf.field_f[param1].length);
            ((mg) this).field_c = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("mg.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
        field_a = false;
    }
}
