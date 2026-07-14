/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class rfa extends ug implements sia {
    static String field_B;
    static jea field_C;

    abstract boolean a(int param0, kh param1, byte param2);

    final void c(int param0) {
        java.awt.Canvas var2 = null;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        var2 = kw.b((byte) -97);
        if (wna.c(-127)) {
          fh.a(vka.A(90), var2, param0 ^ 0);
          return;
        } else {
          dba.a(var2, (byte) 101);
          return;
        }
    }

    final void a(eb param0, int param1) {
        dma.field_l = param0;
        ((rfa) this).b((byte) 106, true);
        if (param1 <= 34) {
            return;
        }
        ((rfa) this).s(-1);
        ((rfa) this).j(-13);
        ((rfa) this).o(9822);
        ((rfa) this).g((byte) -126);
        ((rfa) this).p(22);
        ((rfa) this).d((byte) 87);
        vca.field_c[9] = -1;
        vca.field_c[10] = -1;
        kra.field_c = new Vector();
        aca.a((sia) this, 19711);
    }

    protected rfa() {
    }

    private final void c(boolean param0) {
        L0: {
          if (param0) {
            break L0;
          } else {
            field_B = null;
            break L0;
          }
        }
    }

    public abstract void a(boolean param0, boolean param1);

    public static void w(int param0) {
        field_C = null;
        if (param0 < 105) {
            Object var2 = null;
            iu[] discarded$0 = rfa.a((iu[]) null, 100);
        }
        field_B = null;
    }

    abstract void b(int param0, int param1);

    private final void b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        sia var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_40_0 = 0;
        Object stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        Object stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        Object stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        int stackIn_65_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        Object stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        Object stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        Object stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        int stackOut_48_2 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_66_1 = 0;
        int stackOut_65_0 = 0;
        int stackOut_65_1 = 0;
        L0: {
          var5 = TombRacer.field_G ? 1 : 0;
          var2 = 0;
          if (param0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          if (lca.a(stackIn_3_0 != 0)) {
            ((rfa) this).a(param0, false);
            break L1;
          } else {
            if (!una.a((byte) 127)) {
              if (fja.h(105)) {
                L2: {
                  stackOut_47_0 = this;
                  stackOut_47_1 = -85;
                  stackIn_49_0 = stackOut_47_0;
                  stackIn_49_1 = stackOut_47_1;
                  stackIn_48_0 = stackOut_47_0;
                  stackIn_48_1 = stackOut_47_1;
                  if (null == dq.field_f) {
                    stackOut_49_0 = this;
                    stackOut_49_1 = stackIn_49_1;
                    stackOut_49_2 = 0;
                    stackIn_50_0 = stackOut_49_0;
                    stackIn_50_1 = stackOut_49_1;
                    stackIn_50_2 = stackOut_49_2;
                    break L2;
                  } else {
                    stackOut_48_0 = this;
                    stackOut_48_1 = stackIn_48_1;
                    stackOut_48_2 = 1;
                    stackIn_50_0 = stackOut_48_0;
                    stackIn_50_1 = stackOut_48_1;
                    stackIn_50_2 = stackOut_48_2;
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var3 = ((rfa) this).a(stackIn_50_1, stackIn_50_2 != 0);
                    if ((var3 ^ -1) == -2) {
                      break L4;
                    } else {
                      if ((var3 ^ -1) == -3) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L5: {
                    if (dq.field_f == null) {
                      break L5;
                    } else {
                      og.b(0);
                      break L5;
                    }
                  }
                  if (2 == var3) {
                    hha.a(di.a(110), (byte) -95);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                ((rfa) this).a(true, false);
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
                    ((rfa) this).a(true, false);
                    break L1;
                  }
                } else {
                  if (sr.a(125)) {
                    L7: {
                      if (param0) {
                        stackOut_39_0 = 0;
                        stackIn_40_0 = stackOut_39_0;
                        break L7;
                      } else {
                        stackOut_38_0 = 1;
                        stackIn_40_0 = stackOut_38_0;
                        break L7;
                      }
                    }
                    au.b(stackIn_40_0 != 0);
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
                          L11: {
                            if ((kra.field_c.size() ^ -1) >= (var4 ^ -1)) {
                              break L11;
                            } else {
                              if (((sia) kra.field_c.elementAt(var4)).a((byte) -72, kda.field_td, fna.field_h)) {
                                break L11;
                              } else {
                                var4++;
                                continue L10;
                              }
                            }
                          }
                          continue L8;
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
                L12: {
                  var3 = vk.c(107);
                  if (-3 != (var3 ^ -1)) {
                    if ((var3 ^ -1) == -4) {
                      in.a(-30600, true);
                      break L12;
                    } else {
                      if (-5 == (var3 ^ -1)) {
                        ts.a((byte) -63, ck.field_b, false);
                        kpa.field_c = true;
                        break L12;
                      } else {
                        ((rfa) this).a(true, false);
                        break L1;
                      }
                    }
                  } else {
                    og.b(0);
                    break L12;
                  }
                }
                ((rfa) this).a(true, false);
                break L1;
              }
            }
          }
        }
        if (param0) {
          var3 = 0;
          L13: while (true) {
            if ((kra.field_c.size() ^ -1) >= (var3 ^ -1)) {
              return;
            } else {
              L14: {
                var6 = (sia) kra.field_c.elementAt(var3);
                var6.a(true, var2 != 0);
                stackOut_64_0 = var2;
                stackIn_66_0 = stackOut_64_0;
                stackIn_65_0 = stackOut_64_0;
                if (var6.a(-2)) {
                  stackOut_66_0 = stackIn_66_0;
                  stackOut_66_1 = 0;
                  stackIn_67_0 = stackOut_66_0;
                  stackIn_67_1 = stackOut_66_1;
                  break L14;
                } else {
                  stackOut_65_0 = stackIn_65_0;
                  stackOut_65_1 = 1;
                  stackIn_67_0 = stackOut_65_0;
                  stackIn_67_1 = stackOut_65_1;
                  break L14;
                }
              }
              var2 = stackIn_67_0 & stackIn_67_1;
              var3++;
              continue L13;
            }
          }
        } else {
          return;
        }
    }

    public abstract void b(int param0);

    public final boolean a(int param0) {
        if (param0 != -2) {
            field_C = null;
            return true;
        }
        return true;
    }

    final static iu[] a(iu[] param0, int param1) {
        int var2 = 0;
        iu var3 = null;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        var2 = 0;
        if (param1 >= 111) {
          L0: while (true) {
            if ((param0.length ^ -1) >= (var2 ^ -1)) {
              return param0;
            } else {
              var3 = param0[var2];
              param0[var2].field_p = 0;
              var3.field_o = 0;
              param0[var2].field_n = param0[var2].field_m;
              param0[var2].field_k = param0[var2].field_q;
              var2++;
              continue L0;
            }
          }
        } else {
          return null;
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        cga var5 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
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
          stackOut_3_0 = this;
          stackOut_3_1 = -127;
          stackIn_5_0 = stackOut_3_0;
          stackIn_5_1 = stackOut_3_1;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          if (dq.field_f == null) {
            stackOut_5_0 = this;
            stackOut_5_1 = stackIn_5_1;
            stackOut_5_2 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            stackIn_6_2 = stackOut_5_2;
            break L1;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = stackIn_4_1;
            stackOut_4_2 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_6_2 = stackOut_4_2;
            break L1;
          }
        }
        L2: {
          ((rfa) this).c((byte) stackIn_6_1, stackIn_6_2 != 0);
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
            ((rfa) this).r(114);
            if (wna.c(-112)) {
              return;
            } else {
              break L3;
            }
          } else {
            break L3;
          }
        }
        this.u(97);
        L4: {
          tc.a(pg.field_y, -2886);
          if (dma.field_l.b(-4171)) {
            dma.field_l.b((byte) -49);
            lla.field_b = true;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (vpa.a(66)) {
            break L5;
          } else {
            L6: while (true) {
              var5 = (cga) (Object) sua.field_H.c(119);
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
                var2 = ((rfa) this).t(8);
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
              ((rfa) this).b(var2, 120);
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
              if (!((rfa) this).h((byte) 84)) {
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
        int var2 = 0;
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        var2 = 68 % ((param0 - 52) / 40);
        L0: while (true) {
          if (!cj.a(vca.field_c, 0)) {
            return;
          } else {
            if (!((rfa) this).a(oka.field_z, vc.field_q, (byte) 105)) {
              ((rfa) this).m(-5);
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
