/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lo {
    static pia field_b;
    static String field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 >= -90) {
            field_a = null;
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        L0: {
          var5 = BachelorFridge.field_y;
          if (qaa.field_e != null) {
            break L0;
          } else {
            var1 = jm.field_k.length;
            qaa.field_e = new int[1 + var1];
            var2 = 0;
            L1: while (true) {
              if (var2 >= var1) {
                var2 = 0;
                L2: while (true) {
                  if (var2 >= -1 + var1) {
                    var2 = 0;
                    L3: while (true) {
                      L4: {
                        if (var2 >= var1) {
                          break L4;
                        } else {
                          if (qaa.field_e[var2] == 0) {
                            qaa.field_e[var1] = qaa.field_e[1 + var2];
                            qaa.field_e[1 + var2] = -1;
                            break L4;
                          } else {
                            var2++;
                            continue L3;
                          }
                        }
                      }
                      L5: {
                        if ((qaa.field_e[0] ^ -1) == 0) {
                          stackOut_17_0 = 1;
                          stackIn_18_0 = stackOut_17_0;
                          break L5;
                        } else {
                          stackOut_16_0 = 0;
                          stackIn_18_0 = stackOut_16_0;
                          break L5;
                        }
                      }
                      rba.field_b = stackIn_18_0;
                      raa.e((byte) 31);
                      break L0;
                    }
                  } else {
                    var3 = kla.a(var1 - var2, m.field_a, -2147483648) + var2;
                    if (var3 != var2) {
                      var4 = qaa.field_e[var2];
                      qaa.field_e[var2] = qaa.field_e[var3];
                      qaa.field_e[var3] = var4;
                      var2++;
                      continue L2;
                    } else {
                      var2++;
                      continue L2;
                    }
                  }
                }
              } else {
                qaa.field_e[var2] = var2;
                var2++;
                continue L1;
              }
            }
          }
        }
        L6: {
          if ((f.b((byte) 73) ^ -1L) >= (3500L + cr.field_a ^ -1L)) {
            break L6;
          } else {
            L7: {
              rba.field_b = rba.field_b + 1;
              if (rba.field_b + 1 != qaa.field_e.length) {
                break L7;
              } else {
                rba.field_b = 0;
                break L7;
              }
            }
            raa.e((byte) 31);
            break L6;
          }
        }
        L8: {
          if (param0 > 73) {
            break L8;
          } else {
            field_b = null;
            break L8;
          }
        }
    }

    final static boolean b(byte param0) {
        ola var1_ref = null;
        int var1 = 0;
        int[] var2_ref_int__ = null;
        int var2 = 0;
        rk[] var3_ref_rk__ = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        boolean[] var7 = null;
        int var8 = 0;
        ola var9 = null;
        boolean[] var13 = null;
        int stackIn_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        var5 = BachelorFridge.field_y;
        if (78 == ri.field_a) {
          L0: {
            if (null != mg.field_m) {
              L1: {
                if (!mg.field_m.a((byte) 127)) {
                  pma.b(0, 20208);
                  break L1;
                } else {
                  break L1;
                }
              }
              var9 = gca.a(0, (lu) (Object) ig.field_m);
              var1_ref = var9;
              var2_ref_int__ = rd.a(true, (lu) (Object) ig.field_m);
              var3_ref_rk__ = tj.a((byte) 124, (lu) (Object) ig.field_m);
              mg.field_m.field_e = var9;
              mg.field_m.field_f = var2_ref_int__;
              mg.field_m.field_i = var3_ref_rk__;
              er.e((byte) -66);
              break L0;
            } else {
              break L0;
            }
          }
          hb.field_j = false;
          return true;
        } else {
          if (ri.field_a == 79) {
            L2: {
              if ((ig.field_m.b(16711935) ^ -1) == -2) {
                stackOut_13_0 = 1;
                stackIn_14_0 = stackOut_13_0;
                break L2;
              } else {
                stackOut_12_0 = 0;
                stackIn_14_0 = stackOut_12_0;
                break L2;
              }
            }
            var1 = stackIn_14_0;
            var6 = new int[50];
            var2_ref_int__ = var6;
            var3 = ig.field_m.b(16711935);
            var4 = 0;
            L3: while (true) {
              if (var3 <= var4) {
                L4: {
                  mg.field_m.field_f = var2_ref_int__;
                  pka.a((byte) -111, var1 != 0);
                  if (var1 == 0) {
                    break L4;
                  } else {
                    gs.field_f.b(11);
                    break L4;
                  }
                }
                return true;
              } else {
                var6[ig.field_m.b(16711935)] = ig.field_m.b(16711935);
                var4++;
                continue L3;
              }
            }
          } else {
            if (-81 != ri.field_a) {
              L5: {
                if (param0 < -83) {
                  break L5;
                } else {
                  field_a = null;
                  break L5;
                }
              }
              if (-83 == ri.field_a) {
                var7 = new boolean[50];
                var13 = var7;
                var2 = 0;
                var3 = ig.field_m.b(16711935);
                var8 = 0;
                var4 = var8;
                L6: while (true) {
                  if ((var8 ^ -1) <= -51) {
                    gs.field_f.a(10, var13);
                    return true;
                  } else {
                    L7: {
                      if ((var3 & 1 << var2) != 1 << var2) {
                        break L7;
                      } else {
                        var7[var8] = true;
                        break L7;
                      }
                    }
                    var2++;
                    if ((var2 ^ -1) == -9) {
                      var3 = ig.field_m.b(16711935);
                      var2 = 0;
                      var8++;
                      continue L6;
                    } else {
                      var8++;
                      continue L6;
                    }
                  }
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
    }
}
