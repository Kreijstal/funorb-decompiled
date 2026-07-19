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
        mi discarded$0 = null;
        field_b = null;
        if (param0 != -21) {
            discarded$0 = we.a(86, false, (byte) 113, true, -103, true);
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
                    var6 = new ae(255, gd.field_q, new pf(ek.field_p.field_v, 12000, 0), 2097152);
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
                    var7 = new ae(param0, gd.field_q, vh.field_e[param0], 2097152);
                    break L3;
                  }
                }
                L6: {
                  var8 = dh.field_vb.a((ae) (var6), (byte) -60, param1, param0, (ae) (var7));
                  if (param5) {
                    var8.b(-2);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                stackOut_14_0 = new mi(var8, param3, param4);
                stackIn_15_0 = stackOut_14_0;
                break L0;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) (var6)).toString());
            }
            return stackIn_15_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(int param0, byte[] param1) {
        int dupTemp$7 = 0;
        int dupTemp$8 = 0;
        int[] array$9 = null;
        int dupTemp$10 = 0;
        int[] array$11 = null;
        int dupTemp$12 = 0;
        int[] array$13 = null;
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
              if (-6 < (var4 ^ -1)) {
                break L1;
              } else {
                if ((var4 ^ -1) < -8) {
                  break L1;
                } else {
                  L2: {
                    if ((var4 ^ -1) <= -7) {
                      this.field_m = var17.f((byte) 50);
                      break L2;
                    } else {
                      this.field_m = 0;
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.c(32);
                    if (-1 == (var5 & 1 ^ -1)) {
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
                      this.field_p = var17.a((byte) 25);
                      break L4;
                    } else {
                      this.field_p = var17.j((byte) 119);
                      break L4;
                    }
                  }
                  L5: {
                    if (-1 == (2 & var5 ^ -1)) {
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
                    this.field_u = new int[this.field_p];
                    var9 = -1;
                    if (7 > var4) {
                      var10 = 0;
                      L7: while (true) {
                        if (this.field_p <= var10) {
                          break L6;
                        } else {
                          L8: {
                            dupTemp$7 = var8 + var17.a((byte) 25);
                            var8 = dupTemp$7;
                            this.field_u[var10] = dupTemp$7;
                            if (this.field_u[var10] > var9) {
                              var9 = this.field_u[var10];
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
                        if (var10 >= this.field_p) {
                          break L6;
                        } else {
                          dupTemp$8 = var8 + var17.j((byte) -19);
                          var8 = dupTemp$8;
                          this.field_u[var10] = dupTemp$8;
                          if (var9 < this.field_u[var10]) {
                            var9 = this.field_u[var10];
                            var10++;
                            continue L9;
                          } else {
                            var10++;
                            continue L9;
                          }
                        }
                      }
                    }
                  }
                  L10: {
                    this.field_i = 1 + var9;
                    this.field_q = new int[this.field_i];
                    this.field_t = new int[this.field_i];
                    if (var7 != 0) {
                      this.field_d = new byte[this.field_i][];
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    this.field_r = new int[this.field_i][];
                    this.field_o = new int[this.field_i];
                    this.field_l = new int[this.field_i];
                    if (var6 == 0) {
                      break L11;
                    } else {
                      this.field_e = new int[this.field_i];
                      var10 = 0;
                      L12: while (true) {
                        if (this.field_i <= var10) {
                          var10 = 0;
                          L13: while (true) {
                            if (var10 >= this.field_p) {
                              this.field_h = new ni(this.field_e);
                              break L11;
                            } else {
                              this.field_e[this.field_u[var10]] = var17.f((byte) 79);
                              var10++;
                              continue L13;
                            }
                          }
                        } else {
                          this.field_e[var10] = -1;
                          var10++;
                          continue L12;
                        }
                      }
                    }
                  }
                  var10 = 0;
                  L14: while (true) {
                    if (var10 >= this.field_p) {
                      L15: {
                        if (var7 != 0) {
                          var10 = 0;
                          L16: while (true) {
                            if (var10 >= this.field_p) {
                              var10 = param0;
                              L17: while (true) {
                                if (this.field_p <= var10) {
                                  break L15;
                                } else {
                                  this.field_o[this.field_u[var10]] = var17.f((byte) 88);
                                  var10++;
                                  continue L17;
                                }
                              }
                            } else {
                              var21 = new byte[64];
                              var17.a(0, (byte) 72, 64, var21);
                              this.field_d[this.field_u[var10]] = var21;
                              var10++;
                              continue L16;
                            }
                          }
                        } else {
                          var10 = param0;
                          L18: while (true) {
                            if (this.field_p <= var10) {
                              break L15;
                            } else {
                              this.field_o[this.field_u[var10]] = var17.f((byte) 88);
                              var10++;
                              continue L18;
                            }
                          }
                        }
                      }
                      L19: {
                        if ((var4 ^ -1) <= -8) {
                          var10 = 0;
                          L20: while (true) {
                            if (var10 >= this.field_p) {
                              var10 = 0;
                              L21: while (true) {
                                if (this.field_p <= var10) {
                                  break L19;
                                } else {
                                  var11 = this.field_u[var10];
                                  var8 = 0;
                                  var12 = this.field_t[var11];
                                  array$9 = new int[var12];
                                  this.field_r[var11] = array$9;
                                  var13 = -1;
                                  var14 = 0;
                                  L22: while (true) {
                                    if (var12 <= var14) {
                                      L23: {
                                        this.field_q[var11] = var13 - -1;
                                        if (var12 != var13 + 1) {
                                          break L23;
                                        } else {
                                          this.field_r[var11] = null;
                                          break L23;
                                        }
                                      }
                                      var10++;
                                      continue L21;
                                    } else {
                                      dupTemp$10 = var8 + var17.j((byte) 108);
                                      var8 = dupTemp$10;
                                      this.field_r[var11][var14] = dupTemp$10;
                                      var15 = dupTemp$10;
                                      if (var13 < var15) {
                                        var13 = var15;
                                        var14++;
                                        continue L22;
                                      } else {
                                        var14++;
                                        continue L22;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              this.field_t[this.field_u[var10]] = var17.j((byte) -73);
                              var10++;
                              continue L20;
                            }
                          }
                        } else {
                          var10 = 0;
                          L24: while (true) {
                            if (var10 >= this.field_p) {
                              var10 = 0;
                              L25: while (true) {
                                if (var10 >= this.field_p) {
                                  break L19;
                                } else {
                                  var11 = this.field_u[var10];
                                  var12 = this.field_t[var11];
                                  var8 = 0;
                                  array$11 = new int[var12];
                                  this.field_r[var11] = array$11;
                                  var13 = -1;
                                  var14 = 0;
                                  L26: while (true) {
                                    if (var14 >= var12) {
                                      L27: {
                                        this.field_q[var11] = 1 + var13;
                                        if (1 + var13 == var12) {
                                          this.field_r[var11] = null;
                                          break L27;
                                        } else {
                                          break L27;
                                        }
                                      }
                                      var10++;
                                      continue L25;
                                    } else {
                                      dupTemp$12 = var8 + var17.a((byte) 25);
                                      var8 = dupTemp$12;
                                      this.field_r[var11][var14] = dupTemp$12;
                                      var15 = dupTemp$12;
                                      if (var15 > var13) {
                                        var13 = var15;
                                        var14++;
                                        continue L26;
                                      } else {
                                        var14++;
                                        continue L26;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              this.field_t[this.field_u[var10]] = var17.a((byte) 25);
                              var10++;
                              continue L24;
                            }
                          }
                        }
                      }
                      L28: {
                        if (var6 == 0) {
                          break L28;
                        } else {
                          this.field_j = new ni[1 + var9];
                          this.field_f = new int[var9 + 1][];
                          var10 = 0;
                          L29: while (true) {
                            if (this.field_p <= var10) {
                              break L28;
                            } else {
                              var11 = this.field_u[var10];
                              var12 = this.field_t[var11];
                              array$13 = new int[this.field_q[var11]];
                              this.field_f[var11] = array$13;
                              var13 = 0;
                              L30: while (true) {
                                if (this.field_q[var11] <= var13) {
                                  var13 = 0;
                                  L31: while (true) {
                                    if (var12 <= var13) {
                                      this.field_j[var11] = new ni(this.field_f[var11]);
                                      var10++;
                                      continue L29;
                                    } else {
                                      L32: {
                                        if (this.field_r[var11] == null) {
                                          var14 = var13;
                                          break L32;
                                        } else {
                                          var14 = this.field_r[var11][var13];
                                          break L32;
                                        }
                                      }
                                      this.field_f[var11][var14] = var17.f((byte) 101);
                                      var13++;
                                      continue L31;
                                    }
                                  }
                                } else {
                                  this.field_f[var11][var13] = -1;
                                  var13++;
                                  continue L30;
                                }
                              }
                            }
                          }
                        }
                      }
                      break L0;
                    } else {
                      this.field_l[this.field_u[var10]] = var17.f((byte) 116);
                      var10++;
                      continue L14;
                    }
                  }
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L33: {
            var3 = decompiledCaughtException;
            stackOut_95_0 = (RuntimeException) (var3);
            stackOut_95_1 = new StringBuilder().append("we.C(").append(param0).append(',');
            stackIn_97_0 = stackOut_95_0;
            stackIn_97_1 = stackOut_95_1;
            stackIn_96_0 = stackOut_95_0;
            stackIn_96_1 = stackOut_95_1;
            if (param1 == null) {
              stackOut_97_0 = (RuntimeException) ((Object) stackIn_97_0);
              stackOut_97_1 = (StringBuilder) ((Object) stackIn_97_1);
              stackOut_97_2 = "null";
              stackIn_98_0 = stackOut_97_0;
              stackIn_98_1 = stackOut_97_1;
              stackIn_98_2 = stackOut_97_2;
              break L33;
            } else {
              stackOut_96_0 = (RuntimeException) ((Object) stackIn_96_0);
              stackOut_96_1 = (StringBuilder) ((Object) stackIn_96_1);
              stackOut_96_2 = "{...}";
              stackIn_98_0 = stackOut_96_0;
              stackIn_98_1 = stackOut_96_1;
              stackIn_98_2 = stackOut_96_2;
              break L33;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_98_0), stackIn_98_2 + ')');
        }
    }

    we(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            this.field_s = in.a(param0.length, param0, -127);
            if (this.field_s != param1) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if ((param2.length ^ -1) != -65) {
                    throw new RuntimeException();
                }
                this.field_n = in.a(0, param0, param0.length, -26879);
                for (var4_int = 0; -65 < (var4_int ^ -1); var4_int++) {
                    if (this.field_n[var4_int] != param2[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(0, param0);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "we.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
