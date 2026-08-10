/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mua extends eka implements ntb {
    private boolean field_c;
    static int field_d;
    private int field_e;
    private int field_f;

    final void a(boolean param0, int param1, anb param2, int[] param3, pe param4, int param5, int param6, int param7) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var9 = null;
        RuntimeException var9_ref = null;
        uwa var10 = null;
        int var11 = 0;
        int var12 = 0;
        sg var13 = null;
        try {
          L0: {
            var9 = null;
            if (param2 instanceof sg) {
              var13 = (sg) ((Object) param2);
              if (param6 > 74) {
                L1: {
                  if (param0) {
                    break L1;
                  } else {
                    if (var13.n(31390)) {
                      L2: {
                        var13.t((byte) -112);
                        if (!var13.n(31390)) {
                          break L2;
                        } else {
                          L3: {
                            var10 = ccb.field_a.a(0);
                            var11 = 0;
                            var12 = 0;
                            if (this.field_c) {
                              var11 = -this.field_e + param7;
                              var12 = -this.field_f + param1;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          var10.a(eha.field_q, param1, param7, rjb.field_u, 0, var11, (byte) 38, param2, param5, var12);
                          this.field_c = true;
                          this.field_f = param1;
                          this.field_e = param7;
                          param2.d((byte) 80);
                          break L2;
                        }
                      }
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                L4: {
                  if (this.field_c) {
                    this.field_c = false;
                    param2.d((byte) 113);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              L5: {
                if (this.field_c) {
                  this.field_c = false;
                  param2.d((byte) 59);
                  break L5;
                } else {
                  break L5;
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var9_ref = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var9_ref);

            stackIn_22_1 = new StringBuilder().append("mua.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param3 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L7;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');

            if (param4 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L8;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L8;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_23_0), stackIn_29_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final void a(anb param0, int[] param1, int param2, int param3, int param4, int param5, int param6, pe param7, int param8, int param9, int param10) {
        sg var13 = null;
        Object var12 = null;
        if (param0 instanceof sg) {
            var13 = (sg) ((Object) param0);
            var13.m(-13539);
        } else {
            return;
        }
        try {
            if (param2 != -9151) {
                field_d = 75;
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "mua.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ',' + param9 + ',' + param10 + ')');
        }
    }

    public final void a(tv param0, int param1) {
        int stackIn_5_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        tv var5 = null;
        mua var6 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -19) {
                break L1;
              } else {
                var5 = (tv) null;
                this.a((byte) 121, (tv) null);
                break L1;
              }
            }
            L2: {
              var6 = (mua) ((Object) param0);
              super.a(param0, -50);
              var4 = 0;
              if (var6.field_c) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            L3: {
              if (stackIn_5_0 == (this.field_c ? 1 : 0)) {
                var4 = 1;
                System.out.println("boolean operational_last_frame has changed. before=" + var6.field_c + ", now=" + this.field_c);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (this.field_e != var6.field_e) {
                System.out.println("int previous_shield_x has changed. before=" + var6.field_e + ", now=" + this.field_e);
                var4 = 1;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (var6.field_f != this.field_f) {
                System.out.println("int previous_shield_y has changed. before=" + var6.field_f + ", now=" + this.field_f);
                var4 = 1;
                break L5;
              } else {
                break L5;
              }
            }
            if (var4 == 0) {
              break L0;
            } else {
              System.out.println("This instance of ShieldBehaviour has changed");
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3);

            stackIn_19_1 = new StringBuilder().append("mua.F(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        mua var6 = null;
        mua var7 = null;
        try {
            if (param0 <= 54) {
                pe var4 = (pe) null;
                this.a((anb) null, (int[]) null, -13, 109, 122, -45, -75, (pe) null, -117, 73, 98);
            }
            super.b((byte) 85, param1);
            var6 = (mua) ((Object) param1);
            var7 = var6;
            var7.field_c = this.field_c;
            var7.field_f = this.field_f;
            var7.field_e = this.field_e;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "mua.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void b(faa param0, int param1) {
        try {
            super.b(param0, -120);
            vq.a(param0, 120, this.field_c);
            param0.a(-632, this.field_e, 32);
            if (param1 >= -109) {
                this.field_c = false;
            }
            param0.a(-632, this.field_f, 32);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "mua.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
            super.a(param0, false);
            this.field_c = kv.a(param1, param0);
            this.field_e = param0.i(0, 32);
            this.field_f = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "mua.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        mua var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              L2: {
                var3 = (mua) ((Object) param1);
                var4 = -29 % ((22 - param0) / 59);
                if (super.a((byte) 93, param1)) {
                  break L2;
                } else {
                  L3: {
                    if (this.field_c) {
                      stackIn_4_0 = 0;
                      break L3;
                    } else {
                      stackIn_4_0 = 1;
                      break L3;
                    }
                  }
                  if (stackIn_4_0 == (var3.field_c ? 1 : 0)) {
                    break L2;
                  } else {
                    if (this.field_e != var3.field_e) {
                      break L2;
                    } else {
                      if (this.field_f == var3.field_f) {
                        stackIn_10_0 = 0;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              stackIn_10_0 = 1;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("mua.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final int a(int param0, sg param1) {
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
              if (param0 > 73) {
                break L1;
              } else {
                this.field_f = 89;
                break L1;
              }
            }
            stackIn_3_0 = param1.l(-465);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("mua.A(").append(param0).append(',');

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
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public mua() {
    }

    static {
    }
}
