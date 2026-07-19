/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl {
    static int field_i;
    static String field_d;
    static int[][] field_e;
    private int field_a;
    private boolean field_b;
    private int field_j;
    int field_h;
    private int field_g;
    int field_k;
    static int[] field_c;
    private int field_f;

    final void b(byte param0) {
        L0: {
          this.field_j = 0;
          this.field_a = 0;
          if (-1 != (this.field_f ^ -1)) {
            break L0;
          } else {
            if ((rs.field_q ^ -1) == -99) {
              L1: {
                if ((this.field_h ^ -1) >= -1) {
                  this.field_h = this.field_k;
                  break L1;
                } else {
                  break L1;
                }
              }
              this.field_h = this.field_h - 1;
              this.field_b = false;
              break L0;
            } else {
              if (param0 == -120) {
                L2: {
                  if (0 == this.field_f) {
                    this.field_j = rs.field_q;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (this.field_f == 0) {
                  if (rs.field_q == 99) {
                    this.field_h = this.field_h + 1;
                    if (this.field_h < this.field_k) {
                      this.field_b = false;
                      return;
                    } else {
                      this.field_h = 0;
                      this.field_b = false;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
        if (param0 == -120) {
          L3: {
            if (0 == this.field_f) {
              this.field_j = rs.field_q;
              break L3;
            } else {
              break L3;
            }
          }
          if (this.field_f == 0) {
            if (rs.field_q == 99) {
              this.field_h = this.field_h + 1;
              if (this.field_h < this.field_k) {
                this.field_b = false;
                return;
              } else {
                this.field_h = 0;
                this.field_b = false;
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final boolean b(int param0) {
        if (param0 != 96) {
            return true;
        }
        return -104 == (this.field_j ^ -1) ? true : false;
    }

    final boolean a(boolean param0) {
        if (param0) {
            return false;
        }
        return this.field_f != 0 ? true : false;
    }

    final boolean d(byte param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 >= 35) {
          if (0 == this.field_a) {
            if ((this.field_j ^ -1) != -85) {
              if ((this.field_j ^ -1) == -84) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          this.field_a = -104;
          if (0 == this.field_a) {
            if ((this.field_j ^ -1) == -85) {
              return true;
            } else {
              L0: {
                if ((this.field_j ^ -1) != -84) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L0;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        }
    }

    public static void c(byte param0) {
        field_e = (int[][]) null;
        field_c = null;
        int var1 = -45 / ((param0 - -26) / 46);
        field_d = null;
    }

    final void a(int param0, boolean param1) {
        boolean discarded$2 = false;
        L0: {
          if (this.field_f == 0) {
            this.field_b = false;
            this.field_h = param0;
            break L0;
          } else {
            break L0;
          }
        }
        if (param1) {
          discarded$2 = this.b(15);
          return;
        } else {
          return;
        }
    }

    final static void a(byte param0, boolean param1) {
        se.field_g.a(param1, true);
        if (param0 != 32) {
            field_c = (int[]) null;
        }
    }

    final boolean e(int param0) {
        int var2 = -105 % ((param0 - -19) / 60);
        return -103 == (this.field_j ^ -1) ? true : false;
    }

    final void a(int param0, byte param1) {
        int var3 = 0;
        this.field_j = 0;
        var3 = 61 % ((param1 - 78) / 48);
        this.field_a = 0;
        if (this.field_f != 0) {
          L0: {
            if (0 != this.field_f) {
              break L0;
            } else {
              if (rs.field_q == 96) {
                L1: {
                  if (-1 <= (this.field_h ^ -1)) {
                    this.field_h = this.field_k;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                this.field_h = this.field_h - 1;
                this.field_b = false;
                break L0;
              } else {
                L2: {
                  if (0 != this.field_f) {
                    break L2;
                  } else {
                    if ((rs.field_q ^ -1) == -98) {
                      this.field_h = this.field_h + 1;
                      this.field_b = false;
                      if (this.field_h >= this.field_k) {
                        this.field_h = 0;
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                }
                if (this.field_f == 0) {
                  if (rs.field_q == 98) {
                    this.field_b = false;
                    if (-1 >= (this.field_h ^ -1)) {
                      return;
                    } else {
                      this.field_h = param0;
                      return;
                    }
                  } else {
                    if (-100 != (rs.field_q ^ -1)) {
                      return;
                    } else {
                      L3: {
                        this.field_b = false;
                        if (-1 < (this.field_h ^ -1)) {
                          this.field_h = param0;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            }
          }
          L4: {
            if (0 != this.field_f) {
              break L4;
            } else {
              if ((rs.field_q ^ -1) == -98) {
                this.field_h = this.field_h + 1;
                this.field_b = false;
                if (this.field_h >= this.field_k) {
                  this.field_h = 0;
                  break L4;
                } else {
                  if (this.field_f == 0) {
                    if (rs.field_q == 98) {
                      this.field_b = false;
                      if (-1 < (this.field_h ^ -1)) {
                        this.field_h = param0;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (-100 == (rs.field_q ^ -1)) {
                        L5: {
                          this.field_b = false;
                          if (-1 < (this.field_h ^ -1)) {
                            this.field_h = param0;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                }
              } else {
                if (this.field_f == 0) {
                  if (rs.field_q == 98) {
                    this.field_b = false;
                    if (-1 >= (this.field_h ^ -1)) {
                      return;
                    } else {
                      this.field_h = param0;
                      return;
                    }
                  } else {
                    if (-100 == (rs.field_q ^ -1)) {
                      L6: {
                        this.field_b = false;
                        if (-1 < (this.field_h ^ -1)) {
                          this.field_h = param0;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            }
          }
          if (this.field_f == 0) {
            if (rs.field_q == 98) {
              this.field_b = false;
              if (-1 < (this.field_h ^ -1)) {
                this.field_h = param0;
                return;
              } else {
                return;
              }
            } else {
              if (-100 == (rs.field_q ^ -1)) {
                L7: {
                  this.field_b = false;
                  if (-1 < (this.field_h ^ -1)) {
                    this.field_h = param0;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                return;
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } else {
          this.field_j = rs.field_q;
          if (0 == this.field_f) {
            L8: {
              if (rs.field_q == 96) {
                L9: {
                  if (-1 <= (this.field_h ^ -1)) {
                    this.field_h = this.field_k;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                this.field_h = this.field_h - 1;
                this.field_b = false;
                break L8;
              } else {
                break L8;
              }
            }
            if (0 != this.field_f) {
              L10: {
                if (this.field_f != 0) {
                  break L10;
                } else {
                  L11: {
                    if (rs.field_q == 98) {
                      break L11;
                    } else {
                      if (-100 != (rs.field_q ^ -1)) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  this.field_b = false;
                  if (-1 < (this.field_h ^ -1)) {
                    this.field_h = param0;
                    break L10;
                  } else {
                    break L10;
                  }
                }
              }
              return;
            } else {
              L12: {
                if ((rs.field_q ^ -1) == -98) {
                  this.field_h = this.field_h + 1;
                  this.field_b = false;
                  if (this.field_h >= this.field_k) {
                    this.field_h = 0;
                    break L12;
                  } else {
                    break L12;
                  }
                } else {
                  break L12;
                }
              }
              L13: {
                if (this.field_f != 0) {
                  break L13;
                } else {
                  L14: {
                    if (rs.field_q == 98) {
                      break L14;
                    } else {
                      if (-100 != (rs.field_q ^ -1)) {
                        break L13;
                      } else {
                        break L14;
                      }
                    }
                  }
                  this.field_b = false;
                  if (-1 < (this.field_h ^ -1)) {
                    this.field_h = param0;
                    break L13;
                  } else {
                    break L13;
                  }
                }
              }
              return;
            }
          } else {
            L15: {
              if (0 != this.field_f) {
                break L15;
              } else {
                if ((rs.field_q ^ -1) == -98) {
                  this.field_h = this.field_h + 1;
                  this.field_b = false;
                  if (this.field_h >= this.field_k) {
                    this.field_h = 0;
                    break L15;
                  } else {
                    break L15;
                  }
                } else {
                  break L15;
                }
              }
            }
            L16: {
              if (this.field_f != 0) {
                break L16;
              } else {
                L17: {
                  if (rs.field_q == 98) {
                    break L17;
                  } else {
                    if (-100 != (rs.field_q ^ -1)) {
                      break L16;
                    } else {
                      break L17;
                    }
                  }
                }
                this.field_b = false;
                if (-1 < (this.field_h ^ -1)) {
                  this.field_h = param0;
                  break L16;
                } else {
                  break L16;
                }
              }
            }
            return;
          }
        }
    }

    final boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -98) {
          L0: {
            this.c(6);
            if ((this.field_j ^ -1) != -98) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((this.field_j ^ -1) != -98) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static boolean d(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_53_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == 95) {
          if (as.field_B) {
            if (im.field_w) {
              if (sh.field_h) {
                if (ve.field_b) {
                  if (!mv.field_b) {
                    L0: {
                      if (!nw.g(105)) {
                        stackOut_52_0 = 0;
                        stackIn_53_0 = stackOut_52_0;
                        break L0;
                      } else {
                        stackOut_51_0 = 1;
                        stackIn_53_0 = stackOut_51_0;
                        break L0;
                      }
                    }
                    return stackIn_53_0 != 0;
                  } else {
                    return true;
                  }
                } else {
                  if (nw.g(105)) {
                    return true;
                  } else {
                    return false;
                  }
                }
              } else {
                if (nw.g(105)) {
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              if (nw.g(105)) {
                return true;
              } else {
                return false;
              }
            }
          } else {
            if (nw.g(105)) {
              return true;
            } else {
              return false;
            }
          }
        } else {
          dl.f(46);
          if (as.field_B) {
            if (im.field_w) {
              if (sh.field_h) {
                if (ve.field_b) {
                  if (!mv.field_b) {
                    L1: {
                      if (!nw.g(105)) {
                        stackOut_25_0 = 0;
                        stackIn_26_0 = stackOut_25_0;
                        break L1;
                      } else {
                        stackOut_24_0 = 1;
                        stackIn_26_0 = stackOut_24_0;
                        break L1;
                      }
                    }
                    return stackIn_26_0 != 0;
                  } else {
                    return true;
                  }
                } else {
                  if (nw.g(105)) {
                    return true;
                  } else {
                    return false;
                  }
                }
              } else {
                if (nw.g(105)) {
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              L2: {
                if (!nw.g(105)) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              return stackIn_10_0 != 0;
            }
          } else {
            L3: {
              if (!nw.g(105)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L3;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L3;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final void c(int param0) {
        this.field_a = 0;
        this.field_j = 0;
        if (param0 == this.field_f) {
            this.field_j = rs.field_q;
        }
    }

    final boolean a(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 >= -48) {
          L0: {
            this.field_f = 73;
            if (96 != this.field_j) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (96 != this.field_j) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        boolean discarded$2 = false;
        boolean discarded$3 = false;
        RuntimeException var4 = null;
        int var4_int = 0;
        je var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        mo var9 = null;
        je stackIn_18_0 = null;
        je stackIn_25_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        je stackOut_17_0 = null;
        je stackOut_24_0 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (mj.field_c <= sj.field_d) {
                break L1;
              } else {
                sj.field_d = sj.field_d + 1;
                break L1;
              }
            }
            L2: {
              if (gb.field_y != so.field_b.field_g) {
                sh.field_l = sh.field_l + (-gb.field_y + so.field_b.field_g);
                gb.field_y = so.field_b.field_g;
                break L2;
              } else {
                break L2;
              }
            }
            if (sj.field_d <= 0) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L3: {
                vi.a(-68);
                ag.field_I.a(true, param3);
                if (aw.field_i == null) {
                  break L3;
                } else {
                  if (bb.field_a) {
                    discarded$2 = aw.field_i.a(param3, -6226, ag.field_I.field_V, ag.field_I.field_D);
                    break L3;
                  } else {
                    aw.field_i = null;
                    if (var7 == 0) {
                      break L3;
                    } else {
                      discarded$3 = aw.field_i.a(param3, -6226, ag.field_I.field_V, ag.field_I.field_D);
                      break L3;
                    }
                  }
                }
              }
              var4_int = param2;
              L4: while (true) {
                L5: {
                  L6: {
                    if ((var4_int ^ -1) <= -6) {
                      break L6;
                    } else {
                      var5 = gt.field_b[var4_int];
                      stackOut_17_0 = (je) (var5);
                      stackIn_25_0 = stackOut_17_0;
                      stackIn_18_0 = stackOut_17_0;
                      if (var7 != 0) {
                        break L5;
                      } else {
                        L7: {
                          if (stackIn_18_0 == null) {
                            break L7;
                          } else {
                            L8: {
                              if (0 != var5.field_yb) {
                                mq.a(var5, var4_int, false);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            var6 = kp.a(var4_int, -119);
                            we.field_g[var4_int].field_cb = dh.field_n[var6];
                            bp.field_j[var4_int].field_X = co.field_k[var6];
                            break L7;
                          }
                        }
                        var4_int++;
                        if (var7 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  stackOut_24_0 = mc.field_f;
                  stackIn_25_0 = stackOut_24_0;
                  break L5;
                }
                L9: {
                  if (stackIn_25_0.field_yb != 0) {
                    ik.field_b = new i(mc.field_f.field_V, mc.field_f.field_D, mc.field_f.field_gb, mc.field_f.field_ob, param0, jm.field_b, hr.field_m, uc.field_b, eq.field_h, hs.field_H, ms.field_k, (String) null, 0L);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  var9 = wm.a(jn.field_d, mi.field_l, (byte) 127, param1);
                  if (var9 != null) {
                    pg.a(0, var9);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  var8 = wd.a(false);
                  if (var8 != null) {
                    ad.field_I = var8;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var4), "dl.J(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param2 >= this.field_k) {
          throw new IllegalArgumentException();
        } else {
          if (param1 < this.field_k) {
            L0: {
              this.field_a = 0;
              this.field_j = 0;
              if (param0 != tr.field_A) {
                this.field_f = tr.field_A;
                this.field_a = tr.field_A;
                this.field_b = true;
                this.field_h = param1;
                this.field_g = eu.field_a;
                break L0;
              } else {
                break L0;
              }
            }
            if (this.field_f != 0) {
              if (0 != ro.field_ub) {
                L1: {
                  if (-1 <= (this.field_g ^ -1)) {
                    this.field_g = oj.field_k;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  this.field_g = this.field_g - 1;
                  if (tr.field_A != 0) {
                    break L2;
                  } else {
                    if (-1 != (ro.field_ub ^ -1)) {
                      break L2;
                    } else {
                      this.field_f = 0;
                      if (-1 == (this.field_f ^ -1)) {
                        if (this.field_b) {
                          L3: {
                            if (0 > param2) {
                              break L3;
                            } else {
                              if (param2 == this.field_h) {
                                this.field_b = true;
                                this.field_h = param2;
                                if (ArmiesOfGielinor.field_M) {
                                  break L3;
                                } else {
                                  return;
                                }
                              } else {
                                this.field_b = true;
                                this.field_h = param2;
                                if (ArmiesOfGielinor.field_M) {
                                  if (!this.field_b) {
                                    return;
                                  } else {
                                    this.field_h = -1;
                                    return;
                                  }
                                } else {
                                  return;
                                }
                              }
                            }
                          }
                          if (this.field_b) {
                            this.field_h = -1;
                            return;
                          } else {
                            return;
                          }
                        } else {
                          if (!lk.field_f) {
                            return;
                          } else {
                            L4: {
                              L5: {
                                if (0 > param2) {
                                  break L5;
                                } else {
                                  L6: {
                                    if (param2 == this.field_h) {
                                      break L6;
                                    } else {
                                      break L6;
                                    }
                                  }
                                  this.field_b = true;
                                  this.field_h = param2;
                                  if (!ArmiesOfGielinor.field_M) {
                                    break L4;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              if (!this.field_b) {
                                break L4;
                              } else {
                                this.field_h = -1;
                                break L4;
                              }
                            }
                            return;
                          }
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
                if (-1 == (this.field_f ^ -1)) {
                  L7: {
                    if (this.field_b) {
                      L8: {
                        if (0 > param2) {
                          break L8;
                        } else {
                          if (param2 == this.field_h) {
                            this.field_b = true;
                            this.field_h = param2;
                            if (!ArmiesOfGielinor.field_M) {
                              break L7;
                            } else {
                              break L8;
                            }
                          } else {
                            L9: {
                              this.field_b = true;
                              this.field_h = param2;
                              if (!ArmiesOfGielinor.field_M) {
                                break L9;
                              } else {
                                if (!this.field_b) {
                                  break L9;
                                } else {
                                  this.field_h = -1;
                                  return;
                                }
                              }
                            }
                            return;
                          }
                        }
                      }
                      if (!this.field_b) {
                        break L7;
                      } else {
                        this.field_h = -1;
                        return;
                      }
                    } else {
                      if (!lk.field_f) {
                        break L7;
                      } else {
                        L10: {
                          L11: {
                            if (0 > param2) {
                              break L11;
                            } else {
                              if (param2 == this.field_h) {
                                this.field_b = true;
                                this.field_h = param2;
                                if (!ArmiesOfGielinor.field_M) {
                                  break L10;
                                } else {
                                  break L11;
                                }
                              } else {
                                L12: {
                                  this.field_b = true;
                                  this.field_h = param2;
                                  if (!ArmiesOfGielinor.field_M) {
                                    break L12;
                                  } else {
                                    if (!this.field_b) {
                                      break L12;
                                    } else {
                                      this.field_h = -1;
                                      return;
                                    }
                                  }
                                }
                                return;
                              }
                            }
                          }
                          if (!this.field_b) {
                            break L10;
                          } else {
                            this.field_h = -1;
                            return;
                          }
                        }
                        return;
                      }
                    }
                  }
                  return;
                } else {
                  return;
                }
              } else {
                L13: {
                  if (tr.field_A != 0) {
                    break L13;
                  } else {
                    if (-1 != (ro.field_ub ^ -1)) {
                      break L13;
                    } else {
                      L14: {
                        this.field_f = 0;
                        if (-1 != (this.field_f ^ -1)) {
                          break L14;
                        } else {
                          L15: {
                            if (this.field_b) {
                              break L15;
                            } else {
                              if (!lk.field_f) {
                                break L14;
                              } else {
                                break L15;
                              }
                            }
                          }
                          L16: {
                            if (0 > param2) {
                              break L16;
                            } else {
                              L17: {
                                if (param2 == this.field_h) {
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              this.field_b = true;
                              this.field_h = param2;
                              if (!ArmiesOfGielinor.field_M) {
                                break L14;
                              } else {
                                break L16;
                              }
                            }
                          }
                          if (!this.field_b) {
                            break L14;
                          } else {
                            this.field_h = -1;
                            break L14;
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                if (-1 == (this.field_f ^ -1)) {
                  if (this.field_b) {
                    L18: {
                      if (0 > param2) {
                        break L18;
                      } else {
                        if (param2 == this.field_h) {
                          this.field_b = true;
                          this.field_h = param2;
                          if (ArmiesOfGielinor.field_M) {
                            break L18;
                          } else {
                            return;
                          }
                        } else {
                          L19: {
                            this.field_b = true;
                            this.field_h = param2;
                            if (!ArmiesOfGielinor.field_M) {
                              break L19;
                            } else {
                              if (!this.field_b) {
                                break L19;
                              } else {
                                this.field_h = -1;
                                break L19;
                              }
                            }
                          }
                          return;
                        }
                      }
                    }
                    if (this.field_b) {
                      this.field_h = -1;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (!lk.field_f) {
                      return;
                    } else {
                      L20: {
                        L21: {
                          if (0 > param2) {
                            break L21;
                          } else {
                            L22: {
                              if (param2 == this.field_h) {
                                break L22;
                              } else {
                                break L22;
                              }
                            }
                            this.field_b = true;
                            this.field_h = param2;
                            if (!ArmiesOfGielinor.field_M) {
                              break L20;
                            } else {
                              break L21;
                            }
                          }
                        }
                        if (!this.field_b) {
                          break L20;
                        } else {
                          this.field_h = -1;
                          break L20;
                        }
                      }
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            } else {
              L23: {
                if (tr.field_A != 0) {
                  break L23;
                } else {
                  if (-1 != (ro.field_ub ^ -1)) {
                    break L23;
                  } else {
                    L24: {
                      this.field_f = 0;
                      if (-1 != (this.field_f ^ -1)) {
                        break L24;
                      } else {
                        L25: {
                          if (this.field_b) {
                            break L25;
                          } else {
                            if (!lk.field_f) {
                              break L24;
                            } else {
                              break L25;
                            }
                          }
                        }
                        L26: {
                          if (0 > param2) {
                            break L26;
                          } else {
                            L27: {
                              if (param2 == this.field_h) {
                                break L27;
                              } else {
                                break L27;
                              }
                            }
                            this.field_b = true;
                            this.field_h = param2;
                            if (!ArmiesOfGielinor.field_M) {
                              break L24;
                            } else {
                              break L26;
                            }
                          }
                        }
                        if (!this.field_b) {
                          break L24;
                        } else {
                          this.field_h = -1;
                          break L24;
                        }
                      }
                    }
                    return;
                  }
                }
              }
              if (-1 == (this.field_f ^ -1)) {
                if (this.field_b) {
                  L28: {
                    if (0 > param2) {
                      break L28;
                    } else {
                      if (param2 == this.field_h) {
                        this.field_b = true;
                        this.field_h = param2;
                        if (ArmiesOfGielinor.field_M) {
                          break L28;
                        } else {
                          return;
                        }
                      } else {
                        L29: {
                          this.field_b = true;
                          this.field_h = param2;
                          if (!ArmiesOfGielinor.field_M) {
                            break L29;
                          } else {
                            if (!this.field_b) {
                              break L29;
                            } else {
                              this.field_h = -1;
                              break L29;
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                  if (this.field_b) {
                    this.field_h = -1;
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (lk.field_f) {
                    L30: {
                      L31: {
                        if (0 > param2) {
                          break L31;
                        } else {
                          L32: {
                            if (param2 == this.field_h) {
                              break L32;
                            } else {
                              break L32;
                            }
                          }
                          this.field_b = true;
                          this.field_h = param2;
                          if (!ArmiesOfGielinor.field_M) {
                            break L30;
                          } else {
                            break L31;
                          }
                        }
                      }
                      if (!this.field_b) {
                        break L30;
                      } else {
                        this.field_h = -1;
                        break L30;
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            }
          } else {
            throw new IllegalArgumentException();
          }
        }
    }

    final static void f(int param0) {
        st.a(8, eq.field_h, jm.field_b, cb.field_c, hr.field_m);
        if (param0 != 0) {
            field_i = 123;
        }
    }

    dl(int param0) {
        this.field_b = false;
        this.field_h = 0;
        this.field_k = param0;
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          this.field_f = param3;
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param1) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((dl) (this)).field_b = stackIn_3_1 != 0;
        if (this.field_b) {
          this.field_h = param2;
          if (ArmiesOfGielinor.field_M) {
            this.field_h = param0;
            return;
          } else {
            return;
          }
        } else {
          this.field_h = param0;
          return;
        }
    }

    static {
        field_e = new int[][]{new int[]{0, 0, 0, 0, 0}, new int[]{94, 97, 100, 127, 131}, new int[]{95, 98, 101, 128, 132}, new int[]{96, 99, 102, 129, 133}, new int[]{0, 124, 125, 126, 0}, new int[]{0, 124, 125, 126, 0}, new int[]{105, 106, 107, 130, 134}};
        field_d = "LEVEL";
        field_c = new int[8192];
    }
}
