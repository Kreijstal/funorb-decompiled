/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fa extends na implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    static he field_o;
    static he[] field_m;
    static he[] field_n;
    static int[] field_j;
    private java.awt.image.ImageConsumer field_p;
    static int[] field_l;
    private java.awt.image.ColorModel field_i;
    static he[] field_k;

    private final synchronized void c(int param0) {
        if (null == ((fa) this).field_p) {
          return;
        } else {
          ((fa) this).field_p.setPixels(0, param0, ((fa) this).field_f, ((fa) this).field_g, ((fa) this).field_i, ((fa) this).field_e, 0, ((fa) this).field_f);
          ((fa) this).field_p.imageComplete(2);
          return;
        }
    }

    final void a(int param0, int param1, byte param2, java.awt.Component param3) {
        if (param2 > -22) {
            Object var6 = null;
            boolean discarded$0 = ((fa) this).isConsumer((java.awt.image.ImageConsumer) null);
        }
        ((fa) this).field_f = param0;
        ((fa) this).field_e = new int[1 + param0 * param1];
        ((fa) this).field_g = param1;
        ((fa) this).field_i = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        ((fa) this).field_h = param3.createImage((java.awt.image.ImageProducer) this);
        this.c(0);
        boolean discarded$1 = param3.prepareImage(((fa) this).field_h, (java.awt.image.ImageObserver) this);
        this.c(0);
        boolean discarded$2 = param3.prepareImage(((fa) this).field_h, (java.awt.image.ImageObserver) this);
        this.c(0);
        boolean discarded$3 = param3.prepareImage(((fa) this).field_h, (java.awt.image.ImageObserver) this);
        ((fa) this).a(119);
    }

    final static boolean d(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            field_k = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == hg.field_S) {
              break L2;
            } else {
              if (hg.field_S.k(param0 + 110) == null) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        if (!(((fa) this).field_p != param0)) {
            ((fa) this).field_p = null;
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        ((fa) this).addConsumer(param0);
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return ((fa) this).field_p == param0;
    }

    public static void e(int param0) {
        field_m = null;
        field_n = null;
        field_l = null;
        field_k = null;
        field_o = null;
        if (param0 >= -49) {
            return;
        }
        field_j = null;
    }

    final static boolean a(boolean param0) {
        if (!param0) {
            return false;
        }
        return rh.field_i;
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        ((fa) this).field_p = param0;
        param0.setDimensions(((fa) this).field_f, ((fa) this).field_g);
        param0.setProperties((Hashtable) null);
        param0.setColorModel(((fa) this).field_i);
        param0.setHints(14);
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        return true;
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4) {
        hi.field_g = param2;
        s.field_g = param1;
        if (param0) {
            boolean discarded$0 = fa.a(false);
        }
        ha.field_a = param4;
        ni.field_p = param3;
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    final void a(java.awt.Graphics param0, int param1, int param2, int param3) {
        this.c(0);
        boolean discarded$9 = param0.drawImage(((fa) this).field_h, param1, param2, (java.awt.image.ImageObserver) this);
        if (param3 != 255) {
            Object var6 = null;
            boolean discarded$10 = ((fa) this).isConsumer((java.awt.image.ImageConsumer) null);
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7, int[] param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        L0: {
          var19 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (param3 < 0) {
            break L0;
          } else {
            if (param0 >= uc.field_h) {
              break L0;
            } else {
              L1: {
                if (param6 >= 0) {
                  break L1;
                } else {
                  if (param2 >= 0) {
                    break L1;
                  } else {
                    if (param7 >= 0) {
                      break L1;
                    } else {
                      return;
                    }
                  }
                }
              }
              L2: {
                if (param6 < uc.field_f) {
                  break L2;
                } else {
                  if (uc.field_f > param2) {
                    break L2;
                  } else {
                    if (param7 >= uc.field_f) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                L4: {
                  var14 = -param0 + param3;
                  if (param5 != param0) {
                    break L4;
                  } else {
                    L5: {
                      L6: {
                        if (param3 != param0) {
                          break L6;
                        } else {
                          var10 = param2 << 1070185040;
                          var9 = param6 << 41262928;
                          var12 = 0;
                          var11 = 0;
                          if (0 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        var15 = -param5 + param3;
                        if (param2 <= param6) {
                          break L7;
                        } else {
                          var11 = (param7 + -param6 << -1827625392) / var14;
                          var10 = param2 << -761812304;
                          var9 = param6 << 203516880;
                          var12 = (-param2 + param7 << 1437314800) / var15;
                          if (0 == 0) {
                            break L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var12 = (-param6 + param7 << 1605073328) / var14;
                      var9 = param2 << 147186576;
                      var10 = param6 << -1475900560;
                      var11 = (-param2 + param7 << -475821872) / var15;
                      break L5;
                    }
                    L8: {
                      if (param0 >= 0) {
                        break L8;
                      } else {
                        param0 = Math.min(-param0, -param0 + param5);
                        var10 = var10 + param0 * var12;
                        var9 = var9 + param0 * var11;
                        param0 = 0;
                        break L8;
                      }
                    }
                    var13 = 0;
                    if (0 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L9: {
                  L10: {
                    var10 = param6 << -1671792720;
                    var9 = param6 << -1671792720;
                    var15 = param5 + -param0;
                    var11 = (-param6 + param2 << 1378114480) / var15;
                    var12 = (-param6 + param7 << -206502160) / var14;
                    if (var12 <= var11) {
                      break L10;
                    } else {
                      var13 = 0;
                      if (0 == 0) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  var13 = 1;
                  var16 = var11;
                  var11 = var12;
                  var12 = var16;
                  break L9;
                }
                L11: {
                  L12: {
                    if (param0 >= 0) {
                      var16 = uc.field_g[param0];
                      L13: while (true) {
                        if (param0 >= param5) {
                          break L11;
                        } else {
                          L14: {
                            var17 = var9 >> -1422660464;
                            if (uc.field_f <= var17) {
                              break L14;
                            } else {
                              L15: {
                                var18 = -(var9 >> -1656553040) + (var10 >> -592602416);
                                if (0 == var18) {
                                  break L15;
                                } else {
                                  L16: {
                                    if (var18 + var17 < uc.field_f) {
                                      break L16;
                                    } else {
                                      var18 = -1 + (-var17 + uc.field_f);
                                      break L16;
                                    }
                                  }
                                  L17: {
                                    if (var17 < 0) {
                                      break L17;
                                    } else {
                                      qa.a(var17 - -var16, param8, param4, var18, -2141888031);
                                      if (0 == 0) {
                                        break L14;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                  qa.a(var16, param8, param4, var17 + var18, param1 ^ 2141888101);
                                  if (0 == 0) {
                                    break L14;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                              if (0 > var17) {
                                break L14;
                              } else {
                                if (uc.field_f > var17) {
                                  qa.a(var17 - -var16, param8, param4, var18, -2141888031);
                                  break L14;
                                } else {
                                  break L14;
                                }
                              }
                            }
                          }
                          param0++;
                          if (param0 >= uc.field_h) {
                            return;
                          } else {
                            var16 = var16 + wj.field_k;
                            var9 = var9 + var11;
                            var10 = var10 + var12;
                            if (0 == 0) {
                              continue L13;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                    } else {
                      L18: {
                        if (param5 >= 0) {
                          break L18;
                        } else {
                          param0 = param5 - param0;
                          var9 = var9 + param0 * var11;
                          var10 = var10 + var12 * param0;
                          param0 = param5;
                          if (0 == 0) {
                            break L11;
                          } else {
                            break L18;
                          }
                        }
                      }
                      param0 = -param0;
                      var9 = var9 + var11 * param0;
                      var10 = var10 + var12 * param0;
                      param0 = 0;
                      break L12;
                    }
                  }
                  var16 = uc.field_g[param0];
                  L19: while (true) {
                    if (param0 >= param5) {
                      break L11;
                    } else {
                      L20: {
                        var17 = var9 >> -1422660464;
                        if (uc.field_f <= var17) {
                          break L20;
                        } else {
                          L21: {
                            var18 = -(var9 >> -1656553040) + (var10 >> -592602416);
                            if (0 == var18) {
                              break L21;
                            } else {
                              L22: {
                                if (var18 + var17 < uc.field_f) {
                                  break L22;
                                } else {
                                  var18 = -1 + (-var17 + uc.field_f);
                                  break L22;
                                }
                              }
                              L23: {
                                if (var17 < 0) {
                                  break L23;
                                } else {
                                  qa.a(var17 - -var16, param8, param4, var18, -2141888031);
                                  if (0 == 0) {
                                    break L20;
                                  } else {
                                    break L23;
                                  }
                                }
                              }
                              qa.a(var16, param8, param4, var17 + var18, param1 ^ 2141888101);
                              if (0 == 0) {
                                break L20;
                              } else {
                                break L21;
                              }
                            }
                          }
                          if (0 > var17) {
                            break L20;
                          } else {
                            if (uc.field_f > var17) {
                              qa.a(var17 - -var16, param8, param4, var18, -2141888031);
                              break L20;
                            } else {
                              break L20;
                            }
                          }
                        }
                      }
                      param0++;
                      if (param0 >= uc.field_h) {
                        return;
                      } else {
                        var16 = var16 + wj.field_k;
                        var9 = var9 + var11;
                        var10 = var10 + var12;
                        if (0 == 0) {
                          continue L19;
                        } else {
                          break L11;
                        }
                      }
                    }
                  }
                }
                L24: {
                  var16 = -param5 + param3;
                  if (0 != var16) {
                    break L24;
                  } else {
                    var11 = 0;
                    var12 = 0;
                    if (0 == 0) {
                      break L3;
                    } else {
                      break L24;
                    }
                  }
                }
                L25: {
                  L26: {
                    var17 = param7 << -293810032;
                    if (var13 == 0) {
                      break L26;
                    } else {
                      var10 = param2 << -11426672;
                      if (0 == 0) {
                        break L25;
                      } else {
                        break L26;
                      }
                    }
                  }
                  var9 = param2 << -1688839056;
                  break L25;
                }
                var12 = (var17 + -var10) / var16;
                var11 = (-var9 + var17) / var16;
                break L3;
              }
              L27: {
                if (0 <= param0) {
                  break L27;
                } else {
                  param0 = -param0;
                  var9 = var9 + param0 * var11;
                  var10 = var10 + var12 * param0;
                  param0 = 0;
                  break L27;
                }
              }
              L28: {
                if (param1 == -124) {
                  break L28;
                } else {
                  field_k = null;
                  break L28;
                }
              }
              var15 = uc.field_g[param0];
              if (param3 > param0) {
                L29: {
                  var16 = var9 >> 1125567568;
                  if (var16 >= uc.field_f) {
                    break L29;
                  } else {
                    L30: {
                      var17 = (var10 >> -892976272) - (var9 >> -1451614768);
                      if (var17 == 0) {
                        break L30;
                      } else {
                        L31: {
                          if (uc.field_f > var17 + var16) {
                            break L31;
                          } else {
                            var17 = -1 + -var16 + uc.field_f;
                            break L31;
                          }
                        }
                        L32: {
                          if (var16 < 0) {
                            break L32;
                          } else {
                            qa.a(var15 + var16, param8, param4, var17, -2141888031);
                            if (0 == 0) {
                              break L29;
                            } else {
                              break L32;
                            }
                          }
                        }
                        qa.a(var15, param8, param4, var16 + var17, param1 ^ 2141888101);
                        if (0 == 0) {
                          break L29;
                        } else {
                          break L30;
                        }
                      }
                    }
                    if (var16 < 0) {
                      break L29;
                    } else {
                      if (uc.field_f > var16) {
                        qa.a(var15 + var16, param8, param4, var17, -2141888031);
                        break L29;
                      } else {
                        break L29;
                      }
                    }
                  }
                }
                param0++;
                if (param0 >= uc.field_h) {
                  return;
                } else {
                  var15 = var15 + wj.field_k;
                  var10 = var10 + var12;
                  var9 = var9 + var11;
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    fa() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new int[8192];
        field_l = new int[]{0, 16744448, 98559, 16711680, 16776960, 65280, 16777215, 16711680, 16711680, 16711680, 16744448, 0, 16777215, 16744448};
    }
}
