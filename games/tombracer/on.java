/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on {
    private boolean field_c;
    private boolean field_a;
    static mr field_b;

    final void a(byte param0) {
        this.field_a = true;
        int var2 = -27 / ((55 - param0) / 56);
    }

    final boolean b(int param0) {
        if (param0 != -59) {
            this.b(-10);
        }
        return this.field_c;
    }

    public static void d(int param0) {
        if (param0 != 32) {
            return;
        }
        field_b = null;
    }

    final void c(int param0) {
        this.field_a = true;
        if (param0 > -18) {
            return;
        }
        this.field_c = true;
    }

    final static ha a(java.awt.Canvas param0, d param1, int param2, byte param3) {
        RuntimeException var4 = null;
        ha stackIn_2_0 = null;
        cka stackIn_4_0 = null;
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
            if (param3 < -76) {
              stackIn_4_0 = new cka(param0, param1, param2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (ha) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("on.E(");

            if (param0 == null) {
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

            if (param1 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (ha) ((Object) stackIn_4_0);
        }
    }

    final void a(int param0) {
        if (param0 != 86) {
            return;
        }
        if (!this.field_a) {
            this.field_c = false;
        }
        this.field_a = false;
    }

    final void b(byte param0) {
        this.field_a = false;
        this.field_c = false;
        if (param0 != 93) {
            this.field_a = true;
        }
    }

    final static String a(CharSequence param0, byte param1, boolean param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        d var6 = null;
        String stackIn_3_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3 = mpa.a(-73, param2, param0);
            if (var3 == null) {
              L1: {
                if (param1 <= -37) {
                  break L1;
                } else {
                  var6 = (d) null;
                  on.a((java.awt.Canvas) null, (d) null, 122, (byte) 69);
                  break L1;
                }
              }
              var4 = 0;
              L2: while (true) {
                if (var4 < param0.length()) {
                  if (!fqa.a(false, param0.charAt(var4))) {
                    stackIn_12_0 = jra.field_b;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var4++;
                    continue L2;
                  }
                } else {
                  return null;
                }
              }
            } else {
              stackIn_3_0 = (String) (var3);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("on.I(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_12_0;
        }
    }

    final static boolean a(byte param0, int param1) {
        int stackIn_26_0 = 0;
        L0: {
          if (param0 == 15) {
            break L0;
          } else {
            on.d(119);
            break L0;
          }
        }
        L1: {
          L2: {
            if (oj.field_tb[82]) {
              break L2;
            } else {
              if (oj.field_tb[86]) {
                break L2;
              } else {
                L3: {
                  L4: {
                    if ((param1 ^ -1) > -17) {
                      break L4;
                    } else {
                      if (27 >= param1) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (param1 < 32) {
                      break L5;
                    } else {
                      if (-44 <= (param1 ^ -1)) {
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (-49 < (param1 ^ -1)) {
                      break L6;
                    } else {
                      if (-59 <= (param1 ^ -1)) {
                        break L3;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (64 > param1) {
                      break L7;
                    } else {
                      if (73 >= param1) {
                        break L3;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (-81 == (param1 ^ -1)) {
                    break L3;
                  } else {
                    if (param1 == 83) {
                      break L3;
                    } else {
                      if (-85 == (param1 ^ -1)) {
                        break L3;
                      } else {
                        if ((param1 ^ -1) == -86) {
                          break L3;
                        } else {
                          if ((param1 ^ -1) == -60) {
                            break L3;
                          } else {
                            if ((param1 ^ -1) == -75) {
                              break L3;
                            } else {
                              if ((param1 ^ -1) != -29) {
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                stackIn_26_0 = 1;
                break L1;
              }
            }
          }
          stackIn_26_0 = 0;
          break L1;
        }
        return stackIn_26_0 != 0;
    }

    static {
    }
}
