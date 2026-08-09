/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class eo {
    static ot[] field_k;
    static ut[] field_p;
    private static ut field_d;
    static ut field_q;
    static ot field_b;
    static ot field_a;
    static ut[] field_l;
    static ot[][] field_r;
    private static ut[][] field_h;
    private static ut[] field_n;
    static ut[] field_j;
    static ut[] field_m;
    static ot[][] field_c;
    static ot[] field_i;
    private static ut field_g;
    static kg[] field_f;
    private static int field_e;
    private static int[] field_o;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        eo.a(param0, param1, param2, param4, param5);
        eo.a(param0, param1 + param3 - 1, param2, param4, param5);
        eo.c(param0 + param2 - 1, param1, param3, param4, param5);
        eo.c(param0, param1, param3, param4, param5);
    }

    private final static void a(int param0, int param1, int param2, boolean param3) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int fieldTemp$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        L0: {
          var4 = param1 - param2;
          if (var4 >= on.field_e) {
            break L0;
          } else {
            var4 = on.field_e;
            break L0;
          }
        }
        L1: {
          var5 = param1 + param2 + 1;
          if (var5 <= on.field_h) {
            break L1;
          } else {
            var5 = on.field_h;
            break L1;
          }
        }
        L2: {
          var6 = var4;
          var7 = param2 * param2;
          var8 = 0;
          var9 = param1 - var6;
          var10 = var9 * var9;
          var11 = var10 - var9;
          if (param1 <= var5) {
            break L2;
          } else {
            param1 = var5;
            break L2;
          }
        }
        L3: while (true) {
          if (var6 >= param1) {
            var8 = param2;
            var9 = var6 - param1;
            var11 = var9 * var9 + var7;
            var10 = var11 - var8;
            var11 = var11 - var9;
            L4: while (true) {
              if (var6 >= var5) {
                return;
              } else {
                L5: while (true) {
                  L6: {
                    if (var11 <= var7) {
                      break L6;
                    } else {
                      if (var10 <= var7) {
                        break L6;
                      } else {
                        incrementValue$0 = var8;
                        var8--;
                        var11 = var11 - (incrementValue$0 + var8);
                        var10 = var10 - (var8 + var8);
                        continue L5;
                      }
                    }
                  }
                  L7: {
                    var12 = param0 - var8;
                    if (var12 >= on.field_b) {
                      break L7;
                    } else {
                      var12 = on.field_b;
                      break L7;
                    }
                  }
                  L8: {
                    var13 = param0 + var8;
                    if (var13 <= on.field_c - 1) {
                      break L8;
                    } else {
                      var13 = on.field_c - 1;
                      break L8;
                    }
                  }
                  L9: {
                    var14 = var12 + var6 * on.field_g;
                    if (!param3) {
                      var15 = var12;
                      L10: while (true) {
                        if (var15 >= var13) {
                          break L9;
                        } else {
                          incrementValue$1 = var14;
                          var14++;
                          on.field_a[incrementValue$1] = on.field_a[incrementValue$1] & 16777215;
                          var15++;
                          continue L10;
                        }
                      }
                    } else {
                      var15 = var12;
                      L11: while (true) {
                        if (var15 >= var13) {
                          break L9;
                        } else {
                          incrementValue$2 = var14;
                          var14++;
                          fieldTemp$3 = field_e;
                          field_e = field_e + 1;
                          on.field_a[incrementValue$2] = on.field_a[incrementValue$2] | field_o[fieldTemp$3 % 307];
                          var15++;
                          continue L11;
                        }
                      }
                    }
                  }
                  var6++;
                  var11 = var11 + (var9 + var9);
                  incrementValue$4 = var9;
                  var9++;
                  var10 = var10 + (incrementValue$4 + var9);
                  continue L4;
                }
              }
            }
          } else {
            L12: while (true) {
              L13: {
                if (var11 <= var7) {
                  break L13;
                } else {
                  if (var10 > var7) {
                    L14: {
                      var12 = param0 - var8 + 1;
                      if (var12 >= on.field_b) {
                        break L14;
                      } else {
                        var12 = on.field_b;
                        break L14;
                      }
                    }
                    L15: {
                      var13 = param0 + var8;
                      if (var13 <= on.field_c) {
                        break L15;
                      } else {
                        var13 = on.field_c;
                        break L15;
                      }
                    }
                    L16: {
                      var14 = var12 + var6 * on.field_g;
                      if (!param3) {
                        var15 = var12;
                        L17: while (true) {
                          if (var15 >= var13) {
                            break L16;
                          } else {
                            incrementValue$5 = var14;
                            var14++;
                            on.field_a[incrementValue$5] = on.field_a[incrementValue$5] & 16777215;
                            var15++;
                            continue L17;
                          }
                        }
                      } else {
                        var15 = var12;
                        L18: while (true) {
                          if (var15 >= var13) {
                            break L16;
                          } else {
                            incrementValue$6 = var14;
                            var14++;
                            fieldTemp$7 = field_e;
                            field_e = field_e + 1;
                            on.field_a[incrementValue$6] = on.field_a[incrementValue$6] | field_o[fieldTemp$7 % 307];
                            var15++;
                            continue L18;
                          }
                        }
                      }
                    }
                    var6++;
                    incrementValue$8 = var9;
                    var9--;
                    var10 = var10 - (incrementValue$8 + var9);
                    var11 = var11 - (var9 + var9);
                    continue L3;
                  } else {
                    break L13;
                  }
                }
              }
              var10 = var10 + (var8 + var8);
              incrementValue$9 = var8;
              var8++;
              var11 = var11 + (incrementValue$9 + var8);
              continue L12;
            }
          }
        }
    }

    public static void c() {
        field_q = null;
        field_p = null;
        field_j = null;
        field_m = null;
        field_f = null;
        field_k = null;
        field_i = null;
        field_a = null;
        field_b = null;
        field_c = (ot[][]) null;
        field_r = (ot[][]) null;
        field_l = null;
        field_n = null;
        field_h = (ut[][]) null;
        field_g = null;
        field_d = null;
        field_o = null;
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int incrementValue$0 = 0;
        int var9 = 0;
        int incrementValue$1 = 0;
        for (var8 = -param7; var8 < 0; var8++) {
            incrementValue$0 = param3;
            param3++;
            param2 = param1[incrementValue$0];
            for (var9 = -param6; var9 < 0; var9++) {
                incrementValue$1 = param4;
                param4++;
                param0[incrementValue$1] = param2;
            }
            param4 = param4 + param5;
        }
    }

    final static void a(ut param0, ot param1) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int incrementValue$0 = 0;
        int var2 = param0.field_q;
        int var3 = param0.field_w;
        int[] var4 = param0.field_y;
        int[] var5 = param1.field_y;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        while (var8 < var3) {
            for (var9 = 0; var9 < var2; var9 += 2) {
                var10 = var4[var6 + var9];
                var11 = var4[var6 + var9 + 1];
                var12 = var4[var6 + var2 + var9];
                var13 = var4[var6 + var2 + var9 + 1];
                var14 = (-var10 >>> 31) + (-var11 >>> 31) + (-var12 >>> 31) + (-var13 >>> 31) << 6;
                var15 = var14 & 256;
                incrementValue$0 = var7;
                var7++;
                var5[incrementValue$0] = ((var14 | var15 - (var15 >> 8)) << 24) + ((var10 & 16711935) + (var11 & 16711935) + (var12 & 16711935) + (var13 & 16711935) >> 2 & 16711935) + (((var10 & 65280) >>> 2) + ((var11 & 65280) >>> 2) + ((var12 & 65280) >>> 2) + ((var13 & 65280) >>> 2) & 65280);
            }
            var8 += 2;
            var6 = var6 + (param0.field_q << 1);
        }
        param1.field_s = param0.field_s >> 1;
        param1.field_n = param0.field_s >> 1;
        param1.field_o = param0.field_o >> 1;
        param1.field_v = param0.field_v >> 1;
    }

    final static void b(int param0, int param1, int param2, int param3, int param4) {
        int incrementValue$0 = 0;
        int fieldTemp$1 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$3 = 0;
        int incrementValue$4 = 0;
        int fieldTemp$5 = 0;
        int incrementValue$6 = 0;
        int fieldTemp$7 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        var5 = on.field_g * param1 + param0;
        var6 = on.field_g - param2;
        var7 = 0;
        L0: while (true) {
          if (var7 >= param4) {
            var7 = param3 - (param4 << 1);
            var8 = param2 - (param4 << 1);
            var9 = 0;
            L1: while (true) {
              if (var9 >= var7) {
                var9 = 0;
                L2: while (true) {
                  if (var9 >= param4) {
                    return;
                  } else {
                    var10 = 0;
                    L3: while (true) {
                      if (var10 >= param2) {
                        var5 = var5 + var6;
                        var9++;
                        continue L2;
                      } else {
                        incrementValue$0 = var5;
                        var5++;
                        fieldTemp$1 = field_e;
                        field_e = field_e + 1;
                        on.field_a[incrementValue$0] = on.field_a[incrementValue$0] | field_o[fieldTemp$1 % 307];
                        var10++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var10 = 0;
                L4: while (true) {
                  if (var10 >= param4) {
                    var5 = var5 + var8;
                    var10 = 0;
                    L5: while (true) {
                      if (var10 >= param4) {
                        var5 = var5 + var6;
                        var9++;
                        continue L1;
                      } else {
                        incrementValue$2 = var5;
                        var5++;
                        fieldTemp$3 = field_e;
                        field_e = field_e + 1;
                        on.field_a[incrementValue$2] = on.field_a[incrementValue$2] | field_o[fieldTemp$3 % 307];
                        var10++;
                        continue L5;
                      }
                    }
                  } else {
                    incrementValue$4 = var5;
                    var5++;
                    fieldTemp$5 = field_e;
                    field_e = field_e + 1;
                    on.field_a[incrementValue$4] = on.field_a[incrementValue$4] | field_o[fieldTemp$5 % 307];
                    var10++;
                    continue L4;
                  }
                }
              }
            }
          } else {
            var8 = 0;
            L6: while (true) {
              if (var8 >= param2) {
                var5 = var5 + var6;
                var7++;
                continue L0;
              } else {
                incrementValue$6 = var5;
                var5++;
                fieldTemp$7 = field_e;
                field_e = field_e + 1;
                on.field_a[incrementValue$6] = on.field_a[incrementValue$6] | field_o[fieldTemp$7 % 307];
                var8++;
                continue L6;
              }
            }
          }
        }
    }

    final static void d(int param0, int param1, int param2, int param3) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        L0: {
          var4 = 65793;
          if (param0 >= on.field_b) {
            break L0;
          } else {
            param2 = param2 - (on.field_b - param0);
            param0 = on.field_b;
            break L0;
          }
        }
        L1: {
          if (param1 >= on.field_e) {
            break L1;
          } else {
            param3 = param3 - (on.field_e - param1);
            param1 = on.field_e;
            break L1;
          }
        }
        L2: {
          if (param0 + param2 <= on.field_c) {
            break L2;
          } else {
            param2 = on.field_c - param0;
            break L2;
          }
        }
        L3: {
          if (param1 + param3 <= on.field_h) {
            break L3;
          } else {
            param3 = on.field_h - param1;
            break L3;
          }
        }
        var4 = ((var4 & 16711935) * 150 >> 8 & 16711935) + ((var4 & 65280) * 150 >> 8 & 65280);
        var5 = 106;
        var6 = on.field_g - param2;
        var7 = param0 + param1 * on.field_g;
        var8 = 0;
        L4: while (true) {
          if (var8 >= param3) {
            return;
          } else {
            var9 = var8 & 1;
            var10 = (-param2 >> 1) + (param2 & 1);
            L5: while (true) {
              if (var10 >= 0) {
                var7 = var7 + (var6 + (param2 & 1));
                var8++;
                continue L4;
              } else {
                var11 = on.field_a[var7 + var9];
                var11 = ((var11 & 16711935) * var5 >> 8 & 16711935) + ((var11 & 65280) * var5 >> 8 & 65280);
                on.field_a[var7 + var9] = var4 + var11;
                var7 += 2;
                var10++;
                continue L5;
              }
            }
          }
        }
    }

    final static void a(ut param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param3 > 640) {
            param3 = 640;
        }
        if (param4 > 480) {
            param4 = 480;
        }
        if (param1 < 0) {
            param1 = 0;
        }
        if (param2 < 0) {
            param2 = 0;
        }
        int var7 = 640 - param3;
        int var8 = param2 * 640;
        if (param5 == 256) {
            eo.a(on.field_a, param0.field_y, 0, param6, param1 + var8, var7, param3, param4);
        } else {
            if (param5 == 240) {
                eo.b(on.field_a, param0.field_y, 0, param6, param1 + var8, var7, param3, param4);
            } else {
                eo.a(on.field_a, param0.field_y, 0, param6, param1 + var8, var7, param3, param4, param5);
            }
        }
    }

    private final static void a(String param0, hu param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ut var8 = new ut(param4, param5);
        iw.a(-79, var8);
        param1.a(param0, 0, 0, param4, param5, param6, -1, 1, 1, 0);
        ta.e(126);
        var8.c(param2, param3, param7, 4096);
    }

    private final static boolean a(int param0, int param1, int param2) {
        int var3;
        int stackIn_7_0 = 0;
        L0: {
          L1: {
            L2: {
              param0 = param0 & 8191;
              param1 = param1 & 8191;
              var3 = param1 + param2;
              if (param0 <= param1) {
                break L2;
              } else {
                if (param0 < var3) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (param0 >= param1) {
                break L3;
              } else {
                if (var3 < 8192) {
                  break L3;
                } else {
                  if (param0 >= (var3 & 8191)) {
                    break L3;
                  } else {
                    break L1;
                  }
                }
              }
            }
            stackIn_7_0 = 0;
            break L0;
          }
          stackIn_7_0 = 1;
          break L0;
        }
        return stackIn_7_0 != 0;
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        var10 = -param6;
        L0: while (true) {
          if (var10 >= 0) {
            return;
          } else {
            var11 = -param5;
            L1: while (true) {
              if (var11 >= 0) {
                param4 = param4 + param7;
                param3 = param3 + param8;
                var10++;
                continue L0;
              } else {
                incrementValue$12 = param3;
                param3++;
                param2 = param1[incrementValue$12];
                if (param2 == 0) {
                  param4++;
                  var11++;
                  continue L1;
                } else {
                  var12 = (param2 & 16711935) * param9 & -16711936;
                  var13 = (param2 & 65280) * param9 & 16711680;
                  var14 = (var12 | var13) >>> 8;
                  if (var14 != 0) {
                    incrementValue$13 = param4;
                    param4++;
                    param0[incrementValue$13] = var14;
                    var11++;
                    continue L1;
                  } else {
                    incrementValue$14 = param4;
                    param4++;
                    param0[incrementValue$14] = 65793;
                    var11++;
                    continue L1;
                  }
                }
              }
            }
          }
        }
    }

    final static void a(kp param0, String param1, String param2, int param3, int param4, int param5, int param6) {
        double var12 = 0.0;
        int var14 = 0;
        double var7 = (double)nj.a(120);
        param1 = dn.a(param1, false);
        param2 = dn.a(param2, false);
        int var9 = param0.field_o;
        if (var9 < 0 && param0.field_f >= 5) {
            var9 = param0.field_d ? 1 - param0.field_k : param0.field_k;
        }
        int var10 = var9 == 1 ? 5592405 : 16777215;
        int var11 = var9 == 0 ? 5592405 : 16777215;
        on.a(param3, param4, param5 - 20, param6 - 2 >> 1, 65793, 128);
        on.a(param3 + param5 - 19, param4, 20, param6 - 2 >> 1, 65793, 128);
        pt.a(param3 + param5 - 20, -22914, param3, param4 + param6, param4);
        if (un.field_d.a(param2) > param5 - 20) {
            var12 = (double)(pb.field_C.a(param2) - (param5 - 30));
            var14 = -(int)(Math.sin(var7 / 1000.0) * var12 + var12 / 2.0);
            pb.field_C.a(param2, param3 + 8 + var14, param4 + (param6 >> 1) - 3, var11, -1);
        } else {
            pb.field_C.a(param2, param3 + 8, param4 + (param6 >> 1) - 3, var11, -1);
        }
        ta.e(125);
        pb.field_C.d(Integer.toString(param0.field_b), param3 + param5 - 8, param4 + (param6 >> 1) - 3, var11, -1);
        if (var9 == 0) {
            on.e(param3 + 2, param4 + (param6 >> 2), param3 + param5 - 1, param4 + (param6 >> 2), 11141377, 196);
            on.e(param3 + 2, param4 + (param6 >> 2) - 1, param3 + param5 - 1, param4 + (param6 >> 2) - 1, 11141377, 196);
        }
        on.a(param3, param4 + (param6 >> 1), param5 - 20, param6 - 2 >> 1, 65793, 128);
        on.a(param3 + param5 - 19, param4 + (param6 >> 1), 20, param6 - 2 >> 1, 65793, 128);
        pt.a(param3 + param5 - 20, -22914, param3, param4 + param6, param4);
        if (un.field_d.a(param1) > param5 - 20) {
            var12 = (double)(pb.field_C.a(param1) - (param5 - 30));
            var14 = -(int)(Math.sin(var7 / 1000.0) * var12 + var12 / 2.0);
            pb.field_C.a(param1, param3 + 8 + var14, param4 + param6 - 3, var10, -1);
        } else {
            pb.field_C.a(param1, param3 + 8, param4 + param6 - 3, var10, -1);
        }
        ta.e(124);
        pb.field_C.d(Integer.toString(param0.field_j), param3 + param5 - 8, param4 + param6 - 3, var10, -1);
        if (var9 == 1) {
            on.e(param3 + 2, param4 + 3 * (param6 >> 2), param3 + param5 - 1, param4 + 3 * (param6 >> 2), 11141377, 196);
            on.e(param3 + 2, param4 + 3 * (param6 >> 2) - 1, param3 + param5 - 1, param4 + 3 * (param6 >> 2) - 1, 11141377, 196);
            return;
        }
    }

    private final static void a(int[] param0, byte[] param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        var8 = -param4;
        var9 = -param5;
        L0: while (true) {
          if (var9 >= 0) {
            return;
          } else {
            var10 = var8;
            L1: while (true) {
              if (var10 >= 0) {
                param3 = param3 + param6;
                param2 = param2 + param7;
                var9++;
                continue L0;
              } else {
                incrementValue$11 = param2;
                param2++;
                var11 = param1[incrementValue$11] & 255;
                if (var11 == 0) {
                  param3++;
                  var10++;
                  continue L1;
                } else {
                  var12 = 256 - var11;
                  var13 = param0[param3];
                  incrementValue$12 = param3;
                  param3++;
                  param0[incrementValue$12] = (16711935 * var11 + (var13 & 16711935) * var12 & -16711936) + (65280 * var11 + (var13 & 65280) * var12 & 16711680) >>> 8;
                  var10++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final static void b(int param0, int param1, int param2, int param3) {
        on.c(param0, param1, param2, param3);
        on.f(param0 - param2, param1, param2 << 1, param3);
        on.a(param0, param1 - param2, param2 << 1, param3);
    }

    final static hd a(boolean param0, int param1) {
        ot[] var2 = param0 ? field_c[param1] : field_r[param1];
        hd var3 = new hd();
        var3.field_N = (ut) ((Object) var2[0].h());
        var3.field_vb = (ut) ((Object) var2[1].h());
        var3.field_r = (ut) ((Object) var2[2].h());
        var3.field_t = (ut) ((Object) var2[3].h());
        var3.field_q = var2[0].field_o;
        var3.field_mb = var2[0].field_v;
        return var3;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        eo.a(param0, param1, param2, true);
        eo.a(param0, param1, param2 - param3, false);
    }

    private final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var7 = 0;
        for (var7 = 0; var7 < 100; var7++) {
            var8 = (var7 & 3) == param3 ? param6 : 256;
            var9 = ((param2 & 16711935) * var8 & -16711936 | (param2 & 65280) * var8 & 16711680) >> 8;
            on.a(param0 + var7, param1, 11, var9);
        }
        for (var7 = 0; var7 < 3; var7++) {
            on.h(param0 + var7 - 1, param1 + var7 - 1, 100 - var7 - var7 + 1, 11 - var7 - var7 + 1, 65793, (3 - var7) * param4);
        }
        var7 = param5 * 65793;
        on.d(param0, param1, 100, 2, 0, var7);
        on.d(param0, param1 + 2, 100, 4, var7, 0);
    }

    private final static void b(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int incrementValue$0 = 0;
        int var9 = 0;
        int var10 = 0;
        int incrementValue$1 = 0;
        for (var8 = -param7; var8 < 0; var8++) {
            incrementValue$0 = param3;
            param3++;
            param2 = param1[incrementValue$0];
            for (var9 = -param6; var9 < 0; var9++) {
                var10 = param0[param4];
                incrementValue$1 = param4;
                param4++;
                param0[incrementValue$1] = ((param2 & 16711935) * 15 + (var10 & 16711935) & 267390960) + ((param2 & 65280) * 15 + (var10 & 65280) & 1044480) >> 4;
            }
            param4 = param4 + param5;
        }
    }

    final static void a() {
        int stackIn_20_0 = 0;
        Object stackIn_23_0 = null;
        int stackIn_26_0 = 0;
        int var0_int;
        String var0;
        int var1;
        Object var2;
        int var3;
        int var4;
        int var5;
        int var6;
        ut var7;
        field_r = new ot[3][4];
        field_c = new ot[3][4];
        var0_int = 0;
        L0: while (true) {
          if (var0_int >= 3) {
            var0_int = 0;
            L1: while (true) {
              if (var0_int >= 3) {
                field_l = new ut[3];
                var0_int = 0;
                L2: while (true) {
                  if (var0_int >= 3) {
                    L3: {
                      nh.a(field_l[0], 0.321875, 1.0, 1.0);
                      nh.a(field_l[2], 0.74375, 1.0, 1.0);
                      var0 = mc.field_f.toLowerCase();
                      if (vv.field_r != 3) {
                        if (vv.field_r != 2) {
                          if (vv.field_r == 1) {
                            stackIn_20_0 = 1;
                            break L3;
                          } else {
                            stackIn_20_0 = 0;
                            break L3;
                          }
                        } else {
                          stackIn_20_0 = 1;
                          break L3;
                        }
                      } else {
                        stackIn_20_0 = 1;
                        break L3;
                      }
                    }
                    L4: {
                      var1 = stackIn_20_0;
                      if (var1 == 0) {
                        stackIn_23_0 = un.field_d;
                        break L4;
                      } else {
                        stackIn_23_0 = q.field_d;
                        break L4;
                      }
                    }
                    L5: {
                      var2 = stackIn_23_0;
                      if (var1 == 0) {
                        stackIn_26_0 = 24;
                        break L5;
                      } else {
                        stackIn_26_0 = 12;
                        break L5;
                      }
                    }
                    var3 = stackIn_26_0;
                    var4 = ((hu) (var2)).a(var0) + var3;
                    field_n = new ut[4];
                    var5 = 0;
                    L6: while (true) {
                      if (var5 >= 4) {
                        field_g = new ut(102, 13);
                        iw.a(-67, field_g);
                        eo.a(1, 1, 10066329, 2, 20, 0, 200);
                        on.e(0, 0, on.field_g, on.field_f, 65793);
                        ta.e(124);
                        field_h = new ut[4][4];
                        var5 = 0;
                        L7: while (true) {
                          if (var5 >= 4) {
                            return;
                          } else {
                            var6 = 0;
                            L8: while (true) {
                              if (var6 >= 4) {
                                var5++;
                                continue L7;
                              } else {
                                var7 = new ut(100, 11);
                                iw.a(81, var7);
                                eo.a(0, 0, pd.field_B[var5], var6, 40, 90, 160);
                                ta.e(120);
                                field_h[var5][var6] = var7;
                                var6++;
                                continue L8;
                              }
                            }
                          }
                        }
                      } else {
                        field_n[var5] = ae.a(true, (byte) -52, var5, var4, 7126504);
                        iw.a(-41, field_n[var5]);
                        ((hu) (var2)).d(var0, on.field_g >> 1, on.field_f - 8, 16777215, -1);
                        ta.e(127);
                        var5++;
                        continue L6;
                      }
                    }
                  } else {
                    field_l[var0_int] = (ut) ((Object) field_a.h());
                    field_l[var0_int].a();
                    var0_int++;
                    continue L2;
                  }
                }
              } else {
                var1 = 0;
                L9: while (true) {
                  if (var1 >= 4) {
                    var0_int++;
                    continue L1;
                  } else {
                    field_c[var0_int][var1] = field_r[var0_int][var1].h();
                    field_c[var0_int][var1].g();
                    var1++;
                    continue L9;
                  }
                }
              }
            }
          } else {
            field_r[var0_int][0] = field_k[var0_int];
            field_r[var0_int][1] = eo.b((ut) (field_r[var0_int][0]));
            field_r[var0_int][2] = field_i[var0_int];
            field_r[var0_int][3] = field_k[var0_int].h();
            nh.a(field_r[var0_int][3], 0.0, 0.0, 0.7);
            var0_int++;
            continue L0;
          }
        }
    }

    private final static hd a(String param0, int param1, hu param2) {
        int var3 = param2.a(param0) + 24;
        return eo.a(param0, param1, param2, var3, true);
    }

    private final static void a(int[] param0, byte[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int incrementValue$0 = 0;
        int var13 = 0;
        int var12 = param3;
        for (var14 = -param8; var14 < 0; var14++) {
            var15 = (param4 >> 16) * param11;
            for (var16 = -param7; var16 < 0; var16++) {
                var17 = param3 >> 16;
                param2 = param1[(var17 >> 3) + var15];
                if ((param2 & 1 << (var17 & 7)) != 0) {
                    var13 = param0[param5];
                    incrementValue$0 = param5;
                    param5++;
                    param0[incrementValue$0] = ((var13 & 16711935) * 7 & 133695480 | (var13 & 65280) * 7 & 522240) >> 3;
                } else {
                    param5++;
                }
                param3 = param3 + param9;
            }
            param4 = param4 + param10;
            param3 = var12;
            param5 = param5 + param6;
        }
    }

    final static hd b() {
        hd var0 = new hd();
        var0.field_N = field_n[0];
        var0.field_vb = field_n[1];
        var0.field_r = field_n[2];
        var0.field_t = field_n[3];
        var0.field_q = var0.field_N.field_o;
        var0.field_mb = var0.field_N.field_v;
        return var0;
    }

    final static void a(ut param0, int param1, int param2, int param3) {
        int var10 = 0;
        if (param3 == 256) {
            param0.c(param1, param2);
            return;
        }
        param1 = param1 + param0.field_s;
        param2 = param2 + param0.field_n;
        int var4 = param1 + param2 * on.field_g;
        int var5 = 0;
        int var6 = param0.field_w;
        int var7 = param0.field_q;
        int var8 = on.field_g - var7;
        int var9 = 0;
        if (param2 < on.field_e) {
            var10 = on.field_e - param2;
            var6 = var6 - var10;
            param2 = on.field_e;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * on.field_g;
        }
        if (param2 + var6 > on.field_h) {
            var6 = var6 - (param2 + var6 - on.field_h);
        }
        if (param1 < on.field_b) {
            var10 = on.field_b - param1;
            var7 = var7 - var10;
            param1 = on.field_b;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (param1 + var7 > on.field_c) {
            var10 = param1 + var7 - on.field_c;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (var7 > 0) {
            if (var6 <= 0) {
                return;
            }
            eo.a(on.field_a, param0.field_y, 0, var5, var4, var7, var6, var8, var9, param3);
            return;
        }
    }

    final static kg a(ut param0) {
        kg var1;
        int[] var2;
        int var3;
        int var4;
        int var5;
        bv.a(true, param0.field_y, 255);
        var1 = new kg(param0.field_q, param0.field_w, 256);
        var2 = var1.field_l;
        var3 = 0;
        L0: while (true) {
          if (var3 >= param0.field_y.length) {
            return var1;
          } else {
            var4 = param0.field_y[var3];
            if (var4 != 0) {
              var5 = 1;
              L1: while (true) {
                L2: {
                  if (var5 >= 256) {
                    break L2;
                  } else {
                    if (var2[var5] == 0) {
                      break L2;
                    } else {
                      if (var4 == var2[var5]) {
                        break L2;
                      } else {
                        var5++;
                        continue L1;
                      }
                    }
                  }
                }
                var2[var5] = var4;
                var1.field_m[var3] = (byte)var5;
                var3++;
                continue L0;
              }
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    private final static ot b(ut param0) {
        ot var1 = ((ot) ((Object) param0)).h();
        iw.a(-112, var1);
        param0.c(0, 0, 90);
        ta.e(117);
        return var1;
    }

    final static void b(byte[] param0, int param1, int param2, int param3, int param4) {
        int var10 = 0;
        int var5 = param1 + param2 * on.field_g;
        int var6 = 0;
        int var7 = on.field_g - param3;
        int var8 = 0;
        int var9 = 0;
        if (param2 < on.field_e) {
            var10 = on.field_e - param2;
            param4 = param4 - var10;
            param2 = on.field_e;
            var6 = var6 + var10 * (param3 >> 3);
            var5 = var5 + var10 * on.field_g;
        }
        if (param2 + param4 > on.field_h) {
            param4 = param4 - (param2 + param4 - on.field_h);
        }
        if (param1 < on.field_b) {
            var10 = on.field_b - param1;
            param3 = param3 - var10;
            param1 = on.field_b;
            var6 = var6 + (var10 >> 3);
            var9 = (byte)(1 << (var10 & 7));
            var5 = var5 + var10;
            var8 = var8 + var10;
            var7 = var7 + var10;
        }
        if (param1 + param3 > on.field_c) {
            var10 = param1 + param3 - on.field_c;
            param3 = param3 - var10;
            var8 = var8 + var10;
            var7 = var7 + var10;
        }
        if (param3 > 0) {
            if (param4 <= 0) {
                return;
            }
            eo.a(on.field_a, param0, (byte) 0, (byte) var9, var6, var5, param3, param4, var7, var8 >> 3);
            return;
        }
    }

    private final static void c(int param0, int param1, int param2, int param3, int param4) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        if (param0 < on.field_b) {
          return;
        } else {
          if (param0 < on.field_c) {
            L0: {
              if (param1 >= on.field_e) {
                break L0;
              } else {
                param2 = param2 - (on.field_e - param1);
                param1 = on.field_e;
                break L0;
              }
            }
            L1: {
              if (param1 + param2 <= on.field_h) {
                break L1;
              } else {
                param2 = on.field_h - param1;
                break L1;
              }
            }
            var5 = 256 - param4;
            var6 = (param3 >> 16 & 255) * param4;
            var7 = (param3 >> 8 & 255) * param4;
            var8 = (param3 & 255) * param4;
            var12 = param0 + param1 * on.field_g;
            var13 = 0;
            L2: while (true) {
              if (var13 >= param2) {
                return;
              } else {
                if ((var13 & 2) != 0) {
                  var9 = (on.field_a[var12] >> 16 & 255) * var5;
                  var10 = (on.field_a[var12] >> 8 & 255) * var5;
                  var11 = (on.field_a[var12] & 255) * var5;
                  var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                  on.field_a[var12] = var14;
                  var12 = var12 + on.field_g;
                  var13++;
                  continue L2;
                } else {
                  var12 = var12 + on.field_g;
                  var13++;
                  continue L2;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    final static hd a(String param0, int param1, hu param2, int param3, boolean param4) {
        int var6_int = 0;
        int var7 = 0;
        param0 = param0.toLowerCase();
        ut[] var5 = new ut[4];
        for (var6_int = 0; var6_int < 4; var6_int++) {
            var5[var6_int] = ae.a(param4, (byte) -52, var6_int, param3, param1);
            iw.a(-52, var5[var6_int]);
            var7 = param4 ? 8 : 9;
            param2.d(param0, on.field_g >> 1, on.field_f - var7, 16777215, -1);
            ta.e(122);
        }
        hd var6 = new hd();
        var6.field_N = var5[0];
        var6.field_vb = var5[1];
        var6.field_r = var5[2];
        var6.field_t = var5[3];
        var6.field_q = var6.field_N.field_o;
        var6.field_mb = var6.field_N.field_v;
        return var6;
    }

    final static byte[] a(int[] param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var4 = 256 - (param2 - param1 << 8) / param2;
        ot var5 = new ot(param3, param3);
        iw.a(-38, var5);
        on.a(on.field_g << 3, on.field_f << 3, on.field_g << 3, param0.length - 1, param0);
        ta.e(122);
        byte[] var6 = new byte[var5.field_y.length];
        for (var7 = 0; var7 < var6.length; var7++) {
            var8 = var5.field_y[var7];
            for (var9 = 0; var9 < 3 - (var4 >> 6); var9++) {
                var8 = var8 * var8 >> 8;
            }
            var6[var7] = (byte)(var8 * var4 >> 8);
        }
        return var6;
    }

    final static ot b(ot param0) {
        int var5 = 0;
        int var6 = 0;
        int incrementValue$0 = 0;
        int var1 = param0.field_o;
        int var2 = param0.field_v;
        ot var3 = new ot(var1, var2);
        int var4 = 0;
        for (var5 = 0; var5 < var2; var5++) {
            for (var6 = 0; var6 < var1; var6++) {
                incrementValue$0 = var4;
                var4++;
                var3.field_y[(var2 - var5 - 1) * var1 + var6] = param0.field_y[incrementValue$0];
            }
        }
        return var3;
    }

    final static void a(byte[] param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var13 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = (param3 << 16) / param5;
        int var10 = (param4 << 16) / param6;
        int var11 = param1 + param2 * on.field_g;
        int var12 = on.field_g - param5;
        if (param2 + param6 > on.field_h) {
            param6 = param6 - (param2 + param6 - on.field_h);
        }
        if (param2 < on.field_e) {
            var13 = on.field_e - param2;
            param6 = param6 - var13;
            var11 = var11 + var13 * on.field_g;
            var8 = var8 + var10 * var13;
        }
        if (param1 + param5 > on.field_c) {
            var13 = param1 + param5 - on.field_c;
            param5 = param5 - var13;
            var12 = var12 + var13;
        }
        if (param1 < on.field_b) {
            var13 = on.field_b - param1;
            param5 = param5 - var13;
            var11 = var11 + var13;
            var7 = var7 + var9 * var13;
            var12 = var12 + var13;
        }
        eo.a(on.field_a, param0, 0, var7, var8, var11, var12, param5, param6, var9, var10, param3 >> 3);
    }

    final static void c(int param0, int param1, int param2, int param3) {
        int var6 = 0;
        int var7 = 0;
        int incrementValue$0 = 0;
        int fieldTemp$1 = 0;
        int var4 = on.field_g * param1 + param0;
        int var5 = on.field_g - param2;
        for (var6 = 0; var6 < param3; var6++) {
            for (var7 = 0; var7 < param2; var7++) {
                incrementValue$0 = var4;
                var4++;
                fieldTemp$1 = field_e;
                field_e = field_e + 1;
                on.field_a[incrementValue$0] = on.field_a[incrementValue$0] | field_o[fieldTemp$1 % 307];
            }
            var4 = var4 + var5;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5) {
        ut var6_ref_ut = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        StringBuilder var10 = null;
        StringBuilder discarded$12 = null;
        StringBuilder discarded$25 = null;
        StringBuilder discarded$38 = null;
        StringBuilder discarded$39 = null;
        StringBuilder discarded$40 = null;
        StringBuilder discarded$41 = null;
        StringBuilder discarded$42 = null;
        if (param2 > 100) {
            var6_ref_ut = new ut(102, 13);
            iw.a(73, var6_ref_ut);
            eo.a(0, 0, param2 - 100, param3, false, 0);
            ta.e(126);
            var6_ref_ut.b(param0 + 3, param1 + 7, 128);
            param5 = param5 + (param2 - 100);
            param2 = 100;
        }
        int var6 = (int)(nj.a(74) % 220L);
        var6 = (var6 << 2) / 220;
        field_g.d(param0 - 1, param1 - 1);
        pt.a(param0 + param2, -22914, param0, param1 + 11, param1);
        field_h[param3][var6].d(param0, param1);
        ta.e(127);
        on.e(param0 - 1, param1 - 1, 102, 13, 65793);
        if (param4) {
            iw.a(-38, field_d);
            on.b();
            var7 = 131586;
            var8 = 10;
            var9 = 54 - (param5 != 0 ? var8 : 0);
            q.field_d.c(nn.field_G[param3], var9, 10, 16777215, var7);
            var10 = new StringBuilder(Integer.toString(param2));
            if (param5 != 0) {
                discarded$12 = var10.append("<col=");
                discarded$25 = var10.append(param5 < 0 ? "ffaaaa" : "ccff99");
                discarded$38 = var10.append('>');
                discarded$39 = var10.append(param5 < 0 ? '-' : '+');
                discarded$40 = var10.append(Math.abs(param5));
                discarded$41 = var10.append("</col>");
            }
            discarded$42 = var10.append('%');
            q.field_d.a(var10.toString(), var9 + 4, 10, 16777215, var7);
            ta.e(127);
            eo.a(field_d, 65793);
            field_d.c(param0, param1);
            return;
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        Random var2 = new Random();
        for (var3 = 0; var3 < field_o.length; var3++) {
            field_o[var3] = param0 + dq.a((byte) 113, param1, var2) << 24;
        }
    }

    final static int a(int param0, int param1, String[] param2, int[][] param3, String[] param4, int param5, int param6, int param7, String[] param8, int param9) {
        cn stackIn_12_0;
        String stackIn_12_1;
        int stackIn_12_2;
        int stackIn_12_3;
        cn stackIn_13_0;
        String stackIn_13_1;
        int stackIn_13_2;
        int stackIn_13_3;
        int stackIn_13_4;
        int stackIn_18_0 = 0;
        cn stackIn_22_0;
        String stackIn_22_1;
        int stackIn_22_2;
        int stackIn_22_3;
        cn stackIn_23_0;
        String stackIn_23_1;
        int stackIn_23_2;
        int stackIn_23_3;
        int stackIn_23_4;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        String var21;
        int var22;
        int var23;
        String var24;
        String var25;
        var10 = param0;
        var11 = 64;
        var12 = 60;
        var13 = 60;
        var14 = param2.length;
        var15 = 128;
        var16 = 65793;
        var17 = 4;
        var18 = 0;
        L0: while (true) {
          if (var18 >= var14) {
            param0 = var10;
            var18 = param5;
            param1 = param1 + var17;
            var19 = 0;
            L1: while (true) {
              if (var19 >= param7) {
                var19 = 0;
                L2: while (true) {
                  if (var19 >= 16) {
                    return param1;
                  } else {
                    var20 = 0;
                    L3: while (true) {
                      if (var20 >= var14) {
                        on.c(param0 - var18 - var17, param1 + param7 * (param6 + var17) + var19, var18, 65793, 128 - (var19 << 3));
                        var19++;
                        continue L2;
                      } else {
                        on.c(param0 + var20 * (var11 + var17), param1 + param7 * (param6 + var17) + var19, var11, 65793, 128 - (var19 << 3));
                        var20++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                L4: {
                  var20 = var16;
                  if (var19 != param9) {
                    break L4;
                  } else {
                    var20 = 11184810;
                    break L4;
                  }
                }
                L5: {
                  on.a(param0 - var18 - var17, param1 + var19 * (param6 + var17), var18, param6, var20, var15);
                  var21 = param8[var19].toLowerCase();
                  stackIn_12_0 = un.field_d;

                  stackIn_12_1 = (String) (var21);

                  stackIn_12_2 = param0 - (var18 >> 1);

                  stackIn_12_3 = param1 + var19 * (param6 + var17) + (param6 + var17 + 5 >> 1);

                  if (var19 != param9) {
                    stackIn_13_0 = (cn) ((Object) stackIn_12_0);
                    stackIn_13_1 = (String) ((Object) stackIn_12_1);
                    stackIn_13_2 = stackIn_12_2;
                    stackIn_13_3 = stackIn_12_3;
                    stackIn_13_4 = 11184810;
                    break L5;
                  } else {
                    stackIn_13_0 = (cn) ((Object) stackIn_12_0);
                    stackIn_13_1 = (String) ((Object) stackIn_12_1);
                    stackIn_13_2 = stackIn_12_2;
                    stackIn_13_3 = stackIn_12_3;
                    stackIn_13_4 = 16777215;
                    break L5;
                  }
                }
                ((cn) (Object) stackIn_13_0).d(stackIn_13_1, stackIn_13_2, stackIn_13_3, stackIn_13_4, -1);
                var22 = 0;
                L6: while (true) {
                  if (var22 >= var14) {
                    var19++;
                    continue L1;
                  } else {
                    L7: {
                      on.a(param0 + var22 * (var11 + var17), param1 + var19 * (param6 + var17), var11, param6, var20, var15);
                      if (param3 != null) {
                        stackIn_18_0 = param3[var19][var22];
                        break L7;
                      } else {
                        stackIn_18_0 = -1;
                        break L7;
                      }
                    }
                    L8: {
                      var23 = stackIn_18_0;
                      var25 = Integer.toString(var23);
                      var24 = var25;
                      if (param4 == null) {
                        break L8;
                      } else {
                        var24 = var25 + param4[var22];
                        break L8;
                      }
                    }
                    L9: {
                      stackIn_22_0 = un.field_d;

                      stackIn_22_1 = (String) (var24);

                      stackIn_22_2 = param0 + (var22 + 1) * (var11 + var17) - (var11 + var17 >> 1);

                      stackIn_22_3 = param1 + var19 * (param6 + var17) + (param6 + var17 + 5 >> 1);

                      if (var19 != param9) {
                        stackIn_23_0 = (cn) ((Object) stackIn_22_0);
                        stackIn_23_1 = (String) ((Object) stackIn_22_1);
                        stackIn_23_2 = stackIn_22_2;
                        stackIn_23_3 = stackIn_22_3;
                        stackIn_23_4 = 11184810;
                        break L9;
                      } else {
                        stackIn_23_0 = (cn) ((Object) stackIn_22_0);
                        stackIn_23_1 = (String) ((Object) stackIn_22_1);
                        stackIn_23_2 = stackIn_22_2;
                        stackIn_23_3 = stackIn_22_3;
                        stackIn_23_4 = 16777215;
                        break L9;
                      }
                    }
                    ((cn) (Object) stackIn_23_0).d(stackIn_23_1, stackIn_23_2, stackIn_23_3, stackIn_23_4, -1);
                    var22++;
                    continue L6;
                  }
                }
              }
            }
          } else {
            var19 = 0;
            L10: while (true) {
              if (var19 >= var11) {
                eo.a(param2[var18], un.field_d, param0, param1 - (var12 >> 1), var11, var12, 16777215, 8192);
                param0 = param0 + var17;
                var18++;
                continue L0;
              } else {
                on.e(param0, param1, param0 + var13, param1 - var12, var16, var15);
                param0++;
                var19++;
                continue L10;
              }
            }
          }
        }
    }

    final static hd a(String param0, int param1) {
        return eo.a(param0, param1, un.field_d);
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var10 = 0;
        int incrementValue$0 = 0;
        int var11 = 0;
        int var12 = 0;
        int incrementValue$1 = 0;
        int var9 = 256 - param8;
        for (var10 = -param7; var10 < 0; var10++) {
            incrementValue$0 = param3;
            param3++;
            param2 = param1[incrementValue$0];
            for (var11 = -param6; var11 < 0; var11++) {
                var12 = param0[param4];
                incrementValue$1 = param4;
                param4++;
                param0[incrementValue$1] = ((param2 & 16711935) * param8 + (var12 & 16711935) * var9 & -16711936) + ((param2 & 65280) * param8 + (var12 & 65280) * var9 & 16711680) >> 8;
            }
            param4 = param4 + param5;
        }
    }

    private final static void a(int[] param0, byte[] param1, byte param2, byte param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var12 = 0;
        int incrementValue$0 = 0;
        int var13 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int var11 = 0;
        int var10 = param3;
        if (var10 == 0) {
            var10 = 1;
        }
        for (var12 = -param7; var12 < 0; var12++) {
            incrementValue$0 = param4;
            param4++;
            param2 = param1[incrementValue$0];
            param3 = (byte) var10;
            for (var13 = -param6; var13 < 0; var13++) {
                if (param3 == 0) {
                    param3 = (byte) 1;
                    incrementValue$1 = param4;
                    param4++;
                    param2 = param1[incrementValue$1];
                }
                if ((param2 & param3) != 0) {
                    var11 = param0[param5];
                    incrementValue$2 = param5;
                    param5++;
                    param0[incrementValue$2] = ((var11 & 16711935) * 7 & 133695480 | (var11 & 65280) * 7 & 522240) >> 3;
                } else {
                    param5++;
                }
                param3 = (byte)(param3 << 1);
            }
            param5 = param5 + param8;
            param4 = param4 + param9;
        }
    }

    final static void a(byte[] param0, int param1, int param2, int param3) {
        int var10 = 0;
        int var4 = param1 + param2 * on.field_g;
        int var5 = 0;
        int var6 = param3;
        int var7 = param3;
        int var8 = on.field_g - var7;
        int var9 = 0;
        if (param2 < on.field_e) {
            var10 = on.field_e - param2;
            var6 = var6 - var10;
            param2 = on.field_e;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * on.field_g;
        }
        if (param2 + var6 > on.field_h) {
            var6 = var6 - (param2 + var6 - on.field_h);
        }
        if (param1 < on.field_b) {
            var10 = on.field_b - param1;
            var7 = var7 - var10;
            param1 = on.field_b;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (param1 + var7 > on.field_c) {
            var10 = param1 + var7 - on.field_c;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (var7 > 0) {
            if (var6 <= 0) {
                return;
            }
            eo.a(on.field_a, param0, var5, var4, var7, var6, var8, var9);
            return;
        }
    }

    private final static void a(int param0, int param1, int param2, int param3, int param4) {
        int incrementValue$0 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        if (param1 < on.field_e) {
          return;
        } else {
          if (param1 < on.field_h) {
            L0: {
              if (param0 >= on.field_b) {
                break L0;
              } else {
                param2 = param2 - (on.field_b - param0);
                param0 = on.field_b;
                break L0;
              }
            }
            L1: {
              if (param0 + param2 <= on.field_c) {
                break L1;
              } else {
                param2 = on.field_c - param0;
                break L1;
              }
            }
            var5 = 256 - param4;
            var6 = (param3 >> 16 & 255) * param4;
            var7 = (param3 >> 8 & 255) * param4;
            var8 = (param3 & 255) * param4;
            var12 = param0 + param1 * on.field_g;
            var13 = 0;
            L2: while (true) {
              if (var13 >= param2) {
                return;
              } else {
                if ((var13 & 2) != 0) {
                  var9 = (on.field_a[var12] >> 16 & 255) * var5;
                  var10 = (on.field_a[var12] >> 8 & 255) * var5;
                  var11 = (on.field_a[var12] & 255) * var5;
                  var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                  incrementValue$0 = var12;
                  var12++;
                  on.field_a[incrementValue$0] = var14;
                  var13++;
                  continue L2;
                } else {
                  var12++;
                  var13++;
                  continue L2;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    private final static void a(int param0, int param1, int param2, int param3, int[] param4, int[] param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        long var17 = 0L;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int incrementValue$0 = 0;
        int var16 = param3;
        while (param8 < 0) {
            param7 = (param9 >> 16) * param15;
            for (param6 = -param12; param6 < 0; param6++) {
                param0 = param4[(param3 >> 16) + param7];
                if (param0 != 0) {
                    param1 = param5[param10];
                    var17 = (long)(param0 & 16711935) * (long)(param1 & 16711935);
                    var19 = (int)(var17 >> 24) & 16711680;
                    var20 = ((param0 & 65280) >> 8) * (param1 & 65280) & 16711680;
                    var21 = (int)var17 & 65280;
                    incrementValue$0 = param10;
                    param10++;
                    param5[incrementValue$0] = var19 | (var20 | var21) >>> 8;
                } else {
                    param10++;
                }
                param3 = param3 + param13;
            }
            param9 = param9 + param14;
            param3 = var16;
            param10 = param10 + param11;
            param8++;
        }
    }

    private final static void a(int[] param0, byte[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var17 = 0;
        int incrementValue$0 = 0;
        int var16 = 0;
        int var11 = param2;
        for (var12 = -param7; var12 < 0; var12++) {
            var13 = (param3 >> 16) * param10;
            for (var14 = -param6; var14 < 0; var14++) {
                var15 = param1[(param2 >> 16) + var13] & 255;
                if (var15 != 0) {
                    var16 = 256 - var15;
                    var17 = param0[param4];
                    incrementValue$0 = param4;
                    param4++;
                    param0[incrementValue$0] = (16711935 * var15 + (var17 & 16711935) * var16 & -16711936) + (65280 * var15 + (var17 & 65280) * var16 & 16711680) >>> 8;
                } else {
                    param4++;
                }
                param2 = param2 + param8;
            }
            param3 = param3 + param9;
            param2 = var11;
            param4 = param4 + param5;
        }
    }

    final static void a(ut param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int var13 = 0;
        int var15 = 0;
        if (param3 > 0) {
            if (param4 <= 0) {
                return;
            }
            var5 = param0.field_q;
            var6 = param0.field_w;
            var7 = 0;
            var8 = 0;
            var9 = param0.field_o;
            var10 = param0.field_v;
            var11 = (var9 << 16) / param3;
            var12 = (var10 << 16) / param4;
            if (param0.field_s > 0) {
                var13 = ((param0.field_s << 16) + var11 - 1) / var11;
                param1 = param1 + var13;
                var7 = var7 + (var13 * var11 - (param0.field_s << 16));
            }
            if (param0.field_n > 0) {
                var13 = ((param0.field_n << 16) + var12 - 1) / var12;
                param2 = param2 + var13;
                var8 = var8 + (var13 * var12 - (param0.field_n << 16));
            }
            if (var5 < var9) {
                param3 = ((var5 << 16) - var7 + var11 - 1) / var11;
            }
            if (var6 < var10) {
                param4 = ((var6 << 16) - var8 + var12 - 1) / var12;
            }
            var13 = param1 + param2 * on.field_g;
            var14 = on.field_g - param3;
            if (param2 + param4 > on.field_h) {
                param4 = param4 - (param2 + param4 - on.field_h);
            }
            if (param2 < on.field_e) {
                var15 = on.field_e - param2;
                param4 = param4 - var15;
                var13 = var13 + var15 * on.field_g;
                var8 = var8 + var12 * var15;
            }
            if (param1 + param3 > on.field_c) {
                var15 = param1 + param3 - on.field_c;
                param3 = param3 - var15;
                var14 = var14 + var15;
            }
            if (param1 < on.field_b) {
                var15 = on.field_b - param1;
                param3 = param3 - var15;
                var13 = var13 + var15;
                var7 = var7 + var11 * var15;
                var14 = var14 + var15;
            }
            eo.a(0, 0, 0, var7, param0.field_y, on.field_a, 0, 0, -param4, var8, var13, var14, param3, var11, var12, var5);
            return;
        }
    }

    final static byte[] a(int[] param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        ot var6;
        byte[] var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        var3 = (param2 - param1) * 3000 / param2 + 1092;
        var4 = var3 * var3 >> 8;
        var5 = var3 * var3 >> 12;
        var6 = new ot(72, 72);
        iw.a(-115, var6);
        on.a(on.field_g << 3, on.field_f << 3, on.field_g << 3, param0.length - 1, param0);
        ta.e(119);
        var7 = new byte[var6.field_y.length];
        var8 = 0;
        var9 = -36;
        L0: while (true) {
          if (var9 >= 36) {
            return var7;
          } else {
            var10 = -36;
            L1: while (true) {
              if (var10 >= 36) {
                var9++;
                continue L0;
              } else {
                var11 = var6.field_y[var8];
                if (var11 != 0) {
                  L2: {
                    var12 = uv.b(var9, var10, (byte) 2) + 8192 + 2048 & 8191;
                    if (eo.a(var12, var4, var5)) {
                      break L2;
                    } else {
                      if (eo.a(var12, var4 + 4096, var5)) {
                        break L2;
                      } else {
                        var8++;
                        var10++;
                        continue L1;
                      }
                    }
                  }
                  var13 = Math.min(255, Math.min(Math.min(Math.abs((var4 + 4096 & 8191) - var12), Math.abs((var4 + var5 + 4096 & 8191) - var12)), Math.min(Math.abs((var4 & 8191) - var12), Math.abs((var4 + var5 & 8191) - var12))));
                  var7[var8] = (byte)(var11 * var13 >> 8);
                  var8++;
                  var10++;
                  continue L1;
                } else {
                  var8++;
                  var10++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final static void a(ut param0, ut param1, int param2) {
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        L0: {
          var3 = param2;
          var4 = 0;
          var5 = param0.field_v;
          var6 = param0.field_o;
          var7 = 640 - var6;
          var8 = 0;
          if (param2 >= on.field_b) {
            break L0;
          } else {
            var9 = on.field_b - param2;
            var6 = var6 - var9;
            param2 = on.field_b;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L0;
          }
        }
        L1: {
          if (param2 + var6 <= on.field_c) {
            break L1;
          } else {
            var9 = param2 + var6 - on.field_c;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L1;
          }
        }
        if (var6 <= 0) {
          return;
        } else {
          if (var5 > 0) {
            var9 = -var5;
            L2: while (true) {
              if (var9 >= 0) {
                return;
              } else {
                var10 = -var6;
                L3: while (true) {
                  if (var10 >= 0) {
                    var3 = var3 + var7;
                    var4 = var4 + var8;
                    var9++;
                    continue L2;
                  } else {
                    if (param1.field_y[var4] == 0) {
                      incrementValue$14 = var4;
                      var4++;
                      param0.field_y[incrementValue$14] = 0;
                      var3++;
                      var10++;
                      continue L3;
                    } else {
                      incrementValue$15 = var4;
                      var4++;
                      incrementValue$16 = var3;
                      var3++;
                      param0.field_y[incrementValue$15] = on.field_a[incrementValue$16];
                      var10++;
                      continue L3;
                    }
                  }
                }
              }
            }
          } else {
            return;
          }
        }
    }

    final static ot a(ot param0) {
        int var5 = 0;
        int var6 = 0;
        int incrementValue$0 = 0;
        int var1 = param0.field_o;
        int var2 = param0.field_v;
        ot var3 = new ot(var1, var2);
        int var4 = 0;
        for (var5 = 0; var5 < var2; var5++) {
            for (var6 = 0; var6 < var1; var6++) {
                incrementValue$0 = var4;
                var4++;
                var3.field_y[var5 * var1 + (var1 - var6 - 1)] = param0.field_y[incrementValue$0];
            }
        }
        return var3;
    }

    final static void a(ut param0, int param1) {
        int incrementValue$1 = 0;
        int var2;
        int[] var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int[] var9;
        int[] var10;
        var2 = 0;
        var10 = param0.field_y;
        var9 = var10;
        var3 = var9;
        var4 = param0.field_w;
        var5 = param0.field_q;
        var6 = 0;
        L0: while (true) {
          if (var6 >= var4) {
            return;
          } else {
            var7 = 0;
            L1: while (true) {
              if (var7 >= var5) {
                var6++;
                continue L0;
              } else {
                L2: {
                  var8 = var10[var2];
                  if (var8 != 0) {
                    break L2;
                  } else {
                    L3: {
                      if (var7 <= 0) {
                        break L3;
                      } else {
                        if (var3[var2 - 1] == 0) {
                          break L3;
                        } else {
                          if (var3[var2 - 1] == param1) {
                            break L3;
                          } else {
                            var8 = param1;
                            break L2;
                          }
                        }
                      }
                    }
                    L4: {
                      if (var6 <= 0) {
                        break L4;
                      } else {
                        if (var3[var2 - var5] == 0) {
                          break L4;
                        } else {
                          if (var3[var2 - var5] == param1) {
                            break L4;
                          } else {
                            var8 = param1;
                            break L2;
                          }
                        }
                      }
                    }
                    L5: {
                      if (var7 >= var5 - 1) {
                        break L5;
                      } else {
                        if (var3[var2 + 1] == 0) {
                          break L5;
                        } else {
                          if (var3[var2 + 1] == param1) {
                            break L5;
                          } else {
                            var8 = param1;
                            break L2;
                          }
                        }
                      }
                    }
                    if (var6 >= var4 - 1) {
                      break L2;
                    } else {
                      if (var3[var2 + var5] == 0) {
                        break L2;
                      } else {
                        if (var3[var2 + var5] == param1) {
                          break L2;
                        } else {
                          var8 = param1;
                          break L2;
                        }
                      }
                    }
                  }
                }
                incrementValue$1 = var2;
                var2++;
                var3[incrementValue$1] = var8;
                var7++;
                continue L1;
              }
            }
          }
        }
    }

    final static void a(byte[] param0, int param1, int param2, int param3, int param4) {
        int var19 = 0;
        int var5 = param4;
        int var6 = param4;
        int var7 = param3;
        int var8 = param3;
        int var9 = param3;
        int var10 = param3;
        int var11 = 0;
        int var12 = 0;
        int var13 = var7;
        int var14 = var8;
        int var15 = (var13 << 16) / var5;
        int var16 = (var14 << 16) / var6;
        if (var9 < var13) {
            var5 = ((var9 << 16) - var11 + var15 - 1) / var15;
        }
        if (var10 < var14) {
            var6 = ((var10 << 16) - var12 + var16 - 1) / var16;
        }
        int var17 = param1 + param2 * on.field_g;
        int var18 = on.field_g - var5;
        if (param2 + var6 > on.field_h) {
            var6 = var6 - (param2 + var6 - on.field_h);
        }
        if (param2 < on.field_e) {
            var19 = on.field_e - param2;
            var6 = var6 - var19;
            var17 = var17 + var19 * on.field_g;
            var12 = var12 + var16 * var19;
        }
        if (param1 + var5 > on.field_c) {
            var19 = param1 + var5 - on.field_c;
            var5 = var5 - var19;
            var18 = var18 + var19;
        }
        if (param1 < on.field_b) {
            var19 = on.field_b - param1;
            var5 = var5 - var19;
            var17 = var17 + var19;
            var11 = var11 + var15 * var19;
            var18 = var18 + var19;
        }
        eo.a(on.field_a, param0, var11, var12, var17, var18, var5, var6, var15, var16, var9);
    }

    final static hd a(boolean param0) {
        return eo.a(param0, 0);
    }

    static {
        field_d = new ut(100, 11);
        field_e = 0;
        field_o = new int[307];
    }
}
