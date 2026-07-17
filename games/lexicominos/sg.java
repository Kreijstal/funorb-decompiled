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
            if (vb.field_i < 2) {
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
                        if (((sg) this).field_n == 1) {
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
                  if (((sg) this).field_n != 4) {
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
          L5: {
            if (((sg) this).field_d == 3) {
              break L5;
            } else {
              if (((sg) this).field_d == 12) {
                break L5;
              } else {
                if (((sg) this).field_d == 13) {
                  break L5;
                } else {
                  L6: {
                    if (((sg) this).field_d == 4) {
                      break L6;
                    } else {
                      if (((sg) this).field_d == 11) {
                        break L6;
                      } else {
                        if (((sg) this).field_d == 8) {
                          L7: {
                            if (da.field_b == 98) {
                              L8: {
                                if (((sg) this).field_c.field_d == -1) {
                                  break L8;
                                } else {
                                  if (1 >= ((sg) this).field_c.field_d) {
                                    ((sg) this).field_c.a(2, 101);
                                    break L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              ((sg) this).field_c.a(0, 91);
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          L9: {
                            if (da.field_b == 99) {
                              if (((sg) this).field_c.field_d == 2) {
                                ((sg) this).field_c.a(0, 91);
                                break L9;
                              } else {
                                ((sg) this).field_c.a(2, 108);
                                break L9;
                              }
                            } else {
                              break L9;
                            }
                          }
                          L10: {
                            if (da.field_b != 96) {
                              break L10;
                            } else {
                              if (1 > ((sg) this).field_c.field_d) {
                                ((sg) this).field_c.a(1, 113);
                                break L10;
                              } else {
                                if (((sg) this).field_c.field_d == 1) {
                                  ((sg) this).field_c.a(0, 87);
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                          L11: {
                            if (97 == da.field_b) {
                              if (((sg) this).field_c.field_d != 0) {
                                if (((sg) this).field_c.field_d >= 2) {
                                  break L11;
                                } else {
                                  ((sg) this).field_c.a(0, 89);
                                  break L11;
                                }
                              } else {
                                ((sg) this).field_c.a(1, 120);
                                break L11;
                              }
                            } else {
                              break L11;
                            }
                          }
                          ((sg) this).field_c.b((byte) 24);
                          break L4;
                        } else {
                          L12: {
                            if (((sg) this).field_d <= 8) {
                              break L12;
                            } else {
                              if (((sg) this).field_d >= 11) {
                                break L12;
                              } else {
                                L13: {
                                  if (98 != da.field_b) {
                                    break L13;
                                  } else {
                                    L14: {
                                      if (((sg) this).field_c.field_d == -1) {
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
                                  if (da.field_b == 99) {
                                    if (((sg) this).field_c.field_d == 3) {
                                      ((sg) this).field_c.a(1, 106);
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
                                  if (da.field_b == 96) {
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
                                      if (((sg) this).field_c.field_d != 1) {
                                        if (3 <= ((sg) this).field_c.field_d) {
                                          break L17;
                                        } else {
                                          ((sg) this).field_c.a(0, 90);
                                          break L17;
                                        }
                                      } else {
                                        ((sg) this).field_c.a(2, 91);
                                        break L17;
                                      }
                                    } else {
                                      ((sg) this).field_c.a(1, 121);
                                      break L17;
                                    }
                                  }
                                }
                                ((sg) this).field_c.b((byte) 86);
                                break L4;
                              }
                            }
                          }
                          ((sg) this).field_c.a((byte) -123);
                          break L4;
                        }
                      }
                    }
                  }
                  L18: {
                    if (da.field_b != 98) {
                      break L18;
                    } else {
                      L19: {
                        if (((sg) this).field_c.field_d == -1) {
                          break L19;
                        } else {
                          if (((sg) this).field_c.field_d <= 1) {
                            ((sg) this).field_c.a(2, 107);
                            break L18;
                          } else {
                            break L19;
                          }
                        }
                      }
                      ((sg) this).field_c.a(1, 123);
                      break L18;
                    }
                  }
                  L20: {
                    if (da.field_b != 99) {
                      break L20;
                    } else {
                      if (((sg) this).field_c.field_d != 2) {
                        ((sg) this).field_c.a(2, 88);
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
                      if (((sg) this).field_c.field_d < 1) {
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
                  L22: {
                    if (da.field_b != 97) {
                      break L22;
                    } else {
                      if (0 == ((sg) this).field_c.field_d) {
                        ((sg) this).field_c.a(1, 109);
                        break L22;
                      } else {
                        if (((sg) this).field_c.field_d < 2) {
                          ((sg) this).field_c.a(0, 88);
                          break L22;
                        } else {
                          ((sg) this).field_c.b((byte) -128);
                          break L4;
                        }
                      }
                    }
                  }
                  ((sg) this).field_c.b((byte) -128);
                  break L4;
                }
              }
            }
          }
          ((sg) this).field_c.c((byte) 110);
          break L4;
        }
    }

    final static void a(java.awt.Component param0, int param1) {
        try {
            param0.setFocusTraversalKeysEnabled(false);
            if (param1 != 2) {
                boolean discarded$0 = sg.a(false);
            }
            param0.addKeyListener((java.awt.event.KeyListener) (Object) ol.field_l);
            param0.addFocusListener((java.awt.event.FocusListener) (Object) ol.field_l);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "sg.F(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
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
            if (((sg) this).field_e >= 15) {
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
              var9 = of.field_b;
              var10 = var9;
              var10 = var9;
              break L5;
            }
          }
          L6: {
            int discarded$5 = bi.field_a.a(var9, 48, -bi.field_a.field_E + var8, 242, 1000, 0, -1, 1, 0, var7);
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
              var13 = (var12 - 1) * 10 + (var11 - -(ob.field_e.field_p >> 2));
              var14 = -var13 + 338 >> 1;
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
              var12 = var11 - (-(ob.field_e.field_p >> 2) + -bi.field_a.b(id.field_t));
              var13 = 338 - var12 >> 1;
              bi.field_a.b(he.field_i, var13, var8, 0, -1);
              var13 = var13 + var11;
              ob.field_e.c(var13, var8 - bi.field_a.field_E);
              bi.field_a.b(id.field_t, var13 + (ob.field_e.field_p >> 2), var8, 0, -1);
              break L7;
            }
          }
          var8 = var8 + ob.field_e.field_u;
          return;
        }
    }

    final static ra a(int param0, int param1, int param2, int param3, int param4, ab param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        ra var7 = null;
        java.awt.Frame var8 = null;
        Object stackIn_2_0 = null;
        ra stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        ra stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var8 = oh.a(param2, param1, param4, (byte) 64, param3, param5);
            var6 = var8;
            if (var8 != null) {
              var7 = new ra();
              var7.field_b = var8;
              java.awt.Component discarded$2 = var7.field_b.add((java.awt.Component) (Object) var7);
              var7.setBounds(param0, 0, param1, param2);
              var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
              var7.requestFocus();
              stackOut_3_0 = (ra) var7;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ra) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var6_ref;
            stackOut_5_1 = new StringBuilder().append("sg.Q(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param5 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    private final void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        sg var7 = null;
        sg var8 = null;
        int stackIn_137_0 = 0;
        Lexicominos stackIn_139_0 = null;
        int stackIn_139_1 = 0;
        boolean stackIn_139_2 = false;
        Lexicominos stackIn_140_0 = null;
        int stackIn_140_1 = 0;
        boolean stackIn_140_2 = false;
        Lexicominos stackIn_141_0 = null;
        int stackIn_141_1 = 0;
        boolean stackIn_141_2 = false;
        int stackIn_141_3 = 0;
        Lexicominos stackOut_138_0 = null;
        int stackOut_138_1 = 0;
        boolean stackOut_138_2 = false;
        Lexicominos stackOut_140_0 = null;
        int stackOut_140_1 = 0;
        boolean stackOut_140_2 = false;
        int stackOut_140_3 = 0;
        Lexicominos stackOut_139_0 = null;
        int stackOut_139_1 = 0;
        boolean stackOut_139_2 = false;
        int stackOut_139_3 = 0;
        int stackOut_136_0 = 0;
        int stackOut_135_0 = 0;
        L0: {
          var6 = Lexicominos.field_L ? 1 : 0;
          var4 = qc.field_a[((sg) this).field_d][param2];
          if (var4 != 1) {
            if (var4 == 2) {
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
              if (var4 != 14) {
                if (5 == var4) {
                  if (!((sg) this).field_c.d(0)) {
                    break L0;
                  } else {
                    ((sg) this).field_k.a((byte) 98, param1, 1, 0);
                    break L0;
                  }
                } else {
                  if (16 != var4) {
                    if (var4 == 17) {
                      if (!((sg) this).field_c.d(0)) {
                        break L0;
                      } else {
                        if (((sg) this).field_d != 4) {
                          if (((sg) this).field_d != 13) {
                            if (((sg) this).field_d <= 8) {
                              break L0;
                            } else {
                              if (11 < ((sg) this).field_d) {
                                break L0;
                              } else {
                                ((sg) this).field_k.a((byte) -44, param1, -1 + ((sg) this).field_d, 14);
                                var4 = -1;
                                var5 = 0;
                                L2: while (true) {
                                  if (~var5 <= ~qc.field_a[((sg) this).field_d - 1].length) {
                                    L3: {
                                      if (-1 != var4) {
                                        break L3;
                                      } else {
                                        var5 = 0;
                                        L4: while (true) {
                                          if (~var5 <= ~qc.field_a[-1 + ((sg) this).field_d].length) {
                                            break L3;
                                          } else {
                                            L5: {
                                              if (qc.field_a[((sg) this).field_d + -1][var5] != 16) {
                                                break L5;
                                              } else {
                                                var4 = var5;
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
                                        var4 = var5;
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
                        if (var4 != 6) {
                          if (var4 == 19) {
                            if (((sg) this).field_c.d(0)) {
                              ((sg) this).field_k.a((byte) 116, param1, ((sg) this).field_g, 14);
                              break L0;
                            } else {
                              break L0;
                            }
                          } else {
                            if (var4 != 20) {
                              if (var4 != 8) {
                                if (var4 == 15) {
                                  if (!((sg) this).field_c.d(0)) {
                                    break L0;
                                  } else {
                                    ((sg) this).field_k.a((byte) -85, param1, 5, ((sg) this).field_d);
                                    break L0;
                                  }
                                } else {
                                  if (12 != var4) {
                                    if (var4 != 11) {
                                      if (var4 == 9) {
                                        L7: {
                                          if (((sg) this).field_c.b(-98)) {
                                            break L7;
                                          } else {
                                            if (((sg) this).field_c.e(471859200)) {
                                              break L7;
                                            } else {
                                              break L0;
                                            }
                                          }
                                        }
                                        tg.field_j = 32 / tg.field_j;
                                        break L0;
                                      } else {
                                        if (var4 != 10) {
                                          if (var4 == 4) {
                                            L8: {
                                              if (((sg) this).field_c.e((byte) -60)) {
                                                g.a(0, 118);
                                                break L8;
                                              } else {
                                                break L8;
                                              }
                                            }
                                            L9: {
                                              if (!((sg) this).field_c.a(-104)) {
                                                break L9;
                                              } else {
                                                g.a(256, 92);
                                                break L9;
                                              }
                                            }
                                            L10: {
                                              if (!((sg) this).field_c.c(-1)) {
                                                break L10;
                                              } else {
                                                var4 = this.a(bk.field_b, sh.field_e, (byte) 95);
                                                if (0 <= var4) {
                                                  g.a(var4, 107);
                                                  break L10;
                                                } else {
                                                  break L10;
                                                }
                                              }
                                            }
                                            L11: {
                                              if (((sg) this).field_c.f(98)) {
                                                if (oc.field_e <= 32) {
                                                  g.a(0, 112);
                                                  break L11;
                                                } else {
                                                  g.a(-32 + oc.field_e, 80);
                                                  break L11;
                                                }
                                              } else {
                                                break L11;
                                              }
                                            }
                                            if (((sg) this).field_c.d((byte) 85)) {
                                              if (oc.field_e >= 224) {
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
                                              if (var4 != 3) {
                                                if (var4 == 18) {
                                                  if (!((sg) this).field_c.d(0)) {
                                                    break L0;
                                                  } else {
                                                    ((sg) this).field_k.a((byte) 83, param1, 8, 14);
                                                    break L0;
                                                  }
                                                } else {
                                                  if (var4 == 21) {
                                                    L12: {
                                                      if (!((sg) this).field_c.d(0)) {
                                                        break L12;
                                                      } else {
                                                        if (param1) {
                                                          var4 = this.a(false, ck.field_a, ef.field_a, -89);
                                                          if (var4 != -1) {
                                                            jf.field_I = var4;
                                                            break L12;
                                                          } else {
                                                            break L12;
                                                          }
                                                        } else {
                                                          break L12;
                                                        }
                                                      }
                                                    }
                                                    L13: {
                                                      if (!((sg) this).field_c.f(-126)) {
                                                        break L13;
                                                      } else {
                                                        if (!param1) {
                                                          int fieldTemp$2 = jf.field_I - 1;
                                                          jf.field_I = jf.field_I - 1;
                                                          if (fieldTemp$2 < 0) {
                                                            jf.field_I = fl.field_a.length + -1;
                                                            break L13;
                                                          } else {
                                                            break L13;
                                                          }
                                                        } else {
                                                          break L13;
                                                        }
                                                      }
                                                    }
                                                    if (!((sg) this).field_c.d((byte) 88)) {
                                                      break L0;
                                                    } else {
                                                      if (!param1) {
                                                        int fieldTemp$3 = jf.field_I + 1;
                                                        jf.field_I = jf.field_I + 1;
                                                        if (fieldTemp$3 != fl.field_a.length) {
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
                                                L14: {
                                                  if (!((sg) this).field_c.e(471859200)) {
                                                    break L14;
                                                  } else {
                                                    L15: while (true) {
                                                      L16: {
                                                        if (rg.field_b == 0) {
                                                          rg.field_b = id.field_w.length;
                                                          break L16;
                                                        } else {
                                                          break L16;
                                                        }
                                                      }
                                                      rg.field_b = rg.field_b - 1;
                                                      if (id.field_w[rg.field_b].field_e) {
                                                        continue L15;
                                                      } else {
                                                        break L14;
                                                      }
                                                    }
                                                  }
                                                }
                                                if (!((sg) this).field_c.b(-98)) {
                                                  break L0;
                                                } else {
                                                  L17: while (true) {
                                                    L18: {
                                                      rg.field_b = rg.field_b + 1;
                                                      if (~rg.field_b == ~id.field_w.length) {
                                                        rg.field_b = 0;
                                                        break L18;
                                                      } else {
                                                        break L18;
                                                      }
                                                    }
                                                    if (id.field_w[rg.field_b].field_e) {
                                                      continue L17;
                                                    } else {
                                                      break L0;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              L19: {
                                                if (!((sg) this).field_c.e((byte) -60)) {
                                                  break L19;
                                                } else {
                                                  uh.field_n.a(0, 0);
                                                  break L19;
                                                }
                                              }
                                              L20: {
                                                if (((sg) this).field_c.a(-104)) {
                                                  uh.field_n.a(0, 256);
                                                  break L20;
                                                } else {
                                                  break L20;
                                                }
                                              }
                                              L21: {
                                                if (!((sg) this).field_c.c(-1)) {
                                                  break L21;
                                                } else {
                                                  var4 = this.a(bk.field_b, sh.field_e, (byte) 95);
                                                  if (var4 >= 0) {
                                                    uh.field_n.a(0, var4);
                                                    break L21;
                                                  } else {
                                                    break L21;
                                                  }
                                                }
                                              }
                                              L22: {
                                                if (((sg) this).field_c.f(-50)) {
                                                  if (uh.field_n.field_u > 32) {
                                                    uh.field_n.a(0, uh.field_n.field_u + -32);
                                                    break L22;
                                                  } else {
                                                    uh.field_n.a(0, 0);
                                                    break L22;
                                                  }
                                                } else {
                                                  break L22;
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
                                              kl.a(3 * bi.field_a.field_E >> 1, 4, 320, jh.field_b, 12, (le) (Object) bi.field_a, 4, (byte) -33, nh.field_c, var4 != 0, 1 + bi.field_a.field_E, 240);
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
                                          L23: {
                                            stackOut_138_0 = ((sg) this).field_k;
                                            stackOut_138_1 = -52;
                                            stackOut_138_2 = param1;
                                            stackIn_140_0 = stackOut_138_0;
                                            stackIn_140_1 = stackOut_138_1;
                                            stackIn_140_2 = stackOut_138_2;
                                            stackIn_139_0 = stackOut_138_0;
                                            stackIn_139_1 = stackOut_138_1;
                                            stackIn_139_2 = stackOut_138_2;
                                            if (0 >= ee.field_a) {
                                              stackOut_140_0 = (Lexicominos) (Object) stackIn_140_0;
                                              stackOut_140_1 = stackIn_140_1;
                                              stackOut_140_2 = stackIn_140_2;
                                              stackOut_140_3 = 1;
                                              stackIn_141_0 = stackOut_140_0;
                                              stackIn_141_1 = stackOut_140_1;
                                              stackIn_141_2 = stackOut_140_2;
                                              stackIn_141_3 = stackOut_140_3;
                                              break L23;
                                            } else {
                                              stackOut_139_0 = (Lexicominos) (Object) stackIn_139_0;
                                              stackOut_139_1 = stackIn_139_1;
                                              stackOut_139_2 = stackIn_139_2;
                                              stackOut_139_3 = 7;
                                              stackIn_141_0 = stackOut_139_0;
                                              stackIn_141_1 = stackOut_139_1;
                                              stackIn_141_2 = stackOut_139_2;
                                              stackIn_141_3 = stackOut_139_3;
                                              break L23;
                                            }
                                          }
                                          ((Lexicominos) (Object) stackIn_141_0).a((byte) stackIn_141_1, stackIn_141_2, stackIn_141_3, 0);
                                          break L0;
                                        } else {
                                          L24: {
                                            if ((ee.field_a | el.field_c.field_J) != 0) {
                                              stackOut_136_0 = 6;
                                              stackIn_137_0 = stackOut_136_0;
                                              break L24;
                                            } else {
                                              stackOut_135_0 = 0;
                                              stackIn_137_0 = stackOut_135_0;
                                              break L24;
                                            }
                                          }
                                          var4 = stackIn_137_0;
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
                                  L25: {
                                    if (((sg) this).field_d == 2) {
                                      break L25;
                                    } else {
                                      if (((sg) this).field_d != 14) {
                                        ((sg) this).field_k.a((byte) -126, param1, 3, ((sg) this).field_d);
                                        break L0;
                                      } else {
                                        break L25;
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
                          L26: {
                            if (((sg) this).field_d == 5) {
                              break L26;
                            } else {
                              if (((sg) this).field_d != 1) {
                                if (6 == ((sg) this).field_d) {
                                  qc.a(((sg) this).field_d, 7, 64);
                                  break L0;
                                } else {
                                  break L0;
                                }
                              } else {
                                break L26;
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
                        if (((sg) this).field_d != 12) {
                          if (((sg) this).field_d < 8) {
                            break L0;
                          } else {
                            if (((sg) this).field_d < 11) {
                              ((sg) this).field_k.a((byte) 115, param1, 1 + ((sg) this).field_d, 14);
                              var4 = -1;
                              var5 = 0;
                              L27: while (true) {
                                if (qc.field_a[1 + ((sg) this).field_d].length <= var5) {
                                  L28: {
                                    if (var4 != -1) {
                                      break L28;
                                    } else {
                                      var5 = 0;
                                      L29: while (true) {
                                        if (~var5 <= ~qc.field_a[((sg) this).field_d - -1].length) {
                                          break L28;
                                        } else {
                                          L30: {
                                            if (qc.field_a[((sg) this).field_d - -1][var5] != 1) {
                                              break L30;
                                            } else {
                                              var4 = var5;
                                              break L30;
                                            }
                                          }
                                          var5++;
                                          continue L29;
                                        }
                                      }
                                    }
                                  }
                                  var7 = vg.field_d[((sg) this).field_d + 1];
                                  var7.field_c.a(0, param1, var7.a(bk.field_b, sh.field_e, 640), var4);
                                  break L0;
                                } else {
                                  L31: {
                                    if (16 != qc.field_a[1 + ((sg) this).field_d][var5]) {
                                      break L31;
                                    } else {
                                      var4 = var5;
                                      break L31;
                                    }
                                  }
                                  var5++;
                                  continue L27;
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
              L32: {
                if (!ve.field_a) {
                  break L32;
                } else {
                  if (ki.a((byte) -118)) {
                    break L32;
                  } else {
                    if (!hh.field_N.field_k) {
                      ve.field_a = false;
                      break L32;
                    } else {
                      if (hh.field_N.field_n != null) {
                        if (hh.field_N.field_n[1][0] == 0) {
                          break L32;
                        } else {
                          ve.field_a = false;
                          break L32;
                        }
                      } else {
                        ve.field_a = false;
                        break L32;
                      }
                    }
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
                  if (vb.field_i < 2) {
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
                      if (((sg) this).field_d == 8) {
                        break L1;
                      } else {
                        if (((sg) this).field_d == 11) {
                          break L1;
                        } else {
                          L2: {
                            if (((sg) this).field_d <= 8) {
                              break L2;
                            } else {
                              if (((sg) this).field_d < 11) {
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
        int stackIn_20_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        L0: {
          var15 = Lexicominos.field_L ? 1 : 0;
          if (bk.field_b != -1) {
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
            var4 = 2 + (var5 & 2047) >> 2;
            var3 = (2047 & var5 >> 11) + 2 >> 2;
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
          if (var5 >= 0) {
            var6 = 2 + ((4193020 & var5) >> 11) >> 2;
            var7 = (2047 & var5) + 2 >> 2;
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
        var8 = stackIn_15_0;
        var9 = 0;
        var10 = -1 + jf.a((byte) 108, ee.field_a);
        ((sg) this).field_e = -1;
        var11 = 0;
        L5: while (true) {
          if (df.field_d.length <= var11) {
            L6: {
              if (((sg) this).field_h <= -1) {
                break L6;
              } else {
                ((sg) this).field_e = ((sg) this).field_h;
                break L6;
              }
            }
            return;
          } else {
            L7: {
              if ((var8 & 1 << var11) == 0) {
                stackOut_19_0 = 0;
                stackIn_20_0 = stackOut_19_0;
                break L7;
              } else {
                stackOut_18_0 = 1;
                stackIn_20_0 = stackOut_18_0;
                break L7;
              }
            }
            L8: {
              var12 = stackIn_20_0;
              if (var12 != 0) {
                break L8;
              } else {
                if (var11 != 14) {
                  if (!param0) {
                    break L8;
                  } else {
                    var11++;
                    continue L5;
                  }
                } else {
                  var11++;
                  continue L5;
                }
              }
            }
            L9: {
              if (param0) {
                var13 = ik.field_s[sb.field_e[var10][var9]];
                var14 = ik.field_b[sb.field_e[var10][var9]];
                var9++;
                break L9;
              } else {
                var13 = ik.field_s[var11];
                var14 = ik.field_b[var11];
                break L9;
              }
            }
            L10: {
              if (var12 != 0) {
                ef.field_d[var11].c(var13, var14);
                break L10;
              } else {
                e.field_u.c(var13, var14);
                break L10;
              }
            }
            L11: {
              if (var3 < var13) {
                break L11;
              } else {
                if (var3 > 32 + var13) {
                  break L11;
                } else {
                  if (var4 < var14) {
                    break L11;
                  } else {
                    if (var4 > 32 + var14) {
                      break L11;
                    } else {
                      ((sg) this).field_e = var11;
                      if (var12 != 0) {
                        md.field_A[var11].c(var13, var14);
                        break L11;
                      } else {
                        fl.field_c.c(var13, var14);
                        break L11;
                      }
                    }
                  }
                }
              }
            }
            L12: {
              if (-1 == ((sg) this).field_o) {
                break L12;
              } else {
                if (var13 > var6) {
                  break L12;
                } else {
                  if (var6 > var13 + 32) {
                    break L12;
                  } else {
                    if (var7 < var14) {
                      break L12;
                    } else {
                      if (var14 - -32 >= var7) {
                        ((sg) this).field_o = -1;
                        if (((sg) this).field_h == var11) {
                          ((sg) this).field_h = -1;
                          break L12;
                        } else {
                          ((sg) this).field_h = var11;
                          break L12;
                        }
                      } else {
                        break L12;
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
                continue L5;
              } else {
                fc.field_e[var11].c(var13, var14);
                var11++;
                continue L5;
              }
            } else {
              var11++;
              continue L5;
            }
          }
        }
    }

    private final boolean a(int param0, int param1) {
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
        RuntimeException var2_ref = null;
        hc var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_12_0 = null;
        hc stackIn_18_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        hc stackOut_17_0 = null;
        Object stackOut_11_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var5 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
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
                        stackOut_17_0 = (hc) var3;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  stackOut_11_0 = null;
                  stackIn_12_0 = stackOut_11_0;
                  return (hc) (Object) stackIn_12_0;
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var2_ref;
            stackOut_21_1 = new StringBuilder().append("sg.E(").append(param0).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L2;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L2;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
        }
    }

    private final int a(int param0, int param1, byte param2) {
        int var4 = 0;
        L0: {
          L1: {
            var4 = qb.field_b[param1 * 640 + param0];
            if (param0 < 0) {
              break L1;
            } else {
              if (param1 < 0) {
                break L1;
              } else {
                if (640 <= param0) {
                  break L1;
                } else {
                  if (param1 < 480) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          var4 = -1;
          break L0;
        }
        param1 = -1;
        param0 = -1;
        if (var4 < -1) {
          param1 = 2 + (2047 & var4) >> 2;
          param0 = ((var4 & 4192829) >> 11) + 2 >> 2;
          param0 = param0 - (118 + jf.field_N.field_r / 2);
          if (param0 < 0) {
            return 0;
          } else {
            if (param0 >= 128) {
              return 256;
            } else {
              return param0 << 1;
            }
          }
        } else {
          return -1;
        }
    }

    final void a(boolean param0, boolean param1) {
        int var3 = 0;
        Object var4 = null;
        L0: {
          var3 = 0;
          if (((sg) this).field_d != 0) {
            break L0;
          } else {
            if (((sg) this).field_c.field_d == -1) {
              break L0;
            } else {
              var3 = ((sg) this).field_c.field_d;
              break L0;
            }
          }
        }
        L1: {
          L2: {
            if (((sg) this).field_d == 2) {
              break L2;
            } else {
              if (((sg) this).field_d != 14) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          if (((sg) this).field_c.field_d == -1) {
            break L1;
          } else {
            if (-1 == aa.field_j) {
              break L1;
            } else {
              var3 = ((sg) this).field_c.field_d;
              break L1;
            }
          }
        }
        L3: {
          if (param1) {
            break L3;
          } else {
            var4 = null;
            sg.a((java.awt.Component) null, -7);
            break L3;
          }
        }
        L4: {
          if (((sg) this).field_d != 3) {
            break L4;
          } else {
            var3 = 1;
            break L4;
          }
        }
        ((sg) this).field_c.a(0, param0, this.a(bk.field_b, sh.field_e, 640), var3);
        ((sg) this).field_h = -1;
    }

    private final void a(int param0, int param1, int param2, db param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              param0 = param0 + param3.field_w;
              param4 = param4 + param3.field_s;
              var6_int = param4 - -(param0 * lf.field_f);
              var7 = 0;
              var8 = param3.field_u;
              var10 = 117 / ((param1 - -50) / 45);
              var9 = param3.field_p;
              var11 = lf.field_f - var9;
              if (~lf.field_c < ~param0) {
                var13 = -param0 + lf.field_c;
                var6_int = var6_int + var13 * lf.field_f;
                var8 = var8 - var13;
                param0 = lf.field_c;
                var7 = var7 + var9 * var13;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var12 = 0;
              if (~lf.field_h <= ~(var8 + param0)) {
                break L2;
              } else {
                var8 = var8 - (var8 + param0 - lf.field_h);
                break L2;
              }
            }
            L3: {
              if (lf.field_g > param4) {
                var13 = lf.field_g + -param4;
                var12 = var12 + var13;
                var11 = var11 + var13;
                var6_int = var6_int + var13;
                param4 = lf.field_g;
                var7 = var7 + var13;
                var9 = var9 - var13;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (var9 + param4 <= lf.field_e) {
                break L4;
              } else {
                var13 = -lf.field_e + param4 + var9;
                var9 = var9 - var13;
                var11 = var11 + var13;
                var12 = var12 + var13;
                break L4;
              }
            }
            L5: {
              if (var9 <= 0) {
                break L5;
              } else {
                if (var8 <= 0) {
                  break L5;
                } else {
                  d.a(param2, param3.field_y, var11, var8, var12, var9, var7, -61498200, lf.field_b, 0, var6_int);
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var6;
            stackOut_16_1 = new StringBuilder().append("sg.H(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param4 + 41);
        }
    }

    private final void a(db param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              param2 = param2 + param0.field_s;
              param3 = param3 + param0.field_w;
              var5_int = param2 + param3 * lf.field_f;
              var6 = 0;
              var7 = param0.field_u;
              var8 = param0.field_p;
              var9 = lf.field_f - var8;
              if (param3 < lf.field_c) {
                var11 = lf.field_c + -param3;
                param3 = lf.field_c;
                var6 = var6 + var11 * var8;
                var5_int = var5_int + lf.field_f * var11;
                var7 = var7 - var11;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var10 = 0;
              if (param2 >= lf.field_g) {
                break L2;
              } else {
                var11 = lf.field_g + -param2;
                var10 = var10 + var11;
                var9 = var9 + var11;
                var5_int = var5_int + var11;
                var8 = var8 - var11;
                var6 = var6 + var11;
                param2 = lf.field_g;
                break L2;
              }
            }
            L3: {
              if (var7 + param3 <= lf.field_h) {
                break L3;
              } else {
                var7 = var7 - (param3 + var7 + -lf.field_h);
                break L3;
              }
            }
            L4: {
              if (lf.field_e >= var8 + param2) {
                break L4;
              } else {
                var11 = -lf.field_e + var8 + param2;
                var9 = var9 + var11;
                var8 = var8 - var11;
                var10 = var10 + var11;
                break L4;
              }
            }
            L5: {
              if (var8 <= 0) {
                break L5;
              } else {
                if (var7 > 0) {
                  kc.a(var7, var8, lf.field_b, var6, param1, var10, param1 ^ 8, var5_int, param0.field_y, var9);
                  break L0;
                } else {
                  break L5;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("sg.M(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
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
          if (param0 < 0) {
            break L0;
          } else {
            if (param1 < 0) {
              break L0;
            } else {
              L1: {
                if (param0 >= 640) {
                  break L1;
                } else {
                  if (param1 >= 480) {
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
                              var5 = (2047 & var4 >> 11) + 2 >> 2;
                              var6 = 2 + (2047 & var4) >> 2;
                              var7 = 0;
                              if (((sg) this).field_d == 3) {
                                break L4;
                              } else {
                                if (((sg) this).field_d != 12) {
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
                            if (((sg) this).field_d < 8) {
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
        String var2_ref_String = null;
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
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
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
        int stackIn_70_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_68_0 = 0;
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
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
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
          if (~var2 <= ~((sg) this).field_c.field_h) {
            L3: {
              if (((sg) this).field_d == 1) {
                L4: {
                  var3 = pa.field_d - -(pa.field_d >> 1);
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
                        var2_ref_String = pc.field_l;
                        break L4;
                      } else {
                        var2_ref_String = fd.field_a;
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
                              L7: {
                                if (var6 != -1) {
                                  break L7;
                                } else {
                                  var8 = og.field_c;
                                  var16 = el.field_c.field_m.field_h;
                                  bi.field_a.b(var8, 66, var7 + pa.field_d + (-pa.field_d + 24) / 2, 10161935, -1);
                                  bi.field_a.c(Integer.toString(el.field_c.field_J), 301, pa.field_d + var7 - -((-pa.field_d + 24) / 2), 10161935, -1);
                                  this.a(12 + var7 + -(var16.field_u / 2), param0 ^ -102, 64, var16, 36 - var16.field_p / 2);
                                  break L7;
                                }
                              }
                              break L4;
                            }
                          } else {
                            L8: {
                              if (var14[var8_int] == null) {
                                break L8;
                              } else {
                                L9: {
                                  var9 = var14[var8_int];
                                  var10 = id.field_w[63 & var19[var8_int]].field_h;
                                  if (var6 != var8_int) {
                                    stackOut_69_0 = 0;
                                    stackIn_70_0 = stackOut_69_0;
                                    break L9;
                                  } else {
                                    stackOut_68_0 = 10161935;
                                    stackIn_70_0 = stackOut_68_0;
                                    break L9;
                                  }
                                }
                                var11 = stackIn_70_0;
                                bi.field_a.b(var9, 66, pa.field_d + (var7 + (24 + -pa.field_d) / 2), var11, -1);
                                bi.field_a.c(Integer.toString(var19[var8_int] >> 6), 301, pa.field_d + (var7 - -((24 + -pa.field_d) / 2)), var11, -1);
                                this.a(-(var10.field_u / 2) + var7 + 12, param0 ^ -109, 64, var10, -(var10.field_p / 2) + 36);
                                var2_ref_String = "";
                                bi.field_a.c(1 + var8_int + ".", 50, var7 - (-pa.field_d + -((24 - pa.field_d) / 2)), var11, -1);
                                break L8;
                              }
                            }
                            var7 += 27;
                            var8_int++;
                            continue L6;
                          }
                        }
                      }
                    } else {
                      var2_ref_String = ta.field_b;
                      break L4;
                    }
                  } else {
                    var2_ref_String = fd.field_a;
                    int discarded$6 = jh.field_d.a(al.field_G, 20, -jh.field_d.field_E + 280, 271, 1000, 0, -1, 1, 0, var3);
                    break L4;
                  }
                }
                int discarded$7 = bi.field_a.a(var2_ref_String, 20, -bi.field_a.field_E + 200, 271, 1000, 0, -1, 1, 0, var3);
                break L3;
              } else {
                if (((sg) this).field_d != 5) {
                  if (7 != ((sg) this).field_d) {
                    if (((sg) this).field_d == 6) {
                      L10: {
                        var2 = 50 - -bi.field_a.field_E;
                        var3 = bi.field_a.field_G + (bi.field_a.field_t + 4);
                        var2 = var2 + var3 * bi.field_a.a(me.field_u, 40, -bi.field_a.field_E + var2, 254, 1000, 0, -1, 1, 0, var3);
                        stackOut_38_0 = var2;
                        stackOut_38_1 = bi.field_a;
                        stackIn_40_0 = stackOut_38_0;
                        stackIn_40_1 = stackOut_38_1;
                        stackIn_39_0 = stackOut_38_0;
                        stackIn_39_1 = stackOut_38_1;
                        if (ee.field_a == 0) {
                          stackOut_40_0 = stackIn_40_0;
                          stackOut_40_1 = (cd) (Object) stackIn_40_1;
                          stackOut_40_2 = 0;
                          stackIn_41_0 = stackOut_40_0;
                          stackIn_41_1 = stackOut_40_1;
                          stackIn_41_2 = stackOut_40_2;
                          break L10;
                        } else {
                          stackOut_39_0 = stackIn_39_0;
                          stackOut_39_1 = (cd) (Object) stackIn_39_1;
                          stackOut_39_2 = 1;
                          stackIn_41_0 = stackOut_39_0;
                          stackIn_41_1 = stackOut_39_1;
                          stackIn_41_2 = stackOut_39_2;
                          break L10;
                        }
                      }
                      L11: {
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
                          break L11;
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
                          break L11;
                        }
                      }
                      L12: {
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
                        if (ee.field_a == 0) {
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
                          break L12;
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
                          break L12;
                        }
                      }
                      L13: {
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
                          break L13;
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
                          break L13;
                        }
                      }
                      L14: {
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
                        if (el.field_c.field_J == 0) {
                          stackOut_52_0 = stackIn_52_0;
                          stackOut_52_1 = stackIn_52_1;
                          stackOut_52_2 = (cd) (Object) stackIn_52_2;
                          stackOut_52_3 = 0;
                          stackIn_53_0 = stackOut_52_0;
                          stackIn_53_1 = stackOut_52_1;
                          stackIn_53_2 = stackOut_52_2;
                          stackIn_53_3 = stackOut_52_3;
                          break L14;
                        } else {
                          stackOut_51_0 = stackIn_51_0;
                          stackOut_51_1 = stackIn_51_1;
                          stackOut_51_2 = (cd) (Object) stackIn_51_2;
                          stackOut_51_3 = 1;
                          stackIn_53_0 = stackOut_51_0;
                          stackIn_53_1 = stackOut_51_1;
                          stackIn_53_2 = stackOut_51_2;
                          stackIn_53_3 = stackOut_51_3;
                          break L14;
                        }
                      }
                      L15: {
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
                        if (ee.field_a == 0) {
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
                          break L15;
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
                          break L15;
                        }
                      }
                      var2 = stackIn_56_0 + stackIn_56_1 * ((cd) (Object) stackIn_56_2).a(dd.a(stackIn_56_3 != 0, stackIn_56_4 != 0, false, -11902), 40, var2 - bi.field_a.field_E, 254, 1000, 0, -1, 1, 0, var3);
                      break L3;
                    } else {
                      L16: {
                        if (((sg) this).field_d == 3) {
                          break L16;
                        } else {
                          if (((sg) this).field_d != 12) {
                            L17: {
                              if (((sg) this).field_d == 4) {
                                break L17;
                              } else {
                                if (((sg) this).field_d != 13) {
                                  if (((sg) this).field_d != 8) {
                                    if (((sg) this).field_d == 9) {
                                      var2 = (pa.field_d >> 1) + pa.field_d;
                                      var3 = 40;
                                      int discarded$8 = jh.field_d.a(pk.field_D, 40, -jh.field_d.field_E + var3, 254, 1000, 0, -1, 0, 0, var2);
                                      mk.field_h.c(rk.field_k, 294, -10 + lf.field_a, 0, -1);
                                      break L3;
                                    } else {
                                      if (((sg) this).field_d == 10) {
                                        var2 = pa.field_d - -(pa.field_d >> 1);
                                        var3 = 40;
                                        int discarded$9 = jh.field_d.a(tf.field_b, 40, var3 - jh.field_d.field_E, 254, 1000, 0, -1, 0, 0, var2);
                                        mk.field_h.c(bl.field_a, 294, lf.field_a + -10, 0, -1);
                                        break L3;
                                      } else {
                                        if (((sg) this).field_d == 11) {
                                          var2 = (pa.field_d >> 1) + pa.field_d;
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
                                    var2 = pa.field_d - -(pa.field_d >> 1);
                                    var3 = 40;
                                    int discarded$11 = jh.field_d.a(kk.field_n, 40, -jh.field_d.field_E + var3, 254, 1000, 0, -1, 0, 0, var2);
                                    mk.field_h.c(cb.field_D, 294, lf.field_a + -10, 0, -1);
                                    break L3;
                                  }
                                } else {
                                  break L17;
                                }
                              }
                            }
                            var2 = 18;
                            var3 = 40;
                            var13 = ve.field_b;
                            var5 = 0;
                            L18: while (true) {
                              if (~var5 <= ~var13.length) {
                                mk.field_h.c(eg.field_E, 294, lf.field_a + -10, 0, -1);
                                break L3;
                              } else {
                                var6_ref_String = var13[var5];
                                var3 = var3 + var2 * jh.field_d.a(var6_ref_String, 40, var3 - jh.field_d.field_E, 254, 1000, 0, -1, 0, 0, var2);
                                var3 = var3 + var2;
                                var5++;
                                continue L18;
                              }
                            }
                          } else {
                            break L16;
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
            L19: {
              if (null != ((sg) this).field_m) {
                L20: {
                  if (((sg) this).field_d == 8) {
                    if (((sg) this).field_m.field_J != 0) {
                      if (((sg) this).field_m.field_J > ((sg) this).field_m.field_r) {
                        var2 = 256 * ((sg) this).field_m.field_r / ((sg) this).field_m.field_J;
                        ia.field_G.b(50, 213, -var2 + 256);
                        kf.field_A[1].b(0, ((sg) this).field_m.field_M, var2);
                        break L20;
                      } else {
                        kf.field_A[1].d(0, ((sg) this).field_m.field_M);
                        break L20;
                      }
                    } else {
                      L21: {
                        ia.field_G.d(50, 213);
                        if (((sg) this).field_m.field_A) {
                          this.a((byte) 66, 215, 53);
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      L22: {
                        if (!((sg) this).field_m.field_v) {
                          break L22;
                        } else {
                          this.a((byte) 46, 215, 151);
                          break L22;
                        }
                      }
                      L23: {
                        if (!((sg) this).field_m.field_E) {
                          break L23;
                        } else {
                          this.a((byte) -51, 215, 190);
                          break L23;
                        }
                      }
                      if (!((sg) this).field_m.field_O) {
                        break L20;
                      } else {
                        this.a((byte) 90, 215, 229);
                        break L20;
                      }
                    }
                  } else {
                    if (11 == ((sg) this).field_d) {
                      break L20;
                    } else {
                      kf.field_A[1].d(0, ((sg) this).field_m.field_M);
                      break L20;
                    }
                  }
                }
                ((sg) this).field_m.c((byte) -109);
                break L19;
              } else {
                break L19;
              }
            }
            return;
          } else {
            L24: {
              if (!this.a(var2, 0)) {
                break L24;
              } else {
                L25: {
                  stackOut_7_0 = this;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if (((sg) this).field_c.field_d != var2) {
                    stackOut_9_0 = this;
                    stackOut_9_1 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    break L25;
                  } else {
                    stackOut_8_0 = this;
                    stackOut_8_1 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    break L25;
                  }
                }
                this.a(stackIn_10_1 != 0, var2, 1956587489);
                break L24;
              }
            }
            var2++;
            continue L2;
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
            if (((sg) this).field_d != 7) {
              L3: {
                if (((sg) this).field_d == 3) {
                  break L3;
                } else {
                  if (((sg) this).field_d == 12) {
                    break L3;
                  } else {
                    L4: {
                      if (((sg) this).field_d == 4) {
                        break L4;
                      } else {
                        if (((sg) this).field_d == 13) {
                          break L4;
                        } else {
                          if (((sg) this).field_d == 1) {
                            if (!ki.a((byte) -114)) {
                              var2 = (pa.field_d >> 1) + pa.field_d;
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
                      if (~var5 <= ~var8.length) {
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
            if (((sg) this).field_d != 11) {
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
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var10 = Lexicominos.field_L ? 1 : 0;
          var4 = this.b((byte) -19, param1);
          var5 = qc.field_a[((sg) this).field_d][param1];
          if (var5 != 21) {
            L1: {
              var6_int = this.a((byte) 46, param1);
              if (!param0) {
                break L1;
              } else {
                ej.field_b[-1 + var5].d(var6_int, var4);
                break L1;
              }
            }
            gg.field_a[var5 + -1].d(var6_int, var4);
            break L0;
          } else {
            var6_int = this.a(true, sh.field_e, bk.field_b, -107);
            var7 = 0;
            L2: while (true) {
              if (4 <= var7) {
                break L0;
              } else {
                L3: {
                  hi.field_b[var7].d(95 * var7, var4);
                  if (var7 == 3) {
                    stackOut_5_0 = 2;
                    stackIn_6_0 = stackOut_5_0;
                    break L3;
                  } else {
                    stackOut_4_0 = var7;
                    stackIn_6_0 = stackOut_4_0;
                    break L3;
                  }
                }
                L4: {
                  var8 = stackIn_6_0;
                  var9 = 0;
                  if (var8 != jf.field_I) {
                    break L4;
                  } else {
                    L5: {
                      L6: {
                        if (((sg) this).field_c.field_i) {
                          break L6;
                        } else {
                          if (param0) {
                            stackOut_11_0 = 16777215;
                            stackIn_12_0 = stackOut_11_0;
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      stackOut_10_0 = 16755370;
                      stackIn_12_0 = stackOut_10_0;
                      break L5;
                    }
                    var9 = stackIn_12_0;
                    break L4;
                  }
                }
                L7: {
                  if (!((sg) this).field_c.field_i) {
                    break L7;
                  } else {
                    if (!param0) {
                      break L7;
                    } else {
                      if (~var6_int != ~var8) {
                        break L7;
                      } else {
                        var9 = 16777215;
                        break L7;
                      }
                    }
                  }
                }
                L8: {
                  if (16777215 == var9) {
                    dc.field_z[var7].d(95 * var7, var4);
                    break L8;
                  } else {
                    if (var9 == 0) {
                      break L8;
                    } else {
                      dc.field_z[var7].b(95 * var7, var4, 128);
                      break L8;
                    }
                  }
                }
                var7++;
                continue L2;
              }
            }
          }
        }
        L9: {
          var7 = var5;
          if (var7 != 4) {
            if (var7 != 7) {
              if (var7 != 3) {
                if (var7 != 9) {
                  break L9;
                } else {
                  wc.field_c[-1 + tg.field_j / 4].d(163, var4);
                  break L9;
                }
              } else {
                var6 = id.field_w[rg.field_b].field_h;
                var6.d(199 + (-var6.field_p + 36 >> 1), (24 + -var6.field_u >> 1) + 9 + var4);
                break L9;
              }
            } else {
              L10: {
                var7 = uh.field_n.field_u;
                if (var7 < 0) {
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
                if (param2 >= 640) {
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
                          if (var5 == -1) {
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
                    if (var5 >= -1) {
                      return -1;
                    } else {
                      param2 = (2047 & var5 >> 11) - -2 >> 2;
                      param1 = 2 + (var5 & 2047) >> 2;
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
                              if (var6 != 3) {
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
            if (((sg) this).field_d == 3) {
              break L0;
            } else {
              if (((sg) this).field_d == 12) {
                break L0;
              } else {
                L1: {
                  if (((sg) this).field_d == 4) {
                    break L1;
                  } else {
                    if (((sg) this).field_d != 13) {
                      if (((sg) this).field_d == 8) {
                        if (param1 < 2) {
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
                              if (param1 >= 3) {
                                return 0;
                              } else {
                                return param1 * 100 + -100;
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                        if (((sg) this).field_d != 11) {
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
              if (((sg) this).field_c.field_d != -1) {
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
                if (((sg) this).field_b < 250) {
                  break L4;
                } else {
                  if (((sg) this).field_d >= 11) {
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
              if (((sg) this).field_c.field_d == -1) {
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
        try {
            ((sg) this).field_k = param0;
            ((sg) this).field_d = param1;
            uk.field_U[param1] = gg.field_a[0].field_x;
            ((sg) this).field_c = new fi(qc.field_a[param1].length);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "sg.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
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
