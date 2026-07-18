/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oq implements ntb {
    private int field_f;
    static int field_z;
    static int field_p;
    static int field_j;
    static int field_G;
    static int field_q;
    static int field_y;
    private int field_i;
    private int field_b;
    static int field_d;
    static int field_x;
    static int field_l;
    static int field_s;
    static int field_t;
    static int field_I;
    static int field_n;
    static int field_w;
    static int field_E;
    static int field_o;
    static int field_g;
    static int field_h;
    private int field_F;
    static int field_a;
    static int field_v;
    private int field_r;
    static int field_C;
    static int field_k;
    static int field_H;
    private int field_u;
    static int field_c;
    static int field_A;
    static int field_m;
    static int field_e;
    private int field_D;

    final boolean b(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 > -115) {
          L0: {
            ((oq) this).a(87);
            if (((oq) this).field_b <= 0) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((oq) this).field_b <= 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(byte param0) {
        if (param0 <= 109) {
            int discarded$0 = ((oq) this).a(false);
            ((oq) this).field_b = 0;
            return;
        }
        ((oq) this).field_b = 0;
    }

    public final void a(tv param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        oq var5 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            L1: {
              var5 = (oq) (Object) param0;
              var4 = 0;
              if (((oq) this).field_F != var5.field_F) {
                System.out.println("int x has changed. before=" + var5.field_F + ", now=" + ((oq) this).field_F);
                var4 = 1;
                break L1;
              } else {
                break L1;
              }
            }
            if (param1 < -19) {
              L2: {
                if (var5.field_u != ((oq) this).field_u) {
                  var4 = 1;
                  System.out.println("int y has changed. before=" + var5.field_u + ", now=" + ((oq) this).field_u);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (var5.field_r == ((oq) this).field_r) {
                  break L3;
                } else {
                  System.out.println("int dx has changed. before=" + var5.field_r + ", now=" + ((oq) this).field_r);
                  var4 = 1;
                  break L3;
                }
              }
              L4: {
                if (var5.field_D != ((oq) this).field_D) {
                  System.out.println("int dy has changed. before=" + var5.field_D + ", now=" + ((oq) this).field_D);
                  var4 = 1;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (var5.field_b == ((oq) this).field_b) {
                  break L5;
                } else {
                  var4 = 1;
                  System.out.println("int life has changed. before=" + var5.field_b + ", now=" + ((oq) this).field_b);
                  break L5;
                }
              }
              L6: {
                if (var5.field_i == ((oq) this).field_i) {
                  break L6;
                } else {
                  var4 = 1;
                  System.out.println("int fadestart has changed. before=" + var5.field_i + ", now=" + ((oq) this).field_i);
                  break L6;
                }
              }
              L7: {
                if (((oq) this).field_f == var5.field_f) {
                  break L7;
                } else {
                  System.out.println("int type has changed. before=" + var5.field_f + ", now=" + ((oq) this).field_f);
                  var4 = 1;
                  break L7;
                }
              }
              if (var4 != 0) {
                System.out.println("This instance of Particle has changed");
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var3;
            stackOut_23_1 = new StringBuilder().append("oq.F(");
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
          throw rta.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param1 + ')');
        }
    }

    final void a(byte param0, lta param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        float var7 = 0.0f;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var27 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var3_int = param1.a(((oq) this).field_F, (byte) 121);
              var4 = param1.b(true, ((oq) this).field_u);
              if (param0 >= 108) {
                break L1;
              } else {
                field_h = 22;
                break L1;
              }
            }
            L2: {
              var5 = 255;
              if (((oq) this).field_i <= 0) {
                break L2;
              } else {
                if (((oq) this).field_i <= ((oq) this).field_b) {
                  break L2;
                } else {
                  var5 = ((oq) this).field_b * 255 / ((oq) this).field_i;
                  break L2;
                }
              }
            }
            if (omb.field_q == ((oq) this).field_f) {
              L3: {
                var6 = 16742144;
                var7 = 400.0f * param1.field_a;
                var8 = var5;
                if (0.5f > var7) {
                  var8 = (int)(2.0f * (var7 * (float)var5));
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                var9 = (int)var7;
                if (((oq) this).field_r != 0) {
                  break L4;
                } else {
                  if (((oq) this).field_D != 0) {
                    break L4;
                  } else {
                    jj.a(var6, (byte) 7, var4, var7, var8, var3_int);
                    return;
                  }
                }
              }
              var10 = param1.a((((oq) this).field_r << 2) + ((oq) this).field_F, (byte) 124);
              var11 = param1.b(true, (((oq) this).field_D << 2) + ((oq) this).field_u);
              if (var9 <= 1) {
                hha.a(var3_int, (byte) 66, var10, var4, var6, var11, var8);
                return;
              } else {
                kra.a(var6, var9, 16994, var4, var8, var3_int, var10, var11);
                return;
              }
            } else {
              if (tk.field_o > ((oq) this).field_f) {
                break L0;
              } else {
                L5: {
                  var6 = 8 * ((oq) this).field_i;
                  var7_int = ((oq) this).field_i * 4 + 256;
                  var8 = th.field_o * ((oq) this).field_i + ((oq) this).field_i;
                  if (((oq) this).field_i <= 135) {
                    break L5;
                  } else {
                    var8 = -var8;
                    break L5;
                  }
                }
                var9 = fc.a(var8, (byte) -60);
                var10 = eu.a(var8, 82);
                var11 = -var6;
                var12 = -var7_int;
                var13 = -var6;
                var14 = var7_int;
                var15 = var6;
                var16 = 0;
                var17 = var9 * var11 + -(var10 * var12) >> 16;
                var18 = var9 * var12 + var11 * var10 >> 16;
                var19 = var9 * var13 - var14 * var10 >> 16;
                var20 = var14 * var9 + var13 * var10 >> 16;
                var21 = -(var16 * var10) + var9 * var15 >> 16;
                var22 = var9 * var16 + var15 * var10 >> 16;
                var11 = param1.a(var17 + ((oq) this).field_F, (byte) 125);
                var12 = param1.b(true, ((oq) this).field_u - -var18);
                var13 = param1.a(var19 + ((oq) this).field_F, (byte) 117);
                var14 = param1.b(true, var20 + ((oq) this).field_u);
                var15 = param1.a(var21 + ((oq) this).field_F, (byte) 117);
                var16 = param1.b(true, var22 + ((oq) this).field_u);
                var23 = -tk.field_o + ((oq) this).field_f - 1;
                var24 = qpb.a(false, var23, 13894143);
                var5 = var5 * 200 >> 8;
                var25 = var24 | var5 << 24;
                hcb.a(8, var16, 1, var25, var11, var15, var14, var12, var25, var13, var25);
                if (-10 + (((oq) this).field_i << 1) <= ((oq) this).field_b) {
                  var26 = 11 - -((oq) this).field_b - (((oq) this).field_i << 1);
                  jj.a(var24, (byte) 7, param1.b(true, ((oq) this).field_u), (float)(int)((float)var26 * (param1.field_a * 4096.0f)), 1, param1.a(((oq) this).field_F, (byte) 113));
                  return;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var3;
            stackOut_23_1 = new StringBuilder().append("oq.J(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        RuntimeException var3 = null;
        oq var5 = null;
        oq var6 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            var5 = (oq) (Object) param1;
            var6 = var5;
            var6.field_b = ((oq) this).field_b;
            var6.field_F = ((oq) this).field_F;
            var6.field_r = ((oq) this).field_r;
            var6.field_f = ((oq) this).field_f;
            var6.field_D = ((oq) this).field_D;
            var6.field_u = ((oq) this).field_u;
            var6.field_i = ((oq) this).field_i;
            if (param0 > 54) {
              break L0;
            } else {
              ((oq) this).a(5, 70, 45, 42, 86, -73, 112, true);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var3;
            stackOut_3_1 = new StringBuilder().append("oq.D(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
            if (param1) {
                ((oq) this).a(-123);
            }
            ((oq) this).field_F = param0.i(0, 32);
            ((oq) this).field_u = param0.i(0, 32);
            ((oq) this).field_r = param0.i(0, 32);
            ((oq) this).field_D = param0.i(0, 32);
            ((oq) this).field_b = param0.i(0, 32);
            ((oq) this).field_i = param0.i(0, 32);
            ((oq) this).field_f = param0.i(0, 4);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "oq.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7) {
        Object var10 = null;
        ((oq) this).field_u = param3;
        ((oq) this).field_f = param1;
        ((oq) this).field_D = param4;
        ((oq) this).field_b = param0;
        ((oq) this).field_F = param6;
        ((oq) this).field_r = param2;
        if (!param7) {
          var10 = null;
          ((oq) this).b((byte) -24, (tv) null);
          ((oq) this).field_i = param5;
          return;
        } else {
          ((oq) this).field_i = param5;
          return;
        }
    }

    final void a(int param0) {
        ((oq) this).field_F = ((oq) this).field_F + ((oq) this).field_r;
        ((oq) this).field_u = ((oq) this).field_u + ((oq) this).field_D;
        ((oq) this).field_b = ((oq) this).field_b - 1;
        if (param0 != -8460) {
            field_c = -6;
        }
    }

    public final void b(faa param0, int param1) {
        RuntimeException runtimeException = null;
        Object var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param0.a(-632, ((oq) this).field_F, 32);
              param0.a(-632, ((oq) this).field_u, 32);
              param0.a(-632, ((oq) this).field_r, 32);
              param0.a(-632, ((oq) this).field_D, 32);
              param0.a(-632, ((oq) this).field_b, 32);
              param0.a(-632, ((oq) this).field_i, 32);
              param0.a(-632, ((oq) this).field_f, 4);
              if (param1 <= -109) {
                break L1;
              } else {
                var4 = null;
                ((oq) this).b((faa) null, -1);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("oq.B(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        oq var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var4 = 27 % ((22 - param0) / 59);
                var3 = (oq) (Object) param1;
                if (var3.field_F != ((oq) this).field_F) {
                  break L2;
                } else {
                  if (((oq) this).field_u != var3.field_u) {
                    break L2;
                  } else {
                    if (((oq) this).field_r != var3.field_r) {
                      break L2;
                    } else {
                      if (var3.field_D != ((oq) this).field_D) {
                        break L2;
                      } else {
                        if (((oq) this).field_b != var3.field_b) {
                          break L2;
                        } else {
                          if (((oq) this).field_i != var3.field_i) {
                            break L2;
                          } else {
                            if (((oq) this).field_f == var3.field_f) {
                              stackOut_9_0 = 0;
                              stackIn_10_0 = stackOut_9_0;
                              break L1;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              stackOut_8_0 = 1;
              stackIn_10_0 = stackOut_8_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("oq.C(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final static boolean c(byte param0) {
        int var1 = 0;
        var1 = 117 % ((param0 - 44) / 58);
        if (null != efb.field_b) {
          if (!efb.field_b.a(34)) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final int a(boolean param0) {
        Object var3 = null;
        if (!param0) {
          var3 = null;
          ((oq) this).b((byte) -76, (tv) null);
          return (((oq) this).field_i << 1) + -((oq) this).field_b;
        } else {
          return (((oq) this).field_i << 1) + -((oq) this).field_b;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = 50;
        field_I = field_l;
        field_j = field_l * 20;
        field_y = 11 * field_l;
        field_q = field_l * 40;
        field_H = 0;
        field_k = 5 * field_l;
        field_t = field_l;
        field_p = 10 * field_l;
        field_z = field_l * 20;
        field_x = 2 * field_l;
        field_v = 3 * field_l;
        field_w = field_l / 2;
        field_G = 10 * field_l;
        field_o = field_l;
        field_A = field_l * 10;
        field_c = 10 * field_l;
        field_E = field_l * 120;
        field_C = 10 * field_l;
        field_s = field_l;
        field_g = field_l * 20;
        field_h = 20 * field_l;
        field_a = field_l * 20;
        field_d = 3 * field_l;
        field_n = field_l;
        field_e = 10 * field_l;
        field_m = field_l * 25;
    }
}
