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
        RuntimeException var5 = null;
        int[] var6 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param4 == 32389) {
                break L1;
              } else {
                var6 = (int[]) null;
                fg.a(61, 83, (byte) 125, 103, 62, -127, (int[]) null, -45);
                break L1;
              }
            }
            if (param1.a((byte) -127)) {
              stackIn_6_0 = param0 + " - " + param1.a(true, param2) + "%";
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = (String) (param3);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("fg.H(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_10_0), stackIn_16_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
            this.field_k = param0;
            param0.setDimensions(this.field_d, this.field_g);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(this.field_h);
            param0.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "fg.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (this.field_k == param0) {
                this.field_k = null;
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("fg.removeConsumer(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    final static void d(byte param0) {
        if (!(ge.field_x)) {
            throw new IllegalStateException();
        }
        bg.field_n = true;
        n.a(false, false);
        if (param0 != 91) {
            return;
        }
        gl.field_y = 0;
    }

    private final synchronized void c(byte param0) {
        if (param0 != 28) {
            return;
        }
        if (!(this.field_k != null)) {
            return;
        }
        this.field_k.setPixels(0, 0, this.field_d, this.field_g, this.field_h, this.field_a, 0, this.field_d);
        this.field_k.imageComplete(2);
    }

    final void a(int param0, int param1, java.awt.Graphics param2, int param3) {
        try {
            this.c((byte) 28);
            if (param0 != -32299) {
                java.awt.Component var6 = (java.awt.Component) null;
                this.a(8, -89, (java.awt.Component) null, (byte) 114);
            }
            param2.drawImage(this.field_f, param1, param3, (java.awt.image.ImageObserver) (this));
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "fg.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5, int[] param6, int param7) {
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        String stackIn_108_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
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
        var33 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var8_int = param3 + param1 - 1;
              var9 = param0 + param5 + -1;
              var10 = param4 * param4;
              var11 = -param4 + param1;
              var12 = var8_int + param4;
              var13 = param0 - param4;
              var14 = param4 + var9;
              var15 = var13;
              if (var15 >= sb.field_e) {
                break L1;
              } else {
                var15 = sb.field_e;
                break L1;
              }
            }
            L2: {
              var16 = var15;
              var17 = var11;
              if (sb.field_d <= var17) {
                break L2;
              } else {
                var17 = sb.field_d;
                break L2;
              }
            }
            L3: {
              var18 = param1;
              if (var18 <= sb.field_b) {
                break L3;
              } else {
                var18 = sb.field_b;
                break L3;
              }
            }
            L4: {
              var19 = var8_int;
              if (sb.field_b < var19) {
                var19 = sb.field_b;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var20 = var12;
              if (var20 > sb.field_b) {
                var20 = sb.field_b;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              var21 = (-var16 + param0 + 1) * (1 + -var16 + param0);
              var22 = (1 + param1 + -var17) * (-var17 + (param1 - -1));
              var23 = param0;
              if (sb.field_f >= var23) {
                break L6;
              } else {
                var23 = sb.field_f;
                break L6;
              }
            }
            L7: while (true) {
              if (var23 <= var16) {
                L8: {
                  var23 = param4 + param0;
                  if (var23 <= sb.field_f) {
                    break L8;
                  } else {
                    var23 = sb.field_f;
                    break L8;
                  }
                }
                L9: {
                  if (param2 > 76) {
                    break L9;
                  } else {
                    field_j = 46L;
                    break L9;
                  }
                }
                L10: while (true) {
                  if (var23 <= var16) {
                    L11: {
                      var23 = -param4 + var9;
                      if (var23 <= sb.field_f) {
                        break L11;
                      } else {
                        var23 = sb.field_f;
                        break L11;
                      }
                    }
                    L12: {
                      var24 = -param4 + (param3 - param4 + -1);
                      if (var17 > param1 + param4) {
                        var24 = var24 + (param4 + param1 + -var17);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    L13: while (true) {
                      if (var16 >= var23) {
                        L14: {
                          var23 = var9;
                          var21 = (var9 + (-var16 - -1)) * (1 + -var16 + var9);
                          if (var23 > sb.field_f) {
                            var23 = sb.field_f;
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        L15: while (true) {
                          if (var16 >= var23) {
                            L16: {
                              var23 = var14;
                              if (sb.field_f < var23) {
                                var23 = sb.field_f;
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                            L17: while (true) {
                              if (var23 <= var16) {
                                break L0;
                              } else {
                                var25 = var17 + var16 * sb.field_c;
                                var21 = var21 + ((-var9 + var16 << 980968193) + -1);
                                var26 = var17;
                                var27 = var21 + var22;
                                L18: while (true) {
                                  if (var26 >= var18) {
                                    var28 = param6[(-var21 + var10) * param7 / var10];
                                    var27 = var21 + 1;
                                    L19: while (true) {
                                      if (var19 <= var26) {
                                        L20: while (true) {
                                          L21: {
                                            if (var20 <= var26) {
                                              break L21;
                                            } else {
                                              var27 = var27 + (-1 + (-var8_int + var26 << -2000980191));
                                              if ((var27 ^ -1) < (var10 ^ -1)) {
                                                break L21;
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
                                                continue L20;
                                              }
                                            }
                                          }
                                          var16++;
                                          continue L17;
                                        }
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
                                        continue L19;
                                      }
                                    }
                                  } else {
                                    L22: {
                                      var27 = var27 + ((var26 + -param1 << 279067809) + -1);
                                      if (var27 <= var10) {
                                        var28 = var25;
                                        var29 = param6[(var10 - var27) * param7 / var10];
                                        var30 = sb.field_h[var28];
                                        var31 = var30 + var29;
                                        var29 = (16711935 & var29) + (var30 & 16711935);
                                        var30 = (-var29 + var31 & 65536) + (var29 & 16777472);
                                        sb.field_h[var28] = cl.b(var31 + -var30, -(var30 >>> -1586190520) + var30);
                                        break L22;
                                      } else {
                                        break L22;
                                      }
                                    }
                                    var25++;
                                    var26++;
                                    continue L18;
                                  }
                                }
                              }
                            }
                          } else {
                            var21 = var21 + ((-var9 + var16 << 783861889) + -1);
                            var25 = sb.field_c * var16 + var17;
                            var26 = var17;
                            var27 = var22;
                            L23: while (true) {
                              if (var26 >= var9 + (-var16 + param1)) {
                                var28 = param6[(var10 - var21) * param7 / var10];
                                L24: while (true) {
                                  if (var26 >= -var9 + var8_int - -var16) {
                                    var27 = (1 + var8_int - var26) * (-var26 + var8_int + 1);
                                    L25: while (true) {
                                      if (var26 >= var20) {
                                        var16++;
                                        continue L15;
                                      } else {
                                        var27 = var27 + ((var26 - var8_int << 1680675873) + -1);
                                        var29 = var25;
                                        var30 = param6[param7 * (-var27 + var10) / var10];
                                        var31 = sb.field_h[var29];
                                        var32 = var30 - -var31;
                                        var30 = (16711935 & var31) + (16711935 & var30);
                                        var31 = (var30 & 16777472) + (-var30 + var32 & 65536);
                                        sb.field_h[var29] = cl.b(var31 - (var31 >>> -2007951192), -var31 + var32);
                                        var25++;
                                        var26++;
                                        continue L25;
                                      }
                                    }
                                  } else {
                                    if (var26 < sb.field_b) {
                                      var29 = var25;
                                      var30 = var28;
                                      var31 = sb.field_h[var29];
                                      var32 = var31 + var30;
                                      var30 = (var31 & 16711935) + (var30 & 16711935);
                                      var31 = (16777472 & var30) + (65536 & var32 - var30);
                                      sb.field_h[var29] = cl.b(var31 + -(var31 >>> 1025857608), -var31 + var32);
                                      var25++;
                                      var26++;
                                      continue L24;
                                    } else {
                                      var25++;
                                      var26++;
                                      continue L24;
                                    }
                                  }
                                }
                              } else {
                                L26: {
                                  var27 = var27 + (-1 + (-param1 + var26 << -1144888671));
                                  if ((var26 ^ -1) > (sb.field_b ^ -1)) {
                                    var28 = var25;
                                    var29 = param6[param7 * (var10 - var27) / var10];
                                    var30 = sb.field_h[var28];
                                    var31 = var29 + var30;
                                    var29 = (var29 & 16711935) - -(var30 & 16711935);
                                    var30 = (var31 - var29 & 65536) + (16777472 & var29);
                                    sb.field_h[var28] = cl.b(-var30 + var31, var30 + -(var30 >>> 649140840));
                                    break L26;
                                  } else {
                                    break L26;
                                  }
                                }
                                var25++;
                                var26++;
                                continue L23;
                              }
                            }
                          }
                        }
                      } else {
                        var25 = var17 + var16 * sb.field_c;
                        var26 = var22;
                        var27 = var17;
                        L27: while (true) {
                          if (param1 + param4 <= var27) {
                            var26 = 1 + (param4 + var10) - -param4;
                            var25 = var25 + var24;
                            var27 = var8_int + -param4;
                            L28: while (true) {
                              if (var27 >= var20) {
                                var16++;
                                continue L13;
                              } else {
                                var26 = var26 + (-1 + (-var8_int + var27 << 501491297));
                                if ((sb.field_d ^ -1) >= (var27 ^ -1)) {
                                  var28 = var25;
                                  var29 = param6[param7 * (-var26 + var10) / var10];
                                  var30 = sb.field_h[var28];
                                  var31 = var29 + var30;
                                  var29 = (16711935 & var30) + (var29 & 16711935);
                                  var30 = (65536 & -var29 + var31) + (var29 & 16777472);
                                  sb.field_h[var28] = cl.b(var31 - var30, var30 + -(var30 >>> 2081393352));
                                  var25++;
                                  var27++;
                                  continue L28;
                                } else {
                                  var25++;
                                  var27++;
                                  continue L28;
                                }
                              }
                            }
                          } else {
                            L29: {
                              var26 = var26 + (-1 + (-param1 + var27 << -1244466495));
                              if ((sb.field_b ^ -1) < (var27 ^ -1)) {
                                var28 = var25;
                                var29 = param6[(-var26 + var10) * param7 / var10];
                                var30 = sb.field_h[var28];
                                var31 = var30 + var29;
                                var29 = (var29 & 16711935) + (var30 & 16711935);
                                var30 = (var29 & 16777472) - -(65536 & -var29 + var31);
                                sb.field_h[var28] = cl.b(var30 - (var30 >>> -1385613112), var31 + -var30);
                                break L29;
                              } else {
                                break L29;
                              }
                            }
                            var25++;
                            var27++;
                            continue L27;
                          }
                        }
                      }
                    }
                  } else {
                    var21 = var21 + ((-param0 + var16 << 1430730785) + -1);
                    var24 = sb.field_c * var16 + var17;
                    var25 = var17;
                    var26 = var22;
                    L30: while (true) {
                      if (var16 + (param1 - param0) <= var25) {
                        var27 = param6[param7 * (var10 - var21) / var10];
                        L31: while (true) {
                          if (var8_int + -var16 - -param0 <= var25) {
                            var26 = (var8_int - (var25 + -1)) * (-var25 + var8_int - -1);
                            L32: while (true) {
                              if (var25 >= var20) {
                                var16++;
                                continue L10;
                              } else {
                                var26 = var26 + ((-var8_int + var25 << -476816703) + -1);
                                var28 = var24;
                                var29 = param6[param7 * (-var26 + var10) / var10];
                                var30 = sb.field_h[var28];
                                var31 = var30 + var29;
                                var29 = (16711935 & var30) + (var29 & 16711935);
                                var30 = (var29 & 16777472) - -(var31 + -var29 & 65536);
                                sb.field_h[var28] = cl.b(var31 - var30, var30 - (var30 >>> 1935514952));
                                var24++;
                                var25++;
                                continue L32;
                              }
                            }
                          } else {
                            L33: {
                              if (var25 < sb.field_b) {
                                var28 = var24;
                                var29 = var27;
                                var30 = sb.field_h[var28];
                                var31 = var30 + var29;
                                var29 = (16711935 & var29) + (var30 & 16711935);
                                var30 = (-var29 + var31 & 65536) + (var29 & 16777472);
                                sb.field_h[var28] = cl.b(-(var30 >>> -108879032) + var30, -var30 + var31);
                                break L33;
                              } else {
                                break L33;
                              }
                            }
                            var24++;
                            var25++;
                            continue L31;
                          }
                        }
                      } else {
                        L34: {
                          var26 = var26 + ((var25 + -param1 << -1298665055) + -1);
                          if ((var25 ^ -1) > (sb.field_b ^ -1)) {
                            var27 = var24;
                            var28 = param6[(var10 - var26) * param7 / var10];
                            var29 = sb.field_h[var27];
                            var30 = var29 + var28;
                            var28 = (var29 & 16711935) + (16711935 & var28);
                            var29 = (16777472 & var28) + (65536 & var30 - var28);
                            sb.field_h[var27] = cl.b(var29 + -(var29 >>> -612613368), -var29 + var30);
                            break L34;
                          } else {
                            break L34;
                          }
                        }
                        var24++;
                        var25++;
                        continue L30;
                      }
                    }
                  }
                }
              } else {
                var21 = var21 + ((-param0 + var16 << 1677889697) - 1);
                var24 = var17 + sb.field_c * var16;
                var25 = var17;
                var26 = var21 - -var22;
                L35: while (true) {
                  if (var25 >= var18) {
                    var27 = param6[(var10 + -var21) * param7 / var10];
                    var26 = 1 + var21;
                    L36: while (true) {
                      if (var25 >= var19) {
                        L37: while (true) {
                          L38: {
                            if (var25 >= var20) {
                              break L38;
                            } else {
                              var26 = var26 + (-1 + (-var8_int + var25 << 1798921409));
                              if ((var10 ^ -1) > (var26 ^ -1)) {
                                break L38;
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
                                continue L37;
                              }
                            }
                          }
                          var16++;
                          continue L7;
                        }
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
                        continue L36;
                      }
                    }
                  } else {
                    L39: {
                      var26 = var26 + ((var25 + -param1 << -270157823) + -1);
                      if (var26 <= var10) {
                        var27 = var24;
                        var28 = param6[(var10 + -var26) * param7 / var10];
                        var29 = sb.field_h[var27];
                        var30 = var29 + var28;
                        var28 = (var29 & 16711935) + (var28 & 16711935);
                        var29 = (16777472 & var28) + (var30 - var28 & 65536);
                        sb.field_h[var27] = cl.b(-(var29 >>> -321382360) + var29, var30 - var29);
                        break L39;
                      } else {
                        break L39;
                      }
                    }
                    var24++;
                    var25++;
                    continue L35;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L40: {
            var8 = decompiledCaughtException;
            stackIn_107_0 = (RuntimeException) (var8);

            stackIn_107_1 = new StringBuilder().append("fg.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_108_0 = (RuntimeException) ((Object) stackIn_107_0);
              stackIn_108_1 = (StringBuilder) ((Object) stackIn_107_1);
              stackIn_108_2 = "null";
              break L40;
            } else {
              stackIn_108_0 = (RuntimeException) ((Object) stackIn_107_0);
              stackIn_108_1 = (StringBuilder) ((Object) stackIn_107_1);
              stackIn_108_2 = "{...}";
              break L40;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_108_0), stackIn_108_2 + ',' + param7 + ')');
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return this.field_k == param0;
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            stackIn_1_0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var7);

            stackIn_4_1 = new StringBuilder().append("fg.imageUpdate(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_1_0 != 0;
    }

    final void a(int param0, int param1, java.awt.Component param2, byte param3) {
        try {
            this.field_d = param0;
            this.field_a = new int[1 + param0 * param1];
            this.field_g = param1;
            int var5_int = 101 / ((-90 - param3) / 34);
            this.field_h = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
            this.field_f = param2.createImage((java.awt.image.ImageProducer) (this));
            this.c((byte) 28);
            param2.prepareImage(this.field_f, (java.awt.image.ImageObserver) (this));
            this.c((byte) 28);
            param2.prepareImage(this.field_f, (java.awt.image.ImageObserver) (this));
            this.c((byte) 28);
            param2.prepareImage(this.field_f, (java.awt.image.ImageObserver) (this));
            this.a(103);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "fg.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(byte param0, int param1) {
        wf var2 = null;
        int var3 = 0;
        gd var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 <= -56) {
                break L1;
              } else {
                field_j = -24L;
                break L1;
              }
            }
            var4 = (gd) ((Object) rh.field_r.a((byte) -95));
            L2: while (true) {
              if (var4 == null) {
                var2 = oc.field_G.a((byte) -95);
                L3: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    re.a(2, param1);
                    var2 = oc.field_G.a(true);
                    continue L3;
                  }
                }
              } else {
                ne.a((byte) 7, var4, param1);
                var4 = (gd) ((Object) rh.field_r.a(true));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var2_ref), "fg.D(" + param0 + ',' + param1 + ')');
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
            this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "fg.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
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
        field_j = 20000000L;
        field_i = new int[]{25, 142, 50, 95, 101, 174, 185, 112, 125, 29, 66, 86, 3, 59, 2, 44, 177, 158, 116};
    }
}
