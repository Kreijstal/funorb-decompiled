/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l {
    private boolean field_d;
    static vd field_a;
    private vu field_e;
    static int field_f;
    static int field_c;
    private d field_b;
    private sn[] field_g;

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
            l.a(false);
        }
    }

    private final boolean b(java.awt.Canvas param0, int param1) {
        vj discarded$2 = null;
        vu var3 = null;
        RuntimeException var3_ref = null;
        jc var4 = null;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (param1 >= 89) {
                break L1;
              } else {
                var4 = (jc) null;
                discarded$2 = l.a((byte) -63, 59, (byte[]) null, (jc) null);
                break L1;
              }
            }
            L2: {
              L3: {
                var3 = this.field_e;
                if (var3 == null) {
                  break L3;
                } else {
                  if (!this.field_d) {
                    break L3;
                  } else {
                    if (param0 == var3.field_b) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              this.a(param0, 91);
              break L2;
            }
            L4: {
              if (null == this.field_e) {
                break L4;
              } else {
                this.field_e.field_c.b((int)(-this.field_e.field_a + kh.a(-104)));
                break L4;
              }
            }
            L5: {
              L6: {
                if (this.field_e == null) {
                  break L6;
                } else {
                  L7: {
                    if (var3 == null) {
                      break L7;
                    } else {
                      if (this.field_e.field_c == var3.field_c) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  stackOut_13_0 = 1;
                  stackIn_15_0 = stackOut_13_0;
                  break L5;
                }
              }
              stackOut_14_0 = 0;
              stackIn_15_0 = stackOut_14_0;
              break L5;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3_ref);
            stackOut_16_1 = new StringBuilder().append("l.B(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
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
          throw pn.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        return stackIn_15_0 != 0;
    }

    final static vj a(byte param0, int param1, byte[] param2, jc param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        byte[] var10 = null;
        Object stackIn_15_0 = null;
        vj stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_14_0 = null;
        vj stackOut_16_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            if (param2 != null) {
              if (param2.length != 0) {
                L1: {
                  if (param0 == 29) {
                    break L1;
                  } else {
                    field_f = -49;
                    break L1;
                  }
                }
                L2: {
                  var4_long = jaggl.OpenGL.glCreateShaderObjectARB(param1);
                  jaggl.OpenGL.glShaderSourceRawARB(var4_long, param2);
                  jaggl.OpenGL.glCompileShaderARB(var4_long);
                  jaggl.OpenGL.glGetObjectParameterivARB(var4_long, 35713, dg.field_Q, 0);
                  if (dg.field_Q[0] != 0) {
                    break L2;
                  } else {
                    L3: {
                      if (-1 == (dg.field_Q[0] ^ -1)) {
                        System.out.println("Shader compile failed:");
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      jaggl.OpenGL.glGetObjectParameterivARB(var4_long, 35716, dg.field_Q, 1);
                      if (dg.field_Q[1] <= 1) {
                        break L4;
                      } else {
                        var10 = new byte[dg.field_Q[1]];
                        jaggl.OpenGL.glGetInfoLogARB(var4_long, dg.field_Q[1], dg.field_Q, 0, var10, 0);
                        System.out.println(new String(var10));
                        break L4;
                      }
                    }
                    if (dg.field_Q[0] != 0) {
                      break L2;
                    } else {
                      jaggl.OpenGL.glDeleteObjectARB(var4_long);
                      stackOut_14_0 = null;
                      stackIn_15_0 = stackOut_14_0;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
                stackOut_16_0 = new vj(param3, var4_long, param1);
                stackIn_17_0 = stackOut_16_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var4);
            stackOut_18_1 = new StringBuilder().append("l.G(").append(param0).append(',').append(param1).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
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
          L6: {
            stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param3 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (vj) ((Object) stackIn_15_0);
        } else {
          return stackIn_17_0;
        }
    }

    l(int param0, int param1, d param2) {
        this(da.a(param0, 1), cm.a(param1, (byte) 118), param2, pt.field_b, an.a(false));
    }

    private final void a(java.awt.Canvas param0, int param1) {
        Object var3 = null;
        sn[] var4 = null;
        int var5 = 0;
        Object var6 = null;
        sn var6_ref = null;
        RuntimeException var7 = null;
        int var7_int = 0;
        vu var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        ha var11 = null;
        Object stackIn_117_0 = null;
        StringBuilder stackIn_117_1 = null;
        Object stackIn_118_0 = null;
        StringBuilder stackIn_118_1 = null;
        Object stackIn_119_0 = null;
        StringBuilder stackIn_119_1 = null;
        String stackIn_119_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_116_0 = null;
        StringBuilder stackOut_116_1 = null;
        Object stackOut_118_0 = null;
        StringBuilder stackOut_118_1 = null;
        String stackOut_118_2 = null;
        Object stackOut_117_0 = null;
        StringBuilder stackOut_117_1 = null;
        String stackOut_117_2 = null;
        var10 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var3 = null;
              var4 = this.field_g;
              if (param1 > 55) {
                break L1;
              } else {
                this.field_e = (vu) null;
                break L1;
              }
            }
            var5 = 0;
            L2: while (true) {
              if ((var5 ^ -1) <= (var4.length ^ -1)) {
                decompiledRegionSelector1 = 0;
                break L0;
              } else {
                L3: {
                  var6_ref = var4[var5];
                  if (var6_ref.field_b) {
                    L4: {
                      var7_int = var6_ref.field_d;
                      if ((var7_int ^ -1) != -1) {
                        if (5 == var7_int) {
                          if (!oi.field_d.b((byte) -90)) {
                            decompiledRegionSelector1 = 1;
                            break L0;
                          } else {
                            var7_int = bc.a("hw3d", (byte) -95);
                            if (-1 == var7_int) {
                              var6_ref.field_b = false;
                              break L3;
                            } else {
                              if (-101 >= (var7_int ^ -1)) {
                                var8_int = bc.a("jaclib", (byte) 49);
                                if (var8_int != -1) {
                                  if (-101 >= (var8_int ^ -1)) {
                                    var9 = bc.a("jaggl", (byte) -75);
                                    if ((var9 ^ -1) != 0) {
                                      if ((var9 ^ -1) <= -101) {
                                        break L4;
                                      } else {
                                        decompiledRegionSelector1 = 4;
                                        break L0;
                                      }
                                    } else {
                                      var6_ref.field_b = false;
                                      break L3;
                                    }
                                  } else {
                                    decompiledRegionSelector1 = 3;
                                    break L0;
                                  }
                                } else {
                                  var6_ref.field_b = false;
                                  break L3;
                                }
                              } else {
                                decompiledRegionSelector1 = 2;
                                break L0;
                              }
                            }
                          }
                        } else {
                          if ((var7_int ^ -1) != -2) {
                            if ((var7_int ^ -1) == -4) {
                              if (oi.field_d.b((byte) 116)) {
                                var7_int = bc.a("jaclib", (byte) 12);
                                if (0 == (var7_int ^ -1)) {
                                  var6_ref.field_b = false;
                                  break L3;
                                } else {
                                  if ((var7_int ^ -1) <= -101) {
                                    var8_int = bc.a("jagdx", (byte) 47);
                                    if (0 == (var8_int ^ -1)) {
                                      var6_ref.field_b = false;
                                      break L3;
                                    } else {
                                      if (var8_int >= 100) {
                                        var9 = bc.a("hw3d", (byte) 1);
                                        if ((var9 ^ -1) != 0) {
                                          if (var9 >= 100) {
                                            break L4;
                                          } else {
                                            decompiledRegionSelector1 = 11;
                                            break L0;
                                          }
                                        } else {
                                          var6_ref.field_b = false;
                                          break L3;
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
                                }
                              } else {
                                decompiledRegionSelector1 = 8;
                                break L0;
                              }
                            } else {
                              if (var7_int == 2) {
                                if (!oi.field_d.b((byte) -39)) {
                                  decompiledRegionSelector1 = 12;
                                  break L0;
                                } else {
                                  var7_int = bc.a("jaclib", (byte) 74);
                                  if (0 == (var7_int ^ -1)) {
                                    var6_ref.field_b = false;
                                    break L3;
                                  } else {
                                    if (100 <= var7_int) {
                                      var8_int = bc.a("sw3d", (byte) 41);
                                      if (var8_int == -1) {
                                        var6_ref.field_b = false;
                                        break L3;
                                      } else {
                                        if (var8_int >= 100) {
                                          break L4;
                                        } else {
                                          decompiledRegionSelector1 = 14;
                                          break L0;
                                        }
                                      }
                                    } else {
                                      decompiledRegionSelector1 = 13;
                                      break L0;
                                    }
                                  }
                                }
                              } else {
                                throw new IllegalStateException("UT" + var6_ref.field_d);
                              }
                            }
                          } else {
                            if (oi.field_d.b((byte) -44)) {
                              var7_int = bc.a("jaclib", (byte) -120);
                              if (var7_int != -1) {
                                if ((var7_int ^ -1) > -101) {
                                  decompiledRegionSelector1 = 6;
                                  break L0;
                                } else {
                                  var8_int = bc.a("jaggl", (byte) -80);
                                  if (0 == (var8_int ^ -1)) {
                                    var6_ref.field_b = false;
                                    break L3;
                                  } else {
                                    if (var8_int < 100) {
                                      decompiledRegionSelector1 = 7;
                                      break L0;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                              } else {
                                var6_ref.field_b = false;
                                break L3;
                              }
                            } else {
                              decompiledRegionSelector1 = 5;
                              break L0;
                            }
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (null != this.field_e) {
                        L6: {
                          if (!this.field_e.field_d.a((byte) -73, var6_ref)) {
                            break L6;
                          } else {
                            if (this.field_e.field_c == null) {
                              break L6;
                            } else {
                              if (param0 != this.field_e.field_b) {
                                break L6;
                              } else {
                                if (var6_ref.a(this.field_e, 0)) {
                                  this.field_d = true;
                                  decompiledRegionSelector1 = 15;
                                  break L0;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                        }
                        if (var6_ref.field_d != this.field_e.field_d.field_d) {
                          break L5;
                        } else {
                          if (null == this.field_e.field_c) {
                            break L5;
                          } else {
                            var3 = this.field_e.a((byte) 38);
                            this.field_e.field_c.a(-9);
                            this.field_e = null;
                            break L5;
                          }
                        }
                      } else {
                        break L5;
                      }
                    }
                    try {
                      L7: {
                        L8: {
                          var11 = hr.a(iq.field_h, this.field_b, -106, var6_ref.field_a, param0, var6_ref.field_d);
                          if (var11 == null) {
                            break L8;
                          } else {
                            var8 = new vu(var11, var6_ref, param0);
                            if (!var6_ref.a(var8, 0)) {
                              break L8;
                            } else {
                              L9: {
                                if (null == this.field_e) {
                                  break L9;
                                } else {
                                  L10: {
                                    if (var8.field_c != this.field_e.field_c) {
                                      break L10;
                                    } else {
                                      if (var8.field_b == this.field_e.field_b) {
                                        this.field_d = true;
                                        this.field_e = var8;
                                        decompiledRegionSelector0 = 0;
                                        break L7;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                  var3 = this.field_e.a((byte) 38);
                                  this.field_e.field_c.a(-9);
                                  break L9;
                                }
                              }
                              L11: {
                                if (var8.field_c.b()) {
                                  var8.field_c.a(var8.field_c.c(100663296));
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                              L12: {
                                if (var3 == null) {
                                  var8.field_a = kh.a(-75);
                                  break L12;
                                } else {
                                  ((mj) (var3)).a(true, var8);
                                  break L12;
                                }
                              }
                              this.field_d = true;
                              this.field_e = var8;
                              decompiledRegionSelector0 = 1;
                              break L7;
                            }
                          }
                        }
                        decompiledRegionSelector0 = 2;
                        break L7;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L13: {
                        var7 = decompiledCaughtException;
                        var7.printStackTrace();
                        decompiledRegionSelector0 = 2;
                        break L13;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      decompiledRegionSelector1 = 16;
                      break L0;
                    } else {
                      if (decompiledRegionSelector0 == 1) {
                        decompiledRegionSelector1 = 17;
                        break L0;
                      } else {
                        var6_ref.field_b = false;
                        break L3;
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
            stackOut_116_0 = var3;
            stackOut_116_1 = new StringBuilder().append("l.A(");
            stackIn_118_0 = stackOut_116_0;
            stackIn_118_1 = stackOut_116_1;
            stackIn_117_0 = stackOut_116_0;
            stackIn_117_1 = stackOut_116_1;
            if (param0 == null) {
              stackOut_118_0 = stackIn_118_0;
              stackOut_118_1 = (StringBuilder) ((Object) stackIn_118_1);
              stackOut_118_2 = "null";
              stackIn_119_0 = stackOut_118_0;
              stackIn_119_1 = stackOut_118_1;
              stackIn_119_2 = stackOut_118_2;
              break L14;
            } else {
              stackOut_117_0 = stackIn_117_0;
              stackOut_117_1 = (StringBuilder) ((Object) stackIn_117_1);
              stackOut_117_2 = "{...}";
              stackIn_119_0 = stackOut_117_0;
              stackIn_119_1 = stackOut_117_1;
              stackIn_119_2 = stackOut_117_2;
              break L14;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_119_0), stackIn_119_2 + ',' + param1 + ')');
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

    private final void a(byte param0, sn[] param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
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
            L1: {
              if (this.field_g == param1) {
                break L1;
              } else {
                if (-1 == (param1.length ^ -1)) {
                  throw new IllegalArgumentException();
                } else {
                  this.field_g = param1;
                  this.field_d = false;
                  break L1;
                }
              }
            }
            L2: {
              if (param0 == 116) {
                break L2;
              } else {
                this.field_d = false;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("l.D(").append(param0).append(',');
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
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final boolean a(int param0) {
        int var2 = 10 / ((param0 - 68) / 53);
        return this.b(fa.a(-8213), 118);
    }

    final ha a(byte param0) {
        if (param0 <= 59) {
            return (ha) null;
        }
        if (null == this.field_e) {
            return null;
        }
        return this.field_e.field_c;
    }

    private l(gk param0, gk param1, d param2, rk param3, sn[] param4) {
        this.field_d = false;
        try {
            oi.field_d = param0;
            this.field_b = param2;
            iq.field_h = param1;
            ef.a((byte) 100, param3, param0);
            this.a((byte) 116, param4);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "l.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = 256;
    }
}
