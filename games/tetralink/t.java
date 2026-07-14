/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class t {
    int field_i;
    private int[][] field_c;
    int[] field_k;
    byte[][] field_e;
    int field_v;
    int[][] field_a;
    int[] field_u;
    static df field_h;
    int[] field_j;
    qm[] field_n;
    int[] field_m;
    qm field_r;
    int[] field_d;
    static hl field_q;
    static int field_l;
    static int field_t;
    int field_f;
    static String field_p;
    private int[] field_g;
    private int field_s;
    static hl field_o;
    private byte[] field_b;

    final static de a(boolean param0, byte[] param1) {
        if (param0) {
            field_q = null;
        }
        if (param1 == null) {
            return null;
        }
        de var2 = new de(param1, qa.field_x, i.field_t, je.field_h, sn.field_e, ga.field_a);
        an.b(-100);
        return var2;
    }

    final static int a(int param0, int param1, String param2, String[] param3, jb param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        L0: {
          var14 = TetraLink.field_J;
          var6 = 72 % ((param1 - 53) / 49);
          var5 = param4.b(param2);
          if (var5 > param0) {
            break L0;
          } else {
            if (-1 == param2.indexOf("<br>")) {
              param3[0] = (String) (Object) param3;
              return 1;
            } else {
              break L0;
            }
          }
        }
        var7 = (var5 + param0 - 1) / param0;
        param0 = var5 / var7;
        var7 = 0;
        var8 = 0;
        var9 = param2.length();
        var10 = 0;
        L1: while (true) {
          if (var9 <= var10) {
            L2: {
              if (var9 <= var8) {
                break L2;
              } else {
                var7++;
                param3[var7] = param2.substring(var8, var9).trim();
                break L2;
              }
            }
            return var7;
          } else {
            L3: {
              L4: {
                var11 = param2.charAt(var10);
                if (32 == var11) {
                  break L4;
                } else {
                  if (var11 == 45) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              var12 = param2.substring(var8, 1 + var10).trim();
              var13 = param4.b(var12);
              if (var13 >= param0) {
                var8 = var10 - -1;
                var7++;
                param3[var7] = var12;
                break L3;
              } else {
                break L3;
              }
            }
            if (var11 == 62) {
              if (param2.regionMatches(-3 + var10, "<br>", 0, 4)) {
                var7++;
                param3[var7] = param2.substring(var8, -3 + var10).trim();
                var8 = 1 + var10;
                var10++;
                continue L1;
              } else {
                var10++;
                continue L1;
              }
            } else {
              var10++;
              continue L1;
            }
          }
        }
    }

    private final void a(byte[] param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        bh var17 = null;
        byte[] var21 = null;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        L0: {
          var16 = TetraLink.field_J;
          var17 = new bh(pk.a(param0, (byte) 94));
          var4 = var17.d((byte) -99);
          if (5 > var4) {
            break L0;
          } else {
            if (var4 >= -8) {
              L1: {
                if (-7 <= var4) {
                  ((t) this).field_f = var17.f(param1 + -128);
                  break L1;
                } else {
                  ((t) this).field_f = 0;
                  break L1;
                }
              }
              L2: {
                var5 = var17.d((byte) -99);
                if ((1 & var5) == 0) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              L3: {
                var6 = stackIn_10_0;
                if (var4 < 7) {
                  ((t) this).field_s = var17.e(127);
                  break L3;
                } else {
                  ((t) this).field_s = var17.c((byte) -40);
                  break L3;
                }
              }
              L4: {
                if ((var5 & 2) == 0) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L4;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L4;
                }
              }
              L5: {
                var7 = stackIn_16_0;
                var8 = 0;
                var9 = -1;
                ((t) this).field_j = new int[((t) this).field_s];
                if ((var4 ^ -1) > -8) {
                  var10 = 0;
                  L6: while (true) {
                    if (var10 >= ((t) this).field_s) {
                      break L5;
                    } else {
                      var8 = var8 + var17.e(127);
                      ((t) this).field_j[var10] = var8 + var17.e(127);
                      if (var9 < ((t) this).field_j[var10]) {
                        var9 = ((t) this).field_j[var10];
                        var10++;
                        continue L6;
                      } else {
                        var10++;
                        continue L6;
                      }
                    }
                  }
                } else {
                  var10 = 0;
                  L7: while (true) {
                    if (((t) this).field_s <= var10) {
                      break L5;
                    } else {
                      var8 = var8 + var17.c((byte) -40);
                      ((t) this).field_j[var10] = var8 + var17.c((byte) -40);
                      if (((t) this).field_j[var10] > var9) {
                        var9 = ((t) this).field_j[var10];
                        var10++;
                        continue L7;
                      } else {
                        var10++;
                        continue L7;
                      }
                    }
                  }
                }
              }
              L8: {
                ((t) this).field_i = var9 + 1;
                ((t) this).field_d = new int[((t) this).field_i];
                if (var7 == 0) {
                  break L8;
                } else {
                  ((t) this).field_e = new byte[((t) this).field_i][];
                  break L8;
                }
              }
              L9: {
                ((t) this).field_u = new int[((t) this).field_i];
                ((t) this).field_a = new int[((t) this).field_i][];
                ((t) this).field_k = new int[((t) this).field_i];
                ((t) this).field_m = new int[((t) this).field_i];
                if (var6 == 0) {
                  break L9;
                } else {
                  ((t) this).field_g = new int[((t) this).field_i];
                  var10 = 0;
                  L10: while (true) {
                    if (((t) this).field_i <= var10) {
                      var10 = 0;
                      L11: while (true) {
                        if (var10 >= ((t) this).field_s) {
                          ((t) this).field_r = new qm(((t) this).field_g);
                          break L9;
                        } else {
                          ((t) this).field_g[((t) this).field_j[var10]] = var17.f(param1 + -112);
                          var10++;
                          continue L11;
                        }
                      }
                    } else {
                      ((t) this).field_g[var10] = -1;
                      var10++;
                      continue L10;
                    }
                  }
                }
              }
              var10 = 0;
              L12: while (true) {
                if (((t) this).field_s <= var10) {
                  L13: {
                    if (var7 == 0) {
                      break L13;
                    } else {
                      var10 = 0;
                      L14: while (true) {
                        if (((t) this).field_s <= var10) {
                          break L13;
                        } else {
                          var21 = new byte[64];
                          var17.b(64, 0, var21, 126);
                          ((t) this).field_e[((t) this).field_j[var10]] = var21;
                          var10++;
                          continue L14;
                        }
                      }
                    }
                  }
                  var10 = param1;
                  L15: while (true) {
                    if (var10 >= ((t) this).field_s) {
                      L16: {
                        if ((var4 ^ -1) <= -8) {
                          var10 = 0;
                          L17: while (true) {
                            if (var10 >= ((t) this).field_s) {
                              var10 = 0;
                              L18: while (true) {
                                if (((t) this).field_s <= var10) {
                                  break L16;
                                } else {
                                  var11 = ((t) this).field_j[var10];
                                  var8 = 0;
                                  var12 = ((t) this).field_m[var11];
                                  var13 = -1;
                                  ((t) this).field_a[var11] = new int[var12];
                                  var14 = 0;
                                  L19: while (true) {
                                    if (var14 >= var12) {
                                      ((t) this).field_d[var11] = 1 + var13;
                                      if (var12 == var13 - -1) {
                                        ((t) this).field_a[var11] = null;
                                        var10++;
                                        continue L18;
                                      } else {
                                        var10++;
                                        continue L18;
                                      }
                                    } else {
                                      var8 = var8 + var17.c((byte) -40);
                                      ((t) this).field_a[var11][var14] = var8 + var17.c((byte) -40);
                                      var15 = var8 + var17.c((byte) -40);
                                      if (var15 > var13) {
                                        var13 = var15;
                                        var14++;
                                        continue L19;
                                      } else {
                                        var14++;
                                        continue L19;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              ((t) this).field_m[((t) this).field_j[var10]] = var17.c((byte) -40);
                              var10++;
                              continue L17;
                            }
                          }
                        } else {
                          var10 = 0;
                          L20: while (true) {
                            if (((t) this).field_s <= var10) {
                              var10 = 0;
                              L21: while (true) {
                                if (var10 >= ((t) this).field_s) {
                                  break L16;
                                } else {
                                  var11 = ((t) this).field_j[var10];
                                  var8 = 0;
                                  var12 = ((t) this).field_m[var11];
                                  var13 = -1;
                                  ((t) this).field_a[var11] = new int[var12];
                                  var14 = 0;
                                  L22: while (true) {
                                    if (var12 <= var14) {
                                      ((t) this).field_d[var11] = 1 + var13;
                                      if (var12 == var13 - -1) {
                                        ((t) this).field_a[var11] = null;
                                        var10++;
                                        continue L21;
                                      } else {
                                        var10++;
                                        continue L21;
                                      }
                                    } else {
                                      var8 = var8 + var17.e(127);
                                      ((t) this).field_a[var11][var14] = var8 + var17.e(127);
                                      var15 = var8 + var17.e(127);
                                      if (var13 < var15) {
                                        var13 = var15;
                                        var14++;
                                        continue L22;
                                      } else {
                                        var14++;
                                        continue L22;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              ((t) this).field_m[((t) this).field_j[var10]] = var17.e(127);
                              var10++;
                              continue L20;
                            }
                          }
                        }
                      }
                      L23: {
                        if (var6 != 0) {
                          ((t) this).field_c = new int[1 + var9][];
                          ((t) this).field_n = new qm[1 + var9];
                          var10 = 0;
                          L24: while (true) {
                            if (((t) this).field_s <= var10) {
                              break L23;
                            } else {
                              var11 = ((t) this).field_j[var10];
                              var12 = ((t) this).field_m[var11];
                              ((t) this).field_c[var11] = new int[((t) this).field_d[var11]];
                              var13 = 0;
                              L25: while (true) {
                                if (var13 >= ((t) this).field_d[var11]) {
                                  var13 = 0;
                                  L26: while (true) {
                                    if (var12 <= var13) {
                                      ((t) this).field_n[var11] = new qm(((t) this).field_c[var11]);
                                      var10++;
                                      continue L24;
                                    } else {
                                      L27: {
                                        if (((t) this).field_a[var11] == null) {
                                          var14 = var13;
                                          break L27;
                                        } else {
                                          var14 = ((t) this).field_a[var11][var13];
                                          break L27;
                                        }
                                      }
                                      ((t) this).field_c[var11][var14] = var17.f(-124);
                                      var13++;
                                      continue L26;
                                    }
                                  }
                                } else {
                                  ((t) this).field_c[var11][var13] = -1;
                                  var13++;
                                  continue L25;
                                }
                              }
                            }
                          }
                        } else {
                          break L23;
                        }
                      }
                      return;
                    } else {
                      ((t) this).field_k[((t) this).field_j[var10]] = var17.f(7);
                      var10++;
                      continue L15;
                    }
                  }
                } else {
                  ((t) this).field_u[((t) this).field_j[var10]] = var17.f(param1 + -109);
                  var10++;
                  continue L12;
                }
              }
            } else {
              break L0;
            }
          }
        }
        throw new RuntimeException();
    }

    final static void a(int param0, int param1) {
        if (param1 != 0) {
            return;
        }
        fk.field_W = param0;
    }

    final static void b(int param0, int param1) {
        int discarded$4 = bh.h((byte) -47);
        if (param1 != -21901) {
            field_p = null;
        }
    }

    final static void a(boolean param0, ie param1, long param2, int param3, int param4, int param5, int param6, int param7, int param8, byte param9, int param10, String param11, boolean param12, int param13) {
        try {
            kb.field_q = new bc(param4);
            nd.field_Lb = new bc(param7);
            wc.field_I = param3;
            oi.field_m = param5;
            mc.field_k = param12 ? true : false;
            tc.field_s = param2;
            if (param9 <= 29) {
                Object var16 = null;
                de discarded$0 = t.a(false, (byte[]) null);
            }
            pg.field_m = param0;
            wg.field_c = param10;
            lm.field_g = param13;
            ko.field_t = param8;
            oi.field_l = param1;
            rl.field_a = param6;
            pd.field_r = param11;
            if (oi.field_l.field_f != null) {
                try {
                    sk.field_f = new p(oi.field_l.field_f, 64, 0);
                } catch (IOException iOException) {
                    throw new RuntimeException(iOException.toString());
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_q = null;
        field_p = null;
        field_o = null;
        if (param0 < 75) {
            field_h = null;
        }
    }

    t(byte[] param0, int param1, byte[] param2) {
        int var4 = 0;
        ((t) this).field_v = ti.a(param0, (byte) 103, param0.length);
        if (((t) this).field_v != param1) {
            throw new RuntimeException();
        }
        if (param2 != null) {
            if (param2.length != 64) {
                throw new RuntimeException();
            }
            ((t) this).field_b = qb.a(param0, (byte) -89, param0.length, 0);
            for (var4 = 0; (var4 ^ -1) > -65; var4++) {
                if (((t) this).field_b[var4] != param2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.a(param0, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new df(3);
        field_p = "Try changing the following settings:  ";
        field_t = 0;
    }
}
