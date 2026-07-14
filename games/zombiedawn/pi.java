/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pi extends dh implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    static long field_i;
    static bm field_l;
    private java.awt.image.ColorModel field_j;
    private java.awt.image.ImageConsumer field_h;
    static int[] field_k;

    final void a(java.awt.Graphics param0, int param1, int param2, byte param3) {
        this.a((byte) 105);
        boolean discarded$9 = param0.drawImage(((pi) this).field_f, param2, param1, (java.awt.image.ImageObserver) this);
        if (param3 != 58) {
            pi.a(82, 39, (int[]) null, -71, (byte) 97, 95, -74, -52, -27, -83, -68, 66, 42, -121, 2, -104, -2);
        }
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        return true;
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        if (((pi) this).field_h == param0) {
            ((pi) this).field_h = null;
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    final static void a(int param0, int param1, int[] param2, int param3, byte param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
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
          var42 = ZombieDawn.field_J;
          if (0 > param11) {
            break L0;
          } else {
            if (en.field_d > param15) {
              L1: {
                if (0 <= param9) {
                  break L1;
                } else {
                  if (param1 >= 0) {
                    break L1;
                  } else {
                    if (param10 < 0) {
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (param4 == -104) {
                  break L2;
                } else {
                  field_l = null;
                  break L2;
                }
              }
              L3: {
                if (param9 < en.field_g) {
                  break L3;
                } else {
                  if (en.field_g > param1) {
                    break L3;
                  } else {
                    if (en.field_g > param10) {
                      break L3;
                    } else {
                      return;
                    }
                  }
                }
              }
              L4: {
                L5: {
                  var34 = param11 - param15;
                  if (param15 != param16) {
                    break L5;
                  } else {
                    L6: {
                      L7: {
                        if (param15 != param11) {
                          break L7;
                        } else {
                          var24 = 0;
                          var27 = 0;
                          var31 = 0;
                          var32 = 0;
                          var22 = param14;
                          var26 = param6;
                          var17 = param9 << 2001860016;
                          var20 = 0;
                          var18 = param1 << 71761744;
                          var30 = param13;
                          var29 = param8;
                          var21 = param3;
                          var28 = 0;
                          var19 = 0;
                          var23 = 0;
                          var25 = param12;
                          if (0 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      L8: {
                        var35 = param11 - param16;
                        if (param1 <= param9) {
                          break L8;
                        } else {
                          var25 = param12 << 2085803600;
                          var29 = param8 << -1238483376;
                          var17 = param9 << -888774352;
                          var28 = (-param6 + param5 << -1382024944) / var35;
                          var32 = (-param13 + param7 << -1744028464) / var35;
                          var23 = (param0 + -param3 << -225103120) / var34;
                          var26 = param6 << -668988240;
                          var21 = param3 << 316724880;
                          var27 = (-param12 + param5 << 457350448) / var34;
                          var20 = (-param1 + param10 << 829868560) / var35;
                          var19 = (-param9 + param10 << 893390416) / var34;
                          var24 = (-param14 + param0 << 1573711920) / var35;
                          var18 = param1 << 1556182544;
                          var22 = param14 << 541262192;
                          var31 = (param7 - param8 << 774077776) / var34;
                          var30 = param13 << -2130075888;
                          if (0 == 0) {
                            break L6;
                          } else {
                            break L8;
                          }
                        }
                      }
                      var30 = param8 << -967047440;
                      var25 = param6 << -1279965296;
                      var19 = (-param1 + param10 << 1835529168) / var35;
                      var20 = (param10 + -param9 << -1863289072) / var34;
                      var31 = (-param13 + param7 << 1004829392) / var35;
                      var27 = (-param6 + param5 << 2124308624) / var35;
                      var17 = param1 << -1281152784;
                      var18 = param9 << -592467984;
                      var22 = param3 << -522121904;
                      var29 = param13 << -1387492208;
                      var21 = param14 << -947350352;
                      var26 = param12 << 665800176;
                      var32 = (param7 - param8 << -82275152) / var34;
                      var24 = (-param3 + param0 << -566742128) / var34;
                      var28 = (param5 + -param12 << 1500460176) / var34;
                      var23 = (-param14 + param0 << -974891984) / var35;
                      break L6;
                    }
                    L9: {
                      if (param15 >= 0) {
                        break L9;
                      } else {
                        param15 = Math.min(-param15, -param15 + param16);
                        var30 = var30 + var32 * param15;
                        var18 = var18 + param15 * var20;
                        var25 = var25 + param15 * var27;
                        var22 = var22 + param15 * var24;
                        var17 = var17 + param15 * var19;
                        var26 = var26 + var28 * param15;
                        var21 = var21 + param15 * var23;
                        var29 = var29 + param15 * var31;
                        param15 = 0;
                        break L9;
                      }
                    }
                    var33 = 0;
                    if (0 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                L10: {
                  L11: {
                    var30 = param8 << -2063832592;
                    var29 = param8 << -2063832592;
                    var26 = param12 << -1139033936;
                    var25 = param12 << -1139033936;
                    var22 = param3 << 1709554608;
                    var21 = param3 << 1709554608;
                    var18 = param9 << -1118144304;
                    var17 = param9 << -1118144304;
                    var35 = -param15 + param16;
                    var19 = (-param9 + param1 << 489639120) / var35;
                    var20 = (-param9 + param10 << 1034497584) / var34;
                    if (var20 <= var19) {
                      break L11;
                    } else {
                      var23 = (-param3 + param14 << -602111824) / var35;
                      var31 = (-param8 + param13 << 1699406864) / var35;
                      var27 = (-param12 + param6 << 653086512) / var35;
                      var28 = (-param12 + param5 << 18384592) / var34;
                      var32 = (-param8 + param7 << -1998301328) / var34;
                      var24 = (-param3 + param0 << -754232688) / var34;
                      var33 = 0;
                      if (0 == 0) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  var32 = (-param8 + param13 << -355113552) / var35;
                  var27 = (-param12 + param5 << -1769237872) / var34;
                  var24 = (param14 - param3 << 1294840208) / var35;
                  var31 = (-param8 + param7 << -1333174224) / var34;
                  var28 = (-param12 + param6 << 1193182064) / var35;
                  var23 = (param0 - param3 << 576746512) / var34;
                  var36 = var19;
                  var19 = var20;
                  var20 = var36;
                  var33 = 1;
                  break L10;
                }
                L12: {
                  L13: {
                    if (param15 >= 0) {
                      var36 = en.field_b[param15];
                      L14: while (true) {
                        if (param16 <= param15) {
                          break L12;
                        } else {
                          L15: {
                            var37 = var17 >> -99300336;
                            if (en.field_g > var37) {
                              var38 = -(var17 >> 1618319504) + (var18 >> 2107945840);
                              if (0 == var38) {
                                if (var37 < 0) {
                                  break L15;
                                } else {
                                  if (en.field_g <= var37) {
                                    break L15;
                                  } else {
                                    fg.a(var21, 0, 0, var38, var29, 61653921, var36 + var37, 0, var25, param2);
                                    break L15;
                                  }
                                }
                              } else {
                                if (var37 < 0) {
                                  break L15;
                                } else {
                                  if (en.field_g <= var37) {
                                    break L15;
                                  } else {
                                    fg.a(var21, 0, 0, var38, var29, 61653921, var36 + var37, 0, var25, param2);
                                    break L15;
                                  }
                                }
                              }
                            } else {
                              break L15;
                            }
                          }
                          param15++;
                          if (param15 >= en.field_d) {
                            return;
                          } else {
                            var18 = var18 + var20;
                            var26 = var26 + var28;
                            var30 = var30 + var32;
                            var21 = var21 + var23;
                            var22 = var22 + var24;
                            var25 = var25 + var27;
                            var29 = var29 + var31;
                            var17 = var17 + var19;
                            var36 = var36 + bi.field_f;
                            if (0 == 0) {
                              continue L14;
                            } else {
                              break L13;
                            }
                          }
                        }
                      }
                    } else {
                      L16: {
                        if (param16 >= 0) {
                          break L16;
                        } else {
                          param15 = param16 - param15;
                          var17 = var17 + param15 * var19;
                          var21 = var21 + var23 * param15;
                          var22 = var22 + param15 * var24;
                          var18 = var18 + var20 * param15;
                          var29 = var29 + param15 * var31;
                          var25 = var25 + param15 * var27;
                          var26 = var26 + var28 * param15;
                          var30 = var30 + param15 * var32;
                          param15 = param16;
                          if (0 == 0) {
                            break L12;
                          } else {
                            break L16;
                          }
                        }
                      }
                      param15 = -param15;
                      var18 = var18 + var20 * param15;
                      var21 = var21 + param15 * var23;
                      var22 = var22 + var24 * param15;
                      var26 = var26 + var28 * param15;
                      var17 = var17 + param15 * var19;
                      var30 = var30 + param15 * var32;
                      var29 = var29 + var31 * param15;
                      var25 = var25 + param15 * var27;
                      param15 = 0;
                      break L13;
                    }
                  }
                  var36 = en.field_b[param15];
                  L17: while (true) {
                    if (param16 <= param15) {
                      break L12;
                    } else {
                      L18: {
                        var37 = var17 >> -99300336;
                        if (en.field_g > var37) {
                          var38 = -(var17 >> 1618319504) + (var18 >> 2107945840);
                          if (0 == var38) {
                            if (var37 < 0) {
                              break L18;
                            } else {
                              if (en.field_g <= var37) {
                                break L18;
                              } else {
                                fg.a(var21, 0, 0, var38, var29, 61653921, var36 + var37, 0, var25, param2);
                                break L18;
                              }
                            }
                          } else {
                            if (var37 < 0) {
                              break L18;
                            } else {
                              if (en.field_g <= var37) {
                                break L18;
                              } else {
                                fg.a(var21, 0, 0, var38, var29, 61653921, var36 + var37, 0, var25, param2);
                                break L18;
                              }
                            }
                          }
                        } else {
                          break L18;
                        }
                      }
                      param15++;
                      if (param15 >= en.field_d) {
                        return;
                      } else {
                        var18 = var18 + var20;
                        var26 = var26 + var28;
                        var30 = var30 + var32;
                        var21 = var21 + var23;
                        var22 = var22 + var24;
                        var25 = var25 + var27;
                        var29 = var29 + var31;
                        var17 = var17 + var19;
                        var36 = var36 + bi.field_f;
                        if (0 == 0) {
                          continue L17;
                        } else {
                          break L12;
                        }
                      }
                    }
                  }
                }
                L19: {
                  var36 = -param16 + param11;
                  if (var36 != 0) {
                    break L19;
                  } else {
                    var19 = 0;
                    var31 = 0;
                    var23 = 0;
                    var24 = 0;
                    var28 = 0;
                    var20 = 0;
                    var32 = 0;
                    var27 = 0;
                    if (0 == 0) {
                      break L4;
                    } else {
                      break L19;
                    }
                  }
                }
                L20: {
                  L21: {
                    var37 = param10 << 486728464;
                    var38 = param0 << -1328288048;
                    var39 = param5 << 161820560;
                    var40 = param7 << -1440560528;
                    if (var33 == 0) {
                      break L21;
                    } else {
                      var22 = param14 << -565801584;
                      var18 = param1 << -1117110608;
                      var30 = param13 << -1794576336;
                      var26 = param6 << 1331398128;
                      if (0 == 0) {
                        break L20;
                      } else {
                        break L21;
                      }
                    }
                  }
                  var21 = param14 << -28019344;
                  var25 = param6 << 886659216;
                  var29 = param13 << 1976584080;
                  var17 = param1 << -236427824;
                  break L20;
                }
                var27 = (var39 + -var25) / var36;
                var24 = (var38 + -var22) / var36;
                var31 = (var40 + -var29) / var36;
                var28 = (-var26 + var39) / var36;
                var23 = (var38 + -var21) / var36;
                var20 = (var37 - var18) / var36;
                var32 = (var40 + -var30) / var36;
                var19 = (-var17 + var37) / var36;
                break L4;
              }
              L22: {
                if (param15 < 0) {
                  param15 = -param15;
                  var22 = var22 + param15 * var24;
                  var21 = var21 + param15 * var23;
                  var18 = var18 + var20 * param15;
                  var29 = var29 + param15 * var31;
                  var17 = var17 + param15 * var19;
                  var26 = var26 + param15 * var28;
                  var30 = var30 + param15 * var32;
                  var25 = var25 + var27 * param15;
                  param15 = 0;
                  break L22;
                } else {
                  break L22;
                }
              }
              var35 = en.field_b[param15];
              if (param15 < param11) {
                L23: {
                  var36 = var17 >> 1301715440;
                  if (var36 >= en.field_g) {
                    break L23;
                  } else {
                    L24: {
                      var37 = -(var17 >> 441231120) + (var18 >> 1035293424);
                      if (0 != var37) {
                        break L24;
                      } else {
                        if (var36 < 0) {
                          break L23;
                        } else {
                          if (en.field_g <= var36) {
                            break L23;
                          } else {
                            fg.a(var21, 0, 0, var37, var29, 61653921, var35 + var36, 0, var25, param2);
                            if (0 == 0) {
                              break L23;
                            } else {
                              break L24;
                            }
                          }
                        }
                      }
                    }
                    L25: {
                      var38 = (-var21 + var22) / var37;
                      var39 = (-var25 + var26) / var37;
                      var40 = (var30 + -var29) / var37;
                      if (en.field_g <= var36 - -var37) {
                        var37 = -var36 + en.field_g + -1;
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                    L26: {
                      if (0 <= var36) {
                        break L26;
                      } else {
                        fg.a(var21 + -(var36 * var38), var40, var38, var37 + var36, -(var36 * var40) + var29, 61653921, var35, var39, -(var39 * var36) + var25, param2);
                        if (0 == 0) {
                          break L23;
                        } else {
                          break L26;
                        }
                      }
                    }
                    fg.a(var21, var40, var38, var37, var29, param4 ^ -61653959, var36 - -var35, var39, var25, param2);
                    break L23;
                  }
                }
                param15++;
                if (param15 >= en.field_d) {
                  return;
                } else {
                  var29 = var29 + var31;
                  var17 = var17 + var19;
                  var30 = var30 + var32;
                  var22 = var22 + var24;
                  var18 = var18 + var20;
                  var35 = var35 + bi.field_f;
                  var26 = var26 + var28;
                  var21 = var21 + var23;
                  var25 = var25 + var27;
                  return;
                }
              } else {
                return;
              }
            } else {
              break L0;
            }
          }
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        ((pi) this).field_h = param0;
        param0.setDimensions(((pi) this).field_d, ((pi) this).field_a);
        param0.setProperties((Hashtable) null);
        param0.setColorModel(((pi) this).field_j);
        param0.setHints(14);
    }

    final static void a(byte param0, int param1, nn param2) {
        am var3 = dp.field_e;
        var3.j(param0 + -14, param1);
        var3.i(param2.field_h, 120);
        if (param0 != 25) {
            field_k = null;
        }
        var3.a(param2.field_i, (byte) 105);
    }

    private final synchronized void a(byte param0) {
        int var2 = 0;
        if (null == ((pi) this).field_h) {
          return;
        } else {
          ((pi) this).field_h.setPixels(0, 0, ((pi) this).field_d, ((pi) this).field_a, ((pi) this).field_j, ((pi) this).field_c, 0, ((pi) this).field_d);
          ((pi) this).field_h.imageComplete(2);
          var2 = -33 % ((param0 - -61) / 61);
          return;
        }
    }

    pi() {
    }

    public static void d(int param0) {
        field_k = null;
        field_l = null;
        if (param0 != -1) {
            Object var2 = null;
            pi.a((byte) 111, 106, (nn) null);
        }
    }

    final static void a(int param0, int param1, byte param2) {
        param0 = param0 / 24;
        param1 = param1 / 24;
        if (param2 != 101) {
            return;
        }
        if (-1 >= (param1 ^ -1)) {
            // if_icmple L49
            // iflt L49
            // if_icmple L49
        } else {
            return;
        }
        vm.field_u[param0][param1] = vm.field_u[param0][param1] + 1;
    }

    final static f[] a(int param0, am param1) {
        int var2 = 0;
        int var3 = 0;
        f[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        f var6_ref = null;
        int var7 = 0;
        var7 = ZombieDawn.field_J;
        var2 = param1.k(127, 8);
        if (var2 > 0) {
          return null;
        } else {
          var3 = param1.k(param0 ^ 100, param0);
          var4 = new f[var3];
          var5 = 0;
          L0: while (true) {
            if (var3 <= var5) {
              return var4;
            } else {
              if (!dg.a(param1, false)) {
                var6 = param1.k(40, gf.a(-1 + var5, 21));
                var4[var5] = var4[var6];
                var5++;
                continue L0;
              } else {
                var6_ref = new f();
                int discarded$6 = param1.k(param0 ^ 82, 24);
                int discarded$7 = param1.k(108, 24);
                var6_ref.field_h = param1.k(91, 24);
                int discarded$8 = param1.k(54, 9);
                int discarded$9 = param1.k(116, 12);
                int discarded$10 = param1.k(118, 12);
                int discarded$11 = param1.k(param0 + 58, 12);
                var4[var5] = var6_ref;
                var5++;
                continue L0;
              }
            }
          }
        }
    }

    final void a(int param0, int param1, java.awt.Component param2, int param3) {
        ((pi) this).field_a = param0;
        ((pi) this).field_d = param1;
        ((pi) this).field_c = new int[1 + param1 * param0];
        ((pi) this).field_j = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        ((pi) this).field_f = param2.createImage((java.awt.image.ImageProducer) this);
        this.a((byte) 112);
        boolean discarded$0 = param2.prepareImage(((pi) this).field_f, (java.awt.image.ImageObserver) this);
        this.a((byte) 7);
        if (param3 != -11055) {
            field_i = 5L;
        }
        boolean discarded$1 = param2.prepareImage(((pi) this).field_f, (java.awt.image.ImageObserver) this);
        this.a((byte) -128);
        boolean discarded$2 = param2.prepareImage(((pi) this).field_f, (java.awt.image.ImageObserver) this);
        ((pi) this).b(-127);
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        ((pi) this).addConsumer(param0);
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == ((pi) this).field_h;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new int[]{12263987, 11184691, 4491485};
    }
}
