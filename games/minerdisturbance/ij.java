/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ij extends vb {
    private uh field_k;
    private int field_q;
    private tg field_i;
    static int field_v;
    private nm field_y;
    private byte[] field_A;
    static boolean field_p;
    private int field_n;
    private byte[] field_h;
    private uh field_e;
    static ea field_t;
    private g field_w;
    private ch field_j;
    private int field_u;
    static pl field_o;
    private em field_z;
    private boolean field_g;
    private ta field_x;
    private boolean field_m;
    private int field_l;
    private ta field_r;
    private long field_s;
    private boolean field_f;

    final static ed a(int param0, String param1, boolean param2) {
        ed var3 = null;
        var3 = new ed(false);
        if (!param2) {
          return null;
        } else {
          var3.field_h = param1;
          var3.field_e = param0;
          return var3;
        }
    }

    final byte[] a(int param0, int param1) {
        em var3 = null;
        byte[] var4 = null;
        int var5 = 0;
        var3 = this.a(124, 0, param1);
        if (var3 == null) {
          return null;
        } else {
          var4 = var3.c((byte) -115);
          var5 = 22 / ((-32 - param0) / 34);
          var3.b(34);
          return var4;
        }
    }

    final g a(byte param0) {
        byte[] var2 = null;
        int var4 = 0;
        byte[] var5 = null;
        var4 = MinerDisturbance.field_ab;
        if (((ij) this).field_w == null) {
          L0: {
            if (((ij) this).field_z != null) {
              break L0;
            } else {
              if (!((ij) this).field_j.d((byte) -111)) {
                ((ij) this).field_z = (em) (Object) ((ij) this).field_j.a((byte) 0, -21, true, ((ij) this).field_u, 255);
                break L0;
              } else {
                return null;
              }
            }
          }
          if (!((ij) this).field_z.field_C) {
            if (param0 == 53) {
              L1: {
                var5 = ((ij) this).field_z.c((byte) -115);
                var2 = var5;
                if (((ij) this).field_z instanceof vl) {
                  break L1;
                } else {
                  if (var5 != null) {
                    ((ij) this).field_w = new g(var5, ((ij) this).field_q, ((ij) this).field_h);
                    if (null != ((ij) this).field_e) {
                      vl discarded$1 = ((ij) this).field_y.a(((ij) this).field_e, false, var5, ((ij) this).field_u);
                      if (var4 != 0) {
                        break L1;
                      } else {
                        L2: {
                          if (((ij) this).field_k != null) {
                            ((ij) this).field_A = new byte[((ij) this).field_w.field_c];
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                        ((ij) this).field_z = null;
                        return ((ij) this).field_w;
                      }
                    } else {
                      L3: {
                        if (((ij) this).field_k != null) {
                          ((ij) this).field_A = new byte[((ij) this).field_w.field_c];
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      ((ij) this).field_z = null;
                      return ((ij) this).field_w;
                    }
                  } else {
                    throw new RuntimeException();
                  }
                }
              }
              if (var5 != null) {
                ((ij) this).field_w = new g(var5, ((ij) this).field_q, ((ij) this).field_h);
                if (((ij) this).field_n != ((ij) this).field_w.field_r) {
                  throw new RuntimeException();
                } else {
                  L4: {
                    if (((ij) this).field_k != null) {
                      ((ij) this).field_A = new byte[((ij) this).field_w.field_c];
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  ((ij) this).field_z = null;
                  return ((ij) this).field_w;
                }
              } else {
                throw new RuntimeException();
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return ((ij) this).field_w;
        }
    }

    final void c(int param0) {
        int var2_int = 0;
        em var2 = null;
        pi var3 = null;
        int var4 = 0;
        int var5 = 0;
        byte stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_33_0 = 0;
        byte stackIn_40_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_63_0 = 0;
        boolean stackIn_80_0 = false;
        boolean stackIn_83_0 = false;
        int stackIn_97_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_109_1 = 0;
        int stackOut_19_0 = 0;
        byte stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_107_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_111_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_49_0 = 0;
        byte stackOut_39_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_62_0 = 0;
        boolean stackOut_79_0 = false;
        L0: {
          var5 = MinerDisturbance.field_ab;
          if (null != ((ij) this).field_x) {
            if (((ij) this).a((byte) 53) != null) {
              L1: {
                if (((ij) this).field_g) {
                  break L1;
                } else {
                  L2: {
                    if (!((ij) this).field_m) {
                      break L2;
                    } else {
                      var2_int = 1;
                      var3 = ((ij) this).field_x.b(71);
                      L3: while (true) {
                        L4: {
                          L5: {
                            L6: {
                              if (var3 == null) {
                                L7: while (true) {
                                  if (((ij) this).field_l >= ((ij) this).field_w.field_d.length) {
                                    break L5;
                                  } else {
                                    stackOut_19_0 = -1;
                                    stackIn_33_0 = stackOut_19_0;
                                    stackIn_20_0 = stackOut_19_0;
                                    if (var5 != 0) {
                                      break L4;
                                    } else {
                                      if (stackIn_20_0 != (((ij) this).field_w.field_d[((ij) this).field_l] ^ -1)) {
                                        break L6;
                                      } else {
                                        ((ij) this).field_l = ((ij) this).field_l + 1;
                                        continue L7;
                                      }
                                    }
                                  }
                                }
                              } else {
                                var4 = (int)var3.field_d;
                                stackOut_8_0 = ((ij) this).field_A[var4];
                                stackOut_8_1 = 1;
                                stackIn_109_0 = stackOut_8_0;
                                stackIn_109_1 = stackOut_8_1;
                                stackIn_9_0 = stackOut_8_0;
                                stackIn_9_1 = stackOut_8_1;
                                if (var5 != 0) {
                                  L8: while (true) {
                                    if (stackIn_109_0 >= stackIn_109_1) {
                                      break L5;
                                    } else {
                                      stackOut_107_0 = -1;
                                      stackIn_33_0 = stackOut_107_0;
                                      stackIn_108_0 = stackOut_107_0;
                                      if (var5 != 0) {
                                        break L4;
                                      } else {
                                        stackOut_108_0 = stackIn_108_0;
                                        stackIn_105_0 = stackOut_108_0;
                                        if (stackIn_105_0 != (((ij) this).field_w.field_d[((ij) this).field_l] ^ -1)) {
                                          break L6;
                                        } else {
                                          ((ij) this).field_l = ((ij) this).field_l + 1;
                                          stackOut_111_0 = ((ij) this).field_l;
                                          stackOut_111_1 = ((ij) this).field_w.field_d.length;
                                          stackIn_109_0 = stackOut_111_0;
                                          stackIn_109_1 = stackOut_111_1;
                                          continue L8;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  L9: {
                                    if (stackIn_9_0 != stackIn_9_1) {
                                      em discarded$4 = this.a(param0 + 116, 2, var4);
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  }
                                  L10: {
                                    L11: {
                                      if ((((ij) this).field_A[var4] ^ -1) != -2) {
                                        break L11;
                                      } else {
                                        var3.b(34);
                                        if (var5 == 0) {
                                          break L10;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    var2_int = 0;
                                    break L10;
                                  }
                                  var3 = ((ij) this).field_x.b((byte) 56);
                                  continue L3;
                                }
                              }
                            }
                            L12: {
                              if (((ij) this).field_j.c((byte) -46)) {
                                var2_int = 0;
                                if (var5 == 0) {
                                  break L5;
                                } else {
                                  break L12;
                                }
                              } else {
                                break L12;
                              }
                            }
                            L13: {
                              if (1 != ((ij) this).field_A[((ij) this).field_l]) {
                                em discarded$5 = this.a(param0 ^ 124, 2, ((ij) this).field_l);
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                            L14: {
                              if (1 == ((ij) this).field_A[((ij) this).field_l]) {
                                break L14;
                              } else {
                                var3 = new pi();
                                var3.field_d = (long)((ij) this).field_l;
                                var2_int = 0;
                                ((ij) this).field_x.a((byte) -116, var3);
                                break L14;
                              }
                            }
                            ((ij) this).field_l = ((ij) this).field_l + 1;
                            break L5;
                          }
                          stackOut_32_0 = var2_int;
                          stackIn_33_0 = stackOut_32_0;
                          break L4;
                        }
                        L15: {
                          if (stackIn_33_0 == 0) {
                            break L15;
                          } else {
                            ((ij) this).field_m = false;
                            ((ij) this).field_l = 0;
                            break L15;
                          }
                        }
                        if (var5 == 0) {
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  ((ij) this).field_x = null;
                  break L1;
                }
              }
              var2_int = 1;
              var3 = ((ij) this).field_x.b(72);
              L16: while (true) {
                L17: {
                  L18: {
                    L19: {
                      if (var3 == null) {
                        L20: while (true) {
                          if (((ij) this).field_l >= ((ij) this).field_w.field_d.length) {
                            break L18;
                          } else {
                            stackOut_49_0 = ((ij) this).field_w.field_d[((ij) this).field_l];
                            stackIn_63_0 = stackOut_49_0;
                            stackIn_50_0 = stackOut_49_0;
                            if (var5 != 0) {
                              break L17;
                            } else {
                              if (stackIn_50_0 != 0) {
                                break L19;
                              } else {
                                ((ij) this).field_l = ((ij) this).field_l + 1;
                                continue L20;
                              }
                            }
                          }
                        }
                      } else {
                        var4 = (int)var3.field_d;
                        stackOut_39_0 = ((ij) this).field_A[var4];
                        stackIn_101_0 = stackOut_39_0;
                        stackIn_40_0 = stackOut_39_0;
                        if (var5 != 0) {
                          L21: while (true) {
                            if (stackIn_101_0 >= ((ij) this).field_w.field_d.length) {
                              break L18;
                            } else {
                              stackOut_99_0 = ((ij) this).field_w.field_d[((ij) this).field_l];
                              stackIn_63_0 = stackOut_99_0;
                              stackIn_100_0 = stackOut_99_0;
                              if (var5 != 0) {
                                break L17;
                              } else {
                                stackOut_100_0 = stackIn_100_0;
                                stackIn_97_0 = stackOut_100_0;
                                if (stackIn_97_0 != 0) {
                                  break L19;
                                } else {
                                  ((ij) this).field_l = ((ij) this).field_l + 1;
                                  stackOut_103_0 = ((ij) this).field_l;
                                  stackIn_101_0 = stackOut_103_0;
                                  continue L21;
                                }
                              }
                            }
                          }
                        } else {
                          L22: {
                            if (stackIn_40_0 != 0) {
                              break L22;
                            } else {
                              em discarded$6 = this.a(113, 1, var4);
                              break L22;
                            }
                          }
                          L23: {
                            L24: {
                              if (0 == ((ij) this).field_A[var4]) {
                                break L24;
                              } else {
                                var3.b(34);
                                if (var5 == 0) {
                                  break L23;
                                } else {
                                  break L24;
                                }
                              }
                            }
                            var2_int = 0;
                            break L23;
                          }
                          var3 = ((ij) this).field_x.b((byte) 56);
                          continue L16;
                        }
                      }
                    }
                    L25: {
                      if (250 > ((ij) this).field_y.field_b) {
                        break L25;
                      } else {
                        var2_int = 0;
                        if (var5 == 0) {
                          break L18;
                        } else {
                          break L25;
                        }
                      }
                    }
                    L26: {
                      if (((ij) this).field_A[((ij) this).field_l] == 0) {
                        em discarded$7 = this.a(param0 + 112, 1, ((ij) this).field_l);
                        break L26;
                      } else {
                        break L26;
                      }
                    }
                    L27: {
                      if (((ij) this).field_A[((ij) this).field_l] == 0) {
                        var3 = new pi();
                        var3.field_d = (long)((ij) this).field_l;
                        var2_int = 0;
                        ((ij) this).field_x.a((byte) -114, var3);
                        break L27;
                      } else {
                        break L27;
                      }
                    }
                    ((ij) this).field_l = ((ij) this).field_l + 1;
                    break L18;
                  }
                  stackOut_62_0 = var2_int;
                  stackIn_63_0 = stackOut_62_0;
                  break L17;
                }
                if (stackIn_63_0 != 0) {
                  ((ij) this).field_l = 0;
                  ((ij) this).field_g = false;
                  break L0;
                } else {
                  break L0;
                }
              }
            } else {
              return;
            }
          } else {
            break L0;
          }
        }
        if (((ij) this).field_f) {
          if ((sf.a((byte) -111) ^ -1L) <= (((ij) this).field_s ^ -1L)) {
            var2 = (em) (Object) ((ij) this).field_i.a(param0 ^ -16545);
            L28: while (true) {
              if (var2 != null) {
                stackOut_79_0 = var2.field_C;
                stackIn_83_0 = stackOut_79_0;
                stackIn_80_0 = stackOut_79_0;
                if (var5 == 0) {
                  L29: {
                    L30: {
                      if (!stackIn_83_0) {
                        break L30;
                      } else {
                        if (var5 == 0) {
                          break L29;
                        } else {
                          break L30;
                        }
                      }
                    }
                    L31: {
                      if (!var2.field_z) {
                        break L31;
                      } else {
                        if (!var2.field_v) {
                          throw new RuntimeException();
                        } else {
                          var2.b(param0 ^ 34);
                          break L31;
                        }
                      }
                    }
                    var2.field_z = true;
                    break L29;
                  }
                  var2 = (em) (Object) ((ij) this).field_i.a(true);
                  continue L28;
                } else {
                  L32: {
                    if (!stackIn_80_0) {
                      break L32;
                    } else {
                      ((ij) this).c(-80);
                      break L32;
                    }
                  }
                  return;
                }
              } else {
                L33: {
                  ((ij) this).field_s = sf.a((byte) 101) + 1000L;
                  if (param0 == 0) {
                    break L33;
                  } else {
                    ((ij) this).c(-80);
                    break L33;
                  }
                }
                return;
              }
            }
          } else {
            L34: {
              if (param0 == 0) {
                break L34;
              } else {
                ((ij) this).c(-80);
                break L34;
              }
            }
            return;
          }
        } else {
          L35: {
            if (param0 == 0) {
              break L35;
            } else {
              ((ij) this).c(-80);
              break L35;
            }
          }
          return;
        }
    }

    final static void a(boolean param0, sb param1) {
        try {
            byte[] var2 = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            byte stackIn_5_0 = 0;
            int stackIn_9_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            byte stackOut_4_0 = 0;
            int stackOut_8_0 = 0;
            L0: {
              L1: {
                var5 = MinerDisturbance.field_ab;
                var6 = new byte[24];
                var2 = var6;
                if (null != w.field_W) {
                  try {
                    L2: {
                      w.field_W.a((byte) 120, 0L);
                      w.field_W.a(var6, 119);
                      var3_int = 0;
                      L3: while (true) {
                        L4: {
                          L5: {
                            if (var3_int >= 24) {
                              break L5;
                            } else {
                              stackOut_4_0 = var6[var3_int];
                              stackIn_9_0 = stackOut_4_0;
                              stackIn_5_0 = stackOut_4_0;
                              if (var5 != 0) {
                                break L4;
                              } else {
                                if (stackIn_5_0 != 0) {
                                  break L5;
                                } else {
                                  var3_int++;
                                  continue L3;
                                }
                              }
                            }
                          }
                          stackOut_8_0 = var3_int ^ -1;
                          stackIn_9_0 = stackOut_8_0;
                          break L4;
                        }
                        if (stackIn_9_0 > -25) {
                          decompiledRegionSelector0 = 0;
                          break L2;
                        } else {
                          throw new IOException();
                        }
                      }
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L6: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      var4 = 0;
                      L7: while (true) {
                        if ((var4 ^ -1) <= -25) {
                          decompiledRegionSelector0 = 0;
                          break L6;
                        } else {
                          L8: {
                            var6[var4] = (byte)-1;
                            var4++;
                            if (var5 != 0) {
                              break L8;
                            } else {
                              if (var5 == 0) {
                                continue L7;
                              } else {
                                param1.a(0, 24, param0, var2);
                                break L8;
                              }
                            }
                          }
                          decompiledRegionSelector0 = 1;
                          break L6;
                        }
                      }
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    break L1;
                  } else {
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
              param1.a(0, 24, param0, var2);
              break L0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(byte param0) {
        pi var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        byte stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        var4 = MinerDisturbance.field_ab;
        if (null != ((ij) this).field_x) {
          if (((ij) this).a((byte) 53) == null) {
            return;
          } else {
            var2 = ((ij) this).field_r.b(111);
            L0: while (true) {
              L1: {
                L2: {
                  if (var2 == null) {
                    break L2;
                  } else {
                    var3 = (int)var2.field_d;
                    stackOut_5_0 = -1;
                    stackOut_5_1 = var3 ^ -1;
                    stackIn_22_0 = stackOut_5_0;
                    stackIn_22_1 = stackOut_5_1;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    if (var4 != 0) {
                      break L1;
                    } else {
                      L3: {
                        L4: {
                          L5: {
                            if (stackIn_6_0 < stackIn_6_1) {
                              break L5;
                            } else {
                              if (((ij) this).field_w.field_c <= var3) {
                                break L5;
                              } else {
                                if (((ij) this).field_w.field_d[var3] == 0) {
                                  break L5;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          var2.b(34);
                          if (var4 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                        L6: {
                          if (((ij) this).field_A[var3] == 0) {
                            em discarded$2 = this.a(103, 1, var3);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        L7: {
                          if (-1 == ((ij) this).field_A[var3]) {
                            em discarded$3 = this.a(92, 2, var3);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        if (1 == ((ij) this).field_A[var3]) {
                          var2.b(34);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var2 = ((ij) this).field_r.b((byte) 56);
                      if (var4 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                stackOut_21_0 = param0;
                stackOut_21_1 = 1;
                stackIn_22_0 = stackOut_21_0;
                stackIn_22_1 = stackOut_21_1;
                break L1;
              }
              L8: {
                if (stackIn_22_0 >= stackIn_22_1) {
                  break L8;
                } else {
                  ((ij) this).field_w = null;
                  break L8;
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    final void b(int param0) {
        int var2 = 0;
        var2 = -5 / ((33 - param0) / 58);
        if (null == ((ij) this).field_k) {
          return;
        } else {
          L0: {
            ((ij) this).field_m = true;
            if (null != ((ij) this).field_x) {
              break L0;
            } else {
              ((ij) this).field_x = new ta();
              break L0;
            }
          }
          return;
        }
    }

    private final em a(int param0, int param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        Exception var6_ref_Exception = null;
        int var6 = 0;
        byte[] var7 = null;
        int var7_int = 0;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        byte stackIn_48_0 = 0;
        byte stackIn_48_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        Object stackIn_63_0 = null;
        byte stackIn_109_0 = 0;
        byte stackIn_109_1 = 0;
        byte stackIn_115_0 = 0;
        byte stackIn_115_1 = 0;
        Throwable decompiledCaughtException = null;
        byte stackOut_108_0 = 0;
        byte stackOut_108_1 = 0;
        byte stackOut_47_0 = 0;
        byte stackOut_47_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        Object stackOut_62_0 = null;
        L0: {
          var10 = MinerDisturbance.field_ab;
          if (param0 >= 86) {
            break L0;
          } else {
            ((ij) this).b(-36);
            break L0;
          }
        }
        L1: {
          var4 = (Object) (Object) (em) (Object) ((ij) this).field_i.a((long)param2, -27109);
          if (var4 == null) {
            break L1;
          } else {
            if (0 != param1) {
              break L1;
            } else {
              if (((em) var4).field_v) {
                break L1;
              } else {
                if (!((em) var4).field_C) {
                  break L1;
                } else {
                  ((em) var4).b(34);
                  var4 = null;
                  break L1;
                }
              }
            }
          }
        }
        L2: {
          if (var4 != null) {
            break L2;
          } else {
            L3: {
              if (0 != param1) {
                break L3;
              } else {
                L4: {
                  L5: {
                    if (null == ((ij) this).field_k) {
                      break L5;
                    } else {
                      if (-1 != ((ij) this).field_A[param2]) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (!((ij) this).field_j.d((byte) -111)) {
                    var4 = (Object) (Object) ((ij) this).field_j.a((byte) 2, -21, true, param2, ((ij) this).field_u);
                    if (var10 == 0) {
                      ((ij) this).field_i.a(0, (long)param2, (pi) var4);
                      break L2;
                    } else {
                      break L4;
                    }
                  } else {
                    return null;
                  }
                }
                var4 = (Object) (Object) ((ij) this).field_y.a((byte) 54, param2, ((ij) this).field_k);
                break L3;
              }
            }
            L6: {
              if ((param1 ^ -1) != -2) {
                break L6;
              } else {
                if (((ij) this).field_k != null) {
                  var4 = (Object) (Object) ((ij) this).field_y.a(param2, false, ((ij) this).field_k);
                  break L6;
                } else {
                  throw new RuntimeException();
                }
              }
            }
            if (param1 == 2) {
              if (null != ((ij) this).field_k) {
                if ((((ij) this).field_A[param2] ^ -1) != 0) {
                  throw new RuntimeException();
                } else {
                  if (((ij) this).field_j.c((byte) -68)) {
                    return null;
                  } else {
                    var4 = (Object) (Object) ((ij) this).field_j.a((byte) 2, -21, false, param2, ((ij) this).field_u);
                    throw new RuntimeException();
                  }
                }
              } else {
                throw new RuntimeException();
              }
            } else {
              throw new RuntimeException();
            }
          }
        }
        if (!((em) var4).field_C) {
          var5 = ((em) var4).c((byte) -115);
          if (!(var4 instanceof vl)) {
            L7: {
              if (var5 == null) {
                break L7;
              } else {
                if (-3 > (var5.length ^ -1)) {
                  wa.field_b.reset();
                  wa.field_b.update(var5, 0, var5.length + -2);
                  var6 = (int)wa.field_b.getValue();
                  if (((ij) this).field_w.field_h[param2] == var6) {
                    if (null != ((ij) this).field_w.field_l) {
                      if (null != ((ij) this).field_w.field_l[param2]) {
                        var7 = ((ij) this).field_w.field_l[param2];
                        var8 = wb.a(var5.length + -2, 0, var5, 18738);
                        var9 = 0;
                        L8: while (true) {
                          if (64 > var9) {
                            stackOut_108_0 = var8[var9];
                            stackOut_108_1 = var7[var9];
                            stackIn_115_0 = stackOut_108_0;
                            stackIn_115_1 = stackOut_108_1;
                            stackIn_109_0 = stackOut_108_0;
                            stackIn_109_1 = stackOut_108_1;
                            if (var10 == 0) {
                              if (stackIn_115_0 == stackIn_115_1) {
                                var9++;
                                continue L8;
                              } else {
                                throw new RuntimeException();
                              }
                            } else {
                              L9: {
                                if (stackIn_109_0 == stackIn_109_1) {
                                  if (((em) var4).field_v) {
                                    break L9;
                                  } else {
                                    ((em) var4).b(34);
                                    break L9;
                                  }
                                } else {
                                  ((ij) this).field_A[param2] = (byte) 1;
                                  if (((em) var4).field_v) {
                                    break L9;
                                  } else {
                                    ((em) var4).b(34);
                                    break L9;
                                  }
                                }
                              }
                              return (em) var4;
                            }
                          } else {
                            L10: {
                              ((ij) this).field_j.field_o = 0;
                              ((ij) this).field_j.field_j = 0;
                              var5[-2 + var5.length] = (byte)(((ij) this).field_w.field_q[param2] >>> 800997800);
                              var5[-1 + var5.length] = (byte)((ij) this).field_w.field_q[param2];
                              if (null != ((ij) this).field_k) {
                                vl discarded$3 = ((ij) this).field_y.a(((ij) this).field_k, false, var5, param2);
                                if (((ij) this).field_A[param2] == 1) {
                                  if (((em) var4).field_v) {
                                    break L10;
                                  } else {
                                    ((em) var4).b(34);
                                    break L10;
                                  }
                                } else {
                                  ((ij) this).field_A[param2] = (byte) 1;
                                  if (((em) var4).field_v) {
                                    break L10;
                                  } else {
                                    ((em) var4).b(34);
                                    break L10;
                                  }
                                }
                              } else {
                                if (((em) var4).field_v) {
                                  break L10;
                                } else {
                                  ((em) var4).b(34);
                                  break L10;
                                }
                              }
                            }
                            return (em) var4;
                          }
                        }
                      } else {
                        L11: {
                          ((ij) this).field_j.field_o = 0;
                          ((ij) this).field_j.field_j = 0;
                          var5[-2 + var5.length] = (byte)(((ij) this).field_w.field_q[param2] >>> 800997800);
                          var5[-1 + var5.length] = (byte)((ij) this).field_w.field_q[param2];
                          if (null != ((ij) this).field_k) {
                            vl discarded$4 = ((ij) this).field_y.a(((ij) this).field_k, false, var5, param2);
                            if (((ij) this).field_A[param2] == 1) {
                              if (((em) var4).field_v) {
                                break L11;
                              } else {
                                ((em) var4).b(34);
                                break L11;
                              }
                            } else {
                              ((ij) this).field_A[param2] = (byte) 1;
                              if (((em) var4).field_v) {
                                break L11;
                              } else {
                                ((em) var4).b(34);
                                break L11;
                              }
                            }
                          } else {
                            if (((em) var4).field_v) {
                              break L11;
                            } else {
                              ((em) var4).b(34);
                              break L11;
                            }
                          }
                        }
                        return (em) var4;
                      }
                    } else {
                      L12: {
                        ((ij) this).field_j.field_o = 0;
                        ((ij) this).field_j.field_j = 0;
                        var5[-2 + var5.length] = (byte)(((ij) this).field_w.field_q[param2] >>> 800997800);
                        var5[-1 + var5.length] = (byte)((ij) this).field_w.field_q[param2];
                        if (null != ((ij) this).field_k) {
                          vl discarded$5 = ((ij) this).field_y.a(((ij) this).field_k, false, var5, param2);
                          if (((ij) this).field_A[param2] == 1) {
                            if (((em) var4).field_v) {
                              break L12;
                            } else {
                              ((em) var4).b(34);
                              break L12;
                            }
                          } else {
                            ((ij) this).field_A[param2] = (byte) 1;
                            if (((em) var4).field_v) {
                              break L12;
                            } else {
                              ((em) var4).b(34);
                              break L12;
                            }
                          }
                        } else {
                          if (((em) var4).field_v) {
                            break L12;
                          } else {
                            ((em) var4).b(34);
                            break L12;
                          }
                        }
                      }
                      return (em) var4;
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
              L13: {
                L14: {
                  if (var5 == null) {
                    break L14;
                  } else {
                    if (2 < var5.length) {
                      wa.field_b.reset();
                      wa.field_b.update(var5, 0, -2 + var5.length);
                      var6 = (int)wa.field_b.getValue();
                      if (((ij) this).field_w.field_h[param2] != var6) {
                        throw new RuntimeException();
                      } else {
                        L15: {
                          L16: {
                            if (((ij) this).field_w.field_l == null) {
                              break L16;
                            } else {
                              if (((ij) this).field_w.field_l[param2] != null) {
                                var7 = ((ij) this).field_w.field_l[param2];
                                var8 = wb.a(var5.length + -2, 0, var5, 18738);
                                var9 = 0;
                                L17: while (true) {
                                  if ((var9 ^ -1) <= -65) {
                                    break L16;
                                  } else {
                                    stackOut_47_0 = var7[var9];
                                    stackOut_47_1 = var8[var9];
                                    stackIn_52_0 = stackOut_47_0;
                                    stackIn_52_1 = stackOut_47_1;
                                    stackIn_48_0 = stackOut_47_0;
                                    stackIn_48_1 = stackOut_47_1;
                                    if (var10 != 0) {
                                      break L15;
                                    } else {
                                      if (stackIn_48_0 == stackIn_48_1) {
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
                          stackOut_51_0 = (255 & var5[var5.length - 2]) << -1987179032;
                          stackOut_51_1 = -(255 & var5[-1 + var5.length]);
                          stackIn_52_0 = stackOut_51_0;
                          stackIn_52_1 = stackOut_51_1;
                          break L15;
                        }
                        var7_int = stackIn_52_0 - stackIn_52_1;
                        if (var7_int != (((ij) this).field_w.field_q[param2] & 65535)) {
                          throw new RuntimeException();
                        } else {
                          L18: {
                            if (1 != ((ij) this).field_A[param2]) {
                              L19: {
                                if (((ij) this).field_A[param2] == 0) {
                                  break L19;
                                } else {
                                  break L19;
                                }
                              }
                              ((ij) this).field_A[param2] = (byte) 1;
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                          L20: {
                            if (!((em) var4).field_v) {
                              ((em) var4).b(34);
                              break L20;
                            } else {
                              break L20;
                            }
                          }
                          stackOut_62_0 = var4;
                          stackIn_63_0 = stackOut_62_0;
                          break L13;
                        }
                      }
                    } else {
                      break L14;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6_ref_Exception = (Exception) (Object) decompiledCaughtException;
              ((ij) this).field_A[param2] = (byte)-1;
              ((em) var4).b(34);
              if (((em) var4).field_v) {
                if (((ij) this).field_j.d((byte) -111)) {
                  return null;
                } else {
                  var4 = (Object) (Object) ((ij) this).field_j.a((byte) 2, -21, true, param2, ((ij) this).field_u);
                  ((ij) this).field_i.a(0, (long)param2, (pi) var4);
                  return null;
                }
              } else {
                return null;
              }
            }
            return (em) (Object) stackIn_63_0;
          }
        } else {
          return null;
        }
    }

    public static void a(boolean param0) {
        field_o = null;
        field_t = null;
        if (!param0) {
            field_t = null;
        }
    }

    final int a(byte param0, int param1) {
        em var3 = null;
        L0: {
          if (param0 >= 62) {
            break L0;
          } else {
            ((ij) this).c(25);
            break L0;
          }
        }
        var3 = (em) (Object) ((ij) this).field_i.a((long)param1, -27109);
        if (var3 == null) {
          return 0;
        } else {
          return var3.f(100);
        }
    }

    ij(int param0, uh param1, uh param2, ch param3, nm param4, int param5, byte[] param6, int param7, boolean param8) {
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        L0: {
          L1: {
            ((ij) this).field_i = new tg(16);
            ((ij) this).field_l = 0;
            ((ij) this).field_r = new ta();
            ((ij) this).field_s = 0L;
            ((ij) this).field_u = param0;
            ((ij) this).field_k = param1;
            if (((ij) this).field_k != null) {
              break L1;
            } else {
              ((ij) this).field_g = false;
              if (MinerDisturbance.field_ab == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          ((ij) this).field_g = true;
          ((ij) this).field_x = new ta();
          break L0;
        }
        L2: {
          ((ij) this).field_j = param3;
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (!param8) {
            stackOut_5_0 = this;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L2;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L2;
          }
        }
        L3: {
          ((ij) this).field_f = stackIn_6_1 != 0;
          ((ij) this).field_n = param7;
          ((ij) this).field_e = param2;
          ((ij) this).field_y = param4;
          ((ij) this).field_q = param5;
          ((ij) this).field_h = param6;
          if (((ij) this).field_e == null) {
            break L3;
          } else {
            ((ij) this).field_z = (em) (Object) ((ij) this).field_y.a((byte) -74, ((ij) this).field_u, ((ij) this).field_e);
            break L3;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = 0;
        field_o = null;
    }
}
