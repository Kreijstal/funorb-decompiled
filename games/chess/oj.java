/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj {
    int field_d;
    static ci field_c;
    static String field_g;
    int field_e;
    static String field_b;
    int field_f;
    static String field_a;

    final static void a(int param0, byte param1, int param2, int param3) {
        L0: {
          if (0 != param0) {
            break L0;
          } else {
            if (sg.field_d != param2) {
              sg.field_d = param2;
              tj.field_l = true;
              pj.b(-6446, param3);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (1 != param0) {
            if (2 != param0) {
              break L1;
            } else {
              if (param2 == v.field_d) {
                break L1;
              } else {
                v.field_d = param2;
                tj.field_l = true;
                pj.b(param1 + -6347, param3);
                break L1;
              }
            }
          } else {
            if (2 != param0) {
              break L1;
            } else {
              if (param2 == v.field_d) {
                break L1;
              } else {
                v.field_d = param2;
                tj.field_l = true;
                pj.b(param1 + -6347, param3);
                break L1;
              }
            }
          }
        }
        L2: {
          if (param1 == -99) {
            break L2;
          } else {
            oj.a((byte) 15);
            break L2;
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        int var1 = -5 / ((-50 - param0) / 60);
        field_c = null;
        field_b = null;
        field_g = null;
    }

    final static sa a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        sa var7 = null;
        int var8 = 0;
        sa stackIn_6_0 = null;
        sa stackIn_10_0 = null;
        sa stackIn_13_0 = null;
        sa stackIn_18_0 = null;
        sa stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        sa stackOut_5_0 = null;
        sa stackOut_9_0 = null;
        sa stackOut_20_0 = null;
        sa stackOut_17_0 = null;
        sa stackOut_12_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var8 = Chess.field_G;
        try {
          L0: {
            L1: {
              var2_int = param0.length();
              if (param1 >= 75) {
                break L1;
              } else {
                field_c = (ci) null;
                break L1;
              }
            }
            if (var2_int == 0) {
              stackOut_5_0 = ef.field_j;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (255 < var2_int) {
                stackOut_9_0 = ok.field_Ob;
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3 = gl.a((byte) -118, '.', param0);
                if ((var3.length ^ -1) <= -3) {
                  var4 = var3;
                  var5 = 0;
                  L2: while (true) {
                    if (var5 >= var4.length) {
                      stackOut_20_0 = ib.a(var3[var3.length + -1], false);
                      stackIn_21_0 = stackOut_20_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      var6 = var4[var5];
                      var7 = ie.a(var6, (byte) -55);
                      if (var7 == null) {
                        var5++;
                        continue L2;
                      } else {
                        stackOut_17_0 = (sa) (var7);
                        stackIn_18_0 = stackOut_17_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  }
                } else {
                  stackOut_12_0 = ef.field_j;
                  stackIn_13_0 = stackOut_12_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var2);
            stackOut_22_1 = new StringBuilder().append("oj.D(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L3;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L3;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0;
              } else {
                return stackIn_21_0;
              }
            }
          }
        }
    }

    final static void a(int param0) {
        if (!(ua.field_d == null)) {
            ua.field_d.k((byte) -112);
        }
        hn.field_u = new s();
        nj.field_w.c(hn.field_u, 78);
        if (param0 <= 120) {
            field_a = (String) null;
        }
    }

    oj(int param0, int param1, int param2) {
        this.field_d = param1;
        this.field_f = param0;
        this.field_e = param2;
    }

    static {
        field_g = "Invalid date";
        field_a = "Username: ";
        field_b = "Game full";
    }
}
