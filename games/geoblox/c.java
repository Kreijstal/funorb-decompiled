/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c extends ka {
    private boolean field_S;
    private int field_X;
    private boolean field_H;
    private int field_Z;
    private int field_M;
    private int field_V;
    private int field_w;
    private int field_n;
    private Geoblox field_p;
    private int field_K;
    int field_y;
    private int field_o;
    private int field_B;
    private int field_t;
    private int field_L;
    private int[] field_P;
    private int field_T;
    private boolean field_C;
    static String[] field_Q;
    private int field_N;
    private int field_s;
    private int field_Y;
    static int field_ab;
    private double field_A;
    private boolean field_E;
    private int field_D;
    private int field_u;
    private int field_I;
    private kl field_R;
    private int field_U;
    static String field_r;
    private int field_W;
    int field_q;
    private boolean field_v;
    static java.applet.Applet field_x;
    private int field_F;
    private int field_O;
    private int field_z;

    final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Geoblox.field_C;
          var3 = t.field_i[((c) this).field_K][param0];
          if (var3 != 8) {
            if (var3 == 9) {
              if (102 == ki.field_d) {
                wg.a(-15346, 0);
                break L0;
              } else {
                if (103 == ki.field_d) {
                  wg.a(-15346, 80);
                  break L0;
                } else {
                  super.a(param0, -70);
                  break L0;
                }
              }
            } else {
              L1: {
                if (ki.field_d != 13) {
                  break L1;
                } else {
                  if (((c) this).field_C) {
                    break L1;
                  } else {
                    L2: {
                      if (((c) this).field_K != 1) {
                        ai.field_p = oc.field_b;
                        break L2;
                      } else {
                        ai.field_p = -1;
                        break L2;
                      }
                    }
                    if (~ai.field_p == ~((c) this).field_K) {
                      break L0;
                    } else {
                      L3: {
                        if (((c) this).field_K == 1) {
                          break L3;
                        } else {
                          if (((c) this).field_K != 0) {
                            break L0;
                          } else {
                            break L3;
                          }
                        }
                      }
                      oc.field_b = ((c) this).field_K;
                      break L0;
                    }
                  }
                }
              }
              if (!((c) this).field_C) {
                super.a(param0, -100);
                break L0;
              } else {
                L4: {
                  if (ki.field_d == 84) {
                    break L4;
                  } else {
                    if (83 != ki.field_d) {
                      break L0;
                    } else {
                      break L4;
                    }
                  }
                }
                if (fh.c(-103)) {
                  L5: {
                    if (((c) this).field_o == 1) {
                      break L5;
                    } else {
                      L6: {
                        if (((c) this).field_o >= 0) {
                          break L6;
                        } else {
                          if (qa.field_a <= 350) {
                            break L6;
                          } else {
                            if (470 <= qa.field_a) {
                              break L6;
                            } else {
                              if (ue.field_e <= 265) {
                                break L6;
                              } else {
                                if (ue.field_e >= 299) {
                                  break L6;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                        }
                      }
                      L7: {
                        if (((c) this).field_o == 0) {
                          break L7;
                        } else {
                          if (((c) this).field_o >= 0) {
                            break L0;
                          } else {
                            if (qa.field_a <= 170) {
                              break L0;
                            } else {
                              if (qa.field_a >= 290) {
                                break L0;
                              } else {
                                if (ue.field_e <= 265) {
                                  break L0;
                                } else {
                                  if (ue.field_e < 299) {
                                    break L7;
                                  } else {
                                    break L0;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      L8: {
                        ((c) this).field_g = true;
                        if (null != el.field_o) {
                          el.field_o.e((byte) -70);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      el.field_i = 0;
                      ai.field_p = -1;
                      cd.field_j = 0;
                      break L0;
                    }
                  }
                  ((c) this).field_g = true;
                  ((c) this).field_C = false;
                  break L0;
                } else {
                  L9: {
                    if (og.field_n > 0) {
                      break L9;
                    } else {
                      L10: {
                        if (((c) this).field_o == 0) {
                          break L10;
                        } else {
                          if (qa.field_a <= 190) {
                            break L9;
                          } else {
                            if (qa.field_a >= 449) {
                              break L9;
                            } else {
                              if (265 >= ue.field_e) {
                                break L9;
                              } else {
                                if (ue.field_e < 299) {
                                  break L10;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                      }
                      ((c) this).field_g = true;
                      ((c) this).field_C = false;
                      break L0;
                    }
                  }
                  if (vl.field_n != null) {
                    L11: {
                      if (1 == ((c) this).field_o) {
                        break L11;
                      } else {
                        L12: {
                          if (((c) this).field_o >= 0) {
                            break L12;
                          } else {
                            if (qa.field_a <= 350) {
                              break L12;
                            } else {
                              if (qa.field_a >= 470) {
                                break L12;
                              } else {
                                if (ue.field_e <= 327) {
                                  break L12;
                                } else {
                                  if (ue.field_e >= 362) {
                                    break L12;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L13: {
                          if (((c) this).field_o == 0) {
                            break L13;
                          } else {
                            if (((c) this).field_o >= 0) {
                              break L0;
                            } else {
                              if (qa.field_a <= 170) {
                                break L0;
                              } else {
                                if (qa.field_a >= 290) {
                                  break L0;
                                } else {
                                  if (ue.field_e <= 327) {
                                    break L0;
                                  } else {
                                    if (ue.field_e < 362) {
                                      break L13;
                                    } else {
                                      break L0;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        ((c) this).field_g = true;
                        ((c) this).field_C = false;
                        break L0;
                      }
                    }
                    ((c) this).field_C = false;
                    int discarded$2 = 255;
                    boolean discarded$3 = em.b();
                    ((c) this).field_g = true;
                    break L0;
                  } else {
                    L14: {
                      if (0 == ((c) this).field_o) {
                        break L14;
                      } else {
                        if (qa.field_a <= 260) {
                          break L0;
                        } else {
                          if (qa.field_a >= 380) {
                            break L0;
                          } else {
                            if (ue.field_e <= 274) {
                              break L0;
                            } else {
                              if (ue.field_e >= 309) {
                                break L0;
                              } else {
                                break L14;
                              }
                            }
                          }
                        }
                      }
                    }
                    ((c) this).field_g = true;
                    ((c) this).field_C = false;
                    break L0;
                  }
                }
              }
            }
          } else {
            L15: {
              if (102 == ki.field_d) {
                j.field_gb = 0;
                break L15;
              } else {
                if (ki.field_d == 103) {
                  j.field_gb = 80;
                  break L15;
                } else {
                  super.a(param0, -53);
                  break L15;
                }
              }
            }
            this.d(0);
            break L0;
          }
        }
        L16: {
          if (param1 <= -26) {
            break L16;
          } else {
            ((c) this).c(59);
            break L16;
          }
        }
    }

    private final void b(boolean param0) {
        int var3 = 0;
        int var4 = Geoblox.field_C;
        ((c) this).field_W = ((c) this).field_W % ee.field_A.field_s;
        ((c) this).field_O = ((c) this).field_O % ee.field_A.field_o;
        int var2 = -ee.field_A.field_s + ((c) this).field_W;
        while (640 > var2) {
            var3 = ee.field_A.field_o + ((c) this).field_O + 480;
            while (-ee.field_A.field_o <= var3) {
                ee.field_A.c(var2, var3);
                var3 = var3 - ee.field_A.field_o;
            }
            var2 = var2 + ee.field_A.field_s;
        }
        ((c) this).field_I = ((c) this).field_I % vc.field_j.field_o;
        ((c) this).field_u = ((c) this).field_u % vc.field_j.field_s;
        var2 = ((c) this).field_u + (vc.field_j.field_s + 640);
        while (-vc.field_j.field_s <= var2) {
            var3 = ((c) this).field_I - -vc.field_j.field_o + 480;
            while (var3 >= -vc.field_j.field_o) {
                vc.field_j.b(var2, var3);
                var3 = var3 - vc.field_j.field_o;
            }
            var2 = var2 - vc.field_j.field_s;
        }
    }

    private final void g(byte param0) {
        int var3 = 0;
        L0: {
          var3 = Geoblox.field_C;
          if (((c) this).field_H) {
            if (-4 < ((c) this).field_T) {
              ((c) this).field_T = ((c) this).field_T - 1;
              break L0;
            } else {
              ((c) this).field_H = false;
              break L0;
            }
          } else {
            if (((c) this).field_T < 0) {
              ((c) this).field_T = ((c) this).field_T + 1;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (param0 < -11) {
            break L1;
          } else {
            ((c) this).field_p = null;
            break L1;
          }
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var8_ref_String = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_37_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_93_0 = 0;
        int stackOut_92_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        var12 = Geoblox.field_C;
        if (param0 == -28750) {
          L0: {
            this.b(false);
            var2 = 270;
            var3 = 140;
            var4 = 400;
            if (((c) this).field_K == 0) {
              break L0;
            } else {
              if (((c) this).field_K == 1) {
                break L0;
              } else {
                if (((c) this).field_K != 4) {
                  L1: {
                    if (2 != ((c) this).field_K) {
                      var2 = 285;
                      break L1;
                    } else {
                      var2 = 235;
                      break L1;
                    }
                  }
                  L2: {
                    var5 = 120;
                    if (((c) this).field_K != 3) {
                      L3: {
                        if (((c) this).field_K == 8) {
                          break L3;
                        } else {
                          if (((c) this).field_K == 7) {
                            break L3;
                          } else {
                            break L2;
                          }
                        }
                      }
                      var4 += 20;
                      var5 -= 10;
                      break L2;
                    } else {
                      var5 += 10;
                      break L2;
                    }
                  }
                  ma.a(var3, var5, var2, (byte) -92, var4, ll.field_h);
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
          L4: {
            if (((c) this).field_E) {
              break L4;
            } else {
              super.a(param0);
              break L4;
            }
          }
          L5: {
            L6: {
              if (((c) this).field_K == 2) {
                break L6;
              } else {
                if (((c) this).field_K == 8) {
                  break L6;
                } else {
                  L7: {
                    if (5 == ((c) this).field_K) {
                      break L7;
                    } else {
                      if (7 != ((c) this).field_K) {
                        if (((c) this).field_K == 6) {
                          kh.field_h[7].b(0, 20);
                          ac.a(false, true, (byte) -122);
                          break L5;
                        } else {
                          if (((c) this).field_K != 4) {
                            if (((c) this).field_K == 3) {
                              kh.field_h[5].b(0, 20);
                              if (((c) this).field_E) {
                                var5 = ((c) this).field_F;
                                if (((c) this).field_v) {
                                  vb.e(var5, 0, 640, 480);
                                  this.b(-17, ((c) this).field_n);
                                  ((c) this).field_S = true;
                                  super.a(-28750);
                                  ((c) this).field_S = false;
                                  vb.e(0, 0, var5, 480);
                                  this.b(-48, ((c) this).field_q);
                                  super.a(-28750);
                                  vb.e(0, 0, 640, 480);
                                  qj.field_c.b(-(qj.field_c.field_o >> 1) + var5, 240, -16383, 4096);
                                  break L5;
                                } else {
                                  var5 = 640 + -var5;
                                  vb.e(0, 0, var5, 480);
                                  this.b(-85, ((c) this).field_n);
                                  ((c) this).field_S = true;
                                  super.a(-28750);
                                  ((c) this).field_S = false;
                                  vb.e(var5, 0, 640, 480);
                                  this.b(param0 ^ 28757, ((c) this).field_q);
                                  super.a(-28750);
                                  vb.e(0, 0, 640, 480);
                                  qj.field_c.b((qj.field_c.field_o >> 1) + var5, 240, -49150, 4096);
                                  break L5;
                                }
                              } else {
                                this.b(-97, ((c) this).field_q);
                                break L5;
                              }
                            } else {
                              L8: {
                                kh.field_h[0].b(0, 20);
                                if (((c) this).field_K == 0) {
                                  break L8;
                                } else {
                                  if (((c) this).field_K != 1) {
                                    break L5;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              if (((c) this).field_C) {
                                if (!fh.c(-93)) {
                                  if (og.field_n <= 0) {
                                    L9: {
                                      if (((c) this).field_y > 200) {
                                        stackOut_92_0 = 200;
                                        stackIn_93_0 = stackOut_92_0;
                                        break L9;
                                      } else {
                                        stackOut_91_0 = ((c) this).field_y;
                                        stackIn_93_0 = stackOut_91_0;
                                        break L9;
                                      }
                                    }
                                    L10: {
                                      L11: {
                                        var5 = stackIn_93_0;
                                        vb.b(0, 0, 640, 480, 0, var5);
                                        ma.a(170, 160, 80, (byte) -92, 320, ll.field_h);
                                        var6 = 180;
                                        int discarded$4 = fi.field_d.a(ki.field_a, 170, var6, 300, 300, 0, -1, 1, 0, 16);
                                        var7 = 242;
                                        var8 = 320 - (var7 + 20 >> 1);
                                        var9 = 10 + (var8 + (var7 >> 1));
                                        var6 = 265;
                                        ma.a(var6, var8, 36, (byte) -92, var7 + 20, eb.field_g);
                                        if (((c) this).field_o == 0) {
                                          break L11;
                                        } else {
                                          if (qa.field_a <= 190) {
                                            break L10;
                                          } else {
                                            if (qa.field_a >= 449) {
                                              break L10;
                                            } else {
                                              if (ue.field_e <= 265) {
                                                break L10;
                                              } else {
                                                if (299 <= ue.field_e) {
                                                  break L10;
                                                } else {
                                                  break L11;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      dd.field_G.field_K[0][wf.field_p] = 15488514;
                                      break L10;
                                    }
                                    dd.field_G.b(hh.field_b, var9, 30 + var6, 0, -1);
                                    dd.field_G.field_K[0][wf.field_p] = 16689938;
                                    break L5;
                                  } else {
                                    if (vl.field_n != null) {
                                      L12: {
                                        if (((c) this).field_y <= 200) {
                                          stackOut_69_0 = ((c) this).field_y;
                                          stackIn_70_0 = stackOut_69_0;
                                          break L12;
                                        } else {
                                          stackOut_68_0 = 200;
                                          stackIn_70_0 = stackOut_68_0;
                                          break L12;
                                        }
                                      }
                                      L13: {
                                        var5 = stackIn_70_0;
                                        vb.b(0, 0, 640, 480, 0, var5);
                                        ma.a(160, 160, 140, (byte) -92, 320, ll.field_h);
                                        var6 = 170;
                                        var7_ref_String = ue.field_c + " " + pb.field_v + " " + wj.field_C + " " + rb.field_a + " " + uj.field_d;
                                        var6 = var6 + 16 * fi.field_d.a(var7_ref_String, 170, var6, 300, 300, 0, -1, 1, 0, 16);
                                        var6 += 10;
                                        var8_ref_String = Integer.toString((1500 - ((c) this).field_y) / 150 - -1);
                                        if ((1500 - ((c) this).field_y) / 150 > 0) {
                                          var6 = var6 + fi.field_d.a(wj.a(jk.field_b, new String[1], (byte) -45), 170, var6, 300, 300, 0, -1, 1, 0, 16) * 16;
                                          break L13;
                                        } else {
                                          var6 = var6 + fi.field_d.a(wj.a(mj.field_c, new String[1], (byte) -51), 170, var6, 300, 300, 0, -1, 1, 0, 16) * 16;
                                          break L13;
                                        }
                                      }
                                      L14: {
                                        L15: {
                                          var6 += 40;
                                          var9 = 100;
                                          var10 = -(20 + var9 >> 1) + 410;
                                          ma.a(var6, var10, 36, (byte) -92, var9 - -20, eb.field_g);
                                          var11 = 10 + ((var9 >> 1) + var10);
                                          if (((c) this).field_o == 1) {
                                            break L15;
                                          } else {
                                            if (0 <= ((c) this).field_o) {
                                              break L14;
                                            } else {
                                              if (qa.field_a <= 350) {
                                                break L14;
                                              } else {
                                                if (qa.field_a >= 470) {
                                                  break L14;
                                                } else {
                                                  if (ue.field_e <= 317) {
                                                    break L14;
                                                  } else {
                                                    if (ue.field_e < 352) {
                                                      break L15;
                                                    } else {
                                                      break L14;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        dd.field_G.field_K[0][wf.field_p] = 15488514;
                                        break L14;
                                      }
                                      L16: {
                                        L17: {
                                          dd.field_G.b(rb.field_a, var11, 30 + var6, 0, -1);
                                          dd.field_G.field_K[0][wf.field_p] = 16689938;
                                          var10 = 320 + -(20 + var9 >> 1) - 90;
                                          var11 = 10 + (var9 >> 1) + var10;
                                          ma.a(var6, var10, 36, (byte) -92, 20 + var9, eb.field_g);
                                          if (((c) this).field_o == 0) {
                                            break L17;
                                          } else {
                                            if (((c) this).field_o >= 0) {
                                              break L16;
                                            } else {
                                              if (qa.field_a <= 170) {
                                                break L16;
                                              } else {
                                                if (qa.field_a >= 290) {
                                                  break L16;
                                                } else {
                                                  if (ue.field_e <= 317) {
                                                    break L16;
                                                  } else {
                                                    if (ue.field_e >= 352) {
                                                      break L16;
                                                    } else {
                                                      break L17;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        dd.field_G.field_K[0][wf.field_p] = 15488514;
                                        break L16;
                                      }
                                      dd.field_G.b(pb.field_v, var11, 30 + var6, 0, -1);
                                      dd.field_G.field_K[0][wf.field_p] = 16689938;
                                      break L5;
                                    } else {
                                      L18: {
                                        if (((c) this).field_y > 200) {
                                          stackOut_58_0 = 200;
                                          stackIn_59_0 = stackOut_58_0;
                                          break L18;
                                        } else {
                                          stackOut_57_0 = ((c) this).field_y;
                                          stackIn_59_0 = stackOut_57_0;
                                          break L18;
                                        }
                                      }
                                      L19: {
                                        L20: {
                                          var5 = stackIn_59_0;
                                          vb.b(0, 0, 640, 480, 0, var5);
                                          ma.a(160, 160, 95, (byte) -92, 320, ll.field_h);
                                          var6 = 170;
                                          var6 = var6 + 16 * fi.field_d.a(sj.field_e, 170, var6, 300, 300, 0, -1, 1, 0, 16);
                                          var6 += 40;
                                          var7 = 100;
                                          var8 = 320 + -(var7 + 20 >> 1);
                                          var9 = (var7 >> 1) + (var8 + 10);
                                          ma.a(var6, var8, 36, (byte) -92, 20 + var7, eb.field_g);
                                          if (0 == ((c) this).field_o) {
                                            break L20;
                                          } else {
                                            if (260 >= qa.field_a) {
                                              break L19;
                                            } else {
                                              if (qa.field_a >= 380) {
                                                break L19;
                                              } else {
                                                if (ue.field_e <= 274) {
                                                  break L19;
                                                } else {
                                                  if (ue.field_e >= 309) {
                                                    break L19;
                                                  } else {
                                                    break L20;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        dd.field_G.field_K[0][wf.field_p] = 15488514;
                                        break L19;
                                      }
                                      dd.field_G.b(hh.field_b, var9, 30 + var6, 0, -1);
                                      dd.field_G.field_K[0][wf.field_p] = 16689938;
                                      break L5;
                                    }
                                  }
                                } else {
                                  L21: {
                                    if (((c) this).field_y <= 200) {
                                      stackOut_36_0 = ((c) this).field_y;
                                      stackIn_37_0 = stackOut_36_0;
                                      break L21;
                                    } else {
                                      stackOut_35_0 = 200;
                                      stackIn_37_0 = stackOut_35_0;
                                      break L21;
                                    }
                                  }
                                  L22: {
                                    L23: {
                                      var5 = stackIn_37_0;
                                      vb.b(0, 0, 640, 480, 0, var5);
                                      ma.a(160, 150, 80, (byte) -92, 340, ll.field_h);
                                      var6 = 170;
                                      int discarded$5 = fi.field_d.a(ki.field_a, 160, var6, 320, 300, 0, -1, 1, 0, 16);
                                      var7 = 100;
                                      var8 = -(20 + var7 >> 1) + 410;
                                      var6 = 265;
                                      var9 = var8 - (-(var7 >> 1) - 10);
                                      ma.a(var6, var8, 36, (byte) -92, 20 + var7, eb.field_g);
                                      if (1 == ((c) this).field_o) {
                                        break L23;
                                      } else {
                                        if (((c) this).field_o >= 0) {
                                          break L22;
                                        } else {
                                          if (350 >= qa.field_a) {
                                            break L22;
                                          } else {
                                            if (qa.field_a >= 470) {
                                              break L22;
                                            } else {
                                              if (ue.field_e <= 265) {
                                                break L22;
                                              } else {
                                                if (ue.field_e >= 299) {
                                                  break L22;
                                                } else {
                                                  break L23;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    dd.field_G.field_K[0][wf.field_p] = 15488514;
                                    break L22;
                                  }
                                  L24: {
                                    L25: {
                                      dd.field_G.b(hh.field_b, var9, 30 + var6, 0, -1);
                                      var8 = 320 - (20 + var7 >> 1) - 90;
                                      dd.field_G.field_K[0][wf.field_p] = 16689938;
                                      var6 = 265;
                                      var9 = 10 + (var7 >> 1) + var8;
                                      ma.a(var6, var8, 36, (byte) -92, var7 + 20, eb.field_g);
                                      if (((c) this).field_o == 0) {
                                        break L25;
                                      } else {
                                        if (0 <= ((c) this).field_o) {
                                          break L24;
                                        } else {
                                          if (170 >= qa.field_a) {
                                            break L24;
                                          } else {
                                            if (qa.field_a >= 290) {
                                              break L24;
                                            } else {
                                              if (ue.field_e <= 265) {
                                                break L24;
                                              } else {
                                                if (ue.field_e >= 299) {
                                                  break L24;
                                                } else {
                                                  break L25;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    dd.field_G.field_K[0][wf.field_p] = 15488514;
                                    break L24;
                                  }
                                  dd.field_G.b(qb.field_L, var9, 30 + var6, 0, -1);
                                  dd.field_G.field_K[0][wf.field_p] = 16689938;
                                  break L5;
                                }
                              } else {
                                break L5;
                              }
                            }
                          } else {
                            kh.field_h[8].b(0, 20);
                            ma.a(var3 + 10, 120, 100, (byte) -92, var4, ll.field_h);
                            var5 = 184;
                            dd.field_G.b(Geoblox.field_A, 320, var5, 0, -1);
                            var5 = 185;
                            int discarded$6 = fi.field_d.a(r.field_sb, 130, var5, 380, 300, 0, -1, 1, 0, 14);
                            ma.a(320, 120, 60, (byte) -92, var4, ll.field_h);
                            int discarded$7 = fi.field_d.a(bd.field_b, 130, 330, 380, 300, 0, -1, 1, 0, 14);
                            break L5;
                          }
                        }
                      } else {
                        break L7;
                      }
                    }
                  }
                  kh.field_h[4].b(0, 20);
                  ac.a(false, false, (byte) -93);
                  break L5;
                }
              }
            }
            this.b(30);
            break L5;
          }
          return;
        } else {
          return;
        }
    }

    final void a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Geoblox.field_C;
          var3 = 121 % ((44 - param1) / 36);
          var4 = t.field_i[((c) this).field_K][param0];
          if (var4 != 8) {
            if (9 == var4) {
              if (oc.field_c <= 10) {
                wg.a(-15346, 0);
                break L0;
              } else {
                wg.a(-15346, oc.field_c - 10);
                break L0;
              }
            } else {
              break L0;
            }
          } else {
            if (j.field_gb <= 10) {
              j.field_gb = 0;
              break L0;
            } else {
              j.field_gb = j.field_gb - 10;
              break L0;
            }
          }
        }
    }

    public static void d(byte param0) {
        field_Q = null;
        field_x = null;
        field_r = null;
        if (param0 != 28) {
            char discarded$0 = c.c(79, (byte) -113);
        }
    }

    private final void c(byte param0) {
        int var3 = 0;
        L0: {
          var3 = Geoblox.field_C;
          if (param0 < -40) {
            break L0;
          } else {
            this.b(77, -13);
            break L0;
          }
        }
        L1: {
          if (3 != ((c) this).field_K) {
            break L1;
          } else {
            L2: {
              if (((c) this).field_E) {
                break L2;
              } else {
                L3: {
                  if (((c) this).field_q == 4) {
                    break L3;
                  } else {
                    if (((c) this).field_b == 3) {
                      ((c) this).field_b = 0;
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
                if (4 != ((c) this).field_q) {
                  if (((c) this).field_q != 0) {
                    break L2;
                  } else {
                    if (((c) this).field_b == 0) {
                      ((c) this).field_b = 1;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  L4: {
                    if (((c) this).field_b == 2) {
                      ((c) this).field_b = 3;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if (oc.field_b != 1) {
                    break L2;
                  } else {
                    if (((c) this).field_b == 3) {
                      ((c) this).field_b = 0;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            break L1;
          }
        }
    }

    final int a(int param0, int param1, byte param2) {
        if (param2 >= 20) {
          L0: {
            if (0 == ((c) this).field_K) {
              break L0;
            } else {
              if (((c) this).field_K != 1) {
                L1: {
                  if (((c) this).field_K == 3) {
                    if (param1 <= 430) {
                      break L1;
                    } else {
                      if (param1 >= 470) {
                        break L1;
                      } else {
                        L2: {
                          if (((c) this).field_q == 0) {
                            break L2;
                          } else {
                            if (param0 <= 130) {
                              break L2;
                            } else {
                              if (param0 < 253) {
                                return 0;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                        L3: {
                          if (param0 <= 268) {
                            break L3;
                          } else {
                            if (391 <= param0) {
                              break L3;
                            } else {
                              return 1;
                            }
                          }
                        }
                        L4: {
                          if (((c) this).field_q == 4) {
                            break L4;
                          } else {
                            if (param0 <= 406) {
                              break L4;
                            } else {
                              if (param0 < 529) {
                                return 2;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        if (((c) this).field_q != 4) {
                          break L1;
                        } else {
                          if (oc.field_b == 1) {
                            break L1;
                          } else {
                            if (param0 <= 406) {
                              break L1;
                            } else {
                              if (param0 < 635) {
                                return 3;
                              } else {
                                break L1;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    if (((c) this).field_K != 5) {
                      L5: {
                        if (((c) this).field_K == 7) {
                          break L5;
                        } else {
                          if (((c) this).field_K != 8) {
                            if (2 == ((c) this).field_K) {
                              L6: {
                                if (param1 <= 380) {
                                  break L6;
                                } else {
                                  if (param1 >= 420) {
                                    break L6;
                                  } else {
                                    L7: {
                                      if (param0 <= 61) {
                                        break L7;
                                      } else {
                                        if (220 > param0) {
                                          return 0;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    L8: {
                                      if (241 >= param0) {
                                        break L8;
                                      } else {
                                        if (param0 >= 400) {
                                          break L8;
                                        } else {
                                          return 1;
                                        }
                                      }
                                    }
                                    if (param0 <= 420) {
                                      break L1;
                                    } else {
                                      if (param0 >= 579) {
                                        break L1;
                                      } else {
                                        return 2;
                                      }
                                    }
                                  }
                                }
                              }
                              if (param1 <= 430) {
                                break L1;
                              } else {
                                if (param1 >= 470) {
                                  break L1;
                                } else {
                                  if (param0 <= 279) {
                                    break L1;
                                  } else {
                                    if (param0 >= 362) {
                                      break L1;
                                    } else {
                                      return 3;
                                    }
                                  }
                                }
                              }
                            } else {
                              if (((c) this).field_K != 4) {
                                if (6 != ((c) this).field_K) {
                                  break L1;
                                } else {
                                  if (param1 <= 430) {
                                    break L1;
                                  } else {
                                    if (470 <= param1) {
                                      break L1;
                                    } else {
                                      L9: {
                                        if (param0 <= 146) {
                                          break L9;
                                        } else {
                                          if (param0 >= 306) {
                                            break L9;
                                          } else {
                                            return 0;
                                          }
                                        }
                                      }
                                      if (param0 <= 326) {
                                        break L1;
                                      } else {
                                        if (param0 < 486) {
                                          return 1;
                                        } else {
                                          break L1;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                if (param0 <= 171) {
                                  break L1;
                                } else {
                                  if (param0 < 469) {
                                    L10: {
                                      if (265 >= param1) {
                                        break L10;
                                      } else {
                                        if (param1 >= 301) {
                                          break L10;
                                        } else {
                                          return 0;
                                        }
                                      }
                                    }
                                    if (param1 <= 395) {
                                      break L1;
                                    } else {
                                      if (431 <= param1) {
                                        break L1;
                                      } else {
                                        return 1;
                                      }
                                    }
                                  } else {
                                    break L1;
                                  }
                                }
                              }
                            }
                          } else {
                            break L5;
                          }
                        }
                      }
                      if (param1 <= 437) {
                        break L1;
                      } else {
                        if (param1 < 473) {
                          L11: {
                            if (param0 <= 121) {
                              break L11;
                            } else {
                              if (356 <= param0) {
                                break L11;
                              } else {
                                return 0;
                              }
                            }
                          }
                          if (436 >= param0) {
                            break L1;
                          } else {
                            if (param1 >= 518) {
                              break L1;
                            } else {
                              return 1;
                            }
                          }
                        } else {
                          break L1;
                        }
                      }
                    } else {
                      if (param1 <= 435) {
                        break L1;
                      } else {
                        if (470 <= param1) {
                          break L1;
                        } else {
                          if (param0 <= 279) {
                            break L1;
                          } else {
                            if (361 <= param0) {
                              break L1;
                            } else {
                              return 0;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                return -1;
              } else {
                break L0;
              }
            }
          }
          L12: {
            if (param0 < 149) {
              break L12;
            } else {
              if (490 < param0) {
                break L12;
              } else {
                return super.a(param0, param1, (byte) 127);
              }
            }
          }
          return -1;
        } else {
          return -109;
        }
    }

    private final void b(int param0) {
        String var2 = null;
        int var2_int = 0;
        int var3 = 0;
        String[] var3_ref_String__ = null;
        bg var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String var8 = null;
        String var9 = null;
        int var10 = 0;
        int[] var11 = null;
        String var12 = null;
        int[] var13 = null;
        String var14 = null;
        String var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        L0: {
          var10 = Geoblox.field_C;
          if (ca.field_f != null) {
            break L0;
          } else {
            if (fh.c(-115)) {
              break L0;
            } else {
              ca.field_f = qb.b(22, 1, 0, 10, 3);
              break L0;
            }
          }
        }
        L1: {
          if (0 == da.field_c) {
            kh.field_h[1].b(0, 20);
            break L1;
          } else {
            if (da.field_c == 2) {
              kh.field_h[2].b(0, 20);
              break L1;
            } else {
              if (da.field_c != 1) {
                break L1;
              } else {
                kh.field_h[3].b(0, 20);
                break L1;
              }
            }
          }
        }
        L2: {
          L3: {
            if (null == ca.field_f) {
              break L3;
            } else {
              if (null == ca.field_f.field_k) {
                break L3;
              } else {
                if (ca.field_f.field_j) {
                  L4: {
                    var2_int = 0;
                    var3_ref_String__ = ca.field_f.field_k[da.field_c];
                    var4 = fi.field_d;
                    if (var3_ref_String__ == null) {
                      break L4;
                    } else {
                      var18 = ca.field_f.field_h[da.field_c];
                      var17 = var18;
                      var16 = var17;
                      var13 = var16;
                      var11 = var13;
                      var5 = var11;
                      var6 = var4.field_o + 150;
                      var7 = 0;
                      var8_int = 0;
                      L5: while (true) {
                        if (var8_int >= 10) {
                          if (var7 != 0) {
                            break L4;
                          } else {
                            if (null == el.field_o) {
                              break L4;
                            } else {
                              if (-1 == el.field_o.field_o) {
                                break L4;
                              } else {
                                if (2147483647 != el.field_o.field_o) {
                                  var8 = wd.field_f;
                                  var4.a(var8, 165, var6, 16724225, -1);
                                  var4.c(Integer.toString(Math.abs(el.field_o.field_o)), 500, var6, 16724225, -1);
                                  break L4;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                        } else {
                          if (null != var3_ref_String__[var8_int]) {
                            L6: {
                              var18 = var17;
                              var2_int = 1;
                              var9 = var3_ref_String__[var8_int];
                              if (var7 != 0) {
                                break L6;
                              } else {
                                if (null == el.field_o) {
                                  break L6;
                                } else {
                                  if (var18[var8_int] != Math.abs(el.field_o.field_o)) {
                                    break L6;
                                  } else {
                                    int discarded$3 = 12;
                                    if (!ge.a(var9)) {
                                      break L6;
                                    } else {
                                      var7 = 1;
                                      var4.c(1 + var8_int + ". ", 165, var6, 16610816, -1);
                                      var4.a(var9, 165, var6, 16610816, -1);
                                      var4.c(Integer.toString(var18[var8_int]), 500, var6, 16610816, -1);
                                      var6 += 15;
                                      var8_int++;
                                      continue L5;
                                    }
                                  }
                                }
                              }
                            }
                            var18 = var17;
                            var4.c(1 + var8_int + ". ", 165, var6, 1, -1);
                            var4.a(var9, 165, var6, 1, -1);
                            var4.c(Integer.toString(var18[var8_int]), 500, var6, 1, -1);
                            var6 += 15;
                            var8_int++;
                            continue L5;
                          } else {
                            var6 += 15;
                            var8_int++;
                            continue L5;
                          }
                        }
                      }
                    }
                  }
                  if (var2_int != 0) {
                    break L2;
                  } else {
                    var14 = sb.field_f;
                    var6 = 76 + dd.field_G.field_o + 150;
                    dd.field_G.b(var14, 322, var6, 0, -1);
                    break L2;
                  }
                } else {
                  var12 = eb.field_f;
                  var3 = 76 + (150 + dd.field_G.field_o);
                  dd.field_G.b(var12, 322, var3, 0, -1);
                  break L2;
                }
              }
            }
          }
          L7: {
            if (fh.c(-89)) {
              var2 = sb.field_f;
              break L7;
            } else {
              var2 = g.field_l;
              break L7;
            }
          }
          var3 = 150 - (-dd.field_G.field_o - 76);
          dd.field_G.b(var2, 322, var3, 0, -1);
          if (!fh.c(-117)) {
            break L2;
          } else {
            int discarded$4 = dd.field_G.a(ni.field_C, 125, 350, 395, 100, 0, -1, 1, 0, 26);
            break L2;
          }
        }
        L8: {
          if (fh.c(-115)) {
            break L8;
          } else {
            var15 = ue.field_b;
            int discarded$5 = fi.field_d.a(var15, 140, 325, 360, 300, 0, -1, 1, 0, 16);
            break L8;
          }
        }
    }

    final void h(byte param0) {
        float var2_float = 0.0f;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = Geoblox.field_C;
          int fieldTemp$9 = ((c) this).field_D + 1;
          ((c) this).field_D = ((c) this).field_D + 1;
          if (fieldTemp$9 % 5 == 0) {
            ((c) this).field_O = ((c) this).field_O - 1;
            ((c) this).field_W = ((c) this).field_W + 1;
            this.g((byte) -102);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (3 != (((c) this).field_D & 3)) {
            break L1;
          } else {
            ((c) this).field_I = ((c) this).field_I - 1;
            ((c) this).field_u = ((c) this).field_u - 1;
            break L1;
          }
        }
        if (!((c) this).field_E) {
          L2: {
            L3: {
              jk.field_a = ((c) this).field_C;
              ((c) this).field_U = ((c) this).field_U + 1;
              ((c) this).field_y = ((c) this).field_y + 1;
              if (!((c) this).field_C) {
                break L3;
              } else {
                if (vl.field_n == null) {
                  break L3;
                } else {
                  if (((c) this).field_y <= 1500) {
                    break L2;
                  } else {
                    int discarded$10 = 255;
                    boolean discarded$11 = em.b();
                    ((c) this).field_C = false;
                    break L2;
                  }
                }
              }
            }
            break L2;
          }
          L4: while (true) {
            if (!hh.a(108)) {
              L5: {
                if (((c) this).field_K != 3) {
                  break L5;
                } else {
                  if (((c) this).field_b != 0) {
                    break L5;
                  } else {
                    if (((c) this).field_q != 0) {
                      break L5;
                    } else {
                      if (((c) this).field_H) {
                        break L5;
                      } else {
                        ((c) this).field_b = ((c) this).field_b + 1;
                        break L5;
                      }
                    }
                  }
                }
              }
              L6: {
                if (((c) this).field_K == 3) {
                  L7: {
                    if (0 == (1 & ((c) this).field_D)) {
                      ((c) this).field_z = ((c) this).field_z + 1;
                      ((c) this).field_Z = -(((c) this).field_z >> 1) + 60;
                      if (((c) this).field_Z >= 15) {
                        ((c) this).field_A = ((c) this).field_A + 0.1;
                        break L7;
                      } else {
                        ((c) this).field_Z = 15;
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (120 == ((c) this).field_z) {
                      ((c) this).field_X = qi.b(7, 1);
                      ((c) this).field_L = qi.b(7, 1);
                      ((c) this).field_z = 0;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (((c) this).field_q < 4) {
                      if (((c) this).field_D % 24 == 0) {
                        ((c) this).field_w = ((c) this).field_w + 1;
                        if (((c) this).field_w >= 4) {
                          ((c) this).field_w = 0;
                          break L9;
                        } else {
                          break L9;
                        }
                      } else {
                        break L9;
                      }
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (((c) this).field_q == 3) {
                      var2_float = 0.019999999552965164f * (float)(((c) this).field_D % 50);
                      ((c) this).field_N = ((int)(var2_float * (float)((c) this).field_t) << 8) + (jg.field_h[field_ab][((c) this).field_B] - -((int)(var2_float * (float)((c) this).field_V) << 16) + (int)((float)((c) this).field_M * var2_float));
                      if (((c) this).field_D % 50 != 49) {
                        break L10;
                      } else {
                        ((c) this).field_B = ((c) this).field_B + 1;
                        ((c) this).field_B = ((c) this).field_B % 7;
                        ((c) this).field_V = -((16751678 & jg.field_h[field_ab][((c) this).field_B]) >> 16) + ((jg.field_h[field_ab][(1 + ((c) this).field_B) % 7] & 16754682) >> 16);
                        ((c) this).field_t = (255 & jg.field_h[field_ab][(((c) this).field_B + 1) % 7] >> 8) - ((jg.field_h[field_ab][((c) this).field_B] & 65438) >> 8);
                        ((c) this).field_M = (255 & jg.field_h[field_ab][(1 + ((c) this).field_B) % 7]) + -(255 & jg.field_h[field_ab][((c) this).field_B]);
                        break L10;
                      }
                    } else {
                      if (4 == ((c) this).field_q) {
                        if (49 <= (((c) this).field_D & 255)) {
                          ((c) this).field_B = 0;
                          ((c) this).field_w = 0;
                          break L10;
                        } else {
                          if ((15 & ((c) this).field_D) == 0) {
                            L11: {
                              ((c) this).field_w = ((c) this).field_w + 1;
                              if (((c) this).field_w < 4) {
                                break L11;
                              } else {
                                ((c) this).field_w = 0;
                                break L11;
                              }
                            }
                            ((c) this).field_B = ((c) this).field_B + 1;
                            if (4 <= ((c) this).field_B) {
                              ((c) this).field_B = 0;
                              break L10;
                            } else {
                              break L10;
                            }
                          } else {
                            break L10;
                          }
                        }
                      } else {
                        break L10;
                      }
                    }
                  }
                  int discarded$12 = 127;
                  qa.b();
                  break L6;
                } else {
                  break L6;
                }
              }
              L12: {
                int fieldTemp$13 = di.field_a;
                di.field_a = di.field_a - 1;
                if (0 <= fieldTemp$13) {
                  bi.field_g = 0;
                  break L12;
                } else {
                  if (bi.field_g != 0) {
                    di.field_a = 50;
                    break L12;
                  } else {
                    break L12;
                  }
                }
              }
              L13: {
                if (bi.field_g != 0) {
                  L14: {
                    L15: {
                      if (((c) this).field_K == 5) {
                        break L15;
                      } else {
                        if (7 == ((c) this).field_K) {
                          break L15;
                        } else {
                          break L14;
                        }
                      }
                    }
                    oe.a(false, false, param0 ^ 189);
                    break L14;
                  }
                  L16: {
                    if (((c) this).field_K == 6) {
                      oe.a(true, false, param0 + 131);
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  if (((c) this).field_K != 4) {
                    break L13;
                  } else {
                    oe.a(true, true, 160);
                    break L13;
                  }
                } else {
                  break L13;
                }
              }
              L17: {
                if (((c) this).field_C) {
                  if (bi.field_g != 0) {
                    if (!fh.c(-104)) {
                      L18: {
                        if (og.field_n <= 0) {
                          break L18;
                        } else {
                          if (null == vl.field_n) {
                            break L18;
                          } else {
                            L19: {
                              if (he.field_d <= 317) {
                                break L19;
                              } else {
                                if (352 <= he.field_d) {
                                  break L19;
                                } else {
                                  L20: {
                                    if (mc.field_a <= 350) {
                                      break L20;
                                    } else {
                                      if (mc.field_a < 470) {
                                        ((c) this).field_C = false;
                                        int discarded$14 = 255;
                                        boolean discarded$15 = em.b();
                                        ((c) this).field_g = true;
                                        break L17;
                                      } else {
                                        break L20;
                                      }
                                    }
                                  }
                                  L21: {
                                    if (mc.field_a <= 170) {
                                      break L21;
                                    } else {
                                      if (mc.field_a < 290) {
                                        ((c) this).field_C = false;
                                        ((c) this).field_g = true;
                                        break L17;
                                      } else {
                                        break L21;
                                      }
                                    }
                                  }
                                  ((c) this).field_g = false;
                                  break L17;
                                }
                              }
                            }
                            ((c) this).field_g = false;
                            break L17;
                          }
                        }
                      }
                      ((c) this).field_g = true;
                      ((c) this).field_C = false;
                      break L17;
                    } else {
                      L22: {
                        if (265 >= he.field_d) {
                          break L22;
                        } else {
                          if (he.field_d >= 299) {
                            break L22;
                          } else {
                            L23: {
                              if (mc.field_a <= 350) {
                                break L23;
                              } else {
                                if (mc.field_a >= 470) {
                                  break L23;
                                } else {
                                  ((c) this).field_g = true;
                                  ((c) this).field_C = false;
                                  break L17;
                                }
                              }
                            }
                            L24: {
                              if (mc.field_a <= 170) {
                                break L24;
                              } else {
                                if (mc.field_a < 290) {
                                  L25: {
                                    ((c) this).field_g = true;
                                    if (null == el.field_o) {
                                      break L25;
                                    } else {
                                      el.field_o.e((byte) -70);
                                      break L25;
                                    }
                                  }
                                  ai.field_p = -1;
                                  el.field_i = 0;
                                  cd.field_j = 0;
                                  break L17;
                                } else {
                                  break L24;
                                }
                              }
                            }
                            ((c) this).field_g = false;
                            break L17;
                          }
                        }
                      }
                      ((c) this).field_g = false;
                      break L17;
                    }
                  } else {
                    break L17;
                  }
                } else {
                  ((c) this).a(true);
                  break L17;
                }
              }
              L26: {
                L27: {
                  if (qa.field_a != ((c) this).field_s) {
                    break L27;
                  } else {
                    if (~ue.field_e != ~((c) this).field_Y) {
                      break L27;
                    } else {
                      break L26;
                    }
                  }
                }
                ((c) this).field_o = -1;
                break L26;
              }
              L28: {
                ((c) this).field_Y = ue.field_e;
                if (param0 == 29) {
                  break L28;
                } else {
                  ((c) this).a(11, 26);
                  break L28;
                }
              }
              L29: {
                ((c) this).field_s = qa.field_a;
                if (((c) this).field_b != 0) {
                  L30: {
                    var2 = (qa.field_a - -he.field_d - (-kd.field_c - ki.field_d)) % 8;
                    if (var2 == 0) {
                      oa.field_a = oa.field_a + kb.field_d;
                      gb.field_g = gb.field_g - 1;
                      break L30;
                    } else {
                      if (var2 == 1) {
                        oa.field_a = oa.field_a + gb.field_g;
                        kb.field_d = kb.field_d - 1;
                        break L30;
                      } else {
                        if (var2 == 2) {
                          oa.field_a = oa.field_a - kb.field_d;
                          gb.field_g = gb.field_g + 1;
                          break L30;
                        } else {
                          if (var2 != 3) {
                            if (var2 == 4) {
                              gb.field_g = gb.field_g + 1;
                              ml.field_r = ml.field_r + kb.field_d;
                              break L30;
                            } else {
                              if (var2 == 5) {
                                kb.field_d = kb.field_d + 1;
                                ml.field_r = ml.field_r + gb.field_g;
                                break L30;
                              } else {
                                if (6 != var2) {
                                  if (var2 == 7) {
                                    kb.field_d = kb.field_d - 1;
                                    ml.field_r = ml.field_r - gb.field_g;
                                    break L30;
                                  } else {
                                    break L30;
                                  }
                                } else {
                                  gb.field_g = gb.field_g - 1;
                                  ml.field_r = ml.field_r - kb.field_d;
                                  break L30;
                                }
                              }
                            }
                          } else {
                            oa.field_a = oa.field_a - gb.field_g;
                            kb.field_d = kb.field_d + 1;
                            break L30;
                          }
                        }
                      }
                    }
                  }
                  var2 = (ki.field_d + qa.field_a - (-he.field_d + -kd.field_c)) % 5;
                  if (0 == var2) {
                    dc.field_a = dc.field_a | lb.field_b + el.field_g << 17;
                    break L29;
                  } else {
                    if (var2 == 1) {
                      el.field_g = el.field_g + sc.field_f;
                      lb.field_b = lb.field_b + 1;
                      break L29;
                    } else {
                      if (var2 != 2) {
                        if (var2 != 3) {
                          if (var2 != 4) {
                            break L29;
                          } else {
                            el.field_g = el.field_g - lb.field_b;
                            sc.field_f = sc.field_f - 1;
                            break L29;
                          }
                        } else {
                          sc.field_f = sc.field_f + 1;
                          el.field_g = el.field_g + lb.field_b;
                          break L29;
                        }
                      } else {
                        el.field_g = el.field_g - sc.field_f;
                        lb.field_b = lb.field_b - 1;
                        break L29;
                      }
                    }
                  }
                } else {
                  break L29;
                }
              }
              return;
            } else {
              int discarded$16 = 62;
              this.b();
              continue L4;
            }
          }
        } else {
          int discarded$17 = 104;
          this.e();
          return;
        }
    }

    private final void b(int param0, int param1) {
        int var3 = 0;
        int var4_int = 0;
        Object var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        L0: {
          L1: {
            var11 = Geoblox.field_C;
            var3 = 180;
            vb.a(((c) this).field_P);
            if (param1 == 0) {
              break L1;
            } else {
              if (1 == param1) {
                break L1;
              } else {
                if (param1 == 2) {
                  break L1;
                } else {
                  ma.a(140, 30, 80, (byte) -92, 80, ll.field_h);
                  ma.a(242, 30, 80, (byte) -92, 80, ll.field_h);
                  break L0;
                }
              }
            }
          }
          L2: {
            ma.a(140, 30, 80, (byte) -92, 80, ll.field_h);
            ma.a(242, 30, 80, (byte) -92, 80, ll.field_h);
            ma.a(345, 30, 80, (byte) -92, 80, ll.field_h);
            ri.a(70, 180, 29497);
            vf.field_L.e();
            vb.c();
            ke.field_a[1][((c) this).field_X][((c) this).field_L].b((vf.field_L.field_s >> 1) + -(ke.field_a[1][((c) this).field_X][((c) this).field_L].field_s >> 1), (vf.field_L.field_o >> 1) + -(ke.field_a[1][((c) this).field_X][((c) this).field_L].field_o >> 1));
            sh.field_y.a(255);
            vb.b(((c) this).field_P);
            vb.b(50, 250, 90, 310);
            vf.field_L.g(1);
            vf.field_L.b(44, ((c) this).field_z + 200);
            vb.b(((c) this).field_P);
            vb.b(40, 355, 93, 415);
            var4_int = 70;
            var5 = 385;
            var6 = (int)(-Math.sin(((c) this).field_A) * (double)((c) this).field_Z + 0.5) + var4_int;
            var7 = (int)(0.5 + Math.cos(((c) this).field_A) * (double)((c) this).field_Z) + var5;
            var8 = (int)(((c) this).field_A / 6.283185307179586 * 65535.0 + 0.5);
            var9 = 2.0943741584421716;
            if (((c) this).field_Z == 15) {
              wl.field_a.e();
              vb.c();
              mi.field_B[((c) this).field_w].a(-10 + (wl.field_a.field_s >> 1), (wl.field_a.field_o >> 1) - 10, 20, 20);
              sh.field_y.a(255);
              vb.b(((c) this).field_P);
              vb.b(40, 355, 103, 415);
              wl.field_a.b(var6 - (wl.field_a.field_s >> 1), var7 - (wl.field_a.field_s >> 1));
              var8 = (int)((((c) this).field_A + var9) / 6.283185307179586 * 65535.0 + 0.5);
              var6 = (int)(-Math.sin(var9 + ((c) this).field_A) * (double)((c) this).field_Z + 0.5) + var4_int;
              var7 = var5 - -(int)(0.5 + Math.cos(var9 + ((c) this).field_A) * (double)((c) this).field_Z);
              wl.field_a.e();
              vb.c();
              mi.field_B[((c) this).field_w].a((wl.field_a.field_s >> 1) + -10, (wl.field_a.field_o >> 1) - 10, 20, 20);
              sh.field_y.a(255);
              vb.b(((c) this).field_P);
              vb.b(40, 355, 103, 415);
              wl.field_a.b(var6 - (wl.field_a.field_s >> 1), -(wl.field_a.field_s >> 1) + var7);
              var9 = var9 * 2.0;
              var8 = (int)(0.5 + (((c) this).field_A + var9) / 6.283185307179586 * 65535.0);
              var6 = (int)(0.5 + -Math.sin(var9 + ((c) this).field_A) * (double)((c) this).field_Z) + var4_int;
              var7 = var5 + (int)(Math.cos(((c) this).field_A + var9) * (double)((c) this).field_Z + 0.5);
              wl.field_a.e();
              vb.c();
              mi.field_B[((c) this).field_w].a((wl.field_a.field_s >> 1) + -10, -10 + (wl.field_a.field_o >> 1), 20, 20);
              sh.field_y.a(255);
              vb.b(((c) this).field_P);
              vb.b(40, 355, 103, 415);
              wl.field_a.b(var6 - (wl.field_a.field_s >> 1), var7 + -(wl.field_a.field_s >> 1));
              break L2;
            } else {
              vf.field_L.e();
              vb.c();
              ke.field_a[1][((c) this).field_X][((c) this).field_L].b(vf.field_L.field_s >> 1, vf.field_L.field_o >> 1, var8, 3072);
              sh.field_y.a(255);
              vb.b(((c) this).field_P);
              vb.b(40, 355, 103, 415);
              vf.field_L.g(1);
              vf.field_L.b(var6 - (vf.field_L.field_s >> 1), var7 - (vf.field_L.field_o >> 1));
              var8 = (int)(0.5 + 65535.0 * ((((c) this).field_A + var9) / 6.283185307179586));
              var6 = var4_int - -(int)(0.5 + -Math.sin(((c) this).field_A + var9) * (double)((c) this).field_Z);
              var7 = (int)(0.5 + Math.cos(((c) this).field_A + var9) * (double)((c) this).field_Z) + var5;
              vf.field_L.e();
              vb.c();
              ke.field_a[1][((c) this).field_X][((c) this).field_L].b(vf.field_L.field_s >> 1, vf.field_L.field_o >> 1, var8, 3072);
              sh.field_y.a(255);
              vb.b(((c) this).field_P);
              vb.b(40, 355, 103, 415);
              vf.field_L.g(1);
              vf.field_L.b(var6 + -(vf.field_L.field_s >> 1), -(vf.field_L.field_o >> 1) + var7);
              var9 = var9 * 2.0;
              var8 = (int)(0.5 + 65535.0 * ((var9 + ((c) this).field_A) / 6.283185307179586));
              var6 = (int)(-Math.sin(var9 + ((c) this).field_A) * (double)((c) this).field_Z + 0.5) + var4_int;
              var7 = var5 + (int)(Math.cos(var9 + ((c) this).field_A) * (double)((c) this).field_Z + 0.5);
              vf.field_L.e();
              vb.c();
              ke.field_a[1][((c) this).field_X][((c) this).field_L].b(vf.field_L.field_s >> 1, vf.field_L.field_o >> 1, var8, 3072);
              sh.field_y.a(255);
              vb.b(((c) this).field_P);
              vb.b(40, 355, 103, 415);
              vf.field_L.g(1);
              vf.field_L.b(var6 + -(vf.field_L.field_s >> 1), var7 - (vf.field_L.field_o >> 1));
              break L2;
            }
          }
          vb.b(((c) this).field_P);
          break L0;
        }
        L3: {
          ma.a(140, 550, 40, (byte) -92, 60, ll.field_h);
          dd.field_G.b(param1 - -1 + "/5", 580, 170, 0, -1);
          var4 = null;
          var5 = 155;
          var6 = param1;
          if (var6 == 0) {
            dd.field_G.a(a.field_a[0], var5, var3, 0, -1);
            var4 = (Object) (Object) ec.field_e[0];
            dd.field_G.a(a.field_a[1], var5, var3 - -110, 0, -1);
            break L3;
          } else {
            if (1 != var6) {
              if (var6 == 2) {
                dd.field_G.a(a.field_a[3], var5, var3, 0, -1);
                var4 = (Object) (Object) ec.field_e[2];
                break L3;
              } else {
                if (var6 == 3) {
                  vf.field_L.e();
                  vb.c();
                  ka.field_m[1][((c) this).field_L][((c) this).field_w].b(-(ka.field_m[1][((c) this).field_L][((c) this).field_w].field_s >> 1) + (vf.field_L.field_s >> 1), (vf.field_L.field_o >> 1) - (ka.field_m[1][((c) this).field_L][((c) this).field_w].field_o >> 1));
                  sh.field_y.a(255);
                  vb.b(((c) this).field_P);
                  vf.field_L.b(70 + -(vf.field_L.field_s >> 1), -(vf.field_L.field_o >> 1) + 180);
                  vf.field_L.e();
                  vb.c();
                  s.field_G[1][((c) this).field_X].b((vf.field_L.field_s >> 1) - (s.field_G[1][((c) this).field_X].field_s >> 1), (vf.field_L.field_o >> 1) + -(s.field_G[1][((c) this).field_X].field_o >> 1), ((c) this).field_N);
                  sh.field_y.a(255);
                  vb.b(((c) this).field_P);
                  vf.field_L.g(1);
                  vf.field_L.b(70 - (vf.field_L.field_s >> 1), 282 - (vf.field_L.field_o >> 1));
                  dd.field_G.a(a.field_a[4], var5, var3, 0, -1);
                  var4 = (Object) (Object) ec.field_e[3];
                  break L3;
                } else {
                  if (4 == var6) {
                    L4: {
                      vf.field_L.e();
                      vb.c();
                      fc.field_g[((c) this).field_w].b(-(fc.field_g[((c) this).field_w].field_s >> 1) + (vf.field_L.field_s >> 1), -(fc.field_g[((c) this).field_w].field_o >> 1) + (vf.field_L.field_o >> 1));
                      k.a(0, 0, vf.field_L.field_s, -27085, vf.field_L.field_o);
                      sh.field_y.a(255);
                      vb.b(((c) this).field_P);
                      vf.field_L.b(70 - (vf.field_L.field_s >> 1), 180 + -(vf.field_L.field_o >> 1));
                      vf.field_L.e();
                      vb.c();
                      if (((c) this).field_B < 4) {
                        break L4;
                      } else {
                        ((c) this).field_B = 0;
                        break L4;
                      }
                    }
                    hb.field_d[((c) this).field_B].b(-(hb.field_d[((c) this).field_B].field_s >> 1) + (vf.field_L.field_s >> 1), (vf.field_L.field_o >> 1) - (hb.field_d[((c) this).field_B].field_o >> 1));
                    k.a(0, 0, vf.field_L.field_s, -27085, vf.field_L.field_o);
                    sh.field_y.a(255);
                    vb.b(((c) this).field_P);
                    vf.field_L.b(70 + -(vf.field_L.field_s >> 1), -(vf.field_L.field_o >> 1) + 282);
                    dd.field_G.a(a.field_a[5], var5, var3, 0, -1);
                    var4 = (Object) (Object) ec.field_e[4];
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
            } else {
              dd.field_G.a(a.field_a[2], var5, var3, 0, -1);
              var4 = (Object) (Object) ec.field_e[1];
              break L3;
            }
          }
        }
        L5: {
          var6 = fi.field_d.field_o - -fi.field_d.field_q;
          if (param0 <= -14) {
            break L5;
          } else {
            ((c) this).a(-3, -61, false, -67, true, 116);
            break L5;
          }
        }
        var7 = 355;
        var3 = var3 + fi.field_d.a((String) var4, var5, var3, var7, 300, 0, -1, 0, 0, 16) * var6;
        vb.b(((c) this).field_P);
    }

    final void a(int param0, int param1, boolean param2, int param3, boolean param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = Geoblox.field_C;
          if (!param2) {
            break L0;
          } else {
            ((c) this).field_q = -45;
            break L0;
          }
        }
        L1: {
          var7 = t.field_i[((c) this).field_K][param0];
          var8 = var7;
          if (var8 == 8) {
            param1 -= 280;
            if (param1 <= 0) {
              j.field_gb = 0;
              this.d(0);
              break L1;
            } else {
              if (param1 >= sd.field_y.field_s) {
                j.field_gb = 80;
                this.d(0);
                break L1;
              } else {
                j.field_gb = 80 * param1 / sd.field_y.field_s;
                break L1;
              }
            }
          } else {
            if (var8 == 9) {
              param1 -= 280;
              if (param1 > 0) {
                if (sd.field_y.field_s <= param1) {
                  wg.a(-15346, 80);
                  break L1;
                } else {
                  wg.a(-15346, 80 * param1 / sd.field_y.field_s);
                  break L1;
                }
              } else {
                wg.a(-15346, 0);
                break L1;
              }
            } else {
              if (!param4) {
                super.a(param0, param1, param2, param3, param4, param5);
                break L1;
              } else {
                break L1;
              }
            }
          }
        }
    }

    final static char c(int param0, byte param1) {
        int var3 = 0;
        int var2 = 255 & param1;
        if (var2 == 0) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (var2 >= 128) {
            if (!(160 <= var2)) {
                var3 = lf.field_e[-128 + var2];
                if (0 == var3) {
                    var3 = 63;
                }
                var2 = var3;
            }
        }
        if (param0 <= 21) {
            c.d((byte) -112);
        }
        return (char)var2;
    }

    final void c(int param0, int param1) {
        if (param0 != -12831) {
            ((c) this).a(true, (byte) 98, -83, 83);
        }
        ((c) this).field_e = param1;
    }

    private final void e() {
        if (0 != ((c) this).field_T) {
          return;
        } else {
          if (((c) this).field_H) {
            return;
          } else {
            L0: {
              if (0 != ((c) this).field_F) {
                break L0;
              } else {
                if (!((c) this).field_l) {
                  ((c) this).field_b = ((c) this).a(qa.field_a, ue.field_e, (byte) 54);
                  break L0;
                } else {
                  if (((c) this).field_q == 4) {
                    ((c) this).field_b = 3;
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
            }
            L1: {
              ((c) this).field_F = ((c) this).field_F + 8;
              if (640 + qj.field_c.field_m < ((c) this).field_F) {
                ((c) this).field_E = false;
                ((c) this).field_F = 0;
                break L1;
              } else {
                break L1;
              }
            }
            return;
          }
        }
    }

    private final void f() {
        L0: {
          if (3 != ((c) this).field_K) {
            break L0;
          } else {
            if (!((c) this).field_E) {
              L1: {
                L2: {
                  if (((c) this).field_q == 4) {
                    break L2;
                  } else {
                    if (((c) this).field_b != 3) {
                      break L2;
                    } else {
                      ((c) this).field_b = 2;
                      break L1;
                    }
                  }
                }
                if (((c) this).field_q == 4) {
                  L3: {
                    if (((c) this).field_b == 2) {
                      ((c) this).field_b = 1;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  if (oc.field_b != 1) {
                    break L1;
                  } else {
                    if (((c) this).field_b != 3) {
                      break L1;
                    } else {
                      ((c) this).field_b = 1;
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              L4: {
                if (((c) this).field_q != 0) {
                  break L4;
                } else {
                  if (((c) this).field_b != 0) {
                    break L4;
                  } else {
                    ((c) this).field_b = 2;
                    break L0;
                  }
                }
              }
              break L0;
            } else {
              break L0;
            }
          }
        }
    }

    c(Geoblox param0, int param1) {
        super(t.field_i[param1].length, 140, 500, 140, 40);
        ((c) this).field_S = false;
        ((c) this).field_L = 0;
        ((c) this).field_H = false;
        ((c) this).field_X = 0;
        ((c) this).field_D = 0;
        ((c) this).field_I = 115;
        ((c) this).field_P = new int[4];
        ((c) this).field_o = -1;
        ((c) this).field_U = 0;
        ((c) this).field_u = 123;
        ((c) this).field_O = 0;
        ((c) this).field_F = 0;
        ((c) this).field_z = 0;
        ((c) this).field_v = true;
        ((c) this).field_W = 0;
        try {
            ((c) this).field_K = param1;
            ((c) this).field_p = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "c.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    private final void d(int param0) {
        if (param0 == 0) {
          L0: {
            L1: {
              if (null == ((c) this).field_R) {
                break L1;
              } else {
                if (((c) this).field_R.l()) {
                  break L1;
                } else {
                  if (50 < ((c) this).field_U) {
                    break L1;
                  } else {
                    break L0;
                  }
                }
              }
            }
            ((c) this).field_R = kl.a(fl.field_c[8], 100, j.field_gb);
            ja.a(false, ((c) this).field_R);
            ((c) this).field_U = 0;
            break L0;
          }
          return;
        } else {
          return;
        }
    }

    final void c(int param0) {
        int fieldTemp$0 = ((c) this).field_D + 1;
        ((c) this).field_D = ((c) this).field_D + 1;
        if (fieldTemp$0 % 5 == 0) {
            ((c) this).field_W = ((c) this).field_W + 1;
            ((c) this).field_O = ((c) this).field_O - 1;
            this.g((byte) -114);
        }
        if ((((c) this).field_D & 3) == 3) {
            ((c) this).field_u = ((c) this).field_u - 1;
            ((c) this).field_I = ((c) this).field_I - 1;
        }
        if (param0 != 16405) {
            this.b(false);
        }
    }

    final void b(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[] var6 = null;
        int var7 = 0;
        int stackIn_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        L0: {
          var7 = Geoblox.field_C;
          td.a(-348, fl.field_c[29]);
          var3 = 0;
          var4 = 0;
          var5 = t.field_i[((c) this).field_K][param0];
          if (param1 == -2) {
            break L0;
          } else {
            ((c) this).c(-70);
            break L0;
          }
        }
        L1: {
          L2: {
            var6_int = var5;
            if (var6_int != 15) {
              if (var6_int != 0) {
                if (1 != var6_int) {
                  if (var6_int != 2) {
                    if (var6_int == 3) {
                      ai.field_p = 3;
                      break L1;
                    } else {
                      if (var6_int != 4) {
                        L3: {
                          if (14 != var6_int) {
                            if (var6_int == 5) {
                              break L3;
                            } else {
                              if (var6_int == 13) {
                                L4: {
                                  if (null != el.field_o) {
                                    el.field_o.e((byte) -70);
                                    break L4;
                                  } else {
                                    break L4;
                                  }
                                }
                                L5: {
                                  L6: {
                                    ai.field_p = -1;
                                    if (((c) this).field_K == 8) {
                                      break L6;
                                    } else {
                                      L7: {
                                        if (4 != ((c) this).field_K) {
                                          break L7;
                                        } else {
                                          if (null == el.field_o) {
                                            break L7;
                                          } else {
                                            if (el.field_o.field_e == 0) {
                                              break L6;
                                            } else {
                                              break L7;
                                            }
                                          }
                                        }
                                      }
                                      if (((c) this).field_K == 7) {
                                        el.field_i = 5;
                                        break L5;
                                      } else {
                                        el.field_i = 6;
                                        break L5;
                                      }
                                    }
                                  }
                                  el.field_i = 2;
                                  break L5;
                                }
                                cd.field_j = ((c) this).field_K;
                                break L1;
                              } else {
                                if (6 != var6_int) {
                                  if (var6_int == 7) {
                                    int discarded$3 = 62;
                                    gf.a(k.c(param1 ^ -125));
                                    break L1;
                                  } else {
                                    if (var6_int == 12) {
                                      L8: {
                                        if (((c) this).field_q >= 4) {
                                          break L8;
                                        } else {
                                          if (!((c) this).field_E) {
                                            ((c) this).field_n = ((c) this).field_q;
                                            ((c) this).field_q = ((c) this).field_q + 1;
                                            ((c) this).field_v = true;
                                            ((c) this).field_E = true;
                                            break L1;
                                          } else {
                                            break L8;
                                          }
                                        }
                                      }
                                      var4 = 1;
                                      break L1;
                                    } else {
                                      if (var6_int == 11) {
                                        L9: {
                                          if (((c) this).field_q <= 0) {
                                            break L9;
                                          } else {
                                            if (!((c) this).field_E) {
                                              ((c) this).field_n = ((c) this).field_q;
                                              ((c) this).field_E = true;
                                              ((c) this).field_q = ((c) this).field_q - 1;
                                              ((c) this).field_v = false;
                                              break L1;
                                            } else {
                                              break L9;
                                            }
                                          }
                                        }
                                        var4 = 1;
                                        break L1;
                                      } else {
                                        if (var6_int == 10) {
                                          if (!fh.c(-112)) {
                                            ai.field_p = 5;
                                            break L1;
                                          } else {
                                            ai.field_p = 7;
                                            break L1;
                                          }
                                        } else {
                                          if (16 != var6_int) {
                                            if (var6_int == 17) {
                                              da.field_c = 1;
                                              break L1;
                                            } else {
                                              if (var6_int == 18) {
                                                da.field_c = 2;
                                                break L1;
                                              } else {
                                                break L1;
                                              }
                                            }
                                          } else {
                                            da.field_c = 0;
                                            break L1;
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  L10: {
                                    el.field_o.c(false);
                                    el.field_o.a((byte) 127, wa.a(param1 ^ 25864));
                                    el.field_o.a((byte) 127, el.field_o.field_q);
                                    el.field_o.field_q = 0;
                                    if (!fh.c(-114)) {
                                      L11: {
                                        if (el.field_o.field_o != 0) {
                                          break L11;
                                        } else {
                                          if (ug.field_c != 0) {
                                            break L11;
                                          } else {
                                            ai.field_p = 0;
                                            break L10;
                                          }
                                        }
                                      }
                                      el.field_o.e((byte) -70);
                                      if (0 >= el.field_o.field_e) {
                                        ai.field_p = 2;
                                        break L10;
                                      } else {
                                        ai.field_p = 6;
                                        break L10;
                                      }
                                    } else {
                                      L12: {
                                        L13: {
                                          if (el.field_o.field_Y) {
                                            break L13;
                                          } else {
                                            if (el.field_o.field_o != 0) {
                                              break L13;
                                            } else {
                                              if (ug.field_c == 0) {
                                                break L12;
                                              } else {
                                                break L13;
                                              }
                                            }
                                          }
                                        }
                                        L14: {
                                          if (!el.field_o.field_Y) {
                                            break L14;
                                          } else {
                                            if (el.field_o.field_v < 750) {
                                              break L12;
                                            } else {
                                              break L14;
                                            }
                                          }
                                        }
                                        L15: {
                                          if (0 != el.field_o.field_o) {
                                            break L15;
                                          } else {
                                            if (0 != ug.field_c) {
                                              break L15;
                                            } else {
                                              ai.field_p = 0;
                                              break L10;
                                            }
                                          }
                                        }
                                        ai.field_p = 4;
                                        break L10;
                                      }
                                      ai.field_p = 0;
                                      break L10;
                                    }
                                  }
                                  fi.a(param1 + 2, ll.field_d);
                                  break L1;
                                }
                              }
                            }
                          } else {
                            vl.field_p = 0;
                            ug.field_c = 0;
                            ra.field_d = -2147483648;
                            break L3;
                          }
                        }
                        L16: {
                          if (2 == ((c) this).field_K) {
                            break L16;
                          } else {
                            if (((c) this).field_K == 4) {
                              break L16;
                            } else {
                              if (6 == ((c) this).field_K) {
                                break L16;
                              } else {
                                if (oc.field_b != 1) {
                                  break L16;
                                } else {
                                  ai.field_p = 1;
                                  break L1;
                                }
                              }
                            }
                          }
                        }
                        ai.field_p = 0;
                        break L1;
                      } else {
                        L17: {
                          if (vl.field_n == null) {
                            ((c) this).field_C = true;
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        L18: {
                          int discarded$4 = 255;
                          if (em.b()) {
                            break L18;
                          } else {
                            if (og.field_n <= 0) {
                              break L18;
                            } else {
                              int discarded$5 = 37;
                              if (sa.a(ka.field_i)) {
                                f.i((byte) -128);
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                          }
                        }
                        ((c) this).field_o = 0;
                        ((c) this).field_g = false;
                        ((c) this).field_y = 0;
                        break L1;
                      }
                    }
                  } else {
                    if (fh.c(-100)) {
                      ai.field_p = 8;
                      break L1;
                    } else {
                      ai.field_p = 2;
                      break L1;
                    }
                  }
                } else {
                  ai.field_p = -1;
                  break L1;
                }
              } else {
                break L2;
              }
            } else {
              if (1 == oc.field_b) {
                return;
              } else {
                var3 = 1;
                break L2;
              }
            }
          }
          L19: {
            if (var3 != 0) {
              break L19;
            } else {
              L20: {
                if (!fh.c(param1 ^ 107)) {
                  break L20;
                } else {
                  if (kc.field_c != 0) {
                    break L20;
                  } else {
                    var3 = 1;
                    break L19;
                  }
                }
              }
              if (ca.field_f == null) {
                break L19;
              } else {
                if (ca.field_f.field_j) {
                  if (ca.field_f.field_k == null) {
                    break L19;
                  } else {
                    L21: {
                      var6 = ca.field_f.field_k[1];
                      if (var6[0] != null) {
                        stackOut_42_0 = 0;
                        stackIn_43_0 = stackOut_42_0;
                        break L21;
                      } else {
                        stackOut_41_0 = 1;
                        stackIn_43_0 = stackOut_41_0;
                        break L21;
                      }
                    }
                    var3 = stackIn_43_0;
                    break L19;
                  }
                } else {
                  kc.field_c = kc.field_c + 1;
                  pg.a(param1 ^ -9410);
                  el.field_o = new gh(((c) this).field_p, var3 != 0);
                  le.a((byte) -39);
                  ai.field_p = -1;
                  break L1;
                }
              }
            }
          }
          kc.field_c = kc.field_c + 1;
          pg.a(param1 ^ -9410);
          el.field_o = new gh(((c) this).field_p, var3 != 0);
          le.a((byte) -39);
          ai.field_p = -1;
          break L1;
        }
        L22: {
          if (var4 == 0) {
            ((c) this).field_H = true;
            a.field_e = -1;
            break L22;
          } else {
            break L22;
          }
        }
        L23: {
          if (~((c) this).field_K == ~ai.field_p) {
            break L23;
          } else {
            L24: {
              if (((c) this).field_K == 1) {
                break L24;
              } else {
                if (((c) this).field_K != 0) {
                  break L23;
                } else {
                  break L24;
                }
              }
            }
            oc.field_b = ((c) this).field_K;
            break L23;
          }
        }
    }

    final void a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Geoblox.field_C;
          var3 = t.field_i[((c) this).field_K][param1];
          if (var3 == 8) {
            if (j.field_gb < 70) {
              j.field_gb = j.field_gb + 10;
              break L0;
            } else {
              j.field_gb = 80;
              break L0;
            }
          } else {
            if (9 == var3) {
              if (oc.field_c < 70) {
                wg.a(-15346, 10 + oc.field_c);
                break L0;
              } else {
                wg.a(-15346, 80);
                break L0;
              }
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (param0 == 90) {
            break L1;
          } else {
            ((c) this).field_y = 120;
            break L1;
          }
        }
    }

    final void a(boolean param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        nc var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_5_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        int stackIn_91_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int stackOut_50_2 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        int stackOut_90_0 = 0;
        int stackOut_89_0 = 0;
        var14 = Geoblox.field_C;
        if (param1 < -74) {
          L0: {
            if (((c) this).field_S) {
              stackOut_4_0 = ((c) this).field_n;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = ((c) this).field_q;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            L2: {
              var5 = stackIn_5_0;
              if (3 != ((c) this).field_K) {
                break L2;
              } else {
                L3: {
                  if (param2 != 0) {
                    break L3;
                  } else {
                    if (var5 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
                if (param2 != 2) {
                  break L2;
                } else {
                  if (var5 != 4) {
                    break L2;
                  } else {
                    return;
                  }
                }
              }
            }
            L4: {
              var6 = t.field_i[((c) this).field_K][param2];
              var7 = tl.field_f[var6];
              if (var6 != 15) {
                break L4;
              } else {
                if (var5 != 4) {
                  break L1;
                } else {
                  if (oc.field_b != 1) {
                    break L4;
                  } else {
                    return;
                  }
                }
              }
            }
            L5: {
              if (3 != ((c) this).field_K) {
                break L5;
              } else {
                if (!((c) this).field_E) {
                  break L5;
                } else {
                  if (((c) this).field_q == 4) {
                    if (oc.field_b == 1) {
                      break L5;
                    } else {
                      if (param2 != 2) {
                        break L5;
                      } else {
                        if (((c) this).field_b == 3) {
                          param0 = true;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                  } else {
                    break L5;
                  }
                }
              }
            }
            L6: {
              L7: {
                if (((c) this).field_K == 3) {
                  break L7;
                } else {
                  if (((c) this).field_K != 2) {
                    L8: {
                      if (((c) this).field_K == 5) {
                        break L8;
                      } else {
                        if (((c) this).field_K == 7) {
                          break L8;
                        } else {
                          if (((c) this).field_K == 6) {
                            break L8;
                          } else {
                            if (((c) this).field_K != 4) {
                              break L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                    }
                    param3 += 295;
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              param3 += 280;
              break L6;
            }
            L9: {
              L10: {
                var8 = dd.field_G;
                var9 = 320;
                var10 = 160;
                if (0 == ((c) this).field_K) {
                  break L10;
                } else {
                  if (((c) this).field_K != 1) {
                    var11 = var8.c(var7, 400);
                    break L9;
                  } else {
                    break L10;
                  }
                }
              }
              var11 = 322;
              break L9;
            }
            L11: {
              L12: {
                if (((c) this).field_K == 3) {
                  break L12;
                } else {
                  if (((c) this).field_K == 2) {
                    break L12;
                  } else {
                    if (((c) this).field_K == 6) {
                      break L12;
                    } else {
                      L13: {
                        if (((c) this).field_K == 7) {
                          break L13;
                        } else {
                          if (((c) this).field_K == 8) {
                            break L13;
                          } else {
                            if (((c) this).field_K == 4) {
                              L14: {
                                var11 = 278;
                                var10 = 320 - (var11 - -20 >> 1);
                                if (var6 == 13) {
                                  param3 = 265;
                                  break L14;
                                } else {
                                  param3 = 395;
                                  break L14;
                                }
                              }
                              L15: {
                                var9 = 10 + (var11 >> 1) + var10;
                                if (param0) {
                                  var10 = var10 + ((c) this).field_T;
                                  param3 = param3 - ((c) this).field_T;
                                  var9 = var9 + ((c) this).field_T;
                                  break L15;
                                } else {
                                  break L15;
                                }
                              }
                              ma.a(param3, var10, 36, (byte) -92, 20 + var11, eb.field_g);
                              break L11;
                            } else {
                              L16: {
                                if (!param0) {
                                  break L16;
                                } else {
                                  var9 = var9 + ((c) this).field_T;
                                  var10 = var10 + ((c) this).field_T;
                                  param3 = param3 - ((c) this).field_T;
                                  break L16;
                                }
                              }
                              L17: {
                                var10 = 320 + -(var11 - -20 >> 1);
                                stackOut_48_0 = param3;
                                stackOut_48_1 = var10;
                                stackIn_50_0 = stackOut_48_0;
                                stackIn_50_1 = stackOut_48_1;
                                stackIn_49_0 = stackOut_48_0;
                                stackIn_49_1 = stackOut_48_1;
                                if (!param0) {
                                  stackOut_50_0 = stackIn_50_0;
                                  stackOut_50_1 = stackIn_50_1;
                                  stackOut_50_2 = 0;
                                  stackIn_51_0 = stackOut_50_0;
                                  stackIn_51_1 = stackOut_50_1;
                                  stackIn_51_2 = stackOut_50_2;
                                  break L17;
                                } else {
                                  stackOut_49_0 = stackIn_49_0;
                                  stackOut_49_1 = stackIn_49_1;
                                  stackOut_49_2 = ((c) this).field_T;
                                  stackIn_51_0 = stackOut_49_0;
                                  stackIn_51_1 = stackOut_49_1;
                                  stackIn_51_2 = stackOut_49_2;
                                  break L17;
                                }
                              }
                              ma.a(stackIn_51_0, stackIn_51_1 + stackIn_51_2, 36, (byte) -92, var11 + 20, eb.field_g);
                              break L11;
                            }
                          }
                        }
                      }
                      L18: {
                        param3 = 437;
                        if (var6 != 13) {
                          var10 = 436;
                          var9 = (var11 >> 1) + var10 + 10;
                          break L18;
                        } else {
                          var10 = 121;
                          var9 = (var11 >> 1) + var10 + 10;
                          break L18;
                        }
                      }
                      L19: {
                        if (param0) {
                          var9 = var9 + ((c) this).field_T;
                          param3 = param3 - ((c) this).field_T;
                          var10 = var10 + ((c) this).field_T;
                          break L19;
                        } else {
                          break L19;
                        }
                      }
                      ma.a(param3, var10, 36, (byte) -92, var11 - -20, eb.field_g);
                      break L11;
                    }
                  }
                }
              }
              L20: {
                if (((c) this).field_K == 3) {
                  var11 = 123;
                  break L20;
                } else {
                  var11 = 160;
                  break L20;
                }
              }
              L21: {
                var12 = (param3 + (-280 - ((c) this).field_k)) / ((c) this).field_d;
                var9 = 320 + (var11 - -20) * (var12 + -1);
                var10 = -(var11 >> 1) + var9;
                if (6 != ((c) this).field_K) {
                  if (((c) this).field_K != 3) {
                    param3 = 380;
                    if (var6 == 5) {
                      var11 = 83;
                      var9 = 320;
                      param3 += 50;
                      var10 = var9 + -(var11 >> 1);
                      break L21;
                    } else {
                      break L21;
                    }
                  } else {
                    var9 = 9 + (320 + (15 + var11) * (var12 - 1));
                    param3 = 430;
                    var10 = var9 + -(var11 >> 1);
                    if (15 == var6) {
                      var10 -= 138;
                      var11 = 229;
                      var9 = (var11 >> 1) + var10;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                } else {
                  var9 += 86;
                  param3 = 430;
                  var10 += 86;
                  break L21;
                }
              }
              L22: {
                if (param0) {
                  var9 = var9 + ((c) this).field_T;
                  var10 = var10 + ((c) this).field_T;
                  param3 = param3 - ((c) this).field_T;
                  ma.a(param3, var10, 40, (byte) -92, var11, eb.field_g);
                  break L22;
                } else {
                  ma.a(param3, var10, 40, (byte) -92, var11, eb.field_g);
                  break L22;
                }
              }
              param3 += 2;
              break L11;
            }
            L23: {
              if (!param0) {
                var12 = 0;
                break L23;
              } else {
                dd.field_G.field_K[0][wf.field_p] = 15488514;
                var12 = ((c) this).field_T;
                break L23;
              }
            }
            L24: {
              L25: {
                if (var6 == 8) {
                  break L25;
                } else {
                  if (9 != var6) {
                    var8.b(var7, var9, param3 + 30, 0, -1);
                    break L24;
                  } else {
                    break L25;
                  }
                }
              }
              L26: {
                var8.c(var7, 285 - -var12, 30 + param3, 0, -1);
                sd.field_y.b(var12 + 280, param3 + 15);
                if (var6 == 8) {
                  stackOut_90_0 = j.field_gb;
                  stackIn_91_0 = stackOut_90_0;
                  break L26;
                } else {
                  stackOut_89_0 = oc.field_c;
                  stackIn_91_0 = stackOut_89_0;
                  break L26;
                }
              }
              var13 = stackIn_91_0;
              var13 = var13 * (-4 + sd.field_y.field_s) / 80;
              re.field_h.b(280 + var13 + -1 + var12, 9 + param3);
              break L24;
            }
            dd.field_G.field_K[0][wf.field_p] = 16689938;
            return;
          }
          return;
        } else {
          return;
        }
    }

    private final void b() {
        int var3 = 0;
        var3 = Geoblox.field_C;
        if (!((c) this).field_g) {
          L0: {
            L1: {
              if (((c) this).field_C) {
                break L1;
              } else {
                L2: {
                  if (((c) this).field_K == 0) {
                    break L2;
                  } else {
                    if (1 == ((c) this).field_K) {
                      break L2;
                    } else {
                      if (((c) this).field_K == 4) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                if (ki.field_d != 98) {
                  if (ki.field_d != 99) {
                    if (0 > ((c) this).field_b) {
                      break L0;
                    } else {
                      ((c) this).a(((c) this).field_b, -29);
                      break L0;
                    }
                  } else {
                    L3: {
                      ((c) this).field_b = ((c) this).field_b + 1;
                      if (((c) this).field_b >= ((c) this).field_e) {
                        ((c) this).field_b = 0;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    ((c) this).field_l = true;
                    this.c((byte) -107);
                    break L0;
                  }
                } else {
                  L4: {
                    if (0 >= ((c) this).field_b) {
                      ((c) this).field_b = ((c) this).field_e;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  ((c) this).field_b = ((c) this).field_b - 1;
                  ((c) this).field_l = true;
                  int discarded$2 = 89;
                  this.f();
                  break L0;
                }
              }
            }
            L5: {
              if (ki.field_d != 96) {
                if (ki.field_d == 97) {
                  if (!((c) this).field_C) {
                    L6: {
                      ((c) this).field_b = ((c) this).field_b + 1;
                      ((c) this).field_l = true;
                      if (((c) this).field_e > ((c) this).field_b) {
                        break L6;
                      } else {
                        ((c) this).field_b = 0;
                        break L6;
                      }
                    }
                    this.c((byte) -117);
                    break L5;
                  } else {
                    if (((c) this).field_o == 1) {
                      break L5;
                    } else {
                      L7: {
                        if (fh.c(-122)) {
                          break L7;
                        } else {
                          if (og.field_n <= 0) {
                            break L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                      ((c) this).field_o = 1;
                      break L5;
                    }
                  }
                } else {
                  L8: {
                    if (ki.field_d != 98) {
                      break L8;
                    } else {
                      if (2 != ((c) this).field_K) {
                        break L8;
                      } else {
                        if (((c) this).field_b >= 0) {
                          if (5 != t.field_i[((c) this).field_K][((c) this).field_b]) {
                            break L5;
                          } else {
                            ((c) this).field_b = 1;
                            break L5;
                          }
                        } else {
                          ((c) this).field_b = 3;
                          break L5;
                        }
                      }
                    }
                  }
                  if (ki.field_d != 99) {
                    break L5;
                  } else {
                    if (((c) this).field_K == 2) {
                      if (((c) this).field_b >= 0) {
                        if (t.field_i[((c) this).field_K][((c) this).field_b] == 5) {
                          break L5;
                        } else {
                          ((c) this).field_b = 3;
                          break L5;
                        }
                      } else {
                        ((c) this).field_b = 1;
                        break L5;
                      }
                    } else {
                      break L5;
                    }
                  }
                }
              } else {
                if (!((c) this).field_C) {
                  L9: {
                    if (0 >= ((c) this).field_b) {
                      ((c) this).field_b = ((c) this).field_e;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  ((c) this).field_b = ((c) this).field_b - 1;
                  ((c) this).field_l = true;
                  int discarded$3 = 89;
                  this.f();
                  break L5;
                } else {
                  if (((c) this).field_o != 0) {
                    ((c) this).field_o = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
            }
            if (0 > ((c) this).field_b) {
              break L0;
            } else {
              ((c) this).a(((c) this).field_b, -49);
              break L0;
            }
          }
          L10: {
            L11: {
              if (ki.field_d != 69) {
                break L11;
              } else {
                if (((c) this).field_K != 3) {
                  break L11;
                } else {
                  if (((c) this).field_q >= 4) {
                    break L11;
                  } else {
                    ((c) this).field_q = ((c) this).field_q + 1;
                    break L10;
                  }
                }
              }
            }
            L12: {
              if (ki.field_d != 41) {
                break L12;
              } else {
                if (((c) this).field_K != 3) {
                  break L12;
                } else {
                  if (((c) this).field_q <= 0) {
                    break L12;
                  } else {
                    ((c) this).field_q = ((c) this).field_q - 1;
                    break L10;
                  }
                }
              }
            }
            L13: {
              if (13 != ki.field_d) {
                break L13;
              } else {
                if (((c) this).field_C) {
                  break L13;
                } else {
                  if (4 == ((c) this).field_K) {
                    break L13;
                  } else {
                    L14: {
                      if (((c) this).field_K != 1) {
                        L15: {
                          if (((c) this).field_K == 6) {
                            break L15;
                          } else {
                            if (((c) this).field_K == 2) {
                              break L15;
                            } else {
                              ai.field_p = oc.field_b;
                              break L14;
                            }
                          }
                        }
                        ai.field_p = 0;
                        break L14;
                      } else {
                        ai.field_p = -1;
                        break L14;
                      }
                    }
                    if (~((c) this).field_K == ~ai.field_p) {
                      break L13;
                    } else {
                      L16: {
                        if (((c) this).field_K == 1) {
                          break L16;
                        } else {
                          if (((c) this).field_K != 0) {
                            break L13;
                          } else {
                            break L16;
                          }
                        }
                      }
                      oc.field_b = ((c) this).field_K;
                      break L10;
                    }
                  }
                }
              }
            }
            break L10;
          }
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Q = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_ab = 0;
        field_r = "Names cannot start or end with space or underscore";
    }
}
