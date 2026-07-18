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
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ea var7 = null;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              ii.field_o = ii.field_o + 1;
              if (he.field_f[((mg) this).field_c] != null) {
                he.field_f[((mg) this).field_c].a(true, 90);
                break L1;
              } else {
                break L1;
              }
            }
            var2_int = this.b((byte) 125);
            var3 = mb.field_b + -var2_int;
            if (param0 == -99) {
              L2: {
                L3: {
                  if (var3 > 0) {
                    break L3;
                  } else {
                    if (var3 >= 0) {
                      break L2;
                    } else {
                      var3 = -(var3 + (-var3 << -1050873693) >> -1639533501);
                      if (var8 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var3 = (var3 << -1093296957) - var3 >> -1082305245;
                break L2;
              }
              mb.field_b = var3 + var2_int;
              L4: while (true) {
                L5: {
                  L6: {
                    if (!mh.e(127)) {
                      break L6;
                    } else {
                      this.d((byte) -55);
                      if (var8 != 0) {
                        break L5;
                      } else {
                        if (var8 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  ((mg) this).field_e.a(-118, this.a((byte) 6, kf.field_b, fg.field_a), this.a((byte) 6, db.field_X, wg.field_e));
                  break L5;
                }
                L7: {
                  if (((mg) this).field_e.field_e != -1) {
                    this.a(((mg) this).field_e.field_e, false, true);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  L9: {
                    if (((mg) this).field_c == 2) {
                      break L9;
                    } else {
                      if (((mg) this).field_c != 3) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L10: {
                    var4 = -1;
                    var5 = -1;
                    if (kf.field_b < 576) {
                      break L10;
                    } else {
                      if (kf.field_b < 602) {
                        L11: {
                          if (67 > fg.field_a) {
                            break L11;
                          } else {
                            if (fg.field_a >= 93) {
                              break L11;
                            } else {
                              var4 = 0;
                              break L11;
                            }
                          }
                        }
                        if (fg.field_a < 431) {
                          break L10;
                        } else {
                          if (457 <= fg.field_a) {
                            break L10;
                          } else {
                            var4 = 1;
                            break L10;
                          }
                        }
                      } else {
                        break L10;
                      }
                    }
                  }
                  L12: {
                    if (null != this.a(kf.field_b, 2600, fg.field_a)) {
                      var4 = 2;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (db.field_X < 576) {
                      break L13;
                    } else {
                      if (db.field_X >= 602) {
                        break L13;
                      } else {
                        L14: {
                          if (67 > wg.field_e) {
                            break L14;
                          } else {
                            if (wg.field_e >= 93) {
                              break L14;
                            } else {
                              var5 = 0;
                              break L14;
                            }
                          }
                        }
                        if (wg.field_e < 431) {
                          break L13;
                        } else {
                          if (457 > wg.field_e) {
                            var5 = 1;
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                  }
                  L15: {
                    if (this.a(db.field_X, 2600, wg.field_e) == null) {
                      break L15;
                    } else {
                      var5 = 2;
                      break L15;
                    }
                  }
                  L16: {
                    if (uk.field_a == 0) {
                      break L16;
                    } else {
                      tc.field_b = var5;
                      break L16;
                    }
                  }
                  L17: {
                    if (((mg) this).field_e.e(0)) {
                      break L17;
                    } else {
                      L18: {
                        if (((mg) this).field_e.field_a) {
                          break L18;
                        } else {
                          if (!field_a) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                      L19: {
                        if (0 <= var4) {
                          break L19;
                        } else {
                          if (!((mg) this).field_e.field_a) {
                            break L17;
                          } else {
                            tc.field_b = -1;
                            if (var8 == 0) {
                              break L17;
                            } else {
                              break L19;
                            }
                          }
                        }
                      }
                      tc.field_b = var4;
                      ((mg) this).field_e.field_a = true;
                      break L17;
                    }
                  }
                  L20: {
                    if (!((mg) this).field_e.d(0)) {
                      break L20;
                    } else {
                      L21: {
                        var6 = qh.field_b.field_x;
                        var7 = this.a(db.field_X, 2600, wg.field_e);
                        if (var7 != null) {
                          ((mg) this).field_e.field_a = true;
                          qh.field_b = var7;
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      var6 = var6 - qh.field_b.field_x;
                      mb.field_b = mb.field_b - var6 * 26;
                      break L20;
                    }
                  }
                  if (((mg) this).field_e.b(false)) {
                    L22: {
                      L23: {
                        var6 = qh.field_b.field_x;
                        if (tc.field_b != 0) {
                          break L23;
                        } else {
                          if (qh.field_b.field_x <= 1) {
                            break L23;
                          } else {
                            qh.field_b = gj.field_f[-2 + qh.field_b.field_x];
                            if (var8 == 0) {
                              break L22;
                            } else {
                              break L23;
                            }
                          }
                        }
                      }
                      if (tc.field_b != 1) {
                        break L22;
                      } else {
                        if (~gj.field_f.length < ~qh.field_b.field_x) {
                          qh.field_b = gj.field_f[qh.field_b.field_x];
                          break L22;
                        } else {
                          break L22;
                        }
                      }
                    }
                    var6 = var6 - qh.field_b.field_x;
                    mb.field_b = mb.field_b - var6 * 26;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L24: {
                  if (uk.field_a == 0) {
                    break L24;
                  } else {
                    ((mg) this).field_g = wg.field_e;
                    ((mg) this).field_h = db.field_X;
                    break L24;
                  }
                }
                L25: {
                  var4 = -1;
                  var5 = this.a((byte) 6, kf.field_b, fg.field_a);
                  if (var5 != -1) {
                    var4 = this.b(79, var5);
                    break L25;
                  } else {
                    break L25;
                  }
                }
                qc.a(var4, (byte) 20);
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var2, "mg.P(" + param0 + ')');
        }
    }

    private final int b(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 125) {
                break L1;
              } else {
                field_f = 111;
                break L1;
              }
            }
            L2: {
              var2_int = 0;
              if (8 <= qh.field_b.field_x) {
                break L2;
              } else {
                var2_int = -208 + qh.field_b.field_x * 26;
                break L2;
              }
            }
            L3: {
              if (qh.field_b.field_x > 24) {
                var2_int = (-24 + qh.field_b.field_x) * 26;
                break L3;
              } else {
                break L3;
              }
            }
            stackOut_9_0 = var2_int;
            stackIn_10_0 = stackOut_9_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var2, "mg.C(" + param0 + ')');
        }
        return stackIn_10_0;
    }

    final static int a(byte param0) {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -29) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            stackOut_3_0 = mb.field_f;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var1, "mg.G(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final static int b(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_15_0 = 0;
        var8 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = param1;
            var4 = me.field_q;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var3_int <= ~sa.field_I.length) {
                    break L3;
                  } else {
                    var5 = mj.field_b[var3_int];
                    stackOut_3_0 = var5;
                    stackIn_16_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var8 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (stackIn_4_0 < 0) {
                            break L5;
                          } else {
                            var6 = ib.a(true, param1 ^ 10, sa.field_I[var3_int]);
                            var7 = -(var6 >> -1166239359) + sf.field_F;
                            var4 = var4 + na.field_e;
                            if (eb.a(-mb.field_c + var7, param0, param1 ^ 10, (mb.field_c << -480204159) + var6, var4, param2, pc.field_m + (of.field_f << 1229507137))) {
                              stackOut_10_0 = var5;
                              stackIn_11_0 = stackOut_10_0;
                              return stackIn_11_0;
                            } else {
                              var4 = var4 + (pc.field_m + ((of.field_f << 1629406145) - -na.field_e));
                              if (var8 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        var4 = var4 + dh.field_l;
                        break L4;
                      }
                      var3_int++;
                      if (var8 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_15_0 = -1;
                stackIn_16_0 = stackOut_15_0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var3, "mg.M(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_16_0;
    }

    private final ea a(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        ea stackIn_17_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_22_0 = null;
        RuntimeException decompiledCaughtException = null;
        ea stackOut_16_0 = null;
        Object stackOut_21_0 = null;
        Object stackOut_19_0 = null;
        try {
          L0: {
            L1: {
              param0 -= 359;
              param2 = param2 - (bk.field_E.field_u + 62);
              if (param0 < 0) {
                break L1;
              } else {
                if (param0 >= 182) {
                  break L1;
                } else {
                  if (param2 < 0) {
                    break L1;
                  } else {
                    if (param2 >= 390) {
                      break L1;
                    } else {
                      var4_int = qh.field_b.field_x - (-((param2 - (mb.field_b - 2600)) / 26) + 100 + 8);
                      if (var4_int < 0) {
                        break L1;
                      } else {
                        if (gj.field_f.length > var4_int) {
                          stackOut_16_0 = gj.field_f[var4_int];
                          stackIn_17_0 = stackOut_16_0;
                          return stackIn_17_0;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
            }
            if (param1 == 2600) {
              stackOut_21_0 = null;
              stackIn_22_0 = stackOut_21_0;
              break L0;
            } else {
              stackOut_19_0 = null;
              stackIn_20_0 = stackOut_19_0;
              return (ea) (Object) stackIn_20_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var4, "mg.N(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return (ea) (Object) stackIn_22_0;
    }

    private final void a(int param0, boolean param1, boolean param2) {
        try {
            this.a(param1, param2, param0, 390);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "mg.I(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void c(byte param0) {
        RuntimeException var2 = null;
        oh var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        qj var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -114) {
                break L1;
              } else {
                ((mg) this).field_d = 37;
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  var2_ref = bk.field_E;
                  al.field_z[2].e(-al.field_z[2].field_t + 640 >> -268308351, 1);
                  var3 = 74;
                  if (rd.field_b == 0) {
                    break L4;
                  } else {
                    if (1 == rd.field_b) {
                      var4 = 0;
                      L5: while (true) {
                        L6: {
                          if (~ja.field_a.length >= ~var4) {
                            break L6;
                          } else {
                            var5 = ja.field_a[var4];
                            if (var9 != 0) {
                              break L2;
                            } else {
                              L7: {
                                if (3 == var5) {
                                  var6_int = ii.field_o / 5 % ri.field_H.length;
                                  var5 = ri.field_H[var6_int];
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                              ll.f(46, -1 + var3, 28, 28, 16763904);
                              var6 = ii.field_r[var5];
                              var6.h(47, var3);
                              var7 = 86;
                              var8 = var2_ref.a(me.field_p[var4], var7, -6 + (var3 + 26) + -var2_ref.field_G, 606 - var7, 1000, 0, -1, 0, 0, 26);
                              var3 = var3 + (var8 * 26 + 26);
                              var4++;
                              if (var9 == 0) {
                                continue L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        if (var9 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                var3 += 20;
                var3 = var3 + var2_ref.a(tf.field_b, 34, -var2_ref.field_q + var3, 572, 1000, 0, -1, 3, 0, 26) * 26;
                var3 += 26;
                int discarded$1 = var2_ref.a(gh.field_e, 34, -var2_ref.field_q + var3, 572, 1000, 0, -1, 3, 0, 26);
                break L3;
              }
              var2_ref.a(be.a((byte) 22, 2, 1 + rd.field_b), 606, 406, 0, -1);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var2, "mg.K(" + param0 + ')');
        }
    }

    private final void d(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        String var2_ref = null;
        int var3 = 0;
        String[] var3_ref_String__ = null;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        Object var10 = null;
        int var11 = 0;
        ra var12 = null;
        int var13 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        int stackIn_4_4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int stackIn_10_3 = 0;
        int stackIn_10_4 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_13_3 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_14_3 = 0;
        int stackIn_14_4 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        int stackIn_16_4 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_94_0 = 0;
        int stackIn_94_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        int stackOut_3_4 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        int stackOut_9_4 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        int stackOut_7_4 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        int stackOut_13_4 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        int stackOut_11_4 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        int stackOut_15_4 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_93_0 = 0;
        int stackOut_93_1 = 0;
        var13 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2_int >= 11) {
                    break L3;
                  } else {
                    stackOut_3_0 = 151;
                    stackOut_3_1 = 48 - -(var2_int * 26) - -26;
                    stackOut_3_2 = 208;
                    stackOut_3_3 = 26;
                    stackOut_3_4 = -1;
                    stackIn_16_0 = stackOut_3_0;
                    stackIn_16_1 = stackOut_3_1;
                    stackIn_16_2 = stackOut_3_2;
                    stackIn_16_3 = stackOut_3_3;
                    stackIn_16_4 = stackOut_3_4;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    stackIn_4_2 = stackOut_3_2;
                    stackIn_4_3 = stackOut_3_3;
                    stackIn_4_4 = stackOut_3_4;
                    if (var13 != 0) {
                      break L2;
                    } else {
                      L4: {
                        stackOut_4_0 = stackIn_4_0;
                        stackOut_4_1 = stackIn_4_1;
                        stackOut_4_2 = stackIn_4_2;
                        stackOut_4_3 = stackIn_4_3;
                        stackIn_9_0 = stackOut_4_0;
                        stackIn_9_1 = stackOut_4_1;
                        stackIn_9_2 = stackOut_4_2;
                        stackIn_9_3 = stackOut_4_3;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        stackIn_5_2 = stackOut_4_2;
                        stackIn_5_3 = stackOut_4_3;
                        if (stackIn_4_4 == ~(var2_int & 1)) {
                          stackOut_9_0 = stackIn_9_0;
                          stackOut_9_1 = stackIn_9_1;
                          stackOut_9_2 = stackIn_9_2;
                          stackOut_9_3 = stackIn_9_3;
                          stackOut_9_4 = 9073738;
                          stackIn_10_0 = stackOut_9_0;
                          stackIn_10_1 = stackOut_9_1;
                          stackIn_10_2 = stackOut_9_2;
                          stackIn_10_3 = stackOut_9_3;
                          stackIn_10_4 = stackOut_9_4;
                          break L4;
                        } else {
                          stackOut_5_0 = stackIn_5_0;
                          stackOut_5_1 = stackIn_5_1;
                          stackOut_5_2 = stackIn_5_2;
                          stackOut_5_3 = stackIn_5_3;
                          stackIn_7_0 = stackOut_5_0;
                          stackIn_7_1 = stackOut_5_1;
                          stackIn_7_2 = stackOut_5_2;
                          stackIn_7_3 = stackOut_5_3;
                          stackOut_7_0 = stackIn_7_0;
                          stackOut_7_1 = stackIn_7_1;
                          stackOut_7_2 = stackIn_7_2;
                          stackOut_7_3 = stackIn_7_3;
                          stackOut_7_4 = 6048056;
                          stackIn_10_0 = stackOut_7_0;
                          stackIn_10_1 = stackOut_7_1;
                          stackIn_10_2 = stackOut_7_2;
                          stackIn_10_3 = stackOut_7_3;
                          stackIn_10_4 = stackOut_7_4;
                          break L4;
                        }
                      }
                      L5: {
                        ll.c(stackIn_10_0, stackIn_10_1, stackIn_10_2, stackIn_10_3, stackIn_10_4);
                        stackOut_10_0 = 385;
                        stackOut_10_1 = 26 * (var2_int + 1) + 48;
                        stackOut_10_2 = 104;
                        stackOut_10_3 = 26;
                        stackIn_13_0 = stackOut_10_0;
                        stackIn_13_1 = stackOut_10_1;
                        stackIn_13_2 = stackOut_10_2;
                        stackIn_13_3 = stackOut_10_3;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        stackIn_11_2 = stackOut_10_2;
                        stackIn_11_3 = stackOut_10_3;
                        if ((var2_int & 1) == 0) {
                          stackOut_13_0 = stackIn_13_0;
                          stackOut_13_1 = stackIn_13_1;
                          stackOut_13_2 = stackIn_13_2;
                          stackOut_13_3 = stackIn_13_3;
                          stackOut_13_4 = 9073738;
                          stackIn_14_0 = stackOut_13_0;
                          stackIn_14_1 = stackOut_13_1;
                          stackIn_14_2 = stackOut_13_2;
                          stackIn_14_3 = stackOut_13_3;
                          stackIn_14_4 = stackOut_13_4;
                          break L5;
                        } else {
                          stackOut_11_0 = stackIn_11_0;
                          stackOut_11_1 = stackIn_11_1;
                          stackOut_11_2 = stackIn_11_2;
                          stackOut_11_3 = stackIn_11_3;
                          stackOut_11_4 = 6048056;
                          stackIn_14_0 = stackOut_11_0;
                          stackIn_14_1 = stackOut_11_1;
                          stackIn_14_2 = stackOut_11_2;
                          stackIn_14_3 = stackOut_11_3;
                          stackIn_14_4 = stackOut_11_4;
                          break L5;
                        }
                      }
                      ll.c(stackIn_14_0, stackIn_14_1, stackIn_14_2, stackIn_14_3, stackIn_14_4);
                      var2_int++;
                      if (var13 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                ll.f(152, 75, 206, 284, 3352864);
                stackOut_15_0 = 386;
                stackOut_15_1 = 75;
                stackOut_15_2 = 102;
                stackOut_15_3 = 284;
                stackOut_15_4 = 3352864;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                stackIn_16_2 = stackOut_15_2;
                stackIn_16_3 = stackOut_15_3;
                stackIn_16_4 = stackOut_15_4;
                break L2;
              }
              L6: {
                L7: {
                  ll.f(stackIn_16_0, stackIn_16_1, stackIn_16_2, stackIn_16_3, stackIn_16_4);
                  if (jj.s(23)) {
                    var2_ref = nd.field_I;
                    bk.field_E.b(hh.field_b, 320, 406, 0, -1);
                    break L7;
                  } else {
                    L8: {
                      if (null != g.field_w) {
                        break L8;
                      } else {
                        g.field_w = hj.a(3, 10, 1, 10, (byte) -102);
                        break L8;
                      }
                    }
                    L9: {
                      if (g.field_w.field_o) {
                        if (g.field_w.field_m != null) {
                          var2_ref = nd.field_I;
                          var3_ref_String__ = g.field_w.field_m[di.field_i];
                          var4 = -1;
                          var5 = g.field_w.field_n[di.field_i];
                          var6 = 94;
                          var7 = 0;
                          L10: while (true) {
                            if (var7 > 10) {
                              break L9;
                            } else {
                              var8 = 0;
                              var9 = null;
                              stackOut_28_0 = ~var7;
                              stackOut_28_1 = -11;
                              stackIn_94_0 = stackOut_28_0;
                              stackIn_94_1 = stackOut_28_1;
                              stackIn_29_0 = stackOut_28_0;
                              stackIn_29_1 = stackOut_28_1;
                              if (var13 != 0) {
                                break L6;
                              } else {
                                L11: {
                                  L12: {
                                    if (stackIn_29_0 != stackIn_29_1) {
                                      if (var3_ref_String__[var7] != null) {
                                        L13: {
                                          var2_ref = "";
                                          var8 = var5[var7];
                                          if (var4 >= 0) {
                                            break L13;
                                          } else {
                                            if (var3_ref_String__[var7] != ue.field_a) {
                                              break L13;
                                            } else {
                                              if (null == rk.field_bb) {
                                                break L13;
                                              } else {
                                                if (~rk.field_bb.field_j != ~g.field_w.field_q[di.field_i][var7]) {
                                                  break L13;
                                                } else {
                                                  if (ua.field_L == null) {
                                                    break L13;
                                                  } else {
                                                    if (var5[var7] == ua.field_L.field_O) {
                                                      var4 = var7;
                                                      break L13;
                                                    } else {
                                                      break L13;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        var9 = (Object) (Object) var3_ref_String__[var7];
                                        break L12;
                                      } else {
                                        break L12;
                                      }
                                    } else {
                                      L14: {
                                        if (0 > var4) {
                                          break L14;
                                        } else {
                                          if (var13 == 0) {
                                            break L11;
                                          } else {
                                            break L14;
                                          }
                                        }
                                      }
                                      L15: {
                                        if (null != ua.field_L) {
                                          break L15;
                                        } else {
                                          if (var13 == 0) {
                                            break L11;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                      var8 = ua.field_L.field_O;
                                      var4 = var7;
                                      var9 = (Object) (Object) ue.field_a;
                                      break L12;
                                    }
                                  }
                                  L16: {
                                    if (var9 != null) {
                                      L17: {
                                        var10 = var9;
                                        var11 = 0;
                                        if (var7 != var4) {
                                          break L17;
                                        } else {
                                          if (null == he.field_f[((mg) this).field_c]) {
                                            var11 = 1;
                                            break L17;
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                      L18: {
                                        if (var7 < 10) {
                                          bk.field_E.a(var7 - -1 + ". ", 181, var6, var11, -1);
                                          break L18;
                                        } else {
                                          break L18;
                                        }
                                      }
                                      bk.field_E.c((String) var10, 181, var6, var11, -1);
                                      bk.field_E.a(Integer.toString(var8), 487, var6, var11, -1);
                                      if (var4 != var7) {
                                        break L16;
                                      } else {
                                        if (he.field_f[((mg) this).field_c] != null) {
                                          var12 = he.field_f[((mg) this).field_c];
                                          var12.a(468 + var12.field_a, var12.field_f + 26 * (1 - -var7), 0, 4);
                                          var12.a(104 + var12.field_a, 26 * (1 - -var7) + var12.field_f, 0, 3);
                                          break L16;
                                        } else {
                                          break L16;
                                        }
                                      }
                                    } else {
                                      break L16;
                                    }
                                  }
                                  var6 += 26;
                                  break L11;
                                }
                                var7++;
                                if (var13 == 0) {
                                  continue L10;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                        } else {
                          var2_ref = oi.field_e;
                          break L9;
                        }
                      } else {
                        var2_ref = f.field_d;
                        break L9;
                      }
                    }
                    bk.field_E.b(ad.field_s, 320, 406, 0, -1);
                    break L7;
                  }
                }
                stackOut_93_0 = param0;
                stackOut_93_1 = -4;
                stackIn_94_0 = stackOut_93_0;
                stackIn_94_1 = stackOut_93_1;
                break L6;
              }
              L19: {
                if (stackIn_94_0 <= stackIn_94_1) {
                  break L19;
                } else {
                  this.a(52, false, false);
                  break L19;
                }
              }
              var3 = 224;
              bk.field_E.b(var2_ref, 255, var3, 0, -1);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var2, "mg.L(" + param0 + ')');
        }
    }

    private final void a(boolean param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        qj var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_8_0 = 0;
        String stackIn_18_0 = null;
        int stackIn_32_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_75_0 = 0;
        qj[] stackIn_85_0 = null;
        qj[] stackIn_87_0 = null;
        qj[] stackIn_89_0 = null;
        qj[] stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        String stackOut_17_0 = null;
        String stackOut_15_0 = null;
        int stackOut_31_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_72_0 = 0;
        qj[] stackOut_84_0 = null;
        qj[] stackOut_89_0 = null;
        int stackOut_89_1 = 0;
        qj[] stackOut_85_0 = null;
        qj[] stackOut_87_0 = null;
        int stackOut_87_1 = 0;
        var13 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var6_int = this.b(66, param3);
                var7 = ja.field_c[var6_int];
                cl.a(gb.field_l, param1, 26, param2, 156, param4 ^ 5);
                if (var6_int == 2) {
                  break L2;
                } else {
                  if (var6_int != 3) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_5_0 = 1;
              stackIn_8_0 = stackOut_5_0;
              break L1;
            }
            L3: {
              var8 = stackIn_8_0;
              if (var7 == null) {
                L4: {
                  var9 = var6_int;
                  if (12 != var9) {
                    break L4;
                  } else {
                    L5: {
                      if (1 != rd.field_b) {
                        stackOut_17_0 = q.field_o;
                        stackIn_18_0 = stackOut_17_0;
                        break L5;
                      } else {
                        stackOut_15_0 = l.field_n;
                        stackIn_18_0 = stackOut_15_0;
                        break L5;
                      }
                    }
                    var7 = stackIn_18_0;
                    if (var13 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                throw new IllegalStateException("Unexpected optionNo: " + var6_int);
              } else {
                break L3;
              }
            }
            L6: {
              if (this.a((byte) 83, var6_int)) {
                if (!param0) {
                  stackOut_31_0 = 0;
                  stackIn_32_0 = stackOut_31_0;
                  break L6;
                } else {
                  stackOut_29_0 = 1;
                  stackIn_32_0 = stackOut_29_0;
                  break L6;
                }
              } else {
                if (!param0) {
                  stackOut_27_0 = 2;
                  stackIn_32_0 = stackOut_27_0;
                  break L6;
                } else {
                  stackOut_25_0 = 3;
                  stackIn_32_0 = stackOut_25_0;
                  break L6;
                }
              }
            }
            L7: {
              var9 = stackIn_32_0;
              if (param0) {
                break L7;
              } else {
                L8: {
                  if (var6_int != 23) {
                    break L8;
                  } else {
                    if (di.field_i != 0) {
                      break L8;
                    } else {
                      var9 = 6;
                      break L8;
                    }
                  }
                }
                L9: {
                  if (24 != var6_int) {
                    break L9;
                  } else {
                    if (1 == di.field_i) {
                      var9 = 6;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
                if (var6_int != 25) {
                  break L7;
                } else {
                  if (di.field_i == 2) {
                    var9 = 6;
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
            }
            L10: {
              if (param4 == 1) {
                break L10;
              } else {
                boolean discarded$1 = this.a((byte) -90, -120);
                break L10;
              }
            }
            L11: {
              L12: {
                if (var8 == 0) {
                  break L12;
                } else {
                  L13: {
                    bk.field_E.c(var7, param1 - -13, bk.field_E.field_G + param2 + -2, var9, -1);
                    if (!this.a((byte) 60, var6_int)) {
                      if (!param0) {
                        stackOut_70_0 = 4473924;
                        stackIn_71_0 = stackOut_70_0;
                        break L13;
                      } else {
                        stackOut_68_0 = 12303291;
                        stackIn_71_0 = stackOut_68_0;
                        break L13;
                      }
                    } else {
                      if (param0) {
                        stackOut_66_0 = 8110658;
                        stackIn_71_0 = stackOut_66_0;
                        break L13;
                      } else {
                        stackOut_64_0 = 15252224;
                        stackIn_71_0 = stackOut_64_0;
                        break L13;
                      }
                    }
                  }
                  L14: {
                    var10_int = stackIn_71_0;
                    ll.c(param1 + 78, param2 - -13, 64, 2, var10_int);
                    if (var6_int == 2) {
                      stackOut_74_0 = qd.field_d;
                      stackIn_75_0 = stackOut_74_0;
                      break L14;
                    } else {
                      stackOut_72_0 = kc.field_b;
                      stackIn_75_0 = stackOut_72_0;
                      break L14;
                    }
                  }
                  L15: {
                    var11 = stackIn_75_0 >> -2104036478;
                    if (var11 >= 0) {
                      break L15;
                    } else {
                      var11 = 0;
                      break L15;
                    }
                  }
                  ll.c(param1 + (78 - (-var11 + 1)), -6 + param2 - -13, 3, 14, 8110658);
                  ll.g(var11 + (78 + param1) + -2, 13 + param2, 2, 16580608);
                  ll.g(2 + (param1 + 78 + var11), param2 - -13, 2, 16580608);
                  if (var13 == 0) {
                    break L11;
                  } else {
                    break L12;
                  }
                }
              }
              L16: {
                if (26 == var6_int) {
                  break L16;
                } else {
                  bk.field_E.b(var7, 78 + param1, param2 - (-bk.field_E.field_G - -2), var9, -1);
                  if (var13 == 0) {
                    break L11;
                  } else {
                    break L16;
                  }
                }
              }
              L17: {
                stackOut_84_0 = kg.field_e;
                stackIn_89_0 = stackOut_84_0;
                stackIn_85_0 = stackOut_84_0;
                if (!fi.field_i) {
                  stackOut_89_0 = (qj[]) (Object) stackIn_89_0;
                  stackOut_89_1 = 1;
                  stackIn_90_0 = stackOut_89_0;
                  stackIn_90_1 = stackOut_89_1;
                  break L17;
                } else {
                  stackOut_85_0 = (qj[]) (Object) stackIn_85_0;
                  stackIn_87_0 = stackOut_85_0;
                  stackOut_87_0 = (qj[]) (Object) stackIn_87_0;
                  stackOut_87_1 = 0;
                  stackIn_90_0 = stackOut_87_0;
                  stackIn_90_1 = stackOut_87_1;
                  break L17;
                }
              }
              var10 = stackIn_90_0[stackIn_90_1];
              var11 = bk.field_E.a(var7) - (-bk.field_E.a(' ') + -var10.field_s);
              var12 = param1 + (156 - var11 >> -1774299263);
              bk.field_E.c(var7, var12, -2 + (bk.field_E.field_G + param2), var9, -1);
              var10.e(var12 - (-var11 - -var10.field_s), (1 + -var10.field_v + 26 >> 751385377) + param2);
              break L11;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var6, "mg.T(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final int e(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 > 51) {
              L1: {
                L2: {
                  if (((mg) this).field_c == 4) {
                    break L2;
                  } else {
                    if (((mg) this).field_c == 5) {
                      break L2;
                    } else {
                      if (((mg) this).field_c == 6) {
                        break L2;
                      } else {
                        if (((mg) this).field_c != 7) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                if (rd.field_b != 0) {
                  break L1;
                } else {
                  stackOut_16_0 = mf.field_a[((mg) this).field_c] - -mf.field_d[((mg) this).field_c];
                  stackIn_17_0 = stackOut_16_0;
                  return stackIn_17_0;
                }
              }
              stackOut_18_0 = mf.field_a[((mg) this).field_c];
              stackIn_19_0 = stackOut_18_0;
              break L0;
            } else {
              stackOut_1_0 = 61;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var2, "mg.F(" + param0 + ')');
        }
        return stackIn_19_0;
    }

    private final boolean a(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            var3_int = 92 % ((-2 - param0) / 57);
            if (param1 != 1) {
              stackOut_11_0 = 1;
              stackIn_12_0 = stackOut_11_0;
              break L0;
            } else {
              L1: {
                L2: {
                  if (qh.field_b == null) {
                    break L2;
                  } else {
                    if (~(pc.field_i - -1) > ~qh.field_b.field_x) {
                      break L2;
                    } else {
                      stackOut_7_0 = 1;
                      stackIn_10_0 = stackOut_7_0;
                      break L1;
                    }
                  }
                }
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L1;
              }
              return stackIn_10_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var3, "mg.J(" + param0 + ',' + param1 + ')');
        }
        return stackIn_12_0 != 0;
    }

    private final int a(byte param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_77_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_68_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 6) {
                break L1;
              } else {
                ((mg) this).field_d = 56;
                break L1;
              }
            }
            if (((mg) this).field_c != 11) {
              if (!mf.field_i[((mg) this).field_c]) {
                L2: {
                  if (param1 < mf.field_a[((mg) this).field_c]) {
                    break L2;
                  } else {
                    if (~param1 > ~(mf.field_b[((mg) this).field_c] + mf.field_a[((mg) this).field_c])) {
                      if (~mf.field_h[((mg) this).field_c] < ~param2) {
                        stackOut_68_0 = -1;
                        stackIn_69_0 = stackOut_68_0;
                        return stackIn_69_0;
                      } else {
                        var4_int = (param2 + -mf.field_h[((mg) this).field_c]) / mf.field_d[((mg) this).field_c];
                        if (mf.field_f[((mg) this).field_c].length > var4_int) {
                          if (~(26 + mf.field_d[((mg) this).field_c] * var4_int + mf.field_h[((mg) this).field_c]) <= ~param2) {
                            stackOut_76_0 = var4_int;
                            stackIn_77_0 = stackOut_76_0;
                            break L0;
                          } else {
                            stackOut_74_0 = -1;
                            stackIn_75_0 = stackOut_74_0;
                            return stackIn_75_0;
                          }
                        } else {
                          stackOut_71_0 = -1;
                          stackIn_72_0 = stackOut_71_0;
                          return stackIn_72_0;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_63_0 = -1;
                stackIn_64_0 = stackOut_63_0;
                return stackIn_64_0;
              } else {
                L3: {
                  if (~mf.field_h[((mg) this).field_c] < ~param2) {
                    break L3;
                  } else {
                    if (mf.field_b[((mg) this).field_c] + mf.field_h[((mg) this).field_c] <= param2) {
                      break L3;
                    } else {
                      var4_int = this.e((byte) 121);
                      if (~param1 <= ~var4_int) {
                        var5 = (param1 + -var4_int) / mf.field_d[((mg) this).field_c];
                        if (~mf.field_f[((mg) this).field_c].length >= ~var5) {
                          stackOut_50_0 = -1;
                          stackIn_51_0 = stackOut_50_0;
                          return stackIn_51_0;
                        } else {
                          param1 = -(var5 * mf.field_d[((mg) this).field_c]) + -var4_int + param1;
                          if (param1 >= 156) {
                            stackOut_55_0 = -1;
                            stackIn_56_0 = stackOut_55_0;
                            return stackIn_56_0;
                          } else {
                            stackOut_57_0 = var5;
                            stackIn_58_0 = stackOut_57_0;
                            return stackIn_58_0;
                          }
                        }
                      } else {
                        stackOut_45_0 = -1;
                        stackIn_46_0 = stackOut_45_0;
                        return stackIn_46_0;
                      }
                    }
                  }
                }
                stackOut_42_0 = -1;
                stackIn_43_0 = stackOut_42_0;
                return stackIn_43_0;
              }
            } else {
              L4: {
                param1 = param1 - mf.field_a[((mg) this).field_c];
                param2 = param2 - mf.field_h[((mg) this).field_c];
                if (0 > param1) {
                  break L4;
                } else {
                  if (param2 >= 0) {
                    var4_int = param2 / mf.field_b[((mg) this).field_c];
                    var5 = param1 / mf.field_d[((mg) this).field_c];
                    param1 = param1 - var5 * mf.field_d[((mg) this).field_c];
                    if (param1 >= 156) {
                      stackOut_13_0 = -1;
                      stackIn_14_0 = stackOut_13_0;
                      return stackIn_14_0;
                    } else {
                      L5: {
                        if (var4_int != 0) {
                          break L5;
                        } else {
                          if (3 > var5) {
                            stackOut_21_0 = var5;
                            stackIn_22_0 = stackOut_21_0;
                            return stackIn_22_0;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (1 != var4_int) {
                          break L6;
                        } else {
                          if (var5 == 1) {
                            stackOut_29_0 = 3;
                            stackIn_30_0 = stackOut_29_0;
                            return stackIn_30_0;
                          } else {
                            break L6;
                          }
                        }
                      }
                      stackOut_31_0 = -1;
                      stackIn_32_0 = stackOut_31_0;
                      return stackIn_32_0;
                    }
                  } else {
                    break L4;
                  }
                }
              }
              stackOut_8_0 = -1;
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var4, "mg.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_77_0;
    }

    public static void a(int param0) {
        try {
            field_b = null;
            if (param0 != -8381) {
                mg.a(-48);
            }
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "mg.B(" + param0 + ')');
        }
    }

    final void a(int param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                var3_int = 0;
                if (((mg) this).field_c == 0) {
                  break L2;
                } else {
                  if (((mg) this).field_c != 1) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (((mg) this).field_e.field_e == -1) {
                break L1;
              } else {
                var3_int = ((mg) this).field_e.field_e;
                break L1;
              }
            }
            L3: {
              L4: {
                if (((mg) this).field_c == 12) {
                  break L4;
                } else {
                  if (((mg) this).field_c != 13) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if (((mg) this).field_e.field_e == -1) {
                break L3;
              } else {
                if (ib.field_a != -1) {
                  var3_int = ((mg) this).field_e.field_e;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                if (((mg) this).field_c == 4) {
                  break L6;
                } else {
                  if (((mg) this).field_c == 5) {
                    break L6;
                  } else {
                    if (((mg) this).field_c == 6) {
                      break L6;
                    } else {
                      if (((mg) this).field_c == 7) {
                        break L6;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
              }
              var3_int = 1;
              break L5;
            }
            L7: {
              L8: {
                ((mg) this).field_e.a(var3_int, this.a((byte) 6, kf.field_b, fg.field_a), param1, 120);
                if (((mg) this).field_c == 2) {
                  break L8;
                } else {
                  if (3 == ((mg) this).field_c) {
                    break L8;
                  } else {
                    break L7;
                  }
                }
              }
              mb.field_b = this.b((byte) 125);
              break L7;
            }
            L9: {
              if (param0 == 10412) {
                break L9;
              } else {
                ((mg) this).c(-110);
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var3, "mg.S(" + param0 + ',' + param1 + ')');
        }
    }

    private final void d(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        var5 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (2 <= sl.field_j) {
                if (1 != kg.field_d) {
                  break L1;
                } else {
                  L2: {
                    if (nf.field_f) {
                      stackOut_10_0 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      break L2;
                    } else {
                      stackOut_8_0 = 1;
                      stackIn_11_0 = stackOut_8_0;
                      break L2;
                    }
                  }
                  nf.field_f = stackIn_11_0 != 0;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L3: {
              var2_int = 86 / ((22 - param0) / 62);
              if (kg.field_d == 13) {
                if (-2147483648 == mf.field_e[((mg) this).field_c]) {
                  break L3;
                } else {
                  si.a((byte) -68, 5);
                  sc.field_g = mf.field_e[((mg) this).field_c];
                  break L3;
                }
              } else {
                break L3;
              }
            }
            L4: {
              L5: {
                if (11 == ((mg) this).field_c) {
                  break L5;
                } else {
                  L6: {
                    L7: {
                      if (((mg) this).field_c == 2) {
                        break L7;
                      } else {
                        if (3 != ((mg) this).field_c) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      if (((mg) this).field_e.e(0)) {
                        break L8;
                      } else {
                        L9: {
                          if (kg.field_d == 97) {
                            break L9;
                          } else {
                            L10: {
                              if (kg.field_d != 80) {
                                break L10;
                              } else {
                                if (!ni.field_m[81]) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            L11: {
                              L12: {
                                if (kg.field_d == 96) {
                                  break L12;
                                } else {
                                  if (kg.field_d != 80) {
                                    break L11;
                                  } else {
                                    if (!ni.field_m[81]) {
                                      break L11;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                              L13: {
                                L14: {
                                  if (2 != tc.field_b) {
                                    break L14;
                                  } else {
                                    tc.field_b = -1;
                                    ((mg) this).field_e.field_e = 0;
                                    if (var5 == 0) {
                                      break L13;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                tc.field_b = 2;
                                ((mg) this).field_e.field_e = -1;
                                break L13;
                              }
                              ((mg) this).field_e.field_a = false;
                              if (var5 == 0) {
                                break L4;
                              } else {
                                break L11;
                              }
                            }
                            L15: {
                              if (((mg) this).field_e.field_e >= 0) {
                                break L15;
                              } else {
                                L16: {
                                  var3 = qh.field_b.field_x;
                                  if (kg.field_d == 98) {
                                    L17: {
                                      tc.field_b = 2;
                                      if (qh.field_b.field_x > 1) {
                                        qh.field_b = gj.field_f[-2 + qh.field_b.field_x];
                                        break L17;
                                      } else {
                                        break L17;
                                      }
                                    }
                                    ((mg) this).field_e.field_a = false;
                                    break L16;
                                  } else {
                                    break L16;
                                  }
                                }
                                L18: {
                                  if (99 == kg.field_d) {
                                    L19: {
                                      tc.field_b = 2;
                                      if (~gj.field_f.length < ~qh.field_b.field_x) {
                                        qh.field_b = gj.field_f[qh.field_b.field_x];
                                        break L19;
                                      } else {
                                        break L19;
                                      }
                                    }
                                    ((mg) this).field_e.field_a = false;
                                    break L18;
                                  } else {
                                    break L18;
                                  }
                                }
                                L20: {
                                  if (tc.field_b != 0) {
                                    break L20;
                                  } else {
                                    L21: {
                                      if (kg.field_d == 83) {
                                        break L21;
                                      } else {
                                        if (kg.field_d != 84) {
                                          break L20;
                                        } else {
                                          break L21;
                                        }
                                      }
                                    }
                                    L22: {
                                      if (qh.field_b.field_x > 1) {
                                        qh.field_b = gj.field_f[-2 + qh.field_b.field_x];
                                        break L22;
                                      } else {
                                        break L22;
                                      }
                                    }
                                    ((mg) this).field_e.field_a = false;
                                    break L20;
                                  }
                                }
                                L23: {
                                  if (tc.field_b != 1) {
                                    break L23;
                                  } else {
                                    L24: {
                                      if (kg.field_d == 83) {
                                        break L24;
                                      } else {
                                        if (kg.field_d != 84) {
                                          break L23;
                                        } else {
                                          break L24;
                                        }
                                      }
                                    }
                                    L25: {
                                      if (qh.field_b.field_x >= gj.field_f.length) {
                                        break L25;
                                      } else {
                                        qh.field_b = gj.field_f[qh.field_b.field_x];
                                        break L25;
                                      }
                                    }
                                    ((mg) this).field_e.field_a = false;
                                    break L23;
                                  }
                                }
                                L26: {
                                  if (2 == tc.field_b) {
                                    L27: {
                                      if (kg.field_d != 104) {
                                        break L27;
                                      } else {
                                        L28: {
                                          var4 = qh.field_b.field_x + -9;
                                          if (var4 < 0) {
                                            var4 = 0;
                                            break L28;
                                          } else {
                                            break L28;
                                          }
                                        }
                                        qh.field_b = gj.field_f[var4];
                                        ((mg) this).field_e.field_a = false;
                                        break L27;
                                      }
                                    }
                                    L29: {
                                      if (kg.field_d == 105) {
                                        L30: {
                                          var4 = 7 + qh.field_b.field_x;
                                          if (~var4 <= ~gj.field_f.length) {
                                            var4 = gj.field_f.length - 1;
                                            break L30;
                                          } else {
                                            break L30;
                                          }
                                        }
                                        qh.field_b = gj.field_f[var4];
                                        ((mg) this).field_e.field_a = false;
                                        break L29;
                                      } else {
                                        break L29;
                                      }
                                    }
                                    L31: {
                                      if (kg.field_d != 102) {
                                        break L31;
                                      } else {
                                        ((mg) this).field_e.field_a = false;
                                        qh.field_b = gj.field_f[0];
                                        break L31;
                                      }
                                    }
                                    L32: {
                                      if (kg.field_d != 103) {
                                        break L32;
                                      } else {
                                        qh.field_b = gj.field_f[gj.field_f.length - 1];
                                        ((mg) this).field_e.field_a = false;
                                        break L32;
                                      }
                                    }
                                    if (84 != kg.field_d) {
                                      break L26;
                                    } else {
                                      if (1 + pc.field_i >= qh.field_b.field_x) {
                                        si.a((byte) -68, 5);
                                        g.field_w = null;
                                        rk.field_bb = null;
                                        ua.field_L = new ri();
                                        sc.field_g = -1;
                                        oe.field_e = 0;
                                        break L26;
                                      } else {
                                        break L26;
                                      }
                                    }
                                  } else {
                                    break L26;
                                  }
                                }
                                var3 = var3 - qh.field_b.field_x;
                                mb.field_b = mb.field_b - 26 * var3;
                                if (var5 == 0) {
                                  break L4;
                                } else {
                                  break L15;
                                }
                              }
                            }
                            ((mg) this).field_e.b((byte) -113);
                            if (var5 == 0) {
                              break L4;
                            } else {
                              break L9;
                            }
                          }
                        }
                        L33: {
                          L34: {
                            if (((mg) this).field_e.field_e < 0) {
                              break L34;
                            } else {
                              tc.field_b = 2;
                              ((mg) this).field_e.field_e = -1;
                              if (var5 == 0) {
                                break L33;
                              } else {
                                break L34;
                              }
                            }
                          }
                          tc.field_b = -1;
                          ((mg) this).field_e.field_e = 0;
                          break L33;
                        }
                        ((mg) this).field_e.field_a = false;
                        if (var5 == 0) {
                          break L4;
                        } else {
                          break L8;
                        }
                      }
                    }
                    ((mg) this).field_e.f(0);
                    if (var5 == 0) {
                      break L4;
                    } else {
                      break L6;
                    }
                  }
                  L35: {
                    if (!mf.field_i[((mg) this).field_c]) {
                      break L35;
                    } else {
                      ((mg) this).field_e.a((byte) 20);
                      if (var5 == 0) {
                        break L4;
                      } else {
                        break L35;
                      }
                    }
                  }
                  ((mg) this).field_e.b((byte) -76);
                  if (var5 == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              L36: {
                if (((mg) this).field_e.e(0)) {
                  break L36;
                } else {
                  L37: {
                    if (kg.field_d == 96) {
                      break L37;
                    } else {
                      L38: {
                        if (kg.field_d != 97) {
                          break L38;
                        } else {
                          L39: {
                            L40: {
                              if (2 > ((mg) this).field_e.field_e) {
                                break L40;
                              } else {
                                if (2 != ((mg) this).field_e.field_e) {
                                  break L39;
                                } else {
                                  ((mg) this).field_e.field_e = 0;
                                  if (var5 == 0) {
                                    break L39;
                                  } else {
                                    break L40;
                                  }
                                }
                              }
                            }
                            ((mg) this).field_e.field_e = ((mg) this).field_e.field_e + 1;
                            break L39;
                          }
                          ((mg) this).field_e.field_a = false;
                          if (var5 == 0) {
                            break L36;
                          } else {
                            break L38;
                          }
                        }
                      }
                      L41: {
                        if (99 == kg.field_d) {
                          break L41;
                        } else {
                          if (kg.field_d == 98) {
                            L42: {
                              L43: {
                                if (3 == ((mg) this).field_e.field_e) {
                                  break L43;
                                } else {
                                  ((mg) this).field_e.field_e = 3;
                                  if (var5 == 0) {
                                    break L42;
                                  } else {
                                    break L43;
                                  }
                                }
                              }
                              ((mg) this).field_e.field_e = di.field_i;
                              break L42;
                            }
                            ((mg) this).field_e.field_a = false;
                            if (var5 == 0) {
                              break L36;
                            } else {
                              break L41;
                            }
                          } else {
                            break L36;
                          }
                        }
                      }
                      L44: {
                        L45: {
                          L46: {
                            if (-1 == ((mg) this).field_e.field_e) {
                              break L46;
                            } else {
                              if (((mg) this).field_e.field_e != 3) {
                                break L45;
                              } else {
                                break L46;
                              }
                            }
                          }
                          ((mg) this).field_e.field_e = di.field_i;
                          if (var5 == 0) {
                            break L44;
                          } else {
                            break L45;
                          }
                        }
                        ((mg) this).field_e.field_e = 3;
                        break L44;
                      }
                      ((mg) this).field_e.field_a = false;
                      if (var5 == 0) {
                        break L36;
                      } else {
                        break L37;
                      }
                    }
                  }
                  L47: {
                    L48: {
                      if (0 >= ((mg) this).field_e.field_e) {
                        break L48;
                      } else {
                        if (3 == ((mg) this).field_e.field_e) {
                          break L47;
                        } else {
                          ((mg) this).field_e.field_e = ((mg) this).field_e.field_e - 1;
                          if (var5 == 0) {
                            break L47;
                          } else {
                            break L48;
                          }
                        }
                      }
                    }
                    ((mg) this).field_e.field_e = 2;
                    break L47;
                  }
                  ((mg) this).field_e.field_a = false;
                  break L36;
                }
              }
              ((mg) this).field_e.f(0);
              break L4;
            }
            L49: {
              if (((mg) this).field_e.field_e != -1) {
                this.a(((mg) this).field_e.field_e, false, false);
                break L49;
              } else {
                break L49;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var2, "mg.A(" + param0 + ')');
        }
    }

    private final void a(boolean param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_11_0 = false;
        int stackIn_77_0 = 0;
        int stackIn_80_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        boolean stackOut_10_0 = false;
        int stackOut_76_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_79_0 = 0;
        var10 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 122;
              var4 = 128;
              if (!param0) {
                stackOut_4_0 = th.field_l;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_2_0 = oe.field_e;
                stackIn_5_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var5 = stackIn_5_0;
              if (!param0) {
                break L2;
              } else {
                var6 = sc.a(var5, param1 + -17461);
                if (var6 > 8) {
                  break L2;
                } else {
                  var3_int = var3_int + (-var6 + 8) * 52 / 2;
                  break L2;
                }
              }
            }
            var6 = 0;
            var7 = -1;
            var8 = 0;
            L3: while (true) {
              L4: {
                L5: {
                  if (~var8 <= ~wa.field_k.length) {
                    break L5;
                  } else {
                    stackOut_10_0 = this.a(var8, 10);
                    stackIn_80_0 = stackOut_10_0 ? 1 : 0;
                    stackIn_11_0 = stackOut_10_0;
                    if (var10 != 0) {
                      break L4;
                    } else {
                      L6: {
                        L7: {
                          if (stackIn_11_0) {
                            break L7;
                          } else {
                            if (var10 == 0) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        L8: {
                          L9: {
                            if ((1 << var8 & var5) != 0) {
                              break L9;
                            } else {
                              L10: {
                                if (!param0) {
                                  break L10;
                                } else {
                                  if (var10 == 0) {
                                    break L6;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              vj.field_a.b(var3_int, var4);
                              if (var10 == 0) {
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                          bb.field_b[var8].b(var3_int, var4);
                          break L8;
                        }
                        L11: {
                          if (~kf.field_b > ~var3_int) {
                            break L11;
                          } else {
                            if (~kf.field_b < ~(32 + var3_int)) {
                              break L11;
                            } else {
                              if (~fg.field_a > ~var4) {
                                break L11;
                              } else {
                                if (~fg.field_a < ~(32 + var4)) {
                                  break L11;
                                } else {
                                  var7 = var8;
                                  ll.d(-2 + var3_int, var4 + -2, 36, 36, 6, 16711680);
                                  break L11;
                                }
                              }
                            }
                          }
                        }
                        L12: {
                          if (-1 == ((mg) this).field_h) {
                            break L12;
                          } else {
                            if (var3_int > ((mg) this).field_h) {
                              break L12;
                            } else {
                              if (~((mg) this).field_h < ~(var3_int - -32)) {
                                break L12;
                              } else {
                                if (var4 > ((mg) this).field_g) {
                                  break L12;
                                } else {
                                  if (~(32 + var4) > ~((mg) this).field_g) {
                                    break L12;
                                  } else {
                                    L13: {
                                      ((mg) this).field_h = -1;
                                      if (~var8 != ~((mg) this).field_d) {
                                        break L13;
                                      } else {
                                        ((mg) this).field_d = -1;
                                        if (var10 == 0) {
                                          break L12;
                                        } else {
                                          break L13;
                                        }
                                      }
                                    }
                                    ((mg) this).field_d = var8;
                                    break L12;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L14: {
                          if (var8 == ((mg) this).field_d) {
                            ll.d(var3_int + -2, -2 + var4, 36, 36, 6, 15252224);
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        L15: {
                          int incrementValue$2 = var6;
                          var6++;
                          if (incrementValue$2 == 7) {
                            break L15;
                          } else {
                            var3_int += 52;
                            if (var10 == 0) {
                              break L6;
                            } else {
                              break L15;
                            }
                          }
                        }
                        L16: {
                          if (!this.a(12, 10)) {
                            stackOut_76_0 = 4;
                            stackIn_77_0 = stackOut_76_0;
                            break L16;
                          } else {
                            stackOut_74_0 = 5;
                            stackIn_77_0 = stackOut_74_0;
                            break L16;
                          }
                        }
                        var9 = stackIn_77_0;
                        var4 -= 52;
                        var3_int = 122 - -(416 - var9 * 52 >> -1424733663);
                        break L6;
                      }
                      var8++;
                      if (var10 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                stackOut_79_0 = param1;
                stackIn_80_0 = stackOut_79_0;
                break L4;
              }
              if (stackIn_80_0 == 17460) {
                L17: {
                  if (((mg) this).field_d > -1) {
                    var7 = ((mg) this).field_d;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  L19: {
                    L20: {
                      if (var7 != -1) {
                        break L20;
                      } else {
                        bk.field_E.b(id.field_a, 320, 302, 0, -1);
                        if (!jj.s(39)) {
                          break L19;
                        } else {
                          bk.field_E.b(hh.field_b, 320, 354, 0, -1);
                          if (var10 == 0) {
                            break L19;
                          } else {
                            break L20;
                          }
                        }
                      }
                    }
                    L21: {
                      L22: {
                        bk.field_E.b(wa.field_k[var7], 320, 224, 0, -1);
                        if ((1 << var7 & var5) != 0) {
                          break L22;
                        } else {
                          bk.field_E.b(kb.field_c, 320, 250, 7, -1);
                          if (var10 == 0) {
                            break L21;
                          } else {
                            break L22;
                          }
                        }
                      }
                      bk.field_E.b(mb.field_a, 320, 250, 0, -1);
                      break L21;
                    }
                    L23: {
                      L24: {
                        if ((var5 & 1 << var7) != 0) {
                          break L24;
                        } else {
                          vj.field_a.e(256, 282);
                          if (var10 == 0) {
                            break L23;
                          } else {
                            break L24;
                          }
                        }
                      }
                      bb.field_b[var7].e(256, 282);
                      break L23;
                    }
                    int discarded$3 = bk.field_E.a(gj.field_b[var7], 50, 302 - bk.field_E.field_G, 201, 1000, 0, -1, 0, 0, 26);
                    var8 = 302;
                    bk.field_E.c(kc.field_a + 100 * rd.field_f[var7], 410, var8, 0, -1);
                    var3_int = 410;
                    var8 += 26;
                    bk.field_E.c(di.field_l, var3_int, var8, 0, -1);
                    var3_int = var3_int + bk.field_E.a(di.field_l);
                    var9 = 0;
                    L25: while (true) {
                      if (rd.field_f[var7] <= var9) {
                        break L19;
                      } else {
                        mc.field_E.e(var3_int, -bk.field_E.field_G + var8);
                        var3_int = var3_int + mc.field_E.field_t / 3;
                        var9++;
                        if (var10 != 0) {
                          break L18;
                        } else {
                          if (var10 == 0) {
                            continue L25;
                          } else {
                            break L19;
                          }
                        }
                      }
                    }
                  }
                  break L18;
                }
                break L0;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var3, "mg.E(" + param0 + ',' + param1 + ')');
        }
    }

    private final int b(int param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int stackIn_95_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_94_0 = 0;
        var4 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 >= 46) {
                break L1;
              } else {
                ((mg) this).field_c = -79;
                break L1;
              }
            }
            L2: {
              var3_int = mf.field_f[((mg) this).field_c][param1];
              if (((mg) this).field_c == 4) {
                L3: {
                  if (rd.field_b == 0) {
                    break L3;
                  } else {
                    L4: {
                      if (param1 == 0) {
                        break L4;
                      } else {
                        if (param1 == 1) {
                          var3_int = 10;
                          if (var4 == 0) {
                            break L2;
                          } else {
                            break L4;
                          }
                        } else {
                          break L2;
                        }
                      }
                    }
                    var3_int = 12;
                    if (var4 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L5: {
                  if (param1 == 0) {
                    break L5;
                  } else {
                    if (param1 != 1) {
                      break L2;
                    } else {
                      var3_int = 12;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                var3_int = 10;
                break L2;
              } else {
                break L2;
              }
            }
            L6: {
              if (5 == ((mg) this).field_c) {
                L7: {
                  if (rd.field_b != 0) {
                    break L7;
                  } else {
                    L8: {
                      if (param1 == 0) {
                        break L8;
                      } else {
                        if (param1 == 1) {
                          var3_int = 12;
                          if (var4 == 0) {
                            break L6;
                          } else {
                            break L8;
                          }
                        } else {
                          break L6;
                        }
                      }
                    }
                    var3_int = 11;
                    if (var4 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                L9: {
                  if (param1 != 0) {
                    break L9;
                  } else {
                    var3_int = 12;
                    if (var4 == 0) {
                      break L6;
                    } else {
                      break L9;
                    }
                  }
                }
                if (param1 != 1) {
                  break L6;
                } else {
                  var3_int = 11;
                  break L6;
                }
              } else {
                break L6;
              }
            }
            L10: {
              if (6 == ((mg) this).field_c) {
                L11: {
                  if (rd.field_b == 0) {
                    break L11;
                  } else {
                    L12: {
                      if (param1 != 0) {
                        break L12;
                      } else {
                        var3_int = 12;
                        if (var4 == 0) {
                          break L10;
                        } else {
                          break L12;
                        }
                      }
                    }
                    if (param1 == 1) {
                      var3_int = 14;
                      if (var4 == 0) {
                        break L10;
                      } else {
                        break L11;
                      }
                    } else {
                      break L10;
                    }
                  }
                }
                L13: {
                  if (param1 != 0) {
                    break L13;
                  } else {
                    var3_int = 14;
                    if (var4 == 0) {
                      break L10;
                    } else {
                      break L13;
                    }
                  }
                }
                if (1 == param1) {
                  var3_int = 12;
                  break L10;
                } else {
                  break L10;
                }
              } else {
                break L10;
              }
            }
            L14: {
              if (((mg) this).field_c == 7) {
                L15: {
                  if (0 == rd.field_b) {
                    break L15;
                  } else {
                    L16: {
                      if (0 == param1) {
                        break L16;
                      } else {
                        if (param1 == 1) {
                          var3_int = 15;
                          if (var4 == 0) {
                            break L14;
                          } else {
                            break L16;
                          }
                        } else {
                          break L14;
                        }
                      }
                    }
                    var3_int = 12;
                    if (var4 == 0) {
                      break L14;
                    } else {
                      break L15;
                    }
                  }
                }
                L17: {
                  if (0 != param1) {
                    break L17;
                  } else {
                    var3_int = 15;
                    if (var4 == 0) {
                      break L14;
                    } else {
                      break L17;
                    }
                  }
                }
                if (1 != param1) {
                  break L14;
                } else {
                  var3_int = 12;
                  break L14;
                }
              } else {
                break L14;
              }
            }
            stackOut_94_0 = var3_int;
            stackIn_95_0 = stackOut_94_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var3, "mg.H(" + param0 + ',' + param1 + ')');
        }
        return stackIn_95_0;
    }

    private final boolean a(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 == 10) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            if (0 == (th.field_l & 1 << param0)) {
              L2: {
                L3: {
                  if (param0 != 12) {
                    break L3;
                  } else {
                    if (!ui.a(0, true)) {
                      stackOut_12_0 = 0;
                      stackIn_13_0 = stackOut_12_0;
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                stackOut_10_0 = 1;
                stackIn_13_0 = stackOut_10_0;
                break L2;
              }
              break L0;
            } else {
              stackOut_4_0 = 1;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var3, "mg.O(" + param0 + ',' + param1 + ')');
        }
        return stackIn_13_0 != 0;
    }

    final void b(int param0) {
        int var2_int = 0;
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
        Object stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int stackIn_43_2 = 0;
        Object stackIn_44_0 = null;
        Object stackIn_45_0 = null;
        Object stackIn_46_0 = null;
        Object stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        int stackIn_105_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_111_0 = 0;
        oh stackIn_137_0 = null;
        oh stackIn_138_0 = null;
        oh stackIn_139_0 = null;
        oh stackIn_140_0 = null;
        int stackIn_140_1 = 0;
        oh stackIn_141_0 = null;
        int stackIn_141_1 = 0;
        oh stackIn_142_0 = null;
        int stackIn_142_1 = 0;
        oh stackIn_143_0 = null;
        int stackIn_143_1 = 0;
        int stackIn_143_2 = 0;
        oh stackIn_144_0 = null;
        int stackIn_144_1 = 0;
        int stackIn_144_2 = 0;
        oh stackIn_145_0 = null;
        int stackIn_145_1 = 0;
        int stackIn_145_2 = 0;
        oh stackIn_146_0 = null;
        int stackIn_146_1 = 0;
        int stackIn_146_2 = 0;
        int stackIn_146_3 = 0;
        oh stackIn_147_0 = null;
        oh stackIn_148_0 = null;
        oh stackIn_149_0 = null;
        int stackIn_149_1 = 0;
        oh stackIn_150_0 = null;
        int stackIn_150_1 = 0;
        oh stackIn_151_0 = null;
        int stackIn_151_1 = 0;
        oh stackIn_152_0 = null;
        int stackIn_152_1 = 0;
        int stackIn_152_2 = 0;
        oh stackIn_153_0 = null;
        int stackIn_153_1 = 0;
        int stackIn_153_2 = 0;
        oh stackIn_154_0 = null;
        int stackIn_154_1 = 0;
        int stackIn_154_2 = 0;
        oh stackIn_155_0 = null;
        int stackIn_155_1 = 0;
        int stackIn_155_2 = 0;
        int stackIn_155_3 = 0;
        oh stackIn_156_0 = null;
        oh stackIn_157_0 = null;
        oh stackIn_158_0 = null;
        int stackIn_158_1 = 0;
        oh stackIn_159_0 = null;
        int stackIn_159_1 = 0;
        int stackIn_159_2 = 0;
        oh stackIn_160_0 = null;
        int stackIn_160_1 = 0;
        int stackIn_160_2 = 0;
        oh stackIn_161_0 = null;
        int stackIn_161_1 = 0;
        int stackIn_161_2 = 0;
        int stackIn_161_3 = 0;
        oh stackIn_162_0 = null;
        int stackIn_162_1 = 0;
        int stackIn_162_2 = 0;
        int stackIn_162_3 = 0;
        oh stackIn_163_0 = null;
        int stackIn_163_1 = 0;
        int stackIn_163_2 = 0;
        int stackIn_163_3 = 0;
        oh stackIn_164_0 = null;
        int stackIn_164_1 = 0;
        int stackIn_164_2 = 0;
        int stackIn_164_3 = 0;
        int stackIn_164_4 = 0;
        Object stackIn_168_0 = null;
        int stackIn_168_1 = 0;
        int stackIn_168_2 = 0;
        int stackIn_171_0 = 0;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int stackOut_42_2 = 0;
        Object stackOut_43_0 = null;
        Object stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        Object stackOut_44_0 = null;
        Object stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        int stackOut_104_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_110_0 = 0;
        oh stackOut_136_0 = null;
        oh stackOut_139_0 = null;
        int stackOut_139_1 = 0;
        oh stackOut_137_0 = null;
        oh stackOut_138_0 = null;
        int stackOut_138_1 = 0;
        oh stackOut_140_0 = null;
        int stackOut_140_1 = 0;
        oh stackOut_142_0 = null;
        int stackOut_142_1 = 0;
        int stackOut_142_2 = 0;
        oh stackOut_141_0 = null;
        int stackOut_141_1 = 0;
        int stackOut_141_2 = 0;
        oh stackOut_143_0 = null;
        int stackOut_143_1 = 0;
        int stackOut_143_2 = 0;
        oh stackOut_145_0 = null;
        int stackOut_145_1 = 0;
        int stackOut_145_2 = 0;
        int stackOut_145_3 = 0;
        oh stackOut_144_0 = null;
        int stackOut_144_1 = 0;
        int stackOut_144_2 = 0;
        int stackOut_144_3 = 0;
        oh stackOut_146_0 = null;
        oh stackOut_148_0 = null;
        int stackOut_148_1 = 0;
        oh stackOut_147_0 = null;
        int stackOut_147_1 = 0;
        oh stackOut_149_0 = null;
        int stackOut_149_1 = 0;
        oh stackOut_151_0 = null;
        int stackOut_151_1 = 0;
        int stackOut_151_2 = 0;
        oh stackOut_150_0 = null;
        int stackOut_150_1 = 0;
        int stackOut_150_2 = 0;
        oh stackOut_152_0 = null;
        int stackOut_152_1 = 0;
        int stackOut_152_2 = 0;
        oh stackOut_154_0 = null;
        int stackOut_154_1 = 0;
        int stackOut_154_2 = 0;
        int stackOut_154_3 = 0;
        oh stackOut_153_0 = null;
        int stackOut_153_1 = 0;
        int stackOut_153_2 = 0;
        int stackOut_153_3 = 0;
        oh stackOut_155_0 = null;
        oh stackOut_157_0 = null;
        int stackOut_157_1 = 0;
        oh stackOut_156_0 = null;
        int stackOut_156_1 = 0;
        oh stackOut_158_0 = null;
        int stackOut_158_1 = 0;
        int stackOut_158_2 = 0;
        oh stackOut_160_0 = null;
        int stackOut_160_1 = 0;
        int stackOut_160_2 = 0;
        int stackOut_160_3 = 0;
        oh stackOut_159_0 = null;
        int stackOut_159_1 = 0;
        int stackOut_159_2 = 0;
        int stackOut_159_3 = 0;
        oh stackOut_161_0 = null;
        int stackOut_161_1 = 0;
        int stackOut_161_2 = 0;
        int stackOut_161_3 = 0;
        oh stackOut_163_0 = null;
        int stackOut_163_1 = 0;
        int stackOut_163_2 = 0;
        int stackOut_163_3 = 0;
        int stackOut_163_4 = 0;
        oh stackOut_162_0 = null;
        int stackOut_162_1 = 0;
        int stackOut_162_2 = 0;
        int stackOut_162_3 = 0;
        int stackOut_162_4 = 0;
        Object stackOut_167_0 = null;
        int stackOut_167_1 = 0;
        int stackOut_167_2 = 0;
        int stackOut_170_0 = 0;
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
                      L3: {
                        if (((mg) this).field_c != 15) {
                          break L3;
                        } else {
                          cl.a(nd.field_L, 37, 254, 118, 566, 4);
                          if (var14 == 0) {
                            break L0;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L4: {
                        L5: {
                          if (((mg) this).field_c == 8) {
                            break L5;
                          } else {
                            if (((mg) this).field_c == 9) {
                              break L5;
                            } else {
                              if (16 != ((mg) this).field_c) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        cl.a(nd.field_L, 102, 124, 56, 436, 4);
                        cl.a(nd.field_L, 11, 280, 194, 618, 4);
                        if (var14 == 0) {
                          break L0;
                        } else {
                          break L4;
                        }
                      }
                      L6: {
                        if (null != he.field_f[((mg) this).field_c]) {
                          break L6;
                        } else {
                          cl.a(nd.field_L, 11, 436, 38, 618, 4);
                          if (var14 == 0) {
                            break L0;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        cl.a(ha.field_m, 11, 436, 38, 618, 4);
                        if (((mg) this).field_c == 10) {
                          break L7;
                        } else {
                          if (((mg) this).field_c != 11) {
                            break L0;
                          } else {
                            break L7;
                          }
                        }
                      }
                      ll.e(19, 384, 621, 466);
                      cl.a(nd.field_L, 11, 436, 38, 618, param0 ^ -5);
                      ll.d();
                      if (var14 == 0) {
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                cl.a(nd.field_L, -10 + this.e((byte) 62), 20 + mf.field_f[((mg) this).field_c].length * mf.field_d[((mg) this).field_c], -10 + mf.field_h[((mg) this).field_c], 176, 4);
                cl.a(nd.field_L, 349, 410, 52 - -bk.field_E.field_u, 212, 4);
                if (var14 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          cl.a(ha.field_m, 6, 436, 38, 436, 4);
          cl.a(nd.field_L, 457, 124, 10, 176, param0 ^ -5);
          cl.a(nd.field_L, 457, mf.field_f[((mg) this).field_c].length * 26 - -20, 219, 176, param0 ^ -5);
          break L0;
        }
        L8: {
          if (null != he.field_f[((mg) this).field_c]) {
            he.field_f[((mg) this).field_c].a(true);
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          L10: {
            if (((mg) this).field_c == 12) {
              break L10;
            } else {
              if (13 != ((mg) this).field_c) {
                break L9;
              } else {
                break L10;
              }
            }
          }
          ua.field_L.a(false);
          break L9;
        }
        var2_int = this.e((byte) 59);
        var3 = mf.field_h[((mg) this).field_c];
        var4 = 0;
        if (param0 == -1) {
          L11: while (true) {
            L12: {
              L13: {
                L14: {
                  L15: {
                    L16: {
                      if (mf.field_f[((mg) this).field_c].length <= var4) {
                        break L16;
                      } else {
                        stackOut_42_0 = this;
                        stackOut_42_1 = ~var4;
                        stackOut_42_2 = ~((mg) this).field_e.field_e;
                        stackIn_168_0 = stackOut_42_0;
                        stackIn_168_1 = stackOut_42_1;
                        stackIn_168_2 = stackOut_42_2;
                        stackIn_43_0 = stackOut_42_0;
                        stackIn_43_1 = stackOut_42_1;
                        stackIn_43_2 = stackOut_42_2;
                        if (var14 != 0) {
                          break L15;
                        } else {
                          L17: {
                            stackOut_43_0 = this;
                            stackIn_46_0 = stackOut_43_0;
                            stackIn_44_0 = stackOut_43_0;
                            if (stackIn_43_1 != stackIn_43_2) {
                              stackOut_46_0 = this;
                              stackOut_46_1 = 0;
                              stackIn_47_0 = stackOut_46_0;
                              stackIn_47_1 = stackOut_46_1;
                              break L17;
                            } else {
                              stackOut_44_0 = this;
                              stackIn_45_0 = stackOut_44_0;
                              stackOut_45_0 = this;
                              stackOut_45_1 = 1;
                              stackIn_47_0 = stackOut_45_0;
                              stackIn_47_1 = stackOut_45_1;
                              break L17;
                            }
                          }
                          L18: {
                            L19: {
                              this.a(stackIn_47_1 != 0, var2_int, var3, var4, 1);
                              if (!mf.field_i[((mg) this).field_c]) {
                                break L19;
                              } else {
                                var2_int = var2_int + mf.field_d[((mg) this).field_c];
                                if (var14 == 0) {
                                  break L18;
                                } else {
                                  break L19;
                                }
                              }
                            }
                            var3 = var3 + mf.field_d[((mg) this).field_c];
                            break L18;
                          }
                          L20: {
                            if (((mg) this).field_c != 11) {
                              break L20;
                            } else {
                              if (2 == var4) {
                                var2_int = var2_int - (mf.field_d[((mg) this).field_c] << -1492965471);
                                var3 = var3 + mf.field_b[((mg) this).field_c];
                                break L20;
                              } else {
                                break L20;
                              }
                            }
                          }
                          var4++;
                          if (var14 == 0) {
                            continue L11;
                          } else {
                            break L16;
                          }
                        }
                      }
                    }
                    L21: {
                      L22: {
                        if (((mg) this).field_c == 0) {
                          break L22;
                        } else {
                          if (((mg) this).field_c != 1) {
                            break L21;
                          } else {
                            break L22;
                          }
                        }
                      }
                      al.field_z[0].e(640 - al.field_z[0].field_t >> 925900033, 1);
                      if (var14 == 0) {
                        break L13;
                      } else {
                        break L21;
                      }
                    }
                    L23: {
                      L24: {
                        if (((mg) this).field_c == 13) {
                          break L24;
                        } else {
                          if (((mg) this).field_c != 12) {
                            break L23;
                          } else {
                            break L24;
                          }
                        }
                      }
                      al.field_z[0].e(41, 1);
                      if (var14 == 0) {
                        break L13;
                      } else {
                        break L23;
                      }
                    }
                    if (10 == ((mg) this).field_c) {
                      break L14;
                    } else {
                      if (11 == ((mg) this).field_c) {
                        break L14;
                      } else {
                        L25: {
                          if (((mg) this).field_c == 8) {
                            break L25;
                          } else {
                            if (9 == ((mg) this).field_c) {
                              break L25;
                            } else {
                              L26: {
                                if (((mg) this).field_c == 16) {
                                  break L26;
                                } else {
                                  L27: {
                                    if (((mg) this).field_c == 15) {
                                      break L27;
                                    } else {
                                      L28: {
                                        L29: {
                                          if (((mg) this).field_c == 4) {
                                            break L29;
                                          } else {
                                            if (5 == ((mg) this).field_c) {
                                              break L29;
                                            } else {
                                              if (((mg) this).field_c == 6) {
                                                break L29;
                                              } else {
                                                if (((mg) this).field_c != 7) {
                                                  break L28;
                                                } else {
                                                  break L29;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        this.c((byte) -114);
                                        if (var14 == 0) {
                                          break L13;
                                        } else {
                                          break L28;
                                        }
                                      }
                                      L30: {
                                        L31: {
                                          if (((mg) this).field_c == 2) {
                                            break L31;
                                          } else {
                                            if (((mg) this).field_c != 3) {
                                              break L30;
                                            } else {
                                              break L31;
                                            }
                                          }
                                        }
                                        L32: {
                                          L33: {
                                            al.field_z[3].e(-al.field_z[3].field_t + 640 >> 1740189665, 1);
                                            if (~qh.field_b.field_x < ~(1 + pc.field_i)) {
                                              break L33;
                                            } else {
                                              qh.field_b.a(100, (byte) -127, 67);
                                              fd.field_d.e(-367, -162);
                                              if (var14 == 0) {
                                                break L32;
                                              } else {
                                                break L33;
                                              }
                                            }
                                          }
                                          L34: {
                                            cl.a(nd.field_L, 90, 254, 57, 176, 4);
                                            if (!jj.s(param0 + 54)) {
                                              var4_ref_String = kk.field_a;
                                              break L34;
                                            } else {
                                              var4_ref_String = lj.field_f;
                                              break L34;
                                            }
                                          }
                                          int discarded$1 = bk.field_E.a(var4_ref_String, 100, 67, 156, 234, 0, -1, 1, 1, 26);
                                          break L32;
                                        }
                                        L35: {
                                          cl.a(nd.field_L, 566, 46, 57, 46, param0 + 5);
                                          if (tc.field_b != 0) {
                                            stackOut_104_0 = 15252224;
                                            stackIn_105_0 = stackOut_104_0;
                                            break L35;
                                          } else {
                                            stackOut_103_0 = 8110658;
                                            stackIn_105_0 = stackOut_103_0;
                                            break L35;
                                          }
                                        }
                                        L36: {
                                          var4 = stackIn_105_0;
                                          ii.field_r[52].c(576, 67, var4);
                                          cl.a(nd.field_L, 566, 46, 421, 46, 4);
                                          if (tc.field_b != 1) {
                                            stackOut_107_0 = 15252224;
                                            stackIn_108_0 = stackOut_107_0;
                                            break L36;
                                          } else {
                                            stackOut_106_0 = 8110658;
                                            stackIn_108_0 = stackOut_106_0;
                                            break L36;
                                          }
                                        }
                                        var4 = stackIn_108_0;
                                        ii.field_r[53].c(576, 431, var4);
                                        var5 = (Object) (Object) this.a(kf.field_b, 2600, fg.field_a);
                                        var6 = 269 - (-(26 * (1 - qh.field_b.field_x)) - mb.field_b);
                                        var7 = 359;
                                        var8 = 62 + bk.field_E.field_u;
                                        ll.e(var7, var8, var7 + 182 - -10, var8 + 390);
                                        var9 = gj.field_f;
                                        var10 = 0;
                                        L37: while (true) {
                                          L38: {
                                            if (var9.length <= var10) {
                                              break L38;
                                            } else {
                                              var11 = var9[var10];
                                              var12 = var11.field_q;
                                              stackOut_110_0 = ~var11.field_x;
                                              stackIn_171_0 = stackOut_110_0;
                                              stackIn_111_0 = stackOut_110_0;
                                              if (var14 != 0) {
                                                break L12;
                                              } else {
                                                L39: {
                                                  if (stackIn_111_0 >= ~(pc.field_i + 1)) {
                                                    break L39;
                                                  } else {
                                                    var12 = qg.field_a;
                                                    break L39;
                                                  }
                                                }
                                                L40: {
                                                  var13 = 0;
                                                  if (var11 == qh.field_b) {
                                                    var13 = 6;
                                                    break L40;
                                                  } else {
                                                    break L40;
                                                  }
                                                }
                                                L41: {
                                                  if (((mg) this).field_e.field_a) {
                                                    break L41;
                                                  } else {
                                                    if (((mg) this).field_e.field_e != -1) {
                                                      break L41;
                                                    } else {
                                                      if (tc.field_b != 2) {
                                                        break L41;
                                                      } else {
                                                        if (var11 == qh.field_b) {
                                                          var13 = 1;
                                                          break L41;
                                                        } else {
                                                          break L41;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                L42: {
                                                  if (!((mg) this).field_e.field_a) {
                                                    break L42;
                                                  } else {
                                                    if (var5 != (Object) (Object) var11) {
                                                      break L42;
                                                    } else {
                                                      var13 = 1;
                                                      break L42;
                                                    }
                                                  }
                                                }
                                                bk.field_E.c(var12, 390, var6, var13, -1);
                                                bk.field_E.a(var11.field_x + ". ", 390, var6, var13, -1);
                                                var6 += 26;
                                                var10++;
                                                if (var14 == 0) {
                                                  continue L37;
                                                } else {
                                                  break L38;
                                                }
                                              }
                                            }
                                          }
                                          ll.d();
                                          if (var14 == 0) {
                                            break L13;
                                          } else {
                                            break L30;
                                          }
                                        }
                                      }
                                      if (((mg) this).field_c == 14) {
                                        var4 = 154 - (-bk.field_E.field_G - -2);
                                        bk.field_E.b(ui.field_n, 320, var4, 5, -1);
                                        if (var14 == 0) {
                                          break L13;
                                        } else {
                                          break L27;
                                        }
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  L43: {
                                    al.field_z[0].e(-al.field_z[0].field_t + 640 >> -1474222623, 1);
                                    bk.field_E.b(qg.field_b, 320, bk.field_E.field_G + 154, 5, -1);
                                    stackOut_136_0 = bk.field_E;
                                    stackIn_139_0 = stackOut_136_0;
                                    stackIn_137_0 = stackOut_136_0;
                                    if (0 == oe.field_e) {
                                      stackOut_139_0 = (oh) (Object) stackIn_139_0;
                                      stackOut_139_1 = 0;
                                      stackIn_140_0 = stackOut_139_0;
                                      stackIn_140_1 = stackOut_139_1;
                                      break L43;
                                    } else {
                                      stackOut_137_0 = (oh) (Object) stackIn_137_0;
                                      stackIn_138_0 = stackOut_137_0;
                                      stackOut_138_0 = (oh) (Object) stackIn_138_0;
                                      stackOut_138_1 = 1;
                                      stackIn_140_0 = stackOut_138_0;
                                      stackIn_140_1 = stackOut_138_1;
                                      break L43;
                                    }
                                  }
                                  L44: {
                                    stackOut_140_0 = (oh) (Object) stackIn_140_0;
                                    stackOut_140_1 = stackIn_140_1;
                                    stackIn_142_0 = stackOut_140_0;
                                    stackIn_142_1 = stackOut_140_1;
                                    stackIn_141_0 = stackOut_140_0;
                                    stackIn_141_1 = stackOut_140_1;
                                    if (0 == ua.field_L.field_O) {
                                      stackOut_142_0 = (oh) (Object) stackIn_142_0;
                                      stackOut_142_1 = stackIn_142_1;
                                      stackOut_142_2 = 0;
                                      stackIn_143_0 = stackOut_142_0;
                                      stackIn_143_1 = stackOut_142_1;
                                      stackIn_143_2 = stackOut_142_2;
                                      break L44;
                                    } else {
                                      stackOut_141_0 = (oh) (Object) stackIn_141_0;
                                      stackOut_141_1 = stackIn_141_1;
                                      stackOut_141_2 = 1;
                                      stackIn_143_0 = stackOut_141_0;
                                      stackIn_143_1 = stackOut_141_1;
                                      stackIn_143_2 = stackOut_141_2;
                                      break L44;
                                    }
                                  }
                                  L45: {
                                    stackOut_143_0 = (oh) (Object) stackIn_143_0;
                                    stackOut_143_1 = stackIn_143_1;
                                    stackOut_143_2 = stackIn_143_2;
                                    stackIn_145_0 = stackOut_143_0;
                                    stackIn_145_1 = stackOut_143_1;
                                    stackIn_145_2 = stackOut_143_2;
                                    stackIn_144_0 = stackOut_143_0;
                                    stackIn_144_1 = stackOut_143_1;
                                    stackIn_144_2 = stackOut_143_2;
                                    if (0 == ua.field_L.field_O) {
                                      stackOut_145_0 = (oh) (Object) stackIn_145_0;
                                      stackOut_145_1 = stackIn_145_1;
                                      stackOut_145_2 = stackIn_145_2;
                                      stackOut_145_3 = 0;
                                      stackIn_146_0 = stackOut_145_0;
                                      stackIn_146_1 = stackOut_145_1;
                                      stackIn_146_2 = stackOut_145_2;
                                      stackIn_146_3 = stackOut_145_3;
                                      break L45;
                                    } else {
                                      stackOut_144_0 = (oh) (Object) stackIn_144_0;
                                      stackOut_144_1 = stackIn_144_1;
                                      stackOut_144_2 = stackIn_144_2;
                                      stackOut_144_3 = 1;
                                      stackIn_146_0 = stackOut_144_0;
                                      stackIn_146_1 = stackOut_144_1;
                                      stackIn_146_2 = stackOut_144_2;
                                      stackIn_146_3 = stackOut_144_3;
                                      break L45;
                                    }
                                  }
                                  L46: {
                                    ((oh) (Object) stackIn_146_0).b(vj.a(stackIn_146_1 != 0, stackIn_146_2 != 0, stackIn_146_3 != 0, 118), 320, 180 + bk.field_E.field_G, 5, -1);
                                    stackOut_146_0 = bk.field_E;
                                    stackIn_148_0 = stackOut_146_0;
                                    stackIn_147_0 = stackOut_146_0;
                                    if (0 == ua.field_L.field_O) {
                                      stackOut_148_0 = (oh) (Object) stackIn_148_0;
                                      stackOut_148_1 = 0;
                                      stackIn_149_0 = stackOut_148_0;
                                      stackIn_149_1 = stackOut_148_1;
                                      break L46;
                                    } else {
                                      stackOut_147_0 = (oh) (Object) stackIn_147_0;
                                      stackOut_147_1 = 1;
                                      stackIn_149_0 = stackOut_147_0;
                                      stackIn_149_1 = stackOut_147_1;
                                      break L46;
                                    }
                                  }
                                  L47: {
                                    stackOut_149_0 = (oh) (Object) stackIn_149_0;
                                    stackOut_149_1 = stackIn_149_1;
                                    stackIn_151_0 = stackOut_149_0;
                                    stackIn_151_1 = stackOut_149_1;
                                    stackIn_150_0 = stackOut_149_0;
                                    stackIn_150_1 = stackOut_149_1;
                                    if (oe.field_e == 0) {
                                      stackOut_151_0 = (oh) (Object) stackIn_151_0;
                                      stackOut_151_1 = stackIn_151_1;
                                      stackOut_151_2 = 0;
                                      stackIn_152_0 = stackOut_151_0;
                                      stackIn_152_1 = stackOut_151_1;
                                      stackIn_152_2 = stackOut_151_2;
                                      break L47;
                                    } else {
                                      stackOut_150_0 = (oh) (Object) stackIn_150_0;
                                      stackOut_150_1 = stackIn_150_1;
                                      stackOut_150_2 = 1;
                                      stackIn_152_0 = stackOut_150_0;
                                      stackIn_152_1 = stackOut_150_1;
                                      stackIn_152_2 = stackOut_150_2;
                                      break L47;
                                    }
                                  }
                                  L48: {
                                    stackOut_152_0 = (oh) (Object) stackIn_152_0;
                                    stackOut_152_1 = stackIn_152_1;
                                    stackOut_152_2 = stackIn_152_2;
                                    stackIn_154_0 = stackOut_152_0;
                                    stackIn_154_1 = stackOut_152_1;
                                    stackIn_154_2 = stackOut_152_2;
                                    stackIn_153_0 = stackOut_152_0;
                                    stackIn_153_1 = stackOut_152_1;
                                    stackIn_153_2 = stackOut_152_2;
                                    if (ua.field_L.field_O == 0) {
                                      stackOut_154_0 = (oh) (Object) stackIn_154_0;
                                      stackOut_154_1 = stackIn_154_1;
                                      stackOut_154_2 = stackIn_154_2;
                                      stackOut_154_3 = 0;
                                      stackIn_155_0 = stackOut_154_0;
                                      stackIn_155_1 = stackOut_154_1;
                                      stackIn_155_2 = stackOut_154_2;
                                      stackIn_155_3 = stackOut_154_3;
                                      break L48;
                                    } else {
                                      stackOut_153_0 = (oh) (Object) stackIn_153_0;
                                      stackOut_153_1 = stackIn_153_1;
                                      stackOut_153_2 = stackIn_153_2;
                                      stackOut_153_3 = 1;
                                      stackIn_155_0 = stackOut_153_0;
                                      stackIn_155_1 = stackOut_153_1;
                                      stackIn_155_2 = stackOut_153_2;
                                      stackIn_155_3 = stackOut_153_3;
                                      break L48;
                                    }
                                  }
                                  L49: {
                                    ((oh) (Object) stackIn_155_0).b(fc.a(stackIn_155_1 != 0, stackIn_155_2 != 0, stackIn_155_3 != 0, 12105912), 320, bk.field_E.field_G + 258, 5, -1);
                                    stackOut_155_0 = bk.field_E;
                                    stackIn_157_0 = stackOut_155_0;
                                    stackIn_156_0 = stackOut_155_0;
                                    if (ua.field_L.field_O == 0) {
                                      stackOut_157_0 = (oh) (Object) stackIn_157_0;
                                      stackOut_157_1 = 0;
                                      stackIn_158_0 = stackOut_157_0;
                                      stackIn_158_1 = stackOut_157_1;
                                      break L49;
                                    } else {
                                      stackOut_156_0 = (oh) (Object) stackIn_156_0;
                                      stackOut_156_1 = 1;
                                      stackIn_158_0 = stackOut_156_0;
                                      stackIn_158_1 = stackOut_156_1;
                                      break L49;
                                    }
                                  }
                                  L50: {
                                    stackOut_158_0 = (oh) (Object) stackIn_158_0;
                                    stackOut_158_1 = stackIn_158_1;
                                    stackOut_158_2 = -98;
                                    stackIn_160_0 = stackOut_158_0;
                                    stackIn_160_1 = stackOut_158_1;
                                    stackIn_160_2 = stackOut_158_2;
                                    stackIn_159_0 = stackOut_158_0;
                                    stackIn_159_1 = stackOut_158_1;
                                    stackIn_159_2 = stackOut_158_2;
                                    if (oe.field_e == 0) {
                                      stackOut_160_0 = (oh) (Object) stackIn_160_0;
                                      stackOut_160_1 = stackIn_160_1;
                                      stackOut_160_2 = stackIn_160_2;
                                      stackOut_160_3 = 0;
                                      stackIn_161_0 = stackOut_160_0;
                                      stackIn_161_1 = stackOut_160_1;
                                      stackIn_161_2 = stackOut_160_2;
                                      stackIn_161_3 = stackOut_160_3;
                                      break L50;
                                    } else {
                                      stackOut_159_0 = (oh) (Object) stackIn_159_0;
                                      stackOut_159_1 = stackIn_159_1;
                                      stackOut_159_2 = stackIn_159_2;
                                      stackOut_159_3 = 1;
                                      stackIn_161_0 = stackOut_159_0;
                                      stackIn_161_1 = stackOut_159_1;
                                      stackIn_161_2 = stackOut_159_2;
                                      stackIn_161_3 = stackOut_159_3;
                                      break L50;
                                    }
                                  }
                                  L51: {
                                    stackOut_161_0 = (oh) (Object) stackIn_161_0;
                                    stackOut_161_1 = stackIn_161_1;
                                    stackOut_161_2 = stackIn_161_2;
                                    stackOut_161_3 = stackIn_161_3;
                                    stackIn_163_0 = stackOut_161_0;
                                    stackIn_163_1 = stackOut_161_1;
                                    stackIn_163_2 = stackOut_161_2;
                                    stackIn_163_3 = stackOut_161_3;
                                    stackIn_162_0 = stackOut_161_0;
                                    stackIn_162_1 = stackOut_161_1;
                                    stackIn_162_2 = stackOut_161_2;
                                    stackIn_162_3 = stackOut_161_3;
                                    if (ua.field_L.field_O == 0) {
                                      stackOut_163_0 = (oh) (Object) stackIn_163_0;
                                      stackOut_163_1 = stackIn_163_1;
                                      stackOut_163_2 = stackIn_163_2;
                                      stackOut_163_3 = stackIn_163_3;
                                      stackOut_163_4 = 0;
                                      stackIn_164_0 = stackOut_163_0;
                                      stackIn_164_1 = stackOut_163_1;
                                      stackIn_164_2 = stackOut_163_2;
                                      stackIn_164_3 = stackOut_163_3;
                                      stackIn_164_4 = stackOut_163_4;
                                      break L51;
                                    } else {
                                      stackOut_162_0 = (oh) (Object) stackIn_162_0;
                                      stackOut_162_1 = stackIn_162_1;
                                      stackOut_162_2 = stackIn_162_2;
                                      stackOut_162_3 = stackIn_162_3;
                                      stackOut_162_4 = 1;
                                      stackIn_164_0 = stackOut_162_0;
                                      stackIn_164_1 = stackOut_162_1;
                                      stackIn_164_2 = stackOut_162_2;
                                      stackIn_164_3 = stackOut_162_3;
                                      stackIn_164_4 = stackOut_162_4;
                                      break L51;
                                    }
                                  }
                                  ((oh) (Object) stackIn_164_0).b(qc.a(stackIn_164_1 != 0, (byte) stackIn_164_2, stackIn_164_3 != 0, stackIn_164_4 != 0), 320, bk.field_E.field_G + 310, 5, -1);
                                  if (var14 == 0) {
                                    break L13;
                                  } else {
                                    break L26;
                                  }
                                }
                              }
                              al.field_z[5].e(640 + -al.field_z[5].field_t >> -1075713119, 1);
                              this.a(true, param0 + 17461);
                              if (var14 == 0) {
                                break L13;
                              } else {
                                break L25;
                              }
                            }
                          }
                        }
                        al.field_z[1].e(-al.field_z[1].field_t + 640 >> 1123523329, 1);
                        stackOut_167_0 = this;
                        stackOut_167_1 = 0;
                        stackOut_167_2 = 17460;
                        stackIn_168_0 = stackOut_167_0;
                        stackIn_168_1 = stackOut_167_1;
                        stackIn_168_2 = stackOut_167_2;
                        break L15;
                      }
                    }
                  }
                  this.a(stackIn_168_1 != 0, stackIn_168_2);
                  if (var14 == 0) {
                    break L13;
                  } else {
                    break L14;
                  }
                }
                al.field_z[4].e(-al.field_z[4].field_t + 640 >> -491699583, 1);
                this.d(-25);
                break L13;
              }
              stackOut_170_0 = g.g(1);
              stackIn_171_0 = stackOut_170_0;
              break L12;
            }
            L52: {
              var4 = stackIn_171_0;
              var5 = null;
              if (23 != var4) {
                break L52;
              } else {
                var5 = (Object) (Object) vi.field_a;
                break L52;
              }
            }
            L53: {
              if (var4 == 24) {
                var5 = (Object) (Object) id.field_i;
                break L53;
              } else {
                break L53;
              }
            }
            L54: {
              if (var4 == 25) {
                var5 = (Object) (Object) ud.field_b;
                break L54;
              } else {
                break L54;
              }
            }
            L55: {
              if (null != var5) {
                vl.a(-21173, (String) var5);
                break L55;
              } else {
                break L55;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    private final void a(boolean param0, boolean param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_138_0 = 0;
        int stackIn_261_0 = 0;
        int stackIn_262_0 = 0;
        int stackIn_263_0 = 0;
        int stackIn_263_1 = 0;
        int stackIn_284_0 = 0;
        int stackIn_285_0 = 0;
        int stackIn_286_0 = 0;
        int stackIn_287_0 = 0;
        int stackIn_287_1 = 0;
        int stackOut_137_0 = 0;
        int stackOut_136_0 = 0;
        int stackOut_260_0 = 0;
        int stackOut_262_0 = 0;
        int stackOut_262_1 = 0;
        int stackOut_261_0 = 0;
        int stackOut_261_1 = 0;
        int stackOut_283_0 = 0;
        int stackOut_286_0 = 0;
        int stackOut_286_1 = 0;
        int stackOut_284_0 = 0;
        int stackOut_285_0 = 0;
        int stackOut_285_1 = 0;
        L0: {
          var8 = TrackController.field_F ? 1 : 0;
          var5_int = this.b(121, param2);
          if (this.a((byte) 67, var5_int)) {
            break L0;
          } else {
            if (var5_int == 13) {
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
          var6 = var5_int;
          if (var6 == 0) {
            if (!((mg) this).field_e.b(false)) {
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
              L4: {
                if (((mg) this).field_c != 0) {
                  break L4;
                } else {
                  sc.field_g = 2;
                  if (var8 == 0) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (((mg) this).field_c != 1) {
                  break L5;
                } else {
                  sc.field_g = 3;
                  if (var8 == 0) {
                    break L2;
                  } else {
                    break L5;
                  }
                }
              }
              throw new RuntimeException();
            }
          } else {
            L6: {
              L7: {
                L8: {
                  L9: {
                    L10: {
                      L11: {
                        L12: {
                          L13: {
                            L14: {
                              L15: {
                                L16: {
                                  L17: {
                                    L18: {
                                      L19: {
                                        L20: {
                                          L21: {
                                            L22: {
                                              L23: {
                                                L24: {
                                                  L25: {
                                                    L26: {
                                                      L27: {
                                                        L28: {
                                                          L29: {
                                                            L30: {
                                                              L31: {
                                                                L32: {
                                                                  if (var6 == 1) {
                                                                    if (!((mg) this).field_e.b(false)) {
                                                                      break L2;
                                                                    } else {
                                                                      si.a((byte) -68, 5);
                                                                      rk.field_bb = null;
                                                                      g.field_w = null;
                                                                      ua.field_L = new ri();
                                                                      oe.field_e = 0;
                                                                      sc.field_g = -1;
                                                                      if (var8 == 0) {
                                                                        break L2;
                                                                      } else {
                                                                        break L32;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    L33: {
                                                                      if (13 != var6) {
                                                                        break L33;
                                                                      } else {
                                                                        if (var8 == 0) {
                                                                          break L32;
                                                                        } else {
                                                                          break L33;
                                                                        }
                                                                      }
                                                                    }
                                                                    if (var6 == 4) {
                                                                      break L31;
                                                                    } else {
                                                                      L34: {
                                                                        if (21 != var6) {
                                                                          break L34;
                                                                        } else {
                                                                          if (var8 == 0) {
                                                                            break L30;
                                                                          } else {
                                                                            break L34;
                                                                          }
                                                                        }
                                                                      }
                                                                      L35: {
                                                                        if (22 != var6) {
                                                                          break L35;
                                                                        } else {
                                                                          if (var8 == 0) {
                                                                            break L29;
                                                                          } else {
                                                                            break L35;
                                                                          }
                                                                        }
                                                                      }
                                                                      if (var6 == 26) {
                                                                        break L28;
                                                                      } else {
                                                                        if (var6 == 14) {
                                                                          break L27;
                                                                        } else {
                                                                          if (var6 == 15) {
                                                                            break L26;
                                                                          } else {
                                                                            if (var6 == 23) {
                                                                              break L25;
                                                                            } else {
                                                                              L36: {
                                                                                if (var6 != 24) {
                                                                                  break L36;
                                                                                } else {
                                                                                  if (var8 == 0) {
                                                                                    break L24;
                                                                                  } else {
                                                                                    break L36;
                                                                                  }
                                                                                }
                                                                              }
                                                                              L37: {
                                                                                if (var6 != 25) {
                                                                                  break L37;
                                                                                } else {
                                                                                  if (var8 == 0) {
                                                                                    break L23;
                                                                                  } else {
                                                                                    break L37;
                                                                                  }
                                                                                }
                                                                              }
                                                                              L38: {
                                                                                if (6 != var6) {
                                                                                  break L38;
                                                                                } else {
                                                                                  if (var8 == 0) {
                                                                                    break L22;
                                                                                  } else {
                                                                                    break L38;
                                                                                  }
                                                                                }
                                                                              }
                                                                              L39: {
                                                                                if (var6 != 7) {
                                                                                  break L39;
                                                                                } else {
                                                                                  if (var8 == 0) {
                                                                                    break L21;
                                                                                  } else {
                                                                                    break L39;
                                                                                  }
                                                                                }
                                                                              }
                                                                              L40: {
                                                                                if (var6 != 8) {
                                                                                  break L40;
                                                                                } else {
                                                                                  if (var8 == 0) {
                                                                                    break L20;
                                                                                  } else {
                                                                                    break L40;
                                                                                  }
                                                                                }
                                                                              }
                                                                              if (9 == var6) {
                                                                                break L19;
                                                                              } else {
                                                                                L41: {
                                                                                  if (10 != var6) {
                                                                                    break L41;
                                                                                  } else {
                                                                                    if (var8 == 0) {
                                                                                      break L18;
                                                                                    } else {
                                                                                      break L41;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L42: {
                                                                                  if (var6 != 11) {
                                                                                    break L42;
                                                                                  } else {
                                                                                    if (var8 == 0) {
                                                                                      break L17;
                                                                                    } else {
                                                                                      break L42;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L43: {
                                                                                  if (var6 != 20) {
                                                                                    break L43;
                                                                                  } else {
                                                                                    if (var8 == 0) {
                                                                                      break L16;
                                                                                    } else {
                                                                                      break L43;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L44: {
                                                                                  if (var6 != 28) {
                                                                                    break L44;
                                                                                  } else {
                                                                                    if (var8 == 0) {
                                                                                      break L15;
                                                                                    } else {
                                                                                      break L44;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L45: {
                                                                                  if (12 != var6) {
                                                                                    break L45;
                                                                                  } else {
                                                                                    if (var8 == 0) {
                                                                                      break L14;
                                                                                    } else {
                                                                                      break L45;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L46: {
                                                                                  if (var6 != 17) {
                                                                                    break L46;
                                                                                  } else {
                                                                                    if (var8 == 0) {
                                                                                      break L13;
                                                                                    } else {
                                                                                      break L46;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L47: {
                                                                                  if (var6 != 18) {
                                                                                    break L47;
                                                                                  } else {
                                                                                    if (var8 == 0) {
                                                                                      break L12;
                                                                                    } else {
                                                                                      break L47;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                if (19 == var6) {
                                                                                  break L11;
                                                                                } else {
                                                                                  L48: {
                                                                                    if (var6 != 16) {
                                                                                      break L48;
                                                                                    } else {
                                                                                      if (var8 == 0) {
                                                                                        break L10;
                                                                                      } else {
                                                                                        break L48;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  if (var6 == 5) {
                                                                                    break L9;
                                                                                  } else {
                                                                                    if (var6 == 27) {
                                                                                      break L8;
                                                                                    } else {
                                                                                      if (var6 == 2) {
                                                                                        break L7;
                                                                                      } else {
                                                                                        if (var6 == 3) {
                                                                                          break L6;
                                                                                        } else {
                                                                                          break L2;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                                if (((mg) this).field_e.b(false)) {
                                                                  L49: {
                                                                    si.a((byte) -68, 5);
                                                                    if (og.field_rb == null) {
                                                                      break L49;
                                                                    } else {
                                                                      oj.a(-127);
                                                                      if (var8 == 0) {
                                                                        break L2;
                                                                      } else {
                                                                        break L49;
                                                                      }
                                                                    }
                                                                  }
                                                                  var6 = param1 ? 1 : 0;
                                                                  oi.a(26, gb.field_l, 26, bk.field_E, bk.field_E, 10, 320, 20, 240, gb.field_l, -3748, var6 != 0, 18, 0, 0);
                                                                  if (var8 == 0) {
                                                                    break L2;
                                                                  } else {
                                                                    break L31;
                                                                  }
                                                                } else {
                                                                  break L2;
                                                                }
                                                              }
                                                              if (!((mg) this).field_e.b(false)) {
                                                                break L2;
                                                              } else {
                                                                si.a((byte) -68, 5);
                                                                sc.field_g = -1;
                                                                if (var8 == 0) {
                                                                  break L2;
                                                                } else {
                                                                  break L30;
                                                                }
                                                              }
                                                            }
                                                            if (!((mg) this).field_e.b(false)) {
                                                              break L2;
                                                            } else {
                                                              si.a((byte) -68, 5);
                                                              sc.field_g = 10;
                                                              if (var8 == 0) {
                                                                break L2;
                                                              } else {
                                                                break L29;
                                                              }
                                                            }
                                                          }
                                                          if (((mg) this).field_e.b(false)) {
                                                            si.a((byte) -68, 5);
                                                            sc.field_g = 11;
                                                            if (var8 == 0) {
                                                              break L2;
                                                            } else {
                                                              break L28;
                                                            }
                                                          } else {
                                                            break L2;
                                                          }
                                                        }
                                                        if (((mg) this).field_e.b(false)) {
                                                          L50: {
                                                            si.a((byte) -68, 5);
                                                            if (fi.field_i) {
                                                              stackOut_137_0 = 0;
                                                              stackIn_138_0 = stackOut_137_0;
                                                              break L50;
                                                            } else {
                                                              stackOut_136_0 = 1;
                                                              stackIn_138_0 = stackOut_136_0;
                                                              break L50;
                                                            }
                                                          }
                                                          fi.field_i = stackIn_138_0 != 0;
                                                          if (var8 == 0) {
                                                            break L2;
                                                          } else {
                                                            break L27;
                                                          }
                                                        } else {
                                                          break L2;
                                                        }
                                                      }
                                                      if (!((mg) this).field_e.b(false)) {
                                                        break L2;
                                                      } else {
                                                        si.a((byte) -68, 5);
                                                        sc.field_g = 12;
                                                        if (var8 == 0) {
                                                          break L2;
                                                        } else {
                                                          break L26;
                                                        }
                                                      }
                                                    }
                                                    if (!((mg) this).field_e.b(false)) {
                                                      break L2;
                                                    } else {
                                                      si.a((byte) -68, 5);
                                                      sc.field_g = 13;
                                                      if (var8 == 0) {
                                                        break L2;
                                                      } else {
                                                        break L25;
                                                      }
                                                    }
                                                  }
                                                  if (((mg) this).field_e.b(false)) {
                                                    si.a((byte) -68, 5);
                                                    di.field_i = 0;
                                                    if (var8 == 0) {
                                                      break L2;
                                                    } else {
                                                      break L24;
                                                    }
                                                  } else {
                                                    break L2;
                                                  }
                                                }
                                                if (((mg) this).field_e.b(false)) {
                                                  si.a((byte) -68, 5);
                                                  di.field_i = 1;
                                                  if (var8 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L23;
                                                  }
                                                } else {
                                                  break L2;
                                                }
                                              }
                                              if (!((mg) this).field_e.b(false)) {
                                                break L2;
                                              } else {
                                                si.a((byte) -68, 5);
                                                di.field_i = 2;
                                                if (var8 == 0) {
                                                  break L2;
                                                } else {
                                                  break L22;
                                                }
                                              }
                                            }
                                            if (!((mg) this).field_e.b(false)) {
                                              break L2;
                                            } else {
                                              si.a((byte) -68, 5);
                                              sc.field_g = 4;
                                              rd.field_b = 0;
                                              if (var8 == 0) {
                                                break L2;
                                              } else {
                                                break L21;
                                              }
                                            }
                                          }
                                          if (!((mg) this).field_e.b(false)) {
                                            break L2;
                                          } else {
                                            si.a((byte) -68, 5);
                                            rd.field_b = 0;
                                            sc.field_g = 5;
                                            if (var8 == 0) {
                                              break L2;
                                            } else {
                                              break L20;
                                            }
                                          }
                                        }
                                        if (!((mg) this).field_e.b(false)) {
                                          break L2;
                                        } else {
                                          si.a((byte) -68, 5);
                                          rd.field_b = 0;
                                          sc.field_g = 6;
                                          if (var8 == 0) {
                                            break L2;
                                          } else {
                                            break L19;
                                          }
                                        }
                                      }
                                      if (((mg) this).field_e.b(false)) {
                                        si.a((byte) -68, 5);
                                        rd.field_b = 0;
                                        sc.field_g = 7;
                                        if (var8 == 0) {
                                          break L2;
                                        } else {
                                          break L18;
                                        }
                                      } else {
                                        break L2;
                                      }
                                    }
                                    if (!((mg) this).field_e.b(false)) {
                                      break L2;
                                    } else {
                                      si.a((byte) -68, 5);
                                      sc.field_g = 0;
                                      if (var8 == 0) {
                                        break L2;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                  if (((mg) this).field_e.b(false)) {
                                    si.a((byte) -68, 5);
                                    sc.field_g = 1;
                                    if (var8 == 0) {
                                      break L2;
                                    } else {
                                      break L16;
                                    }
                                  } else {
                                    break L2;
                                  }
                                }
                                if (!((mg) this).field_e.b(false)) {
                                  break L2;
                                } else {
                                  si.a((byte) -68, 5);
                                  ka.field_d.e(param3 ^ 391);
                                  th.field_l = 0;
                                  pc.field_i = 0;
                                  oe.field_e = 0;
                                  cd.field_h.e(1);
                                  sc.field_g = 0;
                                  if (var8 == 0) {
                                    break L2;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                              if (((mg) this).field_e.b(false)) {
                                L51: {
                                  si.a((byte) -68, 5);
                                  if (og.field_rb == null) {
                                    break L51;
                                  } else {
                                    oj.a(param3 ^ -499);
                                    break L51;
                                  }
                                }
                                of.a(-80, gd.b((byte) 77));
                                if (var8 == 0) {
                                  break L2;
                                } else {
                                  break L14;
                                }
                              } else {
                                break L2;
                              }
                            }
                            if (!((mg) this).field_e.b(false)) {
                              break L2;
                            } else {
                              si.a((byte) -68, 5);
                              rd.field_b = (rd.field_b - -1) % 2;
                              if (var8 == 0) {
                                break L2;
                              } else {
                                break L13;
                              }
                            }
                          }
                          if (!((mg) this).field_e.b(false)) {
                            break L2;
                          } else {
                            si.a((byte) -68, 5);
                            sc.field_g = 8;
                            if (var8 == 0) {
                              break L2;
                            } else {
                              break L12;
                            }
                          }
                        }
                        if (!((mg) this).field_e.b(false)) {
                          break L2;
                        } else {
                          si.a((byte) -68, 5);
                          sc.field_g = 9;
                          if (var8 == 0) {
                            break L2;
                          } else {
                            break L11;
                          }
                        }
                      }
                      if (!((mg) this).field_e.b(false)) {
                        break L2;
                      } else {
                        L52: {
                          si.a((byte) -68, 5);
                          if (((mg) this).field_c != 8) {
                            break L52;
                          } else {
                            ad.a(((mg) this).field_c, 9, (byte) -120);
                            if (var8 == 0) {
                              break L2;
                            } else {
                              break L52;
                            }
                          }
                        }
                        L53: {
                          if (10 == ((mg) this).field_c) {
                            break L53;
                          } else {
                            if (((mg) this).field_c == 15) {
                              ad.a(((mg) this).field_c, -3, (byte) -47);
                              if (var8 == 0) {
                                break L2;
                              } else {
                                break L53;
                              }
                            } else {
                              L54: {
                                if (2 != ((mg) this).field_c) {
                                  break L54;
                                } else {
                                  ad.a(((mg) this).field_c, 3, (byte) -78);
                                  if (var8 == 0) {
                                    break L2;
                                  } else {
                                    break L54;
                                  }
                                }
                              }
                              throw new RuntimeException();
                            }
                          }
                        }
                        ad.a(((mg) this).field_c, 11, (byte) -109);
                        if (var8 == 0) {
                          break L2;
                        } else {
                          break L10;
                        }
                      }
                    }
                    if (((mg) this).field_e.b(false)) {
                      si.a((byte) -68, 5);
                      af.a(gd.b((byte) 77), (byte) -9);
                      if (var8 == 0) {
                        break L2;
                      } else {
                        break L9;
                      }
                    } else {
                      break L2;
                    }
                  }
                  if (((mg) this).field_e.b(false)) {
                    si.a((byte) -68, 5);
                    ua.field_L.c(3, 117);
                    if (var8 == 0) {
                      break L2;
                    } else {
                      break L8;
                    }
                  } else {
                    break L2;
                  }
                }
                if (!((mg) this).field_e.b(false)) {
                  break L2;
                } else {
                  L55: {
                    si.a((byte) -68, 5);
                    if (!jj.s(49)) {
                      break L55;
                    } else {
                      L56: {
                        if ((ua.field_L.field_O | oe.field_e) == 0) {
                          break L56;
                        } else {
                          sc.field_g = 15;
                          if (var8 == 0) {
                            break L2;
                          } else {
                            break L56;
                          }
                        }
                      }
                      sc.field_g = 0;
                      if (var8 == 0) {
                        break L2;
                      } else {
                        break L55;
                      }
                    }
                  }
                  L57: {
                    if (oe.field_e != 0) {
                      break L57;
                    } else {
                      L58: {
                        if (ua.field_L.field_O == 0) {
                          break L58;
                        } else {
                          sc.field_g = 11;
                          if (var8 == 0) {
                            break L2;
                          } else {
                            break L58;
                          }
                        }
                      }
                      sc.field_g = 1;
                      if (var8 == 0) {
                        break L2;
                      } else {
                        break L57;
                      }
                    }
                  }
                  sc.field_g = 16;
                  if (var8 == 0) {
                    break L2;
                  } else {
                    break L7;
                  }
                }
              }
              L59: {
                if (((mg) this).field_e.a(true)) {
                  da.a(0, (byte) -74);
                  break L59;
                } else {
                  break L59;
                }
              }
              L60: {
                if (((mg) this).field_e.b(-32)) {
                  da.a(256, (byte) -74);
                  break L60;
                } else {
                  break L60;
                }
              }
              L61: {
                if (((mg) this).field_e.e(0)) {
                  L62: {
                    stackOut_260_0 = this.e((byte) 57);
                    stackIn_262_0 = stackOut_260_0;
                    stackIn_261_0 = stackOut_260_0;
                    if (mf.field_i[((mg) this).field_c]) {
                      stackOut_262_0 = stackIn_262_0;
                      stackOut_262_1 = mf.field_d[((mg) this).field_c] * param2;
                      stackIn_263_0 = stackOut_262_0;
                      stackIn_263_1 = stackOut_262_1;
                      break L62;
                    } else {
                      stackOut_261_0 = stackIn_261_0;
                      stackOut_261_1 = 0;
                      stackIn_263_0 = stackOut_261_0;
                      stackIn_263_1 = stackOut_261_1;
                      break L62;
                    }
                  }
                  L63: {
                    var6 = stackIn_263_0 + stackIn_263_1;
                    var7 = -var6 + kf.field_b + -78 << -627868350;
                    if (0 <= var7) {
                      break L63;
                    } else {
                      da.a(0, (byte) -74);
                      if (var8 == 0) {
                        break L61;
                      } else {
                        break L63;
                      }
                    }
                  }
                  L64: {
                    if (var7 >= 256) {
                      break L64;
                    } else {
                      da.a(var7, (byte) -74);
                      if (var8 == 0) {
                        break L61;
                      } else {
                        break L64;
                      }
                    }
                  }
                  da.a(256, (byte) -74);
                  break L61;
                } else {
                  break L61;
                }
              }
              L65: {
                if (!((mg) this).field_e.a(0)) {
                  break L65;
                } else {
                  ol.e(256);
                  break L65;
                }
              }
              if (((mg) this).field_e.c((byte) 11)) {
                g.f(-96);
                if (var8 == 0) {
                  break L2;
                } else {
                  break L6;
                }
              } else {
                break L2;
              }
            }
            L66: {
              if (((mg) this).field_e.a(true)) {
                qd.a(false, 0);
                break L66;
              } else {
                break L66;
              }
            }
            L67: {
              if (!((mg) this).field_e.b(param3 + -293)) {
                break L67;
              } else {
                qd.a(false, 256);
                break L67;
              }
            }
            L68: {
              if (!((mg) this).field_e.e(0)) {
                break L68;
              } else {
                L69: {
                  stackOut_283_0 = this.e((byte) 99);
                  stackIn_286_0 = stackOut_283_0;
                  stackIn_284_0 = stackOut_283_0;
                  if (!mf.field_i[((mg) this).field_c]) {
                    stackOut_286_0 = stackIn_286_0;
                    stackOut_286_1 = 0;
                    stackIn_287_0 = stackOut_286_0;
                    stackIn_287_1 = stackOut_286_1;
                    break L69;
                  } else {
                    stackOut_284_0 = stackIn_284_0;
                    stackIn_285_0 = stackOut_284_0;
                    stackOut_285_0 = stackIn_285_0;
                    stackOut_285_1 = param2 * mf.field_d[((mg) this).field_c];
                    stackIn_287_0 = stackOut_285_0;
                    stackIn_287_1 = stackOut_285_1;
                    break L69;
                  }
                }
                L70: {
                  var6 = stackIn_287_0 - -stackIn_287_1;
                  var7 = -var6 + (kf.field_b - 78) << -1855045886;
                  if (var7 < 0) {
                    break L70;
                  } else {
                    L71: {
                      if (var7 < 256) {
                        break L71;
                      } else {
                        qd.a(false, 256);
                        if (var8 == 0) {
                          break L68;
                        } else {
                          break L71;
                        }
                      }
                    }
                    qd.a(false, var7);
                    if (var8 == 0) {
                      break L68;
                    } else {
                      break L70;
                    }
                  }
                }
                qd.a(false, 0);
                break L68;
              }
            }
            L72: {
              if (!((mg) this).field_e.a(0)) {
                break L72;
              } else {
                ij.a((byte) -109);
                break L72;
              }
            }
            if (((mg) this).field_e.c((byte) 11)) {
              qg.a(13);
              break L2;
            } else {
              break L2;
            }
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
          throw sl.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
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
