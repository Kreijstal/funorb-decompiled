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

    final static String a(String param0, ci param1, int param2, String param3) {
        RuntimeException var5 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (param1.a((byte) -127)) {
              stackOut_3_0 = param0 + " - " + param1.a(true, 0) + "%";
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = (String) param3;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("fg.H(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44).append(0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + 32389 + 41);
        }
        return stackIn_4_0;
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
            ((fg) this).field_k = param0;
            param0.setDimensions(((fg) this).field_d, ((fg) this).field_g);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(((fg) this).field_h);
            param0.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "fg.addConsumer(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (((fg) this).field_k == param0) {
                ((fg) this).field_k = null;
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
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("fg.removeConsumer(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    final static void d() {
        if (!(ge.field_x)) {
            throw new IllegalStateException();
        }
        bg.field_n = true;
        n.a(false, false);
        gl.field_y = 0;
    }

    private final synchronized void c() {
        if (!(((fg) this).field_k != null)) {
            return;
        }
        ((fg) this).field_k.setPixels(0, 0, ((fg) this).field_d, ((fg) this).field_g, ((fg) this).field_h, ((fg) this).field_a, 0, ((fg) this).field_d);
        ((fg) this).field_k.imageComplete(2);
    }

    final void a(int param0, int param1, java.awt.Graphics param2, int param3) {
        try {
            int discarded$0 = 28;
            this.c();
            if (param0 != -32299) {
                Object var6 = null;
                ((fg) this).a(8, -89, (java.awt.Component) null, (byte) 114);
            }
            boolean discarded$1 = param2.drawImage(((fg) this).field_f, param1, param3, (java.awt.image.ImageObserver) this);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "fg.B(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5, int[] param6, int param7) {
        int var8_int = 0;
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
          var8_int = param3 + param1 - 1;
          var9 = param0 + param5 + -1;
          var10 = param4 * param4;
          var11 = -param4 + param1;
          var12 = var8_int + param4;
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
          var19 = var8_int;
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
          if (var23 <= var16) {
            L7: {
              var23 = param4 + param0;
              if (var23 <= sb.field_f) {
                break L7;
              } else {
                var23 = sb.field_f;
                break L7;
              }
            }
            L8: {
              if (param2 > 76) {
                break L8;
              } else {
                field_j = 46L;
                break L8;
              }
            }
            L9: while (true) {
              if (var23 <= var16) {
                L10: {
                  var23 = -param4 + var9;
                  if (var23 <= sb.field_f) {
                    break L10;
                  } else {
                    var23 = sb.field_f;
                    break L10;
                  }
                }
                L11: {
                  var24 = -param4 + (param3 - param4 + -1);
                  if (var17 > param1 + param4) {
                    var24 = var24 + (param4 + param1 + -var17);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: while (true) {
                  if (var16 >= var23) {
                    L13: {
                      var23 = var9;
                      var21 = (var9 + (-var16 - -1)) * (1 + -var16 + var9);
                      if (var23 > sb.field_f) {
                        var23 = sb.field_f;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    L14: while (true) {
                      if (var16 >= var23) {
                        L15: {
                          var23 = var14;
                          if (sb.field_f < var23) {
                            var23 = sb.field_f;
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        L16: while (true) {
                          if (var23 <= var16) {
                            return;
                          } else {
                            var25 = var17 + var16 * sb.field_c;
                            var21 = var21 + ((-var9 + var16 << 1) + -1);
                            var26 = var17;
                            var27 = var21 + var22;
                            L17: while (true) {
                              if (var26 >= var18) {
                                var28 = param6[(-var21 + var10) * param7 / var10];
                                var27 = var21 + 1;
                                L18: while (true) {
                                  if (var19 <= var26) {
                                    L19: while (true) {
                                      L20: {
                                        if (var20 <= var26) {
                                          break L20;
                                        } else {
                                          var27 = var27 + (-1 + (-var8_int + var26 << 1));
                                          if (var27 > var10) {
                                            break L20;
                                          } else {
                                            var29 = var25;
                                            var30 = param6[(var10 - var27) * param7 / var10];
                                            var31 = sb.field_h[var29];
                                            var32 = var30 + var31;
                                            var30 = (16711935 & var31) + (var30 & 16711935);
                                            var31 = (16777472 & var30) - -(-var30 + var32 & 65536);
                                            sb.field_h[var29] = cl.b(var32 - var31, -(var31 >>> 8) + var31);
                                            var25++;
                                            var26++;
                                            continue L19;
                                          }
                                        }
                                      }
                                      var16++;
                                      continue L16;
                                    }
                                  } else {
                                    var29 = var25;
                                    var30 = var28;
                                    var31 = sb.field_h[var29];
                                    var32 = var31 + var30;
                                    var30 = (16711935 & var31) + (16711935 & var30);
                                    var31 = (var30 & 16777472) + (65536 & var32 - var30);
                                    sb.field_h[var29] = cl.b(-(var31 >>> 8) + var31, var32 - var31);
                                    var25++;
                                    var26++;
                                    continue L18;
                                  }
                                }
                              } else {
                                L21: {
                                  var27 = var27 + ((var26 + -param1 << 1) + -1);
                                  if (var27 <= var10) {
                                    var28 = var25;
                                    var29 = param6[(var10 - var27) * param7 / var10];
                                    var30 = sb.field_h[var28];
                                    var31 = var30 + var29;
                                    var29 = (16711935 & var29) + (var30 & 16711935);
                                    var30 = (-var29 + var31 & 65536) + (var29 & 16777472);
                                    sb.field_h[var28] = cl.b(var31 + -var30, -(var30 >>> 8) + var30);
                                    break L21;
                                  } else {
                                    break L21;
                                  }
                                }
                                var25++;
                                var26++;
                                continue L17;
                              }
                            }
                          }
                        }
                      } else {
                        var21 = var21 + ((-var9 + var16 << 1) + -1);
                        var25 = sb.field_c * var16 + var17;
                        var26 = var17;
                        var27 = var22;
                        L22: while (true) {
                          if (var26 >= var9 + (-var16 + param1)) {
                            var28 = param6[(var10 - var21) * param7 / var10];
                            L23: while (true) {
                              if (var26 >= -var9 + var8_int - -var16) {
                                var27 = (1 + var8_int - var26) * (-var26 + var8_int + 1);
                                L24: while (true) {
                                  if (var26 >= var20) {
                                    var16++;
                                    continue L14;
                                  } else {
                                    var27 = var27 + ((var26 - var8_int << 1) + -1);
                                    var29 = var25;
                                    var30 = param6[param7 * (-var27 + var10) / var10];
                                    var31 = sb.field_h[var29];
                                    var32 = var30 - -var31;
                                    var30 = (16711935 & var31) + (16711935 & var30);
                                    var31 = (var30 & 16777472) + (-var30 + var32 & 65536);
                                    sb.field_h[var29] = cl.b(var31 - (var31 >>> 8), -var31 + var32);
                                    var25++;
                                    var26++;
                                    continue L24;
                                  }
                                }
                              } else {
                                L25: {
                                  if (var26 >= sb.field_b) {
                                    break L25;
                                  } else {
                                    break L25;
                                  }
                                }
                                var25++;
                                var26++;
                                continue L23;
                              }
                            }
                          } else {
                            L26: {
                              var27 = var27 + (-1 + (-param1 + var26 << 1));
                              if (var26 < sb.field_b) {
                                var28 = var25;
                                var29 = param6[param7 * (var10 - var27) / var10];
                                var30 = sb.field_h[var28];
                                var31 = var29 + var30;
                                var29 = (var29 & 16711935) - -(var30 & 16711935);
                                var30 = (var31 - var29 & 65536) + (16777472 & var29);
                                sb.field_h[var28] = cl.b(-var30 + var31, var30 + -(var30 >>> 8));
                                break L26;
                              } else {
                                break L26;
                              }
                            }
                            var25++;
                            var26++;
                            continue L22;
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
                            continue L12;
                          } else {
                            L29: {
                              var26 = var26 + (-1 + (-var8_int + var27 << 1));
                              if (sb.field_d > var27) {
                                break L29;
                              } else {
                                break L29;
                              }
                            }
                            var25++;
                            var27++;
                            continue L28;
                          }
                        }
                      } else {
                        L30: {
                          var26 = var26 + (-1 + (-param1 + var27 << 1));
                          if (sb.field_b > var27) {
                            var28 = var25;
                            var29 = param6[(-var26 + var10) * param7 / var10];
                            var30 = sb.field_h[var28];
                            var31 = var30 + var29;
                            var29 = (var29 & 16711935) + (var30 & 16711935);
                            var30 = (var29 & 16777472) - -(65536 & -var29 + var31);
                            sb.field_h[var28] = cl.b(var30 - (var30 >>> 8), var31 + -var30);
                            break L30;
                          } else {
                            break L30;
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
                var21 = var21 + ((-param0 + var16 << 1) + -1);
                var24 = sb.field_c * var16 + var17;
                var25 = var17;
                var26 = var22;
                L31: while (true) {
                  if (var16 + (param1 - param0) <= var25) {
                    var27 = param6[param7 * (var10 - var21) / var10];
                    L32: while (true) {
                      if (var8_int + -var16 - -param0 <= var25) {
                        var26 = (var8_int - (var25 + -1)) * (-var25 + var8_int - -1);
                        L33: while (true) {
                          if (var25 >= var20) {
                            var16++;
                            continue L9;
                          } else {
                            var26 = var26 + ((-var8_int + var25 << 1) + -1);
                            var28 = var24;
                            var29 = param6[param7 * (-var26 + var10) / var10];
                            var30 = sb.field_h[var28];
                            var31 = var30 + var29;
                            var29 = (16711935 & var30) + (var29 & 16711935);
                            var30 = (var29 & 16777472) - -(var31 + -var29 & 65536);
                            sb.field_h[var28] = cl.b(var31 - var30, var30 - (var30 >>> 8));
                            var24++;
                            var25++;
                            continue L33;
                          }
                        }
                      } else {
                        L34: {
                          if (var25 < sb.field_b) {
                            var28 = var24;
                            var29 = var27;
                            var30 = sb.field_h[var28];
                            var31 = var30 + var29;
                            var29 = (16711935 & var29) + (var30 & 16711935);
                            var30 = (-var29 + var31 & 65536) + (var29 & 16777472);
                            sb.field_h[var28] = cl.b(-(var30 >>> 8) + var30, -var30 + var31);
                            break L34;
                          } else {
                            break L34;
                          }
                        }
                        var24++;
                        var25++;
                        continue L32;
                      }
                    }
                  } else {
                    L35: {
                      var26 = var26 + ((var25 + -param1 << 1) + -1);
                      if (var25 < sb.field_b) {
                        var27 = var24;
                        var28 = param6[(var10 - var26) * param7 / var10];
                        var29 = sb.field_h[var27];
                        var30 = var29 + var28;
                        var28 = (var29 & 16711935) + (16711935 & var28);
                        var29 = (16777472 & var28) + (65536 & var30 - var28);
                        sb.field_h[var27] = cl.b(var29 + -(var29 >>> 8), -var29 + var30);
                        break L35;
                      } else {
                        break L35;
                      }
                    }
                    var24++;
                    var25++;
                    continue L31;
                  }
                }
              }
            }
          } else {
            var21 = var21 + ((-param0 + var16 << 1) - 1);
            var24 = var17 + sb.field_c * var16;
            var25 = var17;
            var26 = var21 - -var22;
            L36: while (true) {
              if (var25 >= var18) {
                var27 = param6[(var10 + -var21) * param7 / var10];
                var26 = 1 + var21;
                L37: while (true) {
                  if (var25 >= var19) {
                    L38: while (true) {
                      L39: {
                        if (var25 >= var20) {
                          break L39;
                        } else {
                          var26 = var26 + (-1 + (-var8_int + var25 << 1));
                          if (var10 < var26) {
                            break L39;
                          } else {
                            var28 = var24;
                            var29 = param6[param7 * (-var26 + var10) / var10];
                            var30 = sb.field_h[var28];
                            var31 = var30 + var29;
                            var29 = (16711935 & var30) + (var29 & 16711935);
                            var30 = (var29 & 16777472) + (var31 - var29 & 65536);
                            sb.field_h[var28] = cl.b(-(var30 >>> 8) + var30, var31 - var30);
                            var24++;
                            var25++;
                            continue L38;
                          }
                        }
                      }
                      var16++;
                      continue L6;
                    }
                  } else {
                    var28 = var24;
                    var29 = var27;
                    var30 = sb.field_h[var28];
                    var31 = var30 + var29;
                    var29 = (var29 & 16711935) + (var30 & 16711935);
                    var30 = (16777472 & var29) + (65536 & -var29 + var31);
                    sb.field_h[var28] = cl.b(var30 + -(var30 >>> 8), var31 - var30);
                    var24++;
                    var25++;
                    continue L37;
                  }
                }
              } else {
                L40: {
                  var26 = var26 + ((var25 + -param1 << 1) + -1);
                  if (var26 <= var10) {
                    var27 = var24;
                    var28 = param6[(var10 + -var26) * param7 / var10];
                    var29 = sb.field_h[var27];
                    var30 = var29 + var28;
                    var28 = (var29 & 16711935) + (var28 & 16711935);
                    var29 = (16777472 & var28) + (var30 - var28 & 65536);
                    sb.field_h[var27] = cl.b(-(var29 >>> 8) + var29, var30 - var29);
                    break L40;
                  } else {
                    break L40;
                  }
                }
                var24++;
                var25++;
                continue L36;
              }
            }
          }
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return ((fg) this).field_k == param0;
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = 1;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var7;
            stackOut_2_1 = new StringBuilder().append("fg.imageUpdate(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_1_0 != 0;
    }

    final void a(int param0, int param1, java.awt.Component param2, byte param3) {
        try {
            ((fg) this).field_d = param0;
            ((fg) this).field_a = new int[1 + param0 * param1];
            ((fg) this).field_g = param1;
            int var5_int = 101 / ((-90 - param3) / 34);
            ((fg) this).field_h = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
            ((fg) this).field_f = param2.createImage((java.awt.image.ImageProducer) this);
            int discarded$0 = 28;
            this.c();
            boolean discarded$1 = param2.prepareImage(((fg) this).field_f, (java.awt.image.ImageObserver) this);
            int discarded$2 = 28;
            this.c();
            boolean discarded$3 = param2.prepareImage(((fg) this).field_f, (java.awt.image.ImageObserver) this);
            int discarded$4 = 28;
            this.c();
            boolean discarded$5 = param2.prepareImage(((fg) this).field_f, (java.awt.image.ImageObserver) this);
            ((fg) this).a(103);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "fg.A(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    final static void a(byte param0, int param1) {
        wf var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        gd var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var4 = (gd) (Object) rh.field_r.a((byte) -95);
            L1: while (true) {
              if (var4 == null) {
                var2 = oc.field_G.a((byte) -95);
                L2: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    re.a(2, 4);
                    var2 = oc.field_G.a(true);
                    continue L2;
                  }
                }
              } else {
                ne.a((byte) 7, var4, 4);
                var4 = (gd) (Object) rh.field_r.a(true);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var2_ref, "fg.D(" + -98 + 44 + 4 + 41);
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
            ((fg) this).addConsumer(param0);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "fg.startProduction(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public static void b() {
        field_i = null;
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
