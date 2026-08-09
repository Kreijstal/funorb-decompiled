/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf extends ch implements jb, tb, jn {
    private ga field_bb;
    private ga field_cb;
    private mh field_N;
    mp field_P;
    private fe field_Y;
    private fe field_U;
    private ga field_R;
    static ko field_S;
    private ga field_O;
    private ri field_W;
    private ga field_ab;
    private ga field_X;
    static qb[] field_Z;
    static int field_T;
    static long field_Q;
    static String field_db;
    static dd[] field_V;

    private final int a(String param0, ei param1, int param2, int param3, String param4, int param5, byte param6) {
        RuntimeException var8 = null;
        ck var9 = null;
        n var10 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param6 <= -10) {
                break L1;
              } else {
                this.field_Y = (fe) null;
                break L1;
              }
            }
            var10 = new n(20, param5, param3 + 120, 25, param1, false, 120, 3, lc.field_O, 16777215, param0);
            this.a(true, var10);
            var9 = new ck(((sc) ((Object) param1)).a(70), param4, 126, param5 - -var10.field_y, param3 + 50, param2);
            var9.field_t = (cc) (this);
            this.a(true, var9);
            stackIn_3_0 = var9.field_y + var10.field_y;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var8);

            stackIn_6_1 = new StringBuilder().append("nf.I(");

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_3_0;
    }

    final boolean a(char param0, int param1, boolean param2, ei param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((param1 ^ -1) == -99) {
                stackIn_7_0 = this.a(param3, 3);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (-100 == (param1 ^ -1)) {
                  stackIn_11_0 = this.b(param3, 0);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("nf.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L1;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L1;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        oq var3;
        oq stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        oq stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        oq stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        oq stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        L0: {
          var3 = ej.field_j;
          var3.b(false, param2);
          stackIn_2_0 = (oq) (var3);

          stackIn_2_1 = 3;

          if (param1) {
            stackIn_3_0 = (oq) ((Object) stackIn_2_0);
            stackIn_3_1 = stackIn_2_1;
            stackIn_3_2 = 0;
            break L0;
          } else {
            stackIn_3_0 = (oq) ((Object) stackIn_2_0);
            stackIn_3_1 = stackIn_2_1;
            stackIn_3_2 = 1;
            break L0;
          }
        }
        L1: {
          ((oq) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2 != 0);
          stackIn_5_0 = (oq) (var3);

          stackIn_5_1 = 9;

          if (param1) {
            stackIn_6_0 = (oq) ((Object) stackIn_5_0);
            stackIn_6_1 = stackIn_5_1;
            stackIn_6_2 = 0;
            break L1;
          } else {
            stackIn_6_0 = (oq) ((Object) stackIn_5_0);
            stackIn_6_1 = stackIn_5_1;
            stackIn_6_2 = 1;
            break L1;
          }
        }
        ((oq) (Object) stackIn_6_0).a(stackIn_6_1, stackIn_6_2 != 0);
        if (!param1) {
          nf.g((byte) 125);
          var3.a((byte) -81, param0);
          return;
        } else {
          var3.a((byte) -81, param0);
          return;
        }
    }

    public final void a(int param0) {
        String discarded$1 = null;
        if (param0 != 16777215) {
          discarded$1 = this.j(24);
          ((ua) ((Object) this.field_bb.a(-91))).i(18);
          return;
        } else {
          ((ua) ((Object) this.field_bb.a(-91))).i(18);
          return;
        }
    }

    private final int a(String param0, byte param1, int param2, int param3, ei param4) {
        int discarded$1 = 0;
        RuntimeException var6 = null;
        lc var7 = null;
        String var8 = null;
        n var9 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var9 = new n(20, param3, 120 - -param2, 25, param4, false, 120, 3, lc.field_O, 16777215, param0);
              if (param1 == -114) {
                break L1;
              } else {
                var8 = (String) null;
                discarded$1 = this.a((String) null, (ei) null, -45, 100, (String) null, 17, (byte) -12);
                break L1;
              }
            }
            this.a(true, var9);
            var7 = new lc(((sc) ((Object) param4)).a(-14));
            this.a(true, var7);
            var7.a(15, 3 + (var9.field_C + var9.field_l), 15, false, (-15 + var9.field_y >> 23126017) + var9.field_D);
            stackIn_3_0 = var9.field_y;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var6);

            stackIn_6_1 = new StringBuilder().append("nf.N(");

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    private final boolean a(byte param0, sc param1) {
        ip var3 = null;
        RuntimeException var3_ref = null;
        na var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = param1.a(101);
            if (var3 != null) {
              var4 = var3.c(-31873);
              if (gp.field_d != var4) {
                if (ji.field_h != var4) {
                  if (wm.field_Pb == var4) {
                    stackIn_12_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L1: {
                      if (param0 == -3) {
                        break L1;
                      } else {
                        nf.h((byte) -49);
                        break L1;
                      }
                    }
                    stackIn_16_0 = 1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                } else {
                  stackIn_8_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("nf.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L2;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_12_0 != 0;
              } else {
                return stackIn_16_0 != 0;
              }
            }
          }
        }
    }

    public final void a(int param0, mh param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (param2 == -12147) {
                break L1;
              } else {
                field_V = (dd[]) null;
                break L1;
              }
            }
            if (param3 != 0) {
              if (param3 != 1) {
                if (-3 != (param3 ^ -1)) {
                  break L0;
                } else {
                  ci.a("conduct.ws", param2 ^ 12044);
                  return;
                }
              } else {
                ci.a("privacy.ws", param2 + 12020);
                return;
              }
            } else {
              ci.a("terms.ws", -127);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("nf.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final int a(byte param0, ei param1, int param2, int param3, String param4) {
        n var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6 = new n(20, param2, param3 + 120, 25, param1, false, 120, 3, lc.field_O, 16777215, param4);
            if (param0 == 44) {
              this.a(true, var6);
              stackIn_4_0 = var6.field_y;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 118;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var6_ref);

            stackIn_7_1 = new StringBuilder().append("nf.T(").append(param0).append(',');

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
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(ei param0, int param1, int param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.field_U.field_I = this.k(3);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "nf.S(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static vh g(byte param0) {
        if (param0 != 103) {
            field_S = (ko) null;
            return wo.field_f.field_Rb;
        }
        return wo.field_f.field_Rb;
    }

    private final int a(int param0, String param1, ei param2, String param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 35) {
              stackIn_4_0 = this.a(param1, param2, 35, param4, param3, param5, (byte) -36);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 48;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var7);

            stackIn_7_1 = new StringBuilder().append("nf.DA(").append(param0).append(',');

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
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final boolean k(int param0) {
        if (this.a((byte) -3, this.field_bb)) {
          if (this.a((byte) -3, this.field_cb)) {
            if (this.a((byte) -3, this.field_O)) {
              if (this.a((byte) -3, this.field_X)) {
                if (this.a((byte) -3, this.field_R)) {
                  if (this.a((byte) -3, this.field_ab)) {
                    if (param0 != 3) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    public final void a(boolean param0, int param1, int param2, fe param3, int param4) {
        boolean discarded$1 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        String var7 = null;
        try {
          L0: {
            L1: {
              if (param3 == this.field_Y) {
                od.a(true);
                break L1;
              } else {
                if (param3 == this.field_U) {
                  discarded$1 = this.h(127);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            if (param0) {
              break L0;
            } else {
              var7 = (String) null;
              this.a((String) null, -73);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var6);

            stackIn_10_1 = new StringBuilder().append("nf.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param4 + ')');
        }
    }

    public static void h(byte param0) {
        if (param0 != 4) {
            return;
        }
        field_S = null;
        field_Z = null;
        field_V = null;
        field_db = null;
    }

    public nf() {
        super(0, 0, 496, 0, (fp) null);
        this.field_bb = new ga("", (cc) null, 12);
        this.field_cb = new ga("", (cc) null, 100);
        this.field_O = new ga("", (cc) null, 100);
        this.field_X = new ga("", (cc) null, 20);
        this.field_R = new ga("", (cc) null, 20);
        this.field_ab = new ga("", (cc) null, 3);
        int var1 = 1;
        this.field_W = new ri("", (cc) null, var1 != 0);
        this.field_U = new fe(qo.field_E, (cc) null);
        this.field_Y = new fe(lc.field_Q, (cc) null);
        this.field_bb.field_p = sg.field_H;
        this.field_cb.field_p = ri.field_T;
        this.field_O.field_p = wp.field_e;
        this.field_X.field_p = kc.field_f;
        this.field_R.field_p = ii.field_b;
        this.field_ab.field_p = uf.field_J;
        this.field_W.field_p = ui.field_ab;
        this.field_bb.a((byte) -111, new ua(this.field_bb));
        this.field_cb.a((byte) -111, new r(this.field_cb));
        this.field_O.a((byte) -111, new me(this.field_O, this.field_cb));
        this.field_X.a((byte) -111, new uh(this.field_X, this.field_bb, this.field_cb));
        this.field_R.a((byte) -111, new ne(this.field_R, this.field_X));
        this.field_ab.a((byte) -111, new ka(this.field_ab));
        this.field_U.field_I = false;
        this.field_U.field_z = (fp) ((Object) new ng());
        this.field_Y.field_z = (fp) ((Object) new pd());
        this.field_bb.field_z = (fp) ((Object) new om(10000536));
        om dupTemp$0 = new om(10000536);
        this.field_O.field_z = (fp) ((Object) dupTemp$0);
        this.field_cb.field_z = (fp) ((Object) dupTemp$0);
        this.field_ab.field_z = (fp) ((Object) new om(10000536));
        this.field_W.field_z = (fp) ((Object) new j());
        sm dupTemp$1 = new sm(10000536);
        this.field_R.field_z = (fp) ((Object) dupTemp$1);
        this.field_X.field_z = (fp) ((Object) dupTemp$1);
        String var2 = nr.a(new String[]{this.j(0), this.i(11579568)}, -1, lh.field_d);
        int var3 = 20;
        var3 = var3 + this.a((byte) 44, this.field_cb, var3, 170, ng.field_x);
        var3 = var3 + (5 + this.a(lo.field_d, this.field_O, 20, 170, "", var3, (byte) -76));
        var3 = var3 + this.a((byte) 44, this.field_X, var3, 170, to.field_n);
        var3 = var3 + (5 + this.a(35, e.field_g, this.field_R, df.field_c, 170, var3));
        var3 = var3 + (5 + this.a(35, ac.field_l, this.field_bb, se.field_k, 170, var3));
        var3 = var3 + this.a(g.field_m, (byte) -114, 170, var3, this.field_ab);
        n var4 = new n(46, var3, -90 + this.field_l, 25, this.field_W, true, -120 + this.field_l, 5, qk.field_a, 11579568, ab.field_b);
        this.a(true, var4);
        var3 = var3 + var4.field_y;
        am var5 = new am(lc.field_O, 0, 0, 0, 0, 16777215, -1, 0, 0, lc.field_O.field_C, -1, 2147483647, true);
        this.field_N = new mh(var2, var5);
        this.field_N.field_p = "";
        this.field_N.a((byte) 73, cn.field_b, 0);
        this.field_N.a((byte) 117, cn.field_b, 1);
        this.field_N.field_t = (cc) (this);
        this.field_N.b(46, var3, -90 + this.field_l, -15);
        var3 = var3 + (this.field_N.field_y + 15);
        this.a(true, this.field_N);
        int var6 = 4;
        int var7 = 200;
        this.field_U.a(var7, 496 + -var7 >> 887356993, 40, false, var3);
        this.field_Y.a(60, 3 + var6, 40, false, 15 + var3);
        this.field_Y.field_t = (cc) (this);
        this.field_U.field_t = (cc) (this);
        this.a(true, this.field_U);
        this.a(true, this.field_Y);
        this.field_P = new mp((jn) (this));
        this.field_P.a(-this.field_bb.field_l + -this.field_bb.field_C + (this.field_l - 60), 60 + (this.field_bb.field_l + this.field_bb.field_C), 150, false, this.field_bb.field_D + 20);
        this.a(true, this.field_P);
        this.a(496, 0, var3 - -55 + var6, false, 0);
    }

    final static qr b(byte param0, String param1) {
        RuntimeException var2 = null;
        qr stackIn_2_0 = null;
        qr stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -25) {
              L1: {
                if (!ig.field_j.a(param0 + 121)) {
                  break L1;
                } else {
                  if (param1.equals(ig.field_j.b(2))) {
                    break L1;
                  } else {
                    ig.field_j = oh.a(117, param1);
                    break L1;
                  }
                }
              }
              stackIn_7_0 = ig.field_j;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (qr) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("nf.O(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    private final String j(int param0) {
        if (param0 != 0) {
            ei var3 = (ei) null;
            this.a('￴', -47, false, (ei) null);
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    private final String i(int param0) {
        if (param0 != 11579568) {
            this.field_W = (ri) null;
            return "</col></u>";
        }
        return "</col></u>";
    }

    private final boolean h(int param0) {
        NumberFormatException numberFormatException = null;
        int var2 = 0;
        Throwable decompiledCaughtException = null;
        if (this.k(3)) {
          var2 = -1;
          try {
            L0: {
              var2 = Integer.parseInt(this.field_ab.field_m);
              break L0;
            }
          } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L1: {
              numberFormatException = (NumberFormatException) (Object) decompiledCaughtException;
              break L1;
            }
          }
          if (param0 < 94) {
            nf.g((byte) -63);
            return vb.a(this.field_W.field_G, this.field_X.field_m, (byte) 114, (nf) (this), var2, this.field_cb.field_m, this.field_bb.field_m);
          } else {
            return vb.a(this.field_W.field_G, this.field_X.field_m, (byte) 114, (nf) (this), var2, this.field_cb.field_m, this.field_bb.field_m);
          }
        } else {
          return false;
        }
    }

    public final void a(String param0, int param1) {
        ga var3 = null;
        String var4 = null;
        if (param1 != 35) {
            return;
        }
        try {
            var3 = this.field_bb;
            var4 = param0;
            ((sl) ((Object) var3)).a((byte) -124, false, var4);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "nf.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_S = new ko();
        field_db = "You and <%0> have won!";
    }
}
