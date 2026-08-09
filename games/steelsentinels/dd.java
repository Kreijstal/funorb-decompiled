/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd {
    String field_k;
    private String field_a;
    private int field_f;
    private int[] field_i;
    int field_g;
    static int field_d;
    static gh field_b;
    static volatile boolean field_e;
    static String field_l;
    private long field_h;
    dn field_j;
    gh field_c;

    final static String a(int param0, byte param1, String param2) {
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_16_0 = null;
        String stackIn_19_0 = null;
        String stackIn_23_0 = null;
        Object stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        kj var5 = null;
        CharSequence var6 = null;
        try {
          L0: {
            var6 = (CharSequence) ((Object) param2);
            if (fa.a(true, var6)) {
              if (wl.a(86, param2)) {
                stackIn_6_0 = o.field_f;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (qc.field_P != 2) {
                  stackIn_10_0 = nc.field_p;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L1: {
                    if (param1 == 55) {
                      break L1;
                    } else {
                      field_l = (String) null;
                      break L1;
                    }
                  }
                  if (o.a(-42, param2)) {
                    stackIn_16_0 = db.a(sn.field_s, param1 + -78, new String[]{param2});
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (cc.field_gc < 100) {
                      if (pf.a(param2, -112)) {
                        stackIn_23_0 = db.a(mg.field_ic, -12, new String[]{param2});
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        var5 = mm.field_g;
                        var5.a(param0, (byte) -117);
                        var5.field_p = var5.field_p + 1;
                        var4 = var5.field_p;
                        var5.a((byte) 111, 2);
                        var5.a(param2, -93);
                        var5.b((byte) -28, var5.field_p + -var4);
                        stackIn_25_0 = null;
                        decompiledRegionSelector0 = 6;
                        break L0;
                      }
                    } else {
                      stackIn_19_0 = jc.field_g;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                }
              }
            } else {
              stackIn_2_0 = en.field_a;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var3);

            stackIn_28_1 = new StringBuilder().append("dd.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L2;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_16_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_19_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_23_0;
                  } else {
                    return (String) ((Object) stackIn_25_0);
                  }
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_l = null;
        if (param0 != 0) {
            String var2 = (String) null;
            dd.a((cm) null, (cm) null, false, (String) null, (String) null);
        }
    }

    private final boolean a(int param0, int param1, int param2) {
        if (17 == param0) {
          n.field_x = new td(this.field_c.field_Rb, this.field_c.field_cb, this.field_c.field_zb, this.field_c.field_Lb, param2, an.field_a, od.field_g, hg.field_e, bd.field_f, ol.field_Tb, qb.field_K, this.field_k, this.field_h);
          return true;
        } else {
          if (param1 <= 115) {
            return true;
          } else {
            return false;
          }
        }
    }

    final void c(int param0) {
        String var2;
        String var3;
        if (param0 > -1) {
          L0: {
            field_l = (String) null;
            if (this.field_k == null) {
              break L0;
            } else {
              if (this.field_h == nb.field_G) {
                break L0;
              } else {
                var3 = this.b(2);
                var2 = var3;
                this.field_j.a(2, 17, db.a(gd.field_ob, -40, new String[]{var3}));
                break L0;
              }
            }
          }
          return;
        } else {
          L1: {
            if (this.field_k == null) {
              break L1;
            } else {
              if (this.field_h == nb.field_G) {
                break L1;
              } else {
                var3 = this.b(2);
                var2 = var3;
                this.field_j.a(2, 17, db.a(gd.field_ob, -40, new String[]{var3}));
                break L1;
              }
            }
          }
          return;
        }
    }

    private final boolean a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = SteelSentinels.field_G;
        if (0 == param1) {
            ik.a(this.field_h, param0, false);
            var4 = -14 / ((35 - param2) / 45);
            return true;
        }
        if ((param1 ^ -1) == -2) {
            ec.a(param0, false, this.field_h);
            var4 = -14 / ((35 - param2) / 45);
            return true;
        }
        if (-3 == (param1 ^ -1)) {
            jg.a(this.field_g, (byte) 112, param0);
        } else {
            if (3 == param1) {
                na.a((byte) -40, param0, this.field_g);
                var4 = -14 / ((35 - param2) / 45);
                return true;
            }
            if (param1 == 10) {
                ei.a(this.field_g, (byte) -23, param0);
                var4 = -14 / ((35 - param2) / 45);
                return true;
            }
            if (-16 == (param1 ^ -1)) {
                nl.a(this.field_g, param0, 5);
                var4 = -14 / ((35 - param2) / 45);
                return true;
            }
            if (param1 != 16) {
                return false;
            }
            nl.a(0, param0, 5);
            var4 = -14 / ((35 - param2) / 45);
            return true;
        }
        var4 = -14 / ((35 - param2) / 45);
        return true;
    }

    final boolean b(byte param0) {
        if (param0 > 66) {
          if (null != this.field_j) {
            if (!this.field_j.j(-108)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          this.field_g = -63;
          if (null != this.field_j) {
            if (!this.field_j.j(-108)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final void a(int param0, na param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param1.field_g) {
              L1: {
                this.field_f = param1.field_k;
                if (0 != param1.field_k) {
                  break L1;
                } else {
                  L2: {
                    if (0 == sg.field_c) {
                      this.field_j.a(param0 + 2, 12, jh.field_f);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  this.field_j.a(param0 ^ 2, 13, lk.field_V);
                  break L1;
                }
              }
              L3: {
                if ((param1.field_k ^ -1) != -2) {
                  break L3;
                } else {
                  L4: {
                    if (0 != pm.field_Z) {
                      break L4;
                    } else {
                      this.field_j.a(2, 12, ne.field_H);
                      break L4;
                    }
                  }
                  this.field_j.a(2, 13, og.field_a);
                  break L3;
                }
              }
              L5: {
                if ((param1.field_k ^ -1) != -3) {
                  break L5;
                } else {
                  L6: {
                    if (fi.field_y != 0) {
                      break L6;
                    } else {
                      this.field_j.a(2, 12, fj.field_c);
                      break L6;
                    }
                  }
                  this.field_j.a(2, 13, he.field_f);
                  break L5;
                }
              }
              if (param0 == 0) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                field_d = -60;
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3);

            stackIn_20_1 = new StringBuilder().append("dd.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L7;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L7;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final String b(int param0) {
        String var2;
        if (param0 != 2) {
          L0: {
            this.field_i = (int[]) null;
            if (this.field_a != null) {
              var2 = this.field_a;
              break L0;
            } else {
              var2 = this.field_k;
              break L0;
            }
          }
          return var2;
        } else {
          L1: {
            if (this.field_a != null) {
              var2 = this.field_a;
              break L1;
            } else {
              var2 = this.field_k;
              break L1;
            }
          }
          return var2;
        }
    }

    final boolean a(boolean param0, int param1, int param2, int param3, int param4) {
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        boolean discarded$6 = false;
        boolean discarded$7 = false;
        int var6;
        int var7;
        var6 = this.field_j.a(param0, true);
        var7 = -12 % ((-56 - param1) / 50);
        if (-2 == var6) {
          return false;
        } else {
          discarded$4 = this.a(param4, var6, (byte) 109);
          discarded$5 = this.b(var6, -7, param3);
          discarded$6 = this.a(false, param3, var6);
          discarded$7 = this.a(var6, 120, param2);
          return true;
        }
    }

    final void b(boolean param0, byte param1) {
        this.field_j.a(param0, (byte) 126);
        int var3 = -36 % ((param1 - 65) / 48);
    }

    final void a(int[] param0, int param1, int param2) {
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        ah var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          L0: {
            L1: {
              if (null == this.field_k) {
                break L1;
              } else {
                L2: {
                  if ((nb.field_G ^ -1L) != (this.field_h ^ -1L)) {
                    break L2;
                  } else {
                    if (2 != param2) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (qc.field_P == 2) {
                  L3: {
                    var7 = this.b(param1 + 4);
                    var4 = var7;
                    var5 = wi.a(this.field_k, (byte) 114);
                    var6 = o.a(-128, this.field_k) ? 1 : 0;
                    if (var5 != null) {
                      break L3;
                    } else {
                      if (var6 == 0) {
                        this.field_j.a(param1 ^ -4, 4, db.a(ti.field_r, param1 + -121, new String[]{var7}));
                        this.field_j.a(2, 6, db.a(g.field_g, param1 + -30, new String[]{var7}));
                        if (param0 == null) {
                          break L3;
                        } else {
                          if ((param2 ^ -1) == -3) {
                            break L3;
                          } else {
                            if (!fj.field_e) {
                              this.field_i = param0;
                              this.field_j.a(2, 19, db.a(lj.field_f, -75, new String[]{var7}));
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (var5 == null) {
                      break L4;
                    } else {
                      L5: {
                        if (ob.a((byte) -38, this.field_k)) {
                          break L5;
                        } else {
                          if (!fj.field_e) {
                            L6: {
                              if (!uc.field_g) {
                                this.field_j.a(2, 8, db.a(rj.field_c, -108, new String[]{var7}));
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            this.field_j.a(param1 + 4, 18, db.a(dg.field_b, param1 ^ 61, new String[]{var7}));
                            if (param0 != null) {
                              this.field_i = param0;
                              this.field_j.a(param1 ^ -4, 19, db.a(lj.field_f, param1 + -77, new String[]{var7}));
                              break L5;
                            } else {
                              break L5;
                            }
                          } else {
                            break L5;
                          }
                        }
                      }
                      this.field_j.a(2, 5, db.a(ei.field_r, -76, new String[]{var7}));
                      break L4;
                    }
                  }
                  if (var6 == 0) {
                    break L1;
                  } else {
                    this.field_j.a(2, 7, db.a(fk.field_n, -52, new String[]{var7}));
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
            }
            if (param1 == -2) {
              break L0;
            } else {
              dd.a(45, 110);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4_ref = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var4_ref);

            stackIn_32_1 = new StringBuilder().append("dd.N(");

            if (param0 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L7;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L7;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(boolean param0, byte param1) {
        String discarded$0 = null;
        String discarded$1 = null;
        String discarded$2 = null;
        String discarded$3 = null;
        String discarded$4 = null;
        String discarded$5 = null;
        String discarded$6 = null;
        String discarded$7 = null;
        String discarded$8 = null;
        String discarded$9 = null;
        String discarded$10 = null;
        String discarded$11 = null;
        cc var4;
        String var5;
        int var6;
        cc var7;
        var6 = SteelSentinels.field_G;
        if (null != this.field_k) {
          if (nb.field_G != this.field_h) {
            if (null != nf.field_b) {
              if (kk.a(-28548)) {
                var7 = ri.a(this.field_h, false);
                var4 = kh.a(false, this.field_h);
                var5 = this.b(2);
                if (var4 == null) {
                  L0: {
                    if (var7 == null) {
                      break L0;
                    } else {
                      if (!nf.field_b.field_dc) {
                        break L0;
                      } else {
                        if (nf.field_b.field_wc < nf.field_b.field_Ub) {
                          if (var7.field_Zb) {
                            this.field_j.a(2, 1, db.a(va.field_a, -118, new String[]{var5}));
                            if (param1 < -73) {
                              return;
                            } else {
                              discarded$0 = this.b(96);
                              return;
                            }
                          } else {
                            L1: {
                              if (!param0) {
                                break L1;
                              } else {
                                if (!var7.field_kc) {
                                  break L1;
                                } else {
                                  this.field_j.a(2, 0, db.a(nk.field_P, -104, new String[]{var5}));
                                  this.field_j.a(2, 1, db.a(bh.field_o, -54, new String[]{var5}));
                                  if (param1 < -73) {
                                    return;
                                  } else {
                                    discarded$1 = this.b(96);
                                    return;
                                  }
                                }
                              }
                            }
                            this.field_j.a(2, 0, db.a(t.field_j, -18, new String[]{var5}));
                            if (param1 < -73) {
                              return;
                            } else {
                              discarded$2 = this.b(96);
                              return;
                            }
                          }
                        } else {
                          if (param1 >= -73) {
                            discarded$3 = this.b(96);
                            return;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  }
                  if (param1 < -73) {
                    return;
                  } else {
                    discarded$4 = this.b(96);
                    return;
                  }
                } else {
                  if (!nf.field_b.field_rc) {
                    this.field_j.a(2, 1, db.a(bg.field_E, -88, new String[]{var5}));
                    if (param1 >= -73) {
                      discarded$5 = this.b(96);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if ((nf.field_b.field_Mc ^ -1) <= -1) {
                      this.field_j.a(2, 1, db.a(bg.field_E, -88, new String[]{var5}));
                      if (param1 >= -73) {
                        discarded$6 = this.b(96);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (param1 >= -73) {
                        discarded$7 = this.b(96);
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
              } else {
                if (param1 >= -73) {
                  discarded$8 = this.b(96);
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (param1 >= -73) {
                discarded$9 = this.b(96);
                return;
              } else {
                return;
              }
            }
          } else {
            if (param1 >= -73) {
              discarded$10 = this.b(96);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param1 >= -73) {
            discarded$11 = this.b(96);
            return;
          } else {
            return;
          }
        }
    }

    final void a(byte param0) {
        String var3;
        int var4;
        hk var5;
        var4 = SteelSentinels.field_G;
        if (null == nf.field_b) {
          var5 = en.a(this.field_g, 28858);
          if (var5 != null) {
            var3 = var5.field_Xb;
            if (var5.field_vc) {
              this.field_j.a(2, 2, db.a(ah.field_Xb, -31, new String[]{var3}));
              this.field_j.a(param0 ^ 66, 3, db.a(vi.field_Z, -38, new String[]{var3}));
              if (param0 == 64) {
                return;
              } else {
                this.field_a = (String) null;
                return;
              }
            } else {
              if (var5.field_cc) {
                this.field_j.a(param0 ^ 66, 2, db.a(cl.field_a, -126, new String[]{var3}));
                if (!var5.field_bc) {
                  if (param0 == 64) {
                    return;
                  } else {
                    this.field_a = (String) null;
                    return;
                  }
                } else {
                  this.field_j.a(2, 3, db.a(km.field_d, param0 + -109, new String[]{var3}));
                  if (param0 == 64) {
                    return;
                  } else {
                    this.field_a = (String) null;
                    return;
                  }
                }
              } else {
                if (!var5.field_bc) {
                  if (var5.field_dc) {
                    if (!var5.field_rc) {
                      this.field_j.a(2, 2, db.a(cd.field_f, -70, new String[]{var3}));
                      if (!var5.field_bc) {
                        if (param0 == 64) {
                          return;
                        } else {
                          this.field_a = (String) null;
                          return;
                        }
                      } else {
                        this.field_j.a(2, 3, db.a(km.field_d, param0 + -109, new String[]{var3}));
                        if (param0 == 64) {
                          return;
                        } else {
                          this.field_a = (String) null;
                          return;
                        }
                      }
                    } else {
                      if (!var5.field_cc) {
                        if (!var5.field_bc) {
                          if (param0 == 64) {
                            return;
                          } else {
                            this.field_a = (String) null;
                            return;
                          }
                        } else {
                          this.field_j.a(2, 3, db.a(km.field_d, param0 + -109, new String[]{var3}));
                          if (param0 == 64) {
                            return;
                          } else {
                            this.field_a = (String) null;
                            return;
                          }
                        }
                      } else {
                        this.field_j.a(2, 2, db.a(cd.field_f, -70, new String[]{var3}));
                        if (!var5.field_bc) {
                          if (param0 != 64) {
                            this.field_a = (String) null;
                            return;
                          } else {
                            return;
                          }
                        } else {
                          this.field_j.a(2, 3, db.a(km.field_d, param0 + -109, new String[]{var3}));
                          if (param0 != 64) {
                            this.field_a = (String) null;
                            return;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  } else {
                    if (!var5.field_bc) {
                      if (param0 != 64) {
                        this.field_a = (String) null;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      this.field_j.a(2, 3, db.a(km.field_d, param0 + -109, new String[]{var3}));
                      if (param0 != 64) {
                        this.field_a = (String) null;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  if (!var5.field_bc) {
                    if (param0 != 64) {
                      this.field_a = (String) null;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    this.field_j.a(2, 3, db.a(km.field_d, param0 + -109, new String[]{var3}));
                    if (param0 != 64) {
                      this.field_a = (String) null;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          } else {
            if (param0 != 64) {
              this.field_a = (String) null;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 != 64) {
            this.field_a = (String) null;
            return;
          } else {
            return;
          }
        }
    }

    final static int a(int param0, int param1) {
        String var3;
        if (param0 != 20612) {
          var3 = (String) null;
          dd.a(120, (byte) -58, (String) null);
          return lf.field_e[2047 & param1];
        } else {
          return lf.field_e[2047 & param1];
        }
    }

    final static ld a(cm param0, cm param1, boolean param2, String param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        ld stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2) {
                break L1;
              } else {
                dd.a(18);
                break L1;
              }
            }
            var5_int = param0.a(param3, 46);
            var6 = param0.a(var5_int, -32759, param4);
            stackIn_3_0 = in.a(param1, 112, var6, param0, var5_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("dd.E(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ')');
        }
        return stackIn_3_0;
    }

    private final boolean a(boolean param0, int param1, int param2) {
        int var5;
        var5 = SteelSentinels.field_G;
        if (param0) {
          dd.a(-11);
          if ((param2 ^ -1) != -9) {
            if (param2 != 18) {
              if (param2 != 11) {
                if ((param2 ^ -1) != -13) {
                  if (-14 != (param2 ^ -1)) {
                    if ((param2 ^ -1) != -15) {
                      if (-21 != (param2 ^ -1)) {
                        if ((param2 ^ -1) == -20) {
                          dl.a(this.field_h, this.field_i, -116, this.field_f, this.field_k);
                          return true;
                        } else {
                          return false;
                        }
                      } else {
                        pd.j(13171);
                        return true;
                      }
                    } else {
                      lk.g(0);
                      return true;
                    }
                  } else {
                    il.a(2, this.field_f, param1, -18853);
                    return true;
                  }
                } else {
                  il.a(1, this.field_f, param1, -18853);
                  return true;
                }
              } else {
                il.a(0, this.field_f, param1, -18853);
                return true;
              }
            } else {
              ic.a(-23543, this.field_h, this.field_k);
              return true;
            }
          } else {
            bc.a(this.field_h, this.field_k, 2);
            return true;
          }
        } else {
          if ((param2 ^ -1) != -9) {
            if (param2 != 18) {
              if (param2 != 11) {
                if ((param2 ^ -1) != -13) {
                  if (-14 != (param2 ^ -1)) {
                    if ((param2 ^ -1) != -15) {
                      if (-21 != (param2 ^ -1)) {
                        if ((param2 ^ -1) == -20) {
                          dl.a(this.field_h, this.field_i, -116, this.field_f, this.field_k);
                          return true;
                        } else {
                          return false;
                        }
                      } else {
                        pd.j(13171);
                        return true;
                      }
                    } else {
                      lk.g(0);
                      return true;
                    }
                  } else {
                    il.a(2, this.field_f, param1, -18853);
                    return true;
                  }
                } else {
                  il.a(1, this.field_f, param1, -18853);
                  return true;
                }
              } else {
                il.a(0, this.field_f, param1, -18853);
                return true;
              }
            } else {
              ic.a(-23543, this.field_h, this.field_k);
              return true;
            }
          } else {
            bc.a(this.field_h, this.field_k, 2);
            return true;
          }
        }
    }

    private final boolean b(int param0, int param1, int param2) {
        Object var4;
        String var5;
        String var6;
        String var7;
        String var8;
        if (param1 == -7) {
          var4 = null;
          if (4 == param0) {
            var8 = lj.a(this.field_k, (byte) -79, param2);
            if (var8 != null) {
              sj.a((String) null, var8, 0, (byte) 21, this.field_k, 2);
              return true;
            } else {
              return true;
            }
          } else {
            if (param0 != 5) {
              if ((param0 ^ -1) == -7) {
                var7 = dd.a(param2, (byte) 55, this.field_k);
                if (var7 != null) {
                  sj.a((String) null, var7, 0, (byte) 21, this.field_k, 2);
                  return true;
                } else {
                  return true;
                }
              } else {
                if (-8 == (param0 ^ -1)) {
                  var6 = rn.a(this.field_a, param2, this.field_k, true);
                  if (var6 == null) {
                    return true;
                  } else {
                    sj.a((String) null, var6, 0, (byte) 21, this.field_k, 2);
                    return true;
                  }
                } else {
                  return false;
                }
              }
            } else {
              var5 = nl.a(this.field_k, param2, true);
              if (var5 == null) {
                return true;
              } else {
                sj.a((String) null, var5, 0, (byte) 21, this.field_k, 2);
                return true;
              }
            }
          }
        } else {
          return false;
        }
    }

    dd(gh param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        try {
            this.field_j = new dn(jn.field_h);
            this.field_k = param2;
            this.field_i = param6;
            this.field_g = param4;
            this.field_h = param1;
            this.field_f = param5;
            this.field_a = param3;
            this.field_c = param0;
            param0.field_G = true;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "dd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = true;
        field_l = "(Including <%0>)";
    }
}
