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
        if (param0 >= -19) {
            em var4 = (em) null;
            this.a(true, (byte) 20, (em) null);
        }
        if (null == this.field_L) {
            return false;
        }
        this.field_L.a(param1 * this.field_L.field_W + this.field_L.field_E, (byte) -63);
        return true;
    }

    final void a(ga param0, byte param1, int param2, int param3) {
        try {
            int var5_int = 81 / ((param1 - 46) / 42);
            super.a(param0, (byte) -38, param2, param3);
            this.f(-98);
            this.f((byte) 124);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "qi.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void e(byte param0) {
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        em stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        em stackIn_22_0;
        int stackIn_22_1;
        int stackIn_22_2;
        int stackIn_22_3;
        em stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        em stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
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
            if (this.field_I) {
              break L2;
            } else {
              if (null == this.field_L) {
                break L2;
              } else {
                stackIn_6_0 = this.field_L.field_i;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        L3: {
          L4: {
            var2 = stackIn_6_0;
            if (this.field_K) {
              break L4;
            } else {
              if (this.field_H != null) {
                stackIn_11_0 = this.field_H.field_n;
                break L3;
              } else {
                break L4;
              }
            }
          }
          stackIn_11_0 = 0;
          break L3;
        }
        L5: {
          var3 = stackIn_11_0;
          if (null == this.field_L) {
            stackIn_14_0 = this.field_i;
            break L5;
          } else {
            stackIn_14_0 = this.field_i - this.field_L.field_i;
            break L5;
          }
        }
        L6: {
          var4 = stackIn_14_0;
          if (this.field_H != null) {
            stackIn_17_0 = this.field_n + -this.field_H.field_n;
            break L6;
          } else {
            stackIn_17_0 = this.field_n;
            break L6;
          }
        }
        L7: {
          var5 = stackIn_17_0;
          this.field_D.a(-89, var3, var2, var4, var5);
          if (this.field_L != null) {
            L8: {
              stackIn_21_0 = this.field_L;

              stackIn_21_1 = 79;

              stackIn_21_2 = this.field_D.field_j;

              if (!this.field_I) {
                stackIn_22_0 = (em) ((Object) stackIn_21_0);
                stackIn_22_1 = stackIn_21_1;
                stackIn_22_2 = stackIn_21_2;
                stackIn_22_3 = 0;
                break L8;
              } else {
                stackIn_22_0 = (em) ((Object) stackIn_21_0);
                stackIn_22_1 = stackIn_21_1;
                stackIn_22_2 = stackIn_21_2;
                stackIn_22_3 = -this.field_L.field_i + this.field_i;
                break L8;
              }
            }
            ((em) (Object) stackIn_22_0).a(stackIn_22_1, stackIn_22_2, stackIn_22_3, this.field_L.field_i, this.field_D.field_n);
            break L7;
          } else {
            break L7;
          }
        }
        L9: {
          if (null == this.field_H) {
            break L9;
          } else {
            L10: {
              stackIn_26_0 = this.field_H;

              stackIn_26_1 = 70;

              if (this.field_K) {
                stackIn_27_0 = (em) ((Object) stackIn_26_0);
                stackIn_27_1 = stackIn_26_1;
                stackIn_27_2 = this.field_n + -this.field_H.field_n;
                break L10;
              } else {
                stackIn_27_0 = (em) ((Object) stackIn_26_0);
                stackIn_27_1 = stackIn_26_1;
                stackIn_27_2 = 0;
                break L10;
              }
            }
            ((em) (Object) stackIn_27_0).a(stackIn_27_1, stackIn_27_2, this.field_D.field_k, this.field_D.field_i, this.field_H.field_n);
            break L9;
          }
        }
        this.f(78);
    }

    final boolean a(ga param0, int param1, int param2, int param3, int param4, boolean param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                L2: {
                  if (!this.e(-17741)) {
                    break L2;
                  } else {
                    if (!this.a(-118, param1)) {
                      break L2;
                    } else {
                      stackIn_8_0 = 1;
                      break L1;
                    }
                  }
                }
                stackIn_8_0 = 0;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var8);

            stackIn_11_1 = new StringBuilder().append("qi.OA(");

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
          throw sh.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    private final void f(byte param0) {
        if (this.field_H != null) {
            this.field_D.field_z.field_k = -(int)((long)this.field_H.field_D * (long)(-this.field_D.field_i + this.field_D.field_z.field_i) >> 890092112);
        }
        if (param0 < 123) {
            return;
        }
        if (this.field_L != null) {
            this.field_D.field_z.field_j = -(int)((long)(-this.field_D.field_n + this.field_D.field_z.field_n) * (long)this.field_L.field_E >> -1906996208);
        }
    }

    final static void a(String param0, java.applet.Applet param1, int param2) {
        try {
            java.net.URL var3 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            StringBuilder stackIn_11_1 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
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
                        qi.a(false, 5, 83, 100L, (byte) 62);
                        break L2;
                      }
                    }
                    wi.a(var3.toString(), param1, true, -20517);
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
                stackIn_8_0 = (RuntimeException) (var3_ref2);

                stackIn_8_1 = new StringBuilder().append("qi.K(");

                if (param0 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L4;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L4;
                }
              }
              L5: {


                stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

                if (param1 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "null";
                  break L5;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "{...}";
                  break L5;
                }
              }
              throw sh.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void f(int param0) {
        int var3 = ZombieDawn.field_J;
        if (this.field_L != null) {
            if (this.field_D.field_z.field_n > this.field_D.field_n) {
                this.field_L.c(-30674, this.field_D.field_z.field_n, this.field_D.field_n);
            } else {
                this.field_L.c(-30674, 1, 1);
            }
        }
        int var2 = 126 / ((param0 - 33) / 43);
        if (this.field_H == null) {
        } else {
            if (this.field_D.field_z.field_i <= this.field_D.field_i) {
                this.field_H.b(1, 26, 1);
            } else {
                this.field_H.b(this.field_D.field_z.field_i, -126, this.field_D.field_i);
            }
        }
    }

    final void a(boolean param0, byte param1, em param2) {
        try {
            if (param1 <= 99) {
                this.field_I = false;
            }
            this.field_I = param0 ? true : false;
            this.field_L = param2;
            this.field_B[1] = (ga) ((Object) param2);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "qi.L(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0, int param1, ga param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = -78 % ((param0 - -83) / 32);
            if (super.a(-126, param1, param2, param3)) {
              this.f((byte) 124);
              stackIn_3_0 = 1;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("qi.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param3 + ')');
        }
        return stackIn_3_0 != 0;
    }

    qi(int param0, int param1, int param2, int param3, io param4, ga param5, io param6) {
        super(param0, param1, param2, param3, param4);
        rg dupTemp$0 = null;
        try {
            this.field_B = new ga[3];
            dupTemp$0 = new rg(param0, param1, param2, param3, param6, param5);
            this.field_D = dupTemp$0;
            this.field_B[2] = (ga) ((Object) dupTemp$0);
            this.e((byte) 82);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "qi.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
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
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        int var6;
        int var7;
        int var8;
        StringBuilder var9;
        int var10;
        int var11;
        int var12;
        var12 = ZombieDawn.field_J;
        var6 = 44;
        var7 = 46;
        if (param4 == 113) {
          L0: {
            if (-1 == (param2 ^ -1)) {
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
            if ((param3 ^ -1L) > -1L) {
              param3 = -param3;
              var8 = 1;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            var9 = new StringBuilder(26);
            if (-1 > (param1 ^ -1)) {
              var10 = 0;
              L4: while (true) {
                if (var10 >= param1) {
                  discarded$0 = var9.append((char) var6);
                  break L3;
                } else {
                  var11 = (int)param3;
                  param3 = param3 / 10L;
                  discarded$1 = var9.append((char)(48 + (var11 - 10 * (int)param3)));
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
            discarded$2 = var9.append((char)(48 + var11 + -(10 * (int)param3)));
            if ((param3 ^ -1L) != -1L) {
              if (!param0) {
                continue L5;
              } else {
                var10++;
                if (-1 != (var10 % 3 ^ -1)) {
                  continue L5;
                } else {
                  discarded$3 = var9.append((char) var7);
                  continue L5;
                }
              }
            } else {
              L6: {
                if (var8 == 0) {
                  break L6;
                } else {
                  discarded$4 = var9.append('-');
                  break L6;
                }
              }
              return var9.reverse().toString();
            }
          }
        } else {
          return (String) null;
        }
    }

    static {
        field_J = new vo();
        field_C = "Login: ";
    }
}
