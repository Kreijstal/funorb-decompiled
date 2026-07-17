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

    public static void b() {
        field_u = null;
        field_v = null;
        field_A = null;
        field_z = null;
    }

    final f e(int param0, int param1, f[][] param2, int param3) {
        RuntimeException var5 = null;
        f var5_ref = null;
        de var6 = null;
        int var7 = 0;
        f stackIn_16_0 = null;
        Object stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        f stackOut_15_0 = null;
        Object stackOut_22_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var7 = CrazyCrystals.field_B;
        try {
          L0: {
            var5_ref = ((cd) this).field_l;
            L1: while (true) {
              L2: {
                if (var5_ref instanceof de) {
                  var6 = (de) (Object) var5_ref;
                  if (var6.field_j == null) {
                    L3: {
                      if (!vh.field_a) {
                        break L3;
                      } else {
                        if (uo.field_o != 4) {
                          break L3;
                        } else {
                          L4: {
                            if (w.field_f + 2 != param1) {
                              break L4;
                            } else {
                              if (12 + ia.field_i == param0) {
                                va.field_c = 1;
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                          }
                          if (w.field_f + 2 != param1) {
                            break L3;
                          } else {
                            if (ia.field_i + 27 != param0) {
                              break L3;
                            } else {
                              va.field_c = 2;
                              break L3;
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
                    stackOut_15_0 = ((cd) this).a(param2, param0, (f) this, 11460, param1);
                    stackIn_16_0 = stackOut_15_0;
                    return stackIn_16_0;
                  } else {
                    break L2;
                  }
                } else {
                  if (var5_ref instanceof pn) {
                    var5_ref = ((pn) (Object) var5_ref).field_l;
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              L5: {
                if (param3 >= 120) {
                  break L5;
                } else {
                  f discarded$1 = ((cd) this).e(-51, 45, (f[][]) null, -88);
                  break L5;
                }
              }
              stackOut_22_0 = this;
              stackIn_23_0 = stackOut_22_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var5;
            stackOut_24_1 = new StringBuilder().append("cd.OA(").append(param0).append(44).append(param1).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L6;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L6;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param3 + 41);
        }
        return (f) this;
    }

    final void a(int param0, DataInputStream param1, int param2, byte param3, int param4) throws IOException {
        int var6_int = 0;
        int var7 = 0;
        try {
            var6_int = param1.readUnsignedByte();
            if (param3 >= -69) {
                ((cd) this).field_w = 52;
            }
            ((cd) this).field_t = mo.field_h[3 & var6_int];
            ((cd) this).field_C = kl.field_S[3 & var6_int];
            var7 = (var6_int >> 1 & 2) - 1;
            ((cd) this).field_y = var7 * -((cd) this).field_t;
            ((cd) this).field_x = ((cd) this).field_C * var7;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "cd.JC(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
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
            if (param2 != 24) {
              break L2;
            } else {
              if (param3 == 24) {
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
                if (~param0 > ~nb.field_d) {
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
                var34 = param4 - param2;
                if (~param2 == ~param8) {
                  L4: {
                    if (param2 == param4) {
                      var24 = 0;
                      var28 = 0;
                      var17_int = param0 << 16;
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
                      var18 = param13 << 16;
                      break L4;
                    } else {
                      var35 = param4 + -param8;
                      if (~param13 < ~param0) {
                        var29 = param7 << 16;
                        var20 = (param6 - param13 << 16) / var35;
                        var26 = param9 << 16;
                        var23 = (-param10 + param12 << 16) / var34;
                        var31 = (-param7 + param1 << 16) / var34;
                        var21 = param10 << 16;
                        var25 = param16 << 16;
                        var27 = (param11 - param16 << 16) / var34;
                        var22 = param5 << 16;
                        var19 = (-param0 + param6 << 16) / var34;
                        var30 = param3 << 16;
                        var18 = param13 << 16;
                        var17_int = param0 << 16;
                        var32 = (-param3 + param1 << 16) / var35;
                        var24 = (param12 + -param5 << 16) / var35;
                        var28 = (param11 - param9 << 16) / var35;
                        break L4;
                      } else {
                        var24 = (-param10 + param12 << 16) / var34;
                        var29 = param3 << 16;
                        var26 = param16 << 16;
                        var32 = (-param7 + param1 << 16) / var34;
                        var17_int = param13 << 16;
                        var23 = (-param5 + param12 << 16) / var35;
                        var18 = param0 << 16;
                        var21 = param5 << 16;
                        var31 = (-param3 + param1 << 16) / var35;
                        var27 = (-param9 + param11 << 16) / var35;
                        var20 = (param6 - param0 << 16) / var34;
                        var19 = (param6 + -param13 << 16) / var35;
                        var30 = param7 << 16;
                        var25 = param9 << 16;
                        var28 = (param11 - param16 << 16) / var34;
                        var22 = param10 << 16;
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (param2 < 0) {
                      param2 = Math.min(-param2, param8 - param2);
                      var25 = var25 + var27 * param2;
                      var22 = var22 + param2 * var24;
                      var18 = var18 + param2 * var20;
                      var29 = var29 + param2 * var31;
                      var21 = var21 + var23 * param2;
                      var30 = var30 + param2 * var32;
                      var17_int = var17_int + var19 * param2;
                      var26 = var26 + param2 * var28;
                      param2 = 0;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var33 = 0;
                  break L3;
                } else {
                  L6: {
                    var26 = param16 << 16;
                    var25 = param16 << 16;
                    var18 = param0 << 16;
                    var17_int = param0 << 16;
                    var30 = param7 << 16;
                    var29 = param7 << 16;
                    var22 = param10 << 16;
                    var21 = param10 << 16;
                    var35 = param8 - param2;
                    var20 = (param6 - param0 << 16) / var34;
                    var19 = (-param0 + param13 << 16) / var35;
                    if (var20 <= var19) {
                      var33 = 1;
                      var32 = (-param7 + param3 << 16) / var35;
                      var31 = (-param7 + param1 << 16) / var34;
                      var28 = (-param16 + param9 << 16) / var35;
                      var23 = (param12 - param10 << 16) / var34;
                      var27 = (param11 - param16 << 16) / var34;
                      var24 = (-param10 + param5 << 16) / var35;
                      var36 = var19;
                      var19 = var20;
                      var20 = var36;
                      break L6;
                    } else {
                      var33 = 0;
                      var27 = (param9 + -param16 << 16) / var35;
                      var31 = (-param7 + param3 << 16) / var35;
                      var32 = (param1 - param7 << 16) / var34;
                      var23 = (-param10 + param5 << 16) / var35;
                      var24 = (param12 + -param10 << 16) / var34;
                      var28 = (param11 - param16 << 16) / var34;
                      break L6;
                    }
                  }
                  L7: {
                    L8: {
                      if (param2 >= 0) {
                        break L8;
                      } else {
                        if (param8 < 0) {
                          param2 = param8 + -param2;
                          var21 = var21 + var23 * param2;
                          var25 = var25 + param2 * var27;
                          var17_int = var17_int + var19 * param2;
                          var30 = var30 + var32 * param2;
                          var29 = var29 + param2 * var31;
                          var26 = var26 + var28 * param2;
                          var18 = var18 + var20 * param2;
                          var22 = var22 + param2 * var24;
                          param2 = param8;
                          break L7;
                        } else {
                          param2 = -param2;
                          var25 = var25 + param2 * var27;
                          var22 = var22 + param2 * var24;
                          var30 = var30 + var32 * param2;
                          var18 = var18 + param2 * var20;
                          var21 = var21 + var23 * param2;
                          var17_int = var17_int + var19 * param2;
                          var29 = var29 + var31 * param2;
                          var26 = var26 + param2 * var28;
                          param2 = 0;
                          break L8;
                        }
                      }
                    }
                    var36 = nb.field_a[param2];
                    L9: while (true) {
                      if (~param2 <= ~param8) {
                        break L7;
                      } else {
                        L10: {
                          var37 = var17_int >> 16;
                          if (~var37 <= ~nb.field_d) {
                            break L10;
                          } else {
                            var38 = (var18 >> 16) - (var17_int >> 16);
                            if (var38 != 0) {
                              L11: {
                                var39 = (var22 - var21) / var38;
                                var40 = (-var25 + var26) / var38;
                                var41 = (-var29 + var30) / var38;
                                if (var37 - -var38 < nb.field_d) {
                                  break L11;
                                } else {
                                  var38 = -1 + nb.field_d - var37;
                                  break L11;
                                }
                              }
                              if (var37 < 0) {
                                w.a(-(var39 * var37) + var21, (byte) -52, param15, var40, -(var37 * var40) + var25, var41, var39, var29 - var41 * var37, var37 + var38, var36);
                                break L10;
                              } else {
                                w.a(var21, (byte) -52, param15, var40, var25, var41, var39, var29, var38, var37 + var36);
                                break L10;
                              }
                            } else {
                              if (var37 < 0) {
                                break L10;
                              } else {
                                if (~var37 > ~nb.field_d) {
                                  w.a(var21, (byte) -52, param15, 0, var25, 0, 0, var29, var38, var37 + var36);
                                  break L10;
                                } else {
                                  break L10;
                                }
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
                          var17_int = var17_int + var19;
                          var25 = var25 + var27;
                          var22 = var22 + var24;
                          var18 = var18 + var20;
                          var36 = var36 + kh.field_l;
                          var26 = var26 + var28;
                          var21 = var21 + var23;
                          continue L9;
                        }
                      }
                    }
                  }
                  var36 = param4 - param8;
                  if (var36 == 0) {
                    var28 = 0;
                    var20 = 0;
                    var31 = 0;
                    var19 = 0;
                    var24 = 0;
                    var32 = 0;
                    var27 = 0;
                    var23 = 0;
                    break L3;
                  } else {
                    L12: {
                      var37 = param6 << 16;
                      var38 = param12 << 16;
                      var39 = param11 << 16;
                      if (var33 == 0) {
                        var29 = param3 << 16;
                        var21 = param5 << 16;
                        var17_int = param13 << 16;
                        var25 = param9 << 16;
                        break L12;
                      } else {
                        var30 = param3 << 16;
                        var18 = param13 << 16;
                        var26 = param9 << 16;
                        var22 = param5 << 16;
                        break L12;
                      }
                    }
                    var40 = param1 << 16;
                    var19 = (var37 + -var17_int) / var36;
                    var24 = (var38 - var22) / var36;
                    var28 = (-var26 + var39) / var36;
                    var32 = (var40 - var30) / var36;
                    var31 = (-var29 + var40) / var36;
                    var20 = (var37 - var18) / var36;
                    var27 = (-var25 + var39) / var36;
                    var23 = (-var21 + var38) / var36;
                    break L3;
                  }
                }
              }
              L13: {
                if (param2 >= 0) {
                  break L13;
                } else {
                  param2 = -param2;
                  var30 = var30 + var32 * param2;
                  var17_int = var17_int + var19 * param2;
                  var25 = var25 + var27 * param2;
                  var18 = var18 + var20 * param2;
                  var29 = var29 + param2 * var31;
                  var21 = var21 + var23 * param2;
                  var22 = var22 + var24 * param2;
                  var26 = var26 + var28 * param2;
                  param2 = 0;
                  break L13;
                }
              }
              var35 = nb.field_a[param2];
              L14: while (true) {
                if (~param4 >= ~param2) {
                  return;
                } else {
                  L15: {
                    var36 = var17_int >> 16;
                    if (var36 >= nb.field_d) {
                      break L15;
                    } else {
                      var37 = (var18 >> 16) + -(var17_int >> 16);
                      if (var37 == 0) {
                        if (var36 < 0) {
                          break L15;
                        } else {
                          if (var36 < nb.field_d) {
                            w.a(var21, (byte) -52, param15, 0, var25, 0, 0, var29, var37, var35 + var36);
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                      } else {
                        L16: {
                          var38 = (-var21 + var22) / var37;
                          var39 = (-var25 + var26) / var37;
                          var40 = (var30 + -var29) / var37;
                          if (var36 - -var37 < nb.field_d) {
                            break L16;
                          } else {
                            var37 = nb.field_d + (-var36 + -1);
                            break L16;
                          }
                        }
                        if (var36 < 0) {
                          w.a(var21 + -(var36 * var38), (byte) -52, param15, var39, -(var39 * var36) + var25, var40, var38, -(var36 * var40) + var29, var37 + var36, var35);
                          break L15;
                        } else {
                          w.a(var21, (byte) -52, param15, var39, var25, var40, var38, var29, var37, var35 + var36);
                          break L15;
                        }
                      }
                    }
                  }
                  param2++;
                  if (nb.field_b > param2) {
                    var30 = var30 + var32;
                    var29 = var29 + var31;
                    var21 = var21 + var23;
                    var25 = var25 + var27;
                    var35 = var35 + kh.field_l;
                    var22 = var22 + var24;
                    var26 = var26 + var28;
                    var17_int = var17_int + var19;
                    var18 = var18 + var20;
                    continue L14;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        }
    }

    final void a(int param0, f[][] param1, int param2, int param3) {
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
              if (param0 == -35) {
                break L1;
              } else {
                ((cd) this).field_w = 37;
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
            stackOut_3_1 = new StringBuilder().append("cd.KC(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          throw dn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static boolean a(CharSequence param0, byte param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
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
              if (param1 <= -92) {
                break L1;
              } else {
                var3 = null;
                boolean discarded$4 = cd.a((CharSequence) null, (byte) 47);
                break L1;
              }
            }
            int discarded$5 = 1;
            stackOut_2_0 = wi.a(48, 10, param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("cd.IC(");
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
          throw dn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
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
        int var9 = param3 + param6 << 4;
        int var11 = (param4 << 4) - -(param1 << 3);
        double var12 = param0 + (double)(((cd) this).field_w + ((cd) this).field_m) * 0.16534698176788384;
        int var14 = (int)(13.856406460551018 * (Math.sin(var12) * (double)param3));
        int var15 = (int)(13.856406460551018 * (Math.cos(var12) * (double)param1));
        int var16 = (((cd) this).field_x - ((cd) this).field_y) * (((cd) this).field_C + ((cd) this).field_t);
        kh.a(var9 + -(var14 * var16), var11 - var15 + (int)((double)param1 * 4.0) * param2, param3 << 1, 15, f.field_c);
        kh.a(var16 * var14 + var9, (int)(4.0 * (double)param1) * param2 + (var11 - -var15), param3 << 1, 15, f.field_c);
    }

    final f a(f[][] param0, int param1, f param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_14_0 = null;
        f stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        f stackOut_15_0 = null;
        Object stackOut_13_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (ab.field_D != null) {
                break L1;
              } else {
                gl.field_e = gl.field_e - 1;
                if (param2 != null) {
                  var6_int = param2.a(false);
                  var7 = 0;
                  L2: while (true) {
                    if (3 <= var7) {
                      break L1;
                    } else {
                      L3: {
                        if (0 != (1 << var7 & var6_int)) {
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
                            break L3;
                          } else {
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      }
                      var7++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            if (param3 == 11460) {
              stackOut_15_0 = ((cd) this).field_l;
              stackIn_16_0 = stackOut_15_0;
              break L0;
            } else {
              stackOut_13_0 = null;
              stackIn_14_0 = stackOut_13_0;
              return (f) (Object) stackIn_14_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var6;
            stackOut_17_1 = new StringBuilder().append("cd.VA(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          L5: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44).append(param1).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param3 + 44 + param4 + 41);
        }
        return stackIn_16_0;
    }

    final nj a(int param0, nj param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        nj stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        nj stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == 23525) {
              stackOut_3_0 = ng.a(wd.field_h, param1, (f) (Object) new cd((f) (Object) new kp(-1), 0, 0, 0, 0), (byte) -83, wg.field_N);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (nj) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("cd.V(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
          throw dn.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    private final dl i(int param0) {
        if (((cd) this).field_x >= 0) {
          if (((cd) this).field_x > 0) {
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
        RuntimeException var8 = null;
        f stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        f stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              ((cd) this).field_w = (((cd) this).field_w + 12) % 38;
              if (param4 == 17512) {
                break L1;
              } else {
                ((cd) this).field_B = true;
                break L1;
              }
            }
            stackOut_2_0 = super.a(param0, param1, param2, param3, 17512, param5, param6);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var8;
            stackOut_4_1 = new StringBuilder().append("cd.I(");
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
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_3_0;
    }

    cd(f param0, int param1, int param2, int param3, int param4) {
        super(param0);
        try {
            ((cd) this).field_t = param1;
            ((cd) this).field_y = param4;
            ((cd) this).field_x = param3;
            ((cd) this).field_C = param2;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "cd.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
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
        RuntimeException var7 = null;
        sl stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        sl stackOut_2_0 = null;
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
              ck.field_db.a(64, param4 * 12, param1 * 12, 60, (byte) -111);
              if (!param2) {
                break L1;
              } else {
                f discarded$2 = ((cd) this).e(22, 29, (f[][]) null, 20);
                break L1;
              }
            }
            stackOut_2_0 = super.a(param0, param1, false, param3, param4, param5);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var7;
            stackOut_4_1 = new StringBuilder().append("cd.R(");
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
          throw dn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_3_0;
    }

    final void f(int param0, int param1, f[][] param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var8 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              ((cd) this).field_B = false;
              var5_int = ((cd) this).field_x;
              var6 = ((cd) this).field_y;
              ((cd) this).field_x = -((cd) this).field_t;
              ((cd) this).field_y = -((cd) this).field_C;
              ((cd) this).field_t = var5_int;
              ((cd) this).field_C = var6;
              if (param0 == 1) {
                break L1;
              } else {
                ((cd) this).field_x = -119;
                break L1;
              }
            }
            var7 = 0;
            L2: while (true) {
              if (5 <= var7) {
                break L0;
              } else {
                if (param2[((cd) this).field_C + param1][param3 + ((cd) this).field_t].a(16736352, param2, false, ((cd) this).field_C, param1, param3, (ea) this, ((cd) this).field_t)) {
                  ((cd) this).field_B = true;
                  sl discarded$1 = ((cd) this).a(param2, param1, false, ((cd) this).field_C, param3, ((cd) this).field_t);
                  return;
                } else {
                  fn.field_j = fn.field_j - ob.field_l;
                  wd.field_j = wd.field_j + 1;
                  ((cd) this).a((byte) 104, param2[((cd) this).field_C + param1][param3 - -((cd) this).field_t]);
                  var5_int = -((cd) this).field_x;
                  var6 = -((cd) this).field_y;
                  ((cd) this).field_x = ((cd) this).field_t;
                  ((cd) this).field_y = ((cd) this).field_C;
                  ((cd) this).field_t = var5_int;
                  ((cd) this).field_C = var6;
                  var7++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("cd.LA(").append(param0).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
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
          throw dn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param3 + 41);
        }
    }

    final f b(f[][] param0, int param1, byte param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        f stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        f stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              var5_int = 117 % ((-43 - param2) / 51);
              if ((((cd) this).field_o | ((cd) this).field_s) != 0) {
                ck.field_db.a(64, 12 * param3 + ((cd) this).field_m * ((cd) this).field_o, 12 * param1 + ((cd) this).field_s * ((cd) this).field_m, 60, (byte) -111);
                break L1;
              } else {
                break L1;
              }
            }
            stackOut_3_0 = super.b(param0, param1, (byte) -109, param3);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("cd.B(");
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
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_4_0;
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
