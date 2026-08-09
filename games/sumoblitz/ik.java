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
        try {
            if (param1 < 89) {
                java.awt.Canvas var4 = (java.awt.Canvas) null;
                this.a(127, (java.awt.Canvas) null);
            }
            if (param0 != this.field_a) {
                if (-1 == (param0.length ^ -1)) {
                    throw new IllegalArgumentException();
                }
                this.field_a = param0;
                this.field_b = false;
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ik.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int c(int param0) {
        if (param0 != -10517) {
            ik.c(113);
        }
        if (!oj.a(false) || null == pu.field_e.e((byte) 54)) {
            return -1;
        }
        return pu.field_e.e((byte) 54).field_r;
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
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
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
                  stackIn_13_0 = 1;
                  break L4;
                }
              }
              stackIn_13_0 = 0;
              break L4;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("ik.A(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L7;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L7;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        return stackIn_13_0 != 0;
    }

    private final void a(int param0, java.awt.Canvas param1) {
        Object stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        Object stackIn_116_0 = null;
        StringBuilder stackIn_116_1 = null;
        String stackIn_116_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var3 = null;
        nj[] var4 = null;
        int var5 = 0;
        nj var6 = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8_int = 0;
        bk var8 = null;
        int var9 = 0;
        int var10 = 0;
        ha var11 = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var3 = null;
              if (param0 == -101) {
                break L1;
              } else {
                this.a(-39);
                break L1;
              }
            }
            var4 = this.field_a;
            var5 = 0;
            L2: while (true) {
              if (var5 >= var4.length) {
                decompiledRegionSelector1 = 0;
                break L0;
              } else {
                L3: {
                  var6 = var4[var5];
                  if (var6.field_f) {
                    L4: {
                      var7_int = var6.field_c;
                      if ((var7_int ^ -1) != -1) {
                        if (var7_int == 5) {
                          if (!sn.field_d.b((byte) 127)) {
                            decompiledRegionSelector1 = 1;
                            break L0;
                          } else {
                            var7_int = ig.a("hw3d", true);
                            if (0 != (var7_int ^ -1)) {
                              if (100 <= var7_int) {
                                var8_int = ig.a("jaclib", true);
                                if (0 != (var8_int ^ -1)) {
                                  if (-101 >= (var8_int ^ -1)) {
                                    var9 = ig.a("jaggl", true);
                                    if (var9 != -1) {
                                      if ((var9 ^ -1) <= -101) {
                                        break L4;
                                      } else {
                                        decompiledRegionSelector1 = 4;
                                        break L0;
                                      }
                                    } else {
                                      var6.field_f = false;
                                      break L3;
                                    }
                                  } else {
                                    decompiledRegionSelector1 = 3;
                                    break L0;
                                  }
                                } else {
                                  var6.field_f = false;
                                  break L3;
                                }
                              } else {
                                decompiledRegionSelector1 = 2;
                                break L0;
                              }
                            } else {
                              var6.field_f = false;
                              break L3;
                            }
                          }
                        } else {
                          if (1 != var7_int) {
                            if (var7_int == 3) {
                              if (sn.field_d.b((byte) 127)) {
                                var7_int = ig.a("jaclib", true);
                                if (var7_int == -1) {
                                  var6.field_f = false;
                                  break L3;
                                } else {
                                  if (var7_int < 100) {
                                    decompiledRegionSelector1 = 9;
                                    break L0;
                                  } else {
                                    var8_int = ig.a("jagdx", true);
                                    if ((var8_int ^ -1) != 0) {
                                      if (-101 >= (var8_int ^ -1)) {
                                        var9 = ig.a("hw3d", true);
                                        if (0 == (var9 ^ -1)) {
                                          var6.field_f = false;
                                          break L3;
                                        } else {
                                          if (100 <= var9) {
                                            break L4;
                                          } else {
                                            decompiledRegionSelector1 = 11;
                                            break L0;
                                          }
                                        }
                                      } else {
                                        decompiledRegionSelector1 = 10;
                                        break L0;
                                      }
                                    } else {
                                      var6.field_f = false;
                                      break L3;
                                    }
                                  }
                                }
                              } else {
                                decompiledRegionSelector1 = 8;
                                break L0;
                              }
                            } else {
                              if ((var7_int ^ -1) != -3) {
                                throw new IllegalStateException("UT" + var6.field_c);
                              } else {
                                if (sn.field_d.b((byte) 127)) {
                                  var7_int = ig.a("jaclib", true);
                                  if (var7_int != -1) {
                                    if (100 <= var7_int) {
                                      var8_int = ig.a("sw3d", true);
                                      if (0 != (var8_int ^ -1)) {
                                        if (100 <= var8_int) {
                                          break L4;
                                        } else {
                                          decompiledRegionSelector1 = 14;
                                          break L0;
                                        }
                                      } else {
                                        var6.field_f = false;
                                        break L3;
                                      }
                                    } else {
                                      decompiledRegionSelector1 = 13;
                                      break L0;
                                    }
                                  } else {
                                    var6.field_f = false;
                                    break L3;
                                  }
                                } else {
                                  decompiledRegionSelector1 = 12;
                                  break L0;
                                }
                              }
                            }
                          } else {
                            if (!sn.field_d.b((byte) 127)) {
                              decompiledRegionSelector1 = 5;
                              break L0;
                            } else {
                              var7_int = ig.a("jaclib", true);
                              if (-1 != var7_int) {
                                if (100 <= var7_int) {
                                  var8_int = ig.a("jaggl", true);
                                  if (var8_int == -1) {
                                    var6.field_f = false;
                                    break L3;
                                  } else {
                                    if (-101 < (var8_int ^ -1)) {
                                      decompiledRegionSelector1 = 7;
                                      break L0;
                                    } else {
                                      break L4;
                                    }
                                  }
                                } else {
                                  decompiledRegionSelector1 = 6;
                                  break L0;
                                }
                              } else {
                                var6.field_f = false;
                                break L3;
                              }
                            }
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (null == this.field_c) {
                        break L5;
                      } else {
                        L6: {
                          if (!this.field_c.field_d.a(var6, (byte) 95)) {
                            break L6;
                          } else {
                            if (null == this.field_c.field_g) {
                              break L6;
                            } else {
                              if (this.field_c.field_c != param1) {
                                break L6;
                              } else {
                                if (!var6.a(this.field_c, (byte) -123)) {
                                  break L6;
                                } else {
                                  this.field_b = true;
                                  decompiledRegionSelector1 = 15;
                                  break L0;
                                }
                              }
                            }
                          }
                        }
                        if ((this.field_c.field_d.field_c ^ -1) != (var6.field_c ^ -1)) {
                          break L5;
                        } else {
                          if (this.field_c.field_g != null) {
                            var3 = this.field_c.b(-43);
                            this.field_c.field_g.a((byte) -94);
                            this.field_c = null;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    try {
                      L7: {
                        L8: {
                          var11 = ks.a(var6.field_c, param1, this.field_e, true, var6.field_g, ha.field_g);
                          if (var11 != null) {
                            var8 = new bk(var11, var6, param1);
                            if (!var6.a(var8, (byte) -36)) {
                              break L8;
                            } else {
                              L9: {
                                if (this.field_c == null) {
                                  break L9;
                                } else {
                                  L10: {
                                    if (var8.field_g != this.field_c.field_g) {
                                      break L10;
                                    } else {
                                      if (var8.field_c == this.field_c.field_c) {
                                        this.field_c = var8;
                                        this.field_b = true;
                                        decompiledRegionSelector0 = 1;
                                        break L7;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                  var3 = this.field_c.b(79);
                                  this.field_c.field_g.a((byte) -109);
                                  break L9;
                                }
                              }
                              L11: {
                                if (var8.field_g.c()) {
                                  var8.field_g.a(var8.field_g.c(100663296));
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                              L12: {
                                if (var3 == null) {
                                  var8.field_f = wq.a(param0 + 59);
                                  break L12;
                                } else {
                                  ((cj) (var3)).a(var8, 3);
                                  break L12;
                                }
                              }
                              this.field_b = true;
                              this.field_c = var8;
                              decompiledRegionSelector0 = 2;
                              break L7;
                            }
                          } else {
                            break L8;
                          }
                        }
                        decompiledRegionSelector0 = 0;
                        break L7;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L13: {
                        var7 = decompiledCaughtException;
                        var7.printStackTrace();
                        decompiledRegionSelector0 = 0;
                        break L13;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      var6.field_f = false;
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
                  } else {
                    break L3;
                  }
                }
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L14: {
            var3 = decompiledCaughtException;
            stackIn_115_0 = var3;

            stackIn_115_1 = new StringBuilder().append("ik.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_116_0 = stackIn_115_0;
              stackIn_116_1 = (StringBuilder) ((Object) stackIn_115_1);
              stackIn_116_2 = "null";
              break L14;
            } else {
              stackIn_116_0 = stackIn_115_0;
              stackIn_116_1 = (StringBuilder) ((Object) stackIn_115_1);
              stackIn_116_2 = "{...}";
              break L14;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_116_0), stackIn_116_2 + ')');
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
