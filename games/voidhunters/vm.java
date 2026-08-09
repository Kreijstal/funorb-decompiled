/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vm extends le {
    static String field_q;
    private int field_o;
    private short[] field_k;
    private int field_i;
    private byte[] field_j;
    private int field_n;
    private int field_l;
    private int field_p;
    private int field_m;

    final void c(byte param0) {
        this.field_j = ihb.a((byte) 36, this.field_l);
        this.d(30866);
        if (param0 > -35) {
            ds var3 = (ds) null;
            this.a(-21, 74, (ds) null);
        }
    }

    public vm() {
        super(0, true);
        this.field_j = new byte[512];
        this.field_o = 2;
        this.field_l = 0;
        this.field_k = new short[512];
        this.field_i = 2048;
        this.field_n = 1;
        this.field_m = 5;
        this.field_p = 5;
    }

    private final void d(int param0) {
        int var3 = 0;
        int var4 = VoidHunters.field_G;
        Random var5 = new Random((long)this.field_l);
        Random var2 = var5;
        if (param0 != 30866) {
            this.c((byte) 124);
        }
        this.field_k = new short[512];
        if (!((this.field_i ^ -1) >= -1)) {
            for (var3 = 0; 512 > var3; var3++) {
                this.field_k[var3] = (short)hob.a(var5, this.field_i, 120);
            }
        }
    }

    final void a(int param0, int param1, ds param2) {
        int dupTemp$0 = 0;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var4_int = param0;
              if (var4_int != 0) {
                if ((var4_int ^ -1) == -2) {
                  this.field_l = param2.e((byte) -127);
                  break L1;
                } else {
                  if (var4_int == 2) {
                    this.field_i = param2.e(1869);
                    break L1;
                  } else {
                    if (-4 != (var4_int ^ -1)) {
                      if (var4_int == 4) {
                        this.field_n = param2.e((byte) -97);
                        break L1;
                      } else {
                        if (var4_int == 5) {
                          this.field_m = param2.e((byte) -97);
                          break L1;
                        } else {
                          if (var4_int == 6) {
                            this.field_p = param2.e((byte) -87);
                            break L1;
                          } else {
                            break L1;
                          }
                        }
                      }
                    } else {
                      this.field_o = param2.e((byte) -108);
                      break L1;
                    }
                  }
                }
              } else {
                dupTemp$0 = param2.e((byte) -123);
                this.field_p = dupTemp$0;
                this.field_m = dupTemp$0;
                break L1;
              }
            }
            L2: {
              if (param1 < -60) {
                break L2;
              } else {
                this.field_l = -121;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var4);

            stackIn_23_1 = new StringBuilder().append("vm.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L3;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
    }

    final int[] a(int param0, boolean param1) {
        int incrementValue$0 = 0;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_14_0;
        int stackIn_14_1;
        byte[] stackIn_14_2;
        int stackIn_14_3;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        byte[] stackIn_15_2 = null;
        int stackIn_15_3 = 0;
        int stackIn_15_4 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_37_0 = 0;
        double stackIn_39_0 = 0.0;
        double stackIn_40_0 = 0.0;
        int stackIn_40_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_48_1 = 0;
        int[] var3;
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
        int var16;
        int var17;
        int var18;
        int var19;
        L0: {
          var19 = VoidHunters.field_G;
          if (param1) {
            break L0;
          } else {
            this.c((byte) 33);
            break L0;
          }
        }
        L1: {
          var3 = this.field_f.a((byte) 118, param0);
          if (!this.field_f.field_e) {
            break L1;
          } else {
            var4 = 2048 - -(sj.field_p[param0] * this.field_p);
            var5 = var4 >> -730743732;
            var6 = var5 + 1;
            var14 = 0;
            L2: while (true) {
              if (hob.field_d <= var14) {
                break L1;
              } else {
                woa.field_b = 2147483647;
                qd.field_b = 2147483647;
                fd.field_q = 2147483647;
                hi.field_b = 2147483647;
                var15 = 2048 - -(grb.field_l[var14] * this.field_m);
                var16 = var15 >> 699867244;
                var17 = var16 - -1;
                var8 = var5 + -1;
                L3: while (true) {
                  if (var6 < var8) {
                    var18 = this.field_o;
                    if (0 == var18) {
                      var3[var14] = fd.field_q;
                      var14++;
                      continue L2;
                    } else {
                      if (var18 == 1) {
                        var3[var14] = hi.field_b;
                        var14++;
                        continue L2;
                      } else {
                        if (var18 != 3) {
                          if (4 != var18) {
                            if (2 == var18) {
                              var3[var14] = -fd.field_q + hi.field_b;
                              var14++;
                              continue L2;
                            } else {
                              var14++;
                              continue L2;
                            }
                          } else {
                            var3[var14] = woa.field_b;
                            var14++;
                            continue L2;
                          }
                        } else {
                          var3[var14] = qd.field_b;
                          var14++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    L4: {
                      stackIn_9_0 = this.field_j;

                      if (var8 < this.field_p) {
                        stackIn_10_0 = (byte[]) ((Object) stackIn_9_0);
                        stackIn_10_1 = var8;
                        break L4;
                      } else {
                        stackIn_10_0 = (byte[]) ((Object) stackIn_9_0);
                        stackIn_10_1 = var8 + -this.field_p;
                        break L4;
                      }
                    }
                    var12 = stackIn_10_0[stackIn_10_1 & 255] & 255;
                    var7 = var16 - 1;
                    L5: while (true) {
                      if (var7 > var17) {
                        var8++;
                        continue L3;
                      } else {
                        L6: {
                          stackIn_14_0 = 2;

                          stackIn_14_1 = 255;

                          stackIn_14_2 = this.field_j;

                          stackIn_14_3 = 255;

                          if (this.field_m <= var7) {
                            stackIn_15_0 = stackIn_14_0;
                            stackIn_15_1 = stackIn_14_1;
                            stackIn_15_2 = (byte[]) ((Object) stackIn_14_2);
                            stackIn_15_3 = stackIn_14_3;
                            stackIn_15_4 = -this.field_m + var7;
                            break L6;
                          } else {
                            stackIn_15_0 = stackIn_14_0;
                            stackIn_15_1 = stackIn_14_1;
                            stackIn_15_2 = (byte[]) ((Object) stackIn_14_2);
                            stackIn_15_3 = stackIn_14_3;
                            stackIn_15_4 = var7;
                            break L6;
                          }
                        }
                        L7: {
                          var13 = stackIn_15_0 * (stackIn_15_1 & stackIn_15_2[stackIn_15_3 & stackIn_15_4 + var12]);
                          incrementValue$0 = var13;
                          var13++;
                          var9 = -this.field_k[incrementValue$0] - ((var7 << 428799404) - var15);
                          var10 = var4 - ((var8 << -1055692244) + this.field_k[var13]);
                          var18 = this.field_n;
                          if (var18 != 1) {
                            if (var18 != 3) {
                              if ((var18 ^ -1) == -5) {
                                L8: {
                                  if (0 > var9) {
                                    stackIn_37_0 = -var9;
                                    break L8;
                                  } else {
                                    stackIn_37_0 = var9;
                                    break L8;
                                  }
                                }
                                L9: {
                                  var9 = (int)(Math.sqrt((double)((float)stackIn_37_0 / 4096.0f)) * 4096.0);
                                  stackIn_39_0 = 4096.0;

                                  if (var10 < 0) {
                                    stackIn_40_0 = stackIn_39_0;
                                    stackIn_40_1 = -var10;
                                    break L9;
                                  } else {
                                    stackIn_40_0 = stackIn_39_0;
                                    stackIn_40_1 = var10;
                                    break L9;
                                  }
                                }
                                var10 = (int)(stackIn_40_0 * Math.sqrt((double)((float)stackIn_40_1 / 4096.0f)));
                                var11 = var9 - -var10;
                                var11 = var11 * var11 >> -66676148;
                                break L7;
                              } else {
                                if (5 == var18) {
                                  var10 = var10 * var10;
                                  var9 = var9 * var9;
                                  var11 = (int)(4096.0 * Math.sqrt(Math.sqrt((double)((float)(var9 + var10) / 16777216.0f))));
                                  break L7;
                                } else {
                                  if (-3 != (var18 ^ -1)) {
                                    var11 = (int)(Math.sqrt((double)((float)(var9 * var9 - -(var10 * var10)) / 16777216.0f)) * 4096.0);
                                    break L7;
                                  } else {
                                    L10: {
                                      if ((var10 ^ -1) <= -1) {
                                        stackIn_45_0 = var10;
                                        break L10;
                                      } else {
                                        stackIn_45_0 = -var10;
                                        break L10;
                                      }
                                    }
                                    L11: {


                                      if (-1 < (var9 ^ -1)) {

                                        stackIn_48_1 = -var9;
                                        break L11;
                                      } else {

                                        stackIn_48_1 = var9;
                                        break L11;
                                      }
                                    }
                                    var11 = stackIn_45_0 + stackIn_48_1;
                                    break L7;
                                  }
                                }
                              }
                            } else {
                              L12: {
                                if (-1 >= (var9 ^ -1)) {
                                  stackIn_27_0 = var9;
                                  break L12;
                                } else {
                                  stackIn_27_0 = -var9;
                                  break L12;
                                }
                              }
                              L13: {
                                var9 = stackIn_27_0;
                                if (0 > var10) {
                                  stackIn_30_0 = -var10;
                                  break L13;
                                } else {
                                  stackIn_30_0 = var10;
                                  break L13;
                                }
                              }
                              L14: {
                                var10 = stackIn_30_0;
                                if (var10 >= var9) {
                                  stackIn_33_0 = var10;
                                  break L14;
                                } else {
                                  stackIn_33_0 = var9;
                                  break L14;
                                }
                              }
                              var11 = stackIn_33_0;
                              break L7;
                            }
                          } else {
                            var11 = var9 * var9 - -(var10 * var10) >> 965172204;
                            break L7;
                          }
                        }
                        if (fd.field_q > var11) {
                          woa.field_b = qd.field_b;
                          qd.field_b = hi.field_b;
                          hi.field_b = fd.field_q;
                          fd.field_q = var11;
                          var7++;
                          continue L5;
                        } else {
                          if (var11 >= hi.field_b) {
                            if (qd.field_b <= var11) {
                              if (var11 < woa.field_b) {
                                woa.field_b = var11;
                                var7++;
                                continue L5;
                              } else {
                                var7++;
                                continue L5;
                              }
                            } else {
                              woa.field_b = qd.field_b;
                              qd.field_b = var11;
                              var7++;
                              continue L5;
                            }
                          } else {
                            woa.field_b = qd.field_b;
                            qd.field_b = hi.field_b;
                            hi.field_b = var11;
                            var7++;
                            continue L5;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        return var3;
    }

    public static void e(byte param0) {
        if (param0 != 110) {
            vm.e((byte) -75);
        }
        field_q = null;
    }

    static {
        field_q = "Defend your base with blueprint ships. No respawns.";
    }
}
