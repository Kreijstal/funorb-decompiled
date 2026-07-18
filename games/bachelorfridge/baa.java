/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class baa extends ana {
    private int field_I;
    static int field_Q;
    private kv field_J;
    private int field_L;
    private int field_O;
    private boolean field_N;
    private int field_K;
    private boolean field_w;
    static Random field_v;
    private int field_D;
    private int field_x;
    private int field_F;
    private rn field_B;
    private int field_G;
    static kv field_y;
    static int[] field_z;
    static long[] field_C;
    private ad field_R;
    static String field_A;
    static String field_E;
    static byte[][] field_P;

    final static void e(int param0) {
        bn.field_h = null;
        nw.field_p = null;
        jla.field_d = null;
        a.field_n = null;
        cga.field_r = null;
        bla.field_p = null;
        wq.field_k = null;
        ew.field_q = null;
        gg.field_a = null;
        gba.field_xb = null;
        iq.field_l = null;
        dc.field_y = null;
        wd.field_w = null;
        kja.field_e = null;
        an.field_r = null;
        vl.field_c = null;
        ps.field_q = null;
        pja.field_b = null;
        ca.field_c = null;
        gq.field_E = null;
        wa.field_n = null;
        kaa.field_l = null;
        jf.field_l = null;
        hh.field_b = null;
        lfa.field_s = null;
        ska.field_k = null;
        pw.field_y = null;
        eq.field_b = null;
        us.field_b = null;
        op.field_I = null;
        nia.field_l = null;
        a.field_o = null;
        fba.field_a = null;
        tq.field_g = null;
        cka.field_y = null;
        hl.field_D = null;
        rj.field_l = null;
        dr.field_p = null;
        ln.field_v = null;
        bna.field_v = null;
        bn.field_i = null;
        nma.field_v = null;
        mq.field_b = null;
        wja.field_l = null;
        ada.field_m = null;
        Runtime.getRuntime().gc();
    }

    baa(gj param0, rn param1) {
        super(param0, (bca) (Object) param1);
        ((baa) this).field_L = 0;
        ((baa) this).field_N = false;
        ((baa) this).field_x = -1;
        ((baa) this).field_D = -1;
        try {
            ((baa) this).field_B = param1;
            ((baa) this).field_R = ((baa) this).field_B.field_l.a(-27449, ((baa) this).field_q);
            ((baa) this).field_O = ((baa) this).field_R.field_s.field_x;
            ((baa) this).field_G = ((baa) this).field_R.field_s.field_J;
            ((baa) this).field_F = ((baa) this).field_B.field_r;
            ((baa) this).field_K = ((baa) this).field_R.field_s.field_x;
            ((baa) this).field_I = ((baa) this).field_R.field_s.field_J;
            ((baa) this).field_J = nha.field_a.a();
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "baa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        aj var5 = null;
        if (!((baa) this).field_m.a((byte) -106)) {
          L0: {
            if (!((baa) this).field_N) {
              ((baa) this).field_N = true;
              wf.a(6, (byte) -62);
              break L0;
            } else {
              break L0;
            }
          }
          var2 = 59 % ((param0 - 71) / 47);
          int fieldTemp$1 = ((baa) this).field_L - 1;
          ((baa) this).field_L = ((baa) this).field_L - 1;
          if (fieldTemp$1 < 0) {
            ((baa) this).field_O = ((baa) this).field_K;
            ((baa) this).field_I = ((baa) this).field_G;
            if (!this.d(-44)) {
              this.f(-126);
              return true;
            } else {
              ((baa) this).a(((baa) this).field_K, ((baa) this).field_G, ((baa) this).field_R, 0);
              ((baa) this).field_L = ((baa) this).field_L + 6;
              var3 = (-((baa) this).field_O + ((baa) this).field_K << 16) * (-((baa) this).field_L + 6) / 6 + (((baa) this).field_O << 16);
              var4 = (-((baa) this).field_L + 6) * (-((baa) this).field_I + ((baa) this).field_G << 16) / 6 + (((baa) this).field_I << 16);
              var5 = ((baa) this).field_q.field_s.a(false, var4, var3);
              var5.field_a = var5.field_a - ((baa) this).field_q.field_s.field_B;
              var5.field_c = var5.field_c - ((baa) this).field_q.field_s.field_b;
              ((baa) this).field_q.field_s.c(2, -var5.field_a + 240, 320 + -var5.field_c);
              return false;
            }
          } else {
            var3 = (-((baa) this).field_O + ((baa) this).field_K << 16) * (-((baa) this).field_L + 6) / 6 + (((baa) this).field_O << 16);
            var4 = (-((baa) this).field_L + 6) * (-((baa) this).field_I + ((baa) this).field_G << 16) / 6 + (((baa) this).field_I << 16);
            var5 = ((baa) this).field_q.field_s.a(false, var4, var3);
            var5.field_a = var5.field_a - ((baa) this).field_q.field_s.field_B;
            var5.field_c = var5.field_c - ((baa) this).field_q.field_s.field_b;
            ((baa) this).field_q.field_s.c(2, -var5.field_a + 240, 320 + -var5.field_c);
            return false;
          }
        } else {
          return false;
        }
    }

    private final void f(int param0) {
        if (!(((baa) this).field_B.field_o.e(12917))) {
            throw new IllegalStateException();
        }
    }

    final static void a(eaa param0, boolean param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        rea var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            var6_ref = (rea) (Object) param0.b((byte) 90);
            L1: while (true) {
              if (var6_ref == null) {
                break L0;
              } else {
                L2: {
                  var7 = (326565 * (int)var6_ref.field_j + 8357 * (int)var6_ref.field_m & 630) + (var6_ref.field_n >> 1);
                  param2 = var6_ref.field_i;
                  if (var7 > 256) {
                    var7 = 256;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                dg.d(((int)var6_ref.field_m * 10 >> 16) + param3, -2 + param4 - (((int)var6_ref.field_j - (int)var6_ref.field_l) * 10 >> 16), 5, param2);
                dg.f(param3 + (int)var6_ref.field_m, (int)var6_ref.field_l + param4 + -2, (-var6_ref.field_n + 128) / 12, param2, 256 + -var7 >> 3);
                var6_ref = (rea) (Object) param0.c(0);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var6;
            stackOut_8_1 = new StringBuilder().append("baa.C(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + true + ',' + param2 + ',' + param3 + ',' + param4 + ',' + 10 + ')');
        }
    }

    public static void g(int param0) {
        field_C = null;
        field_E = null;
        field_P = null;
        int var1 = -20;
        field_v = null;
        field_y = null;
        field_z = null;
        field_A = null;
    }

    private final boolean d(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = BachelorFridge.field_y;
        if (((baa) this).field_w) {
          if (((baa) this).field_O == ((baa) this).field_R.field_s.field_x) {
            if (((baa) this).field_I == ((baa) this).field_R.field_s.field_J) {
              return false;
            } else {
              L0: while (true) {
                L1: {
                  ((baa) this).field_K = ((baa) this).field_O;
                  ((baa) this).field_G = ((baa) this).field_I;
                  var2 = ((baa) this).field_F;
                  if (2 != var2) {
                    if (var2 != 4) {
                      if (1 != var2) {
                        if (var2 == 3) {
                          ((baa) this).field_G = ((baa) this).field_G + 1;
                          break L1;
                        } else {
                          throw new IllegalStateException();
                        }
                      } else {
                        ((baa) this).field_G = ((baa) this).field_G - 1;
                        break L1;
                      }
                    } else {
                      ((baa) this).field_K = ((baa) this).field_K + 1;
                      break L1;
                    }
                  } else {
                    ((baa) this).field_K = ((baa) this).field_K - 1;
                    break L1;
                  }
                }
                L2: {
                  var2 = 0;
                  if (((baa) this).field_K >= 0) {
                    break L2;
                  } else {
                    ((baa) this).field_F = 3;
                    var2 = 1;
                    break L2;
                  }
                }
                L3: {
                  if (((baa) this).field_q.field_h.field_z <= ((baa) this).field_K) {
                    var2 = 1;
                    ((baa) this).field_F = 1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (((baa) this).field_G < 0) {
                    ((baa) this).field_F = 2;
                    var2 = 1;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (((baa) this).field_G < ((baa) this).field_q.field_h.field_B) {
                    break L5;
                  } else {
                    var2 = 1;
                    ((baa) this).field_F = 4;
                    break L5;
                  }
                }
                if (var2 != 0) {
                  if (((baa) this).field_w) {
                    continue L0;
                  } else {
                    ((baa) this).field_x = ((baa) this).field_I;
                    ((baa) this).field_D = ((baa) this).field_O;
                    ((baa) this).field_w = true;
                    continue L0;
                  }
                } else {
                  L6: {
                    if (!((baa) this).field_w) {
                      break L6;
                    } else {
                      if (((baa) this).field_D != ((baa) this).field_K) {
                        break L6;
                      } else {
                        if (((baa) this).field_x != ((baa) this).field_G) {
                          break L6;
                        } else {
                          ((baa) this).field_F = ov.b(((baa) this).field_B.field_r, 60);
                          return true;
                        }
                      }
                    }
                  }
                  return true;
                }
              }
            }
          } else {
            L7: while (true) {
              L8: {
                ((baa) this).field_K = ((baa) this).field_O;
                ((baa) this).field_G = ((baa) this).field_I;
                var2 = ((baa) this).field_F;
                if (2 != var2) {
                  if (var2 != 4) {
                    if (1 != var2) {
                      if (var2 == 3) {
                        ((baa) this).field_G = ((baa) this).field_G + 1;
                        break L8;
                      } else {
                        throw new IllegalStateException();
                      }
                    } else {
                      ((baa) this).field_G = ((baa) this).field_G - 1;
                      break L8;
                    }
                  } else {
                    ((baa) this).field_K = ((baa) this).field_K + 1;
                    break L8;
                  }
                } else {
                  ((baa) this).field_K = ((baa) this).field_K - 1;
                  break L8;
                }
              }
              L9: {
                var2 = 0;
                if (((baa) this).field_K >= 0) {
                  break L9;
                } else {
                  ((baa) this).field_F = 3;
                  var2 = 1;
                  break L9;
                }
              }
              L10: {
                if (((baa) this).field_q.field_h.field_z <= ((baa) this).field_K) {
                  var2 = 1;
                  ((baa) this).field_F = 1;
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (((baa) this).field_G < 0) {
                  ((baa) this).field_F = 2;
                  var2 = 1;
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (((baa) this).field_G < ((baa) this).field_q.field_h.field_B) {
                  break L12;
                } else {
                  var2 = 1;
                  ((baa) this).field_F = 4;
                  break L12;
                }
              }
              if (var2 != 0) {
                if (((baa) this).field_w) {
                  continue L7;
                } else {
                  ((baa) this).field_x = ((baa) this).field_I;
                  ((baa) this).field_D = ((baa) this).field_O;
                  ((baa) this).field_w = true;
                  continue L7;
                }
              } else {
                if (((baa) this).field_w) {
                  if (((baa) this).field_D == ((baa) this).field_K) {
                    if (((baa) this).field_x != ((baa) this).field_G) {
                      return true;
                    } else {
                      ((baa) this).field_F = ov.b(((baa) this).field_B.field_r, 60);
                      return true;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              }
            }
          }
        } else {
          L13: while (true) {
            L14: {
              ((baa) this).field_K = ((baa) this).field_O;
              ((baa) this).field_G = ((baa) this).field_I;
              var2 = ((baa) this).field_F;
              if (2 != var2) {
                if (var2 != 4) {
                  if (1 != var2) {
                    if (var2 == 3) {
                      ((baa) this).field_G = ((baa) this).field_G + 1;
                      break L14;
                    } else {
                      throw new IllegalStateException();
                    }
                  } else {
                    ((baa) this).field_G = ((baa) this).field_G - 1;
                    break L14;
                  }
                } else {
                  ((baa) this).field_K = ((baa) this).field_K + 1;
                  break L14;
                }
              } else {
                ((baa) this).field_K = ((baa) this).field_K - 1;
                break L14;
              }
            }
            L15: {
              var2 = 0;
              if (((baa) this).field_K >= 0) {
                break L15;
              } else {
                ((baa) this).field_F = 3;
                var2 = 1;
                break L15;
              }
            }
            L16: {
              if (((baa) this).field_q.field_h.field_z <= ((baa) this).field_K) {
                var2 = 1;
                ((baa) this).field_F = 1;
                break L16;
              } else {
                break L16;
              }
            }
            L17: {
              if (((baa) this).field_G < 0) {
                ((baa) this).field_F = 2;
                var2 = 1;
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              if (((baa) this).field_G < ((baa) this).field_q.field_h.field_B) {
                break L18;
              } else {
                var2 = 1;
                ((baa) this).field_F = 4;
                break L18;
              }
            }
            if (var2 != 0) {
              if (((baa) this).field_w) {
                continue L13;
              } else {
                ((baa) this).field_x = ((baa) this).field_I;
                ((baa) this).field_D = ((baa) this).field_O;
                ((baa) this).field_w = true;
                continue L13;
              }
            } else {
              if (((baa) this).field_w) {
                if (((baa) this).field_D == ((baa) this).field_K) {
                  if (((baa) this).field_x == ((baa) this).field_G) {
                    ((baa) this).field_F = ov.b(((baa) this).field_B.field_r, 60);
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            }
          }
        }
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        aj var8 = null;
        aj var9 = null;
        if (!((baa) this).field_m.a((byte) -106)) {
          if (!((baa) this).field_f) {
            var2 = (((baa) this).field_K << 16) - -((-((baa) this).field_K + ((baa) this).field_O << 16) * ((baa) this).field_L / 6);
            if (param0 >= -10) {
              ((baa) this).field_J = null;
              var3 = ((baa) this).field_L * (((baa) this).field_I - ((baa) this).field_G << 16) / 6 + (((baa) this).field_G << 16);
              var8 = ((baa) this).field_q.field_s.a(false, var3, var2);
              var5 = 16;
              var6 = 64 + -(var5 >> 2);
              var7 = 48 + -(var5 >> 2);
              nk.a(((baa) this).field_q.field_s.field_y, -(var6 >> 1) + var8.field_c - -64, -(var7 >> 1) + (var8.field_a + 24), var6, var7);
              ((baa) this).field_J.a(vr.field_b << 12, -var5 + -20 + var8.field_a, 64 + var8.field_c, -1049413117, 3072);
              return;
            } else {
              var3 = ((baa) this).field_L * (((baa) this).field_I - ((baa) this).field_G << 16) / 6 + (((baa) this).field_G << 16);
              var9 = ((baa) this).field_q.field_s.a(false, var3, var2);
              var5 = 16;
              var6 = 64 + -(var5 >> 2);
              var7 = 48 + -(var5 >> 2);
              nk.a(((baa) this).field_q.field_s.field_y, -(var6 >> 1) + var9.field_c - -64, -(var7 >> 1) + (var9.field_a + 24), var6, var7);
              ((baa) this).field_J.a(vr.field_b << 12, -var5 + -20 + var9.field_a, 64 + var9.field_c, -1049413117, 3072);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Q = 2;
        field_v = new Random();
        field_C = new long[32];
        field_E = "Pause Menu";
        field_A = "Add friend";
    }
}
