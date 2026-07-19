/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ps {
    static int field_h;
    int[] field_j;
    private int[] field_n;
    static qo field_d;
    int[] field_k;
    int field_l;
    private byte[] field_c;
    int[] field_o;
    byte[][] field_i;
    static int[] field_e;
    int[][] field_q;
    nm field_b;
    private int[][] field_p;
    int[] field_g;
    nm[] field_r;
    int field_t;
    int field_m;
    static vd[][] field_f;
    private int field_s;
    int[] field_a;

    final static void a(String[] args, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              var2_int = 60 / ((param1 - 53) / 55);
              if (null == qk.field_e) {
                break L1;
              } else {
                qk.field_e.field_B.a(args, true);
                break L1;
              }
            }
            L2: {
              if (null != fd.field_f) {
                fd.field_f.field_t.a(args, true);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var2);
            stackOut_6_1 = new StringBuilder().append("ps.D(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (args == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0) {
        aq.field_b = null;
        if (!param0) {
            ps.b(111);
        }
        qn.field_d = null;
    }

    private final void a(byte[] param0, int param1) {
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
        rb var17 = null;
        byte[] var21 = null;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_98_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        String stackOut_96_2 = null;
        var16 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var17 = new rb(pn.a(param0, 0));
              var4 = var17.g(-112);
              if (var4 < 5) {
                break L1;
              } else {
                if (-8 <= (var4 ^ -1)) {
                  L2: {
                    if (param1 > 65) {
                      break L2;
                    } else {
                      ps.b(-65);
                      break L2;
                    }
                  }
                  L3: {
                    if (6 <= var4) {
                      this.field_m = var17.a((byte) 113);
                      break L3;
                    } else {
                      this.field_m = 0;
                      break L3;
                    }
                  }
                  L4: {
                    var5 = var17.g(73);
                    if ((var5 & 1) == 0) {
                      stackOut_12_0 = 0;
                      stackIn_13_0 = stackOut_12_0;
                      break L4;
                    } else {
                      stackOut_11_0 = 1;
                      stackIn_13_0 = stackOut_11_0;
                      break L4;
                    }
                  }
                  L5: {
                    var6 = stackIn_13_0;
                    if ((var4 ^ -1) <= -8) {
                      this.field_s = var17.c((byte) 127);
                      break L5;
                    } else {
                      this.field_s = var17.i((byte) 0);
                      break L5;
                    }
                  }
                  L6: {
                    if (-1 == (var5 & 2 ^ -1)) {
                      stackOut_18_0 = 0;
                      stackIn_19_0 = stackOut_18_0;
                      break L6;
                    } else {
                      stackOut_17_0 = 1;
                      stackIn_19_0 = stackOut_17_0;
                      break L6;
                    }
                  }
                  L7: {
                    var7 = stackIn_19_0;
                    var8 = 0;
                    var9 = -1;
                    this.field_o = new int[this.field_s];
                    if (7 <= var4) {
                      var10 = 0;
                      L8: while (true) {
                        if (this.field_s <= var10) {
                          break L7;
                        } else {
                          dupTemp$7 = var8 + var17.c((byte) 127);
                          var8 = dupTemp$7;
                          this.field_o[var10] = dupTemp$7;
                          if (this.field_o[var10] > var9) {
                            var9 = this.field_o[var10];
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
                        if (this.field_s <= var10) {
                          break L7;
                        } else {
                          L10: {
                            dupTemp$8 = var8 + var17.i((byte) 0);
                            var8 = dupTemp$8;
                            this.field_o[var10] = dupTemp$8;
                            if (this.field_o[var10] > var9) {
                              var9 = this.field_o[var10];
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
                    this.field_l = 1 + var9;
                    this.field_g = new int[this.field_l];
                    if (var7 == 0) {
                      break L11;
                    } else {
                      this.field_i = new byte[this.field_l][];
                      break L11;
                    }
                  }
                  L12: {
                    this.field_q = new int[this.field_l][];
                    this.field_k = new int[this.field_l];
                    this.field_a = new int[this.field_l];
                    this.field_j = new int[this.field_l];
                    if (var6 != 0) {
                      this.field_n = new int[this.field_l];
                      var10 = 0;
                      L13: while (true) {
                        if (var10 >= this.field_l) {
                          var10 = 0;
                          L14: while (true) {
                            if (var10 >= this.field_s) {
                              this.field_b = new nm(this.field_n);
                              break L12;
                            } else {
                              this.field_n[this.field_o[var10]] = var17.a((byte) 124);
                              var10++;
                              continue L14;
                            }
                          }
                        } else {
                          this.field_n[var10] = -1;
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
                    if (this.field_s <= var10) {
                      L16: {
                        if (var7 == 0) {
                          break L16;
                        } else {
                          var10 = 0;
                          L17: while (true) {
                            if (var10 >= this.field_s) {
                              break L16;
                            } else {
                              var21 = new byte[64];
                              var17.a(0, 7186, 64, var21);
                              this.field_i[this.field_o[var10]] = var21;
                              var10++;
                              continue L17;
                            }
                          }
                        }
                      }
                      var10 = 0;
                      L18: while (true) {
                        if (this.field_s <= var10) {
                          L19: {
                            if (-8 < (var4 ^ -1)) {
                              var10 = 0;
                              L20: while (true) {
                                if (this.field_s <= var10) {
                                  var10 = 0;
                                  L21: while (true) {
                                    if (this.field_s <= var10) {
                                      break L19;
                                    } else {
                                      var11 = this.field_o[var10];
                                      var12 = this.field_k[var11];
                                      var8 = 0;
                                      array$9 = new int[var12];
                                      this.field_q[var11] = array$9;
                                      var13 = -1;
                                      var14 = 0;
                                      L22: while (true) {
                                        if (var14 >= var12) {
                                          L23: {
                                            this.field_j[var11] = var13 + 1;
                                            if (var12 == var13 + 1) {
                                              this.field_q[var11] = null;
                                              break L23;
                                            } else {
                                              break L23;
                                            }
                                          }
                                          var10++;
                                          continue L21;
                                        } else {
                                          L24: {
                                            dupTemp$10 = var8 + var17.i((byte) 0);
                                            var8 = dupTemp$10;
                                            this.field_q[var11][var14] = dupTemp$10;
                                            var15 = dupTemp$10;
                                            if (var15 > var13) {
                                              var13 = var15;
                                              break L24;
                                            } else {
                                              break L24;
                                            }
                                          }
                                          var14++;
                                          continue L22;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  this.field_k[this.field_o[var10]] = var17.i((byte) 0);
                                  var10++;
                                  continue L20;
                                }
                              }
                            } else {
                              var10 = 0;
                              L25: while (true) {
                                if (var10 >= this.field_s) {
                                  var10 = 0;
                                  L26: while (true) {
                                    if (var10 >= this.field_s) {
                                      break L19;
                                    } else {
                                      var11 = this.field_o[var10];
                                      var12 = this.field_k[var11];
                                      var8 = 0;
                                      array$11 = new int[var12];
                                      this.field_q[var11] = array$11;
                                      var13 = -1;
                                      var14 = 0;
                                      L27: while (true) {
                                        if (var14 >= var12) {
                                          L28: {
                                            this.field_j[var11] = var13 - -1;
                                            if (var12 != var13 - -1) {
                                              break L28;
                                            } else {
                                              this.field_q[var11] = null;
                                              break L28;
                                            }
                                          }
                                          var10++;
                                          continue L26;
                                        } else {
                                          dupTemp$12 = var8 + var17.c((byte) 124);
                                          var8 = dupTemp$12;
                                          this.field_q[var11][var14] = dupTemp$12;
                                          var15 = dupTemp$12;
                                          if (var13 < var15) {
                                            var13 = var15;
                                            var14++;
                                            continue L27;
                                          } else {
                                            var14++;
                                            continue L27;
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  this.field_k[this.field_o[var10]] = var17.c((byte) 126);
                                  var10++;
                                  continue L25;
                                }
                              }
                            }
                          }
                          L29: {
                            if (var6 == 0) {
                              break L29;
                            } else {
                              this.field_p = new int[var9 - -1][];
                              this.field_r = new nm[1 + var9];
                              var10 = 0;
                              L30: while (true) {
                                if (this.field_s <= var10) {
                                  break L29;
                                } else {
                                  var11 = this.field_o[var10];
                                  var12 = this.field_k[var11];
                                  array$13 = new int[this.field_j[var11]];
                                  this.field_p[var11] = array$13;
                                  var13 = 0;
                                  L31: while (true) {
                                    if (var13 >= this.field_j[var11]) {
                                      var13 = 0;
                                      L32: while (true) {
                                        if (var13 >= var12) {
                                          this.field_r[var11] = new nm(this.field_p[var11]);
                                          var10++;
                                          continue L30;
                                        } else {
                                          L33: {
                                            if (null != this.field_q[var11]) {
                                              var14 = this.field_q[var11][var13];
                                              break L33;
                                            } else {
                                              var14 = var13;
                                              break L33;
                                            }
                                          }
                                          this.field_p[var11][var14] = var17.a((byte) 110);
                                          var13++;
                                          continue L32;
                                        }
                                      }
                                    } else {
                                      this.field_p[var11][var13] = -1;
                                      var13++;
                                      continue L31;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          break L0;
                        } else {
                          this.field_a[this.field_o[var10]] = var17.a((byte) 113);
                          var10++;
                          continue L18;
                        }
                      }
                    } else {
                      this.field_g[this.field_o[var10]] = var17.a((byte) 125);
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
          L34: {
            var3 = decompiledCaughtException;
            stackOut_95_0 = (RuntimeException) (var3);
            stackOut_95_1 = new StringBuilder().append("ps.E(");
            stackIn_97_0 = stackOut_95_0;
            stackIn_97_1 = stackOut_95_1;
            stackIn_96_0 = stackOut_95_0;
            stackIn_96_1 = stackOut_95_1;
            if (param0 == null) {
              stackOut_97_0 = (RuntimeException) ((Object) stackIn_97_0);
              stackOut_97_1 = (StringBuilder) ((Object) stackIn_97_1);
              stackOut_97_2 = "null";
              stackIn_98_0 = stackOut_97_0;
              stackIn_98_1 = stackOut_97_1;
              stackIn_98_2 = stackOut_97_2;
              break L34;
            } else {
              stackOut_96_0 = (RuntimeException) ((Object) stackIn_96_0);
              stackOut_96_1 = (StringBuilder) ((Object) stackIn_96_1);
              stackOut_96_2 = "{...}";
              stackIn_98_0 = stackOut_96_0;
              stackIn_98_1 = stackOut_96_1;
              stackIn_98_2 = stackOut_96_2;
              break L34;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_98_0), stackIn_98_2 + ',' + param1 + ')');
        }
    }

    final static void b(int param0) {
        oi.a(param0, 20665);
    }

    final static void a(int param0, boolean param1, java.awt.Canvas param2, int param3) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            try {
              L1: {
                var4 = param2.getGraphics();
                cl.field_fb.a(118, var4, param3, param0);
                if (!param1) {
                  var4.dispose();
                  decompiledRegionSelector0 = 1;
                  break L1;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var4_ref = (Exception) (Object) decompiledCaughtException;
                param2.repaint();
                decompiledRegionSelector0 = 1;
                break L2;
              }
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
          L3: {
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var4_ref2);
            stackOut_6_1 = new StringBuilder().append("ps.C(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_e = null;
        if (param0 != 0) {
            field_d = (qo) null;
        }
        field_f = (vd[][]) null;
    }

    ps(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            this.field_t = lj.a(-124, param0, param0.length);
            if (param1 != this.field_t) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if ((param2.length ^ -1) != -65) {
                    throw new RuntimeException();
                }
                this.field_c = qm.a(0, param0.length, param0, 0);
                for (var4_int = 0; -65 < (var4_int ^ -1); var4_int++) {
                    if (this.field_c[var4_int] != param2[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(param0, 100);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "ps.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new int[128];
        field_d = new qo();
    }
}
