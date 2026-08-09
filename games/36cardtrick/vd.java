/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vd extends he {
    static cc field_q;
    static volatile int field_s;
    private int[][] field_v;
    private int[] field_t;
    private String[] field_o;
    int[] field_m;
    static ee field_p;
    static byte[][] field_r;
    static volatile boolean field_w;
    static String field_l;
    static String field_k;
    static int field_u;
    static String field_n;

    private final void a(int param0, pb param1, byte param2) {
        int[] array$0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        de var8 = null;
        int var9 = 0;
        int var10 = 0;
        var10 = Main.field_T;
        try {
          L0: {
            L1: {
              var4_int = -30 % ((param2 - 34) / 63);
              if (1 != param0) {
                if (-3 == (param0 ^ -1)) {
                  var5 = param1.f(29);
                  this.field_m = new int[var5];
                  var6 = 0;
                  L2: while (true) {
                    if (var6 >= var5) {
                      break L1;
                    } else {
                      this.field_m[var6] = param1.d((byte) 72);
                      var6++;
                      continue L2;
                    }
                  }
                } else {
                  if (-4 != (param0 ^ -1)) {
                    if ((param0 ^ -1) == -5) {
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    var5 = param1.f(-96);
                    this.field_v = new int[var5][];
                    this.field_t = new int[var5];
                    var6 = 0;
                    L3: while (true) {
                      if (var5 <= var6) {
                        break L1;
                      } else {
                        L4: {
                          var7 = param1.d((byte) 72);
                          var8 = p.a(-1, var7);
                          if (var8 != null) {
                            this.field_t[var6] = var7;
                            array$0 = new int[var8.field_d];
                            this.field_v[var6] = array$0;
                            var9 = 0;
                            L5: while (true) {
                              if (var8.field_d <= var9) {
                                break L4;
                              } else {
                                this.field_v[var6][var9] = param1.d((byte) 72);
                                var9++;
                                continue L5;
                              }
                            }
                          } else {
                            break L4;
                          }
                        }
                        var6++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                this.field_o = rh.a('<', param1.c(false), -124);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("vd.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1) {
        try {
            try {
                vh.a(new Object[]{new Integer(param0)}, "resizing", (byte) 115, mk.g(-123));
            } catch (Throwable throwable) {
            }
            if (param1 != -1) {
                field_w = true;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, boolean param2, long param3, int param4, int param5, String param6, int param7, int param8, int param9, int param10, int param11, le param12, boolean param13) {
        try {
            int stackIn_3_0 = 0;
            int stackIn_6_0 = 0;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            StringBuilder stackIn_19_1 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            Throwable decompiledCaughtException = null;
            IOException var15 = null;
            RuntimeException var15_ref = null;
            try {
              L0: {
                L1: {
                  rd.field_j = new w(param11);
                  na.field_r = new w(param7);
                  hj.field_l = param8;
                  ag.field_e = param10;
                  ag.field_d = param4;
                  nf.field_c = param0;
                  td.field_b = param12;
                  mk.field_k = param6;
                  wk.field_d = param3;
                  kh.field_g = param9;
                  if (!param2) {
                    stackIn_3_0 = 0;
                    break L1;
                  } else {
                    stackIn_3_0 = 1;
                    break L1;
                  }
                }
                L2: {
                  bj.field_m = stackIn_3_0 != 0;
                  if (!param13) {
                    stackIn_6_0 = 0;
                    break L2;
                  } else {
                    stackIn_6_0 = 1;
                    break L2;
                  }
                }
                L3: {
                  dg.field_F = stackIn_6_0 != 0;
                  kj.field_t = param1;
                  if (param5 >= 44) {
                    break L3;
                  } else {
                    vd.e(65);
                    break L3;
                  }
                }
                L4: {
                  if (null != td.field_b.field_x) {
                    try {
                      L5: {
                        e.field_e = new tk(td.field_b.field_x, 64, 0);
                        break L5;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var15 = (IOException) (Object) decompiledCaughtException;
                      throw new RuntimeException(var15.toString());
                    }
                    break L4;
                  } else {
                    break L4;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_16_0 = (RuntimeException) (var15_ref);

                stackIn_16_1 = new StringBuilder().append("vd.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

                if (param6 == null) {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "null";
                  break L6;
                } else {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "{...}";
                  break L6;
                }
              }
              L7: {


                stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');

                if (param12 == null) {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "null";
                  break L7;
                } else {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "{...}";
                  break L7;
                }
              }
              throw ma.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param13 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte param0, pb param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        le var5 = null;
        var4 = Main.field_T;
        try {
          L0: {
            L1: while (true) {
              var3_int = param1.f(91);
              if (0 != var3_int) {
                this.a(var3_int, param1, (byte) 117);
                continue L1;
              } else {
                L2: {
                  if (param0 >= 29) {
                    break L2;
                  } else {
                    var5 = (le) null;
                    vd.a(73, -78, true, -52L, -55, -9, (String) null, -34, -78, -25, -16, 3, (le) null, false);
                    break L2;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("vd.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final String b(byte param0) {
        int var3 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = Main.field_T;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (param0 != 28) {
            return (String) null;
        }
        if (!(this.field_o != null)) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(this.field_o[0]);
        for (var3 = 1; var3 < this.field_o.length; var3++) {
            discarded$1 = var2.append("...");
            discarded$2 = var5.append(this.field_o[var3]);
        }
        return var2.toString();
    }

    public static void e(int param0) {
        field_k = null;
        if (param0 <= 45) {
            return;
        }
        field_r = (byte[][]) null;
        field_p = null;
        field_n = null;
        field_q = null;
        field_l = null;
    }

    final void c(byte param0) {
        int var2 = 0;
        int var3 = Main.field_T;
        if (!(this.field_m == null)) {
            for (var2 = 0; var2 < this.field_m.length; var2++) {
                this.field_m[var2] = fj.a(this.field_m[var2], 32768);
            }
        }
        var2 = -85 % ((param0 - 62) / 63);
    }

    vd() {
    }

    static {
        field_s = -1;
        field_q = new cc();
        field_l = "Player";
        field_w = false;
        field_n = "Not yet achieved";
        field_u = -1;
        field_k = "Name is available";
    }
}
