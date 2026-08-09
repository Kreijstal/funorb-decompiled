/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj extends gf {
    boolean field_p;
    static int field_h;
    ak field_w;
    static jp field_l;
    int field_v;
    int field_r;
    private int field_i;
    int field_x;
    static mh field_u;
    boolean field_n;
    static int field_j;
    int field_k;
    boolean field_s;
    private int field_m;
    private boolean field_y;
    boolean field_q;
    int field_o;
    private int field_t;

    private final void a(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_30_0 = 0;
        int var2;
        j var3;
        L0: {
          if (!pf.field_p) {
            if (!la.field_c) {
              stackIn_6_0 = 1;
              break L0;
            } else {
              stackIn_6_0 = 0;
              break L0;
            }
          } else {
            stackIn_6_0 = 0;
            break L0;
          }
        }
        L1: {
          var2 = stackIn_6_0;
          if (param0 == -1) {
            break L1;
          } else {
            var3 = (j) null;
            this.a((byte) -2, (j) null);
            break L1;
          }
        }
        L2: {
          stackIn_10_0 = var2;

          if ((this.field_o & (this.field_w.field_i | this.field_w.field_g | this.field_w.field_a)) != this.field_o) {
            stackIn_11_0 = stackIn_10_0;
            stackIn_11_1 = 0;
            break L2;
          } else {
            stackIn_11_0 = stackIn_10_0;
            stackIn_11_1 = 1;
            break L2;
          }
        }
        L3: {
          L4: {
            var2 = stackIn_11_0 & stackIn_11_1;
            stackIn_16_0 = var2;

            if (2 >= this.field_w.field_k) {
              break L4;
            } else {
              L5: {

                if ((this.field_k ^ -1) > -1) {
                  break L5;
                } else {

                  if (this.field_w.field_l[this.field_k].field_U < 50) {
                    break L4;
                  } else {

                    break L5;
                  }
                }
              }
              stackIn_17_0 = stackIn_16_0;
              stackIn_17_1 = 1;
              break L3;
            }
          }
          stackIn_17_0 = stackIn_16_0;
          stackIn_17_1 = 0;
          break L3;
        }
        L6: {
          var2 = stackIn_17_0 & stackIn_17_1;
          if (var2 == 0) {
            break L6;
          } else {
            L7: {
              if (pe.field_l[fq.field_b]) {
                break L7;
              } else {
                if (!pe.field_l[td.field_u]) {
                  if (!pe.field_l[ac.field_f]) {
                    break L6;
                  } else {
                    fieldTemp$0 = this.field_m - 1;
                    this.field_m = this.field_m - 1;
                    this.field_m = (this.field_w.field_k + fieldTemp$0) % this.field_w.field_k;
                    break L6;
                  }
                } else {
                  break L7;
                }
              }
            }
            fieldTemp$1 = this.field_m + 1;
            this.field_m = this.field_m + 1;
            this.field_m = fieldTemp$1 % this.field_w.field_k;
            break L6;
          }
        }
        L8: {
          L9: {
            if (pe.field_l[fq.field_b]) {
              break L9;
            } else {
              if (pe.field_l[ac.field_f]) {
                break L9;
              } else {
                if (!pe.field_l[td.field_u]) {
                  stackIn_30_0 = 0;
                  break L8;
                } else {
                  break L9;
                }
              }
            }
          }
          stackIn_30_0 = 1;
          break L8;
        }
        la.field_c = stackIn_30_0 != 0;
    }

    private final boolean a(int param0, int param1) {
        if (!(!eo.a(mk.field_b, param0, (byte) -75))) {
            return true;
        }
        int[] var5 = mk.field_b;
        int[] var3 = var5;
        int var4 = param0;
        var5[var4 >> 775242053] = ud.d(var5[var4 >> 775242053], 1 << ik.a(31, var4));
        int[] var6 = pl.field_b;
        var3 = var6;
        var4 = param0;
        var6[var4 >> 1405197989] = ud.d(var6[var4 >> 1405197989], param1 << ik.a(var4, 31));
        kp.field_c.a(new kq(param0), (byte) 3);
        return false;
    }

    final void b(byte param0) {
        lb.a();
        if (!(this.field_q)) {
            return;
        }
        if (param0 > -14) {
            this.a((byte) -47, -81);
        }
        this.g(41);
    }

    final void a(pi param0, boolean param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              var4_int = param0.l(255);
              this.field_w.field_l[var4_int].field_V = param0.j(48);
              var5 = -101 % ((param2 - 26) / 60);
              if (param1) {
                this.field_w.field_l[var4_int].field_zb = param0.l(255);
                this.field_w.field_a = this.field_w.field_a | 1 << var4_int;
                break L1;
              } else {
                this.field_w.field_g = this.field_w.field_g | 1 << var4_int;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("qj.A(");

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
          throw qb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(byte param0, pi param1) {
        j dupTemp$0 = null;
        try {
            dupTemp$0 = this.field_w.field_l[this.field_k];
            dupTemp$0.field_E = dupTemp$0.field_E + 5;
            this.field_w.field_l[this.field_k].field_p = param1.i(65280);
            if (param0 != 33) {
                j var4 = (j) null;
                this.a((byte) 15, (j) null);
            }
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "qj.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        if (!(!this.a(param2, 1))) {
            return;
        }
        if (!(this.field_s)) {
            var4 = this.field_w.field_l[0].field_ob;
            ep.field_i = ep.field_i - (var4 - -this.field_t);
            var5 = this.field_w.field_l[0].field_qb;
            fp.field_z = fp.field_z + var5;
            lp.field_wb.a(new e(param2, param0, fp.field_z, ep.field_i, od.field_c, og.field_Wb), (byte) 3);
            fp.field_z = fp.field_z + (var4 + this.field_t);
            ep.field_i = ep.field_i - var5;
        }
        if (param1 != 67) {
            this.field_i = 125;
        }
    }

    final void a(boolean param0, boolean param1, int param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_111_0 = 0;
        int stackIn_115_0 = 0;
        String stackIn_205_0 = null;
        Object stackIn_221_0 = null;
        int stackIn_221_1 = 0;
        int stackIn_221_2 = 0;
        Object stackIn_222_0;
        int stackIn_222_1;
        int stackIn_222_2;
        int stackIn_222_3;
        int var4;
        int var5;
        int var6;
        vl var7;
        int var8;
        long var9_long;
        int var9_int;
        vn var9;
        j var11;
        j var12;
        vn var13;
        int var14;
        j var15;
        j var16;
        j var17;
        j var18;
        vl var19;
        j var20;
        j var21;
        var14 = BrickABrac.field_J ? 1 : 0;
        if (this.field_q) {
          L0: {
            if (null != oa.field_Sb) {
              L1: {
                oa.field_Sb.e(1);
                if (!oa.field_Sb.field_q) {
                  oa.field_Sb.d(59);
                  break L1;
                } else {
                  break L1;
                }
              }
              if ((km.field_i ^ -1) >= -1) {
                break L0;
              } else {
                fieldTemp$0 = km.field_i - 1;
                km.field_i = km.field_i - 1;
                if (fieldTemp$0 != 0) {
                  break L0;
                } else {
                  fq.field_c = null;
                  ih.field_k = null;
                  break L0;
                }
              }
            } else {
              if ((km.field_i ^ -1) >= -1) {
                break L0;
              } else {
                fieldTemp$1 = km.field_i - 1;
                km.field_i = km.field_i - 1;
                if (fieldTemp$1 != 0) {
                  break L0;
                } else {
                  fq.field_c = null;
                  ih.field_k = null;
                  break L0;
                }
              }
            }
          }
          L2: {
            if (0 == (this.field_w.field_l[this.field_m].field_M ^ -1)) {
              stackIn_15_0 = 0;
              break L2;
            } else {
              stackIn_15_0 = 1;
              break L2;
            }
          }
          L3: {
            L4: {
              var4 = stackIn_15_0;
              stackIn_19_0 = var4;

              if (this.field_p) {
                break L4;
              } else {

                if (-3 != (this.field_w.field_k ^ -1)) {
                  break L4;
                } else {

                  if (-1 == this.field_w.field_l[-this.field_m + 1].field_M) {
                    break L4;
                  } else {
                    stackIn_20_0 = stackIn_19_0;
                    stackIn_20_1 = 1;
                    break L3;
                  }
                }
              }
            }
            stackIn_20_0 = stackIn_19_0;
            stackIn_20_1 = 0;
            break L3;
          }
          L5: {
            L6: {
              var4 = stackIn_20_0 | stackIn_20_1;
              if (1 != this.field_w.field_k) {
                break L6;
              } else {
                if (this.field_w.field_l[0].field_Z == 5) {
                  ji.a(25459, true, c.field_j, 1, 1, true);
                  break L5;
                } else {
                  break L6;
                }
              }
            }
            if (!this.field_w.field_c) {
              if (var4 != 0) {
                ji.a(25459, true, uk.field_t, 1, 1, true);
                break L5;
              } else {
                L7: {
                  if (oa.field_Sb == null) {
                    break L7;
                  } else {
                    if (!oa.field_Sb.field_q) {
                      break L7;
                    } else {
                      wj.a(1, true, oa.field_Sb.c(-109), false, 1, oa.field_Sb.field_n, true);
                      break L5;
                    }
                  }
                }
                ji.a(25459, true, cd.field_g, 1, 1, true);
                break L5;
              }
            } else {
              ji.a(25459, true, oj.field_q, 1, 1, true);
              break L5;
            }
          }
          L8: {
            if (!this.field_w.field_c) {
              break L8;
            } else {
              if (-2 <= (this.field_w.field_k ^ -1)) {
                break L8;
              } else {
                fieldTemp$2 = be.field_j + 1;
                be.field_j = be.field_j + 1;
                if (fieldTemp$2 != 300) {
                  break L8;
                } else {
                  L9: {
                    if (!m.field_a) {
                      break L9;
                    } else {
                      fieldTemp$3 = ml.field_f + 1;
                      ml.field_f = ml.field_f + 1;
                      System.out.println("Concluded " + fieldTemp$3 + " games (" + cf.field_a + " errors)");
                      if ((1 << this.field_k & this.field_w.field_j) != 0) {
                        break L9;
                      } else {
                        this.f(87);
                        break L9;
                      }
                    }
                  }
                  po.a((byte) -97);
                  if (!this.field_p) {
                    ng.a(false, 62, 20);
                    cc.field_G = true;
                    break L8;
                  } else {
                    if (op.field_a) {
                      L10: {
                        if (null == hd.field_d) {
                          break L10;
                        } else {
                          if (1 == (hd.field_d.field_a ^ -1)) {
                            break L8;
                          } else {
                            break L10;
                          }
                        }
                      }
                      ng.a(false, 101, 19);
                      break L8;
                    } else {
                      da.f((byte) 122);
                      break L8;
                    }
                  }
                }
              }
            }
          }
          L11: {
            if (param2 < -52) {
              break L11;
            } else {
              this.field_w = (ak) null;
              break L11;
            }
          }
          L12: {
            var5 = oo.field_w.a(-37880252, 10);
            var6 = oo.field_w.a(-37880252, 3);
            if (var5 == 0) {
              od.field_c = od.field_c + 1;
              fp.field_z = fp.field_z + og.field_Wb;
              break L12;
            } else {
              break L12;
            }
          }
          L13: {
            if (-2 == (var5 ^ -1)) {
              od.field_c = od.field_c - 2;
              fp.field_z = fp.field_z - 2 * og.field_Wb;
              break L13;
            } else {
              break L13;
            }
          }
          L14: {
            if ((var5 ^ -1) != -3) {
              break L14;
            } else {
              fp.field_z = fp.field_z + 2 * od.field_c;
              og.field_Wb = og.field_Wb + 2;
              break L14;
            }
          }
          L15: {
            if (var5 != 3) {
              break L15;
            } else {
              og.field_Wb = og.field_Wb - 1;
              fp.field_z = fp.field_z - od.field_c;
              break L15;
            }
          }
          L16: {
            if (-5 != (var5 ^ -1)) {
              break L16;
            } else {
              od.field_c = od.field_c + 1;
              ep.field_i = ep.field_i + og.field_Wb;
              break L16;
            }
          }
          L17: {
            if ((var5 ^ -1) != -6) {
              break L17;
            } else {
              ep.field_i = ep.field_i - og.field_Wb * 2;
              od.field_c = od.field_c - 2;
              break L17;
            }
          }
          L18: {
            if (6 != var5) {
              break L18;
            } else {
              ep.field_i = ep.field_i + og.field_Wb;
              od.field_c = od.field_c + 1;
              break L18;
            }
          }
          L19: {
            if (var5 == 7) {
              ep.field_i = ep.field_i - od.field_c * 2;
              og.field_Wb = og.field_Wb - 2;
              break L19;
            } else {
              break L19;
            }
          }
          L20: {
            if ((var5 ^ -1) != -9) {
              break L20;
            } else {
              fp.field_z = fp.field_z + var6;
              fp.field_z = fp.field_z - var6;
              break L20;
            }
          }
          L21: {
            if (-10 != (var5 ^ -1)) {
              break L21;
            } else {
              ep.field_i = ep.field_i + var6;
              fp.field_z = fp.field_z - var6;
              break L21;
            }
          }
          L22: {
            var5 = oo.field_w.a(-37880252, 5);
            if (-1 != (var5 ^ -1)) {
              break L22;
            } else {
              hg.field_e = hg.field_e ^ tm.field_g + qm.field_a << -2077966224;
              break L22;
            }
          }
          L23: {
            if (-2 != (var5 ^ -1)) {
              break L23;
            } else {
              ek.field_kb = ek.field_kb - tm.field_g;
              qm.field_a = qm.field_a - 1;
              break L23;
            }
          }
          L24: {
            if (var5 != 2) {
              break L24;
            } else {
              ek.field_kb = ek.field_kb + tm.field_g;
              qm.field_a = qm.field_a + 1;
              break L24;
            }
          }
          L25: {
            if (-4 == (var5 ^ -1)) {
              ek.field_kb = ek.field_kb - qm.field_a;
              tm.field_g = tm.field_g - 1;
              break L25;
            } else {
              break L25;
            }
          }
          L26: {
            if (-5 != (var5 ^ -1)) {
              break L26;
            } else {
              ek.field_kb = ek.field_kb + qm.field_a;
              tm.field_g = tm.field_g + 1;
              break L26;
            }
          }
          L27: {
            if (this.field_p) {
              var5 = 0;
              L28: while (true) {
                if (this.field_w.field_k <= var5) {
                  break L27;
                } else {
                  if ((this.field_o & 1 << var5) != 0) {
                    var15 = this.field_w.field_l[var5];
                    var17 = var15;
                    var17 = var15;
                    var16 = var15;
                    var16.field_vb[var15.field_F % 5] = 0;
                    var5++;
                    continue L28;
                  } else {
                    var5++;
                    continue L28;
                  }
                }
              }
            } else {
              break L27;
            }
          }
          L29: {
            if (!param1) {
              break L29;
            } else {
              this.a(-1);
              break L29;
            }
          }
          var5 = 0;
          L30: while (true) {
            if (var5 >= this.field_w.field_k) {
              L31: {
                var5 = 0;
                var19 = new vl();
                var7 = new vl();
                if (!r.field_A) {
                  L32: {
                    if (!this.a(var7, true, var19)) {
                      stackIn_115_0 = 0;
                      break L32;
                    } else {
                      stackIn_115_0 = 1;
                      break L32;
                    }
                  }
                  var5 = stackIn_115_0;
                  break L31;
                } else {
                  if (km.field_i != 0) {
                    break L31;
                  } else {
                    L33: {
                      od.a((byte) 32);
                      var18 = this.field_w.field_l[0];
                      if (2 != var18.field_Z) {
                        break L33;
                      } else {
                        jc.a(var18.field_db, 0, (byte) -85);
                        break L33;
                      }
                    }
                    L34: {
                      if (-1 == (var18.field_Z ^ -1)) {
                        break L34;
                      } else {
                        if (ka.a((byte) 62)) {
                          break L31;
                        } else {
                          break L34;
                        }
                      }
                    }
                    L35: {
                      if (!this.a(var7, true, var19)) {
                        stackIn_111_0 = 0;
                        break L35;
                      } else {
                        stackIn_111_0 = 1;
                        break L35;
                      }
                    }
                    var5 = stackIn_111_0;
                    break L31;
                  }
                }
              }
              L36: {
                bm.a(96, 96, false, -30791, var19);
                bm.a(48, 48, true, -30791, var7);
                if (this.field_w.field_k != 1) {
                  break L36;
                } else {
                  L37: {
                    var20 = this.field_w.field_l[0];
                    if (var20.field_qb > this.field_i) {
                      L38: {
                        var9_long = ue.a(false);
                        this.a(gq.field_Yb, this.field_i, var9_long + -fl.field_l, true, 1000);
                        fl.field_l = var9_long;
                        this.field_i = var20.field_qb;
                        this.a(this.field_w.field_b.field_b, var20.field_ob, (byte) -125, var20.field_qb);
                        if ((this.field_i ^ -1) != -2) {
                          break L38;
                        } else {
                          if (0 == this.field_w.field_b.field_b.field_h) {
                            var11 = var20;
                            var20.field_Q = 0;
                            var11.field_m = 0;
                            var20.field_u = 0;
                            var12 = var20;
                            var12.field_N = 0;
                            var13 = (vn) ((Object) var20.field_gb.d(-66));
                            L39: while (true) {
                              if (var13 == null) {
                                break L38;
                              } else {
                                var13.field_I = 0;
                                var13 = (vn) ((Object) var20.field_gb.a((byte) 116));
                                continue L39;
                              }
                            }
                          } else {
                            break L38;
                          }
                        }
                      }
                      L40: {
                        L41: {
                          if (this.field_i > 1) {
                            break L41;
                          } else {
                            if (-2 != (this.field_w.field_b.field_b.field_h ^ -1)) {
                              break L40;
                            } else {
                              break L41;
                            }
                          }
                        }
                        if (lc.a(0, -119)) {
                          if (!(oa.field_Sb instanceof dp)) {
                            break L40;
                          } else {
                            this.a(false, 239, 16);
                            break L40;
                          }
                        } else {
                          break L40;
                        }
                      }
                      if (this.field_i >= this.field_w.field_b.a(95)) {
                        break L37;
                      } else {
                        w.field_r = lg.a(2, this.field_w.field_b.a(this.field_i, (byte) -122), -1);
                        break L37;
                      }
                    } else {
                      break L37;
                    }
                  }
                  L42: {
                    if (var20.field_tb) {
                      var9_int = (33423360 - 2 * (var20.field_yb.field_j - -(var20.field_yb.field_u / 2) << 191197160)) / 510;
                      nk.field_c.g();
                      oa.field_Sb.a(true, var9_int, 0, 0, 0);
                      kc.field_q.a((byte) 78);
                      ih.field_k = oa.field_Sb.c((byte) -116);
                      fq.field_c = oa.field_Sb.b(-102);
                      oa.field_Sb = rd.a(var20.field_ab.field_p, (byte) 19);
                      km.field_i = 32;
                      var20.field_tb = false;
                      pe.field_n = var20.field_ab.field_p;
                      break L42;
                    } else {
                      break L42;
                    }
                  }
                  L43: {
                    L44: {
                      if (-1 > (var20.field_qb ^ -1)) {
                        break L44;
                      } else {
                        if (this.field_w.field_b.field_b.field_h != 0) {
                          break L44;
                        } else {
                          break L43;
                        }
                      }
                    }
                    L45: {
                      if (dp.field_r[0] <= var20.field_m) {
                        this.b(0, -64, 255);
                        break L45;
                      } else {
                        break L45;
                      }
                    }
                    L46: {
                      if (var20.field_m < dp.field_r[1]) {
                        break L46;
                      } else {
                        this.b(1, 119, 254);
                        break L46;
                      }
                    }
                    L47: {
                      if (var20.field_m < dp.field_r[2]) {
                        break L47;
                      } else {
                        this.b(2, -42, 253);
                        break L47;
                      }
                    }
                    L48: {
                      if (dp.field_r[39] <= var20.field_m) {
                        this.b(39, 109, 216);
                        break L48;
                      } else {
                        break L48;
                      }
                    }
                    L49: {
                      if (var20.field_qb + -this.field_t < dp.field_r[3]) {
                        break L49;
                      } else {
                        this.a(false, 252, 3);
                        break L49;
                      }
                    }
                    L50: {
                      if (var20.field_qb - this.field_t < dp.field_r[4]) {
                        break L50;
                      } else {
                        this.a(false, 251, 4);
                        break L50;
                      }
                    }
                    L51: {
                      if (var20.field_qb >= dp.field_r[5] - 1) {
                        this.a(250, 67, 5);
                        break L51;
                      } else {
                        break L51;
                      }
                    }
                    L52: {
                      if (-1 + dp.field_r[6] > var20.field_qb) {
                        break L52;
                      } else {
                        if ((var20.field_Z ^ -1) != -6) {
                          break L52;
                        } else {
                          this.a(249, 67, 6);
                          break L52;
                        }
                      }
                    }
                    L53: {
                      if (dp.field_r[7] <= var20.field_ob) {
                        this.a((byte) 68, 7, 248);
                        break L53;
                      } else {
                        break L53;
                      }
                    }
                    L54: {
                      if (dp.field_r[8] <= var20.field_ob) {
                        this.a((byte) 97, 8, 247);
                        break L54;
                      } else {
                        break L54;
                      }
                    }
                    L55: {
                      if (var20.field_ob >= dp.field_r[40]) {
                        this.a((byte) 39, 40, 215);
                        break L55;
                      } else {
                        break L55;
                      }
                    }
                    var9 = (vn) ((Object) var20.field_gb.d(-119));
                    L56: while (true) {
                      L57: {
                        if (var9 == null) {
                          break L57;
                        } else {
                          L58: {
                            if ((dp.field_r[9] ^ -1) >= (var9.field_I ^ -1)) {
                              this.b(9, 106, 246);
                              break L58;
                            } else {
                              break L58;
                            }
                          }
                          if (var9.field_I < dp.field_r[10]) {
                            var9 = (vn) ((Object) var20.field_gb.a((byte) 116));
                            continue L56;
                          } else {
                            this.b(10, -52, 245);
                            break L57;
                          }
                        }
                      }
                      L59: {
                        if (dp.field_r[22] > var20.field_l) {
                          break L59;
                        } else {
                          this.b(22, -65, 233);
                          break L59;
                        }
                      }
                      L60: {
                        if (var20.field_hb < dp.field_r[29]) {
                          break L60;
                        } else {
                          this.b(29, 114, 226);
                          break L60;
                        }
                      }
                      L61: {
                        if (dp.field_r[30] > var20.field_u) {
                          break L61;
                        } else {
                          this.b(30, -118, 225);
                          break L61;
                        }
                      }
                      L62: {
                        if (dp.field_r[31] > var20.field_u) {
                          break L62;
                        } else {
                          this.b(31, -33, 224);
                          break L62;
                        }
                      }
                      L63: {
                        if (var20.field_N < dp.field_r[32]) {
                          break L63;
                        } else {
                          this.b(32, -94, 223);
                          break L63;
                        }
                      }
                      L64: {
                        if (var20.field_N < dp.field_r[33]) {
                          break L64;
                        } else {
                          this.b(33, 112, 222);
                          break L64;
                        }
                      }
                      L65: {
                        if (var20.field_t >= dp.field_r[19]) {
                          this.b(19, 85, 236);
                          break L65;
                        } else {
                          break L65;
                        }
                      }
                      L66: {
                        if (var20.field_t < dp.field_r[20]) {
                          break L66;
                        } else {
                          this.b(20, -128, 235);
                          break L66;
                        }
                      }
                      if (var20.field_t >= dp.field_r[21]) {
                        this.b(21, 109, 234);
                        break L43;
                      } else {
                        break L43;
                      }
                    }
                  }
                  L67: {
                    if (dj.field_b != var20.field_ob) {
                      dj.field_b = var20.field_ob;
                      vd.field_d = Integer.toString(dj.field_b);
                      break L67;
                    } else {
                      break L67;
                    }
                  }
                  if (pg.field_m != 1 + pp.a(var20, (byte) 59, this.field_w)) {
                    L68: {
                      pg.field_m = pp.a(var20, (byte) -100, this.field_w) + 1;
                      if ((pg.field_m ^ -1) > -11) {
                        stackIn_205_0 = "0" + pg.field_m;
                        break L68;
                      } else {
                        stackIn_205_0 = Integer.toString(pg.field_m);
                        break L68;
                      }
                    }
                    lq.field_e = stackIn_205_0;
                    break L36;
                  } else {
                    break L36;
                  }
                }
              }
              L69: {
                if (!this.field_p) {
                  break L69;
                } else {
                  if (this.field_o != 0) {
                    var8 = 0;
                    L70: while (true) {
                      if (var8 >= this.field_w.field_k) {
                        break L69;
                      } else {
                        if ((this.field_o & 1 << var8) != 0) {
                          if (((this.field_w.field_i | (this.field_w.field_a | this.field_w.field_g)) & 1 << var8) == 0) {
                            var21 = this.field_w.field_l[var8];
                            if (var5 != 0) {
                              if (0 == var21.field_F % 5) {
                                L71: {
                                  stackIn_221_0 = this;

                                  stackIn_221_1 = 120;

                                  stackIn_221_2 = var8;

                                  if (var21.field_F % 5 != 0) {
                                    stackIn_222_0 = this;
                                    stackIn_222_1 = stackIn_221_1;
                                    stackIn_222_2 = stackIn_221_2;
                                    stackIn_222_3 = 0;
                                    break L71;
                                  } else {
                                    stackIn_222_0 = this;
                                    stackIn_222_1 = stackIn_221_1;
                                    stackIn_222_2 = stackIn_221_2;
                                    stackIn_222_3 = 1;
                                    break L71;
                                  }
                                }
                                this.a((byte) stackIn_222_1, stackIn_222_2, stackIn_222_3 != 0);
                                var8++;
                                continue L70;
                              } else {
                                var8++;
                                continue L70;
                              }
                            } else {
                              var8++;
                              continue L70;
                            }
                          } else {
                            var8++;
                            continue L70;
                          }
                        } else {
                          var8++;
                          continue L70;
                        }
                      }
                    }
                  } else {
                    break L69;
                  }
                }
              }
              return;
            } else {
              if ((this.field_o & 1 << var5) != 0) {
                L72: {
                  var17 = this.field_w.field_l[var5];
                  if (param1) {
                    this.a((byte) 73, var17);
                    break L72;
                  } else {
                    var17.field_db = 0;
                    break L72;
                  }
                }
                if (this.field_p) {
                  var17.field_vb[var17.field_F % 5] = var17.field_db;
                  var5++;
                  continue L30;
                } else {
                  var5++;
                  continue L30;
                }
              } else {
                var5++;
                continue L30;
              }
            }
          }
        } else {
          return;
        }
    }

    final boolean c(int param0) {
        if (param0 < 93) {
            this.a(false, (byte) -87);
        }
        return this.field_k == -2 ? true : false;
    }

    private final void e(int param0) {
        if (param0 != 0) {
            this.field_q = true;
        }
        if (this.field_s) {
            return;
        }
        if (null == fj.field_Ub) {
            if (!(0 >= this.field_w.field_l[0].field_ob)) {
                fj.field_Ub = new sp(this.field_w.field_b.field_b.field_d, 65535 ^ this.field_w.field_b.field_b.field_d, fp.field_z, ep.field_i, od.field_c, og.field_Wb, new int[]{this.field_w.field_l[0].field_ob, this.field_t << 36973968 | this.field_r});
                if (!og.h(-26090)) {
                    bd.a(3, (byte) 25, fj.field_Ub);
                }
            }
        }
    }

    final void a(byte param0, boolean param1) {
        int stackIn_8_0 = 0;
        L0: {
          if (!this.field_p) {
            L1: {
              if (1 == this.field_w.field_k) {
                if (this.field_s) {
                  break L1;
                } else {
                  L2: {
                    this.a(pp.a(this.field_w.field_l[0], (byte) 115, this.field_w), false);
                    this.e(0);
                    this.a(gq.field_Yb, this.field_r, -fl.field_l + ue.a(false), false, 1000);
                    jj.field_d = jj.field_d | ja.a(this.field_t, this.field_w.field_b, -1 + this.field_r, true);
                    if (-1 != (hh.field_b[0] ^ -1)) {
                      stackIn_8_0 = 0;
                      break L2;
                    } else {
                      stackIn_8_0 = 1;
                      break L2;
                    }
                  }
                  be.field_a = stackIn_8_0 != 0;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L3: {
              if (this.field_w.field_k != 1) {
                break L3;
              } else {
                if (this.field_w.field_l[0].field_Z == 8) {
                  ng.a(param1, 107, 18);
                  ji.a(25459, true, cd.field_g, 1, 1, true);
                  break L0;
                } else {
                  break L3;
                }
              }
            }
            this.a(param1, (byte) 69);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 == 40) {
          pe.field_n = si.field_k.field_m;
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0, byte param1) {
        int var4;
        L0: {
          L1: {
            var4 = BrickABrac.field_J ? 1 : 0;
            rj.a((byte) 80, to.field_k);
            rj.a((byte) 80, me.field_d);
            if (-2 > (this.field_w.field_k ^ -1)) {
              break L1;
            } else {
              if (9 == this.field_w.field_l[0].field_Z) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          ji.a(25459, true, cd.field_g, 1, 1, true);
          break L0;
        }
        if (!this.field_p) {
          if (param1 == 69) {
            L2: {
              if (og.h(-26090)) {
                L3: {
                  if (ib.a(pl.field_b, -1)) {
                    break L3;
                  } else {
                    if (fj.field_Ub != null) {
                      break L3;
                    } else {
                      ng.a(param0, 121, 0);
                      break L2;
                    }
                  }
                }
                ng.a(param0, 68, 10);
                break L2;
              } else {
                if (!ib.a(pl.field_b, -1)) {
                  if (fj.field_Ub != null) {
                    ng.a(param0, 68, 5);
                    break L2;
                  } else {
                    ng.a(param0, 100, 0);
                    break L2;
                  }
                } else {
                  ng.a(param0, 60, 9);
                  break L2;
                }
              }
            }
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void a(byte param0, pi param1, boolean param2) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        p var5 = null;
        int var6_int = 0;
        j var6 = null;
        int var7 = 0;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var4_int = param1.l(255);
            if (this.field_w.field_k > var4_int) {
              var5 = new p();
              var5.field_k = param1.i(65280);
              param1.n(-79);
              var6_int = 0;
              L1: while (true) {
                if (var6_int >= 5) {
                  L2: {
                    if (param0 == -15) {
                      break L2;
                    } else {
                      this.b(-25, 35, 50);
                      break L2;
                    }
                  }
                  L3: {
                    param1.f((byte) 100);
                    if (!param2) {
                      break L3;
                    } else {
                      var5.field_m = param1.e(255);
                      var5.field_l = true;
                      break L3;
                    }
                  }
                  var6 = this.field_w.field_l[var4_int];
                  var6.field_E = var6.field_E + 5;
                  var6.field_q = var6.field_q + 5;
                  var6.field_eb.a(var5, (byte) 3);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var5.field_n[var6_int] = param1.c(3, (byte) 117);
                  var6_int++;
                  continue L1;
                }
              }
            } else {
              rk.a("K1: (" + var4_int + "/" + param1.field_l + ") " + eq.c((byte) -110), (Throwable) null, param0 + 125);
              hn.a((byte) 89);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("qj.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, pi param1) {
        int var3_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              var3_int = param1.l(param0 ^ 18615);
              this.field_w.field_l[var3_int].field_V = param1.j(48);
              this.field_w.field_i = this.field_w.field_i | 1 << var3_int;
              if (param0 == 18504) {
                break L1;
              } else {
                field_u = (mh) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var3);

            stackIn_5_1 = new StringBuilder().append("qj.CA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    private final void a(byte param0, int param1, boolean param2) {
        int var6 = 0;
        int var7 = BrickABrac.field_J ? 1 : 0;
        int var4 = 17 % ((29 - param0) / 57);
        k.field_h.e(-13413, !param2 ? 68 : 69);
        k.field_h.p(62);
        j var5 = this.field_w.field_l[param1];
        for (var6 = 0; var6 < 5; var6++) {
            k.field_h.a(3, -17566, var5.field_vb[var6]);
        }
        k.field_h.q(-105);
        if (!(!param2)) {
            k.field_h.a(var5.a(true, (StringBuilder) null) ^ var5.e(122), (byte) -79);
        }
    }

    final boolean a(char param0, int param1, int param2) {
        int fieldTemp$0 = 0;
        int stackIn_150_0 = 0;
        int var4;
        int var5;
        vn var5_ref_vn;
        int var6;
        j var7;
        j var8;
        L0: {
          var6 = BrickABrac.field_J ? 1 : 0;
          var4 = oo.field_w.a(-37880252, 10);
          var5 = oo.field_w.a(-37880252, 5);
          if (var4 != 0) {
            break L0;
          } else {
            fp.field_z = fp.field_z + og.field_Wb;
            od.field_c = od.field_c + 1;
            break L0;
          }
        }
        L1: {
          if (-2 == (var4 ^ -1)) {
            fp.field_z = fp.field_z - og.field_Wb * 2;
            od.field_c = od.field_c - 2;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if ((var4 ^ -1) == -3) {
            og.field_Wb = og.field_Wb + 2;
            fp.field_z = fp.field_z + od.field_c * 2;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (-4 != (var4 ^ -1)) {
            break L3;
          } else {
            og.field_Wb = og.field_Wb - 1;
            fp.field_z = fp.field_z - od.field_c;
            break L3;
          }
        }
        L4: {
          if (4 == var4) {
            od.field_c = od.field_c + 1;
            ep.field_i = ep.field_i + og.field_Wb;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (-6 == (var4 ^ -1)) {
            od.field_c = od.field_c - 2;
            ep.field_i = ep.field_i - 2 * og.field_Wb;
            break L5;
          } else {
            break L5;
          }
        }
        if (param1 > 98) {
          L6: {
            if (6 != var4) {
              break L6;
            } else {
              ep.field_i = ep.field_i + og.field_Wb;
              od.field_c = od.field_c + 1;
              break L6;
            }
          }
          L7: {
            if (var4 == 7) {
              og.field_Wb = og.field_Wb - 2;
              ep.field_i = ep.field_i - od.field_c * 2;
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            if (8 == var4) {
              fp.field_z = fp.field_z + var5;
              fp.field_z = fp.field_z - var5;
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            if (var4 == 9) {
              ep.field_i = ep.field_i + var5;
              fp.field_z = fp.field_z - var5;
              break L9;
            } else {
              break L9;
            }
          }
          L10: {
            var4 = oo.field_w.a(-37880252, 5);
            if (var4 == 0) {
              hg.field_e = hg.field_e ^ tm.field_g + qm.field_a << 1285268400;
              break L10;
            } else {
              break L10;
            }
          }
          L11: {
            if (var4 != 1) {
              break L11;
            } else {
              ek.field_kb = ek.field_kb - tm.field_g;
              qm.field_a = qm.field_a - 1;
              break L11;
            }
          }
          L12: {
            if (var4 != 2) {
              break L12;
            } else {
              qm.field_a = qm.field_a + 1;
              ek.field_kb = ek.field_kb + tm.field_g;
              break L12;
            }
          }
          L13: {
            if ((var4 ^ -1) != -4) {
              break L13;
            } else {
              tm.field_g = tm.field_g - 1;
              ek.field_kb = ek.field_kb - qm.field_a;
              break L13;
            }
          }
          L14: {
            if (var4 != 4) {
              break L14;
            } else {
              tm.field_g = tm.field_g + 1;
              ek.field_kb = ek.field_kb + qm.field_a;
              break L14;
            }
          }
          if ((param2 ^ -1) != -14) {
            L15: {
              if (-2 != (this.field_w.field_k ^ -1)) {
                break L15;
              } else {
                if (!r.field_A) {
                  break L15;
                } else {
                  if (ka.a((byte) 113)) {
                    L16: {
                      if (84 == param2) {
                        im.b(-8);
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    return true;
                  } else {
                    break L15;
                  }
                }
              }
            }
            L17: {
              if (1 != this.field_w.field_k) {
                break L17;
              } else {
                if (!this.field_y) {
                  break L17;
                } else {
                  var7 = this.field_w.field_l[0];
                  var8 = var7;
                  if (48 == param2) {
                    this.field_s = true;
                    var7.field_m = dp.field_r[0] + -5;
                    return true;
                  } else {
                    if ((param2 ^ -1) == -69) {
                      var7.field_m = dp.field_r[1] - 5;
                      this.field_s = true;
                      return true;
                    } else {
                      if (66 != param2) {
                        if ((param2 ^ -1) == -51) {
                          this.field_t = -dp.field_r[3] + (var8.field_qb + 1);
                          this.field_s = true;
                          return true;
                        } else {
                          if ((param2 ^ -1) == -35) {
                            this.field_s = true;
                            this.field_t = var7.field_qb + 1 + -dp.field_r[4];
                            return true;
                          } else {
                            if (51 == param2) {
                              var7.field_ob = dp.field_r[7] + -20;
                              this.field_s = true;
                              return true;
                            } else {
                              L18: {
                                if (-53 != (param2 ^ -1)) {
                                  break L18;
                                } else {
                                  this.field_s = true;
                                  var7.field_ob = -20 + dp.field_r[8];
                                  break L18;
                                }
                              }
                              if ((param2 ^ -1) != -54) {
                                if (param2 == 39) {
                                  var5_ref_vn = (vn) ((Object) var8.field_gb.d(-114));
                                  L19: while (true) {
                                    if (var5_ref_vn == null) {
                                      this.field_s = true;
                                      return true;
                                    } else {
                                      var5_ref_vn.field_I = dp.field_r[10] - 2;
                                      var5_ref_vn = (vn) ((Object) var8.field_gb.a((byte) 116));
                                      continue L19;
                                    }
                                  }
                                } else {
                                  if (param2 != 54) {
                                    if (-56 == (param2 ^ -1)) {
                                      var5 = 0;
                                      L20: while (true) {
                                        if (29 <= var5) {
                                          this.field_s = true;
                                          return true;
                                        } else {
                                          if (to.field_f[var5] > -1) {
                                            var7.field_o[var5] = (byte)(-1 + to.field_f[var5]);
                                            var5++;
                                            continue L20;
                                          } else {
                                            var5++;
                                            continue L20;
                                          }
                                        }
                                      }
                                    } else {
                                      if (param2 == 56) {
                                        var8.field_rb = 5;
                                        this.field_s = true;
                                        return true;
                                      } else {
                                        L21: {
                                          if ((param2 ^ -1) > -17) {
                                            break L21;
                                          } else {
                                            if (25 < param2) {
                                              break L21;
                                            } else {
                                              L22: {
                                                var5 = -16 - (-param2 - 1);
                                                this.field_s = true;
                                                if (!pe.field_l[81]) {
                                                  break L22;
                                                } else {
                                                  var5 += 10;
                                                  break L22;
                                                }
                                              }
                                              if (-12 <= (var5 ^ -1)) {
                                                oa.field_Sb = rd.a(var5, (byte) 19);
                                                return true;
                                              } else {
                                                break L21;
                                              }
                                            }
                                          }
                                        }
                                        if (70 != param2) {
                                          if (param2 != 69) {
                                            if (-41 == (param2 ^ -1)) {
                                              var7.field_u = -1 + dp.field_r[30];
                                              this.field_s = true;
                                              return true;
                                            } else {
                                              if (41 != param2) {
                                                if (param2 != 32) {
                                                  if (param2 != 35) {
                                                    if (49 != param2) {
                                                      if (param2 == 36) {
                                                        this.field_s = true;
                                                        var7.field_ob = dp.field_r[40] + -20;
                                                        return true;
                                                      } else {
                                                        if (38 != param2) {
                                                          break L17;
                                                        } else {
                                                          var8.field_Z = 0;
                                                          this.field_s = true;
                                                          var8.field_P = 0;
                                                          return true;
                                                        }
                                                      }
                                                    } else {
                                                      this.field_s = true;
                                                      var7.field_m = dp.field_r[39] + -5;
                                                      return true;
                                                    }
                                                  } else {
                                                    var7.field_N = -1 + dp.field_r[33];
                                                    this.field_s = true;
                                                    return true;
                                                  }
                                                } else {
                                                  var7.field_N = dp.field_r[32] + -1;
                                                  this.field_s = true;
                                                  return true;
                                                }
                                              } else {
                                                var7.field_u = dp.field_r[31] - 1;
                                                this.field_s = true;
                                                return true;
                                              }
                                            }
                                          } else {
                                            this.field_s = true;
                                            var7.field_hb = -1 + dp.field_r[29];
                                            return true;
                                          }
                                        } else {
                                          var8.field_l = 6;
                                          this.field_s = true;
                                          return true;
                                        }
                                      }
                                    }
                                  } else {
                                    L23: {
                                      fieldTemp$0 = var8.field_qb + 1;
                                      var8.field_qb = var8.field_qb + 1;
                                      if (tk.field_q > fieldTemp$0) {
                                        var8.field_Z = 0;
                                        break L23;
                                      } else {
                                        var8.field_Z = 5;
                                        break L23;
                                      }
                                    }
                                    this.field_s = true;
                                    var8.field_P = 0;
                                    return true;
                                  }
                                }
                              } else {
                                var5_ref_vn = (vn) ((Object) var8.field_gb.d(-19));
                                L24: while (true) {
                                  if (var5_ref_vn == null) {
                                    this.field_s = true;
                                    return true;
                                  } else {
                                    var5_ref_vn.field_I = dp.field_r[9] + -2;
                                    var5_ref_vn = (vn) ((Object) var8.field_gb.a((byte) 116));
                                    continue L24;
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        var7.field_m = -5 + dp.field_r[2];
                        this.field_s = true;
                        return true;
                      }
                    }
                  }
                }
              }
            }
            L25: {
              if (pf.field_p) {
                stackIn_150_0 = 0;
                break L25;
              } else {
                stackIn_150_0 = 1;
                break L25;
              }
            }
            return stackIn_150_0 != 0;
          } else {
            L26: {
              var4 = 1;
              if (this.field_p) {
                if (this.c(113)) {
                  var4 = 4;
                  break L26;
                } else {
                  L27: {
                    if (this.field_w.field_c) {
                      break L27;
                    } else {
                      if (((this.field_w.field_a | (this.field_w.field_i | this.field_w.field_g)) & 1 << this.field_k) != 0) {
                        break L27;
                      } else {
                        var4 = 2;
                        break L26;
                      }
                    }
                  }
                  var4 = 3;
                  break L26;
                }
              } else {
                if (-2 == (this.field_w.field_k ^ -1)) {
                  L28: {
                    var5 = this.field_w.field_l[0].field_Z;
                    if (5 == var5) {
                      break L28;
                    } else {
                      if (9 == var5) {
                        break L28;
                      } else {
                        if ((var5 ^ -1) == -4) {
                          break L28;
                        } else {
                          if (-9 == (var5 ^ -1)) {
                            break L28;
                          } else {
                            break L26;
                          }
                        }
                      }
                    }
                  }
                  return true;
                } else {
                  if (this.field_w.field_k == 2) {
                    var4 = 17;
                    break L26;
                  } else {
                    break L26;
                  }
                }
              }
            }
            L29: {
              L30: {
                if ((this.field_w.field_k ^ -1) == -2) {
                  break L30;
                } else {
                  if (!this.field_w.field_c) {
                    break L30;
                  } else {
                    if (200 >= be.field_j) {
                      break L29;
                    } else {
                      be.field_j = 299;
                      return true;
                    }
                  }
                }
              }
              ng.a(false, 64, var4);
              break L29;
            }
            return true;
          }
        } else {
          return false;
        }
    }

    private final void a(int param0, int param1, long param2, boolean param3, int param4) {
        int var7 = 0;
        if (!this.field_s) {
            if (!(!og.h(-26090))) {
                return;
            }
            param1 = param1 + param0 * 1000;
            var7 = param3 ? 1 : 0;
            hq.a(param1, var7, param4 + -468, ((int)param2 - -500) / param4);
            return;
        }
    }

    final void b(int param0) {
        if (!this.field_p) {
            throw new IllegalStateException();
        }
        this.field_w.field_i = this.field_w.field_i | 1 << this.field_k;
        int var2 = 116 % ((param0 - -55) / 62);
        k.field_h.e(-13413, 66);
    }

    private final void a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        if (!(!this.a(param2, 1))) {
            return;
        }
        if (param0) {
            this.field_q = true;
        }
        if (!this.field_s) {
            var4 = this.field_w.field_l[0].field_ob;
            var5 = this.field_w.field_l[0].field_qb;
            fp.field_z = fp.field_z - (this.field_t + var4);
            ep.field_i = ep.field_i + (-this.field_t + var5);
            lp.field_wb.a(new e(param2, param1, fp.field_z, ep.field_i, od.field_c, og.field_Wb), (byte) 3);
            fp.field_z = fp.field_z - (-this.field_t + var5);
            ep.field_i = ep.field_i + (this.field_t + var4);
        }
    }

    final void a(byte param0, int param1) {
        int var3 = 0;
        int var4 = BrickABrac.field_J ? 1 : 0;
        if (param0 != 119) {
            return;
        }
        for (var3 = 0; var3 < this.field_w.field_l.length; var3++) {
            this.field_w.field_l[var3].field_qb = param1;
        }
        if ((this.field_w.field_k ^ -1) == -2) {
            this.field_t = param1;
            this.field_i = param1;
            var3 = param1;
            fp.field_z = fp.field_z + var3;
            w.field_r = lg.a(2, this.field_w.field_b.a(this.field_i, (byte) -122), -1);
        }
    }

    final static void b(byte param0, boolean param1) {
        int var2 = 9 % ((param0 - -73) / 49);
        String[] var3 = new String[]{tb.field_cb == null ? we.field_c : tb.field_cb, pg.field_q};
        oi var4 = new oi(qh.field_b, kk.a(false, qh.field_b.field_i, hi.field_w), 3);
        r.field_A = false;
        oa.field_Sb = rd.a(0, (byte) 19);
        sk.a(var3, 0, var4, 2, param1, -12665);
    }

    final void a(pi param0, int param1) {
        int var3_int = 0;
        byte dupTemp$0 = 0;
        int var4 = BrickABrac.field_J ? 1 : 0;
        try {
            for (var3_int = param1; this.field_w.field_k > var3_int; var3_int++) {
                dupTemp$0 = param0.b(true);
                this.field_w.field_m[var3_int] = dupTemp$0;
                op.field_a = op.field_a | (0 <= dupTemp$0 ? true : false);
            }
            this.field_w.a(false);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "qj.Q(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void d(int param0) {
        field_u = null;
        field_l = null;
        int var1 = 47 / ((param0 - 14) / 59);
    }

    private final void a(int param0, boolean param1) {
        int var3 = 0;
        if (param1) {
            this.field_n = true;
        }
        if (!(this.field_w.field_k != 1)) {
            var3 = param0;
            ep.field_i = ep.field_i - var3;
        }
        this.field_r = param0;
    }

    private final void b(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var4 = 0;
        if (!(!this.a(param0, 1))) {
            return;
        }
        if (!this.field_s) {
            var4 = param0;
            var5 = param2;
            if (!((255 ^ var5) == var4)) {
                throw new IllegalArgumentException();
            }
            var6 = ed.field_f[var4];
            if (!(0 <= var6)) {
                throw new IllegalArgumentException();
            }
            ek.field_kb = ek.field_kb + hg.field_e;
            var7 = 1 << var6;
            hg.field_e = hg.field_e ^ var7;
            ek.field_kb = ek.field_kb - hg.field_e;
            lp.field_wb.a(new e(param0, param2, hg.field_e, ek.field_kb, tm.field_g, qm.field_a), (byte) 3);
        }
        var4 = 90 % ((param1 - 36) / 46);
    }

    private final void a(byte param0, int param1, int param2) {
        int var5 = BrickABrac.field_J ? 1 : 0;
        if (!(!this.a(param1, 1))) {
            return;
        }
        if (param0 <= 17) {
            return;
        }
        if (this.field_s) {
        } else {
            if ((param1 ^ -1) == -8) {
                fp.field_z = fp.field_z - this.field_t;
            } else {
                ep.field_i = ep.field_i - this.field_t;
            }
            lp.field_wb.a(new e(param1, param2, fp.field_z, ep.field_i, od.field_c, og.field_Wb), (byte) 3);
            if (-8 != (param1 ^ -1)) {
                ep.field_i = ep.field_i + this.field_t;
            } else {
                fp.field_z = fp.field_z + this.field_t;
            }
        }
    }

    private final boolean a(vl param0, boolean param1, vl param2) {
        vl stackIn_4_0 = null;
        int stackIn_105_0 = 0;
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        RuntimeException stackIn_109_0 = null;
        StringBuilder stackIn_109_1 = null;
        String stackIn_109_2 = null;
        StringBuilder stackIn_111_1 = null;
        StringBuilder stackIn_112_1 = null;
        String stackIn_112_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        vl var5 = null;
        int var6_int = 0;
        j var6 = null;
        int var7 = 0;
        int var8_int = 0;
        j var8 = null;
        ge var9_ref_ge = null;
        int var9 = 0;
        int var10 = 0;
        p var10_ref_p = null;
        Object var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        j var16 = null;
        j var17 = null;
        j var18 = null;
        var13 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = 0;
              if (!this.field_p) {
                stackIn_4_0 = new vl();
                break L1;
              } else {
                stackIn_4_0 = null;
                break L1;
              }
            }
            var5 = stackIn_4_0;
            var6_int = 0;
            L2: while (true) {
              if (var6_int >= this.field_w.field_k) {
                L3: {
                  var6_int = 0;
                  if (param1) {
                    break L3;
                  } else {
                    this.field_k = 29;
                    break L3;
                  }
                }
                L4: while (true) {
                  if (this.field_w.field_k <= var6_int) {
                    L5: {
                      if (this.field_w.field_k <= 1) {
                        break L5;
                      } else {
                        var6_int = 0;
                        L6: while (true) {
                          if (var6_int >= this.field_w.field_k) {
                            break L5;
                          } else {
                            L7: {
                              var18 = this.field_w.field_l[var6_int];
                              var8_int = var18.field_p + var18.field_ub << 2067259976;
                              var18.field_J = var18.field_J + (var8_int + -var18.field_G) / 100;
                              var18.field_J = 7 * var18.field_J / 8;
                              if (var18.field_J > 1280) {
                                var18.field_J = 1280;
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            L8: {
                              var18.field_G = var18.field_G + var18.field_J;
                              if (var18.field_G <= var8_int) {
                                break L8;
                              } else {
                                var18.field_G = var8_int;
                                break L8;
                              }
                            }
                            var6_int++;
                            continue L6;
                          }
                        }
                      }
                    }
                    L9: {
                      if (-2 > (this.field_w.field_k ^ -1)) {
                        var6_int = this.field_w.a(125);
                        var7 = 0;
                        L10: while (true) {
                          if (this.field_w.field_k <= var7) {
                            break L9;
                          } else {
                            L11: {
                              var8 = this.field_w.field_l[var7];
                              if (-1 != (1 << var7 & var6_int ^ -1)) {
                                if (var8.field_M != -1) {
                                  break L11;
                                } else {
                                  var8.field_M = 500;
                                  break L11;
                                }
                              } else {
                                var8.field_M = -1;
                                break L11;
                              }
                            }
                            var7++;
                            continue L10;
                          }
                        }
                      } else {
                        break L9;
                      }
                    }
                    L12: {
                      if (!this.field_p) {
                        if ((this.field_w.field_k ^ -1) == -2) {
                          L13: {
                            var6 = this.field_w.field_l[0];
                            if (-9 == (var6.field_Z ^ -1)) {
                              break L13;
                            } else {
                              if ((var6.field_Z ^ -1) != -10) {
                                break L12;
                              } else {
                                break L13;
                              }
                            }
                          }
                          this.a((byte) 40, false);
                          if (8 != var6.field_Z) {
                            cc.field_G = true;
                            break L12;
                          } else {
                            break L12;
                          }
                        } else {
                          if (this.field_w.field_c) {
                            break L12;
                          } else {
                            this.field_w.field_a = this.field_w.field_a | this.field_w.c(-17566);
                            this.field_w.field_g = this.field_w.field_g | this.field_w.a((byte) -92);
                            if (!this.field_w.b(82)) {
                              break L12;
                            } else {
                              L14: {
                                if (-1 != this.field_w.field_h) {
                                  break L14;
                                } else {
                                  this.field_w.field_h = 0;
                                  break L14;
                                }
                              }
                              L15: {
                                var6_int = this.field_w.field_h;
                                var7 = 1 - this.field_w.field_h;
                                if ((this.field_w.field_a & 1 << var7) == 0) {
                                  break L15;
                                } else {
                                  var6_int = var7;
                                  break L15;
                                }
                              }
                              this.field_w.field_l[var6_int].field_zb = 1;
                              this.field_w.field_m[0] = var6_int;
                              this.field_w.field_l[-var6_int + 1].field_zb = 2;
                              this.field_w.field_m[1] = 1 - var6_int;
                              this.field_w.a(false);
                              op.field_a = true;
                              break L12;
                            }
                          }
                        }
                      } else {
                        break L12;
                      }
                    }
                    stackIn_105_0 = var4_int;
                    break L0;
                  } else {
                    var17 = this.field_w.field_l[var6_int];
                    var8_int = 0;
                    var9_ref_ge = (ge) ((Object) var17.field_pb.d(-48));
                    L16: while (true) {
                      if (var9_ref_ge == null) {
                        var15 = 0;
                        var9 = var15;
                        L17: while (true) {
                          if (-30 >= (var15 ^ -1)) {
                            var6_int++;
                            continue L4;
                          } else {
                            L18: {
                              if (to.field_f[var15] >= 1) {
                                L19: {
                                  var10 = (20 * var17.field_o[var15] << -1472610392) / to.field_f[var15];
                                  if ((1 << var15 & var8_int) == 0) {
                                    break L19;
                                  } else {
                                    var10 = 5120;
                                    break L19;
                                  }
                                }
                                L20: {
                                  var17.field_xb[var15] = var17.field_xb[var15] + (-var17.field_cb[var15] + var10) / 100;
                                  var17.field_xb[var15] = 7 * var17.field_xb[var15] / 8;
                                  if (512 >= var17.field_xb[var15]) {
                                    break L20;
                                  } else {
                                    var17.field_xb[var15] = 512;
                                    break L20;
                                  }
                                }
                                L21: {
                                  if (511 < (var17.field_xb[var15] ^ -1)) {
                                    var17.field_xb[var15] = -512;
                                    break L21;
                                  } else {
                                    break L21;
                                  }
                                }
                                L22: {
                                  L23: {
                                    var17.field_cb[var15] = var17.field_cb[var15] + var17.field_xb[var15];
                                    if ((var17.field_xb[var15] ^ -1) >= -1) {
                                      break L23;
                                    } else {
                                      if (var17.field_cb[var15] > var10) {
                                        break L22;
                                      } else {
                                        break L23;
                                      }
                                    }
                                  }
                                  if (-1 < (var17.field_xb[var15] ^ -1)) {
                                    if (var10 > var17.field_cb[var15]) {
                                      break L22;
                                    } else {
                                      break L18;
                                    }
                                  } else {
                                    var15++;
                                    continue L17;
                                  }
                                }
                                var17.field_cb[var15] = var10;
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            var15++;
                            continue L17;
                          }
                        }
                      } else {
                        var8_int = var8_int | 1 << var9_ref_ge.field_i;
                        var9_ref_ge = (ge) ((Object) var17.field_pb.a((byte) 116));
                        continue L16;
                      }
                    }
                  }
                }
              } else {
                L24: {
                  var16 = this.field_w.field_l[var6_int];
                  if ((1 << var6_int & (this.field_w.field_i | (this.field_w.field_g | this.field_w.field_a)) ^ -1) == -1) {
                    break L24;
                  } else {
                    var16.field_U = var16.field_U + 1;
                    break L24;
                  }
                }
                L25: {
                  L26: {
                    if ((1 << var6_int & this.field_o) != 0) {
                      L27: {
                        if (!this.field_p) {
                          break L27;
                        } else {
                          L28: {
                            var8_int = var16.field_F - var16.field_E;
                            if (var8_int <= 30) {
                              break L28;
                            } else {
                              if (0 != de.field_x % 10) {
                                break L28;
                              } else {
                                var6_int++;
                                continue L2;
                              }
                            }
                          }
                          L29: {
                            if (40 >= var8_int) {
                              break L29;
                            } else {
                              if (0 != de.field_x % 5) {
                                break L29;
                              } else {
                                break L25;
                              }
                            }
                          }
                          if (50 != var8_int) {
                            break L27;
                          } else {
                            break L25;
                          }
                        }
                      }
                      if (((this.field_w.field_a | (this.field_w.field_g | this.field_w.field_i)) & 1 << var6_int) == 0) {
                        L30: {
                          this.field_w.a((byte) 127, var6_int);
                          this.field_w.a(var16, param2, var5, 0);
                          if (this.field_p) {
                            break L30;
                          } else {
                            this.field_w.a(var6_int, 1, var5, (byte) -122);
                            var16.field_p = var16.field_Q;
                            break L30;
                          }
                        }
                        var4_int = var4_int | 1;
                        var16.field_F = var16.field_F + 1;
                        break L26;
                      } else {
                        break L25;
                      }
                    } else {
                      if (var16.field_q != 0) {
                        L31: {
                          var8_int = 1;
                          if (var16.field_q <= 25) {
                            break L31;
                          } else {
                            var8_int = 3;
                            break L31;
                          }
                        }
                        L32: {
                          if (50 < var16.field_q) {
                            var8_int = -25 + var16.field_q;
                            break L32;
                          } else {
                            break L32;
                          }
                        }
                        var9 = 0;
                        var10_ref_p = (p) ((Object) var16.field_eb.d(-84));
                        L33: while (true) {
                          if (var9 >= var8_int) {
                            break L26;
                          } else {
                            L34: {
                              this.field_w.a((byte) 120, var6_int);
                              var16.field_db = var10_ref_p.a((byte) -104);
                              this.field_w.a(var16, param0, var5, 0);
                              var16.field_F = var16.field_F + 1;
                              if (!var10_ref_p.c(1)) {
                                break L34;
                              } else {
                                L35: {
                                  var10_ref_p.b((byte) 111);
                                  var16.field_p = var10_ref_p.field_k;
                                  if (!var10_ref_p.field_l) {
                                    break L35;
                                  } else {
                                    var11 = null;
                                    var12 = var16.a(param1, (StringBuilder) (var11)) ^ var16.e(120);
                                    if (var10_ref_p.field_m == var12) {
                                      break L35;
                                    } else {
                                      hn.a((byte) 91);
                                      rk.a("T2 " + var10_ref_p.field_m + " " + var12 + " ", (Throwable) null, 54);
                                      cf.field_a = cf.field_a + 1;
                                      break L35;
                                    }
                                  }
                                }
                                var10_ref_p = (p) ((Object) var16.field_eb.d(-21));
                                break L34;
                              }
                            }
                            var9++;
                            var16.field_q = var16.field_q - 1;
                            continue L33;
                          }
                        }
                      } else {
                        var6_int++;
                        continue L2;
                      }
                    }
                  }
                  L36: {
                    if (var5 == null) {
                      break L36;
                    } else {
                      var5.c((byte) -110);
                      break L36;
                    }
                  }
                  var16.c(-101);
                  break L25;
                }
                var6_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L37: {
            var4 = decompiledCaughtException;
            stackIn_108_0 = (RuntimeException) (var4);

            stackIn_108_1 = new StringBuilder().append("qj.P(");

            if (param0 == null) {
              stackIn_109_0 = (RuntimeException) ((Object) stackIn_108_0);
              stackIn_109_1 = (StringBuilder) ((Object) stackIn_108_1);
              stackIn_109_2 = "null";
              break L37;
            } else {
              stackIn_109_0 = (RuntimeException) ((Object) stackIn_108_0);
              stackIn_109_1 = (StringBuilder) ((Object) stackIn_108_1);
              stackIn_109_2 = "{...}";
              break L37;
            }
          }
          L38: {


            stackIn_111_1 = ((StringBuilder) (Object) stackIn_109_1).append(stackIn_109_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_109_0 = (RuntimeException) ((Object) stackIn_109_0);
              stackIn_112_1 = (StringBuilder) ((Object) stackIn_111_1);
              stackIn_112_2 = "null";
              break L38;
            } else {
              stackIn_109_0 = (RuntimeException) ((Object) stackIn_109_0);
              stackIn_112_1 = (StringBuilder) ((Object) stackIn_111_1);
              stackIn_112_2 = "{...}";
              break L38;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_109_0), stackIn_112_2 + ')');
        }
        return stackIn_105_0 != 0;
    }

    private final void a(nc param0, int param1, byte param2, int param3) {
        pn var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          L0: {
            if (!this.field_s) {
              L1: {
                ep.field_i = ep.field_i + (param3 + param0.field_b);
                if (param2 <= -87) {
                  break L1;
                } else {
                  this.field_p = true;
                  break L1;
                }
              }
              L2: {
                fp.field_z = fp.field_z - (param1 + this.field_t);
                var5 = new pn(param0.field_h, -1 + param3, fp.field_z, ep.field_i, od.field_c, og.field_Wb);
                kq.field_j.a(var5, (byte) 3);
                fp.field_z = fp.field_z - (param0.field_b + param3);
                ep.field_i = ep.field_i + (param1 - -this.field_t);
                if (hh.field_b[param0.field_h] >= param3) {
                  break L2;
                } else {
                  hh.field_b[param0.field_h] = param3;
                  break L2;
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
          L3: {
            var5_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5_ref);

            stackIn_9_1 = new StringBuilder().append("qj.AA(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(pi param0, byte param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        ge var6 = null;
        try {
            var3_int = param0.l(255);
            var4 = param0.l(255);
            var5 = param0.e(255);
            var6 = new ge(0, 0, var4);
            int var7 = 102 / ((-65 - param1) / 34);
            var6.field_y = var5;
            this.field_w.field_l[var3_int].field_kb.a(var6, (byte) -39);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "qj.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(byte param0, j param1) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              param1.field_db = 0;
              if (!pe.field_l[param1.field_bb]) {
                break L1;
              } else {
                param1.field_db = param1.field_db | 1;
                break L1;
              }
            }
            L2: {
              if (!pe.field_l[param1.field_j]) {
                break L2;
              } else {
                param1.field_db = param1.field_db | 2;
                break L2;
              }
            }
            L3: {
              if (pe.field_l[param1.field_I]) {
                param1.field_db = param1.field_db | 4;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param0 > 50) {
                break L4;
              } else {
                this.b(60);
                break L4;
              }
            }
            L5: {
              L6: {
                L7: {
                  if (this.field_w.field_k == 1) {
                    break L7;
                  } else {
                    if (!this.field_p) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                L8: {
                  if (!pe.field_l[ah.field_w[1][0]]) {
                    break L8;
                  } else {
                    param1.field_db = param1.field_db | 1;
                    break L8;
                  }
                }
                L9: {
                  if (!pe.field_l[ah.field_w[1][1]]) {
                    break L9;
                  } else {
                    param1.field_db = param1.field_db | 2;
                    break L9;
                  }
                }
                if (pe.field_l[ah.field_w[1][2]]) {
                  param1.field_db = param1.field_db | 4;
                  break L6;
                } else {
                  break L5;
                }
              }
              break L5;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var3);

            stackIn_22_1 = new StringBuilder().append("qj.GA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L10;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L10;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
    }

    private final void g(int param0) {
        int stackIn_44_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_56_0 = 0;
        boolean stackIn_59_0 = false;
        int stackIn_59_1 = 0;
        int stackIn_59_2 = 0;
        boolean stackIn_61_0 = false;
        int stackIn_61_1 = 0;
        int stackIn_61_2 = 0;
        int stackIn_61_3 = 0;
        j stackIn_64_4;
        int stackIn_64_5;
        int stackIn_64_6;
        boolean stackIn_66_0 = false;
        int stackIn_66_1 = 0;
        int stackIn_66_2 = 0;
        int stackIn_66_3 = 0;
        j stackIn_66_4 = null;
        int stackIn_66_5 = 0;
        int stackIn_66_6 = 0;
        int stackIn_66_7 = 0;
        int stackIn_69_0 = 0;
        boolean stackIn_72_0 = false;
        int stackIn_72_1 = 0;
        int stackIn_72_2 = 0;
        boolean stackIn_74_0 = false;
        int stackIn_74_1 = 0;
        int stackIn_74_2 = 0;
        int stackIn_74_3 = 0;
        j stackIn_77_4;
        int stackIn_77_5;
        int stackIn_77_6;
        boolean stackIn_79_0;
        int stackIn_79_1;
        int stackIn_79_2;
        int stackIn_79_3;
        j stackIn_79_4;
        int stackIn_79_5;
        int stackIn_79_6;
        int stackIn_79_7;
        int stackIn_83_0 = 0;
        boolean stackIn_86_0 = false;
        int stackIn_86_1 = 0;
        int stackIn_86_2 = 0;
        boolean stackIn_88_0;
        int stackIn_88_1;
        int stackIn_88_2;
        int stackIn_88_3;
        int[] var2;
        int[] var3;
        int var4;
        int[] var5;
        int var6;
        int var7;
        j var7_ref_j;
        int var8_int;
        jp var8;
        int var9;
        int var10;
        int var11;
        tp[] var12;
        vo var13;
        int[] var14;
        int[] var15;
        int[] var16;
        int[] var17;
        int[] var18;
        int[] var19;
        jp var20;
        int[] var21;
        int[] var22;
        L0: {
          var11 = BrickABrac.field_J ? 1 : 0;
          var4 = -76 / ((-79 - param0) / 35);
          var14 = kh.field_c[this.field_w.field_k - 1];
          var2 = var14;
          var15 = kh.field_e[this.field_w.field_k - 1];
          var3 = var15;
          var5 = kh.field_h[-1 + this.field_w.field_k];
          var6 = this.field_m;
          if (null != oa.field_Sb) {
            var7 = 0;
            L1: while (true) {
              if (var7 >= this.field_w.field_k) {
                break L0;
              } else {
                var13 = this.field_w.field_l[var6].field_yb;
                if (1 == this.field_w.field_k) {
                  L2: {
                    L3: {
                      var9 = (-((var13.field_j - -(var13.field_u / 2) << -563346808) * 2) + 33423360) / 510;
                      oa.field_Sb.a(true, var9, 0, 0, 0);
                      if (oa.field_Sb.field_m == 7) {
                        break L3;
                      } else {
                        if (-6 == (this.field_w.field_l[var6].field_Z ^ -1)) {
                          break L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                    gh.a(121, true);
                    break L2;
                  }
                  if (km.field_i > 0) {
                    var10 = km.field_i * 256 / 32;
                    nk.field_c.b(0, 0, var10);
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  L4: {
                    var14 = var2;
                    var15 = var3;
                    if (-2 != (var5[var7] ^ -1)) {
                      var14 = var2;
                      var15 = var3;
                      vi.a((byte) 124, 153 + var14[var7], var14[var7], var15[var7], 233 + var15[var7]);
                      oa.field_Sb.a((byte) -102, var6, var14[var7], var15[var7]);
                      sc.b(-79);
                      break L4;
                    } else {
                      vi.a((byte) 76, 306 + var14[var7], var14[var7], var15[var7], var15[var7] - -480);
                      var9 = (-(2 * (var13.field_j - -(var13.field_u / 2) << 1524245384)) + 20054016) / 306;
                      oa.field_Sb.a(var15[var7], (byte) -107, var14[var7], var6, var9 / 2);
                      sc.b(-122);
                      break L4;
                    }
                  }
                  var6++;
                  var6 = var6 % this.field_w.field_k;
                  var7++;
                  continue L1;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L5: {
          if (oa.field_Sb != null) {
            var14 = var2;
            var15 = var3;
            if (this.field_w.field_k <= 2) {
              break L5;
            } else {
              var7 = this.field_w.field_k;
              L6: while (true) {
                if ((var7 ^ -1) <= -6) {
                  break L5;
                } else {
                  oa.field_Sb.a((byte) -79, -1, var14[var7], var15[var7]);
                  lb.d(var14[var7], var15[var7], 153, 233, 0, 160);
                  var7++;
                  continue L6;
                }
              }
            }
          } else {
            break L5;
          }
        }
        var6 = this.field_m;
        var7 = 0;
        L7: while (true) {
          if (var7 >= this.field_w.field_k) {
            L8: {
              if ((this.field_w.field_k ^ -1) != -2) {
                if (2 != this.field_w.field_k) {
                  L9: {
                    var22 = kh.field_e[4];
                    var17 = var22;
                    var3 = var17;
                    var21 = kh.field_c[4];
                    var16 = var21;
                    var2 = var16;
                    nh.a(169, 482, -40, -1, cd.field_h, -1);
                    nh.a(169, 482, -40, 472, cd.field_h, -1);
                    if (-1 == (this.field_o & 1 << this.field_m ^ -1)) {
                      stackIn_83_0 = 0;
                      break L9;
                    } else {
                      stackIn_83_0 = 1;
                      break L9;
                    }
                  }
                  L10: {
                    L11: {
                      var7 = stackIn_83_0;
                      stackIn_86_0 = this.field_n;

                      stackIn_86_1 = -103;

                      stackIn_86_2 = var21[0];

                      if (var7 != 0) {
                        break L11;
                      } else {






                        if (0 != this.field_o) {
                          stackIn_88_0 = stackIn_86_0;
                          stackIn_88_1 = stackIn_86_1;
                          stackIn_88_2 = stackIn_86_2;
                          stackIn_88_3 = 0;
                          break L10;
                        } else {



                          break L11;
                        }
                      }
                    }
                    stackIn_88_0 = stackIn_86_0;
                    stackIn_88_1 = stackIn_86_1;
                    stackIn_88_2 = stackIn_86_2;
                    stackIn_88_3 = 1;
                    break L10;
                  }
                  om.a(stackIn_88_0, (byte) stackIn_88_1, stackIn_88_2, stackIn_88_3 != 0, this.field_w.field_l[this.field_m], var22[0], this.field_m, var7 != 0, this.field_w);
                  nh.a(169, 9, -40, -1, cd.field_h, 0 + (var22[2] + -3));
                  nh.a(169, 9, -40, 472, cd.field_h, -3 + var22[2] - 0);
                  break L8;
                } else {
                  L12: {
                    if (this.field_p) {
                      stackIn_44_0 = 0;
                      break L12;
                    } else {
                      stackIn_44_0 = 1;
                      break L12;
                    }
                  }
                  L13: {
                    var7 = stackIn_44_0;
                    if (this.field_p) {
                      if (-1 == (this.field_o ^ -1)) {
                        stackIn_50_0 = 1;
                        break L13;
                      } else {
                        stackIn_50_0 = 0;
                        break L13;
                      }
                    } else {
                      stackIn_50_0 = 1;
                      break L13;
                    }
                  }
                  L14: {
                    var8_int = stackIn_50_0;
                    if (this.field_p) {
                      stackIn_53_0 = this.field_m;
                      break L14;
                    } else {
                      stackIn_53_0 = 1;
                      break L14;
                    }
                  }
                  L15: {
                    var9 = stackIn_53_0;
                    if ((this.field_o & 1 << var9) == 0) {
                      stackIn_56_0 = 0;
                      break L15;
                    } else {
                      stackIn_56_0 = 1;
                      break L15;
                    }
                  }
                  L16: {
                    L17: {
                      var10 = stackIn_56_0;
                      stackIn_59_0 = this.field_n;

                      stackIn_59_1 = -103;

                      stackIn_59_2 = var14[0];

                      if (var8_int != 0) {
                        break L17;
                      } else {






                        if (var10 == 0) {
                          stackIn_61_0 = stackIn_59_0;
                          stackIn_61_1 = stackIn_59_1;
                          stackIn_61_2 = stackIn_59_2;
                          stackIn_61_3 = 0;
                          break L16;
                        } else {



                          break L17;
                        }
                      }
                    }
                    stackIn_61_0 = stackIn_59_0;
                    stackIn_61_1 = stackIn_59_1;
                    stackIn_61_2 = stackIn_59_2;
                    stackIn_61_3 = 1;
                    break L16;
                  }
                  L18: {
                    L19: {

                      stackIn_64_4 = this.field_w.field_l[var9];

                      stackIn_64_5 = var15[0];

                      stackIn_64_6 = var9;

                      if (var7 != 0) {
                        break L19;
                      } else {














                        if (var10 == 0) {
                          stackIn_66_0 = stackIn_61_0;
                          stackIn_66_1 = stackIn_61_1;
                          stackIn_66_2 = stackIn_61_2;
                          stackIn_66_3 = stackIn_61_3;
                          stackIn_66_4 = (j) ((Object) stackIn_64_4);
                          stackIn_66_5 = stackIn_64_5;
                          stackIn_66_6 = stackIn_64_6;
                          stackIn_66_7 = 0;
                          break L18;
                        } else {




                          stackIn_64_4 = (j) ((Object) stackIn_64_4);


                          break L19;
                        }
                      }
                    }
                    stackIn_66_0 = stackIn_61_0;
                    stackIn_66_1 = stackIn_61_1;
                    stackIn_66_2 = stackIn_61_2;
                    stackIn_66_3 = stackIn_61_3;
                    stackIn_66_4 = (j) ((Object) stackIn_64_4);
                    stackIn_66_5 = stackIn_64_5;
                    stackIn_66_6 = stackIn_64_6;
                    stackIn_66_7 = 1;
                    break L18;
                  }
                  L20: {
                    om.a(stackIn_66_0, (byte) stackIn_66_1, stackIn_66_2, stackIn_66_3 != 0, stackIn_66_4, stackIn_66_5, stackIn_66_6, stackIn_66_7 != 0, this.field_w);
                    var9 = 1 + -var9;
                    if (0 == (1 << var9 & this.field_o)) {
                      stackIn_69_0 = 0;
                      break L20;
                    } else {
                      stackIn_69_0 = 1;
                      break L20;
                    }
                  }
                  L21: {
                    L22: {
                      var10 = stackIn_69_0;
                      stackIn_72_0 = this.field_n;

                      stackIn_72_1 = -103;

                      stackIn_72_2 = var14[1];

                      if (var8_int != 0) {
                        break L22;
                      } else {






                        if (var10 == 0) {
                          stackIn_74_0 = stackIn_72_0;
                          stackIn_74_1 = stackIn_72_1;
                          stackIn_74_2 = stackIn_72_2;
                          stackIn_74_3 = 0;
                          break L21;
                        } else {



                          break L22;
                        }
                      }
                    }
                    stackIn_74_0 = stackIn_72_0;
                    stackIn_74_1 = stackIn_72_1;
                    stackIn_74_2 = stackIn_72_2;
                    stackIn_74_3 = 1;
                    break L21;
                  }
                  L23: {
                    L24: {

                      stackIn_77_4 = this.field_w.field_l[var9];

                      stackIn_77_5 = var15[1];

                      stackIn_77_6 = var9;

                      if (var7 != 0) {
                        break L24;
                      } else {














                        if (var10 == 0) {
                          stackIn_79_0 = stackIn_74_0;
                          stackIn_79_1 = stackIn_74_1;
                          stackIn_79_2 = stackIn_74_2;
                          stackIn_79_3 = stackIn_74_3;
                          stackIn_79_4 = (j) ((Object) stackIn_77_4);
                          stackIn_79_5 = stackIn_77_5;
                          stackIn_79_6 = stackIn_77_6;
                          stackIn_79_7 = 0;
                          break L23;
                        } else {




                          stackIn_77_4 = (j) ((Object) stackIn_77_4);


                          break L24;
                        }
                      }
                    }
                    stackIn_79_0 = stackIn_74_0;
                    stackIn_79_1 = stackIn_74_1;
                    stackIn_79_2 = stackIn_74_2;
                    stackIn_79_3 = stackIn_74_3;
                    stackIn_79_4 = (j) ((Object) stackIn_77_4);
                    stackIn_79_5 = stackIn_77_5;
                    stackIn_79_6 = stackIn_77_6;
                    stackIn_79_7 = 1;
                    break L23;
                  }
                  om.a(stackIn_79_0, (byte) stackIn_79_1, stackIn_79_2, stackIn_79_3 != 0, stackIn_79_4, stackIn_79_5, stackIn_79_6, stackIn_79_7 != 0, this.field_w);
                  break L8;
                }
              } else {
                L25: {
                  L26: {
                    var7_ref_j = this.field_w.field_l[0];
                    nh.a(526, 482, -40, -1, cd.field_h, -1);
                    lb.d(7, 473, 510, 7, 0, 96);
                    lb.d(524, 0, 116, 480, 0, 96);
                    nh.a(125, 482, -40, 516, cd.field_h, -1);
                    tk.a(130, this.field_w, nn.field_g, var7_ref_j, (byte) -104, 527, 10, 85);
                    nh.a(125, 9, -40, 516, cd.field_h, 137);
                    if (!r.field_A) {
                      break L26;
                    } else {
                      if (wc.field_b) {
                        break L26;
                      } else {
                        break L25;
                      }
                    }
                  }
                  ua.a(var7_ref_j, 524, 85, -68, 147, 81, this.field_w);
                  break L25;
                }
                L27: {
                  nh.a(125, 9, -40, 516, cd.field_h, 229);
                  a.a(640, this.field_w, var7_ref_j);
                  if (!r.field_A) {
                    break L27;
                  } else {
                    if (ka.a((byte) 124)) {
                      ui.a(tb.field_eb + ro.field_v, ob.field_D, 6, c.field_i, 100, 621, 1729, 340, 230, 0);
                      break L8;
                    } else {
                      break L27;
                    }
                  }
                }
                if (null == var7_ref_j.field_fb) {
                  break L8;
                } else {
                  var12 = (tp[]) null;
                  ui.a(var7_ref_j.field_fb, nn.field_g, 0, (tp[]) null, 80, 621, 1729, 340, 85, -1);
                  break L8;
                }
              }
            }
            L28: {
              if (-2 > (this.field_w.field_k ^ -1)) {
                if (((this.field_w.field_g | this.field_w.field_i) & 1 << this.field_m) != 0) {
                  break L28;
                } else {
                  v.a(var2[0], 424, false, this.field_w, this.field_m, var3[0]);
                  break L28;
                }
              } else {
                break L28;
              }
            }
            L29: {
              if (-3 != (this.field_w.field_k ^ -1)) {
                break L29;
              } else {
                if (0 != (1 << 1 + -this.field_m & (this.field_w.field_g | this.field_w.field_i))) {
                  break L29;
                } else {
                  v.a(var2[1], 424, false, this.field_w, 1 + -this.field_m, var3[1]);
                  break L29;
                }
              }
            }
            var19 = kh.field_e[this.field_w.field_k + -1];
            var6 = this.field_m;
            var18 = kh.field_c[this.field_w.field_k - 1];
            var7 = 0;
            L30: while (true) {
              if (this.field_w.field_k <= var7) {
                return;
              } else {
                L31: {
                  if (var5[var7] == 2) {
                    var20 = ul.field_k[this.field_w.field_l[var6].field_H];
                    var8 = var20;
                    var9 = ob.field_D.field_F - -ob.field_D.field_P;
                    lb.d(var18[var7], 235 - -var19[var7] + -23, 153, var9, 0, 141);
                    var8.c(-var20.field_x + (153 + var18[var7]), 0 + (-var20.field_z + var19[var7]) + 233);
                    ce.field_e.c(this.field_w.field_f[var6], var18[var7] + 4, 2 + var19[var7] + 223, 2, -1);
                    break L31;
                  } else {
                    break L31;
                  }
                }
                var6++;
                var6 = var6 % this.field_w.field_k;
                var7++;
                continue L30;
              }
            }
          } else {
            L32: {
              if ((tn.field_C ^ -1) != (var5[var7] ^ -1)) {
                gr.b(var5[var7], -28463);
                break L32;
              } else {
                break L32;
              }
            }
            pi.a((byte) 90, var6, var5[var7], var15[var7], this.field_w, var14[var7]);
            var6++;
            var6 = var6 % this.field_w.field_k;
            var7++;
            continue L7;
          }
        }
    }

    qj(String[] param0, int param1, int param2, oi param3, int[] param4, int[] param5) {
        this(false, false, param0, param1, param2, param3, param4, param5);
    }

    final void f(int param0) {
        if (!(this.field_p)) {
            throw new IllegalStateException();
        }
        k.field_h.e(-13413, 67);
        int var2 = 68 % ((param0 - -65) / 59);
    }

    qj(boolean param0, boolean param1, String[] param2, int param3, int param4, oi param5, int[] param6, int[] param7) {
        super(-1);
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var9 = null;
        int var9_int = 0;
        RuntimeException var9_ref = null;
        int var10 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        this.field_x = 0;
        this.field_s = false;
        try {
          L0: {
            L1: {
              stackIn_3_0 = this;

              if (!param1) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((qj) (this)).field_n = stackIn_4_1 != 0;
              stackIn_6_0 = this;

              if (!param0) {
                stackIn_7_0 = this;
                stackIn_7_1 = 0;
                break L2;
              } else {
                stackIn_7_0 = this;
                stackIn_7_1 = 1;
                break L2;
              }
            }
            L3: {
              ((qj) (this)).field_p = stackIn_7_1 != 0;
              this.field_o = param4;
              this.field_k = param3;
              stackIn_9_0 = this;

              if (kb.field_Yb < 2) {
                stackIn_10_0 = this;
                stackIn_10_1 = 0;
                break L3;
              } else {
                stackIn_10_0 = this;
                stackIn_10_1 = 1;
                break L3;
              }
            }
            ((qj) (this)).field_y = stackIn_10_1 != 0;
            var14 = pl.field_b;
            var13 = var14;
            var12 = var13;
            var9 = var12;
            var10 = 0;
            L4: while (true) {
              if (8 <= var10) {
                this.field_w = new ak(param2, this.field_o, param5, param6, param7);
                var9_int = 0;
                var10 = 0;
                L5: while (true) {
                  if (this.field_w.field_k <= var10) {
                    L6: {
                      stackIn_22_0 = this;

                      if (-3 == (var9_int ^ -1)) {
                        stackIn_23_0 = this;
                        stackIn_23_1 = 1;
                        break L6;
                      } else {
                        stackIn_21_0 = this;

                        if (-1 < (this.field_k ^ -1)) {
                          stackIn_23_0 = this;
                          stackIn_23_1 = 0;
                          break L6;
                        } else {
                          stackIn_23_0 = this;
                          stackIn_23_1 = this.field_k;
                          break L6;
                        }
                      }
                    }
                    L7: {
                      ((qj) (this)).field_m = stackIn_23_1;
                      if (oo.field_w != null) {
                        break L7;
                      } else {
                        oo.field_w = new fo(new int[]{(int)ue.a(false)});
                        break L7;
                      }
                    }
                    L8: {
                      km.field_i = 0;
                      to.field_k = kl.a(ta.field_e[2], 256, 0);
                      me.field_d = kl.a(ta.field_e[2], 256, 0);
                      to.field_k.f(-1);
                      me.field_d.f(-1);
                      sk.a((byte) 125, to.field_k);
                      sk.a((byte) 5, me.field_d);
                      tn.field_C = 1;
                      gr.b(tn.field_C, -28463);
                      pg.field_m = -1;
                      dj.field_b = -1;
                      if (jo.field_j != null) {
                        break L8;
                      } else {
                        jo.field_j = rd.a(cm.field_p, new String[]{""}, (byte) 103).toLowerCase();
                        ff.field_j = pn.field_j.toLowerCase();
                        break L8;
                      }
                    }
                    be.field_j = 0;
                    op.field_a = false;
                    fl.field_l = ue.a(false);
                    gq.field_Yb = param5.field_b.field_h;
                    tk.field_q = param5.a(96);
                    break L0;
                  } else {
                    L9: {
                      if ((this.field_o & 1 << var10 ^ -1) == -1) {
                        break L9;
                      } else {
                        var9_int++;
                        break L9;
                      }
                    }
                    var10++;
                    continue L5;
                  }
                }
              } else {
                var14[var10] = 0;
                var10++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var9_ref = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var9_ref);

            stackIn_31_1 = new StringBuilder().append("qj.<init>(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L10;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_34_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L11;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_37_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',');

            if (param6 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L12;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_40_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(',');

            if (param7 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L13;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L13;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_32_0), stackIn_41_2 + ')');
        }
    }

    static {
    }
}
