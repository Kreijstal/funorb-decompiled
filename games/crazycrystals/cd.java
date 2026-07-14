/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cd extends ea implements Cloneable {
    private int field_y;
    static int[] field_v;
    private int field_C;
    static String field_A;
    private int field_t;
    static int[][] field_z;
    private boolean field_B;
    private int field_w;
    private int field_x;
    static int[] field_u;

    private final dl h(int param0) {
        if (!(0 >= ((cd) this).field_t)) {
            return rf.field_C;
        }
        if (((cd) this).field_t < param0) {
            return qi.field_a;
        }
        if (!(((cd) this).field_C <= 0)) {
            return ba.field_j;
        }
        return ln.field_d;
    }

    public static void b(boolean param0) {
        field_u = null;
        field_v = null;
        field_A = null;
        if (param0) {
            return;
        }
        field_z = null;
    }

    final f e(int param0, int param1, f[][] param2, int param3) {
        f var5 = null;
        de var6 = null;
        int var7 = 0;
        var7 = CrazyCrystals.field_B;
        var5 = ((cd) this).field_l;
        L0: while (true) {
          L1: {
            if (var5 instanceof de) {
              var6 = (de) (Object) var5;
              if (var6.field_j == null) {
                L2: {
                  if (!vh.field_a) {
                    break L2;
                  } else {
                    if ((uo.field_o ^ -1) != -5) {
                      break L2;
                    } else {
                      if (w.field_f + 2 != param1) {
                        if (w.field_f + 2 != param1) {
                          break L2;
                        } else {
                          if (ia.field_i + 27 != param0) {
                            break L2;
                          } else {
                            va.field_c = 2;
                            break L2;
                          }
                        }
                      } else {
                        if (w.field_f + 2 != param1) {
                          break L2;
                        } else {
                          if (ia.field_i + 27 != param0) {
                            break L2;
                          } else {
                            va.field_c = 2;
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
                wd.field_j = wd.field_j + 1;
                mb.field_g = mb.field_g + ob.field_l;
                fp.field_a = fp.field_a + 256;
                je.field_j = je.field_j + 128;
                we.field_h = we.field_h + 256;
                b.field_a = b.field_a + 128;
                ua.field_a.a(256, param1 * 12, 12 * param0, 0, (byte) -111);
                ((cd) this).field_B = false;
                var6.field_j = (ea) this;
                return ((cd) this).a(param2, param0, (f) this, 11460, param1);
              } else {
                break L1;
              }
            } else {
              if (var5 instanceof pn) {
                var5 = ((pn) (Object) var5).field_l;
                continue L0;
              } else {
                break L1;
              }
            }
          }
          L3: {
            if (param3 >= 120) {
              break L3;
            } else {
              f discarded$1 = ((cd) this).e(-51, 45, (f[][]) null, -88);
              break L3;
            }
          }
          return (f) this;
        }
    }

    final void a(int param0, DataInputStream param1, int param2, byte param3, int param4) throws IOException {
        int var6 = param1.readUnsignedByte();
        if (param3 >= -69) {
            ((cd) this).field_w = 52;
        }
        ((cd) this).field_t = mo.field_h[3 & var6];
        ((cd) this).field_C = kl.field_S[3 & var6];
        int var7 = (var6 >> -113979391 & 2) - 1;
        ((cd) this).field_y = var7 * -((cd) this).field_t;
        ((cd) this).field_x = ((cd) this).field_C * var7;
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        L0: {
          if (!((cd) this).field_B) {
            break L0;
          } else {
            this.a(0.0, param3, 1, param2, param4, -72, param1);
            break L0;
          }
        }
        L1: {
          L2: {
            if ((param2 ^ -1) != -25) {
              break L2;
            } else {
              if ((param3 ^ -1) == -25) {
                qj.field_b.a(param1, -param3 + param4);
                if (param0) {
                  this.i(param5 + -4261).a(param1, param4 - param3);
                  this.h(0).a(param1, param4 + -param3);
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L2;
              }
            }
          }
          qj.field_b.b(param1, param4 - param3, param2 * 2, 3 * param3);
          if (!param0) {
            break L1;
          } else {
            this.i(0).b(param1, -param3 + param4, 2 * param2, 3 * param3);
            this.h(param5 ^ 4261).b(param1, param4 - param3, 2 * param2, 3 * param3);
            break L1;
          }
        }
        if (param5 != 4261) {
          return;
        } else {
          L3: {
            if (!((cd) this).field_B) {
              break L3;
            } else {
              this.a(1.5707963267948966, param3, -1, param2, param4, -114, param1);
              break L3;
            }
          }
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int[] param15, int param16) {
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
        int var41 = 0;
        int var42 = 0;
        L0: {
          var42 = CrazyCrystals.field_B;
          if (0 > param4) {
            break L0;
          } else {
            if (param2 >= nb.field_b) {
              break L0;
            } else {
              L1: {
                if (param0 >= 0) {
                  break L1;
                } else {
                  if (param13 >= 0) {
                    break L1;
                  } else {
                    if (0 > param6) {
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (param0 < nb.field_d) {
                  break L2;
                } else {
                  if (nb.field_d > param13) {
                    break L2;
                  } else {
                    if (nb.field_d <= param6) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                if (param14 == 2) {
                  break L3;
                } else {
                  cd.e((byte) -92);
                  break L3;
                }
              }
              L4: {
                L5: {
                  var34 = param4 - param2;
                  if (param2 == param8) {
                    break L5;
                  } else {
                    L6: {
                      L7: {
                        var26 = param16 << 942910160;
                        var25 = param16 << 942910160;
                        var18 = param0 << -536648880;
                        var17 = param0 << -536648880;
                        var30 = param7 << 1189275536;
                        var29 = param7 << 1189275536;
                        var22 = param10 << 1910417200;
                        var21 = param10 << 1910417200;
                        var35 = param8 - param2;
                        var20 = (param6 - param0 << -440338384) / var34;
                        var19 = (-param0 + param13 << -364161072) / var35;
                        if (var20 <= var19) {
                          break L7;
                        } else {
                          var33 = 0;
                          var27 = (param9 + -param16 << 1151134064) / var35;
                          var31 = (-param7 + param3 << -1076413584) / var35;
                          var32 = (param1 - param7 << -234992176) / var34;
                          var23 = (-param10 + param5 << -1140930608) / var35;
                          var24 = (param12 + -param10 << 1580910352) / var34;
                          var28 = (param11 - param16 << -941988208) / var34;
                          if (0 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var33 = 1;
                      var32 = (-param7 + param3 << -1013333552) / var35;
                      var31 = (-param7 + param1 << 927505872) / var34;
                      var28 = (-param16 + param9 << -617375376) / var35;
                      var23 = (param12 - param10 << 1840271184) / var34;
                      var27 = (param11 - param16 << 143982096) / var34;
                      var24 = (-param10 + param5 << 322539152) / var35;
                      var36 = var19;
                      var19 = var20;
                      var20 = var36;
                      break L6;
                    }
                    L8: {
                      L9: {
                        if (param2 >= 0) {
                          break L9;
                        } else {
                          L10: {
                            if (param8 < 0) {
                              break L10;
                            } else {
                              param2 = -param2;
                              var25 = var25 + param2 * var27;
                              var22 = var22 + param2 * var24;
                              var30 = var30 + var32 * param2;
                              var18 = var18 + param2 * var20;
                              var21 = var21 + var23 * param2;
                              var17 = var17 + var19 * param2;
                              var29 = var29 + var31 * param2;
                              var26 = var26 + param2 * var28;
                              param2 = 0;
                              if (0 == 0) {
                                break L9;
                              } else {
                                break L10;
                              }
                            }
                          }
                          param2 = param8 + -param2;
                          var21 = var21 + var23 * param2;
                          var25 = var25 + param2 * var27;
                          var17 = var17 + var19 * param2;
                          var30 = var30 + var32 * param2;
                          var29 = var29 + param2 * var31;
                          var26 = var26 + var28 * param2;
                          var18 = var18 + var20 * param2;
                          var22 = var22 + param2 * var24;
                          param2 = param8;
                          if (0 == 0) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                      var36 = nb.field_a[param2];
                      L11: while (true) {
                        if (param2 >= param8) {
                          break L8;
                        } else {
                          L12: {
                            var37 = var17 >> 2021516944;
                            if ((var37 ^ -1) <= (nb.field_d ^ -1)) {
                              break L12;
                            } else {
                              L13: {
                                var38 = (var18 >> 1016759280) - (var17 >> -976943344);
                                if (var38 != 0) {
                                  break L13;
                                } else {
                                  if (var37 < 0) {
                                    break L12;
                                  } else {
                                    if (var37 < nb.field_d) {
                                      w.a(var21, (byte) -52, param15, 0, var25, 0, 0, var29, var38, var37 + var36);
                                      if (0 == 0) {
                                        break L12;
                                      } else {
                                        break L13;
                                      }
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                              L14: {
                                var39 = (var22 - var21) / var38;
                                var40 = (-var25 + var26) / var38;
                                var41 = (-var29 + var30) / var38;
                                if (var37 - -var38 < nb.field_d) {
                                  break L14;
                                } else {
                                  var38 = -1 + nb.field_d - var37;
                                  break L14;
                                }
                              }
                              L15: {
                                if (var37 < 0) {
                                  break L15;
                                } else {
                                  w.a(var21, (byte) -52, param15, var40, var25, var41, var39, var29, var38, var37 + var36);
                                  if (0 == 0) {
                                    break L12;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                              w.a(-(var39 * var37) + var21, (byte) -52, param15, var40, -(var37 * var40) + var25, var41, var39, var29 - var41 * var37, var37 + var38, var36);
                              break L12;
                            }
                          }
                          param2++;
                          if (nb.field_b <= param2) {
                            return;
                          } else {
                            var30 = var30 + var32;
                            var29 = var29 + var31;
                            var17 = var17 + var19;
                            var25 = var25 + var27;
                            var22 = var22 + var24;
                            var18 = var18 + var20;
                            var36 = var36 + kh.field_l;
                            var26 = var26 + var28;
                            var21 = var21 + var23;
                            if (0 == 0) {
                              continue L11;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                    }
                    L16: {
                      L17: {
                        var36 = param4 - param8;
                        if (var36 == 0) {
                          break L17;
                        } else {
                          L18: {
                            L19: {
                              var37 = param6 << -1190553872;
                              var38 = param12 << 2109592176;
                              var39 = param11 << -1892900976;
                              if (var33 == 0) {
                                break L19;
                              } else {
                                var30 = param3 << 1793408176;
                                var18 = param13 << 281083920;
                                var26 = param9 << 345094960;
                                var22 = param5 << -1799047504;
                                if (0 == 0) {
                                  break L18;
                                } else {
                                  break L19;
                                }
                              }
                            }
                            var29 = param3 << -2043655664;
                            var21 = param5 << 907583152;
                            var17 = param13 << 1921685328;
                            var25 = param9 << 1663306128;
                            break L18;
                          }
                          var40 = param1 << 83775760;
                          var19 = (var37 + -var17) / var36;
                          var24 = (var38 - var22) / var36;
                          var28 = (-var26 + var39) / var36;
                          var32 = (var40 - var30) / var36;
                          var31 = (-var29 + var40) / var36;
                          var20 = (var37 - var18) / var36;
                          var27 = (-var25 + var39) / var36;
                          var23 = (-var21 + var38) / var36;
                          if (0 == 0) {
                            break L16;
                          } else {
                            break L17;
                          }
                        }
                      }
                      var28 = 0;
                      var20 = 0;
                      var31 = 0;
                      var19 = 0;
                      var24 = 0;
                      var32 = 0;
                      var27 = 0;
                      var23 = 0;
                      break L16;
                    }
                    if (0 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                L20: {
                  L21: {
                    if (param2 == param4) {
                      break L21;
                    } else {
                      L22: {
                        L23: {
                          var35 = param4 + -param8;
                          if (param13 > param0) {
                            break L23;
                          } else {
                            var24 = (-param10 + param12 << 1986306224) / var34;
                            var29 = param3 << -958257136;
                            var26 = param16 << 598671696;
                            var32 = (-param7 + param1 << -698323152) / var34;
                            var17 = param13 << 1257368752;
                            var23 = (-param5 + param12 << 1905544688) / var35;
                            var18 = param0 << 1691202544;
                            var21 = param5 << 1349582000;
                            var31 = (-param3 + param1 << 609065712) / var35;
                            var27 = (-param9 + param11 << -1189486128) / var35;
                            var20 = (param6 - param0 << 811079664) / var34;
                            var19 = (param6 + -param13 << 568916656) / var35;
                            var30 = param7 << 825563696;
                            var25 = param9 << -2106505776;
                            var28 = (param11 - param16 << -1993504112) / var34;
                            var22 = param10 << 1412816624;
                            if (0 == 0) {
                              break L22;
                            } else {
                              break L23;
                            }
                          }
                        }
                        var29 = param7 << 440519088;
                        var20 = (param6 - param13 << 649987376) / var35;
                        var26 = param9 << 1160139760;
                        var23 = (-param10 + param12 << -1507449392) / var34;
                        var31 = (-param7 + param1 << 1644814000) / var34;
                        var21 = param10 << -2136066000;
                        var25 = param16 << -478261072;
                        var27 = (param11 - param16 << 1099394512) / var34;
                        var22 = param5 << -2097269168;
                        var19 = (-param0 + param6 << 958941168) / var34;
                        var30 = param3 << 1812038288;
                        var18 = param13 << -1988564368;
                        var17 = param0 << -156493840;
                        var32 = (-param3 + param1 << 1419188816) / var35;
                        var24 = (param12 + -param5 << -996273936) / var35;
                        var28 = (param11 - param9 << -1983302448) / var35;
                        break L22;
                      }
                      if (0 == 0) {
                        break L20;
                      } else {
                        break L21;
                      }
                    }
                  }
                  var24 = 0;
                  var28 = 0;
                  var17 = param0 << -234334256;
                  var31 = 0;
                  var22 = param5;
                  var29 = param7;
                  var25 = param16;
                  var30 = param3;
                  var23 = 0;
                  var19 = 0;
                  var27 = 0;
                  var20 = 0;
                  var26 = param9;
                  var21 = param10;
                  var32 = 0;
                  var18 = param13 << 2068156528;
                  break L20;
                }
                L24: {
                  if (param2 < 0) {
                    param2 = Math.min(-param2, param8 - param2);
                    var25 = var25 + var27 * param2;
                    var22 = var22 + param2 * var24;
                    var18 = var18 + param2 * var20;
                    var29 = var29 + param2 * var31;
                    var21 = var21 + var23 * param2;
                    var30 = var30 + param2 * var32;
                    var17 = var17 + var19 * param2;
                    var26 = var26 + param2 * var28;
                    param2 = 0;
                    break L24;
                  } else {
                    break L24;
                  }
                }
                var33 = 0;
                break L4;
              }
              L25: {
                if (param2 >= 0) {
                  break L25;
                } else {
                  param2 = -param2;
                  var30 = var30 + var32 * param2;
                  var17 = var17 + var19 * param2;
                  var25 = var25 + var27 * param2;
                  var18 = var18 + var20 * param2;
                  var29 = var29 + param2 * var31;
                  var21 = var21 + var23 * param2;
                  var22 = var22 + var24 * param2;
                  var26 = var26 + var28 * param2;
                  param2 = 0;
                  break L25;
                }
              }
              var35 = nb.field_a[param2];
              if (param4 > param2) {
                L26: {
                  var36 = var17 >> -657143760;
                  if (var36 >= nb.field_d) {
                    break L26;
                  } else {
                    L27: {
                      var37 = (var18 >> 562565104) + -(var17 >> -343370928);
                      if (var37 == 0) {
                        break L27;
                      } else {
                        L28: {
                          var38 = (-var21 + var22) / var37;
                          var39 = (-var25 + var26) / var37;
                          var40 = (var30 + -var29) / var37;
                          if (var36 - -var37 < nb.field_d) {
                            break L28;
                          } else {
                            var37 = nb.field_d + (-var36 + -1);
                            break L28;
                          }
                        }
                        L29: {
                          L30: {
                            if (var36 < 0) {
                              break L30;
                            } else {
                              w.a(var21, (byte) -52, param15, var39, var25, var40, var38, var29, var37, var35 + var36);
                              if (0 == 0) {
                                break L29;
                              } else {
                                break L30;
                              }
                            }
                          }
                          w.a(var21 + -(var36 * var38), (byte) -52, param15, var39, -(var39 * var36) + var25, var40, var38, -(var36 * var40) + var29, var37 + var36, var35);
                          break L29;
                        }
                        if (0 == 0) {
                          break L26;
                        } else {
                          break L27;
                        }
                      }
                    }
                    if (var36 < 0) {
                      break L26;
                    } else {
                      if (var36 < nb.field_d) {
                        w.a(var21, (byte) -52, param15, 0, var25, 0, 0, var29, var37, var35 + var36);
                        break L26;
                      } else {
                        break L26;
                      }
                    }
                  }
                }
                param2++;
                if (nb.field_b <= param2) {
                  return;
                } else {
                  var30 = var30 + var32;
                  var29 = var29 + var31;
                  var21 = var21 + var23;
                  var25 = var25 + var27;
                  var35 = var35 + kh.field_l;
                  var22 = var22 + var24;
                  var26 = var26 + var28;
                  var17 = var17 + var19;
                  var18 = var18 + var20;
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    final void a(int param0, f[][] param1, int param2, int param3) {
        if (param0 != -35) {
            ((cd) this).field_w = 37;
        }
    }

    final static boolean a(CharSequence param0, byte param1) {
        if (param1 > -92) {
            Object var3 = null;
            boolean discarded$0 = cd.a((CharSequence) null, (byte) 47);
        }
        return wi.a(48, 10, param0, true);
    }

    final boolean g(int param0) {
        if (param0 != 0) {
            Object var3 = null;
            boolean discarded$0 = cd.a((CharSequence) null, (byte) 26);
            return false;
        }
        return false;
    }

    private final void a(double param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var10 = -110 % ((param5 - 47) / 56);
        int var9 = param3 + param6 << 636417188;
        int var11 = (param4 << 295502244) - -(param1 << 965487939);
        double var12 = param0 + (double)(((cd) this).field_w + ((cd) this).field_m) * 0.16534698176788384;
        int var14 = (int)(13.856406460551018 * (Math.sin(var12) * (double)param3));
        int var15 = (int)(13.856406460551018 * (Math.cos(var12) * (double)param1));
        int var16 = (((cd) this).field_x - ((cd) this).field_y) * (((cd) this).field_C + ((cd) this).field_t);
        kh.a(var9 + -(var14 * var16), var11 - var15 + (int)((double)param1 * 4.0) * param2, param3 << -1716186879, 15, f.field_c);
        kh.a(var16 * var14 + var9, (int)(4.0 * (double)param1) * param2 + (var11 - -var15), param3 << 1175657953, 15, f.field_c);
    }

    final f a(f[][] param0, int param1, f param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = CrazyCrystals.field_B;
          if (ab.field_D != null) {
            break L0;
          } else {
            gl.field_e = gl.field_e - 1;
            if (param2 != null) {
              var6 = param2.a(false);
              var7 = 0;
              L1: while (true) {
                if (3 <= var7) {
                  break L0;
                } else {
                  if (0 != (1 << var7 & var6)) {
                    q.field_a[var7].a(true, (byte) -125);
                    mb.field_g = mb.field_g + 250;
                    fn.field_j = fn.field_j + 300;
                    fn.field_j = fn.field_j - 50;
                    mb.field_g = mb.field_g - 50;
                    mb.field_g = mb.field_g - ob.field_l;
                    wd.field_j = wd.field_j - 1;
                    b.field_a = b.field_a - 1;
                    je.field_j = je.field_j - 1;
                    we.field_h = we.field_h - 1;
                    fp.field_a = fp.field_a - 2;
                    we.field_h = we.field_h + 40;
                    je.field_j = je.field_j + 20;
                    fp.field_a = fp.field_a + 40;
                    b.field_a = b.field_a + 20;
                    if (gl.field_e == 0) {
                      va.field_d = va.field_d | 1 << var7;
                      var7++;
                      continue L1;
                    } else {
                      var7++;
                      continue L1;
                    }
                  } else {
                    var7++;
                    continue L1;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
        if (param3 != 11460) {
          return null;
        } else {
          return ((cd) this).field_l;
        }
    }

    final nj a(int param0, nj param1) {
        if (param0 != 23525) {
          return null;
        } else {
          return ng.a(wd.field_h, param1, (f) (Object) new cd((f) (Object) new kp(-1), 0, 0, 0, 0), (byte) -83, wg.field_N);
        }
    }

    private final dl i(int param0) {
        if (((cd) this).field_x >= 0) {
          if (-1 > (((cd) this).field_x ^ -1)) {
            return na.field_eb;
          } else {
            if (param0 > ((cd) this).field_y) {
              return mk.field_a;
            } else {
              return tl.field_b;
            }
          }
        } else {
          return vp.field_d;
        }
    }

    final void c(boolean param0, boolean param1) {
        if (!param0) {
            dl discarded$0 = this.i(-72);
        }
        if (param1) {
            return;
        }
        gl.field_e = gl.field_e + 1;
    }

    final f a(sl param0, f[][] param1, int param2, int param3, int param4, int param5, int param6) {
        ((cd) this).field_w = (((cd) this).field_w + 12) % 38;
        if (param4 != 17512) {
            ((cd) this).field_B = true;
        }
        return super.a(param0, param1, param2, param3, 17512, param5, param6);
    }

    cd(f param0, int param1, int param2, int param3, int param4) {
        super(param0);
        ((cd) this).field_t = param1;
        ((cd) this).field_y = param4;
        ((cd) this).field_x = param3;
        ((cd) this).field_C = param2;
    }

    final static void e(byte param0) {
        oi.field_d.field_j = 0;
        oi.field_d.field_p = 0;
        if (param0 > -29) {
            Object var2 = null;
            boolean discarded$0 = cd.a((CharSequence) null, (byte) 43);
        }
    }

    final sl a(f[][] param0, int param1, boolean param2, int param3, int param4, int param5) {
        ck.field_db.a(64, param4 * 12, param1 * 12, 60, (byte) -111);
        if (param2) {
            f discarded$0 = ((cd) this).e(22, 29, (f[][]) null, 20);
        }
        return super.a(param0, param1, false, param3, param4, param5);
    }

    final void f(int param0, int param1, f[][] param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = CrazyCrystals.field_B;
          ((cd) this).field_B = false;
          var5 = ((cd) this).field_x;
          var6 = ((cd) this).field_y;
          ((cd) this).field_x = -((cd) this).field_t;
          ((cd) this).field_y = -((cd) this).field_C;
          ((cd) this).field_t = var5;
          ((cd) this).field_C = var6;
          if (param0 == 1) {
            break L0;
          } else {
            ((cd) this).field_x = -119;
            break L0;
          }
        }
        var7 = 0;
        L1: while (true) {
          if (5 > var7) {
            if (param2[((cd) this).field_C + param1][param3 + ((cd) this).field_t].a(16736352, param2, false, ((cd) this).field_C, param1, param3, (ea) this, ((cd) this).field_t)) {
              ((cd) this).field_B = true;
              sl discarded$1 = ((cd) this).a(param2, param1, false, ((cd) this).field_C, param3, ((cd) this).field_t);
              return;
            } else {
              fn.field_j = fn.field_j - ob.field_l;
              wd.field_j = wd.field_j + 1;
              ((cd) this).a((byte) 104, param2[((cd) this).field_C + param1][param3 - -((cd) this).field_t]);
              var5 = -((cd) this).field_x;
              var6 = -((cd) this).field_y;
              ((cd) this).field_x = ((cd) this).field_t;
              ((cd) this).field_y = ((cd) this).field_C;
              ((cd) this).field_t = var5;
              ((cd) this).field_C = var6;
              var7++;
              continue L1;
            }
          } else {
            return;
          }
        }
    }

    final f b(f[][] param0, int param1, byte param2, int param3) {
        int var5 = 117 % ((-43 - param2) / 51);
        if (!((((cd) this).field_o | ((cd) this).field_s) == 0)) {
            ck.field_db.a(64, 12 * param3 + ((cd) this).field_m * ((cd) this).field_o, 12 * param1 + ((cd) this).field_s * ((cd) this).field_m, 60, (byte) -111);
        }
        return super.b(param0, param1, (byte) -109, param3);
    }

    final int a(boolean param0, int param1) {
        if (param1 != 0) {
            field_v = null;
        }
        return 12;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "Mouse over an icon for details";
    }
}
