/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vu {
    ha field_c;
    static int field_f;
    sn field_d;
    private mj field_e;
    long field_a;
    java.awt.Canvas field_b;
    static of field_g;

    final static String a(int param0, CharSequence param1) {
        StringBuilder discarded$0 = null;
        Object stackIn_2_0 = null;
        String stackIn_18_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          L0: {
            if (param1 != null) {
              var2_int = 0;
              var3 = param1.length();
              L1: while (true) {
                L2: {
                  if (var3 <= var2_int) {
                    break L2;
                  } else {
                    if (!za.a((byte) 117, param1.charAt(var2_int))) {
                      break L2;
                    } else {
                      var2_int++;
                      continue L1;
                    }
                  }
                }
                L3: while (true) {
                  L4: {
                    if (var2_int >= var3) {
                      break L4;
                    } else {
                      if (!za.a((byte) 117, param1.charAt(var3 + -1))) {
                        break L4;
                      } else {
                        var3--;
                        continue L3;
                      }
                    }
                  }
                  var4 = -var2_int + var3;
                  if ((var4 ^ -1) <= -2) {
                    if ((var4 ^ -1) >= -13) {
                      if (param0 >= 122) {
                        var5 = new StringBuilder(var4);
                        var6 = var2_int;
                        L5: while (true) {
                          if (var3 <= var6) {
                            if (var5.length() != 0) {
                              return var5.toString();
                            } else {
                              return null;
                            }
                          } else {
                            L6: {
                              var7 = param1.charAt(var6);
                              if (!jk.a((char) var7, -26024)) {
                                break L6;
                              } else {
                                var8 = rr.a((char) var7, (byte) -70);
                                if (var8 == 0) {
                                  break L6;
                                } else {
                                  discarded$0 = var5.append((char) var8);
                                  break L6;
                                }
                              }
                            }
                            var6++;
                            continue L5;
                          }
                        }
                      } else {
                        stackIn_18_0 = (String) null;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var2);

            stackIn_32_1 = new StringBuilder().append("vu.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L7;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L7;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_2_0);
        } else {
          return stackIn_18_0;
        }
    }

    final mj a(byte param0) {
        if (param0 != 38) {
          return (mj) null;
        } else {
          L0: {
            if (this.field_e == null) {
              this.field_e = new mj();
              break L0;
            } else {
              break L0;
            }
          }
          this.field_e.a((vu) (this), false);
          return this.field_e;
        }
    }

    final static int a(CharSequence param0, byte param1, char param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var7 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var4 = -83 / ((-59 - param1) / 54);
            var3_int = 0;
            var5 = param0.length();
            var6 = 0;
            L1: while (true) {
              if (var5 <= var6) {
                stackIn_8_0 = var3_int;
                break L0;
              } else {
                L2: {
                  if (param0.charAt(var6) != param2) {
                    break L2;
                  } else {
                    var3_int++;
                    break L2;
                  }
                }
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("vu.C(");

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
          throw pn.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_8_0;
    }

    public static void a(boolean param0) {
        field_g = null;
        if (param0) {
            return;
        }
        field_g = (of) null;
    }

    vu(ha param0, sn param1, java.awt.Canvas param2) {
        try {
            this.field_b = param2;
            this.field_d = param1;
            this.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "vu.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = 0;
        field_g = new of();
    }
}
