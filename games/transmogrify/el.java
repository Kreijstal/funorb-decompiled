/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el {
    private int field_u;
    int[] field_s;
    static ce field_n;
    int field_b;
    static int[] field_m;
    static boolean field_g;
    private int[][] field_o;
    private int[] field_k;
    int[] field_i;
    int[] field_c;
    private byte[] field_e;
    int field_l;
    db[] field_t;
    int field_r;
    db field_h;
    int[] field_q;
    int[] field_j;
    byte[][] field_p;
    int[][] field_f;
    static String field_a;
    static int field_d;

    private final void a(byte[] param0, byte param1) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int[] array$2 = null;
        int dupTemp$3 = 0;
        int[] dupTemp$4 = null;
        int[] array$5 = null;
        int dupTemp$6 = 0;
        int[] dupTemp$7 = null;
        int[] array$8 = null;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_98_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        oa var17 = null;
        byte[] var21 = null;
        var16 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var17 = new oa(lk.a(-110, param0));
              var4 = var17.d((byte) 85);
              if (var4 < 5) {
                break L1;
              } else {
                if (var4 > 7) {
                  break L1;
                } else {
                  L2: {
                    if (6 <= var4) {
                      this.field_b = var17.c((byte) -108);
                      break L2;
                    } else {
                      this.field_b = 0;
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.d((byte) 52);
                    if ((var5 & 1) == 0) {
                      stackIn_11_0 = 0;
                      break L3;
                    } else {
                      stackIn_11_0 = 1;
                      break L3;
                    }
                  }
                  L4: {
                    var6 = stackIn_11_0;
                    if (var4 >= 7) {
                      this.field_u = var17.h(-16777216);
                      break L4;
                    } else {
                      this.field_u = var17.a((byte) -102);
                      break L4;
                    }
                  }
                  L5: {
                    if (0 == (var5 & 2)) {
                      stackIn_17_0 = 0;
                      break L5;
                    } else {
                      stackIn_17_0 = 1;
                      break L5;
                    }
                  }
                  L6: {
                    var7 = stackIn_17_0;
                    var8 = 0;
                    this.field_c = new int[this.field_u];
                    var9 = -1;
                    if ((var4 ^ -1) > -8) {
                      var10 = 0;
                      L7: while (true) {
                        if (this.field_u <= var10) {
                          break L6;
                        } else {
                          dupTemp$0 = var8 + var17.a((byte) -95);
                          var8 = dupTemp$0;
                          this.field_c[var10] = dupTemp$0;
                          if (this.field_c[var10] > var9) {
                            var9 = this.field_c[var10];
                            var10++;
                            continue L7;
                          } else {
                            var10++;
                            continue L7;
                          }
                        }
                      }
                    } else {
                      var10 = 0;
                      L8: while (true) {
                        if (this.field_u <= var10) {
                          break L6;
                        } else {
                          dupTemp$1 = var8 + var17.h(-16777216);
                          var8 = dupTemp$1;
                          this.field_c[var10] = dupTemp$1;
                          if ((var9 ^ -1) > (this.field_c[var10] ^ -1)) {
                            var9 = this.field_c[var10];
                            var10++;
                            continue L8;
                          } else {
                            var10++;
                            continue L8;
                          }
                        }
                      }
                    }
                  }
                  L9: {
                    this.field_l = var9 - -1;
                    this.field_q = new int[this.field_l];
                    this.field_j = new int[this.field_l];
                    this.field_i = new int[this.field_l];
                    this.field_f = new int[this.field_l][];
                    this.field_s = new int[this.field_l];
                    if (var7 == 0) {
                      break L9;
                    } else {
                      this.field_p = new byte[this.field_l][];
                      break L9;
                    }
                  }
                  L10: {
                    if (var6 != 0) {
                      this.field_k = new int[this.field_l];
                      var10 = 0;
                      L11: while (true) {
                        if (var10 >= this.field_l) {
                          var10 = 0;
                          L12: while (true) {
                            if (var10 >= this.field_u) {
                              this.field_h = new db(this.field_k);
                              break L10;
                            } else {
                              this.field_k[this.field_c[var10]] = var17.c((byte) -128);
                              var10++;
                              continue L12;
                            }
                          }
                        } else {
                          this.field_k[var10] = -1;
                          var10++;
                          continue L11;
                        }
                      }
                    } else {
                      break L10;
                    }
                  }
                  L13: {
                    if (param1 <= -111) {
                      break L13;
                    } else {
                      el.a(-92);
                      break L13;
                    }
                  }
                  var10 = 0;
                  L14: while (true) {
                    if (this.field_u <= var10) {
                      L15: {
                        if (var7 == 0) {
                          break L15;
                        } else {
                          var10 = 0;
                          L16: while (true) {
                            if (this.field_u <= var10) {
                              break L15;
                            } else {
                              var21 = new byte[64];
                              var17.a(64, 2, var21, 0);
                              this.field_p[this.field_c[var10]] = var21;
                              var10++;
                              continue L16;
                            }
                          }
                        }
                      }
                      var10 = 0;
                      L17: while (true) {
                        if (this.field_u <= var10) {
                          L18: {
                            if (var4 >= 7) {
                              var10 = 0;
                              L19: while (true) {
                                if (var10 >= this.field_u) {
                                  var10 = 0;
                                  L20: while (true) {
                                    if (this.field_u <= var10) {
                                      break L18;
                                    } else {
                                      var11 = this.field_c[var10];
                                      var8 = 0;
                                      var12 = this.field_s[var11];
                                      array$2 = new int[var12];
                                      this.field_f[var11] = array$2;
                                      var13 = -1;
                                      var14 = 0;
                                      L21: while (true) {
                                        if (var12 <= var14) {
                                          L22: {
                                            this.field_i[var11] = 1 + var13;
                                            if (var12 != var13 - -1) {
                                              break L22;
                                            } else {
                                              this.field_f[var11] = null;
                                              break L22;
                                            }
                                          }
                                          var10++;
                                          continue L20;
                                        } else {
                                          dupTemp$3 = var8 + var17.h(-16777216);
                                          var8 = dupTemp$3;
                                          dupTemp$4 = this.field_f[var11];
                                          dupTemp$4[var14] = dupTemp$3;
                                          var15 = dupTemp$3;
                                          if (var15 > var13) {
                                            var13 = var15;
                                            var14++;
                                            continue L21;
                                          } else {
                                            var14++;
                                            continue L21;
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  this.field_s[this.field_c[var10]] = var17.h(-16777216);
                                  var10++;
                                  continue L19;
                                }
                              }
                            } else {
                              var10 = 0;
                              L23: while (true) {
                                if (this.field_u <= var10) {
                                  var10 = 0;
                                  L24: while (true) {
                                    if (this.field_u <= var10) {
                                      break L18;
                                    } else {
                                      var11 = this.field_c[var10];
                                      var12 = this.field_s[var11];
                                      var8 = 0;
                                      array$5 = new int[var12];
                                      this.field_f[var11] = array$5;
                                      var13 = -1;
                                      var14 = 0;
                                      L25: while (true) {
                                        if (var12 <= var14) {
                                          L26: {
                                            this.field_i[var11] = 1 + var13;
                                            if (var13 + 1 == var12) {
                                              this.field_f[var11] = null;
                                              break L26;
                                            } else {
                                              break L26;
                                            }
                                          }
                                          var10++;
                                          continue L24;
                                        } else {
                                          L27: {
                                            dupTemp$6 = var8 + var17.a((byte) -96);
                                            var8 = dupTemp$6;
                                            dupTemp$7 = this.field_f[var11];
                                            dupTemp$7[var14] = dupTemp$6;
                                            var15 = dupTemp$6;
                                            if (var13 < var15) {
                                              var13 = var15;
                                              break L27;
                                            } else {
                                              break L27;
                                            }
                                          }
                                          var14++;
                                          continue L25;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  this.field_s[this.field_c[var10]] = var17.a((byte) -121);
                                  var10++;
                                  continue L23;
                                }
                              }
                            }
                          }
                          L28: {
                            if (var6 != 0) {
                              this.field_t = new db[var9 + 1];
                              this.field_o = new int[var9 + 1][];
                              var10 = 0;
                              L29: while (true) {
                                if (this.field_u <= var10) {
                                  break L28;
                                } else {
                                  var11 = this.field_c[var10];
                                  var12 = this.field_s[var11];
                                  array$8 = new int[this.field_i[var11]];
                                  this.field_o[var11] = array$8;
                                  var13 = 0;
                                  L30: while (true) {
                                    if (this.field_i[var11] <= var13) {
                                      var13 = 0;
                                      L31: while (true) {
                                        if (var12 <= var13) {
                                          this.field_t[var11] = new db(this.field_o[var11]);
                                          var10++;
                                          continue L29;
                                        } else {
                                          L32: {
                                            if (this.field_f[var11] != null) {
                                              var14 = this.field_f[var11][var13];
                                              break L32;
                                            } else {
                                              var14 = var13;
                                              break L32;
                                            }
                                          }
                                          this.field_o[var11][var14] = var17.c((byte) -126);
                                          var13++;
                                          continue L31;
                                        }
                                      }
                                    } else {
                                      this.field_o[var11][var13] = -1;
                                      var13++;
                                      continue L30;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L28;
                            }
                          }
                          break L0;
                        } else {
                          this.field_q[this.field_c[var10]] = var17.c((byte) -123);
                          var10++;
                          continue L17;
                        }
                      }
                    } else {
                      this.field_j[this.field_c[var10]] = var17.c((byte) -127);
                      var10++;
                      continue L14;
                    }
                  }
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L33: {
            var3 = decompiledCaughtException;
            stackIn_97_0 = (RuntimeException) (var3);

            stackIn_97_1 = new StringBuilder().append("el.F(");

            if (param0 == null) {
              stackIn_98_0 = (RuntimeException) ((Object) stackIn_97_0);
              stackIn_98_1 = (StringBuilder) ((Object) stackIn_97_1);
              stackIn_98_2 = "null";
              break L33;
            } else {
              stackIn_98_0 = (RuntimeException) ((Object) stackIn_97_0);
              stackIn_98_1 = (StringBuilder) ((Object) stackIn_97_1);
              stackIn_98_2 = "{...}";
              break L33;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_98_0), stackIn_98_2 + ',' + param1 + ')');
        }
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 >= param1) {
                break L1;
              } else {
                if (param1 < 128) {
                  stackIn_8_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param1 < 160) {
                break L2;
              } else {
                if (param1 > 255) {
                  break L2;
                } else {
                  return true;
                }
              }
            }
            L3: {
              if (param1 != 0) {
                var6 = af.field_a;
                var2 = var6;
                var3 = 0;
                L4: while (true) {
                  if (var6.length <= var3) {
                    break L3;
                  } else {
                    var4 = var6[var3];
                    if (param1 == var4) {
                      stackIn_16_0 = 1;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var3++;
                      continue L4;
                    }
                  }
                }
              } else {
                break L3;
              }
            }
            L5: {
              if (param0 == -9904) {
                break L5;
              } else {
                field_n = (ce) null;
                break L5;
              }
            }
            stackIn_21_0 = 0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var2_ref), "el.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0 != 0;
          } else {
            return stackIn_21_0 != 0;
          }
        }
    }

    final static void b(int param0) {
        int var1_int = 0;
        int var2 = Transmogrify.field_A ? 1 : 0;
        try {
            th.field_c.a(0);
            for (var1_int = 0; var1_int < 32; var1_int++) {
                kd.field_b[var1_int] = 0L;
            }
            if (param0 != -6491) {
                el.a(5);
            }
            for (var1_int = 0; var1_int < 32; var1_int++) {
                ik.field_ib[var1_int] = 0L;
            }
            ca.field_b = 0;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "el.E(" + param0 + ')');
        }
    }

    final static void a(int param0, byte param1, String param2, String[] param3) {
        int var5 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 33) {
                break L1;
              } else {
                el.a((byte) -81);
                break L1;
              }
            }
            L2: {
              rh.field_v = gd.field_l;
              if (-256 != (param0 ^ -1)) {
                L3: {
                  if (-101 < (param0 ^ -1)) {
                    break L3;
                  } else {
                    if (param0 <= 105) {
                      q.field_h = ve.a(param3, (byte) -113);
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                q.field_h = mk.a(242763393, param2, param0);
                break L2;
              } else {
                L4: {
                  if (ab.field_j >= 13) {
                    stackIn_7_0 = 0;
                    break L4;
                  } else {
                    stackIn_7_0 = 1;
                    break L4;
                  }
                }
                q.field_h = de.a(stackIn_7_0 != 0, (byte) -116);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4);

            stackIn_16_1 = new StringBuilder().append("el.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
        }
    }

    final static boolean a(int param0) {
        if (param0 <= 116) {
            return true;
        }
        return c.field_d;
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 < 75) {
            field_a = (String) null;
        }
        field_m = null;
        field_n = null;
    }

    el(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            this.field_r = v.a(param0, param0.length, (byte) 40);
            if (this.field_r != param1) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (param2.length != 64) {
                    throw new RuntimeException();
                }
                this.field_e = n.a(param0, param0.length, -5705, 0);
                for (var4_int = 0; var4_int < 64; var4_int++) {
                    if (param2[var4_int] != this.field_e[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(param0, (byte) -114);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "el.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = new int[8192];
        field_a = "Go Back";
        field_n = new ce();
        field_d = -1;
    }
}
