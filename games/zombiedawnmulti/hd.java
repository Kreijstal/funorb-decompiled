/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hd extends un {
    private qp field_z;
    private String field_v;
    static ao field_r;
    private boolean field_y;
    static ao field_w;
    static String field_t;
    static cj field_x;
    static fe field_s;
    static int field_q;
    static int field_u;

    hd(pm param0, pm param1) {
        super(param0);
        this.field_v = "";
        this.field_y = false;
        try {
            this.field_z = new qp(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "hd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final re a(boolean param0, String param1) {
        uc var3 = null;
        RuntimeException var3_ref = null;
        re stackIn_2_0 = null;
        re stackIn_7_0 = null;
        re stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_z.a(param0, param1) != jq.field_b) {
              L1: {
                if (param1.equals(this.field_v)) {
                  break L1;
                } else {
                  var3 = ga.a(param1, false);
                  if (!var3.d(-99)) {
                    stackIn_7_0 = ua.field_I;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    this.field_v = param1;
                    this.field_y = var3.b(18307);
                    break L1;
                  }
                }
              }
              L2: {
                if (!this.field_y) {
                  stackIn_12_0 = jq.field_b;
                  break L2;
                } else {
                  stackIn_12_0 = db.field_b;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_2_0 = jq.field_b;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("hd.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    final String a(String param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_z.a(false, param0) == jq.field_b) {
              stackIn_3_0 = this.field_z.a(param0, -1276425040);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 == -1276425040) {
                if (this.a(false, param0) != jq.field_b) {
                  stackIn_11_0 = gi.field_h;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_9_0 = eg.field_z;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = (String) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("hd.C(");

            if (param0 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return stackIn_11_0;
            }
          }
        }
    }

    final static boolean a(int param0, char param1) {
        int stackIn_10_0 = 0;
        L0: {
          if (param0 == -24315) {
            break L0;
          } else {
            field_r = (ao) null;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (param1 < 65) {
                break L3;
              } else {
                if (param1 <= 90) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (param1 < 97) {
                break L4;
              } else {
                if (param1 > 122) {
                  break L4;
                } else {
                  break L2;
                }
              }
            }
            stackIn_10_0 = 0;
            break L1;
          }
          stackIn_10_0 = 1;
          break L1;
        }
        return stackIn_10_0 != 0;
    }

    final static void a(java.math.BigInteger param0, byte param1, java.math.BigInteger param2, k param3, k param4) {
        try {
            qi.a(0, true, param0, param3.field_j, param2, param3.field_m, param4);
            int var5_int = 19 % ((-76 - param1) / 44);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "hd.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public static void h(int param0) {
        field_w = null;
        field_r = null;
        field_t = null;
        if (param0 != 11702) {
            String var2 = (String) null;
            hd.a(-23, (String) null, 34);
        }
        field_x = null;
        field_s = null;
    }

    final static void a(ga param0, int param1) {
        try {
            int stackIn_26_0 = 0;
            int stackIn_69_0 = 0;
            RuntimeException stackIn_72_0 = null;
            StringBuilder stackIn_72_1 = null;
            RuntimeException stackIn_73_0 = null;
            StringBuilder stackIn_73_1 = null;
            RuntimeException stackIn_74_0 = null;
            StringBuilder stackIn_74_1 = null;
            String stackIn_74_2 = null;
            int decompiledRegionSelector0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            RuntimeException var2 = null;
            int var3 = 0;
            int var4 = 0;
            int var5 = 0;
            int var6_int = 0;
            ClassNotFoundException var6 = null;
            InvalidClassException var6_ref = null;
            StreamCorruptedException var6_ref2 = null;
            OptionalDataException var6_ref3 = null;
            IllegalAccessException var6_ref4 = null;
            IllegalArgumentException var6_ref5 = null;
            java.lang.reflect.InvocationTargetException var6_ref6 = null;
            SecurityException var6_ref7 = null;
            IOException var6_ref8 = null;
            NullPointerException var6_ref9 = null;
            Exception var6_ref10 = null;
            Throwable var6_ref11 = null;
            java.lang.reflect.Field var7 = null;
            int var8 = 0;
            Object[] var9 = null;
            int var10_int = 0;
            Object var10 = null;
            ObjectInputStream var11 = null;
            int var12 = 0;
            lp var13 = null;
            java.lang.reflect.Field var14 = null;
            java.lang.reflect.Field var15 = null;
            lp var17 = null;
            Object var18 = null;
            Object var20 = null;
            Object var21 = null;
            byte[][] var24 = null;
            java.lang.reflect.Field var25 = null;
            java.lang.reflect.Method var26 = null;
            java.lang.reflect.Method var27 = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var18 = null;
                        var20 = null;
                        var21 = null;
                        var12 = ZombieDawnMulti.field_E ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var13 = (lp) ((Object) we.field_k.c(76));
                            var17 = var13;
                            if (var17 != null) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        return;
                    }
                    case 3: {
                        try {
                            var3 = 0;
                            var4 = 0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (var4 >= var17.field_n) {
                                statePc = 20;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (var12 != 0) {
                                statePc = 23;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (null == var13.field_m[var4]) {
                                statePc = 12;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (2 != var13.field_m[var4].field_f) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var13.field_g[var4] = -5;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (var13.field_m[var4].field_f == 0) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            var3 = 1;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (null != var13.field_l[var4]) {
                                statePc = 14;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (2 != var13.field_l[var4].field_f) {
                                statePc = 16;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            var13.field_g[var4] = -6;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (var13.field_l[var4].field_f == 0) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var3 = 1;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var4++;
                            if (var12 == 0) {
                                statePc = 4;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (var3 == 0) {
                                statePc = 22;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        return;
                    }
                    case 22: {
                        try {
                            var4 = param0.field_j;
                            param0.b(param1 ^ 34, var17.field_r);
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var5 = param1;
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (var5 >= var17.field_n) {
                                statePc = 68;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            stackIn_69_0 = var13.field_g[var5] ^ -1;
                            stackIn_26_0 = stackIn_69_0;
                            if (var12 != 0) {
                                statePc = 69;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (stackIn_26_0 != -1) {
                                statePc = 28;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            param0.a(-99, var13.field_g[var5]);
                            if (var12 == 0) {
                                statePc = 67;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var6_int = var13.field_i[var5];
                            if (0 != var6_int) {
                                statePc = 31;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = ((Object) stateCaught_29 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_29 instanceof InvalidClassException ? 56 : ((Object) stateCaught_29 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_29 instanceof OptionalDataException ? 58 : ((Object) stateCaught_29 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_29 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_29 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_29 instanceof SecurityException ? 62 : ((Object) stateCaught_29 instanceof IOException ? 63 : ((Object) stateCaught_29 instanceof NullPointerException ? 64 : ((Object) stateCaught_29 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var25 = (java.lang.reflect.Field) (var13.field_m[var5].field_d);
                            var8 = var25.getInt((Object) null);
                            param0.a(-95, 0);
                            param0.b(-123, var8);
                            if (var12 == 0) {
                                statePc = 35;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = ((Object) stateCaught_30 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_30 instanceof InvalidClassException ? 56 : ((Object) stateCaught_30 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_30 instanceof OptionalDataException ? 58 : ((Object) stateCaught_30 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_30 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_30 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_30 instanceof SecurityException ? 62 : ((Object) stateCaught_30 instanceof IOException ? 63 : ((Object) stateCaught_30 instanceof NullPointerException ? 64 : ((Object) stateCaught_30 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if ((var6_int ^ -1) != -2) {
                                statePc = 33;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = ((Object) stateCaught_31 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_31 instanceof InvalidClassException ? 56 : ((Object) stateCaught_31 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_31 instanceof OptionalDataException ? 58 : ((Object) stateCaught_31 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_31 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_31 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_31 instanceof SecurityException ? 62 : ((Object) stateCaught_31 instanceof IOException ? 63 : ((Object) stateCaught_31 instanceof NullPointerException ? 64 : ((Object) stateCaught_31 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var14 = (java.lang.reflect.Field) (var13.field_m[var5].field_d);
                            var7 = var14;
                            var14.setInt((Object) null, var13.field_q[var5]);
                            param0.a(-32, 0);
                            if (var12 == 0) {
                                statePc = 35;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = ((Object) stateCaught_32 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_32 instanceof InvalidClassException ? 56 : ((Object) stateCaught_32 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_32 instanceof OptionalDataException ? 58 : ((Object) stateCaught_32 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_32 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_32 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_32 instanceof SecurityException ? 62 : ((Object) stateCaught_32 instanceof IOException ? 63 : ((Object) stateCaught_32 instanceof NullPointerException ? 64 : ((Object) stateCaught_32 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (-3 != (var6_int ^ -1)) {
                                statePc = 35;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = ((Object) stateCaught_33 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_33 instanceof InvalidClassException ? 56 : ((Object) stateCaught_33 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_33 instanceof OptionalDataException ? 58 : ((Object) stateCaught_33 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_33 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_33 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_33 instanceof SecurityException ? 62 : ((Object) stateCaught_33 instanceof IOException ? 63 : ((Object) stateCaught_33 instanceof NullPointerException ? 64 : ((Object) stateCaught_33 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            var15 = (java.lang.reflect.Field) (var13.field_m[var5].field_d);
                            var8 = var15.getModifiers();
                            param0.a(118, 0);
                            param0.b(-126, var8);
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = ((Object) stateCaught_34 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_34 instanceof InvalidClassException ? 56 : ((Object) stateCaught_34 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_34 instanceof OptionalDataException ? 58 : ((Object) stateCaught_34 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_34 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_34 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_34 instanceof SecurityException ? 62 : ((Object) stateCaught_34 instanceof IOException ? 63 : ((Object) stateCaught_34 instanceof NullPointerException ? 64 : ((Object) stateCaught_34 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (var6_int != 3) {
                                statePc = 52;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = ((Object) stateCaught_35 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_35 instanceof InvalidClassException ? 56 : ((Object) stateCaught_35 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_35 instanceof OptionalDataException ? 58 : ((Object) stateCaught_35 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_35 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_35 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_35 instanceof SecurityException ? 62 : ((Object) stateCaught_35 instanceof IOException ? 63 : ((Object) stateCaught_35 instanceof NullPointerException ? 64 : ((Object) stateCaught_35 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            var26 = (java.lang.reflect.Method) (var13.field_l[var5].field_d);
                            var24 = var13.field_o[var5];
                            var9 = new Object[var24.length];
                            var10_int = 0;
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = ((Object) stateCaught_36 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_36 instanceof InvalidClassException ? 56 : ((Object) stateCaught_36 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_36 instanceof OptionalDataException ? 58 : ((Object) stateCaught_36 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_36 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_36 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_36 instanceof SecurityException ? 62 : ((Object) stateCaught_36 instanceof IOException ? 63 : ((Object) stateCaught_36 instanceof NullPointerException ? 64 : ((Object) stateCaught_36 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (var10_int >= var24.length) {
                                statePc = 41;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = ((Object) stateCaught_37 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_37 instanceof InvalidClassException ? 56 : ((Object) stateCaught_37 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_37 instanceof OptionalDataException ? 58 : ((Object) stateCaught_37 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_37 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_37 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_37 instanceof SecurityException ? 62 : ((Object) stateCaught_37 instanceof IOException ? 63 : ((Object) stateCaught_37 instanceof NullPointerException ? 64 : ((Object) stateCaught_37 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var24[var10_int])));
                            var9[var10_int] = var11.readObject();
                            var10_int++;
                            if (var12 != 0) {
                                statePc = 67;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = ((Object) stateCaught_38 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_38 instanceof InvalidClassException ? 56 : ((Object) stateCaught_38 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_38 instanceof OptionalDataException ? 58 : ((Object) stateCaught_38 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_38 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_38 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_38 instanceof SecurityException ? 62 : ((Object) stateCaught_38 instanceof IOException ? 63 : ((Object) stateCaught_38 instanceof NullPointerException ? 64 : ((Object) stateCaught_38 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if (var12 == 0) {
                                statePc = 37;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = ((Object) stateCaught_39 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_39 instanceof InvalidClassException ? 56 : ((Object) stateCaught_39 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_39 instanceof OptionalDataException ? 58 : ((Object) stateCaught_39 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_39 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_39 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_39 instanceof SecurityException ? 62 : ((Object) stateCaught_39 instanceof IOException ? 63 : ((Object) stateCaught_39 instanceof NullPointerException ? 64 : ((Object) stateCaught_39 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = ((Object) stateCaught_40 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_40 instanceof InvalidClassException ? 56 : ((Object) stateCaught_40 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_40 instanceof OptionalDataException ? 58 : ((Object) stateCaught_40 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_40 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_40 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_40 instanceof SecurityException ? 62 : ((Object) stateCaught_40 instanceof IOException ? 63 : ((Object) stateCaught_40 instanceof NullPointerException ? 64 : ((Object) stateCaught_40 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            var10 = var26.invoke((Object) null, var9);
                            if (var10 != null) {
                                statePc = 44;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = ((Object) stateCaught_41 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_41 instanceof InvalidClassException ? 56 : ((Object) stateCaught_41 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_41 instanceof OptionalDataException ? 58 : ((Object) stateCaught_41 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_41 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_41 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_41 instanceof SecurityException ? 62 : ((Object) stateCaught_41 instanceof IOException ? 63 : ((Object) stateCaught_41 instanceof NullPointerException ? 64 : ((Object) stateCaught_41 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            param0.a(param1 + 123, 0);
                            if (var12 == 0) {
                                statePc = 51;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = ((Object) stateCaught_42 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_42 instanceof InvalidClassException ? 56 : ((Object) stateCaught_42 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_42 instanceof OptionalDataException ? 58 : ((Object) stateCaught_42 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_42 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_42 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_42 instanceof SecurityException ? 62 : ((Object) stateCaught_42 instanceof IOException ? 63 : ((Object) stateCaught_42 instanceof NullPointerException ? 64 : ((Object) stateCaught_42 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = ((Object) stateCaught_43 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_43 instanceof InvalidClassException ? 56 : ((Object) stateCaught_43 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_43 instanceof OptionalDataException ? 58 : ((Object) stateCaught_43 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_43 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_43 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_43 instanceof SecurityException ? 62 : ((Object) stateCaught_43 instanceof IOException ? 63 : ((Object) stateCaught_43 instanceof NullPointerException ? 64 : ((Object) stateCaught_43 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if (var10 instanceof Number) {
                                statePc = 50;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = ((Object) stateCaught_44 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_44 instanceof InvalidClassException ? 56 : ((Object) stateCaught_44 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_44 instanceof OptionalDataException ? 58 : ((Object) stateCaught_44 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_44 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_44 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_44 instanceof SecurityException ? 62 : ((Object) stateCaught_44 instanceof IOException ? 63 : ((Object) stateCaught_44 instanceof NullPointerException ? 64 : ((Object) stateCaught_44 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if (!(var10 instanceof String)) {
                                statePc = 48;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = ((Object) stateCaught_45 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_45 instanceof InvalidClassException ? 56 : ((Object) stateCaught_45 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_45 instanceof OptionalDataException ? 58 : ((Object) stateCaught_45 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_45 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_45 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_45 instanceof SecurityException ? 62 : ((Object) stateCaught_45 instanceof IOException ? 63 : ((Object) stateCaught_45 instanceof NullPointerException ? 64 : ((Object) stateCaught_45 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            param0.a(113, 2);
                            param0.a((String) (var10), (byte) 105);
                            if (var12 == 0) {
                                statePc = 51;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = ((Object) stateCaught_46 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_46 instanceof InvalidClassException ? 56 : ((Object) stateCaught_46 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_46 instanceof OptionalDataException ? 58 : ((Object) stateCaught_46 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_46 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_46 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_46 instanceof SecurityException ? 62 : ((Object) stateCaught_46 instanceof IOException ? 63 : ((Object) stateCaught_46 instanceof NullPointerException ? 64 : ((Object) stateCaught_46 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = ((Object) stateCaught_47 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_47 instanceof InvalidClassException ? 56 : ((Object) stateCaught_47 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_47 instanceof OptionalDataException ? 58 : ((Object) stateCaught_47 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_47 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_47 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_47 instanceof SecurityException ? 62 : ((Object) stateCaught_47 instanceof IOException ? 63 : ((Object) stateCaught_47 instanceof NullPointerException ? 64 : ((Object) stateCaught_47 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            param0.a(-45, 4);
                            if (var12 == 0) {
                                statePc = 51;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = ((Object) stateCaught_48 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_48 instanceof InvalidClassException ? 56 : ((Object) stateCaught_48 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_48 instanceof OptionalDataException ? 58 : ((Object) stateCaught_48 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_48 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_48 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_48 instanceof SecurityException ? 62 : ((Object) stateCaught_48 instanceof IOException ? 63 : ((Object) stateCaught_48 instanceof NullPointerException ? 64 : ((Object) stateCaught_48 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = ((Object) stateCaught_49 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_49 instanceof InvalidClassException ? 56 : ((Object) stateCaught_49 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_49 instanceof OptionalDataException ? 58 : ((Object) stateCaught_49 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_49 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_49 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_49 instanceof SecurityException ? 62 : ((Object) stateCaught_49 instanceof IOException ? 63 : ((Object) stateCaught_49 instanceof NullPointerException ? 64 : ((Object) stateCaught_49 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            param0.a(116, 1);
                            param0.a(((Number) (var10)).longValue(), true);
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = ((Object) stateCaught_50 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_50 instanceof InvalidClassException ? 56 : ((Object) stateCaught_50 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_50 instanceof OptionalDataException ? 58 : ((Object) stateCaught_50 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_50 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_50 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_50 instanceof SecurityException ? 62 : ((Object) stateCaught_50 instanceof IOException ? 63 : ((Object) stateCaught_50 instanceof NullPointerException ? 64 : ((Object) stateCaught_50 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            if (var12 == 0) {
                                statePc = 67;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = ((Object) stateCaught_51 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_51 instanceof InvalidClassException ? 56 : ((Object) stateCaught_51 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_51 instanceof OptionalDataException ? 58 : ((Object) stateCaught_51 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_51 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_51 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_51 instanceof SecurityException ? 62 : ((Object) stateCaught_51 instanceof IOException ? 63 : ((Object) stateCaught_51 instanceof NullPointerException ? 64 : ((Object) stateCaught_51 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if ((var6_int ^ -1) != -5) {
                                statePc = 67;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = ((Object) stateCaught_52 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_52 instanceof InvalidClassException ? 56 : ((Object) stateCaught_52 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_52 instanceof OptionalDataException ? 58 : ((Object) stateCaught_52 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_52 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_52 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_52 instanceof SecurityException ? 62 : ((Object) stateCaught_52 instanceof IOException ? 63 : ((Object) stateCaught_52 instanceof NullPointerException ? 64 : ((Object) stateCaught_52 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            var27 = (java.lang.reflect.Method) (var13.field_l[var5].field_d);
                            var8 = var27.getModifiers();
                            param0.a(125, 0);
                            param0.b(-102, var8);
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = ((Object) stateCaught_53 instanceof ClassNotFoundException ? 55 : ((Object) stateCaught_53 instanceof InvalidClassException ? 56 : ((Object) stateCaught_53 instanceof StreamCorruptedException ? 57 : ((Object) stateCaught_53 instanceof OptionalDataException ? 58 : ((Object) stateCaught_53 instanceof IllegalAccessException ? 59 : ((Object) stateCaught_53 instanceof IllegalArgumentException ? 60 : ((Object) stateCaught_53 instanceof java.lang.reflect.InvocationTargetException ? 61 : ((Object) stateCaught_53 instanceof SecurityException ? 62 : ((Object) stateCaught_53 instanceof IOException ? 63 : ((Object) stateCaught_53 instanceof NullPointerException ? 64 : ((Object) stateCaught_53 instanceof Exception ? 65 : 66)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            var6 = (ClassNotFoundException) ((Object) caughtException);
                            param0.a(111, -10);
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            var6_ref = (InvalidClassException) ((Object) caughtException);
                            param0.a(118, -11);
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            var6_ref2 = (StreamCorruptedException) ((Object) caughtException);
                            param0.a(126, -12);
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            var6_ref3 = (OptionalDataException) ((Object) caughtException);
                            param0.a(param1 ^ 125, -13);
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            var6_ref4 = (IllegalAccessException) ((Object) caughtException);
                            param0.a(-109, -14);
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            var6_ref5 = (IllegalArgumentException) ((Object) caughtException);
                            param0.a(125, -15);
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            var6_ref6 = (java.lang.reflect.InvocationTargetException) ((Object) caughtException);
                            param0.a(-27, -16);
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            var6_ref7 = (SecurityException) ((Object) caughtException);
                            param0.a(param1 + 127, -17);
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            var6_ref8 = (IOException) ((Object) caughtException);
                            param0.a(-38, -18);
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            var6_ref9 = (NullPointerException) ((Object) caughtException);
                            param0.a(param1 ^ 115, -19);
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            var6_ref10 = (Exception) ((Object) caughtException);
                            param0.a(124, -20);
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            var6_ref11 = caughtException;
                            param0.a(-97, -21);
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            var5++;
                            if (var12 == 0) {
                                statePc = 24;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            stackIn_69_0 = param0.f(var4, 117);
                            statePc = 69;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            var17.a(true);
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        return;
                    }
                    case 71: {
                        var2 = (RuntimeException) ((Object) caughtException);
                        stackIn_73_0 = (RuntimeException) (var2);
                        stackIn_72_0 = stackIn_73_0;
                        stackIn_73_1 = new StringBuilder().append("hd.P(");
                        stackIn_72_1 = stackIn_73_1;
                        if (param0 == null) {
                            statePc = 73;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    }
                    case 72: {
                        stackIn_74_0 = (RuntimeException) ((Object) stackIn_72_0);
                        stackIn_74_1 = (StringBuilder) ((Object) stackIn_72_1);
                        stackIn_74_2 = "{...}";
                        statePc = 74;
                        continue stateLoop;
                    }
                    case 73: {
                        stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
                        stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
                        stackIn_74_2 = "null";
                        statePc = 74;
                        continue stateLoop;
                    }
                    case 74: {
                        throw fa.a((Throwable) ((Object) stackIn_74_0), stackIn_74_2 + ',' + param1 + ')');
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, int param1) {
        if (!(gi.field_i == null)) {
            gi.field_i.c(param0, -1);
        }
        if (param1 != -19) {
            k var3 = (k) null;
            hd.a((java.math.BigInteger) null, (byte) -46, (java.math.BigInteger) null, (k) null, (k) null);
        }
    }

    final static String a(int param0, String param1, int param2) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_17_0 = null;
        String stackIn_20_0 = null;
        String stackIn_23_0 = null;
        String stackIn_27_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 3) {
              stackIn_3_0 = ga.field_q;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((param0 ^ -1) == -7) {
                stackIn_7_0 = gm.field_ob;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0 == 7) {
                  stackIn_11_0 = kb.field_w;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if ((param0 ^ -1) != param2) {
                    if (-10 != (param0 ^ -1)) {
                      if ((param0 ^ -1) != -11) {
                        if (11 != param0) {
                          if (param0 == 14) {
                            stackIn_27_0 = vl.a(gl.field_K, new String[]{param1}, 2);
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            return null;
                          }
                        } else {
                          stackIn_23_0 = ek.field_I;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      } else {
                        stackIn_20_0 = qi.field_b;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      stackIn_17_0 = la.field_b;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_14_0 = fd.field_I;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var3);

            stackIn_31_1 = new StringBuilder().append("hd.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L1;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L1;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_17_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_20_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_23_0;
                    } else {
                      return stackIn_27_0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    static {
        field_r = new ao(0, 2, 2, 1);
        field_w = new ao(13, 0, 1, 0);
        field_t = "Phantom";
        field_u = 75;
    }
}
