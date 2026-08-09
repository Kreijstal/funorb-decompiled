/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class gi implements Iterable {
    hf[] field_a;
    static int field_e;
    static gk field_d;
    private hf field_f;
    int field_c;
    static int[] field_b;

    public final Iterator iterator() {
        return (Iterator) ((Object) new k((gi) (this)));
    }

    final static void b(int param0) {
        int var1;
        int var2;
        var2 = Geoblox.field_C;
        va.field_d = false;
        if (param0 == -12618) {
          ff.field_d = null;
          if (!cf.field_i) {
            var1 = ik.field_a;
            if ((var1 ^ -1) < -1) {
              if (1 == var1) {
                ff.field_d = ih.field_b;
                ff.field_d = gg.a(-11455, new CharSequence[]{(CharSequence) ((Object) ff.field_d), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) ne.field_d)});
                Geoblox.field_y.h((byte) -104);
                rd.c(520);
                return;
              } else {
                ff.field_d = wj.a(ra.field_b, new String[]{Integer.toString(var1)}, (byte) -124);
                ff.field_d = gg.a(-11455, new CharSequence[]{(CharSequence) ((Object) ff.field_d), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) ne.field_d)});
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
            var5 = this.field_a[(int)((long)(-1 + this.field_c) & param0)];
            param2.field_c = var5.field_c;
            if (param1 > -48) {
                field_b = (int[]) null;
            }
            param2.field_b = var5;
            param2.field_c.field_b = param2;
            param2.field_a = param0;
            param2.field_b.field_c = param2;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "gi.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static bg a(rh param0, int param1, rh param2, String param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        bg stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5_int = param2.a((byte) 126, param4);
              if (param1 == 1) {
                break L1;
              } else {
                field_b = (int[]) null;
                break L1;
              }
            }
            var6 = param2.a(param3, param1 ^ -82, var5_int);
            stackIn_3_0 = rb.a(var6, 0, param2, var5_int, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("gi.E(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9;
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
            d stackIn_13_0;
            int stackIn_13_1;
            java.net.URL stackIn_13_2;
            java.net.URL stackIn_13_3;
            java.net.URL stackIn_13_4;
            StringBuilder stackIn_13_5;
            d stackIn_14_0;
            int stackIn_14_1;
            java.net.URL stackIn_14_2;
            java.net.URL stackIn_14_3;
            java.net.URL stackIn_14_4;
            StringBuilder stackIn_14_5;
            String stackIn_14_6;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var3 = null;
            Exception var3_ref = null;
            cb var4 = null;
            DataInputStream var5 = null;
            String var6 = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            try {
              L0: {
                L1: {
                  var3 = "";
                  if (param0 != null) {
                    var3 = ch.a(param0, param2 + -124);
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
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  L4: {
                    stackIn_13_0 = ml.field_s;

                    stackIn_13_1 = -14;

                    stackIn_13_2 = null;

                    stackIn_13_3 = null;

                    stackIn_13_4 = c.field_x.getCodeBase();

                    stackIn_13_5 = new StringBuilder().append("clienterror.ws?c=").append(kk.field_t).append("&u=");

                    if (null == uk.field_p) {
                      stackIn_14_0 = (d) ((Object) stackIn_13_0);
                      stackIn_14_1 = stackIn_13_1;
                      stackIn_14_2 = null;
                      stackIn_14_3 = null;
                      stackIn_14_4 = (java.net.URL) ((Object) stackIn_13_4);
                      stackIn_14_5 = (StringBuilder) ((Object) stackIn_13_5);
                      stackIn_14_6 = "" + vi.field_H;
                      break L4;
                    } else {
                      stackIn_14_0 = (d) ((Object) stackIn_13_0);
                      stackIn_14_1 = stackIn_13_1;
                      stackIn_14_2 = null;
                      stackIn_14_3 = null;
                      stackIn_14_4 = (java.net.URL) ((Object) stackIn_13_4);
                      stackIn_14_5 = (StringBuilder) ((Object) stackIn_13_5);
                      stackIn_14_6 = uk.field_p;
                      break L4;
                    }
                  }
                  var4 = ((d) (Object) stackIn_14_0).a(stackIn_14_1, new java.net.URL(stackIn_14_4, stackIn_14_6 + "&v1=" + d.field_o + "&v2=" + d.field_t + "&e=" + var9));
                  L5: while (true) {
                    if (var4.field_a != 0) {
                      L6: {
                        if (-2 != (var4.field_a ^ -1)) {
                          break L6;
                        } else {
                          var5 = (DataInputStream) (var4.field_b);
                          var5.read();
                          var5.close();
                          break L6;
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      bc.a(param2 + -125, 1L);
                      continue L5;
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L7: {
                var3_ref = (Exception) (Object) decompiledCaughtException;
                decompiledRegionSelector0 = 1;
                break L7;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              if (param2 != 125) {
                gi.a(-109);
                return;
              } else {
                return;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 1;
            L1: while (true) {
              if (-2 <= (param0 ^ -1)) {
                var4 = 28 % ((-75 - param1) / 49);
                if ((param0 ^ -1) != -2) {
                  stackIn_10_0 = var3_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_8_0 = param2 * var3_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
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
          throw t.a((Throwable) ((Object) var3), "gi.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          return stackIn_10_0;
        }
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
        int var4;
        hf var5;
        hf var6;
        int var7;
        var7 = Geoblox.field_C;
        var4 = -95 / ((param1 - -9) / 43);
        var5 = this.field_a[(int)((long)(-1 + this.field_c) & param0)];
        this.field_f = var5.field_b;
        L0: while (true) {
          if (this.field_f != var5) {
            if ((this.field_f.field_a ^ -1L) != (param0 ^ -1L)) {
              this.field_f = this.field_f.field_b;
              continue L0;
            } else {
              var6 = this.field_f;
              this.field_f = this.field_f.field_b;
              return var6;
            }
          } else {
            this.field_f = null;
            return null;
          }
        }
    }

    static {
        field_e = 0;
        field_d = new gk();
        field_b = new int[8192];
    }
}
