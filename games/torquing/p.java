/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p extends ta {
    int[] field_v;
    private String[] field_r;
    private int[] field_q;
    private int[][] field_s;
    static ce field_t;
    static t field_w;
    static fn field_x;
    static int field_u;

    public static void b(int param0) {
        field_x = null;
        if (param0 != 29841) {
            field_w = (t) null;
        }
        field_w = null;
        field_t = null;
    }

    private final void a(int param0, int param1, fj param2) {
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
        k var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (param0 == param1) {
                this.field_r = kc.a('<', param2.h((byte) 122), 0);
                break L1;
              } else {
                if (param0 != 2) {
                  if (param0 == 3) {
                    var4_int = param2.i((byte) -101);
                    this.field_s = new int[var4_int][];
                    this.field_q = new int[var4_int];
                    var5 = 0;
                    L2: while (true) {
                      if (var5 >= var4_int) {
                        break L1;
                      } else {
                        L3: {
                          var6 = param2.i(7088);
                          var7 = ni.a(89, var6);
                          if (var7 != null) {
                            this.field_q[var5] = var6;
                            array$0 = new int[var7.field_a];
                            this.field_s[var5] = array$0;
                            var8 = 0;
                            L4: while (true) {
                              if (var7.field_a <= var8) {
                                break L3;
                              } else {
                                this.field_s[var5][var8] = param2.i(7088);
                                var8++;
                                continue L4;
                              }
                            }
                          } else {
                            break L3;
                          }
                        }
                        var5++;
                        continue L2;
                      }
                    }
                  } else {
                    if (param0 == 4) {
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  var4_int = param2.i((byte) -101);
                  this.field_v = new int[var4_int];
                  var5 = 0;
                  L5: while (true) {
                    if (var4_int <= var5) {
                      break L1;
                    } else {
                      this.field_v[var5] = param2.i(7088);
                      var5++;
                      continue L5;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("p.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw rb.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
    }

    final void a(fj param0, byte param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Torquing.field_u;
        try {
          L0: {
            if (param1 > 35) {
              L1: while (true) {
                var3_int = param0.i((byte) -101);
                if (var3_int == 0) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  this.a(var3_int, 1, param0);
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("p.D(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static t[] a(int param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = Torquing.field_u;
        t[] var1 = new t[ti.field_g];
        for (var2 = 0; ti.field_g > var2; var2++) {
            var3 = ij.field_o[var2] * vo.field_b[var2];
            var4 = pn.field_b[var2];
            var5 = new int[var3];
            for (var6 = 0; var6 < var3; var6++) {
                var5[var6] = cq.field_y[ie.a(255, (int) var4[var6])];
            }
            var1[var2] = new t(fm.field_E, rh.field_d, fj.field_o[var2], na.field_G[var2], vo.field_b[var2], ij.field_o[var2], var5);
        }
        go.b(param0 + -3499);
        if (param0 != 3499) {
            field_x = (fn) null;
        }
        return var1;
    }

    final void d(byte param0) {
        int var2 = 0;
        int var3 = Torquing.field_u;
        if (this.field_v != null) {
            for (var2 = 0; var2 < this.field_v.length; var2++) {
                this.field_v[var2] = gm.a(this.field_v[var2], 32768);
            }
        }
        if (param0 >= -28) {
            p.a(-61);
        }
    }

    final String c(byte param0) {
        int var3 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = Torquing.field_u;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (null == this.field_r) {
            return "";
        }
        if (param0 >= -126) {
            p.a(18);
        }
        StringBuilder discarded$0 = var5.append(this.field_r[0]);
        for (var3 = 1; var3 < this.field_r.length; var3++) {
            discarded$1 = var2.append("...");
            discarded$2 = var5.append(this.field_r[var3]);
        }
        return var2.toString();
    }

    p() {
    }

    static {
        field_t = new ce();
        field_u = 50;
    }
}
