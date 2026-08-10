/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g {
    static boolean field_o;
    byte[][] field_l;
    da[] field_n;
    int field_c;
    int[] field_d;
    static int field_k;
    private byte[] field_a;
    int[] field_f;
    int[] field_q;
    da field_s;
    int field_b;
    int[][] field_p;
    int field_r;
    int[] field_h;
    static String field_e;
    private int[] field_m;
    private int field_g;
    int[] field_t;
    private int[][] field_i;
    static ea[] field_j;

    final static void a(int param0, int param1) {
        ud.field_e = param0 >> -2033344156 & 3;
        if (!(2 >= ud.field_e)) {
            ud.field_e = 2;
        }
        ra.field_b = (param0 & 13) >> 1389110306;
        if (ra.field_b > param1) {
            ra.field_b = 2;
        }
        wi.field_t = param0 & 3;
        if (!(-3 <= (wi.field_t ^ -1))) {
            wi.field_t = 2;
        }
    }

    final static void a(boolean param0, int param1, boolean param2) {
        int var3 = -2 % ((46 - param1) / 51);
        if (param0) {
            eh.b(0, 0, eh.field_g, eh.field_c, 0, 192);
        } else {
            eh.d();
        }
        pf.a(0, param0);
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
                      if (param1 > 34) {
                        break L2;
                      } else {
                        field_k = 6;
                        break L2;
                      }
                    }
                    param0.getAppletContext().showDocument(nn.a(121, param0, var2), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref2);

                stackIn_8_1 = new StringBuilder().append("g.A(");

                if (param0 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L4;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L4;
                }
              }
              throw lj.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, int param1) {
        int var3 = 0;
        mj var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (param0 == -69) {
                break L1;
              } else {
                field_o = true;
                break L1;
              }
            }
            var4 = (mj) ((Object) nh.field_a.b(75));
            L2: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                vd.a(param1, -3450, var4);
                var4 = (mj) ((Object) nh.field_a.b((byte) 56));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "g.H(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, ea[] param5) {
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
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
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        java.applet.Applet var23 = null;
        var22 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (param5 != null) {
              L1: {
                if (0 >= param3) {
                  break L1;
                } else {
                  if (0 < param1) {
                    L2: {
                      if (null != param5[3]) {
                        stackIn_9_0 = param5[3].field_x;
                        break L2;
                      } else {
                        stackIn_9_0 = 0;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_9_0;
                      if (param5[5] != null) {
                        stackIn_12_0 = param5[5].field_x;
                        break L3;
                      } else {
                        stackIn_12_0 = 0;
                        break L3;
                      }
                    }
                    L4: {
                      var7 = stackIn_12_0;
                      if (param5[1] != null) {
                        stackIn_15_0 = param5[1].field_A;
                        break L4;
                      } else {
                        stackIn_15_0 = 0;
                        break L4;
                      }
                    }
                    L5: {
                      var8 = stackIn_15_0;
                      if (null != param5[7]) {
                        stackIn_18_0 = param5[7].field_A;
                        break L5;
                      } else {
                        stackIn_18_0 = 0;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_18_0;
                      var10 = param3 + param2;
                      var11 = param1 + param0;
                      var12 = param2 - -var6_int;
                      var13 = -var7 + var10;
                      var14 = param0 - -var8;
                      var15 = var11 - var9;
                      var16 = var12;
                      var17 = var13;
                      if (var17 >= var16) {
                        break L6;
                      } else {
                        var17 = param2 - -(param3 * var6_int / (var7 + var6_int));
                        var16 = param2 - -(param3 * var6_int / (var7 + var6_int));
                        break L6;
                      }
                    }
                    L7: {
                      var18 = var14;
                      var19 = var15;
                      if (param4 > 13) {
                        break L7;
                      } else {
                        var23 = (java.applet.Applet) null;
                        g.a((java.applet.Applet) null, 77);
                        break L7;
                      }
                    }
                    L8: {
                      if (var18 <= var19) {
                        break L8;
                      } else {
                        var19 = param1 * var8 / (var9 + var8) + param0;
                        var18 = param1 * var8 / (var9 + var8) + param0;
                        break L8;
                      }
                    }
                    L9: {
                      eh.b(fm.field_N);
                      if (param5[0] == null) {
                        break L9;
                      } else {
                        eh.f(param2, param0, var16, var18);
                        param5[0].f(param2, param0);
                        eh.a(fm.field_N);
                        break L9;
                      }
                    }
                    L10: {
                      if (param5[2] == null) {
                        break L10;
                      } else {
                        eh.f(var17, param0, var10, var18);
                        param5[2].f(var13, param0);
                        eh.a(fm.field_N);
                        break L10;
                      }
                    }
                    L11: {
                      if (param5[6] != null) {
                        eh.f(param2, var19, var16, var11);
                        param5[6].f(param2, var15);
                        eh.a(fm.field_N);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (param5[8] != null) {
                        eh.f(var17, var19, var10, var11);
                        param5[8].f(var13, var15);
                        eh.a(fm.field_N);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    L13: {
                      if (param5[1] == null) {
                        break L13;
                      } else {
                        if (0 != param5[1].field_x) {
                          eh.f(var16, param0, var17, var18);
                          var20 = var12;
                          L14: while (true) {
                            if (var13 <= var20) {
                              eh.a(fm.field_N);
                              break L13;
                            } else {
                              param5[1].f(var20, param0);
                              var20 = var20 + param5[1].field_x;
                              continue L14;
                            }
                          }
                        } else {
                          break L13;
                        }
                      }
                    }
                    L15: {
                      if (null == param5[7]) {
                        break L15;
                      } else {
                        if (param5[7].field_x != 0) {
                          eh.f(var16, var19, var17, var11);
                          var20 = var12;
                          L16: while (true) {
                            if (var20 >= var13) {
                              eh.a(fm.field_N);
                              break L15;
                            } else {
                              param5[7].f(var20, var15);
                              var20 = var20 + param5[7].field_x;
                              continue L16;
                            }
                          }
                        } else {
                          break L15;
                        }
                      }
                    }
                    L17: {
                      if (param5[3] == null) {
                        break L17;
                      } else {
                        if (param5[3].field_A == 0) {
                          break L17;
                        } else {
                          eh.f(param2, var18, var16, var19);
                          var20 = var14;
                          L18: while (true) {
                            if (var15 <= var20) {
                              eh.a(fm.field_N);
                              break L17;
                            } else {
                              param5[3].f(param2, var20);
                              var20 = var20 + param5[3].field_A;
                              continue L18;
                            }
                          }
                        }
                      }
                    }
                    L19: {
                      if (param5[5] == null) {
                        break L19;
                      } else {
                        if (param5[5].field_A != 0) {
                          eh.f(var17, var18, var10, var19);
                          var20 = var14;
                          L20: while (true) {
                            if (var20 >= var15) {
                              eh.a(fm.field_N);
                              break L19;
                            } else {
                              param5[5].f(var13, var20);
                              var20 = var20 + param5[5].field_A;
                              continue L20;
                            }
                          }
                        } else {
                          break L19;
                        }
                      }
                    }
                    L21: {
                      L22: {
                        if (null == param5[4]) {
                          break L22;
                        } else {
                          if (param5[4].field_x == 0) {
                            break L22;
                          } else {
                            if (param5[4].field_A != 0) {
                              eh.f(var16, var18, var17, var19);
                              var20 = var14;
                              L23: while (true) {
                                if (var20 >= var15) {
                                  eh.a(fm.field_N);
                                  break L22;
                                } else {
                                  var21 = var12;
                                  L24: while (true) {
                                    if (var13 <= var21) {
                                      var20 = var20 + param5[4].field_A;
                                      continue L23;
                                    } else {
                                      param5[4].f(var21, var20);
                                      var21 = var21 + param5[4].field_x;
                                      continue L24;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L21;
                            }
                          }
                        }
                      }
                      break L21;
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L25: {
            var6 = decompiledCaughtException;
            stackIn_75_0 = (RuntimeException) (var6);

            stackIn_75_1 = new StringBuilder().append("g.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_76_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "null";
              break L25;
            } else {
              stackIn_76_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "{...}";
              break L25;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_76_0), stackIn_76_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
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
        int stackIn_17_0 = 0;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        String stackIn_97_2 = null;
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
        sb var17 = null;
        byte[] var21 = null;
        var16 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              var17 = new sb(in.a(param1, param0 + -2));
              var4 = var17.d((byte) -54);
              if (-6 < (var4 ^ -1)) {
                break L1;
              } else {
                if (-8 > (var4 ^ -1)) {
                  break L1;
                } else {
                  L2: {
                    if (-7 >= (var4 ^ -1)) {
                      this.field_r = var17.b((byte) 91);
                      break L2;
                    } else {
                      this.field_r = 0;
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.d((byte) -54);
                    if (-1 == (var5 & 1 ^ -1)) {
                      stackIn_11_0 = 0;
                      break L3;
                    } else {
                      stackIn_11_0 = 1;
                      break L3;
                    }
                  }
                  L4: {
                    var6 = stackIn_11_0;
                    if (7 > var4) {
                      this.field_g = var17.e(param0 ^ -108);
                      break L4;
                    } else {
                      this.field_g = var17.a((byte) -120);
                      break L4;
                    }
                  }
                  L5: {
                    if (-1 == (var5 & param0 ^ -1)) {
                      stackIn_17_0 = 0;
                      break L5;
                    } else {
                      stackIn_17_0 = 1;
                      break L5;
                    }
                  }
                  L6: {
                    var7 = stackIn_17_0;
                    var8 = 0;
                    this.field_t = new int[this.field_g];
                    var9 = -1;
                    if (-8 >= (var4 ^ -1)) {
                      var10 = 0;
                      L7: while (true) {
                        if (this.field_g <= var10) {
                          break L6;
                        } else {
                          dupTemp$0 = var8 + var17.a((byte) -117);
                          var8 = dupTemp$0;
                          this.field_t[var10] = dupTemp$0;
                          if ((var9 ^ -1) > (this.field_t[var10] ^ -1)) {
                            var9 = this.field_t[var10];
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
                        if (var10 >= this.field_g) {
                          break L6;
                        } else {
                          dupTemp$1 = var8 + var17.e(-68);
                          var8 = dupTemp$1;
                          this.field_t[var10] = dupTemp$1;
                          if ((this.field_t[var10] ^ -1) < (var9 ^ -1)) {
                            var9 = this.field_t[var10];
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
                    this.field_c = 1 + var9;
                    this.field_f = new int[this.field_c];
                    if (var7 != 0) {
                      this.field_l = new byte[this.field_c][];
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    this.field_d = new int[this.field_c];
                    this.field_h = new int[this.field_c];
                    this.field_q = new int[this.field_c];
                    this.field_p = new int[this.field_c][];
                    if (var6 == 0) {
                      break L10;
                    } else {
                      this.field_m = new int[this.field_c];
                      var10 = 0;
                      L11: while (true) {
                        if (this.field_c <= var10) {
                          var10 = 0;
                          L12: while (true) {
                            if (var10 >= this.field_g) {
                              this.field_s = new da(this.field_m);
                              break L10;
                            } else {
                              this.field_m[this.field_t[var10]] = var17.b((byte) 119);
                              var10++;
                              continue L12;
                            }
                          }
                        } else {
                          this.field_m[var10] = -1;
                          var10++;
                          continue L11;
                        }
                      }
                    }
                  }
                  var10 = 0;
                  L13: while (true) {
                    if (this.field_g <= var10) {
                      L14: {
                        if (var7 != 0) {
                          var10 = 0;
                          L15: while (true) {
                            if (var10 >= this.field_g) {
                              var10 = 0;
                              L16: while (true) {
                                if (this.field_g <= var10) {
                                  break L14;
                                } else {
                                  this.field_q[this.field_t[var10]] = var17.b((byte) 84);
                                  var10++;
                                  continue L16;
                                }
                              }
                            } else {
                              var21 = new byte[64];
                              var17.a(var21, (byte) -120, 0, 64);
                              this.field_l[this.field_t[var10]] = var21;
                              var10++;
                              continue L15;
                            }
                          }
                        } else {
                          var10 = 0;
                          L17: while (true) {
                            if (this.field_g <= var10) {
                              break L14;
                            } else {
                              this.field_q[this.field_t[var10]] = var17.b((byte) 84);
                              var10++;
                              continue L17;
                            }
                          }
                        }
                      }
                      L18: {
                        if (var4 >= 7) {
                          var10 = 0;
                          L19: while (true) {
                            if (this.field_g <= var10) {
                              var10 = 0;
                              L20: while (true) {
                                if (var10 >= this.field_g) {
                                  break L18;
                                } else {
                                  var11 = this.field_t[var10];
                                  var8 = 0;
                                  var12 = this.field_d[var11];
                                  array$2 = new int[var12];
                                  this.field_p[var11] = array$2;
                                  var13 = -1;
                                  var14 = 0;
                                  L21: while (true) {
                                    if (var14 >= var12) {
                                      L22: {
                                        this.field_f[var11] = var13 - -1;
                                        if (var13 + 1 != var12) {
                                          break L22;
                                        } else {
                                          this.field_p[var11] = null;
                                          break L22;
                                        }
                                      }
                                      var10++;
                                      continue L20;
                                    } else {
                                      L23: {
                                        dupTemp$3 = var8 + var17.a((byte) -119);
                                        var8 = dupTemp$3;
                                        dupTemp$4 = this.field_p[var11];
                                        dupTemp$4[var14] = dupTemp$3;
                                        var15 = dupTemp$3;
                                        if ((var13 ^ -1) > (var15 ^ -1)) {
                                          var13 = var15;
                                          break L23;
                                        } else {
                                          break L23;
                                        }
                                      }
                                      var14++;
                                      continue L21;
                                    }
                                  }
                                }
                              }
                            } else {
                              this.field_d[this.field_t[var10]] = var17.a((byte) -124);
                              var10++;
                              continue L19;
                            }
                          }
                        } else {
                          var10 = 0;
                          L24: while (true) {
                            if (var10 >= this.field_g) {
                              var10 = 0;
                              L25: while (true) {
                                if (var10 >= this.field_g) {
                                  break L18;
                                } else {
                                  var11 = this.field_t[var10];
                                  var12 = this.field_d[var11];
                                  var8 = 0;
                                  var13 = -1;
                                  array$5 = new int[var12];
                                  this.field_p[var11] = array$5;
                                  var14 = 0;
                                  L26: while (true) {
                                    if (var14 >= var12) {
                                      L27: {
                                        this.field_f[var11] = var13 + 1;
                                        if (var12 != var13 - -1) {
                                          break L27;
                                        } else {
                                          this.field_p[var11] = null;
                                          break L27;
                                        }
                                      }
                                      var10++;
                                      continue L25;
                                    } else {
                                      dupTemp$6 = var8 + var17.e(eg.a(param0, -71));
                                      var8 = dupTemp$6;
                                      dupTemp$7 = this.field_p[var11];
                                      dupTemp$7[var14] = dupTemp$6;
                                      var15 = dupTemp$6;
                                      if ((var13 ^ -1) > (var15 ^ -1)) {
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
                              this.field_d[this.field_t[var10]] = var17.e(-10);
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
                          this.field_n = new da[var9 - -1];
                          this.field_i = new int[var9 - -1][];
                          var10 = 0;
                          L29: while (true) {
                            if (this.field_g <= var10) {
                              break L28;
                            } else {
                              var11 = this.field_t[var10];
                              var12 = this.field_d[var11];
                              array$8 = new int[this.field_f[var11]];
                              this.field_i[var11] = array$8;
                              var13 = 0;
                              L30: while (true) {
                                if (this.field_f[var11] <= var13) {
                                  var13 = 0;
                                  L31: while (true) {
                                    if (var13 >= var12) {
                                      this.field_n[var11] = new da(this.field_i[var11]);
                                      var10++;
                                      continue L29;
                                    } else {
                                      L32: {
                                        if (this.field_p[var11] == null) {
                                          var14 = var13;
                                          break L32;
                                        } else {
                                          var14 = this.field_p[var11][var13];
                                          break L32;
                                        }
                                      }
                                      this.field_i[var11][var14] = var17.b((byte) 100);
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
                        }
                      }
                      break L0;
                    } else {
                      this.field_h[this.field_t[var10]] = var17.b((byte) 49);
                      var10++;
                      continue L13;
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
            stackIn_96_0 = (RuntimeException) (var3);

            stackIn_96_1 = new StringBuilder().append("g.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_97_0 = (RuntimeException) ((Object) stackIn_96_0);
              stackIn_97_1 = (StringBuilder) ((Object) stackIn_96_1);
              stackIn_97_2 = "null";
              break L33;
            } else {
              stackIn_97_0 = (RuntimeException) ((Object) stackIn_96_0);
              stackIn_97_1 = (StringBuilder) ((Object) stackIn_96_1);
              stackIn_97_2 = "{...}";
              break L33;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_97_0), stackIn_97_2 + ')');
        }
    }

    public static void b(int param0) {
        field_e = null;
        field_j = null;
        if (param0 != 16704) {
            g.a(121);
        }
    }

    final static boolean a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        ea[] var3 = null;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (param0 == -36) {
                break L1;
              } else {
                var3 = (ea[]) null;
                g.a(25, -9, -119, -32, (byte) 41, (ea[]) null);
                break L1;
              }
            }
            var1_int = 0;
            L2: while (true) {
              if (-36 >= (var1_int ^ -1)) {
                stackIn_12_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  if (th.field_b[var1_int][cm.field_o]) {
                    if (!d.a(var1_int, cm.field_o, (byte) 68)) {
                      break L3;
                    } else {
                      stackIn_9_0 = 0;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
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
          throw lj.a((Throwable) ((Object) var1), "g.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    final static boolean a(char param0, byte param1) {
        java.applet.Applet var3;
        int stackIn_6_0 = 0;
        L0: {
          if (param1 == -68) {
            break L0;
          } else {
            var3 = (java.applet.Applet) null;
            g.a((java.applet.Applet) null, -49);
            break L0;
          }
        }
        L1: {
          L2: {
            if (param0 < 48) {
              break L2;
            } else {
              if (param0 > 57) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static boolean a(byte param0) {
        tn.field_M = true;
        if (param0 > -125) {
            return true;
        }
        j.field_f = 15000L + sf.a((byte) -19);
        return fh.field_b == 11 ? true : false;
    }

    g(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            this.field_b = gn.a(param0.length, param0, true);
            if (param1 != this.field_b) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (param2.length != 64) {
                    throw new RuntimeException();
                }
                this.field_a = wb.a(param0.length, 0, param0, 18738);
                for (var4_int = 0; -65 < (var4_int ^ -1); var4_int++) {
                    if (this.field_a[var4_int] != param2[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(2, param0);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "g.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = "Woolly jumper: Protects against cold water.";
    }
}
