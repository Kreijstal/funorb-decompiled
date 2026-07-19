/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik {
    private nj[] field_a;
    private d field_e;
    static ki field_d;
    private boolean field_b;
    private bk field_c;

    private final void a(nj[] param0, int param1) {
        RuntimeException runtimeException = null;
        java.awt.Canvas var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (param1 >= 89) {
                break L1;
              } else {
                var4 = (java.awt.Canvas) null;
                this.a(127, (java.awt.Canvas) null);
                break L1;
              }
            }
            L2: {
              if (param0 == this.field_a) {
                break L2;
              } else {
                if (-1 != (param0.length ^ -1)) {
                  this.field_a = param0;
                  this.field_b = false;
                  break L2;
                } else {
                  throw new IllegalArgumentException();
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (runtimeException);
            stackOut_7_1 = new StringBuilder().append("ik.G(");
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
          throw qo.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    final static int c(int param0) {
        int discarded$2 = 0;
        L0: {
          if (param0 == -10517) {
            break L0;
          } else {
            discarded$2 = ik.c(113);
            break L0;
          }
        }
        if (oj.a(false)) {
          if (null == pu.field_e.e((byte) 54)) {
            return -1;
          } else {
            return pu.field_e.e((byte) 54).field_r;
          }
        } else {
          return -1;
        }
    }

    final boolean a(boolean param0) {
        if (param0) {
            this.field_e = (d) null;
        }
        return this.a(hk.b(-45), 89);
    }

    public static void b(int param0) {
        if (param0 != -1) {
            return;
        }
        field_d = null;
    }

    private final boolean a(java.awt.Canvas param0, int param1) {
        bk var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var3 = this.field_c;
                if (var3 == null) {
                  break L2;
                } else {
                  if (!this.field_b) {
                    break L2;
                  } else {
                    if (param0 != var3.field_c) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              this.a(-101, param0);
              break L1;
            }
            L3: {
              var4 = 113 / ((12 - param1) / 52);
              if (this.field_c == null) {
                break L3;
              } else {
                this.field_c.field_g.f((int)(wq.a(-116) + -this.field_c.field_f));
                break L3;
              }
            }
            L4: {
              L5: {
                if (null == this.field_c) {
                  break L5;
                } else {
                  L6: {
                    if (var3 == null) {
                      break L6;
                    } else {
                      if (this.field_c.field_g == var3.field_g) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  stackOut_11_0 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  break L4;
                }
              }
              stackOut_12_0 = 0;
              stackIn_13_0 = stackOut_12_0;
              break L4;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3_ref);
            stackOut_14_1 = new StringBuilder().append("ik.A(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L7;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L7;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        return stackIn_13_0 != 0;
    }

    private final void a(int param0, java.awt.Canvas param1) {
        ha discarded$1 = null;
        Object var3 = null;
        nj[] var4 = null;
        int var5 = 0;
        Object var6 = null;
        nj var6_ref = null;
        RuntimeException var7 = null;
        int var7_int = 0;
        bk var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        ha var11 = null;
        Object stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        Object stackIn_128_0 = null;
        StringBuilder stackIn_128_1 = null;
        Object stackIn_129_0 = null;
        StringBuilder stackIn_129_1 = null;
        String stackIn_129_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_126_0 = null;
        StringBuilder stackOut_126_1 = null;
        Object stackOut_128_0 = null;
        StringBuilder stackOut_128_1 = null;
        String stackOut_128_2 = null;
        Object stackOut_127_0 = null;
        StringBuilder stackOut_127_1 = null;
        String stackOut_127_2 = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var3 = null;
              if (param0 == -101) {
                break L1;
              } else {
                discarded$1 = this.a(-39);
                break L1;
              }
            }
            var4 = this.field_a;
            var5 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var5 >= var4.length) {
                    break L4;
                  } else {
                    var6_ref = var4[var5];
                    if (var10 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          if (var6_ref.field_f) {
                            break L6;
                          } else {
                            if (var10 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L7: {
                          L8: {
                            var7_int = var6_ref.field_c;
                            if ((var7_int ^ -1) != -1) {
                              break L8;
                            } else {
                              if (var10 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L9: {
                            if (var7_int == 5) {
                              break L9;
                            } else {
                              L10: {
                                if (1 != var7_int) {
                                  break L10;
                                } else {
                                  if (var10 == 0) {
                                    if (!sn.field_d.b((byte) 127)) {
                                      decompiledRegionSelector1 = 5;
                                      break L0;
                                    } else {
                                      L11: {
                                        var7_int = ig.a("jaclib", true);
                                        if (-1 != var7_int) {
                                          break L11;
                                        } else {
                                          var6_ref.field_f = false;
                                          if (var10 == 0) {
                                            break L5;
                                          } else {
                                            break L11;
                                          }
                                        }
                                      }
                                      if (100 <= var7_int) {
                                        L12: {
                                          var8_int = ig.a("jaggl", true);
                                          if (var8_int == -1) {
                                            var6_ref.field_f = false;
                                            if (var10 == 0) {
                                              break L5;
                                            } else {
                                              break L12;
                                            }
                                          } else {
                                            break L12;
                                          }
                                        }
                                        if (-101 < (var8_int ^ -1)) {
                                          decompiledRegionSelector1 = 7;
                                          break L0;
                                        } else {
                                          break L7;
                                        }
                                      } else {
                                        decompiledRegionSelector1 = 6;
                                        break L0;
                                      }
                                    }
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              if (var7_int == 3) {
                                if (sn.field_d.b((byte) 127)) {
                                  L13: {
                                    var7_int = ig.a("jaclib", true);
                                    if (var7_int == -1) {
                                      var6_ref.field_f = false;
                                      if (var10 == 0) {
                                        break L5;
                                      } else {
                                        break L13;
                                      }
                                    } else {
                                      break L13;
                                    }
                                  }
                                  if (var7_int < 100) {
                                    decompiledRegionSelector1 = 9;
                                    break L0;
                                  } else {
                                    L14: {
                                      var8_int = ig.a("jagdx", true);
                                      if ((var8_int ^ -1) != 0) {
                                        break L14;
                                      } else {
                                        var6_ref.field_f = false;
                                        if (var10 == 0) {
                                          break L5;
                                        } else {
                                          break L14;
                                        }
                                      }
                                    }
                                    if (-101 >= (var8_int ^ -1)) {
                                      L15: {
                                        var9 = ig.a("hw3d", true);
                                        if (0 == (var9 ^ -1)) {
                                          var6_ref.field_f = false;
                                          if (var10 == 0) {
                                            break L5;
                                          } else {
                                            break L15;
                                          }
                                        } else {
                                          break L15;
                                        }
                                      }
                                      if (100 <= var9) {
                                        break L7;
                                      } else {
                                        decompiledRegionSelector1 = 11;
                                        break L0;
                                      }
                                    } else {
                                      decompiledRegionSelector1 = 10;
                                      break L0;
                                    }
                                  }
                                } else {
                                  decompiledRegionSelector1 = 8;
                                  break L0;
                                }
                              } else {
                                if ((var7_int ^ -1) != -3) {
                                  throw new IllegalStateException("UT" + var6_ref.field_c);
                                } else {
                                  if (var10 == 0) {
                                    if (sn.field_d.b((byte) 127)) {
                                      L16: {
                                        var7_int = ig.a("jaclib", true);
                                        if (var7_int != -1) {
                                          break L16;
                                        } else {
                                          var6_ref.field_f = false;
                                          if (var10 == 0) {
                                            break L5;
                                          } else {
                                            break L16;
                                          }
                                        }
                                      }
                                      if (100 <= var7_int) {
                                        L17: {
                                          var8_int = ig.a("sw3d", true);
                                          if (0 != (var8_int ^ -1)) {
                                            break L17;
                                          } else {
                                            var6_ref.field_f = false;
                                            if (var10 == 0) {
                                              break L5;
                                            } else {
                                              break L17;
                                            }
                                          }
                                        }
                                        if (100 <= var8_int) {
                                          break L7;
                                        } else {
                                          decompiledRegionSelector1 = 14;
                                          break L0;
                                        }
                                      } else {
                                        decompiledRegionSelector1 = 13;
                                        break L0;
                                      }
                                    } else {
                                      decompiledRegionSelector1 = 12;
                                      break L0;
                                    }
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                          }
                          if (!sn.field_d.b((byte) 127)) {
                            decompiledRegionSelector1 = 1;
                            break L0;
                          } else {
                            L18: {
                              var7_int = ig.a("hw3d", true);
                              if (0 != (var7_int ^ -1)) {
                                break L18;
                              } else {
                                var6_ref.field_f = false;
                                if (var10 == 0) {
                                  break L5;
                                } else {
                                  break L18;
                                }
                              }
                            }
                            if (100 <= var7_int) {
                              L19: {
                                var8_int = ig.a("jaclib", true);
                                if (0 != (var8_int ^ -1)) {
                                  break L19;
                                } else {
                                  var6_ref.field_f = false;
                                  if (var10 == 0) {
                                    break L5;
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                              if (-101 >= (var8_int ^ -1)) {
                                L20: {
                                  var9 = ig.a("jaggl", true);
                                  if (var9 != -1) {
                                    break L20;
                                  } else {
                                    var6_ref.field_f = false;
                                    if (var10 == 0) {
                                      break L5;
                                    } else {
                                      break L20;
                                    }
                                  }
                                }
                                if ((var9 ^ -1) <= -101) {
                                  break L7;
                                } else {
                                  decompiledRegionSelector1 = 4;
                                  break L0;
                                }
                              } else {
                                decompiledRegionSelector1 = 3;
                                break L0;
                              }
                            } else {
                              decompiledRegionSelector1 = 2;
                              break L0;
                            }
                          }
                        }
                        L21: {
                          if (null == this.field_c) {
                            break L21;
                          } else {
                            L22: {
                              if (!this.field_c.field_d.a(var6_ref, (byte) 95)) {
                                break L22;
                              } else {
                                if (null == this.field_c.field_g) {
                                  break L22;
                                } else {
                                  if (this.field_c.field_c != param1) {
                                    break L22;
                                  } else {
                                    if (!var6_ref.a(this.field_c, (byte) -123)) {
                                      break L22;
                                    } else {
                                      this.field_b = true;
                                      decompiledRegionSelector1 = 15;
                                      break L0;
                                    }
                                  }
                                }
                              }
                            }
                            if ((this.field_c.field_d.field_c ^ -1) != (var6_ref.field_c ^ -1)) {
                              break L21;
                            } else {
                              if (this.field_c.field_g != null) {
                                var3 = this.field_c.b(-43);
                                this.field_c.field_g.a((byte) -94);
                                this.field_c = null;
                                break L21;
                              } else {
                                break L21;
                              }
                            }
                          }
                        }
                        try {
                          L23: {
                            L24: {
                              var11 = ks.a(var6_ref.field_c, param1, this.field_e, true, var6_ref.field_g, ha.field_g);
                              if (var11 != null) {
                                var8 = new bk(var11, var6_ref, param1);
                                if (!var6_ref.a(var8, (byte) -36)) {
                                  break L24;
                                } else {
                                  L25: {
                                    if (this.field_c == null) {
                                      break L25;
                                    } else {
                                      L26: {
                                        if (var8.field_g != this.field_c.field_g) {
                                          break L26;
                                        } else {
                                          if (var8.field_c == this.field_c.field_c) {
                                            this.field_c = var8;
                                            this.field_b = true;
                                            decompiledRegionSelector0 = 1;
                                            break L23;
                                          } else {
                                            break L26;
                                          }
                                        }
                                      }
                                      var3 = this.field_c.b(79);
                                      this.field_c.field_g.a((byte) -109);
                                      break L25;
                                    }
                                  }
                                  L27: {
                                    if (var8.field_g.c()) {
                                      var8.field_g.a(var8.field_g.c(100663296));
                                      break L27;
                                    } else {
                                      break L27;
                                    }
                                  }
                                  L28: {
                                    L29: {
                                      if (var3 == null) {
                                        break L29;
                                      } else {
                                        ((cj) (var3)).a(var8, 3);
                                        if (var10 == 0) {
                                          break L28;
                                        } else {
                                          break L29;
                                        }
                                      }
                                    }
                                    var8.field_f = wq.a(param0 + 59);
                                    break L28;
                                  }
                                  this.field_b = true;
                                  this.field_c = var8;
                                  decompiledRegionSelector0 = 2;
                                  break L23;
                                }
                              } else {
                                break L24;
                              }
                            }
                            decompiledRegionSelector0 = 0;
                            break L23;
                          }
                        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          L30: {
                            var7 = decompiledCaughtException;
                            var7.printStackTrace();
                            decompiledRegionSelector0 = 0;
                            break L30;
                          }
                        }
                        if (decompiledRegionSelector0 == 0) {
                          var6_ref.field_f = false;
                          break L5;
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
                      var5++;
                      if (var10 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              decompiledRegionSelector1 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L31: {
            var3 = decompiledCaughtException;
            stackOut_126_0 = var3;
            stackOut_126_1 = new StringBuilder().append("ik.B(").append(param0).append(',');
            stackIn_128_0 = stackOut_126_0;
            stackIn_128_1 = stackOut_126_1;
            stackIn_127_0 = stackOut_126_0;
            stackIn_127_1 = stackOut_126_1;
            if (param1 == null) {
              stackOut_128_0 = stackIn_128_0;
              stackOut_128_1 = (StringBuilder) ((Object) stackIn_128_1);
              stackOut_128_2 = "null";
              stackIn_129_0 = stackOut_128_0;
              stackIn_129_1 = stackOut_128_1;
              stackIn_129_2 = stackOut_128_2;
              break L31;
            } else {
              stackOut_127_0 = stackIn_127_0;
              stackOut_127_1 = (StringBuilder) ((Object) stackIn_127_1);
              stackOut_127_2 = "{...}";
              stackIn_129_0 = stackOut_127_0;
              stackIn_129_1 = stackOut_127_1;
              stackIn_129_2 = stackOut_127_2;
              break L31;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_129_0), stackIn_129_2 + ')');
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

    final ha a(int param0) {
        if (param0 >= -89) {
            return (ha) null;
        }
        if (this.field_c == null) {
            return null;
        }
        return this.field_c.field_g;
    }

    ik(int param0, int param1, d param2) {
        this(kd.a((byte) -123, param0), vo.b(param1, -1), param2, lt.field_m, ms.b(-16754));
    }

    private ik(ki param0, ki param1, d param2, wi param3, nj[] param4) {
        this.field_b = false;
        try {
            ha.field_g = param1;
            this.field_e = param2;
            sn.field_d = param0;
            ow.a(-18527, param0, param3);
            this.a(param4, 97);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ik.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
