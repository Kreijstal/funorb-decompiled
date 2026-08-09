/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk extends li {
    int field_t;
    static int[] field_w;
    static int[] field_v;
    pk field_n;
    int field_p;
    int field_u;
    int field_q;
    int field_s;
    static int field_o;
    static String field_r;

    public static void f(int param0) {
        field_w = null;
        if (param0 != -8105) {
            return;
        }
        field_r = null;
        field_v = null;
    }

    final static cr e(int param0) {
        if (param0 != 2) {
            return (cr) null;
        }
        return vd.field_d.field_Nb;
    }

    final static int a(byte param0, int param1, int param2, int param3) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        if (param0 != -14) {
          L0: {
            field_v = (int[]) null;
            if (param2 < param3) {
              stackIn_12_0 = param3;
              break L0;
            } else {
              if (param2 <= param1) {
                stackIn_12_0 = param2;
                break L0;
              } else {
                stackIn_12_0 = param1;
                break L0;
              }
            }
          }
          return stackIn_12_0;
        } else {
          L1: {
            if (param2 < param3) {
              stackIn_6_0 = param3;
              break L1;
            } else {
              if (param2 <= param1) {
                stackIn_6_0 = param2;
                break L1;
              } else {
                stackIn_6_0 = param1;
                break L1;
              }
            }
          }
          return stackIn_6_0;
        }
    }

    final static int a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            ch.field_e.a(qj.field_c, true, (byte) -71, qe.field_Z);
            if (param0 == 1) {
              ch.field_e.l(0);
              L1: while (true) {
                if (!gf.a(false)) {
                  if (0 == (nm.field_F ^ -1)) {
                    if (!ed.field_t) {
                      if (bf.field_b == um.field_F) {
                        stackIn_16_0 = 1;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        if (cl.field_c.a((byte) -79)) {
                          if (bf.field_b != un.field_Hb) {
                            stackIn_24_0 = -1;
                            decompiledRegionSelector0 = 6;
                            break L0;
                          } else {
                            stackIn_22_0 = 2;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        } else {
                          stackIn_19_0 = 1;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                    } else {
                      stackIn_12_0 = 3;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    var1_int = nm.field_F;
                    rh.b(-14, -1);
                    stackIn_9_0 = var1_int;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  ch.field_e.a(param0 + -93, de.field_f, ji.field_r);
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = 16;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var1), "pk.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_16_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_19_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_22_0;
                  } else {
                    return stackIn_24_0;
                  }
                }
              }
            }
          }
        }
    }

    final static void b(int param0, int param1) {
        int var2_int = 0;
        gg var3 = null;
        int var4 = 0;
        boolean stackIn_12_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = -36 % ((-24 - param0) / 47);
            tg.field_e = param1;
            var3 = (gg) ((Object) fm.field_b.a((byte) 100));
            L1: while (true) {
              if (var3 == null) {
                L2: {
                  if (ro.field_b == null) {
                    break L2;
                  } else {
                    var3 = (gg) ((Object) ro.field_b.a((byte) 100));
                    L3: while (true) {
                      if (var3 == null) {
                        break L2;
                      } else {
                        stackIn_12_0 = var3.field_q.b(114);
                        L4: {
                          if (!stackIn_12_0) {
                            var3.c(2);
                            break L4;
                          } else {
                            var3.field_r.g(128 + tg.field_e * var3.field_p >> 125100744);
                            break L4;
                          }
                        }
                        var3 = (gg) ((Object) ro.field_b.b(41));
                        continue L3;
                      }
                    }
                  }
                }
                break L0;
              } else {
                L5: {
                  if (!var3.field_q.b(99)) {
                    var3.c(2);
                    break L5;
                  } else {
                    var3.field_r.g(128 + var3.field_p * tg.field_e >> 462771688);
                    break L5;
                  }
                }
                var3 = (gg) ((Object) fm.field_b.b(117));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2), "pk.B(" + param0 + ',' + param1 + ')');
        }
    }

    pk(int param0, int param1, int param2, int param3, int param4) {
        this.field_p = param2;
        this.field_t = param3;
        this.field_u = param0;
        this.field_q = param4;
        this.field_s = param1;
    }

    static {
        field_w = new int[8192];
        field_v = new int[8192];
        field_r = "Create a free Account";
    }
}
