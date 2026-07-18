/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hd {
    int field_h;
    boolean[] field_s;
    int field_d;
    boolean field_x;
    private dd field_j;
    int field_a;
    static tf field_w;
    static String field_l;
    boolean field_m;
    private Random field_t;
    static boolean field_g;
    int field_f;
    boolean field_p;
    static String field_o;
    private int field_u;
    byte[] field_r;
    int field_b;
    boolean field_k;
    static tf[] field_v;
    static int field_n;
    int field_i;
    static int field_q;
    static fm field_c;
    int field_e;

    final void a(int param0, we param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        boolean[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        boolean[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        boolean[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        boolean[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        boolean[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        boolean[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              ((hd) this).field_e = param1.f(param0 + 257);
              if (param0 == -2) {
                break L1;
              } else {
                hd.d(-62);
                break L1;
              }
            }
            L2: {
              ((hd) this).field_h = param1.f(255);
              ((hd) this).field_u = param1.a((byte) 76);
              ((hd) this).field_b = param1.a((byte) -117);
              stackOut_3_0 = this;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (1 != param1.f(255)) {
                stackOut_5_0 = this;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L2;
              } else {
                stackOut_4_0 = this;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L2;
              }
            }
            ((hd) this).field_p = stackIn_6_1 != 0;
            var3_int = 0;
            L3: while (true) {
              if (var3_int >= 4) {
                var3_int = 0;
                L4: while (true) {
                  if (((hd) this).field_r.length <= var3_int) {
                    var3_int = 0;
                    L5: while (true) {
                      if (((hd) this).field_u <= var3_int) {
                        break L0;
                      } else {
                        int discarded$6 = ok.a(((hd) this).field_t, -104, 1);
                        var3_int++;
                        continue L5;
                      }
                    }
                  } else {
                    ((hd) this).field_r[var3_int] = param1.a(0);
                    var3_int++;
                    continue L4;
                  }
                }
              } else {
                L6: {
                  stackOut_8_0 = ((hd) this).field_s;
                  stackOut_8_1 = var3_int;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  if (param1.f(255) != 1) {
                    stackOut_10_0 = (boolean[]) (Object) stackIn_10_0;
                    stackOut_10_1 = stackIn_10_1;
                    stackOut_10_2 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    stackIn_11_2 = stackOut_10_2;
                    break L6;
                  } else {
                    stackOut_9_0 = (boolean[]) (Object) stackIn_9_0;
                    stackOut_9_1 = stackIn_9_1;
                    stackOut_9_2 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    stackIn_11_2 = stackOut_9_2;
                    break L6;
                  }
                }
                stackIn_11_0[stackIn_11_1] = stackIn_11_2 != 0;
                var3_int++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3;
            stackOut_19_1 = new StringBuilder().append("hd.G(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
    }

    final boolean a(int param0, byte param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        byte[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        byte stackIn_17_2 = 0;
        byte[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        byte stackIn_18_2 = 0;
        byte[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        byte stackIn_19_2 = 0;
        int stackIn_19_3 = 0;
        byte[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        byte stackOut_16_2 = 0;
        byte[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        byte stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        byte[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        byte stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        L0: {
          var5 = Pixelate.field_H ? 1 : 0;
          if (param1 < -79) {
            break L0;
          } else {
            boolean discarded$1 = ((hd) this).c(120);
            break L0;
          }
        }
        L1: {
          if (param0 == 2) {
            L2: {
              if (((hd) this).field_e == 0) {
                break L2;
              } else {
                if (((hd) this).field_r[((hd) this).field_i * ((hd) this).field_h + (-1 + ((hd) this).field_e)] == -1) {
                  break L2;
                } else {
                  if (-1 != ((hd) this).field_r[((hd) this).field_i * ((hd) this).field_h + ((hd) this).field_e + (-1 - -((hd) this).field_i)]) {
                    ((hd) this).field_e = ((hd) this).field_e - 1;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
            return false;
          } else {
            if (param0 == 3) {
              L3: {
                if (-2 + ((hd) this).field_i == ((hd) this).field_e) {
                  break L3;
                } else {
                  if (-1 == ((hd) this).field_r[2 + (((hd) this).field_e + ((hd) this).field_i * ((hd) this).field_h)]) {
                    break L3;
                  } else {
                    if (((hd) this).field_r[((hd) this).field_i + ((hd) this).field_i * ((hd) this).field_h + ((hd) this).field_e - -2] != -1) {
                      ((hd) this).field_e = ((hd) this).field_e + 1;
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              return false;
            } else {
              if (param0 == 0) {
                L4: {
                  if (((hd) this).field_h == 0) {
                    break L4;
                  } else {
                    if (-1 == ((hd) this).field_r[((hd) this).field_h * ((hd) this).field_i + ((hd) this).field_e - ((hd) this).field_i]) {
                      break L4;
                    } else {
                      if (-1 != ((hd) this).field_r[-((hd) this).field_i + (1 + (((hd) this).field_e - -(((hd) this).field_i * ((hd) this).field_h)))]) {
                        ((hd) this).field_h = ((hd) this).field_h - 1;
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                return false;
              } else {
                if (param0 == 1) {
                  L5: {
                    if (((hd) this).field_a + -2 == ((hd) this).field_h) {
                      break L5;
                    } else {
                      if (-1 == ((hd) this).field_r[((hd) this).field_i * (2 + ((hd) this).field_h) + ((hd) this).field_e]) {
                        break L5;
                      } else {
                        if (((hd) this).field_r[((hd) this).field_i * (((hd) this).field_h - -2) + 1 + ((hd) this).field_e] != -1) {
                          ((hd) this).field_h = ((hd) this).field_h + 1;
                          break L1;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  return false;
                } else {
                  if (4 != param0) {
                    if (param0 != 6) {
                      if (param0 != 7) {
                        if (param0 == 5) {
                          var10 = new int[4];
                          var9 = var10;
                          var8 = var9;
                          var7 = var8;
                          var6 = var7;
                          var3 = var6;
                          var6[1] = ((hd) this).field_e - (-1 - ((hd) this).field_i * ((hd) this).field_h);
                          var6[2] = ((hd) this).field_e - -((1 + ((hd) this).field_h) * ((hd) this).field_i);
                          var6[0] = ((hd) this).field_h * ((hd) this).field_i + ((hd) this).field_e;
                          var6[3] = ((hd) this).field_i * (1 + ((hd) this).field_h) + (1 + ((hd) this).field_e);
                          var4 = 0;
                          L6: while (true) {
                            if (var4 >= 4) {
                              L7: {
                                L8: {
                                  ((hd) this).b(-91);
                                  if (((hd) this).field_e == 0) {
                                    break L8;
                                  } else {
                                    if (((hd) this).field_h == 0) {
                                      break L8;
                                    } else {
                                      if (((hd) this).field_e == -2 + ((hd) this).field_i) {
                                        break L8;
                                      } else {
                                        if (~(-2 + ((hd) this).field_a) == ~((hd) this).field_h) {
                                          break L8;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                  }
                                }
                                ((hd) this).field_m = true;
                                break L7;
                              }
                              ((hd) this).field_d = ((hd) this).field_d + 1;
                              break L1;
                            } else {
                              L9: {
                                ((hd) this).field_r[var10[var4]] = (byte)cm.a((int) ((hd) this).field_r[var10[var4]], -4);
                                stackOut_16_0 = ((hd) this).field_r;
                                stackOut_16_1 = var10[var4];
                                stackOut_16_2 = ((hd) this).field_r[var10[var4]];
                                stackIn_18_0 = stackOut_16_0;
                                stackIn_18_1 = stackOut_16_1;
                                stackIn_18_2 = stackOut_16_2;
                                stackIn_17_0 = stackOut_16_0;
                                stackIn_17_1 = stackOut_16_1;
                                stackIn_17_2 = stackOut_16_2;
                                if (!((hd) this).field_s[var4]) {
                                  stackOut_18_0 = (byte[]) (Object) stackIn_18_0;
                                  stackOut_18_1 = stackIn_18_1;
                                  stackOut_18_2 = stackIn_18_2;
                                  stackOut_18_3 = 1;
                                  stackIn_19_0 = stackOut_18_0;
                                  stackIn_19_1 = stackOut_18_1;
                                  stackIn_19_2 = stackOut_18_2;
                                  stackIn_19_3 = stackOut_18_3;
                                  break L9;
                                } else {
                                  stackOut_17_0 = (byte[]) (Object) stackIn_17_0;
                                  stackOut_17_1 = stackIn_17_1;
                                  stackOut_17_2 = stackIn_17_2;
                                  stackOut_17_3 = 2;
                                  stackIn_19_0 = stackOut_17_0;
                                  stackIn_19_1 = stackOut_17_1;
                                  stackIn_19_2 = stackOut_17_2;
                                  stackIn_19_3 = stackOut_17_3;
                                  break L9;
                                }
                              }
                              stackIn_19_0[stackIn_19_1] = (byte)bq.a((int) stackIn_19_2, stackIn_19_3);
                              var4++;
                              continue L6;
                            }
                          }
                        } else {
                          break L1;
                        }
                      } else {
                        ((hd) this).field_p = false;
                        break L1;
                      }
                    } else {
                      ((hd) this).field_p = true;
                      break L1;
                    }
                  } else {
                    wm.a(-11825, ((hd) this).field_s);
                    ((hd) this).field_x = true;
                    return true;
                  }
                }
              }
            }
          }
        }
        return true;
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        return vg.a(param0, -1) >> 8;
    }

    final boolean c(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = Pixelate.field_H ? 1 : 0;
        int var2 = 1;
        for (var3 = 1; -1 + ((hd) this).field_a > var3; var3++) {
            for (var4 = 1; -1 + ((hd) this).field_i > var4; var4++) {
                var2 = var2 & ((4 & ((hd) this).field_r[var3 * ((hd) this).field_i + var4]) != 0 ? 1 : 0);
            }
        }
        if (param0 != 26745) {
            return false;
        }
        return var2 != 0;
    }

    final static void d(int param0) {
        if (param0 >= -72) {
            hd.a((byte) -16);
        }
        lg.field_a = lg.field_a + 100;
        if (255 < lg.field_a) {
            lg.field_a = 255;
        }
    }

    final void b(int param0, int param1) {
        ((hd) this).field_u = 0;
        if (param0 >= -13) {
            field_o = null;
        }
        ((hd) this).field_t = new Random((long)param1);
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Pixelate.field_H ? 1 : 0;
          var2 = 0;
          if (oa.field_j == 1) {
            var2 = un.field_j.a(0);
            if (-1 == var2) {
              return;
            } else {
              break L0;
            }
          } else {
            ((hd) this).field_u = ((hd) this).field_u + 1;
            var3 = ok.a(((hd) this).field_t, -119, 100);
            var4 = 0;
            var5 = 0;
            L1: while (true) {
              if (var5 >= 6) {
                break L0;
              } else {
                var4 = var4 + ak.field_db[var5];
                if (var3 < var4) {
                  var2 = var5;
                  break L0;
                } else {
                  var5++;
                  continue L1;
                }
              }
            }
          }
        }
        L2: {
          if (param0 < -72) {
            break L2;
          } else {
            ((hd) this).field_s = null;
            break L2;
          }
        }
        var3 = 0;
        L3: while (true) {
          if (var3 >= 4) {
            L4: {
              if (oa.field_j != 1) {
                ((hd) this).field_u = ((hd) this).field_u + 1;
                var3 = ok.a(((hd) this).field_t, -116, 4);
                var4 = 0;
                L5: while (true) {
                  if (var3 <= var4) {
                    break L4;
                  } else {
                    wm.a(-11825, ((hd) this).field_s);
                    var4++;
                    continue L5;
                  }
                }
              } else {
                break L4;
              }
            }
            return;
          } else {
            ((hd) this).field_s[var3] = vn.field_e[var2][var3];
            var3++;
            continue L3;
          }
        }
    }

    public static void a(byte param0) {
        field_l = null;
        field_o = null;
        field_c = null;
        field_v = null;
        if (param0 <= 122) {
            field_l = null;
        }
        field_w = null;
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Pixelate.field_H ? 1 : 0;
        var2 = -59 % ((14 - param0) / 37);
        var3 = 0;
        L0: while (true) {
          if (((hd) this).field_r.length <= var3) {
            ((hd) this).field_x = false;
            ((hd) this).field_m = false;
            ((hd) this).field_k = false;
            return;
          } else {
            if (((hd) this).field_r[var3] != -1) {
              ((hd) this).field_r[var3] = (byte) 0;
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    final void a(int param0, byte[] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var3_int = param0;
            L1: while (true) {
              if (var3_int >= param1.length) {
                break L0;
              } else {
                ((hd) this).field_r[var3_int] = param1[var3_int];
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("hd.K(").append(param0).append(',');
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
          throw aa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    final int b(byte param0) {
        if (param0 >= -10) {
            return -115;
        }
        return ((hd) this).field_j.field_p;
    }

    hd(dd param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        ((hd) this).field_x = false;
        ((hd) this).field_m = false;
        ((hd) this).field_k = false;
        try {
          L0: {
            L1: {
              ((hd) this).field_s = new boolean[4];
              ((hd) this).field_j = param0;
              ((hd) this).field_i = ((hd) this).field_j.field_o + 2;
              ((hd) this).field_a = 2 + ((hd) this).field_j.field_k;
              ((hd) this).field_r = new byte[((hd) this).field_a * ((hd) this).field_i];
              if ((((hd) this).field_j.field_p & 1) == 0) {
                break L1;
              } else {
                ((hd) this).field_r[0] = (byte) -1;
                ((hd) this).field_r[((hd) this).field_i - 1] = (byte) -1;
                ((hd) this).field_r[-((hd) this).field_i + ((hd) this).field_a * ((hd) this).field_i] = (byte) -1;
                ((hd) this).field_r[((hd) this).field_a * ((hd) this).field_i - 1] = (byte) -1;
                break L1;
              }
            }
            L2: {
              if ((2 & ((hd) this).field_j.field_p) == 0) {
                break L2;
              } else {
                var2_int = 0;
                L3: while (true) {
                  if (((hd) this).field_a <= var2_int) {
                    break L2;
                  } else {
                    ((hd) this).field_r[((hd) this).field_i * var2_int] = (byte) -1;
                    var2_int++;
                    continue L3;
                  }
                }
              }
            }
            L4: {
              if ((((hd) this).field_j.field_p & 4) == 0) {
                break L4;
              } else {
                var2_int = 0;
                L5: while (true) {
                  if (((hd) this).field_i <= var2_int) {
                    break L4;
                  } else {
                    ((hd) this).field_r[var2_int] = (byte) -1;
                    var2_int++;
                    continue L5;
                  }
                }
              }
            }
            L6: {
              if ((8 & ((hd) this).field_j.field_p) == 0) {
                break L6;
              } else {
                var2_int = 0;
                L7: while (true) {
                  if (var2_int >= ((hd) this).field_a) {
                    break L6;
                  } else {
                    ((hd) this).field_r[var2_int * ((hd) this).field_i + ((hd) this).field_i - 1] = (byte) -1;
                    var2_int++;
                    continue L7;
                  }
                }
              }
            }
            L8: {
              if ((16 & ((hd) this).field_j.field_p) == 0) {
                break L8;
              } else {
                var2_int = 0;
                L9: while (true) {
                  if (((hd) this).field_i <= var2_int) {
                    break L8;
                  } else {
                    ((hd) this).field_r[var2_int + (((hd) this).field_a + -1) * ((hd) this).field_i] = (byte) -1;
                    var2_int++;
                    continue L9;
                  }
                }
              }
            }
            ((hd) this).field_h = -1 + ((hd) this).field_a / 2;
            ((hd) this).field_e = -1 + ((hd) this).field_i / 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var2;
            stackOut_21_1 = new StringBuilder().append("hd.<init>(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L10;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L10;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
    }

    final void a(hh param0, int param1) {
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = Pixelate.field_H ? 1 : 0;
        try {
            var3 = param0.field_n;
            for (var4 = 0; param0.field_a > var4; var4++) {
                for (var5 = 0; var5 < param0.field_f; var5++) {
                    var6 = 1 + var5 - -((1 + var4) * ((hd) this).field_i);
                    ((hd) this).field_r[var6] = (byte)cm.a((int) ((hd) this).field_r[var6], -4);
                    ((hd) this).field_r[var6] = (byte)bq.a((int) ((hd) this).field_r[var6], (int) var3[param0.field_f * var4 + var5]);
                    ((hd) this).field_r[var6] = (byte)bq.a((int) ((hd) this).field_r[var6], 4);
                }
            }
            var5 = -8 % ((param1 - -13) / 43);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "hd.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "You need to play 1 more rated game to unlock this option.";
        field_o = "Ask to join <%0>'s game";
    }
}
