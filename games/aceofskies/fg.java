/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg extends ip {
    private un field_g;
    private ps field_m;
    private ph field_v;
    private int field_p;
    private byte[] field_u;
    private bl field_l;
    private dk field_z;
    private bl field_e;
    static gk field_t;
    static kp field_r;
    private int field_j;
    private ag field_y;
    private int field_w;
    private byte[] field_h;
    private kp field_n;
    private kp field_o;
    private boolean field_s;
    static String[] field_f;
    static ke field_A;
    static String field_k;
    private boolean field_q;
    private int field_d;
    private long field_x;
    private boolean field_i;

    final static byte[] a(byte[] param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = param0.length;
            var3 = new byte[var2_int];
            au.a(param0, 0, var3, 0, var2_int);
            stackOut_0_0 = (byte[]) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("fg.F(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + 107 + ')');
        }
        return stackIn_1_0;
    }

    final static cl a(String param0) {
        Object var2 = null;
        cl var3 = null;
        String var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        cl stackIn_13_0 = null;
        Object stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        Object stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        Object stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        cl stackOut_12_0 = null;
        Object stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        Object stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        Object stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          if (gi.field_g != null) {
            L0: {
              var5 = (CharSequence) (Object) param0;
              var2 = (Object) (Object) vu.a(125, var5);
              if (var2 != null) {
                break L0;
              } else {
                var2 = (Object) (Object) var5;
                break L0;
              }
            }
            var3 = (cl) (Object) gi.field_g.a(124, (long)((String) var2).hashCode());
            L1: while (true) {
              if (var3 != null) {
                L2: {
                  var6 = (CharSequence) (Object) var3.field_I;
                  var4 = vu.a(125, var6);
                  if (var4 != null) {
                    break L2;
                  } else {
                    var4 = var3.field_I;
                    break L2;
                  }
                }
                if (var4.equals(var2)) {
                  stackOut_12_0 = (cl) var3;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0;
                } else {
                  var3 = (cl) (Object) gi.field_g.a(false);
                  continue L1;
                }
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = (Object) (Object) decompiledCaughtException;
            stackOut_16_0 = var2;
            stackOut_16_1 = new StringBuilder().append("fg.K(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + 17680 + ')');
        }
    }

    final int b(int param0, int param1) {
        if (param0 != 1) {
            field_k = null;
        }
        ag var3 = (ag) (Object) ((fg) this).field_v.a((byte) 106, (long)param1);
        if (var3 == null) {
            return 0;
        }
        return var3.e(21513);
    }

    final void b(int param0) {
        wf var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = AceOfSkies.field_G ? 1 : 0;
        if (null == ((fg) this).field_o) {
          return;
        } else {
          if (null == ((fg) this).a(true)) {
            return;
          } else {
            if (param0 == -20254) {
              var2 = ((fg) this).field_n.d(param0 ^ -268415203);
              L0: while (true) {
                if (var2 == null) {
                  return;
                } else {
                  L1: {
                    var3 = (int)var2.field_b;
                    if (var3 >= 0) {
                      if (var3 < ((fg) this).field_m.field_l) {
                        if (((fg) this).field_m.field_k[var3] == 0) {
                          var2.c(-124);
                          break L1;
                        } else {
                          L2: {
                            if (((fg) this).field_h[var3] != 0) {
                              break L2;
                            } else {
                              ag discarded$2 = this.a((byte) -37, 1, var3);
                              break L2;
                            }
                          }
                          L3: {
                            if (((fg) this).field_h[var3] == -1) {
                              ag discarded$3 = this.a((byte) -37, 2, var3);
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          if (((fg) this).field_h[var3] == 1) {
                            var2.c(param0 ^ 20327);
                            break L1;
                          } else {
                            break L1;
                          }
                        }
                      } else {
                        var2.c(-124);
                        break L1;
                      }
                    } else {
                      var2.c(-124);
                      break L1;
                    }
                  }
                  var2 = ((fg) this).field_n.b((byte) 103);
                  continue L0;
                }
              }
            } else {
              return;
            }
          }
        }
    }

    final byte[] a(int param0, int param1) {
        ag var3 = this.a((byte) -37, 0, param0);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.a(true);
        var3.c(param1 ^ -128);
        if (param1 != 2) {
            return null;
        }
        return var4;
    }

    final static void b(boolean param0) {
        tn.a(1, true, nh.field_b, rt.field_e);
        ae.field_f = true;
    }

    final void a(byte param0) {
        int var2_int = 0;
        ag var2 = null;
        wf var3 = null;
        int var4 = 0;
        int var5 = 0;
        L0: {
          L1: {
            L2: {
              var5 = AceOfSkies.field_G ? 1 : 0;
              if (((fg) this).field_o == null) {
                break L2;
              } else {
                if (((fg) this).a(true) != null) {
                  if (!((fg) this).field_q) {
                    if (!((fg) this).field_s) {
                      ((fg) this).field_o = null;
                      break L2;
                    } else {
                      var2_int = 1;
                      var3 = ((fg) this).field_o.d(268435455);
                      L3: while (true) {
                        if (var3 == null) {
                          L4: while (true) {
                            L5: {
                              if (((fg) this).field_d >= ((fg) this).field_m.field_k.length) {
                                break L5;
                              } else {
                                L6: {
                                  if (0 == ((fg) this).field_m.field_k[((fg) this).field_d]) {
                                    break L6;
                                  } else {
                                    if (((fg) this).field_g.a((byte) -106)) {
                                      var2_int = 0;
                                      break L5;
                                    } else {
                                      L7: {
                                        if (((fg) this).field_h[((fg) this).field_d] != 1) {
                                          ag discarded$4 = this.a((byte) -37, 2, ((fg) this).field_d);
                                          break L7;
                                        } else {
                                          break L7;
                                        }
                                      }
                                      if (((fg) this).field_h[((fg) this).field_d] == 1) {
                                        break L6;
                                      } else {
                                        var3 = new wf();
                                        var3.field_b = (long)((fg) this).field_d;
                                        var2_int = 0;
                                        ((fg) this).field_o.a(115, var3);
                                        break L6;
                                      }
                                    }
                                  }
                                }
                                ((fg) this).field_d = ((fg) this).field_d + 1;
                                continue L4;
                              }
                            }
                            if (var2_int != 0) {
                              ((fg) this).field_d = 0;
                              ((fg) this).field_s = false;
                              break L2;
                            } else {
                              L8: {
                                if (param0 > 84) {
                                  break L8;
                                } else {
                                  ((fg) this).field_m = null;
                                  break L8;
                                }
                              }
                              if (!((fg) this).field_i) {
                                break L0;
                              } else {
                                if (((fg) this).field_x <= kh.a(-106)) {
                                  var2 = (ag) (Object) ((fg) this).field_v.a(false);
                                  L9: while (true) {
                                    if (var2 == null) {
                                      break L1;
                                    } else {
                                      L10: {
                                        if (!var2.field_p) {
                                          if (var2.field_t) {
                                            if (var2.field_q) {
                                              var2.c(-124);
                                              break L10;
                                            } else {
                                              throw new RuntimeException();
                                            }
                                          } else {
                                            var2.field_t = true;
                                            break L10;
                                          }
                                        } else {
                                          break L10;
                                        }
                                      }
                                      var2 = (ag) (Object) ((fg) this).field_v.a(0);
                                      continue L9;
                                    }
                                  }
                                } else {
                                  break L0;
                                }
                              }
                            }
                          }
                        } else {
                          L11: {
                            var4 = (int)var3.field_b;
                            if (-2 == ((fg) this).field_h[var4]) {
                              break L11;
                            } else {
                              ag discarded$5 = this.a((byte) -37, 2, var4);
                              break L11;
                            }
                          }
                          L12: {
                            if (-2 != ((fg) this).field_h[var4]) {
                              var2_int = 0;
                              break L12;
                            } else {
                              var3.c(-123);
                              break L12;
                            }
                          }
                          var3 = ((fg) this).field_o.b((byte) 103);
                          continue L3;
                        }
                      }
                    }
                  } else {
                    var2_int = 1;
                    var3 = ((fg) this).field_o.d(268435455);
                    L13: while (true) {
                      if (var3 == null) {
                        L14: while (true) {
                          L15: {
                            if (((fg) this).field_m.field_k.length <= ((fg) this).field_d) {
                              break L15;
                            } else {
                              if (((fg) this).field_m.field_k[((fg) this).field_d] != 0) {
                                if (((fg) this).field_z.field_d < 250) {
                                  L16: {
                                    if (((fg) this).field_h[((fg) this).field_d] != 0) {
                                      break L16;
                                    } else {
                                      ag discarded$6 = this.a((byte) -37, 1, ((fg) this).field_d);
                                      break L16;
                                    }
                                  }
                                  L17: {
                                    if (((fg) this).field_h[((fg) this).field_d] != 0) {
                                      break L17;
                                    } else {
                                      var3 = new wf();
                                      var3.field_b = (long)((fg) this).field_d;
                                      var2_int = 0;
                                      ((fg) this).field_o.a(81, var3);
                                      break L17;
                                    }
                                  }
                                  ((fg) this).field_d = ((fg) this).field_d + 1;
                                  continue L14;
                                } else {
                                  var2_int = 0;
                                  break L15;
                                }
                              } else {
                                ((fg) this).field_d = ((fg) this).field_d + 1;
                                continue L14;
                              }
                            }
                          }
                          if (var2_int == 0) {
                            break L2;
                          } else {
                            ((fg) this).field_q = false;
                            ((fg) this).field_d = 0;
                            break L2;
                          }
                        }
                      } else {
                        L18: {
                          var4 = (int)var3.field_b;
                          if (-1 != ((fg) this).field_h[var4]) {
                            break L18;
                          } else {
                            ag discarded$7 = this.a((byte) -37, 1, var4);
                            break L18;
                          }
                        }
                        L19: {
                          if (-1 == ((fg) this).field_h[var4]) {
                            var2_int = 0;
                            break L19;
                          } else {
                            var3.c(-124);
                            break L19;
                          }
                        }
                        var3 = ((fg) this).field_o.b((byte) 103);
                        continue L13;
                      }
                    }
                  }
                } else {
                  return;
                }
              }
            }
            L20: {
              if (param0 > 84) {
                break L20;
              } else {
                ((fg) this).field_m = null;
                break L20;
              }
            }
            if (!((fg) this).field_i) {
              break L0;
            } else {
              if (((fg) this).field_x <= kh.a(-106)) {
                var2 = (ag) (Object) ((fg) this).field_v.a(false);
                L21: while (true) {
                  if (var2 == null) {
                    break L1;
                  } else {
                    L22: {
                      if (!var2.field_p) {
                        if (var2.field_t) {
                          if (var2.field_q) {
                            var2.c(-124);
                            break L22;
                          } else {
                            throw new RuntimeException();
                          }
                        } else {
                          var2.field_t = true;
                          break L22;
                        }
                      } else {
                        break L22;
                      }
                    }
                    var2 = (ag) (Object) ((fg) this).field_v.a(0);
                    continue L21;
                  }
                }
              } else {
                break L0;
              }
            }
          }
          ((fg) this).field_x = 1000L + kh.a(-95);
          break L0;
        }
    }

    final ps a(boolean param0) {
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        un stackIn_15_0 = null;
        un stackIn_16_0 = null;
        un stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        RuntimeException decompiledCaughtException = null;
        un stackOut_14_0 = null;
        un stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        un stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        var4 = AceOfSkies.field_G ? 1 : 0;
        if (((fg) this).field_m == null) {
          L0: {
            if (null != ((fg) this).field_y) {
              break L0;
            } else {
              if (!((fg) this).field_g.a(false)) {
                ((fg) this).field_y = (ag) (Object) ((fg) this).field_g.a(255, ((fg) this).field_p, -21, true, (byte) 0);
                break L0;
              } else {
                return null;
              }
            }
          }
          if (!((fg) this).field_y.field_p) {
            L1: {
              var5 = ((fg) this).field_y.a(param0);
              var2 = var5;
              if (((fg) this).field_y instanceof os) {
                try {
                  L2: {
                    if (var5 == null) {
                      throw new RuntimeException();
                    } else {
                      ((fg) this).field_m = new ps(var5, ((fg) this).field_j, ((fg) this).field_u);
                      if (((fg) this).field_m.field_m != ((fg) this).field_w) {
                        throw new RuntimeException();
                      } else {
                        break L2;
                      }
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var3 = decompiledCaughtException;
                    ((fg) this).field_m = null;
                    if (((fg) this).field_g.a(false)) {
                      ((fg) this).field_y = null;
                      break L3;
                    } else {
                      ((fg) this).field_y = (ag) (Object) ((fg) this).field_g.a(255, ((fg) this).field_p, -21, true, (byte) 0);
                      break L3;
                    }
                  }
                  return null;
                }
                break L1;
              } else {
                try {
                  L4: {
                    if (var5 == null) {
                      throw new RuntimeException();
                    } else {
                      ((fg) this).field_m = new ps(var5, ((fg) this).field_j, ((fg) this).field_u);
                      break L4;
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L5: {
                    var3 = decompiledCaughtException;
                    ((fg) this).field_g.c((byte) -126);
                    ((fg) this).field_m = null;
                    stackOut_14_0 = ((fg) this).field_g;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_15_0 = stackOut_14_0;
                    if (param0) {
                      stackOut_16_0 = (un) (Object) stackIn_16_0;
                      stackOut_16_1 = 0;
                      stackIn_17_0 = stackOut_16_0;
                      stackIn_17_1 = stackOut_16_1;
                      break L5;
                    } else {
                      stackOut_15_0 = (un) (Object) stackIn_15_0;
                      stackOut_15_1 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      break L5;
                    }
                  }
                  L6: {
                    if (((un) (Object) stackIn_17_0).a(stackIn_17_1 == 0)) {
                      ((fg) this).field_y = (ag) (Object) ((fg) this).field_g.a(255, ((fg) this).field_p, -21, true, (byte) 0);
                      break L6;
                    } else {
                      ((fg) this).field_y = null;
                      break L6;
                    }
                  }
                  return null;
                }
                if (((fg) this).field_e != null) {
                  os discarded$1 = ((fg) this).field_z.a(var5, ((fg) this).field_e, param0, ((fg) this).field_p);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L7: {
              ((fg) this).field_y = null;
              if (((fg) this).field_l == null) {
                break L7;
              } else {
                ((fg) this).field_h = new byte[((fg) this).field_m.field_l];
                break L7;
              }
            }
            return ((fg) this).field_m;
          } else {
            return null;
          }
        } else {
          return ((fg) this).field_m;
        }
    }

    public static void b() {
        field_f = null;
        field_t = null;
        field_r = null;
        field_k = null;
        field_A = null;
    }

    private final ag a(byte param0, int param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        RuntimeException var6 = null;
        Exception var6_ref = null;
        int var6_int = 0;
        int var7 = 0;
        byte[] var7_ref_byte__ = null;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object stackIn_88_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_87_0 = null;
        L0: {
          var10 = AceOfSkies.field_G ? 1 : 0;
          var4 = (Object) (Object) (ag) (Object) ((fg) this).field_v.a((byte) 106, (long)param2);
          if (var4 == null) {
            break L0;
          } else {
            if (param1 != 0) {
              break L0;
            } else {
              if (((ag) var4).field_q) {
                break L0;
              } else {
                if (((ag) var4).field_p) {
                  ((ag) var4).c(-125);
                  var4 = null;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (var4 != null) {
            break L1;
          } else {
            L2: {
              if (0 != param1) {
                if (param1 == 1) {
                  if (((fg) this).field_l == null) {
                    throw new RuntimeException();
                  } else {
                    var4 = (Object) (Object) ((fg) this).field_z.a((byte) 95, ((fg) this).field_l, param2);
                    break L2;
                  }
                } else {
                  if (2 == param1) {
                    if (((fg) this).field_l != null) {
                      if (-1 == ((fg) this).field_h[param2]) {
                        if (!((fg) this).field_g.a((byte) -114)) {
                          var4 = (Object) (Object) ((fg) this).field_g.a(((fg) this).field_p, param2, -21, false, (byte) 2);
                          break L2;
                        } else {
                          return null;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  } else {
                    throw new RuntimeException();
                  }
                }
              } else {
                L3: {
                  if (((fg) this).field_l == null) {
                    break L3;
                  } else {
                    if (-1 == ((fg) this).field_h[param2]) {
                      break L3;
                    } else {
                      var4 = (Object) (Object) ((fg) this).field_z.a(((fg) this).field_l, (byte) 96, param2);
                      break L2;
                    }
                  }
                }
                if (!((fg) this).field_g.a(false)) {
                  var4 = (Object) (Object) ((fg) this).field_g.a(((fg) this).field_p, param2, -21, true, (byte) 2);
                  break L2;
                } else {
                  return null;
                }
              }
            }
            ((fg) this).field_v.a(-41, (long)param2, (wf) var4);
            break L1;
          }
        }
        if (!((ag) var4).field_p) {
          var5 = ((ag) var4).a(true);
          if (var4 instanceof os) {
            try {
              L4: {
                L5: {
                  if (var5 == null) {
                    break L5;
                  } else {
                    if (var5.length <= 2) {
                      break L5;
                    } else {
                      aq.field_d.reset();
                      aq.field_d.update(var5, 0, var5.length - 2);
                      var6_int = (int)aq.field_d.getValue();
                      if (var6_int != ((fg) this).field_m.field_g[param2]) {
                        throw new RuntimeException();
                      } else {
                        L6: {
                          if (((fg) this).field_m.field_i == null) {
                            break L6;
                          } else {
                            if (((fg) this).field_m.field_i[param2] == null) {
                              break L6;
                            } else {
                              var7_ref_byte__ = ((fg) this).field_m.field_i[param2];
                              var8 = qm.a(0, var5.length - 2, var5, 0);
                              var11 = 0;
                              var9 = var11;
                              L7: while (true) {
                                if (var11 >= 64) {
                                  break L6;
                                } else {
                                  if (var8[var11] == var7_ref_byte__[var11]) {
                                    var11++;
                                    continue L7;
                                  } else {
                                    throw new RuntimeException();
                                  }
                                }
                              }
                            }
                          }
                        }
                        var7 = (255 & var5[-1 + var5.length]) + ((255 & var5[-2 + var5.length]) << 8);
                        if ((65535 & ((fg) this).field_m.field_a[param2]) != var7) {
                          throw new RuntimeException();
                        } else {
                          L8: {
                            if (-2 == ((fg) this).field_h[param2]) {
                              break L8;
                            } else {
                              L9: {
                                if (-1 == ((fg) this).field_h[param2]) {
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              ((fg) this).field_h[param2] = (byte) 1;
                              break L8;
                            }
                          }
                          L10: {
                            if (!((ag) var4).field_q) {
                              ((ag) var4).c(-124);
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          stackOut_87_0 = var4;
                          stackIn_88_0 = stackOut_87_0;
                          break L4;
                        }
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L11: {
                var6_ref = (Exception) (Object) decompiledCaughtException;
                ((fg) this).field_h[param2] = (byte) -1;
                ((ag) var4).c(-125);
                if (((ag) var4).field_q) {
                  if (!((fg) this).field_g.a(false)) {
                    var4 = (Object) (Object) ((fg) this).field_g.a(((fg) this).field_p, param2, -21, true, (byte) 2);
                    ((fg) this).field_v.a(-87, (long)param2, (wf) var4);
                    break L11;
                  } else {
                    break L11;
                  }
                } else {
                  break L11;
                }
              }
              return null;
            }
            return (ag) (Object) stackIn_88_0;
          } else {
            try {
              L12: {
                L13: {
                  if (var5 == null) {
                    break L13;
                  } else {
                    if (2 < var5.length) {
                      aq.field_d.reset();
                      aq.field_d.update(var5, 0, -2 + var5.length);
                      var6_int = (int)aq.field_d.getValue();
                      if (var6_int != ((fg) this).field_m.field_g[param2]) {
                        throw new RuntimeException();
                      } else {
                        L14: {
                          if (null == ((fg) this).field_m.field_i) {
                            break L14;
                          } else {
                            if (null != ((fg) this).field_m.field_i[param2]) {
                              var7_ref_byte__ = ((fg) this).field_m.field_i[param2];
                              var8 = qm.a(0, -2 + var5.length, var5, 0);
                              var9 = 0;
                              L15: while (true) {
                                if (64 <= var9) {
                                  break L14;
                                } else {
                                  if (var8[var9] == var7_ref_byte__[var9]) {
                                    var9++;
                                    continue L15;
                                  } else {
                                    throw new RuntimeException();
                                  }
                                }
                              }
                            } else {
                              break L14;
                            }
                          }
                        }
                        ((fg) this).field_g.field_j = 0;
                        ((fg) this).field_g.field_e = 0;
                        break L12;
                      }
                    } else {
                      break L13;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L16: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                ((fg) this).field_g.c((byte) -46);
                ((ag) var4).c(-127);
                if (((ag) var4).field_q) {
                  if (!((fg) this).field_g.a(false)) {
                    var4 = (Object) (Object) ((fg) this).field_g.a(((fg) this).field_p, param2, -21, true, (byte) 2);
                    ((fg) this).field_v.a(-114, (long)param2, (wf) var4);
                    break L16;
                  } else {
                    break L16;
                  }
                } else {
                  break L16;
                }
              }
              return null;
            }
            L17: {
              var5[-2 + var5.length] = (byte)(((fg) this).field_m.field_a[param2] >>> 8);
              var5[-1 + var5.length] = (byte)((fg) this).field_m.field_a[param2];
              if (null != ((fg) this).field_l) {
                os discarded$1 = ((fg) this).field_z.a(var5, ((fg) this).field_l, true, param2);
                if (1 == ((fg) this).field_h[param2]) {
                  break L17;
                } else {
                  ((fg) this).field_h[param2] = (byte) 1;
                  break L17;
                }
              } else {
                break L17;
              }
            }
            L18: {
              if (!((ag) var4).field_q) {
                ((ag) var4).c(-126);
                break L18;
              } else {
                break L18;
              }
            }
            return (ag) var4;
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, int param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var28 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 <= 0) {
                break L1;
              } else {
                if (!mg.a(param0, (byte) 23)) {
                  throw new IllegalArgumentException("");
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param1 <= 0) {
                break L2;
              } else {
                if (!mg.a(param1, (byte) 10)) {
                  throw new IllegalArgumentException("");
                } else {
                  break L2;
                }
              }
            }
            L3: {
              var8_int = 0;
              if (param1 > param0) {
                stackOut_11_0 = param0;
                stackIn_12_0 = stackOut_11_0;
                break L3;
              } else {
                stackOut_10_0 = param1;
                stackIn_12_0 = stackOut_10_0;
                break L3;
              }
            }
            var9 = stackIn_12_0;
            var10 = param0 >> 1;
            var11 = param1 >> 1;
            var12 = param5;
            var13 = new int[var11 * var10];
            L4: while (true) {
              jaggl.OpenGL.glTexImage2Di(param2, var8_int, param7, param0, param1, 0, 32993, param6, var12, 0);
              if (var9 <= 1) {
                break L0;
              } else {
                var15 = 0;
                var24 = 0;
                var25 = var24 + param0;
                var14 = var13;
                var26 = 0;
                L5: while (true) {
                  if (var11 <= var26) {
                    var13 = var12;
                    param1 = var11;
                    param0 = var10;
                    var12 = var14;
                    var9 = var9 >> 1;
                    var11 = var11 >> 1;
                    var10 = var10 >> 1;
                    var8_int++;
                    continue L4;
                  } else {
                    var27 = 0;
                    L6: while (true) {
                      if (var27 >= var10) {
                        var24 = var24 + param0;
                        var25 = var25 + param0;
                        var26++;
                        continue L5;
                      } else {
                        int incrementValue$5 = var24;
                        var24++;
                        var16 = var12[incrementValue$5];
                        int incrementValue$6 = var25;
                        var25++;
                        var18 = var12[incrementValue$6];
                        int incrementValue$7 = var24;
                        var24++;
                        var17 = var12[incrementValue$7];
                        var22 = 255 & var16;
                        int incrementValue$8 = var25;
                        var25++;
                        var19 = var12[incrementValue$8];
                        var23 = 255 & var16 >> 24;
                        var21 = (65501 & var16) >> 8;
                        var20 = 255 & var16 >> 16;
                        var22 = var22 + (var17 & 255);
                        var21 = var21 + ((65454 & var17) >> 8);
                        var20 = var20 + ((16771045 & var17) >> 16);
                        var23 = var23 + (255 & var17 >> 24);
                        var22 = var22 + (var18 & 255);
                        var23 = var23 + (255 & var18 >> 24);
                        var21 = var21 + ((65350 & var18) >> 8);
                        var20 = var20 + (var18 >> 16 & 255);
                        var23 = var23 + (255 & var19 >> 24);
                        var21 = var21 + ((var19 & 65535) >> 8);
                        var20 = var20 + ((var19 & 16745210) >> 16);
                        var22 = var22 + (var19 & 255);
                        int incrementValue$9 = var15;
                        var15++;
                        var13[incrementValue$9] = vo.a(vo.a(pg.a(var21, 1020) << 6, vo.a(pg.a(var20, 1020) << 14, pg.a(-16777216, var23 << 22))), pg.a(1020, var22) >> 2);
                        var27++;
                        continue L6;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var8 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var8;
            stackOut_22_1 = new StringBuilder().append("fg.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(32993).append(',').append(72).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param5 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final void c(int param0) {
        if (!(((fg) this).field_l != null)) {
            return;
        }
        if (param0 != -2) {
            return;
        }
        ((fg) this).field_s = true;
        if (null == ((fg) this).field_o) {
            ((fg) this).field_o = new kp();
        }
    }

    fg(int param0, bl param1, bl param2, un param3, dk param4, int param5, byte[] param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
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
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
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
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        ((fg) this).field_v = new ph(16);
        ((fg) this).field_d = 0;
        ((fg) this).field_n = new kp();
        ((fg) this).field_x = 0L;
        try {
          L0: {
            L1: {
              ((fg) this).field_p = param0;
              ((fg) this).field_l = param1;
              if (((fg) this).field_l != null) {
                ((fg) this).field_q = true;
                ((fg) this).field_o = new kp();
                break L1;
              } else {
                ((fg) this).field_q = false;
                break L1;
              }
            }
            L2: {
              ((fg) this).field_g = param3;
              ((fg) this).field_e = param2;
              ((fg) this).field_u = param6;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param8) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              ((fg) this).field_i = stackIn_7_1 != 0;
              ((fg) this).field_j = param5;
              ((fg) this).field_z = param4;
              ((fg) this).field_w = param7;
              if (((fg) this).field_e == null) {
                break L3;
              } else {
                ((fg) this).field_y = (ag) (Object) ((fg) this).field_z.a(((fg) this).field_e, (byte) 93, ((fg) this).field_p);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var10;
            stackOut_10_1 = new StringBuilder().append("fg.<init>(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          L7: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          L8: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param5).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param6 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new kp();
        field_f = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_A = new ke();
    }
}
