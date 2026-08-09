/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj {
    private nk[] field_m;
    static String field_j;
    static eh field_f;
    private nk[] field_c;
    static String field_k;
    private nk[] field_g;
    private nk[] field_i;
    boolean field_l;
    boolean field_e;
    boolean field_d;
    int field_n;
    private int field_h;
    boolean field_o;
    private int field_a;
    boolean field_b;

    final void b(int param0) {
        Object stackIn_6_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_22_0 = null;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            if (param0 == -1) {
              L1: {
                if (!this.field_e) {
                  break L1;
                } else {
                  L2: {
                    this.field_e = false;
                    stackIn_8_0 = this;

                    if (this.field_o) {
                      stackIn_9_0 = this;
                      stackIn_9_1 = -1;
                      break L2;
                    } else {
                      stackIn_6_0 = this;
                      stackIn_9_0 = this;
                      stackIn_9_1 = 0;
                      break L2;
                    }
                  }
                  ((mj) (this)).field_n = stackIn_9_1;
                  break L1;
                }
              }
              L3: {
                if (!this.field_l) {
                  break L3;
                } else {
                  L4: {
                    stackIn_16_0 = this;

                    if (!this.field_o) {
                      stackIn_17_0 = this;
                      stackIn_17_1 = 0;
                      break L4;
                    } else {
                      stackIn_14_0 = this;
                      stackIn_17_0 = this;
                      stackIn_17_1 = -1;
                      break L4;
                    }
                  }
                  ((mj) (this)).field_n = stackIn_17_1;
                  this.field_l = false;
                  break L3;
                }
              }
              L5: {
                if (!this.field_d) {
                  break L5;
                } else {
                  L6: {
                    this.field_d = false;
                    stackIn_24_0 = this;

                    if (!this.field_o) {
                      stackIn_25_0 = this;
                      stackIn_25_1 = 0;
                      break L6;
                    } else {
                      stackIn_22_0 = this;
                      stackIn_25_0 = this;
                      stackIn_25_1 = -1;
                      break L6;
                    }
                  }
                  ((mj) (this)).field_n = stackIn_25_1;
                  break L5;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var2), "mj.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static String b(byte param0) {
        RuntimeException var1 = null;
        String stackIn_2_0 = null;
        String stackIn_10_0 = null;
        String stackIn_12_0 = null;
        String stackIn_15_0 = null;
        String stackIn_18_0 = null;
        String stackIn_23_0 = null;
        String stackIn_26_0 = null;
        String stackIn_29_0 = null;
        String stackIn_34_0 = null;
        String stackIn_39_0 = null;
        String stackIn_41_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (2 <= sa.field_k) {
              if (jb.field_a != null) {
                if (!jb.field_a.c(48)) {
                  stackIn_10_0 = pc.field_p;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_12_0 = ii.field_l;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                if (pa.field_i.c(83)) {
                  if (param0 == -26) {
                    if (!pa.field_i.b("commonui", false)) {
                      stackIn_23_0 = fi.field_a + " - " + pa.field_i.b("commonui", (byte) -100) + "%";
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      if (kg.field_b.c(96)) {
                        if (kg.field_b.b("commonui", false)) {
                          if (!ea.field_e.c(-111)) {
                            stackIn_34_0 = se.field_F;
                            decompiledRegionSelector0 = 8;
                            break L0;
                          } else {
                            if (!ea.field_e.a((byte) -100)) {
                              stackIn_39_0 = da.field_b + " - " + ea.field_e.a(100) + "%";
                              decompiledRegionSelector0 = 9;
                              break L0;
                            } else {
                              stackIn_41_0 = gf.field_h;
                              decompiledRegionSelector0 = 10;
                              break L0;
                            }
                          }
                        } else {
                          stackIn_29_0 = vc.field_B + " - " + kg.field_b.b("commonui", (byte) -100) + "%";
                          decompiledRegionSelector0 = 7;
                          break L0;
                        }
                      } else {
                        stackIn_26_0 = mg.field_k;
                        decompiledRegionSelector0 = 6;
                        break L0;
                      }
                    }
                  } else {
                    stackIn_18_0 = (String) null;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                } else {
                  stackIn_15_0 = dk.field_b;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = qh.field_e;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var1), "mj.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_15_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_18_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_23_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_26_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_29_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_34_0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_39_0;
                          } else {
                            return stackIn_41_0;
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

    final void a(boolean param0, int param1, int param2) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        var5 = Bounce.field_N;
        try {
          L0: {
            if (param1 == -31729) {
              L1: {
                if ((this.field_n ^ -1) != 0) {
                  L2: {
                    if (this.field_e) {
                      break L2;
                    } else {
                      if (this.field_l) {
                        break L2;
                      } else {
                        if (!this.field_d) {
                          this.field_m[this.field_n].a(param2 * 32, (byte) -47, param0);
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  if (this.field_e) {
                    this.field_c[this.field_n].a(32 * param2, (byte) -61, param0);
                    break L1;
                  } else {
                    if (this.field_l) {
                      this.field_g[this.field_n].a(param2 * 32, (byte) 114, param0);
                      break L1;
                    } else {
                      if (this.field_d) {
                        this.field_i[this.field_n].a(param2 * 32, (byte) -84, param0);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                } else {
                  this.field_n = 0;
                  if (this.field_d) {
                    this.field_i[this.field_n].a(32 * param2, (byte) 99, param0);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var4), "mj.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final mj a(byte param0) {
        int stackIn_27_0 = 0;
        boolean stackIn_45_1 = false;
        nk stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        nk stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        boolean stackIn_73_1 = false;
        nk stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        nk stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        nk stackIn_112_0 = null;
        int stackIn_112_1 = 0;
        nk stackIn_124_0 = null;
        boolean stackIn_124_1 = false;
        nk stackIn_131_0 = null;
        int stackIn_131_1 = 0;
        Object stackIn_138_0 = null;
        Object stackIn_140_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_44_1;
        boolean stackOut_72_1;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = Bounce.field_N;
        try {
          L0: {
            L1: {
              L2: {
                if ((uc.field_C ^ -1) != (this.field_h ^ -1)) {
                  break L2;
                } else {
                  if ((this.field_a ^ -1) != (ll.field_y ^ -1)) {
                    break L2;
                  } else {
                    if ((vh.field_e ^ -1) != -1) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              this.field_o = true;
              break L1;
            }
            L3: {
              if (0 == vh.field_e) {
                break L3;
              } else {
                if (-1 != fa.field_b) {
                  if (ua.field_a != fa.field_b) {
                    ua.field_a = fa.field_b;
                    break L3;
                  } else {
                    ua.field_a = -1;
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (this.field_b) {
                stackIn_27_0 = 0;
                break L4;
              } else {
                stackIn_27_0 = 1;
                break L4;
              }
            }
            L5: {
              var2_int = stackIn_27_0;
              if (var2_int == 0) {
                break L5;
              } else {
                this.field_e = false;
                break L5;
              }
            }
            L6: {
              if (var2_int != 0) {
                this.field_d = false;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (var2_int != 0) {
                this.field_l = false;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (!this.field_l) {
                ua.field_a = -1;
                break L8;
              } else {
                break L8;
              }
            }
            var3 = 0;
            L9: while (true) {
              L10: {
                L11: {
                  if ((this.field_m.length ^ -1) >= (var3 ^ -1)) {
                    if (jh.b(767564065)) {
                      this.field_c[11].field_f = qe.field_c;
                      this.field_c[11].field_i = 14;
                      this.field_c[10].field_f = hi.field_b;
                      stackIn_69_0 = this.field_c[10];
                      stackIn_69_1 = 10;
                      break L11;
                    } else {
                      this.field_c[10].field_f = "";
                      this.field_c[10].field_i = 11;
                      this.field_c[11].field_f = hi.field_b;
                      this.field_c[11].field_i = 10;
                      break L10;
                    }
                  } else {
                    stackIn_69_0 = this.field_m[var3];

                    stackOut_44_1 = this.field_b;
                    stackIn_69_1 = stackOut_44_1 ? 1 : 0;
                    stackIn_45_1 = stackOut_44_1;
                    L12: {
                      L13: {
                        stackIn_69_0 = (nk) ((Object) stackIn_69_0);

                        if (!stackIn_45_1) {
                          break L13;
                        } else {

                          stackIn_69_0 = (nk) ((Object) stackIn_69_0);

                          if (this.field_e) {
                            break L13;
                          } else {

                            stackIn_69_0 = (nk) ((Object) stackIn_69_0);

                            if (this.field_l) {
                              break L13;
                            } else {

                              stackIn_69_0 = (nk) ((Object) stackIn_69_0);

                              if (this.field_d) {
                                break L13;
                              } else {

                                stackIn_60_0 = (nk) ((Object) stackIn_69_0);
                                stackIn_60_1 = 1;
                                break L12;
                              }
                            }
                          }
                        }
                      }
                      stackIn_60_0 = (nk) ((Object) stackIn_69_0);
                      stackIn_60_1 = 0;
                      break L12;
                    }
                    L14: {
                      if (!((nk) (Object) stackIn_60_0).a(stackIn_60_1 != 0, (byte) -72)) {
                        break L14;
                      } else {
                        var2_int = 0;
                        break L14;
                      }
                    }
                    var3++;
                    continue L9;
                  }
                }
                stackIn_69_0.field_i = stackIn_69_1;
                break L10;
              }
              var3 = 0;
              L15: while (true) {
                L16: {
                  L17: {
                    if ((var3 ^ -1) <= (this.field_c.length ^ -1)) {
                      if (-1 <= (kb.field_a ^ -1)) {
                        if (!jh.b(767564065)) {
                          this.field_g[0].field_f = hi.field_b;
                          this.field_g[0].field_i = 12;
                          stackIn_99_0 = this.field_g[1];
                          stackIn_99_1 = 4;
                          break L17;
                        } else {
                          this.field_g[1].field_f = qe.field_c;
                          this.field_g[1].field_i = 14;
                          this.field_g[0].field_i = 12;
                          this.field_g[0].field_f = hi.field_b;
                          break L16;
                        }
                      } else {
                        this.field_g[1].field_f = bk.field_d;
                        this.field_g[1].field_i = 4;
                        this.field_g[0].field_f = hi.field_b;
                        this.field_g[0].field_i = 12;
                        break L16;
                      }
                    } else {
                      stackIn_99_0 = this.field_c[var3];

                      stackOut_72_1 = this.field_b;
                      stackIn_99_1 = stackOut_72_1 ? 1 : 0;
                      stackIn_73_1 = stackOut_72_1;
                      L18: {
                        L19: {
                          stackIn_99_0 = (nk) ((Object) stackIn_99_0);

                          if (!stackIn_73_1) {
                            break L19;
                          } else {

                            stackIn_99_0 = (nk) ((Object) stackIn_99_0);

                            if (!this.field_e) {
                              break L19;
                            } else {

                              stackIn_82_0 = (nk) ((Object) stackIn_99_0);
                              stackIn_82_1 = 1;
                              break L18;
                            }
                          }
                        }
                        stackIn_82_0 = (nk) ((Object) stackIn_99_0);
                        stackIn_82_1 = 0;
                        break L18;
                      }
                      L20: {
                        if (((nk) (Object) stackIn_82_0).a(stackIn_82_1 != 0, (byte) -72)) {
                          var2_int = 0;
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                      var3++;
                      continue L15;
                    }
                  }
                  stackIn_99_0.field_i = stackIn_99_1;
                  this.field_g[1].field_f = "";
                  break L16;
                }
                var3 = 0;
                L21: while (true) {
                  L22: {
                    if (this.field_g.length <= var3) {
                      L23: {
                        if (param0 == -77) {
                          break L23;
                        } else {
                          this.a(61, 39);
                          break L23;
                        }
                      }
                      var3 = 0;
                      L24: while (true) {
                        if ((this.field_i.length ^ -1) >= (var3 ^ -1)) {
                          break L22;
                        } else {
                          stackIn_124_0 = this.field_i[var3];
                          stackIn_124_1 = this.field_b;
                          L25: {
                            L26: {
                              stackIn_124_0 = (nk) ((Object) stackIn_124_0);

                              if (!stackIn_124_1) {
                                break L26;
                              } else {
                                stackIn_124_0 = (nk) ((Object) stackIn_124_0);

                                if (!this.field_d) {
                                  break L26;
                                } else {

                                  stackIn_131_0 = (nk) ((Object) stackIn_124_0);
                                  stackIn_131_1 = 1;
                                  break L25;
                                }
                              }
                            }
                            stackIn_131_0 = (nk) ((Object) stackIn_124_0);
                            stackIn_131_1 = 0;
                            break L25;
                          }
                          L27: {
                            if (!((nk) (Object) stackIn_131_0).a(stackIn_131_1 != 0, (byte) -72)) {
                              break L27;
                            } else {
                              var2_int = 0;
                              break L27;
                            }
                          }
                          var3++;
                          continue L24;
                        }
                      }
                    } else {
                      stackIn_124_0 = this.field_g[var3];

                      stackIn_124_1 = this.field_b;

                      L32: {
                        L33: {
                          stackIn_124_0 = (nk) ((Object) stackIn_124_0);

                          if (!stackIn_124_1) {
                            break L33;
                          } else {

                            stackIn_124_0 = (nk) ((Object) stackIn_124_0);

                            if (!this.field_l) {
                              break L33;
                            } else {

                              stackIn_112_0 = (nk) ((Object) stackIn_124_0);
                              stackIn_112_1 = 1;
                              break L32;
                            }
                          }
                        }
                        stackIn_112_0 = (nk) ((Object) stackIn_124_0);
                        stackIn_112_1 = 0;
                        break L32;
                      }
                      L34: {
                        if (((nk) (Object) stackIn_112_0).a(stackIn_112_1 != 0, (byte) -72)) {
                          var2_int = 0;
                          break L34;
                        } else {
                          break L34;
                        }
                      }
                      var3++;
                      continue L21;
                    }
                  }
                  this.field_h = uc.field_C;
                  this.field_a = ll.field_y;
                  if (var2_int != 0) {
                    stackIn_138_0 = null;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    stackIn_140_0 = this;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var2), "mj.G(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (mj) ((Object) stackIn_138_0);
        } else {
          return (mj) (this);
        }
    }

    final void a(int param0) {
        int stackIn_73_0 = 0;
        nk stackIn_88_0 = null;
        int stackIn_88_1 = 0;
        int stackIn_88_2 = 0;
        int stackIn_94_1 = 0;
        nk stackIn_107_0 = null;
        int stackIn_107_1 = 0;
        int stackIn_107_2 = 0;
        RuntimeException decompiledCaughtException = null;
        String[] var2 = null;
        int var2_int = 0;
        RuntimeException var2_ref = null;
        long[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        he var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        var13 = Bounce.field_N;
        try {
          L0: {
            L1: {
              if (this.field_o) {
                this.field_n = -1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!jh.b(767564065)) {
                L3: {
                  if (null == pe.field_f) {
                    tk.field_c = 0;
                    pe.field_f = pe.a(3, 10, 1, -16947, 13);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (pe.field_f.field_i) {
                  if (pe.field_f.field_h == null) {
                    this.field_c[6].field_f = jk.field_m;
                    break L2;
                  } else {
                    var2 = pe.field_f.field_h[ii.field_k];
                    var3 = pe.field_f.field_l[ii.field_k];
                    var4 = pe.field_f.field_o[ii.field_k];
                    var5 = 0;
                    var6 = qc.field_a;
                    var7 = 0;
                    var8 = 0;
                    L4: while (true) {
                      L5: {
                        if (-11 >= (var8 ^ -1)) {
                          stackIn_73_0 = var7;
                          break L5;
                        } else {
                          stackIn_73_0 = var5;

                          L6: {
                            if (stackIn_73_0 != 0) {
                              break L6;
                            } else {
                              if (var6 == null) {
                                break L6;
                              } else {
                                if (!s.a(var2[var8], param0 + -23409)) {
                                  break L6;
                                } else {
                                  if ((var3[var8] ^ -1L) != (var6.field_o ^ -1L)) {
                                    break L6;
                                  } else {
                                    if (var4[var8] != ti.field_O) {
                                      break L6;
                                    } else {
                                      var5 = 1;
                                      tk.field_c = -(1 + var8);
                                      break L6;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L7: {
                            L8: {
                              if (var2[var8] != null) {
                                break L8;
                              } else {
                                L9: {
                                  if (var5 != 0) {
                                    break L9;
                                  } else {
                                    if (var8 != 9) {
                                      break L9;
                                    } else {
                                      if ((ti.field_O ^ -1) >= -1) {
                                        break L9;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                }
                                this.field_c[var8].field_f = "";
                                break L7;
                              }
                            }
                            L10: {
                              var9 = 0;
                              var10 = 0;
                              var11 = 0;
                              var12 = " , , ";
                              if (var2[var8] != null) {
                                var9 = var4[var8];
                                var11 = var9;
                                var12 = var2[var8];
                                var12 = 1 + var8 + ". ," + var12 + ",   " + var11;
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            L11: {
                              if (var5 != 0) {
                                break L11;
                              } else {
                                if (9 != var8) {
                                  break L11;
                                } else {
                                  if (0 >= ti.field_O) {
                                    break L11;
                                  } else {
                                    var9 = ti.field_O;
                                    var12 = ja.field_b;
                                    var11 = var9;
                                    tk.field_c = -(var8 - -1);
                                    if (0 != var10) {
                                      break L11;
                                    } else {
                                      var12 = "," + var12 + ",   " + var11;
                                      break L11;
                                    }
                                  }
                                }
                              }
                            }
                            L12: {
                              if (var8 == 0) {
                                ca.field_a = new int[1];
                                eh.field_b = new String[1];
                                ca.field_a[0] = var11;
                                eh.field_b[0] = var2[var8];
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                            var7 = 1;
                            this.field_c[var8].field_f = var12;
                            break L7;
                          }
                          var8++;
                          continue L4;
                        }
                      }
                      L13: {
                        if (stackIn_73_0 != 0) {
                          break L13;
                        } else {
                          this.field_c[6].field_f = kk.field_w;
                          break L13;
                        }
                      }
                      break L2;
                    }
                  }
                } else {
                  this.field_c[6].field_f = ib.field_j;
                  break L2;
                }
              } else {
                this.field_c[6].field_f = kg.field_d;
                break L2;
              }
            }
            var2_int = 0;
            L14: while (true) {
              if ((this.field_m.length ^ -1) >= (var2_int ^ -1)) {
                var2_int = 0;
                L15: while (true) {
                  if (this.field_c.length <= var2_int) {
                    L16: {
                      if (param0 == 23417) {
                        break L16;
                      } else {
                        this.b(42);
                        break L16;
                      }
                    }
                    var2_int = 0;
                    L17: while (true) {
                      if ((var2_int ^ -1) <= (this.field_g.length ^ -1)) {
                        var2_int = 0;
                        L18: while (true) {
                          if ((var2_int ^ -1) <= (this.field_i.length ^ -1)) {
                            break L0;
                          } else {
                            stackIn_107_0 = this.field_i[var2_int];
                            stackIn_107_1 = 16697912;
                            stackIn_107_2 = 16741888;
                            ((nk) (Object) stackIn_107_0).a(stackIn_107_1, stackIn_107_2);
                            var2_int++;
                            continue L18;
                          }
                        }
                      } else {
                        this.field_g[var2_int].a(16697912, 16741888);
                        var2_int++;
                        continue L17;
                      }
                    }
                  } else {
                    stackIn_88_0 = this.field_c[var2_int];
                    stackIn_88_1 = var2_int;
                    stackIn_88_2 = this.field_c.length + -2;
                    L19: {


                      if (stackIn_88_1 < stackIn_88_2) {
                        stackIn_88_0 = (nk) ((Object) stackIn_88_0);
                        stackIn_94_1 = 16741888;
                        break L19;
                      } else {

                        stackIn_88_0 = (nk) ((Object) stackIn_88_0);
                        stackIn_94_1 = 16697912;
                        break L19;
                      }
                    }
                    ((nk) (Object) stackIn_88_0).a(stackIn_94_1, 16741888);
                    var2_int++;
                    continue L15;
                  }
                }
              } else {
                this.field_m[var2_int].a(16741888, 16741888);
                var2_int++;
                continue L14;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var2_ref), "mj.B(" + param0 + ')');
        }
    }

    public static void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              field_j = null;
              field_k = null;
              if (param0 == 4) {
                break L1;
              } else {
                mj.b((byte) 102);
                break L1;
              }
            }
            field_f = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var1), "mj.A(" + param0 + ')');
        }
    }

    final void a(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = Bounce.field_N;
        try {
          L0: {
            L1: {
              this.field_o = false;
              if (!this.field_e) {
                if (this.field_l) {
                  L2: {
                    this.field_n = this.field_n + param0;
                    if (-1 >= (this.field_n ^ -1)) {
                      break L2;
                    } else {
                      this.field_n = -1 + this.field_g.length;
                      break L2;
                    }
                  }
                  L3: {
                    if ((this.field_g.length ^ -1) >= (this.field_n ^ -1)) {
                      this.field_n = 0;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  if ((kb.field_a ^ -1) != -1) {
                    break L1;
                  } else {
                    if (!jh.b(767564065)) {
                      this.field_n = 0;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  if (this.field_d) {
                    this.field_n = 0;
                    break L1;
                  } else {
                    L4: {
                      this.field_n = this.field_n + param0;
                      if ((this.field_n ^ -1) <= -1) {
                        break L4;
                      } else {
                        this.field_n = this.field_m.length - 1;
                        break L4;
                      }
                    }
                    if ((this.field_n ^ -1) <= (this.field_m.length ^ -1)) {
                      this.field_n = 0;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              } else {
                if (10 == this.field_n) {
                  this.field_n = 11;
                  break L1;
                } else {
                  this.field_n = 10;
                  break L1;
                }
              }
            }
            L5: {
              if (param1 == 12011) {
                break L5;
              } else {
                this.field_o = true;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var3), "mj.D(" + param0 + ',' + param1 + ')');
        }
    }

    mj() {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = Bounce.field_N;
        this.field_m = new nk[]{new nk(0, 22, c.field_b, 0, (mj) (this)), new nk(1, 54, nf.field_b, 1, (mj) (this)), new nk(2, 86, kl.field_m, 2, (mj) (this)), new nk(3, 118, qe.field_j, 3, (mj) (this)), new nk(4, 150, md.field_u, 5, (mj) (this)), new nk(5, 182, ob.field_b, 6, (mj) (this)), new nk(6, 214, fj.field_g, 7, (mj) (this)), new nk(7, 246, bk.field_d, 4, (mj) (this)), new nk(8, 278, kc.field_d, 8, (mj) (this)), new nk(9, 310, wa.field_c, 9, (mj) (this))};
        this.field_c = new nk[]{new nk(0, -5, "", -1, (mj) (this)), new nk(1, 23, "", -2, (mj) (this)), new nk(2, 51, "", -3, (mj) (this)), new nk(3, 79, "", -4, (mj) (this)), new nk(4, 107, "", -5, (mj) (this)), new nk(5, 135, "", -6, (mj) (this)), new nk(6, 163, "", -7, (mj) (this)), new nk(7, 191, "", -8, (mj) (this)), new nk(8, 219, "", -9, (mj) (this)), new nk(9, 247, "", -10, (mj) (this)), new nk(10, 315, "", 11, (mj) (this)), new nk(11, 347, hi.field_b, 10, (mj) (this))};
        this.field_g = new nk[]{new nk(0, 310, hi.field_b, 12, (mj) (this)), new nk(1, 347, bk.field_d, 4, (mj) (this))};
        this.field_i = new nk[]{new nk(0, 347, hi.field_b, 13, (mj) (this))};
        try {
          L0: {
            this.field_a = ll.field_y;
            this.field_b = true;
            this.field_h = uc.field_C;
            var1_int = 0;
            L1: while (true) {
              if ((var1_int ^ -1) <= (this.field_m.length ^ -1)) {
                var1_int = 0;
                L2: while (true) {
                  if (var1_int >= this.field_c.length) {
                    var1_int = 0;
                    L3: while (true) {
                      if ((this.field_g.length ^ -1) >= (var1_int ^ -1)) {
                        var1_int = 0;
                        L4: while (true) {
                          if ((var1_int ^ -1) <= (this.field_i.length ^ -1)) {
                            break L0;
                          } else {
                            this.field_i[var1_int].field_c = 3;
                            var1_int++;
                            continue L4;
                          }
                        }
                      } else {
                        this.field_g[var1_int].field_c = 2;
                        var1_int++;
                        continue L3;
                      }
                    }
                  } else {
                    this.field_c[var1_int].field_c = 1;
                    var1_int++;
                    continue L2;
                  }
                }
              } else {
                this.field_m[var1_int].field_c = 0;
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var1), "mj.<init>()");
        }
    }

    static {
        field_j = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_f = new eh(4, 1, 1, 1);
    }
}
