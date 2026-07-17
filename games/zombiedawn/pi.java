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
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.a((byte) 105);
              boolean discarded$3 = param0.drawImage(((pi) this).field_f, param2, param1, (java.awt.image.ImageObserver) this);
              if (param3 == 58) {
                break L1;
              } else {
                pi.a(82, 39, (int[]) null, -71, (byte) 97, 95, -74, -52, -27, -83, -68, 66, 42, -121, 2, -104, -2);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("pi.B(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
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
            stackOut_2_1 = new StringBuilder().append("pi.imageUpdate(");
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
          throw sh.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_1_0 != 0;
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (((pi) this).field_h != param0) {
                break L1;
              } else {
                ((pi) this).field_h = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("pi.removeConsumer(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    final static void a(int param0, int param1, int[] param2, int param3, byte param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
        int var17_int = 0;
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
                var34 = param11 - param15;
                if (param15 != param16) {
                  L5: {
                    var30 = param8 << 16;
                    var29 = param8 << 16;
                    var26 = param12 << 16;
                    var25 = param12 << 16;
                    var22 = param3 << 16;
                    var21 = param3 << 16;
                    var18 = param9 << 16;
                    var17_int = param9 << 16;
                    var35 = -param15 + param16;
                    var19 = (-param9 + param1 << 16) / var35;
                    var20 = (-param9 + param10 << 16) / var34;
                    if (var20 <= var19) {
                      var32 = (-param8 + param13 << 16) / var35;
                      var27 = (-param12 + param5 << 16) / var34;
                      var24 = (param14 - param3 << 16) / var35;
                      var31 = (-param8 + param7 << 16) / var34;
                      var28 = (-param12 + param6 << 16) / var35;
                      var23 = (param0 - param3 << 16) / var34;
                      var36 = var19;
                      var19 = var20;
                      var20 = var36;
                      var33 = 1;
                      break L5;
                    } else {
                      var23 = (-param3 + param14 << 16) / var35;
                      var31 = (-param8 + param13 << 16) / var35;
                      var27 = (-param12 + param6 << 16) / var35;
                      var28 = (-param12 + param5 << 16) / var34;
                      var32 = (-param8 + param7 << 16) / var34;
                      var24 = (-param3 + param0 << 16) / var34;
                      var33 = 0;
                      break L5;
                    }
                  }
                  L6: {
                    L7: {
                      if (param15 >= 0) {
                        break L7;
                      } else {
                        if (param16 >= 0) {
                          param15 = -param15;
                          var18 = var18 + var20 * param15;
                          var21 = var21 + param15 * var23;
                          var22 = var22 + var24 * param15;
                          var26 = var26 + var28 * param15;
                          var17_int = var17_int + param15 * var19;
                          var30 = var30 + param15 * var32;
                          var29 = var29 + var31 * param15;
                          var25 = var25 + param15 * var27;
                          param15 = 0;
                          break L7;
                        } else {
                          param15 = param16 - param15;
                          var17_int = var17_int + param15 * var19;
                          var21 = var21 + var23 * param15;
                          var22 = var22 + param15 * var24;
                          var18 = var18 + var20 * param15;
                          var29 = var29 + param15 * var31;
                          var25 = var25 + param15 * var27;
                          var26 = var26 + var28 * param15;
                          var30 = var30 + param15 * var32;
                          param15 = param16;
                          break L6;
                        }
                      }
                    }
                    var36 = en.field_b[param15];
                    L8: while (true) {
                      if (param16 <= param15) {
                        break L6;
                      } else {
                        L9: {
                          var37 = var17_int >> 16;
                          if (en.field_g > var37) {
                            var38 = -(var17_int >> 16) + (var18 >> 16);
                            if (0 == var38) {
                              if (var37 < 0) {
                                break L9;
                              } else {
                                if (en.field_g <= var37) {
                                  break L9;
                                } else {
                                  fg.a(var21, 0, 0, var38, var29, 61653921, var36 + var37, 0, var25, param2);
                                  break L9;
                                }
                              }
                            } else {
                              L10: {
                                var39 = (-var21 + var22) / var38;
                                var40 = (var26 - var25) / var38;
                                var41 = (var30 + -var29) / var38;
                                if (var38 + var37 >= en.field_g) {
                                  var38 = -1 + -var37 + en.field_g;
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              if (var37 >= 0) {
                                fg.a(var21, var41, var39, var38, var29, 61653921, var36 + var37, var40, var25, param2);
                                break L9;
                              } else {
                                fg.a(-(var39 * var37) + var21, var41, var39, var37 + var38, -(var41 * var37) + var29, param4 ^ -61653959, var36, var40, var25 - var40 * var37, param2);
                                break L9;
                              }
                            }
                          } else {
                            break L9;
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
                          var17_int = var17_int + var19;
                          var36 = var36 + bi.field_f;
                          continue L8;
                        }
                      }
                    }
                  }
                  var36 = -param16 + param11;
                  if (var36 != 0) {
                    L11: {
                      var37 = param10 << 16;
                      var38 = param0 << 16;
                      var39 = param5 << 16;
                      var40 = param7 << 16;
                      if (var33 == 0) {
                        var21 = param14 << 16;
                        var25 = param6 << 16;
                        var29 = param13 << 16;
                        var17_int = param1 << 16;
                        break L11;
                      } else {
                        var22 = param14 << 16;
                        var18 = param1 << 16;
                        var30 = param13 << 16;
                        var26 = param6 << 16;
                        break L11;
                      }
                    }
                    var27 = (var39 + -var25) / var36;
                    var24 = (var38 + -var22) / var36;
                    var31 = (var40 + -var29) / var36;
                    var28 = (-var26 + var39) / var36;
                    var23 = (var38 + -var21) / var36;
                    var20 = (var37 - var18) / var36;
                    var32 = (var40 + -var30) / var36;
                    var19 = (-var17_int + var37) / var36;
                    break L4;
                  } else {
                    var19 = 0;
                    var31 = 0;
                    var23 = 0;
                    var24 = 0;
                    var28 = 0;
                    var20 = 0;
                    var32 = 0;
                    var27 = 0;
                    break L4;
                  }
                } else {
                  L12: {
                    if (param15 != param11) {
                      var35 = param11 - param16;
                      if (param1 <= param9) {
                        var30 = param8 << 16;
                        var25 = param6 << 16;
                        var19 = (-param1 + param10 << 16) / var35;
                        var20 = (param10 + -param9 << 16) / var34;
                        var31 = (-param13 + param7 << 16) / var35;
                        var27 = (-param6 + param5 << 16) / var35;
                        var17_int = param1 << 16;
                        var18 = param9 << 16;
                        var22 = param3 << 16;
                        var29 = param13 << 16;
                        var21 = param14 << 16;
                        var26 = param12 << 16;
                        var32 = (param7 - param8 << 16) / var34;
                        var24 = (-param3 + param0 << 16) / var34;
                        var28 = (param5 + -param12 << 16) / var34;
                        var23 = (-param14 + param0 << 16) / var35;
                        break L12;
                      } else {
                        var25 = param12 << 16;
                        var29 = param8 << 16;
                        var17_int = param9 << 16;
                        var28 = (-param6 + param5 << 16) / var35;
                        var32 = (-param13 + param7 << 16) / var35;
                        var23 = (param0 + -param3 << 16) / var34;
                        var26 = param6 << 16;
                        var21 = param3 << 16;
                        var27 = (-param12 + param5 << 16) / var34;
                        var20 = (-param1 + param10 << 16) / var35;
                        var19 = (-param9 + param10 << 16) / var34;
                        var24 = (-param14 + param0 << 16) / var35;
                        var18 = param1 << 16;
                        var22 = param14 << 16;
                        var31 = (param7 - param8 << 16) / var34;
                        var30 = param13 << 16;
                        break L12;
                      }
                    } else {
                      var24 = 0;
                      var27 = 0;
                      var31 = 0;
                      var32 = 0;
                      var22 = param14;
                      var26 = param6;
                      var17_int = param9 << 16;
                      var20 = 0;
                      var18 = param1 << 16;
                      var30 = param13;
                      var29 = param8;
                      var21 = param3;
                      var28 = 0;
                      var19 = 0;
                      var23 = 0;
                      var25 = param12;
                      break L12;
                    }
                  }
                  L13: {
                    if (param15 >= 0) {
                      break L13;
                    } else {
                      param15 = Math.min(-param15, -param15 + param16);
                      var30 = var30 + var32 * param15;
                      var18 = var18 + param15 * var20;
                      var25 = var25 + param15 * var27;
                      var22 = var22 + param15 * var24;
                      var17_int = var17_int + param15 * var19;
                      var26 = var26 + var28 * param15;
                      var21 = var21 + param15 * var23;
                      var29 = var29 + param15 * var31;
                      param15 = 0;
                      break L13;
                    }
                  }
                  var33 = 0;
                  break L4;
                }
              }
              L14: {
                if (param15 < 0) {
                  param15 = -param15;
                  var22 = var22 + param15 * var24;
                  var21 = var21 + param15 * var23;
                  var18 = var18 + var20 * param15;
                  var29 = var29 + param15 * var31;
                  var17_int = var17_int + param15 * var19;
                  var26 = var26 + param15 * var28;
                  var30 = var30 + param15 * var32;
                  var25 = var25 + var27 * param15;
                  param15 = 0;
                  break L14;
                } else {
                  break L14;
                }
              }
              var35 = en.field_b[param15];
              L15: while (true) {
                if (param15 >= param11) {
                  return;
                } else {
                  L16: {
                    var36 = var17_int >> 16;
                    if (var36 >= en.field_g) {
                      break L16;
                    } else {
                      var37 = -(var17_int >> 16) + (var18 >> 16);
                      if (0 != var37) {
                        L17: {
                          var38 = (-var21 + var22) / var37;
                          var39 = (-var25 + var26) / var37;
                          var40 = (var30 + -var29) / var37;
                          if (en.field_g <= var36 - -var37) {
                            var37 = -var36 + en.field_g + -1;
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        if (0 <= var36) {
                          fg.a(var21, var40, var38, var37, var29, param4 ^ -61653959, var36 - -var35, var39, var25, param2);
                          break L16;
                        } else {
                          fg.a(var21 + -(var36 * var38), var40, var38, var37 + var36, -(var36 * var40) + var29, 61653921, var35, var39, -(var39 * var36) + var25, param2);
                          break L16;
                        }
                      } else {
                        if (var36 < 0) {
                          break L16;
                        } else {
                          if (en.field_g <= var36) {
                            break L16;
                          } else {
                            fg.a(var21, 0, 0, var37, var29, 61653921, var35 + var36, 0, var25, param2);
                            break L16;
                          }
                        }
                      }
                    }
                  }
                  param15++;
                  if (param15 >= en.field_d) {
                    return;
                  } else {
                    var29 = var29 + var31;
                    var17_int = var17_int + var19;
                    var30 = var30 + var32;
                    var22 = var22 + var24;
                    var18 = var18 + var20;
                    var35 = var35 + bi.field_f;
                    var26 = var26 + var28;
                    var21 = var21 + var23;
                    var25 = var25 + var27;
                    continue L15;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
            ((pi) this).field_h = param0;
            param0.setDimensions(((pi) this).field_d, ((pi) this).field_a);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(((pi) this).field_j);
            param0.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "pi.addConsumer(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(byte param0, int param1, nn param2) {
        am var3 = null;
        try {
            var3 = dp.field_e;
            var3.j(param0 + -14, param1);
            var3.i(param2.field_h, 120);
            if (param0 != 25) {
                field_k = null;
            }
            var3.a(param2.field_i, (byte) 105);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "pi.K(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
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
    }

    final static void a(int param0, int param1, byte param2) {
        L0: {
          param0 = param0 / 24;
          param1 = param1 / 24;
          if (param1 < 0) {
            break L0;
          } else {
            if (vm.field_u[0].length <= param1) {
              break L0;
            } else {
              if (param0 < 0) {
                break L0;
              } else {
                if (vm.field_u.length <= param0) {
                  break L0;
                } else {
                  vm.field_u[param0][param1] = vm.field_u[param0][param1] + 1;
                  return;
                }
              }
            }
          }
        }
    }

    final static f[] a(int param0, am param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        f[] var4 = null;
        int var5 = 0;
        f var6_ref_f = null;
        int var6 = 0;
        int var7 = 0;
        f[] stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        f[] stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = ZombieDawn.field_J;
        try {
          L0: {
            var2_int = param1.k(127, 8);
            if (var2_int <= 0) {
              var3 = param1.k(param0 ^ 100, param0);
              var4 = new f[var3];
              var5 = 0;
              L1: while (true) {
                if (var3 <= var5) {
                  stackOut_10_0 = (f[]) var4;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  L2: {
                    if (!dg.a(param1, false)) {
                      var6 = param1.k(40, gf.a(-1 + var5, 21));
                      var4[var5] = var4[var6];
                      break L2;
                    } else {
                      var6_ref_f = new f();
                      int discarded$12 = param1.k(param0 ^ 82, 24);
                      int discarded$13 = param1.k(108, 24);
                      var6_ref_f.field_h = param1.k(91, 24);
                      int discarded$14 = param1.k(54, 9);
                      int discarded$15 = param1.k(116, 12);
                      int discarded$16 = param1.k(118, 12);
                      int discarded$17 = param1.k(param0 + 58, 12);
                      var4[var5] = var6_ref_f;
                      break L2;
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("pi.H(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_11_0;
    }

    final void a(int param0, int param1, java.awt.Component param2, int param3) {
        try {
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
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "pi.A(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
            ((pi) this).addConsumer(param0);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "pi.startProduction(" + (param0 != null ? "{...}" : "null") + 41);
        }
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
