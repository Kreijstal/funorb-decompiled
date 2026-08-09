/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class oe {
    static int[] field_b;
    static int field_a;
    int field_d;
    String field_c;

    abstract java.net.Socket a(byte param0) throws IOException;

    final static void a(int param0, int param1, rb param2, int param3, int param4) {
        rb var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              param2.a(12, param1 ^ -79);
              param2.c(17, -306);
              param2.c(param3, -306);
              param2.c(param0, -306);
              if (param1 != 32) {
                var6 = (rb) null;
                oe.a(-101, 110, (rb) null, -119, 60);
                param2.a(param4, -61);
                break L1;
              } else {
                param2.a(param4, -61);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("oe.K(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static String a(int param0) {
        String var1;
        int var2;
        int var3;
        int var4;
        int var5;
        String var6;
        String var7;
        String var8;
        var5 = StarCannon.field_A;
        var6 = "(" + wc.field_i + " " + hh.field_a + " " + bh.field_d + ") " + vh.field_t;
        var1 = var6;
        if ((il.field_g ^ -1) < -1) {
          var1 = var6 + ":";
          var2 = 0;
          L0: while (true) {
            if (il.field_g > var2) {
              L1: {
                var7 = var1 + ' ';
                var1 = var7;
                var3 = 255 & se.field_p.field_f[var2];
                var4 = var3 >> 890069092;
                var3 = var3 & 15;
                if ((var4 ^ -1) <= -11) {
                  var4 += 55;
                  break L1;
                } else {
                  var4 += 48;
                  break L1;
                }
              }
              L2: {
                var8 = var7 + (char)var4;
                if ((var3 ^ -1) > -11) {
                  var3 += 48;
                  break L2;
                } else {
                  var3 += 55;
                  break L2;
                }
              }
              var1 = var8 + (char)var3;
              var2++;
              continue L0;
            } else {
              var2 = 37 % ((param0 - 3) / 43);
              return var1;
            }
          }
        } else {
          var2 = 37 % ((param0 - 3) / 43);
          return var1;
        }
    }

    final static Class a(String param0, boolean param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_5_0 = null;
        Class stackIn_8_0 = null;
        Class stackIn_11_0 = null;
        Class stackIn_14_0 = null;
        Class stackIn_18_0 = null;
        Class stackIn_21_0 = null;
        Class stackIn_25_0 = null;
        Class stackIn_28_0 = null;
        Class stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                oe.b(71);
                break L1;
              }
            }
            if (param0.equals("B")) {
              stackIn_5_0 = Byte.TYPE;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!param0.equals("I")) {
                if (!param0.equals("S")) {
                  if (!param0.equals("J")) {
                    if (param0.equals("Z")) {
                      stackIn_18_0 = Boolean.TYPE;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (!param0.equals("F")) {
                        if (param0.equals("D")) {
                          stackIn_25_0 = Double.TYPE;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if (!param0.equals("C")) {
                            stackIn_30_0 = Class.forName(param0);
                            decompiledRegionSelector0 = 8;
                            break L0;
                          } else {
                            stackIn_28_0 = Character.TYPE;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          }
                        }
                      } else {
                        stackIn_21_0 = Float.TYPE;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  } else {
                    stackIn_14_0 = Long.TYPE;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_11_0 = Short.TYPE;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_8_0 = Integer.TYPE;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var2);

            stackIn_33_1 = new StringBuilder().append("oe.L(");

            if (param0 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L2;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_18_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_21_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_25_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_28_0;
                      } else {
                        return stackIn_30_0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final java.net.Socket b(byte param0) throws IOException {
        if (param0 > -56) {
            return (java.net.Socket) null;
        }
        return new java.net.Socket(this.field_c, this.field_d);
    }

    final static i a(int param0, byte[] param1) {
        i var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        i stackIn_5_0 = null;
        i stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 != null) {
              var2 = new i(param1, fc.field_d, qd.field_H, gg.field_d, gh.field_C, of.field_g, og.field_c);
              if (param0 == 5) {
                rc.b((byte) 105);
                stackIn_7_0 = (i) (var2);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = (i) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2_ref);

            stackIn_10_1 = new StringBuilder().append("oe.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (i) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final static sg c(int param0) {
        if (s.field_i != null) {
          if (param0 != -5671) {
            return (sg) null;
          } else {
            return s.field_i;
          }
        } else {
          s.field_i = new sg();
          s.field_i.a((byte) 123, nb.field_c);
          s.field_i.field_u = 0;
          s.field_i.field_m = 4;
          s.field_i.field_h = 7697781;
          s.field_i.field_l = nb.field_b;
          s.field_i.field_g = 5;
          s.field_i.field_s = 2763306;
          s.field_i.field_r = 6;
          s.field_i.field_b = 14;
          if (param0 != -5671) {
            return (sg) null;
          } else {
            return s.field_i;
          }
        }
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 != 12) {
            oe.a(75);
        }
    }

    static {
    }
}
