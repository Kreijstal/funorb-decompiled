/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sg {
    int field_b;
    private int field_j;
    static int field_a;
    private int field_d;
    private int field_o;
    private int field_h;
    static dg field_l;
    private int field_e;
    private Lexicominos field_k;
    private fi field_c;
    fc field_m;
    int field_g;
    private int field_n;
    static oc field_i;
    static String field_f;

    private final void a(int param0) {
        int var3 = 0;
        L0: {
          var3 = Lexicominos.field_L ? 1 : 0;
          if (2 != ((sg) this).field_d) {
            break L0;
          } else {
            if (-3 < vb.field_i) {
              break L0;
            } else {
              if (pe.field_b < 97) {
                break L0;
              } else {
                if (122 < pe.field_b) {
                  break L0;
                } else {
                  L1: {
                    L2: {
                      if (pe.field_b != 115) {
                        break L2;
                      } else {
                        if (-2 == ((sg) this).field_n) {
                          break L2;
                        } else {
                          ((sg) this).field_n = ((sg) this).field_n + 1;
                          break L1;
                        }
                      }
                    }
                    if (pe.field_b == 115) {
                      ((sg) this).field_n = 1;
                      break L1;
                    } else {
                      L3: {
                        if (117 != pe.field_b) {
                          break L3;
                        } else {
                          if (1 == ((sg) this).field_n) {
                            ((sg) this).field_n = ((sg) this).field_n + 1;
                            break L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                      ((sg) this).field_n = 0;
                      break L1;
                    }
                  }
                  if ((((sg) this).field_n ^ -1) != -5) {
                    break L0;
                  } else {
                    System.out.println(el.field_c.field_C);
                    ((sg) this).field_n = 0;
                    break L0;
                  }
                }
              }
            }
          }
        }
        L4: {
          if (param0 == -17253) {
            break L4;
          } else {
            ((sg) this).a(true, false);
            break L4;
          }
        }
        L5: {
          L6: {
            if (-4 == ((sg) this).field_d) {
              break L6;
            } else {
              if (-13 == ((sg) this).field_d) {
                break L6;
              } else {
                if ((((sg) this).field_d ^ -1) == -14) {
                  break L6;
                } else {
                  L7: {
                    if (((sg) this).field_d == -5) {
                      break L7;
                    } else {
                      if (((sg) this).field_d == 11) {
                        break L7;
                      } else {
                        if (-9 == ((sg) this).field_d) {
                          L8: {
                            if ((da.field_b ^ -1) == -99) {
                              L9: {
                                if (((sg) this).field_c.field_d == -1) {
                                  break L9;
                                } else {
                                  if (1 >= ((sg) this).field_c.field_d) {
                                    ((sg) this).field_c.a(2, 101);
                                    break L8;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              ((sg) this).field_c.a(0, 91);
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          L10: {
                            if (-100 == (da.field_b ^ -1)) {
                              if (((sg) this).field_c.field_d == 2) {
                                ((sg) this).field_c.a(0, 91);
                                break L10;
                              } else {
                                ((sg) this).field_c.a(2, 108);
                                break L10;
                              }
                            } else {
                              break L10;
                            }
                          }
                          L11: {
                            if (-97 != da.field_b) {
                              break L11;
                            } else {
                              if (1 > ((sg) this).field_c.field_d) {
                                ((sg) this).field_c.a(1, 113);
                                break L11;
                              } else {
                                if (-2 == ((sg) this).field_c.field_d) {
                                  ((sg) this).field_c.a(0, 87);
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                            }
                          }
                          if (97 == da.field_b) {
                            if (((sg) this).field_c.field_d != 0) {
                              if ((((sg) this).field_c.field_d ^ -1) <= -3) {
                                ((sg) this).field_c.b((byte) 24);
                                break L5;
                              } else {
                                ((sg) this).field_c.a(0, 89);
                                ((sg) this).field_c.b((byte) 24);
                                break L5;
                              }
                            } else {
                              ((sg) this).field_c.a(1, 120);
                              ((sg) this).field_c.b((byte) 24);
                              break L5;
                            }
                          } else {
                            ((sg) this).field_c.a(0, 89);
                            break L5;
                          }
                        } else {
                          L12: {
                            if (((sg) this).field_d >= -9) {
                              break L12;
                            } else {
                              if (-12 <= ((sg) this).field_d) {
                                break L12;
                              } else {
                                L13: {
                                  if (98 != da.field_b) {
                                    break L13;
                                  } else {
                                    L14: {
                                      if (0 == (((sg) this).field_c.field_d ^ -1)) {
                                        break L14;
                                      } else {
                                        if (((sg) this).field_c.field_d > 2) {
                                          break L14;
                                        } else {
                                          ((sg) this).field_c.a(3, 126);
                                          break L13;
                                        }
                                      }
                                    }
                                    ((sg) this).field_c.a(1, 114);
                                    break L13;
                                  }
                                }
                                L15: {
                                  if (-100 == da.field_b) {
                                    if (-4 == ((sg) this).field_c.field_d) {
                                      ((sg) this).field_c.a(1, param0 ^ -17167);
                                      break L15;
                                    } else {
                                      ((sg) this).field_c.a(3, 88);
                                      break L15;
                                    }
                                  } else {
                                    break L15;
                                  }
                                }
                                L16: {
                                  if ((da.field_b ^ -1) == -97) {
                                    if (((sg) this).field_c.field_d < 1) {
                                      ((sg) this).field_c.a(2, 97);
                                      break L16;
                                    } else {
                                      if (3 <= ((sg) this).field_c.field_d) {
                                        break L16;
                                      } else {
                                        ((sg) this).field_c.a(((sg) this).field_c.field_d - 1, 104);
                                        break L16;
                                      }
                                    }
                                  } else {
                                    break L16;
                                  }
                                }
                                L17: {
                                  if (da.field_b != 97) {
                                    break L17;
                                  } else {
                                    if (0 != ((sg) this).field_c.field_d) {
                                      if ((((sg) this).field_c.field_d ^ -1) != -2) {
                                        if (3 <= ((sg) this).field_c.field_d) {
                                          break L17;
                                        } else {
                                          ((sg) this).field_c.a(0, 90);
                                          ((sg) this).field_c.b((byte) 86);
                                          break L5;
                                        }
                                      } else {
                                        ((sg) this).field_c.a(2, param0 + 17344);
                                        ((sg) this).field_c.b((byte) 86);
                                        break L5;
                                      }
                                    } else {
                                      ((sg) this).field_c.a(1, 121);
                                      ((sg) this).field_c.a(0, 90);
                                      break L5;
                                    }
                                  }
                                }
                                ((sg) this).field_c.b((byte) 86);
                                break L5;
                              }
                            }
                          }
                          ((sg) this).field_c.a((byte) -123);
                          break L5;
                        }
                      }
                    }
                  }
                  L18: {
                    if (da.field_b != 98) {
                      break L18;
                    } else {
                      L19: {
                        if ((((sg) this).field_c.field_d ^ -1) == 0) {
                          break L19;
                        } else {
                          if ((((sg) this).field_c.field_d ^ -1) >= -2) {
                            ((sg) this).field_c.a(2, 107);
                            break L18;
                          } else {
                            break L19;
                          }
                        }
                      }
                      ((sg) this).field_c.a(1, param0 + 17376);
                      break L18;
                    }
                  }
                  L20: {
                    if ((da.field_b ^ -1) != -100) {
                      break L20;
                    } else {
                      if (((sg) this).field_c.field_d != 2) {
                        ((sg) this).field_c.a(2, param0 ^ -17213);
                        break L20;
                      } else {
                        ((sg) this).field_c.a(1, 86);
                        break L20;
                      }
                    }
                  }
                  L21: {
                    if (96 != da.field_b) {
                      break L21;
                    } else {
                      if ((((sg) this).field_c.field_d ^ -1) > -2) {
                        ((sg) this).field_c.a(1, 116);
                        break L21;
                      } else {
                        if (1 != ((sg) this).field_c.field_d) {
                          break L21;
                        } else {
                          ((sg) this).field_c.a(0, 103);
                          break L21;
                        }
                      }
                    }
                  }
                  if (-98 != (da.field_b ^ -1)) {
                    ((sg) this).field_c.b((byte) -128);
                    break L5;
                  } else {
                    if (0 == ((sg) this).field_c.field_d) {
                      ((sg) this).field_c.a(1, 109);
                      ((sg) this).field_c.b((byte) -128);
                      break L5;
                    } else {
                      if (((sg) this).field_c.field_d < 2) {
                        ((sg) this).field_c.a(0, param0 + 17341);
                        ((sg) this).field_c.b((byte) -128);
                        break L5;
                      } else {
                        ((sg) this).field_c.b((byte) -128);
                        break L5;
                      }
                    }
                  }
                }
              }
            }
          }
          ((sg) this).field_c.c((byte) 110);
          break L5;
        }
    }

    final static void a(java.awt.Component param0, int param1) {
        param0.setFocusTraversalKeysEnabled(false);
        if (param1 != 2) {
            boolean discarded$0 = sg.a(false);
        }
        param0.addKeyListener((java.awt.event.KeyListener) (Object) ol.field_l);
        param0.addFocusListener((java.awt.event.FocusListener) (Object) ol.field_l);
    }

    private final void a(byte param0, int param1, int param2) {
        lf.b(param2, param1, 40, 40, 6, 12845056);
        int var4 = 22 / ((param0 - 2) / 34);
        lf.b(param2 - -1, 1 + param1, 38, 38, 4, 12845056);
        lf.b(param2 + 2, param1 - -2, 36, 36, 2, 12845056);
        lf.b(param2 - -2, param1 + 2, 36, 36, 3, 12845056);
    }

    private final void a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        String var9_ref = null;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var15 = Lexicominos.field_L ? 1 : 0;
          if (!param0) {
            stackOut_2_0 = sc.field_g;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = ee.field_a;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var3 = stackIn_3_0;
        var4 = -50 / ((param1 - -36) / 58);
        if (((sg) this).field_e <= -1) {
          L1: {
            if (!ki.a((byte) -116)) {
              int discarded$3 = bi.field_a.a(tj.field_k, 48, 50, 242, qc.field_c[((sg) this).field_d] - 100, 0, -1, 1, 1, bi.field_a.field_C);
              break L1;
            } else {
              int discarded$4 = bi.field_a.a(tj.field_k + "<br><br>" + al.field_G, 48, 50, 242, qc.field_c[((sg) this).field_d] - 100, 0, -1, 1, 1, bi.field_a.field_C);
              break L1;
            }
          }
          return;
        } else {
          L2: {
            if ((1 << ((sg) this).field_e & var3) == 0) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L2;
            } else {
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L2;
            }
          }
          L3: {
            var5 = stackIn_7_0;
            if ((((sg) this).field_e ^ -1) <= -16) {
              if (var5 == 0) {
                stackOut_11_0 = 1;
                stackIn_13_0 = stackOut_11_0;
                break L3;
              } else {
                stackOut_10_0 = 0;
                stackIn_13_0 = stackOut_10_0;
                break L3;
              }
            } else {
              stackOut_8_0 = 0;
              stackIn_13_0 = stackOut_8_0;
              break L3;
            }
          }
          L4: {
            var6 = stackIn_13_0;
            bi.field_a.a(df.field_d[((sg) this).field_e], 155, 58, 0, -1);
            var7 = bi.field_a.field_C;
            var8 = 58 - -var7;
            if (var5 == 0) {
              bi.field_a.a(uc.field_mb, 155, var8, 16711680, -1);
              this.a(e.field_u, 0, 91, var8);
              break L4;
            } else {
              bi.field_a.a(ni.field_c, 155, var8, 0, -1);
              this.a(ef.field_d[((sg) this).field_e], 0, 91, var8);
              break L4;
            }
          }
          L5: {
            var8 = var8 + (128 - -bi.field_a.field_E);
            var9 = hc.field_ib[((sg) this).field_e];
            if (var6 == 0) {
              break L5;
            } else {
              var9_ref = of.field_b;
              var10 = var9_ref;
              var10 = var9_ref;
              break L5;
            }
          }
          L6: {
            int discarded$5 = bi.field_a.a(var9_ref, 48, -bi.field_a.field_E + var8, 242, 1000, 0, -1, 1, 0, var7);
            var8 = var8 + 2 * var7;
            var10 = Integer.toString(hi.field_c[((sg) this).field_e] * 100);
            if (var6 == 0) {
              break L6;
            } else {
              var10 = "?";
              break L6;
            }
          }
          L7: {
            bi.field_a.a(w.field_s + var10, 169, var8, 0, -1);
            var8 = var8 + var7;
            var11 = bi.field_a.b(he.field_i);
            if (var6 == 0) {
              var12 = hi.field_c[((sg) this).field_e];
              var13 = (var12 - 1) * 10 + (var11 - -(ob.field_e.field_p >> 1998512962));
              var14 = -var13 + 338 >> -630446751;
              bi.field_a.b(he.field_i, var14, var8, 0, -1);
              var14 = var14 + var11;
              L8: while (true) {
                if (0 >= var12) {
                  break L7;
                } else {
                  ob.field_e.c(var14, -bi.field_a.field_E + var8);
                  var14 += 10;
                  var12--;
                  continue L8;
                }
              }
            } else {
              var12 = var11 - (-(ob.field_e.field_p >> -1978028414) + -bi.field_a.b(id.field_t));
              var13 = 338 - var12 >> 511117217;
              bi.field_a.b(he.field_i, var13, var8, 0, -1);
              var13 = var13 + var11;
              ob.field_e.c(var13, var8 - bi.field_a.field_E);
              bi.field_a.b(id.field_t, var13 + (ob.field_e.field_p >> 1287347426), var8, 0, -1);
              break L7;
            }
          }
          var8 = var8 + ob.field_e.field_u;
          return;
        }
    }

    final static ra a(int param0, int param1, int param2, int param3, int param4, ab param5) {
        java.awt.Frame var8 = oh.a(param2, param1, param4, (byte) 64, param3, param5);
        java.awt.Frame var6 = var8;
        if (var8 == null) {
            return null;
        }
        ra var7 = new ra();
        var7.field_b = var8;
        java.awt.Component discarded$0 = var7.field_b.add((java.awt.Component) (Object) var7);
        var7.setBounds(param0, 0, param1, param2);
        var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
        var7.requestFocus();
        return var7;
    }

    private final void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        sg var7 = null;
        sg var8 = null;
        int stackIn_134_0 = 0;
        Lexicominos stackIn_136_0 = null;
        int stackIn_136_1 = 0;
        boolean stackIn_136_2 = false;
        Lexicominos stackIn_137_0 = null;
        int stackIn_137_1 = 0;
        boolean stackIn_137_2 = false;
        Lexicominos stackIn_138_0 = null;
        int stackIn_138_1 = 0;
        boolean stackIn_138_2 = false;
        int stackIn_138_3 = 0;
        Lexicominos stackOut_135_0 = null;
        int stackOut_135_1 = 0;
        boolean stackOut_135_2 = false;
        Lexicominos stackOut_137_0 = null;
        int stackOut_137_1 = 0;
        boolean stackOut_137_2 = false;
        int stackOut_137_3 = 0;
        Lexicominos stackOut_136_0 = null;
        int stackOut_136_1 = 0;
        boolean stackOut_136_2 = false;
        int stackOut_136_3 = 0;
        int stackOut_133_0 = 0;
        int stackOut_132_0 = 0;
        L0: {
          var6 = Lexicominos.field_L ? 1 : 0;
          var4 = qc.field_a[((sg) this).field_d][param2];
          if (-2 != var4) {
            if (-3 == var4) {
              if (!((sg) this).field_c.d(0)) {
                break L0;
              } else {
                L1: {
                  if (((sg) this).field_d < 8) {
                    break L1;
                  } else {
                    if (11 < ((sg) this).field_d) {
                      break L1;
                    } else {
                      ((sg) this).field_k.a((byte) -51, param1, 0, 0);
                      break L0;
                    }
                  }
                }
                ((sg) this).field_k.a((byte) -73, param1, ((sg) this).field_g, vg.field_d[((sg) this).field_g].field_g);
                break L0;
              }
            } else {
              if (var4 != -15) {
                if (5 == var4) {
                  if (!((sg) this).field_c.d(0)) {
                    break L0;
                  } else {
                    ((sg) this).field_k.a((byte) 98, param1, 1, 0);
                    break L0;
                  }
                } else {
                  if (16 != var4) {
                    if (-18 == var4) {
                      if (!((sg) this).field_c.d(0)) {
                        break L0;
                      } else {
                        if ((((sg) this).field_d ^ -1) != -5) {
                          if (((sg) this).field_d != -14) {
                            if (-9 >= ((sg) this).field_d) {
                              break L0;
                            } else {
                              if (11 < ((sg) this).field_d) {
                                break L0;
                              } else {
                                ((sg) this).field_k.a((byte) -44, param1, -1 + ((sg) this).field_d, 14);
                                var4 = -1;
                                var5 = 0;
                                L2: while (true) {
                                  if (var5 >= qc.field_a[((sg) this).field_d - 1].length) {
                                    L3: {
                                      if (-1 != var4) {
                                        break L3;
                                      } else {
                                        var5 = 0;
                                        L4: while (true) {
                                          if (var5 >= qc.field_a[-1 + ((sg) this).field_d].length) {
                                            break L3;
                                          } else {
                                            L5: {
                                              if ((qc.field_a[((sg) this).field_d + -1][var5] ^ -1) != -17) {
                                                break L5;
                                              } else {
                                                break L5;
                                              }
                                            }
                                            var5++;
                                            continue L4;
                                          }
                                        }
                                      }
                                    }
                                    var8 = vg.field_d[-1 + ((sg) this).field_d];
                                    var8.field_c.a(0, param1, var8.a(bk.field_b, sh.field_e, 640), var4);
                                    break L0;
                                  } else {
                                    L6: {
                                      if (17 != qc.field_a[-1 + ((sg) this).field_d][var5]) {
                                        break L6;
                                      } else {
                                        break L6;
                                      }
                                    }
                                    var5++;
                                    continue L2;
                                  }
                                }
                              }
                            }
                          } else {
                            ((sg) this).field_k.a((byte) 120, param1, 12, ((sg) this).field_g);
                            break L0;
                          }
                        } else {
                          ((sg) this).field_k.a((byte) 121, param1, 3, ((sg) this).field_g);
                          break L0;
                        }
                      }
                    } else {
                      if (var4 != 13) {
                        if (-7 != (var4 ^ -1)) {
                          if ((var4 ^ -1) == -20) {
                            if (((sg) this).field_c.d(0)) {
                              ((sg) this).field_k.a((byte) 116, param1, ((sg) this).field_g, 14);
                              break L0;
                            } else {
                              break L0;
                            }
                          } else {
                            if ((var4 ^ -1) != -21) {
                              if (var4 != -9) {
                                if (-16 == var4) {
                                  if (!((sg) this).field_c.d(0)) {
                                    break L0;
                                  } else {
                                    ((sg) this).field_k.a((byte) -85, param1, 5, ((sg) this).field_d);
                                    break L0;
                                  }
                                } else {
                                  if (12 != var4) {
                                    if (var4 != 11) {
                                      if (-10 == (var4 ^ -1)) {
                                        if (!((sg) this).field_c.b(-98)) {
                                          if (!((sg) this).field_c.e(471859200)) {
                                            break L0;
                                          } else {
                                            tg.field_j = 32 / tg.field_j;
                                            break L0;
                                          }
                                        } else {
                                          tg.field_j = 32 / tg.field_j;
                                          break L0;
                                        }
                                      } else {
                                        if (var4 != 10) {
                                          if (var4 == -5) {
                                            L7: {
                                              if (((sg) this).field_c.e((byte) -60)) {
                                                g.a(0, 118);
                                                break L7;
                                              } else {
                                                break L7;
                                              }
                                            }
                                            L8: {
                                              if (!((sg) this).field_c.a(-104)) {
                                                break L8;
                                              } else {
                                                g.a(256, 92);
                                                break L8;
                                              }
                                            }
                                            L9: {
                                              if (!((sg) this).field_c.c(-1)) {
                                                break L9;
                                              } else {
                                                var4 = this.a(bk.field_b, sh.field_e, (byte) 95);
                                                if (0 <= var4) {
                                                  g.a(var4, 107);
                                                  break L9;
                                                } else {
                                                  break L9;
                                                }
                                              }
                                            }
                                            L10: {
                                              if (((sg) this).field_c.f(98)) {
                                                if (oc.field_e <= 32) {
                                                  g.a(0, 112);
                                                  break L10;
                                                } else {
                                                  g.a(-32 + oc.field_e, 80);
                                                  break L10;
                                                }
                                              } else {
                                                break L10;
                                              }
                                            }
                                            if (((sg) this).field_c.d((byte) 85)) {
                                              if ((oc.field_e ^ -1) <= -225) {
                                                g.a(256, 115);
                                                break L0;
                                              } else {
                                                g.a(32 + oc.field_e, 89);
                                                break L0;
                                              }
                                            } else {
                                              break L0;
                                            }
                                          } else {
                                            if (7 != var4) {
                                              if (-4 != var4) {
                                                if (var4 == 18) {
                                                  if (!((sg) this).field_c.d(0)) {
                                                    break L0;
                                                  } else {
                                                    ((sg) this).field_k.a((byte) 83, param1, 8, 14);
                                                    break L0;
                                                  }
                                                } else {
                                                  if (var4 == 21) {
                                                    L11: {
                                                      if (!((sg) this).field_c.d(0)) {
                                                        break L11;
                                                      } else {
                                                        if (param1) {
                                                          var4 = this.a(false, ck.field_a, ef.field_a, -89);
                                                          if (var4 != -1) {
                                                            jf.field_I = var4;
                                                            break L11;
                                                          } else {
                                                            break L11;
                                                          }
                                                        } else {
                                                          break L11;
                                                        }
                                                      }
                                                    }
                                                    L12: {
                                                      if (!((sg) this).field_c.f(-126)) {
                                                        break L12;
                                                      } else {
                                                        if (!param1) {
                                                          jf.field_I = jf.field_I - 1;
                                                          if (jf.field_I - 1 < 0) {
                                                            jf.field_I = fl.field_a.length + -1;
                                                            break L12;
                                                          } else {
                                                            break L12;
                                                          }
                                                        } else {
                                                          break L12;
                                                        }
                                                      }
                                                    }
                                                    if (!((sg) this).field_c.d((byte) 88)) {
                                                      break L0;
                                                    } else {
                                                      if (!param1) {
                                                        jf.field_I = jf.field_I + 1;
                                                        if (jf.field_I + 1 != fl.field_a.length) {
                                                          break L0;
                                                        } else {
                                                          jf.field_I = 0;
                                                          break L0;
                                                        }
                                                      } else {
                                                        break L0;
                                                      }
                                                    }
                                                  } else {
                                                    throw new IllegalStateException();
                                                  }
                                                }
                                              } else {
                                                L13: {
                                                  if (!((sg) this).field_c.e(471859200)) {
                                                    break L13;
                                                  } else {
                                                    L14: while (true) {
                                                      L15: {
                                                        if (rg.field_b == 0) {
                                                          rg.field_b = id.field_w.length;
                                                          break L15;
                                                        } else {
                                                          break L15;
                                                        }
                                                      }
                                                      rg.field_b = rg.field_b - 1;
                                                      if (id.field_w[rg.field_b].field_e) {
                                                        continue L14;
                                                      } else {
                                                        break L13;
                                                      }
                                                    }
                                                  }
                                                }
                                                if (!((sg) this).field_c.b(-98)) {
                                                  break L0;
                                                } else {
                                                  L16: while (true) {
                                                    L17: {
                                                      rg.field_b = rg.field_b + 1;
                                                      if (rg.field_b == id.field_w.length) {
                                                        rg.field_b = 0;
                                                        break L17;
                                                      } else {
                                                        break L17;
                                                      }
                                                    }
                                                    if (id.field_w[rg.field_b].field_e) {
                                                      continue L16;
                                                    } else {
                                                      break L0;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              L18: {
                                                if (!((sg) this).field_c.e((byte) -60)) {
                                                  break L18;
                                                } else {
                                                  uh.field_n.a(0, 0);
                                                  break L18;
                                                }
                                              }
                                              L19: {
                                                if (((sg) this).field_c.a(-104)) {
                                                  uh.field_n.a(0, 256);
                                                  break L19;
                                                } else {
                                                  break L19;
                                                }
                                              }
                                              L20: {
                                                if (!((sg) this).field_c.c(-1)) {
                                                  break L20;
                                                } else {
                                                  var4 = this.a(bk.field_b, sh.field_e, (byte) 95);
                                                  if (var4 >= 0) {
                                                    uh.field_n.a(0, var4);
                                                    break L20;
                                                  } else {
                                                    break L20;
                                                  }
                                                }
                                              }
                                              L21: {
                                                if (((sg) this).field_c.f(-50)) {
                                                  if (uh.field_n.field_u > 32) {
                                                    uh.field_n.a(0, uh.field_n.field_u + -32);
                                                    break L21;
                                                  } else {
                                                    uh.field_n.a(0, 0);
                                                    break L21;
                                                  }
                                                } else {
                                                  break L21;
                                                }
                                              }
                                              if (((sg) this).field_c.d((byte) 126)) {
                                                if (uh.field_n.field_u >= 224) {
                                                  uh.field_n.a(0, 256);
                                                  break L0;
                                                } else {
                                                  uh.field_n.a(0, uh.field_n.field_u + 32);
                                                  break L0;
                                                }
                                              } else {
                                                break L0;
                                              }
                                            }
                                          }
                                        } else {
                                          if (!((sg) this).field_c.d(0)) {
                                            break L0;
                                          } else {
                                            if (null == ff.field_b) {
                                              var4 = param1 ? 1 : 0;
                                              kl.a(3 * bi.field_a.field_E >> -341300095, 4, 320, jh.field_b, 12, (le) (Object) bi.field_a, 4, (byte) -33, nh.field_c, var4 != 0, 1 + bi.field_a.field_E, 240);
                                              break L0;
                                            } else {
                                              af.a(-85);
                                              break L0;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      if (!((sg) this).field_c.d(0)) {
                                        break L0;
                                      } else {
                                        el.field_c.a((byte) 99, 4);
                                        th.field_o[2].e(0);
                                        if (!ki.a((byte) -118)) {
                                          L22: {
                                            stackOut_135_0 = ((sg) this).field_k;
                                            stackOut_135_1 = -52;
                                            stackOut_135_2 = param1;
                                            stackIn_137_0 = stackOut_135_0;
                                            stackIn_137_1 = stackOut_135_1;
                                            stackIn_137_2 = stackOut_135_2;
                                            stackIn_136_0 = stackOut_135_0;
                                            stackIn_136_1 = stackOut_135_1;
                                            stackIn_136_2 = stackOut_135_2;
                                            if (0 >= ee.field_a) {
                                              stackOut_137_0 = (Lexicominos) (Object) stackIn_137_0;
                                              stackOut_137_1 = stackIn_137_1;
                                              stackOut_137_2 = stackIn_137_2;
                                              stackOut_137_3 = 1;
                                              stackIn_138_0 = stackOut_137_0;
                                              stackIn_138_1 = stackOut_137_1;
                                              stackIn_138_2 = stackOut_137_2;
                                              stackIn_138_3 = stackOut_137_3;
                                              break L22;
                                            } else {
                                              stackOut_136_0 = (Lexicominos) (Object) stackIn_136_0;
                                              stackOut_136_1 = stackIn_136_1;
                                              stackOut_136_2 = stackIn_136_2;
                                              stackOut_136_3 = 7;
                                              stackIn_138_0 = stackOut_136_0;
                                              stackIn_138_1 = stackOut_136_1;
                                              stackIn_138_2 = stackOut_136_2;
                                              stackIn_138_3 = stackOut_136_3;
                                              break L22;
                                            }
                                          }
                                          ((Lexicominos) (Object) stackIn_138_0).a((byte) stackIn_138_1, stackIn_138_2, stackIn_138_3, 0);
                                          break L0;
                                        } else {
                                          L23: {
                                            if ((ee.field_a | el.field_c.field_J) != 0) {
                                              stackOut_133_0 = 6;
                                              stackIn_134_0 = stackOut_133_0;
                                              break L23;
                                            } else {
                                              stackOut_132_0 = 0;
                                              stackIn_134_0 = stackOut_132_0;
                                              break L23;
                                            }
                                          }
                                          var4 = stackIn_134_0;
                                          ((sg) this).field_k.a((byte) -47, param1, var4, var4);
                                          break L0;
                                        }
                                      }
                                    }
                                  } else {
                                    if (((sg) this).field_c.d(0)) {
                                      ((sg) this).field_k.a((byte) -74, param1, -2, -2);
                                      break L0;
                                    } else {
                                      break L0;
                                    }
                                  }
                                }
                              } else {
                                if (((sg) this).field_c.d(0)) {
                                  L24: {
                                    if (-3 == (((sg) this).field_d ^ -1)) {
                                      break L24;
                                    } else {
                                      if (((sg) this).field_d != 14) {
                                        ((sg) this).field_k.a((byte) -126, param1, 3, ((sg) this).field_d);
                                        break L0;
                                      } else {
                                        break L24;
                                      }
                                    }
                                  }
                                  ((sg) this).field_k.a((byte) 76, param1, 12, ((sg) this).field_d);
                                  break L0;
                                } else {
                                  break L0;
                                }
                              }
                            } else {
                              if (((sg) this).field_c.d(0)) {
                                ((sg) this).field_k.a((byte) -54, param1, 0, 0);
                                break L0;
                              } else {
                                break L0;
                              }
                            }
                          }
                        } else {
                          if (!((sg) this).field_c.d(0)) {
                            break L0;
                          } else {
                            ((sg) this).field_k.a((byte) -83, param1, -1, 2);
                            break L0;
                          }
                        }
                      } else {
                        if (((sg) this).field_c.d(0)) {
                          L25: {
                            if (((sg) this).field_d == 5) {
                              break L25;
                            } else {
                              if (-2 != (((sg) this).field_d ^ -1)) {
                                if (6 == ((sg) this).field_d) {
                                  qc.a(((sg) this).field_d, 7, 64);
                                  break L0;
                                } else {
                                  break L0;
                                }
                              } else {
                                break L25;
                              }
                            }
                          }
                          qc.a(((sg) this).field_d, ((sg) this).field_d, 39);
                          break L0;
                        } else {
                          break L0;
                        }
                      }
                    }
                  } else {
                    if (((sg) this).field_c.d(0)) {
                      if (3 == ((sg) this).field_d) {
                        ((sg) this).field_k.a((byte) -47, param1, 4, ((sg) this).field_g);
                        break L0;
                      } else {
                        if (((sg) this).field_d != -13) {
                          if (-9 > ((sg) this).field_d) {
                            break L0;
                          } else {
                            if (-12 < (((sg) this).field_d ^ -1)) {
                              ((sg) this).field_k.a((byte) 115, param1, 1 + ((sg) this).field_d, 14);
                              var4 = -1;
                              var5 = 0;
                              L26: while (true) {
                                if (qc.field_a[1 + ((sg) this).field_d].length <= var5) {
                                  L27: {
                                    if (var4 != -1) {
                                      break L27;
                                    } else {
                                      var5 = 0;
                                      L28: while (true) {
                                        if (var5 >= qc.field_a[((sg) this).field_d - -1].length) {
                                          break L27;
                                        } else {
                                          L29: {
                                            if ((qc.field_a[((sg) this).field_d - -1][var5] ^ -1) != -2) {
                                              break L29;
                                            } else {
                                              break L29;
                                            }
                                          }
                                          var5++;
                                          continue L28;
                                        }
                                      }
                                    }
                                  }
                                  var7 = vg.field_d[((sg) this).field_d + 1];
                                  var7.field_c.a(0, param1, var7.a(bk.field_b, sh.field_e, 640), var4);
                                  break L0;
                                } else {
                                  L30: {
                                    if (16 != qc.field_a[1 + ((sg) this).field_d][var5]) {
                                      break L30;
                                    } else {
                                      break L30;
                                    }
                                  }
                                  var5++;
                                  continue L26;
                                }
                              }
                            } else {
                              break L0;
                            }
                          }
                        } else {
                          ((sg) this).field_k.a((byte) 119, param1, 13, ((sg) this).field_g);
                          break L0;
                        }
                      }
                    } else {
                      break L0;
                    }
                  }
                }
              } else {
                if (!((sg) this).field_c.d(0)) {
                  break L0;
                } else {
                  ((sg) this).field_k.a((byte) 118, param1, 0, 0);
                  break L0;
                }
              }
            }
          } else {
            if (((sg) this).field_c.d(0)) {
              L31: {
                if (!ve.field_a) {
                  break L31;
                } else {
                  if (ki.a((byte) -118)) {
                    break L31;
                  } else {
                    L32: {
                      if (!hh.field_N.field_k) {
                        break L32;
                      } else {
                        break L32;
                      }
                    }
                    ve.field_a = false;
                    break L31;
                  }
                }
              }
              if (!ve.field_a) {
                L33: {
                  if (el.field_c == null) {
                    break L33;
                  } else {
                    if (el.field_c.a((byte) 94)) {
                      break L33;
                    } else {
                      ((sg) this).field_k.a((byte) -105, param1, -1, 2);
                      break L0;
                    }
                  }
                }
                L34: {
                  hh.field_N = null;
                  if (-3 < (vb.field_i ^ -1)) {
                    break L34;
                  } else {
                    if (wa.field_j[82]) {
                      oe.field_a = 0;
                      break L34;
                    } else {
                      break L34;
                    }
                  }
                }
                ki.field_d = null;
                el.field_c = new fc(((sg) this).field_k, id.field_w[rg.field_b], new Random());
                ((sg) this).field_k.a((byte) 126, param1, -1, 2);
                ki.a(960000, el.field_c.field_I, -128);
                break L0;
              } else {
                ((sg) this).field_k.a((byte) 127, param1, 8, 14);
                break L0;
              }
            } else {
              break L0;
            }
          }
        }
        L35: {
          if (param0 > 89) {
            break L35;
          } else {
            ((sg) this).field_d = -27;
            break L35;
          }
        }
    }

    public static void b(int param0) {
        field_i = null;
        field_f = null;
        field_l = null;
        if (param0 != 0) {
            sg.b(80);
        }
    }

    private final int b(byte param0, int param1) {
        if (param0 == -19) {
          L0: {
            if (((sg) this).field_d == 3) {
              break L0;
            } else {
              if (12 == ((sg) this).field_d) {
                break L0;
              } else {
                if (13 != ((sg) this).field_d) {
                  if (((sg) this).field_d != 4) {
                    L1: {
                      if (-9 == (((sg) this).field_d ^ -1)) {
                        break L1;
                      } else {
                        if (((sg) this).field_d == -12) {
                          break L1;
                        } else {
                          L2: {
                            if (-9 >= ((sg) this).field_d) {
                              break L2;
                            } else {
                              if ((((sg) this).field_d ^ -1) > -12) {
                                if (param1 < 3) {
                                  return qc.field_c[((sg) this).field_d] + gg.field_a[0].field_x;
                                } else {
                                  return qc.field_c[((sg) this).field_d];
                                }
                              } else {
                                break L2;
                              }
                            }
                          }
                          return param1 * uk.field_U[((sg) this).field_d] + qc.field_c[((sg) this).field_d];
                        }
                      }
                    }
                    if (2 <= param1) {
                      return qc.field_c[((sg) this).field_d];
                    } else {
                      return qc.field_c[((sg) this).field_d] - -gg.field_a[0].field_x;
                    }
                  } else {
                    if (param1 >= 2) {
                      return qc.field_c[((sg) this).field_d];
                    } else {
                      return gg.field_a[0].field_x + qc.field_c[((sg) this).field_d];
                    }
                  }
                } else {
                  break L0;
                }
              }
            }
          }
          return qc.field_c[((sg) this).field_d];
        } else {
          return -42;
        }
    }

    private final void b(boolean param0, int param1) {
        int var3 = 0;
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
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_22_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        L0: {
          var15 = Lexicominos.field_L ? 1 : 0;
          if ((bk.field_b ^ -1) != 0) {
            stackOut_2_0 = qb.field_b[sh.field_e * 640 + bk.field_b];
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (var5 < 0) {
            var3 = -1;
            var4 = -1;
            break L1;
          } else {
            var4 = 2 + (var5 & 2047) >> -1296284414;
            var3 = (2047 & var5 >> -97695605) + 2 >> -1318811422;
            break L1;
          }
        }
        L2: {
          if (-1 == ((sg) this).field_o) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = qb.field_b[((sg) this).field_o + ((sg) this).field_j * 640];
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var5 = stackIn_9_0;
          if (-1 >= (var5 ^ -1)) {
            var6 = 2 + ((4193020 & var5) >> 965489643) >> 368644226;
            var7 = (2047 & var5) + 2 >> 1550815234;
            break L3;
          } else {
            var6 = -1;
            var7 = -1;
            break L3;
          }
        }
        L4: {
          if (!param0) {
            stackOut_14_0 = sc.field_g;
            stackIn_15_0 = stackOut_14_0;
            break L4;
          } else {
            stackOut_13_0 = ee.field_a;
            stackIn_15_0 = stackOut_13_0;
            break L4;
          }
        }
        L5: {
          var8 = stackIn_15_0;
          var9 = 0;
          var10 = -1 + jf.a((byte) 108, ee.field_a);
          ((sg) this).field_e = -1;
          if (param1 == 640) {
            break L5;
          } else {
            field_a = 35;
            break L5;
          }
        }
        var11 = 0;
        L6: while (true) {
          if (df.field_d.length <= var11) {
            L7: {
              if (0 <= (((sg) this).field_h ^ -1)) {
                break L7;
              } else {
                ((sg) this).field_e = ((sg) this).field_h;
                break L7;
              }
            }
            return;
          } else {
            L8: {
              if ((var8 & 1 << var11) == 0) {
                stackOut_21_0 = 0;
                stackIn_22_0 = stackOut_21_0;
                break L8;
              } else {
                stackOut_20_0 = 1;
                stackIn_22_0 = stackOut_20_0;
                break L8;
              }
            }
            L9: {
              var12 = stackIn_22_0;
              if (var12 != 0) {
                break L9;
              } else {
                if ((var11 ^ -1) != -15) {
                  if (!param0) {
                    break L9;
                  } else {
                    var11++;
                    continue L6;
                  }
                } else {
                  var11++;
                  continue L6;
                }
              }
            }
            L10: {
              if (param0) {
                var13 = ik.field_s[sb.field_e[var10][var9]];
                var14 = ik.field_b[sb.field_e[var10][var9]];
                var9++;
                break L10;
              } else {
                var13 = ik.field_s[var11];
                var14 = ik.field_b[var11];
                break L10;
              }
            }
            L11: {
              if (var12 != 0) {
                ef.field_d[var11].c(var13, var14);
                break L11;
              } else {
                e.field_u.c(var13, var14);
                break L11;
              }
            }
            L12: {
              if (var3 < var13) {
                break L12;
              } else {
                if (var3 > 32 + var13) {
                  break L12;
                } else {
                  if (var4 < var14) {
                    break L12;
                  } else {
                    if (var4 > 32 + var14) {
                      break L12;
                    } else {
                      ((sg) this).field_e = var11;
                      if (var12 != 0) {
                        md.field_A[var11].c(var13, var14);
                        break L12;
                      } else {
                        fl.field_c.c(var13, var14);
                        break L12;
                      }
                    }
                  }
                }
              }
            }
            L13: {
              if (-1 == ((sg) this).field_o) {
                break L13;
              } else {
                if (var13 > var6) {
                  break L13;
                } else {
                  if (var6 > var13 + 32) {
                    break L13;
                  } else {
                    if (var7 < var14) {
                      break L13;
                    } else {
                      if (var14 - -32 >= var7) {
                        ((sg) this).field_o = -1;
                        if (((sg) this).field_h == var11) {
                          ((sg) this).field_h = -1;
                          break L13;
                        } else {
                          ((sg) this).field_h = var11;
                          break L13;
                        }
                      } else {
                        break L13;
                      }
                    }
                  }
                }
              }
            }
            if (((sg) this).field_h == var11) {
              if (var12 == 0) {
                ri.field_b.c(var13, var14);
                var11++;
                continue L6;
              } else {
                fc.field_e[var11].c(var13, var14);
                var11++;
                continue L6;
              }
            } else {
              var11++;
              continue L6;
            }
          }
        }
    }

    private final boolean a(int param0, int param1) {
        if (param1 != 0) {
            int discarded$0 = this.a((byte) -126, -123);
            return true;
        }
        return true;
    }

    private final int b(int param0, int param1) {
        if (param0 != 14638) {
            field_l = null;
        }
        return gg.field_a[0].field_x;
    }

    final static hc a(byte param0, String param1) {
        String var2 = null;
        hc var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        L0: {
          var5 = Lexicominos.field_L ? 1 : 0;
          if (param0 >= 63) {
            break L0;
          } else {
            field_l = null;
            break L0;
          }
        }
        if (pf.field_n != null) {
          if (param1 != null) {
            if (param1.length() != 0) {
              var6 = (CharSequence) (Object) param1;
              var2 = ck.a(var6, (byte) -48);
              if (var2 != null) {
                var3 = (hc) (Object) pf.field_n.a((long)var2.hashCode(), true);
                L1: while (true) {
                  if (var3 != null) {
                    var7 = (CharSequence) (Object) var3.field_R;
                    var4 = ck.a(var7, (byte) -48);
                    if (!var4.equals((Object) (Object) var2)) {
                      var3 = (hc) (Object) pf.field_n.b(-109);
                      continue L1;
                    } else {
                      return var3;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    private final int a(int param0, int param1, byte param2) {
        if (param2 != 95) {
            int discarded$0 = this.a((byte) 81, 21);
        }
        int var4 = qb.field_b[param1 * 640 + param0];
        if (-1 >= (param0 ^ -1)) {
            if ((param1 ^ -1) <= -1) {
                if (640 > param0) {
                    // if_icmpgt L67
                }
            }
        }
        var4 = -1;
        param1 = -1;
        param0 = -1;
        if (!((var4 ^ -1) <= 0)) {
            param1 = 2 + (2047 & var4) >> 1859436866;
            param0 = ((var4 & 4192829) >> 542422923) + 2 >> 230255202;
            param0 = param0 - (118 + jf.field_N.field_r / 2);
            if ((param0 ^ -1) <= -1) {
                if (param0 < 128) {
                    return param0 << -1477529471;
                }
                return 256;
            }
            return 0;
        }
        return -1;
    }

    final void a(boolean param0, boolean param1) {
        int var3 = 0;
        if (((sg) this).field_d == 0) {
            if ((((sg) this).field_c.field_d ^ -1) != 0) {
                var3 = ((sg) this).field_c.field_d;
            }
        }
        if ((((sg) this).field_d ^ -1) != -3) {
            // if_icmpne L80
        }
        if (((sg) this).field_c.field_d != -1) {
            if (-1 != aa.field_j) {
                var3 = ((sg) this).field_c.field_d;
            }
        }
        if (!param1) {
            Object var4 = null;
            sg.a((java.awt.Component) null, -7);
        }
        if (-4 == (((sg) this).field_d ^ -1)) {
            var3 = 1;
        }
        ((sg) this).field_c.a(0, param0, this.a(bk.field_b, sh.field_e, 640), var3);
        ((sg) this).field_h = -1;
    }

    private final void a(int param0, int param1, int param2, db param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          param0 = param0 + param3.field_w;
          param4 = param4 + param3.field_s;
          var6 = param4 - -(param0 * lf.field_f);
          var7 = 0;
          var8 = param3.field_u;
          var10 = 117 / ((param1 - -50) / 45);
          var9 = param3.field_p;
          var11 = lf.field_f - var9;
          if (lf.field_c > param0) {
            var13 = -param0 + lf.field_c;
            var6 = var6 + var13 * lf.field_f;
            var8 = var8 - var13;
            param0 = lf.field_c;
            var7 = var7 + var9 * var13;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var12 = 0;
          if (lf.field_h >= var8 + param0) {
            break L1;
          } else {
            var8 = var8 - (var8 + param0 - lf.field_h);
            break L1;
          }
        }
        L2: {
          if (lf.field_g > param4) {
            var13 = lf.field_g + -param4;
            var12 = var12 + var13;
            var11 = var11 + var13;
            var6 = var6 + var13;
            param4 = lf.field_g;
            var7 = var7 + var13;
            var9 = var9 - var13;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (var9 + param4 <= lf.field_e) {
            break L3;
          } else {
            var13 = -lf.field_e + param4 + var9;
            var9 = var9 - var13;
            var11 = var11 + var13;
            var12 = var12 + var13;
            break L3;
          }
        }
        if (-1 <= var9) {
          return;
        } else {
          if (-1 >= var8) {
            return;
          } else {
            d.a(param2, param3.field_y, var11, var8, var12, var9, var7, -61498200, lf.field_b, 0, var6);
            return;
          }
        }
    }

    private final void a(db param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          param2 = param2 + param0.field_s;
          param3 = param3 + param0.field_w;
          var5 = param2 + param3 * lf.field_f;
          var6 = 0;
          var7 = param0.field_u;
          var8 = param0.field_p;
          var9 = lf.field_f - var8;
          if (param3 < lf.field_c) {
            var11 = lf.field_c + -param3;
            param3 = lf.field_c;
            var6 = var6 + var11 * var8;
            var5 = var5 + lf.field_f * var11;
            var7 = var7 - var11;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var10 = 0;
          if (param2 >= lf.field_g) {
            break L1;
          } else {
            var11 = lf.field_g + -param2;
            var10 = var10 + var11;
            var9 = var9 + var11;
            var5 = var5 + var11;
            var8 = var8 - var11;
            var6 = var6 + var11;
            param2 = lf.field_g;
            break L1;
          }
        }
        L2: {
          if (var7 + param3 <= lf.field_h) {
            break L2;
          } else {
            var7 = var7 - (param3 + var7 + -lf.field_h);
            break L2;
          }
        }
        L3: {
          if (lf.field_e >= var8 + param2) {
            break L3;
          } else {
            var11 = -lf.field_e + var8 + param2;
            var9 = var9 + var11;
            var8 = var8 - var11;
            var10 = var10 + var11;
            break L3;
          }
        }
        if ((var8 ^ -1) >= -1) {
          return;
        } else {
          if (var7 > 0) {
            kc.a(var7, var8, lf.field_b, var6, param1, var10, param1 ^ 8, var5, param0.field_y, var9);
            return;
          } else {
            return;
          }
        }
    }

    private final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        db var11 = null;
        int var12 = 0;
        L0: {
          var12 = Lexicominos.field_L ? 1 : 0;
          if ((param0 ^ -1) > -1) {
            break L0;
          } else {
            if ((param1 ^ -1) > -1) {
              break L0;
            } else {
              L1: {
                if (param0 >= param2) {
                  break L1;
                } else {
                  if ((param1 ^ -1) <= -481) {
                    break L1;
                  } else {
                    L2: {
                      var4 = qb.field_b[param0 + param1 * 640];
                      if (var4 >= 0) {
                        break L2;
                      } else {
                        if (-1 == var4) {
                          break L2;
                        } else {
                          L3: {
                            L4: {
                              var5 = (2047 & var4 >> 1107596715) + 2 >> -779344990;
                              var6 = 2 + (2047 & var4) >> -1951964094;
                              var7 = 0;
                              if (((sg) this).field_d == 3) {
                                break L4;
                              } else {
                                if (-13 != (((sg) this).field_d ^ -1)) {
                                  break L3;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            var7 = 1;
                            break L3;
                          }
                          L5: {
                            L6: {
                              if (((sg) this).field_d == 4) {
                                break L6;
                              } else {
                                if (((sg) this).field_d != 13) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            var7 = 1;
                            break L5;
                          }
                          L7: {
                            if ((((sg) this).field_d ^ -1) > -9) {
                              break L7;
                            } else {
                              if (((sg) this).field_d <= 11) {
                                var7 = 1;
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                          }
                          if (var7 != 0) {
                            var8 = 0;
                            L8: while (true) {
                              if (qc.field_a[((sg) this).field_d].length <= var8) {
                                return -1;
                              } else {
                                var9 = this.a((byte) 46, var8);
                                var10 = this.b((byte) -19, var8);
                                var11 = gg.field_a[qc.field_a[((sg) this).field_d][var8] + -1];
                                if (this.a(var8, 0)) {
                                  if (var5 >= var9 + var11.field_s) {
                                    if (var5 < var11.field_p + var9 - -var11.field_s) {
                                      if (var6 >= var10) {
                                        if (var6 < this.b(14638, var8) + var10) {
                                          return var8;
                                        } else {
                                          var8++;
                                          continue L8;
                                        }
                                      } else {
                                        var8++;
                                        continue L8;
                                      }
                                    } else {
                                      var8++;
                                      continue L8;
                                    }
                                  } else {
                                    var8++;
                                    continue L8;
                                  }
                                } else {
                                  var8++;
                                  continue L8;
                                }
                              }
                            }
                          } else {
                            var8 = 0;
                            L9: while (true) {
                              if (var8 >= qc.field_a[((sg) this).field_d].length) {
                                break L2;
                              } else {
                                var9 = this.b((byte) -19, var8);
                                if (this.a(var8, 0)) {
                                  if (var9 <= var6) {
                                    if (var6 < this.b(14638, var8) + var9) {
                                      return var8;
                                    } else {
                                      var8++;
                                      continue L9;
                                    }
                                  } else {
                                    var8++;
                                    continue L9;
                                  }
                                } else {
                                  var8++;
                                  continue L9;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    return -1;
                  }
                }
              }
              return -1;
            }
          }
        }
        return -1;
    }

    final void c(int param0) {
        int var2 = 0;
        String var2_ref = null;
        int var3 = 0;
        int var5 = 0;
        int var6 = 0;
        String var6_ref_String = null;
        int var7 = 0;
        int var8_int = 0;
        String var8 = null;
        String var9 = null;
        db var10 = null;
        int var11 = 0;
        int var12 = 0;
        String[] var13 = null;
        String[] var14 = null;
        db var16 = null;
        int[] var19 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_39_0 = 0;
        cd stackIn_39_1 = null;
        int stackIn_40_0 = 0;
        cd stackIn_40_1 = null;
        int stackIn_41_0 = 0;
        cd stackIn_41_1 = null;
        int stackIn_41_2 = 0;
        int stackIn_42_0 = 0;
        cd stackIn_42_1 = null;
        int stackIn_42_2 = 0;
        int stackIn_42_3 = 0;
        int stackIn_42_4 = 0;
        int stackIn_43_0 = 0;
        cd stackIn_43_1 = null;
        int stackIn_43_2 = 0;
        int stackIn_43_3 = 0;
        int stackIn_43_4 = 0;
        int stackIn_44_0 = 0;
        cd stackIn_44_1 = null;
        int stackIn_44_2 = 0;
        int stackIn_44_3 = 0;
        int stackIn_44_4 = 0;
        int stackIn_44_5 = 0;
        int stackIn_45_0 = 0;
        cd stackIn_45_1 = null;
        int stackIn_45_2 = 0;
        int stackIn_45_3 = 0;
        int stackIn_46_0 = 0;
        cd stackIn_46_1 = null;
        int stackIn_46_2 = 0;
        int stackIn_46_3 = 0;
        int stackIn_47_0 = 0;
        cd stackIn_47_1 = null;
        int stackIn_47_2 = 0;
        int stackIn_47_3 = 0;
        int stackIn_47_4 = 0;
        int stackIn_48_0 = 0;
        cd stackIn_48_1 = null;
        int stackIn_48_2 = 0;
        int stackIn_48_3 = 0;
        int stackIn_48_4 = 0;
        int stackIn_49_0 = 0;
        cd stackIn_49_1 = null;
        int stackIn_49_2 = 0;
        int stackIn_49_3 = 0;
        int stackIn_49_4 = 0;
        int stackIn_50_0 = 0;
        cd stackIn_50_1 = null;
        int stackIn_50_2 = 0;
        int stackIn_50_3 = 0;
        int stackIn_50_4 = 0;
        int stackIn_50_5 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        cd stackIn_51_2 = null;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        cd stackIn_52_2 = null;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        cd stackIn_53_2 = null;
        int stackIn_53_3 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        cd stackIn_54_2 = null;
        int stackIn_54_3 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        cd stackIn_55_2 = null;
        int stackIn_55_3 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        cd stackIn_56_2 = null;
        int stackIn_56_3 = 0;
        int stackIn_56_4 = 0;
        int stackIn_71_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_38_0 = 0;
        cd stackOut_38_1 = null;
        int stackOut_40_0 = 0;
        cd stackOut_40_1 = null;
        int stackOut_40_2 = 0;
        int stackOut_39_0 = 0;
        cd stackOut_39_1 = null;
        int stackOut_39_2 = 0;
        int stackOut_41_0 = 0;
        cd stackOut_41_1 = null;
        int stackOut_41_2 = 0;
        int stackOut_41_3 = 0;
        int stackOut_41_4 = 0;
        int stackOut_43_0 = 0;
        cd stackOut_43_1 = null;
        int stackOut_43_2 = 0;
        int stackOut_43_3 = 0;
        int stackOut_43_4 = 0;
        int stackOut_43_5 = 0;
        int stackOut_42_0 = 0;
        cd stackOut_42_1 = null;
        int stackOut_42_2 = 0;
        int stackOut_42_3 = 0;
        int stackOut_42_4 = 0;
        int stackOut_42_5 = 0;
        int stackOut_44_0 = 0;
        cd stackOut_44_1 = null;
        int stackOut_44_2 = 0;
        int stackOut_44_3 = 0;
        int stackOut_46_0 = 0;
        cd stackOut_46_1 = null;
        int stackOut_46_2 = 0;
        int stackOut_46_3 = 0;
        int stackOut_46_4 = 0;
        int stackOut_45_0 = 0;
        cd stackOut_45_1 = null;
        int stackOut_45_2 = 0;
        int stackOut_45_3 = 0;
        int stackOut_45_4 = 0;
        int stackOut_47_0 = 0;
        cd stackOut_47_1 = null;
        int stackOut_47_2 = 0;
        int stackOut_47_3 = 0;
        int stackOut_47_4 = 0;
        int stackOut_49_0 = 0;
        cd stackOut_49_1 = null;
        int stackOut_49_2 = 0;
        int stackOut_49_3 = 0;
        int stackOut_49_4 = 0;
        int stackOut_49_5 = 0;
        int stackOut_48_0 = 0;
        cd stackOut_48_1 = null;
        int stackOut_48_2 = 0;
        int stackOut_48_3 = 0;
        int stackOut_48_4 = 0;
        int stackOut_48_5 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        cd stackOut_50_2 = null;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        cd stackOut_52_2 = null;
        int stackOut_52_3 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        cd stackOut_51_2 = null;
        int stackOut_51_3 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        cd stackOut_53_2 = null;
        int stackOut_53_3 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        cd stackOut_55_2 = null;
        int stackOut_55_3 = 0;
        int stackOut_55_4 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        cd stackOut_54_2 = null;
        int stackOut_54_3 = 0;
        int stackOut_54_4 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        L0: {
          var12 = Lexicominos.field_L ? 1 : 0;
          if (param0 == 1) {
            break L0;
          } else {
            ((sg) this).field_o = 75;
            break L0;
          }
        }
        L1: {
          if (na.field_a[((sg) this).field_d] == null) {
            break L1;
          } else {
            this.a(na.field_a[((sg) this).field_d], 0, 0, 0);
            break L1;
          }
        }
        var2 = 0;
        L2: while (true) {
          if (var2 >= ((sg) this).field_c.field_h) {
            L3: {
              if (-2 == (((sg) this).field_d ^ -1)) {
                L4: {
                  var3 = pa.field_d - -(pa.field_d >> -190686527);
                  if (!ki.a((byte) -108)) {
                    L5: {
                      if (hh.field_N != null) {
                        break L5;
                      } else {
                        hh.field_N = ud.a(1, -68, 10, 3, 9);
                        break L5;
                      }
                    }
                    if (hh.field_N.field_k) {
                      if (hh.field_N.field_j == null) {
                        var2_ref = pc.field_l;
                        break L4;
                      } else {
                        var2_ref = fd.field_a;
                        var14 = hh.field_N.field_j[jf.field_I];
                        var19 = hh.field_N.field_n[jf.field_I];
                        var6 = ul.a(ki.field_d, hh.field_N, param0 ^ 52, jf.field_I);
                        var7 = 38;
                        var8_int = 0;
                        L6: while (true) {
                          if (10 <= var8_int) {
                            if (null == el.field_c) {
                              break L4;
                            } else {
                              if (0 != (var6 ^ -1)) {
                                break L4;
                              } else {
                                var8 = og.field_c;
                                var16 = el.field_c.field_m.field_h;
                                bi.field_a.b(var8, 66, var7 + pa.field_d + (-pa.field_d + 24) / 2, 10161935, -1);
                                bi.field_a.c(Integer.toString(el.field_c.field_J), 301, pa.field_d + var7 - -((-pa.field_d + 24) / 2), 10161935, -1);
                                this.a(12 + var7 + -(var16.field_u / 2), param0 ^ -102, 64, var16, 36 - var16.field_p / 2);
                                break L4;
                              }
                            }
                          } else {
                            if (var14[var8_int] != null) {
                              L7: {
                                var9 = var14[var8_int];
                                var10 = id.field_w[63 & var19[var8_int]].field_h;
                                if (var6 != var8_int) {
                                  stackOut_70_0 = 0;
                                  stackIn_71_0 = stackOut_70_0;
                                  break L7;
                                } else {
                                  stackOut_69_0 = 10161935;
                                  stackIn_71_0 = stackOut_69_0;
                                  break L7;
                                }
                              }
                              var11 = stackIn_71_0;
                              bi.field_a.b(var9, 66, pa.field_d + (var7 + (24 + -pa.field_d) / 2), var11, -1);
                              bi.field_a.c(Integer.toString(var19[var8_int] >> -170855418), 301, pa.field_d + (var7 - -((24 + -pa.field_d) / 2)), var11, -1);
                              this.a(-(var10.field_u / 2) + var7 + 12, param0 ^ -109, 64, var10, -(var10.field_p / 2) + 36);
                              var2_ref = "";
                              bi.field_a.c(1 + var8_int + ".", 50, var7 - (-pa.field_d + -((24 - pa.field_d) / 2)), var11, -1);
                              var7 += 27;
                              var8_int++;
                              continue L6;
                            } else {
                              var7 += 27;
                              var8_int++;
                              continue L6;
                            }
                          }
                        }
                      }
                    } else {
                      var2_ref = ta.field_b;
                      break L4;
                    }
                  } else {
                    var2_ref = fd.field_a;
                    int discarded$6 = jh.field_d.a(al.field_G, 20, -jh.field_d.field_E + 280, 271, 1000, 0, -1, 1, 0, var3);
                    break L4;
                  }
                }
                int discarded$7 = bi.field_a.a(var2_ref, 20, -bi.field_a.field_E + 200, 271, 1000, 0, -1, 1, 0, var3);
                break L3;
              } else {
                if ((((sg) this).field_d ^ -1) != -6) {
                  if (7 != ((sg) this).field_d) {
                    if (((sg) this).field_d == -7) {
                      L8: {
                        var2 = 50 - -bi.field_a.field_E;
                        var3 = bi.field_a.field_G + (bi.field_a.field_t + 4);
                        var2 = var2 + var3 * bi.field_a.a(me.field_u, 40, -bi.field_a.field_E + var2, 254, 1000, 0, -1, 1, 0, var3);
                        stackOut_38_0 = var2;
                        stackOut_38_1 = bi.field_a;
                        stackIn_40_0 = stackOut_38_0;
                        stackIn_40_1 = stackOut_38_1;
                        stackIn_39_0 = stackOut_38_0;
                        stackIn_39_1 = stackOut_38_1;
                        if (-1 == (ee.field_a ^ -1)) {
                          stackOut_40_0 = stackIn_40_0;
                          stackOut_40_1 = (cd) (Object) stackIn_40_1;
                          stackOut_40_2 = 0;
                          stackIn_41_0 = stackOut_40_0;
                          stackIn_41_1 = stackOut_40_1;
                          stackIn_41_2 = stackOut_40_2;
                          break L8;
                        } else {
                          stackOut_39_0 = stackIn_39_0;
                          stackOut_39_1 = (cd) (Object) stackIn_39_1;
                          stackOut_39_2 = 1;
                          stackIn_41_0 = stackOut_39_0;
                          stackIn_41_1 = stackOut_39_1;
                          stackIn_41_2 = stackOut_39_2;
                          break L8;
                        }
                      }
                      L9: {
                        stackOut_41_0 = stackIn_41_0;
                        stackOut_41_1 = (cd) (Object) stackIn_41_1;
                        stackOut_41_2 = stackIn_41_2;
                        stackOut_41_3 = 0;
                        stackOut_41_4 = -84;
                        stackIn_43_0 = stackOut_41_0;
                        stackIn_43_1 = stackOut_41_1;
                        stackIn_43_2 = stackOut_41_2;
                        stackIn_43_3 = stackOut_41_3;
                        stackIn_43_4 = stackOut_41_4;
                        stackIn_42_0 = stackOut_41_0;
                        stackIn_42_1 = stackOut_41_1;
                        stackIn_42_2 = stackOut_41_2;
                        stackIn_42_3 = stackOut_41_3;
                        stackIn_42_4 = stackOut_41_4;
                        if (el.field_c.field_J == 0) {
                          stackOut_43_0 = stackIn_43_0;
                          stackOut_43_1 = (cd) (Object) stackIn_43_1;
                          stackOut_43_2 = stackIn_43_2;
                          stackOut_43_3 = stackIn_43_3;
                          stackOut_43_4 = stackIn_43_4;
                          stackOut_43_5 = 0;
                          stackIn_44_0 = stackOut_43_0;
                          stackIn_44_1 = stackOut_43_1;
                          stackIn_44_2 = stackOut_43_2;
                          stackIn_44_3 = stackOut_43_3;
                          stackIn_44_4 = stackOut_43_4;
                          stackIn_44_5 = stackOut_43_5;
                          break L9;
                        } else {
                          stackOut_42_0 = stackIn_42_0;
                          stackOut_42_1 = (cd) (Object) stackIn_42_1;
                          stackOut_42_2 = stackIn_42_2;
                          stackOut_42_3 = stackIn_42_3;
                          stackOut_42_4 = stackIn_42_4;
                          stackOut_42_5 = 1;
                          stackIn_44_0 = stackOut_42_0;
                          stackIn_44_1 = stackOut_42_1;
                          stackIn_44_2 = stackOut_42_2;
                          stackIn_44_3 = stackOut_42_3;
                          stackIn_44_4 = stackOut_42_4;
                          stackIn_44_5 = stackOut_42_5;
                          break L9;
                        }
                      }
                      L10: {
                        var2 = stackIn_44_0 + ((cd) (Object) stackIn_44_1).a(ii.a(stackIn_44_2 != 0, stackIn_44_3 != 0, stackIn_44_4, stackIn_44_5 != 0), 40, var2 - bi.field_a.field_E, 254, 1000, 0, -1, 1, 0, var3) * var3;
                        var2 = var2 + (gg.field_a[0].field_x * 2 + var3);
                        stackOut_44_0 = var2;
                        stackOut_44_1 = bi.field_a;
                        stackOut_44_2 = 0;
                        stackOut_44_3 = param0 + -102;
                        stackIn_46_0 = stackOut_44_0;
                        stackIn_46_1 = stackOut_44_1;
                        stackIn_46_2 = stackOut_44_2;
                        stackIn_46_3 = stackOut_44_3;
                        stackIn_45_0 = stackOut_44_0;
                        stackIn_45_1 = stackOut_44_1;
                        stackIn_45_2 = stackOut_44_2;
                        stackIn_45_3 = stackOut_44_3;
                        if (-1 == (ee.field_a ^ -1)) {
                          stackOut_46_0 = stackIn_46_0;
                          stackOut_46_1 = (cd) (Object) stackIn_46_1;
                          stackOut_46_2 = stackIn_46_2;
                          stackOut_46_3 = stackIn_46_3;
                          stackOut_46_4 = 0;
                          stackIn_47_0 = stackOut_46_0;
                          stackIn_47_1 = stackOut_46_1;
                          stackIn_47_2 = stackOut_46_2;
                          stackIn_47_3 = stackOut_46_3;
                          stackIn_47_4 = stackOut_46_4;
                          break L10;
                        } else {
                          stackOut_45_0 = stackIn_45_0;
                          stackOut_45_1 = (cd) (Object) stackIn_45_1;
                          stackOut_45_2 = stackIn_45_2;
                          stackOut_45_3 = stackIn_45_3;
                          stackOut_45_4 = 1;
                          stackIn_47_0 = stackOut_45_0;
                          stackIn_47_1 = stackOut_45_1;
                          stackIn_47_2 = stackOut_45_2;
                          stackIn_47_3 = stackOut_45_3;
                          stackIn_47_4 = stackOut_45_4;
                          break L10;
                        }
                      }
                      L11: {
                        stackOut_47_0 = stackIn_47_0;
                        stackOut_47_1 = (cd) (Object) stackIn_47_1;
                        stackOut_47_2 = stackIn_47_2;
                        stackOut_47_3 = stackIn_47_3;
                        stackOut_47_4 = stackIn_47_4;
                        stackIn_49_0 = stackOut_47_0;
                        stackIn_49_1 = stackOut_47_1;
                        stackIn_49_2 = stackOut_47_2;
                        stackIn_49_3 = stackOut_47_3;
                        stackIn_49_4 = stackOut_47_4;
                        stackIn_48_0 = stackOut_47_0;
                        stackIn_48_1 = stackOut_47_1;
                        stackIn_48_2 = stackOut_47_2;
                        stackIn_48_3 = stackOut_47_3;
                        stackIn_48_4 = stackOut_47_4;
                        if (0 == el.field_c.field_J) {
                          stackOut_49_0 = stackIn_49_0;
                          stackOut_49_1 = (cd) (Object) stackIn_49_1;
                          stackOut_49_2 = stackIn_49_2;
                          stackOut_49_3 = stackIn_49_3;
                          stackOut_49_4 = stackIn_49_4;
                          stackOut_49_5 = 0;
                          stackIn_50_0 = stackOut_49_0;
                          stackIn_50_1 = stackOut_49_1;
                          stackIn_50_2 = stackOut_49_2;
                          stackIn_50_3 = stackOut_49_3;
                          stackIn_50_4 = stackOut_49_4;
                          stackIn_50_5 = stackOut_49_5;
                          break L11;
                        } else {
                          stackOut_48_0 = stackIn_48_0;
                          stackOut_48_1 = (cd) (Object) stackIn_48_1;
                          stackOut_48_2 = stackIn_48_2;
                          stackOut_48_3 = stackIn_48_3;
                          stackOut_48_4 = stackIn_48_4;
                          stackOut_48_5 = 1;
                          stackIn_50_0 = stackOut_48_0;
                          stackIn_50_1 = stackOut_48_1;
                          stackIn_50_2 = stackOut_48_2;
                          stackIn_50_3 = stackOut_48_3;
                          stackIn_50_4 = stackOut_48_4;
                          stackIn_50_5 = stackOut_48_5;
                          break L11;
                        }
                      }
                      L12: {
                        var2 = stackIn_50_0 + ((cd) (Object) stackIn_50_1).a(ac.a(stackIn_50_2 != 0, stackIn_50_3, stackIn_50_4 != 0, stackIn_50_5 != 0), 40, -bi.field_a.field_E + var2, 254, 1000, 0, -1, 1, 0, var3) * var3;
                        var2 = var2 + gg.field_a[0].field_x;
                        stackOut_50_0 = var2;
                        stackOut_50_1 = var3;
                        stackOut_50_2 = bi.field_a;
                        stackIn_52_0 = stackOut_50_0;
                        stackIn_52_1 = stackOut_50_1;
                        stackIn_52_2 = stackOut_50_2;
                        stackIn_51_0 = stackOut_50_0;
                        stackIn_51_1 = stackOut_50_1;
                        stackIn_51_2 = stackOut_50_2;
                        if (el.field_c.field_J == -1) {
                          stackOut_52_0 = stackIn_52_0;
                          stackOut_52_1 = stackIn_52_1;
                          stackOut_52_2 = (cd) (Object) stackIn_52_2;
                          stackOut_52_3 = 0;
                          stackIn_53_0 = stackOut_52_0;
                          stackIn_53_1 = stackOut_52_1;
                          stackIn_53_2 = stackOut_52_2;
                          stackIn_53_3 = stackOut_52_3;
                          break L12;
                        } else {
                          stackOut_51_0 = stackIn_51_0;
                          stackOut_51_1 = stackIn_51_1;
                          stackOut_51_2 = (cd) (Object) stackIn_51_2;
                          stackOut_51_3 = 1;
                          stackIn_53_0 = stackOut_51_0;
                          stackIn_53_1 = stackOut_51_1;
                          stackIn_53_2 = stackOut_51_2;
                          stackIn_53_3 = stackOut_51_3;
                          break L12;
                        }
                      }
                      L13: {
                        stackOut_53_0 = stackIn_53_0;
                        stackOut_53_1 = stackIn_53_1;
                        stackOut_53_2 = (cd) (Object) stackIn_53_2;
                        stackOut_53_3 = stackIn_53_3;
                        stackIn_55_0 = stackOut_53_0;
                        stackIn_55_1 = stackOut_53_1;
                        stackIn_55_2 = stackOut_53_2;
                        stackIn_55_3 = stackOut_53_3;
                        stackIn_54_0 = stackOut_53_0;
                        stackIn_54_1 = stackOut_53_1;
                        stackIn_54_2 = stackOut_53_2;
                        stackIn_54_3 = stackOut_53_3;
                        if (-1 == ee.field_a) {
                          stackOut_55_0 = stackIn_55_0;
                          stackOut_55_1 = stackIn_55_1;
                          stackOut_55_2 = (cd) (Object) stackIn_55_2;
                          stackOut_55_3 = stackIn_55_3;
                          stackOut_55_4 = 0;
                          stackIn_56_0 = stackOut_55_0;
                          stackIn_56_1 = stackOut_55_1;
                          stackIn_56_2 = stackOut_55_2;
                          stackIn_56_3 = stackOut_55_3;
                          stackIn_56_4 = stackOut_55_4;
                          break L13;
                        } else {
                          stackOut_54_0 = stackIn_54_0;
                          stackOut_54_1 = stackIn_54_1;
                          stackOut_54_2 = (cd) (Object) stackIn_54_2;
                          stackOut_54_3 = stackIn_54_3;
                          stackOut_54_4 = 1;
                          stackIn_56_0 = stackOut_54_0;
                          stackIn_56_1 = stackOut_54_1;
                          stackIn_56_2 = stackOut_54_2;
                          stackIn_56_3 = stackOut_54_3;
                          stackIn_56_4 = stackOut_54_4;
                          break L13;
                        }
                      }
                      var2 = stackIn_56_0 + stackIn_56_1 * ((cd) (Object) stackIn_56_2).a(dd.a(stackIn_56_3 != 0, stackIn_56_4 != 0, false, -11902), 40, var2 - bi.field_a.field_E, 254, 1000, 0, -1, 1, 0, var3);
                      break L3;
                    } else {
                      L14: {
                        if (-4 == ((sg) this).field_d) {
                          break L14;
                        } else {
                          if (((sg) this).field_d != 12) {
                            L15: {
                              if (-5 == (((sg) this).field_d ^ -1)) {
                                break L15;
                              } else {
                                if (((sg) this).field_d != 13) {
                                  if ((((sg) this).field_d ^ -1) != -9) {
                                    if (((sg) this).field_d == -10) {
                                      var2 = (pa.field_d >> -469239871) + pa.field_d;
                                      var3 = 40;
                                      int discarded$8 = jh.field_d.a(pk.field_D, 40, -jh.field_d.field_E + var3, 254, 1000, 0, -1, 0, 0, var2);
                                      mk.field_h.c(rk.field_k, 294, -10 + lf.field_a, 0, -1);
                                      break L3;
                                    } else {
                                      if (((sg) this).field_d == 10) {
                                        var2 = pa.field_d - -(pa.field_d >> 197358369);
                                        var3 = 40;
                                        int discarded$9 = jh.field_d.a(tf.field_b, 40, var3 - jh.field_d.field_E, 254, 1000, 0, -1, 0, 0, var2);
                                        mk.field_h.c(bl.field_a, 294, lf.field_a + -10, 0, -1);
                                        break L3;
                                      } else {
                                        if (-12 == ((sg) this).field_d) {
                                          var2 = (pa.field_d >> 237192481) + pa.field_d;
                                          var3 = 40;
                                          int discarded$10 = jh.field_d.a(kk.field_q, 40, -jh.field_d.field_E + var3, 254, 1000, 0, -1, 0, 0, var2);
                                          mk.field_h.c(eg.field_E, 294, -10 + lf.field_a, 0, -1);
                                          break L3;
                                        } else {
                                          break L3;
                                        }
                                      }
                                    }
                                  } else {
                                    var2 = pa.field_d - -(pa.field_d >> 494341249);
                                    var3 = 40;
                                    int discarded$11 = jh.field_d.a(kk.field_n, 40, -jh.field_d.field_E + var3, 254, 1000, 0, -1, 0, 0, var2);
                                    mk.field_h.c(cb.field_D, 294, lf.field_a + -10, 0, -1);
                                    break L3;
                                  }
                                } else {
                                  break L15;
                                }
                              }
                            }
                            var2 = 18;
                            var3 = 40;
                            var13 = ve.field_b;
                            var5 = 0;
                            L16: while (true) {
                              if (var5 >= var13.length) {
                                mk.field_h.c(eg.field_E, 294, lf.field_a + -10, 0, -1);
                                break L3;
                              } else {
                                var6_ref_String = var13[var5];
                                var3 = var3 + var2 * jh.field_d.a(var6_ref_String, 40, var3 - jh.field_d.field_E, 254, 1000, 0, -1, 0, 0, var2);
                                var3 = var3 + var2;
                                var5++;
                                continue L16;
                              }
                            }
                          } else {
                            break L14;
                          }
                        }
                      }
                      mk.field_h.c(rk.field_k, 294, -10 + lf.field_a, 0, -1);
                      break L3;
                    }
                  } else {
                    this.a(true, param0 + 73);
                    break L3;
                  }
                } else {
                  this.a(false, param0 + 35);
                  break L3;
                }
              }
            }
            L17: {
              if (null != ((sg) this).field_m) {
                L18: {
                  if ((((sg) this).field_d ^ -1) == -9) {
                    if (((sg) this).field_m.field_J != 0) {
                      if (((sg) this).field_m.field_J > ((sg) this).field_m.field_r) {
                        var2 = 256 * ((sg) this).field_m.field_r / ((sg) this).field_m.field_J;
                        ia.field_G.b(50, 213, -var2 + 256);
                        kf.field_A[1].b(0, ((sg) this).field_m.field_M, var2);
                        break L18;
                      } else {
                        kf.field_A[1].d(0, ((sg) this).field_m.field_M);
                        break L18;
                      }
                    } else {
                      L19: {
                        ia.field_G.d(50, 213);
                        if (((sg) this).field_m.field_A) {
                          this.a((byte) 66, 215, 53);
                          break L19;
                        } else {
                          break L19;
                        }
                      }
                      L20: {
                        if (!((sg) this).field_m.field_v) {
                          break L20;
                        } else {
                          this.a((byte) 46, 215, 151);
                          break L20;
                        }
                      }
                      L21: {
                        if (!((sg) this).field_m.field_E) {
                          break L21;
                        } else {
                          this.a((byte) -51, 215, 190);
                          break L21;
                        }
                      }
                      if (!((sg) this).field_m.field_O) {
                        break L18;
                      } else {
                        this.a((byte) 90, 215, 229);
                        break L18;
                      }
                    }
                  } else {
                    if (11 == ((sg) this).field_d) {
                      break L18;
                    } else {
                      kf.field_A[1].d(0, ((sg) this).field_m.field_M);
                      break L18;
                    }
                  }
                }
                ((sg) this).field_m.c((byte) -109);
                break L17;
              } else {
                break L17;
              }
            }
            return;
          } else {
            if (this.a(var2, 0)) {
              L22: {
                stackOut_8_0 = this;
                stackIn_10_0 = stackOut_8_0;
                stackIn_9_0 = stackOut_8_0;
                if (((sg) this).field_c.field_d != var2) {
                  stackOut_10_0 = this;
                  stackOut_10_1 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  break L22;
                } else {
                  stackOut_9_0 = this;
                  stackOut_9_1 = 1;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  break L22;
                }
              }
              this.a(stackIn_11_1 != 0, var2, 1956587489);
              var2++;
              continue L2;
            } else {
              var2++;
              continue L2;
            }
          }
        }
    }

    final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        String[] var8 = null;
        String[] var9 = null;
        int var10 = 0;
        gd var11 = null;
        String var12 = null;
        L0: {
          var7 = Lexicominos.field_L ? 1 : 0;
          if (ij.field_n[((sg) this).field_d] != null) {
            ij.field_n[((sg) this).field_d].d(0, 0);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param0 == 48) {
            break L1;
          } else {
            field_l = null;
            break L1;
          }
        }
        L2: {
          if (5 == ((sg) this).field_d) {
            this.b(false, 640);
            break L2;
          } else {
            if ((((sg) this).field_d ^ -1) != -8) {
              L3: {
                if (((sg) this).field_d == 3) {
                  break L3;
                } else {
                  if (((sg) this).field_d == -13) {
                    break L3;
                  } else {
                    L4: {
                      if (-5 == ((sg) this).field_d) {
                        break L4;
                      } else {
                        if (((sg) this).field_d == -14) {
                          break L4;
                        } else {
                          if (-2 == ((sg) this).field_d) {
                            if (!ki.a((byte) -114)) {
                              var2 = (pa.field_d >> 1134548897) + pa.field_d;
                              int discarded$1 = jh.field_d.a(fl.field_b, 12, -jh.field_d.field_E + 370, 278, 1000, 0, -1, 0, 0, var2);
                              break L2;
                            } else {
                              break L2;
                            }
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                    var2 = 18;
                    var3 = 40;
                    var8 = oj.field_c;
                    var5 = 0;
                    L5: while (true) {
                      if (var5 >= var8.length) {
                        mk.field_h.b(bl.field_a, 12, -10 + lf.field_a, 0, -1);
                        break L2;
                      } else {
                        var12 = var8[var5];
                        var3 = var3 + var2 * jh.field_d.a(var12, 12, var3 - jh.field_d.field_E, 278, 1000, 0, -1, 0, 0, var2);
                        var3 = var3 + var2;
                        var5++;
                        continue L5;
                      }
                    }
                  }
                }
              }
              var2 = 18;
              var3 = 240;
              var9 = tj.field_j;
              var10 = 0;
              var5 = var10;
              L6: while (true) {
                if (var9.length <= var10) {
                  mk.field_h.b(cb.field_D, 12, lf.field_a - 10, 0, -1);
                  break L2;
                } else {
                  var6 = var9[var10];
                  var3 = var3 + var2 * jh.field_d.a(var6, 12, -jh.field_d.field_E + var3, 278, 1000, 0, -1, 0, 0, var2);
                  var3 = var3 + var2;
                  var10++;
                  continue L6;
                }
              }
            } else {
              this.b(true, 640);
              break L2;
            }
          }
        }
        L7: {
          if (null != ((sg) this).field_m) {
            ((sg) this).field_m.d(50);
            if ((((sg) this).field_d ^ -1) != -12) {
              break L7;
            } else {
              L8: {
                lf.g(0, 8, 311, 450);
                var2 = -300 + (-88 + ((sg) this).field_m.field_r);
                if (200 >= var2) {
                  break L8;
                } else {
                  var2 = 200;
                  break L8;
                }
              }
              eh.a(0, lg.field_c, 10 + 24 * ((12 - sj.field_l.length()) / 2), 0, sj.field_l, var2);
              eh.a(0, lg.field_c, 10 + (-eb.field_a.length() + 12) / 2 * 24, 0, eb.field_a, 24 + var2);
              eh.a(0, lg.field_c, 10 + 24 * ((-td.field_g.length() + 12) / 2), param0 + -48, td.field_g, 48 + var2);
              var11 = (gd) (Object) ((sg) this).field_m.field_j.a(true);
              L9: while (true) {
                if (var11 == null) {
                  lf.b();
                  break L7;
                } else {
                  var11.a((byte) -34);
                  var11 = (gd) (Object) ((sg) this).field_m.field_j.f(2);
                  continue L9;
                }
              }
            }
          } else {
            break L7;
          }
        }
    }

    private final void a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        db var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        L0: {
          var10 = Lexicominos.field_L ? 1 : 0;
          if (param2 == 1956587489) {
            break L0;
          } else {
            ((sg) this).field_b = 65;
            break L0;
          }
        }
        L1: {
          var4 = this.b((byte) -19, param1);
          var5 = qc.field_a[((sg) this).field_d][param1];
          if (-22 != (var5 ^ -1)) {
            L2: {
              var6_int = this.a((byte) 46, param1);
              if (!param0) {
                break L2;
              } else {
                ej.field_b[-1 + var5].d(var6_int, var4);
                break L2;
              }
            }
            gg.field_a[var5 + -1].d(var6_int, var4);
            break L1;
          } else {
            var6_int = this.a(true, sh.field_e, bk.field_b, -107);
            var7 = 0;
            L3: while (true) {
              if (4 <= var7) {
                break L1;
              } else {
                L4: {
                  hi.field_b[var7].d(95 * var7, var4);
                  if (var7 == 3) {
                    stackOut_7_0 = 2;
                    stackIn_8_0 = stackOut_7_0;
                    break L4;
                  } else {
                    stackOut_6_0 = var7;
                    stackIn_8_0 = stackOut_6_0;
                    break L4;
                  }
                }
                L5: {
                  var8 = stackIn_8_0;
                  var9 = 0;
                  if (var8 != jf.field_I) {
                    break L5;
                  } else {
                    L6: {
                      L7: {
                        if (((sg) this).field_c.field_i) {
                          break L7;
                        } else {
                          if (param0) {
                            stackOut_13_0 = 16777215;
                            stackIn_14_0 = stackOut_13_0;
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      stackOut_12_0 = 16755370;
                      stackIn_14_0 = stackOut_12_0;
                      break L6;
                    }
                    var9 = stackIn_14_0;
                    break L5;
                  }
                }
                L8: {
                  if (!((sg) this).field_c.field_i) {
                    break L8;
                  } else {
                    if (!param0) {
                      break L8;
                    } else {
                      if (var6_int != var8) {
                        break L8;
                      } else {
                        var9 = 16777215;
                        break L8;
                      }
                    }
                  }
                }
                if (16777215 == var9) {
                  dc.field_z[var7].d(95 * var7, var4);
                  var7++;
                  continue L3;
                } else {
                  if (-1 != (var9 ^ -1)) {
                    dc.field_z[var7].b(95 * var7, var4, 128);
                    var7++;
                    continue L3;
                  } else {
                    var7++;
                    continue L3;
                  }
                }
              }
            }
          }
        }
        L9: {
          var7 = var5;
          if (var7 != -5) {
            if (-8 != var7) {
              if (var7 != 3) {
                if ((var7 ^ -1) != -10) {
                  break L9;
                } else {
                  wc.field_c[-1 + tg.field_j / 4].d(163, var4);
                  break L9;
                }
              } else {
                var6 = id.field_w[rg.field_b].field_h;
                var6.d(199 + (-var6.field_p + 36 >> 1956587489), (24 + -var6.field_u >> 1115760609) + 9 + var4);
                break L9;
              }
            } else {
              L10: {
                var7 = uh.field_n.field_u;
                if ((var7 ^ -1) > -1) {
                  var7 = 0;
                  break L10;
                } else {
                  break L10;
                }
              }
              jf.field_N.d(var7 / 2 + 118, 11 + var4);
              break L9;
            }
          } else {
            L11: {
              var7 = oc.field_e;
              if (0 <= var7) {
                break L11;
              } else {
                var7 = 0;
                break L11;
              }
            }
            jf.field_N.d(118 - -(var7 / 2), var4 + 11);
            break L9;
          }
        }
    }

    final static boolean a(boolean param0) {
        if (param0) {
            sg.b(78);
        }
        return ca.field_k;
    }

    private final int a(boolean param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Lexicominos.field_L ? 1 : 0;
        if (-2 != ((sg) this).field_d) {
          throw new RuntimeException();
        } else {
          L0: {
            if (0 > param2) {
              break L0;
            } else {
              if (-1 > param1) {
                break L0;
              } else {
                if ((param2 ^ -1) <= -641) {
                  break L0;
                } else {
                  if (480 <= param1) {
                    break L0;
                  } else {
                    L1: {
                      if (!param0) {
                        break L1;
                      } else {
                        L2: {
                          var5 = this.a(param2, param1, 640);
                          if (0 == (var5 ^ -1)) {
                            break L2;
                          } else {
                            if (21 != qc.field_a[((sg) this).field_d][var5]) {
                              break L2;
                            } else {
                              break L1;
                            }
                          }
                        }
                        return -1;
                      }
                    }
                    var5 = qb.field_b[bk.field_b + sh.field_e * 640];
                    if (0 >= (var5 ^ -1)) {
                      return -1;
                    } else {
                      param2 = (2047 & var5 >> -1148534325) - -2 >> 950664418;
                      param1 = 2 + (var5 & 2047) >> 540732482;
                      L3: {
                        if (param3 <= -26) {
                          break L3;
                        } else {
                          field_l = null;
                          break L3;
                        }
                      }
                      var6 = 0;
                      L4: while (true) {
                        if (dc.field_z.length <= var6) {
                          return -1;
                        } else {
                          if (dc.field_z[var6].field_s + var6 * 95 <= param2) {
                            if (param2 < dc.field_z[var6].field_p + dc.field_z[var6].field_s + 95 * var6) {
                              if (-4 != (var6 ^ -1)) {
                                return var6;
                              } else {
                                return 2;
                              }
                            } else {
                              var6++;
                              continue L4;
                            }
                          } else {
                            var6++;
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          return -1;
        }
    }

    private final int a(byte param0, int param1) {
        if (param0 == 46) {
          L0: {
            if (-4 == ((sg) this).field_d) {
              break L0;
            } else {
              if (((sg) this).field_d == -13) {
                break L0;
              } else {
                L1: {
                  if (-5 == ((sg) this).field_d) {
                    break L1;
                  } else {
                    if (-14 != ((sg) this).field_d) {
                      if (((sg) this).field_d == -9) {
                        if ((param1 ^ -1) > -3) {
                          return 100 * param1;
                        } else {
                          return 0;
                        }
                      } else {
                        L2: {
                          if (((sg) this).field_d <= 8) {
                            break L2;
                          } else {
                            if (11 > ((sg) this).field_d) {
                              if (-4 >= (param1 ^ -1)) {
                                return 0;
                              } else {
                                return param1 * 100 + -100;
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                        if (-12 != ((sg) this).field_d) {
                          return 0;
                        } else {
                          if (2 > param1) {
                            return 100 * (param1 - 1);
                          } else {
                            return 0;
                          }
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                if (0 != param1) {
                  return 0;
                } else {
                  return -100;
                }
              }
            }
          }
          return 100 * param1;
        } else {
          return 101;
        }
    }

    final void a(byte param0) {
        int var3 = 0;
        Object var4 = null;
        var3 = Lexicominos.field_L ? 1 : 0;
        L0: while (true) {
          if (!ji.a((byte) -72)) {
            L1: {
              ((sg) this).field_c.a(this.a(ef.field_a, ck.field_a, 640), this.a(bk.field_b, sh.field_e, 640), param0 ^ 49);
              if (param0 == -88) {
                break L1;
              } else {
                var4 = null;
                sg.a((java.awt.Component) null, -97);
                break L1;
              }
            }
            L2: {
              if (0 != (((sg) this).field_c.field_d ^ -1)) {
                this.a(95, true, ((sg) this).field_c.field_d);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (nk.field_z == 0) {
                break L3;
              } else {
                ((sg) this).field_j = ck.field_a;
                ((sg) this).field_o = ef.field_a;
                break L3;
              }
            }
            L4: {
              if (null == ((sg) this).field_m) {
                break L4;
              } else {
                L5: {
                  ve.field_a = false;
                  ((sg) this).field_m.e(1);
                  if (((sg) this).field_m.a((byte) 94)) {
                    ((sg) this).field_b = ((sg) this).field_b + 1;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (-251 < (((sg) this).field_b ^ -1)) {
                  break L4;
                } else {
                  if ((((sg) this).field_d ^ -1) <= -12) {
                    break L4;
                  } else {
                    ((sg) this).field_k.a((byte) 104, false, 1 + ((sg) this).field_d, 14);
                    break L4;
                  }
                }
              }
            }
            return;
          } else {
            if (da.field_b == 13) {
              if (2 == ((sg) this).field_d) {
                ((sg) this).field_k.a((byte) 117, false, -1, 2);
                continue L0;
              } else {
                ((sg) this).field_k.a((byte) 114, false, ((sg) this).field_g, vg.field_d[((sg) this).field_g].field_g);
                if (8 > ((sg) this).field_d) {
                  continue L0;
                } else {
                  if (11 < ((sg) this).field_d) {
                    continue L0;
                  } else {
                    vg.field_d[14].field_g = ((sg) this).field_d;
                    continue L0;
                  }
                }
              }
            } else {
              this.a(-17253);
              if ((((sg) this).field_c.field_d ^ -1) == 0) {
                continue L0;
              } else {
                this.a(param0 ^ -34, false, ((sg) this).field_c.field_d);
                continue L0;
              }
            }
          }
        }
    }

    sg(Lexicominos param0, int param1) {
        ((sg) this).field_j = -1;
        ((sg) this).field_h = -1;
        ((sg) this).field_o = -1;
        ((sg) this).field_e = -1;
        ((sg) this).field_g = 0;
        ((sg) this).field_n = 0;
        ((sg) this).field_k = param0;
        ((sg) this).field_d = param1;
        uk.field_U[param1] = gg.field_a[0].field_x;
        ((sg) this).field_c = new fi(qc.field_a[param1].length);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new dg();
        field_f = "Waiting for languages";
        field_i = new oc();
    }
}
