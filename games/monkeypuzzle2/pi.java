/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pi extends bf {
    private int[] field_k;
    int[] field_q;
    private int[][] field_j;
    static String field_p;
    private String[] field_n;
    static Random field_l;
    static int field_o;
    static String field_i;
    static String field_m;

    final void a(gk param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (param1) {
            break L0;
          } else {
            var5 = null;
            this.a((gk) null, -61, 68);
            break L0;
          }
        }
        L1: while (true) {
          var3 = param0.a((byte) 114);
          if (0 != var3) {
            this.a(param0, -305, var3);
            continue L1;
          } else {
            return;
          }
        }
    }

    private final void a(gk param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        te var7 = null;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = MonkeyPuzzle2.field_F ? 1 : 0;
          if ((param2 ^ -1) != -2) {
            if (param2 != 2) {
              if ((param2 ^ -1) == -4) {
                var4 = param0.a((byte) 114);
                ((pi) this).field_j = new int[var4][];
                ((pi) this).field_k = new int[var4];
                var5 = 0;
                L1: while (true) {
                  if (var5 >= var4) {
                    break L0;
                  } else {
                    var6 = param0.j(param1 + 17582);
                    var7 = ab.a((byte) -65, var6);
                    if (var7 != null) {
                      ((pi) this).field_k[var5] = var6;
                      ((pi) this).field_j[var5] = new int[var7.field_b];
                      var8 = 0;
                      L2: while (true) {
                        if (var8 < var7.field_b) {
                          ((pi) this).field_j[var5][var8] = param0.j(17277);
                          var8++;
                          continue L2;
                        } else {
                          var5++;
                          continue L1;
                        }
                      }
                    } else {
                      var5++;
                      continue L1;
                    }
                  }
                }
              } else {
                if (param2 != 4) {
                  break L0;
                } else {
                  break L0;
                }
              }
            } else {
              var4 = param0.a((byte) 114);
              ((pi) this).field_q = new int[var4];
              var5 = 0;
              L3: while (true) {
                if (var4 <= var5) {
                  break L0;
                } else {
                  ((pi) this).field_q[var5] = param0.j(17277);
                  var5++;
                  continue L3;
                }
              }
            }
          } else {
            ((pi) this).field_n = ma.a(122, '<', param0.f(-1));
            break L0;
          }
        }
        L4: {
          if (param1 == -305) {
            break L4;
          } else {
            field_l = null;
            break L4;
          }
        }
    }

    final static boolean a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        ki var3 = null;
        int var4 = 0;
        float var5 = 0.0f;
        int var6 = 0;
        int var7 = 0;
        int stackIn_68_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_66_0 = 0;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        L0: while (true) {
          if (!ba.a(-1)) {
            if (kc.field_d != 0) {
              return true;
            } else {
              L1: {
                m.field_h = m.field_h + 1;
                var1 = 6;
                if (0 != m.field_h % var1) {
                  break L1;
                } else {
                  var2 = 0;
                  L2: while (true) {
                    if (var2 >= ii.field_E) {
                      break L1;
                    } else {
                      if (-1 >= (ii.field_U[var2] ^ -1)) {
                        ii.field_U[var2] = ii.field_U[var2] + 1;
                        if (3 <= ii.field_U[var2]) {
                          ii.field_U[var2] = -2;
                          var2++;
                          continue L2;
                        } else {
                          var2++;
                          continue L2;
                        }
                      } else {
                        var2++;
                        continue L2;
                      }
                    }
                  }
                }
              }
              L3: {
                if (-298 <= m.field_h) {
                  break L3;
                } else {
                  if (326 <= m.field_h) {
                    break L3;
                  } else {
                    var1 = 14;
                    break L3;
                  }
                }
              }
              L4: {
                if (-1 == m.field_h % var1) {
                  L5: {
                    if (196 >= m.field_h) {
                      break L5;
                    } else {
                      if (-298 >= m.field_h) {
                        break L5;
                      } else {
                        L6: {
                          if (i.field_i) {
                            mg.field_q = mg.field_q - 1;
                            break L6;
                          } else {
                            mg.field_q = mg.field_q + 1;
                            break L6;
                          }
                        }
                        L7: {
                          if (!i.field_i) {
                            break L7;
                          } else {
                            if (-5 != mg.field_q) {
                              break L7;
                            } else {
                              i.field_i = false;
                              break L4;
                            }
                          }
                        }
                        if (mg.field_q == 6) {
                          i.field_i = true;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  L8: {
                    mg.field_q = mg.field_q + 1;
                    if (-197 >= (m.field_h ^ -1)) {
                      break L8;
                    } else {
                      if (mg.field_q == 4) {
                        mg.field_q = 0;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if ((m.field_h ^ -1) >= -305) {
                      break L9;
                    } else {
                      if ((m.field_h ^ -1) > -331) {
                        mg.field_q = 7;
                        break L4;
                      } else {
                        break L9;
                      }
                    }
                  }
                  if (mg.field_q < we.field_f.length) {
                    break L4;
                  } else {
                    mg.field_q = we.field_f.length - 1 + -3;
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
              L10: {
                if (102 >= m.field_h) {
                  break L10;
                } else {
                  var7 = 0;
                  var2 = var7;
                  var3 = (ki) (Object) bd.field_b.a((byte) -117);
                  L11: while (true) {
                    if (var3 == null) {
                      break L10;
                    } else {
                      L12: {
                        var4 = m.field_h - (102 + ck.field_g[var7]);
                        if ((var4 ^ -1) <= -1) {
                          L13: {
                            var5 = (float)var4 / 80.0f;
                            if (var5 < 1.0f) {
                              break L13;
                            } else {
                              var5 = 1.0f;
                              break L13;
                            }
                          }
                          L14: {
                            if (var5 >= 0.9700000286102295f) {
                              if ((ii.field_U[var7] ^ -1) != 0) {
                                break L14;
                              } else {
                                ii.field_U[var7] = 0;
                                cj.a((byte) 113, ke.field_h[5]);
                                break L14;
                              }
                            } else {
                              break L14;
                            }
                          }
                          var3.field_B = rl.field_c[var7][0] + (-rl.field_c[var7][0] + da.field_b[var7][0]) * var5;
                          var3.field_q = rl.field_c[var7][1] + (da.field_b[var7][1] - rl.field_c[var7][1]) * var5;
                          var7++;
                          break L12;
                        } else {
                          var7++;
                          break L12;
                        }
                      }
                      var3 = (ki) (Object) bd.field_b.d((byte) 63);
                      continue L11;
                    }
                  }
                }
              }
              L15: {
                if (param0 >= 120) {
                  break L15;
                } else {
                  field_p = null;
                  break L15;
                }
              }
              L16: {
                if (m.field_h == 330) {
                  cj.a((byte) -71, ke.field_h[14]);
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                if ((m.field_h ^ -1) != -375) {
                  break L17;
                } else {
                  cj.a((byte) -99, ke.field_h[12]);
                  break L17;
                }
              }
              L18: {
                if (m.field_h <= 424) {
                  stackOut_67_0 = 0;
                  stackIn_68_0 = stackOut_67_0;
                  break L18;
                } else {
                  stackOut_66_0 = 1;
                  stackIn_68_0 = stackOut_66_0;
                  break L18;
                }
              }
              return stackIn_68_0 != 0;
            }
          } else {
            L19: {
              if (oa.field_H == 13) {
                break L19;
              } else {
                if (oa.field_H == 83) {
                  break L19;
                } else {
                  if (-85 == (oa.field_H ^ -1)) {
                    break L19;
                  } else {
                    continue L0;
                  }
                }
              }
            }
            return true;
          }
        }
    }

    public static void f(int param0) {
        field_p = null;
        field_l = null;
        field_i = null;
        if (param0 != -13739) {
            return;
        }
        field_m = null;
    }

    final void e(int param0) {
        int var2 = 0;
        int var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (!(((pi) this).field_q == null)) {
            for (var2 = 0; var2 < ((pi) this).field_q.length; var2++) {
                ((pi) this).field_q[var2] = bd.a(((pi) this).field_q[var2], 32768);
            }
        }
        if (param0 != 0) {
            field_l = null;
        }
    }

    final String b(byte param0) {
        int var3 = 0;
        int var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 != -54) {
            pi.f(62);
        }
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (null == ((pi) this).field_n) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(((pi) this).field_n[0]);
        for (var3 = 1; ((pi) this).field_n.length > var3; var3++) {
            StringBuilder discarded$1 = var2.append("...");
            StringBuilder discarded$2 = var5.append(((pi) this).field_n[var3]);
        }
        return var2.toString();
    }

    pi() {
    }

    final static String a(byte param0, CharSequence param1) {
        if (param0 != 122) {
            Object var3 = null;
            String discarded$0 = pi.a((byte) -13, (CharSequence) null);
        }
        return wg.a(false, param1, 17212);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new Random();
        field_m = "Mouse over an icon for details";
        field_i = "Continue";
    }
}
