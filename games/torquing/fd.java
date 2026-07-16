/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd {
    int field_o;
    int[] field_h;
    int[] field_b;
    static String[] field_k;
    private byte[] field_d;
    byte[][] field_e;
    private int[][] field_i;
    private int[] field_g;
    int[] field_q;
    int field_c;
    int[] field_l;
    vb field_n;
    vb[] field_j;
    int field_r;
    static boolean field_a;
    int[] field_p;
    private int field_f;
    int[][] field_m;

    final static kn a(int param0, int param1, int param2, java.awt.Component param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            kn var5 = null;
            sn var5_ref = null;
            Object stackIn_2_0 = null;
            kn stackIn_4_0 = null;
            Throwable decompiledCaughtException = null;
            kn stackOut_3_0 = null;
            Object stackOut_1_0 = null;
            try {
              L0: {
                var4 = Class.forName("fg");
                var5 = (kn) var4.newInstance();
                var5.a(param3, (byte) 24, param1, param2);
                if (param0 == 0) {
                  stackOut_3_0 = (kn) var5;
                  stackIn_4_0 = stackOut_3_0;
                  break L0;
                } else {
                  stackOut_1_0 = null;
                  stackIn_2_0 = stackOut_1_0;
                  return (kn) (Object) stackIn_2_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new sn();
              ((kn) (Object) var5_ref).a(param3, (byte) 24, param1, param2);
              return (kn) (Object) var5_ref;
            }
            return stackIn_4_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, la param1, int param2, la param3, la param4) {
        if (param2 != 0) {
            Object var6 = null;
            String discarded$0 = fd.a(-33, (CharSequence) null);
        }
        qk.field_q = ci.a(-121, "");
        qk.field_q.a(84, false);
        re.a(param4, true, param3, param1);
        gh.b(1);
        bh.field_a = tp.field_h;
        kh.field_o = tp.field_h;
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        L0: {
          var2 = Torquing.field_u;
          var1 = 0;
          if (param0 < -65) {
            break L0;
          } else {
            field_k = null;
            break L0;
          }
        }
        L1: while (true) {
          if (r.field_b.length <= var1) {
            return;
          } else {
            if (rn.field_e == r.field_b[var1]) {
              r.field_b[var1] = un.field_i;
              var1++;
              continue L1;
            } else {
              var1++;
              continue L1;
            }
          }
        }
    }

    final static String a(int param0, CharSequence param1) {
        if (param0 != 0) {
            return null;
        }
        return vd.a(-127, param1, false);
    }

    public static void b(int param0) {
        field_k = null;
        if (param0 <= 57) {
            field_a = false;
        }
    }

    private final void a(boolean param0, byte[] param1) {
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
        fj var17 = null;
        byte[] var21 = null;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        L0: {
          var16 = Torquing.field_u;
          var17 = new fj(l.a(0, param1));
          var4 = var17.i((byte) -101);
          if ((var4 ^ -1) > -6) {
            break L0;
          } else {
            if (var4 > 7) {
              break L0;
            } else {
              L1: {
                if ((var4 ^ -1) > -7) {
                  ((fd) this).field_r = 0;
                  break L1;
                } else {
                  ((fd) this).field_r = var17.c((byte) -80);
                  break L1;
                }
              }
              if (!param0) {
                L2: {
                  var5 = var17.i((byte) -101);
                  if (0 == (var5 & 1)) {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L2;
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    break L2;
                  }
                }
                L3: {
                  var6 = stackIn_12_0;
                  if (var4 >= 7) {
                    ((fd) this).field_f = var17.c(0);
                    break L3;
                  } else {
                    ((fd) this).field_f = var17.i(7088);
                    break L3;
                  }
                }
                L4: {
                  if (-1 == (var5 & 2 ^ -1)) {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    break L4;
                  } else {
                    stackOut_16_0 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    break L4;
                  }
                }
                L5: {
                  var7 = stackIn_18_0;
                  var8 = 0;
                  ((fd) this).field_b = new int[((fd) this).field_f];
                  var9 = -1;
                  if (7 > var4) {
                    var10 = 0;
                    L6: while (true) {
                      if (((fd) this).field_f <= var10) {
                        break L5;
                      } else {
                        int dupTemp$4 = var8 + var17.i(7088);
                        var8 = dupTemp$4;
                        ((fd) this).field_b[var10] = dupTemp$4;
                        if (((fd) this).field_b[var10] > var9) {
                          var9 = ((fd) this).field_b[var10];
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
                      if (((fd) this).field_f <= var10) {
                        break L5;
                      } else {
                        int dupTemp$5 = var8 + var17.c(0);
                        var8 = dupTemp$5;
                        ((fd) this).field_b[var10] = dupTemp$5;
                        if (((fd) this).field_b[var10] > var9) {
                          var9 = ((fd) this).field_b[var10];
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
                  ((fd) this).field_c = var9 - -1;
                  ((fd) this).field_q = new int[((fd) this).field_c];
                  ((fd) this).field_m = new int[((fd) this).field_c][];
                  ((fd) this).field_p = new int[((fd) this).field_c];
                  ((fd) this).field_h = new int[((fd) this).field_c];
                  if (var7 != 0) {
                    ((fd) this).field_e = new byte[((fd) this).field_c][];
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  ((fd) this).field_l = new int[((fd) this).field_c];
                  if (var6 == 0) {
                    break L9;
                  } else {
                    ((fd) this).field_g = new int[((fd) this).field_c];
                    var10 = 0;
                    L10: while (true) {
                      if (var10 >= ((fd) this).field_c) {
                        var10 = 0;
                        L11: while (true) {
                          if (var10 >= ((fd) this).field_f) {
                            ((fd) this).field_n = new vb(((fd) this).field_g);
                            break L9;
                          } else {
                            ((fd) this).field_g[((fd) this).field_b[var10]] = var17.c((byte) -62);
                            var10++;
                            continue L11;
                          }
                        }
                      } else {
                        ((fd) this).field_g[var10] = -1;
                        var10++;
                        continue L10;
                      }
                    }
                  }
                }
                var10 = 0;
                L12: while (true) {
                  if (((fd) this).field_f <= var10) {
                    L13: {
                      if (var7 == 0) {
                        break L13;
                      } else {
                        var10 = 0;
                        L14: while (true) {
                          if (var10 >= ((fd) this).field_f) {
                            break L13;
                          } else {
                            var21 = new byte[64];
                            var17.a(48, 64, var21, 0);
                            ((fd) this).field_e[((fd) this).field_b[var10]] = var21;
                            var10++;
                            continue L14;
                          }
                        }
                      }
                    }
                    var10 = 0;
                    L15: while (true) {
                      if (var10 >= ((fd) this).field_f) {
                        L16: {
                          if (-8 < (var4 ^ -1)) {
                            var10 = 0;
                            L17: while (true) {
                              if (var10 >= ((fd) this).field_f) {
                                var10 = 0;
                                L18: while (true) {
                                  if (((fd) this).field_f <= var10) {
                                    break L16;
                                  } else {
                                    var11 = ((fd) this).field_b[var10];
                                    var8 = 0;
                                    var12 = ((fd) this).field_l[var11];
                                    var13 = -1;
                                    ((fd) this).field_m[var11] = new int[var12];
                                    var14 = 0;
                                    L19: while (true) {
                                      if (var14 >= var12) {
                                        ((fd) this).field_h[var11] = var13 - -1;
                                        if (var12 == var13 - -1) {
                                          ((fd) this).field_m[var11] = null;
                                          var10++;
                                          continue L18;
                                        } else {
                                          var10++;
                                          continue L18;
                                        }
                                      } else {
                                        int dupTemp$6 = var8 + var17.i(7088);
                                        var8 = dupTemp$6;
                                        ((fd) this).field_m[var11][var14] = dupTemp$6;
                                        var15 = dupTemp$6;
                                        if (var13 < var15) {
                                          var13 = var15;
                                          var14++;
                                          continue L19;
                                        } else {
                                          var14++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                ((fd) this).field_l[((fd) this).field_b[var10]] = var17.i(7088);
                                var10++;
                                continue L17;
                              }
                            }
                          } else {
                            var10 = 0;
                            L20: while (true) {
                              if (var10 >= ((fd) this).field_f) {
                                var10 = 0;
                                L21: while (true) {
                                  if (var10 >= ((fd) this).field_f) {
                                    break L16;
                                  } else {
                                    var11 = ((fd) this).field_b[var10];
                                    var12 = ((fd) this).field_l[var11];
                                    var8 = 0;
                                    ((fd) this).field_m[var11] = new int[var12];
                                    var13 = -1;
                                    var14 = 0;
                                    L22: while (true) {
                                      if (var12 <= var14) {
                                        ((fd) this).field_h[var11] = var13 - -1;
                                        if (var13 + 1 == var12) {
                                          ((fd) this).field_m[var11] = null;
                                          var10++;
                                          continue L21;
                                        } else {
                                          var10++;
                                          continue L21;
                                        }
                                      } else {
                                        int dupTemp$7 = var8 + var17.c(0);
                                        var8 = dupTemp$7;
                                        ((fd) this).field_m[var11][var14] = dupTemp$7;
                                        var15 = dupTemp$7;
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
                                ((fd) this).field_l[((fd) this).field_b[var10]] = var17.c(0);
                                var10++;
                                continue L20;
                              }
                            }
                          }
                        }
                        L23: {
                          if (var6 != 0) {
                            ((fd) this).field_j = new vb[var9 + 1];
                            ((fd) this).field_i = new int[1 + var9][];
                            var10 = 0;
                            L24: while (true) {
                              if (((fd) this).field_f <= var10) {
                                break L23;
                              } else {
                                var11 = ((fd) this).field_b[var10];
                                var12 = ((fd) this).field_l[var11];
                                ((fd) this).field_i[var11] = new int[((fd) this).field_h[var11]];
                                var13 = 0;
                                L25: while (true) {
                                  if (((fd) this).field_h[var11] <= var13) {
                                    var13 = 0;
                                    L26: while (true) {
                                      if (var12 <= var13) {
                                        ((fd) this).field_j[var11] = new vb(((fd) this).field_i[var11]);
                                        var10++;
                                        continue L24;
                                      } else {
                                        L27: {
                                          if (((fd) this).field_m[var11] == null) {
                                            var14 = var13;
                                            break L27;
                                          } else {
                                            var14 = ((fd) this).field_m[var11][var13];
                                            break L27;
                                          }
                                        }
                                        ((fd) this).field_i[var11][var14] = var17.c((byte) -92);
                                        var13++;
                                        continue L26;
                                      }
                                    }
                                  } else {
                                    ((fd) this).field_i[var11][var13] = -1;
                                    var13++;
                                    continue L25;
                                  }
                                }
                              }
                            }
                          } else {
                            break L23;
                          }
                        }
                        return;
                      } else {
                        ((fd) this).field_q[((fd) this).field_b[var10]] = var17.c((byte) -109);
                        var10++;
                        continue L15;
                      }
                    }
                  } else {
                    ((fd) this).field_p[((fd) this).field_b[var10]] = var17.c((byte) -56);
                    var10++;
                    continue L12;
                  }
                }
              } else {
                return;
              }
            }
          }
        }
        throw new RuntimeException();
    }

    fd(byte[] param0, int param1, byte[] param2) {
        int var4 = 0;
        ((fd) this).field_o = wf.a((byte) -117, param0.length, param0);
        if (param1 != ((fd) this).field_o) {
            throw new RuntimeException();
        }
        if (param2 != null) {
            if (param2.length != 64) {
                throw new RuntimeException();
            }
            ((fd) this).field_d = np.a(0, param0, param0.length, -127);
            for (var4 = 0; -65 < (var4 ^ -1); var4++) {
                if (param2[var4] != ((fd) this).field_d[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.a(false, param0);
    }

    static {
    }
}
