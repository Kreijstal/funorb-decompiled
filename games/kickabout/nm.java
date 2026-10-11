/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm {
    static Kickabout field_g;
    int[] field_e;
    static oj field_d;
    private static int[] field_b;
    boolean field_j;
    private int[][] field_n;
    int field_f;
    static int[] field_i;
    int[] field_c;
    private int[] field_m;
    static int field_l;
    int field_h;
    static dp field_k;
    static String field_a;

    final static ut a(int param0, int param1, ut param2) {
        int var6 = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        ut var9 = null;
        ut var10 = null;
        ut stackIn_3_0 = null;
        ut stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Kickabout.field_G;
        try {
          var9 = new ut(param2.field_q, param2.field_w);
          var10 = var9;
          var4 = 16711935 & param0;
          var5 = param0 & 65280;
          if (param1 >= -73) {
            stackIn_3_0 = (ut) null;
            return stackIn_3_0;
          }
          for (var6 = 0; var10.field_y.length > var6; var6++) {
            var7 = param2.field_y[var6];
            if (0 != var7 &&
              var7 != 65793) {
              var7 = var7 & 255;
              var7 = (16711935 & var7 * var4 >> 8) + ((var7 * var5 & 16711798) >> 8);
            }
            var9.field_y[var6] = var7;
          }
          stackIn_11_0 = var10;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("nm.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static int a(byte param0, int param1) {
        int var2 = param1 >= gs.field_a.length ? 100 : gs.field_a[param1];
        if (param0 >= -89) {
          return 7;
        }
        return 55 + var2 * 45 / 100;
    }

    private nm(sj param0, int param1, String param2) {
        this(param0, param1, param0.a((byte) -111, param2, param1));
    }

    nm(sj param0, String param1, String param2) {
        this(param0, param0.b(param1, -1), param2);
    }

    public static void a(int param0) {
        field_d = null;
        field_g = null;
        if (param0 != 256) {
          return;
        }
        field_i = null;
        field_a = null;
        field_b = null;
        field_k = null;
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        int stackIn_7_1 = 0;
        boolean stackIn_8_0 = false;
        boolean stackIn_10_1 = false;
        if (param1 != -76) {
          field_b = (int[]) null;
        }
        boolean decompiledFrameRemainder0 = true;
        stackIn_8_0 = kl.field_t;
        if (param3 == ih.field_c &&
          rm.field_C == param0) {
          if (param2) {
            stackIn_7_1 = 0;
          } else {
            stackIn_7_1 = 1;
          }
          if (stackIn_7_1 != (vi.field_n ? 1 : 0)) {
            stackIn_10_1 = false;
            decompiledFrameRemainder0 = false;
          }
        }
        if (decompiledFrameRemainder0) {
          stackIn_10_1 = true;
        }
        kl.field_t = stackIn_8_0 | stackIn_10_1;
        wh.field_q = true;
        rl.field_r = -1;
        vi.field_n = param2;
        rm.field_C = param0;
        ih.field_c = param3;
    }

    private final void a(int param0, iw param1, int param2) {
        int[] array$0 = null;
        int var7 = 0;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var4_intLifetime1;
        var8 = Kickabout.field_G;
        try {
          if (param0 == 1) {
            var4_int = param1.a((byte) 81);
            this.field_c = new int[var4_int];
            for (var5 = 0; var4_int > var5; var5++) {
              this.field_c[var5] = param1.a((byte) 81);
            }
            this.field_e = new int[var4_int];
            for (var5 = 0; var4_int > var5; var5++) {
              this.field_e[var5] = param1.a((byte) 81);
            }
            for (var5 = 0; var4_int > var5; var5++) {
              this.field_e[var5] = (param1.a((byte) 81) << 16) + this.field_e[var5];
            }
          } else {
            if (param0 == 2) {
              this.field_h = param1.a((byte) 81);
            } else {
              if (param0 == 3) {
                var4_int = param1.h((byte) -122);
                this.field_m = new int[1 + var4_int];
                for (var5 = 0; var5 < var4_int; var5++) {
                  this.field_m[var5] = param1.h((byte) -115);
                }
                this.field_m[var4_int] = 9999999;
              } else {
                if (5 == param0) {
                  param1.h((byte) -126);
                } else {
                  if (param0 != 6) {
                    if (param0 != 7) {
                      if (param0 != 8) {
                        if (param0 == 9) {
                          param1.h((byte) -106);
                        } else {
                          if (param0 != 10) {
                            if (11 == param0) {
                              param1.h((byte) -118);
                            } else {
                              if (param0 == 12) {
                                var4_int = param1.h((byte) -117);
                                for (var5 = 0; var4_int > var5; var5++) {
                                  param1.a((byte) 81);
                                }
                                for (var5 = 0; var4_int > var5; var5++) {
                                  param1.a((byte) 81);
                                }
                              } else {
                                if (param0 == 13) {
                                  var4_int = param1.a((byte) 81);
                                  this.field_n = new int[var4_int][];
                                  for (var5 = 0; var5 < var4_int; var5++) {
                                    var6 = param1.h((byte) -108);
                                    if (var6 > 0) {
                                      array$0 = new int[var6];
                                      this.field_n[var5] = array$0;
                                      this.field_n[var5][0] = param1.i(-95);
                                      for (var7 = 1; var6 > var7; var7++) {
                                        this.field_n[var5][var7] = param1.a((byte) 81);
                                      }
                                    }
                                  }
                                } else {
                                  if (param0 != 14 &&
                                    param0 != 15) {
                                    if (param0 == 16) {
                                      var4_int = -111 / ((param2 + 70) / 46);
                                      return;
                                    }
                                    if (18 == param0) {
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            param1.h((byte) -115);
                          }
                        }
                      } else {
                        this.field_f = param1.h((byte) -124);
                        this.field_j = false;
                      }
                    } else {
                      param1.a((byte) 81);
                    }
                  } else {
                    param1.a((byte) 81);
                  }
                }
              }
            }
          }
          var4_intLifetime1 = -111 / ((param2 + 70) / 46);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_59_0 = var4;
          stackIn_59_1 = new StringBuilder().append("nm.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, tf param5, byte param6) {
        int var11 = 0;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        var12 = Kickabout.field_G;
        try {
          var7_int = param0 - param4;
          var8 = param2 - param3;
          var9 = de.a(var7_int * var7_int + var8 * var8, (byte) -98);
          var10 = var9 / param1;
          if (param6 >= -10) {
            return;
          }
          for (var11 = 0; -1 + var10 > var11; var11++) {
            param5.a(ek.b(true, param4 + (param0 - param4) * var11 / (-1 + var10), param3 + var11 * (-param3 + param2) / (-1 + var10)), 3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_9_0 = var7;
          stackIn_9_1 = new StringBuilder().append("nm.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param6).append(')').toString());
        }
    }

    private final void a(int param0, iw param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Kickabout.field_G;
        try {
          while (true) {
            var3_int = param1.h((byte) -124);
            if (var3_int != 0) {
              this.a(var3_int, param1, param0 ^ 118);
              continue;
            }
            break;
          }
          if (param0 != -1) {
            field_l = -19;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("nm.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private nm(sj param0, int param1, int param2) {
        int var7 = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        byte[] var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        int var6Lifetime1;
        this.field_f = 0;
        this.field_h = -1;
        try {
          this.field_j = true;
          var11 = param0.b(param1, -32669, param2);
          var10 = var11;
          var9 = var10;
          var4 = var9;
          if (var9 != null) {
            this.a(-1, new iw(var11));
          }
          var5 = 0;
          for (var6 = 0; this.field_e.length > var6; var6++) {
            if (var5 < this.field_e[var6]) {
              var5 = this.field_e[var6];
            }
          }
          var6Lifetime1 = 0;
          for (var7 = 0; this.field_c.length > var7; var7++) {
            if (this.field_c[var7] > var6Lifetime1) {
              var6Lifetime1 = this.field_c[var7];
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_16_0 = var4_ref;
          stackIn_16_1 = new StringBuilder().append("nm.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        int var0 = 0;
        field_i = new int[89];
        field_b = new int[89];
        for (var0 = 0; var0 < field_i.length; var0++) {
          if (var0 != 0) {
            if (1 != var0) {
              if (2 == var0) {
                field_i[var0] = 64;
              } else {
                if (var0 != 3) {
                  if (var0 != 4) {
                    if (var0 == 5) {
                      field_i[var0] = 20;
                    } else {
                      if (var0 == 6) {
                        field_i[var0] = 30;
                      } else {
                        if (var0 != 7) {
                          if (var0 == 8) {
                            field_i[var0] = 30;
                          } else {
                            if (var0 != 9) {
                              if (var0 != 10) {
                                if (var0 == 11) {
                                  field_i[var0] = 30;
                                } else {
                                  if (12 == var0) {
                                    field_i[var0] = 30;
                                  } else {
                                    if (var0 != 13) {
                                      if (var0 == 14) {
                                        field_i[var0] = 30;
                                      } else {
                                        if (15 != var0) {
                                          if (var0 != 16) {
                                            if (var0 != 17) {
                                              if (18 != var0) {
                                                if (19 == var0) {
                                                  field_i[var0] = 30;
                                                } else {
                                                  if (var0 == 20) {
                                                    field_i[var0] = 30;
                                                  } else {
                                                    if (21 != var0) {
                                                      if (var0 != 22) {
                                                        if (23 == var0) {
                                                          field_i[var0] = 30;
                                                        } else {
                                                          if (var0 != 24) {
                                                            if (var0 == 25) {
                                                              field_i[var0] = 30;
                                                            } else {
                                                              if (var0 != 26) {
                                                                if (27 != var0) {
                                                                  if (28 == var0) {
                                                                    field_i[var0] = 80;
                                                                  } else {
                                                                    if (var0 == 29) {
                                                                      field_i[var0] = 80;
                                                                    } else {
                                                                      if (30 == var0) {
                                                                        field_i[var0] = 100;
                                                                      } else {
                                                                        if (var0 != 31) {
                                                                          if (var0 != 32) {
                                                                            if (var0 != 33) {
                                                                              if (34 == var0) {
                                                                                field_i[var0] = 64;
                                                                              } else {
                                                                                if (var0 == 35) {
                                                                                  field_i[var0] = 70;
                                                                                } else {
                                                                                  if (36 != var0) {
                                                                                    if (37 != var0) {
                                                                                      if (38 != var0) {
                                                                                        if (39 != var0) {
                                                                                          if (var0 != 40) {
                                                                                            if (var0 == 41) {
                                                                                              field_i[var0] = 64;
                                                                                            } else {
                                                                                              if (var0 == 42) {
                                                                                                field_i[var0] = 64;
                                                                                              } else {
                                                                                                if (var0 != 43) {
                                                                                                  if (var0 != 44) {
                                                                                                    if (var0 == 45) {
                                                                                                      field_i[var0] = 256;
                                                                                                    } else {
                                                                                                      if (var0 == 46) {
                                                                                                        field_i[var0] = 256;
                                                                                                      } else {
                                                                                                        if (var0 != 47) {
                                                                                                          if (var0 != 48) {
                                                                                                            if (var0 != 49) {
                                                                                                              if (var0 != 50) {
                                                                                                                if (var0 != 51) {
                                                                                                                  if (52 == var0) {
                                                                                                                    field_i[var0] = 256;
                                                                                                                  } else {
                                                                                                                    if (53 != var0) {
                                                                                                                      if (54 == var0) {
                                                                                                                        field_i[var0] = 256;
                                                                                                                      } else {
                                                                                                                        if (55 == var0) {
                                                                                                                          field_i[var0] = 256;
                                                                                                                        } else {
                                                                                                                          if (56 != var0) {
                                                                                                                            if (var0 != 57) {
                                                                                                                              if (var0 != 58) {
                                                                                                                                if (var0 != 59) {
                                                                                                                                  if (60 != var0) {
                                                                                                                                    if (var0 != 61) {
                                                                                                                                      if (var0 == 62) {
                                                                                                                                        field_i[var0] = 256;
                                                                                                                                      } else {
                                                                                                                                        if (var0 != 63) {
                                                                                                                                          if (var0 != 64) {
                                                                                                                                            if (var0 != 65) {
                                                                                                                                              if (66 == var0) {
                                                                                                                                                field_i[var0] = 256;
                                                                                                                                              } else {
                                                                                                                                                if (var0 != 67) {
                                                                                                                                                  if (68 == var0) {
                                                                                                                                                    field_i[var0] = 256;
                                                                                                                                                  } else {
                                                                                                                                                    if (var0 != 69) {
                                                                                                                                                      if (70 == var0) {
                                                                                                                                                        field_i[var0] = 256;
                                                                                                                                                      } else {
                                                                                                                                                        if (var0 != 71) {
                                                                                                                                                          if (var0 == 72) {
                                                                                                                                                            field_i[var0] = 256;
                                                                                                                                                          } else {
                                                                                                                                                            if (var0 != 73) {
                                                                                                                                                              if (var0 != 74) {
                                                                                                                                                                if (var0 == 75) {
                                                                                                                                                                  field_i[var0] = 256;
                                                                                                                                                                } else {
                                                                                                                                                                  if (var0 == 76) {
                                                                                                                                                                    field_i[var0] = 256;
                                                                                                                                                                  } else {
                                                                                                                                                                    if (var0 != 77) {
                                                                                                                                                                      if (var0 == 78) {
                                                                                                                                                                        field_i[var0] = 256;
                                                                                                                                                                      } else {
                                                                                                                                                                        if (79 == var0) {
                                                                                                                                                                          field_i[var0] = 256;
                                                                                                                                                                        } else {
                                                                                                                                                                          if (80 != var0) {
                                                                                                                                                                            if (var0 == 81) {
                                                                                                                                                                              field_i[var0] = 50;
                                                                                                                                                                            } else {
                                                                                                                                                                              if (82 != var0) {
                                                                                                                                                                                if (var0 != 83) {
                                                                                                                                                                                  if (var0 == 84) {
                                                                                                                                                                                    field_i[var0] = 70;
                                                                                                                                                                                  } else {
                                                                                                                                                                                    if (var0 == 85) {
                                                                                                                                                                                      field_i[var0] = 70;
                                                                                                                                                                                    } else {
                                                                                                                                                                                      if (var0 == 86) {
                                                                                                                                                                                        field_i[var0] = 64;
                                                                                                                                                                                      } else {
                                                                                                                                                                                        if (var0 == 87) {
                                                                                                                                                                                          field_i[var0] = 64;
                                                                                                                                                                                        } else {
                                                                                                                                                                                          if (var0 == 88) {
                                                                                                                                                                                            field_i[var0] = 64;
                                                                                                                                                                                          } else {
                                                                                                                                                                                            field_i[var0] = 256;
                                                                                                                                                                                          }
                                                                                                                                                                                        }
                                                                                                                                                                                      }
                                                                                                                                                                                    }
                                                                                                                                                                                  }
                                                                                                                                                                                } else {
                                                                                                                                                                                  field_i[var0] = 100;
                                                                                                                                                                                }
                                                                                                                                                                              } else {
                                                                                                                                                                                field_i[var0] = 100;
                                                                                                                                                                              }
                                                                                                                                                                            }
                                                                                                                                                                          } else {
                                                                                                                                                                            field_i[var0] = 50;
                                                                                                                                                                          }
                                                                                                                                                                        }
                                                                                                                                                                      }
                                                                                                                                                                    } else {
                                                                                                                                                                      field_i[var0] = 256;
                                                                                                                                                                    }
                                                                                                                                                                  }
                                                                                                                                                                }
                                                                                                                                                              } else {
                                                                                                                                                                field_i[var0] = 256;
                                                                                                                                                              }
                                                                                                                                                            } else {
                                                                                                                                                              field_i[var0] = 256;
                                                                                                                                                            }
                                                                                                                                                          }
                                                                                                                                                        } else {
                                                                                                                                                          field_i[var0] = 256;
                                                                                                                                                        }
                                                                                                                                                      }
                                                                                                                                                    } else {
                                                                                                                                                      field_i[var0] = 256;
                                                                                                                                                    }
                                                                                                                                                  }
                                                                                                                                                } else {
                                                                                                                                                  field_i[var0] = 256;
                                                                                                                                                }
                                                                                                                                              }
                                                                                                                                            } else {
                                                                                                                                              field_i[var0] = 256;
                                                                                                                                            }
                                                                                                                                          } else {
                                                                                                                                            field_i[var0] = 256;
                                                                                                                                          }
                                                                                                                                        } else {
                                                                                                                                          field_i[var0] = 256;
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                    } else {
                                                                                                                                      field_i[var0] = 256;
                                                                                                                                    }
                                                                                                                                  } else {
                                                                                                                                    field_i[var0] = 256;
                                                                                                                                  }
                                                                                                                                } else {
                                                                                                                                  field_i[var0] = 256;
                                                                                                                                }
                                                                                                                              } else {
                                                                                                                                field_i[var0] = 256;
                                                                                                                              }
                                                                                                                            } else {
                                                                                                                              field_i[var0] = 256;
                                                                                                                            }
                                                                                                                          } else {
                                                                                                                            field_i[var0] = 256;
                                                                                                                          }
                                                                                                                        }
                                                                                                                      }
                                                                                                                    } else {
                                                                                                                      field_i[var0] = 256;
                                                                                                                    }
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  field_i[var0] = 256;
                                                                                                                }
                                                                                                              } else {
                                                                                                                field_i[var0] = 128;
                                                                                                              }
                                                                                                            } else {
                                                                                                              field_i[var0] = 256;
                                                                                                            }
                                                                                                          } else {
                                                                                                            field_i[var0] = 256;
                                                                                                          }
                                                                                                        } else {
                                                                                                          field_i[var0] = 256;
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    field_i[var0] = 256;
                                                                                                  }
                                                                                                } else {
                                                                                                  field_i[var0] = 155;
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            field_i[var0] = 64;
                                                                                          }
                                                                                        } else {
                                                                                          field_i[var0] = 64;
                                                                                        }
                                                                                      } else {
                                                                                        field_i[var0] = 64;
                                                                                      }
                                                                                    } else {
                                                                                      field_i[var0] = 55;
                                                                                    }
                                                                                  } else {
                                                                                    field_i[var0] = 40;
                                                                                  }
                                                                                }
                                                                              }
                                                                            } else {
                                                                              field_i[var0] = 64;
                                                                            }
                                                                          } else {
                                                                            field_i[var0] = 72;
                                                                          }
                                                                        } else {
                                                                          field_i[var0] = 50;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                } else {
                                                                  field_i[var0] = 80;
                                                                }
                                                              } else {
                                                                field_i[var0] = 50;
                                                              }
                                                            }
                                                          } else {
                                                            field_i[var0] = 80;
                                                          }
                                                        }
                                                      } else {
                                                        field_i[var0] = 30;
                                                      }
                                                    } else {
                                                      field_i[var0] = 30;
                                                    }
                                                  }
                                                }
                                              } else {
                                                field_i[var0] = 30;
                                              }
                                            } else {
                                              field_i[var0] = 30;
                                            }
                                          } else {
                                            field_i[var0] = 30;
                                          }
                                        } else {
                                          field_i[var0] = 30;
                                        }
                                      }
                                    } else {
                                      field_i[var0] = 30;
                                    }
                                  }
                                }
                              } else {
                                field_i[var0] = 30;
                              }
                            } else {
                              field_i[var0] = 30;
                            }
                          }
                        } else {
                          field_i[var0] = 30;
                        }
                      }
                    }
                  } else {
                    field_i[var0] = 20;
                  }
                } else {
                  field_i[var0] = 26;
                }
              }
            } else {
              field_i[var0] = 64;
            }
          } else {
            field_i[var0] = 64;
          }
          field_b[var0] = field_i[var0];
        }
        field_l = 0;
        field_a = "All players have left <%0>'s game.";
    }
}
