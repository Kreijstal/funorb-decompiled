/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl extends l {
    static String field_q;
    int field_F;
    boolean[] field_y;
    int field_I;
    String field_K;
    static String field_o;
    private int field_O;
    private int field_L;
    private int field_E;
    private boolean field_v;
    private wn field_l;
    static int field_C;
    int field_t;
    private int field_p;
    int field_P;
    int field_m;
    private er field_G;
    private boolean field_w;
    private int field_B;
    int field_x;
    boolean field_u;
    int field_J;
    private er field_M;
    private boolean field_n;
    private er field_A;
    static String[] field_z;
    static cc field_N;
    private boolean field_H;
    static int[] field_r;
    private int field_D;
    String[] field_k;
    private int field_s;

    public static void a(byte param0) {
        field_N = null;
        if (param0 != -50) {
            field_o = (String) null;
        }
        field_r = null;
        field_q = null;
        field_z = null;
        field_o = null;
    }

    final static ug c(boolean param0) {
        if (!param0) {
            return (ug) null;
        }
        return (ug) ((Object) new nl());
    }

    final static void a(boolean param0, int param1, int param2) {
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        String[] stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        String[] stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        String stackIn_40_2 = null;
        String[] stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_44_2 = 0;
        int stackIn_44_3 = 0;
        String stackIn_47_2 = null;
        String stackIn_90_0 = null;
        String stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        int stackIn_111_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_112_1 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String var11 = null;
        String var12 = null;
        var9 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              nm.field_J = true;
              da.field_j = param1;
              if (0 == da.field_j) {
                var3_int = dc.a(bc.field_c, qr.field_o, (byte) 101, rn.field_w, mf.field_c);
                var4 = 3 - -var3_int;
                gd.field_s = new int[var4];
                mn.field_q = new String[var4];
                var5 = 0;
                L2: while (true) {
                  if (var5 >= var4) {
                    gi.field_n = new int[2];
                    var5 = 0;
                    L3: while (true) {
                      if (var3_int <= var5) {
                        mn.field_q[-3 + var4] = "";
                        mn.field_q[var4 - 2] = dc.field_M;
                        gd.field_s[var4 + -2] = 0;
                        gi.field_n[0] = 4;
                        mn.field_q[var4 - 1] = lr.field_N;
                        gd.field_s[var4 - 1] = 1;
                        gi.field_n[1] = 5;
                        break L1;
                      } else {
                        mn.field_q[var5] = rn.field_w[var5];
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    gd.field_s[var5] = -1;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                if (-2 != (da.field_j ^ -1)) {
                  if (2 != da.field_j) {
                    if (da.field_j != 3) {
                      if (da.field_j != 4) {
                        if (da.field_j != 5) {
                          throw new IllegalArgumentException();
                        } else {
                          var3_int = dc.a(bc.field_c, w.field_D, (byte) 28, rn.field_w, mf.field_c);
                          var4 = 3 + var3_int;
                          mn.field_q = new String[var4];
                          gd.field_s = new int[var4];
                          var5 = 0;
                          L4: while (true) {
                            if (var5 >= var4) {
                              gi.field_n = new int[2];
                              var5 = 0;
                              L5: while (true) {
                                if (var3_int <= var5) {
                                  mn.field_q[var4 - 3] = "";
                                  mn.field_q[var4 - 2] = eo.field_n;
                                  gd.field_s[-2 + var4] = 0;
                                  gi.field_n[0] = 3;
                                  mn.field_q[-1 + var4] = lr.field_N;
                                  gd.field_s[var4 - 1] = 1;
                                  gi.field_n[1] = 5;
                                  break L1;
                                } else {
                                  mn.field_q[var5] = rn.field_w[var5];
                                  var5++;
                                  continue L5;
                                }
                              }
                            } else {
                              gd.field_s[var5] = -1;
                              var5++;
                              continue L4;
                            }
                          }
                        }
                      } else {
                        var3_int = dc.a(bc.field_c, lh.field_a, (byte) 50, rn.field_w, mf.field_c);
                        var4 = 2 - -var3_int;
                        gd.field_s = new int[var4];
                        mn.field_q = new String[var4];
                        var5 = 0;
                        L6: while (true) {
                          if (var4 <= var5) {
                            gi.field_n = new int[1];
                            var5 = 0;
                            L7: while (true) {
                              if (var5 >= var3_int) {
                                mn.field_q[-2 + var4] = "";
                                mn.field_q[var4 - 1] = lr.field_N;
                                gd.field_s[-1 + var4] = 0;
                                gi.field_n[0] = 5;
                                break L1;
                              } else {
                                mn.field_q[var5] = rn.field_w[var5];
                                var5++;
                                continue L7;
                              }
                            }
                          } else {
                            gd.field_s[var5] = -1;
                            var5++;
                            continue L6;
                          }
                        }
                      }
                    } else {
                      L8: {
                        if (!gi.field_s.field_p) {
                          var3_int = dc.a(bc.field_c, ko.field_U, (byte) 110, rn.field_w, mf.field_c);
                          break L8;
                        } else {
                          var3_int = dc.a(bc.field_c, tk.field_p, (byte) 91, rn.field_w, mf.field_c);
                          break L8;
                        }
                      }
                      var4 = 2 - -var3_int;
                      gd.field_s = new int[var4];
                      mn.field_q = new String[var4];
                      var5 = 0;
                      L9: while (true) {
                        if (var4 <= var5) {
                          gi.field_n = new int[1];
                          var5 = 0;
                          L10: while (true) {
                            if (var3_int <= var5) {
                              mn.field_q[var4 + -2] = "";
                              mn.field_q[var4 + -1] = lr.field_N;
                              gd.field_s[-1 + var4] = 0;
                              gi.field_n[0] = 5;
                              break L1;
                            } else {
                              mn.field_q[var5] = rn.field_w[var5];
                              var5++;
                              continue L10;
                            }
                          }
                        } else {
                          gd.field_s[var5] = -1;
                          var5++;
                          continue L9;
                        }
                      }
                    }
                  } else {
                    var3_int = dc.a(bc.field_c, Vertigo2.a(new String[]{"<br><%0><br>"}, bc.field_a, -112), (byte) 36, rn.field_w, mf.field_c);
                    var4 = -1;
                    var5 = 0;
                    L11: while (true) {
                      L12: {
                        if (var3_int <= var5) {
                          break L12;
                        } else {
                          if ("<%0>".equals(rn.field_w[var5])) {
                            var4 = var5;
                            break L12;
                          } else {
                            var5++;
                            continue L11;
                          }
                        }
                      }
                      if (-1 != var4) {
                        jo.field_g = new String[var4];
                        qq.a(rn.field_w, 0, jo.field_g, 0, var4);
                        field_z = new String[var3_int - var4 + -1];
                        qq.a(rn.field_w, 1 + var4, field_z, 0, -1 + -var4 + var3_int);
                        var3_int = dc.a(bc.field_c, Vertigo2.a(new String[]{"<br><%0><br>"}, ro.field_f, -113), (byte) 102, rn.field_w, mf.field_c);
                        var4 = -1;
                        var5 = 0;
                        L13: while (true) {
                          L14: {
                            if (var3_int <= var5) {
                              break L14;
                            } else {
                              if (!"<%0>".equals(rn.field_w[var5])) {
                                var5++;
                                continue L13;
                              } else {
                                var4 = var5;
                                break L14;
                              }
                            }
                          }
                          if (-1 != var4) {
                            L15: {
                              rp.field_e = new String[var4];
                              qq.a(rn.field_w, 0, rp.field_e, 0, var4);
                              ba.field_b = new String[-1 + -var4 + var3_int];
                              qq.a(rn.field_w, var4 - -1, ba.field_b, 0, -var4 + var3_int + -1);
                              if (jo.field_g.length >= rp.field_e.length) {
                                stackIn_29_0 = jo.field_g.length;
                                break L15;
                              } else {
                                stackIn_29_0 = rp.field_e.length;
                                break L15;
                              }
                            }
                            L16: {
                              var5 = stackIn_29_0;
                              if (ba.field_b.length <= field_z.length) {
                                stackIn_32_0 = field_z.length;
                                break L16;
                              } else {
                                stackIn_32_0 = ba.field_b.length;
                                break L16;
                              }
                            }
                            var6 = stackIn_32_0;
                            var7 = var5 + 7 - -var6;
                            gd.field_s = new int[var7];
                            mn.field_q = new String[var7];
                            var8 = 0;
                            L17: while (true) {
                              if (var8 >= var7) {
                                gd.field_s[1] = 0;
                                gi.field_n = new int[2];
                                mn.field_q[1] = ca.field_d;
                                mn.field_q[0] = am.field_e;
                                gd.field_s[3] = 1;
                                gi.field_n[1] = 2;
                                gi.field_n[0] = 5;
                                mn.field_q[3] = wn.field_i;
                                mn.field_q[2] = lf.field_E;
                                mn.field_q[5] = "";
                                mn.field_q[4] = dc.field_K;
                                var8 = 0;
                                L18: while (true) {
                                  if (var8 >= var5) {
                                    mn.field_q[var5 + 6] = null;
                                    gd.field_s[6 - -var5] = -2;
                                    var8 = 0;
                                    L19: while (true) {
                                      if (var8 >= var6) {
                                        qe.field_cb = gk.a(95);
                                        break L1;
                                      } else {
                                        stackIn_44_0 = mn.field_q;
                                        stackIn_44_1 = var8 + (7 - -var5);
                                        stackIn_44_2 = ba.field_b.length ^ -1;
                                        stackIn_44_3 = var8 ^ -1;
                                        L20: {




                                          if (stackIn_44_2 >= stackIn_44_3) {
                                            stackIn_44_0 = (String[]) ((Object) stackIn_44_0);

                                            stackIn_47_2 = "";
                                            break L20;
                                          } else {
                                            stackIn_44_0 = (String[]) ((Object) stackIn_44_0);

                                            stackIn_47_2 = ba.field_b[var8];
                                            break L20;
                                          }
                                        }
                                        stackIn_44_0[stackIn_44_1] = stackIn_47_2;
                                        var8++;
                                        continue L19;
                                      }
                                    }
                                  } else {
                                    L21: {
                                      stackIn_39_0 = mn.field_q;

                                      stackIn_39_1 = var8 + 6;

                                      if ((-var5 + (var8 + rp.field_e.length) ^ -1) <= -1) {
                                        stackIn_40_0 = (String[]) ((Object) stackIn_39_0);
                                        stackIn_40_1 = stackIn_39_1;
                                        stackIn_40_2 = rp.field_e[var8 - (-rp.field_e.length + var5)];
                                        break L21;
                                      } else {
                                        stackIn_40_0 = (String[]) ((Object) stackIn_39_0);
                                        stackIn_40_1 = stackIn_39_1;
                                        stackIn_40_2 = "";
                                        break L21;
                                      }
                                    }
                                    stackIn_40_0[stackIn_40_1] = stackIn_40_2;
                                    var8++;
                                    continue L18;
                                  }
                                }
                              } else {
                                gd.field_s[var8] = -1;
                                var8++;
                                continue L17;
                              }
                            }
                          } else {
                            throw new IllegalStateException();
                          }
                        }
                      } else {
                        throw new IllegalStateException();
                      }
                    }
                  }
                } else {
                  var3_int = dc.a(bc.field_c, qr.field_o, (byte) 33, rn.field_w, mf.field_c);
                  var4 = var3_int + 2;
                  gd.field_s = new int[var4];
                  mn.field_q = new String[var4];
                  var5 = 0;
                  L22: while (true) {
                    if (var5 >= var4) {
                      gi.field_n = new int[1];
                      var5 = 0;
                      L23: while (true) {
                        if (var5 >= var3_int) {
                          mn.field_q[var4 - 2] = "";
                          mn.field_q[-1 + var4] = lr.field_N;
                          gd.field_s[var4 + -1] = 0;
                          gi.field_n[0] = 5;
                          break L1;
                        } else {
                          mn.field_q[var5] = rn.field_w[var5];
                          var5++;
                          continue L23;
                        }
                      }
                    } else {
                      gd.field_s[var5] = -1;
                      var5++;
                      continue L22;
                    }
                  }
                }
              }
            }
            L24: {
              ve.field_d.field_b = gi.field_n.length;
              var3_int = 0;
              if (param2 == -30962) {
                break L24;
              } else {
                field_r = (int[]) null;
                break L24;
              }
            }
            var4 = 0;
            L25: while (true) {
              if (var4 >= mn.field_q.length) {
                L26: {
                  if (da.field_j == 2) {
                    var10 = jo.field_g;
                    var4_ref_String__ = var10;
                    var5 = 0;
                    L27: while (true) {
                      if (var10.length <= var5) {
                        var4_ref_String__ = field_z;
                        var5 = 0;
                        L28: while (true) {
                          if (var5 >= var4_ref_String__.length) {
                            break L26;
                          } else {
                            var12 = var4_ref_String__[var5];
                            var7 = uc.a(var12, false, false);
                            if ((var7 ^ -1) < (var3_int ^ -1)) {
                              var3_int = var7;
                              var5++;
                              continue L28;
                            } else {
                              var5++;
                              continue L28;
                            }
                          }
                        }
                      } else {
                        var11 = var10[var5];
                        var7 = uc.a(var11, false, false);
                        if ((var7 ^ -1) < (var3_int ^ -1)) {
                          var3_int = var7;
                          var5++;
                          continue L27;
                        } else {
                          var5++;
                          continue L27;
                        }
                      }
                    }
                  } else {
                    break L26;
                  }
                }
                jp.field_o = ve.field_d.field_b * (qc.field_z + al.field_z << -2060966239);
                sg.field_d = -(var3_int >> 305886497) + vm.field_c;
                c.field_e = -(var3_int >> 1512358689) + var3_int + vm.field_c;
                var4 = 0;
                L29: while (true) {
                  if (var4 >= mn.field_q.length) {
                    be.field_t = -(jp.field_o >> -1833988159) + s.field_u;
                    vi.field_C = new int[mn.field_q.length][];
                    var4 = 0;
                    var5 = be.field_t;
                    L30: while (true) {
                      if (var4 >= mn.field_q.length) {
                        L31: {
                          if (da.field_j != 2) {
                            ve.field_d.a(param0, fk.b(gb.field_d, 1282642017, ed.field_n), 0, (byte) 80);
                            break L31;
                          } else {
                            ve.field_d.a(param0, -1, -1, (byte) 80);
                            break L31;
                          }
                        }
                        break L0;
                      } else {
                        L32: {
                          var6 = gd.field_s[var4];
                          if (0 > var6) {
                            var5 = var5 + gd.field_k;
                            break L32;
                          } else {
                            var7 = uc.a(mn.field_q[var4], true, false);
                            var8 = -(var7 >> 649420353) + vm.field_c;
                            var5 = var5 + al.field_z;
                            vi.field_C[var4] = new int[4];
                            vi.field_C[var4][0] = -gl.field_l + var8;
                            vi.field_C[var4][1] = var5;
                            vi.field_C[var4][2] = (gl.field_l << -1919439999) + var7;
                            vi.field_C[var4][3] = (qc.field_z << 85960865) + kd.field_z;
                            var5 = var5 + (kd.field_z + (qc.field_z << -639562623) - -al.field_z);
                            break L32;
                          }
                        }
                        var4++;
                        continue L30;
                      }
                    }
                  } else {
                    L33: {
                      stackIn_111_0 = jp.field_o;

                      if (0 <= gd.field_s[var4]) {
                        stackIn_112_0 = stackIn_111_0;
                        stackIn_112_1 = kd.field_z;
                        break L33;
                      } else {
                        stackIn_112_0 = stackIn_111_0;
                        stackIn_112_1 = gd.field_k;
                        break L33;
                      }
                    }
                    jp.field_o = stackIn_112_0 + stackIn_112_1;
                    var4++;
                    continue L29;
                  }
                }
              } else {
                L34: {
                  stackIn_90_0 = mn.field_q[var4];

                  if (-1 < (gd.field_s[var4] ^ -1)) {
                    stackIn_91_0 = (String) ((Object) stackIn_90_0);
                    stackIn_91_1 = 0;
                    break L34;
                  } else {
                    stackIn_91_0 = (String) ((Object) stackIn_90_0);
                    stackIn_91_1 = 1;
                    break L34;
                  }
                }
                L35: {
                  var5 = uc.a(stackIn_91_0, stackIn_91_1 != 0, false);
                  if (var3_int < var5) {
                    var3_int = var5;
                    break L35;
                  } else {
                    break L35;
                  }
                }
                var4++;
                continue L25;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var3), "bl.I(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void b(int param0) {
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        String stackIn_13_0 = null;
        int stackIn_20_0 = 0;
        er stackIn_48_0 = null;
        er stackIn_51_0 = null;
        int var2;
        int var3;
        int var4;
        String var4_ref_String;
        float var5;
        int var5_int;
        int var6;
        int var7;
        er[] var7_ref_er__;
        int var8;
        er var9;
        int var9_int;
        er var10;
        int var10_int;
        int var11;
        int var12;
        int var13;
        L0: {
          var13 = Vertigo2.field_L ? 1 : 0;
          bi.a(bm.field_E);
          bi.g(this.field_g, this.field_c - -4, -this.field_E + this.field_g - -this.field_f, -4 + this.field_l.field_k + this.field_j + this.field_c);
          if (this.field_n) {
            break L0;
          } else {
            this.field_D = 0;
            this.field_L = 0;
            break L0;
          }
        }
        var2 = this.field_l.field_k + this.field_c;
        var3 = 0;
        L1: while (true) {
          L2: {
            if (this.field_k.length > var3) {
              break L2;
            } else {
              if (this.field_j + this.field_c < var2) {
                L3: {
                  bi.b(bm.field_E);
                  var3 = param0 + (-this.field_E + (this.field_f + this.field_g));
                  var4 = this.field_l.field_k + this.field_c;
                  if (!this.field_n) {
                    break L3;
                  } else {
                    L4: {
                      bi.b(var3, var4, this.field_E, -this.field_l.field_k + this.field_j, ir.field_f & this.field_J, this.field_J >>> uq.field_d);
                      bi.b(var3, var4, this.field_E, this.field_E, this.field_J & ir.field_f, this.field_J >>> uq.field_d);
                      bi.b(var3, -this.field_E + (this.field_j + this.field_c), this.field_E, this.field_E, this.field_J & ir.field_f, this.field_J >>> uq.field_d);
                      var5 = (float)(this.field_L + -3) / (float)(this.field_k.length - 8);
                      var6 = 0;
                      if (this.field_A != null) {
                        var6 = this.field_A.field_t;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      var7 = -var6 + (-16 + -(2 * this.field_M.field_t)) + (this.field_j - this.field_l.field_k);
                      var8 = (int)(var5 * (float)var7) - (-this.field_M.field_t + (-8 - var6 / 2));
                      if (null == this.field_M) {
                        break L5;
                      } else {
                        if (this.field_G != null) {
                          L6: {
                            if (!this.field_v) {
                              stackIn_48_0 = this.field_M;
                              break L6;
                            } else {
                              stackIn_48_0 = this.field_G;
                              break L6;
                            }
                          }
                          L7: {
                            var9 = stackIn_48_0;
                            if (!this.field_H) {
                              stackIn_51_0 = this.field_M;
                              break L7;
                            } else {
                              stackIn_51_0 = this.field_G;
                              break L7;
                            }
                          }
                          var10 = stackIn_51_0;
                          var9.e(var3, var4);
                          var10.g(var3, -var10.field_B + this.field_c + this.field_j);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                    bi.f(var3, 2 + (var4 - -this.field_E), this.field_E, this.field_j - (this.field_l.field_k - (-(2 * this.field_M.field_t) + -4)), 3, 4013373);
                    bi.f(var3 - -2, this.field_E + var4 + 4, -4 + this.field_E, -8 + (-this.field_l.field_k + this.field_j - 2 * this.field_M.field_t), 3, 5921370);
                    this.field_A.e(-(this.field_A.field_x / 2) + this.field_E / 2 + var3, -(this.field_A.field_t / 2) + var8 + var4);
                    break L3;
                  }
                }
                L8: {
                  this.field_l.b(param0 ^ 109);
                  if (!this.field_n) {
                    break L8;
                  } else {
                    bi.b(this.field_g, this.field_c - -2, this.field_f, this.field_m);
                    bi.b(this.field_g, 3 + this.field_c, this.field_f, this.field_m);
                    bi.b(this.field_g, -4 + (this.field_j + (this.field_c + this.field_l.field_k)), this.field_f, this.field_m);
                    bi.b(this.field_g, -3 + this.field_l.field_k + (this.field_j + this.field_c), this.field_f, this.field_m);
                    break L8;
                  }
                }
                return;
              } else {
                break L2;
              }
            }
          }
          stackIn_7_0 = this.field_k.length ^ -1;
          stackIn_7_1 = var3 ^ -1;
          L9: {
            if (stackIn_7_0 >= stackIn_7_1) {
              break L9;
            } else {
              L10: {
                L11: {
                  if (this.field_y[var3]) {
                    break L11;
                  } else {
                    if (null != this.field_K) {
                      stackIn_13_0 = this.field_K;
                      break L10;
                    } else {
                      break L11;
                    }
                  }
                }
                stackIn_13_0 = this.field_k[var3];
                break L10;
              }
              L12: {
                var4_ref_String = stackIn_13_0;
                if (!this.field_y[var3]) {
                  if (var3 == this.field_t) {
                    stackIn_20_0 = this.field_I;
                    break L12;
                  } else {
                    stackIn_20_0 = this.field_P;
                    break L12;
                  }
                } else {
                  if (var3 != this.field_t) {
                    stackIn_20_0 = this.field_F;
                    break L12;
                  } else {
                    stackIn_20_0 = this.field_x;
                    break L12;
                  }
                }
              }
              L13: {
                var5_int = stackIn_20_0;
                var6 = this.field_l.a(1, var4_ref_String);
                var7_ref_er__ = mn.field_o;
                if (var3 != this.field_t) {
                  if (!this.field_y[var3]) {
                    var7_ref_er__ = sq.field_a;
                    break L13;
                  } else {
                    break L13;
                  }
                } else {
                  var7_ref_er__ = ln.field_b;
                  break L13;
                }
              }
              var8 = var7_ref_er__[0].field_y + var7_ref_er__[2].field_y;
              var9_int = (this.field_f - var8) / var7_ref_er__[1].field_y + -1;
              var8 = var8 + var9_int * var7_ref_er__[1].field_y;
              var10_int = -this.field_D + (this.field_l.field_k + var2 + -(2 * this.field_l.field_c)) + -(var7_ref_er__[0].field_t / 2);
              var11 = -10 + this.field_g - -((-var8 + this.field_f) / 2);
              var7_ref_er__[0].e(var11, var10_int);
              var11 = var11 + var7_ref_er__[0].field_y;
              var12 = 0;
              L14: while (true) {
                if (var9_int <= var12) {
                  var7_ref_er__[2].e(var11, var10_int);
                  this.field_l.a(var5_int, (byte) 78, -1, -10 + (this.field_g - -(this.field_f / 2) - var6 / 2), var4_ref_String, (-this.field_l.field_c + (-this.field_l.field_g + var7_ref_er__[1].field_t)) / 2 + var10_int + var7_ref_er__[0].field_t / 2);
                  if (ig.field_c == null) {
                    break L9;
                  } else {
                    if (!this.field_u) {
                      break L9;
                    } else {
                      if (te.field_B[var3] < ig.field_c[var3]) {
                        if (sf.field_e[var3] < ig.field_c[var3]) {
                          if (ig.field_c[var3] <= bp.field_E[var3]) {
                            hh.field_a.c(42, var10_int - 2);
                            break L9;
                          } else {
                            break L9;
                          }
                        } else {
                          kq.field_Kb.c(42, var10_int - 2);
                          break L9;
                        }
                      } else {
                        il.field_c.c(42, var10_int + -2);
                        break L9;
                      }
                    }
                  }
                } else {
                  var7_ref_er__[1].e(var11, var10_int);
                  var11 = var11 + var7_ref_er__[1].field_y;
                  var12++;
                  continue L14;
                }
              }
            }
          }
          var3++;
          var2 = var2 + (this.field_l.field_k - -this.field_B);
          continue L1;
        }
    }

    final boolean c(int param0) {
        int var3 = -28 / ((-11 - param0) / 60);
        int var2 = this.field_w ? 1 : 0;
        this.field_w = false;
        return var2 != 0;
    }

    final void b(boolean param0) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        double var9;
        int var11;
        L0: {
          var11 = Vertigo2.field_L ? 1 : 0;
          stackIn_2_0 = this;

          if (!param0) {
            stackIn_3_0 = this;
            stackIn_3_1 = 0;
            break L0;
          } else {
            stackIn_3_0 = this;
            stackIn_3_1 = 1;
            break L0;
          }
        }
        ((bl) (this)).field_H = stackIn_3_1 != 0;
        this.field_v = false;
        var2 = -1 + this.field_j / (this.field_B + this.field_l.field_k);
        var3 = (this.field_l.field_k - -this.field_B) * (-var2 + this.field_k.length);
        if (this.field_d) {
          L1: {
            if (this.field_n) {
              break L1;
            } else {
              this.field_D = 0;
              break L1;
            }
          }
          L2: {
            this.field_s = this.field_s - 1;
            stackIn_9_0 = this;

            if (1 != q.field_v) {
              stackIn_10_0 = this;
              stackIn_10_1 = 0;
              break L2;
            } else {
              stackIn_10_0 = this;
              stackIn_10_1 = 1;
              break L2;
            }
          }
          L3: {
            ((bl) (this)).field_i = stackIn_10_1 != 0;
            this.field_p = this.field_p - 1;
            this.field_e = true;
            this.field_O = this.field_O - 1;
            if (this.field_e) {
              this.field_L = this.field_L + uo.field_h;
              if (0 > this.field_t) {
                break L3;
              } else {
                if (this.field_t >= this.field_k.length) {
                  break L3;
                } else {
                  L4: {
                    if (cr.field_eb[98]) {
                      if (this.field_O < 0) {
                        this.field_t = this.field_t - 1;
                        this.field_L = this.field_t;
                        this.field_O = wj.field_b;
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      if (!cr.field_eb[99]) {
                        this.field_O = -1;
                        break L4;
                      } else {
                        if (this.field_O >= 0) {
                          break L4;
                        } else {
                          this.field_t = this.field_t + 1;
                          L5: while (true) {
                            L6: {
                              if (this.field_t >= this.field_y.length) {
                                break L6;
                              } else {
                                if (this.field_y[this.field_t]) {
                                  this.field_L = this.field_t;
                                  this.field_O = wj.field_b;
                                  break L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            this.field_t = this.field_t - 1;
                            continue L5;
                          }
                        }
                      }
                    }
                  }
                  L7: {
                    if ((this.field_t ^ -1) <= -1) {
                      break L7;
                    } else {
                      this.field_t = 0;
                      break L7;
                    }
                  }
                  L8: {
                    if (this.field_t < this.field_k.length) {
                      break L8;
                    } else {
                      this.field_t = this.field_k.length + -1;
                      break L8;
                    }
                  }
                  L9: {
                    if ((this.field_L ^ -1) <= -4) {
                      break L9;
                    } else {
                      this.field_L = 3;
                      break L9;
                    }
                  }
                  if (this.field_L < -4 + this.field_k.length) {
                    break L3;
                  } else {
                    this.field_L = -5 + this.field_k.length;
                    break L3;
                  }
                }
              }
            } else {
              break L3;
            }
          }
          L10: {
            this.field_e = false;
            if (!this.field_i) {
              if ((q.field_v ^ -1) == -2) {
                this.field_e = false;
                break L10;
              } else {
                break L10;
              }
            } else {
              this.field_e = true;
              if (this.field_c + this.field_l.field_k < gb.field_d) {
                L11: {
                  L12: {
                    if (this.field_g + (this.field_f + -this.field_E) > ed.field_n) {
                      break L12;
                    } else {
                      if (!this.field_n) {
                        break L12;
                      } else {
                        if (ed.field_n >= this.field_g + (this.field_f - -this.field_E)) {
                          break L12;
                        } else {
                          if (gb.field_d > this.field_l.field_k + (this.field_c - -this.field_E)) {
                            if (gb.field_d < -this.field_E + (this.field_j + this.field_c)) {
                              L13: {
                                this.field_s = -1;
                                var4 = gb.field_d + -this.field_c;
                                var5 = var4 - this.field_l.field_k;
                                var6 = var5 + (-(this.field_A.field_t / 2) + -this.field_M.field_t);
                                if (-1 < (var6 ^ -1)) {
                                  var6 = 0;
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              L14: {
                                var7 = -this.field_M.field_t + (this.field_j + this.field_A.field_t / 2);
                                if (var6 > var7) {
                                  var6 = var7;
                                  break L14;
                                } else {
                                  break L14;
                                }
                              }
                              var8 = -(2 * this.field_M.field_t) + -this.field_l.field_k + this.field_j - this.field_A.field_t;
                              var9 = (double)var6 / (double)var8;
                              this.field_L = (int)(var9 * (double)(-1 + this.field_k.length));
                              break L11;
                            } else {
                              this.field_H = true;
                              if (this.field_s < 0) {
                                this.field_L = this.field_L + 1;
                                this.field_s = wj.field_b;
                                break L11;
                              } else {
                                if (var3 >= this.field_D) {
                                  break L10;
                                } else {
                                  if (!this.field_n) {
                                    break L10;
                                  } else {
                                    this.field_D = var3;
                                    break L10;
                                  }
                                }
                              }
                            }
                          } else {
                            L15: {
                              if (-1 < (this.field_s ^ -1)) {
                                this.field_s = wj.field_b;
                                this.field_L = this.field_L - 1;
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                            this.field_v = true;
                            break L11;
                          }
                        }
                      }
                    }
                  }
                  if (kf.field_c != 0) {
                    if (ed.field_n < this.field_f + (this.field_g + this.field_E)) {
                      L16: {
                        var4 = this.field_D + -this.field_l.field_k + -this.field_c + gb.field_d;
                        var5 = this.field_t;
                        this.field_t = var4 / (this.field_l.field_k - -this.field_B);
                        if (this.field_t != var5) {
                          break L16;
                        } else {
                          if (-1 > (this.field_p ^ -1)) {
                            this.field_w = true;
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                      }
                      this.field_p = wj.field_b;
                      break L11;
                    } else {
                      break L11;
                    }
                  } else {
                    if (var3 >= this.field_D) {
                      break L10;
                    } else {
                      if (!this.field_n) {
                        break L10;
                      } else {
                        this.field_D = var3;
                        break L10;
                      }
                    }
                  }
                }
                if (var3 >= this.field_D) {
                  break L10;
                } else {
                  if (!this.field_n) {
                    break L10;
                  } else {
                    this.field_D = var3;
                    break L10;
                  }
                }
              } else {
                return;
              }
            }
          }
          L17: {
            if (this.field_t < 0) {
              this.field_t = 0;
              break L17;
            } else {
              break L17;
            }
          }
          L18: {
            if (this.field_k.length <= this.field_t) {
              this.field_t = -1 + this.field_k.length;
              break L18;
            } else {
              break L18;
            }
          }
          L19: {
            if (3 <= this.field_L) {
              break L19;
            } else {
              this.field_L = 3;
              break L19;
            }
          }
          L20: {
            if (-4 + this.field_k.length <= this.field_L) {
              this.field_L = -5 + this.field_k.length;
              break L20;
            } else {
              break L20;
            }
          }
          L21: while (true) {
            L22: {
              if (this.field_t >= this.field_y.length) {
                break L22;
              } else {
                if (this.field_y[this.field_t]) {
                  L23: {
                    if (this.field_n) {
                      L24: {
                        if (var2 / 2 <= this.field_L) {
                          if (var2 / 2 <= this.field_k.length - this.field_L) {
                            var4 = (-(var2 / 2) + this.field_L) * var3 / (this.field_k.length + -var2);
                            break L24;
                          } else {
                            var4 = var3;
                            break L24;
                          }
                        } else {
                          var4 = 0;
                          break L24;
                        }
                      }
                      if (this.field_D != var4) {
                        var5 = this.field_D + -var4;
                        if (var5 / 4 != 0) {
                          this.field_D = this.field_D - var5 / 4;
                          break L23;
                        } else {
                          if (0 == var5 / 2) {
                            this.field_D = this.field_D - var5;
                            break L23;
                          } else {
                            this.field_D = this.field_D - var5 / 2;
                            break L23;
                          }
                        }
                      } else {
                        break L23;
                      }
                    } else {
                      break L23;
                    }
                  }
                  return;
                } else {
                  break L22;
                }
              }
            }
            this.field_t = this.field_t - 1;
            continue L21;
          }
        } else {
          this.field_p = 0;
          this.field_s = 0;
          this.field_O = 0;
          this.field_i = false;
          return;
        }
    }

    bl(int param0, int param1, int param2, int param3, wn param4, er param5, er param6, er param7, er param8) {
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        this.field_I = -8388608;
        this.field_K = null;
        this.field_P = -8355712;
        this.field_w = false;
        this.field_t = -1;
        this.field_F = -16777215;
        this.field_m = 0;
        this.field_y = new boolean[]{};
        this.field_L = -1;
        this.field_O = 0;
        this.field_p = 0;
        this.field_x = -65535;
        this.field_J = -257908576;
        this.field_v = false;
        this.field_B = 16;
        this.field_H = false;
        this.field_n = true;
        this.field_k = new String[]{};
        this.field_s = 0;
        try {
          L0: {
            L1: {
              this.field_f = param2;
              this.field_l = param4;
              this.field_c = param1;
              this.field_j = param3;
              this.field_g = param0;
              stackIn_3_0 = this;

              if (param5 == null) {
                stackIn_4_0 = this;
                stackIn_4_1 = this.field_l.field_k;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = param5.field_x;
                break L1;
              }
            }
            ((bl) (this)).field_E = stackIn_4_1;
            this.field_G = param6;
            this.field_A = param7;
            this.field_M = param5;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var10 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var10);

            stackIn_8_1 = new StringBuilder().append("bl.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param5 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param6 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param7 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param8 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_9_0), stackIn_21_2 + ')');
        }
    }

    static {
        field_q = "Show chat";
        field_o = "Level <%0>";
    }
}
