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
            ae var6 = null;
            IOException var6_ref = null;
            ae var7 = null;
            tj var8 = null;
            mi stackIn_15_0 = null;
            Throwable decompiledCaughtException = null;
            mi stackOut_14_0 = null;
            try {
              L0: {
                if (param2 < -44) {
                  break L0;
                } else {
                  we.a((byte) -3);
                  break L0;
                }
              }
              L1: {
                var6 = null;
                var7 = null;
                if (ek.field_p.field_t == null) {
                  break L1;
                } else {
                  gd.field_q = new pf(ek.field_p.field_t, 5200, 0);
                  ek.field_p.field_t = null;
                  var6 = new ae(255, gd.field_q, new pf(ek.field_p.field_v, 12000, 0), 2097152);
                  break L1;
                }
              }
              L2: {
                if (null == gd.field_q) {
                  break L2;
                } else {
                  L3: {
                    if (vh.field_e != null) {
                      break L3;
                    } else {
                      vh.field_e = new pf[ek.field_p.field_d.length];
                      break L3;
                    }
                  }
                  L4: {
                    if (vh.field_e[param0] == null) {
                      vh.field_e[param0] = new pf(ek.field_p.field_d[param0], 12000, 0);
                      ek.field_p.field_d[param0] = null;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var7 = new ae(param0, gd.field_q, vh.field_e[param0], 2097152);
                  break L2;
                }
              }
              L5: {
                var8 = dh.field_vb.a(var6, (byte) -60, param1, param0, var7);
                if (param5) {
                  var8.b(-2);
                  break L5;
                } else {
                  break L5;
                }
              }
              stackOut_14_0 = new mi((tk) (Object) var8, param3, param4);
              stackIn_15_0 = stackOut_14_0;
            } catch (java.io.IOException decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_15_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    private final void a(int param0, byte[] param1) {
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
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        L0: {
          var16 = Confined.field_J ? 1 : 0;
          var17 = new kg(tm.a(-64, param1));
          var4 = var17.c(32);
          if (-6 < (var4 ^ -1)) {
            break L0;
          } else {
            if ((var4 ^ -1) < -8) {
              break L0;
            } else {
              L1: {
                if ((var4 ^ -1) <= -7) {
                  ((we) this).field_m = var17.f((byte) 50);
                  break L1;
                } else {
                  ((we) this).field_m = 0;
                  break L1;
                }
              }
              L2: {
                var5 = var17.c(32);
                if (-1 == (var5 & 1 ^ -1)) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              L3: {
                var6 = stackIn_10_0;
                if (7 > var4) {
                  ((we) this).field_p = var17.a((byte) 25);
                  break L3;
                } else {
                  ((we) this).field_p = var17.j((byte) 119);
                  break L3;
                }
              }
              L4: {
                if (-1 == (2 & var5 ^ -1)) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L4;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L4;
                }
              }
              L5: {
                var7 = stackIn_16_0;
                var8 = 0;
                ((we) this).field_u = new int[((we) this).field_p];
                var9 = -1;
                if (7 > var4) {
                  var10 = 0;
                  L6: while (true) {
                    if (((we) this).field_p <= var10) {
                      break L5;
                    } else {
                      var8 = var8 + var17.a((byte) 25);
                      ((we) this).field_u[var10] = var8 + var17.a((byte) 25);
                      if (((we) this).field_u[var10] > var9) {
                        var9 = ((we) this).field_u[var10];
                        var10++;
                        continue L6;
                      } else {
                        var10++;
                        continue L6;
                      }
                    }
                  }
                } else {
                  var10 = 0;
                  L7: while (true) {
                    if (var10 >= ((we) this).field_p) {
                      break L5;
                    } else {
                      var8 = var8 + var17.j((byte) -19);
                      ((we) this).field_u[var10] = var8 + var17.j((byte) -19);
                      if (var9 < ((we) this).field_u[var10]) {
                        var9 = ((we) this).field_u[var10];
                        var10++;
                        continue L7;
                      } else {
                        var10++;
                        continue L7;
                      }
                    }
                  }
                }
              }
              L8: {
                ((we) this).field_i = 1 + var9;
                ((we) this).field_q = new int[((we) this).field_i];
                ((we) this).field_t = new int[((we) this).field_i];
                if (var7 != 0) {
                  ((we) this).field_d = new byte[((we) this).field_i][];
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                ((we) this).field_r = new int[((we) this).field_i][];
                ((we) this).field_o = new int[((we) this).field_i];
                ((we) this).field_l = new int[((we) this).field_i];
                if (var6 == 0) {
                  break L9;
                } else {
                  ((we) this).field_e = new int[((we) this).field_i];
                  var10 = 0;
                  L10: while (true) {
                    if (((we) this).field_i <= var10) {
                      var10 = 0;
                      L11: while (true) {
                        if (var10 >= ((we) this).field_p) {
                          ((we) this).field_h = new ni(((we) this).field_e);
                          break L9;
                        } else {
                          ((we) this).field_e[((we) this).field_u[var10]] = var17.f((byte) 79);
                          var10++;
                          continue L11;
                        }
                      }
                    } else {
                      ((we) this).field_e[var10] = -1;
                      var10++;
                      continue L10;
                    }
                  }
                }
              }
              var10 = 0;
              L12: while (true) {
                if (var10 >= ((we) this).field_p) {
                  L13: {
                    if (var7 != 0) {
                      var10 = 0;
                      L14: while (true) {
                        if (var10 >= ((we) this).field_p) {
                          var10 = param0;
                          L15: while (true) {
                            if (((we) this).field_p <= var10) {
                              break L13;
                            } else {
                              ((we) this).field_o[((we) this).field_u[var10]] = var17.f((byte) 88);
                              var10++;
                              continue L15;
                            }
                          }
                        } else {
                          var21 = new byte[64];
                          var17.a(0, (byte) 72, 64, var21);
                          ((we) this).field_d[((we) this).field_u[var10]] = var21;
                          var10++;
                          continue L14;
                        }
                      }
                    } else {
                      var10 = param0;
                      L16: while (true) {
                        if (((we) this).field_p <= var10) {
                          break L13;
                        } else {
                          ((we) this).field_o[((we) this).field_u[var10]] = var17.f((byte) 88);
                          var10++;
                          continue L16;
                        }
                      }
                    }
                  }
                  L17: {
                    if ((var4 ^ -1) <= -8) {
                      var10 = 0;
                      L18: while (true) {
                        if (var10 >= ((we) this).field_p) {
                          var10 = 0;
                          L19: while (true) {
                            if (((we) this).field_p <= var10) {
                              break L17;
                            } else {
                              var11 = ((we) this).field_u[var10];
                              var8 = 0;
                              var12 = ((we) this).field_t[var11];
                              ((we) this).field_r[var11] = new int[var12];
                              var13 = -1;
                              var14 = 0;
                              L20: while (true) {
                                if (var12 <= var14) {
                                  ((we) this).field_q[var11] = var13 - -1;
                                  if (var12 == var13 + 1) {
                                    ((we) this).field_r[var11] = null;
                                    var10++;
                                    continue L19;
                                  } else {
                                    var10++;
                                    continue L19;
                                  }
                                } else {
                                  var8 = var8 + var17.j((byte) 108);
                                  ((we) this).field_r[var11][var14] = var8 + var17.j((byte) 108);
                                  var15 = var8 + var17.j((byte) 108);
                                  if (var13 < var15) {
                                    var13 = var15;
                                    var14++;
                                    continue L20;
                                  } else {
                                    var14++;
                                    continue L20;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          ((we) this).field_t[((we) this).field_u[var10]] = var17.j((byte) -73);
                          var10++;
                          continue L18;
                        }
                      }
                    } else {
                      var10 = 0;
                      L21: while (true) {
                        if (var10 >= ((we) this).field_p) {
                          var10 = 0;
                          L22: while (true) {
                            if (var10 >= ((we) this).field_p) {
                              break L17;
                            } else {
                              var11 = ((we) this).field_u[var10];
                              var12 = ((we) this).field_t[var11];
                              var8 = 0;
                              ((we) this).field_r[var11] = new int[var12];
                              var13 = -1;
                              var14 = 0;
                              L23: while (true) {
                                if (var14 >= var12) {
                                  ((we) this).field_q[var11] = 1 + var13;
                                  if (1 + var13 == var12) {
                                    ((we) this).field_r[var11] = null;
                                    var10++;
                                    continue L22;
                                  } else {
                                    var10++;
                                    continue L22;
                                  }
                                } else {
                                  var8 = var8 + var17.a((byte) 25);
                                  ((we) this).field_r[var11][var14] = var8 + var17.a((byte) 25);
                                  var15 = var8 + var17.a((byte) 25);
                                  if (var15 > var13) {
                                    var13 = var15;
                                    var14++;
                                    continue L23;
                                  } else {
                                    var14++;
                                    continue L23;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          ((we) this).field_t[((we) this).field_u[var10]] = var17.a((byte) 25);
                          var10++;
                          continue L21;
                        }
                      }
                    }
                  }
                  L24: {
                    if (var6 == 0) {
                      break L24;
                    } else {
                      ((we) this).field_j = new ni[1 + var9];
                      ((we) this).field_f = new int[var9 + 1][];
                      var10 = 0;
                      L25: while (true) {
                        if (((we) this).field_p <= var10) {
                          break L24;
                        } else {
                          var11 = ((we) this).field_u[var10];
                          var12 = ((we) this).field_t[var11];
                          ((we) this).field_f[var11] = new int[((we) this).field_q[var11]];
                          var13 = 0;
                          L26: while (true) {
                            if (((we) this).field_q[var11] <= var13) {
                              var13 = 0;
                              L27: while (true) {
                                if (var12 <= var13) {
                                  ((we) this).field_j[var11] = new ni(((we) this).field_f[var11]);
                                  var10++;
                                  continue L25;
                                } else {
                                  L28: {
                                    if (((we) this).field_r[var11] == null) {
                                      var14 = var13;
                                      break L28;
                                    } else {
                                      var14 = ((we) this).field_r[var11][var13];
                                      break L28;
                                    }
                                  }
                                  ((we) this).field_f[var11][var14] = var17.f((byte) 101);
                                  var13++;
                                  continue L27;
                                }
                              }
                            } else {
                              ((we) this).field_f[var11][var13] = -1;
                              var13++;
                              continue L26;
                            }
                          }
                        }
                      }
                    }
                  }
                  return;
                } else {
                  ((we) this).field_l[((we) this).field_u[var10]] = var17.f((byte) 116);
                  var10++;
                  continue L12;
                }
              }
            }
          }
        }
        throw new RuntimeException();
    }

    we(byte[] param0, int param1, byte[] param2) {
        int var4 = 0;
        ((we) this).field_s = in.a(param0.length, param0, -127);
        if (((we) this).field_s != param1) {
            throw new RuntimeException();
        }
        if (param2 != null) {
            if ((param2.length ^ -1) != -65) {
                throw new RuntimeException();
            }
            ((we) this).field_n = in.a(0, param0, param0.length, -26879);
            for (var4 = 0; -65 < (var4 ^ -1); var4++) {
                if (((we) this).field_n[var4] != param2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.a(0, param0);
    }

    static {
    }
}
