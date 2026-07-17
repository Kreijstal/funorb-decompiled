/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.net.URL;
import java.lang.String;

final class gi implements Iterable {
    hf[] field_a;
    static int field_e;
    static gk field_d;
    private hf field_f;
    int field_c;
    static int[] field_b;

    public final Iterator iterator() {
        return (Iterator) (Object) new k((gi) this);
    }

    final static void b(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = Geoblox.field_C;
        va.field_d = false;
        if (param0 == -12618) {
          ff.field_d = null;
          if (!cf.field_i) {
            var1 = ik.field_a;
            if (var1 > 0) {
              if (1 == var1) {
                ff.field_d = ih.field_b;
                ff.field_d = gg.a(-11455, new CharSequence[3]);
                Geoblox.field_y.h((byte) -104);
                rd.c(520);
                return;
              } else {
                ff.field_d = wj.a(ra.field_b, new String[1], (byte) -124);
                ff.field_d = gg.a(-11455, new CharSequence[3]);
                Geoblox.field_y.h((byte) -104);
                rd.c(520);
                return;
              }
            } else {
              Geoblox.field_y.h((byte) -104);
              rd.c(520);
              return;
            }
          } else {
            Geoblox.field_y.c(false);
            return;
          }
        } else {
          return;
        }
    }

