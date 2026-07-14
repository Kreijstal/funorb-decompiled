/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bf extends sc implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ColorModel field_j;
    static lh field_g;
    private java.awt.image.ImageConsumer field_h;
    static rh field_i;

    final static h a(byte param0, String param1) {
        if (param0 != 86) {
            field_i = null;
            return new h(param1);
        }
        return new h(param1);
    }

    private final synchronized void a(boolean param0) {
        if (null != ((bf) this).field_h) {
          ((bf) this).field_h.setPixels(0, 0, ((bf) this).field_a, ((bf) this).field_c, ((bf) this).field_j, ((bf) this).field_d, 0, ((bf) this).field_a);
          if (!param0) {
            field_i = null;
            ((bf) this).field_h.imageComplete(2);
            return;
          } else {
            ((bf) this).field_h.imageComplete(2);
            return;
          }
        } else {
          return;
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    final void a(int param0, java.awt.Graphics param1, int param2, int param3) {
        Object var6 = null;
        if (param3 != 0) {
          var6 = null;
          boolean discarded$6 = ((bf) this).imageUpdate((java.awt.Image) null, 94, -33, 114, 59, 88);
          this.a(true);
          boolean discarded$7 = param1.drawImage(((bf) this).field_e, param2, param0, (java.awt.image.ImageObserver) this);
          return;
        } else {
          this.a(true);
          boolean discarded$8 = param1.drawImage(((bf) this).field_e, param2, param0, (java.awt.image.ImageObserver) this);
          return;
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return ((bf) this).field_h == param0;
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        ((bf) this).addConsumer(param0);
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        ((bf) this).field_h = param0;
        param0.setDimensions(((bf) this).field_a, ((bf) this).field_c);
        param0.setProperties((Hashtable) null);
        param0.setColorModel(((bf) this).field_j);
        param0.setHints(14);
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        return true;
    }

    final void a(int param0, java.awt.Component param1, int param2, byte param3) {
        ((bf) this).field_c = param0;
        ((bf) this).field_a = param2;
        ((bf) this).field_d = new int[param0 * param2 - -1];
        ((bf) this).field_j = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        ((bf) this).field_e = param1.createImage((java.awt.image.ImageProducer) this);
        this.a(true);
        boolean discarded$0 = param1.prepareImage(((bf) this).field_e, (java.awt.image.ImageObserver) this);
        this.a(true);
        boolean discarded$1 = param1.prepareImage(((bf) this).field_e, (java.awt.image.ImageObserver) this);
        this.a(true);
        boolean discarded$8 = param1.prepareImage(((bf) this).field_e, (java.awt.image.ImageObserver) this);
        ((bf) this).a(255);
        if (param3 <= 116) {
            ((bf) this).field_j = null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var13 = Geoblox.field_C;
          var5 = param1 + param4;
          var6 = param0 - -param3;
          if (param4 <= vb.field_e) {
            stackOut_2_0 = vb.field_e;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = param4;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var7 = stackIn_3_0;
          if (param0 > vb.field_i) {
            stackOut_5_0 = param0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = vb.field_i;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var8 = stackIn_6_0;
          if (vb.field_k > var5) {
            stackOut_8_0 = var5;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = vb.field_k;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var9 = stackIn_9_0;
          if (vb.field_d <= var6) {
            stackOut_11_0 = vb.field_d;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = var6;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        var10 = stackIn_12_0;
        if (param2 == 14164) {
          if (param4 >= vb.field_e) {
            if (param4 < vb.field_k) {
              var11 = param4 + var8 * vb.field_f;
              var12 = var10 + 1 + -var8 >> 158912129;
              L4: while (true) {
                var12--;
                if (0 > var12) {
                  L5: {
                    if (param0 < vb.field_i) {
                      break L5;
                    } else {
                      if (vb.field_d > var6) {
                        var11 = var7 + vb.field_f * param0;
                        var12 = -var7 + 1 + var9 >> -2109860607;
                        L6: while (true) {
                          var12--;
                          if (-1 < (var12 ^ -1)) {
                            break L5;
                          } else {
                            vb.field_c[var11] = 16777215;
                            var11 += 2;
                            continue L6;
                          }
                        }
                      } else {
                        L7: {
                          if (var5 < vb.field_e) {
                            break L7;
                          } else {
                            if (vb.field_k <= var5) {
                              break L7;
                            } else {
                              var11 = var5 + ((1 & -param4 + var5) + var8) * vb.field_f;
                              var12 = -var8 + 1 + var10 >> -161751903;
                              L8: while (true) {
                                var12--;
                                if (0 > var12) {
                                  break L7;
                                } else {
                                  vb.field_c[var11] = 16777215;
                                  var11 = var11 + 2 * vb.field_f;
                                  continue L8;
                                }
                              }
                            }
                          }
                        }
                        L9: {
                          if (vb.field_i > param0) {
                            break L9;
                          } else {
                            if (vb.field_d <= var6) {
                              break L9;
                            } else {
                              var11 = vb.field_f * var6 + (var7 - -(1 & -param0 + var6));
                              var12 = 1 - (-var9 + var7) >> 880243777;
                              L10: while (true) {
                                var12--;
                                if (var12 < 0) {
                                  break L9;
                                } else {
                                  vb.field_c[var11] = 16777215;
                                  var11 += 2;
                                  continue L10;
                                }
                              }
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                  L11: {
                    if (var5 < vb.field_e) {
                      break L11;
                    } else {
                      if (vb.field_k <= var5) {
                        break L11;
                      } else {
                        var11 = var5 + ((1 & -param4 + var5) + var8) * vb.field_f;
                        var12 = -var8 + 1 + var10 >> -161751903;
                        L12: while (true) {
                          var12--;
                          if (0 > var12) {
                            break L11;
                          } else {
                            vb.field_c[var11] = 16777215;
                            var11 = var11 + 2 * vb.field_f;
                            continue L12;
                          }
                        }
                      }
                    }
                  }
                  L13: {
                    if (vb.field_i > param0) {
                      break L13;
                    } else {
                      if (vb.field_d <= var6) {
                        break L13;
                      } else {
                        var11 = vb.field_f * var6 + (var7 - -(1 & -param0 + var6));
                        var12 = 1 - (-var9 + var7) >> 880243777;
                        L14: while (true) {
                          var12--;
                          if (var12 < 0) {
                            break L13;
                          } else {
                            vb.field_c[var11] = 16777215;
                            var11 += 2;
                            continue L14;
                          }
                        }
                      }
                    }
                  }
                  return;
                } else {
                  vb.field_c[var11] = 16777215;
                  var11 = var11 + vb.field_f * 2;
                  continue L4;
                }
              }
            } else {
              if (param0 >= vb.field_i) {
                if (vb.field_d <= var6) {
                  L15: {
                    if (var5 < vb.field_e) {
                      break L15;
                    } else {
                      if (vb.field_k <= var5) {
                        break L15;
                      } else {
                        var11 = var5 + ((1 & -param4 + var5) + var8) * vb.field_f;
                        var12 = -var8 + 1 + var10 >> -161751903;
                        L16: while (true) {
                          var12--;
                          if (0 > var12) {
                            break L15;
                          } else {
                            vb.field_c[var11] = 16777215;
                            var11 = var11 + 2 * vb.field_f;
                            continue L16;
                          }
                        }
                      }
                    }
                  }
                  L17: {
                    if (vb.field_i > param0) {
                      break L17;
                    } else {
                      if (vb.field_d <= var6) {
                        break L17;
                      } else {
                        var11 = vb.field_f * var6 + (var7 - -(1 & -param0 + var6));
                        var12 = 1 - (-var9 + var7) >> 880243777;
                        L18: while (true) {
                          var12--;
                          if (var12 < 0) {
                            break L17;
                          } else {
                            vb.field_c[var11] = 16777215;
                            var11 += 2;
                            continue L18;
                          }
                        }
                      }
                    }
                  }
                  return;
                } else {
                  var11 = var7 + vb.field_f * param0;
                  var12 = -var7 + 1 + var9 >> -2109860607;
                  L19: while (true) {
                    var12--;
                    if (-1 < (var12 ^ -1)) {
                      L20: {
                        if (var5 < vb.field_e) {
                          break L20;
                        } else {
                          if (vb.field_k <= var5) {
                            break L20;
                          } else {
                            var11 = var5 + ((1 & -param4 + var5) + var8) * vb.field_f;
                            var12 = -var8 + 1 + var10 >> -161751903;
                            L21: while (true) {
                              var12--;
                              if (0 > var12) {
                                break L20;
                              } else {
                                vb.field_c[var11] = 16777215;
                                var11 = var11 + 2 * vb.field_f;
                                continue L21;
                              }
                            }
                          }
                        }
                      }
                      L22: {
                        if (vb.field_i > param0) {
                          break L22;
                        } else {
                          if (vb.field_d <= var6) {
                            break L22;
                          } else {
                            var11 = vb.field_f * var6 + (var7 - -(1 & -param0 + var6));
                            var12 = 1 - (-var9 + var7) >> 880243777;
                            L23: while (true) {
                              var12--;
                              if (var12 < 0) {
                                break L22;
                              } else {
                                vb.field_c[var11] = 16777215;
                                var11 += 2;
                                continue L23;
                              }
                            }
                          }
                        }
                      }
                      return;
                    } else {
                      vb.field_c[var11] = 16777215;
                      var11 += 2;
                      continue L19;
                    }
                  }
                }
              } else {
                L24: {
                  if (var5 < vb.field_e) {
                    break L24;
                  } else {
                    if (vb.field_k <= var5) {
                      break L24;
                    } else {
                      var11 = var5 + ((1 & -param4 + var5) + var8) * vb.field_f;
                      var12 = -var8 + 1 + var10 >> -161751903;
                      L25: while (true) {
                        var12--;
                        if (0 > var12) {
                          break L24;
                        } else {
                          vb.field_c[var11] = 16777215;
                          var11 = var11 + 2 * vb.field_f;
                          continue L25;
                        }
                      }
                    }
                  }
                }
                L26: {
                  if (vb.field_i > param0) {
                    break L26;
                  } else {
                    if (vb.field_d <= var6) {
                      break L26;
                    } else {
                      var11 = vb.field_f * var6 + (var7 - -(1 & -param0 + var6));
                      var12 = 1 - (-var9 + var7) >> 880243777;
                      L27: while (true) {
                        var12--;
                        if (var12 < 0) {
                          break L26;
                        } else {
                          vb.field_c[var11] = 16777215;
                          var11 += 2;
                          continue L27;
                        }
                      }
                    }
                  }
                }
                return;
              }
            }
          } else {
            if (param0 >= vb.field_i) {
              if (vb.field_d <= var6) {
                L28: {
                  if (var5 < vb.field_e) {
                    break L28;
                  } else {
                    if (vb.field_k <= var5) {
                      break L28;
                    } else {
                      var11 = var5 + ((1 & -param4 + var5) + var8) * vb.field_f;
                      var12 = -var8 + 1 + var10 >> -161751903;
                      L29: while (true) {
                        var12--;
                        if (0 > var12) {
                          break L28;
                        } else {
                          vb.field_c[var11] = 16777215;
                          var11 = var11 + 2 * vb.field_f;
                          continue L29;
                        }
                      }
                    }
                  }
                }
                L30: {
                  if (vb.field_i > param0) {
                    break L30;
                  } else {
                    if (vb.field_d <= var6) {
                      break L30;
                    } else {
                      var11 = vb.field_f * var6 + (var7 - -(1 & -param0 + var6));
                      var12 = 1 - (-var9 + var7) >> 880243777;
                      L31: while (true) {
                        var12--;
                        if (var12 < 0) {
                          break L30;
                        } else {
                          vb.field_c[var11] = 16777215;
                          var11 += 2;
                          continue L31;
                        }
                      }
                    }
                  }
                }
                return;
              } else {
                var11 = var7 + vb.field_f * param0;
                var12 = -var7 + 1 + var9 >> -2109860607;
                L32: while (true) {
                  var12--;
                  if (-1 < (var12 ^ -1)) {
                    L33: {
                      if (var5 < vb.field_e) {
                        break L33;
                      } else {
                        if (vb.field_k <= var5) {
                          break L33;
                        } else {
                          var11 = var5 + ((1 & -param4 + var5) + var8) * vb.field_f;
                          var12 = -var8 + 1 + var10 >> -161751903;
                          L34: while (true) {
                            var12--;
                            if (0 > var12) {
                              break L33;
                            } else {
                              vb.field_c[var11] = 16777215;
                              var11 = var11 + 2 * vb.field_f;
                              continue L34;
                            }
                          }
                        }
                      }
                    }
                    L35: {
                      if (vb.field_i > param0) {
                        break L35;
                      } else {
                        if (vb.field_d <= var6) {
                          break L35;
                        } else {
                          var11 = vb.field_f * var6 + (var7 - -(1 & -param0 + var6));
                          var12 = 1 - (-var9 + var7) >> 880243777;
                          L36: while (true) {
                            var12--;
                            if (var12 < 0) {
                              break L35;
                            } else {
                              vb.field_c[var11] = 16777215;
                              var11 += 2;
                              continue L36;
                            }
                          }
                        }
                      }
                    }
                    return;
                  } else {
                    vb.field_c[var11] = 16777215;
                    var11 += 2;
                    continue L32;
                  }
                }
              }
            } else {
              L37: {
                if (var5 < vb.field_e) {
                  break L37;
                } else {
                  if (vb.field_k <= var5) {
                    break L37;
                  } else {
                    var11 = var5 + ((1 & -param4 + var5) + var8) * vb.field_f;
                    var12 = -var8 + 1 + var10 >> -161751903;
                    L38: while (true) {
                      var12--;
                      if (0 > var12) {
                        break L37;
                      } else {
                        vb.field_c[var11] = 16777215;
                        var11 = var11 + 2 * vb.field_f;
                        continue L38;
                      }
                    }
                  }
                }
              }
              L39: {
                if (vb.field_i > param0) {
                  break L39;
                } else {
                  if (vb.field_d <= var6) {
                    break L39;
                  } else {
                    var11 = vb.field_f * var6 + (var7 - -(1 & -param0 + var6));
                    var12 = 1 - (-var9 + var7) >> 880243777;
                    L40: while (true) {
                      var12--;
                      if (var12 < 0) {
                        break L39;
                      } else {
                        vb.field_c[var11] = 16777215;
                        var11 += 2;
                        continue L40;
                      }
                    }
                  }
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        if (param0 == ((bf) this).field_h) {
            ((bf) this).field_h = null;
        }
    }

    bf() {
    }

    public static void c(byte param0) {
        field_i = null;
        field_g = null;
        if (param0 >= -101) {
            field_g = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new lh();
    }
}
