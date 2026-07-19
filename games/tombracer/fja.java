/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fja extends qra {
    private boolean field_p;
    private qa[] field_n;
    private boolean field_o;
    private int field_q;
    private boolean field_m;

    final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        boolean stackIn_17_0 = false;
        boolean stackIn_23_0 = false;
        boolean stackOut_16_0 = false;
        boolean stackOut_22_0 = false;
        L0: {
          var5 = TombRacer.field_G ? 1 : 0;
          if (param0 == 80) {
            break L0;
          } else {
            fja.a(59, 38, (byte) -62, 36, 61, 1);
            break L0;
          }
        }
        L1: {
          var3 = this.field_h.l(115);
          if (!this.field_o) {
            break L1;
          } else {
            if (!this.field_c.g(0)) {
              break L1;
            } else {
              this.g(param0 + -208);
              break L1;
            }
          }
        }
        L2: {
          if (this.field_q > 0) {
            this.field_q = this.field_q - 1;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (this.field_h.field_D) {
            break L3;
          } else {
            if (this.field_h.e(118)) {
              return;
            } else {
              break L3;
            }
          }
        }
        L4: {
          if ((this.field_c.e(2) ^ -1) != 0) {
            break L4;
          } else {
            this.field_h.h(110);
            break L4;
          }
        }
        var4 = 0;
        L5: while (true) {
          L6: {
            L7: {
              if ((this.field_n.length ^ -1) >= (var4 ^ -1)) {
                break L7;
              } else {
                stackOut_16_0 = this.field_n[var4].c(1727002282);
                stackIn_23_0 = stackOut_16_0;
                stackIn_17_0 = stackOut_16_0;
                if (var5 != 0) {
                  break L6;
                } else {
                  L8: {
                    if (stackIn_17_0) {
                      break L8;
                    } else {
                      if (this.field_c.f((byte) -127, var4)) {
                        this.field_n[var4].a(60, true);
                        this.field_n[var4].a(0, (byte) 108, 2 * aaa.a(false));
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                  var4++;
                  if (var5 == 0) {
                    continue L5;
                  } else {
                    break L7;
                  }
                }
              }
            }
            stackOut_22_0 = this.field_h.d((byte) 95);
            stackIn_23_0 = stackOut_22_0;
            break L6;
          }
          L9: {
            L10: {
              if (stackIn_23_0) {
                break L10;
              } else {
                if (!this.field_c.b((byte) 90, var3)) {
                  break L9;
                } else {
                  if (this.field_m) {
                    break L9;
                  } else {
                    L11: {
                      this.field_m = true;
                      if (this.field_h.c(false)) {
                        break L11;
                      } else {
                        this.field_h.a(new gi(this.field_h), param0 + 600);
                        if (var5 == 0) {
                          break L9;
                        } else {
                          break L11;
                        }
                      }
                    }
                    this.field_h.a(new ova(this.field_h), 680);
                    if (var5 == 0) {
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
              }
            }
            L12: {
              if (!this.field_h.g(0, 0)) {
                break L12;
              } else {
                this.field_h.e(-1, 17219);
                if (var5 == 0) {
                  break L9;
                } else {
                  break L12;
                }
              }
            }
            if (!this.field_h.g(param0 + -80, 1)) {
              break L9;
            } else {
              this.field_h.e(1, 17219);
              break L9;
            }
          }
          this.b((byte) 101);
          var4 = 0;
          L13: while (true) {
            L14: {
              L15: {
                L16: {
                  if (var4 >= this.field_n.length) {
                    break L16;
                  } else {
                    this.field_n[var4].a((byte) 111);
                    var4++;
                    if (var5 != 0) {
                      break L15;
                    } else {
                      if (var5 == 0) {
                        continue L13;
                      } else {
                        break L16;
                      }
                    }
                  }
                }
                if (!this.field_h.field_D) {
                  break L15;
                } else {
                  break L14;
                }
              }
              this.i(0);
              break L14;
            }
            return;
          }
        }
    }

    final void b(int param0, boolean param1) {
        int discarded$3 = 0;
        int discarded$4 = 0;
        int discarded$5 = 0;
        int var3 = 0;
        int var4_int = 0;
        String var4 = null;
        int var5_int = 0;
        la var5 = null;
        int var6 = 0;
        int[][] var6_ref_int____ = null;
        int var7_int = 0;
        g var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        int[][] var15 = null;
        hca var16 = null;
        String var17 = null;
        String var18 = null;
        int[][] var19 = null;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        boolean stackIn_11_0 = false;
        int stackIn_15_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        boolean stackIn_32_0 = false;
        boolean stackIn_39_0 = false;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        boolean stackOut_10_0 = false;
        int stackOut_14_0 = 0;
        boolean stackOut_31_0 = false;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        boolean stackOut_38_0 = false;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        L0: {
          L1: {
            L2: {
              var14 = TombRacer.field_G ? 1 : 0;
              var3 = this.field_h.l(81);
              this.field_n[var3].b(23479);
              if (!this.field_h.f((byte) 33)) {
                var4_int = 0;
                var5_int = 0;
                L3: while (true) {
                  L4: {
                    if (this.field_c.field_c.field_e.length <= var5_int) {
                      break L4;
                    } else {
                      stackOut_4_0 = this.field_c.field_c.field_e[var5_int];
                      stackOut_4_1 = var3;
                      stackIn_50_0 = stackOut_4_0;
                      stackIn_50_1 = stackOut_4_1;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      if (var14 != 0) {
                        break L0;
                      } else {
                        L5: {
                          if (stackIn_5_0 != stackIn_5_1) {
                            break L5;
                          } else {
                            var4_int = var5_int;
                            break L5;
                          }
                        }
                        var5_int++;
                        if (var14 == 0) {
                          continue L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  var5_int = 0;
                  var6 = 0;
                  L6: while (true) {
                    L7: {
                      L8: {
                        if ((var6 ^ -1) <= (this.field_c.field_H.length ^ -1)) {
                          break L8;
                        } else {
                          stackOut_10_0 = this.field_c.f((byte) -81, var6);
                          stackIn_15_0 = stackOut_10_0 ? 1 : 0;
                          stackIn_11_0 = stackOut_10_0;
                          if (var14 != 0) {
                            break L7;
                          } else {
                            L9: {
                              if (stackIn_11_0) {
                                break L9;
                              } else {
                                var5_int++;
                                break L9;
                              }
                            }
                            var6++;
                            if (var14 == 0) {
                              continue L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      stackOut_14_0 = var5_int ^ -1;
                      stackIn_15_0 = stackOut_14_0;
                      break L7;
                    }
                    if (stackIn_15_0 == -3) {
                      var6 = 0;
                      var7_int = 0;
                      L10: while (true) {
                        L11: {
                          if (this.field_c.field_H.length <= var7_int) {
                            break L11;
                          } else {
                            stackOut_31_0 = this.field_c.f((byte) -85, var7_int);
                            stackIn_39_0 = stackOut_31_0;
                            stackIn_32_0 = stackOut_31_0;
                            if (var14 != 0) {
                              break L1;
                            } else {
                              L12: {
                                if (stackIn_32_0) {
                                  break L12;
                                } else {
                                  if (var3 != var7_int) {
                                    var6 = var7_int;
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              var7_int++;
                              if (var14 == 0) {
                                continue L10;
                              } else {
                                break L11;
                              }
                            }
                          }
                        }
                        this.field_n[var6].a(0, qu.field_e, -20186);
                        this.field_n[var6].b(23479);
                        break L2;
                      }
                    } else {
                      if (var5_int <= 2) {
                        break L2;
                      } else {
                        L13: {
                          L14: {
                            var19 = new int[var5_int][2];
                            var15 = var19;
                            var6_ref_int____ = var15;
                            var6_ref_int____[1] = new int[]{0, 2};
                            if ((var5_int ^ -1) == -5) {
                              break L14;
                            } else {
                              var6_ref_int____[2] = new int[]{0, 1};
                              if (var14 == 0) {
                                break L13;
                              } else {
                                break L14;
                              }
                            }
                          }
                          var6_ref_int____[2] = new int[]{1, 3};
                          var6_ref_int____[3] = new int[]{1, 2};
                          break L13;
                        }
                        var6_ref_int____[0] = new int[]{1, 2};
                        var7_int = 0;
                        L15: while (true) {
                          L16: {
                            if ((var19[var4_int].length ^ -1) >= (var7_int ^ -1)) {
                              break L16;
                            } else {
                              var8 = this.field_c.field_c.field_e[var19[var4_int][var7_int]];
                              stackOut_23_0 = 0;
                              stackOut_23_1 = var8 ^ -1;
                              stackIn_50_0 = stackOut_23_0;
                              stackIn_50_1 = stackOut_23_1;
                              stackIn_24_0 = stackOut_23_0;
                              stackIn_24_1 = stackOut_23_1;
                              if (var14 != 0) {
                                break L0;
                              } else {
                                L17: {
                                  if (stackIn_24_0 == stackIn_24_1) {
                                    break L17;
                                  } else {
                                    if ((var3 ^ -1) == (var8 ^ -1)) {
                                      break L17;
                                    } else {
                                      this.field_n[var8].a(var7_int, mma.field_c, -20186);
                                      this.field_n[var8].b(23479);
                                      break L17;
                                    }
                                  }
                                }
                                var7_int++;
                                if (var14 == 0) {
                                  continue L15;
                                } else {
                                  break L16;
                                }
                              }
                            }
                          }
                          break L2;
                        }
                      }
                    }
                  }
                }
              } else {
                break L2;
              }
            }
            stackOut_38_0 = this.field_h.f((byte) 33);
            stackIn_39_0 = stackOut_38_0;
            break L1;
          }
          L18: {
            if (stackIn_39_0) {
              break L18;
            } else {
              if (this.field_h.field_A) {
                break L18;
              } else {
                L19: {
                  if (this.field_h.d((byte) 78)) {
                    var4_int = 16;
                    var5_int = 16;
                    var6 = 256;
                    var7_int = 64;
                    qa.a(var7_int, var6, (byte) 109, var4_int, aq.field_a, var5_int);
                    discarded$3 = be.a(dpa.field_c, 0, qr.field_v, 11903361, 40, var7_int, 1, var5_int, var4_int, 0, (byte) 60, var6);
                    discarded$4 = be.a(voa.field_q + ": " + this.field_h.j(var3, 9), 2, eda.field_f, 11903361, 40, var7_int, 1, var5_int, var4_int, 1, (byte) 60, var6);
                    var5_int = var5_int + (var7_int - -16);
                    var7_int = 32;
                    qa.a(var7_int, var6, (byte) 80, var4_int, aq.field_a, var5_int);
                    discarded$5 = kn.field_p.a((aa) null, var6, 40, 0, var5_int - -2, fm.a(false, 0), wca.field_l, 1, fm.a(false, 11903361), tp.field_J, (byte) 116, var7_int, 0, id.field_h, var4_int, 1);
                    break L19;
                  } else {
                    break L19;
                  }
                }
                if (!param1) {
                  return;
                } else {
                  stackOut_49_0 = param0;
                  stackOut_49_1 = -50;
                  stackIn_50_0 = stackOut_49_0;
                  stackIn_50_1 = stackOut_49_1;
                  break L0;
                }
              }
            }
          }
          return;
        }
        L20: {
          if (stackIn_50_0 < stackIn_50_1) {
            break L20;
          } else {
            this.field_o = true;
            break L20;
          }
        }
        L21: {
          if (-1 > (this.field_q ^ -1)) {
            L22: {
              L23: {
                if (50 >= this.field_q) {
                  break L23;
                } else {
                  var4 = hua.field_b.toUpperCase();
                  if (var14 == 0) {
                    break L22;
                  } else {
                    break L23;
                  }
                }
              }
              var4 = jh.field_J;
              break L22;
            }
            L24: {
              var5_int = 40 + ds.field_n.a(var4, (byte) 41);
              var6 = aaa.a(false) / 2;
              var7_int = koa.b(0) / 2;
              qa.a(64, var5_int, (byte) 74, -(var5_int / 2) + var6, aq.field_a, -ds.field_n.field_d + (var7_int + -32));
              if (-51 > (this.field_q ^ -1)) {
                break L24;
              } else {
                oka.a(var4, 16777215, eda.field_f, -1, var7_int, var6, 0);
                if (var14 == 0) {
                  break L21;
                } else {
                  break L24;
                }
              }
            }
            L25: {
              if (0 != this.field_c.field_K) {
                break L25;
              } else {
                oka.a(uqa.field_z + " " + (1 + this.field_c.field_A), 16777215, eda.field_f, -1, 225, var6, 0);
                oka.a(var4, 16777215, eda.field_f, -1, 255, var6, 0);
                if (var14 == 0) {
                  break L21;
                } else {
                  break L25;
                }
              }
            }
            oka.a(var4, 16777215, eda.field_f, -1, var7_int, var6, 0);
            break L21;
          } else {
            break L21;
          }
        }
        L26: {
          if (this.field_p) {
            L27: {
              ua.a(4, kn.field_p, "Debug", 565, 0, 48, 16777215);
              ua.a(4, kn.field_p, "FPS: " + oea.field_f, 565, 0, 64, 16777215);
              if (this.field_h.field_D) {
                this.field_f.c(16);
                break L27;
              } else {
                break L27;
              }
            }
            if (-1 < (var3 ^ -1)) {
              break L26;
            } else {
              if (this.field_h.f(-12963, var3)) {
                L28: {
                  L29: {
                    var16 = this.field_h.field_k.field_H[var3];
                    var5 = var16.f((byte) 87);
                    var6 = var5.q((byte) -82);
                    if (-4 != (this.field_c.field_K ^ -1)) {
                      break L29;
                    } else {
                      var7 = doa.b(var6, 0, pl.a((byte) 64));
                      if (var14 == 0) {
                        break L28;
                      } else {
                        break L29;
                      }
                    }
                  }
                  L30: {
                    if (0 != (this.field_c.i(0) ^ -1)) {
                      break L30;
                    } else {
                      L31: {
                        if (var5.j(0)) {
                          break L31;
                        } else {
                          var7 = kq.a(-111, var6);
                          if (var14 == 0) {
                            break L28;
                          } else {
                            break L31;
                          }
                        }
                      }
                      var7 = mna.a(0, var6);
                      if (var14 == 0) {
                        break L28;
                      } else {
                        break L30;
                      }
                    }
                  }
                  var7 = doa.b(var6, 0, this.field_c.i(0));
                  break L28;
                }
                L32: {
                  L33: {
                    var8 = 64;
                    var9 = -64 + koa.b(0);
                    var10 = var5.p((byte) 69);
                    var11 = 16777215;
                    ts.a(0, -34, -16 + var9, "Par Time: " + dea.a(var7.field_h, (byte) -8), var8, kn.field_p, 16777215);
                    var17 = "Room total: " + dea.a(var10, (byte) -8);
                    var12 = var17;
                    var12 = var17;
                    var12 = var17;
                    if (9000 < var10) {
                      break L33;
                    } else {
                      if (-3001 > (var10 ^ -1)) {
                        var12 = var17 + " :(";
                        var11 = 16776960;
                        if (var14 == 0) {
                          break L32;
                        } else {
                          break L33;
                        }
                      } else {
                        break L32;
                      }
                    }
                  }
                  var12 = var12 + " !!! :(";
                  var11 = 16711680;
                  break L32;
                }
                L34: {
                  ts.a(0, -73, var9, var12, var8, kn.field_p, var11);
                  var12 = "Member Only: " + kq.a(-112, var5.q((byte) -82)).field_d;
                  ts.a(0, -80, 16 + var9, var12, var8, kn.field_p, 16777215);
                  var13 = var16.L(2158);
                  if (-1 <= (var13 ^ -1)) {
                    break L34;
                  } else {
                    L35: {
                      L36: {
                        var11 = 16777215;
                        var18 = "Last room total: " + dea.a(var13, (byte) -8);
                        var12 = var18;
                        var12 = var18;
                        var12 = var18;
                        if (var13 <= 9000) {
                          break L36;
                        } else {
                          var12 = var18 + " !!! :(";
                          var11 = 16711680;
                          if (var14 == 0) {
                            break L35;
                          } else {
                            break L36;
                          }
                        }
                      }
                      if ((var13 ^ -1) < -3001) {
                        var11 = 16776960;
                        var12 = var12 + " :(";
                        break L35;
                      } else {
                        break L35;
                      }
                    }
                    ts.a(0, -62, var9 + 32, var12, var8, kn.field_p, var11);
                    break L34;
                  }
                }
                ts.a(0, -96, var9 + 46, "Room: " + var7.field_b + " (multi " + var7.field_a + ") (single  " + var6 + ")", var8, kn.field_p, 16777215);
                ts.a(0, -33, var9 - -62, "Group: " + var7.field_g, var8, kn.field_p, 16777215);
                break L26;
              } else {
                break L26;
              }
            }
          } else {
            break L26;
          }
        }
    }

    final boolean a(char param0, int param1, int param2) {
        dl var5 = null;
        dt var6 = null;
        int stackIn_14_0 = 0;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        Object stackOut_20_0 = null;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        L0: {
          if (!rda.d(20125)) {
            break L0;
          } else {
            if (-29 != (param2 ^ -1)) {
              if (param2 == 16) {
                this.a(0, (byte) -109);
                return true;
              } else {
                if (param2 != 17) {
                  if (18 == param2) {
                    this.a(2, (byte) -109);
                    return true;
                  } else {
                    if (19 == param2) {
                      this.a(3, (byte) -109);
                      return true;
                    } else {
                      if ((param2 ^ -1) == -21) {
                        this.a(4, (byte) -109);
                        return true;
                      } else {
                        if (param2 == 21) {
                          L1: {
                            if (ica.field_a) {
                              stackOut_13_0 = 0;
                              stackIn_14_0 = stackOut_13_0;
                              break L1;
                            } else {
                              stackOut_12_0 = 1;
                              stackIn_14_0 = stackOut_12_0;
                              break L1;
                            }
                          }
                          ica.field_a = stackIn_14_0 != 0;
                          return true;
                        } else {
                          if (-41 != (param2 ^ -1)) {
                            if (!this.field_h.field_D) {
                              var6 = this.field_c.f(this.field_h.field_x, param1 + -25);
                              if (param2 == 25) {
                                var6.a((byte) -114).b(7, true);
                                return true;
                              } else {
                                L2: {
                                  L3: {
                                    if (-25 == (param2 ^ -1)) {
                                      break L3;
                                    } else {
                                      if (param2 == 22) {
                                        var6.field_g.a(1, (byte) 113);
                                        this.field_h.l((byte) -38);
                                        if (!TombRacer.field_G) {
                                          break L2;
                                        } else {
                                          break L3;
                                        }
                                      } else {
                                        break L2;
                                      }
                                    }
                                  }
                                  if (this.field_h.d(0)) {
                                    break L2;
                                  } else {
                                    var5 = new dl(this.field_h, (ms) null);
                                    var5.a("TITLE!", "Lalala here is some text to test with", "Press fire to continue. Or not.", (byte) 125);
                                    this.field_h.a(var5, param1 + 655);
                                    return true;
                                  }
                                }
                                if (-42 == (param2 ^ -1)) {
                                  var6.b((byte) 114);
                                  break L0;
                                } else {
                                  break L0;
                                }
                              }
                            } else {
                              return false;
                            }
                          } else {
                            L4: {
                              stackOut_20_0 = this;
                              stackIn_22_0 = stackOut_20_0;
                              stackIn_21_0 = stackOut_20_0;
                              if (this.field_p) {
                                stackOut_22_0 = this;
                                stackOut_22_1 = 0;
                                stackIn_23_0 = stackOut_22_0;
                                stackIn_23_1 = stackOut_22_1;
                                break L4;
                              } else {
                                stackOut_21_0 = this;
                                stackOut_21_1 = 1;
                                stackIn_23_0 = stackOut_21_0;
                                stackIn_23_1 = stackOut_21_1;
                                break L4;
                              }
                            }
                            ((fja) (this)).field_p = stackIn_23_1 != 0;
                            return true;
                          }
                        }
                      }
                    }
                  }
                } else {
                  this.a(1, (byte) -109);
                  return true;
                }
              }
            } else {
              this.a(-1, (byte) -109);
              ica.field_a = true;
              return true;
            }
          }
        }
        if (param1 == 25) {
          return false;
        } else {
          this.field_m = true;
          return false;
        }
    }

    private final void f(int param0) {
        boolean discarded$0 = false;
        this.field_o = false;
        if (param0 != 16) {
            discarded$0 = this.a('ﾝ', -29, -124);
        }
    }

    final boolean e(int param0) {
        if (param0 != -9202) {
            return true;
        }
        return true;
    }

    private final void a(int param0, int param1) {
        this.field_h.i(param1, param0 ^ 62);
        if (param0 != 0) {
            this.field_o = true;
        }
    }

    private final void b(byte param0) {
        int var2 = 0;
        L0: {
          L1: {
            var2 = this.field_h.l(89);
            if (-2 > (this.field_c.field_P ^ -1)) {
              break L1;
            } else {
              this.field_n[var2].a(0, mf.field_d, -20186);
              if (!TombRacer.field_G) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          this.field_n[var2].a(0, dp.field_j, -20186);
          break L0;
        }
        L2: {
          if (param0 >= 52) {
            break L2;
          } else {
            this.field_p = false;
            break L2;
          }
        }
    }

    private final void g(int param0) {
        this.field_o = false;
        this.field_q = 75;
        if (param0 >= -67) {
            this.field_m = true;
        }
    }

    private final void i(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[][] var6 = null;
        int[][] var7 = null;
        int[][] var9 = null;
        int[][] var12 = null;
        int stackIn_9_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_18_0 = 0;
        L0: {
          L1: {
            var5 = TombRacer.field_G ? 1 : 0;
            if (this.field_h.c(false)) {
              break L1;
            } else {
              if (!this.field_c.b(0)) {
                break L1;
              } else {
                L2: {
                  if (this.field_c.field_G[0].e(-31170)) {
                    break L2;
                  } else {
                    L3: {
                      if ((this.field_c.field_L ^ -1) < -2) {
                        break L3;
                      } else {
                        this.a(0, this.field_h.field_x);
                        if (var5 == 0) {
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var9 = new int[this.field_c.field_k][3];
                    var7 = var9;
                    var6 = var7;
                    var12 = var6;
                    var3 = 0;
                    L4: while (true) {
                      L5: {
                        if (var3 >= this.field_c.field_k) {
                          break L5;
                        } else {
                          stackOut_8_0 = 0;
                          stackIn_19_0 = stackOut_8_0;
                          stackIn_9_0 = stackOut_8_0;
                          if (var5 != 0) {
                            break L0;
                          } else {
                            var4 = stackIn_9_0;
                            L6: while (true) {
                              L7: {
                                L8: {
                                  if (3 <= var4) {
                                    break L8;
                                  } else {
                                    var9[var3][var4] = this.field_c.field_H[var3].c(196608, var4);
                                    var4++;
                                    if (var5 != 0) {
                                      break L7;
                                    } else {
                                      if (var5 == 0) {
                                        continue L6;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                }
                                var3++;
                                break L7;
                              }
                              if (var5 == 0) {
                                continue L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      this.field_h.a((byte) 101, var12, this.field_h.field_x);
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                this.a(0, -2);
                break L1;
              }
            }
          }
          stackOut_18_0 = param0;
          stackIn_19_0 = stackOut_18_0;
          break L0;
        }
        L9: {
          if (stackIn_19_0 == 0) {
            break L9;
          } else {
            this.field_q = 7;
            break L9;
          }
        }
    }

    private final void a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        byte stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          if (4 > param0) {
            break L0;
          } else {
            this.field_h.field_A = true;
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          L2: {
            L3: {
              if ((var3 ^ -1) <= (this.field_n.length ^ -1)) {
                break L3;
              } else {
                stackOut_4_0 = this.field_h.l(112) ^ -1;
                stackOut_4_1 = var3 ^ -1;
                stackIn_11_0 = stackOut_4_0;
                stackIn_11_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (var4 != 0) {
                  break L2;
                } else {
                  L4: {
                    L5: {
                      if (stackIn_5_0 == stackIn_5_1) {
                        break L5;
                      } else {
                        if (this.field_h.d((byte) 102)) {
                          break L5;
                        } else {
                          break L4;
                        }
                      }
                    }
                    this.field_n[var3].a((byte) -115, param0);
                    break L4;
                  }
                  var3++;
                  if (var4 == 0) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
              }
            }
            stackOut_10_0 = param1;
            stackOut_10_1 = -109;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            break L2;
          }
          L6: {
            if (stackIn_11_0 == stackIn_11_1) {
              break L6;
            } else {
              this.field_q = 52;
              break L6;
            }
          }
          return;
        }
    }

    final static boolean h(int param0) {
        if (param0 <= 83) {
            fja.a(-107, -110, (byte) -67, -77, -33, 57);
        }
        fpa.field_c = true;
        oga.field_f = 15000L + bva.b((byte) -107);
        return -12 == (gda.field_c ^ -1) ? true : false;
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5) {
        if (param2 < 122) {
            return;
        }
        tga.field_a.za(param0, param5, param4, jg.a(param3, (byte) -115, param1), 2);
    }

    final static int a(goa param0, String param1, boolean param2, int param3, goa param4, int param5, int param6) {
        boolean discarded$1 = false;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        uia stackIn_13_0 = null;
        uia stackIn_14_0 = null;
        uia stackIn_15_0 = null;
        String stackIn_15_1 = null;
        uia stackIn_16_0 = null;
        uia stackIn_17_0 = null;
        uia stackIn_18_0 = null;
        String stackIn_18_1 = null;
        int stackIn_33_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_75_0 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_85_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        uia stackOut_12_0 = null;
        uia stackOut_14_0 = null;
        String stackOut_14_1 = null;
        uia stackOut_13_0 = null;
        String stackOut_13_1 = null;
        uia stackOut_15_0 = null;
        uia stackOut_17_0 = null;
        String stackOut_17_1 = null;
        uia stackOut_16_0 = null;
        String stackOut_16_1 = null;
        int stackOut_32_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        String stackOut_84_2 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param5 >= 77) {
              L1: {
                var14 = param4.a(-12851);
                var11_ref_String = var14;
                var11_ref_String = var14;
                var8 = param0.a(-12851);
                var11_ref_String = var8;
                var11_ref_String = var8;
                if (oba.field_e != null) {
                  break L1;
                } else {
                  if (!joa.a(false, (byte) -58)) {
                    stackOut_7_0 = -1;
                    stackIn_8_0 = stackOut_7_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (km.field_p == sua.field_G) {
                  L3: {
                    L4: {
                      ql.field_k.field_h = 0;
                      kia.field_b = null;
                      if (param1 != null) {
                        break L4;
                      } else {
                        L5: {
                          jg.field_a.field_h = 0;
                          jg.field_a.a(lpa.field_p.nextInt(), (byte) -106);
                          jg.field_a.a(lpa.field_p.nextInt(), (byte) 92);
                          stackOut_12_0 = jg.field_a;
                          stackIn_14_0 = stackOut_12_0;
                          stackIn_13_0 = stackOut_12_0;
                          if (!param4.a((byte) 29)) {
                            stackOut_14_0 = (uia) ((Object) stackIn_14_0);
                            stackOut_14_1 = "";
                            stackIn_15_0 = stackOut_14_0;
                            stackIn_15_1 = stackOut_14_1;
                            break L5;
                          } else {
                            stackOut_13_0 = (uia) ((Object) stackIn_13_0);
                            stackOut_13_1 = (String) (var14);
                            stackIn_15_0 = stackOut_13_0;
                            stackIn_15_1 = stackOut_13_1;
                            break L5;
                          }
                        }
                        L6: {
                          ((uia) (Object) stackIn_15_0).a(stackIn_15_1, (byte) 0);
                          stackOut_15_0 = jg.field_a;
                          stackIn_17_0 = stackOut_15_0;
                          stackIn_16_0 = stackOut_15_0;
                          if (param0.a((byte) 29)) {
                            stackOut_17_0 = (uia) ((Object) stackIn_17_0);
                            stackOut_17_1 = (String) (var8);
                            stackIn_18_0 = stackOut_17_0;
                            stackIn_18_1 = stackOut_17_1;
                            break L6;
                          } else {
                            stackOut_16_0 = (uia) ((Object) stackIn_16_0);
                            stackOut_16_1 = "";
                            stackIn_18_0 = stackOut_16_0;
                            stackIn_18_1 = stackOut_16_1;
                            break L6;
                          }
                        }
                        ((uia) (Object) stackIn_18_0).a(stackIn_18_1, (byte) 0);
                        ql.field_k.i(16, 0);
                        ql.field_k.field_h = ql.field_k.field_h + 1;
                        var9 = ql.field_k.field_h;
                        bna.a(oca.field_a, false, c.field_f, ql.field_k, jg.field_a);
                        ql.field_k.d(ql.field_k.field_h - var9, (byte) -115);
                        if (var13 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L7: {
                      var9 = 0;
                      jg.field_a.field_h = 0;
                      if (!param2) {
                        break L7;
                      } else {
                        var9 = var9 | 1;
                        break L7;
                      }
                    }
                    L8: {
                      jg.field_a.a(lpa.field_p.nextInt(), (byte) 91);
                      jg.field_a.a(lpa.field_p.nextInt(), (byte) 92);
                      jg.field_a.a(var14, (byte) 0);
                      jg.field_a.a(var8, (byte) 0);
                      var15 = (CharSequence) ((Object) param1);
                      jg.field_a.a(fl.a((byte) 126, var15), (byte) 0);
                      jg.field_a.f(-1477662136, param6);
                      jg.field_a.i(param3, 0);
                      jg.field_a.i(var9, 0);
                      ql.field_k.i(18, 0);
                      ql.field_k.field_h = ql.field_k.field_h + 2;
                      var10 = ql.field_k.field_h;
                      var11_ref_String = qla.a(0, di.a(62));
                      if (var11_ref_String != null) {
                        break L8;
                      } else {
                        var11_ref_String = "";
                        break L8;
                      }
                    }
                    ql.field_k.a(var11_ref_String, false);
                    bna.a(oca.field_a, false, c.field_f, ql.field_k, jg.field_a);
                    ql.field_k.b(ql.field_k.field_h + -var10, (byte) -35);
                    break L3;
                  }
                  bl.a(-1, -1);
                  km.field_p = hca.field_p;
                  break L2;
                } else {
                  break L2;
                }
              }
              L9: {
                if (hca.field_p == km.field_p) {
                  if (!ama.a(1, -1)) {
                    break L9;
                  } else {
                    L10: {
                      L11: {
                        var9 = vc.field_q.h(255);
                        vc.field_q.field_h = 0;
                        if ((var9 ^ -1) > -101) {
                          break L11;
                        } else {
                          if ((var9 ^ -1) >= -106) {
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                      if (-249 != (var9 ^ -1)) {
                        L12: {
                          if (99 == var9) {
                            break L12;
                          } else {
                            oka.field_z = var9;
                            km.field_p = pe.field_m;
                            uca.field_d = -1;
                            if (var13 == 0) {
                              break L9;
                            } else {
                              break L12;
                            }
                          }
                        }
                        discarded$1 = ama.a(bha.f(1), -1);
                        kia.field_b = new Boolean(di.a(vc.field_q, (byte) 107));
                        vc.field_q.field_h = 0;
                        if (var13 == 0) {
                          break L9;
                        } else {
                          break L10;
                        }
                      } else {
                        pu.a(di.a(21), 255);
                        io.field_b = qda.field_f;
                        dea.a(60);
                        uc.field_L = false;
                        stackOut_32_0 = var9;
                        stackIn_33_0 = stackOut_32_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                    km.field_p = ne.field_c;
                    dja.field_s = new String[-100 + var9];
                    break L9;
                  }
                } else {
                  break L9;
                }
              }
              L13: {
                if (km.field_p == ne.field_c) {
                  var9 = 2;
                  if (!ama.a(var9, -1)) {
                    break L13;
                  } else {
                    var10 = vc.field_q.d(124);
                    vc.field_q.field_h = 0;
                    if (!ama.a(var10, -1)) {
                      break L13;
                    } else {
                      var11 = dja.field_s.length;
                      var12 = 0;
                      L14: while (true) {
                        L15: {
                          L16: {
                            if (var11 <= var12) {
                              break L16;
                            } else {
                              dja.field_s[var12] = vc.field_q.f(121);
                              var12++;
                              if (var13 != 0) {
                                break L15;
                              } else {
                                if (var13 == 0) {
                                  continue L14;
                                } else {
                                  break L16;
                                }
                              }
                            }
                          }
                          dea.a(60);
                          uc.field_L = false;
                          break L15;
                        }
                        stackOut_50_0 = var11 + 100;
                        stackIn_51_0 = stackOut_50_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  }
                } else {
                  break L13;
                }
              }
              L17: {
                if (pe.field_m == km.field_p) {
                  if (cla.g(0)) {
                    L18: {
                      L19: {
                        if (oka.field_z == 255) {
                          break L19;
                        } else {
                          io.field_b = vc.field_q.e((byte) -76);
                          if (var13 == 0) {
                            break L18;
                          } else {
                            break L19;
                          }
                        }
                      }
                      var9_ref_String = vc.field_q.c(-28690);
                      if (var9_ref_String != null) {
                        mp.a(var9_ref_String, di.a(82), -21407);
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    dea.a(60);
                    uc.field_L = false;
                    stackOut_62_0 = oka.field_z;
                    stackIn_63_0 = stackOut_62_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    break L17;
                  }
                } else {
                  break L17;
                }
              }
              L20: {
                if (null == oba.field_e) {
                  if (!uc.field_L) {
                    var9 = nn.field_b;
                    nn.field_b = uq.field_a;
                    uq.field_a = var9;
                    uc.field_L = true;
                    break L20;
                  } else {
                    L21: {
                      L22: {
                        if (-30001L > (rf.b((byte) -121) ^ -1L)) {
                          break L22;
                        } else {
                          io.field_b = sq.field_x;
                          if (var13 == 0) {
                            break L21;
                          } else {
                            break L22;
                          }
                        }
                      }
                      io.field_b = hb.field_u;
                      break L21;
                    }
                    uc.field_L = false;
                    stackOut_71_0 = 249;
                    stackIn_72_0 = stackOut_71_0;
                    decompiledRegionSelector0 = 5;
                    break L0;
                  }
                } else {
                  break L20;
                }
              }
              stackOut_74_0 = -1;
              stackIn_75_0 = stackOut_74_0;
              decompiledRegionSelector0 = 6;
              break L0;
            } else {
              stackOut_2_0 = 113;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var7 = decompiledCaughtException;
            stackOut_76_0 = (RuntimeException) (var7);
            stackOut_76_1 = new StringBuilder().append("fja.S(");
            stackIn_78_0 = stackOut_76_0;
            stackIn_78_1 = stackOut_76_1;
            stackIn_77_0 = stackOut_76_0;
            stackIn_77_1 = stackOut_76_1;
            if (param0 == null) {
              stackOut_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackOut_78_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackOut_78_2 = "null";
              stackIn_79_0 = stackOut_78_0;
              stackIn_79_1 = stackOut_78_1;
              stackIn_79_2 = stackOut_78_2;
              break L23;
            } else {
              stackOut_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackOut_77_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackOut_77_2 = "{...}";
              stackIn_79_0 = stackOut_77_0;
              stackIn_79_1 = stackOut_77_1;
              stackIn_79_2 = stackOut_77_2;
              break L23;
            }
          }
          L24: {
            stackOut_79_0 = (RuntimeException) ((Object) stackIn_79_0);
            stackOut_79_1 = ((StringBuilder) (Object) stackIn_79_1).append(stackIn_79_2).append(',');
            stackIn_81_0 = stackOut_79_0;
            stackIn_81_1 = stackOut_79_1;
            stackIn_80_0 = stackOut_79_0;
            stackIn_80_1 = stackOut_79_1;
            if (param1 == null) {
              stackOut_81_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackOut_81_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackOut_81_2 = "null";
              stackIn_82_0 = stackOut_81_0;
              stackIn_82_1 = stackOut_81_1;
              stackIn_82_2 = stackOut_81_2;
              break L24;
            } else {
              stackOut_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackOut_80_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackOut_80_2 = "{...}";
              stackIn_82_0 = stackOut_80_0;
              stackIn_82_1 = stackOut_80_1;
              stackIn_82_2 = stackOut_80_2;
              break L24;
            }
          }
          L25: {
            stackOut_82_0 = (RuntimeException) ((Object) stackIn_82_0);
            stackOut_82_1 = ((StringBuilder) (Object) stackIn_82_1).append(stackIn_82_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_84_0 = stackOut_82_0;
            stackIn_84_1 = stackOut_82_1;
            stackIn_83_0 = stackOut_82_0;
            stackIn_83_1 = stackOut_82_1;
            if (param4 == null) {
              stackOut_84_0 = (RuntimeException) ((Object) stackIn_84_0);
              stackOut_84_1 = (StringBuilder) ((Object) stackIn_84_1);
              stackOut_84_2 = "null";
              stackIn_85_0 = stackOut_84_0;
              stackIn_85_1 = stackOut_84_1;
              stackIn_85_2 = stackOut_84_2;
              break L25;
            } else {
              stackOut_83_0 = (RuntimeException) ((Object) stackIn_83_0);
              stackOut_83_1 = (StringBuilder) ((Object) stackIn_83_1);
              stackOut_83_2 = "{...}";
              stackIn_85_0 = stackOut_83_0;
              stackIn_85_1 = stackOut_83_1;
              stackIn_85_2 = stackOut_83_2;
              break L25;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_85_0), stackIn_85_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_33_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_51_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_63_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_72_0;
                  } else {
                    return stackIn_75_0;
                  }
                }
              }
            }
          }
        }
    }

    final static byte[] a(int param0, byte[] param1, int param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5_int = 0;
        vh var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param2 <= 0) {
                  break L2;
                } else {
                  var8 = new byte[param0];
                  var4 = var8;
                  var5_int = 0;
                  L3: while (true) {
                    L4: {
                      if ((var5_int ^ -1) <= (param0 ^ -1)) {
                        break L4;
                      } else {
                        var8[var5_int] = param1[param2 + var5_int];
                        var5_int++;
                        if (var7 != 0) {
                          break L1;
                        } else {
                          if (var7 == 0) {
                            continue L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    if (var7 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              var4 = param1;
              break L1;
            }
            var5 = new vh();
            var5.b((byte) -6);
            var5.a(var4, (long)(param3 * param0), (byte) -59);
            var6 = new byte[64];
            var5.a(0, param3 ^ 40, var6);
            stackOut_9_0 = (byte[]) (var6);
            stackIn_10_0 = stackOut_9_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var4_ref);
            stackOut_11_1 = new StringBuilder().append("fja.R(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_10_0;
    }

    fja(qh param0, v param1) {
        super(param0, param1);
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        this.field_p = false;
        this.field_o = true;
        this.field_m = false;
        try {
          L0: {
            var3_int = this.field_h.field_k.field_H.length;
            this.field_n = new qa[var3_int];
            var4 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var4 >= var3_int) {
                    break L3;
                  } else {
                    this.field_n[var4] = new qa(this.field_h, var4);
                    var4++;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L4: {
                  if (this.field_h.f((byte) 33)) {
                    break L4;
                  } else {
                    L5: {
                      if (!this.field_h.c(false)) {
                        break L5;
                      } else {
                        this.f(16);
                        break L5;
                      }
                    }
                    L6: {
                      if (!this.field_h.field_D) {
                        break L6;
                      } else {
                        this.field_h.a(new dua(this.field_h), 680);
                        break L6;
                      }
                    }
                    er.b(1, 1);
                    break L4;
                  }
                }
                this.field_h.field_r = -1;
                this.b((byte) 122);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (runtimeException);
            stackOut_13_1 = new StringBuilder().append("fja.<init>(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L7;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L7;
            }
          }
          L8: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L8;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
    }

    static {
    }
}
