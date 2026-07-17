/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi extends eh {
    static vo field_J;
    static int field_E;
    private em field_H;
    static mf field_G;
    em field_L;
    private boolean field_K;
    static String field_C;
    static boolean field_F;
    private boolean field_I;
    rg field_D;

    private final boolean a(int param0, int param1) {
        if (null == ((qi) this).field_L) {
            return false;
        }
        ((qi) this).field_L.a(param1 * ((qi) this).field_L.field_W + ((qi) this).field_L.field_E, (byte) -63);
        return true;
    }

    final void a(ga param0, byte param1, int param2, int param3) {
        try {
            int var5_int = 81 / ((param1 - 46) / 42);
            super.a(param0, (byte) -38, param2, param3);
            this.f(-98);
            int discarded$0 = 124;
            this.f();
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "qi.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        em stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        em stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        em stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        em stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        em stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        em stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        em stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        em stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        em stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        em stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        em stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        em stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        L0: {
          if (param0 >= 38) {
            break L0;
          } else {
            field_E = -6;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((qi) this).field_I) {
              break L2;
            } else {
              if (null == ((qi) this).field_L) {
                break L2;
              } else {
                stackOut_4_0 = ((qi) this).field_L.field_i;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        L3: {
          L4: {
            var2 = stackIn_6_0;
            if (((qi) this).field_K) {
              break L4;
            } else {
              if (((qi) this).field_H != null) {
                stackOut_10_0 = ((qi) this).field_H.field_n;
                stackIn_11_0 = stackOut_10_0;
                break L3;
              } else {
                break L4;
              }
            }
          }
          stackOut_9_0 = 0;
          stackIn_11_0 = stackOut_9_0;
          break L3;
        }
        L5: {
          var3 = stackIn_11_0;
          if (null == ((qi) this).field_L) {
            stackOut_13_0 = ((qi) this).field_i;
            stackIn_14_0 = stackOut_13_0;
            break L5;
          } else {
            stackOut_12_0 = ((qi) this).field_i - ((qi) this).field_L.field_i;
            stackIn_14_0 = stackOut_12_0;
            break L5;
          }
        }
        L6: {
          var4 = stackIn_14_0;
          if (((qi) this).field_H != null) {
            stackOut_16_0 = ((qi) this).field_n + -((qi) this).field_H.field_n;
            stackIn_17_0 = stackOut_16_0;
            break L6;
          } else {
            stackOut_15_0 = ((qi) this).field_n;
            stackIn_17_0 = stackOut_15_0;
            break L6;
          }
        }
        L7: {
          var5 = stackIn_17_0;
          ((qi) this).field_D.a(-89, var3, var2, var4, var5);
          if (((qi) this).field_L != null) {
            L8: {
              stackOut_19_0 = ((qi) this).field_L;
              stackOut_19_1 = 79;
              stackOut_19_2 = ((qi) this).field_D.field_j;
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              if (!((qi) this).field_I) {
                stackOut_21_0 = (em) (Object) stackIn_21_0;
                stackOut_21_1 = stackIn_21_1;
                stackOut_21_2 = stackIn_21_2;
                stackOut_21_3 = 0;
                stackIn_22_0 = stackOut_21_0;
                stackIn_22_1 = stackOut_21_1;
                stackIn_22_2 = stackOut_21_2;
                stackIn_22_3 = stackOut_21_3;
                break L8;
              } else {
                stackOut_20_0 = (em) (Object) stackIn_20_0;
                stackOut_20_1 = stackIn_20_1;
                stackOut_20_2 = stackIn_20_2;
                stackOut_20_3 = -((qi) this).field_L.field_i + ((qi) this).field_i;
                stackIn_22_0 = stackOut_20_0;
                stackIn_22_1 = stackOut_20_1;
                stackIn_22_2 = stackOut_20_2;
                stackIn_22_3 = stackOut_20_3;
                break L8;
              }
            }
            ((em) (Object) stackIn_22_0).a(stackIn_22_1, stackIn_22_2, stackIn_22_3, ((qi) this).field_L.field_i, ((qi) this).field_D.field_n);
            break L7;
          } else {
            break L7;
          }
        }
        L9: {
          if (null == ((qi) this).field_H) {
            break L9;
          } else {
            L10: {
              stackOut_24_0 = ((qi) this).field_H;
              stackOut_24_1 = 70;
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              if (((qi) this).field_K) {
                stackOut_26_0 = (em) (Object) stackIn_26_0;
                stackOut_26_1 = stackIn_26_1;
                stackOut_26_2 = ((qi) this).field_n + -((qi) this).field_H.field_n;
                stackIn_27_0 = stackOut_26_0;
                stackIn_27_1 = stackOut_26_1;
                stackIn_27_2 = stackOut_26_2;
                break L10;
              } else {
                stackOut_25_0 = (em) (Object) stackIn_25_0;
                stackOut_25_1 = stackIn_25_1;
                stackOut_25_2 = 0;
                stackIn_27_0 = stackOut_25_0;
                stackIn_27_1 = stackOut_25_1;
                stackIn_27_2 = stackOut_25_2;
                break L10;
              }
            }
            ((em) (Object) stackIn_27_0).a(stackIn_27_1, stackIn_27_2, ((qi) this).field_D.field_k, ((qi) this).field_D.field_i, ((qi) this).field_H.field_n);
            break L9;
          }
        }
        this.f(78);
    }

    final boolean a(ga param0, int param1, int param2, int param3, int param4, boolean param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
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
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              L1: {
                L2: {
                  if (!((qi) this).e(-17741)) {
                    break L2;
                  } else {
                    if (!this.a(-118, param1)) {
                      break L2;
                    } else {
                      stackOut_6_0 = 1;
                      stackIn_8_0 = stackOut_6_0;
                      break L1;
                    }
                  }
                }
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L1;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var8;
            stackOut_9_1 = new StringBuilder().append("qi.OA(");
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
          throw sh.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_8_0 != 0;
    }

    private final void f() {
        if (((qi) this).field_H != null) {
            ((qi) this).field_D.field_z.field_k = -(int)((long)((qi) this).field_H.field_D * (long)(-((qi) this).field_D.field_i + ((qi) this).field_D.field_z.field_i) >> 16);
        }
    }

    final static void a(String param0, java.applet.Applet param1, int param2) {
        try {
            java.net.URL var3 = null;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
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
                try {
                  L1: {
                    L2: {
                      var3 = new java.net.URL(param1.getCodeBase(), param0);
                      var3 = rc.a(-1, param1, var3);
                      if (param2 < -41) {
                        break L2;
                      } else {
                        String discarded$4 = qi.a(false, 5, 83, 100L, (byte) 62);
                        break L2;
                      }
                    }
                    int discarded$5 = -20517;
                    wi.a(var3.toString(), param1, true);
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var3_ref = (Exception) (Object) decompiledCaughtException;
                    var3_ref.printStackTrace();
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var3_ref2;
                stackOut_6_1 = new StringBuilder().append("qi.K(");
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
                  break L4;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L4;
                }
              }
              L5: {
                stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
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
                  break L5;
                } else {
                  stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                  stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                  stackOut_10_2 = "{...}";
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L5;
                }
              }
              throw sh.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void f(int param0) {
        int var3 = ZombieDawn.field_J;
        if (((qi) this).field_L != null) {
            if (((qi) this).field_D.field_z.field_n > ((qi) this).field_D.field_n) {
                ((qi) this).field_L.c(-30674, ((qi) this).field_D.field_z.field_n, ((qi) this).field_D.field_n);
            } else {
                ((qi) this).field_L.c(-30674, 1, 1);
            }
        }
        int var2 = 126 / ((param0 - 33) / 43);
        if (((qi) this).field_H == null) {
        } else {
            if (((qi) this).field_D.field_z.field_i <= ((qi) this).field_D.field_i) {
                ((qi) this).field_H.b(1, 26, 1);
            } else {
                ((qi) this).field_H.b(((qi) this).field_D.field_z.field_i, -126, ((qi) this).field_D.field_i);
            }
        }
    }

    final void a(boolean param0, byte param1, em param2) {
        try {
            if (param1 <= 99) {
                ((qi) this).field_I = false;
            }
            ((qi) this).field_I = param0 ? true : false;
            ((qi) this).field_L = param2;
            ((qi) this).field_B[1] = (ga) (Object) param2;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "qi.L(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final boolean a(int param0, int param1, ga param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
            var5_int = -78 % ((param0 - -83) / 32);
            if (super.a(-126, param1, param2, param3)) {
              int discarded$2 = 124;
              this.f();
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("qi.I(").append(param0).append(44).append(param1).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param3 + 41);
        }
        return stackIn_3_0 != 0;
    }

    qi(int param0, int param1, int param2, int param3, io param4, ga param5, io param6) {
        super(param0, param1, param2, param3, param4);
        try {
            ((qi) this).field_B = new ga[3];
            rg dupTemp$0 = new rg(param0, param1, param2, param3, param6, param5);
            ((qi) this).field_D = dupTemp$0;
            ((qi) this).field_B[2] = (ga) (Object) dupTemp$0;
            ((qi) this).e((byte) 82);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "qi.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 44 + (param6 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(int param0) {
        field_C = null;
        if (param0 != 0) {
            qi.a(-32);
        }
        field_J = null;
        field_G = null;
    }

    final static String a(boolean param0, int param1, int param2, long param3, byte param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = ZombieDawn.field_J;
        var6 = 44;
        var7 = 46;
        if (param4 == 113) {
          L0: {
            if (param2 == 0) {
              var6 = 46;
              var7 = 44;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (2 != param2) {
              break L1;
            } else {
              var7 = 160;
              break L1;
            }
          }
          L2: {
            var8 = 0;
            if (param3 < 0L) {
              param3 = -param3;
              var8 = 1;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            var9 = new StringBuilder(26);
            if (param1 > 0) {
              var10 = 0;
              L4: while (true) {
                if (var10 >= param1) {
                  StringBuilder discarded$5 = var9.append(var6);
                  break L3;
                } else {
                  var11 = (int)param3;
                  param3 = param3 / 10L;
                  StringBuilder discarded$6 = var9.append((char)(48 + (var11 - 10 * (int)param3)));
                  var10++;
                  continue L4;
                }
              }
            } else {
              break L3;
            }
          }
          var10 = 0;
          L5: while (true) {
            var11 = (int)param3;
            param3 = param3 / 10L;
            StringBuilder discarded$7 = var9.append((char)(48 + var11 + -(10 * (int)param3)));
            if (param3 != 0L) {
              if (!param0) {
                continue L5;
              } else {
                var10++;
                if (var10 % 3 != 0) {
                  continue L5;
                } else {
                  StringBuilder discarded$8 = var9.append(var7);
                  continue L5;
                }
              }
            } else {
              L6: {
                if (var8 == 0) {
                  break L6;
                } else {
                  StringBuilder discarded$9 = var9.append(45);
                  break L6;
                }
              }
              return var9.reverse().toString();
            }
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = new vo();
        field_C = "Login: ";
    }
}
