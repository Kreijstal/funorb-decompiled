/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc {
    int[] field_o;
    int[] field_v;
    static String field_s;
    int[] field_t;
    static String field_k;
    int[][] field_b;
    static int field_m;
    int[] field_i;
    int field_n;
    private int[][] field_q;
    byte[][] field_w;
    int[] field_p;
    int field_c;
    static bd field_e;
    int field_d;
    static boolean field_g;
    rg field_l;
    static bd[][] field_f;
    rg[] field_h;
    private byte[] field_a;
    private int field_j;
    private int[] field_r;
    static boolean field_u;

    final static void a(int param0, int param1, int param2) {
        wk.field_c = param0;
        if (param2 != -1) {
            wc.a(41);
        }
        qg.field_l = param1;
    }

    final static void a(java.applet.Applet param0, String param1, byte param2, boolean param3) {
        try {
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            String stackIn_13_2 = null;
            StringBuilder stackIn_15_1 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            java.net.MalformedURLException var4 = null;
            RuntimeException var4_ref = null;
            try {
              L0: {
                L1: {
                  if (fd.field_c.startsWith("win")) {
                    if (!lm.a(26, param1)) {
                      break L1;
                    } else {
                      decompiledRegionSelector1 = 0;
                      break L0;
                    }
                  } else {
                    break L1;
                  }
                }
                try {
                  L2: {
                    if (param2 == -97) {
                      param0.getAppletContext().showDocument(new java.net.URL(param1), "_blank");
                      decompiledRegionSelector0 = 1;
                      break L2;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L2;
                    }
                  }
                } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
                    ic.a((byte) -116, "MGR1: " + param1, (Throwable) null);
                    decompiledRegionSelector0 = 1;
                    break L3;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 2;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_12_0 = (RuntimeException) (var4_ref);

                stackIn_12_1 = new StringBuilder().append("wc.C(");

                if (param0 == null) {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackIn_13_2 = "null";
                  break L4;
                } else {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackIn_13_2 = "{...}";
                  break L4;
                }
              }
              L5: {


                stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

                if (param1 == null) {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "null";
                  break L5;
                } else {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "{...}";
                  break L5;
                }
              }
              throw wg.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return;
              } else {
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(int param0, byte[] param1) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int[] array$2 = null;
        int dupTemp$3 = 0;
        int[] dupTemp$4 = null;
        int[] array$5 = null;
        int dupTemp$6 = 0;
        int[] dupTemp$7 = null;
        int[] array$8 = null;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_103_2 = null;
        RuntimeException decompiledCaughtException = null;
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
        vi var17 = null;
        byte[] var21 = null;
        var16 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var17 = new vi(ml.a(param1, (byte) -76));
              var4 = var17.l(32270);
              if (5 > var4) {
                break L1;
              } else {
                if ((var4 ^ -1) >= -8) {
                  L2: {
                    if (6 <= var4) {
                      this.field_n = var17.d(8195);
                      break L2;
                    } else {
                      this.field_n = 0;
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.l(32270);
                    if (-1 == (1 & var5 ^ -1)) {
                      stackIn_11_0 = 0;
                      break L3;
                    } else {
                      stackIn_11_0 = 1;
                      break L3;
                    }
                  }
                  L4: {
                    var6 = stackIn_11_0;
                    if ((2 & var5) == 0) {
                      stackIn_14_0 = 0;
                      break L4;
                    } else {
                      stackIn_14_0 = 1;
                      break L4;
                    }
                  }
                  L5: {
                    var7 = stackIn_14_0;
                    if (-8 >= (var4 ^ -1)) {
                      this.field_j = var17.a(true);
                      break L5;
                    } else {
                      this.field_j = var17.e(8);
                      break L5;
                    }
                  }
                  L6: {
                    var8 = 0;
                    var9 = -1;
                    if (param0 == 0) {
                      break L6;
                    } else {
                      wc.a(-105);
                      break L6;
                    }
                  }
                  L7: {
                    this.field_t = new int[this.field_j];
                    if ((var4 ^ -1) > -8) {
                      var10 = 0;
                      L8: while (true) {
                        if (this.field_j <= var10) {
                          break L7;
                        } else {
                          dupTemp$0 = var8 + var17.e(8);
                          var8 = dupTemp$0;
                          this.field_t[var10] = dupTemp$0;
                          if ((var9 ^ -1) > (this.field_t[var10] ^ -1)) {
                            var9 = this.field_t[var10];
                            var10++;
                            continue L8;
                          } else {
                            var10++;
                            continue L8;
                          }
                        }
                      }
                    } else {
                      var10 = 0;
                      L9: while (true) {
                        if (var10 >= this.field_j) {
                          break L7;
                        } else {
                          L10: {
                            dupTemp$1 = var8 + var17.a(true);
                            var8 = dupTemp$1;
                            this.field_t[var10] = dupTemp$1;
                            if ((this.field_t[var10] ^ -1) < (var9 ^ -1)) {
                              var9 = this.field_t[var10];
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
                    this.field_c = 1 + var9;
                    this.field_v = new int[this.field_c];
                    this.field_o = new int[this.field_c];
                    this.field_p = new int[this.field_c];
                    this.field_b = new int[this.field_c][];
                    this.field_i = new int[this.field_c];
                    if (var7 == 0) {
                      break L11;
                    } else {
                      this.field_w = new byte[this.field_c][];
                      break L11;
                    }
                  }
                  L12: {
                    if (var6 != 0) {
                      this.field_r = new int[this.field_c];
                      var10 = 0;
                      L13: while (true) {
                        if (var10 >= this.field_c) {
                          var10 = 0;
                          L14: while (true) {
                            if (this.field_j <= var10) {
                              this.field_l = new rg(this.field_r);
                              break L12;
                            } else {
                              this.field_r[this.field_t[var10]] = var17.d(8195);
                              var10++;
                              continue L14;
                            }
                          }
                        } else {
                          this.field_r[var10] = -1;
                          var10++;
                          continue L13;
                        }
                      }
                    } else {
                      break L12;
                    }
                  }
                  var10 = 0;
                  L15: while (true) {
                    if (this.field_j <= var10) {
                      L16: {
                        if (var7 != 0) {
                          var10 = 0;
                          L17: while (true) {
                            if (var10 >= this.field_j) {
                              var10 = 0;
                              L18: while (true) {
                                if (this.field_j <= var10) {
                                  break L16;
                                } else {
                                  this.field_i[this.field_t[var10]] = var17.d(8195);
                                  var10++;
                                  continue L18;
                                }
                              }
                            } else {
                              var21 = new byte[64];
                              var17.a(64, 0, var21, -18181);
                              this.field_w[this.field_t[var10]] = var21;
                              var10++;
                              continue L17;
                            }
                          }
                        } else {
                          var10 = 0;
                          L19: while (true) {
                            if (this.field_j <= var10) {
                              break L16;
                            } else {
                              this.field_i[this.field_t[var10]] = var17.d(8195);
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
                            if (var10 >= this.field_j) {
                              var10 = 0;
                              L22: while (true) {
                                if (var10 >= this.field_j) {
                                  break L20;
                                } else {
                                  var11 = this.field_t[var10];
                                  var12 = this.field_o[var11];
                                  var8 = 0;
                                  var13 = -1;
                                  array$2 = new int[var12];
                                  this.field_b[var11] = array$2;
                                  var14 = 0;
                                  L23: while (true) {
                                    if (var14 >= var12) {
                                      L24: {
                                        this.field_p[var11] = var13 + 1;
                                        if (var12 == 1 + var13) {
                                          this.field_b[var11] = null;
                                          break L24;
                                        } else {
                                          break L24;
                                        }
                                      }
                                      var10++;
                                      continue L22;
                                    } else {
                                      L25: {
                                        dupTemp$3 = var8 + var17.a(true);
                                        var8 = dupTemp$3;
                                        dupTemp$4 = this.field_b[var11];
                                        dupTemp$4[var14] = dupTemp$3;
                                        var15 = dupTemp$3;
                                        if ((var15 ^ -1) < (var13 ^ -1)) {
                                          var13 = var15;
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
                              this.field_o[this.field_t[var10]] = var17.a(true);
                              var10++;
                              continue L21;
                            }
                          }
                        } else {
                          var10 = 0;
                          L26: while (true) {
                            if (this.field_j <= var10) {
                              var10 = 0;
                              L27: while (true) {
                                if (var10 >= this.field_j) {
                                  break L20;
                                } else {
                                  var11 = this.field_t[var10];
                                  var8 = 0;
                                  var12 = this.field_o[var11];
                                  var13 = -1;
                                  array$5 = new int[var12];
                                  this.field_b[var11] = array$5;
                                  var14 = 0;
                                  L28: while (true) {
                                    if (var12 <= var14) {
                                      L29: {
                                        this.field_p[var11] = var13 - -1;
                                        if (1 + var13 == var12) {
                                          this.field_b[var11] = null;
                                          break L29;
                                        } else {
                                          break L29;
                                        }
                                      }
                                      var10++;
                                      continue L27;
                                    } else {
                                      L30: {
                                        dupTemp$6 = var8 + var17.e(8);
                                        var8 = dupTemp$6;
                                        dupTemp$7 = this.field_b[var11];
                                        dupTemp$7[var14] = dupTemp$6;
                                        var15 = dupTemp$6;
                                        if (var13 < var15) {
                                          var13 = var15;
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
                              this.field_o[this.field_t[var10]] = var17.e(bm.a(param0, 8));
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
                          this.field_q = new int[1 + var9][];
                          this.field_h = new rg[var9 + 1];
                          var10 = 0;
                          L32: while (true) {
                            if (var10 >= this.field_j) {
                              break L31;
                            } else {
                              var11 = this.field_t[var10];
                              var12 = this.field_o[var11];
                              array$8 = new int[this.field_p[var11]];
                              this.field_q[var11] = array$8;
                              var13 = 0;
                              L33: while (true) {
                                if (this.field_p[var11] <= var13) {
                                  var13 = 0;
                                  L34: while (true) {
                                    if (var12 <= var13) {
                                      this.field_h[var11] = new rg(this.field_q[var11]);
                                      var10++;
                                      continue L32;
                                    } else {
                                      L35: {
                                        if (this.field_b[var11] != null) {
                                          var14 = this.field_b[var11][var13];
                                          break L35;
                                        } else {
                                          var14 = var13;
                                          break L35;
                                        }
                                      }
                                      this.field_q[var11][var14] = var17.d(8195);
                                      var13++;
                                      continue L34;
                                    }
                                  }
                                } else {
                                  this.field_q[var11][var13] = -1;
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
                      this.field_v[this.field_t[var10]] = var17.d(8195);
                      var10++;
                      continue L15;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L36: {
            var3 = decompiledCaughtException;
            stackIn_102_0 = (RuntimeException) (var3);

            stackIn_102_1 = new StringBuilder().append("wc.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_103_0 = (RuntimeException) ((Object) stackIn_102_0);
              stackIn_103_1 = (StringBuilder) ((Object) stackIn_102_1);
              stackIn_103_2 = "null";
              break L36;
            } else {
              stackIn_103_0 = (RuntimeException) ((Object) stackIn_102_0);
              stackIn_103_1 = (StringBuilder) ((Object) stackIn_102_1);
              stackIn_103_2 = "{...}";
              break L36;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_103_0), stackIn_103_2 + ')');
        }
    }

    final static fn a(String param0, gb param1, int param2, gb param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        fn stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 > 23) {
                break L1;
              } else {
                wc.a(-98);
                break L1;
              }
            }
            var5_int = param3.a((byte) -2, param0);
            var6 = param3.a(var5_int, param4, -1);
            stackIn_3_0 = qj.a(param1, param3, -1, var6, var5_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("wc.B(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ')');
        }
        return stackIn_3_0;
    }

    wc(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            this.field_d = pi.a(param0.length, 31465, param0);
            if (this.field_d != param1) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (-65 != (param2.length ^ -1)) {
                    throw new RuntimeException();
                }
                this.field_a = ld.a(param0, 0, 109, param0.length);
                for (var4_int = 0; (var4_int ^ -1) > -65; var4_int++) {
                    if (this.field_a[var4_int] != param2[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(0, param0);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "wc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_f = (bd[][]) null;
        field_s = null;
        if (param0 != -17514) {
            return;
        }
        field_k = null;
        field_e = null;
    }

    static {
        field_k = "To Customer Support";
        field_s = "Music: ";
    }
}
