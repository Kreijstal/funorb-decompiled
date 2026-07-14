/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class so {
    static Random field_a;

    final static vn a(vn param0) {
        vn var1 = new vn(param0.field_r, param0.field_q);
        var1.a();
        bi.d();
        param0.h(0, 0, 16777215);
        so.a(12303291);
        so.a(8947848);
        so.a(4473924);
        param0.h(0, 0, 0);
        return var1;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        param0 += 2;
        param1 += 2;
        param2 -= 4;
        param3 -= 4;
        int var5 = param0 + param1 * bi.field_f;
        int var6 = bi.field_f - param2;
        so.a(bi.field_c, var5, param4, 0, 0, 0, 0, param2, param3, var6);
    }

    final static String a(String[] args) {
        return args[pb.a(field_a, args.length, 1)];
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var11 = -param6;
        L0: while (true) {
          if (var11 >= 0) {
            return;
          } else {
            var12 = -param5;
            L1: while (true) {
              if (var12 >= 0) {
                param4 = param4 + param7;
                param3 = param3 + param8;
                var11++;
                continue L0;
              } else {
                param3++;
                param2 = param1[param3];
                if (param2 == 0) {
                  param4++;
                  var12++;
                  continue L1;
                } else {
                  var9 = param0[param4];
                  var10 = 256 - (param2 & 255);
                  param4++;
                  param0[param4] = (var9 & 16711935) * var10 >> 8 & 16711935 | (var9 & 65280) * var10 >> 8 & 65280;
                  var12++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final static void b(vn param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var4 = param1 + param2 * bi.field_f;
          var5 = 0;
          var6 = param0.field_t;
          var7 = param0.field_w;
          var8 = bi.field_f - var7;
          var9 = 0;
          if (param2 >= bi.field_l) {
            break L0;
          } else {
            var10 = bi.field_l - param2;
            var6 = var6 - var10;
            param2 = bi.field_l;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * bi.field_f;
            break L0;
          }
        }
        L1: {
          if (param2 + var6 <= bi.field_d) {
            break L1;
          } else {
            var6 = var6 - (param2 + var6 - bi.field_d);
            break L1;
          }
        }
        L2: {
          if (param1 >= bi.field_g) {
            break L2;
          } else {
            var10 = bi.field_g - param1;
            var7 = var7 - var10;
            param1 = bi.field_g;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L2;
          }
        }
        L3: {
          if (param1 + var7 <= bi.field_b) {
            break L3;
          } else {
            var10 = param1 + var7 - bi.field_b;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L3;
          }
        }
        L4: {
          if (var7 <= 0) {
            break L4;
          } else {
            if (var6 > 0) {
              so.a(bi.field_c, param0.field_z, 0, var5, var4, var7, var6, var8, var9, param3);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    final static void b(vo param0) {
        le var1 = null;
        le var2 = null;
        L0: while (true) {
          if (so.a(param0)) {
            return;
          } else {
            var1 = param0.b((byte) 26);
            L1: while (true) {
              if (!(var1 instanceof fb)) {
                continue L0;
              } else {
                if (!(var1.field_b instanceof fb)) {
                  continue L0;
                } else {
                  L2: {
                    var2 = var1.field_b;
                    if (((fb) (Object) var1).field_x <= ((fb) (Object) var2).field_x) {
                      break L2;
                    } else {
                      var1.b(-27598);
                      im.a(var1, -30395, var2);
                      break L2;
                    }
                  }
                  var1 = var2;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final static void a(vn param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var3 = param1 + param2 * bi.field_f;
          var4 = 0;
          var5 = param0.field_t;
          var6 = param0.field_w;
          var7 = bi.field_f - var6;
          var8 = 0;
          if (param2 >= bi.field_l) {
            break L0;
          } else {
            var9 = bi.field_l - param2;
            var5 = var5 - var9;
            param2 = bi.field_l;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * bi.field_f;
            break L0;
          }
        }
        L1: {
          if (param2 + var5 <= bi.field_d) {
            break L1;
          } else {
            var5 = var5 - (param2 + var5 - bi.field_d);
            break L1;
          }
        }
        L2: {
          if (param1 >= bi.field_g) {
            break L2;
          } else {
            var9 = bi.field_g - param1;
            var6 = var6 - var9;
            param1 = bi.field_g;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param1 + var6 <= bi.field_b) {
            break L3;
          } else {
            var9 = param1 + var6 - bi.field_b;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L3;
          }
        }
        L4: {
          if (var6 <= 0) {
            break L4;
          } else {
            if (var5 > 0) {
              so.a(bi.field_c, param0.field_z, 0, var4, var3, var6, var5, var7, var8);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    public static void a() {
        field_a = null;
    }

    final static void a(int param0) {
        int var1 = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        vn var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        var1 = 0;
        var2 = bi.field_c;
        var3 = bi.field_f;
        var4 = bi.field_a;
        var5 = new vn(var3, var4);
        var6 = var5.field_z;
        var7 = 0;
        L0: while (true) {
          if (var7 >= var4) {
            var5.e(0, 0);
            return;
          } else {
            var8 = 0;
            L1: while (true) {
              if (var8 >= var3) {
                var7++;
                continue L0;
              } else {
                L2: {
                  if (var2[var1] != 0) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        if (var1 >= var2.length - 1) {
                          break L4;
                        } else {
                          if (var2[var1 + 1] != 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (var1 <= 1) {
                          break L5;
                        } else {
                          if (var2[var1 - 1] != 0) {
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (var1 <= var3) {
                          break L6;
                        } else {
                          if (var2[var1 - var3] != 0) {
                            break L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                      if (var1 >= var2.length - 1 - var3) {
                        break L2;
                      } else {
                        if (var2[var1 + var3] == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var1++;
                    var6[var1] = param0;
                    var8++;
                    continue L1;
                  }
                }
                var1++;
                var6[var1] = var2[var1];
                var8++;
                continue L1;
              }
            }
          }
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var12 = -param6;
        L0: while (true) {
          if (var12 >= 0) {
            return;
          } else {
            var13 = -param5;
            L1: while (true) {
              if (var13 >= 0) {
                param4 = param4 + param7;
                param3 = param3 + param8;
                var12++;
                continue L0;
              } else {
                param3++;
                param2 = param1[param3];
                if (param2 == 0) {
                  param4++;
                  var13++;
                  continue L1;
                } else {
                  var10 = param0[param4];
                  var11 = 256 - ((param2 & 255) * param9 >> 8);
                  param4++;
                  param0[param4] = (var10 & 16711935) * var11 >> 8 & 16711935 | (var10 & 65280) * var11 >> 8 & 65280;
                  var13++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final static int a(int[] param0) {
        return param0[pb.a(field_a, param0.length, 1)];
    }

    final static void a(vn param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          param1 = param1 + (param0.field_r - param0.field_w - param0.field_v);
          param2 = param2 + param0.field_x;
          var4 = param1 + param2 * bi.field_f;
          var5 = param0.field_w - 1;
          var6 = param0.field_t;
          var7 = param0.field_w;
          var8 = bi.field_f - var7;
          var9 = var7 + var7;
          if (param2 >= bi.field_l) {
            break L0;
          } else {
            var10 = bi.field_l - param2;
            var6 = var6 - var10;
            param2 = bi.field_l;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * bi.field_f;
            break L0;
          }
        }
        L1: {
          if (param2 + var6 <= bi.field_d) {
            break L1;
          } else {
            var6 = var6 - (param2 + var6 - bi.field_d);
            break L1;
          }
        }
        L2: {
          if (param1 >= bi.field_g) {
            break L2;
          } else {
            var10 = bi.field_g - param1;
            var7 = var7 - var10;
            param1 = bi.field_g;
            var5 = var5 - var10;
            var4 = var4 + var10;
            var9 = var9 - var10;
            var8 = var8 + var10;
            break L2;
          }
        }
        L3: {
          if (param1 + var7 <= bi.field_b) {
            break L3;
          } else {
            var10 = param1 + var7 - bi.field_b;
            var7 = var7 - var10;
            var9 = var9 - var10;
            var8 = var8 + var10;
            break L3;
          }
        }
        L4: {
          if (var7 <= 0) {
            break L4;
          } else {
            if (var6 > 0) {
              so.b(bi.field_c, param0.field_z, 0, var5, var4, var7, var6, var8, var9, param3);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    private final static boolean a(vo param0) {
        le var1 = param0.b((byte) 26);
        while (var1 instanceof fb) {
            // ifeq L63
            if (((fb) (Object) var1).field_x > ((fb) (Object) var1.field_b).field_x) {
                return false;
            }
            var1 = var1.field_b;
        }
        return true;
    }

    private final static void b(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var10 = param9 & 16711935;
        var11 = param9 >> 8 & 255;
        var12 = -param6;
        L0: while (true) {
          if (var12 >= 0) {
            return;
          } else {
            var13 = -param5;
            L1: while (true) {
              if (var13 >= 0) {
                param4 = param4 + param7;
                param3 = param3 + param8;
                var12++;
                continue L0;
              } else {
                param3--;
                param2 = param1[param3];
                if (param2 == 0) {
                  param4++;
                  var13++;
                  continue L1;
                } else {
                  if (param2 >> 8 != (param2 & 65535)) {
                    param4++;
                    param0[param4] = param2;
                    var13++;
                    continue L1;
                  } else {
                    param2 = param2 & 255;
                    param4++;
                    param0[param4] = (param2 * var10 >> 8 & 16711934) + (param2 * var11 & 65280) + 1;
                    var13++;
                    continue L1;
                  }
                }
              }
            }
          }
        }
    }

    final static int b(int param0) {
        return pj.a(param0, -42) >> 8;
    }

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        param8--;
        L0: while (true) {
          if (param8 < 0) {
            return;
          } else {
            var10 = param7 - 1;
            L1: while (true) {
              if (var10 < 0) {
                param1 = param1 + param9;
                param8--;
                continue L0;
              } else {
                var11 = param0[param1];
                if (var11 != 0) {
                  if (var11 != param2) {
                    L2: {
                      param3 = param1 - 1;
                      param4 = param1 + 1;
                      param5 = param1 - bi.field_f;
                      param6 = param1 + bi.field_f;
                      if (param0[param5 + 1] != 0) {
                        break L2;
                      } else {
                        param0[param5 + 1] = param2;
                        break L2;
                      }
                    }
                    L3: {
                      if (param0[param6 + 1] != 0) {
                        break L3;
                      } else {
                        param0[param6 + 1] = param2;
                        break L3;
                      }
                    }
                    L4: {
                      if (param0[param5 - 1] != 0) {
                        break L4;
                      } else {
                        param0[param5 - 1] = param2;
                        break L4;
                      }
                    }
                    L5: {
                      if (param0[param6 - 1] != 0) {
                        break L5;
                      } else {
                        param0[param6 - 1] = param2;
                        break L5;
                      }
                    }
                    L6: {
                      if (param0[param3] != 0) {
                        break L6;
                      } else {
                        param0[param3] = param2;
                        break L6;
                      }
                    }
                    L7: {
                      if (param0[param4] != 0) {
                        break L7;
                      } else {
                        param0[param4] = param2;
                        break L7;
                      }
                    }
                    L8: {
                      if (param0[param5] != 0) {
                        break L8;
                      } else {
                        param0[param5] = param2;
                        break L8;
                      }
                    }
                    L9: {
                      if (param0[param6] != 0) {
                        break L9;
                      } else {
                        param0[param6] = param2;
                        break L9;
                      }
                    }
                    L10: {
                      if (param0[param3 - 1] != 0) {
                        break L10;
                      } else {
                        param0[param3 - 1] = param2;
                        break L10;
                      }
                    }
                    L11: {
                      if (param0[param4 + 1] != 0) {
                        break L11;
                      } else {
                        param0[param4 + 1] = param2;
                        break L11;
                      }
                    }
                    L12: {
                      if (param0[param5 - bi.field_f] != 0) {
                        break L12;
                      } else {
                        param0[param5 - bi.field_f] = param2;
                        break L12;
                      }
                    }
                    if (param0[param6 + bi.field_f] == 0) {
                      param0[param6 + bi.field_f] = param2;
                      param1++;
                      var10--;
                      continue L1;
                    } else {
                      param1++;
                      var10--;
                      continue L1;
                    }
                  } else {
                    param1++;
                    var10--;
                    continue L1;
                  }
                } else {
                  param1++;
                  var10--;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final static int c(int param0) {
        return pb.a(field_a, param0, 1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new Random();
    }
}
