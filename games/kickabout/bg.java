/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg extends am {
    static String field_r;
    static String field_o;
    static String field_q;
    private int[] field_p;
    static String field_s;
    private String[] field_u;
    static String field_v;
    private int[][] field_t;
    int[] field_n;

    private final void a(byte param0, int param1, iw param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        ff var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var9 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param1 == 1) {
                ((bg) this).field_u = wr.a(param2.a(param0 ^ 100), 2, '<');
                break L1;
              } else {
                if (2 != param1) {
                  if (param1 != 3) {
                    if (param1 != 4) {
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    var4_int = param2.h((byte) -120);
                    ((bg) this).field_t = new int[var4_int][];
                    ((bg) this).field_p = new int[var4_int];
                    var5 = 0;
                    L2: while (true) {
                      if (var5 >= var4_int) {
                        break L1;
                      } else {
                        L3: {
                          var6 = param2.a((byte) 81);
                          var7 = bb.a((byte) 127, var6);
                          if (var7 == null) {
                            break L3;
                          } else {
                            ((bg) this).field_p[var5] = var6;
                            ((bg) this).field_t[var5] = new int[var7.field_d];
                            var8 = 0;
                            L4: while (true) {
                              if (var8 >= var7.field_d) {
                                break L3;
                              } else {
                                ((bg) this).field_t[var5][var8] = param2.a((byte) 81);
                                var8++;
                                continue L4;
                              }
                            }
                          }
                        }
                        var5++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  var4_int = param2.h((byte) -122);
                  ((bg) this).field_n = new int[var4_int];
                  var5 = 0;
                  L5: while (true) {
                    if (var4_int <= var5) {
                      break L1;
                    } else {
                      ((bg) this).field_n[var5] = param2.a((byte) 81);
                      var5++;
                      continue L5;
                    }
                  }
                }
              }
            }
            L6: {
              if (param0 == 63) {
                break L6;
              } else {
                field_o = null;
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var4;
            stackOut_20_1 = new StringBuilder().append("bg.C(").append(param0).append(44).append(param1).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
    }

    final static String a(byte param0, long param1) {
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = Kickabout.field_G;
        if (param1 <= 0L) {
            return null;
        }
        if (param1 >= 6582952005840035281L) {
            return null;
        }
        if (0L == param1 % 37L) {
            return null;
        }
        int var3 = 0;
        long var4 = param1;
        while (var4 != 0L) {
            var4 = var4 / 37L;
            var3++;
        }
        StringBuilder var6 = new StringBuilder(var3);
        if (param0 < 103) {
            field_o = null;
        }
        while (0L != param1) {
            var7 = param1;
            param1 = param1 / 37L;
            var9 = gu.field_yb[(int)(var7 + -(37L * param1))];
            if (!(95 != var9)) {
                var10 = var6.length() + -1;
                var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                var9 = 160;
            }
            StringBuilder discarded$0 = var6.append(var9);
        }
        StringBuilder discarded$1 = var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    final static ut a(String param0, sj param1, byte param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_2_0 = null;
        ut stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        ut stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (param2 > 35) {
              var4_int = param1.b(param0, -1);
              var5 = param1.a((byte) -126, param3, var4_int);
              stackOut_3_0 = ow.a(param1, var4_int, (byte) 89, var5);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ut) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("bg.D(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44).append(param2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_4_0;
    }

    public static void a(int param0) {
        if (param0 < 41) {
            String discarded$0 = bg.a((byte) 105, -78L);
        }
        field_o = null;
        field_v = null;
        field_r = null;
        field_s = null;
        field_q = null;
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = Kickabout.field_G;
        if (!(((bg) this).field_n == null)) {
            for (var2 = 0; ((bg) this).field_n.length > var2; var2++) {
                ((bg) this).field_n[var2] = hf.a(((bg) this).field_n[var2], 32768);
            }
        }
        if (param0) {
            bg.a(-4);
        }
    }

    bg() {
    }

    final String g(byte param0) {
        int var3 = 0;
        int var4 = Kickabout.field_G;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (null == ((bg) this).field_u) {
            return "";
        }
        StringBuilder discarded$7 = var5.append(((bg) this).field_u[0]);
        if (param0 > -71) {
            ((bg) this).field_n = null;
        }
        for (var3 = 1; var3 < ((bg) this).field_u.length; var3++) {
            StringBuilder discarded$8 = var2.append("...");
            StringBuilder discarded$9 = var5.append(((bg) this).field_u[var3]);
        }
        return var2.toString();
    }

    final void a(byte param0, iw param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            L1: while (true) {
              var3_int = param1.h((byte) -117);
              if (var3_int != 0) {
                this.a((byte) 63, var3_int, param1);
                continue L1;
              } else {
                L2: {
                  if (param0 > 87) {
                    break L2;
                  } else {
                    ((bg) this).field_p = null;
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
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("bg.E(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
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
          throw nb.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Use the mouse to point to a character!";
        field_s = "This game is full.";
        field_o = "Service unavailable";
        field_v = "Auction one of your players online.";
    }
}
