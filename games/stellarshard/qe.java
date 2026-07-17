/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.net.URL;
import java.lang.String;

final class qe {
    int field_j;
    static int field_e;
    int field_m;
    int field_i;
    int field_n;
    double field_l;
    private pb[] field_f;
    int field_h;
    static boolean field_o;
    double field_d;
    int field_c;
    private int field_b;
    double field_k;
    int field_g;
    double field_a;

    final static int a(String param0, boolean param1, boolean param2, String param3, int param4, String param5, int param6) {
        am var7 = null;
        RuntimeException var7_ref = null;
        am var8 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
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
        try {
          L0: {
            var7 = new am(param0);
            var8 = new am(param3);
            int discarded$2 = 0;
            stackOut_0_0 = gk.a(param4, param1, var7, param5, param6, var8);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var7_ref;
            stackOut_2_1 = new StringBuilder().append("qe.G(");
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
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44).append(param1).append(44).append(1).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
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
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param4).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param5 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param6 + 41);
        }
        return stackIn_1_0;
    }

    private final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
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
        var14 = (param0 << 4) - param13;
        var15 = param11;
        var16 = param1;
        var17 = param2;
        var18 = param8;
        L0: while (true) {
          L1: {
            if (var18 >= param9) {
              break L1;
            } else {
              if (var16 >= param5) {
                break L1;
              } else {
                L2: {
                  var19 = (var18 << 4) - param12;
                  var20 = (var16 << param4) / param6;
                  var21 = ni.field_f[var20] * param10 >> 15;
                  var22 = var18 + (var19 * var21 + 131072 >> 18);
                  if (var22 <= 639) {
                    break L2;
                  } else {
                    var22 = 639;
                    break L2;
                  }
                }
                L3: {
                  var23 = param0 + (var14 * var21 + 131072 >> 18);
                  if (var23 >= 0) {
                    break L3;
                  } else {
                    var23 = 0;
                    break L3;
                  }
                }
                L4: {
                  var24 = ti.field_a[var23 * 640 + var22];
                  var25 = 64 + (ni.field_c[var20] * param10 >> 17);
                  if (var25 >= 0) {
                    break L4;
                  } else {
                    var25 = -var25;
                    break L4;
                  }
                }
                var26 = (var24 & 16711935) * var25;
                var25 = (var24 & 65280) * var25;
                var24 = (var26 & 1069563840) + (var25 & 4177920);
                var26 = (var26 & -1073692672) + (var25 & 12582912);
                var26 = (var26 | var26 >>> 1) & 1077952512;
                int incrementValue$1 = var15;
                var15++;
                ti.field_a[incrementValue$1] = (var24 | var26 - (var26 >>> 8)) >>> 6;
                var16 = var16 + var17;
                var17 = var17 + param3;
                var18++;
                continue L0;
              }
            }
          }
          var15 = param11;
          var16 = param1;
          var17 = param2;
          var18 = param8 - 1;
          L5: while (true) {
            if (var18 < param7) {
              return;
            } else {
              var17 = var17 - param3;
              var16 = var16 - var17;
              if (var16 < param5) {
                L6: {
                  var19 = (var18 << 4) - param12;
                  var20 = (var16 << param4) / param6;
                  var21 = ni.field_f[var20] * param10 >> 15;
                  var22 = var18 + (var19 * var21 + 131072 >> 18);
                  if (var22 >= 0) {
                    break L6;
                  } else {
                    var22 = 0;
                    break L6;
                  }
                }
                L7: {
                  var23 = param0 + (var14 * var21 + 131072 >> 18);
                  if (var23 >= 0) {
                    break L7;
                  } else {
                    var23 = 0;
                    break L7;
                  }
                }
                L8: {
                  var24 = ti.field_a[var23 * 640 + var22];
                  var25 = 64 + (ni.field_c[var20] * param10 >> 17);
                  if (var25 >= 0) {
                    break L8;
                  } else {
                    var25 = -var25;
                    break L8;
                  }
                }
                var26 = (var24 & 16711935) * var25;
                var25 = (var24 & 65280) * var25;
                var24 = (var26 & 1069563840) + (var25 & 4177920);
                var26 = (var26 & -1073692672) + (var25 & 12582912);
                var26 = (var26 | var26 >>> 1) & 1077952512;
                var15--;
                ti.field_a[var15] = (var24 | var26 - (var26 >>> 8)) >>> 6;
                var18--;
                continue L5;
              } else {
                return;
              }
            }
          }
        }
    }

    final qe a(int param0) {
        double var2_double = 0.0;
        int var2 = 0;
        int var3_int = 0;
        vl var3 = null;
        double var4 = 0.0;
        int var4_int = 0;
        int var6 = 0;
        double var6_double = 0.0;
        double var7 = 0.0;
        double var8 = 0.0;
        vl var9 = null;
        int var10 = 0;
        qe var11 = null;
        vl var12 = null;
        vl var13 = null;
        vl var14 = null;
        vl var15 = null;
        vl var16 = null;
        L0: {
          var10 = stellarshard.field_B;
          this.b((byte) 124);
          if (((qe) this).field_m != 11) {
            break L0;
          } else {
            ((qe) this).field_k = ((qe) this).field_k * 0.99;
            ((qe) this).field_d = ((qe) this).field_d * 0.99;
            break L0;
          }
        }
        L1: {
          if (((qe) this).field_m != -1) {
            break L1;
          } else {
            L2: {
              ff.field_k = ff.field_k + 16;
              if (((qe) this).field_j <= 0) {
                break L2;
              } else {
                ((qe) this).field_j = ((qe) this).field_j - 1;
                break L2;
              }
            }
            L3: {
              if (ff.field_k > 256) {
                ff.field_k = 0;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (el.field_I > 0) {
                el.field_I = el.field_I - 1;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (0 <= ((qe) this).field_j) {
                break L5;
              } else {
                ((qe) this).field_j = ((qe) this).field_j + 1;
                break L5;
              }
            }
            L6: {
              if (((qe) this).field_j > 0) {
                ((qe) this).field_j = ((qe) this).field_j - 1;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (((qe) this).field_j < 0) {
                ((qe) this).field_j = ((qe) this).field_j + 1;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (((qe) this).field_j <= 0) {
                break L8;
              } else {
                ((qe) this).field_j = ((qe) this).field_j - 1;
                break L8;
              }
            }
            L9: {
              if (0 <= ((qe) this).field_j) {
                break L9;
              } else {
                ((qe) this).field_j = ((qe) this).field_j + 1;
                break L9;
              }
            }
            L10: {
              if (nc.field_H != 0) {
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (3 != nc.field_H) {
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if (0 < ((qe) this).field_i) {
                ((qe) this).field_i = ((qe) this).field_i - 1;
                break L12;
              } else {
                break L12;
              }
            }
            if (nc.field_H == 1) {
              break L1;
            } else {
              break L1;
            }
          }
        }
        L13: {
          if (12 != ((qe) this).field_m) {
            break L13;
          } else {
            if (a.field_h[0] != null) {
              L14: {
                ((qe) this).field_i = ((qe) this).field_i + 1;
                ((qe) this).field_j = 0;
                if (((qe) this).field_i > 50) {
                  L15: {
                    var2_double = a.field_h[0].field_a - ((qe) this).field_a;
                    var4 = a.field_h[0].field_l - ((qe) this).field_l;
                    var6 = (int)(Math.atan2(var4, -var2_double) * 128.0 / 3.141592653589793);
                    var6 = var6 - ((qe) this).field_h;
                    if (var6 < -128) {
                      var6 += 256;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if (var6 > 128) {
                      var6 -= 256;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  ((qe) this).field_h = ((qe) this).field_h + var6 / 10;
                  break L14;
                } else {
                  L17: {
                    if (((qe) this).field_h > 128) {
                      ((qe) this).field_h = ((qe) this).field_h - 256;
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  ((qe) this).field_h = ((qe) this).field_h * 9 / 10;
                  if (((qe) this).field_h >= 0) {
                    break L14;
                  } else {
                    ((qe) this).field_h = ((qe) this).field_h + 256;
                    break L14;
                  }
                }
              }
              if (((qe) this).field_i <= 100) {
                break L13;
              } else {
                if (null != a.field_h[0]) {
                  L18: {
                    L19: {
                      var2_double = ((qe) this).field_a - a.field_h[0].field_a;
                      var4 = -a.field_h[0].field_l + ((qe) this).field_l;
                      var6 = 128;
                      if (var2_double != 0.0) {
                        break L19;
                      } else {
                        if (var4 == 0.0) {
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                    var6 = (int)(2560.0 / Math.sqrt(var2_double * var2_double + var4 * var4));
                    break L18;
                  }
                  L20: {
                    if (var6 > 128) {
                      var6 = 128;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L21: {
                    if (!fe.field_e) {
                      break L21;
                    } else {
                      ll.field_c.a(sb.field_e[8], 100, var6 * pk.field_h / 78);
                      break L21;
                    }
                  }
                  ((qe) this).field_i = 0;
                  var4 = a.field_h[0].field_l - ((qe) this).field_l;
                  var2_double = a.field_h[0].field_a - ((qe) this).field_a;
                  var7 = Math.sqrt(var4 * var4 + var2_double * var2_double);
                  var9 = new vl(3, (qe) this);
                  var9.field_a = var4 * 4.0 / var7;
                  var9.field_j = var2_double * 4.0 / var7;
                  var9.field_c = ((qe) this).field_a + 8.0 * var9.field_j;
                  var9.field_k = ((qe) this).field_l + var9.field_a * 8.0;
                  wk.field_b[eg.a(-79)] = var9;
                  break L13;
                } else {
                  break L13;
                }
              }
            } else {
              break L13;
            }
          }
        }
        L22: {
          if (((qe) this).field_m != 7) {
            break L22;
          } else {
            if (a.field_h[0] != null) {
              L23: {
                ((qe) this).field_j = 5;
                ((qe) this).field_i = ((qe) this).field_i + 1;
                if (((qe) this).field_i <= 100) {
                  break L23;
                } else {
                  ((qe) this).field_i = ((qe) this).field_i - 100;
                  break L23;
                }
              }
              if (0 == ((qe) this).field_i % 10) {
                L24: {
                  L25: {
                    var2_double = -a.field_h[0].field_a + ((qe) this).field_a;
                    var4 = -a.field_h[0].field_l + ((qe) this).field_l;
                    var6 = 128;
                    if (var2_double != 0.0) {
                      break L25;
                    } else {
                      if (var4 == 0.0) {
                        break L24;
                      } else {
                        break L25;
                      }
                    }
                  }
                  var6 = (int)(2560.0 / Math.sqrt(var2_double * var2_double + var4 * var4));
                  break L24;
                }
                L26: {
                  if (var6 > 128) {
                    var6 = 128;
                    break L26;
                  } else {
                    break L26;
                  }
                }
                if (!fe.field_e) {
                  break L22;
                } else {
                  ll.field_c.a(sb.field_e[5], 100, var6 * pk.field_h / 78);
                  break L22;
                }
              } else {
                break L22;
              }
            } else {
              break L22;
            }
          }
        }
        L27: {
          if (((qe) this).field_m != 6) {
            break L27;
          } else {
            if (a.field_h[0] == null) {
              break L27;
            } else {
              L28: {
                ((qe) this).field_j = 5;
                ((qe) this).field_i = ((qe) this).field_i + 1;
                if (100 >= ((qe) this).field_i) {
                  break L28;
                } else {
                  ((qe) this).field_i = ((qe) this).field_i - 100;
                  break L28;
                }
              }
              if (((qe) this).field_i % 10 != 0) {
                break L27;
              } else {
                L29: {
                  L30: {
                    var2_double = ((qe) this).field_a - a.field_h[0].field_a;
                    var4 = -a.field_h[0].field_l + ((qe) this).field_l;
                    var6 = 128;
                    if (0.0 != var2_double) {
                      break L30;
                    } else {
                      if (0.0 == var4) {
                        break L29;
                      } else {
                        break L30;
                      }
                    }
                  }
                  var6 = (int)(2560.0 / Math.sqrt(var4 * var4 + var2_double * var2_double));
                  break L29;
                }
                L31: {
                  if (var6 > 128) {
                    var6 = 128;
                    break L31;
                  } else {
                    break L31;
                  }
                }
                if (!fe.field_e) {
                  break L27;
                } else {
                  ll.field_c.a(sb.field_e[6], 100, var6 * pk.field_h / 78);
                  break L27;
                }
              }
            }
          }
        }
        L32: {
          if (((qe) this).field_m != 14) {
            break L32;
          } else {
            if (null == a.field_h[0]) {
              break L32;
            } else {
              ((qe) this).field_k = ((qe) this).field_k * 0.99;
              ((qe) this).field_d = ((qe) this).field_d * 0.99;
              ((qe) this).field_j = ((qe) this).field_i / 50;
              var2 = 0;
              L33: while (true) {
                if (var2 >= 1000) {
                  var2 = 0;
                  L34: while (true) {
                    if (var2 >= 3000) {
                      L35: {
                        ((qe) this).field_i = ((qe) this).field_i + 1;
                        if (200.0 * Math.random() * 60.0 < (double)((qe) this).field_i) {
                          var13 = new vl(1, (qe) this);
                          var13.field_q = 16711680;
                          var13.field_c = ((qe) this).field_a + 64.0 * Math.random() - 32.0;
                          var13.field_k = ((qe) this).field_l + Math.random() * 64.0 - 32.0;
                          var13.field_a = (-var13.field_c + ((qe) this).field_a) / 100.0;
                          var13.field_j = (((qe) this).field_l - var13.field_k) / 100.0;
                          var3_int = eg.a(-88);
                          if (-1 == var3_int) {
                            break L35;
                          } else {
                            wk.field_b[var3_int] = var13;
                            break L35;
                          }
                        } else {
                          break L35;
                        }
                      }
                      L36: {
                        if (((qe) this).field_i >= 3000) {
                          break L36;
                        } else {
                          if (50 <= ((qe) this).field_g) {
                            break L36;
                          } else {
                            ((qe) this).field_i = ((qe) this).field_i + (250 + -(((qe) this).field_g * 5));
                            ((qe) this).field_g = 50;
                            break L36;
                          }
                        }
                      }
                      if (((qe) this).field_i > 12000) {
                        L37: {
                          if (!fe.field_e) {
                            break L37;
                          } else {
                            ll.field_c.a(sb.field_e[28], 100, 2 * pk.field_h);
                            break L37;
                          }
                        }
                        var3_int = 0;
                        L38: while (true) {
                          if (var3_int < 256) {
                            L39: {
                              var14 = new vl(3, (qe) this);
                              var14.field_j = var14.field_j - Math.sin(2.0 * (3.141592653589793 * (double)var3_int) / 256.0) * 4.0;
                              var14.field_a = var14.field_a - Math.cos(2.0 * (3.141592653589793 * (double)var3_int) / 256.0) * 4.0;
                              var14.field_c = 2.0 * var14.field_j + ((qe) this).field_a;
                              var14.field_k = 2.0 * var14.field_a + ((qe) this).field_l;
                              var4_int = eg.a(-101);
                              if (var4_int == -1) {
                                break L39;
                              } else {
                                wk.field_b[var4_int] = var14;
                                break L39;
                              }
                            }
                            var3_int++;
                            continue L38;
                          } else {
                            return null;
                          }
                        }
                      } else {
                        L40: {
                          if (((qe) this).field_i % 10 == 0) {
                            break L40;
                          } else {
                            if (((qe) this).field_i % 5 != 0) {
                              break L32;
                            } else {
                              if (7500 < ((qe) this).field_i) {
                                break L40;
                              } else {
                                break L32;
                              }
                            }
                          }
                        }
                        L41: {
                          L42: {
                            var2_double = -a.field_h[0].field_a + ((qe) this).field_a;
                            var4 = ((qe) this).field_l - a.field_h[0].field_l;
                            var6 = 128;
                            if (var2_double != 0.0) {
                              break L42;
                            } else {
                              if (var4 != 0.0) {
                                break L42;
                              } else {
                                break L41;
                              }
                            }
                          }
                          var6 = (int)(2560.0 / Math.sqrt(var2_double * var2_double + var4 * var4));
                          break L41;
                        }
                        L43: {
                          if (var6 > 128) {
                            var6 = 128;
                            break L43;
                          } else {
                            break L43;
                          }
                        }
                        if (fe.field_e) {
                          ll.field_c.a(sb.field_e[26], 100, pk.field_h * var6 / 78);
                          break L32;
                        } else {
                          break L32;
                        }
                      }
                    } else {
                      L44: {
                        if (null == wk.field_b[var2]) {
                          break L44;
                        } else {
                          L45: {
                            var12 = wk.field_b[var2];
                            var4 = -var12.field_c + ((qe) this).field_a;
                            if (480.0 < var4) {
                              var4 = var4 - 960.0;
                              break L45;
                            } else {
                              break L45;
                            }
                          }
                          L46: {
                            var6_double = -var12.field_k + ((qe) this).field_l;
                            if (-480.0 > var4) {
                              var4 = var4 + 960.0;
                              break L46;
                            } else {
                              break L46;
                            }
                          }
                          L47: {
                            if (var6_double <= 480.0) {
                              break L47;
                            } else {
                              var6_double = var6_double - 960.0;
                              break L47;
                            }
                          }
                          L48: {
                            if (-480.0 <= var6_double) {
                              break L48;
                            } else {
                              var6_double = var6_double + 960.0;
                              break L48;
                            }
                          }
                          L49: {
                            if (var4 != 0.0) {
                              break L49;
                            } else {
                              if (var6_double != 0.0) {
                                break L49;
                              } else {
                                break L44;
                              }
                            }
                          }
                          var8 = Math.sqrt(var6_double * var6_double + var4 * var4);
                          var12.field_j = var12.field_j + (double)((qe) this).field_i * var4 * 1.28 / (var8 * var8) / 1000.0;
                          var12.field_a = var12.field_a + var6_double * (double)((qe) this).field_i * 1.28 / (var8 * var8) / 1000.0;
                          break L44;
                        }
                      }
                      var2++;
                      continue L34;
                    }
                  }
                } else {
                  L50: {
                    if (null == a.field_h[var2]) {
                      break L50;
                    } else {
                      if (a.field_h[var2].field_m == 14) {
                        break L50;
                      } else {
                        L51: {
                          var11 = a.field_h[var2];
                          var4 = ((qe) this).field_a - var11.field_a;
                          if (480.0 >= var4) {
                            break L51;
                          } else {
                            var4 = var4 - 960.0;
                            break L51;
                          }
                        }
                        L52: {
                          var6_double = ((qe) this).field_l - var11.field_l;
                          if (-480.0 > var4) {
                            var4 = var4 + 960.0;
                            break L52;
                          } else {
                            break L52;
                          }
                        }
                        L53: {
                          if (var6_double <= 480.0) {
                            break L53;
                          } else {
                            var6_double = var6_double - 960.0;
                            break L53;
                          }
                        }
                        L54: {
                          if (var6_double < -480.0) {
                            var6_double = var6_double + 960.0;
                            break L54;
                          } else {
                            break L54;
                          }
                        }
                        L55: {
                          if (var4 != 0.0) {
                            break L55;
                          } else {
                            if (var6_double != 0.0) {
                              break L55;
                            } else {
                              break L50;
                            }
                          }
                        }
                        var8 = Math.sqrt(var6_double * var6_double + var4 * var4);
                        var11.field_k = var11.field_k + 1.28 * ((double)((qe) this).field_i * var6_double) / (var8 * var8) / 1000.0;
                        var11.field_d = var11.field_d + 1.28 * (var4 * (double)((qe) this).field_i) / (var8 * var8) / 1000.0;
                        break L50;
                      }
                    }
                  }
                  var2++;
                  continue L33;
                }
              }
            }
          }
        }
        L56: {
          if (((qe) this).field_m != 13) {
            break L56;
          } else {
            if (a.field_h[0] == null) {
              break L56;
            } else {
              L57: {
                ((qe) this).field_i = ((qe) this).field_i + 1;
                ((qe) this).field_j = 16;
                if (0 != ((qe) this).field_i % 10) {
                  break L57;
                } else {
                  L58: {
                    L59: {
                      var2_double = -a.field_h[0].field_a + ((qe) this).field_a;
                      var4 = ((qe) this).field_l - a.field_h[0].field_l;
                      var6 = 128;
                      if (0.0 != var2_double) {
                        break L59;
                      } else {
                        if (0.0 == var4) {
                          break L58;
                        } else {
                          break L59;
                        }
                      }
                    }
                    var6 = (int)(2560.0 / Math.sqrt(var4 * var4 + var2_double * var2_double));
                    break L58;
                  }
                  L60: {
                    if (128 < var6) {
                      var6 = 128;
                      break L60;
                    } else {
                      break L60;
                    }
                  }
                  if (!fe.field_e) {
                    break L57;
                  } else {
                    ll.field_c.a(sb.field_e[23], 100, pk.field_h * var6 / 78);
                    break L57;
                  }
                }
              }
              if (((qe) this).field_i <= 100) {
                break L56;
              } else {
                L61: {
                  var2_double = -((qe) this).field_a + a.field_h[0].field_a;
                  var4 = a.field_h[0].field_l - ((qe) this).field_l;
                  var6_double = Math.sqrt(var4 * var4 + var2_double * var2_double);
                  ((qe) this).field_k = ((qe) this).field_k + var4 * 0.1 / var6_double;
                  if (((qe) this).field_i <= 150) {
                    break L61;
                  } else {
                    ((qe) this).field_i = 0;
                    break L61;
                  }
                }
                ((qe) this).field_d = ((qe) this).field_d + var2_double * 0.1 / var6_double;
                break L56;
              }
            }
          }
        }
        L62: {
          if (15 == ((qe) this).field_m) {
            ((qe) this).field_i = ((qe) this).field_i + 1;
            if (((qe) this).field_i > 100) {
              L63: {
                ((qe) this).field_j = ((qe) this).field_j + 1;
                if (((qe) this).field_i % 10 != 0) {
                  break L63;
                } else {
                  if (null != a.field_h[0]) {
                    L64: {
                      L65: {
                        var2_double = ((qe) this).field_a - a.field_h[0].field_a;
                        var4 = ((qe) this).field_l - a.field_h[0].field_l;
                        var6 = 128;
                        if (0.0 != var2_double) {
                          break L65;
                        } else {
                          if (var4 == 0.0) {
                            break L64;
                          } else {
                            break L65;
                          }
                        }
                      }
                      var6 = (int)(2560.0 / Math.sqrt(var2_double * var2_double + var4 * var4));
                      break L64;
                    }
                    L66: {
                      if (var6 > 128) {
                        var6 = 128;
                        break L66;
                      } else {
                        break L66;
                      }
                    }
                    L67: {
                      if (fe.field_e) {
                        ll.field_c.a(sb.field_e[8], 100, pk.field_h * var6 / 78);
                        break L67;
                      } else {
                        break L67;
                      }
                    }
                    var15 = new vl(3, (qe) this);
                    var15.field_j = 4.0 * Math.cos(2.0 * (3.141592653589793 * (double)((qe) this).field_h) / 256.0);
                    var15.field_a = 4.0 * -Math.sin((double)((qe) this).field_h * 3.141592653589793 * 2.0 / 256.0);
                    var15.field_k = ((qe) this).field_l + var15.field_a * 4.0 - 4.0 * var15.field_j;
                    var15.field_c = var15.field_a * 4.0 + (var15.field_j * 4.0 + ((qe) this).field_a);
                    var15.field_j = var15.field_j + ((qe) this).field_d;
                    var15.field_a = var15.field_a + ((qe) this).field_k;
                    wk.field_b[eg.a(-88)] = var15;
                    break L63;
                  } else {
                    break L63;
                  }
                }
              }
              L68: {
                if (((qe) this).field_i % 10 != 5) {
                  break L68;
                } else {
                  if (a.field_h[0] == null) {
                    break L68;
                  } else {
                    L69: {
                      L70: {
                        var2_double = ((qe) this).field_a - a.field_h[0].field_a;
                        var4 = -a.field_h[0].field_l + ((qe) this).field_l;
                        var6 = 128;
                        if (var2_double != 0.0) {
                          break L70;
                        } else {
                          if (var4 != 0.0) {
                            break L70;
                          } else {
                            break L69;
                          }
                        }
                      }
                      var6 = (int)(2560.0 / Math.sqrt(var2_double * var2_double + var4 * var4));
                      break L69;
                    }
                    L71: {
                      if (var6 > 128) {
                        var6 = 128;
                        break L71;
                      } else {
                        break L71;
                      }
                    }
                    L72: {
                      if (!fe.field_e) {
                        break L72;
                      } else {
                        ll.field_c.a(sb.field_e[8], 100, var6 * pk.field_h / 78);
                        break L72;
                      }
                    }
                    var16 = new vl(3, (qe) this);
                    var16.field_j = 4.0 * Math.cos((double)(((qe) this).field_h + 128) * 3.141592653589793 * 2.0 / 256.0);
                    var16.field_a = 4.0 * -Math.sin(3.141592653589793 * (double)(((qe) this).field_h + 128) * 2.0 / 256.0);
                    var16.field_k = -(var16.field_j * 4.0) + (var16.field_a * 4.0 + ((qe) this).field_l);
                    var16.field_c = var16.field_a * 4.0 + (4.0 * var16.field_j + ((qe) this).field_a);
                    var16.field_a = var16.field_a + ((qe) this).field_k;
                    var16.field_j = var16.field_j + ((qe) this).field_d;
                    wk.field_b[eg.a(-56)] = var16;
                    break L68;
                  }
                }
              }
              if (200 < ((qe) this).field_i) {
                ((qe) this).field_i = 0;
                break L62;
              } else {
                break L62;
              }
            } else {
              L73: {
                if (0 < ((qe) this).field_j) {
                  ((qe) this).field_j = ((qe) this).field_j - 1;
                  break L73;
                } else {
                  break L73;
                }
              }
              if (((qe) this).field_j >= 0) {
                break L62;
              } else {
                ((qe) this).field_j = ((qe) this).field_j + 1;
                break L62;
              }
            }
          } else {
            break L62;
          }
        }
        L74: {
          if (param0 < -81) {
            break L74;
          } else {
            ((qe) this).field_g = 109;
            break L74;
          }
        }
        L75: {
          if (-1 != ((qe) this).field_m) {
            break L75;
          } else {
            if (nc.field_H == 3) {
              ((qe) this).field_g = 1;
              break L75;
            } else {
              break L75;
            }
          }
        }
        L76: {
          if (((qe) this).field_m != -1) {
            break L76;
          } else {
            if (nc.field_H == 4) {
              ((qe) this).field_g = 1;
              break L76;
            } else {
              break L76;
            }
          }
        }
        L77: {
          if (((qe) this).field_g > 0) {
            break L77;
          } else {
            L78: {
              if (((qe) this).field_m != -1) {
                break L78;
              } else {
                if (nc.field_H == 1) {
                  break L77;
                } else {
                  if (nc.field_H == 2) {
                    break L77;
                  } else {
                    if (nc.field_H == 3) {
                      break L77;
                    } else {
                      if (nc.field_H != 4) {
                        break L78;
                      } else {
                        break L77;
                      }
                    }
                  }
                }
              }
            }
            if (((qe) this).field_m == -1) {
              L79: {
                ((qe) this).field_k = ((qe) this).field_k - Math.cos(3.141592653589793 * (double)((qe) this).field_h * 2.0 / 256.0) * 0.1;
                ((qe) this).field_d = ((qe) this).field_d - Math.sin(2.0 * ((double)((qe) this).field_h * 3.141592653589793) / 256.0) * 0.1;
                if (!fe.field_e) {
                  break L79;
                } else {
                  if (og.field_a <= 0) {
                    ll.field_c.a(sb.field_e[35], 100, pk.field_h);
                    og.field_a = 7;
                    break L79;
                  } else {
                    break L79;
                  }
                }
              }
              var2 = 0;
              L80: while (true) {
                if (~var2 >= ~((qe) this).field_g) {
                  ((qe) this).field_g = ((qe) this).field_g - 1;
                  if (((qe) this).field_g >= -200) {
                    break L77;
                  } else {
                    if (o.field_j != 0) {
                      break L77;
                    } else {
                      this.c(-107);
                      return null;
                    }
                  }
                } else {
                  var3 = new vl(1, (qe) this);
                  var3.field_a = 0.0;
                  var3.field_q = 16711680;
                  var3.field_j = 0.0;
                  var4 = 6.28 * Math.random();
                  var3.field_c = ((qe) this).field_a + (double)(int)(16.0 * Math.random() * Math.sin(var4));
                  var3.field_k = ((qe) this).field_l + (double)(int)(16.0 * Math.random() * Math.cos(var4));
                  wk.field_b[eg.a(-90)] = var3;
                  var2 -= 10;
                  continue L80;
                }
              }
            } else {
              this.c(8);
              return null;
            }
          }
        }
        L81: {
          L82: {
            L83: {
              if (((qe) this).field_m == -1) {
                break L83;
              } else {
                if (((qe) this).field_m != 11) {
                  break L82;
                } else {
                  break L83;
                }
              }
            }
            if (2 == nc.field_H) {
              break L81;
            } else {
              if (nc.field_H != 4) {
                break L82;
              } else {
                break L81;
              }
            }
          }
          this.d(-22);
          break L81;
        }
        return (qe) this;
    }

    final static void a(int param0, String param1, Throwable param2) {
        try {
            Exception var3 = null;
            String var3_ref = null;
            re var4 = null;
            int var5 = 0;
            DataInputStream var6 = null;
            int var7 = 0;
            String var8 = null;
            ej stackIn_12_0 = null;
            int stackIn_12_1 = 0;
            java.net.URL stackIn_12_2 = null;
            java.net.URL stackIn_12_3 = null;
            java.net.URL stackIn_12_4 = null;
            StringBuilder stackIn_12_5 = null;
            ej stackIn_13_0 = null;
            int stackIn_13_1 = 0;
            java.net.URL stackIn_13_2 = null;
            java.net.URL stackIn_13_3 = null;
            java.net.URL stackIn_13_4 = null;
            StringBuilder stackIn_13_5 = null;
            ej stackIn_14_0 = null;
            int stackIn_14_1 = 0;
            java.net.URL stackIn_14_2 = null;
            java.net.URL stackIn_14_3 = null;
            java.net.URL stackIn_14_4 = null;
            StringBuilder stackIn_14_5 = null;
            String stackIn_14_6 = null;
            Throwable decompiledCaughtException = null;
            ej stackOut_11_0 = null;
            int stackOut_11_1 = 0;
            java.net.URL stackOut_11_2 = null;
            java.net.URL stackOut_11_3 = null;
            java.net.URL stackOut_11_4 = null;
            StringBuilder stackOut_11_5 = null;
            ej stackOut_13_0 = null;
            int stackOut_13_1 = 0;
            java.net.URL stackOut_13_2 = null;
            java.net.URL stackOut_13_3 = null;
            java.net.URL stackOut_13_4 = null;
            StringBuilder stackOut_13_5 = null;
            String stackOut_13_6 = null;
            ej stackOut_12_0 = null;
            int stackOut_12_1 = 0;
            java.net.URL stackOut_12_2 = null;
            java.net.URL stackOut_12_3 = null;
            java.net.URL stackOut_12_4 = null;
            StringBuilder stackOut_12_5 = null;
            String stackOut_12_6 = null;
            var7 = stellarshard.field_B;
            try {
              L0: {
                L1: {
                  var3_ref = "";
                  if (param2 != null) {
                    var3_ref = o.a(1, param2);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param1 == null) {
                    break L2;
                  } else {
                    L3: {
                      if (param2 == null) {
                        break L3;
                      } else {
                        var3_ref = var3_ref + " | ";
                        break L3;
                      }
                    }
                    var3_ref = var3_ref + param1;
                    break L2;
                  }
                }
                pf.a(17651, var3_ref);
                var3_ref = gg.a(var3_ref, "%3a", ":", 85);
                var3_ref = gg.a(var3_ref, "%40", "@", 85);
                var3_ref = gg.a(var3_ref, "%26", "&", 71);
                var8 = gg.a(var3_ref, "%23", "#", 63);
                if (tc.field_u == null) {
                  return;
                } else {
                  L4: {
                    stackOut_11_0 = fb.field_d;
                    stackOut_11_1 = 5284;
                    stackOut_11_2 = null;
                    stackOut_11_3 = null;
                    stackOut_11_4 = tc.field_u.getCodeBase();
                    stackOut_11_5 = new StringBuilder().append("clienterror.ws?c=").append(lg.field_d).append("&u=");
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    stackIn_13_2 = stackOut_11_2;
                    stackIn_13_3 = stackOut_11_3;
                    stackIn_13_4 = stackOut_11_4;
                    stackIn_13_5 = stackOut_11_5;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    stackIn_12_3 = stackOut_11_3;
                    stackIn_12_4 = stackOut_11_4;
                    stackIn_12_5 = stackOut_11_5;
                    if (kb.field_c != null) {
                      stackOut_13_0 = (ej) (Object) stackIn_13_0;
                      stackOut_13_1 = stackIn_13_1;
                      stackOut_13_2 = null;
                      stackOut_13_3 = null;
                      stackOut_13_4 = (java.net.URL) (Object) stackIn_13_4;
                      stackOut_13_5 = (StringBuilder) (Object) stackIn_13_5;
                      stackOut_13_6 = kb.field_c;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      stackIn_14_2 = stackOut_13_2;
                      stackIn_14_3 = stackOut_13_3;
                      stackIn_14_4 = stackOut_13_4;
                      stackIn_14_5 = stackOut_13_5;
                      stackIn_14_6 = stackOut_13_6;
                      break L4;
                    } else {
                      stackOut_12_0 = (ej) (Object) stackIn_12_0;
                      stackOut_12_1 = stackIn_12_1;
                      stackOut_12_2 = null;
                      stackOut_12_3 = null;
                      stackOut_12_4 = (java.net.URL) (Object) stackIn_12_4;
                      stackOut_12_5 = (StringBuilder) (Object) stackIn_12_5;
                      stackOut_12_6 = "" + al.field_b;
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_14_1 = stackOut_12_1;
                      stackIn_14_2 = stackOut_12_2;
                      stackIn_14_3 = stackOut_12_3;
                      stackIn_14_4 = stackOut_12_4;
                      stackIn_14_5 = stackOut_12_5;
                      stackIn_14_6 = stackOut_12_6;
                      break L4;
                    }
                  }
                  var4 = ((ej) (Object) stackIn_14_0).a(stackIn_14_1, new java.net.URL(stackIn_14_4, stackIn_14_6 + "&v1=" + ej.field_g + "&v2=" + ej.field_r + "&e=" + var8));
                  var5 = -92 / ((param0 - -65) / 38);
                  L5: while (true) {
                    if (var4.field_f != 0) {
                      L6: {
                        if (1 != var4.field_f) {
                          break L6;
                        } else {
                          var6 = (DataInputStream) var4.field_b;
                          int discarded$1 = var6.read();
                          var6.close();
                          break L6;
                        }
                      }
                      break L0;
                    } else {
                      jj.a((byte) -120, 1L);
                      continue L5;
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L7: {
                var3 = (Exception) (Object) decompiledCaughtException;
                break L7;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        fg.field_M = param0;
        mc.field_a = param3;
        l.field_e = param2;
        na.field_a = param4;
    }

    private final static void b(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
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
        var14 = (param0 << 4) - param13;
        var15 = param11;
        var16 = param1;
        var17 = param2;
        var18 = param8;
        L0: while (true) {
          L1: {
            if (var18 >= param9) {
              break L1;
            } else {
              if (var16 >= param5) {
                break L1;
              } else {
                L2: {
                  var19 = (var18 << 4) - param12;
                  var20 = (var16 << param4) / param6;
                  var21 = ni.field_f[var20] * param10 >> 15;
                  var22 = var18 + (var19 * var21 + 131072 >> 18);
                  if (var22 <= 639) {
                    break L2;
                  } else {
                    var22 = 639;
                    break L2;
                  }
                }
                L3: {
                  var23 = param0 + (var14 * var21 + 131072 >> 18);
                  if (var23 <= 479) {
                    break L3;
                  } else {
                    var23 = 479;
                    break L3;
                  }
                }
                var24 = ti.field_a[var23 * 640 + var22];
                var25 = 64 + (ni.field_c[var20] * param10 >> 17);
                if (var25 >= 0) {
                  var26 = (var24 & 16711935) * var25;
                  var25 = (var24 & 65280) * var25;
                  var24 = (var26 & 1069563840) + (var25 & 4177920);
                  var26 = (var26 & -1073692672) + (var25 & 12582912);
                  var26 = (var26 | var26 >>> 1) & 1077952512;
                  int incrementValue$1 = var15;
                  var15++;
                  ti.field_a[incrementValue$1] = (var24 | var26 - (var26 >>> 8)) >>> 6;
                  var16 = var16 + var17;
                  var17 = var17 + param3;
                  var18++;
                  continue L0;
                } else {
                  throw new Error();
                }
              }
            }
          }
          var15 = param11;
          var16 = param1;
          var17 = param2;
          var18 = param8 - 1;
          L4: while (true) {
            if (var18 < param7) {
              return;
            } else {
              var17 = var17 - param3;
              var16 = var16 - var17;
              if (var16 < param5) {
                L5: {
                  var19 = (var18 << 4) - param12;
                  var20 = (var16 << param4) / param6;
                  var21 = ni.field_f[var20] * param10 >> 15;
                  var22 = var18 + (var19 * var21 + 131072 >> 18);
                  if (var22 >= 0) {
                    break L5;
                  } else {
                    var22 = 0;
                    break L5;
                  }
                }
                L6: {
                  var23 = param0 + (var14 * var21 + 131072 >> 18);
                  if (var23 <= 479) {
                    break L6;
                  } else {
                    var23 = 479;
                    break L6;
                  }
                }
                L7: {
                  var24 = ti.field_a[var23 * 640 + var22];
                  var25 = 64 + (ni.field_c[var20] * param10 >> 17);
                  if (var25 >= 0) {
                    break L7;
                  } else {
                    var25 = -var25;
                    break L7;
                  }
                }
                var26 = (var24 & 16711935) * var25;
                var25 = (var24 & 65280) * var25;
                var24 = (var26 & 1069563840) + (var25 & 4177920);
                var26 = (var26 & -1073692672) + (var25 & 12582912);
                var26 = (var26 | var26 >>> 1) & 1077952512;
                var15--;
                ti.field_a[var15] = (var24 | var26 - (var26 >>> 8)) >>> 6;
                var18--;
                continue L4;
              } else {
                return;
              }
            }
          }
        }
    }

    final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        pb var4_ref_pb = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        bj var9_ref_bj = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        int[] var13 = null;
        int var14_int = 0;
        int[] var14 = null;
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
        pb var34 = null;
        pb var35 = null;
        pb var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        int[] var40 = null;
        int stackIn_66_0 = 0;
        int stackIn_69_0 = 0;
        ub stackIn_170_0 = null;
        String stackIn_170_1 = null;
        int stackIn_170_2 = 0;
        int stackIn_170_3 = 0;
        ub stackIn_171_0 = null;
        String stackIn_171_1 = null;
        int stackIn_171_2 = 0;
        int stackIn_171_3 = 0;
        ub stackIn_172_0 = null;
        String stackIn_172_1 = null;
        int stackIn_172_2 = 0;
        int stackIn_172_3 = 0;
        int stackIn_172_4 = 0;
        ub stackIn_178_0 = null;
        String stackIn_178_1 = null;
        int stackIn_178_2 = 0;
        int stackIn_178_3 = 0;
        ub stackIn_179_0 = null;
        String stackIn_179_1 = null;
        int stackIn_179_2 = 0;
        int stackIn_179_3 = 0;
        ub stackIn_180_0 = null;
        String stackIn_180_1 = null;
        int stackIn_180_2 = 0;
        int stackIn_180_3 = 0;
        int stackIn_180_4 = 0;
        ub stackIn_191_0 = null;
        String stackIn_191_1 = null;
        int stackIn_191_2 = 0;
        int stackIn_191_3 = 0;
        ub stackIn_192_0 = null;
        String stackIn_192_1 = null;
        int stackIn_192_2 = 0;
        int stackIn_192_3 = 0;
        ub stackIn_193_0 = null;
        String stackIn_193_1 = null;
        int stackIn_193_2 = 0;
        int stackIn_193_3 = 0;
        int stackIn_193_4 = 0;
        ub stackIn_200_0 = null;
        String stackIn_200_1 = null;
        int stackIn_200_2 = 0;
        int stackIn_200_3 = 0;
        ub stackIn_201_0 = null;
        String stackIn_201_1 = null;
        int stackIn_201_2 = 0;
        int stackIn_201_3 = 0;
        ub stackIn_202_0 = null;
        String stackIn_202_1 = null;
        int stackIn_202_2 = 0;
        int stackIn_202_3 = 0;
        int stackIn_202_4 = 0;
        ub stackIn_209_0 = null;
        String stackIn_209_1 = null;
        int stackIn_209_2 = 0;
        int stackIn_209_3 = 0;
        ub stackIn_210_0 = null;
        String stackIn_210_1 = null;
        int stackIn_210_2 = 0;
        int stackIn_210_3 = 0;
        ub stackIn_211_0 = null;
        String stackIn_211_1 = null;
        int stackIn_211_2 = 0;
        int stackIn_211_3 = 0;
        int stackIn_211_4 = 0;
        ub stackIn_217_0 = null;
        String stackIn_217_1 = null;
        int stackIn_217_2 = 0;
        int stackIn_217_3 = 0;
        ub stackIn_218_0 = null;
        String stackIn_218_1 = null;
        int stackIn_218_2 = 0;
        int stackIn_218_3 = 0;
        ub stackIn_219_0 = null;
        String stackIn_219_1 = null;
        int stackIn_219_2 = 0;
        int stackIn_219_3 = 0;
        int stackIn_219_4 = 0;
        ub stackIn_224_0 = null;
        String stackIn_224_1 = null;
        int stackIn_224_2 = 0;
        int stackIn_224_3 = 0;
        ub stackIn_225_0 = null;
        String stackIn_225_1 = null;
        int stackIn_225_2 = 0;
        int stackIn_225_3 = 0;
        ub stackIn_226_0 = null;
        String stackIn_226_1 = null;
        int stackIn_226_2 = 0;
        int stackIn_226_3 = 0;
        int stackIn_226_4 = 0;
        ub stackOut_169_0 = null;
        String stackOut_169_1 = null;
        int stackOut_169_2 = 0;
        int stackOut_169_3 = 0;
        ub stackOut_171_0 = null;
        String stackOut_171_1 = null;
        int stackOut_171_2 = 0;
        int stackOut_171_3 = 0;
        int stackOut_171_4 = 0;
        ub stackOut_170_0 = null;
        String stackOut_170_1 = null;
        int stackOut_170_2 = 0;
        int stackOut_170_3 = 0;
        int stackOut_170_4 = 0;
        ub stackOut_177_0 = null;
        String stackOut_177_1 = null;
        int stackOut_177_2 = 0;
        int stackOut_177_3 = 0;
        ub stackOut_179_0 = null;
        String stackOut_179_1 = null;
        int stackOut_179_2 = 0;
        int stackOut_179_3 = 0;
        int stackOut_179_4 = 0;
        ub stackOut_178_0 = null;
        String stackOut_178_1 = null;
        int stackOut_178_2 = 0;
        int stackOut_178_3 = 0;
        int stackOut_178_4 = 0;
        ub stackOut_190_0 = null;
        String stackOut_190_1 = null;
        int stackOut_190_2 = 0;
        int stackOut_190_3 = 0;
        ub stackOut_192_0 = null;
        String stackOut_192_1 = null;
        int stackOut_192_2 = 0;
        int stackOut_192_3 = 0;
        int stackOut_192_4 = 0;
        ub stackOut_191_0 = null;
        String stackOut_191_1 = null;
        int stackOut_191_2 = 0;
        int stackOut_191_3 = 0;
        int stackOut_191_4 = 0;
        ub stackOut_199_0 = null;
        String stackOut_199_1 = null;
        int stackOut_199_2 = 0;
        int stackOut_199_3 = 0;
        ub stackOut_201_0 = null;
        String stackOut_201_1 = null;
        int stackOut_201_2 = 0;
        int stackOut_201_3 = 0;
        int stackOut_201_4 = 0;
        ub stackOut_200_0 = null;
        String stackOut_200_1 = null;
        int stackOut_200_2 = 0;
        int stackOut_200_3 = 0;
        int stackOut_200_4 = 0;
        ub stackOut_208_0 = null;
        String stackOut_208_1 = null;
        int stackOut_208_2 = 0;
        int stackOut_208_3 = 0;
        ub stackOut_210_0 = null;
        String stackOut_210_1 = null;
        int stackOut_210_2 = 0;
        int stackOut_210_3 = 0;
        int stackOut_210_4 = 0;
        ub stackOut_209_0 = null;
        String stackOut_209_1 = null;
        int stackOut_209_2 = 0;
        int stackOut_209_3 = 0;
        int stackOut_209_4 = 0;
        ub stackOut_216_0 = null;
        String stackOut_216_1 = null;
        int stackOut_216_2 = 0;
        int stackOut_216_3 = 0;
        ub stackOut_218_0 = null;
        String stackOut_218_1 = null;
        int stackOut_218_2 = 0;
        int stackOut_218_3 = 0;
        int stackOut_218_4 = 0;
        ub stackOut_217_0 = null;
        String stackOut_217_1 = null;
        int stackOut_217_2 = 0;
        int stackOut_217_3 = 0;
        int stackOut_217_4 = 0;
        ub stackOut_223_0 = null;
        String stackOut_223_1 = null;
        int stackOut_223_2 = 0;
        int stackOut_223_3 = 0;
        ub stackOut_225_0 = null;
        String stackOut_225_1 = null;
        int stackOut_225_2 = 0;
        int stackOut_225_3 = 0;
        int stackOut_225_4 = 0;
        ub stackOut_224_0 = null;
        String stackOut_224_1 = null;
        int stackOut_224_2 = 0;
        int stackOut_224_3 = 0;
        int stackOut_224_4 = 0;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_67_0 = 0;
        L0: {
          var33 = stellarshard.field_B;
          var2 = (int)(((qe) this).field_a + 320.0 - 48.0);
          var3 = (int)(((qe) this).field_l + 240.0 - 48.0);
          if (((qe) this).field_m != -1) {
            L1: {
              if (((qe) this).field_m != 14) {
                break L1;
              } else {
                L2: {
                  var4 = var2 - -48 << 4;
                  var5 = var3 - -48 << 4;
                  var6 = 2048;
                  var7 = ((qe) this).field_i;
                  if (1000 <= var7) {
                    break L2;
                  } else {
                    var7 = 1000;
                    break L2;
                  }
                }
                L3: {
                  var8 = var6 * var6;
                  var9 = var4 - var6 >> 4;
                  var10 = 15 + var4 >> 4;
                  var11 = var4 + (var6 + 15) >> 4;
                  var12 = -var6 + var5 >> 4;
                  var13_int = 15 + var5 >> 4;
                  var14_int = 15 + var5 - -var6 >> 4;
                  if (640 >= var11) {
                    break L3;
                  } else {
                    var11 = 640;
                    break L3;
                  }
                }
                L4: {
                  if (var9 >= 0) {
                    break L4;
                  } else {
                    var9 = 0;
                    break L4;
                  }
                }
                L5: {
                  if (var12 < 0) {
                    var12 = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (var14_int > 480) {
                    var14_int = 480;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (var10 < 0) {
                    var10 = 0;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (var13_int < 0) {
                    var13_int = 0;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (var10 <= 640) {
                    break L9;
                  } else {
                    var10 = 640;
                    break L9;
                  }
                }
                L10: {
                  if (var13_int > 480) {
                    var13_int = 480;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                var15 = -var4 + (var10 << 4);
                var15 = var15 * var15;
                var16 = -var4 + (var10 + 1 << 4);
                var16 = var16 * var16;
                var17 = (var10 + 2 << 4) + -var4;
                var17 = var17 * var17;
                var18 = -var15 + var16;
                var19 = var17 - var16;
                var20 = var19 + -var18;
                var21 = -var5 + (var13_int << 4);
                var21 = var21 * var21;
                var22 = -var5 + (1 + var13_int << 4);
                var22 = var22 * var22;
                var23 = (2 + var13_int << 4) - var5;
                var23 = var23 * var23;
                var24 = var22 - var21;
                var25 = var23 + -var22;
                var26 = var25 + -var24;
                var27 = 16;
                var28 = var8;
                L11: while (true) {
                  if (var8 <= 2147483647 >>> var27) {
                    var29 = var10 + 640 * var13_int;
                    var30 = var15 - -var21;
                    var31 = var24;
                    var32 = var13_int;
                    L12: while (true) {
                      if (~var14_int >= ~var32) {
                        var31 = var24;
                        var29 = var10 + 640 * var13_int;
                        var30 = var21 + var15;
                        var32 = var13_int - 1;
                        L13: while (true) {
                          if (~var12 < ~var32) {
                            break L1;
                          } else {
                            var31 = var31 - var26;
                            var30 = var30 - var31;
                            var29 -= 640;
                            qe.a(var32, var30, var18, var20, var27, var8, var28, var9, var10, var11, var7, var29, var4, var5);
                            var32--;
                            continue L13;
                          }
                        }
                      } else {
                        qe.b(var32, var30, var18, var20, var27, var8, var28, var9, var10, var11, var7, var29, var4, var5);
                        var30 = var30 + var31;
                        var31 = var31 + var26;
                        var29 += 640;
                        var32++;
                        continue L12;
                      }
                    }
                  } else {
                    var27--;
                    var28 = 1 + var28 >>> 1;
                    continue L11;
                  }
                }
              }
            }
            L14: {
              L15: {
                if (4 == ((qe) this).field_m) {
                  break L15;
                } else {
                  if (10 == ((qe) this).field_m) {
                    break L15;
                  } else {
                    if (((qe) this).field_m == 5) {
                      break L15;
                    } else {
                      if (((qe) this).a((byte) -51)) {
                        L16: {
                          var4 = 48 + var2 << 4;
                          var5 = 48 + var3 << 4;
                          var6 = 512;
                          var7 = 10000;
                          var8 = var6 * var6;
                          var9 = -var6 + var4 >> 4;
                          var10 = 15 + var4 >> 4;
                          var11 = 15 + (var6 + var4) >> 4;
                          var12 = -var6 + var5 >> 4;
                          var13_int = var5 - -15 >> 4;
                          if (var12 < 0) {
                            var12 = 0;
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                        L17: {
                          var14_int = 15 + var6 + var5 >> 4;
                          if (0 > var9) {
                            var9 = 0;
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        L18: {
                          if (var11 > 640) {
                            var11 = 640;
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                        L19: {
                          if (var10 >= 0) {
                            break L19;
                          } else {
                            var10 = 0;
                            break L19;
                          }
                        }
                        L20: {
                          if (var14_int > 480) {
                            var14_int = 480;
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                        L21: {
                          if (0 <= var13_int) {
                            break L21;
                          } else {
                            var13_int = 0;
                            break L21;
                          }
                        }
                        L22: {
                          if (var10 <= 640) {
                            break L22;
                          } else {
                            var10 = 640;
                            break L22;
                          }
                        }
                        L23: {
                          if (var13_int <= 480) {
                            break L23;
                          } else {
                            var13_int = 480;
                            break L23;
                          }
                        }
                        var15 = (var10 << 4) + -var4;
                        var15 = var15 * var15;
                        var16 = -var4 + (1 + var10 << 4);
                        var16 = var16 * var16;
                        var17 = -var4 + (2 + var10 << 4);
                        var17 = var17 * var17;
                        var18 = var16 - var15;
                        var19 = var17 + -var16;
                        var20 = var19 - var18;
                        var21 = -var5 + (var13_int << 4);
                        var21 = var21 * var21;
                        var22 = -var5 + (1 + var13_int << 4);
                        var22 = var22 * var22;
                        var23 = -var5 + (var13_int + 2 << 4);
                        var23 = var23 * var23;
                        var24 = var22 + -var21;
                        var25 = -var22 + var23;
                        var26 = -var24 + var25;
                        var27 = 16;
                        var28 = var8;
                        L24: while (true) {
                          if (~var8 >= ~(2147483647 >>> var27)) {
                            var29 = var10 + 640 * var13_int;
                            var30 = var15 - -var21;
                            var31 = var24;
                            var32 = var13_int;
                            L25: while (true) {
                              if (~var32 <= ~var14_int) {
                                var29 = var10 + var13_int * 640;
                                var30 = var21 + var15;
                                var31 = var24;
                                var32 = var13_int + -1;
                                L26: while (true) {
                                  if (var12 > var32) {
                                    break L14;
                                  } else {
                                    var31 = var31 - var26;
                                    var30 = var30 - var31;
                                    var29 -= 640;
                                    qe.a(var32, var30, var18, var20, var27, var8, var28, var9, var10, var11, var7, var29, var4, var5);
                                    var32--;
                                    continue L26;
                                  }
                                }
                              } else {
                                qe.b(var32, var30, var18, var20, var27, var8, var28, var9, var10, var11, var7, var29, var4, var5);
                                var30 = var30 + var31;
                                var29 += 640;
                                var31 = var31 + var26;
                                var32++;
                                continue L25;
                              }
                            }
                          } else {
                            var28 = var28 + 1 >>> 1;
                            var27--;
                            continue L24;
                          }
                        }
                      } else {
                        ((qe) this).b(640).e(var2, var3);
                        break L14;
                      }
                    }
                  }
                }
              }
              L27: {
                var4_ref_pb = ((qe) this).b(640);
                var5 = var2;
                var5 = var5 + var4_ref_pb.field_t;
                var6 = var3;
                var6 = var6 + var4_ref_pb.field_s;
                var7 = var5 + ti.field_i * var6;
                var8 = 0;
                var9 = var4_ref_pb.field_y;
                var10 = var4_ref_pb.field_v;
                var11 = ti.field_i - var10;
                var12 = 0;
                if (var6 >= ti.field_f) {
                  break L27;
                } else {
                  var13_int = -var6 + ti.field_f;
                  var9 = var9 - var13_int;
                  var7 = var7 + ti.field_i * var13_int;
                  var8 = var8 + var13_int * var10;
                  var6 = ti.field_f;
                  break L27;
                }
              }
              L28: {
                if (~ti.field_l <= ~(var9 + var6)) {
                  break L28;
                } else {
                  var9 = var9 - (-ti.field_l + var6 + var9);
                  break L28;
                }
              }
              L29: {
                if (var5 < ti.field_e) {
                  var13_int = -var5 + ti.field_e;
                  var7 = var7 + var13_int;
                  var12 = var12 + var13_int;
                  var8 = var8 + var13_int;
                  var11 = var11 + var13_int;
                  var10 = var10 - var13_int;
                  var5 = ti.field_e;
                  break L29;
                } else {
                  break L29;
                }
              }
              L30: {
                if (~ti.field_c <= ~(var10 + var5)) {
                  break L30;
                } else {
                  var13_int = var10 + (var5 + -ti.field_c);
                  var12 = var12 + var13_int;
                  var11 = var11 + var13_int;
                  var10 = var10 - var13_int;
                  break L30;
                }
              }
              if (var10 <= 0) {
                break L14;
              } else {
                if (0 >= var9) {
                  break L14;
                } else {
                  var40 = ti.field_a;
                  var39 = var40;
                  var38 = var39;
                  var37 = var38;
                  var13 = var37;
                  var14 = var4_ref_pb.field_z;
                  var17 = -(var10 >> 2);
                  var10 = -(3 & var10);
                  var21 = -var9;
                  L31: while (true) {
                    if (var21 >= 0) {
                      break L14;
                    } else {
                      var22 = var17 * 4 + var10;
                      L32: while (true) {
                        if (0 <= var22) {
                          var8 = var8 + var12;
                          var7 = var7 + var11;
                          var21++;
                          continue L31;
                        } else {
                          L33: {
                            int incrementValue$1 = var8;
                            var8++;
                            var16 = var14[incrementValue$1];
                            var15 = var16 & 255;
                            if (var15 == 0) {
                              break L33;
                            } else {
                              var18 = (var40[var7] & 16711680) >> 16;
                              var19 = (var40[var7] & 65280) >> 8;
                              var20 = 255 & var40[var7];
                              var20 = (256 + -var15) * var20 + var15 * 255 >> 9;
                              var18 = (-var15 + 256) * var18 >> 9;
                              var19 = var19 * (256 + -var15) - -(var15 * 255) >> 9;
                              var13[var7] = var20 + ((var19 << 8) + (var18 << 16)) - -sa.a(var16 >> 1, 8355711);
                              break L33;
                            }
                          }
                          var7++;
                          var22++;
                          continue L32;
                        }
                      }
                    }
                  }
                }
              }
            }
            L34: {
              if (((qe) this).field_m != 11) {
                break L34;
              } else {
                if (16 == ((qe) this).field_c) {
                  break L34;
                } else {
                  if (qi.field_a != 1) {
                    break L34;
                  } else {
                    if (null != na.field_j) {
                      break L34;
                    } else {
                      L35: {
                        ti.b(24 + var2 + -(ki.field_s / 2), -(ki.field_s / 2) + var3 - -24, ki.field_s + 48, 48 - -ki.field_s, 65535);
                        stackOut_169_0 = qj.field_a;
                        stackOut_169_1 = cd.field_P;
                        stackOut_169_2 = 48 + var2;
                        stackOut_169_3 = 24 + var3;
                        stackIn_171_0 = stackOut_169_0;
                        stackIn_171_1 = stackOut_169_1;
                        stackIn_171_2 = stackOut_169_2;
                        stackIn_171_3 = stackOut_169_3;
                        stackIn_170_0 = stackOut_169_0;
                        stackIn_170_1 = stackOut_169_1;
                        stackIn_170_2 = stackOut_169_2;
                        stackIn_170_3 = stackOut_169_3;
                        if (ki.field_s >= 5) {
                          stackOut_171_0 = (ub) (Object) stackIn_171_0;
                          stackOut_171_1 = (String) (Object) stackIn_171_1;
                          stackOut_171_2 = stackIn_171_2;
                          stackOut_171_3 = stackIn_171_3;
                          stackOut_171_4 = 65535;
                          stackIn_172_0 = stackOut_171_0;
                          stackIn_172_1 = stackOut_171_1;
                          stackIn_172_2 = stackOut_171_2;
                          stackIn_172_3 = stackOut_171_3;
                          stackIn_172_4 = stackOut_171_4;
                          break L35;
                        } else {
                          stackOut_170_0 = (ub) (Object) stackIn_170_0;
                          stackOut_170_1 = (String) (Object) stackIn_170_1;
                          stackOut_170_2 = stackIn_170_2;
                          stackOut_170_3 = stackIn_170_3;
                          stackOut_170_4 = 16777215;
                          stackIn_172_0 = stackOut_170_0;
                          stackIn_172_1 = stackOut_170_1;
                          stackIn_172_2 = stackOut_170_2;
                          stackIn_172_3 = stackOut_170_3;
                          stackIn_172_4 = stackOut_170_4;
                          break L35;
                        }
                      }
                      ((ub) (Object) stackIn_172_0).c(stackIn_172_1, stackIn_172_2, stackIn_172_3, stackIn_172_4, 0);
                      break L34;
                    }
                  }
                }
              }
            }
            L36: {
              if (((qe) this).field_m == 13) {
                if (4 != qi.field_a) {
                  break L36;
                } else {
                  if (na.field_j != null) {
                    break L36;
                  } else {
                    L37: {
                      ti.b(24 + (var2 + -(ki.field_s / 2)), -(ki.field_s / 2) + 24 + var3, 48 - -ki.field_s, ki.field_s + 48, 16711680);
                      stackOut_177_0 = qj.field_a;
                      stackOut_177_1 = ci.field_d;
                      stackOut_177_2 = 48 + var2;
                      stackOut_177_3 = 24 + var3;
                      stackIn_179_0 = stackOut_177_0;
                      stackIn_179_1 = stackOut_177_1;
                      stackIn_179_2 = stackOut_177_2;
                      stackIn_179_3 = stackOut_177_3;
                      stackIn_178_0 = stackOut_177_0;
                      stackIn_178_1 = stackOut_177_1;
                      stackIn_178_2 = stackOut_177_2;
                      stackIn_178_3 = stackOut_177_3;
                      if (ki.field_s >= 5) {
                        stackOut_179_0 = (ub) (Object) stackIn_179_0;
                        stackOut_179_1 = (String) (Object) stackIn_179_1;
                        stackOut_179_2 = stackIn_179_2;
                        stackOut_179_3 = stackIn_179_3;
                        stackOut_179_4 = 16711680;
                        stackIn_180_0 = stackOut_179_0;
                        stackIn_180_1 = stackOut_179_1;
                        stackIn_180_2 = stackOut_179_2;
                        stackIn_180_3 = stackOut_179_3;
                        stackIn_180_4 = stackOut_179_4;
                        break L37;
                      } else {
                        stackOut_178_0 = (ub) (Object) stackIn_178_0;
                        stackOut_178_1 = (String) (Object) stackIn_178_1;
                        stackOut_178_2 = stackIn_178_2;
                        stackOut_178_3 = stackIn_178_3;
                        stackOut_178_4 = 16777215;
                        stackIn_180_0 = stackOut_178_0;
                        stackIn_180_1 = stackOut_178_1;
                        stackIn_180_2 = stackOut_178_2;
                        stackIn_180_3 = stackOut_178_3;
                        stackIn_180_4 = stackOut_178_4;
                        break L37;
                      }
                    }
                    ((ub) (Object) stackIn_180_0).c(stackIn_180_1, stackIn_180_2, stackIn_180_3, stackIn_180_4, 0);
                    break L36;
                  }
                }
              } else {
                break L36;
              }
            }
            L38: {
              if (((qe) this).field_m != 12) {
                break L38;
              } else {
                if (null == na.field_j) {
                  L39: {
                    if (50 < ((qe) this).field_i) {
                      var4 = -(int)(8.0 * (Math.cos(3.141592653589793 * (double)((qe) this).field_h / 128.0) * (double)(-50 + ((qe) this).field_i)) / 25.0);
                      var5 = (int)(8.0 * (Math.sin(3.141592653589793 * (double)((qe) this).field_h / 128.0) * (double)(-50 + ((qe) this).field_i)) / 25.0);
                      ti.a(var4 + 48 + var2 << 4, var5 + var3 + 48 << 4, (((qe) this).field_i - 50) / 10 + 5 << 4, 255, ml.field_c);
                      break L39;
                    } else {
                      break L39;
                    }
                  }
                  if (qi.field_a != 5) {
                    break L38;
                  } else {
                    if (null == na.field_j) {
                      L40: {
                        ti.b(var2 - (-24 + ki.field_s / 2), -(ki.field_s / 2) + (24 + var3), 48 - -ki.field_s, 48 + ki.field_s, 16711680);
                        stackOut_190_0 = qj.field_a;
                        stackOut_190_1 = mc.field_b;
                        stackOut_190_2 = var2 + 48;
                        stackOut_190_3 = var3 + 24;
                        stackIn_192_0 = stackOut_190_0;
                        stackIn_192_1 = stackOut_190_1;
                        stackIn_192_2 = stackOut_190_2;
                        stackIn_192_3 = stackOut_190_3;
                        stackIn_191_0 = stackOut_190_0;
                        stackIn_191_1 = stackOut_190_1;
                        stackIn_191_2 = stackOut_190_2;
                        stackIn_191_3 = stackOut_190_3;
                        if (5 > ki.field_s) {
                          stackOut_192_0 = (ub) (Object) stackIn_192_0;
                          stackOut_192_1 = (String) (Object) stackIn_192_1;
                          stackOut_192_2 = stackIn_192_2;
                          stackOut_192_3 = stackIn_192_3;
                          stackOut_192_4 = 16777215;
                          stackIn_193_0 = stackOut_192_0;
                          stackIn_193_1 = stackOut_192_1;
                          stackIn_193_2 = stackOut_192_2;
                          stackIn_193_3 = stackOut_192_3;
                          stackIn_193_4 = stackOut_192_4;
                          break L40;
                        } else {
                          stackOut_191_0 = (ub) (Object) stackIn_191_0;
                          stackOut_191_1 = (String) (Object) stackIn_191_1;
                          stackOut_191_2 = stackIn_191_2;
                          stackOut_191_3 = stackIn_191_3;
                          stackOut_191_4 = 16711680;
                          stackIn_193_0 = stackOut_191_0;
                          stackIn_193_1 = stackOut_191_1;
                          stackIn_193_2 = stackOut_191_2;
                          stackIn_193_3 = stackOut_191_3;
                          stackIn_193_4 = stackOut_191_4;
                          break L40;
                        }
                      }
                      ((ub) (Object) stackIn_193_0).c(stackIn_193_1, stackIn_193_2, stackIn_193_3, stackIn_193_4, 0);
                      break L38;
                    } else {
                      break L38;
                    }
                  }
                } else {
                  break L38;
                }
              }
            }
            L41: {
              if (((qe) this).field_m == 15) {
                if (7 != qi.field_a) {
                  break L41;
                } else {
                  if (null == na.field_j) {
                    L42: {
                      ti.b(var2 + 24 - ki.field_s / 2, -(ki.field_s / 2) + var3 - -24, 48 + ki.field_s, 48 + ki.field_s, 16711680);
                      stackOut_199_0 = qj.field_a;
                      stackOut_199_1 = he.field_k;
                      stackOut_199_2 = 48 + var2;
                      stackOut_199_3 = var3 - -24;
                      stackIn_201_0 = stackOut_199_0;
                      stackIn_201_1 = stackOut_199_1;
                      stackIn_201_2 = stackOut_199_2;
                      stackIn_201_3 = stackOut_199_3;
                      stackIn_200_0 = stackOut_199_0;
                      stackIn_200_1 = stackOut_199_1;
                      stackIn_200_2 = stackOut_199_2;
                      stackIn_200_3 = stackOut_199_3;
                      if (ki.field_s < 5) {
                        stackOut_201_0 = (ub) (Object) stackIn_201_0;
                        stackOut_201_1 = (String) (Object) stackIn_201_1;
                        stackOut_201_2 = stackIn_201_2;
                        stackOut_201_3 = stackIn_201_3;
                        stackOut_201_4 = 16777215;
                        stackIn_202_0 = stackOut_201_0;
                        stackIn_202_1 = stackOut_201_1;
                        stackIn_202_2 = stackOut_201_2;
                        stackIn_202_3 = stackOut_201_3;
                        stackIn_202_4 = stackOut_201_4;
                        break L42;
                      } else {
                        stackOut_200_0 = (ub) (Object) stackIn_200_0;
                        stackOut_200_1 = (String) (Object) stackIn_200_1;
                        stackOut_200_2 = stackIn_200_2;
                        stackOut_200_3 = stackIn_200_3;
                        stackOut_200_4 = 16711680;
                        stackIn_202_0 = stackOut_200_0;
                        stackIn_202_1 = stackOut_200_1;
                        stackIn_202_2 = stackOut_200_2;
                        stackIn_202_3 = stackOut_200_3;
                        stackIn_202_4 = stackOut_200_4;
                        break L42;
                      }
                    }
                    ((ub) (Object) stackIn_202_0).c(stackIn_202_1, stackIn_202_2, stackIn_202_3, stackIn_202_4, 0);
                    break L41;
                  } else {
                    break L41;
                  }
                }
              } else {
                break L41;
              }
            }
            L43: {
              if (((qe) this).field_m == 7) {
                if (qi.field_a != 8) {
                  break L43;
                } else {
                  if (null == na.field_j) {
                    L44: {
                      ti.b(-(ki.field_s / 2) + var2, var3 + -(ki.field_s / 2), 96 + ki.field_s, 96 + ki.field_s, 16711680);
                      stackOut_208_0 = qj.field_a;
                      stackOut_208_1 = hc.field_h;
                      stackOut_208_2 = var2 - -48;
                      stackOut_208_3 = var3;
                      stackIn_210_0 = stackOut_208_0;
                      stackIn_210_1 = stackOut_208_1;
                      stackIn_210_2 = stackOut_208_2;
                      stackIn_210_3 = stackOut_208_3;
                      stackIn_209_0 = stackOut_208_0;
                      stackIn_209_1 = stackOut_208_1;
                      stackIn_209_2 = stackOut_208_2;
                      stackIn_209_3 = stackOut_208_3;
                      if (5 <= ki.field_s) {
                        stackOut_210_0 = (ub) (Object) stackIn_210_0;
                        stackOut_210_1 = (String) (Object) stackIn_210_1;
                        stackOut_210_2 = stackIn_210_2;
                        stackOut_210_3 = stackIn_210_3;
                        stackOut_210_4 = 16711680;
                        stackIn_211_0 = stackOut_210_0;
                        stackIn_211_1 = stackOut_210_1;
                        stackIn_211_2 = stackOut_210_2;
                        stackIn_211_3 = stackOut_210_3;
                        stackIn_211_4 = stackOut_210_4;
                        break L44;
                      } else {
                        stackOut_209_0 = (ub) (Object) stackIn_209_0;
                        stackOut_209_1 = (String) (Object) stackIn_209_1;
                        stackOut_209_2 = stackIn_209_2;
                        stackOut_209_3 = stackIn_209_3;
                        stackOut_209_4 = 16777215;
                        stackIn_211_0 = stackOut_209_0;
                        stackIn_211_1 = stackOut_209_1;
                        stackIn_211_2 = stackOut_209_2;
                        stackIn_211_3 = stackOut_209_3;
                        stackIn_211_4 = stackOut_209_4;
                        break L44;
                      }
                    }
                    ((ub) (Object) stackIn_211_0).c(stackIn_211_1, stackIn_211_2, stackIn_211_3, stackIn_211_4, 0);
                    break L43;
                  } else {
                    break L43;
                  }
                }
              } else {
                break L43;
              }
            }
            L45: {
              if (((qe) this).field_m == 6) {
                if (qi.field_a != 9) {
                  break L45;
                } else {
                  if (na.field_j != null) {
                    break L45;
                  } else {
                    L46: {
                      ti.b(-(ki.field_s / 2) + var2, var3 + -(ki.field_s / 2), 96 - -ki.field_s, 96 - -ki.field_s, 16711680);
                      stackOut_216_0 = qj.field_a;
                      stackOut_216_1 = hc.field_h;
                      stackOut_216_2 = var2 + 48;
                      stackOut_216_3 = var3;
                      stackIn_218_0 = stackOut_216_0;
                      stackIn_218_1 = stackOut_216_1;
                      stackIn_218_2 = stackOut_216_2;
                      stackIn_218_3 = stackOut_216_3;
                      stackIn_217_0 = stackOut_216_0;
                      stackIn_217_1 = stackOut_216_1;
                      stackIn_217_2 = stackOut_216_2;
                      stackIn_217_3 = stackOut_216_3;
                      if (ki.field_s < 5) {
                        stackOut_218_0 = (ub) (Object) stackIn_218_0;
                        stackOut_218_1 = (String) (Object) stackIn_218_1;
                        stackOut_218_2 = stackIn_218_2;
                        stackOut_218_3 = stackIn_218_3;
                        stackOut_218_4 = 16777215;
                        stackIn_219_0 = stackOut_218_0;
                        stackIn_219_1 = stackOut_218_1;
                        stackIn_219_2 = stackOut_218_2;
                        stackIn_219_3 = stackOut_218_3;
                        stackIn_219_4 = stackOut_218_4;
                        break L46;
                      } else {
                        stackOut_217_0 = (ub) (Object) stackIn_217_0;
                        stackOut_217_1 = (String) (Object) stackIn_217_1;
                        stackOut_217_2 = stackIn_217_2;
                        stackOut_217_3 = stackIn_217_3;
                        stackOut_217_4 = 16711680;
                        stackIn_219_0 = stackOut_217_0;
                        stackIn_219_1 = stackOut_217_1;
                        stackIn_219_2 = stackOut_217_2;
                        stackIn_219_3 = stackOut_217_3;
                        stackIn_219_4 = stackOut_217_4;
                        break L46;
                      }
                    }
                    ((ub) (Object) stackIn_219_0).c(stackIn_219_1, stackIn_219_2, stackIn_219_3, stackIn_219_4, 0);
                    break L45;
                  }
                }
              } else {
                break L45;
              }
            }
            if (((qe) this).field_m != 14) {
              break L0;
            } else {
              if (qi.field_a != 10) {
                break L0;
              } else {
                if (null != na.field_j) {
                  break L0;
                } else {
                  L47: {
                    ti.b(-(ki.field_s / 2) + var2, var3 + -(ki.field_s / 2), ki.field_s + 96, 96 + ki.field_s, 16711680);
                    stackOut_223_0 = qj.field_a;
                    stackOut_223_1 = jf.field_l;
                    stackOut_223_2 = 48 + var2;
                    stackOut_223_3 = var3;
                    stackIn_225_0 = stackOut_223_0;
                    stackIn_225_1 = stackOut_223_1;
                    stackIn_225_2 = stackOut_223_2;
                    stackIn_225_3 = stackOut_223_3;
                    stackIn_224_0 = stackOut_223_0;
                    stackIn_224_1 = stackOut_223_1;
                    stackIn_224_2 = stackOut_223_2;
                    stackIn_224_3 = stackOut_223_3;
                    if (ki.field_s < 5) {
                      stackOut_225_0 = (ub) (Object) stackIn_225_0;
                      stackOut_225_1 = (String) (Object) stackIn_225_1;
                      stackOut_225_2 = stackIn_225_2;
                      stackOut_225_3 = stackIn_225_3;
                      stackOut_225_4 = 16777215;
                      stackIn_226_0 = stackOut_225_0;
                      stackIn_226_1 = stackOut_225_1;
                      stackIn_226_2 = stackOut_225_2;
                      stackIn_226_3 = stackOut_225_3;
                      stackIn_226_4 = stackOut_225_4;
                      break L47;
                    } else {
                      stackOut_224_0 = (ub) (Object) stackIn_224_0;
                      stackOut_224_1 = (String) (Object) stackIn_224_1;
                      stackOut_224_2 = stackIn_224_2;
                      stackOut_224_3 = stackIn_224_3;
                      stackOut_224_4 = 16711680;
                      stackIn_226_0 = stackOut_224_0;
                      stackIn_226_1 = stackOut_224_1;
                      stackIn_226_2 = stackOut_224_2;
                      stackIn_226_3 = stackOut_224_3;
                      stackIn_226_4 = stackOut_224_4;
                      break L47;
                    }
                  }
                  ((ub) (Object) stackIn_226_0).c(stackIn_226_1, stackIn_226_2, stackIn_226_3, stackIn_226_4, 0);
                  break L0;
                }
              }
            }
          } else {
            L48: {
              if (aj.field_c == null) {
                aj.field_c = new pa[7];
                vl.field_r = new bj[7];
                var4 = 0;
                L49: while (true) {
                  if (var4 >= 7) {
                    break L48;
                  } else {
                    aj.field_c[var4] = new pa(rh.field_b, false, false, false, false);
                    aj.field_c[var4].a(new int[12]);
                    aj.field_c[var4].a(new int[12]);
                    var5 = (int)(65536.0 * Math.cos(3.141592653589793 * (double)(16 * (-3 + var4)) / 256.0));
                    var6 = (int)(Math.sin(3.141592653589793 * (double)((-3 + var4) * 16) / 256.0) * 65536.0);
                    aj.field_c[var4].a(new int[12]);
                    var7 = 50;
                    var8 = 50;
                    var9 = -50;
                    vl.field_r[var4] = aj.field_c[var4].a(32, 346, var7, var8, var9);
                    aj.field_c[var4] = null;
                    var4++;
                    continue L49;
                  }
                }
              } else {
                break L48;
              }
            }
            L50: {
              var4 = 0;
              var5 = 0;
              var6 = ((qe) this).field_h << 3 & 2045;
              var7 = 0;
              var8 = 3;
              if (((qe) this).field_j >= -5) {
                break L50;
              } else {
                var8 = 2;
                break L50;
              }
            }
            L51: {
              if (((qe) this).field_j < -20) {
                var8 = 1;
                break L51;
              } else {
                break L51;
              }
            }
            L52: {
              if (-50 > ((qe) this).field_j) {
                var8 = 0;
                break L52;
              } else {
                break L52;
              }
            }
            L53: {
              if (5 < ((qe) this).field_j) {
                var8 = 4;
                break L53;
              } else {
                break L53;
              }
            }
            L54: {
              if (((qe) this).field_j <= 20) {
                break L54;
              } else {
                var8 = 5;
                break L54;
              }
            }
            L55: {
              if (((qe) this).field_j <= 50) {
                break L55;
              } else {
                var8 = 6;
                break L55;
              }
            }
            L56: {
              var9_ref_bj = vl.field_r[var8];
              ((qe) this).b(640).e();
              ti.f(0, 0, 96, 96, 0);
              cc.a();
              var9_ref_bj.a(var4, var5, var6, var7, 0, 0, 3000, -1L);
              pd.field_h.a((byte) -107);
              if (0 == nc.field_H) {
                L57: {
                  if (el.field_I <= 0) {
                    break L57;
                  } else {
                    if ((15 & el.field_I) >= 7) {
                      ((qe) this).b(640).b(var2, var3, 16777215);
                      break L56;
                    } else {
                      break L57;
                    }
                  }
                }
                ((qe) this).b(640).e(var2, var3);
                break L56;
              } else {
                if (nc.field_H == 1) {
                  L58: {
                    var10 = 16777215;
                    if (5 < gh.field_b) {
                      gh.field_b = 5;
                      break L58;
                    } else {
                      break L58;
                    }
                  }
                  L59: {
                    if (gh.field_b == 4) {
                      var10 = 8454143;
                      break L59;
                    } else {
                      break L59;
                    }
                  }
                  L60: {
                    if (gh.field_b != 3) {
                      break L60;
                    } else {
                      var10 = 8421631;
                      break L60;
                    }
                  }
                  L61: {
                    if (gh.field_b == 2) {
                      var10 = 16744703;
                      break L61;
                    } else {
                      break L61;
                    }
                  }
                  L62: {
                    if (gh.field_b == 1) {
                      var10 = 16744576;
                      break L62;
                    } else {
                      break L62;
                    }
                  }
                  L63: {
                    nd.a(128, var3 + 48, var10, 48 + var2, (byte) -54, 32);
                    if (el.field_I <= 0) {
                      break L63;
                    } else {
                      if (7 > (el.field_I & 15)) {
                        break L63;
                      } else {
                        ((qe) this).b(640).b(var2, var3, 16777215);
                        break L56;
                      }
                    }
                  }
                  ((qe) this).b(640).e(var2, var3);
                  break L56;
                } else {
                  if (nc.field_H != 2) {
                    break L56;
                  } else {
                    L64: {
                      if (gh.field_b > 50) {
                        break L64;
                      } else {
                        if (gh.field_b % 10 >= 5) {
                          ((qe) this).b(640).e(var2, var3);
                          break L56;
                        } else {
                          break L64;
                        }
                      }
                    }
                    var35 = ((qe) this).b(640);
                    var35.e();
                    var11 = -(3 & gh.field_b);
                    L65: while (true) {
                      if (var11 >= var35.field_x) {
                        pd.field_h.a((byte) -107);
                        if ((gh.field_b & 48) <= 0) {
                          var35.e(var2, var3);
                          break L56;
                        } else {
                          var35.d(-(int)(Math.random() * 5.0) + var2, -(int)(5.0 * Math.random()) + var3, var35.field_w + (int)(Math.random() * 10.0), var35.field_x - -(int)(10.0 * Math.random()));
                          break L56;
                        }
                      } else {
                        ti.g(0, var11, var35.field_w, 0);
                        var11 += 3;
                        continue L65;
                      }
                    }
                  }
                }
              }
            }
            L66: {
              if (nc.field_H != 3) {
                break L66;
              } else {
                L67: {
                  L68: {
                    nd.a(128, var3 + 48, 16777215, 48 + var2, (byte) -79, 32);
                    if (gh.field_b > 50) {
                      break L68;
                    } else {
                      if (5 > gh.field_b % 10) {
                        break L68;
                      } else {
                        break L67;
                      }
                    }
                  }
                  var34 = ((qe) this).b(640);
                  var36 = var34;
                  var11 = var2;
                  var11 = var11 + var36.field_t;
                  var12 = var3;
                  var12 = var12 + var36.field_s;
                  var13_int = 0;
                  L69: while (true) {
                    if (~var13_int <= ~var36.field_y) {
                      break L67;
                    } else {
                      L70: {
                        var14_int = var11;
                        var15 = var13_int * var36.field_v;
                        var16 = 640 * (var13_int + var12) + var14_int;
                        if (var14_int >= 0) {
                          stackOut_65_0 = 0;
                          stackIn_66_0 = stackOut_65_0;
                          break L70;
                        } else {
                          stackOut_64_0 = -var14_int;
                          stackIn_66_0 = stackOut_64_0;
                          break L70;
                        }
                      }
                      L71: {
                        var17 = stackIn_66_0;
                        if (var36.field_v + var14_int > 640) {
                          stackOut_68_0 = -var14_int + 640;
                          stackIn_69_0 = stackOut_68_0;
                          break L71;
                        } else {
                          stackOut_67_0 = var36.field_v;
                          stackIn_69_0 = stackOut_67_0;
                          break L71;
                        }
                      }
                      var18 = stackIn_69_0;
                      var19 = var17;
                      L72: while (true) {
                        if (var19 >= var18) {
                          var13_int++;
                          continue L69;
                        } else {
                          L73: {
                            if (var34.field_z[var19 + var15] == 0) {
                              break L73;
                            } else {
                              ti.field_a[var19 + var16 + -1] = 16777215;
                              ti.field_a[1 + var19 + var16] = 16777215;
                              ti.field_a[-640 + (var19 + var16)] = 16777215;
                              ti.field_a[640 + (var19 + var16)] = 16777215;
                              ti.field_a[var19 + var16 - 641] = 16777215;
                              ti.field_a[var19 + (var16 + 639)] = 16777215;
                              ti.field_a[var16 - -var19 - 639] = 16777215;
                              ti.field_a[var16 - (-var19 - 641)] = 16777215;
                              break L73;
                            }
                          }
                          var19++;
                          continue L72;
                        }
                      }
                    }
                  }
                }
                ((qe) this).b(640).e(var2, var3, 128);
                break L66;
              }
            }
            if (4 == nc.field_H) {
              ((qe) this).b(640).e(var2, var3);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L74: {
          if (ph.field_D < 2) {
            break L74;
          } else {
            if (((qe) this).field_m == -1) {
              break L74;
            } else {
              if (((qe) this).a((byte) -59)) {
                break L74;
              } else {
                qj.field_a.c("" + ((qe) this).field_g, var2 - -30, 34 + var3, 16711680, -1);
                break L74;
              }
            }
          }
        }
        if (param0 > 96) {
          L75: {
            if (ph.field_D < 2) {
              break L75;
            } else {
              if (((qe) this).field_m == 14) {
                qj.field_a.c("" + ((qe) this).field_i, var2 - -30, 50 + var3, 255, -1);
                break L75;
              } else {
                break L75;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = stellarshard.field_B;
          var2 = 1 - -(64 * (int)(((qe) this).field_a + 256.0 + 320.0) / 496);
          var3 = 352 + (int)(((qe) this).field_l + 256.0 + 240.0) * 64 / 496;
          if (-1 == ((qe) this).field_m) {
            ti.e(var2, var3, 4, 16777215);
            int discarded$14 = 0;
            ti.b(var2, var3, 4);
            break L0;
          } else {
            if (((qe) this).field_m == 0) {
              ti.c(var2, var3, 4, 65280, 64);
              int discarded$15 = 0;
              ti.b(var2, var3, 4);
              break L0;
            } else {
              if (((qe) this).field_m != 1) {
                if (2 != ((qe) this).field_m) {
                  if (3 == ((qe) this).field_m) {
                    ti.c(var2, var3, 5, 65280, 64);
                    int discarded$16 = 0;
                    ti.b(var2, var3, 5);
                    break L0;
                  } else {
                    if (4 != ((qe) this).field_m) {
                      if (((qe) this).field_m != 5) {
                        L1: {
                          if (6 == ((qe) this).field_m) {
                            break L1;
                          } else {
                            if (((qe) this).field_m == 14) {
                              break L1;
                            } else {
                              if (((qe) this).field_m == 7) {
                                break L1;
                              } else {
                                if (8 != ((qe) this).field_m) {
                                  if (((qe) this).field_m != 9) {
                                    if (((qe) this).field_m != 10) {
                                      L2: {
                                        if (((qe) this).field_m != 11) {
                                          break L2;
                                        } else {
                                          if (16 == ((qe) this).field_c) {
                                            break L2;
                                          } else {
                                            ti.c(var2, var3, 3, 16777215, 192);
                                            int discarded$17 = 0;
                                            ti.b(var2, var3, 3);
                                            break L0;
                                          }
                                        }
                                      }
                                      L3: {
                                        if (((qe) this).field_m == 12) {
                                          break L3;
                                        } else {
                                          if (((qe) this).field_m == 13) {
                                            break L3;
                                          } else {
                                            if (((qe) this).field_m != 15) {
                                              break L0;
                                            } else {
                                              break L3;
                                            }
                                          }
                                        }
                                      }
                                      ti.c(var2, var3, 4, 16711680, 192);
                                      int discarded$18 = 0;
                                      ti.b(var2, var3, 4);
                                      break L0;
                                    } else {
                                      ti.c(var2, var3, 2, 65280, 64);
                                      int discarded$19 = 0;
                                      ti.b(var2, var3, 2);
                                      break L0;
                                    }
                                  } else {
                                    ti.c(var2, var3, 3, 65280, 64);
                                    int discarded$20 = 0;
                                    ti.b(var2, var3, 3);
                                    break L0;
                                  }
                                } else {
                                  ti.c(var2, var3, 3, 65280, 64);
                                  int discarded$21 = 0;
                                  ti.b(var2, var3, 3);
                                  break L0;
                                }
                              }
                            }
                          }
                        }
                        ti.c(var2, var3, 5, 16711680, 192);
                        int discarded$22 = 0;
                        ti.b(var2, var3, 5);
                        break L0;
                      } else {
                        ti.c(var2, var3, 5, 65280, 64);
                        int discarded$23 = 0;
                        ti.b(var2, var3, 5);
                        break L0;
                      }
                    } else {
                      ti.c(var2, var3, 4, 65280, 64);
                      int discarded$24 = 0;
                      ti.b(var2, var3, 4);
                      break L0;
                    }
                  }
                } else {
                  ti.c(var2, var3, 4, 65280, 64);
                  int discarded$25 = 0;
                  ti.b(var2, var3, 4);
                  break L0;
                }
              } else {
                ti.c(var2, var3, 5, 65280, 64);
                int discarded$26 = 0;
                ti.b(var2, var3, 5);
                break L0;
              }
            }
          }
        }
        L4: {
          if (!param0) {
            break L4;
          } else {
            boolean discarded$27 = ((qe) this).a((byte) -62);
            break L4;
          }
        }
    }

    final boolean a(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 <= -36) {
          L0: {
            L1: {
              if (((qe) this).field_m != 11) {
                break L1;
              } else {
                if (((qe) this).field_c != 16) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    private final void d(int param0) {
        int var2 = 0;
        qe var3 = null;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        double var26 = 0.0;
        double var28 = 0.0;
        int var30 = 0;
        var30 = stellarshard.field_B;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 1000) {
            L1: {
              if (param0 <= -18) {
                break L1;
              } else {
                int discarded$3 = ((qe) this).c((byte) 74);
                break L1;
              }
            }
            return;
          } else {
            L2: {
              if (a.field_h[var2] == null) {
                break L2;
              } else {
                L3: {
                  if (!a.field_h[var2].a((byte) -109)) {
                    break L3;
                  } else {
                    if (((qe) this).field_m != 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (!((qe) this).a((byte) -48)) {
                    break L4;
                  } else {
                    if (0 != a.field_h[var2].field_m) {
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
                if (!gj.a(a.field_h[var2], 0, false, (qe) this)) {
                  break L2;
                } else {
                  L5: {
                    if (a.field_h[var2].field_m != -1) {
                      break L5;
                    } else {
                      if (a.field_h[var2].field_g <= 0) {
                        break L2;
                      } else {
                        if (nc.field_H == 2) {
                          break L2;
                        } else {
                          if (4 != nc.field_H) {
                            break L5;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  L6: {
                    var3 = a.field_h[var2];
                    var4 = -var3.field_a + ((qe) this).field_a;
                    var6 = -var3.field_l + ((qe) this).field_l;
                    if (var4 != 0.0) {
                      break L6;
                    } else {
                      if (0.0 == var6) {
                        break L2;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var8 = Math.sqrt(var4 * var4 + var6 * var6);
                  var10 = var4 / var8;
                  var12 = var6 / var8;
                  var14 = -(var10 * ((qe) this).field_k) + var12 * ((qe) this).field_d;
                  var16 = -(var3.field_k * var10) + var12 * var3.field_d;
                  var18 = var12 * ((qe) this).field_k + var10 * ((qe) this).field_d;
                  var20 = var3.field_k * var12 + var3.field_d * var10;
                  if (var20 <= var18) {
                    break L2;
                  } else {
                    L7: {
                      if (((qe) this).a((byte) -113)) {
                        break L7;
                      } else {
                        if (a.field_h[var2].a((byte) -41)) {
                          break L7;
                        } else {
                          L8: {
                            this.a(100, ((qe) this).field_m);
                            this.a(100, a.field_h[var2].field_m);
                            var22 = (double)var3.field_n * var20 + (double)((qe) this).field_n * var18;
                            var24 = var18 + -var20;
                            var26 = 0.0;
                            var26 = (-(var24 * (double)var3.field_n) + var22) / (double)(((qe) this).field_n + var3.field_n);
                            var28 = 0.0;
                            var28 = var26 + var24;
                            if (0.0 != var12) {
                              break L8;
                            } else {
                              var12 = 0.00001;
                              break L8;
                            }
                          }
                          L9: {
                            if (0.0 == var10) {
                              var10 = 0.00001;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          L10: {
                            ((qe) this).field_k = (-var14 + var26 / var10 * var12) / (var12 * var12 / var10 + var10);
                            ((qe) this).field_d = (-(var12 * ((qe) this).field_k) + var26) / var10;
                            var3.field_k = (var28 / var10 * var12 - var16) / (var12 * var12 / var10 + var10);
                            var3.field_d = (-(var3.field_k * var12) + var28) / var10;
                            if (var3.field_m != 11) {
                              L11: {
                                if (((qe) this).field_m == -1) {
                                  break L11;
                                } else {
                                  if (var3.field_m != 14) {
                                    break L10;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              L12: {
                                if (14 == var3.field_m) {
                                  var3.field_i = var3.field_i + 50;
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                              L13: {
                                if (0 != ((qe) this).field_m) {
                                  break L13;
                                } else {
                                  if (0 >= el.field_I) {
                                    break L13;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              ((qe) this).field_g = ((qe) this).field_g - 1;
                              if (0 == ((qe) this).field_m) {
                                el.field_I = 50;
                                break L10;
                              } else {
                                break L10;
                              }
                            } else {
                              break L10;
                            }
                          }
                          if (-12 == ((qe) this).field_m) {
                            break L7;
                          } else {
                            L14: {
                              if (var3.field_m == -1) {
                                break L14;
                              } else {
                                if (-15 != ((qe) this).field_m) {
                                  break L7;
                                } else {
                                  break L14;
                                }
                              }
                            }
                            L15: {
                              if (((qe) this).field_m != 14) {
                                break L15;
                              } else {
                                ((qe) this).field_i = ((qe) this).field_i + 50;
                                break L15;
                              }
                            }
                            L16: {
                              if (var3.field_m != -1) {
                                break L16;
                              } else {
                                if (0 >= el.field_I) {
                                  break L16;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            var3.field_g = var3.field_g - 1;
                            if (var3.field_m == -1) {
                              el.field_I = 50;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                    }
                    L17: {
                      if (11 != ((qe) this).field_m) {
                        break L17;
                      } else {
                        if (-1 != var3.field_m) {
                          break L17;
                        } else {
                          if (-1 >= var3.field_g) {
                            int discarded$4 = 0;
                            o.a((qe) this);
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                      }
                    }
                    L18: {
                      if (-1 != ((qe) this).field_m) {
                        break L18;
                      } else {
                        if (-12 != var3.field_m) {
                          break L18;
                        } else {
                          if (0 <= ((qe) this).field_g) {
                            int discarded$5 = 0;
                            o.a(var3);
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                      }
                    }
                    if (((qe) this).a((byte) -85)) {
                      break L2;
                    } else {
                      if (!a.field_h[var2].a((byte) -105)) {
                        L19: {
                          if (0.0 >= var14) {
                            break L19;
                          } else {
                            ((qe) this).field_j = ((qe) this).field_j - 1;
                            break L19;
                          }
                        }
                        L20: {
                          if (0.0 <= var14) {
                            break L20;
                          } else {
                            ((qe) this).field_j = ((qe) this).field_j + 1;
                            break L20;
                          }
                        }
                        L21: {
                          if (0.0 < var16) {
                            var3.field_j = var3.field_j - 1;
                            break L21;
                          } else {
                            break L21;
                          }
                        }
                        if (0.0 <= var16) {
                          break L2;
                        } else {
                          var3.field_j = var3.field_j + 1;
                          break L2;
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
            }
            var2++;
            continue L0;
          }
        }
    }

    final pb b(int param0) {
        int var2 = 0;
        if (((qe) this).field_m == 11) {
            var2 = ((qe) this).field_c;
            if (var2 >= e.field_g.length) {
                var2 = -1 + e.field_g.length;
            }
            return e.field_g[var2];
        }
        if (((qe) this).field_h < 0) {
            ((qe) this).field_h = ((qe) this).field_h + 256;
        }
        if (!(256 > ((qe) this).field_h)) {
            ((qe) this).field_h = ((qe) this).field_h - 256;
        }
        if (!(((qe) this).field_m != -1)) {
            return ((qe) this).field_f[((qe) this).field_h / 4];
        }
        if (((qe) this).c((byte) 84) == -33) {
            return ((qe) this).field_f[((qe) this).field_h / 8];
        }
        if (!(-49 != ((qe) this).c((byte) 65))) {
            return ((qe) this).field_f[((qe) this).field_h / 2];
        }
        if (param0 != 640) {
            return null;
        }
        return ((qe) this).field_f[0];
    }

    private final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = stellarshard.field_B;
        ((qe) this).field_l = ((qe) this).field_l + ((qe) this).field_k;
        ((qe) this).field_a = ((qe) this).field_a + ((qe) this).field_d;
        ((qe) this).field_b = ((qe) this).field_b + ((qe) this).field_j;
        L0: while (true) {
          L1: {
            if (((qe) this).field_b > 20) {
              break L1;
            } else {
              if (-20 <= ((qe) this).field_b) {
                L2: {
                  var2 = 64;
                  if (((qe) this).field_m != 14) {
                    break L2;
                  } else {
                    var2 = 128;
                    break L2;
                  }
                }
                L3: {
                  var2 = 256;
                  if (((qe) this).field_a >= (double)(-var2 + -320)) {
                    break L3;
                  } else {
                    ((qe) this).field_a = ((qe) this).field_a + (double)(640 - -(2 * var2));
                    break L3;
                  }
                }
                if (param0 == 124) {
                  L4: {
                    if (((qe) this).field_a > (double)(var2 + 320)) {
                      ((qe) this).field_a = ((qe) this).field_a - (double)(640 + 2 * var2);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if ((double)(-var2 + -240) <= ((qe) this).field_l) {
                      break L5;
                    } else {
                      ((qe) this).field_l = ((qe) this).field_l + (double)(480 - -(2 * var2));
                      break L5;
                    }
                  }
                  L6: {
                    if ((double)(240 + var2) < ((qe) this).field_l) {
                      ((qe) this).field_l = ((qe) this).field_l - (double)(2 * var2 + 480);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  return;
                } else {
                  return;
                }
              } else {
                break L1;
              }
            }
          }
          L7: {
            if (((qe) this).field_b <= 20) {
              break L7;
            } else {
              ((qe) this).field_h = ((qe) this).field_h + 1;
              ((qe) this).field_b = ((qe) this).field_b - 20;
              if (256 <= ((qe) this).field_h) {
                ((qe) this).field_h = ((qe) this).field_h - 256;
                break L7;
              } else {
                break L7;
              }
            }
          }
          if (-20 <= ((qe) this).field_b) {
            continue L0;
          } else {
            ((qe) this).field_b = ((qe) this).field_b + 20;
            ((qe) this).field_h = ((qe) this).field_h - 1;
            if (((qe) this).field_h >= 0) {
              continue L0;
            } else {
              ((qe) this).field_h = ((qe) this).field_h + 256;
              continue L0;
            }
          }
        }
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        vl var7_ref_vl = null;
        sd var7_ref_sd = null;
        double var7 = 0.0;
        int var7_int = 0;
        qe var8_ref_qe = null;
        int var8 = 0;
        double var9 = 0.0;
        int var9_int = 0;
        int var10_int = 0;
        qe var10 = null;
        int var11 = 0;
        qe var12 = null;
        int var13 = 0;
        vl var14 = null;
        sd var15 = null;
        L0: {
          var13 = stellarshard.field_B;
          var2 = 0;
          var3 = 0;
          var4 = 0;
          var5 = 16777215;
          if (1 == ((qe) this).field_m) {
            L1: {
              var5 = 8947848;
              if (!fe.field_e) {
                break L1;
              } else {
                ll.field_c.a(sb.field_e[9], 100, pk.field_h * 2);
                break L1;
              }
            }
            var4 = 80;
            stellarshard.field_U[0] = stellarshard.field_U[0] + 1;
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          if (((qe) this).field_m != 3) {
            break L2;
          } else {
            L3: {
              if (fe.field_e) {
                ll.field_c.a(sb.field_e[16], 100, 2 * pk.field_h);
                break L3;
              } else {
                break L3;
              }
            }
            var5 = 16777215;
            var4 = 100;
            stellarshard.field_U[1] = stellarshard.field_U[1] + 1;
            break L2;
          }
        }
        L4: {
          if (((qe) this).field_m != 5) {
            break L4;
          } else {
            L5: {
              if (fe.field_e) {
                ll.field_c.a(sb.field_e[13], 100, pk.field_h * 2);
                break L5;
              } else {
                break L5;
              }
            }
            var4 = 150;
            var5 = 8947967;
            stellarshard.field_U[3] = stellarshard.field_U[3] + 1;
            break L4;
          }
        }
        L6: {
          if (0 != ((qe) this).field_m) {
            break L6;
          } else {
            L7: {
              if (!fe.field_e) {
                break L7;
              } else {
                ll.field_c.a(sb.field_e[10], 100, pk.field_h * 2);
                break L7;
              }
            }
            var5 = 8947848;
            var4 = 50;
            break L6;
          }
        }
        L8: {
          if (((qe) this).field_m == 2) {
            L9: {
              var4 = 50;
              if (fe.field_e) {
                ll.field_c.a(sb.field_e[17], 100, 2 * pk.field_h);
                break L9;
              } else {
                break L9;
              }
            }
            var5 = 16777215;
            break L8;
          } else {
            break L8;
          }
        }
        L10: {
          if (((qe) this).field_m == 4) {
            L11: {
              if (fe.field_e) {
                ll.field_c.a(sb.field_e[14], 100, 2 * pk.field_h);
                break L11;
              } else {
                break L11;
              }
            }
            var5 = 8947967;
            var4 = 50;
            break L10;
          } else {
            break L10;
          }
        }
        L12: {
          if (((qe) this).field_m == 8) {
            L13: {
              if (!fe.field_e) {
                break L13;
              } else {
                ll.field_c.a(sb.field_e[11], 100, pk.field_h * 2);
                break L13;
              }
            }
            var5 = 8947848;
            var4 = 10;
            break L12;
          } else {
            break L12;
          }
        }
        L14: {
          if (9 == ((qe) this).field_m) {
            L15: {
              if (fe.field_e) {
                ll.field_c.a(sb.field_e[18], 100, pk.field_h * 2);
                break L15;
              } else {
                break L15;
              }
            }
            var5 = 16777215;
            var4 = 10;
            break L14;
          } else {
            break L14;
          }
        }
        L16: {
          if (((qe) this).field_m == 10) {
            var4 = 10;
            var5 = 8947967;
            if (fe.field_e) {
              ll.field_c.a(sb.field_e[15], 100, pk.field_h * 2);
              break L16;
            } else {
              break L16;
            }
          } else {
            break L16;
          }
        }
        L17: {
          if (((qe) this).field_m == 13) {
            L18: {
              int fieldTemp$14 = ta.field_p;
              ta.field_p = ta.field_p + 1;
              if (fieldTemp$14 == 20) {
                int discarded$15 = 1;
                hj.a(244, 11);
                break L18;
              } else {
                break L18;
              }
            }
            L19: {
              var5 = 16711680;
              if (fe.field_e) {
                ll.field_c.a(sb.field_e[12], 100, 2 * pk.field_h);
                break L19;
              } else {
                break L19;
              }
            }
            var4 = 100;
            stellarshard.field_U[4] = stellarshard.field_U[4] + 1;
            break L17;
          } else {
            break L17;
          }
        }
        L20: {
          if (((qe) this).field_m != 12) {
            break L20;
          } else {
            L21: {
              int fieldTemp$16 = ta.field_p;
              ta.field_p = ta.field_p + 1;
              if (fieldTemp$16 == 20) {
                int discarded$17 = 1;
                hj.a(244, 11);
                break L21;
              } else {
                break L21;
              }
            }
            L22: {
              if (fe.field_e) {
                ll.field_c.a(sb.field_e[12], 100, 2 * pk.field_h);
                break L22;
              } else {
                break L22;
              }
            }
            var4 = 100;
            var5 = 16711680;
            stellarshard.field_U[5] = stellarshard.field_U[5] + 1;
            break L20;
          }
        }
        L23: {
          if (14 != ((qe) this).field_m) {
            break L23;
          } else {
            L24: {
              int fieldTemp$18 = ta.field_p;
              ta.field_p = ta.field_p + 1;
              if (fieldTemp$18 != 20) {
                break L24;
              } else {
                int discarded$19 = 1;
                hj.a(244, 11);
                break L24;
              }
            }
            L25: {
              if (!fe.field_e) {
                break L25;
              } else {
                ll.field_c.a(sb.field_e[12], 100, 2 * pk.field_h);
                break L25;
              }
            }
            var4 = 1000;
            var5 = 16711680;
            stellarshard.field_U[9] = stellarshard.field_U[9] + 1;
            break L23;
          }
        }
        L26: {
          var6 = -40 / ((param0 - 63) / 34);
          if (((qe) this).field_m == 15) {
            L27: {
              int fieldTemp$20 = sd.field_b;
              sd.field_b = sd.field_b + 1;
              if (fieldTemp$20 == 10) {
                int discarded$21 = 1;
                hj.a(243, 12);
                break L27;
              } else {
                break L27;
              }
            }
            L28: {
              var4 = 250;
              var5 = 16711680;
              if (!fe.field_e) {
                break L28;
              } else {
                ll.field_c.a(sb.field_e[12], 100, 2 * pk.field_h);
                break L28;
              }
            }
            stellarshard.field_U[9] = stellarshard.field_U[9] + 1;
            break L26;
          } else {
            break L26;
          }
        }
        L29: {
          if (((qe) this).field_m != 7) {
            break L29;
          } else {
            L30: {
              var4 = 250;
              if (fe.field_e) {
                ll.field_c.a(sb.field_e[12], 100, 2 * pk.field_h);
                break L30;
              } else {
                break L30;
              }
            }
            var5 = 16711680;
            break L29;
          }
        }
        L31: {
          if (6 == ((qe) this).field_m) {
            L32: {
              if (!fe.field_e) {
                break L32;
              } else {
                ll.field_c.a(sb.field_e[12], 100, pk.field_h * 2);
                break L32;
              }
            }
            var4 = 250;
            var5 = 16711680;
            break L31;
          } else {
            break L31;
          }
        }
        L33: {
          if (((qe) this).field_m != 1) {
            break L33;
          } else {
            var3 = 3;
            var2 = 0;
            break L33;
          }
        }
        L34: {
          if (((qe) this).field_m != 0) {
            break L34;
          } else {
            var2 = 8;
            var3 = 4;
            break L34;
          }
        }
        L35: {
          if (((qe) this).field_m != 3) {
            break L35;
          } else {
            var3 = 2;
            var2 = 2;
            break L35;
          }
        }
        L36: {
          if (2 == ((qe) this).field_m) {
            var3 = 2;
            var2 = 9;
            break L36;
          } else {
            break L36;
          }
        }
        L37: {
          if (((qe) this).field_m != 5) {
            break L37;
          } else {
            var2 = 4;
            var3 = 2;
            break L37;
          }
        }
        L38: {
          if (4 == ((qe) this).field_m) {
            var3 = 10;
            var2 = 10;
            break L38;
          } else {
            break L38;
          }
        }
        L39: {
          if (((qe) this).field_m < 0) {
            break L39;
          } else {
            if (8 >= ((qe) this).field_m) {
              if (7 != ((qe) this).field_m) {
                break L39;
              } else {
                var3 = 4;
                var2 = 13;
                break L39;
              }
            } else {
              break L39;
            }
          }
        }
        L40: {
          if (((qe) this).field_m == 6) {
            var2 = 12;
            var3 = 4;
            break L40;
          } else {
            break L40;
          }
        }
        L41: {
          if (!((qe) this).a((byte) -91)) {
            var14 = new vl(2, (qe) this);
            var7_ref_vl = var14;
            var7_ref_vl.field_j = 0.0;
            var7_ref_vl.field_k = ((qe) this).field_l;
            var7_ref_vl.field_a = 0.0;
            var7_ref_vl.field_c = ((qe) this).field_a;
            var14.field_q = 16711680;
            wk.field_b[eg.a(-71)] = var14;
            break L41;
          } else {
            break L41;
          }
        }
        L42: {
          if (var4 <= 0) {
            break L42;
          } else {
            sd dupTemp$22 = new sd(var4, (qe) this, var5);
            var15 = dupTemp$22;
            var7_ref_sd = dupTemp$22;
            hf.field_e[ha.k(-1001)] = var15;
            if (4 != nc.field_H) {
              break L42;
            } else {
              if (tb.field_K >= 1000) {
                break L42;
              } else {
                tb.field_K = tb.field_K + var4;
                if (tb.field_K >= 1000) {
                  int discarded$23 = 1;
                  hj.a(254, 1);
                  break L42;
                } else {
                  break L42;
                }
              }
            }
          }
        }
        L43: {
          if (((qe) this).field_m == 11) {
            break L43;
          } else {
            if (((qe) this).field_m == -1) {
              break L43;
            } else {
              if (nc.field_H == 4) {
                break L43;
              } else {
                int discarded$24 = -118;
                var7_int = dc.a();
                if (var7_int <= -1) {
                  if (!pk.a(-12663, 0)) {
                    break L43;
                  } else {
                    L44: {
                      if (qi.field_a >= q.field_a) {
                        break L44;
                      } else {
                        if (ph.field_D < 2) {
                          break L43;
                        } else {
                          if (si.field_jb[52]) {
                            break L44;
                          } else {
                            break L43;
                          }
                        }
                      }
                    }
                    var8 = 1;
                    var9_int = 0;
                    var10_int = 0;
                    L45: while (true) {
                      if (var10_int >= 1000) {
                        if (var8 == 0) {
                          break L43;
                        } else {
                          L46: {
                            if (var9_int > 30) {
                              break L46;
                            } else {
                              if (ph.field_D < 2) {
                                break L43;
                              } else {
                                if (!si.field_jb[52]) {
                                  break L43;
                                } else {
                                  break L46;
                                }
                              }
                            }
                          }
                          q.field_a = q.field_a + 1;
                          var10 = new qe(11);
                          var10.field_c = 16;
                          var10.field_l = ((qe) this).field_l;
                          var10.field_a = ((qe) this).field_a;
                          int discarded$25 = 63;
                          a.field_h[pl.e()] = var10;
                          break L43;
                        }
                      } else {
                        L47: {
                          if (a.field_h[var10_int] == null) {
                            break L47;
                          } else {
                            var9_int++;
                            if (!a.field_h[var10_int].a((byte) -55)) {
                              break L47;
                            } else {
                              var8 = 0;
                              break L47;
                            }
                          }
                        }
                        var10_int++;
                        continue L45;
                      }
                    }
                  }
                } else {
                  L48: {
                    var8_ref_qe = new qe(11);
                    var8_ref_qe.field_c = var7_int;
                    var8_ref_qe.field_l = ((qe) this).field_l;
                    var8_ref_qe.field_a = ((qe) this).field_a;
                    if (var8_ref_qe.field_c != e.field_e) {
                      break L48;
                    } else {
                      b.a(var8_ref_qe.field_c, 6);
                      var8_ref_qe.field_c = 8;
                      break L48;
                    }
                  }
                  int discarded$26 = 63;
                  a.field_h[pl.e()] = var8_ref_qe;
                  break L43;
                }
              }
            }
          }
        }
        L49: {
          if (var3 > 0) {
            var7 = 0.0;
            var9 = 0.0;
            var11 = 0;
            L50: while (true) {
              if (var11 >= var3) {
                break L49;
              } else {
                L51: {
                  L52: {
                    var12 = new qe(var2);
                    var12.field_l = ((qe) this).field_l;
                    var12.field_a = ((qe) this).field_a;
                    if (~(var3 + -1) < ~var11) {
                      break L52;
                    } else {
                      if (var2 == 10) {
                        break L52;
                      } else {
                        var12.field_d = -var7;
                        var12.field_k = -var9;
                        break L51;
                      }
                    }
                  }
                  var9 = var9 + var12.field_k;
                  var7 = var7 + var12.field_d;
                  break L51;
                }
                var12.field_d = var12.field_d + (double)((qe) this).field_n * ((qe) this).field_d / (double)(var3 * var12.field_n);
                var12.field_k = var12.field_k + ((qe) this).field_k * (double)((qe) this).field_n / (double)(var3 * var12.field_n);
                int discarded$27 = 63;
                a.field_h[pl.e()] = var12;
                var11++;
                continue L50;
              }
            }
          } else {
            break L49;
          }
        }
    }

    private final void a(int param0, int param1) {
        double var3 = 0.0;
        double var5 = 0.0;
        int var7 = 0;
        L0: {
          if (fe.field_e) {
            if (a.field_h[0] == null) {
              break L0;
            } else {
              L1: {
                L2: {
                  var3 = ((qe) this).field_a - a.field_h[0].field_a;
                  var5 = -a.field_h[0].field_l + ((qe) this).field_l;
                  var7 = 128;
                  if (var3 != 0.0) {
                    break L2;
                  } else {
                    if (var5 != 0.0) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                var7 = (int)(2560.0 / Math.sqrt(var5 * var5 + var3 * var3));
                break L1;
              }
              L3: {
                if (var7 > 128) {
                  var7 = 128;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                L5: {
                  if (param1 == 0) {
                    break L5;
                  } else {
                    if (param1 == 1) {
                      break L5;
                    } else {
                      if (param1 != 8) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                ll.field_c.a(sb.field_e[2], 100, var7 * pk.field_h / 50);
                break L4;
              }
              L6: {
                L7: {
                  if (param1 == 2) {
                    break L7;
                  } else {
                    if (param1 == 3) {
                      break L7;
                    } else {
                      if (param1 == 9) {
                        break L7;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                ll.field_c.a(sb.field_e[4], 100, var7 * pk.field_h / 50);
                break L6;
              }
              L8: {
                L9: {
                  if (param1 == 4) {
                    break L9;
                  } else {
                    if (5 == param1) {
                      break L9;
                    } else {
                      if (10 != param1) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
                ll.field_c.a(sb.field_e[3], 100, pk.field_h * var7 / 50);
                break L8;
              }
              if (param1 != -1) {
                break L0;
              } else {
                ll.field_c.a(sb.field_e[40], 100, pk.field_h);
                break L0;
              }
            }
          } else {
            break L0;
          }
        }
    }

    final int c(byte param0) {
        if (param0 <= 34) {
            ((qe) this).field_j = 36;
        }
        if (((qe) this).field_m >= 0) {
            if (!(((qe) this).field_m >= 8)) {
                return 48;
            }
        }
        return 32;
    }

    final void a(byte param0, int param1, int param2) {
        ((qe) this).field_l = ((qe) this).field_l - (double)param2;
        ((qe) this).field_a = ((qe) this).field_a - (double)param1;
        if (param0 > -102) {
            ((qe) this).field_l = 1.4581035574663785;
        }
    }

    final static int a(byte param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param0 <= -10) {
              if (!param2) {
                stackOut_6_0 = pe.field_c.b(param1);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = mj.field_E.b(param1);
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = -37;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("qe.Q(").append(param0).append(44);
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
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param2 + 41);
        }
        return stackIn_7_0;
    }

    final static boolean b(int param0, int param1) {
        try {
            int var2_int = 0;
            IOException var2 = null;
            int stackIn_12_0 = 0;
            int stackIn_14_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_11_0 = 0;
            if (param1 <= ae.field_N.field_k) {
              return true;
            } else {
              if (null == ob.field_b) {
                return false;
              } else {
                try {
                  L0: {
                    var2_int = ob.field_b.b(-111);
                    if (var2_int <= 0) {
                      L1: {
                        if (var2_int < 0) {
                          break L1;
                        } else {
                          if (tk.b(125) <= 30000L) {
                            decompiledRegionSelector0 = 0;
                            break L0;
                          } else {
                            break L1;
                          }
                        }
                      }
                      int discarded$3 = -2290;
                      oj.c();
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L2: {
                        if (-ae.field_N.field_k + param1 < var2_int) {
                          var2_int = -ae.field_N.field_k + param1;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      ob.field_b.a(ae.field_N.field_k, (byte) -64, ae.field_N.field_r, var2_int);
                      ka.field_o = ih.a((byte) -98);
                      ae.field_N.field_k = ae.field_N.field_k + var2_int;
                      if (ae.field_N.field_k >= param1) {
                        ae.field_N.field_k = 0;
                        stackOut_13_0 = 1;
                        stackIn_14_0 = stackOut_13_0;
                        return stackIn_14_0 != 0;
                      } else {
                        stackOut_11_0 = 0;
                        stackIn_12_0 = stackOut_11_0;
                        return stackIn_12_0 != 0;
                      }
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2 = (IOException) (Object) decompiledCaughtException;
                    int discarded$4 = -2290;
                    oj.c();
                    decompiledRegionSelector0 = 1;
                    break L3;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  return false;
                } else {
                  return false;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    qe(int param0) {
        double var2 = 0.0;
        double var4 = 0.0;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        Object stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_11_0 = null;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_21_0 = null;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        Object stackOut_26_0 = null;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        Object stackOut_31_0 = null;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        Object stackOut_36_0 = null;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        L0: {
          ((qe) this).field_j = 0;
          ((qe) this).field_m = param0;
          ((qe) this).field_i = 0;
          ((qe) this).field_b = 0;
          ((qe) this).field_c = 0;
          ((qe) this).field_h = (int)(Math.random() * 256.0);
          ((qe) this).field_l = 0.0;
          ((qe) this).field_d = 0.0;
          ((qe) this).field_a = 0.0;
          ((qe) this).field_n = 100;
          ((qe) this).field_k = 0.0;
          var2 = 2.0 * (3.141592653589793 * Math.random());
          var4 = 100.0 * (Math.random() * 0.5 + 0.5);
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (qi.field_a >= 2) {
            stackOut_2_0 = this;
            stackOut_2_1 = 2;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = qi.field_a;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ((qe) this).field_g = stackIn_3_1;
          if (param0 != -1) {
            break L1;
          } else {
            ((qe) this).field_g = 1;
            break L1;
          }
        }
        L2: {
          if (param0 != 0) {
            break L2;
          } else {
            L3: {
              stackOut_6_0 = this;
              stackIn_8_0 = stackOut_6_0;
              stackIn_7_0 = stackOut_6_0;
              if (qi.field_a >= 6) {
                stackOut_8_0 = this;
                stackOut_8_1 = 6;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                break L3;
              } else {
                stackOut_7_0 = this;
                stackOut_7_1 = qi.field_a;
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                break L3;
              }
            }
            ((qe) this).field_g = stackIn_9_1;
            break L2;
          }
        }
        L4: {
          if (2 != param0) {
            break L4;
          } else {
            L5: {
              stackOut_11_0 = this;
              stackIn_13_0 = stackOut_11_0;
              stackIn_12_0 = stackOut_11_0;
              if (qi.field_a < 8) {
                stackOut_13_0 = this;
                stackOut_13_1 = qi.field_a;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                break L5;
              } else {
                stackOut_12_0 = this;
                stackOut_12_1 = 8;
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                break L5;
              }
            }
            ((qe) this).field_g = stackIn_14_1;
            break L4;
          }
        }
        L6: {
          if (4 != param0) {
            break L6;
          } else {
            L7: {
              stackOut_16_0 = this;
              stackIn_18_0 = stackOut_16_0;
              stackIn_17_0 = stackOut_16_0;
              if (4 > qi.field_a) {
                stackOut_18_0 = this;
                stackOut_18_1 = qi.field_a;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                break L7;
              } else {
                stackOut_17_0 = this;
                stackOut_17_1 = 4;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                break L7;
              }
            }
            ((qe) this).field_g = stackIn_19_1;
            break L6;
          }
        }
        L8: {
          if (param0 != 1) {
            break L8;
          } else {
            L9: {
              stackOut_21_0 = this;
              stackIn_23_0 = stackOut_21_0;
              stackIn_22_0 = stackOut_21_0;
              if (qi.field_a >= 8) {
                stackOut_23_0 = this;
                stackOut_23_1 = 8;
                stackIn_24_0 = stackOut_23_0;
                stackIn_24_1 = stackOut_23_1;
                break L9;
              } else {
                stackOut_22_0 = this;
                stackOut_22_1 = qi.field_a;
                stackIn_24_0 = stackOut_22_0;
                stackIn_24_1 = stackOut_22_1;
                break L9;
              }
            }
            ((qe) this).field_g = stackIn_24_1;
            break L8;
          }
        }
        L10: {
          if (param0 != 3) {
            break L10;
          } else {
            L11: {
              stackOut_26_0 = this;
              stackIn_28_0 = stackOut_26_0;
              stackIn_27_0 = stackOut_26_0;
              if (8 <= qi.field_a) {
                stackOut_28_0 = this;
                stackOut_28_1 = 16;
                stackIn_29_0 = stackOut_28_0;
                stackIn_29_1 = stackOut_28_1;
                break L11;
              } else {
                stackOut_27_0 = this;
                stackOut_27_1 = 2 * qi.field_a;
                stackIn_29_0 = stackOut_27_0;
                stackIn_29_1 = stackOut_27_1;
                break L11;
              }
            }
            ((qe) this).field_g = stackIn_29_1;
            break L10;
          }
        }
        L12: {
          if (param0 != 5) {
            break L12;
          } else {
            L13: {
              stackOut_31_0 = this;
              stackIn_33_0 = stackOut_31_0;
              stackIn_32_0 = stackOut_31_0;
              if (6 <= qi.field_a) {
                stackOut_33_0 = this;
                stackOut_33_1 = 6;
                stackIn_34_0 = stackOut_33_0;
                stackIn_34_1 = stackOut_33_1;
                break L13;
              } else {
                stackOut_32_0 = this;
                stackOut_32_1 = qi.field_a;
                stackIn_34_0 = stackOut_32_0;
                stackIn_34_1 = stackOut_32_1;
                break L13;
              }
            }
            ((qe) this).field_g = stackIn_34_1;
            break L12;
          }
        }
        L14: {
          if (param0 != 9) {
            break L14;
          } else {
            L15: {
              stackOut_36_0 = this;
              stackIn_38_0 = stackOut_36_0;
              stackIn_37_0 = stackOut_36_0;
              if (qi.field_a >= 4) {
                stackOut_38_0 = this;
                stackOut_38_1 = 4;
                stackIn_39_0 = stackOut_38_0;
                stackIn_39_1 = stackOut_38_1;
                break L15;
              } else {
                stackOut_37_0 = this;
                stackOut_37_1 = qi.field_a;
                stackIn_39_0 = stackOut_37_0;
                stackIn_39_1 = stackOut_37_1;
                break L15;
              }
            }
            ((qe) this).field_g = stackIn_39_1;
            break L14;
          }
        }
        L16: {
          if (param0 != 10) {
            break L16;
          } else {
            ((qe) this).field_g = 1;
            break L16;
          }
        }
        L17: {
          if (param0 != 11) {
            break L17;
          } else {
            ((qe) this).field_g = 50;
            break L17;
          }
        }
        L18: {
          if (param0 != 14) {
            break L18;
          } else {
            ((qe) this).field_g = 50;
            ((qe) this).field_n = 1000;
            break L18;
          }
        }
        L19: {
          if (param0 != 12) {
            break L19;
          } else {
            ((qe) this).field_n = 200;
            ((qe) this).field_g = 1 + qi.field_a / 6;
            ((qe) this).field_h = (int)(Math.random() * 256.0);
            break L19;
          }
        }
        L20: {
          if (param0 != 13) {
            break L20;
          } else {
            ((qe) this).field_n = 200;
            ((qe) this).field_g = qi.field_a / 6 + 1;
            ((qe) this).field_h = (int)(Math.random() * 256.0);
            break L20;
          }
        }
        L21: {
          if (param0 != 15) {
            break L21;
          } else {
            ((qe) this).field_g = qi.field_a / 6 + 3;
            ((qe) this).field_n = 100;
            ((qe) this).field_h = (int)(256.0 * Math.random());
            break L21;
          }
        }
        L22: {
          if (param0 != 6) {
            break L22;
          } else {
            ((qe) this).field_g = 10 - -(qi.field_a / 5);
            ((qe) this).field_n = 150;
            ((qe) this).field_h = (int)(256.0 * Math.random());
            break L22;
          }
        }
        L23: {
          if (param0 != 7) {
            break L23;
          } else {
            ((qe) this).field_g = 10 - -(qi.field_a / 5);
            ((qe) this).field_n = 150;
            ((qe) this).field_h = (int)(Math.random() * 256.0);
            break L23;
          }
        }
        L24: {
          if (param0 >= 0) {
            break L24;
          } else {
            ((qe) this).field_f = cm.field_d;
            break L24;
          }
        }
        L25: {
          if (0 > param0) {
            break L25;
          } else {
            if (param0 >= 8) {
              break L25;
            } else {
              ((qe) this).field_f = fe.field_d[param0];
              break L25;
            }
          }
        }
        L26: {
          if (8 > param0) {
            break L26;
          } else {
            ((qe) this).field_f = rd.field_a[-8 + param0];
            break L26;
          }
        }
        L27: {
          L28: {
            if (param0 == 0) {
              break L28;
            } else {
              if (param0 == 2) {
                break L28;
              } else {
                if (4 != param0) {
                  break L27;
                } else {
                  break L28;
                }
              }
            }
          }
          ((qe) this).field_j = 5;
          ((qe) this).field_h = (int)(Math.random() * 256.0);
          ((qe) this).field_n = 100;
          break L27;
        }
        L29: {
          L30: {
            if (param0 == 8) {
              break L30;
            } else {
              if (9 != param0) {
                break L29;
              } else {
                break L30;
              }
            }
          }
          ((qe) this).field_j = 7;
          ((qe) this).field_h = (int)(256.0 * Math.random());
          ((qe) this).field_n = 50;
          break L29;
        }
        L31: {
          L32: {
            if (param0 == 1) {
              break L32;
            } else {
              if (param0 == 3) {
                break L32;
              } else {
                if (param0 != 5) {
                  break L31;
                } else {
                  break L32;
                }
              }
            }
          }
          ((qe) this).field_j = 3;
          ((qe) this).field_h = (int)(256.0 * Math.random());
          ((qe) this).field_n = 200;
          break L31;
        }
        L33: {
          if (param0 != 10) {
            break L33;
          } else {
            ((qe) this).field_j = 10;
            ((qe) this).field_h = (int)(Math.random() * 256.0);
            ((qe) this).field_n = 25;
            break L33;
          }
        }
        L34: {
          if (param0 < 0) {
            ((qe) this).field_k = 0.0;
            ((qe) this).field_a = 0.0;
            ((qe) this).field_d = 0.0;
            ((qe) this).field_l = 0.0;
            break L34;
          } else {
            L35: {
              ((qe) this).field_d = var4 * Math.sin(var2) / (double)((qe) this).field_n;
              ((qe) this).field_k = Math.cos(var2) * var4 / (double)((qe) this).field_n;
              if (Math.random() >= 0.5) {
                ((qe) this).field_l = 0.0;
                ((qe) this).field_a = Math.random() * 1152.0;
                break L35;
              } else {
                ((qe) this).field_a = 0.0;
                ((qe) this).field_l = Math.random() * 992.0;
                break L35;
              }
            }
            ((qe) this).field_a = ((qe) this).field_a + (double)(1152 * (int)(2.0 * Math.random()) - 576);
            ((qe) this).field_l = ((qe) this).field_l + (double)(-496 + 992 * (int)(Math.random() * 2.0));
            break L34;
          }
        }
    }

    static {
    }
}
