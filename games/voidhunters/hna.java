/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hna extends pca implements ntb {
    int field_q;
    int field_p;
    static int field_s;
    static int field_n;
    tw field_r;
    int field_o;

    public final void b(faa param0, int param1) {
        RuntimeException var3 = null;
        faa stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        faa stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        faa stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        faa stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        faa stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        faa stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
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
            L1: {
              super.b(param0, -123);
              if (param1 <= -109) {
                break L1;
              } else {
                ((hna) this).field_q = 115;
                break L1;
              }
            }
            L2: {
              param0.a(-632, ((hna) this).field_o, 16);
              param0.a(-632, ((hna) this).field_p, 32);
              param0.a(-632, ((hna) this).field_q, 32);
              stackOut_2_0 = (faa) param0;
              stackOut_2_1 = -126;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              if (((hna) this).field_r == null) {
                stackOut_4_0 = (faa) (Object) stackIn_4_0;
                stackOut_4_1 = stackIn_4_1;
                stackOut_4_2 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                stackIn_5_2 = stackOut_4_2;
                break L2;
              } else {
                stackOut_3_0 = (faa) (Object) stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = 1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                stackIn_5_2 = stackOut_3_2;
                break L2;
              }
            }
            L3: {
              if (vq.a(stackIn_5_0, stackIn_5_1, stackIn_5_2 == 0)) {
                break L3;
              } else {
                ((hna) this).field_r.b(param0, -115);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("hna.B(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
    }

    public final void b(byte param0, tv param1) {
        hna var3 = null;
        RuntimeException var3_ref = null;
        hna var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              var4 = (hna) (Object) param1;
              var3 = var4;
              super.b((byte) 88, param1);
              var4.field_p = var4.field_p;
              if (param0 >= 54) {
                break L1;
              } else {
                field_n = 80;
                break L1;
              }
            }
            L2: {
              var4.field_o = var4.field_o;
              var4.field_q = var4.field_q;
              if (null != var4.field_r) {
                L3: {
                  if (var3.field_r != null) {
                    break L3;
                  } else {
                    var3.field_r = new tw();
                    break L3;
                  }
                }
                var4.field_r.b((byte) 127, (tv) (Object) var3.field_r);
                break L2;
              } else {
                var4.field_r = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("hna.D(").append(param0).append(44);
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
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    final static void a(pe param0, lta param1, boolean param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        lta var13 = null;
        Random var14 = null;
        aja var15 = null;
        lta var16 = null;
        aja var17 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var12 = VoidHunters.field_G;
        try {
          L0: {
            var4_int = param0.g((byte) -122) >> 1;
            L1: {
              var5 = param0.m(1) >> 1;
              if (hbb.field_z <= 0) {
                break L1;
              } else {
                var14 = new Random(234890L);
                var7 = 0;
                L2: while (true) {
                  if (var7 >= hbb.field_z) {
                    break L1;
                  } else {
                    L3: {
                      var8 = hob.a(var14, param0.g((byte) -122), 127) - var4_int;
                      var9 = -var5 + hob.a(var14, param0.m(1), 116);
                      var10 = hob.a(var14, 800, 120) - -200;
                      var11 = (int)(param1.field_a * (float)(var10 << 8));
                      if (var11 <= 255) {
                        break L3;
                      } else {
                        var11 = 255;
                        break L3;
                      }
                    }
                    jj.a(8947865, (byte) 7, param1.b(true, var9), (float)(int)((float)var10 * param1.field_a), var11, param1.a(var8, (byte) 121));
                    var7++;
                    continue L2;
                  }
                }
              }
            }
            L4: {
              if (!li.field_i) {
                break L4;
              } else {
                if (via.field_b == 1) {
                  L5: {
                    L6: {
                      var13 = new lta();
                      var16 = var13;
                      var16.field_d = param1.field_d;
                      var16.field_e = param1.field_e;
                      if (1 == tkb.field_p) {
                        break L6;
                      } else {
                        if (null != psb.field_b) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    var16.field_b = param1.field_b;
                    var16.field_a = param1.field_a / 32.0f + 0.00011081559932790697f;
                    var13.field_c = param1.field_c;
                    var15 = mmb.field_d[7];
                    var8 = 4194304;
                    lo.a(0, var8, var15, var16);
                    break L5;
                  }
                  if (jnb.field_o != 1) {
                    break L4;
                  } else {
                    var16.field_c = param1.field_c;
                    var16.field_a = param1.field_a / 64.0f + 0.00005540779966395348f;
                    var13.field_b = param1.field_b;
                    var17 = mmb.field_d[6];
                    var8 = 4194304;
                    lo.a(0, var8, var17, var16);
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
            }
            L7: {
              var6 = param1.a(-var4_int, (byte) 124) - 1;
              var7 = param1.a(var4_int, (byte) 123) + 1;
              var8 = -1 + param1.b(true, -var5);
              var9 = param1.b(true, var5) - -1;
              if (li.field_i) {
                if (!ceb.field_p) {
                  break L7;
                } else {
                  og.field_r.U(var6, var8, var7 + -var6, 16777215, 0);
                  og.field_r.U(var6, var9, -var6 + var7, 16777215, 0);
                  og.field_r.P(var6, var8, -var8 + var9, 16777215, 0);
                  og.field_r.P(var7, var8, -var8 + var9, 16777215, 0);
                  break L7;
                }
              } else {
                dma.h(var6, var8, -var6 + var7, 16777215);
                dma.h(var6, var9, -var6 + var7, 16777215);
                dma.d(var6, var8, var9 - var8, 16777215);
                dma.d(var7, var8, var9 - var8, 16777215);
                break L7;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var4;
            stackOut_23_1 = new StringBuilder().append("hna.E(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          L9: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L9;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L9;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 44 + param2 + 44 + -59 + 41);
        }
    }

    public final boolean a(byte param0, tv param1) {
        hna var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var3 = (hna) (Object) param1;
                var4 = -118 / ((param0 - 22) / 59);
                if (super.a((byte) 90, param1)) {
                  break L2;
                } else {
                  if (((hna) this).field_o != var3.field_o) {
                    break L2;
                  } else {
                    if (((hna) this).field_p != var3.field_p) {
                      break L2;
                    } else {
                      if (var3.field_q != ((hna) this).field_q) {
                        break L2;
                      } else {
                        L3: {
                          if (var3.field_r != null) {
                            stackOut_6_0 = 0;
                            stackIn_7_0 = stackOut_6_0;
                            break L3;
                          } else {
                            stackOut_5_0 = 1;
                            stackIn_7_0 = stackOut_5_0;
                            break L3;
                          }
                        }
                        L4: {
                          stackOut_7_0 = stackIn_7_0;
                          stackIn_9_0 = stackOut_7_0;
                          stackIn_8_0 = stackOut_7_0;
                          if (((hna) this).field_r != null) {
                            stackOut_9_0 = stackIn_9_0;
                            stackOut_9_1 = 0;
                            stackIn_10_0 = stackOut_9_0;
                            stackIn_10_1 = stackOut_9_1;
                            break L4;
                          } else {
                            stackOut_8_0 = stackIn_8_0;
                            stackOut_8_1 = 1;
                            stackIn_10_0 = stackOut_8_0;
                            stackIn_10_1 = stackOut_8_1;
                            break L4;
                          }
                        }
                        if ((stackIn_10_0 ^ stackIn_10_1) != 0) {
                          break L2;
                        } else {
                          L5: {
                            if (((hna) this).field_r == null) {
                              break L5;
                            } else {
                              if (!((hna) this).field_r.a((byte) 94, (tv) (Object) var3.field_r)) {
                                break L5;
                              } else {
                                break L2;
                              }
                            }
                          }
                          stackOut_15_0 = 0;
                          stackIn_16_0 = stackOut_15_0;
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_14_0 = 1;
              stackIn_16_0 = stackOut_14_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3_ref;
            stackOut_17_1 = new StringBuilder().append("hna.C(").append(param0).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
        return stackIn_16_0 != 0;
    }

    public final void a(faa param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1);
              ((hna) this).field_o = param0.i(0, 16);
              ((hna) this).field_p = param0.i(0, 32);
              ((hna) this).field_q = param0.i(0, 32);
              if (kv.a(false, param0)) {
                L2: {
                  if (((hna) this).field_r != null) {
                    break L2;
                  } else {
                    ((hna) this).field_r = new tw();
                    break L2;
                  }
                }
                ((hna) this).field_r.a(param0, false);
                break L1;
              } else {
                ((hna) this).field_r = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("hna.H(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 41);
        }
    }

    final void a(boolean param0, int param1, int param2) {
        ((hna) this).field_r = new tw();
        if (param2 != -30790) {
            ((hna) this).field_r = null;
        }
        ((hna) this).field_r.field_c = new dv(param1, param0);
    }

    public final void a(tv param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        hna var5 = null;
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
        try {
          L0: {
            L1: {
              super.a(param0, -94);
              var5 = (hna) (Object) param0;
              if (null == var5.field_r) {
                break L1;
              } else {
                if (null == var5.field_r) {
                  break L1;
                } else {
                  var5.field_r.a((tv) (Object) var5.field_r, -51);
                  break L1;
                }
              }
            }
            L2: {
              var4 = 0;
              if (var5.field_o == var5.field_o) {
                break L2;
              } else {
                System.out.println("int triggers has changed. before=" + var5.field_o + ", now=" + var5.field_o);
                var4 = 1;
                break L2;
              }
            }
            L3: {
              if (var5.field_p == var5.field_p) {
                break L3;
              } else {
                var4 = 1;
                System.out.println("int mousex has changed. before=" + var5.field_p + ", now=" + var5.field_p);
                break L3;
              }
            }
            if (param1 <= -19) {
              L4: {
                if (var5.field_q != var5.field_q) {
                  System.out.println("int mousey has changed. before=" + var5.field_q + ", now=" + var5.field_q);
                  var4 = 1;
                  break L4;
                } else {
                  break L4;
                }
              }
              tw discarded$1 = var5.field_r;
              L5: {
                if (null == var5.field_r) {
                  break L5;
                } else {
                  if (var5.field_r.a((byte) 84, (tv) (Object) var5.field_r)) {
                    System.out.println("SpecialOrderSubmessage special_order_submessage has changed. before=" + var5.field_r + ", now=" + var5.field_r);
                    var4 = 1;
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                if (var4 == 0) {
                  break L6;
                } else {
                  System.out.println("This instance of PlayerAction has changed");
                  break L6;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var3;
            stackOut_21_1 = new StringBuilder().append("hna.F(");
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
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param1 + 41);
        }
    }

    final void a(mfa param0, int param1, tja param2) {
        RuntimeException var4 = null;
        tfa var5 = null;
        int var6 = 0;
        Exception var7 = null;
        int var8 = 0;
        rsb var9 = null;
        sg var10 = null;
        sg var11 = null;
        tfa stackIn_25_0 = null;
        tfa stackIn_26_0 = null;
        tfa stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        Throwable decompiledCaughtException = null;
        tfa stackOut_24_0 = null;
        tfa stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        tfa stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            if (!((hna) this).c(-12)) {
              if (param1 == 0) {
                L1: {
                  L2: {
                    var9 = (rsb) (Object) param2;
                    if (null == ((hna) this).field_r) {
                      break L2;
                    } else {
                      if (null == ((hna) this).field_r.field_d) {
                        break L2;
                      } else {
                        var9.field_f.a(param1 ^ 42, ((hna) this).field_r.field_d);
                        break L1;
                      }
                    }
                  }
                  L3: {
                    var5 = var9.a(((hna) this).field_k, (byte) 59);
                    if (((hna) this).field_r == null) {
                      break L3;
                    } else {
                      if (((hna) this).field_r.field_e == null) {
                        break L3;
                      } else {
                        if (var5.field_m == ((hna) this).field_r.field_e.field_a) {
                          var9.field_g.g(-1, ((hna) this).field_k);
                          break L1;
                        } else {
                          var5.field_m = ((hna) this).field_r.field_e.field_a;
                          break L1;
                        }
                      }
                    }
                  }
                  L4: {
                    if (((hna) this).field_r == null) {
                      break L4;
                    } else {
                      if (((hna) this).field_r.field_c == null) {
                        break L4;
                      } else {
                        if (((hna) this).field_r.field_c.field_a) {
                          var5.a(((hna) this).field_r.field_c.field_e, (byte) -66);
                          break L1;
                        } else {
                          var6 = var9.field_e.e(8);
                          if (var6 != 1) {
                            if (2 != var6) {
                              break L1;
                            } else {
                              var5.a(30, ((hna) this).field_r.field_c.field_e, 30024, 14, ena.field_q);
                              break L1;
                            }
                          } else {
                            var5.a(13, ((hna) this).field_r.field_c.field_e, 30024, 0, sl.field_a);
                            break L1;
                          }
                        }
                      }
                    }
                  }
                  L5: {
                    if (((hna) this).field_r == null) {
                      break L5;
                    } else {
                      if (((hna) this).field_r.field_a != null) {
                        var11 = var9.field_g.d(((hna) this).field_k, 80);
                        if (var11 != null) {
                          var11.a((byte) 34, ((hna) this).field_r.field_a);
                          break L1;
                        } else {
                          if (cg.a((byte) -128, var9.field_g.d(false))) {
                            var10 = new sg();
                            try {
                              L6: {
                                var10.field_k = qia.a(param1 + 1, ((hna) this).field_r.field_a.field_c);
                                var10.e((byte) 119);
                                var10.field_k.a((byte) 0, (anb) (Object) var10);
                                var5.field_g = var10;
                                var9.field_g.g(param1 + -1, ((hna) this).field_k);
                                break L6;
                              }
                            } catch (java.lang.Exception decompiledCaughtParameter0) {
                              decompiledCaughtException = decompiledCaughtParameter0;
                              L7: {
                                var7 = (Exception) (Object) decompiledCaughtException;
                                hh.a((Throwable) (Object) var7, true, "Invalid blueprint action from player " + ((hna) this).field_k + " AKA " + param0.a(1, ((hna) this).field_k));
                                break L7;
                              }
                            }
                            break L1;
                          } else {
                            break L1;
                          }
                        }
                      } else {
                        break L5;
                      }
                    }
                  }
                  L8: {
                    stackOut_24_0 = (tfa) var5;
                    stackIn_26_0 = stackOut_24_0;
                    stackIn_25_0 = stackOut_24_0;
                    if (((hna) this).field_r == null) {
                      stackOut_26_0 = (tfa) (Object) stackIn_26_0;
                      stackOut_26_1 = -1;
                      stackIn_27_0 = stackOut_26_0;
                      stackIn_27_1 = stackOut_26_1;
                      break L8;
                    } else {
                      stackOut_25_0 = (tfa) (Object) stackIn_25_0;
                      stackOut_25_1 = ((hna) this).field_r.field_b;
                      stackIn_27_0 = stackOut_25_0;
                      stackIn_27_1 = stackOut_25_1;
                      break L8;
                    }
                  }
                  L9: {
                    stackIn_27_0.field_b = stackIn_27_1;
                    var5.field_f = ((hna) this).field_o;
                    if (fra.field_a == 0) {
                      break L9;
                    } else {
                      if (1 != ((hna) this).field_p) {
                        break L9;
                      } else {
                        if (1 != ((hna) this).field_q) {
                          break L9;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                  var5.field_e = ((hna) this).field_q;
                  var5.field_d = ((hna) this).field_p;
                  break L1;
                }
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L10: {
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var4;
            stackOut_41_1 = new StringBuilder().append("hna.A(");
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param0 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L10;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L10;
            }
          }
          L11: {
            stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
            stackOut_44_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_44_2).append(44).append(param1).append(44);
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param2 == null) {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L11;
            } else {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L11;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_47_0, stackIn_47_2 + 41);
        }
    }

    public final String toString() {
        return "Tick=" + ((hna) this).field_e + ", system=" + ((hna) this).field_d + ", playerid=" + ((hna) this).field_k + ",triggers=" + ((hna) this).field_o + ", mousex=" + ((hna) this).field_p + ", mousey=" + ((hna) this).field_q + " specialorder=" + ((hna) this).field_r;
    }

    public hna() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = 1;
        field_n = 88;
        qb discarded$0 = new qb();
    }
}
