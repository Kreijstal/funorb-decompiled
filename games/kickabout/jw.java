/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jw extends hd {
    static uo field_Ab;
    private int field_zb;
    private String field_Hb;
    static String field_yb;
    static hd field_Cb;
    static String field_Eb;
    static String field_Db;
    static String field_Bb;
    static String field_Fb;
    boolean field_Gb;

    final static int a(long param0, int param1, byte param2) {
        boolean discarded$2 = false;
        if (param2 < 96) {
          discarded$2 = jw.a('￸', 47);
          param1 = (int)(param0 * (long)param1 >> 1259344528);
          return param1;
        } else {
          param1 = (int)(param0 * (long)param1 >> 1259344528);
          return param1;
        }
    }

    final static boolean a(char param0, int param1) {
        boolean discarded$2 = false;
        if (!Character.isISOControl(param0)) {
          if (!vt.a(param0, true)) {
            if (param0 != 45) {
              if (160 != param0) {
                if (param0 != 32) {
                  if (param0 != 95) {
                    if (param1 != 160) {
                      discarded$2 = jw.a('1', 48);
                      return false;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static void c(int param0, boolean param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        gm var7 = null;
        gm var8 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (2 <= var2_int) {
                L2: {
                  et.field_d.field_R[0].field_g = 0;
                  ks.field_e = param0;
                  ic.field_i = false;
                  et.field_d.field_R[1].field_g = 0;
                  if (-2 == (ks.field_e ^ -1)) {
                    mh.field_k.a(29360128, false, 0, 107085824);
                    mh.field_k.field_R = 1024;
                    mh.field_k.a(4, 26214);
                    et.field_d.field_V.a(29360128, 0, (byte) 26, 44040192);
                    vb.field_d = 1;
                    break L2;
                  } else {
                    if ((ks.field_e ^ -1) != -3) {
                      if (-4 != (ks.field_e ^ -1)) {
                        if (4 != ks.field_e) {
                          if ((ks.field_e ^ -1) != -6) {
                            if (6 != ks.field_e) {
                              if ((ks.field_e ^ -1) == -8) {
                                vb.field_d = 3;
                                var8 = (gm) ((Object) et.field_d.field_P[1][4]);
                                var8.a(-13107200, false, 0, 22937600);
                                et.field_d.field_R[1].field_g = 4;
                                var8.field_G = 8;
                                ld.field_f.field_G = 4;
                                break L2;
                              } else {
                                if ((ks.field_e ^ -1) == -9) {
                                  vb.field_d = 3;
                                  break L2;
                                } else {
                                  if ((ks.field_e ^ -1) != -10) {
                                    if ((ks.field_e ^ -1) != -11) {
                                      if ((ks.field_e ^ -1) == -12) {
                                        vb.field_d = 4;
                                        break L2;
                                      } else {
                                        if (12 == ks.field_e) {
                                          vb.field_d = 4;
                                          break L2;
                                        } else {
                                          if (ks.field_e != 13) {
                                            if (-15 == (ks.field_e ^ -1)) {
                                              um.field_e.b(26415, 2);
                                              et.field_d.field_s = false;
                                              je.field_m = 500;
                                              break L2;
                                            } else {
                                              sl.field_Eb = true;
                                              ps.a(-25246, false, param1, false, false, false, false);
                                              mk.b(-1622);
                                              et.field_d.field_x = new la[]{new la(-800, -800, 1800, 1800)};
                                              et.field_d.field_B = et.field_d.field_x;
                                              return;
                                            }
                                          } else {
                                            vb.field_d = 4;
                                            var7 = (gm) ((Object) et.field_d.field_P[1][0]);
                                            var7.a(29360128, false, 0, -19005440);
                                            var7.field_o = 8;
                                            var7.field_G = 0;
                                            break L2;
                                          }
                                        }
                                      }
                                    } else {
                                      vb.field_d = 1;
                                      fc.field_c.a(1310720, false, 0, 36438016);
                                      break L2;
                                    }
                                  } else {
                                    vb.field_d = 3;
                                    mh.field_k.a(0, false, 0, 44040192);
                                    break L2;
                                  }
                                }
                              }
                            } else {
                              ld.field_f.a(655360, param1, 0, 19005440);
                              vb.field_d = 1;
                              var5 = 0;
                              var2_int = var5;
                              L3: while (true) {
                                if (3 <= var5) {
                                  break L2;
                                } else {
                                  nt.field_zb[var5] = 740;
                                  ((gm) ((Object) et.field_d.field_P[1][1 + var5])).a(400 + var5 * 100 << 1507273456, param1, 0, -(var5 * 40) + 330 << 1727679056);
                                  var5++;
                                  continue L3;
                                }
                              }
                            }
                          } else {
                            vb.field_d = 3;
                            break L2;
                          }
                        } else {
                          ld.field_f.a(42270720, false, 0, 41287680);
                          vb.field_d = 1;
                          break L2;
                        }
                      } else {
                        vb.field_d = 1;
                        break L2;
                      }
                    } else {
                      vb.field_d = 1;
                      break L2;
                    }
                  }
                }
                sl.field_Eb = true;
                ps.a(-25246, false, param1, false, false, false, false);
                mk.b(-1622);
                et.field_d.field_x = new la[]{new la(-800, -800, 1800, 1800)};
                et.field_d.field_B = et.field_d.field_x;
                break L0;
              } else {
                var3 = 1;
                L4: while (true) {
                  if (5 <= var3) {
                    var2_int++;
                    continue L1;
                  } else {
                    et.field_d.field_P[var2_int][var3].field_G = 0;
                    et.field_d.field_E.b(22997);
                    var3++;
                    continue L4;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2), "jw.C(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          jw.a(76);
          field_Db = null;
          field_Bb = null;
          field_Fb = null;
          field_Cb = null;
          field_Eb = null;
          field_yb = null;
          field_Ab = null;
          return;
        } else {
          field_Db = null;
          field_Bb = null;
          field_Fb = null;
          field_Cb = null;
          field_Eb = null;
          field_yb = null;
          field_Ab = null;
          return;
        }
    }

    jw(String param0, hu param1) {
        this(param0, param1, -1);
    }

    final void a(boolean param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ut var6 = null;
        int var7 = 0;
        int stackIn_5_0 = 0;
        ut[] stackIn_9_0 = null;
        ut[] stackIn_10_0 = null;
        ut[] stackIn_11_0 = null;
        ut[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        ut[] stackIn_24_0 = null;
        ut[] stackIn_25_0 = null;
        ut[] stackIn_26_0 = null;
        ut[] stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_43_0 = 0;
        ut[] stackIn_48_0 = null;
        ut[] stackIn_49_0 = null;
        ut[] stackIn_50_0 = null;
        ut[] stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        ut[] stackOut_23_0 = null;
        ut[] stackOut_22_0 = null;
        ut[] stackOut_24_0 = null;
        ut[] stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        ut[] stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        ut[] stackOut_8_0 = null;
        ut[] stackOut_7_0 = null;
        ut[] stackOut_9_0 = null;
        ut[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        ut[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        ut[] stackOut_47_0 = null;
        ut[] stackOut_46_0 = null;
        ut[] stackOut_48_0 = null;
        ut[] stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        ut[] stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        L0: {
          var3 = this.field_F + (this.field_q - -this.field_zb >> 1038886785);
          if (!this.field_lb) {
            stackOut_38_0 = 65793;
            stackIn_40_0 = stackOut_38_0;
            break L0;
          } else {
            if (this.field_gb) {
              stackOut_39_0 = 16777215;
              stackIn_40_0 = stackOut_39_0;
              break L0;
            } else {
              L1: {
                var4 = 65793;
                if (!this.field_lb) {
                  stackOut_4_0 = 7829367;
                  stackIn_5_0 = stackOut_4_0;
                  break L1;
                } else {
                  stackOut_3_0 = 16777215;
                  stackIn_5_0 = stackOut_3_0;
                  break L1;
                }
              }
              var5 = stackIn_5_0;
              if (param1 != 46) {
                L2: {
                  this.a(true, (byte) -8);
                  if (!this.field_lb) {
                    stackOut_23_0 = sq.field_F;
                    stackIn_24_0 = stackOut_23_0;
                    break L2;
                  } else {
                    stackOut_22_0 = gk.field_a;
                    stackIn_24_0 = stackOut_22_0;
                    break L2;
                  }
                }
                L3: {
                  stackOut_24_0 = (ut[]) ((Object) stackIn_24_0);
                  stackIn_26_0 = stackOut_24_0;
                  stackIn_25_0 = stackOut_24_0;
                  if (!this.field_Gb) {
                    stackOut_26_0 = (ut[]) ((Object) stackIn_26_0);
                    stackOut_26_1 = 0;
                    stackIn_27_0 = stackOut_26_0;
                    stackIn_27_1 = stackOut_26_1;
                    break L3;
                  } else {
                    stackOut_25_0 = (ut[]) ((Object) stackIn_25_0);
                    stackOut_25_1 = 1;
                    stackIn_27_0 = stackOut_25_0;
                    stackIn_27_1 = stackOut_25_1;
                    break L3;
                  }
                }
                var6 = stackIn_27_0[stackIn_27_1];
                on.a(this.field_F, this.field_T, this.field_q, this.field_mb, 6, var4, 128);
                if (param0) {
                  if (this.field_lb) {
                    if (!this.field_gb) {
                      var7 = uc.h(40);
                      if (0 > var7) {
                        this.field_X.c(this.field_Hb, -35 + var3, this.field_mb + this.field_T - 9, var5, -1);
                        var6.c(-26 + var3, this.field_T + ((this.field_mb + -var6.field_v >> -245785311) + -2));
                        return;
                      } else {
                        on.f(this.field_F, this.field_T, this.field_q, this.field_mb, 6, 65793 * var7);
                        this.field_X.c(this.field_Hb, -35 + var3, this.field_mb + this.field_T - 9, var5, -1);
                        var6.c(-26 + var3, this.field_T + ((this.field_mb + -var6.field_v >> -245785311) + -2));
                        return;
                      }
                    } else {
                      this.field_X.c(this.field_Hb, -35 + var3, this.field_mb + this.field_T - 9, var5, -1);
                      var6.c(-26 + var3, this.field_T + ((this.field_mb + -var6.field_v >> -245785311) + -2));
                      return;
                    }
                  } else {
                    this.field_X.c(this.field_Hb, -35 + var3, this.field_mb + this.field_T - 9, var5, -1);
                    var6.c(-26 + var3, this.field_T + ((this.field_mb + -var6.field_v >> -245785311) + -2));
                    return;
                  }
                } else {
                  this.field_X.c(this.field_Hb, -35 + var3, this.field_mb + this.field_T - 9, var5, -1);
                  var6.c(-26 + var3, this.field_T + ((this.field_mb + -var6.field_v >> -245785311) + -2));
                  return;
                }
              } else {
                L4: {
                  if (!this.field_lb) {
                    stackOut_8_0 = sq.field_F;
                    stackIn_9_0 = stackOut_8_0;
                    break L4;
                  } else {
                    stackOut_7_0 = gk.field_a;
                    stackIn_9_0 = stackOut_7_0;
                    break L4;
                  }
                }
                L5: {
                  stackOut_9_0 = (ut[]) ((Object) stackIn_9_0);
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_10_0 = stackOut_9_0;
                  if (!this.field_Gb) {
                    stackOut_11_0 = (ut[]) ((Object) stackIn_11_0);
                    stackOut_11_1 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    break L5;
                  } else {
                    stackOut_10_0 = (ut[]) ((Object) stackIn_10_0);
                    stackOut_10_1 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    break L5;
                  }
                }
                L6: {
                  L7: {
                    var6 = stackIn_12_0[stackIn_12_1];
                    on.a(this.field_F, this.field_T, this.field_q, this.field_mb, 6, var4, 128);
                    if (!param0) {
                      break L7;
                    } else {
                      if (!this.field_lb) {
                        break L7;
                      } else {
                        if (!this.field_gb) {
                          var7 = uc.h(40);
                          if (0 <= var7) {
                            on.f(this.field_F, this.field_T, this.field_q, this.field_mb, 6, 65793 * var7);
                            break L7;
                          } else {
                            break L7;
                          }
                        } else {
                          this.field_X.c(this.field_Hb, -35 + var3, this.field_mb + this.field_T - 9, var5, -1);
                          var6.c(-26 + var3, this.field_T + ((this.field_mb + -var6.field_v >> -245785311) + -2));
                          break L6;
                        }
                      }
                    }
                  }
                  this.field_X.c(this.field_Hb, -35 + var3, this.field_mb + this.field_T - 9, var5, -1);
                  var6.c(-26 + var3, this.field_T + ((this.field_mb + -var6.field_v >> -245785311) + -2));
                  break L6;
                }
                return;
              }
            }
          }
        }
        L8: {
          var4 = stackIn_40_0;
          if (!this.field_lb) {
            stackOut_42_0 = 7829367;
            stackIn_43_0 = stackOut_42_0;
            break L8;
          } else {
            stackOut_41_0 = 16777215;
            stackIn_43_0 = stackOut_41_0;
            break L8;
          }
        }
        L9: {
          var5 = stackIn_43_0;
          if (param1 == 46) {
            break L9;
          } else {
            this.a(true, (byte) -8);
            break L9;
          }
        }
        L10: {
          if (!this.field_lb) {
            stackOut_47_0 = sq.field_F;
            stackIn_48_0 = stackOut_47_0;
            break L10;
          } else {
            stackOut_46_0 = gk.field_a;
            stackIn_48_0 = stackOut_46_0;
            break L10;
          }
        }
        L11: {
          stackOut_48_0 = (ut[]) ((Object) stackIn_48_0);
          stackIn_50_0 = stackOut_48_0;
          stackIn_49_0 = stackOut_48_0;
          if (!this.field_Gb) {
            stackOut_50_0 = (ut[]) ((Object) stackIn_50_0);
            stackOut_50_1 = 0;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            break L11;
          } else {
            stackOut_49_0 = (ut[]) ((Object) stackIn_49_0);
            stackOut_49_1 = 1;
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            break L11;
          }
        }
        var6 = stackIn_51_0[stackIn_51_1];
        on.a(this.field_F, this.field_T, this.field_q, this.field_mb, 6, var4, 128);
        if (param0) {
          if (this.field_lb) {
            if (!this.field_gb) {
              var7 = uc.h(40);
              if (0 > var7) {
                this.field_X.c(this.field_Hb, -35 + var3, this.field_mb + this.field_T - 9, var5, -1);
                var6.c(-26 + var3, this.field_T + ((this.field_mb + -var6.field_v >> -245785311) + -2));
                return;
              } else {
                on.f(this.field_F, this.field_T, this.field_q, this.field_mb, 6, 65793 * var7);
                this.field_X.c(this.field_Hb, -35 + var3, this.field_mb + this.field_T - 9, var5, -1);
                var6.c(-26 + var3, this.field_T + ((this.field_mb + -var6.field_v >> -245785311) + -2));
                return;
              }
            } else {
              this.field_X.c(this.field_Hb, -35 + var3, this.field_mb + this.field_T - 9, var5, -1);
              var6.c(-26 + var3, this.field_T + ((this.field_mb + -var6.field_v >> -245785311) + -2));
              return;
            }
          } else {
            this.field_X.c(this.field_Hb, -35 + var3, this.field_mb + this.field_T - 9, var5, -1);
            var6.c(-26 + var3, this.field_T + ((this.field_mb + -var6.field_v >> -245785311) + -2));
            return;
          }
        } else {
          this.field_X.c(this.field_Hb, -35 + var3, this.field_mb + this.field_T - 9, var5, -1);
          var6.c(-26 + var3, this.field_T + ((this.field_mb + -var6.field_v >> -245785311) + -2));
          return;
        }
    }

    jw(String param0, hu param1, int param2) {
        try {
            this.field_X = param1;
            this.field_Hb = param0;
            this.field_zb = 45 + this.field_X.a(param0);
            this.field_mb = 30;
            this.field_q = -1 == param2 ? this.field_zb : param2;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "jw.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_Db = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
        field_Eb = "Bid bigger than Buyout";
        field_yb = "Loading...";
        field_Bb = "Warning! Once used, trinkets may be replaced but not removed.";
        field_Fb = "No players";
    }
}
