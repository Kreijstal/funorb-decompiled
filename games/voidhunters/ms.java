/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ms extends wi {
    private boolean field_x;
    private int field_r;
    static int[] field_A;
    private int field_w;
    static ij field_y;
    private int field_v;
    private boolean field_z;
    private long field_t;
    private int field_q;
    private boolean field_s;
    String field_u;
    private int field_o;
    private int field_p;

    private final void d(byte param0) {
        if (param0 != -116) {
            this.e((byte) 92);
        }
        String var2 = mea.a(true);
        wva.a(vpa.b((byte) -119), (byte) 56, var2);
    }

    final int f(int param0) {
        int var2 = 0;
        L0: {
          if (param0 >= 34) {
            break L0;
          } else {
            this.a(83, 93, -32, 71, -33, -12, false, -123);
            break L0;
          }
        }
        if (((ms) this).field_c) {
          return -1;
        } else {
          if (!nb.b(true)) {
            return -1;
          } else {
            if (!mlb.field_o) {
              var2 = ju.a(((ms) this).field_x, ((ms) this).field_r, wnb.a(125), (byte) 13, true, fpb.d(true));
              if (0 != var2) {
                L1: {
                  if (-1 != var2) {
                    if (-2 == (var2 ^ -1)) {
                      if (qmb.field_q != 11) {
                        break L1;
                      } else {
                        if (0 != dmb.field_a) {
                          break L1;
                        } else {
                          uk.b((byte) 50);
                          break L1;
                        }
                      }
                    } else {
                      L2: {
                        if (tsb.field_q) {
                          break L2;
                        } else {
                          ((ms) this).a("reconnect", 0);
                          break L2;
                        }
                      }
                      km.f((byte) -119);
                      aj.a(dgb.field_b, (byte) 72, var2);
                      mlb.field_o = true;
                      ska.field_p = wt.a(false) + 15000L;
                      return var2;
                    }
                  } else {
                    if (qmb.field_q == 11) {
                      if (0 == dmb.field_a) {
                        uk.b((byte) 50);
                        break L1;
                      } else {
                        return var2;
                      }
                    } else {
                      return var2;
                    }
                  }
                }
                return var2;
              } else {
                return -1;
              }
            } else {
              return -1;
            }
          }
        }
    }

    final void h(int param0) {
        int var3 = 0;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        L0: {
          var3 = VoidHunters.field_G;
          if (param0 == 0) {
            break L0;
          } else {
            this.a((byte) 6, false);
            break L0;
          }
        }
        L1: {
          if (!eu.a(true)) {
            if (ef.field_z < 10) {
              break L1;
            } else {
              if (!lm.a(true)) {
                wkb.b((byte) 6);
                break L1;
              } else {
                if (qmb.field_q != 0) {
                  ala.a(tcb.field_o, param0 ^ 15877);
                  break L1;
                } else {
                  int discarded$177 = this.a((byte) -96, false, false);
                  break L1;
                }
              }
            }
          } else {
            L2: {
              stackOut_3_0 = this;
              stackOut_3_1 = -102;
              stackOut_3_2 = 0;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              stackIn_4_2 = stackOut_3_2;
              if (psb.field_b == null) {
                stackOut_5_0 = this;
                stackOut_5_1 = stackIn_5_1;
                stackOut_5_2 = stackIn_5_2;
                stackOut_5_3 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                stackIn_6_2 = stackOut_5_2;
                stackIn_6_3 = stackOut_5_3;
                break L2;
              } else {
                stackOut_4_0 = this;
                stackOut_4_1 = stackIn_4_1;
                stackOut_4_2 = stackIn_4_2;
                stackOut_4_3 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_6_2 = stackOut_4_2;
                stackIn_6_3 = stackOut_4_3;
                break L2;
              }
            }
            int discarded$178 = this.a((byte) stackIn_6_1, stackIn_6_2 != 0, stackIn_6_3 != 0);
            break L1;
          }
        }
    }

    final void b(boolean param0, int param1) {
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_23_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_112_1 = 0;
        int stackIn_113_0 = 0;
        int stackIn_113_1 = 0;
        int stackIn_114_0 = 0;
        int stackIn_114_1 = 0;
        int stackIn_114_2 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_111_1 = 0;
        int stackOut_113_0 = 0;
        int stackOut_113_1 = 0;
        int stackOut_113_2 = 0;
        int stackOut_112_0 = 0;
        int stackOut_112_1 = 0;
        int stackOut_112_2 = 0;
        L0: {
          var5 = VoidHunters.field_G;
          if (efb.field_b == null) {
            break L0;
          } else {
            L1: {
              if (psb.field_b != null) {
                break L1;
              } else {
                var6 = etb.b(-28941);
                var4 = var6.getSize();
                efb.field_b.c(param1 ^ 109, var4.width, var4.height);
                break L1;
              }
            }
            efb.field_b.d(param1 + 3899);
            break L0;
          }
        }
        L2: {
          vl.e((byte) -101);
          ts.a(1001);
          if (param1 == 9) {
            break L2;
          } else {
            ((ms) this).field_w = 76;
            break L2;
          }
        }
        L3: {
          if (fu.a(45)) {
            break L3;
          } else {
            if ((qmb.field_q ^ -1) == -12) {
              break L3;
            } else {
              csb.a(true);
              break L3;
            }
          }
        }
        L4: {
          if (null == kkb.field_o) {
            break L4;
          } else {
            tcb.field_o = kkb.field_o.b(1);
            break L4;
          }
        }
        L5: {
          if (!wh.g(-126)) {
            break L5;
          } else {
            L6: {
              var3 = 1200 * wjb.e(204);
              if (((ms) this).field_s) {
                break L6;
              } else {
                if (var3 >= ria.a(32)) {
                  break L5;
                } else {
                  if (gia.d(-2) <= var3) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
            }
            ((ms) this).field_s = false;
            ifb.l(-123);
            km.f((byte) -119);
            aj.a(jc.field_o, (byte) 105, 2);
            vi.a(-10560);
            mlb.field_o = true;
            ska.field_p = 15000L + wt.a(false);
            break L5;
          }
        }
        L7: {
          L8: {
            if (-1 == dmb.field_a) {
              break L8;
            } else {
              if (dmb.field_a != 0) {
                break L7;
              } else {
                break L8;
              }
            }
          }
          L9: {
            if (-1 != dmb.field_a) {
              stackOut_22_0 = 0;
              stackIn_23_0 = stackOut_22_0;
              break L9;
            } else {
              stackOut_21_0 = 1;
              stackIn_23_0 = stackOut_21_0;
              break L9;
            }
          }
          L10: {
            var3 = stackIn_23_0;
            dmb.field_a = ll.a(-124);
            if (var3 == 0) {
              break L10;
            } else {
              if (0 == dmb.field_a) {
                if ((qmb.field_q ^ -1) != -12) {
                  break L10;
                } else {
                  if (nb.b(true)) {
                    break L10;
                  } else {
                    uk.b((byte) 123);
                    break L10;
                  }
                }
              } else {
                break L10;
              }
            }
          }
          if (dmb.field_a == 0) {
            break L7;
          } else {
            if (dmb.field_a != 0) {
              ska.field_p = wt.a(false) - -15000L;
              break L7;
            } else {
              break L7;
            }
          }
        }
        L11: {
          if (-1 == dmb.field_a) {
            break L11;
          } else {
            if (-1 == dmb.field_a) {
              break L11;
            } else {
              if (10 <= ef.field_z) {
                if (10 <= qmb.field_q) {
                  L12: {
                    km.f((byte) -119);
                    if (dmb.field_a == 3) {
                      aj.a(lba.field_o, (byte) 84, 256);
                      break L12;
                    } else {
                      if (-5 != dmb.field_a) {
                        if (-3 != dmb.field_a) {
                          if (5 != dmb.field_a) {
                            aj.a(ca.field_o, (byte) 82, 256);
                            break L12;
                          } else {
                            aj.a(wna.field_a, (byte) 121, 5);
                            break L12;
                          }
                        } else {
                          aj.a(una.field_f, (byte) 110, 256);
                          break L12;
                        }
                      } else {
                        aj.a(cna.field_wb, (byte) 17, 256);
                        break L12;
                      }
                    }
                  }
                  mlb.field_o = true;
                  break L11;
                } else {
                  break L11;
                }
              } else {
                if (dmb.field_a == 3) {
                  ((ms) this).a("js5crc", 0);
                  break L11;
                } else {
                  if (-5 != dmb.field_a) {
                    if (dmb.field_a != 2) {
                      if (-6 != dmb.field_a) {
                        ((ms) this).a("js5connect", 0);
                        break L11;
                      } else {
                        ((ms) this).a("outofdate", 0);
                        break L11;
                      }
                    } else {
                      ((ms) this).a("js5connect_full", 0);
                      break L11;
                    }
                  } else {
                    ((ms) this).a("js5io", 0);
                    break L11;
                  }
                }
              }
            }
          }
        }
        L13: {
          L14: {
            if (-1 == dmb.field_a) {
              break L14;
            } else {
              if (-1 != (dmb.field_a ^ -1)) {
                if (wt.a(false) >= ska.field_p) {
                  mlb.field_o = false;
                  if (-1 != dmb.field_a) {
                    L15: {
                      if (dmb.field_a != 0) {
                        dmb.field_a = -1;
                        bna.e(0);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    if (dmb.field_a != 0) {
                      break L13;
                    } else {
                      if (nb.b(true)) {
                        break L13;
                      } else {
                        dga.field_a = false;
                        break L13;
                      }
                    }
                  } else {
                    if (dmb.field_a != 0) {
                      break L13;
                    } else {
                      if (nb.b(true)) {
                        break L13;
                      } else {
                        dga.field_a = false;
                        break L13;
                      }
                    }
                  }
                } else {
                  if (dmb.field_a != 0) {
                    break L13;
                  } else {
                    if (nb.b(true)) {
                      break L13;
                    } else {
                      dga.field_a = false;
                      break L13;
                    }
                  }
                }
              } else {
                break L14;
              }
            }
          }
          L16: {
            if (!nb.b(true)) {
              break L16;
            } else {
              break L16;
            }
          }
          if (dmb.field_a != 0) {
            break L13;
          } else {
            if (nb.b(true)) {
              break L13;
            } else {
              dga.field_a = false;
              break L13;
            }
          }
        }
        L17: {
          if (0 != ef.field_z) {
            break L17;
          } else {
            if (aqa.a(param1 + -90)) {
              ef.field_z = 1;
              break L17;
            } else {
              break L17;
            }
          }
        }
        L18: {
          if (1 != ef.field_z) {
            break L18;
          } else {
            L19: {
              if (0 == ahb.field_p) {
                break L19;
              } else {
                ppb.field_a = bea.a(1, lja.field_f);
                break L19;
              }
            }
            btb.field_b = uhb.a(1, jta.field_p, 106, true, false);
            dt.field_o = uhb.a(1, tl.field_p, 97, true, false);
            gdb.field_i = uhb.a(1, ru.field_p, 81, true, false);
            ef.field_z = 2;
            kwa.field_o = btb.field_b;
            jta.field_r = dt.field_o;
            break L18;
          }
        }
        L20: {
          if (ef.field_z == 2) {
            L21: {
              if (null != ppb.field_a) {
                if (!ppb.field_a.b((byte) -81)) {
                  break L21;
                } else {
                  if (ppb.field_a.a(true, "")) {
                    if (ppb.field_a.a(32171, "")) {
                      dga.a(true, ppb.field_a);
                      ppb.field_a = null;
                      fkb.a(2096);
                      break L21;
                    } else {
                      break L21;
                    }
                  } else {
                    ppb.field_a = null;
                    break L21;
                  }
                }
              } else {
                break L21;
              }
            }
            if (null == ppb.field_a) {
              ef.field_z = 3;
              break L20;
            } else {
              break L20;
            }
          } else {
            break L20;
          }
        }
        L22: {
          if (-4 == (ef.field_z ^ -1)) {
            if (!maa.a(dt.field_o, 2, gdb.field_i, btb.field_b)) {
              break L22;
            } else {
              if (poa.a(-20230, gdb.field_i)) {
                L23: {
                  L24: {
                    mta.b((byte) 123);
                    lva.b(false);
                    mnb.field_g = dsa.field_o;
                    djb.field_r = false;
                    baa.a(bua.field_o, dt.field_o, btb.field_b, gdb.field_i, false);
                    if (jb.field_a) {
                      break L24;
                    } else {
                      if (gtb.field_a != null) {
                        break L24;
                      } else {
                        break L23;
                      }
                    }
                  }
                  L25: {
                    if (jb.field_a) {
                      stackOut_110_0 = 0;
                      stackIn_111_0 = stackOut_110_0;
                      break L25;
                    } else {
                      stackOut_109_0 = 1;
                      stackIn_111_0 = stackOut_109_0;
                      break L25;
                    }
                  }
                  L26: {
                    stackOut_111_0 = stackIn_111_0;
                    stackOut_111_1 = param1 ^ -110;
                    stackIn_113_0 = stackOut_111_0;
                    stackIn_113_1 = stackOut_111_1;
                    stackIn_112_0 = stackOut_111_0;
                    stackIn_112_1 = stackOut_111_1;
                    if (jb.field_a) {
                      stackOut_113_0 = stackIn_113_0;
                      stackOut_113_1 = stackIn_113_1;
                      stackOut_113_2 = 0;
                      stackIn_114_0 = stackOut_113_0;
                      stackIn_114_1 = stackOut_113_1;
                      stackIn_114_2 = stackOut_113_2;
                      break L26;
                    } else {
                      stackOut_112_0 = stackIn_112_0;
                      stackOut_112_1 = stackIn_112_1;
                      stackOut_112_2 = 1;
                      stackIn_114_0 = stackOut_112_0;
                      stackIn_114_1 = stackOut_112_1;
                      stackIn_114_2 = stackOut_112_2;
                      break L26;
                    }
                  }
                  vt.a(stackIn_114_0 != 0, stackIn_114_1, stackIn_114_2 != 0, gtb.field_a);
                  break L23;
                }
                L27: {
                  if (tc.field_a) {
                    pr.a(param1 + 17487);
                    break L27;
                  } else {
                    break L27;
                  }
                }
                L28: {
                  if (null != ji.field_p) {
                    break L28;
                  } else {
                    ji.field_p = bia.a(true);
                    it.field_j = lwa.e((byte) 73);
                    break L28;
                  }
                }
                jc.a((byte) 55, gdb.field_i, it.field_j, ji.field_p);
                dt.field_o = null;
                gdb.field_i = null;
                btb.field_b = null;
                qd.a(0, (java.applet.Applet) this);
                fkb.a(2096);
                ef.field_z = 10;
                break L22;
              } else {
                break L22;
              }
            }
          } else {
            break L22;
          }
        }
        L29: {
          if (10 == ef.field_z) {
            L30: {
              if (0 == ahb.field_p) {
                break L30;
              } else {
                esb.field_j = bea.a(1, vc.field_o);
                break L30;
              }
            }
            ef.field_z = 11;
            break L29;
          } else {
            break L29;
          }
        }
        L31: {
          if ((ef.field_z ^ -1) != -12) {
            break L31;
          } else {
            L32: {
              if (esb.field_j == null) {
                break L32;
              } else {
                L33: {
                  if (!esb.field_j.b((byte) -38)) {
                    break L33;
                  } else {
                    if (esb.field_j.a(param1 ^ 113)) {
                      break L32;
                    } else {
                      break L33;
                    }
                  }
                }
                uoa.a(tta.a(-93, esb.field_j, ocb.field_i, lo.field_d), -1, 0.0f);
                break L31;
              }
            }
            gwa.field_o = true;
            ef.field_z = 12;
            break L31;
          }
        }
        L34: {
          if (ef.field_z != -13) {
            break L34;
          } else {
            if (!gwa.field_o) {
              ef.field_z = 13;
              break L34;
            } else {
              break L34;
            }
          }
        }
        L35: {
          if (-14 != ef.field_z) {
            if (param0) {
              break L35;
            } else {
              if (!rda.field_q) {
                break L35;
              } else {
                kl.a(igb.field_a, -125);
                ((ms) this).c(-81);
                qa.a((byte) -62, igb.field_a);
                break L35;
              }
            }
          } else {
            if (param0) {
              break L35;
            } else {
              if (!rda.field_q) {
                break L35;
              } else {
                kl.a(igb.field_a, -125);
                ((ms) this).c(-81);
                qa.a((byte) -62, igb.field_a);
                break L35;
              }
            }
          }
        }
        L36: {
          if (lna.field_o[8]) {
            qfb.a(param1 ^ 1);
            break L36;
          } else {
            break L36;
          }
        }
    }

    private final void g(int param0) {
        lna.field_o[11] = true;
        lna.field_o[12] = true;
        lna.field_o[13] = true;
        int var2 = -95 % ((param0 - 24) / 37);
    }

    final int c(boolean param0, int param1) {
        if (param1 != -9288) {
            this.g(-79);
        }
        return this.a((byte) 60, true, param0);
    }

    private final void k(int param0) {
        ta.field_b[12] = -1;
        ta.field_b[18] = 1;
        ta.field_b[10] = -1;
        ta.field_b[4] = -1;
        ta.field_b[1] = 16;
        ta.field_b[6] = -2;
        ta.field_b[3] = -1;
        ta.field_b[8] = -2;
        ta.field_b[2] = -2;
        ta.field_b[9] = -1;
        if (param0 >= -80) {
            ((ms) this).field_s = true;
        }
        ta.field_b[11] = -1;
        ta.field_b[7] = -1;
        ta.field_b[13] = -1;
        ta.field_b[17] = -1;
        ta.field_b[16] = -1;
        ta.field_b[5] = -1;
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, int param4, boolean param5, boolean param6) {
        this.a((byte) 119, true);
        if (param3) {
            this.c(true);
        }
        if (param1) {
            this.i(30138);
        }
        if (param0) {
            this.e(true);
        }
        if (param6) {
            this.e((byte) -4);
        }
        if (param2) {
            this.f((byte) -1);
        }
        if (param5) {
            this.g(-121);
        }
        if (param4 != -4590) {
            this.c(true);
        }
    }

    final void a(String param0, int param1, int param2) {
        int var4 = 1 % ((-20 - param1) / 33);
        this.a(param2, 480, 640, param0, 32);
    }

    final static byte[] b(String param0, int param1) {
        if (param1 != 23100) {
            ms.d(true);
        }
        return hw.field_e.a(param0, true, "");
    }

    private final void i(int param0) {
        if (param0 != 30138) {
            Object var3 = null;
            ((ms) this).a((String) null, 57, -40);
        }
        lna.field_o[2] = true;
    }

    private final void e(boolean param0) {
        lna.field_o[4] = param0;
    }

    private final void a(int param0, int param1, int param2, String param3, int param4) {
        Exception var6 = null;
        String var6_ref = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        Object var10 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        Object stackOut_3_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        try {
          if (((ms) this).b((byte) -114)) {
            L0: {
              L1: {
                ((ms) this).field_u = ((ms) this).getCodeBase().getHost();
                var6_ref = ((ms) this).field_u.toLowerCase();
                stackOut_2_0 = this;
                stackIn_5_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var6_ref.equals((Object) (Object) "jagex.com")) {
                  break L1;
                } else {
                  stackOut_3_0 = this;
                  stackIn_6_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (!var6_ref.endsWith(".jagex.com")) {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    break L0;
                  } else {
                    stackOut_4_0 = this;
                    stackIn_5_0 = stackOut_4_0;
                    break L1;
                  }
                }
              }
              stackOut_5_0 = this;
              stackOut_5_1 = 1;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              break L0;
            }
            L2: {
              ((ms) this).field_x = stackIn_7_1 != 0;
              ((ms) this).field_p = Integer.parseInt(((ms) this).getParameter("gameport1"));
              ((ms) this).field_v = Integer.parseInt(((ms) this).getParameter("gameport2"));
              var7 = ((ms) this).getParameter("servernum");
              if (var7 != null) {
                ((ms) this).field_w = Integer.parseInt(var7);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              ((ms) this).field_q = Integer.parseInt(((ms) this).getParameter("gamecrc"));
              ((ms) this).field_t = Long.parseLong(((ms) this).getParameter("instanceid"));
              ((ms) this).field_z = ((ms) this).getParameter("member").equals((Object) (Object) "yes");
              var8 = ((ms) this).getParameter("lang");
              if (var8 != null) {
                ((ms) this).field_o = Integer.parseInt(var8);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (-6 >= (((ms) this).field_o ^ -1)) {
                ((ms) this).field_o = 0;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var9 = ((ms) this).getParameter("affid");
              if (var9 == null) {
                break L5;
              } else {
                ((ms) this).field_r = Integer.parseInt(var9);
                break L5;
              }
            }
            tc.field_a = Boolean.valueOf(((ms) this).getParameter("simplemode")).booleanValue();
            ((ms) this).a(((ms) this).field_q, param4, param0, 7, param2, param3, param1);
          } else {
            return;
          }
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var6 = (Exception) (Object) decompiledCaughtException;
        var10 = null;
        gna.a((Throwable) (Object) var6, (String) null, 0);
        ((ms) this).a("crash", 0);
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6, int param7) {
        java.awt.Frame var11 = new java.awt.Frame("Jagex");
        var11.pack();
        var11.dispose();
        ((ms) this).setBackground(java.awt.Color.black);
        ahb.field_p = ((ms) this).field_o;
        aeb.a(ahb.field_p, 1);
        int var10 = -52 / ((-72 - param0) / 33);
        bmb.a(5000, ((ms) this).field_v, 60, ((ms) this).field_w, bm.field_o, ((ms) this).field_t, ((ms) this).field_u, ((ms) this).field_z, ((ms) this).field_p, ((ms) this).field_q, param6, ahb.field_p, param3, 5000);
        sha.a(param3, ((ms) this).field_u, ((ms) this).field_p, ((ms) this).field_v, (byte) -2, ahb.field_p, ((ms) this).field_q, bm.field_o, ((ms) this).field_w);
        ndb.b(47);
        kkb.field_o = ghb.c((byte) -127);
        qa.a((byte) 122, igb.field_a);
        jta.field_p = param7;
        tl.field_p = param5;
        vc.field_o = param4;
        lja.field_f = param2;
        ru.field_p = param1;
        this.k(-92);
        rrb.a((byte) 101);
    }

    final void a(boolean param0, int param1, int param2) {
        this.a(-119, cp.field_q.field_a, mqa.field_r.field_a, param2, aw.field_Bb.field_a, pgb.field_b.field_a, param0, al.field_f.field_a);
        int var4 = -37 % ((param1 - 30) / 50);
    }

    private final void f(byte param0) {
        if (param0 != -1) {
            return;
        }
        lna.field_o[6] = true;
    }

    final void e(int param0) {
        int var2 = 0;
        pgb var3 = null;
        int var4 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        L0: {
          var4 = VoidHunters.field_G;
          var2 = ow.field_a;
          if (64 <= var2) {
            break L0;
          } else {
            if (lna.field_o[var2]) {
              if (var2 == 0) {
                return;
              } else {
                L1: {
                  if (var2 == 1) {
                    je.a((byte) 113);
                    break L1;
                  } else {
                    if (2 != var2) {
                      if ((var2 ^ -1) != -4) {
                        if (4 == var2) {
                          ogb.a(-8999);
                          break L1;
                        } else {
                          if (var2 != -6) {
                            if (-7 != var2) {
                              if (var2 == 7) {
                                this.d((byte) -116);
                                break L1;
                              } else {
                                if (var2 != -9) {
                                  if (-17 != var2) {
                                    L2: {
                                      if ((var2 ^ -1) == -12) {
                                        break L2;
                                      } else {
                                        if ((var2 ^ -1) == -13) {
                                          break L2;
                                        } else {
                                          if (13 == var2) {
                                            lob.a(true);
                                            break L1;
                                          } else {
                                            if ((var2 ^ -1) == -18) {
                                              this.j(3);
                                              break L1;
                                            } else {
                                              if (var2 == 18) {
                                                g.e(-96);
                                                break L1;
                                              } else {
                                                gna.a((Throwable) null, "MGS1: " + hm.e(-13514), 0);
                                                ifb.l(-123);
                                                break L1;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L3: {
                                      stackOut_29_0 = 47;
                                      stackIn_31_0 = stackOut_29_0;
                                      stackIn_30_0 = stackOut_29_0;
                                      if (12 != var2) {
                                        stackOut_31_0 = stackIn_31_0;
                                        stackOut_31_1 = 0;
                                        stackIn_32_0 = stackOut_31_0;
                                        stackIn_32_1 = stackOut_31_1;
                                        break L3;
                                      } else {
                                        stackOut_30_0 = stackIn_30_0;
                                        stackOut_30_1 = 1;
                                        stackIn_32_0 = stackOut_30_0;
                                        stackIn_32_1 = stackOut_30_1;
                                        break L3;
                                      }
                                    }
                                    var3 = tbb.a(stackIn_32_0, stackIn_32_1 != 0);
                                    hg.a((byte) 108, var3);
                                    break L1;
                                  } else {
                                    al.a(-113);
                                    break L1;
                                  }
                                } else {
                                  jnb.a(bm.field_o, vja.field_a, (ds) (Object) qga.field_b, false);
                                  break L1;
                                }
                              }
                            } else {
                              iw.k((byte) -38);
                              break L1;
                            }
                          } else {
                            tma.e((byte) -128);
                            break L1;
                          }
                        }
                      } else {
                        fb.a(0);
                        break L1;
                      }
                    } else {
                      ejb.a(1);
                      break L1;
                    }
                  }
                }
                L4: {
                  if (param0 > 57) {
                    break L4;
                  } else {
                    int discarded$1 = ((ms) this).f(-115);
                    break L4;
                  }
                }
                return;
              }
            } else {
              break L0;
            }
          }
        }
        gna.a((Throwable) null, "MGS2: " + hm.e(-13514), 0);
        ifb.l(-125);
    }

    private final void c(boolean param0) {
        lna.field_o[1] = param0;
    }

    private final void j(int param0) {
        int var2 = qga.field_b.e((byte) -124);
        int var3 = -1 != (var2 & 1 ^ -1) ? 1 : 0;
        int var4 = -1 + vja.field_a;
        byte[] var5 = new byte[var4];
        qga.field_b.a(var4, 0, (byte) -50, var5);
        qp.a(var3 != 0, param0 ^ param0, vpa.b((byte) -117), qpa.a((byte) -125, var5));
    }

    private final void a(byte param0, boolean param1) {
        lna.field_o[0] = true;
        lna.field_o[18] = true;
        lna.field_o[3] = true;
        if (param0 <= 40) {
            int discarded$0 = ((ms) this).c(false, 74);
        }
        lna.field_o[7] = true;
        lna.field_o[17] = true;
        lna.field_o[8] = param1;
        lna.field_o[16] = true;
    }

    private final void e(byte param0) {
        lna.field_o[5] = true;
        if (param0 != -4) {
            Object var3 = null;
            byte[] discarded$0 = ms.b((String) null, -15);
        }
    }

    private final int a(byte param0, boolean param1, boolean param2) {
        try {
            int var4 = 0;
            int var5 = 0;
            Exception var6 = null;
            int var6_int = 0;
            ds var7 = null;
            String var8 = null;
            int var9 = 0;
            Object var10 = null;
            Object var11 = null;
            Boolean var12 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = VoidHunters.field_G;
                        var4 = tia.a(false, tcb.field_o, ahb.field_p, param2);
                        if (0 == var4) {
                            statePc = 2;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        throw new IllegalStateException();
                    }
                    case 3: {
                        if (var4 != 1) {
                            statePc = 10;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        var5 = qua.a(wlb.g((byte) -65), true, raa.e(120));
                        if (0 != (var5 ^ -1)) {
                            statePc = 6;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        qga.a(dgb.field_b, var5, (byte) 70, gob.field_a);
                        gob.field_a = null;
                        dgb.field_b = null;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        var12 = tba.a(-127);
                        if (var12 != null) {
                            statePc = 9;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        nkb.a(12, var12.booleanValue());
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        var5 = 60 % ((-49 - param0) / 41);
                        if (-3 == (var4 ^ -1)) {
                            statePc = 12;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        var6_int = wna.a(pob.b(119), wpa.a(52), ((ms) this).field_r, (byte) 111, wnb.a(88), etb.a(31065), fpb.d(true));
                        if (-1 == var6_int) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        wt.a(var6_int, -19342, gob.field_a, dgb.field_b);
                        gob.field_a = null;
                        dgb.field_b = null;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        if (3 != var4) {
                            statePc = 26;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        if (0 == dmb.field_a) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        if (-1 != dmb.field_a) {
                            statePc = 18;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        dmb.field_a = -1;
                        bna.e(0);
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 19: {
                        if (param1) {
                            statePc = 25;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        var6_int = ju.a(((ms) this).field_x, ((ms) this).field_r, wnb.a(83), (byte) 13, false, fpb.d(true));
                        if (0 != (var6_int ^ -1)) {
                            statePc = 22;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        if (var6_int != 0) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        tia.field_C = sta.field_p;
                        uk.b((byte) 49);
                        cgb.field_a = false;
                        qmb.field_q = 10;
                        statePc = 26;
                        continue stateLoop;
                    }
                    case 24: {
                        aj.a(dgb.field_b, (byte) 110, var6_int);
                        dgb.field_b = null;
                        statePc = 26;
                        continue stateLoop;
                    }
                    case 25: {
                        mlb.field_o = false;
                        statePc = 26;
                        continue stateLoop;
                    }
                    case 26: {
                        if (4 == var4) {
                            statePc = 28;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    }
                    case 28: {
                        if (!bua.field_o) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 29: {
                        wob.a(vpa.b((byte) -84), -18209);
                        statePc = 31;
                        continue stateLoop;
                    }
                    case 30: {
                        qmb.field_q = 10;
                        cgb.field_a = true;
                        statePc = 31;
                        continue stateLoop;
                    }
                    case 31: {
                        if (5 != var4) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    }
                    case 32: {
                        VoidHunters.a(vpa.b((byte) -91), 4);
                        statePc = 33;
                        continue stateLoop;
                    }
                    case 33: {
                        if (var4 != 6) {
                            statePc = 37;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    }
                    case 34: {
                        if (djb.field_r) {
                            statePc = 36;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    }
                    case 36: {
                        qmb.field_q = 10;
                        statePc = 37;
                        continue stateLoop;
                    }
                    case 37: {
                        if (-8 != (var4 ^ -1)) {
                            statePc = 39;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    }
                    case 38: {
                        ria.a(32, vpa.b((byte) -86));
                        statePc = 39;
                        continue stateLoop;
                    }
                    case 39: {
                        if (var4 != 8) {
                            statePc = 41;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    }
                    case 40: {
                        wob.a(vpa.b((byte) -90), -18209);
                        statePc = 41;
                        continue stateLoop;
                    }
                    case 41: {
                        if (var4 != 9) {
                            statePc = 43;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    }
                    case 42: {
                        jab.a(17, vpa.b((byte) -127));
                        statePc = 43;
                        continue stateLoop;
                    }
                    case 43: {
                        if ((var4 ^ -1) != -11) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    }
                    case 44: {
                        dpa.field_p.h(24335, 17);
                        statePc = 45;
                        continue stateLoop;
                    }
                    case 45: {
                        if (11 == var4) {
                            statePc = 47;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    }
                    case 47: {
                        kr.a(vpa.b((byte) -126), 5836);
                        statePc = 48;
                        continue stateLoop;
                    }
                    case 48: {
                        if (var4 != -13) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    }
                    case 49: {
                        lc.a((byte) 86, vpa.b((byte) -126), cg.a(27158));
                        statePc = 50;
                        continue stateLoop;
                    }
                    case 50: {
                        if (-14 == var4) {
                            statePc = 52;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    }
                    case 52: {
                        try {
                            if (tk.field_p != null) {
                                statePc = 54;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 61;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            tk.field_p = new bi(bm.field_o, new java.net.URL(((ms) this).getCodeBase(), "countrylist.ws"), 5000);
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 61;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            if (tk.field_p.c(104)) {
                                statePc = 56;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 61;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 61;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            var7 = tk.field_p.a(43);
                            if (var7 != null) {
                                statePc = 58;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 61;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            var10 = null;
                            ls.a((String) null, (byte) 125);
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 61;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            var8 = tja.a(0, 0, var7.field_e, var7.field_h);
                            ls.a(var8, (byte) 122);
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 61;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            tk.field_p = null;
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 61;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        var6 = (Exception) (Object) caughtException;
                        gna.a((Throwable) (Object) var6, "S1", 0);
                        var11 = null;
                        ls.a((String) null, (byte) 122);
                        tk.field_p = null;
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 62: {
                        if ((var4 ^ -1) != -16) {
                            statePc = 64;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    }
                    case 63: {
                        qmb.field_q = 10;
                        statePc = 64;
                        continue stateLoop;
                    }
                    case 64: {
                        if (16 != var4) {
                            statePc = 66;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    }
                    case 65: {
                        return 1;
                    }
                    case 66: {
                        if ((var4 ^ -1) == -18) {
                            statePc = 68;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    }
                    case 67: {
                        return 0;
                    }
                    case 68: {
                        return 2;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void d(boolean param0) {
        field_y = null;
        if (param0) {
            field_y = null;
        }
        field_A = null;
    }

    protected ms() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = new int[]{2, 3, 4, 6, 8};
    }
}
