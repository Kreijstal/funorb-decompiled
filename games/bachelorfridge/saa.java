/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class saa {
    gaa field_s;
    private mk field_q;
    boolean field_p;
    private boolean field_c;
    private int field_e;
    int field_o;
    private int field_g;
    private int field_m;
    ua field_d;
    private int field_l;
    private boolean field_h;
    jfa field_k;
    static String field_u;
    static sna field_f;
    static hn field_a;
    static int field_b;
    private boolean field_j;
    static String field_r;
    private boolean field_t;
    boolean field_i;
    private int field_n;

    private final void c(byte param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        jfa var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        var3 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (mg.field_m != null) {
                this.field_d.field_c.field_r = new jfa[50];
                this.field_d.field_c.a((byte) 103, mg.field_m.field_e);
                var2_int = 0;
                L2: while (true) {
                  if (var2_int >= 50) {
                    var2 = (jfa) ((Object) this.field_d.field_c.field_m.b((byte) 90));
                    L3: while (true) {
                      if (var2 == null) {
                        this.field_d.field_c.field_n = mg.field_m.field_c;
                        this.field_d.field_c.field_k.a(false, mg.field_m.field_f);
                        break L1;
                      } else {
                        var2.field_g.a((byte) 13, dm.field_f);
                        var2 = (jfa) ((Object) this.field_d.field_c.field_m.c(0));
                        continue L3;
                      }
                    }
                  } else {
                    L4: {
                      if (mg.field_m.field_i[var2_int] != null) {
                        this.field_d.field_c.field_r[var2_int] = new jfa(mg.field_m.field_i[var2_int], 0, 0, this.field_d.field_c.field_i);
                        this.field_d.field_c.field_r[var2_int].field_g.a((byte) -121, dm.field_f);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var2_int++;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L5: {
              if (param0 == 13) {
                break L5;
              } else {
                this.field_p = true;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2_ref), "saa.C(" + param0 + ')');
        }
    }

    final void b(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((gf.field_k ^ -1) != -14) {
                break L1;
              } else {
                if (kaa.field_m == 0) {
                  break L1;
                } else {
                  if (0 != iba.field_s) {
                    var2_int = 1;
                    lg.a(true, var2_int, false);
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            var2_int = 52 % ((param0 - -13) / 62);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) runtimeException), "saa.I(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0) {
        if (param0 >= -43) {
            return;
        }
        try {
            mg.field_m.field_c = this.field_d.field_c.field_n;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "saa.L(" + param0 + ')');
        }
    }

    final void b(int param0) {
        try {
            this.field_d.field_c.field_k.a(false, mg.field_m.field_f);
            if (param0 != 11) {
                this.field_q = (mk) null;
            }
            rba.a(mg.field_m, (byte) 58);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "saa.H(" + param0 + ')');
        }
    }

    private final void f(byte param0) {
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        boolean stackIn_117_0 = false;
        boolean stackIn_119_0 = false;
        boolean stackIn_120_0 = false;
        int stackIn_120_1 = 0;
        int stackIn_142_0 = 0;
        Object stackIn_156_0;
        mk stackIn_156_1;
        mk stackIn_156_2;
        jfa stackIn_156_3;
        boolean stackIn_156_4;
        Object stackIn_158_0;
        mk stackIn_158_1;
        mk stackIn_158_2;
        jfa stackIn_158_3;
        boolean stackIn_158_4;
        Object stackIn_159_0;
        mk stackIn_159_1;
        mk stackIn_159_2;
        jfa stackIn_159_3;
        boolean stackIn_159_4;
        int stackIn_159_5;
        Object stackIn_167_0;
        mk stackIn_167_1;
        mk stackIn_167_2;
        jfa stackIn_167_3;
        boolean stackIn_167_4;
        Object stackIn_169_0;
        mk stackIn_169_1;
        mk stackIn_169_2;
        jfa stackIn_169_3;
        boolean stackIn_169_4;
        Object stackIn_170_0;
        mk stackIn_170_1;
        mk stackIn_170_2;
        jfa stackIn_170_3;
        boolean stackIn_170_4;
        int stackIn_170_5;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        jfa var5 = null;
        jfa var6 = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              kg.field_e.a(19842, true);
              if (this.field_i) {
                break L1;
              } else {
                if (-2 != (kg.field_e.field_R ^ -1)) {
                  break L1;
                } else {
                  if (!kg.field_e.field_T) {
                    break L1;
                  } else {
                    if (this.field_d.field_c.field_k.field_a != 2) {
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            if (param0 <= -31) {
              L2: {
                sn.field_m.a(19842, true);
                d.field_H.a(19842, true);
                if (this.field_d.field_c.field_k.field_a == 2) {
                  L3: {
                    if (!sn.field_m.field_T) {
                      break L3;
                    } else {
                      if (!af.field_a) {
                        break L3;
                      } else {
                        uca.a(3, (byte) 124);
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (sn.field_m.field_T) {
                      au.field_c = 1;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (this.field_i) {
                      break L5;
                    } else {
                      if (sn.field_m.field_R != 1) {
                        break L5;
                      } else {
                        if ((this.field_o ^ -1) >= -1) {
                          L6: {
                            stackIn_36_0 = this;

                            if (this.field_p) {
                              stackIn_37_0 = this;
                              stackIn_37_1 = 0;
                              break L6;
                            } else {
                              stackIn_37_0 = this;
                              stackIn_37_1 = 1;
                              break L6;
                            }
                          }
                          L7: {
                            ((saa) (this)).field_p = stackIn_37_1 != 0;
                            var2_int = -1;
                            if (this.field_p) {
                              var2_int = 1;
                              break L7;
                            } else {
                              var2_int = 0;
                              break L7;
                            }
                          }
                          ct.c(var2_int, -123);
                          this.field_o = 5;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  if (!d.field_H.field_T) {
                    break L2;
                  } else {
                    if (!af.field_a) {
                      break L2;
                    } else {
                      uca.a(4, (byte) -41);
                      break L2;
                    }
                  }
                } else {
                  break L2;
                }
              }
              L8: {
                if (null == this.field_s) {
                  break L8;
                } else {
                  var2_int = this.field_s.b(0);
                  if (var2_int != -1) {
                    L9: {
                      this.field_h = false;
                      if (-1 != (var2_int ^ -1)) {
                        break L9;
                      } else {
                        if (this.field_s.field_j) {
                          L10: {
                            if (null == this.field_k) {
                              this.field_k = null;
                              mg.field_m.field_e.field_j.field_d = true;
                              break L10;
                            } else {
                              qm.a(11, 7758);
                              ag.a(this.field_k, (byte) -104);
                              this.field_n = 12;
                              this.field_k.a(false);
                              mg.field_m.field_e.field_j = null;
                              break L10;
                            }
                          }
                          ct.c(0, -114);
                          this.field_s = null;
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    if (var2_int == 1) {
                      this.field_s = null;
                      break L8;
                    } else {
                      break L8;
                    }
                  } else {
                    break L8;
                  }
                }
              }
              L11: {
                if (this.field_j) {
                  if ((lf.field_c ^ -1) == -2) {
                    var5 = this.field_d.field_c.a(mk.field_p, -4456, gd.field_m);
                    var6 = var5;
                    if (var6 != null) {
                      var3 = this.field_d.field_c.field_k.g(50);
                      if ((var3 ^ -1) == 0) {
                        break L11;
                      } else {
                        var6.a(false);
                        this.field_d.field_c.field_r[var3] = var5;
                        ik.a(0, var6, -6622, var3);
                        break L11;
                      }
                    } else {
                      break L11;
                    }
                  } else {
                    break L11;
                  }
                } else {
                  break L11;
                }
              }
              L12: {
                if (!this.field_p) {
                  break L12;
                } else {
                  if ((lf.field_c ^ -1) != -3) {
                    break L12;
                  } else {
                    this.field_p = false;
                    ct.c(0, -123);
                    this.field_o = 5;
                    this.field_t = false;
                    break L12;
                  }
                }
              }
              L13: {
                if (!this.field_h) {
                  break L13;
                } else {
                  if (-3 == (lf.field_c ^ -1)) {
                    this.field_h = false;
                    ct.c(0, -124);
                    break L13;
                  } else {
                    break L13;
                  }
                }
              }
              L14: {
                if (!this.field_j) {
                  break L14;
                } else {
                  if (-3 == (lf.field_c ^ -1)) {
                    this.field_j = false;
                    ct.c(0, -127);
                    break L14;
                  } else {
                    break L14;
                  }
                }
              }
              L15: {
                if (this.field_h) {
                  break L15;
                } else {
                  L16: {
                    if (null == this.field_d.field_c.a(mk.field_p, -4456, gd.field_m)) {
                      break L16;
                    } else {
                      if (0 == (mk.field_p ^ -1)) {
                        break L16;
                      } else {
                        if (-1 == gd.field_m) {
                          break L16;
                        } else {
                          this.field_t = false;
                          break L16;
                        }
                      }
                    }
                  }
                  if (!bfa.field_a) {
                    break L15;
                  } else {
                    L17: {
                      if (null != this.field_q) {
                        break L17;
                      } else {
                        if (null == this.field_d.field_c.a(mk.field_p, -4456, gd.field_m)) {
                          break L17;
                        } else {
                          L18: {
                            stackIn_119_0 = this.field_p;

                            if (lf.field_c != 1) {
                              stackIn_120_0 = stackIn_119_0;
                              stackIn_120_1 = 0;
                              break L18;
                            } else {
                              stackIn_117_0 = stackIn_119_0;
                              stackIn_120_0 = stackIn_117_0;
                              stackIn_120_1 = 1;
                              break L18;
                            }
                          }
                          L19: {
                            if (stackIn_120_0 & stackIn_120_1 != 0) {
                              break L19;
                            } else {
                              if (4 != nd.field_h) {
                                break L17;
                              } else {
                                if (2 == lf.field_c) {
                                  break L19;
                                } else {
                                  break L17;
                                }
                              }
                            }
                          }
                          this.field_t = false;
                          lf.field_c = 0;
                          this.field_c = true;
                          if (this.field_d.field_c.a(mk.field_p, -4456, gd.field_m) == null) {
                            break L15;
                          } else {
                            L20: {
                              this.field_i = true;
                              stackIn_169_0 = this;

                              stackIn_169_1 = null;

                              stackIn_169_2 = null;

                              stackIn_169_3 = this.field_d.field_c.a(mk.field_p, -4456, gd.field_m);

                              stackIn_169_4 = this.field_t;

                              if (this.field_t) {
                                stackIn_170_0 = this;
                                stackIn_170_1 = null;
                                stackIn_170_2 = null;
                                stackIn_170_3 = (jfa) ((Object) stackIn_169_3);
                                stackIn_170_4 = stackIn_169_4;
                                stackIn_170_5 = this.field_l;
                                break L20;
                              } else {
                                stackIn_167_0 = this;
                                stackIn_167_1 = null;
                                stackIn_167_2 = null;
                                stackIn_167_3 = (jfa) ((Object) stackIn_169_3);
                                stackIn_167_4 = stackIn_169_4;
                                stackIn_170_0 = this;
                                stackIn_170_1 = null;
                                stackIn_170_2 = null;
                                stackIn_170_3 = (jfa) ((Object) stackIn_167_3);
                                stackIn_170_4 = stackIn_167_4;
                                stackIn_170_5 = this.field_g;
                                break L20;
                              }
                            }
                            ((saa) (this)).field_q = new mk(stackIn_170_3, stackIn_170_4, stackIn_170_5);
                            break L15;
                          }
                        }
                      }
                    }
                    if (this.field_q != null) {
                      break L15;
                    } else {
                      if (!this.field_d.field_c.field_k.a(-22263)) {
                        break L15;
                      } else {
                        if (this.field_d.field_c.field_k.field_a != 1) {
                          break L15;
                        } else {
                          L21: {
                            if (1 != lf.field_c) {
                              stackIn_142_0 = 0;
                              break L21;
                            } else {
                              stackIn_142_0 = 1;
                              break L21;
                            }
                          }
                          L22: {
                            if (stackIn_142_0 != 0 & this.field_p) {
                              break L22;
                            } else {
                              if (nd.field_h != 4) {
                                break L15;
                              } else {
                                if (2 == lf.field_c) {
                                  break L22;
                                } else {
                                  break L15;
                                }
                              }
                            }
                          }
                          lf.field_c = 0;
                          var2_int = this.field_d.field_c.field_k.d(false);
                          if (var2_int != -1) {
                            L23: {
                              this.field_l = var2_int;
                              this.field_c = true;
                              this.field_t = true;
                              if (this.field_d.field_c.field_k.b(-97) == null) {
                                break L23;
                              } else {
                                L24: {
                                  this.field_i = true;
                                  stackIn_158_0 = this;

                                  stackIn_158_1 = null;

                                  stackIn_158_2 = null;

                                  stackIn_158_3 = this.field_d.field_c.field_k.b(125);

                                  stackIn_158_4 = this.field_t;

                                  if (!this.field_t) {
                                    stackIn_159_0 = this;
                                    stackIn_159_1 = null;
                                    stackIn_159_2 = null;
                                    stackIn_159_3 = (jfa) ((Object) stackIn_158_3);
                                    stackIn_159_4 = stackIn_158_4;
                                    stackIn_159_5 = this.field_g;
                                    break L24;
                                  } else {
                                    stackIn_156_0 = this;
                                    stackIn_156_1 = null;
                                    stackIn_156_2 = null;
                                    stackIn_156_3 = (jfa) ((Object) stackIn_158_3);
                                    stackIn_156_4 = stackIn_158_4;
                                    stackIn_159_0 = this;
                                    stackIn_159_1 = null;
                                    stackIn_159_2 = null;
                                    stackIn_159_3 = (jfa) ((Object) stackIn_156_3);
                                    stackIn_159_4 = stackIn_156_4;
                                    stackIn_159_5 = this.field_l;
                                    break L24;
                                  }
                                }
                                ((saa) (this)).field_q = new mk(stackIn_159_3, stackIn_159_4, stackIn_159_5);
                                break L23;
                              }
                            }
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                      }
                    }
                  }
                }
              }
              L25: {
                if (!this.field_c) {
                  break L25;
                } else {
                  if ((lf.field_c ^ -1) == -3) {
                    this.field_t = false;
                    this.field_g = -1;
                    this.field_c = false;
                    this.field_l = -1;
                    break L25;
                  } else {
                    break L25;
                  }
                }
              }
              aq.field_b.a(19842, true);
              cf.field_b.a(19842, true);
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
          throw pe.a((Throwable) ((Object) var2), "saa.P(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, boolean[] param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 10) {
                break L1;
              } else {
                this.field_o = 115;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("saa.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    private final boolean b(boolean param0) {
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            if (param0) {
              L1: {
                L2: {
                  if (mk.field_p <= d.field_H.field_kb) {
                    break L2;
                  } else {
                    if (gd.field_m <= d.field_H.field_rb) {
                      break L2;
                    } else {
                      if (d.field_H.field_kb - -d.field_H.field_sb <= mk.field_p) {
                        break L2;
                      } else {
                        if (gd.field_m >= d.field_H.field_p + d.field_H.field_rb) {
                          break L2;
                        } else {
                          stackIn_10_0 = 1;
                          break L1;
                        }
                      }
                    }
                  }
                }
                stackIn_10_0 = 0;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "saa.J(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    public static void d(byte param0) {
        try {
            field_r = null;
            field_u = null;
            int var1_int = -41 / ((-47 - param0) / 59);
            field_f = null;
            field_a = null;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "saa.D(" + param0 + ')');
        }
    }

    final void a(boolean param0, eaa param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            rh.a(param0, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("saa.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final void a(eaa param0, int param1) {
        int[] var3 = null;
        kha var4 = null;
        int var5 = 0;
        int[] var6 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            var6 = new int[param1];
            var3 = var6;
            var4 = (kha) ((Object) param0.b((byte) 90));
            L1: while (true) {
              if (var4 == null) {
                mg.field_m.field_f = var3;
                this.field_d.field_c.field_k.a(false, mg.field_m.field_f);
                break L0;
              } else {
                var6[var4.field_h] = var6[var4.field_h] + var4.field_g;
                var4 = (kha) ((Object) param0.c(0));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("saa.A(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    private final void a(boolean param0) {
        sna var2 = null;
        sna discarded$0 = null;
        sna discarded$1 = null;
        try {
            var2 = mka.a(13558251, 13558251, 13558251, (byte) -124, jha.field_g, 13558251, 16777215, 13558251);
            var2.field_eb = wd.field_w;
            var2.field_A = bla.field_p;
            var2.field_db = op.field_I;
            if (param0) {
                field_a = (hn) null;
            }
            kg.field_e = new sna("shopbutton", var2, 433, 87, 195, 42, "");
            sn.field_m = new sna("getmagnify", var2, 420, 32, 80, 62, "");
            d.field_H = new sna("clean", var2, 526, 318, 82, 124, "");
            discarded$0 = new sna("freeze", var2, 576, 430, 50, 42, "");
            discarded$1 = new sna("throwin", var2, 580, 380, 80, 20, "Throw in");
            aq.field_b = new sna("viewstats", var2, -50, -50, 50, 20, "View");
            aq.field_b.field_L = 10;
            cf.field_b = new sna("close", var2, -50, -50, 50, 20, "Close");
            cf.field_b.field_L = 10;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "saa.G(" + param0 + ')');
        }
    }

    final void a(boolean param0, boolean param1) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        jfa var4 = null;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param1) {
                L2: {
                  if (af.field_a) {
                    ic.a(74);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (this.field_i) {
                    break L3;
                  } else {
                    if (this.field_s == null) {
                      var3_int = 0;
                      var4 = (jfa) ((Object) this.field_d.field_c.field_m.b((byte) 90));
                      L4: while (true) {
                        if (var4 == null) {
                          L5: {
                            if (this.field_j) {
                              break L5;
                            } else {
                              if (this.field_h) {
                                break L5;
                              } else {
                                if (this.field_p) {
                                  break L5;
                                } else {
                                  if (this.field_i) {
                                    break L5;
                                  } else {
                                    this.field_d.field_c.a(true);
                                    this.field_d.field_c.field_k.a(false);
                                    break L5;
                                  }
                                }
                              }
                            }
                          }
                          if (var3_int != 0) {
                            break L3;
                          } else {
                            if (-4 > (kr.field_vb ^ -1)) {
                              ct.c(-4 + kr.field_vb, -126);
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        } else {
                          L6: {
                            if (!var4.a(gd.field_m, (byte) 116, mk.field_p)) {
                              break L6;
                            } else {
                              var3_int = 1;
                              if (kr.field_vb <= 3) {
                                ct.c(4 + kr.field_vb, -113);
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var4 = (jfa) ((Object) this.field_d.field_c.field_m.c(0));
                          continue L4;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                this.f((byte) -85);
                break L1;
              } else {
                break L1;
              }
            }
            L7: {
              if (this.field_i) {
                break L7;
              } else {
                if (this.field_s != null) {
                  break L7;
                } else {
                  this.field_d.field_c.e((byte) 46);
                  break L7;
                }
              }
            }
            L8: {
              if (this.field_e == pha.field_g) {
                break L8;
              } else {
                if (vr.field_b % this.field_e != 0) {
                  break L8;
                } else {
                  this.a(-91);
                  break L8;
                }
              }
            }
            L9: {
              if (this.field_i) {
                break L9;
              } else {
                this.field_l = -1;
                this.field_g = -1;
                this.field_q = null;
                break L9;
              }
            }
            L10: {
              if (!this.field_i) {
                break L10;
              } else {
                if (this.field_q == null) {
                  break L10;
                } else {
                  if (0 >= this.field_o) {
                    this.field_q.b(true);
                    break L10;
                  } else {
                    break L10;
                  }
                }
              }
            }
            L11: {
              if ((this.field_n ^ -1) >= -1) {
                break L11;
              } else {
                this.field_n = this.field_n - 1;
                break L11;
              }
            }
            L12: {
              if ((this.field_o ^ -1) >= -1) {
                break L12;
              } else {
                this.field_o = this.field_o - 1;
                break L12;
              }
            }
            L13: {
              if (this.field_m != au.field_c) {
                L14: {
                  if (1 != au.field_c) {
                    if ((au.field_c ^ -1) == -6) {
                      qm.a(19, 7758);
                      break L14;
                    } else {
                      if ((au.field_c ^ -1) == -3) {
                        qm.a(27, 7758);
                        break L14;
                      } else {
                        if (au.field_c != 3) {
                          if (-1 != au.field_c) {
                            break L14;
                          } else {
                            if (this.field_m == 5) {
                              qm.a(20, 7758);
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                        } else {
                          qm.a(22, 7758);
                          break L14;
                        }
                      }
                    }
                  } else {
                    qm.a(28, 7758);
                    break L14;
                  }
                }
                this.field_m = au.field_c;
                break L13;
              } else {
                break L13;
              }
            }
            if (!param0) {
              L15: {
                au.field_c = -1;
                if (!param1) {
                  this.field_d.field_c.field_k.e(-21060);
                  break L15;
                } else {
                  break L15;
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
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var3), "saa.N(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, boolean param2) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              gla.field_j.c(param1, 0);
              Math.sin(0.5 * ((double)vr.field_b / 10.0));
              if (!this.field_p) {
                L2: {
                  if (!sn.field_m.field_T) {
                    break L2;
                  } else {
                    if (this.field_d.field_c.field_k.field_a != 0) {
                      rfa.field_a.e(param1 + 418, 31);
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                bh.field_r.e(param1 + 418, 41);
                break L1;
              } else {
                break L1;
              }
            }
            L3: {
              iea.field_a.a(param1 + 524, 420, 64);
              op.field_u.e(param1 + 540, 424);
              dp.field_n[5].e(524 + param1, 300);
              if ((this.field_n ^ -1) >= -1) {
                L4: {
                  L5: {
                    if (d.field_H.field_T) {
                      break L5;
                    } else {
                      if (!this.b(true)) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (this.field_d.field_c.field_k.field_a == 0) {
                    break L4;
                  } else {
                    if (this.field_i) {
                      break L4;
                    } else {
                      dp.field_n[0].e(param1 + 524, 300);
                      break L3;
                    }
                  }
                }
                dp.field_n[2].e(param1 + 524, 300);
                break L3;
              } else {
                if (8 >= this.field_n) {
                  if ((this.field_n ^ -1) < -5) {
                    dp.field_n[4].e(param1 + 524, 300);
                    break L3;
                  } else {
                    if (this.field_n <= 0) {
                      break L3;
                    } else {
                      dp.field_n[0].e(524 + param1, 300);
                      break L3;
                    }
                  }
                } else {
                  dp.field_n[3].e(param1 + 524, 300);
                  break L3;
                }
              }
            }
            L6: {
              this.field_d.field_c.a(-125, param1);
              if (!this.field_i) {
                break L6;
              } else {
                if (this.field_q != null) {
                  dg.g(0, 0, 640, 480);
                  this.field_q.a(param2, 117);
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            L7: {
              if (this.field_s == null) {
                break L7;
              } else {
                dg.g(0, 0, 640, 480);
                this.field_s.e(param0 + -2);
                break L7;
              }
            }
            L8: {
              if (!af.field_a) {
                break L8;
              } else {
                if (param2) {
                  kla.b(true);
                  break L8;
                } else {
                  break L8;
                }
              }
            }
            L9: {
              if (param0 == 2) {
                break L9;
              } else {
                this.f((byte) 60);
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var4), "saa.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(byte param0) {
        boolean discarded$0 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        jfa var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              mg.field_m.field_e.field_i = this.field_d.field_c.field_i;
              var2_int = 0;
              if (param0 >= 29) {
                break L1;
              } else {
                discarded$0 = this.b(false);
                break L1;
              }
            }
            L2: while (true) {
              if (6 <= var2_int) {
                mg.field_m.field_e.field_m = new eaa();
                var2 = (jfa) ((Object) this.field_d.field_c.field_m.b((byte) 90));
                L3: while (true) {
                  if (var2 == null) {
                    mg.field_m.field_i = new rk[50];
                    var5 = 0;
                    var3 = var5;
                    L4: while (true) {
                      if (-51 >= (var5 ^ -1)) {
                        mg.field_m.field_c = this.field_d.field_c.field_n;
                        mg.field_m.field_f = this.field_d.field_c.field_k.field_o;
                        break L0;
                      } else {
                        L5: {
                          if (null != this.field_d.field_c.field_r[var5]) {
                            mg.field_m.field_i[var5] = this.field_d.field_c.field_r[var5].field_g;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var5++;
                        continue L4;
                      }
                    }
                  } else {
                    mg.field_m.field_e.field_m.a(var2.field_g, true);
                    var2 = (jfa) ((Object) this.field_d.field_c.field_m.c(0));
                    continue L3;
                  }
                }
              } else {
                var3 = 0;
                L6: while (true) {
                  if (-11 >= (var3 ^ -1)) {
                    var2_int++;
                    continue L2;
                  } else {
                    if (mg.field_m.field_e.field_i[var2_int][var3].field_f != null) {
                      mg.field_m.field_e.field_i[var2_int][var3].field_f.a(true);
                      var3++;
                      continue L6;
                    } else {
                      var3++;
                      continue L6;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2_ref), "saa.B(" + param0 + ')');
        }
    }

    final void b(boolean param0, boolean param1) {
        int var4 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_20_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            if (!param1) {
              L1: {
                this.field_d.field_c.field_k.d(-123);
                this.field_q = null;
                ln.e(-122);
                mea.e((byte) 90);
                if (bp.e(-29919)) {
                  if (!hs.a(false, nga.field_i)) {
                    lg.a(true, 0, param0);
                    break L1;
                  } else {
                    L2: {
                      if (param1) {
                        stackIn_20_0 = 0;
                        break L2;
                      } else {
                        stackIn_20_0 = 1;
                        break L2;
                      }
                    }
                    lg.a(stackIn_20_0 != 0, 9, param0);
                    break L1;
                  }
                } else {
                  if (hs.a(false, nga.field_i)) {
                    L3: {
                      if (param1) {
                        stackIn_14_0 = 0;
                        break L3;
                      } else {
                        stackIn_14_0 = 1;
                        break L3;
                      }
                    }
                    lg.a(stackIn_14_0 != 0, 8, param0);
                    break L1;
                  } else {
                    L4: {
                      if (param1) {
                        stackIn_9_0 = 0;
                        break L4;
                      } else {
                        stackIn_9_0 = 1;
                        break L4;
                      }
                    }
                    lg.a(stackIn_9_0 != 0, 0, param0);
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
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var3), "saa.O(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void e(byte param0) {
        try {
            if (param0 != 8) {
                field_u = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "saa.E(" + param0 + ')');
        }
    }

    saa(String param0) {
        nl discarded$1 = null;
        int[] var2 = null;
        int var3 = 0;
        int[] var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        this.field_e = ea.field_d;
        try {
          L0: {
            this.field_d = new ua(param0, mg.field_m);
            this.field_d.field_c.a(false, (saa) (this));
            this.c((byte) 13);
            discarded$1 = new nl(this.field_d.field_c);
            this.a(false);
            this.field_g = -1;
            this.field_l = -1;
            var5 = nga.field_i;
            var2 = var5;
            var3 = 0;
            L1: while (true) {
              if (-9 >= (var3 ^ -1)) {
                break L0;
              } else {
                var5[var3] = 0;
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2_ref);

            stackIn_8_1 = new StringBuilder().append("saa.<init>(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    static {
        field_b = 20;
        field_u = "Player names can be up to 12 letters, numbers and underscores";
        field_r = "Disruptive behaviour";
    }
}