    final void a(long param0, int param1, hf param2) {
        hf var5 = null;
        try {
            if (!(param2.field_c == null)) {
                param2.a(false);
            }
            var5 = ((gi) this).field_a[(int)((long)(-1 + ((gi) this).field_c) & param0)];
            param2.field_c = var5.field_c;
            if (param1 > -48) {
                field_b = null;
            }
            param2.field_b = var5;
            param2.field_c.field_b = param2;
            param2.field_a = param0;
            param2.field_b.field_c = param2;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "gi.H(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static bg a(rh param0, int param1, rh param2, String param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        bg stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        bg stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              var5_int = param2.a((byte) 126, param4);
              if (param1 == 1) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            var6 = param2.a(param3, param1 ^ -82, var5_int);
            stackOut_2_0 = rb.a(var6, 0, param2, var5_int, param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("gi.E(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw t.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_3_0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        var9 = Geoblox.field_C;
        if (param6 >= param3) {
          if (param2 > param6) {
            sd.a(param5, param4, param7, 110, vb.field_c, param2, param0, param6, param3);
            if (param1 >= -102) {
              gi.a(-38);
              return;
            } else {
              return;
            }
          } else {
            if (param3 < param2) {
              sd.a(param0, param4, param7, 127, vb.field_c, param6, param5, param2, param3);
              if (param1 >= -102) {
                gi.a(-38);
                return;
              } else {
                return;
              }
            } else {
              sd.a(param4, param0, param7, 120, vb.field_c, param6, param5, param3, param2);
              if (param1 >= -102) {
                gi.a(-38);
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if (param3 >= param2) {
            if (param2 > param6) {
              sd.a(param0, param5, param7, -110, vb.field_c, param3, param4, param2, param6);
              if (param1 < -102) {
                return;
              } else {
                gi.a(-38);
                return;
              }
            } else {
              sd.a(param5, param0, param7, -102, vb.field_c, param3, param4, param6, param2);
              if (param1 < -102) {
                return;
              } else {
                gi.a(-38);
                return;
              }
            }
          } else {
            sd.a(param4, param5, param7, 116, vb.field_c, param2, param0, param3, param6);
            if (param1 >= -102) {
              gi.a(-38);
              return;
            } else {
              return;
            }
          }
        }
    }

    final static void a(Throwable param0, String param1, byte param2) {
        try {
            String var3 = null;
            Exception var3_ref = null;
            cb var4 = null;
            DataInputStream var5 = null;
            String var6 = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            d stackIn_12_0 = null;
            int stackIn_12_1 = 0;
            java.net.URL stackIn_12_2 = null;
            java.net.URL stackIn_12_3 = null;
            java.net.URL stackIn_12_4 = null;
            StringBuilder stackIn_12_5 = null;
            d stackIn_13_0 = null;
            int stackIn_13_1 = 0;
            java.net.URL stackIn_13_2 = null;
            java.net.URL stackIn_13_3 = null;
            java.net.URL stackIn_13_4 = null;
            StringBuilder stackIn_13_5 = null;
            d stackIn_14_0 = null;
            int stackIn_14_1 = 0;
            java.net.URL stackIn_14_2 = null;
            java.net.URL stackIn_14_3 = null;
            java.net.URL stackIn_14_4 = null;
            StringBuilder stackIn_14_5 = null;
            String stackIn_14_6 = null;
            Throwable decompiledCaughtException = null;
            d stackOut_11_0 = null;
            int stackOut_11_1 = 0;
            java.net.URL stackOut_11_2 = null;
            java.net.URL stackOut_11_3 = null;
            java.net.URL stackOut_11_4 = null;
            StringBuilder stackOut_11_5 = null;
            d stackOut_13_0 = null;
            int stackOut_13_1 = 0;
            java.net.URL stackOut_13_2 = null;
            java.net.URL stackOut_13_3 = null;
            java.net.URL stackOut_13_4 = null;
            StringBuilder stackOut_13_5 = null;
            String stackOut_13_6 = null;
            d stackOut_12_0 = null;
            int stackOut_12_1 = 0;
            java.net.URL stackOut_12_2 = null;
            java.net.URL stackOut_12_3 = null;
            java.net.URL stackOut_12_4 = null;
            StringBuilder stackOut_12_5 = null;
            String stackOut_12_6 = null;
            try {
              L0: {
                L1: {
                  var3 = "";
                  if (param0 != null) {
                    var3 = ch.a(param0, 1);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param1 == null) {
                    break L2;
                  } else {
                    L3: {
                      if (param0 != null) {
                        var3 = var3 + " | ";
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var3 = var3 + param1;
                    break L2;
                  }
                }
                gb.a(var3, (byte) -75);
                var6 = og.a(var3, "%3a", true, ":");
                var7 = og.a(var6, "%40", true, "@");
                var8 = og.a(var7, "%26", true, "&");
                var9 = og.a(var8, "%23", true, "#");
                if (null == c.field_x) {
                  return;
                } else {
                  L4: {
                    stackOut_11_0 = ml.field_s;
                    stackOut_11_1 = -14;
                    stackOut_11_2 = null;
                    stackOut_11_3 = null;
                    stackOut_11_4 = c.field_x.getCodeBase();
                    stackOut_11_5 = new StringBuilder().append("clienterror.ws?c=").append(kk.field_t).append("&u=");
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    stackIn_13_2 = stackOut_11_2;
                    stackIn_13_3 = stackOut_11_3;
                    stackIn_13_4 = stackOut_11_4;
                    stackIn_13_5 = stackOut_11_5;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    stackIn_12_3 = stackOut_11_3;
                    stackIn_12_4 = stackOut_11_4;
                    stackIn_12_5 = stackOut_11_5;
                    if (null == uk.field_p) {
                      stackOut_13_0 = (d) (Object) stackIn_13_0;
                      stackOut_13_1 = stackIn_13_1;
                      stackOut_13_2 = null;
                      stackOut_13_3 = null;
                      stackOut_13_4 = (java.net.URL) (Object) stackIn_13_4;
                      stackOut_13_5 = (StringBuilder) (Object) stackIn_13_5;
                      stackOut_13_6 = "" + vi.field_H;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      stackIn_14_2 = stackOut_13_2;
                      stackIn_14_3 = stackOut_13_3;
                      stackIn_14_4 = stackOut_13_4;
                      stackIn_14_5 = stackOut_13_5;
                      stackIn_14_6 = stackOut_13_6;
                      break L4;
                    } else {
                      stackOut_12_0 = (d) (Object) stackIn_12_0;
                      stackOut_12_1 = stackIn_12_1;
                      stackOut_12_2 = null;
                      stackOut_12_3 = null;
                      stackOut_12_4 = (java.net.URL) (Object) stackIn_12_4;
                      stackOut_12_5 = (StringBuilder) (Object) stackIn_12_5;
                      stackOut_12_6 = uk.field_p;
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_14_1 = stackOut_12_1;
                      stackIn_14_2 = stackOut_12_2;
                      stackIn_14_3 = stackOut_12_3;
                      stackIn_14_4 = stackOut_12_4;
                      stackIn_14_5 = stackOut_12_5;
                      stackIn_14_6 = stackOut_12_6;
                      break L4;
                    }
                  }
                  var4 = ((d) (Object) stackIn_14_0).a(stackIn_14_1, new java.net.URL(stackIn_14_4, stackIn_14_6 + "&v1=" + d.field_o + "&v2=" + d.field_t + "&e=" + var9));
                  L5: while (true) {
                    if (var4.field_a != 0) {
                      L6: {
                        if (var4.field_a != 1) {
                          break L6;
                        } else {
                          var5 = (DataInputStream) var4.field_b;
                          int discarded$1 = var5.read();
                          var5.close();
                          break L6;
                        }
                      }
                      break L0;
                    } else {
                      bc.a(0, 1L);
                      continue L5;
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L7: {
                var3_ref = (Exception) (Object) decompiledCaughtException;
                break L7;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        try {
          L0: {
            var3_int = 1;
            L1: while (true) {
              if (param0 <= 1) {
                var4 = 28 % ((-75 - param1) / 49);
                if (param0 != 1) {
                  stackOut_9_0 = var3_int;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_7_0 = param2 * var3_int;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                L2: {
                  if (0 != (param0 & 1)) {
                    var3_int = var3_int * param2;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                param0 = param0 >> 1;
                param2 = param2 * param2;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var3, "gi.A(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_10_0;
    }

    public static void a(int param0) {
        if (param0 != -1) {
            return;
        }
        field_d = null;
        field_b = null;
    }

    private gi() throws Throwable {
        throw new Error();
    }

    final hf a(long param0, byte param1) {
        int var4 = 0;
        hf var5 = null;
        hf var6 = null;
        int var7 = 0;
        var7 = Geoblox.field_C;
        var4 = -95 / ((param1 - -9) / 43);
        var5 = ((gi) this).field_a[(int)((long)(-1 + ((gi) this).field_c) & param0)];
        ((gi) this).field_f = var5.field_b;
        L0: while (true) {
          if (((gi) this).field_f != var5) {
            if (~((gi) this).field_f.field_a != ~param0) {
              ((gi) this).field_f = ((gi) this).field_f.field_b;
              continue L0;
            } else {
              var6 = ((gi) this).field_f;
              ((gi) this).field_f = ((gi) this).field_f.field_b;
              return var6;
            }
          } else {
            ((gi) this).field_f = null;
            return null;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
        field_d = new gk();
        field_b = new int[8192];
    }
}
