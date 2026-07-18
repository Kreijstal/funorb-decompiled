/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf extends hd {
    static String field_Ab;
    int field_Fb;
    private int field_zb;
    private gr field_Hb;
    static int field_Gb;
    private hn field_Bb;
    static volatile boolean field_Ib;
    static ut field_Cb;
    static String field_Db;
    static String field_yb;
    kq[] field_Eb;

    final static void a(ut[] param0) {
        int var2_int = 0;
        int var3 = Kickabout.field_G;
        try {
            gk.field_a = param0;
            sq.field_F = new ut[2];
            for (var2_int = 0; 2 > var2_int; var2_int++) {
                sq.field_F[var2_int] = gk.field_a[var2_int].b();
                nh.a(sq.field_F[var2_int], 0.0, 0.0, 1.0);
            }
            vb.field_l = gk.field_a[2];
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "mf.C(" + (param0 != null ? "{...}" : "null") + ',' + true + ')');
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        kq var3_ref_kq = null;
        int var4_int = 0;
        kq var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_42_0 = 0;
        int stackIn_50_0 = 0;
        kq stackIn_66_0 = null;
        kq stackIn_67_0 = null;
        kq stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        int stackIn_74_0 = 0;
        kq stackIn_75_0 = null;
        kq stackIn_76_0 = null;
        kq stackIn_77_0 = null;
        kq stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        kq stackIn_79_0 = null;
        kq stackIn_80_0 = null;
        kq stackIn_81_0 = null;
        kq stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        int stackOut_73_0 = 0;
        int stackOut_72_0 = 0;
        kq stackOut_74_0 = null;
        kq stackOut_75_0 = null;
        kq stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        kq stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        kq stackOut_78_0 = null;
        kq stackOut_79_0 = null;
        kq stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        kq stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        kq stackOut_65_0 = null;
        kq stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        kq stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        L0: {
          var10 = Kickabout.field_G;
          if (((mf) this).field_zb <= 0) {
            break L0;
          } else {
            ((mf) this).field_zb = ((mf) this).field_zb - 1;
            break L0;
          }
        }
        L1: {
          if (param0 == 48) {
            break L1;
          } else {
            ((mf) this).a(-10);
            break L1;
          }
        }
        var2 = 0;
        L2: while (true) {
          if (var2 >= 9) {
            var2 = -1;
            var3 = 0;
            L3: while (true) {
              if (9 <= var3) {
                L4: {
                  if (-1 == var2) {
                    var3 = 0;
                    L5: while (true) {
                      if (var3 >= 9) {
                        break L4;
                      } else {
                        L6: {
                          var4 = ((mf) this).field_Eb[var3];
                          if (!var4.field_Eb.c(param0 ^ -50)) {
                            stackOut_73_0 = 0;
                            stackIn_74_0 = stackOut_73_0;
                            break L6;
                          } else {
                            stackOut_72_0 = 1;
                            stackIn_74_0 = stackOut_72_0;
                            break L6;
                          }
                        }
                        L7: {
                          L8: {
                            var5 = stackIn_74_0;
                            stackOut_74_0 = (kq) var4;
                            stackIn_77_0 = stackOut_74_0;
                            stackIn_75_0 = stackOut_74_0;
                            if (var5 != 0) {
                              break L8;
                            } else {
                              stackOut_75_0 = (kq) (Object) stackIn_75_0;
                              stackIn_77_0 = stackOut_75_0;
                              stackIn_76_0 = stackOut_75_0;
                              if (!var4.field_Q) {
                                break L8;
                              } else {
                                stackOut_76_0 = (kq) (Object) stackIn_76_0;
                                stackOut_76_1 = 1;
                                stackIn_78_0 = stackOut_76_0;
                                stackIn_78_1 = stackOut_76_1;
                                break L7;
                              }
                            }
                          }
                          stackOut_77_0 = (kq) (Object) stackIn_77_0;
                          stackOut_77_1 = 0;
                          stackIn_78_0 = stackOut_77_0;
                          stackIn_78_1 = stackOut_77_1;
                          break L7;
                        }
                        L9: {
                          L10: {
                            stackIn_78_0.field_zb = stackIn_78_1 != 0;
                            stackOut_78_0 = (kq) var4;
                            stackIn_81_0 = stackOut_78_0;
                            stackIn_79_0 = stackOut_78_0;
                            if (var5 != 0) {
                              break L10;
                            } else {
                              stackOut_79_0 = (kq) (Object) stackIn_79_0;
                              stackIn_81_0 = stackOut_79_0;
                              stackIn_80_0 = stackOut_79_0;
                              if (((mf) this).field_Fb != var3) {
                                break L10;
                              } else {
                                stackOut_80_0 = (kq) (Object) stackIn_80_0;
                                stackOut_80_1 = 1;
                                stackIn_82_0 = stackOut_80_0;
                                stackIn_82_1 = stackOut_80_1;
                                break L9;
                              }
                            }
                          }
                          stackOut_81_0 = (kq) (Object) stackIn_81_0;
                          stackOut_81_1 = 0;
                          stackIn_82_0 = stackOut_81_0;
                          stackIn_82_1 = stackOut_81_1;
                          break L9;
                        }
                        stackIn_82_0.field_Kb = stackIn_82_1 != 0;
                        var3++;
                        continue L5;
                      }
                    }
                  } else {
                    if (!((mf) this).field_Eb[var2].field_Eb.c(-2)) {
                      ((mf) this).field_Fb = var2;
                      var3 = 0;
                      L11: while (true) {
                        if (9 <= var3) {
                          break L4;
                        } else {
                          L12: {
                            ((mf) this).field_Eb[var3].field_Kb = false;
                            stackOut_65_0 = ((mf) this).field_Eb[var3];
                            stackIn_67_0 = stackOut_65_0;
                            stackIn_66_0 = stackOut_65_0;
                            if (var2 != var3) {
                              stackOut_67_0 = (kq) (Object) stackIn_67_0;
                              stackOut_67_1 = 0;
                              stackIn_68_0 = stackOut_67_0;
                              stackIn_68_1 = stackOut_67_1;
                              break L12;
                            } else {
                              stackOut_66_0 = (kq) (Object) stackIn_66_0;
                              stackOut_66_1 = 1;
                              stackIn_68_0 = stackOut_66_0;
                              stackIn_68_1 = stackOut_66_1;
                              break L12;
                            }
                          }
                          stackIn_68_0.field_zb = stackIn_68_1 != 0;
                          var3++;
                          continue L11;
                        }
                      }
                    } else {
                      ((mf) this).field_Fb = -1;
                      break L4;
                    }
                  }
                }
                return;
              } else {
                L13: {
                  if (((mf) this).field_Eb[var3].field_sb == 0) {
                    break L13;
                  } else {
                    if (((mf) this).field_Eb[var3].field_Eb.c(-2)) {
                      break L13;
                    } else {
                      kj.a((byte) -123);
                      break L13;
                    }
                  }
                }
                if (((mf) this).field_Eb[var3].field_qb != 0) {
                  var2 = var3;
                  var3++;
                  continue L3;
                } else {
                  var3++;
                  continue L3;
                }
              }
            }
          } else {
            L14: {
              var3_ref_kq = ((mf) this).field_Eb[var2];
              var4_int = ((mf) this).field_Hb.field_q[var2];
              var3_ref_kq.a(((mf) this).field_Hb.field_R, ((mf) this).field_Hb.field_w, (byte) 127, ((mf) this).field_Hb.field_k, ((mf) this).field_Hb.field_i[var4_int]);
              var3_ref_kq.a((byte) 25, ((mf) this).field_Hb, var4_int);
              if (var3_ref_kq.field_Eb.c(-2)) {
                break L14;
              } else {
                if (var3_ref_kq.field_qb == 0) {
                  break L14;
                } else {
                  L15: {
                    var3_ref_kq.field_s = -var3_ref_kq.field_bb + (-((mf) this).field_F + wt.field_x);
                    var3_ref_kq.field_J = -var3_ref_kq.field_M + -((mf) this).field_T + us.field_j;
                    var5 = 10 + (((mf) this).field_q + -var3_ref_kq.field_q);
                    var6 = 10 + -var3_ref_kq.field_mb + ((mf) this).field_mb;
                    if (var5 >= var3_ref_kq.field_s) {
                      break L15;
                    } else {
                      var3_ref_kq.field_s = var5;
                      break L15;
                    }
                  }
                  L16: {
                    if (var3_ref_kq.field_s < -10) {
                      var3_ref_kq.field_s = -10;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  L17: {
                    if (-10 <= var3_ref_kq.field_J) {
                      break L17;
                    } else {
                      var3_ref_kq.field_J = -10;
                      break L17;
                    }
                  }
                  L18: {
                    if (var6 < var3_ref_kq.field_J) {
                      var3_ref_kq.field_J = var6;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  var3_ref_kq.field_F = ((mf) this).field_F - -var3_ref_kq.field_s;
                  var3_ref_kq.field_T = var3_ref_kq.field_J + ((mf) this).field_T;
                  var7 = (var3_ref_kq.field_bb + var3_ref_kq.field_s) / 52;
                  var8 = (var3_ref_kq.field_M + var3_ref_kq.field_J) / 75;
                  if (var7 >= 0) {
                    if (var8 >= 0) {
                      if (var7 < 3) {
                        if (var8 < 3) {
                          var9 = var7 - -(var8 * 3);
                          if (var3_ref_kq != ((mf) this).field_Eb[var9]) {
                            L19: {
                              if (!(cq.field_h instanceof ta)) {
                                ((mf) this).field_Bb = ((mf) this).field_Hb.a(var9, -123, var2);
                                int discarded$2 = 15137;
                                ((mf) this).field_Hb.a(((mf) this).field_Bb, cq.e(), 0);
                                break L19;
                              } else {
                                di.a(var2, true, var9);
                                break L19;
                              }
                            }
                            ((mf) this).field_Eb[var2] = ((mf) this).field_Eb[var9];
                            ((mf) this).field_Eb[var9] = var3_ref_kq;
                            if (((mf) this).field_zb == 0) {
                              wh discarded$3 = sp.c(54, -108);
                              ((mf) this).field_zb = 5;
                              var2++;
                              continue L2;
                            } else {
                              var2++;
                              continue L2;
                            }
                          } else {
                            var2++;
                            continue L2;
                          }
                        } else {
                          var2++;
                          continue L2;
                        }
                      } else {
                        var2++;
                        continue L2;
                      }
                    } else {
                      var2++;
                      continue L2;
                    }
                  } else {
                    var2++;
                    continue L2;
                  }
                }
              }
            }
            L20: {
              var5 = this.a((byte) -53, var2);
              var6 = this.b(var2, -96);
              if (var3_ref_kq.field_s != var5) {
                L21: {
                  var7 = -var3_ref_kq.field_s + (3 * var3_ref_kq.field_s + var5 >> 2);
                  if (var7 == 0) {
                    L22: {
                      if (var3_ref_kq.field_s >= var5) {
                        stackOut_41_0 = -1;
                        stackIn_42_0 = stackOut_41_0;
                        break L22;
                      } else {
                        stackOut_40_0 = 1;
                        stackIn_42_0 = stackOut_40_0;
                        break L22;
                      }
                    }
                    var7 = stackIn_42_0;
                    break L21;
                  } else {
                    break L21;
                  }
                }
                var3_ref_kq.field_s = var3_ref_kq.field_s + var7;
                break L20;
              } else {
                break L20;
              }
            }
            if (var6 != var3_ref_kq.field_J) {
              L23: {
                var7 = -var3_ref_kq.field_J + (3 * var3_ref_kq.field_J + var6 >> 2);
                if (var7 != 0) {
                  break L23;
                } else {
                  L24: {
                    if (var3_ref_kq.field_J >= var6) {
                      stackOut_49_0 = -1;
                      stackIn_50_0 = stackOut_49_0;
                      break L24;
                    } else {
                      stackOut_48_0 = 1;
                      stackIn_50_0 = stackOut_48_0;
                      break L24;
                    }
                  }
                  var7 = stackIn_50_0;
                  break L23;
                }
              }
              var3_ref_kq.field_J = var3_ref_kq.field_J + var7;
              var2++;
              continue L2;
            } else {
              var2++;
              continue L2;
            }
          }
        }
    }

    final static void a(byte param0, ml param1, boolean param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        bc[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        bc var14 = null;
        bc var15 = null;
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var12 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var3_int = un.field_e.i(-107);
              var4 = un.field_e.h((byte) -121);
              var5 = un.field_e.h((byte) -118);
              if (je.field_k == var5) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            var6 = stackIn_4_0;
            var7 = new bc[var4];
            var8 = 0;
            L2: while (true) {
              if (var4 <= var8) {
                L3: {
                  bf.field_y.a(2, var7, nj.a(81));
                  if (param2) {
                    break L3;
                  } else {
                    if (var6 == 0) {
                      break L3;
                    } else {
                      uv.field_f = false;
                      return;
                    }
                  }
                }
                L4: {
                  je.field_k = var5;
                  pu.field_Db[je.field_k] = var3_int;
                  jh.field_Hb.field_Db.a(true, 317, jh.field_Hb.field_Db.field_s, jh.field_Hb.field_Db.field_J, var3_int * 18 - -6);
                  if (var6 != 0) {
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    break L4;
                  } else {
                    stackOut_12_0 = jh.field_Hb.field_Db.field_J;
                    stackIn_14_0 = stackOut_12_0;
                    break L4;
                  }
                }
                var8 = stackIn_14_0;
                L5: {
                  jh.field_Hb.a(15, 20, 2, (byte) -114, 230, 344, 170);
                  jh.field_Hb.field_Db.field_J = var8;
                  if (!param2) {
                    break L5;
                  } else {
                    var9 = -1;
                    var10 = 0;
                    L6: while (true) {
                      L7: {
                        if (var10 >= var7.length) {
                          break L7;
                        } else {
                          L8: {
                            var14 = var7[var10];
                            if (!var14.field_a) {
                              break L8;
                            } else {
                              if (hm.a((byte) 121, var14.field_f)) {
                                break L8;
                              } else {
                                var9 = var14.field_g;
                                break L7;
                              }
                            }
                          }
                          var10++;
                          continue L6;
                        }
                      }
                      L9: {
                        if (-1 != var9) {
                          break L9;
                        } else {
                          wh.field_w = 150;
                          var13 = 0;
                          var10 = var13;
                          L10: while (true) {
                            if (var7.length <= var13) {
                              break L9;
                            } else {
                              var15 = var7[var13];
                              if (hm.a((byte) 45, var15.field_f)) {
                                var9 = var15.field_g;
                                break L9;
                              } else {
                                var13++;
                                continue L10;
                              }
                            }
                          }
                        }
                      }
                      if (var9 != -1) {
                        L11: {
                          if (var9 <= 4) {
                            jh.field_Hb.field_Db.field_J = 0;
                            break L11;
                          } else {
                            if (var3_int + -5 < var9) {
                              jh.field_Hb.field_Db.field_J = -(18 * (var3_int + -10));
                              break L11;
                            } else {
                              jh.field_Hb.field_Db.field_J = -(18 * (var9 - 4));
                              break L11;
                            }
                          }
                        }
                        int discarded$2 = -72;
                        field_Gb = vc.a(18, -(jh.field_Hb.field_Db.field_J + 5));
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                qh.a(94);
                uv.field_f = false;
                break L0;
              } else {
                int discarded$3 = 18653;
                var7[var8] = lh.a((iw) (Object) un.field_e);
                var8++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var3 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) var3;
            stackOut_40_1 = new StringBuilder().append("mf.D(").append(-105).append(',');
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param1 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L12;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L12;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_43_0, stackIn_43_2 + ',' + param2 + ')');
        }
    }

    private final int a(byte param0, int param1) {
        return 52 * (param1 % 3);
    }

    final void c(boolean param0) {
        int var2 = 0;
        L0: {
          if (la.a(100)) {
            break L0;
          } else {
            if (null == ((mf) this).field_Bb) {
              break L0;
            } else {
              L1: {
                or.field_d.b(81, (byte) 84);
                or.field_d.field_n = or.field_d.field_n + 2;
                var2 = or.field_d.field_n;
                or.field_d.a(106, 1);
                ((mf) this).field_Bb.a(1, (iw) (Object) or.field_d);
                or.field_d.d(-var2 + or.field_d.field_n, 62);
                if (param0) {
                  break L1;
                } else {
                  field_Gb = 97;
                  break L1;
                }
              }
              return;
            }
          }
        }
    }

    final kq j(byte param0) {
        if (param0 != 21) {
            return null;
        }
        return ((mf) this).field_Fb == -1 ? null : ((mf) this).field_Eb[((mf) this).field_Fb];
    }

    private final int b(int param0, int param1) {
        int var3 = -49;
        return 75 * (param0 / 3);
    }

    final static String a(int param0, CharSequence[] param1) {
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        int var8 = 0;
        CharSequence var9 = null;
        int var10 = 0;
        CharSequence var11 = null;
        String stackIn_3_0 = null;
        String stackIn_9_0 = null;
        String stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_8_0 = null;
        String stackOut_22_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var10 = Kickabout.field_G;
        try {
          L0: {
            if (0 != param0) {
              if (param0 == 1) {
                var11 = param1[0];
                var4 = var11;
                if (var4 == null) {
                  stackOut_8_0 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                } else {
                  return ((Object) (Object) var11).toString();
                }
              } else {
                var4_int = param0;
                var5 = 0;
                var6_int = 0;
                L1: while (true) {
                  if (var4_int <= var6_int) {
                    var6 = new StringBuilder(var5);
                    var8 = 108;
                    var7 = 0;
                    L2: while (true) {
                      if (var7 >= var4_int) {
                        stackOut_22_0 = var6.toString();
                        stackIn_23_0 = stackOut_22_0;
                        break L0;
                      } else {
                        L3: {
                          var9 = param1[var7];
                          if (var9 != null) {
                            StringBuilder discarded$5 = var6.append(var9);
                            break L3;
                          } else {
                            StringBuilder discarded$6 = var6.append("null");
                            break L3;
                          }
                        }
                        var7++;
                        continue L2;
                      }
                    }
                  } else {
                    L4: {
                      var7_ref_CharSequence = param1[var6_int];
                      if (var7_ref_CharSequence == null) {
                        var5 += 4;
                        break L4;
                      } else {
                        var5 = var5 + var7_ref_CharSequence.length();
                        break L4;
                      }
                    }
                    var6_int++;
                    continue L1;
                  }
                }
              }
            } else {
              stackOut_2_0 = "";
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var4_ref;
            stackOut_24_1 = new StringBuilder().append("mf.I(").append(param0).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L5;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L5;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + 99 + ',' + 0 + ')');
        }
        return stackIn_23_0;
    }

    public static void i() {
        field_Db = null;
        field_Ab = null;
        field_Cb = null;
        int var1 = -70;
        field_yb = null;
    }

    final static void b() {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Kickabout.field_G;
        try {
          L0: {
            pt.a(640, -22914, 0, 480, 390);
            var1_int = -e.field_j + 480;
            var2 = 0;
            L1: while (true) {
              L2: {
                if (var2 >= bk.field_c.length) {
                  break L2;
                } else {
                  if (null == bk.field_c[var2]) {
                    break L2;
                  } else {
                    bk.field_c[var2].a(-65, var1_int);
                    var1_int -= 18;
                    var2++;
                    continue L1;
                  }
                }
              }
              ta.e(127);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw nb.a((Throwable) (Object) runtimeException, "mf.K(" + -109 + ')');
        }
    }

    mf(gr param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        ((mf) this).field_Fb = -1;
        try {
          L0: {
            ((mf) this).field_Eb = new kq[9];
            ((mf) this).field_zb = 0;
            ((mf) this).field_q = 156;
            ((mf) this).field_Hb = param0;
            ((mf) this).field_mb = 225;
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= 9) {
                break L0;
              } else {
                ((mf) this).field_Eb[var2_int] = new kq();
                ((mf) this).field_Eb[var2_int].a(true, 52, this.a((byte) -53, var2_int), this.b(var2_int, -96), 75);
                ((mf) this).a((byte) -117, (hd) (Object) ((mf) this).field_Eb[var2_int]);
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("mf.<init>(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    final static byte a(char param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          L1: {
            L2: {
              var3 = Kickabout.field_G;
              if (0 >= param0) {
                break L2;
              } else {
                if (param0 < 128) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (param0 < 160) {
                break L3;
              } else {
                if (param0 <= 255) {
                  break L1;
                } else {
                  break L3;
                }
              }
            }
            if (param0 != 8364) {
              if (param0 != 8218) {
                if (param0 == 402) {
                  var2 = -125;
                  break L0;
                } else {
                  if (param0 != 8222) {
                    if (8230 == param0) {
                      var2 = -123;
                      break L0;
                    } else {
                      if (8224 != param0) {
                        if (param0 == 8225) {
                          var2 = -121;
                          break L0;
                        } else {
                          if (param0 != 710) {
                            if (8240 != param0) {
                              if (param0 == 352) {
                                var2 = -118;
                                break L0;
                              } else {
                                if (param0 == 8249) {
                                  var2 = -117;
                                  break L0;
                                } else {
                                  if (param0 == 338) {
                                    var2 = -116;
                                    break L0;
                                  } else {
                                    if (param0 == 381) {
                                      var2 = -114;
                                      break L0;
                                    } else {
                                      if (param0 != 8216) {
                                        if (param0 != 8217) {
                                          if (param0 == 8220) {
                                            var2 = -109;
                                            break L0;
                                          } else {
                                            if (param0 == 8221) {
                                              var2 = -108;
                                              break L0;
                                            } else {
                                              if (param0 != 8226) {
                                                if (param0 == 8211) {
                                                  var2 = -106;
                                                  break L0;
                                                } else {
                                                  if (8212 == param0) {
                                                    var2 = -105;
                                                    break L0;
                                                  } else {
                                                    if (param0 != 732) {
                                                      if (param0 != 8482) {
                                                        if (param0 != 353) {
                                                          if (param0 != 8250) {
                                                            if (339 == param0) {
                                                              var2 = -100;
                                                              break L0;
                                                            } else {
                                                              if (param0 != 382) {
                                                                if (param0 == 376) {
                                                                  var2 = -97;
                                                                  break L0;
                                                                } else {
                                                                  var2 = 63;
                                                                  break L0;
                                                                }
                                                              } else {
                                                                var2 = -98;
                                                                break L0;
                                                              }
                                                            }
                                                          } else {
                                                            var2 = -101;
                                                            break L0;
                                                          }
                                                        } else {
                                                          var2 = -102;
                                                          break L0;
                                                        }
                                                      } else {
                                                        var2 = -103;
                                                        break L0;
                                                      }
                                                    } else {
                                                      var2 = -104;
                                                      break L0;
                                                    }
                                                  }
                                                }
                                              } else {
                                                var2 = -107;
                                                break L0;
                                              }
                                            }
                                          }
                                        } else {
                                          var2 = -110;
                                          break L0;
                                        }
                                      } else {
                                        var2 = -111;
                                        break L0;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              var2 = -119;
                              break L0;
                            }
                          } else {
                            var2 = -120;
                            break L0;
                          }
                        }
                      } else {
                        var2 = -122;
                        break L0;
                      }
                    }
                  } else {
                    var2 = -124;
                    break L0;
                  }
                }
              } else {
                var2 = -126;
                break L0;
              }
            } else {
              var2 = -128;
              break L0;
            }
          }
          var2 = (byte)param0;
          break L0;
        }
        return (byte) var2;
    }

    final static void a(int param0, byte param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        wd var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param1 < -70) {
                break L1;
              } else {
                field_yb = null;
                break L1;
              }
            }
            var4 = (wd) (Object) ak.field_i.g(24009);
            L2: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                int discarded$4 = 7;
                vg.a(true, var4);
                var4 = (wd) (Object) ak.field_i.c(33);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "mf.L(" + 7 + ',' + param1 + ')');
        }
    }

    final void k(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4_int = 0;
        Object var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Kickabout.field_G;
        var2 = -1;
        var3 = -1;
        var4_int = 0;
        L0: while (true) {
          if (9 <= var4_int) {
            gd.a(var3, ((mf) this).field_T, ((mf) this).field_F, (byte) -96, var2);
            var5 = -84 % ((param0 - -35) / 60);
            var4 = null;
            pt.a(((mf) this).field_F + ((mf) this).field_q, -22914, ((mf) this).field_F, ((mf) this).field_mb + ((mf) this).field_T, ((mf) this).field_T);
            var6 = 0;
            L1: while (true) {
              if (var6 >= 9) {
                L2: {
                  if (var4 == null) {
                    break L2;
                  } else {
                    ((kq) var4).h((byte) -118);
                    break L2;
                  }
                }
                ta.e(121);
                return;
              } else {
                if (0 != ((mf) this).field_Eb[var6].field_qb) {
                  var4 = (Object) (Object) ((mf) this).field_Eb[var6];
                  var6++;
                  continue L1;
                } else {
                  ((mf) this).field_Eb[var6].h((byte) -125);
                  var6++;
                  continue L1;
                }
              }
            }
          } else {
            if (!((mf) this).field_Eb[var4_int].field_Kb) {
              if (((mf) this).field_Eb[var4_int].field_zb) {
                var2 = var4_int;
                var4_int++;
                continue L0;
              } else {
                var4_int++;
                continue L0;
              }
            } else {
              var3 = var4_int;
              var4_int++;
              continue L0;
            }
          }
        }
    }

    final static wn a(boolean param0, int param1) {
        wn var2 = new wn(true);
        var2.field_c = param0 ? true : false;
        if (param1 <= 29) {
            return null;
        }
        return var2;
    }

    final static void h() {
        if (null == ge.field_o) {
          df.field_F = new String[8];
          df.field_F[7] = kr.field_c;
          fs.field_a = new String[]{s.field_F, ku.field_a};
          rd.field_e = new String[]{gm.field_Q};
          df.field_F[1] = uq.field_f;
          df.field_F[4] = kr.field_d;
          df.field_F[6] = pq.field_M;
          df.field_F[0] = qs.field_H;
          ge.field_o = new String[57];
          pd.field_M = new String[]{mc.field_g, ku.field_a};
          ow.field_d = new String[]{fb.field_C, iv.field_n, ku.field_a};
          si.field_q = new String[]{s.field_F, lh.field_F};
          df.field_F[3] = rl.field_t;
          vq.field_i = new String[]{s.field_F, mc.field_g};
          fp.field_u = new String[]{s.field_F};
          df.field_F[2] = m.field_i;
          df.field_F[5] = fc.field_e;
          nn.field_I = new String[]{ob.field_H, in.field_a, ku.field_a};
          ge.field_o[10] = nj.field_b;
          ge.field_o[12] = ns.field_b;
          ge.field_o[3] = sl.field_zb;
          ge.field_o[4] = pe.field_b;
          ge.field_o[2] = ta.field_E;
          ge.field_o[25] = tk.field_Bb;
          ge.field_o[28] = pr.field_b;
          ge.field_o[55] = jo.field_B;
          ge.field_o[8] = om.field_Eb;
          ge.field_o[27] = lg.field_c;
          ge.field_o[9] = fb.field_N;
          ge.field_o[0] = bo.field_zb;
          ge.field_o[6] = dw.field_a;
          ge.field_o[5] = io.field_i;
          ge.field_o[1] = h.field_c;
          ge.field_o[7] = at.field_Fb;
          ge.field_o[15] = hn.field_e;
          ge.field_o[24] = ah.field_f;
          ge.field_o[18] = o.field_b;
          ge.field_o[23] = nb.field_h;
          ge.field_o[40] = ms.field_a;
          ge.field_o[14] = wh.field_h;
          ge.field_o[43] = at.field_Fb;
          ge.field_o[45] = us.field_g;
          ge.field_o[39] = wq.field_f;
          ge.field_o[41] = lk.field_i;
          ge.field_o[19] = io.field_c;
          ge.field_o[38] = sl.field_Ab;
          ge.field_o[47] = ni.field_e;
          ge.field_o[36] = di.field_a;
          ge.field_o[11] = nj.field_c;
          ge.field_o[22] = dn.field_Db;
          ge.field_o[33] = hh.field_a;
          ge.field_o[26] = kj.field_c;
          ge.field_o[16] = ea.field_b;
          ge.field_o[29] = ge.field_o[4];
          ge.field_o[35] = lj.field_m;
          ge.field_o[42] = at.field_Fb;
          ge.field_o[21] = ei.field_f;
          ge.field_o[44] = o.field_b;
          ge.field_o[13] = cu.field_f[0];
          ge.field_o[20] = ol.field_n;
          ge.field_o[17] = kd.field_A;
          ge.field_o[34] = lo.field_m;
          ge.field_o[48] = oc.field_b.toUpperCase();
          ge.field_o[30] = "";
          ge.field_o[50] = lw.field_h;
          ge.field_o[46] = ii.field_h;
          ge.field_o[52] = ia.field_h;
          ge.field_o[32] = "";
          ge.field_o[56] = ia.field_h;
          ge.field_o[54] = ow.field_a;
          ge.field_o[53] = ul.field_b;
          ge.field_o[51] = vp.field_d;
          ge.field_o[49] = aw.field_K;
          ge.field_o[37] = "";
          oc.field_b = oc.field_b.toLowerCase();
          da.field_i = da.field_i.toLowerCase();
          fa.field_g = new String[57];
          fa.field_g[28] = rd.field_b;
          fa.field_g[26] = pn.field_C;
          fa.field_g[46] = iq.field_b;
          rv.field_d = new String[24];
          fa.field_g[48] = ep.field_a;
          fa.field_g[45] = nd.field_a;
          rv.field_d[18] = ef.field_s;
          rv.field_d[1] = jo.field_C;
          rv.field_d[4] = cp.field_a;
          rv.field_d[7] = rr.field_a;
          kp.field_g = new String[4];
          rv.field_d[22] = ni.field_n;
          rv.field_d[0] = rv.field_a;
          rv.field_d[5] = rq.field_B;
          rv.field_d[10] = hm.field_C;
          rv.field_d[17] = gt.field_r;
          rv.field_d[20] = gt.field_m;
          rv.field_d[21] = pf.field_a;
          rv.field_d[15] = dr.field_f;
          rv.field_d[16] = qk.field_F;
          rv.field_d[23] = aj.field_d;
          rv.field_d[6] = i.field_w;
          rv.field_d[9] = cg.field_L;
          rv.field_d[12] = md.field_g;
          rv.field_d[19] = np.field_yb;
          rv.field_d[3] = nr.field_l;
          rv.field_d[14] = mc.field_c;
          rv.field_d[2] = mt.field_c;
          rv.field_d[8] = jk.field_o;
          rv.field_d[13] = ld.field_d;
          rv.field_d[11] = bw.field_c;
          kp.field_g[0] = lt.field_b;
          kp.field_g[2] = ij.field_n;
          kp.field_g[3] = qp.field_C;
          kp.field_g[1] = qk.field_G;
          qb.field_Qb = new String[4];
          eb.field_g = new String[4];
          qb.field_Qb[0] = at.field_Bb;
          qb.field_Qb[3] = op.field_u;
          qb.field_Qb[1] = wr.field_g;
          qb.field_Qb[2] = mo.field_a;
          eb.field_g[1] = qa.field_F;
          eb.field_g[3] = bv.field_n;
          eb.field_g[0] = av.field_d;
          eb.field_g[2] = bb.field_Db;
          return;
        } else {
          return;
        }
    }

    final static ki a(int param0, int param1, byte param2) {
        return new ki(3, param1, param0, (byte) 0, (byte) 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Ab = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_Gb = 0;
        field_Ib = false;
        field_yb = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
