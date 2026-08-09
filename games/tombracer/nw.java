/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class nw extends ci {
    static float field_u;
    private int field_n;
    private byte[] field_q;
    private int field_p;
    static String field_s;
    private short[] field_v;
    private int field_o;
    private int field_t;
    private int field_r;
    private int field_m;

    final static void a(boolean param0, int param1, jea param2) {
        lja var10 = null;
        iu var11 = null;
        String var12 = null;
        lja var13 = null;
        iu var14 = null;
        String var15 = null;
        lja var16 = null;
        iu var17 = null;
        String var18 = null;
        lja var19 = null;
        iu var20 = null;
        String var21 = null;
        lja var22 = null;
        iu var23 = null;
        String var24 = null;
        lja var25 = null;
        iu var26 = null;
        String var27 = null;
        lja var28 = null;
        String var30 = null;
        lja var31 = null;
        iu var32 = null;
        String var33 = null;
        lja var34 = null;
        iu var35 = null;
        String var36 = null;
        lja var37 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        iu var29 = null;
        if (param0) {
            return;
        }
        try {
            paa.a((iv) null, -1, (String) null, 0L, -11635, (int[]) null, param2, param1, (String) null);
            if (param1 == 0) {
                var10 = hka.field_b;
                var11 = vda.field_m[0];
                var29 = var11;
                var29 = var11;
                var12 = uq.field_f;
                var10.field_f.a(var11, 11, var12, false);
                var13 = hka.field_b;
                var14 = vda.field_m[1];
                var29 = var14;
                var29 = var14;
                var15 = iga.field_k;
                var13.field_f.a(var14, 12, var15, false);
                var16 = hka.field_b;
                var17 = vda.field_m[2];
                var29 = var17;
                var29 = var17;
                var18 = pea.field_f;
                var16.field_f.a(var17, 13, var18, false);
            }
            if (-2 == (param1 ^ -1)) {
                var19 = hka.field_b;
                var20 = vda.field_m[0];
                var29 = var20;
                var29 = var20;
                var21 = pda.field_a;
                var19.field_f.a(var20, 11, var21, false);
                var22 = hka.field_b;
                var23 = vda.field_m[1];
                var29 = var23;
                var29 = var23;
                var24 = tv.field_xb;
                var22.field_f.a(var23, 12, var24, param0);
                var25 = hka.field_b;
                var26 = vda.field_m[2];
                var29 = var26;
                var29 = var26;
                var27 = ot.field_w;
                var25.field_f.a(var26, 13, var27, false);
            }
            if (!(-3 != (param1 ^ -1))) {
                var28 = hka.field_b;
                var29 = vda.field_m[0];
                var30 = jsa.field_z;
                var28.field_f.a(var29, 11, var30, param0);
                var31 = hka.field_b;
                var32 = vda.field_m[1];
                var33 = oqa.field_t;
                var31.field_f.a(var32, 12, var33, false);
                var34 = hka.field_b;
                var35 = vda.field_m[2];
                var36 = tva.field_c;
                var34.field_f.a(var35, 13, var36, false);
            }
            var37 = hka.field_b;
            var4 = param2.field_q;
            var5 = param2.field_A;
            var6 = param2.field_G;
            var7 = param2.field_t;
            var37.field_f.b(var5, var7, -67, var6, var4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "nw.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static Boolean e(byte param0) {
        Boolean var1 = kia.field_b;
        kia.field_b = null;
        if (param0 <= 57) {
            return (Boolean) null;
        }
        return var1;
    }

    public static void d(byte param0) {
        if (param0 != 118) {
            nw.d((byte) 93);
        }
        field_s = null;
    }

    public nw() {
        super(0, true);
        this.field_o = 2;
        this.field_v = new short[512];
        this.field_q = new byte[512];
        this.field_r = 2048;
        this.field_n = 0;
        this.field_p = 1;
        this.field_m = 5;
        this.field_t = 5;
    }

    final int[] c(int param0, int param1) {
        int incrementValue$0 = 0;
        int stackIn_10_0 = 0;
        byte[] stackIn_10_1 = null;
        int stackIn_10_2 = 0;
        int stackIn_10_3 = 0;
        int stackIn_13_2 = 0;
        int stackIn_17_0 = 0;
        byte[] stackIn_17_1 = null;
        int stackIn_17_2 = 0;
        int stackIn_18_0 = 0;
        byte[] stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        int stackIn_18_3 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        double stackIn_39_0 = 0.0;
        double stackIn_40_0 = 0.0;
        int stackIn_40_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_51_1 = 0;
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
        var19 = TombRacer.field_G ? 1 : 0;
        if (param0 == 1) {
          L0: {
            var3 = this.field_i.a((byte) -109, param1);
            if (this.field_i.field_d) {
              var4 = sj.field_b[param1] * this.field_m + 2048;
              var5 = var4 >> -1731266388;
              var6 = var5 - -1;
              var14 = 0;
              L1: while (true) {
                if (var14 >= ns.field_g) {
                  break L0;
                } else {
                  js.field_l = 2147483647;
                  rp.field_h = 2147483647;
                  te.field_b = 2147483647;
                  kca.field_h = 2147483647;
                  var15 = 2048 - -(ht.field_Fb[var14] * this.field_t);
                  var16 = var15 >> -1228095348;
                  var17 = var16 - -1;
                  var8 = var5 + -1;
                  L2: while (true) {
                    if (var8 > var6) {
                      var18 = this.field_o;
                      if (var18 == 0) {
                        var3[var14] = kca.field_h;
                        var14++;
                        continue L1;
                      } else {
                        if (1 != var18) {
                          if (var18 == 3) {
                            var3[var14] = js.field_l;
                            var14++;
                            continue L1;
                          } else {
                            if ((var18 ^ -1) != -5) {
                              if (2 == var18) {
                                var3[var14] = te.field_b - kca.field_h;
                                var14++;
                                continue L1;
                              } else {
                                var14++;
                                continue L1;
                              }
                            } else {
                              var3[var14] = rp.field_h;
                              var14++;
                              continue L1;
                            }
                          }
                        } else {
                          var3[var14] = te.field_b;
                          var14++;
                          continue L1;
                        }
                      }
                    } else {
                      stackIn_10_0 = 255;
                      stackIn_10_1 = this.field_q;
                      stackIn_10_2 = var8 ^ -1;
                      stackIn_10_3 = this.field_m ^ -1;
                      L3: {




                        if (stackIn_10_2 > stackIn_10_3) {

                          stackIn_10_1 = (byte[]) ((Object) stackIn_10_1);
                          stackIn_13_2 = var8;
                          break L3;
                        } else {

                          stackIn_10_1 = (byte[]) ((Object) stackIn_10_1);
                          stackIn_13_2 = -this.field_m + var8;
                          break L3;
                        }
                      }
                      var12 = stackIn_10_0 & stackIn_10_1[stackIn_13_2 & 255];
                      var7 = -1 + var16;
                      L4: while (true) {
                        if (var17 < var7) {
                          var8++;
                          continue L2;
                        } else {
                          L5: {
                            stackIn_17_0 = 2;

                            stackIn_17_1 = this.field_q;

                            stackIn_17_2 = var12;

                            if (this.field_t <= var7) {
                              stackIn_18_0 = stackIn_17_0;
                              stackIn_18_1 = (byte[]) ((Object) stackIn_17_1);
                              stackIn_18_2 = stackIn_17_2;
                              stackIn_18_3 = -this.field_t + var7;
                              break L5;
                            } else {
                              stackIn_18_0 = stackIn_17_0;
                              stackIn_18_1 = (byte[]) ((Object) stackIn_17_1);
                              stackIn_18_2 = stackIn_17_2;
                              stackIn_18_3 = var7;
                              break L5;
                            }
                          }
                          L6: {
                            var13 = stackIn_18_0 * (stackIn_18_1[stackIn_18_2 - -stackIn_18_3 & 255] & 255);
                            incrementValue$0 = var13;
                            var13++;
                            var9 = var15 + -(var7 << -1361133524) + -this.field_v[incrementValue$0];
                            var10 = -(var8 << 822321772) + (-this.field_v[var13] + var4);
                            var18 = this.field_p;
                            if (var18 != 1) {
                              if (3 == var18) {
                                L7: {
                                  if ((var10 ^ -1) <= -1) {
                                    stackIn_30_0 = var10;
                                    break L7;
                                  } else {
                                    stackIn_30_0 = -var10;
                                    break L7;
                                  }
                                }
                                L8: {
                                  var10 = stackIn_30_0;
                                  if (0 <= var9) {
                                    stackIn_33_0 = var9;
                                    break L8;
                                  } else {
                                    stackIn_33_0 = -var9;
                                    break L8;
                                  }
                                }
                                L9: {
                                  var9 = stackIn_33_0;
                                  if (var10 < var9) {
                                    stackIn_36_0 = var9;
                                    break L9;
                                  } else {
                                    stackIn_36_0 = var10;
                                    break L9;
                                  }
                                }
                                var11 = stackIn_36_0;
                                break L6;
                              } else {
                                if (-5 == (var18 ^ -1)) {
                                  L10: {
                                    stackIn_39_0 = 4096.0;

                                    if (-1 >= (var9 ^ -1)) {
                                      stackIn_40_0 = stackIn_39_0;
                                      stackIn_40_1 = var9;
                                      break L10;
                                    } else {
                                      stackIn_40_0 = stackIn_39_0;
                                      stackIn_40_1 = -var9;
                                      break L10;
                                    }
                                  }
                                  L11: {
                                    var9 = (int)(stackIn_40_0 * Math.sqrt((double)((float)stackIn_40_1 / 4096.0f)));
                                    if (var10 < 0) {
                                      stackIn_43_0 = -var10;
                                      break L11;
                                    } else {
                                      stackIn_43_0 = var10;
                                      break L11;
                                    }
                                  }
                                  var10 = (int)(Math.sqrt((double)((float)stackIn_43_0 / 4096.0f)) * 4096.0);
                                  var11 = var9 + var10;
                                  var11 = var11 * var11 >> 2126002412;
                                  break L6;
                                } else {
                                  if ((var18 ^ -1) != -6) {
                                    if (var18 != 2) {
                                      var11 = (int)(4096.0 * Math.sqrt((double)((float)(var9 * var9 - -(var10 * var10)) / 16777216.0f)));
                                      break L6;
                                    } else {
                                      L12: {
                                        if ((var9 ^ -1) <= -1) {
                                          stackIn_48_0 = var9;
                                          break L12;
                                        } else {
                                          stackIn_48_0 = -var9;
                                          break L12;
                                        }
                                      }
                                      L13: {


                                        if ((var10 ^ -1) <= -1) {

                                          stackIn_51_1 = var10;
                                          break L13;
                                        } else {

                                          stackIn_51_1 = -var10;
                                          break L13;
                                        }
                                      }
                                      var11 = stackIn_48_0 + stackIn_51_1;
                                      break L6;
                                    }
                                  } else {
                                    var10 = var10 * var10;
                                    var9 = var9 * var9;
                                    var11 = (int)(4096.0 * Math.sqrt(Math.sqrt((double)((float)(var10 + var9) / 16777216.0f))));
                                    break L6;
                                  }
                                }
                              }
                            } else {
                              var11 = var9 * var9 - -(var10 * var10) >> 1035763116;
                              break L6;
                            }
                          }
                          if (var11 < kca.field_h) {
                            rp.field_h = js.field_l;
                            js.field_l = te.field_b;
                            te.field_b = kca.field_h;
                            kca.field_h = var11;
                            var7++;
                            continue L4;
                          } else {
                            if (var11 < te.field_b) {
                              rp.field_h = js.field_l;
                              js.field_l = te.field_b;
                              te.field_b = var11;
                              var7++;
                              continue L4;
                            } else {
                              if (js.field_l <= var11) {
                                if (rp.field_h > var11) {
                                  rp.field_h = var11;
                                  var7++;
                                  continue L4;
                                } else {
                                  var7++;
                                  continue L4;
                                }
                              } else {
                                rp.field_h = js.field_l;
                                js.field_l = var11;
                                var7++;
                                continue L4;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            } else {
              break L0;
            }
          }
          return var3;
        } else {
          return (int[]) null;
        }
    }

    final void a(byte param0, uia param1, int param2) {
        int dupTemp$0 = 0;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 107) {
                break L1;
              } else {
                this.field_v = (short[]) null;
                break L1;
              }
            }
            L2: {
              var4_int = param2;
              if (0 == var4_int) {
                dupTemp$0 = param1.h(param0 ^ 148);
                this.field_m = dupTemp$0;
                this.field_t = dupTemp$0;
                break L2;
              } else {
                if (var4_int == 1) {
                  this.field_n = param1.h(param0 + 148);
                  break L2;
                } else {
                  if ((var4_int ^ -1) == -3) {
                    this.field_r = param1.d(122);
                    break L2;
                  } else {
                    if ((var4_int ^ -1) != -4) {
                      if (var4_int != 4) {
                        if (5 != var4_int) {
                          if ((var4_int ^ -1) != -7) {
                            break L2;
                          } else {
                            this.field_m = param1.h(255);
                            break L2;
                          }
                        } else {
                          this.field_t = param1.h(255);
                          break L2;
                        }
                      } else {
                        this.field_p = param1.h(255);
                        break L2;
                      }
                    } else {
                      this.field_o = param1.h(255);
                      break L2;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var4);

            stackIn_24_1 = new StringBuilder().append("nw.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L3;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param2 + ')');
        }
    }

    private final void c(int param0) {
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        Random var5 = new Random((long)this.field_n);
        Random var2 = var5;
        this.field_v = new short[512];
        if (this.field_r > 0) {
            for (var3 = 0; 512 > var3; var3++) {
                this.field_v[var3] = (short)jqa.a(this.field_r, var5, 86);
            }
        }
        var3 = -16 / ((param0 - -54) / 37);
    }

    final void b(byte param0) {
        if (param0 != 116) {
            return;
        }
        this.field_q = pca.a(this.field_n, (byte) 76);
        this.c(-94);
    }

    final static ha a(int param0, int param1, d param2, int param3, cn param4, java.awt.Canvas param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        java.awt.Dimension var8 = null;
        jea var9 = null;
        ha stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var6_int = 0;
              var7 = 0;
              if (param5 == null) {
                break L1;
              } else {
                var8 = param5.getSize();
                var6_int = var8.width;
                var7 = var8.height;
                break L1;
              }
            }
            L2: {
              if (param1 == -29355) {
                break L2;
              } else {
                var9 = (jea) null;
                nw.a(false, -120, (jea) null);
                break L2;
              }
            }
            stackIn_5_0 = ha.a(param2, var7, param4, param3, var6_int, param0, param5, -17441);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var6);

            stackIn_8_1 = new StringBuilder().append("nw.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param5 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_15_2 + ')');
        }
        return stackIn_5_0;
    }

    static {
        field_s = "You have <%0> unread messages!";
    }
}
