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
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
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
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("di.A(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
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
        java.applet.Applet discarded$1 = null;
        int var3 = 0;
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
          L3: {
            if (param1) {
              break L3;
            } else {
              L4: {
                if (null == uu.field_a) {
                  break L4;
                } else {
                  L5: {
                    if (0 < mla.field_a) {
                      break L5;
                    } else {
                      L6: {
                        if ((gt.field_a ^ -1) < -1) {
                          break L6;
                        } else {
                          if (fp.field_e < pna.field_q) {
                            L7: {
                              if (0 != fp.field_e) {
                                break L7;
                              } else {
                                iw.a((byte) -64, false);
                                break L7;
                              }
                            }
                            fp.field_e = fp.field_e + 1;
                            if (var3 == 0) {
                              break L2;
                            } else {
                              break L6;
                            }
                          } else {
                            break L2;
                          }
                        }
                      }
                      gt.field_a = gt.field_a - 1;
                      if (var3 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  mla.field_a = mla.field_a - 1;
                  if (var3 == 0) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              L8: {
                if (ifa.field_n == null) {
                  break L8;
                } else {
                  L9: {
                    if (-1 > (mla.field_a ^ -1)) {
                      break L9;
                    } else {
                      L10: {
                        if (fp.field_e <= 0) {
                          break L10;
                        } else {
                          fp.field_e = fp.field_e - 1;
                          if (var3 == 0) {
                            break L2;
                          } else {
                            break L10;
                          }
                        }
                      }
                      if (pna.field_q <= gt.field_a) {
                        break L2;
                      } else {
                        L11: {
                          if (gt.field_a != 0) {
                            break L11;
                          } else {
                            iw.a((byte) -64, true);
                            break L11;
                          }
                        }
                        gt.field_a = gt.field_a + 1;
                        if (var3 == 0) {
                          break L2;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  mla.field_a = mla.field_a - 1;
                  if (var3 == 0) {
                    break L2;
                  } else {
                    break L8;
                  }
                }
              }
              L12: {
                tla.field_e = false;
                if (0 < gt.field_a) {
                  break L12;
                } else {
                  L13: {
                    if (0 < fp.field_e) {
                      break L13;
                    } else {
                      if (mla.field_a < pna.field_q) {
                        L14: {
                          if (mla.field_a != 0) {
                            break L14;
                          } else {
                            csa.a(false);
                            break L14;
                          }
                        }
                        mla.field_a = mla.field_a + 1;
                        if (var3 == 0) {
                          break L2;
                        } else {
                          break L13;
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                  fp.field_e = fp.field_e - 1;
                  if (var3 == 0) {
                    break L2;
                  } else {
                    break L12;
                  }
                }
              }
              gt.field_a = gt.field_a - 1;
              if (var3 == 0) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          L15: {
            if (mla.field_a > 0) {
              break L15;
            } else {
              L16: {
                if ((gt.field_a ^ -1) < -1) {
                  break L16;
                } else {
                  if ((fp.field_e ^ -1) >= -1) {
                    break L2;
                  } else {
                    fp.field_e = fp.field_e - 1;
                    if (var3 == 0) {
                      break L2;
                    } else {
                      break L16;
                    }
                  }
                }
              }
              gt.field_a = gt.field_a - 1;
              if (var3 == 0) {
                break L2;
              } else {
                break L15;
              }
            }
          }
          mla.field_a = mla.field_a - 1;
          break L2;
        }
        L17: {
          if (param0 == -98) {
            break L17;
          } else {
            discarded$1 = di.a(57);
            break L17;
          }
        }
    }

    private final void a(java.awt.Canvas param0, byte param1) {
        Object var3 = null;
        int var4 = 0;
        ei[] var5 = null;
        int var6 = 0;
        Object var7 = null;
        ei var7_ref = null;
        RuntimeException var8 = null;
        int var8_int = 0;
        iqa var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        ha var12 = null;
        Object stackIn_125_0 = null;
        StringBuilder stackIn_125_1 = null;
        Object stackIn_126_0 = null;
        StringBuilder stackIn_126_1 = null;
        Object stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        String stackIn_127_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_124_0 = null;
        StringBuilder stackOut_124_1 = null;
        Object stackOut_126_0 = null;
        StringBuilder stackOut_126_1 = null;
        String stackOut_126_2 = null;
        Object stackOut_125_0 = null;
        StringBuilder stackOut_125_1 = null;
        String stackOut_125_2 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3 = null;
            var4 = -34 / ((53 - param1) / 58);
            var5 = this.field_b;
            var6 = 0;
            L1: while (true) {
              L2: {
                if (var5.length <= var6) {
                  break L2;
                } else {
                  var7_ref = var5[var6];
                  if (var11 != 0) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        if (var7_ref.field_c) {
                          break L4;
                        } else {
                          if (var11 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        L6: {
                          var8_int = var7_ref.field_b;
                          if (-1 != (var8_int ^ -1)) {
                            break L6;
                          } else {
                            if (var11 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L7: {
                          if (var8_int == 5) {
                            break L7;
                          } else {
                            L8: {
                              if (1 != var8_int) {
                                break L8;
                              } else {
                                if (var11 == 0) {
                                  if (lga.field_B.b(-53)) {
                                    L9: {
                                      var8_int = sma.a("jaclib", 28893);
                                      if ((var8_int ^ -1) == 0) {
                                        var7_ref.field_c = false;
                                        if (var11 == 0) {
                                          break L3;
                                        } else {
                                          break L9;
                                        }
                                      } else {
                                        break L9;
                                      }
                                    }
                                    if (100 > var8_int) {
                                      decompiledRegionSelector1 = 6;
                                      break L0;
                                    } else {
                                      L10: {
                                        var9_int = sma.a("jaggl", 28893);
                                        if (-1 != var9_int) {
                                          break L10;
                                        } else {
                                          var7_ref.field_c = false;
                                          if (var11 == 0) {
                                            break L3;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                      if (var9_int < 100) {
                                        decompiledRegionSelector1 = 7;
                                        break L0;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  } else {
                                    decompiledRegionSelector1 = 5;
                                    break L0;
                                  }
                                } else {
                                  break L8;
                                }
                              }
                            }
                            L11: {
                              if (var8_int != 3) {
                                break L11;
                              } else {
                                if (var11 == 0) {
                                  if (!lga.field_B.b(-63)) {
                                    decompiledRegionSelector1 = 8;
                                    break L0;
                                  } else {
                                    L12: {
                                      var8_int = sma.a("jaclib", 28893);
                                      if (0 != (var8_int ^ -1)) {
                                        break L12;
                                      } else {
                                        var7_ref.field_c = false;
                                        if (var11 == 0) {
                                          break L3;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                    if (-101 >= (var8_int ^ -1)) {
                                      L13: {
                                        var9_int = sma.a("jagdx", 28893);
                                        if (var9_int == -1) {
                                          var7_ref.field_c = false;
                                          if (var11 == 0) {
                                            break L3;
                                          } else {
                                            break L13;
                                          }
                                        } else {
                                          break L13;
                                        }
                                      }
                                      if (100 <= var9_int) {
                                        L14: {
                                          var10 = sma.a("hw3d", 28893);
                                          if (-1 == var10) {
                                            var7_ref.field_c = false;
                                            if (var11 == 0) {
                                              break L3;
                                            } else {
                                              break L14;
                                            }
                                          } else {
                                            break L14;
                                          }
                                        }
                                        if (var10 < 100) {
                                          decompiledRegionSelector1 = 11;
                                          break L0;
                                        } else {
                                          break L5;
                                        }
                                      } else {
                                        decompiledRegionSelector1 = 10;
                                        break L0;
                                      }
                                    } else {
                                      decompiledRegionSelector1 = 9;
                                      break L0;
                                    }
                                  }
                                } else {
                                  break L11;
                                }
                              }
                            }
                            if ((var8_int ^ -1) != -3) {
                              throw new IllegalStateException("UT" + var7_ref.field_b);
                            } else {
                              if (var11 == 0) {
                                if (!lga.field_B.b(-63)) {
                                  decompiledRegionSelector1 = 12;
                                  break L0;
                                } else {
                                  L15: {
                                    var8_int = sma.a("jaclib", 28893);
                                    if (-1 == var8_int) {
                                      var7_ref.field_c = false;
                                      if (var11 == 0) {
                                        break L3;
                                      } else {
                                        break L15;
                                      }
                                    } else {
                                      break L15;
                                    }
                                  }
                                  if (100 > var8_int) {
                                    decompiledRegionSelector1 = 13;
                                    break L0;
                                  } else {
                                    L16: {
                                      var9_int = sma.a("sw3d", 28893);
                                      if ((var9_int ^ -1) != 0) {
                                        break L16;
                                      } else {
                                        var7_ref.field_c = false;
                                        if (var11 == 0) {
                                          break L3;
                                        } else {
                                          break L16;
                                        }
                                      }
                                    }
                                    if (-101 >= (var9_int ^ -1)) {
                                      break L5;
                                    } else {
                                      decompiledRegionSelector1 = 14;
                                      break L0;
                                    }
                                  }
                                }
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        if (lga.field_B.b(-35)) {
                          L17: {
                            var8_int = sma.a("hw3d", 28893);
                            if (0 != (var8_int ^ -1)) {
                              break L17;
                            } else {
                              var7_ref.field_c = false;
                              if (var11 == 0) {
                                break L3;
                              } else {
                                break L17;
                              }
                            }
                          }
                          if (var8_int >= 100) {
                            L18: {
                              var9_int = sma.a("jaclib", 28893);
                              if ((var9_int ^ -1) != 0) {
                                break L18;
                              } else {
                                var7_ref.field_c = false;
                                if (var11 == 0) {
                                  break L3;
                                } else {
                                  break L18;
                                }
                              }
                            }
                            if (-101 < (var9_int ^ -1)) {
                              decompiledRegionSelector1 = 3;
                              break L0;
                            } else {
                              L19: {
                                var10 = sma.a("jaggl", 28893);
                                if (0 != (var10 ^ -1)) {
                                  break L19;
                                } else {
                                  var7_ref.field_c = false;
                                  if (var11 == 0) {
                                    break L3;
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                              if (var10 < 100) {
                                decompiledRegionSelector1 = 4;
                                break L0;
                              } else {
                                break L5;
                              }
                            }
                          } else {
                            decompiledRegionSelector1 = 2;
                            break L0;
                          }
                        } else {
                          decompiledRegionSelector1 = 1;
                          break L0;
                        }
                      }
                      L20: {
                        if (null == this.field_i) {
                          break L20;
                        } else {
                          L21: {
                            if (!this.field_i.field_b.a(var7_ref, 55)) {
                              break L21;
                            } else {
                              if (null == this.field_i.field_d) {
                                break L21;
                              } else {
                                if (this.field_i.field_a != param0) {
                                  break L21;
                                } else {
                                  if (!var7_ref.a(this.field_i, (byte) -126)) {
                                    break L21;
                                  } else {
                                    this.field_e = true;
                                    decompiledRegionSelector1 = 15;
                                    break L0;
                                  }
                                }
                              }
                            }
                          }
                          if (this.field_i.field_b.field_b != var7_ref.field_b) {
                            break L20;
                          } else {
                            if (this.field_i.field_d == null) {
                              break L20;
                            } else {
                              var3 = this.field_i.a((byte) -43);
                              this.field_i.field_d.a(true);
                              this.field_i = null;
                              break L20;
                            }
                          }
                        }
                      }
                      try {
                        L22: {
                          L23: {
                            var12 = nw.a(var7_ref.field_a, -29355, this.field_c, var7_ref.field_b, ck.field_a, param0);
                            if (var12 != null) {
                              var9 = new iqa(var12, var7_ref, param0);
                              if (!var7_ref.a(var9, (byte) -126)) {
                                break L23;
                              } else {
                                L24: {
                                  if (this.field_i == null) {
                                    break L24;
                                  } else {
                                    L25: {
                                      if (var9.field_d != this.field_i.field_d) {
                                        break L25;
                                      } else {
                                        if (this.field_i.field_a != var9.field_a) {
                                          break L25;
                                        } else {
                                          this.field_e = true;
                                          this.field_i = var9;
                                          decompiledRegionSelector0 = 1;
                                          break L22;
                                        }
                                      }
                                    }
                                    var3 = this.field_i.a((byte) -124);
                                    this.field_i.field_d.a(true);
                                    break L24;
                                  }
                                }
                                L26: {
                                  if (!var9.field_d.j()) {
                                    break L26;
                                  } else {
                                    var9.field_d.a(var9.field_d.a(100663296));
                                    break L26;
                                  }
                                }
                                L27: {
                                  L28: {
                                    if (var3 == null) {
                                      break L28;
                                    } else {
                                      ((soa) (var3)).a((byte) -77, var9);
                                      if (var11 == 0) {
                                        break L27;
                                      } else {
                                        break L28;
                                      }
                                    }
                                  }
                                  var9.field_f = bva.b((byte) -107);
                                  break L27;
                                }
                                this.field_e = true;
                                this.field_i = var9;
                                decompiledRegionSelector0 = 2;
                                break L22;
                              }
                            } else {
                              break L23;
                            }
                          }
                          decompiledRegionSelector0 = 0;
                          break L22;
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L29: {
                          var8 = decompiledCaughtException;
                          var8.printStackTrace();
                          decompiledRegionSelector0 = 0;
                          break L29;
                        }
                      }
                      if (decompiledRegionSelector0 == 0) {
                        var7_ref.field_c = false;
                        break L3;
                      } else {
                        if (decompiledRegionSelector0 == 1) {
                          decompiledRegionSelector1 = 16;
                          break L0;
                        } else {
                          decompiledRegionSelector1 = 17;
                          break L0;
                        }
                      }
                    }
                    var6++;
                    if (var11 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              decompiledRegionSelector1 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L30: {
            var3 = decompiledCaughtException;
            stackOut_124_0 = var3;
            stackOut_124_1 = new StringBuilder().append("di.E(");
            stackIn_126_0 = stackOut_124_0;
            stackIn_126_1 = stackOut_124_1;
            stackIn_125_0 = stackOut_124_0;
            stackIn_125_1 = stackOut_124_1;
            if (param0 == null) {
              stackOut_126_0 = stackIn_126_0;
              stackOut_126_1 = (StringBuilder) ((Object) stackIn_126_1);
              stackOut_126_2 = "null";
              stackIn_127_0 = stackOut_126_0;
              stackIn_127_1 = stackOut_126_1;
              stackIn_127_2 = stackOut_126_2;
              break L30;
            } else {
              stackOut_125_0 = stackIn_125_0;
              stackOut_125_1 = (StringBuilder) ((Object) stackIn_125_1);
              stackOut_125_2 = "{...}";
              stackIn_127_0 = stackOut_125_0;
              stackIn_127_1 = stackOut_125_1;
              stackIn_127_2 = stackOut_125_2;
              break L30;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_127_0), stackIn_127_2 + ',' + param1 + ')');
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
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
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
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L5;
                }
              }
              stackOut_15_0 = 0;
              stackIn_16_0 = stackOut_15_0;
              break L5;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var3_ref);
            stackOut_17_1 = new StringBuilder().append("di.H(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L8;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
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
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
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
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            var3 = stackIn_5_0;
            stackOut_5_0 = var3;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2);
            stackOut_7_1 = new StringBuilder().append("di.F(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
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
