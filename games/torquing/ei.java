/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei {
    q field_b;
    static ed field_c;
    private q field_a;

    final static Class a(byte param0, String param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_2_0 = null;
        Class stackIn_5_0 = null;
        Class stackIn_9_0 = null;
        Class stackIn_14_0 = null;
        Class stackIn_17_0 = null;
        Class stackIn_21_0 = null;
        Class stackIn_24_0 = null;
        Class stackIn_28_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Class stackOut_8_0 = null;
        Class stackOut_20_0 = null;
        Class stackOut_27_0 = null;
        Class stackOut_23_0 = null;
        Class stackOut_16_0 = null;
        Class stackOut_13_0 = null;
        Class stackOut_4_0 = null;
        Class stackOut_1_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            if (!param1.equals("B")) {
              if (!param1.equals("I")) {
                if (param1.equals("S")) {
                  stackOut_8_0 = Short.TYPE;
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L1: {
                    if (param0 <= -102) {
                      break L1;
                    } else {
                      ei.d(13);
                      break L1;
                    }
                  }
                  if (!param1.equals("J")) {
                    if (!param1.equals("Z")) {
                      if (param1.equals("F")) {
                        stackOut_20_0 = Float.TYPE;
                        stackIn_21_0 = stackOut_20_0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (!param1.equals("D")) {
                          if (param1.equals("C")) {
                            stackOut_27_0 = Character.TYPE;
                            stackIn_28_0 = stackOut_27_0;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            return Class.forName(param1);
                          }
                        } else {
                          stackOut_23_0 = Double.TYPE;
                          stackIn_24_0 = stackOut_23_0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      }
                    } else {
                      stackOut_16_0 = Boolean.TYPE;
                      stackIn_17_0 = stackOut_16_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackOut_13_0 = Long.TYPE;
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } else {
                stackOut_4_0 = Integer.TYPE;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = Byte.TYPE;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var2);
            stackOut_29_1 = new StringBuilder().append("ei.L(").append(param0).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L2;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L2;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_17_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_21_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_24_0;
                    } else {
                      return stackIn_28_0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final int a(boolean param0) {
        int var2 = 0;
        q var3 = null;
        int var4 = 0;
        var4 = Torquing.field_u;
        if (param0) {
          return -4;
        } else {
          var2 = 0;
          var3 = this.field_b.field_e;
          L0: while (true) {
            if (this.field_b == var3) {
              return var2;
            } else {
              var2++;
              var3 = var3.field_e;
              continue L0;
            }
          }
        }
    }

    final void a(byte param0, q param1) {
        q discarded$2 = null;
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (null == param1.field_h) {
                break L1;
              } else {
                param1.f(0);
                break L1;
              }
            }
            param1.field_e = this.field_b;
            param1.field_h = this.field_b.field_h;
            param1.field_h.field_e = param1;
            param1.field_e.field_h = param1;
            if (param0 == 54) {
              break L0;
            } else {
              discarded$2 = this.f(-122);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("ei.H(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    final q b(int param0) {
        q var2 = null;
        var2 = this.field_b.field_e;
        if (this.field_b != var2) {
          if (param0 != 0) {
            return (q) null;
          } else {
            this.field_a = var2.field_e;
            return var2;
          }
        } else {
          this.field_a = null;
          return null;
        }
    }

    final q b(byte param0) {
        q var2 = null;
        int var3 = 0;
        var2 = this.field_b.field_h;
        var3 = 70 / ((param0 - -20) / 35);
        if (this.field_b == var2) {
          return null;
        } else {
          var2.f(0);
          return var2;
        }
    }

    final q c(int param0) {
        q var2 = null;
        if (param0 == -6938) {
          var2 = this.field_b.field_h;
          if (var2 == this.field_b) {
            this.field_a = null;
            return null;
          } else {
            this.field_a = var2.field_h;
            return var2;
          }
        } else {
          field_c = (ed) null;
          var2 = this.field_b.field_h;
          if (var2 == this.field_b) {
            this.field_a = null;
            return null;
          } else {
            this.field_a = var2.field_h;
            return var2;
          }
        }
    }

    final q a(byte param0) {
        q var2 = null;
        int var3 = 0;
        var2 = this.field_b.field_e;
        if (var2 == this.field_b) {
          return null;
        } else {
          var2.f(0);
          var3 = 93 / ((param0 - -47) / 35);
          return var2;
        }
    }

    final q f(int param0) {
        q var2 = null;
        q var3 = null;
        var2 = this.field_a;
        if (param0 == -24059) {
          if (var2 == this.field_b) {
            this.field_a = null;
            return null;
          } else {
            this.field_a = var2.field_e;
            return var2;
          }
        } else {
          var3 = (q) null;
          this.a((byte) -22, (q) null);
          if (var2 == this.field_b) {
            this.field_a = null;
            return null;
          } else {
            this.field_a = var2.field_e;
            return var2;
          }
        }
    }

    final void a(int param0) {
        boolean discarded$1 = false;
        int var3 = 0;
        q var4 = null;
        q var5 = null;
        var3 = Torquing.field_u;
        if (param0 == 0) {
          L0: while (true) {
            var4 = this.field_b.field_e;
            if (this.field_b == var4) {
              this.field_a = null;
              return;
            } else {
              var4.f(0);
              continue L0;
            }
          }
        } else {
          discarded$1 = this.e(-39);
          L1: while (true) {
            var5 = this.field_b.field_e;
            if (this.field_b == var5) {
              this.field_a = null;
              return;
            } else {
              var5.f(0);
              continue L1;
            }
          }
        }
    }

    final void b(byte param0, q param1) {
        boolean discarded$0 = false;
        try {
            if (param1.field_h != null) {
                param1.f(0);
            }
            param1.field_e = this.field_b.field_e;
            param1.field_h = this.field_b;
            param1.field_h.field_e = param1;
            if (param0 != 68) {
                discarded$0 = this.e(11);
            }
            param1.field_e.field_h = param1;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "ei.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(int param0) {
        if (param0 < 25) {
            ei.d(19);
            field_c = null;
            return;
        }
        field_c = null;
    }

    public ei() {
        this.field_b = new q();
        this.field_b.field_h = this.field_b;
        this.field_b.field_e = this.field_b;
    }

    final boolean e(int param0) {
        q discarded$10 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 > -84) {
          L0: {
            discarded$10 = this.f(41);
            if (this.field_b.field_e != this.field_b) {
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
            if (this.field_b.field_e != this.field_b) {
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

    static {
        field_c = new ed();
    }
}
