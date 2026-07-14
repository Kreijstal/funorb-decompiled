/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc extends hl {
    static java.math.BigInteger field_W;
    static boolean field_cb;
    static boolean field_Y;
    static int field_X;
    static boolean field_Z;
    static boolean field_db;
    static kc field_bb;
    static String field_ab;

    final void a(boolean param0, pj param1) {
        super.a(param0, param1);
    }

    public static void q(int param0) {
        field_W = null;
        field_ab = null;
        field_bb = null;
        if (param0 != -1) {
            field_X = -91;
        }
    }

    pc(sk param0, pj param1) {
        super(param0, param1, 33, 20, 30);
    }

    final static void a(int param0, String param1, String param2, boolean param3) {
        vh.field_k = param1;
        wd.field_p = param2;
        vd.a(param3, -536866817, ki.field_d);
        if (param0 != -1) {
            Object var5 = null;
            pc.a((String) null, false);
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8, int param9, int param10, int[] param11) {
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
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        var29 = OrbDefence.field_D ? 1 : 0;
        if (param0 == 53) {
          L0: {
            var13 = 16384 / (1 + 2 * param9);
            var14 = 1 - -param9 + (-param2 - param8);
            if (var14 > 0) {
              var14 = 0;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            var15 = -param9 + -param2 + (-param8 + ul.field_f);
            if (var15 <= 0) {
              break L1;
            } else {
              var15 = 0;
              break L1;
            }
          }
          L2: {
            var16 = 0;
            var17 = 1 + param9 + param8;
            if (ul.field_f >= var17) {
              break L2;
            } else {
              var16 = var17 + -ul.field_f;
              var17 = ul.field_f;
              break L2;
            }
          }
          var18 = -param5;
          L3: while (true) {
            L4: {
              if (0 <= var18) {
                break L4;
              } else {
                L5: {
                  var19 = 0;
                  var20 = 0;
                  var21 = 0;
                  var22 = param1 - param9;
                  var23 = -1 + -(param9 << -1443105695) + var22;
                  var24 = -param9 + param8;
                  if (var24 >= 0) {
                    break L5;
                  } else {
                    var23 = var23 - var24;
                    var22 = var22 - var24;
                    var24 = 0;
                    break L5;
                  }
                }
                var25 = -var24 + var17;
                L6: while (true) {
                  L7: {
                    if (var17 <= var24) {
                      break L7;
                    } else {
                      L8: {
                        L9: {
                          if (0 != param11[param7]) {
                            break L9;
                          } else {
                            param3 = (16711422 & param6[var22]) >> -1542845023;
                            if (0 == 0) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        param3 = param11[param7];
                        break L8;
                      }
                      var19 = var19 + (255 & param3 >> -1567066416);
                      var20 = var20 + (param3 >> -877858776 & 255);
                      var22++;
                      var21 = var21 + (param3 & 255);
                      var23++;
                      param7 += 4;
                      var24++;
                      if (0 == 0) {
                        continue L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  param1++;
                  param6[param1] = var21 / var25 + ((var19 / var25 << -732464336) - -(var20 / var25 << 153847784));
                  var24 = 1 - param2;
                  var23 = var23 + var16;
                  L10: while (true) {
                    L11: {
                      if (var14 <= var24) {
                        break L11;
                      } else {
                        L12: {
                          var23++;
                          if (ul.field_e > param9 + param8 - (-param2 - var24)) {
                            L13: {
                              L14: {
                                if (0 == param11[param7]) {
                                  break L14;
                                } else {
                                  param3 = param11[param7];
                                  if (0 == 0) {
                                    break L13;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                              param3 = param6[var22] >> 851413089 & 8355711;
                              break L13;
                            }
                            var19 = var19 + (255 & param3 >> -1958359728);
                            var25++;
                            var22++;
                            var21 = var21 + (255 & param3);
                            param7 += 4;
                            var20 = var20 + ((param3 & 65380) >> -431270072);
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        var26 = var19 / var25;
                        var27 = var20 / var25;
                        var28 = var21 / var25;
                        param1++;
                        param6[param1] = var28 + ((var26 << -2046677232) - -(var27 << -1157199192));
                        var24++;
                        if (0 == 0) {
                          continue L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                    L15: while (true) {
                      L16: {
                        if (var15 <= var24) {
                          break L16;
                        } else {
                          L17: {
                            var23++;
                            param3 = param6[var23];
                            var19 = var19 - (param3 >> -2055633424 & 255);
                            if (0 > var19) {
                              var19 = 0;
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          L18: {
                            var20 = var20 - ((65465 & param3) >> -421179704);
                            if (0 > var20) {
                              var20 = 0;
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                          L19: {
                            L20: {
                              var21 = var21 - (param3 & 255);
                              if (0 == param11[param7]) {
                                break L20;
                              } else {
                                param3 = param11[param7];
                                if (0 == 0) {
                                  break L19;
                                } else {
                                  break L20;
                                }
                              }
                            }
                            param3 = 8355711 & param6[var22] >> -1392360607;
                            var12 = param3;
                            param3 = param3 | (1052688 | param3 >> -83109340);
                            param3 = param3 - 65793;
                            param3 = -(65793 & param3 >> -1961958844) + var12;
                            break L19;
                          }
                          L21: {
                            if (var21 >= 0) {
                              break L21;
                            } else {
                              var21 = 0;
                              break L21;
                            }
                          }
                          L22: {
                            var21 = var21 + (param3 & 255);
                            param7 += 4;
                            var20 = var20 + (param3 >> -188225880 & 255);
                            var22++;
                            var19 = var19 + (255 & param3 >> -290942864);
                            var26 = var13 * var19 >> -1944138834;
                            var27 = var13 * var20 >> -1234937938;
                            if (var27 <= 255) {
                              break L22;
                            } else {
                              var27 = 255;
                              break L22;
                            }
                          }
                          L23: {
                            var28 = var13 * var21 >> 938563470;
                            if (var26 <= 255) {
                              break L23;
                            } else {
                              var26 = 255;
                              break L23;
                            }
                          }
                          L24: {
                            if (255 < var28) {
                              var28 = 255;
                              break L24;
                            } else {
                              break L24;
                            }
                          }
                          param1++;
                          param6[param1] = var28 + (var27 << -1404221208) + (var26 << 940707472);
                          var24++;
                          if (0 == 0) {
                            continue L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                      L25: while (true) {
                        L26: {
                          if (var24 >= 0) {
                            break L26;
                          } else {
                            L27: {
                              L28: {
                                var23++;
                                param3 = param6[var23];
                                var25--;
                                var19 = var19 - (255 & param3 >> 440424304);
                                var20 = var20 - ((param3 & 65512) >> 1019767528);
                                var21 = var21 - (param3 & 255);
                                var26 = var19 / var25;
                                var27 = var20 / var25;
                                if (0 <= var27) {
                                  break L28;
                                } else {
                                  var27 = 0;
                                  if (0 == 0) {
                                    break L27;
                                  } else {
                                    break L28;
                                  }
                                }
                              }
                              if (var27 <= 255) {
                                break L27;
                              } else {
                                var27 = 255;
                                break L27;
                              }
                            }
                            L29: {
                              L30: {
                                var28 = var21 / var25;
                                if (var26 >= 0) {
                                  break L30;
                                } else {
                                  var26 = 0;
                                  if (0 == 0) {
                                    break L29;
                                  } else {
                                    break L30;
                                  }
                                }
                              }
                              if (255 >= var26) {
                                break L29;
                              } else {
                                var26 = 255;
                                break L29;
                              }
                            }
                            L31: {
                              L32: {
                                if (var28 >= 0) {
                                  break L32;
                                } else {
                                  var28 = 0;
                                  if (0 == 0) {
                                    break L31;
                                  } else {
                                    break L32;
                                  }
                                }
                              }
                              if (var28 <= 255) {
                                break L31;
                              } else {
                                var28 = 255;
                                break L31;
                              }
                            }
                            param1++;
                            param6[param1] = (var26 << -533256880) - (-(var27 << -699228824) + -var28);
                            var24++;
                            if (0 == 0) {
                              continue L25;
                            } else {
                              break L26;
                            }
                          }
                        }
                        param7 = param7 + param10;
                        param1 = param1 + param4;
                        var18++;
                        if (0 == 0) {
                          continue L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final static void f(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        ef var4_ref_ef = null;
        Object var5 = null;
        int var6 = 0;
        Object var7 = null;
        vb var9 = null;
        se var10 = null;
        byte[] var14 = null;
        var6 = OrbDefence.field_D ? 1 : 0;
        var10 = cd.field_t;
        var2 = var10.b((byte) 90);
        if (var2 == 0) {
          var9 = (vb) (Object) e.field_b.b((byte) -28);
          if (var9 != null) {
            L0: {
              var4 = var10.b((byte) 90);
              if (var4 == 0) {
                var5 = null;
                break L0;
              } else {
                var14 = new byte[var4];
                var10.a((byte) 108, var14, 0, var4);
                break L0;
              }
            }
            var10.field_i = var10.field_i + 4;
            if (!var10.h(9982)) {
              th.a(108);
              return;
            } else {
              L1: {
                var9.b(57);
                if (!param0) {
                  break L1;
                } else {
                  var7 = null;
                  pc.a((byte) 57, -8, -11, 81, 3, 33, (int[]) null, -76, -25, 43, -2, (int[]) null);
                  break L1;
                }
              }
              return;
            }
          } else {
            th.a(119);
            return;
          }
        } else {
          L2: {
            if (var2 != 1) {
              pe.a((byte) -13, (Throwable) null, "A1: " + sj.b(true));
              th.a(119);
              break L2;
            } else {
              var3 = var10.l(0);
              var4_ref_ef = (ef) (Object) sd.field_a.b((byte) -113);
              L3: while (true) {
                L4: {
                  if (var4_ref_ef == null) {
                    break L4;
                  } else {
                    if (var4_ref_ef.field_f == var3) {
                      break L4;
                    } else {
                      var4_ref_ef = (ef) (Object) sd.field_a.d(853);
                      continue L3;
                    }
                  }
                }
                if (var4_ref_ef == null) {
                  th.a(126);
                  return;
                } else {
                  var4_ref_ef.b(57);
                  break L2;
                }
              }
            }
          }
          L5: {
            if (!param0) {
              break L5;
            } else {
              var7 = null;
              pc.a((byte) 57, -8, -11, 81, 3, 33, (int[]) null, -76, -25, 43, -2, (int[]) null);
              break L5;
            }
          }
          return;
        }
    }

    final static void a(String param0, boolean param1) {
        ug.field_r = param0;
        if (!param1) {
            field_bb = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_W = new java.math.BigInteger("65537");
        field_Z = true;
        field_db = false;
    }
}
