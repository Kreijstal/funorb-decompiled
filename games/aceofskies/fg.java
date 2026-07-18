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

    final static byte[] a(byte[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param1 > 105) {
                break L1;
              } else {
                cl discarded$2 = fg.a((String) null, 109);
                break L1;
              }
            }
            var2_int = param0.length;
            var3 = new byte[var2_int];
            au.a(param0, 0, var3, 0, var2_int);
            stackOut_3_0 = (byte[]) var3;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("fg.F(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final static cl a(String param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        cl var3 = null;
        String var4 = null;
        Object stackIn_4_0 = null;
        cl stackIn_18_0 = null;
        Object stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_20_0 = null;
        cl stackOut_17_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            if (gi.field_g == null) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (cl) (Object) stackIn_4_0;
            } else {
              L1: {
                if (param1 == 17680) {
                  break L1;
                } else {
                  fg.b((byte) -26);
                  break L1;
                }
              }
              L2: {
                var2 = vu.a(param1 ^ 17773, (CharSequence) (Object) param0);
                if (null != var2) {
                  break L2;
                } else {
                  var2 = param0;
                  break L2;
                }
              }
              var3 = (cl) (Object) gi.field_g.a(param1 + -17556, (long)var2.hashCode());
              L3: while (true) {
                if (var3 == null) {
                  stackOut_20_0 = null;
                  stackIn_21_0 = stackOut_20_0;
                  break L0;
                } else {
                  L4: {
                    var4 = vu.a(125, (CharSequence) (Object) var3.field_I);
                    if (null != var4) {
                      break L4;
                    } else {
                      var4 = var3.field_I;
                      break L4;
                    }
                  }
                  if (var4.equals((Object) (Object) var2)) {
                    stackOut_17_0 = (cl) var3;
                    stackIn_18_0 = stackOut_17_0;
                    return stackIn_18_0;
                  } else {
                    var3 = (cl) (Object) gi.field_g.a(false);
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2_ref = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2_ref;
            stackOut_22_1 = new StringBuilder().append("fg.K(");
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L5;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L5;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param1 + ')');
        }
        return (cl) (Object) stackIn_21_0;
    }

    final int b(int param0, int param1) {
        ag var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                field_k = null;
                break L1;
              }
            }
            var3 = (ag) (Object) ((fg) this).field_v.a((byte) 106, (long)param1);
            if (var3 != null) {
              stackOut_6_0 = var3.e(21513);
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var3_ref, "fg.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final void b(int param0) {
        RuntimeException var2 = null;
        wf var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (null == ((fg) this).field_o) {
              return;
            } else {
              if (null == ((fg) this).a(true)) {
                return;
              } else {
                if (param0 == -20254) {
                  var2_ref = ((fg) this).field_n.d(param0 ^ -268415203);
                  L1: while (true) {
                    L2: {
                      L3: {
                        if (null == var2_ref) {
                          break L3;
                        } else {
                          var3 = (int)var2_ref.field_b;
                          if (var4 != 0) {
                            break L2;
                          } else {
                            L4: {
                              L5: {
                                L6: {
                                  if (var3 < 0) {
                                    break L6;
                                  } else {
                                    if (~var3 <= ~((fg) this).field_m.field_l) {
                                      break L6;
                                    } else {
                                      if (((fg) this).field_m.field_k[var3] == 0) {
                                        break L6;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                }
                                var2_ref.c(-124);
                                if (var4 == 0) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                              L7: {
                                if (((fg) this).field_h[var3] != 0) {
                                  break L7;
                                } else {
                                  ag discarded$2 = this.a((byte) -37, 1, var3);
                                  break L7;
                                }
                              }
                              L8: {
                                if (((fg) this).field_h[var3] == -1) {
                                  ag discarded$3 = this.a((byte) -37, 2, var3);
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                              if (((fg) this).field_h[var3] == 1) {
                                var2_ref.c(param0 ^ 20327);
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            var2_ref = ((fg) this).field_n.b((byte) 103);
                            if (var4 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      break L2;
                    }
                    break L0;
                  }
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2, "fg.G(" + param0 + ')');
        }
    }

    final byte[] a(int param0, int param1) {
        ag var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        byte[] stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        try {
          L0: {
            var3 = this.a((byte) -37, 0, param0);
            if (var3 == null) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (byte[]) (Object) stackIn_4_0;
            } else {
              var4 = var3.a(true);
              var3.c(param1 ^ -128);
              if (param1 == 2) {
                stackOut_8_0 = (byte[]) var4;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (byte[]) (Object) stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var3_ref, "fg.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final static void b(boolean param0) {
        try {
            tn.a(1, param0, nh.field_b, rt.field_e);
            ae.field_f = true;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "fg.H(" + param0 + ')');
        }
    }

    final void a(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        ag var2_ref = null;
        wf var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        int stackIn_93_0 = 0;
        int stackIn_93_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_40_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int stackOut_64_0 = 0;
        int stackOut_64_1 = 0;
        int stackOut_65_0 = 0;
        int stackOut_65_1 = 0;
        int stackOut_62_0 = 0;
        int stackOut_62_1 = 0;
        byte stackOut_92_0 = 0;
        int stackOut_92_1 = 0;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (((fg) this).field_o == null) {
                  break L2;
                } else {
                  if (((fg) this).a(true) != null) {
                    L3: {
                      if (!((fg) this).field_q) {
                        break L3;
                      } else {
                        var2_int = 1;
                        var3 = ((fg) this).field_o.d(268435455);
                        L4: while (true) {
                          L5: {
                            L6: {
                              L7: {
                                if (var3 == null) {
                                  break L7;
                                } else {
                                  var4 = (int)var3.field_b;
                                  stackOut_7_0 = -1;
                                  stackOut_7_1 = ~((fg) this).field_h[var4];
                                  stackIn_20_0 = stackOut_7_0;
                                  stackIn_20_1 = stackOut_7_1;
                                  stackIn_8_0 = stackOut_7_0;
                                  stackIn_8_1 = stackOut_7_1;
                                  if (var5 != 0) {
                                    L8: while (true) {
                                      if (stackIn_20_0 >= stackIn_20_1) {
                                        break L6;
                                      } else {
                                        stackOut_21_0 = ((fg) this).field_m.field_k[((fg) this).field_d];
                                        stackIn_41_0 = stackOut_21_0;
                                        stackIn_22_0 = stackOut_21_0;
                                        if (var5 != 0) {
                                          break L5;
                                        } else {
                                          stackOut_22_0 = stackIn_22_0;
                                          stackIn_24_0 = stackOut_22_0;
                                          L9: {
                                            L10: {
                                              if (stackIn_24_0 != 0) {
                                                break L10;
                                              } else {
                                                ((fg) this).field_d = ((fg) this).field_d + 1;
                                                if (var5 == 0) {
                                                  break L9;
                                                } else {
                                                  break L10;
                                                }
                                              }
                                            }
                                            L11: {
                                              if (((fg) this).field_z.field_d < 250) {
                                                break L11;
                                              } else {
                                                var2_int = 0;
                                                if (var5 == 0) {
                                                  break L6;
                                                } else {
                                                  break L11;
                                                }
                                              }
                                            }
                                            L12: {
                                              if (((fg) this).field_h[((fg) this).field_d] != 0) {
                                                break L12;
                                              } else {
                                                ag discarded$4 = this.a((byte) -37, 1, ((fg) this).field_d);
                                                break L12;
                                              }
                                            }
                                            L13: {
                                              if (((fg) this).field_h[((fg) this).field_d] != 0) {
                                                break L13;
                                              } else {
                                                var3 = new wf();
                                                var3.field_b = (long)((fg) this).field_d;
                                                var2_int = 0;
                                                ((fg) this).field_o.a(81, var3);
                                                break L13;
                                              }
                                            }
                                            ((fg) this).field_d = ((fg) this).field_d + 1;
                                            if (var5 == 0) {
                                              break L9;
                                            } else {
                                              break L6;
                                            }
                                          }
                                          stackOut_19_0 = ~((fg) this).field_m.field_k.length;
                                          stackOut_19_1 = ~((fg) this).field_d;
                                          stackIn_20_0 = stackOut_19_0;
                                          stackIn_20_1 = stackOut_19_1;
                                          continue L8;
                                        }
                                      }
                                    }
                                  } else {
                                    L14: {
                                      if (stackIn_8_0 != stackIn_8_1) {
                                        break L14;
                                      } else {
                                        ag discarded$5 = this.a((byte) -37, 1, var4);
                                        break L14;
                                      }
                                    }
                                    L15: {
                                      L16: {
                                        if (((fg) this).field_h[var4] == 0) {
                                          break L16;
                                        } else {
                                          var3.c(-124);
                                          if (var5 == 0) {
                                            break L15;
                                          } else {
                                            break L16;
                                          }
                                        }
                                      }
                                      var2_int = 0;
                                      break L15;
                                    }
                                    var3 = ((fg) this).field_o.b((byte) 103);
                                    if (var5 == 0) {
                                      continue L4;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              L17: while (true) {
                                stackOut_19_0 = ~((fg) this).field_m.field_k.length;
                                stackOut_19_1 = ~((fg) this).field_d;
                                stackIn_20_0 = stackOut_19_0;
                                stackIn_20_1 = stackOut_19_1;
                                if (stackIn_20_0 >= stackIn_20_1) {
                                  break L6;
                                } else {
                                  stackOut_21_0 = ((fg) this).field_m.field_k[((fg) this).field_d];
                                  stackIn_41_0 = stackOut_21_0;
                                  stackIn_22_0 = stackOut_21_0;
                                  if (var5 != 0) {
                                    break L5;
                                  } else {
                                    stackOut_22_0 = stackIn_22_0;
                                    stackIn_24_0 = stackOut_22_0;
                                    L18: {
                                      if (stackIn_24_0 != 0) {
                                        break L18;
                                      } else {
                                        ((fg) this).field_d = ((fg) this).field_d + 1;
                                        if (var5 == 0) {
                                          continue L17;
                                        } else {
                                          break L18;
                                        }
                                      }
                                    }
                                    L19: {
                                      if (((fg) this).field_z.field_d < 250) {
                                        break L19;
                                      } else {
                                        var2_int = 0;
                                        if (var5 == 0) {
                                          break L6;
                                        } else {
                                          break L19;
                                        }
                                      }
                                    }
                                    L20: {
                                      if (((fg) this).field_h[((fg) this).field_d] != 0) {
                                        break L20;
                                      } else {
                                        ag discarded$4 = this.a((byte) -37, 1, ((fg) this).field_d);
                                        break L20;
                                      }
                                    }
                                    L21: {
                                      if (((fg) this).field_h[((fg) this).field_d] != 0) {
                                        break L21;
                                      } else {
                                        var3 = new wf();
                                        var3.field_b = (long)((fg) this).field_d;
                                        var2_int = 0;
                                        ((fg) this).field_o.a(81, var3);
                                        break L21;
                                      }
                                    }
                                    ((fg) this).field_d = ((fg) this).field_d + 1;
                                    if (var5 == 0) {
                                      continue L17;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_40_0 = var2_int;
                            stackIn_41_0 = stackOut_40_0;
                            break L5;
                          }
                          L22: {
                            if (stackIn_41_0 == 0) {
                              break L22;
                            } else {
                              ((fg) this).field_q = false;
                              ((fg) this).field_d = 0;
                              break L22;
                            }
                          }
                          if (var5 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    L23: {
                      if (!((fg) this).field_s) {
                        break L23;
                      } else {
                        var2_int = 1;
                        var3 = ((fg) this).field_o.d(268435455);
                        L24: while (true) {
                          L25: {
                            L26: {
                              if (var3 == null) {
                                break L26;
                              } else {
                                var4 = (int)var3.field_b;
                                stackOut_50_0 = -2;
                                stackOut_50_1 = ~((fg) this).field_h[var4];
                                stackIn_63_0 = stackOut_50_0;
                                stackIn_63_1 = stackOut_50_1;
                                stackIn_51_0 = stackOut_50_0;
                                stackIn_51_1 = stackOut_50_1;
                                if (var5 != 0) {
                                  L27: while (true) {
                                    if (stackIn_63_0 >= stackIn_63_1) {
                                      break L25;
                                    } else {
                                      stackOut_64_0 = 0;
                                      stackOut_64_1 = ((fg) this).field_m.field_k[((fg) this).field_d];
                                      stackIn_93_0 = stackOut_64_0;
                                      stackIn_93_1 = stackOut_64_1;
                                      stackIn_65_0 = stackOut_64_0;
                                      stackIn_65_1 = stackOut_64_1;
                                      if (var5 != 0) {
                                        break L1;
                                      } else {
                                        stackOut_65_0 = stackIn_65_0;
                                        stackOut_65_1 = stackIn_65_1;
                                        stackIn_67_0 = stackOut_65_0;
                                        stackIn_67_1 = stackOut_65_1;
                                        L28: {
                                          L29: {
                                            if (stackIn_67_0 == stackIn_67_1) {
                                              ((fg) this).field_d = ((fg) this).field_d + 1;
                                              if (var5 == 0) {
                                                break L28;
                                              } else {
                                                break L29;
                                              }
                                            } else {
                                              break L29;
                                            }
                                          }
                                          L30: {
                                            if (((fg) this).field_g.a((byte) -106)) {
                                              var2_int = 0;
                                              if (var5 == 0) {
                                                break L25;
                                              } else {
                                                break L30;
                                              }
                                            } else {
                                              break L30;
                                            }
                                          }
                                          L31: {
                                            if (((fg) this).field_h[((fg) this).field_d] != 1) {
                                              ag discarded$6 = this.a((byte) -37, 2, ((fg) this).field_d);
                                              break L31;
                                            } else {
                                              break L31;
                                            }
                                          }
                                          L32: {
                                            if (((fg) this).field_h[((fg) this).field_d] == 1) {
                                              break L32;
                                            } else {
                                              var3 = new wf();
                                              var3.field_b = (long)((fg) this).field_d;
                                              var2_int = 0;
                                              ((fg) this).field_o.a(115, var3);
                                              break L32;
                                            }
                                          }
                                          ((fg) this).field_d = ((fg) this).field_d + 1;
                                          if (var5 == 0) {
                                            break L28;
                                          } else {
                                            break L25;
                                          }
                                        }
                                        stackOut_62_0 = ((fg) this).field_d;
                                        stackOut_62_1 = ((fg) this).field_m.field_k.length;
                                        stackIn_63_0 = stackOut_62_0;
                                        stackIn_63_1 = stackOut_62_1;
                                        continue L27;
                                      }
                                    }
                                  }
                                } else {
                                  L33: {
                                    if (stackIn_51_0 == stackIn_51_1) {
                                      break L33;
                                    } else {
                                      ag discarded$7 = this.a((byte) -37, 2, var4);
                                      break L33;
                                    }
                                  }
                                  L34: {
                                    L35: {
                                      if (((fg) this).field_h[var4] != 1) {
                                        break L35;
                                      } else {
                                        var3.c(-123);
                                        if (var5 == 0) {
                                          break L34;
                                        } else {
                                          break L35;
                                        }
                                      }
                                    }
                                    var2_int = 0;
                                    break L34;
                                  }
                                  var3 = ((fg) this).field_o.b((byte) 103);
                                  if (var5 == 0) {
                                    continue L24;
                                  } else {
                                    break L26;
                                  }
                                }
                              }
                            }
                            L36: while (true) {
                              stackOut_62_0 = ((fg) this).field_d;
                              stackOut_62_1 = ((fg) this).field_m.field_k.length;
                              stackIn_63_0 = stackOut_62_0;
                              stackIn_63_1 = stackOut_62_1;
                              if (stackIn_63_0 >= stackIn_63_1) {
                                break L25;
                              } else {
                                stackOut_64_0 = 0;
                                stackOut_64_1 = ((fg) this).field_m.field_k[((fg) this).field_d];
                                stackIn_93_0 = stackOut_64_0;
                                stackIn_93_1 = stackOut_64_1;
                                stackIn_65_0 = stackOut_64_0;
                                stackIn_65_1 = stackOut_64_1;
                                if (var5 != 0) {
                                  break L1;
                                } else {
                                  stackOut_65_0 = stackIn_65_0;
                                  stackOut_65_1 = stackIn_65_1;
                                  stackIn_67_0 = stackOut_65_0;
                                  stackIn_67_1 = stackOut_65_1;
                                  L37: {
                                    if (stackIn_67_0 == stackIn_67_1) {
                                      ((fg) this).field_d = ((fg) this).field_d + 1;
                                      if (var5 == 0) {
                                        continue L36;
                                      } else {
                                        break L37;
                                      }
                                    } else {
                                      break L37;
                                    }
                                  }
                                  L38: {
                                    if (((fg) this).field_g.a((byte) -106)) {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L25;
                                      } else {
                                        break L38;
                                      }
                                    } else {
                                      break L38;
                                    }
                                  }
                                  L39: {
                                    if (((fg) this).field_h[((fg) this).field_d] != 1) {
                                      ag discarded$6 = this.a((byte) -37, 2, ((fg) this).field_d);
                                      break L39;
                                    } else {
                                      break L39;
                                    }
                                  }
                                  L40: {
                                    if (((fg) this).field_h[((fg) this).field_d] == 1) {
                                      break L40;
                                    } else {
                                      var3 = new wf();
                                      var3.field_b = (long)((fg) this).field_d;
                                      var2_int = 0;
                                      ((fg) this).field_o.a(115, var3);
                                      break L40;
                                    }
                                  }
                                  ((fg) this).field_d = ((fg) this).field_d + 1;
                                  if (var5 == 0) {
                                    continue L36;
                                  } else {
                                    break L25;
                                  }
                                }
                              }
                            }
                          }
                          L41: {
                            if (var2_int != 0) {
                              ((fg) this).field_d = 0;
                              ((fg) this).field_s = false;
                              break L41;
                            } else {
                              break L41;
                            }
                          }
                          if (var5 == 0) {
                            break L2;
                          } else {
                            break L23;
                          }
                        }
                      }
                    }
                    ((fg) this).field_o = null;
                    break L2;
                  } else {
                    return;
                  }
                }
              }
              stackOut_92_0 = param0;
              stackOut_92_1 = 84;
              stackIn_93_0 = stackOut_92_0;
              stackIn_93_1 = stackOut_92_1;
              break L1;
            }
            L42: {
              if (stackIn_93_0 > stackIn_93_1) {
                break L42;
              } else {
                ((fg) this).field_m = null;
                break L42;
              }
            }
            L43: {
              if (!((fg) this).field_i) {
                break L43;
              } else {
                if (((fg) this).field_x <= kh.a(-106)) {
                  var2_ref = (ag) (Object) ((fg) this).field_v.a(false);
                  L44: while (true) {
                    L45: {
                      if (null == var2_ref) {
                        break L45;
                      } else {
                        if (var5 != 0) {
                          break L43;
                        } else {
                          L46: {
                            L47: {
                              if (!var2_ref.field_p) {
                                break L47;
                              } else {
                                if (var5 == 0) {
                                  break L46;
                                } else {
                                  break L47;
                                }
                              }
                            }
                            L48: {
                              if (var2_ref.field_t) {
                                break L48;
                              } else {
                                var2_ref.field_t = true;
                                if (var5 == 0) {
                                  break L46;
                                } else {
                                  break L48;
                                }
                              }
                            }
                            if (var2_ref.field_q) {
                              var2_ref.c(-124);
                              break L46;
                            } else {
                              throw new RuntimeException();
                            }
                          }
                          var2_ref = (ag) (Object) ((fg) this).field_v.a(0);
                          if (var5 == 0) {
                            continue L44;
                          } else {
                            break L45;
                          }
                        }
                      }
                    }
                    ((fg) this).field_x = 1000L + kh.a(-95);
                    break L43;
                  }
                } else {
                  break L43;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2, "fg.M(" + param0 + ')');
        }
    }

    final ps a(boolean param0) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        RuntimeException var3 = null;
        int var4 = 0;
        ps stackIn_3_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_13_0 = null;
        un stackIn_22_0 = null;
        un stackIn_24_0 = null;
        un stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        Object stackIn_32_0 = null;
        Object stackIn_53_0 = null;
        ps stackIn_58_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        un stackOut_21_0 = null;
        un stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        un stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        Object stackOut_31_0 = null;
        Object stackOut_52_0 = null;
        ps stackOut_57_0 = null;
        Object stackOut_12_0 = null;
        ps stackOut_2_0 = null;
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (((fg) this).field_m == null) {
              L1: {
                if (null != ((fg) this).field_y) {
                  break L1;
                } else {
                  if (!((fg) this).field_g.a(false)) {
                    ((fg) this).field_y = (ag) (Object) ((fg) this).field_g.a(255, ((fg) this).field_p, -21, true, (byte) 0);
                    break L1;
                  } else {
                    stackOut_8_0 = null;
                    stackIn_9_0 = stackOut_8_0;
                    return (ps) (Object) stackIn_9_0;
                  }
                }
              }
              if (!((fg) this).field_y.field_p) {
                L2: {
                  L3: {
                    var2_array = ((fg) this).field_y.a(param0);
                    if (((fg) this).field_y instanceof os) {
                      break L3;
                    } else {
                      try {
                        L4: {
                          if (null == var2_array) {
                            throw new RuntimeException();
                          } else {
                            ((fg) this).field_m = new ps(var2_array, ((fg) this).field_j, ((fg) this).field_u);
                            break L4;
                          }
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L5: {
                          var3 = decompiledCaughtException;
                          ((fg) this).field_g.c((byte) -126);
                          ((fg) this).field_m = null;
                          stackOut_21_0 = ((fg) this).field_g;
                          stackIn_24_0 = stackOut_21_0;
                          stackIn_22_0 = stackOut_21_0;
                          if (param0) {
                            stackOut_24_0 = (un) (Object) stackIn_24_0;
                            stackOut_24_1 = 0;
                            stackIn_25_0 = stackOut_24_0;
                            stackIn_25_1 = stackOut_24_1;
                            break L5;
                          } else {
                            stackOut_22_0 = (un) (Object) stackIn_22_0;
                            stackOut_22_1 = 1;
                            stackIn_25_0 = stackOut_22_0;
                            stackIn_25_1 = stackOut_22_1;
                            break L5;
                          }
                        }
                        L6: {
                          L7: {
                            if (((un) (Object) stackIn_25_0).a(stackIn_25_1 == 0)) {
                              break L7;
                            } else {
                              ((fg) this).field_y = null;
                              if (var4 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          ((fg) this).field_y = (ag) (Object) ((fg) this).field_g.a(255, ((fg) this).field_p, -21, true, (byte) 0);
                          break L6;
                        }
                        stackOut_31_0 = null;
                        stackIn_32_0 = stackOut_31_0;
                        return (ps) (Object) stackIn_32_0;
                      }
                      if (((fg) this).field_e != null) {
                        os discarded$1 = ((fg) this).field_z.a(var2_array, ((fg) this).field_e, param0, ((fg) this).field_p);
                        if (var4 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                  try {
                    L8: {
                      if (var2_array == null) {
                        throw new RuntimeException();
                      } else {
                        ((fg) this).field_m = new ps(var2_array, ((fg) this).field_j, ((fg) this).field_u);
                        if (~((fg) this).field_m.field_m != ~((fg) this).field_w) {
                          throw new RuntimeException();
                        } else {
                          break L8;
                        }
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L9: {
                      L10: {
                        var3 = decompiledCaughtException;
                        ((fg) this).field_m = null;
                        if (((fg) this).field_g.a(false)) {
                          break L10;
                        } else {
                          ((fg) this).field_y = (ag) (Object) ((fg) this).field_g.a(255, ((fg) this).field_p, -21, true, (byte) 0);
                          if (var4 == 0) {
                            break L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                      ((fg) this).field_y = null;
                      break L9;
                    }
                    stackOut_52_0 = null;
                    stackIn_53_0 = stackOut_52_0;
                    return (ps) (Object) stackIn_53_0;
                  }
                  break L2;
                }
                L11: {
                  ((fg) this).field_y = null;
                  if (((fg) this).field_l == null) {
                    break L11;
                  } else {
                    ((fg) this).field_h = new byte[((fg) this).field_m.field_l];
                    break L11;
                  }
                }
                stackOut_57_0 = ((fg) this).field_m;
                stackIn_58_0 = stackOut_57_0;
                break L0;
              } else {
                stackOut_12_0 = null;
                stackIn_13_0 = stackOut_12_0;
                return (ps) (Object) stackIn_13_0;
              }
            } else {
              stackOut_2_0 = ((fg) this).field_m;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2, "fg.D(" + param0 + ')');
        }
        return stackIn_58_0;
    }

    public static void b(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_f = null;
              field_t = null;
              field_r = null;
              field_k = null;
              if (param0 > 72) {
                break L1;
              } else {
                fg.b(false);
                break L1;
              }
            }
            field_A = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var1, "fg.N(" + param0 + ')');
        }
    }

    private final ag a(byte param0, int param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        RuntimeException var6 = null;
        Exception var6_ref = null;
        int var6_int = 0;
        byte[] var7_ref_byte__ = null;
        int var7 = 0;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_30_0 = null;
        Object stackIn_45_0 = null;
        Object stackIn_57_0 = null;
        Object stackIn_60_0 = null;
        int stackIn_81_0 = 0;
        int stackIn_81_1 = 0;
        Object stackIn_97_0 = null;
        int stackIn_102_0 = 0;
        int stackIn_102_1 = 0;
        Object stackIn_110_0 = null;
        byte stackIn_129_0 = 0;
        byte stackIn_129_1 = 0;
        int stackIn_136_0 = 0;
        int stackIn_136_1 = 0;
        Object stackIn_150_0 = null;
        Object stackIn_159_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_44_0 = null;
        Object stackOut_29_0 = null;
        byte stackOut_128_0 = 0;
        byte stackOut_128_1 = 0;
        int stackOut_135_0 = 0;
        int stackOut_135_1 = 0;
        Object stackOut_149_0 = null;
        int stackOut_80_0 = 0;
        int stackOut_80_1 = 0;
        Object stackOut_96_0 = null;
        int stackOut_101_0 = 0;
        byte stackOut_101_1 = 0;
        Object stackOut_109_0 = null;
        Object stackOut_59_0 = null;
        Object stackOut_56_0 = null;
        Object stackOut_158_0 = null;
        var10 = AceOfSkies.field_G ? 1 : 0;
        try {
          try {
            L0: {
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
                    L3: {
                      if (param1 == 1) {
                        break L3;
                      } else {
                        if (2 == param1) {
                          if (((fg) this).field_l != null) {
                            if (-1 == ((fg) this).field_h[param2]) {
                              if (!((fg) this).field_g.a((byte) -114)) {
                                var4 = (Object) (Object) ((fg) this).field_g.a(((fg) this).field_p, param2, -21, false, (byte) 2);
                                if (var10 == 0) {
                                  break L2;
                                } else {
                                  break L3;
                                }
                              } else {
                                stackOut_44_0 = null;
                                stackIn_45_0 = stackOut_44_0;
                                return (ag) (Object) stackIn_45_0;
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
                    }
                    if (((fg) this).field_l == null) {
                      throw new RuntimeException();
                    } else {
                      var4 = (Object) (Object) ((fg) this).field_z.a((byte) 95, ((fg) this).field_l, param2);
                      break L2;
                    }
                  } else {
                    L4: {
                      if (((fg) this).field_l == null) {
                        break L4;
                      } else {
                        if (-1 == ((fg) this).field_h[param2]) {
                          break L4;
                        } else {
                          var4 = (Object) (Object) ((fg) this).field_z.a(((fg) this).field_l, (byte) 96, param2);
                          if (var10 == 0) {
                            break L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    L5: {
                      if (((fg) this).field_g.a(false)) {
                        break L5;
                      } else {
                        var4 = (Object) (Object) ((fg) this).field_g.a(((fg) this).field_p, param2, param0 + 16, true, (byte) 2);
                        if (var10 == 0) {
                          break L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                    stackOut_29_0 = null;
                    stackIn_30_0 = stackOut_29_0;
                    return (ag) (Object) stackIn_30_0;
                  }
                }
                ((fg) this).field_v.a(-41, (long)param2, (wf) var4);
                break L1;
              }
            }
            if (!((ag) var4).field_p) {
              var5 = ((ag) var4).a(true);
              if (param0 == -37) {
                if (var4 instanceof os) {
                  L6: {
                    if (var5 == null) {
                      break L6;
                    } else {
                      if (var5.length <= 2) {
                        break L6;
                      } else {
                        aq.field_d.reset();
                        aq.field_d.update(var5, 0, var5.length - 2);
                        var6_int = (int)aq.field_d.getValue();
                        if (~var6_int != ~((fg) this).field_m.field_g[param2]) {
                          throw new RuntimeException();
                        } else {
                          L7: {
                            L8: {
                              if (((fg) this).field_m.field_i == null) {
                                break L8;
                              } else {
                                if (((fg) this).field_m.field_i[param2] == null) {
                                  break L8;
                                } else {
                                  var7_ref_byte__ = ((fg) this).field_m.field_i[param2];
                                  var8 = qm.a(0, var5.length - 2, var5, 0);
                                  var9 = 0;
                                  L9: while (true) {
                                    if (var9 >= 64) {
                                      break L8;
                                    } else {
                                      stackOut_128_0 = var8[var9];
                                      stackOut_128_1 = var7_ref_byte__[var9];
                                      stackIn_136_0 = stackOut_128_0;
                                      stackIn_136_1 = stackOut_128_1;
                                      stackIn_129_0 = stackOut_128_0;
                                      stackIn_129_1 = stackOut_128_1;
                                      if (var10 != 0) {
                                        break L7;
                                      } else {
                                        if (stackIn_129_0 == stackIn_129_1) {
                                          var9++;
                                          if (var10 == 0) {
                                            continue L9;
                                          } else {
                                            break L8;
                                          }
                                        } else {
                                          throw new RuntimeException();
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_135_0 = 255 & var5[-1 + var5.length];
                            stackOut_135_1 = (255 & var5[-2 + var5.length]) << -1232438008;
                            stackIn_136_0 = stackOut_135_0;
                            stackIn_136_1 = stackOut_135_1;
                            break L7;
                          }
                          var7 = stackIn_136_0 + stackIn_136_1;
                          if ((65535 & ((fg) this).field_m.field_a[param2]) != var7) {
                            throw new RuntimeException();
                          } else {
                            L10: {
                              if (((fg) this).field_h[param2] == 1) {
                                break L10;
                              } else {
                                L11: {
                                  if (((fg) this).field_h[param2] == 0) {
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                                ((fg) this).field_h[param2] = (byte) 1;
                                break L10;
                              }
                            }
                            L12: {
                              if (!((ag) var4).field_q) {
                                ((ag) var4).c(param0 + -87);
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                            stackOut_149_0 = var4;
                            stackIn_150_0 = stackOut_149_0;
                            return (ag) (Object) stackIn_150_0;
                          }
                        }
                      }
                    }
                  }
                  throw new RuntimeException();
                } else {
                  try {
                    L13: {
                      L14: {
                        if (var5 == null) {
                          break L14;
                        } else {
                          if (2 < var5.length) {
                            aq.field_d.reset();
                            aq.field_d.update(var5, 0, -2 + var5.length);
                            var6_int = (int)aq.field_d.getValue();
                            if (~var6_int != ~((fg) this).field_m.field_g[param2]) {
                              throw new RuntimeException();
                            } else {
                              L15: {
                                if (null == ((fg) this).field_m.field_i) {
                                  break L15;
                                } else {
                                  if (null != ((fg) this).field_m.field_i[param2]) {
                                    var7_ref_byte__ = ((fg) this).field_m.field_i[param2];
                                    var8 = qm.a(param0 ^ -37, -2 + var5.length, var5, 0);
                                    var9 = 0;
                                    L16: while (true) {
                                      if (64 <= var9) {
                                        break L15;
                                      } else {
                                        stackOut_80_0 = ~var8[var9];
                                        stackOut_80_1 = ~var7_ref_byte__[var9];
                                        stackIn_102_0 = stackOut_80_0;
                                        stackIn_102_1 = stackOut_80_1;
                                        stackIn_81_0 = stackOut_80_0;
                                        stackIn_81_1 = stackOut_80_1;
                                        if (var10 != 0) {
                                          decompiledRegionSelector0 = 0;
                                          break L13;
                                        } else {
                                          if (stackIn_81_0 == stackIn_81_1) {
                                            var9++;
                                            if (var10 == 0) {
                                              continue L16;
                                            } else {
                                              break L15;
                                            }
                                          } else {
                                            throw new RuntimeException();
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                              ((fg) this).field_g.field_j = 0;
                              ((fg) this).field_g.field_e = 0;
                              decompiledRegionSelector0 = 1;
                              break L13;
                            }
                          } else {
                            break L14;
                          }
                        }
                      }
                      throw new RuntimeException();
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L17: {
                      var6 = (RuntimeException) (Object) decompiledCaughtException;
                      ((fg) this).field_g.c((byte) -46);
                      ((ag) var4).c(param0 + -90);
                      if (((ag) var4).field_q) {
                        if (!((fg) this).field_g.a(false)) {
                          var4 = (Object) (Object) ((fg) this).field_g.a(((fg) this).field_p, param2, -21, true, (byte) 2);
                          ((fg) this).field_v.a(-114, (long)param2, (wf) var4);
                          break L17;
                        } else {
                          break L17;
                        }
                      } else {
                        break L17;
                      }
                    }
                    stackOut_96_0 = null;
                    stackIn_97_0 = stackOut_96_0;
                    return (ag) (Object) stackIn_97_0;
                  }
                  L18: {
                    L19: {
                      if (decompiledRegionSelector0 == 0) {
                        break L19;
                      } else {
                        var5[-2 + var5.length] = (byte)(((fg) this).field_m.field_a[param2] >>> -1790049912);
                        var5[-1 + var5.length] = (byte)((fg) this).field_m.field_a[param2];
                        if (null != ((fg) this).field_l) {
                          os discarded$1 = ((fg) this).field_z.a(var5, ((fg) this).field_l, true, param2);
                          stackOut_101_0 = 1;
                          stackOut_101_1 = ((fg) this).field_h[param2];
                          stackIn_102_0 = stackOut_101_0;
                          stackIn_102_1 = stackOut_101_1;
                          break L19;
                        } else {
                          break L18;
                        }
                      }
                    }
                    if (stackIn_102_0 == stackIn_102_1) {
                      break L18;
                    } else {
                      ((fg) this).field_h[param2] = (byte) 1;
                      break L18;
                    }
                  }
                  L20: {
                    if (!((ag) var4).field_q) {
                      ((ag) var4).c(-126);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  stackOut_109_0 = var4;
                  stackIn_110_0 = stackOut_109_0;
                  return (ag) (Object) stackIn_110_0;
                }
              } else {
                stackOut_59_0 = null;
                stackIn_60_0 = stackOut_59_0;
                return (ag) (Object) stackIn_60_0;
              }
            } else {
              stackOut_56_0 = null;
              stackIn_57_0 = stackOut_56_0;
              return (ag) (Object) stackIn_57_0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            L21: {
              var6_ref = (Exception) (Object) decompiledCaughtException;
              ((fg) this).field_h[param2] = (byte) -1;
              ((ag) var4).c(-125);
              if (((ag) var4).field_q) {
                if (!((fg) this).field_g.a(false)) {
                  var4 = (Object) (Object) ((fg) this).field_g.a(((fg) this).field_p, param2, -21, true, (byte) 2);
                  ((fg) this).field_v.a(-87, (long)param2, (wf) var4);
                  break L21;
                } else {
                  break L21;
                }
              } else {
                break L21;
              }
            }
            stackOut_158_0 = null;
            stackIn_159_0 = stackOut_158_0;
            return (ag) (Object) stackIn_159_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (Object) (Object) decompiledCaughtException;
          throw pn.a((Throwable) var4, "fg.J(" + param0 + ',' + param1 + ',' + param2 + ')');
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
        int stackIn_23_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_40_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_39_0 = 0;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
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
            if (param3 != 32993) {
              throw new IllegalArgumentException("");
            } else {
              L3: {
                var8_int = 0;
                if (~param1 < ~param0) {
                  stackOut_22_0 = param0;
                  stackIn_23_0 = stackOut_22_0;
                  break L3;
                } else {
                  stackOut_20_0 = param1;
                  stackIn_23_0 = stackOut_20_0;
                  break L3;
                }
              }
              L4: {
                var9 = stackIn_23_0;
                var10 = param0 >> 2085300097;
                var11 = param1 >> -1719120191;
                var12 = param5;
                var13 = new int[var11 * var10];
                if (param4 >= 35) {
                  break L4;
                } else {
                  field_A = null;
                  break L4;
                }
              }
              L5: while (true) {
                L6: {
                  L7: {
                    jaggl.OpenGL.glTexImage2Di(param2, var8_int, param7, param0, param1, 0, param3, param6, var12, 0);
                    if (var9 <= 1) {
                      break L7;
                    } else {
                      var15 = 0;
                      var24 = 0;
                      var25 = var24 + param0;
                      var14 = var13;
                      if (var28 != 0) {
                        break L6;
                      } else {
                        var26 = 0;
                        L8: while (true) {
                          L9: {
                            L10: {
                              if (~var11 >= ~var26) {
                                break L10;
                              } else {
                                stackOut_30_0 = 0;
                                stackIn_40_0 = stackOut_30_0;
                                stackIn_31_0 = stackOut_30_0;
                                if (var28 != 0) {
                                  break L9;
                                } else {
                                  var27 = stackIn_31_0;
                                  L11: while (true) {
                                    L12: {
                                      L13: {
                                        if (~var27 <= ~var10) {
                                          break L13;
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
                                          var23 = 255 & var16 >> -68277352;
                                          var21 = (65501 & var16) >> -908693240;
                                          var20 = 255 & var16 >> 910558192;
                                          var22 = var22 + (var17 & 255);
                                          var21 = var21 + ((65454 & var17) >> -479926520);
                                          var20 = var20 + ((16771045 & var17) >> -865355920);
                                          var23 = var23 + (255 & var17 >> -1195132392);
                                          var22 = var22 + (var18 & 255);
                                          var23 = var23 + (255 & var18 >> 294615384);
                                          var21 = var21 + ((65350 & var18) >> 912918568);
                                          var20 = var20 + (var18 >> -783342064 & 255);
                                          var23 = var23 + (255 & var19 >> 1940697176);
                                          var21 = var21 + ((var19 & 65535) >> -1410121368);
                                          var20 = var20 + ((var19 & 16745210) >> 76567312);
                                          var22 = var22 + (var19 & 255);
                                          int incrementValue$9 = var15;
                                          var15++;
                                          var13[incrementValue$9] = vo.a(vo.a(pg.a(var21, 1020) << -1328348026, vo.a(pg.a(var20, 1020) << 1912638254, pg.a(-16777216, var23 << -1130069354))), pg.a(1020, var22) >> -1819664926);
                                          var27++;
                                          if (var28 != 0) {
                                            break L12;
                                          } else {
                                            if (var28 == 0) {
                                              continue L11;
                                            } else {
                                              break L13;
                                            }
                                          }
                                        }
                                      }
                                      var24 = var24 + param0;
                                      var25 = var25 + param0;
                                      var26++;
                                      break L12;
                                    }
                                    if (var28 == 0) {
                                      continue L8;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                              }
                            }
                            var13 = var12;
                            param1 = var11;
                            param0 = var10;
                            var12 = var14;
                            var9 = var9 >> 1;
                            var11 = var11 >> 1;
                            stackOut_39_0 = var10 >> 1;
                            stackIn_40_0 = stackOut_39_0;
                            break L9;
                          }
                          var10 = stackIn_40_0;
                          var8_int++;
                          if (var28 == 0) {
                            continue L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                  }
                  break L6;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var8 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) var8;
            stackOut_42_1 = new StringBuilder().append("fg.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_45_0 = stackOut_42_0;
            stackIn_45_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param5 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L14;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_46_0 = stackOut_43_0;
              stackIn_46_1 = stackOut_43_1;
              stackIn_46_2 = stackOut_43_2;
              break L14;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final void c(int param0) {
        if (!(((fg) this).field_l != null)) {
            return;
        }
        if (param0 != -2) {
            return;
        }
        try {
            ((fg) this).field_s = true;
            if (null == ((fg) this).field_o) {
                ((fg) this).field_o = new kp();
            }
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "fg.L(" + param0 + ')');
        }
    }

    fg(int param0, bl param1, bl param2, un param3, dk param4, int param5, byte[] param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        ((fg) this).field_v = new ph(16);
        ((fg) this).field_d = 0;
        ((fg) this).field_n = new kp();
        ((fg) this).field_x = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((fg) this).field_p = param0;
                ((fg) this).field_l = param1;
                if (((fg) this).field_l != null) {
                  break L2;
                } else {
                  ((fg) this).field_q = false;
                  if (!AceOfSkies.field_G) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((fg) this).field_q = true;
              ((fg) this).field_o = new kp();
              break L1;
            }
            L3: {
              ((fg) this).field_g = param3;
              ((fg) this).field_e = param2;
              ((fg) this).field_u = param6;
              ((fg) this).field_i = param8;
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
            stackOut_9_0 = (RuntimeException) var10;
            stackOut_9_1 = new StringBuilder().append("fg.<init>(").append(param0).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param4 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L7;
            }
          }
          L8: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param5).append(',');
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param6 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L8;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param7 + ',' + param8 + ')');
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
