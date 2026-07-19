/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc extends si {
    wf field_x;
    static db[] field_z;
    int field_w;
    byte field_A;
    static String field_y;

    final byte[] d(byte param0) {
        int var2 = 0;
        if (!this.field_v) {
          if (this.field_x.field_h < -this.field_A + this.field_x.field_j.length) {
            throw new RuntimeException();
          } else {
            var2 = 37 % ((2 - param0) / 38);
            return this.field_x.field_j;
          }
        } else {
          throw new RuntimeException();
        }
    }

    final static void c(int param0) {
        if (param0 != 255) {
            return;
        }
        String var2 = (String) null;
        cl.a((byte) 41, (String) null, "");
    }

    final static boolean d(int param0) {
        if (a.field_c == -1) {
            if (!(a.b(1, 10343))) {
                return false;
            }
            a.field_c = ig.field_a.d(true);
            ig.field_a.field_h = 0;
        }
        if (param0 != 2) {
            return false;
        }
        if (1 != (a.field_c ^ -1)) {
            return a.b(a.field_c, 10343);
        }
        if (!(a.b(2, 10343))) {
            return false;
        }
        a.field_c = ig.field_a.b(-1698573656);
        ig.field_a.field_h = 0;
        return a.b(a.field_c, 10343);
    }

    dc() {
    }

    final static String[] a(String param0, char param1, byte param2) {
        int incrementValue$2 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_14_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var9 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var10 = (CharSequence) ((Object) param0);
              var3_int = wd.a((byte) -72, param1, var10);
              var4 = new String[1 + var3_int];
              var5 = 0;
              var6 = 0;
              if (param2 == -125) {
                break L1;
              } else {
                field_y = (String) null;
                break L1;
              }
            }
            var7 = 0;
            L2: while (true) {
              L3: {
                if (var7 >= var3_int) {
                  var4[var3_int] = param0.substring(var6);
                  break L3;
                } else {
                  if (var9 != 0) {
                    break L3;
                  } else {
                    var8 = var6;
                    L4: while (true) {
                      L5: {
                        L6: {
                          if (param1 == param0.charAt(var8)) {
                            break L6;
                          } else {
                            var8++;
                            if (var9 != 0) {
                              break L5;
                            } else {
                              if (var9 == 0) {
                                continue L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        incrementValue$2 = var5;
                        var5++;
                        var4[incrementValue$2] = param0.substring(var6, var8);
                        var6 = var8 - -1;
                        var7++;
                        break L5;
                      }
                      continue L2;
                    }
                  }
                }
              }
              stackOut_14_0 = (String[]) (var4);
              stackIn_15_0 = stackOut_14_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3);
            stackOut_16_1 = new StringBuilder().append("dc.T(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_15_0;
    }

    public static void f(byte param0) {
        field_y = null;
        int var1 = -27 % ((param0 - 19) / 53);
        field_z = null;
    }

    final static String a(int param0, byte[] param1, byte param2, int param3) {
        int incrementValue$2 = 0;
        boolean discarded$3 = false;
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        String stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_19_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var9 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var12 = new char[param0];
            var11 = var12;
            var10 = var11;
            var4 = var10;
            var5 = 0;
            var6 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (var6 >= param0) {
                      break L4;
                    } else {
                      var7 = param1[param3 + var6] & 255;
                      var14 = var7;
                      var13 = 0;
                      if (var9 != 0) {
                        if (var13 == var14) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        L5: {
                          if (var13 == var14) {
                            break L5;
                          } else {
                            L6: {
                              if ((var7 ^ -1) > -129) {
                                break L6;
                              } else {
                                if (160 > var7) {
                                  L7: {
                                    var8 = ne.field_d[var7 - 128];
                                    if (var8 == 0) {
                                      var8 = 63;
                                      break L7;
                                    } else {
                                      break L7;
                                    }
                                  }
                                  var7 = var8;
                                  break L6;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            incrementValue$2 = var5;
                            var5++;
                            var10[incrementValue$2] = (char)var7;
                            break L5;
                          }
                        }
                        var6++;
                        if (var9 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (param2 == 16) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                discarded$3 = dc.d(-88);
                break L2;
              }
              stackOut_19_0 = new String(var12, 0, var5);
              stackIn_20_0 = stackOut_19_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4_ref = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var4_ref);
            stackOut_21_1 = new StringBuilder().append("dc.D(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_20_0;
    }

    final int c(byte param0) {
        if (param0 != 16) {
            return 68;
        }
        if (!(this.field_x != null)) {
            return 0;
        }
        return 100 * this.field_x.field_h / (this.field_x.field_j.length - this.field_A);
    }

    static {
        field_y = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
