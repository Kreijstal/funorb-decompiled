/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti extends qa {
    private ln field_D;
    static String field_v;
    private int field_w;
    static pp field_A;
    private int field_p;
    private tm field_y;
    private bb field_t;
    private byte[] field_s;
    static String field_n;
    static boolean field_f;
    static boolean field_i;
    static byte[] field_q;
    private byte[] field_h;
    private int field_o;
    private wa field_l;
    private ln field_g;
    private vf field_C;
    private cc field_B;
    private boolean field_r;
    private boolean field_x;
    private md field_j;
    private md field_u;
    private int field_z;
    private long field_m;
    private boolean field_k;

    private final vf a(byte param0, int param1, int param2) {
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
        Object stackIn_43_0 = null;
        Object stackIn_52_0 = null;
        Object stackIn_58_0 = null;
        int stackIn_76_0 = 0;
        int stackIn_76_1 = 0;
        Object stackIn_90_0 = null;
        int stackIn_95_0 = 0;
        int stackIn_95_1 = 0;
        Object stackIn_102_0 = null;
        int stackIn_123_0 = 0;
        int stackIn_123_1 = 0;
        int stackIn_130_0 = 0;
        int stackIn_130_1 = 0;
        Object stackIn_144_0 = null;
        Object stackIn_151_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_51_0 = null;
        Object stackOut_42_0 = null;
        int stackOut_122_0 = 0;
        int stackOut_122_1 = 0;
        int stackOut_129_0 = 0;
        int stackOut_129_1 = 0;
        Object stackOut_143_0 = null;
        int stackOut_75_0 = 0;
        int stackOut_75_1 = 0;
        Object stackOut_89_0 = null;
        int stackOut_94_0 = 0;
        int stackOut_94_1 = 0;
        Object stackOut_101_0 = null;
        Object stackOut_57_0 = null;
        Object stackOut_150_0 = null;
        var10 = DungeonAssault.field_K;
        try {
          try {
            L0: {
              if (param0 >= 81) {
                break L0;
              } else {
                ((ti) this).field_k = false;
                break L0;
              }
            }
            L1: {
              var4 = (Object) (Object) (vf) (Object) ((ti) this).field_l.a((long)param1, 8);
              if (null == var4) {
                break L1;
              } else {
                if (param2 != 0) {
                  break L1;
                } else {
                  if (((vf) var4).field_B) {
                    break L1;
                  } else {
                    if (!((vf) var4).field_v) {
                      break L1;
                    } else {
                      ((vf) var4).a(false);
                      var4 = null;
                      break L1;
                    }
                  }
                }
              }
            }
            L2: {
              if (var4 == null) {
                L3: {
                  if (param2 == 0) {
                    L4: {
                      L5: {
                        if (((ti) this).field_D == null) {
                          break L5;
                        } else {
                          if (((ti) this).field_h[param1] != -1) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      if (!((ti) this).field_t.b(-21431)) {
                        var4 = (Object) (Object) ((ti) this).field_t.a(true, ((ti) this).field_p, (byte) 2, param1, (byte) 73);
                        if (var10 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      } else {
                        stackOut_51_0 = null;
                        stackIn_52_0 = stackOut_51_0;
                        return (vf) (Object) stackIn_52_0;
                      }
                    }
                    var4 = (Object) (Object) ((ti) this).field_B.a(((ti) this).field_D, param1, -6319);
                    break L3;
                  } else {
                    L6: {
                      if (1 != param2) {
                        break L6;
                      } else {
                        if (((ti) this).field_D == null) {
                          throw new RuntimeException();
                        } else {
                          var4 = (Object) (Object) ((ti) this).field_B.a((byte) -78, ((ti) this).field_D, param1);
                          if (var10 == 0) {
                            break L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    if (param2 == 2) {
                      if (null != ((ti) this).field_D) {
                        if (((ti) this).field_h[param1] == -1) {
                          L7: {
                            if (((ti) this).field_t.d(20)) {
                              break L7;
                            } else {
                              var4 = (Object) (Object) ((ti) this).field_t.a(false, ((ti) this).field_p, (byte) 2, param1, (byte) 118);
                              if (var10 == 0) {
                                break L3;
                              } else {
                                break L7;
                              }
                            }
                          }
                          stackOut_42_0 = null;
                          stackIn_43_0 = stackOut_42_0;
                          return (vf) (Object) stackIn_43_0;
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
                ((ti) this).field_l.a((ne) var4, 12460, (long)param1);
                break L2;
              } else {
                break L2;
              }
            }
            if (!((vf) var4).field_v) {
              var5 = ((vf) var4).b(true);
              if (var4 instanceof co) {
                L8: {
                  if (var5 == null) {
                    break L8;
                  } else {
                    if (var5.length <= 2) {
                      break L8;
                    } else {
                      jl.field_a.reset();
                      jl.field_a.update(var5, 0, var5.length - 2);
                      var6_int = (int)jl.field_a.getValue();
                      if (~((ti) this).field_y.field_q[param1] != ~var6_int) {
                        throw new RuntimeException();
                      } else {
                        L9: {
                          L10: {
                            if (null == ((ti) this).field_y.field_g) {
                              break L10;
                            } else {
                              if (null != ((ti) this).field_y.field_g[param1]) {
                                var7_ref_byte__ = ((ti) this).field_y.field_g[param1];
                                var8 = rn.a(var5.length + -2, 0, 8, var5);
                                var9 = 0;
                                L11: while (true) {
                                  if (var9 >= 64) {
                                    break L10;
                                  } else {
                                    stackOut_122_0 = ~var7_ref_byte__[var9];
                                    stackOut_122_1 = ~var8[var9];
                                    stackIn_130_0 = stackOut_122_0;
                                    stackIn_130_1 = stackOut_122_1;
                                    stackIn_123_0 = stackOut_122_0;
                                    stackIn_123_1 = stackOut_122_1;
                                    if (var10 != 0) {
                                      break L9;
                                    } else {
                                      if (stackIn_123_0 == stackIn_123_1) {
                                        var9++;
                                        if (var10 == 0) {
                                          continue L11;
                                        } else {
                                          break L10;
                                        }
                                      } else {
                                        throw new RuntimeException();
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L10;
                              }
                            }
                          }
                          stackOut_129_0 = var5[-1 + var5.length] & 255;
                          stackOut_129_1 = var5[-2 + var5.length] << -1686127864 & 65280;
                          stackIn_130_0 = stackOut_129_0;
                          stackIn_130_1 = stackOut_129_1;
                          break L9;
                        }
                        var7 = stackIn_130_0 + stackIn_130_1;
                        if ((((ti) this).field_y.field_o[param1] & 65535) != var7) {
                          throw new RuntimeException();
                        } else {
                          L12: {
                            if (1 == ((ti) this).field_h[param1]) {
                              break L12;
                            } else {
                              L13: {
                                if (0 == ((ti) this).field_h[param1]) {
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              ((ti) this).field_h[param1] = (byte) 1;
                              break L12;
                            }
                          }
                          L14: {
                            if (!((vf) var4).field_B) {
                              ((vf) var4).a(false);
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                          stackOut_143_0 = var4;
                          stackIn_144_0 = stackOut_143_0;
                          return (vf) (Object) stackIn_144_0;
                        }
                      }
                    }
                  }
                }
                throw new RuntimeException();
              } else {
                try {
                  L15: {
                    L16: {
                      if (null == var5) {
                        break L16;
                      } else {
                        if (var5.length > 2) {
                          jl.field_a.reset();
                          jl.field_a.update(var5, 0, var5.length - 2);
                          var6_int = (int)jl.field_a.getValue();
                          if (var6_int == ((ti) this).field_y.field_q[param1]) {
                            L17: {
                              if (null == ((ti) this).field_y.field_g) {
                                break L17;
                              } else {
                                if (null == ((ti) this).field_y.field_g[param1]) {
                                  break L17;
                                } else {
                                  var7_ref_byte__ = ((ti) this).field_y.field_g[param1];
                                  var8 = rn.a(-2 + var5.length, 0, 8, var5);
                                  var9 = 0;
                                  L18: while (true) {
                                    if (64 <= var9) {
                                      break L17;
                                    } else {
                                      stackOut_75_0 = ~var8[var9];
                                      stackOut_75_1 = ~var7_ref_byte__[var9];
                                      stackIn_95_0 = stackOut_75_0;
                                      stackIn_95_1 = stackOut_75_1;
                                      stackIn_76_0 = stackOut_75_0;
                                      stackIn_76_1 = stackOut_75_1;
                                      if (var10 != 0) {
                                        decompiledRegionSelector0 = 0;
                                        break L15;
                                      } else {
                                        if (stackIn_76_0 != stackIn_76_1) {
                                          throw new RuntimeException();
                                        } else {
                                          var9++;
                                          if (var10 == 0) {
                                            continue L18;
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            ((ti) this).field_t.field_h = 0;
                            ((ti) this).field_t.field_c = 0;
                            decompiledRegionSelector0 = 1;
                            break L15;
                          } else {
                            throw new RuntimeException();
                          }
                        } else {
                          break L16;
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L19: {
                    var6 = (RuntimeException) (Object) decompiledCaughtException;
                    ((ti) this).field_t.f(-118);
                    ((vf) var4).a(false);
                    if (!((vf) var4).field_B) {
                      break L19;
                    } else {
                      if (((ti) this).field_t.b(-21431)) {
                        break L19;
                      } else {
                        var4 = (Object) (Object) ((ti) this).field_t.a(true, ((ti) this).field_p, (byte) 2, param1, (byte) 105);
                        ((ti) this).field_l.a((ne) var4, 12460, (long)param1);
                        break L19;
                      }
                    }
                  }
                  stackOut_89_0 = null;
                  stackIn_90_0 = stackOut_89_0;
                  return (vf) (Object) stackIn_90_0;
                }
                L20: {
                  L21: {
                    if (decompiledRegionSelector0 == 0) {
                      break L21;
                    } else {
                      var5[-2 + var5.length] = (byte)(((ti) this).field_y.field_o[param1] >>> 1024223272);
                      var5[var5.length - 1] = (byte)((ti) this).field_y.field_o[param1];
                      if (((ti) this).field_D != null) {
                        co discarded$1 = ((ti) this).field_B.a(((ti) this).field_D, 15958, param1, var5);
                        stackOut_94_0 = -2;
                        stackOut_94_1 = ~((ti) this).field_h[param1];
                        stackIn_95_0 = stackOut_94_0;
                        stackIn_95_1 = stackOut_94_1;
                        break L21;
                      } else {
                        break L20;
                      }
                    }
                  }
                  if (stackIn_95_0 == stackIn_95_1) {
                    break L20;
                  } else {
                    ((ti) this).field_h[param1] = (byte) 1;
                    break L20;
                  }
                }
                L22: {
                  if (((vf) var4).field_B) {
                    break L22;
                  } else {
                    ((vf) var4).a(false);
                    break L22;
                  }
                }
                stackOut_101_0 = var4;
                stackIn_102_0 = stackOut_101_0;
                return (vf) (Object) stackIn_102_0;
              }
            } else {
              stackOut_57_0 = null;
              stackIn_58_0 = stackOut_57_0;
              return (vf) (Object) stackIn_58_0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            L23: {
              var6_ref = (Exception) (Object) decompiledCaughtException;
              ((ti) this).field_h[param1] = (byte) -1;
              ((vf) var4).a(false);
              if (!((vf) var4).field_B) {
                break L23;
              } else {
                if (((ti) this).field_t.b(-21431)) {
                  break L23;
                } else {
                  var4 = (Object) (Object) ((ti) this).field_t.a(true, ((ti) this).field_p, (byte) 2, param1, (byte) 77);
                  ((ti) this).field_l.a((ne) var4, 12460, (long)param1);
                  break L23;
                }
              }
            }
            stackOut_150_0 = null;
            stackIn_151_0 = stackOut_150_0;
            return (vf) (Object) stackIn_151_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (Object) (Object) decompiledCaughtException;
          throw vk.a((Throwable) var4, "ti.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void c(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        vf var2_ref = null;
        ne var3 = null;
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
        int stackIn_56_0 = 0;
        byte stackIn_56_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        boolean stackIn_102_0 = false;
        int stackIn_122_0 = 0;
        int stackIn_123_0 = 0;
        int stackIn_123_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        byte stackOut_15_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_55_0 = 0;
        byte stackOut_55_1 = 0;
        int stackOut_68_0 = 0;
        int stackOut_68_1 = 0;
        int stackOut_69_0 = 0;
        int stackOut_69_1 = 0;
        int stackOut_66_0 = 0;
        int stackOut_66_1 = 0;
        boolean stackOut_101_0 = false;
        int stackOut_121_0 = 0;
        int stackOut_122_0 = 0;
        int stackOut_122_1 = 0;
        var5 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              L2: {
                if (((ti) this).field_j != null) {
                  if (null != ((ti) this).a(26538)) {
                    L3: {
                      if (((ti) this).field_x) {
                        break L3;
                      } else {
                        L4: {
                          if (((ti) this).field_r) {
                            break L4;
                          } else {
                            ((ti) this).field_j = null;
                            if (var5 == 0) {
                              break L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var2_int = 1;
                        var3 = ((ti) this).field_j.e(-24172);
                        L5: while (true) {
                          L6: {
                            L7: {
                              if (var3 == null) {
                                break L7;
                              } else {
                                var4 = (int)var3.field_h;
                                stackOut_15_0 = 1;
                                stackOut_15_1 = ((ti) this).field_h[var4];
                                stackIn_28_0 = stackOut_15_0;
                                stackIn_28_1 = stackOut_15_1;
                                stackIn_16_0 = stackOut_15_0;
                                stackIn_16_1 = stackOut_15_1;
                                if (var5 != 0) {
                                  L8: while (true) {
                                    if (stackIn_28_0 <= stackIn_28_1) {
                                      break L6;
                                    } else {
                                      stackOut_29_0 = -1;
                                      stackOut_29_1 = ~((ti) this).field_y.field_k[((ti) this).field_z];
                                      stackIn_123_0 = stackOut_29_0;
                                      stackIn_123_1 = stackOut_29_1;
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
                                            if (stackIn_32_0 == stackIn_32_1) {
                                              ((ti) this).field_z = ((ti) this).field_z + 1;
                                              if (var5 == 0) {
                                                break L9;
                                              } else {
                                                break L10;
                                              }
                                            } else {
                                              break L10;
                                            }
                                          }
                                          L11: {
                                            if (!((ti) this).field_t.d(20)) {
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
                                            if (((ti) this).field_h[((ti) this).field_z] == 1) {
                                              break L12;
                                            } else {
                                              vf discarded$4 = this.a((byte) 112, ((ti) this).field_z, 2);
                                              break L12;
                                            }
                                          }
                                          L13: {
                                            if (1 != ((ti) this).field_h[((ti) this).field_z]) {
                                              var3 = new ne();
                                              var3.field_h = (long)((ti) this).field_z;
                                              ((ti) this).field_j.a(var3, false);
                                              var2_int = 0;
                                              break L13;
                                            } else {
                                              break L13;
                                            }
                                          }
                                          ((ti) this).field_z = ((ti) this).field_z + 1;
                                          if (var5 == 0) {
                                            break L9;
                                          } else {
                                            break L6;
                                          }
                                        }
                                        stackOut_27_0 = ~((ti) this).field_z;
                                        stackOut_27_1 = ~((ti) this).field_y.field_k.length;
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
                                      vf discarded$5 = this.a((byte) 107, var4, 2);
                                      break L14;
                                    }
                                  }
                                  L15: {
                                    L16: {
                                      if (((ti) this).field_h[var4] != 1) {
                                        break L16;
                                      } else {
                                        var3.a(false);
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
                                  var3 = ((ti) this).field_j.a(4);
                                  if (var5 == 0) {
                                    continue L5;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            L17: while (true) {
                              stackOut_27_0 = ~((ti) this).field_z;
                              stackOut_27_1 = ~((ti) this).field_y.field_k.length;
                              stackIn_28_0 = stackOut_27_0;
                              stackIn_28_1 = stackOut_27_1;
                              if (stackIn_28_0 <= stackIn_28_1) {
                                break L6;
                              } else {
                                stackOut_29_0 = -1;
                                stackOut_29_1 = ~((ti) this).field_y.field_k[((ti) this).field_z];
                                stackIn_123_0 = stackOut_29_0;
                                stackIn_123_1 = stackOut_29_1;
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
                                    if (stackIn_32_0 == stackIn_32_1) {
                                      ((ti) this).field_z = ((ti) this).field_z + 1;
                                      if (var5 == 0) {
                                        continue L17;
                                      } else {
                                        break L18;
                                      }
                                    } else {
                                      break L18;
                                    }
                                  }
                                  L19: {
                                    if (!((ti) this).field_t.d(20)) {
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
                                    if (((ti) this).field_h[((ti) this).field_z] == 1) {
                                      break L20;
                                    } else {
                                      vf discarded$4 = this.a((byte) 112, ((ti) this).field_z, 2);
                                      break L20;
                                    }
                                  }
                                  L21: {
                                    if (1 != ((ti) this).field_h[((ti) this).field_z]) {
                                      var3 = new ne();
                                      var3.field_h = (long)((ti) this).field_z;
                                      ((ti) this).field_j.a(var3, false);
                                      var2_int = 0;
                                      break L21;
                                    } else {
                                      break L21;
                                    }
                                  }
                                  ((ti) this).field_z = ((ti) this).field_z + 1;
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
                            if (var2_int == 0) {
                              break L22;
                            } else {
                              ((ti) this).field_r = false;
                              ((ti) this).field_z = 0;
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
                    var3 = ((ti) this).field_j.e(-24172);
                    L23: while (true) {
                      L24: {
                        L25: {
                          if (null == var3) {
                            break L25;
                          } else {
                            var4 = (int)var3.field_h;
                            stackOut_55_0 = 0;
                            stackOut_55_1 = ((ti) this).field_h[var4];
                            stackIn_67_0 = stackOut_55_0;
                            stackIn_67_1 = stackOut_55_1;
                            stackIn_56_0 = stackOut_55_0;
                            stackIn_56_1 = stackOut_55_1;
                            if (var5 != 0) {
                              L26: while (true) {
                                if (stackIn_67_0 >= stackIn_67_1) {
                                  break L24;
                                } else {
                                  stackOut_68_0 = -1;
                                  stackOut_68_1 = ~((ti) this).field_y.field_k[((ti) this).field_z];
                                  stackIn_123_0 = stackOut_68_0;
                                  stackIn_123_1 = stackOut_68_1;
                                  stackIn_69_0 = stackOut_68_0;
                                  stackIn_69_1 = stackOut_68_1;
                                  if (var5 != 0) {
                                    break L1;
                                  } else {
                                    stackOut_69_0 = stackIn_69_0;
                                    stackOut_69_1 = stackIn_69_1;
                                    stackIn_71_0 = stackOut_69_0;
                                    stackIn_71_1 = stackOut_69_1;
                                    L27: {
                                      L28: {
                                        if (stackIn_71_0 != stackIn_71_1) {
                                          break L28;
                                        } else {
                                          ((ti) this).field_z = ((ti) this).field_z + 1;
                                          if (var5 == 0) {
                                            break L27;
                                          } else {
                                            break L28;
                                          }
                                        }
                                      }
                                      L29: {
                                        if (250 <= ((ti) this).field_B.field_f) {
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
                                        if (((ti) this).field_h[((ti) this).field_z] != 0) {
                                          break L30;
                                        } else {
                                          vf discarded$6 = this.a((byte) 126, ((ti) this).field_z, 1);
                                          break L30;
                                        }
                                      }
                                      L31: {
                                        if (((ti) this).field_h[((ti) this).field_z] != 0) {
                                          break L31;
                                        } else {
                                          var3 = new ne();
                                          var3.field_h = (long)((ti) this).field_z;
                                          var2_int = 0;
                                          ((ti) this).field_j.a(var3, false);
                                          break L31;
                                        }
                                      }
                                      ((ti) this).field_z = ((ti) this).field_z + 1;
                                      if (var5 == 0) {
                                        break L27;
                                      } else {
                                        break L24;
                                      }
                                    }
                                    stackOut_66_0 = ~((ti) this).field_y.field_k.length;
                                    stackOut_66_1 = ~((ti) this).field_z;
                                    stackIn_67_0 = stackOut_66_0;
                                    stackIn_67_1 = stackOut_66_1;
                                    continue L26;
                                  }
                                }
                              }
                            } else {
                              L32: {
                                if (stackIn_56_0 == stackIn_56_1) {
                                  vf discarded$7 = this.a((byte) 127, var4, 1);
                                  break L32;
                                } else {
                                  break L32;
                                }
                              }
                              L33: {
                                L34: {
                                  if (0 != ((ti) this).field_h[var4]) {
                                    break L34;
                                  } else {
                                    var2_int = 0;
                                    if (var5 == 0) {
                                      break L33;
                                    } else {
                                      break L34;
                                    }
                                  }
                                }
                                var3.a(false);
                                break L33;
                              }
                              var3 = ((ti) this).field_j.a(param0 ^ -10786);
                              if (var5 == 0) {
                                continue L23;
                              } else {
                                break L25;
                              }
                            }
                          }
                        }
                        L35: while (true) {
                          stackOut_66_0 = ~((ti) this).field_y.field_k.length;
                          stackOut_66_1 = ~((ti) this).field_z;
                          stackIn_67_0 = stackOut_66_0;
                          stackIn_67_1 = stackOut_66_1;
                          if (stackIn_67_0 >= stackIn_67_1) {
                            break L24;
                          } else {
                            stackOut_68_0 = -1;
                            stackOut_68_1 = ~((ti) this).field_y.field_k[((ti) this).field_z];
                            stackIn_123_0 = stackOut_68_0;
                            stackIn_123_1 = stackOut_68_1;
                            stackIn_69_0 = stackOut_68_0;
                            stackIn_69_1 = stackOut_68_1;
                            if (var5 != 0) {
                              break L1;
                            } else {
                              stackOut_69_0 = stackIn_69_0;
                              stackOut_69_1 = stackIn_69_1;
                              stackIn_71_0 = stackOut_69_0;
                              stackIn_71_1 = stackOut_69_1;
                              L36: {
                                if (stackIn_71_0 != stackIn_71_1) {
                                  break L36;
                                } else {
                                  ((ti) this).field_z = ((ti) this).field_z + 1;
                                  if (var5 == 0) {
                                    continue L35;
                                  } else {
                                    break L36;
                                  }
                                }
                              }
                              L37: {
                                if (250 <= ((ti) this).field_B.field_f) {
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
                                if (((ti) this).field_h[((ti) this).field_z] != 0) {
                                  break L38;
                                } else {
                                  vf discarded$6 = this.a((byte) 126, ((ti) this).field_z, 1);
                                  break L38;
                                }
                              }
                              L39: {
                                if (((ti) this).field_h[((ti) this).field_z] != 0) {
                                  break L39;
                                } else {
                                  var3 = new ne();
                                  var3.field_h = (long)((ti) this).field_z;
                                  var2_int = 0;
                                  ((ti) this).field_j.a(var3, false);
                                  break L39;
                                }
                              }
                              ((ti) this).field_z = ((ti) this).field_z + 1;
                              if (var5 == 0) {
                                continue L35;
                              } else {
                                break L24;
                              }
                            }
                          }
                        }
                      }
                      if (var2_int != 0) {
                        ((ti) this).field_z = 0;
                        ((ti) this).field_x = false;
                        break L2;
                      } else {
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
              L40: {
                L41: {
                  if (!((ti) this).field_k) {
                    break L41;
                  } else {
                    if (kd.c(param0 ^ 9138) >= ((ti) this).field_m) {
                      var2_ref = (vf) (Object) ((ti) this).field_l.a(true);
                      L42: while (true) {
                        L43: {
                          if (var2_ref == null) {
                            break L43;
                          } else {
                            stackOut_101_0 = var2_ref.field_v;
                            stackIn_122_0 = stackOut_101_0 ? 1 : 0;
                            stackIn_102_0 = stackOut_101_0;
                            if (var5 != 0) {
                              break L40;
                            } else {
                              L44: {
                                L45: {
                                  if (!stackIn_102_0) {
                                    break L45;
                                  } else {
                                    if (var5 == 0) {
                                      break L44;
                                    } else {
                                      break L45;
                                    }
                                  }
                                }
                                L46: {
                                  if (!var2_ref.field_z) {
                                    break L46;
                                  } else {
                                    if (var2_ref.field_B) {
                                      var2_ref.a(false);
                                      if (var5 == 0) {
                                        break L44;
                                      } else {
                                        break L46;
                                      }
                                    } else {
                                      throw new RuntimeException();
                                    }
                                  }
                                }
                                var2_ref.field_z = true;
                                break L44;
                              }
                              var2_ref = (vf) (Object) ((ti) this).field_l.a(param0 + 15108);
                              if (var5 == 0) {
                                continue L42;
                              } else {
                                break L43;
                              }
                            }
                          }
                        }
                        ((ti) this).field_m = kd.c(-2456) - -1000L;
                        break L41;
                      }
                    } else {
                      break L41;
                    }
                  }
                }
                stackOut_121_0 = param0;
                stackIn_122_0 = stackOut_121_0;
                break L40;
              }
              stackOut_122_0 = stackIn_122_0;
              stackOut_122_1 = -10790;
              stackIn_123_0 = stackOut_122_0;
              stackIn_123_1 = stackOut_122_1;
              break L1;
            }
            L47: {
              if (stackIn_123_0 == stackIn_123_1) {
                break L47;
              } else {
                ((ti) this).field_k = false;
                break L47;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "ti.J(" + param0 + ')');
        }
    }

    final byte[] a(int param0, int param1) {
        vf var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            var3 = this.a((byte) 90, param0, 0);
            if (null != var3) {
              if (param1 == -7249) {
                var4 = var3.b(true);
                var3.a(false);
                stackOut_6_0 = (byte[]) var4;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (byte[]) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var3_ref, "ti.E(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final tm a(int param0) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        RuntimeException var3 = null;
        int var4 = 0;
        tm stackIn_3_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_34_0 = null;
        Object stackIn_53_0 = null;
        tm stackIn_58_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        Object stackOut_19_0 = null;
        Object stackOut_33_0 = null;
        Object stackOut_52_0 = null;
        tm stackOut_57_0 = null;
        Object stackOut_14_0 = null;
        tm stackOut_2_0 = null;
        var4 = DungeonAssault.field_K;
        try {
          L0: {
            if (null == ((ti) this).field_y) {
              L1: {
                if (((ti) this).field_C == null) {
                  if (((ti) this).field_t.b(-21431)) {
                    stackOut_10_0 = null;
                    stackIn_11_0 = stackOut_10_0;
                    return (tm) (Object) stackIn_11_0;
                  } else {
                    ((ti) this).field_C = (vf) (Object) ((ti) this).field_t.a(true, 255, (byte) 0, ((ti) this).field_p, (byte) 79);
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              if (param0 == 26538) {
                if (((ti) this).field_C.field_v) {
                  stackOut_19_0 = null;
                  stackIn_20_0 = stackOut_19_0;
                  return (tm) (Object) stackIn_20_0;
                } else {
                  L2: {
                    L3: {
                      var2_array = ((ti) this).field_C.b(true);
                      if (((ti) this).field_C instanceof co) {
                        break L3;
                      } else {
                        try {
                          L4: {
                            if (var2_array != null) {
                              ((ti) this).field_y = new tm(var2_array, ((ti) this).field_w, ((ti) this).field_s);
                              break L4;
                            } else {
                              throw new RuntimeException();
                            }
                          }
                        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          L5: {
                            L6: {
                              var3 = decompiledCaughtException;
                              ((ti) this).field_t.f(99);
                              ((ti) this).field_y = null;
                              if (((ti) this).field_t.b(-21431)) {
                                break L6;
                              } else {
                                ((ti) this).field_C = (vf) (Object) ((ti) this).field_t.a(true, 255, (byte) 0, ((ti) this).field_p, (byte) 71);
                                if (var4 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            ((ti) this).field_C = null;
                            break L5;
                          }
                          stackOut_33_0 = null;
                          stackIn_34_0 = stackOut_33_0;
                          return (tm) (Object) stackIn_34_0;
                        }
                        if (((ti) this).field_g != null) {
                          co discarded$1 = ((ti) this).field_B.a(((ti) this).field_g, param0 ^ 23036, ((ti) this).field_p, var2_array);
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
                      L7: {
                        if (var2_array != null) {
                          ((ti) this).field_y = new tm(var2_array, ((ti) this).field_w, ((ti) this).field_s);
                          if (((ti) this).field_y.field_s == ((ti) this).field_o) {
                            break L7;
                          } else {
                            throw new RuntimeException();
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
                          ((ti) this).field_y = null;
                          if (((ti) this).field_t.b(-21431)) {
                            break L9;
                          } else {
                            ((ti) this).field_C = (vf) (Object) ((ti) this).field_t.a(true, 255, (byte) 0, ((ti) this).field_p, (byte) 69);
                            if (var4 == 0) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        ((ti) this).field_C = null;
                        break L8;
                      }
                      stackOut_52_0 = null;
                      stackIn_53_0 = stackOut_52_0;
                      return (tm) (Object) stackIn_53_0;
                    }
                    break L2;
                  }
                  L10: {
                    ((ti) this).field_C = null;
                    if (((ti) this).field_D == null) {
                      break L10;
                    } else {
                      ((ti) this).field_h = new byte[((ti) this).field_y.field_l];
                      break L10;
                    }
                  }
                  stackOut_57_0 = ((ti) this).field_y;
                  stackIn_58_0 = stackOut_57_0;
                  break L0;
                }
              } else {
                stackOut_14_0 = null;
                stackIn_15_0 = stackOut_14_0;
                return (tm) (Object) stackIn_15_0;
              }
            } else {
              stackOut_2_0 = ((ti) this).field_y;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "ti.D(" + param0 + ')');
        }
        return stackIn_58_0;
    }

    final void d(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 6833) {
              if (((ti) this).field_D != null) {
                L1: {
                  ((ti) this).field_r = true;
                  if (null == ((ti) this).field_j) {
                    ((ti) this).field_j = new md();
                    break L1;
                  } else {
                    break L1;
                  }
                }
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "ti.K(" + param0 + ')');
        }
    }

    final void b(boolean param0) {
        RuntimeException var2 = null;
        ne var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = DungeonAssault.field_K;
        try {
          L0: {
            if (null == ((ti) this).field_j) {
              return;
            } else {
              L1: {
                if (!param0) {
                  break L1;
                } else {
                  ((ti) this).field_y = null;
                  break L1;
                }
              }
              if (null != ((ti) this).a(26538)) {
                var2_ref = ((ti) this).field_u.e(-24172);
                L2: while (true) {
                  L3: {
                    L4: {
                      if (var2_ref == null) {
                        break L4;
                      } else {
                        var3 = (int)var2_ref.field_h;
                        if (var4 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              L7: {
                                if (var3 < 0) {
                                  break L7;
                                } else {
                                  if (~var3 <= ~((ti) this).field_y.field_l) {
                                    break L7;
                                  } else {
                                    if (0 != ((ti) this).field_y.field_k[var3]) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              var2_ref.a(param0);
                              if (var4 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                            L8: {
                              if (((ti) this).field_h[var3] == 0) {
                                vf discarded$2 = this.a((byte) 95, var3, 1);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            L9: {
                              if (((ti) this).field_h[var3] == -1) {
                                vf discarded$3 = this.a((byte) 123, var3, 2);
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            if (((ti) this).field_h[var3] == 1) {
                              var2_ref.a(false);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          var2_ref = ((ti) this).field_u.a(4);
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
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "ti.F(" + param0 + ')');
        }
    }

    final int b(int param0, int param1) {
        vf var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              var3 = (vf) (Object) ((ti) this).field_l.a((long)param0, 8);
              if (param1 == 27318) {
                break L1;
              } else {
                ((ti) this).field_t = null;
                break L1;
              }
            }
            if (null == var3) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = var3.d((byte) 107);
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var3_ref, "ti.B(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final static void c(boolean param0) {
        RuntimeException runtimeException = null;
        i var1 = null;
        md stackIn_6_0 = null;
        i stackIn_6_1 = null;
        md stackIn_8_0 = null;
        i stackIn_8_1 = null;
        md stackIn_9_0 = null;
        i stackIn_9_1 = null;
        int stackIn_9_2 = 0;
        RuntimeException decompiledCaughtException = null;
        md stackOut_5_0 = null;
        i stackOut_5_1 = null;
        md stackOut_8_0 = null;
        i stackOut_8_1 = null;
        int stackOut_8_2 = 0;
        md stackOut_6_0 = null;
        i stackOut_6_1 = null;
        int stackOut_6_2 = 0;
        try {
          L0: {
            if (param0) {
              var1 = (i) (Object) id.field_e.c(0);
              if (var1 != null) {
                L1: {
                  gf.a(var1.field_j, var1.field_i, var1.field_q);
                  gf.e(var1.field_m, var1.field_p, var1.field_z, var1.field_k);
                  var1.field_j = null;
                  stackOut_5_0 = cd.field_g;
                  stackOut_5_1 = (i) var1;
                  stackIn_8_0 = stackOut_5_0;
                  stackIn_8_1 = stackOut_5_1;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  if (param0) {
                    stackOut_8_0 = (md) (Object) stackIn_8_0;
                    stackOut_8_1 = (i) (Object) stackIn_8_1;
                    stackOut_8_2 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    stackIn_9_2 = stackOut_8_2;
                    break L1;
                  } else {
                    stackOut_6_0 = (md) (Object) stackIn_6_0;
                    stackOut_6_1 = (i) (Object) stackIn_6_1;
                    stackOut_6_2 = 1;
                    stackIn_9_0 = stackOut_6_0;
                    stackIn_9_1 = stackOut_6_1;
                    stackIn_9_2 = stackOut_6_2;
                    break L1;
                  }
                }
                ((md) (Object) stackIn_9_0).a((ne) (Object) stackIn_9_1, stackIn_9_2 != 0);
                break L0;
              } else {
                throw new IllegalStateException();
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw vk.a((Throwable) (Object) runtimeException, "ti.G(" + param0 + ')');
        }
    }

    public static void a(boolean param0) {
        field_v = null;
        if (!param0) {
            return;
        }
        try {
            field_A = null;
            field_q = null;
            field_n = null;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "ti.I(" + param0 + ')');
        }
    }

    ti(int param0, ln param1, ln param2, bb param3, cc param4, int param5, byte[] param6, int param7, boolean param8) {
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
        ((ti) this).field_l = new wa(16);
        ((ti) this).field_z = 0;
        ((ti) this).field_u = new md();
        ((ti) this).field_m = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((ti) this).field_p = param0;
                ((ti) this).field_D = param1;
                if (null != ((ti) this).field_D) {
                  break L2;
                } else {
                  ((ti) this).field_x = false;
                  if (DungeonAssault.field_K == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((ti) this).field_x = true;
              ((ti) this).field_j = new md();
              break L1;
            }
            L3: {
              ((ti) this).field_o = param7;
              ((ti) this).field_w = param5;
              ((ti) this).field_g = param2;
              ((ti) this).field_k = param8;
              ((ti) this).field_s = param6;
              ((ti) this).field_B = param4;
              ((ti) this).field_t = param3;
              if (null == ((ti) this).field_g) {
                break L3;
              } else {
                ((ti) this).field_C = (vf) (Object) ((ti) this).field_B.a(((ti) this).field_g, ((ti) this).field_p, -6319);
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
            stackOut_9_1 = new StringBuilder().append("ti.<init>(").append(param0).append(',');
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
          throw vk.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Imps may be small and carry a cheeky, indeed, impish look, but they'll not give a second thought to whether or not to stab your raiders.";
        field_f = false;
        field_v = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
