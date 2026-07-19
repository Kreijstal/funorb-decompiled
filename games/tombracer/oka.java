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
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_6_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        L0: {
          var9 = TombRacer.field_G ? 1 : 0;
          super.a(param0, param1, param2 ^ 0);
          if (param0) {
            if (!this.d((byte) -124)) {
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
            field_y = (jea[]) null;
            break L1;
          }
        }
        L2: {
          L3: {
            if (0 >= this.field_u) {
              break L3;
            } else {
              fieldTemp$2 = this.field_s + 1;
              this.field_s = this.field_s + 1;
              if (fieldTemp$2 == 15) {
                L4: {
                  this.field_s = 0;
                  if (var4 != 0) {
                    break L4;
                  } else {
                    this.field_u = 0;
                    if (var9 == 0) {
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
                this.field_u = this.field_u >> 2;
                if (var9 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              } else {
                break L2;
              }
            }
          }
          L5: {
            if (this.d((byte) -124)) {
              break L5;
            } else {
              L6: {
                if (param0) {
                  stackOut_19_0 = 0;
                  stackIn_20_0 = stackOut_19_0;
                  break L6;
                } else {
                  stackOut_18_0 = -30;
                  stackIn_20_0 = stackOut_18_0;
                  break L6;
                }
              }
              if ((stackIn_20_0 ^ -1) != (this.field_s ^ -1)) {
                break L5;
              } else {
                break L2;
              }
            }
          }
          L7: {
            fieldTemp$3 = this.field_s + 1;
            this.field_s = this.field_s + 1;
            if ((fieldTemp$3 ^ -1) != -31) {
              break L7;
            } else {
              this.field_s = -30;
              this.f(-9);
              break L7;
            }
          }
          if (this.field_s != 0) {
            break L2;
          } else {
            L8: {
              if (var4 != 0) {
                break L8;
              } else {
                this.field_u = 0;
                if (var9 == 0) {
                  break L2;
                } else {
                  break L8;
                }
              }
            }
            this.field_u = 64;
            break L2;
          }
        }
        L9: {
          this.field_t = 0;
          this.field_r = this.e(-18796);
          this.field_x.a(true);
          if (hf.field_b == 1) {
            var5 = 0;
            L10: while (true) {
              if (jw.field_z.length <= var5) {
                break L9;
              } else {
                if (var9 != 0) {
                  break L9;
                } else {
                  L11: {
                    if (!mca.a((byte) 6, var5)) {
                      break L11;
                    } else {
                      L12: {
                        if (bma.d(100, var5)) {
                          break L12;
                        } else {
                          if (var9 == 0) {
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      var6 = jw.field_z[var5] + (this.field_t - -(uta.field_d.a() >> 117981793));
                      var7 = this.field_r - (-hq.field_b[var5] + -(uta.field_d.c() >> -1549770655));
                      var8 = 20;
                      if (jba.field_j <= var6 + -var8) {
                        break L11;
                      } else {
                        if (var8 + var6 <= jba.field_j) {
                          break L11;
                        } else {
                          if (sta.field_B <= -var8 + var7) {
                            break L11;
                          } else {
                            if (var8 + var7 <= sta.field_B) {
                              break L11;
                            } else {
                              this.field_v = var5;
                              if (!this.field_x.a((byte) 79, var5)) {
                                this.field_x.a(var5, (byte) -109);
                                if (var9 == 0) {
                                  break L11;
                                } else {
                                  this.b(false);
                                  break L11;
                                }
                              } else {
                                this.b(false);
                                break L11;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  var5++;
                  if (var9 == 0) {
                    continue L10;
                  } else {
                    break L9;
                  }
                }
              }
            }
          } else {
            break L9;
          }
        }
    }

    final int a(byte param0, int param1) {
        if (param1 == 0) {
            return 10;
        }
        if (param0 < 111) {
            this.field_v = -113;
        }
        if (-2 != (param1 ^ -1)) {
            return aaa.a(false) + -this.field_m[param1].e(-163) - 10;
        }
        if (!(-4 != (this.field_m.length ^ -1))) {
            return aaa.a(false) + -this.field_m[param1].e(-163) >> 321283137;
        }
        return aaa.a(false) + -this.field_m[param1].e(-163) - 10;
    }

    final void a(byte param0, boolean param1) {
        int discarded$2 = 0;
        int discarded$3 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        nh var5_ref_nh = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        cc var10 = null;
        boolean stackIn_14_0 = false;
        int stackIn_29_0 = 0;
        boolean stackOut_13_0 = false;
        int stackOut_28_0 = 0;
        var9 = TombRacer.field_G ? 1 : 0;
        super.a(param0, param1);
        if (hb.field_t == rba.field_a) {
          return;
        } else {
          ik.field_h.a(this.field_t, this.field_r);
          dp.field_d.a(this.field_t, this.field_r);
          var10 = (cc) ((Object) this.field_q.f(-80));
          L0: while (true) {
            L1: {
              L2: {
                if (var10 == null) {
                  break L2;
                } else {
                  var10.a(99, this.field_t, this.field_r);
                  var10 = (cc) ((Object) this.field_q.e(121));
                  if (var9 != 0) {
                    break L1;
                  } else {
                    if (var9 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
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
            L3: while (true) {
              L4: {
                L5: {
                  if (var4 >= cb.field_i.length) {
                    break L5;
                  } else {
                    stackOut_13_0 = mca.a((byte) 6, var4);
                    stackIn_29_0 = stackOut_13_0 ? 1 : 0;
                    stackIn_14_0 = stackOut_13_0;
                    if (var9 != 0) {
                      break L4;
                    } else {
                      L6: {
                        if (!stackIn_14_0) {
                          break L6;
                        } else {
                          L7: {
                            if (!rd.b(false)) {
                              break L7;
                            } else {
                              if (!dta.field_g[var4]) {
                                var3 = 1;
                                qf.field_k[var4].a(pha.field_ub[var4] + this.field_t, dba.field_b[var4] + this.field_r, 0, -1426063361, 1);
                                if (var9 == 0) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            cb.field_i[var4].a(pha.field_ub[var4] + this.field_t, this.field_r - -dba.field_b[var4]);
                            var5_ref_nh = uta.field_d;
                            if (null == mq.field_e) {
                              break L8;
                            } else {
                              L9: {
                                if (mq.field_e.field_n[var4] != 3) {
                                  break L9;
                                } else {
                                  var5_ref_nh = je.field_E;
                                  break L9;
                                }
                              }
                              L10: {
                                if ((mq.field_e.field_n[var4] ^ -1) != -3) {
                                  break L10;
                                } else {
                                  var5_ref_nh = eu.field_a;
                                  break L10;
                                }
                              }
                              if (-2 != (mq.field_e.field_n[var4] ^ -1)) {
                                break L8;
                              } else {
                                var5_ref_nh = pq.field_a;
                                break L8;
                              }
                            }
                          }
                          var5_ref_nh.a(jw.field_z[var4] + this.field_t, this.field_r + hq.field_b[var4]);
                          break L6;
                        }
                      }
                      var4++;
                      if (var9 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                ura.a(-10985);
                this.field_x.b(this.field_r, 11327, this.field_t);
                se.f((byte) -6);
                stackOut_28_0 = aaa.a(false) >> 1887479553;
                stackIn_29_0 = stackOut_28_0;
                break L4;
              }
              L11: {
                var6 = stackIn_29_0;
                var5 = 40;
                var4 = 260;
                var7 = this.field_r - (100 + -koa.b(param0 + 28));
                kq.field_a.a(var6 - (kq.field_a.a() >> -1460351231), -(kq.field_a.c() >> -1013927935) + var7);
                discarded$2 = be.a(vj.field_d[this.field_v].toUpperCase(), 1, eda.field_f, 2431750, 8 + o.field_d.field_m, var5, 1, var7 - (var5 >> -1930522463), var6 + -(var4 >> 810653985), -1, (byte) 60, var4);
                if (rd.b(false)) {
                  L12: {
                    if (vpa.a(62)) {
                      break L12;
                    } else {
                      if (mq.field_e.field_a) {
                        break L12;
                      } else {
                        if (var3 != 0) {
                          break L12;
                        } else {
                          break L11;
                        }
                      }
                    }
                  }
                  L13: {
                    L14: {
                      var7 = koa.b(0) / 2 + this.field_r;
                      var4 = 350;
                      var5 = 100;
                      tga.field_a.c(-1442774783, var6 + -(var4 >> 1880941473), var4, -(var5 >> -1674340543) + var7, -22971, var5);
                      tga.field_a.a(var7 + -(var5 >> -1051923423), -(var4 >> 2050313441) + var6, var5, var4, -1442774783, (byte) -75);
                      tga.field_a.a(var7 - (var5 >> -1410591071) + 1, 1 + -(var4 >> 523501377) + var6, -2 + var5, var4 + -2, -1426063361, (byte) -128);
                      if (vpa.a(42)) {
                        break L14;
                      } else {
                        if (var3 != 0) {
                          var8 = qu.field_c;
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    if (!vpa.a(109)) {
                      var8 = tna.field_d;
                      break L13;
                    } else {
                      var8 = tc.field_f;
                      break L13;
                    }
                  }
                  discarded$3 = be.a(var8, 1, kn.field_p, 16777215, 16, var5, 1, var7 + -(var5 >> -356409631), 10 + (var6 - (var4 >> 1785892385)), -1, (byte) 60, -20 + var4);
                  break L11;
                } else {
                  break L11;
                }
              }
              L15: {
                if (eq.c(0)) {
                  oka.a("Unlock: Key 2-9", 16777215, kn.field_p, -1, this.field_r - -koa.b(param0 + 28) - 100, -100 + aaa.a(false), -1);
                  oka.a("Play All: Insert", 16777215, kn.field_p, -1, -80 + (this.field_r - -koa.b(0)), aaa.a(false) + -100, -1);
                  break L15;
                } else {
                  break L15;
                }
              }
              return;
            }
          }
        }
    }

    private final boolean d(byte param0) {
        if (param0 != -124) {
            this.f(-35);
        }
        return false;
    }

    final void a(byte param0) {
        L0: {
          super.a((byte) 85);
          this.field_s = -30;
          this.field_t = 0;
          this.field_r = this.e(-18796);
          this.field_x = new pfa(0, this.field_v);
          this.field_q = new vna();
          this.field_q.b((byte) -118, new cc(0, 1, 2));
          this.field_q.b((byte) -54, new cc(0, 2, 6));
          this.field_q.b((byte) -115, new cc(1, 3, 4));
          this.field_q.b((byte) -70, new cc(1, 4, ta.field_vb[0], go.field_m[0], 4, 2));
          this.field_q.b((byte) -97, new cc(2, 4, 4));
          this.field_q.b((byte) -80, new cc(4, 3, ta.field_vb[1], go.field_m[1], 2, 3));
          this.field_q.b((byte) -119, new cc(4, 5, ta.field_vb[5], go.field_m[5], 3, 2));
          this.field_q.b((byte) -88, new cc(3, 6, 4));
          this.field_q.b((byte) -92, new cc(5, 7, ta.field_vb[2], go.field_m[2], 3, 3));
          this.field_q.b((byte) -96, new cc(6, 8, 4));
          if (param0 > 78) {
            break L0;
          } else {
            this.b(true, false, 48);
            break L0;
          }
        }
        this.field_q.b((byte) -107, new cc(6, 7, ta.field_vb[3], go.field_m[3], 3, 3));
        this.field_q.b((byte) -51, new cc(7, 8, ta.field_vb[4], go.field_m[4], 1, 2));
    }

    private final void b(boolean param0) {
        boolean discarded$0 = false;
        bja.a(this.field_v, (byte) -102, 1);
        if (param0) {
            discarded$0 = this.a(-11, '￘', 77);
        }
    }

    final int g(int param0, int param1) {
        if (param1 != 30) {
            this.field_s = 3;
        }
        return koa.b(0) + -25;
    }

    final static void a(String param0, int param1, da param2, int param3, int param4, int param5, int param6) {
        try {
            param2.a(fm.a(false, param6), param3, param5, fm.a(false, param1), param4, param0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "oka.GA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    oka(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_s = -30;
        try {
            this.field_o = false;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "oka.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(int param0, byte param1) {
        if (param1 != -48) {
            this.a((byte) 114, true);
        }
        return this.a((byte) 112, param0) + this.field_m[param0].e(-163);
    }

    private final void f(int param0) {
        if (param0 != -9) {
            this.field_u = -72;
        }
    }

    final void b(boolean param0, boolean param1, int param2) {
        L0: {
          if (-1 < (param2 ^ -1)) {
            break L0;
          } else {
            if (param2 >= this.field_m.length) {
              break L0;
            } else {
              L1: {
                super.b(param0, param1, param2);
                if (!this.field_k.a(param0)) {
                  break L1;
                } else {
                  if (-22 == (this.field_m[param2].field_g ^ -1)) {
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
        int var1 = -7 % ((param0 - -15) / 53);
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
        boolean stackIn_32_0 = false;
        int stackIn_37_0 = 0;
        int stackIn_46_0 = 0;
        boolean stackIn_59_0 = false;
        int stackIn_64_0 = 0;
        int stackIn_73_0 = 0;
        boolean stackIn_86_0 = false;
        int stackIn_91_0 = 0;
        int stackIn_100_0 = 0;
        boolean stackIn_113_0 = false;
        int stackIn_118_0 = 0;
        int stackIn_127_0 = 0;
        boolean stackIn_140_0 = false;
        int stackIn_145_0 = 0;
        int stackIn_154_0 = 0;
        boolean stackIn_167_0 = false;
        int stackIn_172_0 = 0;
        int stackIn_181_0 = 0;
        boolean stackIn_194_0 = false;
        int stackIn_199_0 = 0;
        int stackIn_208_0 = 0;
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
        boolean stackOut_193_0 = false;
        int stackOut_198_0 = 0;
        int stackOut_197_0 = 0;
        int stackOut_207_0 = 0;
        boolean stackOut_166_0 = false;
        int stackOut_171_0 = 0;
        int stackOut_170_0 = 0;
        int stackOut_180_0 = 0;
        boolean stackOut_139_0 = false;
        int stackOut_144_0 = 0;
        int stackOut_143_0 = 0;
        int stackOut_153_0 = 0;
        boolean stackOut_112_0 = false;
        int stackOut_117_0 = 0;
        int stackOut_116_0 = 0;
        int stackOut_126_0 = 0;
        boolean stackOut_85_0 = false;
        int stackOut_90_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_99_0 = 0;
        boolean stackOut_58_0 = false;
        int stackOut_63_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_72_0 = 0;
        boolean stackOut_31_0 = false;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_45_0 = 0;
        L0: {
          var11 = TombRacer.field_G ? 1 : 0;
          if ((param0 ^ -1) != -97) {
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
            this.field_t = 74;
            break L2;
          }
        }
        L3: {
          if ((param0 ^ -1) == -99) {
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
        var7 = stackIn_26_0;
        if (var4 == 0) {
          if (var5 == 0) {
            if (var6 == 0) {
              if (var7 == 0) {
                if (fp.field_a != param0) {
                  if (gsa.field_j != param0) {
                    if (param0 != 84) {
                      return true;
                    } else {
                      L5: {
                        if (!this.field_x.field_g) {
                          var8 = this.field_v;
                          var9 = (cc) ((Object) this.field_q.f(-80));
                          L6: while (true) {
                            L7: {
                              L8: {
                                if (var9 == null) {
                                  break L8;
                                } else {
                                  stackOut_193_0 = var9.a(this.field_x, param0, (byte) 116);
                                  stackIn_208_0 = stackOut_193_0 ? 1 : 0;
                                  stackIn_194_0 = stackOut_193_0;
                                  if (var11 != 0) {
                                    break L7;
                                  } else {
                                    L9: {
                                      if (stackIn_194_0) {
                                        L10: {
                                          if (this.field_v == var9.field_i) {
                                            stackOut_198_0 = var9.field_g;
                                            stackIn_199_0 = stackOut_198_0;
                                            break L10;
                                          } else {
                                            stackOut_197_0 = var9.field_i;
                                            stackIn_199_0 = stackOut_197_0;
                                            break L10;
                                          }
                                        }
                                        var10 = stackIn_199_0;
                                        if (!mca.a((byte) 6, var10)) {
                                          break L9;
                                        } else {
                                          if (bma.d(96, var10)) {
                                            L11: {
                                              if (var9.b(true)) {
                                                this.field_x.a(-28562, var9.field_k << -117956528, var9.field_j << -284564720);
                                                break L11;
                                              } else {
                                                break L11;
                                              }
                                            }
                                            var8 = var10;
                                            if (var11 == 0) {
                                              break L8;
                                            } else {
                                              break L9;
                                            }
                                          } else {
                                            break L9;
                                          }
                                        }
                                      } else {
                                        break L9;
                                      }
                                    }
                                    var9 = (cc) ((Object) this.field_q.e(param2 + 115));
                                    if (var11 == 0) {
                                      continue L6;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                              }
                              stackOut_207_0 = var8 ^ -1;
                              stackIn_208_0 = stackOut_207_0;
                              break L7;
                            }
                            L12: {
                              if (stackIn_208_0 == (this.field_v ^ -1)) {
                                break L12;
                              } else {
                                this.field_v = var8;
                                this.field_x.b((byte) 58, this.field_v);
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
                                  break L5;
                                }
                              }
                            }
                            this.b(false);
                            break L5;
                          }
                        } else {
                          break L5;
                        }
                      }
                      return true;
                    }
                  } else {
                    L14: {
                      if (!this.field_x.field_g) {
                        var8 = this.field_v;
                        var9 = (cc) ((Object) this.field_q.f(-80));
                        L15: while (true) {
                          L16: {
                            L17: {
                              if (var9 == null) {
                                break L17;
                              } else {
                                stackOut_166_0 = var9.a(this.field_x, param0, (byte) 116);
                                stackIn_181_0 = stackOut_166_0 ? 1 : 0;
                                stackIn_167_0 = stackOut_166_0;
                                if (var11 != 0) {
                                  break L16;
                                } else {
                                  L18: {
                                    if (stackIn_167_0) {
                                      L19: {
                                        if (this.field_v == var9.field_i) {
                                          stackOut_171_0 = var9.field_g;
                                          stackIn_172_0 = stackOut_171_0;
                                          break L19;
                                        } else {
                                          stackOut_170_0 = var9.field_i;
                                          stackIn_172_0 = stackOut_170_0;
                                          break L19;
                                        }
                                      }
                                      var10 = stackIn_172_0;
                                      if (!mca.a((byte) 6, var10)) {
                                        break L18;
                                      } else {
                                        if (bma.d(96, var10)) {
                                          L20: {
                                            if (var9.b(true)) {
                                              this.field_x.a(-28562, var9.field_k << -117956528, var9.field_j << -284564720);
                                              break L20;
                                            } else {
                                              break L20;
                                            }
                                          }
                                          var8 = var10;
                                          if (var11 == 0) {
                                            break L17;
                                          } else {
                                            break L18;
                                          }
                                        } else {
                                          break L18;
                                        }
                                      }
                                    } else {
                                      break L18;
                                    }
                                  }
                                  var9 = (cc) ((Object) this.field_q.e(param2 + 115));
                                  if (var11 == 0) {
                                    continue L15;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                            }
                            stackOut_180_0 = var8 ^ -1;
                            stackIn_181_0 = stackOut_180_0;
                            break L16;
                          }
                          L21: {
                            if (stackIn_181_0 == (this.field_v ^ -1)) {
                              break L21;
                            } else {
                              this.field_v = var8;
                              this.field_x.b((byte) 58, this.field_v);
                              break L21;
                            }
                          }
                          L22: {
                            if (param0 == 84) {
                              break L22;
                            } else {
                              if (83 == param0) {
                                break L22;
                              } else {
                                break L14;
                              }
                            }
                          }
                          this.b(false);
                          break L14;
                        }
                      } else {
                        break L14;
                      }
                    }
                    return true;
                  }
                } else {
                  L23: {
                    if (!this.field_x.field_g) {
                      var8 = this.field_v;
                      var9 = (cc) ((Object) this.field_q.f(-80));
                      L24: while (true) {
                        L25: {
                          L26: {
                            if (var9 == null) {
                              break L26;
                            } else {
                              stackOut_139_0 = var9.a(this.field_x, param0, (byte) 116);
                              stackIn_154_0 = stackOut_139_0 ? 1 : 0;
                              stackIn_140_0 = stackOut_139_0;
                              if (var11 != 0) {
                                break L25;
                              } else {
                                L27: {
                                  if (stackIn_140_0) {
                                    L28: {
                                      if (this.field_v == var9.field_i) {
                                        stackOut_144_0 = var9.field_g;
                                        stackIn_145_0 = stackOut_144_0;
                                        break L28;
                                      } else {
                                        stackOut_143_0 = var9.field_i;
                                        stackIn_145_0 = stackOut_143_0;
                                        break L28;
                                      }
                                    }
                                    var10 = stackIn_145_0;
                                    if (!mca.a((byte) 6, var10)) {
                                      break L27;
                                    } else {
                                      if (bma.d(96, var10)) {
                                        L29: {
                                          if (var9.b(true)) {
                                            this.field_x.a(-28562, var9.field_k << -117956528, var9.field_j << -284564720);
                                            break L29;
                                          } else {
                                            break L29;
                                          }
                                        }
                                        var8 = var10;
                                        if (var11 == 0) {
                                          break L26;
                                        } else {
                                          break L27;
                                        }
                                      } else {
                                        break L27;
                                      }
                                    }
                                  } else {
                                    break L27;
                                  }
                                }
                                var9 = (cc) ((Object) this.field_q.e(param2 + 115));
                                if (var11 == 0) {
                                  continue L24;
                                } else {
                                  break L26;
                                }
                              }
                            }
                          }
                          stackOut_153_0 = var8 ^ -1;
                          stackIn_154_0 = stackOut_153_0;
                          break L25;
                        }
                        L30: {
                          if (stackIn_154_0 == (this.field_v ^ -1)) {
                            break L30;
                          } else {
                            this.field_v = var8;
                            this.field_x.b((byte) 58, this.field_v);
                            break L30;
                          }
                        }
                        L31: {
                          if (param0 == 84) {
                            break L31;
                          } else {
                            if (83 == param0) {
                              break L31;
                            } else {
                              break L23;
                            }
                          }
                        }
                        this.b(false);
                        break L23;
                      }
                    } else {
                      break L23;
                    }
                  }
                  return true;
                }
              } else {
                L32: {
                  if (!this.field_x.field_g) {
                    var8 = this.field_v;
                    var9 = (cc) ((Object) this.field_q.f(-80));
                    L33: while (true) {
                      L34: {
                        L35: {
                          if (var9 == null) {
                            break L35;
                          } else {
                            stackOut_112_0 = var9.a(this.field_x, param0, (byte) 116);
                            stackIn_127_0 = stackOut_112_0 ? 1 : 0;
                            stackIn_113_0 = stackOut_112_0;
                            if (var11 != 0) {
                              break L34;
                            } else {
                              L36: {
                                if (stackIn_113_0) {
                                  L37: {
                                    if (this.field_v == var9.field_i) {
                                      stackOut_117_0 = var9.field_g;
                                      stackIn_118_0 = stackOut_117_0;
                                      break L37;
                                    } else {
                                      stackOut_116_0 = var9.field_i;
                                      stackIn_118_0 = stackOut_116_0;
                                      break L37;
                                    }
                                  }
                                  var10 = stackIn_118_0;
                                  if (!mca.a((byte) 6, var10)) {
                                    break L36;
                                  } else {
                                    if (bma.d(96, var10)) {
                                      L38: {
                                        if (var9.b(true)) {
                                          this.field_x.a(-28562, var9.field_k << -117956528, var9.field_j << -284564720);
                                          break L38;
                                        } else {
                                          break L38;
                                        }
                                      }
                                      var8 = var10;
                                      if (var11 == 0) {
                                        break L35;
                                      } else {
                                        break L36;
                                      }
                                    } else {
                                      break L36;
                                    }
                                  }
                                } else {
                                  break L36;
                                }
                              }
                              var9 = (cc) ((Object) this.field_q.e(param2 + 115));
                              if (var11 == 0) {
                                continue L33;
                              } else {
                                break L35;
                              }
                            }
                          }
                        }
                        stackOut_126_0 = var8 ^ -1;
                        stackIn_127_0 = stackOut_126_0;
                        break L34;
                      }
                      L39: {
                        if (stackIn_127_0 == (this.field_v ^ -1)) {
                          break L39;
                        } else {
                          this.field_v = var8;
                          this.field_x.b((byte) 58, this.field_v);
                          break L39;
                        }
                      }
                      L40: {
                        if (param0 == 84) {
                          break L40;
                        } else {
                          if (83 == param0) {
                            break L40;
                          } else {
                            break L32;
                          }
                        }
                      }
                      this.b(false);
                      break L32;
                    }
                  } else {
                    break L32;
                  }
                }
                return true;
              }
            } else {
              L41: {
                if (!this.field_x.field_g) {
                  var8 = this.field_v;
                  var9 = (cc) ((Object) this.field_q.f(-80));
                  L42: while (true) {
                    L43: {
                      L44: {
                        if (var9 == null) {
                          break L44;
                        } else {
                          stackOut_85_0 = var9.a(this.field_x, param0, (byte) 116);
                          stackIn_100_0 = stackOut_85_0 ? 1 : 0;
                          stackIn_86_0 = stackOut_85_0;
                          if (var11 != 0) {
                            break L43;
                          } else {
                            L45: {
                              if (stackIn_86_0) {
                                L46: {
                                  if (this.field_v == var9.field_i) {
                                    stackOut_90_0 = var9.field_g;
                                    stackIn_91_0 = stackOut_90_0;
                                    break L46;
                                  } else {
                                    stackOut_89_0 = var9.field_i;
                                    stackIn_91_0 = stackOut_89_0;
                                    break L46;
                                  }
                                }
                                var10 = stackIn_91_0;
                                if (!mca.a((byte) 6, var10)) {
                                  break L45;
                                } else {
                                  if (bma.d(96, var10)) {
                                    L47: {
                                      if (var9.b(true)) {
                                        this.field_x.a(-28562, var9.field_k << -117956528, var9.field_j << -284564720);
                                        break L47;
                                      } else {
                                        break L47;
                                      }
                                    }
                                    var8 = var10;
                                    if (var11 == 0) {
                                      break L44;
                                    } else {
                                      break L45;
                                    }
                                  } else {
                                    break L45;
                                  }
                                }
                              } else {
                                break L45;
                              }
                            }
                            var9 = (cc) ((Object) this.field_q.e(param2 + 115));
                            if (var11 == 0) {
                              continue L42;
                            } else {
                              break L44;
                            }
                          }
                        }
                      }
                      stackOut_99_0 = var8 ^ -1;
                      stackIn_100_0 = stackOut_99_0;
                      break L43;
                    }
                    L48: {
                      if (stackIn_100_0 == (this.field_v ^ -1)) {
                        break L48;
                      } else {
                        this.field_v = var8;
                        this.field_x.b((byte) 58, this.field_v);
                        break L48;
                      }
                    }
                    L49: {
                      if (param0 == 84) {
                        break L49;
                      } else {
                        if (83 == param0) {
                          break L49;
                        } else {
                          break L41;
                        }
                      }
                    }
                    this.b(false);
                    break L41;
                  }
                } else {
                  break L41;
                }
              }
              return true;
            }
          } else {
            L50: {
              if (!this.field_x.field_g) {
                var8 = this.field_v;
                var9 = (cc) ((Object) this.field_q.f(-80));
                L51: while (true) {
                  L52: {
                    L53: {
                      if (var9 == null) {
                        break L53;
                      } else {
                        stackOut_58_0 = var9.a(this.field_x, param0, (byte) 116);
                        stackIn_73_0 = stackOut_58_0 ? 1 : 0;
                        stackIn_59_0 = stackOut_58_0;
                        if (var11 != 0) {
                          break L52;
                        } else {
                          L54: {
                            if (stackIn_59_0) {
                              L55: {
                                if (this.field_v == var9.field_i) {
                                  stackOut_63_0 = var9.field_g;
                                  stackIn_64_0 = stackOut_63_0;
                                  break L55;
                                } else {
                                  stackOut_62_0 = var9.field_i;
                                  stackIn_64_0 = stackOut_62_0;
                                  break L55;
                                }
                              }
                              var10 = stackIn_64_0;
                              if (!mca.a((byte) 6, var10)) {
                                break L54;
                              } else {
                                if (bma.d(96, var10)) {
                                  L56: {
                                    if (var9.b(true)) {
                                      this.field_x.a(-28562, var9.field_k << -117956528, var9.field_j << -284564720);
                                      break L56;
                                    } else {
                                      break L56;
                                    }
                                  }
                                  var8 = var10;
                                  if (var11 == 0) {
                                    break L53;
                                  } else {
                                    break L54;
                                  }
                                } else {
                                  break L54;
                                }
                              }
                            } else {
                              break L54;
                            }
                          }
                          var9 = (cc) ((Object) this.field_q.e(param2 + 115));
                          if (var11 == 0) {
                            continue L51;
                          } else {
                            break L53;
                          }
                        }
                      }
                    }
                    stackOut_72_0 = var8 ^ -1;
                    stackIn_73_0 = stackOut_72_0;
                    break L52;
                  }
                  L57: {
                    if (stackIn_73_0 == (this.field_v ^ -1)) {
                      break L57;
                    } else {
                      this.field_v = var8;
                      this.field_x.b((byte) 58, this.field_v);
                      break L57;
                    }
                  }
                  L58: {
                    if (param0 == 84) {
                      break L58;
                    } else {
                      if (83 == param0) {
                        break L58;
                      } else {
                        break L50;
                      }
                    }
                  }
                  this.b(false);
                  break L50;
                }
              } else {
                break L50;
              }
            }
            return true;
          }
        } else {
          L59: {
            if (!this.field_x.field_g) {
              var8 = this.field_v;
              var9 = (cc) ((Object) this.field_q.f(-80));
              L60: while (true) {
                L61: {
                  L62: {
                    if (var9 == null) {
                      break L62;
                    } else {
                      stackOut_31_0 = var9.a(this.field_x, param0, (byte) 116);
                      stackIn_46_0 = stackOut_31_0 ? 1 : 0;
                      stackIn_32_0 = stackOut_31_0;
                      if (var11 != 0) {
                        break L61;
                      } else {
                        L63: {
                          if (stackIn_32_0) {
                            L64: {
                              if (this.field_v == var9.field_i) {
                                stackOut_36_0 = var9.field_g;
                                stackIn_37_0 = stackOut_36_0;
                                break L64;
                              } else {
                                stackOut_35_0 = var9.field_i;
                                stackIn_37_0 = stackOut_35_0;
                                break L64;
                              }
                            }
                            var10 = stackIn_37_0;
                            if (!mca.a((byte) 6, var10)) {
                              break L63;
                            } else {
                              if (bma.d(96, var10)) {
                                L65: {
                                  if (var9.b(true)) {
                                    this.field_x.a(-28562, var9.field_k << -117956528, var9.field_j << -284564720);
                                    break L65;
                                  } else {
                                    break L65;
                                  }
                                }
                                var8 = var10;
                                if (var11 == 0) {
                                  break L62;
                                } else {
                                  break L63;
                                }
                              } else {
                                break L63;
                              }
                            }
                          } else {
                            break L63;
                          }
                        }
                        var9 = (cc) ((Object) this.field_q.e(param2 + 115));
                        if (var11 == 0) {
                          continue L60;
                        } else {
                          break L62;
                        }
                      }
                    }
                  }
                  stackOut_45_0 = var8 ^ -1;
                  stackIn_46_0 = stackOut_45_0;
                  break L61;
                }
                L66: {
                  if (stackIn_46_0 == (this.field_v ^ -1)) {
                    break L66;
                  } else {
                    this.field_v = var8;
                    this.field_x.b((byte) 58, this.field_v);
                    break L66;
                  }
                }
                L67: {
                  if (param0 == 84) {
                    break L67;
                  } else {
                    if (83 == param0) {
                      break L67;
                    } else {
                      break L59;
                    }
                  }
                }
                this.b(false);
                break L59;
              }
            } else {
              break L59;
            }
          }
          return true;
        }
    }

    private final int e(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var2 = koa.b(0);
          if (param0 == -18796) {
            break L0;
          } else {
            this.field_r = -91;
            break L0;
          }
        }
        if (0 <= this.field_s) {
          if (this.field_u > 0) {
            return this.field_s * ((-this.field_s + 15) * -this.field_u) / 225;
          } else {
            var3 = this.field_s;
            return var3 * var2 * var3 / 900;
          }
        } else {
          var3 = 30 + this.field_s;
          return -var2 + var3 * var3 * var2 / 900;
        }
    }

    final static void b(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var6 = TombRacer.field_G ? 1 : 0;
            var2 = 0;
            var3 = tl.field_r;
            if (5 <= var3) {
              break L1;
            } else {
              var2 = 8192 * var3 * var3 / 1100;
              if (var6 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if ((var3 ^ -1) > -106) {
              break L2;
            } else {
              if (-121 >= (var3 ^ -1)) {
                break L0;
              } else {
                var3 = 120 - var3;
                var2 = 8192 - 8192 * var3 * var3 / 3300;
                if (var6 == 0) {
                  break L0;
                } else {
                  break L2;
                }
              }
            }
          }
          var2 = (-40960 + var3 * 16384) / 220;
          break L0;
        }
        L3: {
          var4 = 1;
          var5 = 0;
          if (param0 >= 6) {
            break L3;
          } else {
            oka.b((byte) 90, -70);
            break L3;
          }
        }
        L4: {
          if (param1 != 1) {
            break L4;
          } else {
            var5 = 1;
            break L4;
          }
        }
        L5: {
          if ((param1 ^ -1) != -4) {
            break L5;
          } else {
            var4 = -1;
            break L5;
          }
        }
        L6: {
          if ((param1 ^ -1) == -5) {
            var5 = 1;
            var4 = 1;
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          if ((param1 ^ -1) != -6) {
            break L7;
          } else {
            var4 = -1;
            var5 = 1;
            break L7;
          }
        }
        L8: {
          if (-7 == (param1 ^ -1)) {
            var4 = 1;
            var5 = -1;
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          L10: {
            if ((param1 ^ -1) == -8) {
              break L10;
            } else {
              if (-9 != (param1 ^ -1)) {
                break L9;
              } else {
                break L10;
              }
            }
          }
          var5 = -1;
          var4 = -1;
          break L9;
        }
        L11: {
          if (param1 == 11) {
            var4 = -1;
            break L11;
          } else {
            break L11;
          }
        }
        L12: {
          if (12 == param1) {
            var4 = -1;
            var5 = -1;
            break L12;
          } else {
            break L12;
          }
        }
        L13: {
          if ((param1 ^ -1) != -14) {
            break L13;
          } else {
            var4 = 1;
            var5 = -1;
            break L13;
          }
        }
        L14: {
          if (param1 != 14) {
            break L14;
          } else {
            var5 = 1;
            var4 = -1;
            break L14;
          }
        }
        L15: {
          if (15 == param1) {
            var4 = 1;
            var5 = 1;
            break L15;
          } else {
            break L15;
          }
        }
        nba.field_a = jl.a(var5 * var2, var2 * var4, 0);
    }

    static {
        field_z = -1;
        field_A = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
    }
}
