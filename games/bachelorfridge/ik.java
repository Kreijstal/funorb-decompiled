/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik {
    static ee[] field_h;
    static sna field_i;
    private String field_f;
    sna field_g;
    static kv[] field_l;
    pna field_a;
    private long field_e;
    private int[] field_c;
    private int field_b;
    static int[] field_d;
    String field_j;
    int field_k;

    final void b(boolean param0) {
        String var3 = null;
        int var4 = 0;
        uha var5 = null;
        L0: {
          var4 = BachelorFridge.field_y;
          if (null != pw.field_w) {
            break L0;
          } else {
            var5 = lk.c(-12411, this.field_k);
            if (var5 != null) {
              var3 = var5.field_Jb;
              if (var5.field_Wb) {
                this.field_a.a(lga.a(param0, new String[]{var3}, qh.field_a), true, 2);
                this.field_a.a(lga.a(true, new String[]{var3}, cc.field_a), true, 3);
                break L0;
              } else {
                L1: {
                  if (var5.field_zb) {
                    this.field_a.a(lga.a(true, new String[]{var3}, o.field_i), true, 2);
                    break L1;
                  } else {
                    if (var5.field_gc) {
                      break L1;
                    } else {
                      if (!var5.field_Fb) {
                        break L1;
                      } else {
                        L2: {
                          if (!var5.field_Zb) {
                            break L2;
                          } else {
                            if (!var5.field_zb) {
                              break L1;
                            } else {
                              break L2;
                            }
                          }
                        }
                        this.field_a.a(lga.a(param0, new String[]{var3}, p.field_m), true, 2);
                        break L1;
                      }
                    }
                  }
                }
                if (!var5.field_gc) {
                  break L0;
                } else {
                  this.field_a.a(lga.a(true, new String[]{var3}, fh.field_s), true, 3);
                  break L0;
                }
              }
            } else {
              break L0;
            }
          }
        }
        L3: {
          if (param0) {
            break L3;
          } else {
            this.a((byte) -72, true);
            break L3;
          }
        }
    }

    final void a(int param0, gs param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            if (param1.field_i) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 <= -26) {
                  break L1;
                } else {
                  this.field_c = (int[]) null;
                  break L1;
                }
              }
              L2: {
                this.field_b = param1.field_p;
                if (0 != param1.field_p) {
                  break L2;
                } else {
                  L3: {
                    if (fb.field_p == 0) {
                      this.field_a.a(eea.field_c, true, 12);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  this.field_a.a(d.field_D, true, 13);
                  break L2;
                }
              }
              L4: {
                if (-2 != (param1.field_p ^ -1)) {
                  break L4;
                } else {
                  L5: {
                    if (ri.field_c != 0) {
                      break L5;
                    } else {
                      this.field_a.a(ffa.field_i, true, 12);
                      break L5;
                    }
                  }
                  this.field_a.a(sma.field_B, true, 13);
                  break L4;
                }
              }
              L6: {
                if (-3 == (param1.field_p ^ -1)) {
                  L7: {
                    if (0 != fj.field_g) {
                      break L7;
                    } else {
                      this.field_a.a(iea.field_c, true, 12);
                      break L7;
                    }
                  }
                  this.field_a.a(ho.field_f, true, 13);
                  break L6;
                } else {
                  break L6;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var3);
            stackOut_20_1 = new StringBuilder().append("ik.N(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0) {
        String var3 = null;
        if (null != this.field_j) {
            if ((this.field_e ^ -1L) != (ge.field_F ^ -1L)) {
                var3 = this.b(param0 + -13144);
                String var2 = var3;
                this.field_a.a(lga.a(true, new String[]{var3}, wba.field_d), true, 17);
            }
        }
        if (param0 != 21654) {
            field_l = (kv[]) null;
        }
    }

    final void a(int param0, boolean param1) {
        ema var4 = null;
        String var5 = null;
        int var6 = 0;
        ema var7 = null;
        var6 = BachelorFridge.field_y;
        if (param0 > 113) {
          L0: {
            if (null == this.field_j) {
              break L0;
            } else {
              if (this.field_e == ge.field_F) {
                break L0;
              } else {
                if (pw.field_w == null) {
                  break L0;
                } else {
                  if (!ps.d(-117)) {
                    break L0;
                  } else {
                    var7 = gf.a(this.field_e, false);
                    var4 = uka.a(this.field_e, 28791);
                    var5 = this.b(8510);
                    if (var4 != null) {
                      L1: {
                        if (!pw.field_w.field_Zb) {
                          break L1;
                        } else {
                          if (0 <= pw.field_w.field_Nb) {
                            break L1;
                          } else {
                            break L0;
                          }
                        }
                      }
                      this.field_a.a(lga.a(true, new String[]{var5}, gka.field_m), true, 1);
                      break L0;
                    } else {
                      if (var7 == null) {
                        break L0;
                      } else {
                        if (!pw.field_w.field_Fb) {
                          break L0;
                        } else {
                          if (pw.field_w.field_Rb < pw.field_w.field_Pb) {
                            if (var7.field_wb) {
                              this.field_a.a(lga.a(true, new String[]{var5}, jba.field_w), true, 1);
                              break L0;
                            } else {
                              L2: {
                                if (!param1) {
                                  break L2;
                                } else {
                                  if (!var7.field_Ob) {
                                    break L2;
                                  } else {
                                    this.field_a.a(lga.a(true, new String[]{var5}, op.field_q), true, 0);
                                    this.field_a.a(lga.a(true, new String[]{var5}, rk.field_r), true, 1);
                                    break L0;
                                  }
                                }
                              }
                              this.field_a.a(lga.a(true, new String[]{var5}, vca.field_m), true, 0);
                              break L0;
                            }
                          } else {
                            break L0;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_l = null;
        field_d = null;
        field_i = null;
        field_h = null;
        if (param0 <= 34) {
            field_d = (int[]) null;
        }
    }

    final static kv b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = BachelorFridge.field_y;
        kv var6 = new kv(param0, param0);
        kv var3 = var6;
        if (param2 != 2) {
            return (kv) null;
        }
        for (var4 = 0; var4 < var3.field_v.length; var4++) {
            var6.field_v[var4] = param1;
        }
        return var3;
    }

    private final boolean c(int param0, int param1, int param2) {
        boolean discarded$2 = false;
        int var5 = 0;
        L0: {
          var5 = BachelorFridge.field_y;
          if (param1 == 10960) {
            break L0;
          } else {
            discarded$2 = this.a(-100, 21, 18);
            break L0;
          }
        }
        L1: {
          if (param0 == 0) {
            bia.a((byte) 35, this.field_e, param2);
            break L1;
          } else {
            if (-2 == (param0 ^ -1)) {
              od.a(this.field_e, param2, 2);
              break L1;
            } else {
              if (2 != param0) {
                if (param0 != 3) {
                  if (param0 == 10) {
                    sfa.a(param2, this.field_k, false);
                    break L1;
                  } else {
                    if (param0 != 15) {
                      if ((param0 ^ -1) != -17) {
                        return false;
                      } else {
                        lu.a(0, param2, (byte) 87);
                        break L1;
                      }
                    } else {
                      lu.a(this.field_k, param2, (byte) -101);
                      break L1;
                    }
                  }
                } else {
                  rja.a(param2, this.field_k, param1 + -10959);
                  break L1;
                }
              } else {
                ep.a(false, param2, this.field_k);
                break L1;
              }
            }
          }
        }
        return true;
    }

    final void a(byte param0, boolean param1) {
        this.field_a.a(param1, 7802);
        if (param0 >= -119) {
            this.field_g = (sna) null;
        }
    }

    final void a(int[] param0, byte param1, int param2) {
        boolean discarded$1 = false;
        RuntimeException var4 = null;
        String var4_ref = null;
        nea var5 = null;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -105) {
                break L1;
              } else {
                discarded$1 = this.a(false);
                break L1;
              }
            }
            L2: {
              if (null == this.field_j) {
                break L2;
              } else {
                L3: {
                  if ((ge.field_F ^ -1L) != (this.field_e ^ -1L)) {
                    break L3;
                  } else {
                    if ((param2 ^ -1) != -3) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if ((um.field_c ^ -1) == -3) {
                  L4: {
                    var7 = this.b(8510);
                    var4_ref = var7;
                    var5 = bna.b(-100, this.field_j);
                    var6 = bna.a((byte) 5, this.field_j) ? 1 : 0;
                    if (var5 != null) {
                      break L4;
                    } else {
                      if (var6 == 0) {
                        this.field_a.a(lga.a(true, new String[]{var7}, faa.field_a), true, 4);
                        this.field_a.a(lga.a(true, new String[]{var7}, hba.field_v), true, 6);
                        if (param0 == null) {
                          break L4;
                        } else {
                          if (2 == param2) {
                            break L4;
                          } else {
                            if (hl.field_I) {
                              break L4;
                            } else {
                              this.field_c = param0;
                              this.field_a.a(lga.a(true, new String[]{var7}, pe.field_n), true, 19);
                              break L4;
                            }
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (var5 == null) {
                      break L5;
                    } else {
                      L6: {
                        if (sha.a((byte) -24, this.field_j)) {
                          break L6;
                        } else {
                          if (hl.field_I) {
                            break L6;
                          } else {
                            L7: {
                              if (!sea.field_j) {
                                this.field_a.a(lga.a(true, new String[]{var7}, jv.field_m), true, 8);
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            this.field_a.a(lga.a(true, new String[]{var7}, lga.field_i), true, 18);
                            if (param0 != null) {
                              this.field_c = param0;
                              this.field_a.a(lga.a(true, new String[]{var7}, pe.field_n), true, 19);
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      this.field_a.a(lga.a(true, new String[]{var7}, gl.field_g), true, 5);
                      break L5;
                    }
                  }
                  if (var6 != 0) {
                    this.field_a.a(lga.a(true, new String[]{var7}, oj.field_n), true, 7);
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var4);
            stackOut_29_1 = new StringBuilder().append("ik.D(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L8;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L8;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final boolean a(int param0, int param1, int param2) {
        boolean discarded$678 = false;
        boolean discarded$679 = false;
        int var5 = 0;
        L0: {
          var5 = BachelorFridge.field_y;
          if (param0 == -14) {
            break L0;
          } else {
            discarded$678 = this.d(35, -60, 45);
            break L0;
          }
        }
        L1: {
          if (8 == param2) {
            od.a(this.field_e, this.field_j, false);
            break L1;
          } else {
            if (param2 != 18) {
              if (param2 != 11) {
                if (-13 != (param2 ^ -1)) {
                  if ((param2 ^ -1) != -14) {
                    if (14 != param2) {
                      if (20 == param2) {
                        fk.d(param0 + 14);
                        break L1;
                      } else {
                        if (19 != param2) {
                          return false;
                        } else {
                          discarded$679 = ew.a(this.field_c, this.field_e, this.field_b, false, this.field_j);
                          return true;
                        }
                      }
                    } else {
                      kw.a(true);
                      break L1;
                    }
                  } else {
                    fk.a(param0 ^ -108, this.field_b, param1, 2);
                    break L1;
                  }
                } else {
                  fk.a(123, this.field_b, param1, 1);
                  break L1;
                }
              } else {
                fk.a(param0 ^ -117, this.field_b, param1, 0);
                break L1;
              }
            } else {
              pj.a(this.field_j, (byte) 89, this.field_e);
              break L1;
            }
          }
        }
        return true;
    }

    private final String b(int param0) {
        String var2 = null;
        if (param0 != 8510) {
            this.field_k = 101;
        }
        if (null == this.field_f) {
            var2 = this.field_j;
        } else {
            var2 = this.field_f;
        }
        return var2;
    }

    final boolean a(boolean param0) {
        String discarded$2 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0) {
            break L0;
          } else {
            discarded$2 = this.b(-99);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == this.field_a) {
              break L2;
            } else {
              if (!this.field_a.g(0)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final boolean a(boolean param0, boolean param1, int param2, int param3, int param4) {
        int var6 = this.field_a.b(param1, 74);
        if ((var6 ^ -1) == 1) {
            return false;
        }
        boolean discarded$0 = this.c(var6, 10960, param4);
        boolean discarded$2 = this.d(param2, var6, 96);
        if (!param0) {
            return false;
        }
        boolean discarded$3 = this.a(-14, param2, var6);
        boolean discarded$4 = this.e(var6, param3, -12211);
        return true;
    }

    final static void a(int param0, jfa param1, int param2, int param3) {
        pf var4 = null;
        int var5 = 0;
        if (bp.e(-29919)) {
            return;
        }
        try {
            var4 = sja.field_fb;
            var4.c(85, (byte) 117);
            sja.field_fb.field_g = sja.field_fb.field_g + 2;
            var5 = sja.field_fb.field_g;
            rha.a(param1.field_g, var4, (byte) -116);
            var4.d(param0, 0);
            var4.d(param3, param2 ^ param2);
            sja.field_fb.a((byte) -88, sja.field_fb.field_g + -var5);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ik.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final boolean e(int param0, int param1, int param2) {
        if (!((param0 ^ -1) != -18)) {
            wt.field_n = new uq(this.field_g.field_D, this.field_g.field_M, this.field_g.field_sb, this.field_g.field_p, param1, qaa.field_d, mda.field_c, sm.field_s, qs.field_m, nr.field_v, dla.field_k, this.field_j, this.field_e);
            return true;
        }
        if (param2 != -12211) {
            return true;
        }
        return false;
    }

    private final boolean d(int param0, int param1, int param2) {
        boolean discarded$2 = false;
        Object var4 = null;
        String var4_ref = null;
        String var5 = null;
        L0: {
          if (param2 > 12) {
            break L0;
          } else {
            discarded$2 = this.a(79, -108, -76);
            break L0;
          }
        }
        L1: {
          var4 = null;
          if (-5 == (param1 ^ -1)) {
            var4_ref = lda.a(-26181, param0, this.field_j);
            break L1;
          } else {
            if ((param1 ^ -1) != -6) {
              if ((param1 ^ -1) != -7) {
                if (-8 == (param1 ^ -1)) {
                  var4_ref = tha.a(2, this.field_j, this.field_f, param0);
                  break L1;
                } else {
                  return false;
                }
              } else {
                var4_ref = ip.a(this.field_j, (byte) -80, param0);
                break L1;
              }
            } else {
              var4_ref = via.a(param0, this.field_j, -100);
              break L1;
            }
          }
        }
        if (var4_ref != null) {
          var5 = (String) null;
          vf.a(this.field_j, 0, 124, (String) null, var4_ref, 2);
          return true;
        } else {
          return true;
        }
    }

    ik(sna param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        try {
            this.field_a = new pna(td.field_o);
            this.field_f = param3;
            this.field_j = param2;
            this.field_k = param4;
            this.field_g = param0;
            this.field_b = param5;
            this.field_e = param1;
            this.field_c = param6;
            param0.field_t = true;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ik.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
