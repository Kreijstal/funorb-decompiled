/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df {
    int field_l;
    int field_k;
    static String field_c;
    static tk field_b;
    static vh field_f;
    static String field_m;
    static String[] field_a;
    private int field_g;
    static int field_e;
    boolean field_h;
    boolean field_j;
    int field_d;
    static dd field_i;

    final boolean a(byte param0, int param1, al param2) {
        int stackIn_2_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            if (param0 == -8) {
              L1: {
                L2: {
                  if (!this.field_h) {
                    break L2;
                  } else {
                    L3: {
                      if (!param2.field_l[this.field_g].field_s) {
                        break L3;
                      } else {
                        if (param1 == this.field_g) {
                          break L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackIn_9_0 = 0;
                    break L1;
                  }
                }
                stackIn_9_0 = 1;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("df.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    final static String a(byte param0) {
        if ((sf.field_y ^ -1) > -3) {
          return kg.field_q;
        } else {
          if (null != wh.field_a) {
            if (!wh.field_a.d(84)) {
              return ir.field_b;
            } else {
              return ud.field_F;
            }
          } else {
            if (!uj.field_d.d(101)) {
              return rp.field_c;
            } else {
              if (!uj.field_d.a("commonui", 0)) {
                return oj.field_t + " - " + uj.field_d.a(100, "commonui") + "%";
              } else {
                if (!vf.field_nb.d(-127)) {
                  return gh.field_Q;
                } else {
                  if (param0 == 84) {
                    if (!vf.field_nb.a("commonui", 0)) {
                      return kb.field_a + " - " + vf.field_nb.a(100, "commonui") + "%";
                    } else {
                      if (rg.field_r.d(66)) {
                        if (!rg.field_r.c(-63)) {
                          return cf.field_c + " - " + rg.field_r.b(0) + "%";
                        } else {
                          return cl.field_j;
                        }
                      } else {
                        return de.field_e;
                      }
                    }
                  } else {
                    return (String) null;
                  }
                }
              }
            }
          }
        }
    }

    final void a(int param0, pq param1, al param2) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var4_long = 0L;
        RuntimeException var4 = null;
        long var6 = 0L;
        int[] var8_ref_int__ = null;
        long var8 = 0L;
        int[] var10 = null;
        pq var11 = null;
        try {
          L0: {
            L1: {
              if (this.field_h) {
                var11 = param2.field_l[this.field_g];
                var4_long = (long)param1.field_g + -(long)var11.field_g;
                var6 = -(long)var11.field_k + (long)param1.field_k;
                var4_long = var4_long >> 8;
                var6 = var6 >> 8;
                break L1;
              } else {
                var10 = param2.field_e[this.field_g];
                var8_ref_int__ = var10;
                var4_long = -(long)var10[0] + (long)param1.field_g;
                var4_long = var4_long >> 8;
                var6 = (long)param1.field_k + -(long)var10[1];
                var6 = var6 >> 8;
                break L1;
              }
            }
            L2: {
              var8 = bm.a(-119, var4_long * var4_long + var6 * var6);
              if (-2147483648L > var8) {
                break L2;
              } else {
                if (var8 > 2147483647L) {
                  break L2;
                } else {
                  L3: {
                    if (param0 == 1763073386) {
                      break L3;
                    } else {
                      field_e = 62;
                      break L3;
                    }
                  }
                  this.field_l = (int)var8;
                  break L0;
                }
              }
            }
            throw new IllegalStateException("dist too big when checking for visibility.");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("df.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
        }
    }

    public static void b(byte param0) {
        field_b = null;
        if (param0 < 82) {
          df.a((byte) -85);
          field_a = null;
          field_c = null;
          field_i = null;
          field_f = null;
          field_m = null;
          return;
        } else {
          field_a = null;
          field_c = null;
          field_i = null;
          field_f = null;
          field_m = null;
          return;
        }
    }

    final void a(int param0, boolean param1, boolean param2) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        L0: {
          stackIn_2_0 = this;

          if (!param1) {
            stackIn_3_0 = this;
            stackIn_3_1 = 0;
            break L0;
          } else {
            stackIn_3_0 = this;
            stackIn_3_1 = 1;
            break L0;
          }
        }
        ((df) (this)).field_h = stackIn_3_1 != 0;
        if (!param2) {
          this.field_g = -112;
          this.field_g = param0;
          return;
        } else {
          this.field_g = param0;
          return;
        }
    }

    final int a(al param0, pq param1, int param2) {
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int[] var5 = null;
        pq var6 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == -6661) {
                break L1;
              } else {
                field_i = (dd) null;
                break L1;
              }
            }
            if (!this.field_h) {
              var5 = param0.field_e[this.field_g];
              var4 = var5;
              stackIn_6_0 = 8191 & tj.c(var5[0] - param1.field_g >> 209920874, -param1.field_k + var5[1] >> 509324874, 4096);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              var6 = param0.field_l[this.field_g];
              stackIn_4_0 = 8191 & tj.c(var6.field_g - param1.field_g >> -1483681046, var6.field_k - param1.field_k >> 1763073386, 4096);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4_ref);

            stackIn_9_1 = new StringBuilder().append("df.G(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    final int a(int param0) {
        if (param0 != 1048576) {
            return -61;
        }
        return dn.a(lh.a(this.field_l, (byte) -112, this.field_h ? 1048576L : 524288L), false);
    }

    static {
        field_a = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_c = "Passwords must be between 5 and 20 letters and numbers";
        field_m = "Cancel rematch";
    }
}
