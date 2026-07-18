/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl {
    int[] field_g;
    static int field_r;
    int[] field_m;
    jk field_n;
    byte[][] field_t;
    private int field_b;
    static float field_c;
    jk[] field_d;
    static int field_p;
    int[] field_h;
    int field_k;
    private int[][] field_q;
    int field_e;
    int[] field_j;
    static gh field_s;
    private byte[] field_l;
    int field_u;
    static oe field_w;
    static String field_f;
    private int[] field_v;
    int[] field_a;
    static String field_i;
    int[][] field_o;

    final static void a(boolean param0) {
        aj var1 = (aj) (Object) sl.field_b.c(-6533);
        if (!(var1 != null)) {
            var1 = new aj();
        }
        var1.a(pb.field_b, pb.field_i, pb.field_c, pb.field_l, pb.field_g, pb.field_d, pb.field_j, (byte) -62);
        ff.field_qb.a(3, (ck) (Object) var1);
        if (param0) {
            jl.a(true);
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_w = null;
        if (param0 != 0) {
            jl.a(81);
        }
        field_i = null;
        field_s = null;
    }

    private final void a(byte[] param0) {
        RuntimeException var3 = null;
        gi var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var16 = 0;
        gi var17 = null;
        byte[] var21 = null;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        var16 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              int discarded$3 = 127;
              var17 = new gi(ln.a(param0));
              var3_ref = var17;
              var4 = var17.f((byte) -66);
              if (5 > var4) {
                break L1;
              } else {
                if (var4 > 7) {
                  break L1;
                } else {
                  L2: {
                    if (var4 >= 6) {
                      ((jl) this).field_k = var17.i(0);
                      break L2;
                    } else {
                      ((jl) this).field_k = 0;
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.f((byte) -111);
                    if ((1 & var5) == 0) {
                      stackOut_10_0 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      break L3;
                    } else {
                      stackOut_9_0 = 1;
                      stackIn_11_0 = stackOut_9_0;
                      break L3;
                    }
                  }
                  L4: {
                    var6 = stackIn_11_0;
                    if (var4 < 7) {
                      ((jl) this).field_b = var17.c((byte) -60);
                      break L4;
                    } else {
                      ((jl) this).field_b = var17.c(true);
                      break L4;
                    }
                  }
                  L5: {
                    if ((var5 & 2) == 0) {
                      stackOut_16_0 = 0;
                      stackIn_17_0 = stackOut_16_0;
                      break L5;
                    } else {
                      stackOut_15_0 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      break L5;
                    }
                  }
                  L6: {
                    var7 = stackIn_17_0;
                    var8 = 0;
                    var9 = -1;
                    ((jl) this).field_h = new int[((jl) this).field_b];
                    if (7 > var4) {
                      var10 = 0;
                      L7: while (true) {
                        if (~((jl) this).field_b >= ~var10) {
                          break L6;
                        } else {
                          L8: {
                            int dupTemp$4 = var8 + var17.c((byte) -60);
                            var8 = dupTemp$4;
                            ((jl) this).field_h[var10] = dupTemp$4;
                            if (((jl) this).field_h[var10] <= var9) {
                              break L8;
                            } else {
                              var9 = ((jl) this).field_h[var10];
                              break L8;
                            }
                          }
                          var10++;
                          continue L7;
                        }
                      }
                    } else {
                      var10 = 0;
                      L9: while (true) {
                        if (~((jl) this).field_b >= ~var10) {
                          break L6;
                        } else {
                          L10: {
                            int dupTemp$5 = var8 + var17.c(true);
                            var8 = dupTemp$5;
                            ((jl) this).field_h[var10] = dupTemp$5;
                            if (((jl) this).field_h[var10] <= var9) {
                              break L10;
                            } else {
                              var9 = ((jl) this).field_h[var10];
                              break L10;
                            }
                          }
                          var10++;
                          continue L9;
                        }
                      }
                    }
                  }
                  L11: {
                    ((jl) this).field_u = 1 + var9;
                    ((jl) this).field_o = new int[((jl) this).field_u][];
                    ((jl) this).field_g = new int[((jl) this).field_u];
                    if (var7 != 0) {
                      ((jl) this).field_t = new byte[((jl) this).field_u][];
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    ((jl) this).field_j = new int[((jl) this).field_u];
                    ((jl) this).field_a = new int[((jl) this).field_u];
                    ((jl) this).field_m = new int[((jl) this).field_u];
                    if (var6 != 0) {
                      ((jl) this).field_v = new int[((jl) this).field_u];
                      var10 = 0;
                      L13: while (true) {
                        if (~((jl) this).field_u >= ~var10) {
                          var10 = 0;
                          L14: while (true) {
                            if (~var10 <= ~((jl) this).field_b) {
                              ((jl) this).field_n = new jk(((jl) this).field_v);
                              break L12;
                            } else {
                              ((jl) this).field_v[((jl) this).field_h[var10]] = var17.i(0);
                              var10++;
                              continue L14;
                            }
                          }
                        } else {
                          ((jl) this).field_v[var10] = -1;
                          var10++;
                          continue L13;
                        }
                      }
                    } else {
                      break L12;
                    }
                  }
                  var10 = 0;
                  L15: while (true) {
                    if (((jl) this).field_b <= var10) {
                      L16: {
                        if (var7 == 0) {
                          break L16;
                        } else {
                          var10 = 0;
                          L17: while (true) {
                            if (var10 >= ((jl) this).field_b) {
                              break L16;
                            } else {
                              var21 = new byte[64];
                              var17.a(0, var21, 28, 64);
                              ((jl) this).field_t[((jl) this).field_h[var10]] = var21;
                              var10++;
                              continue L17;
                            }
                          }
                        }
                      }
                      break L0;
                    } else {
                      ((jl) this).field_a[((jl) this).field_h[var10]] = var17.i(0);
                      var10++;
                      continue L15;
                    }
                  }
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var3 = decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) var3;
            stackOut_49_1 = new StringBuilder().append("jl.C(");
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param0 == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L18;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L18;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_52_0, stackIn_52_2 + ',' + 70 + ')');
        }
    }

    jl(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            ((jl) this).field_e = ba.a((byte) -107, param0, param0.length);
            if (((jl) this).field_e != param1) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (64 != param2.length) {
                    throw new RuntimeException();
                }
                ((jl) this).field_l = co.a((byte) -37, param0.length, 0, param0);
                for (var4_int = 0; 64 > var4_int; var4_int++) {
                    if (param2[var4_int] != ((jl) this).field_l[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            int discarded$0 = 70;
            this.a(param0);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "jl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Unpacking graphics";
        field_f = "Click or press F10 to open Quick Chat";
    }
}
