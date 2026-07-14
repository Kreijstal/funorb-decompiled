/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pn {
    static String field_e;
    static int field_d;
    static int field_f;
    private pa[] field_c;
    ee[] field_b;
    kv[] field_a;

    private final ee a(int param0, byte param1) {
        if (param1 != -78) {
            Object var4 = null;
            pa discarded$0 = this.a((kv) null, (kv) null, false, 60);
        }
        if (param0 < 0) {
            return null;
        }
        if ((param0 ^ -1) < -32) {
            return null;
        }
        return ((pn) this).field_b[param0 - -120];
    }

    private final ee b(int param0, int param1, int param2) {
        if (-6 > (param1 ^ -1)) {
            return null;
        }
        int var4 = -127 / ((param2 - -49) / 34);
        if (param0 == 0) {
            return nca.field_a[param1];
        }
        if (-2 == param0) {
            return nca.field_a[32 + param1];
        }
        if (!(-3 != param0)) {
            return nca.field_a[96 + param1];
        }
        return null;
    }

    final void a(jo param0, byte param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        aj var7 = null;
        aj var8 = null;
        aj var9 = null;
        L0: {
          var6 = BachelorFridge.field_y;
          if (-1 == param0.field_F) {
            break L0;
          } else {
            this.a(param0, -1);
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (param0.field_z <= var4) {
            var4 = 0;
            L2: while (true) {
              if (var4 >= 2 + param0.field_z) {
                var4 = 0;
                L3: while (true) {
                  if (var4 >= param0.field_z) {
                    L4: {
                      if (param1 >= 97) {
                        break L4;
                      } else {
                        ((pn) this).field_c = null;
                        break L4;
                      }
                    }
                    return;
                  } else {
                    var5 = 0;
                    L5: while (true) {
                      if (param0.field_a <= var5) {
                        var4++;
                        continue L3;
                      } else {
                        L6: {
                          var9 = param0.a(var4, (byte) 48, var5);
                          if (0 == (param0.field_I[var5][var4].field_a ^ -1)) {
                            break L6;
                          } else {
                            if (param0.field_I[var5][var4].field_d) {
                              break L6;
                            } else {
                              this.a(var4, var9, var5, (byte) -35, param0);
                              break L6;
                            }
                          }
                        }
                        this.a(var5, 79, var4, param0, var9.field_c, var9.field_a);
                        var5++;
                        continue L5;
                      }
                    }
                  }
                }
              } else {
                var5 = 0;
                L7: while (true) {
                  if (var5 >= 2 + param0.field_a) {
                    var4++;
                    continue L2;
                  } else {
                    var8 = param0.a(var4, (byte) -103, var5);
                    if ((param0.field_j[var5][var4].field_n ^ -1) == -2) {
                      this.a(var5, false, var8.field_c, var4, param0, -32 + var8.field_a);
                      var5++;
                      continue L7;
                    } else {
                      var5++;
                      continue L7;
                    }
                  }
                }
              }
            }
          } else {
            var5 = 0;
            L8: while (true) {
              if (var5 >= param0.field_a) {
                var4++;
                continue L1;
              } else {
                var7 = param0.a(var4, (byte) 45, var5);
                this.a(var5, var4, param0, var7.field_a, var7.field_c, false);
                var5++;
                continue L8;
              }
            }
          }
        }
    }

    private final void a(jo param0, int param1) {
        int var6 = 0;
        kv var7 = null;
        kv var8 = null;
        int var9 = BachelorFridge.field_y;
        int var3 = 0;
        if (!(1 != param0.field_F)) {
            wf.a(54, (byte) -57);
        }
        if (!(param0.field_F >= -81)) {
            var3 = 8 * (-80 + param0.field_F);
            if (!(-256 >= var3)) {
                var3 = 255;
            }
        }
        ee[] var4 = iw.field_b;
        int var5 = var4.length;
        ((pn) this).field_c = new pa[var5];
        if (param1 != -1) {
            ((pn) this).field_a = null;
        }
        for (var6 = 0; var6 < var5; var6++) {
            var7 = var6 != 0 ? iw.field_b[var6 + -1].a() : null;
            var8 = iw.field_b[var6].a();
            ((pn) this).field_c[var6] = this.a(var8, var7, false, var3);
        }
    }

    private final ee a(int param0, int param1) {
        if (-6 > (param1 ^ -1)) {
            return null;
        }
        if (param0 != 21160) {
            return null;
        }
        return ((pn) this).field_b[96 + param1];
    }

    private final void a(int param0, aj param1, int param2, byte param3, jo param4) {
        wia var10 = param4.field_i.field_h.field_a[param2][param0];
        int var7 = var10.field_n;
        if (param3 != -35) {
            field_e = null;
        }
        int var8 = var10.field_j;
        if (37 == var7) {
            return;
        }
        ee var9 = this.a(var7, param0, param2, (byte) -122, var8, param4.field_i.field_h.field_E);
        if (!(var9 == null)) {
            var9.a(param1.field_c, param1.field_a, 104);
        }
        this.a(param2, (byte) 100, var8, param0, var7).a(param1.field_c, param1.field_a);
    }

    private final ee d(int param0, int param1) {
        if (!(param1 != 0)) {
            return nca.field_a[15];
        }
        int var3 = 57 % ((param0 - -41) / 36);
        if ((param1 ^ -1) == -2) {
            return nca.field_a[63];
        }
        if (param1 != 2) {
            return null;
        }
        return nca.field_a[111];
    }

    private final ee b(int param0, int param1) {
        if (param0 == (param1 ^ -1)) {
            return nca.field_a[14];
        }
        if (!(param1 != -2)) {
            return nca.field_a[62];
        }
        if (!(-3 != param1)) {
            return nca.field_a[110];
        }
        return null;
    }

    private final ee a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        int var7 = 0;
        L0: {
          if (param0 == -7) {
            break L0;
          } else {
            if (param0 == -9) {
              break L0;
            } else {
              if (10 == param0) {
                break L0;
              } else {
                if (-13 == param0) {
                  break L0;
                } else {
                  if (-15 != param0) {
                    if (20 != param0) {
                      var7 = 39 / ((49 - param3) / 58);
                      return null;
                    } else {
                      return this.b(-1, param5);
                    }
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
        }
        return this.b(param5, (param2 + param1 * 2) % 4, -85);
    }

    void b(jo param0, int param1) {
        if (param1 != -13319) {
            ee discarded$0 = this.a(45, -37, 115, (byte) 34, -102, -47);
        }
    }

    private final void a(int param0, int param1, int param2, jo param3, int param4, int param5) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        pa var11 = null;
        int var11_int = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        wia var23 = null;
        int stackIn_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        var22 = BachelorFridge.field_y;
        if (param3.field_I[param0][param2].field_d) {
          return;
        } else {
          L0: {
            L1: {
              var8 = 32 / ((-62 - param1) / 45);
              var23 = param3.field_i.field_h.field_a[param0][param2];
              var9 = var23.field_n;
              if (var9 != 21) {
                break L1;
              } else {
                if (param3.field_I[param0][param2].field_i) {
                  break L1;
                } else {
                  ((pn) this).field_b[109].a(param4, param5);
                  break L0;
                }
              }
            }
            L2: {
              if ((var9 ^ -1) != -22) {
                break L2;
              } else {
                if (!param3.field_I[param0][param2].field_i) {
                  break L2;
                } else {
                  ((pn) this).field_b[108].a(param4, param5);
                  break L0;
                }
              }
            }
            if (-23 != (var9 ^ -1)) {
              L3: {
                if (-24 == (var9 ^ -1)) {
                  break L3;
                } else {
                  if (var9 == 24) {
                    break L3;
                  } else {
                    if (25 == var9) {
                      break L3;
                    } else {
                      if (26 != var9) {
                        break L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              this.a(param0, (byte) 83, 0, param2, 20).a(param4, param5);
              break L0;
            } else {
              this.d(-79, param3.field_i.field_h.field_E).a(param4, param5, 104);
              ((pn) this).field_b[103].a(param4, param5);
              break L0;
            }
          }
          L4: {
            if (-35 == (var9 ^ -1)) {
              ge.field_K.a(param4, param5);
              break L4;
            } else {
              if (var9 == -36) {
                il.field_b.a(param4, param5);
                break L4;
              } else {
                if (-29 == var9) {
                  if (var23.field_h >= od.field_w[var9].field_e) {
                    kka.field_f.a(param4, param5 + -64);
                    break L4;
                  } else {
                    hna.field_h.a(param4, param5 + -64);
                    break L4;
                  }
                } else {
                  if (27 == var9) {
                    var10 = var23.field_j - 1;
                    if ((var10 ^ -1) > -1) {
                      break L4;
                    } else {
                      L5: {
                        if (iw.field_b.length <= var10) {
                          var10 = iw.field_b.length - 1;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var11 = ((pn) this).field_c[var10];
                      var11.e(param4, param5);
                      break L4;
                    }
                  } else {
                    if ((var9 ^ -1) != -37) {
                      if (30 != var9) {
                        if (-30 == var9) {
                          pk.field_b[(param2 + param0) % 7].a(param4, param5);
                          break L4;
                        } else {
                          if (-40 == var9) {
                            ip.field_f[0].e(32 + param4, -32 + param5);
                            break L4;
                          } else {
                            if (-38 != (var9 ^ -1)) {
                              break L4;
                            } else {
                              L6: {
                                var10 = (param0 - -(47 * param2)) % 3;
                                var11_int = (param0 * 342 - -(98 * param2)) % 32;
                                var12 = (231 * param0 - -(167 * param2)) % 32;
                                var13 = param4 - (-var11_int - (var12 + -32));
                                var14 = -var12 + (param5 + var11_int);
                                var15 = 32 + (1212 * param2 + 4642 * param0 & 31);
                                var16 = 16 + (31 & param2 * 464 + 57 * param0);
                                var17 = vr.field_b % var15;
                                var18 = var17 * (4 * (var16 * (var15 + -var17))) / (var15 * var15);
                                var19 = 32;
                                var20 = 24;
                                if (var17 << 321879937 > var15) {
                                  stackOut_30_0 = 1;
                                  stackIn_31_0 = stackOut_30_0;
                                  break L6;
                                } else {
                                  stackOut_29_0 = 0;
                                  stackIn_31_0 = stackOut_29_0;
                                  break L6;
                                }
                              }
                              var21 = stackIn_31_0;
                              var20 = var20 - (3 * var18 >> 943059300);
                              var19 = var19 - (var18 >> 183175522);
                              nk.a(param3.field_y, -(var19 >> 481161313) + 64 + var13, -(var20 >> 547457217) + 36 + var14, var19, var20);
                              eka.field_g[var10][var21].a(var13, -var18 + var14);
                              break L4;
                            }
                          }
                        }
                      } else {
                        ld.field_l[(param2 + param0) % 7].a(param4, param5);
                        break L4;
                      }
                    } else {
                      pfa.field_g.a(param4, -64 + param5);
                      break L4;
                    }
                  }
                }
              }
            }
          }
          return;
        }
    }

    private final pa a(kv param0, int param1, int param2) {
        int var4 = 0;
        pa var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        L0: {
          var9 = BachelorFridge.field_y;
          param0.g();
          var4 = param0.field_v.length;
          if (param2 < -75) {
            break L0;
          } else {
            var10 = null;
            ((pn) this).a((jo) null, (byte) 45);
            break L0;
          }
        }
        var5 = new pa(param0.field_n, param0.field_o);
        var6 = var5.field_v;
        var7 = 0;
        L1: while (true) {
          if (var4 <= var7) {
            return var5;
          } else {
            var8 = 16777215 & param0.field_v[var7];
            if (-1 == (var8 ^ -1)) {
              var6[var7] = 0;
              var7++;
              continue L1;
            } else {
              var6[var7] = mp.a(var8, param1 << -718974088);
              var7++;
              continue L1;
            }
          }
        }
    }

    private final void a(int param0, int param1, jo param2, int param3, int param4, boolean param5) {
        if (param5) {
            ee discarded$0 = this.a(116, -127, -22);
        }
        this.c(26728, (param0 + param1 * (param2.field_a - -2)) % 24).a(param4, param3);
    }

    final static String a(byte param0, int param1, String[] param2) {
        int var3 = -29 % ((param0 - -48) / 46);
        if (0 <= param1) {
            if (param1 < param2.length) {
                if (param2[param1] != null) {
                    return param2[param1];
                }
            }
        }
        return "Unknown: " + param1;
    }

    private final pa a(kv param0, kv param1, boolean param2, int param3) {
        int var5 = 0;
        pa var6 = null;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        var15 = BachelorFridge.field_y;
        if (param1 == null) {
          return this.a(param0, param3, -108);
        } else {
          if (param0 == null) {
            return this.a(param1, 255 + -param3, -115);
          } else {
            param1.g();
            param0.g();
            if (!param2) {
              var5 = param1.field_v.length;
              if (param0.field_v.length != var5) {
                throw new RuntimeException();
              } else {
                var6 = new pa(param1.field_n, param1.field_o);
                var19 = var6.field_v;
                var18 = var19;
                var17 = var18;
                var16 = var17;
                var7 = var16;
                var8 = 0;
                L0: while (true) {
                  if (var5 <= var8) {
                    return var6;
                  } else {
                    L1: {
                      var9 = param1.field_v[var8] & 16777215;
                      var10 = 16777215 & param0.field_v[var8];
                      if (-1 != (var9 ^ -1)) {
                        break L1;
                      } else {
                        if (var10 != 0) {
                          break L1;
                        } else {
                          var19[var8] = 0;
                          var8++;
                          continue L0;
                        }
                      }
                    }
                    if (var9 != 0) {
                      if (-1 != (var10 ^ -1)) {
                        var11 = var9 & 16711935;
                        var12 = 65280 & var9;
                        var13 = var10 & 16711935;
                        var12 = var12 * (256 - param3);
                        var14 = var10 & 65280;
                        var13 = var13 * param3;
                        var11 = var11 * (-param3 + 256);
                        var11 = var11 & -16711936;
                        var12 = var12 & 16711680;
                        var13 = var13 & -16711936;
                        var14 = var14 * param3;
                        var14 = var14 & 16711680;
                        var7[var8] = mp.a(mp.a(var11 + var13, var14 + var12) >>> 157908296, -16777216);
                        var8++;
                        continue L0;
                      } else {
                        var7[var8] = mp.a(-param3 + 255 << -1210775240, var9);
                        var8++;
                        continue L0;
                      }
                    } else {
                      var7[var8] = mp.a(var10, param3 << 1567358616);
                      var8++;
                      continue L0;
                    }
                  }
                }
              }
            } else {
              return null;
            }
          }
        }
    }

    private final ee a(int param0, byte param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var6 = 27 / ((-28 - param1) / 40);
        if ((param4 ^ -1) != -7) {
            if ((param4 ^ -1) != -9) {
                if (10 != param4) {
                    if (param4 != -13) {
                        if (param4 != 14) {
                            if (-8 != param4) {
                                if (param4 != 9) {
                                    if ((param4 ^ -1) != -12) {
                                        if (param4 != 13) {
                                            if (param4 != 15) {
                                                if (20 != param4) {
                                                    if (38 != param4) {
                                                        if (param4 != 33) {
                                                            return null;
                                                        }
                                                        return fw.field_f;
                                                    }
                                                    var7 = param3 * param0 % 3;
                                                    return cba.field_c[var7];
                                                }
                                                return ((pn) this).field_b[102];
                                            }
                                        }
                                    }
                                }
                            }
                            return this.a(21160, (param0 + param3 * 2) % 4);
                        }
                    }
                }
            }
        }
        return this.a((byte) -18, (param0 + 2 * param3) % 4);
    }

    private final void a(int param0, boolean param1, int param2, int param3, jo param4, int param5) {
        Object var7 = null;
        int var8 = 0;
        ee var9 = null;
        ee var10 = null;
        ee var11 = null;
        ee var12 = null;
        ee var13 = null;
        ee var14 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        Object stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        Object stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        Object stackIn_35_0 = null;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        Object stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int stackIn_40_2 = 0;
        Object stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_41_2 = 0;
        Object stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        int stackIn_42_3 = 0;
        Object stackIn_46_0 = null;
        Object stackIn_47_0 = null;
        Object stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        Object stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        Object stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        Object stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        int stackIn_52_2 = 0;
        Object stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        Object stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        Object stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        int stackIn_58_2 = 0;
        Object stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        Object stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        int stackOut_51_2 = 0;
        Object stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        int stackOut_50_2 = 0;
        Object stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        Object stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        int stackOut_57_2 = 0;
        Object stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        int stackOut_56_2 = 0;
        Object stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int stackOut_39_2 = 0;
        Object stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        int stackOut_41_3 = 0;
        Object stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int stackOut_40_2 = 0;
        int stackOut_40_3 = 0;
        Object stackOut_45_0 = null;
        Object stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        Object stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        Object stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_33_2 = 0;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        int stackOut_32_2 = 0;
        Object stackOut_34_0 = null;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        Object stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        L0: {
          var8 = BachelorFridge.field_y;
          if (param4.field_j[param0][param3].field_n != 1) {
            break L0;
          } else {
            var7 = null;
            if (param4.field_j[param0][param3].field_k != 5) {
              if (-11 != (param4.field_j[param0][param3].field_k ^ -1)) {
                if (-16 == (param4.field_j[param0][param3].field_k ^ -1)) {
                  L1: {
                    stackOut_49_0 = this;
                    stackOut_49_1 = param4.field_i.field_h.field_E;
                    stackIn_51_0 = stackOut_49_0;
                    stackIn_51_1 = stackOut_49_1;
                    stackIn_50_0 = stackOut_49_0;
                    stackIn_50_1 = stackOut_49_1;
                    if (!param4.field_j[param0][param3].field_o) {
                      stackOut_51_0 = this;
                      stackOut_51_1 = stackIn_51_1;
                      stackOut_51_2 = 0;
                      stackIn_52_0 = stackOut_51_0;
                      stackIn_52_1 = stackOut_51_1;
                      stackIn_52_2 = stackOut_51_2;
                      break L1;
                    } else {
                      stackOut_50_0 = this;
                      stackOut_50_1 = stackIn_50_1;
                      stackOut_50_2 = 16;
                      stackIn_52_0 = stackOut_50_0;
                      stackIn_52_1 = stackOut_50_1;
                      stackIn_52_2 = stackOut_50_2;
                      break L1;
                    }
                  }
                  L2: {
                    var14 = this.a(stackIn_52_1, stackIn_52_2 + (param0 - -param3) % 4 * 5, 15392);
                    if (var14 != null) {
                      var14.a(param2, param5, 104);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    stackOut_55_0 = this;
                    stackOut_55_1 = 5 * ((param0 - -param3) % 4);
                    stackIn_57_0 = stackOut_55_0;
                    stackIn_57_1 = stackOut_55_1;
                    stackIn_56_0 = stackOut_55_0;
                    stackIn_56_1 = stackOut_55_1;
                    if (param4.field_j[param0][param3].field_o) {
                      stackOut_57_0 = this;
                      stackOut_57_1 = stackIn_57_1;
                      stackOut_57_2 = 16;
                      stackIn_58_0 = stackOut_57_0;
                      stackIn_58_1 = stackOut_57_1;
                      stackIn_58_2 = stackOut_57_2;
                      break L3;
                    } else {
                      stackOut_56_0 = this;
                      stackOut_56_1 = stackIn_56_1;
                      stackOut_56_2 = 0;
                      stackIn_58_0 = stackOut_56_0;
                      stackIn_58_1 = stackOut_56_1;
                      stackIn_58_2 = stackOut_56_2;
                      break L3;
                    }
                  }
                  this.a(stackIn_58_1 - -stackIn_58_2, (byte) -78).a(param2, param5);
                  break L0;
                } else {
                  L4: {
                    stackOut_39_0 = this;
                    stackOut_39_1 = param4.field_i.field_h.field_E;
                    stackOut_39_2 = param4.field_j[param0][param3].field_k;
                    stackIn_41_0 = stackOut_39_0;
                    stackIn_41_1 = stackOut_39_1;
                    stackIn_41_2 = stackOut_39_2;
                    stackIn_40_0 = stackOut_39_0;
                    stackIn_40_1 = stackOut_39_1;
                    stackIn_40_2 = stackOut_39_2;
                    if (!param4.field_j[param0][param3].field_o) {
                      stackOut_41_0 = this;
                      stackOut_41_1 = stackIn_41_1;
                      stackOut_41_2 = stackIn_41_2;
                      stackOut_41_3 = 0;
                      stackIn_42_0 = stackOut_41_0;
                      stackIn_42_1 = stackOut_41_1;
                      stackIn_42_2 = stackOut_41_2;
                      stackIn_42_3 = stackOut_41_3;
                      break L4;
                    } else {
                      stackOut_40_0 = this;
                      stackOut_40_1 = stackIn_40_1;
                      stackOut_40_2 = stackIn_40_2;
                      stackOut_40_3 = 16;
                      stackIn_42_0 = stackOut_40_0;
                      stackIn_42_1 = stackOut_40_1;
                      stackIn_42_2 = stackOut_40_2;
                      stackIn_42_3 = stackOut_40_3;
                      break L4;
                    }
                  }
                  L5: {
                    var13 = this.a(stackIn_42_1, stackIn_42_2 + stackIn_42_3, 15392);
                    if (var13 != null) {
                      var13.a(param2, param5, 104);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    stackOut_45_0 = this;
                    stackIn_47_0 = stackOut_45_0;
                    stackIn_46_0 = stackOut_45_0;
                    if (param4.field_j[param0][param3].field_o) {
                      stackOut_47_0 = this;
                      stackOut_47_1 = 16;
                      stackIn_48_0 = stackOut_47_0;
                      stackIn_48_1 = stackOut_47_1;
                      break L6;
                    } else {
                      stackOut_46_0 = this;
                      stackOut_46_1 = 0;
                      stackIn_48_0 = stackOut_46_0;
                      stackIn_48_1 = stackOut_46_1;
                      break L6;
                    }
                  }
                  this.a(stackIn_48_1 + param4.field_j[param0][param3].field_k, (byte) -78).a(param2, param5);
                  break L0;
                }
              } else {
                L7: {
                  stackOut_21_0 = this;
                  stackOut_21_1 = param4.field_i.field_h.field_E;
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_23_1 = stackOut_21_1;
                  stackIn_22_0 = stackOut_21_0;
                  stackIn_22_1 = stackOut_21_1;
                  if (!param4.field_j[param0][param3].field_o) {
                    stackOut_23_0 = this;
                    stackOut_23_1 = stackIn_23_1;
                    stackOut_23_2 = 0;
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    stackIn_24_2 = stackOut_23_2;
                    break L7;
                  } else {
                    stackOut_22_0 = this;
                    stackOut_22_1 = stackIn_22_1;
                    stackOut_22_2 = 16;
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_24_1 = stackOut_22_1;
                    stackIn_24_2 = stackOut_22_2;
                    break L7;
                  }
                }
                L8: {
                  var11 = this.a(stackIn_24_1, stackIn_24_2 + 8, 15392);
                  if (var11 == null) {
                    break L8;
                  } else {
                    var11.a(param2, param5, 104);
                    break L8;
                  }
                }
                L9: {
                  stackOut_26_0 = this;
                  stackOut_26_1 = param4.field_i.field_h.field_E;
                  stackIn_28_0 = stackOut_26_0;
                  stackIn_28_1 = stackOut_26_1;
                  stackIn_27_0 = stackOut_26_0;
                  stackIn_27_1 = stackOut_26_1;
                  if (param4.field_j[param0][param3].field_o) {
                    stackOut_28_0 = this;
                    stackOut_28_1 = stackIn_28_1;
                    stackOut_28_2 = 16;
                    stackIn_29_0 = stackOut_28_0;
                    stackIn_29_1 = stackOut_28_1;
                    stackIn_29_2 = stackOut_28_2;
                    break L9;
                  } else {
                    stackOut_27_0 = this;
                    stackOut_27_1 = stackIn_27_1;
                    stackOut_27_2 = 0;
                    stackIn_29_0 = stackOut_27_0;
                    stackIn_29_1 = stackOut_27_1;
                    stackIn_29_2 = stackOut_27_2;
                    break L9;
                  }
                }
                L10: {
                  var12 = this.a(stackIn_29_1, stackIn_29_2 + 2, 15392);
                  if (var12 == null) {
                    break L10;
                  } else {
                    var12.a(param2, param5, 104);
                    break L10;
                  }
                }
                L11: {
                  stackOut_31_0 = this;
                  stackOut_31_1 = 8;
                  stackIn_33_0 = stackOut_31_0;
                  stackIn_33_1 = stackOut_31_1;
                  stackIn_32_0 = stackOut_31_0;
                  stackIn_32_1 = stackOut_31_1;
                  if (param4.field_j[param0][param3].field_o) {
                    stackOut_33_0 = this;
                    stackOut_33_1 = stackIn_33_1;
                    stackOut_33_2 = 16;
                    stackIn_34_0 = stackOut_33_0;
                    stackIn_34_1 = stackOut_33_1;
                    stackIn_34_2 = stackOut_33_2;
                    break L11;
                  } else {
                    stackOut_32_0 = this;
                    stackOut_32_1 = stackIn_32_1;
                    stackOut_32_2 = 0;
                    stackIn_34_0 = stackOut_32_0;
                    stackIn_34_1 = stackOut_32_1;
                    stackIn_34_2 = stackOut_32_2;
                    break L11;
                  }
                }
                L12: {
                  this.a(stackIn_34_1 + stackIn_34_2, (byte) -78).a(param2, param5);
                  stackOut_34_0 = this;
                  stackIn_36_0 = stackOut_34_0;
                  stackIn_35_0 = stackOut_34_0;
                  if (!param4.field_j[param0][param3].field_o) {
                    stackOut_36_0 = this;
                    stackOut_36_1 = 0;
                    stackIn_37_0 = stackOut_36_0;
                    stackIn_37_1 = stackOut_36_1;
                    break L12;
                  } else {
                    stackOut_35_0 = this;
                    stackOut_35_1 = 16;
                    stackIn_37_0 = stackOut_35_0;
                    stackIn_37_1 = stackOut_35_1;
                    break L12;
                  }
                }
                this.a(stackIn_37_1 + 2, (byte) -78).a(param2, param5);
                break L0;
              }
            } else {
              L13: {
                stackOut_2_0 = this;
                stackOut_2_1 = param4.field_i.field_h.field_E;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (!param4.field_j[param0][param3].field_o) {
                  stackOut_4_0 = this;
                  stackOut_4_1 = stackIn_4_1;
                  stackOut_4_2 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  stackIn_5_2 = stackOut_4_2;
                  break L13;
                } else {
                  stackOut_3_0 = this;
                  stackOut_3_1 = stackIn_3_1;
                  stackOut_3_2 = 16;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  stackIn_5_2 = stackOut_3_2;
                  break L13;
                }
              }
              L14: {
                var9 = this.a(stackIn_5_1, stackIn_5_2 + 4, 15392);
                if (var9 != null) {
                  var9.a(param2, param5, 104);
                  break L14;
                } else {
                  break L14;
                }
              }
              L15: {
                stackOut_8_0 = this;
                stackOut_8_1 = param4.field_i.field_h.field_E;
                stackOut_8_2 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_10_2 = stackOut_8_2;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                stackIn_9_2 = stackOut_8_2;
                if (param4.field_j[param0][param3].field_o) {
                  stackOut_10_0 = this;
                  stackOut_10_1 = stackIn_10_1;
                  stackOut_10_2 = stackIn_10_2;
                  stackOut_10_3 = 16;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  stackIn_11_3 = stackOut_10_3;
                  break L15;
                } else {
                  stackOut_9_0 = this;
                  stackOut_9_1 = stackIn_9_1;
                  stackOut_9_2 = stackIn_9_2;
                  stackOut_9_3 = 0;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  stackIn_11_2 = stackOut_9_2;
                  stackIn_11_3 = stackOut_9_3;
                  break L15;
                }
              }
              L16: {
                var10 = this.a(stackIn_11_1, stackIn_11_2 + stackIn_11_3, 15392);
                if (var10 == null) {
                  break L16;
                } else {
                  var10.a(param2, param5, 104);
                  break L16;
                }
              }
              L17: {
                stackOut_13_0 = this;
                stackOut_13_1 = 4;
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                if (param4.field_j[param0][param3].field_o) {
                  stackOut_15_0 = this;
                  stackOut_15_1 = stackIn_15_1;
                  stackOut_15_2 = 16;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  break L17;
                } else {
                  stackOut_14_0 = this;
                  stackOut_14_1 = stackIn_14_1;
                  stackOut_14_2 = 0;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_16_2 = stackOut_14_2;
                  break L17;
                }
              }
              L18: {
                this.a(stackIn_16_1 - -stackIn_16_2, (byte) -78).a(param2, param5);
                stackOut_16_0 = this;
                stackOut_16_1 = 1;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (!param4.field_j[param0][param3].field_o) {
                  stackOut_18_0 = this;
                  stackOut_18_1 = stackIn_18_1;
                  stackOut_18_2 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L18;
                } else {
                  stackOut_17_0 = this;
                  stackOut_17_1 = stackIn_17_1;
                  stackOut_17_2 = 16;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  break L18;
                }
              }
              this.a(stackIn_19_1 + stackIn_19_2, (byte) -78).a(param2, param5);
              break L0;
            }
          }
        }
        L19: {
          if (-30 != (param4.field_j[param0][param3].field_n ^ -1)) {
            break L19;
          } else {
            if (param4.field_j[param0][param3].field_k == 5) {
              pk.field_b[4].a(param2, param5);
              pk.field_b[1].a(param2, param5);
              break L19;
            } else {
              if (10 != param4.field_j[param0][param3].field_k) {
                if (15 != param4.field_j[param0][param3].field_k) {
                  pk.field_b[param4.field_j[param0][param3].field_k].a(param2, param5);
                  break L19;
                } else {
                  pk.field_b[5 * ((param3 + param0) % 4)].a(param2, param5);
                  break L19;
                }
              } else {
                pk.field_b[8].a(param2, param5);
                pk.field_b[2].a(param2, param5);
                break L19;
              }
            }
          }
        }
        L20: {
          if (!param1) {
            break L20;
          } else {
            ((pn) this).field_c = null;
            break L20;
          }
        }
        L21: {
          if (30 == param4.field_j[param0][param3].field_n) {
            if (-6 == (param4.field_j[param0][param3].field_k ^ -1)) {
              ld.field_l[4].a(param2, param5);
              ld.field_l[1].a(param2, param5);
              break L21;
            } else {
              if (10 == param4.field_j[param0][param3].field_k) {
                ld.field_l[8].a(param2, param5);
                ld.field_l[2].a(param2, param5);
                break L21;
              } else {
                if (-16 != (param4.field_j[param0][param3].field_k ^ -1)) {
                  ld.field_l[param4.field_j[param0][param3].field_k].a(param2, param5);
                  break L21;
                } else {
                  ld.field_l[(param3 + param0) % 4 * 5].a(param2, param5);
                  break L21;
                }
              }
            }
          } else {
            break L21;
          }
        }
    }

    private final ee c(int param0, int param1) {
        if (-1 < param1) {
            return null;
        }
        if (-24 < param1) {
            return null;
        }
        if (param0 != 26728) {
            return null;
        }
        return ((pn) this).field_b[param1 - -64];
    }

    private final ee a(int param0, int param1, int param2) {
        if (param2 != 15392) {
            return null;
        }
        if (1 != param0) {
            return null;
        }
        return nca.field_a[64 + param1];
    }

    private final ee a(byte param0, int param1) {
        if (param1 > 5) {
            return null;
        }
        if (param0 != -18) {
            Object var4 = null;
            this.a(-77, false, -85, -1, (jo) null, -104);
        }
        return ((pn) this).field_b[param1 + 88];
    }

    public static void a(byte param0) {
        field_e = null;
        int var1 = 125 % ((67 - param0) / 34);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Chat";
        field_f = 0;
    }
}
