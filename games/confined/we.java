/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class we {
    int[] field_o;
    int[] field_t;
    int[] field_q;
    ni field_h;
    int[] field_l;
    int field_m;
    int field_i;
    int field_s;
    private int field_p;
    static int field_g;
    static bi field_b;
    byte[][] field_d;
    int[] field_u;
    ni[] field_j;
    private int[][] field_f;
    private byte[] field_n;
    static int field_k;
    int[][] field_r;
    static int field_c;
    static int field_a;
    private int[] field_e;

    public static void a(byte param0) {
        field_b = null;
        if (param0 != -21) {
            mi discarded$0 = we.a(86, false, (byte) 113, true, -103, true);
        }
    }

    final static mi a(int param0, boolean param1, byte param2, boolean param3, int param4, boolean param5) {
        try {
            Object var6 = null;
            Object var7 = null;
            tj var8 = null;
            mi stackIn_15_0 = null;
            Throwable decompiledCaughtException = null;
            mi stackOut_14_0 = null;
            try {
              L0: {
                L1: {
                  if (param2 < -44) {
                    break L1;
                  } else {
                    we.a((byte) -3);
                    break L1;
                  }
                }
                L2: {
                  var6 = null;
                  var7 = null;
                  if (ek.field_p.field_t == null) {
                    break L2;
                  } else {
                    gd.field_q = new pf(ek.field_p.field_t, 5200, 0);
                    ek.field_p.field_t = null;
                    var6 = (Object) (Object) new ae(255, gd.field_q, new pf(ek.field_p.field_v, 12000, 0), 2097152);
                    break L2;
                  }
                }
                L3: {
                  if (null == gd.field_q) {
                    break L3;
                  } else {
                    L4: {
                      if (vh.field_e != null) {
                        break L4;
                      } else {
                        vh.field_e = new pf[ek.field_p.field_d.length];
                        break L4;
                      }
                    }
                    L5: {
                      if (vh.field_e[param0] == null) {
                        vh.field_e[param0] = new pf(ek.field_p.field_d[param0], 12000, 0);
                        ek.field_p.field_d[param0] = null;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var7 = (Object) (Object) new ae(param0, gd.field_q, vh.field_e[param0], 2097152);
                    break L3;
                  }
                }
                L6: {
                  var8 = dh.field_vb.a((ae) var6, (byte) -60, false, param0, (ae) var7);
                  if (param5) {
                    var8.b(-2);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                stackOut_14_0 = new mi((tk) (Object) var8, true, param4);
                stackIn_15_0 = stackOut_14_0;
                break L0;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Object) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) var6).toString());
            }
            return stackIn_15_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(int param0, byte[] param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        kg var17 = null;
        byte[] var21 = null;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_98_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        String stackOut_96_2 = null;
        var16 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var17 = new kg(tm.a(-64, param1));
              var4 = var17.c(32);
              if (var4 < 5) {
                break L1;
              } else {
                if (var4 > 7) {
                  break L1;
                } else {
                  L2: {
                    if (var4 >= 6) {
                      ((we) this).field_m = var17.f((byte) 50);
                      break L2;
                    } else {
                      ((we) this).field_m = 0;
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.c(32);
                    if ((var5 & 1) == 0) {
                      stackOut_10_0 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      break L3;
                    } else {
                      stackOut_9_0 = 1;
                      stackIn_11_0 = stackOut_9_0;
                      break L3;
                    }
                  }
                  L4: {
                    var6 = stackIn_11_0;
                    if (7 > var4) {
                      ((we) this).field_p = var17.a((byte) 25);
                      break L4;
                    } else {
                      ((we) this).field_p = var17.j((byte) 119);
                      break L4;
                    }
                  }
                  L5: {
                    if ((2 & var5) == 0) {
                      stackOut_16_0 = 0;
                      stackIn_17_0 = stackOut_16_0;
                      break L5;
                    } else {
                      stackOut_15_0 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      break L5;
                    }
                  }
                  L6: {
                    var7 = stackIn_17_0;
                    var8 = 0;
                    ((we) this).field_u = new int[((we) this).field_p];
                    var9 = -1;
                    if (7 > var4) {
                      var10 = 0;
                      L7: while (true) {
                        if (((we) this).field_p <= var10) {
                          break L6;
                        } else {
                          L8: {
                            int dupTemp$4 = var8 + var17.a((byte) 25);
                            var8 = dupTemp$4;
                            ((we) this).field_u[var10] = dupTemp$4;
                            if (((we) this).field_u[var10] > var9) {
                              var9 = ((we) this).field_u[var10];
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          var10++;
                          continue L7;
                        }
                      }
                    } else {
                      var10 = 0;
                      L9: while (true) {
                        if (var10 >= ((we) this).field_p) {
                          break L6;
                        } else {
                          L10: {
                            int dupTemp$5 = var8 + var17.j((byte) -19);
                            var8 = dupTemp$5;
                            ((we) this).field_u[var10] = dupTemp$5;
                            if (var9 >= ((we) this).field_u[var10]) {
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          var10++;
                          continue L9;
                        }
                      }
                    }
                  }
                  L11: {
                    ((we) this).field_i = 1 + var9;
                    ((we) this).field_q = new int[((we) this).field_i];
                    ((we) this).field_t = new int[((we) this).field_i];
                    if (var7 != 0) {
                      ((we) this).field_d = new byte[((we) this).field_i][];
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    ((we) this).field_r = new int[((we) this).field_i][];
                    ((we) this).field_o = new int[((we) this).field_i];
                    ((we) this).field_l = new int[((we) this).field_i];
                    if (var6 == 0) {
                      break L12;
                    } else {
                      ((we) this).field_e = new int[((we) this).field_i];
                      var10 = 0;
                      L13: while (true) {
                        if (((we) this).field_i <= var10) {
                          var10 = 0;
                          L14: while (true) {
                            if (var10 >= ((we) this).field_p) {
                              ((we) this).field_h = new ni(((we) this).field_e);
                              break L12;
                            } else {
                              ((we) this).field_e[((we) this).field_u[var10]] = var17.f((byte) 79);
                              var10++;
                              continue L14;
                            }
                          }
                        } else {
                          ((we) this).field_e[var10] = -1;
                          var10++;
                          continue L13;
                        }
                      }
                    }
                  }
                  var10 = 0;
                  L15: while (true) {
                    if (var10 >= ((we) this).field_p) {
                      L16: {
                        if (var7 != 0) {
                          var10 = 0;
                          L17: while (true) {
                            if (var10 >= ((we) this).field_p) {
                              var10 = 0;
                              L18: while (true) {
                                if (((we) this).field_p <= var10) {
                                  break L16;
                                } else {
                                  ((we) this).field_o[((we) this).field_u[var10]] = var17.f((byte) 88);
                                  var10++;
                                  continue L18;
                                }
                              }
                            } else {
                              var21 = new byte[64];
                              var17.a(0, (byte) 72, 64, var21);
                              ((we) this).field_d[((we) this).field_u[var10]] = var21;
                              var10++;
                              continue L17;
                            }
                          }
                        } else {
                          var10 = 0;
                          L19: while (true) {
                            if (((we) this).field_p <= var10) {
                              break L16;
                            } else {
                              ((we) this).field_o[((we) this).field_u[var10]] = var17.f((byte) 88);
                              var10++;
                              continue L19;
                            }
                          }
                        }
                      }
                      L20: {
                        if (var4 >= 7) {
                          var10 = 0;
                          L21: while (true) {
                            if (var10 >= ((we) this).field_p) {
                              var10 = 0;
                              L22: while (true) {
                                if (((we) this).field_p <= var10) {
                                  break L20;
                                } else {
                                  var11 = ((we) this).field_u[var10];
                                  var8 = 0;
                                  var12 = ((we) this).field_t[var11];
                                  ((we) this).field_r[var11] = new int[var12];
                                  var13 = -1;
                                  var14 = 0;
                                  L23: while (true) {
                                    if (var12 <= var14) {
                                      L24: {
                                        ((we) this).field_q[var11] = var13 - -1;
                                        if (var12 != var13 + 1) {
                                          break L24;
                                        } else {
                                          ((we) this).field_r[var11] = null;
                                          break L24;
                                        }
                                      }
                                      var10++;
                                      continue L22;
                                    } else {
                                      L25: {
                                        int dupTemp$6 = var8 + var17.j((byte) 108);
                                        var8 = dupTemp$6;
                                        ((we) this).field_r[var11][var14] = dupTemp$6;
                                        var15 = dupTemp$6;
                                        if (var13 >= var15) {
                                          break L25;
                                        } else {
                                          break L25;
                                        }
                                      }
                                      var14++;
                                      continue L23;
                                    }
                                  }
                                }
                              }
                            } else {
                              ((we) this).field_t[((we) this).field_u[var10]] = var17.j((byte) -73);
                              var10++;
                              continue L21;
                            }
                          }
                        } else {
                          var10 = 0;
                          L26: while (true) {
                            if (var10 >= ((we) this).field_p) {
                              var10 = 0;
                              L27: while (true) {
                                if (var10 >= ((we) this).field_p) {
                                  break L20;
                                } else {
                                  var11 = ((we) this).field_u[var10];
                                  var12 = ((we) this).field_t[var11];
                                  var8 = 0;
                                  ((we) this).field_r[var11] = new int[var12];
                                  var13 = -1;
                                  var14 = 0;
                                  L28: while (true) {
                                    if (var14 >= var12) {
                                      L29: {
                                        ((we) this).field_q[var11] = 1 + var13;
                                        if (1 + var13 == var12) {
                                          ((we) this).field_r[var11] = null;
                                          break L29;
                                        } else {
                                          break L29;
                                        }
                                      }
                                      var10++;
                                      continue L27;
                                    } else {
                                      L30: {
                                        int dupTemp$7 = var8 + var17.a((byte) 25);
                                        var8 = dupTemp$7;
                                        ((we) this).field_r[var11][var14] = dupTemp$7;
                                        var15 = dupTemp$7;
                                        if (var15 <= var13) {
                                          break L30;
                                        } else {
                                          break L30;
                                        }
                                      }
                                      var14++;
                                      continue L28;
                                    }
                                  }
                                }
                              }
                            } else {
                              ((we) this).field_t[((we) this).field_u[var10]] = var17.a((byte) 25);
                              var10++;
                              continue L26;
                            }
                          }
                        }
                      }
                      L31: {
                        if (var6 == 0) {
                          break L31;
                        } else {
                          ((we) this).field_j = new ni[1 + var9];
                          ((we) this).field_f = new int[var9 + 1][];
                          var10 = 0;
                          L32: while (true) {
                            if (((we) this).field_p <= var10) {
                              break L31;
                            } else {
                              var11 = ((we) this).field_u[var10];
                              var12 = ((we) this).field_t[var11];
                              ((we) this).field_f[var11] = new int[((we) this).field_q[var11]];
                              var13 = 0;
                              L33: while (true) {
                                if (((we) this).field_q[var11] <= var13) {
                                  var13 = 0;
                                  L34: while (true) {
                                    if (var12 <= var13) {
                                      ((we) this).field_j[var11] = new ni(((we) this).field_f[var11]);
                                      var10++;
                                      continue L32;
                                    } else {
                                      L35: {
                                        if (((we) this).field_r[var11] == null) {
                                          var14 = var13;
                                          break L35;
                                        } else {
                                          var14 = ((we) this).field_r[var11][var13];
                                          break L35;
                                        }
                                      }
                                      ((we) this).field_f[var11][var14] = var17.f((byte) 101);
                                      var13++;
                                      continue L34;
                                    }
                                  }
                                } else {
                                  ((we) this).field_f[var11][var13] = -1;
                                  var13++;
                                  continue L33;
                                }
                              }
                            }
                          }
                        }
                      }
                      break L0;
                    } else {
                      ((we) this).field_l[((we) this).field_u[var10]] = var17.f((byte) 116);
                      var10++;
                      continue L15;
                    }
                  }
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L36: {
            var3 = decompiledCaughtException;
            stackOut_95_0 = (RuntimeException) var3;
            stackOut_95_1 = new StringBuilder().append("we.C(").append(0).append(44);
            stackIn_97_0 = stackOut_95_0;
            stackIn_97_1 = stackOut_95_1;
            stackIn_96_0 = stackOut_95_0;
            stackIn_96_1 = stackOut_95_1;
            if (param1 == null) {
              stackOut_97_0 = (RuntimeException) (Object) stackIn_97_0;
              stackOut_97_1 = (StringBuilder) (Object) stackIn_97_1;
              stackOut_97_2 = "null";
              stackIn_98_0 = stackOut_97_0;
              stackIn_98_1 = stackOut_97_1;
              stackIn_98_2 = stackOut_97_2;
              break L36;
            } else {
              stackOut_96_0 = (RuntimeException) (Object) stackIn_96_0;
              stackOut_96_1 = (StringBuilder) (Object) stackIn_96_1;
              stackOut_96_2 = "{...}";
              stackIn_98_0 = stackOut_96_0;
              stackIn_98_1 = stackOut_96_1;
              stackIn_98_2 = stackOut_96_2;
              break L36;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_98_0, stackIn_98_2 + 41);
        }
    }

    we(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            ((we) this).field_s = in.a(param0.length, param0, -127);
            if (((we) this).field_s != param1) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (param2.length != 64) {
                    throw new RuntimeException();
                }
                ((we) this).field_n = in.a(0, param0, param0.length, -26879);
                for (var4_int = 0; var4_int < 64; var4_int++) {
                    if (((we) this).field_n[var4_int] != param2[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(0, param0);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "we.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
