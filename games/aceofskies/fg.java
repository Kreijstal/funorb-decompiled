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
        Object var4 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 > 105) {
                break L1;
              } else {
                var4 = null;
                cl discarded$2 = fg.a((String) null, 109);
                break L1;
              }
            }
            var2_int = param0.length;
            var3 = new byte[var2_int];
            au.a(param0, 0, var3, 0, var2_int);
            stackOut_2_0 = (byte[]) var3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("fg.F(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    final static cl a(String param0, int param1) {
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
              fg.b((byte) -26);
              var5 = (CharSequence) (Object) param0;
              var2 = (Object) (Object) vu.a(17664, var5);
              if (var2 != null) {
                break L0;
              } else {
                var2 = (Object) (Object) var5;
                break L0;
              }
            }
            var3 = (cl) (Object) gi.field_g.a(-17447, (long)((String) var2).hashCode());
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
          throw pn.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + 109 + 41);
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
                L1: {
                  if (var2 == null) {
                    break L1;
                  } else {
                    var3 = (int)var2.field_b;
                    if (var4 != 0) {
                      break L1;
                    } else {
                      L2: {
                        L3: {
                          L4: {
                            if (var3 < 0) {
                              break L4;
                            } else {
                              if (~var3 <= ~((fg) this).field_m.field_l) {
                                break L4;
                              } else {
                                if (((fg) this).field_m.field_k[var3] == 0) {
                                  break L4;
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                          var2.c(-124);
                          if (var4 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                        L5: {
                          if (((fg) this).field_h[var3] != 0) {
                            break L5;
                          } else {
                            ag discarded$4 = this.a((byte) -37, 1, var3);
                            break L5;
                          }
                        }
                        L6: {
                          if (((fg) this).field_h[var3] == -1) {
                            ag discarded$5 = this.a((byte) -37, 2, var3);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        if (((fg) this).field_h[var3] == 1) {
                          var2.c(param0 ^ 20327);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      var2 = ((fg) this).field_n.b((byte) 103);
                      if (var4 == 0) {
                        continue L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                return;
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
        tn.a(1, false, nh.field_b, rt.field_e);
        ae.field_f = true;
    }

    final void a(byte param0) {
        int var2_int = 0;
        ag var2 = null;
        wf var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int stackIn_103_0 = 0;
        int stackIn_103_1 = 0;
        int stackIn_106_0 = 0;
        int stackIn_106_1 = 0;
        int stackIn_107_0 = 0;
        int stackIn_107_1 = 0;
        int stackIn_125_0 = 0;
        int stackIn_128_0 = 0;
        int stackIn_129_0 = 0;
        int stackIn_129_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_131_0 = 0;
        int stackOut_131_1 = 0;
        int stackOut_127_0 = 0;
        int stackOut_128_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        int stackOut_109_0 = 0;
        int stackOut_109_1 = 0;
        int stackOut_105_0 = 0;
        int stackOut_105_1 = 0;
        int stackOut_106_0 = 0;
        int stackOut_106_1 = 0;
        byte stackOut_64_0 = 0;
        int stackOut_64_1 = 0;
        L0: {
          L1: {
            var5 = AceOfSkies.field_G ? 1 : 0;
            if (((fg) this).field_o == null) {
              break L1;
            } else {
              if (((fg) this).a(true) != null) {
                L2: {
                  if (!((fg) this).field_q) {
                    break L2;
                  } else {
                    var2_int = 1;
                    var3 = ((fg) this).field_o.d(268435455);
                    L3: while (true) {
                      L4: {
                        L5: {
                          L6: {
                            if (var3 == null) {
                              break L6;
                            } else {
                              var4 = (int)var3.field_b;
                              stackOut_6_0 = -1;
                              stackOut_6_1 = ~((fg) this).field_h[var4];
                              stackIn_16_0 = stackOut_6_0;
                              stackIn_16_1 = stackOut_6_1;
                              stackIn_7_0 = stackOut_6_0;
                              stackIn_7_1 = stackOut_6_1;
                              if (var5 != 0) {
                                L7: while (true) {
                                  if (stackIn_16_0 >= stackIn_16_1) {
                                    break L5;
                                  } else {
                                    stackOut_17_0 = ((fg) this).field_m.field_k[((fg) this).field_d];
                                    stackIn_29_0 = stackOut_17_0;
                                    stackIn_18_0 = stackOut_17_0;
                                    if (var5 != 0) {
                                      break L4;
                                    } else {
                                      L8: {
                                        L9: {
                                          if (stackIn_18_0 != 0) {
                                            break L9;
                                          } else {
                                            ((fg) this).field_d = ((fg) this).field_d + 1;
                                            if (var5 == 0) {
                                              break L8;
                                            } else {
                                              break L9;
                                            }
                                          }
                                        }
                                        L10: {
                                          if (((fg) this).field_z.field_d < 250) {
                                            break L10;
                                          } else {
                                            var2_int = 0;
                                            if (var5 == 0) {
                                              break L5;
                                            } else {
                                              break L10;
                                            }
                                          }
                                        }
                                        L11: {
                                          if (((fg) this).field_h[((fg) this).field_d] != 0) {
                                            break L11;
                                          } else {
                                            ag discarded$6 = this.a((byte) -37, 1, ((fg) this).field_d);
                                            break L11;
                                          }
                                        }
                                        L12: {
                                          if (((fg) this).field_h[((fg) this).field_d] != 0) {
                                            break L12;
                                          } else {
                                            var3 = new wf();
                                            var3.field_b = (long)((fg) this).field_d;
                                            var2_int = 0;
                                            ((fg) this).field_o.a(81, var3);
                                            break L12;
                                          }
                                        }
                                        ((fg) this).field_d = ((fg) this).field_d + 1;
                                        if (var5 == 0) {
                                          break L8;
                                        } else {
                                          break L5;
                                        }
                                      }
                                      stackOut_15_0 = ~((fg) this).field_m.field_k.length;
                                      stackOut_15_1 = ~((fg) this).field_d;
                                      stackIn_16_0 = stackOut_15_0;
                                      stackIn_16_1 = stackOut_15_1;
                                      continue L7;
                                    }
                                  }
                                }
                              } else {
                                L13: {
                                  if (stackIn_7_0 != stackIn_7_1) {
                                    break L13;
                                  } else {
                                    ag discarded$7 = this.a((byte) -37, 1, var4);
                                    break L13;
                                  }
                                }
                                L14: {
                                  L15: {
                                    if (((fg) this).field_h[var4] == 0) {
                                      break L15;
                                    } else {
                                      var3.c(-124);
                                      if (var5 == 0) {
                                        break L14;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  }
                                  var2_int = 0;
                                  break L14;
                                }
                                var3 = ((fg) this).field_o.b((byte) 103);
                                if (var5 == 0) {
                                  continue L3;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          L16: while (true) {
                            stackOut_131_0 = ~((fg) this).field_m.field_k.length;
                            stackOut_131_1 = ~((fg) this).field_d;
                            stackIn_129_0 = stackOut_131_0;
                            stackIn_129_1 = stackOut_131_1;
                            if (stackIn_129_0 >= stackIn_129_1) {
                              break L5;
                            } else {
                              stackOut_127_0 = ((fg) this).field_m.field_k[((fg) this).field_d];
                              stackIn_29_0 = stackOut_127_0;
                              stackIn_128_0 = stackOut_127_0;
                              if (var5 != 0) {
                                break L4;
                              } else {
                                stackOut_128_0 = stackIn_128_0;
                                stackIn_125_0 = stackOut_128_0;
                                L17: {
                                  if (stackIn_125_0 != 0) {
                                    break L17;
                                  } else {
                                    ((fg) this).field_d = ((fg) this).field_d + 1;
                                    if (var5 == 0) {
                                      continue L16;
                                    } else {
                                      break L17;
                                    }
                                  }
                                }
                                L18: {
                                  if (((fg) this).field_z.field_d < 250) {
                                    break L18;
                                  } else {
                                    var2_int = 0;
                                    if (var5 == 0) {
                                      break L5;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                                L19: {
                                  if (((fg) this).field_h[((fg) this).field_d] != 0) {
                                    break L19;
                                  } else {
                                    ag discarded$8 = this.a((byte) -37, 1, ((fg) this).field_d);
                                    break L19;
                                  }
                                }
                                L20: {
                                  if (((fg) this).field_h[((fg) this).field_d] != 0) {
                                    break L20;
                                  } else {
                                    var3 = new wf();
                                    var3.field_b = (long)((fg) this).field_d;
                                    var2_int = 0;
                                    ((fg) this).field_o.a(81, var3);
                                    break L20;
                                  }
                                }
                                ((fg) this).field_d = ((fg) this).field_d + 1;
                                if (var5 == 0) {
                                  continue L16;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                        }
                        stackOut_28_0 = var2_int;
                        stackIn_29_0 = stackOut_28_0;
                        break L4;
                      }
                      L21: {
                        if (stackIn_29_0 == 0) {
                          break L21;
                        } else {
                          ((fg) this).field_q = false;
                          ((fg) this).field_d = 0;
                          break L21;
                        }
                      }
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                L22: {
                  if (!((fg) this).field_s) {
                    break L22;
                  } else {
                    var2_int = 1;
                    var3 = ((fg) this).field_o.d(268435455);
                    L23: while (true) {
                      L24: {
                        L25: {
                          if (var3 == null) {
                            break L25;
                          } else {
                            var4 = (int)var3.field_b;
                            stackOut_35_0 = -2;
                            stackOut_35_1 = ~((fg) this).field_h[var4];
                            stackIn_45_0 = stackOut_35_0;
                            stackIn_45_1 = stackOut_35_1;
                            stackIn_36_0 = stackOut_35_0;
                            stackIn_36_1 = stackOut_35_1;
                            if (var5 != 0) {
                              L26: while (true) {
                                if (stackIn_45_0 >= stackIn_45_1) {
                                  break L24;
                                } else {
                                  stackOut_46_0 = 0;
                                  stackOut_46_1 = ((fg) this).field_m.field_k[((fg) this).field_d];
                                  stackIn_65_0 = stackOut_46_0;
                                  stackIn_65_1 = stackOut_46_1;
                                  stackIn_47_0 = stackOut_46_0;
                                  stackIn_47_1 = stackOut_46_1;
                                  if (var5 != 0) {
                                    break L0;
                                  } else {
                                    L27: {
                                      L28: {
                                        if (stackIn_47_0 == stackIn_47_1) {
                                          ((fg) this).field_d = ((fg) this).field_d + 1;
                                          if (var5 == 0) {
                                            break L27;
                                          } else {
                                            break L28;
                                          }
                                        } else {
                                          break L28;
                                        }
                                      }
                                      L29: {
                                        if (((fg) this).field_g.a((byte) -106)) {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L24;
                                          } else {
                                            break L29;
                                          }
                                        } else {
                                          break L29;
                                        }
                                      }
                                      L30: {
                                        if (((fg) this).field_h[((fg) this).field_d] != 1) {
                                          ag discarded$9 = this.a((byte) -37, 2, ((fg) this).field_d);
                                          break L30;
                                        } else {
                                          break L30;
                                        }
                                      }
                                      L31: {
                                        if (((fg) this).field_h[((fg) this).field_d] == 1) {
                                          break L31;
                                        } else {
                                          var3 = new wf();
                                          var3.field_b = (long)((fg) this).field_d;
                                          var2_int = 0;
                                          ((fg) this).field_o.a(115, var3);
                                          break L31;
                                        }
                                      }
                                      ((fg) this).field_d = ((fg) this).field_d + 1;
                                      if (var5 == 0) {
                                        break L27;
                                      } else {
                                        break L24;
                                      }
                                    }
                                    stackOut_44_0 = ((fg) this).field_d;
                                    stackOut_44_1 = ((fg) this).field_m.field_k.length;
                                    stackIn_45_0 = stackOut_44_0;
                                    stackIn_45_1 = stackOut_44_1;
                                    continue L26;
                                  }
                                }
                              }
                            } else {
                              L32: {
                                if (stackIn_36_0 == stackIn_36_1) {
                                  break L32;
                                } else {
                                  ag discarded$10 = this.a((byte) -37, 2, var4);
                                  break L32;
                                }
                              }
                              L33: {
                                L34: {
                                  if (((fg) this).field_h[var4] != 1) {
                                    break L34;
                                  } else {
                                    var3.c(-123);
                                    if (var5 == 0) {
                                      break L33;
                                    } else {
                                      break L34;
                                    }
                                  }
                                }
                                var2_int = 0;
                                break L33;
                              }
                              var3 = ((fg) this).field_o.b((byte) 103);
                              if (var5 == 0) {
                                continue L23;
                              } else {
                                break L25;
                              }
                            }
                          }
                        }
                        L35: while (true) {
                          stackOut_109_0 = ((fg) this).field_d;
                          stackOut_109_1 = ((fg) this).field_m.field_k.length;
                          stackIn_107_0 = stackOut_109_0;
                          stackIn_107_1 = stackOut_109_1;
                          if (stackIn_107_0 >= stackIn_107_1) {
                            break L24;
                          } else {
                            stackOut_105_0 = 0;
                            stackOut_105_1 = ((fg) this).field_m.field_k[((fg) this).field_d];
                            stackIn_65_0 = stackOut_105_0;
                            stackIn_65_1 = stackOut_105_1;
                            stackIn_106_0 = stackOut_105_0;
                            stackIn_106_1 = stackOut_105_1;
                            if (var5 != 0) {
                              break L0;
                            } else {
                              stackOut_106_0 = stackIn_106_0;
                              stackOut_106_1 = stackIn_106_1;
                              stackIn_103_0 = stackOut_106_0;
                              stackIn_103_1 = stackOut_106_1;
                              L36: {
                                if (stackIn_103_0 == stackIn_103_1) {
                                  ((fg) this).field_d = ((fg) this).field_d + 1;
                                  if (var5 == 0) {
                                    continue L35;
                                  } else {
                                    break L36;
                                  }
                                } else {
                                  break L36;
                                }
                              }
                              L37: {
                                if (((fg) this).field_g.a((byte) -106)) {
                                  var2_int = 0;
                                  if (var5 == 0) {
                                    break L24;
                                  } else {
                                    break L37;
                                  }
                                } else {
                                  break L37;
                                }
                              }
                              L38: {
                                if (((fg) this).field_h[((fg) this).field_d] != 1) {
                                  ag discarded$11 = this.a((byte) -37, 2, ((fg) this).field_d);
                                  break L38;
                                } else {
                                  break L38;
                                }
                              }
                              L39: {
                                if (((fg) this).field_h[((fg) this).field_d] == 1) {
                                  break L39;
                                } else {
                                  var3 = new wf();
                                  var3.field_b = (long)((fg) this).field_d;
                                  var2_int = 0;
                                  ((fg) this).field_o.a(115, var3);
                                  break L39;
                                }
                              }
                              ((fg) this).field_d = ((fg) this).field_d + 1;
                              if (var5 == 0) {
                                continue L35;
                              } else {
                                break L24;
                              }
                            }
                          }
                        }
                      }
                      L40: {
                        if (var2_int != 0) {
                          ((fg) this).field_d = 0;
                          ((fg) this).field_s = false;
                          break L40;
                        } else {
                          break L40;
                        }
                      }
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L22;
                      }
                    }
                  }
                }
                ((fg) this).field_o = null;
                break L1;
              } else {
                return;
              }
            }
          }
          stackOut_64_0 = param0;
          stackOut_64_1 = 84;
          stackIn_65_0 = stackOut_64_0;
          stackIn_65_1 = stackOut_64_1;
          break L0;
        }
        L41: {
          if (stackIn_65_0 > stackIn_65_1) {
            break L41;
          } else {
            ((fg) this).field_m = null;
            break L41;
          }
        }
        L42: {
          if (!((fg) this).field_i) {
            break L42;
          } else {
            if (((fg) this).field_x <= kh.a(-106)) {
              var2 = (ag) (Object) ((fg) this).field_v.a(false);
              L43: while (true) {
                L44: {
                  L45: {
                    if (var2 == null) {
                      break L45;
                    } else {
                      if (var5 != 0) {
                        break L44;
                      } else {
                        L46: {
                          L47: {
                            if (!var2.field_p) {
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
                            if (var2.field_t) {
                              break L48;
                            } else {
                              var2.field_t = true;
                              if (var5 == 0) {
                                break L46;
                              } else {
                                break L48;
                              }
                            }
                          }
                          if (var2.field_q) {
                            var2.c(-124);
                            break L46;
                          } else {
                            throw new RuntimeException();
                          }
                        }
                        var2 = (ag) (Object) ((fg) this).field_v.a(0);
                        if (var5 == 0) {
                          continue L43;
                        } else {
                          break L45;
                        }
                      }
                    }
                  }
                  ((fg) this).field_x = 1000L + kh.a(-95);
                  break L44;
                }
                break L42;
              }
            } else {
              break L42;
            }
          }
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
              L2: {
                var5 = ((fg) this).field_y.a(param0);
                var2 = var5;
                if (((fg) this).field_y instanceof os) {
                  break L2;
                } else {
                  try {
                    L3: {
                      if (var5 == null) {
                        throw new RuntimeException();
                      } else {
                        ((fg) this).field_m = new ps(var5, ((fg) this).field_j, ((fg) this).field_u);
                        break L3;
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L4: {
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
                        break L4;
                      } else {
                        stackOut_15_0 = (un) (Object) stackIn_15_0;
                        stackOut_15_1 = 1;
                        stackIn_17_0 = stackOut_15_0;
                        stackIn_17_1 = stackOut_15_1;
                        break L4;
                      }
                    }
                    L5: {
                      if (((un) (Object) stackIn_17_0).a(stackIn_17_1 == 0)) {
                        break L5;
                      } else {
                        ((fg) this).field_y = null;
                        if (var4 != 0) {
                          break L5;
                        } else {
                          return null;
                        }
                      }
                    }
                    ((fg) this).field_y = (ag) (Object) ((fg) this).field_g.a(255, ((fg) this).field_p, -21, true, (byte) 0);
                    return null;
                  }
                  if (((fg) this).field_e != null) {
                    os discarded$1 = ((fg) this).field_z.a(var5, ((fg) this).field_e, param0, ((fg) this).field_p);
                    if (var4 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              try {
                L6: {
                  if (var5 == null) {
                    throw new RuntimeException();
                  } else {
                    ((fg) this).field_m = new ps(var5, ((fg) this).field_j, ((fg) this).field_u);
                    if (~((fg) this).field_m.field_m != ~((fg) this).field_w) {
                      throw new RuntimeException();
                    } else {
                      break L6;
                    }
                  }
                }
              } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                L7: {
                  var3 = decompiledCaughtException;
                  ((fg) this).field_m = null;
                  if (((fg) this).field_g.a(false)) {
                    break L7;
                  } else {
                    ((fg) this).field_y = (ag) (Object) ((fg) this).field_g.a(255, ((fg) this).field_p, -21, true, (byte) 0);
                    if (var4 != 0) {
                      break L7;
                    } else {
                      return null;
                    }
                  }
                }
                ((fg) this).field_y = null;
                return null;
              }
              break L1;
            }
            L8: {
              ((fg) this).field_y = null;
              if (((fg) this).field_l == null) {
                break L8;
              } else {
                ((fg) this).field_h = new byte[((fg) this).field_m.field_l];
                break L8;
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

    public static void b(byte param0) {
        field_f = null;
        field_t = null;
        field_r = null;
        field_k = null;
        fg.b(false);
        field_A = null;
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
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        byte stackIn_80_0 = 0;
        byte stackIn_80_1 = 0;
        int stackIn_84_0 = 0;
        int stackIn_84_1 = 0;
        Object stackIn_95_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        byte stackOut_79_0 = 0;
        byte stackOut_79_1 = 0;
        int stackOut_83_0 = 0;
        int stackOut_83_1 = 0;
        Object stackOut_94_0 = null;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_61_0 = 0;
        byte stackOut_61_1 = 0;
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
                if (!((fg) this).field_g.a(false)) {
                  var4 = (Object) (Object) ((fg) this).field_g.a(((fg) this).field_p, param2, param0 + 16, true, (byte) 2);
                  if (var10 == 0) {
                    break L2;
                  } else {
                    return null;
                  }
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
          if (param0 == -37) {
            if (var4 instanceof os) {
              try {
                L5: {
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
                                      stackOut_79_0 = var8[var9];
                                      stackOut_79_1 = var7_ref_byte__[var9];
                                      stackIn_84_0 = stackOut_79_0;
                                      stackIn_84_1 = stackOut_79_1;
                                      stackIn_80_0 = stackOut_79_0;
                                      stackIn_80_1 = stackOut_79_1;
                                      if (var10 != 0) {
                                        break L7;
                                      } else {
                                        if (stackIn_80_0 == stackIn_80_1) {
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
                            stackOut_83_0 = 255 & var5[-1 + var5.length];
                            stackOut_83_1 = (255 & var5[-2 + var5.length]) << 8;
                            stackIn_84_0 = stackOut_83_0;
                            stackIn_84_1 = stackOut_83_1;
                            break L7;
                          }
                          var7 = stackIn_84_0 + stackIn_84_1;
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
                            stackOut_94_0 = var4;
                            stackIn_95_0 = stackOut_94_0;
                            break L5;
                          }
                        }
                      }
                    }
                  }
                  throw new RuntimeException();
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L13: {
                  var6_ref = (Exception) (Object) decompiledCaughtException;
                  ((fg) this).field_h[param2] = (byte) -1;
                  ((ag) var4).c(-125);
                  if (((ag) var4).field_q) {
                    if (!((fg) this).field_g.a(false)) {
                      var4 = (Object) (Object) ((fg) this).field_g.a(((fg) this).field_p, param2, -21, true, (byte) 2);
                      ((fg) this).field_v.a(-87, (long)param2, (wf) var4);
                      break L13;
                    } else {
                      break L13;
                    }
                  } else {
                    break L13;
                  }
                }
                return null;
              }
              return (ag) (Object) stackIn_95_0;
            } else {
              try {
                L14: {
                  L15: {
                    if (var5 == null) {
                      break L15;
                    } else {
                      if (2 < var5.length) {
                        aq.field_d.reset();
                        aq.field_d.update(var5, 0, -2 + var5.length);
                        var6_int = (int)aq.field_d.getValue();
                        if (~var6_int != ~((fg) this).field_m.field_g[param2]) {
                          throw new RuntimeException();
                        } else {
                          L16: {
                            L17: {
                              if (null == ((fg) this).field_m.field_i) {
                                break L17;
                              } else {
                                if (null != ((fg) this).field_m.field_i[param2]) {
                                  var7_ref_byte__ = ((fg) this).field_m.field_i[param2];
                                  var8 = qm.a(param0 ^ -37, -2 + var5.length, var5, 0);
                                  var9 = 0;
                                  L18: while (true) {
                                    if (64 <= var9) {
                                      break L17;
                                    } else {
                                      stackOut_47_0 = ~var8[var9];
                                      stackOut_47_1 = ~var7_ref_byte__[var9];
                                      stackIn_62_0 = stackOut_47_0;
                                      stackIn_62_1 = stackOut_47_1;
                                      stackIn_48_0 = stackOut_47_0;
                                      stackIn_48_1 = stackOut_47_1;
                                      if (var10 != 0) {
                                        decompiledRegionSelector0 = 1;
                                        break L14;
                                      } else {
                                        if (stackIn_48_0 == stackIn_48_1) {
                                          var9++;
                                          if (var10 == 0) {
                                            continue L18;
                                          } else {
                                            break L17;
                                          }
                                        } else {
                                          throw new RuntimeException();
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  ((fg) this).field_g.field_j = 0;
                                  ((fg) this).field_g.field_e = 0;
                                  break L16;
                                }
                              }
                            }
                            ((fg) this).field_g.field_j = 0;
                            ((fg) this).field_g.field_e = 0;
                            break L16;
                          }
                          decompiledRegionSelector0 = 0;
                          break L14;
                        }
                      } else {
                        break L15;
                      }
                    }
                  }
                  throw new RuntimeException();
                }
              } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                L19: {
                  var6 = (RuntimeException) (Object) decompiledCaughtException;
                  ((fg) this).field_g.c((byte) -46);
                  ((ag) var4).c(param0 + -90);
                  if (((ag) var4).field_q) {
                    if (!((fg) this).field_g.a(false)) {
                      var4 = (Object) (Object) ((fg) this).field_g.a(((fg) this).field_p, param2, -21, true, (byte) 2);
                      ((fg) this).field_v.a(-114, (long)param2, (wf) var4);
                      break L19;
                    } else {
                      break L19;
                    }
                  } else {
                    break L19;
                  }
                }
                return null;
              }
              L20: {
                L21: {
                  if (decompiledRegionSelector0 == 0) {
                    var5[-2 + var5.length] = (byte)(((fg) this).field_m.field_a[param2] >>> 8);
                    var5[-1 + var5.length] = (byte)((fg) this).field_m.field_a[param2];
                    if (null != ((fg) this).field_l) {
                      os discarded$1 = ((fg) this).field_z.a(var5, ((fg) this).field_l, true, param2);
                      stackOut_61_0 = 1;
                      stackOut_61_1 = ((fg) this).field_h[param2];
                      stackIn_62_0 = stackOut_61_0;
                      stackIn_62_1 = stackOut_61_1;
                      break L21;
                    } else {
                      break L20;
                    }
                  } else {
                    break L21;
                  }
                }
                if (stackIn_62_0 == stackIn_62_1) {
                  break L20;
                } else {
                  ((fg) this).field_h[param2] = (byte) 1;
                  break L20;
                }
              }
              L22: {
                if (!((ag) var4).field_q) {
                  ((ag) var4).c(-126);
                  break L22;
                } else {
                  break L22;
                }
              }
              return (ag) var4;
            }
          } else {
            return null;
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
        int stackIn_15_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_29_0 = 0;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
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
                  stackOut_14_0 = param0;
                  stackIn_15_0 = stackOut_14_0;
                  break L3;
                } else {
                  stackOut_13_0 = param1;
                  stackIn_15_0 = stackOut_13_0;
                  break L3;
                }
              }
              L4: {
                var9 = stackIn_15_0;
                var10 = param0 >> 1;
                var11 = param1 >> 1;
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
                  jaggl.OpenGL.glTexImage2Di(param2, var8_int, param7, param0, param1, 0, param3, param6, var12, 0);
                  if (var9 <= 1) {
                    break L6;
                  } else {
                    var15 = 0;
                    var24 = 0;
                    var25 = var24 + param0;
                    var14 = var13;
                    if (var28 != 0) {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var26 = 0;
                      L7: while (true) {
                        L8: {
                          L9: {
                            if (~var11 >= ~var26) {
                              break L9;
                            } else {
                              stackOut_21_0 = 0;
                              stackIn_30_0 = stackOut_21_0;
                              stackIn_22_0 = stackOut_21_0;
                              if (var28 != 0) {
                                break L8;
                              } else {
                                var27 = stackIn_22_0;
                                L10: while (true) {
                                  L11: {
                                    L12: {
                                      if (~var27 <= ~var10) {
                                        break L12;
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
                                        if (var28 != 0) {
                                          break L11;
                                        } else {
                                          if (var28 == 0) {
                                            continue L10;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                    }
                                    var24 = var24 + param0;
                                    var25 = var25 + param0;
                                    var26++;
                                    break L11;
                                  }
                                  if (var28 == 0) {
                                    continue L7;
                                  } else {
                                    break L9;
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
                          stackOut_29_0 = var10 >> 1;
                          stackIn_30_0 = stackOut_29_0;
                          break L8;
                        }
                        var10 = stackIn_30_0;
                        var8_int++;
                        if (var28 == 0) {
                          continue L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var8 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var8;
            stackOut_32_1 = new StringBuilder().append("fg.I(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param5 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L13;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L13;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + 44 + param6 + 44 + param7 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param8) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L3;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L3;
              }
            }
            L4: {
              ((fg) this).field_i = stackIn_7_1 != 0;
              ((fg) this).field_j = param5;
              ((fg) this).field_z = param4;
              ((fg) this).field_w = param7;
              if (((fg) this).field_e == null) {
                break L4;
              } else {
                ((fg) this).field_y = (ag) (Object) ((fg) this).field_z.a(((fg) this).field_e, (byte) 93, ((fg) this).field_p);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var10 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var10;
            stackOut_10_1 = new StringBuilder().append("fg.<init>(").append(param0).append(44);
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
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          L6: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
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
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          L7: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
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
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          L8: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
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
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          L9: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44).append(param5).append(44);
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
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param7 + 44 + param8 + 41);
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
