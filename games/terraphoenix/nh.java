/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh extends rf {
    static String field_D;
    byte field_G;
    dh field_H;
    static int[] field_E;
    int field_F;

    final static nb a(long param0, boolean param1, int param2, String param3, String param4) {
        RuntimeException var6 = null;
        ml stackIn_6_0 = null;
        mi stackIn_8_0 = null;
        nb stackIn_11_0 = null;
        hb stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (0L != param0) {
                break L1;
              } else {
                if (param4 != null) {
                  stackIn_8_0 = new mi(param4, param3);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (param1) {
              stackIn_6_0 = new ml(param0, param3);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param2 <= -49) {
                stackIn_13_0 = new hb(param0, param3);
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackIn_11_0 = (nb) null;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var6);

            stackIn_16_1 = new StringBuilder().append("nh.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param4 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (nb) ((Object) stackIn_6_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (nb) ((Object) stackIn_8_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return (nb) ((Object) stackIn_13_0);
            }
          }
        }
    }

    public static void d(int param0) {
        CharSequence var2;
        if (param0 != 30937) {
          var2 = (CharSequence) null;
          nh.a(-94, (CharSequence) null);
          field_D = null;
          field_E = null;
          return;
        } else {
          field_D = null;
          field_E = null;
          return;
        }
    }

    final static String a(int param0, CharSequence param1) {
        int var2_int = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_24_0 = null;
        String stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              if (20 < var2_int) {
                var2_int = 20;
                break L1;
              } else {
                break L1;
              }
            }
            var8 = new char[var2_int];
            var7 = var8;
            var3 = var7;
            var4 = 0;
            L2: while (true) {
              if (var2_int <= var4) {
                if (param0 == -31621) {
                  stackIn_26_0 = new String(var8);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_24_0 = (String) null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L3: {
                  L4: {
                    var5 = param1.charAt(var4);
                    if ((var5 ^ -1) > -66) {
                      break L4;
                    } else {
                      if (90 >= var5) {
                        var3[var4] = (char)(var5 + 32);
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    L6: {
                      if (var5 < 97) {
                        break L6;
                      } else {
                        if (var5 <= 122) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (48 > var5) {
                        break L7;
                      } else {
                        if (var5 > 57) {
                          break L7;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var3[var4] = (char)95;
                    break L3;
                  }
                  var3[var4] = (char)var5;
                  break L3;
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var2);

            stackIn_29_1 = new StringBuilder().append("nh.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L8;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L8;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_24_0;
        } else {
          return stackIn_26_0;
        }
    }

    final static boolean a(fa param0, fa param1, boolean param2, fa param3) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
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
        try {
          L0: {
            L1: {
              if (!param3.a(0)) {
                break L1;
              } else {
                if (!param3.a(-3, "commonui")) {
                  break L1;
                } else {
                  if (!param0.a(0)) {
                    stackIn_9_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if (param0.a(-3, "commonui")) {
                      if (!param2) {
                        L2: {
                          if (!param1.a(0)) {
                            break L2;
                          } else {
                            if (param1.a(-3, "button.gif")) {
                              stackIn_19_0 = 1;
                              decompiledRegionSelector0 = 4;
                              break L0;
                            } else {
                              break L2;
                            }
                          }
                        }
                        stackIn_17_0 = 0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        stackIn_12_0 = 1;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
            stackIn_4_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4);

            stackIn_22_1 = new StringBuilder().append("nh.A(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L3;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L4;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L5;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_23_0), stackIn_29_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0 != 0;
              } else {
                return stackIn_19_0 != 0;
              }
            }
          }
        }
    }

    final byte[] b(boolean param0) {
        if (param0) {
          if (!this.field_A) {
            if (-this.field_G + this.field_H.field_i.length > this.field_H.field_k) {
              throw new RuntimeException();
            } else {
              return this.field_H.field_i;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          return (byte[]) null;
        }
    }

    nh() {
    }

    final int c(int param0) {
        if (this.field_H != null) {
          if (param0 != 0) {
            return -30;
          } else {
            return 100 * this.field_H.field_k / (this.field_H.field_i.length - this.field_G);
          }
        } else {
          return 0;
        }
    }

    static {
        field_E = new int[]{1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 1, 3, 3, 3, 2, 3, 3, 3, 2, 2, 2, 2, 2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 2, 3, 3, 3, 2, 3, 3, 3, 2, 2, 2, 2, 0, 2, 2, 2, 0, 2, 2, 2, 0, 2, 2, 2, 0, 2, 2, 2, 0, 2, 2, 2, 0, 1, 1, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    }
}
