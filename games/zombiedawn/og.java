/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og extends pj {
    static boolean field_A;
    static int[] field_y;
    de field_w;
    static String field_z;
    byte field_C;
    static vn[] field_x;
    int field_v;
    static af field_B;

    final byte[] d(int param0) {
        if (this.field_q) {
            throw new RuntimeException();
        }
        if (this.field_w.field_j < this.field_w.field_h.length + -this.field_C) {
            throw new RuntimeException();
        }
        if (param0 != 0) {
            return (byte[]) null;
        }
        return this.field_w.field_h;
    }

    final static void a(String param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var3 = ZombieDawn.field_J;
        try {
          L0: {
            pl.field_m = pl.field_m + 1;
            if (param1 == 0) {
              L1: {
                if (ja.field_d != -1) {
                  break L1;
                } else {
                  if (-1 != ck.field_n) {
                    break L1;
                  } else {
                    ja.field_d = ha.field_b;
                    ck.field_n = ei.field_K;
                    break L1;
                  }
                }
              }
              L2: {
                L3: {
                  if (param0 != null) {
                    if (!param0.equals(da.field_m)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  } else {
                    if (da.field_m != null) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (!qo.field_x) {
                    if (td.field_d <= pl.field_m) {
                      if (td.field_d - -vf.field_k > pl.field_m) {
                        stackOut_17_0 = 1;
                        stackIn_19_0 = stackOut_17_0;
                        break L4;
                      } else {
                        stackOut_16_0 = 0;
                        stackIn_19_0 = stackOut_16_0;
                        break L4;
                      }
                    } else {
                      stackOut_14_0 = 0;
                      stackIn_19_0 = stackOut_14_0;
                      break L4;
                    }
                  } else {
                    stackOut_12_0 = 0;
                    stackIn_19_0 = stackOut_12_0;
                    break L4;
                  }
                }
                L5: {
                  var2_int = stackIn_19_0;
                  if (param0 == null) {
                    pl.field_m = 0;
                    break L5;
                  } else {
                    if (qo.field_x) {
                      pl.field_m = td.field_d;
                      break L5;
                    } else {
                      if (var2_int != 0) {
                        pl.field_m = td.field_d;
                        break L5;
                      } else {
                        pl.field_m = 0;
                        break L5;
                      }
                    }
                  }
                }
                L6: {
                  if (param0 == null) {
                    if (var2_int == 0) {
                      break L6;
                    } else {
                      qo.field_x = true;
                      break L6;
                    }
                  } else {
                    qo.field_x = false;
                    break L6;
                  }
                }
                mm.field_i = ck.field_n;
                lc.field_i = ja.field_d;
                break L2;
              }
              L7: {
                da.field_m = param0;
                if (qo.field_x) {
                  break L7;
                } else {
                  if (td.field_d <= pl.field_m) {
                    break L7;
                  } else {
                    if (ll.field_a) {
                      pl.field_m = 0;
                      mm.field_i = ck.field_n;
                      lc.field_i = ja.field_d;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              L8: {
                ja.field_d = -1;
                if (!qo.field_x) {
                  break L8;
                } else {
                  if (pl.field_m == se.field_o) {
                    pl.field_m = 0;
                    qo.field_x = false;
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
              ck.field_n = -1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) (var2);
            stackOut_43_1 = new StringBuilder().append("og.J(");
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param0 == null) {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L9;
            } else {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L9;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        field_z = null;
        if (param0) {
            return;
        }
        field_y = null;
        field_x = null;
        field_B = null;
    }

    final static void b(int param0, int param1) {
        ba.field_s = param1;
        if (param0 >= -110) {
            og.b(53, -25);
        }
    }

    final int e(int param0) {
        if (this.field_w == null) {
            return 0;
        }
        if (param0 != -31478) {
            return 29;
        }
        return 100 * this.field_w.field_j / (-this.field_C + this.field_w.field_h.length);
    }

    final static void g(int param0) {
        u[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        u var3 = null;
        int var4 = 0;
        u[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawn.field_J;
        try {
          L0: {
            var5 = ij.field_L;
            var1 = var5;
            var2 = param0;
            L1: while (true) {
              if (var2 >= var5.length) {
                break L0;
              } else {
                var3 = var5[var2];
                var3.d(param0 ^ 0);
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1_ref), "og.H(" + param0 + ')');
        }
    }

    og() {
    }

    static {
        field_y = new int[8192];
        field_z = "Rank";
        field_B = new af();
    }
}
