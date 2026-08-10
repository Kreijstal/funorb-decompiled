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
        try {
            this.field_h[param1] = param0;
            if (param2 >= -112) {
                this.b(96);
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "oma.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void a(faa param0, boolean param1) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              nkb.a(param1, "Starting to read");
              if (!kv.a(false, param0)) {
                this.field_l = null;
                break L1;
              } else {
                this.field_l = new mib((mfa) (this));
                this.field_l.a(param0, false);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("oma.H(");

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
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        oma var3 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              if (param0 > 54) {
                break L1;
              } else {
                this.a(125, -119);
                break L1;
              }
            }
            L2: {
              var3 = (oma) ((Object) param1);
              if (null == this.field_l) {
                var3.field_l = null;
                break L2;
              } else {
                L3: {
                  if (null == var3.field_l) {
                    var3.field_l = new mib((mfa) (this));
                    break L3;
                  } else {
                    break L3;
                  }
                }
                this.field_l.b((byte) 91, var3.field_l);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("oma.D(").append(param0).append(',');

            if (param1 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
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
        pr.field_c = (oma) (this);
        this.field_l.a(kdb.field_o, (byte) 106);
        int var2 = 5 % ((67 - param0) / 57);
    }

    final pe a(byte param0) {
        if (param0 < 20) {
            field_i = 1.3303049802780151f;
        }
        return ((rsb) ((Object) this.field_l.b(28120))).field_g;
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
            this.a(param1, false);
            param1.f((byte) -47);
            var4 = k.a((byte) -69, param1.field_e, param1.field_h, var3_int);
            var5 = param1.h(97);
            if (var5 == var4) {
                nkb.a(false, "cg readstate: Hmm, it seems correct");
            }
            param1.p(-23497);
            nkb.a(false, "has read state");
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "oma.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(tv param0, int param1) {
        int var4 = 0;
        oma var5 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_1 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
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
              var5 = (oma) ((Object) param0);
              if (null == this.field_l) {
                break L2;
              } else {
                if (null == var5.field_l) {
                  break L2;
                } else {
                  this.field_l.a(var5.field_l, -91);
                  break L2;
                }
              }
            }
            L3: {
              var4 = 0;
              if (this.field_l != null) {
                stackIn_8_0 = 0;
                break L3;
              } else {
                stackIn_8_0 = 1;
                break L3;
              }
            }
            L4: {


              if (null != var5.field_l) {

                stackIn_11_1 = 0;
                break L4;
              } else {

                stackIn_11_1 = 1;
                break L4;
              }
            }
            L5: {
              L6: {
                if ((stackIn_8_0 ^ stackIn_11_1) != 0) {
                  break L6;
                } else {
                  if (this.field_l == null) {
                    break L5;
                  } else {
                    if (!this.field_l.a((byte) 106, var5.field_l)) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              var4 = 1;
              System.out.println("Carousel_commongame_Info carousel_info has changed. before=" + var5.field_l + ", now=" + this.field_l);
              break L5;
            }
            L7: {
              if (var4 == 0) {
                break L7;
              } else {
                System.out.println("This instance of commongame has changed");
                break L7;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3);

            stackIn_21_1 = new StringBuilder().append("oma.F(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L8;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L8;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
    }

    public final void b(faa param0, int param1) {
        faa stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        faa stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            if (param1 <= -109) {
              L1: {
                stackIn_4_0 = (faa) (param0);

                stackIn_4_1 = -107;

                if (null == this.field_l) {
                  stackIn_5_0 = (faa) ((Object) stackIn_4_0);
                  stackIn_5_1 = stackIn_4_1;
                  stackIn_5_2 = 0;
                  break L1;
                } else {
                  stackIn_5_0 = (faa) ((Object) stackIn_4_0);
                  stackIn_5_1 = stackIn_4_1;
                  stackIn_5_2 = 1;
                  break L1;
                }
              }
              L2: {
                if (vq.a(stackIn_5_0, stackIn_5_1, stackIn_5_2 != 0)) {
                  this.field_l.b(param0, -114);
                  break L2;
                } else {
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("oma.B(");

            if (param0 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final String a(int param0, int param1) {
        if (foa.field_p == param0 && !this.b(1).a(param1, (byte) 59).field_a) {
            return "Bot " + param1;
        }
        if (this.field_h[param1] == null) {
            return "Unknown";
        }
        return this.field_h[param1];
    }

    final static void a(float[] param0, int param1, float param2, float[] param3, int param4, int param5, byte param6, int param7, int param8, int param9, int param10) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        float var11_float = 0.0f;
        RuntimeException var11 = null;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        int var18 = 0;
        var18 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
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
                if ((param9 ^ -1) == -3) {
                  var15 = -var15;
                  var16 = -var16;
                  break L1;
                } else {
                  if (3 == param9) {
                    var17 = var15;
                    var15 = var16;
                    var16 = -var17;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                var17 = var15;
                var15 = -var16;
                var16 = var17;
                break L1;
              }
            }
            L2: {
              param3[1] = var16;
              param3[0] = var15;
              if (param6 == -82) {
                break L2;
              } else {
                field_c = (String) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var11 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var11);

            stackIn_13_1 = new StringBuilder().append("oma.J(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ')');
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
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              var3 = (oma) ((Object) param1);
              var4 = -29 % ((22 - param0) / 59);
              if (var3.field_l != null) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            L2: {


              if (this.field_l != null) {

                stackIn_6_1 = 0;
                break L2;
              } else {

                stackIn_6_1 = 1;
                break L2;
              }
            }
            L3: {
              L4: {
                if ((stackIn_3_0 ^ stackIn_6_1) != 0) {
                  break L4;
                } else {
                  L5: {
                    if (null == this.field_l) {
                      break L5;
                    } else {
                      if (!this.field_l.a((byte) -75, var3.field_l)) {
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                  stackIn_12_0 = 0;
                  break L3;
                }
              }
              stackIn_12_0 = 1;
              break L3;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("oma.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        return stackIn_12_0 != 0;
    }

    final rsb b(int param0) {
        if (param0 != 1) {
            this.a((byte) -95);
        }
        return (rsb) ((Object) this.field_l.b(28120));
    }

    oma(String[] param0, int param1, int param2, int param3, boolean param4) {
        bha stackIn_16_0 = null;
        bha stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
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
        try {
          L0: {
            L1: {
              L2: {
                pr.field_c = (oma) (this);
                this.field_a = param0.length;
                this.field_d = param3;
                this.field_h = param0;
                this.field_g = param2;
                this.field_l = new mib((mfa) (this), param4);
                this.field_l.b(this.field_a, 107);
                var10 = (rsb) ((Object) this.field_l.b(28120));
                var12 = var10;
                if (this.field_g == 0) {
                  break L2;
                } else {
                  if ((this.field_g ^ -1) != -2) {
                    if (this.field_g == 2) {
                      var12.field_e.a(this.field_d, 1, 13);
                      var17 = new bea();
                      var17.field_d = this.field_d;
                      var17.a(-89, var12);
                      var12.field_e.c(5, -7, 0);
                      break L1;
                    } else {
                      if (-4 != (this.field_g ^ -1)) {
                        break L1;
                      } else {
                        var12.field_e.c(5, -7, 0);
                        var12.field_g.b(13, (byte) 23);
                        var14 = new bba();
                        var14.a((byte) -117, (wm) (new dab(1)));
                        var14.a(new cf(0, 10), true);
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
                var13 = bkb.a(0);
                var13.a(false, var12, -48);
                break L1;
              } else {
                var11 = pba.b(false).a(3, false);
                var11.a(false, var12, 126);
                break L1;
              }
            }
            var7 = 0;
            L3: while (true) {
              if (var7 >= this.field_a) {
                break L0;
              } else {
                L4: {
                  L5: {
                    stackIn_16_0 = var10.field_c[var7];

                    if (null == this.field_h[var7]) {
                      break L5;
                    } else {
                      stackIn_16_0 = (bha) ((Object) stackIn_16_0);

                      if (0 >= this.field_h[var7].length()) {
                        break L5;
                      } else {
                        stackIn_16_0 = (bha) ((Object) stackIn_16_0);

                        if ((1 << var7 & this.field_j) != 0) {
                          break L5;
                        } else {
                          stackIn_17_0 = (bha) ((Object) stackIn_16_0);
                          stackIn_17_1 = 1;
                          break L4;
                        }
                      }
                    }
                  }
                  stackIn_17_0 = (bha) ((Object) stackIn_16_0);
                  stackIn_17_1 = 0;
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
            stackIn_21_0 = (RuntimeException) (var6);

            stackIn_21_1 = new StringBuilder().append("oma.<init>(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_b = "Next condition/action value";
        field_c = "Creating your account";
        field_i = 0.5f;
    }
}
