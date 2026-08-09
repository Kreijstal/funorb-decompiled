/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di {
    private boolean field_e;
    private ei[] field_b;
    private d field_c;
    static boolean[] field_f;
    iqa field_i;
    static int field_a;
    static boolean[] field_g;
    static String field_h;
    static iw field_d;

    final void a(int param0, ei[] param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            if (param0 == 0) {
              L1: {
                if (param1 != this.field_b) {
                  if (-1 != (param1.length ^ -1)) {
                    this.field_e = false;
                    this.field_b = param1;
                    break L1;
                  } else {
                    throw new IllegalArgumentException();
                  }
                } else {
                  break L1;
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
          L2: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("di.A(").append(param0).append(',');

            if (param1 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void c(int param0) {
        field_g = null;
        field_f = null;
        if (param0 != -22765) {
            return;
        }
        field_h = null;
        field_d = null;
    }

    di(d param0, ei[] param1) {
        this(tba.a((byte) 98), cfa.e(-1), param0, dsa.field_c, param1);
    }

    final boolean b(int param0) {
        if (param0 != 100663296) {
            return false;
        }
        return this.a(-101, kw.b((byte) -97));
    }

    final static void a(byte param0, boolean param1) {
        int var3;
        L0: {
          L1: {
            var3 = TombRacer.field_G ? 1 : 0;
            if (param1) {
              break L1;
            } else {
              if (uu.field_a != null) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          tla.field_e = false;
          break L0;
        }
        L2: {
          if (param1) {
            if (mla.field_a > 0) {
              mla.field_a = mla.field_a - 1;
              break L2;
            } else {
              if ((gt.field_a ^ -1) < -1) {
                gt.field_a = gt.field_a - 1;
                break L2;
              } else {
                if ((fp.field_e ^ -1) >= -1) {
                  break L2;
                } else {
                  fp.field_e = fp.field_e - 1;
                  break L2;
                }
              }
            }
          } else {
            if (null == uu.field_a) {
              if (ifa.field_n == null) {
                tla.field_e = false;
                if (0 < gt.field_a) {
                  gt.field_a = gt.field_a - 1;
                  break L2;
                } else {
                  if (0 < fp.field_e) {
                    fp.field_e = fp.field_e - 1;
                    break L2;
                  } else {
                    if (mla.field_a < pna.field_q) {
                      L3: {
                        if (mla.field_a != 0) {
                          break L3;
                        } else {
                          csa.a(false);
                          break L3;
                        }
                      }
                      mla.field_a = mla.field_a + 1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              } else {
                if (-1 > (mla.field_a ^ -1)) {
                  mla.field_a = mla.field_a - 1;
                  break L2;
                } else {
                  if (fp.field_e <= 0) {
                    if (pna.field_q <= gt.field_a) {
                      break L2;
                    } else {
                      L4: {
                        if (gt.field_a != 0) {
                          break L4;
                        } else {
                          iw.a((byte) -64, true);
                          break L4;
                        }
                      }
                      gt.field_a = gt.field_a + 1;
                      break L2;
                    }
                  } else {
                    fp.field_e = fp.field_e - 1;
                    break L2;
                  }
                }
              }
            } else {
              if (0 < mla.field_a) {
                mla.field_a = mla.field_a - 1;
                break L2;
              } else {
                if ((gt.field_a ^ -1) < -1) {
                  gt.field_a = gt.field_a - 1;
                  break L2;
                } else {
                  if (fp.field_e < pna.field_q) {
                    L5: {
                      if (0 != fp.field_e) {
                        break L5;
                      } else {
                        iw.a((byte) -64, false);
                        break L5;
                      }
                    }
                    fp.field_e = fp.field_e + 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
        }
        L6: {
          if (param0 == -98) {
            break L6;
          } else {
            di.a(57);
            break L6;
          }
        }
    }

    private final void a(java.awt.Canvas param0, byte param1) {
        Object stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        Object stackIn_114_0 = null;
        StringBuilder stackIn_114_1 = null;
        String stackIn_114_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var3 = null;
        int var4 = 0;
        ei[] var5 = null;
        int var6 = 0;
        ei var7 = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9_int = 0;
        iqa var9 = null;
        int var10 = 0;
        int var11 = 0;
        ha var12 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3 = null;
            var4 = -34 / ((53 - param1) / 58);
            var5 = this.field_b;
            var6 = 0;
            L1: while (true) {
              if (var5.length <= var6) {
                decompiledRegionSelector1 = 0;
                break L0;
              } else {
                L2: {
                  var7 = var5[var6];
                  if (var7.field_c) {
                    L3: {
                      var8_int = var7.field_b;
                      if (-1 != (var8_int ^ -1)) {
                        if (var8_int == 5) {
                          if (lga.field_B.b(-35)) {
                            var8_int = sma.a("hw3d", 28893);
                            if (0 != (var8_int ^ -1)) {
                              if (var8_int >= 100) {
                                var9_int = sma.a("jaclib", 28893);
                                if ((var9_int ^ -1) != 0) {
                                  if (-101 < (var9_int ^ -1)) {
                                    decompiledRegionSelector1 = 3;
                                    break L0;
                                  } else {
                                    var10 = sma.a("jaggl", 28893);
                                    if (0 != (var10 ^ -1)) {
                                      if (var10 < 100) {
                                        decompiledRegionSelector1 = 4;
                                        break L0;
                                      } else {
                                        break L3;
                                      }
                                    } else {
                                      var7.field_c = false;
                                      break L2;
                                    }
                                  }
                                } else {
                                  var7.field_c = false;
                                  break L2;
                                }
                              } else {
                                decompiledRegionSelector1 = 2;
                                break L0;
                              }
                            } else {
                              var7.field_c = false;
                              break L2;
                            }
                          } else {
                            decompiledRegionSelector1 = 1;
                            break L0;
                          }
                        } else {
                          if (1 != var8_int) {
                            if (var8_int != 3) {
                              if ((var8_int ^ -1) != -3) {
                                throw new IllegalStateException("UT" + var7.field_b);
                              } else {
                                if (!lga.field_B.b(-63)) {
                                  decompiledRegionSelector1 = 12;
                                  break L0;
                                } else {
                                  var8_int = sma.a("jaclib", 28893);
                                  if (-1 == var8_int) {
                                    var7.field_c = false;
                                    break L2;
                                  } else {
                                    if (100 > var8_int) {
                                      decompiledRegionSelector1 = 13;
                                      break L0;
                                    } else {
                                      var9_int = sma.a("sw3d", 28893);
                                      if ((var9_int ^ -1) != 0) {
                                        if (-101 >= (var9_int ^ -1)) {
                                          break L3;
                                        } else {
                                          decompiledRegionSelector1 = 14;
                                          break L0;
                                        }
                                      } else {
                                        var7.field_c = false;
                                        break L2;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              if (!lga.field_B.b(-63)) {
                                decompiledRegionSelector1 = 8;
                                break L0;
                              } else {
                                var8_int = sma.a("jaclib", 28893);
                                if (0 != (var8_int ^ -1)) {
                                  if (-101 >= (var8_int ^ -1)) {
                                    var9_int = sma.a("jagdx", 28893);
                                    if (var9_int == -1) {
                                      var7.field_c = false;
                                      break L2;
                                    } else {
                                      if (100 <= var9_int) {
                                        var10 = sma.a("hw3d", 28893);
                                        if (-1 == var10) {
                                          var7.field_c = false;
                                          break L2;
                                        } else {
                                          if (var10 < 100) {
                                            decompiledRegionSelector1 = 11;
                                            break L0;
                                          } else {
                                            break L3;
                                          }
                                        }
                                      } else {
                                        decompiledRegionSelector1 = 10;
                                        break L0;
                                      }
                                    }
                                  } else {
                                    decompiledRegionSelector1 = 9;
                                    break L0;
                                  }
                                } else {
                                  var7.field_c = false;
                                  break L2;
                                }
                              }
                            }
                          } else {
                            if (lga.field_B.b(-53)) {
                              var8_int = sma.a("jaclib", 28893);
                              if ((var8_int ^ -1) == 0) {
                                var7.field_c = false;
                                break L2;
                              } else {
                                if (100 > var8_int) {
                                  decompiledRegionSelector1 = 6;
                                  break L0;
                                } else {
                                  var9_int = sma.a("jaggl", 28893);
                                  if (-1 != var9_int) {
                                    if (var9_int < 100) {
                                      decompiledRegionSelector1 = 7;
                                      break L0;
                                    } else {
                                      break L3;
                                    }
                                  } else {
                                    var7.field_c = false;
                                    break L2;
                                  }
                                }
                              }
                            } else {
                              decompiledRegionSelector1 = 5;
                              break L0;
                            }
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      if (null == this.field_i) {
                        break L4;
                      } else {
                        L5: {
                          if (!this.field_i.field_b.a(var7, 55)) {
                            break L5;
                          } else {
                            if (null == this.field_i.field_d) {
                              break L5;
                            } else {
                              if (this.field_i.field_a != param0) {
                                break L5;
                              } else {
                                if (!var7.a(this.field_i, (byte) -126)) {
                                  break L5;
                                } else {
                                  this.field_e = true;
                                  decompiledRegionSelector1 = 15;
                                  break L0;
                                }
                              }
                            }
                          }
                        }
                        if (this.field_i.field_b.field_b != var7.field_b) {
                          break L4;
                        } else {
                          if (this.field_i.field_d == null) {
                            break L4;
                          } else {
                            var3 = this.field_i.a((byte) -43);
                            this.field_i.field_d.a(true);
                            this.field_i = null;
                            break L4;
                          }
                        }
                      }
                    }
                    try {
                      L6: {
                        L7: {
                          var12 = nw.a(var7.field_a, -29355, this.field_c, var7.field_b, ck.field_a, param0);
                          if (var12 != null) {
                            var9 = new iqa(var12, var7, param0);
                            if (!var7.a(var9, (byte) -126)) {
                              break L7;
                            } else {
                              L8: {
                                if (this.field_i == null) {
                                  break L8;
                                } else {
                                  L9: {
                                    if (var9.field_d != this.field_i.field_d) {
                                      break L9;
                                    } else {
                                      if (this.field_i.field_a != var9.field_a) {
                                        break L9;
                                      } else {
                                        this.field_e = true;
                                        this.field_i = var9;
                                        decompiledRegionSelector0 = 1;
                                        break L6;
                                      }
                                    }
                                  }
                                  var3 = this.field_i.a((byte) -124);
                                  this.field_i.field_d.a(true);
                                  break L8;
                                }
                              }
                              L10: {
                                if (!var9.field_d.j()) {
                                  break L10;
                                } else {
                                  var9.field_d.a(var9.field_d.a(100663296));
                                  break L10;
                                }
                              }
                              L11: {
                                if (var3 == null) {
                                  var9.field_f = bva.b((byte) -107);
                                  break L11;
                                } else {
                                  ((soa) (var3)).a((byte) -77, var9);
                                  break L11;
                                }
                              }
                              this.field_e = true;
                              this.field_i = var9;
                              decompiledRegionSelector0 = 2;
                              break L6;
                            }
                          } else {
                            break L7;
                          }
                        }
                        decompiledRegionSelector0 = 0;
                        break L6;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L12: {
                        var8 = decompiledCaughtException;
                        var8.printStackTrace();
                        decompiledRegionSelector0 = 0;
                        break L12;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      var7.field_c = false;
                      break L2;
                    } else {
                      if (decompiledRegionSelector0 == 1) {
                        decompiledRegionSelector1 = 16;
                        break L0;
                      } else {
                        decompiledRegionSelector1 = 17;
                        break L0;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L13: {
            var3 = decompiledCaughtException;
            stackIn_113_0 = var3;

            stackIn_113_1 = new StringBuilder().append("di.E(");

            if (param0 == null) {
              stackIn_114_0 = stackIn_113_0;
              stackIn_114_1 = (StringBuilder) ((Object) stackIn_113_1);
              stackIn_114_2 = "null";
              break L13;
            } else {
              stackIn_114_0 = stackIn_113_0;
              stackIn_114_1 = (StringBuilder) ((Object) stackIn_113_1);
              stackIn_114_2 = "{...}";
              break L13;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_114_0), stackIn_114_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return;
            } else {
              if (decompiledRegionSelector1 == 3) {
                return;
              } else {
                if (decompiledRegionSelector1 == 4) {
                  return;
                } else {
                  if (decompiledRegionSelector1 == 5) {
                    return;
                  } else {
                    if (decompiledRegionSelector1 == 6) {
                      return;
                    } else {
                      if (decompiledRegionSelector1 == 7) {
                        return;
                      } else {
                        if (decompiledRegionSelector1 == 8) {
                          return;
                        } else {
                          if (decompiledRegionSelector1 == 9) {
                            return;
                          } else {
                            if (decompiledRegionSelector1 == 10) {
                              return;
                            } else {
                              if (decompiledRegionSelector1 == 11) {
                                return;
                              } else {
                                if (decompiledRegionSelector1 == 12) {
                                  return;
                                } else {
                                  if (decompiledRegionSelector1 == 13) {
                                    return;
                                  } else {
                                    if (decompiledRegionSelector1 == 14) {
                                      return;
                                    } else {
                                      if (decompiledRegionSelector1 == 15) {
                                        return;
                                      } else {
                                        if (decompiledRegionSelector1 == 16) {
                                          return;
                                        } else {
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
                }
              }
            }
          }
        }
    }

    private final boolean a(int param0, java.awt.Canvas param1) {
        iqa var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -101) {
                break L1;
              } else {
                this.field_e = true;
                break L1;
              }
            }
            L2: {
              L3: {
                var3 = this.field_i;
                if (var3 == null) {
                  break L3;
                } else {
                  if (!this.field_e) {
                    break L3;
                  } else {
                    if (var3.field_a == param1) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              this.a(param1, (byte) -70);
              break L2;
            }
            L4: {
              if (null != this.field_i) {
                this.field_i.field_d.c((int)(bva.b((byte) -107) - this.field_i.field_f));
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              L6: {
                if (null == this.field_i) {
                  break L6;
                } else {
                  L7: {
                    if (var3 == null) {
                      break L7;
                    } else {
                      if (var3.field_d == this.field_i.field_d) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  stackIn_16_0 = 1;
                  break L5;
                }
              }
              stackIn_16_0 = 0;
              break L5;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("di.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L8;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        return stackIn_16_0 != 0;
    }

    private di(cn param0, cn param1, d param2, fia param3, ei[] param4) {
        this.field_e = false;
        try {
            this.field_c = param2;
            ck.field_a = param1;
            lga.field_B = param0;
            vsa.a(param0, param3, -55);
            this.a(0, param4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "di.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(uia param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = param0.h(255);
              if (param1 == 107) {
                break L1;
              } else {
                field_g = (boolean[]) null;
                break L1;
              }
            }
            L2: {
              if ((var2_int ^ -1) != -2) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            var3 = stackIn_5_0;
            stackIn_6_0 = var3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("di.F(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0 != 0;
    }

    final static java.applet.Applet a(int param0) {
        if (param0 <= 16) {
            field_d = (iw) null;
        }
        if (!(cba.field_a == null)) {
            return cba.field_a;
        }
        return (java.applet.Applet) ((Object) kua.field_j);
    }

    static {
        field_f = new boolean[13];
        field_g = new boolean[13];
        field_h = "Ask to join <%0>'s game";
        field_g[6] = true;
        field_g[0] = true;
        field_f[0] = true;
        field_f[6] = true;
        field_f[1] = true;
        field_f[12] = true;
        field_f[4] = true;
        field_f[10] = true;
        field_d = new iw();
    }
}
