/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rn extends ag {
    private boolean field_R;
    private int field_O;
    static kc field_S;
    private long field_P;
    private int field_N;
    private long field_Q;
    private boolean field_M;
    static kc field_L;
    private int field_H;
    static String field_K;
    private int field_J;

    private final int f(int param0) {
        int var2 = 0;
        int var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (!(0 != ((rn) this).field_N)) {
            return ((rn) this).field_N;
        }
        if (param0 != 1000) {
            return 12;
        }
        for (var2 = ((rn) this).field_N + -1; -1 > (var2 ^ -1); var2--) {
            // if_icmpeq L65
        }
        return var2;
    }

    final static void m(int param0) {
        int var1 = 0;
        L0: {
          if (!pe.field_Jb) {
            L1: {
              if (ce.field_i == null) {
                ce.field_i = tj.a(4, -21402);
                break L1;
              } else {
                break L1;
              }
            }
            if (!ce.field_i.field_l) {
              break L0;
            } else {
              ad.field_f = ko.a(ad.field_f, ce.field_i.field_i, true);
              ce.field_i = null;
              pe.field_Jb = true;
              break L0;
            }
          } else {
            break L0;
          }
        }
        if (param0 == 0) {
          L2: {
            if (!jf.field_e) {
              L3: {
                if (0 == (1 & ne.field_g)) {
                  var1 = wd.field_d;
                  if (0 >= var1) {
                    if (-3 >= (qf.field_d ^ -1)) {
                      System.out.println("No data to pull");
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                } else {
                  if (2 <= qf.field_d) {
                    System.out.println("Orb coins not availiable");
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              jf.field_e = true;
              break L2;
            } else {
              break L2;
            }
          }
          L4: {
            if (be.field_g) {
              break L4;
            } else {
              L5: {
                if (null == ci.field_d) {
                  ci.field_d = ld.a(6, false);
                  break L5;
                } else {
                  break L5;
                }
              }
              if (!ci.field_d.field_k) {
                break L4;
              } else {
                ec.a(ci.field_d.field_j, (byte) -49);
                ci.field_d = null;
                be.field_g = true;
                break L4;
              }
            }
          }
          L6: {
            if (la.field_a) {
              break L6;
            } else {
              if (!ta.field_b) {
                he.field_e.b((byte) -84, 65);
                ta.field_b = true;
                break L6;
              } else {
                break L6;
              }
            }
          }
          L7: {
            if (la.field_a) {
              kg.field_a = true;
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            if (!pe.field_Jb) {
              break L8;
            } else {
              if (!be.field_g) {
                break L8;
              } else {
                if (!kg.field_a) {
                  break L8;
                } else {
                  if (!jf.field_e) {
                    break L8;
                  } else {
                    wm.g(0);
                    qc.a(false);
                    break L8;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        ac var5 = null;
        long var6 = 0L;
        if (param0 > -52) {
            return;
        }
        if (((rn) this).field_r != null) {
            if (!(param2 != 0)) {
                ((rn) this).field_r.a((qm) this, 5592405, param1, param3, ((rn) this).field_B);
                if (((rn) this).field_r instanceof ac) {
                    var5 = (ac) (Object) ((rn) this).field_r;
                    if (((rn) this).field_N != ((rn) this).field_J) {
                        var5.a(param3, (qm) this, param1, 6600, ((rn) this).field_N, ((rn) this).field_J);
                    }
                    var6 = qj.b(-26572);
                    if (!(-501L >= ((-((rn) this).field_Q + var6) % 1000L ^ -1L))) {
                        var5.a(79, param3, param1, ((rn) this).field_N, (qm) this);
                    }
                }
            }
        }
    }

    void l(int param0) {
        if (!(!(((rn) this).field_o instanceof bn))) {
            ((bn) (Object) ((rn) this).field_o).a((rn) this, -20626);
        }
        if (param0 != -22706) {
            this.c(false);
        }
    }

    private final void j(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (param0 != -10292) {
            return;
        }
        if (!(((rn) this).field_N == ((rn) this).field_J)) {
            var2 = ((rn) this).field_J < ((rn) this).field_N ? ((rn) this).field_J : ((rn) this).field_N;
            var3 = ((rn) this).field_N <= ((rn) this).field_J ? ((rn) this).field_J : ((rn) this).field_N;
            ((rn) this).field_J = var2;
            ((rn) this).field_N = var2;
            ((rn) this).field_g = ((rn) this).field_g.substring(0, var2) + ((rn) this).field_g.substring(var3, ((rn) this).field_g.length());
            ((rn) this).l(-22706);
        }
    }

    void a(qm param0, int param1, int param2, int param3) {
        ac var5 = null;
        int var6 = 0;
        this.a(param0, param1, param2, param3);
        this.h((byte) -100);
        if (!((((rn) this).field_t ^ -1) != -2)) {
            if (((rn) this).field_r instanceof ac) {
                var5 = (ac) (Object) ((rn) this).field_r;
                var6 = var5.b(param1, (qm) this, me.field_I, an.field_g, param3, param2 ^ 2364);
                if (var6 != -1) {
                    if (((rn) this).field_R) {
                        if (var6 < ((rn) this).field_O) {
                            if (!(((rn) this).field_J >= var6)) {
                                var6 = ((rn) this).field_O;
                            }
                        }
                    }
                    ((rn) this).field_N = var6;
                }
            }
            ((rn) this).field_Q = qj.b(-26572);
        }
    }

    private final void a(int param0, int param1) {
        ((rn) this).field_N = param1;
        if (!(ri.field_b[param0])) {
            ((rn) this).field_J = ((rn) this).field_N;
        }
    }

    final void g(int param0) {
        ((rn) this).field_N = 0;
        if (param0 != 3545) {
            int discarded$0 = this.f(39);
        }
        ((rn) this).field_g = "";
        ((rn) this).field_J = 0;
        ((rn) this).l(-22706);
    }

    final static void i(byte param0) {
        cg var4 = null;
        int var2 = ArcanistsMulti.field_G ? 1 : 0;
        dn.field_Db = false;
        om.field_x = null;
        wi.field_f = null;
        if (param0 >= -97) {
            Object var3 = null;
            vg discarded$0 = rn.a(true, (ab) null);
        }
        if (!(null == gm.field_j)) {
            gm.field_j.c(-124);
            gm.field_j = null;
        }
        bc.field_c = null;
        if (null != vh.field_a) {
            vh.field_a.c(99);
            vh.field_a = null;
        }
        nk.field_q = null;
        if (ph.field_a != null) {
            ph.field_a.c(10);
            ph.field_a = null;
        }
        kn.field_qb = null;
        if (!(null == bc.field_c)) {
            var4 = (cg) (Object) bc.field_c.f(102);
            while (var4 != null) {
                var4.a((byte) 88);
                var4 = (cg) (Object) bc.field_c.a(-1);
            }
            bc.field_c = null;
        }
    }

    private final void j(byte param0) {
        this.g((byte) 56);
        if (param0 < 107) {
            return;
        }
        this.j(-10292);
    }

    private final void h(int param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
              if (param0 == -9711) {
                this.j(-10292);
                this.a(var2, (byte) -34);
              } else {
                return;
              }
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var2_ref = (Exception) (Object) decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    rn(String param0, wc param1, int param2) {
        super(param0, param1);
        ((rn) this).field_R = false;
        ((rn) this).field_O = -1;
        ((rn) this).field_P = 0L;
        ((rn) this).field_r = io.field_n.field_l;
        ((rn) this).field_H = param2;
        ((rn) this).a(true, param0, false);
        ((rn) this).field_M = true;
        ((rn) this).field_Q = qj.b(-26572);
    }

    public static void n(int param0) {
        if (param0 != 1) {
            rn.m(-26);
        }
        field_L = null;
        field_K = null;
        field_S = null;
    }

    final boolean a(qm param0, byte param1, char param2, int param3) {
        Object stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        Object stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_38_2 = 0;
        Object stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        Object stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        Object stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        int stackIn_59_2 = 0;
        Object stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        Object stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        int stackOut_58_2 = 0;
        Object stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        int stackOut_57_2 = 0;
        Object stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        L0: {
          ((rn) this).field_Q = qj.b(-26572);
          if (param2 == 60) {
            break L0;
          } else {
            if (param2 == 62) {
              break L0;
            } else {
              if (param1 < -120) {
                L1: {
                  if (param2 < 32) {
                    break L1;
                  } else {
                    if (param2 > 126) {
                      break L1;
                    } else {
                      L2: {
                        if (((rn) this).field_N != ((rn) this).field_J) {
                          this.j(-10292);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      L3: {
                        L4: {
                          if (-1 == ((rn) this).field_H) {
                            break L4;
                          } else {
                            if (((rn) this).field_g.length() >= ((rn) this).field_H) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L5: {
                          if (((rn) this).field_N >= ((rn) this).field_g.length()) {
                            ((rn) this).field_g = ((rn) this).field_g + param2;
                            ((rn) this).field_N = ((rn) this).field_g.length();
                            ((rn) this).field_J = ((rn) this).field_g.length();
                            break L5;
                          } else {
                            ((rn) this).field_g = ((rn) this).field_g.substring(0, ((rn) this).field_N) + param2 + ((rn) this).field_g.substring(((rn) this).field_N, ((rn) this).field_g.length());
                            ((rn) this).field_N = ((rn) this).field_N + 1;
                            ((rn) this).field_J = ((rn) this).field_N;
                            break L5;
                          }
                        }
                        ((rn) this).l(-22706);
                        break L3;
                      }
                      return true;
                    }
                  }
                }
                if (param3 != -86) {
                  L6: {
                    if (-102 != (param3 ^ -1)) {
                      if (-14 != param3) {
                        if (param3 != 96) {
                          if (param3 == 97) {
                            if (((rn) this).field_N >= ((rn) this).field_g.length()) {
                              break L6;
                            } else {
                              L7: {
                                stackOut_56_0 = this;
                                stackOut_56_1 = 81;
                                stackIn_58_0 = stackOut_56_0;
                                stackIn_58_1 = stackOut_56_1;
                                stackIn_57_0 = stackOut_56_0;
                                stackIn_57_1 = stackOut_56_1;
                                if (!ri.field_b[82]) {
                                  stackOut_58_0 = this;
                                  stackOut_58_1 = stackIn_58_1;
                                  stackOut_58_2 = 1 + ((rn) this).field_N;
                                  stackIn_59_0 = stackOut_58_0;
                                  stackIn_59_1 = stackOut_58_1;
                                  stackIn_59_2 = stackOut_58_2;
                                  break L7;
                                } else {
                                  stackOut_57_0 = this;
                                  stackOut_57_1 = stackIn_57_1;
                                  stackOut_57_2 = this.i(-9125);
                                  stackIn_59_0 = stackOut_57_0;
                                  stackIn_59_1 = stackOut_57_1;
                                  stackIn_59_2 = stackOut_57_2;
                                  break L7;
                                }
                              }
                              this.a(stackIn_59_1, stackIn_59_2);
                              return true;
                            }
                          } else {
                            if (param3 != 102) {
                              if (-104 != (param3 ^ -1)) {
                                if (param3 != 84) {
                                  L8: {
                                    if (!ri.field_b[82]) {
                                      break L8;
                                    } else {
                                      if ((param3 ^ -1) != -66) {
                                        break L8;
                                      } else {
                                        this.j((byte) 122);
                                        return true;
                                      }
                                    }
                                  }
                                  L9: {
                                    if (!ri.field_b[82]) {
                                      break L9;
                                    } else {
                                      if (66 != param3) {
                                        break L9;
                                      } else {
                                        this.g((byte) 56);
                                        return true;
                                      }
                                    }
                                  }
                                  if (!ri.field_b[82]) {
                                    break L6;
                                  } else {
                                    if (67 != param3) {
                                      break L6;
                                    } else {
                                      this.h(-9711);
                                      return true;
                                    }
                                  }
                                } else {
                                  this.c(false);
                                  return true;
                                }
                              } else {
                                this.a(81, ((rn) this).field_g.length());
                                return true;
                              }
                            } else {
                              this.a(81, 0);
                              return true;
                            }
                          }
                        } else {
                          if (-1 >= ((rn) this).field_N) {
                            break L6;
                          } else {
                            L10: {
                              stackOut_35_0 = this;
                              stackOut_35_1 = 81;
                              stackIn_37_0 = stackOut_35_0;
                              stackIn_37_1 = stackOut_35_1;
                              stackIn_36_0 = stackOut_35_0;
                              stackIn_36_1 = stackOut_35_1;
                              if (ri.field_b[82]) {
                                stackOut_37_0 = this;
                                stackOut_37_1 = stackIn_37_1;
                                stackOut_37_2 = this.f(1000);
                                stackIn_38_0 = stackOut_37_0;
                                stackIn_38_1 = stackOut_37_1;
                                stackIn_38_2 = stackOut_37_2;
                                break L10;
                              } else {
                                stackOut_36_0 = this;
                                stackOut_36_1 = stackIn_36_1;
                                stackOut_36_2 = ((rn) this).field_N + -1;
                                stackIn_38_0 = stackOut_36_0;
                                stackIn_38_1 = stackOut_36_1;
                                stackIn_38_2 = stackOut_36_2;
                                break L10;
                              }
                            }
                            this.a(stackIn_38_1, stackIn_38_2);
                            return true;
                          }
                        }
                      } else {
                        ((rn) this).g(3545);
                        return true;
                      }
                    } else {
                      if (((rn) this).field_J == ((rn) this).field_N) {
                        if (((rn) this).field_N < ((rn) this).field_g.length()) {
                          ((rn) this).field_J = 1 + ((rn) this).field_N;
                          this.j(-10292);
                          return true;
                        } else {
                          break L6;
                        }
                      } else {
                        this.j(-10292);
                        return true;
                      }
                    }
                  }
                  return false;
                } else {
                  if (((rn) this).field_N != ((rn) this).field_J) {
                    this.j(-10292);
                    return true;
                  } else {
                    if (-1 < ((rn) this).field_N) {
                      ((rn) this).field_J = -1 + ((rn) this).field_N;
                      this.j(-10292);
                      return true;
                    } else {
                      return false;
                    }
                  }
                }
              } else {
                return false;
              }
            }
          }
        }
        return false;
    }

    private final void h(byte param0) {
        int var8 = ArcanistsMulti.field_G ? 1 : 0;
        if (!((rn) this).field_M) {
            ((rn) this).field_i = 0;
            ((rn) this).field_h = 0;
            return;
        }
        if (!(((rn) this).field_r instanceof ac)) {
            return;
        }
        ac var9 = (ac) (Object) ((rn) this).field_r;
        kh var3 = var9.a((qm) this, -46);
        int var4 = var3.b((byte) 121);
        int var5 = var9.a((qm) this, (byte) 101);
        if (param0 > -38) {
            return;
        }
        int var6 = var9.a(27184) >> 559979617;
        if (!(-var6 + var5 <= var4)) {
            ((rn) this).field_i = 0;
            ((rn) this).field_h = 0;
            return;
        }
        int var7 = ((rn) this).field_h - -var3.a(((rn) this).field_N, 0);
        if (-var6 + var5 < var7) {
            ((rn) this).field_h = ((rn) this).field_h - (var7 - -var6 - var5);
        } else {
            if (var7 < var6) {
                ((rn) this).field_h = ((rn) this).field_h + (-var7 + var6);
            }
        }
        if (0 >= ((rn) this).field_h) {
            // if_icmpge L247
            ((rn) this).field_h = var6 + -var5;
        } else {
            ((rn) this).field_h = 0;
        }
    }

    private final int i(int param0) {
        int var3 = 0;
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 != -9125) {
            this.h(99);
        }
        int var2 = ((rn) this).field_g.length();
        if (!(var2 != ((rn) this).field_N)) {
            return ((rn) this).field_N;
        }
        for (var3 = 1 + ((rn) this).field_N; var3 < var2; var3++) {
            // if_icmpeq L78
        }
        return var3;
    }

    private final void c(boolean param0) {
        if (((rn) this).field_o instanceof bn) {
            ((bn) (Object) ((rn) this).field_o).b((rn) this, 117);
        }
        if (param0) {
            ((rn) this).a((byte) -7, 102, 2, -128);
        }
    }

    final void a(boolean param0, String param1, boolean param2) {
        if (!(param1 != null)) {
            param1 = "";
        }
        ((rn) this).field_g = param1;
        int var4 = param1.length();
        if (-1 != ((rn) this).field_H) {
            if (var4 > ((rn) this).field_H) {
                ((rn) this).field_g = ((rn) this).field_g.substring(0, ((rn) this).field_H);
            }
        }
        ((rn) this).field_J = ((rn) this).field_g.length();
        ((rn) this).field_N = ((rn) this).field_g.length();
        if (!(param0)) {
            ((rn) this).l(-22706);
        }
        if (param2) {
            this.a(-16, 109);
        }
    }

    private final void a(String param0, byte param1) {
        int var3 = 0;
        if (0 != (((rn) this).field_H ^ -1)) {
            var3 = ((rn) this).field_H - ((rn) this).field_g.length();
            if ((var3 ^ -1) <= -1) {
                return;
            }
            param0 = param0.substring(0, var3);
        }
        if (((rn) this).field_N != ((rn) this).field_g.length()) {
            ((rn) this).field_g = ((rn) this).field_g.substring(0, ((rn) this).field_N) + param0 + ((rn) this).field_g.substring(((rn) this).field_N, ((rn) this).field_g.length());
        } else {
            ((rn) this).field_g = ((rn) this).field_g + param0;
        }
        ((rn) this).field_N = ((rn) this).field_N + param0.length();
        ((rn) this).field_J = ((rn) this).field_N;
        if (param1 >= -27) {
            return;
        }
        ((rn) this).l(-22706);
    }

    final static vg a(boolean param0, ab param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        vg var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        var2 = param1.d(28089, 8);
        if ((var2 ^ -1) >= -1) {
          L0: {
            var3 = hd.a(param1, (byte) 118) ? 1 : 0;
            var4 = hd.a(param1, (byte) 126) ? 1 : 0;
            if (param0) {
              break L0;
            } else {
              field_K = null;
              break L0;
            }
          }
          L1: {
            var5 = new vg();
            var5.field_f = (short)param1.d(28089, 16);
            var5.field_b = eo.a(param1, var5.field_b, 16, 16);
            var5.field_B = eo.a(param1, var5.field_B, 16, 16);
            var5.field_L = eo.a(param1, var5.field_L, 16, 16);
            var5.field_G = (short)param1.d(28089, 16);
            var5.field_U = eo.a(param1, var5.field_U, 16, 16);
            var5.field_T = eo.a(param1, var5.field_T, 16, 16);
            var5.field_O = eo.a(param1, var5.field_O, 16, 16);
            if (var3 == 0) {
              break L1;
            } else {
              var5.field_A = (short)param1.d(28089, 16);
              var5.field_r = eo.a(param1, var5.field_r, 16, 16);
              var5.field_e = eo.a(param1, var5.field_e, 16, 16);
              var5.field_S = eo.a(param1, var5.field_S, 16, 16);
              var5.field_w = eo.a(param1, var5.field_w, 16, 16);
              var5.field_q = eo.a(param1, var5.field_q, 16, 16);
              var5.field_u = eo.a(param1, var5.field_u, 16, 16);
              break L1;
            }
          }
          L2: {
            if (var4 != 0) {
              int discarded$1 = param1.d(28089, 16);
              var5.field_Q = eo.a(param1, var5.field_Q, 16, 16);
              var5.field_d = eo.a(param1, var5.field_d, 16, 16);
              var5.field_D = eo.a(param1, var5.field_D, 16, 16);
              var5.field_s = eo.a(param1, var5.field_s, 16, 16);
              var5.field_h = eo.a(param1, var5.field_h, 16, 16);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (!hd.a(param1, (byte) 126)) {
              break L3;
            } else {
              var5.field_z = eo.a(param1, var5.field_z, 16, 16);
              break L3;
            }
          }
          L4: {
            if (hd.a(param1, (byte) 120)) {
              var5.field_H = ub.a(3, param1, 16, var5.field_H);
              var6 = 0;
              var7 = 0;
              L5: while (true) {
                if (var7 >= var5.field_H.length) {
                  if (-1 != (var6 ^ -1)) {
                    var5.field_F = (byte)(1 + var6);
                    break L4;
                  } else {
                    var5.field_H = null;
                    break L4;
                  }
                } else {
                  if ((var5.field_H[var7] & 255) > var6) {
                    var6 = var5.field_H[var7] & 255;
                    var7++;
                    continue L5;
                  } else {
                    var7++;
                    continue L5;
                  }
                }
              }
            } else {
              break L4;
            }
          }
          return var5;
        } else {
          throw new IllegalStateException("" + var2);
        }
    }

    private final void g(byte param0) {
        if (param0 != 56) {
            Object var3 = null;
            boolean discarded$0 = ((rn) this).a(84, 58, (qm) null, 100, 126, 7, -93);
        }
        String var2 = this.k(param0 + -23972);
        if (var2.length() > 0) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.k(-23916)), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    private final String k(int param0) {
        int var2 = ((rn) this).field_J >= ((rn) this).field_N ? ((rn) this).field_N : ((rn) this).field_J;
        if (param0 != -23916) {
            return null;
        }
        int var3 = ((rn) this).field_N <= ((rn) this).field_J ? ((rn) this).field_J : ((rn) this).field_N;
        return ((rn) this).field_g.substring(var2, var3);
    }

    final boolean a(int param0, int param1, qm param2, int param3, int param4, int param5, int param6) {
        int var9_int = 0;
        long var9 = 0L;
        int var8 = 49 % ((param4 - -42) / 35);
        if (this.a(param0, param1, param2, param3, -78, param5, param6)) {
            if (!(((rn) this).field_r instanceof ac)) {
                return false;
            }
            var9_int = ((ac) (Object) ((rn) this).field_r).b(param6, (qm) this, me.field_I, an.field_g, param3, 2454);
            this.a(81, (var9_int ^ -1) == 0 ? 0 : var9_int);
            var9 = qj.b(-26572);
            ((rn) this).field_R = -((rn) this).field_P + var9 < 250L ? true : false;
            if (!(!((rn) this).field_R)) {
                ((rn) this).field_J = this.f(1000);
                ((rn) this).field_N = this.i(-9125);
                if (-1 > (((rn) this).field_N ^ -1)) {
                    if (!(32 != ((rn) this).field_g.charAt(-1 + ((rn) this).field_N))) {
                        ((rn) this).field_N = ((rn) this).field_N - 1;
                    }
                }
                ((rn) this).field_O = ((rn) this).field_N;
            }
            ((rn) this).field_P = var9;
            return true;
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "WINNER - ";
    }
}
