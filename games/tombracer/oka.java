/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oka extends wv {
    private pfa field_x;
    private int field_r;
    static int field_z;
    private int field_v;
    private int field_u;
    static jea field_w;
    private int field_s;
    private int field_t;
    private vna field_q;
    static jea[] field_y;
    static String[] field_A;

    final void a(boolean param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_6_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        L0: {
          var9 = TombRacer.field_G ? 1 : 0;
          super.a(param0, param1, param2);
          if (param0) {
            int discarded$6 = -124;
            if (!this.d()) {
              stackOut_4_0 = 1;
              stackIn_6_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_6_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 0;
            stackIn_6_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var4 = stackIn_6_0;
          if (param2 == 15283) {
            break L1;
          } else {
            field_y = null;
            break L1;
          }
        }
        L2: {
          if (0 >= ((oka) this).field_u) {
            L3: {
              int discarded$7 = -124;
              if (this.d()) {
                break L3;
              } else {
                L4: {
                  if (param0) {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    break L4;
                  } else {
                    stackOut_16_0 = -30;
                    stackIn_18_0 = stackOut_16_0;
                    break L4;
                  }
                }
                if (~stackIn_18_0 != ~((oka) this).field_s) {
                  break L3;
                } else {
                  break L2;
                }
              }
            }
            L5: {
              int fieldTemp$8 = ((oka) this).field_s + 1;
              ((oka) this).field_s = ((oka) this).field_s + 1;
              if (fieldTemp$8 != 30) {
                break L5;
              } else {
                ((oka) this).field_s = -30;
                int discarded$9 = -9;
                this.f();
                break L5;
              }
            }
            if (((oka) this).field_s != 0) {
              break L2;
            } else {
              if (var4 != 0) {
                ((oka) this).field_u = 64;
                break L2;
              } else {
                ((oka) this).field_u = 0;
                break L2;
              }
            }
          } else {
            int fieldTemp$10 = ((oka) this).field_s + 1;
            ((oka) this).field_s = ((oka) this).field_s + 1;
            if (fieldTemp$10 == 15) {
              ((oka) this).field_s = 0;
              if (var4 != 0) {
                ((oka) this).field_u = ((oka) this).field_u >> 2;
                break L2;
              } else {
                ((oka) this).field_u = 0;
                break L2;
              }
            } else {
              break L2;
            }
          }
        }
        L6: {
          ((oka) this).field_t = 0;
          int discarded$11 = -18796;
          ((oka) this).field_r = this.e();
          ((oka) this).field_x.a(true);
          if (hf.field_b == 1) {
            var5 = 0;
            L7: while (true) {
              if (jw.field_z.length <= var5) {
                break L6;
              } else {
                if (mca.a((byte) 6, var5)) {
                  if (bma.d(100, var5)) {
                    var6 = jw.field_z[var5] + (((oka) this).field_t - -(uta.field_d.a() >> 1));
                    var7 = ((oka) this).field_r - (-hq.field_b[var5] + -(uta.field_d.c() >> 1));
                    var8 = 20;
                    if (jba.field_j > var6 + -var8) {
                      if (var8 + var6 > jba.field_j) {
                        if (sta.field_B > -var8 + var7) {
                          if (var8 + var7 > sta.field_B) {
                            ((oka) this).field_v = var5;
                            if (((oka) this).field_x.a((byte) 79, var5)) {
                              this.b(false);
                              var5++;
                              continue L7;
                            } else {
                              ((oka) this).field_x.a(var5, (byte) -109);
                              var5++;
                              continue L7;
                            }
                          } else {
                            var5++;
                            continue L7;
                          }
                        } else {
                          var5++;
                          continue L7;
                        }
                      } else {
                        var5++;
                        continue L7;
                      }
                    } else {
                      var5++;
                      continue L7;
                    }
                  } else {
                    var5++;
                    continue L7;
                  }
                } else {
                  var5++;
                  continue L7;
                }
              }
            }
          } else {
            break L6;
          }
        }
    }

    final int a(byte param0, int param1) {
        if (param1 == 0) {
            return 10;
        }
        if (param0 < 111) {
            ((oka) this).field_v = -113;
        }
        if (param1 == 1) {
            if (!(((oka) this).field_m.length != 3)) {
                return aaa.a(false) + -((oka) this).field_m[param1].e(-163) >> 1;
            }
        }
        return aaa.a(false) + -((oka) this).field_m[param1].e(-163) - 10;
    }

    final void a(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        nh var5_ref_nh = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        cc var10 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        super.a(param0, param1);
        if ((Object) (Object) hb.field_t == (Object) (Object) rba.field_a) {
          return;
        } else {
          ik.field_h.a(((oka) this).field_t, ((oka) this).field_r);
          dp.field_d.a(((oka) this).field_t, ((oka) this).field_r);
          var10 = (cc) (Object) ((oka) this).field_q.f(-80);
          L0: while (true) {
            if (var10 == null) {
              L1: {
                if (mq.field_e != null) {
                  break L1;
                } else {
                  if (vpa.a(param0 + 119)) {
                    break L1;
                  } else {
                    return;
                  }
                }
              }
              var3 = 0;
              var4 = 0;
              L2: while (true) {
                if (var4 >= cb.field_i.length) {
                  L3: {
                    ura.a(-10985);
                    ((oka) this).field_x.b(((oka) this).field_r, 11327, ((oka) this).field_t);
                    int discarded$4 = -6;
                    se.f();
                    var6 = aaa.a(false) >> 1;
                    var5 = 40;
                    var4 = 260;
                    var7 = ((oka) this).field_r - (100 + -koa.b(param0 + 28));
                    kq.field_a.a(var6 - (kq.field_a.a() >> 1), -(kq.field_a.c() >> 1) + var7);
                    int discarded$5 = be.a(vj.field_d[((oka) this).field_v].toUpperCase(), 1, eda.field_f, 2431750, 8 + o.field_d.field_m, var5, 1, var7 - (var5 >> 1), var6 + -(var4 >> 1), -1, (byte) 60, var4);
                    if (rd.b(false)) {
                      L4: {
                        if (vpa.a(62)) {
                          break L4;
                        } else {
                          if (mq.field_e.field_a) {
                            break L4;
                          } else {
                            if (var3 != 0) {
                              break L4;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      L5: {
                        L6: {
                          var7 = koa.b(0) / 2 + ((oka) this).field_r;
                          var4 = 350;
                          var5 = 100;
                          tga.field_a.c(-1442774783, var6 + -(var4 >> 1), var4, -(var5 >> 1) + var7, -22971, var5);
                          tga.field_a.a(var7 + -(var5 >> 1), -(var4 >> 1) + var6, var5, var4, -1442774783, (byte) -75);
                          tga.field_a.a(var7 - (var5 >> 1) + 1, 1 + -(var4 >> 1) + var6, -2 + var5, var4 + -2, -1426063361, (byte) -128);
                          if (vpa.a(42)) {
                            break L6;
                          } else {
                            if (var3 != 0) {
                              var8 = qu.field_c;
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        if (!vpa.a(109)) {
                          var8 = tna.field_d;
                          break L5;
                        } else {
                          var8 = tc.field_f;
                          break L5;
                        }
                      }
                      int discarded$6 = be.a(var8, 1, kn.field_p, 16777215, 16, var5, 1, var7 + -(var5 >> 1), 10 + (var6 - (var4 >> 1)), -1, (byte) 60, -20 + var4);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L7: {
                    int discarded$7 = 0;
                    if (eq.c()) {
                      oka.a("Unlock: Key 2-9", 16777215, kn.field_p, -1, ((oka) this).field_r - -koa.b(param0 + 28) - 100, -100 + aaa.a(false), -1);
                      oka.a("Play All: Insert", 16777215, kn.field_p, -1, -80 + (((oka) this).field_r - -koa.b(0)), aaa.a(false) + -100, -1);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  return;
                } else {
                  if (mca.a((byte) 6, var4)) {
                    L8: {
                      if (!rd.b(false)) {
                        break L8;
                      } else {
                        if (!dta.field_g[var4]) {
                          var3 = 1;
                          qf.field_k[var4].a(pha.field_ub[var4] + ((oka) this).field_t, dba.field_b[var4] + ((oka) this).field_r, 0, -1426063361, 1);
                          var4++;
                          continue L2;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      cb.field_i[var4].a(pha.field_ub[var4] + ((oka) this).field_t, ((oka) this).field_r - -dba.field_b[var4]);
                      var5_ref_nh = uta.field_d;
                      if (null == mq.field_e) {
                        break L9;
                      } else {
                        L10: {
                          if (mq.field_e.field_n[var4] != 3) {
                            break L10;
                          } else {
                            var5_ref_nh = je.field_E;
                            break L10;
                          }
                        }
                        L11: {
                          if (mq.field_e.field_n[var4] != -3) {
                            break L11;
                          } else {
                            var5_ref_nh = eu.field_a;
                            break L11;
                          }
                        }
                        if (-2 != mq.field_e.field_n[var4]) {
                          break L9;
                        } else {
                          var5_ref_nh = pq.field_a;
                          break L9;
                        }
                      }
                    }
                    var5_ref_nh.a(jw.field_z[var4] + ((oka) this).field_t, ((oka) this).field_r + hq.field_b[var4]);
                    var4++;
                    continue L2;
                  } else {
                    var4++;
                    continue L2;
                  }
                }
              }
            } else {
              var10.a(99, ((oka) this).field_t, ((oka) this).field_r);
              var10 = (cc) (Object) ((oka) this).field_q.e(121);
              continue L0;
            }
          }
        }
    }

    private final boolean d() {
        return false;
    }

    final void a(byte param0) {
        L0: {
          super.a((byte) 85);
          ((oka) this).field_s = -30;
          ((oka) this).field_t = 0;
          int discarded$1 = -18796;
          ((oka) this).field_r = this.e();
          ((oka) this).field_x = new pfa(0, ((oka) this).field_v);
          ((oka) this).field_q = new vna();
          ((oka) this).field_q.b((byte) -118, (vg) (Object) new cc(0, 1, 2));
          ((oka) this).field_q.b((byte) -54, (vg) (Object) new cc(0, 2, 6));
          ((oka) this).field_q.b((byte) -115, (vg) (Object) new cc(1, 3, 4));
          ((oka) this).field_q.b((byte) -70, (vg) (Object) new cc(1, 4, ta.field_vb[0], go.field_m[0], 4, 2));
          ((oka) this).field_q.b((byte) -97, (vg) (Object) new cc(2, 4, 4));
          ((oka) this).field_q.b((byte) -80, (vg) (Object) new cc(4, 3, ta.field_vb[1], go.field_m[1], 2, 3));
          ((oka) this).field_q.b((byte) -119, (vg) (Object) new cc(4, 5, ta.field_vb[5], go.field_m[5], 3, 2));
          ((oka) this).field_q.b((byte) -88, (vg) (Object) new cc(3, 6, 4));
          ((oka) this).field_q.b((byte) -92, (vg) (Object) new cc(5, 7, ta.field_vb[2], go.field_m[2], 3, 3));
          ((oka) this).field_q.b((byte) -96, (vg) (Object) new cc(6, 8, 4));
          if (param0 > 78) {
            break L0;
          } else {
            ((oka) this).b(true, false, 48);
            break L0;
          }
        }
        ((oka) this).field_q.b((byte) -107, (vg) (Object) new cc(6, 7, ta.field_vb[3], go.field_m[3], 3, 3));
        ((oka) this).field_q.b((byte) -51, (vg) (Object) new cc(7, 8, ta.field_vb[4], go.field_m[4], 1, 2));
    }

    private final void b(boolean param0) {
        bja.a(((oka) this).field_v, (byte) -102, 1);
    }

    final int g(int param0, int param1) {
        if (param1 != 30) {
            ((oka) this).field_s = 3;
        }
        return koa.b(0) + -25;
    }

    final static void a(String param0, int param1, da param2, int param3, int param4, int param5, int param6) {
        try {
            param2.a(fm.a(false, param6), param3, param5, fm.a(false, param1), param4, param0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "oka.GA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    oka(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
        ((oka) this).field_s = -30;
        try {
            ((oka) this).field_o = false;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "oka.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(int param0, byte param1) {
        if (param1 != -48) {
            ((oka) this).a((byte) 114, true);
        }
        return ((oka) this).a((byte) 112, param0) + ((oka) this).field_m[param0].e(-163);
    }

    private final void f() {
    }

    final void b(boolean param0, boolean param1, int param2) {
        L0: {
          if (param2 < 0) {
            break L0;
          } else {
            if (param2 >= ((oka) this).field_m.length) {
              break L0;
            } else {
              L1: {
                super.b(param0, param1, param2);
                if (!((oka) this).field_k.a(param0)) {
                  break L1;
                } else {
                  if (((oka) this).field_m[param2].field_g == 21) {
                    this.b(false);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              return;
            }
          }
        }
    }

    public static void d(int param0) {
        int var1 = 0;
        field_w = null;
        field_y = null;
        field_A = null;
    }

    final boolean a(int param0, char param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        cc var9 = null;
        int var10 = 0;
        int var11 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_43_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        L0: {
          var11 = TombRacer.field_G ? 1 : 0;
          if (param0 != 96) {
            if (param0 == kda.field_hd) {
              stackOut_4_0 = 1;
              stackIn_6_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_6_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 1;
            stackIn_6_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var4 = stackIn_6_0;
          if (97 != param0) {
            if (param0 == mf.field_a) {
              stackOut_10_0 = 1;
              stackIn_12_0 = stackOut_10_0;
              break L1;
            } else {
              stackOut_9_0 = 0;
              stackIn_12_0 = stackOut_9_0;
              break L1;
            }
          } else {
            stackOut_7_0 = 1;
            stackIn_12_0 = stackOut_7_0;
            break L1;
          }
        }
        L2: {
          var5 = stackIn_12_0;
          if (param2 == 1) {
            break L2;
          } else {
            ((oka) this).field_t = 74;
            break L2;
          }
        }
        L3: {
          if (param0 == 98) {
            stackOut_18_0 = 1;
            stackIn_20_0 = stackOut_18_0;
            break L3;
          } else {
            if (param0 == mi.field_k) {
              stackOut_17_0 = 1;
              stackIn_20_0 = stackOut_17_0;
              break L3;
            } else {
              stackOut_16_0 = 0;
              stackIn_20_0 = stackOut_16_0;
              break L3;
            }
          }
        }
        L4: {
          var6 = stackIn_20_0;
          if (99 != param0) {
            if (param0 == fp.field_a) {
              stackOut_24_0 = 1;
              stackIn_26_0 = stackOut_24_0;
              break L4;
            } else {
              stackOut_23_0 = 0;
              stackIn_26_0 = stackOut_23_0;
              break L4;
            }
          } else {
            stackOut_21_0 = 1;
            stackIn_26_0 = stackOut_21_0;
            break L4;
          }
        }
        L5: {
          var7 = stackIn_26_0;
          if (var4 != 0) {
            break L5;
          } else {
            if (var5 != 0) {
              break L5;
            } else {
              if (var6 != 0) {
                break L5;
              } else {
                if (var7 != 0) {
                  break L5;
                } else {
                  if (fp.field_a == param0) {
                    break L5;
                  } else {
                    if (gsa.field_j == param0) {
                      break L5;
                    } else {
                      if (param0 == 84) {
                        break L5;
                      } else {
                        return true;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        L6: {
          if (!((oka) this).field_x.field_g) {
            var8 = ((oka) this).field_v;
            var9 = (cc) (Object) ((oka) this).field_q.f(-80);
            L7: while (true) {
              L8: {
                if (var9 == null) {
                  break L8;
                } else {
                  L9: {
                    if (var9.a(((oka) this).field_x, param0, (byte) 116)) {
                      L10: {
                        if (((oka) this).field_v == var9.field_i) {
                          stackOut_42_0 = var9.field_g;
                          stackIn_43_0 = stackOut_42_0;
                          break L10;
                        } else {
                          stackOut_41_0 = var9.field_i;
                          stackIn_43_0 = stackOut_41_0;
                          break L10;
                        }
                      }
                      var10 = stackIn_43_0;
                      if (!mca.a((byte) 6, var10)) {
                        break L9;
                      } else {
                        if (bma.d(96, var10)) {
                          L11: {
                            if (var9.b(true)) {
                              ((oka) this).field_x.a(-28562, var9.field_k << 16, var9.field_j << 16);
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          var8 = var10;
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    } else {
                      break L9;
                    }
                  }
                  var9 = (cc) (Object) ((oka) this).field_q.e(param2 + 115);
                  continue L7;
                }
              }
              L12: {
                if (var8 == ((oka) this).field_v) {
                  break L12;
                } else {
                  ((oka) this).field_v = var8;
                  ((oka) this).field_x.b((byte) 58, ((oka) this).field_v);
                  break L12;
                }
              }
              L13: {
                if (param0 == 84) {
                  break L13;
                } else {
                  if (83 == param0) {
                    break L13;
                  } else {
                    break L6;
                  }
                }
              }
              this.b(false);
              break L6;
            }
          } else {
            break L6;
          }
        }
        return true;
    }

    private final int e() {
        int var3 = 0;
        int var2 = koa.b(0);
        if (0 <= ((oka) this).field_s) {
            if (((oka) this).field_u > 0) {
                return ((oka) this).field_s * ((-((oka) this).field_s + 15) * -((oka) this).field_u) / 225;
            }
            var3 = ((oka) this).field_s;
            return var3 * var2 * var3 / 900;
        }
        var3 = 30 + ((oka) this).field_s;
        return -var2 + var3 * var3 * var2 / 900;
    }

    final static void b(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = TombRacer.field_G ? 1 : 0;
          var2 = 0;
          var3 = tl.field_r;
          if (5 <= var3) {
            if (var3 < 105) {
              var2 = (-40960 + var3 * 16384) / 220;
              break L0;
            } else {
              if (var3 >= 120) {
                break L0;
              } else {
                var3 = 120 - var3;
                var2 = 8192 - 8192 * var3 * var3 / 3300;
                break L0;
              }
            }
          } else {
            var2 = 8192 * var3 * var3 / 1100;
            break L0;
          }
        }
        L1: {
          var4 = 1;
          var5 = 0;
          if (param0 >= 6) {
            break L1;
          } else {
            oka.b((byte) 90, -70);
            break L1;
          }
        }
        L2: {
          if (param1 != 1) {
            break L2;
          } else {
            var5 = 1;
            break L2;
          }
        }
        L3: {
          if (param1 != 3) {
            break L3;
          } else {
            var4 = -1;
            break L3;
          }
        }
        L4: {
          if (param1 == 4) {
            var5 = 1;
            var4 = 1;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (param1 != 5) {
            break L5;
          } else {
            var4 = -1;
            var5 = 1;
            break L5;
          }
        }
        L6: {
          if (param1 == 6) {
            var4 = 1;
            var5 = -1;
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          L8: {
            if (param1 == 7) {
              break L8;
            } else {
              if (param1 != 8) {
                break L7;
              } else {
                break L8;
              }
            }
          }
          var5 = -1;
          var4 = -1;
          break L7;
        }
        L9: {
          if (param1 == 11) {
            var4 = -1;
            break L9;
          } else {
            break L9;
          }
        }
        L10: {
          if (12 == param1) {
            var4 = -1;
            var5 = -1;
            break L10;
          } else {
            break L10;
          }
        }
        L11: {
          if (param1 != 13) {
            break L11;
          } else {
            var4 = 1;
            var5 = -1;
            break L11;
          }
        }
        L12: {
          if (param1 != 14) {
            break L12;
          } else {
            var5 = 1;
            var4 = -1;
            break L12;
          }
        }
        L13: {
          if (15 == param1) {
            var4 = 1;
            var5 = 1;
            break L13;
          } else {
            break L13;
          }
        }
        int discarded$1 = 0;
        nba.field_a = jl.a(var5 * var2, var2 * var4);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = -1;
        field_A = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
    }
}
