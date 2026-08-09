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
        int[] array$0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        ff var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (-2 == (param1 ^ -1)) {
                this.field_u = wr.a(param2.a(param0 ^ 100), 2, '<');
                break L1;
              } else {
                if (2 != param1) {
                  if (param1 != 3) {
                    if ((param1 ^ -1) != -5) {
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    var4_int = param2.h((byte) -120);
                    this.field_t = new int[var4_int][];
                    this.field_p = new int[var4_int];
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
                            this.field_p[var5] = var6;
                            array$0 = new int[var7.field_d];
                            this.field_t[var5] = array$0;
                            var8 = 0;
                            L4: while (true) {
                              if (var8 >= var7.field_d) {
                                break L3;
                              } else {
                                this.field_t[var5][var8] = param2.a((byte) 81);
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
                  this.field_n = new int[var4_int];
                  var5 = 0;
                  L5: while (true) {
                    if (var4_int <= var5) {
                      break L1;
                    } else {
                      this.field_n[var5] = param2.a((byte) 81);
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
                field_o = (String) null;
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4);

            stackIn_22_1 = new StringBuilder().append("bg.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
    }

    final static String a(byte param0, long param1) {
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        StringBuilder discarded$0 = null;
        int var11 = Kickabout.field_G;
        if (-1L <= (param1 ^ -1L)) {
            return null;
        }
        if (-6582952005840035282L >= (param1 ^ -1L)) {
            return null;
        }
        if (0L == param1 % 37L) {
            return null;
        }
        int var3 = 0;
        long var4 = param1;
        while ((var4 ^ -1L) != -1L) {
            var4 = var4 / 37L;
            var3++;
        }
        StringBuilder var6 = new StringBuilder(var3);
        if (param0 < 103) {
            field_o = (String) null;
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
            discarded$0 = var6.append((char) var9);
        }
        var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    final static ut a(String param0, sj param1, byte param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ut stackIn_2_0 = null;
        ut stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 > 35) {
              var4_int = param1.b(param0, -1);
              var5 = param1.a((byte) -126, param3, var4_int);
              stackIn_4_0 = ow.a(param1, var4_int, (byte) 89, var5);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (ut) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("bg.D(");

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
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void a(int param0) {
        if (param0 < 41) {
            bg.a((byte) 105, -78L);
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
        if (!(this.field_n == null)) {
            for (var2 = 0; this.field_n.length > var2; var2++) {
                this.field_n[var2] = hf.a(this.field_n[var2], 32768);
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
        StringBuilder discarded$15 = null;
        StringBuilder discarded$16 = null;
        int var4 = Kickabout.field_G;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (null == this.field_u) {
            return "";
        }
        StringBuilder discarded$14 = var5.append(this.field_u[0]);
        if (param0 > -71) {
            this.field_n = (int[]) null;
        }
        for (var3 = 1; var3 < this.field_u.length; var3++) {
            discarded$15 = var2.append("...");
            discarded$16 = var5.append(this.field_u[var3]);
        }
        return var2.toString();
    }

    final void a(byte param0, iw param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
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
                    this.field_p = (int[]) null;
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

            stackIn_9_1 = new StringBuilder().append("bg.E(").append(param0).append(',');

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
          throw nb.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    static {
        field_q = "Use the mouse to point to a character!";
        field_s = "This game is full.";
        field_o = "Service unavailable";
        field_v = "Auction one of your players online.";
    }
}
