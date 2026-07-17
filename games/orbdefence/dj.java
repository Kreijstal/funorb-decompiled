/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class dj {
    private gl field_f;
    private int field_d;
    private long field_n;
    private long field_l;
    private long field_i;
    private byte[] field_g;
    private byte[] field_m;
    private long field_h;
    private long field_a;
    private long field_k;
    static String field_j;
    private int field_c;
    private static int[] field_b;
    static String field_e;

    final long b(int param0) {
        int var2 = -3 % ((49 - param0) / 57);
        return ((dj) this).field_k;
    }

    private final void b() throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = OrbDefence.field_D ? 1 : 0;
          if (-1L == ((dj) this).field_h) {
            break L0;
          } else {
            L1: {
              if (((dj) this).field_i != ((dj) this).field_h) {
                ((dj) this).field_f.a(-9025, ((dj) this).field_h);
                ((dj) this).field_i = ((dj) this).field_h;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((dj) this).field_f.a(0, (byte) 127, ((dj) this).field_d, ((dj) this).field_m);
              ((dj) this).field_i = ((dj) this).field_i + (long)((dj) this).field_d;
              if (~((dj) this).field_l > ~((dj) this).field_i) {
                ((dj) this).field_l = ((dj) this).field_i;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                if (~((dj) this).field_n < ~((dj) this).field_h) {
                  break L4;
                } else {
                  if (~((dj) this).field_h > ~(((dj) this).field_n + (long)((dj) this).field_c)) {
                    var2 = ((dj) this).field_h;
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if (((dj) this).field_n < ((dj) this).field_h) {
                break L3;
              } else {
                if (((dj) this).field_n < (long)((dj) this).field_d + ((dj) this).field_h) {
                  var2 = ((dj) this).field_n;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                var4 = -1L;
                if (~((long)((dj) this).field_d + ((dj) this).field_h) >= ~((dj) this).field_n) {
                  break L6;
                } else {
                  if (((dj) this).field_n - -(long)((dj) this).field_c >= (long)((dj) this).field_d + ((dj) this).field_h) {
                    var4 = ((dj) this).field_h + (long)((dj) this).field_d;
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if ((long)((dj) this).field_c + ((dj) this).field_n <= ((dj) this).field_h) {
                break L5;
              } else {
                if (((dj) this).field_n + (long)((dj) this).field_c > ((dj) this).field_h - -(long)((dj) this).field_d) {
                  break L5;
                } else {
                  var4 = (long)((dj) this).field_c + ((dj) this).field_n;
                  break L5;
                }
              }
            }
            L7: {
              if (-1L >= var2) {
                break L7;
              } else {
                if (var4 > var2) {
                  var6 = (int)(-var2 + var4);
                  mk.a(((dj) this).field_m, (int)(var2 - ((dj) this).field_h), ((dj) this).field_g, (int)(-((dj) this).field_n + var2), var6);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            ((dj) this).field_h = -1L;
            ((dj) this).field_d = 0;
            break L0;
          }
        }
    }

    final void a(long param0, int param1) throws IOException {
        if (!(param0 >= 0L)) {
            throw new IOException();
        }
        ((dj) this).field_a = param0;
        if (param1 != -1) {
            ((dj) this).field_h = -49L;
        }
    }

    final static void a(ki param0, byte param1, ki param2, ki param3) {
        RuntimeException var4 = null;
        qg[] var5 = null;
        qg[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        qg[] var10 = null;
        hj var11 = null;
        int var11_int = 0;
        hj var12 = null;
        int var13 = 0;
        Object var14 = null;
        qg[] var15 = null;
        hj var16 = null;
        int[][] var17 = null;
        hj var18 = null;
        hj var19 = null;
        int[][] var20 = null;
        int[][] var21 = null;
        int[][] var22 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
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
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
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
        var13 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              sd.field_f = p.a(13863, "commonui", param2, "frame_top");
              he.field_y = p.a(13863, "commonui", param2, "frame_bottom");
              qe.field_c = fk.a(param2, "jagex_logo_grey", 91, "commonui");
              ea.field_b = p.a(13863, "commonui", param2, "button");
              int discarded$3 = -69;
              wd.field_C = t.a("commonui", param2, "validation");
              pc.field_bb = (kc) (Object) wl.a("arezzo12", (byte) -124, "commonui", param2, param3);
              lm.field_f = (kc) (Object) wl.a("arezzo14", (byte) -111, "commonui", param2, param3);
              if (param1 > 91) {
                break L1;
              } else {
                var14 = null;
                dj.a((ki) null, (byte) 9, (ki) null, (ki) null);
                break L1;
              }
            }
            qc.field_b = (kc) (Object) wl.a("arezzo14bold", (byte) -120, "commonui", param2, param3);
            var18 = new hj(param0.a("", 1, "button.gif"), (java.awt.Component) (Object) tf.field_f);
            qg discarded$4 = uc.a(false, "commonui", param2, "dropdown");
            var5 = fl.a(-9945, param2, "commonui", "screen_options");
            kk.field_P = new qg[4];
            dc.field_h = new qg[4];
            ck.field_n = new qg[4];
            var6 = new qg[][]{dc.field_h, kk.field_P, ck.field_n};
            var22 = new int[4][];
            var21 = var22;
            var20 = var21;
            var17 = var20;
            var7 = var17;
            var7[0] = var5[0].field_k;
            var8 = 1;
            L2: while (true) {
              if (var22.length <= var8) {
                var8 = var5[0].field_l[0];
                var22[2][var8] = 16777215;
                var22[1][var8] = 2394342;
                var22[3][var8] = 4767999;
                var9 = 0;
                L3: while (true) {
                  if (var9 >= 3) {
                    var9 = var18.field_k;
                    h.k(126);
                    var18.d();
                    ul.h(0, 0, ul.field_f, ul.field_l);
                    var16 = new hj(var9, var9);
                    var19 = var16;
                    var19.d();
                    var18.b(0, 0);
                    var11 = new hj(var9, var9);
                    var11.d();
                    var18.b(-var18.field_o + var9, 0);
                    var12 = new hj(-(2 * var9) + var18.field_o, var9);
                    var12.d();
                    var18.b(-var9, 0);
                    int discarded$5 = -105;
                    oc.g();
                    ea.field_b = new hj[]{var16, var12, var11};
                    break L0;
                  } else {
                    var15 = var6[var9];
                    var10 = var15;
                    var11_int = 0;
                    L4: while (true) {
                      if (var15.length <= var11_int) {
                        var9++;
                        continue L3;
                      } else {
                        var15[var11_int] = h.a(var5[var9], (byte) 37, var22[var11_int]);
                        var11_int++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                var7[var8] = (int[]) var22[0].clone();
                var8++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("dj.G(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44).append(param1).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
    }

    final void a(byte param0) throws IOException {
        int discarded$0 = 68;
        this.b();
        ((dj) this).field_f.d(26);
        int var2 = 0 / ((param0 - -41) / 51);
    }

    public static void c() {
        field_j = null;
        field_e = null;
        field_b = null;
    }

    private final void a() throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = OrbDefence.field_D ? 1 : 0;
          ((dj) this).field_c = 0;
          if (((dj) this).field_a != ((dj) this).field_i) {
            ((dj) this).field_f.a(-9025, ((dj) this).field_a);
            ((dj) this).field_i = ((dj) this).field_a;
            break L0;
          } else {
            break L0;
          }
        }
        ((dj) this).field_n = ((dj) this).field_a;
        L1: while (true) {
          L2: {
            if (((dj) this).field_g.length <= ((dj) this).field_c) {
              break L2;
            } else {
              L3: {
                var2 = -((dj) this).field_c + ((dj) this).field_g.length;
                if (var2 <= 200000000) {
                  break L3;
                } else {
                  var2 = 200000000;
                  break L3;
                }
              }
              var3 = ((dj) this).field_f.a(((dj) this).field_c, var2, -4837, ((dj) this).field_g);
              if (var3 == -1) {
                break L2;
              } else {
                ((dj) this).field_i = ((dj) this).field_i + (long)var3;
                ((dj) this).field_c = ((dj) this).field_c + var3;
                continue L1;
              }
            }
          }
          return;
        }
    }

    final void a(int param0, byte param1, int param2, byte[] param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        long var5_long = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        int var15 = 0;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        var15 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (param3.length < param2 + param0) {
              throw new ArrayIndexOutOfBoundsException(-param3.length + param0 + param2);
            } else {
              L1: {
                if (((dj) this).field_h == -1L) {
                  break L1;
                } else {
                  if (~((dj) this).field_a > ~((dj) this).field_h) {
                    break L1;
                  } else {
                    if (((dj) this).field_h + (long)((dj) this).field_d >= (long)param2 + ((dj) this).field_a) {
                      mk.a(((dj) this).field_m, (int)(-((dj) this).field_h + ((dj) this).field_a), param3, param0, param2);
                      ((dj) this).field_a = ((dj) this).field_a + (long)param2;
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                var7 = -113 / ((param1 - -65) / 40);
                var5_long = ((dj) this).field_a;
                var8 = param0;
                var9 = param2;
                if (((dj) this).field_n > ((dj) this).field_a) {
                  break L2;
                } else {
                  if (((dj) this).field_a < (long)((dj) this).field_c + ((dj) this).field_n) {
                    L3: {
                      var10_int = (int)((long)((dj) this).field_c + (((dj) this).field_n + -((dj) this).field_a));
                      if (var10_int <= param2) {
                        break L3;
                      } else {
                        var10_int = param2;
                        break L3;
                      }
                    }
                    mk.a(((dj) this).field_g, (int)(-((dj) this).field_n + ((dj) this).field_a), param3, param0, var10_int);
                    ((dj) this).field_a = ((dj) this).field_a + (long)var10_int;
                    param2 = param2 - var10_int;
                    param0 = param0 + var10_int;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                if (param2 > ((dj) this).field_g.length) {
                  ((dj) this).field_f.a(-9025, ((dj) this).field_a);
                  ((dj) this).field_i = ((dj) this).field_a;
                  L5: while (true) {
                    if (param2 <= 0) {
                      break L4;
                    } else {
                      var10_int = ((dj) this).field_f.a(param0, param2, -4837, param3);
                      if (-1 == var10_int) {
                        break L4;
                      } else {
                        ((dj) this).field_i = ((dj) this).field_i + (long)var10_int;
                        param0 = param0 + var10_int;
                        ((dj) this).field_a = ((dj) this).field_a + (long)var10_int;
                        param2 = param2 - var10_int;
                        continue L5;
                      }
                    }
                  }
                } else {
                  if (param2 > 0) {
                    L6: {
                      int discarded$2 = 200000000;
                      this.a();
                      var10_int = param2;
                      if (var10_int <= ((dj) this).field_c) {
                        break L6;
                      } else {
                        var10_int = ((dj) this).field_c;
                        break L6;
                      }
                    }
                    mk.a(((dj) this).field_g, 0, param3, param0, var10_int);
                    param0 = param0 + var10_int;
                    ((dj) this).field_a = ((dj) this).field_a + (long)var10_int;
                    param2 = param2 - var10_int;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              L7: {
                if (-1L == ((dj) this).field_h) {
                  break L7;
                } else {
                  L8: {
                    if (~((dj) this).field_h >= ~((dj) this).field_a) {
                      break L8;
                    } else {
                      if (0 >= param2) {
                        break L8;
                      } else {
                        L9: {
                          var10_int = param0 - -(int)(-((dj) this).field_a + ((dj) this).field_h);
                          if (var10_int <= param0 + param2) {
                            break L9;
                          } else {
                            var10_int = param0 + param2;
                            break L9;
                          }
                        }
                        L10: while (true) {
                          if (var10_int <= param0) {
                            break L8;
                          } else {
                            param2--;
                            int incrementValue$3 = param0;
                            param0++;
                            param3[incrementValue$3] = (byte) 0;
                            ((dj) this).field_a = ((dj) this).field_a + 1L;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      var10 = -1L;
                      var12 = -1L;
                      if (var5_long > ((dj) this).field_h) {
                        break L12;
                      } else {
                        if ((long)var9 + var5_long > ((dj) this).field_h) {
                          var10 = ((dj) this).field_h;
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    if (~var5_long > ~((dj) this).field_h) {
                      break L11;
                    } else {
                      if (~var5_long > ~(((dj) this).field_h - -(long)((dj) this).field_d)) {
                        var10 = var5_long;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                  }
                  L13: {
                    L14: {
                      if (var5_long >= ((dj) this).field_h - -(long)((dj) this).field_d) {
                        break L14;
                      } else {
                        if ((long)var9 + var5_long >= ((dj) this).field_h - -(long)((dj) this).field_d) {
                          var12 = (long)((dj) this).field_d + ((dj) this).field_h;
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    if ((long)var9 + var5_long <= ((dj) this).field_h) {
                      break L13;
                    } else {
                      if (~(((dj) this).field_h - -(long)((dj) this).field_d) > ~(var5_long + (long)var9)) {
                        break L13;
                      } else {
                        var12 = var5_long + (long)var9;
                        break L13;
                      }
                    }
                  }
                  if (-1L >= var10) {
                    break L7;
                  } else {
                    if (var12 <= var10) {
                      break L7;
                    } else {
                      var14 = (int)(-var10 + var12);
                      mk.a(((dj) this).field_m, (int)(var10 + -((dj) this).field_h), param3, var8 + (int)(-var5_long + var10), var14);
                      if (var12 > ((dj) this).field_a) {
                        param2 = (int)((long)param2 - (var12 + -((dj) this).field_a));
                        ((dj) this).field_a = var12;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
              }
              if (param2 <= 0) {
                break L0;
              } else {
                throw new EOFException();
              }
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((dj) this).field_i = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L15: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_58_0 = (RuntimeException) var5_ref;
            stackOut_58_1 = new StringBuilder().append("dj.C(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_60_0 = stackOut_58_0;
            stackIn_60_1 = stackOut_58_1;
            stackIn_59_0 = stackOut_58_0;
            stackIn_59_1 = stackOut_58_1;
            if (param3 == null) {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "null";
              stackIn_61_0 = stackOut_60_0;
              stackIn_61_1 = stackOut_60_1;
              stackIn_61_2 = stackOut_60_2;
              break L15;
            } else {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "{...}";
              stackIn_61_0 = stackOut_59_0;
              stackIn_61_1 = stackOut_59_1;
              stackIn_61_2 = stackOut_59_2;
              break L15;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_61_0, stackIn_61_2 + 41);
        }
    }

    final void a(byte[] param0, int param1) throws IOException {
        if (param1 != 4) {
            return;
        }
        try {
            ((dj) this).a(0, (byte) -126, param0.length, param0);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "dj.H(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void a(boolean param0, byte[] param1, int param2, int param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        var10 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (!param0) {
              L1: {
                if (~((long)param2 + ((dj) this).field_a) >= ~((dj) this).field_k) {
                  break L1;
                } else {
                  ((dj) this).field_k = ((dj) this).field_a + (long)param2;
                  break L1;
                }
              }
              L2: {
                if (((dj) this).field_h == -1L) {
                  break L2;
                } else {
                  L3: {
                    if (~((dj) this).field_a > ~((dj) this).field_h) {
                      break L3;
                    } else {
                      if (~((dj) this).field_a >= ~(((dj) this).field_h + (long)((dj) this).field_d)) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  int discarded$2 = 68;
                  this.b();
                  break L2;
                }
              }
              L4: {
                if (((dj) this).field_h == -1L) {
                  break L4;
                } else {
                  if (~((long)((dj) this).field_m.length + ((dj) this).field_h) > ~(((dj) this).field_a - -(long)param2)) {
                    var5_int = (int)((long)((dj) this).field_m.length + ((dj) this).field_h + -((dj) this).field_a);
                    mk.a(param1, param3, ((dj) this).field_m, (int)(((dj) this).field_a + -((dj) this).field_h), var5_int);
                    param3 = param3 + var5_int;
                    ((dj) this).field_a = ((dj) this).field_a + (long)var5_int;
                    param2 = param2 - var5_int;
                    ((dj) this).field_d = ((dj) this).field_m.length;
                    int discarded$3 = 68;
                    this.b();
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              if (((dj) this).field_m.length < param2) {
                L5: {
                  if (((dj) this).field_i == ((dj) this).field_a) {
                    break L5;
                  } else {
                    ((dj) this).field_f.a(-9025, ((dj) this).field_a);
                    ((dj) this).field_i = ((dj) this).field_a;
                    break L5;
                  }
                }
                L6: {
                  ((dj) this).field_f.a(param3, (byte) 0, param2, param1);
                  ((dj) this).field_i = ((dj) this).field_i + (long)param2;
                  if (~((dj) this).field_i < ~((dj) this).field_l) {
                    ((dj) this).field_l = ((dj) this).field_i;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  L8: {
                    var5_long = -1L;
                    var7 = -1L;
                    if (~((dj) this).field_a > ~((dj) this).field_n) {
                      break L8;
                    } else {
                      if (((dj) this).field_n + (long)((dj) this).field_c > ((dj) this).field_a) {
                        var5_long = ((dj) this).field_a;
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  if (((dj) this).field_a > ((dj) this).field_n) {
                    break L7;
                  } else {
                    if (~((dj) this).field_n > ~((long)param2 + ((dj) this).field_a)) {
                      var5_long = ((dj) this).field_n;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                L9: {
                  L10: {
                    if (~((dj) this).field_n <= ~(((dj) this).field_a - -(long)param2)) {
                      break L10;
                    } else {
                      if ((long)param2 + ((dj) this).field_a <= (long)((dj) this).field_c + ((dj) this).field_n) {
                        var7 = (long)param2 + ((dj) this).field_a;
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  if (((dj) this).field_n - -(long)((dj) this).field_c <= ((dj) this).field_a) {
                    break L9;
                  } else {
                    if (~(((dj) this).field_a + (long)param2) > ~((long)((dj) this).field_c + ((dj) this).field_n)) {
                      break L9;
                    } else {
                      var7 = (long)((dj) this).field_c + ((dj) this).field_n;
                      break L9;
                    }
                  }
                }
                L11: {
                  if (var5_long <= -1L) {
                    break L11;
                  } else {
                    if (var7 <= var5_long) {
                      break L11;
                    } else {
                      var9 = (int)(var7 + -var5_long);
                      mk.a(param1, (int)((long)param3 - -var5_long - ((dj) this).field_a), ((dj) this).field_g, (int)(-((dj) this).field_n + var5_long), var9);
                      break L11;
                    }
                  }
                }
                ((dj) this).field_a = ((dj) this).field_a + (long)param2;
                return;
              } else {
                if (param2 > 0) {
                  L12: {
                    if (-1L == ((dj) this).field_h) {
                      ((dj) this).field_h = ((dj) this).field_a;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    mk.a(param1, param3, ((dj) this).field_m, (int)(((dj) this).field_a - ((dj) this).field_h), param2);
                    ((dj) this).field_a = ((dj) this).field_a + (long)param2;
                    if (~(long)((dj) this).field_d <= ~(-((dj) this).field_h + ((dj) this).field_a)) {
                      break L13;
                    } else {
                      ((dj) this).field_d = (int)(-((dj) this).field_h + ((dj) this).field_a);
                      break L13;
                    }
                  }
                  return;
                } else {
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((dj) this).field_i = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L14: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_52_0 = (RuntimeException) var5_ref;
            stackOut_52_1 = new StringBuilder().append("dj.B(").append(param0).append(44);
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param1 == null) {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L14;
            } else {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L14;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_55_0, stackIn_55_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    dj(gl param0, int param1, int param2) throws IOException {
        ((dj) this).field_d = 0;
        ((dj) this).field_h = -1L;
        ((dj) this).field_n = -1L;
        try {
            ((dj) this).field_f = param0;
            long dupTemp$0 = param0.a(1);
            ((dj) this).field_l = dupTemp$0;
            ((dj) this).field_k = dupTemp$0;
            ((dj) this).field_g = new byte[param1];
            ((dj) this).field_a = 0L;
            ((dj) this).field_m = new byte[param2];
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "dj.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        long var6 = 0L;
        long var4 = 0L;
        int var2 = 0;
        int var3 = 0;
        int var1 = 0;
        field_j = "Error connecting to server. Please try using a different server.";
        field_b = new int[98304];
        for (var0 = 92682; 46341 <= var0; var0--) {
            var6 = (long)(1 + (var0 << 1));
            var4 = (long)((var0 << 1) + -1);
            var2 = (int)(-32768L + (var4 * var4 >> 18));
            var3 = (int)(-32768L + (var6 * var6 >> 18));
            if (field_b.length <= var3) {
                var3 = field_b.length + -1;
            }
            for (var1 = var2 >= 0 ? var2 : 0; var3 >= var1; var1++) {
                field_b[var1] = var0;
            }
        }
        field_e = "Orb Points";
    }
}
