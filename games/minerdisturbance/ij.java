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
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        ed stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        ed stackOut_3_0 = null;
        Object stackOut_1_0 = null;
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
            var3 = new ed(false);
            if (param2) {
              var3.field_h = param1;
              var3.field_e = param0;
              stackOut_3_0 = (ed) var3;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ed) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3_ref;
            stackOut_5_1 = new StringBuilder().append("ij.F(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    final byte[] a(int param0, int param1) {
        em var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        int var5 = 0;
        Object stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            var3 = this.a(124, 0, param1);
            if (null != var3) {
              var4 = var3.c((byte) -115);
              var5 = 22 / ((-32 - param0) / 34);
              var3.b(34);
              stackOut_3_0 = (byte[]) var4;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var3_ref, "ij.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final g a(byte param0) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        RuntimeException var3 = null;
        int var4 = 0;
        g stackIn_3_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_34_0 = null;
        Object stackIn_54_0 = null;
        g stackIn_60_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        Object stackOut_16_0 = null;
        Object stackOut_33_0 = null;
        Object stackOut_53_0 = null;
        g stackOut_59_0 = null;
        Object stackOut_19_0 = null;
        g stackOut_2_0 = null;
        var4 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (((ij) this).field_w == null) {
              L1: {
                if (((ij) this).field_z != null) {
                  break L1;
                } else {
                  if (((ij) this).field_j.d((byte) -111)) {
                    stackOut_10_0 = null;
                    stackIn_11_0 = stackOut_10_0;
                    return (g) (Object) stackIn_11_0;
                  } else {
                    ((ij) this).field_z = (em) (Object) ((ij) this).field_j.a((byte) 0, -21, true, ((ij) this).field_u, 255);
                    break L1;
                  }
                }
              }
              if (((ij) this).field_z.field_C) {
                stackOut_16_0 = null;
                stackIn_17_0 = stackOut_16_0;
                return (g) (Object) stackIn_17_0;
              } else {
                if (param0 == 53) {
                  L2: {
                    L3: {
                      var2_array = ((ij) this).field_z.c((byte) -115);
                      if (((ij) this).field_z instanceof vl) {
                        break L3;
                      } else {
                        try {
                          L4: {
                            if (var2_array != null) {
                              ((ij) this).field_w = new g(var2_array, ((ij) this).field_q, ((ij) this).field_h);
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
                              ((ij) this).field_j.d(20);
                              ((ij) this).field_w = null;
                              if (!((ij) this).field_j.d((byte) -111)) {
                                break L6;
                              } else {
                                ((ij) this).field_z = null;
                                if (var4 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            ((ij) this).field_z = (em) (Object) ((ij) this).field_j.a((byte) 0, param0 + -74, true, ((ij) this).field_u, 255);
                            break L5;
                          }
                          stackOut_33_0 = null;
                          stackIn_34_0 = stackOut_33_0;
                          return (g) (Object) stackIn_34_0;
                        }
                        if (null == ((ij) this).field_e) {
                          break L2;
                        } else {
                          vl discarded$1 = ((ij) this).field_y.a(((ij) this).field_e, false, var2_array, ((ij) this).field_u);
                          if (var4 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    try {
                      L7: {
                        if (var2_array != null) {
                          ((ij) this).field_w = new g(var2_array, ((ij) this).field_q, ((ij) this).field_h);
                          if (((ij) this).field_n != ((ij) this).field_w.field_r) {
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
                          ((ij) this).field_w = null;
                          if (((ij) this).field_j.d((byte) -111)) {
                            break L9;
                          } else {
                            ((ij) this).field_z = (em) (Object) ((ij) this).field_j.a((byte) 0, -21, true, ((ij) this).field_u, 255);
                            if (var4 == 0) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        ((ij) this).field_z = null;
                        break L8;
                      }
                      stackOut_53_0 = null;
                      stackIn_54_0 = stackOut_53_0;
                      return (g) (Object) stackIn_54_0;
                    }
                    break L2;
                  }
                  L10: {
                    if (((ij) this).field_k != null) {
                      ((ij) this).field_A = new byte[((ij) this).field_w.field_c];
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  ((ij) this).field_z = null;
                  stackOut_59_0 = ((ij) this).field_w;
                  stackIn_60_0 = stackOut_59_0;
                  break L0;
                } else {
                  stackOut_19_0 = null;
                  stackIn_20_0 = stackOut_19_0;
                  return (g) (Object) stackIn_20_0;
                }
              }
            } else {
              stackOut_2_0 = ((ij) this).field_w;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var2, "ij.J(" + param0 + ')');
        }
        return stackIn_60_0;
    }

    final void c(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        em var2_ref = null;
        pi var3 = null;
        int var4 = 0;
        int var5 = 0;
        byte stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_49_0 = 0;
        byte stackIn_59_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_95_0 = 0;
        boolean stackIn_105_0 = false;
        int stackIn_126_0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_48_0 = 0;
        byte stackOut_58_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_94_0 = 0;
        boolean stackOut_104_0 = false;
        int stackOut_125_0 = 0;
        var5 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (null != ((ij) this).field_x) {
                if (((ij) this).a((byte) 53) != null) {
                  L2: {
                    if (((ij) this).field_g) {
                      break L2;
                    } else {
                      L3: {
                        if (!((ij) this).field_m) {
                          break L3;
                        } else {
                          var2_int = 1;
                          var3 = ((ij) this).field_x.b(71);
                          L4: while (true) {
                            L5: {
                              L6: {
                                L7: {
                                  if (null == var3) {
                                    break L7;
                                  } else {
                                    var4 = (int)var3.field_d;
                                    stackOut_12_0 = ((ij) this).field_A[var4];
                                    stackOut_12_1 = 1;
                                    stackIn_25_0 = stackOut_12_0;
                                    stackIn_25_1 = stackOut_12_1;
                                    stackIn_13_0 = stackOut_12_0;
                                    stackIn_13_1 = stackOut_12_1;
                                    if (var5 != 0) {
                                      L8: while (true) {
                                        if (stackIn_25_0 <= stackIn_25_1) {
                                          break L6;
                                        } else {
                                          stackOut_26_0 = -1;
                                          stackIn_49_0 = stackOut_26_0;
                                          stackIn_27_0 = stackOut_26_0;
                                          if (var5 != 0) {
                                            break L5;
                                          } else {
                                            stackOut_27_0 = stackIn_27_0;
                                            stackIn_29_0 = stackOut_27_0;
                                            L9: {
                                              L10: {
                                                if (stackIn_29_0 != ~((ij) this).field_w.field_d[((ij) this).field_l]) {
                                                  break L10;
                                                } else {
                                                  ((ij) this).field_l = ((ij) this).field_l + 1;
                                                  if (var5 == 0) {
                                                    break L9;
                                                  } else {
                                                    break L10;
                                                  }
                                                }
                                              }
                                              L11: {
                                                if (((ij) this).field_j.c((byte) -46)) {
                                                  var2_int = 0;
                                                  if (var5 == 0) {
                                                    break L6;
                                                  } else {
                                                    break L11;
                                                  }
                                                } else {
                                                  break L11;
                                                }
                                              }
                                              L12: {
                                                if (1 != ((ij) this).field_A[((ij) this).field_l]) {
                                                  em discarded$4 = this.a(param0 ^ 124, 2, ((ij) this).field_l);
                                                  break L12;
                                                } else {
                                                  break L12;
                                                }
                                              }
                                              L13: {
                                                if (1 == ((ij) this).field_A[((ij) this).field_l]) {
                                                  break L13;
                                                } else {
                                                  var3 = new pi();
                                                  var3.field_d = (long)((ij) this).field_l;
                                                  var2_int = 0;
                                                  ((ij) this).field_x.a((byte) -116, var3);
                                                  break L13;
                                                }
                                              }
                                              ((ij) this).field_l = ((ij) this).field_l + 1;
                                              if (var5 == 0) {
                                                break L9;
                                              } else {
                                                break L6;
                                              }
                                            }
                                            stackOut_24_0 = ~((ij) this).field_l;
                                            stackOut_24_1 = ~((ij) this).field_w.field_d.length;
                                            stackIn_25_0 = stackOut_24_0;
                                            stackIn_25_1 = stackOut_24_1;
                                            continue L8;
                                          }
                                        }
                                      }
                                    } else {
                                      L14: {
                                        if (stackIn_13_0 != stackIn_13_1) {
                                          em discarded$5 = this.a(param0 + 116, 2, var4);
                                          break L14;
                                        } else {
                                          break L14;
                                        }
                                      }
                                      L15: {
                                        L16: {
                                          if (((ij) this).field_A[var4] != 1) {
                                            break L16;
                                          } else {
                                            var3.b(34);
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
                                      var3 = ((ij) this).field_x.b((byte) 56);
                                      if (var5 == 0) {
                                        continue L4;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                }
                                L17: while (true) {
                                  stackOut_24_0 = ~((ij) this).field_l;
                                  stackOut_24_1 = ~((ij) this).field_w.field_d.length;
                                  stackIn_25_0 = stackOut_24_0;
                                  stackIn_25_1 = stackOut_24_1;
                                  if (stackIn_25_0 <= stackIn_25_1) {
                                    break L6;
                                  } else {
                                    stackOut_26_0 = -1;
                                    stackIn_49_0 = stackOut_26_0;
                                    stackIn_27_0 = stackOut_26_0;
                                    if (var5 != 0) {
                                      break L5;
                                    } else {
                                      stackOut_27_0 = stackIn_27_0;
                                      stackIn_29_0 = stackOut_27_0;
                                      L18: {
                                        if (stackIn_29_0 != ~((ij) this).field_w.field_d[((ij) this).field_l]) {
                                          break L18;
                                        } else {
                                          ((ij) this).field_l = ((ij) this).field_l + 1;
                                          if (var5 == 0) {
                                            continue L17;
                                          } else {
                                            break L18;
                                          }
                                        }
                                      }
                                      L19: {
                                        if (((ij) this).field_j.c((byte) -46)) {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L6;
                                          } else {
                                            break L19;
                                          }
                                        } else {
                                          break L19;
                                        }
                                      }
                                      L20: {
                                        if (1 != ((ij) this).field_A[((ij) this).field_l]) {
                                          em discarded$4 = this.a(param0 ^ 124, 2, ((ij) this).field_l);
                                          break L20;
                                        } else {
                                          break L20;
                                        }
                                      }
                                      L21: {
                                        if (1 == ((ij) this).field_A[((ij) this).field_l]) {
                                          break L21;
                                        } else {
                                          var3 = new pi();
                                          var3.field_d = (long)((ij) this).field_l;
                                          var2_int = 0;
                                          ((ij) this).field_x.a((byte) -116, var3);
                                          break L21;
                                        }
                                      }
                                      ((ij) this).field_l = ((ij) this).field_l + 1;
                                      if (var5 == 0) {
                                        continue L17;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_48_0 = var2_int;
                              stackIn_49_0 = stackOut_48_0;
                              break L5;
                            }
                            L22: {
                              if (stackIn_49_0 == 0) {
                                break L22;
                              } else {
                                ((ij) this).field_m = false;
                                ((ij) this).field_l = 0;
                                break L22;
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
                      ((ij) this).field_x = null;
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var2_int = 1;
                  var3 = ((ij) this).field_x.b(72);
                  L23: while (true) {
                    L24: {
                      L25: {
                        L26: {
                          if (var3 == null) {
                            break L26;
                          } else {
                            var4 = (int)var3.field_d;
                            stackOut_58_0 = ((ij) this).field_A[var4];
                            stackIn_71_0 = stackOut_58_0;
                            stackIn_59_0 = stackOut_58_0;
                            if (var5 != 0) {
                              L27: while (true) {
                                if (stackIn_71_0 <= ~((ij) this).field_w.field_d.length) {
                                  break L25;
                                } else {
                                  stackOut_72_0 = ((ij) this).field_w.field_d[((ij) this).field_l];
                                  stackIn_95_0 = stackOut_72_0;
                                  stackIn_73_0 = stackOut_72_0;
                                  if (var5 != 0) {
                                    break L24;
                                  } else {
                                    stackOut_73_0 = stackIn_73_0;
                                    stackIn_75_0 = stackOut_73_0;
                                    L28: {
                                      L29: {
                                        if (stackIn_75_0 != 0) {
                                          break L29;
                                        } else {
                                          ((ij) this).field_l = ((ij) this).field_l + 1;
                                          if (var5 == 0) {
                                            break L28;
                                          } else {
                                            break L29;
                                          }
                                        }
                                      }
                                      L30: {
                                        if (250 > ((ij) this).field_y.field_b) {
                                          break L30;
                                        } else {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L25;
                                          } else {
                                            break L30;
                                          }
                                        }
                                      }
                                      L31: {
                                        if (((ij) this).field_A[((ij) this).field_l] == 0) {
                                          em discarded$6 = this.a(param0 + 112, 1, ((ij) this).field_l);
                                          break L31;
                                        } else {
                                          break L31;
                                        }
                                      }
                                      L32: {
                                        if (((ij) this).field_A[((ij) this).field_l] == 0) {
                                          var3 = new pi();
                                          var3.field_d = (long)((ij) this).field_l;
                                          var2_int = 0;
                                          ((ij) this).field_x.a((byte) -114, var3);
                                          break L32;
                                        } else {
                                          break L32;
                                        }
                                      }
                                      ((ij) this).field_l = ((ij) this).field_l + 1;
                                      if (var5 == 0) {
                                        break L28;
                                      } else {
                                        break L25;
                                      }
                                    }
                                    stackOut_70_0 = ~((ij) this).field_l;
                                    stackIn_71_0 = stackOut_70_0;
                                    continue L27;
                                  }
                                }
                              }
                            } else {
                              L33: {
                                if (stackIn_59_0 != 0) {
                                  break L33;
                                } else {
                                  em discarded$7 = this.a(113, 1, var4);
                                  break L33;
                                }
                              }
                              L34: {
                                L35: {
                                  if (0 == ((ij) this).field_A[var4]) {
                                    break L35;
                                  } else {
                                    var3.b(34);
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
                              var3 = ((ij) this).field_x.b((byte) 56);
                              if (var5 == 0) {
                                continue L23;
                              } else {
                                break L26;
                              }
                            }
                          }
                        }
                        L36: while (true) {
                          stackOut_70_0 = ~((ij) this).field_l;
                          stackIn_71_0 = stackOut_70_0;
                          if (stackIn_71_0 <= ~((ij) this).field_w.field_d.length) {
                            break L25;
                          } else {
                            stackOut_72_0 = ((ij) this).field_w.field_d[((ij) this).field_l];
                            stackIn_95_0 = stackOut_72_0;
                            stackIn_73_0 = stackOut_72_0;
                            if (var5 != 0) {
                              break L24;
                            } else {
                              stackOut_73_0 = stackIn_73_0;
                              stackIn_75_0 = stackOut_73_0;
                              L37: {
                                if (stackIn_75_0 != 0) {
                                  break L37;
                                } else {
                                  ((ij) this).field_l = ((ij) this).field_l + 1;
                                  if (var5 == 0) {
                                    continue L36;
                                  } else {
                                    break L37;
                                  }
                                }
                              }
                              L38: {
                                if (250 > ((ij) this).field_y.field_b) {
                                  break L38;
                                } else {
                                  var2_int = 0;
                                  if (var5 == 0) {
                                    break L25;
                                  } else {
                                    break L38;
                                  }
                                }
                              }
                              L39: {
                                if (((ij) this).field_A[((ij) this).field_l] == 0) {
                                  em discarded$6 = this.a(param0 + 112, 1, ((ij) this).field_l);
                                  break L39;
                                } else {
                                  break L39;
                                }
                              }
                              L40: {
                                if (((ij) this).field_A[((ij) this).field_l] == 0) {
                                  var3 = new pi();
                                  var3.field_d = (long)((ij) this).field_l;
                                  var2_int = 0;
                                  ((ij) this).field_x.a((byte) -114, var3);
                                  break L40;
                                } else {
                                  break L40;
                                }
                              }
                              ((ij) this).field_l = ((ij) this).field_l + 1;
                              if (var5 == 0) {
                                continue L36;
                              } else {
                                break L25;
                              }
                            }
                          }
                        }
                      }
                      stackOut_94_0 = var2_int;
                      stackIn_95_0 = stackOut_94_0;
                      break L24;
                    }
                    if (stackIn_95_0 != 0) {
                      ((ij) this).field_l = 0;
                      ((ij) this).field_g = false;
                      break L1;
                    } else {
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
            L41: {
              L42: {
                if (!((ij) this).field_f) {
                  break L42;
                } else {
                  if (~sf.a((byte) -111) > ~((ij) this).field_s) {
                    break L42;
                  } else {
                    var2_ref = (em) (Object) ((ij) this).field_i.a(param0 ^ -16545);
                    L43: while (true) {
                      L44: {
                        if (null == var2_ref) {
                          break L44;
                        } else {
                          stackOut_104_0 = var2_ref.field_C;
                          stackIn_126_0 = stackOut_104_0 ? 1 : 0;
                          stackIn_105_0 = stackOut_104_0;
                          if (var5 != 0) {
                            break L41;
                          } else {
                            L45: {
                              L46: {
                                if (!stackIn_105_0) {
                                  break L46;
                                } else {
                                  if (var5 == 0) {
                                    break L45;
                                  } else {
                                    break L46;
                                  }
                                }
                              }
                              L47: {
                                if (!var2_ref.field_z) {
                                  break L47;
                                } else {
                                  if (!var2_ref.field_v) {
                                    throw new RuntimeException();
                                  } else {
                                    var2_ref.b(param0 ^ 34);
                                    if (var5 == 0) {
                                      break L45;
                                    } else {
                                      break L47;
                                    }
                                  }
                                }
                              }
                              var2_ref.field_z = true;
                              break L45;
                            }
                            var2_ref = (em) (Object) ((ij) this).field_i.a(true);
                            if (var5 == 0) {
                              continue L43;
                            } else {
                              break L44;
                            }
                          }
                        }
                      }
                      ((ij) this).field_s = sf.a((byte) 101) + 1000L;
                      break L42;
                    }
                  }
                }
              }
              stackOut_125_0 = param0;
              stackIn_126_0 = stackOut_125_0;
              break L41;
            }
            L48: {
              if (stackIn_126_0 == 0) {
                break L48;
              } else {
                ((ij) this).c(-80);
                break L48;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var2, "ij.B(" + param0 + ')');
        }
    }

    final static void a(boolean param0, sb param1) {
        try {
            RuntimeException runtimeException = null;
            byte[] var2 = null;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            int var5 = 0;
            byte stackIn_7_0 = 0;
            int stackIn_14_0 = 0;
            RuntimeException stackIn_27_0 = null;
            StringBuilder stackIn_27_1 = null;
            RuntimeException stackIn_29_0 = null;
            StringBuilder stackIn_29_1 = null;
            RuntimeException stackIn_30_0 = null;
            StringBuilder stackIn_30_1 = null;
            String stackIn_30_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            byte stackOut_6_0 = 0;
            int stackOut_13_0 = 0;
            RuntimeException stackOut_26_0 = null;
            StringBuilder stackOut_26_1 = null;
            RuntimeException stackOut_29_0 = null;
            StringBuilder stackOut_29_1 = null;
            String stackOut_29_2 = null;
            RuntimeException stackOut_27_0 = null;
            StringBuilder stackOut_27_1 = null;
            String stackOut_27_2 = null;
            var5 = MinerDisturbance.field_ab;
            try {
              L0: {
                L1: {
                  L2: {
                    var2 = new byte[24];
                    if (null != w.field_W) {
                      try {
                        L3: {
                          w.field_W.a((byte) 120, 0L);
                          w.field_W.a(var2, 119);
                          var3_int = 0;
                          L4: while (true) {
                            L5: {
                              L6: {
                                if (var3_int >= 24) {
                                  break L6;
                                } else {
                                  stackOut_6_0 = var2[var3_int];
                                  stackIn_14_0 = stackOut_6_0;
                                  stackIn_7_0 = stackOut_6_0;
                                  if (var5 != 0) {
                                    break L5;
                                  } else {
                                    if (stackIn_7_0 != 0) {
                                      break L6;
                                    } else {
                                      var3_int++;
                                      if (var5 == 0) {
                                        continue L4;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_13_0 = ~var3_int;
                              stackIn_14_0 = stackOut_13_0;
                              break L5;
                            }
                            if (stackIn_14_0 > -25) {
                              decompiledRegionSelector0 = 0;
                              break L3;
                            } else {
                              throw new IOException();
                            }
                          }
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L7: {
                          var3 = (Exception) (Object) decompiledCaughtException;
                          var4 = 0;
                          L8: while (true) {
                            L9: {
                              if (var4 >= 24) {
                                break L9;
                              } else {
                                var2[var4] = (byte) -1;
                                var4++;
                                if (var5 != 0) {
                                  decompiledRegionSelector0 = 1;
                                  break L7;
                                } else {
                                  if (var5 == 0) {
                                    continue L8;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                            decompiledRegionSelector0 = 0;
                            break L7;
                          }
                        }
                      }
                      if (decompiledRegionSelector0 == 0) {
                        break L2;
                      } else {
                        break L1;
                      }
                    } else {
                      break L2;
                    }
                  }
                  param1.a(0, 24, param0, var2);
                  break L1;
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L10: {
                runtimeException = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_26_0 = (RuntimeException) runtimeException;
                stackOut_26_1 = new StringBuilder().append("ij.E(").append(param0).append(',');
                stackIn_29_0 = stackOut_26_0;
                stackIn_29_1 = stackOut_26_1;
                stackIn_27_0 = stackOut_26_0;
                stackIn_27_1 = stackOut_26_1;
                if (param1 == null) {
                  stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
                  stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
                  stackOut_29_2 = "null";
                  stackIn_30_0 = stackOut_29_0;
                  stackIn_30_1 = stackOut_29_1;
                  stackIn_30_2 = stackOut_29_2;
                  break L10;
                } else {
                  stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
                  stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
                  stackOut_27_2 = "{...}";
                  stackIn_30_0 = stackOut_27_0;
                  stackIn_30_1 = stackOut_27_1;
                  stackIn_30_2 = stackOut_27_2;
                  break L10;
                }
              }
              throw lj.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(byte param0) {
        RuntimeException var2 = null;
        pi var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        byte stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        var4 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (null != ((ij) this).field_x) {
              if (((ij) this).a((byte) 53) != null) {
                var2_ref = ((ij) this).field_r.b(111);
                L1: while (true) {
                  L2: {
                    L3: {
                      if (var2_ref == null) {
                        break L3;
                      } else {
                        var3 = (int)var2_ref.field_d;
                        stackOut_7_0 = -1;
                        stackOut_7_1 = ~var3;
                        stackIn_36_0 = stackOut_7_0;
                        stackIn_36_1 = stackOut_7_1;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        if (var4 != 0) {
                          break L2;
                        } else {
                          L4: {
                            L5: {
                              L6: {
                                if (stackIn_8_0 < stackIn_8_1) {
                                  break L6;
                                } else {
                                  if (~((ij) this).field_w.field_c >= ~var3) {
                                    break L6;
                                  } else {
                                    if (((ij) this).field_w.field_d[var3] == 0) {
                                      break L6;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                              }
                              var2_ref.b(34);
                              if (var4 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                            L7: {
                              if (((ij) this).field_A[var3] == 0) {
                                em discarded$2 = this.a(103, 1, var3);
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            L8: {
                              if (-1 == ((ij) this).field_A[var3]) {
                                em discarded$3 = this.a(92, 2, var3);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            if (1 == ((ij) this).field_A[var3]) {
                              var2_ref.b(34);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          var2_ref = ((ij) this).field_r.b((byte) 56);
                          if (var4 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    stackOut_35_0 = param0;
                    stackOut_35_1 = 1;
                    stackIn_36_0 = stackOut_35_0;
                    stackIn_36_1 = stackOut_35_1;
                    break L2;
                  }
                  L9: {
                    if (stackIn_36_0 >= stackIn_36_1) {
                      break L9;
                    } else {
                      ((ij) this).field_w = null;
                      break L9;
                    }
                  }
                  break L0;
                }
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
          throw lj.a((Throwable) (Object) var2, "ij.C(" + param0 + ')');
        }
    }

    final void b(int param0) {
        int var2_int = -5 / ((33 - param0) / 58);
        if (null == ((ij) this).field_k) {
            return;
        }
        try {
            ((ij) this).field_m = true;
            if (null == ((ij) this).field_x) {
                ((ij) this).field_x = new ta();
            }
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "ij.D(" + param0 + ')');
        }
    }

    private final em a(int param0, int param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var6_int = 0;
        byte[] var7 = null;
        int var7_int = 0;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_29_0 = null;
        Object stackIn_55_0 = null;
        Object stackIn_64_0 = null;
        byte stackIn_85_0 = 0;
        byte stackIn_85_1 = 0;
        int stackIn_92_0 = 0;
        int stackIn_92_1 = 0;
        Object stackIn_106_0 = null;
        Object stackIn_113_0 = null;
        byte stackIn_130_0 = 0;
        byte stackIn_130_1 = 0;
        Object stackIn_144_0 = null;
        byte stackIn_149_0 = 0;
        int stackIn_149_1 = 0;
        Object stackIn_156_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_28_0 = null;
        Object stackOut_54_0 = null;
        Object stackOut_63_0 = null;
        byte stackOut_129_0 = 0;
        byte stackOut_129_1 = 0;
        Object stackOut_143_0 = null;
        byte stackOut_148_0 = 0;
        int stackOut_148_1 = 0;
        Object stackOut_155_0 = null;
        byte stackOut_84_0 = 0;
        byte stackOut_84_1 = 0;
        int stackOut_91_0 = 0;
        int stackOut_91_1 = 0;
        Object stackOut_105_0 = null;
        Object stackOut_112_0 = null;
        var10 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (param0 >= 86) {
                break L1;
              } else {
                ((ij) this).b(-36);
                break L1;
              }
            }
            L2: {
              var4 = (Object) (Object) (em) (Object) ((ij) this).field_i.a((long)param2, -27109);
              if (null == var4) {
                break L2;
              } else {
                if (0 != param1) {
                  break L2;
                } else {
                  if (((em) var4).field_v) {
                    break L2;
                  } else {
                    if (!((em) var4).field_C) {
                      break L2;
                    } else {
                      ((em) var4).b(34);
                      var4 = null;
                      break L2;
                    }
                  }
                }
              }
            }
            L3: {
              if (var4 != null) {
                break L3;
              } else {
                L4: {
                  L5: {
                    if (0 != param1) {
                      break L5;
                    } else {
                      L6: {
                        L7: {
                          if (null == ((ij) this).field_k) {
                            break L7;
                          } else {
                            if (-1 != ((ij) this).field_A[param2]) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        if (!((ij) this).field_j.d((byte) -111)) {
                          var4 = (Object) (Object) ((ij) this).field_j.a((byte) 2, -21, true, param2, ((ij) this).field_u);
                          if (var10 == 0) {
                            break L4;
                          } else {
                            break L6;
                          }
                        } else {
                          stackOut_28_0 = null;
                          stackIn_29_0 = stackOut_28_0;
                          return (em) (Object) stackIn_29_0;
                        }
                      }
                      var4 = (Object) (Object) ((ij) this).field_y.a((byte) 54, param2, ((ij) this).field_k);
                      if (var10 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L8: {
                    if (param1 != 1) {
                      break L8;
                    } else {
                      if (((ij) this).field_k != null) {
                        var4 = (Object) (Object) ((ij) this).field_y.a(param2, false, ((ij) this).field_k);
                        if (var10 == 0) {
                          break L4;
                        } else {
                          break L8;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                  L9: {
                    if (param1 != 2) {
                      break L9;
                    } else {
                      if (null != ((ij) this).field_k) {
                        if (((ij) this).field_A[param2] != -1) {
                          throw new RuntimeException();
                        } else {
                          if (!((ij) this).field_j.c((byte) -68)) {
                            var4 = (Object) (Object) ((ij) this).field_j.a((byte) 2, -21, false, param2, ((ij) this).field_u);
                            if (var10 == 0) {
                              break L4;
                            } else {
                              break L9;
                            }
                          } else {
                            stackOut_54_0 = null;
                            stackIn_55_0 = stackOut_54_0;
                            return (em) (Object) stackIn_55_0;
                          }
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                  throw new RuntimeException();
                }
                ((ij) this).field_i.a(0, (long)param2, (pi) var4);
                break L3;
              }
            }
            if (((em) var4).field_C) {
              stackOut_63_0 = null;
              stackIn_64_0 = stackOut_63_0;
              return (em) (Object) stackIn_64_0;
            } else {
              var5 = ((em) var4).c((byte) -115);
              if (!(var4 instanceof vl)) {
                try {
                  L10: {
                    L11: {
                      if (var5 == null) {
                        break L11;
                      } else {
                        if (var5.length > 2) {
                          wa.field_b.reset();
                          wa.field_b.update(var5, 0, var5.length + -2);
                          var6_int = (int)wa.field_b.getValue();
                          if (((ij) this).field_w.field_h[param2] == var6_int) {
                            L12: {
                              if (null == ((ij) this).field_w.field_l) {
                                break L12;
                              } else {
                                if (null == ((ij) this).field_w.field_l[param2]) {
                                  break L12;
                                } else {
                                  var7 = ((ij) this).field_w.field_l[param2];
                                  var8 = wb.a(var5.length + -2, 0, var5, 18738);
                                  var9 = 0;
                                  L13: while (true) {
                                    if (64 <= var9) {
                                      break L12;
                                    } else {
                                      stackOut_129_0 = var8[var9];
                                      stackOut_129_1 = var7[var9];
                                      stackIn_149_0 = stackOut_129_0;
                                      stackIn_149_1 = stackOut_129_1;
                                      stackIn_130_0 = stackOut_129_0;
                                      stackIn_130_1 = stackOut_129_1;
                                      if (var10 != 0) {
                                        decompiledRegionSelector0 = 0;
                                        break L10;
                                      } else {
                                        if (stackIn_130_0 == stackIn_130_1) {
                                          var9++;
                                          if (var10 == 0) {
                                            continue L13;
                                          } else {
                                            break L12;
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
                            ((ij) this).field_j.field_o = 0;
                            ((ij) this).field_j.field_j = 0;
                            decompiledRegionSelector0 = 1;
                            break L10;
                          } else {
                            throw new RuntimeException();
                          }
                        } else {
                          break L11;
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L14: {
                    var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                    ((ij) this).field_j.d(20);
                    ((em) var4).b(34);
                    if (!((em) var4).field_v) {
                      break L14;
                    } else {
                      if (((ij) this).field_j.d((byte) -111)) {
                        break L14;
                      } else {
                        var4 = (Object) (Object) ((ij) this).field_j.a((byte) 2, -21, true, param2, ((ij) this).field_u);
                        ((ij) this).field_i.a(0, (long)param2, (pi) var4);
                        break L14;
                      }
                    }
                  }
                  stackOut_143_0 = null;
                  stackIn_144_0 = stackOut_143_0;
                  return (em) (Object) stackIn_144_0;
                }
                L15: {
                  L16: {
                    if (decompiledRegionSelector0 == 0) {
                      break L16;
                    } else {
                      var5[-2 + var5.length] = (byte)(((ij) this).field_w.field_q[param2] >>> 800997800);
                      var5[-1 + var5.length] = (byte)((ij) this).field_w.field_q[param2];
                      if (null != ((ij) this).field_k) {
                        vl discarded$1 = ((ij) this).field_y.a(((ij) this).field_k, false, var5, param2);
                        stackOut_148_0 = ((ij) this).field_A[param2];
                        stackOut_148_1 = 1;
                        stackIn_149_0 = stackOut_148_0;
                        stackIn_149_1 = stackOut_148_1;
                        break L16;
                      } else {
                        break L15;
                      }
                    }
                  }
                  if (stackIn_149_0 == stackIn_149_1) {
                    break L15;
                  } else {
                    ((ij) this).field_A[param2] = (byte) 1;
                    break L15;
                  }
                }
                L17: {
                  if (((em) var4).field_v) {
                    break L17;
                  } else {
                    ((em) var4).b(34);
                    break L17;
                  }
                }
                stackOut_155_0 = var4;
                stackIn_156_0 = stackOut_155_0;
                break L0;
              } else {
                try {
                  L18: {
                    L19: {
                      if (var5 == null) {
                        break L19;
                      } else {
                        if (2 < var5.length) {
                          wa.field_b.reset();
                          wa.field_b.update(var5, 0, -2 + var5.length);
                          var6_int = (int)wa.field_b.getValue();
                          if (((ij) this).field_w.field_h[param2] != var6_int) {
                            throw new RuntimeException();
                          } else {
                            L20: {
                              L21: {
                                if (((ij) this).field_w.field_l == null) {
                                  break L21;
                                } else {
                                  if (((ij) this).field_w.field_l[param2] != null) {
                                    var7 = ((ij) this).field_w.field_l[param2];
                                    var8 = wb.a(var5.length + -2, 0, var5, 18738);
                                    var9 = 0;
                                    L22: while (true) {
                                      if (var9 >= 64) {
                                        break L21;
                                      } else {
                                        stackOut_84_0 = var7[var9];
                                        stackOut_84_1 = var8[var9];
                                        stackIn_92_0 = stackOut_84_0;
                                        stackIn_92_1 = stackOut_84_1;
                                        stackIn_85_0 = stackOut_84_0;
                                        stackIn_85_1 = stackOut_84_1;
                                        if (var10 != 0) {
                                          break L20;
                                        } else {
                                          if (stackIn_85_0 == stackIn_85_1) {
                                            var9++;
                                            if (var10 == 0) {
                                              continue L22;
                                            } else {
                                              break L21;
                                            }
                                          } else {
                                            throw new RuntimeException();
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    break L21;
                                  }
                                }
                              }
                              stackOut_91_0 = (255 & var5[var5.length - 2]) << -1987179032;
                              stackOut_91_1 = -(255 & var5[-1 + var5.length]);
                              stackIn_92_0 = stackOut_91_0;
                              stackIn_92_1 = stackOut_91_1;
                              break L20;
                            }
                            var7_int = stackIn_92_0 - stackIn_92_1;
                            if (~var7_int != ~(((ij) this).field_w.field_q[param2] & 65535)) {
                              throw new RuntimeException();
                            } else {
                              L23: {
                                if (1 != ((ij) this).field_A[param2]) {
                                  L24: {
                                    if (((ij) this).field_A[param2] == 0) {
                                      break L24;
                                    } else {
                                      break L24;
                                    }
                                  }
                                  ((ij) this).field_A[param2] = (byte) 1;
                                  break L23;
                                } else {
                                  break L23;
                                }
                              }
                              L25: {
                                if (!((em) var4).field_v) {
                                  ((em) var4).b(34);
                                  break L25;
                                } else {
                                  break L25;
                                }
                              }
                              stackOut_105_0 = var4;
                              stackIn_106_0 = stackOut_105_0;
                              break L18;
                            }
                          }
                        } else {
                          break L19;
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L26: {
                    var6 = (Exception) (Object) decompiledCaughtException;
                    ((ij) this).field_A[param2] = (byte) -1;
                    ((em) var4).b(34);
                    if (((em) var4).field_v) {
                      if (((ij) this).field_j.d((byte) -111)) {
                        break L26;
                      } else {
                        var4 = (Object) (Object) ((ij) this).field_j.a((byte) 2, -21, true, param2, ((ij) this).field_u);
                        ((ij) this).field_i.a(0, (long)param2, (pi) var4);
                        break L26;
                      }
                    } else {
                      break L26;
                    }
                  }
                  stackOut_112_0 = null;
                  stackIn_113_0 = stackOut_112_0;
                  return (em) (Object) stackIn_113_0;
                }
                return (em) (Object) stackIn_106_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (Object) (Object) decompiledCaughtException;
          throw lj.a((Throwable) var4, "ij.G(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return (em) (Object) stackIn_156_0;
    }

    public static void a(boolean param0) {
        try {
            field_o = null;
            field_t = null;
            if (!param0) {
                field_t = null;
            }
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "ij.H(" + param0 + ')');
        }
    }

    final int a(byte param0, int param1) {
        em var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 >= 62) {
                break L1;
              } else {
                ((ij) this).c(25);
                break L1;
              }
            }
            var3 = (em) (Object) ((ij) this).field_i.a((long)param1, -27109);
            if (null != var3) {
              stackOut_6_0 = var3.f(100);
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
          throw lj.a((Throwable) (Object) var3_ref, "ij.I(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    ij(int param0, uh param1, uh param2, ch param3, nm param4, int param5, byte[] param6, int param7, boolean param8) {
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
        ((ij) this).field_i = new tg(16);
        ((ij) this).field_l = 0;
        ((ij) this).field_r = new ta();
        ((ij) this).field_s = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((ij) this).field_u = param0;
                ((ij) this).field_k = param1;
                if (((ij) this).field_k != null) {
                  break L2;
                } else {
                  ((ij) this).field_g = false;
                  if (MinerDisturbance.field_ab == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((ij) this).field_g = true;
              ((ij) this).field_x = new ta();
              break L1;
            }
            L3: {
              ((ij) this).field_j = param3;
              ((ij) this).field_f = param8;
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var10;
            stackOut_9_1 = new StringBuilder().append("ij.<init>(").append(param0).append(',');
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
          throw lj.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param7 + ',' + param8 + ')');
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
