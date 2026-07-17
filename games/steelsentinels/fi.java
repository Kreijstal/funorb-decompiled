/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi extends fa {
    private vk field_B;
    static String field_s;
    static String field_z;
    static String field_t;
    private byte[] field_o;
    private int field_r;
    private fe field_w;
    private int field_F;
    static int field_l;
    private jl field_A;
    private byte[] field_h;
    static wk field_j;
    private cb field_k;
    private rc field_x;
    static int[] field_g;
    private uh field_m;
    private int field_q;
    static int field_y;
    private rc field_E;
    private boolean field_D;
    private ul field_C;
    private boolean field_v;
    private ul field_i;
    private int field_p;
    private long field_n;
    private boolean field_u;

    private final fe a(byte param0, int param1, int param2) {
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
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        int stackIn_91_0 = 0;
        int stackIn_91_1 = 0;
        Object stackIn_101_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_85_0 = 0;
        int stackOut_85_1 = 0;
        int stackOut_90_0 = 0;
        int stackOut_90_1 = 0;
        Object stackOut_100_0 = null;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        int stackOut_66_0 = 0;
        int stackOut_66_1 = 0;
        L0: {
          var10 = SteelSentinels.field_G;
          var4 = (Object) (Object) (fe) (Object) ((fi) this).field_m.a((long)param1, param0 + 232);
          if (param0 == -109) {
            break L0;
          } else {
            ((fi) this).field_v = true;
            break L0;
          }
        }
        L1: {
          if (var4 == null) {
            break L1;
          } else {
            if (param2 != 0) {
              break L1;
            } else {
              if (((fe) var4).field_B) {
                break L1;
              } else {
                if (!((fe) var4).field_z) {
                  break L1;
                } else {
                  ((fe) var4).b(4);
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
              L4: {
                if (0 == param2) {
                  break L4;
                } else {
                  if (1 == param2) {
                    if (null == ((fi) this).field_E) {
                      throw new RuntimeException();
                    } else {
                      var4 = (Object) (Object) ((fi) this).field_k.a(((fi) this).field_E, param1, 3);
                      if (var10 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  } else {
                    if (param2 == 2) {
                      if (null == ((fi) this).field_E) {
                        throw new RuntimeException();
                      } else {
                        if (-1 != ((fi) this).field_h[param1]) {
                          throw new RuntimeException();
                        } else {
                          if (!((fi) this).field_B.b((byte) 126)) {
                            var4 = (Object) (Object) ((fi) this).field_B.a((byte) 2, ((fi) this).field_r, param1, false, (byte) -94);
                            if (var10 == 0) {
                              break L3;
                            } else {
                              return null;
                            }
                          } else {
                            return null;
                          }
                        }
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                }
              }
              L5: {
                L6: {
                  if (null == ((fi) this).field_E) {
                    break L6;
                  } else {
                    if (((fi) this).field_h[param1] != -1) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                if (!((fi) this).field_B.c(param0 + -15)) {
                  var4 = (Object) (Object) ((fi) this).field_B.a((byte) 2, ((fi) this).field_r, param1, true, (byte) 51);
                  if (var10 == 0) {
                    break L3;
                  } else {
                    break L5;
                  }
                } else {
                  return null;
                }
              }
              var4 = (Object) (Object) ((fi) this).field_k.a(21598, param1, ((fi) this).field_E);
              break L3;
            }
            ((fi) this).field_m.a((long)param1, (ck) var4, -1816);
            break L2;
          } else {
            break L2;
          }
        }
        if (!((fe) var4).field_z) {
          var5 = ((fe) var4).d((byte) -82);
          if (var4 instanceof df) {
            try {
              L7: {
                L8: {
                  if (var5 == null) {
                    break L8;
                  } else {
                    if (var5.length > 2) {
                      f.field_G.reset();
                      f.field_G.update(var5, 0, var5.length + -2);
                      var6_int = (int)f.field_G.getValue();
                      if (((fi) this).field_A.field_a[param1] == var6_int) {
                        L9: {
                          L10: {
                            if (null == ((fi) this).field_A.field_t) {
                              break L10;
                            } else {
                              if (null != ((fi) this).field_A.field_t[param1]) {
                                var7_ref_byte__ = ((fi) this).field_A.field_t[param1];
                                var8 = co.a((byte) -37, -2 + var5.length, 0, var5);
                                var9 = 0;
                                L11: while (true) {
                                  if (var9 >= 64) {
                                    break L10;
                                  } else {
                                    stackOut_85_0 = ~var8[var9];
                                    stackOut_85_1 = ~var7_ref_byte__[var9];
                                    stackIn_91_0 = stackOut_85_0;
                                    stackIn_91_1 = stackOut_85_1;
                                    stackIn_86_0 = stackOut_85_0;
                                    stackIn_86_1 = stackOut_85_1;
                                    if (var10 != 0) {
                                      break L9;
                                    } else {
                                      if (stackIn_86_0 != stackIn_86_1) {
                                        throw new RuntimeException();
                                      } else {
                                        var9++;
                                        continue L11;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L10;
                              }
                            }
                          }
                          stackOut_90_0 = (var5[-2 + var5.length] & 255) << 8;
                          stackOut_90_1 = var5[-1 + var5.length] & 255;
                          stackIn_91_0 = stackOut_90_0;
                          stackIn_91_1 = stackOut_90_1;
                          break L9;
                        }
                        var7 = stackIn_91_0 + stackIn_91_1;
                        if ((((fi) this).field_A.field_m[param1] & 65535) == var7) {
                          L12: {
                            if (((fi) this).field_h[param1] == 1) {
                              break L12;
                            } else {
                              L13: {
                                if (0 != ((fi) this).field_h[param1]) {
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              ((fi) this).field_h[param1] = (byte) 1;
                              break L12;
                            }
                          }
                          L14: {
                            if (!((fe) var4).field_B) {
                              ((fe) var4).b(4);
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                          stackOut_100_0 = var4;
                          stackIn_101_0 = stackOut_100_0;
                          break L7;
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      break L8;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6_ref = (Exception) (Object) decompiledCaughtException;
              ((fi) this).field_h[param1] = (byte) -1;
              ((fe) var4).b(param0 ^ -105);
              if (!((fe) var4).field_B) {
                return null;
              } else {
                L15: {
                  if (!((fi) this).field_B.c(62)) {
                    var4 = (Object) (Object) ((fi) this).field_B.a((byte) 2, ((fi) this).field_r, param1, true, (byte) 55);
                    ((fi) this).field_m.a((long)param1, (ck) var4, -1816);
                    break L15;
                  } else {
                    break L15;
                  }
                }
                return null;
              }
            }
            return (fe) (Object) stackIn_101_0;
          } else {
            try {
              L16: {
                L17: {
                  if (var5 == null) {
                    break L17;
                  } else {
                    if (2 >= var5.length) {
                      break L17;
                    } else {
                      f.field_G.reset();
                      f.field_G.update(var5, 0, var5.length + -2);
                      var6_int = (int)f.field_G.getValue();
                      if (var6_int != ((fi) this).field_A.field_a[param1]) {
                        throw new RuntimeException();
                      } else {
                        L18: {
                          L19: {
                            if (null == ((fi) this).field_A.field_t) {
                              break L19;
                            } else {
                              if (null != ((fi) this).field_A.field_t[param1]) {
                                var7_ref_byte__ = ((fi) this).field_A.field_t[param1];
                                var8 = co.a((byte) -37, var5.length - 2, 0, var5);
                                var9 = 0;
                                L20: while (true) {
                                  if (var9 >= 64) {
                                    break L19;
                                  } else {
                                    stackOut_51_0 = ~var7_ref_byte__[var9];
                                    stackOut_51_1 = ~var8[var9];
                                    stackIn_67_0 = stackOut_51_0;
                                    stackIn_67_1 = stackOut_51_1;
                                    stackIn_52_0 = stackOut_51_0;
                                    stackIn_52_1 = stackOut_51_1;
                                    if (var10 != 0) {
                                      decompiledRegionSelector0 = 1;
                                      break L16;
                                    } else {
                                      if (stackIn_52_0 != stackIn_52_1) {
                                        throw new RuntimeException();
                                      } else {
                                        var9++;
                                        if (var10 == 0) {
                                          continue L20;
                                        } else {
                                          break L19;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                ((fi) this).field_B.field_f = 0;
                                ((fi) this).field_B.field_t = 0;
                                break L18;
                              }
                            }
                          }
                          ((fi) this).field_B.field_f = 0;
                          ((fi) this).field_B.field_t = 0;
                          break L18;
                        }
                        decompiledRegionSelector0 = 0;
                        break L16;
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var6 = (RuntimeException) (Object) decompiledCaughtException;
              ((fi) this).field_B.a(14900);
              ((fe) var4).b(4);
              if (((fe) var4).field_B) {
                if (((fi) this).field_B.c(-93)) {
                  return null;
                } else {
                  var4 = (Object) (Object) ((fi) this).field_B.a((byte) 2, ((fi) this).field_r, param1, true, (byte) -128);
                  ((fi) this).field_m.a((long)param1, (ck) var4, -1816);
                  return null;
                }
              } else {
                return null;
              }
            }
            L21: {
              L22: {
                if (decompiledRegionSelector0 == 0) {
                  var5[-2 + var5.length] = (byte)(((fi) this).field_A.field_m[param1] >>> 8);
                  var5[var5.length - 1] = (byte)((fi) this).field_A.field_m[param1];
                  if (null == ((fi) this).field_E) {
                    break L21;
                  } else {
                    df discarded$1 = ((fi) this).field_k.a((byte) 98, ((fi) this).field_E, param1, var5);
                    stackOut_66_0 = -2;
                    stackOut_66_1 = ~((fi) this).field_h[param1];
                    stackIn_67_0 = stackOut_66_0;
                    stackIn_67_1 = stackOut_66_1;
                    break L22;
                  }
                } else {
                  break L22;
                }
              }
              if (stackIn_67_0 != stackIn_67_1) {
                ((fi) this).field_h[param1] = (byte) 1;
                break L21;
              } else {
                break L21;
              }
            }
            L23: {
              if (!((fe) var4).field_B) {
                ((fe) var4).b(4);
                break L23;
              } else {
                break L23;
              }
            }
            return (fe) var4;
          }
        } else {
          return null;
        }
    }

    final void d(int param0) {
        ck var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = SteelSentinels.field_G;
        if (null != ((fi) this).field_C) {
          if (null == ((fi) this).b((byte) 114)) {
            return;
          } else {
            var2 = ((fi) this).field_i.e(13058);
            var3 = 51 / ((55 - param0) / 37);
            L0: while (true) {
              L1: {
                if (var2 == null) {
                  break L1;
                } else {
                  var4 = (int)var2.field_j;
                  if (var5 != 0) {
                    break L1;
                  } else {
                    L2: {
                      L3: {
                        L4: {
                          if (0 > var4) {
                            break L4;
                          } else {
                            if (((fi) this).field_A.field_u <= var4) {
                              break L4;
                            } else {
                              if (0 != ((fi) this).field_A.field_j[var4]) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        var2.b(4);
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                      L5: {
                        if (((fi) this).field_h[var4] == 0) {
                          fe discarded$2 = this.a((byte) -109, var4, 1);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        if (-1 == ((fi) this).field_h[var4]) {
                          fe discarded$3 = this.a((byte) -109, var4, 2);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      if (((fi) this).field_h[var4] == 1) {
                        var2.b(4);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var2 = ((fi) this).field_i.a((byte) -126);
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    public static void c(int param0) {
        field_s = null;
        field_t = null;
        field_j = null;
        field_g = null;
        field_z = null;
        field_z = null;
    }

    final static e a(int param0, String param1, int param2) {
        e var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        e stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        e stackOut_2_0 = null;
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
              var3 = new e(false);
              var3.field_e = param1;
              if (param0 >= 4) {
                break L1;
              } else {
                var4 = null;
                e discarded$2 = fi.a(-111, (String) null, 49);
                break L1;
              }
            }
            var3.field_a = 49;
            stackOut_2_0 = (e) var3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3_ref;
            stackOut_4_1 = new StringBuilder().append("fi.H(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
          throw ci.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + 49 + 41);
        }
        return stackIn_3_0;
    }

    final jl b(byte param0) {
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = SteelSentinels.field_G;
        if (param0 == 114) {
          if (null != ((fi) this).field_A) {
            return ((fi) this).field_A;
          } else {
            L0: {
              if (((fi) this).field_w != null) {
                break L0;
              } else {
                if (!((fi) this).field_B.c(param0 ^ -8)) {
                  ((fi) this).field_w = (fe) (Object) ((fi) this).field_B.a((byte) 0, 255, ((fi) this).field_r, true, (byte) -114);
                  break L0;
                } else {
                  return null;
                }
              }
            }
            if (!((fi) this).field_w.field_z) {
              L1: {
                L2: {
                  var5 = ((fi) this).field_w.d((byte) -52);
                  var2 = var5;
                  if (((fi) this).field_w instanceof df) {
                    break L2;
                  } else {
                    try {
                      L3: {
                        if (var5 == null) {
                          throw new RuntimeException();
                        } else {
                          ((fi) this).field_A = new jl(var5, ((fi) this).field_F, ((fi) this).field_o);
                          break L3;
                        }
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var3 = decompiledCaughtException;
                      ((fi) this).field_B.a(14900);
                      ((fi) this).field_A = null;
                      if (((fi) this).field_B.c(89)) {
                        ((fi) this).field_w = null;
                        if (var4 == 0) {
                          return null;
                        } else {
                          ((fi) this).field_w = (fe) (Object) ((fi) this).field_B.a((byte) 0, 255, ((fi) this).field_r, true, (byte) -127);
                          return null;
                        }
                      } else {
                        ((fi) this).field_w = (fe) (Object) ((fi) this).field_B.a((byte) 0, 255, ((fi) this).field_r, true, (byte) -127);
                        return null;
                      }
                    }
                    if (null == ((fi) this).field_x) {
                      break L1;
                    } else {
                      df discarded$1 = ((fi) this).field_k.a((byte) 78, ((fi) this).field_x, ((fi) this).field_r, var5);
                      if (var4 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                try {
                  L4: {
                    if (var5 == null) {
                      throw new RuntimeException();
                    } else {
                      ((fi) this).field_A = new jl(var5, ((fi) this).field_F, ((fi) this).field_o);
                      if (((fi) this).field_q != ((fi) this).field_A.field_k) {
                        throw new RuntimeException();
                      } else {
                        break L4;
                      }
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var3 = decompiledCaughtException;
                  ((fi) this).field_A = null;
                  if (!((fi) this).field_B.c(62)) {
                    ((fi) this).field_w = (fe) (Object) ((fi) this).field_B.a((byte) 0, 255, ((fi) this).field_r, true, (byte) 33);
                    if (var4 == 0) {
                      return null;
                    } else {
                      ((fi) this).field_w = null;
                      return null;
                    }
                  } else {
                    ((fi) this).field_w = null;
                    return null;
                  }
                }
                break L1;
              }
              L5: {
                ((fi) this).field_w = null;
                if (null != ((fi) this).field_E) {
                  ((fi) this).field_h = new byte[((fi) this).field_A.field_u];
                  break L5;
                } else {
                  break L5;
                }
              }
              return ((fi) this).field_A;
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final void c(byte param0) {
        int var2_int = 0;
        fe var2 = null;
        ck var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_11_0 = 0;
        byte stackIn_11_1 = 0;
        int stackIn_20_0 = 0;
        byte stackIn_20_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_51_0 = 0;
        byte stackIn_59_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_120_0 = 0;
        int stackIn_121_0 = 0;
        int stackOut_10_0 = 0;
        byte stackOut_10_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_50_0 = 0;
        byte stackOut_58_0 = 0;
        int stackOut_119_0 = 0;
        int stackOut_120_0 = 0;
        int stackOut_123_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_79_0 = 0;
        L0: {
          var5 = SteelSentinels.field_G;
          if (param0 < -56) {
            break L0;
          } else {
            fe discarded$7 = this.a((byte) -11, 3, -96);
            break L0;
          }
        }
        L1: {
          if (null != ((fi) this).field_C) {
            if (((fi) this).b((byte) 114) != null) {
              L2: {
                if (((fi) this).field_D) {
                  break L2;
                } else {
                  L3: {
                    if (!((fi) this).field_v) {
                      break L3;
                    } else {
                      var2_int = 1;
                      var3 = ((fi) this).field_C.e(13058);
                      L4: while (true) {
                        L5: {
                          L6: {
                            L7: {
                              if (var3 == null) {
                                break L7;
                              } else {
                                var4 = (int)var3.field_j;
                                stackOut_10_0 = 1;
                                stackOut_10_1 = ((fi) this).field_h[var4];
                                stackIn_20_0 = stackOut_10_0;
                                stackIn_20_1 = stackOut_10_1;
                                stackIn_11_0 = stackOut_10_0;
                                stackIn_11_1 = stackOut_10_1;
                                if (var5 != 0) {
                                  if (stackIn_20_0 <= stackIn_20_1) {
                                    break L6;
                                  } else {
                                    stackOut_21_0 = ((fi) this).field_A.field_j[((fi) this).field_p];
                                    stackIn_51_0 = stackOut_21_0;
                                    stackIn_22_0 = stackOut_21_0;
                                    if (var5 != 0) {
                                      break L5;
                                    } else {
                                      L8: {
                                        if (stackIn_22_0 == 0) {
                                          ((fi) this).field_p = ((fi) this).field_p + 1;
                                          if (var5 == 0) {
                                            break L7;
                                          } else {
                                            break L8;
                                          }
                                        } else {
                                          break L8;
                                        }
                                      }
                                      L9: {
                                        if (((fi) this).field_B.b((byte) 102)) {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L6;
                                          } else {
                                            break L9;
                                          }
                                        } else {
                                          break L9;
                                        }
                                      }
                                      L10: {
                                        if (-2 != ((fi) this).field_h[((fi) this).field_p]) {
                                          fe discarded$8 = this.a((byte) -109, ((fi) this).field_p, 2);
                                          break L10;
                                        } else {
                                          break L10;
                                        }
                                      }
                                      L11: {
                                        if (-2 == ((fi) this).field_h[((fi) this).field_p]) {
                                          break L11;
                                        } else {
                                          var3 = new ck();
                                          var3.field_j = (long)((fi) this).field_p;
                                          ((fi) this).field_C.a(3, var3);
                                          var2_int = 0;
                                          break L11;
                                        }
                                      }
                                      ((fi) this).field_p = ((fi) this).field_p + 1;
                                      if (var5 == 0) {
                                        break L7;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                } else {
                                  L12: {
                                    if (stackIn_11_0 != stackIn_11_1) {
                                      fe discarded$9 = this.a((byte) -109, var4, 2);
                                      break L12;
                                    } else {
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    L14: {
                                      if (((fi) this).field_h[var4] != 1) {
                                        break L14;
                                      } else {
                                        var3.b(4);
                                        if (var5 == 0) {
                                          break L13;
                                        } else {
                                          break L14;
                                        }
                                      }
                                    }
                                    var2_int = 0;
                                    break L13;
                                  }
                                  var3 = ((fi) this).field_C.a((byte) -19);
                                  continue L4;
                                }
                              }
                            }
                            L15: while (true) {
                              if (((fi) this).field_A.field_j.length <= ((fi) this).field_p) {
                                break L6;
                              } else {
                                stackOut_37_0 = ((fi) this).field_A.field_j[((fi) this).field_p];
                                stackIn_51_0 = stackOut_37_0;
                                stackIn_38_0 = stackOut_37_0;
                                if (var5 != 0) {
                                  break L5;
                                } else {
                                  L16: {
                                    if (stackIn_38_0 == 0) {
                                      break L16;
                                    } else {
                                      L17: {
                                        if (((fi) this).field_B.b((byte) 102)) {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L6;
                                          } else {
                                            break L17;
                                          }
                                        } else {
                                          break L17;
                                        }
                                      }
                                      L18: {
                                        if (-2 != ((fi) this).field_h[((fi) this).field_p]) {
                                          fe discarded$10 = this.a((byte) -109, ((fi) this).field_p, 2);
                                          break L18;
                                        } else {
                                          break L18;
                                        }
                                      }
                                      if (-2 == ((fi) this).field_h[((fi) this).field_p]) {
                                        break L16;
                                      } else {
                                        var3 = new ck();
                                        var3.field_j = (long)((fi) this).field_p;
                                        ((fi) this).field_C.a(3, var3);
                                        var2_int = 0;
                                        break L16;
                                      }
                                    }
                                  }
                                  ((fi) this).field_p = ((fi) this).field_p + 1;
                                  continue L15;
                                }
                              }
                            }
                          }
                          stackOut_50_0 = var2_int;
                          stackIn_51_0 = stackOut_50_0;
                          break L5;
                        }
                        L19: {
                          if (stackIn_51_0 == 0) {
                            break L19;
                          } else {
                            ((fi) this).field_v = false;
                            ((fi) this).field_p = 0;
                            break L19;
                          }
                        }
                        if (var5 == 0) {
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  ((fi) this).field_C = null;
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var2_int = 1;
              var3 = ((fi) this).field_C.e(13058);
              L20: while (true) {
                L21: {
                  L22: {
                    L23: {
                      if (var3 == null) {
                        break L23;
                      } else {
                        var4 = (int)var3.field_j;
                        stackOut_58_0 = ((fi) this).field_h[var4];
                        stackIn_121_0 = stackOut_58_0;
                        stackIn_59_0 = stackOut_58_0;
                        if (var5 != 0) {
                          L24: while (true) {
                            if (stackIn_121_0 >= ((fi) this).field_A.field_j.length) {
                              break L22;
                            } else {
                              stackOut_119_0 = 0;
                              stackIn_80_0 = stackOut_119_0;
                              stackIn_120_0 = stackOut_119_0;
                              if (var5 != 0) {
                                break L21;
                              } else {
                                stackOut_120_0 = stackIn_120_0;
                                stackIn_117_0 = stackOut_120_0;
                                L25: {
                                  L26: {
                                    if (stackIn_117_0 != ((fi) this).field_A.field_j[((fi) this).field_p]) {
                                      break L26;
                                    } else {
                                      ((fi) this).field_p = ((fi) this).field_p + 1;
                                      if (var5 == 0) {
                                        break L25;
                                      } else {
                                        break L26;
                                      }
                                    }
                                  }
                                  L27: {
                                    if (((fi) this).field_k.field_f < 250) {
                                      break L27;
                                    } else {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L22;
                                      } else {
                                        break L27;
                                      }
                                    }
                                  }
                                  L28: {
                                    if (((fi) this).field_h[((fi) this).field_p] == 0) {
                                      fe discarded$11 = this.a((byte) -109, ((fi) this).field_p, 1);
                                      break L28;
                                    } else {
                                      break L28;
                                    }
                                  }
                                  L29: {
                                    if (((fi) this).field_h[((fi) this).field_p] != 0) {
                                      break L29;
                                    } else {
                                      var3 = new ck();
                                      var3.field_j = (long)((fi) this).field_p;
                                      ((fi) this).field_C.a(3, var3);
                                      var2_int = 0;
                                      break L29;
                                    }
                                  }
                                  ((fi) this).field_p = ((fi) this).field_p + 1;
                                  if (var5 == 0) {
                                    break L25;
                                  } else {
                                    break L22;
                                  }
                                }
                                stackOut_123_0 = ((fi) this).field_p;
                                stackIn_121_0 = stackOut_123_0;
                                continue L24;
                              }
                            }
                          }
                        } else {
                          L30: {
                            if (stackIn_59_0 != 0) {
                              break L30;
                            } else {
                              fe discarded$12 = this.a((byte) -109, var4, 1);
                              break L30;
                            }
                          }
                          L31: {
                            L32: {
                              if (((fi) this).field_h[var4] != 0) {
                                break L32;
                              } else {
                                var2_int = 0;
                                if (var5 == 0) {
                                  break L31;
                                } else {
                                  break L32;
                                }
                              }
                            }
                            var3.b(4);
                            break L31;
                          }
                          var3 = ((fi) this).field_C.a((byte) -101);
                          if (var5 == 0) {
                            continue L20;
                          } else {
                            break L23;
                          }
                        }
                      }
                    }
                    L33: while (true) {
                      if (((fi) this).field_p >= ((fi) this).field_A.field_j.length) {
                        break L22;
                      } else {
                        stackOut_67_0 = 0;
                        stackIn_80_0 = stackOut_67_0;
                        stackIn_68_0 = stackOut_67_0;
                        if (var5 != 0) {
                          break L21;
                        } else {
                          L34: {
                            if (stackIn_68_0 != ((fi) this).field_A.field_j[((fi) this).field_p]) {
                              break L34;
                            } else {
                              ((fi) this).field_p = ((fi) this).field_p + 1;
                              if (var5 == 0) {
                                continue L33;
                              } else {
                                break L34;
                              }
                            }
                          }
                          L35: {
                            if (((fi) this).field_k.field_f < 250) {
                              break L35;
                            } else {
                              var2_int = 0;
                              if (var5 == 0) {
                                break L22;
                              } else {
                                break L35;
                              }
                            }
                          }
                          L36: {
                            if (((fi) this).field_h[((fi) this).field_p] == 0) {
                              fe discarded$13 = this.a((byte) -109, ((fi) this).field_p, 1);
                              break L36;
                            } else {
                              break L36;
                            }
                          }
                          L37: {
                            if (((fi) this).field_h[((fi) this).field_p] != 0) {
                              break L37;
                            } else {
                              var3 = new ck();
                              var3.field_j = (long)((fi) this).field_p;
                              ((fi) this).field_C.a(3, var3);
                              var2_int = 0;
                              break L37;
                            }
                          }
                          ((fi) this).field_p = ((fi) this).field_p + 1;
                          if (var5 == 0) {
                            continue L33;
                          } else {
                            break L22;
                          }
                        }
                      }
                    }
                  }
                  stackOut_79_0 = var2_int;
                  stackIn_80_0 = stackOut_79_0;
                  break L21;
                }
                if (stackIn_80_0 == 0) {
                  break L1;
                } else {
                  ((fi) this).field_D = false;
                  ((fi) this).field_p = 0;
                  break L1;
                }
              }
            } else {
              return;
            }
          } else {
            break L1;
          }
        }
        if (((fi) this).field_u) {
          if (mm.a(-109) >= ((fi) this).field_n) {
            var2 = (fe) (Object) ((fi) this).field_m.b(0);
            L38: while (true) {
              if (var2 != null) {
                if (var5 == 0) {
                  L39: {
                    if (var2.field_z) {
                      break L39;
                    } else {
                      L40: {
                        if (var2.field_C) {
                          break L40;
                        } else {
                          var2.field_C = true;
                          if (var5 == 0) {
                            break L39;
                          } else {
                            break L40;
                          }
                        }
                      }
                      if (var2.field_B) {
                        var2.b(4);
                        break L39;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                  var2 = (fe) (Object) ((fi) this).field_m.a((byte) 127);
                  continue L38;
                } else {
                  return;
                }
              } else {
                ((fi) this).field_n = 1000L + mm.a(-89);
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final byte[] a(int param0, int param1) {
        fe var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        var3 = this.a((byte) -109, param0, 0);
        if (var3 == null) {
          return null;
        } else {
          var4 = -50 % ((40 - param1) / 32);
          var5 = var3.d((byte) -80);
          var3.b(4);
          return var5;
        }
    }

    final int a(boolean param0, int param1) {
        fe var3 = null;
        var3 = (fe) (Object) ((fi) this).field_m.a((long)param1, 127);
        if (var3 != null) {
          return var3.g(16);
        } else {
          if (param0) {
            ((fi) this).field_C = null;
            return 0;
          } else {
            return 0;
          }
        }
    }

    final void d(byte param0) {
        if (null == ((fi) this).field_E) {
          return;
        } else {
          L0: {
            ((fi) this).field_v = true;
            if (param0 == 74) {
              break L0;
            } else {
              ((fi) this).field_r = -97;
              break L0;
            }
          }
          L1: {
            if (((fi) this).field_C != null) {
              break L1;
            } else {
              ((fi) this).field_C = new ul();
              break L1;
            }
          }
          return;
        }
    }

    final static String e(int param0) {
        int var1 = -29 % ((-61 - param0) / 57);
        String var2 = "";
        if (!(jd.field_kb == null)) {
            var2 = jd.field_kb.h((byte) -70);
        }
        if (0 == var2.length()) {
            var2 = wa.a((byte) -43);
        }
        if (!(var2.length() != 0)) {
            var2 = un.field_a;
        }
        return var2;
    }

    final static int a(boolean param0) {
        if (2 <= nj.field_Q) {
          if (dh.field_D != 0) {
            L0: {
              if (ok.field_f != null) {
                if (ok.field_f.a(param0)) {
                  if (ok.field_f.a(12145, "")) {
                    if (!ok.field_f.a("", (byte) 90)) {
                      return 29;
                    } else {
                      break L0;
                    }
                  } else {
                    return 29;
                  }
                } else {
                  return 14;
                }
              } else {
                break L0;
              }
            }
            if (!ke.field_k.a(true)) {
              return 43;
            } else {
              if (ke.field_k.a("commonui", (byte) 90)) {
                if (oe.field_d.a(true)) {
                  if (oe.field_d.a("commonui", (byte) 90)) {
                    if (id.field_bc.a(true)) {
                      if (!id.field_bc.a(25)) {
                        return 86;
                      } else {
                        L1: {
                          if (param0) {
                            break L1;
                          } else {
                            fi.c(-55);
                            break L1;
                          }
                        }
                        return 100;
                      }
                    } else {
                      return 82;
                    }
                  } else {
                    return 80;
                  }
                } else {
                  return 71;
                }
              } else {
                return 57;
              }
            }
          } else {
            if (!ke.field_k.a(true)) {
              return 20;
            } else {
              if (!ke.field_k.a("commonui", (byte) 90)) {
                return 40;
              } else {
                if (!oe.field_d.a(true)) {
                  return 50;
                } else {
                  if (oe.field_d.a("commonui", (byte) 90)) {
                    if (!id.field_bc.a(true)) {
                      return 70;
                    } else {
                      if (!id.field_bc.a(25)) {
                        return 80;
                      } else {
                        L2: {
                          if (param0) {
                            break L2;
                          } else {
                            fi.c(-55);
                            break L2;
                          }
                        }
                        return 100;
                      }
                    }
                  } else {
                    return 60;
                  }
                }
              }
            }
          }
        } else {
          return 0;
        }
    }

    fi(int param0, rc param1, rc param2, vk param3, cb param4, int param5, byte[] param6, int param7, boolean param8) {
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
        ((fi) this).field_m = new uh(16);
        ((fi) this).field_p = 0;
        ((fi) this).field_i = new ul();
        ((fi) this).field_n = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((fi) this).field_E = param1;
                ((fi) this).field_r = param0;
                if (((fi) this).field_E != null) {
                  break L2;
                } else {
                  ((fi) this).field_D = false;
                  if (SteelSentinels.field_G == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((fi) this).field_D = true;
              ((fi) this).field_C = new ul();
              break L1;
            }
            L3: {
              ((fi) this).field_x = param2;
              ((fi) this).field_k = param4;
              ((fi) this).field_F = param5;
              ((fi) this).field_q = param7;
              ((fi) this).field_B = param3;
              ((fi) this).field_o = param6;
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
              ((fi) this).field_u = stackIn_7_1 != 0;
              if (((fi) this).field_x == null) {
                break L4;
              } else {
                ((fi) this).field_w = (fe) (Object) ((fi) this).field_k.a(21598, ((fi) this).field_r, ((fi) this).field_x);
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
            stackOut_10_1 = new StringBuilder().append("fi.<init>(").append(param0).append(44);
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
          throw ci.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param7 + 44 + param8 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "ADVANCED";
        field_s = "Accept";
        field_y = 2;
    }
}
