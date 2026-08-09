/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class rfa extends ug implements sia {
    static String field_B;
    static jea field_C;

    abstract boolean a(int param0, kh param1, byte param2);

    final void c(int param0) {
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        java.awt.Canvas var2 = kw.b((byte) -97);
        if (!(!wna.c(-127))) {
            fh.a(vka.A(90), var2, param0 ^ 0);
            return;
        }
        if (!(lla.field_b)) {
            dba.a(var2, (byte) 101);
            return;
        }
        if (!av.field_e) {
            if (!(vpa.a(109))) {
                ima.a(100.0f, th.field_u, -75);
                dba.a(var2, (byte) 111);
                return;
            }
        }
        cna.field_a = true;
        if (param0 != 0) {
            return;
        }
        for (var3 = -1 + kra.field_c.size(); -1 >= (var3 ^ -1); var3--) {
            ((sia) (kra.field_c.elementAt(var3))).b(param0 + 1);
        }
        if (!cna.field_a) {
            this.c(true);
        } else {
            pka.a(false);
            fga.a(0, false, 0, var2);
        }
    }

    final void a(eb param0, int param1) {
        try {
            dma.field_l = param0;
            this.b((byte) 106, true);
            if (param1 <= 34) {
                return;
            }
            try {
                this.s(-1);
                this.j(-13);
                this.o(9822);
                this.g((byte) -126);
                this.p(22);
                this.d((byte) 87);
                vca.field_c[9] = -1;
                vca.field_c[10] = -1;
                kra.field_c = new Vector();
                aca.a((sia) (this), 19711);
            } catch (RuntimeException runtimeException) {
                throw tba.a((Throwable) ((Object) runtimeException), "rfa.GB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected rfa() {
    }

    private final void c(boolean param0) {
        if (!param0) {
            field_B = (String) null;
        }
    }

    public abstract void a(boolean param0, boolean param1);

    public static void w(int param0) {
        field_C = null;
        if (param0 < 105) {
            iu[] var2 = (iu[]) null;
            rfa.a((iu[]) null, 100);
        }
        field_B = null;
    }

    abstract void b(int param0, int param1);

    private final void b(boolean param0) {
        int stackIn_3_0 = 0;
        int stackIn_38_0 = 0;
        Object stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        Object stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        int stackIn_47_2 = 0;
        int stackIn_63_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        sia var6;
        L0: {
          var5 = TombRacer.field_G ? 1 : 0;
          var2 = 0;
          if (param0) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = 1;
            break L0;
          }
        }
        L1: {
          if (lca.a(stackIn_3_0 != 0)) {
            this.a(param0, false);
            break L1;
          } else {
            if (!una.a((byte) 127)) {
              if (fja.h(105)) {
                L2: {
                  stackIn_46_0 = this;

                  stackIn_46_1 = -85;

                  if (null == dq.field_f) {
                    stackIn_47_0 = this;
                    stackIn_47_1 = stackIn_46_1;
                    stackIn_47_2 = 0;
                    break L2;
                  } else {
                    stackIn_47_0 = this;
                    stackIn_47_1 = stackIn_46_1;
                    stackIn_47_2 = 1;
                    break L2;
                  }
                }
                L3: {
                  var3 = this.a(stackIn_47_1, stackIn_47_2 != 0);
                  if ((var3 ^ -1) == -2) {
                    break L3;
                  } else {
                    if ((var3 ^ -1) == -3) {
                      break L3;
                    } else {
                      this.a(true, false);
                      break L1;
                    }
                  }
                }
                L4: {
                  if (dq.field_f == null) {
                    break L4;
                  } else {
                    og.b(0);
                    break L4;
                  }
                }
                L5: {
                  if (2 == var3) {
                    hha.a(di.a(110), (byte) -95);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                this.a(true, false);
                break L1;
              } else {
                if (ofa.d(true)) {
                  if (sr.a(119)) {
                    au.b(false);
                    break L1;
                  } else {
                    L6: {
                      var3 = kc.a(true);
                      if (var3 != 1) {
                        break L6;
                      } else {
                        ts.a((byte) -63, ura.field_a, true);
                        break L6;
                      }
                    }
                    this.a(true, false);
                    break L1;
                  }
                } else {
                  if (sr.a(125)) {
                    L7: {
                      if (param0) {
                        stackIn_38_0 = 0;
                        break L7;
                      } else {
                        stackIn_38_0 = 1;
                        break L7;
                      }
                    }
                    au.b(stackIn_38_0 != 0);
                    break L1;
                  } else {
                    var2 = 1;
                    var3 = -1;
                    L8: while (true) {
                      if (!es.a(true)) {
                        break L1;
                      } else {
                        L9: {
                          if (0 == (fna.field_h ^ -1)) {
                            if (fna.field_h != -1) {
                              break L9;
                            } else {
                              if (0 != (var3 ^ -1)) {
                                fna.field_h = var3;
                                var3 = -1;
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                          } else {
                            if (on.a((byte) 15, fna.field_h)) {
                              var3 = fna.field_h;
                              continue L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        var4 = 0;
                        L10: while (true) {
                          if (kra.field_c.size() <= var4) {
                            continue L8;
                          } else {
                            if (((sia) (kra.field_c.elementAt(var4))).a((byte) -72, kda.field_td, fna.field_h)) {
                              continue L8;
                            } else {
                              var4++;
                              continue L10;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            } else {
              if (sr.a(126)) {
                au.b(false);
                break L1;
              } else {
                var3 = vk.c(107);
                if (-3 != (var3 ^ -1)) {
                  if ((var3 ^ -1) == -4) {
                    in.a(-30600, true);
                    this.a(true, false);
                    break L1;
                  } else {
                    if (-5 == (var3 ^ -1)) {
                      ts.a((byte) -63, ck.field_b, false);
                      kpa.field_c = true;
                      this.a(true, false);
                      break L1;
                    } else {
                      this.a(true, false);
                      break L1;
                    }
                  }
                } else {
                  og.b(0);
                  break L1;
                }
              }
            }
          }
        }
        if (param0) {
          var3 = 0;
          L11: while (true) {
            if (kra.field_c.size() <= var3) {
              return;
            } else {
              L12: {
                var6 = (sia) (kra.field_c.elementAt(var3));
                var6.a(true, var2 != 0);
                stackIn_63_0 = var2;

                if (var6.a(-2)) {
                  stackIn_64_0 = stackIn_63_0;
                  stackIn_64_1 = 0;
                  break L12;
                } else {
                  stackIn_64_0 = stackIn_63_0;
                  stackIn_64_1 = 1;
                  break L12;
                }
              }
              var2 = stackIn_64_0 & stackIn_64_1;
              var3++;
              continue L11;
            }
          }
        } else {
          return;
        }
    }

    public abstract void b(int param0);

    public final boolean a(int param0) {
        if (param0 != -2) {
            field_C = (jea) null;
            return true;
        }
        return true;
    }

    final static iu[] a(iu[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        iu var3 = null;
        int var4 = 0;
        iu[] stackIn_3_0 = null;
        iu[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            if (param1 >= 111) {
              L1: while (true) {
                if (param0.length <= var2_int) {
                  stackIn_7_0 = (iu[]) (param0);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var3 = param0[var2_int];
                  param0[var2_int].field_p = 0;
                  var3.field_o = 0;
                  param0[var2_int].field_n = param0[var2_int].field_m;
                  param0[var2_int].field_k = param0[var2_int].field_q;
                  var2_int++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = (iu[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("rfa.HB(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_7_0;
        }
    }

    final void a(boolean param0) {
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int var2;
        int var3;
        int var4;
        cga var5;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          if (dq.field_f == null) {
            break L0;
          } else {
            if (!dq.field_f.field_b) {
              break L0;
            } else {
              og.b(0);
              vd.b(1);
              break L0;
            }
          }
        }
        L1: {
          stackIn_5_0 = this;

          stackIn_5_1 = -127;

          if (dq.field_f == null) {
            stackIn_6_0 = this;
            stackIn_6_1 = stackIn_5_1;
            stackIn_6_2 = 0;
            break L1;
          } else {
            stackIn_6_0 = this;
            stackIn_6_1 = stackIn_5_1;
            stackIn_6_2 = 1;
            break L1;
          }
        }
        L2: {
          this.c((byte) stackIn_6_1, stackIn_6_2 != 0);
          if (!lpa.field_w) {
            break L2;
          } else {
            dma.field_l.a((byte) -38);
            lpa.field_w = false;
            break L2;
          }
        }
        L3: {
          if (wna.c(-128)) {
            this.r(114);
            if (wna.c(-112)) {
              return;
            } else {
              break L3;
            }
          } else {
            break L3;
          }
        }
        L4: {
          this.u(97);
          if (!lla.field_b) {
            tc.a(pg.field_y, -2886);
            if (dma.field_l.b(-4171)) {
              dma.field_l.b((byte) -49);
              lla.field_b = true;
              break L4;
            } else {
              break L4;
            }
          } else {
            if (!av.field_e) {
              if (!vpa.a(84)) {
                if (!dma.field_l.a(-127)) {
                  break L4;
                } else {
                  av.field_e = true;
                  this.v(24230);
                  ln.A(116);
                  break L4;
                }
              } else {
                this.b(true);
                break L4;
              }
            } else {
              this.b(true);
              break L4;
            }
          }
        }
        L5: {
          if (vpa.a(66)) {
            break L5;
          } else {
            L6: while (true) {
              var5 = (cga) ((Object) sua.field_H.c(119));
              if (var5 == null) {
                break L5;
              } else {
                woa.a(4, var5, false);
                continue L6;
              }
            }
          }
        }
        L7: {
          dra.a(param0);
          vsa.c((byte) 120, 0);
          if (!uma.b(-1)) {
            break L7;
          } else {
            L8: {
              L9: {
                var2 = this.t(8);
                if (0 == var2) {
                  break L9;
                } else {
                  if ((var2 ^ -1) == -2) {
                    break L9;
                  } else {
                    break L8;
                  }
                }
              }
              this.b(var2, 120);
              break L8;
            }
            L10: {
              var3 = 0;
              if (var2 != 2) {
                break L10;
              } else {
                var3 = 1;
                break L10;
              }
            }
            L11: {
              if (!this.h((byte) 84)) {
                break L11;
              } else {
                var3 = 1;
                break L11;
              }
            }
            L12: {
              if (uma.b(-1)) {
                break L12;
              } else {
                var3 = 0;
                break L12;
              }
            }
            if (var3 != 0) {
              dw.b((byte) -16);
              break L7;
            } else {
              break L7;
            }
          }
        }
    }

    abstract void v(int param0);

    private final void u(int param0) {
        int var2;
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        var2 = 68 % ((param0 - 52) / 40);
        L0: while (true) {
          if (!cj.a(vca.field_c, 0)) {
            return;
          } else {
            if (!this.a(oka.field_z, vc.field_q, (byte) 105)) {
              this.m(-5);
              continue L0;
            } else {
              continue L0;
            }
          }
        }
    }

    public abstract boolean a(byte param0, char param1, int param2);

    abstract boolean h(byte param0);

    static {
    }
}
