/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lr {
    static qr field_a;
    static String field_d;
    static byte[] field_c;
    static String field_f;
    static int[] field_b;
    static String field_e;

    final static lp a(ph param0, fs param1, byte param2, fs param3, fs[] param4) {
        int var9_int = 0;
        ff var10 = null;
        int var11 = ShatteredPlansClient.field_F ? 1 : 0;
        lp var12 = new lp(0, 0, 182, rg.field_a);
        lp var13 = var12;
        var13.field_h = (Object) (Object) param3;
        param0.field_h[param1.field_x >= param3.field_x ? param3.field_x - -1 : param3.field_x] = var12;
        kb var6 = new kb(pf.field_a[param3.field_x].field_z * 3 / 4, -1 + (var13.field_i / 2 - rs.field_Cb.field_J), 182 + -(pf.field_a[param3.field_x].field_z * 3 / 4), param3.field_k, param3.field_t, 16777215, true);
        var13.a((vd) (Object) var6, 8);
        fe var7 = new fe(3 * pf.field_a[param3.field_x].field_z / 4, var13.field_i / 2 - -1, 182 + -(3 * pf.field_a[param3.field_x].field_z / 4), rs.field_Cb.field_J, 8421504, md.i(0), eb.field_e, 3375155);
        var13.a((vd) (Object) var7, param2 + -13);
        param0.field_i[param3.field_x < param1.field_x ? param3.field_x : -1 + param3.field_x] = var7;
        var7.field_o = re.a(jg.field_f, 4371, new String[1]);
        var6.field_o = re.a(jg.field_f, 4371, new String[1]);
        var13.field_o = re.a(jg.field_f, 4371, new String[1]);
        if (param2 != 21) {
            return null;
        }
        bg.a(-2612, param4.length);
        ff var8 = new ff(3 * pf.field_a[param3.field_x].field_z / 4, 3 + var13.field_i / 2 + rs.field_Cb.field_J, ne.a(-1, false));
        var13.a((vd) (Object) var8, 8);
        var8.field_o = re.a(jg.field_f, 4371, new String[1]);
        param0.field_f[param1.field_x >= param3.field_x ? 1 + param3.field_x : param3.field_x][0] = var8;
        for (var9_int = 1; param4.length + -1 > var9_int; var9_int++) {
            var10 = new ff(pf.field_a[param3.field_x].field_z + (2 - -dc.field_F.field_z) * var9_int, var13.field_i / 2 + rs.field_Cb.field_J + 3, wm.a(-1, param2 + -21));
            var13.a((vd) (Object) var10, 8);
            var10.field_o = re.a(jg.field_f, 4371, new String[1]);
            param0.field_f[param3.field_x > param1.field_x ? param3.field_x : 1 + param3.field_x][var9_int] = var10;
        }
        ff var9 = new ff(0, (var12.field_i - pf.field_a[param3.field_x].field_w) / 2, pf.field_a[param3.field_x]);
        var13.a((vd) (Object) var9, param2 ^ 29);
        var9.field_o = re.a(jg.field_f, 4371, new String[1]);
        return var13;
    }

    public static void b(int param0) {
        field_d = null;
        field_a = null;
        field_f = null;
        field_b = null;
        field_e = null;
        field_c = null;
        if (param0 != 3) {
            field_c = null;
        }
    }

    final static void a(int param0, int param1, int[] param2, byte param3, Object[] param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        int var13 = 0;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param3 > 66) {
          L0: {
            if (param1 <= param0) {
              break L0;
            } else {
              L1: {
                var5 = (param0 - -param1) / 2;
                var6 = param0;
                var7 = param2[var5];
                param2[var5] = param2[param1];
                param2[param1] = var7;
                var8 = param4[var5];
                param4[var5] = param4[param1];
                param4[param1] = var8;
                if (var7 == 2147483647) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              var9 = stackIn_6_0;
              var10 = param0;
              L2: while (true) {
                if (param1 <= var10) {
                  param2[param1] = param2[var6];
                  param2[var6] = var7;
                  param4[param1] = param4[var6];
                  param4[var6] = var8;
                  lr.a(param0, var6 + -1, param2, (byte) 69, param4);
                  lr.a(var6 + 1, param1, param2, (byte) 77, param4);
                  break L0;
                } else {
                  if (var7 - (var9 & var10) < param2[var10]) {
                    var11 = param2[var10];
                    param2[var10] = param2[var6];
                    param2[var6] = var11;
                    var12 = param4[var10];
                    param4[var10] = param4[var6];
                    var6++;
                    param4[var6] = var12;
                    var10++;
                    continue L2;
                  } else {
                    var10++;
                    continue L2;
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

    final static String a(int param0, CharSequence[] param1) {
        if (param0 < 63) {
            return null;
        }
        return hm.a(param1, 0, param1.length, (byte) 28);
    }

    final static int a(byte param0) {
        if (param0 != 27) {
            Object var2 = null;
            lr.a(-35, -18, (int[]) null, (byte) 95, (Object[]) null);
        }
        return tg.field_b.nextInt();
    }

    final synchronized static byte[] a(int param0, int param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        L0: {
          if (-101 != (param0 ^ -1)) {
            break L0;
          } else {
            if (je.field_c <= 0) {
              break L0;
            } else {
              je.field_c = je.field_c - 1;
              var2_ref_byte__ = qf.field_d[je.field_c - 1];
              qf.field_d[je.field_c] = null;
              return var2_ref_byte__;
            }
          }
        }
        L1: {
          if (param0 != 5000) {
            break L1;
          } else {
            if ((ik.field_j ^ -1) >= -1) {
              break L1;
            } else {
              ik.field_j = ik.field_j - 1;
              var2_ref_byte__ = mj.field_Bb[ik.field_j - 1];
              mj.field_Bb[ik.field_j] = null;
              return var2_ref_byte__;
            }
          }
        }
        L2: {
          if (param0 != 30000) {
            break L2;
          } else {
            if (0 < en.field_a) {
              en.field_a = en.field_a - 1;
              var2_ref_byte__ = jf.field_c[en.field_a - 1];
              jf.field_c[en.field_a] = null;
              return var2_ref_byte__;
            } else {
              break L2;
            }
          }
        }
        if (param1 > 67) {
          L3: {
            if (nn.field_c == null) {
              break L3;
            } else {
              var2 = 0;
              L4: while (true) {
                if (var2 >= nf.field_a.length) {
                  break L3;
                } else {
                  if (nf.field_a[var2] == param0) {
                    if (-1 > (tf.field_a[var2] ^ -1)) {
                      tf.field_a[var2] = tf.field_a[var2] - 1;
                      var3 = nn.field_c[var2][tf.field_a[var2] - 1];
                      nn.field_c[var2][tf.field_a[var2]] = null;
                      return var3;
                    } else {
                      var2++;
                      continue L4;
                    }
                  } else {
                    var2++;
                    continue L4;
                  }
                }
              }
            }
          }
          return new byte[param0];
        } else {
          return null;
        }
    }

    final static void a(int param0) {
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        sl var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        lq var12 = null;
        sl var13 = null;
        int[] var14 = null;
        gb var15 = null;
        Object var16 = null;
        gb var16_ref = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        L0: {
          var16 = null;
          var8 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param0 >= 65) {
            break L0;
          } else {
            var9 = null;
            lr.a(121, -50, (int[]) null, (byte) -33, (Object[]) null);
            break L0;
          }
        }
        L1: {
          var13 = sa.field_a;
          var2 = var13.j(-100);
          if (var2 != 0) {
            if (var2 == 1) {
              var12 = (lq) (Object) rs.field_Bb.d(0);
              if (var12 != null) {
                var12.b((byte) -108);
                break L1;
              } else {
                q.g(-100);
                return;
              }
            } else {
              if ((var2 ^ -1) == -3) {
                var16_ref = (gb) (Object) vl.field_o.d(0);
                if (var16_ref == null) {
                  q.g(-120);
                  return;
                } else {
                  var16_ref.field_k = ae.a(-116);
                  var16_ref.field_h = var16_ref.field_k[0];
                  var16_ref.field_j = true;
                  var16_ref.field_l = true;
                  var16_ref.b((byte) -89);
                  break L1;
                }
              } else {
                jq.a(-29901, (Throwable) null, "A1: " + w.a(16738));
                q.g(-125);
                break L1;
              }
            }
          } else {
            var11 = ae.a(-128);
            var19 = var11;
            var18 = var19;
            var17 = var18;
            var14 = var17;
            var3 = var14;
            var10 = var11;
            var4 = var10;
            var5 = var13;
            var6 = ((ob) (Object) var5).j(-115);
            var7 = 0;
            L2: while (true) {
              if (var7 >= var6) {
                var15 = (gb) (Object) vl.field_o.d(0);
                if (var15 == null) {
                  q.g(-112);
                  return;
                } else {
                  var15.field_l = false;
                  var15.field_h = var19[0];
                  var15.field_j = true;
                  var15.field_k = var3;
                  var15.b((byte) -105);
                  break L1;
                }
              } else {
                var10[var7] = ((ob) (Object) var5).a(16711680);
                var7++;
                continue L2;
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var42 = 0;
        L0: {
          var42 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param8 < 0) {
            break L0;
          } else {
            if (param4 >= wn.field_e) {
              break L0;
            } else {
              L1: {
                if (0 <= param3) {
                  break L1;
                } else {
                  if (param0 >= 0) {
                    break L1;
                  } else {
                    if (param14 >= 0) {
                      break L1;
                    } else {
                      return;
                    }
                  }
                }
              }
              L2: {
                if (wn.field_c > param3) {
                  break L2;
                } else {
                  if (wn.field_c > param0) {
                    break L2;
                  } else {
                    if (param14 >= wn.field_c) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              if (param2 == -31232) {
                L3: {
                  L4: {
                    var34 = -param4 + param8;
                    if (param15 == param4) {
                      break L4;
                    } else {
                      L5: {
                        L6: {
                          var26 = param16 << 1538891888;
                          var25 = param16 << 1538891888;
                          var18 = param3 << -1239184752;
                          var17 = param3 << -1239184752;
                          var22 = param9 << 1948944432;
                          var21 = param9 << 1948944432;
                          var30 = param10 << 2031090768;
                          var29 = param10 << 2031090768;
                          var35 = param15 + -param4;
                          var20 = (param14 - param3 << 1515881296) / var34;
                          var19 = (-param3 + param0 << -1046664656) / var35;
                          if (var20 > var19) {
                            break L6;
                          } else {
                            var36 = var19;
                            var19 = var20;
                            var20 = var36;
                            var27 = (param12 + -param16 << -1394305648) / var34;
                            var32 = (param1 + -param10 << -2017114128) / var35;
                            var24 = (-param9 + param7 << -1262119760) / var35;
                            var31 = (param13 + -param10 << -495556016) / var34;
                            var23 = (-param9 + param6 << 132799984) / var34;
                            var33 = 1;
                            var28 = (param11 - param16 << 108127568) / var35;
                            if (0 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var27 = (param11 - param16 << 757364816) / var35;
                        var32 = (param13 - param10 << 1808751536) / var34;
                        var28 = (-param16 + param12 << 894898416) / var34;
                        var31 = (-param10 + param1 << -1025944528) / var35;
                        var33 = 0;
                        var23 = (param7 - param9 << 1217619056) / var35;
                        var24 = (-param9 + param6 << -1778608944) / var34;
                        break L5;
                      }
                      L7: {
                        L8: {
                          if (param4 < 0) {
                            L9: {
                              if (param15 >= 0) {
                                break L9;
                              } else {
                                param4 = param15 - param4;
                                var17 = var17 + var19 * param4;
                                var30 = var30 + param4 * var32;
                                var29 = var29 + param4 * var31;
                                var22 = var22 + param4 * var24;
                                var26 = var26 + var28 * param4;
                                var18 = var18 + param4 * var20;
                                var21 = var21 + var23 * param4;
                                var25 = var25 + var27 * param4;
                                param4 = param15;
                                if (0 == 0) {
                                  break L7;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            param4 = -param4;
                            var29 = var29 + param4 * var31;
                            var26 = var26 + var28 * param4;
                            var21 = var21 + param4 * var23;
                            var25 = var25 + param4 * var27;
                            var22 = var22 + param4 * var24;
                            var18 = var18 + param4 * var20;
                            var30 = var30 + var32 * param4;
                            var17 = var17 + var19 * param4;
                            param4 = 0;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var36 = wn.field_h[param4];
                        L10: while (true) {
                          if (param4 >= param15) {
                            break L7;
                          } else {
                            L11: {
                              var37 = var17 >> -1619936848;
                              if ((var37 ^ -1) <= (wn.field_c ^ -1)) {
                                break L11;
                              } else {
                                var38 = (var18 >> 1138101616) + -(var17 >> -833669936);
                                if (var38 == 0) {
                                  if (var37 < 0) {
                                    break L11;
                                  } else {
                                    if (var37 >= wn.field_c) {
                                      break L11;
                                    } else {
                                      jg.a(var38, var29, var37 - -var36, 0, var25, false, var21, 0, param5, 0);
                                      break L11;
                                    }
                                  }
                                } else {
                                  if (var37 < 0) {
                                    break L11;
                                  } else {
                                    if (var37 >= wn.field_c) {
                                      break L11;
                                    } else {
                                      jg.a(var38, var29, var37 - -var36, 0, var25, false, var21, 0, param5, 0);
                                      break L11;
                                    }
                                  }
                                }
                              }
                            }
                            param4++;
                            if (wn.field_e <= param4) {
                              return;
                            } else {
                              var21 = var21 + var23;
                              var29 = var29 + var31;
                              var17 = var17 + var19;
                              var18 = var18 + var20;
                              var22 = var22 + var24;
                              var25 = var25 + var27;
                              var36 = var36 + gf.field_b;
                              var26 = var26 + var28;
                              var30 = var30 + var32;
                              if (0 == 0) {
                                continue L10;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                      }
                      L12: {
                        L13: {
                          var36 = -param15 + param8;
                          if (0 != var36) {
                            break L13;
                          } else {
                            var19 = 0;
                            var28 = 0;
                            var31 = 0;
                            var23 = 0;
                            var27 = 0;
                            var24 = 0;
                            var20 = 0;
                            var32 = 0;
                            if (0 == 0) {
                              break L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        L14: {
                          L15: {
                            var37 = param14 << 1357667888;
                            var38 = param6 << -1666279632;
                            var39 = param12 << -1062583760;
                            if (var33 != 0) {
                              break L15;
                            } else {
                              var21 = param7 << 402861456;
                              var29 = param1 << 1789477520;
                              var17 = param0 << -566761552;
                              var25 = param11 << 1538363568;
                              if (0 == 0) {
                                break L14;
                              } else {
                                break L15;
                              }
                            }
                          }
                          var30 = param1 << 2049596272;
                          var22 = param7 << -599495536;
                          var26 = param11 << 1200128656;
                          var18 = param0 << 226179920;
                          break L14;
                        }
                        var40 = param13 << -323385104;
                        var19 = (var37 - var17) / var36;
                        var27 = (-var25 + var39) / var36;
                        var23 = (-var21 + var38) / var36;
                        var28 = (-var26 + var39) / var36;
                        var31 = (var40 + -var29) / var36;
                        var32 = (-var30 + var40) / var36;
                        var24 = (-var22 + var38) / var36;
                        var20 = (-var18 + var37) / var36;
                        break L12;
                      }
                      if (0 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L16: {
                    L17: {
                      if (param8 == param4) {
                        break L17;
                      } else {
                        L18: {
                          L19: {
                            var35 = -param15 + param8;
                            if (param0 > param3) {
                              break L19;
                            } else {
                              var28 = (param12 + -param16 << 1924148528) / var34;
                              var30 = param10 << -351698576;
                              var18 = param3 << 864510064;
                              var29 = param1 << -1193920624;
                              var31 = (param13 - param1 << -1491639984) / var35;
                              var17 = param0 << 1412710672;
                              var20 = (-param3 + param14 << -758043376) / var34;
                              var32 = (-param10 + param13 << -612022160) / var34;
                              var25 = param11 << -1141956144;
                              var27 = (-param11 + param12 << -657804976) / var35;
                              var21 = param7 << 552453296;
                              var24 = (param6 + -param9 << -1763552880) / var34;
                              var19 = (param14 - param0 << 988600304) / var35;
                              var22 = param9 << 108528016;
                              var26 = param16 << -397572304;
                              var23 = (param6 - param7 << 101507280) / var35;
                              if (0 == 0) {
                                break L18;
                              } else {
                                break L19;
                              }
                            }
                          }
                          var23 = (-param9 + param6 << 92859536) / var34;
                          var32 = (-param1 + param13 << -1648936240) / var35;
                          var27 = (param12 + -param16 << -1201981872) / var34;
                          var29 = param10 << -570759568;
                          var30 = param1 << 2106587664;
                          var22 = param7 << 811540080;
                          var31 = (param13 - param10 << 1927064720) / var34;
                          var24 = (param6 + -param7 << -976621360) / var35;
                          var28 = (param12 - param11 << 150192272) / var35;
                          var26 = param11 << 466860176;
                          var25 = param16 << 1786464816;
                          var18 = param0 << 859123344;
                          var17 = param3 << -965133200;
                          var21 = param9 << -886235056;
                          var19 = (param14 - param3 << -1829111088) / var34;
                          var20 = (param14 - param0 << -1492975632) / var35;
                          break L18;
                        }
                        if (0 == 0) {
                          break L16;
                        } else {
                          break L17;
                        }
                      }
                    }
                    var27 = 0;
                    var32 = 0;
                    var18 = param0 << -190811280;
                    var29 = param10;
                    var23 = 0;
                    var17 = param3 << -770714608;
                    var24 = 0;
                    var19 = 0;
                    var21 = param9;
                    var25 = param16;
                    var28 = 0;
                    var26 = param11;
                    var31 = 0;
                    var30 = param1;
                    var20 = 0;
                    var22 = param7;
                    break L16;
                  }
                  L20: {
                    if (param4 < 0) {
                      param4 = Math.min(-param4, param15 + -param4);
                      var22 = var22 + var24 * param4;
                      var17 = var17 + var19 * param4;
                      var25 = var25 + var27 * param4;
                      var18 = var18 + param4 * var20;
                      var29 = var29 + var31 * param4;
                      var30 = var30 + param4 * var32;
                      var26 = var26 + param4 * var28;
                      var21 = var21 + var23 * param4;
                      param4 = 0;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  var33 = 0;
                  break L3;
                }
                L21: {
                  if (param4 >= 0) {
                    break L21;
                  } else {
                    param4 = -param4;
                    var26 = var26 + param4 * var28;
                    var30 = var30 + param4 * var32;
                    var29 = var29 + param4 * var31;
                    var18 = var18 + var20 * param4;
                    var25 = var25 + param4 * var27;
                    var22 = var22 + var24 * param4;
                    var17 = var17 + var19 * param4;
                    var21 = var21 + param4 * var23;
                    param4 = 0;
                    break L21;
                  }
                }
                L22: {
                  var35 = wn.field_h[param4];
                  if (param4 >= param8) {
                    break L22;
                  } else {
                    L23: {
                      var36 = var17 >> -1938759440;
                      if (var36 >= wn.field_c) {
                        break L23;
                      } else {
                        var37 = -(var17 >> 472276720) + (var18 >> 882296368);
                        if (var37 == 0) {
                          if (var36 < 0) {
                            break L23;
                          } else {
                            if (wn.field_c <= var36) {
                              break L23;
                            } else {
                              jg.a(var37, var29, var36 + var35, 0, var25, false, var21, 0, param5, 0);
                              break L23;
                            }
                          }
                        } else {
                          if (var36 < 0) {
                            break L23;
                          } else {
                            if (wn.field_c <= var36) {
                              break L23;
                            } else {
                              jg.a(var37, var29, var36 + var35, 0, var25, false, var21, 0, param5, 0);
                              break L23;
                            }
                          }
                        }
                      }
                    }
                    param4++;
                    if (param4 >= wn.field_e) {
                      return;
                    } else {
                      var25 = var25 + var27;
                      var21 = var21 + var23;
                      var26 = var26 + var28;
                      var35 = var35 + gf.field_b;
                      var22 = var22 + var24;
                      var17 = var17 + var19;
                      var18 = var18 + var20;
                      var29 = var29 + var31;
                      var30 = var30 + var32;
                      break L22;
                    }
                  }
                }
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "End turn";
        field_d = "That name is not available";
        field_b = new int[]{-1, -1, 2, -1, -1, -1, 2, 3, 0, -1, 3, -1, 1, -1, -1, -1, -1, -1, 3, 3, 0, 2};
        field_e = "Rankings";
    }
}
