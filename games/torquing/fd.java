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
            RuntimeException var4_ref2 = null;
            kn var5 = null;
            sn var5_ref = null;
            kn stackIn_2_0 = null;
            kn stackIn_4_0 = null;
            sn stackIn_6_0 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            kn stackOut_3_0 = null;
            kn stackOut_1_0 = null;
            sn stackOut_5_0 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            String stackOut_9_2 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var4 = Class.forName("fg");
                    var5 = (kn) (var4.newInstance());
                    var5.a(param3, (byte) 24, param1, param2);
                    if (param0 == 0) {
                      stackOut_3_0 = (kn) (var5);
                      stackIn_4_0 = stackOut_3_0;
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      stackOut_1_0 = (kn) null;
                      stackIn_2_0 = stackOut_1_0;
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4_ref = decompiledCaughtException;
                  var5_ref = new sn();
                  ((kn) ((Object) var5_ref)).a(param3, (byte) 24, param1, param2);
                  stackOut_5_0 = (sn) (var5_ref);
                  stackIn_6_0 = stackOut_5_0;
                  return (kn) ((Object) stackIn_6_0);
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_7_0 = (RuntimeException) (var4_ref2);
                stackOut_7_1 = new StringBuilder().append("fd.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                if (param3 == null) {
                  stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackOut_9_2 = "null";
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  stackIn_10_2 = stackOut_9_2;
                  break L2;
                } else {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "{...}";
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  stackIn_10_2 = stackOut_8_2;
                  break L2;
                }
              }
              throw rb.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_2_0;
            } else {
              return stackIn_4_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, la param1, int param2, la param3, la param4) {
        String discarded$0 = null;
        try {
            if (param2 != 0) {
                CharSequence var6 = (CharSequence) null;
                discarded$0 = fd.a(-33, (CharSequence) null);
            }
            qk.field_q = ci.a(-121, "");
            qk.field_q.a(84, false);
            re.a(param4, true, param3, param1);
            gh.b(1);
            bh.field_a = tp.field_h;
            kh.field_o = tp.field_h;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "fd.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var1_int = 0;
              if (param0 < -65) {
                break L1;
              } else {
                field_k = (String[]) null;
                break L1;
              }
            }
            L2: while (true) {
              if (r.field_b.length <= var1_int) {
                break L0;
              } else {
                L3: {
                  if (rn.field_e == r.field_b[var1_int]) {
                    r.field_b[var1_int] = un.field_i;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var1_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var1), "fd.D(" + param0 + ')');
        }
    }

    final static String a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == 0) {
              stackOut_3_0 = vd.a(-127, param1, false);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (String) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("fd.E(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void b(int param0) {
        field_k = null;
        if (param0 <= 57) {
            field_a = false;
        }
    }

    private final void a(boolean param0, byte[] param1) {
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
        fj var17 = null;
        byte[] var21 = null;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_99_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        String stackOut_98_2 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        var16 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var17 = new fj(l.a(0, param1));
              var4 = var17.i((byte) -101);
              if ((var4 ^ -1) > -6) {
                break L1;
              } else {
                if (var4 > 7) {
                  break L1;
                } else {
                  L2: {
                    if ((var4 ^ -1) > -7) {
                      this.field_r = 0;
                      break L2;
                    } else {
                      this.field_r = var17.c((byte) -80);
                      break L2;
                    }
                  }
                  if (!param0) {
                    L3: {
                      var5 = var17.i((byte) -101);
                      if (0 == (var5 & 1)) {
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        break L3;
                      } else {
                        stackOut_11_0 = 1;
                        stackIn_13_0 = stackOut_11_0;
                        break L3;
                      }
                    }
                    L4: {
                      var6 = stackIn_13_0;
                      if (var4 >= 7) {
                        this.field_f = var17.c(0);
                        break L4;
                      } else {
                        this.field_f = var17.i(7088);
                        break L4;
                      }
                    }
                    L5: {
                      if (-1 == (var5 & 2 ^ -1)) {
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        break L5;
                      } else {
                        stackOut_17_0 = 1;
                        stackIn_19_0 = stackOut_17_0;
                        break L5;
                      }
                    }
                    L6: {
                      var7 = stackIn_19_0;
                      var8 = 0;
                      this.field_b = new int[this.field_f];
                      var9 = -1;
                      if (7 > var4) {
                        var10 = 0;
                        L7: while (true) {
                          if (this.field_f <= var10) {
                            break L6;
                          } else {
                            dupTemp$7 = var8 + var17.i(7088);
                            var8 = dupTemp$7;
                            this.field_b[var10] = dupTemp$7;
                            if (this.field_b[var10] > var9) {
                              var9 = this.field_b[var10];
                              var10++;
                              continue L7;
                            } else {
                              var10++;
                              continue L7;
                            }
                          }
                        }
                      } else {
                        var10 = 0;
                        L8: while (true) {
                          if (this.field_f <= var10) {
                            break L6;
                          } else {
                            dupTemp$8 = var8 + var17.c(0);
                            var8 = dupTemp$8;
                            this.field_b[var10] = dupTemp$8;
                            if (this.field_b[var10] > var9) {
                              var9 = this.field_b[var10];
                              var10++;
                              continue L8;
                            } else {
                              var10++;
                              continue L8;
                            }
                          }
                        }
                      }
                    }
                    L9: {
                      this.field_c = var9 - -1;
                      this.field_q = new int[this.field_c];
                      this.field_m = new int[this.field_c][];
                      this.field_p = new int[this.field_c];
                      this.field_h = new int[this.field_c];
                      if (var7 != 0) {
                        this.field_e = new byte[this.field_c][];
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      this.field_l = new int[this.field_c];
                      if (var6 == 0) {
                        break L10;
                      } else {
                        this.field_g = new int[this.field_c];
                        var10 = 0;
                        L11: while (true) {
                          if (var10 >= this.field_c) {
                            var10 = 0;
                            L12: while (true) {
                              if (var10 >= this.field_f) {
                                this.field_n = new vb(this.field_g);
                                break L10;
                              } else {
                                this.field_g[this.field_b[var10]] = var17.c((byte) -62);
                                var10++;
                                continue L12;
                              }
                            }
                          } else {
                            this.field_g[var10] = -1;
                            var10++;
                            continue L11;
                          }
                        }
                      }
                    }
                    var10 = 0;
                    L13: while (true) {
                      if (this.field_f <= var10) {
                        L14: {
                          if (var7 == 0) {
                            break L14;
                          } else {
                            var10 = 0;
                            L15: while (true) {
                              if (var10 >= this.field_f) {
                                break L14;
                              } else {
                                var21 = new byte[64];
                                var17.a(48, 64, var21, 0);
                                this.field_e[this.field_b[var10]] = var21;
                                var10++;
                                continue L15;
                              }
                            }
                          }
                        }
                        var10 = 0;
                        L16: while (true) {
                          if (var10 >= this.field_f) {
                            L17: {
                              if (-8 < (var4 ^ -1)) {
                                var10 = 0;
                                L18: while (true) {
                                  if (var10 >= this.field_f) {
                                    var10 = 0;
                                    L19: while (true) {
                                      if (this.field_f <= var10) {
                                        break L17;
                                      } else {
                                        var11 = this.field_b[var10];
                                        var8 = 0;
                                        var12 = this.field_l[var11];
                                        var13 = -1;
                                        array$9 = new int[var12];
                                        this.field_m[var11] = array$9;
                                        var14 = 0;
                                        L20: while (true) {
                                          if (var14 >= var12) {
                                            L21: {
                                              this.field_h[var11] = var13 - -1;
                                              if (var12 != var13 - -1) {
                                                break L21;
                                              } else {
                                                this.field_m[var11] = null;
                                                break L21;
                                              }
                                            }
                                            var10++;
                                            continue L19;
                                          } else {
                                            L22: {
                                              dupTemp$10 = var8 + var17.i(7088);
                                              var8 = dupTemp$10;
                                              this.field_m[var11][var14] = dupTemp$10;
                                              var15 = dupTemp$10;
                                              if (var13 < var15) {
                                                var13 = var15;
                                                break L22;
                                              } else {
                                                break L22;
                                              }
                                            }
                                            var14++;
                                            continue L20;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    this.field_l[this.field_b[var10]] = var17.i(7088);
                                    var10++;
                                    continue L18;
                                  }
                                }
                              } else {
                                var10 = 0;
                                L23: while (true) {
                                  if (var10 >= this.field_f) {
                                    var10 = 0;
                                    L24: while (true) {
                                      if (var10 >= this.field_f) {
                                        break L17;
                                      } else {
                                        var11 = this.field_b[var10];
                                        var12 = this.field_l[var11];
                                        var8 = 0;
                                        array$11 = new int[var12];
                                        this.field_m[var11] = array$11;
                                        var13 = -1;
                                        var14 = 0;
                                        L25: while (true) {
                                          if (var12 <= var14) {
                                            L26: {
                                              this.field_h[var11] = var13 - -1;
                                              if (var13 + 1 == var12) {
                                                this.field_m[var11] = null;
                                                break L26;
                                              } else {
                                                break L26;
                                              }
                                            }
                                            var10++;
                                            continue L24;
                                          } else {
                                            L27: {
                                              dupTemp$12 = var8 + var17.c(0);
                                              var8 = dupTemp$12;
                                              this.field_m[var11][var14] = dupTemp$12;
                                              var15 = dupTemp$12;
                                              if (var13 < var15) {
                                                var13 = var15;
                                                break L27;
                                              } else {
                                                break L27;
                                              }
                                            }
                                            var14++;
                                            continue L25;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    this.field_l[this.field_b[var10]] = var17.c(0);
                                    var10++;
                                    continue L23;
                                  }
                                }
                              }
                            }
                            L28: {
                              if (var6 != 0) {
                                this.field_j = new vb[var9 + 1];
                                this.field_i = new int[1 + var9][];
                                var10 = 0;
                                L29: while (true) {
                                  if (this.field_f <= var10) {
                                    break L28;
                                  } else {
                                    var11 = this.field_b[var10];
                                    var12 = this.field_l[var11];
                                    array$13 = new int[this.field_h[var11]];
                                    this.field_i[var11] = array$13;
                                    var13 = 0;
                                    L30: while (true) {
                                      if (this.field_h[var11] <= var13) {
                                        var13 = 0;
                                        L31: while (true) {
                                          if (var12 <= var13) {
                                            this.field_j[var11] = new vb(this.field_i[var11]);
                                            var10++;
                                            continue L29;
                                          } else {
                                            L32: {
                                              if (this.field_m[var11] == null) {
                                                var14 = var13;
                                                break L32;
                                              } else {
                                                var14 = this.field_m[var11][var13];
                                                break L32;
                                              }
                                            }
                                            this.field_i[var11][var14] = var17.c((byte) -92);
                                            var13++;
                                            continue L31;
                                          }
                                        }
                                      } else {
                                        this.field_i[var11][var13] = -1;
                                        var13++;
                                        continue L30;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L28;
                              }
                            }
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            this.field_q[this.field_b[var10]] = var17.c((byte) -109);
                            var10++;
                            continue L16;
                          }
                        }
                      } else {
                        this.field_p[this.field_b[var10]] = var17.c((byte) -56);
                        var10++;
                        continue L13;
                      }
                    }
                  } else {
                    decompiledRegionSelector0 = 0;
                    break L0;
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
            stackOut_96_0 = (RuntimeException) (var3);
            stackOut_96_1 = new StringBuilder().append("fd.C(").append(param0).append(',');
            stackIn_98_0 = stackOut_96_0;
            stackIn_98_1 = stackOut_96_1;
            stackIn_97_0 = stackOut_96_0;
            stackIn_97_1 = stackOut_96_1;
            if (param1 == null) {
              stackOut_98_0 = (RuntimeException) ((Object) stackIn_98_0);
              stackOut_98_1 = (StringBuilder) ((Object) stackIn_98_1);
              stackOut_98_2 = "null";
              stackIn_99_0 = stackOut_98_0;
              stackIn_99_1 = stackOut_98_1;
              stackIn_99_2 = stackOut_98_2;
              break L33;
            } else {
              stackOut_97_0 = (RuntimeException) ((Object) stackIn_97_0);
              stackOut_97_1 = (StringBuilder) ((Object) stackIn_97_1);
              stackOut_97_2 = "{...}";
              stackIn_99_0 = stackOut_97_0;
              stackIn_99_1 = stackOut_97_1;
              stackIn_99_2 = stackOut_97_2;
              break L33;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_99_0), stackIn_99_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    fd(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            this.field_o = wf.a((byte) -117, param0.length, param0);
            if (param1 != this.field_o) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (param2.length != 64) {
                    throw new RuntimeException();
                }
                this.field_d = np.a(0, param0, param0.length, -127);
                for (var4_int = 0; -65 < (var4_int ^ -1); var4_int++) {
                    if (param2[var4_int] != this.field_d[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(false, param0);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "fd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
