/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tp extends bb {
    static String field_z;
    static ef field_B;
    static String[] field_A;
    private rk field_D;
    static String field_u;
    static String[] field_C;
    static String field_w;
    static ad field_y;
    static String field_v;
    static String field_x;

    public static void h(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_C = null;
              field_y = null;
              field_u = null;
              field_z = null;
              field_B = null;
              field_x = null;
              field_w = null;
              field_A = null;
              if (param0 >= 0) {
                break L1;
              } else {
                field_B = null;
                break L1;
              }
            }
            field_v = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var1, "tp.N(" + param0 + ')');
        }
    }

    final void f(int param0) {
        int var2_int = 0;
        Exception var2 = null;
        RuntimeException var2_ref = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            try {
              L1: {
                ((tp) this).field_D.c(-6624);
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2 = (Exception) (Object) decompiledCaughtException;
                break L2;
              }
            }
            ((tp) this).field_c = -1;
            ((tp) this).field_D = null;
            var2_int = 57 % ((-81 - param0) / 36);
            ((tp) this).field_h = ((tp) this).field_h + 1;
            ((tp) this).field_j = (byte)(int)(1.0 + 255.0 * Math.random());
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2_ref, "tp.A(" + param0 + ')');
        }
    }

    final static boolean c(byte param0) {
        RuntimeException var1 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 < -10) {
              stackOut_3_0 = in.field_E;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var1, "tp.L(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void a(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != ((tp) this).field_D) {
                ((tp) this).field_D.c(-6624);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == -1016) {
                break L2;
              } else {
                field_u = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "tp.K(" + param0 + ')');
        }
    }

    final boolean b(byte param0) {
        try {
            IOException var2 = null;
            RuntimeException var2_ref = null;
            long var2_long = 0L;
            em var2_ref2 = null;
            int var2_int = 0;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            Exception var5_ref_Exception = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            long var12 = 0L;
            Object var14 = null;
            em var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_23_0 = 0;
            int stackIn_25_0 = 0;
            int stackIn_28_0 = 0;
            int stackIn_41_0 = 0;
            int stackIn_102_0 = 0;
            int stackIn_106_0 = 0;
            int stackIn_108_0 = 0;
            int stackIn_118_0 = 0;
            int stackIn_130_0 = 0;
            int stackIn_134_0 = 0;
            int stackIn_151_0 = 0;
            int stackIn_161_0 = 0;
            int stackIn_163_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_40_0 = 0;
            int stackOut_101_0 = 0;
            int stackOut_99_0 = 0;
            int stackOut_117_0 = 0;
            int stackOut_105_0 = 0;
            int stackOut_106_0 = 0;
            int stackOut_129_0 = 0;
            int stackOut_133_0 = 0;
            int stackOut_131_0 = 0;
            int stackOut_150_0 = 0;
            int stackOut_27_0 = 0;
            int stackOut_22_0 = 0;
            int stackOut_24_0 = 0;
            int stackOut_162_0 = 0;
            int stackOut_160_0 = 0;
            var16 = DungeonAssault.field_K;
            try {
              L0: {
                if (null != ((tp) this).field_D) {
                  L1: {
                    var2_long = kd.c(-2456);
                    var4 = (int)(-((tp) this).field_n + var2_long);
                    ((tp) this).field_n = var2_long;
                    if (var4 > 200) {
                      var4 = 200;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  ((tp) this).field_a = ((tp) this).field_a + var4;
                  if (((tp) this).field_a > 30000) {
                    try {
                      L2: {
                        ((tp) this).field_D.c(-6624);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    ((tp) this).field_D = null;
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  break L0;
                }
              }
              if (null != ((tp) this).field_D) {
                if (param0 > 6) {
                  ((tp) this).field_D.b(-89);
                  var2_ref2 = (em) (Object) ((tp) this).field_g.c(13395);
                  L4: while (true) {
                    L5: {
                      L6: {
                        if (var2_ref2 == null) {
                          break L6;
                        } else {
                          ((tp) this).field_o.field_o = 0;
                          ((tp) this).field_o.a(6, 1);
                          ((tp) this).field_o.a(var2_ref2.field_o, 836);
                          ((tp) this).field_D.b(((tp) this).field_o.field_m, false, 0, ((tp) this).field_o.field_m.length);
                          ((tp) this).field_p.a((ll) (Object) var2_ref2, -32711);
                          var2_ref2 = (em) (Object) ((tp) this).field_g.a((byte) 111);
                          if (var16 != 0) {
                            break L5;
                          } else {
                            if (var16 == 0) {
                              continue L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      var2_ref2 = (em) (Object) ((tp) this).field_d.c(13395);
                      break L5;
                    }
                    L7: while (true) {
                      L8: {
                        if (var2_ref2 == null) {
                          break L8;
                        } else {
                          ((tp) this).field_o.field_o = 0;
                          ((tp) this).field_o.a(6, 0);
                          ((tp) this).field_o.a(var2_ref2.field_o, 836);
                          ((tp) this).field_D.b(((tp) this).field_o.field_m, false, 0, ((tp) this).field_o.field_m.length);
                          ((tp) this).field_s.a((ll) (Object) var2_ref2, -32711);
                          var2_ref2 = (em) (Object) ((tp) this).field_d.a((byte) 102);
                          if (var16 == 0) {
                            continue L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                      var2_int = 0;
                      L9: while (true) {
                        L10: {
                          L11: {
                            if (var2_int >= 100) {
                              break L11;
                            } else {
                              var3_int = ((tp) this).field_D.a(0);
                              stackOut_40_0 = -1;
                              stackIn_151_0 = stackOut_40_0;
                              stackIn_41_0 = stackOut_40_0;
                              if (var16 != 0) {
                                break L10;
                              } else {
                                if (stackIn_41_0 >= ~var3_int) {
                                  if (var3_int == 0) {
                                    break L11;
                                  } else {
                                    L12: {
                                      L13: {
                                        ((tp) this).field_a = 0;
                                        var4 = 0;
                                        if (null != ((tp) this).field_i) {
                                          break L13;
                                        } else {
                                          var4 = 10;
                                          if (var16 == 0) {
                                            break L12;
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                      if (((tp) this).field_i.field_G == 0) {
                                        var4 = 1;
                                        break L12;
                                      } else {
                                        break L12;
                                      }
                                    }
                                    L14: {
                                      L15: {
                                        if (var4 > 0) {
                                          break L15;
                                        } else {
                                          L16: {
                                            var5 = ((tp) this).field_i.field_D.field_m.length + -((tp) this).field_i.field_E;
                                            var6 = 512 - ((tp) this).field_i.field_G;
                                            if (~var6 >= ~(var5 + -((tp) this).field_i.field_D.field_o)) {
                                              break L16;
                                            } else {
                                              var6 = -((tp) this).field_i.field_D.field_o + var5;
                                              break L16;
                                            }
                                          }
                                          L17: {
                                            if (var3_int < var6) {
                                              var6 = var3_int;
                                              break L17;
                                            } else {
                                              break L17;
                                            }
                                          }
                                          L18: {
                                            L19: {
                                              ((tp) this).field_D.a(((tp) this).field_i.field_D.field_m, false, var6, ((tp) this).field_i.field_D.field_o);
                                              if (((tp) this).field_j != 0) {
                                                var7 = 0;
                                                L20: while (true) {
                                                  if (~var6 >= ~var7) {
                                                    break L19;
                                                  } else {
                                                    ((tp) this).field_i.field_D.field_m[((tp) this).field_i.field_D.field_o - -var7] = (byte)md.b((int) ((tp) this).field_i.field_D.field_m[((tp) this).field_i.field_D.field_o + var7], (int) ((tp) this).field_j);
                                                    var7++;
                                                    if (var16 != 0) {
                                                      break L18;
                                                    } else {
                                                      if (var16 == 0) {
                                                        continue L20;
                                                      } else {
                                                        break L19;
                                                      }
                                                    }
                                                  }
                                                }
                                              } else {
                                                break L19;
                                              }
                                            }
                                            ((tp) this).field_i.field_G = ((tp) this).field_i.field_G + var6;
                                            ((tp) this).field_i.field_D.field_o = ((tp) this).field_i.field_D.field_o + var6;
                                            break L18;
                                          }
                                          L21: {
                                            if (~((tp) this).field_i.field_D.field_o != ~var5) {
                                              break L21;
                                            } else {
                                              ((tp) this).field_i.b((byte) -2);
                                              ((tp) this).field_i.field_v = false;
                                              ((tp) this).field_i = null;
                                              if (var16 == 0) {
                                                break L14;
                                              } else {
                                                break L21;
                                              }
                                            }
                                          }
                                          if (((tp) this).field_i.field_G == 512) {
                                            ((tp) this).field_i.field_G = 0;
                                            if (var16 == 0) {
                                              break L14;
                                            } else {
                                              break L15;
                                            }
                                          } else {
                                            break L14;
                                          }
                                        }
                                      }
                                      L22: {
                                        var5 = var4 + -((tp) this).field_m.field_o;
                                        if (~var3_int > ~var5) {
                                          var5 = var3_int;
                                          break L22;
                                        } else {
                                          break L22;
                                        }
                                      }
                                      L23: {
                                        L24: {
                                          ((tp) this).field_D.a(((tp) this).field_m.field_m, false, var5, ((tp) this).field_m.field_o);
                                          if (((tp) this).field_j == 0) {
                                            break L24;
                                          } else {
                                            var6 = 0;
                                            L25: while (true) {
                                              if (~var6 <= ~var5) {
                                                break L24;
                                              } else {
                                                ((tp) this).field_m.field_m[var6 + ((tp) this).field_m.field_o] = (byte)md.b((int) ((tp) this).field_m.field_m[var6 + ((tp) this).field_m.field_o], (int) ((tp) this).field_j);
                                                var6++;
                                                if (var16 != 0) {
                                                  break L23;
                                                } else {
                                                  if (var16 == 0) {
                                                    continue L25;
                                                  } else {
                                                    break L24;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        ((tp) this).field_m.field_o = ((tp) this).field_m.field_o + var5;
                                        break L23;
                                      }
                                      if (var4 > ((tp) this).field_m.field_o) {
                                        break L14;
                                      } else {
                                        L26: {
                                          if (((tp) this).field_i != null) {
                                            break L26;
                                          } else {
                                            L27: {
                                              ((tp) this).field_m.field_o = 0;
                                              var6 = ((tp) this).field_m.c(true);
                                              var7 = ((tp) this).field_m.h(-87);
                                              var8 = ((tp) this).field_m.c(true);
                                              var9 = ((tp) this).field_m.h(-100);
                                              var10 = var8 & 127;
                                              if ((128 & var8) == 0) {
                                                stackOut_101_0 = 0;
                                                stackIn_102_0 = stackOut_101_0;
                                                break L27;
                                              } else {
                                                stackOut_99_0 = 1;
                                                stackIn_102_0 = stackOut_99_0;
                                                break L27;
                                              }
                                            }
                                            L28: {
                                              L29: {
                                                var11 = stackIn_102_0;
                                                var12 = (long)var7 + ((long)var6 << -1492136096);
                                                var14 = null;
                                                if (var11 == 0) {
                                                  var14_ref = (em) (Object) ((tp) this).field_p.c(13395);
                                                  L30: while (true) {
                                                    if (var14_ref == null) {
                                                      break L29;
                                                    } else {
                                                      stackOut_117_0 = (~var14_ref.field_o < ~var12 ? -1 : (~var14_ref.field_o == ~var12 ? 0 : 1));
                                                      stackIn_130_0 = stackOut_117_0;
                                                      stackIn_118_0 = stackOut_117_0;
                                                      if (var16 != 0) {
                                                        break L28;
                                                      } else {
                                                        L31: {
                                                          if (stackIn_118_0 != 0) {
                                                            break L31;
                                                          } else {
                                                            if (var16 == 0) {
                                                              break L29;
                                                            } else {
                                                              break L31;
                                                            }
                                                          }
                                                        }
                                                        var14_ref = (em) (Object) ((tp) this).field_p.a((byte) 117);
                                                        if (var16 == 0) {
                                                          continue L30;
                                                        } else {
                                                          break L29;
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  var14_ref = (em) (Object) ((tp) this).field_s.c(13395);
                                                  L32: while (true) {
                                                    if (null == var14_ref) {
                                                      break L29;
                                                    } else {
                                                      stackOut_105_0 = (~var12 < ~var14_ref.field_o ? -1 : (~var12 == ~var14_ref.field_o ? 0 : 1));
                                                      stackIn_130_0 = stackOut_105_0;
                                                      stackIn_106_0 = stackOut_105_0;
                                                      if (var16 != 0) {
                                                        break L28;
                                                      } else {
                                                        stackOut_106_0 = stackIn_106_0;
                                                        stackIn_108_0 = stackOut_106_0;
                                                        L33: {
                                                          if (stackIn_108_0 != 0) {
                                                            break L33;
                                                          } else {
                                                            if (var16 == 0) {
                                                              break L29;
                                                            } else {
                                                              break L33;
                                                            }
                                                          }
                                                        }
                                                        var14_ref = (em) (Object) ((tp) this).field_s.a((byte) 66);
                                                        continue L32;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              if (var14_ref == null) {
                                                throw new IOException();
                                              } else {
                                                stackOut_129_0 = var10;
                                                stackIn_130_0 = stackOut_129_0;
                                                break L28;
                                              }
                                            }
                                            L34: {
                                              if (stackIn_130_0 != 0) {
                                                stackOut_133_0 = 9;
                                                stackIn_134_0 = stackOut_133_0;
                                                break L34;
                                              } else {
                                                stackOut_131_0 = 5;
                                                stackIn_134_0 = stackOut_131_0;
                                                break L34;
                                              }
                                            }
                                            var15 = stackIn_134_0;
                                            ((tp) this).field_i = var14_ref;
                                            ((tp) this).field_i.field_D = new ec(((tp) this).field_i.field_E + var15 + var9);
                                            ((tp) this).field_i.field_D.a(6, var10);
                                            ((tp) this).field_i.field_D.a((byte) 63, var9);
                                            ((tp) this).field_i.field_G = 10;
                                            ((tp) this).field_m.field_o = 0;
                                            if (var16 == 0) {
                                              break L14;
                                            } else {
                                              break L26;
                                            }
                                          }
                                        }
                                        L35: {
                                          if (((tp) this).field_i.field_G != 0) {
                                            break L35;
                                          } else {
                                            L36: {
                                              if (-1 == ((tp) this).field_m.field_m[0]) {
                                                break L36;
                                              } else {
                                                ((tp) this).field_i = null;
                                                if (var16 == 0) {
                                                  break L14;
                                                } else {
                                                  break L36;
                                                }
                                              }
                                            }
                                            ((tp) this).field_m.field_o = 0;
                                            ((tp) this).field_i.field_G = 1;
                                            if (var16 == 0) {
                                              break L14;
                                            } else {
                                              break L35;
                                            }
                                          }
                                        }
                                        throw new IOException();
                                      }
                                    }
                                    var2_int++;
                                    if (var16 == 0) {
                                      continue L9;
                                    } else {
                                      break L11;
                                    }
                                  }
                                } else {
                                  throw new IOException();
                                }
                              }
                            }
                          }
                          stackOut_150_0 = 1;
                          stackIn_151_0 = stackOut_150_0;
                          break L10;
                        }
                        return stackIn_151_0 != 0;
                      }
                    }
                  }
                } else {
                  stackOut_27_0 = 1;
                  stackIn_28_0 = stackOut_27_0;
                  return stackIn_28_0 != 0;
                }
              } else {
                L37: {
                  if (((tp) this).c(20) != 0) {
                    break L37;
                  } else {
                    if (0 != ((tp) this).e(20)) {
                      break L37;
                    } else {
                      stackOut_22_0 = 1;
                      stackIn_23_0 = stackOut_22_0;
                      return stackIn_23_0 != 0;
                    }
                  }
                }
                stackOut_24_0 = 0;
                stackIn_25_0 = stackOut_24_0;
                return stackIn_25_0 != 0;
              }
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2 = (IOException) (Object) decompiledCaughtException;
              try {
                L38: {
                  ((tp) this).field_D.c(-6624);
                  break L38;
                }
              } catch (java.lang.Exception decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                L39: {
                  var3 = (Exception) (Object) decompiledCaughtException;
                  break L39;
                }
              }
              L40: {
                ((tp) this).field_c = -2;
                ((tp) this).field_h = ((tp) this).field_h + 1;
                ((tp) this).field_D = null;
                if (((tp) this).c(20) != 0) {
                  break L40;
                } else {
                  if (0 == ((tp) this).e(20)) {
                    stackOut_162_0 = 1;
                    stackIn_163_0 = stackOut_162_0;
                    return stackIn_163_0 != 0;
                  } else {
                    break L40;
                  }
                }
              }
              stackOut_160_0 = 0;
              stackIn_161_0 = stackOut_160_0;
              return stackIn_161_0 != 0;
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              var2_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw vk.a((Throwable) (Object) var2_ref, "tp.E(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void g(int param0) {
        try {
            IOException var2 = null;
            RuntimeException var2_ref = null;
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                if (null == ((tp) this).field_D) {
                  return;
                } else {
                  try {
                    L1: {
                      L2: {
                        ((tp) this).field_o.field_o = 0;
                        ((tp) this).field_o.a(6, 6);
                        ((tp) this).field_o.b((byte) -106, 3);
                        ((tp) this).field_o.i(0, -95);
                        ((tp) this).field_D.b(((tp) this).field_o.field_m, false, 0, ((tp) this).field_o.field_m.length);
                        if (param0 == -30001) {
                          break L2;
                        } else {
                          eh discarded$2 = tp.a((nh) null, (String) null, (String) null, -28);
                          break L2;
                        }
                      }
                      break L1;
                    }
                  } catch (java.io.IOException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var2 = (IOException) (Object) decompiledCaughtException;
                      try {
                        L4: {
                          ((tp) this).field_D.c(-6624);
                          break L4;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        L5: {
                          var3 = (Exception) (Object) decompiledCaughtException;
                          break L5;
                        }
                      }
                      ((tp) this).field_c = -2;
                      ((tp) this).field_D = null;
                      ((tp) this).field_h = ((tp) this).field_h + 1;
                      break L3;
                    }
                  }
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw vk.a((Throwable) (Object) var2_ref, "tp.M(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, float param1, String param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              lj.field_e = param2;
              if (param0 == 10) {
                break L1;
              } else {
                tp.h(-5);
                break L1;
              }
            }
            lc.field_e = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("tp.O(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
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
          throw vk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    final void a(Object param0, boolean param1, byte param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            em var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            RuntimeException stackIn_35_0 = null;
            StringBuilder stackIn_35_1 = null;
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            RuntimeException stackIn_38_0 = null;
            StringBuilder stackIn_38_1 = null;
            String stackIn_38_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_34_0 = null;
            StringBuilder stackOut_34_1 = null;
            RuntimeException stackOut_37_0 = null;
            StringBuilder stackOut_37_1 = null;
            String stackOut_37_2 = null;
            RuntimeException stackOut_35_0 = null;
            StringBuilder stackOut_35_1 = null;
            String stackOut_35_2 = null;
            var6 = DungeonAssault.field_K;
            try {
              L0: {
                L1: {
                  if (null == ((tp) this).field_D) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        ((tp) this).field_D.c(param2 ^ -6570);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    ((tp) this).field_D = null;
                    break L1;
                  }
                }
                L4: {
                  ((tp) this).field_D = (rk) param0;
                  this.g(-30001);
                  this.a(param1, 5391);
                  if (param2 == 118) {
                    break L4;
                  } else {
                    field_x = null;
                    break L4;
                  }
                }
                ((tp) this).field_i = null;
                ((tp) this).field_m.field_o = 0;
                L5: while (true) {
                  L6: {
                    L7: {
                      L8: {
                        var4_ref3 = (em) (Object) ((tp) this).field_p.a(-8);
                        if (null != var4_ref3) {
                          break L8;
                        } else {
                          if (var6 != 0) {
                            break L7;
                          } else {
                            if (var6 == 0) {
                              break L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      ((tp) this).field_g.a((ll) (Object) var4_ref3, -32711);
                      break L7;
                    }
                    if (var6 == 0) {
                      continue L5;
                    } else {
                      break L6;
                    }
                  }
                  L9: while (true) {
                    L10: {
                      L11: {
                        var4_ref3 = (em) (Object) ((tp) this).field_s.a(121);
                        if (null == var4_ref3) {
                          break L11;
                        } else {
                          ((tp) this).field_d.a((ll) (Object) var4_ref3, -32711);
                          if (var6 != 0) {
                            break L10;
                          } else {
                            if (var6 == 0) {
                              continue L9;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                      L12: {
                        if (((tp) this).field_j == 0) {
                          break L12;
                        } else {
                          {
                            L13: {
                              ((tp) this).field_o.field_o = 0;
                              ((tp) this).field_o.a(6, 4);
                              ((tp) this).field_o.a(6, (int) ((tp) this).field_j);
                              ((tp) this).field_o.a((byte) 63, 0);
                              ((tp) this).field_D.b(((tp) this).field_o.field_m, false, 0, ((tp) this).field_o.field_m.length);
                              break L13;
                            }
                          }
                          break L12;
                        }
                      }
                      ((tp) this).field_a = 0;
                      ((tp) this).field_n = kd.c(-2456);
                      break L10;
                    }
                    break L0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L17: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_34_0 = (RuntimeException) var4_ref2;
                stackOut_34_1 = new StringBuilder().append("tp.C(");
                stackIn_37_0 = stackOut_34_0;
                stackIn_37_1 = stackOut_34_1;
                stackIn_35_0 = stackOut_34_0;
                stackIn_35_1 = stackOut_34_1;
                if (param0 == null) {
                  stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
                  stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
                  stackOut_37_2 = "null";
                  stackIn_38_0 = stackOut_37_0;
                  stackIn_38_1 = stackOut_37_1;
                  stackIn_38_2 = stackOut_37_2;
                  break L17;
                } else {
                  stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
                  stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
                  stackOut_35_2 = "{...}";
                  stackIn_38_0 = stackOut_35_0;
                  stackIn_38_1 = stackOut_35_1;
                  stackIn_38_2 = stackOut_35_2;
                  break L17;
                }
              }
              throw vk.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + ',' + param1 + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(boolean param0, int param1) {
        try {
            IOException var3 = null;
            RuntimeException var3_ref = null;
            Exception var4 = null;
            ec stackIn_3_0 = null;
            int stackIn_3_1 = 0;
            ec stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            ec stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            int stackIn_6_2 = 0;
            Throwable decompiledCaughtException = null;
            ec stackOut_2_0 = null;
            int stackOut_2_1 = 0;
            ec stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int stackOut_5_2 = 0;
            ec stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            int stackOut_3_2 = 0;
            try {
              L0: {
                if (((tp) this).field_D != null) {
                  try {
                    L1: {
                      L2: {
                        ((tp) this).field_o.field_o = 0;
                        stackOut_2_0 = ((tp) this).field_o;
                        stackOut_2_1 = 6;
                        stackIn_5_0 = stackOut_2_0;
                        stackIn_5_1 = stackOut_2_1;
                        stackIn_3_0 = stackOut_2_0;
                        stackIn_3_1 = stackOut_2_1;
                        if (param0) {
                          stackOut_5_0 = (ec) (Object) stackIn_5_0;
                          stackOut_5_1 = stackIn_5_1;
                          stackOut_5_2 = 2;
                          stackIn_6_0 = stackOut_5_0;
                          stackIn_6_1 = stackOut_5_1;
                          stackIn_6_2 = stackOut_5_2;
                          break L2;
                        } else {
                          stackOut_3_0 = (ec) (Object) stackIn_3_0;
                          stackOut_3_1 = stackIn_3_1;
                          stackOut_3_2 = 3;
                          stackIn_6_0 = stackOut_3_0;
                          stackIn_6_1 = stackOut_3_1;
                          stackIn_6_2 = stackOut_3_2;
                          break L2;
                        }
                      }
                      ((ec) (Object) stackIn_6_0).a(stackIn_6_1, stackIn_6_2);
                      ((tp) this).field_o.a(0L, 836);
                      ((tp) this).field_D.b(((tp) this).field_o.field_m, false, 0, ((tp) this).field_o.field_m.length);
                      break L1;
                    }
                  } catch (java.io.IOException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var3 = (IOException) (Object) decompiledCaughtException;
                      try {
                        L4: {
                          ((tp) this).field_D.c(param1 + -12015);
                          break L4;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        L5: {
                          var4 = (Exception) (Object) decompiledCaughtException;
                          break L5;
                        }
                      }
                      ((tp) this).field_h = ((tp) this).field_h + 1;
                      ((tp) this).field_D = null;
                      ((tp) this).field_c = -2;
                      break L3;
                    }
                  }
                  L6: {
                    if (param1 == 5391) {
                      break L6;
                    } else {
                      field_x = null;
                      break L6;
                    }
                  }
                  break L0;
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw vk.a((Throwable) (Object) var3_ref, "tp.P(" + param0 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public tp() {
    }

    final static eh a(nh param0, String param1, String param2, int param3) {
        RuntimeException var4 = null;
        eh var4_ref = null;
        byte[] var5 = null;
        ec var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_9_0 = null;
        eh stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        eh stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var10 = DungeonAssault.field_K;
        try {
          L0: {
            var4_ref = new eh();
            var4_ref.field_i = param1;
            var4_ref.field_b = param2;
            var4_ref.field_d = param0;
            var5 = param0.a("config", param2 + "/" + param1, (byte) -128);
            var6 = new ec(var5);
            var4_ref.field_c = (var5.length + -4) / 2;
            var4_ref.field_j = new int[var4_ref.field_c];
            var4_ref.field_l = null;
            var4_ref.field_f = 0;
            var4_ref.field_k = new int[var4_ref.field_c];
            var4_ref.field_g = var6.k(0);
            var4_ref.field_m = var6.k(0);
            var7 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var4_ref.field_c >= ~var7) {
                    break L3;
                  } else {
                    var8 = var6.c(true);
                    var9 = 10 * var6.c(true);
                    var4_ref.field_k[var7] = var8;
                    var4_ref.field_j[var7] = var9;
                    var4_ref.field_f = var4_ref.field_f + var9;
                    var7++;
                    if (var10 != 0) {
                      break L2;
                    } else {
                      if (var10 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param3 == -1998) {
                  break L2;
                } else {
                  stackOut_8_0 = null;
                  stackIn_9_0 = stackOut_8_0;
                  return (eh) (Object) stackIn_9_0;
                }
              }
              stackOut_10_0 = (eh) var4_ref;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("tp.Q(");
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L5;
            }
          }
          L6: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L6;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param3 + ')');
        }
        return stackIn_11_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Orb of Majesty";
        field_A = new String[]{null, "After selecting your target, you now need to choose which <%raiders> will form the party to send out. Select up to four <%raiders> by <col=FF0000>left-clicking on them</col>, then <col=FF0000>click 'Raid' to continue</col>. Remember to take a selection of <%raiders> with skills to overcome any form of defence you might encounter."};
        field_u = "DUNGEON ASSAULT";
        field_C = new String[]{"Surprise", "There are other aspects to combat between raiders and monsters; first is the element of <%highlight>surprise</col>. If your raider succeeds in surprising the monster, it will be able to <%highlight>strike first</col> - coupled with a high <%attack> skill, your raider may be able to defeat the monster before it gets a chance to strike back."};
        field_B = new ef();
        field_w = "Sort rooms by <%0>";
        field_y = new ad(2, 4, 4, 0);
        field_x = "This password contains your email address, and would be easy to guess";
    }
}
