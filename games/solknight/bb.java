/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb extends ki implements pi, ka {
    private boolean field_H;
    static fg field_I;
    private vg field_L;
    private vg field_O;
    private boolean field_E;
    private pj field_N;
    private String field_K;
    static int[] field_P;
    private pj field_M;
    private pj field_D;
    static int field_G;
    private boolean field_J;

    public final void a(vg param0, boolean param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                this.field_K = (String) null;
                break L1;
              }
            }
            L2: {
              if (this.field_O == param0) {
                this.field_L.a(-1463, (rc) (this));
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param0 != this.field_L) {
                break L3;
              } else {
                this.k(-1525);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("bb.NA(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    final static String a(String param0, String[] param1, int param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int stackIn_5_0 = 0;
        boolean stackIn_9_0 = false;
        int stackIn_20_0 = 0;
        boolean stackIn_27_0 = false;
        String stackIn_39_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        StringBuilder stackIn_45_1 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_8_0;
        boolean stackOut_26_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        String var7_ref_String = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == -63) {
                break L1;
              } else {
                bb.h(86);
                break L1;
              }
            }
            var3_int = param0.length();
            var4 = var3_int;
            var5 = 0;
            L2: while (true) {
              var6_int = param0.indexOf("<%", var5);
              stackIn_5_0 = -1;
              L3: while (true) {
                L4: {
                  if (stackIn_5_0 < (var6_int ^ -1)) {
                    break L4;
                  } else {
                    var5 = var6_int - -2;
                    L5: while (true) {
                      L6: {
                        if (var3_int <= var5) {
                          break L6;
                        } else {
                          stackOut_8_0 = gh.a(param0.charAt(var5), (byte) -124);
                          stackIn_5_0 = stackOut_8_0 ? 1 : 0;
                          stackIn_9_0 = stackOut_8_0;
                          if (var11 != 0) {
                            continue L3;
                          } else {
                            if (!stackIn_9_0) {
                              break L6;
                            } else {
                              var5++;
                              if (var11 == 0) {
                                continue L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                      }
                      var7_ref_String = param0.substring(var6_int - -2, var5);
                      if (!ec.a(30418, (CharSequence) ((Object) var7_ref_String))) {
                        continue L2;
                      } else {
                        L7: {
                          if (var5 >= var3_int) {
                            break L7;
                          } else {
                            if (param0.charAt(var5) == 62) {
                              var5++;
                              var8 = il.a((CharSequence) ((Object) var7_ref_String), param2 ^ -6041);
                              var4 = var4 + (-var5 + var6_int + param1[var8].length());
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                        }
                        if (var11 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                var6 = new StringBuilder(var4);
                var5 = 0;
                var7 = 0;
                L8: while (true) {
                  var8 = param0.indexOf("<%", var5);
                  stackIn_20_0 = var8;
                  L9: while (true) {
                    L10: {
                      L11: {
                        L12: {
                          if (stackIn_20_0 >= 0) {
                            break L12;
                          } else {
                            if (var11 != 0) {
                              break L11;
                            } else {
                              if (var11 == 0) {
                                break L10;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                        var5 = var8 - -2;
                        break L11;
                      }
                      L13: while (true) {
                        L14: {
                          if (var3_int <= var5) {
                            break L14;
                          } else {
                            stackOut_26_0 = gh.a(param0.charAt(var5), (byte) -124);
                            stackIn_20_0 = stackOut_26_0 ? 1 : 0;
                            stackIn_27_0 = stackOut_26_0;
                            if (var11 != 0) {
                              continue L9;
                            } else {
                              if (!stackIn_27_0) {
                                break L14;
                              } else {
                                var5++;
                                if (var11 == 0) {
                                  continue L13;
                                } else {
                                  break L14;
                                }
                              }
                            }
                          }
                        }
                        L15: {
                          var9 = param0.substring(2 + var8, var5);
                          if (ec.a(30418, (CharSequence) ((Object) var9))) {
                            break L15;
                          } else {
                            if (var11 == 0) {
                              continue L8;
                            } else {
                              break L15;
                            }
                          }
                        }
                        L16: {
                          if (var5 >= var3_int) {
                            break L16;
                          } else {
                            if (param0.charAt(var5) == 62) {
                              var5++;
                              var10 = il.a((CharSequence) ((Object) var9), 6054);
                              discarded$0 = var6.append(param0.substring(var7, var8));
                              var7 = var5;
                              discarded$1 = var6.append(param1[var10]);
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                        }
                        if (var11 == 0) {
                          continue L8;
                        } else {
                          break L10;
                        }
                      }
                    }
                    discarded$2 = var6.append(param0.substring(var7));
                    stackIn_39_0 = var6.toString();
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var3 = decompiledCaughtException;
            stackIn_42_0 = (RuntimeException) (var3);

            stackIn_42_1 = new StringBuilder().append("bb.K(");

            if (param0 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L17;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L17;
            }
          }
          L18: {


            stackIn_45_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(',');

            if (param1 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L18;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
              break L18;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_43_0), stackIn_46_2 + ',' + param2 + ')');
        }
        return stackIn_39_0;
    }

    bb(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (j) null);
        ke dupTemp$0 = null;
        ke dupTemp$1 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_18_0 = null;
        pj stackIn_18_1 = null;
        pj stackIn_18_2 = null;
        Object stackIn_19_0 = null;
        pj stackIn_19_1 = null;
        pj stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        gh var6 = null;
        RuntimeException var6_ref = null;
        mg var7 = null;
        String var8 = null;
        fg var9 = null;
        int var11 = 0;
        ke var12 = null;
        ke var13 = null;
        var11 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              stackIn_3_0 = this;

              if (!param2) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((bb) (this)).field_E = stackIn_4_1 != 0;
              stackIn_6_0 = this;

              if (!param4) {
                stackIn_7_0 = this;
                stackIn_7_1 = 0;
                break L2;
              } else {
                stackIn_7_0 = this;
                stackIn_7_1 = 1;
                break L2;
              }
            }
            L3: {
              ((bb) (this)).field_H = stackIn_7_1 != 0;
              stackIn_9_0 = this;

              if (!param3) {
                stackIn_10_0 = this;
                stackIn_10_1 = 0;
                break L3;
              } else {
                stackIn_10_0 = this;
                stackIn_10_1 = 1;
                break L3;
              }
            }
            L4: {
              ((bb) (this)).field_J = stackIn_10_1 != 0;
              this.field_K = param1;
              if (!this.field_E) {
                break L4;
              } else {
                L5: {
                  if (this.field_J) {
                    break L5;
                  } else {
                    if (!this.field_H) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                throw new IllegalStateException();
              }
            }
            L6: {
              L7: {
                this.field_O = (vg) ((Object) new qb(param0, (dg) (this), 100));
                this.field_L = (vg) ((Object) new qb("", (dg) (this), 20));
                if (!this.field_E) {
                  break L7;
                } else {
                  this.field_N = new pj(gg.field_c, (dg) null);
                  this.field_D = new pj(ph.field_e, (dg) null);
                  this.field_O.field_B = false;
                  if (var11 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              L8: {
                this.field_N = new pj(ga.field_H, (dg) null);
                stackIn_18_0 = this;

                stackIn_18_1 = null;

                stackIn_18_2 = null;

                if (this.field_H) {
                  stackIn_19_0 = this;
                  stackIn_19_1 = null;
                  stackIn_19_2 = null;
                  stackIn_19_3 = pf.field_c;
                  break L8;
                } else {
                  stackIn_19_0 = this;
                  stackIn_19_1 = null;
                  stackIn_19_2 = null;
                  stackIn_19_3 = u.field_e;
                  break L8;
                }
              }
              ((bb) (this)).field_D = new pj(stackIn_19_3, (dg) null);
              if (!this.field_J) {
                break L6;
              } else {
                this.field_M = new pj(wk.field_g, (dg) (this));
                break L6;
              }
            }
            L9: {
              this.field_O.field_w = (j) ((Object) new uf(10000536));
              this.field_L.field_w = (j) ((Object) new bg(10000536));
              var6 = new gh();
              this.field_N.field_w = (j) ((Object) var6);
              if (null == this.field_D) {
                break L9;
              } else {
                this.field_D.field_w = (j) ((Object) var6);
                break L9;
              }
            }
            L10: {
              this.field_O.field_z = oc.field_e;
              if (this.field_M == null) {
                break L10;
              } else {
                this.field_M.field_w = (j) ((Object) var6);
                break L10;
              }
            }
            L11: {
              if (this.field_M == null) {
                break L11;
              } else {
                this.field_M.field_z = id.field_b;
                break L11;
              }
            }
            L12: {
              L13: {
                if (this.field_E) {
                  break L13;
                } else {
                  L14: {
                    if (!this.field_H) {
                      break L14;
                    } else {
                      this.field_D.field_z = a.field_g;
                      this.field_D.field_w = (j) ((Object) new ri());
                      if (var11 == 0) {
                        break L12;
                      } else {
                        break L14;
                      }
                    }
                  }
                  this.field_D.field_w = (j) ((Object) new ri());
                  if (var11 == 0) {
                    break L12;
                  } else {
                    break L13;
                  }
                }
              }
              this.field_D.field_z = hb.field_j;
              break L12;
            }
            L15: {
              this.field_j = 15;
              var7 = ua.field_G;
              if (this.field_K == null) {
                break L15;
              } else {
                this.field_j = this.field_j + (var7.b(this.field_K, -40 + this.field_t, var7.field_F) + 5);
                break L15;
              }
            }
            L16: {
              L17: {
                var8 = hh.field_J;
                var9 = lf.a((byte) 120, ia.g(116));
                if (sk.field_p == var9) {
                  break L17;
                } else {
                  if (field_I != var9) {
                    break L16;
                  } else {
                    var8 = kf.field_H;
                    if (var11 == 0) {
                      break L16;
                    } else {
                      break L17;
                    }
                  }
                }
              }
              var8 = rc.field_y;
              break L16;
            }
            L18: {
              dupTemp$0 = new ke(10, this.field_j, this.field_t - 20, 25, this.field_O, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$0;
              this.a(dupTemp$0, 5411);
              this.field_j = this.field_j + (((rc) ((Object) var12)).field_x + 5);
              dupTemp$1 = new ke(10, this.field_j, this.field_t + -20, 25, this.field_L, false, 80, 3, var7, 16777215, ld.field_O);
              var13 = dupTemp$1;
              this.a(dupTemp$1, 5411);
              this.field_N.field_n = (dg) (this);
              this.field_j = this.field_j + (5 + ((rc) ((Object) var13)).field_x);
              if (this.field_M == null) {
                break L18;
              } else {
                this.field_M.field_n = (dg) (this);
                break L18;
              }
            }
            L19: {
              if (null == this.field_D) {
                break L19;
              } else {
                this.field_D.field_n = (dg) (this);
                break L19;
              }
            }
            L20: {
              L21: {
                if (this.field_M != null) {
                  break L21;
                } else {
                  this.field_N.b(30, this.field_t - 6 - 10, 8, 0, this.field_j);
                  this.field_j = this.field_j + 35;
                  if (var11 == 0) {
                    break L20;
                  } else {
                    break L21;
                  }
                }
              }
              this.field_N.b(30, -95 + this.field_t, 85, 0, this.field_j);
              this.field_j = this.field_j + 60;
              break L20;
            }
            L22: {
              if (null == this.field_M) {
                break L22;
              } else {
                this.field_M.b(30, -10 + this.field_t - 6, 8, 0, this.field_j);
                this.field_j = this.field_j + 35;
                break L22;
              }
            }
            L23: {
              if (this.field_D == null) {
                break L23;
              } else {
                L24: {
                  if (this.field_E) {
                    break L24;
                  } else {
                    if (this.field_H) {
                      break L24;
                    } else {
                      this.field_D.b(20, 40, 8, 0, this.field_j);
                      this.field_j = this.field_j + 25;
                      if (var11 == 0) {
                        break L23;
                      } else {
                        break L24;
                      }
                    }
                  }
                }
                this.field_D.b(30, -10 + (-6 + this.field_t), 8, 0, this.field_j);
                this.field_j = this.field_j + 35;
                break L23;
              }
            }
            L25: {
              this.b(3 + this.field_j, this.field_t, 0, 0, 0);
              this.a(this.field_N, 5411);
              if (this.field_M == null) {
                break L25;
              } else {
                this.a(this.field_M, 5411);
                break L25;
              }
            }
            L26: {
              if (null == this.field_D) {
                break L26;
              } else {
                this.a(this.field_D, 5411);
                break L26;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            var6_ref = decompiledCaughtException;
            stackIn_59_0 = (RuntimeException) (var6_ref);

            stackIn_59_1 = new StringBuilder().append("bb.<init>(");

            if (param0 == null) {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_60_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackIn_60_2 = "null";
              break L27;
            } else {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_60_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackIn_60_2 = "{...}";
              break L27;
            }
          }
          L28: {


            stackIn_62_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_60_2).append(',');

            if (param1 == null) {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "null";
              break L28;
            } else {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "{...}";
              break L28;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_60_0), stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(byte param0, int param1, int param2) {
        h.field_g = param1;
        me.field_b = param2;
        je.field_d = 1;
        if (param0 != -14) {
            bb.a((byte) -52);
        }
    }

    public final void a(int param0, int param1, int param2, pj param3, boolean param4) {
        int var7 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4) {
                break L1;
              } else {
                this.field_J = true;
                break L1;
              }
            }
            L2: {
              if (param3 != this.field_N) {
                L3: {
                  if (param3 != this.field_M) {
                    break L3;
                  } else {
                    wf.d(350);
                    if (var7 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (param3 == this.field_D) {
                  L4: {
                    if (!this.field_E) {
                      break L4;
                    } else {
                      rf.h(15);
                      if (var7 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (this.field_H) {
                      break L5;
                    } else {
                      qd.a((byte) -13);
                      if (var7 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  ig.a((byte) -82);
                  if (var7 == 0) {
                    break L2;
                  } else {
                    this.k(-1525);
                    break L2;
                  }
                } else {
                  break L2;
                }
              } else {
                this.k(-1525);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var6);

            stackIn_22_1 = new StringBuilder().append("bb.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param4 + ')');
        }
    }

    final boolean a(char param0, byte param1, int param2, rc param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = 34 % ((param1 - 31) / 56);
            if (super.a(param0, (byte) -36, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (98 == param2) {
                stackIn_7_0 = this.a((byte) -114, param3);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if ((param2 ^ -1) != -100) {
                  stackIn_12_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_10_0 = this.b(90, param3);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("bb.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L1;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L1;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_12_0 != 0;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!(null == this.field_K)) {
            ua.field_G.a(this.field_K, this.field_m + (param2 + 20), 15 + (this.field_j + param0), -40 + this.field_t, this.field_x, 16777215, -1, 1, 0, ua.field_G.field_F);
        }
        if (null != this.field_M) {
            mi.b(10 + param2, param0 - -134, this.field_t - 20, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    final void a(int param0, String param1) {
        vg var3 = null;
        String var4 = null;
        try {
            var3 = this.field_O;
            var4 = param1;
            if (param0 != 25) {
                this.field_L = (vg) null;
            }
            var3.a(param0 ^ -110, false, var4);
            this.field_L.l(param0 ^ -125);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "bb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_P = null;
        if (param0 < 92) {
            return;
        }
        field_I = null;
    }

    public final void a(vg param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -79) {
                break L1;
              } else {
                this.field_E = false;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("bb.N(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final String j(int param0) {
        if (param0 != -19569) {
            return (String) null;
        }
        if (this.field_O.field_i == null) {
            return "";
        }
        return this.field_O.field_i;
    }

    private final void k(int param0) {
        L0: {
          L1: {
            if (ji.a(-19688)) {
              break L1;
            } else {
              if (0 >= this.field_O.field_i.length()) {
                break L0;
              } else {
                if ((this.field_L.field_i.length() ^ -1) >= -1) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          hg.a(8192, this.field_O.field_i, this.field_L.field_i);
          break L0;
        }
        L2: {
          if (param0 == -1525) {
            break L2;
          } else {
            this.field_J = true;
            break L2;
          }
        }
    }

    final static boolean h(int param0) {
        int var1;
        int stackIn_4_0 = 0;
        L0: {
          L1: {
            var1 = 34 % ((param0 - -11) / 48);
            if (10 > fj.field_i) {
              break L1;
            } else {
              if (-14 < (kj.field_R ^ -1)) {
                break L1;
              } else {
                stackIn_4_0 = 1;
                break L0;
              }
            }
          }
          stackIn_4_0 = 0;
          break L0;
        }
        return stackIn_4_0 != 0;
    }

    final void i(int param0) {
        this.field_O.l(-115);
        this.field_L.l(-87);
        if (param0 < 5) {
            this.j(-11);
        }
    }

    static {
        field_I = new fg("usename");
        field_P = new int[10];
    }
}
