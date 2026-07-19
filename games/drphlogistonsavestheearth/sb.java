/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb {
    private int field_f;
    private int field_b;
    private uf[] field_j;
    static bl field_d;
    static vj field_g;
    float field_a;
    static vj field_i;
    private int field_e;
    String field_h;
    private static long[] field_c;

    final static boolean b(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == -11) {
          if (-11 >= (af.field_b ^ -1)) {
            if (gf.field_G) {
              return false;
            } else {
              L0: {
                if (n.a(param0 + 75)) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L0;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L0;
                }
              }
              return stackIn_8_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final boolean a(int param0) {
        uf var2 = null;
        int var3 = 0;
        uf var4 = null;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 == -11255) {
          L0: while (true) {
            if (this.field_e < this.field_f) {
              var4 = this.field_j[this.field_e];
              var2 = var4;
              if (!var4.field_b.a(0)) {
                this.a(var4, 0, (byte) 52);
                return false;
              } else {
                L1: {
                  if (var4.field_l < 0) {
                    break L1;
                  } else {
                    if (!var4.field_b.c(var4.field_l, 29691)) {
                      this.a(var2, var4.field_b.a(24, var4.field_l), (byte) 52);
                      return false;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (var4.field_h == null) {
                    break L2;
                  } else {
                    if (!var4.field_b.a(255, var4.field_h)) {
                      this.a(var2, var4.field_b.b(10461, var4.field_h), (byte) 52);
                      return false;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (0 <= var4.field_l) {
                    break L3;
                  } else {
                    if (var4.field_h != null) {
                      break L3;
                    } else {
                      if (null == var4.field_g) {
                        break L3;
                      } else {
                        if (!var4.field_b.c((byte) 66)) {
                          this.a(var2, var4.field_b.d((byte) 95), (byte) 52);
                          return false;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                this.field_e = this.field_e + 1;
                continue L0;
              }
            } else {
              return true;
            }
          }
        } else {
          return true;
        }
    }

    private final void a(uf param0, int param1, byte param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              var4_float = (float)(1 + this.field_e) + (float)param1 / 100.0f;
              if (0 == param1) {
                this.field_h = param0.field_e;
                break L1;
              } else {
                this.field_h = param0.field_g + " - " + param1 + "%";
                break L1;
              }
            }
            this.field_a = var4_float * (float)this.field_b / (float)(1 + this.field_f);
            if (param2 == 52) {
              break L0;
            } else {
              field_i = (vj) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var4);
            stackOut_6_1 = new StringBuilder().append("sb.C(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        boolean discarded$2 = false;
        field_d = null;
        if (param0 != 33) {
          discarded$2 = sb.b(-116);
          field_g = null;
          field_i = null;
          field_c = null;
          return;
        } else {
          field_g = null;
          field_i = null;
          field_c = null;
          return;
        }
    }

    private sb() throws Throwable {
        throw new Error();
    }

    final static void b(byte param0) {
        af.b(6);
        if (n.field_g == null) {
          oe.b(-19495);
          de.e(-86);
          oi.b((byte) -120);
          if (param0 != 67) {
            L0: {
              field_d = (bl) null;
              if (DrPhlogistonSavesTheEarth.t(18137)) {
                nj.field_p.d(1, param0 + -18459);
                qj.a(0, param0 + 14589);
                break L0;
              } else {
                break L0;
              }
            }
            eg.a((byte) 126);
            return;
          } else {
            L1: {
              if (DrPhlogistonSavesTheEarth.t(18137)) {
                nj.field_p.d(1, param0 + -18459);
                qj.a(0, param0 + 14589);
                break L1;
              } else {
                break L1;
              }
            }
            eg.a((byte) 126);
            return;
          }
        } else {
          hb.a(param0 ^ -72, n.field_g);
          oe.b(-19495);
          de.e(-86);
          oi.b((byte) -120);
          if (param0 == 67) {
            L2: {
              if (DrPhlogistonSavesTheEarth.t(18137)) {
                nj.field_p.d(1, param0 + -18459);
                qj.a(0, param0 + 14589);
                break L2;
              } else {
                break L2;
              }
            }
            eg.a((byte) 126);
            return;
          } else {
            L3: {
              field_d = (bl) null;
              if (DrPhlogistonSavesTheEarth.t(18137)) {
                nj.field_p.d(1, param0 + -18459);
                qj.a(0, param0 + 14589);
                break L3;
              } else {
                break L3;
              }
            }
            eg.a((byte) 126);
            return;
          }
        }
    }

    static {
        $cfr$clinit: {
            long var0 = 0L;
            int var2 = 0;
            int var3 = 0;
            field_c = new long[256];
            var2 = 0;
            L0: while (true) {
              if (-257 >= (var2 ^ -1)) {
                break $cfr$clinit;
              } else {
                var0 = (long)var2;
                var3 = 0;
                L1: while (true) {
                  if (-9 >= (var3 ^ -1)) {
                    field_c[var2] = var0;
                    var2++;
                    continue L0;
                  } else {
                    if (1L == (1L & var0)) {
                      var0 = var0 >>> -328206847 ^ -3932672073523589310L;
                      var3++;
                      continue L1;
                    } else {
                      var0 = var0 >>> 1;
                      var3++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }
}
