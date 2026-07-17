/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij {
    ksa field_a;
    private ksa field_b;

    final ksa a(boolean param0) {
        ksa var2 = null;
        var2 = ((ij) this).field_a.field_c;
        if (((ij) this).field_a != var2) {
          if (!param0) {
            return null;
          } else {
            var2.b(-3846);
            return var2;
          }
        } else {
          return null;
        }
    }

    final ksa[] f(int param0) {
        ksa[] var2 = null;
        int var3 = 0;
        ksa var4 = null;
        int var5 = 0;
        ksa[] var6 = null;
        var5 = VoidHunters.field_G;
        var6 = new ksa[((ij) this).c(3)];
        var2 = var6;
        if (param0 != -4872) {
          return null;
        } else {
          var3 = 0;
          var4 = ((ij) this).field_a.field_c;
          L0: while (true) {
            if (var4 == ((ij) this).field_a) {
              return var2;
            } else {
              int incrementValue$2 = var3;
              var3++;
              var6[incrementValue$2] = var4;
              var4 = var4.field_c;
              continue L0;
            }
          }
        }
    }

    final ksa a(int param0, ksa param1) {
        ksa var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        ksa stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        ksa stackOut_9_0 = null;
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
              if (param1 == null) {
                var3 = ((ij) this).field_a.field_c;
                break L1;
              } else {
                var3 = param1;
                break L1;
              }
            }
            L2: {
              if (param0 == 3) {
                break L2;
              } else {
                int discarded$2 = ((ij) this).c(111);
                break L2;
              }
            }
            if (var3 == ((ij) this).field_a) {
              ((ij) this).field_b = null;
              stackOut_7_0 = null;
              stackIn_8_0 = stackOut_7_0;
              return (ksa) (Object) stackIn_8_0;
            } else {
              ((ij) this).field_b = var3.field_c;
              stackOut_9_0 = (ksa) var3;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("ij.J(").append(param0).append(44);
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
          throw rta.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0;
    }

    final ksa c(byte param0) {
        ksa var2 = null;
        Object var3 = null;
        if (param0 < -102) {
          var2 = ((ij) this).field_a.field_a;
          if (((ij) this).field_a == var2) {
            return null;
          } else {
            var2.b(-3846);
            return var2;
          }
        } else {
          var3 = null;
          ((ij) this).a((ksa) null, (byte) -49);
          var2 = ((ij) this).field_a.field_a;
          if (((ij) this).field_a == var2) {
            return null;
          } else {
            var2.b(-3846);
            return var2;
          }
        }
    }

    final void b(int param0, ksa param1) {
        try {
            if (param0 != -10258) {
                ((ij) this).e(-27);
            }
            if (param1.field_a != null) {
                param1.b(-3846);
            }
            param1.field_a = ((ij) this).field_a.field_a;
            param1.field_c = ((ij) this).field_a;
            param1.field_a.field_c = param1;
            param1.field_c.field_a = param1;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "ij.M(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void e(int param0) {
        ksa var2 = null;
        int var3 = 0;
        var3 = VoidHunters.field_G;
        L0: while (true) {
          var2 = ((ij) this).field_a.field_c;
          if (((ij) this).field_a == var2) {
            if (param0 < 89) {
              ((ij) this).field_a = null;
              ((ij) this).field_b = null;
              return;
            } else {
              ((ij) this).field_b = null;
              return;
            }
          } else {
            var2.b(-3846);
            continue L0;
          }
        }
    }

    final boolean b(int param0) {
        int var2 = 60 % ((59 - param0) / 37);
        return ((ij) this).field_a.field_c == ((ij) this).field_a ? true : false;
    }

    final void a(ksa param0, byte param1) {
        if (null != param0.field_a) {
            param0.b(-3846);
        }
        param0.field_c = ((ij) this).field_a.field_c;
        param0.field_a = ((ij) this).field_a;
        param0.field_a.field_c = param0;
        if (param1 != -55) {
            return;
        }
        try {
            param0.field_c.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "ij.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final ksa a(byte param0) {
        ksa var2 = null;
        if (param0 > 6) {
          var2 = ((ij) this).field_b;
          if (var2 == ((ij) this).field_a) {
            ((ij) this).field_b = null;
            return null;
          } else {
            ((ij) this).field_b = var2.field_c;
            return var2;
          }
        } else {
          return null;
        }
    }

    final static int a(byte[] param0, int param1, int param2, String param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var11 = VoidHunters.field_G;
        try {
          L0: {
            if (param1 == -10388) {
              var4_int = param2;
              var5 = param3.length();
              var6 = 0;
              L1: while (true) {
                L2: {
                  if (var6 >= var5) {
                    break L2;
                  } else {
                    L3: {
                      var7 = mwa.a(param3.charAt(var6), -89);
                      if (var5 > var6 + 1) {
                        stackOut_8_0 = mwa.a(param3.charAt(1 + var6), -23);
                        stackIn_9_0 = stackOut_8_0;
                        break L3;
                      } else {
                        stackOut_7_0 = -1;
                        stackIn_9_0 = stackOut_7_0;
                        break L3;
                      }
                    }
                    L4: {
                      var8 = stackIn_9_0;
                      if (var6 - -2 < var5) {
                        stackOut_11_0 = mwa.a(param3.charAt(2 + var6), -103);
                        stackIn_12_0 = stackOut_11_0;
                        break L4;
                      } else {
                        stackOut_10_0 = -1;
                        stackIn_12_0 = stackOut_10_0;
                        break L4;
                      }
                    }
                    L5: {
                      var9 = stackIn_12_0;
                      if (3 + var6 >= var5) {
                        stackOut_14_0 = -1;
                        stackIn_15_0 = stackOut_14_0;
                        break L5;
                      } else {
                        stackOut_13_0 = mwa.a(param3.charAt(var6 + 3), -84);
                        stackIn_15_0 = stackOut_13_0;
                        break L5;
                      }
                    }
                    var10 = stackIn_15_0;
                    int incrementValue$3 = param2;
                    param2++;
                    param0[incrementValue$3] = (byte)knb.a(var8 >>> 4, var7 << 2);
                    if (var9 == -1) {
                      break L2;
                    } else {
                      int incrementValue$4 = param2;
                      param2++;
                      param0[incrementValue$4] = (byte)knb.a(dla.a(15, var8) << 4, var9 >>> 2);
                      if (-1 == var10) {
                        break L2;
                      } else {
                        int incrementValue$5 = param2;
                        param2++;
                        param0[incrementValue$5] = (byte)knb.a(var10, dla.a(var9, 3) << 6);
                        var6 += 4;
                        continue L1;
                      }
                    }
                  }
                }
                stackOut_18_0 = param2 + -var4_int;
                stackIn_19_0 = stackOut_18_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 104;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var4;
            stackOut_20_1 = new StringBuilder().append("ij.N(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          L7: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param3 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
        return stackIn_19_0;
    }

    final ksa d(int param0) {
        ksa var2 = null;
        if (param0 != 0) {
            ((ij) this).field_a = null;
            var2 = ((ij) this).field_a.field_c;
            if (!(var2 != ((ij) this).field_a)) {
                ((ij) this).field_b = null;
                return null;
            }
            ((ij) this).field_b = var2.field_c;
            return var2;
        }
        var2 = ((ij) this).field_a.field_c;
        if (!(var2 != ((ij) this).field_a)) {
            ((ij) this).field_b = null;
            return null;
        }
        ((ij) this).field_b = var2.field_c;
        return var2;
    }

    final ksa a(int param0) {
        ksa var2 = null;
        if (param0 != -1155566844) {
            boolean discarded$0 = ((ij) this).b(-8);
            var2 = ((ij) this).field_b;
            if (!(((ij) this).field_a != var2)) {
                ((ij) this).field_b = null;
                return null;
            }
            ((ij) this).field_b = var2.field_a;
            return var2;
        }
        var2 = ((ij) this).field_b;
        if (!(((ij) this).field_a != var2)) {
            ((ij) this).field_b = null;
            return null;
        }
        ((ij) this).field_b = var2.field_a;
        return var2;
    }

    final ksa b(byte param0) {
        ksa var2 = null;
        var2 = ((ij) this).field_a.field_a;
        if (param0 >= 115) {
          if (var2 == ((ij) this).field_a) {
            ((ij) this).field_b = null;
            return null;
          } else {
            ((ij) this).field_b = var2.field_a;
            return var2;
          }
        } else {
          ksa[] discarded$7 = ((ij) this).f(-72);
          if (var2 == ((ij) this).field_a) {
            ((ij) this).field_b = null;
            return null;
          } else {
            ((ij) this).field_b = var2.field_a;
            return var2;
          }
        }
    }

    public ij() {
        ((ij) this).field_a = new ksa();
        ((ij) this).field_a.field_c = ((ij) this).field_a;
        ((ij) this).field_a.field_a = ((ij) this).field_a;
    }

    final int c(int param0) {
        int var2 = 0;
        ksa var3 = null;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        if (param0 != 3) {
          ((ij) this).field_a = null;
          var2 = 0;
          var3 = ((ij) this).field_a.field_c;
          L0: while (true) {
            if (var3 == ((ij) this).field_a) {
              return var2;
            } else {
              var3 = var3.field_c;
              var2++;
              continue L0;
            }
          }
        } else {
          var2 = 0;
          var3 = ((ij) this).field_a.field_c;
          L1: while (true) {
            if (var3 == ((ij) this).field_a) {
              return var2;
            } else {
              var3 = var3.field_c;
              var2++;
              continue L1;
            }
          }
        }
    }

    static {
    }
}
