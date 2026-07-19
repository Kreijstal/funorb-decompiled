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
        eaa var2 = null;
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
        if (param0 != 17035) {
          var2 = (eaa) null;
          baa.a((eaa) null, true, -4, -1, -110, -21);
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
          return;
        } else {
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
          return;
        }
    }

    baa(gj param0, rn param1) {
        super(param0, param1);
        this.field_L = 0;
        this.field_N = false;
        this.field_x = -1;
        this.field_D = -1;
        try {
            this.field_B = param1;
            this.field_R = this.field_B.field_l.a(-27449, this.field_q);
            this.field_O = this.field_R.field_s.field_x;
            this.field_G = this.field_R.field_s.field_J;
            this.field_F = this.field_B.field_r;
            this.field_K = this.field_R.field_s.field_x;
            this.field_I = this.field_R.field_s.field_J;
            this.field_J = nha.field_a.a();
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "baa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean c(byte param0) {
        int fieldTemp$1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        aj var5 = null;
        if (!this.field_m.a((byte) -106)) {
          L0: {
            if (!this.field_N) {
              this.field_N = true;
              wf.a(6, (byte) -62);
              break L0;
            } else {
              break L0;
            }
          }
          var2 = 59 % ((param0 - 71) / 47);
          fieldTemp$1 = this.field_L - 1;
          this.field_L = this.field_L - 1;
          if (fieldTemp$1 < 0) {
            this.field_O = this.field_K;
            this.field_I = this.field_G;
            if (!this.d(-44)) {
              this.f(-126);
              return true;
            } else {
              this.a(this.field_K, this.field_G, this.field_R, 0);
              this.field_L = this.field_L + 6;
              var3 = (-this.field_O + this.field_K << 727605840) * (-this.field_L + 6) / 6 + (this.field_O << -914373360);
              var4 = (-this.field_L + 6) * (-this.field_I + this.field_G << -1891384752) / 6 + (this.field_I << 1240668816);
              var5 = this.field_q.field_s.a(false, var4, var3);
              var5.field_a = var5.field_a - this.field_q.field_s.field_B;
              var5.field_c = var5.field_c - this.field_q.field_s.field_b;
              this.field_q.field_s.c(2, -var5.field_a + 240, 320 + -var5.field_c);
              return false;
            }
          } else {
            var3 = (-this.field_O + this.field_K << 727605840) * (-this.field_L + 6) / 6 + (this.field_O << -914373360);
            var4 = (-this.field_L + 6) * (-this.field_I + this.field_G << -1891384752) / 6 + (this.field_I << 1240668816);
            var5 = this.field_q.field_s.a(false, var4, var3);
            var5.field_a = var5.field_a - this.field_q.field_s.field_B;
            var5.field_c = var5.field_c - this.field_q.field_s.field_b;
            this.field_q.field_s.c(2, -var5.field_a + 240, 320 + -var5.field_c);
            return false;
          }
        } else {
          return false;
        }
    }

    private final void f(int param0) {
        if (param0 > -98) {
            this.field_R = (ad) null;
            if (!(this.field_B.field_o.e(12917))) {
                throw new IllegalStateException();
            }
            return;
        }
        if (!(this.field_B.field_o.e(12917))) {
            throw new IllegalStateException();
        }
    }

    final static void a(eaa param0, boolean param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        rea var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        eaa var9 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                var9 = (eaa) null;
                baa.a((eaa) null, true, 50, 90, 110, 28);
                break L1;
              }
            }
            var6_ref = (rea) ((Object) param0.b((byte) 90));
            L2: while (true) {
              if (var6_ref == null) {
                break L0;
              } else {
                L3: {
                  var7 = (326565 * (int)var6_ref.field_j + 8357 * (int)var6_ref.field_m & 630) + (var6_ref.field_n >> 443562849);
                  param2 = var6_ref.field_i;
                  if (-257 > (var7 ^ -1)) {
                    var7 = 256;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                dg.d(((int)var6_ref.field_m * param5 >> 1746121648) + param3, -2 + param4 - (((int)var6_ref.field_j - (int)var6_ref.field_l) * param5 >> 1255465072), 5, param2);
                dg.f(param3 + (int)var6_ref.field_m, (int)var6_ref.field_l + param4 + -2, (-var6_ref.field_n + 128) / 12, param2, 256 + -var7 >> 1300669059);
                var6_ref = (rea) ((Object) param0.c(0));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var6);
            stackOut_10_1 = new StringBuilder().append("baa.C(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void g(int param0) {
        field_C = null;
        field_E = null;
        field_P = (byte[][]) null;
        int var1 = -80 / ((68 - param0) / 43);
        field_v = null;
        field_y = null;
        field_z = null;
        field_A = null;
    }

    private final boolean d(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = BachelorFridge.field_y;
        if (param0 <= -8) {
          if (this.field_w) {
            if (this.field_O == this.field_R.field_s.field_x) {
              if (this.field_I == this.field_R.field_s.field_J) {
                return false;
              } else {
                L0: while (true) {
                  L1: {
                    this.field_K = this.field_O;
                    this.field_G = this.field_I;
                    var2 = this.field_F;
                    if (2 != var2) {
                      if (-5 != (var2 ^ -1)) {
                        if (1 != var2) {
                          if (var2 == 3) {
                            this.field_G = this.field_G + 1;
                            break L1;
                          } else {
                            throw new IllegalStateException();
                          }
                        } else {
                          this.field_G = this.field_G - 1;
                          break L1;
                        }
                      } else {
                        this.field_K = this.field_K + 1;
                        break L1;
                      }
                    } else {
                      this.field_K = this.field_K - 1;
                      break L1;
                    }
                  }
                  L2: {
                    var2 = 0;
                    if (-1 >= (this.field_K ^ -1)) {
                      break L2;
                    } else {
                      this.field_F = 3;
                      var2 = 1;
                      break L2;
                    }
                  }
                  L3: {
                    if (this.field_q.field_h.field_z <= this.field_K) {
                      var2 = 1;
                      this.field_F = 1;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (-1 < (this.field_G ^ -1)) {
                      this.field_F = 2;
                      var2 = 1;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (this.field_G < this.field_q.field_h.field_B) {
                      break L5;
                    } else {
                      var2 = 1;
                      this.field_F = 4;
                      break L5;
                    }
                  }
                  if (var2 != 0) {
                    if (this.field_w) {
                      continue L0;
                    } else {
                      this.field_x = this.field_I;
                      this.field_D = this.field_O;
                      this.field_w = true;
                      continue L0;
                    }
                  } else {
                    L6: {
                      if (!this.field_w) {
                        break L6;
                      } else {
                        if (this.field_D != this.field_K) {
                          break L6;
                        } else {
                          if (this.field_x != this.field_G) {
                            break L6;
                          } else {
                            this.field_F = ov.b(this.field_B.field_r, 60);
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
                  this.field_K = this.field_O;
                  this.field_G = this.field_I;
                  var2 = this.field_F;
                  if (2 != var2) {
                    if (-5 != (var2 ^ -1)) {
                      if (1 != var2) {
                        if (var2 == 3) {
                          this.field_G = this.field_G + 1;
                          break L8;
                        } else {
                          throw new IllegalStateException();
                        }
                      } else {
                        this.field_G = this.field_G - 1;
                        break L8;
                      }
                    } else {
                      this.field_K = this.field_K + 1;
                      break L8;
                    }
                  } else {
                    this.field_K = this.field_K - 1;
                    break L8;
                  }
                }
                L9: {
                  var2 = 0;
                  if (-1 >= (this.field_K ^ -1)) {
                    break L9;
                  } else {
                    this.field_F = 3;
                    var2 = 1;
                    break L9;
                  }
                }
                L10: {
                  if (this.field_q.field_h.field_z <= this.field_K) {
                    var2 = 1;
                    this.field_F = 1;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (-1 < (this.field_G ^ -1)) {
                    this.field_F = 2;
                    var2 = 1;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (this.field_G < this.field_q.field_h.field_B) {
                    break L12;
                  } else {
                    var2 = 1;
                    this.field_F = 4;
                    break L12;
                  }
                }
                if (var2 != 0) {
                  if (this.field_w) {
                    continue L7;
                  } else {
                    this.field_x = this.field_I;
                    this.field_D = this.field_O;
                    this.field_w = true;
                    continue L7;
                  }
                } else {
                  if (this.field_w) {
                    if (this.field_D == this.field_K) {
                      if (this.field_x != this.field_G) {
                        return true;
                      } else {
                        this.field_F = ov.b(this.field_B.field_r, 60);
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
                this.field_K = this.field_O;
                this.field_G = this.field_I;
                var2 = this.field_F;
                if (2 != var2) {
                  if (-5 != (var2 ^ -1)) {
                    if (1 != var2) {
                      if (var2 == 3) {
                        this.field_G = this.field_G + 1;
                        break L14;
                      } else {
                        throw new IllegalStateException();
                      }
                    } else {
                      this.field_G = this.field_G - 1;
                      break L14;
                    }
                  } else {
                    this.field_K = this.field_K + 1;
                    break L14;
                  }
                } else {
                  this.field_K = this.field_K - 1;
                  break L14;
                }
              }
              L15: {
                var2 = 0;
                if (-1 >= (this.field_K ^ -1)) {
                  break L15;
                } else {
                  this.field_F = 3;
                  var2 = 1;
                  break L15;
                }
              }
              L16: {
                if (this.field_q.field_h.field_z <= this.field_K) {
                  var2 = 1;
                  this.field_F = 1;
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                if (-1 < (this.field_G ^ -1)) {
                  this.field_F = 2;
                  var2 = 1;
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if (this.field_G < this.field_q.field_h.field_B) {
                  break L18;
                } else {
                  var2 = 1;
                  this.field_F = 4;
                  break L18;
                }
              }
              if (var2 != 0) {
                if (this.field_w) {
                  continue L13;
                } else {
                  this.field_x = this.field_I;
                  this.field_D = this.field_O;
                  this.field_w = true;
                  continue L13;
                }
              } else {
                if (this.field_w) {
                  if (this.field_D == this.field_K) {
                    if (this.field_x == this.field_G) {
                      this.field_F = ov.b(this.field_B.field_r, 60);
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
        } else {
          return true;
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
        if (!this.field_m.a((byte) -106)) {
          if (!this.field_f) {
            var2 = (this.field_K << -9776816) - -((-this.field_K + this.field_O << 1591830736) * this.field_L / 6);
            if (param0 >= -10) {
              this.field_J = (kv) null;
              var3 = this.field_L * (this.field_I - this.field_G << -66542384) / 6 + (this.field_G << 1151195088);
              var8 = this.field_q.field_s.a(false, var3, var2);
              var5 = 16;
              var6 = 64 + -(var5 >> -1688115774);
              var7 = 48 + -(var5 >> -1489052254);
              nk.a(this.field_q.field_s.field_y, -(var6 >> -1776169727) + var8.field_c - -64, -(var7 >> 1346943809) + (var8.field_a + 24), var6, var7);
              this.field_J.a(vr.field_b << -1566403348, -var5 + -20 + var8.field_a, 64 + var8.field_c, -1049413117, 3072);
              return;
            } else {
              var3 = this.field_L * (this.field_I - this.field_G << -66542384) / 6 + (this.field_G << 1151195088);
              var9 = this.field_q.field_s.a(false, var3, var2);
              var5 = 16;
              var6 = 64 + -(var5 >> -1688115774);
              var7 = 48 + -(var5 >> -1489052254);
              nk.a(this.field_q.field_s.field_y, -(var6 >> -1776169727) + var9.field_c - -64, -(var7 >> 1346943809) + (var9.field_a + 24), var6, var7);
              this.field_J.a(vr.field_b << -1566403348, -var5 + -20 + var9.field_a, 64 + var9.field_c, -1049413117, 3072);
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
        field_Q = 2;
        field_v = new Random();
        field_C = new long[32];
        field_E = "Pause Menu";
        field_A = "Add friend";
    }
}
