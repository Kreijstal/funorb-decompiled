/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li {
    static fl field_g;
    private byte[] field_f;
    private long[] field_k;
    static oh[] field_l;
    static int field_b;
    private long[] field_h;
    private int field_j;
    static a field_a;
    private int field_e;
    private long[] field_d;
    private byte[] field_n;
    static int field_o;
    private long[] field_c;
    private long[] field_i;
    static int[] field_m;

    final static void a(int param0, int param1, int param2, int param3, boolean param4, boolean param5, boolean param6, boolean param7, int param8, boolean param9) {
        int var11 = 0;
        L0: {
          var11 = TetraLink.field_J;
          if (param6) {
            break L0;
          } else {
            L1: {
              if (ra.field_f != cf.field_n) {
                break L1;
              } else {
                if (ra.field_e == bk.field_c) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (pk.field_O.field_j != ra.field_e) {
              break L0;
            } else {
              if (pk.field_O.field_h == ra.field_f) {
                if (null != qb.field_N) {
                  cc.a(false, true);
                  break L0;
                } else {
                  if (null == qe.field_a) {
                    db.a(5);
                    break L0;
                  } else {
                    cc.a(true, true);
                    break L0;
                  }
                }
              } else {
                break L0;
              }
            }
          }
        }
        L2: {
          if (param6) {
            vi.field_d = ud.field_Ob;
            break L2;
          } else {
            vi.field_d = (cf.field_n + -640) / 2;
            break L2;
          }
        }
        L3: {
          ca.a(param6, (byte) 16);
          if ((qd.field_ab ^ -1) < -1) {
            cn.a(param6, param8, 21485, param9);
            break L3;
          } else {
            break L3;
          }
        }
        if (param0 < -33) {
          L4: {
            tn.field_a.field_V = tn.field_b.field_V;
            tn.field_a.field_xb = 1;
            if (0 < ng.field_t) {
              dg.a(param9, false, param6, param8);
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (0 < am.field_f) {
              mh.a(param5, param6, param8, param9, -87);
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            L7: {
              if (!lg.field_S) {
                break L7;
              } else {
                if (qb.field_N.field_jc >= qb.field_N.field_rc) {
                  hn.field_Q.field_Ob.field_jb = cb.field_s;
                  hh.field_c.field_S = false;
                  hd.a(hn.field_Q.field_Pb, (byte) -104);
                  break L6;
                } else {
                  break L7;
                }
              }
            }
            hn.field_Q.field_Ob.field_jb = null;
            hh.field_c.field_S = true;
            ci.a(param3, hn.field_Q, param7, -1, param8);
            break L6;
          }
          md.a(param8, param2, param7, param3, (byte) -73, param1, param4);
          ci.a(param3, v.field_x, param7, -1, param8);
          cb.field_u = cb.field_u + 1;
          return;
        } else {
          return;
        }
    }

    final void a(byte[] param0, long param1, boolean param2) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var13 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = 7 & -(7 & (int)param1) + 8;
              var7 = this.field_j & 7;
              if (param2) {
                break L1;
              } else {
                li.a(-105);
                break L1;
              }
            }
            var9 = param1;
            var11 = 31;
            var12 = 0;
            L2: while (true) {
              if (0 > var11) {
                L3: while (true) {
                  if (8L >= param1) {
                    L4: {
                      if (0L < param1) {
                        var8 = param0[var5_int] << var6 & 255;
                        this.field_n[this.field_e] = (byte)mc.a((int) this.field_n[this.field_e], var8 >>> var7);
                        break L4;
                      } else {
                        var8 = 0;
                        break L4;
                      }
                    }
                    L5: {
                      if (-9L < ((long)var7 - -param1 ^ -1L)) {
                        this.field_j = (int)((long)this.field_j + param1);
                        break L5;
                      } else {
                        L6: {
                          param1 = param1 - (long)(-var7 + 8);
                          this.field_j = this.field_j + (-var7 + 8);
                          this.field_e = this.field_e + 1;
                          if ((this.field_j ^ -1) == -513) {
                            this.b(31);
                            this.field_e = 0;
                            this.field_j = 0;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        this.field_n[this.field_e] = (byte)pl.a(var8 << -var7 + 8, 255);
                        this.field_j = this.field_j + (int)param1;
                        break L5;
                      }
                    }
                    break L0;
                  } else {
                    L7: {
                      var8 = param0[var5_int] << var6 & 255 | (param0[var5_int + 1] & 255) >>> 8 - var6;
                      if ((var8 ^ -1) > -1) {
                        break L7;
                      } else {
                        if (256 > var8) {
                          L8: {
                            this.field_n[this.field_e] = (byte)mc.a((int) this.field_n[this.field_e], var8 >>> var7);
                            this.field_e = this.field_e + 1;
                            this.field_j = this.field_j + (8 - var7);
                            if (-513 != (this.field_j ^ -1)) {
                              break L8;
                            } else {
                              this.b(31);
                              this.field_e = 0;
                              this.field_j = 0;
                              break L8;
                            }
                          }
                          this.field_n[this.field_e] = (byte)pl.a(255, var8 << -var7 + 8);
                          var5_int++;
                          param1 = param1 - 8L;
                          this.field_j = this.field_j + var7;
                          continue L3;
                        } else {
                          break L7;
                        }
                      }
                    }
                    throw new RuntimeException("LOGIC ERROR");
                  }
                }
              } else {
                var12 = var12 + ((255 & this.field_f[var11]) - -((int)var9 & 255));
                this.field_f[var11] = (byte)var12;
                var12 = var12 >>> 8;
                var9 = var9 >>> 8;
                var11--;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var5);
            stackOut_24_1 = new StringBuilder().append("li.C(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = TetraLink.field_J;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (8 <= var2) {
            var2 = 0;
            L1: while (true) {
              if (-9 >= (var2 ^ -1)) {
                if (param0 == 31) {
                  var2 = 1;
                  L2: while (true) {
                    if ((var2 ^ -1) < -11) {
                      var2 = 0;
                      L3: while (true) {
                        if (var2 >= 8) {
                          return;
                        } else {
                          this.field_k[var2] = mb.a(this.field_k[var2], mb.a(this.field_i[var2], this.field_d[var2]));
                          var2++;
                          continue L3;
                        }
                      }
                    } else {
                      var3 = 0;
                      L4: while (true) {
                        if ((var3 ^ -1) <= -9) {
                          var3 = 0;
                          L5: while (true) {
                            if (-9 >= (var3 ^ -1)) {
                              this.field_c[0] = mb.a(this.field_c[0], vg.field_Ob[var2]);
                              var3 = 0;
                              L6: while (true) {
                                if (-9 >= (var3 ^ -1)) {
                                  var3 = 0;
                                  L7: while (true) {
                                    if (-9 >= (var3 ^ -1)) {
                                      var2++;
                                      continue L2;
                                    } else {
                                      this.field_d[var3] = this.field_h[var3];
                                      var3++;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  this.field_h[var3] = this.field_c[var3];
                                  var7 = 0;
                                  var4 = var7;
                                  var5 = 56;
                                  L8: while (true) {
                                    if (8 <= var7) {
                                      var3++;
                                      continue L6;
                                    } else {
                                      this.field_h[var3] = mb.a(this.field_h[var3], vg.field_Ub[var7][pl.a(255, (int)(this.field_d[pl.a(7, -var7 + var3)] >>> var5))]);
                                      var5 -= 8;
                                      var7++;
                                      continue L8;
                                    }
                                  }
                                }
                              }
                            } else {
                              this.field_c[var3] = this.field_h[var3];
                              var3++;
                              continue L5;
                            }
                          }
                        } else {
                          this.field_h[var3] = 0L;
                          var4 = 0;
                          var5 = 56;
                          L9: while (true) {
                            if (var4 >= 8) {
                              var3++;
                              continue L4;
                            } else {
                              this.field_h[var3] = mb.a(this.field_h[var3], vg.field_Ub[var4][pl.a((int)(this.field_c[pl.a(-var4 + var3, 7)] >>> var5), 255)]);
                              var5 -= 8;
                              var4++;
                              continue L9;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  return;
                }
              } else {
                this.field_c[var2] = this.field_k[var2];
                this.field_d[var2] = mb.a(this.field_i[var2], this.field_k[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            this.field_i[var2] = mb.a(mb.a(pd.a(65280L, (long)this.field_n[6 + var3] << 231594888), mb.a(mb.a(mb.a(mb.a(pd.a((long)this.field_n[var3 + 2], 255L) << 1136343464, mb.a(pd.a((long)this.field_n[1 + var3], 255L) << -784006544, (long)this.field_n[var3] << 157679224)), pd.a(255L, (long)this.field_n[3 + var3]) << -909275680), pd.a((long)this.field_n[4 + var3], 255L) << -110311656), pd.a((long)this.field_n[var3 - -5], 255L) << 51966352)), pd.a(255L, (long)this.field_n[var3 + 7]));
            var3 += 8;
            var2++;
            continue L0;
          }
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_a = null;
        if (param0 != 255) {
            field_g = (fl) null;
        }
        field_m = null;
        field_l = null;
    }

    final static String a(int param0, String param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        bc var5 = null;
        CharSequence var6 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_12_0 = null;
        String stackIn_16_0 = null;
        String stackIn_19_0 = null;
        Object stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_11_0 = null;
        String stackOut_15_0 = null;
        Object stackOut_20_0 = null;
        String stackOut_18_0 = null;
        String stackOut_7_0 = null;
        String stackOut_4_0 = null;
        String stackOut_1_0 = null;
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
            var6 = (CharSequence) ((Object) param1);
            if (gi.a(false, var6)) {
              if (!ej.a(param1, param2 ^ 6)) {
                if (-3 == (ji.field_Tb ^ -1)) {
                  if (sb.a((byte) 2, param1)) {
                    stackOut_11_0 = sk.a(new String[]{param1}, hl.field_B, 127);
                    stackIn_12_0 = stackOut_11_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (100 <= ca.field_c) {
                      stackOut_15_0 = da.field_c;
                      stackIn_16_0 = stackOut_15_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (!oj.a(1, param1)) {
                        var5 = nd.field_Lb;
                        var5.f(param0, (byte) -92);
                        var5.field_t = var5.field_t + 1;
                        var4 = var5.field_t;
                        var5.a(param2, false);
                        var5.a(param1, 0);
                        var5.b(-var4 + var5.field_t, param2 ^ -4);
                        stackOut_20_0 = null;
                        stackIn_21_0 = stackOut_20_0;
                        decompiledRegionSelector0 = 6;
                        break L0;
                      } else {
                        stackOut_18_0 = sk.a(new String[]{param1}, ji.field_Vb, param2 + 119);
                        stackIn_19_0 = stackOut_18_0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  }
                } else {
                  stackOut_7_0 = f.field_w;
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_4_0 = hl.field_A;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = uk.field_u;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var3);
            stackOut_22_1 = new StringBuilder().append("li.F(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L1;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L1;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_12_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_16_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_19_0;
                  } else {
                    return (String) ((Object) stackIn_21_0);
                  }
                }
              }
            }
          }
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = TetraLink.field_J;
        for (var2 = 0; -33 < (var2 ^ -1); var2++) {
            this.field_f[var2] = (byte) 0;
        }
        this.field_e = 0;
        this.field_j = 0;
        this.field_n[0] = (byte) 0;
        if (param0) {
            return;
        }
        for (var2 = 0; (var2 ^ -1) > -9; var2++) {
            this.field_k[var2] = 0L;
        }
    }

    final static void a(int param0, oh[] param1, int param2, boolean param3, int param4, int param5, int param6, oh[] param7, int param8, int param9, jb param10, int param11, jb param12, int param13, int param14) {
        RuntimeException var15 = null;
        oh[] var16 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              var16 = (oh[]) null;
              ll.a(param13, (oh[]) null, param10, lk.field_wb, mc.field_b, -11319, param5, 0, param2, param14, 0, param8, param9, param7, ve.field_b, param6, param12, param0, param11, param1, 480);
              gb.a((byte) -75, param3);
              if (param4 < -72) {
                break L1;
              } else {
                li.a(4, 80, -105, 93, true, true, true, true, 64, false);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var15 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var15);
            stackOut_3_1 = new StringBuilder().append("li.A(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param7 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param8).append(',').append(param9).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param10 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          L5: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param11).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param12 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param13 + ',' + param14 + ')');
        }
    }

    final static void a(ie param0, Object param1, byte param2) {
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var4 = TetraLink.field_J;
        try {
          L0: {
            if (param2 <= -92) {
              if (null == param0.field_p) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3_int = 0;
                L1: while (true) {
                  L2: {
                    if (var3_int >= 50) {
                      break L2;
                    } else {
                      if (param0.field_p.peekEvent() == null) {
                        break L2;
                      } else {
                        tb.a(false, 1L);
                        var3_int++;
                        continue L1;
                      }
                    }
                  }
                  try {
                    L3: {
                      L4: {
                        if (param1 != null) {
                          param0.field_p.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param1, 1001, "dummy")));
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L5: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      break L5;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L6: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3_ref);
            stackOut_16_1 = new StringBuilder().append("li.I(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          L7: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param2 + ')');
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

    final void a(byte[] param0, int param1, int param2) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var8 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              this.field_n[this.field_e] = (byte)mc.a((int) this.field_n[this.field_e], 128 >>> pl.a(this.field_j, 7));
              this.field_e = this.field_e + 1;
              if (-33 <= (this.field_e ^ -1)) {
                break L1;
              } else {
                L2: while (true) {
                  if (-65 >= (this.field_e ^ -1)) {
                    this.b(31);
                    this.field_e = 0;
                    break L1;
                  } else {
                    fieldTemp$2 = this.field_e;
                    this.field_e = this.field_e + 1;
                    this.field_n[fieldTemp$2] = (byte) 0;
                    continue L2;
                  }
                }
              }
            }
            L3: while (true) {
              if (this.field_e >= 32) {
                L4: {
                  rd.a(this.field_f, 0, this.field_n, 32, 32);
                  this.b(31);
                  var4_int = 0;
                  var5 = param1;
                  if (param2 < -39) {
                    break L4;
                  } else {
                    this.field_c = (long[]) null;
                    break L4;
                  }
                }
                L5: while (true) {
                  if ((var4_int ^ -1) <= -9) {
                    break L0;
                  } else {
                    var6 = this.field_k[var4_int];
                    param0[var5] = (byte)(int)(var6 >>> 780042296);
                    param0[var5 + 1] = (byte)(int)(var6 >>> -1934791056);
                    param0[var5 - -2] = (byte)(int)(var6 >>> 557161896);
                    param0[var5 + 3] = (byte)(int)(var6 >>> 110379104);
                    param0[4 + var5] = (byte)(int)(var6 >>> 745446488);
                    param0[5 + var5] = (byte)(int)(var6 >>> 1886456784);
                    param0[var5 + 6] = (byte)(int)(var6 >>> 1999760008);
                    param0[var5 - -7] = (byte)(int)var6;
                    var5 += 8;
                    var4_int++;
                    continue L5;
                  }
                }
              } else {
                fieldTemp$3 = this.field_e;
                this.field_e = this.field_e + 1;
                this.field_n[fieldTemp$3] = (byte) 0;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var4);
            stackOut_12_1 = new StringBuilder().append("li.G(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L6;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L6;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    li() {
        this.field_f = new byte[32];
        this.field_k = new long[8];
        this.field_j = 0;
        this.field_h = new long[8];
        this.field_e = 0;
        this.field_d = new long[8];
        this.field_n = new byte[64];
        this.field_c = new long[8];
        this.field_i = new long[8];
    }

    static {
        field_b = 0;
        field_o = 0;
        field_a = new a();
    }
}
