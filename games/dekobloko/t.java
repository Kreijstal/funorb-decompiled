/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class t extends bl {
    private int field_db;
    private int field_gb;
    private int field_eb;
    static String field_bb;
    static String field_ib;
    private int field_jb;
    static String[] field_cb;
    private int field_hb;
    private int field_fb;

    boolean h(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (-1 > (((t) this).field_hb ^ -1)) {
            var2 = ((t) this).field_jb;
            var3 = ((t) this).field_gb;
            int fieldTemp$0 = ((t) this).field_eb + 1;
            ((t) this).field_eb = ((t) this).field_eb + 1;
            if (((t) this).field_hb <= fieldTemp$0) {
                ((t) this).field_hb = 0;
                ((t) this).j((byte) -52);
            } else {
                var4 = (-((t) this).field_eb + 2 * ((t) this).field_hb) * ((t) this).field_eb;
                var5 = ((t) this).field_hb * ((t) this).field_hb;
                var2 = var4 * (((t) this).field_jb + -((t) this).field_db) / var5 + ((t) this).field_db;
                var3 = ((t) this).field_fb + var4 * (-((t) this).field_fb + ((t) this).field_gb) / var5;
            }
            ((t) this).a(110, var2, var3);
        }
        if (param0 < 15) {
            return true;
        }
        return super.h((byte) 90);
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (param3 != 194) {
            ((t) this).b(35, 121, -128, 19);
        }
        if (param1 <= 0) {
            ((t) this).a(121, param0, param2);
            return;
        }
        ((t) this).field_hb = param1;
        ((t) this).field_gb = param2;
        ((t) this).field_db = ((t) this).field_t;
        ((t) this).field_fb = ((t) this).field_y;
        ((t) this).field_jb = param0;
        ((t) this).field_eb = 0;
    }

    final static void k(byte param0) {
        if (param0 != -73) {
            return;
        }
        de.field_W.c((ce) (Object) new lg(), (byte) 121);
    }

    void j(int param0) {
        if (!(((t) this).field_hb > 0)) {
            return;
        }
        ((t) this).a(112, ((t) this).field_jb, ((t) this).field_gb);
        ((t) this).field_hb = 0;
        ((t) this).j((byte) -32);
        int var2 = 40 % ((param0 - -15) / 49);
    }

    final static boolean i(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 124) {
            break L0;
          } else {
            field_bb = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (-11 < hc.field_d) {
              break L2;
            } else {
              if (-14 > ca.field_vb) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    t(ka param0, int param1, int param2) {
        super(param0, param1, param2);
        ((t) this).field_eb = 0;
        ((t) this).field_hb = 0;
    }

    boolean f(byte param0) {
        ((t) this).j(38);
        if (param0 < 77) {
            field_bb = null;
        }
        return super.f((byte) 125);
    }

    void j(byte param0) {
        int var2 = -128 % ((param0 - 30) / 39);
    }

    final static void a(int param0, boolean param1) {
        if (param0 < 104) {
            return;
        }
        uc.a(true, param1, 54);
    }

    void b(int param0, int param1, int param2) {
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
        var16 = client.field_A ? 1 : 0;
        if (param0 <= -127) {
          hk.d(6 + param2, 35 + param1, -12 + ((t) this).field_t, ((t) this).field_y - 40, 2105376, 0);
          var5 = 211;
          var4 = 35;
          var6 = 194;
          var7 = 0;
          var8 = param1;
          L0: while (true) {
            if (var4 <= var7) {
              var6 = 169;
              var4 = 22;
              var5 = 194;
              var7 = 0;
              var8 = param1 - -35;
              L1: while (true) {
                if (var7 >= var4) {
                  jm.field_q.c(-90 + (param2 - -((t) this).field_t), 10 + param1);
                  ng.a(c.field_m, -10 + ((t) this).field_t, param1 + 35, -1, 5 + param2);
                  ng.a(g.field_O, ((t) this).field_t, param1 + (((t) this).field_y + -22), -1, param2);
                  var4 = ((t) this).field_y + -79;
                  var5 = 169;
                  var6 = 127;
                  var7 = 0;
                  var8 = 57 + param1;
                  L2: while (true) {
                    if (var7 >= var4) {
                      return;
                    } else {
                      var9 = var5 - -(var7 * (var6 + -var5) / var4);
                      var9 = var9 | (var9 << 23526640 | var9 << 495246472);
                      hk.a(param2, var8, 6, var9);
                      hk.a(-6 + (((t) this).field_t + param2), var8, 6, var9);
                      var8++;
                      var7++;
                      continue L2;
                    }
                  }
                } else {
                  var9 = (-var5 + var6) * var7 / var4 + var5;
                  var9 = var9 | (var9 << -1910141936 | var9 << -1313540568);
                  hk.a(param2, var8, 6, var9);
                  hk.a(param2 + ((t) this).field_t + -6, var8, 6, var9);
                  var7++;
                  var8++;
                  continue L1;
                }
              }
            } else {
              if (hk.field_h <= var8) {
                if (hk.field_b > var8) {
                  L3: {
                    var9 = var5 - -((-var5 + var6) * var7 / var4);
                    var10 = 0;
                    var11 = ((t) this).field_t;
                    if (20 >= var7) {
                      L4: while (true) {
                        if ((var10 ^ -1) < -21) {
                          break L3;
                        } else {
                          var12 = (20 + -var7) * (-var7 + 20) - -((-var10 + 20) * (20 + -var10));
                          if (462 >= var12) {
                            if ((var12 ^ -1) <= -421) {
                              var13 = (-var12 + 462) * var9 / 42;
                              var13 = var13 | (var13 << 1261671240 | var13 << 720680144);
                              hk.field_l[hk.field_j * var8 - -param2 - -var10] = var13;
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
                    if (-21 <= (var7 ^ -1)) {
                      var12 = var11;
                      var11 -= 21;
                      var13 = 0;
                      L6: while (true) {
                        L7: {
                          if (20 < var13) {
                            break L7;
                          } else {
                            var14 = (-var7 + 20) * (20 + -var7) + var13 * var13;
                            if (-463 <= (var14 ^ -1)) {
                              if (420 > var14) {
                                var12 = var11 - -1;
                                var13++;
                                var11++;
                                continue L6;
                              } else {
                                var15 = (462 - var14) * var9 / 42;
                                var15 = var15 | (var15 << -1614545976 | var15 << -192934416);
                                hk.field_l[param2 + var8 * hk.field_j + var11] = var15;
                                var13++;
                                var11++;
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
                    } else {
                      break L5;
                    }
                  }
                  var9 = var9 | (var9 << -1835908592 | var9 << -1970200856);
                  hk.a(var10 + param2, var8, -var10 + var11, var9);
                  var7++;
                  var8++;
                  continue L0;
                } else {
                  var7++;
                  var8++;
                  continue L0;
                }
              } else {
                var7++;
                var8++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final static pi[] a(String param0, ji param1, boolean param2, String param3) {
        if (param2) {
            return null;
        }
        int var4 = param1.b(-1, param3);
        int var5 = param1.a(var4, 13030, param0);
        return on.a(var5, (byte) 37, var4, param1);
    }

    public static void l(byte param0) {
        field_bb = null;
        field_ib = null;
        if (param0 != 94) {
            Object var2 = null;
            pi[] discarded$0 = t.a((String) null, (ji) null, true, (String) null);
        }
        field_cb = null;
    }

    final static hm k(int param0) {
        try {
            Throwable var1 = null;
            hm stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            hm stackOut_2_0 = null;
            if (param0 == -22) {
              try {
                L0: {
                  stackOut_2_0 = (hm) Class.forName("ag").newInstance();
                  stackIn_3_0 = stackOut_2_0;
                  break L0;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = decompiledCaughtException;
                return null;
              }
              return stackIn_3_0;
            } else {
              return null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_bb = "Matching Score: ";
        field_ib = "Animals";
        field_cb = new String[255];
    }
}
