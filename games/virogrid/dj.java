/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj {
    static e field_h;
    private String field_m;
    static nh field_l;
    private int field_j;
    private int[] field_k;
    static int field_c;
    private long field_i;
    int field_b;
    static int field_n;
    static ml[] field_f;
    ga field_a;
    String field_g;
    km field_d;
    static int field_e;

    private final boolean b(int param0, int param1, int param2) {
        boolean discarded$1 = false;
        int var5 = 0;
        var5 = Virogrid.field_F ? 1 : 0;
        if (8 == param1) {
          na.a(this.field_i, this.field_g, param0 + -18);
          if (param0 != 17) {
            this.field_j = 125;
            return true;
          } else {
            return true;
          }
        } else {
          if (param1 != 18) {
            if ((param1 ^ -1) != -12) {
              if (12 == param1) {
                sd.a(1, param2, this.field_j, (byte) 64);
                if (param0 != 17) {
                  this.field_j = 125;
                  return true;
                } else {
                  return true;
                }
              } else {
                if ((param1 ^ -1) != -14) {
                  if (param1 != 14) {
                    if (-21 != (param1 ^ -1)) {
                      if ((param1 ^ -1) == -20) {
                        discarded$1 = ul.a(this.field_i, this.field_j, -22557, this.field_g, this.field_k);
                        if (param0 != 17) {
                          this.field_j = 125;
                          return true;
                        } else {
                          return true;
                        }
                      } else {
                        return false;
                      }
                    } else {
                      tf.a((byte) 85);
                      if (param0 == 17) {
                        return true;
                      } else {
                        this.field_j = 125;
                        return true;
                      }
                    }
                  } else {
                    g.a(param0 ^ 14001);
                    if (param0 == 17) {
                      return true;
                    } else {
                      this.field_j = 125;
                      return true;
                    }
                  }
                } else {
                  sd.a(2, param2, this.field_j, (byte) 84);
                  if (param0 != 17) {
                    this.field_j = 125;
                    return true;
                  } else {
                    return true;
                  }
                }
              }
            } else {
              sd.a(0, param2, this.field_j, (byte) 114);
              if (param0 != 17) {
                this.field_j = 125;
                return true;
              } else {
                return true;
              }
            }
          } else {
            qm.a(-94, this.field_g, this.field_i);
            if (param0 == 17) {
              return true;
            } else {
              this.field_j = 125;
              return true;
            }
          }
        }
    }

    final boolean a(int param0, int param1, int param2, boolean param3, byte param4) {
        boolean discarded$8 = false;
        boolean discarded$9 = false;
        boolean discarded$10 = false;
        boolean discarded$11 = false;
        boolean discarded$12 = false;
        boolean discarded$13 = false;
        boolean discarded$14 = false;
        boolean discarded$15 = false;
        int var6 = 0;
        var6 = this.field_a.b(param3, (byte) -89);
        if (param4 == 95) {
          if ((var6 ^ -1) == 1) {
            return false;
          } else {
            discarded$8 = this.a(var6, param1, param4 + -98);
            discarded$9 = this.a(param2, var6, false);
            discarded$10 = this.b(param4 ^ 78, var6, param2);
            discarded$11 = this.c(param0, var6, param4 ^ -29);
            return true;
          }
        } else {
          dj.a(-90, true, -128, -63, -5);
          if ((var6 ^ -1) == 1) {
            return false;
          } else {
            discarded$12 = this.a(var6, param1, param4 + -98);
            discarded$13 = this.a(param2, var6, false);
            discarded$14 = this.b(param4 ^ 78, var6, param2);
            discarded$15 = this.c(param0, var6, param4 ^ -29);
            return true;
          }
        }
    }

    final void a(byte param0, boolean param1) {
        this.field_a.a(param1, 24960);
        if (param0 > -16) {
            field_e = 9;
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        da var4 = null;
        tm var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var4 = (da) ((Object) aj.field_m.a((byte) -100));
            L1: while (true) {
              if (var4 == null) {
                L2: {
                  if (param0 == 2) {
                    break L2;
                  } else {
                    dj.a(false);
                    break L2;
                  }
                }
                var5 = (tm) ((Object) bj.field_o.a((byte) -82));
                L3: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    wc.a(var5, (byte) 110, param1);
                    var5 = (tm) ((Object) bj.field_o.a(16213));
                    continue L3;
                  }
                }
              } else {
                ha.a(param1, var4, (byte) -38);
                var4 = (da) ((Object) aj.field_m.a(param0 + 16211));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var2), "dj.K(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int[] param1, int param2) {
        RuntimeException var4 = null;
        String var4_ref = null;
        gh var5 = null;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 4) {
                break L1;
              } else {
                this.field_k = (int[]) null;
                break L1;
              }
            }
            L2: {
              if (null == this.field_g) {
                break L2;
              } else {
                L3: {
                  if (this.field_i != hh.field_d) {
                    break L3;
                  } else {
                    if ((param2 ^ -1) != -3) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (oa.field_q == 2) {
                  L4: {
                    var7 = this.a(1);
                    var4_ref = var7;
                    var5 = j.a(param0 ^ 4, this.field_g);
                    var6 = fm.a(this.field_g, -1369854352) ? 1 : 0;
                    if (var5 != null) {
                      break L4;
                    } else {
                      if (var6 != 0) {
                        break L4;
                      } else {
                        this.field_a.a(1, oi.a(new String[]{var7}, vj.field_a, 2), 4);
                        this.field_a.a(1, oi.a(new String[]{var7}, og.field_a, 2), 6);
                        if (param1 == null) {
                          break L4;
                        } else {
                          if (param2 == 2) {
                            break L4;
                          } else {
                            if (wg.field_f) {
                              break L4;
                            } else {
                              this.field_k = param1;
                              this.field_a.a(1, oi.a(new String[]{var7}, bm.field_o, 2), 19);
                              break L4;
                            }
                          }
                        }
                      }
                    }
                  }
                  L5: {
                    if (var5 == null) {
                      break L5;
                    } else {
                      L6: {
                        if (dd.a(this.field_g, false)) {
                          break L6;
                        } else {
                          if (wg.field_f) {
                            break L6;
                          } else {
                            L7: {
                              if (!dh.field_n) {
                                this.field_a.a(1, oi.a(new String[]{var7}, ha.field_d, 2), 8);
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            this.field_a.a(1, oi.a(new String[]{var7}, og.field_c, 2), 18);
                            if (param1 != null) {
                              this.field_k = param1;
                              this.field_a.a(1, oi.a(new String[]{var7}, bm.field_o, param0 ^ 6), 19);
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      this.field_a.a(1, oi.a(new String[]{var7}, nb.field_o, param0 + -2), 5);
                      break L5;
                    }
                  }
                  if (var6 != 0) {
                    this.field_a.a(param0 ^ 5, oi.a(new String[]{var7}, hd.field_a, 2), 7);
                    break L2;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var4);
            stackOut_28_1 = new StringBuilder().append("dj.N(").append(param0).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L8;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L8;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param2 + ')');
        }
    }

    private final boolean c(int param0, int param1, int param2) {
        int var4 = 0;
        var4 = -35 / ((23 - param2) / 37);
        if (param1 == 17) {
          km.field_yb = new bg(this.field_d.field_Bb, this.field_d.field_J, this.field_d.field_K, this.field_d.field_ub, param0, fn.field_e, wh.field_a, eb.field_b, ti.field_h, vd.field_Z, ma.field_e, this.field_g, this.field_i);
          return true;
        } else {
          return false;
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4) {
        int var6 = 0;
        ic stackIn_7_0 = null;
        ic stackIn_8_0 = null;
        ic stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        ic stackIn_14_0 = null;
        ic stackIn_15_0 = null;
        ic stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        ic stackIn_27_0 = null;
        ic stackIn_28_0 = null;
        ic stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        ic stackIn_34_0 = null;
        ic stackIn_35_0 = null;
        ic stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        oi stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        oi stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        oi stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        int stackIn_45_2 = 0;
        oi stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        oi stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        int stackOut_44_2 = 0;
        oi stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        int stackOut_43_2 = 0;
        ic stackOut_33_0 = null;
        ic stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        ic stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        ic stackOut_26_0 = null;
        ic stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        ic stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        ic stackOut_13_0 = null;
        ic stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        ic stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        ic stackOut_6_0 = null;
        ic stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        ic stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        L0: {
          var6 = Virogrid.field_F ? 1 : 0;
          bf.a(0, 25928, c.field_d);
          if (!ke.field_p.field_d) {
            bf.a(0, 25928, we.field_e);
            break L0;
          } else {
            break L0;
          }
        }
        if (param4 != -1) {
          if (-2 != param4) {
            L1: {
              pj.a(c.field_d, param3 ^ 259);
              stackOut_42_0 = al.field_j[param4];
              stackOut_42_1 = param0;
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              if (ke.field_p.field_d) {
                stackOut_44_0 = (oi) ((Object) stackIn_44_0);
                stackOut_44_1 = stackIn_44_1;
                stackOut_44_2 = 0;
                stackIn_45_0 = stackOut_44_0;
                stackIn_45_1 = stackOut_44_1;
                stackIn_45_2 = stackOut_44_2;
                break L1;
              } else {
                stackOut_43_0 = (oi) ((Object) stackIn_43_0);
                stackOut_43_1 = stackIn_43_1;
                stackOut_43_2 = 2;
                stackIn_45_0 = stackOut_43_0;
                stackIn_45_1 = stackOut_43_1;
                stackIn_45_2 = stackOut_43_2;
                break L1;
              }
            }
            ((oi) (Object) stackIn_45_0).b(stackIn_45_1, stackIn_45_2, -116);
            if (param2 == -1) {
              ul.b((byte) 86);
              if (param3 != 3) {
                field_l = (nh) null;
                return;
              } else {
                return;
              }
            } else {
              ff.a(param2, 0, ff.field_a);
              ul.b((byte) 86);
              if (param3 != 3) {
                field_l = (nh) null;
                return;
              } else {
                return;
              }
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          if (vg.field_I == null) {
            if (ei.field_b != null) {
              if (ke.field_p.field_d) {
                L2: {
                  stackOut_33_0 = ei.field_b;
                  stackIn_35_0 = stackOut_33_0;
                  stackIn_34_0 = stackOut_33_0;
                  if (0.0 <= nk.field_K[11]) {
                    stackOut_35_0 = (ic) ((Object) stackIn_35_0);
                    stackOut_35_1 = 0;
                    stackIn_36_0 = stackOut_35_0;
                    stackIn_36_1 = stackOut_35_1;
                    break L2;
                  } else {
                    stackOut_34_0 = (ic) ((Object) stackIn_34_0);
                    stackOut_34_1 = 1;
                    stackIn_36_0 = stackOut_34_0;
                    stackIn_36_1 = stackOut_34_1;
                    break L2;
                  }
                }
                ((ic) (Object) stackIn_36_0).a(stackIn_36_1 != 0, param3 ^ 92, c.field_d);
                if (param3 != 3) {
                  field_l = (nh) null;
                  return;
                } else {
                  return;
                }
              } else {
                L3: {
                  stackOut_26_0 = ei.field_b;
                  stackIn_28_0 = stackOut_26_0;
                  stackIn_27_0 = stackOut_26_0;
                  if (0.0 <= nk.field_K[11]) {
                    stackOut_28_0 = (ic) ((Object) stackIn_28_0);
                    stackOut_28_1 = 0;
                    stackIn_29_0 = stackOut_28_0;
                    stackIn_29_1 = stackOut_28_1;
                    break L3;
                  } else {
                    stackOut_27_0 = (ic) ((Object) stackIn_27_0);
                    stackOut_27_1 = 1;
                    stackIn_29_0 = stackOut_27_0;
                    stackIn_29_1 = stackOut_27_1;
                    break L3;
                  }
                }
                ((ic) (Object) stackIn_29_0).a(stackIn_29_1 != 0, (byte) 90, we.field_e, c.field_d);
                if (param3 == 3) {
                  return;
                } else {
                  field_l = (nh) null;
                  return;
                }
              }
            } else {
              if (param3 == 3) {
                return;
              } else {
                field_l = (nh) null;
                return;
              }
            }
          } else {
            if (!ke.field_p.field_d) {
              L4: {
                stackOut_13_0 = vg.field_I;
                stackIn_15_0 = stackOut_13_0;
                stackIn_14_0 = stackOut_13_0;
                if (nk.field_K[11] >= 0.0) {
                  stackOut_15_0 = (ic) ((Object) stackIn_15_0);
                  stackOut_15_1 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  break L4;
                } else {
                  stackOut_14_0 = (ic) ((Object) stackIn_14_0);
                  stackOut_14_1 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  break L4;
                }
              }
              ((ic) (Object) stackIn_16_0).a(stackIn_16_1 != 0, (byte) 58, we.field_e, c.field_d);
              if (param3 != 3) {
                field_l = (nh) null;
                return;
              } else {
                return;
              }
            } else {
              L5: {
                stackOut_6_0 = vg.field_I;
                stackIn_8_0 = stackOut_6_0;
                stackIn_7_0 = stackOut_6_0;
                if (0.0 <= nk.field_K[11]) {
                  stackOut_8_0 = (ic) ((Object) stackIn_8_0);
                  stackOut_8_1 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  break L5;
                } else {
                  stackOut_7_0 = (ic) ((Object) stackIn_7_0);
                  stackOut_7_1 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  break L5;
                }
              }
              ((ic) (Object) stackIn_9_0).a(stackIn_9_1 != 0, 85, c.field_d);
              if (param3 != 3) {
                field_l = (nh) null;
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    private final boolean a(int param0, int param1, boolean param2) {
        Object var4 = null;
        String var5 = null;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        var4 = null;
        if (!param2) {
          if (param1 != 4) {
            if (param1 != 5) {
              if (-7 != (param1 ^ -1)) {
                if ((param1 ^ -1) != -8) {
                  return false;
                } else {
                  L0: {
                    var8 = og.a(this.field_m, param0, (byte) -106, this.field_g);
                    if (var8 != null) {
                      var5 = (String) null;
                      gf.a(this.field_g, 0, false, var8, 2, (String) null);
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                  return true;
                }
              } else {
                L1: {
                  var7 = g.a(this.field_g, -128, param0);
                  if (var7 != null) {
                    var5 = (String) null;
                    gf.a(this.field_g, 0, false, var7, 2, (String) null);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return true;
              }
            } else {
              var6 = og.a(this.field_g, true, param0);
              if (var6 == null) {
                return true;
              } else {
                var5 = (String) null;
                gf.a(this.field_g, 0, false, var6, 2, (String) null);
                return true;
              }
            }
          } else {
            L2: {
              var9 = ab.a((byte) 73, this.field_g, param0);
              if (var9 != null) {
                var5 = (String) null;
                gf.a(this.field_g, 0, false, var9, 2, (String) null);
                break L2;
              } else {
                break L2;
              }
            }
            return true;
          }
        } else {
          return false;
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, boolean param5, boolean param6, boolean param7, boolean param8, boolean param9, int param10, int param11) {
        nl.a(param5, param11, param10, param0, param1, param7, param6, 16777215, param4, param3, param9, param8, param2 + 83, 16777215);
        if (param2 != -83) {
            dj.a(63, true, -5, 52, -122);
        }
    }

    final void a(boolean param0, byte param1) {
        lk var4 = null;
        String var5 = null;
        int var6 = 0;
        lk var7 = null;
        var6 = Virogrid.field_F ? 1 : 0;
        if (param1 < -90) {
          if (null != this.field_g) {
            if ((this.field_i ^ -1L) != (hh.field_d ^ -1L)) {
              if (wl.field_d != null) {
                if (k.b(1000)) {
                  var7 = db.a(this.field_i, false);
                  var4 = ic.a(this.field_i, (byte) -127);
                  var5 = this.a(1);
                  if (var4 != null) {
                    if (wl.field_d.field_kc) {
                      if (wl.field_d.field_mc < 0) {
                        return;
                      } else {
                        this.field_a.a(1, oi.a(new String[]{var5}, fl.field_k, 2), 1);
                        return;
                      }
                    } else {
                      this.field_a.a(1, oi.a(new String[]{var5}, fl.field_k, 2), 1);
                      return;
                    }
                  } else {
                    if (var7 != null) {
                      if (wl.field_d.field_Rb) {
                        if (wl.field_d.field_ic < wl.field_d.field_vc) {
                          if (!var7.field_Xb) {
                            if (param0) {
                              if (!var7.field_Sb) {
                                this.field_a.a(1, oi.a(new String[]{var5}, qm.field_Hb, 2), 0);
                                return;
                              } else {
                                this.field_a.a(1, oi.a(new String[]{var5}, rb.field_b, 2), 0);
                                this.field_a.a(1, oi.a(new String[]{var5}, oe.field_c, 2), 1);
                                return;
                              }
                            } else {
                              this.field_a.a(1, oi.a(new String[]{var5}, qm.field_Hb, 2), 0);
                              return;
                            }
                          } else {
                            this.field_a.a(1, oi.a(new String[]{var5}, b.field_Cb, 2), 1);
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void b(byte param0) {
        int var2 = 0;
        String var3 = null;
        int var4 = 0;
        he var5 = null;
        var4 = Virogrid.field_F ? 1 : 0;
        if (null == wl.field_d) {
          var5 = qd.a((byte) 123, this.field_b);
          if (var5 != null) {
            var3 = var5.field_Qb;
            if (!var5.field_dc) {
              if (!var5.field_Ib) {
                if (!var5.field_sc) {
                  if (var5.field_Rb) {
                    if (var5.field_kc) {
                      if (!var5.field_Ib) {
                        L0: {
                          if (var5.field_sc) {
                            this.field_a.a(1, oi.a(new String[]{var3}, tg.field_y, 2), 3);
                            break L0;
                          } else {
                            break L0;
                          }
                        }
                        var2 = 103 / ((param0 - 60) / 39);
                        return;
                      } else {
                        L1: {
                          this.field_a.a(1, oi.a(new String[]{var3}, la.field_i, 2), 2);
                          if (var5.field_sc) {
                            this.field_a.a(1, oi.a(new String[]{var3}, tg.field_y, 2), 3);
                            break L1;
                          } else {
                            break L1;
                          }
                        }
                        var2 = 103 / ((param0 - 60) / 39);
                        return;
                      }
                    } else {
                      L2: {
                        this.field_a.a(1, oi.a(new String[]{var3}, la.field_i, 2), 2);
                        if (var5.field_sc) {
                          this.field_a.a(1, oi.a(new String[]{var3}, tg.field_y, 2), 3);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      var2 = 103 / ((param0 - 60) / 39);
                      return;
                    }
                  } else {
                    if (!var5.field_sc) {
                      var2 = 103 / ((param0 - 60) / 39);
                      return;
                    } else {
                      this.field_a.a(1, oi.a(new String[]{var3}, tg.field_y, 2), 3);
                      var2 = 103 / ((param0 - 60) / 39);
                      return;
                    }
                  }
                } else {
                  if (!var5.field_sc) {
                    var2 = 103 / ((param0 - 60) / 39);
                    return;
                  } else {
                    this.field_a.a(1, oi.a(new String[]{var3}, tg.field_y, 2), 3);
                    var2 = 103 / ((param0 - 60) / 39);
                    return;
                  }
                }
              } else {
                L3: {
                  this.field_a.a(1, oi.a(new String[]{var3}, ra.field_d, 2), 2);
                  if (var5.field_sc) {
                    this.field_a.a(1, oi.a(new String[]{var3}, tg.field_y, 2), 3);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var2 = 103 / ((param0 - 60) / 39);
                return;
              }
            } else {
              this.field_a.a(1, oi.a(new String[]{var3}, i.field_D, 2), 2);
              this.field_a.a(1, oi.a(new String[]{var3}, di.field_u, 2), 3);
              var2 = 103 / ((param0 - 60) / 39);
              return;
            }
          } else {
            var2 = 103 / ((param0 - 60) / 39);
            return;
          }
        } else {
          var2 = 103 / ((param0 - 60) / 39);
          return;
        }
    }

    final void a(byte param0) {
        String var2 = null;
        String var3 = null;
        L0: {
          if (null == this.field_g) {
            break L0;
          } else {
            if (this.field_i == hh.field_d) {
              break L0;
            } else {
              var3 = this.a(1);
              var2 = var3;
              this.field_a.a(1, oi.a(new String[]{var3}, db.field_f, 2), 17);
              break L0;
            }
          }
        }
        if (param0 >= -40) {
          dj.a(84, -6);
          return;
        } else {
          return;
        }
    }

    private final String a(int param0) {
        String var2 = null;
        L0: {
          if (this.field_m == null) {
            var2 = this.field_g;
            break L0;
          } else {
            var2 = this.field_m;
            break L0;
          }
        }
        if (param0 != 1) {
          field_l = (nh) null;
          return var2;
        } else {
          return var2;
        }
    }

    final boolean b(int param0) {
        if (param0 > 41) {
          if (null != this.field_a) {
            if (!this.field_a.g(-71)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    private final boolean a(int param0, int param1, int param2) {
        int var5 = 0;
        var5 = Virogrid.field_F ? 1 : 0;
        if (-1 == (param0 ^ -1)) {
          rj.a(param1, false, this.field_i);
          if (param2 != -3) {
            return false;
          } else {
            return true;
          }
        } else {
          if (-2 == (param0 ^ -1)) {
            w.a((byte) 74, this.field_i, param1);
            if (param2 != -3) {
              return false;
            } else {
              return true;
            }
          } else {
            if ((param0 ^ -1) == -3) {
              cm.a((byte) 20, this.field_b, param1);
              if (param2 != -3) {
                return false;
              } else {
                return true;
              }
            } else {
              if (param0 == 3) {
                nn.a(this.field_b, param1, (byte) -115);
                if (param2 != -3) {
                  return false;
                } else {
                  return true;
                }
              } else {
                if (param0 == 10) {
                  sb.a(this.field_b, param1, param2 ^ -14533);
                  if (param2 != -3) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  if ((param0 ^ -1) == -16) {
                    fm.a(this.field_b, 3, param1);
                    if (param2 != -3) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    if (-17 == (param0 ^ -1)) {
                      fm.a(0, param2 + 6, param1);
                      if (param2 != -3) {
                        return false;
                      } else {
                        return true;
                      }
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
          }
        }
    }

    dj(km param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        try {
            this.field_a = new ga(sd.field_f);
            this.field_k = param6;
            this.field_j = param5;
            this.field_m = param3;
            this.field_g = param2;
            param0.field_xb = true;
            this.field_d = param0;
            this.field_i = param1;
            this.field_b = param4;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "dj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(cj param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            if (!param0.field_j) {
              L1: {
                this.field_j = param0.field_n;
                if (param0.field_n != 0) {
                  break L1;
                } else {
                  L2: {
                    if (-1 == (ca.field_D ^ -1)) {
                      this.field_a.a(1, el.field_g, 12);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  this.field_a.a(1, f.field_h, 13);
                  break L1;
                }
              }
              if (!param1) {
                L3: {
                  if (param0.field_n == 1) {
                    L4: {
                      if (qe.field_m == 0) {
                        this.field_a.a(1, w.field_F, 12);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    this.field_a.a(1, la.field_m, 13);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (-3 == (param0.field_n ^ -1)) {
                  L5: {
                    if (el.field_t == 0) {
                      this.field_a.a(1, rl.field_v, 12);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  this.field_a.a(1, mi.field_a, 13);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return;
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var3);
            stackOut_22_1 = new StringBuilder().append("dj.O(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L6;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public static void a(boolean param0) {
        field_h = null;
        field_f = null;
        if (param0) {
            return;
        }
        field_l = null;
    }

    static {
    }
}
