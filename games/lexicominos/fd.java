/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd implements Runnable {
    static tf field_e;
    static int field_g;
    volatile boolean field_d;
    volatile boolean field_c;
    ab field_b;
    static String field_a;
    volatile b[] field_f;

    final static boolean a(String param0, int param1, int param2, String param3, pj param4, String param5, boolean param6) {
        RuntimeException var7 = null;
        u var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (bk.field_c == c.field_m) {
              L1: {
                var8 = new u(ug.field_A, param4);
                if (param1 == 0) {
                  break L1;
                } else {
                  field_a = (String) null;
                  break L1;
                }
              }
              ug.field_A.a(param1 + -14579, var8);
              if (!g.f(256)) {
                L2: {
                  ce.field_d = param0;
                  Lexicominos.field_H = param3;
                  cg.field_l = param2;
                  wa.field_k = param5;
                  bk.field_c = ca.field_i;
                  li.field_T = null;
                  if (!param6) {
                    stackIn_10_0 = 0;
                    break L2;
                  } else {
                    stackIn_10_0 = 1;
                    break L2;
                  }
                }
                we.field_d = stackIn_10_0 != 0;
                return true;
              } else {
                var8.k((byte) -92);
                stackIn_12_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var7);

            stackIn_15_1 = new StringBuilder().append("fd.B(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param4 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param5 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L6;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_16_0), stackIn_25_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    final static long a(byte param0, CharSequence param1) {
        long stackIn_26_0 = 0L;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var2_long = 0L;
            var4 = param1.length();
            var5 = 0;
            L1: while (true) {
              L2: {
                if (var5 >= var4) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      var2_long = var2_long * 37L;
                      var6 = param1.charAt(var5);
                      if ((var6 ^ -1) > -66) {
                        break L4;
                      } else {
                        if (var6 <= 90) {
                          var2_long = var2_long + (long)(-65 + var6 + 1);
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (var6 < 97) {
                        break L5;
                      } else {
                        if (122 >= var6) {
                          var2_long = var2_long + (long)(-97 + (1 - -var6));
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (var6 < 48) {
                      break L3;
                    } else {
                      if (57 < var6) {
                        break L3;
                      } else {
                        var2_long = var2_long + (long)(var6 + 27 - 48);
                        break L3;
                      }
                    }
                  }
                  if ((var2_long ^ -1L) > -177917621779460414L) {
                    var5++;
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              L6: {
                if (param0 == -58) {
                  break L6;
                } else {
                  fd.a((byte) -11);
                  break L6;
                }
              }
              L7: while (true) {
                L8: {
                  if (-1L != (var2_long % 37L ^ -1L)) {
                    break L8;
                  } else {
                    if (-1L == (var2_long ^ -1L)) {
                      break L8;
                    } else {
                      var2_long = var2_long / 37L;
                      continue L7;
                    }
                  }
                }
                stackIn_26_0 = var2_long;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var2);

            stackIn_29_1 = new StringBuilder().append("fd.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L9;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L9;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
        }
        return stackIn_26_0;
    }

    public final void run() {
        int var1_int = 0;
        b var2 = null;
        int var4 = Lexicominos.field_L ? 1 : 0;
        this.field_c = true;
        try {
            while (!this.field_d) {
                for (var1_int = 0; 2 > var1_int; var1_int++) {
                    var2 = this.field_f[var1_int];
                    if (var2 == null) {
                    } else {
                        var2.e();
                    }
                }
                ge.a(0, 10L);
                ki.a((Object) null, this.field_b, 50);
            }
        } catch (Exception exception) {
            String var5 = (String) null;
            uj.a((String) null, (Throwable) ((Object) exception), 1);
        } finally {
            this.field_c = false;
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_a = null;
        if (param0 != -61) {
            field_g = -15;
        }
    }

    fd() {
        this.field_f = new b[2];
        this.field_d = false;
        this.field_c = false;
    }

    static {
        field_a = "No highscores";
        field_e = new tf();
    }
}
