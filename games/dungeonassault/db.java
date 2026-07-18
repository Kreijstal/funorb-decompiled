/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db extends qe {
    private rh field_r;
    static String field_u;
    private ae field_w;
    private tf[] field_s;
    private rh field_t;
    static gp field_v;

    private final void b(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var8_int = 0;
        String var9 = null;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (param0 <= -20) {
                break L1;
              } else {
                this.b((byte) 115);
                break L1;
              }
            }
            L2: {
              var2_int = 241;
              field_v.c(fd.field_a, 213, var2_int, 16777215, -1);
              var3 = gm.field_d.field_w;
              if (null != fo.field_d.field_l) {
                var3 = ((Integer) fo.field_d.field_l.field_u).intValue();
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                if (!o.a(gj.field_c, (int[]) null, var3, gm.field_d, true)) {
                  break L4;
                } else {
                  var4 = jk.a(new String[1], DungeonAssault.field_G, 30496);
                  int discarded$2 = la.field_b.a(var4, 70, 338, 270, 180, 16760960, -1, 1, 0, la.field_b.field_H + la.field_b.field_E);
                  if (var10 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                var4 = ib.a((byte) -15, 16760960, pj.a((byte) 66, var3, tc.field_u));
                var5 = jk.a(new String[1], dk.field_e, 30496);
                var6 = 127 & var3;
                if (wh.field_a > var6) {
                  L6: {
                    if (var6 >= cp.field_R) {
                      break L6;
                    } else {
                      L7: {
                        if (~ok.field_z < ~var6) {
                          break L7;
                        } else {
                          L8: {
                            var7 = -ok.field_z + var6;
                            if (~bl.field_n.length >= ~var7) {
                              break L8;
                            } else {
                              var8_int = bl.field_n[var7];
                              var9 = ib.a((byte) 6, 16760960, ce.field_o[var8_int]);
                              var5 = jk.a(new String[2], l.field_c, 30496);
                              break L8;
                            }
                          }
                          if (var10 == 0) {
                            break L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                      L9: {
                        if (gn.field_d <= var6) {
                          break L9;
                        } else {
                          L10: {
                            if (~uf.field_a < ~var6) {
                              break L10;
                            } else {
                              L11: {
                                var7 = -uf.field_a + var6;
                                if (~var7 <= ~hb.field_m.length) {
                                  break L11;
                                } else {
                                  L12: {
                                    var8_int = hb.field_m[var7];
                                    var9 = ib.a((byte) -128, 16760960, Integer.toString(var8_int));
                                    if (1 == var8_int) {
                                      break L12;
                                    } else {
                                      var5 = jk.a(new String[2], wf.field_y, 30496);
                                      if (var10 == 0) {
                                        break L11;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  var5 = jk.a(new String[2], tl.field_c, 30496);
                                  break L11;
                                }
                              }
                              if (var10 == 0) {
                                break L5;
                              } else {
                                break L10;
                              }
                            }
                          }
                          if (~wm.field_a < ~var6) {
                            break L5;
                          } else {
                            L13: {
                              var7 = -wm.field_a + var6;
                              if (~var7 > ~dc.field_p.length) {
                                L14: {
                                  var8_int = dc.field_p[var7];
                                  var9 = ib.a((byte) -125, 16760960, Integer.toString(var8_int));
                                  if (var8_int != 1) {
                                    break L14;
                                  } else {
                                    var5 = jk.a(new String[2], be.field_m, 30496);
                                    if (var10 == 0) {
                                      break L13;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                var5 = jk.a(new String[2], vj.field_i, 30496);
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                            if (var10 == 0) {
                              break L5;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                      L15: {
                        var7 = var6 + -gn.field_d;
                        if (var7 < ci.field_s.length) {
                          var8_int = ci.field_s[var7];
                          var9 = ib.a((byte) 91, 16760960, Integer.toString(var8_int));
                          var5 = jk.a(new String[2], ac.field_f, 30496);
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      if (var10 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var7 = -cp.field_R + var6;
                  if (~var7 <= ~id.field_j.length) {
                    break L5;
                  } else {
                    var8 = ib.a((byte) 115, 16760960, ab.field_d[var7]);
                    var9 = ib.a((byte) 115, 16760960, ka.field_b[var7]);
                    var5 = jk.a(new String[3], uk.field_b, 30496);
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              int discarded$3 = la.field_b.a(var5, 75, 338, 260, 180, 8421504, -1, 1, 0, la.field_b.field_E + la.field_b.field_H);
              break L3;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "db.Q(" + param0 + ')');
        }
    }

    private final void a(int param0, byte param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        cn var7 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3_int = tg.field_f[3][param0];
              var4 = this.a(var3_int, 0);
              var5 = ne.field_c.b(var4);
              var6 = ne.field_c.field_E + ne.field_c.field_H;
              var7 = new cn(var5, var6);
              jh.a(var7);
              ne.field_c.b(var4, 0, ne.field_c.field_H, 16760960, -1);
              jh.b();
              if (param1 == -121) {
                break L1;
              } else {
                db.c((byte) 98);
                break L1;
              }
            }
            ga.field_r = rb.a(8, var7, 16760960, (byte) 109);
            co.field_F = rb.a(16, var7, 6307840, (byte) -111);
            nf.field_y = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw vk.a((Throwable) (Object) runtimeException, "db.L(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(boolean param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int var13 = 0;
        int[] stackIn_18_0 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_17_0 = null;
        int[] stackOut_15_0 = null;
        int[] stackOut_13_0 = null;
        int[] stackOut_11_0 = null;
        try {
          L0: {
            L1: {
              if (param2 > 69) {
                break L1;
              } else {
                this.a((byte) 8, 36);
                break L1;
              }
            }
            L2: {
              var4_int = tg.field_f[3][param1];
              var5 = this.a(var4_int, 0);
              var6 = ne.field_c.b(var5);
              var7 = bh.b(param1, 3, false);
              var8 = qd.a(param1, 380, 3);
              var9 = o.a(3, (byte) 101, param1);
              var10 = -var6 + (var7 + var8) >> 1630379393;
              if (!ke.a(97, var4_int)) {
                var9 += 4;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var11 = rp.a(15204376, var4_int) ? 1 : 0;
              if (!param0) {
                if (var11 != 0) {
                  stackOut_17_0 = ag.field_c;
                  stackIn_18_0 = stackOut_17_0;
                  break L3;
                } else {
                  stackOut_15_0 = tf.field_k;
                  stackIn_18_0 = stackOut_15_0;
                  break L3;
                }
              } else {
                if (var11 == 0) {
                  stackOut_13_0 = ug.field_E;
                  stackIn_18_0 = stackOut_13_0;
                  break L3;
                } else {
                  stackOut_11_0 = ml.field_b;
                  stackIn_18_0 = stackOut_11_0;
                  break L3;
                }
              }
            }
            L4: {
              var12 = stackIn_18_0;
              if (var11 == 0) {
                L5: {
                  if (of.field_k) {
                    if (var4_int != 22) {
                      break L4;
                    } else {
                      break L5;
                    }
                  } else {
                    if (23 != var4_int) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                var12 = fo.field_c;
                break L4;
              } else {
                break L4;
              }
            }
            L6: {
              L7: {
                if (null == ((db) this).field_s[param1]) {
                  break L7;
                } else {
                  if (((db) this).field_s[param1].field_f != var5) {
                    break L7;
                  } else {
                    if (((db) this).field_s[param1].field_h != var12) {
                      break L7;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              ((db) this).field_s[param1] = new tf((se) (Object) ne.field_c, var5, var12);
              break L6;
            }
            L8: {
              ((db) this).field_s[param1].b(var9, 32, var10);
              if (var4_int != 22) {
                break L8;
              } else {
                if (~ak.field_o[0] < ~gm.field_d.field_m) {
                  hj.field_T.h(-20 + var10, ne.field_c.field_H + var9 - 15);
                  break L8;
                } else {
                  break L8;
                }
              }
            }
            L9: {
              if (param0) {
                L10: {
                  if (~param1 == ~nf.field_y) {
                    break L10;
                  } else {
                    this.a(param1, (byte) -121);
                    break L10;
                  }
                }
                L11: {
                  ga.field_r.b(var10, var9, 64);
                  var13 = (int)((1.0 + te.a(mo.field_a)) * 128.0);
                  if (var13 >= 0) {
                    break L11;
                  } else {
                    var13 = 0;
                    break L11;
                  }
                }
                L12: {
                  if (var13 <= 256) {
                    break L12;
                  } else {
                    var13 = 256;
                    break L12;
                  }
                }
                co.field_F.b(var10, var9, var13);
                break L9;
              } else {
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var4, "db.R(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void c() {
        try {
            super.c();
            ((db) this).field_s = null;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "db.I()");
        }
    }

    final void c(boolean param0) {
        RuntimeException var2 = null;
        bf[] var2_array = null;
        int var2_int = 0;
        pp var2_ref = null;
        pk var2_ref2 = null;
        int var3 = 0;
        bf var4_ref_bf = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_51_0 = 0;
        pp stackIn_52_0 = null;
        pp stackIn_53_0 = null;
        pp stackIn_55_0 = null;
        pp stackIn_56_0 = null;
        pp stackIn_58_0 = null;
        pp stackIn_60_0 = null;
        pp stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_48_0 = 0;
        int stackOut_50_0 = 0;
        pp stackOut_51_0 = null;
        pp stackOut_52_0 = null;
        pp stackOut_53_0 = null;
        pp stackOut_55_0 = null;
        pp stackOut_56_0 = null;
        pp stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        pp stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        var6 = DungeonAssault.field_K;
        try {
          L0: {
            super.c(param0);
            var2_array = wd.field_l;
            var3 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      if (~var2_array.length >= ~var3) {
                        break L5;
                      } else {
                        var4_ref_bf = var2_array[var3];
                        var4_ref_bf.a(-87);
                        var3++;
                        if (var6 != 0) {
                          break L4;
                        } else {
                          if (var6 == 0) {
                            continue L1;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    L6: {
                      if (!kh.field_s) {
                        break L6;
                      } else {
                        if (param0) {
                          break L3;
                        } else {
                          break L6;
                        }
                      }
                    }
                    this.b((byte) -50);
                    break L4;
                  }
                  L7: {
                    if (hh.field_s == null) {
                      break L7;
                    } else {
                      if (hh.field_s.field_u instanceof Integer) {
                        var2_int = ((Integer) hh.field_s.field_u).intValue();
                        if (!o.a(gj.field_c, (int[]) null, var2_int, gm.field_d, true)) {
                          break L7;
                        } else {
                          gm.field_d.field_w = var2_int;
                          ac.field_B.d((byte) -106, 59);
                          ac.field_B.a(6, var2_int);
                          break L7;
                        }
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: while (true) {
                    if (!ha.b((byte) 47)) {
                      break L3;
                    } else {
                      ((db) this).f();
                      if (var6 != 0) {
                        break L2;
                      } else {
                        if (var6 == 0) {
                          continue L8;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                if (((db) this).field_b == null) {
                  break L2;
                } else {
                  if (!((db) this).field_b.field_d) {
                    break L2;
                  } else {
                    L9: {
                      if (((db) this).field_b instanceof pk) {
                        var2_ref2 = (pk) (Object) ((db) this).field_b;
                        if (!var2_ref2.field_r) {
                          break L9;
                        } else {
                          this.a((byte) 111, var2_ref2.field_u);
                          break L9;
                        }
                      } else {
                        break L9;
                      }
                    }
                    ((db) this).field_b.c(-123);
                    ((db) this).field_b = null;
                    break L2;
                  }
                }
              }
              L10: {
                L11: {
                  if (null == mk.field_j.field_l) {
                    break L11;
                  } else {
                    L12: {
                      L13: {
                        var2_int = ((lk) (Object) mk.field_j.field_l).field_O;
                        var3 = gm.field_d.field_J[var2_int] - -gm.field_d.field_F[var2_int];
                        var4 = (var3 + 10) * fj.field_g[var2_int] / 10;
                        if (!ve.a(false)) {
                          break L13;
                        } else {
                          if (var3 < 5) {
                            break L13;
                          } else {
                            if (!hm.field_m[var2_int]) {
                              break L13;
                            } else {
                              stackOut_48_0 = 1;
                              stackIn_51_0 = stackOut_48_0;
                              break L12;
                            }
                          }
                        }
                      }
                      stackOut_50_0 = 0;
                      stackIn_51_0 = stackOut_50_0;
                      break L12;
                    }
                    L14: {
                      L15: {
                        var5 = stackIn_51_0;
                        hf.field_mb.field_D = og.field_e.field_N;
                        stackOut_51_0 = hf.field_mb;
                        stackIn_60_0 = stackOut_51_0;
                        stackIn_52_0 = stackOut_51_0;
                        if (!hf.field_mb.field_D) {
                          break L15;
                        } else {
                          stackOut_52_0 = (pp) (Object) stackIn_52_0;
                          stackIn_60_0 = stackOut_52_0;
                          stackIn_53_0 = stackOut_52_0;
                          if (var5 != 0) {
                            break L15;
                          } else {
                            stackOut_53_0 = (pp) (Object) stackIn_53_0;
                            stackIn_55_0 = stackOut_53_0;
                            stackOut_55_0 = (pp) (Object) stackIn_55_0;
                            stackIn_60_0 = stackOut_55_0;
                            stackIn_56_0 = stackOut_55_0;
                            if (~var4 < ~gm.field_d.field_s) {
                              break L15;
                            } else {
                              stackOut_56_0 = (pp) (Object) stackIn_56_0;
                              stackIn_58_0 = stackOut_56_0;
                              stackOut_58_0 = (pp) (Object) stackIn_58_0;
                              stackOut_58_1 = 1;
                              stackIn_61_0 = stackOut_58_0;
                              stackIn_61_1 = stackOut_58_1;
                              break L14;
                            }
                          }
                        }
                      }
                      stackOut_60_0 = (pp) (Object) stackIn_60_0;
                      stackOut_60_1 = 0;
                      stackIn_61_0 = stackOut_60_0;
                      stackIn_61_1 = stackOut_60_1;
                      break L14;
                    }
                    stackIn_61_0.field_w = stackIn_61_1 != 0;
                    if (var6 == 0) {
                      break L10;
                    } else {
                      break L11;
                    }
                  }
                }
                hf.field_mb.field_w = false;
                var2_ref = hf.field_mb;
                var2_ref.field_D = false;
                break L10;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "db.B(" + param0 + ')');
        }
    }

    private final String a(int param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_26_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_25_0 = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                this.d(false);
                break L1;
              }
            }
            L2: {
              var3 = ll.field_m[param0];
              if (param0 != 10) {
                break L2;
              } else {
                L3: {
                  if (ec.field_p == 0) {
                    break L3;
                  } else {
                    if (dc.field_z == 0) {
                      break L3;
                    } else {
                      if (12 == ec.field_p) {
                        break L3;
                      } else {
                        if (dc.field_z == 12) {
                          break L3;
                        } else {
                          if (ec.field_p == 1) {
                            break L3;
                          } else {
                            if (dc.field_z == 1) {
                              break L3;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                var3 = ll.field_m[9];
                break L2;
              }
            }
            stackOut_25_0 = (String) var3;
            stackIn_26_0 = stackOut_25_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var3_ref, "db.D(" + param0 + ',' + param1 + ')');
        }
        return stackIn_26_0;
    }

    private final void b(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3_int = tg.field_f[3][param1];
              var4 = bh.b(param1, 3, false);
              var5 = qd.a(param1, 380, 3);
              if (param0 >= 60) {
                break L1;
              } else {
                this.b((byte) -57);
                break L1;
              }
            }
            L2: {
              L3: {
                var6 = o.a(3, (byte) 110, param1);
                var7 = kf.a(param1, 3, -114);
                if (!ke.a(76, var3_int)) {
                  break L3;
                } else {
                  gf.e(-4 + var4, -6 + var6, 8 + var5 + -var4, var7 + 8, 0);
                  db.b(var4, var6 - 2, var5 + -var4, var7, 8421504, 128, 128);
                  rp.a(4, var5 + -var4, (byte) 108, var4, var7, kc.field_S, var6 - 2);
                  db.a(var4, -2 + var6, var5 + -var4, var7, 224, 64, 3, 128);
                  if (DungeonAssault.field_K == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              of.field_j.h(-of.field_j.field_y + (var4 + var5) >> -728045311, var6);
              var6 += 4;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var3, "db.H(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        gd var4 = null;
        int var5_int = 0;
        ed var5 = null;
        int var6_int = 0;
        pp var6 = null;
        int var7 = 0;
        int var8 = 0;
        lk var9 = null;
        int var10 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_10_0 = 0;
        boolean stackIn_15_0 = false;
        int stackIn_25_0 = 0;
        boolean stackIn_28_0 = false;
        int stackIn_37_0 = 0;
        boolean stackIn_40_0 = false;
        int stackIn_50_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        byte stackOut_9_0 = 0;
        boolean stackOut_14_0 = false;
        int stackOut_24_0 = 0;
        boolean stackOut_27_0 = false;
        int stackOut_36_0 = 0;
        boolean stackOut_39_0 = false;
        int stackOut_49_0 = 0;
        var10 = DungeonAssault.field_K;
        try {
          L0: {
            var2_int = 241;
            ((db) this).b();
            var3 = 0;
            fo.field_d = new nn(true);
            eh.field_o = new ed(90, var2_int - -7, 250, -var2_int + 328);
            ((db) this).field_p.a((ne) (Object) eh.field_o, false);
            var4 = this.a(var3, -1, -111, true);
            var3 = var3 + (var4.field_x + 3);
            var5_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (bl.field_n.length <= var5_int) {
                    break L3;
                  } else {
                    var6_int = ok.field_z - -var5_int;
                    var7 = o.a(gj.field_c, (int[]) null, var6_int, gm.field_d, true) ? 1 : 0;
                    var4 = this.a(var3, var6_int, 32, var7 != 0);
                    var3 = var3 + (3 + var4.field_x);
                    stackOut_3_0 = bh.a(126, var6_int).equals((Object) (Object) bh.a(123, var6_int - -rj.field_l));
                    stackIn_10_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var10 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0) {
                          break L4;
                        } else {
                          var4 = this.a(var3, rj.field_l + var6_int, -7, var7 != 0);
                          var3 = var3 + (3 + var4.field_x);
                          break L4;
                        }
                      }
                      var5_int++;
                      if (var10 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var5_int = 0;
                stackOut_9_0 = param0;
                stackIn_10_0 = stackOut_9_0;
                break L2;
              }
              L5: {
                if (stackIn_10_0 < -65) {
                  break L5;
                } else {
                  field_u = null;
                  break L5;
                }
              }
              L6: while (true) {
                L7: {
                  L8: {
                    if (~dc.field_p.length >= ~var5_int) {
                      break L8;
                    } else {
                      var6_int = var5_int + wm.field_a;
                      var7 = o.a(gj.field_c, (int[]) null, var6_int, gm.field_d, true) ? 1 : 0;
                      var4 = this.a(var3, var6_int, 2, var7 != 0);
                      var3 = var3 + (var4.field_x - -3);
                      stackOut_14_0 = bh.a(117, var6_int).equals((Object) (Object) bh.a(122, rj.field_l + var6_int));
                      stackIn_25_0 = stackOut_14_0 ? 1 : 0;
                      stackIn_15_0 = stackOut_14_0;
                      if (var10 != 0) {
                        break L7;
                      } else {
                        L9: {
                          if (!stackIn_15_0) {
                            var4 = this.a(var3, var6_int + rj.field_l, 99, var7 != 0);
                            var3 = var3 + (3 + var4.field_x);
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        if (var7 == 0) {
                          break L8;
                        } else {
                          var5_int++;
                          if (var10 == 0) {
                            continue L6;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                  }
                  stackOut_24_0 = 0;
                  stackIn_25_0 = stackOut_24_0;
                  break L7;
                }
                var5_int = stackIn_25_0;
                L10: while (true) {
                  L11: {
                    L12: {
                      if (~hb.field_m.length >= ~var5_int) {
                        break L12;
                      } else {
                        var6_int = uf.field_a + var5_int;
                        var7 = o.a(gj.field_c, (int[]) null, var6_int, gm.field_d, true) ? 1 : 0;
                        var4 = this.a(var3, var6_int, -117, var7 != 0);
                        var3 = var3 + (var4.field_x + 3);
                        stackOut_27_0 = bh.a(120, var6_int).equals((Object) (Object) bh.a(120, var6_int - -rj.field_l));
                        stackIn_37_0 = stackOut_27_0 ? 1 : 0;
                        stackIn_28_0 = stackOut_27_0;
                        if (var10 != 0) {
                          break L11;
                        } else {
                          L13: {
                            if (stackIn_28_0) {
                              break L13;
                            } else {
                              var4 = this.a(var3, rj.field_l + var6_int, 47, var7 != 0);
                              var3 = var3 + (var4.field_x - -3);
                              break L13;
                            }
                          }
                          if (var7 == 0) {
                            break L12;
                          } else {
                            var5_int++;
                            if (var10 == 0) {
                              continue L10;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                    }
                    stackOut_36_0 = 0;
                    stackIn_37_0 = stackOut_36_0;
                    break L11;
                  }
                  var5_int = stackIn_37_0;
                  L14: while (true) {
                    L15: {
                      L16: {
                        if (~var5_int <= ~ci.field_s.length) {
                          break L16;
                        } else {
                          var6_int = var5_int + gn.field_d;
                          var7 = o.a(gj.field_c, (int[]) null, var6_int, gm.field_d, true) ? 1 : 0;
                          var4 = this.a(var3, var6_int, -112, var7 != 0);
                          var3 = var3 + (var4.field_x - -3);
                          stackOut_39_0 = bh.a(120, var6_int).equals((Object) (Object) bh.a(119, rj.field_l + var6_int));
                          stackIn_50_0 = stackOut_39_0 ? 1 : 0;
                          stackIn_40_0 = stackOut_39_0;
                          if (var10 != 0) {
                            break L15;
                          } else {
                            L17: {
                              if (!stackIn_40_0) {
                                var4 = this.a(var3, var6_int - -rj.field_l, 18, var7 != 0);
                                var3 = var3 + (var4.field_x - -3);
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            if (var7 == 0) {
                              break L16;
                            } else {
                              var5_int++;
                              if (var10 == 0) {
                                continue L14;
                              } else {
                                break L16;
                              }
                            }
                          }
                        }
                      }
                      stackOut_49_0 = 0;
                      stackIn_50_0 = stackOut_49_0;
                      break L15;
                    }
                    var5_int = stackIn_50_0;
                    L18: while (true) {
                      L19: {
                        L20: {
                          if (id.field_j.length <= var5_int) {
                            break L20;
                          } else {
                            var6_int = cp.field_R - -var5_int;
                            var7 = o.a(gj.field_c, (int[]) null, var6_int, gm.field_d, true) ? 1 : 0;
                            var4 = this.a(var3, var6_int, -121, var7 != 0);
                            var3 = var3 + (3 + var4.field_x);
                            if (var10 != 0) {
                              break L19;
                            } else {
                              L21: {
                                if (!bh.a(122, var6_int).equals((Object) (Object) bh.a(121, rj.field_l + var6_int))) {
                                  var4 = this.a(var3, rj.field_l + var6_int, -111, var7 != 0);
                                  var3 = var3 + (3 + var4.field_x);
                                  break L21;
                                } else {
                                  break L21;
                                }
                              }
                              var5_int++;
                              if (var10 == 0) {
                                continue L18;
                              } else {
                                break L20;
                              }
                            }
                          }
                        }
                        mk.field_j = new nn(true);
                        og.field_e = new ed(90, 7 + var2_int, 250, -var2_int + 328);
                        break L19;
                      }
                      var5 = og.field_e;
                      og.field_e.field_N = false;
                      var5.field_w = false;
                      ((db) this).field_p.a((ne) (Object) og.field_e, false);
                      hf.field_mb = tn.a(-(kg.field_a.field_y / 2) + (363 + (200 - ao.field_n.field_E >> 1255228449)) - -(ao.field_n.field_E / 2), 337, (se) (Object) field_v, kg.field_a, -81, bg.field_x.toUpperCase());
                      var6 = hf.field_mb;
                      hf.field_mb.field_D = false;
                      var6.field_w = false;
                      var3 = 0;
                      ((db) this).field_p.a((ne) (Object) hf.field_mb, false);
                      var7 = 1;
                      var8 = 0;
                      L22: while (true) {
                        L23: {
                          L24: {
                            if (var8 >= 6) {
                              break L24;
                            } else {
                              if (var10 != 0) {
                                break L23;
                              } else {
                                L25: {
                                  if (gm.field_d.field_m < ak.field_o[var8]) {
                                    break L25;
                                  } else {
                                    L26: {
                                      if (cf.field_b[var8]) {
                                        break L26;
                                      } else {
                                        if (var10 == 0) {
                                          break L25;
                                        } else {
                                          break L26;
                                        }
                                      }
                                    }
                                    var9 = new lk(0, var3, 200, 40, var8);
                                    og.field_e.a((rj) (Object) var9, (byte) -101);
                                    var3 += 40;
                                    mk.field_j.a((gd) (Object) var9, (byte) -20);
                                    if (var7 != 0) {
                                      var7 = 0;
                                      mk.field_j.a((gd) (Object) var9, -256);
                                      break L25;
                                    } else {
                                      break L25;
                                    }
                                  }
                                }
                                var8++;
                                if (var10 == 0) {
                                  continue L22;
                                } else {
                                  break L24;
                                }
                              }
                            }
                          }
                          og.field_e.e(49);
                          og.field_e.c(107, 8);
                          break L23;
                        }
                        break L0;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "db.P(" + param0 + ')');
        }
    }

    private final void b(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!super.d()) {
              L1: {
                ((db) this).field_w.a(-7734, this.a(hm.field_k, lc.field_c, (byte) -117), this.a(eh.field_h, hj.field_S, (byte) -117));
                if (param0 == -50) {
                  break L1;
                } else {
                  ((db) this).field_w = null;
                  break L1;
                }
              }
              L2: {
                if (((db) this).field_w.field_b != -1) {
                  this.a(((db) this).field_w.field_b, -1, true);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if ((Object) (Object) hh.field_s != (Object) (Object) hf.field_mb) {
                  break L3;
                } else {
                  L4: {
                    var2_int = ((lk) (Object) mk.field_j.field_l).field_O;
                    if (0 != gm.field_d.field_e) {
                      break L4;
                    } else {
                      ((db) this).field_b = (kl) (Object) new pk(ag.field_b, oj.field_c, var2_int);
                      if (DungeonAssault.field_K == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  this.a((byte) 88, var2_int);
                  break L3;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "db.J(" + param0 + ')');
        }
    }

    private final void a(byte param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            gm.field_d.field_F[param1] = gm.field_d.field_F[param1] + 1;
            gm.field_d.field_e = gm.field_d.field_e + 1;
            var3_int = gm.field_d.field_F[param1] + gm.field_d.field_J[param1];
            if (param0 > 29) {
              L1: {
                var4 = fj.field_g[param1] * (var3_int + 10) / 10;
                gm.field_d.field_s = gm.field_d.field_s - var4;
                if (gm.field_d.field_A == -1) {
                  break L1;
                } else {
                  gm.field_d.field_A = fm.field_i + (int)(-16912800L + kd.c(-2456) / 60000L);
                  break L1;
                }
              }
              ac.field_B.d((byte) -79, 73);
              ac.field_B.a(6, param1);
              hi.b(1);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw vk.a((Throwable) (Object) runtimeException, "db.A(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0) {
        RuntimeException var2 = null;
        lb var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        long var15 = 0L;
        String var17 = null;
        int var18 = 0;
        int stackIn_16_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_26_0 = 0;
        var18 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              var2_ref = gm.field_d;
              var3 = 370;
              var4 = 130;
              var5 = kk.field_l.field_E + kk.field_l.field_H;
              var6 = 40;
              gf.b(var3 - 3, var4 + -16, 186, 70, 16777215, var6);
              field_v.b(jk.a(new String[1], kk.field_s, 30496), var3, var4, 0, -1);
              var4 += 16;
              field_v.b(jk.a(new String[1], mm.field_j, 30496), var3, var4, 0, -1);
              var4 += 16;
              field_v.b(jk.a(new String[1], bp.field_h, 30496), var3, var4, 0, -1);
              var4 += 16;
              var7 = 60 * (int)(0.5 + Math.pow(2.0, (double)(-var2_ref.field_N) / 10000.0) * 250.0) / 60;
              var7 = var7 + 10 * gm.field_d.field_J[2];
              kk.field_l.b(jk.a(new String[1], la.field_j, 30496), var3, var4, 0, -1);
              if (param0 == 197376) {
                break L1;
              } else {
                field_v = null;
                break L1;
              }
            }
            L2: {
              L3: {
                var8 = 9;
                var4 = var4 + (var8 + 16);
                if (var2_ref.field_B > 0) {
                  break L3;
                } else {
                  var9 = wa.field_f;
                  if (var18 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var9 = jk.a(new String[3], ip.field_k, 30496);
              break L2;
            }
            L4: {
              L5: {
                if (var2_ref.field_y > 0) {
                  break L5;
                } else {
                  var10 = jk.a(new String[3], uh.field_V, param0 ^ 226336);
                  if (var18 == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              var10 = jk.a(new String[3], ip.field_k, param0 ^ 226336);
              break L4;
            }
            L6: {
              L7: {
                var11 = -55 + bl.field_s.field_y;
                var12 = 2 + kk.field_l.c(var9, var11) - -kk.field_l.c(var10, var11);
                gf.b(-3 + var3, -16 + var4, 186, 6 + var12 * 16, 16777215, var6);
                field_v.b(p.field_r, var3, var4, 0, -1);
                var4 += 16;
                var12 = kk.field_l.a(var9, 10 + var3, -var5 + var4, var11, 100, 0, -1, 0, 0, var5);
                var4 = var4 + 16 * var12;
                field_v.b(rb.field_M, var3, var4, 0, -1);
                var4 += 16;
                var12 = kk.field_l.a(var10, var3 - -10, -var5 + var4, var11, 100, 0, -1, 0, 0, var5);
                var4 = var4 + (16 * var12 + var8);
                if (var2_ref.field_t[0] != -1L) {
                  var12 = 0;
                  var13 = var4;
                  var14 = 0;
                  L8: while (true) {
                    L9: {
                      L10: {
                        if (10 <= var14) {
                          break L10;
                        } else {
                          var15 = var2_ref.field_t[var14];
                          stackOut_15_0 = (-1L < var15 ? -1 : (-1L == var15 ? 0 : 1));
                          stackIn_27_0 = stackOut_15_0;
                          stackIn_16_0 = stackOut_15_0;
                          if (var18 != 0) {
                            break L9;
                          } else {
                            if (stackIn_16_0 == 0) {
                              break L10;
                            } else {
                              L11: {
                                var12++;
                                var4 = var4 + kk.field_l.field_H;
                                if (var4 <= 350) {
                                  break L11;
                                } else {
                                  if (var18 == 0) {
                                    break L10;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              var14++;
                              if (var18 == 0) {
                                continue L8;
                              } else {
                                break L10;
                              }
                            }
                          }
                        }
                      }
                      var4 = var13;
                      gf.b(var3 - 3, var4 - 16, 186, 20 + kk.field_l.field_H * 6, 16777215, var6);
                      field_v.b(oh.field_o, var3, var4, 0, -1);
                      var4 += 16;
                      stackOut_26_0 = 0;
                      stackIn_27_0 = stackOut_26_0;
                      break L9;
                    }
                    var14 = stackIn_27_0;
                    L12: while (true) {
                      if (var14 >= 10) {
                        break L7;
                      } else {
                        var15 = var2_ref.field_t[var14];
                        if (var18 != 0) {
                          break L6;
                        } else {
                          L13: {
                            if (var15 != -1L) {
                              break L13;
                            } else {
                              if (var18 == 0) {
                                break L7;
                              } else {
                                break L13;
                              }
                            }
                          }
                          L14: {
                            var17 = uj.a(var15, param0 + -197377);
                            kk.field_l.b(var17, var3 + 10, var4, 14352640, -1);
                            var4 = var4 + kk.field_l.field_H;
                            if (var4 <= 350) {
                              break L14;
                            } else {
                              if (var18 == 0) {
                                break L7;
                              } else {
                                break L14;
                              }
                            }
                          }
                          var14++;
                          if (var18 == 0) {
                            continue L12;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                  }
                } else {
                  break L7;
                }
              }
              this.b(-121);
              break L6;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "db.C(" + param0 + ')');
        }
    }

    final void b(boolean param0) {
        RuntimeException runtimeException = null;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = DungeonAssault.field_K;
        try {
          L0: {
            super.b(param0);
            tg.field_f[3] = nb.field_e;
            ((db) this).field_w = new ae(tg.field_f[3].length);
            fk.a((byte) 121, lf.field_w);
            jh.a(((db) this).field_e);
            bf.a(false, -128);
            var2 = new int[4];
            gf.a(var2);
            gf.e(41, 48, 599, 416);
            am.field_a.h(-(am.field_a.field_E / 2) + 320, 48);
            gf.b(var2);
            jh.b();
            ((db) this).field_s = new tf[((db) this).field_w.field_i];
            this.a((byte) -127);
            wd.field_l = new bf[6];
            var3 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var3 >= 6) {
                    break L3;
                  } else {
                    wd.field_l[var3] = new bf(sf.field_b[var3]);
                    var3++;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                ((db) this).field_r = new rh(58, 394, 80, 160, 255, 197376, 240);
                ((db) this).field_t = new rh(580, 394, 80, 160, 255, 197376, 240);
                mh.b(-1);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw vk.a((Throwable) (Object) runtimeException, "db.E(" + param0 + ')');
        }
    }

    private final gd a(int param0, int param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        cn var11 = null;
        cn var12 = null;
        cn var13 = null;
        int var14 = 0;
        cn var15 = null;
        cn var16 = null;
        gd var17 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        gd stackIn_16_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        gd stackOut_15_0 = null;
        try {
          L0: {
            L1: {
              if (param3) {
                stackOut_3_0 = 16777215;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_1_0 = 8421504;
                stackIn_4_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var5_int = stackIn_4_0;
              if (param3) {
                stackOut_7_0 = 8421616;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_5_0 = 4210816;
                stackIn_8_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var6 = stackIn_8_0;
              if (!param3) {
                stackOut_11_0 = 65793;
                stackIn_12_0 = stackOut_11_0;
                break L3;
              } else {
                stackOut_9_0 = 12690143;
                stackIn_12_0 = stackOut_9_0;
                break L3;
              }
            }
            L4: {
              var7 = stackIn_12_0;
              var8 = u.a((se) (Object) field_v, (byte) 68, tc.field_u, param1, var5_int, eh.field_o.field_q - 25);
              var9 = field_v.b(var8);
              var10 = field_v.field_H + la.field_b.field_E;
              var11 = new cn(var9, var10);
              var12 = new cn(var9, var10);
              var13 = new cn(var9, var10);
              jh.c();
              var11.e();
              field_v.b(var8, 0, la.field_b.field_H, var6, -1);
              var12.e();
              gf.a();
              var11.e(0, 0, 16744448);
              var13.e();
              gf.a();
              var11.e(0, 0, var7);
              var14 = -55 % ((-49 - param2) / 36);
              jh.b();
              var15 = rb.a(16, var12, 255, (byte) 81);
              var16 = rb.a(16, var12, 16711680, (byte) -44);
              var17 = new gd(var11, var13, var15, var12, var16, 0, param0);
              var17.field_u = (Object) (Object) new Integer(param1);
              eh.field_o.a((rj) (Object) var17, (byte) -49);
              fo.field_d.a(var17, (byte) -20);
              if (gm.field_d.field_w != param1) {
                break L4;
              } else {
                fo.field_d.a(var17, -256);
                break L4;
              }
            }
            stackOut_15_0 = (gd) var17;
            stackIn_16_0 = stackOut_15_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var5, "db.M(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_16_0;
    }

    final void a(boolean param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int[] var2_array = null;
        int var3 = 0;
        int var4 = 0;
        rj var5 = null;
        int var6 = 0;
        int var7 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_11_0 = 0;
        boolean stackIn_24_0 = false;
        Object stackIn_29_0 = null;
        Object stackIn_31_0 = null;
        Object stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        boolean stackIn_35_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_10_0 = 0;
        boolean stackOut_23_0 = false;
        Object stackOut_28_0 = null;
        Object stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        boolean stackOut_34_0 = false;
        var7 = DungeonAssault.field_K;
        try {
          L0: {
            ((db) this).field_e.b(0, 0);
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~((db) this).field_w.field_i >= ~var2_int) {
                    break L3;
                  } else {
                    stackOut_3_0 = sg.a(3, 3, var2_int);
                    stackIn_11_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0) {
                          this.b(83, var2_int);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var2_int++;
                      if (var7 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_10_0 = 4;
                stackIn_11_0 = stackOut_10_0;
                break L2;
              }
              var2_array = new int[stackIn_11_0];
              gf.a(var2_array);
              gf.e(41, 48, 599, 416);
              var3 = 10;
              var4 = 88;
              le.field_f.h(40 + var3, var4 - 28);
              dh.a(32, 360, 220, 120);
              gf.b(var2_array);
              gf.b(80, 250, 256, 85, 1118481, 128);
              gf.e(80, 250, 256, 85, 5592405, 128);
              var5 = (rj) (Object) ((db) this).field_p.e(-24172);
              L5: while (true) {
                L6: {
                  L7: {
                    L8: {
                      if (var5 == null) {
                        break L8;
                      } else {
                        var5.a(102);
                        var5 = (rj) (Object) ((db) this).field_p.a(4);
                        if (var7 != 0) {
                          break L7;
                        } else {
                          if (var7 == 0) {
                            continue L5;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                    if (null != ((db) this).field_b) {
                      break L7;
                    } else {
                      break L6;
                    }
                  }
                  ((db) this).field_b.a((byte) -118);
                  break L6;
                }
                oe.field_m.h(24, 383);
                oe.field_m.j(560, 383);
                db.e();
                ((db) this).field_r.d();
                ((db) this).field_t.d();
                var6 = 0;
                L9: while (true) {
                  L10: {
                    L11: {
                      if (((db) this).field_w.field_i <= var6) {
                        break L11;
                      } else {
                        stackOut_23_0 = sg.a(3, 3, var6);
                        stackIn_35_0 = stackOut_23_0;
                        stackIn_24_0 = stackOut_23_0;
                        if (var7 != 0) {
                          break L10;
                        } else {
                          L12: {
                            if (stackIn_24_0) {
                              L13: {
                                stackOut_28_0 = this;
                                stackIn_31_0 = stackOut_28_0;
                                stackIn_29_0 = stackOut_28_0;
                                if (((db) this).field_w.field_b != var6) {
                                  stackOut_31_0 = this;
                                  stackOut_31_1 = 0;
                                  stackIn_32_0 = stackOut_31_0;
                                  stackIn_32_1 = stackOut_31_1;
                                  break L13;
                                } else {
                                  stackOut_29_0 = this;
                                  stackOut_29_1 = 1;
                                  stackIn_32_0 = stackOut_29_0;
                                  stackIn_32_1 = stackOut_29_1;
                                  break L13;
                                }
                              }
                              this.a(stackIn_32_1 != 0, var6, 123);
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          var6++;
                          if (var7 == 0) {
                            continue L9;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    stackOut_34_0 = of.field_k;
                    stackIn_35_0 = stackOut_34_0;
                    break L10;
                  }
                  L14: {
                    L15: {
                      if (!stackIn_35_0) {
                        break L15;
                      } else {
                        this.d(true);
                        if (var7 == 0) {
                          break L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                    this.a(197376);
                    break L14;
                  }
                  var5 = (rj) (Object) ((db) this).field_p.e(-24172);
                  L16: while (true) {
                    L17: {
                      L18: {
                        if (null == var5) {
                          break L18;
                        } else {
                          var5.d(0);
                          var5 = (rj) (Object) ((db) this).field_p.a(4);
                          if (var7 != 0) {
                            break L17;
                          } else {
                            if (var7 == 0) {
                              continue L16;
                            } else {
                              break L18;
                            }
                          }
                        }
                      }
                      L19: {
                        if (null == ((db) this).field_b) {
                          break L19;
                        } else {
                          ((db) this).field_b.b(117);
                          break L19;
                        }
                      }
                      bf.field_m.a(320, 25, 1699);
                      break L17;
                    }
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "db.F(" + param0 + ')');
        }
    }

    private final void d(boolean param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        String var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6_int = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        var9 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              var2_int = 461;
              if (param0) {
                break L1;
              } else {
                ((db) this).field_t = null;
                break L1;
              }
            }
            L2: {
              var3 = 170;
              if (null == mk.field_j.field_l) {
                break L2;
              } else {
                L3: {
                  L4: {
                    gf.b(370, 110, 182, 124, 0, 208);
                    var4_int = ((lk) (Object) mk.field_j.field_l).field_O;
                    wd.field_l[var4_int].a(var3, var2_int, true, 100);
                    field_v.c(li.field_b[var4_int], var2_int, var3 - -90, 0, -1);
                    var5 = gm.field_d.field_J[var4_int] + gm.field_d.field_F[var4_int];
                    if (!ve.a(false)) {
                      break L4;
                    } else {
                      if (!hm.field_m[var4_int]) {
                        break L4;
                      } else {
                        if (var5 < 5) {
                          break L4;
                        } else {
                          stackOut_12_0 = 1;
                          stackIn_15_0 = stackOut_12_0;
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L3;
                }
                L5: {
                  var6_int = stackIn_15_0;
                  if (var6_int != 0) {
                    break L5;
                  } else {
                    L6: {
                      var7 = (10 + var5) * fj.field_g[var4_int] / 10;
                      if (var7 <= gm.field_d.field_s) {
                        stackOut_19_0 = 0;
                        stackIn_20_0 = stackOut_19_0;
                        break L6;
                      } else {
                        stackOut_17_0 = 16711680;
                        stackIn_20_0 = stackOut_17_0;
                        break L6;
                      }
                    }
                    var8 = stackIn_20_0;
                    field_v.c(jk.a(new String[1], ho.field_c, 30496), var2_int, 105 + var3, var8, -1);
                    int discarded$4 = la.field_b.a(un.field_a[var4_int], -80 + var2_int, var3 - -120, 160, 100, 0, -1, 1, 0, la.field_b.field_H);
                    if (var9 == 0) {
                      break L2;
                    } else {
                      break L5;
                    }
                  }
                }
                int discarded$5 = la.field_b.a(bl.field_b, -80 + var2_int, var3 + 120, 160, 100, 0, -1, 1, 0, la.field_b.field_H);
                break L2;
              }
            }
            L7: {
              var4 = ng.field_L;
              var5 = 16777215;
              if (0 < gm.field_d.field_e) {
                L8: {
                  L9: {
                    if (1 < gm.field_d.field_e) {
                      break L9;
                    } else {
                      var4 = oc.field_v;
                      if (var9 == 0) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  var4 = jk.a(new String[1], dg.field_G, 30496);
                  break L8;
                }
                var5 = 16711680;
                var6 = jk.a(new String[1], fl.field_n, 30496);
                int discarded$6 = la.field_b.a(var6, 80, 338, 250, 180, var5, -1, 1, 0, field_v.field_H);
                break L7;
              } else {
                break L7;
              }
            }
            int discarded$7 = la.field_b.a(var4, 80, -la.field_b.field_H + 211, 250, 45, var5, -1, 1, 2, field_v.field_H);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "db.G(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, boolean param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = tg.field_f[3][param0];
              if (param1 == -1) {
                break L1;
              } else {
                field_u = null;
                break L1;
              }
            }
            L2: {
              if (!((db) this).field_w.c(97)) {
                break L2;
              } else {
                if (!sg.a(3, 3, param0)) {
                  break L2;
                } else {
                  if (rp.a(param1 ^ -15204377, var4_int)) {
                    hm.a(var4_int, param0, param2, -64);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw vk.a((Throwable) (Object) runtimeException, "db.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void f() {
        RuntimeException var1 = null;
        int stackIn_15_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        try {
          L0: {
            if (mm.field_t == 13) {
              gd.a(ec.field_p, 0, ec.field_p, false);
              return;
            } else {
              L1: {
                if (!ll.field_k) {
                  break L1;
                } else {
                  if (mm.field_t != 1) {
                    break L1;
                  } else {
                    L2: {
                      if (ld.field_b) {
                        stackOut_14_0 = 0;
                        stackIn_15_0 = stackOut_14_0;
                        break L2;
                      } else {
                        stackOut_12_0 = 1;
                        stackIn_15_0 = stackOut_12_0;
                        break L2;
                      }
                    }
                    ld.field_b = stackIn_15_0 != 0;
                    break L1;
                  }
                }
              }
              L3: {
                if (null != ((db) this).field_b) {
                  break L3;
                } else {
                  L4: {
                    ((db) this).field_w.d(0);
                    if (((db) this).field_w.field_b == -1) {
                      break L4;
                    } else {
                      this.a(((db) this).field_w.field_b, -1, false);
                      if (DungeonAssault.field_K == 0) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
              ((db) this).field_b.b(false);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var1, "db.S()");
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final int a(int param0, int param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_22_0 = 0;
        int stackOut_25_0 = 0;
        var6 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (param2 == -117) {
                break L1;
              } else {
                ((db) this).c(true);
                break L1;
              }
            }
            var4_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (~tg.field_f[3].length >= ~var4_int) {
                    break L4;
                  } else {
                    var5 = o.a(3, (byte) 95, var4_int);
                    stackOut_6_0 = sg.a(3, 3, var4_int);
                    stackIn_26_0 = stackOut_6_0 ? 1 : 0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var6 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (!stackIn_7_0) {
                          break L5;
                        } else {
                          if (param1 < bh.b(var4_int, 3, false)) {
                            break L5;
                          } else {
                            if (~qd.a(var4_int, param2 ^ -265, 3) >= ~param1) {
                              break L5;
                            } else {
                              if (param0 < var5) {
                                break L5;
                              } else {
                                if (~param0 <= ~(var5 - -kf.a(var4_int, 3, -100))) {
                                  break L5;
                                } else {
                                  stackOut_22_0 = var4_int;
                                  stackIn_23_0 = stackOut_22_0;
                                  return stackIn_23_0;
                                }
                              }
                            }
                          }
                        }
                      }
                      var4_int++;
                      if (var6 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_25_0 = -1;
                stackIn_26_0 = stackOut_25_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var4, "db.N(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_26_0;
    }

    public static void c(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_v = null;
              if (param0 >= 87) {
                break L1;
              } else {
                field_u = null;
                break L1;
              }
            }
            field_u = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var1, "db.O(" + param0 + ')');
        }
    }

    db() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "Quit to website";
    }
}
