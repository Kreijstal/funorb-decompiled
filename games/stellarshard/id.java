/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class id implements uk, pj {
    int field_c;
    int field_h;
    int field_i;
    static oj field_g;
    bd field_a;
    private boolean field_b;
    int field_d;
    int field_j;
    int field_f;
    int field_o;
    static String field_l;
    int field_k;
    int field_m;
    private int field_e;
    int field_n;

    public final void a(rj param0, int param1, int param2, int param3, int param4, int param5) {
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        uj var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        vk var17 = null;
        vk var18 = null;
        var16 = stellarshard.field_B;
        try {
          L0: {
            if (param5 == param1) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0.e(param3)) {
                L1: {
                  var17 = this.b(param0, (byte) 111);
                  var18 = var17;
                  if (param5 >= param1) {
                    var9 = param5;
                    var8 = param1;
                    break L1;
                  } else {
                    var9 = param1;
                    var8 = param5;
                    break L1;
                  }
                }
                var10 = var18.a(111, var8);
                var11 = var18.a(62, var9);
                gg.a(23, param4 + (param0.field_w - -param0.field_p), param2 - -param0.field_k, param0.field_t + param0.field_k + param2, param0.field_w + param4);
                var12 = var10;
                L2: while (true) {
                  if (var11 < var12) {
                    id.b((byte) -58);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    L3: {
                      var13 = var17.field_a[var12];
                      if (var10 != var12) {
                        stackIn_14_0 = var13.field_a[0];
                        break L3;
                      } else {
                        stackIn_14_0 = var18.b(var8, param3 ^ 109);
                        break L3;
                      }
                    }
                    L4: {
                      var14 = stackIn_14_0;
                      if (var12 == var11) {
                        stackIn_19_0 = var18.b(var9, -128);
                        break L4;
                      } else {
                        if (var13 == null) {
                          stackIn_19_0 = 0;
                          break L4;
                        } else {
                          stackIn_19_0 = var13.field_a[-1 + var13.field_a.length];
                          break L4;
                        }
                      }
                    }
                    var15 = stackIn_19_0;
                    n.field_i.a(this.a(param0, var14, param4, false), this.field_o, this.field_o >>> -783129448, param0.field_n + (param2 + param0.field_k) - -this.field_c - -var13.field_b, var13.field_c, var15 + -var14, (byte) 76);
                    var12++;
                    continue L2;
                  }
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var7);

            stackIn_24_1 = new StringBuilder().append("id.Q(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L5;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L5;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void a(int param0, boolean param1, int param2, rj param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        uj var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        vk var13 = null;
        vk var14 = null;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_5_0;
        int stackIn_5_1;
        int stackIn_5_2;
        int stackIn_5_3;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3.e(0)) {
                L2: {
                  var13 = this.b(param3, (byte) 100);
                  var14 = var13;
                  var7 = var14.a(74, param0);
                  var8 = var13.field_a[var7];
                  var9 = var14.b(param0, -126);
                  var10 = this.a(param3, var9, param4, false);
                  var11 = this.a((byte) -64, param3, param2) + Math.max(0, var8.field_b);
                  stackIn_4_0 = this.a((byte) -117, param3, param2);

                  stackIn_4_1 = this.a((byte) -89, param3);

                  stackIn_4_2 = var8.field_c;

                  if (1 + var7 >= var14.field_a.length) {
                    stackIn_5_0 = stackIn_4_0;
                    stackIn_5_1 = stackIn_4_1;
                    stackIn_5_2 = stackIn_4_2;
                    stackIn_5_3 = var8.field_c;
                    break L2;
                  } else {
                    stackIn_5_0 = stackIn_4_0;
                    stackIn_5_1 = stackIn_4_1;
                    stackIn_5_2 = stackIn_4_2;
                    stackIn_5_3 = var13.field_a[1 + var7].field_b;
                    break L2;
                  }
                }
                var12 = stackIn_5_0 + Math.min(stackIn_5_1, Math.min(stackIn_5_2, stackIn_5_3));
                gg.a(61, param4 - (-param3.field_w - param3.field_p), param3.field_k + param2, param2 - (-param3.field_k + -param3.field_t), param3.field_w + param4);
                n.field_i.a(this.field_n, var11, 10066329, var10, var10, var12);
                id.b((byte) -58);
                break L1;
              } else {
                break L1;
              }
            }
            if (!param1) {
              break L0;
            } else {
              this.field_j = -62;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var6);

            stackIn_11_1 = new StringBuilder().append("id.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param4 + ')');
        }
    }

    public final int a(int param0, rj param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 0) {
              stackIn_4_0 = this.a(param1, 0, param2, false);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 44;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("id.T(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final int a(rj param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 28361) {
                break L1;
              } else {
                id.a(true);
                break L1;
              }
            }
            this.b(param0, (byte) 125);
            stackIn_3_0 = param0.field_r.a(17201) - -this.field_c + this.field_k;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("id.U(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public final int a(byte param0) {
        if (param0 != -73) {
          field_l = (String) null;
          return this.field_a.field_N + this.field_a.field_r;
        } else {
          return this.field_a.field_N + this.field_a.field_r;
        }
    }

    final static boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        pf.field_c = true;
        if (param0 != -4) {
          L0: {
            field_l = (String) null;
            vc.field_a = 15000L + ih.a((byte) -98);
            if (eg.field_d != 11) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            vc.field_a = 15000L + ih.a((byte) -98);
            if (eg.field_d != 11) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public final int a(rj param0, byte param1) {
        RuntimeException var3 = null;
        rj var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 >= 25) {
                break L1;
              } else {
                var4 = (rj) null;
                this.a(-8, -64, -12, -116, -119, -62, (rj) null, 87);
                break L1;
              }
            }
            this.b(param0, (byte) 111);
            stackIn_3_0 = param0.field_r.a(false) - (-this.field_m + -this.field_f);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("id.O(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    private final int a(int param0, rj param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 < -122) {
              stackIn_4_0 = param1.field_k + (param3 + this.field_c) + (param1.field_n - -param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 14;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("id.AA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != 1392322465) {
            field_g = (oj) null;
            field_l = null;
            return;
        }
        field_l = null;
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, rj param6, int param7) {
        int discarded$0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        rj var14 = null;
        var13 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              gg.a(83, param3 + (param6.field_w + param6.field_p), param2 + param6.field_k, param6.field_k + param2 - -param6.field_t, param6.field_w + param3);
              var9_int = this.a(param0 + -27246, param6);
              var10 = this.a((byte) -89, param6);
              if (!this.field_b) {
                L2: {
                  var12 = this.field_d;
                  if (0 != var12) {
                    if ((var12 ^ -1) != -3) {
                      L3: {
                        if (3 == var12) {
                          break L3;
                        } else {
                          if (var12 == 1) {
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var11 = (-this.field_a.field_r + var10 - this.field_a.field_N >> -474684703) + this.field_a.field_N;
                      break L2;
                    } else {
                      var11 = var10 - this.field_a.field_r;
                      break L2;
                    }
                  } else {
                    var11 = this.field_a.field_N;
                    break L2;
                  }
                }
                L4: {
                  var12 = this.field_h;
                  if (var12 != 0) {
                    if (-4 != (var12 ^ -1)) {
                      if (1 != var12) {
                        if (2 == var12) {
                          this.field_a.b(this.b(param6, 0), this.a(param6, param4, param3, false) - -var9_int, var11 + this.a(param5, param6, (byte) -127, param2), param7, param1);
                          break L1;
                        } else {
                          break L1;
                        }
                      } else {
                        this.field_a.c(this.b(param6, 0), this.a(param6, param4, param3, false) + (var9_int >> 650109889), var11 + this.a(param5, param6, (byte) -127, param2), param7, param1);
                        break L1;
                      }
                    } else {
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                this.field_a.a(this.b(param6, param0 ^ 0), this.a(param6, param4, param3, false), this.a(param5, param6, (byte) -128, param2) + var11, param7, param1);
                break L1;
              } else {
                this.field_a.a(this.b(param6, 0), this.a(param6, param4, param3, false), this.a(param5, param6, (byte) -126, param2), var9_int, var10, param7, param1, this.field_h, this.field_d, this.field_j);
                break L1;
              }
            }
            id.b((byte) -58);
            if (param0 == 0) {
              break L0;
            } else {
              var14 = (rj) null;
              discarded$0 = this.a((byte) 2, (rj) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var9 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var9);

            stackIn_29_1 = new StringBuilder().append("id.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L5;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L5;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param7 + ')');
        }
    }

    public void a(boolean param0, int param1, int param2, rj param3, int param4) {
        if (null == this.field_a) {
            return;
        }
        try {
            if (param4 != 4549) {
                this.field_c = 84;
            }
            this.a(param3, param1, 0, param2);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "id.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    private final void b(byte param0, rj param1) {
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              if (param1.field_r != null) {
                break L1;
              } else {
                param1.field_r = (vk) ((Object) new pd());
                break L1;
              }
            }
            L2: {
              var3_int = this.a(-27246, param1);
              var4 = this.a((byte) -89, param1);
              if (param0 > 77) {
                break L2;
              } else {
                this.field_e = 29;
                break L2;
              }
            }
            L3: {
              var6 = this.field_d;
              if (var6 != 0) {
                if (2 != var6) {
                  L4: {
                    if (-4 != (var6 ^ -1)) {
                      if (1 != var6) {
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  var5 = (var4 - this.field_a.field_N - this.field_a.field_r >> 1392322465) + this.field_a.field_N;
                  break L3;
                } else {
                  var5 = -this.field_a.field_r + var4;
                  break L3;
                }
              } else {
                var5 = this.field_a.field_N;
                break L3;
              }
            }
            L5: {
              L6: {
                var6 = this.field_h;
                if (-1 != (var6 ^ -1)) {
                  if (var6 != 3) {
                    if (-2 != (var6 ^ -1)) {
                      if (var6 != 2) {
                        break L5;
                      } else {
                        if (param1.field_r instanceof pd) {
                          ((pd) ((Object) param1.field_r)).a(var3_int, this.field_a, var5, this.b(param1, 0), (byte) 22);
                          break L5;
                        } else {
                          return;
                        }
                      }
                    } else {
                      if (!(param1.field_r instanceof pd)) {
                        break L5;
                      } else {
                        ((pd) ((Object) param1.field_r)).a(true, this.b(param1, 0), var5, var3_int >> 588558657, this.field_a);
                        return;
                      }
                    }
                  } else {
                    break L6;
                  }
                } else {
                  break L6;
                }
              }
              if (!(param1.field_r instanceof pd)) {
                break L5;
              } else {
                ((pd) ((Object) param1.field_r)).a(0, this.field_a, this.b(param1, 0), 0, var5);
                return;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var3);

            stackIn_34_1 = new StringBuilder().append("id.W(").append(param0).append(',');

            if (param1 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L7;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L7;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ')');
        }
    }

    final static void a(boolean param0) {
        try {
            Throwable decompiledCaughtException = null;
            IOException var1 = null;
            int var1_int = 0;
            RuntimeException var1_ref = null;
            IOException var2 = null;
            int var3 = 0;
            var3 = stellarshard.field_B;
            try {
              L0: {
                L1: {
                  if (od.field_v != null) {
                    od.field_v.a((byte) 112);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (ib.field_k == null) {
                    break L2;
                  } else {
                    ib.field_k.a((byte) -103);
                    break L2;
                  }
                }
                L3: {
                  if (param0) {
                    break L3;
                  } else {
                    id.a(true);
                    break L3;
                  }
                }
                L4: {
                  if (ma.field_s == null) {
                    break L4;
                  } else {
                    try {
                      L5: {
                        ma.field_s.a(-4506);
                        break L5;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L6: {
                        var1 = (IOException) (Object) decompiledCaughtException;
                        break L6;
                      }
                    }
                    break L4;
                  }
                }
                L7: {
                  if (null == df.field_d) {
                    break L7;
                  } else {
                    var1_int = 0;
                    L8: while (true) {
                      if (df.field_d.length <= var1_int) {
                        break L7;
                      } else {
                        L9: {
                          if (df.field_d[var1_int] != null) {
                            try {
                              L10: {
                                df.field_d[var1_int].a(-4506);
                                break L10;
                              }
                            } catch (java.io.IOException decompiledCaughtParameter1) {
                              decompiledCaughtException = decompiledCaughtParameter1;
                              L11: {
                                var2 = (IOException) (Object) decompiledCaughtException;
                                break L11;
                              }
                            }
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        var1_int++;
                        continue L8;
                      }
                    }
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw ma.a((Throwable) ((Object) var1_ref), "id.CA(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int a(rj param0, int param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        rj var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param3) {
                break L1;
              } else {
                var6 = (rj) null;
                this.b((rj) null, 81);
                break L1;
              }
            }
            stackIn_3_0 = param0.field_l + (param2 + param0.field_w + this.field_m) - -param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("id.IA(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    public final vk b(rj param0, byte param1) {
        RuntimeException var3 = null;
        vk stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != param0.field_r) {
                break L1;
              } else {
                param0.field_r = (vk) ((Object) new pd());
                break L1;
              }
            }
            L2: {
              if (!this.field_b) {
                this.b((byte) 122, param0);
                break L2;
              } else {
                ((pd) ((Object) param0.field_r)).a(this.field_d, this.field_j, this.a(-27246, param0), this.field_h, this.field_a, this.a((byte) -89, param0), this.b(param0, 0), (byte) -100);
                break L2;
              }
            }
            L3: {
              if (param1 > 93) {
                break L3;
              } else {
                this.field_b = true;
                break L3;
              }
            }
            stackIn_8_0 = param0.field_r;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("id.L(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_8_0;
    }

    public final int a(int param0, rj param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -27246) {
                break L1;
              } else {
                this.field_i = 49;
                break L1;
              }
            }
            stackIn_3_0 = -this.field_m + param1.field_p + -this.field_f;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("id.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    String b(rj param0, int param1) {
        int discarded$1 = 0;
        RuntimeException var3 = null;
        rj var4 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                var4 = (rj) null;
                discarded$1 = this.a((byte) -122, (rj) null);
                break L1;
              }
            }
            stackIn_3_0 = param0.field_m;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("id.JA(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    id(bd param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    public final int a(int param0, rj param1, int param2, int param3, int param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.b(param1, (byte) 115);
            var7_int = 63 % ((-53 - param0) / 37);
            stackIn_1_0 = param1.field_r.a(param5 + -this.a(0, param1, param2), (byte) -53, -this.a((byte) 118, param1, param4) + param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var7);

            stackIn_4_1 = new StringBuilder().append("id.N(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_1_0;
    }

    public final int a(byte param0, rj param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = -54 % ((param0 - 46) / 41);
            stackIn_1_0 = this.a(0, param1, (byte) -126, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4);

            stackIn_4_1 = new StringBuilder().append("id.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    private final int a(byte param0, rj param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -89) {
                break L1;
              } else {
                this.field_b = false;
                break L1;
              }
            }
            stackIn_3_0 = -this.field_k + param1.field_t + -this.field_c;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("id.HA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void b(byte param0) {
        ma var1_ref = null;
        Object var1 = null;
        if (param0 != -58) {
            id.b(46);
            var1_ref = (ma) ((Object) dd.field_g.c((byte) -111));
            if (!(var1_ref != null)) {
                throw new IllegalStateException();
            }
            ti.a(var1_ref.field_p, var1_ref.field_q, var1_ref.field_r);
            ti.d(var1_ref.field_t, var1_ref.field_u, var1_ref.field_n, var1_ref.field_l);
            var1_ref.field_p = null;
            mb.field_b.b(param0 + -61, var1_ref);
            return;
        }
        var1_ref = (ma) ((Object) dd.field_g.c((byte) -111));
        if (!(var1_ref != null)) {
            throw new IllegalStateException();
        }
        ti.a(var1_ref.field_p, var1_ref.field_q, var1_ref.field_r);
        ti.d(var1_ref.field_t, var1_ref.field_u, var1_ref.field_n, var1_ref.field_l);
        var1_ref.field_p = null;
        mb.field_b.b(param0 + -61, var1_ref);
    }

    private final void a(rj param0, int param1, int param2, int param3) {
        try {
            this.a(param2, this.field_e, param3, param1, 0, 0, param0, this.field_i);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "id.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    protected id() {
    }

    final void a(id param0, byte param1) {
        try {
            param0.field_f = this.field_f;
            param0.field_d = this.field_d;
            param0.field_m = this.field_m;
            param0.field_o = this.field_o;
            param0.field_b = this.field_b;
            param0.field_c = this.field_c;
            param0.field_e = this.field_e;
            param0.field_j = this.field_j;
            param0.field_a = this.field_a;
            param0.field_n = this.field_n;
            if (param1 != -34) {
                this.field_d = -80;
            }
            param0.field_k = this.field_k;
            param0.field_i = this.field_i;
            param0.field_h = this.field_h;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "id.GA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    id(bd param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
            this.field_h = param7;
            this.field_c = param3;
            this.field_j = param9;
            this.field_o = param11;
            this.field_b = param12 ? true : false;
            this.field_m = param1;
            this.field_e = param6;
            this.field_f = param2;
            this.field_i = param5;
            this.field_a = param0;
            this.field_n = param10;
            this.field_k = param4;
            this.field_d = param8;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "id.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    static {
        field_g = new oj();
        field_l = "Mouse over an icon for details";
    }
}
