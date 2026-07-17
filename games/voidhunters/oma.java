/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oma implements ntb, mfa {
    private int field_d;
    int field_k;
    boolean field_e;
    int field_g;
    int field_a;
    static String field_b;
    mib field_l;
    int field_j;
    static String field_c;
    int field_f;
    String[] field_h;
    static float field_i;

    public final void a(String param0, int param1, byte param2) {
        RuntimeException runtimeException = null;
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
              ((oma) this).field_h[param1] = param0;
              if (param2 < -112) {
                break L1;
              } else {
                rsb discarded$2 = ((oma) this).b(96);
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
            stackOut_3_1 = new StringBuilder().append("oma.K(");
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
          throw rta.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    public final void a(faa param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              nkb.a(param1, "Starting to read");
              if (!kv.a(false, param0)) {
                ((oma) this).field_l = null;
                break L1;
              } else {
                ((oma) this).field_l = new mib((mfa) this);
                ((oma) this).field_l.a(param0, false);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("oma.H(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
    }

    public final void b(byte param0, tv param1) {
        oma var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 54) {
                break L1;
              } else {
                String discarded$2 = ((oma) this).a(125, -119);
                break L1;
              }
            }
            L2: {
              var3 = (oma) (Object) param1;
              if (null == var3.field_l) {
                var3.field_l = null;
                break L2;
              } else {
                L3: {
                  if (null == var3.field_l) {
                    var3.field_l = new mib((mfa) this);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var3.field_l.b((byte) 91, (tv) (Object) var3.field_l);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("oma.D(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    public static void a(int param0) {
        if (param0 != 28801) {
            oma.a(false);
        }
        field_b = null;
        field_c = null;
    }

    final void c(int param0) {
        pr.field_c = (oma) this;
        ((oma) this).field_l.a(kdb.field_o, (byte) 106);
        int var2 = 5 % ((67 - param0) / 57);
    }

    final pe a(byte param0) {
        if (param0 < 20) {
            field_i = 1.3303049802780151f;
        }
        return ((rsb) (Object) ((oma) this).field_l.b(28120)).field_g;
    }

    final void a(int param0, faa param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 > -39) {
            return;
        }
        try {
            nc.b(0);
            param1.f((byte) -50);
            var3_int = param1.field_e;
            param1.p(-23497);
            ((oma) this).a(param1, false);
            param1.f((byte) -47);
            var4 = k.a((byte) -69, param1.field_e, param1.field_h, var3_int);
            var5 = param1.h(97);
            if (var5 == var4) {
                nkb.a(false, "cg readstate: Hmm, it seems correct");
            }
            param1.p(-23497);
            nkb.a(false, "has read state");
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "oma.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public final void a(tv param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        oma var5 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -19) {
                break L1;
              } else {
                oma.a(7);
                break L1;
              }
            }
            L2: {
              var5 = (oma) (Object) param0;
              if (null == var5.field_l) {
                break L2;
              } else {
                if (null == var5.field_l) {
                  break L2;
                } else {
                  var5.field_l.a((tv) (Object) var5.field_l, -91);
                  break L2;
                }
              }
            }
            var4 = 0;
            mib discarded$2 = var5.field_l;
            L3: {
              if (var5.field_l == null) {
                break L3;
              } else {
                if (!var5.field_l.a((byte) 106, (tv) (Object) var5.field_l)) {
                  break L3;
                } else {
                  var4 = 1;
                  System.out.println("Carousel_commongame_Info carousel_info has changed. before=" + var5.field_l + ", now=" + var5.field_l);
                  break L3;
                }
              }
            }
            L4: {
              if (var4 == 0) {
                break L4;
              } else {
                System.out.println("This instance of commongame has changed");
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("oma.F(");
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
          throw rta.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 41);
        }
    }

    public final void b(faa param0, int param1) {
        RuntimeException var3 = null;
        faa stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        faa stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        faa stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        faa stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        faa stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        faa stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (param1 <= -109) {
              L1: {
                stackOut_2_0 = (faa) param0;
                stackOut_2_1 = -107;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (null == ((oma) this).field_l) {
                  stackOut_4_0 = (faa) (Object) stackIn_4_0;
                  stackOut_4_1 = stackIn_4_1;
                  stackOut_4_2 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  stackIn_5_2 = stackOut_4_2;
                  break L1;
                } else {
                  stackOut_3_0 = (faa) (Object) stackIn_3_0;
                  stackOut_3_1 = stackIn_3_1;
                  stackOut_3_2 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  stackIn_5_2 = stackOut_3_2;
                  break L1;
                }
              }
              L2: {
                if (vq.a(stackIn_5_0, stackIn_5_1, stackIn_5_2 != 0)) {
                  ((oma) this).field_l.b(param0, -114);
                  break L2;
                } else {
                  break L2;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("oma.B(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
        }
    }

    public final String a(int param0, int param1) {
        if (foa.field_p == param0) {
            if (!((oma) this).b(1).a(param1, (byte) 59).field_a) {
                return "Bot " + param1;
            }
        }
        if (((oma) this).field_h[param1] == null) {
            return "Unknown";
        }
        return ((oma) this).field_h[param1];
    }

    final static void a(float[] param0, int param1, float param2, float[] param3, int param4, int param5, byte param6, int param7, int param8, int param9, int param10) {
        RuntimeException var11 = null;
        float var11_float = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        int var18 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var18 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              L2: {
                param1 = param1 - param4;
                param8 = param8 - param7;
                param5 = param5 - param10;
                var11_float = param0[1] * (float)param8 + (float)param5 * param0[0] + (float)param1 * param0[2];
                var12 = param0[3] * (float)param5 + param0[4] * (float)param8 + (float)param1 * param0[5];
                var13 = (float)param1 * param0[8] + (param0[7] * (float)param8 + (float)param5 * param0[6]);
                var14 = (float)Math.sqrt((double)(var11_float * var11_float + var12 * var12 + var13 * var13));
                var15 = 0.5f + (float)Math.atan2((double)var11_float, (double)var13) / 6.2831854820251465f;
                var16 = (float)Math.asin((double)(var12 / var14)) / 3.1415927410125732f + 0.5f + param2;
                if (1 != param9) {
                  if (param9 == 2) {
                    var15 = -var15;
                    var16 = -var16;
                    break L2;
                  } else {
                    if (3 == param9) {
                      var17 = var15;
                      var15 = var16;
                      var16 = -var17;
                      break L2;
                    } else {
                      param3[1] = var16;
                      param3[0] = var15;
                      break L1;
                    }
                  }
                } else {
                  var17 = var15;
                  var15 = -var16;
                  var16 = var17;
                  break L2;
                }
              }
              param3[1] = var16;
              param3[0] = var15;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var11 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var11;
            stackOut_10_1 = new StringBuilder().append("oma.J(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param4 + 44 + param5 + 44 + -82 + 44 + param7 + 44 + param8 + 44 + param9 + 44 + param10 + 41);
        }
    }

    final static void a(boolean param0) {
        sl.a((byte) -28, tha.field_o);
        if (!param0) {
            field_i = 0.1389508843421936f;
        }
    }

    public final boolean a(byte param0, tv param1) {
        oma var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              var3 = (oma) (Object) param1;
              var4 = -29 % ((22 - param0) / 59);
              if (var3.field_l != null) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              stackOut_3_0 = stackIn_3_0;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (((oma) this).field_l != null) {
                stackOut_5_0 = stackIn_5_0;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L2;
              } else {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L2;
              }
            }
            L3: {
              L4: {
                if ((stackIn_6_0 ^ stackIn_6_1) != 0) {
                  break L4;
                } else {
                  L5: {
                    if (null == ((oma) this).field_l) {
                      break L5;
                    } else {
                      if (!((oma) this).field_l.a((byte) -75, (tv) (Object) var3.field_l)) {
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L3;
                }
              }
              stackOut_10_0 = 1;
              stackIn_12_0 = stackOut_10_0;
              break L3;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("oma.C(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_12_0 != 0;
    }

    final rsb b(int param0) {
        if (param0 != 1) {
            pe discarded$0 = ((oma) this).a((byte) -95);
        }
        return (rsb) (Object) ((oma) this).field_l.b(28120);
    }

    oma(String[] param0, int param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        rsb var10 = null;
        hkb var11 = null;
        rsb var12 = null;
        hkb var13 = null;
        bba var14 = null;
        crb var15 = null;
        crb var16 = null;
        bea var17 = null;
        bha stackIn_13_0 = null;
        bha stackIn_14_0 = null;
        bha stackIn_15_0 = null;
        bha stackIn_16_0 = null;
        bha stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        bha stackOut_12_0 = null;
        bha stackOut_13_0 = null;
        bha stackOut_14_0 = null;
        bha stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        bha stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                pr.field_c = (oma) this;
                ((oma) this).field_a = param0.length;
                ((oma) this).field_d = param3;
                ((oma) this).field_h = param0;
                ((oma) this).field_g = param2;
                ((oma) this).field_l = new mib((mfa) this, param4);
                ((oma) this).field_l.b(((oma) this).field_a, 107);
                var10 = (rsb) (Object) ((oma) this).field_l.b(28120);
                var12 = var10;
                if (((oma) this).field_g == 0) {
                  break L2;
                } else {
                  if (((oma) this).field_g != 1) {
                    if (((oma) this).field_g == 2) {
                      var12.field_e.a(((oma) this).field_d, 1, 13);
                      var17 = new bea();
                      var17.field_d = ((oma) this).field_d;
                      var17.a(-89, var12);
                      var12.field_e.c(5, -7, 0);
                      break L1;
                    } else {
                      if (((oma) this).field_g != 3) {
                        break L1;
                      } else {
                        var12.field_e.c(5, -7, 0);
                        var12.field_g.b(13, (byte) 23);
                        var14 = new bba();
                        var14.a((byte) -117, (wm) (Object) new dab(1));
                        var14.a((rna) (Object) new cf(0, 10), true);
                        var12.field_g.a(var14, -38);
                        var15 = new crb(new ml(54));
                        var15.a(65536, 81920, (byte) -60);
                        var12.field_g.a((byte) 126, var15);
                        var16 = new crb(new ml(50));
                        var16.a(-131072, 65536, (byte) 69);
                        var12.field_g.a((byte) 126, var16);
                        break L1;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
              }
              if (!unb.field_o) {
                int discarded$2 = 0;
                var13 = bkb.a();
                var13.a(false, var12, -48);
                break L1;
              } else {
                int discarded$3 = 0;
                var11 = pba.b().a(3, false);
                var11.a(false, var12, 126);
                break L1;
              }
            }
            var7 = 0;
            L3: while (true) {
              if (var7 >= ((oma) this).field_a) {
                break L0;
              } else {
                L4: {
                  L5: {
                    stackOut_12_0 = var10.field_c[var7];
                    stackIn_16_0 = stackOut_12_0;
                    stackIn_13_0 = stackOut_12_0;
                    if (null == ((oma) this).field_h[var7]) {
                      break L5;
                    } else {
                      stackOut_13_0 = (bha) (Object) stackIn_13_0;
                      stackIn_16_0 = stackOut_13_0;
                      stackIn_14_0 = stackOut_13_0;
                      if (0 >= ((oma) this).field_h[var7].length()) {
                        break L5;
                      } else {
                        stackOut_14_0 = (bha) (Object) stackIn_14_0;
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_15_0 = stackOut_14_0;
                        if ((1 << var7 & ((oma) this).field_j) != 0) {
                          break L5;
                        } else {
                          stackOut_15_0 = (bha) (Object) stackIn_15_0;
                          stackOut_15_1 = 1;
                          stackIn_17_0 = stackOut_15_0;
                          stackIn_17_1 = stackOut_15_1;
                          break L4;
                        }
                      }
                    }
                  }
                  stackOut_16_0 = (bha) (Object) stackIn_16_0;
                  stackOut_16_1 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  break L4;
                }
                stackIn_17_0.field_a = stackIn_17_1 != 0;
                var7++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var6;
            stackOut_19_1 = new StringBuilder().append("oma.<init>(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Next condition/action value";
        field_c = "Creating your account";
        field_i = 0.5f;
    }
}
