/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fg extends cj implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ImageConsumer field_k;
    static long field_j;
    private java.awt.image.ColorModel field_h;
    static int[] field_i;

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    final static String a(String param0, ci param1, int param2, String param3, int param4) {
        Object var6 = null;
        L0: {
          if (param4 == 32389) {
            break L0;
          } else {
            var6 = null;
            fg.a(61, 83, (byte) 125, 103, 62, -127, (int[]) null, -45);
            break L0;
          }
        }
        if (!param1.a((byte) -127)) {
          return param3;
        } else {
          return param0 + " - " + param1.a(true, param2) + "%";
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        ((fg) this).field_k = param0;
        param0.setDimensions(((fg) this).field_d, ((fg) this).field_g);
        param0.setProperties((Hashtable) null);
        param0.setColorModel(((fg) this).field_h);
        param0.setHints(14);
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        if (!(((fg) this).field_k != param0)) {
            ((fg) this).field_k = null;
        }
    }

    final static void d(byte param0) {
        if (!ge.field_x) {
          throw new IllegalStateException();
        } else {
          bg.field_n = true;
          n.a(false, false);
          if (param0 != 91) {
            return;
          } else {
            gl.field_y = 0;
            return;
          }
        }
    }

    private final synchronized void c(byte param0) {
        if (param0 != 28) {
            return;
        }
        if (!(((fg) this).field_k != null)) {
            return;
        }
        ((fg) this).field_k.setPixels(0, 0, ((fg) this).field_d, ((fg) this).field_g, ((fg) this).field_h, ((fg) this).field_a, 0, ((fg) this).field_d);
        ((fg) this).field_k.imageComplete(2);
    }

    final void a(int param0, int param1, java.awt.Graphics param2, int param3) {
        this.c((byte) 28);
        if (param0 != -32299) {
            Object var6 = null;
            ((fg) this).a(8, -89, (java.awt.Component) null, (byte) 114);
        }
        boolean discarded$0 = param2.drawImage(((fg) this).field_f, param1, param3, (java.awt.image.ImageObserver) this);
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5, int[] param6, int param7) {
        int var8 = 0;
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
        L0: {
          var33 = Transmogrify.field_A ? 1 : 0;
          var8 = param3 + param1 - 1;
          var9 = param0 + param5 + -1;
          var10 = param4 * param4;
          var11 = -param4 + param1;
          var12 = var8 + param4;
          var13 = param0 - param4;
          var14 = param4 + var9;
          var15 = var13;
          if (var15 >= sb.field_e) {
            break L0;
          } else {
            var15 = sb.field_e;
            break L0;
          }
        }
        L1: {
          var16 = var15;
          var17 = var11;
          if (sb.field_d <= var17) {
            break L1;
          } else {
            var17 = sb.field_d;
            break L1;
          }
        }
        L2: {
          var18 = param1;
          if (var18 <= sb.field_b) {
            break L2;
          } else {
            var18 = sb.field_b;
            break L2;
          }
        }
        L3: {
          var19 = var8;
          if (sb.field_b < var19) {
            var19 = sb.field_b;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          var20 = var12;
          if (var20 > sb.field_b) {
            var20 = sb.field_b;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          var21 = (-var16 + param0 + 1) * (1 + -var16 + param0);
          var22 = (1 + param1 + -var17) * (-var17 + (param1 - -1));
          var23 = param0;
          if (sb.field_f >= var23) {
            break L5;
          } else {
            var23 = sb.field_f;
            break L5;
          }
        }
        L6: while (true) {
          L7: {
            if (var23 <= var16) {
              break L7;
            } else {
              var21 = var21 + ((-param0 + var16 << 1677889697) - 1);
              var24 = var17 + sb.field_c * var16;
              var25 = var17;
              var26 = var21 - -var22;
              L8: while (true) {
                L9: {
                  if (var25 >= var18) {
                    break L9;
                  } else {
                    L10: {
                      var26 = var26 + ((var25 + -param1 << -270157823) + -1);
                      if (var26 <= var10) {
                        var27 = var24;
                        var28 = param6[(var10 + -var26) * param7 / var10];
                        var29 = sb.field_h[var27];
                        var30 = var29 + var28;
                        var28 = (var29 & 16711935) + (var28 & 16711935);
                        var29 = (16777472 & var28) + (var30 - var28 & 65536);
                        sb.field_h[var27] = cl.b(-(var29 >>> -321382360) + var29, var30 - var29);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    var24++;
                    var25++;
                    if (0 == 0) {
                      continue L8;
                    } else {
                      break L9;
                    }
                  }
                }
                var27 = param6[(var10 + -var21) * param7 / var10];
                var26 = 1 + var21;
                L11: while (true) {
                  L12: {
                    if (var25 >= var19) {
                      break L12;
                    } else {
                      var28 = var24;
                      var29 = var27;
                      var30 = sb.field_h[var28];
                      var31 = var30 + var29;
                      var29 = (var29 & 16711935) + (var30 & 16711935);
                      var30 = (16777472 & var29) + (65536 & -var29 + var31);
                      sb.field_h[var28] = cl.b(var30 + -(var30 >>> 2027212104), var31 - var30);
                      var24++;
                      var25++;
                      if (0 == 0) {
                        continue L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                  L13: while (true) {
                    L14: {
                      if (var25 >= var20) {
                        break L14;
                      } else {
                        var26 = var26 + (-1 + (-var8 + var25 << 1798921409));
                        if ((var10 ^ -1) > (var26 ^ -1)) {
                          break L14;
                        } else {
                          var28 = var24;
                          var29 = param6[param7 * (-var26 + var10) / var10];
                          var30 = sb.field_h[var28];
                          var31 = var30 + var29;
                          var29 = (16711935 & var30) + (var29 & 16711935);
                          var30 = (var29 & 16777472) + (var31 - var29 & 65536);
                          sb.field_h[var28] = cl.b(-(var30 >>> 55419336) + var30, var31 - var30);
                          var24++;
                          var25++;
                          if (0 == 0) {
                            continue L13;
                          } else {
                            break L14;
                          }
                        }
                      }
                    }
                    var16++;
                    if (0 == 0) {
                      continue L6;
                    } else {
                      break L7;
                    }
                  }
                }
              }
            }
          }
          L15: {
            var23 = param4 + param0;
            if (var23 <= sb.field_f) {
              break L15;
            } else {
              var23 = sb.field_f;
              break L15;
            }
          }
          L16: {
            if (param2 > 76) {
              break L16;
            } else {
              field_j = 46L;
              break L16;
            }
          }
          L17: while (true) {
            L18: {
              if (var23 <= var16) {
                break L18;
              } else {
                var21 = var21 + ((-param0 + var16 << 1430730785) + -1);
                var24 = sb.field_c * var16 + var17;
                var25 = var17;
                var26 = var22;
                L19: while (true) {
                  L20: {
                    if (var16 + (param1 - param0) <= var25) {
                      break L20;
                    } else {
                      L21: {
                        var26 = var26 + ((var25 + -param1 << -1298665055) + -1);
                        if ((var25 ^ -1) > (sb.field_b ^ -1)) {
                          var27 = var24;
                          var28 = param6[(var10 - var26) * param7 / var10];
                          var29 = sb.field_h[var27];
                          var30 = var29 + var28;
                          var28 = (var29 & 16711935) + (16711935 & var28);
                          var29 = (16777472 & var28) + (65536 & var30 - var28);
                          sb.field_h[var27] = cl.b(var29 + -(var29 >>> -612613368), -var29 + var30);
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      var24++;
                      var25++;
                      if (0 == 0) {
                        continue L19;
                      } else {
                        break L20;
                      }
                    }
                  }
                  var27 = param6[param7 * (var10 - var21) / var10];
                  L22: while (true) {
                    L23: {
                      if (var8 + -var16 - -param0 <= var25) {
                        break L23;
                      } else {
                        L24: {
                          if (var25 < sb.field_b) {
                            var28 = var24;
                            var29 = var27;
                            var30 = sb.field_h[var28];
                            var31 = var30 + var29;
                            var29 = (16711935 & var29) + (var30 & 16711935);
                            var30 = (-var29 + var31 & 65536) + (var29 & 16777472);
                            sb.field_h[var28] = cl.b(-(var30 >>> -108879032) + var30, -var30 + var31);
                            break L24;
                          } else {
                            break L24;
                          }
                        }
                        var24++;
                        var25++;
                        if (0 == 0) {
                          continue L22;
                        } else {
                          break L23;
                        }
                      }
                    }
                    var26 = (var8 - (var25 + -1)) * (-var25 + var8 - -1);
                    L25: while (true) {
                      L26: {
                        if (var25 >= var20) {
                          break L26;
                        } else {
                          var26 = var26 + ((-var8 + var25 << -476816703) + -1);
                          var28 = var24;
                          var29 = param6[param7 * (-var26 + var10) / var10];
                          var30 = sb.field_h[var28];
                          var31 = var30 + var29;
                          var29 = (16711935 & var30) + (var29 & 16711935);
                          var30 = (var29 & 16777472) - -(var31 + -var29 & 65536);
                          sb.field_h[var28] = cl.b(var31 - var30, var30 - (var30 >>> 1935514952));
                          var24++;
                          var25++;
                          if (0 == 0) {
                            continue L25;
                          } else {
                            break L26;
                          }
                        }
                      }
                      var16++;
                      if (0 == 0) {
                        continue L17;
                      } else {
                        break L18;
                      }
                    }
                  }
                }
              }
            }
            L27: {
              var23 = -param4 + var9;
              if (var23 <= sb.field_f) {
                break L27;
              } else {
                var23 = sb.field_f;
                break L27;
              }
            }
            L28: {
              var24 = -param4 + (param3 - param4 + -1);
              if (var17 > param1 + param4) {
                var24 = var24 + (param4 + param1 + -var17);
                break L28;
              } else {
                break L28;
              }
            }
            L29: while (true) {
              L30: {
                if (var16 >= var23) {
                  break L30;
                } else {
                  var25 = var17 + var16 * sb.field_c;
                  var26 = var22;
                  var27 = var17;
                  L31: while (true) {
                    L32: {
                      if (param1 + param4 <= var27) {
                        break L32;
                      } else {
                        L33: {
                          var26 = var26 + (-1 + (-param1 + var27 << -1244466495));
                          if ((sb.field_b ^ -1) < (var27 ^ -1)) {
                            var28 = var25;
                            var29 = param6[(-var26 + var10) * param7 / var10];
                            var30 = sb.field_h[var28];
                            var31 = var30 + var29;
                            var29 = (var29 & 16711935) + (var30 & 16711935);
                            var30 = (var29 & 16777472) - -(65536 & -var29 + var31);
                            sb.field_h[var28] = cl.b(var30 - (var30 >>> -1385613112), var31 + -var30);
                            break L33;
                          } else {
                            break L33;
                          }
                        }
                        var25++;
                        var27++;
                        if (0 == 0) {
                          continue L31;
                        } else {
                          break L32;
                        }
                      }
                    }
                    var26 = 1 + (param4 + var10) - -param4;
                    var25 = var25 + var24;
                    var27 = var8 + -param4;
                    L34: while (true) {
                      L35: {
                        if (var27 >= var20) {
                          break L35;
                        } else {
                          L36: {
                            var26 = var26 + (-1 + (-var8 + var27 << 501491297));
                            if ((sb.field_d ^ -1) < (var27 ^ -1)) {
                              break L36;
                            } else {
                              var28 = var25;
                              var29 = param6[param7 * (-var26 + var10) / var10];
                              var30 = sb.field_h[var28];
                              var31 = var29 + var30;
                              var29 = (16711935 & var30) + (var29 & 16711935);
                              var30 = (65536 & -var29 + var31) + (var29 & 16777472);
                              sb.field_h[var28] = cl.b(var31 - var30, var30 + -(var30 >>> 2081393352));
                              break L36;
                            }
                          }
                          var25++;
                          var27++;
                          if (0 == 0) {
                            continue L34;
                          } else {
                            break L35;
                          }
                        }
                      }
                      var16++;
                      if (0 == 0) {
                        continue L29;
                      } else {
                        break L30;
                      }
                    }
                  }
                }
              }
              L37: {
                var23 = var9;
                var21 = (var9 + (-var16 - -1)) * (1 + -var16 + var9);
                if (var23 > sb.field_f) {
                  var23 = sb.field_f;
                  break L37;
                } else {
                  break L37;
                }
              }
              L38: while (true) {
                L39: {
                  if (var16 >= var23) {
                    break L39;
                  } else {
                    var21 = var21 + ((-var9 + var16 << 783861889) + -1);
                    var25 = sb.field_c * var16 + var17;
                    var26 = var17;
                    var27 = var22;
                    L40: while (true) {
                      L41: {
                        if (var26 >= var9 + (-var16 + param1)) {
                          break L41;
                        } else {
                          L42: {
                            var27 = var27 + (-1 + (-param1 + var26 << -1144888671));
                            if ((var26 ^ -1) > (sb.field_b ^ -1)) {
                              var28 = var25;
                              var29 = param6[param7 * (var10 - var27) / var10];
                              var30 = sb.field_h[var28];
                              var31 = var29 + var30;
                              var29 = (var29 & 16711935) - -(var30 & 16711935);
                              var30 = (var31 - var29 & 65536) + (16777472 & var29);
                              sb.field_h[var28] = cl.b(-var30 + var31, var30 + -(var30 >>> 649140840));
                              break L42;
                            } else {
                              break L42;
                            }
                          }
                          var25++;
                          var26++;
                          if (0 == 0) {
                            continue L40;
                          } else {
                            break L41;
                          }
                        }
                      }
                      var28 = param6[(var10 - var21) * param7 / var10];
                      L43: while (true) {
                        L44: {
                          if (var26 >= -var9 + var8 - -var16) {
                            break L44;
                          } else {
                            L45: {
                              if (var26 >= sb.field_b) {
                                break L45;
                              } else {
                                var29 = var25;
                                var30 = var28;
                                var31 = sb.field_h[var29];
                                var32 = var31 + var30;
                                var30 = (var31 & 16711935) + (var30 & 16711935);
                                var31 = (16777472 & var30) + (65536 & var32 - var30);
                                sb.field_h[var29] = cl.b(var31 + -(var31 >>> 1025857608), -var31 + var32);
                                break L45;
                              }
                            }
                            var25++;
                            var26++;
                            if (0 == 0) {
                              continue L43;
                            } else {
                              break L44;
                            }
                          }
                        }
                        var27 = (1 + var8 - var26) * (-var26 + var8 + 1);
                        L46: while (true) {
                          L47: {
                            if (var26 >= var20) {
                              break L47;
                            } else {
                              var27 = var27 + ((var26 - var8 << 1680675873) + -1);
                              var29 = var25;
                              var30 = param6[param7 * (-var27 + var10) / var10];
                              var31 = sb.field_h[var29];
                              var32 = var30 - -var31;
                              var30 = (16711935 & var31) + (16711935 & var30);
                              var31 = (var30 & 16777472) + (-var30 + var32 & 65536);
                              sb.field_h[var29] = cl.b(var31 - (var31 >>> -2007951192), -var31 + var32);
                              var25++;
                              var26++;
                              if (0 == 0) {
                                continue L46;
                              } else {
                                break L47;
                              }
                            }
                          }
                          var16++;
                          if (0 == 0) {
                            continue L38;
                          } else {
                            break L39;
                          }
                        }
                      }
                    }
                  }
                }
                L48: {
                  var23 = var14;
                  if (sb.field_f < var23) {
                    var23 = sb.field_f;
                    break L48;
                  } else {
                    break L48;
                  }
                }
                L49: while (true) {
                  L50: {
                    if (var23 <= var16) {
                      break L50;
                    } else {
                      var25 = var17 + var16 * sb.field_c;
                      var21 = var21 + ((-var9 + var16 << 980968193) + -1);
                      var26 = var17;
                      var27 = var21 + var22;
                      L51: while (true) {
                        L52: {
                          if (var26 >= var18) {
                            break L52;
                          } else {
                            L53: {
                              var27 = var27 + ((var26 + -param1 << 279067809) + -1);
                              if (var27 <= var10) {
                                var28 = var25;
                                var29 = param6[(var10 - var27) * param7 / var10];
                                var30 = sb.field_h[var28];
                                var31 = var30 + var29;
                                var29 = (16711935 & var29) + (var30 & 16711935);
                                var30 = (-var29 + var31 & 65536) + (var29 & 16777472);
                                sb.field_h[var28] = cl.b(var31 + -var30, -(var30 >>> -1586190520) + var30);
                                break L53;
                              } else {
                                break L53;
                              }
                            }
                            var25++;
                            var26++;
                            if (0 == 0) {
                              continue L51;
                            } else {
                              break L52;
                            }
                          }
                        }
                        var28 = param6[(-var21 + var10) * param7 / var10];
                        var27 = var21 + 1;
                        L54: while (true) {
                          L55: {
                            if (var19 <= var26) {
                              break L55;
                            } else {
                              var29 = var25;
                              var30 = var28;
                              var31 = sb.field_h[var29];
                              var32 = var31 + var30;
                              var30 = (16711935 & var31) + (16711935 & var30);
                              var31 = (var30 & 16777472) + (65536 & var32 - var30);
                              sb.field_h[var29] = cl.b(-(var31 >>> 533496872) + var31, var32 - var31);
                              var25++;
                              var26++;
                              if (0 == 0) {
                                continue L54;
                              } else {
                                break L55;
                              }
                            }
                          }
                          L56: while (true) {
                            L57: {
                              if (var20 <= var26) {
                                break L57;
                              } else {
                                var27 = var27 + (-1 + (-var8 + var26 << -2000980191));
                                if ((var27 ^ -1) < (var10 ^ -1)) {
                                  break L57;
                                } else {
                                  var29 = var25;
                                  var30 = param6[(var10 - var27) * param7 / var10];
                                  var31 = sb.field_h[var29];
                                  var32 = var30 + var31;
                                  var30 = (16711935 & var31) + (var30 & 16711935);
                                  var31 = (16777472 & var30) - -(-var30 + var32 & 65536);
                                  sb.field_h[var29] = cl.b(var32 - var31, -(var31 >>> 433266888) + var31);
                                  var25++;
                                  var26++;
                                  if (0 == 0) {
                                    continue L56;
                                  } else {
                                    break L57;
                                  }
                                }
                              }
                            }
                            var16++;
                            if (0 == 0) {
                              continue L49;
                            } else {
                              break L50;
                            }
                          }
                        }
                      }
                    }
                  }
                  return;
                }
              }
            }
          }
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return ((fg) this).field_k == param0;
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        return true;
    }

    final void a(int param0, int param1, java.awt.Component param2, byte param3) {
        ((fg) this).field_d = param0;
        ((fg) this).field_a = new int[1 + param0 * param1];
        ((fg) this).field_g = param1;
        int var5 = 101 / ((-90 - param3) / 34);
        ((fg) this).field_h = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        ((fg) this).field_f = param2.createImage((java.awt.image.ImageProducer) this);
        this.c((byte) 28);
        boolean discarded$0 = param2.prepareImage(((fg) this).field_f, (java.awt.image.ImageObserver) this);
        this.c((byte) 28);
        boolean discarded$1 = param2.prepareImage(((fg) this).field_f, (java.awt.image.ImageObserver) this);
        this.c((byte) 28);
        boolean discarded$2 = param2.prepareImage(((fg) this).field_f, (java.awt.image.ImageObserver) this);
        ((fg) this).a(103);
    }

    final static void a(byte param0, int param1) {
        int var3 = Transmogrify.field_A ? 1 : 0;
        if (param0 > -56) {
            field_j = -24L;
        }
        gd var4 = (gd) (Object) rh.field_r.a((byte) -95);
        while (var4 != null) {
            ne.a((byte) 7, var4, param1);
            var4 = (gd) (Object) rh.field_r.a(true);
        }
        wf var2 = oc.field_G.a((byte) -95);
        while (var2 != null) {
            re.a(2, param1);
            var2 = oc.field_G.a(true);
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        ((fg) this).addConsumer(param0);
    }

    public static void b(byte param0) {
        field_i = null;
        if (param0 <= 76) {
            field_j = 102L;
        }
    }

    fg() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 20000000L;
        field_i = new int[]{25, 142, 50, 95, 101, 174, 185, 112, 125, 29, 66, 86, 3, 59, 2, 44, 177, 158, 116};
    }
}
