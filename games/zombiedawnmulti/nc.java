/*
 * Decompiled by CFR-JS 0.4.0.
 */
class nc {
    static cj field_e;
    int[] field_j;
    hh field_g;
    int field_i;
    private int field_b;
    private boolean field_f;
    static String field_c;
    static int field_h;
    int field_a;
    int field_d;
    int field_k;

    final void c(int param0) {
        boolean discarded$2 = false;
        int var3 = 0;
        L0: {
          L1: {
            var3 = ZombieDawnMulti.field_E ? 1 : 0;
            if (this.field_d == 2) {
              break L1;
            } else {
              L2: {
                if (3 == this.field_d) {
                  break L2;
                } else {
                  if ((this.field_d ^ -1) != -6) {
                    break L0;
                  } else {
                    this.field_j = new int[]{5};
                    this.field_g = new hh(this.field_j.length);
                    if (var3 == 0) {
                      break L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              this.field_j = new int[]{48, 5};
              this.field_g = new hh(this.field_j.length);
              if (var3 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          this.field_b = this.field_b - ah.field_e.field_C / 2;
          this.field_j = new int[]{1, 12, 13, 34, 47, 4, 50, 3, 7};
          this.field_g = new hh(this.field_j.length);
          break L0;
        }
        L3: {
          if (param0 == 1) {
            break L3;
          } else {
            discarded$2 = nc.a((byte) -25);
            break L3;
          }
        }
    }

    private final void a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            var5 = ZombieDawnMulti.field_E ? 1 : 0;
            if (!cp.field_K) {
              break L1;
            } else {
              bi.field_e = true;
              kk.a(-97, 0, 11);
              if (var5 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          if (!df.field_I) {
            break L0;
          } else {
            L2: {
              if (!pp.field_n) {
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
              var3 = stackIn_7_0;
              wb.l((byte) 124);
              if (var3 != 0) {
                break L3;
              } else {
                var4 = param0 ? 1 : 0;
                bm.a(var4 != 0, 15, 127, sp.field_g);
                if (var5 == 0) {
                  break L0;
                } else {
                  break L3;
                }
              }
            }
            var4 = param0 ? 1 : 0;
            bm.a(var4 != 0, 1, 125, sp.field_g);
            break L0;
          }
        }
        L4: {
          if (param1 == 200) {
            break L4;
          } else {
            this.field_b = 82;
            break L4;
          }
        }
        var3 = param0 ? 1 : 0;
        bm.a(var3 != 0, -5, 126, sp.field_g);
    }

    public static void b(boolean param0) {
        field_c = null;
        if (param0) {
            return;
        }
        field_e = null;
    }

    boolean c(int param0, int param1) {
        if ((this.field_j[param0] ^ -1) == -40) {
          return false;
        } else {
          L0: {
            if (-22 != (this.field_j[param0] ^ -1)) {
              break L0;
            } else {
              if (fb.field_e.g(param1 + -16777149) != 0) {
                break L0;
              } else {
                return false;
              }
            }
          }
          if (param1 != 16777215) {
            this.field_a = -71;
            return true;
          } else {
            return true;
          }
        }
    }

    final static boolean a(byte param0) {
        int var1 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var1 = 91 % ((param0 - 33) / 35);
            if (ki.field_e != null) {
              break L1;
            } else {
              if (!ee.field_b) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackOut_3_0 = 1;
          stackIn_5_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_5_0 != 0;
    }

    int a(byte param0, int param1) {
        L0: {
          if (param0 == -118) {
            break L0;
          } else {
            this.b((byte) -12);
            break L0;
          }
        }
        if (!this.field_f) {
          return this.field_i + this.field_k * param1;
        } else {
          return this.field_i;
        }
    }

    final void b(int param0) {
        int var3 = 0;
        L0: {
          var3 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param0 == 0) {
            break L0;
          } else {
            this.field_d = -56;
            break L0;
          }
        }
        L1: {
          L2: {
            if (-2 != (this.field_d ^ -1)) {
              break L2;
            } else {
              of.field_e[0].c(0, 0);
              if (var3 == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          L3: {
            L4: {
              if (this.field_d == 2) {
                break L4;
              } else {
                if (13 != this.field_d) {
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            of.field_e[0].c(0, 0);
            if (var3 == 0) {
              break L1;
            } else {
              break L3;
            }
          }
          L5: {
            L6: {
              if (-4 == (this.field_d ^ -1)) {
                break L6;
              } else {
                if (this.field_d == 5) {
                  break L6;
                } else {
                  if (6 == this.field_d) {
                    break L6;
                  } else {
                    if (this.field_d == 7) {
                      break L6;
                    } else {
                      if (14 == this.field_d) {
                        break L6;
                      } else {
                        if (8 != this.field_d) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                }
              }
            }
            dd.field_g.d(0, 0);
            v.field_e.d(0, -v.field_e.field_b + -pi.field_f.field_b + 480);
            pi.field_f.d(0, 480 + -pi.field_f.field_b);
            if (var3 == 0) {
              break L1;
            } else {
              break L5;
            }
          }
          L7: {
            if ((this.field_d ^ -1) == -16) {
              break L7;
            } else {
              L8: {
                if (4 == this.field_d) {
                  break L8;
                } else {
                  L9: {
                    if (-11 != (this.field_d ^ -1)) {
                      break L9;
                    } else {
                      dd.field_g.d(0, 0);
                      v.field_e.d(0, -v.field_e.field_b + (-pi.field_f.field_b + 480));
                      pi.field_f.d(0, -pi.field_f.field_b + 480);
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (9 == this.field_d) {
                      break L10;
                    } else {
                      L11: {
                        if (-12 == (this.field_d ^ -1)) {
                          break L11;
                        } else {
                          if (this.field_d != 12) {
                            break L1;
                          } else {
                            oo.e(0, 0, 640, 480, 65793);
                            if (var3 == 0) {
                              break L1;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                      oo.e(0, 0, 640, 480, 65793);
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L10;
                      }
                    }
                  }
                  of.field_e[4].c(0, 0);
                  if (var3 == 0) {
                    break L1;
                  } else {
                    break L8;
                  }
                }
              }
              dd.field_g.d(0, 0);
              v.field_e.d(0, -v.field_e.field_b + (480 - pi.field_f.field_b));
              pi.field_f.d(0, -pi.field_f.field_b + 480);
              if (var3 == 0) {
                break L1;
              } else {
                break L7;
              }
            }
          }
          oo.e(0, 0, 640, 480, 16777215);
          oo.h(0, 0, 640, 5);
          dd.field_g.d(0, 0);
          oo.h(0, 5, 640, 480);
          dd.field_g.d(0, -32);
          v.field_e.d(0, 448 - (pi.field_f.field_b + v.field_e.field_b));
          oo.h(4, 330, 636, 335);
          dd.field_g.d(0, 330);
          oo.h(0, 335, 640, 419);
          v.field_e.d(0, 300);
          oo.c();
          pi.field_f.d(0, 480 + -pi.field_f.field_b);
          break L1;
        }
    }

    final void d(int param0) {
        if (null != ao.field_b[this.field_d]) {
            ao.field_b[this.field_d].g(0, (this.field_d ^ -1) == -16 ? 6 : 13);
        }
        if (param0 != 4) {
            this.field_f = false;
        }
    }

    void b(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var7_ref_int__ = null;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        L0: {
          L1: {
            L2: {
              L3: {
                L4: {
                  L5: {
                    L6: {
                      L7: {
                        L8: {
                          L9: {
                            L10: {
                              L11: {
                                L12: {
                                  L13: {
                                    L14: {
                                      L15: {
                                        L16: {
                                          L17: {
                                            L18: {
                                              L19: {
                                                L20: {
                                                  L21: {
                                                    L22: {
                                                      L23: {
                                                        L24: {
                                                          L25: {
                                                            var9 = ZombieDawnMulti.field_E ? 1 : 0;
                                                            var4 = this.field_j[param2];
                                                            var6 = var4;
                                                            if ((var6 ^ -1) == -41) {
                                                              if (this.field_g.c(-85)) {
                                                                L26: {
                                                                  df.field_I = false;
                                                                  if (!wc.j(127)) {
                                                                    break L26;
                                                                  } else {
                                                                    rj.a(-4, (byte) -37, af.field_a);
                                                                    if (var9 == 0) {
                                                                      break L0;
                                                                    } else {
                                                                      break L26;
                                                                    }
                                                                  }
                                                                }
                                                                var6 = param1 ? 1 : 0;
                                                                bm.a(var6 != 0, -4, 126, sp.field_g);
                                                                if (var9 == 0) {
                                                                  break L0;
                                                                } else {
                                                                  break L25;
                                                                }
                                                              } else {
                                                                break L0;
                                                              }
                                                            } else {
                                                              L27: {
                                                                if (41 != var6) {
                                                                  break L27;
                                                                } else {
                                                                  if (var9 == 0) {
                                                                    break L25;
                                                                  } else {
                                                                    break L27;
                                                                  }
                                                                }
                                                              }
                                                              L28: {
                                                                if ((var6 ^ -1) != -47) {
                                                                  break L28;
                                                                } else {
                                                                  if (var9 == 0) {
                                                                    break L24;
                                                                  } else {
                                                                    break L28;
                                                                  }
                                                                }
                                                              }
                                                              if (-46 == (var6 ^ -1)) {
                                                                break L23;
                                                              } else {
                                                                L29: {
                                                                  if (var6 != 1) {
                                                                    break L29;
                                                                  } else {
                                                                    if (var9 == 0) {
                                                                      break L22;
                                                                    } else {
                                                                      break L29;
                                                                    }
                                                                  }
                                                                }
                                                                if (5 == var6) {
                                                                  break L21;
                                                                } else {
                                                                  L30: {
                                                                    if (var6 != 16) {
                                                                      break L30;
                                                                    } else {
                                                                      if (var9 == 0) {
                                                                        break L20;
                                                                      } else {
                                                                        break L30;
                                                                      }
                                                                    }
                                                                  }
                                                                  if ((var6 ^ -1) == -15) {
                                                                    break L19;
                                                                  } else {
                                                                    L31: {
                                                                      if (var6 != 44) {
                                                                        break L31;
                                                                      } else {
                                                                        if (var9 == 0) {
                                                                          break L18;
                                                                        } else {
                                                                          break L31;
                                                                        }
                                                                      }
                                                                    }
                                                                    if (3 == var6) {
                                                                      break L17;
                                                                    } else {
                                                                      if (6 == var6) {
                                                                        break L16;
                                                                      } else {
                                                                        if (2 == var6) {
                                                                          break L15;
                                                                        } else {
                                                                          if (12 == var6) {
                                                                            break L14;
                                                                          } else {
                                                                            if (-14 == (var6 ^ -1)) {
                                                                              break L13;
                                                                            } else {
                                                                              if (-5 == (var6 ^ -1)) {
                                                                                break L12;
                                                                              } else {
                                                                                L32: {
                                                                                  if (var6 != 7) {
                                                                                    break L32;
                                                                                  } else {
                                                                                    if (var9 == 0) {
                                                                                      break L11;
                                                                                    } else {
                                                                                      break L32;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L33: {
                                                                                  if ((var6 ^ -1) != -49) {
                                                                                    break L33;
                                                                                  } else {
                                                                                    if (var9 == 0) {
                                                                                      break L10;
                                                                                    } else {
                                                                                      break L33;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                if (49 == var6) {
                                                                                  break L9;
                                                                                } else {
                                                                                  L34: {
                                                                                    if (var6 != 15) {
                                                                                      break L34;
                                                                                    } else {
                                                                                      if (var9 == 0) {
                                                                                        break L8;
                                                                                      } else {
                                                                                        break L34;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  L35: {
                                                                                    if (-18 != (var6 ^ -1)) {
                                                                                      break L35;
                                                                                    } else {
                                                                                      if (var9 == 0) {
                                                                                        break L7;
                                                                                      } else {
                                                                                        break L35;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  if (var6 == 18) {
                                                                                    break L6;
                                                                                  } else {
                                                                                    if (11 == var6) {
                                                                                      break L5;
                                                                                    } else {
                                                                                      if (var6 == 50) {
                                                                                        break L4;
                                                                                      } else {
                                                                                        if (-35 == (var6 ^ -1)) {
                                                                                          break L3;
                                                                                        } else {
                                                                                          if (var6 == 47) {
                                                                                            break L2;
                                                                                          } else {
                                                                                            if (35 == var6) {
                                                                                              break L1;
                                                                                            } else {
                                                                                              L36: {
                                                                                                if (var6 != 36) {
                                                                                                  break L36;
                                                                                                } else {
                                                                                                  if (var9 == 0) {
                                                                                                    break L1;
                                                                                                  } else {
                                                                                                    break L36;
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                              L37: {
                                                                                                if (var6 != 38) {
                                                                                                  break L37;
                                                                                                } else {
                                                                                                  if (var9 == 0) {
                                                                                                    break L1;
                                                                                                  } else {
                                                                                                    break L37;
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                              if ((var6 ^ -1) == -40) {
                                                                                                break L0;
                                                                                              } else {
                                                                                                break L0;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                          if (this.field_g.c(-85)) {
                                                            var6 = param1 ? 1 : 0;
                                                            bm.a(var6 != 0, 14, 127, sp.field_g);
                                                            vd.field_d = this.field_d;
                                                            if (var9 == 0) {
                                                              break L0;
                                                            } else {
                                                              break L24;
                                                            }
                                                          } else {
                                                            break L0;
                                                          }
                                                        }
                                                        if (this.field_g.c(-85)) {
                                                          tg.a((byte) 27, true);
                                                          var6 = param1 ? 1 : 0;
                                                          bm.a(var6 != 0, -7, 127, sp.field_g);
                                                          vd.field_d = this.field_d;
                                                          if (var9 == 0) {
                                                            break L0;
                                                          } else {
                                                            break L23;
                                                          }
                                                        } else {
                                                          break L0;
                                                        }
                                                      }
                                                      if (this.field_g.c(-85)) {
                                                        this.b((byte) 69);
                                                        tg.a((byte) 25, false);
                                                        var6 = param1 ? 1 : 0;
                                                        bm.a(var6 != 0, -7, 125, sp.field_g);
                                                        vd.field_d = this.field_d;
                                                        if (var9 == 0) {
                                                          break L0;
                                                        } else {
                                                          break L22;
                                                        }
                                                      } else {
                                                        break L0;
                                                      }
                                                    }
                                                    if (!this.field_g.c(-85)) {
                                                      break L0;
                                                    } else {
                                                      var6 = param1 ? 1 : 0;
                                                      bm.a(var6 != 0, -7, 127, sp.field_g);
                                                      vd.field_d = 1;
                                                      if (var9 == 0) {
                                                        break L0;
                                                      } else {
                                                        break L21;
                                                      }
                                                    }
                                                  }
                                                  if (!this.field_g.c(-85)) {
                                                    break L0;
                                                  } else {
                                                    var6 = param1 ? 1 : 0;
                                                    bm.a(var6 != 0, 1, 126, sp.field_g);
                                                    if (var9 == 0) {
                                                      break L0;
                                                    } else {
                                                      break L20;
                                                    }
                                                  }
                                                }
                                                if (this.field_g.c(-85)) {
                                                  var6 = 1;
                                                  var7 = var6;
                                                  var8 = param1 ? 1 : 0;
                                                  bm.a(var8 != 0, var7, 126, sp.field_g);
                                                  var12 = k.field_n;
                                                  var11 = var12;
                                                  var10 = var11;
                                                  var7_ref_int__ = var10;
                                                  var8 = 0;
                                                  L38: while (true) {
                                                    L39: {
                                                      if (var8 >= 8) {
                                                        var7_ref_int__ = fc.field_m;
                                                        break L39;
                                                      } else {
                                                        var12[var8] = 0;
                                                        var8++;
                                                        if (var9 != 0) {
                                                          break L39;
                                                        } else {
                                                          continue L38;
                                                        }
                                                      }
                                                    }
                                                    var8 = 0;
                                                    L40: while (true) {
                                                      L41: {
                                                        if ((var8 ^ -1) <= -9) {
                                                          break L41;
                                                        } else {
                                                          var7_ref_int__[var8] = 0;
                                                          var8++;
                                                          if (var9 != 0) {
                                                            break L0;
                                                          } else {
                                                            if (var9 == 0) {
                                                              continue L40;
                                                            } else {
                                                              break L41;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      if (var9 == 0) {
                                                        break L0;
                                                      } else {
                                                        break L19;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  break L0;
                                                }
                                              }
                                              if (!this.field_g.c(-85)) {
                                                break L0;
                                              } else {
                                                var6 = param1 ? 1 : 0;
                                                bm.a(var6 != 0, 5, 127, sp.field_g);
                                                vd.field_d = this.field_d;
                                                if (var9 == 0) {
                                                  break L0;
                                                } else {
                                                  break L18;
                                                }
                                              }
                                            }
                                            if (this.field_g.c(-85)) {
                                              mj.field_Hb[15].a(0, param1, 0);
                                              var6 = param1 ? 1 : 0;
                                              bm.a(var6 != 0, 15, 126, sp.field_g);
                                              vd.field_d = this.field_d;
                                              if (var9 == 0) {
                                                break L0;
                                              } else {
                                                break L17;
                                              }
                                            } else {
                                              break L0;
                                            }
                                          }
                                          if (this.field_g.c(-85)) {
                                            ((ol) ((Object) mj.field_Hb[4])).e(113);
                                            var6 = param1 ? 1 : 0;
                                            bm.a(var6 != 0, 4, 125, sp.field_g);
                                            vd.field_d = this.field_d;
                                            if (var9 == 0) {
                                              break L0;
                                            } else {
                                              break L16;
                                            }
                                          } else {
                                            break L0;
                                          }
                                        }
                                        if (!this.field_g.c(-85)) {
                                          break L0;
                                        } else {
                                          var6 = vd.field_d;
                                          var7 = param1 ? 1 : 0;
                                          bm.a(var7 != 0, var6, 126, sp.field_g);
                                          if (var9 == 0) {
                                            break L0;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                      if (!this.field_g.c(-85)) {
                                        break L0;
                                      } else {
                                        var6 = param1 ? 1 : 0;
                                        bm.a(var6 != 0, 3, 126, sp.field_g);
                                        if (var9 == 0) {
                                          break L0;
                                        } else {
                                          break L14;
                                        }
                                      }
                                    }
                                    L42: {
                                      var5 = db.field_c;
                                      if (!this.field_g.g(8)) {
                                        break L42;
                                      } else {
                                        tj.a(3273, 0);
                                        break L42;
                                      }
                                    }
                                    L43: {
                                      if (this.field_g.f(-23954)) {
                                        tj.a(3273, 224);
                                        break L43;
                                      } else {
                                        break L43;
                                      }
                                    }
                                    L44: {
                                      if (this.field_g.b(false)) {
                                        L45: {
                                          var6 = ok.field_l + 137;
                                          var7 = 8 + (-var6 + this.a((byte) -118, param2) - -this.d(-110, param2) >> -238944543) - -ok.field_l;
                                          var8 = -var7 + bd.field_g << -466855071;
                                          var8 = var8 * 224 >> 957894024;
                                          if (0 >= var8) {
                                            break L45;
                                          } else {
                                            L46: {
                                              if (-225 >= (var8 ^ -1)) {
                                                break L46;
                                              } else {
                                                tj.a(3273, var8);
                                                if (var9 == 0) {
                                                  break L44;
                                                } else {
                                                  break L46;
                                                }
                                              }
                                            }
                                            tj.a(3273, 224);
                                            if (var9 == 0) {
                                              break L44;
                                            } else {
                                              break L45;
                                            }
                                          }
                                        }
                                        tj.a(3273, 0);
                                        break L44;
                                      } else {
                                        break L44;
                                      }
                                    }
                                    L47: {
                                      if (!this.field_g.e(96)) {
                                        break L47;
                                      } else {
                                        L48: {
                                          if (db.field_c > 28) {
                                            break L48;
                                          } else {
                                            tj.a(3273, 0);
                                            if (var9 == 0) {
                                              break L47;
                                            } else {
                                              break L48;
                                            }
                                          }
                                        }
                                        L49: {
                                          var6 = db.field_c % 28;
                                          if (var6 != 0) {
                                            break L49;
                                          } else {
                                            var6 = 28;
                                            break L49;
                                          }
                                        }
                                        tj.a(3273, -var6 + db.field_c);
                                        break L47;
                                      }
                                    }
                                    L50: {
                                      if (this.field_g.a(97)) {
                                        L51: {
                                          if (-197 < (db.field_c ^ -1)) {
                                            break L51;
                                          } else {
                                            tj.a(3273, 224);
                                            if (var9 == 0) {
                                              break L50;
                                            } else {
                                              break L51;
                                            }
                                          }
                                        }
                                        var6 = db.field_c % 28;
                                        tj.a(3273, -var6 + (db.field_c - -28));
                                        break L50;
                                      } else {
                                        break L50;
                                      }
                                    }
                                    if (var5 == db.field_c) {
                                      break L0;
                                    } else {
                                      L52: {
                                        if (jq.field_d == null) {
                                          break L52;
                                        } else {
                                          if (!jq.field_d.k()) {
                                            break L0;
                                          } else {
                                            break L52;
                                          }
                                        }
                                      }
                                      jq.field_d = nm.b(-128, 47);
                                      if (var9 == 0) {
                                        break L0;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  L53: {
                                    if (this.field_g.g(127)) {
                                      ff.a(0, -127);
                                      break L53;
                                    } else {
                                      break L53;
                                    }
                                  }
                                  L54: {
                                    if (this.field_g.f(-23954)) {
                                      ff.a(200, 92);
                                      break L54;
                                    } else {
                                      break L54;
                                    }
                                  }
                                  L55: {
                                    if (this.field_g.b(false)) {
                                      L56: {
                                        var6 = 137 + ok.field_l;
                                        var7 = 8 + (this.a((byte) -118, param2) + this.d(-93, param2) - var6 >> -1385877951) + ok.field_l;
                                        var8 = bd.field_g + -var7 << 71088705;
                                        var8 = var8 * 200 >> 739838728;
                                        if (var8 <= 0) {
                                          break L56;
                                        } else {
                                          L57: {
                                            if (200 <= var8) {
                                              break L57;
                                            } else {
                                              ff.a(var8, 81);
                                              if (var9 == 0) {
                                                break L55;
                                              } else {
                                                break L57;
                                              }
                                            }
                                          }
                                          ff.a(200, 24);
                                          if (var9 == 0) {
                                            break L55;
                                          } else {
                                            break L56;
                                          }
                                        }
                                      }
                                      ff.a(0, 61);
                                      break L55;
                                    } else {
                                      break L55;
                                    }
                                  }
                                  L58: {
                                    if (this.field_g.e(96)) {
                                      L59: {
                                        var6 = uk.field_S;
                                        if (-26 <= (var6 ^ -1)) {
                                          break L59;
                                        } else {
                                          L60: {
                                            var7 = var6 % 25;
                                            if (-1 != (var7 ^ -1)) {
                                              break L60;
                                            } else {
                                              var7 = 25;
                                              break L60;
                                            }
                                          }
                                          ff.a(var6 + -var7, -103);
                                          if (var9 == 0) {
                                            break L58;
                                          } else {
                                            break L59;
                                          }
                                        }
                                      }
                                      ff.a(0, -88);
                                      break L58;
                                    } else {
                                      break L58;
                                    }
                                  }
                                  if (!this.field_g.a(97)) {
                                    break L0;
                                  } else {
                                    L61: {
                                      L62: {
                                        var6 = uk.field_S;
                                        if ((var6 ^ -1) <= -176) {
                                          break L62;
                                        } else {
                                          var7 = var6 % 25;
                                          ff.a(-var7 + var6 + 25, -89);
                                          if (var9 == 0) {
                                            break L61;
                                          } else {
                                            break L62;
                                          }
                                        }
                                      }
                                      ff.a(200, -118);
                                      break L61;
                                    }
                                    if (var9 == 0) {
                                      break L0;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                if (this.field_g.c(-85)) {
                                  L63: {
                                    if (rn.field_f != null) {
                                      break L63;
                                    } else {
                                      var6 = param1 ? 1 : 0;
                                      bd.field_f = false;
                                      lp.a((byte) -60, var6 != 0);
                                      if (var9 == 0) {
                                        break L0;
                                      } else {
                                        break L63;
                                      }
                                    }
                                  }
                                  rn.a(-69);
                                  if (var9 == 0) {
                                    break L0;
                                  } else {
                                    break L11;
                                  }
                                } else {
                                  break L0;
                                }
                              }
                              if (this.field_g.c(-85)) {
                                L64: {
                                  if (2 == this.field_d) {
                                    break L64;
                                  } else {
                                    break L64;
                                  }
                                }
                                this.a(param1, 200);
                                if (var9 == 0) {
                                  break L0;
                                } else {
                                  break L10;
                                }
                              } else {
                                break L0;
                              }
                            }
                            if (!this.field_g.c(-85)) {
                              break L0;
                            } else {
                              mj.field_Hb[pl.field_I].field_j[param2] = 49;
                              sd.field_F = 0;
                              if (var9 == 0) {
                                break L0;
                              } else {
                                break L9;
                              }
                            }
                          }
                          if (this.field_g.c(-85)) {
                            mj.field_Hb[pl.field_I].field_j[param2] = 48;
                            sd.field_F = 1;
                            if (var9 == 0) {
                              break L0;
                            } else {
                              break L8;
                            }
                          } else {
                            break L0;
                          }
                        }
                        if (this.field_g.c(-85)) {
                          L65: {
                            L66: {
                              if (this.field_d == 5) {
                                break L66;
                              } else {
                                if (-4 != (this.field_d ^ -1)) {
                                  break L65;
                                } else {
                                  break L66;
                                }
                              }
                            }
                            rj.a(this.field_d, (byte) 101, af.field_a);
                            if (var9 == 0) {
                              break L0;
                            } else {
                              break L65;
                            }
                          }
                          if (this.field_d != 7) {
                            break L0;
                          } else {
                            rj.a(6, (byte) 125, af.field_a);
                            if (var9 == 0) {
                              break L0;
                            } else {
                              break L7;
                            }
                          }
                        } else {
                          break L0;
                        }
                      }
                      if (!this.field_g.c(-85)) {
                        break L0;
                      } else {
                        if (!this.c(param2, 16777215)) {
                          break L0;
                        } else {
                          ((ol) ((Object) mj.field_Hb[4])).a(param1, (byte) -119);
                          if (var9 == 0) {
                            break L0;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    if (!this.field_g.c(-85)) {
                      break L0;
                    } else {
                      if (!this.c(param2, 16777215)) {
                        break L0;
                      } else {
                        ((ol) ((Object) mj.field_Hb[4])).b(1, param1);
                        if (var9 == 0) {
                          break L0;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  if (!this.field_g.c(-85)) {
                    break L0;
                  } else {
                    L67: {
                      if (rn.field_f == null) {
                        break L67;
                      } else {
                        rn.a(-128);
                        break L67;
                      }
                    }
                    cq.a(jl.b(0), false);
                    if (var9 == 0) {
                      break L0;
                    } else {
                      break L4;
                    }
                  }
                }
                L68: {
                  if (!this.field_g.a((byte) -106)) {
                    break L68;
                  } else {
                    ll.field_k.field_k = ll.field_k.field_k - 1;
                    break L68;
                  }
                }
                L69: {
                  if (!this.field_g.b((byte) -66)) {
                    break L69;
                  } else {
                    ll.field_k.field_k = ll.field_k.field_k + 1;
                    break L69;
                  }
                }
                L70: {
                  if (0 > ll.field_k.field_k) {
                    ll.field_k.field_k = 2;
                    break L70;
                  } else {
                    break L70;
                  }
                }
                if (2 < ll.field_k.field_k) {
                  ll.field_k.field_k = 0;
                  if (var9 == 0) {
                    break L0;
                  } else {
                    break L3;
                  }
                } else {
                  break L0;
                }
              }
              if (this.field_g.c(-85)) {
                oq.c((byte) 127);
                we.field_g[34] = df.a(-128);
                ll.field_k.field_i = ll.field_k.field_i ^ 2;
                th.b((byte) -61);
                if (var9 == 0) {
                  break L0;
                } else {
                  break L2;
                }
              } else {
                break L0;
              }
            }
            if (this.field_g.c(-85)) {
              ll.field_k.e(-110);
              th.b((byte) -61);
              if (var9 == 0) {
                break L0;
              } else {
                break L1;
              }
            } else {
              break L0;
            }
          }
          if (!this.field_g.c(-85)) {
            break L0;
          } else {
            this.b((byte) 69);
            this.a(param1, 200);
            break L0;
          }
        }
        L71: {
          if (param0 < -64) {
            break L71;
          } else {
            this.a(-94);
            break L71;
          }
        }
    }

    private final void b(int param0, int param1) {
        we discarded$2 = null;
        L0: {
          if (param0 == 12) {
            break L0;
          } else {
            this.field_a = 104;
            break L0;
          }
        }
        if (-1 >= (param1 ^ -1)) {
          if (this.field_j.length <= param1) {
            return;
          } else {
            L1: {
              param1 = this.field_j[param1];
              if ((param1 ^ -1) > -1) {
                break L1;
              } else {
                if (12 == param1) {
                  break L1;
                } else {
                  if ((param1 ^ -1) == -14) {
                    break L1;
                  } else {
                    if (this.field_g.c(-85)) {
                      discarded$2 = ib.a((byte) 112, ei.field_a[68]);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    int d(int param0, int param1) {
        ug var4 = null;
        L0: {
          if (param0 <= -65) {
            break L0;
          } else {
            var4 = (ug) null;
            nc.a(true, -108, -32, (ug) null);
            break L0;
          }
        }
        if (!this.field_f) {
          return this.a((byte) -118, param1) + this.field_k;
        } else {
          return this.field_a;
        }
    }

    final static void a(int param0, boolean param1) {
        tm.a(param1, false);
        br.a(param1, 2);
        int var2 = 31 % ((param0 - -57) / 56);
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        boolean stackOut_5_0 = false;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        var4 = 0;
        L0: while (true) {
          if (var4 < this.field_j.length) {
            var5 = this.a(var4, 23697);
            stackOut_5_0 = this.c(var4, 16777215);
            stackIn_9_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (var6 == 0) {
              L1: {
                if (!stackIn_9_0) {
                  break L1;
                } else {
                  if (this.a((byte) -118, var4) > param2) {
                    break L1;
                  } else {
                    if (this.d(param0 ^ 5912, var4) <= param2) {
                      break L1;
                    } else {
                      if (var5 > param1) {
                        break L1;
                      } else {
                        if (param1 < var5 - -this.b((byte) 68, var4)) {
                          return var4;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
              var4++;
              continue L0;
            } else {
              L2: {
                if ((stackIn_6_0 ? 1 : 0) == -6003) {
                  break L2;
                } else {
                  this.a(13);
                  break L2;
                }
              }
              return -1;
            }
          } else {
            L3: {
              if (param0 == -6003) {
                break L3;
              } else {
                this.a(13);
                break L3;
              }
            }
            return -1;
          }
        }
    }

    private final int b(byte param0, int param1) {
        if ((param1 ^ -1) == (param1 ^ -1)) {
        }
        if (param0 != 68) {
            this.a(-84, -17, true);
        }
        return 38;
    }

    void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        Object stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        Object stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_35_2 = 0;
        int stackIn_42_0 = 0;
        Object stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        Object stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        Object stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        int stackIn_54_2 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        Object stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        Object stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        int stackOut_53_2 = 0;
        Object stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        int stackOut_52_2 = 0;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        Object stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        int stackOut_34_2 = 0;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_33_2 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (6 != (this.field_d ^ -1)) {
          if (-12 != (this.field_d ^ -1)) {
            L0: {
              if (this.field_d != 7) {
                break L0;
              } else {
                nn.a(false);
                var2 = 100 - -ah.field_e.field_C;
                var3 = 4 + ah.field_e.field_r + ah.field_e.field_J;
                var4 = 16777215;
                pb.field_e.b(af.field_a, 320, var2, var4, -1);
                pb.field_e.b(jm.a(vh.field_Mb, false, 118, gg.field_k), 320, var3 + var2, var4, -1);
                pb.field_e.b(on.a(true, gg.field_k, vh.field_Mb, false), 320, var2 + (3 * var3 - -38), var4, -1);
                pb.field_e.b(op.a(vh.field_Mb, gg.field_k, 4, false), 320, 76 + (var2 + var3 * 4), var4, -1);
                if (var5 != 0) {
                  break L0;
                } else {
                  L1: {
                    if (param0) {
                      break L1;
                    } else {
                      this.a(-45);
                      break L1;
                    }
                  }
                  var6 = 0;
                  var2 = var6;
                  L2: while (true) {
                    L3: {
                      if (var6 >= this.field_g.field_c) {
                        break L3;
                      } else {
                        if (var5 != 0) {
                          break L3;
                        } else {
                          L4: {
                            L5: {
                              if (this.c(var6, 16777215)) {
                                break L5;
                              } else {
                                if (-22 == (this.field_j[var6] ^ -1)) {
                                  break L5;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            L6: {
                              stackOut_14_0 = this;
                              stackOut_14_1 = var6;
                              stackIn_16_0 = stackOut_14_0;
                              stackIn_16_1 = stackOut_14_1;
                              stackIn_15_0 = stackOut_14_0;
                              stackIn_15_1 = stackOut_14_1;
                              if (var6 != this.field_g.field_d) {
                                stackOut_16_0 = this;
                                stackOut_16_1 = stackIn_16_1;
                                stackOut_16_2 = 0;
                                stackIn_17_0 = stackOut_16_0;
                                stackIn_17_1 = stackOut_16_1;
                                stackIn_17_2 = stackOut_16_2;
                                break L6;
                              } else {
                                stackOut_15_0 = this;
                                stackOut_15_1 = stackIn_15_1;
                                stackOut_15_2 = 1;
                                stackIn_17_0 = stackOut_15_0;
                                stackIn_17_1 = stackOut_15_1;
                                stackIn_17_2 = stackOut_15_2;
                                break L6;
                              }
                            }
                            this.a(stackIn_17_1, stackIn_17_2 != 0, (byte) -81);
                            break L4;
                          }
                          var6++;
                          if (var5 == 0) {
                            continue L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    return;
                  }
                }
              }
            }
            if (-9 != (this.field_d ^ -1)) {
              if (2 == this.field_d) {
                L7: {
                  wp.field_h.b(true, 1);
                  oo.f(0, 0, 640, 480);
                  if (param0) {
                    stackOut_41_0 = 0;
                    stackIn_42_0 = stackOut_41_0;
                    break L7;
                  } else {
                    stackOut_40_0 = 1;
                    stackIn_42_0 = stackOut_40_0;
                    break L7;
                  }
                }
                nn.a(stackIn_42_0 != 0);
                if (var5 != 0) {
                  ok.a(true);
                  return;
                } else {
                  L8: {
                    if (param0) {
                      break L8;
                    } else {
                      this.a(-45);
                      break L8;
                    }
                  }
                  var6 = 0;
                  var2 = var6;
                  L9: while (true) {
                    L10: {
                      if (var6 >= this.field_g.field_c) {
                        break L10;
                      } else {
                        if (var5 != 0) {
                          break L10;
                        } else {
                          L11: {
                            L12: {
                              if (this.c(var6, 16777215)) {
                                break L12;
                              } else {
                                if (-22 == (this.field_j[var6] ^ -1)) {
                                  break L12;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            L13: {
                              stackOut_51_0 = this;
                              stackOut_51_1 = var6;
                              stackIn_53_0 = stackOut_51_0;
                              stackIn_53_1 = stackOut_51_1;
                              stackIn_52_0 = stackOut_51_0;
                              stackIn_52_1 = stackOut_51_1;
                              if (var6 != this.field_g.field_d) {
                                stackOut_53_0 = this;
                                stackOut_53_1 = stackIn_53_1;
                                stackOut_53_2 = 0;
                                stackIn_54_0 = stackOut_53_0;
                                stackIn_54_1 = stackOut_53_1;
                                stackIn_54_2 = stackOut_53_2;
                                break L13;
                              } else {
                                stackOut_52_0 = this;
                                stackOut_52_1 = stackIn_52_1;
                                stackOut_52_2 = 1;
                                stackIn_54_0 = stackOut_52_0;
                                stackIn_54_1 = stackOut_52_1;
                                stackIn_54_2 = stackOut_52_2;
                                break L13;
                              }
                            }
                            this.a(stackIn_54_1, stackIn_54_2 != 0, (byte) -81);
                            break L11;
                          }
                          var6++;
                          continue L9;
                        }
                      }
                    }
                    return;
                  }
                }
              } else {
                L14: {
                  if (param0) {
                    break L14;
                  } else {
                    this.a(-45);
                    break L14;
                  }
                }
                var6 = 0;
                var2 = var6;
                L15: while (true) {
                  L16: {
                    if (var6 >= this.field_g.field_c) {
                      break L16;
                    } else {
                      if (var5 != 0) {
                        break L16;
                      } else {
                        L17: {
                          L18: {
                            if (this.c(var6, 16777215)) {
                              break L18;
                            } else {
                              if (-22 == (this.field_j[var6] ^ -1)) {
                                break L18;
                              } else {
                                break L17;
                              }
                            }
                          }
                          L19: {
                            stackOut_32_0 = this;
                            stackOut_32_1 = var6;
                            stackIn_34_0 = stackOut_32_0;
                            stackIn_34_1 = stackOut_32_1;
                            stackIn_33_0 = stackOut_32_0;
                            stackIn_33_1 = stackOut_32_1;
                            if (var6 != this.field_g.field_d) {
                              stackOut_34_0 = this;
                              stackOut_34_1 = stackIn_34_1;
                              stackOut_34_2 = 0;
                              stackIn_35_0 = stackOut_34_0;
                              stackIn_35_1 = stackOut_34_1;
                              stackIn_35_2 = stackOut_34_2;
                              break L19;
                            } else {
                              stackOut_33_0 = this;
                              stackOut_33_1 = stackIn_33_1;
                              stackOut_33_2 = 1;
                              stackIn_35_0 = stackOut_33_0;
                              stackIn_35_1 = stackOut_33_1;
                              stackIn_35_2 = stackOut_33_2;
                              break L19;
                            }
                          }
                          this.a(stackIn_35_1, stackIn_35_2 != 0, (byte) -81);
                          break L17;
                        }
                        var6++;
                        if (var5 == 0) {
                          continue L15;
                        } else {
                          break L16;
                        }
                      }
                    }
                  }
                  return;
                }
              }
            } else {
              ok.a(true);
              return;
            }
          } else {
            return;
          }
        } else {
          wp.field_h.b(true, 1);
          return;
        }
    }

    void c(boolean param0) {
        L0: {
          if (!param0) {
            break L0;
          } else {
            this.field_d = 39;
            break L0;
          }
        }
        L1: {
          L2: {
            if (!this.field_f) {
              break L2;
            } else {
              this.field_g.d(99);
              if (!ZombieDawnMulti.field_E) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          this.field_g.a(0, false);
          break L1;
        }
        if (0 > this.field_g.field_d) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var4 = 2 * param1;
          if (param1 >= 128) {
            stackOut_2_0 = -256 + 2 * param1;
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
          if (param2) {
            var6 = var4;
            var4 = var5;
            var5 = var6;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var6 = this.field_d;
          if (param0 <= -104) {
            break L2;
          } else {
            this.b(81);
            break L2;
          }
        }
        L3: {
          if ((var6 ^ -1) != -3) {
            break L3;
          } else {
            var6 = -7;
            break L3;
          }
        }
        L4: {
          if (-2 == var6) {
            var6 = 2;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          fn.field_e.a();
          if (11 == var6) {
            var6 = 1;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          L7: {
            if ((var6 ^ -1) == 6) {
              break L7;
            } else {
              mj.field_Hb[var6].b(0);
              if (!ZombieDawnMulti.field_E) {
                break L6;
              } else {
                break L7;
              }
            }
          }
          wp.field_h.b(true, 1);
          oo.f(0, 0, 640, 480);
          fn.field_e.h();
          break L6;
        }
        dl.field_h.b((byte) 99);
        fn.field_e.a(0, 0, var4, var5);
    }

    void b(byte param0) {
        if (param0 != 69) {
            this.field_k = 57;
        }
    }

    int a(int param0, int param1) {
        ug var4 = null;
        L0: {
          if (param1 == 23697) {
            break L0;
          } else {
            var4 = (ug) null;
            nc.a(true, 65, 23, (ug) null);
            break L0;
          }
        }
        if (this.field_f) {
          return this.field_b - -(param0 * this.field_k);
        } else {
          return this.field_b;
        }
    }

    void a(int param0, boolean param1, int param2) {
        if (!((this.field_g.field_d ^ -1) == param0)) {
            param2 = this.field_g.field_d;
        }
        this.field_g.a(param2, param1, -31458, this.a(param0 + -6003, bo.field_d, bd.field_g));
        if ((this.field_d ^ -1) == -9) {
            fc.a((byte) 124, param1);
        }
    }

    final static void a(boolean param0, int param1, int param2, ug param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object var5 = null;
        Throwable var6 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if (ra.field_m != null) {
                fq.a(param0, 1048576, param3, 124, param1);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var4_int = -64 % ((param2 - 42) / 38);
              if (wd.field_L != null) {
                var5 = rm.field_b;
                synchronized (var5) {
                  L3: {
                    wd.field_L.a(param1, -1, false);
                    if (param3 == bb.field_g) {
                      return;
                    } else {
                      L4: {
                        wd.field_L.g(2);
                        rm.field_b.e();
                        bb.field_g = param3;
                        if (bb.field_g != null) {
                          wd.field_L.a(bb.field_g, param0, 8361407);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      break L3;
                    }
                  }
                }
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var4);
            stackOut_18_1 = new StringBuilder().append("nc.RA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
    }

    void a(int param0) {
        uj discarded$1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_9_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_23_0 = 0;
        qd stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        qd stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        qd stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        boolean stackIn_34_0 = false;
        int stackIn_65_0 = 0;
        int stackIn_72_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        qd stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        qd stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        qd stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        boolean stackOut_33_0 = false;
        int stackOut_64_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_70_0 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = this.field_g.field_d;
        if ((this.field_d ^ -1) != -12) {
          L0: {
            L1: {
              if (this.field_d == -7) {
                break L1;
              } else {
                if (2 == this.field_d) {
                  break L1;
                } else {
                  if (this.field_d == 8) {
                    L2: {
                      if (cq.a(15000)) {
                        stackOut_8_0 = 0;
                        stackIn_9_0 = stackOut_8_0;
                        break L2;
                      } else {
                        stackOut_7_0 = 1;
                        stackIn_9_0 = stackOut_7_0;
                        break L2;
                      }
                    }
                    L3: {
                      var3 = ai.a(stackIn_9_0 != 0, (byte) 110);
                      if (-4 != (var3 ^ -1)) {
                        break L3;
                      } else {
                        L4: {
                          if (rn.field_f == null) {
                            break L4;
                          } else {
                            rn.a(-36);
                            break L4;
                          }
                        }
                        uq.a(param0 + 3, jl.b(0));
                        break L3;
                      }
                    }
                    L5: {
                      if ((var3 ^ -1) != -2) {
                        break L5;
                      } else {
                        L6: {
                          if (ec.field_c) {
                            stackOut_16_0 = 15;
                            stackIn_17_0 = stackOut_16_0;
                            break L6;
                          } else {
                            stackOut_15_0 = 1;
                            stackIn_17_0 = stackOut_15_0;
                            break L6;
                          }
                        }
                        var4 = stackIn_17_0;
                        bm.a(false, var4, param0 ^ 127, sp.field_g);
                        break L5;
                      }
                    }
                    if (-3 == (var3 ^ -1)) {
                      L7: {
                        if (!ec.field_c) {
                          stackOut_22_0 = 1;
                          stackIn_23_0 = stackOut_22_0;
                          break L7;
                        } else {
                          stackOut_21_0 = 15;
                          stackIn_23_0 = stackOut_21_0;
                          break L7;
                        }
                      }
                      var4 = stackIn_23_0;
                      bm.a(true, var4, 126, sp.field_g);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    break L0;
                  }
                }
              }
            }
            L8: {
              stackOut_25_0 = wp.field_h;
              stackOut_25_1 = 122;
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              if (-3 == (this.field_d ^ -1)) {
                stackOut_27_0 = (qd) ((Object) stackIn_27_0);
                stackOut_27_1 = stackIn_27_1;
                stackOut_27_2 = 0;
                stackIn_28_0 = stackOut_27_0;
                stackIn_28_1 = stackOut_27_1;
                stackIn_28_2 = stackOut_27_2;
                break L8;
              } else {
                stackOut_26_0 = (qd) ((Object) stackIn_26_0);
                stackOut_26_1 = stackIn_26_1;
                stackOut_26_2 = 1;
                stackIn_28_0 = stackOut_26_0;
                stackIn_28_1 = stackOut_26_1;
                stackIn_28_2 = stackOut_26_2;
                break L8;
              }
            }
            ((qd) (Object) stackIn_28_0).a((byte) stackIn_28_1, stackIn_28_2 != 0);
            if (-7 == this.field_d) {
              return;
            } else {
              break L0;
            }
          }
          L9: while (true) {
            L10: {
              L11: {
                if (!ba.c(-1)) {
                  break L11;
                } else {
                  stackOut_33_0 = am.a(param0 ^ -118);
                  stackIn_65_0 = stackOut_33_0 ? 1 : 0;
                  stackIn_34_0 = stackOut_33_0;
                  if (var5 != 0) {
                    break L10;
                  } else {
                    L12: {
                      if (stackIn_34_0) {
                        L13: {
                          if (!iq.field_f) {
                            break L13;
                          } else {
                            L14: {
                              L15: {
                                if (!re.field_b) {
                                  break L15;
                                } else {
                                  if (!hh.field_b) {
                                    break L15;
                                  } else {
                                    if (va.a((byte) -59, 13, 15, 12)) {
                                      continue L9;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                              }
                              if (w.a(13, 15, 12, 18663)) {
                                continue L9;
                              } else {
                                break L14;
                              }
                            }
                            L16: {
                              if (13 == sj.field_p) {
                                break L16;
                              } else {
                                if (sj.field_p == 80) {
                                  break L16;
                                } else {
                                  continue L9;
                                }
                              }
                            }
                            iq.field_f = false;
                            if (var5 == 0) {
                              continue L9;
                            } else {
                              break L13;
                            }
                          }
                        }
                        if (sj.field_p != 80) {
                          break L12;
                        } else {
                          iq.field_f = true;
                          if (var5 == 0) {
                            continue L9;
                          } else {
                            break L12;
                          }
                        }
                      } else {
                        break L12;
                      }
                    }
                    L17: {
                      if ((sj.field_p ^ -1) == -14) {
                        break L17;
                      } else {
                        this.c(false);
                        if (-1 == this.field_g.field_d) {
                          continue L9;
                        } else {
                          this.b(param0 + 12, this.field_g.field_d);
                          this.b(-96, false, this.field_g.field_d);
                          if (var5 == 0) {
                            continue L9;
                          } else {
                            break L17;
                          }
                        }
                      }
                    }
                    L18: {
                      if (this.field_d == 2) {
                        break L18;
                      } else {
                        if (-11 != (this.field_d ^ -1)) {
                          if ((this.field_d ^ -1) != -8) {
                            if ((this.field_d ^ -1) != -2) {
                              L19: {
                                if (this.field_d != 15) {
                                  break L19;
                                } else {
                                  bm.a(false, 1, param0 ^ 125, sp.field_g);
                                  if (var5 == 0) {
                                    continue L9;
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                              var3 = vd.field_d;
                              bm.a(false, var3, param0 + 125, sp.field_g);
                              if (var5 == 0) {
                                continue L9;
                              } else {
                                break L18;
                              }
                            } else {
                              continue L9;
                            }
                          } else {
                            continue L9;
                          }
                        } else {
                          continue L9;
                        }
                      }
                    }
                    bm.a(false, -7, param0 ^ 126, sp.field_g);
                    vd.field_d = 1;
                    if (var5 == 0) {
                      continue L9;
                    } else {
                      break L11;
                    }
                  }
                }
              }
              stackOut_64_0 = 1;
              stackIn_65_0 = stackOut_64_0;
              break L10;
            }
            L20: {
              var3 = stackIn_65_0;
              if (!am.a(param0 ^ -112)) {
                break L20;
              } else {
                if (fb.field_e == null) {
                  break L20;
                } else {
                  if (!df.field_I) {
                    L21: {
                      if (fb.field_e.a(true, 15978)) {
                        stackOut_71_0 = 0;
                        stackIn_72_0 = stackOut_71_0;
                        break L21;
                      } else {
                        stackOut_70_0 = 1;
                        stackIn_72_0 = stackOut_70_0;
                        break L21;
                      }
                    }
                    var3 = stackIn_72_0;
                    if (!re.field_b) {
                      break L20;
                    } else {
                      w.a(320, 180, true, 81);
                      break L20;
                    }
                  } else {
                    break L20;
                  }
                }
              }
            }
            L22: {
              L23: {
                if (param0 != (this.a(-6003, bo.field_d, bd.field_g) ^ -1)) {
                  break L23;
                } else {
                  en.a(-1, 4);
                  if (var5 == 0) {
                    break L22;
                  } else {
                    break L23;
                  }
                }
              }
              en.a(-1, 1);
              break L22;
            }
            L24: {
              if (var3 == 0) {
                break L24;
              } else {
                L25: {
                  this.field_g.a(this.a(-6003, bo.field_d, bd.field_g), 42, this.a(-6003, ka.field_t, vb.field_f));
                  if (this.field_g.field_d == -1) {
                    break L25;
                  } else {
                    this.b(12, this.field_g.field_d);
                    this.b(-74, true, this.field_g.field_d);
                    break L25;
                  }
                }
                if (this.field_g.field_d == var2) {
                  break L24;
                } else {
                  if (0 != (this.field_g.field_d ^ -1)) {
                    discarded$1 = nm.b(-128, 69);
                    break L24;
                  } else {
                    break L24;
                  }
                }
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    private final void a(int param0, boolean param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12_ref_String = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int stackIn_18_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_64_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_62_0 = 0;
        var17 = ZombieDawnMulti.field_E ? 1 : 0;
        var4 = this.a(param0, 23697);
        var5 = this.a((byte) -118, param0);
        var6 = this.field_j[param0];
        if (var6 != 22) {
          L0: {
            if ((var6 ^ -1) == -24) {
              break L0;
            } else {
              if (-25 == (var6 ^ -1)) {
                break L0;
              } else {
                if (-26 == (var6 ^ -1)) {
                  break L0;
                } else {
                  if ((var6 ^ -1) == -28) {
                    break L0;
                  } else {
                    if (var6 == 28) {
                      break L0;
                    } else {
                      if (var6 == 29) {
                        break L0;
                      } else {
                        if (var6 == 30) {
                          break L0;
                        } else {
                          if (var6 == 31) {
                            break L0;
                          } else {
                            if (32 == var6) {
                              break L0;
                            } else {
                              if (-34 == (var6 ^ -1)) {
                                break L0;
                              } else {
                                if (-27 == (var6 ^ -1)) {
                                  break L0;
                                } else {
                                  L1: {
                                    var7 = we.field_g[var6];
                                    var8 = -var5 + this.d(-69, param0);
                                    var9 = this.b((byte) 68, param0);
                                    if (param1) {
                                      stackOut_17_0 = 1;
                                      stackIn_18_0 = stackOut_17_0;
                                      break L1;
                                    } else {
                                      stackOut_16_0 = 10;
                                      stackIn_18_0 = stackOut_16_0;
                                      break L1;
                                    }
                                  }
                                  L2: {
                                    var10 = stackIn_18_0;
                                    if (4 != var6) {
                                      break L2;
                                    } else {
                                      if (rn.field_f != null) {
                                        break L2;
                                      } else {
                                        L3: {
                                          if (0 >= vl.field_h) {
                                            break L3;
                                          } else {
                                            if (pn.a(-9, pl.field_J)) {
                                              break L2;
                                            } else {
                                              break L3;
                                            }
                                          }
                                        }
                                        L4: {
                                          if (param1) {
                                            stackOut_25_0 = 7;
                                            stackIn_26_0 = stackOut_25_0;
                                            break L4;
                                          } else {
                                            stackOut_24_0 = 6;
                                            stackIn_26_0 = stackOut_24_0;
                                            break L4;
                                          }
                                        }
                                        var10 = stackIn_26_0;
                                        break L2;
                                      }
                                    }
                                  }
                                  L5: {
                                    if (-41 != (var6 ^ -1)) {
                                      break L5;
                                    } else {
                                      if (!wc.j(127)) {
                                        break L5;
                                      } else {
                                        L6: {
                                          if (!param1) {
                                            stackOut_31_0 = 6;
                                            stackIn_32_0 = stackOut_31_0;
                                            break L6;
                                          } else {
                                            stackOut_30_0 = 7;
                                            stackIn_32_0 = stackOut_30_0;
                                            break L6;
                                          }
                                        }
                                        var10 = stackIn_32_0;
                                        break L5;
                                      }
                                    }
                                  }
                                  L7: {
                                    if (null != fb.field_e) {
                                      stackOut_35_0 = fb.field_e.g(-127);
                                      stackIn_36_0 = stackOut_35_0;
                                      break L7;
                                    } else {
                                      stackOut_34_0 = 0;
                                      stackIn_36_0 = stackOut_34_0;
                                      break L7;
                                    }
                                  }
                                  L8: {
                                    L9: {
                                      var11 = stackIn_36_0;
                                      if (var7 != null) {
                                        break L9;
                                      } else {
                                        var7 = "ERROR: missing text";
                                        if (var17 == 0) {
                                          break L8;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    L10: {
                                      if (var6 == 20) {
                                        break L10;
                                      } else {
                                        if (var6 == 21) {
                                          var7 = vl.a(var7, new String[]{Integer.toString(var11)}, 2);
                                          if (-1 != (var11 ^ -1)) {
                                            break L8;
                                          } else {
                                            var10 = 6;
                                            if (var17 == 0) {
                                              break L8;
                                            } else {
                                              break L10;
                                            }
                                          }
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                    var7 = vl.a(var7, new String[]{Integer.toString(var11)}, 2);
                                    var12_ref_String = var7;
                                    var12_ref_String = var7;
                                    break L8;
                                  }
                                  L11: {
                                    if ((var6 ^ -1) == -51) {
                                      L12: {
                                        L13: {
                                          if ((ll.field_k.field_k ^ -1) != -2) {
                                            break L13;
                                          } else {
                                            var12_ref_String = da.field_f;
                                            if (var17 == 0) {
                                              break L12;
                                            } else {
                                              break L13;
                                            }
                                          }
                                        }
                                        L14: {
                                          if (-1 == (ll.field_k.field_k ^ -1)) {
                                            break L14;
                                          } else {
                                            var12_ref_String = jp.field_a;
                                            if (var17 == 0) {
                                              break L12;
                                            } else {
                                              break L14;
                                            }
                                          }
                                        }
                                        var12_ref_String = jm.field_l;
                                        break L12;
                                      }
                                      var7 = var7 + var12_ref_String;
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  }
                                  L15: {
                                    if (param2 <= -32) {
                                      break L15;
                                    } else {
                                      this.field_f = false;
                                      break L15;
                                    }
                                  }
                                  L16: {
                                    L17: {
                                      var12 = -ah.field_e.field_r + (-ZombieDawnMulti.field_I[0].field_u + var9) + (-ZombieDawnMulti.field_I[6].field_u + -ah.field_e.field_C);
                                      if (-13 == (var6 ^ -1)) {
                                        break L17;
                                      } else {
                                        if (13 == var6) {
                                          break L17;
                                        } else {
                                          ah.field_e.b(var7, var5 + (var8 >> -160418751), ZombieDawnMulti.field_I[0].field_u + var4 - -ah.field_e.field_C + (var12 >> -1038888159), var10, 0);
                                          if (var17 == 0) {
                                            break L16;
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                    }
                                    L18: {
                                      if (-13 != (var6 ^ -1)) {
                                        stackOut_60_0 = 200;
                                        stackIn_61_0 = stackOut_60_0;
                                        break L18;
                                      } else {
                                        stackOut_59_0 = 224;
                                        stackIn_61_0 = stackOut_59_0;
                                        break L18;
                                      }
                                    }
                                    L19: {
                                      var13 = stackIn_61_0;
                                      var14 = 137 + ok.field_l;
                                      var15 = var5 - -(-var14 + var8 >> 903453857);
                                      ah.field_e.c(var7, var15, (var12 >> 1755571617) + ah.field_e.field_C + var4 + ZombieDawnMulti.field_I[0].field_u, var10, 0);
                                      var15 = var15 + (8 + ok.field_l);
                                      oo.a(var15, var9 / 2 + var4 - 1, 129, 2, var10);
                                      if (12 != var6) {
                                        stackOut_63_0 = uk.field_S;
                                        stackIn_64_0 = stackOut_63_0;
                                        break L19;
                                      } else {
                                        stackOut_62_0 = db.field_c;
                                        stackIn_64_0 = stackOut_62_0;
                                        break L19;
                                      }
                                    }
                                    var16 = stackIn_64_0;
                                    var16 = (var16 << -1915660504) / var13;
                                    lm.field_eb.g((var16 >> 2027224065) + (var15 + -1), var4);
                                    break L16;
                                  }
                                  return;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
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

    nc(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        try {
            this.field_k = param5;
            this.field_d = param0;
            this.field_a = param3;
            this.field_j = param6;
            this.field_f = param1 ? true : false;
            this.field_b = param4;
            this.field_i = param2;
            this.field_g = new hh(this.field_j.length);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "nc.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "Send private message";
    }
}
