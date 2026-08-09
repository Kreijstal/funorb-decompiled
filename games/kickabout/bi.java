/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bi {
    static int field_i;
    static int field_m;
    static String field_e;
    static String field_a;
    o field_h;
    o field_b;
    o field_c;
    o field_j;
    iw field_d;
    int field_f;
    long field_p;
    volatile int field_l;
    volatile int field_o;
    byte field_g;
    iw field_n;
    ui field_k;

    final int b(int param0) {
        if (param0 != -21) {
          this.e(124);
          return this.field_c.c(-1976587888) + this.field_j.c(-1976587888);
        } else {
          return this.field_c.c(-1976587888) + this.field_j.c(-1976587888);
        }
    }

    final boolean d(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != 10770) {
          L0: {
            this.field_f = -107;
            if (this.b(param0 ^ -10759) < 20) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.b(param0 ^ -10759) < 20) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    abstract void a(Object param0, int param1, boolean param2);

    final boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != 25533) {
          L0: {
            this.field_g = (byte) -15;
            if ((this.e(0) ^ -1) > -21) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((this.e(0) ^ -1) > -21) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static boolean a(String param0, int param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (hf.a(param0, -3)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!qe.a(true, param0)) {
                if (lg.a(param0, (byte) 79)) {
                  stackIn_10_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (param1 == -32341) {
                    if (param2.length() != 0) {
                      if (j.a((byte) -125, param2, param0)) {
                        stackIn_20_0 = 0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (uj.a(63, param0, param2)) {
                          stackIn_24_0 = 0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if (!lj.a((byte) -120, param2, param0)) {
                            stackIn_29_0 = 1;
                            decompiledRegionSelector0 = 8;
                            break L0;
                          } else {
                            stackIn_27_0 = 0;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          }
                        }
                      }
                    } else {
                      stackIn_16_0 = 1;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_13_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } else {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var3);

            stackIn_32_1 = new StringBuilder().append("bi.P(");

            if (param0 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L1;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L2;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_33_0), stackIn_36_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_16_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_20_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_24_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_27_0 != 0;
                      } else {
                        return stackIn_29_0 != 0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    public static void f(int param0) {
        if (param0 != 0) {
            return;
        }
        field_a = null;
        field_e = null;
    }

    final ui a(int param0, int param1, byte param2, byte param3, boolean param4) {
        ui stackIn_3_0 = null;
        ui stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        ui stackIn_16_0 = null;
        ui stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        long var6;
        ui var8;
        var6 = ((long)param0 << 1415540512) + (long)param1;
        var8 = new ui();
        if (param3 == 89) {
          L0: {
            var8.field_l = var6;
            stackIn_16_0 = (ui) (var8);

            if (!param4) {
              stackIn_17_0 = (ui) ((Object) stackIn_16_0);
              stackIn_17_1 = 0;
              break L0;
            } else {
              stackIn_17_0 = (ui) ((Object) stackIn_16_0);
              stackIn_17_1 = 1;
              break L0;
            }
          }
          stackIn_17_0.field_q = stackIn_17_1 != 0;
          var8.field_x = param2;
          if (!param4) {
            if (this.b(-21) >= 20) {
              throw new RuntimeException();
            } else {
              this.field_c.a(param3 + 38, var8);
              return var8;
            }
          } else {
            if ((this.e(0) ^ -1) <= -21) {
              throw new RuntimeException();
            } else {
              this.field_h.a(127, var8);
              return var8;
            }
          }
        } else {
          L1: {
            bi.a(14, -40, 39, -92);
            var8.field_l = var6;
            stackIn_3_0 = (ui) (var8);

            if (!param4) {
              stackIn_4_0 = (ui) ((Object) stackIn_3_0);
              stackIn_4_1 = 0;
              break L1;
            } else {
              stackIn_4_0 = (ui) ((Object) stackIn_3_0);
              stackIn_4_1 = 1;
              break L1;
            }
          }
          stackIn_4_0.field_q = stackIn_4_1 != 0;
          var8.field_x = param2;
          if (!param4) {
            if (this.b(-21) >= 20) {
              throw new RuntimeException();
            } else {
              this.field_c.a(param3 + 38, var8);
              return var8;
            }
          } else {
            if ((this.e(0) ^ -1) <= -21) {
              throw new RuntimeException();
            } else {
              this.field_h.a(127, var8);
              return var8;
            }
          }
        }
    }

    abstract void c(int param0);

    abstract void b(byte param0);

    final static void a(int param0, int param1, int param2, int param3) {
        fb.field_R = param2;
        if (param3 != 20) {
            return;
        }
        wt.field_v = param0;
        du.field_k = param1;
    }

    abstract boolean a(byte param0);

    final int e(int param0) {
        Object var3;
        if (param0 != 0) {
          var3 = (Object) null;
          this.a((Object) null, -67, false);
          return this.field_h.c(-1976587888) - -this.field_b.c(-1976587888);
        } else {
          return this.field_h.c(-1976587888) - -this.field_b.c(-1976587888);
        }
    }

    bi() {
        this.field_h = new o();
        this.field_b = new o();
        this.field_c = new o();
        this.field_j = new o();
        this.field_d = new iw(6);
        this.field_g = (byte) 0;
        this.field_o = 0;
        this.field_l = 0;
        this.field_n = new iw(10);
    }

    static {
        field_i = 10;
        field_a = "Filter Auctions";
        field_e = "search for a user: ";
    }
}
