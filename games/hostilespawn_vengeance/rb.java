/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb extends uk {
    static int[] field_p;
    private um field_n;
    private int field_l;
    private byte[] field_v;
    private jm field_i;
    private wc field_x;
    private int field_B;
    private byte[] field_r;
    static int field_m;
    private ae field_j;
    private um field_q;
    static ji field_s;
    static bd field_y;
    private int field_g;
    private ej field_h;
    private dh field_t;
    private vl field_w;
    private int field_A;
    private boolean field_z;
    private boolean field_o;
    private vl field_u;
    private long field_k;
    private boolean field_f;

    final int b(int param0, int param1) {
        ae var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        try {
          L0: {
            var3 = (ae) (Object) ((rb) this).field_i.a(false, (long)param1);
            var4 = 5 / ((33 - param0) / 52);
            if (null != var3) {
              stackOut_3_0 = var3.d(-94);
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var3_ref, "rb.E(" + param0 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    private final ae a(int param0, int param1, boolean param2) {
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
        Object stackIn_40_0 = null;
        Object stackIn_53_0 = null;
        Object stackIn_60_0 = null;
        byte stackIn_81_0 = 0;
        byte stackIn_81_1 = 0;
        Object stackIn_97_0 = null;
        int stackIn_102_0 = 0;
        int stackIn_102_1 = 0;
        Object stackIn_110_0 = null;
        byte stackIn_127_0 = 0;
        byte stackIn_127_1 = 0;
        int stackIn_134_0 = 0;
        int stackIn_134_1 = 0;
        Object stackIn_147_0 = null;
        Object stackIn_156_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_39_0 = null;
        Object stackOut_52_0 = null;
        Object stackOut_59_0 = null;
        byte stackOut_126_0 = 0;
        byte stackOut_126_1 = 0;
        int stackOut_133_0 = 0;
        int stackOut_133_1 = 0;
        Object stackOut_146_0 = null;
        byte stackOut_80_0 = 0;
        byte stackOut_80_1 = 0;
        Object stackOut_96_0 = null;
        int stackOut_101_0 = 0;
        int stackOut_101_1 = 0;
        Object stackOut_109_0 = null;
        Object stackOut_155_0 = null;
        var10 = HostileSpawn.field_I ? 1 : 0;
        try {
          try {
            L0: {
              var4 = (Object) (Object) (ae) (Object) ((rb) this).field_i.a(param2, (long)param0);
              if (null == var4) {
                break L0;
              } else {
                if (param1 != 0) {
                  break L0;
                } else {
                  if (((ae) var4).field_w) {
                    break L0;
                  } else {
                    if (!((ae) var4).field_v) {
                      break L0;
                    } else {
                      ((ae) var4).b(-37);
                      var4 = null;
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
                  L3: {
                    if (param1 == 0) {
                      break L3;
                    } else {
                      L4: {
                        if (1 != param1) {
                          break L4;
                        } else {
                          if (((rb) this).field_q != null) {
                            var4 = (Object) (Object) ((rb) this).field_t.a(((rb) this).field_q, (byte) -127, param0);
                            if (var10 == 0) {
                              break L2;
                            } else {
                              break L4;
                            }
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      }
                      if (param1 == 2) {
                        if (((rb) this).field_q == null) {
                          throw new RuntimeException();
                        } else {
                          if (-1 != ((rb) this).field_r[param0]) {
                            throw new RuntimeException();
                          } else {
                            if (!((rb) this).field_h.b(5)) {
                              var4 = (Object) (Object) ((rb) this).field_h.a((byte) 2, ((rb) this).field_g, param0, -18986, false);
                              if (var10 == 0) {
                                break L2;
                              } else {
                                break L3;
                              }
                            } else {
                              stackOut_39_0 = null;
                              stackIn_40_0 = stackOut_39_0;
                              return (ae) (Object) stackIn_40_0;
                            }
                          }
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                  L5: {
                    if (((rb) this).field_q == null) {
                      break L5;
                    } else {
                      if (((rb) this).field_r[param0] != -1) {
                        var4 = (Object) (Object) ((rb) this).field_t.a(((rb) this).field_q, param0, -27337);
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (((rb) this).field_h.a(20)) {
                      break L6;
                    } else {
                      var4 = (Object) (Object) ((rb) this).field_h.a((byte) 2, ((rb) this).field_g, param0, -18986, true);
                      if (var10 == 0) {
                        break L2;
                      } else {
                        break L6;
                      }
                    }
                  }
                  stackOut_52_0 = null;
                  stackIn_53_0 = stackOut_52_0;
                  return (ae) (Object) stackIn_53_0;
                }
                ((rb) this).field_i.a(-97, (long)param0, (am) var4);
                break L1;
              }
            }
            if (((ae) var4).field_v) {
              stackOut_59_0 = null;
              stackIn_60_0 = stackOut_59_0;
              return (ae) (Object) stackIn_60_0;
            } else {
              var5 = ((ae) var4).c((byte) 127);
              if (var4 instanceof rh) {
                L7: {
                  if (null == var5) {
                    break L7;
                  } else {
                    if (var5.length > 2) {
                      td.field_a.reset();
                      td.field_a.update(var5, 0, var5.length + -2);
                      var6_int = (int)td.field_a.getValue();
                      if (~var6_int == ~((rb) this).field_x.field_v[param0]) {
                        L8: {
                          L9: {
                            if (null == ((rb) this).field_x.field_w) {
                              break L9;
                            } else {
                              if (((rb) this).field_x.field_w[param0] == null) {
                                break L9;
                              } else {
                                var7_ref_byte__ = ((rb) this).field_x.field_w[param0];
                                var8 = ld.a(var5, 0, 125, -2 + var5.length);
                                var9 = 0;
                                L10: while (true) {
                                  if (var9 >= 64) {
                                    break L9;
                                  } else {
                                    stackOut_126_0 = var8[var9];
                                    stackOut_126_1 = var7_ref_byte__[var9];
                                    stackIn_134_0 = stackOut_126_0;
                                    stackIn_134_1 = stackOut_126_1;
                                    stackIn_127_0 = stackOut_126_0;
                                    stackIn_127_1 = stackOut_126_1;
                                    if (var10 != 0) {
                                      break L8;
                                    } else {
                                      if (stackIn_127_0 != stackIn_127_1) {
                                        throw new RuntimeException();
                                      } else {
                                        var9++;
                                        if (var10 == 0) {
                                          continue L10;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          stackOut_133_0 = 255 & var5[var5.length + -1];
                          stackOut_133_1 = (255 & var5[-2 + var5.length]) << 872423560;
                          stackIn_134_0 = stackOut_133_0;
                          stackIn_134_1 = stackOut_133_1;
                          break L8;
                        }
                        var7 = stackIn_134_0 + stackIn_134_1;
                        if ((65535 & ((rb) this).field_x.field_i[param0]) != var7) {
                          throw new RuntimeException();
                        } else {
                          L11: {
                            if (((rb) this).field_r[param0] == 1) {
                              break L11;
                            } else {
                              L12: {
                                if (((rb) this).field_r[param0] != 0) {
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                              ((rb) this).field_r[param0] = (byte) 1;
                              break L11;
                            }
                          }
                          L13: {
                            if (((ae) var4).field_w) {
                              break L13;
                            } else {
                              ((ae) var4).b(-116);
                              break L13;
                            }
                          }
                          stackOut_146_0 = var4;
                          stackIn_147_0 = stackOut_146_0;
                          return (ae) (Object) stackIn_147_0;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      break L7;
                    }
                  }
                }
                throw new RuntimeException();
              } else {
                try {
                  L14: {
                    L15: {
                      if (null == var5) {
                        break L15;
                      } else {
                        if (2 < var5.length) {
                          td.field_a.reset();
                          td.field_a.update(var5, 0, var5.length + -2);
                          var6_int = (int)td.field_a.getValue();
                          if (~((rb) this).field_x.field_v[param0] != ~var6_int) {
                            throw new RuntimeException();
                          } else {
                            L16: {
                              if (((rb) this).field_x.field_w == null) {
                                break L16;
                              } else {
                                if (null != ((rb) this).field_x.field_w[param0]) {
                                  var7_ref_byte__ = ((rb) this).field_x.field_w[param0];
                                  var8 = ld.a(var5, 0, 104, var5.length + -2);
                                  var9 = 0;
                                  L17: while (true) {
                                    if (var9 >= 64) {
                                      break L16;
                                    } else {
                                      stackOut_80_0 = var7_ref_byte__[var9];
                                      stackOut_80_1 = var8[var9];
                                      stackIn_102_0 = stackOut_80_0;
                                      stackIn_102_1 = stackOut_80_1;
                                      stackIn_81_0 = stackOut_80_0;
                                      stackIn_81_1 = stackOut_80_1;
                                      if (var10 != 0) {
                                        decompiledRegionSelector0 = 0;
                                        break L14;
                                      } else {
                                        if (stackIn_81_0 == stackIn_81_1) {
                                          var9++;
                                          if (var10 == 0) {
                                            continue L17;
                                          } else {
                                            break L16;
                                          }
                                        } else {
                                          throw new RuntimeException();
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  break L16;
                                }
                              }
                            }
                            ((rb) this).field_h.field_k = 0;
                            ((rb) this).field_h.field_e = 0;
                            decompiledRegionSelector0 = 1;
                            break L14;
                          }
                        } else {
                          break L15;
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L18: {
                    var6 = (RuntimeException) (Object) decompiledCaughtException;
                    ((rb) this).field_h.c(194);
                    ((ae) var4).b(-9);
                    if (!((ae) var4).field_w) {
                      break L18;
                    } else {
                      if (!((rb) this).field_h.a(20)) {
                        var4 = (Object) (Object) ((rb) this).field_h.a((byte) 2, ((rb) this).field_g, param0, -18986, true);
                        ((rb) this).field_i.a(-106, (long)param0, (am) var4);
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                  }
                  stackOut_96_0 = null;
                  stackIn_97_0 = stackOut_96_0;
                  return (ae) (Object) stackIn_97_0;
                }
                L19: {
                  L20: {
                    if (decompiledRegionSelector0 == 0) {
                      break L20;
                    } else {
                      var5[-2 + var5.length] = (byte)(((rb) this).field_x.field_i[param0] >>> 1106421096);
                      var5[var5.length + -1] = (byte)((rb) this).field_x.field_i[param0];
                      if (null != ((rb) this).field_q) {
                        rh discarded$1 = ((rb) this).field_t.a(((rb) this).field_q, -4, var5, param0);
                        stackOut_101_0 = -2;
                        stackOut_101_1 = ~((rb) this).field_r[param0];
                        stackIn_102_0 = stackOut_101_0;
                        stackIn_102_1 = stackOut_101_1;
                        break L20;
                      } else {
                        break L19;
                      }
                    }
                  }
                  if (stackIn_102_0 == stackIn_102_1) {
                    break L19;
                  } else {
                    ((rb) this).field_r[param0] = (byte) 1;
                    break L19;
                  }
                }
                L21: {
                  if (!((ae) var4).field_w) {
                    ((ae) var4).b(26);
                    break L21;
                  } else {
                    break L21;
                  }
                }
                stackOut_109_0 = var4;
                stackIn_110_0 = stackOut_109_0;
                return (ae) (Object) stackIn_110_0;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            L22: {
              var6_ref = (Exception) (Object) decompiledCaughtException;
              ((rb) this).field_r[param0] = (byte) -1;
              ((ae) var4).b(113);
              if (((ae) var4).field_w) {
                if (!((rb) this).field_h.a(20)) {
                  var4 = (Object) (Object) ((rb) this).field_h.a((byte) 2, ((rb) this).field_g, param0, -18986, true);
                  ((rb) this).field_i.a(-114, (long)param0, (am) var4);
                  break L22;
                } else {
                  break L22;
                }
              } else {
                break L22;
              }
            }
            stackOut_155_0 = null;
            stackIn_156_0 = stackOut_155_0;
            return (ae) (Object) stackIn_156_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (Object) (Object) decompiledCaughtException;
          throw wg.a((Throwable) var4, "rb.N(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void e(int param0) {
        if (param0 != -2) {
            return;
        }
        try {
            vc.field_i[93] = 43;
            vc.field_i[47] = 73;
            vc.field_i[222] = 58;
            vc.field_i[192] = 28;
            vc.field_i[520] = 59;
            vc.field_i[92] = 74;
            vc.field_i[44] = 71;
            vc.field_i[91] = 42;
            vc.field_i[45] = 26;
            vc.field_i[61] = 27;
            vc.field_i[46] = 72;
            vc.field_i[59] = 57;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "rb.M(" + param0 + ')');
        }
    }

    final byte[] a(byte param0, int param1) {
        ae var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_4_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        byte[] stackOut_8_0 = null;
        try {
          L0: {
            var3 = this.a(param1, 0, false);
            if (var3 == null) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (byte[]) (Object) stackIn_4_0;
            } else {
              L1: {
                var4 = var3.c((byte) 127);
                var3.b(-76);
                if (param0 == -50) {
                  break L1;
                } else {
                  int discarded$2 = ((rb) this).b(-104, 72);
                  break L1;
                }
              }
              stackOut_8_0 = (byte[]) var4;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var3_ref, "rb.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final void f(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        ae var2_ref = null;
        am var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_16_0 = 0;
        byte stackIn_16_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        byte stackIn_57_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_95_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        byte stackOut_15_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        byte stackOut_56_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_94_1 = 0;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (null != ((rb) this).field_w) {
                  if (((rb) this).c(3) != null) {
                    L3: {
                      if (((rb) this).field_o) {
                        break L3;
                      } else {
                        L4: {
                          if (((rb) this).field_z) {
                            break L4;
                          } else {
                            ((rb) this).field_w = null;
                            if (var5 == 0) {
                              break L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var2_int = 1;
                        var3 = ((rb) this).field_w.g(-100);
                        L5: while (true) {
                          L6: {
                            L7: {
                              if (null == var3) {
                                break L7;
                              } else {
                                var4 = (int)var3.field_c;
                                stackOut_15_0 = 1;
                                stackOut_15_1 = ((rb) this).field_r[var4];
                                stackIn_28_0 = stackOut_15_0;
                                stackIn_28_1 = stackOut_15_1;
                                stackIn_16_0 = stackOut_15_0;
                                stackIn_16_1 = stackOut_15_1;
                                if (var5 != 0) {
                                  L8: while (true) {
                                    if (stackIn_28_0 >= stackIn_28_1) {
                                      break L6;
                                    } else {
                                      stackOut_29_0 = -1;
                                      stackOut_29_1 = ~((rb) this).field_x.field_o[((rb) this).field_A];
                                      stackIn_95_0 = stackOut_29_0;
                                      stackIn_95_1 = stackOut_29_1;
                                      stackIn_30_0 = stackOut_29_0;
                                      stackIn_30_1 = stackOut_29_1;
                                      if (var5 != 0) {
                                        break L1;
                                      } else {
                                        stackOut_30_0 = stackIn_30_0;
                                        stackOut_30_1 = stackIn_30_1;
                                        stackIn_32_0 = stackOut_30_0;
                                        stackIn_32_1 = stackOut_30_1;
                                        L9: {
                                          L10: {
                                            if (stackIn_32_0 != stackIn_32_1) {
                                              break L10;
                                            } else {
                                              ((rb) this).field_A = ((rb) this).field_A + 1;
                                              if (var5 == 0) {
                                                break L9;
                                              } else {
                                                break L10;
                                              }
                                            }
                                          }
                                          L11: {
                                            if (!((rb) this).field_h.b(param0 ^ -6)) {
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
                                            if (1 != ((rb) this).field_r[((rb) this).field_A]) {
                                              ae discarded$4 = this.a(((rb) this).field_A, 2, false);
                                              break L12;
                                            } else {
                                              break L12;
                                            }
                                          }
                                          L13: {
                                            if (((rb) this).field_r[((rb) this).field_A] == 1) {
                                              break L13;
                                            } else {
                                              var3 = new am();
                                              var3.field_c = (long)((rb) this).field_A;
                                              ((rb) this).field_w.a(var3, 81);
                                              var2_int = 0;
                                              break L13;
                                            }
                                          }
                                          ((rb) this).field_A = ((rb) this).field_A + 1;
                                          if (var5 == 0) {
                                            break L9;
                                          } else {
                                            break L6;
                                          }
                                        }
                                        stackOut_27_0 = ((rb) this).field_A;
                                        stackOut_27_1 = ((rb) this).field_x.field_o.length;
                                        stackIn_28_0 = stackOut_27_0;
                                        stackIn_28_1 = stackOut_27_1;
                                        continue L8;
                                      }
                                    }
                                  }
                                } else {
                                  L14: {
                                    if (stackIn_16_0 == stackIn_16_1) {
                                      break L14;
                                    } else {
                                      ae discarded$5 = this.a(var4, 2, false);
                                      break L14;
                                    }
                                  }
                                  L15: {
                                    L16: {
                                      if (((rb) this).field_r[var4] != 1) {
                                        break L16;
                                      } else {
                                        var3.b(-124);
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
                                  var3 = ((rb) this).field_w.a(param0 + 12685);
                                  if (var5 == 0) {
                                    continue L5;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            L17: while (true) {
                              stackOut_27_0 = ((rb) this).field_A;
                              stackOut_27_1 = ((rb) this).field_x.field_o.length;
                              stackIn_28_0 = stackOut_27_0;
                              stackIn_28_1 = stackOut_27_1;
                              if (stackIn_28_0 >= stackIn_28_1) {
                                break L6;
                              } else {
                                stackOut_29_0 = -1;
                                stackOut_29_1 = ~((rb) this).field_x.field_o[((rb) this).field_A];
                                stackIn_95_0 = stackOut_29_0;
                                stackIn_95_1 = stackOut_29_1;
                                stackIn_30_0 = stackOut_29_0;
                                stackIn_30_1 = stackOut_29_1;
                                if (var5 != 0) {
                                  break L1;
                                } else {
                                  stackOut_30_0 = stackIn_30_0;
                                  stackOut_30_1 = stackIn_30_1;
                                  stackIn_32_0 = stackOut_30_0;
                                  stackIn_32_1 = stackOut_30_1;
                                  L18: {
                                    if (stackIn_32_0 != stackIn_32_1) {
                                      break L18;
                                    } else {
                                      ((rb) this).field_A = ((rb) this).field_A + 1;
                                      if (var5 == 0) {
                                        continue L17;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                  L19: {
                                    if (!((rb) this).field_h.b(param0 ^ -6)) {
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
                                    if (1 != ((rb) this).field_r[((rb) this).field_A]) {
                                      ae discarded$4 = this.a(((rb) this).field_A, 2, false);
                                      break L20;
                                    } else {
                                      break L20;
                                    }
                                  }
                                  L21: {
                                    if (((rb) this).field_r[((rb) this).field_A] == 1) {
                                      break L21;
                                    } else {
                                      var3 = new am();
                                      var3.field_c = (long)((rb) this).field_A;
                                      ((rb) this).field_w.a(var3, 81);
                                      var2_int = 0;
                                      break L21;
                                    }
                                  }
                                  ((rb) this).field_A = ((rb) this).field_A + 1;
                                  if (var5 == 0) {
                                    continue L17;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          L22: {
                            if (var2_int != 0) {
                              ((rb) this).field_A = 0;
                              ((rb) this).field_z = false;
                              break L22;
                            } else {
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
                    var2_int = 1;
                    var3 = ((rb) this).field_w.g(-81);
                    L23: while (true) {
                      L24: {
                        L25: {
                          L26: {
                            if (null == var3) {
                              break L26;
                            } else {
                              var4 = (int)var3.field_c;
                              stackOut_56_0 = ((rb) this).field_r[var4];
                              stackIn_69_0 = stackOut_56_0;
                              stackIn_57_0 = stackOut_56_0;
                              if (var5 != 0) {
                                L27: while (true) {
                                  if (stackIn_69_0 >= ((rb) this).field_x.field_o.length) {
                                    break L25;
                                  } else {
                                    stackOut_70_0 = ((rb) this).field_x.field_o[((rb) this).field_A];
                                    stackIn_91_0 = stackOut_70_0;
                                    stackIn_71_0 = stackOut_70_0;
                                    if (var5 != 0) {
                                      break L24;
                                    } else {
                                      stackOut_71_0 = stackIn_71_0;
                                      stackIn_73_0 = stackOut_71_0;
                                      L28: {
                                        L29: {
                                          if (stackIn_73_0 == 0) {
                                            ((rb) this).field_A = ((rb) this).field_A + 1;
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
                                          if (((rb) this).field_t.field_e >= 250) {
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
                                          if (0 != ((rb) this).field_r[((rb) this).field_A]) {
                                            break L31;
                                          } else {
                                            ae discarded$6 = this.a(((rb) this).field_A, 1, false);
                                            break L31;
                                          }
                                        }
                                        L32: {
                                          if (((rb) this).field_r[((rb) this).field_A] != 0) {
                                            break L32;
                                          } else {
                                            var3 = new am();
                                            var3.field_c = (long)((rb) this).field_A;
                                            var2_int = 0;
                                            ((rb) this).field_w.a(var3, 90);
                                            break L32;
                                          }
                                        }
                                        ((rb) this).field_A = ((rb) this).field_A + 1;
                                        if (var5 == 0) {
                                          break L28;
                                        } else {
                                          break L25;
                                        }
                                      }
                                      stackOut_68_0 = ((rb) this).field_A;
                                      stackIn_69_0 = stackOut_68_0;
                                      continue L27;
                                    }
                                  }
                                }
                              } else {
                                L33: {
                                  if (stackIn_57_0 != 0) {
                                    break L33;
                                  } else {
                                    ae discarded$7 = this.a(var4, 1, false);
                                    break L33;
                                  }
                                }
                                L34: {
                                  L35: {
                                    if (((rb) this).field_r[var4] == 0) {
                                      break L35;
                                    } else {
                                      var3.b(126);
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
                                var3 = ((rb) this).field_w.a(12684);
                                if (var5 == 0) {
                                  continue L23;
                                } else {
                                  break L26;
                                }
                              }
                            }
                          }
                          L36: while (true) {
                            stackOut_68_0 = ((rb) this).field_A;
                            stackIn_69_0 = stackOut_68_0;
                            if (stackIn_69_0 >= ((rb) this).field_x.field_o.length) {
                              break L25;
                            } else {
                              stackOut_70_0 = ((rb) this).field_x.field_o[((rb) this).field_A];
                              stackIn_91_0 = stackOut_70_0;
                              stackIn_71_0 = stackOut_70_0;
                              if (var5 != 0) {
                                break L24;
                              } else {
                                stackOut_71_0 = stackIn_71_0;
                                stackIn_73_0 = stackOut_71_0;
                                L37: {
                                  if (stackIn_73_0 == 0) {
                                    ((rb) this).field_A = ((rb) this).field_A + 1;
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
                                  if (((rb) this).field_t.field_e >= 250) {
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
                                  if (0 != ((rb) this).field_r[((rb) this).field_A]) {
                                    break L39;
                                  } else {
                                    ae discarded$6 = this.a(((rb) this).field_A, 1, false);
                                    break L39;
                                  }
                                }
                                L40: {
                                  if (((rb) this).field_r[((rb) this).field_A] != 0) {
                                    break L40;
                                  } else {
                                    var3 = new am();
                                    var3.field_c = (long)((rb) this).field_A;
                                    var2_int = 0;
                                    ((rb) this).field_w.a(var3, 90);
                                    break L40;
                                  }
                                }
                                ((rb) this).field_A = ((rb) this).field_A + 1;
                                if (var5 == 0) {
                                  continue L36;
                                } else {
                                  break L25;
                                }
                              }
                            }
                          }
                        }
                        stackOut_90_0 = var2_int;
                        stackIn_91_0 = stackOut_90_0;
                        break L24;
                      }
                      if (stackIn_91_0 == 0) {
                        break L2;
                      } else {
                        ((rb) this).field_A = 0;
                        ((rb) this).field_o = false;
                        break L2;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  break L2;
                }
              }
              stackOut_94_0 = param0;
              stackOut_94_1 = -1;
              stackIn_95_0 = stackOut_94_0;
              stackIn_95_1 = stackOut_94_1;
              break L1;
            }
            L41: {
              if (stackIn_95_0 == stackIn_95_1) {
                break L41;
              } else {
                field_p = null;
                break L41;
              }
            }
            L42: {
              if (!((rb) this).field_f) {
                break L42;
              } else {
                if (((rb) this).field_k > hn.a((byte) 80)) {
                  break L42;
                } else {
                  var2_ref = (ae) (Object) ((rb) this).field_i.a(-93);
                  L43: while (true) {
                    L44: {
                      if (null == var2_ref) {
                        break L44;
                      } else {
                        if (var5 != 0) {
                          break L42;
                        } else {
                          L45: {
                            if (var2_ref.field_v) {
                              break L45;
                            } else {
                              L46: {
                                if (!var2_ref.field_t) {
                                  break L46;
                                } else {
                                  if (!var2_ref.field_w) {
                                    throw new RuntimeException();
                                  } else {
                                    var2_ref.b(20);
                                    if (var5 == 0) {
                                      break L45;
                                    } else {
                                      break L46;
                                    }
                                  }
                                }
                              }
                              var2_ref.field_t = true;
                              break L45;
                            }
                          }
                          var2_ref = (ae) (Object) ((rb) this).field_i.b(param0);
                          if (var5 == 0) {
                            continue L43;
                          } else {
                            break L44;
                          }
                        }
                      }
                    }
                    ((rb) this).field_k = 1000L + hn.a((byte) 80);
                    break L42;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "rb.L(" + param0 + ')');
        }
    }

    final wc c(int param0) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        RuntimeException var3 = null;
        int var4 = 0;
        wc stackIn_5_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_37_0 = null;
        Object stackIn_51_0 = null;
        wc stackIn_61_0 = null;
        RuntimeException decompiledCaughtException = null;
        wc stackOut_4_0 = null;
        Object stackOut_12_0 = null;
        Object stackOut_50_0 = null;
        Object stackOut_36_0 = null;
        wc stackOut_60_0 = null;
        Object stackOut_16_0 = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (((rb) this).field_x != null) {
              stackOut_4_0 = ((rb) this).field_x;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              L1: {
                if (null != ((rb) this).field_j) {
                  break L1;
                } else {
                  if (((rb) this).field_h.a(param0 ^ 23)) {
                    stackOut_12_0 = null;
                    stackIn_13_0 = stackOut_12_0;
                    return (wc) (Object) stackIn_13_0;
                  } else {
                    ((rb) this).field_j = (ae) (Object) ((rb) this).field_h.a((byte) 0, 255, ((rb) this).field_g, -18986, true);
                    break L1;
                  }
                }
              }
              if (!((rb) this).field_j.field_v) {
                L2: {
                  if (param0 == 3) {
                    break L2;
                  } else {
                    wc discarded$2 = ((rb) this).c(-109);
                    break L2;
                  }
                }
                L3: {
                  var2_array = ((rb) this).field_j.c((byte) 127);
                  if (!(((rb) this).field_j instanceof rh)) {
                    try {
                      L4: {
                        if (null == var2_array) {
                          throw new RuntimeException();
                        } else {
                          ((rb) this).field_x = new wc(var2_array, ((rb) this).field_l, ((rb) this).field_v);
                          break L4;
                        }
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        L6: {
                          var3 = decompiledCaughtException;
                          ((rb) this).field_h.c(194);
                          ((rb) this).field_x = null;
                          if (((rb) this).field_h.a(20)) {
                            break L6;
                          } else {
                            ((rb) this).field_j = (ae) (Object) ((rb) this).field_h.a((byte) 0, 255, ((rb) this).field_g, -18986, true);
                            if (var4 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        ((rb) this).field_j = null;
                        break L5;
                      }
                      stackOut_50_0 = null;
                      stackIn_51_0 = stackOut_50_0;
                      return (wc) (Object) stackIn_51_0;
                    }
                    if (((rb) this).field_n != null) {
                      rh discarded$3 = ((rb) this).field_t.a(((rb) this).field_n, -4, var2_array, ((rb) this).field_g);
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    try {
                      L7: {
                        if (null != var2_array) {
                          ((rb) this).field_x = new wc(var2_array, ((rb) this).field_l, ((rb) this).field_v);
                          if (((rb) this).field_B != ((rb) this).field_x.field_n) {
                            throw new RuntimeException();
                          } else {
                            break L7;
                          }
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L8: {
                        L9: {
                          var3 = decompiledCaughtException;
                          ((rb) this).field_x = null;
                          if (!((rb) this).field_h.a(20)) {
                            break L9;
                          } else {
                            ((rb) this).field_j = null;
                            if (var4 == 0) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        ((rb) this).field_j = (ae) (Object) ((rb) this).field_h.a((byte) 0, 255, ((rb) this).field_g, -18986, true);
                        break L8;
                      }
                      stackOut_36_0 = null;
                      stackIn_37_0 = stackOut_36_0;
                      return (wc) (Object) stackIn_37_0;
                    }
                    break L3;
                  }
                }
                L10: {
                  ((rb) this).field_j = null;
                  if (((rb) this).field_q != null) {
                    ((rb) this).field_r = new byte[((rb) this).field_x.field_c];
                    break L10;
                  } else {
                    break L10;
                  }
                }
                stackOut_60_0 = ((rb) this).field_x;
                stackIn_61_0 = stackOut_60_0;
                break L0;
              } else {
                stackOut_16_0 = null;
                stackIn_17_0 = stackOut_16_0;
                return (wc) (Object) stackIn_17_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "rb.H(" + param0 + ')');
        }
        return stackIn_61_0;
    }

    final void d(int param0) {
        RuntimeException var2 = null;
        am var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 >= 20) {
                break L1;
              } else {
                field_y = null;
                break L1;
              }
            }
            if (((rb) this).field_w != null) {
              if (null == ((rb) this).c(3)) {
                return;
              } else {
                var2_ref = ((rb) this).field_u.g(-6);
                L2: while (true) {
                  L3: {
                    L4: {
                      if (null == var2_ref) {
                        break L4;
                      } else {
                        var3 = (int)var2_ref.field_c;
                        if (var4 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              L7: {
                                if (var3 < 0) {
                                  break L7;
                                } else {
                                  if (var3 >= ((rb) this).field_x.field_c) {
                                    break L7;
                                  } else {
                                    if (((rb) this).field_x.field_o[var3] != 0) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              var2_ref.b(113);
                              if (var4 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                            L8: {
                              if (((rb) this).field_r[var3] == 0) {
                                ae discarded$2 = this.a(var3, 1, false);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            L9: {
                              if (-1 != ((rb) this).field_r[var3]) {
                                break L9;
                              } else {
                                ae discarded$3 = this.a(var3, 2, false);
                                break L9;
                              }
                            }
                            if (1 != ((rb) this).field_r[var3]) {
                              break L5;
                            } else {
                              var2_ref.b(-79);
                              break L5;
                            }
                          }
                          var2_ref = ((rb) this).field_u.a(12684);
                          if (var4 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    break L3;
                  }
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "rb.O(" + param0 + ')');
        }
    }

    public static void a(boolean param0) {
        field_s = null;
        if (param0) {
            return;
        }
        try {
            field_p = null;
            field_y = null;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "rb.K(" + param0 + ')');
        }
    }

    final void a(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((rb) this).field_q == null) {
              return;
            } else {
              L1: {
                if (param0 == -50) {
                  break L1;
                } else {
                  ((rb) this).field_r = null;
                  break L1;
                }
              }
              L2: {
                ((rb) this).field_z = true;
                if (null == ((rb) this).field_w) {
                  ((rb) this).field_w = new vl();
                  break L2;
                } else {
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "rb.J(" + param0 + ')');
        }
    }

    rb(int param0, um param1, um param2, ej param3, dh param4, int param5, byte[] param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        ((rb) this).field_i = new jm(16);
        ((rb) this).field_A = 0;
        ((rb) this).field_u = new vl();
        ((rb) this).field_k = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((rb) this).field_g = param0;
                ((rb) this).field_q = param1;
                if (null == ((rb) this).field_q) {
                  break L2;
                } else {
                  ((rb) this).field_o = true;
                  ((rb) this).field_w = new vl();
                  if (!HostileSpawn.field_I) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((rb) this).field_o = false;
              break L1;
            }
            L3: {
              ((rb) this).field_l = param5;
              ((rb) this).field_v = param6;
              ((rb) this).field_t = param4;
              ((rb) this).field_B = param7;
              ((rb) this).field_f = param8;
              ((rb) this).field_h = param3;
              ((rb) this).field_n = param2;
              if (null != ((rb) this).field_n) {
                ((rb) this).field_j = (ae) (Object) ((rb) this).field_t.a(((rb) this).field_n, ((rb) this).field_g, -27337);
                break L3;
              } else {
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
            stackOut_10_1 = new StringBuilder().append("rb.<init>(").append(param0).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L6;
            }
          }
          L7: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param4 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L7;
            }
          }
          L8: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param5).append(',');
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param6 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L8;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new int[8192];
        field_m = 0;
    }
}
