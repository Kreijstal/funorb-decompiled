/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class al extends df {
    static String field_U;
    static String field_ab;
    static cj field_fb;
    private int field_S;
    private int field_Y;
    static String field_cb;
    static String field_W;
    static int field_bb;
    private int field_X;
    private int field_db;
    private int field_V;
    static ul field_eb;
    private int field_T;
    static int field_Z;

    final static void b(boolean param0, int param1) {
        try {
            Throwable var2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                Object discarded$1 = fo.a(jl.b(0), "resizing", (byte) 23, new Object[1]);
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var2 = decompiledCaughtException;
                break L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    void j(byte param0) {
        if (param0 > -70) {
            field_ab = null;
        }
    }

    boolean i(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var5 = 0;
        int var4 = 0;
        if (((al) this).field_db <= 0) {
        } else {
            var2 = ((al) this).field_V;
            var3 = ((al) this).field_Y;
            int fieldTemp$0 = ((al) this).field_S + 1;
            ((al) this).field_S = ((al) this).field_S + 1;
            if (fieldTemp$0 < ((al) this).field_db) {
                var4 = (((al) this).field_db * 2 - ((al) this).field_S) * ((al) this).field_S;
                var5 = ((al) this).field_db * ((al) this).field_db;
                var2 = var4 * (-((al) this).field_X + ((al) this).field_V) / var5 + ((al) this).field_X;
                var3 = ((al) this).field_T - -(var4 * (-((al) this).field_T + ((al) this).field_Y) / var5);
            } else {
                ((al) this).field_db = 0;
                ((al) this).j((byte) -101);
            }
            ((al) this).b(var2, var3, 117);
        }
        return super.i(-27388);
    }

    final static String k(int param0) {
        return s.field_e.f((byte) -24);
    }

    final static void j(int param0) {
        ch.field_e = false;
        nj.field_f = false;
        fb.a(-1, 99);
        id.field_B = mp.field_b;
        ta.field_hb = mp.field_b;
    }

    public static void i(byte param0) {
        field_U = null;
        field_cb = null;
        int var1 = 0;
        field_eb = null;
        field_ab = null;
        field_fb = null;
        field_W = null;
    }

    al(vk param0, int param1, int param2) {
        super(param0, param1, param2);
        ((al) this).field_S = 0;
        ((al) this).field_db = 0;
    }

    void a(boolean param0, int param1, int param2) {
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
        var16 = ZombieDawnMulti.field_E ? 1 : 0;
        oo.a(6 + param1, param2 + 35, -12 + ((al) this).field_n, ((al) this).field_w - 40, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 0;
        var8 = param2;
        L0: while (true) {
          if (var4 <= var7) {
            var5 = 194;
            var4 = 22;
            var6 = 169;
            var7 = 0;
            var8 = param2 - -35;
            L1: while (true) {
              if (var7 >= var4) {
                hq.field_e.g(-90 + param1 - -((al) this).field_n, 10 + param2);
                fk.a(param1 - -5, ((al) this).field_n + -10, param0, sn.field_Nb, 35 + param2);
                fk.a(param1, ((al) this).field_n, true, jh.field_Hb, ((al) this).field_w + param2 + -22);
                var5 = 169;
                var4 = ((al) this).field_w - 79;
                var6 = 127;
                var7 = 0;
                var8 = 57 + param2;
                L2: while (true) {
                  if (var7 >= var4) {
                    return;
                  } else {
                    var9 = (-var5 + var6) * var7 / var4 + var5;
                    var9 = var9 | (var9 << 8 | var9 << 16);
                    oo.b(param1, var8, 6, var9);
                    oo.b(((al) this).field_n + (param1 + -6), var8, 6, var9);
                    var8++;
                    var7++;
                    continue L2;
                  }
                }
              } else {
                var9 = var5 - -(var7 * (-var5 + var6) / var4);
                var9 = var9 | (var9 << 8 | var9 << 16);
                oo.b(param1, var8, 6, var9);
                oo.b(param1 + (((al) this).field_n + -6), var8, 6, var9);
                var8++;
                var7++;
                continue L1;
              }
            }
          } else {
            if (oo.field_e <= var8) {
              if (oo.field_d > var8) {
                L3: {
                  var9 = (-var5 + var6) * var7 / var4 + var5;
                  var10 = 0;
                  var11 = ((al) this).field_n;
                  if (var7 <= 20) {
                    L4: while (true) {
                      if (var10 > 20) {
                        break L3;
                      } else {
                        var12 = (-var10 + 20) * (20 - var10) + (-var7 + 20) * (20 + -var7);
                        if (var12 <= 462) {
                          if (var12 >= 420) {
                            var13 = var9 * (462 + -var12) / 42;
                            var13 = var13 | (var13 << 8 | var13 << 16);
                            oo.field_i[param1 + oo.field_b * var8 + var10] = var13;
                            var10++;
                            continue L4;
                          } else {
                            break L3;
                          }
                        } else {
                          var10++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                L5: {
                  if (var7 > 20) {
                    break L5;
                  } else {
                    var12 = var11;
                    var11 -= 21;
                    var13 = 0;
                    L6: while (true) {
                      L7: {
                        if (var13 > 20) {
                          break L7;
                        } else {
                          var14 = (20 + -var7) * (20 + -var7) + var13 * var13;
                          if (var14 <= 462) {
                            if (var14 < 420) {
                              var12 = 1 + var11;
                              var11++;
                              var13++;
                              continue L6;
                            } else {
                              var15 = (462 - var14) * var9 / 42;
                              var15 = var15 | (var15 << 16 | var15 << 8);
                              oo.field_i[var11 + (param1 + var8 * oo.field_b)] = var15;
                              var11++;
                              var13++;
                              continue L6;
                            }
                          } else {
                            break L7;
                          }
                        }
                      }
                      var11 = var12;
                      break L5;
                    }
                  }
                }
                var9 = var9 | (var9 << 8 | var9 << 16);
                oo.b(var10 + param1, var8, -var10 + var11, var9);
                var8++;
                var7++;
                continue L0;
              } else {
                var8++;
                var7++;
                continue L0;
              }
            } else {
              var8++;
              var7++;
              continue L0;
            }
          }
        }
    }

    final static int c(int param0, int param1, int param2) {
        if (null == er.field_j) {
            return -1;
        }
        if (param2 >= jp.field_d) {
            if (param2 < jp.field_d + er.field_j.field_x) {
                if (param0 >= cr.field_j) {
                    if (cr.field_j - -er.field_j.field_w > param0) {
                        return 0;
                    }
                }
            }
        }
        if (il.field_k <= param2) {
            if (param2 < il.field_k + er.field_j.field_x) {
                if (param0 >= sq.field_O) {
                    if (!(param0 >= sq.field_O - -er.field_j.field_w)) {
                        return 1;
                    }
                }
            }
        }
        return -1;
    }

    boolean h(int param0) {
        if (param0 != -6134) {
            field_U = null;
        }
        ((al) this).h((byte) 113);
        return super.h(-6134);
    }

    void h(byte param0) {
        if (param0 <= 29) {
            field_cb = null;
        }
        if (!(((al) this).field_db > 0)) {
            return;
        }
        ((al) this).b(((al) this).field_V, ((al) this).field_Y, 69);
        ((al) this).field_db = 0;
        ((al) this).j((byte) -116);
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (param0 <= 0) {
            ((al) this).b(param3, param2, 73);
            return;
        }
        ((al) this).field_V = param3;
        ((al) this).field_Y = param2;
        ((al) this).field_S = 0;
        ((al) this).field_T = ((al) this).field_w;
        if (param1 != -112) {
            boolean discarded$0 = ((al) this).h(20);
        }
        ((al) this).field_X = ((al) this).field_n;
        ((al) this).field_db = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ab = "More suggestions";
        field_W = "Friends";
        field_U = "Impose your will upon enemy zombies.";
        field_cb = "You have <%0> unread messages!";
    }
}
