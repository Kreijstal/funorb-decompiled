/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sr {
    int field_g;
    static String field_d;
    int field_h;
    static boolean[] field_c;
    int field_f;
    static long field_a;
    int field_e;
    static sna field_b;

    public static void b(byte param0) {
        field_d = null;
        field_c = null;
        if (param0 < 125) {
            field_a = -105L;
        }
        field_b = null;
    }

    final static void a(boolean param0, boolean param1, int param2, boolean param3) {
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_16_0 = 0;
        String stackIn_30_0 = null;
        sna stackIn_40_0 = null;
        sna stackIn_41_0 = null;
        String stackIn_41_1 = null;
        sna stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        String[] stackIn_43_2 = null;
        sna stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        String[] stackIn_44_2 = null;
        String stackIn_44_3 = null;
        sna stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        sna stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        int stackIn_73_2 = 0;
        sna stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        sna stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        int stackIn_78_2 = 0;
        sna stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        sna stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        int stackIn_83_2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        sna var5 = null;
        sna var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        Object var9 = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        String var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        sna var15 = null;
        String var16 = null;
        sna var17 = null;
        var12 = BachelorFridge.field_y;
        try {
          L0: {
            if (param0) {
              L1: {
                stackIn_5_0 = ld.field_p;

                if (param0) {
                  stackIn_6_0 = stackIn_5_0;
                  stackIn_6_1 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = stackIn_5_0;
                  stackIn_6_1 = 1;
                  break L1;
                }
              }
              L2: {
                dna.c(stackIn_6_0, stackIn_6_1 != 0);
                if (null != rv.field_n) {
                  L3: {
                    L4: {
                      ik.field_i.field_p = 0;
                      var15 = ik.field_i;
                      var17 = var15;
                      var17.field_sb = 0;
                      cn.field_j.field_p = 0;
                      var5 = cn.field_j;
                      var5.field_sb = 0;
                      cw.field_yb.field_p = 0;
                      var6 = cw.field_yb;
                      var6.field_sb = 0;
                      vaa.field_a.field_Z = tw.field_d.toUpperCase();
                      var7 = (2 + ho.field_g.field_sb) / 2;
                      cw.field_yb.a(40, 31407, var7 - 2, 0, ho.field_g.field_p + -40);
                      cn.field_j.a(40, 31407, -var7 + ho.field_g.field_sb, var7, ho.field_g.field_p + -40);
                      if (1 != qha.field_c.length) {
                        break L4;
                      } else {
                        if (-3 != (qha.field_c[0] ^ -1)) {
                          break L4;
                        } else {
                          var8 = 0;
                          break L3;
                        }
                      }
                    }
                    var8 = 0;
                    var9_int = 0;
                    var10 = 0;
                    L5: while (true) {
                      L6: {
                        if (var10 >= qha.field_c.length) {
                          break L6;
                        } else {
                          L7: {
                            if (-1 == (fia.field_r[var10 / 8] & 1 << (7 & var10) ^ -1)) {
                              stackIn_16_0 = 0;
                              break L7;
                            } else {
                              stackIn_16_0 = 1;
                              break L7;
                            }
                          }
                          L8: {
                            var11_int = stackIn_16_0;
                            if (var11_int != 0) {
                              var9_int++;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          L9: {
                            if (var11_int == 0) {
                              break L9;
                            } else {
                              if (qha.field_c[var10] != 2) {
                                var8 = 1;
                                break L6;
                              } else {
                                break L9;
                              }
                            }
                          }
                          var10++;
                          continue L5;
                        }
                      }
                      if (-1 != (var9_int ^ -1)) {
                        break L3;
                      } else {
                        var8 = 1;
                        break L3;
                      }
                    }
                  }
                  cn.field_j.field_u = true;
                  if (!ce.field_y) {
                    L10: {
                      stackIn_40_0 = cn.field_j;

                      if (var8 != 0) {
                        stackIn_41_0 = (sna) ((Object) stackIn_40_0);
                        stackIn_41_1 = bg.field_m;
                        break L10;
                      } else {
                        stackIn_41_0 = (sna) ((Object) stackIn_40_0);
                        stackIn_41_1 = fka.field_h;
                        break L10;
                      }
                    }
                    L11: {
                      stackIn_41_0.field_Z = ((String) (Object) stackIn_41_1).toUpperCase();
                      stackIn_43_0 = (sna) (field_b);

                      stackIn_43_1 = 1;

                      stackIn_43_2 = new String[]{cn.field_j.field_Z};

                      if (var8 != 0) {
                        stackIn_44_0 = (sna) ((Object) stackIn_43_0);
                        stackIn_44_1 = stackIn_43_1;
                        stackIn_44_2 = (String[]) ((Object) stackIn_43_2);
                        stackIn_44_3 = kk.field_r;
                        break L11;
                      } else {
                        stackIn_44_0 = (sna) ((Object) stackIn_43_0);
                        stackIn_44_1 = stackIn_43_1;
                        stackIn_44_2 = (String[]) ((Object) stackIn_43_2);
                        stackIn_44_3 = ffa.field_h;
                        break L11;
                      }
                    }
                    L12: {
                      stackIn_44_0.field_Z = lga.a(stackIn_44_1 != 0, stackIn_44_2, stackIn_44_3);
                      cw.field_yb.field_Z = lo.field_a;
                      fla.field_q = true;
                      jj.field_wb.field_u = true;
                      if (null == pha.field_h) {
                        break L12;
                      } else {
                        L13: {
                          uu.field_yb = false;
                          fla.field_q = false;
                          if (bja.field_o != null) {
                            break L13;
                          } else {
                            bja.field_o = new byte[ld.field_q];
                            ala.field_b = new boolean[ld.field_q];
                            break L13;
                          }
                        }
                        var13 = 0;
                        var9_int = var13;
                        L14: while (true) {
                          if (var13 >= ld.field_q) {
                            ub.a(0, true, -81, -1, -1, rv.field_n, -1, ld.field_q);
                            if (2 > hea.field_r) {
                              break L12;
                            } else {
                              if (!wga.field_q[12]) {
                                break L12;
                              } else {
                                fla.field_q = true;
                                break L12;
                              }
                            }
                          } else {
                            ala.field_b[var13] = false;
                            var13++;
                            continue L14;
                          }
                        }
                      }
                    }
                    if (!fla.field_q) {
                      cn.field_j.field_u = false;
                      if (cn.field_j.field_E) {
                        L15: {
                          var9 = null;
                          if (!uu.field_yb) {
                            break L15;
                          } else {
                            var9 = "<col=A00000>" + gb.field_j + "</col>";
                            var11 = var9;
                            var9 = var11;
                            var11 = var9;
                            var9 = var11;
                            break L15;
                          }
                        }
                        var10 = 0;
                        L16: while (true) {
                          if (ld.field_q <= var10) {
                            jja.field_m = "<col=A00000>" + iha.field_k + "<br>" + jm.field_l + (String) (var9);
                            break L2;
                          } else {
                            if (ala.field_b[var10]) {
                              L17: {
                                var11_ref = "<col=A00000>" + kka.field_k[var10] + "</col>";
                                var9 = var11_ref;
                                var9 = var11_ref;
                                if (var9 == null) {
                                  var9 = var11_ref;
                                  break L17;
                                } else {
                                  var9 = (String) (var9) + ", " + var11_ref;
                                  break L17;
                                }
                              }
                              var10++;
                              continue L16;
                            } else {
                              var10++;
                              continue L16;
                            }
                          }
                        }
                      } else {
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  } else {
                    L18: {
                      jj.field_wb.field_u = false;
                      field_b.field_Z = pba.field_q;
                      if (var8 != 0) {
                        stackIn_30_0 = wk.field_e;
                        break L18;
                      } else {
                        stackIn_30_0 = sk.field_p;
                        break L18;
                      }
                    }
                    L19: {
                      var16 = stackIn_30_0;
                      var9 = var16;
                      var9 = var16;
                      var9 = var16;
                      var10 = cw.field_yb.field_jb.a(var16) - -(cw.field_yb.field_jb.a('.') * 3);
                      cw.field_yb.field_N = 0;
                      if ((qf.field_v & 48 ^ -1) != -17) {
                        break L19;
                      } else {
                        var9 = var16 + ".";
                        break L19;
                      }
                    }
                    L20: {
                      cw.field_yb.field_L = (cw.field_yb.field_sb + -var10) / 2;
                      if (-33 != (qf.field_v & 48 ^ -1)) {
                        break L20;
                      } else {
                        var9 = (String) (var9) + "..";
                        break L20;
                      }
                    }
                    L21: {
                      if ((48 & qf.field_v) == 48) {
                        var9 = (String) (var9) + "...";
                        break L21;
                      } else {
                        break L21;
                      }
                    }
                    cw.field_yb.field_Z = (String) (var9);
                    cn.field_j.field_Z = bga.field_f.toUpperCase();
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              L22: {
                L23: {
                  stackIn_72_0 = ela.field_i;

                  stackIn_72_1 = 19842;

                  if (!param3) {
                    break L23;
                  } else {
                    stackIn_72_0 = (sna) ((Object) stackIn_72_0);

                    if (param1) {
                      break L23;
                    } else {
                      stackIn_72_0 = (sna) ((Object) stackIn_72_0);

                      if (w.field_e) {
                        break L23;
                      } else {
                        stackIn_73_0 = (sna) ((Object) stackIn_72_0);
                        stackIn_73_1 = stackIn_72_1;
                        stackIn_73_2 = 1;
                        break L22;
                      }
                    }
                  }
                }
                stackIn_73_0 = (sna) ((Object) stackIn_72_0);
                stackIn_73_1 = stackIn_72_1;
                stackIn_73_2 = 0;
                break L22;
              }
              L24: {
                L25: {
                  ((sna) (Object) stackIn_73_0).a(stackIn_73_1, stackIn_73_2 != 0);
                  stackIn_77_0 = ho.field_g;

                  stackIn_77_1 = 19842;

                  if (!param3) {
                    break L25;
                  } else {
                    stackIn_77_0 = (sna) ((Object) stackIn_77_0);

                    if (param1) {
                      break L25;
                    } else {
                      stackIn_77_0 = (sna) ((Object) stackIn_77_0);

                      if (w.field_e) {
                        break L25;
                      } else {
                        stackIn_78_0 = (sna) ((Object) stackIn_77_0);
                        stackIn_78_1 = stackIn_77_1;
                        stackIn_78_2 = 1;
                        break L24;
                      }
                    }
                  }
                }
                stackIn_78_0 = (sna) ((Object) stackIn_77_0);
                stackIn_78_1 = stackIn_77_1;
                stackIn_78_2 = 0;
                break L24;
              }
              L26: {
                L27: {
                  ((sna) (Object) stackIn_78_0).a(stackIn_78_1, stackIn_78_2 != 0);
                  stackIn_82_0 = qw.field_b;

                  stackIn_82_1 = 19842;

                  if (!param3) {
                    break L27;
                  } else {
                    stackIn_82_0 = (sna) ((Object) stackIn_82_0);

                    if (param1) {
                      break L27;
                    } else {
                      stackIn_82_0 = (sna) ((Object) stackIn_82_0);

                      if (!w.field_e) {
                        break L27;
                      } else {
                        stackIn_83_0 = (sna) ((Object) stackIn_82_0);
                        stackIn_83_1 = stackIn_82_1;
                        stackIn_83_2 = 1;
                        break L26;
                      }
                    }
                  }
                }
                stackIn_83_0 = (sna) ((Object) stackIn_82_0);
                stackIn_83_1 = stackIn_82_1;
                stackIn_83_2 = 0;
                break L26;
              }
              L28: {
                ((sna) (Object) stackIn_83_0).a(stackIn_83_1, stackIn_83_2 != 0);
                pf.field_n.field_a.f(18632);
                if (null != rv.field_n) {
                  L29: {
                    if (jj.field_wb.field_R == 0) {
                      break L29;
                    } else {
                      wt.b(-22908, param2);
                      break L29;
                    }
                  }
                  L30: {
                    if (cn.field_j.field_R == 0) {
                      break L30;
                    } else {
                      if (ce.field_y) {
                        kl.a(54, param2);
                        break L30;
                      } else {
                        fq.a(param2, (byte) -124);
                        break L30;
                      }
                    }
                  }
                  wp.a(false, rv.field_n, param2, true);
                  break L28;
                } else {
                  break L28;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var4), "sr.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(byte param0) {
        int var1 = 0;
        if (32 >= bs.field_k) {
            gka.a(119, 0);
        } else {
            var1 = bs.field_k % 32;
            if (var1 == 0) {
                var1 = 32;
            }
            gka.a(126, -var1 + bs.field_k);
        }
        if (param0 > -9) {
            sr.b((byte) -4);
        }
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    final static void a(int param0, byte param1) {
        if (param1 < 5) {
            field_c = (boolean[]) null;
        }
        dc.field_m = da.field_a[param0];
        gq.field_G = sb.field_m[param0];
        rj.field_q = dl.field_k[param0];
    }

    final static void a(int param0) {
        et.field_m = null;
        tb.field_b = null;
        if (param0 != 48) {
            sr.b((byte) 41);
        }
    }

    static {
        field_d = "Dairy";
    }
}
