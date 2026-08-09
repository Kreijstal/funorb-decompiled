/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj extends br {
    static String field_g;
    static String field_f;
    int field_x;
    int field_w;
    static ja field_o;
    static ri field_m;
    int field_t;
    static int field_q;
    int field_k;
    static int field_j;
    static int field_h;
    static long field_n;
    static String field_s;
    int field_l;
    int field_v;
    int[] field_y;
    static cj field_u;
    int field_i;
    static int[] field_p;
    static ii field_r;

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -94) {
                break L1;
              } else {
                kj.a(-113);
                break L1;
              }
            }
            L2: {
              if (null == dn.a(param1, false)) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("kj.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    public static void a(int param0) {
        field_m = null;
        field_u = null;
        field_p = null;
        field_s = null;
        if (param0 != -2) {
          field_q = -81;
          field_r = null;
          field_f = null;
          field_g = null;
          field_o = null;
          return;
        } else {
          field_r = null;
          field_f = null;
          field_g = null;
          field_o = null;
          return;
        }
    }

    final static void a(int param0, ka param1) {
        long stackIn_2_0;
        int stackIn_2_1;
        String stackIn_2_2;
        Object stackIn_2_3;
        String stackIn_2_4;
        cj stackIn_2_5;
        int stackIn_2_6;
        Object stackIn_2_7;
        long stackIn_3_0 = 0L;
        int stackIn_3_1 = 0;
        String stackIn_3_2 = null;
        Object stackIn_3_3 = null;
        String stackIn_3_4 = null;
        cj stackIn_3_5 = null;
        int stackIn_3_6 = 0;
        Object stackIn_3_7 = null;
        int stackIn_3_8 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        jb var5 = null;
        String var6 = null;
        jb var7 = null;
        String var8 = null;
        jb var9 = null;
        String var10 = null;
        jb var11 = null;
        String var12 = null;
        jb var13 = null;
        try {
          L0: {
            L1: {
              stackIn_2_0 = param1.field_a;

              stackIn_2_1 = 196;

              stackIn_2_2 = param1.field_n;

              stackIn_2_3 = null;

              stackIn_2_4 = param1.field_e;

              stackIn_2_5 = param1.field_q;

              stackIn_2_6 = param1.field_l;

              stackIn_2_7 = null;

              if (param1.field_l == 1) {
                stackIn_3_0 = stackIn_2_0;
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = (String) ((Object) stackIn_2_2);
                stackIn_3_3 = stackIn_2_3;
                stackIn_3_4 = (String) ((Object) stackIn_2_4);
                stackIn_3_5 = (cj) ((Object) stackIn_2_5);
                stackIn_3_6 = stackIn_2_6;
                stackIn_3_7 = stackIn_2_7;
                stackIn_3_8 = param1.field_j;
                break L1;
              } else {
                stackIn_3_0 = stackIn_2_0;
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = (String) ((Object) stackIn_2_2);
                stackIn_3_3 = stackIn_2_3;
                stackIn_3_4 = (String) ((Object) stackIn_2_4);
                stackIn_3_5 = (cj) ((Object) stackIn_2_5);
                stackIn_3_6 = stackIn_2_6;
                stackIn_3_7 = stackIn_2_7;
                stackIn_3_8 = 0;
                break L1;
              }
            }
            L2: {
              ve.a(stackIn_3_0, stackIn_3_1, stackIn_3_2, (tq) ((Object) stackIn_3_3), stackIn_3_4, stackIn_3_5, stackIn_3_6, (int[]) ((Object) stackIn_3_7), stackIn_3_8);
              if (-1 != (param1.field_l ^ -1)) {
                break L2;
              } else {
                if (um.b(-127)) {
                  break L2;
                } else {
                  if (mh.field_c != null) {
                    break L2;
                  } else {
                    if (ej.field_n == null) {
                      L3: {
                        if (!sh.field_L) {
                          var5 = pk.field_b;
                          var6 = ki.field_j;
                          var5.field_j.a((byte) -118, var6, 14);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var7 = pk.field_b;
                      var8 = sq.field_P;
                      var7.field_j.a((byte) -118, var8, 20);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            if (param0 == -31806) {
              L4: {
                if (-2 != (param1.field_l ^ -1)) {
                  break L4;
                } else {
                  if (um.b(-122)) {
                    break L4;
                  } else {
                    if (null == mh.field_c) {
                      break L4;
                    } else {
                      if (param1.field_j != mh.field_c.i(6)) {
                        break L4;
                      } else {
                        L5: {
                          if (sh.field_L) {
                            break L5;
                          } else {
                            var9 = pk.field_b;
                            var10 = pi.field_e;
                            var9.field_j.a((byte) -118, var10, 14);
                            break L5;
                          }
                        }
                        var11 = pk.field_b;
                        var12 = v.field_g;
                        var11.field_j.a((byte) -118, var12, 20);
                        break L4;
                      }
                    }
                  }
                }
              }
              pk.field_b.a((byte) -75);
              pk.field_b.a(false, (byte) -101);
              pk.field_b.a(param1.field_l, param1.field_r, (byte) 13);
              pk.field_b.c(-56);
              pk.field_b.a(param1, param0 ^ -31808);
              var13 = pk.field_b;
              var3 = vb.field_f;
              var4 = ka.field_t;
              var13.field_j.b(4542, var3, 0, var4, 0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var2);

            stackIn_25_1 = new StringBuilder().append("kj.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L6;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L6;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private kj() throws Throwable {
        throw new Error();
    }

    static {
        field_f = "Show players in <%0>'s game";
        field_n = 0L;
        field_j = 0;
        field_s = "Discard";
    }
}
