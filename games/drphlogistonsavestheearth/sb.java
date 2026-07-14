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
        uf var5 = null;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 == -11255) {
          L0: while (true) {
            if (((sb) this).field_e < ((sb) this).field_f) {
              var5 = ((sb) this).field_j[((sb) this).field_e];
              var4 = var5;
              var2 = var4;
              if (!var5.field_b.a(0)) {
                this.a(var5, 0, (byte) 52);
                return false;
              } else {
                L1: {
                  if (var5.field_l < 0) {
                    break L1;
                  } else {
                    if (!var5.field_b.c(var5.field_l, 29691)) {
                      this.a(var2, var5.field_b.a(24, var5.field_l), (byte) 52);
                      return false;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (var5.field_h == null) {
                    break L2;
                  } else {
                    if (!var5.field_b.a(255, var5.field_h)) {
                      this.a(var2, var5.field_b.b(10461, var5.field_h), (byte) 52);
                      return false;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (0 <= var5.field_l) {
                    break L3;
                  } else {
                    if (var5.field_h != null) {
                      break L3;
                    } else {
                      if (null == var5.field_g) {
                        break L3;
                      } else {
                        if (!var5.field_b.c((byte) 66)) {
                          this.a(var2, var5.field_b.d((byte) 95), (byte) 52);
                          return false;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                ((sb) this).field_e = ((sb) this).field_e + 1;
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
        float var4 = 0.0f;
        var4 = (float)(1 + ((sb) this).field_e) + (float)param1 / 100.0f;
        if (0 == param1) {
          ((sb) this).field_h = param0.field_e;
          ((sb) this).field_a = var4 * (float)((sb) this).field_b / (float)(1 + ((sb) this).field_f);
          if (param2 == 52) {
            return;
          } else {
            field_i = null;
            return;
          }
        } else {
          ((sb) this).field_h = param0.field_g + " - " + param1 + "%";
          ((sb) this).field_a = var4 * (float)((sb) this).field_b / (float)(1 + ((sb) this).field_f);
          if (param2 == 52) {
            return;
          } else {
            field_i = null;
            return;
          }
        }
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 != 33) {
          boolean discarded$2 = sb.b(-116);
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
              field_d = null;
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
              field_d = null;
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        long var0 = 0L;
        int var2 = 0;
        int var3 = 0;
        field_c = new long[256];
        var2 = 0;
        L0: while (true) {
          if (-257 >= var2) {
          } else {
            var0 = (long)var2;
            var3 = 0;
            L1: while (true) {
              if (-9 <= var3) {
                field_c[var2] = var0;
                var2++;
                continue L0;
              } else {
                if (1L == (1L & var0)) {
                  var0 = var0 >>> -328206847 ^ -3932672073523589310L;
                  var3++;
                  var3++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1;
                  var3++;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
